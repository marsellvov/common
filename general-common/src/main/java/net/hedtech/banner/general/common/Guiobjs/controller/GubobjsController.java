package net.hedtech.banner.general.common.Guiobjs.controller;
 
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
import net.hedtech.banner.general.common.Guiobjs.model.*;
import net.hedtech.banner.general.common.Guiobjs.*;
import net.hedtech.banner.general.common.Guiobjs.services.*;

		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class GubobjsController extends DefaultBlockController {


	
	public GubobjsController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
		
	@Override
	public GuiobjsTask getTask() {
		return (GuiobjsTask)super.getTask();
	}

	public GuiobjsModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
		/* Original PL/SQL code code for TRIGGER GUBOBJS.KEY-PRVREC
		 BEGIN
  IF :SYSTEM.CURSOR_RECORD = '1' THEN
    MESSAGE( G$_NLS.Get('GUIOBJS-0030', 'FORM','*WARNING* At first record.') );
    RETURN;
  END IF;
--
  UP;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBOBJS.KEY-PRVREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVREC", function=KeyFunction.PREVIOUS_RECORD)
		public void gubobjs_PreviousRecord()
		{
			if(isInFirstRecord())
				{
					warningMessage(GNls.Fget(toStr("GUIOBJS-0030"), toStr("FORM"), toStr("*WARNING* At first record.")));
					return ;
				}
				up();
			}

		
		/* Original PL/SQL code code for TRIGGER GUBOBJS.KEY-NXTKEY
		 BEGIN
  EXECUTE_TRIGGER('EXIT_WITH_VALUE');
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBOBJS.KEY-NXTKEY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTKEY")
		public void gubobjs_KeyNxtkey()
		{
			
				executeAction("EXIT_WITH_VALUE");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GUBOBJS.KEY-NXTREC
		 BEGIN
  IF :SYSTEM.LAST_RECORD = 'TRUE' THEN
    MESSAGE( G$_NLS.Get('GUIOBJS-0032', 'FORM','*WARNING* At last record.') );
    RETURN;
  END IF;
--
  DOWN;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBOBJS.KEY-NXTREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void gubobjs_NextRecord()
		{
			
				if ( isInLastRecord(true) )
				{
					warningMessage(GNls.Fget(toStr("GUIOBJS-0032"), toStr("FORM"), toStr("*WARNING* At last record.")));
					return ;
				}
				
				else {
					((GuiobjsFormController)this.getParentController()).Guiobjs_NextRecord();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GUBOBJS_NAME.WHEN-MOUSE-DOUBLECLICK
		 BEGIN
--
  IF :GUBOBJS_NAME IS NULL THEN
	RETURN;
  END IF;
--
  EXECUTE_TRIGGER('EXIT_WITH_VALUE');
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBOBJS_NAME.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="GUBOBJS_NAME")
		public void gubobjsName_doubleClick()
		{
				GubobjsAdapter gubobjsElement = (GubobjsAdapter)this.getFormModel().getGubobjs().getRowAdapter(true);
				if(gubobjsElement == null){
					return;
				}

				if ( gubobjsElement.getGubobjsName().isNull() )
				{
					return ;
				}
				executeAction("EXIT_WITH_VALUE");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GUBOBJS_DESC.WHEN-MOUSE-DOUBLECLICK
		 BEGIN
--
  IF :GUBOBJS_DESC IS NULL THEN
	RETURN;
  END IF;
--
  EXECUTE_TRIGGER('EXIT_WITH_VALUE');
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBOBJS_DESC.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="GUBOBJS_DESC")
		public void gubobjsDesc_doubleClick()
		{
				GubobjsAdapter gubobjsElement = (GubobjsAdapter)this.getFormModel().getGubobjs().getRowAdapter(true);
				if(gubobjsElement == null){
					return;
				}
				if ( gubobjsElement.getGubobjsDesc().isNull() )
				{
					return ;
				}
				executeAction("EXIT_WITH_VALUE");
				getTask().getGoqrpls().gCheckFailure();
			}

		
	
	
}

