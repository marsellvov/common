package net.hedtech.banner.general.common.Gutpmnu.controller;
 
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
import net.hedtech.general.common.libraries.Goqgmnu.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;

import net.hedtech.banner.general.common.Gutpmnu.model.*;
import net.hedtech.banner.general.common.Gutpmnu.*;
import net.hedtech.banner.general.common.Gutpmnu.services.*;

		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class QkMenuController extends DefaultBlockController {


	private net.hedtech.general.common.libraries.Goqolib.controller.QkMenuController getGoqolibQkMenuController() {
		return (net.hedtech.general.common.libraries.Goqolib.controller.QkMenuController) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("QK_MENU");
	}	
	
	public QkMenuController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
		
	@Override
	public GutpmnuTask getTask() {
		return (GutpmnuTask)super.getTask();
	}

	public GutpmnuModel getFormModel() {
		return this.getTask().getModel();
	}
		
	//Cabanas
	//action methods generated from triggers
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * QK_MENU.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void qkMenu_AfterQuery(RowAdapterEvent args)
		{
			//TODO MORPHIS
//				getGoqolibQkMenuController().qkMenu_AfterQuery();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * QK_MENU.ON-ERROR
		 *
		 *
		 *</p>
		 * @param args
		*/

		@OnError
		public void qkMenu_OnError(EventObject args)
		{
			//TODO MORPHIS
//				getGoqolibQkMenuController().qkMenu_OnError();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * QK_MENU.POST-BLOCK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-BLOCK", function=KeyFunction.BLOCK_OUT)
		public void qkMenu_blockOut()
		{
			//TODO MORPHIS
				//getGoqolibQkMenuController().qkMenu_blockOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * QK_MENU.KEY-CREREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CREREC", function=KeyFunction.CREATE_RECORD)
		public void qkMenu_CreateRecord()
		{
			//TODO MORPHIS
//				getGoqolibQkMenuController().qkMenu_CreateRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * QK_MENU.KEY-DELREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DELREC", function=KeyFunction.DELETE_RECORD)
		public void qkMenu_DeleteRecord()
		{
			//TODO MORPHIS
				//getGoqolibQkMenuController().qkMenu_DeleteRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * QK_MENU.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void qkMenu_NextBlock()
		{
//			TODO MORPHIS
//				getGoqolibQkMenuController().qkMenu_NextBlock();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * QK_MENU.KEY-NXTREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void qkMenu_NextRecord()
		{
//			TODO MORPHIS
//				getGoqolibQkMenuController().qkMenu_NextRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * QK_MENU.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void qkMenu_PreviousBlock()
		{
			//TODO MORPHIS
//				getGoqolibQkMenuController().qkMenu_PreviousBlock();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * QK_MENU.KEY-PRVREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVREC", function=KeyFunction.PREVIOUS_RECORD)
		public void qkMenu_PreviousRecord()
		{
			//TODO MORPHIS			
				//getGoqolibQkMenuController().qkMenu_PreviousRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * QK_MENU.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", function=KeyFunction.NEXT_ITEM)
		public void qkMenu_keyNexItem()
		{
			//TODO MORPHIS	
//				getGoqolibQkMenuController().qkMenu_keyNexItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * QK_MENU.KEY-PREV-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PREV-ITEM", function=KeyFunction.PREVIOUS_ITEM)
		public void qkMenu_PreviousItem()
		{
				//TODO MORPHIS	
//				getGoqolibQkMenuController().qkMenu_PreviousItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * QK_MENU.PRE-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeQuery
		public void qkMenu_BeforeQuery(QueryEvent args)
		{
			
               // F2J_WARNING : Query Parameters initialization. Make sure that all the query parameters are properly initialized

                // F2J_WARNING : Caution, the variable may be null.                  
                GubobjsAdapter gubobjsElement = (GubobjsAdapter) this.getFormModel().getGubobjs().getRowAdapter();                       
				if(gubobjsElement!=null){
				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("GUBOBJS_NAME", gubobjsElement.getGubobjsName()));             


				}
               }

		
	
	
}

