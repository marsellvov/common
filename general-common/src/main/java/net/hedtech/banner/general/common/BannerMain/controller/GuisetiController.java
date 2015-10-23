package net.hedtech.banner.general.common.BannerMain.controller;
 
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
import static morphis.foundations.core.util.globals.Globals.setGlobal;
import morphis.foundations.core.util.*;
import morphis.core.utils.behavior.annotations.*;
import morphis.foundations.flavors.forms.appsupportlib.runtime.*;
import net.hedtech.general.common.forms.controller.DefaultBlockController;
import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Goqolib.services.GValFormClass;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.banner.general.common.BannerMain.BannerMainTask;
import net.hedtech.banner.general.common.BannerMain.model.BannerMainModel;
import net.hedtech.banner.general.common.BannerMain.model.GuisetiAdapter;

		
public class GuisetiController extends DefaultBlockController {


	
	public GuisetiController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
	private GValFormClass getGValFormClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GValFormClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_VAL_FORM_CLASS");
	}		
		
	@Override
	public BannerMainTask getTask() {
		return (BannerMainTask)super.getTask();
	}

	public BannerMainModel getFormModel() {
		return this.getTask().getModel();
	}
		
		/* Original PL/SQL code code for TRIGGER GUISETI.WHEN-MOUSE-DOUBLECLICK
		 BEGIN
  EXECUTE_TRIGGER('EXIT_PROCEDURE');
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUISETI.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK")
		public void guiseti_doubleClick()
		{
			
			exitProcedure();			
		}

		public void exitProcedure()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				GuisetiAdapter guisetiElement = (GuisetiAdapter)this.getFormModel().getGuiseti().getRowAdapter(true);
				{
					
					setGlobal("SET_INST", toStr("Y"));
					setGlobal("MEP_INIT_RETURN", toStr("Y"));
					setGlobal("MEP_INIT", toStr(""));
					// 
					GVpdiSecurity.gVpdiSetHomeContext(guisetiElement.getVpdiCode());
					GVpdiSecurity.gVpdiSetUserDefault(guisetiElement.getVpdiCode());
					((BannerMainFormController)getParentController()).initGlobals();
					goItem("LOGIN.USERNAME");					
					((BannerMainFormController)getParentController()).Guainit_LeaveInit();
					
					getTask().getServices().startApplication();
				}
			}
	
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQSETI.WHEN-NEW-RECORD-INSTANCE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-NEW-RECORD-INSTANCE", function=KeyFunction.RECORD_CHANGE)
		@Before
		public void Guqseti_recordChange()
		{
			
			getGValFormClass().recordChange();
		}

		
		@ActionTrigger(action="WHEN_NEW_BLOCK_INSTANCE", function=KeyFunction.BLOCK_CHANGE)
		public void Guqseti_WhenNewBlockInstanceTrg()
		{
			
				executeQuery();
			}

}

