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

import net.hedtech.general.common.libraries.Goqolib.services.GubobjsType;	
		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class GubobjsController extends DefaultBlockController {

	private GubobjsType getGubobjsType() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GubobjsType) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("GUBOBJS_TYPE");
	}	

	
	public GubobjsController(IFormController parentController, String name) 
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
		
			
	//action methods generated from triggers
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBOBJS.PRE-BLOCK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="PRE-BLOCK", function=KeyFunction.BLOCK_IN)
		public void gubobjs_blockIn()
		{
			
				getGubobjsType().preBlock();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBOBJS.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void gubobjs_AfterQuery(RowAdapterEvent args)
		{
			
				getGubobjsType().afterQuery(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBOBJS.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", function=KeyFunction.LIST_VALUES)
		public void gubobjs_ListValues()
		{
			
				getGubobjsType().listValues();
			}

		
		/* Original PL/SQL code code for TRIGGER GUBOBJS.KEY-NXTBLK
		 IF GET_VIEW_PROPERTY('GURMENU2_CANVAS',VISIBLE) = 'TRUE' THEN
  GO_BLOCK('GURMENU2');
ELSE
  GO_BLOCK('GURMENU');
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBOBJS.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/
		//Cabanas
		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void gubobjs_NextBlock()
		{
			
				if ( getViewVisible("GURMENU2_CANVAS").equals("TRUE") )
				{
					goBlock(toStr("GURMENU2"));
				}
				else {
					goBlock(toStr("GURMENU"));
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBOBJS.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void gubobjs_PreviousBlock()
		{
			
				getGubobjsType().previousBlock();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBOBJS.KEY-ENTQRY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-ENTQRY", function=KeyFunction.SEARCH)
		public void gubobjs_Search()
		{
			
	
				getGubobjsType().search();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBOBJS.KEY-EXEQRY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-EXEQRY", function=KeyFunction.EXECUTE_QUERY)
		public void gubobjs_ExecuteQuery()
		{
			
				getGubobjsType().executeQuery();
			}

		
		/* Original PL/SQL code code for TRIGGER GUBOBJS.WHEN-NEW-BLOCK-INSTANCE
		 NULL;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBOBJS.WHEN-NEW-BLOCK-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-BLOCK-INSTANCE", function=KeyFunction.BLOCK_CHANGE)
		public void gubobjs_blockChange()
		{
			
			}

		
		/* Original PL/SQL code code for TRIGGER GUBOBJS.WHEN-MOUSE-DOUBLECLICK
		 DECLARE
  qk_height number(2);
  row_count number(5);
  cur_pos   number(5);
  row_pos   number(5);
  top_rec   number(5):= Get_Block_Property('GUBOBJS',TOP_RECORD);
  cur_rec   number(5):= :SYSTEM.TRIGGER_RECORD;
BEGIN
  IF :WORK_CR = 'Y' THEN
  	MESSAGE( G$_NLS.Get('GUTPMNU-0008', 'FORM','*ERROR* Menu has not been queried, invalid function.') );
    GO_ITEM('FORM_HEADER.CUST_USER_ID');
    RAISE FORM_TRIGGER_FAILURE;
  END IF;
--
-- Standard left mouse click
--  	
  IF :SYSTEM.MOUSE_BUTTON_PRESSED = '1' THEN
    IF :FORM_HEADER.CUST_USER_ID IS NULL THEN
      MESSAGE( G$_NLS.Get('GUTPMNU-0009', 'FORM','*ERROR* User name must be entered.') );
      GO_ITEM('FORM_HEADER.CUST_USER_ID');
      RAISE FORM_TRIGGER_FAILURE;
    END IF;
--
    IF :CUST_USER_ID IS NOT NULL THEN
      IF get_multy_row_from_rec_grp('DELETE') THEN
        RETURN; 
      ELSE
        G$_MULTI_REC_SELECTION.MULTI_RECORD_CHOICE('SELECTION');
      END IF;
    END IF;
--
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBOBJS.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK")
		public void gubobjs_doubleClick()
		{
			
				{
					NNumber qkHeight= NNumber.getNull();
					NNumber rowCount= NNumber.getNull();
					NNumber curPos= NNumber.getNull();
					NNumber rowPos= NNumber.getNull();
					
					//NNumber topRec = SupportClasses.FORMS40.GetBlockProperty("GUBOBJS", SupportClasses.Property.TOP_RECORD);
					
					NNumber curRec = toNumber(getTriggerRecord());
					if ( getFormModel().getFormHeader().getWorkCr().equals("Y") )
					{
						errorMessage(GNls.Fget(toStr("GUTPMNU-0008"), toStr("FORM"), toStr("*ERROR* Menu has not been queried, invalid function.")));
						goItem(toStr("FORM_HEADER.CUST_USER_ID"));
						throw new ApplicationException();
					}
					// 
					//  Standard left mouse click
					//
					//Morphis TODO
//					if ( SupportClasses.AppContext.MouseButtonPressed.equals("1") )    DEIXEI Comentado
//					{
						// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
						if ( getFormModel().getFormHeader().getCustUserId().isNull() )
						{
							errorMessage(GNls.Fget(toStr("GUTPMNU-0009"), toStr("FORM"), toStr("*ERROR* User name must be entered.")));
							goItem(toStr("FORM_HEADER.CUST_USER_ID"));
							throw new ApplicationException();
						}
						// 
						if ( !getFormModel().getFormHeader().getCustUserId().isNull() )
						{
							if ( this.getTask().getServices().getMultyRowFromRecGrp(toStr("DELETE")).getValue() )
							{
								return ;
							}
							else {
								getTask().getGoqgmnu().getGMultiRecSelection().multiRecordChoice(toStr("SELECTION"));
							}
						}
					}
			//	}
			}

		
		/* Original PL/SQL code code for TRIGGER GUBOBJS.KEY-COMMIT
		 G$_INVALID_FUNCTION_MSG;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBOBJS.KEY-COMMIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-COMMIT", function=KeyFunction.SAVE)
		public void gubobjs_Save()
		{
			
				getTask().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER GUBOBJS.ADD_TO_MRC
		 DECLARE  
  rg_id   RECORDGROUP := Find_Group('SELECTION');
  rg_row  NUMBER(5);
--
  block_name VARCHAR2(30):= :SYSTEM.CURSOR_BLOCK;
BEGIN
  ADD_GROUP_ROW(rg_id, END_OF_GROUP);
  rg_row := TO_NUMBER(GET_GROUP_ROW_COUNT(rg_id));
--
  SET_ITEM_INSTANCE_PROPERTY('GUBOBJS.GUBOBJS_NAME',CURRENT_RECORD,VISUAL_ATTRIBUTE,'LOCAL_HIGHLITE_TEXT');
  SET_ITEM_INSTANCE_PROPERTY('GUBOBJS.GUBOBJS_DESC',CURRENT_RECORD,VISUAL_ATTRIBUTE,'LOCAL_HIGHLITE_TEXT');
--
  SET_GROUP_CHAR_CELL('SELECTION.NAME',       rg_row, name_in('GURMENU.GURMENU_NAME'));
  SET_GROUP_CHAR_CELL('SELECTION.OBJ_NAME',   rg_row, :GUBOBJS.GUBOBJS_NAME);
  SET_GROUP_CHAR_CELL('SELECTION.OBJT_CODE',  rg_row, :GUBOBJS.GUBOBJS_OBJT_CODE);   
  SET_GROUP_CHAR_CELL('SELECTION.INDICATOR',  rg_row, 'Y');
  SET_GROUP_NUMBER_CELL('SELECTION.TRIG_REC', rg_row, :SYSTEM.TRIGGER_RECORD);
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBOBJS.ADD_TO_MRC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="ADD_TO_MRC")
		public void gubobjs_AddToMrc()
		{
			
			
				GubobjsAdapter gubobjsElement = (GubobjsAdapter)this.getFormModel().getGubobjs().getRowAdapter(true);

				if(gubobjsElement!=null){

				{
					ValueSet rgId = findGroup("SELECTION");
					NNumber rgRow= NNumber.getNull();
					// 
					NString blockName = getCursorBlock();
					//WARNING: only adding rows at the end is supported
					addGroupRow(rgId);
					rgRow = toNumber(getGroupRowCount(rgId));
					// 
//					setItemStyleClass("GUBOBJS.GUBOBJS_NAME", ItemServices.CURRENT_RECORD, "LOCAL_HIGHLITE_TEXT");
//					setItemStyleClass("GUBOBJS.GUBOBJS_DESC", ItemServices.CURRENT_RECORD, "LOCAL_HIGHLITE_TEXT");
					// 
					setGroupCharCell("SELECTION.NAME", rgRow, getNameIn("GURMENU.GURMENU_NAME"));
					setGroupCharCell("SELECTION.OBJ_NAME", rgRow, gubobjsElement.getGubobjsName());
					setGroupCharCell("SELECTION.OBJT_CODE", rgRow, gubobjsElement.getGubobjsObjtCode());
					setGroupCharCell("SELECTION.INDICATOR", rgRow, toStr("Y"));
					setGroupNumberCell("SELECTION.TRIG_REC", rgRow, toNumber(getTriggerRecord()));
				}
			}
		}
		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBOBJS.PRE-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeQuery
		public void gubobjs_BeforeQuery(QueryEvent args)
		{
			
               // F2J_WARNING : Query Parameters initialization. Make sure that all the query parameters are properly initialized

				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("FORM_HEADER_OBJECT_TYPE", this.getFormModel().getFormHeader().getObjectType()));             


           
               }

		
	
	
}

