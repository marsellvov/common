package net.hedtech.general.common.libraries.Goqolib.controller;

import java.util.*;

import morphis.foundations.core.appsupportlib.runtime.action.ActionTrigger;
import morphis.foundations.core.appsupportlib.runtime.control.AbstractBlockController;
import morphis.foundations.core.appsupportlib.runtime.control.IFormController;

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
import net.hedtech.general.common.libraries.Goqgmnu.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.general.common.libraries.Goqolib.model.*;
import net.hedtech.general.common.libraries.Goqolib.*;
import net.hedtech.general.common.libraries.Goqolib.services.*;
import net.hedtech.general.common.libraries.Goqolib.model.GoqolibModel;

public class FormHeaderController extends AbstractSupportCodeObject {

	public FormHeaderController(ISupportCodeContainer container) {
		super(container);
	}

	public GoqolibTaskPart getContainer() {
		return (GoqolibTaskPart) super.getContainer();
	}

	public GoqolibModel getFormModel() {
		return this.getContainer().getModel();
	}

	// action methods generated from triggers
	/*
	 * Original PL/SQL code code for TRIGGER OBJECT_TYPE.WHEN-LIST-CHANGED
	 * EXECUTE_TRIGGER('QUERY_DATA');
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * OBJECT_TYPE.WHEN-LIST-CHANGED
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-LIST-CHANGED", item = "OBJECT_TYPE")
	public void objectType_listChange() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// executeAction("QUERY_DATA");
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.FormHeaderController.objectType_listChange is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER OBJECT_TYPE.KEY-PRVBLK
	 * EXECUTE_TRIGGER('CHECK_KEYS'); G$_CHECK_FAILURE; -- GO_BLOCK('GURMENU');
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * OBJECT_TYPE.KEY-PRVBLK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-PRVBLK", item = "OBJECT_TYPE", function = KeyFunction.PREVIOUS_BLOCK)
	public void objectType_PreviousBlock() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// executeAction("CHECK_KEYS");
		// getTask().getGoqrpls().gCheckFailure();
		// //
		// goBlock(toStr("GURMENU"));
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.FormHeaderController.objectType_PreviousBlock is not completely migrated yet. Please read the Migration Guide.");
		

	}

}
