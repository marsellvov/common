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
import morphis.foundations.core.appsupportlib.runtime.controlsModel.items.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.lovs.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.containers.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.alerts.*;
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

public class GVpdi extends AbstractSupportCodeObject {
	

	public GVpdi(ISupportCodeContainer container) {
		super(container);
		isvpdion = GVpdiSecurity.FgIsMifEnabled();
	}
	
	@Override
	public GoqrplsServices getContainer() {
		return (GoqrplsServices)super.getContainer();
	}
	//Original PL/SQL code for Package Prog Unit (SPEC) G$_VPDI
	/*
	PACKAGE G$_VPDI IS

  <multilinecomment>* 
    API For All Institutions LOV 
  *</multilinecomment>
  
  isVPDION  BOOLEAN := FALSE;
  
  <multilinecomment>Gets the Index</multilinecomment>
  FUNCTION F_GET_INDEX( letter VARCHAR2 ) RETURN NUMBER;
  
  <multilinecomment>Gets the Number of Parameters</multilinecomment>
  FUNCTION F_GET_COUNT_PARAMETERS( p_param_names_list VARCHAR2) RETURN NUMBER;
  
  <multilinecomment>Gets the Value</multilinecomment>
  FUNCTION F_GET_VALUE( string_v VARCHAR2) RETURN VARCHAR2;
  
  <multilinecomment>Gets the Form Item Name</multilinecomment>
  FUNCTION F_GET_ITEM_NAME( string_v VARCHAR2 ) RETURN VARCHAR2;
  
  <multilinecomment>Gets the Parameter Value</multilinecomment>
  FUNCTION F_GET_PARAMETER_VALUE( p_param_names_list VARCHAR2, posn NUMBER ) RETURN VARCHAR2;
  
  <multilinecomment>Checks if Metadata LOV exists for the Form</multilinecomment>
  FUNCTION F_EXISTING_VPDI_LOV( form_name VARCHAR2 ) RETURN BOOLEAN;
  
  <multilinecomment>Main Procedure to handle All Institutions LOV</multilinecomment>
  PROCEDURE P_SELECT_VPDI_DATA;
  
  
  <multilinecomment>* 
  || API For Banner VPDI Component 
  *</multilinecomment>
  
  <multilinecomment>Removes the VPDI value from a stack.</multilinecomment>
  PROCEDURE DELETE_VPDI( form_name VARCHAR2 );
  
  <multilinecomment>Adds VPDI entry for the Form on every access ( called from G$_VERIFY_ACCESS Trigger )</multilinecomment>
  PROCEDURE FILL_GROUP_VPDI( form_name VARCHAR2, vpdi_code VARCHAR2);
  
  <multilinecomment>Adds VPDI entry for the Form for the first time a Form is called - start of stack ( called from G$_SECURED_FORM_CALL_PL Procedure )</multilinecomment>
  PROCEDURE FILL_GROUP_VPDI_NEW( form_name VARCHAR2, vpdi_code VARCHAR2);
  
  <multilinecomment>Finds the current VPDI for the form</multilinecomment>
  FUNCTION FIND_VPDI(form_name VARCHAR2) return VARCHAR2;
  
  <multilinecomment>Removes the state of the current open form on exit ( called from G$_GOQOLIB_KEY_TRIGGER.KEY_EXIT Procedure )</multilinecomment>
  PROCEDURE DO_VPDI_GLOBAL_ON_EXIT;
  --
  --
  <multilinecomment>Sets the VPDI on initialization ( called from G$_SECURED_FORM_CALL_PL Procedure )</multilinecomment>
  PROCEDURE SET_VPDI_ON_INIT( form_name VARCHAR2, vpdi_code VARCHAR2 );
  
  <multilinecomment>Sets the VPDI context</multilinecomment>
  PROCEDURE SET_VPDI_CONTEXT( vpdi_code VARCHAR2 );
  
  <multilinecomment>Sets the VPDI for the Form on every access ( called from G$_VERIFY_ACCESS Trigger )</multilinecomment>
  PROCEDURE SET_VPDI_ON_ACCESS;
  
  <multilinecomment>Sets the VPDI on change</multilinecomment>
  PROCEDURE SET_VPDI_ON_CHANGE( vpdi_code VARCHAR2 );
  
  <multilinecomment>Updates the Main Menu Form Title Bar (GUAGMNU)</multilinecomment>
  PROCEDURE SET_MAIN_MENU_WINDOW_TITLE_VPD;
  --
  --
  <multilinecomment>Returns the VPDI condition</multilinecomment>
  FUNCTION IS_VPDI_ON RETURN BOOLEAN;
  
  <multilinecomment>Returns the Current VPDI for Integration</multilinecomment>
  FUNCTION GET_CURRENT_VPDI RETURN VARCHAR2 ;
  --
  --
  <multilinecomment>Calls on POST_FORM Trigger </multilinecomment>
  PROCEDURE POST_FORM;
  
  <multilinecomment> Calls on REVOKE_ACCESS Trigger </multilinecomment>
  PROCEDURE REVOKE_ACCESS;
  
  <multilinecomment> Release VPDI security settings for LOV - All Institutions </multilinecomment>
  PROCEDURE RELEASE_VPDI_FOR_ALL;
  
  <multilinecomment> Call VPDI Component </multilinecomment>
  PROCEDURE CALL_VPDI_COMPONENT;
  
  <multilinecomment> Sets VPDI Memu </multilinecomment>
  PROCEDURE SET_VPDI_MENU;
  
  <multilinecomment> CANCEL button API </multilinecomment>
  PROCEDURE CANCEL_VPDI_SELECTION;
  
  <multilinecomment> OK button API </multilinecomment>
  PROCEDURE SAVE_VPDI_SELECTION;

  <multilinecomment> Defines the boolean condition if the Form has a Process Context available </multilinecomment>
  FUNCTION IS_FORM_VPDI_ENABLED( form_name VARCHAR2 ) RETURN BOOLEAN;
END;
	*/
	
			// *
		// API For All Institutions LOV
		// *
		public NBool isvpdion = toBool(NBool.False);

			
		//Original PL/SQL code for Package Prog Unit (BODY) G$_VPDI
		/*
		PACKAGE BODY G$_VPDI IS
--
-- Local Function to Determine Workwlow Condition
--
  FUNCTION IS_F5_ON RETURN BOOLEAN IS
    lv_view_id  VIEWPORT  := FIND_VIEW('G$_NAV_CANVAS'); 
  BEGIN
    IF NOT ID_NULL(lv_view_id) THEN
      IF GET_VIEW_PROPERTY(lv_view_id,VISIBLE) = 'TRUE' THEN
        RETURN TRUE;
      ELSE
        RETURN FALSE;
      END IF;
    END IF;
  END IS_F5_ON;
--
--
  FUNCTION IS_WF_ACTIVITY RETURN BOOLEAN IS
    vcStackValue  VARCHAR2(256);
    bolReturn     BOOLEAN;
  BEGIN
    vcStackValue := NVL(NAME_IN('GLOBAL.WF_ACTIVITY'),'N');
--
    bolReturn := (SUBSTR(vcStackValue,-1) = 'W' OR
                  SUBSTR(vcStackValue,-1) = 'Q');
--
    RETURN bolReturn;
  END IS_WF_ACTIVITY;
--
--
  FUNCTION GET_MAX_SEQ(form_name VARCHAR2) RETURN NUMBER IS
    group_id        RECORDGROUP;
    hold_seq        PLS_INTEGER := 0;
    row_count       PLS_INTEGER;
    hold_form_name  VARCHAR2(7);
--
  BEGIN
    group_id := FIND_GROUP('VPDI_GRP');
--
    IF NOT ID_NULL(group_id) THEN
      row_count := GET_GROUP_ROW_COUNT(group_id);  -- count number of records in array
--
      FOR i IN 1..row_count LOOP
        hold_form_name := GET_GROUP_CHAR_CELL('VPDI_GRP.FORM_NAME', i);
--
        IF hold_form_name = form_name THEN
          hold_seq := GET_GROUP_NUMBER_CELL('VPDI_GRP.SEQ', i);
        END IF;
      END LOOP;
--
    END IF;
--
    RETURN hold_seq;
  END GET_MAX_SEQ;
--
--
  FUNCTION F_GET_INDEX(letter VARCHAR2) RETURN NUMBER IS
  BEGIN
    CASE UPPER(letter)
      WHEN 'A'   THEN RETURN 1;
      WHEN 'B'   THEN RETURN 2;
      WHEN 'C'   THEN RETURN 3;
      WHEN 'D'   THEN RETURN 4;
      WHEN 'E'   THEN RETURN 5;
      WHEN 'F'   THEN RETURN 6;
      WHEN 'G'   THEN RETURN 7;
      WHEN 'H'   THEN RETURN 8;
      WHEN 'I'   THEN RETURN 9;
      WHEN 'J'   THEN RETURN 10;
      WHEN 'A$'  THEN RETURN 11;
      WHEN 'B$'  THEN RETURN 12;
      ELSE            RETURN NULL;
    END CASE;
  END F_GET_INDEX;
--
--
  FUNCTION F_GET_COUNT_PARAMETERS(p_param_names_list VARCHAR2) RETURN NUMBER IS
    v_loc      PLS_INTEGER;
    v_startloc PLS_INTEGER := 1;
    delim      VARCHAR2(2) := '::';
    v_item     VARCHAR2(100);
    count_v    PLS_INTEGER := 0;
--
  BEGIN
    LOOP
      v_loc := INSTR(p_param_names_list, delim, v_startloc);
--
      IF v_loc = v_startloc THEN
        v_item := NULL;
      ELSIF v_loc = 0 THEN
        v_item := SUBSTR(p_param_names_list, v_startloc);
      ELSE
        v_item := SUBSTR(p_param_names_list, v_startloc, v_loc - v_startloc);
      END IF;
--
      count_v := count_v + 1;
--
      IF v_loc = 0 THEN
        EXIT;
      ELSE
        v_startloc := v_loc + 2;
      END IF;
    END LOOP;
--
    RETURN count_v;
  END F_GET_COUNT_PARAMETERS;
--
--
  FUNCTION F_GET_VALUE(string_v VARCHAR2) RETURN VARCHAR2 IS
  BEGIN
    RETURN SUBSTR(string_v, 1, INSTR(string_v,'=') -1);
  END F_GET_VALUE;
--
--
  FUNCTION F_GET_ITEM_NAME(string_v VARCHAR2) RETURN VARCHAR2 IS
  BEGIN
    RETURN SUBSTR(string_v, INSTR(string_v, '=') +1);
  END F_GET_ITEM_NAME;
--
--
  FUNCTION F_GET_PARAMETER_VALUE(p_param_names_list VARCHAR2, posn NUMBER) RETURN VARCHAR2 IS
--
    v_loc      PLS_INTEGER;
    v_startloc PLS_INTEGER := 1;
--
    delim      VARCHAR2(2) := '::';
    v_item     VARCHAR2(100);
    count_v    PLS_INTEGER := 0;
--
    v_1        VARCHAR2(100);
    v_2        VARCHAR2(100);
    v_3        VARCHAR2(100);
    v_4        VARCHAR2(100);
    v_5        VARCHAR2(100);
    v_6        VARCHAR2(100);
    v_7        VARCHAR2(100);
    v_8        VARCHAR2(100);
    v_9        VARCHAR2(100);
    v_10       VARCHAR2(100);
    v_11       VARCHAR2(100);
    v_12       VARCHAR2(100);
--
  BEGIN
    LOOP
      v_loc := INSTR(p_param_names_list, delim, v_startloc);
--
      IF v_loc = v_startloc THEN
        v_item := NULL;
      ELSIF v_loc = 0 THEN
        v_item := SUBSTR(p_param_names_list, v_startloc);
      ELSE
        v_item := SUBSTR(p_param_names_list, v_startloc, v_loc - v_startloc);
      END IF;
--
      count_v := count_v + 1;
--
      CASE count_v
        WHEN 1  THEN v_1  := v_item;
        WHEN 2  THEN v_2  := v_item;
        WHEN 3  THEN v_3  := v_item;
        WHEN 4  THEN v_4  := v_item;
        WHEN 5  THEN v_5  := v_item;
        WHEN 6  THEN v_6  := v_item;
        WHEN 7  THEN v_7  := v_item;
        WHEN 8  THEN v_8  := v_item;
        WHEN 9  THEN v_9  := v_item;
        WHEN 10 THEN v_10 := v_item;
        WHEN 11 THEN v_11 := v_item;
        WHEN 12 THEN v_12 := v_item;
        ELSE NULL;
      END CASE;
--
      IF v_loc = 0 THEN
        EXIT;
      ELSE
        v_startloc := v_loc + 2;
      END IF;
    END LOOP;
--
    CASE posn
      WHEN 1  THEN RETURN   v_1;
      WHEN 2  THEN RETURN   v_2;
      WHEN 3  THEN RETURN   v_3;
      WHEN 4  THEN RETURN   v_4;
      WHEN 5  THEN RETURN   v_5;
      WHEN 6  THEN RETURN   v_6;
      WHEN 7  THEN RETURN   v_7;
      WHEN 8  THEN RETURN   v_8;
      WHEN 9  THEN RETURN   v_9;
      WHEN 10 THEN RETURN  v_10;
      WHEN 11 THEN RETURN  v_11;
      WHEN 12 THEN RETURN  v_12;
    END CASE;
--
  END F_GET_PARAMETER_VALUE;
--
--
  FUNCTION F_EXISTING_VPDI_LOV(form_name VARCHAR2) RETURN BOOLEAN IS
    cursor_id   BOOLEAN := FALSE;
    hold_value  VARCHAR2(1);
--
    CURSOR IS_EXIST(cp_form_name VARCHAR2) IS
      SELECT 'X'
        FROM GORRSQL
       WHERE GORRSQL_SQPR_CODE = 'VPD'
         AND GORRSQL_SQRU_CODE = cp_form_name
         AND GORRSQL_ACTIVE_IND = 'Y';
  BEGIN
    OPEN IS_EXIST(form_name);
    FETCH IS_EXIST INTO hold_value;
    cursor_id := IS_EXIST%FOUND;
    CLOSE IS_EXIST;
    RETURN cursor_id;
  END F_EXISTING_VPDI_LOV;
--
--
  PROCEDURE P_SELECT_VPDI_DATA IS
    result                   PLS_INTEGER;
    thequery                 VARCHAR2(4000);
    a_value_chosen           BOOLEAN;
    hold_title_name          VARCHAR2(100);
    pidm_item                VARCHAR2(61);
    hold_value               VARCHAR2(2000);
--
    CURSOR GET_SQL(cp_form_name VARCHAR2) IS
      SELECT GORRSQL_PARSED_SQL
        FROM GORRSQL
       WHERE GORRSQL_SQPR_CODE = 'VPD'
         AND GORRSQL_SQRU_CODE = cp_form_name
         AND GORRSQL_ACTIVE_IND = 'Y';
--
  BEGIN
-- Release VPDI Security settings for All Institutions
    RELEASE_VPDI_FOR_ALL;
--
    OPEN GET_SQL(GET_APPLICATION_PROPERTY(FORM_NAME));
    FETCH GET_SQL INTO thequery;
    CLOSE GET_SQL;
--
    IF INSTR(thequery, ':PIDM_VPD') > 1 THEN
      pidm_item := SUBSTR(thequery, INSTR(thequery,'<') + 1,
                            INSTR(thequery,'>') - INSTR(thequery,'<') - 1);
      thequery := REPLACE(thequery, '<'||SUBSTR(thequery, INSTR(thequery,'<') + 1,
    	                      INSTR(thequery,'>') - INSTR(thequery,'<') - 1) || '>','');
      thequery := REPLACE(thequery, ':PIDM_VPD', NAME_IN( pidm_item ));
    END IF;
--
    thequery := REPLACE(thequery, ''':1''', ''''|| NAME_IN('G$_VPDI_BLOCK.VPDI_CODE') ||'''');
--
    result := POPULATE_GROUP_WITH_QUERY('G$_VPDI_ALL_RG', thequery);
--
    IF result = 0 THEN
      hold_title_name := GET_GROUP_CHAR_CELL('G$_VPDI_ALL_RG.A$',1);
--
      FOR i IN 1..10 LOOP
        SET_LOV_COLUMN_PROPERTY('G$_VPDI_ALL_LOV', i , TITLE, F_GET_PARAMETER_VALUE(hold_title_name, i));
        IF F_GET_PARAMETER_VALUE(hold_title_name, i) = 'NONE' THEN
          SET_LOV_COLUMN_PROPERTY('G$_VPDI_ALL_LOV', i, WIDTH, 0);
        END IF;
      END LOOP;
--
      SET_LOV_COLUMN_PROPERTY('G$_VPDI_ALL_LOV', 11, WIDTH, 0); -- Titles
      SET_LOV_COLUMN_PROPERTY('G$_VPDI_ALL_LOV', 12, WIDTH, 0); -- Metadata Mappings
--
      a_value_chosen := SHOW_LOV('G$_VPDI_ALL_LOV');
--
-- Process
--
      IF a_value_chosen THEN
        hold_value := NAME_IN('G$_VPDI_BLOCK.VPDI_HOLD_VALUE');
        FOR x IN 1..F_GET_COUNT_PARAMETERS(hold_value) LOOP
          COPY(F_GET_VALUE(F_GET_PARAMETER_VALUE(hold_value, x)),
               F_GET_ITEM_NAME(F_GET_PARAMETER_VALUE(hold_value, x)));
        END LOOP;
--
        SET_VPDI_ON_CHANGE(NAME_IN('G$_VPDI_BLOCK.VPDI_CODE'));
--
        SET_WINDOW_PROPERTY('G$_VPDI_WINDOW',VISIBLE,PROPERTY_OFF);
        GO_ITEM(NAME_IN('G$_VPDI_BLOCK.VPDI_SELECT_ITEM'));
--
        DO_KEY('CLEAR_FORM');
        G$_CHECK_FAILURE;
--
      ELSE
        COPY(FIND_VPDI(GET_APPLICATION_PROPERTY(FORM_NAME)), 'G$_VPDI_BLOCK.VPDI_CODE');
        SET_VPDI_CONTEXT(NAME_IN('G$_VPDI_BLOCK.VPDI_CODE'));
      END IF;
--
    ELSE
     	MESSAGE(G$_NLS.Get('GOQRPLS-0177','LIB','No Data available'));
      COPY(FIND_VPDI(GET_APPLICATION_PROPERTY(FORM_NAME)), 'G$_VPDI_BLOCK.VPDI_CODE');
      SET_VPDI_CONTEXT(NAME_IN('G$_VPDI_BLOCK.VPDI_CODE'));
    END IF;
--
  END P_SELECT_VPDI_DATA;
--
--
  PROCEDURE DELETE_VPDI(form_name VARCHAR2) IS
    group_id  RECORDGROUP;
    max_seq   PLS_INTEGER;
--
  BEGIN
    group_id := FIND_GROUP('VPDI_GRP');
--
    IF NOT ID_NULL(group_id) THEN
      max_seq := GET_MAX_SEQ(form_name);
      IF max_seq > 0 THEN
        DELETE_GROUP_ROW(group_id, max_seq);
      END IF;
    END IF;
  END DELETE_VPDI;
--
--
  PROCEDURE FILL_GROUP_VPDI(form_name VARCHAR2, vpdi_code VARCHAR2) IS
    group_id RECORDGROUP;
  BEGIN
    group_id := FIND_GROUP('VPDI_GRP');
--
    IF NOT ID_NULL(group_id) THEN
      SET_GROUP_CHAR_CELL('VPDI_GRP.VPDI_CODE', GET_MAX_SEQ(form_name), vpdi_code);
    END IF;
  END FILL_GROUP_VPDI;
--
--
  PROCEDURE FILL_GROUP_VPDI_NEW(form_name VARCHAR2, vpdi_code VARCHAR2) IS
    group_id        RECORDGROUP;
    col_id          GROUPCOLUMN;
    row_count       PLS_INTEGER;
--
  BEGIN
--
-- Call this Procedure only when VPDI is ON
--
    IF NAME_IN('GLOBAL.INSTITUTION_CODE') IS NULL THEN
      RETURN;
    END IF;
--
    group_id := FIND_GROUP('VPDI_GRP');
--
-- create new array
--
    IF ID_NULL(group_id) THEN
      group_id := CREATE_GROUP('VPDI_GRP', GLOBAL_SCOPE);
      col_id := ADD_GROUP_COLUMN(group_id,'seq', NUMBER_COLUMN);
      col_id := ADD_GROUP_COLUMN(group_id,'form_name', CHAR_COLUMN, 10);
      col_id := ADD_GROUP_COLUMN(group_id,'vpdi_code', CHAR_COLUMN, 10);
    END IF;
--
-- Get count of records in array and increment by one
--
    row_count := GET_GROUP_ROW_COUNT(group_id) + 1;  
    ADD_GROUP_ROW(group_id,row_count);
--
    SET_GROUP_NUMBER_CELL('VPDI_GRP.SEQ',row_count, row_count);
    SET_GROUP_CHAR_CELL('VPDI_GRP.FORM_NAME',row_count, form_name);
    SET_GROUP_CHAR_CELL('VPDI_GRP.VPDI_CODE',row_count, vpdi_code);
  END FILL_GROUP_VPDI_NEW;
--
--
  FUNCTION FIND_VPDI(form_name VARCHAR2) RETURN VARCHAR2 IS
    group_id        RECORDGROUP;
    vpdi            VARCHAR2(10);
--
  BEGIN
    IF form_name = 'GUAGMNU' THEN
      RETURN NAME_IN('GLOBAL.INSTITUTION_CODE');
    END IF;
--
    IF NOT IS_FORM_VPDI_ENABLED( form_name ) THEN
      RETURN G$_VPDI_SECURITY.G$_VPDI_GET_INST_CODE_FNC;
    END IF;
--
    group_id := FIND_GROUP('VPDI_GRP');
    IF NOT ID_NULL(group_id) THEN
      vpdi := GET_GROUP_CHAR_CELL('VPDI_GRP.VPDI_CODE', GET_MAX_SEQ(form_name));
      RETURN vpdi;
    END IF;
--
    RETURN NULL;
  END FIND_VPDI;
--
-- Call this Procedure only when VPDI is ON
--
  PROCEDURE DO_VPDI_GLOBAL_ON_EXIT IS
    item_id       ITEM;
    lv_form_name  VARCHAR2(30);
    lv_vpdi       VARCHAR2(10);
  BEGIN
    IF NAME_IN('GLOBAL.INSTITUTION_CODE') IS NULL THEN
      RETURN;
    END IF;
--
    lv_form_name := NAME_IN('SYSTEM.CURRENT_FORM');
    IF NOT IS_FORM_VPDI_ENABLED( lv_form_name ) THEN
      RETURN;
    END IF;
--
    item_id := FIND_ITEM('G$_VPDI_BLOCK.VPDI_CODE');
    IF NOT ID_NULL(item_id) THEN
      lv_vpdi := FIND_VPDI(lv_form_name);
      IF lv_vpdi IS NOT NULL THEN
        COPY(lv_vpdi, 'GLOBAL.INSTITUTION_CODE');
        DELETE_VPDI(lv_form_name);
      END IF;
    END IF;
  END DO_VPDI_GLOBAL_ON_EXIT;
--
--
  PROCEDURE SET_VPDI_CONTEXT(vpdi_code VARCHAR2) IS
  BEGIN
    GOKVPDA.P_SET_VPDI_FOR_QUERY(vpdi_code);
  END SET_VPDI_CONTEXT;
--
-- Call this Procedure only when VPDI is ON
--
  PROCEDURE SET_VPDI_ON_ACCESS IS
    item_id       ITEM;
    cur_frm       VARCHAR2(30);
    lv_vpdi_code  VARCHAR2(30);
  BEGIN
    IF NOT IS_VPDI_ON THEN
      RETURN;
    END IF;
--
    G$_VPDI.SET_VPDI_MENU;
--
    cur_frm := NAME_IN('SYSTEM.CURRENT_FORM');
    IF NOT IS_FORM_VPDI_ENABLED( cur_frm ) THEN
      SET_VPDI_CONTEXT( G$_VPDI_SECURITY.G$_VPDI_GET_INST_CODE_FNC );
      RETURN;
    END IF;
--
    item_id := FIND_ITEM('G$_VPDI_BLOCK.VPDI_CODE');
    IF NOT ID_NULL(item_id) THEN
      lv_vpdi_code := NAME_IN('G$_VPDI_BLOCK.VPDI_CODE');
      IF lv_vpdi_code IS NULL THEN
        lv_vpdi_code := FIND_VPDI(cur_frm);
        COPY(lv_vpdi_code, 'G$_VPDI_BLOCK.VPDI_CODE');
      END IF;
--
      SET_VPDI_CONTEXT(lv_vpdi_code);
    END IF;
  END SET_VPDI_ON_ACCESS;
--
--
  PROCEDURE SET_VPDI_ON_CHANGE(vpdi_code VARCHAR2) IS
    lv_vpdi_code  VARCHAR2(30) := NAME_IN('G$_VPDI_BLOCK.VPDI_CODE');
  BEGIN
    FILL_GROUP_VPDI(GET_APPLICATION_PROPERTY(FORM_NAME), lv_vpdi_code);
    COPY(lv_vpdi_code,'GLOBAL.INSTITUTION_CODE');
    SET_VPDI_CONTEXT(lv_vpdi_code);
  END SET_VPDI_ON_CHANGE;
--
--
  PROCEDURE SET_VPDI_ON_INIT(form_name VARCHAR2, vpdi_code VARCHAR2) IS
  BEGIN
    IF (IS_VPDI_ON AND IS_FORM_VPDI_ENABLED( form_name )) THEN
     	FILL_GROUP_VPDI_NEW(form_name, vpdi_code);
    END IF;
  END SET_VPDI_ON_INIT;
--
--
  PROCEDURE SET_MAIN_MENU_WINDOW_TITLE_VPD IS
    win_title    VARCHAR2(250);
    event_win    VARCHAR2(60);
    cur_form     VARCHAR2(60);
    db_inst      VARCHAR2(20);
    cur_rel      VARCHAR2(20);
    vpdi_value   VARCHAR2(20);
    mod_id_value VARCHAR2(30);
    qf_status    VARCHAR2(60);
--
  BEGIN
    IF NOT IS_VPDI_ON THEN
      RETURN;
    END IF;
--
    event_win  := NAME_IN('SYSTEM.EVENT_WINDOW');
    cur_form   := NAME_IN('SYSTEM.CURRENT_FORM');
    db_inst    := NAME_IN('GLOBAL.INST');
    cur_rel    := NAME_IN('CURRENT_RELEASE');
    vpdi_value := NAME_IN('GLOBAL.DEFAULT_INSTITUTION_CODE');
--
    SET_WINDOW_PROPERTY('MAIN_WINDOW',TITLE,'General Menu');
    win_title := GET_WINDOW_PROPERTY('MAIN_WINDOW', TITLE);
--
-- Append the form name, release number and the inst global to the title.
--
    IF INSTR(win_title,cur_form) <= 0 THEN
      IF G$_TOOLBAR.READ_VALUE('FORM_NAME') = 'YES' THEN
        win_title := win_title || '  ' || cur_form;
      END IF;
    END IF;
--
    IF INSTR(win_title,cur_rel) <= 0 THEN
      IF G$_TOOLBAR.READ_VALUE('RELEASE') = 'YES' THEN
        win_title := win_title || '  ' || cur_rel;
      END IF;
    END IF;
--
    IF NOT ID_NULL(FIND_ITEM('FORM_HEADER.MOD_ID')) THEN
      mod_id_value := NAME_IN('FORM_HEADER.MOD_ID');
      IF INSTR(win_title,'[' || mod_id_value || ']') <= 0 THEN
        IF G$_TOOLBAR.READ_VALUE('RELEASE') = 'YES' THEN
          IF mod_id_value IS NOT NULL THEN
            win_title := win_title || '  [' || mod_id_value || ']';
          END IF;
        END IF;
      END IF;
    END IF;
--
    IF db_inst IS NOT NULL THEN
      db_inst := '(' || db_inst || ')';
      IF INSTR(win_title,db_inst) <= 0 THEN
        IF G$_TOOLBAR.READ_VALUE('DBASE_INST') = 'YES' THEN
          win_title := win_title || '  ' || db_inst;
        END IF;
      END IF;
    END IF;
--
    IF vpdi_value IS NOT NULL THEN
      vpdi_value := '(' || vpdi_value || ')';
      IF INSTR(win_title,vpdi_value) <= 0 THEN
        IF G$_TOOLBAR.READ_VALUE('DBASE_INST') = 'YES' THEN
          win_title := win_title || '  ' || vpdi_value;
        END IF;
      END IF;
    END IF;
--
-- Add on quick flow status.
--
    qf_status := NAME_IN('GLOBAL.QF_STATUS');
    IF qf_status IS NOT NULL THEN
      IF INSTR(win_title,qf_status) <= 0 THEN
        win_title := win_title || '  ' || qf_status;
      END IF;
    END IF;
--
    SET_WINDOW_PROPERTY('MAIN_WINDOW',TITLE,win_title);
  END SET_MAIN_MENU_WINDOW_TITLE_VPD;
--
--
  FUNCTION IS_VPDI_ON RETURN BOOLEAN IS
  BEGIN
    RETURN isVPDION;
  END IS_VPDI_ON;
--
--
  FUNCTION GET_CURRENT_VPDI RETURN VARCHAR2 IS
    item_id ITEM := FIND_ITEM('G$_VPDI_BLOCK.VPDI_CODE');
  BEGIN
    IF NOT ID_NULL(item_id) THEN
      IF NAME_IN('G$_VPDI_BLOCK.VPDI_CODE') IS NOT NULL THEN
        RETURN NAME_IN('G$_VPDI_BLOCK.VPDI_CODE');
      ELSE
        RETURN FIND_VPDI(GET_APPLICATION_PROPERTY(FORM_NAME));
      END IF;
    ELSE
      RETURN NAME_IN('GLOBAL.INSTITUTION_CODE');
    END IF;
  END GET_CURRENT_VPDI;
--
--
  PROCEDURE POST_FORM IS
  BEGIN
    IF IS_VPDI_ON THEN
      GOKVPDA.p_set_vpdi_off_process_context();
    END IF;
  END POST_FORM;
--
--
  PROCEDURE REVOKE_ACCESS IS
  BEGIN
    IF IS_VPDI_ON THEN
      GOKVPDA.p_set_vpdi_off_process_context();
    END IF;
  END REVOKE_ACCESS;
--
--
  PROCEDURE RELEASE_VPDI_FOR_ALL IS
  BEGIN
    GOKVPDA.p_set_vpdi_for_query_all;
  END RELEASE_VPDI_FOR_ALL;
--
--
  PROCEDURE CALL_VPDI_COMPONENT IS
    check_keys_item  ITEM;
    item_id          ITEM;
    lv_curr_form     VARCHAR2(30);
    lv_recs_exist    VARCHAR2(1);
--
    CURSOR do_vpdi_exist_c (cp_form_name VARCHAR2) IS
      SELECT 'Y'
        FROM GOBVPDI
       WHERE GOBVPDI_OBJECT = cp_form_name;
<multilinecomment> BD MEP </multilinecomment>
<multilinecomment> No need for this code since the function IS_VPDI_ON has already done the check </multilinecomment>
--         AND EXISTS
--               (SELECT 'X'
--                  FROM GTVVPDI);
<multilinecomment> ED MEP </multilinecomment>
--
  BEGIN
    IF NOT IS_VPDI_ON THEN
      G$_INVALID_FUNCTION_MSG;
      RAISE FORM_TRIGGER_FAILURE;
    END IF;
--
-- DO NOT INVOKE the VPDI Component if part of a WORKFLOW or F5 is open
--
    IF (IS_WF_ACTIVITY OR IS_F5_ON) THEN
      G$_INVALID_FUNCTION_MSG;
      RAISE FORM_TRIGGER_FAILURE;
    END IF;
--
    check_keys_item := FIND_ITEM('CHECK_KEYS');
    item_id         := FIND_ITEM('G$_VPDI_BLOCK.VPDI_CODE');
    lv_curr_form    := NAME_IN('SYSTEM.CURRENT_FORM');
--
    OPEN do_vpdi_exist_c(lv_curr_form);
    FETCH do_vpdi_exist_c INTO lv_recs_exist;
    CLOSE do_vpdi_exist_c;
--
    IF NVL(lv_recs_exist,'N') = 'N' THEN
      G$_INVALID_FUNCTION_MSG;
      RAISE FORM_TRIGGER_FAILURE;
    END IF;
--
    IF ID_NULL(item_id) THEN
      RETURN;
    END IF;
--
-- Check for pending changes in the block and don't invoke if there are any.
--
    IF NAME_IN('SYSTEM.FORM_STATUS') = 'CHANGED' THEN
      MESSAGE(G$_NLS.Get('GOQRPLS-0178','LIB','*ERROR* There are pending form changes; Commit or Rollback.'));
      RAISE FORM_TRIGGER_FAILURE;
    END IF;
--
    COPY(NAME_IN('SYSTEM.CURSOR_ITEM'),'G$_VPDI_BLOCK.VPDI_SELECT_ITEM');
    SET_ITEM_PROPERTY('G$_VPDI_BLOCK.VPDI_CODE',ENABLED,PROPERTY_ON);
    SET_ITEM_PROPERTY('G$_VPDI_BLOCK.VPDI_CANCEL_BTN',ENABLED,PROPERTY_ON);
    SET_ITEM_PROPERTY('G$_VPDI_BLOCK.VPDI_OK_BTN',ENABLED,PROPERTY_ON);
--
    SET_FORM_PROPERTY(lv_curr_form,VALIDATION,PROPERTY_OFF);
-- 
    IF G$_VPDI.F_EXISTING_VPDI_LOV(lv_curr_form) THEN
      SET_ITEM_PROPERTY('G$_VPDI_BLOCK.VPDI_OTHER_INSTITUTIONS', VISIBLE, PROPERTY_ON);
      SET_ITEM_PROPERTY('G$_VPDI_BLOCK.VPDI_OTHER_INSTITUTIONS', ENABLED, PROPERTY_ON);
    END IF;
--
    GO_ITEM('G$_VPDI_BLOCK.VPDI_CODE');
    NEXT_ITEM;
    PREVIOUS_ITEM;
--
    IF NOT ID_NULL(check_keys_item) THEN
      COPY('N', 'CHECK_KEYS');
    END IF;
--
  END CALL_VPDI_COMPONENT;
--
--
  PROCEDURE SET_VPDI_MENU IS
    lv_recs_exist    VARCHAR2(1);
--
    CURSOR do_vpdi_exist_c (cp_form_name VARCHAR2) IS
      SELECT 'Y'
        FROM GOBVPDI
       WHERE GOBVPDI_OBJECT = cp_form_name;
<multilinecomment> BD MEP </multilinecomment>
<multilinecomment> No need for this code since the function IS_VPDI_ON has already done the check </multilinecomment>
--         AND EXISTS
--               (SELECT 'X'
--                  FROM GTVVPDI);
<multilinecomment> ED MEP </multilinecomment>
--
  BEGIN
    IF NOT IS_VPDI_ON THEN
      RETURN;
    END IF;
--
    OPEN do_vpdi_exist_c(GET_APPLICATION_PROPERTY(FORM_NAME));
    FETCH do_vpdi_exist_c INTO lv_recs_exist;
    CLOSE do_vpdi_exist_c;
--
    IF ((NVL(lv_recs_exist,'N') = 'Y') AND (NOT IS_WF_ACTIVITY)) THEN
      SET_MENU_ITEM_PROPERTY('ICONS.VPDI_EXISTS',ENABLED,PROPERTY_TRUE);
      SET_MENU_ITEM_PROPERTY('ICONS.VPDI_EXISTS',LABEL,
          'Institution Selector');
--
    ELSE
      SET_MENU_ITEM_PROPERTY('ICONS.VPDI_EXISTS',ENABLED,PROPERTY_FALSE);
      SET_MENU_ITEM_PROPERTY('ICONS.VPDI_EXISTS',LABEL,
          'Multi-Entity Processing not enabled');
    END IF;
  END SET_VPDI_MENU;
--
--
  PROCEDURE CANCEL_VPDI_SELECTION IS
  BEGIN
    COPY('Y','G$_NAV_BLOCK.LEAVING_BLK_IND');
--
    SET_WINDOW_PROPERTY('G$_VPDI_WINDOW',VISIBLE,PROPERTY_OFF);
    GO_ITEM(NAME_IN('G$_VPDI_BLOCK.VPDI_SELECT_ITEM'));
--
    SET_ITEM_PROPERTY('G$_VPDI_BLOCK.VPDI_CODE',ENABLED,PROPERTY_OFF);
  END CANCEL_VPDI_SELECTION;
--
--
  PROCEDURE SAVE_VPDI_SELECTION IS
  BEGIN
    IF NAME_IN('G$_VPDI_BLOCK.VPDI_CODE') IS NULL THEN
      MESSAGE(G$_NLS.Get('GOQRPLS-0179','LIB','VPDI can not be null'));
      RAISE FORM_TRIGGER_FAILURE;
    END IF;
--
    G$_VPDI.SET_VPDI_ON_CHANGE(NAME_IN('G$_VPDI_BLOCK.VPDI_CODE'));
--
    SET_WINDOW_PROPERTY('G$_VPDI_WINDOW',VISIBLE,PROPERTY_OFF);
    GO_ITEM(NAME_IN('G$_VPDI_BLOCK.VPDI_SELECT_ITEM'));
--
    DO_KEY('CLEAR_FORM');
    G$_CHECK_FAILURE;
  END SAVE_VPDI_SELECTION;
--
--
  FUNCTION IS_FORM_VPDI_ENABLED( form_name VARCHAR2 ) RETURN BOOLEAN IS
    CURSOR do_vpdi_exist_c (cp_form_name VARCHAR2) IS
      SELECT 'Y'
        FROM GOBVPDI
       WHERE GOBVPDI_OBJECT = cp_form_name;
<multilinecomment> BD MEP </multilinecomment>
<multilinecomment> No need for this code since the function IS_VPDI_ON has already done the check </multilinecomment>
--         AND EXISTS
--               (SELECT 'X'
--                  FROM GTVVPDI);
<multilinecomment> ED MEP </multilinecomment>
--
    lv_recs_exist    VARCHAR2(1);
--
    BEGIN
<multilinecomment> BA MEP This code will do the check to see if MEP/MIF is enabled. </multilinecomment>
    IF NOT IS_VPDI_ON THEN
      RETURN lv_recs_exist = 'N';
    END IF;
<multilinecomment> EA MEP </multilinecomment>
    	
    OPEN do_vpdi_exist_c( form_name );
    FETCH do_vpdi_exist_c INTO lv_recs_exist;
    CLOSE do_vpdi_exist_c;
--
    RETURN NVL(lv_recs_exist,'N') = 'Y';
  END IS_FORM_VPDI_ENABLED;
--
--
BEGIN
  isVPDION := G$_VPDI_SECURITY.G$_IS_MIF_ENABLED();
END G$_VPDI;
		*/
		/* <p>
		* 
		*  Local Function to Determine Workwlow Condition
		* 
		* F2J_STRONG_PRESENTATION_LOGIC : The code of this function was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NBool isF5On()
		{
			CanvasDescriptor lvViewId = findView("G$_NAV_CANVAS");
			if ( !(lvViewId == null) )
			{
				if ( getViewVisible(lvViewId).equals("TRUE") )
				{
					return  toBool(NBool.True);
				}
				else {
					return  toBool(NBool.False);
				}
			}
			return toBool(NBool.False);
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NBool isWfActivity()
		{
			NString vcstackvalue= NString.getNull();
			NBool bolreturn= NBool.getNull();
			vcstackvalue = isNull(getNameIn("GLOBAL.WF_ACTIVITY"), "N");
			// 
			bolreturn = toBool(((substring(vcstackvalue, - (1)).equals("W") || substring(vcstackvalue, - (1)).equals("Q"))));
			// 
			return bolreturn;
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param formName
		*/
		public NNumber getMaxSeq(NString formName)
		{
			ValueSet groupId= null;
			NNumber holdSeq = toNumber(0);
			NInteger rowCount= NInteger.getNull();
			NString holdFormName= NString.getNull();
			groupId = findGroup("VPDI_GRP");
			// 
			if ( !(groupId == null) )
			{
				rowCount = toInt(getGroupRowCount(groupId));
				//  count number of records in array
				// 
				for ( int i = 1; i <= rowCount.toInt32(); i++ )
				{
					holdFormName = getGroupCharCell("VPDI_GRP.FORM_NAME", i);
					// 
					if ( holdFormName.equals(formName) )
					{
						holdSeq = getGroupNumberCell("VPDI_GRP.SEQ", i);
					}
				}
			}
			// 
			return holdSeq;
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param letter
		*/
		public NNumber fGetIndex(NString letter)
		{
			if (upper(letter).equals("A"))
			{
				return  toNumber(1);
			}
			else if (upper(letter).equals("B"))
			{
				return  toNumber(2);
			}
			else if (upper(letter).equals("C"))
			{
				return  toNumber(3);
			}
			else if (upper(letter).equals("D"))
			{
				return  toNumber(4);
			}
			else if (upper(letter).equals("E"))
			{
				return  toNumber(5);
			}
			else if (upper(letter).equals("F"))
			{
				return  toNumber(6);
			}
			else if (upper(letter).equals("G"))
			{
				return  toNumber(7);
			}
			else if (upper(letter).equals("H"))
			{
				return  toNumber(8);
			}
			else if (upper(letter).equals("I"))
			{
				return  toNumber(9);
			}
			else if (upper(letter).equals("J"))
			{
				return  toNumber(10);
			}
			else if (upper(letter).equals("A$"))
			{
				return  toNumber(11);
			}
			else if (upper(letter).equals("B$"))
			{
				return  toNumber(12);
			}
			else {
				return NNumber.getNull();
			}
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pParamNamesList
		*/
		public NNumber fGetCountParameters(NString pParamNamesList)
		{
			NInteger vLoc= NInteger.getNull();
			NInteger vStartloc = toInt(1);
			NString delim = toStr("::");
			NString vItem= NString.getNull();
			NInteger countV = toInt(0);
			while (true) {
				vLoc = inStr(pParamNamesList, delim, vStartloc);
				// 
				if ( vLoc.equals(vStartloc) )
				{
					vItem = toStr(null);
				}
				else if ( vLoc.equals(0) ) {
					vItem = substring(pParamNamesList, vStartloc);
				}
				else {
					vItem = substring(pParamNamesList, vStartloc, vLoc.subtract(vStartloc));
				}
				// 
				countV = countV.add(1);
				// 
				if ( vLoc.equals(0) )
				{
						break;
				}
				else {
					vStartloc = vLoc.add(2);
				}
			}
			// 
			return toNumber(countV);
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param stringV
		*/
		public NString fGetValue(NString stringV)
		{
			return substring(stringV, toInt(1), inStr(stringV, toStr("=")).subtract(1));
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param stringV
		*/
		public NString fGetItemName(NString stringV)
		{
			return substring(stringV, inStr(stringV, toStr("=")).add(1));
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pParamNamesList
		* @param posn
		*/
		public NString fGetParameterValue(NString pParamNamesList, NNumber posn)
		{
			// 
			NInteger vLoc= NInteger.getNull();
			NInteger vStartloc = toInt(1);
			// 
			NString delim = toStr("::");
			NString vItem= NString.getNull();
			NInteger countV = toInt(0);
			// 
			NString v1= NString.getNull();
			NString v2= NString.getNull();
			NString v3= NString.getNull();
			NString v4= NString.getNull();
			NString v5= NString.getNull();
			NString v6= NString.getNull();
			NString v7= NString.getNull();
			NString v8= NString.getNull();
			NString v9= NString.getNull();
			NString v10= NString.getNull();
			NString v11= NString.getNull();
			NString v12= NString.getNull();
			while (true) {
				vLoc = inStr(pParamNamesList, delim, vStartloc);
				// 
				if ( vLoc.equals(vStartloc) )
				{
					vItem = toStr(null);
				}
				else if ( vLoc.equals(0) ) {
					vItem = substring(pParamNamesList, vStartloc);
				}
				else {
					vItem = substring(pParamNamesList, vStartloc, vLoc.subtract(vStartloc));
				}
				// 
				countV = countV.add(1);
				// 
				if (countV.equals(1))
				{
					v1 = vItem;
				}
				else if (countV.equals(2))
				{
					v2 = vItem;
				}
				else if (countV.equals(3))
				{
					v3 = vItem;
				}
				else if (countV.equals(4))
				{
					v4 = vItem;
				}
				else if (countV.equals(5))
				{
					v5 = vItem;
				}
				else if (countV.equals(6))
				{
					v6 = vItem;
				}
				else if (countV.equals(7))
				{
					v7 = vItem;
				}
				else if (countV.equals(8))
				{
					v8 = vItem;
				}
				else if (countV.equals(9))
				{
					v9 = vItem;
				}
				else if (countV.equals(10))
				{
					v10 = vItem;
				}
				else if (countV.equals(11))
				{
					v11 = vItem;
				}
				else if (countV.equals(12))
				{
					v12 = vItem;
				}
				else {
				}
				// 
				if ( vLoc.equals(0) )
				{
						break;
				}
				else {
					vStartloc = vLoc.add(2);
				}
			}
			// 
			if (posn.equals(1))
			{
				return v1;
			}
			else if (posn.equals(2))
			{
				return v2;
			}
			else if (posn.equals(3))
			{
				return v3;
			}
			else if (posn.equals(4))
			{
				return v4;
			}
			else if (posn.equals(5))
			{
				return v5;
			}
			else if (posn.equals(6))
			{
				return v6;
			}
			else if (posn.equals(7))
			{
				return v7;
			}
			else if (posn.equals(8))
			{
				return v8;
			}
			else if (posn.equals(9))
			{
				return v9;
			}
			else if (posn.equals(10))
			{
				return v10;
			}
			else if (posn.equals(11))
			{
				return v11;
			}
			else if (posn.equals(12))
			{
				return v12;
			}
			return NString.getNull();
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param formName
		*/
		public NBool fExistingVpdiLov(NString formName)
		{
			int rowCount = 0;
			NBool cursorId = toBool(NBool.False);
			NString holdValue= NString.getNull();
			String sqlisExist = "SELECT 'X' " +
	" FROM GORRSQL " +
	" WHERE GORRSQL_SQPR_CODE = 'VPD' AND GORRSQL_SQRU_CODE = :P_CP_FORM_NAME AND GORRSQL_ACTIVE_IND = 'Y' ";
			DataCursor isExist = new DataCursor(sqlisExist);
			NString cpFormName = NString.getNull();
			try {
				cpFormName=formName;
				//Setting query parameters
				isExist.addParameter("P_CP_FORM_NAME", cpFormName);
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable isExist.
				isExist.open();
				ResultSet isExistResults = isExist.fetchInto();
				if ( isExistResults != null ) {
					holdValue = isExistResults.getStr(0);
				}
				cursorId = toBool(isExist.found());
				isExist.close();
				return cursorId;
				}finally{
					isExist.close();
				}
		}
/* <p>
		* 
		* 
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void pSelectVpdiData()
		{
			int rowCount = 0;
			NInteger result= NInteger.getNull();
			NString thequery= NString.getNull();
			NBool aValueChosen= NBool.getNull();
			NString holdTitleName= NString.getNull();
			NString pidmItem= NString.getNull();
			NString holdValue= NString.getNull();
			String sqlgetSql = "SELECT GORRSQL_PARSED_SQL " +
	" FROM GORRSQL " +
	" WHERE GORRSQL_SQPR_CODE = 'VPD' AND GORRSQL_SQRU_CODE = :P_CP_FORM_NAME AND GORRSQL_ACTIVE_IND = 'Y' ";
			DataCursor getSql = new DataCursor(sqlgetSql);
			NString cpFormName = NString.getNull();
			try {
				//  Release VPDI Security settings for All Institutions
				releaseVpdiForAll();
				// 
				cpFormName=getCurrentTaskName();
				//Setting query parameters
				getSql.addParameter("P_CP_FORM_NAME", cpFormName);
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable getSql.
				getSql.open();
				ResultSet getSqlResults = getSql.fetchInto();
				if ( getSqlResults != null ) {
					thequery = getSqlResults.getStr(0);
				}
				getSql.close();
				// 
				if ( inStr(thequery, toStr(":PIDM_VPD")).greater(1) )
				{
					pidmItem = substring(thequery, inStr(thequery, toStr("<")).add(1), inStr(thequery, toStr(">")).subtract(inStr(thequery, toStr("<"))).subtract(1));
					thequery = replace(thequery, toStr("<").append(substring(thequery, inStr(thequery, toStr("<")).add(1), inStr(thequery, toStr(">")).subtract(inStr(thequery, toStr("<"))).subtract(1))).append(">"), "");
					thequery = replace(thequery, ":PIDM_VPD", getNameIn(pidmItem));
				}
				// 
				thequery = replace(thequery, "':1'", toStr("'").append(getNameIn("G$_VPDI_BLOCK.VPDI_CODE")).append("'"));
				// 
				result = toInt(populateGroupWithQuery("G$_VPDI_ALL_RG", thequery));
				// 
				if ( result.equals(0) )
				{
					holdTitleName = getGroupCharCell("G$_VPDI_ALL_RG.A$", 1);
					// 
					for ( int i = 1; i <= 10; i++ )
					{
						setLovColumnTitle("G$_VPDI_ALL_LOV", i, fGetParameterValue(holdTitleName, toNumber(i)));
						if ( fGetParameterValue(holdTitleName, toNumber(i)).equals("NONE") )
						{
							setLovColumnWidth("G$_VPDI_ALL_LOV", i, 0);
						}
					}
					// 
					setLovColumnWidth("G$_VPDI_ALL_LOV", 11, 0);
					//  Titles
					setLovColumnWidth("G$_VPDI_ALL_LOV", 12, 0);
					//  Metadata Mappings
					// 
					aValueChosen = showLov("G$_VPDI_ALL_LOV");
					// 
					//  Process
					// 
					if ( aValueChosen.getValue() )
					{
						holdValue = getNameIn("G$_VPDI_BLOCK.VPDI_HOLD_VALUE");
						for ( int x = 1; x <= fGetCountParameters(holdValue).toInt32(); x++ )
						{
							copy(fGetValue(fGetParameterValue(holdValue, toNumber(x))),fGetItemName(fGetParameterValue(holdValue, toNumber(x))));
						}
						// 
						setVpdiOnChange(getNameIn("G$_VPDI_BLOCK.VPDI_CODE"));
						// 
						// F2J_NOT_SUPPORTED : The property "WINDOW's VISIBLE" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin1".
						//						SupportClasses.FORMS4W.SetWindowProperty("G$_VPDI_WINDOW", SupportClasses.Property.VISIBLE, false);
						this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'WINDOW's VISIBLE' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin1'.");
						
						
						goItem(getNameIn("G$_VPDI_BLOCK.VPDI_SELECT_ITEM"));
						// 
						executeAction("CLEAR_FORM");
						getContainer().gCheckFailure();
					}
					else {
						copy(findVpdi(getCurrentTaskName()),"G$_VPDI_BLOCK.VPDI_CODE");
						setVpdiContext(getNameIn("G$_VPDI_BLOCK.VPDI_CODE"));
					}
				}
				else {
					warningMessage(GNls.Fget(toStr("GOQRPLS-0177"), toStr("LIB"), toStr("No Data available")));
					copy(findVpdi(getCurrentTaskName()),"G$_VPDI_BLOCK.VPDI_CODE");
					setVpdiContext(getNameIn("G$_VPDI_BLOCK.VPDI_CODE"));
				}
				}finally{
					getSql.close();
				}
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param formName
		*/
		public void deleteVpdi(NString formName)
		{
			ValueSet groupId= null;
			NInteger maxSeq= NInteger.getNull();
			groupId = findGroup("VPDI_GRP");
			// 
			if ( !(groupId == null) )
			{
				maxSeq = toInt(getMaxSeq(formName));
				if ( maxSeq.greater(0) )
				{
					deleteGroupRow(groupId, maxSeq);
				}
			}
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param formName
		* @param vpdiCode
		*/
		public void fillGroupVpdi(NString formName, NString vpdiCode)
		{
			ValueSet groupId= null;
			groupId = findGroup("VPDI_GRP");
			// 
			if ( !(groupId == null) )
			{
				setGroupCharCell("VPDI_GRP.VPDI_CODE", getMaxSeq(formName), vpdiCode);
			}
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param formName
		* @param vpdiCode
		*/
		public void fillGroupVpdiNew(NString formName, NString vpdiCode)
		{
			ValueSet groupId= null;
			ValueSetColumn colId= null;
			NInteger rowCount= NInteger.getNull();
			// 
			//  Call this Procedure only when VPDI is ON
			// 
			if ( getNameIn("GLOBAL.INSTITUTION_CODE").isNull() )
			{
				return ;
			}
			// 
			groupId = findGroup("VPDI_GRP");
			// 
			//  create new array
			// 
			if ( (groupId == null) )
			{
				//MORPHIS: TODO Support this
				//groupId = createGroup("VPDI_GRP", SupportClasses.Constants.GLOBAL_SCOPE);
				groupId = createGroup("VPDI_GRP");
				colId = addGroupColumn(groupId, "seq", ValueSetColumn.NUMBER_COL);
				colId = addGroupColumn(groupId, "form_name", ValueSetColumn.CHAR_COL, 10);
				colId = addGroupColumn(groupId, "vpdi_code", ValueSetColumn.CHAR_COL, 10);
			}
			// 
			//  Get count of records in array and increment by one
			// 
			rowCount = toInt(getGroupRowCount(groupId) + 1);
			//WARNING: only adding rows at the end is supported
			addGroupRow(groupId);
			// 
			setGroupNumberCell("VPDI_GRP.SEQ", rowCount, rowCount);
			setGroupCharCell("VPDI_GRP.FORM_NAME", rowCount, formName);
			setGroupCharCell("VPDI_GRP.VPDI_CODE", rowCount, vpdiCode);
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param formName
		*/
		public NString findVpdi(NString formName)
		{
			ValueSet groupId= null;
			NString vpdi= NString.getNull();
			if ( formName.equals("GUAGMNU") )
			{
				return getNameIn("GLOBAL.INSTITUTION_CODE");
			}
			// 
			if ( isFormVpdiEnabled(formName).not() )
			{
				return GVpdiSecurity.FgVpdiGetInstCodeFnc();
			}
			// 
			groupId = findGroup("VPDI_GRP");
			if ( !(groupId == null) )
			{
				vpdi = getGroupCharCell("VPDI_GRP.VPDI_CODE", getMaxSeq(formName));
				return vpdi;
			}
			// 
			return NString.getNull();
		}
/* <p>
		* 
		*  Call this Procedure only when VPDI is ON
		* 
/* </p>
		*/
		public void doVpdiGlobalOnExit()
		{
			ItemDescriptor itemId= null;
			NString lvFormName= NString.getNull();
			NString lvVpdi= NString.getNull();
			if ( getNameIn("GLOBAL.INSTITUTION_CODE").isNull() )
			{
				return ;
			}
			// 
			lvFormName = getCurrentTaskName();
			if ( isFormVpdiEnabled(lvFormName).not() )
			{
				return ;
			}
			// 
			itemId = findItem(toStr("G$_VPDI_BLOCK.VPDI_CODE"));
			if ( !(itemId == null) )
			{
				lvVpdi = findVpdi(lvFormName);
				if ( !lvVpdi.isNull() )
				{
					copy(lvVpdi,"GLOBAL.INSTITUTION_CODE");
					deleteVpdi(lvFormName);
				}
			}
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param vpdiCode
		*/
		public void setVpdiContext(NString vpdiCode)
		{
			Gokvpda.pSetVpdiForQuery(vpdiCode);
		}
/* <p>
		* 
		*  Call this Procedure only when VPDI is ON
		* 
/* </p>
		*/
		public void setVpdiOnAccess()
		{
			ItemDescriptor itemId= null;
			NString curFrm= NString.getNull();
			NString lvVpdiCode= NString.getNull();
			if ( isVpdiOn().not() )
			{
				return ;
			}
			// 
			setVpdiMenu();
			// 
			curFrm = getCurrentTaskName();
			if ( isFormVpdiEnabled(curFrm).not() )
			{
				setVpdiContext(GVpdiSecurity.FgVpdiGetInstCodeFnc());
				return ;
			}
			// 
			itemId = findItem(toStr("G$_VPDI_BLOCK.VPDI_CODE"));
			if ( !(itemId == null) )
			{
				lvVpdiCode = getNameIn("G$_VPDI_BLOCK.VPDI_CODE");
				if ( lvVpdiCode.isNull() )
				{
					lvVpdiCode = findVpdi(curFrm);
					copy(lvVpdiCode,"G$_VPDI_BLOCK.VPDI_CODE");
				}
				// 
				setVpdiContext(lvVpdiCode);
			}
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param vpdiCode
		*/
		public void setVpdiOnChange(NString vpdiCode)
		{
			NString lvVpdiCode = getNameIn("G$_VPDI_BLOCK.VPDI_CODE");
			fillGroupVpdi(getCurrentTaskName(), lvVpdiCode);
			
			copy(lvVpdiCode,"GLOBAL.INSTITUTION_CODE");
			setVpdiContext(lvVpdiCode);
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param formName
		* @param vpdiCode
		*/
		public void setVpdiOnInit(NString formName, NString vpdiCode)
		{
			if ((isVpdiOn().getValue() && isFormVpdiEnabled(formName).getValue()))
			{
				fillGroupVpdiNew(formName, vpdiCode);
			}
		}
/* <p>
		* 
		* 
/* </p>
		*/
		public void setMainMenuWindowTitleVpd()
		{
			NString winTitle= NString.getNull();
			NString eventWin= NString.getNull();
			NString curForm= NString.getNull();
			NString dbInst= NString.getNull();
			NString curRel= NString.getNull();
			NString vpdiValue= NString.getNull();
			NString modIdValue= NString.getNull();
			NString qfStatus= NString.getNull();
			if ( isVpdiOn().not() )
			{
				return ;
			}
			// 
			eventWin = getCurrentWindow();
			curForm = getCurrentTaskName();
			dbInst = getNameIn("GLOBAL.INST");
			curRel = getNameIn("CURRENT_RELEASE");
			vpdiValue = getNameIn("GLOBAL.DEFAULT_INSTITUTION_CODE");
			// 
			setWindowTitle("MAIN_WINDOW", "General Menu");
			winTitle = getWindowTitle("MAIN_WINDOW");
			// 
			//  Append the form name, release number and the inst global to the title.
			// 
			if ( inStr(winTitle, curForm).lesserOrEquals(0) )
			{
				if ( getContainer().getGToolbar().readValue(toStr("FORM_NAME")).equals("YES") )
				{
					winTitle = winTitle.append("  ").append(curForm);
				}
			}
			// 
			if ( inStr(winTitle, curRel).lesserOrEquals(0) )
			{
				if ( getContainer().getGToolbar().readValue(toStr("RELEASE")).equals("YES") )
				{
					winTitle = winTitle.append("  ").append(curRel);
				}
			}
			// 
			if ( !(findItem(toStr("FORM_HEADER.MOD_ID")) == null) )
			{
				modIdValue = getNameIn("FORM_HEADER.MOD_ID");
				if ( inStr(winTitle, toStr("[").append(modIdValue).append("]")).lesserOrEquals(0) )
				{
					if ( getContainer().getGToolbar().readValue(toStr("RELEASE")).equals("YES") )
					{
						if ( !modIdValue.isNull() )
						{
							winTitle = winTitle.append("  [").append(modIdValue).append("]");
						}
					}
				}
			}
			// 
			if ( !dbInst.isNull() )
			{
				dbInst = toStr("(").append(dbInst).append(")");
				if ( inStr(winTitle, dbInst).lesserOrEquals(0) )
				{
					if ( getContainer().getGToolbar().readValue(toStr("DBASE_INST")).equals("YES") )
					{
						winTitle = winTitle.append("  ").append(dbInst);
					}
				}
			}
			// 
			if ( !vpdiValue.isNull() )
			{
				vpdiValue = toStr("(").append(vpdiValue).append(")");
				if ( inStr(winTitle, vpdiValue).lesserOrEquals(0) )
				{
					if ( getContainer().getGToolbar().readValue(toStr("DBASE_INST")).equals("YES") )
					{
						winTitle = winTitle.append("  ").append(vpdiValue);
					}
				}
			}
			// 
			//  Add on quick flow status.
			// 
			qfStatus = getNameIn("GLOBAL.QF_STATUS");
			if ( !qfStatus.isNull() )
			{
				if ( inStr(winTitle, qfStatus).lesserOrEquals(0) )
				{
					winTitle = winTitle.append("  ").append(qfStatus);
				}
			}
			// 
			setWindowTitle("MAIN_WINDOW", winTitle);
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NBool isVpdiOn()
		{
			return isvpdion;
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString getCurrentVpdi()
		{
			ItemDescriptor itemId = findItem(toStr("G$_VPDI_BLOCK.VPDI_CODE"));
			if ( !(itemId == null) )
			{
				if ( !getNameIn("G$_VPDI_BLOCK.VPDI_CODE").isNull() )
				{
					return getNameIn("G$_VPDI_BLOCK.VPDI_CODE");
				}
				else {
					return findVpdi(getCurrentTaskName());
				}
			}
			else {
				return getNameIn("GLOBAL.INSTITUTION_CODE");
			}
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void postForm()
		{
			if ( isVpdiOn().getValue() )
			{
				Gokvpda.pSetVpdiOffProcessContext();
			}
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void revokeAccess()
		{
			if ( isVpdiOn().getValue() )
			{
				Gokvpda.pSetVpdiOffProcessContext();
			}
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void releaseVpdiForAll()
		{
			Gokvpda.pSetVpdiForQueryAll();
		}
/* <p>
		* 
		* 
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void callVpdiComponent()
		{
			int rowCount = 0;
			ItemDescriptor checkKeysItem= null;
			ItemDescriptor itemId= null;
			NString lvCurrForm= NString.getNull();
			NString lvRecsExist= NString.getNull();
			String sqldoVpdiExistC = "SELECT 'Y' " +
	" FROM GOBVPDI " +
	" WHERE GOBVPDI_OBJECT = :P_CP_FORM_NAME ";
			DataCursor doVpdiExistC = new DataCursor(sqldoVpdiExistC);
			NString cpFormName = NString.getNull();
			try {
				if ( isVpdiOn().not() )
				{
					getContainer().gInvalidFunctionMsg();
					throw new ApplicationException();
				}
				// 
				//  DO NOT INVOKE the VPDI Component if part of a WORKFLOW or F5 is open
				// 
				if ((isWfActivity().getValue() || isF5On().getValue()))
				{
					getContainer().gInvalidFunctionMsg();
					throw new ApplicationException();
				}
				// 
				checkKeysItem = findItem(toStr("CHECK_KEYS"));
				itemId = findItem(toStr("G$_VPDI_BLOCK.VPDI_CODE"));
				lvCurrForm = getCurrentTaskName();
				// 
				cpFormName=lvCurrForm;
				//Setting query parameters
				doVpdiExistC.addParameter("P_CP_FORM_NAME", cpFormName);
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable doVpdiExistC.
				doVpdiExistC.open();
				ResultSet doVpdiExistCResults = doVpdiExistC.fetchInto();
				if ( doVpdiExistCResults != null ) {
					lvRecsExist = doVpdiExistCResults.getStr(0);
				}
				doVpdiExistC.close();
				// 
				if ( isNull(lvRecsExist, "N").equals("N") )
				{
					getContainer().gInvalidFunctionMsg();
					throw new ApplicationException();
				}
				// 
				if ( (itemId == null) )
				{
					return ;
				}
				// 
				//  Check for pending changes in the block and don't invoke if there are any.
				// 
				if ( getTaskStatus().equals("CHANGED") )
				{
					errorMessage(GNls.Fget(toStr("GOQRPLS-0178"), toStr("LIB"), toStr("*ERROR* There are pending form changes; Commit or Rollback.")));
					throw new ApplicationException();
				}
				// 
				copy(getCursorItem(),"G$_VPDI_BLOCK.VPDI_SELECT_ITEM");
				setItemEnabled("G$_VPDI_BLOCK.VPDI_CODE", true);
				setItemEnabled("G$_VPDI_BLOCK.VPDI_CANCEL_BTN", true);
				setItemEnabled("G$_VPDI_BLOCK.VPDI_OK_BTN", true);
				TaskServices.getCurrentTask().setValidationEnabled(false);
				
				//  
				if ( fExistingVpdiLov(lvCurrForm).getValue() )
				{
					setItemVisible("G$_VPDI_BLOCK.VPDI_OTHER_INSTITUTIONS", true);
					setItemEnabled("G$_VPDI_BLOCK.VPDI_OTHER_INSTITUTIONS", true);
				}
				// 
				goItem(toStr("G$_VPDI_BLOCK.VPDI_CODE"));
				nextItem();
				doNavigation();
				previousItem();
				doNavigation();
				// 
				if ( !(checkKeysItem == null) )
				{
					copy("N","CHECK_KEYS");
				}
				}finally{
					doVpdiExistC.close();
				}
		}
/* <p>
		* 
		* 
		* F2J_STRONG_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void setVpdiMenu()
		{
			int rowCount = 0;
			NString lvRecsExist= NString.getNull();
			String sqldoVpdiExistC = "SELECT 'Y' " +
	" FROM GOBVPDI " +
	" WHERE GOBVPDI_OBJECT = :P_CP_FORM_NAME ";
			DataCursor doVpdiExistC = new DataCursor(sqldoVpdiExistC);
			NString cpFormName = NString.getNull();
			try {
				if ( isVpdiOn().not() )
				{
					return ;
				}
				// 
				cpFormName=getCurrentTaskName();
				//Setting query parameters
				doVpdiExistC.addParameter("P_CP_FORM_NAME", cpFormName);
				doVpdiExistC.open();
				ResultSet doVpdiExistCResults = doVpdiExistC.fetchInto();
				if ( doVpdiExistCResults != null ) {
					lvRecsExist = doVpdiExistCResults.getStr(0);
				}
				doVpdiExistC.close();
				// 
				if (!TaskServices.getCurrentTask().isWorkspace()){
					if (((isNull(lvRecsExist, "N").equals("Y")) && (isWfActivity().not())))
					{
						((BaseTask)TaskServices.getCurrentTask()).getMenuServices().setMenuItemEnabled("ICONS.VPDI_EXISTS", true);
					}
					else 
					{
						((BaseTask)TaskServices.getCurrentTask()).getMenuServices().setMenuItemEnabled("ICONS.VPDI_EXISTS", false);						
					}
				}
				}finally{
					doVpdiExistC.close();
				}
		}
/* <p>
		* 
		* 
		* F2J_STRONG_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void cancelVpdiSelection()
		{
			copy("Y","G$_NAV_BLOCK.LEAVING_BLK_IND");
			// 
			hideWindow("G$_VPDI_WINDOW");
			
			goItem(getNameIn("G$_VPDI_BLOCK.VPDI_SELECT_ITEM"));
			// 
			setItemEnabled("G$_VPDI_BLOCK.VPDI_CODE", false);
		}
/* <p>
		* 
		* 
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void saveVpdiSelection()
		{
			if ( getNameIn("G$_VPDI_BLOCK.VPDI_CODE").isNull() )
			{
				errorMessage(GNls.Fget(toStr("GOQRPLS-0179"), toStr("LIB"), toStr("VPDI can not be null")));
				throw new ApplicationException();
			}
			// 
			setVpdiOnChange(getNameIn("G$_VPDI_BLOCK.VPDI_CODE"));
			// 
			hideWindow("G$_VPDI_WINDOW");
			
			goItem(nameIn("G$_VPDI_BLOCK.VPDI_SELECT_ITEM"));
			// 
			executeAction("CLEAR_FORM");
			getContainer().gCheckFailure();
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param formName
		*/
		public NBool isFormVpdiEnabled(NString formName)
		{
			int rowCount = 0;
			String sqldoVpdiExistC = "SELECT 'Y' " +
	" FROM GOBVPDI " +
	" WHERE GOBVPDI_OBJECT = :P_CP_FORM_NAME ";
			DataCursor doVpdiExistC = new DataCursor(sqldoVpdiExistC);
			NString cpFormName = NString.getNull();
			//  BD MEP 
			//  No need for this code since the function IS_VPDI_ON has already done the check 
			//          AND EXISTS
			//                (SELECT 'X'
			//                   FROM GTVVPDI);
			//  ED MEP 
			// 
			NString lvRecsExist= NString.getNull();
			try {
				//  BA MEP This code will do the check to see if MEP/MIF is enabled. 
				if ( isVpdiOn().not() )
				{
					return toBool(lvRecsExist.equals("N"));
				}
				//  EA MEP 
				cpFormName=formName;
				//Setting query parameters
				doVpdiExistC.addParameter("P_CP_FORM_NAME", cpFormName);
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable doVpdiExistC.
				doVpdiExistC.open();
				ResultSet doVpdiExistCResults = doVpdiExistC.fetchInto();
				if ( doVpdiExistCResults != null ) {
					lvRecsExist = doVpdiExistCResults.getStr(0);
				}
				doVpdiExistC.close();
				// 
				return toBool(isNull(lvRecsExist, "N").equals("Y"));
				}finally{
					doVpdiExistC.close();
				}
		}
		
		
	
	
}
