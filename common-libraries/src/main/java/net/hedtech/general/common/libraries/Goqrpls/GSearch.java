package net.hedtech.general.common.libraries.Goqrpls;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
import net.hedtech.general.common.libraries.Eoqrpls.*;

public class GSearch extends AbstractSupportCodeObject {
	

	public GSearch(ISupportCodeContainer container) {
		super(container);
	}
	
	@Override
	public GoqrplsServices getContainer() {
		return (GoqrplsServices)super.getContainer();
	}
	//Original PL/SQL code for Package Prog Unit (SPEC) G$_SEARCH
	/*
	PACKAGE G$_SEARCH IS
  PROCEDURE post_text_code;
  PROCEDURE code_key_next_item;
  PROCEDURE code_when_new_item_inst;
  PROCEDURE parameters(code_table   VARCHAR2 := NULL,
                       desc_table   VARCHAR2 := NULL,
                       where_clause VARCHAR2 := NULL);
  PROCEDURE when_mouse_click;
  PROCEDURE used_lov(ind BOOLEAN);
END;
	*/
	
	
			
		//Original PL/SQL code for Package Prog Unit (BODY) G$_SEARCH
		/*
		PACKAGE BODY G$_SEARCH IS
--
-- GLOBAL Variables
--
-- GLOBAL.CODE:    a variable containing the value of search LOV
-- GLOBAL.DESC:    a variable containing the value of search LOV
--
  code_x_pos            NUMBER(4);     -- x position of code item
  desc_x_pos            NUMBER(4);     -- x Position of description item 
--
  orig_code_width	      NUMBER(4);     -- length of code item
--
-- Names and pointers of code and description items
--
  col_code_table        VARCHAR2(64);
  col_desc_table        VARCHAR2(64);
  get_desc_item         VARCHAR2(80);  -- name of description item
  get_code_item         VARCHAR2(80);  -- name of Code item
  hold_desc_item        VARCHAR2(80);  -- name of description item
  table_where_clause    VARCHAR2(2000);
--
  code_item_id          ITEM;          -- pointer to code item
  desc_item_id          ITEM;          -- pointer to description item
--
  code_before_search    VARCHAR2(200);  -- value of code before search trigger
  cursor_current_value  VARCHAR2(200);	-- value of current content of CODE item 
--
  rg_name               VARCHAR2(30) := 'HOLD_TABLE_RG';
  rg_id                 RECORDGROUP  := FIND_GROUP(rg_name); -- pointer to a record group
  array_search_cnt      NUMBER(5);
--
  column1               VARCHAR2(100); 
  column2               VARCHAR2(100);
--
  lov_ind               BOOLEAN := FALSE;
--
  lv_err_msg            VARCHAR2(200);
  lv_err_msg2           VARCHAR2(200);
--
-- Internal Procedures And Functions
--
  PROCEDURE COLUMN_TO_CHAR(col_name in out VARCHAR2) ;
  PROCEDURE DEFINE_RG (where_clause in VARCHAR2);
  FUNCTION FIND_EXACT_MATCH (col_name1  VARCHAR2,
                             col_name2  VARCHAR2,
                             where_text VARCHAR2 := NULL) RETURN BOOLEAN;
--
--
  PROCEDURE USED_LOV (ind BOOLEAN) IS
  BEGIN
    lov_ind := ind;
  END;
--
-- Create record groups for code.  Record group has the code-description as 
-- first column. 								
--
  PROCEDURE create_recgroups (col_name1  VARCHAR2,
                              col_name2  VARCHAR2,
                              where_text VARCHAR2 := NULL) IS
--
    condition_type CHAR(10)       := ' = ';
    where_clause   VARCHAR2(2000) := NULL;
  BEGIN
    IF (INSTR(cursor_current_value,'%') > 0 OR
      INSTR(cursor_current_value,'_') > 0 ) AND NVL(LENGTH(cursor_current_value),0) <> 1 THEN
      condition_type := ' LIKE ';
    END IF;
--
    IF where_text IS NULL THEN
      where_clause := 'WHERE ' ||column1 || condition_type || ''''
                      || cursor_current_value || '''' || ' OR UPPER('
                      || column2 || ')' || condition_type || '''' 
                      || cursor_current_value || '''';
    ELSE
      where_clause := where_text || ' AND (' || column1 || condition_type
                      || '''' || cursor_current_value || '''' || ' OR UPPER('
                      || column2 || ')' || condition_type || '''' 
                      || cursor_current_value || '''' || ')';
    END IF;
--
    DEFINE_RG(where_clause);
--
-- Exactly one record was found that matched.
--
    IF array_search_cnt = 1 THEN
      COPY(GET_GROUP_CHAR_CELL(rg_name||'.CODE',1),get_code_item);
      IF get_desc_item <> get_code_item THEN
        COPY(GET_GROUP_CHAR_CELL(rg_name||'.DESC',1),get_desc_item);
      END IF;
--
-- More than one record was found that matched.
--
    ELSIF array_search_cnt > 1 THEN
      COPY('','GLOBAL.CODE');
      COPY('','GLOBAL.DESC');
      SET_LOV_PROPERTY('G$_SEARCH_LOV',GROUP_NAME,rg_name);
      G$_DISPLAY_LOV('','G$_SEARCH_LOV','Y');
      IF NAME_IN('global.code') IS NOT NULL THEN
        COPY(NAME_IN('global.code'),get_code_item);
        COPY('','global.code');
        IF get_desc_item <> get_code_item THEN
          COPY(NAME_IN('global.desc'),get_desc_item);
          COPY('','global.desc');
        END IF;
      END IF;
      ERASE('GLOBAL.CODE');
      ERASE('GLOBAL.DESC');
    ELSE
--
-- No records were found.  Check if the user is attempting to access the object table.  If
-- not, continue as normal with the invalid message.  If they are attempting to access the
-- object table (GUAGMNU, F5), we need to determine if it truly is invalid or they are not
-- authorized to see the object because of security reasons.  Call the security package to 
-- verify the object is valid and if so, call the security routine to log the security 
-- violation.
--
      lv_err_msg := G$_NLS.Get('GOQRPLS-0133','LIB','*ERROR* %01% is invalid. LIST for valid choices.',
                               cursor_current_value);
--
      IF col_code_table = 'GUBOBJS_NAME' THEN
        IF NAME_IN('SYSTEM.CURSOR_ITEM') IN ('KEY_BLOCK.NEXT_SELECTION','G$_NAV_BLOCK.GO_ITEM') THEN
--
          IF G$_CHK_AUTH.G$_CHECK_VALID_OBJ_FNC(cursor_current_value) THEN
            lv_err_msg := G$_NLS.GET('GOQRPLS-0134','LIB','User %01%/%02% is not authorized to access %03%.',  NAME_IN('GLOBAL.CURRENT_USER')
                                               ,  SYS_CONTEXT('userenv','os_user')
                                               ,  cursor_current_value );
            lv_err_msg2 := G$_NLS.GET('GOQRPLS-0135','LIB','User %01% is not authorized to access %02%.',  NAME_IN('GLOBAL.CURRENT_USER')
                                               ,  cursor_current_value );
--
            G$_SECURITY.G$_CREATE_LOG_RECORD(NAME_IN('GLOBAL.CURRENT_USER'),
                                             cursor_current_value,
-- 80-22  add severity parameter             lv_err_msg);
                                             lv_err_msg,
                                             3);
            MESSAGE(G$_NLS.Get('GOQRPLS-0136','LIB','*ERROR* ') || lv_err_msg2);
          ELSE
            MESSAGE(lv_err_msg);
          END IF;
          COPY('',get_desc_item);
        ELSE
          MESSAGE(lv_err_msg);
        END IF;
--
-- Not accessing the object table, so give invalid message.
--
      ELSE
        MESSAGE(lv_err_msg);
      END IF;
      IF get_desc_item <> get_code_item THEN
        COPY('',get_desc_item);
      END IF;
--
      RAISE FORM_TRIGGER_FAILURE;
    END IF;
  END;
--
-- Perform a search for code or description when the value entered IF different
-- from its original value.									
--
  PROCEDURE code_key_next_item IS
    lov_var  BOOLEAN;
  BEGIN
    IF lov_ind = TRUE THEN
      lov_ind := FALSE;
    ELSE
      IF NAME_IN('SYSTEM.MODE') <> 'ENTER-QUERY' THEN 
--
-- Duplicated the next line to solve tool problem
--
        cursor_current_value := NAME_IN('SYSTEM.CURSOR_VALUE');
        cursor_current_value := NAME_IN('SYSTEM.CURSOR_VALUE');
        IF (cursor_current_value <> code_before_search) OR 
           (cursor_current_value IS NOT NULL AND code_before_search IS NULL) THEN
--      
          IF cursor_current_value IS NOT NULL THEN
            IF Find_Exact_Match(col_code_table, 
                                col_desc_table,
                                table_where_clause) THEN
              RETURN;
            ELSE
              CREATE_RECGROUPS(col_code_table, 
                               col_desc_table,
                               table_where_clause);
            END IF;
          END IF;
        END IF;
      END IF;
    END IF;
  EXCEPTION WHEN 
    NO_DATA_FOUND THEN
      MESSAGE( G$_NLS.Get('GOQRPLS-0137', 'LIB','Unable to retrieve records for LOV.') );
      RAISE FORM_TRIGGER_FAILURE;
  END;
--
-- When entering a code item, expand the width of the code item appropriately 
-- to provide extra spaces to perform a search on description.  					
--
  PROCEDURE code_when_new_item_inst IS
--
    current_block      VARCHAR2(84) := NAME_IN('SYSTEM.TRIGGER_BLOCK');
    data_type_param    VARCHAR2(20);
    item_after         VARCHAR2(64);
    item_before        VARCHAR2(64);
--
    new_code_width     NUMBER(4);
    width_item_before  NUMBER(4);
    x_pos_item_after   NUMBER(4);
    y_pos_item_after   NUMBER(4);
    y_pos_item_orig    NUMBER(4);
--
    Same_y_code	       INTEGER(4);
    Same_y_next_item   INTEGER(4);
--
  BEGIN
    get_desc_item := '';
    get_code_item := '';
    col_code_table := '';
    col_desc_table := '';
    table_where_clause := '';
--
    get_code_item := NAME_IN('SYSTEM.TRIGGER_ITEM');
--
-- This trigger is in the property_class assigned to the code item.
--
    EXECUTE_TRIGGER('G$_SEARCH_PARAMETERS');
    G$_CHECK_FAILURE;
--
-- Capture the current value in item
--
    code_before_search := NAME_IN('SYSTEM.CURSOR_VALUE');
    code_before_search := NAME_IN('SYSTEM.CURSOR_VALUE');
--
    IF col_code_table IS NULL OR 
       col_desc_table IS NULL THEN
      MESSAGE(G$_NLS.Get('GOQRPLS-0138','LIB','*ERROR* Need to pass parameters into G$_SEARCH_PARAMETERS'),ACKNOWLEDGE);
      RAISE FORM_TRIGGER_FAILURE;
    END IF;
--
    IF get_desc_item IS NULL THEN
      get_desc_item := get_code_item;
    END IF;
--
    code_item_id := FIND_ITEM(get_code_item);
    desc_item_id := FIND_ITEM(get_desc_item);
--
    cursor_current_value := UPPER(NAME_IN('SYSTEM.CURSOR_VALUE'));
  END;
--
-- Put back the original properties when the cursor is leaving the code item.           
--
  PROCEDURE post_text_code IS
  BEGIN
	  G$_TRACE_PKG.TRACE_RTN('G$_SEARCH.POST_TEXT_CODE');
  END;
--
-- Add Parameters
--
  PROCEDURE parameters ( code_table   VARCHAR2 := NULL,
                         desc_table   VARCHAR2 := NULL,
                         where_clause VARCHAR2 := NULL ) IS
--
    orig_lov_name  VARCHAR2(30);
    table_name     VARCHAR2(30);
    desc_name	     VARCHAR2(60);
    desc_id        ITEM;
--
  BEGIN
    IF code_table IS NULL AND 
       desc_table IS NULL AND 
       where_clause IS NULL THEN
      orig_lov_name := GET_ITEM_PROPERTY(get_code_item,LOV_NAME);
--
      IF orig_lov_name IS NOT NULL THEN
        table_name := UPPER(SUBSTR(orig_lov_name,1,Instr(orig_lov_name,'_')-1));
        col_code_table := table_name||'_CODE';
        col_desc_table := table_name||'_DESC';
      ELSE
        MESSAGE(G$_NLS.Get('GOQRPLS-0139','LIB','Procedure G$_SEARCH.PARAMETERS in trigger G$_SEARCH_PARAMETERS is missing parameters.'),ACKNOWLEDGE); 
        RAISE FORM_TRIGGER_FAILURE;
      END IF; 
    ELSE
      col_code_table := code_table;
      col_desc_table := desc_table;
      table_where_clause := where_clause;
    END IF;
--
    desc_name := NAME_IN('SYSTEM.TRIGGER_BLOCK')||'.'||GET_ITEM_PROPERTY(get_code_item,NEXTITEM);
    desc_id := FIND_ITEM(desc_name);
    hold_desc_item := desc_name;
    get_desc_item := NULL;
    IF NOT ID_NULL(desc_id) THEN
      IF GET_ITEM_PROPERTY(desc_id,HINT_TEXT) = 'G$_DESC_ITEM' THEN
        get_desc_item := desc_name;
      END IF;        
    END IF;
  END;
--
--
  PROCEDURE WHEN_MOUSE_CLICK IS
-- -- --
-- -- --
  CURRENT_BLOCK_FLD VARCHAR2(61) := NAME_IN('SYSTEM.MOUSE_ITEM');
-- -- --
-- -- --
  BEGIN
-- If item is not protected continue
    IF GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,UPDATEABLE) = 'TRUE' OR
      (GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,UPDATE_NULL) = 'TRUE' AND
       NAME_IN('SYSTEM.CURSOR_VALUE') IS NULL) OR
      (NAME_IN('SYSTEM.MODE') <> 'NORMAL' AND
       GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,QUERYABLE) = 'TRUE') OR
      (NAME_IN('SYSTEM.RECORD_STATUS') = 'NEW' AND
       GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,INSERT_ALLOWED) = 'TRUE') OR
      (NAME_IN('SYSTEM.RECORD_STATUS') = 'INSERT' AND
       GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,INSERT_ALLOWED) = 'TRUE') THEN
      IF (NVL(NAME_IN('SYSTEM.MOUSE_BUTTON_SHIFT_STATE'),'*') = 'Shift+') OR 
         (NVL(NAME_IN('SYSTEM.MOUSE_BUTTON_SHIFT_STATE'),'*') NOT IN ('Ctrl+','Control+') AND
         GET_MENU_ITEM_PROPERTY('ACTION.SELECT',ENABLED) = 'TRUE') THEN
        G$_MOUSE_DOUBLECLICK; 
      ELSE
        EXECUTE_TRIGGER('G$_SEARCH_OPTIONS');
        G$_CHECK_FAILURE;      
      END IF;
    ELSE
      MESSAGE(G$_NLS.Get('GOQRPLS-0140', 'LIB','*ERROR* Item is protected against update.'));                    
    END IF;  	
  END;
--
--
  PROCEDURE COLUMN_TO_CHAR(COL_NAME IN OUT VARCHAR2) IS
    v_string     VARCHAR2(100);
    v_col_table  VARCHAR2(100):= UPPER(SUBSTR(COL_NAME,1,instr(COL_NAME,'_')-1));
    v_owner      VARCHAR2(30):= NULL;
    v_table      VARCHAR2(30):= NULL;
--
    CURSOR Find_Owner1 (cp_col_table VARCHAR2) IS
      SELECT TABLE_NAME, USER
        FROM USER_TABLES
       WHERE TABLE_NAME = cp_col_table;
--
    CURSOR Find_Owner2 (cp_col_table VARCHAR2) IS
      SELECT TABLE_NAME, TABLE_OWNER
        FROM USER_SYNONYMS
       WHERE SYNONYM_NAME = cp_col_table;
--
    CURSOR Find_Owner3 (cp_col_table VARCHAR2) IS
      SELECT TABLE_NAME, TABLE_OWNER
-- 80-21 replace Oracle synonym with private synonym
--      FROM ALL_SYNONYMS
        FROM ALL_SYNONYMS_BANNER
       WHERE SYNONYM_NAME = cp_col_table
         AND OWNER = 'PUBLIC';
--
    CURSOR Data_Type_Cur (cp_column VARCHAR2, cp_table VARCHAR2, cp_owner VARCHAR2) IS
      SELECT DATA_TYPE 
        FROM ALL_TAB_COLUMNS 
       WHERE COLUMN_NAME = cp_column
         AND TABLE_NAME = cp_table
         AND OWNER = cp_owner;
  BEGIN
--
-- Find local table.
--
  	OPEN Find_Owner1(v_col_table);
  	FETCH Find_Owner1 INTO v_table, v_owner;
		CLOSE Find_Owner1;
--
-- Find local synonym.
--
  	IF v_table IS NULL THEN
    	OPEN Find_Owner2(v_col_table);
    	FETCH Find_Owner2 INTO v_table, v_owner;
		  CLOSE Find_Owner2;
--
-- Find public synonym.
--
    	IF v_table IS NULL THEN
      	OPEN Find_Owner3(v_col_table);
      	FETCH Find_Owner3 INTO v_table, v_owner;
		    CLOSE Find_Owner3;
  	  END IF;
  	END IF;
--
-- Find data type.
--
    OPEN Data_Type_Cur(UPPER(COL_NAME), v_table, v_owner);
    FETCH Data_Type_Cur INTO v_string;
    CLOSE Data_Type_Cur;
--
    IF v_string = 'DATE' THEN
      COL_NAME := 'to_char( '||COL_NAME||','''||G$_DATE.GET_NLS_DATE_FORMAT||''')';
    ELSIF v_string NOT IN ('VARCHAR2','CHAR') THEN 
      COL_NAME := 'to_char( '||COL_NAME||')';
    END IF;
  END;
--
--
  FUNCTION FIND_EXACT_MATCH(col_name1  VARCHAR2,
                            col_name2  VARCHAR2,
                            where_text VARCHAR2 := NULL) RETURN BOOLEAN IS
    tab_name       VARCHAR2(15)   := SUBSTR(col_name1,1,INSTR(col_name1,'_')-1);
    tab_name_join  VARCHAR2(15)   := SUBSTR(col_name2,1,INSTR(col_name1,'_')-1);
    where_clause   VARCHAR2(2000) := NULL;
    tab_join       VARCHAR2(15)   := NULL;
  BEGIN
    column1 := col_name1;
    column2 := col_name2;
    column_to_char(column1);
--
--  This is commented out for performance reasons.  The description will always be a
--  varchar2 and so it doesn't need to do the validation of data type.
--    column_to_char(column2);
--
    IF INSTR(cursor_current_value,'''') > 0 THEN
      cursor_current_value := REPLACE(cursor_current_value,'''','_');
    END IF;
--
    IF INSTR(cursor_current_value,'%') > 0 OR
       INSTR(cursor_current_value,'_') > 0 THEN
      RETURN(FALSE);
    ELSE
      IF where_text IS NULL THEN
        where_clause := 'WHERE ' ||column1|| ' = ' || ''''
                     || cursor_current_value || '''' ;
      ELSE
        where_clause := where_text || ' AND (' || column1 ||' = '
                     || '''' || cursor_current_value || '''' || ')';
      END IF;
--
      DEFINE_RG(where_clause);
--
      IF array_search_cnt = 1 THEN
        COPY(GET_GROUP_CHAR_CELL(rg_name||'.CODE',1),get_code_item);
        IF get_desc_item <> get_code_item THEN
          COPY(GET_GROUP_CHAR_CELL(rg_name||'.DESC', 1),get_desc_item);
        END IF;
        RETURN(TRUE);
      ELSE
        RETURN(FALSE);
      END IF;
    END IF;
  END;
--
--
  PROCEDURE DEFINE_RG (WHERE_CLAUSE in VARCHAR2) IS
    query_txt      VARCHAR2(2000) := NULL;
    tab_name       VARCHAR2(15)   := SUBSTR(col_code_table,1,INSTR(col_code_table,'_')-1);
    tab_name_join  VARCHAR2(15)   := SUBSTR(col_desc_table,1,INSTR(col_desc_table,'_')-1);
    tab_join       VARCHAR2(15)   := NULL;
    status         NUMBER;
  BEGIN
    IF tab_name <> tab_name_join THEN
      tab_join := ' ,'||tab_name_join;
    END IF;
--
    query_txt := 'SELECT ' ||  column2 || ' "DESC"' || ',' || column1
          || ' "CODE"' || ' FROM ' || tab_name || tab_join || ' ' || where_clause 
          || ' ORDER BY ' || col_code_table; 
--
    rg_id := FIND_GROUP(rg_name);    
    IF NOT ID_NULL(rg_id) THEN
      DELETE_GROUP(rg_id);
    END IF;
    rg_id := CREATE_GROUP_FROM_QUERY(rg_name, query_txt);
    status := POPULATE_GROUP(rg_id);
    array_search_cnt := GET_GROUP_ROW_COUNT(rg_id);
  END;
--
END;
		*/
				// 
		//  GLOBAL Variables
		// 
		//  GLOBAL.CODE:    a variable containing the value of search LOV
		//  GLOBAL.DESC:    a variable containing the value of search LOV
		// 
		private NNumber codeXPos= NNumber.getNull();
		//  x position of code item
		private NNumber descXPos= NNumber.getNull();
		//  x Position of description item 
		// 
		private NNumber origCodeWidth= NNumber.getNull();
		//  length of code item
		// 
		//  Names and pointers of code and description items
		// 
		private NString colCodeTable= NString.getNull();
		private NString colDescTable= NString.getNull();
		private NString getDescItem= NString.getNull();
		//  name of description item
		private NString getCodeItem= NString.getNull();
		//  name of Code item
		private NString holdDescItem= NString.getNull();
		//  name of description item
		private NString tableWhereClause= NString.getNull();
		// 
		private ItemDescriptor codeItemId= null;
		//  pointer to code item
		private ItemDescriptor descItemId= null;
		//  pointer to description item
		// 
		private NString codeBeforeSearch= NString.getNull();
		//  value of code before search trigger
		private NString cursorCurrentValue= NString.getNull();
		//  value of current content of CODE item 
		// 
		private NString rgName = toStr("HOLD_TABLE_RG");
		private ValueSet rgId = findGroup(rgName);
		//  pointer to a record group
		private NNumber arraySearchCnt= NNumber.getNull();
		// 
		private NString column1= NString.getNull();
		private NString column2= NString.getNull();
		// 
		private NBool lovInd = toBool(NBool.False);
		// 
		private NString lvErrMsg= NString.getNull();
		private NString lvErrMsg2= NString.getNull();
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param ind
		*/
		public void usedLov(NBool ind)
		{
			lovInd = ind;
		}
/* <p>
		* 
		*  Create record groups for code.  Record group has the code-description as 
		*  first column. 								
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param colName1
		* @param colName2
		*/
		public void createRecgroups(NString colName1, NString colName2) {
			createRecgroups(colName1, colName2, NString.getNull());
		}

/* <p>
		* 
		*  Create record groups for code.  Record group has the code-description as 
		*  first column. 								
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param colName1
		* @param colName2
		* @param whereText
		*/
		public void createRecgroups(NString colName1, NString colName2, NString whereText)
		{
			// 
			NString conditionType = toStr(" = ");
			NString whereClause = NString.getNull();
			if ( (inStr(cursorCurrentValue, toStr("%")).greater(0) || inStr(cursorCurrentValue, toStr("_")).greater(0)) && isNull(length(cursorCurrentValue), 0).notEquals(1) )
			{
				conditionType = toStr(" LIKE ");
			}
			// 
			if ( whereText.isNull() )
			{
				whereClause = toStr("WHERE ").append(column1).append(conditionType).append("'").append(cursorCurrentValue).append("'").append(" OR UPPER(").append(column2).append(")").append(conditionType).append("'").append(cursorCurrentValue).append("'");
			}
			else {
				whereClause = whereText.append(" AND (").append(column1).append(conditionType).append("'").append(cursorCurrentValue).append("'").append(" OR UPPER(").append(column2).append(")").append(conditionType).append("'").append(cursorCurrentValue).append("'").append(")");
			}
			// 
			defineRg(whereClause, false);
			// 
			//  Exactly one record was found that matched.
			// 
			if ( arraySearchCnt.equals(1) )
			{
				copy(getGroupCharCell(rgName.append(".CODE"), 1),getCodeItem);
				if ( getDescItem.notEquals(getCodeItem) )
				{
					copy(getGroupCharCell(rgName.append(".DESC"), 1),getDescItem);
				}
			}
			else if ( arraySearchCnt.greater(1) ) {
				copy("","GLOBAL.CODE");
				copy("","GLOBAL.DESC");
				setLovGroupName("G$_SEARCH_LOV", rgName);
				getContainer().gDisplayLov(toStr(""), toStr("G$_SEARCH_LOV"), toStr("Y"));
				if ( !getNameIn("global.code").isNull() )
				{
					copy(getNameIn("global.code"),getCodeItem);
					copy("","global.code");
					if ( getDescItem.notEquals(getCodeItem) )
					{
						copy(getNameIn("global.desc"),getDescItem);
						copy("","global.desc");
					}
				}
				removeGlobal("GLOBAL.CODE");
				removeGlobal("GLOBAL.DESC");
			}
			else {
				// 
				//  No records were found.  Check if the user is attempting to access the object table.  If
				//  not, continue as normal with the invalid message.  If they are attempting to access the
				//  object table (GUAGMNU, F5), we need to determine if it truly is invalid or they are not
				//  authorized to see the object because of security reasons.  Call the security package to 
				//  verify the object is valid and if so, call the security routine to log the security 
				//  violation.
				// 
				lvErrMsg = GNls.Fget(toStr("GOQRPLS-0133"), toStr("LIB"), toStr("*ERROR* %01% is invalid. LIST for valid choices."), cursorCurrentValue);
				// 
				if ( colCodeTable.equals("GUBOBJS_NAME") )
				{
					if ( in(getCursorItem(), "KEY_BLOCK.NEXT_SELECTION", "G$_NAV_BLOCK.GO_ITEM").getValue() )
					{
						// 
						if ( GChkAuth.gCheckValidObjFnc(cursorCurrentValue).isTrue() )
						{
							lvErrMsg = GNls.Fget(toStr("GOQRPLS-0134"), toStr("LIB"), toStr("User %01%/%02% is not authorized to access %03%."), getNameIn("GLOBAL.CURRENT_USER"), toStr(System.getProperty("user.name")), cursorCurrentValue);
							lvErrMsg2 = GNls.Fget(toStr("GOQRPLS-0135"), toStr("LIB"), toStr("User %01% is not authorized to access %02%."), getNameIn("GLOBAL.CURRENT_USER"), cursorCurrentValue);
							// 
							GSecurity.gCreateLogRecord(getNameIn("GLOBAL.CURRENT_USER"), cursorCurrentValue, lvErrMsg, toNumber(3));
							errorMessage(GNls.Fget(toStr("GOQRPLS-0136"), toStr("LIB"), toStr("*ERROR* ")).append(lvErrMsg2));
						}
						else {
							errorMessage(lvErrMsg);
						}
						copy("",getDescItem);
					}
					else {
						errorMessage(lvErrMsg);
					}
				}
				else {
					
					if(getCurrentBlock().equals("ESBLINK")){
						setGlobal("ERROR_DOUBLE", "searchErrorFirst");
					}
					errorMessage(lvErrMsg);
					
				}
				if ( getDescItem.notEquals(getCodeItem) )
				{
					copy("",getDescItem);
				}
				// 
				throw new ApplicationException();
			}
		}
/* <p>
		* 
		*  Perform a search for code or description when the value entered IF different
		*  from its original value.									
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void codeKeyNextItem()
		{
			NBool lovVar= NBool.getNull();
			try
			{
				if ( lovInd.equals(NBool.True) )
				{
					lovInd = toBool(NBool.False);
				}
				else {
					if ( getMode().notEquals("ENTER-QUERY") )
					{
						// 
						cursorCurrentValue = toStr(getItemValue(getCursorItem()));
						if (getItemIsValid(getCursorItem()).not() || (cursorCurrentValue.notEquals(codeBeforeSearch)) || (!cursorCurrentValue.isNull() && codeBeforeSearch.isNull()) )
						{
							//       
							if ( !cursorCurrentValue.isNull() )
							{
								if ( findExactMatch(colCodeTable, colDescTable, tableWhereClause).getValue() )
								{
									return ;
								}
								else {
									createRecgroups(colCodeTable, colDescTable, tableWhereClause);
								}
							}
						}
					}
				}
			}
			catch(NoDataFoundException e)
			{
				errorMessage(GNls.Fget(toStr("GOQRPLS-0137"), toStr("LIB"), toStr("Unable to retrieve records for LOV.")));
				throw new ApplicationException();
			} catch (ApplicationException e) {//Em caso de erro precisa de revalidar, para efectuar novamente createRecgroups. Bruno Aleluia, by Nuno Guerreiro.
				findItem(getCursorItem()).setValid(false);
				cursorCurrentValue = NString.getNull();
				codeBeforeSearch = NString.getNull();
				throw e;
			}
		}
/* <p>
		* 
		*  When entering a code item, expand the width of the code item appropriately 
		*  to provide extra spaces to perform a search on description.  					
		* 
/* </p>
		*/
		public void codeWhenNewItemInst()
		{
			// 
			NString currentBlock = getTriggerBlock();
			NString dataTypeParam= NString.getNull();
			NString itemAfter= NString.getNull();
			NString itemBefore= NString.getNull();
			// 
			NNumber newCodeWidth= NNumber.getNull();
			NNumber widthItemBefore= NNumber.getNull();
			NNumber xPosItemAfter= NNumber.getNull();
			NNumber yPosItemAfter= NNumber.getNull();
			NNumber yPosItemOrig= NNumber.getNull();
			// 
			NInteger sameYCode= NInteger.getNull();
			NInteger sameYNextItem= NInteger.getNull();
			getDescItem = toStr("");
			getCodeItem = toStr("");
			colCodeTable = toStr("");
			colDescTable = toStr("");
			tableWhereClause = toStr("");
			// 
			getCodeItem = getTriggerItem();
			// 
			//  This trigger is in the property_class assigned to the code item.
			// 
			executeAction("G$_SEARCH_PARAMETERS", currentBlock.getValue(), getTriggerField().getValue());
			getContainer().gCheckFailure();
			// 
			//  Capture the current value in item
			// 
			codeBeforeSearch = toStr(getItemValue(getCursorItem()));
			// 
			if ( colCodeTable.isNull() || colDescTable.isNull() )
			{
				errorMessage(GNls.Fget(toStr("GOQRPLS-0138"), toStr("LIB"), toStr("*ERROR* Need to pass parameters into G$_SEARCH_PARAMETERS")), OutputMessageUserResponse.ACKNOWLEDGE);
				throw new ApplicationException();
			}
			// 
			if ( getDescItem.isNull() )
			{
				getDescItem = getCodeItem;
			}
			// 
			codeItemId = findItem(getCodeItem);
			descItemId = findItem(getDescItem);
			// 
			cursorCurrentValue = upper(toStr(getItemValue(getCursorItem())));
		}
/* <p>
		* 
		*  Put back the original properties when the cursor is leaving the code item.           
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void postTextCode()
		{
			getContainer().getGTracePkg().traceRtn(toStr("G$_SEARCH.POST_TEXT_CODE"));
		}
/* <p>
		* 
		*  Add Parameters
		* 
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void parameters() {
			parameters(NString.getNull(), NString.getNull(), NString.getNull());
		}

/* <p>
		* 
		*  Add Parameters
		* 
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param codeTable
		*/
		public void parameters(NString codeTable) {
			parameters(codeTable, NString.getNull(), NString.getNull());
		}

/* <p>
		* 
		*  Add Parameters
		* 
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param codeTable
		* @param descTable
		*/
		public void parameters(NString codeTable, NString descTable) {
			parameters(codeTable, descTable, NString.getNull());
		}

/* <p>
		* 
		*  Add Parameters
		* 
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param codeTable
		* @param descTable
		* @param whereClause
		*/
		public void parameters(NString codeTable, NString descTable, NString whereClause)
		{
			// 
			NString origLovName= NString.getNull();
			NString tableName= NString.getNull();
			NString descName= NString.getNull();
			ItemDescriptor descId= null;
			if ( codeTable.isNull() && descTable.isNull() && whereClause.isNull() )
			{
				origLovName = getItemLovName(getCodeItem);
				// 
				if ( !origLovName.isNull() )
				{
					tableName = upper(substring(origLovName, toInt(1), inStr(origLovName, toStr("_")).subtract(1)));
					colCodeTable = tableName.append("_CODE");
					colDescTable = tableName.append("_DESC");
				}
				else {
					errorMessage(GNls.Fget(toStr("GOQRPLS-0139"), toStr("LIB"), toStr("Procedure G$_SEARCH.PARAMETERS in trigger G$_SEARCH_PARAMETERS is missing parameters.")), OutputMessageUserResponse.ACKNOWLEDGE);
					throw new ApplicationException();
				}
			}
			else {
				colCodeTable = codeTable;
				colDescTable = descTable;
				tableWhereClause = whereClause;
			}
			// 
			descName = getItemNextItem(getCodeItem);
			descId = findItem(descName);
			holdDescItem = descName;
			getDescItem = toStr(null);
			if ( !(descId == null) )
			{
				if ( getItemHint(descId).equals("G$_DESC_ITEM") )
				{
					getDescItem = descName;
				}
			}
		}
/* <p>
		* 
		* 
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void whenMouseClick()
		{
			//  -- --
			//  -- --
			NString currentBlockFld = getTriggerItem();
			//  If item is not protected continue
			// F2J_WARNING : The built-in  call was converted but there can be semantic differences in the resulting code.
			if ( getItemUpdateAllowed(currentBlockFld).equals("TRUE") ||
					//Morphis TODO Commented Reference to SupportClasses - JPB 
					(//SupportClasses.FORMS40.GetItemProperty(currentBlockFld, SupportClasses.Property.UPDATE_NULL).equals("TRUE") && SupportClasses.AppContext.CursorValue.isNull()) ||
					(getMode().notEquals("NORMAL") && getItemQueryAllowed(currentBlockFld).equals("TRUE")) || 
					(getRecordStatus().equals("NEW") && getItemInsertAllowed(currentBlockFld).equals("TRUE")) ||
					(getRecordStatus().equals("INSERT") && getItemInsertAllowed(currentBlockFld).equals("TRUE")) ))
			{
				// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
//				if ( (isNull(SupportClasses.AppContext.MouseButtonShiftState, "*").equals("Shift+")) ||
//						(!in(isNull(SupportClasses.AppContext.MouseButtonShiftState, "*"), "Ctrl+", "Control+").getValue() && getMenuItemEnabled("ACTION.SELECT")) )
//				{
					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
//					getContainer().gMouseDoubleclick();
//				}
//				else {
					executeAction("G$_SEARCH_OPTIONS");
					getContainer().gCheckFailure();
//				}
			}
//			else {
//				message(GNls.Fget(toStr("GOQRPLS-0140"), toStr("LIB"), toStr("*ERROR* Item is protected against update.")));
//			}
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param colName
		*/
		public void columnToChar(Ref<NString> colName)
		{
			int rowCount = 0;
			NString vString= NString.getNull();
			NString vColTable = upper(substring(colName.val, toInt(1), inStr(colName.val, toStr("_")).subtract(1)));
			NString vOwner = NString.getNull();
			NString vTable = NString.getNull();
			String sqlfindOwner1 = "SELECT TABLE_NAME, USER " +
	" FROM USER_TABLES " +
	" WHERE TABLE_NAME = :P_CP_COL_TABLE ";
			DataCursor findOwner1 = new DataCursor(sqlfindOwner1);
			String sqlfindOwner2 = "SELECT TABLE_NAME, TABLE_OWNER " +
	" FROM USER_SYNONYMS " +
	" WHERE SYNONYM_NAME = :P_CP_COL_TABLE ";
			DataCursor findOwner2 = new DataCursor(sqlfindOwner2);
			String sqlfindOwner3 = "SELECT TABLE_NAME, TABLE_OWNER " +
	" FROM ALL_SYNONYMS_BANNER " +
	" WHERE SYNONYM_NAME = :P_CP_COL_TABLE AND OWNER = 'PUBLIC' ";
			DataCursor findOwner3 = new DataCursor(sqlfindOwner3);
			NString cpColTable = NString.getNull();
			String sqldataTypeCur = "SELECT DATA_TYPE " +
	" FROM ALL_TAB_COLUMNS " +
	" WHERE COLUMN_NAME = :P_CP_COLUMN AND TABLE_NAME = :P_CP_TABLE AND OWNER = :P_CP_OWNER ";
			DataCursor dataTypeCur = new DataCursor(sqldataTypeCur);
			NString cpColumn = NString.getNull();
			NString cpTable = NString.getNull();
			NString cpOwner = NString.getNull();
			try {
				// 
				//  Find local table.
				// 
				cpColTable=vColTable;
				//Setting query parameters
				findOwner1.addParameter("P_CP_COL_TABLE", cpColTable);
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable findOwner1.
				findOwner1.open();
				ResultSet findOwner1Results = findOwner1.fetchInto();
				if ( findOwner1Results != null ) {
					vTable = findOwner1Results.getStr(0);
					vOwner = findOwner1Results.getStr(1);
				}
				findOwner1.close();
				// 
				//  Find local synonym.
				// 
				if ( vTable.isNull() )
				{
					cpColTable=vColTable;
					//Setting query parameters
					findOwner2.addParameter("P_CP_COL_TABLE", cpColTable);
					//F2J_WARNING : Make sure that the method "Close" is being called over the variable findOwner2.
					findOwner2.open();
					ResultSet findOwner2Results = findOwner2.fetchInto();
					if ( findOwner2Results != null ) {
						vTable = findOwner2Results.getStr(0);
						vOwner = findOwner2Results.getStr(1);
					}
					findOwner2.close();
					// 
					//  Find public synonym.
					// 
					if ( vTable.isNull() )
					{
						cpColTable=vColTable;
						//Setting query parameters
						findOwner3.addParameter("P_CP_COL_TABLE", cpColTable);
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable findOwner3.
						findOwner3.open();
						ResultSet findOwner3Results = findOwner3.fetchInto();
						if ( findOwner3Results != null ) {
							vTable = findOwner3Results.getStr(0);
							vOwner = findOwner3Results.getStr(1);
						}
						findOwner3.close();
					}
				}
				// 
				//  Find data type.
				// 
				cpColumn=upper(colName.val);
				cpTable=vTable;
				cpOwner=vOwner;
				//Setting query parameters
				dataTypeCur.addParameter("P_CP_COLUMN", cpColumn);
				dataTypeCur.addParameter("P_CP_TABLE", cpTable);
				dataTypeCur.addParameter("P_CP_OWNER", cpOwner);
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable dataTypeCur.
				dataTypeCur.open();
				ResultSet dataTypeCurResults = dataTypeCur.fetchInto();
				if ( dataTypeCurResults != null ) {
					vString = dataTypeCurResults.getStr(0);
				}
				dataTypeCur.close();
				// 
				if ( vString.equals("DATE") )
				{
					colName.val = toStr("to_char( ").append(colName.val).append(",'").append(GDate.getNlsDateFormat()).append("')");
				}
				else if ( !in(vString, "VARCHAR2", "CHAR").getValue() ) {
					colName.val = toStr("to_char( ").append(colName.val).append(")");
				}
				}finally{
					findOwner1.close();
					findOwner2.close();
					findOwner3.close();
					dataTypeCur.close();
				}
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param colName1
		* @param colName2
		*/
		public NBool findExactMatch(NString colName1, NString colName2) {
			return findExactMatch(colName1, colName2, NString.getNull());
		}

/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param colName1
		* @param colName2
		* @param whereText
		*/
		public NBool findExactMatch(NString colName1, NString colName2, NString whereText)
		{
			NString tabName = substring(colName1, toInt(1), inStr(colName1, toStr("_")).subtract(1));
			NString tabNameJoin = substring(colName2, toInt(1), inStr(colName1, toStr("_")).subtract(1));
			NString whereClause = NString.getNull();
			NString tabJoin = NString.getNull();
			column1 = colName1;
			column2 = colName2;
			Ref<NString> colName_ref = new Ref<NString>(column1);
			columnToChar(colName_ref);
			column1 = colName_ref.val;
			// 
			//   This is commented out for performance reasons.  The description will always be a
			//   varchar2 and so it doesn't need to do the validation of data type.
			//     column_to_char(column2);
			// 
			if ( inStr(cursorCurrentValue, toStr("'")).greater(0) )
			{
				cursorCurrentValue = replace(cursorCurrentValue, "'", "_");
			}
			// 
			if ( inStr(cursorCurrentValue, toStr("%")).greater(0) || inStr(cursorCurrentValue, toStr("_")).greater(0) )
			{
				return  toBool(((NBool.False)));
			}
			else {
				if ( whereText.isNull() )
				{
					whereClause = toStr("WHERE ").append(column1).append(" = ").append("'").append(cursorCurrentValue).append("'");
				}
				else {
					whereClause = whereText.append(" AND (").append(column1).append(" = ").append("'").append(cursorCurrentValue).append("'").append(")");
				}
				// 
				defineRg(whereClause, true);
				// 
				if ( arraySearchCnt.equals(1) )
				{
					copy(getGroupCharCell(rgName.append(".CODE"), 1),getCodeItem);
					if ( getDescItem.notEquals(getCodeItem) )
					{
						copy(getGroupCharCell(rgName.append(".DESC"), 1),getDescItem);
					}
					return  toBool(((NBool.True)));
				}
				else {
					return  toBool(((NBool.False)));
				}
			}
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param whereClause
		*/
		public void defineRg(NString whereClause, boolean distinct)
		{
			NString queryTxt = NString.getNull();
			NString tabName = substring(colCodeTable, toInt(1), inStr(colCodeTable, toStr("_")).subtract(1));
			NString tabNameJoin = substring(colDescTable, toInt(1), inStr(colDescTable, toStr("_")).subtract(1));
			NString tabJoin = NString.getNull();
			NNumber status= NNumber.getNull();
			if ( tabName.notEquals(tabNameJoin) )
			{
				tabJoin = toStr(" ,").append(tabNameJoin);
			}
			
			ArrayList<Object> parameterValues = new ArrayList<Object>();
			Pattern dynamicParamCreatorEx = Pattern.compile(":([a-z0-9_][a-z0-9_$]*|[a-z0-9_][a-z0-9_$]*\\.[a-z0-9_][a-z0-9_$]*)([\\s\\t,;\\)\\(\\n\\r]|$)", Pattern.CASE_INSENSITIVE | Pattern.MULTILINE);
			Matcher paramMatcher = dynamicParamCreatorEx.matcher(whereClause.getValue());
			int i = 0;
			StringBuffer whereBuilder = new StringBuffer();
			while (paramMatcher.find()){
				String param = paramMatcher.group(1);
				String morphisParam = param;
				String separator = paramMatcher.group(2);
				String[] slices = param.split("\\.");
				if (slices.length > 1)
					morphisParam = String.format("MORPHIS_%03d_%s", i, slices[1]);
				
				else
					morphisParam = String.format("MORPHIS_%03d_%s", i, param);
				
				paramMatcher.appendReplacement(whereBuilder, ":" + morphisParam + separator);
				parameterValues.add(nameIn( ":" + param));
				++i;
			}
			 paramMatcher.appendTail(whereBuilder);
			 whereClause = toStr(whereBuilder.toString());
			
			
			// 
			queryTxt = toStr("SELECT ");
			//MORPHIS TODO this is to resolve issue 10531 
			if(distinct)
				queryTxt = queryTxt.append("DISTINCT ");
			queryTxt = queryTxt.append(column1).append(" \"CODE\"").append(",").append(column2).append(" \"DESC\"").append(" FROM ").append(tabName).append(tabJoin).append(" ").append(whereClause).append(" ORDER BY ").append(colCodeTable);
			// 
			rgId = findGroup(rgName);
			if ( !(rgId == null) )
			{
				deleteGroup(rgId);
			}
			rgId = createGroupFromQuery(rgName, queryTxt);
			if (parameterValues.size() > 0)
				status = populateGroup(rgId, parameterValues.toArray());
			else
				status = populateGroup(rgId);
			arraySearchCnt = toNumber(getGroupRowCount(rgId));
		}
		
	
	
}
