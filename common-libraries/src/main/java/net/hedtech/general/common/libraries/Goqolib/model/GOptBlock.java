package net.hedtech.general.common.libraries.Goqolib.model;

import morphis.foundations.flavors.forms.appsupportlib.model.SimpleBusinessObject;
import morphis.foundations.core.appsupportlib.model.configuration.SimpleBusinessObjectConfiguration;
import morphis.foundations.core.types.*;
import static morphis.foundations.core.types.Types.*;


public class GOptBlock extends SimpleBusinessObject
{
	public GOptBlock() {
		super();
	}

	public GOptBlock(SimpleBusinessObjectConfiguration configuration, String name) {
		super(configuration, name);
	}
	

	



	public NString getOptSel() {
		return toStr(super.getValue("OPT_SEL"));
	}
	
	public void setOptSel(NString value) {
		super.setValue("OPT_SEL", value);
	}
	


	public NString getSelectAKey() {
		return toStr(super.getValue("SELECT_A_KEY"));
	}
	
	public void setSelectAKey(NString value) {
		super.setValue("SELECT_A_KEY", value);
	}
	


	public NString getSelectBKey() {
		return toStr(super.getValue("SELECT_B_KEY"));
	}
	
	public void setSelectBKey(NString value) {
		super.setValue("SELECT_B_KEY", value);
	}
	


	public NString getSelectCKey() {
		return toStr(super.getValue("SELECT_C_KEY"));
	}
	
	public void setSelectCKey(NString value) {
		super.setValue("SELECT_C_KEY", value);
	}
	


	public NString getSelectDKey() {
		return toStr(super.getValue("SELECT_D_KEY"));
	}
	
	public void setSelectDKey(NString value) {
		super.setValue("SELECT_D_KEY", value);
	}
	


	public NString getSelectEKey() {
		return toStr(super.getValue("SELECT_E_KEY"));
	}
	
	public void setSelectEKey(NString value) {
		super.setValue("SELECT_E_KEY", value);
	}
	


	public NString getSelectFKey() {
		return toStr(super.getValue("SELECT_F_KEY"));
	}
	
	public void setSelectFKey(NString value) {
		super.setValue("SELECT_F_KEY", value);
	}
	


	public NString getSelectItem() {
		return toStr(super.getValue("SELECT_ITEM"));
	}
	
	public void setSelectItem(NString value) {
		super.setValue("SELECT_ITEM", value);
	}
	



}




