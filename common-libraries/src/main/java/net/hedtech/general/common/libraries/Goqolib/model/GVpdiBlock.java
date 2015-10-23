package net.hedtech.general.common.libraries.Goqolib.model;

import morphis.foundations.flavors.forms.appsupportlib.model.SimpleBusinessObject;
import morphis.foundations.core.appsupportlib.model.configuration.SimpleBusinessObjectConfiguration;
import morphis.foundations.core.types.*;
import static morphis.foundations.core.types.Types.*;


public class GVpdiBlock extends SimpleBusinessObject
{
	public GVpdiBlock() {
		super();
	}

	public GVpdiBlock(SimpleBusinessObjectConfiguration configuration, String name) {
		super(configuration, name);
	}
	

	



	public NString getVpdiCode() {
		return toStr(super.getValue("VPDI_CODE"));
	}
	
	public void setVpdiCode(NString value) {
		super.setValue("VPDI_CODE", value);
	}
	


	public NString getVpdiDesc() {
		return toStr(super.getValue("VPDI_DESC"));
	}
	
	public void setVpdiDesc(NString value) {
		super.setValue("VPDI_DESC", value);
	}
	


	public NString getVpdiHoldValue() {
		return toStr(super.getValue("VPDI_HOLD_VALUE"));
	}
	
	public void setVpdiHoldValue(NString value) {
		super.setValue("VPDI_HOLD_VALUE", value);
	}
	


	public NString getVpdiSelectItem() {
		return toStr(super.getValue("VPDI_SELECT_ITEM"));
	}
	
	public void setVpdiSelectItem(NString value) {
		super.setValue("VPDI_SELECT_ITEM", value);
	}
	



}




