package net.hedtech.general.common.libraries.Soqolib.controller;
 
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
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Soqolib.model.*;
import net.hedtech.general.common.libraries.Soqolib.*;
import net.hedtech.general.common.libraries.Soqolib.services.*;
import net.hedtech.general.common.libraries.Goqolib.services.GIdClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GNameClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GCodeClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GDescClass;	
		
public class SorainfController extends AbstractSupportCodeObject {

	private GIdClass getGIdClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GIdClass) this.getContainer().getTaskPart("goqolib").getSupportCodeManager().getPackage("G$_ID_CLASS");
	}	
	private GNameClass getGNameClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GNameClass) this.getContainer().getTaskPart("goqolib").getSupportCodeManager().getPackage("G$_NAME_CLASS");
	}	
	private GCodeClass getGCodeClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GCodeClass) this.getContainer().getTaskPart("goqolib").getSupportCodeManager().getPackage("G$_CODE_CLASS");
	}	
	private GDescClass getGDescClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GDescClass) this.getContainer().getTaskPart("goqolib").getSupportCodeManager().getPackage("G$_DESC_CLASS");
	}	

	
	public SorainfController(ISupportCodeContainer container) 
	{
		super(container);
	}
		
		
		
	@Override
	public SoqolibTaskPart getContainer() {
		return (SoqolibTaskPart)super.getContainer();
	}

	public SoqolibModel getFormModel() {
		return this.getContainer().getModel();
	}
		
			
	//action methods generated from triggers
		/* Original PL/SQL code code for TRIGGER SORAINF.KEY-NXTREC
		 
  IF :System.Last_Record <> 'TRUE' THEN 
    Next_Record; 
  ELSE 
   :system.message_level := '5';
    next_record; 
   :system.message_level := '0';
  END IF; 



		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORAINF.KEY-NXTREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void sorainf_NextRecord()
		{
			
				if ( !isInLastRecord() )
				{
					nextRecord();
				}
				else {
					// MORPHIS TODO : Implementation SYSTEM.MESSAGE_LEVEL '5'
					try { 
					MessageServices.setMessageLevel(MessageLevel.NONE);
					nextRecord();
					// MORPHIS TODO : Implementation SYSTEM.MESSAGE_LEVEL '0'
					} finally {
								
					MessageServices.resetMessageLevel();
					}
								
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORAINF.WHEN-NEW-RECORD-INSTANCE
		 if get_item_property('admin_id_lbt',enabled) = 'FALSE' then 
   set_item_property('admin_id_lbt',enabled,property_true);
end if;
   
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORAINF.WHEN-NEW-RECORD-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-RECORD-INSTANCE", function=KeyFunction.RECORD_CHANGE)
		public void sorainf_recordChange()
		{
			
				if ( getItemEnabled("admin_id_lbt").equals("FALSE") )
				{
					setItemEnabled("admin_id_lbt", true);
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORAINF.POST-RECORD
		 if get_item_property('admin_id_lbt',enabled) = 'TRUE' then 
   set_item_property('admin_id_lbt',enabled,property_false);
end if;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORAINF.POST-RECORD
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-RECORD")
		public void sorainf_PostRecord()
		{
			
				if ( getItemEnabled("admin_id_lbt").equals("TRUE") )
				{
					setItemEnabled("admin_id_lbt", false);
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORAINF.ADMIN_ASSIGN
		 DECLARE 
   alert_button	 NUMBER; 
BEGIN 
       alert_button := Show_Alert('admin_assign_alert'); 
       IF alert_button = ALERT_BUTTON2 THEN 
          Message( G$_NLS.Get('SOQOLIB-0148', 'FORM','Administrator Assignment Calculation Cancelled.') );
          return;
       else 
          sokainf.p_assign_admin(:admin_pidm, :admin_assign_term_code, 
          :admin_assign_seqno, :admin_assign_module);  
          Message( G$_NLS.Get('SOQOLIB-0149', 'FORM','Administrator Assignment Calculation Completed.') );
          go_block('sorainf');
          execute_a_query;
      END IF; 

END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORAINF.ADMIN_ASSIGN
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="ADMIN_ASSIGN")
		public void sorainf_AdminAssign()
		{
			
				{
					NNumber alertButton= NNumber.getNull();
					alertButton = toNumber(showAlert("admin_assign_alert"));
					if ( alertButton.equals(MessageServices.BUTTON2) )
					{
						warningMessage(GNls.Fget(toStr("SOQOLIB-0148"), toStr("FORM"), toStr("Administrator Assignment Calculation Cancelled.")));
						return ;
					}
					else {
						Sokainf.pAssignAdmin(getFormModel().getSAdminAssign().getAdminPidm(), getFormModel().getSAdminAssign().getAdminAssignTermCode(), getFormModel().getSAdminAssign().getAdminAssignSeqno(), getFormModel().getSAdminAssign().getAdminAssignModule());
						message(GNls.Fget(toStr("SOQOLIB-0149"), toStr("FORM"), toStr("Administrator Assignment Calculation Completed.")));
						goBlock(toStr("sorainf"));
						this.getContainer().getServices().executeAQuery();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORAINF.SORAINF_RETURN
		 if :system.block_status = 'CHANGED' then 
  message( G$_NLS.Get('SOQOLIB-0150', 'FORM','*ERROR* Commit Your Assignments Before Proceeding.') );
  raise form_trigger_failure;
elsif :admin_COMMIT_IND = 'P' then 
  message( G$_NLS.Get('SOQOLIB-0151', 'FORM','*ERROR* Pending Errors; Correct Errors Before Proceeding.') );
  raise form_trigger_failure;
else 
     g$_navigation_frame.enable_option(:sorainf_return_object,
         :sorainf_return_item);
     :call_admin := '';
     GO_field(name_in('ADMIN_ASSIGN_SAVE_FIELD'));
     SET_WINDOW_PROPERTY( 'ADMIN_ASSIGN_WINDOW',VISIBLE,property_false);
end if; 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORAINF.SORAINF_RETURN
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="SORAINF_RETURN")
		public void sorainf_SorainfReturn()
		{
			
				if ( getBlockStatus().equals("CHANGED") )
				{
					errorMessage(GNls.Fget(toStr("SOQOLIB-0150"), toStr("FORM"), toStr("*ERROR* Commit Your Assignments Before Proceeding.")));
					throw new ApplicationException();
				}
				else if ( getFormModel().getSAdminAssign().getAdminCommitInd().equals("P") ) {
					errorMessage(GNls.Fget(toStr("SOQOLIB-0151"), toStr("FORM"), toStr("*ERROR* Pending Errors; Correct Errors Before Proceeding.")));
					throw new ApplicationException();
				}
				else {
					getContainer().getGoqrpls().getGNavigationFrame().enableOption(getFormModel().getSAdminAssign().getSorainfReturnObject(), getFormModel().getSAdminAssign().getSorainfReturnItem());
					getFormModel().getSAdminAssign().setCallAdmin(toStr(""));
					goItem(getNameIn("ADMIN_ASSIGN_SAVE_FIELD"));
					// F2J_NOT_SUPPORTED : The property "WINDOW's VISIBLE" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\SOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin2".
					//					SupportClasses.FORMS4W.SetWindowProperty("ADMIN_ASSIGN_WINDOW", SupportClasses.Property.VISIBLE, false);
					this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'WINDOW's VISIBLE' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\SOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin2'.");
					
					
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORAINF.CHECK_MODULES
		 DECLARE
   dummy                         VARCHAR2(1);

BEGIN
   IF :sorainf_module = 'R'
   THEN
      GOTO check_recruiting;
   ELSIF :sorainf_module = 'A'
   THEN
      GOTO check_admissions;
   END IF;
   --
   <<check_recruiting>>
   IF     :sorainf_module = 'R'
      AND  ( :sorainf_term_code IS NULL
          OR :sorainf_seqno IS NULL)
   THEN
      message ( G$_NLS.Get('SOQOLIB-0152', 'FORM','*ERROR* Recruit Administrator Requires a Term and Recruit Sequence Number') );
      RAISE form_trigger_failure;
   END IF;
   BEGIN
      SELECT 'X'
        INTO dummy
        FROM srbrecr
       WHERE srbrecr_pidm = :sorainf_pidm
         AND srbrecr_term_code = :sorainf_term_code
         AND srbrecr_admin_seqno = :sorainf_seqno;
   EXCEPTION
      WHEN NO_DATA_FOUND
      THEN
         message ( G$_NLS.Get('SOQOLIB-0153', 'FORM','*ERROR* INVALID RECRUITING TERM/SEQUENCE NUMBER.') );
         RAISE form_trigger_failure;
   END;
   GOTO exit_trigger;
   <<check_admissions>>
   IF     :sorainf_module = 'A'
      AND  ( :sorainf_term_code IS NULL
          OR :sorainf_seqno IS NULL)
   THEN
      message ( G$_NLS.Get('SOQOLIB-0154', 'FORM','*ERROR* Admission Administrator Requires a Term and Application Number') );
      RAISE form_trigger_failure;
   END IF;
   BEGIN
      SELECT 'X'
        INTO dummy
        FROM saradap
       WHERE saradap_pidm = :sorainf_pidm
         AND saradap_term_code_entry = :sorainf_term_code
         AND saradap_appl_no = :sorainf_seqno;
   EXCEPTION
      WHEN NO_DATA_FOUND
      THEN
         message ( G$_NLS.Get('SOQOLIB-0155', 'FORM','*ERROR* INVALID ADMISSIONS TERM/APPLICATION NUMBER.') );
         RAISE form_trigger_failure;
   END;
   --
   <<exit_trigger>>
   NULL;
END;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORAINF.CHECK_MODULES
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="CHECK_MODULES")
		public void sorainf_CheckModules()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorainfAdapter sorainfElement = (SorainfAdapter)this.getFormModel().getSorainf().getRowAdapter(true);


				int rowCount = 0;
				{
					NString dummy= NString.getNull();
					if ( sorainfElement.getSorainfModule().equals("R") )
					{
						if ( sorainfElement.getSorainfModule().equals("R") && (sorainfElement.getSorainfTermCode().isNull() || sorainfElement.getSorainfSeqno().isNull()) )
						{
							errorMessage(GNls.Fget(toStr("SOQOLIB-0152"), toStr("FORM"), toStr("*ERROR* Recruit Administrator Requires a Term and Recruit Sequence Number")));
							throw new ApplicationException();
						}
						try
						{
							String sql1 = "SELECT 'X' " +
		" FROM srbrecr " +
		" WHERE srbrecr_pidm = :SORAINF_PIDM AND srbrecr_term_code = :SORAINF_TERM_CODE AND srbrecr_admin_seqno = :SORAINF_SEQNO ";
							DataCommand command1 = new DataCommand(sql1);
							//Setting query parameters
							command1.addParameter("SORAINF_PIDM", sorainfElement.getSorainfPidm());
							command1.addParameter("SORAINF_TERM_CODE", sorainfElement.getSorainfTermCode());
							command1.addParameter("SORAINF_SEQNO", sorainfElement.getSorainfSeqno());
							ResultSet results1 = command1.executeQuery();
							rowCount = command1.getRowCount();
							if ( results1.hasData() ) {
								dummy = results1.getStr(0);
							}
							results1.close();
						}
						catch(NoDataFoundException e)
						{
							errorMessage(GNls.Fget(toStr("SOQOLIB-0153"), toStr("FORM"), toStr("*ERROR* INVALID RECRUITING TERM/SEQUENCE NUMBER.")));
							throw new ApplicationException();
						}
					}
					else if ( sorainfElement.getSorainfModule().equals("A") ) {
						if ( sorainfElement.getSorainfModule().equals("A") && (sorainfElement.getSorainfTermCode().isNull() || sorainfElement.getSorainfSeqno().isNull()) )
						{
							errorMessage(GNls.Fget(toStr("SOQOLIB-0154"), toStr("FORM"), toStr("*ERROR* Admission Administrator Requires a Term and Application Number")));
							throw new ApplicationException();
						}
						try
						{
							String sql2 = "SELECT 'X' " +
		" FROM saradap " +
		" WHERE saradap_pidm = :SORAINF_PIDM AND saradap_term_code_entry = :SORAINF_TERM_CODE AND saradap_appl_no = :SORAINF_SEQNO ";
							DataCommand command2 = new DataCommand(sql2);
							//Setting query parameters
							command2.addParameter("SORAINF_PIDM", sorainfElement.getSorainfPidm());
							command2.addParameter("SORAINF_TERM_CODE", sorainfElement.getSorainfTermCode());
							command2.addParameter("SORAINF_SEQNO", sorainfElement.getSorainfSeqno());
							ResultSet results2 = command2.executeQuery();
							rowCount = command2.getRowCount();
							if ( results2.hasData() ) {
								dummy = results2.getStr(0);
							}
							results2.close();
						}
						catch(NoDataFoundException e)
						{
							errorMessage(GNls.Fget(toStr("SOQOLIB-0155"), toStr("FORM"), toStr("*ERROR* INVALID ADMISSIONS TERM/APPLICATION NUMBER.")));
							throw new ApplicationException();
						}
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORAINF.CALL_SOIAROL
		 ----   :hold_field := :system.cursor_item;
   EXECUTE_TRIGGER ('SAVE_KEYS');
   IF :SORAINF_TERM_CODE IS NULL THEN
      :GLOBAL.TERM_CODE := '';
   ELSE
      :GLOBAL.ID := :admin_ID;

   END IF;
   IF :SORAINF_SEQNO IS NULL THEN
      :GLOBAL.SEQNO := '';
   ELSE
      :GLOBAL.SEQNO := :SORAINF_SEQNO;
   END IF;
   :GLOBAL.FORM_WAS_CALLED := 'Y';
   EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
   G$_CHECK_FAILURE;
    --F2J_TODO: Change global current_user01 to current_user
   G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER01,'SOIAROL','QUERY');
   IF :GLOBAL.ID IS NULL THEN
         NULL;
   ELSE
         :SORAINF_PIDM := :GLOBAL.PIDM;
         :SORAINF_RADM_CODE := :GLOBAL.RDAM_CODE;
         NEXT_FIELD;
   END IF;
   :GLOBAL.FORM_WAS_CALLED := '';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORAINF.CALL_SOIAROL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="CALL_SOIAROL")
		public void sorainf_CallSoiarol()
		{
			
				// --   :hold_field := :system.cursor_item;

				//F2J_WARNING : Caution, the variable may be null.
				SorainfAdapter sorainfElement = (SorainfAdapter)this.getFormModel().getSorainf().getRowAdapter(true);


				// --   :hold_field := :system.cursor_item;
				executeAction("SAVE_KEYS");
				if ( sorainfElement.getSorainfTermCode().isNull() )
				{
					setGlobal("TERM_CODE", toStr(""));
				}
				else {
					setGlobal("ID", sorainfElement.getAdminId());
				}
				if ( sorainfElement.getSorainfSeqno().isNull() )
				{
					setGlobal("SEQNO", toStr(""));
				}
				else {
					setGlobal("SEQNO", toStr(sorainfElement.getSorainfSeqno()));
				}
				setGlobal("FORM_WAS_CALLED", toStr("Y"));
				executeAction("G$_REVOKE_ACCESS");
				getContainer().getGoqrpls().gCheckFailure();
				// F2J_TODO: Change global current_user01 to current_user
				getContainer().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER01"), toStr("SOIAROL"), toStr("QUERY"));
				if ( getGlobal("ID").isNull() )
				{
				}
				else {
					sorainfElement.setSorainfPidm(toNumber(getGlobal("PIDM")));
					sorainfElement.setSorainfRadmCode(getGlobal("RDAM_CODE"));
					nextItem();
				}
				setGlobal("FORM_WAS_CALLED", toStr(""));
			}

		
		/* Original PL/SQL code code for TRIGGER SORAINF.KEY-EDIT
		 EXECUTE_TRIGGER('INVALID_FUNCTION_MSG');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORAINF.KEY-EDIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-EDIT")
		public void sorainf_KeyEdit()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
			}

		
		/* Original PL/SQL code code for TRIGGER SORAINF.KEY-PRVBLK
		 EXECUTE_TRIGGER('INVALID_FUNCTION_MSG');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORAINF.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void sorainf_PreviousBlock()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
			}

		
		/* Original PL/SQL code code for TRIGGER SORAINF.KEY-DUP-ITEM
		 -- force commit before exiting block so that the validations
-- of multiple assignment, type, term, seq and active status
-- will be validated.
execute_trigger('sorainf_return');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORAINF.KEY-DUP-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DUP-ITEM", function=KeyFunction.DUPLICATE_ITEM)
		public void sorainf_KeyDupItem()
		{
			
				//  force commit before exiting block so that the validations
				//  of multiple assignment, type, term, seq and active status
				//  will be validated.
				//  force commit before exiting block so that the validations
				//  of multiple assignment, type, term, seq and active status
				//  will be validated.
				executeAction("sorainf_return");
			}

		
		/* Original PL/SQL code code for TRIGGER SORAINF.POST-QUERY
		 

g$_sel_spriden_id_name (:sorainf_arol_pidm, 'admin_name','N', :admin_id);

IF :sorainf_source_ind = 'U' THEN
	:admin_source_desc := 'USER';
ELSIF :sorainf_source_ind = 'S' THEN
	:admin_source_desc := 'SYSTEM';
ELSE
	:admin_source_desc := NULL;
END IF;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORAINF.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void sorainf_AfterQuery(RowAdapterEvent args)
		{
			
				SorainfAdapter sorainfElement = (SorainfAdapter)args.getRow();


				// F2J_WARNING : Post-query code is executed once for every row retrieved. If you expect the query to return many records, this may cause a performance problem.

				try
				{
					sorainfElement.setLockDbValues(true);
								this.sorainfSourceInd_PostChange();
			this.adminId_PostChange();

				} finally { 
					sorainfElement.setLockDbValues(false);
				}
				Ref<NString> pId_ref = new Ref<NString>(sorainfElement.getAdminId());
				getContainer().getGoqrpls().gSelSpridenIdName(sorainfElement.getSorainfArolPidm(), toStr("admin_name"), toStr("N"), pId_ref);
				sorainfElement.setAdminId(pId_ref.val);
				if ( sorainfElement.getSorainfSourceInd().equals("U") )
				{
					sorainfElement.setAdminSourceDesc(toStr("USER"));
				}
				else if ( sorainfElement.getSorainfSourceInd().equals("S") ) {
					sorainfElement.setAdminSourceDesc(toStr("SYSTEM"));
				}
				else {
					sorainfElement.setAdminSourceDesc(toStr(null));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORAINF.PRE-INSERT
		 execute_trigger ('check_modules');
g$_check_failure;
if :admin_arol_pidm is not null and 
     :sorainf_arol_pidm is null then 
     :sorainf_arol_pidm := :admin_arol_pidm;
end if;
:sorainf_source_ind := 'U';
:admin_source_desc := 'USER';
:sorainf_activity_date := sysdate;

 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORAINF.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowInsert
		public void sorainf_BeforeRowInsert(RowAdapterEvent args)
		{
			
				SorainfAdapter sorainfElement = (SorainfAdapter)args.getRow();


				executeAction("check_modules");
				getContainer().getGoqrpls().gCheckFailure();
				if ( !sorainfElement.getAdminArolPidm().isNull() && sorainfElement.getSorainfArolPidm().isNull() )
				{
					sorainfElement.setSorainfArolPidm(sorainfElement.getAdminArolPidm());
				}
				sorainfElement.setSorainfSourceInd(toStr("U"));
				sorainfElement.setAdminSourceDesc(toStr("USER"));
				sorainfElement.setSorainfActivityDate(NDate.getNow());
			}

		
		/* Original PL/SQL code code for TRIGGER SORAINF.KEY-NXTBLK
		 EXECUTE_TRIGGER('INVALID_FUNCTION_MSG');
RAISE FORM_TRIGGER_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORAINF.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void sorainf_NextBlock()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				throw new ApplicationException();
			}

		
		/* Original PL/SQL code code for TRIGGER SORAINF.POST-BLOCK
		 :ADMIN_ASSIGN_OPTION_IND := '';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORAINF.POST-BLOCK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-BLOCK", function=KeyFunction.BLOCK_OUT)
		public void sorainf_blockOut()
		{
			
				getFormModel().getSAdminAssign().setAdminAssignOptionInd(toStr(""));
			}

		
		/* Original PL/SQL code code for TRIGGER SORAINF.WHEN-VALIDATE-RECORD
		 g$_check_query_mode;
if :global.query_mode = '1' then return;
end if;

if :sorainf_radm_code is null then 
	message(g$_nls.get('SOQOLIB-0156','FORM','*Error* Role is required for an administrative record.'));
	raise form_trigger_failure;
end if; 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORAINF.WHEN-VALIDATE-RECORD
		 *
		 *
		 *</p>
		*/

		@RecordValidationTrigger
		public void sorainf_WhenValidateRecord()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorainfAdapter sorainfElement = (SorainfAdapter)this.getFormModel().getSorainf().getRowAdapter(true);


				getContainer().getGoqrpls().gCheckQueryMode();
				if ( getGlobal("QUERY_MODE").equals("1") )
				{
					return ;
				}
				if ( sorainfElement.getSorainfRadmCode().isNull() )
				{
					errorMessage(GNls.Fget(toStr("SOQOLIB-0156"), toStr("FORM"), toStr("*ERROR* Role is required for an administrative record.")));
					throw new ApplicationException();
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ADMIN_ID.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="ADMIN_ID", function=KeyFunction.NEXT_ITEM)
		public void adminId_keyNexItem()
		{
			
				getGIdClass().keyNexItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ADMIN_ID.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="ADMIN_ID")
		public void adminId_PostChange()
		{
			
				getGIdClass().postChange();
			}

		
		/* Original PL/SQL code code for TRIGGER ADMIN_ID.KEY-LISTVAL
		 G$_COPY_FLD_ATTR;
EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
G$_CHECK_FAILURE;
 --F2J_TODO: Change global current_user01 to current_user
G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER01,'SOAIDEN','QUERY');
G$_RESET_GLOBAL;
--
   IF :GLOBAL.VALUE IS NOT NULL  THEN
      EXECUTE_TRIGGER( 'LIST_VALUES_COPY' ) ;
      G$_CHECK_FAILURE ;
      NEXT_item;
   END IF ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ADMIN_ID.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="ADMIN_ID", function=KeyFunction.LIST_VALUES)
		public void adminId_ListValues()
		{
			
				getContainer().getGoqrpls().gCopyFldAttr();
				executeAction("G$_REVOKE_ACCESS");
				getContainer().getGoqrpls().gCheckFailure();
				// F2J_TODO: Change global current_user01 to current_user
				getContainer().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER01"), toStr("SOAIDEN"), toStr("QUERY"));
				getContainer().getGoqrpls().gResetGlobal();
				// 
				if ( !getGlobal("VALUE").isNull() )
				{
					executeAction("LIST_VALUES_COPY");
					getContainer().getGoqrpls().gCheckFailure();
					nextItem();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER ADMIN_ID.KEY-CQUERY
		 go_item('admin_id');
:global.form_was_called := 'Y';
g$_copy_fld_attr;
execute_trigger ('G$_REVOKE_ACCESS');
g$_check_failure;
:global.form_was_called := 'Y';
execute_trigger ('SAVE_KEYS');
--
:global.id := '';
:global.radm_code := '';
 --F2J_TODO: Change global current_user01 to current_user
g$_secured_form_call (:global.current_user01, 'SOIAROL', 'QUERY');
g$_reset_global;
--
IF :global.id IS NOT NULL
THEN
   :admin_id := :global.id;
   :sorainf_radm_code := :global.radm_code;
   next_item;
END IF;
:global.form_was_called := '';


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ADMIN_ID.KEY-CQUERY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CQUERY", item="ADMIN_ID", function=KeyFunction.COUNT_QUERY)
		public void adminId_TotalResults()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorainfAdapter sorainfElement = (SorainfAdapter)this.getFormModel().getSorainf().getRowAdapter(true);


				goItem(toStr("admin_id"));
				setGlobal("FORM_WAS_CALLED", toStr("Y"));
				getContainer().getGoqrpls().gCopyFldAttr();
				executeAction("G$_REVOKE_ACCESS");
				getContainer().getGoqrpls().gCheckFailure();
				setGlobal("FORM_WAS_CALLED", toStr("Y"));
				executeAction("SAVE_KEYS");
				// 
				setGlobal("ID", toStr(""));
				setGlobal("RADM_CODE", toStr(""));
				// F2J_TODO: Change global current_user01 to current_user
				getContainer().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER01"), toStr("SOIAROL"), toStr("QUERY"));
				getContainer().getGoqrpls().gResetGlobal();
				// 
				if ( !getGlobal("ID").isNull() )
				{
					sorainfElement.setAdminId(getGlobal("ID"));
					sorainfElement.setSorainfRadmCode(getGlobal("RADM_CODE"));
					nextItem();
				}
				setGlobal("FORM_WAS_CALLED", toStr(""));
			}

		
		/* Original PL/SQL code code for TRIGGER ADMIN_ID.WHEN-VALIDATE-ITEM
		 if :system.record_status = 'QUERY' then 
  return;
end if;
IF :ADMIN_ID IS NOT NULL 
THEN
-- IF :ADMIN_QUERY_MODE = 'N'
-- THEN   
   s$_valid_id (
      :admin_id,
      :admin_arol_pidm,
      :admin_name,
      :admin_confid_ind,
      :admin_dcsd_ind
      );
   g$_check_failure;
   
   DECLARE
     CURSOR c_id_check
     IS
      SELECT 'X'
        FROM sorarol
       WHERE sorarol_pidm = :admin_arol_pidm;
     id                            VARCHAR2(1);
   BEGIN
     OPEN c_id_check;
     FETCH c_id_check INTO id;
     IF c_id_check%notfound
     THEN
      message ( G$_NLS.Get('SOQOLIB-0157', 'FORM','*ERROR* ID is not an Administrator defined on SOAAROL.Press COUNT HITS for valid values.') 
                );
      RAISE form_trigger_failure;
      END IF;
    END;
     :sorainf_arol_pidm := :admin_arol_pidm;
 -- end if;
  
 else  <multilinecomment> id is null </multilinecomment>
  if :sorainf_arol_pidm is not null then 
     :sorainf_arol_pidm := '';
  end if;
  :admin_name := '';

END IF;





		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ADMIN_ID.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="ADMIN_ID")
		public void adminId_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorainfAdapter sorainfElement = (SorainfAdapter)this.getFormModel().getSorainf().getRowAdapter(true);


				int rowCount = 0;
			this.adminId_PostChange();

				// F2J_WARNING : The built-in  call was converted but there can be semantic differences in the resulting code.
				if ( getRecordStatus().equals("QUERY") )
				{
					return ;
				}
				if ( !sorainfElement.getAdminId().isNull() )
				{
					//  IF :ADMIN_QUERY_MODE = 'N'
					//  THEN   
					sValidId(sorainfElement.getAdminId(), sorainfElement.getAdminArolPidm(), sorainfElement.getAdminName(), sorainfElement.getAdminConfidInd(), sorainfElement.getAdminDcsdInd());
					getContainer().getGoqrpls().gCheckFailure();
					{
						String sqlcIdCheck = "SELECT 'X' " +
	" FROM sorarol " +
	" WHERE sorarol_pidm = :ADMIN_AROL_PIDM ";
						DataCursor cIdCheck = new DataCursor(sqlcIdCheck);
						try {
							NString id= NString.getNull();
							//Setting query parameters
							cIdCheck.addParameter("ADMIN_AROL_PIDM", sorainfElement.getAdminArolPidm());
							//F2J_WARNING : Make sure that the method "Close" is being called over the variable cIdCheck.
							cIdCheck.open();
							ResultSet cIdCheckResults = cIdCheck.fetchInto();
							if ( cIdCheckResults != null ) {
								id = cIdCheckResults.getStr(0);
							}
							if ( cIdCheck.notFound() )
							{
								errorMessage(GNls.Fget(toStr("SOQOLIB-0157"), toStr("FORM"), toStr("*ERROR* ID is not an Administrator defined on SOAAROL.Press COUNT HITS for valid values.")));
								throw new ApplicationException();
							}
						} finally {
							cIdCheck.close();
						}
					}
					sorainfElement.setSorainfArolPidm(sorainfElement.getAdminArolPidm());
				}
				else {
					//  id is null 
					if ( !sorainfElement.getSorainfArolPidm().isNull() )
					{
						sorainfElement.setSorainfArolPidm(toNumber(""));
					}
					sorainfElement.setAdminName(toStr(""));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER ADMIN_ID.PRE-TEXT-ITEM
		 BEGIN
	  --SYNCHRONIZE;
    IF :ADMIN_NAME IS NOT NULL THEN
      SET_ITEM_PROPERTY('ADMIN_NAME',ENABLED,PROPERTY_FALSE);
    END IF;
--  G$_IDNAME_SEARCH.DISABLE_NAME_ITEM;
--  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ADMIN_ID.PRE-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="PRE-TEXT-ITEM", item="ADMIN_ID", function=KeyFunction.ITEM_IN)
		public void adminId_itemIn()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorainfAdapter sorainfElement = (SorainfAdapter)this.getFormModel().getSorainf().getRowAdapter(true);


				// SYNCHRONIZE;
				if ( !sorainfElement.getAdminName().isNull() )
				{
					setItemEnabled("ADMIN_NAME", false);
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ADMIN_NAME.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="ADMIN_NAME", function=KeyFunction.NEXT_ITEM)
		public void adminName_keyNexItem()
		{
			
				getGNameClass().keyNexItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORAINF_RADM_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SORAINF_RADM_CODE")
		public void sorainfRadmCode_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORAINF_RADM_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SORAINF_RADM_CODE", function=KeyFunction.ITEM_CHANGE)
		public void sorainfRadmCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORAINF_RADM_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS")
		public void sorainfRadmCode_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORAINF_RADM_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SORAINF_RADM_CODE", function=KeyFunction.NEXT_ITEM)
		public void sorainfRadmCode_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORAINF_RADM_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SORAINF_RADM_CODE", function=KeyFunction.ITEM_OUT)
		public void sorainfRadmCode_itemOut()
		{
			
				getGCodeClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER SORAINF_RADM_CODE.G$_SEARCH_PARAMETERS
		 if :sorainf_arol_pidm is null then 
  :sorainf_arol_pidm := :admin_arol_pidm;
end if;
G$_SEARCH.PARAMETERS('stvradm_code',
   'stvradm_desc','');


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORAINF_RADM_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS")
		public void sorainfRadmCode_GSearchParameters()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorainfAdapter sorainfElement = (SorainfAdapter)this.getFormModel().getSorainf().getRowAdapter(true);


				if ( sorainfElement.getSorainfArolPidm().isNull() )
				{
					sorainfElement.setSorainfArolPidm(sorainfElement.getAdminArolPidm());
				}
				getContainer().getGoqrpls().getGSearch().parameters(toStr("stvradm_code"), toStr("stvradm_desc"), toStr(""));
			}

		
		/* Original PL/SQL code code for TRIGGER SORAINF_RADM_CODE.WHEN-VALIDATE-ITEM
		 if :sorainf_radm_code is null then
  return;
end if;
DECLARE
   CURSOR radm_check
   IS
      SELECT 'x'
        FROM stvradm
       WHERE stvradm_code = :sorainf_radm_code;
   radm_desc                     VARCHAR2(1);
   CURSOR c_arol_check
   IS
      SELECT 'X'
        FROM sorarol
       WHERE sorarol_pidm = :sorainf_arol_pidm
         AND sorarol_radm_code = :sorainf_radm_code;
   arol_check                    VARCHAR2(1);
BEGIN
   if :admin_arol_pidm is not null and 
     :sorainf_arol_pidm is null then 
     :sorainf_arol_pidm := :admin_arol_pidm;
   end if;
   OPEN radm_check;
   FETCH radm_check INTO radm_desc;
   IF radm_check%notfound
   THEN
         message ( G$_NLS.Get('SOQOLIB-0158', 'FORM','*ERROR* Role Code is invalid. Press LIST for valid codes.') );
         RAISE form_trigger_failure;
   END IF;
   OPEN C_arol_check;
   FETCH C_arol_check INTO arol_check;
   IF C_arol_check%notfound
   THEN
         message ( G$_NLS.Get('SOQOLIB-0159', 'FORM','*ERROR* Invalid Role for Administrator.  Role Assignments are made on form SOAAROL.') );
         RAISE form_trigger_failure;
   END IF;
END;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORAINF_RADM_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SORAINF_RADM_CODE")
		public void sorainfRadmCode_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorainfAdapter sorainfElement = (SorainfAdapter)this.getFormModel().getSorainf().getRowAdapter(true);


				int rowCount = 0;
				if ( sorainfElement.getSorainfRadmCode().isNull() )
				{
					return ;
				}
				{
					String sqlradmCheck = "SELECT 'x' " +
	" FROM stvradm " +
	" WHERE stvradm_code = :SORAINF_RADM_CODE ";
					DataCursor radmCheck = new DataCursor(sqlradmCheck);
					NString radmDesc= NString.getNull();
					String sqlcArolCheck = "SELECT 'X' " +
	" FROM sorarol " +
	" WHERE sorarol_pidm = :SORAINF_AROL_PIDM AND sorarol_radm_code = :SORAINF_RADM_CODE ";
					DataCursor cArolCheck = new DataCursor(sqlcArolCheck);
					try {
						NString arolCheck= NString.getNull();
						if ( !sorainfElement.getAdminArolPidm().isNull() && sorainfElement.getSorainfArolPidm().isNull() )
						{
							sorainfElement.setSorainfArolPidm(sorainfElement.getAdminArolPidm());
						}
						//Setting query parameters
						radmCheck.addParameter("SORAINF_RADM_CODE", sorainfElement.getSorainfRadmCode());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable radmCheck.
						radmCheck.open();
						ResultSet radmCheckResults = radmCheck.fetchInto();
						if ( radmCheckResults != null ) {
							radmDesc = radmCheckResults.getStr(0);
						}
						if ( radmCheck.notFound() )
						{
							errorMessage(GNls.Fget(toStr("SOQOLIB-0158"), toStr("FORM"), toStr("*ERROR* Role Code is invalid. Press LIST for valid codes.")));
							throw new ApplicationException();
						}
						//Setting query parameters
						cArolCheck.addParameter("SORAINF_AROL_PIDM", sorainfElement.getSorainfArolPidm());
						cArolCheck.addParameter("SORAINF_RADM_CODE", sorainfElement.getSorainfRadmCode());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable cArolCheck.
						cArolCheck.open();
						ResultSet cArolCheckResults = cArolCheck.fetchInto();
						if ( cArolCheckResults != null ) {
							arolCheck = cArolCheckResults.getStr(0);
						}
						if ( cArolCheck.notFound() )
						{
							errorMessage(GNls.Fget(toStr("SOQOLIB-0159"), toStr("FORM"), toStr("*ERROR* Invalid Role for Administrator.  Role Assignments are made on form SOAAROL.")));
							throw new ApplicationException();
						}
					} finally {
						radmCheck.close();
						cArolCheck.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORAINF_MODULE.WHEN-VALIDATE-ITEM
		 IF :SORAINF_MODULE IS NOT NULL
THEN
   IF :SORAINF_MODULE != 'A' AND :SORAINF_MODULE != 'R'
   THEN
      message( G$_NLS.Get('SOQOLIB-0160', 'FORM','*ERROR* Invalid module code; Valid values are A for Admissions and R for Recruiting.') );
      RAISE FORM_TRIGGER_FAILURE;
   END IF;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORAINF_MODULE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SORAINF_MODULE")
		public void sorainfModule_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorainfAdapter sorainfElement = (SorainfAdapter)this.getFormModel().getSorainf().getRowAdapter(true);


				if ( !sorainfElement.getSorainfModule().isNull() )
				{
					if ( sorainfElement.getSorainfModule().notEquals("A") && sorainfElement.getSorainfModule().notEquals("R") )
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0160"), toStr("FORM"), toStr("*ERROR* Invalid module code; Valid values are A for Admissions and R for Recruiting.")));
						throw new ApplicationException();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORAINF_TERM_CODE.KEY-LISTVAL
		 :global.form_was_called := 'Y';
g$_copy_fld_attr;
execute_trigger ('G$_REVOKE_ACCESS');
g$_check_failure;
--
execute_trigger ('SAVE_KEYS');
--
:global.term_code := '';
:global.seqno := '';
:global.sum_recr_admin_seqno := '';
:global.sum_recr_term := '';
--
IF :sorainf_module = 'R'
THEN
 --F2J_TODO: Change global current_user01 to current_user
   g$_secured_form_call (:global.current_user01, 'SRASUMI', 'QUERY');
   g$_reset_global;
   IF :global.sum_recr_term IS NOT NULL
   THEN
      :sorainf_seqno := :global.sum_recr_admin_seqno;
      :sorainf_term_code := :global.sum_recr_term;
      go_item ('SORAINF_TERM_CODE');
      next_item;
      next_item;
   END IF;
END IF;
--
IF :sorainf_module = 'A'
THEN
 --F2J_TODO: Change global current_user01 to current_user
   g$_secured_form_call (:global.current_user01, 'SAASUMI', 'QUERY');
   g$_reset_global;
   IF :global.term_code IS NOT NULL
   THEN
      :sorainf_seqno := :global.seqno;
      :sorainf_term_code := :global.term_code;
      go_item ('SORAINF_TERM_CODE');
      next_item;
      next_item;
   END IF;
END IF;
--
IF     :sorainf_module != 'A'
   AND :sorainf_module != 'R'
THEN
   message ( G$_NLS.Get('SOQOLIB-0161', 'FORM','*ERROR* Module code must be R or A.') );
END IF;
--

:global.form_was_called := '';

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORAINF_TERM_CODE.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="SORAINF_TERM_CODE", function=KeyFunction.LIST_VALUES)
		public void sorainfTermCode_ListValues()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorainfAdapter sorainfElement = (SorainfAdapter)this.getFormModel().getSorainf().getRowAdapter(true);


				setGlobal("FORM_WAS_CALLED", toStr("Y"));
				getContainer().getGoqrpls().gCopyFldAttr();
				executeAction("G$_REVOKE_ACCESS");
				getContainer().getGoqrpls().gCheckFailure();
				// 
				executeAction("SAVE_KEYS");
				// 
				setGlobal("TERM_CODE", toStr(""));
				setGlobal("SEQNO", toStr(""));
				setGlobal("SUM_RECR_ADMIN_SEQNO", toStr(""));
				setGlobal("SUM_RECR_TERM", toStr(""));
				// 
				if ( sorainfElement.getSorainfModule().equals("R") )
				{
					// F2J_TODO: Change global current_user01 to current_user
					getContainer().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER01"), toStr("SRASUMI"), toStr("QUERY"));
					getContainer().getGoqrpls().gResetGlobal();
					if ( !getGlobal("SUM_RECR_TERM").isNull() )
					{
						sorainfElement.setSorainfSeqno(toNumber(getGlobal("SUM_RECR_ADMIN_SEQNO")));
						sorainfElement.setSorainfTermCode(getGlobal("SUM_RECR_TERM"));
						goItem(toStr("SORAINF_TERM_CODE"));
						nextItem();
						nextItem();
					}
				}
				// 
				if ( sorainfElement.getSorainfModule().equals("A") )
				{
					// F2J_TODO: Change global current_user01 to current_user
					getContainer().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER01"), toStr("SAASUMI"), toStr("QUERY"));
					getContainer().getGoqrpls().gResetGlobal();
					if ( !getGlobal("TERM_CODE").isNull() )
					{
						sorainfElement.setSorainfSeqno(toNumber(getGlobal("SEQNO")));
						sorainfElement.setSorainfTermCode(getGlobal("TERM_CODE"));
						goItem(toStr("SORAINF_TERM_CODE"));
						nextItem();
						nextItem();
					}
				}
				// 
				if ( sorainfElement.getSorainfModule().notEquals("A") && sorainfElement.getSorainfModule().notEquals("R") )
				{
					errorMessage(GNls.Fget(toStr("SOQOLIB-0161"), toStr("FORM"), toStr("*ERROR* Module code must be R or A.")));
				}
				// 
				setGlobal("FORM_WAS_CALLED", toStr(""));
			}

		
		/* Original PL/SQL code code for TRIGGER SORAINF_TERM_CODE.WHEN-VALIDATE-ITEM
		 IF :sorainf_term_code IS NULL
THEN
   RETURN;
END IF;
IF :sorainf_module IS NULL
THEN
   message ( G$_NLS.Get('SOQOLIB-0162', 'FORM','*ERROR* Module Indicator must be entered to validate the term.') );
   RAISE form_trigger_failure;
END IF;
--
IF :sorainf_module = 'A'
THEN
   GOTO check_admissions;
END IF;
DECLARE
   dummy                         VARCHAR2(1);
BEGIN
   SELECT 'X'
     INTO dummy
     FROM srbrecr
    WHERE srbrecr_pidm = :sorainf_pidm
      AND srbrecr_term_code = :sorainf_term_code;
EXCEPTION
   WHEN NO_DATA_FOUND
   THEN
      message ( G$_NLS.Get('SOQOLIB-0163', 'FORM','*ERROR* Invalid Recruiting Term Code; Press LIST for valid codes.') );
      RAISE form_trigger_failure;
   WHEN TOO_MANY_ROWS
   THEN
      NULL;
END;
GOTO trigger_exit;
<<check_admissions>>
DECLARE
   dummy                         VARCHAR2(1);
BEGIN
   SELECT 'X'
     INTO dummy
     FROM saradap
    WHERE saradap_pidm = :sorainf_pidm
      AND saradap_term_code_entry = :sorainf_term_code;
EXCEPTION
   WHEN NO_DATA_FOUND
   THEN
      message ( G$_NLS.Get('SOQOLIB-0164', 'FORM','*ERROR* Invalid Admissions Term Code; Press LIST for valid codes.') );
      RAISE form_trigger_failure;
   WHEN TOO_MANY_ROWS
   THEN
      NULL;
END;
<<trigger_exit>>
NULL;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORAINF_TERM_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SORAINF_TERM_CODE")
		public void sorainfTermCode_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorainfAdapter sorainfElement = (SorainfAdapter)this.getFormModel().getSorainf().getRowAdapter(true);


				int rowCount = 0;
				if ( sorainfElement.getSorainfTermCode().isNull() )
				{
					return ;
				}
				if ( sorainfElement.getSorainfModule().isNull() )
				{
					errorMessage(GNls.Fget(toStr("SOQOLIB-0162"), toStr("FORM"), toStr("*ERROR* Module Indicator must be entered to validate the term.")));
					throw new ApplicationException();
				}
				// 
				if ( sorainfElement.getSorainfModule().equals("A") )
				{
					NString dummy= NString.getNull();
					try
					{
						String sql2 = "SELECT 'X' " +
	" FROM saradap " +
	" WHERE saradap_pidm = :SORAINF_PIDM AND saradap_term_code_entry = :SORAINF_TERM_CODE ";
						DataCommand command2 = new DataCommand(sql2);
						//Setting query parameters
						command2.addParameter("SORAINF_PIDM", sorainfElement.getSorainfPidm());
						command2.addParameter("SORAINF_TERM_CODE", sorainfElement.getSorainfTermCode());
						ResultSet results2 = command2.executeQuery();
						rowCount = command2.getRowCount();
						if ( results2.hasData() ) {
							dummy = results2.getStr(0);
						}
						results2.close();
					}
					catch(NoDataFoundException e)
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0164"), toStr("FORM"), toStr("*ERROR* Invalid Admissions Term Code; Press LIST for valid codes.")));
						throw new ApplicationException();
					}
					catch(TooManyRowsException e)
					{
					}
				}
				{
					NString dummy= NString.getNull();
					try
					{
						String sql1 = "SELECT 'X' " +
	" FROM srbrecr " +
	" WHERE srbrecr_pidm = :SORAINF_PIDM AND srbrecr_term_code = :SORAINF_TERM_CODE ";
						DataCommand command1 = new DataCommand(sql1);
						//Setting query parameters
						command1.addParameter("SORAINF_PIDM", sorainfElement.getSorainfPidm());
						command1.addParameter("SORAINF_TERM_CODE", sorainfElement.getSorainfTermCode());
						ResultSet results1 = command1.executeQuery();
						rowCount = command1.getRowCount();
						if ( results1.hasData() ) {
							dummy = results1.getStr(0);
						}
						results1.close();
					}
					catch(NoDataFoundException e)
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0163"), toStr("FORM"), toStr("*ERROR* Invalid Recruiting Term Code; Press LIST for valid codes.")));
						throw new ApplicationException();
					}
					catch(TooManyRowsException e)
					{
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORAINF_SOURCE_IND.POST-CHANGE
		 IF :sorainf_source_ind = 'U' THEN
	:admin_source_desc := 'USER';
ELSIF :sorainf_source_ind = 'S' THEN
	:admin_source_desc := 'SYSTEM';
ELSE
	:admin_source_desc := NULL;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORAINF_SOURCE_IND.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="SORAINF_SOURCE_IND")
		public void sorainfSourceInd_PostChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorainfAdapter sorainfElement = (SorainfAdapter)this.getFormModel().getSorainf().getRowAdapter(true);


				if(sorainfElement.getSorainfSourceInd().isNull())
		return;
				if ( sorainfElement.getSorainfSourceInd().equals("U") )
				{
					sorainfElement.setAdminSourceDesc(toStr("USER"));
				}
				else if ( sorainfElement.getSorainfSourceInd().equals("S") ) {
					sorainfElement.setAdminSourceDesc(toStr("SYSTEM"));
				}
				else {
					sorainfElement.setAdminSourceDesc(toStr(null));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORAINF_SEQNO.WHEN-VALIDATE-ITEM
		 IF :sorainf_seqno IS NULL
THEN
   RETURN;
END IF;
IF :sorainf_module IS NULL
THEN
   message ( G$_NLS.Get('SOQOLIB-0165', 'FORM','*ERROR* Module Indicator must be entered to validate the Sequence Number.') );
   RAISE form_trigger_failure;
END IF;

--
IF :sorainf_term_code IS NULL
THEN
   message ( G$_NLS.Get('SOQOLIB-0166', 'FORM','*ERROR* Term Code must be entered to validate the Sequence Number.') );
   RAISE form_trigger_failure;
END IF;
IF :sorainf_module = 'A'
THEN
   GOTO check_admissions;
END IF;
DECLARE
   dummy                         VARCHAR2(1);
BEGIN
   SELECT 'X'
     INTO dummy
     FROM srbrecr
    WHERE srbrecr_pidm = :sorainf_pidm
      AND srbrecr_term_code = :sorainf_term_code
      AND srbrecr_admin_seqno = :sorainf_seqno;
EXCEPTION
   WHEN NO_DATA_FOUND
   THEN
      message ( G$_NLS.Get('SOQOLIB-0167', 'FORM','*ERROR* Invalid Recruiting Sequence Number; Press LIST for valid numbers.') );
      RAISE form_trigger_failure;
   WHEN TOO_MANY_ROWS
   THEN
      NULL;
END;
GOTO trigger_exit;
<<check_admissions>>
DECLARE
   dummy                         VARCHAR2(1);
BEGIN
   SELECT 'X'
     INTO dummy
     FROM saradap
    WHERE saradap_pidm = :sorainf_pidm
      AND saradap_term_code_entry = :sorainf_term_code
      AND saradap_appl_no = :sorainf_seqno;
EXCEPTION
   WHEN NO_DATA_FOUND
   THEN
      message ( G$_NLS.Get('SOQOLIB-0168', 'FORM','*ERROR* Invalid Application Sequence Number; Press LIST for valid numbers.') );
      RAISE form_trigger_failure;
   WHEN TOO_MANY_ROWS
   THEN
      NULL;
END;

<<trigger_exit>>


NULL;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORAINF_SEQNO.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SORAINF_SEQNO")
		public void sorainfSeqno_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorainfAdapter sorainfElement = (SorainfAdapter)this.getFormModel().getSorainf().getRowAdapter(true);


				int rowCount = 0;
				if ( sorainfElement.getSorainfSeqno().isNull() )
				{
					return ;
				}
				if ( sorainfElement.getSorainfModule().isNull() )
				{
					errorMessage(GNls.Fget(toStr("SOQOLIB-0165"), toStr("FORM"), toStr("*ERROR* Module Indicator must be entered to validate the Sequence Number.")));
					throw new ApplicationException();
				}
				// 
				if ( sorainfElement.getSorainfTermCode().isNull() )
				{
					errorMessage(GNls.Fget(toStr("SOQOLIB-0166"), toStr("FORM"), toStr("*ERROR* Term Code must be entered to validate the Sequence Number.")));
					throw new ApplicationException();
				}
				if ( sorainfElement.getSorainfModule().equals("A") )
				{
					NString dummy= NString.getNull();
					try
					{
						String sql2 = "SELECT 'X' " +
	" FROM saradap " +
	" WHERE saradap_pidm = :SORAINF_PIDM AND saradap_term_code_entry = :SORAINF_TERM_CODE AND saradap_appl_no = :SORAINF_SEQNO ";
						DataCommand command2 = new DataCommand(sql2);
						//Setting query parameters
						command2.addParameter("SORAINF_PIDM", sorainfElement.getSorainfPidm());
						command2.addParameter("SORAINF_TERM_CODE", sorainfElement.getSorainfTermCode());
						command2.addParameter("SORAINF_SEQNO", sorainfElement.getSorainfSeqno());
						ResultSet results2 = command2.executeQuery();
						rowCount = command2.getRowCount();
						if ( results2.hasData() ) {
							dummy = results2.getStr(0);
						}
						results2.close();
					}
					catch(NoDataFoundException e)
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0168"), toStr("FORM"), toStr("*ERROR* Invalid Application Sequence Number; Press LIST for valid numbers.")));
						throw new ApplicationException();
					}
					catch(TooManyRowsException e)
					{
					}
				}
				{
					NString dummy= NString.getNull();
					try
					{
						String sql1 = "SELECT 'X' " +
	" FROM srbrecr " +
	" WHERE srbrecr_pidm = :SORAINF_PIDM AND srbrecr_term_code = :SORAINF_TERM_CODE AND srbrecr_admin_seqno = :SORAINF_SEQNO ";
						DataCommand command1 = new DataCommand(sql1);
						//Setting query parameters
						command1.addParameter("SORAINF_PIDM", sorainfElement.getSorainfPidm());
						command1.addParameter("SORAINF_TERM_CODE", sorainfElement.getSorainfTermCode());
						command1.addParameter("SORAINF_SEQNO", sorainfElement.getSorainfSeqno());
						ResultSet results1 = command1.executeQuery();
						rowCount = command1.getRowCount();
						if ( results1.hasData() ) {
							dummy = results1.getStr(0);
						}
						results1.close();
					}
					catch(NoDataFoundException e)
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0167"), toStr("FORM"), toStr("*ERROR* Invalid Recruiting Sequence Number; Press LIST for valid numbers.")));
						throw new ApplicationException();
					}
					catch(TooManyRowsException e)
					{
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORAINF_SEQNO.KEY-LISTVAL
		 g$_check_value (
    (:admin_id IS NULL),
    G$_NLS.Get('SOQOLIB-0169', 'FORM','*ERROR* A valid ID must be entered.') ,
   TRUE,
   TRUE
);
:global.form_was_called := 'Y';
g$_copy_fld_attr;
execute_trigger ('G$_REVOKE_ACCESS');
g$_check_failure;
--
execute_trigger ('SAVE_KEYS');
--

:global.term_code := '';
:global.seqno := '';
:global.sum_recr_admin_seqno := '';
:global.sum_recr_term := '';
--
IF :sorainf_module = 'R'
THEN
 --F2J_TODO: Change global current_user01 to current_user
   g$_secured_form_call (:global.current_user01, 'SRASUMI', 'QUERY');
   g$_reset_global;
   IF :global.sum_recr_term IS NOT NULL
   THEN
      :sorainf_seqno := :global.sum_recr_admin_seqno;
      :sorainf_term_code := :global.sum_recr_term;
      go_item ('SORAINF_TERM_CODE');
      next_item;
      next_item;
   END IF;
END IF;
--
IF :sorainf_module = 'A'
THEN
 --F2J_TODO: Change global current_user01 to current_user
   g$_secured_form_call (:global.current_user01, 'SAASUMI', 'QUERY');
   g$_reset_global;
   IF :global.term_code IS NOT NULL
   THEN
      :sorainf_seqno := :global.seqno;
      :sorainf_term_code := :global.term_code;
      go_item ('SORAINF_TERM_CODE');
      next_item;
      next_item;
   END IF;
END IF;
--
IF     :sorainf_module != 'A'
   AND :sorainf_module != 'R'
THEN
   message ( G$_NLS.Get('SOQOLIB-0170', 'FORM','*ERROR* Module code must be R or A.') );
END IF;
--

:global.form_was_called := '';

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORAINF_SEQNO.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="SORAINF_SEQNO", function=KeyFunction.LIST_VALUES)
		public void sorainfSeqno_ListValues()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorainfAdapter sorainfElement = (SorainfAdapter)this.getFormModel().getSorainf().getRowAdapter(true);


				getContainer().getGoqrpls().gCheckValue((toBool(sorainfElement.getAdminId().isNull())), GNls.Fget(toStr("SOQOLIB-0169"), toStr("FORM"), toStr("*ERROR* A valid ID must be entered.")), toBool(NBool.True), toBool(NBool.True));
				setGlobal("FORM_WAS_CALLED", toStr("Y"));
				getContainer().getGoqrpls().gCopyFldAttr();
				executeAction("G$_REVOKE_ACCESS");
				getContainer().getGoqrpls().gCheckFailure();
				// 
				executeAction("SAVE_KEYS");
				// 
				setGlobal("TERM_CODE", toStr(""));
				setGlobal("SEQNO", toStr(""));
				setGlobal("SUM_RECR_ADMIN_SEQNO", toStr(""));
				setGlobal("SUM_RECR_TERM", toStr(""));
				// 
				if ( sorainfElement.getSorainfModule().equals("R") )
				{
					// F2J_TODO: Change global current_user01 to current_user
					getContainer().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER01"), toStr("SRASUMI"), toStr("QUERY"));
					getContainer().getGoqrpls().gResetGlobal();
					if ( !getGlobal("SUM_RECR_TERM").isNull() )
					{
						sorainfElement.setSorainfSeqno(toNumber(getGlobal("SUM_RECR_ADMIN_SEQNO")));
						sorainfElement.setSorainfTermCode(getGlobal("SUM_RECR_TERM"));
						goItem(toStr("SORAINF_TERM_CODE"));
						nextItem();
						nextItem();
					}
				}
				// 
				if ( sorainfElement.getSorainfModule().equals("A") )
				{
					// F2J_TODO: Change global current_user01 to current_user
					getContainer().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER01"), toStr("SAASUMI"), toStr("QUERY"));
					getContainer().getGoqrpls().gResetGlobal();
					if ( !getGlobal("TERM_CODE").isNull() )
					{
						sorainfElement.setSorainfSeqno(toNumber(getGlobal("SEQNO")));
						sorainfElement.setSorainfTermCode(getGlobal("TERM_CODE"));
						goItem(toStr("SORAINF_TERM_CODE"));
						nextItem();
						nextItem();
					}
				}
				// 
				if ( sorainfElement.getSorainfModule().notEquals("A") && sorainfElement.getSorainfModule().notEquals("R") )
				{
					errorMessage(GNls.Fget(toStr("SOQOLIB-0170"), toStr("FORM"), toStr("*ERROR* Module code must be R or A.")));
				}
				// 
				setGlobal("FORM_WAS_CALLED", toStr(""));
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ADMIN_SOURCE_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="ADMIN_SOURCE_DESC", function=KeyFunction.ITEM_CHANGE)
		public void adminSourceDesc_itemChange()
		{
			
				getGDescClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORAINF_SOURCE_IND.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SORAINF_SOURCE_IND")
		public void sorainfSourceInd_validate()
		{
			
				SorainfAdapter sorainfElement = (SorainfAdapter)this.getFormModel().getSorainf().getRowAdapter(true);
							this.sorainfSourceInd_PostChange();

			}

		
	
	
}

