package net.hedtech.banner.finance.common.Ftmctyp.controller;
 
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
import net.hedtech.general.common.libraries.Foqrpls.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;

import net.hedtech.banner.finance.common.Ftmctyp.model.*;
import net.hedtech.banner.finance.common.Ftmctyp.*;
import net.hedtech.banner.finance.common.Ftmctyp.services.*;

import net.hedtech.general.common.libraries.Goqolib.services.GDateClass;	
		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class FtvctypController extends DefaultBlockController {

	private GDateClass getGDateClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GDateClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_DATE_CLASS");
	}	

	
	public FtvctypController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
		
	@Override
	public FtmctypTask getTask() {
		return (FtmctypTask)super.getTask();
	}

	public FtmctypModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
		/* Original PL/SQL code code for TRIGGER FTVCTYP.PRE-INSERT
		  
--
   EXECUTE_TRIGGER( 'update_activity_date' ) ;
   G$_CHECK_FAILURE ;
   EXECUTE_TRIGGER( 'update_user_id' ) ;
   G$_CHECK_FAILURE ;
   :UPD_CODE := 'N' ;
:hold_code := :ftvctyp_code;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVCTYP.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowInsert
		public void ftvctyp_BeforeRowInsert(RowAdapterEvent args)
		{
			
				// 
				FtvctypAdapter ftvctypElement = (FtvctypAdapter)args.getRow();


				// 
				executeAction("update_activity_date");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("update_user_id");
				getTask().getGoqrpls().gCheckFailure();
				getFormModel().getFormHeader().setUpdCode(toStr("N"));
				getFormModel().getFormHeader().setHoldCode(ftvctypElement.getFtvctypCode());
			}

		
		/* Original PL/SQL code code for TRIGGER FTVCTYP.PRE-UPDATE
		   
   EXECUTE_TRIGGER( 'UPDATE_ACTIVITY_DATE' ) ;
   G$_CHECK_FAILURE ;
   EXECUTE_TRIGGER( 'UPDATE_USER_ID' ) ;
   G$_CHECK_FAILURE ;
   :UPD_CODE := 'N' ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVCTYP.PRE-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowUpdate
		public void ftvctyp_BeforeRowUpdate(RowAdapterEvent args)
		{
			
				executeAction("UPDATE_ACTIVITY_DATE");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("UPDATE_USER_ID");
				getTask().getGoqrpls().gCheckFailure();
				getFormModel().getFormHeader().setUpdCode(toStr("N"));
			}

		
		/* Original PL/SQL code code for TRIGGER FTVCTYP.KEY-DELREC
		    IF SELECT_FTVCSTO_1 (:FTVCTYP_CODE) THEN
      GOTO PTI_STEP_001 ;
   END IF ;
   MESSAGE(
 G$_NLS.Get('FTMCTYP-0011', 'FORM','Can not delete the cost type code when dependencies exist in CSTO.')  ) ;
   RAISE FORM_TRIGGER_FAILURE ;
--
   << PTI_STEP_001 >>
   DELETE_RECORD ;
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVCTYP.KEY-DELREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DELREC", function=KeyFunction.DELETE_RECORD)
		public void ftvctyp_DeleteRecord()
		{
			

				FtvctypAdapter ftvctypElement = (FtvctypAdapter)this.getFormModel().getFtvctyp().getRowAdapter(true);

				if(ftvctypElement!=null){
				if ( this.getTask().getServices().selectFtvcsto1(ftvctypElement.getFtvctypCode()).getValue() )
				{
					//goto PTI_STEP_001;
					//PTI_STEP_001:;
					deleteRecord();
					getTask().getGoqrpls().gCheckFailure();
				}
				else
				{
					errorMessage(GNls.Fget(toStr("FTMCTYP-0011"), toStr("FORM"), toStr("Can not delete the cost type code when dependencies exist in CSTO.")));
					throw new ApplicationException();
				}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FTVCTYP.KEY-NXTBLK
		    MESSAGE(  G$_NLS.Get('FTMCTYP-0012', 'FORM','*ERROR* Invalid function; press SHOW KEYS key for valid functions.')  
       ) ;
   BELL ;
   RAISE FORM_TRIGGER_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVCTYP.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void ftvctyp_NextBlock()
		{
			
				errorMessage(GNls.Fget(toStr("FTMCTYP-0012"), toStr("FORM"), toStr("*ERROR* Invalid function; press SHOW KEYS key for valid functions.")));
				
				throw new ApplicationException();
			}

		
		/* Original PL/SQL code code for TRIGGER FTVCTYP.WHEN-NEW-RECORD-INSTANCE
		  if :system.form_status = 'CHANGED' then

DEFAULT_VALUE('N','GLOBAL.CANCEL_BTN_PRESSED');
IF :GLOBAL.CANCEL_BTN_PRESSED='Y' THEN
 NULL;
ELSE
   COMMIT_FORM ;
END IF;
ERASE('GLOBAL.CANCEL_BTN_PRESSED');
end if;

   :HOLD_CODE := :FTVCTYP_CODE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVCTYP.WHEN-NEW-RECORD-INSTANCE
		 *
		 *
		 *</p>
		*/

		@After
		@ActionTrigger(action="WHEN-NEW-RECORD-INSTANCE", function=KeyFunction.RECORD_CHANGE)
		public void ftvctyp_recordChange()
		{
			

				FtvctypAdapter ftvctypElement = (FtvctypAdapter)this.getFormModel().getFtvctyp().getRowAdapter(true);

				if(ftvctypElement!=null){
				if ( getTaskStatus().equals("CHANGED") )
				{
					setDefaultValue("N", "GLOBAL.CANCEL_BTN_PRESSED");
					if ( getGlobal("CANCEL_BTN_PRESSED").equals("Y") )
					{
					}
					else {
						commitTask();
					}
					removeGlobal("GLOBAL.CANCEL_BTN_PRESSED");
				}
				getFormModel().getFormHeader().setHoldCode(ftvctypElement.getFtvctypCode());
			}
		}

		
		/* Original PL/SQL code code for TRIGGER FTVCTYP.KEY-PRVBLK
		    MESSAGE(  G$_NLS.Get('FTMCTYP-0015', 'FORM','*ERROR* Invalid function; press SHOW KEYS key for valid functions.')  
       ) ;
   BELL ;
   RAISE FORM_TRIGGER_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVCTYP.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void ftvctyp_PreviousBlock()
		{
			
				errorMessage(GNls.Fget(toStr("FTMCTYP-0015"), toStr("FORM"), toStr("*ERROR* Invalid function; press SHOW KEYS key for valid functions.")));
				
				throw new ApplicationException();
			}

		
		/* Original PL/SQL code code for TRIGGER FTVCTYP.WHEN-VALIDATE-RECORD
		 if :ftvctyp.rowid is not null then  
   IF :UPD_CODE = 'Y' THEN
      IF :ftvctyp_code = :hold_code OR ( :ftvctyp_code IS NULL
         AND :hold_code IS NULL ) THEN
    return;
      END IF ;
   ELSE
      return;
   END IF ;
--
   IF SELECT_FTVCSTO_1 (:HOLD_CODE) THEN
      return;
   END IF ;
   MESSAGE(
 G$_NLS.Get('FTMCTYP-0016', 'FORM','Can not update the cost type code when dependencies exist.')  ) ;
   RAISE FORM_TRIGGER_FAILURE ;


  else

  DECLARE
 

     PTI_INTO_TEMP        VARCHAR2(255);
      CURSOR PTI_CURSOR IS
         SELECT 'Y'
         FROM   FTVCTYP
         WHERE  FTVCTYP_CODE = :FTVCTYP_CODE ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO PTI_INTO_TEMP ;
      G$_CHECK_VALUE (PTI_CURSOR%FOUND,
          G$_NLS.Get('FTMCTYP-0017', 'FORM','Cost type code already exists; code must be unique.') ,
         TRUE);
   END ;
end if;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVCTYP.WHEN-VALIDATE-RECORD
		 *
		 *
		 *</p>
		*/

		@RecordValidationTrigger
		public void ftvctyp_WhenValidateRecord()
		{
			

				FtvctypAdapter ftvctypElement = (FtvctypAdapter)this.getFormModel().getFtvctyp().getRowAdapter(true);
				
				if(ftvctypElement!=null){
				int rowCount = 0;
				if ( ftvctypElement.getRowState().toString()!="INSERTED" )//if ( !ftvctypElement.getROWID().isNull() )
				{
					if ( getFormModel().getFormHeader().getUpdCode().equals("Y") )
					{
						if ( ftvctypElement.getFtvctypCode().equals(getFormModel().getFormHeader().getHoldCode()) || (ftvctypElement.getFtvctypCode().isNull() && getFormModel().getFormHeader().getHoldCode().isNull()) )
						{
							return ;
						}
					}
					else {
						return ;
					}
					// 
					if ( this.getTask().getServices().selectFtvcsto1(getFormModel().getFormHeader().getHoldCode()).getValue() )
					{
						
						String sqlptiCursor = "SELECT 'Y' " +
	" FROM FTVCTYP " +
	" WHERE FTVCTYP_CODE = :FTVCTYP_CODE ";
						DataCursor ptiCursor = new DataCursor(sqlptiCursor);
						try {
							//Setting query parameters
							ptiCursor.addParameter("FTVCTYP_CODE", ftvctypElement.getFtvctypCode());
							ptiCursor.open();
							ResultSet ptiCursorResults = ptiCursor.fetchInto();
							ptiCursor.close();
							if ( ptiCursorResults != null ) {
									errorMessage(GNls.Fget(toStr("FTMCTYP-0017"), toStr("FORM"), toStr("Cost type code already exists; code must be unique.")));
									throw new ApplicationException();
							}
							else
								return ;
						} finally {
							ptiCursor.close();
						}
					}
					errorMessage(GNls.Fget(toStr("FTMCTYP-0016"), toStr("FORM"), toStr("Can not update the cost type code when dependencies exist.")));
					throw new ApplicationException();
				}
				else {
					{
						NString ptiIntoTemp= NString.getNull();
						String sqlptiCursor = "SELECT 'Y' " +
	" FROM FTVCTYP " +
	" WHERE FTVCTYP_CODE = :FTVCTYP_CODE ";
						DataCursor ptiCursor = new DataCursor(sqlptiCursor);
						try {
							//Setting query parameters
							ptiCursor.addParameter("FTVCTYP_CODE", ftvctypElement.getFtvctypCode());
							ptiCursor.open();
							ResultSet ptiCursorResults = ptiCursor.fetchInto();
							if ( ptiCursorResults != null ) {
								ptiIntoTemp = ptiCursorResults.getStr(0);
							}
							getTask().getGoqrpls().gCheckValue(toBool(ptiCursor.found()), GNls.Fget(toStr("FTMCTYP-0017"), toStr("FORM"), toStr("Cost type code already exists; code must be unique.")), NBool.True);
						}
						finally{
							ptiCursor.close();
						}
					}
				}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVCTYP_ACTIVITY_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FTVCTYP_ACTIVITY_DATE", function=KeyFunction.NEXT_ITEM)
		public void ftvctypActivityDate_keyNexItem()
		{
			
				getGDateClass().nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVCTYP_ACTIVITY_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FTVCTYP_ACTIVITY_DATE", function=KeyFunction.ITEM_CHANGE)
		public void ftvctypActivityDate_itemChange()
		{
			
				getGDateClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVCTYP_ACTIVITY_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FTVCTYP_ACTIVITY_DATE", function=KeyFunction.ITEM_OUT)
		public void ftvctypActivityDate_itemOut()
		{
			
				getGDateClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER FTVCTYP_CODE.POST-CHANGE
		 BEGIN
   G$_CHECK_QUERY_MODE ;
--
-- Message is value not found :
--
   :UPD_CODE := 'Y' ;
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
		 * FTVCTYP_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FTVCTYP_CODE")
		public void ftvctypCode_PostChange()
		{
			

				FtvctypAdapter ftvctypElement = (FtvctypAdapter)this.getFormModel().getFtvctyp().getRowAdapter(true);

				if(ftvctypElement!=null){
				if(ftvctypElement.getFtvctypCode().isNull())
					return;
				try
				{
					getTask().getGoqrpls().gCheckQueryMode();
					// 
					//  Message is value not found :
					// 
					getFormModel().getFormHeader().setUpdCode(toStr("Y"));
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

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVCTYP_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FTVCTYP_CODE")
		public void ftvctypCode_validate()
		{
			
				FtvctypAdapter ftvctypElement = (FtvctypAdapter)this.getFormModel().getFtvctyp().getRowAdapter(true);
							this.ftvctypCode_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVCTYP.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void ftvctyp_AfterQuery(RowAdapterEvent args)
		{
			
			FtvctypAdapter ftvctypElement = (FtvctypAdapter)args.getRow();			
						
				try {
				ftvctypElement.setLockDbValues(true);
				try { 
				this.ftvctypCode_PostChange();
				} catch(Exception ex) {
				}
			
						} finally {
							ftvctypElement.setLockDbValues(false);
						}
						

			}

		
	
	
}

