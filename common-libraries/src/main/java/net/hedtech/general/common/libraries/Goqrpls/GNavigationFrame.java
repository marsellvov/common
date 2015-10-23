package net.hedtech.general.common.libraries.Goqrpls;

import java.util.*;

import org.jdesktop.databuffer.DataRow.DataRowStatus;

import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.*;
import morphis.foundations.core.appsupportlib.exceptions.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appsupportlib.util.*;
import morphis.foundations.core.appsupportlib.runtime.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.BlockDescriptor;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.items.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.items.TreeDescriptor.TreeCacheStatus;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.lovs.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.containers.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.alerts.*;
import morphis.foundations.core.appsupportlib.runtime.menus.MenuDefinition;
import morphis.foundations.core.appsupportlib.runtime.menus.MenuEntry;
import morphis.foundations.core.appsupportlib.runtime.menus.Parameter;
import morphis.foundations.core.appsupportlib.runtime.web.message.MenuDescriptor;
import morphis.foundations.core.appsupportlib.runtime.web.message.MessageRequestHelper;
import morphis.foundations.core.appsupportlib.runtime.web.message.OutputMessage.OutputMessageUserResponse;
import static morphis.foundations.core.appsupportlib.runtime.TaskServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ItemServices.*;
import static morphis.foundations.core.appsupportlib.runtime.BlockServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ViewServices.*;
import static morphis.foundations.core.appsupportlib.runtime.MessageServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ValueSetServices.*;
import static morphis.foundations.core.appsupportlib.runtime.LovServices.*;
import static morphis.foundations.core.appsupportlib.Math.*;
import static morphis.foundations.core.appsupportlib.Lib.*;
import static morphis.foundations.core.appsupportlib.Globals.*;
import static morphis.foundations.core.types.Types.*;
import morphis.foundations.core.util.*;
import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.forms.BaseTask;
import net.hedtech.general.common.libraries.Eoqrpls.*;

public class GNavigationFrame extends AbstractSupportCodeObject {
	

	public GNavigationFrame(ISupportCodeContainer container) {
		super(container);
		try
		{
			// 
			if ( (optmId == null) )
			{
				optmId = createGroup(RG_OPTM);
				rcIdD = addGroupColumn(optmId, "GUROPTM_SORT_SEQ", ValueSetColumn.NUMBER_COL);
				rcIdD = addGroupColumn(optmId, "GUROPTM_TYPE_IND", ValueSetColumn.CHAR_COL, 1);
				rcIdD = addGroupColumn(optmId, "GUROPTM_FORM_NAME", ValueSetColumn.CHAR_COL, 30);
				rcIdD = addGroupColumn(optmId, "GUROPTM_NAME1", ValueSetColumn.CHAR_COL, 30);
				rcIdD = addGroupColumn(optmId, "GUROPTM_NAME2", ValueSetColumn.CHAR_COL, 61);
				rcIdD = addGroupColumn(optmId, "GUROPTM_CAPACITY", ValueSetColumn.CHAR_COL, 1);
				rcIdD = addGroupColumn(optmId, "GUROPTM_TRG_NAME", ValueSetColumn.CHAR_COL, 30);
				rcIdD = addGroupColumn(optmId, "GUROPTM_TRG_TYPE", ValueSetColumn.CHAR_COL, 1);
				rcIdD = addGroupColumn(optmId, "GUROPTM_BLOCK_VALID", ValueSetColumn.CHAR_COL, 30);
				rcIdD = addGroupColumn(optmId, "GUROPTM_TAB_SEC_FORM", ValueSetColumn.CHAR_COL, 30);
				rcIdD = addGroupColumn(optmId, "GUROPTM_TAB_SEC_TAB", ValueSetColumn.CHAR_COL, 30);
				rcIdD = addGroupColumn(optmId, "GUROPTM_NAME1_DESC", ValueSetColumn.CHAR_COL, 93);
				rcIdP = addGroupColumn(optmId, "GUROPTM_REC_POS", ValueSetColumn.NUMBER_COL, 5);
				rcIdS = addGroupColumn(optmId, "GUROPTM_STATE", ValueSetColumn.CHAR_COL, 1);
				// 
				//  Populate record group
				// 
				//  50-23  add code to handle different settings of Form Name display on GUAUPRF form
				//         N=None option 
				// 
				// sq This needs to be redone in a db package
				sqlStmt = toStr("SELECT GUROPTM_SORT_SEQ, GUROPTM_TYPE_IND, GUROPTM_FORM_NAME,").append("GUROPTM_NAME1, GUROPTM_NAME2, GUROPTM_CAPACITY,").append("GUROPTM_TRG_NAME, GUROPTM_TRG_TYPE, GUROPTM_BLOCK_VALID, GUROPTM_TAB_SEC_FORM, GUROPTM_TAB_SEC_TAB,");
				// 
				//  50-23 Display Form Mnemonic options M=Menu Bar Options only
				// 
				if ( getNameIn("GLOBAL.FORMNAME_DISPLAY_IND").equals("N") )
				{
					sqlStmt = sqlStmt.append("GUROPTM_NAME1_DESC, NULL,").append("'E'");
				}
				else {
					sqlStmt = sqlStmt.append("GUROPTM_NAME1_DESC \n      || DECODE(GUROPTM_FORM_TO_BE_CALLED,NULL,NULL,' [' || GUROPTM_FORM_TO_BE_CALLED \n      || ']'),").append("NULL,").append("'E'");
				}
				// 
				sqlStmt = sqlStmt.append(" FROM GUROPTM WHERE GUROPTM_FORM_NAME = ").append("'").append(getCurrentTaskName()).append("'").append(" AND GUROPTM_TYPE_IND <> ").append("'I'").append(" ORDER BY GUROPTM_SORT_SEQ");
				// 
				ind = toInt(populateGroupWithQuery(RG_OPTM, sqlStmt));
				maxrow = toInt(getGroupRowCount(RG_OPTM));
			}
		}
		catch(Exception  e)
		{
		}
	}
	
	@Override
	public GoqrplsServices getContainer() {
		return (GoqrplsServices)super.getContainer();
		
	}
	//Original PL/SQL code for Package Prog Unit (SPEC) G$_NAVIGATION_FRAME
	/*
	PACKAGE G$_NAVIGATION_FRAME IS
  MESSAGE_WAS_DISPLAYED VARCHAR2(1) := 'N';
--
  PROCEDURE POPULATE_GUROPTM;
  PROCEDURE EXECUTE_MENU   (OPTION_LABEL IN VARCHAR2);
--
  FUNCTION  GET_DESCRIPTION(CALL_OBJECT IN VARCHAR2,
                            OBJECT_TYPE IN VARCHAR2) RETURN VARCHAR2; 
  PROCEDURE SET_DESCRIPTION(CALL_OBJECT IN VARCHAR2,
                            OBJECT_TYPE IN VARCHAR2,
                            NEW_DESC    IN VARCHAR2);
--
  PROCEDURE ENABLE_OPTION  (CALL_OBJECT IN VARCHAR2,
                            OBJECT_TYPE IN VARCHAR2);
  PROCEDURE DISABLE_OPTION (CALL_OBJECT IN VARCHAR2,
                            OBJECT_TYPE IN VARCHAR2);
  FUNCTION  OPTIONS_EXIST  (OBJECT_IN   IN VARCHAR2) RETURN BOOLEAN;
  PROCEDURE RESET_MENU_AFTER_FORM_CALL;
END;
	*/
	
			public NString messageWasDisplayed = toStr("N");

			
		//Original PL/SQL code for Package Prog Unit (BODY) G$_NAVIGATION_FRAME
		/*
		PACKAGE BODY G$_NAVIGATION_FRAME IS
--
  char_optm_num     VARCHAR2(2);
  item_name         VARCHAR2(93);       -- Temporary name of option
  menu_item_name    VARCHAR2(93);       -- Temporary name of Menu Bar option
  menu_work_name    VARCHAR2(93);       -- Work area for Menu Bar option name
  pop_item_name     VARCHAR2(100);
  sql_stmt          VARCHAR2(2000);     -- Select statment to populate G$_GUROPTM_RG
--
  OPTM_STR CONSTANT VARCHAR2(17) := 'OPTIONS.SUB_MENU_';
  POPM_STR CONSTANT VARCHAR2(23) := 'G$_DEFAULT_PM.SUB_MENU_';
  QTY_MREC CONSTANT PLS_INTEGER  := 24; -- Qty records in Option menu
  RG_OPTM  CONSTANT VARCHAR2(13) := 'G$_GUROPTM_RG';
--
  optm_id           RECORDGROUP  := FIND_GROUP(RG_OPTM);
  rc_id_d           GROUPCOLUMN;        -- Id GUROPTM_NAME1_DESC column
  rc_id_s           GROUPCOLUMN;        -- Id GUROPTM_STATE column
  rc_id_p           GROUPCOLUMN;        -- Id GUROPTM_REC_POS column
--
  ind               PLS_INTEGER;
  maxrow            PLS_INTEGER := 0;   -- Qty records in G$_GUROPTM_RG
  optm_cnt          PLS_INTEGER := 0;   -- Qty selected records 
  optm_num          PLS_INTEGER;
  qty_ditm          PLS_INTEGER := 24;  -- Qty fields on the canvas
  rec_pos           PLS_INTEGER;
  rtn_rec_num       PLS_INTEGER;
--
--
  PROCEDURE DEFINE_OPTION(do_scroll IN BOOLEAN);
-- 50-4 Added following procedure for Menu Bar Options
  PROCEDURE DEFINE_MENU_OPTION;
  PROCEDURE EXECUTE_GUROPTM(rg_rec_num IN NUMBER);
  PROCEDURE REBUILD_VARIABLES;
  FUNCTION  FIND_OPTION (call_object IN VARCHAR2 ,
                         object_type IN VARCHAR2) RETURN NUMBER;
  FUNCTION  OPTION_NAME (itm_num IN NUMBER) RETURN VARCHAR2;
  FUNCTION  CREATE_OPT_SELECTION (form_call IN BOOLEAN) RETURN BOOLEAN;
-- 50-4 Added following function for Menu Bar Options
  FUNCTION  MENU_OPTION_NAME (mnu_itm_num IN NUMBER) RETURN VARCHAR2;
--
--
  FUNCTION GET_DESCRIPTION(call_object IN VARCHAR2,
                           object_type IN VARCHAR2) RETURN VARCHAR2 IS
  BEGIN
    optm_num := FIND_OPTION(call_object,object_type);
    IF optm_num > 0 THEN
      RETURN(GET_GROUP_CHAR_CELL(rc_id_d,rtn_rec_num));
    END IF;
    RETURN(NULL); 
  END;
--
--
  PROCEDURE SET_DESCRIPTION(call_object IN VARCHAR2,
                            object_type IN VARCHAR2,
                            new_desc    IN VARCHAR2) IS
  BEGIN
    optm_num := FIND_OPTION(call_object,object_type);
    IF optm_num > 0 THEN
      SET_GROUP_CHAR_CELL(rc_id_d,rtn_rec_num,new_desc);
      IF option_name(optm_num) IS NOT NULL THEN
        char_optm_num := LPAD(TO_CHAR(optm_num),2,'0');
--
        menu_item_name := OPTM_STR || char_optm_num;
        SET_MENU_ITEM_PROPERTY(menu_item_name,LABEL,new_desc);
--
        pop_item_name := POPM_STR || char_optm_num;
        SET_MENU_ITEM_PROPERTY(pop_item_name,LABEL,new_desc);
      END IF;
    END IF;
  END;
--
--
  PROCEDURE ENABLE_OPTION(call_object IN VARCHAR2,
                          object_type IN VARCHAR2) IS
  BEGIN
    optm_num := FIND_OPTION(call_object,object_type);
    IF optm_num > 0 THEN
      SET_GROUP_CHAR_CELL(rc_id_s,rtn_rec_num,'E');
      item_name := OPTION_NAME(optm_num);
      IF item_name IS NOT NULL THEN
        SET_MENU_ITEM_PROPERTY(item_name,ENABLED,PROPERTY_TRUE);
--
        pop_item_name := POPM_STR || LPAD(TO_CHAR(optm_num),2,'0');
        SET_MENU_ITEM_PROPERTY(pop_item_name,ENABLED,PROPERTY_TRUE);
      END IF;
    END IF;
  END;
--
--
  PROCEDURE DISABLE_OPTION(call_object IN VARCHAR2,
                           object_type IN VARCHAR2) IS
  BEGIN
    optm_num := FIND_OPTION(call_object,object_type);
    IF optm_num <> 0 THEN
      SET_GROUP_CHAR_CELL(rc_id_s,rtn_rec_num,'D');
      item_name := OPTION_NAME(optm_num);
      IF item_name IS NOT NULL THEN
        SET_MENU_ITEM_PROPERTY(item_name,ENABLED,PROPERTY_FALSE);
--
        pop_item_name := POPM_STR || LPAD(TO_CHAR(optm_num),2,'0');
        SET_MENU_ITEM_PROPERTY(pop_item_name,ENABLED,PROPERTY_FALSE);
      END IF;
    END IF;
  END;
--
---- 50-4 Added following procedure for Menu Bar Options
--
  PROCEDURE RESET_MENU_AFTER_FORM_CALL IS
  BEGIN
    FOR dsp_itm IN 1..QTY_MREC LOOP
      item_name := OPTM_STR || LPAD(TO_CHAR(dsp_itm),2,'0');
      SET_MENU_ITEM_PROPERTY(item_name,DISPLAYED,PROPERTY_FALSE);
    END LOOP;
--
    REBUILD_VARIABLES;
--
    IF optm_cnt > 0 THEN
      SET_MENU_ITEM_PROPERTY('Main.Options',ENABLED,PROPERTY_TRUE);
    ELSE
      SET_MENU_ITEM_PROPERTY('Main.Options',ENABLED,PROPERTY_FALSE);
    END IF;
--
    DEFINE_MENU_OPTION;
    G$_MENU_BAR.SET_DATA_EXTRACT;
  END;
--
--
  PROCEDURE POPULATE_GUROPTM IS
  BEGIN
    IF CREATE_OPT_SELECTION(TRUE) THEN
      FOR dsp_itm IN 1..optm_cnt LOOP
        SET_GROUP_NUMBER_CELL(rc_id_p,GET_GROUP_SELECTION(optm_id, dsp_itm),dsp_itm);
      END LOOP;
      ind := 0;
      DEFINE_OPTION(FALSE);
--
      G$_POP_UP_MENU.POPULATE_POPUP_MENU;
    ELSE
      G$_POP_UP_MENU.CLEAR_POPUP_MENU;
    END IF;
  END;
--
--
  PROCEDURE EXECUTE_MENU (option_label IN VARCHAR2) IS 
    myoption  PLS_INTEGER;
  BEGIN
    REBUILD_VARIABLES;
    myoption := TO_NUMBER(SUBSTR(option_label,-2,2));
    EXECUTE_GUROPTM(myoption);
  END;
--
--
  FUNCTION OPTIONS_EXIST(object_in IN VARCHAR2) RETURN BOOLEAN IS  
  BEGIN
    RETURN(maxrow > 0);
  END;
--
---- Internal procedures and functions.
--
  FUNCTION CREATE_OPT_SELECTION (form_call IN BOOLEAN) RETURN BOOLEAN IS
    cur_blk         VARCHAR2(60) := NAME_IN('SYSTEM.CURSOR_BLOCK');
    trg_blk         VARCHAR2(60) := NAME_IN('SYSTEM.TRIGGER_BLOCK');
    lv_block        VARCHAR2(60);	 
    lv_tab_sec_form VARCHAR2(30);
    lv_tab_sec_tab  VARCHAR2(30);	 
  BEGIN
    IF maxrow > 0 THEN
      IF optm_cnt > 0 THEN
        SET_MENU_ITEM_PROPERTY('Main.Options',ENABLED,PROPERTY_TRUE);
      ELSE
        SET_MENU_ITEM_PROPERTY('Main.Options',ENABLED,PROPERTY_FALSE);
      END IF;
--
      RESET_GROUP_SELECTION(RG_OPTM); 
      FOR rg_rec IN 1..maxrow LOOP
        lv_block        := GET_GROUP_CHAR_CELL(RG_OPTM || '.GUROPTM_BLOCK_VALID',rg_rec);
        lv_tab_sec_form := GET_GROUP_CHAR_CELL(RG_OPTM || '.GUROPTM_TAB_SEC_FORM',rg_rec);
        lv_tab_sec_tab  := GET_GROUP_CHAR_CELL(RG_OPTM || '.GUROPTM_TAB_SEC_TAB',rg_rec);
        IF lv_block = NVL(trg_blk,cur_blk) OR lv_block IS NULL THEN
          IF lv_tab_sec_form IS NULL AND
             G$_TAB_SECURITY.G$_AUTH_LEVEL_TAB(lv_tab_sec_tab) = 'N' THEN
            NULL;
          ELSE
            SET_GROUP_SELECTION(optm_id, rg_rec); 
          END IF;
        END IF;
        IF form_call THEN
          SET_GROUP_NUMBER_CELL(rc_id_p,rg_rec,NULL);
        END IF;
      END LOOP;
--
      optm_cnt := GET_GROUP_SELECTION_COUNT(optm_id);
      RETURN(TRUE);
    ELSE
      SET_MENU_ITEM_PROPERTY('Main.Options',ENABLED,PROPERTY_FALSE);
      RETURN(FALSE);
    END IF;
  END;
--
--
  PROCEDURE EXECUTE_GUROPTM(rg_rec_num IN NUMBER) IS
    name1           VARCHAR2(30);
    name2           VARCHAR2(90);
    trg_name        VARCHAR2(30);
    capacity        VARCHAR2(30);
    type_ind        VARCHAR2(30);
    trg_type        VARCHAR2(30);
    lv_tab_sec_form VARCHAR2(30);
    lv_tab_sec_tab  VARCHAR2(30);	 
  BEGIN
    optm_num        := GET_GROUP_SELECTION(optm_id,rg_rec_num);
    name1           := GET_GROUP_CHAR_CELL(RG_OPTM || '.GUROPTM_NAME1'   ,optm_num);
    name2           := GET_GROUP_CHAR_CELL(RG_OPTM || '.GUROPTM_NAME2'   ,optm_num);
    type_ind        := GET_GROUP_CHAR_CELL(RG_OPTM || '.GUROPTM_TYPE_IND',optm_num);
    trg_name        := GET_GROUP_CHAR_CELL(RG_OPTM || '.GUROPTM_TRG_NAME',optm_num);
    trg_type        := GET_GROUP_CHAR_CELL(RG_OPTM || '.GUROPTM_TRG_TYPE',optm_num);
    capacity        := GET_GROUP_CHAR_CELL(RG_OPTM || '.GUROPTM_CAPACITY',optm_num);
    lv_tab_sec_form := GET_GROUP_CHAR_CELL(RG_OPTM || '.GUROPTM_TAB_SEC_FORM',optm_num);
    lv_tab_sec_tab  := GET_GROUP_CHAR_CELL(RG_OPTM || '.GUROPTM_TAB_SEC_TAB' ,optm_num);
--
    COPY(name1, 'GLOBAL.GUROPTM_NAME1');
--
-- -- 08/15/2000 TGKinderman Also indicate that it is a navigation frame call if the
-- -- guroptm_type_ind is P
--
    IF type_ind IN ('L','F','P') THEN
      COPY('Y','global.nav_frame_call');
    END IF;
-- -- --
-- -- -- The following is implemented with TabSecurity.  It is for Options that call into an external form
-- -- -- and into a specific tab in that form.   Well what if the user is not authorized to see that specific
-- -- -- tab in that form.  This if statement will check for that.
    IF lv_tab_sec_form IS NOT NULL THEN
      IF INSTR(G$_SECURITY.G$_GET_TAB_SECURITY_FNC(lv_tab_sec_form,
      	                                       NAME_IN('GLOBAL.CURRENT_USER')),lv_tab_sec_tab||':N') > 0 THEN
        MESSAGE(G$_NLS.Get('GOQRPLS-0082','LIB','*ERROR* User %01% is not authorized to access %02% on %03%.',
                            USER,
                            NVL(G$_SECURITY.G$_GET_TAB_DESC_FNC(lv_tab_sec_form,lv_tab_sec_tab),lv_tab_sec_tab),                            
                            lv_tab_sec_form)); 
        RAISE FORM_TRIGGER_FAILURE;
      END IF;
    END IF; 
-- -- --
--
    IF type_ind IN ('S','I') THEN
      MESSAGE(G$_NLS.Get('GOQRPLS-0083','LIB','*ERROR* Invalid item selected'));
      RAISE FORM_TRIGGER_FAILURE;
--
-- If window, verify item is enabled.
--
    ELSIF type_ind = 'W' THEN
      IF name2 IS NULL THEN
        MESSAGE(G$_NLS.Get('GOQRPLS-0084','LIB','*ERROR* No item to navigate to has been provided, cannot perform navigation.'),ACKNOWLEDGE);
        RETURN;
      END IF;
      IF GET_ITEM_PROPERTY(name2,ENABLED) = 'FALSE' THEN
        MESSAGE(G$_NLS.Get('GOQRPLS-0085','LIB','*ERROR* The item to navigate to is not enabled, cannot perform navigation.'),ACKNOWLEDGE);
        RETURN;
      END IF;
      SHOW_WINDOW(name1);
      GO_ITEM(name2);
--
-- If item name is not provided or is not enabled, do a go_block and let the form 
-- find an item to navigate to.
--
    ELSIF type_ind = 'B' THEN
      IF name2 IS NULL THEN
        GO_BLOCK(name1);
        RETURN;
      ELSE
        IF GET_ITEM_PROPERTY(name1|| '.' ||name2,ENABLED) = 'FALSE' THEN
          GO_BLOCK(name1);
          RETURN;
        ELSE
          GO_ITEM(name1 || '.' ||name2);
        END IF;
      END IF;
--
-- Call a form.
--
    ELSIF type_ind = 'F' THEN
      COPY('Y','GLOBAL.FORM_WAS_CALLED');
      EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
      G$_CHECK_FAILURE;
      IF capacity = 'M' THEN
        G$_SECURED_FORM_CALL(NAME_IN('GLOBAL.CURRENT_USER'),name1,'');
      ELSE 
        G$_SECURED_FORM_CALL(NAME_IN('GLOBAL.CURRENT_USER'),name1,'QUERY');
      END IF;
      COPY('','GLOBAL.FORM_WAS_CALLED');
--
-- Execute a trigger.
--
    ELSIF type_ind in ('P','L') THEN
      IF trg_type = 'U' THEN
        EXECUTE_TRIGGER(trg_name);
        G$_CHECK_FAILURE;
      ELSE
        DO_KEY(trg_name);
      END IF;
    ELSE
      MESSAGE(G$_NLS.Get('GOQRPLS-0086', 'LIB',
	               '*ERROR* Invalid type indicator in guroptm for %01%',name1));
      RAISE FORM_TRIGGER_FAILURE;
    END IF;
--
-- -- 11/14/2000 TGKinderman set switch off if navigation frame call relative to
-- -- guroptm_type_ind is P
--
    IF type_ind IN ('L','F','P') THEN
      COPY('N','global.nav_frame_call');
    END IF;
  END;
--
--
  PROCEDURE DEFINE_OPTION(do_scroll IN BOOLEAN) IS
  BEGIN
--
-- disable any existing options 
--
    FOR dsp_itm IN 1..QTY_MREC LOOP
      item_name := OPTM_STR || LPAD(TO_CHAR(dsp_itm),2,'0');
      SET_MENU_ITEM_PROPERTY(item_name,DISPLAYED,PROPERTY_FALSE);
    END LOOP;
--
    SET_MENU_ITEM_PROPERTY('Main.Options',ENABLED,PROPERTY_FALSE);
--
-- Now, set the options which are valid
--
    FOR dsp_itm IN 1..optm_cnt LOOP
      EXIT WHEN dsp_itm > QTY_MREC;
--
      optm_num := dsp_itm;
      rec_pos := GET_GROUP_SELECTION(optm_id,dsp_itm);
      item_name := OPTM_STR || LPAD(TO_CHAR(dsp_itm),2,'0');
-- 
-- Set value for option 
-- 
      SET_MENU_ITEM_PROPERTY(item_name,DISPLAYED,PROPERTY_TRUE);
      SET_MENU_ITEM_PROPERTY(item_name,ENABLED,PROPERTY_TRUE);
-- 
-- 50-17 remove alignment space characters from Menu Bar Option
-- 
      menu_work_name := GET_GROUP_CHAR_CELL(rc_id_d,rec_pos);
      menu_work_name := REPLACE(menu_work_name,'  ',' ');
--
      SET_MENU_ITEM_PROPERTY(item_name,LABEL,menu_work_name);
--
-- Set state for option
-- 
      IF GET_GROUP_CHAR_CELL(rc_id_s,rec_pos) = 'D' THEN
        SET_MENU_ITEM_PROPERTY(item_name,ENABLED,PROPERTY_FALSE);
      END IF;
    END LOOP;
--
-- Enable Options when any, even disabled, entries exist
--
    IF NVL(optm_cnt,0) > 0 THEN
      SET_MENU_ITEM_PROPERTY('Main.Options',ENABLED,PROPERTY_TRUE);
    END IF;
  END;  
--   
-- 50-4  Added following procedure to handle Menu Bar Options when returning from called 
--       forms since Nav Frame does not need to be refreshed.
--   
  PROCEDURE DEFINE_MENU_OPTION IS
  BEGIN
--
-- 50-4  Disable Menu Bar Options
--
    SET_MENU_ITEM_PROPERTY('Main.Options',ENABLED,PROPERTY_FALSE);
--
--50-6 added EXIT command to handle > 24 Menu Bar Options
--
    FOR dsp_itm IN 1..optm_cnt LOOP
      EXIT WHEN dsp_itm > QTY_MREC;
      optm_num := dsp_itm;
      rec_pos := GET_GROUP_SELECTION(optm_id,dsp_itm);
      item_name := OPTM_STR || LPAD(TO_CHAR(dsp_itm),2,'0');
-- 
-- Set value for option 
-- 
      SET_MENU_ITEM_PROPERTY(item_name,DISPLAYED,PROPERTY_TRUE);
      SET_MENU_ITEM_PROPERTY(item_name,ENABLED,PROPERTY_TRUE);
-- 
-- 50-17 remove alignment space characters from Menu Bar Option
-- 
      menu_work_name := GET_GROUP_CHAR_CELL(rc_id_d,rec_pos);
      menu_work_name := REPLACE(menu_work_name,'  ',' ');
-- 
      SET_MENU_ITEM_PROPERTY(item_name,LABEL,menu_work_name);
--
-- Set state for option
-- 
      IF GET_GROUP_CHAR_CELL(rc_id_s,rec_pos) = 'D' THEN
        SET_MENU_ITEM_PROPERTY(item_name,ENABLED,PROPERTY_FALSE);
      END IF;
    END LOOP;
--
-- Now hide all the remaining menu options
--
    IF optm_num < QTY_MREC THEN
      optm_num := optm_num + 1;
      FOR dsp_itm IN optm_num..QTY_MREC LOOP
        item_name := OPTM_STR || LPAD(TO_CHAR(dsp_itm),2,'0');
        SET_MENU_ITEM_PROPERTY(item_name,DISPLAYED,PROPERTY_FALSE);
      END LOOP;
    END IF;
--
-- Enable Options when any, even disabled, entries exist
--
    IF NVL(optm_cnt,0) > 0 THEN
      SET_MENU_ITEM_PROPERTY('Main.Options',ENABLED,PROPERTY_TRUE);
    END IF;
  END;  
--
--
  FUNCTION FIND_OPTION (call_object IN VARCHAR2,
                        object_type IN VARCHAR2) RETURN NUMBER IS
  BEGIN
    ind := 0;
    rtn_rec_num := 0;
--
    IF optm_cnt > 0 THEN
      FOR dsp_itm IN 1..optm_cnt LOOP 
        rtn_rec_num := GET_GROUP_SELECTION(optm_id, dsp_itm);
--
        IF GET_GROUP_CHAR_CELL(RG_OPTM || '.GUROPTM_TYPE_IND',rtn_rec_num) = object_type AND
           GET_GROUP_CHAR_CELL(RG_OPTM || '.GUROPTM_NAME1',rtn_rec_num) = call_object THEN
--
-- The below variable keeps the actual record number
--
          ind := dsp_itm;
          EXIT;
        END IF;
--
      END LOOP;
    END IF;
    RETURN(ind);
  END;
--
--
  FUNCTION OPTION_NAME (itm_num IN NUMBER) RETURN VARCHAR2 IS
  BEGIN
    IF NVL(itm_num,0) > 0 and itm_num <= qty_ditm THEN
      item_name := OPTM_STR || LPAD(TO_CHAR(itm_num),2,'0');
      RETURN(item_name);
    END IF;
--
    RETURN(NULL);
  END;
--
-- 50-4 Added following function. 
--      Only used for Menu Bar Options when Nav Frame is also enabled.
--
  FUNCTION MENU_OPTION_NAME (mnu_itm_num IN NUMBER) RETURN VARCHAR2 IS
  BEGIN
    IF NVL(mnu_itm_num,0) > 0 and mnu_itm_num <= qty_ditm THEN
      menu_item_name := OPTM_STR || LPAD(TO_CHAR(mnu_itm_num),2,'0');
      RETURN(menu_item_name);
    END IF;
--
    RETURN(NULL);
  END;
--
-- Procedure to rebuild variables lost when any option is executed from menu
--
  PROCEDURE REBUILD_VARIABLES IS
  BEGIN
    rc_id_d := FIND_COLUMN('G$_GUROPTM_RG.GUROPTM_SORT_SEQ');
    rc_id_d := FIND_COLUMN('G$_GUROPTM_RG.GUROPTM_TYPE_IND');
    rc_id_d := FIND_COLUMN('G$_GUROPTM_RG.GUROPTM_FORM_NAME');
    rc_id_d := FIND_COLUMN('G$_GUROPTM_RG.GUROPTM_NAME1');
    rc_id_d := FIND_COLUMN('G$_GUROPTM_RG.GUROPTM_NAME2');
    rc_id_d := FIND_COLUMN('G$_GUROPTM_RG.GUROPTM_CAPACITY');
    rc_id_d := FIND_COLUMN('G$_GUROPTM_RG.GUROPTM_TRG_NAME');
    rc_id_d := FIND_COLUMN('G$_GUROPTM_RG.GUROPTM_TRG_TYPE');
    rc_id_d := FIND_COLUMN('G$_GUROPTM_RG.GUROPTM_BLOCK_VALID');
    rc_id_d := FIND_COLUMN('G$_GUROPTM_RG.GUROPTM_NAME1_DESC');
    rc_id_p := FIND_COLUMN('G$_GUROPTM_RG.GUROPTM_REC_POS');
    rc_id_s := FIND_COLUMN('G$_GUROPTM_RG.GUROPTM_STATE');
--
    optm_id := FIND_GROUP(RG_OPTM);
    optm_cnt := GET_GROUP_SELECTION_COUNT(optm_id);
  END;
--
--
BEGIN
--
  IF ID_NULL(optm_id) THEN
    optm_id := CREATE_GROUP(RG_OPTM);
    rc_id_d := ADD_GROUP_COLUMN(optm_id,'GUROPTM_SORT_SEQ'    ,NUMBER_COLUMN);
    rc_id_d := ADD_GROUP_COLUMN(optm_id,'GUROPTM_TYPE_IND'    ,CHAR_COLUMN,1);
    rc_id_d := ADD_GROUP_COLUMN(optm_id,'GUROPTM_FORM_NAME'   ,CHAR_COLUMN,30);
    rc_id_d := ADD_GROUP_COLUMN(optm_id,'GUROPTM_NAME1'       ,CHAR_COLUMN,30);
    rc_id_d := ADD_GROUP_COLUMN(optm_id,'GUROPTM_NAME2'       ,CHAR_COLUMN,61);
    rc_id_d := ADD_GROUP_COLUMN(optm_id,'GUROPTM_CAPACITY'    ,CHAR_COLUMN,1);
    rc_id_d := ADD_GROUP_COLUMN(optm_id,'GUROPTM_TRG_NAME'    ,CHAR_COLUMN,30);
    rc_id_d := ADD_GROUP_COLUMN(optm_id,'GUROPTM_TRG_TYPE'    ,CHAR_COLUMN,1);
    rc_id_d := ADD_GROUP_COLUMN(optm_id,'GUROPTM_BLOCK_VALID' ,CHAR_COLUMN,30);
    rc_id_d := ADD_GROUP_COLUMN(optm_id,'GUROPTM_TAB_SEC_FORM',CHAR_COLUMN,30);
    rc_id_d := ADD_GROUP_COLUMN(optm_id,'GUROPTM_TAB_SEC_TAB' ,CHAR_COLUMN,30);
    rc_id_d := ADD_GROUP_COLUMN(optm_id,'GUROPTM_NAME1_DESC'  ,CHAR_COLUMN,93);
    rc_id_p := ADD_GROUP_COLUMN(optm_id,'GUROPTM_REC_POS'     ,NUMBER_COLUMN,5);
    rc_id_s := ADD_GROUP_COLUMN(optm_id,'GUROPTM_STATE'       ,CHAR_COLUMN,1);
--
-- Populate record group
--
-- 50-23  add code to handle different settings of Form Name display on GUAUPRF form
--        N=None option 
--
--sq This needs to be redone in a db package
    sql_stmt := 'SELECT GUROPTM_SORT_SEQ, GUROPTM_TYPE_IND, GUROPTM_FORM_NAME,' ||
                'GUROPTM_NAME1, GUROPTM_NAME2, GUROPTM_CAPACITY,' ||
                'GUROPTM_TRG_NAME, GUROPTM_TRG_TYPE, GUROPTM_BLOCK_VALID, GUROPTM_TAB_SEC_FORM, GUROPTM_TAB_SEC_TAB,';
--
-- 50-23 Display Form Mnemonic options M=Menu Bar Options only
--
    IF NAME_IN('GLOBAL.FORMNAME_DISPLAY_IND') = 'N' THEN
      sql_stmt := sql_stmt || 'GUROPTM_NAME1_DESC, NULL,' || '''E''';
    ELSE
      sql_stmt := sql_stmt || 'GUROPTM_NAME1_DESC 
      || DECODE(GUROPTM_FORM_TO_BE_CALLED,NULL,NULL,'' ['' || GUROPTM_FORM_TO_BE_CALLED 
      || '']''),' || 'NULL,' || '''E''';
    END IF;
--
    sql_stmt := sql_stmt || ' FROM GUROPTM WHERE GUROPTM_FORM_NAME = ' || 
                            '''' || NAME_IN('SYSTEM.CURRENT_FORM') || '''' || 
                            ' AND GUROPTM_TYPE_IND <> '||'''I'''|| 
                            ' ORDER BY GUROPTM_SORT_SEQ';
--
    ind := POPULATE_GROUP_WITH_QUERY(RG_OPTM,sql_stmt);
    maxrow := GET_GROUP_ROW_COUNT(RG_OPTM);
  END IF;
--
EXCEPTION
  WHEN OTHERS THEN
    NULL;
END;
		*/
				// 
		private NString charOptmNum= NString.getNull();
		private NString itemName= NString.getNull();
		//  Temporary name of option
		private NString menuItemName= NString.getNull();
		//  Temporary name of Menu Bar option
		private NString menuWorkName= NString.getNull();
		//  Work area for Menu Bar option name
		private NString popItemName= NString.getNull();
		private NString sqlStmt= NString.getNull();
		//  Select statment to populate G$_GUROPTM_RG
		// 
		public final NString OPTM_STR = toStr("OPTIONS.SUB_MENU_");
		public final NString POPM_STR = toStr("G$_DEFAULT_PM.SUB_MENU_");
		public final NInteger QTY_MREC = toInt(24);
		//  Qty records in Option menu
		public final NString RG_OPTM = toStr("G$_GUROPTM_RG");
		// 
		private ValueSet optmId = findGroup(RG_OPTM);
		private ValueSetColumn rcIdD= null;
		//  Id GUROPTM_NAME1_DESC column
		private ValueSetColumn rcIdS= null;
		//  Id GUROPTM_STATE column
		private ValueSetColumn rcIdP= null;
		//  Id GUROPTM_REC_POS column
		// 
		private NInteger ind= NInteger.getNull();
		private NInteger maxrow = toInt(0);
		//  Qty records in G$_GUROPTM_RG
		private NInteger optmCnt = toInt(0);
		//  Qty selected records 
		private NInteger optmNum= NInteger.getNull();
		private NInteger qtyDitm = toInt(24);
		//  Qty fields on the canvas
		private NInteger recPos= NInteger.getNull();
		private NInteger rtnRecNum= NInteger.getNull();
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param callObject
		* @param objectType
		*/
		public NString getDescription(NString callObject, NString objectType)
		{
			MenuEntry item = findOption(callObject, objectType);
			if (item != null){
				return toStr(item.getLabel());
			}
			
			// MORPHIS: TODO soundex not implemented
//			optmNum = toInt(findOption(callObject, objectType));
//			if ( optmNum.greater(0) )
//			{
//				return ((getGroupCharCell(rcIdD, rtnRecNum)));
//			}
			return NString.getNull();
		}
/* <p>
		* 
		* 
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param callObject
		* @param objectType
		* @param newDesc
		*/
		public void setDescription(NString callObject, NString objectType, NString newDesc)
		{
			MenuEntry item = findOption(callObject, objectType);
			if (item != null){
				item.setLabel(newDesc.getValue());
				getCurrentTask().addCommand(getCurrentTask().getCommandDescriptorFactory().createBindMenuCommand(getCurrentTask(), "GoTo", "MENU_CONTROL", "GOTO_MENU"));				
			}
			
			
			
//			optmNum = toInt(findOption(callObject, objectType));
//			if ( optmNum.greater(0) )
//			{
//				setGroupCharCell(rcIdD, rtnRecNum, newDesc);
//				if ( !optionName(toNumber(optmNum)).isNull() )
//				{
//					charOptmNum = lpad(toChar(optmNum), 2, "0");
//					// 
//					menuItemName = OPTM_STR.append(charOptmNum);
//					// F2J_NOT_SUPPORTED : The property "MENU_ITEM's LABEL" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin4".
//					//					SupportClasses.FORMS40.SetMenuItemProperty(menuItemName, SupportClasses.Property.LABEL, newDesc);
//					System.err.println("// F2J_NOT_SUPPORTED : The property 'MENU_ITEM's LABEL' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin4'.");
//					
//					// 
//					popItemName = POPM_STR.append(charOptmNum);
//					// F2J_NOT_SUPPORTED : The property "MENU_ITEM's LABEL" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin4".
//					//					SupportClasses.FORMS40.SetMenuItemProperty(popItemName, SupportClasses.Property.LABEL, newDesc);
//					System.err.println("// F2J_NOT_SUPPORTED : The property 'MENU_ITEM's LABEL' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin4'.");
//					
//				}
//			}
		}
/* <p>
		* 
		* 
		* F2J_STRONG_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param callObject
		* @param objectType
		*/
		public void enableOption(NString callObject, NString objectType)
		{
			MenuEntry item = findOption(callObject, objectType);
			if (item != null){
				item.setEnabled(true);
				getCurrentTask().addCommand(getCurrentTask().getCommandDescriptorFactory().createBindMenuCommand(getCurrentTask(), "GoTo", "MENU_CONTROL", "GOTO_MENU"));
			}
//			optmNum = toInt(findOption(callObject, objectType));
//			if ( optmNum.greater(0) )
//			{
//				setGroupCharCell(rcIdS, rtnRecNum, "E");
//				itemName = optionName(toNumber(optmNum));
//				if ( !itemName.isNull() )
//				{
//					setMenuItemEnabled(itemName, true);
//					// 
//					popItemName = POPM_STR.append(lpad(toChar(optmNum), 2, "0"));
//					setMenuItemEnabled(popItemName, true);
//				}
//			}
		}
/* <p>
		* 
		* 
		* F2J_STRONG_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param callObject
		* @param objectType
		*/
		public void disableOption(NString callObject, NString objectType)
		{
			MenuEntry item = findOption(callObject, objectType);
			if (item != null)
			{
				item.setEnabled(false);
				getCurrentTask().addCommand(getCurrentTask().getCommandDescriptorFactory().createBindMenuCommand(getCurrentTask(), "GoTo", "MENU_CONTROL", "GOTO_MENU"));
			}
//			optmNum = toInt(findOption(callObject, objectType));
//			if ( optmNum.notEquals(0) )
//			{
//				setGroupCharCell(rcIdS, rtnRecNum, "D");
//				itemName = optionName(toNumber(optmNum));
//				if ( !itemName.isNull() )
//				{
//					setMenuItemEnabled(itemName, false);
//					// 
//					popItemName = POPM_STR.append(lpad(toChar(optmNum), 2, "0"));
//					setMenuItemEnabled(popItemName, false);
//				}
//			}
		}
/* <p>
		* 
		* -- 50-4 Added following procedure for Menu Bar Options
		* 
		* F2J_STRONG_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void resetMenuAfterFormCall()
		{
			//MORPHIS
			executeAction("FILTER_MENU");
			
			
			for ( int dspItm = 1; dspItm <= QTY_MREC.toInt32(); dspItm++ )
			{
				itemName = OPTM_STR.append(lpad(toChar(dspItm), 2, "0"));
				// F2J_NOT_SUPPORTED : The property "MENU_ITEM's DISPLAYED" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin4".
				//				SupportClasses.FORMS40.SetMenuItemProperty(itemName, SupportClasses.Property.DISPLAYED, false);
				this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'MENU_ITEM's DISPLAYED' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin4'.");
				
				
			}
			// 
			rebuildVariables();
			// 
			if ( optmCnt.greater(0) )
			{
				setMenuItemEnabled("Main.Options", true);
			}
			else {
				setMenuItemEnabled("Main.Options", false);
			}
			// 
			defineMenuOption();
			getContainer().getGMenuBar().setDataExtract();
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void populateGuroptm()
		{
			if ( createOptSelection(toBool(NBool.True)).getValue() )
			{
				for ( int dspItm = 1; dspItm <= optmCnt.toInt32(); dspItm++ )
				{
					// F2J_NOT_SUPPORTED : Call to built-in "GET_GROUP_SELECTION" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin33".
					//					setGroupNumberCell(rcIdP, SupportClasses.FORMS4G.GetGroupSelection(optmId, dspItm), dspItm);
					this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : Call to built-in 'GET_GROUP_SELECTION' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin33'.");
					
					
				}
				ind = toInt(0);
				defineOption(toBool(NBool.False));
				// 
				getContainer().getGPopUpMenu().populatePopupMenu();
			}
			else {
				getContainer().getGPopUpMenu().clearPopupMenu();
			}
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param optionLabel
		*/
		public void executeMenu(String optionLabel)
		{
			executeMenu(toStr(optionLabel));
		}
		
		public void executeMenu(NString optionLabel)
		{
			NInteger myoption= NInteger.getNull();
			rebuildVariables();
			myoption = toInt(substring(optionLabel, -2, toInt(2)));
			executeGuroptm(toNumber(myoption));
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param objectIn
		*/
		public NBool optionsExist(NString objectIn)
		{
			return (toBool(maxrow.greater(0)));
		}
/* <p>
		* 
		* -- Internal procedures and functions.
		* 
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this function was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param formCall
		*/
		public NBool createOptSelection(NBool formCall)
		{
			NString curBlk = getCursorBlock();
			NString trgBlk = getTriggerBlock();
			NString lvBlock= NString.getNull();
			NString lvTabSecForm= NString.getNull();
			NString lvTabSecTab= NString.getNull();
			if ( maxrow.greater(0) )
			{
				if ( optmCnt.greater(0) )
				{
					setMenuItemEnabled("Main.Options", true);
				}
				else {
					setMenuItemEnabled("Main.Options", false);
				}
				// 
				// F2J_NOT_SUPPORTED : Call to built-in "RESET_GROUP_SELECTION" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin34".
				//				SupportClasses.FORMS4G.ResetGroupSelection(RG_OPTM);
				this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : Call to built-in 'RESET_GROUP_SELECTION' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin34'.");
				
				
				for ( int rgRec = 1; rgRec <= maxrow.toInt32(); rgRec++ )
				{
					lvBlock = getGroupCharCell(RG_OPTM.append(".GUROPTM_BLOCK_VALID"), rgRec);
					lvTabSecForm = getGroupCharCell(RG_OPTM.append(".GUROPTM_TAB_SEC_FORM"), rgRec);
					lvTabSecTab = getGroupCharCell(RG_OPTM.append(".GUROPTM_TAB_SEC_TAB"), rgRec);
					if ( lvBlock.equals(isNull(trgBlk, curBlk)) || lvBlock.isNull() )
					{
						if ( lvTabSecForm.isNull() && getContainer().getGTabSecurity().gAuthLevelTab(lvTabSecTab).equals("N") )
						{
						}
						else {
							// F2J_NOT_SUPPORTED : Call to built-in "SET_GROUP_SELECTION" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin35".
							//							SupportClasses.FORMS4G.SetGroupSelection(optmId, rgRec);
							this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : Call to built-in 'SET_GROUP_SELECTION' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin35'.");
							
							
						}
					}
					if ( formCall.getValue() )
					{
						setGroupNumberCell(rcIdP, rgRec, null);
					}
				}
				// 
				// F2J_NOT_SUPPORTED : Call to built-in "GET_GROUP_SELECTION_COUNT" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin36".
				//				optmCnt = toInt(SupportClasses.FORMS4G.GetGroupSelectionCount(optmId));
				this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : Call to built-in 'GET_GROUP_SELECTION_COUNT' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin36'.");
				
				
				return  toBool(((NBool.True)));
			}
			else {
				setMenuItemEnabled("Main.Options", false);
				return  toBool(((NBool.False)));
			}
		}
/* <p>
		* 
		* 
/* </p>
		* @param rgRecNum
		*/
		public void executeGuroptm(NNumber rgRecNum)
		{
			NString name1= NString.getNull();
			NString name2= NString.getNull();
			NString trgName= NString.getNull();
			NString capacity= NString.getNull();
			NString typeInd= NString.getNull();
			NString trgType= NString.getNull();
			NString lvTabSecForm= NString.getNull();
			NString lvTabSecTab= NString.getNull();
			// F2J_NOT_SUPPORTED : Call to built-in "GET_GROUP_SELECTION" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin33".
			//			optmNum = toInt(SupportClasses.FORMS4G.GetGroupSelection(optmId, rgRecNum));
			this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : Call to built-in 'GET_GROUP_SELECTION' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin33'.");
			
			
			name1 = getGroupCharCell(RG_OPTM.append(".GUROPTM_NAME1"), optmNum);
			name2 = getGroupCharCell(RG_OPTM.append(".GUROPTM_NAME2"), optmNum);
			typeInd = getGroupCharCell(RG_OPTM.append(".GUROPTM_TYPE_IND"), optmNum);
			trgName = getGroupCharCell(RG_OPTM.append(".GUROPTM_TRG_NAME"), optmNum);
			trgType = getGroupCharCell(RG_OPTM.append(".GUROPTM_TRG_TYPE"), optmNum);
			capacity = getGroupCharCell(RG_OPTM.append(".GUROPTM_CAPACITY"), optmNum);
			lvTabSecForm = getGroupCharCell(RG_OPTM.append(".GUROPTM_TAB_SEC_FORM"), optmNum);
			lvTabSecTab = getGroupCharCell(RG_OPTM.append(".GUROPTM_TAB_SEC_TAB"), optmNum);
			// 
			copy(name1,"GLOBAL.GUROPTM_NAME1");
			// 
			//  -- 08/15/2000 TGKinderman Also indicate that it is a navigation frame call if the
			//  -- guroptm_type_ind is P
			// 
			if ( in(typeInd, "L", "F", "P").getValue() )
			{
				copy("Y","global.nav_frame_call");
			}
			//  -- --
			//  -- -- The following is implemented with TabSecurity.  It is for Options that call into an external form
			//  -- -- and into a specific tab in that form.   Well what if the user is not authorized to see that specific
			//  -- -- tab in that form.  This if statement will check for that.
			if ( !lvTabSecForm.isNull() )
			{
				if ( inStr(GSecurity.FgGetTabSecurityFnc(lvTabSecForm, getNameIn("GLOBAL.CURRENT_USER")), lvTabSecTab.append(":N")).greater(0) )
				{
					errorMessage(GNls.Fget(toStr("GOQRPLS-0082"), toStr("LIB"), toStr("*ERROR* User %01% is not authorized to access %02% on %03%."), getUser(), isNull(GSecurity.FgGetTabDescFnc(lvTabSecForm, lvTabSecTab), lvTabSecTab), lvTabSecForm));
					throw new ApplicationException();
				}
			}
			//  -- --
			// 
			if ( in(typeInd, "S", "I").getValue() )
			{
				errorMessage(GNls.Fget(toStr("GOQRPLS-0083"), toStr("LIB"), toStr("*ERROR* Invalid item selected")));
				throw new ApplicationException();
			}
			else if ( typeInd.equals("W") ) {
				if ( name2.isNull() )
				{
					errorMessage(GNls.Fget(toStr("GOQRPLS-0084"), toStr("LIB"), toStr("*ERROR* No item to navigate to has been provided, cannot perform navigation.")), OutputMessageUserResponse.ACKNOWLEDGE);
					return ;
				}
				if ( getItemEnabled(name2).equals("FALSE") )
				{
					errorMessage(GNls.Fget(toStr("GOQRPLS-0085"), toStr("LIB"), toStr("*ERROR* The item to navigate to is not enabled, cannot perform navigation.")), OutputMessageUserResponse.ACKNOWLEDGE);
					return ;
				}
				showWindow(name1);
				goItem(name2);
			}
			else if ( typeInd.equals("B") ) {
				if ( name2.isNull() )
				{
					goBlock(name1);
					return ;
				}
				else {
					if ( getItemEnabled(name1.append(".").append(name2)).equals("FALSE") )
					{
						goBlock(name1);
						return ;
					}
					else {
						goItem(name1.append(".").append(name2));
					}
				}
			}
			else if ( typeInd.equals("F") ) {
				copy("Y","GLOBAL.FORM_WAS_CALLED");
				executeAction("G$_REVOKE_ACCESS");
				getContainer().gCheckFailure();
				if ( capacity.equals("M") )
				{
					getContainer().gSecuredFormCall(getNameIn("GLOBAL.CURRENT_USER"), name1, toStr(""));
				}
				else {
					getContainer().gSecuredFormCall(getNameIn("GLOBAL.CURRENT_USER"), name1, toStr("QUERY"));
				}
				copy("","GLOBAL.FORM_WAS_CALLED");
			}
			else if ( in(typeInd, "P", "L").getValue() ) {
				if ( trgType.equals("U") )
				{
					// F2J_TO_COMPLETE : Call to built-in "EXECUTE_TRIGGER" was removed because it is not supported. See documentation for details "".
					//					SupportClasses.SQLFORMS.ExecuteTrigger(trgName);
					this.getLogger().trace(this, "// F2J_TO_COMPLETE : Call to built-in 'EXECUTE_TRIGGER' was removed because it is not supported. See documentation for details ''.");
					
					
					getContainer().gCheckFailure();
				}
				else {
					// F2J_NOT_SUPPORTED : Call to built-in "DO_KEY" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin13".
					//					SupportClasses.SQLFORMS.DoKey(trgName);
					this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : Call to built-in 'DO_KEY' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin13'.");
					
					
				}
			}
			else {
				errorMessage(GNls.Fget(toStr("GOQRPLS-0086"), toStr("LIB"), toStr("*ERROR* Invalid type indicator in guroptm for %01%"), name1));
				throw new ApplicationException();
			}
			// 
			//  -- 11/14/2000 TGKinderman set switch off if navigation frame call relative to
			//  -- guroptm_type_ind is P
			// 
			if ( in(typeInd, "L", "F", "P").getValue() )
			{
				copy("N","global.nav_frame_call");
			}
		}
/* <p>
		* 
		* 
		* F2J_STRONG_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param doScroll
		*/
		public void defineOption(NBool doScroll)
		{
			// 
			//  disable any existing options 
			// 
			for ( int dspItm = 1; dspItm <= QTY_MREC.toInt32(); dspItm++ )
			{
				itemName = OPTM_STR.append(lpad(toChar(dspItm), 2, "0"));
				// F2J_NOT_SUPPORTED : The property "MENU_ITEM's DISPLAYED" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin4".
				//				SupportClasses.FORMS40.SetMenuItemProperty(itemName, SupportClasses.Property.DISPLAYED, false);
				this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'MENU_ITEM's DISPLAYED' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin4'.");
				
				
			}
			// 
			setMenuItemEnabled("Main.Options", false);
			// 
			//  Now, set the options which are valid
			// 
			for ( int dspItm = 1; dspItm <= optmCnt.toInt32(); dspItm++ )
			{
				if ( toInt(dspItm).greater(QTY_MREC) ) 
					break;
				// 
				optmNum = toInt(dspItm);
				// F2J_NOT_SUPPORTED : Call to built-in "GET_GROUP_SELECTION" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin33".
				//				recPos = toInt(SupportClasses.FORMS4G.GetGroupSelection(optmId, dspItm));
				this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : Call to built-in 'GET_GROUP_SELECTION' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin33'.");
				
				
				itemName = OPTM_STR.append(lpad(toChar(dspItm), 2, "0"));
				//  
				//  Set value for option 
				//  
				// F2J_NOT_SUPPORTED : The property "MENU_ITEM's DISPLAYED" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin4".
				//				SupportClasses.FORMS40.SetMenuItemProperty(itemName, SupportClasses.Property.DISPLAYED, true);
				this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'MENU_ITEM's DISPLAYED' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin4'.");
				
				
				setMenuItemEnabled(itemName, true);
				//  
				//  50-17 remove alignment space characters from Menu Bar Option
				//  
				menuWorkName = getGroupCharCell(rcIdD, recPos);
				menuWorkName = replace(menuWorkName, "  ", " ");
				// 
				// F2J_NOT_SUPPORTED : The property "MENU_ITEM's LABEL" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin4".
				//				SupportClasses.FORMS40.SetMenuItemProperty(itemName, SupportClasses.Property.LABEL, menuWorkName);
				this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'MENU_ITEM's LABEL' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin4'.");
				
				
				// 
				//  Set state for option
				//  
				if ( getGroupCharCell(rcIdS, recPos).equals("D") )
				{
					setMenuItemEnabled(itemName, false);
				}
			}
			// 
			//  Enable Options when any, even disabled, entries exist
			// 
			if ( isNull(optmCnt, 0).greater(0) )
			{
				setMenuItemEnabled("Main.Options", true);
			}
		}
/* <p>
		*    
		*  50-4  Added following procedure to handle Menu Bar Options when returning from called 
		*        forms since Nav Frame does not need to be refreshed.
		*    
		* F2J_STRONG_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void defineMenuOption()
		{
			// 
			//  50-4  Disable Menu Bar Options
			// 
			setMenuItemEnabled("Main.Options", false);
			// 
			// 50-6 added EXIT command to handle > 24 Menu Bar Options
			// 
			for ( int dspItm = 1; dspItm <= optmCnt.toInt32(); dspItm++ )
			{
				if ( toInt(dspItm).greater(QTY_MREC) ) 
					break;
				optmNum = toInt(dspItm);
				// F2J_NOT_SUPPORTED : Call to built-in "GET_GROUP_SELECTION" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin33".
				//				recPos = toInt(SupportClasses.FORMS4G.GetGroupSelection(optmId, dspItm));
				this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : Call to built-in 'GET_GROUP_SELECTION' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin33'.");
				
				
				itemName = OPTM_STR.append(lpad(toChar(dspItm), 2, "0"));
				//  
				//  Set value for option 
				//  
				// F2J_NOT_SUPPORTED : The property "MENU_ITEM's DISPLAYED" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin4".
				//				SupportClasses.FORMS40.SetMenuItemProperty(itemName, SupportClasses.Property.DISPLAYED, true);
				this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'MENU_ITEM's DISPLAYED' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin4'.");
				
				
				setMenuItemEnabled(itemName, true);
				//  
				//  50-17 remove alignment space characters from Menu Bar Option
				//  
				menuWorkName = getGroupCharCell(rcIdD, recPos);
				menuWorkName = replace(menuWorkName, "  ", " ");
				//  
				// F2J_NOT_SUPPORTED : The property "MENU_ITEM's LABEL" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin4".
				//				SupportClasses.FORMS40.SetMenuItemProperty(itemName, SupportClasses.Property.LABEL, menuWorkName);
				this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'MENU_ITEM's LABEL' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin4'.");
				
				
				// 
				//  Set state for option
				//  
				if ( getGroupCharCell(rcIdS, recPos).equals("D") )
				{
					setMenuItemEnabled(itemName, false);
				}
			}
			// 
			//  Now hide all the remaining menu options
			// 
			if ( optmNum.lesser(QTY_MREC) )
			{
				optmNum = optmNum.add(1);
				for ( int dspItm = optmNum.toInt32(); dspItm <= QTY_MREC.toInt32(); dspItm++ )
				{
					itemName = OPTM_STR.append(lpad(toChar(dspItm), 2, "0"));
					// F2J_NOT_SUPPORTED : The property "MENU_ITEM's DISPLAYED" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin4".
					//					SupportClasses.FORMS40.SetMenuItemProperty(itemName, SupportClasses.Property.DISPLAYED, false);
					this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'MENU_ITEM's DISPLAYED' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin4'.");
					
					
				}
			}
			// 
			//  Enable Options when any, even disabled, entries exist
			// 
			if ( isNull(optmCnt, 0).greater(0) )
			{
				setMenuItemEnabled("Main.Options", true);
			}
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param callObject
		* @param objectType
		*/
		public MenuEntry findOption(NString callObject, NString objectType)
		{
//			ind = toInt(0);
//			rtnRecNum = toInt(0);
//			// 
//			if ( optmCnt.greater(0) )
//			{
//				for ( int dspItm = 1; dspItm <= optmCnt.toInt32(); dspItm++ )
//				{
//					// F2J_NOT_SUPPORTED : Call to built-in "GET_GROUP_SELECTION" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin33".
//					//					rtnRecNum = toInt(SupportClasses.FORMS4G.GetGroupSelection(optmId, dspItm));
//					System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'GET_GROUP_SELECTION' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin33'.");
//					
//					// 
//					if ( getGroupCharCell(RG_OPTM.append(".GUROPTM_TYPE_IND"), rtnRecNum).equals(objectType) && getGroupCharCell(RG_OPTM.append(".GUROPTM_NAME1"), rtnRecNum).equals(callObject) )
//					{
//						// 
//						//  The below variable keeps the actual record number
//						// 
//						ind = toInt(dspItm);
//							break;
//					}
//				}
//			}
//			return toNumber(ind);
			
			try {			
				
					
				BlockDescriptor menuBlock = BlockServices.findBlock("MENU_CONTROL");
				if(menuBlock != null)
				{
					ItemDescriptor itemDescriptor = menuBlock.findItem("GOTO_MENU");
					
					if(itemDescriptor != null)
					{
						TreeDescriptor treeDescriptor = (TreeDescriptor) itemDescriptor;
						try{
							MenuEntry menuEntry = null;
							menuEntry = (MenuEntry)treeDescriptor.findNode(callObject.getValue() + "#" + objectType.getValue());
							
							if(menuEntry != null )  {
								treeDescriptor.setCacheable(true);
								treeDescriptor.setCacheStatus(TreeCacheStatus.Changed);
								return menuEntry;
								
							}
							
						}catch(Exception menuEx)
						{
							
						}
					}
				}
			} 
			finally {
				
			}
			
			return null;
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param itmNum
		*/
		public NString optionName(NNumber itmNum)
		{
			if ( isNull(itmNum, 0).greater(0) && itmNum.lesserOrEquals(qtyDitm) )
			{
				itemName = OPTM_STR.append(lpad(toChar(itmNum), 2, "0"));
				return ((itemName));
			}
			// 
			return NString.getNull();
		}
/* <p>
		* 
		*  50-4 Added following function. 
		*       Only used for Menu Bar Options when Nav Frame is also enabled.
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param mnuItmNum
		*/
		public NString menuOptionName(NNumber mnuItmNum)
		{
			if ( isNull(mnuItmNum, 0).greater(0) && mnuItmNum.lesserOrEquals(qtyDitm) )
			{
				menuItemName = OPTM_STR.append(lpad(toChar(mnuItmNum), 2, "0"));
				return ((menuItemName));
			}
			// 
			return NString.getNull();
		}
/* <p>
		* 
		*  Procedure to rebuild variables lost when any option is executed from menu
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void rebuildVariables()
		{
			rcIdD = findColumn("G$_GUROPTM_RG.GUROPTM_SORT_SEQ");
			rcIdD = findColumn("G$_GUROPTM_RG.GUROPTM_TYPE_IND");
			rcIdD = findColumn("G$_GUROPTM_RG.GUROPTM_FORM_NAME");
			rcIdD = findColumn("G$_GUROPTM_RG.GUROPTM_NAME1");
			rcIdD = findColumn("G$_GUROPTM_RG.GUROPTM_NAME2");
			rcIdD = findColumn("G$_GUROPTM_RG.GUROPTM_CAPACITY");
			rcIdD = findColumn("G$_GUROPTM_RG.GUROPTM_TRG_NAME");
			rcIdD = findColumn("G$_GUROPTM_RG.GUROPTM_TRG_TYPE");
			rcIdD = findColumn("G$_GUROPTM_RG.GUROPTM_BLOCK_VALID");
			rcIdD = findColumn("G$_GUROPTM_RG.GUROPTM_NAME1_DESC");
			rcIdP = findColumn("G$_GUROPTM_RG.GUROPTM_REC_POS");
			rcIdS = findColumn("G$_GUROPTM_RG.GUROPTM_STATE");
			// 
			optmId = findGroup(RG_OPTM);
			// F2J_NOT_SUPPORTED : Call to built-in "GET_GROUP_SELECTION_COUNT" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin36".
			//			optmCnt = toInt(SupportClasses.FORMS4G.GetGroupSelectionCount(optmId));
			this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : Call to built-in 'GET_GROUP_SELECTION_COUNT' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin36'.");
			
			
		}
	
}
