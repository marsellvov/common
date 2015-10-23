package net.hedtech.banner.general.common.Stvmajr.controller;
 
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
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.banner.general.common.Stvmajr.model.*;
import net.hedtech.banner.general.common.Stvmajr.*;
import net.hedtech.banner.general.common.Stvmajr.services.*;
import net.hedtech.general.common.libraries.Goqolib.services.GCodeClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GDateClass;	
		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class StvmajrController extends DefaultBlockController {

	private GCodeClass getGCodeClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GCodeClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_CODE_CLASS");
	}	
	private GDateClass getGDateClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GDateClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_DATE_CLASS");
	}	

	
	public StvmajrController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
		
	@Override
	public StvmajrTask getTask() {
		return (StvmajrTask)super.getTask();
	}

	public StvmajrModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
		/* Original PL/SQL code code for TRIGGER STVMAJR.PRE-INSERT
		    :STVMAJR_ACTIVITY_DATE := TO_DATE(:CURRENT_DATE, G$_DATE.GET_NLS_DATE_FORMAT) ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVMAJR.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowInsert
		public void stvmajr_BeforeRowInsert(RowAdapterEvent args)
		{
			
				StvmajrAdapter stvmajrElement = (StvmajrAdapter)args.getRow();


				stvmajrElement.setStvmajrActivityDate(toDate(getFormModel().getFormHeader().getCurrentDate(), GDate.getNlsDateFormat()));
			}

		
		/* Original PL/SQL code code for TRIGGER STVMAJR.PRE-UPDATE
		    :STVMAJR_ACTIVITY_DATE := TO_DATE(:CURRENT_DATE, G$_DATE.GET_NLS_DATE_FORMAT) ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVMAJR.PRE-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowUpdate
		public void stvmajr_BeforeRowUpdate(RowAdapterEvent args)
		{
			
				StvmajrAdapter stvmajrElement = (StvmajrAdapter)args.getRow();


				stvmajrElement.setStvmajrActivityDate(toDate(getFormModel().getFormHeader().getCurrentDate(), GDate.getNlsDateFormat()));
			}

		
		/* Original PL/SQL code code for TRIGGER STVMAJR.KEY-DELREC
		    IF :STVMAJR_SYSTEM_REQ_IND = 'Y' THEN
      MESSAGE (  G$_NLS.Get('STVMAJR-0001', 'FORM','*ERROR* Record cannot be deleted when required by the system.')  
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
		 * STVMAJR.KEY-DELREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DELREC", function=KeyFunction.DELETE_RECORD)
		public void stvmajr_DeleteRecord()
		{
			

				StvmajrAdapter stvmajrElement = (StvmajrAdapter)this.getFormModel().getStvmajr().getRowAdapter(true);

				if (stvmajrElement == null) {return;}

				if ( stvmajrElement.getStvmajrSystemReqInd().equals("Y") )
				{
					errorMessage(GNls.Fget(toStr("STVMAJR-0001"), toStr("FORM"), toStr("*ERROR* Record cannot be deleted when required by the system.")));
					throw new ApplicationException();
				}
				else {
					deleteRecord();
					getTask().getGoqrpls().gCheckFailure();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER STVMAJR.ON-UPDATE
		 UPDATE STVMAJR
SET STVMAJR_DESC=:STVMAJR_DESC,
    STVMAJR_CIPC_CODE=:STVMAJR_CIPC_CODE,
    STVMAJR_VALID_MAJOR_IND=:STVMAJR_VALID_MAJOR_IND,
    STVMAJR_VALID_MINOR_IND=:STVMAJR_VALID_MINOR_IND,
    STVMAJR_VALID_CONCENTRATN_IND=:STVMAJR_VALID_CONCENTRATN_IND,
    STVMAJR_OCCUPATION_IND=:STVMAJR_OCCUPATION_IND,
    STVMAJR_AID_ELIGIBILITY_IND=:STVMAJR_AID_ELIGIBILITY_IND,
    STVMAJR_VR_MSG_NO=:STVMAJR_VR_MSG_NO,
    STVMAJR_sevis_equiv=:STVMAJR_sevis_equiv,
    STVMAJR_SYSTEM_REQ_IND=:STVMAJR_SYSTEM_REQ_IND,
    STVMAJR_ACTIVITY_DATE=TO_DATE(:CURRENT_DATE,G$_DATE.GET_NLS_DATE_FORMAT)
WHERE STVMAJR_CODE=:STVMAJR_CODE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVMAJR.ON-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@RowUpdate
		public void stvmajr_RowUpdate(RowAdapterEvent args)
		{
			
				StvmajrAdapter stvmajrElement = (StvmajrAdapter)args.getRow();


				int rowCount = 0;
				String sql1 = "UPDATE STVMAJR " +
							"SET STVMAJR_DESC = :STVMAJR_DESC, STVMAJR_CIPC_CODE = :STVMAJR_CIPC_CODE, STVMAJR_VALID_MAJOR_IND = :STVMAJR_VALID_MAJOR_IND, STVMAJR_VALID_MINOR_IND = :STVMAJR_VALID_MINOR_IND, STVMAJR_VALID_CONCENTRATN_IND = :STVMAJR_VALID_CONCENTRATN_IND, STVMAJR_OCCUPATION_IND = :STVMAJR_OCCUPATION_IND, STVMAJR_AID_ELIGIBILITY_IND = :STVMAJR_AID_ELIGIBILITY_IND, STVMAJR_VR_MSG_NO = :STVMAJR_VR_MSG_NO, STVMAJR_sevis_equiv = :STVMAJR_SEVIS_EQUIV, STVMAJR_SYSTEM_REQ_IND = :STVMAJR_SYSTEM_REQ_IND, STVMAJR_ACTIVITY_DATE = TO_DATE(:CURRENT_DATE, G$_DATE.GET_NLS_DATE_FORMAT) " +
							" WHERE STVMAJR_CODE = :STVMAJR_CODE";
				DataCommand command1 = new DataCommand(sql1);
				//Setting query parameters
				command1.addParameter("STVMAJR_DESC", stvmajrElement.getStvmajrDesc());
				command1.addParameter("STVMAJR_CIPC_CODE", stvmajrElement.getStvmajrCipcCode());
				command1.addParameter("STVMAJR_VALID_MAJOR_IND", (stvmajrElement.getStvmajrValidMajorInd().equals("undefined")?NString.getNull():stvmajrElement.getStvmajrValidMajorInd()));
				command1.addParameter("STVMAJR_VALID_MINOR_IND", (stvmajrElement.getStvmajrValidMinorInd().equals("undefined")?NString.getNull():stvmajrElement.getStvmajrValidMinorInd()));
				command1.addParameter("STVMAJR_VALID_CONCENTRATN_IND", (stvmajrElement.getStvmajrValidConcentratnInd().equals("undefined")?NString.getNull():stvmajrElement.getStvmajrValidConcentratnInd()));
				command1.addParameter("STVMAJR_OCCUPATION_IND",(stvmajrElement.getStvmajrOccupationInd().equals("undefined")?NString.getNull():stvmajrElement.getStvmajrOccupationInd()));
				command1.addParameter("STVMAJR_AID_ELIGIBILITY_IND", (stvmajrElement.getStvmajrAidEligibilityInd().equals("undefined")?NString.getNull():stvmajrElement.getStvmajrAidEligibilityInd()));
				command1.addParameter("STVMAJR_VR_MSG_NO", stvmajrElement.getStvmajrVrMsgNo());
				command1.addParameter("STVMAJR_SEVIS_EQUIV", stvmajrElement.getStvmajrSevisEquiv());
				command1.addParameter("STVMAJR_SYSTEM_REQ_IND", (stvmajrElement.getStvmajrSystemReqInd().equals("undefined")?NString.getNull():stvmajrElement.getStvmajrSystemReqInd()));
				command1.addParameter("CURRENT_DATE", getFormModel().getFormHeader().getCurrentDate());
				command1.addParameter("STVMAJR_CODE", stvmajrElement.getStvmajrCode());
				rowCount = command1.execute();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVMAJR_CIPC_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="STVMAJR_CIPC_CODE")
		public void stvmajrCipcCode_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVMAJR_CIPC_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="STVMAJR_CIPC_CODE", function=KeyFunction.ITEM_CHANGE)
		public void stvmajrCipcCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVMAJR_CIPC_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="STVMAJR_CIPC_CODE")
		public void stvmajrCipcCode_GSearchParameters()
		{
			
				getGCodeClass().gSearchParameters();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVMAJR_CIPC_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="STVMAJR_CIPC_CODE")
		public void stvmajrCipcCode_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVMAJR_CIPC_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="STVMAJR_CIPC_CODE", function=KeyFunction.NEXT_ITEM)
		public void stvmajrCipcCode_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVMAJR_CIPC_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="STVMAJR_CIPC_CODE", function=KeyFunction.ITEM_OUT)
		public void stvmajrCipcCode_itemOut()
		{
			
				getGCodeClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER STVMAJR_CIPC_CODE.POST-CHANGE
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
         FROM   STVCIPC
         WHERE  :STVMAJR_CIPC_CODE = STVCIPC.STVCIPC_CODE ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO PTI_INTO_TEMP ;
      G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND,
 G$_NLS.Get('STVMAJR-0002', 'FORM','*ERROR* Invalid code; press LIST for valid codes.') , TRUE);
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
		 * STVMAJR_CIPC_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="STVMAJR_CIPC_CODE")
		public void stvmajrCipcCode_PostChange()
		{
			

				StvmajrAdapter stvmajrElement = (StvmajrAdapter)this.getFormModel().getStvmajr().getRowAdapter(true);

				if (stvmajrElement == null) {return;}

				int rowCount = 0;
				if(stvmajrElement.getStvmajrCipcCode().isNull())
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
											 " FROM STVCIPC " +
											 " WHERE :STVMAJR_CIPC_CODE = STVCIPC.STVCIPC_CODE ";
						DataCursor ptiCursor = new DataCursor(sqlptiCursor);
						try {
							//Setting query parameters
							ptiCursor.addParameter("STVMAJR_CIPC_CODE", stvmajrElement.getStvmajrCipcCode());
							ptiCursor.open();
							ResultSet ptiCursorResults = ptiCursor.fetchInto();
							if ( ptiCursorResults != null ) {
								ptiIntoTemp = ptiCursorResults.getStr(0);
							}
							getTask().getGoqrpls().gCheckValue(toBool(ptiCursor.notFound()), GNls.Fget(toStr("STVMAJR-0002"), toStr("FORM"), toStr("*ERROR* Invalid code; press LIST for valid codes.")), toBool(NBool.True));
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
		 * STVMAJR_ACTIVITY_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="STVMAJR_ACTIVITY_DATE", function=KeyFunction.NEXT_ITEM)
		public void stvmajrActivityDate_keyNexItem()
		{
			
				getGDateClass().nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVMAJR_ACTIVITY_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="STVMAJR_ACTIVITY_DATE", function=KeyFunction.ITEM_CHANGE)
		public void stvmajrActivityDate_itemChange()
		{
			
				getGDateClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVMAJR_ACTIVITY_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="STVMAJR_ACTIVITY_DATE", function=KeyFunction.ITEM_OUT)
		public void stvmajrActivityDate_itemOut()
		{
			
				getGDateClass().itemOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVMAJR_CIPC_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="STVMAJR_CIPC_CODE")
		public void stvmajrCipcCode_validate()
		{
			
				StvmajrAdapter stvmajrElement = (StvmajrAdapter)this.getFormModel().getStvmajr().getRowAdapter(true);
							this.stvmajrCipcCode_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVMAJR.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void stvmajr_AfterQuery(RowAdapterEvent args)
		{
			
			StvmajrAdapter stvmajrElement = (StvmajrAdapter)args.getRow();			
						
				try {
				stvmajrElement.setLockDbValues(true);
				try { 
				this.stvmajrCipcCode_PostChange();
				} catch(Exception ex) {
				}
			
						} finally {
							stvmajrElement.setLockDbValues(false);
						}
						

			}
	
}

