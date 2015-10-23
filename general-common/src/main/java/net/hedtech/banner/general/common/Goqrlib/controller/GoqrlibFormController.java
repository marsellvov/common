package net.hedtech.banner.general.common.Goqrlib.controller;

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
import morphis.core.utils.behavior.annotations.*;
import morphis.foundations.flavors.forms.appsupportlib.runtime.*;
import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.forms.controller.DefaultFormController;


import net.hedtech.banner.general.common.Goqrlib.model.*;
import net.hedtech.banner.general.common.Goqrlib.*;
import net.hedtech.banner.general.common.Goqrlib.services.*;

		

public class GoqrlibFormController extends AbstractSupportCodeObject  {

		
	
	
	public GoqrlibFormController(ISupportCodeContainer container) {
		super(container);
	}
		
		
		
	@Override
	public GoqrlibTaskPart getContainer() {
		return (GoqrlibTaskPart)super.getContainer();
	}

	public GoqrlibModel getFormModel() {
		return this.getContainer().getModel();
	}
	
		//action methods generated from triggers
		/* Original PL/SQL code code for TRIGGER GOQRLIB.LOAD_SERVER_SERVICE_NAMES
		 BEGIN
  COPY(G$_GET_UPRF_WEBRPT,'G$_BANNER_REPORT_HEADER.OREP_SERVER_NAME');
  COPY(G$_GET_UPRF_WEBRPT_SERVICE,'G$_BANNER_REPORT_HEADER.OREP_SERVICE');
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOQRLIB.LOAD_SERVER_SERVICE_NAMES
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LOAD_SERVER_SERVICE_NAMES")
		public void Goqrlib_LoadServerServiceNames()
		{
			
				copy(getContainer().getGoqrpls().gGetUprfWebrpt(),"G$_BANNER_REPORT_HEADER.OREP_SERVER_NAME");
				copy(getContainer().getGoqrpls().gGetUprfWebrptService(),"G$_BANNER_REPORT_HEADER.OREP_SERVICE");
			}

		
		/* Original PL/SQL code code for TRIGGER GOQRLIB.LOAD_CURRENT_RELEASE
		 BEGIN
  :CURRENT_RELEASE := '8.1.0.1';
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOQRLIB.LOAD_CURRENT_RELEASE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LOAD_CURRENT_RELEASE")
		public void Goqrlib_LoadCurrentRelease()
		{
			
				getFormModel().getFormHeader().setCurrentRelease(toStr("9.0"));
			}

		
	
}
	
