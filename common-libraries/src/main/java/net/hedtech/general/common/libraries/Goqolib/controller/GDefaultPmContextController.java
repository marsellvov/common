package net.hedtech.general.common.libraries.Goqolib.controller;

import java.util.*;

import morphis.foundations.core.appsupportlib.runtime.action.MenuTrigger;
import morphis.foundations.core.appsupportlib.runtime.control.AbstractMenuController;
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

public class GDefaultPmContextController extends AbstractSupportCodeObject {

	public GDefaultPmContextController(ISupportCodeContainer container) {
		super(container);
	}

	public GoqolibTaskPart getContainer() {
		 return (GoqolibTaskPart)super.getContainer();
	}

	public GoqolibModel getFormModel() {
		return this.getContainer().getModel();
	}

	// action methods generated from triggers
	/*
	 * Original PL/SQL code code for TRIGGER ROLLBACK.PLSQL_CMD G$_RECONNECT;
	 * G$_CHECK_FAILURE; -- DO_KEY('Clear_form');
	 */
	// / <summary>
	// / </summary>
	// / <remarks>
	// / ID:
	// /
	// /</remarks>
	// / <TriggerInfo>ROLLBACK.PLSQL_CMD</TriggerInfo>

	@MenuTrigger(item = "ROLLBACK")
	public void itmGDefaultPmRollback_Click() {
		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// getTask().getGoqrpls().gReconnect();
		// getTask().getGoqrpls().gCheckFailure();
		// //
		// executeAction("CLEAR_FORM");
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GDefaultPmContextController.itmGDefaultPmRollback_Click is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER SAVE.PLSQL_CMD G$_RECONNECT;
	 * G$_CHECK_FAILURE; -- DO_KEY('Commit_form');
	 */
	// / <summary>
	// / </summary>
	// / <remarks>
	// / ID:
	// /
	// /</remarks>
	// / <TriggerInfo>SAVE.PLSQL_CMD</TriggerInfo>

	@MenuTrigger(item = "SAVE")
	public void itmGDefaultPmSave_Click() {
		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// getTask().getGoqrpls().gReconnect();
		// getTask().getGoqrpls().gCheckFailure();
		// //
		// executeAction("SAVE");
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GDefaultPmContextController.itmGDefaultPmSave_Click is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER EXIT.PLSQL_CMD G$_RECONNECT;
	 * G$_CHECK_FAILURE; -- DO_KEY('Exit_form');
	 */
	// / <summary>
	// / </summary>
	// / <remarks>
	// / ID:
	// /
	// /</remarks>
	// / <TriggerInfo>EXIT.PLSQL_CMD</TriggerInfo>

	@MenuTrigger(item = "EXIT")
	public void itmGDefaultPmExit_Click() {
		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// getTask().getGoqrpls().gReconnect();
		// getTask().getGoqrpls().gCheckFailure();
		// //
		// executeAction("EXIT");
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GDefaultPmContextController.itmGDefaultPmExit_Click is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER PRINT.PLSQL_CMD DO_KEY('print');
	 */
	// / <summary>
	// / </summary>
	// / <remarks>
	// / ID:
	// /
	// /</remarks>
	// / <TriggerInfo>PRINT.PLSQL_CMD</TriggerInfo>

	@MenuTrigger(item = "PRINT")
	public void itmGDefaultPmPrint_Click() {
		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// executeAction("PRINT");
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GDefaultPmContextController.itmGDefaultPmPrint_Click is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER ADD_FORM.PLSQL_CMD
	 * G$_ADD_TO_PERSONAL_MENU; G$_CHECK_FAILURE;
	 */
	// / <summary>
	// / </summary>
	// / <remarks>
	// / ID:
	// /
	// /</remarks>
	// / <TriggerInfo>ADD_FORM.PLSQL_CMD</TriggerInfo>

	@MenuTrigger(item = "ADD_FORM")
	public void itmGDefaultPmAddForm_Click() {
		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// getTask().getGoqrpls().gAddToPersonalMenu();
		// getTask().getGoqrpls().gCheckFailure();
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GDefaultPmContextController.itmGDefaultPmAddForm_Click is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER SUB_MENU_01.PLSQL_CMD BEGIN
	 * G$_NAVIGATION_FRAME.EXECUTE_MENU('OPTIONS.SUB_MENU_01'); END;
	 */
	// / <summary>
	// / </summary>
	// / <remarks>
	// / ID:
	// /
	// /</remarks>
	// / <TriggerInfo>SUB_MENU_01.PLSQL_CMD</TriggerInfo>

	@MenuTrigger(item = "SUB_MENU_01")
	public void itmGDefaultPmSubMenu01_Click() {
		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// getTask().getGoqrpls().getGNavigationFrame().executeMenu(toStr("OPTIONS.SUB_MENU_01"));
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GDefaultPmContextController.itmGDefaultPmSubMenu01_Click is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER SUB_MENU_02.PLSQL_CMD BEGIN
	 * G$_NAVIGATION_FRAME.EXECUTE_MENU('OPTIONS.SUB_MENU_02'); END;
	 */
	// / <summary>
	// / </summary>
	// / <remarks>
	// / ID:
	// /
	// /</remarks>
	// / <TriggerInfo>SUB_MENU_02.PLSQL_CMD</TriggerInfo>

	@MenuTrigger(item = "SUB_MENU_02")
	public void itmGDefaultPmSubMenu02_Click() {
		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// getTask().getGoqrpls().getGNavigationFrame().executeMenu(toStr("OPTIONS.SUB_MENU_02"));
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GDefaultPmContextController.itmGDefaultPmSubMenu02_Click is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER SUB_MENU_03.PLSQL_CMD BEGIN
	 * G$_NAVIGATION_FRAME.EXECUTE_MENU('OPTIONS.SUB_MENU_03'); END;
	 */
	// / <summary>
	// / </summary>
	// / <remarks>
	// / ID:
	// /
	// /</remarks>
	// / <TriggerInfo>SUB_MENU_03.PLSQL_CMD</TriggerInfo>

	@MenuTrigger(item = "SUB_MENU_03")
	public void itmGDefaultPmSubMenu03_Click() {
		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// getTask().getGoqrpls().getGNavigationFrame().executeMenu(toStr("OPTIONS.SUB_MENU_03"));
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GDefaultPmContextController.itmGDefaultPmSubMenu03_Click is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER SUB_MENU_04.PLSQL_CMD BEGIN
	 * G$_NAVIGATION_FRAME.EXECUTE_MENU('OPTIONS.SUB_MENU_04'); END;
	 */
	// / <summary>
	// / </summary>
	// / <remarks>
	// / ID:
	// /
	// /</remarks>
	// / <TriggerInfo>SUB_MENU_04.PLSQL_CMD</TriggerInfo>

	@MenuTrigger(item = "SUB_MENU_04")
	public void itmGDefaultPmSubMenu04_Click() {
		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// getTask().getGoqrpls().getGNavigationFrame().executeMenu(toStr("OPTIONS.SUB_MENU_04"));
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GDefaultPmContextController.itmGDefaultPmSubMenu04_Click is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER SUB_MENU_05.PLSQL_CMD BEGIN
	 * G$_NAVIGATION_FRAME.EXECUTE_MENU('OPTIONS.SUB_MENU_05'); END;
	 */
	// / <summary>
	// / </summary>
	// / <remarks>
	// / ID:
	// /
	// /</remarks>
	// / <TriggerInfo>SUB_MENU_05.PLSQL_CMD</TriggerInfo>

	@MenuTrigger(item = "SUB_MENU_05")
	public void itmGDefaultPmSubMenu05_Click() {
		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// getTask().getGoqrpls().getGNavigationFrame().executeMenu(toStr("OPTIONS.SUB_MENU_05"));
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GDefaultPmContextController.itmGDefaultPmSubMenu05_Click is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER SUB_MENU_06.PLSQL_CMD BEGIN
	 * G$_NAVIGATION_FRAME.EXECUTE_MENU('OPTIONS.SUB_MENU_06'); END;
	 */
	// / <summary>
	// / </summary>
	// / <remarks>
	// / ID:
	// /
	// /</remarks>
	// / <TriggerInfo>SUB_MENU_06.PLSQL_CMD</TriggerInfo>

	@MenuTrigger(item = "SUB_MENU_06")
	public void itmGDefaultPmSubMenu06_Click() {
		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// getTask().getGoqrpls().getGNavigationFrame().executeMenu(toStr("OPTIONS.SUB_MENU_06"));
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GDefaultPmContextController.itmGDefaultPmSubMenu06_Click is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER SUB_MENU_07.PLSQL_CMD BEGIN
	 * G$_NAVIGATION_FRAME.EXECUTE_MENU('OPTIONS.SUB_MENU_07'); END;
	 */
	// / <summary>
	// / </summary>
	// / <remarks>
	// / ID:
	// /
	// /</remarks>
	// / <TriggerInfo>SUB_MENU_07.PLSQL_CMD</TriggerInfo>

	@MenuTrigger(item = "SUB_MENU_07")
	public void itmGDefaultPmSubMenu07_Click() {
		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// getTask().getGoqrpls().getGNavigationFrame().executeMenu(toStr("OPTIONS.SUB_MENU_07"));
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GDefaultPmContextController.itmGDefaultPmSubMenu07_Click is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER SUB_MENU_08.PLSQL_CMD BEGIN
	 * G$_NAVIGATION_FRAME.EXECUTE_MENU('OPTIONS.SUB_MENU_08'); END;
	 */
	// / <summary>
	// / </summary>
	// / <remarks>
	// / ID:
	// /
	// /</remarks>
	// / <TriggerInfo>SUB_MENU_08.PLSQL_CMD</TriggerInfo>

	@MenuTrigger(item = "SUB_MENU_08")
	public void itmGDefaultPmSubMenu08_Click() {
		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// getTask().getGoqrpls().getGNavigationFrame().executeMenu(toStr("OPTIONS.SUB_MENU_08"));
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GDefaultPmContextController.itmGDefaultPmSubMenu08_Click is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER SUB_MENU_09.PLSQL_CMD BEGIN
	 * G$_NAVIGATION_FRAME.EXECUTE_MENU('OPTIONS.SUB_MENU_09'); END;
	 */
	// / <summary>
	// / </summary>
	// / <remarks>
	// / ID:
	// /
	// /</remarks>
	// / <TriggerInfo>SUB_MENU_09.PLSQL_CMD</TriggerInfo>

	@MenuTrigger(item = "SUB_MENU_09")
	public void itmGDefaultPmSubMenu09_Click() {
		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// getTask().getGoqrpls().getGNavigationFrame().executeMenu(toStr("OPTIONS.SUB_MENU_09"));
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GDefaultPmContextController.itmGDefaultPmSubMenu09_Click is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER SUB_MENU_10.PLSQL_CMD BEGIN
	 * G$_NAVIGATION_FRAME.EXECUTE_MENU('OPTIONS.SUB_MENU_10'); END;
	 */
	// / <summary>
	// / </summary>
	// / <remarks>
	// / ID:
	// /
	// /</remarks>
	// / <TriggerInfo>SUB_MENU_10.PLSQL_CMD</TriggerInfo>

	@MenuTrigger(item = "SUB_MENU_10")
	public void itmGDefaultPmSubMenu10_Click() {
		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// getTask().getGoqrpls().getGNavigationFrame().executeMenu(toStr("OPTIONS.SUB_MENU_10"));
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GDefaultPmContextController.itmGDefaultPmSubMenu10_Click is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER SUB_MENU_11.PLSQL_CMD BEGIN
	 * G$_NAVIGATION_FRAME.EXECUTE_MENU('OPTIONS.SUB_MENU_11'); END;
	 */
	// / <summary>
	// / </summary>
	// / <remarks>
	// / ID:
	// /
	// /</remarks>
	// / <TriggerInfo>SUB_MENU_11.PLSQL_CMD</TriggerInfo>

	@MenuTrigger(item = "SUB_MENU_11")
	public void itmGDefaultPmSubMenu11_Click() {
		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// getTask().getGoqrpls().getGNavigationFrame().executeMenu(toStr("OPTIONS.SUB_MENU_11"));
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GDefaultPmContextController.itmGDefaultPmSubMenu11_Click is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER SUB_MENU_12.PLSQL_CMD BEGIN
	 * G$_NAVIGATION_FRAME.EXECUTE_MENU('OPTIONS.SUB_MENU_12'); END;
	 */
	// / <summary>
	// / </summary>
	// / <remarks>
	// / ID:
	// /
	// /</remarks>
	// / <TriggerInfo>SUB_MENU_12.PLSQL_CMD</TriggerInfo>

	@MenuTrigger(item = "SUB_MENU_12")
	public void itmGDefaultPmSubMenu12_Click() {
		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// getTask().getGoqrpls().getGNavigationFrame().executeMenu(toStr("OPTIONS.SUB_MENU_12"));
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GDefaultPmContextController.itmGDefaultPmSubMenu12_Click is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER SUB_MENU_13.PLSQL_CMD BEGIN
	 * G$_NAVIGATION_FRAME.EXECUTE_MENU('OPTIONS.SUB_MENU_13'); END;
	 */
	// / <summary>
	// / </summary>
	// / <remarks>
	// / ID:
	// /
	// /</remarks>
	// / <TriggerInfo>SUB_MENU_13.PLSQL_CMD</TriggerInfo>

	@MenuTrigger(item = "SUB_MENU_13")
	public void itmGDefaultPmSubMenu13_Click() {
		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// getTask().getGoqrpls().getGNavigationFrame().executeMenu(toStr("OPTIONS.SUB_MENU_13"));
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GDefaultPmContextController.itmGDefaultPmSubMenu13_Click is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER SUB_MENU_14.PLSQL_CMD BEGIN
	 * G$_NAVIGATION_FRAME.EXECUTE_MENU('OPTIONS.SUB_MENU_14'); END;
	 */
	// / <summary>
	// / </summary>
	// / <remarks>
	// / ID:
	// /
	// /</remarks>
	// / <TriggerInfo>SUB_MENU_14.PLSQL_CMD</TriggerInfo>

	@MenuTrigger(item = "SUB_MENU_14")
	public void itmGDefaultPmSubMenu14_Click() {
		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// getTask().getGoqrpls().getGNavigationFrame().executeMenu(toStr("OPTIONS.SUB_MENU_14"));
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GDefaultPmContextController.itmGDefaultPmSubMenu14_Click is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER SUB_MENU_15.PLSQL_CMD BEGIN
	 * G$_NAVIGATION_FRAME.EXECUTE_MENU('OPTIONS.SUB_MENU_15'); END;
	 */
	// / <summary>
	// / </summary>
	// / <remarks>
	// / ID:
	// /
	// /</remarks>
	// / <TriggerInfo>SUB_MENU_15.PLSQL_CMD</TriggerInfo>

	@MenuTrigger(item = "SUB_MENU_15")
	public void itmGDefaultPmSubMenu15_Click() {
		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// getTask().getGoqrpls().getGNavigationFrame().executeMenu(toStr("OPTIONS.SUB_MENU_15"));
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GDefaultPmContextController.itmGDefaultPmSubMenu15_Click is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER SUB_MENU_16.PLSQL_CMD BEGIN
	 * G$_NAVIGATION_FRAME.EXECUTE_MENU('OPTIONS.SUB_MENU_16'); END;
	 */
	// / <summary>
	// / </summary>
	// / <remarks>
	// / ID:
	// /
	// /</remarks>
	// / <TriggerInfo>SUB_MENU_16.PLSQL_CMD</TriggerInfo>

	@MenuTrigger(item = "SUB_MENU_16")
	public void itmGDefaultPmSubMenu16_Click() {
		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// getTask().getGoqrpls().getGNavigationFrame().executeMenu(toStr("OPTIONS.SUB_MENU_16"));
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GDefaultPmContextController.itmGDefaultPmSubMenu16_Click is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER SUB_MENU_17.PLSQL_CMD BEGIN
	 * G$_NAVIGATION_FRAME.EXECUTE_MENU('OPTIONS.SUB_MENU_17'); END;
	 */
	// / <summary>
	// / </summary>
	// / <remarks>
	// / ID:
	// /
	// /</remarks>
	// / <TriggerInfo>SUB_MENU_17.PLSQL_CMD</TriggerInfo>

	@MenuTrigger(item = "SUB_MENU_17")
	public void itmGDefaultPmSubMenu17_Click() {
		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// getTask().getGoqrpls().getGNavigationFrame().executeMenu(toStr("OPTIONS.SUB_MENU_17"));
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GDefaultPmContextController.itmGDefaultPmSubMenu17_Click is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER SUB_MENU_18.PLSQL_CMD BEGIN
	 * G$_NAVIGATION_FRAME.EXECUTE_MENU('OPTIONS.SUB_MENU_18'); END;
	 */
	// / <summary>
	// / </summary>
	// / <remarks>
	// / ID:
	// /
	// /</remarks>
	// / <TriggerInfo>SUB_MENU_18.PLSQL_CMD</TriggerInfo>

	@MenuTrigger(item = "SUB_MENU_18")
	public void itmGDefaultPmSubMenu18_Click() {
		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// getTask().getGoqrpls().getGNavigationFrame().executeMenu(toStr("OPTIONS.SUB_MENU_18"));
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GDefaultPmContextController.itmGDefaultPmSubMenu18_Click is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER SUB_MENU_19.PLSQL_CMD BEGIN
	 * G$_NAVIGATION_FRAME.EXECUTE_MENU('OPTIONS.SUB_MENU_19'); END;
	 */
	// / <summary>
	// / </summary>
	// / <remarks>
	// / ID:
	// /
	// /</remarks>
	// / <TriggerInfo>SUB_MENU_19.PLSQL_CMD</TriggerInfo>

	@MenuTrigger(item = "SUB_MENU_19")
	public void itmGDefaultPmSubMenu19_Click() {
		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// getTask().getGoqrpls().getGNavigationFrame().executeMenu(toStr("OPTIONS.SUB_MENU_19"));
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GDefaultPmContextController.itmGDefaultPmSubMenu19_Click is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER SUB_MENU_20.PLSQL_CMD BEGIN
	 * G$_NAVIGATION_FRAME.EXECUTE_MENU('OPTIONS.SUB_MENU_20'); END;
	 */
	// / <summary>
	// / </summary>
	// / <remarks>
	// / ID:
	// /
	// /</remarks>
	// / <TriggerInfo>SUB_MENU_20.PLSQL_CMD</TriggerInfo>

	@MenuTrigger(item = "SUB_MENU_20")
	public void itmGDefaultPmSubMenu20_Click() {
		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// getTask().getGoqrpls().getGNavigationFrame().executeMenu(toStr("OPTIONS.SUB_MENU_20"));
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GDefaultPmContextController.itmGDefaultPmSubMenu20_Click is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER SUB_MENU_21.PLSQL_CMD BEGIN
	 * G$_NAVIGATION_FRAME.EXECUTE_MENU('OPTIONS.SUB_MENU_21'); END;
	 */
	// / <summary>
	// / </summary>
	// / <remarks>
	// / ID:
	// /
	// /</remarks>
	// / <TriggerInfo>SUB_MENU_21.PLSQL_CMD</TriggerInfo>

	@MenuTrigger(item = "SUB_MENU_21")
	public void itmGDefaultPmSubMenu21_Click() {
		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// getTask().getGoqrpls().getGNavigationFrame().executeMenu(toStr("OPTIONS.SUB_MENU_21"));
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GDefaultPmContextController.itmGDefaultPmSubMenu21_Click is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER SUB_MENU_22.PLSQL_CMD BEGIN
	 * G$_NAVIGATION_FRAME.EXECUTE_MENU('OPTIONS.SUB_MENU_22'); END;
	 */
	// / <summary>
	// / </summary>
	// / <remarks>
	// / ID:
	// /
	// /</remarks>
	// / <TriggerInfo>SUB_MENU_22.PLSQL_CMD</TriggerInfo>

	@MenuTrigger(item = "SUB_MENU_22")
	public void itmGDefaultPmSubMenu22_Click() {
		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// getTask().getGoqrpls().getGNavigationFrame().executeMenu(toStr("OPTIONS.SUB_MENU_22"));
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GDefaultPmContextController.itmGDefaultPmSubMenu22_Click is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER SUB_MENU_23.PLSQL_CMD BEGIN
	 * G$_NAVIGATION_FRAME.EXECUTE_MENU('OPTIONS.SUB_MENU_23'); END;
	 */
	// / <summary>
	// / </summary>
	// / <remarks>
	// / ID:
	// /
	// /</remarks>
	// / <TriggerInfo>SUB_MENU_23.PLSQL_CMD</TriggerInfo>

	@MenuTrigger(item = "SUB_MENU_23")
	public void itmGDefaultPmSubMenu23_Click() {
		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// getTask().getGoqrpls().getGNavigationFrame().executeMenu(toStr("OPTIONS.SUB_MENU_23"));
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GDefaultPmContextController.itmGDefaultPmSubMenu23_Click is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER SUB_MENU_24.PLSQL_CMD BEGIN
	 * G$_NAVIGATION_FRAME.EXECUTE_MENU('OPTIONS.SUB_MENU_24'); END;
	 */
	// / <summary>
	// / </summary>
	// / <remarks>
	// / ID:
	// /
	// /</remarks>
	// / <TriggerInfo>SUB_MENU_24.PLSQL_CMD</TriggerInfo>

	@MenuTrigger(item = "SUB_MENU_24")
	public void itmGDefaultPmSubMenu24_Click() {
		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// getTask().getGoqrpls().getGNavigationFrame().executeMenu(toStr("OPTIONS.SUB_MENU_24"));
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GDefaultPmContextController.itmGDefaultPmSubMenu24_Click is not completely migrated yet. Please read the Migration Guide.");
		

	}

}
