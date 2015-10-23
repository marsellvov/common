package net.hedtech.banner.general.common.Guainst.controller;
 
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

import net.hedtech.banner.general.common.Guainst.model.*;
import net.hedtech.banner.general.common.Guainst.*;
import net.hedtech.banner.general.common.Guainst.services.*;
import net.hedtech.general.common.libraries.Goqolib.services.GDateClass;
import net.hedtech.general.common.libraries.Goqolib.services.GCodeClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GDescClass;	

		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class GubinstController extends DefaultBlockController {

	private GCodeClass getGCodeClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GCodeClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_CODE_CLASS");
	}	
	private GDescClass getGDescClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GDescClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_DESC_CLASS");
	}	
	private GDateClass getGDateClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GDateClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_DATE_CLASS");
	}	

	
	public GubinstController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
		
	@Override
	public GuainstTask getTask() {
		return (GuainstTask)super.getTask();
	}

	public GuainstModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
		/* Original PL/SQL code code for TRIGGER GUBINST.PRE-INSERT
		 :GUBINST_ACTIVITY_DATE := TO_DATE(:CURRENT_DATE,G$_DATE.GET_NLS_DATE_FORMAT) ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBINST.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowInsert
		public void gubinst_BeforeRowInsert(RowAdapterEvent args)
		{
			
				GubinstAdapter gubinstElement = (GubinstAdapter)args.getRow();


				gubinstElement.setGubinstActivityDate(toDate(getFormModel().getFormHeader().getCurrentDate(), GDate.getNlsDateFormat()));
			}

		
		/* Original PL/SQL code code for TRIGGER GUBINST.PRE-UPDATE
		 :GUBINST_ACTIVITY_DATE := TO_DATE(:CURRENT_DATE,G$_DATE.GET_NLS_DATE_FORMAT) ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBINST.PRE-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowUpdate
		public void gubinst_BeforeRowUpdate(RowAdapterEvent args)
		{
			
				GubinstAdapter gubinstElement = (GubinstAdapter)args.getRow();


				gubinstElement.setGubinstActivityDate(toDate(getFormModel().getFormHeader().getCurrentDate(), GDate.getNlsDateFormat()));
			}

		
		/* Original PL/SQL code code for TRIGGER GUBINST.PRE-DELETE
		    G$_CHECK_VALUE ((:GUBINST_KEY = 'INST'),
       G$_NLS.Get('GUAINST-0004', 'FORM','*ERROR* Cannot delete the INST record.') , TRUE);
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBINST.PRE-DELETE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowDelete
		public void gubinst_BeforeRowDelete(RowAdapterEvent args)
		{
			
				GubinstAdapter gubinstElement = (GubinstAdapter)args.getRow();


				getTask().getGoqrpls().gCheckValue((toBool(gubinstElement.getGubinstKey().equals("INST"))), GNls.Fget(toStr("GUAINST-0004"), toStr("FORM"), toStr("*ERROR* Cannot delete the INST record.")), toBool(NBool.True));
			}

		
		/* Original PL/SQL code code for TRIGGER GUBINST.POST-QUERY
		 SET_FORM_PROPERTY(NAME_IN('SYSTEM.CURRENT_FORM'),VALIDATION, PROPERTY_OFF);
:SYSTEM.MESSAGE_LEVEL := '5';
EXECUTE_TRIGGER('POST_QUERY_TRG');
:SYSTEM.MESSAGE_LEVEL := '0';
SET_FORM_PROPERTY(NAME_IN('SYSTEM.CURRENT_FORM'),VALIDATION,PROPERTY_ON);
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBINST.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void gubinst_AfterQuery(RowAdapterEvent args)
		{
			
				GubinstAdapter gubinstElement = (GubinstAdapter)args.getRow();


				try
				{
					gubinstElement.setLockDbValues(true);
                                                                 try {  
                        this.gubinstStatCode_PostChange(); 
                        } catch(Exception ex) { 
                        } 
                                                                 try {  
                        this.gubinstNatnCode_PostChange(); 
                        } catch(Exception ex) { 
                        } 
                                                                 try {  
                        this.gubinstHighedGovtInd_PostChange(); 
                        } catch(Exception ex) { 
                        } 
                                                                 try {  
                                                                this.gubinstBaseCurrCode_PostChange(); 
                                                                } catch(Exception ex) { 
                                                                } 


				} finally { 
					gubinstElement.setLockDbValues(false);
				}
				try { 
				this.getTask().setValidationEnabled(false);
				MessageServices.setMessageLevel(MessageLevel.NONE);
				executeAction("POST_QUERY_TRG");
				} finally {
				MessageServices.resetMessageLevel();
				this.getTask().setValidationEnabled(true);
				}
				
			}

		
		/* Original PL/SQL code code for TRIGGER GUBINST.POST_QUERY_TRG
		 EXECUTE_TRIGGER('GET_GURVERS');
--
IF  :GUBINST_STUDENT_INSTALLED = 'Y'
    THEN EXECUTE_TRIGGER('GET_SURVERS');
END IF;
IF  :GUBINST_ALUMNI_INSTALLED = 'Y'
    THEN EXECUTE_TRIGGER('GET_AURVERS');
END IF;
IF  :GUBINST_FINANCE_INSTALLED = 'Y'
    THEN EXECUTE_TRIGGER('GET_FURVERS');
END IF;
IF  :GUBINST_HUMANRE_INSTALLED = 'Y'
    THEN EXECUTE_TRIGGER('GET_PURVERS');
END IF;
IF  :GUBINST_POSBUD_INSTALLED = 'Y'
    THEN EXECUTE_TRIGGER('GET_NURVERS');
END IF;
IF  :GUBINST_BILCSH_INSTALLED = 'Y'
    THEN EXECUTE_TRIGGER('GET_TURVERS');
END IF;
IF  :GUBINST_FINAID_INSTALLED = 'Y'
    THEN EXECUTE_TRIGGER('GET_RURVERS');
END IF;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBINST.POST_QUERY_TRG
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST_QUERY_TRG")
		public void gubinst_PostQueryTrg()
		{
			

				GubinstAdapter gubinstElement = (GubinstAdapter)this.getFormModel().getGubinst().getRowAdapter(true);
				
				if (gubinstElement == null) {
					return;
				}

				executeAction("GET_GURVERS");
				if ( gubinstElement.getGubinstStudentInstalled().equals("Y") )
				{
					executeAction("GET_SURVERS");
				}
				if ( gubinstElement.getGubinstAlumniInstalled().equals("Y") )
				{
					executeAction("GET_AURVERS");
				}
				if ( gubinstElement.getGubinstFinanceInstalled().equals("Y") )
				{
					executeAction("GET_FURVERS");
				}
				if ( gubinstElement.getGubinstHumanreInstalled().equals("Y") )
				{
					executeAction("GET_PURVERS");
				}
				if ( gubinstElement.getGubinstPosbudInstalled().equals("Y") )
				{
					executeAction("GET_NURVERS");
				}
				if ( gubinstElement.getGubinstBilcshInstalled().equals("Y") )
				{
					executeAction("GET_TURVERS");
				}
				if ( gubinstElement.getGubinstFinaidInstalled().equals("Y") )
				{
					executeAction("GET_RURVERS");
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GUBINST.GET_GURVERS
		 DECLARE
  RETREL  VARCHAR2(10);
  RETDATE DATE;
BEGIN
  GENUTIL.SMAX_RELEASE('GURVERS',RETREL,RETDATE);
--
  :GENERAL_RELEASE := RETREL;
  :GENERAL_STAGE_DATE := RETDATE;
  :GUBINST_GENERAL_INSTALLED := 'Y';
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBINST.GET_GURVERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="GET_GURVERS")
		public void gubinst_GetGurvers()
		{
			
				GubinstAdapter gubinstElement = (GubinstAdapter)this.getFormModel().getGubinst().getRowAdapter(true);
				if (gubinstElement == null) {
					return;
				}
					NString retrel= NString.getNull();
					NDate retdate= NDate.getNull();
					Ref<NString> maxrel_ref = new Ref<NString>(retrel);
					Ref<NDate> reldate_ref = new Ref<NDate>(retdate);
					Genutil.smaxRelease(toStr("GURVERS"), maxrel_ref, reldate_ref);
					retrel = maxrel_ref.val;
					retdate = reldate_ref.val;
					// 
					gubinstElement.setGeneralRelease(retrel);
					gubinstElement.setGeneralStageDate(retdate);
					gubinstElement.setGubinstGeneralInstalled(toStr("Y"));
			}

		
		/* Original PL/SQL code code for TRIGGER GUBINST.GET_AURVERS
		 DECLARE
  RETREL  VARCHAR2(10);
  RETDATE DATE;
BEGIN
  IF :GUBINST_ALUMNI_INSTALLED = 'Y' THEN
    GENUTIL.SMAX_RELEASE('AURVERS',RETREL,RETDATE);
--
    :ALUMNI_RELEASE := RETREL;
    :ALUMNI_STAGE_DATE := RETDATE;
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBINST.GET_AURVERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="GET_AURVERS")
		public void gubinst_GetAurvers()
		{

				GubinstAdapter gubinstElement = (GubinstAdapter)this.getFormModel().getGubinst().getRowAdapter(true);
				if (gubinstElement == null) {
					return;
				}
					NString retrel= NString.getNull();
					NDate retdate= NDate.getNull();
					if ( gubinstElement.getGubinstAlumniInstalled().equals("Y") )
					{
						Ref<NString> maxrel_ref = new Ref<NString>(retrel);
						Ref<NDate> reldate_ref = new Ref<NDate>(retdate);
						Genutil.smaxRelease(toStr("AURVERS"), maxrel_ref, reldate_ref);
						retrel = maxrel_ref.val;
						retdate = reldate_ref.val;
						gubinstElement.setAlumniRelease(retrel);
						gubinstElement.setAlumniStageDate(retdate);
					}
			}

		
		/* Original PL/SQL code code for TRIGGER GUBINST.GET_FURVERS
		 DECLARE
  RETREL  VARCHAR2(10);
  RETDATE DATE;
BEGIN
  IF :GUBINST_FINANCE_INSTALLED = 'Y' THEN
    GENUTIL.SMAX_RELEASE('FURVERS',RETREL,RETDATE);
--
    :FINANCE_RELEASE := RETREL;
    :FINANCE_STAGE_DATE := RETDATE;
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBINST.GET_FURVERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="GET_FURVERS")
		public void gubinst_GetFurvers()
		{
				GubinstAdapter gubinstElement = (GubinstAdapter)this.getFormModel().getGubinst().getRowAdapter(true);
				if (gubinstElement == null) {
					return;
				}
					NString retrel= NString.getNull();
					NDate retdate= NDate.getNull();
					if ( gubinstElement.getGubinstFinanceInstalled().equals("Y") )
					{
						Ref<NString> maxrel_ref = new Ref<NString>(retrel);
						Ref<NDate> reldate_ref = new Ref<NDate>(retdate);
						Genutil.smaxRelease(toStr("FURVERS"), maxrel_ref, reldate_ref);
						retrel = maxrel_ref.val;
						retdate = reldate_ref.val;
						// 
						gubinstElement.setFinanceRelease(retrel);
						gubinstElement.setFinanceStageDate(retdate);
					}
			}

		
		/* Original PL/SQL code code for TRIGGER GUBINST.GET_NURVERS
		 DECLARE
  RETREL  VARCHAR2(10);
  RETDATE DATE;
BEGIN
  IF :GUBINST_POSBUD_INSTALLED = 'Y' THEN
    GENUTIL.SMAX_RELEASE('NURVERS',RETREL,RETDATE);
--
    :POSBUD_RELEASE := RETREL;
    :POSBUD_STAGE_DATE := RETDATE;
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBINST.GET_NURVERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="GET_NURVERS")
		public void gubinst_GetNurvers()
		{
				GubinstAdapter gubinstElement = (GubinstAdapter)this.getFormModel().getGubinst().getRowAdapter(true);
				if (gubinstElement == null) {
					return;
				}
					NString retrel= NString.getNull();
					NDate retdate= NDate.getNull();
					if ( gubinstElement.getGubinstPosbudInstalled().equals("Y") )
					{
						Ref<NString> maxrel_ref = new Ref<NString>(retrel);
						Ref<NDate> reldate_ref = new Ref<NDate>(retdate);
						Genutil.smaxRelease(toStr("NURVERS"), maxrel_ref, reldate_ref);
						retrel = maxrel_ref.val;
						retdate = reldate_ref.val;
						gubinstElement.setPosbudRelease(retrel);
						gubinstElement.setPosbudStageDate(retdate);
					}
			}

		
		/* Original PL/SQL code code for TRIGGER GUBINST.GET_PURVERS
		 DECLARE
  RETREL  VARCHAR2(10);
  RETDATE DATE;
BEGIN
  IF :GUBINST_HUMANRE_INSTALLED = 'Y' THEN
    GENUTIL.SMAX_RELEASE('PURVERS',RETREL,RETDATE);
--
    :HUMANRE_RELEASE := RETREL;
    :HUMANRE_STAGE_DATE := RETDATE;
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBINST.GET_PURVERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="GET_PURVERS")
		public void gubinst_GetPurvers()
		{
				GubinstAdapter gubinstElement = (GubinstAdapter)this.getFormModel().getGubinst().getRowAdapter(true);
				if (gubinstElement == null) {
					return;
				}
					NString retrel= NString.getNull();
					NDate retdate= NDate.getNull();
					if ( gubinstElement.getGubinstHumanreInstalled().equals("Y") )
					{
						Ref<NString> maxrel_ref = new Ref<NString>(retrel);
						Ref<NDate> reldate_ref = new Ref<NDate>(retdate);
						Genutil.smaxRelease(toStr("PURVERS"), maxrel_ref, reldate_ref);
						retrel = maxrel_ref.val;
						retdate = reldate_ref.val;
						gubinstElement.setHumanreRelease(retrel);
						gubinstElement.setHumanreStageDate(retdate);
					}
			}

		
		/* Original PL/SQL code code for TRIGGER GUBINST.GET_RURVERS
		 DECLARE
  RETREL  VARCHAR2(10);
  RETDATE DATE;
BEGIN
  IF :GUBINST_FINAID_INSTALLED = 'Y' THEN
    GENUTIL.SMAX_RELEASE('RURVERS',RETREL,RETDATE);
--
    :FINAID_RELEASE := RETREL;
    :FINAID_STAGE_DATE := RETDATE;
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBINST.GET_RURVERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="GET_RURVERS")
		public void gubinst_GetRurvers()
		{
				GubinstAdapter gubinstElement = (GubinstAdapter)this.getFormModel().getGubinst().getRowAdapter(true);
				if (gubinstElement == null) {
					return;
				}
					NString retrel= NString.getNull();
					NDate retdate= NDate.getNull();
					if ( gubinstElement.getGubinstFinaidInstalled().equals("Y") )
					{
						Ref<NString> maxrel_ref = new Ref<NString>(retrel);
						Ref<NDate> reldate_ref = new Ref<NDate>(retdate);
						Genutil.smaxRelease(toStr("RURVERS"), maxrel_ref, reldate_ref);
						retrel = maxrel_ref.val;
						retdate = reldate_ref.val;
						gubinstElement.setFinaidRelease(retrel);
						gubinstElement.setFinaidStageDate(retdate);
					}
			}

		
		/* Original PL/SQL code code for TRIGGER GUBINST.GET_TURVERS
		 DECLARE
  RETREL  VARCHAR2(10);
  RETDATE DATE;
BEGIN
  IF :GUBINST_BILCSH_INSTALLED = 'Y' THEN
    GENUTIL.SMAX_RELEASE('TURVERS',RETREL,RETDATE);
--
    :BILCSH_RELEASE := RETREL;
    :BILCSH_STAGE_DATE := RETDATE;
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBINST.GET_TURVERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="GET_TURVERS")
		public void gubinst_GetTurvers()
		{
				GubinstAdapter gubinstElement = (GubinstAdapter)this.getFormModel().getGubinst().getRowAdapter(true);
				if (gubinstElement == null) {
					return;
				}
					NString retrel= NString.getNull();
					NDate retdate= NDate.getNull();
					if ( gubinstElement.getGubinstBilcshInstalled().equals("Y") )
					{
						Ref<NString> maxrel_ref = new Ref<NString>(retrel);
						Ref<NDate> reldate_ref = new Ref<NDate>(retdate);
						Genutil.smaxRelease(toStr("TURVERS"), maxrel_ref, reldate_ref);
						retrel = maxrel_ref.val;
						retdate = reldate_ref.val;
						gubinstElement.setBilcshRelease(retrel);
						gubinstElement.setBilcshStageDate(retdate);
					}
			}

		
		/* Original PL/SQL code code for TRIGGER GUBINST.GET_SURVERS
		 DECLARE
  RETREL  VARCHAR2(10);
  RETDATE DATE;
BEGIN
  IF :GUBINST_STUDENT_INSTALLED = 'Y' THEN
    GENUTIL.SMAX_RELEASE('SURVERS',RETREL,RETDATE);
--
    :STUDENT_RELEASE := RETREL;
    :STUDENT_STAGE_DATE := RETDATE;
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBINST.GET_SURVERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="GET_SURVERS")
		public void gubinst_GetSurvers()
		{
				GubinstAdapter gubinstElement = (GubinstAdapter)this.getFormModel().getGubinst().getRowAdapter(true);
				if (gubinstElement == null) {
					return;
				}
					NString retrel= NString.getNull();
					NDate retdate= NDate.getNull();
					if ( gubinstElement.getGubinstStudentInstalled().equals("Y") )
					{
						Ref<NString> maxrel_ref = new Ref<NString>(retrel);
						Ref<NDate> reldate_ref = new Ref<NDate>(retdate);
						Genutil.smaxRelease(toStr("SURVERS"), maxrel_ref, reldate_ref);
						retrel = maxrel_ref.val;
						retdate = reldate_ref.val;
						gubinstElement.setStudentRelease(retrel);
						gubinstElement.setStudentStageDate(retdate);
					}
			}

		
		/* Original PL/SQL code code for TRIGGER GUBINST_NAME.WHEN-NEW-ITEM-INSTANCE
		 begin
G$_Navigation_Frame.Disable_Option('MAIN_WINDOW','W');
G$_Navigation_Frame.Enable_Option('GUBINST','B');
end;
 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBINST_NAME.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="GUBINST_NAME", function=KeyFunction.ITEM_CHANGE)
		public void gubinstName_itemChange()
		{
				getTask().getGoqrpls().getGNavigationFrame().disableOption(toStr("MAIN_WINDOW"), toStr("W"));
				getTask().getGoqrpls().getGNavigationFrame().enableOption(toStr("GUBINST"), toStr("B"));
			}

		
		/* Original PL/SQL code code for TRIGGER GUBINST_STAT_CODE.POST-CHANGE
		 BEGIN
   G$_CHECK_QUERY_MODE ;
--
   IF ( :GLOBAL.QUERY_MODE = '1' ) THEN
      GOTO PTI_END_TRIGGER ;
   END IF ;
   DECLARE
      PTI_INTO_TEMP        VARCHAR2(255);
      CURSOR PTI_CURSOR IS
         SELECT STVSTAT_CODE
         FROM   STVSTAT
         WHERE  STVSTAT_CODE = :GUBINST_STAT_CODE ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO PTI_INTO_TEMP ;
      G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND,
 G$_NLS.Get('GUAINST-0005', 'FORM','*ERROR* Invalid code; press LIST for valid codes.') , TRUE);
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
		 * GUBINST_STAT_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="GUBINST_STAT_CODE")
		public void gubinstStatCode_PostChange()
		{
			

				GubinstAdapter gubinstElement = (GubinstAdapter)this.getFormModel().getGubinst().getRowAdapter(true);
				if (gubinstElement == null) {
					return;
				}
				int rowCount = 0;
				if(gubinstElement.getGubinstStatCode().isNull())
		return;
				try
				{
					getTask().getGoqrpls().gCheckQueryMode();
					if ((getGlobal("QUERY_MODE").equals("1")))
					{
						 setGlobal("QUERY_MODE", toStr("0"));
					}
					{
						NString ptiIntoTemp= NString.getNull();
						String sqlptiCursor = "SELECT STVSTAT_CODE " +
	" FROM STVSTAT " +
	" WHERE STVSTAT_CODE = :GUBINST_STAT_CODE ";
						DataCursor ptiCursor = new DataCursor(sqlptiCursor);
						try {
							ptiCursor.addParameter("GUBINST_STAT_CODE", gubinstElement.getGubinstStatCode());
							ptiCursor.open();
							ResultSet ptiCursorResults = ptiCursor.fetchInto();
							if ( ptiCursorResults != null ) {
								ptiIntoTemp = ptiCursorResults.getStr(0);
							}
							getTask().getGoqrpls().gCheckValue(toBool(ptiCursor.notFound()), GNls.Fget(toStr("GUAINST-0005"), toStr("FORM"), toStr("*ERROR* Invalid code; press LIST for valid codes.")), toBool(NBool.True));
						}
						finally{
							ptiCursor.close();
						}
					}
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
		 * GUBINST_NATN_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="GUBINST_NATN_CODE")
		public void gubinstNatnCode_doubleClick()
		{
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBINST_NATN_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="GUBINST_NATN_CODE", function=KeyFunction.ITEM_CHANGE)
		public void gubinstNatnCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBINST_NATN_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="GUBINST_NATN_CODE")
		public void gubinstNatnCode_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBINST_NATN_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="GUBINST_NATN_CODE", function=KeyFunction.NEXT_ITEM)
		public void gubinstNatnCode_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBINST_NATN_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="GUBINST_NATN_CODE", function=KeyFunction.ITEM_OUT)
		public void gubinstNatnCode_itemOut()
		{
			
				getGCodeClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER GUBINST_NATN_CODE.G$_SEARCH_PARAMETERS
		 G$_SEARCH.PARAMETERS('STVNATN_CODE',
		     'STVNATN_NATION');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBINST_NATN_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="GUBINST_NATN_CODE")
		public void gubinstNatnCode_GSearchParameters()
		{
			
				getTask().getGoqrpls().getGSearch().parameters(toStr("STVNATN_CODE"), toStr("STVNATN_NATION"));
			}

		
		/* Original PL/SQL code code for TRIGGER GUBINST_NATN_CODE.POST-CHANGE
		 BEGIN
   G$_CHECK_QUERY_MODE ;
--
   DECLARE
      CURSOR PTI_CURSOR IS
         SELECT STVNATN_NATION
         FROM   STVNATN
         WHERE  STVNATN_CODE = :GUBINST_NATN_CODE ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO :NATN_DESCRIPTION ;
      G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND,
 G$_NLS.Get('GUAINST-0006', 'FORM','*ERROR* Invalid code; press LIST for valid codes.') , TRUE);
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
		 * GUBINST_NATN_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="GUBINST_NATN_CODE")
		public void gubinstNatnCode_PostChange()
		{
				GubinstAdapter gubinstElement = (GubinstAdapter)this.getFormModel().getGubinst().getRowAdapter(true);
				if (gubinstElement == null) {
					return;
				}
				int rowCount = 0;
				if(gubinstElement.getGubinstNatnCode().isNull())
		return;
				try
				{
					getTask().getGoqrpls().gCheckQueryMode();
					{
						String sqlptiCursor = "SELECT STVNATN_NATION " +
	" FROM STVNATN " +
	" WHERE STVNATN_CODE = :GUBINST_NATN_CODE ";
						DataCursor ptiCursor = new DataCursor(sqlptiCursor);
						try {
							ptiCursor.addParameter("GUBINST_NATN_CODE", gubinstElement.getGubinstNatnCode());
							ptiCursor.open();
							ResultSet ptiCursorResults = ptiCursor.fetchInto();
							if ( ptiCursorResults != null ) {
								gubinstElement.setNatnDescription(ptiCursorResults.getStr(0));
							}
							getTask().getGoqrpls().gCheckValue(toBool(ptiCursor.notFound()), GNls.Fget(toStr("GUAINST-0006"), toStr("FORM"), toStr("*ERROR* Invalid code; press LIST for valid codes.")), toBool(NBool.True));
						}
						finally{
							ptiCursor.close();
						}
					}
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
		 * NATN_DESCRIPTION.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="NATN_DESCRIPTION", function=KeyFunction.ITEM_CHANGE)
		public void natnDescription_itemChange()
		{
			
				getGDescClass().itemChange();
			}

		
		/* Original PL/SQL code code for TRIGGER GUBINST_HIGHED_GOVT_IND.POST-CHANGE
		 BEGIN
   G$_CHECK_QUERY_MODE ;
--
   IF :GUBINST_HIGHED_GOVT_IND NOT IN ('H', 'G', 'K', 'C')
      THEN
      MESSAGE (
          G$_NLS.Get('GUAINST-0007', 'FORM','*ERROR* Installation type must be H,G,K or C.')  ) ;
      RAISE FORM_TRIGGER_FAILURE ;
   END IF ;
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
		 * GUBINST_HIGHED_GOVT_IND.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="GUBINST_HIGHED_GOVT_IND")
		public void gubinstHighedGovtInd_PostChange()
		{
				GubinstAdapter gubinstElement = (GubinstAdapter)this.getFormModel().getGubinst().getRowAdapter(true);
				if (gubinstElement == null) {
					return;
				}
				if(gubinstElement.getGubinstHighedGovtInd().isNull())
		return;
				try
				{
					getTask().getGoqrpls().gCheckQueryMode();
					if ( !in(gubinstElement.getGubinstHighedGovtInd(), "H", "G", "K", "C").getValue() )
					{
						errorMessage(GNls.Fget(toStr("GUAINST-0007"), toStr("FORM"), toStr("*ERROR* Installation type must be H,G,K or C.")));
						throw new ApplicationException();
					}
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
		 * GUBINST_BASE_CURR_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="GUBINST_BASE_CURR_CODE")
		public void gubinstBaseCurrCode_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBINST_BASE_CURR_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="GUBINST_BASE_CURR_CODE", function=KeyFunction.ITEM_CHANGE)
		public void gubinstBaseCurrCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBINST_BASE_CURR_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="GUBINST_BASE_CURR_CODE")
		public void gubinstBaseCurrCode_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBINST_BASE_CURR_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="GUBINST_BASE_CURR_CODE", function=KeyFunction.NEXT_ITEM)
		public void gubinstBaseCurrCode_keyNexItem()
		{
			this.gubinstBaseCurrCode_PostChange();
				getGCodeClass().keyNexItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBINST_BASE_CURR_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="GUBINST_BASE_CURR_CODE", function=KeyFunction.ITEM_OUT)
		public void gubinstBaseCurrCode_itemOut()
		{
			
				getGCodeClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER GUBINST_BASE_CURR_CODE.G$_SEARCH_PARAMETERS
		 :WORK_DATETIME := TO_DATE(:EFFDATE_EFF_DATE_TIME,'YYYYMMDDHH24MISS');
G$_SEARCH.PARAMETERS('GTVCURR_CURR_CODE',
 		     'GTVCURR_TITLE',
                      G$_SEARCH_WHERE.F_GTVCURR_KEY(':WORK_DATETIME'));
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBINST_BASE_CURR_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="GUBINST_BASE_CURR_CODE")
		public void gubinstBaseCurrCode_GSearchParameters()
		{
				getFormModel().getFormHeader().setWorkDatetime(toDate(getFormModel().getFormHeader().getEffdateEffDateTime(), "YYYYMMDDHH24MISS"));
				getTask().getGoqrpls().getGSearch().parameters(toStr("GTVCURR_CURR_CODE"), toStr("GTVCURR_TITLE"), getTask().getGoqrpls().getGSearchWhere().fGtvcurrKey(toStr(":WORK_DATETIME")));
			}

		
		/* Original PL/SQL code code for TRIGGER GUBINST_BASE_CURR_CODE.POST-CHANGE
		 BEGIN
   G$_CHECK_QUERY_MODE ;
--
   EXECUTE_TRIGGER( 'VALIDATE_CURR_CODE' ) ;
   G$_CHECK_FAILURE ;
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
		 * GUBINST_BASE_CURR_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="GUBINST_BASE_CURR_CODE")
		public void gubinstBaseCurrCode_PostChange()
		{
				GubinstAdapter gubinstElement = (GubinstAdapter)this.getFormModel().getGubinst().getRowAdapter(true);
				if (gubinstElement == null) {
					return;
				}
				if(gubinstElement.getGubinstBaseCurrCode().isNull())
		return;
				try
				{
					getTask().getGoqrpls().gCheckQueryMode();
					executeAction("VALIDATE_CURR_CODE");
					getTask().getGoqrpls().gCheckFailure();
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
		 * CURR_TITLE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="CURR_TITLE", function=KeyFunction.ITEM_CHANGE)
		public void currTitle_itemChange()
		{
			
				getGDescClass().itemChange();
			}

		
		/* Original PL/SQL code code for TRIGGER GUBINST_ONLINE_MATCH_IND.WHEN-CHECKBOX-CHANGED
		 BEGIN
--  DISPLAY_ENABLED_IND_ALERT('All Users must exit and restart SCT Banner for '
--                            || 'the value of Messaging Enabled to take effect.');
NULL;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBINST_ONLINE_MATCH_IND.WHEN-CHECKBOX-CHANGED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-CHECKBOX-CHANGED", item="GUBINST_ONLINE_MATCH_IND")
		public void gubinstOnlineMatchInd_checkBoxChange()
		{
			}

		
		/* Original PL/SQL code code for TRIGGER GUBINST_WF_ENABLED_IND.WHEN-CHECKBOX-CHANGED
		 BEGIN
  DISPLAY_ENABLED_IND_ALERT(G$_NLS.Get('GUAINST-0008','FORM','All Users must exit and restart Banner for the value of Workflow Enabled to take effect.'));
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBINST_WF_ENABLED_IND.WHEN-CHECKBOX-CHANGED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-CHECKBOX-CHANGED", item="GUBINST_WF_ENABLED_IND")
		public void gubinstWfEnabledInd_checkBoxChange()
		{
			
				this.getTask().getServices().displayEnabledIndAlert(GNls.Fget(toStr("GUAINST-0008"), toStr("FORM"), toStr("All Users must exit and restart Banner for the value of Workflow Enabled to take effect.")));
			}

		
		/* Original PL/SQL code code for TRIGGER GUBINST_SQLTRACE_ENABLED_IND.WHEN-CHECKBOX-CHANGED
		 BEGIN
  DISPLAY_ENABLED_IND_ALERT(G$_NLS.Get('GUAINST-0009','FORM','All Users must exit and restart Banner for the value of SQL Trace Enabled to take effect.'));
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBINST_SQLTRACE_ENABLED_IND.WHEN-CHECKBOX-CHANGED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-CHECKBOX-CHANGED", item="GUBINST_SQLTRACE_ENABLED_IND")
		public void gubinstSqltraceEnabledInd_checkBoxChange()
		{
			
				this.getTask().getServices().displayEnabledIndAlert(GNls.Fget(toStr("GUAINST-0009"), toStr("FORM"), toStr("All Users must exit and restart Banner for the value of SQL Trace Enabled to take effect.")));
			}

		
		/* Original PL/SQL code code for TRIGGER GUBINST_MESSAGE_ENABLED_IND.WHEN-CHECKBOX-CHANGED
		 BEGIN
  DISPLAY_ENABLED_IND_ALERT(G$_NLS.Get('GUAINST-0010','FORM','All Users must exit and restart Banner for the value of Messaging Enabled to take effect.'));
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBINST_MESSAGE_ENABLED_IND.WHEN-CHECKBOX-CHANGED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-CHECKBOX-CHANGED", item="GUBINST_MESSAGE_ENABLED_IND")
		public void gubinstMessageEnabledInd_checkBoxChange()
		{
			
				this.getTask().getServices().displayEnabledIndAlert(GNls.Fget(toStr("GUAINST-0010"), toStr("FORM"), toStr("All Users must exit and restart Banner for the value of Messaging Enabled to take effect.")));
			}

		
		/* Original PL/SQL code code for TRIGGER GUBINST_SSN_SEARCH_ENABLED_IND.WHEN-CHECKBOX-CHANGED
		 BEGIN
  DISPLAY_ENABLED_IND_ALERT(G$_NLS.Get('GUAINST-0011','FORM','All Users must exit and restart Banner for the value of SSN/SIN/TIN Search Enabled to take effect.'));
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBINST_SSN_SEARCH_ENABLED_IND.WHEN-CHECKBOX-CHANGED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-CHECKBOX-CHANGED", item="GUBINST_SSN_SEARCH_ENABLED_IND")
		public void gubinstSsnSearchEnabledInd_checkBoxChange()
		{
			
				this.getTask().getServices().displayEnabledIndAlert(GNls.Fget(toStr("GUAINST-0011"), toStr("FORM"), toStr("All Users must exit and restart Banner for the value of SSN/SIN/TIN Search Enabled to take effect.")));
			}

		
		/* Original PL/SQL code code for TRIGGER GUBINST_GENERAL_INSTALLED.WHEN-CHECKBOX-CHANGED
		 :GUBINST_GENERAL_INSTALLED := 'Y' ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBINST_GENERAL_INSTALLED.WHEN-CHECKBOX-CHANGED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-CHECKBOX-CHANGED", item="GUBINST_GENERAL_INSTALLED")
		public void gubinstGeneralInstalled_checkBoxChange()
		{
				GubinstAdapter gubinstElement = (GubinstAdapter)this.getFormModel().getGubinst().getRowAdapter(true);
				if (gubinstElement == null) {
					return;
				}
				gubinstElement.setGubinstGeneralInstalled(toStr("Y"));
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBINST_ACTIVITY_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="GUBINST_ACTIVITY_DATE", function=KeyFunction.NEXT_ITEM)
		public void gubinstActivityDate_keyNexItem()
		{
			
				getGDateClass().nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBINST_ACTIVITY_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="GUBINST_ACTIVITY_DATE", function=KeyFunction.ITEM_CHANGE)
		public void gubinstActivityDate_itemChange()
		{
			
				getGDateClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBINST_ACTIVITY_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="GUBINST_ACTIVITY_DATE", function=KeyFunction.ITEM_OUT)
		public void gubinstActivityDate_itemOut()
		{
			
				getGDateClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER GUBINST_ALUMNI_INSTALLED.POST_FIELD
		 
   IF :GUBINST_ALUMNI_INSTALLED = 'Y' THEN
      RETURN ;
   END IF ;
--
   :ALUMNI_RELEASE := '' ;
   :ALUMNI_STAGE_DATE := '' ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBINST_ALUMNI_INSTALLED.POST_FIELD
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST_FIELD", item="GUBINST_ALUMNI_INSTALLED")
		public void gubinstAlumniInstalled_PostField()
		{
				GubinstAdapter gubinstElement = (GubinstAdapter)this.getFormModel().getGubinst().getRowAdapter(true);
				if (gubinstElement == null) {
					return;
				}
				if ( gubinstElement.getGubinstAlumniInstalled().equals("Y") )
				{
					return ;
				}
				gubinstElement.setAlumniRelease(toStr(""));
				gubinstElement.setAlumniStageDate(toDate(""));
			}

		
		/* Original PL/SQL code code for TRIGGER GUBINST_ALUMNI_INSTALLED.WHEN-NEW-ITEM-INSTANCE
		 G$_Navigation_Frame.Disable_Option('GUBINST','B');
G$_Navigation_Frame.Enable_Option('MAIN_WINDOW','W');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBINST_ALUMNI_INSTALLED.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="GUBINST_ALUMNI_INSTALLED", function=KeyFunction.ITEM_CHANGE)
		public void gubinstAlumniInstalled_itemChange()
		{
				getTask().getGoqrpls().getGNavigationFrame().disableOption(toStr("GUBINST"), toStr("B"));
				getTask().getGoqrpls().getGNavigationFrame().enableOption(toStr("MAIN_WINDOW"), toStr("W"));
			}

		
		/* Original PL/SQL code code for TRIGGER GUBINST_ALUMNI_INSTALLED.WHEN-CHECKBOX-CHANGED
		 
EXECUTE_TRIGGER('POST_FIELD');
IF :GUBINST_ALUMNI_INSTALLED = 'Y' THEN
   EXECUTE_TRIGGER('GET_AURVERS');
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBINST_ALUMNI_INSTALLED.WHEN-CHECKBOX-CHANGED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-CHECKBOX-CHANGED", item="GUBINST_ALUMNI_INSTALLED")
		public void gubinstAlumniInstalled_checkBoxChange()
		{
				GubinstAdapter gubinstElement = (GubinstAdapter)this.getFormModel().getGubinst().getRowAdapter(true);
				if (gubinstElement == null) {
					return;
				}
				gubinstAlumniInstalled_PostField();
				if ( gubinstElement.getGubinstAlumniInstalled().equals("Y") )
				{
					executeAction("GET_AURVERS");
				}
				
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ALUMNI_STAGE_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="ALUMNI_STAGE_DATE", function=KeyFunction.NEXT_ITEM)
		public void alumniStageDate_keyNexItem()
		{
				getGDateClass().nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ALUMNI_STAGE_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="ALUMNI_STAGE_DATE", function=KeyFunction.ITEM_CHANGE)
		public void alumniStageDate_itemChange()
		{
				getGDateClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ALUMNI_STAGE_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="ALUMNI_STAGE_DATE", function=KeyFunction.ITEM_OUT)
		public void alumniStageDate_itemOut()
		{
			
				getGDateClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER GUBINST_COURTS_INSTALLED.POST_FIELD
		    IF :GUBINST_COURTS_INSTALLED = 'Y' THEN
      RETURN ;
   END IF ;
--
   :COURTS_RELEASE := '' ;
   :COURTS_STAGE_DATE := '' ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBINST_COURTS_INSTALLED.POST_FIELD
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST_FIELD", item="GUBINST_COURTS_INSTALLED")
		public void gubinstCourtsInstalled_PostField()
		{
				GubinstAdapter gubinstElement = (GubinstAdapter)this.getFormModel().getGubinst().getRowAdapter(true);
				if (gubinstElement == null) {
					return;
				}
				if ( gubinstElement.getGubinstCourtsInstalled().equals("Y") )
				{
					return ;
				}
				gubinstElement.setCourtsRelease(toStr(""));
				gubinstElement.setCourtsStageDate(toDate(""));
			}

		
		/* Original PL/SQL code code for TRIGGER GUBINST_COURTS_INSTALLED.WHEN-CHECKBOX-CHANGED
		 EXECUTE_TRIGGER('POST_FIELD');
IF :GUBINST_COURTS_INSTALLED = 'Y' THEN
   EXECUTE_TRIGGER('GET_CURVERS');
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBINST_COURTS_INSTALLED.WHEN-CHECKBOX-CHANGED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-CHECKBOX-CHANGED", item="GUBINST_COURTS_INSTALLED")
		public void gubinstCourtsInstalled_checkBoxChange()
		{
				GubinstAdapter gubinstElement = (GubinstAdapter)this.getFormModel().getGubinst().getRowAdapter(true);
				if (gubinstElement == null) {
					return;
				}
				gubinstCourtsInstalled_PostField();
				if ( gubinstElement.getGubinstCourtsInstalled().equals("Y") )
				{
					executeAction("GET_CURVERS");
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * COURTS_STAGE_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="COURTS_STAGE_DATE", function=KeyFunction.NEXT_ITEM)
		public void courtsStageDate_keyNexItem()
		{
			
				getGDateClass().nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * COURTS_STAGE_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="COURTS_STAGE_DATE", function=KeyFunction.ITEM_CHANGE)
		public void courtsStageDate_itemChange()
		{
			
				getGDateClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * COURTS_STAGE_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="COURTS_STAGE_DATE", function=KeyFunction.ITEM_OUT)
		public void courtsStageDate_itemOut()
		{
			
				getGDateClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER GUBINST_BILCSH_INSTALLED.POST_FIELD
		    IF :GUBINST_BILCSH_INSTALLED = 'Y' THEN
      RETURN ;
   END IF ;
--
   :BILCSH_RELEASE := '' ;
   :BILCSH_STAGE_DATE := '' ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBINST_BILCSH_INSTALLED.POST_FIELD
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST_FIELD", item="GUBINST_BILCSH_INSTALLED")
		public void gubinstBilcshInstalled_PostField()
		{
				GubinstAdapter gubinstElement = (GubinstAdapter)this.getFormModel().getGubinst().getRowAdapter(true);
				if (gubinstElement == null) {
					return;
				}
				if ( gubinstElement.getGubinstBilcshInstalled().equals("Y") )
				{
					return ;
				}
				gubinstElement.setBilcshRelease(toStr(""));
				gubinstElement.setBilcshStageDate(toDate(""));
			}

		
		/* Original PL/SQL code code for TRIGGER GUBINST_BILCSH_INSTALLED.WHEN-CHECKBOX-CHANGED
		 EXECUTE_TRIGGER('POST_FIELD');
IF :GUBINST_BILCSH_INSTALLED = 'Y' THEN
   EXECUTE_TRIGGER('GET_TURVERS');
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBINST_BILCSH_INSTALLED.WHEN-CHECKBOX-CHANGED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-CHECKBOX-CHANGED", item="GUBINST_BILCSH_INSTALLED")
		public void gubinstBilcshInstalled_checkBoxChange()
		{
				GubinstAdapter gubinstElement = (GubinstAdapter)this.getFormModel().getGubinst().getRowAdapter(true);
				if (gubinstElement == null) {
					return;
				}
				gubinstBilcshInstalled_PostField();
				if ( gubinstElement.getGubinstBilcshInstalled().equals("Y") )
				{
					executeAction("GET_TURVERS");
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * BILCSH_STAGE_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="BILCSH_STAGE_DATE", function=KeyFunction.NEXT_ITEM)
		public void bilcshStageDate_keyNexItem()
		{
			
				getGDateClass().nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * BILCSH_STAGE_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="BILCSH_STAGE_DATE", function=KeyFunction.ITEM_CHANGE)
		public void bilcshStageDate_itemChange()
		{
			
				getGDateClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * BILCSH_STAGE_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="BILCSH_STAGE_DATE", function=KeyFunction.ITEM_OUT)
		public void bilcshStageDate_itemOut()
		{
			
				getGDateClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER GUBINST_CASHREC_INSTALLED.POST_FIELD
		    IF :GUBINST_CASHREC_INSTALLED = 'Y' THEN
      RETURN ;
   END IF ;
--
   :CASHREC_RELEASE := '' ;
   :CASHREC_STAGE_DATE := '' ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBINST_CASHREC_INSTALLED.POST_FIELD
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST_FIELD", item="GUBINST_CASHREC_INSTALLED")
		public void gubinstCashrecInstalled_PostField()
		{
				GubinstAdapter gubinstElement = (GubinstAdapter)this.getFormModel().getGubinst().getRowAdapter(true);
				if (gubinstElement == null) {
					return;
				}
				if ( gubinstElement.getGubinstCashrecInstalled().equals("Y") )
				{
					return ;
				}
				gubinstElement.setCashrecRelease(toStr(""));
				gubinstElement.setCashrecStageDate(toDate(""));
			}

		
		/* Original PL/SQL code code for TRIGGER GUBINST_CASHREC_INSTALLED.WHEN-CHECKBOX-CHANGED
		 EXECUTE_TRIGGER('POST_FIELD');
IF :GUBINST_CASHREC_INSTALLED = 'Y' THEN
   EXECUTE_TRIGGER('GET_DURVERS');
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBINST_CASHREC_INSTALLED.WHEN-CHECKBOX-CHANGED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-CHECKBOX-CHANGED", item="GUBINST_CASHREC_INSTALLED")
		public void gubinstCashrecInstalled_checkBoxChange()
		{
				GubinstAdapter gubinstElement = (GubinstAdapter)this.getFormModel().getGubinst().getRowAdapter(true);
				if (gubinstElement == null) {
					return;
				}
				gubinstCashrecInstalled_PostField();
				if ( gubinstElement.getGubinstCashrecInstalled().equals("Y") )
				{
					executeAction("GET_DURVERS");
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * CASHREC_STAGE_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="CASHREC_STAGE_DATE", function=KeyFunction.NEXT_ITEM)
		public void cashrecStageDate_keyNexItem()
		{
			
				getGDateClass().nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * CASHREC_STAGE_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="CASHREC_STAGE_DATE", function=KeyFunction.ITEM_CHANGE)
		public void cashrecStageDate_itemChange()
		{
			
				getGDateClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * CASHREC_STAGE_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="CASHREC_STAGE_DATE", function=KeyFunction.ITEM_OUT)
		public void cashrecStageDate_itemOut()
		{
			
				getGDateClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER GUBINST_FINAID_INSTALLED.POST_FIELD
		    IF :GUBINST_FINAID_INSTALLED = 'Y' THEN
      :GUBINST_FINAID_IND := '';
      RETURN ;
   END IF ;
--
   :FINAID_RELEASE := '' ;
   :FINAID_STAGE_DATE := '' ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBINST_FINAID_INSTALLED.POST_FIELD
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST_FIELD", item="GUBINST_FINAID_INSTALLED")
		public void gubinstFinaidInstalled_PostField()
		{
				GubinstAdapter gubinstElement = (GubinstAdapter)this.getFormModel().getGubinst().getRowAdapter(true);
				if (gubinstElement == null) {
					return;
				}
				if ( gubinstElement.getGubinstFinaidInstalled().equals("Y") )
				{
					gubinstElement.setGubinstFinaidInd(toStr(""));
					return ;
				}
				gubinstElement.setFinaidRelease(toStr(""));
				gubinstElement.setFinaidStageDate(toDate(""));
			}

		
		/* Original PL/SQL code code for TRIGGER GUBINST_FINAID_INSTALLED.WHEN-CHECKBOX-CHANGED
		 EXECUTE_TRIGGER('POST_FIELD');
IF :GUBINST_FINAID_INSTALLED = 'Y' THEN
   EXECUTE_TRIGGER('GET_RURVERS');
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBINST_FINAID_INSTALLED.WHEN-CHECKBOX-CHANGED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-CHECKBOX-CHANGED", item="GUBINST_FINAID_INSTALLED")
		public void gubinstFinaidInstalled_checkBoxChange()
		{
				GubinstAdapter gubinstElement = (GubinstAdapter)this.getFormModel().getGubinst().getRowAdapter(true);
				if (gubinstElement == null) {
					return;
				}
				gubinstFinaidInstalled_PostField();
				if ( gubinstElement.getGubinstFinaidInstalled().equals("Y") )
				{
					executeAction("GET_RURVERS");
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FINAID_STAGE_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FINAID_STAGE_DATE", function=KeyFunction.NEXT_ITEM)
		public void finaidStageDate_keyNexItem()
		{
			
				getGDateClass().nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FINAID_STAGE_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FINAID_STAGE_DATE", function=KeyFunction.ITEM_CHANGE)
		public void finaidStageDate_itemChange()
		{
			
				getGDateClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FINAID_STAGE_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FINAID_STAGE_DATE", function=KeyFunction.ITEM_OUT)
		public void finaidStageDate_itemOut()
		{
			
				getGDateClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER GUBINST_RECORDS_INSTALLED.POST_FIELD
		    IF :GUBINST_RECORDS_INSTALLED = 'Y' THEN
      RETURN ;
   END IF ;
--
   :RECORDS_RELEASE := '' ;
   :RECORDS_STAGE_DATE := '' ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBINST_RECORDS_INSTALLED.POST_FIELD
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST_FIELD", item="GUBINST_RECORDS_INSTALLED")
		public void gubinstRecordsInstalled_PostField()
		{
				GubinstAdapter gubinstElement = (GubinstAdapter)this.getFormModel().getGubinst().getRowAdapter(true);
				if (gubinstElement == null) {
					return;
				}
				if ( gubinstElement.getGubinstRecordsInstalled().equals("Y") )
				{
					return ;
				}
				gubinstElement.setRecordsRelease(toStr(""));
				gubinstElement.setRecordsStageDate(toDate(""));
			}

		
		/* Original PL/SQL code code for TRIGGER GUBINST_RECORDS_INSTALLED.WHEN-CHECKBOX-CHANGED
		 EXECUTE_TRIGGER('POST_FIELD');
IF :GUBINST_RECORDS_INSTALLED = 'Y' THEN
   EXECUTE_TRIGGER('GET_XURVERS');
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBINST_RECORDS_INSTALLED.WHEN-CHECKBOX-CHANGED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-CHECKBOX-CHANGED", item="GUBINST_RECORDS_INSTALLED")
		public void gubinstRecordsInstalled_checkBoxChange()
		{
				GubinstAdapter gubinstElement = (GubinstAdapter)this.getFormModel().getGubinst().getRowAdapter(true);
				if (gubinstElement == null) {
					return;
				}
				gubinstRecordsInstalled_PostField();
				if ( gubinstElement.getGubinstRecordsInstalled().equals("Y") )
				{
					executeAction("GET_XURVERS");
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * RECORDS_STAGE_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="RECORDS_STAGE_DATE", function=KeyFunction.NEXT_ITEM)
		public void recordsStageDate_keyNexItem()
		{
			
				getGDateClass().nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * RECORDS_STAGE_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="RECORDS_STAGE_DATE", function=KeyFunction.ITEM_CHANGE)
		public void recordsStageDate_itemChange()
		{
			
				getGDateClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * RECORDS_STAGE_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="RECORDS_STAGE_DATE", function=KeyFunction.ITEM_OUT)
		public void recordsStageDate_itemOut()
		{
			
				getGDateClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER GUBINST_FINAID_IND.WHEN-CHECKBOX-CHANGED
		 IF :GUBINST_FINAID_IND = 'Y' THEN
   :GUBINST_FINAID_INSTALLED := '' ;
   :FINAID_RELEASE := '' ;
   :FINAID_STAGE_DATE := '' ;
END IF;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBINST_FINAID_IND.WHEN-CHECKBOX-CHANGED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-CHECKBOX-CHANGED", item="GUBINST_FINAID_IND")
		public void gubinstFinaidInd_checkBoxChange()
		{
				GubinstAdapter gubinstElement = (GubinstAdapter)this.getFormModel().getGubinst().getRowAdapter(true);
				if (gubinstElement == null) {
					return;
				}
				if ( gubinstElement.getGubinstFinaidInd().equals("Y") )
				{
					gubinstElement.setGubinstFinaidInstalled(toStr(""));
					gubinstElement.setFinaidRelease(toStr(""));
					gubinstElement.setFinaidStageDate(toDate(""));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GUBINST_PTAX_INSTALLED.POST_FIELD
		    IF :GUBINST_PTAX_INSTALLED = 'Y' THEN
      RETURN ;
   END IF ;
--
   :PTAX_RELEASE := '' ;
   :PTAX_STAGE_DATE := '' ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBINST_PTAX_INSTALLED.POST_FIELD
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST_FIELD", item="GUBINST_PTAX_INSTALLED")
		public void gubinstPtaxInstalled_PostField()
		{
				GubinstAdapter gubinstElement = (GubinstAdapter)this.getFormModel().getGubinst().getRowAdapter(true);
				if (gubinstElement == null) {
					return;
				}
				if ( gubinstElement.getGubinstPtaxInstalled().equals("Y") )
				{
					return ;
				}
				gubinstElement.setPtaxRelease(toStr(""));
				gubinstElement.setPtaxStageDate(toDate(""));
			}

		
		/* Original PL/SQL code code for TRIGGER GUBINST_PTAX_INSTALLED.WHEN-CHECKBOX-CHANGED
		 EXECUTE_TRIGGER('POST_FIELD');
IF :GUBINST_PTAX_INSTALLED = 'Y' THEN
   EXECUTE_TRIGGER('GET_BURVERS');
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBINST_PTAX_INSTALLED.WHEN-CHECKBOX-CHANGED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-CHECKBOX-CHANGED", item="GUBINST_PTAX_INSTALLED")
		public void gubinstPtaxInstalled_checkBoxChange()
		{
				GubinstAdapter gubinstElement = (GubinstAdapter)this.getFormModel().getGubinst().getRowAdapter(true);
				if (gubinstElement == null) {
					return;
				}
				 gubinstPtaxInstalled_PostField();
				if ( gubinstElement.getGubinstPtaxInstalled().equals("Y") )
				{
					executeAction("GET_BURVERS");
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PTAX_STAGE_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="PTAX_STAGE_DATE", function=KeyFunction.NEXT_ITEM)
		public void ptaxStageDate_keyNexItem()
		{
			
				getGDateClass().nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PTAX_STAGE_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="PTAX_STAGE_DATE", function=KeyFunction.ITEM_CHANGE)
		public void ptaxStageDate_itemChange()
		{
			
				getGDateClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PTAX_STAGE_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="PTAX_STAGE_DATE", function=KeyFunction.ITEM_OUT)
		public void ptaxStageDate_itemOut()
		{
			
				getGDateClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER GUBINST_FINANCE_INSTALLED.POST_FIELD
		    IF :GUBINST_FINANCE_INSTALLED = 'Y' THEN
      RETURN ;
   END IF ;
--
   :FINANCE_RELEASE := '' ;
   :FINANCE_STAGE_DATE := '' ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBINST_FINANCE_INSTALLED.POST_FIELD
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST_FIELD", item="GUBINST_FINANCE_INSTALLED")
		public void gubinstFinanceInstalled_PostField()
		{
				GubinstAdapter gubinstElement = (GubinstAdapter)this.getFormModel().getGubinst().getRowAdapter(true);
				if (gubinstElement == null) {
					return;
				}
				if ( gubinstElement.getGubinstFinanceInstalled().equals("Y") )
				{
					return ;
				}
				gubinstElement.setFinanceRelease(toStr(""));
				gubinstElement.setFinanceStageDate(toDate(""));
			}

		
		/* Original PL/SQL code code for TRIGGER GUBINST_FINANCE_INSTALLED.WHEN-CHECKBOX-CHANGED
		 EXECUTE_TRIGGER('POST_FIELD');
IF :GUBINST_FINANCE_INSTALLED = 'Y' THEN
   EXECUTE_TRIGGER('GET_FURVERS');
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBINST_FINANCE_INSTALLED.WHEN-CHECKBOX-CHANGED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-CHECKBOX-CHANGED", item="GUBINST_FINANCE_INSTALLED")
		public void gubinstFinanceInstalled_checkBoxChange()
		{
				GubinstAdapter gubinstElement = (GubinstAdapter)this.getFormModel().getGubinst().getRowAdapter(true);
				if (gubinstElement == null) {
					return;
				}
				gubinstFinanceInstalled_PostField();
				executeAction("POST_FIELD");
				if ( gubinstElement.getGubinstFinanceInstalled().equals("Y") )
				{
					executeAction("GET_FURVERS");
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FINANCE_STAGE_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FINANCE_STAGE_DATE", function=KeyFunction.NEXT_ITEM)
		public void financeStageDate_keyNexItem()
		{
			
				getGDateClass().nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FINANCE_STAGE_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FINANCE_STAGE_DATE", function=KeyFunction.ITEM_CHANGE)
		public void financeStageDate_itemChange()
		{
			
				getGDateClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FINANCE_STAGE_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FINANCE_STAGE_DATE", function=KeyFunction.ITEM_OUT)
		public void financeStageDate_itemOut()
		{
			
				getGDateClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER GUBINST_OCCTAX_INSTALLED.POST_FIELD
		    IF :GUBINST_OCCTAX_INSTALLED = 'Y' THEN
      RETURN ;
   END IF ;
--
   :OCCTAX_RELEASE := '' ;
   :OCCTAX_STAGE_DATE := '' ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBINST_OCCTAX_INSTALLED.POST_FIELD
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST_FIELD", item="GUBINST_OCCTAX_INSTALLED")
		public void gubinstOcctaxInstalled_PostField()
		{
				GubinstAdapter gubinstElement = (GubinstAdapter)this.getFormModel().getGubinst().getRowAdapter(true);
				if (gubinstElement == null) {
					return;
				}
				if ( gubinstElement.getGubinstOcctaxInstalled().equals("Y") )
				{
					return ;
				}
				gubinstElement.setOcctaxRelease(toStr(""));
				gubinstElement.setOcctaxStageDate(toDate(""));
			}

		
		/* Original PL/SQL code code for TRIGGER GUBINST_OCCTAX_INSTALLED.WHEN-CHECKBOX-CHANGED
		 EXECUTE_TRIGGER('POST_FIELD');
IF :GUBINST_OCCTAX_INSTALLED = 'Y' THEN
   EXECUTE_TRIGGER('GET_LURVERS');
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBINST_OCCTAX_INSTALLED.WHEN-CHECKBOX-CHANGED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-CHECKBOX-CHANGED", item="GUBINST_OCCTAX_INSTALLED")
		public void gubinstOcctaxInstalled_checkBoxChange()
		{
				GubinstAdapter gubinstElement = (GubinstAdapter)this.getFormModel().getGubinst().getRowAdapter(true);
				if (gubinstElement == null) {
					return;
				}
				executeAction("POST_FIELD");
				if ( gubinstElement.getGubinstOcctaxInstalled().equals("Y") )
				{
					executeAction("GET_LURVERS");
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * OCCTAX_STAGE_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="OCCTAX_STAGE_DATE", function=KeyFunction.NEXT_ITEM)
		public void occtaxStageDate_keyNexItem()
		{
			
				getGDateClass().nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * OCCTAX_STAGE_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="OCCTAX_STAGE_DATE", function=KeyFunction.ITEM_CHANGE)
		public void occtaxStageDate_itemChange()
		{
			
				getGDateClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * OCCTAX_STAGE_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="OCCTAX_STAGE_DATE", function=KeyFunction.ITEM_OUT)
		public void occtaxStageDate_itemOut()
		{
			
				getGDateClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER GUBINST_HUMANRE_INSTALLED.POST_FIELD
		    IF :GUBINST_HUMANRE_INSTALLED = 'Y' THEN
      RETURN ;
   END IF ;
--
   :HUMANRE_RELEASE := '' ;
   :HUMANRE_STAGE_DATE := '' ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBINST_HUMANRE_INSTALLED.POST_FIELD
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST_FIELD", item="GUBINST_HUMANRE_INSTALLED")
		public void gubinstHumanreInstalled_PostField()
		{
				GubinstAdapter gubinstElement = (GubinstAdapter)this.getFormModel().getGubinst().getRowAdapter(true);
				if (gubinstElement == null) {
					return;
				}
				if ( gubinstElement.getGubinstHumanreInstalled().equals("Y") )
				{
					return ;
				}
				gubinstElement.setHumanreRelease(toStr(""));
				gubinstElement.setHumanreStageDate(toDate(""));
			}

		
		/* Original PL/SQL code code for TRIGGER GUBINST_HUMANRE_INSTALLED.WHEN-CHECKBOX-CHANGED
		 EXECUTE_TRIGGER('POST_FIELD');
IF :GUBINST_HUMANRE_INSTALLED = 'Y' THEN
   EXECUTE_TRIGGER('GET_PURVERS');
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBINST_HUMANRE_INSTALLED.WHEN-CHECKBOX-CHANGED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-CHECKBOX-CHANGED", item="GUBINST_HUMANRE_INSTALLED")
		public void gubinstHumanreInstalled_checkBoxChange()
		{
				GubinstAdapter gubinstElement = (GubinstAdapter)this.getFormModel().getGubinst().getRowAdapter(true);
				if (gubinstElement == null) {
					return;
				}
				gubinstHumanreInstalled_PostField();
				if ( gubinstElement.getGubinstHumanreInstalled().equals("Y") )
				{
					executeAction("GET_PURVERS");
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * HUMANRE_STAGE_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="HUMANRE_STAGE_DATE", function=KeyFunction.NEXT_ITEM)
		public void humanreStageDate_keyNexItem()
		{
			
				getGDateClass().nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * HUMANRE_STAGE_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="HUMANRE_STAGE_DATE", function=KeyFunction.ITEM_CHANGE)
		public void humanreStageDate_itemChange()
		{
			
				getGDateClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * HUMANRE_STAGE_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="HUMANRE_STAGE_DATE", function=KeyFunction.ITEM_OUT)
		public void humanreStageDate_itemOut()
		{
			
				getGDateClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER GUBINST_POSBUD_INSTALLED.POST_FIELD
		    IF :GUBINST_POSBUD_INSTALLED = 'Y' THEN
      RETURN ;
   END IF ;
--
   :POSBUD_RELEASE := '' ;
   :POSBUD_STAGE_DATE := '' ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBINST_POSBUD_INSTALLED.POST_FIELD
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST_FIELD", item="GUBINST_POSBUD_INSTALLED")
		public void gubinstPosbudInstalled_PostField()
		{
				GubinstAdapter gubinstElement = (GubinstAdapter)this.getFormModel().getGubinst().getRowAdapter(true);
				if (gubinstElement == null) {
					return;
				}
				if ( gubinstElement.getGubinstPosbudInstalled().equals("Y") )
				{
					return ;
				}
				gubinstElement.setPosbudRelease(toStr(""));
				gubinstElement.setPosbudStageDate(toDate(""));
			}

		
		/* Original PL/SQL code code for TRIGGER GUBINST_POSBUD_INSTALLED.WHEN-CHECKBOX-CHANGED
		 EXECUTE_TRIGGER('POST_FIELD');
IF :GUBINST_POSBUD_INSTALLED = 'Y' THEN
   EXECUTE_TRIGGER('GET_NURVERS');
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBINST_POSBUD_INSTALLED.WHEN-CHECKBOX-CHANGED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-CHECKBOX-CHANGED", item="GUBINST_POSBUD_INSTALLED")
		public void gubinstPosbudInstalled_checkBoxChange()
		{
				GubinstAdapter gubinstElement = (GubinstAdapter)this.getFormModel().getGubinst().getRowAdapter(true);
				if (gubinstElement == null) {
					return;
				}
				gubinstPosbudInstalled_PostField();
				if ( gubinstElement.getGubinstPosbudInstalled().equals("Y") )
				{
					executeAction("GET_NURVERS");
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * POSBUD_STAGE_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="POSBUD_STAGE_DATE", function=KeyFunction.NEXT_ITEM)
		public void posbudStageDate_keyNexItem()
		{
			
				getGDateClass().nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * POSBUD_STAGE_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="POSBUD_STAGE_DATE", function=KeyFunction.ITEM_CHANGE)
		public void posbudStageDate_itemChange()
		{
			
				getGDateClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * POSBUD_STAGE_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="POSBUD_STAGE_DATE", function=KeyFunction.ITEM_OUT)
		public void posbudStageDate_itemOut()
		{
			
				getGDateClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER GUBINST_STUDENT_INSTALLED.POST_FIELD
		    IF :GUBINST_STUDENT_INSTALLED = 'Y' THEN
      RETURN ;
   END IF ;
--
   :STUDENT_RELEASE := '' ;
   :STUDENT_STAGE_DATE := '' ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBINST_STUDENT_INSTALLED.POST_FIELD
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST_FIELD", item="GUBINST_STUDENT_INSTALLED")
		public void gubinstStudentInstalled_PostField()
		{
				GubinstAdapter gubinstElement = (GubinstAdapter)this.getFormModel().getGubinst().getRowAdapter(true);
				if (gubinstElement == null) {
					return;
				}
				if ( gubinstElement.getGubinstStudentInstalled().equals("Y") )
				{
					return ;
				}
				gubinstElement.setStudentRelease(toStr(""));
				gubinstElement.setStudentStageDate(toDate(""));
			}

		
		/* Original PL/SQL code code for TRIGGER GUBINST_STUDENT_INSTALLED.WHEN-CHECKBOX-CHANGED
		 EXECUTE_TRIGGER('POST_FIELD');
IF :GUBINST_STUDENT_INSTALLED = 'Y' THEN
   EXECUTE_TRIGGER('GET_SURVERS');
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBINST_STUDENT_INSTALLED.WHEN-CHECKBOX-CHANGED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-CHECKBOX-CHANGED", item="GUBINST_STUDENT_INSTALLED")
		public void gubinstStudentInstalled_checkBoxChange()
		{
				GubinstAdapter gubinstElement = (GubinstAdapter)this.getFormModel().getGubinst().getRowAdapter(true);
				if (gubinstElement == null) {
					return;
				}
				executeAction("POST_FIELD");
				if ( gubinstElement.getGubinstStudentInstalled().equals("Y") )
				{
					executeAction("GET_SURVERS");
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STUDENT_STAGE_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="STUDENT_STAGE_DATE", function=KeyFunction.NEXT_ITEM)
		public void studentStageDate_keyNexItem()
		{
			
				getGDateClass().nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STUDENT_STAGE_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="STUDENT_STAGE_DATE", function=KeyFunction.ITEM_CHANGE)
		public void studentStageDate_itemChange()
		{
			
				getGDateClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STUDENT_STAGE_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="STUDENT_STAGE_DATE", function=KeyFunction.ITEM_OUT)
		public void studentStageDate_itemOut()
		{
			
				getGDateClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER GUBINST_UTILITIES_INSTALLED.POST_FIELD
		    IF :GUBINST_UTILITIES_INSTALLED = 'Y' THEN
      RETURN ;
   END IF ;
--
   :UTILITIES_RELEASE := '' ;
   :UTILITIES_STAGE_DATE := '' ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBINST_UTILITIES_INSTALLED.POST_FIELD
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST_FIELD", item="GUBINST_UTILITIES_INSTALLED")
		public void gubinstUtilitiesInstalled_PostField()
		{
				GubinstAdapter gubinstElement = (GubinstAdapter)this.getFormModel().getGubinst().getRowAdapter(true);
				if (gubinstElement == null) {
					return;
				}
				if ( gubinstElement.getGubinstUtilitiesInstalled().equals("Y") )
				{
					return ;
				}
				gubinstElement.setUtilitiesRelease(toStr(""));
				gubinstElement.setUtilitiesStageDate(toDate(""));
			}

		
		/* Original PL/SQL code code for TRIGGER GUBINST_UTILITIES_INSTALLED.WHEN-CHECKBOX-CHANGED
		 EXECUTE_TRIGGER('POST_FIELD');
IF :GUBINST_UTILITIES_INSTALLED = 'Y' THEN
   EXECUTE_TRIGGER('GET_UURVERS');
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBINST_UTILITIES_INSTALLED.WHEN-CHECKBOX-CHANGED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-CHECKBOX-CHANGED", item="GUBINST_UTILITIES_INSTALLED")
		public void gubinstUtilitiesInstalled_checkBoxChange()
		{
				GubinstAdapter gubinstElement = (GubinstAdapter)this.getFormModel().getGubinst().getRowAdapter(true);
				if (gubinstElement == null) {
					return;
				}
				gubinstUtilitiesInstalled_PostField();
				if ( gubinstElement.getGubinstUtilitiesInstalled().equals("Y") )
				{
					executeAction("GET_UURVERS");
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * UTILITIES_STAGE_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="UTILITIES_STAGE_DATE", function=KeyFunction.NEXT_ITEM)
		public void utilitiesStageDate_keyNexItem()
		{
			
				getGDateClass().nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * UTILITIES_STAGE_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="UTILITIES_STAGE_DATE", function=KeyFunction.ITEM_CHANGE)
		public void utilitiesStageDate_itemChange()
		{
			
				getGDateClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * UTILITIES_STAGE_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="UTILITIES_STAGE_DATE", function=KeyFunction.ITEM_OUT)
		public void utilitiesStageDate_itemOut()
		{
			
				getGDateClass().itemOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBINST_STAT_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="GUBINST_STAT_CODE")
		public void gubinstStatCode_validate()
		{
			
				GubinstAdapter gubinstElement = (GubinstAdapter)this.getFormModel().getGubinst().getRowAdapter(true);
							this.gubinstStatCode_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBINST_NATN_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="GUBINST_NATN_CODE")
		public void gubinstNatnCode_validate()
		{
			
				GubinstAdapter gubinstElement = (GubinstAdapter)this.getFormModel().getGubinst().getRowAdapter(true);
							this.gubinstNatnCode_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBINST_HIGHED_GOVT_IND.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="GUBINST_HIGHED_GOVT_IND")
		public void gubinstHighedGovtInd_validate()
		{
			
				GubinstAdapter gubinstElement = (GubinstAdapter)this.getFormModel().getGubinst().getRowAdapter(true);
							this.gubinstHighedGovtInd_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBINST_BASE_CURR_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="GUBINST_BASE_CURR_CODE")
		public void gubinstBaseCurrCode_validate()
		{
			
				GubinstAdapter gubinstElement = (GubinstAdapter)this.getFormModel().getGubinst().getRowAdapter(true);
							this.gubinstBaseCurrCode_PostChange();

			}

		
	
	
}

