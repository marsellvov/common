package net.hedtech.banner.general.common.Soaiden.controller;
 
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

import net.hedtech.banner.general.common.Soaiden.model.*;
import net.hedtech.banner.general.common.Soaiden.*;
import net.hedtech.banner.general.common.Soaiden.services.*;

import net.hedtech.general.common.libraries.Goqolib.services.GDateClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GCodeClass;	
		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class SpridenController extends DefaultBlockController {

	private GDateClass getGDateClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GDateClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_DATE_CLASS");
	}	
	private GCodeClass getGCodeClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GCodeClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_CODE_CLASS");
	}	

	
	public SpridenController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
		
	@Override
	public SoaidenTask getTask() {
		return (SoaidenTask)super.getTask();
	}

	public SoaidenModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
		/* Original PL/SQL code code for TRIGGER SPRIDEN.POST-QUERY
		    DECLARE
      CURSOR PTI_CURSOR IS
         SELECT SPBPERS_BIRTH_DATE
         FROM   SPBPERS
         WHERE  SPBPERS_PIDM = :SPRIDEN_PIDM ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO :BIRTHDATE ;
   END ;
   

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void spriden_AfterQuery(RowAdapterEvent args)
		{
			
				SpridenAdapter spridenElement = (SpridenAdapter)args.getRow();


				int rowCount = 0;
				{
					String sqlptiCursor = "SELECT SPBPERS_BIRTH_DATE " +
	" FROM SPBPERS " +
	" WHERE SPBPERS_PIDM = :SPRIDEN_PIDM ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//Setting query parameters
						ptiCursor.addParameter("SPRIDEN_PIDM", spridenElement.getSpridenPidm());
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							spridenElement.setBirthdate(ptiCursorResults.getDate(0));
						}
					}
					finally{
						ptiCursor.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SPRIDEN.KEY-CLRBLK
		 EXECUTE_TRIGGER('INVALID_FUNCTION_MSG');
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN.KEY-CLRBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRBLK", function=KeyFunction.CLEAR_BLOCK)
		public void spriden_keyClearBlock()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SPRIDEN.KEY-CLRREC
		 EXECUTE_TRIGGER('INVALID_FUNCTION_MSG');
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN.KEY-CLRREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRREC", function=KeyFunction.CLEAR_RECORD)
		public void spriden_ClearRecord()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SPRIDEN.KEY-CQUERY
		 IF STUDENT_INSTALLED 
THEN 
  -- EXECUTE_TRIGGER('DETAIL_BTN_TRIG'); <multilinecomment>Defect 1-Z507V5 </multilinecomment>

  :GLOBAL.KEY_IDNO := :SPRIDEN_ID ;

  -- DEFAULT_VALUE( 'S', 'GLOBAL.PRODUCT_IND' ) ;

   IF :GLOBAL.PRODUCT_IND = 'A' THEN
      EXECUTE_TRIGGER('SAVE_KEYS');
      :GLOBAL.SECRFRM := 'APASBIO';
       EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
       G$_CHECK_FAILURE;
       G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER,:GLOBAL.SECRFRM, 'QUERY');
   ELSIF :GLOBAL.PRODUCT_IND = 'S' THEN
      GOTO CALL_SOAIDNS ;
   ELSE
      --MESSAGE ( 'No Additional Information available.' ) ;
      MESSAGE(g$_nls.get('SOAIDEN-0002','FORM','No Additional Information available'));
      RETURN ;
   END IF ;

   RETURN ;

   << CALL_SOAIDNS >>
   :GLOBAL.LAST_NAME := :SPRIDEN_LAST_NAME ;
   :GLOBAL.FIRST_NAME := :SPRIDEN_FIRST_NAME ;
   :GLOBAL.SECRFRM := 'SOAIDNS';
   :GLOBAL.SOAIDNS_CALL := 'Y' ;  <multilinecomment>Defect 1-Z507V5 </multilinecomment>
   EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
   G$_CHECK_FAILURE;
   G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER,:GLOBAL.SECRFRM, 'QUERY');
   G$_CHECK_FAILURE ;
   :GLOBAL.SOAIDNS_CALL := '' ;   <multilinecomment>Defect 1-Z507V5 </multilinecomment>
   IF :GLOBAL.VALUE IS NOT NULL THEN
      EXIT_FORM;
   END IF;
ELSE
   EXECUTE_TRIGGER( 'INVALID_FUNCTION_MSG' ) ;
   G$_CHECK_FAILURE ;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN.KEY-CQUERY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CQUERY", function=KeyFunction.COUNT_QUERY)
		public void spriden_TotalResults()
		{
			

				SpridenAdapter spridenElement = (SpridenAdapter)this.getFormModel().getSpriden().getRowAdapter(true);

				if(spridenElement!=null){
					if ( this.getTask().getServices().studentInstalled().getValue() )
					{
						//  EXECUTE_TRIGGER('DETAIL_BTN_TRIG'); /*Defect 1-Z507V5 */
						setGlobal("KEY_IDNO", spridenElement.getSpridenId());
						//  DEFAULT_VALUE( 'S', 'GLOBAL.PRODUCT_IND' ) ;
						if ( getGlobal("PRODUCT_IND").equals("A") )
						{
							executeAction("SAVE_KEYS");
							setGlobal("SECRFRM", toStr("APASBIO"));
							executeAction("G$_REVOKE_ACCESS");
							getTask().getGoqrpls().gCheckFailure();
							getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), getGlobal("SECRFRM"), toStr("QUERY"));
						}
						else if ( getGlobal("PRODUCT_IND").equals("S") ) {
							 goto_Call_Soaidns(spridenElement);
						}
						else {
							// MESSAGE ( 'No Additional Information available.' ) ;
							infoMessage(GNls.Fget(toStr("SOAIDEN-0002"), toStr("FORM"), toStr("No Additional Information available")));
							return ;
						}
						return ;
					}
					else {
						executeAction("INVALID_FUNCTION_MSG");
						getTask().getGoqrpls().gCheckFailure();
					}
				}
			}
		private void goto_Call_Soaidns(SpridenAdapter spridenElement) {
			//CALL_SOAIDNS:;
			setGlobal("LAST_NAME", spridenElement.getSpridenLastName());
			setGlobal("FIRST_NAME", spridenElement.getSpridenFirstName());
			setGlobal("SECRFRM", toStr("SOAIDNS"));
			setGlobal("SOAIDNS_CALL", toStr("Y"));
			// Defect 1-Z507V5 
			executeAction("G$_REVOKE_ACCESS");
			getTask().getGoqrpls().gCheckFailure();
			getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), getGlobal("SECRFRM"), toStr("QUERY"));
			getTask().getGoqrpls().gCheckFailure();
			setGlobal("SOAIDNS_CALL", toStr(""));
			// Defect 1-Z507V5 
			if ( !getGlobal("VALUE").isNull() )
			{
				exitTask();
			}
		}

		
		/* Original PL/SQL code code for TRIGGER SPRIDEN.KEY-PRVBLK
		    EXECUTE_TRIGGER( 'INVALID_FUNCTION_MSG' ) ;
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void spriden_PreviousBlock()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SPRIDEN.POST-BLOCK
		 :CHECK_KEYS := 'Y';
-- G$_SETMENU('MAIN.OPTIONS',0);
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN.POST-BLOCK
		 *
		 *
		 *</p>
		*/

		@After
		@ActionTrigger(action="POST-BLOCK", function=KeyFunction.BLOCK_OUT)
		public void spriden_blockOut()
		{
			
				getFormModel().getButtonControlBlock().setCheckKeys(toStr("Y"));
			}

		
		/* Original PL/SQL code code for TRIGGER SPRIDEN.KEY-ENTQRY
		 G$_IDNAME_SEARCH.ENTER_QUERY_STATUS;
   EXECUTE_TRIGGER('DISABLE_DETAIL_BTN_TRIG');
   ENTER_QUERY;
   EXECUTE_TRIGGER('ENABLE_DETAIL_BTN_TRIG');

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN.KEY-ENTQRY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-ENTQRY", function=KeyFunction.SEARCH)
		public void spriden_Search()
		{
			
				getTask().getGoqrpls().getGIdnameSearch().enterQueryStatus();
				executeAction("DISABLE_DETAIL_BTN_TRIG");
				enterQuery();
				executeAction("ENABLE_DETAIL_BTN_TRIG");
			}

		
		/* Original PL/SQL code code for TRIGGER SPRIDEN.KEY-EXEQRY
		 IF :SYSTEM.MODE <> 'ENTER-QUERY' THEN
   MESSAGE( G$_NLS.Get('SOAIDEN-0003', 'FORM','*ERROR* Press Enter Query to define query criteria.') );
   RAISE FORM_TRIGGER_FAILURE;
ELSE
   IF (:SPRIDEN.SPRIDEN_ID IS NULL AND
       :SPRIDEN.SPRIDEN_LAST_NAME IS NULL AND
       :SPRIDEN.SPRIDEN_FIRST_NAME IS NULL AND
       :SPRIDEN.SPRIDEN_MI IS NULL AND
       :SPRIDEN.SPRIDEN_CHANGE_IND IS NULL AND
       :SPRIDEN.SPRIDEN_NTYP_CODE IS NULL) THEN
      MESSAGE( G$_NLS.Get('SOAIDEN-0004', 'FORM','*ERROR* Define query criteria, then press EXECUTE QUERY.') );
      RAISE FORM_TRIGGER_FAILURE;
   ELSE
      EXECUTE_QUERY;
   END IF;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN.KEY-EXEQRY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-EXEQRY", function=KeyFunction.EXECUTE_QUERY)
		public void spriden_ExecuteQuery()
		{
			

				SpridenAdapter spridenElement = (SpridenAdapter)this.getFormModel().getSpriden().getRowAdapter(true);

				if(spridenElement==null){
					return;
				}
				if ( !getMode().equals("ENTER-QUERY") )
				{
					errorMessage(GNls.Fget(toStr("SOAIDEN-0003"), toStr("FORM"), toStr("*ERROR* Press Enter Query to define query criteria.")));
					throw new ApplicationException();
				}
				else {
					if ((spridenElement.getSpridenId().isNull() && spridenElement.getSpridenLastName().isNull() && spridenElement.getSpridenFirstName().isNull() && spridenElement.getSpridenMi().isNull() && spridenElement.getSpridenChangeInd().isNull() && spridenElement.getSpridenNtypCode().isNull()))
					{
						errorMessage(GNls.Fget(toStr("SOAIDEN-0004"), toStr("FORM"), toStr("*ERROR* Define query criteria, then press EXECUTE QUERY.")));
						throw new ApplicationException();
					}
					else {
						executeQuery();
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN.PRE-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeQuery
		public void spriden_BeforeQuery(QueryEvent args)
		{


				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("GLOBAL_SEARCH_ID", getGlobal("search_id")));             


				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("SOUNDEX_LAST_NAME", this.getFormModel().getSoundex().getSoundexLastName()));             


				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("GLOBAL_LAST_NAME", getGlobal("last_name")));             


				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("SOUNDEX_FIRST_NAME", this.getFormModel().getSoundex().getSoundexFirstName()));             


				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("GLOBAL_FIRST_NAME", getGlobal("first_name")));             


				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("GLOBAL_MID_NAME", getGlobal("mid_name")));             


           
               }

		
		/* Original PL/SQL code code for TRIGGER SPRIDEN_ID.WHEN-NEW-ITEM-INSTANCE
		 null;
<multilinecomment> 
IF :System.Cursor_item = 'SPRIDEN.SPRIDEN_ID'
 AND :System.mode = 'ENTER-QUERY'
THEN	
   MESSAGE ('Enter a query;  press F12 to execute, PF4  to cancel.');
END IF;
--
IF :System.Cursor_item = 'SPRIDEN.SPRIDEN_ID'
 AND :System.mode <> 'ENTER-QUERY'
 AND :SPRIDEN.SPRIDEN_ID IS NOT NULL
THEN
   MESSAGE ('Identification Number; press COUNT QUERY HITS to access additional information., no_acknowledge');
END IF; </multilinecomment>
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_ID.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SPRIDEN_ID", function=KeyFunction.ITEM_CHANGE)
		public void spridenId_itemChange()
		{
			
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * BIRTHDATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="BIRTHDATE", function=KeyFunction.NEXT_ITEM)
		public void birthdate_keyNexItem()
		{
			
				getGDateClass().nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * BIRTHDATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="BIRTHDATE", function=KeyFunction.ITEM_CHANGE)
		public void birthdate_itemChange()
		{
			
				getGDateClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * BIRTHDATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="BIRTHDATE", function=KeyFunction.ITEM_OUT)
		public void birthdate_itemOut()
		{
			
				getGDateClass().itemOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_NTYP_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SPRIDEN_NTYP_CODE")
		public void spridenNtypCode_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_NTYP_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SPRIDEN_NTYP_CODE", function=KeyFunction.ITEM_CHANGE)
		public void spridenNtypCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_NTYP_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="SPRIDEN_NTYP_CODE")
		public void spridenNtypCode_GSearchParameters()
		{
			
				getGCodeClass().gSearchParameters();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_NTYP_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="SPRIDEN_NTYP_CODE")
		public void spridenNtypCode_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_NTYP_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SPRIDEN_NTYP_CODE", function=KeyFunction.NEXT_ITEM)
		public void spridenNtypCode_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_NTYP_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SPRIDEN_NTYP_CODE", function=KeyFunction.ITEM_OUT)
		public void spridenNtypCode_itemOut()
		{
			
				getGCodeClass().itemOut();
			}

		
	
	
}

