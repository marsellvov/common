package net.hedtech.banner.general.common.Stvnatn.controller;
 
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

import net.hedtech.banner.general.common.Stvnatn.model.*;
import net.hedtech.banner.general.common.Stvnatn.*;
import net.hedtech.banner.general.common.Stvnatn.services.*;

import net.hedtech.general.common.libraries.Goqolib.services.GDateClass;	
		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class StvnatnController extends DefaultBlockController {

	private GDateClass getGDateClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GDateClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_DATE_CLASS");
	}	

	
	public StvnatnController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
		
	@Override
	public StvnatnTask getTask() {
		return (StvnatnTask)super.getTask();
	}

	public StvnatnModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
		/* Original PL/SQL code code for TRIGGER STVNATN.PRE-INSERT
		    :STVNATN_ACTIVITY_DATE := TO_DATE(:CURRENT_DATE,G$_DATE.GET_NLS_DATE_FORMAT) ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVNATN.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowInsert
		public void stvnatn_BeforeRowInsert(RowAdapterEvent args)
		{
			
				StvnatnAdapter stvnatnElement = (StvnatnAdapter)args.getRow();


				stvnatnElement.setStvnatnActivityDate(toDate(getFormModel().getFormHeader().getCurrentDate(), GDate.getNlsDateFormat()));
			}

		
		/* Original PL/SQL code code for TRIGGER STVNATN.PRE-UPDATE
		    :STVNATN_ACTIVITY_DATE := TO_DATE(:CURRENT_DATE,G$_DATE.GET_NLS_DATE_FORMAT) ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVNATN.PRE-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowUpdate
		public void stvnatn_BeforeRowUpdate(RowAdapterEvent args)
		{
			
				StvnatnAdapter stvnatnElement = (StvnatnAdapter)args.getRow();


				stvnatnElement.setStvnatnActivityDate(toDate(getFormModel().getFormHeader().getCurrentDate(), GDate.getNlsDateFormat()));
			}

		
		/* Original PL/SQL code code for TRIGGER STVNATN_SCOD_CODE_ISO.KEY-LISTVAL
		 -- 71-1
G$_COPY_FLD_ATTR;
EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
G$_CHECK_FAILURE;
--
:GLOBAL.EDI_ELEMENT_ID := '3166';
:GLOBAL.EDI_STANDARD_IND := 'I';
G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER,'GTVSCOD','QUERY');
G$_RESET_GLOBAL;
G$_CHECK_FAILURE;
--
:GLOBAL.EDI_ELEMENT_ID := '';
:GLOBAL.EDI_STANDARD_IND := '';
--
IF  :GLOBAL.VALUE IS NOT NULL THEN
    EXECUTE_TRIGGER('LIST_VALUES_COPY');
    G$_CHECK_FAILURE;
    :GLOBAL.VALUE := '';
END IF;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVNATN_SCOD_CODE_ISO.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="STVNATN_SCOD_CODE_ISO", function=KeyFunction.LIST_VALUES)
		public void stvnatnScodCodeIso_ListValues()
		{
			
				//  71-1
				//  71-1
				getTask().getGoqrpls().gCopyFldAttr();
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				// 
				setGlobal("EDI_ELEMENT_ID", toStr("3166"));
				setGlobal("EDI_STANDARD_IND", toStr("I"));
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("GTVSCOD"), toStr("QUERY"));
				getTask().getGoqrpls().gResetGlobal();
				getTask().getGoqrpls().gCheckFailure();
				// 
				setGlobal("EDI_ELEMENT_ID", toStr(""));
				setGlobal("EDI_STANDARD_IND", toStr(""));
				// 
				if ( !getGlobal("VALUE").isNull() )
				{
					executeAction("LIST_VALUES_COPY");
					getTask().getGoqrpls().gCheckFailure();
					setGlobal("VALUE", toStr(""));
					stvnatnScodCodeIso_validate();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER STVNATN_SCOD_CODE_ISO.LIST_VALUES_COPY
		 :STVNATN.STVNATN_SCOD_CODE_ISO := :GLOBAL.VALUE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVNATN_SCOD_CODE_ISO.LIST_VALUES_COPY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="LIST_VALUES_COPY", item="STVNATN_SCOD_CODE_ISO")
		public void stvnatnScodCodeIso_ListValuesCopy()
		{
			

				StvnatnAdapter stvnatnElement = (StvnatnAdapter)this.getFormModel().getStvnatn().getRowAdapter(true);

				if(stvnatnElement!=null){

				stvnatnElement.setStvnatnScodCodeIso(getGlobal("VALUE"));
			}
		}
		
		/* Original PL/SQL code code for TRIGGER STVNATN_SCOD_CODE_ISO.WHEN-VALIDATE-ITEM
		 DECLARE
  ISO_DESC VARCHAR2(1);
  CURSOR PTI_CURSOR IS
  SELECT 'Y'
    FROM GTVSCOD
   WHERE GTVSCOD_STANDARD_IND = 'I'
     AND GTVSCOD_CODE = :STVNATN_SCOD_CODE_ISO
     AND GTVSCOD_ELEMENT_ID = '3166';
BEGIN
	  IF  :STVNATN.STVNATN_SCOD_CODE_ISO IS NULL THEN
	  	  RETURN;
	  END IF;
	  --
    OPEN PTI_CURSOR;
    FETCH PTI_CURSOR INTO ISO_DESC;
    IF  PTI_CURSOR%NOTFOUND THEN
        MESSAGE( G$_NLS.Get('STVNATN-0008','FORM','*ERROR* ISO Standard Code is Invalid; LIST is Available.') );
        CLOSE PTI_CURSOR;
        RAISE FORM_TRIGGER_FAILURE;
    END IF;
    CLOSE PTI_CURSOR;
  END ;
--
  :GLOBAL.QUERY_MODE := '0';
EXCEPTION
  WHEN FORM_TRIGGER_FAILURE THEN
    :GLOBAL.QUERY_MODE := '0';
    RAISE FORM_TRIGGER_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVNATN_SCOD_CODE_ISO.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="STVNATN_SCOD_CODE_ISO")
		public void stvnatnScodCodeIso_validate()
		{
			
				StvnatnAdapter stvnatnElement = (StvnatnAdapter)this.getFormModel().getStvnatn().getRowAdapter(true);

				if(stvnatnElement!=null){

				int rowCount = 0;
				{
					NString isoDesc= NString.getNull();
					String sqlptiCursor = "SELECT 'Y' " +
	" FROM GTVSCOD " +
	" WHERE GTVSCOD_STANDARD_IND = 'I' AND GTVSCOD_CODE = :STVNATN_SCOD_CODE_ISO AND GTVSCOD_ELEMENT_ID = '3166' ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						if ( stvnatnElement.getStvnatnScodCodeIso().isNull() )
						{
							return ;
						}
						
						// 
						//Setting query parameters
						ptiCursor.addParameter("STVNATN_SCOD_CODE_ISO", stvnatnElement.getStvnatnScodCodeIso());
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							isoDesc = ptiCursorResults.getStr(0);
						}
						if ( ptiCursor.notFound() )
						{
							errorMessage(GNls.Fget(toStr("STVNATN-0008"), toStr("FORM"), toStr("*ERROR* ISO Standard Code is Invalid; LIST is Available.")));
							
							throw new ApplicationException();
						}
					
					}
					finally{
						ptiCursor.close();
					}
				}
				// 
				setGlobal("QUERY_MODE", toStr("0"));
			}
		}
		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVNATN_ACTIVITY_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="STVNATN_ACTIVITY_DATE", function=KeyFunction.NEXT_ITEM)
		public void stvnatnActivityDate_keyNexItem()
		{
			
				getGDateClass().nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVNATN_ACTIVITY_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="STVNATN_ACTIVITY_DATE", function=KeyFunction.ITEM_CHANGE)
		public void stvnatnActivityDate_itemChange()
		{
			
				getGDateClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVNATN_ACTIVITY_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="STVNATN_ACTIVITY_DATE", function=KeyFunction.ITEM_OUT)
		public void stvnatnActivityDate_itemOut()
		{
			
				getGDateClass().itemOut();
			}

		
	
	
}

