package net.hedtech.banner.general.common.Goaintl.controller;
 
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
import net.hedtech.banner.general.common.Goaintl.model.*;
import net.hedtech.banner.general.common.Goaintl.*;
import net.hedtech.banner.general.common.Goaintl.services.*;
import net.hedtech.general.common.libraries.Goqolib.services.GDateClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GCodeClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GDescClass;	
		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class GobintlController extends DefaultBlockController {

	private GDateClass getGDateClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GDateClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_DATE_CLASS");
	}	
	private GCodeClass getGCodeClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GCodeClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_CODE_CLASS");
	}	
	private GDescClass getGDescClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GDescClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_DESC_CLASS");
	}	

	
	public GobintlController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
		
	@Override
	public GoaintlTask getTask() {
		return (GoaintlTask)super.getTask();
	}

	public GoaintlModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
		/* Original PL/SQL code code for TRIGGER GOBINTL.KEY-NXTREC
		    EXECUTE_TRIGGER('INVALID_FUNCTION_MSG');
   G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL.KEY-NXTREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void gobintl_NextRecord()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		@BeforeQuery

		public void gobintl_BeforeQuery(QueryEvent args)
		{
			setBlockWhereClause("GOBINTL", toStr("(GOBINTL_PIDM=:PIDM)"));
			
			((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("PIDM", this.getFormModel().getKeyBlock().getPidm()));
		}
		
		/* Original PL/SQL code code for TRIGGER GOBINTL.PRE-UPDATE
		 :gobintl_user_id := user;
:gobintl_activity_date := sysdate;

if :gobintl_passport_id is not null and :gobintl_natn_code_issue is null then
    message( G$_NLS.Get('GOAINTL-0100', 'FORM','Nation of Issue is required.') );
    RAISE FORM_TRIGGER_FAILURE;
end if;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL.PRE-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowUpdate
		public void gobintl_BeforeRowUpdate(RowAdapterEvent args)
		{
			
				GobintlAdapter gobintlElement = (GobintlAdapter)args.getRow();


				gobintlElement.setGobintlUserId(getUser());
				gobintlElement.setGobintlActivityDate(NDate.getNow());
				if ( !gobintlElement.getGobintlPassportId().isNull() && gobintlElement.getGobintlNatnCodeIssue().isNull() )
				{
					errorMessage(GNls.Fget(toStr("GOAINTL-0100"), toStr("FORM"), toStr("*ERROR* Nation of Issue is required.")));
					throw new ApplicationException();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL.PRE-INSERT
		 :gobintl_user_id := user;
:gobintl_activity_date := sysdate;

if :gobintl_passport_id is not null and :gobintl_natn_code_issue is null then
    message( G$_NLS.Get('GOAINTL-0101', 'FORM','Nation of Issue is required.') );
    RAISE FORM_TRIGGER_FAILURE;
end if;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowInsert
		public void gobintl_BeforeRowInsert(RowAdapterEvent args)
		{
			
				GobintlAdapter gobintlElement = (GobintlAdapter)args.getRow();


				gobintlElement.setGobintlUserId(getUser());
				gobintlElement.setGobintlActivityDate(NDate.getNow());
				if ( !gobintlElement.getGobintlPassportId().isNull() && gobintlElement.getGobintlNatnCodeIssue().isNull() )
				{
					errorMessage(GNls.Fget(toStr("GOAINTL-0101"), toStr("FORM"), toStr("*ERROR* Nation of Issue is required.")));
					throw new ApplicationException();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL.KEY-CREREC
		 BEGIN
   DECLARE
   	  tmp char(2) := '';
      CURSOR PTI_CURSOR IS
         SELECT 'X'
         FROM   GOBINTL
         WHERE  GOBINTL_PIDM = :PIDM;
   BEGIN
      OPEN PTI_CURSOR;
      FETCH PTI_CURSOR INTO tmp;
      G$_CHECK_VALUE(tmp is not null, G$_NLS.Get('GOAINTL-0102', 'FORM','Record Already Exists for the Person, No New Record is Allowed.') , TRUE);
      create_record;
   END;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL.KEY-CREREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CREREC", function=KeyFunction.CREATE_RECORD)
		public void gobintl_CreateRecord()
		{
			
				int rowCount = 0;
				{
					NString tmp = toStr("");
					String sqlptiCursor = "SELECT 'X' " +
	" FROM GOBINTL " +
	" WHERE GOBINTL_PIDM = :PIDM ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//Setting query parameters
						ptiCursor.addParameter("PIDM", getFormModel().getKeyBlock().getPidm());
						
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							tmp = ptiCursorResults.getStr(0);
						}
						getTask().getGoqrpls().gCheckValue(toBool(!tmp.isNull()), GNls.Fget(toStr("GOAINTL-0102"), toStr("FORM"), toStr("Record Already Exists for the Person, No New Record is Allowed.")), toBool(NBool.True));
						createRecord();
					}
					finally{
						ptiCursor.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL.POST-BLOCK
		 :previous_block := '';
if :system.block_status = 'CHANGED' then
	 :previous_block := 'GOBINTL';
end if;
set_item_property('GOBINTL_NATN_CODE_ISSUE',REQUIRED,PROPERTY_FALSE);	

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL.POST-BLOCK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-BLOCK", function=KeyFunction.BLOCK_OUT)
		public void gobintl_blockOut()
		{
			
				getFormModel().getFormHeader().setPreviousBlock(toStr(""));
				if ( getBlockStatus().equals("CHANGED") )
				{
					getFormModel().getFormHeader().setPreviousBlock(toStr("GOBINTL"));
				}
				setItemRequired("GOBINTL_NATN_CODE_ISSUE", false);
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL.POST-QUERY
		 set_item_property('GOBINTL_NATN_CODE_ISSUE',REQUIRED,PROPERTY_FALSE);	
if :gobintl_passport_id is not null then
	  set_item_property('GOBINTL_NATN_CODE_ISSUE',REQUIRED,PROPERTY_TRUE);
else
	  set_item_property('GOBINTL_NATN_CODE_ISSUE',REQUIRED,PROPERTY_FALSE);	
end if;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
	public void gobintl_AfterQuery(RowAdapterEvent args) {

		GobintlAdapter gobintlElement = (GobintlAdapter) args.getRow();

		try {
			gobintlElement.setLockDbValues(true);
                         try {  
                        this.gobintlPassportId_PostChange(); 
                        } catch(Exception ex) { 
                        } 
                         try {  
                        this.gobintlNatnCodeIssue_PostChange(); 
                        } catch(Exception ex) { 
                        } 
                         try {  
                        this.gobintlCelgCode_PostChange(); 
                        } catch(Exception ex) { 
                        } 
                         try {  
                        this.gobintlAdmrCode_PostChange(); 
                        } catch(Exception ex) { 
                        } 
                         try {  
                        this.gobintlNatnCodeBirth_PostChange(); 
                        } catch(Exception ex) { 
                        } 
                         try {  
                        this.gobintlNatnCodeLegal_PostChange(); 
                        } catch(Exception ex) { 
                        } 
                         try {  
                        this.gobintlLangCode_PostChange(); 
                        } catch(Exception ex) { 
                        } 
                         try {  
                        this.gobintlSponCode_PostChange(); 
                        } catch(Exception ex) { 
                        } 
                         try {  
                        this.gobintlEmptCode_PostChange(); 
                        } catch(Exception ex) { 
                        } 

//[DELETE] 
//[DELETE] 
//[DELETE] 
//[DELETE] 
//[DELETE] 
//[DELETE] 
//[DELETE] 
//[DELETE] 
//[DELETE] 

		} finally {
			gobintlElement.setLockDbValues(false);
		}
		setItemRequired("GOBINTL_NATN_CODE_ISSUE", false);
		if (!gobintlElement.getGobintlPassportId().isNull()) {
			setItemRequired("GOBINTL_NATN_CODE_ISSUE", true);
		} else {
			setItemRequired("GOBINTL_NATN_CODE_ISSUE", false);
		}
	}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL.POST-UPDATE
		 if :global.STUSYS = 'Y' and :gobintl_cert_date_receipt is not null 
	  and :gobintl_admr_code is not null
then
	 UPD_CHKL_DATE(:gobintl_pidm);
	 UPD_APP_STATUS(:gobintl_pidm);
end if;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL.POST-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterRowUpdate
		public void gobintl_AfterRowUpdate(RowAdapterEvent args)
		{
			
				GobintlAdapter gobintlElement = (GobintlAdapter)args.getRow();


				if ( getGlobal("STUSYS").equals("Y") && !gobintlElement.getGobintlCertDateReceipt().isNull() && !gobintlElement.getGobintlAdmrCode().isNull() )
				{
					this.getTask().getServices().updChklDate(gobintlElement.getGobintlPidm());
					this.getTask().getServices().updAppStatus(gobintlElement.getGobintlPidm());
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL.POST-INSERT
		 if :global.STUSYS = 'Y' and :gobintl_cert_date_receipt is not null 
	  and :gobintl_admr_code is not null
then
	 UPD_CHKL_DATE(:gobintl_pidm);
	 UPD_APP_STATUS(:gobintl_pidm);
NULL;
end if;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL.POST-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterRowInsert
		public void gobintl_AfterRowInsert(RowAdapterEvent args)
		{
			
				GobintlAdapter gobintlElement = (GobintlAdapter)args.getRow();


				if ( getGlobal("STUSYS").equals("Y") && !gobintlElement.getGobintlCertDateReceipt().isNull() && !gobintlElement.getGobintlAdmrCode().isNull() )
				{
					this.getTask().getServices().updChklDate(gobintlElement.getGobintlPidm());
					this.getTask().getServices().updAppStatus(gobintlElement.getGobintlPidm());
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL.DELETE_GOBINTL
		 delete_record;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL.DELETE_GOBINTL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="DELETE_GOBINTL")
		public void gobintl_DeleteGobintl()
		{
			
				deleteRecord();
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL.DELETE_PASSPORT
		 
IF ( :GOBINTL_CELG_CODE IS NOT NULL OR
 :GOBINTL_CERT_NUMBER IS NOT NULL OR
 :GOBINTL_CERT_DATE_ISSUE IS NOT NULL OR
 :GOBINTL_CERT_DATE_RECEIPT IS NOT NULL OR
 :GOBINTL_ADMR_CODE IS NOT NULL OR
 :GOBINTL_NATN_CODE_BIRTH IS NOT NULL OR
 :GOBINTL_NATN_CODE_LEGAL IS NOT NULL OR
 :GOBINTL_LANG_CODE IS NOT NULL OR
 :GOBINTL_SPON_CODE IS NOT NULL OR
 :GOBINTL_EMPT_CODE IS NOT NULL OR
 :GOBINTL_FOREIGN_SSN IS NOT NULL OR
  :GOBINTL_CHILD_NUMBER IS NOT NULL 
 )
THEN
:GOBINTL_PASSPORT_ID := '';
:GOBINTL_NATN_CODE_ISSUE := '';
:GOBINTL.ISSUE_NATN_DESC := '';
:GOBINTL_PASSPORT_EXP_DATE := '';
:GOBINTL_I94_STATUS := '';
:GOBINTL_I94_DATE := '';
:GOBINTL_REG_NUMBER := '';
:GOBINTL_DURATION := 'N';
set_item_property('GOBINTL_NATN_CODE_ISSUE',REQUIRED,PROPERTY_FALSE);
ELSE
EXECUTE_TRIGGER('DELETE_GOBINTL');
--message('Can delete the record from table');
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL.DELETE_PASSPORT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="DELETE_PASSPORT")
		public void gobintl_DeletePassport()
		{
				GobintlAdapter gobintlElement = (GobintlAdapter)this.getFormModel().getGobintl().getRowAdapter(true);
				if(gobintlElement != null)
				{
					if ((!gobintlElement.getGobintlCelgCode().isNull() || !gobintlElement.getGobintlCertNumber().isNull() || !gobintlElement.getGobintlCertDateIssue().isNull() || !gobintlElement.getGobintlCertDateReceipt().isNull() || !gobintlElement.getGobintlAdmrCode().isNull() || !gobintlElement.getGobintlNatnCodeBirth().isNull() || !gobintlElement.getGobintlNatnCodeLegal().isNull() || !gobintlElement.getGobintlLangCode().isNull() || !gobintlElement.getGobintlSponCode().isNull() || !gobintlElement.getGobintlEmptCode().isNull() || !gobintlElement.getGobintlForeignSsn().isNull() || !gobintlElement.getGobintlChildNumber().isNull()))
					{
						gobintlElement.setGobintlPassportId(toStr(""));
						gobintlElement.setGobintlNatnCodeIssue(toStr(""));
						gobintlElement.setIssueNatnDesc(toStr(""));
						gobintlElement.setGobintlPassportExpDate(toDate(""));
						gobintlElement.setGobintlI94Status(toStr(""));
						gobintlElement.setGobintlI94Date(toDate(""));
						gobintlElement.setGobintlRegNumber(toStr(""));
						gobintlElement.setGobintlDuration(toStr("N"));
						setItemRequired("GOBINTL_NATN_CODE_ISSUE", false);
					}
					else {
						executeAction("DELETE_GOBINTL");
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL.DELETE_NATIONALITY
		 IF (:GOBINTL_CELG_CODE  IS NOT NULL OR
 :GOBINTL_CERT_NUMBER  IS NOT NULL OR
 :GOBINTL_CERT_DATE_ISSUE  IS NOT NULL OR
 :GOBINTL_CERT_DATE_RECEIPT  IS NOT NULL OR
 :GOBINTL_ADMR_CODE IS NOT NULL  OR
 :GOBINTL_PASSPORT_ID  IS NOT NULL OR
 :GOBINTL_NATN_CODE_ISSUE  IS NOT NULL OR
 :GOBINTL_PASSPORT_EXP_DATE  IS NOT NULL OR
 :GOBINTL_I94_STATUS  IS NOT NULL OR
 :GOBINTL_I94_DATE  IS NOT NULL OR
 :GOBINTL_REG_NUMBER  IS NOT NULL) 
THEN
:GOBINTL_NATN_CODE_BIRTH := '';
:BIRTH_NATN_DESC := '';
:GOBINTL_NATN_CODE_LEGAL := '';
:LEGAL_NATN_DESC := '';
:GOBINTL_LANG_CODE := '';
:LANG_DESC := '';
:GOBINTL_SPON_CODE := '';
:SPON_DESC := '';
:GOBINTL_EMPT_CODE := '';
:EMPT_DESC := '';
:GOBINTL_FOREIGN_SSN := '';
:GOBINTL_SPOUSE_IND := 'T';
:GOBINTL_CHILD_NUMBER := '';
:GOBINTL_SIGNATURE_IND := 'T';
ELSE
EXECUTE_TRIGGER('DELETE_GOBINTL') ;
--message('Can delete the record from table') ;

END IF;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL.DELETE_NATIONALITY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="DELETE_NATIONALITY")
		public void gobintl_DeleteNationality()
		{
				GobintlAdapter gobintlElement = (GobintlAdapter)this.getFormModel().getGobintl().getRowAdapter(true);
				if(gobintlElement != null)
				{
					if ((!gobintlElement.getGobintlCelgCode().isNull() || !gobintlElement.getGobintlCertNumber().isNull() || !gobintlElement.getGobintlCertDateIssue().isNull() || !gobintlElement.getGobintlCertDateReceipt().isNull() || !gobintlElement.getGobintlAdmrCode().isNull() || !gobintlElement.getGobintlPassportId().isNull() || !gobintlElement.getGobintlNatnCodeIssue().isNull() || !gobintlElement.getGobintlPassportExpDate().isNull() || !gobintlElement.getGobintlI94Status().isNull() || !gobintlElement.getGobintlI94Date().isNull() || !gobintlElement.getGobintlRegNumber().isNull()))
					{
						gobintlElement.setGobintlNatnCodeBirth(toStr(""));
						gobintlElement.setBirthNatnDesc(toStr(""));
						gobintlElement.setGobintlNatnCodeLegal(toStr(""));
						gobintlElement.setLegalNatnDesc(toStr(""));
						gobintlElement.setGobintlLangCode(toStr(""));
						gobintlElement.setLangDesc(toStr(""));
						gobintlElement.setGobintlSponCode(toStr(""));
						gobintlElement.setSponDesc(toStr(""));
						gobintlElement.setGobintlEmptCode(toStr(""));
						gobintlElement.setEmptDesc(toStr(""));
						gobintlElement.setGobintlForeignSsn(toStr(""));
						gobintlElement.setGobintlSpouseInd(toStr("T"));
						gobintlElement.setGobintlChildNumber(toNumber(""));
						gobintlElement.setGobintlSignatureInd(toStr("T"));
					}
					else {
						executeAction("DELETE_GOBINTL");
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL.DELETE_CERTIFICATE
		 IF(:GOBINTL_NATN_CODE_BIRTH  IS  NOT NULL OR
 :GOBINTL_NATN_CODE_LEGAL  IS NOT NULL OR
 :GOBINTL_LANG_CODE  IS NOT NULL OR
 :GOBINTL_SPON_CODE  IS NOT NULL OR
 :GOBINTL_EMPT_CODE  IS NOT NULL OR
 :GOBINTL_FOREIGN_SSN  IS NOT NULL OR
 :GOBINTL_CHILD_NUMBER  IS NOT NULL OR
 :GOBINTL_PASSPORT_ID  IS NOT NULL OR
 :GOBINTL_NATN_CODE_ISSUE  IS NOT NULL OR
 :GOBINTL_PASSPORT_EXP_DATE  IS NOT NULL OR
 :GOBINTL_I94_STATUS  IS NOT NULL OR
 :GOBINTL_I94_DATE  IS NOT NULL OR
 :GOBINTL_REG_NUMBER  IS NOT NULL)  
THEN

:GOBINTL_CELG_CODE := '';
:CELG_DESC := '';
:GOBINTL_CERT_NUMBER := '';
:GOBINTL_CERT_DATE_ISSUE := '';
:GOBINTL_CERT_DATE_RECEIPT := '';
:GOBINTL_ADMR_CODE := '';
:ADMR_DESC := '';

ELSE

EXECUTE_TRIGGER('DELETE_GOBINTL') ;
--message('Can delete the record from table' );

END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL.DELETE_CERTIFICATE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="DELETE_CERTIFICATE")
		public void gobintl_DeleteCertificate()
		{
				GobintlAdapter gobintlElement = (GobintlAdapter)this.getFormModel().getGobintl().getRowAdapter(true);
				if(gobintlElement != null)
				{
					if ((!gobintlElement.getGobintlNatnCodeBirth().isNull() || !gobintlElement.getGobintlNatnCodeLegal().isNull() || !gobintlElement.getGobintlLangCode().isNull() || !gobintlElement.getGobintlSponCode().isNull() || !gobintlElement.getGobintlEmptCode().isNull() || !gobintlElement.getGobintlForeignSsn().isNull() || !gobintlElement.getGobintlChildNumber().isNull() || !gobintlElement.getGobintlPassportId().isNull() || !gobintlElement.getGobintlNatnCodeIssue().isNull() || !gobintlElement.getGobintlPassportExpDate().isNull() || !gobintlElement.getGobintlI94Status().isNull() || !gobintlElement.getGobintlI94Date().isNull() || !gobintlElement.getGobintlRegNumber().isNull()))
					{
						gobintlElement.setGobintlCelgCode(toStr(""));
						gobintlElement.setCelgDesc(toStr(""));
						gobintlElement.setGobintlCertNumber(toStr(""));
						gobintlElement.setGobintlCertDateIssue(toDate(""));
						gobintlElement.setGobintlCertDateReceipt(toDate(""));
						gobintlElement.setGobintlAdmrCode(toStr(""));
						gobintlElement.setAdmrDesc(toStr(""));
					}
					else {
						executeAction("DELETE_GOBINTL");
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_PASSPORT_ID.KEY-PRVBLK
		 if :system.block_status = 'CHANGED' then
	  message( G$_NLS.Get('GOAINTL-0103', 'FORM','Please Save Information before Leaving Current Block.') );
	  raise form_trigger_failure;
end if;
--
go_block('gordocm');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_PASSPORT_ID.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", item="GOBINTL_PASSPORT_ID", function=KeyFunction.PREVIOUS_BLOCK)
		public void gobintlPassportId_PreviousBlock()
		{
			
				if ( getBlockStatus().equals("CHANGED") )
				{
					errorMessage(GNls.Fget(toStr("GOAINTL-0103"), toStr("FORM"), toStr("*ERROR* Please Save Information before Leaving Current Block.")));
					throw new ApplicationException();
				}
				// 
				goBlock(toStr("gordocm"));
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_PASSPORT_ID.KEY-NXTBLK
		 if :system.block_status = 'CHANGED' then
    message( G$_NLS.Get('GOAINTL-0104', 'FORM','Please Save Information before Leaving Current Block.') );
	  raise form_trigger_failure;
end if;
--
GO_ITEM('GOBINTL_CELG_CODE');
g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_PASSPORT_ID.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", item="GOBINTL_PASSPORT_ID", function=KeyFunction.NEXT_BLOCK)
		public void gobintlPassportId_NextBlock()
		{
			
				if ( getBlockStatus().equals("CHANGED") )
				{
					errorMessage(GNls.Fget(toStr("GOAINTL-0104"), toStr("FORM"), toStr("*ERROR* Please Save Information before Leaving Current Block.")));
					throw new ApplicationException();
				}
				// 
				goItem(toStr("GOBINTL_CELG_CODE"));
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_PASSPORT_ID.KEY-PREV-ITEM
		 go_item('GOBINTL_DURATION');
g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_PASSPORT_ID.KEY-PREV-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PREV-ITEM", item="GOBINTL_PASSPORT_ID", function=KeyFunction.PREVIOUS_ITEM)
		public void gobintlPassportId_PreviousItem()
		{
			
				goItem(toStr("GOBINTL_DURATION"));
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_PASSPORT_ID.POST-CHANGE
		 set_item_property('GOBINTL_NATN_CODE_ISSUE',REQUIRED,PROPERTY_FALSE);	
if :gobintl_passport_id is not null then
	  set_item_property('GOBINTL_NATN_CODE_ISSUE',REQUIRED,PROPERTY_TRUE);
else
	  set_item_property('GOBINTL_NATN_CODE_ISSUE',REQUIRED,PROPERTY_FALSE);	
end if;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_PASSPORT_ID.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="GOBINTL_PASSPORT_ID")
		public void gobintlPassportId_PostChange()
		{
				GobintlAdapter gobintlElement = (GobintlAdapter)this.getFormModel().getGobintl().getRowAdapter(true);
				if(gobintlElement != null)
				{
					if(gobintlElement.getGobintlPassportId().isNull())
						return;
					setItemRequired("GOBINTL_NATN_CODE_ISSUE", false);
					if ( !gobintlElement.getGobintlPassportId().isNull() )
					{
						setItemRequired("GOBINTL_NATN_CODE_ISSUE", true);
					}
					else {
						setItemRequired("GOBINTL_NATN_CODE_ISSUE", false);
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_PASSPORT_ID.KEY-DELREC
		 EXECUTE_TRIGGER('DELETE_PASSPORT');

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_PASSPORT_ID.KEY-DELREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DELREC", item="GOBINTL_PASSPORT_ID", function=KeyFunction.DELETE_RECORD)
		public void gobintlPassportId_DeleteRecord()
		{
			
				executeAction("DELETE_PASSPORT");
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_PASSPORT_ID.KEY-CLRREC
		 :GOBINTL_PASSPORT_ID := '';
:GOBINTL_NATN_CODE_ISSUE := '';
:GOBINTL.ISSUE_NATN_DESC := '';
:GOBINTL_PASSPORT_EXP_DATE := '';
:GOBINTL_I94_STATUS := '';
:GOBINTL_I94_DATE := '';
:GOBINTL_REG_NUMBER := '';
:GOBINTL_DURATION := 'N';
set_item_property('GOBINTL_NATN_CODE_ISSUE',REQUIRED,PROPERTY_FALSE);	

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_PASSPORT_ID.KEY-CLRREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRREC", item="GOBINTL_PASSPORT_ID", function=KeyFunction.CLEAR_RECORD)
		public void gobintlPassportId_ClearRecord()
		{
				GobintlAdapter gobintlElement = (GobintlAdapter)this.getFormModel().getGobintl().getRowAdapter(true);
				if(gobintlElement != null)
				{
					gobintlElement.setGobintlPassportId(toStr(""));
					gobintlElement.setGobintlNatnCodeIssue(toStr(""));
					gobintlElement.setIssueNatnDesc(toStr(""));
					gobintlElement.setGobintlPassportExpDate(toDate(""));
					gobintlElement.setGobintlI94Status(toStr(""));
					gobintlElement.setGobintlI94Date(toDate(""));
					gobintlElement.setGobintlRegNumber(toStr(""));
					gobintlElement.setGobintlDuration(toStr("N"));
					setItemRequired("GOBINTL_NATN_CODE_ISSUE", false);
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_PASSPORT_ID.KEY-CLRBLK
		 :GOBINTL_PASSPORT_ID := '';
:GOBINTL_NATN_CODE_ISSUE := '';
:GOBINTL.ISSUE_NATN_DESC := '';
:GOBINTL_PASSPORT_EXP_DATE := '';
:GOBINTL_I94_STATUS := '';
:GOBINTL_I94_DATE := '';
:GOBINTL_REG_NUMBER := '';
:GOBINTL_DURATION := 'N';
set_item_property('GOBINTL_NATN_CODE_ISSUE',REQUIRED,PROPERTY_FALSE);	

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_PASSPORT_ID.KEY-CLRBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRBLK", item="GOBINTL_PASSPORT_ID", function=KeyFunction.CLEAR_BLOCK)
		public void gobintlPassportId_keyClearBlock()
		{
				GobintlAdapter gobintlElement = (GobintlAdapter)this.getFormModel().getGobintl().getRowAdapter(true);
				if(gobintlElement !=null)
				{
					gobintlElement.setGobintlPassportId(toStr(""));
					gobintlElement.setGobintlNatnCodeIssue(toStr(""));
					gobintlElement.setIssueNatnDesc(toStr(""));
					gobintlElement.setGobintlPassportExpDate(toDate(""));
					gobintlElement.setGobintlI94Status(toStr(""));
					gobintlElement.setGobintlI94Date(toDate(""));
					gobintlElement.setGobintlRegNumber(toStr(""));
					gobintlElement.setGobintlDuration(toStr("N"));
					setItemRequired("GOBINTL_NATN_CODE_ISSUE", false);
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_NATN_CODE_ISSUE.G$_SEARCH_PARAMETERS
		 G$_Search.Parameters('STVNATN_CODE','STVNATN_NATION','');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_NATN_CODE_ISSUE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="GOBINTL_NATN_CODE_ISSUE")
		public void gobintlNatnCodeIssue_GSearchParameters()
		{
			
				getTask().getGoqrpls().getGSearch().parameters(toStr("STVNATN_CODE"), toStr("STVNATN_NATION"), toStr(""));
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_NATN_CODE_ISSUE.POST-TEXT-ITEM
		 G$_Search.Post_Text_Code;
IF :GOBINTL_NATN_CODE_ISSUE IS NULL THEN
   :GOBINTL.ISSUE_NATN_DESC := '';
END IF;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_NATN_CODE_ISSUE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="GOBINTL_NATN_CODE_ISSUE", function=KeyFunction.ITEM_OUT)
		public void gobintlNatnCodeIssue_itemOut()
		{
				GobintlAdapter gobintlElement = (GobintlAdapter)this.getFormModel().getGobintl().getRowAdapter(true);
				if(gobintlElement != null)
				{
					getTask().getGoqrpls().getGSearch().postTextCode();
					if ( gobintlElement.getGobintlNatnCodeIssue().isNull() )
					{
						gobintlElement.setIssueNatnDesc(toStr(""));
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_NATN_CODE_ISSUE.KEY-NXTBLK
		 if :system.block_status = 'CHANGED' then
	  message( G$_NLS.Get('GOAINTL-0105', 'FORM','Please Save Information before Leaving Current Block.') );
	  raise form_trigger_failure;
end if;
--
GO_ITEM('GOBINTL_CELG_CODE');
g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_NATN_CODE_ISSUE.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", item="GOBINTL_NATN_CODE_ISSUE", function=KeyFunction.NEXT_BLOCK)
		public void gobintlNatnCodeIssue_NextBlock()
		{
			
				if ( getBlockStatus().equals("CHANGED") )
				{
					errorMessage(GNls.Fget(toStr("GOAINTL-0105"), toStr("FORM"), toStr("*ERROR* Please Save Information before Leaving Current Block.")));
					throw new ApplicationException();
				}
				// 
				goItem(toStr("GOBINTL_CELG_CODE"));
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_NATN_CODE_ISSUE.KEY-PRVBLK
		 if :system.block_status = 'CHANGED' then
	  message( G$_NLS.Get('GOAINTL-0106', 'FORM','Please Save Information before Leaving Current Block.') );
	  raise form_trigger_failure;
end if;
--
go_block('gordocm');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_NATN_CODE_ISSUE.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", item="GOBINTL_NATN_CODE_ISSUE", function=KeyFunction.PREVIOUS_BLOCK)
		public void gobintlNatnCodeIssue_PreviousBlock()
		{
			
				if ( getBlockStatus().equals("CHANGED") )
				{
					errorMessage(GNls.Fget(toStr("GOAINTL-0106"), toStr("FORM"), toStr("*ERROR* Please Save Information before Leaving Current Block.")));
					throw new ApplicationException();
				}
				// 
				goBlock(toStr("gordocm"));
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_NATN_CODE_ISSUE.POST-CHANGE
		 if :gobintl_passport_id is not null and :gobintl_natn_code_issue is null then
    message( G$_NLS.Get('GOAINTL-0107', 'FORM','Passport Id is Entered, Nation of Issue is a Required Field.') );
    raise form_trigger_failure;
end if;
--
if :GOBINTL_NATN_CODE_ISSUE is null then
	 :GOBINTL.ISSUE_NATN_DESC := '';
	  return;
end if;
--
BEGIN
   G$_CHECK_QUERY_MODE;
   DECLARE
      CURSOR PTI_CURSOR IS
         SELECT STVNATN_NATION
         FROM   STVNATN
         WHERE  STVNATN_CODE = :GOBINTL_NATN_CODE_ISSUE;
   BEGIN
      OPEN PTI_CURSOR;
      FETCH PTI_CURSOR INTO :GOBINTL.ISSUE_NATN_DESC;
      G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND, G$_NLS.Get('GOAINTL-0108', 'FORM','*ERROR* Invalid code; press LIST for valid codes') , TRUE);
   END;
   :GLOBAL.QUERY_MODE := '0';
   EXCEPTION
   WHEN FORM_TRIGGER_FAILURE THEN
      :GLOBAL.QUERY_MODE := '0';
      RAISE FORM_TRIGGER_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_NATN_CODE_ISSUE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="GOBINTL_NATN_CODE_ISSUE")
		public void gobintlNatnCodeIssue_PostChange()
		{
				GobintlAdapter gobintlElement = (GobintlAdapter)this.getFormModel().getGobintl().getRowAdapter(true);
				if(gobintlElement != null)
					{
					int rowCount = 0;
					if(gobintlElement.getGobintlNatnCodeIssue().isNull())
						return;
					if ( !gobintlElement.getGobintlPassportId().isNull() && gobintlElement.getGobintlNatnCodeIssue().isNull() )
					{
						errorMessage(GNls.Fget(toStr("GOAINTL-0107"), toStr("FORM"), toStr("*ERROR* Passport Id is Entered, Nation of Issue is a Required Field.")));
						throw new ApplicationException();
					}
					// 
					if ( gobintlElement.getGobintlNatnCodeIssue().isNull() )
					{
						gobintlElement.setIssueNatnDesc(toStr(""));
						return ;
					}
					try
					{
						getTask().getGoqrpls().gCheckQueryMode();
						{
							String sqlptiCursor = "SELECT STVNATN_NATION " +
		" FROM STVNATN " +
		" WHERE STVNATN_CODE = :GOBINTL_NATN_CODE_ISSUE ";
							DataCursor ptiCursor = new DataCursor(sqlptiCursor);
							try {
								//Setting query parameters
								ptiCursor.addParameter("GOBINTL_NATN_CODE_ISSUE", gobintlElement.getGobintlNatnCodeIssue());
								
								ptiCursor.open();
								ResultSet ptiCursorResults = ptiCursor.fetchInto();
								if ( ptiCursorResults != null ) {
									gobintlElement.setIssueNatnDesc(ptiCursorResults.getStr(0));
								}
								getTask().getGoqrpls().gCheckValue(toBool(ptiCursor.notFound()), GNls.Fget(toStr("GOAINTL-0108"), toStr("FORM"), toStr("*ERROR* Invalid code; press LIST for valid codes")), toBool(NBool.True));
							}
							finally{
								ptiCursor.close();
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
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_NATN_CODE_ISSUE.KEY-DELREC
		 EXECUTE_TRIGGER('DELETE_PASSPORT');

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_NATN_CODE_ISSUE.KEY-DELREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DELREC", item="GOBINTL_NATN_CODE_ISSUE", function=KeyFunction.DELETE_RECORD)
		public void gobintlNatnCodeIssue_DeleteRecord()
		{
			
				executeAction("DELETE_PASSPORT");
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_NATN_CODE_ISSUE.KEY-CLRREC
		 :GOBINTL_PASSPORT_ID := '';
:GOBINTL_NATN_CODE_ISSUE := '';
:GOBINTL.ISSUE_NATN_DESC := '';
:GOBINTL_PASSPORT_EXP_DATE := '';
:GOBINTL_I94_STATUS := '';
:GOBINTL_I94_DATE := '';
:GOBINTL_REG_NUMBER := '';
:GOBINTL_DURATION := 'N';
set_item_property('GOBINTL_NATN_CODE_ISSUE',REQUIRED,PROPERTY_FALSE);	

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_NATN_CODE_ISSUE.KEY-CLRREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRREC", item="GOBINTL_NATN_CODE_ISSUE", function=KeyFunction.CLEAR_RECORD)
		public void gobintlNatnCodeIssue_ClearRecord()
		{
				GobintlAdapter gobintlElement = (GobintlAdapter)this.getFormModel().getGobintl().getRowAdapter(true);
				if(gobintlElement != null)
				{
					gobintlElement.setGobintlPassportId(toStr(""));
					gobintlElement.setGobintlNatnCodeIssue(toStr(""));
					gobintlElement.setIssueNatnDesc(toStr(""));
					gobintlElement.setGobintlPassportExpDate(toDate(""));
					gobintlElement.setGobintlI94Status(toStr(""));
					gobintlElement.setGobintlI94Date(toDate(""));
					gobintlElement.setGobintlRegNumber(toStr(""));
					gobintlElement.setGobintlDuration(toStr("N"));
					setItemRequired("GOBINTL_NATN_CODE_ISSUE", false);
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_NATN_CODE_ISSUE.KEY-CLRBLK
		 :GOBINTL_PASSPORT_ID := '';
:GOBINTL_NATN_CODE_ISSUE := '';
:GOBINTL.ISSUE_NATN_DESC := '';
:GOBINTL_PASSPORT_EXP_DATE := '';
:GOBINTL_I94_STATUS := '';
:GOBINTL_I94_DATE := '';
:GOBINTL_REG_NUMBER := '';
:GOBINTL_DURATION := 'N';
set_item_property('GOBINTL_NATN_CODE_ISSUE',REQUIRED,PROPERTY_FALSE);	

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_NATN_CODE_ISSUE.KEY-CLRBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRBLK", item="GOBINTL_NATN_CODE_ISSUE", function=KeyFunction.CLEAR_BLOCK)
		public void gobintlNatnCodeIssue_keyClearBlock()
		{
				GobintlAdapter gobintlElement = (GobintlAdapter)this.getFormModel().getGobintl().getRowAdapter(true);
				if(gobintlElement != null)
				{
					gobintlElement.setGobintlPassportId(toStr(""));
					gobintlElement.setGobintlNatnCodeIssue(toStr(""));
					gobintlElement.setIssueNatnDesc(toStr(""));
					gobintlElement.setGobintlPassportExpDate(toDate(""));
					gobintlElement.setGobintlI94Status(toStr(""));
					gobintlElement.setGobintlI94Date(toDate(""));
					gobintlElement.setGobintlRegNumber(toStr(""));
					gobintlElement.setGobintlDuration(toStr("N"));
					setItemRequired("GOBINTL_NATN_CODE_ISSUE", false);
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_PASSPORT_EXP_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="GOBINTL_PASSPORT_EXP_DATE", function=KeyFunction.ITEM_CHANGE)
		public void gobintlPassportExpDate_itemChange()
		{
			
				getGDateClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_PASSPORT_EXP_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="GOBINTL_PASSPORT_EXP_DATE", function=KeyFunction.ITEM_OUT)
		public void gobintlPassportExpDate_itemOut()
		{
			
				getGDateClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_PASSPORT_EXP_DATE.KEY-NEXT-ITEM
		    G$_DATE_REFORMAT ('','');
   G$_CHECK_FAILURE;
   NEXT_FIELD;
   G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_PASSPORT_EXP_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="GOBINTL_PASSPORT_EXP_DATE", function=KeyFunction.NEXT_ITEM)
		public void gobintlPassportExpDate_keyNexItem()
		{

				nextItem();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_PASSPORT_EXP_DATE.KEY-PREV-ITEM
		    G$_DATE_REFORMAT ('','');
   G$_CHECK_FAILURE;
   PREVIOUS_FIELD;
   G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_PASSPORT_EXP_DATE.KEY-PREV-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PREV-ITEM", item="GOBINTL_PASSPORT_EXP_DATE", function=KeyFunction.PREVIOUS_ITEM)
		public void gobintlPassportExpDate_PreviousItem()
		{

				previousItem();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_PASSPORT_EXP_DATE.KEY-NXTBLK
		 if :system.block_status = 'CHANGED' then
	  message( G$_NLS.Get('GOAINTL-0109', 'FORM','Please Save Information before Leaving Current Block.') );
	  raise form_trigger_failure;
end if;
--
GO_ITEM('GOBINTL_CELG_CODE');
g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_PASSPORT_EXP_DATE.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", item="GOBINTL_PASSPORT_EXP_DATE", function=KeyFunction.NEXT_BLOCK)
		public void gobintlPassportExpDate_NextBlock()
		{
			
				if ( getBlockStatus().equals("CHANGED") )
				{
					errorMessage(GNls.Fget(toStr("GOAINTL-0109"), toStr("FORM"), toStr("*ERROR* Please Save Information before Leaving Current Block.")));
					throw new ApplicationException();
				}
				// 
				goItem(toStr("GOBINTL_CELG_CODE"));
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_PASSPORT_EXP_DATE.KEY-PRVBLK
		 if :system.block_status = 'CHANGED' then
	  message( G$_NLS.Get('GOAINTL-0110', 'FORM','Please Save Information before Leaving Current Block.') );
	  raise form_trigger_failure;
end if;
--
go_block('gordocm');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_PASSPORT_EXP_DATE.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", item="GOBINTL_PASSPORT_EXP_DATE", function=KeyFunction.PREVIOUS_BLOCK)
		public void gobintlPassportExpDate_PreviousBlock()
		{
			
				if ( getBlockStatus().equals("CHANGED") )
				{
					errorMessage(GNls.Fget(toStr("GOAINTL-0110"), toStr("FORM"), toStr("*ERROR* Please Save Information before Leaving Current Block.")));
					throw new ApplicationException();
				}
				// 
				goBlock(toStr("gordocm"));
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_PASSPORT_EXP_DATE.KEY-DELREC
		 EXECUTE_TRIGGER('DELETE_PASSPORT');

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_PASSPORT_EXP_DATE.KEY-DELREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DELREC", item="GOBINTL_PASSPORT_EXP_DATE", function=KeyFunction.DELETE_RECORD)
		public void gobintlPassportExpDate_DeleteRecord()
		{
			
				executeAction("DELETE_PASSPORT");
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_PASSPORT_EXP_DATE.KEY-CLRREC
		 :GOBINTL_PASSPORT_ID := '';
:GOBINTL_NATN_CODE_ISSUE := '';
:GOBINTL.ISSUE_NATN_DESC := '';
:GOBINTL_PASSPORT_EXP_DATE := '';
:GOBINTL_I94_STATUS := '';
:GOBINTL_I94_DATE := '';
:GOBINTL_REG_NUMBER := '';
:GOBINTL_DURATION := 'N';
set_item_property('GOBINTL_NATN_CODE_ISSUE',REQUIRED,PROPERTY_FALSE);	

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_PASSPORT_EXP_DATE.KEY-CLRREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRREC", item="GOBINTL_PASSPORT_EXP_DATE", function=KeyFunction.CLEAR_RECORD)
		public void gobintlPassportExpDate_ClearRecord()
		{
				GobintlAdapter gobintlElement = (GobintlAdapter)this.getFormModel().getGobintl().getRowAdapter(true);
				if(gobintlElement != null)
				{
					gobintlElement.setGobintlPassportId(toStr(""));
					gobintlElement.setGobintlNatnCodeIssue(toStr(""));
					gobintlElement.setIssueNatnDesc(toStr(""));
					gobintlElement.setGobintlPassportExpDate(toDate(""));
					gobintlElement.setGobintlI94Status(toStr(""));
					gobintlElement.setGobintlI94Date(toDate(""));
					gobintlElement.setGobintlRegNumber(toStr(""));
					gobintlElement.setGobintlDuration(toStr("N"));
					setItemRequired("GOBINTL_NATN_CODE_ISSUE", false);
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_PASSPORT_EXP_DATE.KEY-CLRBLK
		 :GOBINTL_PASSPORT_ID := '';
:GOBINTL_NATN_CODE_ISSUE := '';
:GOBINTL.ISSUE_NATN_DESC := '';
:GOBINTL_PASSPORT_EXP_DATE := '';
:GOBINTL_I94_STATUS := '';
:GOBINTL_I94_DATE := '';
:GOBINTL_REG_NUMBER := '';
:GOBINTL_DURATION := 'N';
set_item_property('GOBINTL_NATN_CODE_ISSUE',REQUIRED,PROPERTY_FALSE);	

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_PASSPORT_EXP_DATE.KEY-CLRBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRBLK", item="GOBINTL_PASSPORT_EXP_DATE", function=KeyFunction.CLEAR_BLOCK)
		public void gobintlPassportExpDate_keyClearBlock()
		{
				GobintlAdapter gobintlElement = (GobintlAdapter)this.getFormModel().getGobintl().getRowAdapter(true);
				if(gobintlElement != null)
				{
					gobintlElement.setGobintlPassportId(toStr(""));
					gobintlElement.setGobintlNatnCodeIssue(toStr(""));
					gobintlElement.setIssueNatnDesc(toStr(""));
					gobintlElement.setGobintlPassportExpDate(toDate(""));
					gobintlElement.setGobintlI94Status(toStr(""));
					gobintlElement.setGobintlI94Date(toDate(""));
					gobintlElement.setGobintlRegNumber(toStr(""));
					gobintlElement.setGobintlDuration(toStr("N"));
					setItemRequired("GOBINTL_NATN_CODE_ISSUE", false);
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_I94_STATUS.KEY-NXTBLK
		 if :system.block_status = 'CHANGED' then
	  message( G$_NLS.Get('GOAINTL-0111', 'FORM','Please Save Information before Leaving Current Block.') );
	  raise form_trigger_failure;
end if;
--
GO_ITEM('GOBINTL_CELG_CODE');
g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_I94_STATUS.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", item="GOBINTL_I94_STATUS", function=KeyFunction.NEXT_BLOCK)
		public void gobintlI94Status_NextBlock()
		{
			
				if ( getBlockStatus().equals("CHANGED") )
				{
					errorMessage(GNls.Fget(toStr("GOAINTL-0111"), toStr("FORM"), toStr("*ERROR* Please Save Information before Leaving Current Block.")));
					throw new ApplicationException();
				}
				// 
				goItem(toStr("GOBINTL_CELG_CODE"));
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_I94_STATUS.KEY-PRVBLK
		 if :system.block_status = 'CHANGED' then
	  message( G$_NLS.Get('GOAINTL-0112', 'FORM','Please Save Information before Leaving Current Block.') );
	  raise form_trigger_failure;
end if;
--
go_block('gordocm');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_I94_STATUS.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", item="GOBINTL_I94_STATUS", function=KeyFunction.PREVIOUS_BLOCK)
		public void gobintlI94Status_PreviousBlock()
		{
			
				if ( getBlockStatus().equals("CHANGED") )
				{
					errorMessage(GNls.Fget(toStr("GOAINTL-0112"), toStr("FORM"), toStr("*ERROR* Please Save Information before Leaving Current Block.")));
					throw new ApplicationException();
				}
				// 
				goBlock(toStr("gordocm"));
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_I94_STATUS.KEY-DELREC
		 EXECUTE_TRIGGER('DELETE_PASSPORT');

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_I94_STATUS.KEY-DELREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DELREC", item="GOBINTL_I94_STATUS", function=KeyFunction.DELETE_RECORD)
		public void gobintlI94Status_DeleteRecord()
		{
			
				executeAction("DELETE_PASSPORT");
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_I94_STATUS.KEY-CLRREC
		 :GOBINTL_PASSPORT_ID := '';
:GOBINTL_NATN_CODE_ISSUE := '';
:GOBINTL.ISSUE_NATN_DESC := '';
:GOBINTL_PASSPORT_EXP_DATE := '';
:GOBINTL_I94_STATUS := '';
:GOBINTL_I94_DATE := '';
:GOBINTL_REG_NUMBER := '';
:GOBINTL_DURATION := 'N';
set_item_property('GOBINTL_NATN_CODE_ISSUE',REQUIRED,PROPERTY_FALSE);	

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_I94_STATUS.KEY-CLRREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRREC", item="GOBINTL_I94_STATUS", function=KeyFunction.CLEAR_RECORD)
		public void gobintlI94Status_ClearRecord()
		{
				GobintlAdapter gobintlElement = (GobintlAdapter)this.getFormModel().getGobintl().getRowAdapter(true);
				if(gobintlElement != null)
				{
					gobintlElement.setGobintlPassportId(toStr(""));
					gobintlElement.setGobintlNatnCodeIssue(toStr(""));
					gobintlElement.setIssueNatnDesc(toStr(""));
					gobintlElement.setGobintlPassportExpDate(toDate(""));
					gobintlElement.setGobintlI94Status(toStr(""));
					gobintlElement.setGobintlI94Date(toDate(""));
					gobintlElement.setGobintlRegNumber(toStr(""));
					gobintlElement.setGobintlDuration(toStr("N"));
					setItemRequired("GOBINTL_NATN_CODE_ISSUE", false);
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_I94_STATUS.KEY-CLRBLK
		 :GOBINTL_PASSPORT_ID := '';
:GOBINTL_NATN_CODE_ISSUE := '';
:GOBINTL.ISSUE_NATN_DESC := '';
:GOBINTL_PASSPORT_EXP_DATE := '';
:GOBINTL_I94_STATUS := '';
:GOBINTL_I94_DATE := '';
:GOBINTL_REG_NUMBER := '';
:GOBINTL_DURATION := 'N';
set_item_property('GOBINTL_NATN_CODE_ISSUE',REQUIRED,PROPERTY_FALSE);	

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_I94_STATUS.KEY-CLRBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRBLK", item="GOBINTL_I94_STATUS", function=KeyFunction.CLEAR_BLOCK)
		public void gobintlI94Status_keyClearBlock()
		{
				GobintlAdapter gobintlElement = (GobintlAdapter)this.getFormModel().getGobintl().getRowAdapter(true);
				if(gobintlElement != null)
				{
					gobintlElement.setGobintlPassportId(toStr(""));
					gobintlElement.setGobintlNatnCodeIssue(toStr(""));
					gobintlElement.setIssueNatnDesc(toStr(""));
					gobintlElement.setGobintlPassportExpDate(toDate(""));
					gobintlElement.setGobintlI94Status(toStr(""));
					gobintlElement.setGobintlI94Date(toDate(""));
					gobintlElement.setGobintlRegNumber(toStr(""));
					gobintlElement.setGobintlDuration(toStr("N"));
					setItemRequired("GOBINTL_NATN_CODE_ISSUE", false);
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_I94_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="GOBINTL_I94_DATE", function=KeyFunction.NEXT_ITEM)
		public void gobintlI94Date_keyNexItem()
		{
			
				getGDateClass().nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_I94_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="GOBINTL_I94_DATE", function=KeyFunction.ITEM_CHANGE)
		public void gobintlI94Date_itemChange()
		{
			
				getGDateClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_I94_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="GOBINTL_I94_DATE", function=KeyFunction.ITEM_OUT)
		public void gobintlI94Date_itemOut()
		{
			
				getGDateClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_I94_DATE.KEY-NXTBLK
		 if :system.block_status = 'CHANGED' then
	  message( G$_NLS.Get('GOAINTL-0113', 'FORM','Please Save Information before Leaving Current Block.') );
	  raise form_trigger_failure;
end if;
--
GO_ITEM('GOBINTL_CELG_CODE');
g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_I94_DATE.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", item="GOBINTL_I94_DATE", function=KeyFunction.NEXT_BLOCK)
		public void gobintlI94Date_NextBlock()
		{
			
				if ( getBlockStatus().equals("CHANGED") )
				{
					errorMessage(GNls.Fget(toStr("GOAINTL-0113"), toStr("FORM"), toStr("*ERROR* Please Save Information before Leaving Current Block.")));
					throw new ApplicationException();
				}
				// 
				goItem(toStr("GOBINTL_CELG_CODE"));
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_I94_DATE.KEY-PRVBLK
		 if :system.block_status = 'CHANGED' then
	  message( G$_NLS.Get('GOAINTL-0114', 'FORM','Please Save Information before Leaving Current Block.') );
	  raise form_trigger_failure;
end if;
--
go_block('gordocm');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_I94_DATE.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", item="GOBINTL_I94_DATE", function=KeyFunction.PREVIOUS_BLOCK)
		public void gobintlI94Date_PreviousBlock()
		{
			
				if ( getBlockStatus().equals("CHANGED") )
				{
					errorMessage(GNls.Fget(toStr("GOAINTL-0114"), toStr("FORM"), toStr("*ERROR* Please Save Information before Leaving Current Block.")));
					throw new ApplicationException();
				}
				// 
				goBlock(toStr("gordocm"));
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_I94_DATE.KEY-DELREC
		 EXECUTE_TRIGGER('DELETE_PASSPORT');

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_I94_DATE.KEY-DELREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DELREC", item="GOBINTL_I94_DATE", function=KeyFunction.DELETE_RECORD)
		public void gobintlI94Date_DeleteRecord()
		{
			
				executeAction("DELETE_PASSPORT");
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_I94_DATE.KEY-CLRREC
		 :GOBINTL_PASSPORT_ID := '';
:GOBINTL_NATN_CODE_ISSUE := '';
:GOBINTL.ISSUE_NATN_DESC := '';
:GOBINTL_PASSPORT_EXP_DATE := '';
:GOBINTL_I94_STATUS := '';
:GOBINTL_I94_DATE := '';
:GOBINTL_REG_NUMBER := '';
:GOBINTL_DURATION := 'N';
set_item_property('GOBINTL_NATN_CODE_ISSUE',REQUIRED,PROPERTY_FALSE);	

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_I94_DATE.KEY-CLRREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRREC", item="GOBINTL_I94_DATE", function=KeyFunction.CLEAR_RECORD)
		public void gobintlI94Date_ClearRecord()
		{
				GobintlAdapter gobintlElement = (GobintlAdapter)this.getFormModel().getGobintl().getRowAdapter(true);
				if(gobintlElement != null)
				{
					gobintlElement.setGobintlPassportId(toStr(""));
					gobintlElement.setGobintlNatnCodeIssue(toStr(""));
					gobintlElement.setIssueNatnDesc(toStr(""));
					gobintlElement.setGobintlPassportExpDate(toDate(""));
					gobintlElement.setGobintlI94Status(toStr(""));
					gobintlElement.setGobintlI94Date(toDate(""));
					gobintlElement.setGobintlRegNumber(toStr(""));
					gobintlElement.setGobintlDuration(toStr("N"));
					setItemRequired("GOBINTL_NATN_CODE_ISSUE", false);
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_I94_DATE.KEY-CLRBLK
		 :GOBINTL_PASSPORT_ID := '';
:GOBINTL_NATN_CODE_ISSUE := '';
:GOBINTL.ISSUE_NATN_DESC := '';
:GOBINTL_PASSPORT_EXP_DATE := '';
:GOBINTL_I94_STATUS := '';
:GOBINTL_I94_DATE := '';
:GOBINTL_REG_NUMBER := '';
:GOBINTL_DURATION := 'N';
set_item_property('GOBINTL_NATN_CODE_ISSUE',REQUIRED,PROPERTY_FALSE);	

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_I94_DATE.KEY-CLRBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRBLK", item="GOBINTL_I94_DATE", function=KeyFunction.CLEAR_BLOCK)
		public void gobintlI94Date_keyClearBlock()
		{
				GobintlAdapter gobintlElement = (GobintlAdapter)this.getFormModel().getGobintl().getRowAdapter(true);
				if(gobintlElement != null)
				{
					gobintlElement.setGobintlPassportId(toStr(""));
					gobintlElement.setGobintlNatnCodeIssue(toStr(""));
					gobintlElement.setIssueNatnDesc(toStr(""));
					gobintlElement.setGobintlPassportExpDate(toDate(""));
					gobintlElement.setGobintlI94Status(toStr(""));
					gobintlElement.setGobintlI94Date(toDate(""));
					gobintlElement.setGobintlRegNumber(toStr(""));
					gobintlElement.setGobintlDuration(toStr("N"));
					setItemRequired("GOBINTL_NATN_CODE_ISSUE", false);
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_REG_NUMBER.KEY-NXTBLK
		 if :system.block_status = 'CHANGED' then
	  message( G$_NLS.Get('GOAINTL-0115', 'FORM','Please Save Information before Leaving Current Block.') );
	  raise form_trigger_failure;
end if;
--
GO_ITEM('GOBINTL_CELG_CODE');
g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_REG_NUMBER.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", item="GOBINTL_REG_NUMBER", function=KeyFunction.NEXT_BLOCK)
		public void gobintlRegNumber_NextBlock()
		{
			
				if ( getBlockStatus().equals("CHANGED") )
				{
					errorMessage(GNls.Fget(toStr("GOAINTL-0115"), toStr("FORM"), toStr("*ERROR* Please Save Information before Leaving Current Block.")));
					throw new ApplicationException();
				}
				// 
				goItem(toStr("GOBINTL_CELG_CODE"));
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_REG_NUMBER.KEY-PRVBLK
		 if :system.block_status = 'CHANGED' then
	  message( G$_NLS.Get('GOAINTL-0116', 'FORM','Please Save Information before Leaving Current Block.') );
	  raise form_trigger_failure;
end if;
--
go_block('gordocm');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_REG_NUMBER.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", item="GOBINTL_REG_NUMBER", function=KeyFunction.PREVIOUS_BLOCK)
		public void gobintlRegNumber_PreviousBlock()
		{
			
				if ( getBlockStatus().equals("CHANGED") )
				{
					errorMessage(GNls.Fget(toStr("GOAINTL-0116"), toStr("FORM"), toStr("*ERROR* Please Save Information before Leaving Current Block.")));
					throw new ApplicationException();
				}
				// 
				goBlock(toStr("gordocm"));
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_REG_NUMBER.KEY-DELREC
		 EXECUTE_TRIGGER('DELETE_PASSPORT');

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_REG_NUMBER.KEY-DELREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DELREC", item="GOBINTL_REG_NUMBER", function=KeyFunction.DELETE_RECORD)
		public void gobintlRegNumber_DeleteRecord()
		{
			
				executeAction("DELETE_PASSPORT");
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_REG_NUMBER.KEY-CLRREC
		 :GOBINTL_PASSPORT_ID := '';
:GOBINTL_NATN_CODE_ISSUE := '';
:GOBINTL.ISSUE_NATN_DESC := '';
:GOBINTL_PASSPORT_EXP_DATE := '';
:GOBINTL_I94_STATUS := '';
:GOBINTL_I94_DATE := '';
:GOBINTL_REG_NUMBER := '';
:GOBINTL_DURATION := 'N';
set_item_property('GOBINTL_NATN_CODE_ISSUE',REQUIRED,PROPERTY_FALSE);	

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_REG_NUMBER.KEY-CLRREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRREC", item="GOBINTL_REG_NUMBER", function=KeyFunction.CLEAR_RECORD)
		public void gobintlRegNumber_ClearRecord()
		{
				GobintlAdapter gobintlElement = (GobintlAdapter)this.getFormModel().getGobintl().getRowAdapter(true);
				if(gobintlElement != null)
				{
					gobintlElement.setGobintlPassportId(toStr(""));
					gobintlElement.setGobintlNatnCodeIssue(toStr(""));
					gobintlElement.setIssueNatnDesc(toStr(""));
					gobintlElement.setGobintlPassportExpDate(toDate(""));
					gobintlElement.setGobintlI94Status(toStr(""));
					gobintlElement.setGobintlI94Date(toDate(""));
					gobintlElement.setGobintlRegNumber(toStr(""));
					gobintlElement.setGobintlDuration(toStr("N"));
					setItemRequired("GOBINTL_NATN_CODE_ISSUE", false);
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_REG_NUMBER.KEY-CLRBLK
		 :GOBINTL_PASSPORT_ID := '';
:GOBINTL_NATN_CODE_ISSUE := '';
:GOBINTL.ISSUE_NATN_DESC := '';
:GOBINTL_PASSPORT_EXP_DATE := '';
:GOBINTL_I94_STATUS := '';
:GOBINTL_I94_DATE := '';
:GOBINTL_REG_NUMBER := '';
:GOBINTL_DURATION := 'N';
set_item_property('GOBINTL_NATN_CODE_ISSUE',REQUIRED,PROPERTY_FALSE);	

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_REG_NUMBER.KEY-CLRBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRBLK", item="GOBINTL_REG_NUMBER", function=KeyFunction.CLEAR_BLOCK)
		public void gobintlRegNumber_keyClearBlock()
		{
				GobintlAdapter gobintlElement = (GobintlAdapter)this.getFormModel().getGobintl().getRowAdapter(true);
				if(gobintlElement != null)
				{
					gobintlElement.setGobintlPassportId(toStr(""));
					gobintlElement.setGobintlNatnCodeIssue(toStr(""));
					gobintlElement.setIssueNatnDesc(toStr(""));
					gobintlElement.setGobintlPassportExpDate(toDate(""));
					gobintlElement.setGobintlI94Status(toStr(""));
					gobintlElement.setGobintlI94Date(toDate(""));
					gobintlElement.setGobintlRegNumber(toStr(""));
					gobintlElement.setGobintlDuration(toStr("N"));
					setItemRequired("GOBINTL_NATN_CODE_ISSUE", false);
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_DURATION.KEY-NEXT-ITEM
		 GO_ITEM('GOBINTL_PASSPORT_ID');
G$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_DURATION.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="GOBINTL_DURATION", function=KeyFunction.NEXT_ITEM)
		public void gobintlDuration_keyNexItem()
		{
			
				goItem(toStr("GOBINTL_PASSPORT_ID"));
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_DURATION.KEY-NXTBLK
		 if :system.block_status = 'CHANGED' then
	  message( G$_NLS.Get('GOAINTL-0117', 'FORM','Please Save Information before Leaving Current Block.') );
	  raise form_trigger_failure;
end if;
--
GO_ITEM('GOBINTL_CELG_CODE');
g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_DURATION.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", item="GOBINTL_DURATION", function=KeyFunction.NEXT_BLOCK)
		public void gobintlDuration_NextBlock()
		{
			
				if ( getBlockStatus().equals("CHANGED") )
				{
					errorMessage(GNls.Fget(toStr("GOAINTL-0117"), toStr("FORM"), toStr("*ERROR* Please Save Information before Leaving Current Block.")));
					throw new ApplicationException();
				}
				// 
				goItem(toStr("GOBINTL_CELG_CODE"));
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_DURATION.KEY-PRVBLK
		 if :system.block_status = 'CHANGED' then
	  message( G$_NLS.Get('GOAINTL-0118', 'FORM','Please Save Information before Leaving Current Block.') );
	  raise form_trigger_failure;
end if;
--
go_block('gordocm');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_DURATION.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", item="GOBINTL_DURATION", function=KeyFunction.PREVIOUS_BLOCK)
		public void gobintlDuration_PreviousBlock()
		{
			
				if ( getBlockStatus().equals("CHANGED") )
				{
					errorMessage(GNls.Fget(toStr("GOAINTL-0118"), toStr("FORM"), toStr("*ERROR* Please Save Information before Leaving Current Block.")));
					throw new ApplicationException();
				}
				// 
				goBlock(toStr("gordocm"));
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_DURATION.KEY-DELREC
		 EXECUTE_TRIGGER('DELETE_PASSPORT');

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_DURATION.KEY-DELREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DELREC", item="GOBINTL_DURATION", function=KeyFunction.DELETE_RECORD)
		public void gobintlDuration_DeleteRecord()
		{
			
				executeAction("DELETE_PASSPORT");
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_DURATION.KEY-CLRREC
		 :GOBINTL_PASSPORT_ID := '';
:GOBINTL_NATN_CODE_ISSUE := '';
:GOBINTL.ISSUE_NATN_DESC := '';
:GOBINTL_PASSPORT_EXP_DATE := '';
:GOBINTL_I94_STATUS := '';
:GOBINTL_I94_DATE := '';
:GOBINTL_REG_NUMBER := '';
:GOBINTL_DURATION := 'N';
set_item_property('GOBINTL_NATN_CODE_ISSUE',REQUIRED,PROPERTY_FALSE);	

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_DURATION.KEY-CLRREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRREC", item="GOBINTL_DURATION", function=KeyFunction.CLEAR_RECORD)
		public void gobintlDuration_ClearRecord()
		{
				GobintlAdapter gobintlElement = (GobintlAdapter)this.getFormModel().getGobintl().getRowAdapter(true);
				if(gobintlElement != null)
				{
					gobintlElement.setGobintlPassportId(toStr(""));
					gobintlElement.setGobintlNatnCodeIssue(toStr(""));
					gobintlElement.setIssueNatnDesc(toStr(""));
					gobintlElement.setGobintlPassportExpDate(toDate(""));
					gobintlElement.setGobintlI94Status(toStr(""));
					gobintlElement.setGobintlI94Date(toDate(""));
					gobintlElement.setGobintlRegNumber(toStr(""));
					gobintlElement.setGobintlDuration(toStr("N"));
					setItemRequired("GOBINTL_NATN_CODE_ISSUE", false);
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_DURATION.KEY-CLRBLK
		 :GOBINTL_PASSPORT_ID := '';
:GOBINTL_NATN_CODE_ISSUE := '';
:GOBINTL.ISSUE_NATN_DESC := '';
:GOBINTL_PASSPORT_EXP_DATE := '';
:GOBINTL_I94_STATUS := '';
:GOBINTL_I94_DATE := '';
:GOBINTL_REG_NUMBER := '';
:GOBINTL_DURATION := 'N';
set_item_property('GOBINTL_NATN_CODE_ISSUE',REQUIRED,PROPERTY_FALSE);	

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_DURATION.KEY-CLRBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRBLK", item="GOBINTL_DURATION", function=KeyFunction.CLEAR_BLOCK)
		public void gobintlDuration_keyClearBlock()
		{
				GobintlAdapter gobintlElement = (GobintlAdapter)this.getFormModel().getGobintl().getRowAdapter(true);
				if(gobintlElement != null)
				{
					gobintlElement.setGobintlPassportId(toStr(""));
					gobintlElement.setGobintlNatnCodeIssue(toStr(""));
					gobintlElement.setIssueNatnDesc(toStr(""));
					gobintlElement.setGobintlPassportExpDate(toDate(""));
					gobintlElement.setGobintlI94Status(toStr(""));
					gobintlElement.setGobintlI94Date(toDate(""));
					gobintlElement.setGobintlRegNumber(toStr(""));
					gobintlElement.setGobintlDuration(toStr("N"));
					setItemRequired("GOBINTL_NATN_CODE_ISSUE", false);
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_CELG_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="GOBINTL_CELG_CODE")
		public void gobintlCelgCode_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_CELG_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="GOBINTL_CELG_CODE", function=KeyFunction.ITEM_CHANGE)
		public void gobintlCelgCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_CELG_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="GOBINTL_CELG_CODE")
		public void gobintlCelgCode_GSearchParameters()
		{
			
				getGCodeClass().gSearchParameters();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_CELG_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="GOBINTL_CELG_CODE")
		public void gobintlCelgCode_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_CELG_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="GOBINTL_CELG_CODE", function=KeyFunction.NEXT_ITEM)
		public void gobintlCelgCode_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_CELG_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="GOBINTL_CELG_CODE", function=KeyFunction.ITEM_OUT)
		public void gobintlCelgCode_itemOut()
		{
			
				getGCodeClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_CELG_CODE.KEY-NXTBLK
		 if :system.block_status = 'CHANGED' then
	  message( G$_NLS.Get('GOAINTL-0119', 'FORM','Please Save Information before Leaving Current Block.') );
	  raise form_trigger_failure;
end if;
--
GO_ITEM('GOBINTL_NATN_CODE_BIRTH');
g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_CELG_CODE.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", item="GOBINTL_CELG_CODE", function=KeyFunction.NEXT_BLOCK)
		public void gobintlCelgCode_NextBlock()
		{
			
				if ( getBlockStatus().equals("CHANGED") )
				{
					errorMessage(GNls.Fget(toStr("GOAINTL-0119"), toStr("FORM"), toStr("*ERROR* Please Save Information before Leaving Current Block.")));
					throw new ApplicationException();
				}
				// 
				goItem(toStr("GOBINTL_NATN_CODE_BIRTH"));
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_CELG_CODE.KEY-PRVBLK
		 if :system.block_status = 'CHANGED' then
	  message( G$_NLS.Get('GOAINTL-0120', 'FORM','Please Save Information before Leaving Current Block.') );
	  raise form_trigger_failure;
end if;
--
go_item('GOBINTL_PASSPORT_ID');
g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_CELG_CODE.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", item="GOBINTL_CELG_CODE", function=KeyFunction.PREVIOUS_BLOCK)
		public void gobintlCelgCode_PreviousBlock()
		{
			
				if ( getBlockStatus().equals("CHANGED") )
				{
					errorMessage(GNls.Fget(toStr("GOAINTL-0120"), toStr("FORM"), toStr("*ERROR* Please Save Information before Leaving Current Block.")));
					throw new ApplicationException();
				}
				// 
				goItem(toStr("GOBINTL_PASSPORT_ID"));
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_CELG_CODE.KEY-PREV-ITEM
		 go_item('GOBINTL_ADMR_CODE');
g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_CELG_CODE.KEY-PREV-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PREV-ITEM", item="GOBINTL_CELG_CODE", function=KeyFunction.PREVIOUS_ITEM)
		public void gobintlCelgCode_PreviousItem()
		{
			
				goItem(toStr("GOBINTL_ADMR_CODE"));
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_CELG_CODE.POST-CHANGE
		 if :GOBINTL_CELG_CODE is null then
	 :CELG_DESC := '';
	  return;
end if;
--
BEGIN
   G$_CHECK_QUERY_MODE;
   DECLARE
      CURSOR PTI_CURSOR IS
         SELECT GTVCELG_DESC
         FROM   GTVCELG
         WHERE  GTVCELG_CODE = :GOBINTL_CELG_CODE;
   BEGIN
      OPEN PTI_CURSOR;
      FETCH PTI_CURSOR INTO :CELG_DESC;
      G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND, G$_NLS.Get('GOAINTL-0121', 'FORM','*ERROR* Invalid code; press LIST for valid codes') , TRUE);
   END;
   :GLOBAL.QUERY_MODE := '0';
   EXCEPTION
   WHEN FORM_TRIGGER_FAILURE THEN
      :GLOBAL.QUERY_MODE := '0';
      RAISE FORM_TRIGGER_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_CELG_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="GOBINTL_CELG_CODE")
		public void gobintlCelgCode_PostChange()
		{
				GobintlAdapter gobintlElement = (GobintlAdapter)this.getFormModel().getGobintl().getRowAdapter(true);
				if(gobintlElement != null)
				{
					int rowCount = 0;
					if(gobintlElement.getGobintlCelgCode().isNull())
						return;
					if ( gobintlElement.getGobintlCelgCode().isNull() )
					{
						gobintlElement.setCelgDesc(toStr(""));
						return ;
					}
					try
					{
						getTask().getGoqrpls().gCheckQueryMode();
						{
							String sqlptiCursor = "SELECT GTVCELG_DESC " +
		" FROM GTVCELG " +
		" WHERE GTVCELG_CODE = :GOBINTL_CELG_CODE ";
							DataCursor ptiCursor = new DataCursor(sqlptiCursor);
							try {
								//Setting query parameters
								ptiCursor.addParameter("GOBINTL_CELG_CODE", gobintlElement.getGobintlCelgCode());
								
								ptiCursor.open();
								ResultSet ptiCursorResults = ptiCursor.fetchInto();
								if ( ptiCursorResults != null ) {
									gobintlElement.setCelgDesc(ptiCursorResults.getStr(0));
								}
								getTask().getGoqrpls().gCheckValue(toBool(ptiCursor.notFound()), GNls.Fget(toStr("GOAINTL-0121"), toStr("FORM"), toStr("*ERROR* Invalid code; press LIST for valid codes")), toBool(NBool.True));
							}
							finally{
								ptiCursor.close();
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
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_CELG_CODE.KEY-DELREC
		 
EXECUTE_TRIGGER('DELETE_CERTIFICATE');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_CELG_CODE.KEY-DELREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DELREC", item="GOBINTL_CELG_CODE", function=KeyFunction.DELETE_RECORD)
		public void gobintlCelgCode_DeleteRecord()
		{
			
				executeAction("DELETE_CERTIFICATE");
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_CELG_CODE.KEY-CLRBLK
		 :GOBINTL_CELG_CODE := '';
:CELG_DESC := '';
:GOBINTL_CERT_NUMBER := '';
:GOBINTL_CERT_DATE_ISSUE := '';
:GOBINTL_CERT_DATE_RECEIPT := '';
:GOBINTL_ADMR_CODE := '';
:ADMR_DESC := '';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_CELG_CODE.KEY-CLRBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRBLK", item="GOBINTL_CELG_CODE", function=KeyFunction.CLEAR_BLOCK)
		public void gobintlCelgCode_keyClearBlock()
		{
				GobintlAdapter gobintlElement = (GobintlAdapter)this.getFormModel().getGobintl().getRowAdapter(true);
				if(gobintlElement != null)
				{
					gobintlElement.setGobintlCelgCode(toStr(""));
					gobintlElement.setCelgDesc(toStr(""));
					gobintlElement.setGobintlCertNumber(toStr(""));
					gobintlElement.setGobintlCertDateIssue(toDate(""));
					gobintlElement.setGobintlCertDateReceipt(toDate(""));
					gobintlElement.setGobintlAdmrCode(toStr(""));
					gobintlElement.setAdmrDesc(toStr(""));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_CELG_CODE.KEY-CLRREC
		 :GOBINTL_CELG_CODE := '';
:CELG_DESC := '';
:GOBINTL_CERT_NUMBER := '';
:GOBINTL_CERT_DATE_ISSUE := '';
:GOBINTL_CERT_DATE_RECEIPT := '';
:GOBINTL_ADMR_CODE := '';
:ADMR_DESC := '';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_CELG_CODE.KEY-CLRREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRREC", item="GOBINTL_CELG_CODE", function=KeyFunction.CLEAR_RECORD)
		public void gobintlCelgCode_ClearRecord()
		{
				GobintlAdapter gobintlElement = (GobintlAdapter)this.getFormModel().getGobintl().getRowAdapter(true);
				if(gobintlElement != null)
				{
					gobintlElement.setGobintlCelgCode(toStr(""));
					gobintlElement.setCelgDesc(toStr(""));
					gobintlElement.setGobintlCertNumber(toStr(""));
					gobintlElement.setGobintlCertDateIssue(toDate(""));
					gobintlElement.setGobintlCertDateReceipt(toDate(""));
					gobintlElement.setGobintlAdmrCode(toStr(""));
					gobintlElement.setAdmrDesc(toStr(""));
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * CELG_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="CELG_DESC", function=KeyFunction.ITEM_CHANGE)
		public void celgDesc_itemChange()
		{
			
				getGDescClass().itemChange();
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_CERT_NUMBER.KEY-NXTBLK
		 if :system.block_status = 'CHANGED' then
	  message( G$_NLS.Get('GOAINTL-0122', 'FORM','Please Save Information before Leaving Current Block.') );
	  raise form_trigger_failure;
end if;
--
GO_ITEM('GOBINTL_NATN_CODE_BIRTH');
g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_CERT_NUMBER.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", item="GOBINTL_CERT_NUMBER", function=KeyFunction.NEXT_BLOCK)
		public void gobintlCertNumber_NextBlock()
		{
			
				if ( getBlockStatus().equals("CHANGED") )
				{
					errorMessage(GNls.Fget(toStr("GOAINTL-0122"), toStr("FORM"), toStr("*ERROR* Please Save Information before Leaving Current Block.")));
					throw new ApplicationException();
				}
				// 
				goItem(toStr("GOBINTL_NATN_CODE_BIRTH"));
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_CERT_NUMBER.KEY-PRVBLK
		 if :system.block_status = 'CHANGED' then
	  message( G$_NLS.Get('GOAINTL-0123', 'FORM','Please Save Information before Leaving Current Block.') );
	  raise form_trigger_failure;
end if;
--
go_item('GOBINTL_PASSPORT_ID');
g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_CERT_NUMBER.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", item="GOBINTL_CERT_NUMBER", function=KeyFunction.PREVIOUS_BLOCK)
		public void gobintlCertNumber_PreviousBlock()
		{
			
				if ( getBlockStatus().equals("CHANGED") )
				{
					errorMessage(GNls.Fget(toStr("GOAINTL-0123"), toStr("FORM"), toStr("*ERROR* Please Save Information before Leaving Current Block.")));
					throw new ApplicationException();
				}
				// 
				goItem(toStr("GOBINTL_PASSPORT_ID"));
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_CERT_NUMBER.KEY-DELREC
		 
EXECUTE_TRIGGER('DELETE_CERTIFICATE');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_CERT_NUMBER.KEY-DELREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DELREC", item="GOBINTL_CERT_NUMBER", function=KeyFunction.DELETE_RECORD)
		public void gobintlCertNumber_DeleteRecord()
		{
			
				executeAction("DELETE_CERTIFICATE");
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_CERT_NUMBER.KEY-CLRBLK
		 :GOBINTL_CELG_CODE := '';
:CELG_DESC := '';
:GOBINTL_CERT_NUMBER := '';
:GOBINTL_CERT_DATE_ISSUE := '';
:GOBINTL_CERT_DATE_RECEIPT := '';
:GOBINTL_ADMR_CODE := '';
:ADMR_DESC := '';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_CERT_NUMBER.KEY-CLRBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRBLK", item="GOBINTL_CERT_NUMBER", function=KeyFunction.CLEAR_BLOCK)
		public void gobintlCertNumber_keyClearBlock()
		{
				GobintlAdapter gobintlElement = (GobintlAdapter)this.getFormModel().getGobintl().getRowAdapter(true);
				if(gobintlElement != null)
				{
					gobintlElement.setGobintlCelgCode(toStr(""));
					gobintlElement.setCelgDesc(toStr(""));
					gobintlElement.setGobintlCertNumber(toStr(""));
					gobintlElement.setGobintlCertDateIssue(toDate(""));
					gobintlElement.setGobintlCertDateReceipt(toDate(""));
					gobintlElement.setGobintlAdmrCode(toStr(""));
					gobintlElement.setAdmrDesc(toStr(""));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_CERT_NUMBER.KEY-CLRREC
		 :GOBINTL_CELG_CODE := '';
:CELG_DESC := '';
:GOBINTL_CERT_NUMBER := '';
:GOBINTL_CERT_DATE_ISSUE := '';
:GOBINTL_CERT_DATE_RECEIPT := '';
:GOBINTL_ADMR_CODE := '';
:ADMR_DESC := '';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_CERT_NUMBER.KEY-CLRREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRREC", item="GOBINTL_CERT_NUMBER", function=KeyFunction.CLEAR_RECORD)
		public void gobintlCertNumber_ClearRecord()
		{
				GobintlAdapter gobintlElement = (GobintlAdapter)this.getFormModel().getGobintl().getRowAdapter(true);
				if(gobintlElement != null)
				{
					gobintlElement.setGobintlCelgCode(toStr(""));
					gobintlElement.setCelgDesc(toStr(""));
					gobintlElement.setGobintlCertNumber(toStr(""));
					gobintlElement.setGobintlCertDateIssue(toDate(""));
					gobintlElement.setGobintlCertDateReceipt(toDate(""));
					gobintlElement.setGobintlAdmrCode(toStr(""));
					gobintlElement.setAdmrDesc(toStr(""));
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_CERT_DATE_ISSUE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="GOBINTL_CERT_DATE_ISSUE", function=KeyFunction.ITEM_CHANGE)
		public void gobintlCertDateIssue_itemChange()
		{
			
				getGDateClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_CERT_DATE_ISSUE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="GOBINTL_CERT_DATE_ISSUE", function=KeyFunction.ITEM_OUT)
		public void gobintlCertDateIssue_itemOut()
		{
			
				getGDateClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_CERT_DATE_ISSUE.KEY-NEXT-ITEM
		    G$_DATE_REFORMAT ('','');
   G$_CHECK_FAILURE;
   NEXT_FIELD;
   G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_CERT_DATE_ISSUE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="GOBINTL_CERT_DATE_ISSUE", function=KeyFunction.NEXT_ITEM)
		public void gobintlCertDateIssue_keyNexItem()
		{

				nextItem();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_CERT_DATE_ISSUE.KEY-PREV-ITEM
		    G$_DATE_REFORMAT ('','');
   G$_CHECK_FAILURE;
   PREVIOUS_FIELD;
   G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_CERT_DATE_ISSUE.KEY-PREV-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PREV-ITEM", item="GOBINTL_CERT_DATE_ISSUE", function=KeyFunction.PREVIOUS_ITEM)
		public void gobintlCertDateIssue_PreviousItem()
		{

				previousItem();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_CERT_DATE_ISSUE.KEY-NXTBLK
		 if :system.block_status = 'CHANGED' then
	  message( G$_NLS.Get('GOAINTL-0124', 'FORM','Please Save Information before Leaving Current Block.') );
	  raise form_trigger_failure;
end if;
--
GO_ITEM('GOBINTL_NATN_CODE_BIRTH');
g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_CERT_DATE_ISSUE.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", item="GOBINTL_CERT_DATE_ISSUE", function=KeyFunction.NEXT_BLOCK)
		public void gobintlCertDateIssue_NextBlock()
		{
			
				if ( getBlockStatus().equals("CHANGED") )
				{
					errorMessage(GNls.Fget(toStr("GOAINTL-0124"), toStr("FORM"), toStr("*ERROR* Please Save Information before Leaving Current Block.")));
					throw new ApplicationException();
				}
				// 
				goItem(toStr("GOBINTL_NATN_CODE_BIRTH"));
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_CERT_DATE_ISSUE.KEY-PRVBLK
		 if :system.block_status = 'CHANGED' then
	  message( G$_NLS.Get('GOAINTL-0125', 'FORM','Please Save Information before Leaving Current Block.') );
	  raise form_trigger_failure;
end if;
--
go_item('GOBINTL_PASSPORT_ID');
g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_CERT_DATE_ISSUE.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", item="GOBINTL_CERT_DATE_ISSUE", function=KeyFunction.PREVIOUS_BLOCK)
		public void gobintlCertDateIssue_PreviousBlock()
		{
			
				if ( getBlockStatus().equals("CHANGED") )
				{
					errorMessage(GNls.Fget(toStr("GOAINTL-0125"), toStr("FORM"), toStr("*ERROR* Please Save Information before Leaving Current Block.")));
					throw new ApplicationException();
				}
				// 
				goItem(toStr("GOBINTL_PASSPORT_ID"));
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_CERT_DATE_ISSUE.KEY-DELREC
		 EXECUTE_TRIGGER('DELETE_CERTIFICATE');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_CERT_DATE_ISSUE.KEY-DELREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DELREC", item="GOBINTL_CERT_DATE_ISSUE", function=KeyFunction.DELETE_RECORD)
		public void gobintlCertDateIssue_DeleteRecord()
		{
			
				executeAction("DELETE_CERTIFICATE");
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_CERT_DATE_ISSUE.KEY-CLRBLK
		 :GOBINTL_CELG_CODE := '';
:CELG_DESC := '';
:GOBINTL_CERT_NUMBER := '';
:GOBINTL_CERT_DATE_ISSUE := '';
:GOBINTL_CERT_DATE_RECEIPT := '';
:GOBINTL_ADMR_CODE := '';
:ADMR_DESC := '';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_CERT_DATE_ISSUE.KEY-CLRBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRBLK", item="GOBINTL_CERT_DATE_ISSUE", function=KeyFunction.CLEAR_BLOCK)
		public void gobintlCertDateIssue_keyClearBlock()
		{
				GobintlAdapter gobintlElement = (GobintlAdapter)this.getFormModel().getGobintl().getRowAdapter(true);
				if(gobintlElement != null)
				{
					gobintlElement.setGobintlCelgCode(toStr(""));
					gobintlElement.setCelgDesc(toStr(""));
					gobintlElement.setGobintlCertNumber(toStr(""));
					gobintlElement.setGobintlCertDateIssue(toDate(""));
					gobintlElement.setGobintlCertDateReceipt(toDate(""));
					gobintlElement.setGobintlAdmrCode(toStr(""));
					gobintlElement.setAdmrDesc(toStr(""));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_CERT_DATE_ISSUE.KEY-CLRREC
		 :GOBINTL_CELG_CODE := '';
:CELG_DESC := '';
:GOBINTL_CERT_NUMBER := '';
:GOBINTL_CERT_DATE_ISSUE := '';
:GOBINTL_CERT_DATE_RECEIPT := '';
:GOBINTL_ADMR_CODE := '';
:ADMR_DESC := '';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_CERT_DATE_ISSUE.KEY-CLRREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRREC", item="GOBINTL_CERT_DATE_ISSUE", function=KeyFunction.CLEAR_RECORD)
		public void gobintlCertDateIssue_ClearRecord()
		{
				GobintlAdapter gobintlElement = (GobintlAdapter)this.getFormModel().getGobintl().getRowAdapter(true);
				if(gobintlElement != null)
				{
					gobintlElement.setGobintlCelgCode(toStr(""));
					gobintlElement.setCelgDesc(toStr(""));
					gobintlElement.setGobintlCertNumber(toStr(""));
					gobintlElement.setGobintlCertDateIssue(toDate(""));
					gobintlElement.setGobintlCertDateReceipt(toDate(""));
					gobintlElement.setGobintlAdmrCode(toStr(""));
					gobintlElement.setAdmrDesc(toStr(""));
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_CERT_DATE_RECEIPT.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="GOBINTL_CERT_DATE_RECEIPT", function=KeyFunction.ITEM_CHANGE)
		public void gobintlCertDateReceipt_itemChange()
		{
			
				getGDateClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_CERT_DATE_RECEIPT.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="GOBINTL_CERT_DATE_RECEIPT", function=KeyFunction.ITEM_OUT)
		public void gobintlCertDateReceipt_itemOut()
		{
			
				getGDateClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_CERT_DATE_RECEIPT.KEY-NEXT-ITEM
		    G$_DATE_REFORMAT ('','');
   G$_CHECK_FAILURE;
   NEXT_FIELD;
   G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_CERT_DATE_RECEIPT.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="GOBINTL_CERT_DATE_RECEIPT", function=KeyFunction.NEXT_ITEM)
		public void gobintlCertDateReceipt_keyNexItem()
		{

				nextItem();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_CERT_DATE_RECEIPT.KEY-PREV-ITEM
		    G$_DATE_REFORMAT ('','');
   G$_CHECK_FAILURE;
   PREVIOUS_FIELD;
   G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_CERT_DATE_RECEIPT.KEY-PREV-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PREV-ITEM", item="GOBINTL_CERT_DATE_RECEIPT", function=KeyFunction.PREVIOUS_ITEM)
		public void gobintlCertDateReceipt_PreviousItem()
		{

				previousItem();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_CERT_DATE_RECEIPT.KEY-NXTBLK
		 if :system.block_status = 'CHANGED' then
	  message( G$_NLS.Get('GOAINTL-0126', 'FORM','Please Save Information before Leaving Current Block.') );
	  raise form_trigger_failure;
end if;
--
GO_ITEM('GOBINTL_NATN_CODE_BIRTH');
g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_CERT_DATE_RECEIPT.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", item="GOBINTL_CERT_DATE_RECEIPT", function=KeyFunction.NEXT_BLOCK)
		public void gobintlCertDateReceipt_NextBlock()
		{
			
				if ( getBlockStatus().equals("CHANGED") )
				{
					errorMessage(GNls.Fget(toStr("GOAINTL-0126"), toStr("FORM"), toStr("*ERROR* Please Save Information before Leaving Current Block.")));
					throw new ApplicationException();
				}
				// 
				goItem(toStr("GOBINTL_NATN_CODE_BIRTH"));
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_CERT_DATE_RECEIPT.KEY-PRVBLK
		 if :system.block_status = 'CHANGED' then
	  message( G$_NLS.Get('GOAINTL-0127', 'FORM','Please Save Information before Leaving Current Block.') );
	  raise form_trigger_failure;
end if;
--
go_item('GOBINTL_PASSPORT_ID');
g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_CERT_DATE_RECEIPT.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", item="GOBINTL_CERT_DATE_RECEIPT", function=KeyFunction.PREVIOUS_BLOCK)
		public void gobintlCertDateReceipt_PreviousBlock()
		{
			
				if ( getBlockStatus().equals("CHANGED") )
				{
					errorMessage(GNls.Fget(toStr("GOAINTL-0127"), toStr("FORM"), toStr("*ERROR* Please Save Information before Leaving Current Block.")));
					throw new ApplicationException();
				}
				// 
				goItem(toStr("GOBINTL_PASSPORT_ID"));
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_CERT_DATE_RECEIPT.WHEN-VALIDATE-ITEM
		 if :gobintl_cert_date_receipt < :GOBINTL_CERT_DATE_ISSUE then
	  message( G$_NLS.Get('GOAINTL-0128', 'FORM','Certification Receipt Date Can Not Be Earlier Than Issue Date.') );
	  Raise form_trigger_failure;
end if;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_CERT_DATE_RECEIPT.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="GOBINTL_CERT_DATE_RECEIPT")
		public void gobintlCertDateReceipt_validate()
		{
				GobintlAdapter gobintlElement = (GobintlAdapter)this.getFormModel().getGobintl().getRowAdapter(true);
				if(gobintlElement != null)
				{
					if ( gobintlElement.getGobintlCertDateReceipt().lesser(gobintlElement.getGobintlCertDateIssue()) )
					{
						errorMessage(GNls.Fget(toStr("GOAINTL-0128"), toStr("FORM"), toStr("*ERROR* Certification Receipt Date Can Not Be Earlier Than Issue Date.")));
						throw new ApplicationException();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_CERT_DATE_RECEIPT.KEY-DELREC
		 EXECUTE_TRIGGER('DELETE_CERTIFICATE');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_CERT_DATE_RECEIPT.KEY-DELREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DELREC", item="GOBINTL_CERT_DATE_RECEIPT", function=KeyFunction.DELETE_RECORD)
		public void gobintlCertDateReceipt_DeleteRecord()
		{
			
				executeAction("DELETE_CERTIFICATE");
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_CERT_DATE_RECEIPT.KEY-CLRBLK
		 :GOBINTL_CELG_CODE := '';
:CELG_DESC := '';
:GOBINTL_CERT_NUMBER := '';
:GOBINTL_CERT_DATE_ISSUE := '';
:GOBINTL_CERT_DATE_RECEIPT := '';
:GOBINTL_ADMR_CODE := '';
:ADMR_DESC := '';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_CERT_DATE_RECEIPT.KEY-CLRBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRBLK", item="GOBINTL_CERT_DATE_RECEIPT", function=KeyFunction.CLEAR_BLOCK)
		public void gobintlCertDateReceipt_keyClearBlock()
		{
				GobintlAdapter gobintlElement = (GobintlAdapter)this.getFormModel().getGobintl().getRowAdapter(true);
				if(gobintlElement != null)
				{
					gobintlElement.setGobintlCelgCode(toStr(""));
					gobintlElement.setCelgDesc(toStr(""));
					gobintlElement.setGobintlCertNumber(toStr(""));
					gobintlElement.setGobintlCertDateIssue(toDate(""));
					gobintlElement.setGobintlCertDateReceipt(toDate(""));
					gobintlElement.setGobintlAdmrCode(toStr(""));
					gobintlElement.setAdmrDesc(toStr(""));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_CERT_DATE_RECEIPT.KEY-CLRREC
		 :GOBINTL_CELG_CODE := '';
:CELG_DESC := '';
:GOBINTL_CERT_NUMBER := '';
:GOBINTL_CERT_DATE_ISSUE := '';
:GOBINTL_CERT_DATE_RECEIPT := '';
:GOBINTL_ADMR_CODE := '';
:ADMR_DESC := '';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_CERT_DATE_RECEIPT.KEY-CLRREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRREC", item="GOBINTL_CERT_DATE_RECEIPT", function=KeyFunction.CLEAR_RECORD)
		public void gobintlCertDateReceipt_ClearRecord()
		{
				GobintlAdapter gobintlElement = (GobintlAdapter)this.getFormModel().getGobintl().getRowAdapter(true);
				if(gobintlElement != null)
				{
					gobintlElement.setGobintlCelgCode(toStr(""));
					gobintlElement.setCelgDesc(toStr(""));
					gobintlElement.setGobintlCertNumber(toStr(""));
					gobintlElement.setGobintlCertDateIssue(toDate(""));
					gobintlElement.setGobintlCertDateReceipt(toDate(""));
					gobintlElement.setGobintlAdmrCode(toStr(""));
					gobintlElement.setAdmrDesc(toStr(""));
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_ADMR_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="GOBINTL_ADMR_CODE")
		public void gobintlAdmrCode_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_ADMR_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="GOBINTL_ADMR_CODE", function=KeyFunction.ITEM_CHANGE)
		public void gobintlAdmrCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_ADMR_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="GOBINTL_ADMR_CODE")
		public void gobintlAdmrCode_GSearchParameters()
		{
			
				getGCodeClass().gSearchParameters();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_ADMR_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="GOBINTL_ADMR_CODE")
		public void gobintlAdmrCode_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_ADMR_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="GOBINTL_ADMR_CODE", function=KeyFunction.ITEM_OUT)
		public void gobintlAdmrCode_itemOut()
		{
			
				getGCodeClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_ADMR_CODE.KEY-NEXT-ITEM
		 BEGIN
  G$_SEARCH.CODE_KEY_NEXT_ITEM;
  G$_CHECK_FAILURE;
  GO_ITEM('GOBINTL_CELG_CODE');
end;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_ADMR_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="GOBINTL_ADMR_CODE", function=KeyFunction.NEXT_ITEM)
		public void gobintlAdmrCode_keyNexItem()
		{
			
				getTask().getGoqrpls().getGSearch().codeKeyNextItem();
				getTask().getGoqrpls().gCheckFailure();
				goItem(toStr("GOBINTL_CELG_CODE"));
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_ADMR_CODE.KEY-NXTBLK
		 if :system.block_status = 'CHANGED' then
	  message( G$_NLS.Get('GOAINTL-0129', 'FORM','Please Save Information before Leaving Current Block.') );
	  raise form_trigger_failure;
end if;
--
GO_ITEM('GOBINTL_NATN_CODE_BIRTH');
g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_ADMR_CODE.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", item="GOBINTL_ADMR_CODE", function=KeyFunction.NEXT_BLOCK)
		public void gobintlAdmrCode_NextBlock()
		{
			
				if ( getBlockStatus().equals("CHANGED") )
				{
					errorMessage(GNls.Fget(toStr("GOAINTL-0129"), toStr("FORM"), toStr("*ERROR* Please Save Information before Leaving Current Block.")));
					throw new ApplicationException();
				}
				// 
				goItem(toStr("GOBINTL_NATN_CODE_BIRTH"));
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_ADMR_CODE.KEY-PRVBLK
		 if :system.block_status = 'CHANGED' then
	  message( G$_NLS.Get('GOAINTL-0130', 'FORM','Please Save Information before Leaving Current Block.') );
	  raise form_trigger_failure;
end if;
--
go_item('GOBINTL_PASSPORT_ID');
g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_ADMR_CODE.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", item="GOBINTL_ADMR_CODE", function=KeyFunction.PREVIOUS_BLOCK)
		public void gobintlAdmrCode_PreviousBlock()
		{
			
				if ( getBlockStatus().equals("CHANGED") )
				{
					errorMessage(GNls.Fget(toStr("GOAINTL-0130"), toStr("FORM"), toStr("*ERROR* Please Save Information before Leaving Current Block.")));
					throw new ApplicationException();
				}
				// 
				goItem(toStr("GOBINTL_PASSPORT_ID"));
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_ADMR_CODE.POST-CHANGE
		 if :GOBINTL_ADMR_CODE is null then
	 :ADMR_DESC := '';
	  return;
end if;
--
BEGIN
   G$_CHECK_QUERY_MODE;
   DECLARE
      CURSOR PTI_CURSOR IS
         SELECT STVADMR_DESC
         FROM   STVADMR
         WHERE  :GOBINTL_ADMR_CODE = STVADMR_CODE;
   BEGIN
      OPEN PTI_CURSOR;
      FETCH PTI_CURSOR INTO :ADMR_DESC;
      G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND, G$_NLS.Get('GOAINTL-0131', 'FORM','*ERROR* Invalid code; press LIST for valid codes.') , TRUE);
   END;
--
   IF (:GLOBAL.QUERY_MODE = '1') THEN
      GOTO PTI_END_TRIGGER;
   END IF;
   DECLARE
      PTI_INTO_TEMP        VARCHAR2(255);
      CURSOR PTI_CURSOR IS
         SELECT ''
         FROM    GOBINTL
         WHERE  :GOBINTL_ADMR_CODE = GOBINTL_ADMR_CODE
           AND  :PIDM = GOBINTL_PIDM
           AND  :GOBINTL.ROWID <> GOBINTL.ROWID;
   BEGIN
      OPEN PTI_CURSOR;
      FETCH PTI_CURSOR INTO PTI_INTO_TEMP;
      G$_CHECK_VALUE (PTI_CURSOR%FOUND, G$_NLS.Get('GOAINTL-0132', 'FORM','*ERROR* Adm. request code used for another visa type, cannot duplicate.') 
         , TRUE);
   END;
--
   << PTI_END_TRIGGER >>
   :GLOBAL.QUERY_MODE := '0';
EXCEPTION
   WHEN FORM_TRIGGER_FAILURE THEN
      :GLOBAL.QUERY_MODE := '0';
      RAISE FORM_TRIGGER_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_ADMR_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="GOBINTL_ADMR_CODE")
		public void gobintlAdmrCode_PostChange()
		{
				GobintlAdapter gobintlElement = (GobintlAdapter)this.getFormModel().getGobintl().getRowAdapter(true);
				if(gobintlElement != null)
				{
					int rowCount = 0;
					if(gobintlElement.getGobintlAdmrCode().isNull())
						return;
					if ( gobintlElement.getGobintlAdmrCode().isNull() )
					{
						gobintlElement.setAdmrDesc(toStr(""));
						return ;
					}
					try
					{
						getTask().getGoqrpls().gCheckQueryMode();
						{
							String sqlptiCursor = "SELECT STVADMR_DESC " +
		" FROM STVADMR " +
		" WHERE :GOBINTL_ADMR_CODE = STVADMR_CODE ";
							DataCursor ptiCursor = new DataCursor(sqlptiCursor);
							try {
								//Setting query parameters
								ptiCursor.addParameter("GOBINTL_ADMR_CODE", gobintlElement.getGobintlAdmrCode());
								
								ptiCursor.open();
								ResultSet ptiCursorResults = ptiCursor.fetchInto();
								if ( ptiCursorResults != null ) {
									gobintlElement.setAdmrDesc(ptiCursorResults.getStr(0));
								}
								getTask().getGoqrpls().gCheckValue(toBool(ptiCursor.notFound()), GNls.Fget(toStr("GOAINTL-0131"), toStr("FORM"), toStr("*ERROR* Invalid code; press LIST for valid codes.")), toBool(NBool.True));
							}
							finally{
								ptiCursor.close();
							}
						}
						// 
						if ((getGlobal("QUERY_MODE").equals("1")))
						{
							setGlobal("QUERY_MODE", toStr("0"));
						}
						{
							NString ptiIntoTemp= NString.getNull();
							String sqlptiCursor = "SELECT '' " +
		" FROM GOBINTL " +
		" WHERE :GOBINTL_ADMR_CODE = GOBINTL_ADMR_CODE AND :PIDM = GOBINTL_PIDM AND :GOBINTL_ROWID <> GOBINTL.ROWID ";
							DataCursor ptiCursor = new DataCursor(sqlptiCursor);
							try {
								//Setting query parameters
								ptiCursor.addParameter("GOBINTL_ADMR_CODE", gobintlElement.getGobintlAdmrCode());
								ptiCursor.addParameter("PIDM", getFormModel().getKeyBlock().getPidm());
								ptiCursor.addParameter("GOBINTL_ROWID", toStr(DbManager.getDataBaseFactory().rowidToString(gobintlElement.getROWID())));
								
								ptiCursor.open();
								ResultSet ptiCursorResults = ptiCursor.fetchInto();
								if ( ptiCursorResults != null ) {
									ptiIntoTemp = ptiCursorResults.getStr(0);
								}
								getTask().getGoqrpls().gCheckValue(toBool(ptiCursor.found()), GNls.Fget(toStr("GOAINTL-0132"), toStr("FORM"), toStr("*ERROR* Adm. request code used for another visa type, cannot duplicate.")), toBool(NBool.True));
							}
							finally{
								ptiCursor.close();
							}
						}
						
					}
					catch(ApplicationException e)
					{
						setGlobal("QUERY_MODE", toStr("0"));
						throw new ApplicationException();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_ADMR_CODE.KEY-LISTVAL
		 G$_DISPLAY_LOV('','');
--go_item('GOBINTL_CELG_CODE');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_ADMR_CODE.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="GOBINTL_ADMR_CODE", function=KeyFunction.LIST_VALUES)
		public void gobintlAdmrCode_ListValues()
		{
			
				getTask().getGoqrpls().gDisplayLov(toStr(""), toStr(""));
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_ADMR_CODE.KEY-DELREC
		 
EXECUTE_TRIGGER('DELETE_CERTIFICATE');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_ADMR_CODE.KEY-DELREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DELREC", item="GOBINTL_ADMR_CODE", function=KeyFunction.DELETE_RECORD)
		public void gobintlAdmrCode_DeleteRecord()
		{
			
				executeAction("DELETE_CERTIFICATE");
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_ADMR_CODE.KEY-CLRBLK
		 :GOBINTL_CELG_CODE := '';
:CELG_DESC := '';
:GOBINTL_CERT_NUMBER := '';
:GOBINTL_CERT_DATE_ISSUE := '';
:GOBINTL_CERT_DATE_RECEIPT := '';
:GOBINTL_ADMR_CODE := '';
:ADMR_DESC := '';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_ADMR_CODE.KEY-CLRBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRBLK", item="GOBINTL_ADMR_CODE", function=KeyFunction.CLEAR_BLOCK)
		public void gobintlAdmrCode_keyClearBlock()
		{
				GobintlAdapter gobintlElement = (GobintlAdapter)this.getFormModel().getGobintl().getRowAdapter(true);
				if(gobintlElement != null)
				{
					gobintlElement.setGobintlCelgCode(toStr(""));
					gobintlElement.setCelgDesc(toStr(""));
					gobintlElement.setGobintlCertNumber(toStr(""));
					gobintlElement.setGobintlCertDateIssue(toDate(""));
					gobintlElement.setGobintlCertDateReceipt(toDate(""));
					gobintlElement.setGobintlAdmrCode(toStr(""));
					gobintlElement.setAdmrDesc(toStr(""));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_ADMR_CODE.KEY-CLRREC
		 :GOBINTL_CELG_CODE := '';
:CELG_DESC := '';
:GOBINTL_CERT_NUMBER := '';
:GOBINTL_CERT_DATE_ISSUE := '';
:GOBINTL_CERT_DATE_RECEIPT := '';
:GOBINTL_ADMR_CODE := '';
:ADMR_DESC := '';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_ADMR_CODE.KEY-CLRREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRREC", item="GOBINTL_ADMR_CODE", function=KeyFunction.CLEAR_RECORD)
		public void gobintlAdmrCode_ClearRecord()
		{
				GobintlAdapter gobintlElement = (GobintlAdapter)this.getFormModel().getGobintl().getRowAdapter(true);
				if(gobintlElement != null)
				{
					gobintlElement.setGobintlCelgCode(toStr(""));
					gobintlElement.setCelgDesc(toStr(""));
					gobintlElement.setGobintlCertNumber(toStr(""));
					gobintlElement.setGobintlCertDateIssue(toDate(""));
					gobintlElement.setGobintlCertDateReceipt(toDate(""));
					gobintlElement.setGobintlAdmrCode(toStr(""));
					gobintlElement.setAdmrDesc(toStr(""));
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ADMR_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="ADMR_DESC", function=KeyFunction.ITEM_CHANGE)
		public void admrDesc_itemChange()
		{
			
				getGDescClass().itemChange();
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_NATN_CODE_BIRTH.G$_SEARCH_PARAMETERS
		 G$_Search.Parameters('STVNATN_CODE','STVNATN_NATION','');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_NATN_CODE_BIRTH.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="GOBINTL_NATN_CODE_BIRTH")
		public void gobintlNatnCodeBirth_GSearchParameters()
		{
			
				getTask().getGoqrpls().getGSearch().parameters(toStr("STVNATN_CODE"), toStr("STVNATN_NATION"), toStr(""));
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_NATN_CODE_BIRTH.POST-TEXT-ITEM
		 G$_Search.Post_Text_Code;
IF :GOBINTL_NATN_CODE_BIRTH IS NULL THEN
   :BIRTH_NATN_DESC := '';
END IF;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_NATN_CODE_BIRTH.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="GOBINTL_NATN_CODE_BIRTH", function=KeyFunction.ITEM_OUT)
		public void gobintlNatnCodeBirth_itemOut()
		{
				GobintlAdapter gobintlElement = (GobintlAdapter)this.getFormModel().getGobintl().getRowAdapter(true);
				if(gobintlElement != null)
				{
					getTask().getGoqrpls().getGSearch().postTextCode();
					if ( gobintlElement.getGobintlNatnCodeBirth().isNull() )
					{
						gobintlElement.setBirthNatnDesc(toStr(""));
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_NATN_CODE_BIRTH.KEY-PREV-ITEM
		 go_item('GOBINTL_SIGNATURE_IND');
g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_NATN_CODE_BIRTH.KEY-PREV-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PREV-ITEM", item="GOBINTL_NATN_CODE_BIRTH", function=KeyFunction.PREVIOUS_ITEM)
		public void gobintlNatnCodeBirth_PreviousItem()
		{
			
				goItem(toStr("GOBINTL_SIGNATURE_IND"));
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_NATN_CODE_BIRTH.KEY-PRVBLK
		 if :system.block_status = 'CHANGED' then
	  message( G$_NLS.Get('GOAINTL-0133', 'FORM','Please Save Information before Leaving Current Block.') );
	  raise form_trigger_failure;
end if;
--
go_item('GOBINTL_CELG_CODE');
g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_NATN_CODE_BIRTH.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", item="GOBINTL_NATN_CODE_BIRTH", function=KeyFunction.PREVIOUS_BLOCK)
		public void gobintlNatnCodeBirth_PreviousBlock()
		{
			
				if ( getBlockStatus().equals("CHANGED") )
				{
					errorMessage(GNls.Fget(toStr("GOAINTL-0133"), toStr("FORM"), toStr("*ERROR* Please Save Information before Leaving Current Block.")));
					throw new ApplicationException();
				}
				// 
				goItem(toStr("GOBINTL_CELG_CODE"));
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_NATN_CODE_BIRTH.KEY-NXTBLK
		 if :system.block_status = 'CHANGED' then
	  message( G$_NLS.Get('GOAINTL-0134', 'FORM','Please Save Information before Leaving Current Block.') );
	  raise form_trigger_failure;
end if;
--
go_block('gorvisa');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_NATN_CODE_BIRTH.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", item="GOBINTL_NATN_CODE_BIRTH", function=KeyFunction.NEXT_BLOCK)
		public void gobintlNatnCodeBirth_NextBlock()
		{
			
				if ( getBlockStatus().equals("CHANGED") )
				{
					errorMessage(GNls.Fget(toStr("GOAINTL-0134"), toStr("FORM"), toStr("*ERROR* Please Save Information before Leaving Current Block.")));
					throw new ApplicationException();
				}
				// 
				goBlock(toStr("gorvisa"));
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_NATN_CODE_BIRTH.POST-CHANGE
		 if :GOBINTL_NATN_CODE_BIRTH is null then
	 :BIRTH_NATN_DESC := '';
	  return;
end if;
--
BEGIN
   G$_CHECK_QUERY_MODE;
   DECLARE
      CURSOR PTI_CURSOR IS
         SELECT STVNATN_NATION
         FROM   STVNATN
         WHERE  STVNATN_CODE = :GOBINTL_NATN_CODE_BIRTH;
   BEGIN
      OPEN PTI_CURSOR;
      FETCH PTI_CURSOR INTO :GOBINTL.BIRTH_NATN_DESC;
      G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND, G$_NLS.Get('GOAINTL-0135', 'FORM','*ERROR* Invalid code; press LIST for valid codes') , TRUE);
   END;
   :GLOBAL.QUERY_MODE := '0';
   EXCEPTION
   WHEN FORM_TRIGGER_FAILURE THEN
      :GLOBAL.QUERY_MODE := '0';
      RAISE FORM_TRIGGER_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_NATN_CODE_BIRTH.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="GOBINTL_NATN_CODE_BIRTH")
		public void gobintlNatnCodeBirth_PostChange()
		{
				GobintlAdapter gobintlElement = (GobintlAdapter)this.getFormModel().getGobintl().getRowAdapter(true);
				if(gobintlElement != null)
				{
					int rowCount = 0;
					if(gobintlElement.getGobintlNatnCodeBirth().isNull())
						return;
					if ( gobintlElement.getGobintlNatnCodeBirth().isNull() )
					{
						gobintlElement.setBirthNatnDesc(toStr(""));
						return ;
					}
					try
					{
						getTask().getGoqrpls().gCheckQueryMode();
						{
							String sqlptiCursor = "SELECT STVNATN_NATION " +
		" FROM STVNATN " +
		" WHERE STVNATN_CODE = :GOBINTL_NATN_CODE_BIRTH ";
							DataCursor ptiCursor = new DataCursor(sqlptiCursor);
							try {
								//Setting query parameters
								ptiCursor.addParameter("GOBINTL_NATN_CODE_BIRTH", gobintlElement.getGobintlNatnCodeBirth());
								
								ptiCursor.open();
								ResultSet ptiCursorResults = ptiCursor.fetchInto();
								if ( ptiCursorResults != null ) {
									gobintlElement.setBirthNatnDesc(ptiCursorResults.getStr(0));
								}
								getTask().getGoqrpls().gCheckValue(toBool(ptiCursor.notFound()), GNls.Fget(toStr("GOAINTL-0135"), toStr("FORM"), toStr("*ERROR* Invalid code; press LIST for valid codes")), toBool(NBool.True));
							}
							finally{
								ptiCursor.close();
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
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_NATN_CODE_BIRTH.KEY-DELREC
		 
EXECUTE_TRIGGER('DELETE_NATIONALITY');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_NATN_CODE_BIRTH.KEY-DELREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DELREC", item="GOBINTL_NATN_CODE_BIRTH", function=KeyFunction.DELETE_RECORD)
		public void gobintlNatnCodeBirth_DeleteRecord()
		{
			
				executeAction("DELETE_NATIONALITY");
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_NATN_CODE_BIRTH.KEY-CLRBLK
		 :GOBINTL_NATN_CODE_BIRTH := '';
:BIRTH_NATN_DESC := '';
:GOBINTL_NATN_CODE_LEGAL := '';
:LEGAL_NATN_DESC := '';
:GOBINTL_LANG_CODE := '';
:LANG_DESC := '';
:GOBINTL_SPON_CODE := '';
:SPON_DESC := '';
:GOBINTL_EMPT_CODE := '';
:EMPT_DESC := '';
:GOBINTL_FOREIGN_SSN := '';
:GOBINTL_SPOUSE_IND := 'T';
:GOBINTL_CHILD_NUMBER := '';
:GOBINTL_SIGNATURE_IND := 'T';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_NATN_CODE_BIRTH.KEY-CLRBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRBLK", item="GOBINTL_NATN_CODE_BIRTH", function=KeyFunction.CLEAR_BLOCK)
		public void gobintlNatnCodeBirth_keyClearBlock()
		{
				GobintlAdapter gobintlElement = (GobintlAdapter)this.getFormModel().getGobintl().getRowAdapter(true);
				if(gobintlElement != null)
				{
					gobintlElement.setGobintlNatnCodeBirth(toStr(""));
					gobintlElement.setBirthNatnDesc(toStr(""));
					gobintlElement.setGobintlNatnCodeLegal(toStr(""));
					gobintlElement.setLegalNatnDesc(toStr(""));
					gobintlElement.setGobintlLangCode(toStr(""));
					gobintlElement.setLangDesc(toStr(""));
					gobintlElement.setGobintlSponCode(toStr(""));
					gobintlElement.setSponDesc(toStr(""));
					gobintlElement.setGobintlEmptCode(toStr(""));
					gobintlElement.setEmptDesc(toStr(""));
					gobintlElement.setGobintlForeignSsn(toStr(""));
					gobintlElement.setGobintlSpouseInd(toStr("T"));
					gobintlElement.setGobintlChildNumber(toNumber(""));
					gobintlElement.setGobintlSignatureInd(toStr("T"));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_NATN_CODE_BIRTH.KEY-CLRREC
		 :GOBINTL_NATN_CODE_BIRTH := '';
:BIRTH_NATN_DESC := '';
:GOBINTL_NATN_CODE_LEGAL := '';
:LEGAL_NATN_DESC := '';
:GOBINTL_LANG_CODE := '';
:LANG_DESC := '';
:GOBINTL_SPON_CODE := '';
:SPON_DESC := '';
:GOBINTL_EMPT_CODE := '';
:EMPT_DESC := '';
:GOBINTL_FOREIGN_SSN := '';
:GOBINTL_SPOUSE_IND := 'T';
:GOBINTL_CHILD_NUMBER := '';
:GOBINTL_SIGNATURE_IND := 'T';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_NATN_CODE_BIRTH.KEY-CLRREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRREC", item="GOBINTL_NATN_CODE_BIRTH", function=KeyFunction.CLEAR_RECORD)
		public void gobintlNatnCodeBirth_ClearRecord()
		{
				GobintlAdapter gobintlElement = (GobintlAdapter)this.getFormModel().getGobintl().getRowAdapter(true);
				if(gobintlElement != null)
				{
					gobintlElement.setGobintlNatnCodeBirth(toStr(""));
					gobintlElement.setBirthNatnDesc(toStr(""));
					gobintlElement.setGobintlNatnCodeLegal(toStr(""));
					gobintlElement.setLegalNatnDesc(toStr(""));
					gobintlElement.setGobintlLangCode(toStr(""));
					gobintlElement.setLangDesc(toStr(""));
					gobintlElement.setGobintlSponCode(toStr(""));
					gobintlElement.setSponDesc(toStr(""));
					gobintlElement.setGobintlEmptCode(toStr(""));
					gobintlElement.setEmptDesc(toStr(""));
					gobintlElement.setGobintlForeignSsn(toStr(""));
					gobintlElement.setGobintlSpouseInd(toStr("T"));
					gobintlElement.setGobintlChildNumber(toNumber(""));
					gobintlElement.setGobintlSignatureInd(toStr("T"));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_NATN_CODE_LEGAL.G$_SEARCH_PARAMETERS
		 G$_Search.Parameters('STVNATN_CODE','STVNATN_NATION','');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_NATN_CODE_LEGAL.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="GOBINTL_NATN_CODE_LEGAL")
		public void gobintlNatnCodeLegal_GSearchParameters()
		{
			
				getTask().getGoqrpls().getGSearch().parameters(toStr("STVNATN_CODE"), toStr("STVNATN_NATION"), toStr(""));
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_NATN_CODE_LEGAL.POST-TEXT-ITEM
		 G$_Search.Post_Text_Code;
IF :GOBINTL_NATN_CODE_LEGAL IS NULL THEN
   :LEGAL_NATN_DESC := '';
END IF;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_NATN_CODE_LEGAL.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="GOBINTL_NATN_CODE_LEGAL", function=KeyFunction.ITEM_OUT)
		public void gobintlNatnCodeLegal_itemOut()
		{
				GobintlAdapter gobintlElement = (GobintlAdapter)this.getFormModel().getGobintl().getRowAdapter(true);
				if(gobintlElement != null)
				{
					getTask().getGoqrpls().getGSearch().postTextCode();
					if ( gobintlElement.getGobintlNatnCodeLegal().isNull() )
					{
						gobintlElement.setLegalNatnDesc(toStr(""));
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_NATN_CODE_LEGAL.KEY-NXTBLK
		 if :system.block_status = 'CHANGED' then
	  message( G$_NLS.Get('GOAINTL-0136', 'FORM','Please Save Information before Leaving Current Block.') );
	  raise form_trigger_failure;
end if;
--
go_block('gorvisa');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_NATN_CODE_LEGAL.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", item="GOBINTL_NATN_CODE_LEGAL", function=KeyFunction.NEXT_BLOCK)
		public void gobintlNatnCodeLegal_NextBlock()
		{
			
				if ( getBlockStatus().equals("CHANGED") )
				{
					errorMessage(GNls.Fget(toStr("GOAINTL-0136"), toStr("FORM"), toStr("*ERROR* Please Save Information before Leaving Current Block.")));
					throw new ApplicationException();
				}
				// 
				goBlock(toStr("gorvisa"));
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_NATN_CODE_LEGAL.KEY-PRVBLK
		 if :system.block_status = 'CHANGED' then
	  message( G$_NLS.Get('GOAINTL-0137', 'FORM','Please Save Information before Leaving Current Block.') );
	  raise form_trigger_failure;
end if;
--
go_item('GOBINTL_CELG_CODE');
g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_NATN_CODE_LEGAL.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", item="GOBINTL_NATN_CODE_LEGAL", function=KeyFunction.PREVIOUS_BLOCK)
		public void gobintlNatnCodeLegal_PreviousBlock()
		{
			
				if ( getBlockStatus().equals("CHANGED") )
				{
					errorMessage(GNls.Fget(toStr("GOAINTL-0137"), toStr("FORM"), toStr("*ERROR* Please Save Information before Leaving Current Block.")));
					throw new ApplicationException();
				}
				// 
				goItem(toStr("GOBINTL_CELG_CODE"));
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_NATN_CODE_LEGAL.POST-CHANGE
		 if :GOBINTL_NATN_CODE_LEGAL is null then
	 :LEGAL_NATN_DESC := '';
	  return;
end if;
--
BEGIN
   G$_CHECK_QUERY_MODE;
   DECLARE
      CURSOR PTI_CURSOR IS
         SELECT STVNATN_NATION
         FROM   STVNATN
         WHERE  STVNATN_CODE = :GOBINTL_NATN_CODE_LEGAL;
   BEGIN
      OPEN PTI_CURSOR;
      FETCH PTI_CURSOR INTO :GOBINTL.LEGAL_NATN_DESC;
      G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND, G$_NLS.Get('GOAINTL-0138', 'FORM','*ERROR* Invalid code; press LIST for valid codes') , TRUE);
   END;
   :GLOBAL.QUERY_MODE := '0';
   EXCEPTION
   WHEN FORM_TRIGGER_FAILURE THEN
      :GLOBAL.QUERY_MODE := '0';
      RAISE FORM_TRIGGER_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_NATN_CODE_LEGAL.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="GOBINTL_NATN_CODE_LEGAL")
		public void gobintlNatnCodeLegal_PostChange()
		{
				GobintlAdapter gobintlElement = (GobintlAdapter)this.getFormModel().getGobintl().getRowAdapter(true);
				if(gobintlElement != null)
				{
					int rowCount = 0;
					if(gobintlElement.getGobintlNatnCodeLegal().isNull())
						return;
					if ( gobintlElement.getGobintlNatnCodeLegal().isNull() )
					{
						gobintlElement.setLegalNatnDesc(toStr(""));
						return ;
					}
					try
					{
						getTask().getGoqrpls().gCheckQueryMode();
						{
							String sqlptiCursor = "SELECT STVNATN_NATION " +
		" FROM STVNATN " +
		" WHERE STVNATN_CODE = :GOBINTL_NATN_CODE_LEGAL ";
							DataCursor ptiCursor = new DataCursor(sqlptiCursor);
							try {
								//Setting query parameters
								ptiCursor.addParameter("GOBINTL_NATN_CODE_LEGAL", gobintlElement.getGobintlNatnCodeLegal());
								
								ptiCursor.open();
								ResultSet ptiCursorResults = ptiCursor.fetchInto();
								if ( ptiCursorResults != null ) {
									gobintlElement.setLegalNatnDesc(ptiCursorResults.getStr(0));
								}
								getTask().getGoqrpls().gCheckValue(toBool(ptiCursor.notFound()), GNls.Fget(toStr("GOAINTL-0138"), toStr("FORM"), toStr("*ERROR* Invalid code; press LIST for valid codes")), toBool(NBool.True));
							}
							finally{
								ptiCursor.close();
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
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_NATN_CODE_LEGAL.KEY-DELREC
		 
EXECUTE_TRIGGER('DELETE_NATIONALITY');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_NATN_CODE_LEGAL.KEY-DELREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DELREC", item="GOBINTL_NATN_CODE_LEGAL", function=KeyFunction.DELETE_RECORD)
		public void gobintlNatnCodeLegal_DeleteRecord()
		{
			
				executeAction("DELETE_NATIONALITY");
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_NATN_CODE_LEGAL.KEY-CLRBLK
		 :GOBINTL_NATN_CODE_BIRTH := '';
:BIRTH_NATN_DESC := '';
:GOBINTL_NATN_CODE_LEGAL := '';
:LEGAL_NATN_DESC := '';
:GOBINTL_LANG_CODE := '';
:LANG_DESC := '';
:GOBINTL_SPON_CODE := '';
:SPON_DESC := '';
:GOBINTL_EMPT_CODE := '';
:EMPT_DESC := '';
:GOBINTL_FOREIGN_SSN := '';
:GOBINTL_SPOUSE_IND := 'T';
:GOBINTL_CHILD_NUMBER := '';
:GOBINTL_SIGNATURE_IND := 'T';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_NATN_CODE_LEGAL.KEY-CLRBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRBLK", item="GOBINTL_NATN_CODE_LEGAL", function=KeyFunction.CLEAR_BLOCK)
		public void gobintlNatnCodeLegal_keyClearBlock()
		{
				GobintlAdapter gobintlElement = (GobintlAdapter)this.getFormModel().getGobintl().getRowAdapter(true);
				if( gobintlElement != null)
				{
					gobintlElement.setGobintlNatnCodeBirth(toStr(""));
					gobintlElement.setBirthNatnDesc(toStr(""));
					gobintlElement.setGobintlNatnCodeLegal(toStr(""));
					gobintlElement.setLegalNatnDesc(toStr(""));
					gobintlElement.setGobintlLangCode(toStr(""));
					gobintlElement.setLangDesc(toStr(""));
					gobintlElement.setGobintlSponCode(toStr(""));
					gobintlElement.setSponDesc(toStr(""));
					gobintlElement.setGobintlEmptCode(toStr(""));
					gobintlElement.setEmptDesc(toStr(""));
					gobintlElement.setGobintlForeignSsn(toStr(""));
					gobintlElement.setGobintlSpouseInd(toStr("T"));
					gobintlElement.setGobintlChildNumber(toNumber(""));
					gobintlElement.setGobintlSignatureInd(toStr("T"));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_NATN_CODE_LEGAL.KEY-CLRREC
		 :GOBINTL_NATN_CODE_BIRTH := '';
:BIRTH_NATN_DESC := '';
:GOBINTL_NATN_CODE_LEGAL := '';
:LEGAL_NATN_DESC := '';
:GOBINTL_LANG_CODE := '';
:LANG_DESC := '';
:GOBINTL_SPON_CODE := '';
:SPON_DESC := '';
:GOBINTL_EMPT_CODE := '';
:EMPT_DESC := '';
:GOBINTL_FOREIGN_SSN := '';
:GOBINTL_SPOUSE_IND := 'T';
:GOBINTL_CHILD_NUMBER := '';
:GOBINTL_SIGNATURE_IND := 'T';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_NATN_CODE_LEGAL.KEY-CLRREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRREC", item="GOBINTL_NATN_CODE_LEGAL", function=KeyFunction.CLEAR_RECORD)
		public void gobintlNatnCodeLegal_ClearRecord()
		{
				GobintlAdapter gobintlElement = (GobintlAdapter)this.getFormModel().getGobintl().getRowAdapter(true);
				if( gobintlElement != null)
				{
					gobintlElement.setGobintlNatnCodeBirth(toStr(""));
					gobintlElement.setBirthNatnDesc(toStr(""));
					gobintlElement.setGobintlNatnCodeLegal(toStr(""));
					gobintlElement.setLegalNatnDesc(toStr(""));
					gobintlElement.setGobintlLangCode(toStr(""));
					gobintlElement.setLangDesc(toStr(""));
					gobintlElement.setGobintlSponCode(toStr(""));
					gobintlElement.setSponDesc(toStr(""));
					gobintlElement.setGobintlEmptCode(toStr(""));
					gobintlElement.setEmptDesc(toStr(""));
					gobintlElement.setGobintlForeignSsn(toStr(""));
					gobintlElement.setGobintlSpouseInd(toStr("T"));
					gobintlElement.setGobintlChildNumber(toNumber(""));
					gobintlElement.setGobintlSignatureInd(toStr("T"));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_LANG_CODE.KEY-NXTBLK
		 if :system.block_status = 'CHANGED' then
	  message( G$_NLS.Get('GOAINTL-0139', 'FORM','Please Save Information before Leaving Current Block.') );
	  raise form_trigger_failure;
end if;
--
go_block('gorvisa');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_LANG_CODE.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", item="GOBINTL_LANG_CODE", function=KeyFunction.NEXT_BLOCK)
		public void gobintlLangCode_NextBlock()
		{
			
				if ( getBlockStatus().equals("CHANGED") )
				{
					errorMessage(GNls.Fget(toStr("GOAINTL-0139"), toStr("FORM"), toStr("*ERROR* Please Save Information before Leaving Current Block.")));
					throw new ApplicationException();
				}
				// 
				goBlock(toStr("gorvisa"));
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_LANG_CODE.KEY-PRVBLK
		 if :system.block_status = 'CHANGED' then
	  message( G$_NLS.Get('GOAINTL-0140', 'FORM','Please Save Information before Leaving Current Block.') );
	  raise form_trigger_failure;
end if;
--
go_item('GOBINTL_CELG_CODE');
g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_LANG_CODE.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", item="GOBINTL_LANG_CODE", function=KeyFunction.PREVIOUS_BLOCK)
		public void gobintlLangCode_PreviousBlock()
		{
			
				if ( getBlockStatus().equals("CHANGED") )
				{
					errorMessage(GNls.Fget(toStr("GOAINTL-0140"), toStr("FORM"), toStr("*ERROR* Please Save Information before Leaving Current Block.")));
					throw new ApplicationException();
				}
				// 
				goItem(toStr("GOBINTL_CELG_CODE"));
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_LANG_CODE.POST-CHANGE
		 if :GOBINTL_LANG_CODE is null then
	 :LANG_DESC := '';
	  return;
end if;
--
BEGIN
   G$_CHECK_QUERY_MODE;
   DECLARE
      CURSOR PTI_CURSOR IS
         SELECT STVLANG_DESC
         FROM   STVLANG
         WHERE  STVLANG_CODE = :GOBINTL_LANG_CODE;
   BEGIN
      OPEN PTI_CURSOR;
      FETCH PTI_CURSOR INTO :GOBINTL.LANG_DESC;
      G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND, G$_NLS.Get('GOAINTL-0141', 'FORM','*ERROR* Invalid code; press LIST for valid codes') , TRUE);
   END;
   :GLOBAL.QUERY_MODE := '0';
   EXCEPTION
   WHEN FORM_TRIGGER_FAILURE THEN
      :GLOBAL.QUERY_MODE := '0';
      RAISE FORM_TRIGGER_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_LANG_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="GOBINTL_LANG_CODE")
		public void gobintlLangCode_PostChange()
		{
				GobintlAdapter gobintlElement = (GobintlAdapter)this.getFormModel().getGobintl().getRowAdapter(true);
				if(gobintlElement != null)
				{
					int rowCount = 0;
					if(gobintlElement.getGobintlLangCode().isNull())
						return;
					if ( gobintlElement.getGobintlLangCode().isNull() )
					{
						gobintlElement.setLangDesc(toStr(""));
						return ;
					}
					try
					{
						getTask().getGoqrpls().gCheckQueryMode();
						{
							String sqlptiCursor = "SELECT STVLANG_DESC " +
		" FROM STVLANG " +
		" WHERE STVLANG_CODE = :GOBINTL_LANG_CODE ";
							DataCursor ptiCursor = new DataCursor(sqlptiCursor);
							try {
								//Setting query parameters
								ptiCursor.addParameter("GOBINTL_LANG_CODE", gobintlElement.getGobintlLangCode());
								
								ptiCursor.open();
								ResultSet ptiCursorResults = ptiCursor.fetchInto();
								if ( ptiCursorResults != null ) {
									gobintlElement.setLangDesc(ptiCursorResults.getStr(0));
								}
								getTask().getGoqrpls().gCheckValue(toBool(ptiCursor.notFound()), GNls.Fget(toStr("GOAINTL-0141"), toStr("FORM"), toStr("*ERROR* Invalid code; press LIST for valid codes")), toBool(NBool.True));
							}
							finally{
								ptiCursor.close();
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
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_LANG_CODE.KEY-DELREC
		 
EXECUTE_TRIGGER('DELETE_NATIONALITY');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_LANG_CODE.KEY-DELREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DELREC", item="GOBINTL_LANG_CODE", function=KeyFunction.DELETE_RECORD)
		public void gobintlLangCode_DeleteRecord()
		{
			
				executeAction("DELETE_NATIONALITY");
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_LANG_CODE.KEY-CLRBLK
		 :GOBINTL_NATN_CODE_BIRTH := '';
:BIRTH_NATN_DESC := '';
:GOBINTL_NATN_CODE_LEGAL := '';
:LEGAL_NATN_DESC := '';
:GOBINTL_LANG_CODE := '';
:LANG_DESC := '';
:GOBINTL_SPON_CODE := '';
:SPON_DESC := '';
:GOBINTL_EMPT_CODE := '';
:EMPT_DESC := '';
:GOBINTL_FOREIGN_SSN := '';
:GOBINTL_SPOUSE_IND := 'T';
:GOBINTL_CHILD_NUMBER := '';
:GOBINTL_SIGNATURE_IND := 'T';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_LANG_CODE.KEY-CLRBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRBLK", item="GOBINTL_LANG_CODE", function=KeyFunction.CLEAR_BLOCK)
		public void gobintlLangCode_keyClearBlock()
		{
				GobintlAdapter gobintlElement = (GobintlAdapter)this.getFormModel().getGobintl().getRowAdapter(true);
				if(gobintlElement != null)
				{
					gobintlElement.setGobintlNatnCodeBirth(toStr(""));
					gobintlElement.setBirthNatnDesc(toStr(""));
					gobintlElement.setGobintlNatnCodeLegal(toStr(""));
					gobintlElement.setLegalNatnDesc(toStr(""));
					gobintlElement.setGobintlLangCode(toStr(""));
					gobintlElement.setLangDesc(toStr(""));
					gobintlElement.setGobintlSponCode(toStr(""));
					gobintlElement.setSponDesc(toStr(""));
					gobintlElement.setGobintlEmptCode(toStr(""));
					gobintlElement.setEmptDesc(toStr(""));
					gobintlElement.setGobintlForeignSsn(toStr(""));
					gobintlElement.setGobintlSpouseInd(toStr("T"));
					gobintlElement.setGobintlChildNumber(toNumber(""));
					gobintlElement.setGobintlSignatureInd(toStr("T"));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_LANG_CODE.KEY-CLRREC
		 :GOBINTL_NATN_CODE_BIRTH := '';
:BIRTH_NATN_DESC := '';
:GOBINTL_NATN_CODE_LEGAL := '';
:LEGAL_NATN_DESC := '';
:GOBINTL_LANG_CODE := '';
:LANG_DESC := '';
:GOBINTL_SPON_CODE := '';
:SPON_DESC := '';
:GOBINTL_EMPT_CODE := '';
:EMPT_DESC := '';
:GOBINTL_FOREIGN_SSN := '';
:GOBINTL_SPOUSE_IND := 'T';
:GOBINTL_CHILD_NUMBER := '';
:GOBINTL_SIGNATURE_IND := 'T';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_LANG_CODE.KEY-CLRREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRREC", item="GOBINTL_LANG_CODE", function=KeyFunction.CLEAR_RECORD)
		public void gobintlLangCode_ClearRecord()
		{
				GobintlAdapter gobintlElement = (GobintlAdapter)this.getFormModel().getGobintl().getRowAdapter(true);
				if(gobintlElement != null)
				{
					gobintlElement.setGobintlNatnCodeBirth(toStr(""));
					gobintlElement.setBirthNatnDesc(toStr(""));
					gobintlElement.setGobintlNatnCodeLegal(toStr(""));
					gobintlElement.setLegalNatnDesc(toStr(""));
					gobintlElement.setGobintlLangCode(toStr(""));
					gobintlElement.setLangDesc(toStr(""));
					gobintlElement.setGobintlSponCode(toStr(""));
					gobintlElement.setSponDesc(toStr(""));
					gobintlElement.setGobintlEmptCode(toStr(""));
					gobintlElement.setEmptDesc(toStr(""));
					gobintlElement.setGobintlForeignSsn(toStr(""));
					gobintlElement.setGobintlSpouseInd(toStr("T"));
					gobintlElement.setGobintlChildNumber(toNumber(""));
					gobintlElement.setGobintlSignatureInd(toStr("T"));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_SPON_CODE.KEY-NXTBLK
		 if :system.block_status = 'CHANGED' then
	  message( G$_NLS.Get('GOAINTL-0142', 'FORM','Please Save Information before Leaving Current Block.') );
	  raise form_trigger_failure;
end if;
--
go_block('gorvisa');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_SPON_CODE.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", item="GOBINTL_SPON_CODE", function=KeyFunction.NEXT_BLOCK)
		public void gobintlSponCode_NextBlock()
		{
			
				if ( getBlockStatus().equals("CHANGED") )
				{
					errorMessage(GNls.Fget(toStr("GOAINTL-0142"), toStr("FORM"), toStr("*ERROR* Please Save Information before Leaving Current Block.")));
					throw new ApplicationException();
				}
				// 
				goBlock(toStr("gorvisa"));
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_SPON_CODE.KEY-PRVBLK
		 if :system.block_status = 'CHANGED' then
	  message( G$_NLS.Get('GOAINTL-0143', 'FORM','Please Save Information before Leaving Current Block.') );
	  raise form_trigger_failure;
end if;
--
go_item('GOBINTL_CELG_CODE');
g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_SPON_CODE.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", item="GOBINTL_SPON_CODE", function=KeyFunction.PREVIOUS_BLOCK)
		public void gobintlSponCode_PreviousBlock()
		{
			
				if ( getBlockStatus().equals("CHANGED") )
				{
					errorMessage(GNls.Fget(toStr("GOAINTL-0143"), toStr("FORM"), toStr("*ERROR* Please Save Information before Leaving Current Block.")));
					throw new ApplicationException();
				}
				// 
				goItem(toStr("GOBINTL_CELG_CODE"));
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_SPON_CODE.POST-CHANGE
		 if :GOBINTL_SPON_CODE is null then
	 :SPON_DESC := '';
	  return;
end if;
--
BEGIN
   G$_CHECK_QUERY_MODE;
   DECLARE
      CURSOR PTI_CURSOR IS
         SELECT STVSPON_DESC
         FROM   STVSPON
         WHERE  STVSPON_CODE = :GOBINTL_SPON_CODE;
   BEGIN
      OPEN PTI_CURSOR;
      FETCH PTI_CURSOR INTO :GOBINTL.SPON_DESC;
      G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND, G$_NLS.Get('GOAINTL-0144', 'FORM','*ERROR* Invalid code; press LIST for valid codes') , TRUE);
   END;
   :GLOBAL.QUERY_MODE := '0';
   EXCEPTION
   WHEN FORM_TRIGGER_FAILURE THEN
      :GLOBAL.QUERY_MODE := '0';
      RAISE FORM_TRIGGER_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_SPON_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="GOBINTL_SPON_CODE")
		public void gobintlSponCode_PostChange()
		{
				GobintlAdapter gobintlElement = (GobintlAdapter)this.getFormModel().getGobintl().getRowAdapter(true);
				if(gobintlElement != null)
				{
					int rowCount = 0;
					if(gobintlElement.getGobintlSponCode().isNull())
						return;
					if ( gobintlElement.getGobintlSponCode().isNull() )
					{
						gobintlElement.setSponDesc(toStr(""));
						return ;
					}
					try
					{
						getTask().getGoqrpls().gCheckQueryMode();
						{
							String sqlptiCursor = "SELECT STVSPON_DESC " +
		" FROM STVSPON " +
		" WHERE STVSPON_CODE = :GOBINTL_SPON_CODE ";
							DataCursor ptiCursor = new DataCursor(sqlptiCursor);
							try {
								//Setting query parameters
								ptiCursor.addParameter("GOBINTL_SPON_CODE", gobintlElement.getGobintlSponCode());
								
								ptiCursor.open();
								ResultSet ptiCursorResults = ptiCursor.fetchInto();
								if ( ptiCursorResults != null ) {
									gobintlElement.setSponDesc(ptiCursorResults.getStr(0));
								}
								getTask().getGoqrpls().gCheckValue(toBool(ptiCursor.notFound()), GNls.Fget(toStr("GOAINTL-0144"), toStr("FORM"), toStr("*ERROR* Invalid code; press LIST for valid codes")), toBool(NBool.True));
							}
							finally{
								ptiCursor.close();
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
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_SPON_CODE.KEY-DELREC
		 
EXECUTE_TRIGGER('DELETE_NATIONALITY');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_SPON_CODE.KEY-DELREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DELREC", item="GOBINTL_SPON_CODE", function=KeyFunction.DELETE_RECORD)
		public void gobintlSponCode_DeleteRecord()
		{
			
				executeAction("DELETE_NATIONALITY");
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_SPON_CODE.KEY-CLRBLK
		 :GOBINTL_NATN_CODE_BIRTH := '';
:BIRTH_NATN_DESC := '';
:GOBINTL_NATN_CODE_LEGAL := '';
:LEGAL_NATN_DESC := '';
:GOBINTL_LANG_CODE := '';
:LANG_DESC := '';
:GOBINTL_SPON_CODE := '';
:SPON_DESC := '';
:GOBINTL_EMPT_CODE := '';
:EMPT_DESC := '';
:GOBINTL_FOREIGN_SSN := '';
:GOBINTL_SPOUSE_IND := 'T';
:GOBINTL_CHILD_NUMBER := '';
:GOBINTL_SIGNATURE_IND := 'T';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_SPON_CODE.KEY-CLRBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRBLK", item="GOBINTL_SPON_CODE", function=KeyFunction.CLEAR_BLOCK)
		public void gobintlSponCode_keyClearBlock()
		{
				GobintlAdapter gobintlElement = (GobintlAdapter)this.getFormModel().getGobintl().getRowAdapter(true);
				if(gobintlElement != null)
				{
					gobintlElement.setGobintlNatnCodeBirth(toStr(""));
					gobintlElement.setBirthNatnDesc(toStr(""));
					gobintlElement.setGobintlNatnCodeLegal(toStr(""));
					gobintlElement.setLegalNatnDesc(toStr(""));
					gobintlElement.setGobintlLangCode(toStr(""));
					gobintlElement.setLangDesc(toStr(""));
					gobintlElement.setGobintlSponCode(toStr(""));
					gobintlElement.setSponDesc(toStr(""));
					gobintlElement.setGobintlEmptCode(toStr(""));
					gobintlElement.setEmptDesc(toStr(""));
					gobintlElement.setGobintlForeignSsn(toStr(""));
					gobintlElement.setGobintlSpouseInd(toStr("T"));
					gobintlElement.setGobintlChildNumber(toNumber(""));
					gobintlElement.setGobintlSignatureInd(toStr("T"));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_SPON_CODE.KEY-CLRREC
		 :GOBINTL_NATN_CODE_BIRTH := '';
:BIRTH_NATN_DESC := '';
:GOBINTL_NATN_CODE_LEGAL := '';
:LEGAL_NATN_DESC := '';
:GOBINTL_LANG_CODE := '';
:LANG_DESC := '';
:GOBINTL_SPON_CODE := '';
:SPON_DESC := '';
:GOBINTL_EMPT_CODE := '';
:EMPT_DESC := '';
:GOBINTL_FOREIGN_SSN := '';
:GOBINTL_SPOUSE_IND := 'T';
:GOBINTL_CHILD_NUMBER := '';
:GOBINTL_SIGNATURE_IND := 'T';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_SPON_CODE.KEY-CLRREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRREC", item="GOBINTL_SPON_CODE", function=KeyFunction.CLEAR_RECORD)
		public void gobintlSponCode_ClearRecord()
		{
				GobintlAdapter gobintlElement = (GobintlAdapter)this.getFormModel().getGobintl().getRowAdapter(true);
				if(gobintlElement != null)
				{
					gobintlElement.setGobintlNatnCodeBirth(toStr(""));
					gobintlElement.setBirthNatnDesc(toStr(""));
					gobintlElement.setGobintlNatnCodeLegal(toStr(""));
					gobintlElement.setLegalNatnDesc(toStr(""));
					gobintlElement.setGobintlLangCode(toStr(""));
					gobintlElement.setLangDesc(toStr(""));
					gobintlElement.setGobintlSponCode(toStr(""));
					gobintlElement.setSponDesc(toStr(""));
					gobintlElement.setGobintlEmptCode(toStr(""));
					gobintlElement.setEmptDesc(toStr(""));
					gobintlElement.setGobintlForeignSsn(toStr(""));
					gobintlElement.setGobintlSpouseInd(toStr("T"));
					gobintlElement.setGobintlChildNumber(toNumber(""));
					gobintlElement.setGobintlSignatureInd(toStr("T"));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_EMPT_CODE.KEY-NXTBLK
		 if :system.block_status = 'CHANGED' then
	  message( G$_NLS.Get('GOAINTL-0145', 'FORM','Please Save Information before Leaving Current Block.') );
	  raise form_trigger_failure;
end if;
--
go_block('gorvisa');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_EMPT_CODE.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", item="GOBINTL_EMPT_CODE", function=KeyFunction.NEXT_BLOCK)
		public void gobintlEmptCode_NextBlock()
		{
			
				if ( getBlockStatus().equals("CHANGED") )
				{
					errorMessage(GNls.Fget(toStr("GOAINTL-0145"), toStr("FORM"), toStr("*ERROR* Please Save Information before Leaving Current Block.")));
					throw new ApplicationException();
				}
				// 
				goBlock(toStr("gorvisa"));
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_EMPT_CODE.KEY-PRVBLK
		 if :system.block_status = 'CHANGED' then
	  message( G$_NLS.Get('GOAINTL-0146', 'FORM','Please Save Information before Leaving Current Block.') );
	  raise form_trigger_failure;
end if;
--
go_item('GOBINTL_CELG_CODE');
g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_EMPT_CODE.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", item="GOBINTL_EMPT_CODE", function=KeyFunction.PREVIOUS_BLOCK)
		public void gobintlEmptCode_PreviousBlock()
		{
			
				if ( getBlockStatus().equals("CHANGED") )
				{
					errorMessage(GNls.Fget(toStr("GOAINTL-0146"), toStr("FORM"), toStr("*ERROR* Please Save Information before Leaving Current Block.")));
					throw new ApplicationException();
				}
				// 
				goItem(toStr("GOBINTL_CELG_CODE"));
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_EMPT_CODE.POST-CHANGE
		 if :GOBINTL_EMPT_CODE is null then
	 :EMPT_DESC := '';
	  return;
end if;
--
BEGIN
   G$_CHECK_QUERY_MODE;
   DECLARE
      CURSOR PTI_CURSOR IS
         SELECT STVEMPT_DESC
         FROM   STVEMPT
         WHERE  STVEMPT_CODE = :GOBINTL_EMPT_CODE;
   BEGIN
      OPEN PTI_CURSOR;
      FETCH PTI_CURSOR INTO :GOBINTL.EMPT_DESC;
      G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND, G$_NLS.Get('GOAINTL-0147', 'FORM','*ERROR* Invalid code; press LIST for valid codes') , TRUE);
   END;
   :GLOBAL.QUERY_MODE := '0';
   EXCEPTION
   WHEN FORM_TRIGGER_FAILURE THEN
      :GLOBAL.QUERY_MODE := '0';
      RAISE FORM_TRIGGER_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_EMPT_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="GOBINTL_EMPT_CODE")
		public void gobintlEmptCode_PostChange()
		{
				GobintlAdapter gobintlElement = (GobintlAdapter)this.getFormModel().getGobintl().getRowAdapter(true);
				if(gobintlElement != null)
				{
					int rowCount = 0;
					if(gobintlElement.getGobintlEmptCode().isNull())
						return;
					if ( gobintlElement.getGobintlEmptCode().isNull() )
					{
						gobintlElement.setEmptDesc(toStr(""));
						return ;
					}
					try
					{
						getTask().getGoqrpls().gCheckQueryMode();
						{
							String sqlptiCursor = "SELECT STVEMPT_DESC " +
		" FROM STVEMPT " +
		" WHERE STVEMPT_CODE = :GOBINTL_EMPT_CODE ";
							DataCursor ptiCursor = new DataCursor(sqlptiCursor);
							try {
								//Setting query parameters
								ptiCursor.addParameter("GOBINTL_EMPT_CODE", gobintlElement.getGobintlEmptCode());
								
								ptiCursor.open();
								ResultSet ptiCursorResults = ptiCursor.fetchInto();
								if ( ptiCursorResults != null ) {
									gobintlElement.setEmptDesc(ptiCursorResults.getStr(0));
								}
								getTask().getGoqrpls().gCheckValue(toBool(ptiCursor.notFound()), GNls.Fget(toStr("GOAINTL-0147"), toStr("FORM"), toStr("*ERROR* Invalid code; press LIST for valid codes")), toBool(NBool.True));
							}
							finally{
								ptiCursor.close();
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
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_EMPT_CODE.KEY-DELREC
		 
EXECUTE_TRIGGER('DELETE_NATIONALITY');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_EMPT_CODE.KEY-DELREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DELREC", item="GOBINTL_EMPT_CODE", function=KeyFunction.DELETE_RECORD)
		public void gobintlEmptCode_DeleteRecord()
		{
			
				executeAction("DELETE_NATIONALITY");
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_EMPT_CODE.KEY-CLRBLK
		 :GOBINTL_NATN_CODE_BIRTH := '';
:BIRTH_NATN_DESC := '';
:GOBINTL_NATN_CODE_LEGAL := '';
:LEGAL_NATN_DESC := '';
:GOBINTL_LANG_CODE := '';
:LANG_DESC := '';
:GOBINTL_SPON_CODE := '';
:SPON_DESC := '';
:GOBINTL_EMPT_CODE := '';
:EMPT_DESC := '';
:GOBINTL_FOREIGN_SSN := '';
:GOBINTL_SPOUSE_IND := 'T';
:GOBINTL_CHILD_NUMBER := '';
:GOBINTL_SIGNATURE_IND := 'T';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_EMPT_CODE.KEY-CLRBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRBLK", item="GOBINTL_EMPT_CODE", function=KeyFunction.CLEAR_BLOCK)
		public void gobintlEmptCode_keyClearBlock()
		{
				GobintlAdapter gobintlElement = (GobintlAdapter)this.getFormModel().getGobintl().getRowAdapter(true);
				if(gobintlElement != null)
				{
					gobintlElement.setGobintlNatnCodeBirth(toStr(""));
					gobintlElement.setBirthNatnDesc(toStr(""));
					gobintlElement.setGobintlNatnCodeLegal(toStr(""));
					gobintlElement.setLegalNatnDesc(toStr(""));
					gobintlElement.setGobintlLangCode(toStr(""));
					gobintlElement.setLangDesc(toStr(""));
					gobintlElement.setGobintlSponCode(toStr(""));
					gobintlElement.setSponDesc(toStr(""));
					gobintlElement.setGobintlEmptCode(toStr(""));
					gobintlElement.setEmptDesc(toStr(""));
					gobintlElement.setGobintlForeignSsn(toStr(""));
					gobintlElement.setGobintlSpouseInd(toStr("T"));
					gobintlElement.setGobintlChildNumber(toNumber(""));
					gobintlElement.setGobintlSignatureInd(toStr("T"));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_EMPT_CODE.KEY-CLRREC
		 :GOBINTL_NATN_CODE_BIRTH := '';
:BIRTH_NATN_DESC := '';
:GOBINTL_NATN_CODE_LEGAL := '';
:LEGAL_NATN_DESC := '';
:GOBINTL_LANG_CODE := '';
:LANG_DESC := '';
:GOBINTL_SPON_CODE := '';
:SPON_DESC := '';
:GOBINTL_EMPT_CODE := '';
:EMPT_DESC := '';
:GOBINTL_FOREIGN_SSN := '';
:GOBINTL_SPOUSE_IND := 'T';
:GOBINTL_CHILD_NUMBER := '';
:GOBINTL_SIGNATURE_IND := 'T';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_EMPT_CODE.KEY-CLRREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRREC", item="GOBINTL_EMPT_CODE", function=KeyFunction.CLEAR_RECORD)
		public void gobintlEmptCode_ClearRecord()
		{
				GobintlAdapter gobintlElement = (GobintlAdapter)this.getFormModel().getGobintl().getRowAdapter(true);
				if(gobintlElement != null)
				{
					gobintlElement.setGobintlNatnCodeBirth(toStr(""));
					gobintlElement.setBirthNatnDesc(toStr(""));
					gobintlElement.setGobintlNatnCodeLegal(toStr(""));
					gobintlElement.setLegalNatnDesc(toStr(""));
					gobintlElement.setGobintlLangCode(toStr(""));
					gobintlElement.setLangDesc(toStr(""));
					gobintlElement.setGobintlSponCode(toStr(""));
					gobintlElement.setSponDesc(toStr(""));
					gobintlElement.setGobintlEmptCode(toStr(""));
					gobintlElement.setEmptDesc(toStr(""));
					gobintlElement.setGobintlForeignSsn(toStr(""));
					gobintlElement.setGobintlSpouseInd(toStr("T"));
					gobintlElement.setGobintlChildNumber(toNumber(""));
					gobintlElement.setGobintlSignatureInd(toStr("T"));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_FOREIGN_SSN.KEY-NXTBLK
		 if :system.block_status = 'CHANGED' then
	  message( G$_NLS.Get('GOAINTL-0148', 'FORM','Please Save Information before Leaving Current Block.') );
	  raise form_trigger_failure;
end if;
--
go_block('gorvisa');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_FOREIGN_SSN.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", item="GOBINTL_FOREIGN_SSN", function=KeyFunction.NEXT_BLOCK)
		public void gobintlForeignSsn_NextBlock()
		{
			
				if ( getBlockStatus().equals("CHANGED") )
				{
					errorMessage(GNls.Fget(toStr("GOAINTL-0148"), toStr("FORM"), toStr("*ERROR* Please Save Information before Leaving Current Block.")));
					throw new ApplicationException();
				}
				// 
				goBlock(toStr("gorvisa"));
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_FOREIGN_SSN.KEY-PRVBLK
		 if :system.block_status = 'CHANGED' then
	  message( G$_NLS.Get('GOAINTL-0149', 'FORM','Please Save Information before Leaving Current Block.') );
	  raise form_trigger_failure;
end if;
--
go_item('GOBINTL_CELG_CODE');
g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_FOREIGN_SSN.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", item="GOBINTL_FOREIGN_SSN", function=KeyFunction.PREVIOUS_BLOCK)
		public void gobintlForeignSsn_PreviousBlock()
		{
			
				if ( getBlockStatus().equals("CHANGED") )
				{
					errorMessage(GNls.Fget(toStr("GOAINTL-0149"), toStr("FORM"), toStr("*ERROR* Please Save Information before Leaving Current Block.")));
					throw new ApplicationException();
				}
				// 
				goItem(toStr("GOBINTL_CELG_CODE"));
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_FOREIGN_SSN.KEY-DELREC
		 
EXECUTE_TRIGGER('DELETE_NATIONALITY');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_FOREIGN_SSN.KEY-DELREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DELREC", item="GOBINTL_FOREIGN_SSN", function=KeyFunction.DELETE_RECORD)
		public void gobintlForeignSsn_DeleteRecord()
		{
			
				executeAction("DELETE_NATIONALITY");
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_FOREIGN_SSN.KEY-CLRBLK
		 :GOBINTL_NATN_CODE_BIRTH := '';
:BIRTH_NATN_DESC := '';
:GOBINTL_NATN_CODE_LEGAL := '';
:LEGAL_NATN_DESC := '';
:GOBINTL_LANG_CODE := '';
:LANG_DESC := '';
:GOBINTL_SPON_CODE := '';
:SPON_DESC := '';
:GOBINTL_EMPT_CODE := '';
:EMPT_DESC := '';
:GOBINTL_FOREIGN_SSN := '';
:GOBINTL_SPOUSE_IND := 'T';
:GOBINTL_CHILD_NUMBER := '';
:GOBINTL_SIGNATURE_IND := 'T';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_FOREIGN_SSN.KEY-CLRBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRBLK", item="GOBINTL_FOREIGN_SSN", function=KeyFunction.CLEAR_BLOCK)
		public void gobintlForeignSsn_keyClearBlock()
		{
				GobintlAdapter gobintlElement = (GobintlAdapter)this.getFormModel().getGobintl().getRowAdapter(true);
				if(gobintlElement != null)
				{
					gobintlElement.setGobintlNatnCodeBirth(toStr(""));
					gobintlElement.setBirthNatnDesc(toStr(""));
					gobintlElement.setGobintlNatnCodeLegal(toStr(""));
					gobintlElement.setLegalNatnDesc(toStr(""));
					gobintlElement.setGobintlLangCode(toStr(""));
					gobintlElement.setLangDesc(toStr(""));
					gobintlElement.setGobintlSponCode(toStr(""));
					gobintlElement.setSponDesc(toStr(""));
					gobintlElement.setGobintlEmptCode(toStr(""));
					gobintlElement.setEmptDesc(toStr(""));
					gobintlElement.setGobintlForeignSsn(toStr(""));
					gobintlElement.setGobintlSpouseInd(toStr("T"));
					gobintlElement.setGobintlChildNumber(toNumber(""));
					gobintlElement.setGobintlSignatureInd(toStr("T"));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_FOREIGN_SSN.KEY-CLRREC
		 :GOBINTL_NATN_CODE_BIRTH := '';
:BIRTH_NATN_DESC := '';
:GOBINTL_NATN_CODE_LEGAL := '';
:LEGAL_NATN_DESC := '';
:GOBINTL_LANG_CODE := '';
:LANG_DESC := '';
:GOBINTL_SPON_CODE := '';
:SPON_DESC := '';
:GOBINTL_EMPT_CODE := '';
:EMPT_DESC := '';
:GOBINTL_FOREIGN_SSN := '';
:GOBINTL_SPOUSE_IND := 'T';
:GOBINTL_CHILD_NUMBER := '';
:GOBINTL_SIGNATURE_IND := 'T';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_FOREIGN_SSN.KEY-CLRREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRREC", item="GOBINTL_FOREIGN_SSN", function=KeyFunction.CLEAR_RECORD)
		public void gobintlForeignSsn_ClearRecord()
		{
				GobintlAdapter gobintlElement = (GobintlAdapter)this.getFormModel().getGobintl().getRowAdapter(true);
				if(gobintlElement != null)
				{
					gobintlElement.setGobintlNatnCodeBirth(toStr(""));
					gobintlElement.setBirthNatnDesc(toStr(""));
					gobintlElement.setGobintlNatnCodeLegal(toStr(""));
					gobintlElement.setLegalNatnDesc(toStr(""));
					gobintlElement.setGobintlLangCode(toStr(""));
					gobintlElement.setLangDesc(toStr(""));
					gobintlElement.setGobintlSponCode(toStr(""));
					gobintlElement.setSponDesc(toStr(""));
					gobintlElement.setGobintlEmptCode(toStr(""));
					gobintlElement.setEmptDesc(toStr(""));
					gobintlElement.setGobintlForeignSsn(toStr(""));
					gobintlElement.setGobintlSpouseInd(toStr("T"));
					gobintlElement.setGobintlChildNumber(toNumber(""));
					gobintlElement.setGobintlSignatureInd(toStr("T"));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_FOREIGN_SSN.WHEN-VALIDATE-ITEM
		 DECLARE
lv_error_msg  VARCHAR(200);
BEGIN
lv_error_msg := G$_SSN_VALIDATE_MAX_LENGTH(:SYSTEM.CURSOR_ITEM);
  IF lv_error_msg IS NOT NULL THEN
    MESSAGE(lv_error_msg);
    RAISE FORM_TRIGGER_FAILURE;
  END IF;
END;


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_FOREIGN_SSN.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="GOBINTL_FOREIGN_SSN")
		public void gobintlForeignSsn_validate()
		{
			
				{
					NString lvErrorMsg= NString.getNull();
					lvErrorMsg = getTask().getGoqrpls().gSsnValidateMaxLength(toStr(getCursorItem()));
					if ( !lvErrorMsg.isNull() )
					{
						errorMessage(lvErrorMsg);
						throw new ApplicationException();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_SPOUSE_IND.KEY-NXTBLK
		 if :system.block_status = 'CHANGED' then
	  message( G$_NLS.Get('GOAINTL-0150', 'FORM','Please Save Information before Leaving Current Block.') );
	  raise form_trigger_failure;
end if;
--
go_block('gorvisa');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_SPOUSE_IND.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", item="GOBINTL_SPOUSE_IND", function=KeyFunction.NEXT_BLOCK)
		public void gobintlSpouseInd_NextBlock()
		{
			
				if ( getBlockStatus().equals("CHANGED") )
				{
					errorMessage(GNls.Fget(toStr("GOAINTL-0150"), toStr("FORM"), toStr("*ERROR* Please Save Information before Leaving Current Block.")));
					throw new ApplicationException();
				}
				// 
				goBlock(toStr("gorvisa"));
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_SPOUSE_IND.KEY-PRVBLK
		 if :system.block_status = 'CHANGED' then
	  message( G$_NLS.Get('GOAINTL-0151', 'FORM','Please Save Information before Leaving Current Block.') );
	  raise form_trigger_failure;
end if;
--
go_item('GOBINTL_CELG_CODE');
g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_SPOUSE_IND.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", item="GOBINTL_SPOUSE_IND", function=KeyFunction.PREVIOUS_BLOCK)
		public void gobintlSpouseInd_PreviousBlock()
		{
			
				if ( getBlockStatus().equals("CHANGED") )
				{
					errorMessage(GNls.Fget(toStr("GOAINTL-0151"), toStr("FORM"), toStr("*ERROR* Please Save Information before Leaving Current Block.")));
					throw new ApplicationException();
				}
				// 
				goItem(toStr("GOBINTL_CELG_CODE"));
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_SPOUSE_IND.KEY-DELREC
		 
EXECUTE_TRIGGER('DELETE_NATIONALITY');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_SPOUSE_IND.KEY-DELREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DELREC", item="GOBINTL_SPOUSE_IND", function=KeyFunction.DELETE_RECORD)
		public void gobintlSpouseInd_DeleteRecord()
		{
			
				executeAction("DELETE_NATIONALITY");
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_SPOUSE_IND.KEY-CLRBLK
		 :GOBINTL_NATN_CODE_BIRTH := '';
:BIRTH_NATN_DESC := '';
:GOBINTL_NATN_CODE_LEGAL := '';
:LEGAL_NATN_DESC := '';
:GOBINTL_LANG_CODE := '';
:LANG_DESC := '';
:GOBINTL_SPON_CODE := '';
:SPON_DESC := '';
:GOBINTL_EMPT_CODE := '';
:EMPT_DESC := '';
:GOBINTL_FOREIGN_SSN := '';
:GOBINTL_SPOUSE_IND := 'T';
:GOBINTL_CHILD_NUMBER := '';
:GOBINTL_SIGNATURE_IND := 'T';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_SPOUSE_IND.KEY-CLRBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRBLK", item="GOBINTL_SPOUSE_IND", function=KeyFunction.CLEAR_BLOCK)
		public void gobintlSpouseInd_keyClearBlock()
		{
				GobintlAdapter gobintlElement = (GobintlAdapter)this.getFormModel().getGobintl().getRowAdapter(true);
				if(gobintlElement != null)
				{
					gobintlElement.setGobintlNatnCodeBirth(toStr(""));
					gobintlElement.setBirthNatnDesc(toStr(""));
					gobintlElement.setGobintlNatnCodeLegal(toStr(""));
					gobintlElement.setLegalNatnDesc(toStr(""));
					gobintlElement.setGobintlLangCode(toStr(""));
					gobintlElement.setLangDesc(toStr(""));
					gobintlElement.setGobintlSponCode(toStr(""));
					gobintlElement.setSponDesc(toStr(""));
					gobintlElement.setGobintlEmptCode(toStr(""));
					gobintlElement.setEmptDesc(toStr(""));
					gobintlElement.setGobintlForeignSsn(toStr(""));
					gobintlElement.setGobintlSpouseInd(toStr("T"));
					gobintlElement.setGobintlChildNumber(toNumber(""));
					gobintlElement.setGobintlSignatureInd(toStr("T"));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_SPOUSE_IND.KEY-CLRREC
		 :GOBINTL_NATN_CODE_BIRTH := '';
:BIRTH_NATN_DESC := '';
:GOBINTL_NATN_CODE_LEGAL := '';
:LEGAL_NATN_DESC := '';
:GOBINTL_LANG_CODE := '';
:LANG_DESC := '';
:GOBINTL_SPON_CODE := '';
:SPON_DESC := '';
:GOBINTL_EMPT_CODE := '';
:EMPT_DESC := '';
:GOBINTL_FOREIGN_SSN := '';
:GOBINTL_SPOUSE_IND := 'T';
:GOBINTL_CHILD_NUMBER := '';
:GOBINTL_SIGNATURE_IND := 'T';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_SPOUSE_IND.KEY-CLRREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRREC", item="GOBINTL_SPOUSE_IND", function=KeyFunction.CLEAR_RECORD)
		public void gobintlSpouseInd_ClearRecord()
		{
				GobintlAdapter gobintlElement = (GobintlAdapter)this.getFormModel().getGobintl().getRowAdapter(true);
				if(gobintlElement != null)
				{
					gobintlElement.setGobintlNatnCodeBirth(toStr(""));
					gobintlElement.setBirthNatnDesc(toStr(""));
					gobintlElement.setGobintlNatnCodeLegal(toStr(""));
					gobintlElement.setLegalNatnDesc(toStr(""));
					gobintlElement.setGobintlLangCode(toStr(""));
					gobintlElement.setLangDesc(toStr(""));
					gobintlElement.setGobintlSponCode(toStr(""));
					gobintlElement.setSponDesc(toStr(""));
					gobintlElement.setGobintlEmptCode(toStr(""));
					gobintlElement.setEmptDesc(toStr(""));
					gobintlElement.setGobintlForeignSsn(toStr(""));
					gobintlElement.setGobintlSpouseInd(toStr("T"));
					gobintlElement.setGobintlChildNumber(toNumber(""));
					gobintlElement.setGobintlSignatureInd(toStr("T"));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_CHILD_NUMBER.KEY-NXTBLK
		 if :system.block_status = 'CHANGED' then
	  message( G$_NLS.Get('GOAINTL-0152', 'FORM','Please Save Information before Leaving Current Block.') );
	  raise form_trigger_failure;
end if;
--
go_block('gorvisa');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_CHILD_NUMBER.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", item="GOBINTL_CHILD_NUMBER", function=KeyFunction.NEXT_BLOCK)
		public void gobintlChildNumber_NextBlock()
		{
			
				if ( getBlockStatus().equals("CHANGED") )
				{
					errorMessage(GNls.Fget(toStr("GOAINTL-0152"), toStr("FORM"), toStr("*ERROR* Please Save Information before Leaving Current Block.")));
					throw new ApplicationException();
				}
				// 
				goBlock(toStr("gorvisa"));
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_CHILD_NUMBER.KEY-PRVBLK
		 if :system.block_status = 'CHANGED' then
	  message( G$_NLS.Get('GOAINTL-0153', 'FORM','Please Save Information before Leaving Current Block.') );
	  raise form_trigger_failure;
end if;
--
go_item('GOBINTL_CELG_CODE');
g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_CHILD_NUMBER.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", item="GOBINTL_CHILD_NUMBER", function=KeyFunction.PREVIOUS_BLOCK)
		public void gobintlChildNumber_PreviousBlock()
		{
			
				if ( getBlockStatus().equals("CHANGED") )
				{
					errorMessage(GNls.Fget(toStr("GOAINTL-0153"), toStr("FORM"), toStr("*ERROR* Please Save Information before Leaving Current Block.")));
					throw new ApplicationException();
				}
				// 
				goItem(toStr("GOBINTL_CELG_CODE"));
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_CHILD_NUMBER.KEY-DELREC
		 
EXECUTE_TRIGGER('DELETE_NATIONALITY');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_CHILD_NUMBER.KEY-DELREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DELREC", item="GOBINTL_CHILD_NUMBER", function=KeyFunction.DELETE_RECORD)
		public void gobintlChildNumber_DeleteRecord()
		{
			
				executeAction("DELETE_NATIONALITY");
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_CHILD_NUMBER.KEY-CLRBLK
		 :GOBINTL_NATN_CODE_BIRTH := '';
:BIRTH_NATN_DESC := '';
:GOBINTL_NATN_CODE_LEGAL := '';
:LEGAL_NATN_DESC := '';
:GOBINTL_LANG_CODE := '';
:LANG_DESC := '';
:GOBINTL_SPON_CODE := '';
:SPON_DESC := '';
:GOBINTL_EMPT_CODE := '';
:EMPT_DESC := '';
:GOBINTL_FOREIGN_SSN := '';
:GOBINTL_SPOUSE_IND := 'T';
:GOBINTL_CHILD_NUMBER := '';
:GOBINTL_SIGNATURE_IND := 'T';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_CHILD_NUMBER.KEY-CLRBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRBLK", item="GOBINTL_CHILD_NUMBER", function=KeyFunction.CLEAR_BLOCK)
		public void gobintlChildNumber_keyClearBlock()
		{
				GobintlAdapter gobintlElement = (GobintlAdapter)this.getFormModel().getGobintl().getRowAdapter(true);
				if(gobintlElement != null)
				{
					gobintlElement.setGobintlNatnCodeBirth(toStr(""));
					gobintlElement.setBirthNatnDesc(toStr(""));
					gobintlElement.setGobintlNatnCodeLegal(toStr(""));
					gobintlElement.setLegalNatnDesc(toStr(""));
					gobintlElement.setGobintlLangCode(toStr(""));
					gobintlElement.setLangDesc(toStr(""));
					gobintlElement.setGobintlSponCode(toStr(""));
					gobintlElement.setSponDesc(toStr(""));
					gobintlElement.setGobintlEmptCode(toStr(""));
					gobintlElement.setEmptDesc(toStr(""));
					gobintlElement.setGobintlForeignSsn(toStr(""));
					gobintlElement.setGobintlSpouseInd(toStr("T"));
					gobintlElement.setGobintlChildNumber(toNumber(""));
					gobintlElement.setGobintlSignatureInd(toStr("T"));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_CHILD_NUMBER.KEY-CLRREC
		 :GOBINTL_NATN_CODE_BIRTH := '';
:BIRTH_NATN_DESC := '';
:GOBINTL_NATN_CODE_LEGAL := '';
:LEGAL_NATN_DESC := '';
:GOBINTL_LANG_CODE := '';
:LANG_DESC := '';
:GOBINTL_SPON_CODE := '';
:SPON_DESC := '';
:GOBINTL_EMPT_CODE := '';
:EMPT_DESC := '';
:GOBINTL_FOREIGN_SSN := '';
:GOBINTL_SPOUSE_IND := 'T';
:GOBINTL_CHILD_NUMBER := '';
:GOBINTL_SIGNATURE_IND := 'T';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_CHILD_NUMBER.KEY-CLRREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRREC", item="GOBINTL_CHILD_NUMBER", function=KeyFunction.CLEAR_RECORD)
		public void gobintlChildNumber_ClearRecord()
		{
				GobintlAdapter gobintlElement = (GobintlAdapter)this.getFormModel().getGobintl().getRowAdapter(true);
				if(gobintlElement != null)
				{
					gobintlElement.setGobintlNatnCodeBirth(toStr(""));
					gobintlElement.setBirthNatnDesc(toStr(""));
					gobintlElement.setGobintlNatnCodeLegal(toStr(""));
					gobintlElement.setLegalNatnDesc(toStr(""));
					gobintlElement.setGobintlLangCode(toStr(""));
					gobintlElement.setLangDesc(toStr(""));
					gobintlElement.setGobintlSponCode(toStr(""));
					gobintlElement.setSponDesc(toStr(""));
					gobintlElement.setGobintlEmptCode(toStr(""));
					gobintlElement.setEmptDesc(toStr(""));
					gobintlElement.setGobintlForeignSsn(toStr(""));
					gobintlElement.setGobintlSpouseInd(toStr("T"));
					gobintlElement.setGobintlChildNumber(toNumber(""));
					gobintlElement.setGobintlSignatureInd(toStr("T"));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_CHILD_NUMBER.WHEN-VALIDATE-ITEM
		 if substr(:gobintl_child_number,1,1) = '.' or substr(:gobintl_child_number,2,1) = '.' then
	 message( G$_NLS.Get('GOAINTL-0154', 'FORM','Invalid Entry, No Decimal Point Allowed.') );
	 raise form_trigger_failure;
end if;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_CHILD_NUMBER.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="GOBINTL_CHILD_NUMBER")
		public void gobintlChildNumber_validate()
		{
				GobintlAdapter gobintlElement = (GobintlAdapter)this.getFormModel().getGobintl().getRowAdapter(true);
				if(gobintlElement != null)
				{
					if ( substring(toStr(gobintlElement.getGobintlChildNumber()), toInt(1), toInt(1)).equals(".") || substring(toStr(gobintlElement.getGobintlChildNumber()), toInt(2), toInt(1)).equals(".") )
					{
						errorMessage(GNls.Fget(toStr("GOAINTL-0154"), toStr("FORM"), toStr("*ERROR* Invalid Entry, No Decimal Point Allowed.")));
						throw new ApplicationException();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_SIGNATURE_IND.KEY-NEXT-ITEM
		 go_item('GOBINTL_NATN_CODE_BIRTH');
g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_SIGNATURE_IND.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="GOBINTL_SIGNATURE_IND", function=KeyFunction.NEXT_ITEM)
		public void gobintlSignatureInd_keyNexItem()
		{
			
				goItem(toStr("GOBINTL_NATN_CODE_BIRTH"));
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_SIGNATURE_IND.KEY-NXTBLK
		 if :system.block_status = 'CHANGED' then
	  message( G$_NLS.Get('GOAINTL-0155', 'FORM','Please Save Information before Leaving Current Block.') );
	  raise form_trigger_failure;
end if;
--
go_block('gorvisa');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_SIGNATURE_IND.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", item="GOBINTL_SIGNATURE_IND", function=KeyFunction.NEXT_BLOCK)
		public void gobintlSignatureInd_NextBlock()
		{
			
				if ( getBlockStatus().equals("CHANGED") )
				{
					errorMessage(GNls.Fget(toStr("GOAINTL-0155"), toStr("FORM"), toStr("*ERROR* Please Save Information before Leaving Current Block.")));
					throw new ApplicationException();
				}
				// 
				goBlock(toStr("gorvisa"));
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_SIGNATURE_IND.KEY-PRVBLK
		 if :system.block_status = 'CHANGED' then
	  message( G$_NLS.Get('GOAINTL-0156', 'FORM','Please Save Information before Leaving Current Block.') );
	  raise form_trigger_failure;
end if;
--
go_item('GOBINTL_CELG_CODE');
g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_SIGNATURE_IND.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", item="GOBINTL_SIGNATURE_IND", function=KeyFunction.PREVIOUS_BLOCK)
		public void gobintlSignatureInd_PreviousBlock()
		{
			
				if ( getBlockStatus().equals("CHANGED") )
				{
					errorMessage(GNls.Fget(toStr("GOAINTL-0156"), toStr("FORM"), toStr("*ERROR* Please Save Information before Leaving Current Block.")));
					throw new ApplicationException();
				}
				// 
				goItem(toStr("GOBINTL_CELG_CODE"));
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_SIGNATURE_IND.KEY-DELREC
		 
EXECUTE_TRIGGER('DELETE_NATIONALITY');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_SIGNATURE_IND.KEY-DELREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DELREC", item="GOBINTL_SIGNATURE_IND", function=KeyFunction.DELETE_RECORD)
		public void gobintlSignatureInd_DeleteRecord()
		{
			
				executeAction("DELETE_NATIONALITY");
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_SIGNATURE_IND.KEY-CLRBLK
		 :GOBINTL_NATN_CODE_BIRTH := '';
:BIRTH_NATN_DESC := '';
:GOBINTL_NATN_CODE_LEGAL := '';
:LEGAL_NATN_DESC := '';
:GOBINTL_LANG_CODE := '';
:LANG_DESC := '';
:GOBINTL_SPON_CODE := '';
:SPON_DESC := '';
:GOBINTL_EMPT_CODE := '';
:EMPT_DESC := '';
:GOBINTL_FOREIGN_SSN := '';
:GOBINTL_SPOUSE_IND := 'T';
:GOBINTL_CHILD_NUMBER := '';
:GOBINTL_SIGNATURE_IND := 'T';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_SIGNATURE_IND.KEY-CLRBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRBLK", item="GOBINTL_SIGNATURE_IND", function=KeyFunction.CLEAR_BLOCK)
		public void gobintlSignatureInd_keyClearBlock()
		{
				GobintlAdapter gobintlElement = (GobintlAdapter)this.getFormModel().getGobintl().getRowAdapter(true);
				if(gobintlElement != null)
				{
					gobintlElement.setGobintlNatnCodeBirth(toStr(""));
					gobintlElement.setBirthNatnDesc(toStr(""));
					gobintlElement.setGobintlNatnCodeLegal(toStr(""));
					gobintlElement.setLegalNatnDesc(toStr(""));
					gobintlElement.setGobintlLangCode(toStr(""));
					gobintlElement.setLangDesc(toStr(""));
					gobintlElement.setGobintlSponCode(toStr(""));
					gobintlElement.setSponDesc(toStr(""));
					gobintlElement.setGobintlEmptCode(toStr(""));
					gobintlElement.setEmptDesc(toStr(""));
					gobintlElement.setGobintlForeignSsn(toStr(""));
					gobintlElement.setGobintlSpouseInd(toStr("T"));
					gobintlElement.setGobintlChildNumber(toNumber(""));
					gobintlElement.setGobintlSignatureInd(toStr("T"));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOBINTL_SIGNATURE_IND.KEY-CLRREC
		 :GOBINTL_NATN_CODE_BIRTH := '';
:BIRTH_NATN_DESC := '';
:GOBINTL_NATN_CODE_LEGAL := '';
:LEGAL_NATN_DESC := '';
:GOBINTL_LANG_CODE := '';
:LANG_DESC := '';
:GOBINTL_SPON_CODE := '';
:SPON_DESC := '';
:GOBINTL_EMPT_CODE := '';
:EMPT_DESC := '';
:GOBINTL_FOREIGN_SSN := '';
:GOBINTL_SPOUSE_IND := 'T';
:GOBINTL_CHILD_NUMBER := '';
:GOBINTL_SIGNATURE_IND := 'T';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_SIGNATURE_IND.KEY-CLRREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRREC", item="GOBINTL_SIGNATURE_IND", function=KeyFunction.CLEAR_RECORD)
		public void gobintlSignatureInd_ClearRecord()
		{
				GobintlAdapter gobintlElement = (GobintlAdapter)this.getFormModel().getGobintl().getRowAdapter(true);
				if(gobintlElement != null)
				{
					gobintlElement.setGobintlNatnCodeBirth(toStr(""));
					gobintlElement.setBirthNatnDesc(toStr(""));
					gobintlElement.setGobintlNatnCodeLegal(toStr(""));
					gobintlElement.setLegalNatnDesc(toStr(""));
					gobintlElement.setGobintlLangCode(toStr(""));
					gobintlElement.setLangDesc(toStr(""));
					gobintlElement.setGobintlSponCode(toStr(""));
					gobintlElement.setSponDesc(toStr(""));
					gobintlElement.setGobintlEmptCode(toStr(""));
					gobintlElement.setEmptDesc(toStr(""));
					gobintlElement.setGobintlForeignSsn(toStr(""));
					gobintlElement.setGobintlSpouseInd(toStr("T"));
					gobintlElement.setGobintlChildNumber(toNumber(""));
					gobintlElement.setGobintlSignatureInd(toStr("T"));
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_ACTIVITY_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="GOBINTL_ACTIVITY_DATE", function=KeyFunction.NEXT_ITEM)
		public void gobintlActivityDate_keyNexItem()
		{
			
				getGDateClass().nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_ACTIVITY_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="GOBINTL_ACTIVITY_DATE", function=KeyFunction.ITEM_CHANGE)
		public void gobintlActivityDate_itemChange()
		{
			
				getGDateClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_ACTIVITY_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="GOBINTL_ACTIVITY_DATE", function=KeyFunction.ITEM_OUT)
		public void gobintlActivityDate_itemOut()
		{
			
				getGDateClass().itemOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_PASSPORT_ID.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="GOBINTL_PASSPORT_ID")
		public void gobintlPassportId_validate()
		{
			
				GobintlAdapter gobintlElement = (GobintlAdapter)this.getFormModel().getGobintl().getRowAdapter(true);
							this.gobintlPassportId_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_NATN_CODE_ISSUE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="GOBINTL_NATN_CODE_ISSUE")
		public void gobintlNatnCodeIssue_validate()
		{
			
				GobintlAdapter gobintlElement = (GobintlAdapter)this.getFormModel().getGobintl().getRowAdapter(true);
							this.gobintlNatnCodeIssue_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_CELG_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="GOBINTL_CELG_CODE")
		public void gobintlCelgCode_validate()
		{
			
				GobintlAdapter gobintlElement = (GobintlAdapter)this.getFormModel().getGobintl().getRowAdapter(true);
							this.gobintlCelgCode_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_ADMR_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="GOBINTL_ADMR_CODE")
		public void gobintlAdmrCode_validate()
		{
			
				GobintlAdapter gobintlElement = (GobintlAdapter)this.getFormModel().getGobintl().getRowAdapter(true);
							this.gobintlAdmrCode_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_NATN_CODE_BIRTH.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="GOBINTL_NATN_CODE_BIRTH")
		public void gobintlNatnCodeBirth_validate()
		{
			
				GobintlAdapter gobintlElement = (GobintlAdapter)this.getFormModel().getGobintl().getRowAdapter(true);
							this.gobintlNatnCodeBirth_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_NATN_CODE_LEGAL.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="GOBINTL_NATN_CODE_LEGAL")
		public void gobintlNatnCodeLegal_validate()
		{
			
				GobintlAdapter gobintlElement = (GobintlAdapter)this.getFormModel().getGobintl().getRowAdapter(true);
							this.gobintlNatnCodeLegal_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_LANG_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="GOBINTL_LANG_CODE")
		public void gobintlLangCode_validate()
		{
			
				GobintlAdapter gobintlElement = (GobintlAdapter)this.getFormModel().getGobintl().getRowAdapter(true);
							this.gobintlLangCode_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_SPON_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="GOBINTL_SPON_CODE")
		public void gobintlSponCode_validate()
		{
			
				GobintlAdapter gobintlElement = (GobintlAdapter)this.getFormModel().getGobintl().getRowAdapter(true);
							this.gobintlSponCode_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_EMPT_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="GOBINTL_EMPT_CODE")
		public void gobintlEmptCode_validate()
		{
			
				GobintlAdapter gobintlElement = (GobintlAdapter)this.getFormModel().getGobintl().getRowAdapter(true);
							this.gobintlEmptCode_PostChange();

			}

		
	
	
}

