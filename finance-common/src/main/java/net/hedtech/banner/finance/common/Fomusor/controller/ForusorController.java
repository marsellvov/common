package net.hedtech.banner.finance.common.Fomusor.controller;
 
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
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Foqrpls.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.banner.finance.common.Fomusor.model.*;
import net.hedtech.banner.finance.common.Fomusor.*;
import net.hedtech.banner.finance.common.Fomusor.services.*;
import net.hedtech.general.common.libraries.Goqolib.services.GCodeClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GDescClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GDateClass;	

		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class ForusorController extends DefaultBlockController {

	private GCodeClass getGCodeClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GCodeClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_CODE_CLASS");
	}	
	private GDescClass getGDescClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GDescClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_DESC_CLASS");
	}	
	private GDateClass getGDateClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GDateClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_DATE_CLASS");
	}	

	
	public ForusorController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
		
	@Override
	public FomusorTask getTask() {
		return (FomusorTask)super.getTask();
	}

	public FomusorModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
		/* Original PL/SQL code code for TRIGGER FORUSOR.PRE-INSERT
		    :FORUSOR.FORUSOR_ACTIVITY_DATE :=
    TO_DATE(:CURRENT_DATE,G$_DATE.GET_NLS_DATE_FORMAT) ;
--
   :FORUSOR.FORUSOR_USER_ID := :CURRENT_USER1 ;
--
BEGIN
   G$_CHECK_QUERY_MODE ;
--
  DECLARE
      CURSOR PTI_CURSOR IS
         SELECT 'X'
         FROM   FORUSOR 
         WHERE  FORUSOR_USER_ID_ENTERED = :USER_ID 
         AND    FORUSOR_COAS_CODE       = :FORUSOR.FORUSOR_COAS_CODE
         AND    FORUSOR_ORGN_CODE       = :FORUSOR.FORUSOR_ORGN_CODE ;   
  BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO :ORGN_TITLE ;
      G$_CHECK_VALUE (PTI_CURSOR%FOUND,
          G$_NLS.Get('FOMUSOR-0015', 'FORM','The organization exists in the User Id.') ,
         TRUE);
  END ;
--
   :GLOBAL.QUERY_MODE := '0' ;
  EXCEPTION
   WHEN FORM_TRIGGER_FAILURE THEN
      :GLOBAL.QUERY_MODE := '0' ;
      RAISE FORM_TRIGGER_FAILURE ;
END ;
--
IF :FORUSOR.FORUSOR_COAS_CODE  IS NULL THEN  
   BEGIN
   G$_CHECK_QUERY_MODE ;
--
   DECLARE
      CURSOR PTI_CURSOR IS
         SELECT 'X'
         FROM   FTVCOAS
         WHERE  FTVCOAS_COAS_CODE = :FORUSOR.FORUSOR_COAS_CODE ;
    BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO :ORGN_TITLE ;
      G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND,
          G$_NLS.Get('FOMUSOR-0016', 'FORM','Invalid chart of account; press LIST for valid id.') ,
         TRUE);
   END ;
--
   :GLOBAL.QUERY_MODE := '0' ;
  EXCEPTION
   WHEN FORM_TRIGGER_FAILURE THEN
      :GLOBAL.QUERY_MODE := '0' ;
      RAISE FORM_TRIGGER_FAILURE ;
  END ;
END IF; 
--
IF :FORUSOR.FORUSOR_ORGN_CODE  IS NULL THEN  
   BEGIN
   G$_CHECK_QUERY_MODE ;
--
   DECLARE
      CURSOR PTI_CURSOR IS
         SELECT FTVORGN_TITLE
         FROM   FTVORGN
         WHERE  FTVORGN_COAS_CODE = :FORUSOR.FORUSOR_COAS_CODE
           AND  FTVORGN_ORGN_CODE = :FORUSOR.FORUSOR_ORGN_CODE ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO :ORGN_TITLE ;
      G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND,
          G$_NLS.Get('FOMUSOR-0017', 'FORM','Invalid orgainization; press LIST for valid id.') ,
         TRUE);
   END ;
--
   :GLOBAL.QUERY_MODE := '0' ;
  EXCEPTION
   WHEN FORM_TRIGGER_FAILURE THEN
      :GLOBAL.QUERY_MODE := '0' ;
      RAISE FORM_TRIGGER_FAILURE ;
  END ;
END IF; 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FORUSOR.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowInsert
		public void forusor_BeforeRowInsert(RowAdapterEvent args)
		{
			
				ForusorAdapter forusorElement = (ForusorAdapter)args.getRow();


				int rowCount = 0;
				forusorElement.setForusorActivityDate(toDate(getFormModel().getFormHeader().getCurrentDate(), GDate.getNlsDateFormat()));
				// 
				forusorElement.setForusorUserId(getFormModel().getFormHeader().getCurrentUser1());
				try
				{
					getTask().getGoqrpls().gCheckQueryMode();
					{
						String sqlptiCursor = "SELECT 'X' " +
	" FROM FORUSOR " +
	" WHERE FORUSOR_USER_ID_ENTERED = :USER_ID AND FORUSOR_COAS_CODE = :FORUSOR_FORUSOR_COAS_CODE AND FORUSOR_ORGN_CODE = :FORUSOR_FORUSOR_ORGN_CODE ";
						DataCursor ptiCursor = new DataCursor(sqlptiCursor);
						try {
							//Setting query parameters
							ptiCursor.addParameter("USER_ID", getFormModel().getKeyBlock().getUserId());
							ptiCursor.addParameter("FORUSOR_FORUSOR_COAS_CODE", forusorElement.getForusorCoasCode());
							ptiCursor.addParameter("FORUSOR_FORUSOR_ORGN_CODE", forusorElement.getForusorOrgnCode());
							ptiCursor.open();
							ResultSet ptiCursorResults = ptiCursor.fetchInto();
							if ( ptiCursorResults != null ) {
								forusorElement.setOrgnTitle(ptiCursorResults.getStr(0));
							}
							getTask().getGoqrpls().gCheckValue(toBool(ptiCursor.found()), GNls.Fget(toStr("FOMUSOR-0015"), toStr("FORM"), toStr("The organization exists in the User Id.")), toBool(NBool.True));
						}
						finally{
							ptiCursor.close();
						}
					}
					// 
					setGlobal("QUERY_MODE", toStr("0"));
				}
				catch(ApplicationException e)
				{
					setGlobal("QUERY_MODE", toStr("0"));
					throw new ApplicationException();
				}
				// 
				if ( forusorElement.getForusorCoasCode().isNull() )
				{
					try
					{
						getTask().getGoqrpls().gCheckQueryMode();
						{
							String sqlptiCursor = "SELECT 'X' " +
	" FROM FTVCOAS " +
	" WHERE FTVCOAS_COAS_CODE = :FORUSOR_FORUSOR_COAS_CODE ";
							DataCursor ptiCursor = new DataCursor(sqlptiCursor);
							try {
								//Setting query parameters
								ptiCursor.addParameter("FORUSOR_FORUSOR_COAS_CODE", forusorElement.getForusorCoasCode());
								ptiCursor.open();
								ResultSet ptiCursorResults = ptiCursor.fetchInto();
								if ( ptiCursorResults != null ) {
									forusorElement.setOrgnTitle(ptiCursorResults.getStr(0));
								}
								getTask().getGoqrpls().gCheckValue(toBool(ptiCursor.notFound()), GNls.Fget(toStr("FOMUSOR-0016"), toStr("FORM"), toStr("Invalid chart of account; press LIST for valid id.")), toBool(NBool.True));
							}
							finally{
								ptiCursor.close();
							}
						}
						// 
						setGlobal("QUERY_MODE", toStr("0"));
					}
					catch(ApplicationException e)
					{
						setGlobal("QUERY_MODE", toStr("0"));
						throw new ApplicationException();
					}
				}
				// 
				if ( forusorElement.getForusorOrgnCode().isNull() )
				{
					try
					{
						getTask().getGoqrpls().gCheckQueryMode();
						{
							String sqlptiCursor = "SELECT FTVORGN_TITLE " +
	" FROM FTVORGN " +
	" WHERE FTVORGN_COAS_CODE = :FORUSOR_FORUSOR_COAS_CODE AND FTVORGN_ORGN_CODE = :FORUSOR_FORUSOR_ORGN_CODE ";
							DataCursor ptiCursor = new DataCursor(sqlptiCursor);
							try {
								//Setting query parameters
								ptiCursor.addParameter("FORUSOR_FORUSOR_COAS_CODE", forusorElement.getForusorCoasCode());
								ptiCursor.addParameter("FORUSOR_FORUSOR_ORGN_CODE", forusorElement.getForusorOrgnCode());
								ptiCursor.open();
								ResultSet ptiCursorResults = ptiCursor.fetchInto();
								if ( ptiCursorResults != null ) {
									forusorElement.setOrgnTitle(ptiCursorResults.getStr(0));
								}
								getTask().getGoqrpls().gCheckValue(toBool(ptiCursor.notFound()), GNls.Fget(toStr("FOMUSOR-0017"), toStr("FORM"), toStr("Invalid orgainization; press LIST for valid id.")), toBool(NBool.True));
							}
							finally{
								ptiCursor.close();
							}
						}
						// 
						setGlobal("QUERY_MODE", toStr("0"));
					}
					catch(ApplicationException e)
					{
						setGlobal("QUERY_MODE", toStr("0"));
						throw new ApplicationException();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FORUSOR.PRE-UPDATE
		    :FORUSOR.FORUSOR_ACTIVITY_DATE :=
    TO_DATE(:CURRENT_DATE,G$_DATE.GET_NLS_DATE_FORMAT) ;
--
   :FORUSOR.FORUSOR_USER_ID := :CURRENT_USER1 ;
--
   INSERT_FORUORH_1;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FORUSOR.PRE-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowUpdate
		public void forusor_BeforeRowUpdate(RowAdapterEvent args)
		{
			
				ForusorAdapter forusorElement = (ForusorAdapter)args.getRow();


				forusorElement.setForusorActivityDate(toDate(getFormModel().getFormHeader().getCurrentDate(), GDate.getNlsDateFormat()));
				// 
				forusorElement.setForusorUserId(getFormModel().getFormHeader().getCurrentUser1());
				// 
				this.getTask().getServices().insertForuorh1(forusorElement);
			}

		
		/* Original PL/SQL code code for TRIGGER FORUSOR.PRE-DELETE
		    INSERT_FORUORH_1;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FORUSOR.PRE-DELETE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowDelete
		public void forusor_BeforeRowDelete(RowAdapterEvent args)
		{
			
				ForusorAdapter forusorElement = (ForusorAdapter)args.getRow();


				this.getTask().getServices().insertForuorh1(forusorElement);
			}

		
		/* Original PL/SQL code code for TRIGGER FORUSOR.KEY-NXTBLK
		    EXECUTE_TRIGGER( 'INVALID_FUNCTION_MSG' ) ;
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FORUSOR.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void forusor_NextBlock()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FORUSOR.KEY-PRVBLK
		    EXECUTE_TRIGGER( 'INVALID_FUNCTION_MSG' ) ;
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FORUSOR.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void forusor_PreviousBlock()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FORUSOR.POST-QUERY
		    :ACCESS_IND  :=  :FORUSOR.FORUSOR_ACCESS_IND ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FORUSOR.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void forusor_AfterQuery(RowAdapterEvent args)
		{
			
				ForusorAdapter forusorElement = (ForusorAdapter)args.getRow();

				KeyBlock keyBlockElement = this.getFormModel().getKeyBlock();
				
				
				try
				{
					forusorElement.setLockDbValues(true);
					
					forusorElement.setForusorUserIdEntered(keyBlockElement.getUserId());
					forusorElement.setAccessInd(forusorElement.getForusorAccessInd());
					
                                         try {  
                                        this.forusorCoasCode_PostChange(); 
                                        } catch(Exception ex) { 
                                        } 
                                         try {  
                                        this.forusorOrgnCode_PostChange(); 
                                        } catch(Exception ex) { 
                                        } 
                                         try {  
                                        this.accessInd_PostChange(); 
                                        } catch(Exception ex) { 
                                        } 

//[DELETE] 
//[DELETE] 
//[DELETE] 

				} finally { 
					forusorElement.setLockDbValues(false);
				}
				
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FORUSOR.PRE-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeQuery
		public void forusor_BeforeQuery(QueryEvent args)
		{
			
				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("KEY_BLOCK_USER_ID", this.getFormModel().getKeyBlock().getUserId()));             
               }

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FORUSOR_COAS_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="FORUSOR_COAS_CODE")
		public void forusorCoasCode_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FORUSOR_COAS_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FORUSOR_COAS_CODE", function=KeyFunction.ITEM_CHANGE)
		public void forusorCoasCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FORUSOR_COAS_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS")
		public void forusorCoasCode_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FORUSOR_COAS_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FORUSOR_COAS_CODE", function=KeyFunction.NEXT_ITEM)
		public void forusorCoasCode_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FORUSOR_COAS_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FORUSOR_COAS_CODE", function=KeyFunction.ITEM_OUT)
		public void forusorCoasCode_itemOut()
		{
			
				getGCodeClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER FORUSOR_COAS_CODE.G$_SEARCH_PARAMETERS
		 G$_SEARCH.PARAMETERS('FTVCOAS_COAS_CODE','FTVCOAS_TITLE',
 G$_SEARCH_WHERE.F_FTVCOAS_KEY('SYSDATE'));
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FORUSOR_COAS_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS")
		public void forusorCoasCode_GSearchParameters()
		{
			
				getTask().getGoqrpls().getGSearch().parameters(toStr("FTVCOAS_COAS_CODE"), toStr("FTVCOAS_TITLE"), getTask().getGoqrpls().getGSearchWhere().fFtvcoasKey(toStr("SYSDATE")));
			}

		
		/* Original PL/SQL code code for TRIGGER FORUSOR_COAS_CODE.POST-CHANGE
		 BEGIN
   G$_CHECK_QUERY_MODE ;
--
   IF ( :GLOBAL.QUERY_MODE = '1' ) THEN
      GOTO PTI_END_TRIGGER ;
   END IF ;
   IF NOT SELECT_FTVCOAS_1
          (:FORUSOR.FORUSOR_COAS_CODE) THEN
      MESSAGE(
 G$_NLS.Get('FOMUSOR-0018', 'FORM','Invalid chart of accounts; press LIST for valid id.')  ) ;
      RAISE FORM_TRIGGER_FAILURE ;
   END IF ;
--
   << PTI_END_TRIGGER >>
   :GLOBAL.QUERY_MODE := '0' ;
EXCEPTION
   WHEN FORM_TRIGGER_FAILURE THEN
      :GLOBAL.QUERY_MODE := '0' ;
      RAISE FORM_TRIGGER_FAILURE ;
END ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FORUSOR_COAS_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FORUSOR_COAS_CODE")
		public void forusorCoasCode_PostChange()
		{
			

				ForusorAdapter forusorElement = (ForusorAdapter)this.getFormModel().getForusor().getRowAdapter(true);

				if(forusorElement!=null){
				if(forusorElement.getForusorCoasCode().isNull())
		return;
				try
				{
					getTask().getGoqrpls().gCheckQueryMode();
					// 
					if ((getGlobal("QUERY_MODE").equals("1")))
					{
//						 goto PTI_END_TRIGGER;
//						 PTI_END_TRIGGER:;
							setGlobal("QUERY_MODE", toStr("0"));
							return;
					}
					if ( this.getTask().getServices().selectFtvcoas1(forusorElement.getForusorCoasCode()).not() )
					{
						errorMessage(GNls.Fget(toStr("FOMUSOR-0018"), toStr("FORM"), toStr("*ERROR* Invalid chart of accounts; press LIST for valid id.")));
						throw new ApplicationException();
					}
					 PTI_END_TRIGGER:;
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
		 * FORUSOR_ORGN_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="FORUSOR_ORGN_CODE")
		public void forusorOrgnCode_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FORUSOR_ORGN_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FORUSOR_ORGN_CODE", function=KeyFunction.ITEM_CHANGE)
		public void forusorOrgnCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FORUSOR_ORGN_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS")
		public void forusorOrgnCode_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FORUSOR_ORGN_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FORUSOR_ORGN_CODE", function=KeyFunction.NEXT_ITEM)
		public void forusorOrgnCode_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FORUSOR_ORGN_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FORUSOR_ORGN_CODE", function=KeyFunction.ITEM_OUT)
		public void forusorOrgnCode_itemOut()
		{
			
				getGCodeClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER FORUSOR_ORGN_CODE.G$_SEARCH_PARAMETERS
		 G$_SEARCH.PARAMETERS('FTVORGN_ORGN_CODE', 'FTVORGN_TITLE',
 G$_SEARCH_WHERE.F_FTVORGN_KEY(':FORUSOR.FORUSOR_COAS_CODE',
			       'SYSDATE'));

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FORUSOR_ORGN_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS")
		public void forusorOrgnCode_GSearchParameters()
		{
			
				getTask().getGoqrpls().getGSearch().parameters(toStr("FTVORGN_ORGN_CODE"), toStr("FTVORGN_TITLE"), getTask().getGoqrpls().getGSearchWhere().fFtvorgnKey(toStr(":FORUSOR.FORUSOR_COAS_CODE"), toStr("SYSDATE")));
			}

		
		/* Original PL/SQL code code for TRIGGER FORUSOR_ORGN_CODE.POST-CHANGE
		 BEGIN
   G$_CHECK_QUERY_MODE ;
--
   DECLARE
      CURSOR PTI_CURSOR IS
         SELECT FTVORGN_TITLE
         FROM   FTVORGN
         WHERE  FTVORGN_COAS_CODE = :FORUSOR.FORUSOR_COAS_CODE
           AND  FTVORGN_ORGN_CODE = :FORUSOR.FORUSOR_ORGN_CODE 
           AND  FTVORGN_EFF_DATE <= SYSDATE
           AND  FTVORGN_NCHG_DATE > SYSDATE; 
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO :ORGN_TITLE ;
      G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND,
          G$_NLS.Get('FOMUSOR-0019', 'FORM','Invalid organization; press LIST for valid id.') ,
         TRUE);
   END ;
--
   :GLOBAL.QUERY_MODE := '0' ;
EXCEPTION
   WHEN FORM_TRIGGER_FAILURE THEN
      :GLOBAL.QUERY_MODE := '0' ;
      RAISE FORM_TRIGGER_FAILURE ;
END ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FORUSOR_ORGN_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FORUSOR_ORGN_CODE")
		public void forusorOrgnCode_PostChange()
		{
			

				ForusorAdapter forusorElement = (ForusorAdapter)this.getFormModel().getForusor().getRowAdapter(true);

				if(forusorElement!=null){
				int rowCount = 0;
				if(forusorElement.getForusorOrgnCode().isNull())
		return;
				try
				{
					getTask().getGoqrpls().gCheckQueryMode();
					{
						String sqlptiCursor = "SELECT FTVORGN_TITLE " +
	" FROM FTVORGN " +
	" WHERE FTVORGN_COAS_CODE = :FORUSOR_FORUSOR_COAS_CODE AND FTVORGN_ORGN_CODE = :FORUSOR_FORUSOR_ORGN_CODE AND FTVORGN_EFF_DATE <= SYSDATE AND FTVORGN_NCHG_DATE > SYSDATE ";
						DataCursor ptiCursor = new DataCursor(sqlptiCursor);
						try {
							//Setting query parameters
							ptiCursor.addParameter("FORUSOR_FORUSOR_COAS_CODE", forusorElement.getForusorCoasCode());
							ptiCursor.addParameter("FORUSOR_FORUSOR_ORGN_CODE", forusorElement.getForusorOrgnCode());
							ptiCursor.open();
							ResultSet ptiCursorResults = ptiCursor.fetchInto();
							if ( ptiCursorResults != null ) {
								forusorElement.setOrgnTitle(ptiCursorResults.getStr(0));
							}
							getTask().getGoqrpls().gCheckValue(toBool(ptiCursor.notFound()), GNls.Fget(toStr("FOMUSOR-0019"), toStr("FORM"), toStr("Invalid organization; press LIST for valid id.")), toBool(NBool.True));
						}
						finally{
							ptiCursor.close();
						}
					}
					// 
					setGlobal("QUERY_MODE", toStr("0"));
				}
				catch(ApplicationException e)
				{
					setGlobal("QUERY_MODE", toStr("0"));
					throw new ApplicationException();
				}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FORUSOR_ORGN_CODE.KEY-LISTVAL
		 -- Banner7.0 Navigation Fix 
g$_search.code_when_new_item_inst;
g$_check_failure;

g$_list_values_call;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FORUSOR_ORGN_CODE.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="FORUSOR_ORGN_CODE", function=KeyFunction.LIST_VALUES)
		public void forusorOrgnCode_ListValues()
		{
			
				//  Banner7.0 Navigation Fix 
				//  Banner7.0 Navigation Fix 
				getTask().getGoqrpls().getGSearch().codeWhenNewItemInst();
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gListValuesCall();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ORGN_TITLE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="ORGN_TITLE", function=KeyFunction.ITEM_CHANGE)
		public void orgnTitle_itemChange()
		{
			
				getGDescClass().itemChange();
			}

		
		/* Original PL/SQL code code for TRIGGER ACCESS_IND.POST-CHANGE
		    IF :SYSTEM.MODE <> 'NORMAL' THEN
      RETURN ;
   END IF ;
--
   :FORUSOR.FORUSOR_ACCESS_IND  :=  :ACCESS_IND ; 

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ACCESS_IND.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="ACCESS_IND")
		public void accessInd_PostChange()
		{
			

				ForusorAdapter forusorElement = (ForusorAdapter)this.getFormModel().getForusor().getRowAdapter(true);

				if(forusorElement!=null){
				if(forusorElement.getAccessInd().isNull())
		return;
				if ( !getMode().equals("NORMAL") )
				{
					return ;
				}
				// 
				forusorElement.setForusorAccessInd(forusorElement.getAccessInd());
			}
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FORUSOR_ACTIVITY_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FORUSOR_ACTIVITY_DATE", function=KeyFunction.NEXT_ITEM)
		public void forusorActivityDate_keyNexItem()
		{
			
				getGDateClass().nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FORUSOR_ACTIVITY_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FORUSOR_ACTIVITY_DATE", function=KeyFunction.ITEM_CHANGE)
		public void forusorActivityDate_itemChange()
		{
			
				getGDateClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FORUSOR_ACTIVITY_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FORUSOR_ACTIVITY_DATE", function=KeyFunction.ITEM_OUT)
		public void forusorActivityDate_itemOut()
		{
			
				getGDateClass().itemOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FORUSOR_COAS_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FORUSOR_COAS_CODE")
		public void forusorCoasCode_validate()
		{
			
				ForusorAdapter forusorElement = (ForusorAdapter)this.getFormModel().getForusor().getRowAdapter(true);
							this.forusorCoasCode_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FORUSOR_ORGN_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FORUSOR_ORGN_CODE")
		public void forusorOrgnCode_validate()
		{
			
				ForusorAdapter forusorElement = (ForusorAdapter)this.getFormModel().getForusor().getRowAdapter(true);
							this.forusorOrgnCode_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ACCESS_IND.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="ACCESS_IND")
		public void accessInd_validate()
		{
			
				ForusorAdapter forusorElement = (ForusorAdapter)this.getFormModel().getForusor().getRowAdapter(true);
							this.accessInd_PostChange();

			}
		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FORUSOR_COAS_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		
		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="FORUSOR_COAS_CODE")
		public void forusorCoasCodeLbt_click()
		{
			ForusorAdapter forusorElement = (ForusorAdapter)this.getFormModel().getForusor().getRowAdapter(true);

			if(forusorElement!=null){
			goItem(toStr("FORUSOR_COAS_CODE"));
			getTask().getNoqjpls().getNokbdpl().createDynRg(forusorElement.getForusorCoasCode());
		}
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FORUSOR_ORGN_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="FORUSOR_ORGN_CODE")
		public void forusorOrgnCodeLbt_click()
		{
			
			ForusorAdapter forusorElement = (ForusorAdapter)this.getFormModel().getForusor().getRowAdapter(true);

			if(forusorElement!=null){
			goItem(toStr("FORUSOR_ORGN_CODE"));
			getTask().getNoqjpls().getNokbdpl().createDynRg(forusorElement.getForusorOrgnCode());
		}
		}
	
}

