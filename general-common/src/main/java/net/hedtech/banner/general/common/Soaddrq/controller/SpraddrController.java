package net.hedtech.banner.general.common.Soaddrq.controller;
 
import java.util.*;
import morphis.core.utils.behavior.annotations.After;
import morphis.core.utils.behavior.annotations.Before;
			
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

import net.hedtech.banner.general.common.Soaddrq.model.*;
import net.hedtech.banner.general.common.Soaddrq.*;
import net.hedtech.banner.general.common.Soaddrq.services.*;

import net.hedtech.general.common.libraries.Goqolib.services.GIconBtnClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GDescClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GDateClass;	
		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class SpraddrController extends DefaultBlockController {

	private GIconBtnClass getGIconBtnClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GIconBtnClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_ICON_BTN_CLASS");
	}	
	private GDescClass getGDescClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GDescClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_DESC_CLASS");
	}	
	private GDateClass getGDateClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GDateClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_DATE_CLASS");
	}	

	
	public SpraddrController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
		
	@Override
	public SoaddrqTask getTask() {
		return (SoaddrqTask)super.getTask();
	}

	public SoaddrqModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
		/* Original PL/SQL code code for TRIGGER SPRADDR.PRE-INSERT
		    MESSAGE (  G$_NLS.Get('SOADDRQ-0004', 'FORM','*ERROR* Cannot create record, query-only form.')  )
      ;
   RAISE FORM_TRIGGER_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowInsert
		public void spraddr_BeforeRowInsert(RowAdapterEvent args)
		{
			
				errorMessage(GNls.Fget(toStr("SOADDRQ-0004"), toStr("FORM"), toStr("*ERROR* Cannot create record, query-only form.")));
				throw new ApplicationException();
			}

		
		/* Original PL/SQL code code for TRIGGER SPRADDR.PRE-DELETE
		    MESSAGE (  G$_NLS.Get('SOADDRQ-0005', 'FORM','*ERROR* Cannot delete record, query-only form.')  )
      ;
   RAISE FORM_TRIGGER_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.PRE-DELETE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowDelete
		public void spraddr_BeforeRowDelete(RowAdapterEvent args)
		{
			
				errorMessage(GNls.Fget(toStr("SOADDRQ-0005"), toStr("FORM"), toStr("*ERROR* Cannot delete record, query-only form.")));
				throw new ApplicationException();
			}

		
		/* Original PL/SQL code code for TRIGGER SPRADDR.KEY-CREREC
		    EXECUTE_TRIGGER( 'INVALID_FUNCTION_MSG' ) ;
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.KEY-CREREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CREREC", function=KeyFunction.CREATE_RECORD)
		public void spraddr_CreateRecord()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SPRADDR.KEY-CLRREC
		    EXECUTE_TRIGGER( 'INVALID_FUNCTION_MSG' ) ;
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.KEY-CLRREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRREC", function=KeyFunction.CLEAR_RECORD)
		public void spraddr_ClearRecord()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SPRADDR.KEY-DELREC
		    EXECUTE_TRIGGER( 'INVALID_FUNCTION_MSG' ) ;
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.KEY-DELREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DELREC", function=KeyFunction.DELETE_RECORD)
		public void spraddr_DeleteRecord()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SPRADDR.KEY-NXTBLK
		    EXECUTE_TRIGGER( 'INVALID_FUNCTION_MSG' ) ;
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void spraddr_NextBlock()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SPRADDR.KEY-PRVBLK
		    EXECUTE_TRIGGER( 'INVALID_FUNCTION_MSG' ) ;
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void spraddr_PreviousBlock()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SPRADDR.WHEN-NEW-RECORD-INSTANCE
		   :GLOBAL.ADDRESS_SEQN := :SPRADDR_SEQNO;
  G$_CHECK_FAILURE ;
   IF :SPRADDR_ATYP_CODE IS NULL  THEN
      PREVIOUS_RECORD ;
      G$_CHECK_FAILURE ;
      MESSAGE (  G$_NLS.Get('SOADDRQ-0006', 'FORM','At last record.')  ) ;
   END IF ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.WHEN-NEW-RECORD-INSTANCE
		 *
		 *
		 *</p>
		*/

		@After
		@ActionTrigger(action="WHEN-NEW-RECORD-INSTANCE", function=KeyFunction.RECORD_CHANGE)
		public void spraddr_recordChange()
		{
			
				SpraddrAdapter spraddrElement = (SpraddrAdapter)this.getFormModel().getSpraddr().getRowAdapter(true);

				if (spraddrElement == null) return;

				setGlobal("ADDRESS_SEQN", toStr(spraddrElement.getSpraddrSeqno()));
				getTask().getGoqrpls().gCheckFailure();
				if ( spraddrElement.getSpraddrAtypCode().isNull() )
				{
					previousRecord();
					getTask().getGoqrpls().gCheckFailure();
					infoMessage(GNls.Fget(toStr("SOADDRQ-0006"), toStr("FORM"), toStr("At last record.")));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SPRADDR.KEY-ENTQRY
		 SET_ITEM_PROPERTY('SPRADDR_ASRC_CODE_LBT',ENABLED, PROPERTY_TRUE);
ENTER_QUERY;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.KEY-ENTQRY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-ENTQRY", function=KeyFunction.SEARCH)
		public void spraddr_Search()
		{
			
				setItemEnabled("SPRADDR_ASRC_CODE_LBT", true);
				enterQuery();
			}

		
		/* Original PL/SQL code code for TRIGGER SPRADDR.KEY-EXEQRY
		 SET_ITEM_PROPERTY('SPRADDR_ASRC_CODE_LBT',ENABLED, PROPERTY_FALSE);
EXECUTE_QUERY;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.KEY-EXEQRY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-EXEQRY", function=KeyFunction.EXECUTE_QUERY)
		public void spraddr_ExecuteQuery()
		{
			
				setItemEnabled("SPRADDR_ASRC_CODE_LBT", false);
				executeQuery();
			}

		
		/* Original PL/SQL code code for TRIGGER SPRADDR_ATYP_CODE.WHEN-MOUSE-DOUBLECLICK
		 BEGIN
  G$_MOUSE_DOUBLECLICK;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_ATYP_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SPRADDR_ATYP_CODE")
		public void spraddrAtypCode_doubleClick()
		{
			
				getTask().getGoqrpls().gMouseDoubleclick();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_ATYP_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SPRADDR_ATYP_CODE_LBT")
		public void spraddrAtypCodeLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER SPRADDR_ATYP_CODE_LBT.WHEN-BUTTON-PRESSED
		 BEGIN
  G$_DISPLAY_LOV('','');
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_ATYP_CODE_LBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="SPRADDR_ATYP_CODE_LBT")
		public void spraddrAtypCodeLbt_buttonClick()
		{
			
				getTask().getGoqrpls().gDisplayLov(toStr(""), toStr(""));
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SPRADDR_ASRC_CODE.WHEN-MOUSE-DOUBLECLICK
		 BEGIN
  G$_DISPLAY_LOV('','');
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_ASRC_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SPRADDR_ASRC_CODE")
		public void spraddrAsrcCode_doubleClick()
		{
			
				getTask().getGoqrpls().gDisplayLov(toStr(""), toStr(""));
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_ASRC_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SPRADDR_ASRC_CODE_LBT")
		public void spraddrAsrcCodeLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER SPRADDR_ASRC_CODE_LBT.WHEN-BUTTON-PRESSED
		 BEGIN
  G$_DISPLAY_LOV('','');
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_ASRC_CODE_LBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="SPRADDR_ASRC_CODE_LBT")
		public void spraddrAsrcCodeLbt_buttonClick()
		{
			
				getTask().getGoqrpls().gDisplayLov(toStr(""), toStr(""));
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SPRADDR_NATN_CODE.POST-CHANGE
		 DECLARE CURSOR NATN_CURSOR IS
   SELECT STVNATN_NATION
   FROM   STVNATN
   WHERE  STVNATN_CODE = :SPRADDR_NATN_CODE;
BEGIN
   OPEN NATN_CURSOR;
   FETCH NATN_CURSOR INTO :NATN_DESC;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_NATN_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="SPRADDR_NATN_CODE")
		public void spraddrNatnCode_PostChange()
		{
			

				SpraddrAdapter spraddrElement = (SpraddrAdapter)this.getFormModel().getSpraddr().getRowAdapter(true);

				if (spraddrElement == null) return;
				
				int rowCount = 0;
				if(spraddrElement.getSpraddrNatnCode().isNull())
		return;
				{
					String sqlnatnCursor = "SELECT STVNATN_NATION " +
	" FROM STVNATN " +
	" WHERE STVNATN_CODE = :SPRADDR_NATN_CODE ";
					DataCursor natnCursor = new DataCursor(sqlnatnCursor);
					try {
						//Setting query parameters
						natnCursor.addParameter("SPRADDR_NATN_CODE", spraddrElement.getSpraddrNatnCode());
						natnCursor.open();
						ResultSet natnCursorResults = natnCursor.fetchInto();
						if ( natnCursorResults != null ) {
							spraddrElement.setNatnDesc(natnCursorResults.getStr(0));
						}
					}
					finally{
						natnCursor.close();
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * NATN_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="NATN_DESC", function=KeyFunction.ITEM_CHANGE)
		public void natnDesc_itemChange()
		{
			
				getGDescClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_FROM_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SPRADDR_FROM_DATE", function=KeyFunction.NEXT_ITEM)
		public void spraddrFromDate_keyNexItem()
		{
			
				getGDateClass().nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_FROM_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SPRADDR_FROM_DATE", function=KeyFunction.ITEM_CHANGE)
		public void spraddrFromDate_itemChange()
		{
			
				getGDateClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_FROM_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SPRADDR_FROM_DATE", function=KeyFunction.ITEM_OUT)
		public void spraddrFromDate_itemOut()
		{
			
				getGDateClass().itemOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_TO_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SPRADDR_TO_DATE", function=KeyFunction.NEXT_ITEM)
		public void spraddrToDate_keyNexItem()
		{
			
				getGDateClass().nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_TO_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SPRADDR_TO_DATE", function=KeyFunction.ITEM_CHANGE)
		public void spraddrToDate_itemChange()
		{
			
				getGDateClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_TO_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SPRADDR_TO_DATE", function=KeyFunction.ITEM_OUT)
		public void spraddrToDate_itemOut()
		{
			
				getGDateClass().itemOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_NATN_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SPRADDR_NATN_CODE")
		public void spraddrNatnCode_validate()
		{
			
				SpraddrAdapter spraddrElement = (SpraddrAdapter)this.getFormModel().getSpraddr().getRowAdapter(true);
							this.spraddrNatnCode_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void spraddr_AfterQuery(RowAdapterEvent args)
		{
			
			SpraddrAdapter spraddrElement = (SpraddrAdapter)args.getRow();			
						
				try {
				spraddrElement.setLockDbValues(true);
				try { 
				this.spraddrNatnCode_PostChange();
				} catch(Exception ex) {
				}
			
						} finally {
							spraddrElement.setLockDbValues(false);
						}
						

		}
		
		@BeforeQuery
		public void spraddr_BeforeQuery(QueryEvent args)
		{
			((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("KEY_BLOCK.PIDM", this.getFormModel().getKeyBlock().getPidm()));
		}

		
	
	
}

