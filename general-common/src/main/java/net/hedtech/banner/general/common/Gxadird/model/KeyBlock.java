package net.hedtech.banner.general.common.Gxadird.model;

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
	

	



	public NNumber getPidm() {
		return toNumber(super.getValue("PIDM"));
	}
	
	public void setPidm(NNumber value) {
		super.setValue("PIDM", value);
	}
	


	public NString getId() {
		return toStr(super.getValue("ID"));
	}
	
	public void setId(NString value) {
		super.setValue("ID", value);
	}
	


	public NString getNname() {
		return toStr(super.getValue("NAME"));
	}
	
	public void setNname(NString value) {
		super.setValue("NAME", value);
	}
	


	public NNumber getTotalAmount() {
		return toNumber(super.getValue("TOTAL_AMOUNT"));
	}
	
	public void setTotalAmount(NNumber value) {
		super.setValue("TOTAL_AMOUNT", value);
	}
	


	public NNumber getTotalPercent() {
		return toNumber(super.getValue("TOTAL_PERCENT"));
	}
	
	public void setTotalPercent(NNumber value) {
		super.setValue("TOTAL_PERCENT", value);
	}
	


	public NNumber getQuerySwitch() {
		return toNumber(super.getValue("QUERY_SWITCH"));
	}
	
	public void setQuerySwitch(NNumber value) {
		super.setValue("QUERY_SWITCH", value);
	}
	


	public NString getDeleteModeFlag() {
		return toStr(super.getValue("DELETE_MODE_FLAG"));
	}
	
	public void setDeleteModeFlag(NString value) {
		super.setValue("DELETE_MODE_FLAG", value);
	}
	



}




