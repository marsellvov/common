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
import net.hedtech.general.common.libraries.Eoqrpls.*;

public class GXeStateManager extends AbstractSupportCodeObject {
	

	public GXeStateManager(ISupportCodeContainer container) {
		super(container);
	}
	
	@Override
	public GoqrplsServices getContainer() {
		return (GoqrplsServices)super.getContainer();
	}
	//Original PL/SQL code for Package Prog Unit (SPEC) G$_XE_STATE_MANAGER
	/*
	PACKAGE G$_XE_STATE_MANAGER IS
  -- Gets maximum sequence in a stack
  FUNCTION GET_MAX_SEQ(form_name VARCHAR2) RETURN NUMBER;
  -- Gets the row with the matching object id in a stack
  FUNCTION GET_ROW(form_name VARCHAR2) RETURN NUMBER;
  -- Removes the form from the stack
  PROCEDURE DELETE_BXE_FROM_CALL_STACK(form_name VARCHAR2);
  -- Adds the for name with the generated object id to the stack  
  PROCEDURE FILL_GROUP_BXE_CALL(form_name VARCHAR2);
  -- Logging Manager
  PROCEDURE LOG_STATE_MANAGER; 
  -- Returns the Dirty State of Banner INB for all forms in a stack
  FUNCTION CHECK_ME RETURN VARCHAR2;
END;
	*/
	
	
			
		//Original PL/SQL code for Package Prog Unit (BODY) G$_XE_STATE_MANAGER
		/*
		PACKAGE BODY G$_XE_STATE_MANAGER IS
---  
PROCEDURE LOG_STATE_MANAGER IS
   group_id        RECORDGROUP;
   row_count       PLS_INTEGER;
   hold_form_name  VARCHAR2(7);
   --hold_form_seq   PLS_INTEGER;
   hold_form_seq   VARCHAR2(100);
   hold_form_state VARCHAR2(10);
   BEGIN
   	
   	group_id := FIND_GROUP('BXE_CALL_GRP');
--
    IF NOT ID_NULL(group_id) THEN
      row_count := GET_GROUP_ROW_COUNT(group_id);  -- count number of records in array
--
      FOR i IN 1..row_count LOOP
        hold_form_name := GET_GROUP_CHAR_CELL('BXE_CALL_GRP.FORM_NAME', i);
        --hold_form_seq := GET_GROUP_NUMBER_CELL('BXE_CALL_GRP.SEQ', i);
        hold_form_seq := GET_GROUP_CHAR_CELL('BXE_CALL_GRP.SEQ', i);
        hold_form_state := GET_GROUP_CHAR_CELL('BXE_CALL_GRP.DIRTY_STATE', i);
        
       --message(hold_form_name || ':' || hold_form_seq || ':' || hold_form_state );
      END LOOP;
--
    END IF;
--
END LOG_STATE_MANAGER;
--
--   
FUNCTION GET_MAX_SEQ(form_name VARCHAR2) RETURN NUMBER IS
    group_id        RECORDGROUP;
    hold_seq        PLS_INTEGER := 0;
    row_count       PLS_INTEGER;
    hold_form_name  VARCHAR2(7);
--
BEGIN
    group_id := FIND_GROUP('BXE_CALL_GRP');
--
    IF NOT ID_NULL(group_id) THEN
      row_count := GET_GROUP_ROW_COUNT(group_id);  -- count number of records in array
--
      FOR i IN REVERSE 1..row_count LOOP
        hold_form_name := GET_GROUP_CHAR_CELL('BXE_CALL_GRP.FORM_NAME', i);
--
        IF hold_form_name = form_name THEN
          hold_seq := GET_GROUP_NUMBER_CELL('BXE_CALL_GRP.SEQ', i);
          EXIT;
        END IF;
      END LOOP;
--
    END IF;
--
    RETURN hold_seq;
--
END GET_MAX_SEQ;
--
--
FUNCTION GET_ROW(form_name VARCHAR2) RETURN NUMBER IS
    group_id          RECORDGROUP;
    form_group_id     RECORDGROUP;
    hold_current_row  PLS_INTEGER := 0;
    row_count         PLS_INTEGER;
--
BEGIN
--        	       	
    group_id := FIND_GROUP('BXE_CALL_GRP');
   	form_group_id := FIND_GROUP('FORM_ID_GRP');
--
    IF (NOT ID_NULL(group_id) AND NOT ID_NULL(form_group_id)) THEN
      row_count := GET_GROUP_ROW_COUNT(group_id);
--
        FOR i IN 1..row_count LOOP
          IF (GET_GROUP_CHAR_CELL('BXE_CALL_GRP.SEQ', i) = GET_GROUP_CHAR_CELL('FORM_ID_GRP.ID', 1)) THEN
          	  hold_current_row := i;
          	  EXIT;
          END IF;         
        END LOOP;
     END IF;       
--
    RETURN hold_current_row;
--
END GET_ROW;
--
--
PROCEDURE DELETE_BXE_FROM_CALL_STACK(form_name VARCHAR2) IS
    group_id  RECORDGROUP;
    max_seq   PLS_INTEGER;
--
BEGIN
    group_id := FIND_GROUP('BXE_CALL_GRP');
--
    IF NOT ID_NULL(group_id) THEN
      max_seq := GET_ROW(form_name);
      IF max_seq > 0 THEN
        DELETE_GROUP_ROW(group_id, max_seq);
      END IF;
    END IF;
END DELETE_BXE_FROM_CALL_STACK;
--
--
PROCEDURE FILL_GROUP_BXE_CALL(form_name VARCHAR2) IS
    group_id        RECORDGROUP;
    form_group_id   RECORDGROUP;
    form_col_id     GROUPCOLUMN;
    col_id          GROUPCOLUMN;
    row_count       PLS_INTEGER;
--
BEGIN
--
-- Call this Procedure only when XE INTEGRATION is ON
--
    DEFAULT_VALUE('N','GLOBAL.BANNER_XE_MODE');
    IF NAME_IN('GLOBAL.BANNER_XE_MODE') != 'Y' THEN
      RETURN;
    END IF;
--
   
--
   IF form_name NOT IN ('SOQMENU','GOQMENU') THEN
   	
   -------------------------- NOT GLOBAL----------------------
  
   
    group_id := FIND_GROUP('BXE_CALL_GRP');
   	form_group_id := FIND_GROUP('FORM_ID_GRP');
--
    IF (NOT ID_NULL(group_id) AND NOT ID_NULL(form_group_id)) THEN -- update itself
      row_count := GET_GROUP_ROW_COUNT(group_id);  -- count number of records in array
--

        FOR i IN 1..row_count LOOP
          IF (GET_GROUP_CHAR_CELL('BXE_CALL_GRP.SEQ', i) = GET_GROUP_CHAR_CELL('FORM_ID_GRP.ID', 1)) THEN
          	  SET_GROUP_CHAR_CELL('BXE_CALL_GRP.DIRTY_STATE', i, NAME_IN('SYSTEM.FORM_STATUS'));
          END IF;
          
          END LOOP;
       LOG_STATE_MANAGER;
       RETURN;
     END IF;

--
    IF ID_NULL(form_group_id) THEN
      form_group_id := CREATE_GROUP('FORM_ID_GRP',FORM_SCOPE);
      form_col_id := ADD_GROUP_COLUMN(form_group_id,'ID', CHAR_COLUMN, 100);
      
       ADD_GROUP_ROW(form_group_id,1);
--
  
       SET_GROUP_CHAR_CELL('FORM_ID_GRP.ID', 1, to_char(SYSDATE,'DDMONYYYHH24MISS'));
--
    END IF;
    
   	
    group_id := FIND_GROUP('BXE_CALL_GRP');
--
-- create new array
--
    IF ID_NULL(group_id) THEN
      group_id := CREATE_GROUP('BXE_CALL_GRP', GLOBAL_SCOPE);
      --col_id := ADD_GROUP_COLUMN(group_id,'seq', NUMBER_COLUMN);
      col_id := ADD_GROUP_COLUMN(group_id,'seq', CHAR_COLUMN, 100);
      col_id := ADD_GROUP_COLUMN(group_id,'form_name', CHAR_COLUMN, 10);
      col_id := ADD_GROUP_COLUMN(group_id,'dirty_state', CHAR_COLUMN, 10);
    END IF;
    
--
-- Get count of records in array and increment by one
--
    row_count := GET_GROUP_ROW_COUNT(group_id) + 1;  
    ADD_GROUP_ROW(group_id,row_count);
--
    --SET_GROUP_NUMBER_CELL('BXE_CALL_GRP.SEQ',row_count, GET_MAX_SEQ(form_name) + 1);
    SET_GROUP_CHAR_CELL('BXE_CALL_GRP.SEQ',row_count, GET_GROUP_CHAR_CELL('FORM_ID_GRP.ID', 1));
    SET_GROUP_CHAR_CELL('BXE_CALL_GRP.FORM_NAME',row_count, form_name);
    SET_GROUP_CHAR_CELL('BXE_CALL_GRP.DIRTY_STATE',row_count, NAME_IN('SYSTEM.FORM_STATUS'));
    
   END IF;
--
  LOG_STATE_MANAGER;
--
END FILL_GROUP_BXE_CALL;
--
--
FUNCTION CHECK_ME RETURN VARCHAR2 IS
  --SET_GROUP_CHAR_CELL('BXE_CALL_GRP.DIRTY_STATE', GET_ROW(NAME_IN('SYSTEM.FORM_STATUS')), NAME_IN('SYSTEM.FORM_STATUS'));
  
   group_id        RECORDGROUP;
   form_group_id   RECORDGROUP;
   row_count       PLS_INTEGER;
   hold_form_name  VARCHAR2(7);
   hold_form_seq   VARCHAr2(100);
   hold_form_state VARCHAR2(10);
   dirty_state     VARCHAR2(1) := 'N';
BEGIN
--   	
   	group_id := FIND_GROUP('BXE_CALL_GRP');
   	form_group_id := FIND_GROUP('FORM_ID_GRP');
--
    IF (NOT ID_NULL(group_id) AND NOT ID_NULL(form_group_id)) THEN -- update itself
      row_count := GET_GROUP_ROW_COUNT(group_id);  -- count number of records in array
--

        FOR i IN 1..row_count LOOP
          --hold_form_seq := GET_GROUP_CHAR_CELL('BXE_CALL_GRP.SEQ', i);
          IF (GET_GROUP_CHAR_CELL('BXE_CALL_GRP.SEQ', i) = GET_GROUP_CHAR_CELL('FORM_ID_GRP.ID', 1)) THEN
          	  SET_GROUP_CHAR_CELL('BXE_CALL_GRP.DIRTY_STATE', i, NAME_IN('SYSTEM.FORM_STATUS'));
          END IF;
          
          END LOOP;
     END IF;
 --     
   IF NOT ID_NULL(group_id) THEN
--
   	     row_count := GET_GROUP_ROW_COUNT(group_id);  -- count number of records in array
-- 
      FOR i IN 1..row_count LOOP
        hold_form_state := GET_GROUP_CHAR_CELL('BXE_CALL_GRP.DIRTY_STATE', i);
--       
        IF hold_form_state = 'CHANGED' THEN
        	 dirty_state := 'Y';
           EXIT;
        END IF;
      END LOOP;        
   END IF;
--       
       IF  NAME_IN('SYSTEM.FORM_STATUS') = 'CHANGED' THEN
       	   dirty_state := 'Y';
       END IF;
--  
        -- debug area
-- --        delete from log_banner_session
-- --        where banner_sid = sys_context('USERENV','SID'); 
-- --        
-- --        insert into log_banner_session (banner_sid, wl_process, user_machine, banner_user,  banner_state, banner_state_list,banner_logon_time, banner_activity_date)
-- --        select sid, process,machine,user,dirty_state,null,logon_time,sysdate
-- --        from v$session
-- --        where sid = sys_context('USERENV','SID'); 
-- --                              
-- --        --insert into log_banner (banner_user, banner_state) values (user,dirty_state);
-- --        FORMS_DDL('begin commit; end;');
        -- end debug
        --     
        RETURN dirty_state;
--     
END CHECK_ME;
--
--
END G$_XE_STATE_MANAGER;
		*/
		/* <p>
		* -  
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void logStateManager()
		{
			ValueSet groupId= null;
			NInteger rowCount= NInteger.getNull();
			NString holdFormName= NString.getNull();
			// hold_form_seq   PLS_INTEGER;
			NString holdFormSeq= NString.getNull();
			NString holdFormState= NString.getNull();
			groupId = findGroup("BXE_CALL_GRP");
			// 
			if ( !(groupId == null) )
			{
				rowCount = toInt(getGroupRowCount(groupId));
				//  count number of records in array
				// 
				for ( int i = 1; i <= rowCount.toInt32(); i++ )
				{
					holdFormName = getGroupCharCell("BXE_CALL_GRP.FORM_NAME", i);
					// hold_form_seq := GET_GROUP_NUMBER_CELL('BXE_CALL_GRP.SEQ', i);
					holdFormSeq = getGroupCharCell("BXE_CALL_GRP.SEQ", i);
					holdFormState = getGroupCharCell("BXE_CALL_GRP.DIRTY_STATE", i);
				}
			}
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
			groupId = findGroup("BXE_CALL_GRP");
			// 
			if ( !(groupId == null) )
			{
				rowCount = toInt(getGroupRowCount(groupId));
				//  count number of records in array
				// 
				for ( int i = rowCount.toInt32(); i >= 1; i-- )
				{
					holdFormName = getGroupCharCell("BXE_CALL_GRP.FORM_NAME", i);
					// 
					if ( holdFormName.equals(formName) )
					{
						holdSeq = getGroupNumberCell("BXE_CALL_GRP.SEQ", i);
							break;
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
		* @param formName
		*/
		public NNumber getRow(NString formName)
		{
			ValueSet groupId= null;
			ValueSet formGroupId= null;
			NNumber holdCurrentRow = toNumber(0);
			NInteger rowCount= NInteger.getNull();
			//         	       	
			groupId = findGroup("BXE_CALL_GRP");
			formGroupId = findGroup("FORM_ID_GRP");
			// 
			if ((!(groupId == null) && !(formGroupId == null)))
			{
				rowCount = toInt(getGroupRowCount(groupId));
				// 
				for ( int i = 1; i <= rowCount.toInt32(); i++ )
				{
					if ((getGroupCharCell("BXE_CALL_GRP.SEQ", i).equals(getGroupCharCell("FORM_ID_GRP.ID", 1))))
					{
						holdCurrentRow = toNumber(i);
							break;
					}
				}
			}
			// 
			return holdCurrentRow;
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param formName
		*/
		public void deleteBxeFromCallStack(NString formName)
		{
			ValueSet groupId= null;
			NInteger maxSeq= NInteger.getNull();
			groupId = findGroup("BXE_CALL_GRP");
			// 
			if ( !(groupId == null) )
			{
				maxSeq = toInt(getRow(formName));
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
		*/
		public void fillGroupBxeCall(NString formName)
		{
			ValueSet groupId= null;
			ValueSet formGroupId= null;
			ValueSetColumn formColId= null;
			ValueSetColumn colId= null;
			NInteger rowCount= NInteger.getNull();
			// 
			//  Call this Procedure only when XE INTEGRATION is ON
			// 
			setDefaultValue("N", "GLOBAL.BANNER_XE_MODE");
			if ( getNameIn("GLOBAL.BANNER_XE_MODE").notEquals("Y") )
			{
				return ;
			}
			// 
			// 
			if ( !in(formName, "SOQMENU", "GOQMENU").getValue() )
			{
				// ------------------------ NOT GLOBAL----------------------
				groupId = findGroup("BXE_CALL_GRP");
				formGroupId = findGroup("FORM_ID_GRP");
				// 
				if ((!(groupId == null) && !(formGroupId == null)))
				{
					//  update itself
					rowCount = toInt(getGroupRowCount(groupId));
					//  count number of records in array
					// 
					for ( int i = 1; i <= rowCount.toInt32(); i++ )
					{
						if ((getGroupCharCell("BXE_CALL_GRP.SEQ", i).equals(getGroupCharCell("FORM_ID_GRP.ID", 1))))
						{
							setGroupCharCell("BXE_CALL_GRP.DIRTY_STATE", i, toStr(getTaskStatus()));
						}
					}
					logStateManager();
					return ;
				}
				// 
				if ( (formGroupId == null) )
				{
					formGroupId = createGroup("FORM_ID_GRP");
					formColId = addGroupColumn(formGroupId, "ID", ValueSetColumn.CHAR_COL, 100);
					//WARNING: only adding rows at the end is supported
					addGroupRow(formGroupId);
					// 
					setGroupCharCell("FORM_ID_GRP.ID", 1, toChar(NDate.getNow(), "DDMONYYYHH24MISS"));
				}
				groupId = findGroup("BXE_CALL_GRP");
				// 
				//  create new array
				// 
				if ( (groupId == null) )
				{
					//MORPHIS: TODO Support this feature
					//groupId = createGroup("BXE_CALL_GRP", SupportClasses.Constants.GLOBAL_SCOPE);
					groupId = createGroup("BXE_CALL_GRP");
					// col_id := ADD_GROUP_COLUMN(group_id,'seq', NUMBER_COLUMN);
					colId = addGroupColumn(groupId, "seq", ValueSetColumn.CHAR_COL, 100);
					colId = addGroupColumn(groupId, "form_name", ValueSetColumn.CHAR_COL, 10);
					colId = addGroupColumn(groupId, "dirty_state", ValueSetColumn.CHAR_COL, 10);
				}
				// 
				//  Get count of records in array and increment by one
				// 
				rowCount = toInt(getGroupRowCount(groupId) + 1);
				//WARNING: only adding rows at the end is supported
				addGroupRow(groupId);
				// 
				// SET_GROUP_NUMBER_CELL('BXE_CALL_GRP.SEQ',row_count, GET_MAX_SEQ(form_name) + 1);
				setGroupCharCell("BXE_CALL_GRP.SEQ", rowCount.toInt32(), getGroupCharCell("FORM_ID_GRP.ID", 1));
				setGroupCharCell("BXE_CALL_GRP.FORM_NAME", rowCount.toInt32(), formName);
				setGroupCharCell("BXE_CALL_GRP.DIRTY_STATE", rowCount.toInt32(), toStr(getTaskStatus()));
			}
			// 
			logStateManager();
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString checkMe()
		{
			// SET_GROUP_CHAR_CELL('BXE_CALL_GRP.DIRTY_STATE', GET_ROW(NAME_IN('SYSTEM.FORM_STATUS')), NAME_IN('SYSTEM.FORM_STATUS'));
			ValueSet groupId= null;
			ValueSet formGroupId= null;
			NInteger rowCount= NInteger.getNull();
			NString holdFormName= NString.getNull();
			NString holdFormSeq= NString.getNull();
			NString holdFormState= NString.getNull();
			NString dirtyState = toStr("N");
			//    	
			groupId = findGroup("BXE_CALL_GRP");
			formGroupId = findGroup("FORM_ID_GRP");
			// 
			if ((!(groupId == null) && !(formGroupId == null)))
			{
				//  update itself
				rowCount = toInt(getGroupRowCount(groupId));
				//  count number of records in array
				// 
				for ( int i = 1; i <= rowCount.toInt32(); i++ )
				{
					// hold_form_seq := GET_GROUP_CHAR_CELL('BXE_CALL_GRP.SEQ', i);
					if ((getGroupCharCell("BXE_CALL_GRP.SEQ", i).equals(getGroupCharCell("FORM_ID_GRP.ID", 1))))
					{
						setGroupCharCell("BXE_CALL_GRP.DIRTY_STATE", i, toStr(getTaskStatus()));
					}
				}
			}
			//      
			if ( !(groupId == null) )
			{
				// 
				rowCount = toInt(getGroupRowCount(groupId));
				//  count number of records in array
				//  
				for ( int i = 1; i <= rowCount.toInt32(); i++ )
				{
					holdFormState = getGroupCharCell("BXE_CALL_GRP.DIRTY_STATE", i);
					//        
					if ( holdFormState.equals("CHANGED") )
					{
						dirtyState = toStr("Y");
							break;
					}
				}
			}
			//        
			if ( getTaskStatus().equals("CHANGED") )
			{
				dirtyState = toStr("Y");
			}
			//   
			//  debug area
			//  --        delete from log_banner_session
			//  --        where banner_sid = sys_context('USERENV','SID'); 
			//  --        
			//  --        insert into log_banner_session (banner_sid, wl_process, user_machine, banner_user,  banner_state, banner_state_list,banner_logon_time, banner_activity_date)
			//  --        select sid, process,machine,user,dirty_state,null,logon_time,sysdate
			//  --        from v$session
			//  --        where sid = sys_context('USERENV','SID'); 
			//  --                              
			//  --        --insert into log_banner (banner_user, banner_state) values (user,dirty_state);
			//  --        FORMS_DDL('begin commit; end;');
			//  end debug
			//      
			return dirtyState;
		}
		
	
	
}
