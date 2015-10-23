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
import net.hedtech.general.common.libraries.Goqolib.services.GCodeClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GDateClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GDescClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GIconBtnClass;	
import net.hedtech.general.common.services.OracleMessagesLevel;
		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class GordocmController extends DefaultBlockController {

	private GCodeClass getGCodeClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GCodeClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_CODE_CLASS");
	}	
	private GDateClass getGDateClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GDateClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_DATE_CLASS");
	}	
	private GDescClass getGDescClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GDescClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_DESC_CLASS");
	}	
	private GIconBtnClass getGIconBtnClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GIconBtnClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_ICON_BTN_CLASS");
	}	

	
	public GordocmController(IFormController parentController, String name) 
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
		/* Original PL/SQL code code for TRIGGER GORDOCM.PRE-UPDATE
		 if :GORDOCM_REQUEST_DATE is null and :gordocm_docm_code is not null then
	  message( G$_NLS.Get('GOAINTL-0082', 'FORM','Request Date is Required for Current Visa Document.') );
	  raise form_trigger_failure;
end if;
--
if NVL(:gordocm_disposition,'X') = 'X' then
	 message( G$_NLS.Get('GOAINTL-0083', 'FORM','Document Disposition is a Required Entry.') );
	 raise form_trigger_failure;
end if;
--
:gordocm_user_id := user;
:gordocm_activity_date := sysdate;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORDOCM.PRE-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowUpdate
		public void gordocm_BeforeRowUpdate(RowAdapterEvent args)
		{
			
				GordocmAdapter gordocmElement = (GordocmAdapter)args.getRow();


				if ( gordocmElement.getGordocmRequestDate().isNull() && !gordocmElement.getGordocmDocmCode().isNull() )
				{
					gordocmElement.setGordocmRequestDate(NDate.getNow());
					//
					errorMessage(GNls.Fget(toStr("GOAINTL-0082"), toStr("FORM"), toStr("Request Date is Required for Current Visa Document.")));
					throw new ApplicationException();
				}
				// 
				if ( isNull(gordocmElement.getGordocmDisposition(), "X").equals("X") )
				{
					errorMessage(GNls.Fget(toStr("GOAINTL-0083"), toStr("FORM"), toStr("Document Disposition is a Required Entry.")));
					throw new ApplicationException();
				}
				if(gordocmElement.getGordocmReceivedDate().isNotNull())
					this.gordocmReceivedDate_validate();
				gordocmElement.setGordocmUserId(getUser());
				gordocmElement.setGordocmActivityDate(NDate.getNow());
			}

		
		/* Original PL/SQL code code for TRIGGER GORDOCM.PRE-INSERT
		 --
:gordocm_pidm := :gorvisa_pidm;
:gordocm_vtyp_code := :gorvisa_vtyp_code;
:gordocm_seq_no := :gorvisa_seq_no ;
--
BEGIN
   DECLARE
   	  tmp char(20) := '';
      CURSOR PTI_CURSOR IS
         SELECT 'x'
         FROM   gorvisa
         WHERE  gorvisa_pidm = :gordocm_pidm
         AND    gorvisa_vtyp_code = :gordocm_vtyp_code
         AND    gorvisa_seq_no = :gordocm_seq_no;
   BEGIN
      OPEN PTI_CURSOR;
      FETCH PTI_CURSOR INTO tmp;
      G$_CHECK_VALUE(PTI_CURSOR%NOTFOUND, G$_NLS.Get('GOAINTL-0084', 'FORM','*ERROR* Visa Record Does Not Exist, No Insert Allowed.') ,TRUE);
   END;
END;
--
if :gordocm_docm_code is null then
	  message( G$_NLS.Get('GOAINTL-0085', 'FORM','Document Code is Required for Current Visa Document.') );
	  raise form_trigger_failure;
end if;
--
if :GORDOCM_REQUEST_DATE is null and :gordocm_docm_code is not null then
	  message( G$_NLS.Get('GOAINTL-0086', 'FORM','Request Date is Required for Current Visa Document.') );
	  raise form_trigger_failure;
end if;
--
if NVL(:gordocm_disposition,'X') = 'X' then
	 message( G$_NLS.Get('GOAINTL-0087', 'FORM','Document Disposition is a Required Entry.') );
	 raise form_trigger_failure;
end if;
--
:gordocm_user_id := user;
:gordocm_activity_date := sysdate;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORDOCM.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowInsert
		public void gordocm_BeforeRowInsert(RowAdapterEvent args)
		{
			
				// 
				GordocmAdapter gordocmElement = (GordocmAdapter)args.getRow();
				GorvisaAdapter gorvisaElement = (GorvisaAdapter)this.getFormModel().getGorvisa().getRowAdapter(true);

				int rowCount = 0;
				// 
				gordocmElement.setGordocmPidm(gorvisaElement.getGorvisaPidm());
				gordocmElement.setGordocmVtypCode(gorvisaElement.getGorvisaVtypCode());
				gordocmElement.setGordocmSeqNo(gorvisaElement.getGorvisaSeqNo());
				{
					NString tmp = toStr("");
					String sqlptiCursor = "SELECT 'x' " +
	" FROM gorvisa " +
	" WHERE gorvisa_pidm = :GORDOCM_PIDM AND gorvisa_vtyp_code = :GORDOCM_VTYP_CODE AND gorvisa_seq_no = :GORDOCM_SEQ_NO ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//Setting query parameters
						ptiCursor.addParameter("GORDOCM_PIDM", gordocmElement.getGordocmPidm());
						ptiCursor.addParameter("GORDOCM_VTYP_CODE", gordocmElement.getGordocmVtypCode());
						ptiCursor.addParameter("GORDOCM_SEQ_NO", gordocmElement.getGordocmSeqNo());
						
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							tmp = ptiCursorResults.getStr(0);
						}
						getTask().getGoqrpls().gCheckValue(toBool(ptiCursor.notFound()), GNls.Fget(toStr("GOAINTL-0084"), toStr("FORM"), toStr("*ERROR* Visa Record Does Not Exist, No Insert Allowed.")), toBool(NBool.True));
					}
					finally{
						ptiCursor.close();
					}
				}
				// 
				if ( gordocmElement.getGordocmDocmCode().isNull() )
				{
					errorMessage(GNls.Fget(toStr("GOAINTL-0085"), toStr("FORM"), toStr("Document Code is Required for Current Visa Document.")));
					throw new ApplicationException();
				}
				// 
				if ( gordocmElement.getGordocmRequestDate().isNull() && !gordocmElement.getGordocmDocmCode().isNull() )
				{
					gordocmElement.setGordocmRequestDate(NDate.getNow());
				//
					errorMessage(GNls.Fget(toStr("GOAINTL-0086"), toStr("FORM"), toStr("Request Date is Required for Current Visa Document.")));
					throw new ApplicationException();
				}
				// 
				if ( isNull(gordocmElement.getGordocmDisposition(), "X").equals("X") )
				{
					errorMessage(GNls.Fget(toStr("GOAINTL-0087"), toStr("FORM"), toStr("Document Disposition is a Required Entry.")));
					throw new ApplicationException();
				}
				// 
				gordocmElement.setGordocmUserId(getUser());
				gordocmElement.setGordocmActivityDate(NDate.getNow());
			}

		
		/* Original PL/SQL code code for TRIGGER GORDOCM.KEY-NXTBLK
		 if :system.block_status = 'CHANGED' then
	  message( G$_NLS.Get('GOAINTL-0088', 'FORM','Please Save Information before Leaving Current Block.') );
	  raise form_trigger_failure;
end if;
--
execute_trigger('check_gobintl');
g$_check_failure;
if nvl(:gobintl_exists,'N') = 'N' then
	 next_block;
   return;
end if;
--
SET_FORM_PROPERTY(NAME_IN('SYSTEM.CURRENT_FORM'),VALIDATION,PROPERTY_OFF);
:system.message_level := 5;
go_block('gobintl');
execute_query;
:system.message_level := 0;
SET_FORM_PROPERTY(NAME_IN('SYSTEM.CURRENT_FORM'),VALIDATION,PROPERTY_ON);

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORDOCM.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void gordocm_NextBlock()
		{
			
				if ( getBlockStatus().equals("CHANGED") )
				{
					errorMessage(GNls.Fget(toStr("GOAINTL-0088"), toStr("FORM"), toStr("Please Save Information before Leaving Current Block.")));
					throw new ApplicationException();
				}
				// 
				executeAction("check_gobintl");
				getTask().getGoqrpls().gCheckFailure();
				if ( isNull(getFormModel().getFormHeader().getGobintlExists(), "N").equals("N") )
				{
					nextBlock();
					return ;
				}

				try{
					// 
					this.getTask().setValidationEnabled(false);
					MessageServices.setMessageLevel(OracleMessagesLevel.decodeMessageLevel(5));
					goBlock(toStr("gobintl"));
					executeQuery();
				}finally {
					MessageServices.setMessageLevel(OracleMessagesLevel.decodeMessageLevel(0));
					this.getTask().setValidationEnabled(false);
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GORDOCM.KEY-PRVBLK
		 if :system.block_status = 'CHANGED' then
	  message( G$_NLS.Get('GOAINTL-0089', 'FORM','Please Save Information before Leaving Current Block.') );
	  raise form_trigger_failure;
end if;
--
go_block('gorvisa');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORDOCM.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void gordocm_PreviousBlock()
		{
			
				if ( getBlockStatus().equals("CHANGED") )
				{
					message(GNls.Fget(toStr("GOAINTL-0089"), toStr("FORM"), toStr("Please Save Information before Leaving Current Block.")));
					throw new ApplicationException();
				}
				// 
				goBlock(toStr("gorvisa"));
			}

		
		/* Original PL/SQL code code for TRIGGER GORDOCM.POST-RECORD
		 <multilinecomment>
if :system.block_status = 'CHANGED' and :gordocm_docm_code is null then
   	message('Please Enter/Save before Creating Another Record.');
    raise form_trigger_failure;
end if;
</multilinecomment>
if :system.block_status = 'CHANGED' and :GORDOCM_REQUEST_DATE is null and :gordocm_docm_code is not null then
	  message( G$_NLS.Get('GOAINTL-0090', 'FORM','Request Date is Required for Current Visa Document.') );
    raise form_trigger_failure;
end if;
--
if :system.block_status = 'CHANGED' and NVL(:gordocm_disposition,'X') = 'X' then
	  message( G$_NLS.Get('GOAINTL-0091', 'FORM','Document Disposition is a Required Entry.') );
    raise form_trigger_failure;
end if;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORDOCM.POST-RECORD
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-RECORD")
		public void gordocm_PostRecord()
		{
			
				// if :system.block_status = 'CHANGED' and :gordocm_docm_code is null then
				// message('Please Enter/Save before Creating Another Record.');
				// raise form_trigger_failure;
				// end if;

				GordocmAdapter gordocmElement = (GordocmAdapter)this.getFormModel().getGordocm().getRowAdapter(true);
				if(gordocmElement != null)
				{
				// if :system.block_status = 'CHANGED' and :gordocm_docm_code is null then
				// message('Please Enter/Save before Creating Another Record.');
				// raise form_trigger_failure;
				// end if;
					if ( getBlockStatus().equals("CHANGED") && gordocmElement.getGordocmRequestDate().isNull() && !gordocmElement.getGordocmDocmCode().isNull() )
					{
						gordocmElement.setGordocmRequestDate(NDate.getNow());
						//
						errorMessage(GNls.Fget(toStr("GOAINTL-0090"), toStr("FORM"), toStr("Request Date is Required for Current Visa Document.")));
						throw new ApplicationException();
					}
					// 
					if ( getBlockStatus().equals("CHANGED") && isNull(gordocmElement.getGordocmDisposition(), "X").equals("X") )
					{
						errorMessage(GNls.Fget(toStr("GOAINTL-0091"), toStr("FORM"), toStr("Document Disposition is a Required Entry.")));
						throw new ApplicationException();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GORDOCM.POST-BLOCK
		 :previous_block := '';
if :system.block_status = 'CHANGED' then
	 <multilinecomment>
	  if :gordocm_docm_code is null then
   	    message('Please Enter/Save before Creating Another Record.');
        raise form_trigger_failure;
    end if;
   </multilinecomment>
    if :GORDOCM_REQUEST_DATE is null and :gordocm_docm_code is not null then
	      message( G$_NLS.Get('GOAINTL-0092', 'FORM','Request Date is Required for Current Visa Document.') );
        raise form_trigger_failure;
    end if;
    --
    if  NVL(:gordocm_disposition,'X') = 'X' then
	      message( G$_NLS.Get('GOAINTL-0093', 'FORM','Document Disposition is a Required Entry.') );
        raise form_trigger_failure;
    end if;
   :previous_block := 'GORDOCM';
end if;


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORDOCM.POST-BLOCK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-BLOCK", function=KeyFunction.BLOCK_OUT)
		public void gordocm_blockOut()
		{
				GordocmAdapter gordocmElement = (GordocmAdapter)this.getFormModel().getGordocm().getRowAdapter(true);
				if(gordocmElement != null)
				{
					getFormModel().getFormHeader().setPreviousBlock(toStr(""));
					if ( getBlockStatus().equals("CHANGED") )
					{
						// if :gordocm_docm_code is null then
						// message('Please Enter/Save before Creating Another Record.');
						// raise form_trigger_failure;
						// end if;
						if ( gordocmElement.getGordocmRequestDate().isNull() && !gordocmElement.getGordocmDocmCode().isNull() )
						{
							gordocmElement.setGordocmRequestDate(NDate.getNow());
							//
							errorMessage(GNls.Fget(toStr("GOAINTL-0092"), toStr("FORM"), toStr("Request Date is Required for Current Visa Document.")));
							throw new ApplicationException();
						}
						// 
						if ( isNull(gordocmElement.getGordocmDisposition(), "X").equals("X") )
						{
							errorMessage(GNls.Fget(toStr("GOAINTL-0093"), toStr("FORM"), toStr("Document Disposition is a Required Entry.")));
							throw new ApplicationException();
						}
						getFormModel().getFormHeader().setPreviousBlock(toStr("GORDOCM"));
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GORDOCM.KEY-NXTREC
		 declare tmp char(50) := :system.current_item;
begin
	<multilinecomment>
	if :system.record_status = 'INSERT' and :gordocm_docm_code is null then
	    message('Please Enter/Save before Creating Another Record.');
	    raise form_trigger_failure;
	end if;
</multilinecomment>
	next_record;
	if :system.record_status = 'QUERY' then
		  go_item(tmp);
	end if;
end;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORDOCM.KEY-NXTREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void gordocm_NextRecord()
		{
			
				{
					NString tmp = getCurrentItem();
					// if :system.record_status = 'INSERT' and :gordocm_docm_code is null then
					// message('Please Enter/Save before Creating Another Record.');
					// raise form_trigger_failure;
					// end if;
					nextRecord();
					
					if ( getRecordStatus().equals("QUERY") )
					{
						goItem(tmp);
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GORDOCM.KEY-PRVREC
		 declare tmp char(50) := :system.current_item;
begin
	previous_record;
	go_item(tmp);
end;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORDOCM.KEY-PRVREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVREC", function=KeyFunction.PREVIOUS_RECORD)
		public void gordocm_PreviousRecord()
		{
			
				{
					NString tmp = getCurrentItem();
					previousRecord();
					goItem(tmp);
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GORDOCM.KEY-COMMIT
		 commit_form;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORDOCM.KEY-COMMIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-COMMIT", function=KeyFunction.SAVE)
		public void gordocm_Save()
		{
			
				commitTask();
			}

		
		/* Original PL/SQL code code for TRIGGER GORDOCM.WHEN_NEW_BLOCK_INSTANCE_TRG
		 -- 71-3 rename trigger to User Defined and add G$ routine
G$_SET_INST_PROPERTY;
GO_BLOCK('GORVISA');
if :system.block_status = 'CHANGED'  then
	  message( G$_NLS.Get('GOAINTL-0094', 'FORM','Please Save Information before Leaving Current Block.') );
	  raise form_trigger_failure;
end if;
GO_BLOCK('GORDOCM');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORDOCM.WHEN_NEW_BLOCK_INSTANCE_TRG
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN_NEW_BLOCK_INSTANCE_TRG")
		public void gordocm_WhenNewBlockInstanceTrg()
		{
			
				//  71-3 rename trigger to User Defined and add G$ routine
				//  71-3 rename trigger to User Defined and add G$ routine
				getTask().getGoqrpls().gSetInstProperty();
				goBlock(toStr("GORVISA"));
				if ( getBlockStatus().equals("CHANGED") )
				{
					errorMessage(GNls.Fget(toStr("GOAINTL-0094"), toStr("FORM"), toStr("Please Save Information before Leaving Current Block.")));
					throw new ApplicationException();
				}
				goBlock(toStr("GORDOCM"));
			}

		
		/* Original PL/SQL code code for TRIGGER GORDOCM.KEY-CREREC
		 <multilinecomment> 91644</multilinecomment>
CREATE_RECORD;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORDOCM.KEY-CREREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CREREC", function=KeyFunction.CREATE_RECORD)
		public void gordocm_CreateRecord()
		{
			
				//  91644
				//  91644
				createRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORDOCM.PRE-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeQuery
		public void gordocm_BeforeQuery(QueryEvent args)
		{
			              
                GorvisaAdapter gorvisaElement = (GorvisaAdapter) this.getFormModel().getGorvisa().getRowAdapter();
                if(gorvisaElement != null)
                {
					((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("GORVISA_PIDM", gorvisaElement.getGorvisaPidm()));             

	                                
					((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("GORVISA_SEQ_NO", gorvisaElement.getGorvisaSeqNo()));             
	
	                                
					((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("GORVISA_VTYP_CODE", gorvisaElement.getGorvisaVtypCode()));             
                }

           
               }

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORDOCM_VTYP_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="GORDOCM_VTYP_CODE")
		public void gordocmVtypCode_WhenMouseDoubleclick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORDOCM_VTYP_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="GORDOCM_VTYP_CODE", function=KeyFunction.ITEM_CHANGE)
		public void gordocmVtypCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORDOCM_VTYP_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="GORDOCM_VTYP_CODE")
		public void gordocmVtypCode_GSearchParameters()
		{
			
				getGCodeClass().gSearchParameters();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORDOCM_VTYP_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="GORDOCM_VTYP_CODE")
		public void gordocmVtypCode_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORDOCM_VTYP_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="GORDOCM_VTYP_CODE", function=KeyFunction.NEXT_ITEM)
		public void gordocmVtypCode_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORDOCM_VTYP_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="GORDOCM_VTYP_CODE", function=KeyFunction.ITEM_OUT)
		public void gordocmVtypCode_itemOut()
		{
			
				getGCodeClass().itemOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORDOCM_ACTIVITY_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="GORDOCM_ACTIVITY_DATE", function=KeyFunction.NEXT_ITEM)
		public void gordocmActivityDate_keyNexItem()
		{
			
				getGDateClass().nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORDOCM_ACTIVITY_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="GORDOCM_ACTIVITY_DATE", function=KeyFunction.ITEM_CHANGE)
		public void gordocmActivityDate_itemChange()
		{
			
				getGDateClass().itemChange();
			}

		
		/* Original PL/SQL code code for TRIGGER GORDOCM_ACTIVITY_DATE.POST-TEXT-ITEM
		 BEGIN
  G$_DATE_POST_ITEM;
  G$_CHECK_FAILURE;
END;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORDOCM_ACTIVITY_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="GORDOCM_ACTIVITY_DATE", function=KeyFunction.ITEM_OUT)
		public void gordocmActivityDate_itemOut()
		{
			
				getTask().getGoqrpls().gDatePostItem();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORDOCM_DOCM_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="GORDOCM_DOCM_CODE")
		public void gordocmDocmCode_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORDOCM_DOCM_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="GORDOCM_DOCM_CODE", function=KeyFunction.ITEM_CHANGE)
		public void gordocmDocmCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORDOCM_DOCM_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="GORDOCM_DOCM_CODE")
		public void gordocmDocmCode_GSearchParameters()
		{
			
				getGCodeClass().gSearchParameters();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORDOCM_DOCM_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="GORDOCM_DOCM_CODE")
		public void gordocmDocmCode_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORDOCM_DOCM_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="GORDOCM_DOCM_CODE", function=KeyFunction.NEXT_ITEM)
		public void gordocmDocmCode_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORDOCM_DOCM_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="GORDOCM_DOCM_CODE", function=KeyFunction.ITEM_OUT)
		public void gordocmDocmCode_itemOut()
		{
			
				getGCodeClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER GORDOCM_DOCM_CODE.POST-CHANGE
		 if :GORDOCM_DOCM_CODE is null then
	 :DOCM_DESC := '';
	  return;
end if;
--
BEGIN
   G$_CHECK_QUERY_MODE;
   DECLARE
      CURSOR PTI_CURSOR IS
          SELECT GTVDOCM_DESC
         FROM   GTVDOCM
         WHERE  GTVDOCM_CODE = :GORDOCM_DOCM_CODE;
   BEGIN
      OPEN PTI_CURSOR;
      FETCH PTI_CURSOR INTO :DOCM_DESC;
      G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND, G$_NLS.Get('GOAINTL-0095', 'FORM','*ERROR* Invalid code; press LIST for valid codes') , TRUE);
   END;
   :GLOBAL.QUERY_MODE := '0';
   EXCEPTION
   WHEN FORM_TRIGGER_FAILURE THEN
      :GLOBAL.QUERY_MODE := '0';
      RAISE FORM_TRIGGER_FAILURE;
   END;
--
Declare
	temp varchar2(1) :=Null;
	cursor gtvdocm_c is 
	  select 'x'
    from  gordocm 
    where gordocm_docm_code = :gordocm_docm_code
    and   gordocm_pidm = :gordocm_pidm
    and   gordocm_seq_no = :gordocm_seq_no
    and   gordocm_vtyp_code = :gordocm_vtyp_code;
begin
	open gtvdocm_c;
	fetch gtvdocm_c into temp;
	if gtvdocm_c%found and :system.record_status = 'CHANGED' then 
     message( G$_NLS.Get('GOAINTL-0096', 'FORM','*ERROR* This Document Code Already Exists for this Visa.') );	
 	   raise form_trigger_failure;
	end if;
	close gtvdocm_c;
end;
   
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORDOCM_DOCM_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="GORDOCM_DOCM_CODE")
		public void gordocmDocmCode_PostChange()
		{
				GordocmAdapter gordocmElement = (GordocmAdapter)this.getFormModel().getGordocm().getRowAdapter(true);
				if(gordocmElement != null)
					{
					int rowCount = 0;
					if(gordocmElement.getGordocmDocmCode().isNull())
						return;
					if ( gordocmElement.getGordocmDocmCode().isNull() )
					{
						gordocmElement.setDocmDesc(toStr(""));
						return ;
					}
					try
					{
						getTask().getGoqrpls().gCheckQueryMode();
						{
							String sqlptiCursor = "SELECT GTVDOCM_DESC " +
		" FROM GTVDOCM " +
		" WHERE GTVDOCM_CODE = :GORDOCM_DOCM_CODE ";
							DataCursor ptiCursor = new DataCursor(sqlptiCursor);
							try {
								//Setting query parameters
								ptiCursor.addParameter("GORDOCM_DOCM_CODE", gordocmElement.getGordocmDocmCode());
								
								ptiCursor.open();
								ResultSet ptiCursorResults = ptiCursor.fetchInto();
								if ( ptiCursorResults != null ) {
									gordocmElement.setDocmDesc(ptiCursorResults.getStr(0));
								}
								getTask().getGoqrpls().gCheckValue(toBool(ptiCursor.notFound()), GNls.Fget(toStr("GOAINTL-0095"), toStr("FORM"), toStr("*ERROR* Invalid code; press LIST for valid codes")), toBool(NBool.True));
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
					{
						NString temp = NString.getNull();
						String sqlgtvdocmC = "SELECT 'x' " +
		" FROM gordocm " +
		" WHERE gordocm_docm_code = :GORDOCM_DOCM_CODE AND gordocm_pidm = :GORDOCM_PIDM AND gordocm_seq_no = :GORDOCM_SEQ_NO AND gordocm_vtyp_code = :GORDOCM_VTYP_CODE ";
						DataCursor gtvdocmC = new DataCursor(sqlgtvdocmC);
						try {
							//Setting query parameters
							gtvdocmC.addParameter("GORDOCM_DOCM_CODE", gordocmElement.getGordocmDocmCode());
							gtvdocmC.addParameter("GORDOCM_PIDM", gordocmElement.getGordocmPidm());
							gtvdocmC.addParameter("GORDOCM_SEQ_NO", gordocmElement.getGordocmSeqNo());
							gtvdocmC.addParameter("GORDOCM_VTYP_CODE", gordocmElement.getGordocmVtypCode());
							
							gtvdocmC.open();
							ResultSet gtvdocmCResults = gtvdocmC.fetchInto();
							if ( gtvdocmCResults != null ) {
								temp = gtvdocmCResults.getStr(0);
							}
							if ( gtvdocmC.found() && getRecordStatus().equals("CHANGED") )
							{
								errorMessage(GNls.Fget(toStr("GOAINTL-0096"), toStr("FORM"), toStr("*ERROR* This Document Code Already Exists for this Visa.")));
								throw new ApplicationException();
							}
						}
						finally{
							gtvdocmC.close();
						}
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * DOCM_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="DOCM_DESC", function=KeyFunction.ITEM_CHANGE)
		public void docmDesc_itemChange()
		{
			
				getGDescClass().itemChange();
			}

		
		/* Original PL/SQL code code for TRIGGER GORDOCM_SRCE_CODE.POST-CHANGE
		 if :GORDOCM_SRCE_CODE is null then
	 :SRCE_DESC := '';
	  return;
end if;
--
BEGIN
   G$_CHECK_QUERY_MODE;
   DECLARE
      CURSOR PTI_CURSOR IS
         SELECT GTVSRCE_DESC
         FROM   GTVSRCE
         WHERE  GTVSRCE_CODE = :GORDOCM_SRCE_CODE;
   BEGIN
      OPEN PTI_CURSOR;
      FETCH PTI_CURSOR INTO :SRCE_DESC;
      G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND, G$_NLS.Get('GOAINTL-0097', 'FORM','*ERROR* Invalid code; press LIST for valid codes') , TRUE);
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
		 * GORDOCM_SRCE_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="GORDOCM_SRCE_CODE")
		public void gordocmSrceCode_PostChange()
		{
				GordocmAdapter gordocmElement = (GordocmAdapter)this.getFormModel().getGordocm().getRowAdapter(true);
				if(gordocmElement != null)
				{
					int rowCount = 0;
//					if(gordocmElement.getGordocmSrceCode().isNull())
//						return;
					if ( gordocmElement.getGordocmSrceCode().isNull() )
					{
						gordocmElement.setSrceDesc(toStr(""));
						return ;
					}
					try
					{
						getTask().getGoqrpls().gCheckQueryMode();
						{
							String sqlptiCursor = "SELECT GTVSRCE_DESC " +
		" FROM GTVSRCE " +
		" WHERE GTVSRCE_CODE = :GORDOCM_SRCE_CODE ";
							DataCursor ptiCursor = new DataCursor(sqlptiCursor);
							try {
								//Setting query parameters
								ptiCursor.addParameter("GORDOCM_SRCE_CODE", gordocmElement.getGordocmSrceCode());
								
								ptiCursor.open();
								ResultSet ptiCursorResults = ptiCursor.fetchInto();
								if ( ptiCursorResults != null ) {
									gordocmElement.setSrceDesc(ptiCursorResults.getStr(0));
								}
								getTask().getGoqrpls().gCheckValue(toBool(ptiCursor.notFound()), GNls.Fget(toStr("GOAINTL-0097"), toStr("FORM"), toStr("*ERROR* Invalid code; press LIST for valid codes")), toBool(NBool.True));
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

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORDOCM_REQUEST_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="GORDOCM_REQUEST_DATE", function=KeyFunction.ITEM_CHANGE)
		public void gordocmRequestDate_itemChange()
		{
			
				getGDateClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORDOCM_REQUEST_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="GORDOCM_REQUEST_DATE", function=KeyFunction.ITEM_OUT)
		public void gordocmRequestDate_itemOut()
		{
				getGDateClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER GORDOCM_REQUEST_DATE.POST-CHANGE
		 --:gordocm_received_date := :gordocm_request_date;


null;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORDOCM_REQUEST_DATE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="GORDOCM_REQUEST_DATE")
		public void gordocmRequestDate_PostChange()
		{
			
				// :gordocm_received_date := :gordocm_request_date;

				GordocmAdapter gordocmElement = (GordocmAdapter)this.getFormModel().getGordocm().getRowAdapter(true);
				if(gordocmElement != null)
				{
					if ( gordocmElement.getGordocmRequestDate().isNull() )
					{
						return;
					}
					// :gordocm_received_date := :gordocm_request_date;
				}
		}

		
		/* Original PL/SQL code code for TRIGGER GORDOCM_REQUEST_DATE.KEY-NEXT-ITEM
		    G$_DATE_REFORMAT ('','');
   G$_CHECK_FAILURE;
   NEXT_FIELD;
   G$_CHECK_FAILURE;
   if nvl(:GORDOCM_DISPOSITION,'X') = 'X' then
     :GORDOCM_DISPOSITION := 'P';
   end if;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORDOCM_REQUEST_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="GORDOCM_REQUEST_DATE", function=KeyFunction.NEXT_ITEM)
		public void gordocmRequestDate_keyNexItem()
		{
				GordocmAdapter gordocmElement = (GordocmAdapter)this.getFormModel().getGordocm().getRowAdapter(true);
				if(gordocmElement != null)
				{

					nextItem();
					getTask().getGoqrpls().gCheckFailure();
					if ( isNull(gordocmElement.getGordocmDisposition(), "X").equals("X") )
					{
						gordocmElement.setGordocmDisposition(toStr("P"));
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GORDOCM_REQUEST_DATE.KEY-PREV-ITEM
		    G$_DATE_REFORMAT ('','');
   G$_CHECK_FAILURE;
   PREVIOUS_FIELD;
   G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORDOCM_REQUEST_DATE.KEY-PREV-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PREV-ITEM", item="GORDOCM_REQUEST_DATE", function=KeyFunction.PREVIOUS_ITEM)
		public void gordocmRequestDate_PreviousItem()
		{

				previousItem();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GORDOCM_REQUEST_DATE.PRE-TEXT-ITEM
		 if :gordocm_request_date is null then
	 :gordocm_request_date := sysdate;
end if;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORDOCM_REQUEST_DATE.PRE-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="PRE-TEXT-ITEM", item="GORDOCM_REQUEST_DATE", function=KeyFunction.ITEM_IN)
		public void gordocmRequestDate_itemIn()
		{
				GordocmAdapter gordocmElement = (GordocmAdapter)this.getFormModel().getGordocm().getRowAdapter(true);
				if(gordocmElement != null)
				{
					if ( gordocmElement.getGordocmRequestDate().isNull() )
					{
						gordocmElement.setGordocmRequestDate(NDate.getNow());
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GORDOCM_DISPOSITION.WHEN-LIST-CHANGED
		 if nvl(:gordocm_disposition,'X') = 'X' then
	 message( G$_NLS.Get('GOAINTL-0098', 'FORM','Visa Document Disposition is a Required Entry.') );
	 raise form_trigger_failure;
end if;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORDOCM_DISPOSITION.WHEN-LIST-CHANGED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-LIST-CHANGED", item="GORDOCM_DISPOSITION")
		public void gordocmDisposition_listChange()
		{
				GordocmAdapter gordocmElement = (GordocmAdapter)this.getFormModel().getGordocm().getRowAdapter(true);
				if(gordocmElement != null)
				{
					if ( isNull(gordocmElement.getGordocmDisposition(), "X").equals("X") )
					{
						message(GNls.Fget(toStr("GOAINTL-0098"), toStr("FORM"), toStr("Visa Document Disposition is a Required Entry.")));
						throw new ApplicationException();
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORDOCM_RECEIVED_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="GORDOCM_RECEIVED_DATE", function=KeyFunction.ITEM_CHANGE)
		public void gordocmReceivedDate_itemChange()
		{
			
				getGDateClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORDOCM_RECEIVED_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="GORDOCM_RECEIVED_DATE", function=KeyFunction.ITEM_OUT)
		public void gordocmReceivedDate_itemOut()
		{
				getGDateClass().itemOut();
				this.gordocmReceivedDate_validate();
				
			}

		
		/* Original PL/SQL code code for TRIGGER GORDOCM_RECEIVED_DATE.POST-CHANGE
		 if :GORDOCM_RECEIVED_DATE < :GORDOCM_REQUEST_DATE then
	  message( G$_NLS.Get('GOAINTL-0099', 'FORM','Visa Document Received Date Can Not Be Earlier Than Visa Document Request Date.') );
	  raise form_trigger_failure;
end if;
--
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORDOCM_RECEIVED_DATE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="GORDOCM_RECEIVED_DATE")
		public void gordocmReceivedDate_PostChange()
		{
				GordocmAdapter gordocmElement = (GordocmAdapter)this.getFormModel().getGordocm().getRowAdapter(true);
				if(gordocmElement != null)
				{
					if(gordocmElement.getGordocmReceivedDate().isNull())
						return;
					if ( toStr(gordocmElement.getGordocmReceivedDate()).lesser(toStr(gordocmElement.getGordocmRequestDate())) )
					{
						errorMessage(GNls.Fget(toStr("GOAINTL-0099"), toStr("FORM"), toStr("Visa Document Received Date Can Not Be Earlier Than Visa Document Request Date.")));
						throw new ApplicationException();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GORDOCM_RECEIVED_DATE.KEY-PREV-ITEM
		    G$_DATE_REFORMAT ('','');
   G$_CHECK_FAILURE;
   go_item('gordocm_disposition');
   G$_CHECK_FAILURE;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORDOCM_RECEIVED_DATE.KEY-PREV-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PREV-ITEM", item="GORDOCM_RECEIVED_DATE", function=KeyFunction.PREVIOUS_ITEM)
		public void gordocmReceivedDate_PreviousItem()
		{

				goItem(toStr("gordocm_disposition"));
				getTask().getGoqrpls().gCheckFailure();
		}

		
		/* Original PL/SQL code code for TRIGGER GORDOCM_RECEIVED_DATE.KEY-NEXT-ITEM
		 
   G$_DATE_REFORMAT ('','');
   G$_CHECK_FAILURE;
   NEXT_FIELD;
   G$_CHECK_FAILURE;
   if nvl(:GORDOCM_DISPOSITION,'X') = 'X' then
     :GORDOCM_DISPOSITION := 'P';
   end if;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORDOCM_RECEIVED_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="GORDOCM_RECEIVED_DATE", function=KeyFunction.NEXT_ITEM)
		public void gordocmReceivedDate_keyNexItem()
		{
				GordocmAdapter gordocmElement = (GordocmAdapter)this.getFormModel().getGordocm().getRowAdapter(true);
				if(gordocmElement != null)
				{

					nextItem();
					getTask().getGoqrpls().gCheckFailure();
					if ( isNull(gordocmElement.getGordocmDisposition(), "X").equals("X") )
					{
						gordocmElement.setGordocmDisposition(toStr("P"));
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORDOCM_VTYP_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="GORDOCM_VTYP_CODE_LBT")
		public void gordocmVtypCodeLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORDOCM_DOCM_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="GORDOCM_DOCM_CODE")
		public void gordocmDocmCode_validate()
		{
			
				GordocmAdapter gordocmElement = (GordocmAdapter)this.getFormModel().getGordocm().getRowAdapter(true);
				this.gordocmDocmCode_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORDOCM.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void gordocm_AfterQuery(RowAdapterEvent args)
		{
			
			GordocmAdapter gordocmElement = (GordocmAdapter)args.getRow();			
			
						
				try {
				gordocmElement.setLockDbValues(true);
                                 try {  
                                this.gordocmDocmCode_PostChange(); 
                                } catch(Exception ex) { 
                                } 
                                 try {  
                                this.gordocmSrceCode_PostChange(); 
                                } catch(Exception ex) { 
                                } 
                                 try {  
                                this.gordocmRequestDate_PostChange(); 
                                } catch(Exception ex) { 
                                } 
                                 try {  
                                this.gordocmReceivedDate_PostChange(); 
                                } catch(Exception ex) { 
                                } 

//[DELETE] 
//[DELETE] 
//[DELETE] 
//[DELETE] 
				 
			
						} finally {
							gordocmElement.setLockDbValues(false);
						}
						

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORDOCM_SRCE_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="GORDOCM_SRCE_CODE")
		public void gordocmSrceCode_validate()
		{
			
				GordocmAdapter gordocmElement = (GordocmAdapter)this.getFormModel().getGordocm().getRowAdapter(true);
				this.gordocmSrceCode_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORDOCM_REQUEST_DATE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="GORDOCM_REQUEST_DATE")
		public void gordocmRequestDate_validate()
		{
			
				GordocmAdapter gordocmElement = (GordocmAdapter)this.getFormModel().getGordocm().getRowAdapter(true);
				this.gordocmRequestDate_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORDOCM_RECEIVED_DATE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="GORDOCM_RECEIVED_DATE")
		public void gordocmReceivedDate_validate()
		{
			
				GordocmAdapter gordocmElement = (GordocmAdapter)this.getFormModel().getGordocm().getRowAdapter(true);
				this.gordocmReceivedDate_PostChange();

			}

		
	
	
}

