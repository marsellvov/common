package net.hedtech.general.common.libraries.Goqrpls;

import java.util.*;

import org.jdesktop.databuffer.DataRow.DataRowStatus;

import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.configuration.DAOConfiguration;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.*;
import morphis.foundations.core.appsupportlib.exceptions.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appsupportlib.util.*;
import morphis.foundations.core.appsupportlib.runtime.*;
import morphis.foundations.core.appsupportlib.runtime.action.DeferredActionInformation;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.BlockDescriptor;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.items.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.lovs.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.containers.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.alerts.*;
import morphis.foundations.core.appsupportlib.runtime.web.message.InteractionManager;
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
import net.hedtech.general.common.libraries.Eoqrpls.*;

public class GSd extends AbstractSupportCodeObject {
	

	public GSd(ISupportCodeContainer container) {
		super(container);		
	}
	
	@Override
	public GoqrplsServices getContainer() {
		return (GoqrplsServices)super.getContainer();
	}
	//Original PL/SQL code for Package Prog Unit (SPEC) G$_SD
	/*
	PACKAGE g$_sd IS
  C_LIGHTBULB_NAME 				CONSTANT VARCHAR2(32) := 'ICONS.SDE_LIGHTBULB';
  C_SD_MNU_NAME 				  CONSTANT VARCHAR2(32) := 'BLOCK.SD_MNU';
  C_BRIGHT_ICON_NAME      CONSTANT VARCHAR2(32) := 'brightbulb';
  C_LIGHT_ICON_NAME       CONSTANT VARCHAR2(32) := 'lightbulb';
  C_SD_CLOSE_TIMER_NAME 	CONSTANT VARCHAR2(32) := 'SDE_CLOSE_TIMER';
  C_SD_BLOCK_TIMER_NAME 	CONSTANT VARCHAR2(32) := 'SDE_BLOCK_TIMER';
  C_SDISP_WIN   					CONSTANT VARCHAR2(30) := 'G$_SDSP_WINDOW';
  C_SDISP_BLOCK 					CONSTANT VARCHAR2(30) := 'G$_SDISP'; 
  C_SDKEY 					CONSTANT VARCHAR2(30) := 'G$_SDKEY';
	C_SDKEY_SD_BLOCK  CONSTANT VARCHAR2(61) := C_SDKEY||'.SD_BLOCK';
		-- 80-12
	CALLING_BLOCK_NAME	VARCHAR2(30) := '';

  FUNCTION  f_sdisp_win_visible RETURN BOOLEAN;
  PROCEDURE p_pre_block;
  PROCEDURE p_pst_block;
  PROCEDURE p_pre_form;
  PROCEDURE p_pst_form;
  PROCEDURE p_menu_handler(p_menu VARCHAR2);
  PROCEDURE p_show_sd;  
  PROCEDURE p_when_new_rec_inst;
	PROCEDURE p_close_sde_form(p_delayed BOOLEAN);  
	PROCEDURE p_disp_disc;
	PROCEDURE p_new_block;
	PROCEDURE p_set_menu(p_enabled NUMBER:=NULL, p_has_sd VARCHAR2:=NULL);
	PROCEDURE p_post_dml;
	PROCEDURE p_check_required;
	PROCEDURE p_enter_query;
	-- 80-4
  --  Add Procudures G$_SD.KEY_COMMIT, G$_SD.KEY_NXTBLK and G$_SD.KEY_PRVBLK
  --  	to provide SDE block functionality thru GOQOLIB.G$_SDISP triggers.
  PROCEDURE KEY_COMMIT; 	
  PROCEDURE KEY_NXTBLK;
  PROCEDURE KEY_PRVBLK;
	-- 80-12 
	--	Add procedures G$_SD.p_sde_block_access_set and G$_SD.p_sde_block_access_reset
	--		to provide same table access (upate, insert and delete) 
	--		to SDE block as calling block	for Tab Level Security functionality.		
	PROCEDURE p_sde_block_access_set;
	PROCEDURE p_sde_block_access_reset;
END;
	*/
	
		public static final NString C_LIGHTBULB_NAME = toStr("ICONS.SDE_LIGHTBULB");
		public static final NString C_SDE_EXTENSION_NAME = toStr("SDE");
		public static final NString C_SDE_EXTENSION_ENABLED = toStr("SDE_ENABLED");
		public static final NString C_SD_MNU_NAME = toStr("BLOCK.SD_MNU");
		public static final NString C_SD_CLOSE_TIMER_NAME = toStr("SDE_CLOSE_TIMER");
		public static final NString C_SD_BLOCK_TIMER_NAME = toStr("SDE_BLOCK_TIMER");
		public static final NString C_SDISP_WIN = toStr("G$_SDSP_WINDOW");
		public static final NString C_SDISP_BLOCK = toStr("G$_SDISP");
		public static final NString C_SDKEY = toStr("G$_SDKEY");
		public static final NString C_SDKEY_SD_BLOCK = C_SDKEY.append(".SD_BLOCK");
		//  80-12
		public NString callingBlockName = toStr("");

			
		//Original PL/SQL code for Package Prog Unit (BODY) G$_SD
		/*
		PACKAGE BODY g$_sd IS
	

	C_SDKEY_SD_BANTAB	   CONSTANT VARCHAR2(61) := C_SDKEY||'.SD_BANTAB';

	C_SDKEY_SD_DISPBLOCK CONSTANT VARCHAR2(61) := C_SDKEY||'.SD_DISPBLOCK';
	C_SDKEY_SD_KEY       CONSTANT VARCHAR2(61) := C_SDKEY||'.SD_KEY';
	C_SDKEY_SD_ROWID     CONSTANT VARCHAR2(61) := C_SDKEY||'.SD_ROWID';
	C_SDKEY_SD_DISPROWID CONSTANT VARCHAR2(61) := C_SDKEY||'.SD_DISPROWID';
	C_SDKEY_SD_EXISTS    CONSTANT VARCHAR2(61) := C_SDKEY||'.SD_EXISTS';
	C_SDKEY_TRIG_ENA     CONSTANT VARCHAR2(61) := C_SDKEY||'.TRIG_ENA';
  C_SDKEY_C_NOT_NULL     CONSTANT VARCHAR2(61) := C_SDKEY||'.COUNT_NOT_NULL';
  C_SDKEY_C_REQD_IS_NULL CONSTANT VARCHAR2(61) := C_SDKEY||'.COUNT_REQD_IS_NULL';
  C_GLOB_SD_ENABLED      CONSTANT VARCHAR2(30) := 'GLOBAL.SD_ENABLED_PRE_FORM';
	C_GLOB_SD_EXIST        CONSTANT VARCHAR2(30) := 'GLOBAL.SD_EXISTS_PRE_FORM';
	
	C_SDISP_ATTR_REQD_IND  CONSTANT VARCHAR2(61) := C_SDISP_BLOCK||'.GOVSDAV_ATTR_REQD_IND';
	
	C_CANNOT_ENTER_ERR  CONSTANT VARCHAR2(256):= g$_nls.get('GOQRPLS-0124','LIB','Supplemental attributes cannot be entered before the new parent record is saved.');
  
  TYPE SDISP_ITEMS_TAB_TYPE IS TABLE OF VARCHAR2(61);
  
  -- A table with Itemnames to Enable in the Supplemental Datablock
  sdisp_items_tab SDISP_ITEMS_TAB_TYPE := SDISP_ITEMS_TAB_TYPE(
  	-- C_SDISP_BLOCK||'.GORSDAV_DISC'
  	--,C_SDISP_BLOCK||'.VALUE_AS_CLOB'
  	--,
  	C_SDISP_BLOCK||'.GOVSDAV_VALUE_AS_CHAR'
  ); 
  
  FUNCTION f_base_table(p_block IN VARCHAR2) RETURN VARCHAR2 IS
  BEGIN
  	IF p_block IS NOT NULL THEN
  		RETURN UPPER(SUBSTR(NVL(GET_BLOCK_PROPERTY(p_block,BASE_TABLE),p_block),1,30));
  	END IF;
  	RETURN NULL;
  END f_base_table;
  
  FUNCTION f_trig_ena RETURN BOOLEAN IS
    l_item ITEM := FIND_ITEM(C_SDKEY_TRIG_ENA);
  BEGIN
  	IF ID_NULL(l_item) THEN
  		--return NULL. This form is not compiled with sde libraries
  		RETURN NULL;
  	END IF;
  	RETURN NAME_IN(C_SDKEY_TRIG_ENA)='Y';
  END f_trig_ena;
  
  PROCEDURE p_set_trig_ena(p_bool BOOLEAN) IS
  	l_val VARCHAR2(1);
  BEGIN
  	IF p_bool THEN
  		l_val:='Y'; 		
  	ELSIF NOT p_bool THEN
  		l_val:='N';
  	END IF;
  	COPY(l_val,C_SDKEY_TRIG_ENA);
  END p_set_trig_ena;
  
  PROCEDURE p_set_menu(p_enabled NUMBER:=NULL, p_has_sd VARCHAR2:=NULL) IS
  BEGIN
  	IF p_enabled IS NOT NULL THEN
  		SET_MENU_ITEM_PROPERTY(C_LIGHTBULB_NAME,ENABLED,p_enabled);	
  		SET_MENU_ITEM_PROPERTY(C_SD_MNU_NAME,ENABLED,p_enabled);	
  	END IF;
  	IF p_has_sd='Y' THEN  	
		  SET_MENU_ITEM_PROPERTY(C_LIGHTBULB_NAME,ICON_NAME,C_BRIGHT_ICON_NAME);
		ELSIF p_has_sd='N' THEN
		  SET_MENU_ITEM_PROPERTY(C_LIGHTBULB_NAME,ICON_NAME,C_LIGHT_ICON_NAME);
		END IF;  		
  END p_set_menu;

	-- Is Supplemental Data Enabled in current context?
  FUNCTION f_sd_enabled RETURN BOOLEAN IS
		l_sdisp_win WINDOW := FIND_WINDOW(C_SDISP_WIN);   
	BEGIN
		RETURN 	NOT ID_NULL(l_sdisp_win)
						AND GET_MENU_ITEM_PROPERTY(C_LIGHTBULB_NAME,ENABLED)=g$_frm.C_TRUE;
  END f_sd_enabled;

  
	FUNCTION  f_sdisp_win_visible RETURN BOOLEAN IS
 	  l_sdisp_win WINDOW := FIND_WINDOW(C_SDISP_WIN);
	BEGIN
	-- 80-12 clarify return
		<multilinecomment> orignal code following
		RETURN 	NOT ID_NULL(l_sdisp_win)
						AND GET_WINDOW_PROPERTY(l_sdisp_win,VISIBLE)=g$_frm.C_TRUE;
						original code above </multilinecomment>
		IF NOT ID_NULL(l_sdisp_win)
		AND GET_WINDOW_PROPERTY(l_sdisp_win,VISIBLE)=g$_frm.C_TRUE THEN
				RETURN(TRUE);
		ELSE
				RETURN(FALSE);
		END IF;
			
	END f_sdisp_win_visible;


	PROCEDURE p_new_record(p_table VARCHAR2, p_block VARCHAR2) IS
	  l_ex    VARCHAR2(1):='N';
    l_pkey 	GORSDAV.GORSDAV_PK_PARENTTAB%TYPE;
    l_rowid VARCHAR2(18):=NAME_IN(p_block||'.ROWID');
    l_rownum INTEGER;	  
	BEGIN		
    IF l_rowid IS NOT NULL THEN
    	--get the primary key for the current basetable record rowid      
	    l_pkey := gp_goksdif.f_get_pk(p_table,l_rowid);
		  --sets the primary key, used in view...
	   	gp_goksdif.p_set_current_pk(l_pkey);	 
			--check if supplemental data are associated with the current basetable record.
			l_ex:=gp_goksdif.f_sd_exists(p_table,l_pkey);			
		  COPY(l_pkey,C_SDKEY_SD_KEY);
		  COPY(l_rowid,C_SDKEY_SD_ROWID);			
			COPY(l_ex,C_SDKEY_SD_EXISTS);			  	   
		ELSE
		  gp_goksdif.p_set_current_pk(CHR(1));	
		  COPY(NULL,C_SDKEY_SD_KEY);
		  COPY(NULL,C_SDKEY_SD_ROWID);			
			COPY(NULL,C_SDKEY_SD_EXISTS);		  	
		END IF;    	
		p_set_menu(NULL,l_ex);
	END p_new_record;

	PROCEDURE p_set_sd_block_enabled(p_prop_true_false NUMBER) IS
	BEGIN
		FOR i IN sdisp_items_tab.first .. sdisp_items_tab.last LOOP
	  	SET_ITEM_PROPERTY(sdisp_items_tab(i),ENABLED,p_prop_true_false);
	  	--IF p_prop_true_false=PROPERTY_TRUE THEN
		  	SET_ITEM_PROPERTY(sdisp_items_tab(i),NAVIGABLE,p_prop_true_false);
		  	SET_ITEM_PROPERTY(sdisp_items_tab(i),UPDATE_ALLOWED,p_prop_true_false);
	  	--END IF;
		END LOOP;
	END p_set_sd_block_enabled;
		
  PROCEDURE p_new_block IS	
  	l_block     VARCHAR2(30):=NAME_IN(G$_FRM.C_SYSTEM_CURRENT_BLOCK);
    l_dispblock VARCHAR2(30):=NAME_IN(C_SDKEY_SD_BLOCK);
    l_table     VARCHAR2(30):=f_base_table(l_block);
	  l_timer TIMER;
	BEGIN
		l_timer := FIND_TIMER(C_SD_BLOCK_TIMER_NAME);	
		-- If we are invoked by the timer, kill it
		IF NOT ID_NULL(l_timer) THEN
			DELETE_TIMER(l_timer);
		END IF;
		IF l_block = C_SDISP_BLOCK THEN
			NULL;
		ELSIF l_block <> NVL(l_dispblock,'#') THEN  -- moved status check (7.3 fix ftmorgn)
			COPY(l_table,C_SDKEY_SD_BANTAB);
			COPY(l_block,C_SDKEY_SD_BLOCK);
			
			IF NAME_IN(G$_FRM.C_SYSTEM_RECORD_STATUS)=G$_FRM.C_QUERY THEN
				IF f_sd_enabled THEN -- only when sd enabled
					p_new_record(l_table,l_block);
					IF f_sdisp_win_visible THEN
						p_show_sd;
						go_block(l_block);
					END IF;
				END IF;
			END IF;
			--
		ELSIF l_block = l_dispblock THEN 
			--navigating between blocks, entering in block for which SD are displayed.
			p_set_menu(NULL,NAME_IN(C_SDKEY_SD_EXISTS));
			-- Enable block when window is visible. 
			IF f_sdisp_win_visible THEN
				p_set_sd_block_enabled(PROPERTY_TRUE);
			END IF;
		END IF;
	END p_new_block;		

  PROCEDURE p_pre_block IS
  	l_timer TIMER;
  	C_DELAY CONSTANT INTEGER := 200;
		l_rownum INTEGER;
		l_block  VARCHAR2(30);
		l_curblock VARCHAR2(30);
		BEGIN
			--
		CASE f_trig_ena
		WHEN TRUE THEN
			l_curblock := NAME_IN(G$_FRM.C_SYSTEM_CURRENT_BLOCK);
			IF l_curblock=C_SDISP_BLOCK THEN
				l_block:=NAME_IN(G$_SD.C_SDKEY_SD_BLOCK);
				IF l_block IS NOT NULL THEN
					l_rownum:=GET_BLOCK_PROPERTY(l_block,CURRENT_RECORD); 	
					IF  GET_RECORD_PROPERTY(l_rownum,l_block,STATUS) IN (G$_FRM.C_NEW, G$_FRM.C_INSERT) THEN
					  MESSAGE(C_CANNOT_ENTER_ERR);
						RAISE FORM_TRIGGER_FAILURE;
					ELSIF NAME_IN(C_SDKEY_SD_ROWID) IS NULL THEN
						-- Refresh from basetable. 
						p_new_record(f_base_table(l_block), l_block);
					END IF;
				END IF;
			ELSE					
				IF gb_sde_table.f_exists(f_base_table(l_curblock))='Y' THEN
		  		p_set_menu(PROPERTY_TRUE);	
		  		-- Start a check if current record in block has supplemental data asynchronously
		  		-- (we are in a pre-block trigger and cannot execute restricted procedures
		  		-- like navigating to blocks)
			    l_timer := FIND_TIMER(C_SD_BLOCK_TIMER_NAME);	    
			    IF NOT ID_NULL(l_timer) THEN
			    	DELETE_TIMER(l_timer);
			    END IF;
					l_timer := CREATE_TIMER(C_SD_BLOCK_TIMER_NAME,C_DELAY,REPEAT);			  		
		  	ELSE
		  		p_set_menu(PROPERTY_FALSE,'N');  	
		  		IF f_sdisp_win_visible THEN -- no supplemental data, disable the window
		  			p_set_sd_block_enabled(PROPERTY_FALSE);
		  		END IF;
		  	END IF;
				END IF;
	  WHEN FALSE THEN
	  	NULL;         -- Trigger should not do anything (sde induced navigation is taking place)
	  ELSE            -- f_trig_ena IS NULL, meaning form was not compiled with SDE libs
	  	p_set_menu(PROPERTY_FALSE,'N');		
	  END CASE; -- f_trig_ena
  END p_pre_block;
  
  PROCEDURE p_pst_block IS
  BEGIN
		null;
  END;

  PROCEDURE p_pre_form IS
    l_sd_exists VARCHAR2(1):='N';
    
    PROCEDURE p_push(p_stackname VARCHAR2, p_val VARCHAR2) IS
      l_stackval VARCHAR2(2048);
    BEGIN
    	l_stackval:=NAME_IN(p_stackname);
    	COPY(l_stackval||';'||p_val,p_stackname);
    END p_push;
	BEGIN
	--Push the current sde menu state and Icon on Stack
    p_push(C_GLOB_SD_ENABLED,GET_MENU_ITEM_PROPERTY(C_LIGHTBULB_NAME,ENABLED));
		IF GET_MENU_ITEM_PROPERTY(C_LIGHTBULB_NAME,ICON_NAME)=C_BRIGHT_ICON_NAME THEN
			l_sd_exists:='Y';
		END IF;
		p_push(C_GLOB_SD_EXIST,l_sd_exists);
  END;
  
  PROCEDURE p_pst_form IS
    l_sd_enabled NUMBER:=PROPERTY_FALSE;
    l_val VARCHAR2(256);
    
    PROCEDURE p_pop(p_stackname VARCHAR2, p_var IN OUT VARCHAR2) IS
      l_stackval VARCHAR2(2048);
      l_end INTEGER;
    BEGIN
    	l_stackval:=NAME_IN(p_stackname);
    	l_end:=INSTR(l_stackval,';',-1); -- search last semicolon (value separator)
    	IF l_end>0 THEN
    		p_var:=SUBSTR(l_stackval,l_end+1);
    		COPY(SUBSTR(l_stackval,1,l_end-1),p_stackname);
    	END IF;
    END p_pop;
	BEGIN
	--Pop menu state and icon from stack and restore.
		p_pop(C_GLOB_SD_ENABLED,l_val);
		IF l_val=g$_frm.C_TRUE THEN
			l_sd_enabled:=PROPERTY_TRUE;
		END IF;
		p_pop(C_GLOB_SD_EXIST,l_val);
		p_set_menu(l_sd_enabled,l_val);
		-- 80-13 change button and menu bar option label when SDE window is shown or hidden
		-- added here to handle case where user exits form without first exiting SDE window
	  SET_MENU_ITEM_PROPERTY(C_LIGHTBULB_NAME,LABEL,(g$_nls.get('GOQRPLS-0125','LIB','View Supplemental Data')));
  	SET_MENU_ITEM_PROPERTY(C_SD_MNU_NAME,LABEL,(g$_nls.get('GOQRPLS-0126','LIB','View Supplemental Data')));
  	--
  END p_pst_form;
  
  PROCEDURE p_when_new_rec_inst IS
    l_block VARCHAR2(30);
  BEGIN
  	IF f_sd_enabled AND f_trig_ena THEN
  		l_block := NAME_IN(G$_FRM.C_SYSTEM_CURRENT_BLOCK);
	  	IF l_block=NAME_IN(C_SDKEY_SD_BLOCK) THEN
	  		-- Only synchronize SD when navigating in block with SD
	  		p_new_record(f_base_table(l_block), l_block);
		  	IF f_sdisp_win_visible THEN
		  		IF NAME_IN(g$_frm.C_SYSTEM_MODE) = g$_frm.C_ENTER_QUERY THEN
		  			NULL;
					ELSE
		  			p_show_sd;
		  			GO_BLOCK(l_block); --Navigate back to the block that fired the trigger
		  		END IF;	  		
		  	END IF;
	  	END IF;
	  END IF;
  END p_when_new_rec_inst;
 
  PROCEDURE p_show_sd IS
    l_block      VARCHAR2(30):=NAME_IN(G$_FRM.C_SYSTEM_CURRENT_BLOCK);
    l_table      VARCHAR2(30):=f_base_table(l_block);
    l_disp_block VARCHAR2(30):=NVL(NAME_IN(	C_SDKEY_SD_DISPBLOCK),'#');
    l_rowid      VARCHAR2(18):=NAME_IN(C_SDKEY_SD_ROWID);
    l_disp_rowid VARCHAR2(18):=NVL(NAME_IN(C_SDKEY_SD_DISPROWID),'#');
	BEGIN
  	-- 80-12 save calling block in order to match database access modes 
		G$_SD.CALLING_BLOCK_NAME :=NAME_IN(G$_FRM.C_SYSTEM_CURSOR_BLOCK);

    IF NAME_IN(G$_FRM.C_SYSTEM_RECORD_STATUS) <> G$_FRM.C_QUERY THEN
			MESSAGE(g$_nls.get('GOQRPLS-0127','LIB','No parent record for Supplemental Attributes exists.'));
			RETURN;
    END IF;

		IF l_rowid IS NULL THEN
	  	--7.3 try to obtain rowid
	  	p_new_record(l_table, l_block);
	  	l_rowid := NAME_IN(C_SDKEY_SD_ROWID);
	  END IF;

		IF l_block <> l_disp_block  THEN
			BEGIN
			  gp_goksdif.p_insert_disc(l_table);
			EXCEPTION
				WHEN OTHERS THEN
				  G$_DISPLAY_ERR_MSG(SQLERRM);
				  RAISE FORM_TRIGGER_FAILURE;
			END;	  
			COPY(l_block,C_SDKEY_SD_DISPBLOCK);
	END IF;

		IF G$_FRM.C_FALSE IN (GET_ITEM_PROPERTY(sdisp_items_tab(sdisp_items_tab.first),ENABLED),
			                    GET_ITEM_PROPERTY(sdisp_items_tab(sdisp_items_tab.first),UPDATE_ALLOWED) )			
	  THEN
			p_set_sd_block_enabled(PROPERTY_TRUE);
		END IF;

		IF GET_WINDOW_PROPERTY(C_SDISP_WIN,Y_POS)=0 THEN --User has not moved it.
			SHOW_WINDOW(C_SDISP_WIN,5,295);
		ELSE
			SHOW_WINDOW(C_SDISP_WIN);
		END IF;
	  -- 80-13 change button and menu bar option label when SDE window is shown or hidden
	  SET_MENU_ITEM_PROPERTY(C_LIGHTBULB_NAME,LABEL,(g$_nls.get('GOQRPLS-0128','LIB','Hide Supplemental Data')));
  	SET_MENU_ITEM_PROPERTY(C_SD_MNU_NAME,LABEL,(g$_nls.get('GOQRPLS-0129','LIB','Hide Supplemental Data')));
  		--
	  IF l_rowid IS NULL THEN
	  	-- We have no rowid, clear the block and display a status message
	  	COPY(l_rowid,C_SDKEY_SD_DISPROWID);
	  	p_set_trig_ena(FALSE);
	  	GO_BLOCK(C_SDISP_BLOCK);
	  	EXECUTE_QUERY;
	  	CLEAR_MESSAGE; -- Clear in case forms wanted to say no records selected
	  	SYNCHRONIZE;   -- Needed for displaying the supplemental block.
			MESSAGE(C_CANNOT_ENTER_ERR);
			GO_BLOCK(l_block);
			p_set_trig_ena(TRUE);
	  ELSIF l_rowid <> l_disp_rowid THEN
	  	COPY(l_rowid,C_SDKEY_SD_DISPROWID);
	    GO_BLOCK(C_SDISP_BLOCK);
	    EXECUTE_QUERY;
	  ELSE
    	GO_BLOCK(C_SDISP_BLOCK);
	  END IF;
	  -- 80-12 add call to set SDE block to same access as calling block
			p_sde_block_access_set;
  END p_show_sd;

	PROCEDURE p_close_sde_form(p_delayed BOOLEAN) IS
	  l_timer TIMER := FIND_TIMER(C_SD_CLOSE_TIMER_NAME);
	  C_DELAY CONSTANT INTEGER := 100;
	BEGIN
		IF p_delayed THEN
			IF ID_NULL(l_timer)  THEN 
				l_timer := CREATE_TIMER(C_SD_CLOSE_TIMER_NAME,C_DELAY,NO_REPEAT);
			END IF; 
		ELSE
			IF f_sdisp_win_visible THEN
				p_check_required;
				-- 80-16 add one line following as an escape if a validation error is detected
        G$_CHECK_FAILURE;
				IF NAME_IN(G$_FRM.C_SYSTEM_CURRENT_BLOCK)=C_SDISP_BLOCK THEN
					GO_BLOCK(NAME_IN(C_SDKEY_SD_BLOCK));
					-- 80-16 add one line following as an escape if a validation error is detected
          G$_CHECK_FAILURE;				
				END IF;
				-- Make sure that block navigation does not pop up the SD window.
				p_set_sd_block_enabled(PROPERTY_FALSE);
				HIDE_WINDOW(C_SDISP_WIN);
				-- 80-13 change button and menu bar option label when SDE window is shown or hidden
	  		SET_MENU_ITEM_PROPERTY(C_LIGHTBULB_NAME,LABEL,(g$_nls.get('GOQRPLS-0130','LIB','View Supplemental Data')));
  			SET_MENU_ITEM_PROPERTY(C_SD_MNU_NAME,LABEL,(g$_nls.get('GOQRPLS-0131','LIB','View Supplemental Data')));
  			--
			END IF;
			IF NOT ID_NULL(l_timer) THEN
				DELETE_TIMER(l_timer);
			END IF;
		END IF;
	END p_close_sde_form;

  PROCEDURE p_disp_disc IS
  	l_disc govsdav.govsdav_disc%type:=NAME_IN(C_SDISP_BLOCK||'.GOVSDAV_DISC');
    l_prompt govsdav.govsdav_attr_prompt%type:=NAME_IN(C_SDISP_BLOCK||'.GOVSDAV_ATTR_PROMPT');
    l_promptdisp govsdav.govsdav_attr_prompt_disp%type;    
  BEGIN
  	l_promptdisp:=REPLACE(l_prompt,'%DISC%',l_disc);
  	COPY(l_promptdisp,C_SDISP_BLOCK||'.GOVSDAV_ATTR_PROMPT_DISP');
  END p_disp_disc;
  
  PROCEDURE p_menu_handler(p_menu VARCHAR2) IS
	BEGIN
		CASE p_menu 
		WHEN C_LIGHTBULB_NAME THEN 
		  p_show_sd;
		WHEN C_SD_MNU_NAME THEN
		  IF f_sdisp_win_visible THEN
		  	clear_message;
		  	p_close_sde_form(p_delayed=>FALSE);
		  ELSE
		  	p_show_sd;
		  END IF;
		ELSE
			NULL;
		END CASE;	
	END p_menu_handler;


 	PROCEDURE p_post_dml IS
 	BEGIN
  --Update the lightbulb.
		IF NAME_IN(C_SDKEY_C_NOT_NULL)=0 THEN
			g$_sd.p_set_menu( p_has_sd =>'N');
		ELSE
			g$_sd.p_set_menu( p_has_sd =>'Y');
		END IF;	 		
 	END p_post_dml;

	PROCEDURE p_check_required IS
	BEGIN
		-- Validate item when current item is required
		IF NAME_IN(C_SDISP_ATTR_REQD_IND)='Y' THEN
		  VALIDATE(ITEM_SCOPE);
		END IF;
		IF NAME_IN(C_SDKEY_C_REQD_IS_NULL)>0
		AND NAME_IN(C_SDKEY_C_NOT_NULL)>0 THEN
			MESSAGE(g$_nls.get('GOQRPLS-0132','LIB','Required Attributes need to be entered.'));
			RAISE FORM_TRIGGER_FAILURE;
		END IF;
		-- 80-12 add call to reset block access
		p_sde_block_access_reset;
		--
	END p_check_required;

  PROCEDURE p_enter_query IS
  	 l_block VARCHAR2(30):=NAME_IN(G$_FRM.C_SYSTEM_CURRENT_BLOCK);
  BEGIN
  	IF l_block <> C_SDISP_BLOCK
	  AND f_sdisp_win_visible
	  THEN
		  gp_goksdif.p_set_current_pk(CHR(1));	
		  COPY(NULL,C_SDKEY_SD_KEY);
		  COPY(NULL,C_SDKEY_SD_ROWID);			
		  COPY(NULL,C_SDKEY_SD_DISPROWID);	
			COPY(NULL,C_SDKEY_SD_EXISTS);
	  	p_set_trig_ena(FALSE);
	    GO_BLOCK(C_SDISP_BLOCK);
	  	EXECUTE_QUERY;	    
	  	GO_BLOCK(l_block);
	  	p_set_sd_block_enabled(PROPERTY_FALSE);
	  	p_set_trig_ena(TRUE);
	  	p_set_menu(NULL,'N');
			--HIDE_WINDOW(C_SDISP_WIN);
		END IF;
  END p_enter_query;
  
  -- 80-4
  PROCEDURE KEY_COMMIT IS
  BEGIN	
  	COMMIT_FORM;
  	G$_CHECK_FAILURE;
  END;
  -- 80-4
  PROCEDURE KEY_NXTBLK IS
  BEGIN
  	G$_INVALID_FUNCTION_MSG;
  END;
  -- 80-4
  PROCEDURE KEY_PRVBLK IS
  BEGIN
  	G$_INVALID_FUNCTION_MSG;
  END;
  -- 80-12 
	--	Add procedures G$_SD.p_sde_block_access_set and G$_SD.p_sde_block_access_reset
	--		to provide same database table access (update, insert and delete) 
	--		to SDE block as calling block	for Tab Level Security functionality.		
	PROCEDURE p_sde_block_access_set IS
		G$_SDISP_BLOCK_ID BLOCK := FIND_BLOCK('G$_SDISP');
		calling_block_id 	BLOCK := FIND_BLOCK(CALLING_BLOCK_NAME);
	BEGIN
	--
	-- move access for Query and Inquiry forms from GOQOLIB block G$_SDIPSP trigger Pre-Form.
	IF  NOT ID_NULL(G$_SDISP_BLOCK_ID) THEN
			if (SUBSTR(NAME_IN(G$_FRM.C_SYSTEM_CURRENT_FORM),3,1) = 'Q'
			or  SUBSTR(NAME_IN(G$_FRM.C_SYSTEM_CURRENT_FORM),3,1) = 'I'
			-- 80- open SDE window in query mode for select query-only forms
			-- that do not have Q or I as third character of name
			or  (NAME_IN(G$_FRM.C_SYSTEM_CURRENT_FORM)) = 'SOAIDEN'
			or  (NAME_IN(G$_FRM.C_SYSTEM_CURRENT_FORM)) = 'AOAIDEN'
			or  (NAME_IN(G$_FRM.C_SYSTEM_CURRENT_FORM)) = 'ROAIDEN'
			or  (NAME_IN(G$_FRM.C_SYSTEM_CURRENT_FORM)) = 'SOACOMP'
			or  (NAME_IN(G$_FRM.C_SYSTEM_CURRENT_FORM)) = 'AOACOMP') then
					SET_BLOCK_PROPERTY(G$_SDISP_BLOCK_ID,UPDATE_ALLOWED,PROPERTY_FALSE);
					SET_BLOCK_PROPERTY(G$_SDISP_BLOCK_ID,INSERT_ALLOWED,PROPERTY_FALSE);
					SET_BLOCK_PROPERTY(G$_SDISP_BLOCK_ID,DELETE_ALLOWED,PROPERTY_FALSE);
					-- 80-15 avoid Tab Level Security if form is a query-only form by design
					RETURN;
			 end if;
	END IF;
--
	IF  NOT ID_NULL(calling_block_id) 
	AND NOT ID_NULL(G$_SDISP_BLOCK_ID) THEN
			if (GET_BLOCK_PROPERTY(calling_block_id,UPDATE_ALLOWED) = 'FALSE') then
					SET_BLOCK_PROPERTY(G$_SDISP_BLOCK_ID,UPDATE_ALLOWED,PROPERTY_FALSE);
			elsif (GET_BLOCK_PROPERTY(calling_block_id,UPDATE_ALLOWED) = 'TRUE') then
					SET_BLOCK_PROPERTY(G$_SDISP_BLOCK_ID,UPDATE_ALLOWED,PROPERTY_TRUE);
			end if;
			--
			if (GET_BLOCK_PROPERTY(calling_block_id,INSERT_ALLOWED) = 'FALSE') then
					SET_BLOCK_PROPERTY(G$_SDISP_BLOCK_ID,INSERT_ALLOWED,PROPERTY_FALSE);
			elsif (GET_BLOCK_PROPERTY(calling_block_id,INSERT_ALLOWED) = 'TRUE') then
					SET_BLOCK_PROPERTY(G$_SDISP_BLOCK_ID,INSERT_ALLOWED,PROPERTY_TRUE);
    	end if;
			--
			if (GET_BLOCK_PROPERTY(calling_block_id,DELETE_ALLOWED) = 'FALSE') then
					SET_BLOCK_PROPERTY(G$_SDISP_BLOCK_ID,DELETE_ALLOWED,PROPERTY_FALSE);
			elsif (GET_BLOCK_PROPERTY(calling_block_id,DELETE_ALLOWED) = 'TRUE') then
					SET_BLOCK_PROPERTY(G$_SDISP_BLOCK_ID,DELETE_ALLOWED,PROPERTY_TRUE);
			end if;
			--
	END IF;
	--
	END p_sde_block_access_set;

	-- 80-12 reset SDE data block access to synchronize with Tab Level Security	
	PROCEDURE p_sde_block_access_reset IS
		G$_SDISP_BLOCK_ID BLOCK := FIND_BLOCK('G$_SDISP');
	BEGIN
		IF  NOT ID_NULL(G$_SDISP_BLOCK_ID) THEN
				SET_BLOCK_PROPERTY(G$_SDISP_BLOCK_ID,UPDATE_ALLOWED,PROPERTY_TRUE);
				SET_BLOCK_PROPERTY(G$_SDISP_BLOCK_ID,INSERT_ALLOWED,PROPERTY_TRUE);
				SET_BLOCK_PROPERTY(G$_SDISP_BLOCK_ID,DELETE_ALLOWED,PROPERTY_TRUE);
		END IF;
	END p_sde_block_access_reset;

BEGIN	
	DEFAULT_VALUE('',	C_GLOB_SD_ENABLED);
	DEFAULT_VALUE('',	C_GLOB_SD_EXIST);  
END;
		*/
		public static final NString C_SDKEY_SD_BANTAB = C_SDKEY.append(".SD_BANTAB");
		public static final NString C_SDKEY_SD_DISPBLOCK = C_SDKEY.append(".SD_DISPBLOCK");
		public static final NString C_SDKEY_SD_KEY = C_SDKEY.append(".SD_KEY");
		public static final NString C_SDKEY_SD_ROWID = C_SDKEY.append(".SD_ROWID");
		public static final NString C_SDKEY_SD_DISPROWID = C_SDKEY.append(".SD_DISPROWID");
		public static final NString C_SDKEY_SD_EXISTS = C_SDKEY.append(".SD_EXISTS");
		public static final NString C_SDKEY_TRIG_ENA = C_SDKEY.append(".TRIG_ENA");
		public static final NString C_SDKEY_C_NOT_NULL = C_SDKEY.append(".COUNT_NOT_NULL");
		public static final NString C_SDKEY_C_REQD_IS_NULL = C_SDKEY.append(".COUNT_REQD_IS_NULL");
		//public final NString C_GLOB_SD_ENABLED = toStr("GLOBAL.SD_ENABLED_PRE_FORM");
		//public final NString C_GLOB_SD_EXIST = toStr("GLOBAL.SD_EXISTS_PRE_FORM");
		public static final NString C_SDISP_ATTR_REQD_IND = C_SDISP_BLOCK.append(".GOVSDAV_ATTR_REQD_IND");
		public static final NString C_CANNOT_ENTER_ERR = GNls.Fget(toStr("GOQRPLS-0124"), toStr("LIB"), toStr("Supplemental attributes cannot be entered before the new parent record is saved."));
		//  A table with Itemnames to Enable in the Supplemental Datablock
		private SdispItemsTabType sdispItemsTab = new SdispItemsTabType(C_SDISP_BLOCK.append(".GOVSDAV_VALUE_AS_CHAR"));
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pBlock
		*/
		public NString fBaseTable(NString pBlock)
		{
			if ( !pBlock.isNull() )
			{
				return upper(substring(isNull(getBlockQueryDataSourceName(pBlock), pBlock), toInt(1), toInt(30)));
			}
			return NString.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NBool fTrigEna()
		{
			ItemDescriptor lItem = findItem(C_SDKEY_TRIG_ENA);
			if ( (lItem == null) )
			{
				// return NULL. This form is not compiled with sde libraries
				return NBool.getNull();
			}
			return toBool(getNameIn(C_SDKEY_TRIG_ENA).equals("Y"));
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pBool
		*/
		public void pSetTrigEna(NBool pBool)
		{
			NString lVal= NString.getNull();
			if ( pBool.getValue() )
			{
				lVal = toStr("Y");
			}
			else if ( pBool.not() ) {
				lVal = toStr("N");
			}
			copy(lVal,C_SDKEY_TRIG_ENA);
		}
/* <p>
/* </p>
		*/
		public void pSetMenu(NString pBlock) {
			pSetMenu(pBlock, NBool.getNull(), NString.getNull());
		}

/* <p>
/* </p>
		* @param pEnabled
		*/
		public void pSetMenu(NString pBlock, NBool pEnabled) {
			pSetMenu(pBlock, pEnabled, NString.getNull());
		}

/* <p>
/* </p>
		* @param pEnabled
		* @param pHasSd
		*/
		public void pSetMenu(NString pBlock, NBool pEnabled, NString pHasSd)
		{
			if (pBlock.isNull())
				return;
			if ( !pEnabled.isNull())
			{
				BlockServices.findBlock(pBlock).addExtension(C_SDE_EXTENSION_ENABLED, toStr(pEnabled));					
			}
			if ( pHasSd.equals("Y") )
			{
				BlockServices.findBlock(pBlock).addExtension(C_SDE_EXTENSION_NAME, toStr("2"));
			}
			else if ( pHasSd.equals("N") ) {
				BlockServices.findBlock(pBlock).addExtension(C_SDE_EXTENSION_NAME, pEnabled.isFalse() && pEnabled.isNotNull() ? toStr("0") : toStr("1"));
			}
			else{
				if ( !pEnabled.isNull() && StringHelper.isNullOrEmpty(BlockServices.findBlock(pBlock).getExtension(C_SDE_EXTENSION_NAME)))
				{
					if (pEnabled.isTrue())
						BlockServices.findBlock(pBlock).addExtension(C_SDE_EXTENSION_NAME, toStr("1"));
					else
						BlockServices.findBlock(pBlock).addExtension(C_SDE_EXTENSION_NAME, toStr("0"));
						
				}
			}
		}
/* <p>
		*  Is Supplemental Data Enabled in current context?
/* </p>
		*/
		public NBool fSdEnabled()
		{
			WindowDescriptor lSdispWin = findWindow(C_SDISP_WIN);
			return toBool(!(lSdispWin == null) && toNumber(BlockServices.findBlock(TaskServices.getCurrentBlock()).getExtension(C_SDE_EXTENSION_NAME)).greater(0));
		}
/* <p>
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this function was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NBool fSdispWinVisible()
		{
			WindowDescriptor lSdispWin = findWindow(C_SDISP_WIN);
			if (!(lSdispWin == null) && getCurrentWindow().notEquals(lSdispWin.getId()))
				return  toBool(((NBool.False)));
			else
				return  toBool(((NBool.True)));
			//  80-12 clarify return
			//  orignal code following
			// RETURN 	NOT ID_NULL(l_sdisp_win)
			// AND GET_WINDOW_PROPERTY(l_sdisp_win,VISIBLE)=g$_frm.C_TRUE;
			// original code above 
//			if ( !(lSdispWin == null) && toBool(lSdispWin.getVisible()).equals(GFrm.C_TRUE) )
//			{
//				return  toBool(((NBool.True)));
//			}
//			else {
//				return  toBool(((NBool.False)));
//			}
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pTable
		* @param pBlock
		*/
		public void pNewRecord(NString pTable, NString pBlock)
		{
			NString lEx = toStr("N");
			NString lPkey= NString.getNull();
			if(TaskServices.getCurrentTask().getModel().getBusinessObject(pBlock.getValue()).getConfiguration().getItem(DAOConfiguration.MODEL_ROWID) != null){
				NString lRowid = getNameIn(pBlock.append(".ROWID"));
				NInteger lRownum= NInteger.getNull();
				DataRowStatus rowStatus = ((IDBBusinessObject)TaskServices.getCurrentTask().getModel().getBusinessObject(pBlock.getValue())).getRowAdapter().getRowState();
				if ( !lRowid.isNull() && !rowStatus.equals(DataRowStatus.INSERTED) )
				{
					try{
						// get the primary key for the current basetable record rowid      
						lPkey = GpGoksdif.fGetPk(pTable, lRowid);
					} catch (NoDataFoundException e){
						return;
					}
					// sets the primary key, used in view...
					GpGoksdif.pSetCurrentPk(lPkey);
					// check if supplemental data are associated with the current basetable record.
					lEx = GpGoksdif.fSdExists(pTable, lPkey);
					copy(lPkey,C_SDKEY_SD_KEY);
					copy(lRowid,C_SDKEY_SD_ROWID);
					copy(lEx,C_SDKEY_SD_EXISTS);

					pSetMenu(pBlock, toBool(null), lEx);
					return;
				}
			}
			{
				GpGoksdif.pSetCurrentPk(chr(1));
				copy(null,C_SDKEY_SD_KEY);
				copy(null,C_SDKEY_SD_ROWID);
				copy(null,C_SDKEY_SD_EXISTS);
			}
			pSetMenu(pBlock, toBool(null), lEx);
		}
/* <p>
/* </p>
		* @param pPropTrueFalse
		*/
		public void pSetSdBlockEnabled(NBool pPropTrueFalse)
		{
			for ( int i = sdispItemsTab.first().toInt32(); i <= sdispItemsTab.last().toInt32(); i++ )
			{
				setItemEnabled(sdispItemsTab.get(i), pPropTrueFalse);
				// IF p_prop_true_false=PROPERTY_TRUE THEN
				setItemNavigable(sdispItemsTab.get(i), pPropTrueFalse);
				setItemUpdateAllowed(sdispItemsTab.get(i), pPropTrueFalse);
			}
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void pNewBlock()
		{
			NString lBlock = getNameIn(GFrm.C_SYSTEM_CURRENT_BLOCK);
			NString lDispblock = getNameIn(C_SDKEY_SD_BLOCK);
			NString lTable = fBaseTable(lBlock);
			DeferredActionInformation lAction= null;

			lAction = getDeferredAction("WHEN-TIMER-EXPIRED", C_SD_BLOCK_TIMER_NAME);
			//  If we are invoked by the timer, kill it
			if ( !(lAction == null) )
			{
				removeDeferredAction(lAction);
			}
			if ( lBlock.equals(C_SDISP_BLOCK) )
			{
			}
			else if ( lBlock.notEquals(isNull(lDispblock, "#")) ) {
				//  moved status check (7.3 fix ftmorgn)
				copy(lTable,C_SDKEY_SD_BANTAB);
				copy(lBlock,C_SDKEY_SD_BLOCK);
				if ( getNameIn(GFrm.C_SYSTEM_RECORD_STATUS).equals(GFrm.C_QUERY) )
				{
					if ( fSdEnabled().getValue() )
					{
						//  only when sd enabled
						pNewRecord(lTable, lBlock);
						if ( fSdispWinVisible().getValue() )
						{
							pShowSd();
							goBlock(lBlock);
							doNavigation();
						}
					}
				}
			}
			else if ( lBlock.equals(lDispblock) ) {
				// navigating between blocks, entering in block for which SD are displayed.
				pSetMenu(lBlock, toBool(null), getNameIn(C_SDKEY_SD_EXISTS));
				//  Enable block when window is visible. 
				if ( fSdispWinVisible().getValue() )
				{
					pSetSdBlockEnabled(toBool(true));
				}
			}
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void pPreBlock()
		{
			DeferredActionInformation lAction = null;
			final NInteger C_DELAY = toInt(200);
			NInteger lRownum = NInteger.getNull();
			NString lBlock = NString.getNull();
			NString lCurblock = NString.getNull();
			// 
			if (fTrigEna().equals(NBool.True))//if (fTrigEna() == NBool.True) => evaluates to false
			{
				if (toStr(InteractionManager.getRequestState().getValue(GSd.C_SDKEY_SD_BLOCK.getValue())).isNotNull()){
					lCurblock = toStr(InteractionManager.getRequestState().getValue(GSd.C_SDKEY_SD_BLOCK.getValue()));
				}
				else
					lCurblock = getNameIn(GFrm.C_SYSTEM_CURRENT_BLOCK);
				if ( lCurblock.equals(C_SDISP_BLOCK) )
				{
					lBlock = getNameIn(C_SDKEY_SD_BLOCK);
					if ( !lBlock.isNull() )
					{
						lRownum = toInt(getBlockCurrentRecord(lBlock));
						if ( getRecordStatus(lBlock) == GFrm.C_NEW.toString() || getRecordStatus(lBlock) == GFrm.C_INSERT.toString())
						{
							errorMessage(C_CANNOT_ENTER_ERR);
							throw new ApplicationException();
						}
						else if ( getNameIn(C_SDKEY_SD_ROWID).isNull() ) {
							//  Refresh from basetable. 
							pNewRecord(fBaseTable(lBlock), lBlock);
						}
					}
				}
				else {
					if ( GbSdeTable.fExists(fBaseTable(lCurblock)).equals("Y") )
					{
						pSetMenu(lCurblock, toBool(true));
						//  Start a check if current record in block has supplemental data asynchronously
						//  (we are in a pre-block trigger and cannot execute restricted procedures
						//  like navigating to blocks)
						lAction = getDeferredAction("WHEN-TIMER-EXPIRED", C_SD_BLOCK_TIMER_NAME);
						if ( !(lAction == null) )
						{
							removeDeferredAction(lAction);
						}
						addDeferredAction("WHEN-TIMER-EXPIRED", C_SD_BLOCK_TIMER_NAME);
					}
					else {
						pSetMenu(lCurblock, toBool(false), toStr("N"));
						if ( fSdispWinVisible().getValue() )
						{
							//  no supplemental data, disable the window
							pSetSdBlockEnabled(toBool(false));
						}
					}
				}
			}
			else if (fTrigEna().equals(NBool.False))
			{
			}
			else {
				//  f_trig_ena IS NULL, meaning form was not compiled with SDE libs
				pSetMenu(getCurrentBlock(), toBool(false), toStr("N"));
			}
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void pPstBlock()
		{
		}
		

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void pWhenNewRecInst()
		{
			NString lBlock= NString.getNull();
			if ( fSdEnabled().getValue() && fTrigEna().getValue() )
			{
				lBlock = getNameIn(GFrm.C_SYSTEM_CURRENT_BLOCK);
				if ( lBlock.equals(getNameIn(C_SDKEY_SD_BLOCK)) )
				{
					//  Only synchronize SD when navigating in block with SD
					pNewRecord(fBaseTable(lBlock), lBlock);
					if ( fSdispWinVisible().getValue() )
					{
						if ( getNameIn(GFrm.C_SYSTEM_MODE).equals(GFrm.C_ENTER_QUERY))
						{
						}
						else {
							pShowSd();
							goBlock(lBlock);
						}
					}
				}
			}
		}
/* <p>
/* </p>
		*/
		public void pShowSd()
		{
			NString lBlock = getNameIn(GFrm.C_SYSTEM_CURRENT_BLOCK);
			NString lTable = fBaseTable(lBlock);
			NString lDispBlock = isNull(getNameIn(C_SDKEY_SD_DISPBLOCK), "#");
			NString lRowid = getNameIn(C_SDKEY_SD_ROWID);
			NString lDispRowid = isNull(getNameIn(C_SDKEY_SD_DISPROWID), "#");
			//  80-12 save calling block in order to match database access modes 
			callingBlockName = getNameIn(GFrm.C_SYSTEM_CURSOR_BLOCK);
			if ( getNameIn(GFrm.C_SYSTEM_RECORD_STATUS).notEquals(GFrm.C_QUERY) )
			{
				errorMessage(GNls.Fget(toStr("GOQRPLS-0127"), toStr("LIB"), toStr("No parent record for Supplemental Attributes exists.")));
				return ;
			}
			if ( lRowid.isNull() )
			{
				// 7.3 try to obtain rowid
				pNewRecord(lTable, lBlock);
				lRowid = getNameIn(C_SDKEY_SD_ROWID);
			}
			if ( lBlock.notEquals(lDispBlock) )
			{
				try
				{
					GpGoksdif.pInsertDisc(lTable);
				}
				catch(Exception  e)
				{
					getContainer().gDisplayErrMsg(errorMessage());
					throw new ApplicationException();
				}
				copy(lBlock,C_SDKEY_SD_DISPBLOCK);
			}
			if ( in(GFrm.C_FALSE.toLower(), getItemEnabled(sdispItemsTab.get(sdispItemsTab.first())).toString(), getItemUpdateAllowed(sdispItemsTab.get(sdispItemsTab.first())).toString()).getValue() )
			{
				pSetSdBlockEnabled(toBool(true));
			}
			showWindow(C_SDISP_WIN);
			
			if ( lRowid.isNull() )
			{
				//  We have no rowid, clear the block and display a status message
				copy(lRowid,C_SDKEY_SD_DISPROWID);
				pSetTrigEna(toBool(NBool.False));
				goBlock(C_SDISP_BLOCK);
				executeQuery();
				clearMessage();
				doFullNavigation();
				
				//  Needed for displaying the supplemental block.
				errorMessage(C_CANNOT_ENTER_ERR);
				goBlock(lBlock);
				doNavigation();
				pSetTrigEna(toBool(NBool.True));
			}
			else if ( lRowid.notEquals(lDispRowid) ) {
				copy(lRowid,C_SDKEY_SD_DISPROWID);
				goBlock(C_SDISP_BLOCK);
				doNavigation();
				executeQuery();
			}
			else {
				goBlock(C_SDISP_BLOCK);
				doNavigation();
			}
			//  80-12 add call to set SDE block to same access as calling block
			pSdeBlockAccessSet();
		}
/* <p>
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pDelayed
		*/
		public void pCloseSdeForm(NBool pDelayed)
		{
			DeferredActionInformation lAction = getDeferredAction("WHEN-TIMER-EXPIRED", C_SD_CLOSE_TIMER_NAME);
			if ( pDelayed.getValue() )
			{
				if ( (lAction == null) )
				{
					addDeferredAction("WHEN-TIMER-EXPIRED", C_SD_CLOSE_TIMER_NAME);
				}
			}
			else {
				if ( fSdispWinVisible().getValue() )
				{
					pCheckRequired();
					//  80-16 add one line following as an escape if a validation error is detected
					getContainer().gCheckFailure();
					if ( getNameIn(GFrm.C_SYSTEM_CURRENT_BLOCK).equals(C_SDISP_BLOCK) )
					{
						goBlock(getNameIn(C_SDKEY_SD_BLOCK));
						//  80-16 add one line following as an escape if a validation error is detected
						getContainer().gCheckFailure();
					}
					//  Make sure that block navigation does not pop up the SD window.
					pSetSdBlockEnabled(toBool(false));
					hideWindow(C_SDISP_WIN);
				}
				if ( !(lAction == null) )
				{
					removeDeferredAction(lAction);
				}
			}
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void pDispDisc()
		{
			NString lDisc = getNameIn(C_SDISP_BLOCK.append(".GOVSDAV_DISC"));
			NString lPrompt = getNameIn(C_SDISP_BLOCK.append(".GOVSDAV_ATTR_PROMPT"));
			NString lPromptdisp= NString.getNull();
			lPromptdisp = replace(lPrompt, "%DISC%", lDisc);
			copy(lPromptdisp,C_SDISP_BLOCK.append(".GOVSDAV_ATTR_PROMPT_DISP"));
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pMenu
		*/
		public void pMenuHandler(NString pMenu)
		{
			if (pMenu == C_LIGHTBULB_NAME)
			{
				pShowSd();
			}
			else if (pMenu == C_SD_MNU_NAME)
			{
				if ( fSdispWinVisible().getValue() )
				{
					clearMessage();
					// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
					pCloseSdeForm(/*pDelayed=>*/NBool.False);
				}
				else {
					pShowSd();
				}
			}
			else {
			}
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void pPostDml()
		{
			// Update the lightbulb.
			if ( getNameIn(C_SDKEY_C_NOT_NULL).equals(0) )
			{
				// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
				pSetMenu(toStr(nameIn(C_SDKEY_SD_DISPBLOCK)), toBool(/*pHasSd=>*/false));
			}
			else {
				// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
				pSetMenu(toStr(nameIn(C_SDKEY_SD_DISPBLOCK)), toBool(/*pHasSd=>*/true));
			}
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void pCheckRequired()
		{
			//  Validate item when current item is required
			if ( getNameIn(C_SDISP_ATTR_REQD_IND).equals("Y") )
			{
				validateCurrentItem();
			}
			if ( toNumber(getNameIn(C_SDKEY_C_REQD_IS_NULL)).greater(0) && toNumber(getNameIn(C_SDKEY_C_NOT_NULL)).greater(0) )
			{
				errorMessage(GNls.Fget(toStr("GOQRPLS-0132"), toStr("LIB"), toStr("Required Attributes need to be entered.")));
				throw new ApplicationException();
			}
			//  80-12 add call to reset block access
			pSdeBlockAccessReset();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void pEnterQuery()
		{
			NString lBlock = getNameIn(GFrm.C_SYSTEM_CURRENT_BLOCK);
			if ( lBlock.notEquals(C_SDISP_BLOCK) && fSdispWinVisible().isTrue() )
			{
				try { 
				MessageServices.setMessageLevel(MessageLevel.USER);
				GpGoksdif.pSetCurrentPk(chr(1));
				copy(null,C_SDKEY_SD_KEY);
				copy(null,C_SDKEY_SD_ROWID);
				copy(null,C_SDKEY_SD_DISPROWID);
				copy(null,C_SDKEY_SD_EXISTS);
				pSetTrigEna(toBool(NBool.False));
				goBlock(C_SDISP_BLOCK);
				doNavigation();
				executeQuery();
				doNavigation();
				goBlock(lBlock);
				doNavigation();
				pSetSdBlockEnabled(toBool(false));
				pSetTrigEna(toBool(NBool.True));
				pSetMenu(lBlock, toBool(null), toStr("N"));
							
				} finally {
							
				MessageServices.resetMessageLevel();
							
				}
							
			}
		}
/* <p>
		*  80-4
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void keyCommit()
		{
			commitTask();
			getContainer().gCheckFailure();
		}
/* <p>
		*  80-4
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void keyNxtblk()
		{
			getContainer().gInvalidFunctionMsg();
		}
/* <p>
		*  80-4
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void keyPrvblk()
		{
			getContainer().gInvalidFunctionMsg();
		}
/* <p>
		*  80-12 
		* 	Add procedures G$_SD.p_sde_block_access_set and G$_SD.p_sde_block_access_reset
		* 		to provide same database table access (update, insert and delete) 
		* 		to SDE block as calling block	for Tab Level Security functionality.		
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void pSdeBlockAccessSet()
		{
			BlockDescriptor gSdispBlockId = findBlock("G$_SDISP");
			BlockDescriptor callingBlockId = findBlock(callingBlockName);
			// 
			//  move access for Query and Inquiry forms from GOQOLIB block G$_SDIPSP trigger Pre-Form.
			if ( !(gSdispBlockId == null) )
			{
				if ((substring(getNameIn(GFrm.C_SYSTEM_CURRENT_FORM), toInt(3), toInt(1)).equals("Q") || substring(getNameIn(GFrm.C_SYSTEM_CURRENT_FORM), toInt(3), toInt(1)).equals("I") || (getNameIn(GFrm.C_SYSTEM_CURRENT_FORM)).equals("SOAIDEN") || (getNameIn(GFrm.C_SYSTEM_CURRENT_FORM)).equals("AOAIDEN") || (getNameIn(GFrm.C_SYSTEM_CURRENT_FORM)).equals("ROAIDEN") || (getNameIn(GFrm.C_SYSTEM_CURRENT_FORM)).equals("SOACOMP") || (getNameIn(GFrm.C_SYSTEM_CURRENT_FORM)).equals("AOACOMP")))
				{
					setBlockUpdateAllowed(gSdispBlockId, false);
					setBlockInsertAllowed(gSdispBlockId, false);
					setBlockDeleteAllowed(gSdispBlockId, false);
					//  80-15 avoid Tab Level Security if form is a query-only form by design
					return ;
				}
			}
			// 
			if ( !(callingBlockId == null) && !(gSdispBlockId == null) )
			{
				if ((getBlockUpdateAllowed(callingBlockId).equals("FALSE")))
				{
					setBlockUpdateAllowed(gSdispBlockId, false);
				}
				else if ((getBlockUpdateAllowed(callingBlockId).equals("TRUE"))) {
					setBlockUpdateAllowed(gSdispBlockId, true);
				}
				// 
				if ((getBlockInsertAllowed(callingBlockId).equals("FALSE")))
				{
					setBlockInsertAllowed(gSdispBlockId, false);
				}
				else if ((getBlockInsertAllowed(callingBlockId).equals("TRUE"))) {
					setBlockInsertAllowed(gSdispBlockId, true);
				}
				// 
				if ((getBlockDeleteAllowed(callingBlockId).equals("FALSE")))
				{
					setBlockDeleteAllowed(gSdispBlockId, false);
				}
				else if ((getBlockDeleteAllowed(callingBlockId).equals("TRUE"))) {
					setBlockDeleteAllowed(gSdispBlockId, true);
				}
			}
		}
/* <p>
		*  80-12 reset SDE data block access to synchronize with Tab Level Security	
		* F2J_STRONG_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void pSdeBlockAccessReset()
		{
			BlockDescriptor gSdispBlockId = findBlock("G$_SDISP");
			if ( !(gSdispBlockId == null) )
			{
				setBlockUpdateAllowed(gSdispBlockId, true);
				setBlockInsertAllowed(gSdispBlockId, true);
				setBlockDeleteAllowed(gSdispBlockId, true);
			}
		}
	
		public static class SdispItemsTabType extends NStringTable{	
			public SdispItemsTabType(NString... args)
			{
				super(args);
			}
		}
	
}
