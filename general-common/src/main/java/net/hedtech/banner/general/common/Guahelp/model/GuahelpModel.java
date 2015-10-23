package net.hedtech.banner.general.common.Guahelp.model;

import java.util.Hashtable;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appsupportlib.runtime.*;
import net.hedtech.general.common.libraries.Goqolib.model.GSdkey;








public class GuahelpModel extends FormModel {
	
	
	public GuahelpModel(ITask task, Hashtable parameters){
		super(task, parameters);
    }
    
		

	public GSdkey getGSdkey() 
	{
		return (GSdkey) getBusinessObject("G$_SDKEY");
	}

	public IDBBusinessObject getGSdisp() 
	{
		return (IDBBusinessObject) getBusinessObject("G$_SDISP");
	}

	public DisplayHelp getDisplayHelp() 
	{
		return (DisplayHelp) getBusinessObject("DISPLAY_HELP");
	}

	public ShowHelp getShowHelp() 
	{
		return (ShowHelp) getBusinessObject("SHOW_HELP");
	}

	public ButtonControlBlock getButtonControlBlock() 
	{
		return (ButtonControlBlock) getBusinessObject("BUTTON_CONTROL_BLOCK");
	}


}

		

