package net.hedtech.general.common.libraries.Aoqclib.model;

import morphis.foundations.flavors.forms.appsupportlib.model.SimpleBusinessObject;
import morphis.foundations.core.appsupportlib.model.configuration.SimpleBusinessObjectConfiguration;
import morphis.foundations.core.types.*;
import static morphis.foundations.core.types.Types.*;


public class FormHeader extends SimpleBusinessObject
{
	public FormHeader() {
		super();
	}

	public FormHeader(SimpleBusinessObjectConfiguration configuration, String name) {
		super(configuration, name);
	}
	

	



	public NInteger getAttnCount() {
		return toInt(super.getValue("ATTN_COUNT"));
	}
	
	public void setAttnCount(NInteger value) {
		super.setValue("ATTN_COUNT", value);
	}
	


	public NString getDummyItem() {
		return toStr(super.getValue("DUMMY_ITEM"));
	}
	
	public void setDummyItem(NString value) {
		super.setValue("DUMMY_ITEM", value);
	}
	


	public NString getCurrentRelease() {
		return toStr(super.getValue("CURRENT_RELEASE"));
	}
	
	public void setCurrentRelease(NString value) {
		super.setValue("CURRENT_RELEASE", value);
	}
	


	public NString getCalledFromItem() {
		return toStr(super.getValue("CALLED_FROM_ITEM"));
	}
	
	public void setCalledFromItem(NString value) {
		super.setValue("CALLED_FROM_ITEM", value);
	}
	


	public NString getHoldKeyIdnoForAlerts() {
		return toStr(super.getValue("HOLD_KEY_IDNO_FOR_ALERTS"));
	}
	
	public void setHoldKeyIdnoForAlerts(NString value) {
		super.setValue("HOLD_KEY_IDNO_FOR_ALERTS", value);
	}
	


	public NString getAdtlNextBlockOk() {
		return toStr(super.getValue("ADTL_NEXT_BLOCK_OK"));
	}
	
	public void setAdtlNextBlockOk(NString value) {
		super.setValue("ADTL_NEXT_BLOCK_OK", value);
	}
	


	public NString getPgbeNextBlockOk() {
		return toStr(super.getValue("PGBE_NEXT_BLOCK_OK"));
	}
	
	public void setPgbeNextBlockOk(NString value) {
		super.setValue("PGBE_NEXT_BLOCK_OK", value);
	}
	



}




