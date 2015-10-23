package net.hedtech.banner.general.common.Gutpmnu.services;

import java.util.*;

import org.jdesktop.databuffer.DataRow.DataRowStatus;

import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.events.*;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.*;
import morphis.foundations.core.appsupportlib.exceptions.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appsupportlib.util.*;
import morphis.foundations.core.appsupportlib.runtime.*;
import morphis.foundations.core.appsupportlib.runtime.control.*;
import morphis.foundations.core.appsupportlib.runtime.events.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.*;
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
import static morphis.foundations.core.appsupportlib.runtime.ListServices.*;
import static morphis.foundations.core.appsupportlib.runtime.TreeServices.*;
import static morphis.foundations.core.appsupportlib.Math.*;
import static morphis.foundations.core.appsupportlib.Lib.*;
import static morphis.foundations.core.appsupportlib.Globals.*;
import static morphis.foundations.core.types.Types.*;
import morphis.foundations.core.util.*;
import net.hedtech.banner.general.common.Gutpmnu.*;
import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Goqgmnu.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.banner.general.common.Gutpmnu.model.*;



public class GutpmnuServices extends AbstractSupportCodeObject{
	
	
	public GutpmnuServices(ISupportCodeContainer container) {
		super(container);
	}
	
	public GutpmnuTask  getTask() {
		return (GutpmnuTask )super.getContainer();
	}

	
	public net.hedtech.banner.general.common.Gutpmnu.model.GutpmnuModel getFormModel() {
		return getTask().getModel();
	}

	/* Original PL/SQL code for Prog Unit USER_ECM_GROUP
	
	PROCEDURE USER_ECM_GROUP IS
  GROUP_ID RECORDGROUP := FIND_GROUP('USER_EXMENU');
  ITEM_ID  ITEM        := FIND_ITEM('CUST_USER_ID');
BEGIN 
   IF NOT ID_NULL(GROUP_ID) THEN
     DELETE_GROUP(GROUP_ID);
     CLEAR_LIST('CUST_USER_ID');
   END IF;
--
   GROUP_ID := CREATE_GROUP_FROM_QUERY('USER_EXMENU','SELECT DISTINCT GURMENU_USER_ID ,GURMENU_USER_ID '||
                                       'FROM GURMENU WHERE GURMENU_NAME = ''*PERSONAL'' and
                                        GURMENU_USER_ID NOT IN '||'(''BASELINE'',''LOCAL'' ) ORDER BY 1');
   IF POPULATE_GROUP(GROUP_ID)!= 0 THEN 
     NULL; 
   END IF;
   POPULATE_LIST(ITEM_ID,GROUP_ID);
END;
	*/
	//ID:1011
	/* <p>
/* </p>
		*/
		public void userEcmGroup()
		{
			ValueSet groupId = findGroup("USER_EXMENU");
			ItemDescriptor itemId = findItem(toStr("CUST_USER_ID"));
			if ( !(groupId == null) )
			{
				deleteGroup(groupId);
				clearList("CUST_USER_ID");
			}
			//ORIGINAL 
		//	groupId = createGroupFromQuery("USER_EXMENU", toStr("SELECT DISTINCT GURMENU_USER_ID, GURMENU_USER_ID AS GURMENU_USER_ID_1 ").append("FROM GURMENU WHERE GURMENU_NAME = '*PERSONAL' and GURMENU_USER_ID NOT IN ").append("('BASELINE','LOCAL' ) ORDER BY 1"));
			groupId = createGroupFromQuery("USER_EXMENU", toStr("SELECT DISTINCT GURMENU_USER_ID, GURMENU_USER_ID AS GURMENU_USER_ID_1 ").append("FROM GURMENU WHERE GURMENU_NAME = '*PERSONAL' and GURMENU_USER_ID NOT IN 'BASELINE' and GURMENU_USER_ID NOT IN 'LOCAL' ORDER BY 1"));
			groupId.getPageSettings().setHasPagination(false);	
			if ( populateGroup(groupId).notEquals(0) )
			{		
			}
			populateList(itemId, groupId);
		}

	
	/* Original PL/SQL code for Prog Unit USER_REC_GROUP
	
	PROCEDURE USER_REC_GROUP IS
  RG_NAME     VARCHAR2(10):= 'USER_RG';
  RG_ID       RECORDGROUP := FIND_GROUP(RG_NAME);
  RC_ID       GROUPCOLUMN;
  VAL_TYPE    NUMBER;
  MAX_ROW     NUMBER;
  AL_BUTTON   NUMBER;
  AL_MSG      VARCHAR2(80);
BEGIN
  IF ID_NULL(RG_ID) THEN
    RG_ID := CREATE_GROUP(RG_NAME);
    RC_ID := ADD_GROUP_COLUMN(RG_ID,'USER_NAME',CHAR_COLUMN,30);
    RC_ID := ADD_GROUP_COLUMN(RG_ID,'USER_ID',NUMBER_COLUMN);
    RC_ID := ADD_GROUP_COLUMN(RG_ID,'FLAG',CHAR_COLUMN,1);
  END IF;
--
  IF :SYSTEM.CURSOR_ITEM = 'FORM_HEADER.CUST_USER_ID' THEN
    IF POPULATE_GROUP_WITH_QUERY(RG_ID,'SELECT USERNAME,USER_ID,NULL FROM ALL_USERS'||
                                       ' ORDER BY USERNAME') <> 0 THEN  
      NULL;
    END IF;
  ELSE   
    IF :USER_SEARCH IS NOT NULL THEN
      BEGIN
        VAL_TYPE := TO_NUMBER(:USER_SEARCH);
        IF POPULATE_GROUP_WITH_QUERY(RG_ID,'SELECT USERNAME,USER_ID,NULL FROM ALL_USERS '||
                                           ' WHERE USER_ID LIKE   ''''||:USER_SEARCH||''%''||'''''|| 
                                           ' ORDER BY USERNAME') <> 0 THEN 
          NULL;
        END IF;
      EXCEPTION
        WHEN VALUE_ERROR THEN
          IF POPULATE_GROUP_WITH_QUERY(RG_ID,'SELECT USERNAME,USER_ID,NULL FROM ALL_USERS '||
                                      ' WHERE USERNAME LIKE ''''||:USER_SEARCH||''%''||'''''||
                                      ' AND USERNAME NOT IN (''SYS'',''SYSTEM'')'||
                                      ' ORDER BY USERNAME') <> 0 THEN 
            NULL;
          END IF;
      END;
    ELSE
    	IF POPULATE_GROUP_WITH_QUERY(RG_ID,'SELECT USERNAME,USER_ID,NULL FROM ALL_USERS'||
                                        ' ORDER BY USERNAME') <> 0 THEN 
        NULL;
      END IF;
    END IF;
--
    SET_BLOCK_PROPERTY('ALL_USERS_BLOCK',UPDATE_ALLOWED,PROPERTY_TRUE);
    SET_BLOCK_PROPERTY('ALL_USERS_BLOCK',DELETE_ALLOWED,PROPERTY_TRUE);
    SET_BLOCK_PROPERTY('ALL_USERS_BLOCK',INSERT_ALLOWED,PROPERTY_TRUE);
--
    MAX_ROW := GET_GROUP_ROW_COUNT(RG_ID);
    FOR RG_REC IN 1..MAX_ROW LOOP
      :USER_NAME := GET_GROUP_CHAR_CELL('USER_RG.USER_NAME',RG_REC);
      :USER_ID   := GET_GROUP_NUMBER_CELL('USER_RG.USER_ID',RG_REC);
      CREATE_RECORD;
    END LOOP;
    DELETE_RECORD;
--
    SET_BLOCK_PROPERTY('ALL_USERS_BLOCK',UPDATE_ALLOWED,PROPERTY_FALSE);
    SET_BLOCK_PROPERTY('ALL_USERS_BLOCK',DELETE_ALLOWED,PROPERTY_FALSE);
    SET_BLOCK_PROPERTY('ALL_USERS_BLOCK',INSERT_ALLOWED,PROPERTY_FALSE);
    FIRST_RECORD;
--
    IF MAX_ROW = 1 THEN
      IF :CUST_USER_ID = GET_GROUP_CHAR_CELL('USER_RG.USER_NAME',:SYSTEM.TRIGGER_RECORD) THEN
        AL_MSG :=  G$_NLS.Get('GUTPMNU-0045', 'FORM','*ERROR* You can not copy menu to itself!') ;
        SET_ALERT_PROPERTY('ALERT',ALERT_MESSAGE_TEXT,AL_MSG);
        AL_BUTTON := SHOW_ALERT('ALERT');
        GO_ITEM('USER_SEARCH');
      ELSE
        SET_GROUP_CHAR_CELL('USER_RG.FLAG',:SYSTEM.TRIGGER_RECORD,'Y');
        SET_ITEM_INSTANCE_PROPERTY(:SYSTEM.CURRENT_ITEM,CURRENT_RECORD,VISUAL_ATTRIBUTE,'LOCAL_TEXT');
        NEXT_ITEM;
        SET_ITEM_INSTANCE_PROPERTY(:SYSTEM.CURRENT_ITEM,CURRENT_RECORD,VISUAL_ATTRIBUTE,'LOCAL_TEXT');
        NEXT_ITEM;
      END IF;
    END IF;
  END IF;
END;
	*/
	//ID:1012
	/* <p>
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void userRecGroup(AllUsersBlockAdapter allUsersBlockElement)
		{
			NString rgName = toStr("USER_RG");
			ValueSet rgId = findGroup(rgName);
			ValueSetColumn rcId= null;
			NNumber valType= NNumber.getNull();
			NNumber maxRow= NNumber.getNull();
			NNumber alButton= NNumber.getNull();
			NString alMsg= NString.getNull();
			if ( (rgId == null) )
			{
				rgId = createGroup(rgName);
				rcId = addGroupColumn(rgId, "USERNAME", ValueSetColumn.CHAR_COL, 30);
				rcId = addGroupColumn(rgId, "USER_ID", ValueSetColumn.NUMBER_COL);
				rcId = addGroupColumn(rgId, "FLAG", ValueSetColumn.CHAR_COL, 1);
			}
			
			
			if(rgId != null)
			{
				rgId.getPageSettings().setHasPagination(false);
			}
			// 
			if ( getCursorItem().equals("FORM_HEADER.CUST_USER_ID") )
			{
				if ( populateGroupWithQuery(rgId, toStr("SELECT USERNAME,USER_ID FROM ALL_USERS").append(" ORDER BY USERNAME")).notEquals(0) )
					//if ( populateGroupWithQuery(rgId, toStr("SELECT USERNAME,USER_ID,NULL FROM ALL_USERS").append(" ORDER BY USERNAME")).notEquals(0) )	
				{
				}
			}
			else {
				if ( !getFormModel().getFormHeader().getUserSearch().isNull() )
				{
					try
					{
						valType = toNumber(getFormModel().getFormHeader().getUserSearch());
						if ( populateGroupWithQuery(rgId, toStr("SELECT USERNAME,USER_ID,NULL FROM ALL_USERS ").append(" WHERE USER_ID LIKE ").append("'").append(getItemValue("FORM_HEADER.USER_SEARCH")).append("%'").append(" ORDER BY USERNAME")).notEquals(0) )
								
//						if ( populateGroupWithQuery(rgId, toStr("SELECT USERNAME,USER_ID,NULL FROM ALL_USERS ").append(" WHERE USER_ID LIKE   ''||:USER_SEARCH||'%'||''").append(" ORDER BY USERNAME")).notEquals(0) )
						{
						}
					}
					catch(Exception e)
					{
						if ( populateGroupWithQuery(rgId, toStr("SELECT USERNAME,USER_ID,NULL FROM ALL_USERS ").append(" WHERE USERNAME LIKE ").append("'").append(getItemValue("FORM_HEADER.USER_SEARCH")).append("%'").append(" AND USERNAME NOT IN ('SYS','SYSTEM')").append(" ORDER BY USERNAME")).notEquals(0) )
							
						//if ( populateGroupWithQuery(rgId, toStr("SELECT USERNAME,USER_ID,NULL FROM ALL_USERS ").append(" WHERE USERNAME LIKE ''||:USER_SEARCH||'%'||''").append(" AND USERNAME NOT IN ('SYS','SYSTEM')").append(" ORDER BY USERNAME")).notEquals(0) )
						{
						}
					}
				}
				else {
					
					if ( populateGroupWithQuery(rgId, toStr("SELECT USERNAME,USER_ID,NULL FROM ALL_USERS").append(" ORDER BY USERNAME")).notEquals(0) )
					{
					}
				}
				// 
				setBlockUpdateAllowed("ALL_USERS_BLOCK", true);
				setBlockDeleteAllowed("ALL_USERS_BLOCK", true);
				setBlockInsertAllowed("ALL_USERS_BLOCK", true);
				// 
				maxRow = toNumber(getGroupRowCount(rgId));
			
				
			
				for ( int rgRec = 1; maxRow.greaterOrEquals(rgRec); rgRec++ )
				{
					allUsersBlockElement.setUserName(getGroupCharCell("USER_RG.USERNAME", rgRec));
					allUsersBlockElement.setUserId(getGroupNumberCell("USER_RG.USER_ID", rgRec));
//					
				
					createRecord();
				}
				deleteRecord();
				// 
				setBlockUpdateAllowed("ALL_USERS_BLOCK", false);
				setBlockDeleteAllowed("ALL_USERS_BLOCK", false);
				setBlockInsertAllowed("ALL_USERS_BLOCK", false);
				firstRecord();
				// 
				if ( maxRow.equals(1) )
				{
					if ( getFormModel().getFormHeader().getCustUserId().equals(getGroupCharCell(toStr("USER_RG.USER_NAME"), toInt(getTriggerRecord()))) )
					{
						alMsg = GNls.Fget(toStr("GUTPMNU-0045"), toStr("FORM"), toStr("*ERROR* You can not copy menu to itself!"));
						setAlertMessageText("ALERT", alMsg);
						alButton = toNumber(showAlert("ALERT"));
						goItem(toStr("USER_SEARCH"));
					}
					else {
						setGroupCharCell(toStr("USER_RG.FLAG"), toInt(getTriggerRecord()), toStr("Y"));
						setItemStyleClass(getCurrentItem(), ItemServices.CURRENT_RECORD, "LOCAL_TEXT");
						nextItem();
						setItemStyleClass(getCurrentItem(), ItemServices.CURRENT_RECORD, "LOCAL_TEXT");
						nextItem();
					}
				}
			}
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_3_0
	
	PROCEDURE AUDIT_TRAIL_3_0 IS
BEGIN
  NULL;
<multilinecomment>
AUDIT TRAIL: 3.0                                            INIT      DATE
1. New form for supporting user-defined menues.              SQ     12/27/96
2. Chenges with Description field on GURMENU block.          JC     06/17/97
3. Correcting drop aria.                                     JC     07/08/97
4. Modify validation of object to exclude checking security  SQ     07/10/97
   for objects of type MESSAGE.
5. Added drag and drop logic for Macintosh.                  JC     07/22/97
6. Recreated sort sequence for GURMENU block in Key-Commit   JC     07/29/97
   Key_Clrfrm and Key-Exit. 
7. Key-Commit modifications .				     JC     08/06/97
8. Key-Listval on fild MENU_NAME was modifyed to show        JC     08/11/97
   GUIOBJS form.Post-Delete on GURMENU block and Key_Delrec
   were modifyed to delete all information about menu that
   has been deleted.
AUDIT TRAIL END
</multilinecomment>
END;
	*/
	//ID:1013
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail30()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL
	
	PROCEDURE AUDIT_TRAIL IS
BEGIN
<multilinecomment>
** AUDIT TRAIL: 2.1                                            INIT   DATE
** 1. Converted to library.                                     SQ  05/24/94
**
** AUDIT TRAIL: 2.1.11
** 1. Modifications to support 2 char product                   SQ 09/04/96
**    identifier and 7 or 8 character form names.
** 2. Added new QUERY_NOHIDE option to the                      SQ 10/18/96
**    G$_SECURED_FORM_CALL routine.
** 3. Add winexec routine to call windows programs.             SQ 11/14/96
** 4. Add G$_HINT and G$_IMAGE_HINT for displaying bubble help. SQ 11/14/96
** 5. Modify G$_SET_WIN_PROPERTY to add support for MOTIF.      SQ 11/17/96
** 6. Modify G$_LIST_VALUES_COPY to use system.cursor_item      SQ 11/17/96
**    instead of current_item.
** AUDIT TRAIL END
**
</multilinecomment>
  NULL;
END;

	*/
	//ID:1014
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail()
		{
			// ** AUDIT TRAIL: 2.1                                            INIT   DATE
			// ** 1. Converted to library.                                     SQ  05/24/94
			// **
			// ** AUDIT TRAIL: 2.1.11
			// ** 1. Modifications to support 2 char product                   SQ 09/04/96
			// **    identifier and 7 or 8 character form names.
			// ** 2. Added new QUERY_NOHIDE option to the                      SQ 10/18/96
			// **    G$_SECURED_FORM_CALL routine.
			// ** 3. Add winexec routine to call windows programs.             SQ 11/14/96
			// ** 4. Add G$_HINT and G$_IMAGE_HINT for displaying bubble help. SQ 11/14/96
			// ** 5. Modify G$_SET_WIN_PROPERTY to add support for MOTIF.      SQ 11/17/96
			// ** 6. Modify G$_LIST_VALUES_COPY to use system.cursor_item      SQ 11/17/96
			// **    instead of current_item.
			// ** AUDIT TRAIL END
			// **
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_3_0_064
	
	PROCEDURE AUDIT_TRAIL_3_0_064 IS
<multilinecomment>
** AUDIT TRAIL: 3.0
** 1.  Added new G$_READ_INI routine to read the banner.ini      SQ 01/30/97
**     file to obtain the various commands and options for the
**     tool bar functions.  Added G$_HINT routine to provide
**     bubble help on iconic buttons.  Added G$_IMAGE_HINT to
**     provide bubble help on the image items on the main menu
**     form.  Also rewrite the G$_OPTIONS_MENU routine to make
**     options function as a pulldown menu rather than as an lov.
** 2.  Added new modes to the G$_SECURED_FORM_CALL to support    SQ 05/20/97
**     NEW_FORM command.
** 3.  TAM 05/15/97
**     Changed G$_DISPLAY_LOV to have a new optional 3rd parameter
**     which tells the procedure whether it should copy the selected
**     value back to the form.
** 4.  RLH 05/27/97
**     Change G$_GOQOLIB_FUNC_INFO_BLOCK package body to use the
**     name_in function with save_block_name item in KEY_EXIT,
**     KEY_PRVBLK, and KEY_NXTBLK.
** 5.  SJQ 05/28/97
**     Remove the display of the iconic button hint text in the message
**     field in the G$_HINT.  Also add logic to the G$_MOUSE_DOUBLECLICK
**     to test to see if the current block is the G$_OPT_BLOCK and if
**     so, exit.
** 6.  Modify doubleclick logic to first see if the generated item name
**     is greater than 30 characters and if so exit since this causes
**     internal forms errors.
** 7.  Modify toolbar key logic to disable the cancel query execution if
**     the form is not running in enter-query mode.
** 8.  SJQ 06/17/97
**     Modify mouse-doubleclick logic to test for the shift state in a
**     different format for Mac support.  This is used to display the
**     GUAHELP form.  The mac shows the state with a minus sign, the 
**     pc shows it with a plus sign.
** 9.  SJQ 06/24/97
**     Add new routines to be used to verify or test what type of environment
**     you are running in.  One for windows, mac, charmode, and gui.  They
**     following the naming convention of G$_ENV_IS...
** 10. SJQ 06/25/97
**     Modify toolbar_run logic to handle null icons.
** 11. SJQ 07/06/97
**     Add routine to test if environment is web forms.
** 12. SJQ 07/07/97
**     Modify LAST_10 routine to eliminate the GUACLGO from being added.
** AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:1015
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail30064()
		{
		}

	
	/* Original PL/SQL code for Prog Unit POPULATE_LIST_OF_CODES
	
	PROCEDURE POPULATE_LIST_OF_CODES IS
  rg_id   RECORDGROUP;
  v_check NUMBER;
BEGIN
  rg_id := FIND_GROUP('GUBOBJS_OBJT_CODE');
  IF ID_NULL(rg_id) THEN
    rg_id := CREATE_GROUP_FROM_QUERY('GUBOBJS_OBJT_CODE',
                                     'SELECT DISTINCT V.GTVOBJT_DESC,' || 
                                     'B.GUBOBJS_OBJT_CODE ' || 
                                     'FROM GUBOBJS B, GTVOBJT V ' ||
                                     'WHERE B.GUBOBJS_OBJT_CODE=V.GTVOBJT_CODE');               
--
    v_check := POPULATE_GROUP(rg_id);
    POPULATE_LIST('FORM_HEADER.OBJECT_TYPE',rg_id);
    :FORM_HEADER.OBJECT_TYPE := 'FORM';
  END IF;
END;
	*/
	//ID:1016
	/* <p>
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void populateListOfCodes()
		{
			ValueSet rgId= null;
			NNumber vCheck= NNumber.getNull();
			rgId = findGroup("GUBOBJS_OBJT_CODE");
			if ( (rgId == null) )
			{
				rgId = createGroupFromQuery("GUBOBJS_OBJT_CODE", toStr("SELECT DISTINCT V.GTVOBJT_DESC,").append("B.GUBOBJS_OBJT_CODE ").append("FROM GUBOBJS B, GTVOBJT V ").append("WHERE B.GUBOBJS_OBJT_CODE=V.GTVOBJT_CODE"));
				// 
				vCheck = populateGroup(rgId);
				populateList("FORM_HEADER.OBJECT_TYPE", rgId);
				getFormModel().getFormHeader().setObjectType(toStr("FORM"));
			}
		}

	
	/* Original PL/SQL code for Prog Unit CHK_ENTER_MODE
	
	PROCEDURE CHK_ENTER_MODE IS
BEGIN
  IF :SYSTEM.MODE = 'ENTER-QUERY' THEN
    RAISE FORM_TRIGGER_FAILURE;
  END IF;
END;
	*/
	//ID:1017
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void chkEnterMode()
		{
			if ( getMode().equals("ENTER-QUERY") )
			{
				throw new ApplicationException();
			}
		}

	
	/* Original PL/SQL code for Prog Unit CREATE_CMENU
	
	PROCEDURE CREATE_CMENU IS
--
  G_ROW        NUMBER(5);
  V_ROW        NUMBER(5);
  V_QTY        NUMBER(3):= 0;
  USCUME       VARCHAR2(200);
  V_USERNAME   VARCHAR2(30);
  MENU_NAME    VARCHAR2(20) := '*PERSONAL';
  HOLD_VAL     VARCHAR2(1);
  AL_BUTTON    NUMBER;
  AL_MSG       VARCHAR2(80);
BEGIN
  IF NOT ID_NULL(FIND_GROUP('USER_RG')) THEN
    V_ROW := GET_GROUP_ROW_COUNT('USER_RG');
--
    FOR RG_REC IN 1..V_ROW LOOP
      IF GET_GROUP_CHAR_CELL('USER_RG.FLAG',RG_REC) = 'Y' THEN         
        V_USERNAME := GET_GROUP_CHAR_CELL('USER_RG.USER_NAME',RG_REC);
        V_QTY := V_QTY + 1; 
--
        DELETE GURMENU
         WHERE GURMENU_USER_ID = V_USERNAME;
--       
        INSERT INTO GURMENU (GURMENU_NAME,  
                             GURMENU_OBJ_NAME,
                             GURMENU_SORT_SEQ,
                             GURMENU_USER_ID,
                             GURMENU_ACTIVITY_DATE,
                             GURMENU_DESC)
                      SELECT GURMENU_NAME,
                             GURMENU_OBJ_NAME,
                             GURMENU_SORT_SEQ,
                             V_USERNAME,
                             SYSDATE,
                             GURMENU_DESC
                        FROM GURMENU
                       WHERE GURMENU_USER_ID = :CUST_USER_ID;
--
        :SYSTEM.MESSAGE_LEVEL :='5';
        COMMIT;
        :SYSTEM.MESSAGE_LEVEL :='0';
      END IF;
    END LOOP;
--
  END IF;
--
  SET_VIEW_PROPERTY('USER_VIEW',VISIBLE,PROPERTY_FALSE);
  SET_ITEM_PROPERTY('OBJECT_TYPE',VISIBLE,PROPERTY_TRUE);
  SET_ITEM_PROPERTY('OBJECT_TYPE',DISPLAYED,PROPERTY_TRUE);
  SET_ITEM_PROPERTY('OBJECT_TYPE',ENABLED,PROPERTY_TRUE);
--
  GO_BLOCK('GURMENU');
  EXECUTE_QUERY;
--
  IF V_QTY > 0 THEN
    USER_ECM_GROUP;
    IF V_QTY = 1 THEN
      AL_MSG := G$_NLS.Get('GUTPMNU-0046','FORM','The menu was copied successfully to the user.');
    ELSE
      AL_MSG := G$_NLS.Get('GUTPMNU-0047','FORM',
	       'The menu was copied successfully to %01% users.',TO_CHAR(V_QTY));
    END IF;
    SET_ALERT_PROPERTY('ALERT',ALERT_MESSAGE_TEXT,AL_MSG);
    AL_BUTTON := SHOW_ALERT('ALERT');
  END IF;
END;
	*/
	//ID:1018
	/* <p>
/* </p>
		*/
		public void createCmenu()
		{
			int rowCount = 0;
			// 
			NNumber gRow= NNumber.getNull();
			NNumber vRow= NNumber.getNull();
			NNumber vQty = toNumber(0);
			NString uscume= NString.getNull();
			NString vUsername= NString.getNull();
			NString menuName = toStr("*PERSONAL");
			NString holdVal= NString.getNull();
			NNumber alButton= NNumber.getNull();
			NString alMsg= NString.getNull();
			if ( !(findGroup("USER_RG") == null) )
			{
				vRow = toNumber(getGroupRowCount("USER_RG"));
				// 
				for ( int rgRec = 1; vRow.greaterOrEquals(rgRec); rgRec++ )
				{
					if ( getGroupCharCell("USER_RG.FLAG", rgRec).equals("Y") )
					{
						vUsername = getGroupCharCell("USER_RG.USERNAME", rgRec);
						
						vQty = vQty.add(1);
						// 
						String sql1 = "DELETE FROM GURMENU " +
	" WHERE GURMENU_USER_ID = :P_V_USERNAME";
						DataCommand command1 = new DataCommand(sql1);
						//Setting query parameters
						command1.addParameter("P_V_USERNAME", vUsername);
						rowCount = command1.execute();
						//        
						String sql2 = "INSERT INTO GURMENU " +
	"(GURMENU_NAME, GURMENU_OBJ_NAME, GURMENU_SORT_SEQ, GURMENU_USER_ID, GURMENU_ACTIVITY_DATE, GURMENU_DESC)" +
	"SELECT GURMENU_NAME, GURMENU_OBJ_NAME, GURMENU_SORT_SEQ, :P_V_USERNAME, SYSDATE, GURMENU_DESC " +
	" FROM GURMENU " +
	" WHERE GURMENU_USER_ID = :CUST_USER_ID ";
						DataCommand command2 = new DataCommand(sql2);
						//Setting query parameters
						command2.addParameter("P_V_USERNAME", vUsername);
						command2.addParameter("CUST_USER_ID", getFormModel().getFormHeader().getCustUserId());
						rowCount = command2.execute();
						// 
						// MORPHIS TODO : Implementation SYSTEM.MESSAGE_LEVEL '5'
						try { 
						MessageServices.setMessageLevel(MessageLevel.NONE);
						commitTask();
						// MORPHIS TODO : Implementation SYSTEM.MESSAGE_LEVEL '0'
						} finally {
									
						MessageServices.resetMessageLevel();
						}
									
					}
				}
			}
			// 
			setViewVisible("USER_VIEW", false);
			setItemVisible("OBJECT_TYPE", true);
			setItemVisible("OBJECT_TYPE", true);
			setItemEnabled("OBJECT_TYPE", true);
			
			//CABANAS 
			showView("GUBOBJS_CANVAS");
			showView("GURMENU_CANVAS");	
			//MORPHIS TODO
			//francisco carvalho
			showView("GURMENU2_CANVAS");
			//CABANAS
			
			goBlock(toStr("GURMENU"));
			executeQuery();
			// 
			if ( vQty.greater(0) )
			{
				userEcmGroup();
				if ( vQty.equals(1) )
				{
					alMsg = GNls.Fget(toStr("GUTPMNU-0046"), toStr("FORM"), toStr("The menu was copied successfully to the user."));
				}
				else {
					alMsg = GNls.Fget(toStr("GUTPMNU-0047"), toStr("FORM"), toStr("The menu was copied successfully to %01% users."), toChar(vQty));
				}
				message(alMsg);
				
			}
		}

	
	/* Original PL/SQL code for Prog Unit DESTROY_RECORD_GROUP
	
	PROCEDURE destroy_record_group(rg_name varchar2) IS
 rg_id   RECORDGROUP;
BEGIN
  rg_id := FIND_GROUP(rg_name);
  IF NOT ID_NULL(rg_id) THEN
    DELETE_GROUP(rg_name);
  END IF;
END;

	*/
	//ID:1019
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param rgName
		*/
		public void destroyRecordGroup(NString rgName)
		{
			ValueSet rgId= null;
			rgId = findGroup(rgName);
			if ( !(rgId == null) )
			{
				deleteGroup(rgName);
			}
		}

	
	/* Original PL/SQL code for Prog Unit GET_MULTY_ROW_FROM_REC_GRP
	
	FUNCTION get_multy_row_from_rec_grp(rg_name VARCHAR2) RETURN BOOLEAN IS
 rg_id    RECORDGROUP;
 rg_row   NUMBER(5);
 sel_ind  BOOLEAN := FALSE;
BEGIN
  rg_id := FIND_GROUP(rg_name);
  IF NOT ID_NULL(rg_id) THEN
    rg_row := TO_NUMBER(GET_GROUP_ROW_COUNT(rg_id));
    FOR rg_rec IN 1..rg_row LOOP
      IF GET_GROUP_CHAR_CELL(rg_name||'.INDICATOR',rg_rec) = 'Y' THEN
        sel_ind := TRUE;
        EXIT;
      END IF;
    END LOOP;
--
    IF sel_ind THEN
      RETURN TRUE;
    ELSE
      RETURN FALSE;
    END IF;
  ELSE
    RETURN FALSE;
  END IF;
  RETURN NULL; 
END;
	*/
	//ID:1020
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param rgName
		*/
		public NBool getMultyRowFromRecGrp(NString rgName)
		{
			ValueSet rgId= null;
			NNumber rgRow= NNumber.getNull();
			NBool selInd = toBool(NBool.False);
			rgId = findGroup(rgName);
			if ( !(rgId == null) )
			{
				rgRow = toNumber(getGroupRowCount(rgId));
				for ( int rgRec = 1; rgRow.greaterOrEquals(rgRec); rgRec++ )
				{
					if ( getGroupCharCell(rgName.append(".INDICATOR"), rgRec).equals("Y") )
					{
						selInd = toBool(NBool.True);
							break;
					}
				}
				// 
				if ( selInd.getValue() )
				{
					return  toBool(NBool.True);
				}
				else {
					return  toBool(NBool.False);
				}
			}
			else {
				return  toBool(NBool.False);
			}
//			return NBool.getNull();
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_5_0
	
	PROCEDURE AUDIT_TRAIL_5_0 IS
<multilinecomment>
AUDIT TRAIL: 5.0
1.  TGKinderman 06/06/2000
    Within a staged forms4.5 environment; removed G$_TOOLBAR_SHORT object group,
    Copied G$_TOOLBAR_SHORT object group from guagmnu.fmb into form, and deleted
    window G$_OPT_WINDOW.
    In the converted forms6.0 environment; provided database YES, table name, and
    data source type TABLE for GURMENU, GUBOBJS and QK_FLOW blocks.  Set the Scroll
    Bar Length on GUBOBJS block back to 305.
2.  GShalovka  07 July 2000
    Change GOQRPLS library attachment from lower to upper case.  
3.  SJQ 08/25/2000
    Modified reference to G$_WIN_API routines to use the WIN_API routines.
4.  SJQ 09/07/2000
    Removed local G$_CURSORSET.  Removed all references to this routine.
5.  TGKinderman 11/14/2000
    TOOLTIP_TEXT Changes: Changed the named visual attribute of the horizontal and
    vertial button items from DEFAULT to G$_NVA_BUTTON_ITEM.
6.  NLopez 12/04/2000
    Form is enabled to be accessible on the web.
    Procedure G$_SET_SCROLL_VIEW from GOQGMNU has been modified locally. Logic that sets
    GURMENU_OBJ_NAME item property is commented out, since item was placed off the canvas.
    Added logic in OBJ_DESC trigger to disable iconic object types when form runs on web.
    Added logic in WHEN-NEW-FORM_INSTANCE and WHEN-NEW-BLOCK-INSTANCE triggers so title
    of object type is not displayed when form runs on web.
    Additional logic included in WHEN-MOUSE-CLICK trigger of GUBOBJS, so navigation is not 
    allowed when menu_name, description and type are null.
7.  NL 12/11/2000
    Added new not null column GUBOBJS_EXTRACT_ENABLED_IND in KEY-COMMIT and CHECK_OBJS
    triggers.
8.  DRM 12-22-2000
    Adding two new alerts for Banner(r) XtenderSolutions(tm) product.  These two
    alerts are subclassed from GOQOLIB.fmb.
    
AUDIT TRAIL: 5.3
1.  DRM         08/08/2001
    Because Object Group GOQOLIB.G$_TOOLBAR.G$_TOOLBAR is not referenced into GUAGMNU
    like most Banner forms, we must create a local copy of the WHEN-MOUSE-CLICK trigger using
    GOQOLIB as the model.  This source code was therefore copied from 
    GOQOLIB.G$_HORIZONTAL_TOOLBAR.WHEN-MOUSE-CLICK into the G$_TOOLBAR_SHORT parallels
    in this current form, adding it to the code that already existed therein.  The identical 
    trigger in the vertical toolbar was then referenced from the horizontal toolbar.

    New non-visible, non-base-table item BXS_AWARE_IND item added to block 
    G$_HORIZONTAL_TOOLBAR.  This item allows BXS code to determine whether a given
    Banner form is "BXS-enabled" or not (compiled against a 5.3 or later release of GOQOLIB).

AUDIT TRAIL: 5.4
1.  SJQ 10/18/2001
    Removed the G$_TIMER_EXP program unit since it was a duplicate of the one in the 
    general library.  Modify the GUBOBJS WHEN-MOUSE-CLICK and WHEN-MOUSE-ENTER to
    remove references to the G$_HINT and G$_HINT_TEXT_ITEM since these are obsolete.  Modify
    the WHEN-MOUSE-CLICK and WHEN-MOUSE-LEAVE triggers in the G$_HORIZONTAL_TOOLBAR and 
    G$_VERTICAL_TOOLBAR to remove references to the G$_HINT routines.
2.  SJQ 01/02/2002
    Modify the PRE_FORM_TRG to add logic to check whether or not the DISPLAY_FORM_IND is
    set or not.  If it is, modify the display of the GUBOBJS block to display the form
    name in addition to the description.  This also required modifications to the GURMENU
    block and resizing the fields and positions.  Modify the WHEN-MOUSE-ENTER trigger in
    the GUBOBJS block so that the cursor no longer navigates to the item and then back 
    to where it was.  This was for bubble help.  Modify the G$_SET_SCROLL_VIEW to remove
    the logic which repositions fields.  This is not needed and causes problems when 
    displaying the form name on the GUBOBJS block.  Modify the form logic to not allow the 
    user to click into the GUBOBJS block if the GURMENU block hasn't been queried.  Update
    many of the error messages to make then more standard.  Add logic to the mouse-enter 
    trigger in the GUBOBJS block to set the cursor to be an arrow.  Modify the KEY-CREREC
    trigger in the GURMENU block to set the description displayed description to null so
    that it doesn't generate an error when you then click into the GUBOBJS block without
    first entering some value in the newly created record.
3.  SJQ 01/16/2002
    Add a sort button to the key block so that when the form and description are displayed in
    the GUBOBJS block that the user can change the sort from description to name.
    
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;

	*/
	//ID:1021
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail50()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_4_0
	
	PROCEDURE AUDIT_TRAIL_4_0 IS
BEGIN
  NULL;
<multilinecomment>
AUDIT TRAIL: 4.0                                            INIT      DATE
   Banner 4.0 						    JC/MH	     01/20/99

AUDIT TRAIL: 4.1					    KJOG        08/23/99
1. Updated the WHEN_TIMER_EXPIRED trigger with the code from GOQOLIB.
2. EPM 10/22/99
   Commented out the call to G$_TOOLBAR.Check_Toolbars in when-new-form-instance since
   it was re-enabling the workflow buttons after they had previously been disabled.

AUDIT TRAIL END
</multilinecomment>
END;

	*/
	//ID:1022
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail40()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_6_0
	
	PROCEDURE AUDIT_TRAIL_6_0 IS
<multilinecomment>
AUDIT TRAIL: 6.1
1. G Shalovka 18 July 2003
   Correct 88481.
   Problem: Form went into infinite loop displaying message
            "FRM-40202: Field must be entered" if object Description
            field was blanked out on a multi-object personal menu.
   Impact:  User had to use the Task Manager to end Banner session.
   Solution:Modified form-level trigger Key-ClrFrm adding
            "G$_CHECK_FALIURE;" routines after each EXECUTE_TRIGGER
            to handle trigger failures.

AUDIT TRAIL: 6.2
1.  SJQ 02/08/2004
    Add logic to the POST_FORMS_COMMIT_TRG to execute a call to a new routine in the GENUTIL
    package.  With the use of a materialized view, when the menu is changed, the view needs
    to be refreshed.  This will occur when the new logic is executed.

AUDIT TRAIL: 6.2.0.1
1.  SJQ 06/29/2004
    Add logic to the validation of the object being added to the menu so that if the object is a
    menu and it doesn't contain an objects that the user doesn't get the error that they aren't 
    authorized to access any objects on this menu.

AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:1023
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail60()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_0
	
	PROCEDURE AUDIT_TRAIL_7_0 IS
<multilinecomment>
AUDIT TRAIL: 7.0
1.  TGKinderman 11/21/2003
    Obsolete win_api routine per Banner7 Forms9i changes
2.  SJQ 02/27/2004
    Application of enhanced UI methodology.  Please refer to the "SCT Banner 7.0 User Interface
    Technical Methodology" for more details.  Many modifications to make this form functional in
    this tool set.  Removed the scroll bar canvases and made the block scroll bar display.
3.  SJQ 03/25/2004
    Add logic to the object name items to verify the entry, if a menu, doesn't already exist
    at a higher level to avoid loops.
4.  SJQ 11/02/2004
    Alignment changes.  Add pop-up menu to canvases which didn't have it assigned.  Update the
    error messages on the insert and delete buttons.  Resize the submenu canvas and items.  Add
    logic to retrieve a user saved description for an object.
4.  Change the commit logic to require the user to commit or rollback if changes are pending.
    This was done so that the re-sequencing of the records could be done via the KEY-COMMIT
    trigger.  Updated the validation of the object code to correct generate the "not authorized"
    error message.  Updated the insert and delete button logic so it would work for both
    windows.  Re-sized and re-position the submenu.
5.  SJQ 11/04/2004
    Replace all DISPLAY_ITEM commands with SET_ITEM_INSTANCE_PROPERTY commands.  Change the
    populating of a submenu to not include the description.  Update the SUBMENU_MAINTENANCE
    package to use the user id from the key block during menu creation instead of the current
    user's id.
6.  SJQ 11/16/2004
    Update the WHEN-VALIDATE-ITEM triggers on GURMENU_OBJ_NAME item in both menu blocks to add
    logic to test if the object type item is populated.  Calling the OBJ_DESC trigger does not
    raise an error when the object is not valid but the object type item is null.  Add logic to 
    the WHEN-VALIDATE-ITEM triggers to exit if the record status is 'NEW'.  These triggers were
    firing when all records were deleted and we then making changes to the record, prohibiting 
    all of the personal records from being deleted.
7.  SJQ 11/17/2004
    Update the WHEN-VALIDATE-ITEM triggers on the GURMENU_OBJ_NAME item in both menu blocks to add
    logic to handle an empty but valid menu.
8.  SJQ 11/23/2004
    Add missing trigger to the GUBOBJS block.  This trigger, ADD_TO_MRC, is used as part of the 
    double click logic when selecting records.  Modify the display all users button logic to not
    attempt to disable or hide the object type.  The item will not be visible since a new canvas 
    is displayed any way.  The logic was attempting to set attributes which are not valid if the
    cursor is actually in the item.  Update the CHECK_CUSTOM logic to verify that at least one
    user was selected when the copy to user button is pressed.  If not users are selected, give
    an error message.
9.  SJQ 11/24/2004
    Update the show user button to navigate to the user search item when pressed.
    Add logic to each of the buttons to validate the current item's value before executing any
    other logic.  If an item contained an invalid item and the buttons were used, the form could 
    go into an endless loop.  Add logic to the insert all, delete all, all users and copy buttons
    to check if any other pending changes exist, and if so, notify the user to commit or rollback
    first.
10. SJQ 11/29/2004
    Update the logic in the SUBMENU_MAINTENANCE routine to verify records exists on a menu prior
    to creating them for the user on the second window.  If an empty menu is added, when the
    user navigated to the second window, a record locking problem occurred.  Update the KEY-COMMIT
    trigger to test if the block is empty, and if so, do not attempt to validate the items.  
    Modify the COMMIT_LOGIC trigger to remove the unneed navigation between the blocks.  Since
    each block/window must be committed before allowing the user to navigate, this was redundant.
    Add logic to the WHEN-NEW-BLOCK-INSTANCE trigger on the first menu block to verify that there 
    are no pending changes on the sub menu before allowing navigation to take place.  Update the
    logic for the WHEN-BUTTON-PRESSED trigger on the DELETE ALL button to change the logic to 
    delete all of the records only in the current block.  The logic was navigating to the first 
    block and deleting all records even if the cursor was on the sub menu window.
11. SJQ 12/01/2004
    Add a requery after copying a menu to other users.  Without the requery, since there were
    deletes and inserts using the current user's menu, an error was being generated when the 
    current user's menu was then updated.  Using the current user menu in the inserts was 
    generating an error that the records had been updated by another user.
12. SJQ 12/02/2004
    Disable some of the navigation triggers in the user block.  The user should not be able to
    alter any of the records in this block.  Add a re-query to the WHEN-NEW-BLOCK-INSTANCE 
    trigger on the first menu block if returning from the second menu block.

AUDIT TRAIL: 7.2
1.  SJQ 07/25/2005
    Update the USER_OBJ_DESC trigger.  When a menu object has been added to the user's menu, and 
    the user navigates to that page, the descriptions are not being retrieved correctly.
    Added logic to first check if the user had updated the description, and if not, check for 
    the description on the menu record and if not found, obtain the description from the object
    table.  Update the object being validated is not validated with the current user id if the
    personal menu being worked on is some one elses.
2.  SJQ 07/28/2005
    Update the POPULATE_LIST_OF_CODES routine to show the description of the object type instead
    of the code.  This is for the I18N configuration.

AUDIT TRAIL: 7.3
1.  SJQ 03/02/2006
    Re-inherit the trigger text for the GUBOBJS.POST-QUERY and GUBOBJS.KEY-LISTVAL triggers.  The
    logic is coming from the GOQOLIB property class and the links were broken.  Corrected the
    background color on the sort button to be default.
2.  SJQ 03/09/2006
    Add logic to the object verification to verify that the user isn't trying to put a form with
    a Q in the third position on the menu.  These forms are not directly callable and shouldn't
    be allowed on personal menus.

AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:1024
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail70()
		{
		}

	
	/* Original PL/SQL code for Prog Unit CHECK_CUSTOM
	
	PROCEDURE CHECK_CUSTOM IS
  V_NUM        NUMBER(6);                        
  V_ROW        NUMBER(6);
  V_QTY        NUMBER(3):= 0;
  V_CM         VARCHAR2(1) := 'Y';
  V_ECM        VARCHAR2(1) := 'Y';
  V_SEL        VARCHAR2(1) := 'N';
  V_USERNAME   VARCHAR2(30);
  AL_BUTTON    NUMBER;
  AL_MSG       VARCHAR2(200);
BEGIN
  IF NOT ID_NULL(FIND_GROUP('USER_RG')) THEN
    V_ROW := GET_GROUP_ROW_COUNT('USER_RG');
--
    FOR RG_REC IN 1..V_ROW LOOP
      IF GET_GROUP_CHAR_CELL('USER_RG.FLAG',RG_REC) = 'Y' THEN         
        V_USERNAME := GET_GROUP_CHAR_CELL('USER_RG.USER_NAME',RG_REC);
        V_SEL := 'Y';
--
        BEGIN
          SELECT 'X' INTO V_CM 
            FROM GURMENU
           WHERE GURMENU_USER_ID = V_USERNAME
             AND ROWNUM = 1;
        EXCEPTION 
          WHEN NO_DATA_FOUND THEN 
            V_CM := 'Y';
        END;
--
        IF V_CM  = 'X' THEN 
          V_QTY := V_QTY + 1; 
        END IF;
      END IF;
    END LOOP;
--
    IF V_SEL = 'N' THEN
      MESSAGE(G$_NLS.Get('GUTPMNU-0048','FORM','*ERROR* This function is not available, '
         || 'double click on one or more users to select them and press the insert button to copy.'));
      RAISE FORM_TRIGGER_FAILURE;
    END IF;
--
    IF V_QTY > 0 THEN
      AL_MSG := G$_NLS.Get('GUTPMNU-0049','FORM','At least one of the users selected has a custom menu. Overwrite existing custom menu?');
      SET_ALERT_PROPERTY('WARNING_ALERT',ALERT_MESSAGE_TEXT,AL_MSG);
      AL_BUTTON := SHOW_ALERT('WARNING_ALERT');
      IF AL_BUTTON = ALERT_BUTTON1 THEN
        CREATE_CMENU;
      ELSE
        FOR RG_REC IN 1..V_ROW LOOP
          IF GET_GROUP_CHAR_CELL('USER_RG.FLAG',RG_REC) = 'Y' THEN         
            V_USERNAME := GET_GROUP_CHAR_CELL('USER_RG.USER_NAME',RG_REC);
--
            BEGIN
              SELECT 'X' INTO V_ECM 
                FROM GURMENU
               WHERE GURMENU_USER_ID = V_USERNAME
                 AND ROWNUM = 1;
            EXCEPTION 
              WHEN NO_DATA_FOUND THEN V_ECM := 'Y';
            END;
--
            IF V_ECM = 'X' THEN 
              AL_MSG := G$_NLS.Get('GUTPMNU-0050','FORM',
                	'Do you want to overwrite the custom menu of %01%?', V_USERNAME);
              SET_ALERT_PROPERTY('WARNING_ALERT',ALERT_MESSAGE_TEXT,AL_MSG);
              AL_BUTTON := SHOW_ALERT('WARNING_ALERT');
              IF AL_BUTTON = ALERT_BUTTON1 THEN
                NULL;
              ELSE
                V_NUM := GET_GROUP_RECORD_NUMBER('USER_RG.USER_NAME',V_USERNAME);
                SET_GROUP_CHAR_CELL('USER_RG.FLAG',V_NUM,'N');
              END IF;
            END IF;
          END IF;
        END LOOP;
        CREATE_CMENU;
      END IF;
    ELSE
      CREATE_CMENU;
    END IF;
--
  END IF;
--
END;
	*/
	//ID:1025
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void checkCustom()
		{
			int rowCount = 0;
			NNumber vNum= NNumber.getNull();
			NNumber vRow= NNumber.getNull();
			NNumber vQty = toNumber(0);
			NString vCm = toStr("Y");
			NString vEcm = toStr("Y");
			NString vSel = toStr("N");
			NString vUsername= NString.getNull();
			NNumber alButton= NNumber.getNull();
			NString alMsg= NString.getNull();
			if ( !(findGroup("USER_RG") == null) )
			{
				vRow = toNumber(getGroupRowCount("USER_RG"));
				// 
				for ( int rgRec = 1;vRow.greaterOrEquals(rgRec); rgRec++ )
				{
					if ( getGroupCharCell("USER_RG.FLAG", rgRec).equals("Y") )
					{
						vUsername = getGroupCharCell("USER_RG.USERNAME", rgRec);
						vSel = toStr("Y");
						try
						{
							String sql1 = "SELECT 'X' " +
	" FROM GURMENU " +
	" WHERE GURMENU_USER_ID = :P_V_USERNAME AND ROWNUM = 1 ";
							DataCommand command1 = new DataCommand(sql1);
							//Setting query parameters
							command1.addParameter("P_V_USERNAME", vUsername);
							ResultSet results1 = command1.executeQuery();
							rowCount = command1.getRowCount();
							if ( results1.hasData() ) {
								vCm = results1.getStr(0);
							}
							results1.close();
						}
						catch(NoDataFoundException e)
						{
							vCm = toStr("Y");
						}
						// 
						if ( vCm.equals("X") )
						{
							vQty = vQty.add(1);
						}
					}
				}
				// 
//				if ( vSel.equals("N"))   //&&  !getCurrentItem().equals("USER_ID"))  
//				{
//					errorMessage(GNls.Fget(toStr("GUTPMNU-0048"), toStr("FORM"), toStr("*ERROR* This function is not available, ").append(" double click on one or more users to select them and press the insert button to copy.")));
//					throw new ApplicationException();
//				}
				// 
				if ( vQty.greater(0) )
				{
					alMsg = GNls.Fget(toStr("GUTPMNU-0049"), toStr("FORM"), toStr("At least one of the users selected has a custom menu. Overwrite existing custom menu?"));
					setAlertMessageText("WARNING_ALERT", alMsg);
					alButton = toNumber(showAlert("WARNING_ALERT"));
					if ( alButton.equals(MessageServices.BUTTON1) )
					{
						createCmenu();
					}
					else {
						for ( int rgRec = 1;vRow.greaterOrEquals(rgRec); rgRec++ )
						{
							if ( getGroupCharCell("USER_RG.FLAG", rgRec).equals("Y") )
							{
								vUsername = getGroupCharCell("USER_RG.USERNAME", rgRec);
								try
								{
									String sql2 = "SELECT 'X' " +
	" FROM GURMENU " +
	" WHERE GURMENU_USER_ID = :P_V_USERNAME AND ROWNUM = 1 ";
									DataCommand command2 = new DataCommand(sql2);
									//Setting query parameters
									command2.addParameter("P_V_USERNAME", vUsername);
									ResultSet results2 = command2.executeQuery();
									rowCount = command2.getRowCount();
									if ( results2.hasData() ) {
										vEcm = results2.getStr(0);
									}
									results2.close();
								}
								catch(NoDataFoundException e)
								{
									vEcm = toStr("Y");
								}
								// 
								if ( vEcm.equals("X") )
								{
									alMsg = GNls.Fget(toStr("GUTPMNU-0050"), toStr("FORM"), toStr("Do you want to overwrite the custom menu of %01%?"), vUsername);
									setAlertMessageText("WARNING_ALERT", alMsg);
									alButton = toNumber(showAlert("WARNING_ALERT"));
									if ( alButton.equals(MessageServices.BUTTON1) )
									{
									}
									else {
										// F2J_NOT_SUPPORTED : Call to built-in "GET_GROUP_RECORD_NUMBER" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GUTPMNUF2NMigrationGuide.xml#DefaultExcludeBuiltin4".
										//										vNum = SupportClasses.FORMS4G.GetGroupRecordNumber("USER_RG.USER_NAME", vUsername);
//										System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'GET_GROUP_RECORD_NUMBER' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GUTPMNUF2NMigrationGuide.xml#DefaultExcludeBuiltin4'.");
										
										setGroupCharCell(toStr("USER_RG.FLAG"), vNum, toStr("N"));
									}
								}
							}
						}
						createCmenu();
					}
				}
				else {
					createCmenu();
				}
			}
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_NLS_DATE_SUPPORT
	
	PROCEDURE AUDIT_TRAIL_NLS_DATE_SUPPORT IS
-- AUDIT TRAIL: NLS_DATE_SUPPORT 
-- 1. TGKinderman   11/11/2005
--    This object was passed through a conversion process relative to preparing
--    the object to support internationalization needs.  Basically, hard coded
--    date format masks of DD-MON-YYYY are converted to a G$_DATE function that
--    returns nls_date_format.  The release number of this object was NOT
--    modified as part of this effort.  This object may or may not have had 
--    conversion process code modifications.  However, this audit trail entry
--    does indicate that the object has been passed through the conversion.
-- AUDIT TRAIL END
-- 
BEGIN
  NULL;
END AUDIT_TRAIL_NLS_DATE_SUPPORT;

	*/
	//ID:1026
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrailNlsDateSupport()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_0
	
	PROCEDURE AUDIT_TRAIL_8_0 IS
<multilinecomment>
AUDIT TRAIL: 8.0
1. ShylajaS 18 Oct 2007
   Defect # 1-1ADJKV
   Added G$_NLS.Get to support
   Internationalization Requirements.   

AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:1027
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail80()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_2
	
	PROCEDURE AUDIT_TRAIL_8_2 IS
<multilinecomment>

AUDIT TRAIL: 8.2
1.  LVH 21-JUL-2008
    Defect 1-HBN4V
    Added :FORM_HEADER.INITIAL_QUERY to enable the object display to remain unchanged
    after updating the menu.
  
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:1028
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail82()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_MSGKEY_UPDATE
	
	PROCEDURE AUDIT_TRAIL_MSGKEY_UPDATE IS
-- PROJECT : MSGKEY
-- MODULE  : GUTPMNU
-- SOURCE  : enUS
-- TARGET  : I18N
-- DATE    : Mon Dec 22 20:41:17 2008
-- MSGSIGN : #4737b7fffdb0bcaa
BEGIN
  NULL;
END AUDIT_TRAIL_MSGKEY_UPDATE;

	*/
	//ID:1029
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrailMsgkeyUpdate()
		{
		}

	
	

}
