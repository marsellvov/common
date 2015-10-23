package net.hedtech.banner.general.common.Guauipw.controller;
 
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

import net.hedtech.banner.general.common.Guauipw.model.*;
import net.hedtech.banner.general.common.Guauipw.*;
import net.hedtech.banner.general.common.Guauipw.services.*;

import net.hedtech.general.common.libraries.Goqolib.services.GNonIconBtnClass;	
		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class CurrentValuesController extends DefaultBlockController {

	private GNonIconBtnClass getGNonIconBtnClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GNonIconBtnClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_NON_ICON_BTN_CLASS");
	}	

	
	public CurrentValuesController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
		
	@Override
	public GuauipwTask getTask() {
		return (GuauipwTask)super.getTask();
	}

	public GuauipwModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
		/* Original PL/SQL code code for TRIGGER CURRENT_VALUES.KEY-CLRBLK
		    CLEAR_BLOCK ;
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * CURRENT_VALUES.KEY-CLRBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRBLK", function=KeyFunction.CLEAR_BLOCK)
		public void currentValues_keyClearBlock()
		{
			
				clearBlock();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER CURRENT_VALUES.KEY-CLRREC
		    CLEAR_RECORD ;
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * CURRENT_VALUES.KEY-CLRREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRREC", function=KeyFunction.CLEAR_RECORD)
		public void currentValues_ClearRecord()
		{
			
				clearRecord();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER CURRENT_VALUES.KEY-NEXT-ITEM
		    NEXT_FIELD ;
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * CURRENT_VALUES.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", function=KeyFunction.NEXT_ITEM)
		public void currentValues_keyNexItem()
		{
			
				nextItem();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER CURRENT_VALUES.KEY-PREV-ITEM
		    PREVIOUS_FIELD ;
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * CURRENT_VALUES.KEY-PREV-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PREV-ITEM", function=KeyFunction.PREVIOUS_ITEM)
		public void currentValues_PreviousItem()
		{
			
				previousItem();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER CURR_ALT_USER_ID.WHEN-VALIDATE-ITEM
		    G$_CHECK_VALUE ((SUBSTR(:CURR_ALT_USER_ID, 1, 4) = 'OPS$'),
 G$_NLS.Get('GUAUIPW-0009', 'FORM','*ERROR* Cannot enter alternate user id''s that begin with ''OPS$''') ,
         TRUE);
--
   IF :CURR_ALT_USER_ID IS NULL THEN
      RETURN;
   END IF;
   DECLARE
      PTI_INTO_TEMP        VARCHAR2(255);
      CURSOR PTI_CURSOR IS
         SELECT 'X'
         FROM   ALL_USERS
         WHERE  USERNAME = :CURR_ALT_USER_ID ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO PTI_INTO_TEMP ;
      G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND,
          G$_NLS.Get('GUAUIPW-0010', 'FORM','*ERROR* Invalid user ID') , TRUE);
   END ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * CURR_ALT_USER_ID.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="CURR_ALT_USER_ID")
		public void currAltUserId_validate()
		{
			
				int rowCount = 0;
				getTask().getGoqrpls().gCheckValue(toBool((substring(getFormModel().getCurrentValues().getCurrAltUserId(), toInt(1), toInt(4)).equals("OPS$"))), GNls.Fget(toStr("GUAUIPW-0009"), toStr("FORM"), toStr("*ERROR* Cannot enter alternate user id's that begin with 'OPS$'")), toBool(NBool.True));
				if ( getFormModel().getCurrentValues().getCurrAltUserId().isNull() )
				{
					return ;
				}
				{
					NString ptiIntoTemp= NString.getNull();
					String sqlptiCursor = "SELECT 'X' " +
	" FROM ALL_USERS " +
	" WHERE USERNAME = :CURR_ALT_USER_ID ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						ptiCursor.addParameter("CURR_ALT_USER_ID", getFormModel().getCurrentValues().getCurrAltUserId());
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							ptiIntoTemp = ptiCursorResults.getStr(0);
						}
						getTask().getGoqrpls().gCheckValue(toBool(ptiCursor.notFound()), GNls.Fget(toStr("GUAUIPW-0010"), toStr("FORM"), toStr("*ERROR* Invalid user ID")), toBool(NBool.True));
					}
					finally{
						ptiCursor.close();
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * VERIFY_1_SAVE_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="VERIFY_1_SAVE_BTN")
		public void verify1SaveBtn_click()
		{
			
				getGNonIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * T_1_EXIT_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="T_1_EXIT_BTN")
		public void t1ExitBtn_click()
		{
			
				getGNonIconBtnClass().whenMouseClick();
			}

		
	
	
}

