package net.hedtech.banner.general.common.Goqrlib.model;

import morphis.foundations.core.appsupportlib.model.SimpleBusinessObject;
import morphis.foundations.core.appsupportlib.model.configuration.SimpleBusinessObjectConfiguration;
import morphis.foundations.core.types.*;
import static morphis.foundations.core.types.Types.*;


public class GBannerReportBlock extends SimpleBusinessObject
{
	public GBannerReportBlock() {
		super();
	}

	public GBannerReportBlock(SimpleBusinessObjectConfiguration configuration, String name) {
		super(configuration, name);
	}
	

	



	public NString getOrepDesformat() {
		return toStr(super.getValue("OREP_DESFORMAT"));
	}
	
	public void setOrepDesformat(NString value) {
		super.setValue("OREP_DESFORMAT", value);
	}
	


	public NString getOrepDestype() {
		return toStr(super.getValue("OREP_DESTYPE"));
	}
	
	public void setOrepDestype(NString value) {
		super.setValue("OREP_DESTYPE", value);
	}
	


	public NString getOrepDesname() {
		return toStr(super.getValue("OREP_DESNAME"));
	}
	
	public void setOrepDesname(NString value) {
		super.setValue("OREP_DESNAME", value);
	}
	


	public NString getOrepExecutionMode() {
		return toStr(super.getValue("OREP_EXECUTION_MODE"));
	}
	
	public void setOrepExecutionMode(NString value) {
		super.setValue("OREP_EXECUTION_MODE", value);
	}
	


	public NString getOrepCommMode() {
		return toStr(super.getValue("OREP_COMM_MODE"));
	}
	
	public void setOrepCommMode(NString value) {
		super.setValue("OREP_COMM_MODE", value);
	}
	


	public NString getOrepParamformDesignation() {
		return toStr(super.getValue("OREP_PARAMFORM_DESIGNATION"));
	}
	
	public void setOrepParamformDesignation(NString value) {
		super.setValue("OREP_PARAMFORM_DESIGNATION", value);
	}
	



}




