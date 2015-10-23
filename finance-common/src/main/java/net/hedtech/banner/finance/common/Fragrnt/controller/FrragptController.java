package net.hedtech.banner.finance.common.Fragrnt.controller;
 
import static morphis.foundations.core.appsupportlib.Globals.getGlobal;
import static morphis.foundations.core.appsupportlib.Lib.isNull;
import static morphis.foundations.core.appsupportlib.runtime.BlockServices.deleteRecord;
import static morphis.foundations.core.appsupportlib.runtime.BlockServices.nextRecord;
import static morphis.foundations.core.appsupportlib.runtime.BlockServices.previousRecord;
import static morphis.foundations.core.appsupportlib.runtime.BlockServices.setCurrentRecord;
import static morphis.foundations.core.appsupportlib.runtime.ItemServices.goItem;
import static morphis.foundations.core.appsupportlib.runtime.MessageServices.errorMessage;
import static morphis.foundations.core.appsupportlib.runtime.MessageServices.warningMessage;
import static morphis.foundations.core.appsupportlib.runtime.TaskServices.commitTask;
import static morphis.foundations.core.appsupportlib.runtime.TaskServices.executeAction;
import static morphis.foundations.core.appsupportlib.runtime.TaskServices.getBlockStatus;
import static morphis.foundations.core.appsupportlib.runtime.TaskServices.getCursorRecord;
import static morphis.foundations.core.appsupportlib.runtime.TaskServices.getTaskStatus;
import static morphis.foundations.core.types.Types.toStr;
import morphis.foundations.core.appdatalayer.data.DataCursor;
import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.appdatalayer.data.ResultSet;
import morphis.foundations.core.appdatalayer.events.AfterQuery;
import morphis.foundations.core.appdatalayer.events.BeforeQuery;
import morphis.foundations.core.appdatalayer.events.BeforeRowInsert;
import morphis.foundations.core.appdatalayer.events.QueryEvent;
import morphis.foundations.core.appdatalayer.events.RowAdapterEvent;
import morphis.foundations.core.appsupportlib.exceptions.ApplicationException;
import morphis.foundations.core.appsupportlib.model.IDBBusinessObject;
import morphis.foundations.core.appsupportlib.runtime.MessageLevel;
import morphis.foundations.core.appsupportlib.runtime.MessageServices;
import morphis.foundations.core.appsupportlib.runtime.action.ActionTrigger;
import morphis.foundations.core.appsupportlib.runtime.action.RecordValidationTrigger;
import morphis.foundations.core.appsupportlib.runtime.action.ValidationTrigger;
import morphis.foundations.core.appsupportlib.runtime.control.AbstractBlockController;
import morphis.foundations.core.appsupportlib.runtime.control.IFormController;
import morphis.foundations.core.appsupportlib.ui.KeyFunction;
import morphis.foundations.core.types.NDate;
import morphis.foundations.core.types.NString;
import morphis.foundations.core.util.Ref;
import morphis.foundations.flavors.forms.appsupportlib.runtime.FormsMessageLevel;
import net.hedtech.banner.finance.common.Fragrnt.FragrntTask;
import net.hedtech.banner.finance.common.Fragrnt.model.FragrntModel;
import net.hedtech.banner.finance.common.Fragrnt.model.FrbgrntAdapter;
import net.hedtech.banner.finance.common.Fragrnt.model.FrragptAdapter;
import net.hedtech.general.common.dbservices.GNls;
import net.hedtech.general.common.libraries.Goqolib.services.GNameClass;
		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class FrragptController extends DefaultBlockController {

	private GNameClass getGNameClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GNameClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_NAME_CLASS");
	}	

	
	public FrragptController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
		
	@Override
	public FragrntTask getTask() {
		return (FragrntTask)super.getTask();
	}

	public FragrntModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
		/* Original PL/SQL code code for TRIGGER FRRAGPT.WHEN-NEW-BLOCK-INSTANCE
		 null;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRAGPT.WHEN-NEW-BLOCK-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-BLOCK-INSTANCE", function=KeyFunction.BLOCK_CHANGE)
		public void frragpt_blockChange()
		{
			
			}

		
		/* Original PL/SQL code code for TRIGGER FRRAGPT.KEY-COMMIT
		 declare
	msg_level VARCHAR2(3);
begin
	msg_level := :system.message_level;

	execute_trigger('get_percentage_total');
	g$_check_failure;
	execute_trigger('check_duplicate_agency_code');
	g$_check_failure;
	:system.message_level := msg_level;	
	IF :SYSTEM.BLOCK_STATUS = 'CHANGED'  THEN 
			IF Form_Success THEN 
	    		:COMMIT_IND := 'Y';
	    		--:SYSTEM.MESSAGE_LEVEL := '5';
	    		COMMIT_FORM;
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
		FROM FRRAGPT
		WHERE frragpt_grnt_code = :key_block.display_frbgrnt_code;
BEGIN
		OPEN c1;
				FETCH c1 INTO temp;
				IF c1%FOUND THEN
						:frbgrnt.display_pass_thru_ind := 'Y';
				ELSE
						IF c1%NOTFOUND THEN	
								:frbgrnt.display_pass_thru_ind := 'N';
						END IF;
				END IF;
		CLOSE c1;
END;	
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRAGPT.KEY-COMMIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-COMMIT", function=KeyFunction.SAVE)
		public void frragpt_Save()
		{
			

				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);

				if(frbgrntElement==null)
					return;

				int rowCount = 0;
				{
					MessageLevel msgLevel = MessageServices.getMessageLevel();
					MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("0"));
					executeAction("get_percentage_total");
					getTask().getGoqrpls().gCheckFailure();
					executeAction("check_duplicate_agency_code");
					getTask().getGoqrpls().gCheckFailure();
					MessageServices.setMessageLevel(msgLevel);
					if ( getBlockStatus().equals("CHANGED") )
					{
						//if ( SupportClasses.SQLFORMS.FormSuccess().getValue() )
						try
						{
							getFormModel().getFormHeader().setCommitInd(toStr("Y"));
							commitTask();
							getTask().getGoqrpls().gCheckFailure();
							if ( !getTaskStatus().equals("QUERY") )
							{
								getFormModel().getFormHeader().setCommitInd(toStr("N"));
								throw new ApplicationException();
							}
							getFormModel().getFormHeader().setCommitInd(toStr("N"));
						}catch(Exception e){
						throw new ApplicationException();
						}
					}
				}
				{
					NString temp= NString.getNull();
					String sqlc1 = "SELECT 'x' " +
	" FROM FRRAGPT " +
	" WHERE frragpt_grnt_code = :KEY_BLOCK_DISPLAY_FRBGRNT_CODE ";
					DataCursor c1 = new DataCursor(sqlc1);
					try {
						//Setting query parameters
						c1.addParameter("KEY_BLOCK_DISPLAY_FRBGRNT_CODE", getFormModel().getKeyBlock().getDisplayFrbgrntCode());
						c1.open();
						ResultSet c1Results = c1.fetchInto();
						if ( c1Results != null ) {
							temp = c1Results.getStr(0);
						}
						if ( c1.found() )
						{
							frbgrntElement.setDisplayPassThruInd(toStr("Y"));
						}
						else {
							if ( c1.notFound() )
							{
								frbgrntElement.setDisplayPassThruInd(toStr("N"));
							}
						}
					} finally {
						c1.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRRAGPT.PRE-INSERT
		 :frragpt_grnt_code := :key_block.display_frbgrnt_code;
:frragpt_activity_date := sysdate;
:frragpt_user_id := :global.user_id;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRAGPT.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowInsert
		public void frragpt_BeforeRowInsert(RowAdapterEvent args)
		{
			
				FrragptAdapter frragptElement = (FrragptAdapter)args.getRow();


				frragptElement.setFrragptGrntCode(getFormModel().getKeyBlock().getDisplayFrbgrntCode());
				frragptElement.setFrragptActivityDate(NDate.getNow());
				frragptElement.setFrragptUserId(getGlobal("USER_ID"));
			}

		
		/* Original PL/SQL code code for TRIGGER FRRAGPT.POST-QUERY
		 --:frragpt_agency_code := NULL;
--:frragpt_agcy_name := NULL;
g$_sel_spriden_id_name(:frragpt_agcy_pidm, 'FRRAGPT_AGCY_NAME', 'Y', :frragpt_agency_code);
--
execute_trigger('fetch_agency_name');
g$_check_failure;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRAGPT.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void frragpt_AfterQuery(RowAdapterEvent args)
		{
			
				FrragptAdapter frragptElement = (FrragptAdapter)args.getRow();


				// :frragpt_agency_code := NULL;
				// :frragpt_agcy_name := NULL;
				Ref<NString> pId_ref = new Ref<NString>(frragptElement.getFrragptAgencyCode());
				getTask().getGoqrpls().gSelSpridenIdName(frragptElement.getFrragptAgcyPidm(), toStr("FRRAGPT_AGCY_NAME"), toStr("Y"), pId_ref);
				frragptElement.setFrragptAgencyCode(pId_ref.val);
				// 
				executeAction("fetch_agency_name");
				getTask().getGoqrpls().gCheckFailure();
			}
		
		@BeforeQuery
		public void frbgrnt_BeforeQuery(QueryEvent args)
		{

				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("KEY_BLOCK_DISPLAY_FRBGRNT_CODE", this.getFormModel().getKeyBlock().getDisplayFrbgrntCode()));             

               }
		
		/* Original PL/SQL code code for TRIGGER FRRAGPT.WHEN-VALIDATE-RECORD
		 IF :frragpt.frragpt_agency_code IS NULL AND 
	 :frragpt.frragpt_federal_fund_percent IS NOT NULL THEN
			message( G$_NLS.Get('FRAGRNT-0152', 'FORM','Agency Code Must Be Entered') );
			RAISE form_trigger_failure;
END IF;


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRAGPT.WHEN-VALIDATE-RECORD
		 *
		 *
		 *</p>
		*/

		@RecordValidationTrigger
		public void frragpt_WhenValidateRecord()
		{
				FrragptAdapter frragptElement = (FrragptAdapter)this.getFormModel().getFrragpt().getRowAdapter(true);

				if(frragptElement==null)
					return;

				if ( frragptElement.getFrragptAgencyCode().isNull() && !frragptElement.getFrragptFederalFundPercent().isNull() )
				{
					errorMessage(GNls.Fget(toStr("FRAGRNT-0152"), toStr("FORM"), toStr("*ERROR* Agency Code Must Be Entered")));
					throw new ApplicationException();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRRAGPT.WHEN-MOUSE-DOUBLECLICK
		 G$_DISPLAY_LOV('','');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRAGPT.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK")
		public void frragpt_doubleClick()
		{
			
				getTask().getGoqrpls().gDisplayLov(toStr(""), toStr(""));
			}

		
		/* Original PL/SQL code code for TRIGGER FRRAGPT.KEY-DOWN
		 if :frragpt.frragpt_agency_code is null and 
	 :frragpt.frragpt_federal_fund_percent is null then
	 	message( G$_NLS.Get('FRAGRNT-0153', 'FORM','Agency Code And Percentage Should Be Entered !') );
	 	raise form_trigger_failure;
end if;
next_record;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRAGPT.KEY-DOWN
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DOWN", function=KeyFunction.NEXT_RECORD)
		public void frragpt_MoveDown()
		{
			

				FrragptAdapter frragptElement = (FrragptAdapter)this.getFormModel().getFrragpt().getRowAdapter(true);

				if(frragptElement==null)
					return;

				if ( frragptElement.getFrragptAgencyCode().isNull() && frragptElement.getFrragptFederalFundPercent().isNull() )
				{
					errorMessage(GNls.Fget(toStr("FRAGRNT-0153"), toStr("FORM"), toStr("*ERROR* Agency Code And Percentage Should Be Entered !")));
					throw new ApplicationException();
				}
				nextRecord();
			}

		
		/* Original PL/SQL code code for TRIGGER FRRAGPT.KEY-UP
		 previous_record;
G$_CHECK_FAILURE;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRAGPT.KEY-UP
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-UP", function=KeyFunction.PREVIOUS_RECORD)
		public void frragpt_MoveUp()
		{
			
				previousRecord();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FRRAGPT.KEY-DELREC
		 if :del_ready = 'N' then
   :del_ready := 'Y';
   message(G$_NLS.Get('FRAGRNT-0154', 'FORM','Press ''Delete Record'' again to Delete this Record.'));
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
		 * FRRAGPT.KEY-DELREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DELREC", function=KeyFunction.DELETE_RECORD)
		public void frragpt_DeleteRecord()
		{
			
				if ( getFormModel().getFormHeader().getDelReady().equals("N") )
				{
					getFormModel().getFormHeader().setDelReady(toStr("Y"));
					warningMessage(GNls.Fget(toStr("FRAGRNT-0154"), toStr("FORM"), toStr("Press 'Delete Record' again to Delete this Record.")));
					throw new ApplicationException();
				}
				getFormModel().getFormHeader().setDelReady(toStr("N"));
				deleteRecord();
				executeAction("get_percentage_total");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FRRAGPT_AGENCY_CODE.WHEN-VALIDATE-ITEM
		 IF :frragpt.frragpt_agency_code IS NULL and :frragpt.frragpt_federal_fund_percent IS NULL THEN
			:frragpt.frragpt_agcy_name := '';
			return;
END IF;

IF :frragpt_agcy_pidm IS NOT NULL THEN
			:form_header.current_agency_code := :frragpt_agcy_pidm;
			G$_CHECK_FAILURE;
END IF;

IF :frragpt.frragpt_agency_code IS NULL and :frragpt.frragpt_federal_fund_percent IS NOT NULL THEN
		message( G$_NLS.Get('FRAGRNT-0155', 'FORM','Agency Code Should Be Entered') );
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
		 * FRRAGPT_AGENCY_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRRAGPT_AGENCY_CODE")
		public void frragptAgencyCode_validate()
		{

				FrragptAdapter frragptElement = (FrragptAdapter)this.getFormModel().getFrragpt().getRowAdapter(true);

if (frragptElement != null) {
	

				if ( frragptElement.getFrragptAgencyCode().isNull() && frragptElement.getFrragptFederalFundPercent().isNull() )
				{
					frragptElement.setFrragptAgcyName(toStr(""));
					return ;
				}
				if ( !frragptElement.getFrragptAgcyPidm().isNull() )
				{
					getFormModel().getFormHeader().setCurrentAgencyCode(frragptElement.getFrragptAgcyPidm());
					getTask().getGoqrpls().gCheckFailure();
				}
				if ( frragptElement.getFrragptAgencyCode().isNull() && !frragptElement.getFrragptFederalFundPercent().isNull() )
				{
					errorMessage(GNls.Fget(toStr("FRAGRNT-0155"), toStr("FORM"), toStr("*ERROR* Agency Code Should Be Entered")));
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
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRAGPT_AGCY_NAME.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FRRAGPT_AGCY_NAME", function=KeyFunction.NEXT_ITEM)
		public void frragptAgcyName_keyNexItem()
		{
			
				getGNameClass().keyNexItem();
			}

		
		/* Original PL/SQL code code for TRIGGER FRRAGPT_FEDERAL_FUND_PERCENT.KEY-NEXT-ITEM
		 if :frragpt.frragpt_agency_code is null and 
	 :frragpt.frragpt_federal_fund_percent is null then
	 	message( G$_NLS.Get('FRAGRNT-0156', 'FORM','Agency Code And Percentage Should Be Entered !') );
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
	go_item('frragpt.frragpt_sponsor_id');	
	
END;




		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRAGPT_FEDERAL_FUND_PERCENT.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FRRAGPT_FEDERAL_FUND_PERCENT", function=KeyFunction.NEXT_ITEM)
		public void frragptFederalFundPercent_keyNexItem()
		{
			

				FrragptAdapter frragptElement = (FrragptAdapter)this.getFormModel().getFrragpt().getRowAdapter(true);

				if(frragptElement==null)
					return;

				if ( frragptElement.getFrragptAgencyCode().isNull() && frragptElement.getFrragptFederalFundPercent().isNull() )
				{
					errorMessage(GNls.Fget(toStr("FRAGRNT-0156"), toStr("FORM"), toStr("*ERROR* Agency Code And Percentage Should Be Entered !")));
					throw new ApplicationException();
				}
				{
					NString vCurrecord= NString.getNull();
					// get the current record before calculating the percentage total
					vCurrecord = toStr(getCursorRecord());
					executeAction("get_percentage_total"); // erro aqui !
					getTask().getGoqrpls().gCheckFailure();
					// navigate to the cursor record
					setCurrentRecord(vCurrecord);
					goItem(toStr("FRRAGPT.FRRAGPT_SPONSOR_ID"));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRRAGPT_FEDERAL_FUND_PERCENT.WHEN-VALIDATE-ITEM
		 G$_CHECK_FAILURE;  
IF :frragpt.frragpt_federal_fund_percent IS NULL and 
	 :frragpt.frragpt_agency_code IS NOT NULL THEN
		message( G$_NLS.Get('FRAGRNT-0157', 'FORM','Percentage Should Be Entered') );
		RAISE form_trigger_failure;
END IF;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRAGPT_FEDERAL_FUND_PERCENT.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRRAGPT_FEDERAL_FUND_PERCENT")
		public void frragptFederalFundPercent_validate()
		{
			

				FrragptAdapter frragptElement = (FrragptAdapter)this.getFormModel().getFrragpt().getRowAdapter(true);

				if(frragptElement==null)
					return;

				getTask().getGoqrpls().gCheckFailure();
				if ( frragptElement.getFrragptFederalFundPercent().isNull() && !frragptElement.getFrragptAgencyCode().isNull() )
				{
					errorMessage(GNls.Fget(toStr("FRAGRNT-0157"), toStr("FORM"), toStr("*ERROR* Percentage Should Be Entered")));
					throw new ApplicationException();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRRAGPT_FEDERAL_FUND_PERCENT.POST-TEXT-ITEM
		 :form_header.total := nvl(:form_header.total,0) 
											- nvl(:form_header.pre_total,0)
											+ nvl(:frragpt.frragpt_federal_fund_percent,0);
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRAGPT_FEDERAL_FUND_PERCENT.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FRRAGPT_FEDERAL_FUND_PERCENT", function=KeyFunction.ITEM_OUT)
		public void frragptFederalFundPercent_itemOut()
		{
			

				FrragptAdapter frragptElement = (FrragptAdapter)this.getFormModel().getFrragpt().getRowAdapter(true);

				if(frragptElement==null)
					return;

				getFormModel().getFormHeader().setTotal(isNull(getFormModel().getFormHeader().getTotal(), 0).subtract(isNull(getFormModel().getFormHeader().getPreTotal(), 0)).add(isNull(frragptElement.getFrragptFederalFundPercent(), 0)));
			}

		
		/* Original PL/SQL code code for TRIGGER FRRAGPT_FEDERAL_FUND_PERCENT.PRE-TEXT-ITEM
		 :form_header.pre_total := nvl(:frragpt.frragpt_federal_fund_percent,0);	

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRAGPT_FEDERAL_FUND_PERCENT.PRE-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="PRE-TEXT-ITEM", item="FRRAGPT_FEDERAL_FUND_PERCENT", function=KeyFunction.ITEM_IN)
		public void frragptFederalFundPercent_itemIn()
		{
			

				FrragptAdapter frragptElement = (FrragptAdapter)this.getFormModel().getFrragpt().getRowAdapter(true);

				if(frragptElement==null)
					return;

				getFormModel().getFormHeader().setPreTotal(isNull(frragptElement.getFrragptFederalFundPercent(), 0));
			}

		
		/* Original PL/SQL code code for TRIGGER FRRAGPT_SPONSOR_ID.KEY-NEXT-ITEM
		 --RPE# 1-19V7ZZD
if :frragpt.frragpt_agency_code is null and 
	 :frragpt.frragpt_federal_fund_percent is null then
	 	message( G$_NLS.Get('FRAGRNT-0158', 'FORM','Agency Code And Percentage Should Be Entered !') );
	 	GO_ITEM('FRRAGPT.FRRAGPT_AGENCY_CODE');
	 	raise form_trigger_failure;
end if;

next_record;




		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRAGPT_SPONSOR_ID.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FRRAGPT_SPONSOR_ID", function=KeyFunction.NEXT_ITEM)
		public void frragptSponsorId_keyNexItem()
		{
			
				// RPE# 1-19V7ZZD

				FrragptAdapter frragptElement = (FrragptAdapter)this.getFormModel().getFrragpt().getRowAdapter(true);

				if(frragptElement==null)
					return;

				// RPE# 1-19V7ZZD
				if ( frragptElement.getFrragptAgencyCode().isNull() && frragptElement.getFrragptFederalFundPercent().isNull() )
				{
					errorMessage(GNls.Fget(toStr("FRAGRNT-0158"), toStr("FORM"), toStr("*ERROR* Agency Code And Percentage Should Be Entered !")));
					goItem(toStr("FRRAGPT.FRRAGPT_AGENCY_CODE"));
					throw new ApplicationException();
				}
				nextRecord();
			}

		
	
	
}

