package net.hedtech.banner.finance.common.Ftvfsyr.controller;
 
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
import net.hedtech.general.common.libraries.Foqrpls.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.banner.finance.common.Ftvfsyr.model.*;
import net.hedtech.banner.finance.common.Ftvfsyr.*;
import net.hedtech.banner.finance.common.Ftvfsyr.services.*;
import net.hedtech.general.common.libraries.Goqolib.services.GDateClass;	
		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class FtvfsyrController extends DefaultBlockController {

	private GDateClass getGDateClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GDateClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_DATE_CLASS");
	}	

	
	public FtvfsyrController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
		
	@Override
	public FtvfsyrTask getTask() {
		return (FtvfsyrTask)super.getTask();
	}

	public FtvfsyrModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
		/* Original PL/SQL code code for TRIGGER FTVFSYR.PRE-QUERY
		   :hold_coas_code := :global.coas_code ;
  --
  :HOLD_CURRENT_PERIOD :=:CURRENT_PERIOD;
  :HOLD_EARLIEST_OPEN_PERIOD := :EARLIEST_OPEN_PERIOD; 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFSYR.PRE-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeQuery
		public void ftvfsyr_BeforeQuery(QueryEvent args)
		{
			
				FtvfsyrAdapter ftvfsyrElement = (FtvfsyrAdapter)this.getFormModel().getFtvfsyr().getRowAdapter(true);
				getFormModel().getFormHeader().setHoldCoasCode(getGlobal("COAS_CODE"));
				// 
				getFormModel().getFormHeader().setHoldCurrentPeriod(ftvfsyrElement.getCurrentPeriod());
				getFormModel().getFormHeader().setHoldEarliestOpenPeriod(ftvfsyrElement.getEarliestOpenPeriod());

				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("HOLD_COAS_CODE", this.getFormModel().getFormHeader().getHoldCoasCode()));             


                FtvfsyrAdapter ftvfsyrElement2 = (FtvfsyrAdapter) this.getFormModel().getFtvfsyr().getRowAdapter();      
                
				if(ftvfsyrElement2!=null){
				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("FTVFSYR_COAS_CODE", ftvfsyrElement2.getFtvfsyrCoasCode()));             
			}
		}
		
		@ActionTrigger(action="KEY-EXEQRY", function=KeyFunction.EXECUTE_QUERY)
		public void ftvfsyr_ExecuteQuery()
		{
			
				FtvfsyrAdapter ftvfsyrElement = (FtvfsyrAdapter) this.getFormModel().getFtvfsyr().getRowAdapter();
				if (ftvfsyrElement != null && ftvfsyrElement.getFtvfsyrCoasCode().isNotNull())
					setBlockWhereClause("FTVFSYR", "");
				else
					setBlockWhereClause("FTVFSYR", "WHERE (ftvfsyr_coas_code = NVL(:HOLD_COAS_CODE, ftvfsyr_coas_code))");
				executeQuery();
			}

		
		/* Original PL/SQL code code for TRIGGER FTVFSYR.POST-QUERY
		    IF SELECT_FTVFSPD_1 ('O', :EARLIEST_OPEN_PERIOD) THEN
      GOTO NOMIN ;
   END IF ;
   GOTO GOTMIN ;
--
   << NOMIN >>
   :EARLIEST_OPEN_PERIOD := '' ;
--
   << GOTMIN >>
   NULL ;
--
   DECLARE
      CURSOR PTI_CURSOR IS
         SELECT FTVFSPD_FSPD_CODE, FTVFSPD_PRD_START_DATE,
            FTVFSPD_PRD_END_DATE
         FROM   FTVFSPD
         WHERE  FTVFSPD_COAS_CODE = :FTVFSYR_COAS_CODE
           AND  FTVFSPD_FSYR_CODE = :FTVFSYR_FSYR_CODE
           AND  FTVFSPD_FSPD_CODE =  (
               SELECT MAX(FTVFSPD_FSPD_CODE)
               FROM   FTVFSPD
               WHERE  FTVFSPD_COAS_CODE = :FTVFSYR_COAS_CODE
                 AND  FTVFSPD_FSYR_CODE = :FTVFSYR_FSYR_CODE
                 AND  FTVFSPD_PRD_STATUS_IND = 'O' )  ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO :CURRENT_PERIOD,
         :CURRENT_PERIOD_START_DATE, :CURRENT_PERIOD_END_DATE ;
      IF PTI_CURSOR%NOTFOUND THEN
         GOTO TRYN ;
      ELSE
         GOTO DONE ;
      END IF ;
   END ;
--
   << TRYN >>
   :CURRENT_PERIOD := '' ;
--
   IF SELECT_FTVFSPD_1 ('N', :CURRENT_PERIOD) THEN
      GOTO PTI_STEP_001 ;
   END IF ;
--
   << PTI_STEP_001 >>
   IF G$_NCHK(:CURRENT_PERIOD <> '01') THEN
      EXECUTE_TRIGGER( 'TRG_FAIL' ) ;
      IF NOT FORM_SUCCESS THEN
         GOTO GOTC ;
      END IF ;
   END IF ;
   GOTO GOTN ;
--
   << GOTC >>
   :CURRENT_PERIOD := 'CL' ;
   GOTO DATES ;
--
   << GOTN >>
   :CURRENT_PERIOD := 'NO' ;
--
   << DATES >>
   :CURRENT_PERIOD_START_DATE := '' ;
--
   :CURRENT_PERIOD_END_DATE := '' ;
--
   << DONE >>
   NULL ;
   --
   IF :HOLD_CURRENT_PERIOD IS NOT NULL THEN
   IF :CURRENT_PERIOD LIKE :HOLD_CURRENT_PERIOD THEN
      NULL;
   ELSE
      RAISE FORM_TRIGGER_FAILURE;
   END IF;
END IF;
IF :HOLD_EARLIEST_OPEN_PERIOD IS NOT NULL THEN
   IF :EARLIEST_OPEN_PERIOD LIKE :HOLD_EARLIEST_OPEN_PERIOD THEN
      NULL;
   ELSE
      RAISE FORM_TRIGGER_FAILURE;
   END IF;
END IF;
   
   
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFSYR.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void ftvfsyr_AfterQuery(RowAdapterEvent args)
		{
			
				FtvfsyrAdapter ftvfsyrElement = (FtvfsyrAdapter)args.getRow();


				int rowCount = 0;
				Ref<NString> ovar1_ref = new Ref<NString>(ftvfsyrElement.getEarliestOpenPeriod());
				if ( this.getTask().getServices().selectFtvfspd1(ftvfsyrElement, toStr("O"), ovar1_ref).getValue() )
				{
					ftvfsyrElement.setEarliestOpenPeriod(toStr(""));
				}
				else
				{
					ftvfsyrElement.setEarliestOpenPeriod(ovar1_ref.getValue());
				}
				{
					String sqlptiCursor = "SELECT FTVFSPD_FSPD_CODE, FTVFSPD_PRD_START_DATE, FTVFSPD_PRD_END_DATE " +
	" FROM FTVFSPD " +
	" WHERE FTVFSPD_COAS_CODE = :FTVFSYR_COAS_CODE AND FTVFSPD_FSYR_CODE = :FTVFSYR_FSYR_CODE AND FTVFSPD_FSPD_CODE = (SELECT MAX(FTVFSPD_FSPD_CODE) " +
		" FROM FTVFSPD " +
		" WHERE FTVFSPD_COAS_CODE = :FTVFSYR_COAS_CODE AND FTVFSPD_FSYR_CODE = :FTVFSYR_FSYR_CODE AND FTVFSPD_PRD_STATUS_IND = 'O' ) ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//Setting query parameters
						ptiCursor.addParameter("FTVFSYR_COAS_CODE", ftvfsyrElement.getFtvfsyrCoasCode());
						ptiCursor.addParameter("FTVFSYR_FSYR_CODE", ftvfsyrElement.getFtvfsyrFsyrCode());
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							ftvfsyrElement.setCurrentPeriod(ptiCursorResults.getStr(0));
							ftvfsyrElement.setCurrentPeriodStartDate(ptiCursorResults.getDate(1));
							ftvfsyrElement.setCurrentPeriodEndDate(ptiCursorResults.getDate(2));
						}
						if ( ptiCursor.notFound() )
						{
							ftvfsyrElement.setCurrentPeriod(toStr(""));
							Ref<NString> ovar2_ref = new Ref<NString>(ftvfsyrElement.getCurrentPeriod());
							// 
							if ( this.getTask().getServices().selectFtvfspd1(ftvfsyrElement, toStr("N"), ovar2_ref).getValue() )
							{
							}
							else
							{
								ftvfsyrElement.setCurrentPeriod(ovar2_ref.getValue());					
							}
							if ( getTask().getGoqrpls().gNchk(toBool(ftvfsyrElement.getCurrentPeriod().notEquals("01"))).getValue() )
							{
								try
								{
									executeAction("TRG_FAIL");
									ftvfsyrElement.setCurrentPeriod(toStr("NO"));
								}
								catch (Exception e)
								{
									ftvfsyrElement.setCurrentPeriod(toStr("CL"));
								}
							}
							else
							{
								ftvfsyrElement.setCurrentPeriod(toStr("NO"));								
							}
							ftvfsyrElement.setCurrentPeriodStartDate(toDate(""));
							// 
							ftvfsyrElement.setCurrentPeriodEndDate(toDate(""));
						}
						// 
						if ( !getFormModel().getFormHeader().getHoldCurrentPeriod().isNull() )
						{
							if ( like(ftvfsyrElement.getCurrentPeriod(), getFormModel().getFormHeader().getHoldCurrentPeriod()) )
							{
							}
							else {
								throw new ApplicationException();
							}
						}
						if ( !getFormModel().getFormHeader().getHoldEarliestOpenPeriod().isNull() )
						{
							if ( like(ftvfsyrElement.getEarliestOpenPeriod(), getFormModel().getFormHeader().getHoldEarliestOpenPeriod()) )
							{
							}
							else {
								throw new ApplicationException();
							}
						}
					}
					finally{
						ptiCursor.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FTVFSYR.TRG_FAIL
		    NULL ;
   RAISE FORM_TRIGGER_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFSYR.TRG_FAIL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="TRG_FAIL")
		public void ftvfsyr_TrgFail()
		{
			
				throw new ApplicationException();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFSYR_START_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FTVFSYR_START_DATE", function=KeyFunction.NEXT_ITEM)
		public void ftvfsyrStartDate_keyNexItem()
		{
			
				getGDateClass().nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFSYR_START_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FTVFSYR_START_DATE", function=KeyFunction.ITEM_CHANGE)
		public void ftvfsyrStartDate_itemChange()
		{
			
				getGDateClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFSYR_START_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FTVFSYR_START_DATE", function=KeyFunction.ITEM_OUT)
		public void ftvfsyrStartDate_itemOut()
		{
			
				getGDateClass().itemOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFSYR_END_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FTVFSYR_END_DATE", function=KeyFunction.NEXT_ITEM)
		public void ftvfsyrEndDate_keyNexItem()
		{
			
				getGDateClass().nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFSYR_END_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FTVFSYR_END_DATE", function=KeyFunction.ITEM_CHANGE)
		public void ftvfsyrEndDate_itemChange()
		{
			
				getGDateClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFSYR_END_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FTVFSYR_END_DATE", function=KeyFunction.ITEM_OUT)
		public void ftvfsyrEndDate_itemOut()
		{
			
				getGDateClass().itemOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * CURRENT_PERIOD_START_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="CURRENT_PERIOD_START_DATE", function=KeyFunction.NEXT_ITEM)
		public void currentPeriodStartDate_keyNexItem()
		{
			
				getGDateClass().nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * CURRENT_PERIOD_START_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="CURRENT_PERIOD_START_DATE", function=KeyFunction.ITEM_CHANGE)
		public void currentPeriodStartDate_itemChange()
		{
			
				getGDateClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * CURRENT_PERIOD_START_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="CURRENT_PERIOD_START_DATE", function=KeyFunction.ITEM_OUT)
		public void currentPeriodStartDate_itemOut()
		{
			
				getGDateClass().itemOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * CURRENT_PERIOD_END_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="CURRENT_PERIOD_END_DATE", function=KeyFunction.NEXT_ITEM)
		public void currentPeriodEndDate_keyNexItem()
		{
			
				getGDateClass().nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * CURRENT_PERIOD_END_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="CURRENT_PERIOD_END_DATE", function=KeyFunction.ITEM_CHANGE)
		public void currentPeriodEndDate_itemChange()
		{
			
				getGDateClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * CURRENT_PERIOD_END_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="CURRENT_PERIOD_END_DATE", function=KeyFunction.ITEM_OUT)
		public void currentPeriodEndDate_itemOut()
		{
			
				getGDateClass().itemOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFSYR_ACTIVITY_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FTVFSYR_ACTIVITY_DATE", function=KeyFunction.NEXT_ITEM)
		public void ftvfsyrActivityDate_keyNexItem()
		{
			
				getGDateClass().nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFSYR_ACTIVITY_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FTVFSYR_ACTIVITY_DATE", function=KeyFunction.ITEM_CHANGE)
		public void ftvfsyrActivityDate_itemChange()
		{
			
				getGDateClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFSYR_ACTIVITY_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FTVFSYR_ACTIVITY_DATE", function=KeyFunction.ITEM_OUT)
		public void ftvfsyrActivityDate_itemOut()
		{
			
				getGDateClass().itemOut();
			}

		
	
	
}

