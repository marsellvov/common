package net.hedtech.banner.finance.common.Foiiden.controller;
 
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
import net.hedtech.banner.finance.common.Foiiden.model.*;
import net.hedtech.banner.finance.common.Foiiden.*;
import net.hedtech.banner.finance.common.Foiiden.services.*;

		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class SoundexController extends DefaultBlockController {


	
	public SoundexController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
		
	@Override
	public FoiidenTask getTask() {
		return (FoiidenTask)super.getTask();
	}

	public FoiidenModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
		/* Original PL/SQL code code for TRIGGER SOUNDEX.KEY-ENTER
		    ENTER ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOUNDEX.KEY-ENTER
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-ENTER")
		public void soundex_KeyEnter()
		{

			}

		
		/* Original PL/SQL code code for TRIGGER SOUNDEX.KEY-EXEQRY
		    PREVIOUS_BLOCK ;
   G$_CHECK_FAILURE ;
   EXECUTE_QUERY ;
   :SOUNDEX_LAST_NAME := '';
   :SOUNDEX_FIRST_NAME := '';


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOUNDEX.KEY-EXEQRY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-EXEQRY", function=KeyFunction.EXECUTE_QUERY)
		public void soundex_ExecuteQuery()
		{
			
				previousBlock();
				getTask().getGoqrpls().gCheckFailure();
				if ((getFormModel().getSoundex().getSoundexLastName().isNull() && getFormModel().getSoundex().getSoundexFirstName().isNull()))
				{
					errorMessage(GNls.Fget(toStr("FOIIDEN-0006"), toStr("FORM"), toStr("*ERROR* Define query criteria, then press EXECUTE QUERY.")));
					throw new ApplicationException();
				}
				else {
					executeQuery();
				}
				getFormModel().getSoundex().setSoundexLastName(toStr(""));
				getFormModel().getSoundex().setSoundexFirstName(toStr(""));
				executeAction("ENABLE_DETAIL_BTN_TRIG");
			}

		
		/* Original PL/SQL code code for TRIGGER SOUNDEX.KEY-EXIT
		    :GLOBAL.VALUE := '' ;
--
--12699   EXIT_FORM ;
G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOUNDEX.KEY-EXIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-EXIT", function=KeyFunction.EXIT)
		public void soundex_Exit()
		{
			
				setGlobal("VALUE", toStr(""));
				// 
				// 12699   EXIT_FORM ;
				getTask().getGoqrpls().getGGoqolibKeyTrigger().b2kExitForm();
			}

		
		/* Original PL/SQL code code for TRIGGER SOUNDEX.KEY-NEXT-ITEM
		    NEXT_FIELD ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOUNDEX.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", function=KeyFunction.NEXT_ITEM)
		public void soundex_keyNexItem()
		{
			
				nextItem();
			}

		
		/* Original PL/SQL code code for TRIGGER SOUNDEX.KEY-OTHERS
		    EXECUTE_TRIGGER( 'INVALID_FUNCTION_MSG' ) ;
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOUNDEX.KEY-OTHERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-OTHERS")
		public void soundex_KeyOthers()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SOUNDEX.KEY-PRVBLK
		    PREVIOUS_BLOCK ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOUNDEX.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void soundex_PreviousBlock()
		{
			
				previousBlock();
			}

		
	
	
}

