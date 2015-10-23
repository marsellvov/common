package net.hedtech.general.common.libraries.Goqolib.controller;
 
import java.util.EventObject;

import morphis.foundations.core.appdatalayer.data.DataBaseFactory;
import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.appdatalayer.events.AfterQuery;
import morphis.foundations.core.appdatalayer.events.AfterRowDelete;
import morphis.foundations.core.appdatalayer.events.AfterRowInsert;
import morphis.foundations.core.appdatalayer.events.AfterRowUpdate;
import morphis.foundations.core.appdatalayer.events.BeforeQuery;
import morphis.foundations.core.appdatalayer.events.BeforeRowDelete;
import morphis.foundations.core.appdatalayer.events.BeforeRowInsert;
import morphis.foundations.core.appdatalayer.events.BeforeRowUpdate;
import morphis.foundations.core.appdatalayer.events.QueryComplete;
import morphis.foundations.core.appdatalayer.events.QueryEvent;
import morphis.foundations.core.appdatalayer.events.QueryExecuted;
import morphis.foundations.core.appdatalayer.events.RowAdapterEvent;
import morphis.foundations.core.appdatalayer.events.RowDelete;
import morphis.foundations.core.appdatalayer.events.RowInsert;
import morphis.foundations.core.appdatalayer.events.RowUpdate;
import morphis.foundations.core.appsupportlib.exceptions.ApplicationException;
import morphis.foundations.core.appsupportlib.model.IDBBusinessObject;
import morphis.foundations.core.appsupportlib.runtime.AbstractSupportCodeObject;
import morphis.foundations.core.appsupportlib.runtime.ISupportCodeContainer;
import morphis.foundations.core.appsupportlib.runtime.ItemServices;
import morphis.foundations.core.appsupportlib.runtime.Task;
import morphis.foundations.core.appsupportlib.runtime.TaskServices;
import morphis.foundations.core.appsupportlib.runtime.action.ActionTrigger;
import morphis.foundations.core.appsupportlib.runtime.action.RecordValidationTrigger;
import morphis.foundations.core.appsupportlib.runtime.action.ValidationTrigger;
import morphis.foundations.core.appsupportlib.runtime.control.AbstractBlockController;
import morphis.foundations.core.appsupportlib.runtime.control.IFormController;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.BlockDescriptor;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.items.ItemDescriptor;
import morphis.foundations.core.appsupportlib.runtime.web.message.InteractionManager;
import morphis.foundations.core.appsupportlib.ui.KeyFunction;
import morphis.foundations.core.types.NBool;
import morphis.foundations.core.types.NInteger;
import morphis.foundations.core.types.NString;
import morphis.foundations.core.util.Ref;
import net.hedtech.general.common.dbservices.GDate;
import net.hedtech.general.common.dbservices.GNls;
import net.hedtech.general.common.dbservices.GpGoksdif;
import net.hedtech.general.common.forms.BaseTask;
import net.hedtech.general.common.libraries.Goqolib.GoqolibTaskPart;
import net.hedtech.general.common.libraries.Goqolib.model.GSdispAdapter;
import net.hedtech.general.common.libraries.Goqolib.model.GSdkey;
import net.hedtech.general.common.libraries.Goqolib.model.GoqolibModel;
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
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class GSdispController extends DefaultBlockController {

	public GSdispController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}				
		
	public BaseTask getTask() {
		return (BaseTask)super.getTask();
	}

	public IDBBusinessObject getGSdisp() {
		return (IDBBusinessObject)this.getTask().getTaskPart("GOQOLIB").getModel().getBusinessObject("G$_SDISP");
	}
	
	public GSdkey getGSdkey() {
		return (GSdkey)this.getTask().getTaskPart("GOQOLIB").getModel().getBusinessObject("G$_SDKEY");
	}
		
			
	//action methods generated from triggers
		/* Original PL/SQL code code for TRIGGER G$_SDISP.PRE-INSERT
		 --avoid this trigger to be inherited from form level
null;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_SDISP.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowInsert
		public void gSdisp_BeforeRowInsert(RowAdapterEvent args)
		{
			
			// avoid this trigger to be inherited from form level


				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_SDISP.PRE-UPDATE
		 --avoid this trigger to be inherited from form level
null;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_SDISP.PRE-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowUpdate
		public void gSdisp_BeforeRowUpdate(RowAdapterEvent args)
		{
			
//				// avoid this trigger to be inherited from form level
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_SDISP.PRE-DELETE
		 --avoid this trigger to be inherited from form level
null;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_SDISP.PRE-DELETE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowDelete
		public void gSdisp_BeforeRowDelete(RowAdapterEvent args)
		{
	
//				// avoid this trigger to be inherited from form level
//
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_SDISP.POST-INSERT
		 --avoid this trigger to be inherited from form level
null;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_SDISP.POST-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterRowInsert
		public void gSdisp_AfterRowInsert(RowAdapterEvent args)
		{
	
				// avoid this trigger to be inherited from form level

				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_SDISP.POST-UPDATE
		 --avoid this trigger to be inherited from form level
null;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_SDISP.POST-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterRowUpdate
		public void gSdisp_AfterRowUpdate(RowAdapterEvent args)
		{
			
				
				// avoid this trigger to be inherited from form level

			}

		
		/* Original PL/SQL code code for TRIGGER G$_SDISP.POST-DELETE
		 --avoid this trigger to be inherited from form level
null;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_SDISP.POST-DELETE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterRowDelete
		public void gSdisp_AfterRowDelete(RowAdapterEvent args)
		{

				// avoid this trigger to be inherited from form level
			
			}

		
		/* Original PL/SQL code code for TRIGGER G$_SDISP.DISC_RENUMBER
		 --Fix the Index discriminators
IF :g$_sdisp.govsdav_disc_type='M'  AND :g$_sdisp.govsdav_disc_method='I'
THEN
	DECLARE 
		n_first INTEGER;
		n_curr	INTEGER;
		n_disc	INTEGER;
		l_aname  gorsdam.gorsdam_attr_name%TYPE := :g$_sdisp.govsdav_attr_name;
	BEGIN 
		n_curr:=:SYSTEM.CURSOR_RECORD;
		-- Find the first attribute instance with current name		 
		WHILE  :g$_sdisp.govsdav_attr_name=l_aname LOOP
			n_first:=:SYSTEM.CURSOR_RECORD;
			:g$_sdisp.is_last_idx:='N';
			EXIT WHEN :SYSTEM.CURSOR_RECORD =1;
			PREVIOUS_RECORD;
		END LOOP;
		GO_RECORD(n_first);
		n_disc:=0; -- Start the discriminator value
		-- Loop through the records with current name and renumber if needed
		WHILE  :g$_sdisp.govsdav_attr_name=l_aname LOOP
			n_disc:=n_disc+1;
			IF nvl(to_number(:g$_sdisp.govsdav_disc),-1) <> n_disc THEN
			  :g$_sdisp.govsdav_disc := n_disc;
			  g$_sd.p_disp_disc;
			END IF;
			:g$_sdisp.is_last_idx:='N';
			EXIT WHEN :SYSTEM.LAST_RECORD='TRUE';
			NEXT_RECORD;
		END LOOP;
		:g$_sdisp.is_last_idx:='Y';
		GO_RECORD(n_curr);
	END;
ELSE
	MESSAGE(g$_nls.get('GOQOLIB-0016','FORM','This operation is not allowed for this attribute.'));		
END IF;	
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_SDISP.DISC_RENUMBER
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="DISC_RENUMBER")
		public void gSdisp_DiscRenumber()
		{
			
				//F2J_WARNING : Caution, the variable may be null.
				GSdispAdapter gSdispElement = (GSdispAdapter)this.getGSdisp().getRowAdapter(true);


				// Fix the Index discriminators
				if ( gSdispElement.getGovsdavDiscType().equals("M") && gSdispElement.getGovsdavDiscMethod().equals("I") )
				{
					{
						NInteger nFirst= NInteger.getNull();
						NInteger nCurr= NInteger.getNull();
						NInteger nDisc= NInteger.getNull();
						NString lAname = gSdispElement.getGovsdavAttrName();
						nCurr = toInt(getCursorRecord());
						//  Find the first attribute instance with current name		 
						while ( gSdispElement.getGovsdavAttrName().equals(lAname) ) {
							nFirst = toInt(getCursorRecord());
							gSdispElement.setIsLastIdx(toStr("N"));
							if ( getCursorRecord().equals(1) ) 
								break;
							previousRecord();
							doNavigation();
						}
						setCurrentRecord(nFirst);
						doNavigation();
						nDisc = toInt(0);
						//  Start the discriminator value
						//  Loop through the records with current name and renumber if needed
						while ( gSdispElement.getGovsdavAttrName().equals(lAname) ) {
							nDisc = nDisc.add(1);
							if ( isNull(toNumber(gSdispElement.getGovsdavDisc()), - (1)).notEquals(nDisc) )
							{
								gSdispElement.setGovsdavDisc(toStr(nDisc));
								getTask().getFormController().getGoqrpls().getGSd().pDispDisc();
							}
							gSdispElement.setIsLastIdx(toStr("N"));
							if ( isInLastRecord() ) 
								break;
							nextRecord();
							doNavigation();
						}
						gSdispElement.setIsLastIdx(toStr("Y"));
						setCurrentRecord(nCurr);
					}
				}
				else {
					errorMessage(GNls.Fget(toStr("GOQOLIB-0016"), toStr("FORM"), toStr("This operation is not allowed for this attribute.")));
				}				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_SDISP.KEY-DELREC
		 IF :g$_sdisp.govsdav_disc_type='M'  AND :g$_sdisp.govsdav_disc_method='I'	
THEN
  :g$_sdkey.renum_sd_rec:='Y';
	DELETE_RECORD;
	IF FORM_SUCCESS THEN
		EXECUTE_TRIGGER('DISC_RENUMBER');
	ELSE
		MESSAGE(g$_nls.get('GOQOLIB-0017','FORM','Problem encountered renumbering records.'));
	END IF;
	:g$_sdkey.renum_sd_rec:='N';
ELSE
	MESSAGE(g$_nls.get('GOQOLIB-0018','FORM','This attribute cannot be deleted'));		
END IF;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_SDISP.KEY-DELREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DELREC", function=KeyFunction.DELETE_RECORD)
		public void gSdisp_DeleteRecord()
		{
			
				
				//F2J_WARNING : Caution, the variable may be null.
				GSdispAdapter gSdispElement = (GSdispAdapter)this.getGSdisp().getRowAdapter(true);


				if ( gSdispElement.getGovsdavDiscType().equals("M") && gSdispElement.getGovsdavDiscMethod().equals("I") )
				{
					this.getGSdkey().setRenumSdRec(toStr("Y"));
					deleteRecord();
					doNavigation();
					try{
						if ( !Boolean.TRUE.equals(InteractionManager.getInteractionState().getAttribute(Task.TASK_EVENT_FAILURE)))
						{
							executeAction("DISC_RENUMBER");
						}
						else {
							errorMessage(GNls.Fget(toStr("GOQOLIB-0017"), toStr("FORM"), toStr("Problem encountered renumbering records.")));
						}
					}finally{
						InteractionManager.getInteractionState().removeAttribute(Task.TASK_EVENT_FAILURE);
					}
					this.getGSdkey().setRenumSdRec(toStr("N"));
				}
				else {
					errorMessage(GNls.Fget(toStr("GOQOLIB-0018"), toStr("FORM"), toStr("This attribute cannot be deleted")));
				}
		
			}

		
		/* Original PL/SQL code code for TRIGGER G$_SDISP.KEY-DUP-ITEM
		 EXECUTE_TRIGGER('KEY-DUPREC');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_SDISP.KEY-DUP-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DUP-ITEM", function=KeyFunction.DUPLICATE_ITEM)
		public void gSdisp_KeyDupItem()
		{
			executeAction(KeyFunction.DUPLICATE_RECORD);

		}

		
		/* Original PL/SQL code code for TRIGGER G$_SDISP.KEY-DUPREC
		 IF :g$_sdisp.govsdav_disc_type='M'  AND :g$_sdisp.govsdav_disc_method='I'
THEN
	DECLARE
		n_disc INTEGER ;
		-- This local function is almost a copy of trigger disc_renumber
		PROCEDURE p_count_attr IS
			n_first INTEGER;
			n_curr	INTEGER := :SYSTEM.CURSOR_RECORD;
			l_aname  gorsdam.gorsdam_attr_name%TYPE := :g$_sdisp.govsdav_attr_name;
		BEGIN
			-- Find the first attribute instance with current name		 
			WHILE  :g$_sdisp.govsdav_attr_name=l_aname LOOP
				n_first:=:SYSTEM.CURSOR_RECORD;
				EXIT WHEN :SYSTEM.CURSOR_RECORD =1;
				PREVIOUS_RECORD;
			END LOOP;
			GO_RECORD(n_first);
			n_disc:=0; -- Start the discriminator value with 1
			-- Loop through the records with current name and renumber if needed
			WHILE  :g$_sdisp.govsdav_attr_name=l_aname LOOP
				n_disc:=n_disc+1;
				EXIT WHEN :SYSTEM.LAST_RECORD='TRUE';
				NEXT_RECORD;
			END LOOP;
			GO_RECORD(n_curr);
		END p_count_attr;
		--
	BEGIN
		IF :g$_sdisp.govsdav_value_as_char IS NULL THEN
			MESSAGE(g$_nls.get('GOQOLIB-0019','FORM','Cannot duplicate empty attributes. Please enter an attribute value.'));
		ELSE
			:g$_sdkey.renum_sd_rec:='Y';			
			p_count_attr;			
			IF :g$_sdisp.govsdav_disc_validation <= n_disc  THEN
				MESSAGE(g$_nls.get('GOQOLIB-0020','FORM','*ERROR* Maximum number of attributes (%01%) exceeded.',
								:g$_sdisp.govsdav_disc_validation));
			ELSE
				:g$_sdkey.enable_attr_ins:='Y'; 
				Create_Record;
				Duplicate_Record;
				:g$_sdisp.govsdav_value_as_char:=null;
				:g$_sdisp.govsdav_rowid:=null;
				:g$_sdisp.govsdav_disc_type:='M';
				:g$_sdisp.govsdav_disc_method:='I';
				:g$_sdkey.enable_attr_ins:='N';

				SET_ITEM_PROPERTY(:SYSTEM.TRIGGER_ITEM,ITEM_IS_VALID,PROPERTY_TRUE);
				EXECUTE_TRIGGER('DISC_RENUMBER');
				SET_ITEM_PROPERTY(:SYSTEM.TRIGGER_ITEM,ITEM_IS_VALID,PROPERTY_FALSE);
				:g$_sdkey.renum_sd_rec:='N';
			END IF;
		END IF;				
	END;									
ELSE
	MESSAGE(g$_nls.get('GOQOLIB-0021','FORM','This attribute cannot be duplicated'));		
END IF;	
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_SDISP.KEY-DUPREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DUPREC", function=KeyFunction.DUPLICATE_RECORD)
		public void gSdisp_CopyRecord()
		{
			
				
				//F2J_WARNING : Caution, the variable may be null.
				GSdispAdapter gSdispElement = (GSdispAdapter)this.getGSdisp().getRowAdapter(true);

				GsdispCopyrecordLocal gsdispCopyrecordLocal = new GsdispCopyrecordLocal();
				if ( gSdispElement.getGovsdavDiscType().equals("M") && gSdispElement.getGovsdavDiscMethod().equals("I") )
				{
					{
						
						if ( gSdispElement.getGovsdavValueAsChar().isNull() )
						{
							errorMessage(GNls.Fget(toStr("GOQOLIB-0019"), toStr("FORM"), toStr("Cannot duplicate empty attributes. Please enter an attribute value.")));
						}
						else {
							this.getGSdkey().setRenumSdRec(toStr("Y"));
							gsdispCopyrecordLocal.CountAttr();
							if ( toInt(gSdispElement.getGovsdavDiscValidation()).lesserOrEquals(gsdispCopyrecordLocal.nDisc) )
							{
								errorMessage(GNls.Fget(toStr("GOQOLIB-0020"), toStr("FORM"), toStr("*ERROR* Maximum number of attributes (%01%) exceeded."), gSdispElement.getGovsdavDiscValidation()));
							}
							else {
								this.getGSdkey().setEnableAttrIns(toStr("Y"));								
								duplicateRecord();
								doNavigation();
								gSdispElement.setGovsdavValueAsChar(toStr(null));
								gSdispElement.setGovsdavRowid(null);
								gSdispElement.setGovsdavDiscType(toStr("M"));
								gSdispElement.setGovsdavDiscMethod(toStr("I"));
								this.getGSdkey().setEnableAttrIns(toStr("N"));
								setItemIsValid(getTriggerItem(), true);
								executeAction("DISC_RENUMBER");
								setItemIsValid(getTriggerItem(), false);
								this.getGSdkey().setRenumSdRec(toStr("N"));
							}
						}
					}
				}
				else {
					errorMessage(GNls.Fget(toStr("GOQOLIB-0021"), toStr("FORM"), toStr("This attribute cannot be duplicated")));
				}
			}
		
			private class GsdispCopyrecordLocal{
				NInteger nDisc = NInteger.getNull();
				
	/* <p>
				*  This local function is almost a copy of trigger disc_renumber
	/* </p>
				*/
				public void CountAttr()
				{
	
					//F2J_WARNING : Caution, the variable may be null.
					GSdispAdapter gSdispElement = (GSdispAdapter)getGSdisp().getRowAdapter(true);
	
	
					//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
	
					NInteger nFirst= NInteger.getNull();
					NInteger nCurr = toInt(getCursorRecord());
					NString lAname = gSdispElement.getGovsdavAttrName();
					//  Find the first attribute instance with current name		 
					while ( gSdispElement.getGovsdavAttrName().equals(lAname) ) {
						nFirst = toInt(getCursorRecord());
						if ( getCursorRecord().equals(1) ) 
							break;
						previousRecord();
						doNavigation();
					}
					setCurrentRecord(nFirst);
					doNavigation();
					nDisc = toInt(0);
					//  Start the discriminator value with 1
					//  Loop through the records with current name and renumber if needed
					while ( gSdispElement.getGovsdavAttrName().equals(lAname) ) {
						nDisc = nDisc.add(1);
						if ( isInLastRecord() ) 
							break;
						nextRecord();
					}
					setCurrentRecord(nCurr);
					doNavigation();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER G$_SDISP.KEY-NEXT-ITEM
		 NEXT_RECORD;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_SDISP.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", function=KeyFunction.NEXT_ITEM)
		public void gSdisp_keyNexItem()
		{
	
				nextRecord();

				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_SDISP.KEY-PREV-ITEM
		 IF :SYSTEM.TRIGGER_RECORD=1 THEN
	GO_BLOCK(:g$_sdkey.sd_block);
ELSE
	PREVIOUS_RECORD;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_SDISP.KEY-PREV-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PREV-ITEM", function=KeyFunction.PREVIOUS_ITEM)
		public void gSdisp_PreviousItem()
		{
			

			if ( getTriggerRecord().equals(1) )
			{
				goBlock(this.getGSdkey().getSdBlock());
				doNavigation();
			}
			else {
				previousRecord();
				doNavigation();
			}
				
		}

		
		/* Original PL/SQL code code for TRIGGER G$_SDISP.ON-DELETE
		 --message('Deleting rowid: '||:g$_sdisp.govsdav_rowid||' disc '||:g$_sdisp.govsdav_disc);
-- Delete attribute correstponds to setting attribute to NULL
gp_goksdif.p_set_attribute(
   nvl(:g$_sdisp.govsdav_table_name,:g$_sdkey.sd_bantab)
  ,:g$_sdisp.govsdav_attr_name
  ,:g$_sdisp.govsdav_disc
  ,:g$_sdisp.govsdav_pk_parenttab
  ,:g$_sdisp.govsdav_rowid
  ,:g$_sdisp.govsdav_attr_data_type
  ,to_char(NULL)
  );
g$_sd.p_post_dml;    
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_SDISP.ON-DELETE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@RowDelete
		public void gSdisp_RowDelete(RowAdapterEvent args)
		{
				GSdispAdapter gSdispElement = (GSdispAdapter)args.getRow();

				// message('Deleting rowid: '||:g$_sdisp.govsdav_rowid||' disc '||:g$_sdisp.govsdav_disc);
				//  Delete attribute correstponds to setting attribute to NULL
				Ref<NString> p_gorsdav_rowid_ref = new Ref<NString>(toStr(DbManager.getDataBaseFactory().rowidToString(gSdispElement.getGovsdavRowid())));
				GpGoksdif.pSetAttribute(isNull(gSdispElement.getGovsdavTableName(), this.getGSdkey().getSdBantab()), gSdispElement.getGovsdavAttrName(), gSdispElement.getGovsdavDisc(), gSdispElement.getGovsdavPkParenttab(), p_gorsdav_rowid_ref, gSdispElement.getGovsdavAttrDataType(), NString.getNull());
				gSdispElement.setGovsdavRowid(DbManager.getDataBaseFactory().createRowid(p_gorsdav_rowid_ref.val.getValue().getBytes()));
				getTask().getFormController().getGoqrpls().getGSd().pPostDml();

			}

		
		/* Original PL/SQL code code for TRIGGER G$_SDISP.ON-INSERT
		 	gp_goksdif.p_set_attribute(
	   nvl(:g$_sdisp.govsdav_table_name,:g$_sdkey.sd_bantab)
	  ,:g$_sdisp.govsdav_attr_name
	  ,:g$_sdisp.govsdav_disc
	  ,:g$_sdisp.govsdav_pk_parenttab
	  ,:g$_sdisp.govsdav_rowid
	  ,:g$_sdisp.govsdav_attr_data_type
	  ,:g$_sdisp.govsdav_value_as_char
	  );
  g$_sd.p_post_dml;	  
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_SDISP.ON-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@RowInsert
		public void gSdisp_RowInsert(RowAdapterEvent args)
		{
			
				GSdispAdapter gSdispElement = (GSdispAdapter)args.getRow();
				
				NString attr = NString.getEmpty();
				if (gSdispElement.getGovsdavAttrDataType().equals("DATE"))
					attr = toChar(toDate(gSdispElement.getGovsdavValueAsChar()), GDate.getNlsDateFormat());
				else
					attr = gSdispElement.getGovsdavValueAsChar();
				
				Ref<NString> p_gorsdav_rowid_ref = new Ref<NString>(toStr(DbManager.getDataBaseFactory().rowidToString(gSdispElement.getGovsdavRowid())));
				GpGoksdif.pSetAttribute(isNull(gSdispElement.getGovsdavTableName(), this.getGSdkey().getSdBantab()), gSdispElement.getGovsdavAttrName(), gSdispElement.getGovsdavDisc(), gSdispElement.getGovsdavPkParenttab(), p_gorsdav_rowid_ref, gSdispElement.getGovsdavAttrDataType(), attr);
				gSdispElement.setGovsdavRowid(DbManager.getDataBaseFactory().createRowid(p_gorsdav_rowid_ref.val.getValue().getBytes()));
				getTask().getFormController().getGoqrpls().getGSd().pPostDml();
			}

		
		/* Original PL/SQL code code for TRIGGER G$_SDISP.ON-LOCK
		 --TODO Add locking of record
NULL;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_SDISP.ON-LOCK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="ON-LOCK")
		public void gSdisp_OnLock()
		{
			
			// TODO Add locking of record

				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_SDISP.ON-UPDATE
		 --message('Updating rowid: '||:g$_sdisp.govsdav_rowid||' disc '||:g$_sdisp.govsdav_disc);
	gp_goksdif.p_set_attribute(
	   nvl(:g$_sdisp.govsdav_table_name,:g$_sdkey.sd_bantab)
	  ,:g$_sdisp.govsdav_attr_name
	  ,:g$_sdisp.govsdav_disc
	  ,:g$_sdisp.govsdav_pk_parenttab
	  ,:g$_sdisp.govsdav_rowid
	  ,:g$_sdisp.govsdav_attr_data_type
	  ,:g$_sdisp.govsdav_value_as_char
	  );
  g$_sd.p_post_dml;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_SDISP.ON-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@RowUpdate
		public void gSdisp_RowUpdate(RowAdapterEvent args)
		{
			
				// message('Updating rowid: '||:g$_sdisp.govsdav_rowid||' disc '||:g$_sdisp.govsdav_disc);
				GSdispAdapter gSdispElement = (GSdispAdapter)args.getRow();

				NString attr = NString.getEmpty();
				if (gSdispElement.getGovsdavAttrDataType().equals("DATE"))
					attr = toChar(toDate(gSdispElement.getGovsdavValueAsChar()), GDate.getNlsDateFormat());
				else
					attr = gSdispElement.getGovsdavValueAsChar();
				
				// message('Updating rowid: '||:g$_sdisp.govsdav_rowid||' disc '||:g$_sdisp.govsdav_disc);
				Ref<NString> p_gorsdav_rowid_ref = new Ref<NString>(toStr(DbManager.getDataBaseFactory().rowidToString(gSdispElement.getGovsdavRowid())));
				GpGoksdif.pSetAttribute(isNull(gSdispElement.getGovsdavTableName(), this.getGSdkey().getSdBantab()), gSdispElement.getGovsdavAttrName(), gSdispElement.getGovsdavDisc(), gSdispElement.getGovsdavPkParenttab(), p_gorsdav_rowid_ref, gSdispElement.getGovsdavAttrDataType(), attr);
				gSdispElement.setGovsdavRowid(DbManager.getDataBaseFactory().createRowid(p_gorsdav_rowid_ref.val.getValue().getBytes()));
				getTask().getFormController().getGoqrpls().getGSd().pPostDml();

				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_SDISP.PRE-BLOCK
		 DECLARE
	G$_SDISP_BLOCK_ID BLOCK := FIND_BLOCK('G$_SDISP');
	GOVSDAV_VALUE_AS_CHAR_ID ITEM  := FIND_ITEM('G$_SDISP.GOVSDAV_VALUE_AS_CHAR');
BEGIN
g$_sd.p_pre_block;

IF  NOT ID_NULL(G$_SDISP_BLOCK_ID) THEN
		IF (SUBSTR(:SySTEM.CURRENT_FORM,3,1) = 'Q'
		OR  SUBSTR(:SySTEM.CURRENT_FORM,3,1) = 'I') THEN
				SET_BLOCK_PROPERTY(G$_SDISP_BLOCK_ID,UPDATE_ALLOWED,PROPERTY_FALSE);
				SET_BLOCK_PROPERTY(G$_SDISP_BLOCK_ID,INSERT_ALLOWED,PROPERTY_FALSE);
				SET_BLOCK_PROPERTY(G$_SDISP_BLOCK_ID,DELETE_ALLOWED,PROPERTY_FALSE);
				--
		END IF;
END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_SDISP.PRE-BLOCK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="PRE-BLOCK", function=KeyFunction.BLOCK_IN)
		public void gSdisp_blockIn()
		{
			
			

				{
					BlockDescriptor gSdispBlockId = findBlock("G$_SDISP");
					ItemDescriptor govsdavValueAsCharId = findItem(toStr("G$_SDISP.GOVSDAV_VALUE_AS_CHAR"));
					getTask().getFormController().getGoqrpls().getGSd().pPreBlock();
					if ( !(gSdispBlockId == null) )
					{
						if ((substring(toStr(getCurrentTaskName()), toInt(3), toInt(1)).equals("Q") || substring(toStr(getCurrentTaskName()), toInt(3), toInt(1)).equals("I")))
						{
							setBlockUpdateAllowed(gSdispBlockId, false);
							setBlockInsertAllowed(gSdispBlockId, false);
							setBlockDeleteAllowed(gSdispBlockId, false);
						}
					}
				}
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_SDISP.PRE-QUERY
		 --Enable Insert of attributes
:g$_sdkey.enable_attr_ins:='Y';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_SDISP.PRE-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeQuery
		public void gSdisp_BeforeQuery(QueryEvent args)
		{
			
				// Enable Insert of attributes
				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("G___SDKEY_SD_BANTAB", this.getGSdkey().getSdBantab()));             

				// Enable Insert of attributes
				this.getGSdkey().setEnableAttrIns(toStr("Y"));
			}

		
		/* Original PL/SQL code code for TRIGGER G$_SDISP.POST-BLOCK
		 g$_sd.p_check_required;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_SDISP.POST-BLOCK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-BLOCK", function=KeyFunction.BLOCK_OUT)
		public void gSdisp_blockOut()
		{
			
				getTask().getFormController().getGoqrpls().getGSd().pCheckRequired();
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_SDISP.POST-SELECT
		 --Disable Insert of attributes
:g$_sdkey.enable_attr_ins:='N';
CLEAR_MESSAGE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_SDISP.POST-SELECT
		 *
		 *
		 *</p>
		*/

		@QueryExecuted
		public void gSdisp_PostSelect(EventObject args)
		{
			

			// Disable Insert of attributes
			this.getGSdkey().setEnableAttrIns(toStr("N"));
			clearMessage();
			}

		
		/* Original PL/SQL code code for TRIGGER G$_SDISP.POST-QUERY
		 IF :g$_sdisp.govsdav_attr_reqd_ind = 'Y' THEN
	SET_ITEM_INSTANCE_PROPERTY('G$_SDISP.GOVSDAV_VALUE_AS_CHAR',
	                            CURRENT_RECORD,
	                            VISUAL_ATTRIBUTE,
	                           'G$_NVA_ITEM_REQUIRED');
  IF :g$_sdisp.govsdav_value_as_char IS NULL THEN
  	:g$_sdisp.reqd_is_null:='Y';
  END IF;
  IF SUBSTR(:g$_sdisp.govsdav_attr_prompt_disp,-1)<>'*' THEN
  	:g$_sdisp.govsdav_attr_prompt_disp := :g$_sdisp.govsdav_attr_prompt_disp ||' *';
  	SET_RECORD_PROPERTY(:SYSTEM.TRIGGER_RECORD,:SYSTEM.TRIGGER_BLOCK,STATUS,QUERY_STATUS);
  END IF;  	                           
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_SDISP.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void gSdisp_AfterQuery(RowAdapterEvent args)
		{
			
				GSdispAdapter gSdispElement = (GSdispAdapter)args.getRow();
				if(! gSdispElement.getGovsdavValueAsChar().isNull())
				try {
					gSdispElement.setLockDbValues(true);
					this.govsdavValueAsChar_PostChange();
				} catch(Exception ex){					
				}
				finally{
					gSdispElement.setLockDbValues(false);
				}
			
				
				if ( gSdispElement.getGovsdavAttrReqdInd().equals("Y") )
				{
					setItemStyleClass("G$_SDISP.GOVSDAV_VALUE_AS_CHAR", gSdispElement, "G$_NVA_ITEM_REQUIRED");
					if ( gSdispElement.getGovsdavValueAsChar().isNull() )
					{
						gSdispElement.setReqdIsNull(toStr("Y"));
					}
					if ( substring(gSdispElement.getGovsdavAttrPromptDisp(), - (1)).notEquals("*") )
					{
						gSdispElement.setGovsdavAttrPromptDisp(gSdispElement.getGovsdavAttrPromptDisp().append(" *"));
						gSdispElement.acceptChanges();
						
					}
				}
				
				if ( gSdispElement.getGovsdavAttrDataType().equals("DATE") )
				{
					ItemServices.setItemDataType(toStr("G$_SDISP.GOVSDAV_VALUE_AS_CHAR"), getCurrentRecord(), "Date");
				}
				else if ( gSdispElement.getGovsdavAttrDataType().equals("NUMBER") ) {
					ItemServices.setItemDataType(toStr("G$_SDISP.GOVSDAV_VALUE_AS_CHAR"), getCurrentRecord(), "Number");
				}
				else {
					ItemServices.setItemDataType(toStr("G$_SDISP.GOVSDAV_VALUE_AS_CHAR"), getCurrentRecord(), "String");
				}
			}

		
		/* Original PL/SQL code code for TRIGGER G$_SDISP.WHEN-NEW-RECORD-INSTANCE
		 -- Tried dynamic positioning, but is difficult to do correct after scrollbar movement
DECLARE
  button_id    ITEM := FIND_ITEM('G$_SDKEY.GOVSDAV_VALUE_AS_CHAR_DBT');
BEGIN
	IF :g$_sdisp.govsdav_attr_data_type='DATE' THEN
	  --SET_ITEM_PROPERTY(button_id, VISIBLE,PROPERTY_TRUE);
	  SET_ITEM_PROPERTY(button_id, ENABLED,PROPERTY_TRUE);
	ELSE
		SET_ITEM_PROPERTY(button_id, ENABLED,PROPERTY_FALSE);
		--SET_ITEM_PROPERTY(button_id, VISIBLE,PROPERTY_FALSE);
	END IF;
--
	IF :g$_sdisp.govsdav_attr_data_type='VARCHAR2' AND :g$_sdisp.govsdav_lov_form IS NOT NULL THEN
	  SET_ITEM_PROPERTY('G$_SDKEY.GOVSDAV_VALUE_AS_CHAR_LBT', ENABLED,PROPERTY_TRUE);
	ELSE
		SET_ITEM_PROPERTY('G$_SDKEY.GOVSDAV_VALUE_AS_CHAR_LBT', ENABLED,PROPERTY_FALSE);
	END IF;

END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_SDISP.WHEN-NEW-RECORD-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-RECORD-INSTANCE", function=KeyFunction.RECORD_CHANGE)
		public void gSdisp_recordChange()
		{
			
				//  Tried dynamic positioning, but is difficult to do correct after scrollbar movement
				//F2J_WARNING : Caution, the variable may be null.
				GSdispAdapter gSdispElement = (GSdispAdapter)this.getGSdisp().getRowAdapter(true);
				
				

				{
					ItemDescriptor buttonId = findItem(toStr("G$_SDKEY.GOVSDAV_VALUE_AS_CHAR_DBT"));
					if ( gSdispElement.getGovsdavAttrDataType().equals("DATE") )
					{
						// SET_ITEM_PROPERTY(button_id, VISIBLE,PROPERTY_TRUE);
						
						setItemEnabled(buttonId, true);
					}
					else {
						setItemEnabled(buttonId, false);
					}
					// 
					if ( gSdispElement.getGovsdavAttrDataType().equals("VARCHAR2") && !gSdispElement.getGovsdavLovForm().isNull() )
					{
						ItemServices.setItemEditor("G$_SDISP.GOVSDAV_VALUE_AS_CHAR", "lovbox");

					}
					else if ( gSdispElement.getGovsdavAttrDataType().equals("DATE") )
					{
						ItemServices.setItemEditor("G$_SDISP.GOVSDAV_VALUE_AS_CHAR", "calendar");
					}
					else
					{
						ItemServices.setItemEditor("G$_SDISP.GOVSDAV_VALUE_AS_CHAR", "textbox");
					}
				}

				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_SDISP.WHEN-VALIDATE-RECORD
		 IF :g$_sdisp.govsdav_value_as_char IS NOT NULL 
AND :g$_sdisp.govsdav_disc IS NULL
THEN
	IF :g$_sdisp.govsdav_disc_type = 'S' OR  :g$_sdisp.govsdav_disc_method='I'
	THEN
		:g$_sdisp.govsdav_disc:=1; -- Assume it is the first one we are creating 
	ELSE
		MESSAGE(g$_nls.get('GOQOLIB-0022','FORM','Discriminator is required.'));
		RAISE FORM_TRIGGER_FAILURE;
	END IF;
	
END IF;
-- Save the key to make sure the right key is used in ON-DML triggers
IF :g$_sdisp.govsdav_pk_parenttab IS NULL THEN
	:g$_sdisp.govsdav_pk_parenttab:=:g$_sdkey.sd_key;
END IF;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_SDISP.WHEN-VALIDATE-RECORD
		 *
		 *
		 *</p>
		*/

		@RecordValidationTrigger
		public void gSdisp_WhenValidateRecord()
		{
			
				
				//F2J_WARNING : Caution, the variable may be null.
				GSdispAdapter gSdispElement = (GSdispAdapter)this.getGSdisp().getRowAdapter(true);


				if ( !gSdispElement.getGovsdavValueAsChar().isNull() && gSdispElement.getGovsdavDisc().isNull() )
				{
					if ( gSdispElement.getGovsdavDiscType().equals("S") || gSdispElement.getGovsdavDiscMethod().equals("I") )
					{
						gSdispElement.setGovsdavDisc(toStr(1));
					}
					else {
						errorMessage(GNls.Fget(toStr("GOQOLIB-0022"), toStr("FORM"), toStr("Discriminator is required.")));
						throw new ApplicationException();
					}
				}
				//  Save the key to make sure the right key is used in ON-DML triggers
				if ( gSdispElement.getGovsdavPkParenttab().isNull() )
				{
					gSdispElement.setGovsdavPkParenttab(this.getGSdkey().getSdKey());
				}

			}

		
		/* Original PL/SQL code code for TRIGGER G$_SDISP.KEY-COMMIT
		 -- 80-5 add call to provide SDE block save functionality
G$_SD.KEY_COMMIT;
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_SDISP.KEY-COMMIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-COMMIT", function=KeyFunction.SAVE)
		public void gSdisp_Save()
		{
				
				//  80-5 add call to provide SDE block save functionality
				getTask().getFormController().getGoqrpls().getGSd().keyCommit();
				getTask().getFormController().getGoqrpls().gCheckFailure();

				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_SDISP.KEY-NXTBLK
		 -- 80-5 add call to provide SDE block navigation functionality
G$_SD.KEY_NXTBLK;
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_SDISP.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void gSdisp_NextBlock()
		{
				//  80-5 add call to provide SDE block navigation functionality
				getTask().getFormController().getGoqrpls().getGSd().keyNxtblk();
				getTask().getFormController().getGoqrpls().gCheckFailure();

			}

		
		/* Original PL/SQL code code for TRIGGER G$_SDISP.KEY-PRVBLK
		 -- 80-5 add call to provide SDE block navigation functionality
G$_SD.KEY_PRVBLK;
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_SDISP.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void gSdisp_PreviousBlock()
		{
			
				//  80-5 add call to provide SDE block navigation functionality
			getTask().getFormController().getGoqrpls().getGSd().keyPrvblk();
			getTask().getFormController().getGoqrpls().gCheckFailure();

		}

		
		/* Original PL/SQL code code for TRIGGER G$_SDISP.KEY-ENTQRY
		 -- 80-8 override trigger to prevent query in SDE window
MESSAGE(g$_nls.get('GOQOLIB-0023','FORM','Enter Query function is not available within the Supplemental Data block.'));
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_SDISP.KEY-ENTQRY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-ENTQRY", function=KeyFunction.SEARCH)
		public void gSdisp_Search()
		{
			
//				//  80-8 override trigger to prevent query in SDE window
			errorMessage(GNls.Fget(toStr("GOQOLIB-0023"), toStr("FORM"), toStr("Enter Query function is not available within the Supplemental Data block.")));

			}

		
		/* Original PL/SQL code code for TRIGGER G$_SDISP.KEY-EXEQRY
		 -- 80-8 override trigger to prevent execute query in SDE window
MESSAGE(g$_nls.get('GOQOLIB-0024','FORM','Execute Query function is not available within the Supplemental Data block.'));
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_SDISP.KEY-EXEQRY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-EXEQRY", function=KeyFunction.EXECUTE_QUERY)
		public void gSdisp_ExecuteQuery()
		{
			
				//  80-8 override trigger to prevent execute query in SDE window
			errorMessage(GNls.Fget(toStr("GOQOLIB-0024"), toStr("FORM"), toStr("Execute Query function is not available within the Supplemental Data block.")));
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_SDISP.KEY-CLRREC
		 -- 80-9  override clearing record to preserve data which acts as prompt
:G$_SDISP.GOVSDAV_VALUE_AS_CHAR := '';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_SDISP.KEY-CLRREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRREC", function=KeyFunction.CLEAR_RECORD)
		public void gSdisp_ClearRecord()
		{
			
				//F2J_WARNING : Caution, the variable may be null.
				GSdispAdapter gSdispElement = (GSdispAdapter)this.getGSdisp().getRowAdapter(true);


				//  80-9  override clearing record to preserve data which acts as prompt
				gSdispElement.setGovsdavValueAsChar(toStr(""));

			}

		
		/* Original PL/SQL code code for TRIGGER G$_SDISP.KEY-CLRFRM
		 -- 80-16 clear SDE window before invoking any local triggers
 G$_SD.p_close_sde_form(p_delayed=>FALSE);
 DO_KEY('CLEAR_FORM');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_SDISP.KEY-CLRFRM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRFRM", function=KeyFunction.CLEAR_FORM)
		public void gSdisp_ClearTask()
		{
			

				//  80-16 clear SDE window before invoking any local triggers
				// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
				getTask().getFormController().getGoqrpls().getGSd().pCloseSdeForm(/*pDelayed=>*/NBool.False);
				executeAction("CLEAR_FORM");

			}

		
		/* Original PL/SQL code code for TRIGGER G$_SDISP.VALIDATE_THE_DATA
		 DECLARE
	lv_msg VARCHAR2(2000);
BEGIN
	IF :G$_SDISP.GOVSDAV_VALUE_AS_CHAR IS NULL THEN
		RETURN;
	END IF;
	lv_msg := gp_goksdif.f_validate_value(
	              p_table_name       => :G$_SDISP.GOVSDAV_TABLE_NAME,
	              p_attr_name        => :G$_SDISP.GOVSDAV_ATTR_NAME,
	              p_disc             => :G$_SDISP.GOVSDAV_SDDC_CODE,
-- enable use of SDE_PK bind variable on new inserts for use in SDE validation
--                p_pk_parenttab     => :G$_SDISP.GOVSDAV_PK_PARENTTAB,
                p_pk_parenttab     => NVL(:G$_SDISP.GOVSDAV_PK_PARENTTAB,:G$_SDKEY.SD_KEY),	              
	              p_attr_data_type   => :G$_SDISP.GOVSDAV_ATTR_DATA_TYPE,
	              p_form_or_process  => :System.Current_Form,
	              p_value_as_char    => :G$_SDISP.GOVSDAV_VALUE_AS_CHAR);
	              
  IF lv_msg <> 'Y' THEN
  	MESSAGE(SUBSTR(lv_msg,1,200));
  	RAISE FORM_TRIGGER_FAILURE;
  END IF;
  
END;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_SDISP.VALIDATE_THE_DATA
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="VALIDATE_THE_DATA")
		public void gSdisp_ValidateTheData()
		{
			
				
				//F2J_WARNING : Caution, the variable may be null.
				GSdispAdapter gSdispElement = (GSdispAdapter)this.getGSdisp().getRowAdapter(true);
				
				if(!gSdispElement.getGovsdavAttrDataType().equals("DATE"))
				{
					NString lvMsg= NString.getNull();
					if ( gSdispElement.getGovsdavValueAsChar().isNull() )
					{
						updateComputedValues("G$_SDISP");
						return ;
					}
					Ref<NString> pValueAsCharRef = new Ref<NString>(gSdispElement.getGovsdavValueAsChar());
					// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
					lvMsg = GpGoksdif.fValidateValue(
							/*pTableName=>*/gSdispElement.getGovsdavTableName(),
							/*pAttrName=>*/gSdispElement.getGovsdavAttrName(),
							/*pDisc=>*/gSdispElement.getGovsdavSddcCode(),
							/*pPkParenttab=>*/isNull(gSdispElement.getGovsdavPkParenttab(), this.getGSdkey().getSdKey()),
									/*pAttrDataType=>*/gSdispElement.getGovsdavAttrDataType(),
									toStr(/*pFormOrProcess=>*/getCurrentTaskName()),
									pValueAsCharRef);
					gSdispElement.setGovsdavValueAsChar(pValueAsCharRef.getValue());
					updateComputedValues("G$_SDISP");
					if ( lvMsg.notEquals("Y") )
					{
						errorMessage(substring(lvMsg, toInt(1), toInt(200)));
						throw new ApplicationException();
					}
				}

			}

		
		/* Original PL/SQL code code for TRIGGER GOVSDAV_VALUE_AS_CHAR.WHEN-VALIDATE-ITEM
		 IF :g$_sdisp.govsdav_disc_type='M'  AND :g$_sdisp.govsdav_disc_method='I' 
AND :g$_sdisp.govsdav_value_as_char IS NULL
AND NVL(:g$_sdkey.renum_sd_rec,'N')='N'
THEN
	MESSAGE(g$_nls.get('GOQOLIB-0025','FORM','Please use Record Remove to delete this multiple valued attribute.'));
	RAISE FORM_TRIGGER_FAILURE;
ELSIF :g$_sdisp.govsdav_attr_reqd_ind = 'Y' AND :g$_sdisp.govsdav_value_as_char IS NULL THEN
	:g$_sdisp.reqd_is_null:='Y';
ELSE
	:g$_sdisp.reqd_is_null:=NULL;
END IF;

EXECUTE_TRIGGER('VALIDATE_THE_DATA');
G$_CHECK_FAILURE ;


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOVSDAV_VALUE_AS_CHAR.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="GOVSDAV_VALUE_AS_CHAR")
		public void govsdavValueAsChar_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				GSdispAdapter gSdispElement = (GSdispAdapter)this.getGSdisp().getRowAdapter(true);


				this.govsdavValueAsChar_PostChange();

				if ( gSdispElement.getGovsdavDiscType().equals("M") && gSdispElement.getGovsdavDiscMethod().equals("I") && gSdispElement.getGovsdavValueAsChar().isNull() && isNull(this.getGSdkey().getRenumSdRec(), "N").equals("N") )
				{
					errorMessage(GNls.Fget(toStr("GOQOLIB-0025"), toStr("FORM"), toStr("Please use Record Remove to delete this multiple valued attribute.")));
					throw new ApplicationException();
				}
				else if ( gSdispElement.getGovsdavAttrReqdInd().equals("Y") && gSdispElement.getGovsdavValueAsChar().isNull() ) {
					gSdispElement.setReqdIsNull(toStr("Y"));
				}
				else {
					gSdispElement.setReqdIsNull(toStr(null));
				}
				executeAction("VALIDATE_THE_DATA");
				getTask().getFormController().getGoqrpls().gCheckFailure();

			}

		
		/* Original PL/SQL code code for TRIGGER GOVSDAV_VALUE_AS_CHAR.KEY-LISTVAL
		 DECLARE
	lv_msg   VARCHAR2(500);
BEGIN
 IF :G$_SDISP.GOVSDAV_LOV_FORM IS NULL  THEN
  	message(G$_NLS.Get('GOQOLIB-0026', 'FORM', '*ERROR* No List Of Values (LOV) have been defined'));
    RAISE FORM_TRIGGER_FAILURE;
 END IF ;
--
 :global.gtvsdlv_table_name := NVL(:G$_SDISP.GOVSDAV_LOV_TABLE_OVRD,:G$_SDISP.GOVSDAV_TABLE_NAME);
 :global.gtvsdlv_attr_name  := NVL(:G$_SDISP.GOVSDAV_LOV_ATTR_OVRD, :G$_SDISP.GOVSDAV_ATTR_NAME);
 :global.gtvsdlv_lov_code_title := NVL(:G$_SDISP.GOVSDAV_LOV_CODE_TITLE, G$_NLS.Get('GOQOLIB-0027', 'FORM', 'Code'));
 :global.gtvsdlv_lov_desc_title := NVL(:G$_SDISP.GOVSDAV_LOV_DESC_TITLE, G$_NLS.Get('GOQOLIB-0028', 'FORM', 'Description')); 
--
 G$_COPY_FLD_ATTR;
 EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
 G$_CHECK_FAILURE;
 G$_SECURED_FORM_CALL(USER,:G$_SDISP.GOVSDAV_LOV_FORM,'QUERY');
 G$_RESET_GLOBAL;
 G$_CHECK_FAILURE ;
--
 IF :GLOBAL.VALUE IS NOT NULL  THEN
   :G$_SDISP.GOVSDAV_VALUE_AS_CHAR := :GLOBAL.VALUE ;
   NEXT_FIELD ;
   G$_CHECK_FAILURE ;
 END IF ;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOVSDAV_VALUE_AS_CHAR.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="GOVSDAV_VALUE_AS_CHAR", function=KeyFunction.LIST_VALUES)
		public void govsdavValueAsChar_ListValues()
		{
				//F2J_WARNING : Caution, the variable may be null.
				GSdispAdapter gSdispElement = (GSdispAdapter)this.getGSdisp().getRowAdapter(true);
				{
					NString lvMsg= NString.getNull();
					if ( gSdispElement.getGovsdavLovForm().isNull() )
					{
						errorMessage(GNls.Fget(toStr("GOQOLIB-0026"), toStr("FORM"), toStr("*ERROR* No List Of Values (LOV) have been defined")));
						throw new ApplicationException();
					}
					// 
					setGlobal("GTVSDLV_TABLE_NAME", isNull(gSdispElement.getGovsdavLovTableOvrd(), gSdispElement.getGovsdavTableName()));
					setGlobal("GTVSDLV_ATTR_NAME", isNull(gSdispElement.getGovsdavLovAttrOvrd(), gSdispElement.getGovsdavAttrName()));
					setGlobal("GTVSDLV_LOV_CODE_TITLE", isNull(gSdispElement.getGovsdavLovCodeTitle(), GNls.Fget(toStr("GOQOLIB-0027"), toStr("FORM"), toStr("Code"))));
					setGlobal("GTVSDLV_LOV_DESC_TITLE", isNull(gSdispElement.getGovsdavLovDescTitle(), GNls.Fget(toStr("GOQOLIB-0028"), toStr("FORM"), toStr("Description"))));
					// 
					getTask().getFormController().getGoqrpls().gCopyFldAttr();
					executeAction("G$_REVOKE_ACCESS");
					getTask().getFormController().getGoqrpls().gCheckFailure();
					getTask().getFormController().getGoqrpls().gSecuredFormCall(getUser(), gSdispElement.getGovsdavLovForm(), toStr("QUERY"));
					getTask().getFormController().getGoqrpls().gResetGlobal();
					getTask().getFormController().getGoqrpls().gCheckFailure();
					// 
					if ( !getGlobal("VALUE").isNull() )
					{
						gSdispElement.setGovsdavValueAsChar(getGlobal("VALUE"));
						nextItem();
						doNavigation();
						getTask().getFormController().getGoqrpls().gCheckFailure();
					}
				}

			}

		
		/* Original PL/SQL code code for TRIGGER GOVSDAV_VALUE_AS_CHAR.POST-CHANGE
		 NULL;
<multilinecomment>

CASE :g$_sdisp.govsdav_attr_data_type
	WHEN 'DATE' THEN
	  G$_DATE_REFORMAT('','');
	  G$_CHECK_FAILURE;
	WHEN 'NUMBER' THEN
	  DECLARE
	  	l_num NUMBER;
	  	l_mask VARCHAR2(30);
	  BEGIN
	  	-- 80-12  correct 1-2YFTIN
	  	-- Add edit for length of numeric value.
	  	IF  LENGTH(TRANSLATE(:G$_SDISP.GOVSDAV_VALUE_AS_CHAR,'0,.','0'))>:g$_sdisp.govsdav_attr_data_len THEN
					MESSAGE(g$_nls.get('GOQOLIB-0025','FORM','*Error* Value too long, maximum length is %01%',
			                   :g$_sdisp.govsdav_attr_data_len));
					RAISE FORM_TRIGGER_FAILURE;
	  	END IF;
	  			--
      IF :g$_sdisp.govsdav_attr_data_scale IS NULL and :g$_sdisp.govsdav_attr_data_len IS NULL THEN
          --accept any number Oracle can parse
          l_num:=:system.current_value;
      ELSE
          l_mask:=RPAD('9', NVL(:g$_sdisp.govsdav_attr_data_scale,0),'9');
          l_mask:='D'||l_mask;
          l_mask:=LPAD(l_mask,NVL(:g$_sdisp.govsdav_attr_data_len,22)+1,'9');
          -- this first conversion is to ensure that gp_goksdif will properly convert
          -- the sys.anydata value especially if there are the thousands character present
          l_num:=:system.current_value;
          l_num:=TO_NUMBER(:system.current_value,l_mask);
      END IF;
	  EXCEPTION
	  	WHEN VALUE_ERROR THEN
	  	  IF l_mask IS NOT NULL THEN
					MESSAGE(g$_nls.get('GOQOLIB-0026','FORM','*Error* Invalid Number. Expected format: %01%',l_mask));
	  	  ELSE
	  	  	MESSAGE(g$_nls.get('GOQOLIB-0027','FORM','*Error* Invalid Number.'));
		  	END IF;
	  		RAISE FORM_TRIGGER_FAILURE;
	  END;
	WHEN 'VARCHAR2' THEN
		-- 80-13  correct defect 1-2XWC9J
		-- Change value in LENGTH statement used to check length of data
		-- from :system.current_value to :G$_SDISP.GOVSDAV_VALUE_AS_CHAR since
		-- since :system.current_value has a maximum length of 255 characters 
		-- and data can exceed that length.
		-- Add string "*Error* to error messages.
		IF  LENGTH(:G$_SDISP.GOVSDAV_VALUE_AS_CHAR)>:g$_sdisp.govsdav_attr_data_len THEN
				MESSAGE(g$_nls.get('GOQOLIB-0028','FORM','*Error* Text too long, maximum length is %01%',
			                   :g$_sdisp.govsdav_attr_data_len));
				RAISE FORM_TRIGGER_FAILURE;
		END IF;
		ELSE
		NULL;
END CASE;

</multilinecomment>
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOVSDAV_VALUE_AS_CHAR.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="GOVSDAV_VALUE_AS_CHAR")
		public void govsdavValueAsChar_PostChange()
		{
			
			}
}

