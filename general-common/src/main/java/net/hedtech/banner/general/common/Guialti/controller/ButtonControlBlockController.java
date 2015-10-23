package net.hedtech.banner.general.common.Guialti.controller;
 
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
import net.hedtech.banner.general.common.Guialti.model.*;
import net.hedtech.banner.general.common.Guialti.*;
import net.hedtech.banner.general.common.Guialti.services.*;

		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class ButtonControlBlockController extends DefaultBlockController {


	
	public ButtonControlBlockController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
		
	@Override
	public GuialtiTask getTask() {
		return (GuialtiTask)super.getTask();
	}

	public GuialtiModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
		/* Original PL/SQL code code for TRIGGER CASE_INSENSITIVE_RG.WHEN-RADIO-CHANGED
		 --
 IF :CASE_INSENSITIVE_RG = 'T' THEN
    SET_ITEM_PROPERTY('GUVALTI_LAST_NAME',CASE_INSENSITIVE_QUERY,PROPERTY_TRUE);
    SET_ITEM_PROPERTY('GUVALTI_FIRST_NAME',CASE_INSENSITIVE_QUERY,PROPERTY_TRUE);
    SET_ITEM_PROPERTY('GUVALTI_MI',CASE_INSENSITIVE_QUERY,PROPERTY_TRUE);
  ELSE
    SET_ITEM_PROPERTY('GUVALTI_LAST_NAME',CASE_INSENSITIVE_QUERY,PROPERTY_FALSE);
    SET_ITEM_PROPERTY('GUVALTI_FIRST_NAME',CASE_INSENSITIVE_QUERY,PROPERTY_FALSE);
    SET_ITEM_PROPERTY('GUVALTI_MI',CASE_INSENSITIVE_QUERY,PROPERTY_FALSE);
END IF;
--
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * CASE_INSENSITIVE_RG.WHEN-RADIO-CHANGED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-RADIO-CHANGED", item="CASE_INSENSITIVE_RG")
		public void caseInsensitiveRg_radioGroupChange()
		{
				if ( getFormModel().getButtonControlBlock().getCaseInsensitiveRg().equals("T") )
				{
					ItemServices.setItemCaseInsensitiveQuery("GUVALTI_LAST_NAME", true);
					ItemServices.setItemCaseInsensitiveQuery("GUVALTI_FIRST_NAME", true);
					ItemServices.setItemCaseInsensitiveQuery("GUVALTI_MI", true);
				}
				else {
					ItemServices.setItemCaseInsensitiveQuery("GUVALTI_LAST_NAME", false);
					ItemServices.setItemCaseInsensitiveQuery("GUVALTI_FIRST_NAME", false);
					ItemServices.setItemCaseInsensitiveQuery("GUVALTI_MI", false);
				}
				if(getCursorBlock().notEquals("KEY_BLOCK")){
					goBlock("GUVALTI");
				}
			}

		
	
	
}

