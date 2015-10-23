package net.hedtech.banner.finance.common.Fraprop.controller;
 
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
import net.hedtech.general.common.libraries.Foqrpls.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.banner.finance.common.Fraprop.model.*;
import net.hedtech.banner.finance.common.Fraprop.*;
import net.hedtech.banner.finance.common.Fraprop.services.*;
//import com.ellucian.forms.Goqolib.services.GNameClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GNameClass;	

import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class FrrprptController extends DefaultBlockController {

	private GNameClass getGNameClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GNameClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_NAME_CLASS");
	}	

	
	public FrrprptController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
		
	@Override
	public FrapropTask getTask() {
		return (FrapropTask)super.getTask();
	}

	public FrapropModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
		/* Original PL/SQL code code for TRIGGER FRRPRPT.KEY-DOWN
		 if :frrprpt.frrprpt_agency_code is null and 
	 :frrprpt.frrprpt_federal_fund_percent is null then
	 	message( G$_NLS.Get('FRAPROP-0128', 'FORM','Agency Code And Percentage Should Be Entered !') );
	 	raise form_trigger_failure;
end if;
next_record;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRPRPT.KEY-DOWN
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DOWN", function=KeyFunction.NEXT_RECORD)
		public void frrprpt_MoveDown()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrrprptAdapter frrprptElement = (FrrprptAdapter)this.getFormModel().getFrrprpt().getRowAdapter(true);


				if ( frrprptElement.getFrrprptAgencyCode().isNull() && frrprptElement.getFrrprptFederalFundPercent().isNull() )
				{
					errorMessage(GNls.Fget(toStr("FRAPROP-0128"), toStr("FORM"), toStr("*ERROR* Agency Code And Percentage Should Be Entered !")));
					throw new ApplicationException();
				}
				nextRecord();
			}

		
		/* Original PL/SQL code code for TRIGGER FRRPRPT.KEY-UP
		 previous_record;
G$_CHECK_FAILURE;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRPRPT.KEY-UP
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-UP", function=KeyFunction.PREVIOUS_RECORD)
		public void frrprpt_MoveUp()
		{
			
				previousRecord();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FRRPRPT.WHEN-NEW-BLOCK-INSTANCE
		 NULL;


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRPRPT.WHEN-NEW-BLOCK-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-BLOCK-INSTANCE", function=KeyFunction.BLOCK_CHANGE)
		public void frrprpt_blockChange()
		{
			
			}

		
		/* Original PL/SQL code code for TRIGGER FRRPRPT.KEY-COMMIT
		 declare
	msg_level VARCHAR2(3);
begin
	msg_level := :system.message_level;
	execute_trigger('get_percentage_total');
	g$_check_failure;
	execute_trigger('check_duplicate_agency_code');
	g$_check_failure;
  :system.message_level := msg_level;
	IF :SYSTEM.block_STATUS = 'CHANGED' THEN 
			IF Form_Success THEN 
	    		:COMMIT_IND := 'Y';
	    		--:SYSTEM.MESSAGE_LEVEL := '5';
	    		COMMIT;
	    		G$_CHECK_FAILURE;  
	    		--:SYSTEM.MESSAGE_LEVEL := '0';
	    		IF :SYSTEM.FORM_STATUS <> 'QUERY' THEN
	       			:COMMIT_IND := 'N';
	       			RAISE FORM_TRIGGER_FAILURE;
	    		END IF;
	    		:COMMIT_IND := 'N';
			END IF;
	END IF; 
end;
DECLARE
		temp varchar2(1);
		CURSOR c1 IS
		SELECT 'x'
		FROM FRRPRPT
		WHERE frrprpt_prop_code = :key_block.display_frbprop_code;
BEGIN
		OPEN c1;
				FETCH c1 INTO temp;
				IF c1%FOUND THEN
						:frbprop.display_pass_thru_ind := 'Y';
				ELSE
						IF c1%NOTFOUND THEN	
									:frbprop.display_pass_thru_ind := 'N';
						END IF;
				END IF;
		CLOSE c1;
END;	

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRPRPT.KEY-COMMIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-COMMIT", function=KeyFunction.SAVE)
		public void frrprpt_Save()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				int rowCount = 0;
				{
					// MORPHIS TODO : Implementation SYSTEM.MESSAGE_LEVEL msgLevel
					MessageLevel msgLevel = MessageServices.getMessageLevel();
					executeAction("get_percentage_total");
					getTask().getGoqrpls().gCheckFailure();
					executeAction("check_duplicate_agency_code");
					getTask().getGoqrpls().gCheckFailure();
					// MORPHIS TODO : Implementation SYSTEM.MESSAGE_LEVEL msgLevel
					MessageServices.setMessageLevel(msgLevel);
					if ( getBlockStatus().equals("CHANGED") )
					{
//						if ( SupportClasses.SQLFORMS.FormSuccess().getValue() )
						try
						{						
							// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
							getFormModel().getFormHeader().setCommitInd(toStr("Y"));
							commitTask();
							getTask().getGoqrpls().gCheckFailure();
							if ( !getTaskStatus().equals("QUERY") )
							{
								getFormModel().getFormHeader().setCommitInd(toStr("N"));
								throw new ApplicationException();
							}
							getFormModel().getFormHeader().setCommitInd(toStr("N"));
						}
						catch(Exception e){
							throw new ApplicationException();
						}
					}
				}
				{
					NString temp= NString.getNull();
					String sqlc1 = "SELECT 'x' " +
	" FROM FRRPRPT " +
	" WHERE frrprpt_prop_code = :KEY_BLOCK_DISPLAY_FRBPROP_CODE ";
					DataCursor c1 = new DataCursor(sqlc1);
					try {
						//Setting query parameters
						c1.addParameter("KEY_BLOCK_DISPLAY_FRBPROP_CODE", getFormModel().getKeyBlock().getDisplayFrbpropCode());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable c1.
						c1.open();
						ResultSet c1Results = c1.fetchInto();
						if ( c1Results != null ) {
							temp = c1Results.getStr(0);
						}
						if ( c1.found() )
						{
							frbpropElement.setDisplayPassThruInd(toStr("Y"));
						}
						else {
							if ( c1.notFound() )
							{
								frbpropElement.setDisplayPassThruInd(toStr("N"));
							}
						}
						c1.close();
					}
					finally{
						c1.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRRPRPT.PRE-INSERT
		 :frrprpt_prop_code := :key_block.display_frbprop_code;
:frrprpt_activity_date := sysdate;
:frrprpt_user_id := :global.user_id;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRPRPT.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowInsert
		public void frrprpt_BeforeRowInsert(RowAdapterEvent args)
		{
			
				FrrprptAdapter frrprptElement = (FrrprptAdapter)args.getRow();


				frrprptElement.setFrrprptPropCode(getFormModel().getKeyBlock().getDisplayFrbpropCode());
				frrprptElement.setFrrprptActivityDate(NDate.getNow());
				frrprptElement.setFrrprptUserId(getGlobal("USER_ID"));
			}

		
		/* Original PL/SQL code code for TRIGGER FRRPRPT.POST-QUERY
		 :frrprpt_agency_code := '';
:frrprpt_agcy_name := '';
g$_sel_spriden_id_name(:frrprpt_agcy_pidm, 'FRRPRPT_AGCY_NAME', 'Y', :frrprpt_agency_code);
--
execute_trigger('fetch_agency_name');
g$_check_failure;


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRPRPT.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void frrprpt_AfterQuery(RowAdapterEvent args)
		{
			
				FrrprptAdapter frrprptElement = (FrrprptAdapter)args.getRow();

				KeyBlock keyBlockElement = this.getFormModel().getKeyBlock();
				frrprptElement.setFrrprptPropCode(keyBlockElement.getDisplayFrbpropCode());
				

				// F2J_WARNING : Post-query code is executed once for every row retrieved. If you expect the query to return many records, this may cause a performance problem.
				frrprptElement.setFrrprptAgencyCode(toStr(""));
				frrprptElement.setFrrprptAgcyName(toStr(""));
				Ref<NString> pId_ref = new Ref<NString>(frrprptElement.getFrrprptAgencyCode());
				getTask().getGoqrpls().gSelSpridenIdName(frrprptElement.getFrrprptAgcyPidm(), toStr("FRRPRPT_AGCY_NAME"), toStr("Y"), pId_ref);
				frrprptElement.setFrrprptAgencyCode(pId_ref.val);
				// 
				executeAction("fetch_agency_name");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FRRPRPT.WHEN-VALIDATE-RECORD
		 IF :frrprpt.frrprpt_agency_code IS NULL AND 
	 :frrprpt.frrprpt_federal_fund_percent IS NOT NULL THEN
			message( G$_NLS.Get('FRAPROP-0129', 'FORM','Agency Code Must Be Entered') );
			RAISE form_trigger_failure;
END IF;



		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRPRPT.WHEN-VALIDATE-RECORD
		 *
		 *
		 *</p>
		*/

		@RecordValidationTrigger
		public void frrprpt_WhenValidateRecord()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrrprptAdapter frrprptElement = (FrrprptAdapter)this.getFormModel().getFrrprpt().getRowAdapter(true);


				if ( frrprptElement.getFrrprptAgencyCode().isNull() && !frrprptElement.getFrrprptFederalFundPercent().isNull() )
				{
					errorMessage(GNls.Fget(toStr("FRAPROP-0129"), toStr("FORM"), toStr("*ERROR* Agency Code Must Be Entered")));
					throw new ApplicationException();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRRPRPT.WHEN-MOUSE-DOUBLECLICK
		 G$_DISPLAY_LOV('','');

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRPRPT.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK")
		public void frrprpt_doubleClick()
		{
			
				getTask().getGoqrpls().gDisplayLov(toStr(""), toStr(""));
			}

		
		/* Original PL/SQL code code for TRIGGER FRRPRPT.KEY-DELREC
		 if :del_ready = 'N' then
   :del_ready := 'Y';
   message(G$_NLS.Get('FRAPROP-0130', 'FORM','Press ''Delete Record'' again to Delete this Record.'));
   raise form_trigger_failure;
end if;
   
:del_ready := 'N';

delete_record;
execute_trigger('get_percentage_total');
g$_check_failure;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRPRPT.KEY-DELREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DELREC", function=KeyFunction.DELETE_RECORD)
		public void frrprpt_DeleteRecord()
		{
			
				if ( getFormModel().getFormHeader().getDelReady().equals("N") )
				{
					getFormModel().getFormHeader().setDelReady(toStr("Y"));
					errorMessage(GNls.Fget(toStr("FRAPROP-0130"), toStr("FORM"), toStr("*ERROR* Press 'Delete Record' again to Delete this Record.")));
					throw new ApplicationException();
				}
				getFormModel().getFormHeader().setDelReady(toStr("N"));
				deleteRecord();
				executeAction("get_percentage_total");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FRRPRPT_AGENCY_CODE.WHEN-VALIDATE-ITEM
		 IF :frrprpt.frrprpt_agency_code IS NULL and :frrprpt.frrprpt_federal_fund_percent IS NULL THEN
			:frrprpt.frrprpt_agcy_name := '';
			return;
END IF;

IF :frrprpt_agcy_pidm IS NOT NULL THEN
			:form_header.current_agency_code := :frrprpt_agcy_pidm;
			G$_CHECK_FAILURE;
END IF;

IF :frrprpt.frrprpt_agency_code IS NULL and :frrprpt.frrprpt_federal_fund_percent IS NOT NULL THEN
		message( G$_NLS.Get('FRAPROP-0131', 'FORM','Agency Code Should Be Entered') );
		raise form_trigger_failure;
END IF;

IF :form_header.from_execute_query = 'Y' THEN
	RETURN;
END IF;
execute_trigger('id_to_pidm');
g$_check_failure;
execute_trigger('fetch_agency_name');
g$_check_failure;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRPRPT_AGENCY_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRRPRPT_AGENCY_CODE")
		public void frrprptAgencyCode_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrrprptAdapter frrprptElement = (FrrprptAdapter)this.getFormModel().getFrrprpt().getRowAdapter(true);


				if ( frrprptElement.getFrrprptAgencyCode().isNull() && frrprptElement.getFrrprptFederalFundPercent().isNull() )
				{
					frrprptElement.setFrrprptAgcyName(toStr(""));
					return ;
				}
				if ( !frrprptElement.getFrrprptAgcyPidm().isNull() )
				{
					getFormModel().getFormHeader().setCurrentAgencyCode(frrprptElement.getFrrprptAgcyPidm());
					getTask().getGoqrpls().gCheckFailure();
				}
				if ( frrprptElement.getFrrprptAgencyCode().isNull() && !frrprptElement.getFrrprptFederalFundPercent().isNull() )
				{
					errorMessage(GNls.Fget(toStr("FRAPROP-0131"), toStr("FORM"), toStr("*ERROR* Agency Code Should Be Entered")));
					throw new ApplicationException();
				}
				if ( getFormModel().getFormHeader().getFromExecuteQuery().equals("Y") )
				{
					return ;
				}
				executeAction("id_to_pidm");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("fetch_agency_name");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRPRPT_AGCY_NAME.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FRRPRPT_AGCY_NAME", function=KeyFunction.NEXT_ITEM)
		public void frrprptAgcyName_keyNexItem()
		{
			
				getGNameClass().keyNexItem(); //.nextItem();
			}

		
		/* Original PL/SQL code code for TRIGGER FRRPRPT_FEDERAL_FUND_PERCENT.POST-TEXT-ITEM
		 :form_header.total := nvl(:form_header.total,0) 
											- nvl(:form_header.pre_total,0)
											+ nvl(:frrprpt.frrprpt_federal_fund_percent,0);

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRPRPT_FEDERAL_FUND_PERCENT.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FRRPRPT_FEDERAL_FUND_PERCENT", function=KeyFunction.ITEM_OUT)
		public void frrprptFederalFundPercent_itemOut()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrrprptAdapter frrprptElement = (FrrprptAdapter)this.getFormModel().getFrrprpt().getRowAdapter(true);


				getFormModel().getFormHeader().setTotal(isNull(getFormModel().getFormHeader().getTotal(), 0).subtract(isNull(getFormModel().getFormHeader().getPreTotal(), 0)).add(isNull(frrprptElement.getFrrprptFederalFundPercent(), 0)));
			}

		
		/* Original PL/SQL code code for TRIGGER FRRPRPT_FEDERAL_FUND_PERCENT.PRE-TEXT-ITEM
		 :form_header.pre_total := nvl(:frrprpt.frrprpt_federal_fund_percent,0);	

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRPRPT_FEDERAL_FUND_PERCENT.PRE-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="PRE-TEXT-ITEM", item="FRRPRPT_FEDERAL_FUND_PERCENT", function=KeyFunction.ITEM_IN)
		public void frrprptFederalFundPercent_itemIn()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrrprptAdapter frrprptElement = (FrrprptAdapter)this.getFormModel().getFrrprpt().getRowAdapter(true);


				getFormModel().getFormHeader().setPreTotal(isNull(frrprptElement.getFrrprptFederalFundPercent(), 0));
			}

		
		/* Original PL/SQL code code for TRIGGER FRRPRPT_FEDERAL_FUND_PERCENT.KEY-NEXT-ITEM
		 if :frrprpt.frrprpt_agency_code is null and 
	 :frrprpt.frrprpt_federal_fund_percent is null then
	 	message( G$_NLS.Get('FRAPROP-0132', 'FORM','Agency Code And Percentage Should Be Entered !') );
	 	raise form_trigger_failure;
end if;

--RPE# 1-19V7ZZD
DECLARE
	v_currecord varchar2(100);
BEGIN
	--get the current record before calculating the percentage total
  v_currecord := :SYSTEM.CURSOR_RECORD;
	
	execute_trigger('get_percentage_total');
	G$_CHECK_FAILURE;
	
	--navigate to the cursor record
	GO_RECORD(v_currecord);
	go_item('FRRPRPT.FRRPRPT_SPONSOR_ID');	
	
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRPRPT_FEDERAL_FUND_PERCENT.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FRRPRPT_FEDERAL_FUND_PERCENT", function=KeyFunction.NEXT_ITEM)
		public void frrprptFederalFundPercent_keyNexItem()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrrprptAdapter frrprptElement = (FrrprptAdapter)this.getFormModel().getFrrprpt().getRowAdapter(true);


				if ( frrprptElement.getFrrprptAgencyCode().isNull() && frrprptElement.getFrrprptFederalFundPercent().isNull() )
				{
					errorMessage(GNls.Fget(toStr("FRAPROP-0132"), toStr("FORM"), toStr("*ERROR* Agency Code And Percentage Should Be Entered !")));
					throw new ApplicationException();
				}
				{
					NString vCurrecord= NString.getNull();
					// get the current record before calculating the percentage total
					vCurrecord = toStr(getCursorRecord());
					executeAction("get_percentage_total");
					getTask().getGoqrpls().gCheckFailure();
					// navigate to the cursor record
					setCurrentRecord(vCurrecord);
					goItem(toStr("FRRPRPT.FRRPRPT_SPONSOR_ID"));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRRPRPT_FEDERAL_FUND_PERCENT.WHEN-VALIDATE-ITEM
		 G$_CHECK_FAILURE;
IF :frrprpt.frrprpt_federal_fund_percent IS NULL and 
	 :frrprpt.frrprpt_agency_code IS NOT NULL THEN
		message( G$_NLS.Get('FRAPROP-0133', 'FORM','Percentage should Be Entered') );
		RAISE form_trigger_failure;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRPRPT_FEDERAL_FUND_PERCENT.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRRPRPT_FEDERAL_FUND_PERCENT")
		public void frrprptFederalFundPercent_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrrprptAdapter frrprptElement = (FrrprptAdapter)this.getFormModel().getFrrprpt().getRowAdapter(true);


				getTask().getGoqrpls().gCheckFailure();
				if ( frrprptElement.getFrrprptFederalFundPercent().isNull() && !frrprptElement.getFrrprptAgencyCode().isNull() )
				{
					errorMessage(GNls.Fget(toStr("FRAPROP-0133"), toStr("FORM"), toStr("*ERROR* Percentage should Be Entered")));
					throw new ApplicationException();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRRPRPT_SPONSOR_ID.KEY-NEXT-ITEM
		 --RPE# 1-19V7ZZD
if :frrprpt.frrprpt_agency_code is null and 
	 :frrprpt.frrprpt_federal_fund_percent is null then
	 	message( G$_NLS.Get('FRAPROP-0134', 'FORM','Agency Code And Percentage Should Be Entered !') );
	 	raise form_trigger_failure;
end if;
next_record;





		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRPRPT_SPONSOR_ID.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FRRPRPT_SPONSOR_ID", function=KeyFunction.NEXT_ITEM)
		public void frrprptSponsorId_keyNexItem()
		{
			
				// RPE# 1-19V7ZZD

				//F2J_WARNING : Caution, the variable may be null.
				FrrprptAdapter frrprptElement = (FrrprptAdapter)this.getFormModel().getFrrprpt().getRowAdapter(true);


				// RPE# 1-19V7ZZD
				if ( frrprptElement.getFrrprptAgencyCode().isNull() && frrprptElement.getFrrprptFederalFundPercent().isNull() )
				{
					errorMessage(GNls.Fget(toStr("FRAPROP-0134"), toStr("FORM"), toStr("*ERROR* Agency Code And Percentage Should Be Entered !")));
					throw new ApplicationException();
				}
				nextRecord();
			}

		
	
	
}

