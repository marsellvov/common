package net.hedtech.banner.student.common.Soisbgi.controller;
 
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
import morphis.core.utils.behavior.annotations.*;
import morphis.foundations.flavors.forms.appsupportlib.runtime.*;

import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;

import net.hedtech.banner.student.common.Soisbgi.model.*;
import net.hedtech.banner.student.common.Soisbgi.*;
import net.hedtech.banner.student.common.Soisbgi.services.*;

import net.hedtech.general.common.libraries.Goqolib.services.GCodeClass;	
		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class SovsbgvController extends DefaultBlockController {

	private GCodeClass getGCodeClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GCodeClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_CODE_CLASS");
	}	

	
	public SovsbgvController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
		
	@Override
	public SoisbgiTask getTask() {
		return (SoisbgiTask)super.getTask();
	}

	public SoisbgiModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
	
		/* Original PL/SQL code code for TRIGGER SOVSBGV.PRE-QUERY
		    :HOLD_STATE := :SOVSBGV_STAT_CODE ;
   :HOLD_CITY := :SOVSBGV_CITY ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVSBGV.PRE-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeQuery
		public void sovsbgv_BeforeQuery(QueryEvent args)
		{
			
				SovsbgvAdapter sovsbgvElement = (SovsbgvAdapter)this.getFormModel().getSovsbgv().getRowAdapter(true);


               // F2J_WARNING : Query Parameters initialization. Make sure that all the query parameters are properly initialized

				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("TYPE_IND", this.getFormModel().getFormHeader().getTypeInd()));             


				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("SRCE_IND", this.getFormModel().getFormHeader().getSrceInd()));             


           
				getFormModel().getFormHeader().setHoldState(sovsbgvElement.getSovsbgvStatCode());
				getFormModel().getFormHeader().setHoldCity(sovsbgvElement.getSovsbgvCity());
			}

		
		/* Original PL/SQL code code for TRIGGER SOVSBGV.KEY-PRVBLK
		 EXECUTE_TRIGGER('INVALID_FUNCTION_MSG');
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVSBGV.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void sovsbgv_PreviousBlock()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SOVSBGV.KEY-NXTBLK
		 EXECUTE_TRIGGER('INVALID_FUNCTION_MSG');
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVSBGV.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void sovsbgv_NextBlock()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVSBGV_STAT_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SOVSBGV_STAT_CODE", function=KeyFunction.ITEM_CHANGE)
		public void sovsbgvStatCode_itemChange()
		{
			
			getGCodeClass().itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVSBGV_STAT_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="SOVSBGV_STAT_CODE")
		public void sovsbgvStatCode_GSearchParameters()
		{
			
			getGCodeClass().gSearchParameters();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVSBGV_STAT_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="SOVSBGV_STAT_CODE")
		public void sovsbgvStatCode_GSearchOptions()
		{
			
			getGCodeClass().gSearchOptions();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVSBGV_STAT_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SOVSBGV_STAT_CODE", function=KeyFunction.NEXT_ITEM)
		public void sovsbgvStatCode_keyNexItem()
		{
			
			getGCodeClass().nextItem();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVSBGV_STAT_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SOVSBGV_STAT_CODE", function=KeyFunction.ITEM_OUT)
		public void sovsbgvStatCode_itemOut()
		{
			
			getGCodeClass().itemOut();
		}

		
		/* Original PL/SQL code code for TRIGGER SOVSBGV_STAT_CODE.KEY-LISTVAL
		 IF :SYSTEM.MODE = 'ENTER-QUERY' THEN
   G$_DISPLAY_LOV('','');
ELSIF :SYSTEM.MODE = 'NORMAL' THEN
   MESSAGE( G$_NLS.Get('x', 'FORM','*ERROR* LOV available only in enter-query mode.') );
   RAISE FORM_TRIGGER_FAILURE;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVSBGV_STAT_CODE.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="SOVSBGV_STAT_CODE", function=KeyFunction.LIST_VALUES)
		public void sovsbgvStatCode_ListValues()
		{
			
				if ( getMode().equals("ENTER-QUERY") )
				{
					getTask().getGoqrpls().gDisplayLov(toStr(""), toStr(""));
				}
				else if ( getMode().equals("NORMAL") ) {
					errorMessage(GNls.Fget(toStr("x"), toStr("FORM"), toStr("*ERROR* LOV available only in enter-query mode.")));
					throw new ApplicationException();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOVSBGV_STAT_CODE.WHEN-MOUSE-DOUBLECLICK
		 BEGIN
	DO_KEY('LIST_VALUES');
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVSBGV_STAT_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SOVSBGV_STAT_CODE")
		public void sovsbgvStatCode_doubleClick()
		{
			
				executeAction(KeyFunction.LIST_VALUES);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVSBGV_ADMR_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SOVSBGV_ADMR_CODE", function=KeyFunction.ITEM_CHANGE)
		public void sovsbgvAdmrCode_itemChange()
		{
			
			getGCodeClass().itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVSBGV_ADMR_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="SOVSBGV_ADMR_CODE")
		public void sovsbgvAdmrCode_GSearchParameters()
		{
			
			getGCodeClass().gSearchParameters();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVSBGV_ADMR_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="SOVSBGV_ADMR_CODE")
		public void sovsbgvAdmrCode_GSearchOptions()
		{
			
			getGCodeClass().gSearchOptions();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVSBGV_ADMR_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SOVSBGV_ADMR_CODE", function=KeyFunction.NEXT_ITEM)
		public void sovsbgvAdmrCode_keyNexItem()
		{
			
			getGCodeClass().nextItem();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVSBGV_ADMR_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SOVSBGV_ADMR_CODE", function=KeyFunction.ITEM_OUT)
		public void sovsbgvAdmrCode_itemOut()
		{
			
			getGCodeClass().itemOut();
		}

		
		/* Original PL/SQL code code for TRIGGER SOVSBGV_ADMR_CODE.KEY-LISTVAL
		 IF :SYSTEM.MODE = 'ENTER-QUERY' THEN
   G$_DISPLAY_LOV('','');
ELSIF :SYSTEM.MODE = 'NORMAL' THEN
   MESSAGE( G$_NLS.Get('x', 'FORM','*ERROR* LOV available only in enter-query mode.') );
   RAISE FORM_TRIGGER_FAILURE;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVSBGV_ADMR_CODE.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="SOVSBGV_ADMR_CODE", function=KeyFunction.LIST_VALUES)
		public void sovsbgvAdmrCode_ListValues()
		{
			
				if ( getMode().equals("ENTER-QUERY") )
				{
					getTask().getGoqrpls().gDisplayLov(toStr(""), toStr(""));
				}
				else if ( getMode().equals("NORMAL") ) {
					errorMessage(GNls.Fget(toStr("x"), toStr("FORM"), toStr("*ERROR* LOV available only in enter-query mode.")));
					throw new ApplicationException();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOVSBGV_ADMR_CODE.WHEN-MOUSE-DOUBLECLICK
		 BEGIN
	DO_KEY('LIST_VALUES');
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVSBGV_ADMR_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SOVSBGV_ADMR_CODE")
		public void sovsbgvAdmrCode_doubleClick()
		{
			
				executeAction(KeyFunction.LIST_VALUES);
			}

		
	
	
}

