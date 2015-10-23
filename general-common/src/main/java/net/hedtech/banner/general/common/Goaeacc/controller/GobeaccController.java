package net.hedtech.banner.general.common.Goaeacc.controller;
 
import java.util.*;

import org.jdesktop.databuffer.DataRow.DataRowStatus;

import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.events.*;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.*;
import morphis.foundations.core.appsupportlib.exceptions.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appsupportlib.ui.KeyFunction;
import morphis.foundations.core.appsupportlib.util.*;
import morphis.foundations.core.appsupportlib.runtime.*;
import morphis.foundations.core.appsupportlib.runtime.control.*;
import morphis.foundations.core.appsupportlib.runtime.events.*;
import morphis.foundations.core.appsupportlib.runtime.web.message.OutputMessage.OutputMessageUserResponse;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.items.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.lovs.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.containers.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.alerts.*;
import morphis.foundations.core.appsupportlib.runtime.action.*;
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
import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.banner.general.common.Goaeacc.model.*;
import net.hedtech.banner.general.common.Goaeacc.*;
import net.hedtech.banner.general.common.Goaeacc.services.*;
import net.hedtech.general.common.libraries.Goqolib.services.GIdClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GNameClass;	
		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class GobeaccController extends DefaultBlockController {

	private GIdClass getGIdClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GIdClass) this.getTask().getTaskPart("goqolib").getSupportCodeManager().getPackage("G$_ID_CLASS");
	}	
	private GNameClass getGNameClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GNameClass) this.getTask().getTaskPart("goqolib").getSupportCodeManager().getPackage("G$_NAME_CLASS");
	}	

	
	public GobeaccController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
		
	@Override
	public GoaeaccTask getTask() {
		return (GoaeaccTask)super.getTask();
	}

	public GoaeaccModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
		/* Original PL/SQL code code for TRIGGER GOBEACC.POST-QUERY
		 <multilinecomment>******************************************
Code modified by the Forms Migration Assistant
19-Nov-2003 01:11 PM
******************************************</multilinecomment>
IF :GOBEACC_PIDM IS NULL THEN
  RETURN;
END IF;
--
DECLARE
  valid_user VARCHAR2(1);

  cursor CheckUsernameC is
    select username
    from   all_users
    where  all_users.username = :gobeacc.gobeacc_username;
BEGIN
  OPEN CheckUsernameC;
  FETCH CheckUsernameC into :gobeacc.valid_oracleuser;
  IF CheckUsernameC%NOTFOUND THEN
    valid_user := 'N';
  else 
    valid_user := 'Y';
  END IF;
  CLOSE CheckUsernameC;

  g$_sel_spriden_id_name(:GOBEACC_PIDM, 'NAME', 'Y', :WACS_ID);
  G$_CHECK_VALUE(:WACS_ID IS NULL,
     G$_NLS.Get('GOAEACC-0001', 'FORM','*ERROR* ID not found; Press LIST to go to name search.') , TRUE);

  if valid_user = 'N' then
    declare 
      alert_button number;
      alert_id  ALERT := FIND_ALERT('INVALID_USERNAME_ALERT');
    begin
      :amsg :=  G$_NLS.Get('GOAEACC-0002', 'FORM',
	'Invalid ORACLE Username: %01%' 
	, :gobeacc.gobeacc_username);
      SET_ALERT_PROPERTY(alert_id, ALERT_MESSAGE_TEXT,:amsg);
      alert_button := show_alert('INVALID_USERNAME_ALERT');
      if alert_button = ALERT_BUTTON1 then
        null;
      end if;
    end;
  end if;
END ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBEACC.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void gobeacc_AfterQuery(RowAdapterEvent args)
		{
			
				// ******************************************
				// Code modified by the Forms Migration Assistant
				// 19-Nov-2003 01:11 PM
				// ******************************************
				GobeaccAdapter gobeaccElement = (GobeaccAdapter)args.getRow();

				try
				{
					gobeaccElement.setLockDbValues(true);
								try { 
								this.wacsId_PostChange();
								} catch(Exception ex) {
								}

				} finally { 
					gobeaccElement.setLockDbValues(false);
				}
				// ******************************************
				// Code modified by the Forms Migration Assistant
				// 19-Nov-2003 01:11 PM
				// ******************************************
				if ( gobeaccElement.getGobeaccPidm().isNull() )
				{
					return ;
				}
				{
					NString validUser= NString.getNull();
					String sqlcheckusernamec = "SELECT username " +
	" FROM all_users " +
	" WHERE all_users.username = :GOBEACC_GOBEACC_USERNAME ";
					DataCursor checkusernamec = new DataCursor(sqlcheckusernamec);
					try {
						//Setting query parameters
						checkusernamec.addParameter("GOBEACC_GOBEACC_USERNAME", gobeaccElement.getGobeaccUsername());
						checkusernamec.open();
						ResultSet checkusernamecResults = checkusernamec.fetchInto();
						if ( checkusernamecResults != null ) {
							gobeaccElement.setValidOracleuser(checkusernamecResults.getStr(0));
						}
						if ( checkusernamec.notFound() )
						{
							validUser = toStr("N");
						}
						else {
							validUser = toStr("Y");
						}
						checkusernamec.close();
						Ref<NString> pId_ref = new Ref<NString>(gobeaccElement.getWacsId());
						getTask().getGoqrpls().gSelSpridenIdName(gobeaccElement.getGobeaccPidm(), toStr("NAME"), toStr("Y"), pId_ref);
						gobeaccElement.setWacsId(pId_ref.val);
						getTask().getGoqrpls().gCheckValue(toBool(gobeaccElement.getWacsId().isNull()), GNls.Fget(toStr("GOAEACC-0001"), toStr("FORM"), toStr("*ERROR* ID not found; Press LIST to go to name search.")), toBool(NBool.True));
						if ( validUser.equals("N") )
						{
							{
								NNumber alertButton= NNumber.getNull();
								AlertDescriptor alertId = findAlert("INVALID_USERNAME_ALERT");
								gobeaccElement.setAmsg(GNls.Fget(toStr("GOAEACC-0002"), toStr("FORM"), toStr("Invalid ORACLE Username: %01%"), gobeaccElement.getGobeaccUsername()));
								setAlertMessageText(alertId, gobeaccElement.getAmsg());
								alertButton = toNumber(showAlert("INVALID_USERNAME_ALERT"));
								if ( alertButton.equals(MessageServices.BUTTON1) )
								{
								}
							}
						}
					}
					finally{
						checkusernamec.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOBEACC.PRE-INSERT
		 if :wacs_id is null then
  message( G$_NLS.Get('GOAEACC-0003', 'FORM','*ERROR* Must enter Banner ID before COMMIT.') );
  RAISE FORM_TRIGGER_FAILURE;
end if;

-- 52-1 start
SELECT SPRIDEN_PIDM 
into :gobeacc.gobeacc_pidm
FROM   SPRIDEN 
WHERE  SPRIDEN_CHANGE_IND IS NULL
AND   SPRIDEN_ID = :GOBEACC.WACS_ID;
-- 52-1 end

:err_code := '0';
:err_code :=  substr(F_CheckUserPIDM(:gobeacc.gobeacc_username, :gobeacc.gobeacc_pidm),1,1);
if :err_code = '0' then
   null;
else
   execute_trigger('gobeacc_alert');
   raise form_trigger_failure;
end if;
:gobeacc_activity_date := to_date(:CURRENT_DATE,G$_DATE.GET_NLS_DATE_FORMAT);
:GOBEACC_USER_ID := :CURRENT_USER;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBEACC.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowInsert
		public void gobeacc_BeforeRowInsert(RowAdapterEvent args)
		{
			
				GobeaccAdapter gobeaccElement = (GobeaccAdapter)args.getRow();


				if ( gobeaccElement.getWacsId().isNull() )
				{
					errorMessage(GNls.Fget(toStr("GOAEACC-0003"), toStr("FORM"), toStr("*ERROR* Must enter Banner ID before COMMIT.")));
					throw new ApplicationException();
				}
				//  52-1 start
				String sql1 = "SELECT SPRIDEN_PIDM " +
	" FROM SPRIDEN " +
	" WHERE SPRIDEN_CHANGE_IND IS NULL AND SPRIDEN_ID = :GOBEACC_WACS_ID ";
				DataCommand command1 = new DataCommand(sql1);
				//Setting query parameters
				command1.addParameter("GOBEACC_WACS_ID", gobeaccElement.getWacsId());
				ResultSet results1 = command1.executeQuery();
				if ( results1.hasData() ) {
					gobeaccElement.setGobeaccPidm(results1.getNumber(0));
				}
				results1.close();
				//  52-1 end
				gobeaccElement.setErrCode(toStr("0"));
				gobeaccElement.setErrCode(substring(this.getTask().getServices().fCheckuserpidm(gobeaccElement.getGobeaccUsername(), gobeaccElement.getGobeaccPidm()), toInt(1), toInt(1)));
				if ( gobeaccElement.getErrCode().equals("0") )
				{
				}
				else {
					executeAction("gobeacc_alert");
					throw new ApplicationException();
				}
				gobeaccElement.setGobeaccActivityDate(toDate(getFormModel().getFormHeader().getCurrentDate(), GDate.getNlsDateFormat()));
				gobeaccElement.setGobeaccUserId(getFormModel().getFormHeader().getCurrentUser());
			}

		
		/* Original PL/SQL code code for TRIGGER GOBEACC.GOBEACC_ALERT
		 <multilinecomment>******************************************
   Code modified by the Forms Migration Assistant
   19-Nov-2003 01:11 PM
 ******************************************</multilinecomment>

declare 
   alert_button number;
   alert_id  ALERT := FIND_ALERT('INSERT_ERROR');
begin
   if :err_code = '1' then
      :eacc_error_msg :=  G$_NLS.Get('GOAEACC-0004', 'FORM','*ERROR* The user is already associated with an ID') ;
   elsif :err_code = '2' then
   	-- 52-1 defect 48033 change word from assocaited into associated
      :eacc_error_msg :=  G$_NLS.Get('GOAEACC-0005', 'FORM','*ERROR* The individual is already associated with an ORACLE Username') ;
   end if;
   SET_ALERT_PROPERTY(alert_id, ALERT_MESSAGE_TEXT,:eacc_error_msg);
   alert_button := show_alert('INSERT_ERROR');
   if alert_button = ALERT_BUTTON1 then
       null;
   end if;
end;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBEACC.GOBEACC_ALERT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="GOBEACC_ALERT")
		public void gobeacc_GobeaccAlert()
		{
			
				// ******************************************
				// Code modified by the Forms Migration Assistant
				// 19-Nov-2003 01:11 PM
				// ******************************************

				GobeaccAdapter gobeaccElement = (GobeaccAdapter)this.getFormModel().getGobeacc().getRowAdapter(true);

				if(gobeaccElement!=null)
				{
					NNumber alertButton= NNumber.getNull();
					AlertDescriptor alertId = findAlert("INSERT_ERROR");
					if ( gobeaccElement.getErrCode().equals("1") )
					{
						gobeaccElement.setEaccErrorMsg(GNls.Fget(toStr("GOAEACC-0004"), toStr("FORM"), toStr("*ERROR* The user is already associated with an ID")));
					}
					else if ( gobeaccElement.getErrCode().equals("2") ) {
						//  52-1 defect 48033 change word from assocaited into associated
						gobeaccElement.setEaccErrorMsg(GNls.Fget(toStr("GOAEACC-0005"), toStr("FORM"), toStr("*ERROR* The individual is already associated with an ORACLE Username")));
					}
					setAlertMessageText(alertId, gobeaccElement.getEaccErrorMsg());
					alertButton = toNumber(showAlert("INSERT_ERROR"));
					if ( alertButton.equals(MessageServices.BUTTON1) )
					{
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOBEACC.PRE-UPDATE
		 if :wacs_id is null then
  message( G$_NLS.Get('GOAEACC-0006', 'FORM','*ERROR* Must enter Banner ID before COMMIT.') );
  RAISE FORM_TRIGGER_FAILURE;
end if;
--
:gobeacc_activity_date := to_date(:CURRENT_DATE,G$_DATE.GET_NLS_DATE_FORMAT);
:GOBEACC_USER_ID := :CURRENT_USER;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBEACC.PRE-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowUpdate
		public void gobeacc_BeforeRowUpdate(RowAdapterEvent args)
		{
			
				GobeaccAdapter gobeaccElement = (GobeaccAdapter)args.getRow();


				if ( gobeaccElement.getWacsId().isNull() )
				{
					errorMessage(GNls.Fget(toStr("GOAEACC-0006"), toStr("FORM"), toStr("*ERROR* Must enter Banner ID before COMMIT.")));
					throw new ApplicationException();
				}
				// 
				gobeaccElement.setGobeaccActivityDate(toDate(getFormModel().getFormHeader().getCurrentDate(), GDate.getNlsDateFormat()));
				gobeaccElement.setGobeaccUserId(getFormModel().getFormHeader().getCurrentUser());
			}

		
		/* Original PL/SQL code code for TRIGGER GOBEACC.QUERY_ID
		 SET_BLOCK_PROPERTY('GOBEACC',
		    DEFAULT_WHERE,
                  'GOBEACC_PIDM IN 
                  (SELECT SPRIDEN_PIDM 
		   						 FROM   SPRIDEN 
                   WHERE  SPRIDEN_CHANGE_IND IS NULL
                   AND   SPRIDEN_ID LIKE :GOBEACC.WACS_ID)');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBEACC.QUERY_ID
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="QUERY_ID")
		public void gobeacc_QueryId(QueryEvent args)
		{
			SelectionCriteria lvSpridenCrit = new SelectionCriteria();
			
			lvSpridenCrit.add("SPRIDEN_ID", args.getCriteria().get("WACS_ID"));

			List<IDbDataParameter> paramList = new ArrayList<IDbDataParameter>();
			NString lvSpridenStmt = toStr(lvSpridenCrit.createWhereClause((IDataModel)args.getSource(), paramList));

			((IDataModel)args.getSource()).getSelectCommandParams().addAll(paramList);
			
			setBlockWhereClause("GOBEACC", "GOBEACC_PIDM IN \n                  (SELECT SPRIDEN_PIDM \n		   						 FROM   SPRIDEN \n                   WHERE  SPRIDEN_CHANGE_IND IS NULL\n                   AND   " + lvSpridenStmt + ")");
		}

		
		/* Original PL/SQL code code for TRIGGER GOBEACC.PRE-QUERY
		 IF :GOBEACC.WACS_ID IS NOT NULL THEN
	EXECUTE_TRIGGER('QUERY_ID');
ELSE
	SET_BLOCK_PROPERTY('GOBEACC',DEFAULT_WHERE,PROPERTY_TRUE);
END IF;


	

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBEACC.PRE-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeQuery
		public void gobeacc_BeforeQuery(QueryEvent args)
		{
			
				GobeaccAdapter gobeaccElement = (GobeaccAdapter)this.getFormModel().getGobeacc().getRowAdapter(true);


				if ( !gobeaccElement.getWacsId().isNull() )
				{
					executeAction("QUERY_ID", null, null, false, args);
				}
				else
					setBlockWhereClause(getTriggerBlock(), "");
			}

		
		/* Original PL/SQL code code for TRIGGER GOBEACC.KEY-DELREC
		 declare
  lv_proxied_user  VARCHAR2(30);
  proxy_cnt        INTEGER := 0;
  lv_error_users   VARCHAR2(200) := NULL;  
  proxy_cursor     INTEGER; 
  ignore           INTEGER; 
  in_user          VARCHAR2(30) := :gobeacc.gobeacc_username;
--
begin
--
 IF goksyst.F_IsProductInstalled('POSBUD') THEN
--
-- Make sure user that is being deleted is not defined as a proxy user in position control
-- for 'Other Modules'
--
   BEGIN	
  -- Prepare a cursor to select from the source table: 
     proxy_cursor := dbms_sql.open_cursor; 
     DBMS_SQL.PARSE(proxy_cursor, 
         'SELECT UNIQUE ntrprxy_user_id FROM ntrprxy WHERE ntrprxy_proxy_user_id = :a ORDER BY ntrprxy_user_id',1); 
     DBMS_SQL.DEFINE_COLUMN(proxy_cursor, 1, lv_proxied_user,30);
     DBMS_SQL.BIND_VARIABLE(proxy_cursor, ':a', in_user);
     ignore := DBMS_SQL.EXECUTE(proxy_cursor); 
     proxy_cnt := 0;
     lv_error_users := NULL;
  -- Fetch a row  
     LOOP 
       IF DBMS_SQL.FETCH_ROWS(proxy_cursor)>0 THEN 
         -- get column values of the row 
         DBMS_SQL.COLUMN_VALUE(proxy_cursor, 1, lv_proxied_user); 
         proxy_cnt := proxy_cnt + 1;
         IF (lv_error_users IS NULL) OR (LENGTH(lv_error_users) < 170) THEN
           lv_error_users := lv_error_users || lv_proxied_user || ',';
         END IF;
       ELSE 
  -- No more rows 
         EXIT; 
      END IF; 
    END LOOP; 
   -- close all cursors: 
     DBMS_SQL.CLOSE_CURSOR(proxy_cursor); 
     IF proxy_cnt > 0 THEN
       MESSAGE(SUBSTR(G$_NLS.Get('GOAEACC-0007','FORM','*ERROR* User %01% cannot be deleted since it is a proxy %02% time(s) on NTRPROX for: %03%',
  	                             in_user,proxy_cnt,rtrim(lv_error_users,',')),1,200),acknowledge);
  	   RAISE form_trigger_failure;
     END IF;
--
-- Make sure user that is being deleted is not defined as a proxy user in position control
-- for the Electronic Approval Module
--	
  -- Prepare a cursor to select from the source table: 
     proxy_cursor := dbms_sql.open_cursor; 
     DBMS_SQL.PARSE(proxy_cursor, 
         'SELECT UNIQUE ntrprox_user_id FROM ntrprox WHERE ntrprox_proxy_user_id = :a ORDER BY ntrprox_user_id',1); 
     DBMS_SQL.DEFINE_COLUMN(proxy_cursor, 1, lv_proxied_user,30);
     DBMS_SQL.BIND_VARIABLE(proxy_cursor, ':a', in_user);
     ignore := DBMS_SQL.EXECUTE(proxy_cursor); 
     proxy_cnt := 0;
     lv_error_users := NULL; 
  -- Fetch a row 
     LOOP 
       IF DBMS_SQL.FETCH_ROWS(proxy_cursor)>0 THEN 
         -- get column values of the row 
         DBMS_SQL.COLUMN_VALUE(proxy_cursor, 1, lv_proxied_user); 
         proxy_cnt := proxy_cnt + 1;
         IF (lv_error_users IS NULL) OR (LENGTH(lv_error_users) < 170) THEN
           lv_error_users := lv_error_users || lv_proxied_user || ',';
         END IF;
       ELSE 
  -- No more rows 
         EXIT; 
      END IF; 
    END LOOP; 
   -- close all cursors: 
     DBMS_SQL.CLOSE_CURSOR(proxy_cursor); 
     IF proxy_cnt > 0 THEN
       MESSAGE(SUBSTR(G$_NLS.Get('GOAEACC-0008','FORM','*ERROR* User %01% cannot be deleted since it is a proxy %02% time(s) on NTRPROX for: %03%',
  	                             in_user,proxy_cnt,rtrim(lv_error_users,',')),1,200),acknowledge);
  	   RAISE form_trigger_failure;
     END IF;
--
-- Make sure user that is being deleted is not defined as an approver in position control
-- for the Electronic Approval Module or 'Other Modules'
--	
  -- Prepare a cursor to select from the source table: 
     proxy_cursor := dbms_sql.open_cursor; 
     DBMS_SQL.PARSE(proxy_cursor, 
         'SELECT ntrprox_user_id ' ||
         '  FROM ntrprox ' ||
         ' WHERE ntrprox_user_id = :a ' ||
         ' UNION ' ||
         'SELECT ntrprxy_user_id ' ||
         '  FROM ntrprxy ' ||
         ' WHERE ntrprxy_user_id = :b ',1);
     DBMS_SQL.DEFINE_COLUMN(proxy_cursor, 1, lv_proxied_user,30);
     DBMS_SQL.BIND_VARIABLE(proxy_cursor, ':a', in_user);
     DBMS_SQL.BIND_VARIABLE(proxy_cursor, ':b', in_user);
     ignore := DBMS_SQL.EXECUTE(proxy_cursor); 
     proxy_cnt := 0;
  -- Fetch a row 
     IF DBMS_SQL.FETCH_ROWS(proxy_cursor)>0 THEN 
       -- get column values of the row 
       DBMS_SQL.COLUMN_VALUE(proxy_cursor, 1, lv_proxied_user); 
       proxy_cnt := proxy_cnt + 1;
     END IF; 
   -- close all cursors: 
     DBMS_SQL.CLOSE_CURSOR(proxy_cursor); 
     IF proxy_cnt > 0 THEN
       MESSAGE(G$_NLS.Get('GOAEACC-0009','FORM','*ERROR* User %01% cannot be deleted since it is defined as an approver on NTRPROX.',in_user),acknowledge);
  	   RAISE form_trigger_failure;
     END IF;
   EXCEPTION
-- The NTRPROX and NTRPRXY tables were not installed until after 8.1. If GOAEACC
-- is installed with pre 8.1, then the tables will not exist. This will catch
-- those errors and bypass any checking of the tables.	
     WHEN OTHERS THEN
       if sqlcode = -942 then -- TABLE OR VIEW DOES NOT EXIST
         proxy_cnt := 0;
       else
 	  	   RAISE form_trigger_failure;
       end if;
  END;
 END IF;

 DELETE_RECORD;

END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBEACC.KEY-DELREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DELREC", function=KeyFunction.DELETE_RECORD)
		public void gobeacc_DeleteRecord()
		{
			
		GobeaccAdapter gobeaccElement = (GobeaccAdapter) this.getFormModel()
				.getGobeacc().getRowAdapter(true);

		if (gobeaccElement != null) {
			NString lvProxiedUser = NString.getNull();
			NInteger proxyCnt = toInt(0);
			NString lvErrorUsers = NString.getNull();
			NInteger proxyCursor = NInteger.getNull();
			NInteger ignore = NInteger.getNull();
			NString inUser = gobeaccElement.getGobeaccUsername();

			if (Goksyst.fIsproductinstalled(toStr("POSBUD")).getValue()) {

				// Prepare a cursor to select from the source table:
				String sqlptiCursor = "SELECT UNIQUE ntrprxy_user_id FROM ntrprxy WHERE ntrprxy_proxy_user_id = :a ORDER BY ntrprxy_user_id";
				DataCursor ptiCursor = new DataCursor(sqlptiCursor);

				try {
					// Setting query parameters
					ptiCursor.addParameter("a", inUser);
					ptiCursor.open();
					ResultSet ptiCursorResults = ptiCursor.fetchInto();
					proxyCnt = toInt(0);
					lvErrorUsers = toStr(null);
					while (ptiCursorResults != null) {
						lvProxiedUser = ptiCursorResults.getStr(0);
						proxyCnt = proxyCnt.add(1);
						if ((lvErrorUsers.isNull()) || (length(lvErrorUsers).lesser(170))) {
							lvErrorUsers = lvErrorUsers.append(lvProxiedUser).append(", ");
						}
						ptiCursorResults = ptiCursor.fetchInto();

					}
					
				}catch(Exception  e)
				{
					if ( errorCode().equals(- (942)) )
					{
						//  TABLE OR VIEW DOES NOT EXIST
						proxyCnt = toInt(0);
					}
					else {
						throw new ApplicationException();
					}
				} finally {
					ptiCursor.close();
				}

				if (proxyCnt.greater(0)) {
					errorMessage(substring(
							GNls.Fget(
									toStr("GOAEACC-0007"),
									toStr("FORM"),
									toStr("*ERROR* User %01% cannot be deleted since it is a proxy %02% time(s) on NTRPROX for: %03%"),
									inUser, toStr(proxyCnt),
									rtrim(lvErrorUsers, ",")), toInt(1),
							toInt(200)), OutputMessageUserResponse.ACKNOWLEDGE);
					throw new ApplicationException();
				}

				//
				// Make sure user that is being deleted is not defined as a
				// proxy user in position control
				// for the Electronic Approval Module
				//
				// Prepare a cursor to select from the source table:
				sqlptiCursor = "SELECT UNIQUE ntrprox_user_id FROM ntrprox WHERE ntrprox_proxy_user_id = :a ORDER BY ntrprox_user_id";
				ptiCursor = new DataCursor(sqlptiCursor);
				try {
					// Setting query parameters
					ptiCursor.addParameter("a", inUser);
					ptiCursor.open();
					ResultSet ptiCursorResults = ptiCursor.fetchInto();
					proxyCnt = toInt(0);
					lvErrorUsers = toStr(null);
					// Fetch a row
					while (ptiCursorResults != null) {
						lvProxiedUser = ptiCursorResults.getStr(0);
						proxyCnt = proxyCnt.add(1);
						if ((lvErrorUsers.isNull()) || (length(lvErrorUsers).lesser(170))) {
							lvErrorUsers = lvErrorUsers.append(lvProxiedUser).append(", ");
						}
						ptiCursorResults = ptiCursor.fetchInto();

					}
				}catch(Exception  e)
				{
					if ( errorCode().equals(- (942)) )
					{
						//  TABLE OR VIEW DOES NOT EXIST
						proxyCnt = toInt(0);
					}
					else {
						throw new ApplicationException();
					}
				} finally {
					ptiCursor.close();
				}

				if (proxyCnt.greater(0)) {
					errorMessage(substring(
							GNls.Fget(
									toStr("GOAEACC-0008"),
									toStr("FORM"),
									toStr("*ERROR* User %01% cannot be deleted since it is a proxy %02% time(s) on NTRPROX for: %03%"),
									inUser, toStr(proxyCnt),
									rtrim(lvErrorUsers, ",")), toInt(1),
							toInt(200)), OutputMessageUserResponse.ACKNOWLEDGE);
					throw new ApplicationException();
				}

				//
				// Make sure user that is being deleted is not defined as an
				// approver in position control
				// for the Electronic Approval Module or 'Other Modules'
				//
				// Prepare a cursor to select from the source table:
				sqlptiCursor = "SELECT ntrprox_user_id FROM ntrprox WHERE ntrprox_user_id = :a UNION SELECT ntrprxy_user_id FROM ntrprxy WHERE ntrprxy_user_id = :b ";
				ptiCursor = new DataCursor(sqlptiCursor);
				try {
					ptiCursor.addParameter("a", inUser);
					ptiCursor.addParameter("b", inUser);
					ptiCursor.open();
					ResultSet ptiCursorResults = ptiCursor.fetchInto();
					proxyCnt = toInt(0);
					lvErrorUsers = toStr(null);
					// Fetch a row
					if (ptiCursorResults != null) {
						// get column values of the row
						lvProxiedUser = ptiCursorResults.getStr(0);
						proxyCnt = proxyCnt.add(1);
					}
				}catch(Exception  e)
				{
					if ( errorCode().equals(- (942)) )
					{
						//  TABLE OR VIEW DOES NOT EXIST
						proxyCnt = toInt(0);
					}
					else {
						throw new ApplicationException();
					}
				} finally {
					ptiCursor.close();
				}

				if (proxyCnt.greater(0)) {
					errorMessage(GNls.Fget(
							toStr("GOAEACC-0009"),
							toStr("FORM"),
							toStr("*ERROR* User %01% cannot be deleted since it is defined as an approver on NTRPROX."),
							inUser), OutputMessageUserResponse.ACKNOWLEDGE);
					throw new ApplicationException();
				}
			}
			deleteRecord();
		}

	}

		
		/* Original PL/SQL code code for TRIGGER GOBEACC_USERNAME.KEY-LISTVAL
		 SET_ITEM_PROPERTY('GOBEACC_USERNAME',LOV_NAME,'ALL_USERS_LOV');
g$_display_lov('','');

if :global.value is not null then
	:GOBEACC_USERNAME := :global.value;
	:global.value := '';
end if;


if :gobeacc.wacs_id is not null then
  next_item;
  previous_item;
end if;




		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBEACC_USERNAME.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="GOBEACC_USERNAME", function=KeyFunction.LIST_VALUES)
		public void gobeaccUsername_ListValues()
		{
			

				GobeaccAdapter gobeaccElement = (GobeaccAdapter)this.getFormModel().getGobeacc().getRowAdapter(true);

				if(gobeaccElement!=null){
					setItemLovName("GOBEACC_USERNAME", "ALL_USERS_LOV");
					getTask().getGoqrpls().gDisplayLov(toStr(""), toStr(""));
					if ( !getGlobal("VALUE").isNull() )
					{
						gobeaccElement.setGobeaccUsername(getGlobal("VALUE"));
						setGlobal("VALUE", toStr(""));
					}
					if ( !gobeaccElement.getWacsId().isNull() )
					{
						nextItem();
						previousItem();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOBEACC_USERNAME.KEYCQUERY
		 SET_ITEM_PROPERTY('GOBEACC_USERNAME',LOV_NAME,'GOBVUSR_LOV');
g$_display_lov('','');
if :gobeacc.wacs_id is not null then
  next_item;
  previous_item;
end if;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBEACC_USERNAME.KEYCQUERY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEYCQUERY", item="GOBEACC_USERNAME")
		public void gobeaccUsername_Keycquery()
		{
			

				GobeaccAdapter gobeaccElement = (GobeaccAdapter)this.getFormModel().getGobeacc().getRowAdapter(true);

				if(gobeaccElement!=null){
					setItemLovName("GOBEACC_USERNAME", "GOBVUSR_LOV");
					getTask().getGoqrpls().gDisplayLov(toStr(""), toStr(""));
					if ( !gobeaccElement.getWacsId().isNull() )
					{
						nextItem();
						previousItem();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOBEACC_USERNAME.WHEN-VALIDATE-ITEM
		 if :gobeacc_username is null then
   return;
end if;
--
:name := '';
:gobeacc_pidm := '';
P_CheckUsername(:gobeacc_username, :wacs_id, --:vusr_ind,
                        :iden_rec_cnt,:err_code);
--
if :err_code = '1' then
declare 
   alert_button number;
begin
  alert_button := show_alert('INVALID_ORACLE_ID_ALERT');
--
-- see audit trail 4.1-3
 RAISE FORM_TRIGGER_FAILURE;
--
  if alert_button = ALERT_BUTTON1 then
        null;
  message('Username '||:gobeacc.gobeacc_username);
--      :GOBEACC.GOBEACC_USERNAME := '';
--       RAISE FORM_TRIGGER_FAILURE;
  end if;
end;
end if;
--
<multilinecomment>
if :vusr_ind = 'N' then
declare 
   alert_button number;
begin
  alert_button := show_alert('USER_NO_VBS_PROFILE_ALERT');
  if alert_button = ALERT_BUTTON1 then
    NULL;
  end if;
end;
end if;
</multilinecomment>

--


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBEACC_USERNAME.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="GOBEACC_USERNAME")
		public void gobeaccUsername_validate()
		{
			

				GobeaccAdapter gobeaccElement = (GobeaccAdapter)this.getFormModel().getGobeacc().getRowAdapter(true);

				if(gobeaccElement!=null){
					if ( gobeaccElement.getGobeaccUsername().isNull() )
					{
						return ;
					}
					gobeaccElement.setNname(toStr(""));
					gobeaccElement.setGobeaccPidm(toNumber(""));
					Ref<NString> id_ref = new Ref<NString>(gobeaccElement.getWacsId());
					Ref<NNumber> idenReccnt_ref = new Ref<NNumber>(gobeaccElement.getIdenRecCnt());
					Ref<NString> errCode_ref = new Ref<NString>(gobeaccElement.getErrCode());
					this.getTask().getServices().pCheckusername(gobeaccElement.getGobeaccUsername(), id_ref, idenReccnt_ref, errCode_ref);
					gobeaccElement.setWacsId(id_ref.val);
					gobeaccElement.setIdenRecCnt(idenReccnt_ref.val);
					gobeaccElement.setErrCode(errCode_ref.val);
					// 
					if ( gobeaccElement.getErrCode().equals("1") )
					{
						{
							NNumber alertButton= NNumber.getNull();
							alertButton = toNumber(showAlert("INVALID_ORACLE_ID_ALERT"));
							if ( alertButton.equals(MessageServices.BUTTON1) )
							{
//								message(toStr("Username ").append(gobeaccElement.getGobeaccUsername()));
							}
							// 
							//  see audit trail 4.1-3
							throw new ApplicationException();
							// 
						}
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * WACS_ID.PRE-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="PRE-TEXT-ITEM", item="WACS_ID", function=KeyFunction.ITEM_IN)
		public void wacsId_itemIn()
		{
			
				getGIdClass().itemIn();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * WACS_ID.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="WACS_ID", function=KeyFunction.NEXT_ITEM)
		public void wacsId_keyNexItem()
		{
			
				getGIdClass().keyNexItem();
			}

		
		/* Original PL/SQL code code for TRIGGER WACS_ID.KEY-CQUERY
		 -- 54-1 add trigger to provide Option List Window display and
--      access to GUIALTI form
G$_COPY_FLD_ATTR;
EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
G$_CHECK_FAILURE;
G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER,'GUIALTI','');
G$_RESET_GLOBAL;
--
IF :GLOBAL.VALUE IS NOT NULL THEN
  :WACS_ID := :GLOBAL.VALUE;
   next_item;
  :GLOBAL.VALUE := '';
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * WACS_ID.KEY-CQUERY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CQUERY", item="WACS_ID", function=KeyFunction.COUNT_QUERY)
		public void wacsId_TotalResults()
		{
			
				//  54-1 add trigger to provide Option List Window display and
				//       access to GUIALTI form

				GobeaccAdapter gobeaccElement = (GobeaccAdapter)this.getFormModel().getGobeacc().getRowAdapter(true);

				if(gobeaccElement!=null){
					//  54-1 add trigger to provide Option List Window display and
					//       access to GUIALTI form
					getTask().getGoqrpls().gCopyFldAttr();
					executeAction("G$_REVOKE_ACCESS");
					getTask().getGoqrpls().gCheckFailure();
					getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("GUIALTI"), toStr(""));
					getTask().getGoqrpls().gResetGlobal();
					// 
					if ( !getGlobal("VALUE").isNull() )
					{
						gobeaccElement.setWacsId(getGlobal("VALUE"));
						nextItem();
						setGlobal("VALUE", toStr(""));
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * WACS_ID.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="WACS_ID")
		public void wacsId_PostChange()
		{
			
				getGIdClass().postChange();
			}

		
		/* Original PL/SQL code code for TRIGGER WACS_ID.WHEN-VALIDATE-ITEM
		 
IF :SYSTEM.MODE = 'QUERY' THEN
 RETURN;
END IF;
--
IF :WACS_ID IS NULL THEN
  :gobeacc_pidm := '';
    :name := '';
   RETURN;
END IF;

--
if :gobeacc_pidm is null then
    G$_VALID_ID(:wacs_id,:gobeacc_pidm, :name, :confid_info, :deceased_ind);
end if;



		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * WACS_ID.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="WACS_ID")
		public void wacsId_validate()
		{
			

				GobeaccAdapter gobeaccElement = (GobeaccAdapter)this.getFormModel().getGobeacc().getRowAdapter(true);


				if (gobeaccElement!=null) {
						this.wacsId_PostChange();
						
						if ( getMode().equals("QUERY") )
						{
							return ;
						}
						// 
						if ( gobeaccElement.getWacsId().isNull() )
						{
							gobeaccElement.setGobeaccPidm(toNumber(""));
							gobeaccElement.setNname(toStr(""));
							return ;
						}
						// 
						if ( gobeaccElement.getGobeaccPidm().isNull() )
						{
							Ref<NString> pId_ref = new Ref<NString>(gobeaccElement.getWacsId());
							Ref<NNumber> pPIdm_ref = new Ref<NNumber>(gobeaccElement.getGobeaccPidm());
							Ref<NString> pFullName_ref = new Ref<NString>(gobeaccElement.getNname());
							Ref<NString> pConfidInd_ref = new Ref<NString>(gobeaccElement.getConfidInfo());
							Ref<NString> pDcsdInd_ref = new Ref<NString>(gobeaccElement.getDeceasedInd());
							getTask().getGoqrpls().gValidId(pId_ref, pPIdm_ref, pFullName_ref, pConfidInd_ref, pDcsdInd_ref);
							gobeaccElement.setWacsId(pId_ref.val);
							gobeaccElement.setGobeaccPidm(pPIdm_ref.val);
							gobeaccElement.setNname(pFullName_ref.val);
							gobeaccElement.setConfidInfo(pConfidInd_ref.val);
							gobeaccElement.setDeceasedInd(pDcsdInd_ref.val);
						}
				}
			}
		
		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="WACS_ID")
		public void wacsId_buttonClick()
		{
			
				//  54-1 add code to provide Option List Window display and
				//       access to GUIALTI form
				//  54-1 add code to provide Option List Window display and
				//       access to GUIALTI form
				goItem(toStr("GOBEACC.WACS_ID"));
				getTask().getGoqrpls().gKeyOptMenu(toStr("GOBEACC.WACS_ID"), GNls.Fget(toStr("GOAEACC-0010"), toStr("FORM"), toStr("Valid Banner ID (SOAIDEN)")), toStr("LIST_VALUES"), GNls.Fget(toStr("GOAEACC-0011"), toStr("FORM"), toStr("Alternate ID Search (GUIALTI)")), toStr("COUNT_QUERY"), toStr(""), toStr(""), toStr(""), toStr(""));
				getTask().getGoqrpls().gCheckFailure();
			}
		
		/* Original PL/SQL code code for TRIGGER WACS_ID.KEY-LISTVAL
		    G$_COPY_FLD_ATTR;
   EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
   G$_CHECK_FAILURE;
   G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER, 'SOAIDEN', '');
   G$_RESET_GLOBAL;
--
IF :GLOBAL.VALUE IS NOT NULL THEN
  :WACS_ID := :GLOBAL.VALUE;
   next_item;
  :GLOBAL.VALUE := '';
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * WACS_ID.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="WACS_ID", function=KeyFunction.LIST_VALUES)
		public void wacsId_ListValues()
		{
			

				GobeaccAdapter gobeaccElement = (GobeaccAdapter)this.getFormModel().getGobeacc().getRowAdapter(true);

				if(gobeaccElement!=null){
					getTask().getGoqrpls().gCopyFldAttr();
					executeAction("G$_REVOKE_ACCESS");
					getTask().getGoqrpls().gCheckFailure();
					getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("SOAIDEN"), toStr(""));
					getTask().getGoqrpls().gResetGlobal();
					// 
					if ( !getGlobal("VALUE").isNull() )
					{
						gobeaccElement.setWacsId(getGlobal("VALUE"));
						this.wacsId_validate();
						nextItem();
						setGlobal("VALUE", toStr(""));
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * NAME.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="NAME", function=KeyFunction.NEXT_ITEM)
		public void name_keyNexItem()
		{
			
				getGNameClass().keyNexItem();
			}

		
	
	
}

