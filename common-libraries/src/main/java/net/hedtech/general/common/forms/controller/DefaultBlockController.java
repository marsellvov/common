package net.hedtech.general.common.forms.controller;


import static morphis.foundations.core.appsupportlib.runtime.ItemServices.validateCurrentItem;

import java.util.ArrayList;
import java.util.List;

import net.hedtech.general.common.forms.interactionStrategies.BannerInteractionStrategy;
import morphis.foundations.core.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.DataCommand;
import morphis.foundations.core.appdatalayer.data.DataLayerException;
import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.appdatalayer.data.ResultSet;
import morphis.foundations.core.appdatalayer.data.provider.InvalidNumberOfRowsAfectedException;
import morphis.foundations.core.appsupportlib.model.IBusinessObject;
import morphis.foundations.core.appsupportlib.runtime.BlockServices;
import morphis.foundations.core.appsupportlib.runtime.TaskServices;
import morphis.foundations.core.appsupportlib.runtime.action.ActionTrigger;
import morphis.foundations.core.appsupportlib.runtime.action.DefaultValue;
import morphis.foundations.core.appsupportlib.runtime.control.AbstractBlockController;
import morphis.foundations.core.appsupportlib.runtime.control.IFormController;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.items.ItemDescriptor;
import morphis.foundations.core.appsupportlib.ui.IInteractionRulesStrategy;
import morphis.foundations.core.appsupportlib.util.io.export.Export;
import morphis.foundations.core.types.NDate;
import morphis.foundations.core.types.NString;
import static morphis.foundations.core.appsupportlib.Globals.*;
import static morphis.foundations.core.appsupportlib.Lib.*;


public class DefaultBlockController extends AbstractBlockController {

	public DefaultBlockController(IFormController parentController, String name) {
		super(parentController, name);		
	}

	//Common libraries access
    public net.hedtech.general.common.libraries.Goqrpls.GoqrplsServices getGoqrpls()
    {
		return (net.hedtech.general.common.libraries.Goqrpls.GoqrplsServices)getTask().getSupportCodeManager().getLibrary("GOQRPLS");
    }
    
	@Override
	public void setInteractionRulesStrategy(IInteractionRulesStrategy strategy) {
		super.setInteractionRulesStrategy(strategy);
		new BannerInteractionStrategy(this);
	}
	
	
	
	public void keyNexItem()
	{
		//MORPHIS-TODO JV
		validateCurrentItem(false);
	}
	
	
	
	//JM added override to export trigger in order to support multiple format exports
	@Override
	@ActionTrigger(action="EXPORT")
	public void export(@DefaultValue("FILE") String export)
	{
		String vExport = getGuruprfValue("DATA_EXTRACT", "MIME_TYPE"); // getTask().getGoqrpls().gGetUprfDeMimeType()
		if (vExport.isEmpty()) {
			vExport = export;
		}		
		switch (vExport) {
		case "TEXT":
			vExport = Export.Text.toString();
			break;
		case "WEBUTIL":
			vExport = Export.CSV.toString();
			break;
		default:
			vExport = Export.Excel.toString();
			break;
		}

		boolean vHeaders = false;
		String headers = getGuruprfValue("DATA_EXTRACT", "PROMPTS"); // getTask().getGoqrpls().gGetUprfDePrompts()
		if (headers.equals("Y")) {
			vHeaders = true;
		}
 		
		List<IBusinessObject> blocks = new ArrayList<IBusinessObject>();
		DefaultFormController form = (DefaultFormController)super.getTask().getFormController();
		if (form.getHasKeyBlockLogic())
		{
			IBusinessObject keyBlock = BlockServices.getBlockController(form.getKeyBlockName()).getModel();
			if (keyBlock != super.getModel()) {
				blocks.add(keyBlock);
			}
		}
		blocks.add(super.getModel());
		BlockServices.export(blocks, Export.valueOf(vExport), null, false, vHeaders);
	}

	// shortcut to get a value from GURUPRF (User Preferences)
	private String getGuruprfValue(String guruprfGroup, String guruprfString)
	{
		String value = getGuruprfValue(guruprfGroup, guruprfString, getGlobal("CURRENT_USER").getValue());
		if (value.isEmpty()) {
			value = getGuruprfValue(guruprfGroup, guruprfString, "BASELINE");
		}
		return value;
	}

	private String getGuruprfValue(String guruprfGroup, String guruprfString, String currentUser)
	{
		String value = "";
		String sql = "SELECT GURUPRF_VALUE FROM GURUPRF WHERE GURUPRF_USER_ID = :CURRENT_USER AND GURUPRF_GROUP = :GURUPRF_GROUP AND GURUPRF_STRING = :GURUPRF_STRING";
		DataCommand command1 = new DataCommand(sql);
		//Setting query parameters
		command1.addParameter("CURRENT_USER", currentUser);
		command1.addParameter("GURUPRF_GROUP", guruprfGroup);
		command1.addParameter("GURUPRF_STRING", guruprfString);
		ResultSet results1 = command1.executeQuery();
		if ( results1.hasData() ) {
			value = results1.getStr(0).getValue();
		}
		results1.close();
		return value;
	}

	@ActionTrigger(action="EDIT_TEXTITEM")
	public void editTextItemAction()
	{
		TaskServices.editTextitem();
	}
	
	

}
