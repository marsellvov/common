package net.hedtech.banner.general.common.Noqlibr.controller;
 
import java.util.*;

import org.jdesktop.databuffer.DataRow.DataRowStatus;

import morphis.core.utils.misc.RefObject;
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
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.general.common.libraries.Goqolib.GoqolibTaskPart;
import net.hedtech.general.common.libraries.Goqolib.model.GoqolibModel;
import net.hedtech.general.common.libraries.Goqolib.services.GCodeClass;
import net.hedtech.general.common.libraries.Goqolib.services.GDateClass;
import net.hedtech.banner.general.common.Noqlibr.model.*;
import net.hedtech.banner.general.common.Noqlibr.*;
import net.hedtech.banner.general.common.Noqlibr.services.*;

		
public class NorcmntController extends AbstractSupportCodeObject {

	private GDateClass getGDateClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GDateClass) this.getContainer().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_DATE_CLASS");
	}
	
	public NorcmntController(ISupportCodeContainer container) 
	{
		super(container);
	}
		
	public NoqlibrTaskPart getContainer() {
		return (NoqlibrTaskPart)super.getContainer();
	}

	public NoqlibrModel getFormModel() {
		return this.getContainer().getModel();
	}
		

			
	//action methods generated from triggers
		/* Original PL/SQL code code for TRIGGER NORCMNT.ON-INSERT
		 BEGIN
  nb_ea_comments.p_create(
    p_transaction_no => :norcmnt.norcmnt_transaction_no,
    p_comments       => :norcmnt.norcmnt_comments,
    p_user_id        => :global.current_user,
    p_data_origin    => :global.data_origin,
    p_seq_no_out     => :norcmnt.norcmnt_seq_no,
    p_rowid_out      => :norcmnt.rowid);
  --
  :norcmnt.norcmnt_activity_date := to_date(g$_resynch_record(:norcmnt.rowid),'DDMONYYYYHH24MISS');
EXCEPTION
  WHEN OTHERS THEN
    G$_DISPLAY_ERR_MSG(SQLERRM);
    RAISE FORM_TRIGGER_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * NORCMNT.ON-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@RowInsert
		public void norcmnt_RowInsert(RowAdapterEvent args)
		{
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.

				NorcmntAdapter norcmntElement = (NorcmntAdapter)args.getRow();


				try
				{
					// F2J_TO_COMPLETE : The conversion process could not determine the name of the intended business object. Determine the correct Business Object name and complete the code.
					// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
					Ref<NNumber> p_seq_no_out_ref = new Ref<NNumber>();
					Ref<NString> p_rowid_out_ref = new Ref<NString>();
					NbEaComments.pCreate(/*pTransactionNo=>*/norcmntElement.getNorcmntTransactionNo(), /*pComments=>*/norcmntElement.getNorcmntComments(), /*pUserId=>*/getGlobal("CURRENT_USER"), /*pDataOrigin=>*/getGlobal("DATA_ORIGIN"), p_seq_no_out_ref, p_rowid_out_ref);
					norcmntElement.setNorcmntSeqNo(p_seq_no_out_ref.val);
					norcmntElement.setROWID(p_rowid_out_ref.val);
					// 
					// F2J_TO_COMPLETE : The conversion process could not determine the name of the intended business object. Determine the correct Business Object name and complete the code.
					norcmntElement.setNorcmntActivityDate(toDate(getContainer().getGoqrpls().gResynchRecord(norcmntElement.getROWID()), "DDMONYYYYHH24MISS"));
				}
				catch(Exception  e)
				{
					getContainer().getGoqrpls().gDisplayErrMsg(errorMessage());
					throw new ApplicationException();
				}

//				System.err.println("F2J :  trigger net.hedtech.banner.general.common.Noqlibr.controller.NorcmntController.norcmnt_RowInsert is not completely migrated yet. Please read the Migration Guide.");
				
			}

		
		/* Original PL/SQL code code for TRIGGER NORCMNT.WHEN-NEW-RECORD-INSTANCE
		 EXECUTE_TRIGGER('EDIT_COMMENTS');
G$_CHECK_FAILURE;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * NORCMNT.WHEN-NEW-RECORD-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-RECORD-INSTANCE", function=KeyFunction.RECORD_CHANGE)
		public void norcmnt_recordChange()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.

				executeAction("EDIT_COMMENTS");
				getContainer().getGoqrpls().gCheckFailure();

//				System.err.println("F2J :  trigger net.hedtech.banner.general.common.Noqlibr.controller.NorcmntController.norcmnt_recordChange is not completely migrated yet. Please read the Migration Guide.");
				
			}

		
		/* Original PL/SQL code code for TRIGGER NORCMNT.ON-ERROR
		 IF ERROR_CODE = 40200 THEN
  EXECUTE_TRIGGER('EDIT_COMMENTS');
  G$_CHECK_FAILURE;
ELSE
  MESSAGE(ERROR_TYPE||'-'||TO_CHAR(ERROR_CODE)||': '||ERROR_TEXT);
END IF;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * NORCMNT.ON-ERROR
		 *
		 *
		 *</p>
		 * @param args
		*/

		@OnError
		public void norcmnt_OnError(EventObject args)
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.

				if ( errorCode().equals(40200) )
				{
					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
					executeAction("EDIT_COMMENTS");
					getContainer().getGoqrpls().gCheckFailure();
				}
				else {
					// F2J_TO_REMOVE : Call to built-in "ERROR_TEXT" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\NOQLIBRF2NMigrationGuide.xml#ExcludeErrorBuiltins".
					//					message(SupportClasses.SQLFORMS.ErrorType().append("-").append(toChar(SupportClasses.SQLFORMS.ErrorCode())).append(": ").append(SupportClasses.SQLFORMS.ErrorText()));
					////
					this.getLogger().trace(this, "// F2J_TO_REMOVE : Call to built-in 'ERROR_TEXT' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\NOQLIBRF2NMigrationGuide.xml#ExcludeErrorBuiltins'.");
					
					
				}

//				System.err.println("F2J :  trigger net.hedtech.banner.general.common.Noqlibr.controller.NorcmntController.norcmnt_OnError is not completely migrated yet. Please read the Migration Guide.");
				
			}

		
		/* Original PL/SQL code code for TRIGGER NORCMNT.EDIT_COMMENTS
		 IF NAME_IN('NOBTRAN.NOBTRAN_TRANS_STATUS_IND') = 'C' THEN
  SET_ITEM_PROPERTY('NORCMNT.NORCMNT_COMMENTS',INSERT_ALLOWED,PROPERTY_OFF);
  MESSAGE( G$_NLS.Get('NOQLIBR-0001', 'FORM','*NOTE* Inserts comments are not allowed to completed transactions.'));
ELSE
  SET_ITEM_PROPERTY('NORCMNT.NORCMNT_COMMENTS',INSERT_ALLOWED,PROPERTY_ON);
END IF;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * NORCMNT.EDIT_COMMENTS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="EDIT_COMMENTS")
		public void norcmnt_EditComments()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.

				if ( getNameIn("NOBTRAN.NOBTRAN_TRANS_STATUS_IND").equals("C") )
				{
					setItemInsertAllowed("NORCMNT.NORCMNT_COMMENTS", false);
					infoMessage(GNls.Fget(toStr("NOQLIBR-0001"), toStr("FORM"), toStr("*NOTE* Inserts comments are not allowed to completed transactions.")));
				}
				else {
					setItemInsertAllowed("NORCMNT.NORCMNT_COMMENTS", true);
				}

//				System.err.println("F2J :  trigger net.hedtech.banner.general.common.Noqlibr.controller.NorcmntController.norcmnt_EditComments is not completely migrated yet. Please read the Migration Guide.");
				
			}

		
		/* Original PL/SQL code code for TRIGGER NORCMNT.KEY-CREREC
		 CREATE_RECORD;
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * NORCMNT.KEY-CREREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CREREC", function=KeyFunction.CREATE_RECORD)
		public void norcmnt_CreateRecord()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.

				createRecord();
				getContainer().getGoqrpls().gCheckFailure();

//				System.err.println("F2J :  trigger net.hedtech.banner.general.common.Noqlibr.controller.NorcmntController.norcmnt_CreateRecord is not completely migrated yet. Please read the Migration Guide.");
				
			}

		
		/* Original PL/SQL code code for TRIGGER NORCMNT.KEY-DELREC
		 if :system.record_status = 'NEW' then
	delete_record;
end if;	
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * NORCMNT.KEY-DELREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DELREC", function=KeyFunction.DELETE_RECORD)
		public void norcmnt_DeleteRecord()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.

				// F2J_WARNING : The built-in  call was converted but there can be semantic differences in the resulting code.
				if ( getRecordStatus().equals("NEW") )
				{
					deleteRecord();
				}

//				System.err.println("F2J :  trigger net.hedtech.banner.general.common.Noqlibr.controller.NorcmntController.norcmnt_DeleteRecord is not completely migrated yet. Please read the Migration Guide.");
				
			}

		
		/* Original PL/SQL code code for TRIGGER NORCMNT.KEY-PRVBLK
		 previous_block;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * NORCMNT.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void norcmnt_PreviousBlock()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.

				previousBlock();

//				System.err.println("F2J :  trigger net.hedtech.banner.general.common.Noqlibr.controller.NorcmntController.norcmnt_PreviousBlock is not completely migrated yet. Please read the Migration Guide.");
				
			}

		
		/* Original PL/SQL code code for TRIGGER NORCMNT.KEY-NXTBLK
		 next_block;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * NORCMNT.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void norcmnt_NextBlock()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.

				nextBlock();

//				System.err.println("F2J :  trigger net.hedtech.banner.general.common.Noqlibr.controller.NorcmntController.norcmnt_NextBlock is not completely migrated yet. Please read the Migration Guide.");
				
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * NORCMNT.PRE-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeQuery
		public void norcmnt_BeforeQuery(QueryEvent args)
		{
			
               // F2J_WARNING : Query Parameters initialization. Make sure that all the query parameters are properly initialized

                // F2J_WARNING : Caution, the variable may be null.                  
                NobtranAdapter nobtranElement = (NobtranAdapter) this.getFormModel().getNobtran().getRowAdapter();                       
				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("NOBTRAN_NOBTRAN_TRANSACTION_NO", nobtranElement.getNobtranTransactionNo()));                       
               }

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * NORCMNT_ACTIVITY_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="NORCMNT_ACTIVITY_DATE", function=KeyFunction.NEXT_ITEM)
		public void norcmntActivityDate_keyNexItem()
		{
			
				getGDateClass().nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * NORCMNT_ACTIVITY_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="NORCMNT_ACTIVITY_DATE", function=KeyFunction.ITEM_CHANGE)
		public void norcmntActivityDate_itemChange()
		{
			
			getGDateClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * NORCMNT_ACTIVITY_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="NORCMNT_ACTIVITY_DATE", function=KeyFunction.ITEM_OUT)
		public void norcmntActivityDate_itemOut()
		{
			
				getGDateClass().itemOut();
			}

		
	
	
}

