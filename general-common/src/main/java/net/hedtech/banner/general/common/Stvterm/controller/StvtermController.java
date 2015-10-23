package net.hedtech.banner.general.common.Stvterm.controller;
 
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
import net.hedtech.banner.general.common.Stvterm.model.*;
import net.hedtech.banner.general.common.Stvterm.*;
import net.hedtech.banner.general.common.Stvterm.services.*;
import net.hedtech.general.common.libraries.Goqolib.services.GDateClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GCodeClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GCalendarBtnClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GIconBtnClass;	
		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class StvtermController extends DefaultBlockController {

	private GDateClass getGDateClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GDateClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_DATE_CLASS");
	}	
	private GCodeClass getGCodeClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GCodeClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_CODE_CLASS");
	}	
	private GCalendarBtnClass getGCalendarBtnClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GCalendarBtnClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_CALENDAR_BTN_CLASS");
	}	
	private GIconBtnClass getGIconBtnClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GIconBtnClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_ICON_BTN_CLASS");
	}	

	
	public StvtermController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
		
	@Override
	public StvtermTask getTask() {
		return (StvtermTask)super.getTask();
	}

	public StvtermModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
		/* Original PL/SQL code code for TRIGGER STVTERM.PRE-INSERT
		    :STVTERM_ACTIVITY_DATE := TO_DATE(:CURRENT_DATE, G$_DATE.GET_NLS_DATE_FORMAT) ;
--
   EXECUTE_TRIGGER( 'FA_END_PERIOD' ) ;
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVTERM.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowInsert
		public void stvterm_BeforeRowInsert(RowAdapterEvent args)
		{
			
				StvtermAdapter stvtermElement = (StvtermAdapter)args.getRow();


				stvtermElement.setStvtermActivityDate(toDate(getFormModel().getFormHeader().getCurrentDate(), GDate.getNlsDateFormat()));
				// 
				executeAction("FA_END_PERIOD");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER STVTERM.PRE-UPDATE
		    :STVTERM_ACTIVITY_DATE := TO_DATE(:CURRENT_DATE, G$_DATE.GET_NLS_DATE_FORMAT) ;
--
   EXECUTE_TRIGGER( 'FA_END_PERIOD' ) ;
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVTERM.PRE-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowUpdate
		public void stvterm_BeforeRowUpdate(RowAdapterEvent args)
		{
			
				StvtermAdapter stvtermElement = (StvtermAdapter)args.getRow();


				stvtermElement.setStvtermActivityDate(toDate(getFormModel().getFormHeader().getCurrentDate(), GDate.getNlsDateFormat()));
				// 
				executeAction("FA_END_PERIOD");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER STVTERM.KEY-DELREC
		    IF :STVTERM_SYSTEM_REQ_IND = 'Y' THEN
      MESSAGE (  G$_NLS.Get('STVTERM-0001', 'FORM','*ERROR* Record cannot be deleted when required by the system.')  
          ) ;
      RAISE FORM_TRIGGER_FAILURE ;
   ELSE
      DELETE_RECORD ;
      G$_CHECK_FAILURE ;
   END IF ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVTERM.KEY-DELREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DELREC", function=KeyFunction.DELETE_RECORD)
		public void stvterm_DeleteRecord()
		{
			

				
				StvtermAdapter stvtermElement = (StvtermAdapter)this.getFormModel().getStvterm().getRowAdapter(true);

				if (stvtermElement == null) {return;}

				if ( stvtermElement.getStvtermSystemReqInd().equals("Y") )
				{
					errorMessage(GNls.Fget(toStr("STVTERM-0001"), toStr("FORM"), toStr("*ERROR* Record cannot be deleted when required by the system.")));
					throw new ApplicationException();
				}
				else {
					deleteRecord();
					getTask().getGoqrpls().gCheckFailure();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER STVTERM.FA_END_PERIOD
		    IF (:GLOBAL.SAMSYS IS NULL) or (:global.samsys = 'N')  THEN
      GOTO CONT ;
   END IF ;
--
   G$_CHECK_VALUE ((:STVTERM_FA_TERM IS NULL
      OR  :STVTERM_FA_PROC_YR IS NULL
      OR  (:STVTERM_FA_PERIOD IS NULL
     AND  :STVTERM_FA_END_PERIOD IS NULL)),
       G$_NLS.Get('STVTERM-0002', 'FORM','*ERROR* Financial Aid Year, Term and Periods required.') ,
         TRUE);
--
   << CONT >>
   IF (:STVTERM_FA_PERIOD IS NOT NULL
     AND  :STVTERM_FA_END_PERIOD IS NULL) THEN
      :STVTERM_FA_END_PERIOD := :STVTERM_FA_PERIOD ;
   END IF ;
--
   IF (:STVTERM_FA_PERIOD IS NULL
     AND  :STVTERM_FA_END_PERIOD IS NOT NULL) THEN
      :STVTERM_FA_PERIOD := :STVTERM_FA_END_PERIOD ;
   END IF ;
--
   IF (:STVTERM_FA_PERIOD IS NULL
     AND  :STVTERM_FA_END_PERIOD IS NULL) THEN
      RETURN ;
   ELSE
      GOTO CHECK_PERIODS ;
   END IF ;
--
   << CHECK_PERIODS >>
   G$_CHECK_VALUE (NOT (LPAD(TO_CHAR(:STVTERM_FA_PERIOD), 2, ('0'))
       <= LPAD(TO_CHAR(:STVTERM_FA_END_PERIOD), 2, ('0'))
     AND  (:STVTERM_FA_PERIOD IS NOT NULL
     AND  :STVTERM_FA_END_PERIOD IS NOT NULL)),
 G$_NLS.Get('STVTERM-0003', 'FORM','*ERROR* Fin. aid begin period must be less than or equal to end period.') 
         , TRUE, TRUE);
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVTERM.FA_END_PERIOD
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="FA_END_PERIOD")
		public void stvterm_FaEndPeriod()
		{
			

				
				StvtermAdapter stvtermElement = (StvtermAdapter)this.getFormModel().getStvterm().getRowAdapter(true);

				if (stvtermElement == null) {return;}

				if (!( (getGlobal("SAMSYS").isNull()) || (getGlobal("SAMSYS").equals("N")) ))
				{
					getTask().getGoqrpls().gCheckValue((toBool(stvtermElement.getStvtermFaTerm().isNull() || stvtermElement.getStvtermFaProcYr().isNull() || (stvtermElement.getStvtermFaPeriod().isNull() && stvtermElement.getStvtermFaEndPeriod().isNull()))), GNls.Fget(toStr("STVTERM-0002"), toStr("FORM"), toStr("*ERROR* Financial Aid Year, Term and Periods required.")), toBool(NBool.True));
					// goto CONT;
				}
				// 
				 //CONT:;
				if ((!stvtermElement.getStvtermFaPeriod().isNull() && stvtermElement.getStvtermFaEndPeriod().isNull()))
				{
					stvtermElement.setStvtermFaEndPeriod(stvtermElement.getStvtermFaPeriod());
				}
				// 
				if ((stvtermElement.getStvtermFaPeriod().isNull() && !stvtermElement.getStvtermFaEndPeriod().isNull()))
				{
					stvtermElement.setStvtermFaPeriod(stvtermElement.getStvtermFaEndPeriod());
				}
				// 
				if ((stvtermElement.getStvtermFaPeriod().isNull() && stvtermElement.getStvtermFaEndPeriod().isNull()))
				{
					return ;
				}
//				else {
//					 goto CHECK_PERIODS;
//				}
//				 CHECK_PERIODS:;
				getTask().getGoqrpls().gCheckValue(toBool(!(lpad(toChar(stvtermElement.getStvtermFaPeriod()), 2, (("0")))).lesserOrEquals(lpad(toChar(stvtermElement.getStvtermFaEndPeriod()) , 2, (("0")))) && (!stvtermElement.getStvtermFaPeriod().isNull() && !stvtermElement.getStvtermFaEndPeriod().isNull())), GNls.Fget(toStr("STVTERM-0003"), toStr("FORM"), toStr("*ERROR* Fin. aid begin period must be less than or equal to end period.")), toBool(NBool.True), toBool(NBool.True));
			}

		
		/* Original PL/SQL code code for TRIGGER STVTERM.ON-UPDATE
		 UPDATE STVTERM
SET STVTERM_DESC       = :STVTERM_DESC,
    STVTERM_START_DATE = :STVTERM_START_DATE,
    STVTERM_END_DATE   = :STVTERM_END_DATE,
    STVTERM_TRMT_CODE  = :STVTERM_TRMT_CODE,
    STVTERM_ACYR_CODE  = :STVTERM_ACYR_CODE,
    STVTERM_SYSTEM_REQ_IND = :STVTERM_SYSTEM_REQ_IND,
    STVTERM_ACTIVITY_DATE  = TO_DATE(:CURRENT_DATE, G$_DATE.GET_NLS_DATE_FORMAT),
    STVTERM_HOUSING_START_DATE = :STVTERM_HOUSING_START_DATE,
    STVTERM_HOUSING_END_DATE   = :STVTERM_HOUSING_END_DATE,
    STVTERM_FA_PROC_YR = :STVTERM_FA_PROC_YR,
    STVTERM_FA_SUMMER_IND = :STVTERM_FA_SUMMER_IND,  --80200-1
    STVTERM_FA_TERM    = :STVTERM_FA_TERM,
    STVTERM_FA_PERIOD  = :STVTERM_FA_PERIOD,
    STVTERM_FA_END_PERIOD = :STVTERM_FA_END_PERIOD
WHERE STVTERM_CODE = :STVTERM_CODE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVTERM.ON-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@RowUpdate
		public void stvterm_RowUpdate(RowAdapterEvent args)
		{
			
				StvtermAdapter stvtermElement = (StvtermAdapter)args.getRow();


				int rowCount = 0;
				String sql1 = "UPDATE STVTERM " +
	"SET STVTERM_DESC = :STVTERM_DESC, STVTERM_START_DATE = :STVTERM_START_DATE, STVTERM_END_DATE = :STVTERM_END_DATE, STVTERM_TRMT_CODE = :STVTERM_TRMT_CODE, STVTERM_ACYR_CODE = :STVTERM_ACYR_CODE, STVTERM_SYSTEM_REQ_IND = :STVTERM_SYSTEM_REQ_IND, STVTERM_ACTIVITY_DATE = TO_DATE(:CURRENT_DATE, G$_DATE.GET_NLS_DATE_FORMAT), STVTERM_HOUSING_START_DATE = :STVTERM_HOUSING_START_DATE, STVTERM_HOUSING_END_DATE = :STVTERM_HOUSING_END_DATE, STVTERM_FA_PROC_YR = :STVTERM_FA_PROC_YR, STVTERM_FA_SUMMER_IND = :STVTERM_FA_SUMMER_IND, STVTERM_FA_TERM = :STVTERM_FA_TERM, STVTERM_FA_PERIOD = :STVTERM_FA_PERIOD, STVTERM_FA_END_PERIOD = :STVTERM_FA_END_PERIOD " +
	" WHERE STVTERM_CODE = :STVTERM_CODE";
				DataCommand command1 = new DataCommand(sql1);
				//Setting query parameters
				command1.addParameter("STVTERM_DESC", stvtermElement.getStvtermDesc());
				command1.addParameter("STVTERM_START_DATE", stvtermElement.getStvtermStartDate());
				command1.addParameter("STVTERM_END_DATE", stvtermElement.getStvtermEndDate());
				command1.addParameter("STVTERM_TRMT_CODE", stvtermElement.getStvtermTrmtCode());
				command1.addParameter("STVTERM_ACYR_CODE", stvtermElement.getStvtermAcyrCode());
				command1.addParameter("STVTERM_SYSTEM_REQ_IND", stvtermElement.getStvtermSystemReqInd());
				command1.addParameter("CURRENT_DATE", getFormModel().getFormHeader().getCurrentDate());
				command1.addParameter("STVTERM_HOUSING_START_DATE", stvtermElement.getStvtermHousingStartDate());
				command1.addParameter("STVTERM_HOUSING_END_DATE", stvtermElement.getStvtermHousingEndDate());
				command1.addParameter("STVTERM_FA_PROC_YR", stvtermElement.getStvtermFaProcYr());
				command1.addParameter("STVTERM_FA_SUMMER_IND", stvtermElement.getStvtermFaSummerInd());
				command1.addParameter("STVTERM_FA_TERM", stvtermElement.getStvtermFaTerm());
				command1.addParameter("STVTERM_FA_PERIOD", stvtermElement.getStvtermFaPeriod());
				command1.addParameter("STVTERM_FA_END_PERIOD", stvtermElement.getStvtermFaEndPeriod());
				command1.addParameter("STVTERM_CODE", stvtermElement.getStvtermCode());
				rowCount = command1.execute();
			}

		
		/* Original PL/SQL code code for TRIGGER STVTERM.ON-ERROR
		 DECLARE 
	   lv_errcod  NUMBER       := ERROR_CODE; 
	   lv_errtyp  VARCHAR2(3)  := ERROR_TYPE; 
	   lv_errtxt  VARCHAR2(200) := ERROR_TEXT; 
BEGIN 
 	IF (lv_errcod = 40510) THEN 
      message( G$_NLS.Get('STVTERM-0004', 'FORM',	'*ERROR* This term is in use and cannot be deleted.' ));
		   RAISE Form_Trigger_Failure;
		   
	ELSE 
		Message(lv_errtyp||'-'||to_char(lv_errcod)||': '||lv_errtxt); 
		   RAISE Form_Trigger_Failure; 
	END IF; 

END ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVTERM.ON-ERROR
		 *
		 *
		 *</p>
		 * @param args
		*/

		@OnError
		public void stvterm_OnError(EventObject args)
		{
			
				{
					NNumber lvErrcod = errorCode();
					NString lvErrtyp = NString.getEmpty();
					NString lvErrtxt = errorMessage();
					if ((lvErrcod.equals(40510)))
					{
						errorMessage(GNls.Fget(toStr("STVTERM-0004"), toStr("FORM"), toStr("*ERROR* This term is in use and cannot be deleted.")));
						throw new ApplicationException();
					}
					else {
						errorMessage(lvErrtyp.append("-").append(toChar(lvErrcod)).append(": ").append(lvErrtxt));
						throw new ApplicationException();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER STVTERM.WHEN-NEW-RECORD-INSTANCE
		 --80200-1
	SET_ITEM_PROPERTY('STVTERM_FA_SUMMER_IND', UPDATEABLE ,PROPERTY_TRUE);
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVTERM.WHEN-NEW-RECORD-INSTANCE
		 *
		 *
		 *</p>
		*/

		@After
		@ActionTrigger(action="WHEN-NEW-RECORD-INSTANCE", function=KeyFunction.RECORD_CHANGE)
		public void stvterm_recordChange()
		{
			
				// 80200-1
				// 80200-1
				setItemUpdateAllowed("STVTERM_FA_SUMMER_IND", true);
			}

		
		/* Original PL/SQL code code for TRIGGER STVTERM_CODE.POST-CHANGE
		 BEGIN
   G$_CHECK_QUERY_MODE ;
--
-- This trigger step verifies that the fifth position of the term code
--  entered
-- is numeric.
--
   IF ( :GLOBAL.QUERY_MODE = '1' ) THEN
      GOTO PTI_STEP_001 ;
   END IF ;
   G$_CHECK_VALUE ((SUBSTR(:STVTERM_CODE, 5, 1) NOT BETWEEN '0'
      AND '99'),
 G$_NLS.Get('STVTERM-0005', 'FORM','*ERROR* Last two positions of term code must be numeric.') , TRUE, TRUE);
--
-- This trigger step verifies that the sixth position of the term code
--  entered
-- is numeric
--
   << PTI_STEP_001 >>
   IF ( :GLOBAL.QUERY_MODE = '1' ) THEN
      GOTO PTI_END_TRIGGER ;
   END IF ;
   G$_CHECK_VALUE ((SUBSTR(:STVTERM_CODE, 6, 1) NOT BETWEEN '0'
      AND '99'),
 G$_NLS.Get('STVTERM-0006', 'FORM','*ERROR* Last two positions of term code must be numeric.') , TRUE, TRUE);
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
		 * STVTERM_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="STVTERM_CODE")
		public void stvtermCode_PostChange()
		{
			

				
				StvtermAdapter stvtermElement = (StvtermAdapter)this.getFormModel().getStvterm().getRowAdapter(true);

				if (stvtermElement == null) {return;}

				if(stvtermElement.getStvtermCode().isNull())
		return;
				try
				{
					getTask().getGoqrpls().gCheckQueryMode();
					// 
					//  This trigger step verifies that the fifth position of the term code
					//   entered
					//  is numeric.
					// 
					if (!(getGlobal("QUERY_MODE").equals("1")))
					{
						getTask().getGoqrpls().gCheckValue((toBool(!between(substring(stvtermElement.getStvtermCode(), toInt(5), toInt(1)), "0", "99"))), GNls.Fget(toStr("STVTERM-0005"), toStr("FORM"), toStr("*ERROR* Last two positions of term code must be numeric.")), toBool(NBool.True), toBool(NBool.True));

//						 goto PTI_STEP_001;
					}
//					getTask().getGoqrpls().gCheckValue((toBool(!between(substring(stvtermElement.getStvtermCode(), toInt(5), toInt(1)), "0", "99"))), GNls.Fget(toStr("STVTERM-0005"), toStr("FORM"), toStr("*ERROR* Last two positions of term code must be numeric.")), toBool(NBool.True), toBool(NBool.True));
					 //PTI_STEP_001:;
					if (!(getGlobal("QUERY_MODE").equals("1")))
					{
						getTask().getGoqrpls().gCheckValue((toBool(!between(substring(stvtermElement.getStvtermCode(), toInt(6), toInt(1)), "0", "99"))), GNls.Fget(toStr("STVTERM-0006"), toStr("FORM"), toStr("*ERROR* Last two positions of term code must be numeric.")), toBool(NBool.True), toBool(NBool.True));
//						 goto PTI_END_TRIGGER;
					}
					//getTask().getGoqrpls().gCheckValue((toBool(!between(substring(stvtermElement.getStvtermCode(), toInt(6), toInt(1)), "0", "99"))), GNls.Fget(toStr("STVTERM-0006"), toStr("FORM"), toStr("*ERROR* Last two positions of term code must be numeric.")), toBool(NBool.True), toBool(NBool.True));
//					 PTI_END_TRIGGER:;
					setGlobal("QUERY_MODE", toStr("0"));
				}
				catch(ApplicationException e)
				{
					setGlobal("QUERY_MODE", toStr("0"));
					throw new ApplicationException();
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVTERM_START_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="STVTERM_START_DATE", function=KeyFunction.NEXT_ITEM)
		public void stvtermStartDate_keyNexItem()
		{
			
				getGDateClass().nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVTERM_START_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="STVTERM_START_DATE", function=KeyFunction.ITEM_CHANGE)
		public void stvtermStartDate_itemChange()
		{
			
				getGDateClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVTERM_START_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="STVTERM_START_DATE", function=KeyFunction.ITEM_OUT)
		public void stvtermStartDate_itemOut()
		{
			
				getGDateClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER STVTERM_START_DATE.WHEN-VALIDATE-ITEM
		 if :STVTERM_END_DATE < :STVTERM_START_DATE then
  message( G$_NLS.Get('STVTERM-0007', 'FORM','*ERROR* End Date should be greater than Start Date.') );
  raise form_trigger_failure;
end if;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVTERM_START_DATE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="STVTERM_START_DATE")
		public void stvtermStartDate_validate()
		{
			

				
				StvtermAdapter stvtermElement = (StvtermAdapter)this.getFormModel().getStvterm().getRowAdapter(true);

				if (stvtermElement == null) {return;}

			this.stvtermStartDate_PostChange();

				if ( stvtermElement.getStvtermEndDate().lesser(stvtermElement.getStvtermStartDate()) )
				{
					errorMessage(GNls.Fget(toStr("STVTERM-0007"), toStr("FORM"), toStr("*ERROR* End Date should be greater than Start Date.")));
					throw new ApplicationException();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER STVTERM_START_DATE.POST-CHANGE
		 G$_DATE_REFORMAT('','');
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVTERM_START_DATE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="STVTERM_START_DATE")
		public void stvtermStartDate_PostChange()
		{
			

				
				StvtermAdapter stvtermElement = (StvtermAdapter)this.getFormModel().getStvterm().getRowAdapter(true);

				if (stvtermElement == null) {return;}

				if(stvtermElement.getStvtermStartDate().isNull())
		return;

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVTERM_END_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="STVTERM_END_DATE", function=KeyFunction.NEXT_ITEM)
		public void stvtermEndDate_keyNexItem()
		{
			
				getGDateClass().nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVTERM_END_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="STVTERM_END_DATE", function=KeyFunction.ITEM_CHANGE)
		public void stvtermEndDate_itemChange()
		{
			
				getGDateClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVTERM_END_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="STVTERM_END_DATE", function=KeyFunction.ITEM_OUT)
		public void stvtermEndDate_itemOut()
		{
			
				getGDateClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER STVTERM_END_DATE.WHEN-VALIDATE-ITEM
		 if :STVTERM_END_DATE < :STVTERM_START_DATE then
  message( G$_NLS.Get('STVTERM-0008', 'FORM','*ERROR* End Date should be greater than Start Date.') );
  raise form_trigger_failure;
end if;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVTERM_END_DATE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="STVTERM_END_DATE")
		public void stvtermEndDate_validate()
		{
			

				
				StvtermAdapter stvtermElement = (StvtermAdapter)this.getFormModel().getStvterm().getRowAdapter(true);

				if (stvtermElement == null) {return;}

			this.stvtermEndDate_PostChange();

				if ( stvtermElement.getStvtermEndDate().lesser(stvtermElement.getStvtermStartDate()) )
				{
					errorMessage(GNls.Fget(toStr("STVTERM-0008"), toStr("FORM"), toStr("*ERROR* End Date should be greater than Start Date.")));
					throw new ApplicationException();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER STVTERM_END_DATE.POST-CHANGE
		 G$_DATE_REFORMAT('','');
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVTERM_END_DATE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="STVTERM_END_DATE")
		public void stvtermEndDate_PostChange()
		{
			

				
				StvtermAdapter stvtermElement = (StvtermAdapter)this.getFormModel().getStvterm().getRowAdapter(true);

				if (stvtermElement == null) {return;}

				if(stvtermElement.getStvtermEndDate().isNull())
		return;

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVTERM_TRMT_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="STVTERM_TRMT_CODE")
		public void stvtermTrmtCode_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVTERM_TRMT_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="STVTERM_TRMT_CODE", function=KeyFunction.ITEM_CHANGE)
		public void stvtermTrmtCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVTERM_TRMT_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="STVTERM_TRMT_CODE")
		public void stvtermTrmtCode_GSearchParameters()
		{
			
				getGCodeClass().gSearchParameters();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVTERM_TRMT_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="STVTERM_TRMT_CODE")
		public void stvtermTrmtCode_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVTERM_TRMT_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="STVTERM_TRMT_CODE", function=KeyFunction.NEXT_ITEM)
		public void stvtermTrmtCode_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVTERM_TRMT_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="STVTERM_TRMT_CODE", function=KeyFunction.ITEM_OUT)
		public void stvtermTrmtCode_itemOut()
		{
			
				getGCodeClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER STVTERM_TRMT_CODE.POST-CHANGE
		 BEGIN
   G$_CHECK_QUERY_MODE ;
--
   IF ( :GLOBAL.QUERY_MODE = '1' ) THEN
      GOTO PTI_END_TRIGGER ;
   END IF ;
   DECLARE
      PTI_INTO_TEMP        VARCHAR2(255);
      CURSOR PTI_CURSOR IS
         SELECT 'X'
         FROM   STVTRMT
         WHERE  STVTRMT_CODE = :STVTERM_TRMT_CODE ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO PTI_INTO_TEMP ;
      G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND,
 G$_NLS.Get('STVTERM-0009', 'FORM','*ERROR* Invalid value, press LIST for valid codes.') , TRUE);
      CLOSE PTI_CURSOR ;
   END ;
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
		 * STVTERM_TRMT_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="STVTERM_TRMT_CODE")
		public void stvtermTrmtCode_PostChange()
		{
			

				
				StvtermAdapter stvtermElement = (StvtermAdapter)this.getFormModel().getStvterm().getRowAdapter(true);

				if (stvtermElement == null) {return;}

				int rowCount = 0;
				if(stvtermElement.getStvtermTrmtCode().isNull())
		return;
				try
				{
					getTask().getGoqrpls().gCheckQueryMode();
					// 
					if (!(getGlobal("QUERY_MODE").equals("1")))
					{
//						 goto PTI_END_TRIGGER;
//					}
//					{
						NString ptiIntoTemp= NString.getNull();
						String sqlptiCursor = "SELECT 'X' " +
												" FROM STVTRMT " +
												" WHERE STVTRMT_CODE = :STVTERM_TRMT_CODE ";
						DataCursor ptiCursor = new DataCursor(sqlptiCursor);
						try {
							//Setting query parameters
							ptiCursor.addParameter("STVTERM_TRMT_CODE", stvtermElement.getStvtermTrmtCode());
							ptiCursor.open();
							ResultSet ptiCursorResults = ptiCursor.fetchInto();
							if ( ptiCursorResults != null ) {
								ptiIntoTemp = ptiCursorResults.getStr(0);
							}
							getTask().getGoqrpls().gCheckValue(toBool(ptiCursor.notFound()), GNls.Fget(toStr("STVTERM-0009"), toStr("FORM"), toStr("*ERROR* Invalid value, press LIST for valid codes.")), toBool(NBool.True));
							ptiCursor.close();
						}
						finally{
							ptiCursor.close();
						}
					}
					 //PTI_END_TRIGGER:;
					setGlobal("QUERY_MODE", toStr("0"));
				}
				catch(ApplicationException e)
				{
					setGlobal("QUERY_MODE", toStr("0"));
					throw new ApplicationException();
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVTERM_ACYR_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="STVTERM_ACYR_CODE")
		public void stvtermAcyrCode_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVTERM_ACYR_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="STVTERM_ACYR_CODE", function=KeyFunction.ITEM_CHANGE)
		public void stvtermAcyrCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVTERM_ACYR_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="STVTERM_ACYR_CODE")
		public void stvtermAcyrCode_GSearchParameters()
		{
			
				getGCodeClass().gSearchParameters();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVTERM_ACYR_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="STVTERM_ACYR_CODE")
		public void stvtermAcyrCode_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVTERM_ACYR_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="STVTERM_ACYR_CODE", function=KeyFunction.NEXT_ITEM)
		public void stvtermAcyrCode_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVTERM_ACYR_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="STVTERM_ACYR_CODE", function=KeyFunction.ITEM_OUT)
		public void stvtermAcyrCode_itemOut()
		{
			
				getGCodeClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER STVTERM_ACYR_CODE.POST-CHANGE
		 BEGIN
   G$_CHECK_QUERY_MODE ;
--
   IF ( :GLOBAL.QUERY_MODE = '1' ) THEN
      GOTO PTI_END_TRIGGER ;
   END IF ;
   DECLARE
      PTI_INTO_TEMP        VARCHAR2(255);
      CURSOR PTI_CURSOR IS
         SELECT 'X'
         FROM   STVACYR
         WHERE  STVACYR_CODE = :STVTERM_ACYR_CODE ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO PTI_INTO_TEMP ;
      G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND,
 G$_NLS.Get('STVTERM-0010', 'FORM','*ERROR* Invalid code, press LIST for valid codes.') , TRUE);
      CLOSE PTI_CURSOR;
   END ;
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
		 * STVTERM_ACYR_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="STVTERM_ACYR_CODE")
		public void stvtermAcyrCode_PostChange()
		{
			

				
				StvtermAdapter stvtermElement = (StvtermAdapter)this.getFormModel().getStvterm().getRowAdapter(true);

				if (stvtermElement == null) {return;}

				int rowCount = 0;
				if(stvtermElement.getStvtermAcyrCode().isNull())
		return;
				try
				{
					getTask().getGoqrpls().gCheckQueryMode();
					// 
					if (!(getGlobal("QUERY_MODE").equals("1")))
					{
//						 goto PTI_END_TRIGGER;
//					}
//					{
						NString ptiIntoTemp= NString.getNull();
						String sqlptiCursor = "SELECT 'X' " +
							" FROM STVACYR " +
							" WHERE STVACYR_CODE = :STVTERM_ACYR_CODE ";
						DataCursor ptiCursor = new DataCursor(sqlptiCursor);
						try {
							//Setting query parameters
							ptiCursor.addParameter("STVTERM_ACYR_CODE", stvtermElement.getStvtermAcyrCode());
							ptiCursor.open();
							ResultSet ptiCursorResults = ptiCursor.fetchInto();
							if ( ptiCursorResults != null ) {
								ptiIntoTemp = ptiCursorResults.getStr(0);
							}
							getTask().getGoqrpls().gCheckValue(toBool(ptiCursor.notFound()), GNls.Fget(toStr("STVTERM-0010"), toStr("FORM"), toStr("*ERROR* Invalid code, press LIST for valid codes.")), toBool(NBool.True));
							ptiCursor.close();
						}
						finally{
							ptiCursor.close();
						}
					}
					// PTI_END_TRIGGER:;
					setGlobal("QUERY_MODE", toStr("0"));
				}
				catch(ApplicationException e)
				{
					setGlobal("QUERY_MODE", toStr("0"));
					throw new ApplicationException();
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVTERM_HOUSING_START_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="STVTERM_HOUSING_START_DATE", function=KeyFunction.NEXT_ITEM)
		public void stvtermHousingStartDate_keyNexItem()
		{
			
				getGDateClass().nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVTERM_HOUSING_START_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="STVTERM_HOUSING_START_DATE", function=KeyFunction.ITEM_CHANGE)
		public void stvtermHousingStartDate_itemChange()
		{
			
				getGDateClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVTERM_HOUSING_START_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="STVTERM_HOUSING_START_DATE", function=KeyFunction.ITEM_OUT)
		public void stvtermHousingStartDate_itemOut()
		{
			
				getGDateClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER STVTERM_HOUSING_START_DATE.WHEN-VALIDATE-ITEM
		 if :STVTERM_HOUSING_END_DATE < :STVTERM_HOUSING_START_DATE then
  message( G$_NLS.Get('STVTERM-0011', 'FORM','*ERROR* Housing End Date should be greater than Housing Start Date.') );
  raise form_trigger_failure;
end if;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVTERM_HOUSING_START_DATE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="STVTERM_HOUSING_START_DATE")
		public void stvtermHousingStartDate_validate()
		{
			

				
				StvtermAdapter stvtermElement = (StvtermAdapter)this.getFormModel().getStvterm().getRowAdapter(true);

				if (stvtermElement == null) {return;}
				
			this.stvtermHousingStartDate_PostChange();

				if ( stvtermElement.getStvtermHousingEndDate().lesser(stvtermElement.getStvtermHousingStartDate()) )
				{
					errorMessage(GNls.Fget(toStr("STVTERM-0011"), toStr("FORM"), toStr("*ERROR* Housing End Date should be greater than Housing Start Date.")));
					throw new ApplicationException();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER STVTERM_HOUSING_START_DATE.POST-CHANGE
		 G$_DATE_REFORMAT('','');
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVTERM_HOUSING_START_DATE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="STVTERM_HOUSING_START_DATE")
		public void stvtermHousingStartDate_PostChange()
		{
			

				
				StvtermAdapter stvtermElement = (StvtermAdapter)this.getFormModel().getStvterm().getRowAdapter(true);

				if (stvtermElement == null) {return;}

				if(stvtermElement.getStvtermHousingStartDate().isNull())
		return;

			}

		
		/* Original PL/SQL code code for TRIGGER STVTERM_HOUSING_START_DATE.PRE-TEXT-ITEM
		 IF :GLOBAL.STUSYS IS NULL THEN
   :STVTERM_HOUSING_START_DATE := :STVTERM_START_DATE ;
   :STVTERM_HOUSING_END_DATE := :STVTERM_END_DATE ;
ELSIF
   :GLOBAL.STUSYS <> 'Y' THEN
   :STVTERM_HOUSING_START_DATE := :STVTERM_START_DATE ;
   :STVTERM_HOUSING_END_DATE := :STVTERM_END_DATE ;
END IF ;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVTERM_HOUSING_START_DATE.PRE-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="PRE-TEXT-ITEM", item="STVTERM_HOUSING_START_DATE", function=KeyFunction.ITEM_IN)
		public void stvtermHousingStartDate_itemIn()
		{
			

				
				StvtermAdapter stvtermElement = (StvtermAdapter)this.getFormModel().getStvterm().getRowAdapter(true);

				if (stvtermElement == null) {return;}

				if ( getGlobal("STUSYS").isNull() )
				{
					stvtermElement.setStvtermHousingStartDate(stvtermElement.getStvtermStartDate());
					stvtermElement.setStvtermHousingEndDate(stvtermElement.getStvtermEndDate());
				}
				else if ( getGlobal("STUSYS").notEquals("Y") ) {
					stvtermElement.setStvtermHousingStartDate(stvtermElement.getStvtermStartDate());
					stvtermElement.setStvtermHousingEndDate(stvtermElement.getStvtermEndDate());
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVTERM_HOUSING_END_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="STVTERM_HOUSING_END_DATE", function=KeyFunction.NEXT_ITEM)
		public void stvtermHousingEndDate_keyNexItem()
		{
			
				getGDateClass().nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVTERM_HOUSING_END_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="STVTERM_HOUSING_END_DATE", function=KeyFunction.ITEM_CHANGE)
		public void stvtermHousingEndDate_itemChange()
		{
			
				getGDateClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVTERM_HOUSING_END_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="STVTERM_HOUSING_END_DATE", function=KeyFunction.ITEM_OUT)
		public void stvtermHousingEndDate_itemOut()
		{
			
				getGDateClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER STVTERM_HOUSING_END_DATE.WHEN-VALIDATE-ITEM
		 if :STVTERM_HOUSING_END_DATE < :STVTERM_HOUSING_START_DATE then
  message( G$_NLS.Get('STVTERM-0012', 'FORM','*ERROR* Housing End Date should be greater than Housing Start Date.') );
  raise form_trigger_failure;
end if;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVTERM_HOUSING_END_DATE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="STVTERM_HOUSING_END_DATE")
		public void stvtermHousingEndDate_validate()
		{
			

				
				StvtermAdapter stvtermElement = (StvtermAdapter)this.getFormModel().getStvterm().getRowAdapter(true);

				if (stvtermElement == null) {return;}

			this.stvtermHousingEndDate_PostChange();

				if ( stvtermElement.getStvtermHousingEndDate().lesser(stvtermElement.getStvtermHousingStartDate()) )
				{
					errorMessage(GNls.Fget(toStr("STVTERM-0012"), toStr("FORM"), toStr("*ERROR* Housing End Date should be greater than Housing Start Date.")));
					throw new ApplicationException();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER STVTERM_HOUSING_END_DATE.POST-CHANGE
		 G$_DATE_REFORMAT('','');
G$_CHECK_FAILURE;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVTERM_HOUSING_END_DATE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="STVTERM_HOUSING_END_DATE")
		public void stvtermHousingEndDate_PostChange()
		{
			

				
				StvtermAdapter stvtermElement = (StvtermAdapter)this.getFormModel().getStvterm().getRowAdapter(true);

				if (stvtermElement == null) {return;}

				if(stvtermElement.getStvtermHousingEndDate().isNull())
		return;

			}

		
		/* Original PL/SQL code code for TRIGGER STVTERM_HOUSING_END_DATE.PRE-TEXT-ITEM
		 IF :GLOBAL.STUSYS IS NULL THEN
   :STVTERM_HOUSING_END_DATE := :STVTERM_END_DATE ;
ELSIF
   :GLOBAL.STUSYS <> 'Y' THEN
   :STVTERM_HOUSING_END_DATE := :STVTERM_END_DATE ;
END IF ;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVTERM_HOUSING_END_DATE.PRE-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="PRE-TEXT-ITEM", item="STVTERM_HOUSING_END_DATE", function=KeyFunction.ITEM_IN)
		public void stvtermHousingEndDate_itemIn()
		{
			

				
				StvtermAdapter stvtermElement = (StvtermAdapter)this.getFormModel().getStvterm().getRowAdapter(true);

				if (stvtermElement == null) {return;}
				
				if ( getGlobal("STUSYS").isNull() )
				{
					stvtermElement.setStvtermHousingEndDate(stvtermElement.getStvtermEndDate());
				}
				else if ( getGlobal("STUSYS").notEquals("Y") ) {
					stvtermElement.setStvtermHousingEndDate(stvtermElement.getStvtermEndDate());
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVTERM_ACTIVITY_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="STVTERM_ACTIVITY_DATE", function=KeyFunction.NEXT_ITEM)
		public void stvtermActivityDate_keyNexItem()
		{
			
				getGDateClass().nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVTERM_ACTIVITY_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="STVTERM_ACTIVITY_DATE", function=KeyFunction.ITEM_CHANGE)
		public void stvtermActivityDate_itemChange()
		{
			
				getGDateClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVTERM_ACTIVITY_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="STVTERM_ACTIVITY_DATE", function=KeyFunction.ITEM_OUT)
		public void stvtermActivityDate_itemOut()
		{
			
				getGDateClass().itemOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVTERM_START_DATE_DBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="STVTERM_START_DATE_DBT")
		public void stvtermStartDateDbt_click()
		{
			
				getGCalendarBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVTERM_START_DATE_DBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="STVTERM_START_DATE_DBT")
		public void stvtermStartDateDbt_buttonClick()
		{
			
				getGCalendarBtnClass().whenButtonPressed();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVTERM_END_DATE_DBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="STVTERM_END_DATE_DBT")
		public void stvtermEndDateDbt_click()
		{
			
				getGCalendarBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVTERM_END_DATE_DBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="STVTERM_END_DATE_DBT")
		public void stvtermEndDateDbt_buttonClick()
		{
			
				getGCalendarBtnClass().whenButtonPressed();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVTERM_HOUSING_START_DATE_DBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="STVTERM_HOUSING_START_DATE_DBT")
		public void stvtermHousingStartDateDbt_click()
		{
			
				getGCalendarBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVTERM_HOUSING_START_DATE_DBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="STVTERM_HOUSING_START_DATE_DBT")
		public void stvtermHousingStartDateDbt_buttonClick()
		{
			
				getGCalendarBtnClass().whenButtonPressed();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVTERM_HOUSING_END_DATE_DBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="STVTERM_HOUSING_END_DATE_DBT")
		public void stvtermHousingEndDateDbt_click()
		{
			
				getGCalendarBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVTERM_HOUSING_END_DATE_DBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="STVTERM_HOUSING_END_DATE_DBT")
		public void stvtermHousingEndDateDbt_buttonClick()
		{
			
				getGCalendarBtnClass().whenButtonPressed();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVTERM_TRMT_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="STVTERM_TRMT_CODE_LBT")
		public void stvtermTrmtCodeLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVTERM_ACYR_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="STVTERM_ACYR_CODE_LBT")
		public void stvtermAcyrCodeLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVTERM_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="STVTERM_CODE")
		public void stvtermCode_validate()
		{
			
				StvtermAdapter stvtermElement = (StvtermAdapter)this.getFormModel().getStvterm().getRowAdapter(true);
							this.stvtermCode_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVTERM.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void stvterm_AfterQuery(RowAdapterEvent args)
		{
			
			StvtermAdapter stvtermElement = (StvtermAdapter)args.getRow();			
						
				try {
				stvtermElement.setLockDbValues(true);
                                 try {  
                                this.stvtermCode_PostChange(); 
                                } catch(Exception ex) { 
                                } 
                                 try {  
                                this.stvtermStartDate_PostChange(); 
                                } catch(Exception ex) { 
                                } 
                                 try {  
                                this.stvtermEndDate_PostChange(); 
                                } catch(Exception ex) { 
                                } 
                                 try {  
                                this.stvtermTrmtCode_PostChange(); 
                                } catch(Exception ex) { 
                                } 
                                 try {  
                                this.stvtermAcyrCode_PostChange(); 
                                } catch(Exception ex) { 
                                } 
                                 try {  
                                this.stvtermHousingStartDate_PostChange(); 
                                } catch(Exception ex) { 
                                } 
                                 try {  
                                this.stvtermHousingEndDate_PostChange(); 
                                } catch(Exception ex) { 
                                } 

				 
			
						} finally {
							stvtermElement.setLockDbValues(false);
						}
						

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVTERM_TRMT_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="STVTERM_TRMT_CODE")
		public void stvtermTrmtCode_validate()
		{
			
				StvtermAdapter stvtermElement = (StvtermAdapter)this.getFormModel().getStvterm().getRowAdapter(true);
							this.stvtermTrmtCode_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVTERM_ACYR_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="STVTERM_ACYR_CODE")
		public void stvtermAcyrCode_validate()
		{
			
				StvtermAdapter stvtermElement = (StvtermAdapter)this.getFormModel().getStvterm().getRowAdapter(true);
							this.stvtermAcyrCode_PostChange();

			}

		
	
	
}

