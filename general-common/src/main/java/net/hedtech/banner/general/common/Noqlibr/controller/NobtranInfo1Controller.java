package net.hedtech.banner.general.common.Noqlibr.controller;
 
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
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.general.common.libraries.Goqolib.services.GDateClass;
import net.hedtech.banner.general.common.Noqlibr.model.*;
import net.hedtech.banner.general.common.Noqlibr.*;
import net.hedtech.banner.general.common.Noqlibr.services.*;


		
public class NobtranInfo1Controller extends AbstractSupportCodeObject {
	
	private GDateClass getGDateClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GDateClass) this.getContainer().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_DATE_CLASS");
	}
	
	public NobtranInfo1Controller(ISupportCodeContainer container) 
	{
		super(container);
	}
		
	@Override
	public NoqlibrTaskPart getContainer() {
		return (NoqlibrTaskPart)super.getContainer();
	}
	
	
	public NoqlibrModel getFormModel() {
		return getContainer().getModel();
	}		
		
			
	//action methods generated from triggers
		/* Original PL/SQL code code for TRIGGER NOBTRAN_INFO_1.KEY-NXTBLK
		 GO_BLOCK('NORCMNT');
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * NOBTRAN_INFO_1.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void nobtranInfo1_NextBlock()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.

				goBlock(toStr("NORCMNT"));
				getContainer().getGoqrpls().gCheckFailure();

//				System.err.println("F2J :  trigger net.hedtech.banner.general.common.Noqlibr.controller.NobtranInfo1Controller.nobtranInfo1_NextBlock is not completely migrated yet. Please read the Migration Guide.");
				
			}

		
		/* Original PL/SQL code code for TRIGGER NOBTRAN_INFO_1.KEY-PRVBLK
		 previous_block;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * NOBTRAN_INFO_1.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void nobtranInfo1_PreviousBlock()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.

				previousBlock();

//				System.err.println("F2J :  trigger net.hedtech.banner.general.common.Noqlibr.controller.NobtranInfo1Controller.nobtranInfo1_PreviousBlock is not completely migrated yet. Please read the Migration Guide.");
				
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * NOBTRAN_INFO_1.PRE-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeQuery
		public void nobtranInfo1_BeforeQuery(QueryEvent args)
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
		 * NOBTRAN_CREATED_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="NOBTRAN_CREATED_DATE", function=KeyFunction.NEXT_ITEM)
		public void nobtranCreatedDate_keyNexItem()
		{
			
			getGDateClass().nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * NOBTRAN_CREATED_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="NOBTRAN_CREATED_DATE", function=KeyFunction.ITEM_CHANGE)
		public void nobtranCreatedDate_itemChange()
		{
			
			getGDateClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * NOBTRAN_CREATED_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="NOBTRAN_CREATED_DATE", function=KeyFunction.ITEM_OUT)
		public void nobtranCreatedDate_itemOut()
		{
			
			getGDateClass().itemOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * NOBTRAN_SUBMISSION_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="NOBTRAN_SUBMISSION_DATE", function=KeyFunction.NEXT_ITEM)
		public void nobtranSubmissionDate_keyNexItem()
		{
			
			getGDateClass().nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * NOBTRAN_SUBMISSION_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="NOBTRAN_SUBMISSION_DATE", function=KeyFunction.ITEM_CHANGE)
		public void nobtranSubmissionDate_itemChange()
		{
			
			getGDateClass().itemOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * NOBTRAN_SUBMISSION_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="NOBTRAN_SUBMISSION_DATE", function=KeyFunction.ITEM_OUT)
		public void nobtranSubmissionDate_itemOut()
		{
			
			getGDateClass().itemOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * NOBTRAN_APPLY_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="NOBTRAN_APPLY_DATE", function=KeyFunction.NEXT_ITEM)
		public void nobtranApplyDate_keyNexItem()
		{
			
			getGDateClass().nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * NOBTRAN_APPLY_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="NOBTRAN_APPLY_DATE", function=KeyFunction.ITEM_CHANGE)
		public void nobtranApplyDate_itemChange()
		{
			
			getGDateClass().itemOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * NOBTRAN_APPLY_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="NOBTRAN_APPLY_DATE", function=KeyFunction.ITEM_OUT)
		public void nobtranApplyDate_itemOut()
		{
			
			getGDateClass().itemOut();
			}

		
	
	
}

