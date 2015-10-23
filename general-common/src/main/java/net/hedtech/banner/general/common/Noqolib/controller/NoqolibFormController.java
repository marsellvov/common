package net.hedtech.banner.general.common.Noqolib.controller;
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
import morphis.foundations.core.appsupportlib.runtime.controlsModel.containers.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.items.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.lovs.*;
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
import net.hedtech.general.common.forms.controller.DefaultFormController;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.banner.general.common.Noqolib.model.*;
import net.hedtech.banner.general.common.Noqolib.*;
import net.hedtech.banner.general.common.Noqolib.services.*;

		

public class NoqolibFormController extends AbstractSupportCodeObject  {

		
	
	
	public NoqolibFormController (ISupportCodeContainer container) {
		super(container);
	}
	
	
	@Override
	public NoqolibTaskPart getContainer() {
		return (NoqolibTaskPart)super.getContainer();
	}
	
	
	public NoqolibModel getFormModel() {
		return this.getContainer().getModel();
	}	
	
		//action methods generated from triggers
		/* Original PL/SQL code code for TRIGGER NOQOLIB.LOAD_CURRENT_RELEASE
		 :CURRENT_RELEASE := '8.0';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * NOQOLIB.LOAD_CURRENT_RELEASE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LOAD_CURRENT_RELEASE")
		public void Noqolib_LoadCurrentRelease()
		{
			
				getFormModel().getFormHeader().setCurrentRelease(toStr("9.0"));
			}

		
		/* Original PL/SQL code code for TRIGGER NOQOLIB.PRE-FORM
		 EXECUTE_TRIGGER('LOAD_CURRENT_RELEASE');
EXECUTE_TRIGGER('G$_VERIFY_ACCESS');
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * NOQOLIB.PRE-FORM
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskStartedPre
		public void Noqolib_TaskStartedPre(EventObject args)
		{
			
				executeAction("LOAD_CURRENT_RELEASE");
				executeAction("G$_VERIFY_ACCESS");
				getContainer().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER NOQOLIB.POST-FORM
		 EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * NOQOLIB.POST-FORM
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskEnded
		public void Noqolib_TaskEnded(EventObject args)
		{
			
				executeAction("G$_REVOKE_ACCESS");
				getContainer().getGoqrpls().gCheckFailure();
			}

		
	
}
	
