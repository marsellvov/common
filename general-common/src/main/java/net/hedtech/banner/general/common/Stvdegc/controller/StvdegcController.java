package net.hedtech.banner.general.common.Stvdegc.controller;
 
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

import net.hedtech.banner.general.common.Stvdegc.model.*;
import net.hedtech.banner.general.common.Stvdegc.*;
import net.hedtech.banner.general.common.Stvdegc.services.*;

import net.hedtech.general.common.libraries.Goqolib.services.GCodeClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GDateClass;	
		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class StvdegcController extends DefaultBlockController {

	private GCodeClass getGCodeClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GCodeClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_CODE_CLASS");
	}	
	private GDateClass getGDateClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GDateClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_DATE_CLASS");
	}	

	
	public StvdegcController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
		
	@Override
	public StvdegcTask getTask() {
		return (StvdegcTask)super.getTask();
	}

	public StvdegcModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
		/* Original PL/SQL code code for TRIGGER STVDEGC.PRE-INSERT
		    :STVDEGC_ACTIVITY_DATE := SYSDATE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVDEGC.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowInsert
		public void stvdegc_BeforeRowInsert(RowAdapterEvent args)
		{
			
				StvdegcAdapter stvdegcElement = (StvdegcAdapter)args.getRow();


				stvdegcElement.setStvdegcActivityDate(NDate.getNow());
			}

		
		/* Original PL/SQL code code for TRIGGER STVDEGC.PRE-UPDATE
		    :STVDEGC_ACTIVITY_DATE := SYSDATE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVDEGC.PRE-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowUpdate
		public void stvdegc_BeforeRowUpdate(RowAdapterEvent args)
		{
			
				StvdegcAdapter stvdegcElement = (StvdegcAdapter)args.getRow();


				stvdegcElement.setStvdegcActivityDate(NDate.getNow());
			}

		
		/* Original PL/SQL code code for TRIGGER STVDEGC.KEY-DELREC
		    IF :STVDEGC_SYSTEM_REQ_IND = 'Y' THEN
      MESSAGE (  G$_NLS.Get('STVDEGC-0001', 'FORM','*ERROR* Record cannot be deleted when the System Required Indicator is Y.')  
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
		 * STVDEGC.KEY-DELREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DELREC", function=KeyFunction.DELETE_RECORD)
		public void stvdegc_DeleteRecord()
		{
			
				StvdegcAdapter stvdegcElement = (StvdegcAdapter)this.getFormModel().getStvdegc().getRowAdapter(true);

				if (stvdegcElement == null) {
					return;
				}
				
				if ( stvdegcElement.getStvdegcSystemReqInd().equals("Y") )
				{
					errorMessage(GNls.Fget(toStr("STVDEGC-0001"), toStr("FORM"), toStr("*ERROR* Record cannot be deleted when the System Required Indicator is Y.")));
					throw new ApplicationException();
				}
				else {
					deleteRecord();
					getTask().getGoqrpls().gCheckFailure();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER STVDEGC.ON-UPDATE
		 UPDATE STVDEGC
SET STVDEGC_DESC=:STVDEGC_DESC,
    STVDEGC_FA_COUNT_IND=:STVDEGC_FA_COUNT_IND,
    STVDEGC_DLEV_CODE=:STVDEGC_DLEV_CODE,
    STVDEGC_ACAT_CODE=:STVDEGC_ACAT_CODE,
    STVDEGC_VR_MSG_NO=:STVDEGC_VR_MSG_NO,
    STVDEGC_DISP_WEB_IND = :STVDEGC_DISP_WEB_IND,
    STVDEGC_SYSTEM_REQ_IND=:STVDEGC_SYSTEM_REQ_IND,
    STVDEGC_ACTIVITY_DATE=TO_DATE(:CURRENT_DATE,G$_DATE.GET_NLS_DATE_FORMAT)
WHERE STVDEGC_CODE=:STVDEGC_CODE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVDEGC.ON-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@RowUpdate
		public void stvdegc_RowUpdate(RowAdapterEvent args)
		{
			
				StvdegcAdapter stvdegcElement = (StvdegcAdapter)args.getRow();


				int rowCount = 0;
				String sql1 = "UPDATE STVDEGC " +
	"SET STVDEGC_DESC = :STVDEGC_DESC, STVDEGC_FA_COUNT_IND = :STVDEGC_FA_COUNT_IND, STVDEGC_DLEV_CODE = :STVDEGC_DLEV_CODE, STVDEGC_ACAT_CODE = :STVDEGC_ACAT_CODE, STVDEGC_VR_MSG_NO = :STVDEGC_VR_MSG_NO, STVDEGC_DISP_WEB_IND = :STVDEGC_DISP_WEB_IND, STVDEGC_SYSTEM_REQ_IND = :STVDEGC_SYSTEM_REQ_IND, STVDEGC_ACTIVITY_DATE = TO_DATE(:CURRENT_DATE, G$_DATE.GET_NLS_DATE_FORMAT) " +
	" WHERE STVDEGC_CODE = :STVDEGC_CODE";
				DataCommand command1 = new DataCommand(sql1);
				//Setting query parameters
				command1.addParameter("STVDEGC_DESC", stvdegcElement.getStvdegcDesc());
				command1.addParameter("STVDEGC_FA_COUNT_IND", stvdegcElement.getStvdegcFaCountInd());
				command1.addParameter("STVDEGC_DLEV_CODE", stvdegcElement.getStvdegcDlevCode());
				command1.addParameter("STVDEGC_ACAT_CODE", stvdegcElement.getStvdegcAcatCode());
				command1.addParameter("STVDEGC_VR_MSG_NO", stvdegcElement.getStvdegcVrMsgNo());
				command1.addParameter("STVDEGC_DISP_WEB_IND", stvdegcElement.getStvdegcDispWebInd());
				command1.addParameter("STVDEGC_SYSTEM_REQ_IND", stvdegcElement.getStvdegcSystemReqInd());
				command1.addParameter("CURRENT_DATE", getFormModel().getFormHeader().getCurrentDate());
				command1.addParameter("STVDEGC_CODE", stvdegcElement.getStvdegcCode());
				rowCount = command1.execute();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVDEGC_DLEV_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="STVDEGC_DLEV_CODE")
		public void stvdegcDlevCode_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVDEGC_DLEV_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="STVDEGC_DLEV_CODE", function=KeyFunction.ITEM_CHANGE)
		public void stvdegcDlevCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVDEGC_DLEV_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="STVDEGC_DLEV_CODE")
		public void stvdegcDlevCode_GSearchParameters()
		{
			
				getGCodeClass().gSearchParameters();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVDEGC_DLEV_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="STVDEGC_DLEV_CODE")
		public void stvdegcDlevCode_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVDEGC_DLEV_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="STVDEGC_DLEV_CODE", function=KeyFunction.NEXT_ITEM)
		public void stvdegcDlevCode_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVDEGC_DLEV_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="STVDEGC_DLEV_CODE", function=KeyFunction.ITEM_OUT)
		public void stvdegcDlevCode_itemOut()
		{
			
				getGCodeClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER STVDEGC_DLEV_CODE.POST-CHANGE
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
         FROM   STVDLEV
         WHERE  STVDLEV_CODE = :STVDEGC_DLEV_CODE ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO PTI_INTO_TEMP ;
      G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND,
 G$_NLS.Get('STVDEGC-0002', 'FORM','*ERROR* Invalid code; press LIST for valid code.') , TRUE);
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
		 * STVDEGC_DLEV_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="STVDEGC_DLEV_CODE")
		public void stvdegcDlevCode_PostChange()
		{
			

				
				StvdegcAdapter stvdegcElement = (StvdegcAdapter)this.getFormModel().getStvdegc().getRowAdapter(true);

				if (stvdegcElement == null) {
					return;
				}

				int rowCount = 0;
				if(stvdegcElement.getStvdegcDlevCode().isNull())
		return;
				try
				{
					getTask().getGoqrpls().gCheckQueryMode();
					// 
					if ((getGlobal("QUERY_MODE").equals("1")))
					{
//						 goto PTI_END_TRIGGER;
						setGlobal("QUERY_MODE", toStr("0"));
					}
					{
						NString ptiIntoTemp= NString.getNull();
						String sqlptiCursor = "SELECT 'X' " +
	" FROM STVDLEV " +
	" WHERE STVDLEV_CODE = :STVDEGC_DLEV_CODE ";
						DataCursor ptiCursor = new DataCursor(sqlptiCursor);
						try {
							//Setting query parameters
							ptiCursor.addParameter("STVDEGC_DLEV_CODE", stvdegcElement.getStvdegcDlevCode());
							ptiCursor.open();
							ResultSet ptiCursorResults = ptiCursor.fetchInto();
							if ( ptiCursorResults != null ) {
								ptiIntoTemp = ptiCursorResults.getStr(0);
							}
							getTask().getGoqrpls().gCheckValue(toBool(ptiCursor.notFound()), GNls.Fget(toStr("STVDEGC-0002"), toStr("FORM"), toStr("*ERROR* Invalid code; press LIST for valid code.")), toBool(NBool.True));
						}
						finally{
							ptiCursor.close();
						}
					}
//					 PTI_END_TRIGGER:;
//					setGlobal("QUERY_MODE", toStr("0"));
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
		 * STVDEGC_ACAT_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="STVDEGC_ACAT_CODE")
		public void stvdegcAcatCode_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVDEGC_ACAT_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="STVDEGC_ACAT_CODE", function=KeyFunction.ITEM_CHANGE)
		public void stvdegcAcatCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVDEGC_ACAT_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="STVDEGC_ACAT_CODE")
		public void stvdegcAcatCode_GSearchParameters()
		{
			
				getGCodeClass().gSearchParameters();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVDEGC_ACAT_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="STVDEGC_ACAT_CODE")
		public void stvdegcAcatCode_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVDEGC_ACAT_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="STVDEGC_ACAT_CODE", function=KeyFunction.NEXT_ITEM)
		public void stvdegcAcatCode_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVDEGC_ACAT_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="STVDEGC_ACAT_CODE", function=KeyFunction.ITEM_OUT)
		public void stvdegcAcatCode_itemOut()
		{
			
				getGCodeClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER STVDEGC_ACAT_CODE.POST-CHANGE
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
         FROM   STVACAT
         WHERE  STVACAT_CODE = :STVDEGC_ACAT_CODE ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO PTI_INTO_TEMP ;
      G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND,
 G$_NLS.Get('STVDEGC-0003', 'FORM','*ERROR* Invalid code, press LIST for valid codes') , TRUE);
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
		 * STVDEGC_ACAT_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="STVDEGC_ACAT_CODE")
		public void stvdegcAcatCode_PostChange()
		{
			

				StvdegcAdapter stvdegcElement = (StvdegcAdapter)this.getFormModel().getStvdegc().getRowAdapter(true);

				if (stvdegcElement == null) {
					return;
				}

				int rowCount = 0;
				if(stvdegcElement.getStvdegcAcatCode().isNull())
		return;
				try
				{
					getTask().getGoqrpls().gCheckQueryMode();
					// 
					if ((getGlobal("QUERY_MODE").equals("1")))
					{
//						 goto PTI_END_TRIGGER;
						setGlobal("QUERY_MODE", toStr("0"));
					}
					{
						NString ptiIntoTemp= NString.getNull();
						String sqlptiCursor = "SELECT 'X' " +
	" FROM STVACAT " +
	" WHERE STVACAT_CODE = :STVDEGC_ACAT_CODE ";
						DataCursor ptiCursor = new DataCursor(sqlptiCursor);
						try {
							//Setting query parameters
							ptiCursor.addParameter("STVDEGC_ACAT_CODE", stvdegcElement.getStvdegcAcatCode());
							ptiCursor.open();
							ResultSet ptiCursorResults = ptiCursor.fetchInto();
							if ( ptiCursorResults != null ) {
								ptiIntoTemp = ptiCursorResults.getStr(0);
							}
							getTask().getGoqrpls().gCheckValue(toBool(ptiCursor.notFound()), GNls.Fget(toStr("STVDEGC-0003"), toStr("FORM"), toStr("*ERROR* Invalid code, press LIST for valid codes")), toBool(NBool.True));
						}
						finally{
							ptiCursor.close();
						}
					}
//					 PTI_END_TRIGGER:;
//					setGlobal("QUERY_MODE", toStr("0"));
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
		 * STVDEGC_ACTIVITY_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="STVDEGC_ACTIVITY_DATE", function=KeyFunction.NEXT_ITEM)
		public void stvdegcActivityDate_keyNexItem()
		{
			
				getGDateClass().nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVDEGC_ACTIVITY_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="STVDEGC_ACTIVITY_DATE", function=KeyFunction.ITEM_CHANGE)
		public void stvdegcActivityDate_itemChange()
		{
			
				getGDateClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVDEGC_ACTIVITY_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="STVDEGC_ACTIVITY_DATE", function=KeyFunction.ITEM_OUT)
		public void stvdegcActivityDate_itemOut()
		{
			
				getGDateClass().itemOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVDEGC_DLEV_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="STVDEGC_DLEV_CODE")
		public void stvdegcDlevCode_validate()
		{
			
				StvdegcAdapter stvdegcElement = (StvdegcAdapter)this.getFormModel().getStvdegc().getRowAdapter(true);
							this.stvdegcDlevCode_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVDEGC.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void stvdegc_AfterQuery(RowAdapterEvent args)
		{
			
			StvdegcAdapter stvdegcElement = (StvdegcAdapter)args.getRow();			
						
				try {
				stvdegcElement.setLockDbValues(true);
                                 try {  
                                this.stvdegcDlevCode_PostChange(); 
                                } catch(Exception ex) { 
                                } 
                                 try {  
                                this.stvdegcAcatCode_PostChange(); 
                                } catch(Exception ex) { 
                                } 

				 
			
						} finally {
							stvdegcElement.setLockDbValues(false);
						}
						

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVDEGC_ACAT_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="STVDEGC_ACAT_CODE")
		public void stvdegcAcatCode_validate()
		{
			
				StvdegcAdapter stvdegcElement = (StvdegcAdapter)this.getFormModel().getStvdegc().getRowAdapter(true);
							this.stvdegcAcatCode_PostChange();

			}

		
	
	
}

