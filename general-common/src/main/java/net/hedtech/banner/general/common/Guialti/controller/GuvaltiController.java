package net.hedtech.banner.general.common.Guialti.controller;
 
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
import net.hedtech.banner.general.common.Guialti.model.*;
import net.hedtech.banner.general.common.Guialti.*;
import net.hedtech.banner.general.common.Guialti.services.*;
import net.hedtech.general.common.libraries.Goqolib.services.GDateClass;	
		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class GuvaltiController extends DefaultBlockController {

	private GDateClass getGDateClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GDateClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_DATE_CLASS");
	}	

	
	public GuvaltiController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
		
	@Override
	public GuialtiTask getTask() {
		return (GuialtiTask)super.getTask();
	}

	public GuialtiModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
		/* Original PL/SQL code code for TRIGGER GUVALTI.KEY-CLRBLK
		 EXECUTE_TRIGGER('INVALID_FUNCTION_MSG');
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUVALTI.KEY-CLRBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRBLK", function=KeyFunction.CLEAR_BLOCK)
		public void guvalti_keyClearBlock()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GUVALTI.KEY-CQUERY
		 BEGIN
  Count_Query;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUVALTI.KEY-CQUERY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CQUERY", function=KeyFunction.COUNT_QUERY)
		public void guvalti_TotalResults()
		{
				
			}

		
		/* Original PL/SQL code code for TRIGGER GUVALTI.KEY-CLRREC
		 EXECUTE_TRIGGER('INVALID_FUNCTION_MSG');
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUVALTI.KEY-CLRREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRREC", function=KeyFunction.CLEAR_RECORD)
		public void guvalti_ClearRecord()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GUVALTI.KEY-PRVBLK
		    EXECUTE_TRIGGER( 'INVALID_FUNCTION_MSG' ) ;
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUVALTI.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void guvalti_PreviousBlock()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GUVALTI.KEY-ENTQRY
		 -- G$_IDNAME_SEARCH.ENTER_QUERY_STATUS;
--   EXECUTE_TRIGGER('DISABLE_DETAIL_BTN_TRIG');
ENTER_QUERY;
--   EXECUTE_TRIGGER('ENABLE_DETAIL_BTN_TRIG');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUVALTI.KEY-ENTQRY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-ENTQRY", function=KeyFunction.SEARCH)
		public void guvalti_Search()
		{
				enterQuery();
			}

		
		/* Original PL/SQL code code for TRIGGER GUVALTI.KEY-EXEQRY
		 IF :SYSTEM.MODE <> 'ENTER-QUERY' THEN
   MESSAGE( G$_NLS.Get('GUIALTI-0004', 'FORM','*ERROR* Press Enter Query to define query criteria.') );
   RAISE FORM_TRIGGER_FAILURE;
ELSE
   EXECUTE_QUERY;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUVALTI.KEY-EXEQRY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-EXEQRY", function=KeyFunction.EXECUTE_QUERY)
		public void guvalti_ExecuteQuery()
		{
					executeQuery();
			}

		
		/* Original PL/SQL code code for TRIGGER GUVALTI.POST-QUERY
		 DECLARE
   CURSOR PTI_CURSOR IS
      SELECT TO_CHAR(GUVALTI_BIRTH_DATE , G$_DATE.GET_NLS_DATE_FORMAT)
      FROM   GUVALTI
      WHERE  GUVALTI_PIDM = :GUVALTI_PIDM ;
BEGIN
   OPEN PTI_CURSOR ;
   FETCH PTI_CURSOR INTO :GUVALTI_SHOW_BIRTHDAY ;
   CLOSE PTI_CURSOR;
END ;



		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUVALTI.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeQuery
		public void guvalti_BeforeQuery(QueryEvent args)
		{
				
                GuvaltiAdapter guvaltiElement = ( GuvaltiAdapter ) this.getFormModel().getGuvalti().getRowAdapter(true);    
                
                if( guvaltiElement ==null)
                							return;
				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("GUVALTI_PIDM", guvaltiElement.getGuvaltiPidm())); }     
				
		@AfterQuery
		public void guvalti_AfterQuery(RowAdapterEvent args)
		{
			
				GuvaltiAdapter guvaltiElement = (GuvaltiAdapter)args.getRow();


				int rowCount = 0;
				{
					String sqlptiCursor = "SELECT TO_CHAR(GUVALTI_BIRTH_DATE, G$_DATE.GET_NLS_DATE_FORMAT) " +
	" FROM GUVALTI " +
	" WHERE GUVALTI_PIDM = :GUVALTI_PIDM ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						ptiCursor.addParameter("GUVALTI_PIDM", guvaltiElement.getGuvaltiPidm());
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							guvaltiElement.setGuvaltiShowBirthday(ptiCursorResults.getStr(0));
						}
					}
					finally{
						ptiCursor.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GUVALTI_SSN.WHEN-NEW-ITEM-INSTANCE
		 null;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUVALTI_SSN.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="GUVALTI_SSN", function=KeyFunction.ITEM_CHANGE)
		public void guvaltiSsn_itemChange()
		{
			getGDateClass().itemChange();
			}

		
		/* Original PL/SQL code code for TRIGGER GUVALTI_ID.WHEN-NEW-ITEM-INSTANCE
		 null;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUVALTI_ID.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="GUVALTI_ID", function=KeyFunction.ITEM_CHANGE)
		public void guvaltiId_itemChange()
		{
			getGDateClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUVALTI_SHOW_BIRTHDAY.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="GUVALTI_SHOW_BIRTHDAY", function=KeyFunction.NEXT_ITEM)
		public void guvaltiShowBirthday_keyNexItem()
		{
			
				getGDateClass().nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUVALTI_SHOW_BIRTHDAY.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="GUVALTI_SHOW_BIRTHDAY", function=KeyFunction.ITEM_CHANGE)
		public void guvaltiShowBirthday_itemChange()
		{
			
				getGDateClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUVALTI_SHOW_BIRTHDAY.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="GUVALTI_SHOW_BIRTHDAY", function=KeyFunction.ITEM_OUT)
		public void guvaltiShowBirthday_itemOut()
		{
			
				getGDateClass().itemOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUVALTI_BIRTH_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="GUVALTI_BIRTH_DATE", function=KeyFunction.NEXT_ITEM)
		public void guvaltiBirthDate_keyNexItem()
		{
			
				getGDateClass().nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUVALTI_BIRTH_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="GUVALTI_BIRTH_DATE", function=KeyFunction.ITEM_CHANGE)
		public void guvaltiBirthDate_itemChange()
		{
			
				getGDateClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUVALTI_BIRTH_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="GUVALTI_BIRTH_DATE", function=KeyFunction.ITEM_OUT)
		public void guvaltiBirthDate_itemOut()
		{
			
				getGDateClass().itemOut();
			}

		
	
	
}

