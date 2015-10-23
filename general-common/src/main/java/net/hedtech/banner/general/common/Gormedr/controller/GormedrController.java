package net.hedtech.banner.general.common.Gormedr.controller;
 
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

import net.hedtech.banner.general.common.Gormedr.model.*;
import net.hedtech.banner.general.common.Gormedr.*;
import net.hedtech.banner.general.common.Gormedr.services.*;

import net.hedtech.general.common.libraries.Goqolib.services.GCodeClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GDescClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GDateClass;	
		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class GormedrController extends DefaultBlockController {

	private GCodeClass getGCodeClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GCodeClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_CODE_CLASS");
	}	
	private GDescClass getGDescClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GDescClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_DESC_CLASS");
	}	
	private GDateClass getGDateClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GDateClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_DATE_CLASS");
	}	

	
	public GormedrController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
		
	@Override
	public GormedrTask getTask() {
		return (GormedrTask)super.getTask();
	}

	public GormedrModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
		/* Original PL/SQL code code for TRIGGER GORMEDR.KEY-PRVBLK
		 GO_BLOCK('STVMEDI');
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORMEDR.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void gormedr_PreviousBlock()
		{
			
				goBlock(toStr("STVMEDI"));
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GORMEDR.KEY-NXTBLK
		 EXECUTE_TRIGGER('INVALID_FUNCTION_MSG');
RAISE FORM_TRIGGER_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORMEDR.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void gormedr_NextBlock()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				throw new ApplicationException();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORMEDR_DISA_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="GORMEDR_DISA_CODE")
		public void gormedrDisaCode_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORMEDR_DISA_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="GORMEDR_DISA_CODE", function=KeyFunction.ITEM_CHANGE)
		public void gormedrDisaCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORMEDR_DISA_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="GORMEDR_DISA_CODE")
		public void gormedrDisaCode_GSearchParameters()
		{
			
				getGCodeClass().gSearchParameters();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORMEDR_DISA_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="GORMEDR_DISA_CODE")
		public void gormedrDisaCode_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORMEDR_DISA_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="GORMEDR_DISA_CODE", function=KeyFunction.NEXT_ITEM)
		public void gormedrDisaCode_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORMEDR_DISA_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="GORMEDR_DISA_CODE", function=KeyFunction.ITEM_OUT)
		public void gormedrDisaCode_itemOut()
		{
			
				getGCodeClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER GORMEDR_DISA_CODE.POST-CHANGE
		 BEGIN
   G$_CHECK_QUERY_MODE ;
--
   DECLARE
      CURSOR PTI_CURSOR IS
         SELECT STVDISA_DESC
         FROM   STVDISA
         WHERE  STVDISA_CODE = :GORMEDR_DISA_CODE ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO :DISA_DESC ;
      G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND,
 G$_NLS.Get('GORMEDR-0012', 'FORM','*ERROR* Invalid code; press LIST for valid codes.') , TRUE);
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
		 * GORMEDR_DISA_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="GORMEDR_DISA_CODE")
		public void gormedrDisaCode_PostChange()
		{
			

				GormedrAdapter gormedrElement = (GormedrAdapter)this.getFormModel().getGormedr().getRowAdapter(true);

				if(gormedrElement!=null){

				int rowCount = 0;
				if(gormedrElement.getGormedrDisaCode().isNull())
		return;
				try
				{
					getTask().getGoqrpls().gCheckQueryMode();
					{
						String sqlptiCursor = "SELECT STVDISA_DESC " +
	" FROM STVDISA " +
	" WHERE STVDISA_CODE = :GORMEDR_DISA_CODE ";
						DataCursor ptiCursor = new DataCursor(sqlptiCursor);
						try {
							//Setting query parameters
							ptiCursor.addParameter("GORMEDR_DISA_CODE", gormedrElement.getGormedrDisaCode());
							ptiCursor.open();
							ResultSet ptiCursorResults = ptiCursor.fetchInto();
							if ( ptiCursorResults != null ) {
								gormedrElement.setDisaDesc(ptiCursorResults.getStr(0));
							}
							getTask().getGoqrpls().gCheckValue(toBool(ptiCursor.notFound()), GNls.Fget(toStr("GORMEDR-0012"), toStr("FORM"), toStr("*ERROR* Invalid code; press LIST for valid codes.")), toBool(NBool.True));
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

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * DISA_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="DISA_DESC", function=KeyFunction.ITEM_CHANGE)
		public void disaDesc_itemChange()
		{
			
				getGDescClass().itemChange();
			}

		
		/* Original PL/SQL code code for TRIGGER GORMEDR_DEFAULT_IND.WHEN-CHECKBOX-CHANGED
		 DECLARE
      CURRENT_REC_NUMBER NUMBER;
      REC_CNT        NUMBER := 0;

BEGIN
    CURRENT_REC_NUMBER := :SYSTEM.CURSOR_RECORD;
    FIRST_RECORD;

    LOOP
        IF :GORMEDR_DEFAULT_IND = 'Y' THEN
             REC_CNT := REC_CNT + 1;
        END IF;
        IF :SYSTEM.LAST_RECORD = 'TRUE' THEN
               EXIT;
        END IF;
        NEXT_RECORD;
     END LOOP;

     IF REC_CNT > 1 THEN
        MESSAGE ( G$_NLS.Get('GORMEDR-0014', 'FORM','*ERROR* Only one disability type may be designated as the default.')  ) ;
        GO_RECORD(CURRENT_REC_NUMBER);
        GO_ITEM('GORMEDR_DEFAULT_IND');
        :GORMEDR_DEFAULT_IND := 'N';
        RAISE FORM_TRIGGER_FAILURE ;
     END IF;
     
     GO_RECORD(CURRENT_REC_NUMBER);
     GO_ITEM('GORMEDR_DEFAULT_IND');
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORMEDR_DEFAULT_IND.WHEN-CHECKBOX-CHANGED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-CHECKBOX-CHANGED", item="GORMEDR_DEFAULT_IND")
		public void gormedrDefaultInd_checkBoxChange()
		{
			

				GormedrAdapter gormedrElement = (GormedrAdapter)this.getFormModel().getGormedr().getRowAdapter(true);

				if(gormedrElement!=null){
				{
					NNumber currentRecNumber= NNumber.getNull();
					NNumber recCnt = toNumber(0);
					currentRecNumber = toNumber(getCursorRecord());
					firstRecord();
					while (true) {
						if ( gormedrElement.getGormedrDefaultInd().equals("Y") )
						{
							recCnt = recCnt.add(1);
						}
						if ( isInLastRecord() )
						{
								break;
						}
						nextRecord();
					}
					if ( recCnt.greater(1) )
					{
						errorMessage(GNls.Fget(toStr("GORMEDR-0014"), toStr("FORM"), toStr("*ERROR* Only one disability type may be designated as the default.")));
						setCurrentRecord(currentRecNumber);
						goItem(toStr("GORMEDR_DEFAULT_IND"));
						gormedrElement.setGormedrDefaultInd(toStr("N"));
						throw new ApplicationException();
					}
					setCurrentRecord(currentRecNumber);
					goItem(toStr("GORMEDR_DEFAULT_IND"));
				}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORMEDR_ACTIVITY_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="GORMEDR_ACTIVITY_DATE", function=KeyFunction.NEXT_ITEM)
		public void gormedrActivityDate_keyNexItem()
		{
			
				getGDateClass().nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORMEDR_ACTIVITY_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="GORMEDR_ACTIVITY_DATE", function=KeyFunction.ITEM_CHANGE)
		public void gormedrActivityDate_itemChange()
		{
			
				getGDateClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORMEDR_ACTIVITY_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="GORMEDR_ACTIVITY_DATE", function=KeyFunction.ITEM_OUT)
		public void gormedrActivityDate_itemOut()
		{
			
				getGDateClass().itemOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORMEDR_DISA_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="GORMEDR_DISA_CODE")
		public void gormedrDisaCode_validate()
		{
			
				GormedrAdapter gormedrElement = (GormedrAdapter)this.getFormModel().getGormedr().getRowAdapter(true);
							this.gormedrDisaCode_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORMEDR.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void gormedr_AfterQuery(RowAdapterEvent args)
		{
			
			GormedrAdapter gormedrElement = (GormedrAdapter)args.getRow();			
						
				try {
				gormedrElement.setLockDbValues(true);
				try { 
				this.gormedrDisaCode_PostChange();
				} catch(Exception ex) {
				}
			
						} finally {
							gormedrElement.setLockDbValues(false);
						}
						

			}

		
	
	
}

