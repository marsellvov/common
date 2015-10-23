package net.hedtech.banner.general.common.Gxadird.controller;
 
import java.sql.RowId;
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
import net.hedtech.banner.general.common.Gxadird.model.*;
import net.hedtech.banner.general.common.Gxadird.*;
import net.hedtech.banner.general.common.Gxadird.services.*;
import net.hedtech.banner.general.common.Noqlibr.model.NobtranAdapter;
import net.hedtech.general.common.libraries.Goqolib.services.GCodeClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GDescClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GDateClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GIconBtnClass;	
		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class GxrdirdController extends DefaultBlockController {

	private GCodeClass getGCodeClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GCodeClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_CODE_CLASS");
	}	
	private GDescClass getGDescClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GDescClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_DESC_CLASS");
	}	
	private GDateClass getGDateClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GDateClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_DATE_CLASS");
	}	
	private GIconBtnClass getGIconBtnClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GIconBtnClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_ICON_BTN_CLASS");
	}	

	
	public GxrdirdController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
		
	@Override
	public GxadirdTask getTask() {
		return (GxadirdTask)super.getTask();
	}

	public GxadirdModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
		/* Original PL/SQL code code for TRIGGER GXRDIRD.POST-QUERY
		 EXECUTE_TRIGGER('GET_ROWID');
G$_CHECK_FAILURE;
IF :HOLD_SECURITY='N' AND :GXRDIRD_ATYP_CODE_IAT IS NULL THEN
	SET_ITEM_INSTANCE_PROPERTY('GXRDIRD_ADDR_SEQNO_IAT',CURRENT_RECORD,UPDATE_ALLOWED,PROPERTY_OFF);
ELSE
		SET_ITEM_INSTANCE_PROPERTY('GXRDIRD_ADDR_SEQNO_IAT',CURRENT_RECORD,NAVIGABLE,PROPERTY_TRUE);
		SET_ITEM_INSTANCE_PROPERTY('GXRDIRD_ADDR_SEQNO_IAT',CURRENT_RECORD,UPDATE_ALLOWED,PROPERTY_TRUE);
		SET_ITEM_INSTANCE_PROPERTY('GXRDIRD_ADDR_SEQNO_IAT',CURRENT_RECORD,INSERT_ALLOWED,PROPERTY_TRUE);
END IF;


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void gxrdird_AfterQuery(RowAdapterEvent args)
		{
			
				GxrdirdAdapter gxrdirdElement = (GxrdirdAdapter)args.getRow();

				try
				{
					gxrdirdElement.setLockDbValues(true);
                                         try {  
                                        this.gxrdirdBankRoutNum_PostChange(); 
                                        } catch(Exception ex) { 
                                        } 
                                         try {  
                                        this.gxrdirdAcctType_PostChange(); 
                                        } catch(Exception ex) { 
                                        } 
                                         try {  
                                        this.gxrdirdStatus_PostChange(); 
                                        } catch(Exception ex) { 
                                        } 
                                         try {  
                                        this.gxrdirdAmount_PostChange(); 
                                        } catch(Exception ex) { 
                                        } 
                                         try {  
                                        this.gxrdirdPercent_PostChange(); 
                                        } catch(Exception ex) { 
                                        } 
                                         try {  
                                        this.gxrdirdScodCodeIso_PostChange(); 
                                        } catch(Exception ex) { 
                                        } 
                                         try {  
                                        this.gxrdirdAchtCode_PostChange(); 
                                        } catch(Exception ex) { 
                                        } 
                                         try {  
                                        this.gxrdirdDocType_PostChange(); 
                                        } catch(Exception ex) { 
                                        } 

				} finally { 
					gxrdirdElement.setLockDbValues(false);
				}
				executeAction("GET_ROWID");
				getTask().getGoqrpls().gCheckFailure();
				if ( getFormModel().getFormHeader().getHoldSecurity().equals("N") && gxrdirdElement.getGxrdirdAtypCodeIat().isNull() )
				{
					setItemUpdateAllowed("GXRDIRD_ADDR_SEQNO_IAT", ItemServices.CURRENT_RECORD, false);
				}
				else {
					setItemEnabled("GXRDIRD_ADDR_SEQNO_IAT", ItemServices.CURRENT_RECORD, true);
					setItemUpdateAllowed("GXRDIRD_ADDR_SEQNO_IAT", ItemServices.CURRENT_RECORD, true);
					setItemInsertAllowed("GXRDIRD_ADDR_SEQNO_IAT", ItemServices.CURRENT_RECORD, true);
				}
			}
		
		@BeforeQuery
		public void gxrdird_BeforeQuery(QueryEvent args)
		{
				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("PIDM", getFormModel().getKeyBlock().getPidm() ));             

		}

		
		/* Original PL/SQL code code for TRIGGER GXRDIRD.GET_ROWID
		 DECLARE
CURSOR GET_ROWID IS
 SELECT ROWID FROM GXRDIRD
 WHERE gxrdird_pidm=:gxrdird_pidm
 and gxrdird_bank_rout_num=:gxrdird_bank_rout_num
 and (gxrdird_atyp_code=:gxrdird_atyp_code
 or (:gxrdird_atyp_code is null and gxrdird_atyp_code is null))
 and (gxrdird_addr_seqno=:gxrdird_addr_seqno
 or (:gxrdird_addr_seqno is null and gxrdird_addr_seqno is null))
 and gxrdird_bank_acct_num=:gxrdird_bank_acct_num
 -- 5301-2
 and gxrdird_priority =:gxrdird_priority;
BEGIN
<multilinecomment>  :SYSTEM.MESSAGE_LEVEL:='5';
 COMMIT_FORM;
 :SYSTEM.MESSAGE_LEVEL:='0';</multilinecomment>

 OPEN GET_ROWID; 
 FETCH GET_ROWID INTO :HOLD_ROWID;
 
 IF GET_ROWID%NOTFOUND THEN
    :HOLD_ROWID:='';
 END IF;
 
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD.GET_ROWID
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="GET_ROWID")
		public void gxrdird_GetRowid()
		{
			
				GxrdirdAdapter gxrdirdElement = (GxrdirdAdapter)this.getFormModel().getGxrdird().getRowAdapter(true);
				if(gxrdirdElement ==null)
					return;


				int rowCount = 0;
				{
					String sqlgetRowid = "SELECT ROWID FROM GXRDIRD WHERE gxrdird_pidm = :GXRDIRD_PIDM AND gxrdird_bank_rout_num = :GXRDIRD_BANK_ROUT_NUM AND (gxrdird_atyp_code = :GXRDIRD_ATYP_CODE OR (:GXRDIRD_ATYP_CODE IS NULL AND gxrdird_atyp_code IS NULL)) AND (gxrdird_addr_seqno = :GXRDIRD_ADDR_SEQNO OR (:GXRDIRD_ADDR_SEQNO IS NULL AND gxrdird_addr_seqno IS NULL)) AND gxrdird_bank_acct_num = :GXRDIRD_BANK_ACCT_NUM AND gxrdird_priority = :GXRDIRD_PRIORITY ";
					DataCursor getRowid = new DataCursor(sqlgetRowid);
					try {
						getRowid.addParameter("GXRDIRD_PIDM", gxrdirdElement.getGxrdirdPidm());
						getRowid.addParameter("GXRDIRD_BANK_ROUT_NUM", gxrdirdElement.getGxrdirdBankRoutNum());
						getRowid.addParameter("GXRDIRD_ATYP_CODE", gxrdirdElement.getGxrdirdAtypCode());
						getRowid.addParameter("GXRDIRD_ADDR_SEQNO", gxrdirdElement.getGxrdirdAddrSeqno());
						getRowid.addParameter("GXRDIRD_BANK_ACCT_NUM", gxrdirdElement.getGxrdirdBankAcctNum());
						getRowid.addParameter("GXRDIRD_PRIORITY", gxrdirdElement.getGxrdirdPriority());
						getRowid.open();
						ResultSet getRowidResults = getRowid.fetchInto();
						if ( getRowidResults != null ) {
							
							gxrdirdElement.setHoldRowid(toStr(DbManager.getDataBaseFactory().rowidToString((RowId) getRowidResults.getObject(0))));
						}
						if ( getRowid.notFound() )
						{
							gxrdirdElement.setHoldRowid(toStr(""));
						}
					}
					finally{
						getRowid.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GXRDIRD.CHECK_PRIORITY
		 -- 5301-1  add GXRDIRD_PRIORITY line HR_EDIT cursor
-- 5301-1  CLOSE cursors after OPEN and FETCH
DECLARE
 HOLD_PRIORITY VARCHAR2(1);
 HOLD_VALUE VARCHAR2(1);
 HOLD_ROWID VARCHAR2(30);

 CURSOR CHK_HR_USER_PRIORITY IS
 SELECT 'Y' FROM GXRDIRD
 WHERE GXRDIRD_PRIORITY=:GXRDIRD_PRIORITY
 AND GXRDIRD_PIDM=:GXRDIRD_PIDM;
-- 5301-2 
-- AND (ROWID!=HOLD_ROWID
-- OR HOLD_ROWID IS NULL)    ;

CURSOR HR_EDIT IS
 SELECT 'Y' FROM GXRDIRD
 WHERE GXRDIRD_BANK_ROUT_NUM=:GXRDIRD_BANK_ROUT_NUM
 AND GXRDIRD_PIDM=:GXRDIRD_PIDM
 AND GXRDIRD_BANK_ACCT_NUM=:GXRDIRD_BANK_ACCT_NUM
 AND GXRDIRD_PRIORITY = :GXRDIRD_PRIORITY;
 --AND ROWID!=HOLD_ROWID;

 CURSOR GET_ROWID IS
 SELECT ROWID FROM GXRDIRD
 WHERE gxrdird_pidm=:gxrdird_pidm
 and gxrdird_bank_rout_num=:gxrdird_bank_rout_num
 <multilinecomment>and (gxrdird_atyp_code=:gxrdird_atyp_code
 or :gxrdird_atyp_code is null)
 and (gxrdird_addr_seqno=:gxrdird_addr_seqno
 or :gxrdird_addr_seqno is null)</multilinecomment>
 and gxrdird_bank_acct_num=:gxrdird_bank_acct_num;
BEGIN
IF :HOLD_SECURITY='Y' THEN
 OPEN GET_ROWID; 
 FETCH GET_ROWID INTO HOLD_ROWID;
 CLOSE GET_ROWID;
 --
 OPEN HR_EDIT;
 FETCH HR_EDIT INTO HOLD_VALUE;
 --
 IF HR_EDIT%FOUND THEN
    MESSAGE( G$_NLS.Get('GXADIRD-0013', 'FORM','Bank Routing Number, Account Number and Priority are already used in another record') );
    RAISE FORM_TRIGGER_FAILURE;
 END IF;
 CLOSE HR_EDIT;
--
 OPEN CHK_HR_USER_PRIORITY; 
 FETCH CHK_HR_USER_PRIORITY INTO HOLD_PRIORITY;
 IF CHK_HR_USER_PRIORITY%FOUND THEN
    MESSAGE( G$_NLS.Get('GXADIRD-0014', 'FORM','Priority is already used in another record') );
    RAISE FORM_TRIGGER_FAILURE;
 END IF;
 CLOSE CHK_HR_USER_PRIORITY;
END IF;
END; 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD.CHECK_PRIORITY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="CHECK_PRIORITY")
		public void gxrdird_CheckPriority()
		{
				GxrdirdAdapter gxrdirdElement = (GxrdirdAdapter)this.getFormModel().getGxrdird().getRowAdapter(true);
				if(gxrdirdElement ==null)
					return;

				int rowCount = 0;
				{
					NString holdPriority= NString.getNull();
					NString holdValue= NString.getNull();
					NString holdRowid= NString.getNull();
					String sqlchkHrUserPriority = "SELECT 'Y' " +
	" FROM GXRDIRD " +
	" WHERE GXRDIRD_PRIORITY = :GXRDIRD_PRIORITY AND GXRDIRD_PIDM = :GXRDIRD_PIDM ";
					DataCursor chkHrUserPriority = new DataCursor(sqlchkHrUserPriority);
					String sqlhrEdit = "SELECT 'Y' " +
	" FROM GXRDIRD " +
	" WHERE GXRDIRD_BANK_ROUT_NUM = :GXRDIRD_BANK_ROUT_NUM AND GXRDIRD_PIDM = :GXRDIRD_PIDM AND GXRDIRD_BANK_ACCT_NUM = :GXRDIRD_BANK_ACCT_NUM AND GXRDIRD_PRIORITY = :GXRDIRD_PRIORITY ";
					DataCursor hrEdit = new DataCursor(sqlhrEdit);
					String sqlgetRowid = "SELECT ROWID " +
	" FROM GXRDIRD " +
	" WHERE gxrdird_pidm = :GXRDIRD_PIDM AND gxrdird_bank_rout_num = :GXRDIRD_BANK_ROUT_NUM AND gxrdird_bank_acct_num = :GXRDIRD_BANK_ACCT_NUM ";
					DataCursor getRowid = new DataCursor(sqlgetRowid);
					try {
							getRowid.addParameter("GXRDIRD_PIDM", gxrdirdElement.getGxrdirdPidm());
							getRowid.addParameter("GXRDIRD_BANK_ROUT_NUM", gxrdirdElement.getGxrdirdBankRoutNum());
							getRowid.addParameter("GXRDIRD_BANK_ACCT_NUM", gxrdirdElement.getGxrdirdBankAcctNum());
							getRowid.open();
							ResultSet getRowidResults = getRowid.fetchInto();
							if ( getRowidResults != null ) {
								holdRowid = getRowidResults.getStr(0);
							}
							hrEdit.addParameter("GXRDIRD_BANK_ROUT_NUM", gxrdirdElement.getGxrdirdBankRoutNum());
							hrEdit.addParameter("GXRDIRD_PIDM", gxrdirdElement.getGxrdirdPidm());
							hrEdit.addParameter("GXRDIRD_BANK_ACCT_NUM", gxrdirdElement.getGxrdirdBankAcctNum());
							hrEdit.addParameter("GXRDIRD_PRIORITY", gxrdirdElement.getGxrdirdPriority());
							hrEdit.open();
							ResultSet hrEditResults = hrEdit.fetchInto();
							if ( hrEditResults != null ) {
								holdValue = hrEditResults.getStr(0);
							}
							if ( hrEdit.found() )
							{
								errorMessage(GNls.Fget(toStr("GXADIRD-0013"), toStr("FORM"), toStr("*ERROR* Bank Routing Number, Account Number and Priority are already used in another record")));
								throw new ApplicationException();
							}
							chkHrUserPriority.addParameter("GXRDIRD_PRIORITY", gxrdirdElement.getGxrdirdPriority());
							chkHrUserPriority.addParameter("GXRDIRD_PIDM", gxrdirdElement.getGxrdirdPidm());
							chkHrUserPriority.open();
							ResultSet chkHrUserPriorityResults = chkHrUserPriority.fetchInto();
							if ( chkHrUserPriorityResults != null ) {
								holdPriority = chkHrUserPriorityResults.getStr(0);
							}
							if ( chkHrUserPriority.found() )
							{
								errorMessage(GNls.Fget(toStr("GXADIRD-0014"), toStr("FORM"), toStr("*ERROR* Priority is already used in another record")));
								throw new ApplicationException();
							}
						}
					finally{
						getRowid.close();
						hrEdit.close();
						chkHrUserPriority.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GXRDIRD.CHECK_PRIORITY2
		 -- 5301-1  add GXRDIRD_PRIORITY line HR_EDIT cursor
-- 5301-1  comment ROWID line
-- 5301-1  CLOSE cursors after OPEN and FETCH
DECLARE
 HOLD_PRIORITY VARCHAR2(1);
 HOLD_VALUE VARCHAR2(1);
-- HOLD_ROWID VARCHAR2(30);

 CURSOR CHK_HR_USER_PRIORITY IS
 SELECT 'Y' FROM GXRDIRD
 WHERE GXRDIRD_PRIORITY=:GXRDIRD_PRIORITY
 AND GXRDIRD_PIDM=:GXRDIRD_PIDM
 AND ROWID!=:HOLD_ROWID;

CURSOR HR_EDIT IS
 SELECT 'Y' FROM GXRDIRD
 WHERE GXRDIRD_BANK_ROUT_NUM=:GXRDIRD_BANK_ROUT_NUM
 AND GXRDIRD_PIDM=:GXRDIRD_PIDM
 AND GXRDIRD_BANK_ACCT_NUM=:GXRDIRD_BANK_ACCT_NUM
 AND ROWID!=:HOLD_ROWID
 AND GXRDIRD_PRIORITY = :GXRDIRD_PRIORITY;

 CURSOR GET_ROWID IS
 SELECT ROWID FROM GXRDIRD
 WHERE gxrdird_pidm=:gxrdird_pidm
 and gxrdird_bank_rout_num=:gxrdird_bank_rout_num
 and gxrdird_bank_acct_num=:gxrdird_bank_acct_num
 -- 5301-1
 and gxrdird_priority=:gxrdird_priority;
BEGIN

-- 5301-2
-- IF :HOLD_SECURITY='Y' THEN
	IF  :GXRDIRD_HR_IND = 'A' THEN
<multilinecomment> OPEN GET_ROWID; 
 FETCH GET_ROWID INTO :HOLD_ROWID;
-- IF GET_ROWID%ROWCOUNT>0 THEN
--    MESSAGE('Bank Routing Number and Account Number are already used in another record');
--    RAISE FORM_TRIGGER_FAILURE;
-- END IF;
CLOSE GET_ROWID; </multilinecomment>
 
OPEN HR_EDIT;
 FETCH HR_EDIT INTO HOLD_VALUE;

 IF HR_EDIT%FOUND THEN
    MESSAGE( G$_NLS.Get('GXADIRD-0015', 'FORM','Bank Routing Number, Account Number and Priority are already used in another record') );
    RAISE FORM_TRIGGER_FAILURE;
 END IF; 
 CLOSE HR_EDIT;

OPEN CHK_HR_USER_PRIORITY; 
 FETCH CHK_HR_USER_PRIORITY INTO HOLD_PRIORITY;
 IF CHK_HR_USER_PRIORITY%FOUND THEN
    MESSAGE( G$_NLS.Get('GXADIRD-0016', 'FORM','Priority is already used in another record') );
    RAISE FORM_TRIGGER_FAILURE;
 END IF;
  CLOSE CHK_HR_USER_PRIORITY;
END IF;
END; 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD.CHECK_PRIORITY2
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="CHECK_PRIORITY2")
		public void gxrdird_CheckPriority2()
		{
				GxrdirdAdapter gxrdirdElement = (GxrdirdAdapter)this.getFormModel().getGxrdird().getRowAdapter(true);
				if(gxrdirdElement ==null)
					return;


				int rowCount = 0;
				{
					NString holdPriority= NString.getNull();
					NString holdValue= NString.getNull();
					String sqlchkHrUserPriority = "SELECT 'Y' " +
	" FROM GXRDIRD " +
	" WHERE GXRDIRD_PRIORITY = :GXRDIRD_PRIORITY AND GXRDIRD_PIDM = :GXRDIRD_PIDM AND ROWID != :HOLD_ROWID ";
					DataCursor chkHrUserPriority = new DataCursor(sqlchkHrUserPriority);
					String sqlhrEdit = "SELECT 'Y' " +
	" FROM GXRDIRD " +
	" WHERE GXRDIRD_BANK_ROUT_NUM = :GXRDIRD_BANK_ROUT_NUM AND GXRDIRD_PIDM = :GXRDIRD_PIDM AND GXRDIRD_BANK_ACCT_NUM = :GXRDIRD_BANK_ACCT_NUM AND ROWID != :HOLD_ROWID AND GXRDIRD_PRIORITY = :GXRDIRD_PRIORITY ";
					DataCursor hrEdit = new DataCursor(sqlhrEdit);
					String sqlgetRowid = "SELECT ROWID " +
	" FROM GXRDIRD " +
	" WHERE gxrdird_pidm = :GXRDIRD_PIDM AND gxrdird_bank_rout_num = :GXRDIRD_BANK_ROUT_NUM AND gxrdird_bank_acct_num = :GXRDIRD_BANK_ACCT_NUM AND gxrdird_priority = :GXRDIRD_PRIORITY ";
					DataCursor getRowid = new DataCursor(sqlgetRowid);
					try {
						if ( gxrdirdElement.getGxrdirdHrInd().equals("A") )
						{
							hrEdit.addParameter("GXRDIRD_BANK_ROUT_NUM", gxrdirdElement.getGxrdirdBankRoutNum());
							hrEdit.addParameter("GXRDIRD_PIDM", gxrdirdElement.getGxrdirdPidm());
							hrEdit.addParameter("GXRDIRD_BANK_ACCT_NUM", gxrdirdElement.getGxrdirdBankAcctNum());
							hrEdit.addParameter("HOLD_ROWID", gxrdirdElement.getHoldRowid());
							hrEdit.addParameter("GXRDIRD_PRIORITY", gxrdirdElement.getGxrdirdPriority());
							hrEdit.open();
							ResultSet hrEditResults = hrEdit.fetchInto();
							if ( hrEditResults != null ) {
								holdValue = hrEditResults.getStr(0);
							}
							if ( hrEdit.found() )
							{
								errorMessage(GNls.Fget(toStr("GXADIRD-0015"), toStr("FORM"), toStr("*ERROR* Bank Routing Number, Account Number and Priority are already used in another record")));
								throw new ApplicationException();
							}
							chkHrUserPriority.addParameter("GXRDIRD_PRIORITY", gxrdirdElement.getGxrdirdPriority());
							chkHrUserPriority.addParameter("GXRDIRD_PIDM", gxrdirdElement.getGxrdirdPidm());
							chkHrUserPriority.addParameter("HOLD_ROWID", gxrdirdElement.getHoldRowid());
							chkHrUserPriority.open();
							ResultSet chkHrUserPriorityResults = chkHrUserPriority.fetchInto();
							if ( chkHrUserPriorityResults != null ) {
								holdPriority = chkHrUserPriorityResults.getStr(0);
							}
							if ( chkHrUserPriority.found() )
							{
								errorMessage(GNls.Fget(toStr("GXADIRD-0016"), toStr("FORM"), toStr("*ERROR* Priority is already used in another record")));
								throw new ApplicationException();
							}
						}
					}
					finally{
						hrEdit.close();
						chkHrUserPriority.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GXRDIRD.CHECK_AP
		 declare
 hold_value varchar2(1);
cursor chk_gxrdird is
 select 'Y' from gxrdird
 where (gxrdird_ap_ind='A' 
 AND :GXRDIRD_AP_IND='A')
 and gxrdird_pidm=:gxrdird_pidm
 and (gxrdird_atyp_code=:gxrdird_atyp_code
 or (:gxrdird_atyp_code is null and gxrdird_atyp_code is null))
 and (gxrdird_addr_seqno=:gxrdird_addr_seqno
 or (:gxrdird_addr_seqno is null and gxrdird_addr_seqno is null));
 
BEGIN
 
 open chk_gxrdird;
 fetch chk_gxrdird into hold_value;
 if chk_gxrdird%found then 
  MESSAGE( G$_NLS.Get('GXADIRD-0017', 'FORM','A/P Direct Deposit record already exists for this vendor address type and sequence. Please remove newly inserted record and update existing record.') );
  RAISE FORM_TRIGGER_FAILURE;
 end if;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD.CHECK_AP
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="CHECK_AP")
		public void gxrdird_CheckAp()
		{
				GxrdirdAdapter gxrdirdElement = (GxrdirdAdapter)this.getFormModel().getGxrdird().getRowAdapter(true);
				if(gxrdirdElement ==null)
					return;


				int rowCount = 0;
				{
					NString holdValue= NString.getNull();
					String sqlchkGxrdird = "SELECT 'Y' " +
	" FROM gxrdird " +
	" WHERE (gxrdird_ap_ind = 'A' AND :GXRDIRD_AP_IND = 'A') AND gxrdird_pidm = :GXRDIRD_PIDM AND (gxrdird_atyp_code = :GXRDIRD_ATYP_CODE OR (:GXRDIRD_ATYP_CODE IS NULL AND gxrdird_atyp_code IS NULL)) AND (gxrdird_addr_seqno = :GXRDIRD_ADDR_SEQNO OR (:GXRDIRD_ADDR_SEQNO IS NULL AND gxrdird_addr_seqno IS NULL)) ";
					DataCursor chkGxrdird = new DataCursor(sqlchkGxrdird);
					try {
						chkGxrdird.addParameter("GXRDIRD_AP_IND", gxrdirdElement.getGxrdirdApInd());
						chkGxrdird.addParameter("GXRDIRD_PIDM", gxrdirdElement.getGxrdirdPidm());
						chkGxrdird.addParameter("GXRDIRD_ATYP_CODE", gxrdirdElement.getGxrdirdAtypCode());
						chkGxrdird.addParameter("GXRDIRD_ADDR_SEQNO", gxrdirdElement.getGxrdirdAddrSeqno());
						chkGxrdird.open();
						ResultSet chkGxrdirdResults = chkGxrdird.fetchInto();
						if ( chkGxrdirdResults != null ) {
							holdValue = chkGxrdirdResults.getStr(0);
						}
						if ( chkGxrdird.found() )
						{
							errorMessage(GNls.Fget(toStr("GXADIRD-0017"), toStr("FORM"), toStr("*ERROR* A/P Direct Deposit record already exists for this vendor address type and sequence. Please remove newly inserted record and update existing record.")));
							throw new ApplicationException();
						}
					}
					finally{
						chkGxrdird.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GXRDIRD.CHECK_AP2
		 declare
 hold_value varchar2(1);
cursor chk_gxrdird is
 select 'Y' from gxrdird
 where (gxrdird_ap_ind='A' 
 AND :GXRDIRD_AP_IND='A')
 and gxrdird_pidm=:gxrdird_pidm
 and (gxrdird_atyp_code=:gxrdird_atyp_code
 or (:gxrdird_atyp_code is null and gxrdird_atyp_code is null))
 and (gxrdird_addr_seqno=:gxrdird_addr_seqno
 or (:gxrdird_addr_seqno is null and gxrdird_addr_seqno is null))
 AND ROWID!=:HOLD_ROWID;
 
BEGIN
 
 open chk_gxrdird;
 fetch chk_gxrdird into hold_value;
 if chk_gxrdird%found then 
  MESSAGE( G$_NLS.Get('GXADIRD-0018', 'FORM','A/P Direct Deposit record already exists for this vendor address type and sequence. Please remove newly inserted record and update existing record.') );
  RAISE FORM_TRIGGER_FAILURE;
 end if;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD.CHECK_AP2
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="CHECK_AP2")
		public void gxrdird_CheckAp2()
		{
				GxrdirdAdapter gxrdirdElement = (GxrdirdAdapter)this.getFormModel().getGxrdird().getRowAdapter(true);
				if(gxrdirdElement ==null)
					return;


				int rowCount = 0;
				{
					NString holdValue= NString.getNull();
					String sqlchkGxrdird = "SELECT 'Y' " +
	" FROM gxrdird " +
	" WHERE (gxrdird_ap_ind = 'A' AND :GXRDIRD_AP_IND = 'A') AND gxrdird_pidm = :GXRDIRD_PIDM AND (gxrdird_atyp_code = :GXRDIRD_ATYP_CODE OR (:GXRDIRD_ATYP_CODE IS NULL AND gxrdird_atyp_code IS NULL)) AND (gxrdird_addr_seqno = :GXRDIRD_ADDR_SEQNO OR (:GXRDIRD_ADDR_SEQNO IS NULL AND gxrdird_addr_seqno IS NULL)) AND ROWID != :HOLD_ROWID ";
					DataCursor chkGxrdird = new DataCursor(sqlchkGxrdird);
					try {
						chkGxrdird.addParameter("GXRDIRD_AP_IND", gxrdirdElement.getGxrdirdApInd());
						chkGxrdird.addParameter("GXRDIRD_PIDM", gxrdirdElement.getGxrdirdPidm());
						chkGxrdird.addParameter("GXRDIRD_ATYP_CODE", gxrdirdElement.getGxrdirdAtypCode());
						chkGxrdird.addParameter("GXRDIRD_ADDR_SEQNO", gxrdirdElement.getGxrdirdAddrSeqno());
						chkGxrdird.addParameter("HOLD_ROWID", gxrdirdElement.getHoldRowid());
						chkGxrdird.open();
						ResultSet chkGxrdirdResults = chkGxrdird.fetchInto();
						if ( chkGxrdirdResults != null ) {
							holdValue = chkGxrdirdResults.getStr(0);
						}
						if ( chkGxrdird.found() )
						{
							errorMessage(GNls.Fget(toStr("GXADIRD-0018"), toStr("FORM"), toStr("*ERROR* A/P Direct Deposit record already exists for this vendor address type and sequence. Please remove newly inserted record and update existing record.")));
							throw new ApplicationException();
						}
					}
					finally{
						chkGxrdird.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GXRDIRD.PRE-INSERT
		    p_check_addr_info;
   
   IF (:GXRDIRD_BANK_ROUT_NUM IS NULL) THEN
      :GXRDIRD_DOC_TYPE := 'C' ;
      :GXRDIRD_ACCT_TYPE := '' ;
      GOTO TRIGGER_EXIT ;
   END IF ;
--
   IF (:GXRDIRD_BANK_ROUT_NUM IS NOT NULL) THEN
      :GXRDIRD_DOC_TYPE := 'D' ;
   ELSE
      RAISE FORM_TRIGGER_FAILURE ;
   END IF ;
   IF :GXRDIRD_PRIORITY IS NULL THEN
      EXECUTE_TRIGGER('GET_PRIORITY');
   END IF;
--
   << TRIGGER_EXIT >>
-- 5301-2 change following 'IF'
--  IF :HOLD_SECURITY<>'Y' THEN
	 IF  :GXRDIRD_AP_IND = 'A' THEN
      EXECUTE_TRIGGER('CHECK_AP');
      G$_CHECK_FAILURE ;
   END If;
   EXECUTE_TRIGGER( 'UPDATE_ACTIVITY_DATE' ) ;
   G$_CHECK_FAILURE ;
   EXECUTE_TRIGGER( 'UPDATE_USER_ID' ) ;
   G$_CHECK_FAILURE ;
--
-- 5301-2
  IF  :GXRDIRD_HR_IND = 'A' THEN
   EXECUTE_TRIGGER( 'CHECK_DIRD2' ) ;
   G$_CHECK_FAILURE ;
  END IF;
--
   EXECUTE_TRIGGER( 'CHK_ACCT_TYPE' ) ;
   G$_CHECK_FAILURE ;
   EXECUTE_TRIGGER('CHECK_PRIORITY');
   G$_CHECK_FAILURE;
   EXECUTE_TRIGGER('CHECK_ACTIVE');
   G$_CHECK_FAILURE;   
   EXECUTE_TRIGGER('CHECK_IAT_REQ_PROPERTIES');
   G$_CHECK_FAILURE;  
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowInsert
		public void gxrdird_BeforeRowInsert(RowAdapterEvent args)
		{
			
				GxrdirdAdapter gxrdirdElement = (GxrdirdAdapter)args.getRow();


				this.getTask().getServices().pCheckAddrInfo(gxrdirdElement);
				if ((gxrdirdElement.getGxrdirdBankRoutNum().isNull()))
				{
					gxrdirdElement.setGxrdirdDocType(toStr("C"));
					gxrdirdElement.setGxrdirdAcctType(toStr(""));
				}
				else{
					if ((!gxrdirdElement.getGxrdirdBankRoutNum().isNull()))
					{
						gxrdirdElement.setGxrdirdDocType(toStr("D"));
					}
					else {
						throw new ApplicationException();
					}
					if ( gxrdirdElement.getGxrdirdPriority().isNull() )
					{
						executeAction("GET_PRIORITY");
					}
				}
				if ( gxrdirdElement.getGxrdirdApInd().equals("A") )
				{
					executeAction("CHECK_AP");
					getTask().getGoqrpls().gCheckFailure();
				}
				executeAction("UPDATE_ACTIVITY_DATE");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("UPDATE_USER_ID");
				getTask().getGoqrpls().gCheckFailure();
				if ( gxrdirdElement.getGxrdirdHrInd().equals("A") )
				{
					executeAction("CHECK_DIRD2");
					getTask().getGoqrpls().gCheckFailure();
				}
				executeAction("CHK_ACCT_TYPE");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("CHECK_PRIORITY");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("CHECK_ACTIVE");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("CHECK_IAT_REQ_PROPERTIES");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GXRDIRD.GET_PRIORITY
		 -- 5301-2 correct defect 38845
DECLARE
  MAX_PRIORITY NUMBER(3);
  CURSOR GET_MAX is
   SELECT MAX(GXRDIRD_PRIORITY) FROM GXRDIRD
   WHERE GXRDIRD_PIDM=:GXRDIRD_PIDM;
  
BEGIN
  OPEN GET_MAX;
  FETCH GET_MAX INTO MAX_PRIORITY;
  IF MAX_PRIORITY IS NULL THEN
    MAX_PRIORITY:=0;
  END IF;
-- 5301-2 modify following IF
--  IF :GXRDIRD_AP_IND='Y' AND :GXRDIRD_HR_IND<>'Y' THEN 
  IF :GXRDIRD_AP_IND='A' AND :GXRDIRD_HR_IND<>'A' THEN
     :GXRDIRD_PRIORITY:=0;
  ELSE
  	-- 5301-2 add following IF
  	IF  MAX_PRIORITY = 99 THEN
  		  MESSAGE( G$_NLS.Get('GXADIRD-0019', 'FORM','*ERROR* Priority exceeds maximum valid value.') );
  		  RAISE FORM_TRIGGER_FAILURE;
  	END IF;
  :GXRDIRD_PRIORITY:=NVL(MAX_PRIORITY,0)+1;
  	END IF;
  	
END ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD.GET_PRIORITY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="GET_PRIORITY")
		public void gxrdird_GetPriority()
		{
				GxrdirdAdapter gxrdirdElement = (GxrdirdAdapter)this.getFormModel().getGxrdird().getRowAdapter(true);
				if(gxrdirdElement ==null)
					return;


				int rowCount = 0;
				{
					NNumber maxPriority= NNumber.getNull();
					String sqlgetMax = "SELECT MAX(GXRDIRD_PRIORITY) " +
	" FROM GXRDIRD " +
	" WHERE GXRDIRD_PIDM = :GXRDIRD_PIDM ";
					DataCursor getMax = new DataCursor(sqlgetMax);
					try {
						getMax.addParameter("GXRDIRD_PIDM", gxrdirdElement.getGxrdirdPidm());
						getMax.open();
						ResultSet getMaxResults = getMax.fetchInto();
						if ( getMaxResults != null ) {
							maxPriority = getMaxResults.getNumber(0);
						}
						if ( maxPriority.isNull() )
						{
							maxPriority = toNumber(0);
						}
						if ( gxrdirdElement.getGxrdirdApInd().equals("A") && gxrdirdElement.getGxrdirdHrInd().notEquals("A") )
						{
							gxrdirdElement.setGxrdirdPriority(toNumber(0));
						}
						else {
							if ( maxPriority.equals(99) )
							{
								errorMessage(GNls.Fget(toStr("GXADIRD-0019"), toStr("FORM"), toStr("*ERROR* Priority exceeds maximum valid value.")));
								throw new ApplicationException();
							}
							gxrdirdElement.setGxrdirdPriority(toNumber(isNull(maxPriority, 0).add(1)));
						}
					}
					finally{
						getMax.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GXRDIRD.POST-INSERT
		    EXECUTE_TRIGGER( 'CHECK_BANK_CODE' ) ;
   G$_CHECK_FAILURE ;
   EXECUTE_TRIGGER('GET_ROWID');
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD.POST-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterRowInsert
		public void gxrdird_AfterRowInsert(RowAdapterEvent args)
		{
			
				executeAction("CHECK_BANK_CODE");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("GET_ROWID");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GXRDIRD.PRE-UPDATE
		 p_check_addr_info;

-- 5301-2 add execute of 'GET_PRIORITY'
IF  :GXRDIRD_PRIORITY IS NULL THEN
	  EXECUTE_TRIGGER('GET_PRIORITY');
END IF;
   IF (:GXRDIRD_BANK_ROUT_NUM IS NULL) THEN
      :GXRDIRD_DOC_TYPE := 'C' ;
      :GXRDIRD_ACCT_TYPE := '' ;
      GOTO TRIGGER_EXIT ;
   END IF ;
--
   IF (:GXRDIRD_BANK_ROUT_NUM IS NOT NULL) THEN
      :GXRDIRD_DOC_TYPE := 'D' ;
   END IF ;
--
   << TRIGGER_EXIT >>
-- 5301-2 change following 'IF'
--  IF :HOLD_SECURITY<>'Y' THEN
  IF :GXRDIRD_AP_IND = 'A' THEN
     EXECUTE_TRIGGER('CHECK_AP2');
     G$_CHECK_FAILURE ;
  END IF;
-- 5301-2
  IF  :GXRDIRD_HR_IND = 'A' THEN
   EXECUTE_TRIGGER( 'CHECK_DIRD2' ) ;
   G$_CHECK_FAILURE ;
  END IF;
--
   EXECUTE_TRIGGER( 'UPDATE_ACTIVITY_DATE' ) ;
   G$_CHECK_FAILURE ;
   EXECUTE_TRIGGER( 'UPDATE_USER_ID' ) ;
   G$_CHECK_FAILURE ;
--
-- 5301-2 
  IF  :GXRDIRD_HR_IND = 'A' THEN 
   EXECUTE_TRIGGER( 'CHECK_DIRD2' ) ;
   G$_CHECK_FAILURE ;
  END IF;
--
   EXECUTE_TRIGGER( 'CHK_ACCT_TYPE' ) ;
   G$_CHECK_FAILURE ;
   EXECUTE_TRIGGER( 'CHECK_PRIORITY2' ) ;
   G$_CHECK_FAILURE ;
   EXECUTE_TRIGGER( 'CHECK_ACTIVE' );
   G$_CHECK_FAILURE;     
   EXECUTE_TRIGGER('CHECK_IAT_REQ_PROPERTIES');
   G$_CHECK_FAILURE;  
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD.PRE-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowUpdate
		public void gxrdird_BeforeRowUpdate(RowAdapterEvent args)
		{
			
				GxrdirdAdapter gxrdirdElement = (GxrdirdAdapter)args.getRow();


				this.getTask().getServices().pCheckAddrInfo(gxrdirdElement);
				if ( gxrdirdElement.getGxrdirdPriority().isNull() )
				{
					executeAction("GET_PRIORITY");
				}
				if ((gxrdirdElement.getGxrdirdBankRoutNum().isNull()))
				{
					gxrdirdElement.setGxrdirdDocType(toStr("C"));
					gxrdirdElement.setGxrdirdAcctType(toStr(""));
				}
				else{
					if ((!gxrdirdElement.getGxrdirdBankRoutNum().isNull()))
					{
						gxrdirdElement.setGxrdirdDocType(toStr("D"));
					}
				}
				if ( gxrdirdElement.getGxrdirdApInd().equals("A") )
				{
					executeAction("CHECK_AP2");
					getTask().getGoqrpls().gCheckFailure();
				}
				if ( gxrdirdElement.getGxrdirdHrInd().equals("A") )
				{
					executeAction("CHECK_DIRD2");
					getTask().getGoqrpls().gCheckFailure();
				}
				executeAction("UPDATE_ACTIVITY_DATE");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("UPDATE_USER_ID");
				getTask().getGoqrpls().gCheckFailure();
				if ( gxrdirdElement.getGxrdirdHrInd().equals("A") )
				{
					executeAction("CHECK_DIRD2");
					getTask().getGoqrpls().gCheckFailure();
				}
				executeAction("CHK_ACCT_TYPE");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("CHECK_PRIORITY2");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("CHECK_ACTIVE");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("CHECK_IAT_REQ_PROPERTIES");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GXRDIRD.POST-UPDATE
		    EXECUTE_TRIGGER( 'CHECK_BANK_CODE' ) ;
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD.POST-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterRowUpdate
		public void gxrdird_AfterRowUpdate(RowAdapterEvent args)
		{
			
				executeAction("CHECK_BANK_CODE");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GXRDIRD.CHECK_ACCT_TYPE2
		    IF :GXRDIRD_BANK_ROUT_NUM IS NULL THEN
      IF :GXRDIRD_ACCT_TYPE IS NOT NULL THEN
         EXECUTE_TRIGGER( 'ERROR1_MSG' ) ;
         G$_CHECK_FAILURE ;
      END IF ;
   ELSE
      IF :GXRDIRD_ACCT_TYPE IS NULL THEN
         IF G$_NCHK(G$_NCHK(:GLOBAL.LOCATION_IND <> 'C')) THEN
            EXECUTE_TRIGGER( 'ERROR1_MSG' ) ;
            G$_CHECK_FAILURE ;
         END IF ;
      END IF ;
   END IF ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD.CHECK_ACCT_TYPE2
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="CHECK_ACCT_TYPE2")
		public void gxrdird_CheckAcctType2()
		{
				GxrdirdAdapter gxrdirdElement = (GxrdirdAdapter)this.getFormModel().getGxrdird().getRowAdapter(true);
				if(gxrdirdElement ==null)
					return;
				if ( gxrdirdElement.getGxrdirdBankRoutNum().isNull() )
				{
					if ( !gxrdirdElement.getGxrdirdAcctType().isNull() )
					{
						executeAction("ERROR1_MSG");
						getTask().getGoqrpls().gCheckFailure();
					}
				}
				else {
					if ( gxrdirdElement.getGxrdirdAcctType().isNull() )
					{
						if ( getTask().getGoqrpls().gNchk( getTask().getGoqrpls().gNchk(toBool(getGlobal("LOCATION_IND").notEquals("C")))).getValue()  )
						{
							executeAction("ERROR1_MSG");
							getTask().getGoqrpls().gCheckFailure();
						}
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GXRDIRD.CHECK_BANK_CODE
		    IF :GXRDIRD_BANK_ROUT_NUM IS NULL THEN
      IF :GXRDIRD_BANK_ACCT_Num IS NOT NULL THEN
         EXECUTE_TRIGGER( 'ERROR_MSG1' ) ;
         G$_CHECK_FAILURE ;
      END IF ;
   ELSE
      IF :GXRDIRD_BANK_ACCT_NUM IS NULL THEN
         EXECUTE_TRIGGER( 'ERROR_MSG' ) ;
         G$_CHECK_FAILURE ;
      END IF ;
   END IF ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD.CHECK_BANK_CODE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="CHECK_BANK_CODE")
		public void gxrdird_CheckBankCode()
		{
				GxrdirdAdapter gxrdirdElement = (GxrdirdAdapter)this.getFormModel().getGxrdird().getRowAdapter(true);
				if(gxrdirdElement ==null)
					return;
				if ( gxrdirdElement.getGxrdirdBankRoutNum().isNull() )
				{
					if ( !gxrdirdElement.getGxrdirdBankAcctNum().isNull() )
					{
						executeAction("ERROR_MSG1");
						getTask().getGoqrpls().gCheckFailure();
					}
				}
				else {
					if ( gxrdirdElement.getGxrdirdBankAcctNum().isNull() )
					{
						executeAction("ERROR_MSG");
						getTask().getGoqrpls().gCheckFailure();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GXRDIRD.CHECK_DIRD
		    IF :GXRDIRD_AMOUNT IS NULL THEN
      IF :GXRDIRD_PERCENT IS NULL THEN
         MESSAGE (
 G$_NLS.Get('GXADIRD-0020', 'FORM','*ERROR* A direct deposit percentage or amount must be entered.')  ) ;
         RAISE FORM_TRIGGER_FAILURE ;
      ELSE
         RETURN ;
      END IF ;
   ELSE
      IF :GXRDIRD_PERCENT IS NULL THEN
         RETURN ;
      ELSE
         MESSAGE (
             G$_NLS.Get('GXADIRD-0021', 'FORM','*ERROR* Enter either amount or percent, not both.') 
            ) ;
         RAISE FORM_TRIGGER_FAILURE ;
      END IF ;
   END IF ;
      
   IF NVL(:GXRDIRD_AMOUNT,0)  = 0 AND
      NVL(:GXRDIRD_PERCENT,0) = 0 AND
      :GXRDIRD_STATUS IN ('A', 'P') THEN
         MESSAGE ( G$_NLS.Get('GXADIRD-0022', 'FORM','*ERROR* A non-zero direct deposit percentage or amount must be entered.')  ) ;
         RAISE FORM_TRIGGER_FAILURE ;
   END IF;

   IF (NVL(:GXRDIRD_AMOUNT,0)  < 0 OR NVL(:GXRDIRD_PERCENT,0) < 0) AND
      (:GXRDIRD_STATUS IN ('A', 'P')) THEN
         MESSAGE ( G$_NLS.Get('GXADIRD-0023', 'FORM','*ERROR* The direct deposit percentage or amount entered must be greater than zero.')  ) ;
         RAISE FORM_TRIGGER_FAILURE ;
   END IF;
      
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD.CHECK_DIRD
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="CHECK_DIRD")
		public void gxrdird_CheckDird()
		{
				GxrdirdAdapter gxrdirdElement = (GxrdirdAdapter)this.getFormModel().getGxrdird().getRowAdapter(true);
				if(gxrdirdElement ==null)
					return;
				if ( gxrdirdElement.getGxrdirdAmount().isNull() )
				{
					if ( gxrdirdElement.getGxrdirdPercent().isNull() )
					{
						errorMessage(GNls.Fget(toStr("GXADIRD-0020"), toStr("FORM"), toStr("*ERROR* A direct deposit percentage or amount must be entered.")));
						throw new ApplicationException();
					}
					else {
						return ;
					}
				}
				else {
					if ( gxrdirdElement.getGxrdirdPercent().isNull() )
					{
						return ;
					}
					else {
						errorMessage(GNls.Fget(toStr("GXADIRD-0021"), toStr("FORM"), toStr("*ERROR* Enter either amount or percent, not both.")));
						throw new ApplicationException();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GXRDIRD.KEY-NEXT-ITEM
		 next_item;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", function=KeyFunction.NEXT_ITEM)
		public void gxrdird_keyNexItem()
		{
			
				nextItem();
			}

		
		/* Original PL/SQL code code for TRIGGER GXRDIRD.CHECK_DIRD2
		    IF :GXRDIRD_AMOUNT IS NULL THEN
      IF :GXRDIRD_PERCENT IS NULL THEN
         :GXRDIRD_PERCENT := '100' ;
      END IF ;
   ELSE
      IF :GXRDIRD_PERCENT IS NOT NULL THEN
         MESSAGE (
             G$_NLS.Get('GXADIRD-0024', 'FORM','*ERROR* Enter either Amount or percent, not both.') 
            ) ;
         RAISE FORM_TRIGGER_FAILURE ;
      END IF ;
   END IF ;
      
   IF NVL(:GXRDIRD_AMOUNT,0)  = 0 AND
      NVL(:GXRDIRD_PERCENT,0) = 0 AND
      :GXRDIRD_STATUS IN ('A', 'P') THEN
         MESSAGE ( G$_NLS.Get('GXADIRD-0025', 'FORM','*ERROR* A non-zero direct deposit percentage or amount must be entered.')  ) ;
         RAISE FORM_TRIGGER_FAILURE ;
   END IF;

   IF (NVL(:GXRDIRD_AMOUNT,0)  < 0 OR NVL(:GXRDIRD_PERCENT,0) < 0) AND
      (:GXRDIRD_STATUS IN ('A', 'P')) THEN
         MESSAGE ( G$_NLS.Get('GXADIRD-0026', 'FORM','*ERROR* The direct deposit percentage or amount entered must be greater than zero.')  ) ;
         RAISE FORM_TRIGGER_FAILURE ;
   END IF;
      
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD.CHECK_DIRD2
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="CHECK_DIRD2")
		public void gxrdird_CheckDird2()
		{
				GxrdirdAdapter gxrdirdElement = (GxrdirdAdapter)this.getFormModel().getGxrdird().getRowAdapter(true);
				if(gxrdirdElement ==null)
					return;
				if ( gxrdirdElement.getGxrdirdAmount().isNull() )
				{
					if ( gxrdirdElement.getGxrdirdPercent().isNull() )
					{
						gxrdirdElement.setGxrdirdPercent(toNumber("100"));
					}
				}
				else {
					if ( !gxrdirdElement.getGxrdirdPercent().isNull() )
					{
						errorMessage(GNls.Fget(toStr("GXADIRD-0024"), toStr("FORM"), toStr("*ERROR* Enter either Amount or percent, not both.")));
						throw new ApplicationException();
					}
				}
				if ( isNull(gxrdirdElement.getGxrdirdAmount(), 0).equals(0) && isNull(gxrdirdElement.getGxrdirdPercent(), 0).equals(0) && in(gxrdirdElement.getGxrdirdStatus(), "A", "P").getValue() )
				{
					errorMessage(GNls.Fget(toStr("GXADIRD-0025"), toStr("FORM"), toStr("*ERROR* A non-zero direct deposit percentage or amount must be entered.")));
					throw new ApplicationException();
				}
				if ( (isNull(gxrdirdElement.getGxrdirdAmount(), 0).lesser(0) || isNull(gxrdirdElement.getGxrdirdPercent(), 0).lesser(0)) && (in(gxrdirdElement.getGxrdirdStatus(), "A", "P").getValue()) )
				{
					errorMessage(GNls.Fget(toStr("GXADIRD-0026"), toStr("FORM"), toStr("*ERROR* The direct deposit percentage or amount entered must be greater than zero.")));
					throw new ApplicationException();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GXRDIRD.CHK_ACCT_TYPE
		    IF :GXRDIRD_ACCT_TYPE = 'C' THEN
      RETURN ;
   ELSIF :GXRDIRD_ACCT_TYPE = 'S' THEN
      RETURN ;
   ELSIF :GXRDIRD_ACCT_TYPE IS NULL THEN
      IF :GXRDIRD_DOC_TYPE = 'C' THEN
         RETURN ;
      ELSE
         IF :GLOBAL.LOCATION_IND = 'C' THEN
            RETURN ;
         ELSE
            MESSAGE (
 G$_NLS.Get('GXADIRD-0027', 'FORM','*ERROR*  Account Type must be entered for a direct deposit.')  ) ;
            RAISE FORM_TRIGGER_FAILURE ;
         END IF ;
      END IF ;
   ELSE
      MESSAGE (
 G$_NLS.Get('GXADIRD-0028', 'FORM','*ERROR*  Account Type; valid values (C)hecking, (S)avings.')  ) ;
      RAISE FORM_TRIGGER_FAILURE ;
   END IF ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD.CHK_ACCT_TYPE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="CHK_ACCT_TYPE")
		public void gxrdird_ChkAcctType()
		{
				GxrdirdAdapter gxrdirdElement = (GxrdirdAdapter)this.getFormModel().getGxrdird().getRowAdapter(true);
				if(gxrdirdElement ==null)
					return;
				if ( gxrdirdElement.getGxrdirdAcctType().equals("C") )
				{
					return ;
				}
				else if ( gxrdirdElement.getGxrdirdAcctType().equals("S") ) {
					return ;
				}
				else if ( gxrdirdElement.getGxrdirdAcctType().isNull() ) {
					if ( gxrdirdElement.getGxrdirdDocType().equals("C") )
					{
						return ;
					}
					else {
						if ( getGlobal("LOCATION_IND").equals("C") )
						{
							return ;
						}
						else {
							errorMessage(GNls.Fget(toStr("GXADIRD-0027"), toStr("FORM"), toStr("*ERROR*  Account Type must be entered for a direct deposit.")));
							throw new ApplicationException();
						}
					}
				}
				else {
					errorMessage(GNls.Fget(toStr("GXADIRD-0028"), toStr("FORM"), toStr("*ERROR*  Account Type; valid values (C)hecking, (S)avings.")));
					throw new ApplicationException();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GXRDIRD.ERROR1_MSG
		    MESSAGE(
 G$_NLS.Get('GXADIRD-0029', 'FORM','*ERROR* Account Type must be entered for a direct deposit.')  ) ;
   RAISE FORM_TRIGGER_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD.ERROR1_MSG
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="ERROR1_MSG")
		public void gxrdird_Error1Msg()
		{
				errorMessage(GNls.Fget(toStr("GXADIRD-0029"), toStr("FORM"), toStr("*ERROR* Account Type must be entered for a direct deposit.")));
				throw new ApplicationException();
			}

		
		/* Original PL/SQL code code for TRIGGER GXRDIRD.ERROR_MSG
		    MESSAGE(
 G$_NLS.Get('GXADIRD-0030', 'FORM','*ERROR* Account Number is required when Bank Code entered.')  ) ;
   RAISE FORM_TRIGGER_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD.ERROR_MSG
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="ERROR_MSG")
		public void gxrdird_ErrorMsg()
		{
				errorMessage(GNls.Fget(toStr("GXADIRD-0030"), toStr("FORM"), toStr("*ERROR* Account Number is required when Bank Code entered.")));
				throw new ApplicationException();
			}

		
		/* Original PL/SQL code code for TRIGGER GXRDIRD.ERROR_MSG1
		    MESSAGE(
 G$_NLS.Get('GXADIRD-0031', 'FORM','*ERROR* Bank Code is required when Account Number entered.')  ) ;
   RAISE FORM_TRIGGER_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD.ERROR_MSG1
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="ERROR_MSG1")
		public void gxrdird_ErrorMsg1()
		{
			
				errorMessage(GNls.Fget(toStr("GXADIRD-0031"), toStr("FORM"), toStr("*ERROR* Bank Code is required when Account Number entered.")));
				throw new ApplicationException();
			}

		
		/* Original PL/SQL code code for TRIGGER GXRDIRD.KEY-NXTBLK
		 <multilinecomment>   GO_BLOCK( 'PERPADV' );
   EXECUTE_QUERY;
</multilinecomment>
NULL;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void gxrdird_NextBlock()
		{
			}

		
		/* Original PL/SQL code code for TRIGGER GXRDIRD.PRE-BLOCK
		 IF GET_ITEM_PROPERTY('GXRDIRD_STATUS',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('GXRDIRD_STATUS',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('GXRDIRD_STATUS',NAVIGABLE,PROPERTY_ON);
   SET_ITEM_PROPERTY('GXRDIRD_STATUS',UPDATEABLE,PROPERTY_ON);
   SET_ITEM_PROPERTY('GXRDIRD_STATUS',REQUIRED,PROPERTY_ON);
END IF;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD.PRE-BLOCK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="PRE-BLOCK", function=KeyFunction.BLOCK_IN)
		public void gxrdird_blockIn()
		{
				if ( getItemEnabled("GXRDIRD_STATUS").equals("FALSE") )
				{
					setItemEnabled("GXRDIRD_STATUS", true);
					setItemNavigable("GXRDIRD_STATUS", true);
					setItemUpdateAllowed("GXRDIRD_STATUS", true);
					setItemRequired("GXRDIRD_STATUS", true);
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GXRDIRD.CHECK_DATA_ENTRY
		 -- 5301-2 added trigger, called from Pre-Insert and Pre-Update
IF  :GXRDIRD_HR_IND = 'I' 
AND  :GXRDIRD_AP_IND = 'I' THEN
    MESSAGE( G$_NLS.Get('GXADIRD-0032', 'FORM','*ERROR* Transaction must be set as "AP" or "Payroll".') );
    RAISE FORM_TRIGGER_FAILURE;
END IF;
--
IF  :GXRDIRD_AP_IND = 'A' THEN
	    IF  :GXRDIRD_ATYP_CODE IS NULL THEN
	    	  MESSAGE( G$_NLS.Get('GXADIRD-0033', 'FORM','*ERROR* Vendor Address Type must be entered for "AP" transaction') );
	    	  RAISE FORM_TRIGGER_FAILURE;
	    END IF;
	    --
	    IF  :GXRDIRD_ADDR_SEQNO IS NULL THEN
	    	  MESSAGE( G$_NLS.Get('GXADIRD-0034', 'FORM','*ERROR* Address Sequence Number must be entered for "AP" transaction.') );
	    	  RAISE FORM_TRIGGER_FAILURE;
	    END IF;
END IF;
--
IF  :GXRDIRD_HR_IND = 'A' THEN
	EXECUTE_TRIGGER('CHECK_DIRD');
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD.CHECK_DATA_ENTRY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="CHECK_DATA_ENTRY")
		public void gxrdird_CheckDataEntry()
		{
				GxrdirdAdapter gxrdirdElement = (GxrdirdAdapter)this.getFormModel().getGxrdird().getRowAdapter(true);
				if(gxrdirdElement ==null)
					return;
				if ( gxrdirdElement.getGxrdirdHrInd().equals("I") && gxrdirdElement.getGxrdirdApInd().equals("I") )
				{
					errorMessage(GNls.Fget(toStr("GXADIRD-0032"), toStr("FORM"), toStr("*ERROR* Transaction must be set as \"AP\" or \"Payroll\".")));
					throw new ApplicationException();
				}
				if ( gxrdirdElement.getGxrdirdApInd().equals("A") )
				{
					if ( gxrdirdElement.getGxrdirdAtypCode().isNull() )
					{
						errorMessage(GNls.Fget(toStr("GXADIRD-0033"), toStr("FORM"), toStr("*ERROR* Vendor Address Type must be entered for \"AP\" transaction")));
						throw new ApplicationException();
					}
					if ( gxrdirdElement.getGxrdirdAddrSeqno().isNull() )
					{
						errorMessage(GNls.Fget(toStr("GXADIRD-0034"), toStr("FORM"), toStr("*ERROR* Address Sequence Number must be entered for \"AP\" transaction.")));
						throw new ApplicationException();
					}
				}
				if ( gxrdirdElement.getGxrdirdHrInd().equals("A") )
				{
					executeAction("CHECK_DIRD");
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GXRDIRD.CHECK_ACTIVE
		 -- Defect 1-1OSTUJ 
IF (:GXRDIRD_HR_IND = 'I' AND :GXRDIRD_AP_IND = 'I') AND
	 (:GXRDIRD_STATUS <> 'I') THEN
	    MESSAGE( G$_NLS.Get('GXADIRD-0035', 'FORM',
	                        '*WARNING* If the status is active, either the "Accounts Payable" or "Payroll" indicator should be checked.'),
	             ACKNOWLEDGE );
	    SYNCHRONIZE;
END IF;	   
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD.CHECK_ACTIVE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="CHECK_ACTIVE")
		public void gxrdird_CheckActive()
		{
				GxrdirdAdapter gxrdirdElement = (GxrdirdAdapter)this.getFormModel().getGxrdird().getRowAdapter(true);
				if(gxrdirdElement ==null)
					return;
				if ( (gxrdirdElement.getGxrdirdHrInd().equals("I") && gxrdirdElement.getGxrdirdApInd().equals("I")) && (gxrdirdElement.getGxrdirdStatus().notEquals("I")) )
				{
					warningMessage(GNls.Fget(toStr("GXADIRD-0035"), toStr("FORM"), toStr("*WARNING* If the status is active, either the \"Accounts Payable\" or \"Payroll\" indicator should be checked.")), OutputMessageUserResponse.ACKNOWLEDGE);
					 this.getTask().getNavigationModel().doFullNavigation();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GXRDIRD.WHEN-NEW-RECORD-INSTANCE
		 -- 741-1
G$_SD.p_when_new_rec_inst;
IF (:GXRDIRD_ATYP_CODE IS NULL) THEN
	
 	
 	SET_ITEM_INSTANCE_PROPERTY('GXRDIRD_ADDR_SEQNO', CURRENT_RECORD,NAVIGABLE, PROPERTY_FALSE);
 	SET_ITEM_INSTANCE_PROPERTY('GXRDIRD_ADDR_SEQNO', CURRENT_RECORD,UPDATE_ALLOWED, PROPERTY_FALSE);
  
ELSE
  SET_ITEM_INSTANCE_PROPERTY('GXRDIRD_ADDR_SEQNO', CURRENT_RECORD,NAVIGABLE, PROPERTY_TRUE);
 	SET_ITEM_INSTANCE_PROPERTY('GXRDIRD_ADDR_SEQNO', CURRENT_RECORD,UPDATE_ALLOWED, PROPERTY_TRUE);
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD.WHEN-NEW-RECORD-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-RECORD-INSTANCE", function=KeyFunction.RECORD_CHANGE)
		public void gxrdird_recordChange()
		{
				GxrdirdAdapter gxrdirdElement = (GxrdirdAdapter)this.getFormModel().getGxrdird().getRowAdapter(true);
				if(gxrdirdElement ==null)
					return;
				getTask().getGoqrpls().getGSd().pWhenNewRecInst();
				if ((gxrdirdElement.getGxrdirdAtypCode().isNull()))
				{
					setItemEnabled("GXRDIRD_ADDR_SEQNO", ItemServices.CURRENT_RECORD, false);
					setItemUpdateAllowed("GXRDIRD_ADDR_SEQNO", ItemServices.CURRENT_RECORD, false);
				}
				else {
					setItemEnabled("GXRDIRD_ADDR_SEQNO", ItemServices.CURRENT_RECORD, true);
					setItemUpdateAllowed("GXRDIRD_ADDR_SEQNO", ItemServices.CURRENT_RECORD, true);
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GXRDIRD.CHECK_INACTIVE_ADDRESS
		 DECLARE
	HOLD_VALUE VARCHAR2(1) := 'N';
 	CURSOR CHK_ADDR_SEQNO IS
    SELECT 'Y' FROM SPRADDR
     WHERE SPRADDR_PIDM=:PIDM
       AND (SPRADDR_ATYP_CODE=:GXRDIRD_ATYP_CODE_IAT
        OR :GXRDIRD_ATYP_CODE_IAT IS NULL)
       AND (SPRADDR_SEQNO = :GXRDIRD_ADDR_SEQNO_IAT OR :GXRDIRD_ADDR_SEQNO_IAT IS NULL)
       AND SPRADDR_STATUS_IND IS NULL
       AND TRUNC(SYSDATE) BETWEEN TRUNC(NVL(SPRADDR_FROM_DATE,SYSDATE)) AND TRUNC(NVL(SPRADDR_TO_DATE,SYSDATE));
BEGIN
	IF :GXRDIRD_HR_IND ='A' THEN
		OPEN CHK_ADDR_SEQNO;
		FETCH CHK_ADDR_SEQNO INTO HOLD_VALUE;
		CLOSE CHK_ADDR_SEQNO;
		IF HOLD_VALUE = 'N' THEN
			message(G$_NLS.Get('GXADIRD-0036','FORM','*WARNING* The address selected may not be the address actually used as the IAT Override with payroll processing if a newer address exists.'));
		END IF;
	END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD.CHECK_INACTIVE_ADDRESS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="CHECK_INACTIVE_ADDRESS")
		public void gxrdird_CheckInactiveAddress()
		{
				GxrdirdAdapter gxrdirdElement = (GxrdirdAdapter)this.getFormModel().getGxrdird().getRowAdapter(true);
				if(gxrdirdElement ==null)
					return;
				int rowCount = 0;
				{
					NString holdValue = toStr("N");
					String sqlchkAddrSeqno = "SELECT 'Y' " +
	" FROM SPRADDR " +
	" WHERE SPRADDR_PIDM = :PIDM AND (SPRADDR_ATYP_CODE = :GXRDIRD_ATYP_CODE_IAT OR :GXRDIRD_ATYP_CODE_IAT IS NULL) AND (SPRADDR_SEQNO = :GXRDIRD_ADDR_SEQNO_IAT OR :GXRDIRD_ADDR_SEQNO_IAT IS NULL) AND SPRADDR_STATUS_IND IS NULL AND TRUNC(SYSDATE) BETWEEN TRUNC(NVL(SPRADDR_FROM_DATE, SYSDATE)) AND TRUNC(NVL(SPRADDR_TO_DATE, SYSDATE)) ";
					DataCursor chkAddrSeqno = new DataCursor(sqlchkAddrSeqno);
					try {
						if ( gxrdirdElement.getGxrdirdHrInd().equals("A") )
						{
							chkAddrSeqno.addParameter("PIDM", getFormModel().getKeyBlock().getPidm());
							chkAddrSeqno.addParameter("GXRDIRD_ATYP_CODE_IAT", gxrdirdElement.getGxrdirdAtypCodeIat());
							chkAddrSeqno.addParameter("GXRDIRD_ADDR_SEQNO_IAT", gxrdirdElement.getGxrdirdAddrSeqnoIat());
							chkAddrSeqno.open();
							ResultSet chkAddrSeqnoResults = chkAddrSeqno.fetchInto();
							if ( chkAddrSeqnoResults != null ) {
								holdValue = chkAddrSeqnoResults.getStr(0);
							}
							if ( holdValue.equals("N") )
							{
								warningMessage(GNls.Fget(toStr("GXADIRD-0036"), toStr("FORM"), toStr("*WARNING* The address selected may not be the address actually used as the IAT Override with payroll processing if a newer address exists.")));
							}
						}
					}
					finally{
						chkAddrSeqno.close();
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD_BANK_ROUT_NUM.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="GXRDIRD_BANK_ROUT_NUM")
		public void gxrdirdBankRoutNum_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD_BANK_ROUT_NUM.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="GXRDIRD_BANK_ROUT_NUM", function=KeyFunction.ITEM_CHANGE)
		public void gxrdirdBankRoutNum_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD_BANK_ROUT_NUM.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="GXRDIRD_BANK_ROUT_NUM")
		public void gxrdirdBankRoutNum_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD_BANK_ROUT_NUM.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="GXRDIRD_BANK_ROUT_NUM", function=KeyFunction.NEXT_ITEM)
		public void gxrdirdBankRoutNum_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD_BANK_ROUT_NUM.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="GXRDIRD_BANK_ROUT_NUM", function=KeyFunction.ITEM_OUT)
		public void gxrdirdBankRoutNum_itemOut()
		{
			
				getGCodeClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER GXRDIRD_BANK_ROUT_NUM.PRE-TEXT-ITEM
		 -- 5301-1
--CLEAR_MESSAGE;
null;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD_BANK_ROUT_NUM.PRE-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="PRE-TEXT-ITEM", item="GXRDIRD_BANK_ROUT_NUM", function=KeyFunction.ITEM_IN)
		public void gxrdirdBankRoutNum_itemIn()
		{
			}

		
		/* Original PL/SQL code code for TRIGGER GXRDIRD_BANK_ROUT_NUM.G$_SEARCH_PARAMETERS
		 G$_SEARCH.PARAMETERS('GXVDIRD_CODE_BANK_ROUT_NUM','GXVDIRD_DESC','');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD_BANK_ROUT_NUM.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item = "GXRDIRD_BANK_ROUT_NUM")
		public void gxrdirdBankRoutNum_GSearchParameters()
		{
			
				getTask().getGoqrpls().getGSearch().parameters(toStr("GXVDIRD_CODE_BANK_ROUT_NUM"), toStr("GXVDIRD_DESC"), toStr(""));
			}

		
		/* Original PL/SQL code code for TRIGGER GXRDIRD_BANK_ROUT_NUM.KEY-LISTVAL
		 G$_COPY_FLD_ATTR;
EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
G$_CHECK_FAILURE;
G$_SECURED_FORM_CALL (:GLOBAL.CURRENT_USER,'GXVDIRD','QUERY');
G$_RESET_GLOBAL;
--
   IF :GLOBAL.VALUE IS NOT NULL THEN
      EXECUTE_TRIGGER( 'LIST_VALUES_COPY' ) ;
      G$_CHECK_FAILURE ;
      NEXT_FIELD ;
   END IF ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD_BANK_ROUT_NUM.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="GXRDIRD_BANK_ROUT_NUM", function=KeyFunction.LIST_VALUES)
		public void gxrdirdBankRoutNum_ListValues()
		{
			
				getTask().getGoqrpls().gCopyFldAttr();
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("GXVDIRD"), toStr("QUERY"));
				getTask().getGoqrpls().gResetGlobal();
				if ( !getGlobal("VALUE").isNull() )
				{
					executeAction("LIST_VALUES_COPY");
					getTask().getGoqrpls().gCheckFailure();
					nextItem();
					this.gxrdirdBankRoutNum_validate();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GXRDIRD_BANK_ROUT_NUM.POST-CHANGE
		 DECLARE
	lv_status VARCHAR2(01);
BEGIN
   
   G$_CHECK_QUERY_MODE ;
   
   DECLARE
      CURSOR PTI_CURSOR IS
         SELECT GXVDIRD_DESC
         FROM   GXVDIRD
         WHERE  GXVDIRD_CODE_BANK_ROUT_NUM = :GXRDIRD_BANK_ROUT_NUM ;
   BEGIN
      OPEN PTI_CURSOR ;
      
      FETCH PTI_CURSOR INTO :BANK_DESC ;
      IF PTI_CURSOR%FOUND THEN
         
         GOTO PTI_END_TRIGGER ;
      END IF ;
   END ;
--
   EXECUTE_TRIGGER( 'INVALID_CODE_MSG' ) ;
   G$_CHECK_FAILURE ;
--
   lv_status := goksels.f_validate_bank_rout_num(:GXRDIRD_BANK_ROUT_NUM);
   IF lv_status = 'N' THEN
   	 MESSAGE(G$_NLS.Get('GXADIRD-0037', 'FORM','*ERROR* Bank Routing failed validation.')  ) ;
     RAISE FORM_TRIGGER_FAILURE ;
   ELSIF lv_status = 'W' THEN
   	 MESSAGE(G$_NLS.Get('GXADIRD-0038', 'FORM','*WARNING* Bank Routing accepted but failed validation. Please verify.')  ) ;
   END IF;
--
   << PTI_END_TRIGGER >>
   
   :GLOBAL.QUERY_MODE := '0' ;
   
EXCEPTION
   WHEN FORM_TRIGGER_FAILURE THEN
      :GLOBAL.QUERY_MODE := '0' ;
      
      RAISE FORM_TRIGGER_FAILURE ;
END ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD_BANK_ROUT_NUM.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="GXRDIRD_BANK_ROUT_NUM")
		public void gxrdirdBankRoutNum_PostChange()
		{
				GxrdirdAdapter gxrdirdElement = (GxrdirdAdapter)this.getFormModel().getGxrdird().getRowAdapter(true);
				if(gxrdirdElement ==null)
					return;


				int rowCount = 0;
				if(gxrdirdElement.getGxrdirdBankRoutNum().isNull())
		return;
				{
					NString lvStatus= NString.getNull();
					try
					{
						getTask().getGoqrpls().gCheckQueryMode();
						{
							String sqlptiCursor = "SELECT GXVDIRD_DESC " +
	" FROM GXVDIRD " +
	" WHERE GXVDIRD_CODE_BANK_ROUT_NUM = :GXRDIRD_BANK_ROUT_NUM ";
							DataCursor ptiCursor = new DataCursor(sqlptiCursor);
							try {
								ptiCursor.addParameter("GXRDIRD_BANK_ROUT_NUM", gxrdirdElement.getGxrdirdBankRoutNum());
								ptiCursor.open();
								ResultSet ptiCursorResults = ptiCursor.fetchInto();
								if ( ptiCursorResults != null ) {
									gxrdirdElement.setBankDesc(ptiCursorResults.getStr(0));
								}
								if ( ptiCursor.found() )
								{
									setGlobal("QUERY_MODE", toStr("0"));
									return;
								}
							}
							finally{
								ptiCursor.close();
							}
						}
						executeAction("INVALID_CODE_MSG");
						getTask().getGoqrpls().gCheckFailure();
						lvStatus = Goksels.fValidateBankRoutNum(gxrdirdElement.getGxrdirdBankRoutNum());
						if ( lvStatus.equals("N") )
						{
							errorMessage(GNls.Fget(toStr("GXADIRD-0037"), toStr("FORM"), toStr("*ERROR* Bank Routing failed validation.")));
							throw new ApplicationException();
						}
						else if ( lvStatus.equals("W") ) {
							warningMessage(GNls.Fget(toStr("GXADIRD-0038"), toStr("FORM"), toStr("*WARNING* Bank Routing accepted but failed validation. Please verify.")));
						}
						setGlobal("QUERY_MODE", toStr("0"));
					}
					catch(ApplicationException e)
					{
						setGlobal("QUERY_MODE", toStr("0"));
						throw new ApplicationException();
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * BANK_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="BANK_DESC", function=KeyFunction.ITEM_CHANGE)
		public void bankDesc_itemChange()
		{
			
				getGDescClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD_ACTIVITY_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="GXRDIRD_ACTIVITY_DATE", function=KeyFunction.NEXT_ITEM)
		public void gxrdirdActivityDate_keyNexItem()
		{
			
				getGDateClass().nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD_ACTIVITY_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="GXRDIRD_ACTIVITY_DATE", function=KeyFunction.ITEM_CHANGE)
		public void gxrdirdActivityDate_itemChange()
		{
			
				getGDateClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD_ACTIVITY_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="GXRDIRD_ACTIVITY_DATE", function=KeyFunction.ITEM_OUT)
		public void gxrdirdActivityDate_itemOut()
		{
			
				getGDateClass().itemOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD_ATYP_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="GXRDIRD_ATYP_CODE")
		public void gxrdirdAtypCode_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD_ATYP_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="GXRDIRD_ATYP_CODE", function=KeyFunction.ITEM_CHANGE)
		public void gxrdirdAtypCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD_ATYP_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item = "GXRDIRD_ATYP_CODE")
		public void gxrdirdAtypCode_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/* Original PL/SQL code code for TRIGGER GXRDIRD_ATYP_CODE.POST-TEXT-ITEM
		 G$_SEARCH.POST_TEXT_CODE;
DECLARE
 HOLD_VALUE VARCHAR2(1);
 CURSOR CHK_ADDR_SEQNO IS
  SELECT 'Y' FROM SPRADDR
  WHERE SPRADDR_PIDM=:PIDM
  AND (SPRADDR_ATYP_CODE=:GXRDIRD_ATYP_CODE
  OR :GXRDIRD_ATYP_CODE IS NULL);
BEGIN
 OPEN CHK_ADDR_SEQNO;
 FETCH CHK_ADDR_SEQNO INTO HOLD_VALUE;
 IF CHK_ADDR_SEQNO%NOTFOUND AND :GXRDIRD_ATYP_CODE IS NOT NULL THEN
    MESSAGE( G$_NLS.Get('GXADIRD-0039', 'FORM','Address Type is invalid.') );
    RAISE FORM_TRIGGER_FAILURE;
 END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD_ATYP_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="GXRDIRD_ATYP_CODE", function=KeyFunction.ITEM_OUT)
		public void gxrdirdAtypCode_itemOut()
		{
				GxrdirdAdapter gxrdirdElement = (GxrdirdAdapter)this.getFormModel().getGxrdird().getRowAdapter(true);
				if(gxrdirdElement ==null)
					return;

				int rowCount = 0;
				getTask().getGoqrpls().getGSearch().postTextCode();
				{
					NString holdValue= NString.getNull();
					String sqlchkAddrSeqno = "SELECT 'Y' " +
	" FROM SPRADDR " +
	" WHERE SPRADDR_PIDM = :PIDM AND (SPRADDR_ATYP_CODE = :GXRDIRD_ATYP_CODE OR :GXRDIRD_ATYP_CODE IS NULL) ";
					DataCursor chkAddrSeqno = new DataCursor(sqlchkAddrSeqno);
					try {
						chkAddrSeqno.addParameter("PIDM", getFormModel().getKeyBlock().getPidm());
						chkAddrSeqno.addParameter("GXRDIRD_ATYP_CODE", gxrdirdElement.getGxrdirdAtypCode());
						chkAddrSeqno.open();
						ResultSet chkAddrSeqnoResults = chkAddrSeqno.fetchInto();
						if ( chkAddrSeqnoResults != null ) {
							holdValue = chkAddrSeqnoResults.getStr(0);
						}
						if ( chkAddrSeqno.notFound() && !gxrdirdElement.getGxrdirdAtypCode().isNull() )
						{
							errorMessage(GNls.Fget(toStr("GXADIRD-0039"), toStr("FORM"), toStr("*ERROR* Address Type is invalid.")));
							throw new ApplicationException();
						}
					}
					finally{
						chkAddrSeqno.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GXRDIRD_ATYP_CODE.G$_SEARCH_PARAMETERS
		 G$_SEARCH.PARAMETERS('STVATYP_CODE','STVATYP_DESC','');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD_ATYP_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS" , item = "GXRDIRD_ATYP_CODE")
		public void gxrdirdAtypCode_GSearchParameters()
		{
			
				getTask().getGoqrpls().getGSearch().parameters(toStr("STVATYP_CODE"), toStr("STVATYP_DESC"), toStr(""));
			}

		
		/* Original PL/SQL code code for TRIGGER GXRDIRD_ATYP_CODE.KEY-LISTVAL
		 G$_COPY_FLD_ATTR;
EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
G$_CHECK_FAILURE;
:GLOBAL.VALUE:='';
:GLOBAL.KEY_IDNO :=:KEY_BLOCK.ID;
G$_SECURED_FORM_CALL (:GLOBAL.CURRENT_USER,'SOADDRQ','QUERY');
G$_RESET_GLOBAL;
--
   IF :GLOBAL.VALUE IS NOT NULL THEN
      EXECUTE_TRIGGER( 'LIST_VALUES_COPY' ) ;
      G$_CHECK_FAILURE ;
-- 55-1
      :GXRDIRD.GXRDIRD_ADDR_SEQNO := :GLOBAL.SEQNO;
      NEXT_FIELD ;
   END IF ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD_ATYP_CODE.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="GXRDIRD_ATYP_CODE", function=KeyFunction.LIST_VALUES)
		public void gxrdirdAtypCode_ListValues()
		{
				GxrdirdAdapter gxrdirdElement = (GxrdirdAdapter)this.getFormModel().getGxrdird().getRowAdapter(true);
				if(gxrdirdElement ==null)
					return;
				getTask().getGoqrpls().gCopyFldAttr();
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				setGlobal("VALUE", toStr(""));
				setGlobal("KEY_IDNO", getFormModel().getKeyBlock().getId());
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("SOADDRQ"), toStr("QUERY"));
				getTask().getGoqrpls().gResetGlobal();
				if ( !getGlobal("VALUE").isNull() )
				{
					executeAction("LIST_VALUES_COPY");
					getTask().getGoqrpls().gCheckFailure();
					gxrdirdElement.setGxrdirdAddrSeqno(toNumber(getGlobal("SEQNO")));
					nextItem();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GXRDIRD_ATYP_CODE.KEY-NEXT-ITEM
		 G$_SEARCH.CODE_KEY_NEXT_ITEM;
NEXT_ITEM;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD_ATYP_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="GXRDIRD_ATYP_CODE", function=KeyFunction.NEXT_ITEM)
		public void gxrdirdAtypCode_keyNexItem()
		{
			
				getTask().getGoqrpls().getGSearch().codeKeyNextItem();
				nextItem();
			}

		
		/* Original PL/SQL code code for TRIGGER GXRDIRD_ATYP_CODE.WHEN-VALIDATE-ITEM
		 DECLARE
	
	HOLD_VALUE VARCHAR2(1);
  CURSOR CHK_ADDR_SEQNO IS SELECT 'Y' FROM SPRADDR
                            WHERE SPRADDR_PIDM=:PIDM
														  AND SPRADDR_ATYP_CODE=:GXRDIRD_ATYP_CODE
														  AND SPRADDR_SEQNO=:GXRDIRD_ADDR_SEQNO;
BEGIN
	
	IF (:GXRDIRD_ADDR_SEQNO IS NOT NULL) AND
		 (:GXRDIRD_ATYP_CODE IS NOT NULL) THEN
		 
		 OPEN CHK_ADDR_SEQNO;
		 FETCH CHK_ADDR_SEQNO INTO HOLD_VALUE;
		 IF CHK_ADDR_SEQNO%NOTFOUND THEN
		    MESSAGE( G$_NLS.Get('GXADIRD-0040', 'FORM','Address Information is invalid.') );
		    RAISE FORM_TRIGGER_FAILURE;
		 END IF;
		 
	END IF; 
	
	IF (:GXRDIRD_ATYP_CODE IS NULL) THEN
		
	 	:GXRDIRD.GXRDIRD_ADDR_SEQNO := '';
	 	SET_ITEM_INSTANCE_PROPERTY('GXRDIRD_ADDR_SEQNO', CURRENT_RECORD,NAVIGABLE, PROPERTY_FALSE);
	 	SET_ITEM_INSTANCE_PROPERTY('GXRDIRD_ADDR_SEQNO', CURRENT_RECORD,UPDATE_ALLOWED, PROPERTY_FALSE);
	  
	ELSE
	  SET_ITEM_INSTANCE_PROPERTY('GXRDIRD_ADDR_SEQNO', CURRENT_RECORD,NAVIGABLE, PROPERTY_TRUE);
	 	SET_ITEM_INSTANCE_PROPERTY('GXRDIRD_ADDR_SEQNO', CURRENT_RECORD,UPDATE_ALLOWED, PROPERTY_TRUE);
	END IF;
	
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD_ATYP_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="GXRDIRD_ATYP_CODE")
		public void gxrdirdAtypCode_validate()
		{
				GxrdirdAdapter gxrdirdElement = (GxrdirdAdapter)this.getFormModel().getGxrdird().getRowAdapter(true);
				if(gxrdirdElement ==null)
					return;

				int rowCount = 0;
				{
					NString holdValue= NString.getNull();
					String sqlchkAddrSeqno = "SELECT 'Y' " +
	" FROM SPRADDR " +
	" WHERE SPRADDR_PIDM = :PIDM AND SPRADDR_ATYP_CODE = :GXRDIRD_ATYP_CODE AND SPRADDR_SEQNO = :GXRDIRD_ADDR_SEQNO ";
					DataCursor chkAddrSeqno = new DataCursor(sqlchkAddrSeqno);
					try {
						if ( (!gxrdirdElement.getGxrdirdAddrSeqno().isNull()) && (!gxrdirdElement.getGxrdirdAtypCode().isNull()) )
						{
							chkAddrSeqno.addParameter("PIDM", getFormModel().getKeyBlock().getPidm());
							chkAddrSeqno.addParameter("GXRDIRD_ATYP_CODE", gxrdirdElement.getGxrdirdAtypCode());
							chkAddrSeqno.addParameter("GXRDIRD_ADDR_SEQNO", gxrdirdElement.getGxrdirdAddrSeqno());
							chkAddrSeqno.open();
							ResultSet chkAddrSeqnoResults = chkAddrSeqno.fetchInto();
							if ( chkAddrSeqnoResults != null ) {
								holdValue = chkAddrSeqnoResults.getStr(0);
							}
							if ( chkAddrSeqno.notFound() )
							{
								errorMessage(GNls.Fget(toStr("GXADIRD-0040"), toStr("FORM"), toStr("*ERROR* Address Information is invalid.")));
								throw new ApplicationException();
							}
						}
						if ((gxrdirdElement.getGxrdirdAtypCode().isNull()))
						{
							gxrdirdElement.setGxrdirdAddrSeqno(toNumber(""));
							setItemEnabled("GXRDIRD_ADDR_SEQNO", ItemServices.CURRENT_RECORD, false);
							setItemUpdateAllowed("GXRDIRD_ADDR_SEQNO", ItemServices.CURRENT_RECORD, false);
						}
						else {
							setItemEnabled("GXRDIRD_ADDR_SEQNO", ItemServices.CURRENT_RECORD, true);
							setItemUpdateAllowed("GXRDIRD_ADDR_SEQNO", ItemServices.CURRENT_RECORD, true);
						}
					}
					finally{
						chkAddrSeqno.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GXRDIRD_ADDR_SEQNO.POST-TEXT-ITEM
		 DECLARE
 HOLD_VALUE VARCHAR2(1);
 CURSOR CHK_ADDR_SEQNO IS
  SELECT 'Y' FROM SPRADDR
  WHERE SPRADDR_PIDM=:PIDM
  AND SPRADDR_ATYP_CODE=:GXRDIRD_ATYP_CODE
  AND SPRADDR_SEQNO=:GXRDIRD_ADDR_SEQNO;
BEGIN
	IF (:GXRDIRD_ADDR_SEQNO IS NOT NULL) AND
		 (:GXRDIRD_ATYP_CODE IS NOT NULL) THEN
		 OPEN CHK_ADDR_SEQNO;
		 FETCH CHK_ADDR_SEQNO INTO HOLD_VALUE;
		 IF CHK_ADDR_SEQNO%NOTFOUND THEN
		    MESSAGE( G$_NLS.Get('GXADIRD-0041', 'FORM','Address Information is invalid.') );
		    RAISE FORM_TRIGGER_FAILURE;
		 END IF;
	END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD_ADDR_SEQNO.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="GXRDIRD_ADDR_SEQNO", function=KeyFunction.ITEM_OUT)
		public void gxrdirdAddrSeqno_itemOut()
		{
				GxrdirdAdapter gxrdirdElement = (GxrdirdAdapter)this.getFormModel().getGxrdird().getRowAdapter(true);
				if(gxrdirdElement ==null)
					return;

				int rowCount = 0;
				{
					NString holdValue= NString.getNull();
					String sqlchkAddrSeqno = "SELECT 'Y' " +
	" FROM SPRADDR " +
	" WHERE SPRADDR_PIDM = :PIDM AND SPRADDR_ATYP_CODE = :GXRDIRD_ATYP_CODE AND SPRADDR_SEQNO = :GXRDIRD_ADDR_SEQNO ";
					DataCursor chkAddrSeqno = new DataCursor(sqlchkAddrSeqno);
					try {
						if ( (!gxrdirdElement.getGxrdirdAddrSeqno().isNull()) && (!gxrdirdElement.getGxrdirdAtypCode().isNull()) )
						{
							chkAddrSeqno.addParameter("PIDM", getFormModel().getKeyBlock().getPidm());
							chkAddrSeqno.addParameter("GXRDIRD_ATYP_CODE", gxrdirdElement.getGxrdirdAtypCode());
							chkAddrSeqno.addParameter("GXRDIRD_ADDR_SEQNO", gxrdirdElement.getGxrdirdAddrSeqno());
							chkAddrSeqno.open();
							ResultSet chkAddrSeqnoResults = chkAddrSeqno.fetchInto();
							if ( chkAddrSeqnoResults != null ) {
								holdValue = chkAddrSeqnoResults.getStr(0);
							}
							if ( chkAddrSeqno.notFound() )
							{
								errorMessage(GNls.Fget(toStr("GXADIRD-0041"), toStr("FORM"), toStr("*ERROR* Address Information is invalid.")));
								throw new ApplicationException();
							}
						}
					}
					finally{
						chkAddrSeqno.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GXRDIRD_ADDR_SEQNO.WHEN-VALIDATE-ITEM
		 IF (:GXRDIRD_ADDR_SEQNO IS  NULL) AND 
	 (:SYSTEM.RECORD_STATUS NOT IN ('NEW','INSERT')) THEN
		 :GXRDIRD_ATYP_CODE := '';
END IF;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD_ADDR_SEQNO.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="GXRDIRD_ADDR_SEQNO")
		public void gxrdirdAddrSeqno_validate()
		{
				GxrdirdAdapter gxrdirdElement = (GxrdirdAdapter)this.getFormModel().getGxrdird().getRowAdapter(true);
				if(gxrdirdElement ==null)
					return;
				if ( (gxrdirdElement.getGxrdirdAddrSeqno().isNull()) && (!(getRecordStatus().equals("NEW") || getRecordStatus().equals("INSERT"))) )
				{
					gxrdirdElement.setGxrdirdAtypCode(toStr(""));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GXRDIRD_BANK_ACCT_NUM.WHEN-VALIDATE-ITEM
		 DECLARE
	lv_status VARCHAR2(01);
BEGIN
--
   lv_status := goksels.f_validate_bank_acct_num(:GXRDIRD_BANK_ACCT_NUM);
   IF lv_status = 'N' THEN
   	 MESSAGE(G$_NLS.Get('GXADIRD-0042', 'FORM','*ERROR* Account Number failed validation. Please re-enter.')  ) ;
     RAISE FORM_TRIGGER_FAILURE ;
   ELSIF lv_status = 'W' THEN
   	 MESSAGE(G$_NLS.Get('GXADIRD-0043', 'FORM','*WARNING* Account Number accepted but failed validation. Please verify.')  ) ;
   END IF;
   G$_CHECK_FAILURE ;
--
   EXECUTE_TRIGGER( 'CHECK_BANK_CODE' ) ;
   G$_CHECK_FAILURE ;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD_BANK_ACCT_NUM.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="GXRDIRD_BANK_ACCT_NUM")
		public void gxrdirdBankAcctNum_validate()
		{
				GxrdirdAdapter gxrdirdElement = (GxrdirdAdapter)this.getFormModel().getGxrdird().getRowAdapter(true);
				if(gxrdirdElement ==null)
					return;
				{
					NString lvStatus= NString.getNull();
					lvStatus = Goksels.fValidateBankAcctNum(gxrdirdElement.getGxrdirdBankAcctNum());
					if ( lvStatus.equals("N") )
					{
						errorMessage(GNls.Fget(toStr("GXADIRD-0042"), toStr("FORM"), toStr("*ERROR* Account Number failed validation. Please re-enter.")));
						throw new ApplicationException();
					}
					else if ( lvStatus.equals("W") ) {
						warningMessage(GNls.Fget(toStr("GXADIRD-0043"), toStr("FORM"), toStr("*WARNING* Account Number accepted but failed validation. Please verify.")));
					}
					getTask().getGoqrpls().gCheckFailure();
					executeAction("CHECK_BANK_CODE");
					getTask().getGoqrpls().gCheckFailure();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GXRDIRD_ACCT_TYPE.POST-CHANGE
		 BEGIN
   G$_CHECK_QUERY_MODE ;
--
   EXECUTE_TRIGGER( 'CHK_ACCT_TYPE' ) ;
   G$_CHECK_FAILURE ;
--
   :GLOBAL.QUERY_MODE := '0' ;
EXCEPTION
   WHEN FORM_TRIGGER_FAILURE THEN
      :GLOBAL.QUERY_MODE := '0' ;
      RAISE FORM_TRIGGER_FAILURE ;
END ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD_ACCT_TYPE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="GXRDIRD_ACCT_TYPE")
		public void gxrdirdAcctType_PostChange()
		{
				GxrdirdAdapter gxrdirdElement = (GxrdirdAdapter)this.getFormModel().getGxrdird().getRowAdapter(true);
				if(gxrdirdElement ==null)
					return;

				if(gxrdirdElement.getGxrdirdAcctType().isNull())
		return;
				try
				{
					getTask().getGoqrpls().gCheckQueryMode();
					executeAction("CHK_ACCT_TYPE");
					getTask().getGoqrpls().gCheckFailure();
					setGlobal("QUERY_MODE", toStr("0"));
				}
				catch(ApplicationException e)
				{
					setGlobal("QUERY_MODE", toStr("0"));
					throw new ApplicationException();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GXRDIRD_ACCT_TYPE.KEY-NEXT-ITEM
		    EXECUTE_TRIGGER( 'CHECK_ACCT_TYPE2' ) ;
   G$_CHECK_FAILURE ;
   NEXT_FIELD ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD_ACCT_TYPE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="GXRDIRD_ACCT_TYPE", function=KeyFunction.NEXT_ITEM)
		public void gxrdirdAcctType_keyNexItem()
		{
			
				executeAction("CHECK_ACCT_TYPE2");
				getTask().getGoqrpls().gCheckFailure();
				nextItem();
			}

		
		/* Original PL/SQL code code for TRIGGER GXRDIRD_STATUS.POST_CHANGE
		 BEGIN
   G$_CHECK_QUERY_MODE ;
--
   IF ( :GLOBAL.QUERY_MODE = '1' ) THEN
      GOTO PTI_END_TRIGGER ;
   END IF ;
   G$_CHECK_VALUE ((:GXRDIRD_STATUS NOT IN ('A', 'P')),
 G$_NLS.Get('GXADIRD-0044', 'FORM','*ERROR* Status; valid values (A)ctive, (P)re-notification.') , TRUE, TRUE)
         ;
--
   << PTI_END_TRIGGER >>
   :GLOBAL.QUERY_MODE := '0' ;
EXCEPTION
   WHEN FORM_TRIGGER_FAILURE THEN
      :GLOBAL.QUERY_MODE := '0' ;
      RAISE FORM_TRIGGER_FAILURE ;
END ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD_STATUS.POST_CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST_CHANGE", item="GXRDIRD_STATUS")
		public void gxrdirdStatus_PostChange()
		{
				GxrdirdAdapter gxrdirdElement = (GxrdirdAdapter)this.getFormModel().getGxrdird().getRowAdapter(true);
				if(gxrdirdElement ==null)
					return;
				try
				{
					getTask().getGoqrpls().gCheckQueryMode();
					if ((getGlobal("QUERY_MODE").equals("1")))
					{
						 setGlobal("QUERY_MODE", toStr("0"));
					}else{
						
					
					getTask().getGoqrpls().gCheckValue(toBool((!in(gxrdirdElement.getGxrdirdStatus(), "A", "P").getValue())), GNls.Fget(toStr("GXADIRD-0044"), toStr("FORM"), toStr("*ERROR* Status; valid values (A)ctive, (P)re-notification.")), toBool(NBool.True), toBool(NBool.True));
					setGlobal("QUERY_MODE", toStr("0"));
					}
				}
				catch(ApplicationException e)
				{
					setGlobal("QUERY_MODE", toStr("0"));
					throw new ApplicationException();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GXRDIRD_STATUS.WHEN-VALIDATE-ITEM
		    IF :GXRDIRD_STATUS = 'X' THEN
      MESSAGE( G$_NLS.Get('GXADIRD-0045', 'FORM','*ERROR* Invalid Entry, No Blank or Null Value allowed.') );
   END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD_STATUS.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="GXRDIRD_STATUS")
		public void gxrdirdStatus_validate()
		{
				GxrdirdAdapter gxrdirdElement = (GxrdirdAdapter)this.getFormModel().getGxrdird().getRowAdapter(true);
				if(gxrdirdElement ==null)
					return;
				if ( gxrdirdElement.getGxrdirdStatus().equals("X") )
				{
					errorMessage(GNls.Fget(toStr("GXADIRD-0045"), toStr("FORM"), toStr("*ERROR* Invalid Entry, No Blank or Null Value allowed.")));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GXRDIRD_AMOUNT.POST-CHANGE
		 BEGIN
   G$_CHECK_QUERY_MODE ;
--
   IF ( :GLOBAL.QUERY_MODE = '1' ) THEN
      GOTO PTI_END_TRIGGER ;
   END IF ;
   IF (:GXRDIRD_AMOUNT IS NOT NULL) THEN
      :GXRDIRD_PERCENT := '' ;
   END IF ;
--
   << PTI_END_TRIGGER >>
   :GLOBAL.QUERY_MODE := '0' ;
EXCEPTION
   WHEN FORM_TRIGGER_FAILURE THEN
      :GLOBAL.QUERY_MODE := '0' ;
      RAISE FORM_TRIGGER_FAILURE ;
END ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD_AMOUNT.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="GXRDIRD_AMOUNT")
		public void gxrdirdAmount_PostChange()
		{
				GxrdirdAdapter gxrdirdElement = (GxrdirdAdapter)this.getFormModel().getGxrdird().getRowAdapter(true);
				if(gxrdirdElement ==null)
					return;
				if(gxrdirdElement.getGxrdirdAmount().isNull())
		return;
				try
				{
					getTask().getGoqrpls().gCheckQueryMode();
					if ((getGlobal("QUERY_MODE").equals("1")))
					{
						 setGlobal("QUERY_MODE", toStr("0"));
					}else{
						if ((!gxrdirdElement.getGxrdirdAmount().isNull()))
						{
							gxrdirdElement.setGxrdirdPercent(toNumber(""));
						}
					}
					setGlobal("QUERY_MODE", toStr("0"));
				}
				catch(ApplicationException e)
				{
					setGlobal("QUERY_MODE", toStr("0"));
					throw new ApplicationException();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GXRDIRD_PERCENT.POST-CHANGE
		 BEGIN
   G$_CHECK_QUERY_MODE ;
--
   IF ( :GLOBAL.QUERY_MODE = '1' ) THEN
      GOTO PTI_STEP_001 ;
   END IF ;
   G$_CHECK_VALUE ((:GXRDIRD_PERCENT > 100),
       G$_NLS.Get('GXADIRD-0046', 'FORM','*ERROR* Deposit Percentage; values 0 thru 100%.') , TRUE
         , TRUE);
--
   << PTI_STEP_001 >>
   IF :GXRDIRD_AMOUNT IS NULL THEN
      IF :GXRDIRD_PERCENT IS NULL THEN
         MESSAGE (
 G$_NLS.Get('GXADIRD-0047', 'FORM','*ERROR* A direct deposit percentage or amount must be entered.')  ) ;
         RAISE FORM_TRIGGER_FAILURE ;
      END IF ;
   ELSE
      IF :GXRDIRD_PERCENT IS NOT NULL THEN
         MESSAGE (
 G$_NLS.Get('GXADIRD-0048', 'FORM','*ERROR* Enter either Amount or Percent, not both.')  ) ;
         RAISE FORM_TRIGGER_FAILURE ;
      END IF ;
   END IF ;
--
   :GLOBAL.QUERY_MODE := '0' ;
EXCEPTION
   WHEN FORM_TRIGGER_FAILURE THEN
      :GLOBAL.QUERY_MODE := '0' ;
      RAISE FORM_TRIGGER_FAILURE ;
END ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD_PERCENT.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="GXRDIRD_PERCENT")
		public void gxrdirdPercent_PostChange()
		{
				GxrdirdAdapter gxrdirdElement = (GxrdirdAdapter)this.getFormModel().getGxrdird().getRowAdapter(true);
				if(gxrdirdElement ==null)
					return;
				if(gxrdirdElement.getGxrdirdPercent().isNull())
		return;
				try
				{
					getTask().getGoqrpls().gCheckQueryMode();
					if ((getGlobal("QUERY_MODE").equals("1")))
					{
						 if ( gxrdirdElement.getGxrdirdAmount().isNull() )
							{
								if ( gxrdirdElement.getGxrdirdPercent().isNull() )
								{
									errorMessage(GNls.Fget(toStr("GXADIRD-0046"), toStr("FORM"), toStr("*ERROR* A direct deposit percentage or amount must be entered.")));
									throw new ApplicationException();
								}
							}
							else {
								if ( !gxrdirdElement.getGxrdirdPercent().isNull() )
								{
									errorMessage(GNls.Fget(toStr("GXADIRD-0056"), toStr("FORM"), toStr("*ERROR* Enter either Amount or Percent, not both.")));
									throw new ApplicationException();
								}
							}
					}
					else{
						getTask().getGoqrpls().gCheckValue(toBool((gxrdirdElement.getGxrdirdPercent().greater(100))), GNls.Fget(toStr("GXADIRD-0057"), toStr("FORM"), toStr("*ERROR* Deposit Percentage; values 0 thru 100%.")), toBool(NBool.True), toBool(NBool.True));
					} 
					if ( gxrdirdElement.getGxrdirdAmount().isNull() )
					{
						if ( gxrdirdElement.getGxrdirdPercent().isNull() )
						{
							errorMessage(GNls.Fget(toStr("GXADIRD-0047"), toStr("FORM"), toStr("*ERROR* A direct deposit percentage or amount must be entered.")));
							throw new ApplicationException();
						}
					}
					else {
						if ( !gxrdirdElement.getGxrdirdPercent().isNull() )
						{
							errorMessage(GNls.Fget(toStr("GXADIRD-0048"), toStr("FORM"), toStr("*ERROR* Enter either Amount or Percent, not both.")));
							throw new ApplicationException();
						}
					}
					setGlobal("QUERY_MODE", toStr("0"));
				}
				catch(ApplicationException e)
				{
					setGlobal("QUERY_MODE", toStr("0"));
					throw new ApplicationException();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GXRDIRD_PERCENT.KEY-NEXT-ITEM
		    EXECUTE_TRIGGER( 'CHECK_DIRD' ) ;
   G$_CHECK_FAILURE ;
   NEXT_FIELD ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD_PERCENT.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="GXRDIRD_PERCENT", function=KeyFunction.NEXT_ITEM)
		public void gxrdirdPercent_keyNexItem()
		{
			
				executeAction("CHECK_DIRD");
				getTask().getGoqrpls().gCheckFailure();
				nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD_SCOD_CODE_ISO.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="GXRDIRD_SCOD_CODE_ISO")
		public void gxrdirdScodCodeIso_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD_SCOD_CODE_ISO.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="GXRDIRD_SCOD_CODE_ISO", function=KeyFunction.ITEM_CHANGE)
		public void gxrdirdScodCodeIso_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD_SCOD_CODE_ISO.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item = "GXRDIRD_SCOD_CODE_ISO")
		public void gxrdirdScodCodeIso_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD_SCOD_CODE_ISO.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="GXRDIRD_SCOD_CODE_ISO", function=KeyFunction.NEXT_ITEM)
		public void gxrdirdScodCodeIso_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD_SCOD_CODE_ISO.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="GXRDIRD_SCOD_CODE_ISO", function=KeyFunction.ITEM_OUT)
		public void gxrdirdScodCodeIso_itemOut()
		{
			
				getGCodeClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER GXRDIRD_SCOD_CODE_ISO.G$_SEARCH_PARAMETERS
		 G$_SEARCH.PARAMETERS('GTVSCOD_CODE','GTVSCOD_DESC','WHERE gtvscod_element_id=''3166''  AND gtvscod_standard_ind=''I''');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD_SCOD_CODE_ISO.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS" , item = "GXRDIRD_SCOD_CODE_ISO")
		public void gxrdirdScodCodeIso_GSearchParameters()
		{
			
				getTask().getGoqrpls().getGSearch().parameters(toStr("GTVSCOD_CODE"), toStr("GTVSCOD_DESC"), toStr("WHERE gtvscod_element_id='3166'  AND gtvscod_standard_ind='I'"));
			}

		
		/* Original PL/SQL code code for TRIGGER GXRDIRD_SCOD_CODE_ISO.KEY-LISTVAL
		 G$_COPY_FLD_ATTR;
EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
G$_CHECK_FAILURE;
--
:GLOBAL.EDI_ELEMENT_ID := '3166';
:GLOBAL.EDI_STANDARD_IND := 'I';
G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER,'GTVSCOD','QUERY');
G$_RESET_GLOBAL;
G$_CHECK_FAILURE;
--
:GLOBAL.EDI_ELEMENT_ID := '';
:GLOBAL.EDI_STANDARD_IND := '';
--
IF  :GLOBAL.VALUE IS NOT NULL THEN
    EXECUTE_TRIGGER('LIST_VALUES_COPY');
    G$_CHECK_FAILURE;
    :GLOBAL.VALUE := '';
    NEXT_ITEM;
END IF;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD_SCOD_CODE_ISO.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="GXRDIRD_SCOD_CODE_ISO", function=KeyFunction.LIST_VALUES)
		public void gxrdirdScodCodeIso_ListValues()
		{
				getTask().getGoqrpls().gCopyFldAttr();
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				setGlobal("EDI_ELEMENT_ID", toStr("3166"));
				setGlobal("EDI_STANDARD_IND", toStr("I"));
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("GTVSCOD"), toStr("QUERY"));
				getTask().getGoqrpls().gResetGlobal();
				getTask().getGoqrpls().gCheckFailure();
				setGlobal("EDI_ELEMENT_ID", toStr(""));
				setGlobal("EDI_STANDARD_IND", toStr(""));
				if ( !getGlobal("VALUE").isNull() )
				{
					executeAction("LIST_VALUES_COPY");
					getTask().getGoqrpls().gCheckFailure();
					setGlobal("VALUE", toStr(""));
					this.gxrdirdScodCodeIso_validate();
					nextItem();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GXRDIRD_SCOD_CODE_ISO.POST-CHANGE
		 DECLARE
	
	CURSOR gtvscod_c
	    IS
	SELECT gtvscod_desc
	  FROM GTVSCOD
	 WHERE gtvscod_code=:GXRDIRD_SCOD_CODE_ISO
	   AND gtvscod_element_id='3166'
	   AND gtvscod_standard_ind='I';
	lv_description gtvscod.gtvscod_desc%TYPE;
BEGIN
	:SCOD_CODE_DESC := NULL;
	IF :GXRDIRD_SCOD_CODE_ISO IS NOT NULL THEN
		IF LENGTH(:GXRDIRD_SCOD_CODE_ISO) > 2 THEN
			message(G$_NLS.Get('GXADIRD-0049','FORM','*ERROR* The ISO Country Code must be a 2-character alpha country code for IAT.'));
			:GXRDIRD_SCOD_CODE_ISO := NULL;
			:SCOD_CODE_DESC := NULL;
			RAISE FORM_TRIGGER_FAILURE;
		END IF;
		OPEN gtvscod_c;
		FETCH gtvscod_c INTO lv_description;
		CLOSE gtvscod_c;
		
		IF lv_description IS NULL THEN
			
			message(G$_NLS.Get('GXADIRD-0050','FORM','*ERROR* ISO Country is invalid. Press LIST for valid choices.'));
			RAISE FORM_TRIGGER_FAILURE;
		ELSE
			:SCOD_CODE_DESC := lv_description;
		END IF;
	END IF;
END;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD_SCOD_CODE_ISO.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="GXRDIRD_SCOD_CODE_ISO")
		public void gxrdirdScodCodeIso_PostChange()
		{
				GxrdirdAdapter gxrdirdElement = (GxrdirdAdapter)this.getFormModel().getGxrdird().getRowAdapter(true);
				if(gxrdirdElement ==null)
					return;
				int rowCount = 0;
				if(gxrdirdElement.getGxrdirdScodCodeIso().isNull())
		return;
				{
					String sqlgtvscodC = "SELECT gtvscod_desc " +
	" FROM GTVSCOD " +
	" WHERE gtvscod_code = :GXRDIRD_SCOD_CODE_ISO AND gtvscod_element_id = '3166' AND gtvscod_standard_ind = 'I' ";
					DataCursor gtvscodC = new DataCursor(sqlgtvscodC);
					NString lvDescription= NString.getNull();
					try {
						gxrdirdElement.setScodCodeDesc(toStr(null));
						if ( !gxrdirdElement.getGxrdirdScodCodeIso().isNull() )
						{
							if ( length(gxrdirdElement.getGxrdirdScodCodeIso()).greater(2) )
							{
								errorMessage(GNls.Fget(toStr("GXADIRD-0049"), toStr("FORM"), toStr("*ERROR* The ISO Country Code must be a 2-character alpha country code for IAT.")));
								gxrdirdElement.setGxrdirdScodCodeIso(toStr(null));
								gxrdirdElement.setScodCodeDesc(toStr(null));
								throw new ApplicationException();
							}
							gtvscodC.addParameter("GXRDIRD_SCOD_CODE_ISO", gxrdirdElement.getGxrdirdScodCodeIso());
							gtvscodC.open();
							ResultSet gtvscodCResults = gtvscodC.fetchInto();
							if ( gtvscodCResults != null ) {
								lvDescription = gtvscodCResults.getStr(0);
							}
							if ( lvDescription.isNull() )
							{
								errorMessage(GNls.Fget(toStr("GXADIRD-0050"), toStr("FORM"), toStr("*ERROR* ISO Country is invalid. Press LIST for valid choices.")));
								throw new ApplicationException();
							}
							else {
								gxrdirdElement.setScodCodeDesc(lvDescription);
							}
						}
					}
					finally{
						gtvscodC.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GXRDIRD_SCOD_CODE_ISO.WHEN-VALIDATE-ITEM
		 IF :GXRDIRD_SCOD_CODE_ISO IS NULL THEN
	:SCOD_CODE_DESC := NULL;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD_SCOD_CODE_ISO.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="GXRDIRD_SCOD_CODE_ISO")
		public void gxrdirdScodCodeIso_validate()
		{
				GxrdirdAdapter gxrdirdElement = (GxrdirdAdapter)this.getFormModel().getGxrdird().getRowAdapter(true);
				if(gxrdirdElement ==null)
					return;
				if ( gxrdirdElement.getGxrdirdScodCodeIso().isNull() )
				{
					gxrdirdElement.setScodCodeDesc(toStr(null));
				}else
					this.gxrdirdScodCodeIso_PostChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCOD_CODE_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SCOD_CODE_DESC", function=KeyFunction.ITEM_CHANGE)
		public void scodCodeDesc_itemChange()
		{
			
				getGDescClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD_ACHT_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="GXRDIRD_ACHT_CODE")
		public void gxrdirdAchtCode_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD_ACHT_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="GXRDIRD_ACHT_CODE", function=KeyFunction.ITEM_CHANGE)
		public void gxrdirdAchtCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD_ACHT_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item = "GXRDIRD_ACHT_CODE")
		public void gxrdirdAchtCode_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD_ACHT_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="GXRDIRD_ACHT_CODE", function=KeyFunction.NEXT_ITEM)
		public void gxrdirdAchtCode_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD_ACHT_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="GXRDIRD_ACHT_CODE", function=KeyFunction.ITEM_OUT)
		public void gxrdirdAchtCode_itemOut()
		{
			
				getGCodeClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER GXRDIRD_ACHT_CODE.G$_SEARCH_PARAMETERS
		 G$_SEARCH.PARAMETERS('GTVACHT_CODE','GTVACHT_DESC','WHERE GTVACHT_STATUS_IND=''Y''');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD_ACHT_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS" , item = "GXRDIRD_ACHT_CODE")
		public void gxrdirdAchtCode_GSearchParameters()
		{
			
				getTask().getGoqrpls().getGSearch().parameters(toStr("GTVACHT_CODE"), toStr("GTVACHT_DESC"), toStr("WHERE GTVACHT_STATUS_IND='Y'"));
			}

		
		/* Original PL/SQL code code for TRIGGER GXRDIRD_ACHT_CODE.POST-CHANGE
		 IF LENGTH(:GXRDIRD_ACHT_CODE) > 3 THEN
		message(G$_NLS.Get('GXADIRD-0051','FORM','*ERROR* The ACH Transaction Type must be a 3-character code.'));
		:GXRDIRD_ACHT_CODE := NULL;
		
	RAISE FORM_TRIGGER_FAILURE;
END IF;
DECLARE
	CURSOR gtvacht_c IS
	    SELECT 'Y'
	      FROM GTVACHT
	     WHERE gtvacht_code = :GXRDIRD_ACHT_CODE
	       AND gtvacht_status_ind = 'Y';
	lv_status_ind gtvacht.gtvacht_status_ind%TYPE := 'N';
BEGIN
	OPEN gtvacht_c;
	FETCH gtvacht_c INTO lv_status_ind;
	CLOSE gtvacht_c;
	IF lv_status_ind = 'N' THEN
		message(G$_NLS.Get('GXADIRD-0052','FORM','*ERROR* ACH Transaction Type is invalid. Press LIST for valid choices.'));
		RAISE FORM_TRIGGER_FAILURE;
	END IF;
END;	
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD_ACHT_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="GXRDIRD_ACHT_CODE")
		public void gxrdirdAchtCode_PostChange()
		{
				GxrdirdAdapter gxrdirdElement = (GxrdirdAdapter)this.getFormModel().getGxrdird().getRowAdapter(true);
				if(gxrdirdElement ==null)
					return;
				int rowCount = 0;
				if(gxrdirdElement.getGxrdirdAchtCode().isNull())
		return;
				if ( length(gxrdirdElement.getGxrdirdAchtCode()).greater(3) )
				{
					errorMessage(GNls.Fget(toStr("GXADIRD-0051"), toStr("FORM"), toStr("*ERROR* The ACH Transaction Type must be a 3-character code.")));
					gxrdirdElement.setGxrdirdAchtCode(toStr(null));
					throw new ApplicationException();
				}
				{
					String sqlgtvachtC = "SELECT 'Y' " +
	" FROM GTVACHT " +
	" WHERE gtvacht_code = :GXRDIRD_ACHT_CODE AND gtvacht_status_ind = 'Y' ";
					DataCursor gtvachtC = new DataCursor(sqlgtvachtC);
					NString lvStatusInd = toStr("N");
					try {
						gtvachtC.addParameter("GXRDIRD_ACHT_CODE", gxrdirdElement.getGxrdirdAchtCode());
						gtvachtC.open();
						ResultSet gtvachtCResults = gtvachtC.fetchInto();
						if ( gtvachtCResults != null ) {
							lvStatusInd = gtvachtCResults.getStr(0);
						}
						if ( lvStatusInd.equals("N") )
						{
							errorMessage(GNls.Fget(toStr("GXADIRD-0052"), toStr("FORM"), toStr("*ERROR* ACH Transaction Type is invalid. Press LIST for valid choices.")));
							throw new ApplicationException();
						}
					}
					finally{
						gtvachtC.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GXRDIRD_ACHT_CODE.KEY-LISTVAL
		 G$_DISPLAY_LOV('GXRDIRD_ACHT_CODE','GTVACHT_LOV');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD_ACHT_CODE.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="GXRDIRD_ACHT_CODE", function=KeyFunction.LIST_VALUES)
		public void gxrdirdAchtCode_ListValues()
		{
			
				getTask().getGoqrpls().gDisplayLov(toStr("GXRDIRD_ACHT_CODE"), toStr("GTVACHT_LOV"));
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD_ATYP_CODE_IAT.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="GXRDIRD_ATYP_CODE_IAT")
		public void gxrdirdAtypCodeIat_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
				
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD_ATYP_CODE_IAT.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="GXRDIRD_ATYP_CODE_IAT", function=KeyFunction.ITEM_CHANGE)
		public void gxrdirdAtypCodeIat_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD_ATYP_CODE_IAT.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item = "GXRDIRD_ATYP_CODE_IAT")
		public void gxrdirdAtypCodeIat_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD_ATYP_CODE_IAT.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="GXRDIRD_ATYP_CODE_IAT", function=KeyFunction.NEXT_ITEM)
		public void gxrdirdAtypCodeIat_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD_ATYP_CODE_IAT.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="GXRDIRD_ATYP_CODE_IAT", function=KeyFunction.ITEM_OUT)
		public void gxrdirdAtypCodeIat_itemOut()
		{
			
				getGCodeClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER GXRDIRD_ATYP_CODE_IAT.G$_SEARCH_PARAMETERS
		 G$_SEARCH.PARAMETERS('STVATYP_CODE','STVATYP_DESC','');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD_ATYP_CODE_IAT.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS" , item = "GXRDIRD_ATYP_CODE_IAT")
		public void gxrdirdAtypCodeIat_GSearchParameters()
		{
			
				getTask().getGoqrpls().getGSearch().parameters(toStr("STVATYP_CODE"), toStr("STVATYP_DESC"), toStr(""));
			}

		
		/* Original PL/SQL code code for TRIGGER GXRDIRD_ATYP_CODE_IAT.KEY-LISTVAL
		 DECLARE
BEGIN
	G$_COPY_FLD_ATTR;
	EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
	G$_CHECK_FAILURE;
	:GLOBAL.VALUE:='';
	:GLOBAL.KEY_IDNO :=:KEY_BLOCK.ID;
	G$_SECURED_FORM_CALL (:GLOBAL.CURRENT_USER,'SOADDRQ','QUERY');
	G$_RESET_GLOBAL;
	--
	IF :GLOBAL.VALUE IS NOT NULL THEN
		
		EXECUTE_TRIGGER( 'LIST_VALUES_COPY' ) ;
		:GXRDIRD_ATYP_CODE_IAT :=:GLOBAL.VALUE;
	  G$_CHECK_FAILURE ;
  	:GXRDIRD_ADDR_SEQNO_IAT := :GLOBAL.SEQNO;
	  
		IF :GXRDIRD_HR_IND ='A' AND :GXRDIRD_AP_IND ='I' THEN
 			:GXRDIRD_ADDR_SEQNO_IAT := NULL;
 			message(G$_NLS.Get('GXADIRD-0053','FORM','*WARNING* The address selected may not be the address actually used as the IAT Override with payroll processing if a newer address exists.'));
		END IF;
	END IF ;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD_ATYP_CODE_IAT.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="GXRDIRD_ATYP_CODE_IAT", function=KeyFunction.LIST_VALUES)
		public void gxrdirdAtypCodeIat_ListValues()
		{
				GxrdirdAdapter gxrdirdElement = (GxrdirdAdapter)this.getFormModel().getGxrdird().getRowAdapter(true);
				if(gxrdirdElement ==null)
					return;
				{
					getTask().getGoqrpls().gCopyFldAttr();
					executeAction("G$_REVOKE_ACCESS");
					getTask().getGoqrpls().gCheckFailure();
					setGlobal("VALUE", toStr(""));
					setGlobal("KEY_IDNO", getFormModel().getKeyBlock().getId());
					getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("SOADDRQ"), toStr("QUERY"));
					getTask().getGoqrpls().gResetGlobal();
					if ( !getGlobal("VALUE").isNull() )
					{
						executeAction("LIST_VALUES_COPY");
						gxrdirdElement.setGxrdirdAtypCodeIat(getGlobal("VALUE"));
						getTask().getGoqrpls().gCheckFailure();
						gxrdirdElement.setGxrdirdAddrSeqnoIat(toNumber(getGlobal("SEQNO")));
						if ( gxrdirdElement.getGxrdirdHrInd().equals("A") && gxrdirdElement.getGxrdirdApInd().equals("I") )
						{
							gxrdirdElement.setGxrdirdAddrSeqnoIat(toNumber(null));
							warningMessage(GNls.Fget(toStr("GXADIRD-0053"), toStr("FORM"), toStr("*WARNING* The address selected may not be the address actually used as the IAT Override with payroll processing if a newer address exists.")));
						}
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GXRDIRD_ATYP_CODE_IAT.WHEN-VALIDATE-ITEM
		 DECLARE
 HOLD_VALUE VARCHAR2(1);
 CURSOR CHK_ADDR_SEQNO IS
  SELECT 'Y' FROM SPRADDR
  WHERE SPRADDR_PIDM=:PIDM
  AND (SPRADDR_ATYP_CODE=:GXRDIRD_ATYP_CODE_IAT
  OR :GXRDIRD_ATYP_CODE_IAT IS NULL);
BEGIN
	IF :GXRDIRD_ATYP_CODE_IAT IS NULL THEN
		:GXRDIRD_ADDR_SEQNO_IAT := NULL;
		IF :HOLD_SECURITY='N' THEN
			SET_ITEM_INSTANCE_PROPERTY('GXRDIRD_ADDR_SEQNO_IAT',CURRENT_RECORD,UPDATE_ALLOWED,PROPERTY_OFF);
			SET_ITEM_INSTANCE_PROPERTY('GXRDIRD_ADDR_SEQNO_IAT',CURRENT_RECORD,INSERT_ALLOWED,PROPERTY_OFF);
		ELSE
			SET_ITEM_INSTANCE_PROPERTY('GXRDIRD_ADDR_SEQNO_IAT',CURRENT_RECORD,NAVIGABLE,PROPERTY_ON);
			SET_ITEM_INSTANCE_PROPERTY('GXRDIRD_ADDR_SEQNO_IAT',CURRENT_RECORD,UPDATE_ALLOWED,PROPERTY_ON);
			SET_ITEM_INSTANCE_PROPERTY('GXRDIRD_ADDR_SEQNO_IAT',CURRENT_RECORD,INSERT_ALLOWED,PROPERTY_ON);
		END IF;
	ELSE
		OPEN CHK_ADDR_SEQNO;
		FETCH CHK_ADDR_SEQNO INTO HOLD_VALUE;
		IF CHK_ADDR_SEQNO%NOTFOUND AND :GXRDIRD_ATYP_CODE_IAT IS NOT NULL THEN
		  MESSAGE( G$_NLS.Get('GXADIRD-0054', 'FORM','Address Type is invalid. Press LIST for valid choices.') );
		  CLOSE CHK_ADDR_SEQNO;
		  RAISE FORM_TRIGGER_FAILURE;
		END IF;
		CLOSE CHK_ADDR_SEQNO;
		SET_ITEM_INSTANCE_PROPERTY('GXRDIRD_ADDR_SEQNO_IAT',CURRENT_RECORD,NAVIGABLE,PROPERTY_ON);
		SET_ITEM_INSTANCE_PROPERTY('GXRDIRD_ADDR_SEQNO_IAT',CURRENT_RECORD,UPDATE_ALLOWED,PROPERTY_ON);
		SET_ITEM_INSTANCE_PROPERTY('GXRDIRD_ADDR_SEQNO_IAT',CURRENT_RECORD,INSERT_ALLOWED,PROPERTY_ON);
	END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD_ATYP_CODE_IAT.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="GXRDIRD_ATYP_CODE_IAT")
		public void gxrdirdAtypCodeIat_validate()
		{
				GxrdirdAdapter gxrdirdElement = (GxrdirdAdapter)this.getFormModel().getGxrdird().getRowAdapter(true);
				if(gxrdirdElement ==null)
					return;

				int rowCount = 0;
				{
					NString holdValue= NString.getNull();
					String sqlchkAddrSeqno = "SELECT 'Y' " +
	" FROM SPRADDR " +
	" WHERE SPRADDR_PIDM = :PIDM AND (SPRADDR_ATYP_CODE = :GXRDIRD_ATYP_CODE_IAT OR :GXRDIRD_ATYP_CODE_IAT IS NULL) ";
					DataCursor chkAddrSeqno = new DataCursor(sqlchkAddrSeqno);
					try {
						if ( gxrdirdElement.getGxrdirdAtypCodeIat().isNull() )
						{
							gxrdirdElement.setGxrdirdAddrSeqnoIat(toNumber(null));
							if ( getFormModel().getFormHeader().getHoldSecurity().equals("N") )
							{
								setItemUpdateAllowed("GXRDIRD_ADDR_SEQNO_IAT", ItemServices.CURRENT_RECORD, false);
								setItemInsertAllowed("GXRDIRD_ADDR_SEQNO_IAT", ItemServices.CURRENT_RECORD, false);
							}
							else {
								setItemEnabled("GXRDIRD_ADDR_SEQNO_IAT", ItemServices.CURRENT_RECORD, true);
								setItemUpdateAllowed("GXRDIRD_ADDR_SEQNO_IAT", ItemServices.CURRENT_RECORD, true);
								setItemInsertAllowed("GXRDIRD_ADDR_SEQNO_IAT", ItemServices.CURRENT_RECORD, true);
							}
						}
						else {
							chkAddrSeqno.addParameter("PIDM", getFormModel().getKeyBlock().getPidm());
							chkAddrSeqno.addParameter("GXRDIRD_ATYP_CODE_IAT", gxrdirdElement.getGxrdirdAtypCodeIat());
							chkAddrSeqno.open();
							ResultSet chkAddrSeqnoResults = chkAddrSeqno.fetchInto();
							if ( chkAddrSeqnoResults != null ) {
								holdValue = chkAddrSeqnoResults.getStr(0);
							}
							if ( chkAddrSeqno.notFound() && !gxrdirdElement.getGxrdirdAtypCodeIat().isNull() )
							{
								errorMessage(GNls.Fget(toStr("GXADIRD-0054"), toStr("FORM"), toStr("*ERROR* Address Type is invalid. Press LIST for valid choices.")));
								chkAddrSeqno.close();
								throw new ApplicationException();
							}
							setItemEnabled("GXRDIRD_ADDR_SEQNO_IAT", ItemServices.CURRENT_RECORD, true);
							setItemUpdateAllowed("GXRDIRD_ADDR_SEQNO_IAT", ItemServices.CURRENT_RECORD, true);
							setItemInsertAllowed("GXRDIRD_ADDR_SEQNO_IAT", ItemServices.CURRENT_RECORD, true);
						}
					}
					finally{
						chkAddrSeqno.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GXRDIRD_ADDR_SEQNO_IAT.WHEN-VALIDATE-ITEM
		 DECLARE
 HOLD_VALUE VARCHAR2(1);
 CURSOR CHK_ADDR_SEQNO IS
  SELECT 'Y' FROM SPRADDR
  WHERE SPRADDR_PIDM=:PIDM
  AND SPRADDR_ATYP_CODE=:GXRDIRD_ATYP_CODE_IAT
  AND SPRADDR_SEQNO=:GXRDIRD_ADDR_SEQNO_IAT;
BEGIN
 
	IF :GXRDIRD_ATYP_CODE_IAT IS NOT NULL AND :GXRDIRD_ADDR_SEQNO_IAT IS NOT NULL THEN
		OPEN CHK_ADDR_SEQNO;
	 	FETCH CHK_ADDR_SEQNO INTO HOLD_VALUE;
	 	IF CHK_ADDR_SEQNO%NOTFOUND THEN
	    MESSAGE( G$_NLS.Get('GXADIRD-0055', 'FORM','Address Information is invalid. Press LIST for valid choices.') );
	    CLOSE CHK_ADDR_SEQNO;
	    RAISE FORM_TRIGGER_FAILURE;
	 	END IF;
	 	CLOSE CHK_ADDR_SEQNO;
	END IF;

END;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD_ADDR_SEQNO_IAT.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="GXRDIRD_ADDR_SEQNO_IAT")
		public void gxrdirdAddrSeqnoIat_validate()
		{
				GxrdirdAdapter gxrdirdElement = (GxrdirdAdapter)this.getFormModel().getGxrdird().getRowAdapter(true);
				if(gxrdirdElement ==null)
					return;

				int rowCount = 0;
				{
					NString holdValue= NString.getNull();
					String sqlchkAddrSeqno = "SELECT 'Y' " +
	" FROM SPRADDR " +
	" WHERE SPRADDR_PIDM = :PIDM AND SPRADDR_ATYP_CODE = :GXRDIRD_ATYP_CODE_IAT AND SPRADDR_SEQNO = :GXRDIRD_ADDR_SEQNO_IAT ";
					DataCursor chkAddrSeqno = new DataCursor(sqlchkAddrSeqno);
					try {
						if ( !gxrdirdElement.getGxrdirdAtypCodeIat().isNull() && !gxrdirdElement.getGxrdirdAddrSeqnoIat().isNull() )
						{
							chkAddrSeqno.addParameter("PIDM", getFormModel().getKeyBlock().getPidm());
							chkAddrSeqno.addParameter("GXRDIRD_ATYP_CODE_IAT", gxrdirdElement.getGxrdirdAtypCodeIat());
							chkAddrSeqno.addParameter("GXRDIRD_ADDR_SEQNO_IAT", gxrdirdElement.getGxrdirdAddrSeqnoIat());
							chkAddrSeqno.open();
							ResultSet chkAddrSeqnoResults = chkAddrSeqno.fetchInto();
							if ( chkAddrSeqnoResults != null ) {
								holdValue = chkAddrSeqnoResults.getStr(0);
							}
							if ( chkAddrSeqno.notFound() )
							{
								errorMessage(GNls.Fget(toStr("GXADIRD-0055"), toStr("FORM"), toStr("*ERROR* Address Information is invalid. Press LIST for valid choices.")));
								chkAddrSeqno.close();
								throw new ApplicationException();
							}
						}
					}
					finally{
						chkAddrSeqno.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GXRDIRD_DOC_TYPE.POST-CHANGE
		  <multilinecomment>  IF :GXRDIRD_DOC_TYPE = 'C' THEN
      :DOC_TYPE := 'Check';
   END IF;
   IF :GXRDIRD_DOC_TYPE = 'D' THEN
      :DOC_TYPE := 'Direct Deposit';
   END IF;
</multilinecomment>
NULL;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD_DOC_TYPE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="GXRDIRD_DOC_TYPE")
		public void gxrdirdDocType_PostChange()
		{
				GxrdirdAdapter gxrdirdElement = (GxrdirdAdapter)this.getFormModel().getGxrdird().getRowAdapter(true);
				if(gxrdirdElement ==null)
					return;

				if(gxrdirdElement.getGxrdirdDocType().isNull())
		return;
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD_BANK_ROUT_NUM_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="GXRDIRD_BANK_ROUT_NUM_LBT")
		public void gxrdirdBankRoutNumLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD_ATYP_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="GXRDIRD_ATYP_CODE_LBT")
		public void gxrdirdAtypCodeLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD_SCOD_CODE_ISO_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="GXRDIRD_SCOD_CODE_ISO_LBT")
		public void gxrdirdScodCodeIsoLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD_ACHT_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="GXRDIRD_ACHT_CODE_LBT")
		public void gxrdirdAchtCodeLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD_ATYP_CODE_IAT_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="GXRDIRD_ATYP_CODE_IAT_LBT")
		public void gxrdirdAtypCodeIatLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD_BANK_ROUT_NUM.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="GXRDIRD_BANK_ROUT_NUM")
		public void gxrdirdBankRoutNum_validate()
		{
			
				GxrdirdAdapter gxrdirdElement = (GxrdirdAdapter)this.getFormModel().getGxrdird().getRowAdapter(true);
							this.gxrdirdBankRoutNum_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD_ACCT_TYPE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="GXRDIRD_ACCT_TYPE")
		public void gxrdirdAcctType_validate()
		{
			
				GxrdirdAdapter gxrdirdElement = (GxrdirdAdapter)this.getFormModel().getGxrdird().getRowAdapter(true);
							this.gxrdirdAcctType_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD_AMOUNT.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="GXRDIRD_AMOUNT")
		public void gxrdirdAmount_validate()
		{
			
				GxrdirdAdapter gxrdirdElement = (GxrdirdAdapter)this.getFormModel().getGxrdird().getRowAdapter(true);
							this.gxrdirdAmount_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD_PERCENT.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="GXRDIRD_PERCENT")
		public void gxrdirdPercent_validate()
		{
			
				GxrdirdAdapter gxrdirdElement = (GxrdirdAdapter)this.getFormModel().getGxrdird().getRowAdapter(true);
							this.gxrdirdPercent_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD_ACHT_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="GXRDIRD_ACHT_CODE")
		public void gxrdirdAchtCode_validate()
		{
			
				GxrdirdAdapter gxrdirdElement = (GxrdirdAdapter)this.getFormModel().getGxrdird().getRowAdapter(true);
							this.gxrdirdAchtCode_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXRDIRD_DOC_TYPE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="GXRDIRD_DOC_TYPE")
		public void gxrdirdDocType_validate()
		{
			
				GxrdirdAdapter gxrdirdElement = (GxrdirdAdapter)this.getFormModel().getGxrdird().getRowAdapter(true);
							this.gxrdirdDocType_PostChange();

			}

		
	
	
}

