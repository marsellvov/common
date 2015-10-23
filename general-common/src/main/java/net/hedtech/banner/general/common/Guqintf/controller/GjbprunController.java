package net.hedtech.banner.general.common.Guqintf.controller;
 
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
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;

import net.hedtech.banner.general.common.Guqintf.model.*;
import net.hedtech.banner.general.common.Guqintf.*;
import net.hedtech.banner.general.common.Guqintf.services.*;

		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class GjbprunController extends DefaultBlockController {


	
	public GjbprunController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
		
	@Override
	public GuqintfTask getTask() {
		return (GuqintfTask)super.getTask();
	}

	public GuqintfModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
		/* Original PL/SQL code code for TRIGGER GJBPRUN.PRE-INSERT
		 -- KPATKAR 03/01 for 4.2
--
SYNCHRONIZE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GJBPRUN.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowInsert
		public void gjbprun_BeforeRowInsert(RowAdapterEvent args)
		{
			
				//  KPATKAR 03/01 for 4.2
				// 
				//  KPATKAR 03/01 for 4.2
				// 
				// F2J_TO_REMOVE : Call to built-in "SYNCHRONIZE" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GUQINTFF2NMigrationGuide.xml#ExcludeSynchronize".
				//				SupportClasses.SQLFORMS.Synchronize();
				this.getLogger().trace(this, "// F2J_TO_REMOVE : Call to built-in 'SYNCHRONIZE' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GUQINTFF2NMigrationGuide.xml#ExcludeSynchronize'.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER GJBPRUN.POST-INSERT
		    EXECUTE_TRIGGER( 'INS_PRUN' ) ;
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GJBPRUN.POST-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterRowInsert
		public void gjbprun_AfterRowInsert(RowAdapterEvent args)
		{
			
				executeAction("INS_PRUN");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GJBPRUN.PRE-UPDATE
		    EXECUTE_TRIGGER( 'INS_PRUN' ) ;
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GJBPRUN.PRE-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowUpdate
		public void gjbprun_BeforeRowUpdate(RowAdapterEvent args)
		{
			
				executeAction("INS_PRUN");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GJBPRUN.CALC_ONE_UP_NO
		    DECLARE
      CURSOR PTI_CURSOR IS
         SELECT GJBPSEQ.NEXTVAL
         FROM   DUAL ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO :HOLD_ONE_UP_NO ;
      G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND, NULL, TRUE);
   END ;
--
   :ONE_UP_NO := :HOLD_ONE_UP_NO ;
   :GLOBAL.ONE_UP_NO := :ONE_UP_NO ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GJBPRUN.CALC_ONE_UP_NO
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="CALC_ONE_UP_NO")
		public void gjbprun_CalcOneUpNo()
		{
			
				int rowCount = 0;
				{
					String sqlptiCursor = "SELECT GJBPSEQ.NEXTVAL " +
	" FROM DUAL ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							getFormModel().getDummy().setHoldOneUpNo(ptiCursorResults.getNumber(0));
						}
						getTask().getGoqrpls().gCheckValue(toBool(ptiCursor.notFound()), toStr(null), toBool(NBool.True));
					}
					finally{
						ptiCursor.close();
					}
				}
				// 
				getFormModel().getDummy().setOneUpNo(getFormModel().getDummy().getHoldOneUpNo());
				setGlobal("ONE_UP_NO", toStr(getFormModel().getDummy().getOneUpNo()));
			}

		
		/* Original PL/SQL code code for TRIGGER GJBPRUN.COPY_DEFAULTS
		    :GJBPRUN_JOB := 'DEFAULT' ;
   :GJBPRUN_ONE_UP_NO := '9999999999' ;
   :GJBPRUN_NUMBER := '00' ;
   :GJBPRUN_VALUE := 'DEFAULT' ;
   :GJBPRUN_ACTIVITY_DATE := SYSDATE ;
  
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GJBPRUN.COPY_DEFAULTS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="COPY_DEFAULTS")
		public void gjbprun_CopyDefaults()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				GjbprunAdapter gjbprunElement = (GjbprunAdapter)this.getFormModel().getGjbprun().getRowAdapter(true);


				gjbprunElement.setGjbprunJob(toStr("DEFAULT"));
				gjbprunElement.setGjbprunOneUpNo(toNumber("9999999999"));
				gjbprunElement.setGjbprunNumber(toStr("00"));
				gjbprunElement.setGjbprunValue(toStr("DEFAULT"));
				gjbprunElement.setGjbprunActivityDate(NDate.getNow());
			}

		
		/* Original PL/SQL code code for TRIGGER GJBPRUN.INS_PRUN
		 BEGIN
  IF (:GLOBAL.CALL_FORM = 'TSASPAY' AND 
          :GLOBAL.JOB_ID = 'RPEDISB') THEN
    EXECUTE_TRIGGER( 'CALC_ONE_UP_NO' ) ;
    IF NOT FORM_SUCCESS THEN
       RETURN ;
    END IF ;
    :GLOBAL.ONE_UP_NO := :HOLD_ONE_UP_NO ;
    EXECUTE_TRIGGER( 'INS_PRUN_RPEDISB' ) ;
  ELSIF :GLOBAL.CALL_FORM = 'SMARQCM' THEN
    EXECUTE_TRIGGER('CALC_ONE_UP_NO');
    IF NOT FORM_SUCCESS THEN
      RETURN;
    END IF;
    :GLOBAL.ONE_UP_NO := :HOLD_ONE_UP_NO;
    EXECUTE_TRIGGER('INS_PRUN_SMRCMPL');
  ELSIF :GLOBAL.CALL_FORM IS NULL  THEN
    NULL ;
  END IF ;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GJBPRUN.INS_PRUN
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="INS_PRUN")
		public void gjbprun_InsPrun()
		{
			
				if ((getGlobal("CALL_FORM").equals("TSASPAY") && getGlobal("JOB_ID").equals("RPEDISB")))
				{
					try{
						executeAction("CALC_ONE_UP_NO");
					}
					catch (Exception e){
						return;
					}
					setGlobal("ONE_UP_NO", toStr(getFormModel().getDummy().getHoldOneUpNo()));
					executeAction("INS_PRUN_RPEDISB");
				}
				else if ( getGlobal("CALL_FORM").equals("SMARQCM") ) {
					executeAction("CALC_ONE_UP_NO");
					try{
						executeAction("CALC_ONE_UP_NO");
					}
					catch (Exception e){
						return;
					}
					setGlobal("ONE_UP_NO", toStr(getFormModel().getDummy().getHoldOneUpNo()));
					executeAction("INS_PRUN_SMRCMPL");
				}
				else if ( getGlobal("CALL_FORM").isNull() ) {
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GJBPRUN.INS_PRUN_RPEDISB
		 BEGIN
  :HOLD_ID := :GLOBAL.KEY_ID ;
  :HOLD_AIDY_CODE := :GLOBAL.AIDY_CODE ;
  :HOLD_PERIOD    := :GLOBAL.PERIOD;  
  :GLOBAL.CALL_DISPLAY_MSG :=
       G$_NLS.Get('GUQINTF-0024', 'FORM','** Running Disbursements...Please Wait **')  ;
--
  INSERT INTO GJBPRUN
   ( GJBPRUN_JOB, GJBPRUN_ONE_UP_NO, GJBPRUN_NUMBER,
     GJBPRUN_ACTIVITY_DATE, GJBPRUN_VALUE )
  SELECT GJBPDEF_JOB, :HOLD_ONE_UP_NO, GJBPDEF_NUMBER, SYSDATE,
     DECODE(GJBPDEF_NUMBER, 1, :HOLD_AIDY_CODE, 2, 'O', 3,
     :HOLD_PERIOD, 4, :HOLD_ID, 5, 'N', '')
    FROM GJBPDEF
   WHERE GJBPDEF_JOB = 'RPEDISB' ;
--
   G$_CHECK_VALUE (SQL%NOTFOUND,
       G$_NLS.Get('GUQINTF-0025', 'FORM','*ERROR* Could not insert parameters for Disbursements.') ,TRUE);
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GJBPRUN.INS_PRUN_RPEDISB
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="INS_PRUN_RPEDISB")
		public void gjbprun_InsPrunRpedisb()
		{
			
				int rowCount = 0;
				getFormModel().getDummy().setHoldId(getGlobal("KEY_ID"));
				getFormModel().getDummy().setHoldAidyCode(getGlobal("AIDY_CODE"));
				getFormModel().getDummy().setHoldPeriod(getGlobal("PERIOD"));
				setGlobal("CALL_DISPLAY_MSG", GNls.Fget(toStr("GUQINTF-0024"), toStr("FORM"), toStr("** Running Disbursements...Please Wait **")));
				// 
				String sql1 = "INSERT INTO GJBPRUN " +
	"(GJBPRUN_JOB, GJBPRUN_ONE_UP_NO, GJBPRUN_NUMBER, GJBPRUN_ACTIVITY_DATE, GJBPRUN_VALUE)" +
	"SELECT GJBPDEF_JOB, :HOLD_ONE_UP_NO, GJBPDEF_NUMBER, SYSDATE, DECODE(GJBPDEF_NUMBER, 1, :HOLD_AIDY_CODE, 2, 'O', 3, :HOLD_PERIOD, 4, :HOLD_ID, 5, 'N', '') " +
	" FROM GJBPDEF " +
	" WHERE GJBPDEF_JOB = 'RPEDISB' ";
				DataCommand command1 = new DataCommand(sql1);
				//Setting query parameters
				command1.addParameter("HOLD_ONE_UP_NO", getFormModel().getDummy().getHoldOneUpNo());
				command1.addParameter("HOLD_AIDY_CODE", getFormModel().getDummy().getHoldAidyCode());
				command1.addParameter("HOLD_PERIOD", getFormModel().getDummy().getHoldPeriod());
				command1.addParameter("HOLD_ID", getFormModel().getDummy().getHoldId());
				rowCount = command1.execute();
				// 
				getTask().getGoqrpls().gCheckValue(toBool(rowCount == 0), GNls.Fget(toStr("GUQINTF-0025"), toStr("FORM"), toStr("*ERROR* Could not insert parameters for Disbursements.")), toBool(NBool.True));
			}

		
		/* Original PL/SQL code code for TRIGGER GJBPRUN.INS_PRUN_SMRCMPL
		    :HOLD_ID_REQUEST_NO := (:GLOBAL.KEY_ID || ',' || :GLOBAL.REQUEST_NO);
   :GLOBAL.CALL_DISPLAY_MSG :=
       G$_NLS.Get('GUQINTF-0026', 'FORM','** Running Compliance...Please Wait **')  ;
--
   INSERT INTO GJBPRUN
    ( GJBPRUN_JOB, GJBPRUN_ONE_UP_NO, GJBPRUN_NUMBER,
       GJBPRUN_ACTIVITY_DATE, GJBPRUN_VALUE )
   SELECT GJBPDEF_JOB, :HOLD_ONE_UP_NO, GJBPDEF_NUMBER, SYSDATE,
           :HOLD_ID_REQUEST_NO
   FROM   GJBPDEF
   WHERE  GJBPDEF_JOB = 'SMRCMPL' ;
  IF SQL%NOTFOUND THEN
  MESSAGE( G$_NLS.Get('GUQINTF-0027', 'FORM','*ERROR* Could not insert parameters for Compliance.') );
  RAISE FORM_TRIGGER_FAILURE;
  END IF;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GJBPRUN.INS_PRUN_SMRCMPL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="INS_PRUN_SMRCMPL")
		public void gjbprun_InsPrunSmrcmpl()
		{
			
				int rowCount = 0;
				getFormModel().getDummy().setHoldIdRequestNo(((getGlobal("KEY_ID").append(",").append(getGlobal("REQUEST_NO")))));
				setGlobal("CALL_DISPLAY_MSG", GNls.Fget(toStr("GUQINTF-0026"), toStr("FORM"), toStr("** Running Compliance...Please Wait **")));
				// 
				String sql1 = "INSERT INTO GJBPRUN " +
	"(GJBPRUN_JOB, GJBPRUN_ONE_UP_NO, GJBPRUN_NUMBER, GJBPRUN_ACTIVITY_DATE, GJBPRUN_VALUE)" +
	"SELECT GJBPDEF_JOB, :HOLD_ONE_UP_NO, GJBPDEF_NUMBER, SYSDATE, :HOLD_ID_REQUEST_NO " +
	" FROM GJBPDEF " +
	" WHERE GJBPDEF_JOB = 'SMRCMPL' ";
				DataCommand command1 = new DataCommand(sql1);
				//Setting query parameters
				command1.addParameter("HOLD_ONE_UP_NO", getFormModel().getDummy().getHoldOneUpNo());
				command1.addParameter("HOLD_ID_REQUEST_NO", getFormModel().getDummy().getHoldIdRequestNo());
				rowCount = command1.execute();
				if ( rowCount == 0 )
				{
					errorMessage(GNls.Fget(toStr("GUQINTF-0027"), toStr("FORM"), toStr("*ERROR* Could not insert parameters for Compliance.")));
					throw new ApplicationException();
				}
			}

		
	
	
}

