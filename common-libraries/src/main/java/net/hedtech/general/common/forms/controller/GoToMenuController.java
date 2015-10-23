package net.hedtech.general.common.forms.controller;

import static morphis.foundations.core.appsupportlib.Lib.copy;
import static morphis.foundations.core.appsupportlib.Lib.in;
import static morphis.foundations.core.appsupportlib.Lib.inStr;
import static morphis.foundations.core.appsupportlib.Lib.isNull;
import static morphis.foundations.core.appsupportlib.runtime.ItemServices.getItemEnabled;
import static morphis.foundations.core.appsupportlib.runtime.ItemServices.goItem;
import static morphis.foundations.core.appsupportlib.runtime.MessageServices.*;
import static morphis.foundations.core.appsupportlib.runtime.TaskServices.executeAction;
import static morphis.foundations.core.appsupportlib.runtime.TaskServices.getNameIn;
import static morphis.foundations.core.appsupportlib.runtime.TaskServices.getParameterList;
import static morphis.foundations.core.appsupportlib.runtime.TaskServices.getUser;
import static morphis.foundations.core.appsupportlib.runtime.TaskServices.goBlock;
import static morphis.foundations.core.appsupportlib.runtime.TaskServices.showWindow;
import static morphis.foundations.core.appsupportlib.runtime.ValueSetServices.getGroupCharCell;
import static morphis.foundations.core.types.Types.toStr;

import java.util.Hashtable;

import morphis.foundations.core.appsupportlib.Globals;
import morphis.foundations.core.appsupportlib.configuration.AppSupportLibSettings;
import morphis.foundations.core.appsupportlib.exceptions.ApplicationException;
import morphis.foundations.core.appsupportlib.runtime.BlockServices;
import morphis.foundations.core.appsupportlib.runtime.ITask;
import morphis.foundations.core.appsupportlib.runtime.ItemServices;
import morphis.foundations.core.appsupportlib.runtime.Task;
import morphis.foundations.core.appsupportlib.runtime.TaskServices;
import morphis.foundations.core.appsupportlib.runtime.action.MenuTrigger;
import morphis.foundations.core.appsupportlib.runtime.control.AbstractMenuController;
import morphis.foundations.core.appsupportlib.runtime.control.IFormController;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.BlockDescriptor;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.RuntimeContext.ContextDescriptor;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.items.ItemDescriptor;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.items.TreeDescriptor;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.items.TreeDescriptor.TreeCacheStatus;
import morphis.foundations.core.appsupportlib.runtime.menus.MenuDefinition;
import morphis.foundations.core.appsupportlib.runtime.menus.MenuEntry;
import morphis.foundations.core.appsupportlib.runtime.menus.MenuServices;
import morphis.foundations.core.appsupportlib.runtime.menus.Parameter;
import morphis.foundations.core.appsupportlib.runtime.process.ProcessServices;
import morphis.foundations.core.appsupportlib.runtime.web.message.MenuDescriptor;
import morphis.foundations.core.appsupportlib.runtime.web.message.MessageRequestHelper;
import morphis.foundations.core.appsupportlib.runtime.web.message.OutputMessage.OutputMessageUserResponse;
import morphis.foundations.core.types.NString;
import morphis.foundations.core.types.Types;
import net.hedtech.general.common.dbservices.GNls;
import net.hedtech.general.common.dbservices.GSecurity;
import net.hedtech.general.common.forms.BaseTask;
import net.hedtech.general.common.libraries.Goqrpls.GoqrplsServices;
import static morphis.foundations.core.appsupportlib.runtime.MessageServices.*;

public class GoToMenuController extends AbstractMenuController {

	public GoToMenuController(ITask task) {
		super(task);
	}
	
	public GoToMenuController(IFormController parentController, String name) {
		super(parentController, name);
		
	}
	
	@MenuTrigger
	public void mainMenuAction()
	{
		DefaultFormController defController = null;
		if (this.getTask().getFormController() instanceof DefaultFormController)
			defController = (DefaultFormController)this.getTask().getFormController();
		if (defController != null)
			defController.beforeNextBlock();
			
		try {			
			MenuDescriptor menuDescriptor = MessageRequestHelper.getMenuSelection();
			
			if(menuDescriptor != null)
			{
				MenuEntry menuEntry = null;
				
				BlockDescriptor menuBlock = BlockServices.findBlock("MENU_CONTROL");
				if(menuBlock != null)
				{
					ItemDescriptor itemDescriptor = menuBlock.findItem("GOTO_MENU");
					
					if(itemDescriptor != null)
					{
						TreeDescriptor treeDescriptor = (TreeDescriptor) itemDescriptor;
						try{
							
							menuEntry = (MenuEntry)treeDescriptor.findNode(menuDescriptor.getItem());
							
							if(menuEntry != null )  {
								String action = menuEntry.getAction();
								
								Hashtable parameterList = null; 
								if (menuEntry.getParameters().size() > 0)
								{
									parameterList = new Hashtable();
									for (Parameter param : menuEntry.getParameters()){
										parameterList.put(param.getName(), param.getValue());
									}
								}
								
								NString name1= NString.getNull();
								NString name2= NString.getNull();
								NString trgName= NString.getNull();
								NString capacity= NString.getNull();
								NString typeInd= NString.getNull();
								NString trgType= NString.getNull();
								NString lvTabSecForm= NString.getNull();
								NString lvTabSecTab= NString.getNull();
								NString formCalled= NString.getNull();
	
								name1 = toStr(parameterList.get("GUROPTM_NAME1"));
								name2 = toStr(parameterList.get("GUROPTM_NAME2"));
								typeInd = toStr(parameterList.get("GUROPTM_TYPE_IND"));
								trgName = toStr(parameterList.get("GUROPTM_TRG_NAME"));
								trgType = toStr(parameterList.get("GUROPTM_TRG_TYPE"));
								capacity = toStr(parameterList.get("GUROPTM_CAPACITY"));
								lvTabSecForm = toStr(parameterList.get("GUROPTM_TAB_SEC_FORM"));
								lvTabSecTab = toStr(parameterList.get("GUROPTM_TAB_SEC_TAB"));
								formCalled = toStr(parameterList.get("GUROPTM_FORM_TO_BE_CALLED"));
								// 
								copy(name1,"GLOBAL.GUROPTM_NAME1");
								// 
								//  -- 08/15/2000 TGKinderman Also indicate that it is a navigation frame call if the
								//  -- guroptm_type_ind is P
								// 
								if ( in(typeInd, "L", "F", "P").getValue() )
								{
									copy("Y","global.nav_frame_call");
								}
								//  -- --
								//  -- -- The following is implemented with TabSecurity.  It is for Options that call into an external form
								//  -- -- and into a specific tab in that form.   Well what if the user is not authorized to see that specific
								//  -- -- tab in that form.  This if statement will check for that.
								if ( !lvTabSecForm.isNull() )
								{
									if ( inStr(GSecurity.FgGetTabSecurityFnc(lvTabSecForm, getNameIn("GLOBAL.CURRENT_USER")), lvTabSecTab.append(":N")).greater(0) )
									{
										errorMessage(GNls.Fget(toStr("GOQRPLS-0082"), toStr("LIB"), toStr("*ERROR* User %01% is not authorized to access %02% on %03%."), getUser(), isNull(GSecurity.FgGetTabDescFnc(lvTabSecForm, lvTabSecTab), lvTabSecTab), lvTabSecForm));
										throw new ApplicationException();
									}
								}
								//  -- --
								// 
								if ( in(typeInd, "S", "I").getValue() )
								{
									errorMessage(GNls.Fget(toStr("GOQRPLS-0083"), toStr("LIB"), toStr("*ERROR* Invalid item selected")));
									throw new ApplicationException();
								}
								else if ( typeInd.equals("W") ) {
									if ( name2.isNull() )
									{
										errorMessage(GNls.Fget(toStr("GOQRPLS-0084"), toStr("LIB"), toStr("*ERROR* No item to navigate to has been provided, cannot perform navigation.")), OutputMessageUserResponse.ACKNOWLEDGE);
										return ;
									}
									if ( getItemEnabled(name2).equals("FALSE") )
									{
										errorMessage(GNls.Fget(toStr("GOQRPLS-0085"), toStr("LIB"), toStr("*ERROR* The item to navigate to is not enabled, cannot perform navigation.")), OutputMessageUserResponse.ACKNOWLEDGE);
										return ;
									}
									showWindow(name1);
									goItem(name2);

								}
								else if ( typeInd.equals("B") ) {
									if ( name2.isNull() )
									{
										goBlock(name1);
										return ;
									}
									else {
										if ( getItemEnabled(name1.append(".").append(name2)).equals("FALSE") )
										{
											goBlock(name1);
											return ;
										}
										else {
											goItem(name1.append(".").append(name2));

										}
									}
								}
								else if ( typeInd.equals("F") ) {
									try {
										copy("Y","GLOBAL.FORM_WAS_CALLED");
										executeAction("G$_REVOKE_ACCESS");
										((GoqrplsServices)this.getTask().getSupportCodeManager().getLibrary("GOQRPLS")).gCheckFailure();
										if ( capacity.equals("M") )
										{
											((GoqrplsServices)this.getTask().getSupportCodeManager().getLibrary("GOQRPLS")).gSecuredFormCall(getNameIn("GLOBAL.CURRENT_USER"), name1, toStr(""));
										}
										else {
											((GoqrplsServices)this.getTask().getSupportCodeManager().getLibrary("GOQRPLS")).gSecuredFormCall(getNameIn("GLOBAL.CURRENT_USER"), name1, toStr("QUERY"));
										}
									} finally {
										copy("","GLOBAL.FORM_WAS_CALLED");
									}
								}
								else if ( in(typeInd, "P", "L").getValue() ) {
									try{
										if (formCalled.isNotNull()) {
											Globals.setGlobal("RELATED_FORM_CALL","Y");
										}
										if ( trgType.equals("U") )
										{
											TaskServices.executeAction(trgName);
	
											((GoqrplsServices)this.getTask().getSupportCodeManager().getLibrary("GOQRPLS")).gCheckFailure();
										}
										else {
											TaskServices.executeAction(trgName);
										}
									}
									finally {
										if (formCalled.isNotNull()) {
											Globals.removeGlobal("RELATED_FORM_CALL");
										}
									}
								}
								else {
									errorMessage(GNls.Fget(toStr("GOQRPLS-0086"), toStr("LIB"), toStr("*ERROR* Invalid type indicator in guroptm for %01%"), name1));
									throw new ApplicationException();
								}
								// 
								//  -- 11/14/2000 TGKinderman set switch off if navigation frame call relative to
								//  -- guroptm_type_ind is P
								// 
								if ( in(typeInd, "L", "F", "P").getValue() )
								{
									copy("N","global.nav_frame_call");
								}
							}
							
						}catch(RuntimeException ex){
							
							throw ex;
						}
						
						catch(Exception menuEx)
						{
							
						}
					}
				}
			}
		} finally {
			if (defController != null)
				defController.afterNextBlock();
		}
		
	}

}
