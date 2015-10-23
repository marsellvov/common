package net.hedtech.banner.general.common.Guagmnu.model;

import morphis.foundations.core.appsupportlib.model.SimpleBusinessObject;
import morphis.foundations.core.appsupportlib.model.configuration.SimpleBusinessObjectConfiguration;
import morphis.foundations.core.types.*;
import static morphis.foundations.core.types.Types.*;


public class KeyBlock extends SimpleBusinessObject
{
	public KeyBlock() {
		super();
	}

	public KeyBlock(SimpleBusinessObjectConfiguration configuration, String name) {
		super(configuration, name);
	}
	

	



	public NString getNextSelection() {
		return toStr(super.getValue("NEXT_SELECTION"));
	}
	
	public void setNextSelection(NString value) {
		super.setValue("NEXT_SELECTION", value);
	}
	


	public NString getSelectionList() {
		return toStr(super.getValue("SELECTION_LIST"));
	}
	
	public void setSelectionList(NString value) {
		super.setValue("SELECTION_LIST", value);
	}
	


	public NString getCallfld() {
		return toStr(super.getValue("CALLFLD"));
	}
	
	public void setCallfld(NString value) {
		super.setValue("CALLFLD", value);
	}
	


	public NString getFormLeadingEdge() {
		return toStr(super.getValue("FORM_LEADING_EDGE"));
	}
	
	public void setFormLeadingEdge(NString value) {
		super.setValue("FORM_LEADING_EDGE", value);
	}
	


	public NString getFormTypeInd() {
		return toStr(super.getValue("FORM_TYPE_IND"));
	}
	
	public void setFormTypeInd(NString value) {
		super.setValue("FORM_TYPE_IND", value);
	}
	


	public NString getFormInitInd() {
		return toStr(super.getValue("FORM_INIT_IND"));
	}
	
	public void setFormInitInd(NString value) {
		super.setValue("FORM_INIT_IND", value);
	}
	


	public NInteger getLastMenuItem() {
		return toInt(super.getValue("LAST_MENU_ITEM"));
	}
	
	public void setLastMenuItem(NInteger value) {
		super.setValue("LAST_MENU_ITEM", value);
	}
	



}




