package net.hedtech.banner.general.common.Guagmnu.model;

import java.util.Hashtable;

import net.hedtech.banner.general.common.Guagmnu.controller.ButtonControlBlockController;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appsupportlib.runtime.*;




public class GuagmnuModel extends FormModel {
	
	
	public GuagmnuModel(ITask task, Hashtable parameters){
		super(task, parameters);
    }
    
		

	public FormHeader getFormHeader() 
	{
		return (FormHeader) getBusinessObject("FORM_HEADER");
	}

	public KeyBlock getKeyBlock() 
	{
		return (KeyBlock) getBusinessObject("KEY_BLOCK");
	}

//	public Tree getTree() 
//	{
//		return (Tree) getBusinessObject("TREE");
//	}

	public IDBBusinessObject getMessages() 
	{
		return (IDBBusinessObject) getBusinessObject("MESSAGES");
	}

	public MyLinks getMyLinks() 
	{
		return (MyLinks) getBusinessObject("MY_LINKS");
	}

	public SiteMap1 getSiteMap1() 
	{
		return (SiteMap1) getBusinessObject("SITE_MAP1");
	}

	public SiteMap2 getSiteMap2() 
	{
		return (SiteMap2) getBusinessObject("SITE_MAP2");
	}

	public SiteMap3 getSiteMap3() 
	{
		return (SiteMap3) getBusinessObject("SITE_MAP3");
	}

	public SiteMap4 getSiteMap4() 
	{
		return (SiteMap4) getBusinessObject("SITE_MAP4");
	}

	public ButtonControlBlockController getButtonControlBlock() 
	{
		return (ButtonControlBlockController) getBusinessObject("BUTTON_CONTROL_BLOCK");
	}


}

		

