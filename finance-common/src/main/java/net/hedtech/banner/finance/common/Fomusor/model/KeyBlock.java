package net.hedtech.banner.finance.common.Fomusor.model;

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
	

	



	public NString getUserId() {
		return toStr(super.getValue("USER_ID"));
	}
	
	public void setUserId(NString value) {
		super.setValue("USER_ID", value);
	}
	


	public NString getCopyUserId() {
		return toStr(super.getValue("COPY_USER_ID"));
	}
	
	public void setCopyUserId(NString value) {
		super.setValue("COPY_USER_ID", value);
	}
	


	public NString getIncludeCoasCode() {
		return toStr(super.getValue("INCLUDE_COAS_CODE"));
	}
	
	public void setIncludeCoasCode(NString value) {
		super.setValue("INCLUDE_COAS_CODE", value);
	}
	


	public NString getIncludeOrgnCode() {
		return toStr(super.getValue("INCLUDE_ORGN_CODE"));
	}
	
	public void setIncludeOrgnCode(NString value) {
		super.setValue("INCLUDE_ORGN_CODE", value);
	}
	


	public NString getExcludeCoasCode() {
		return toStr(super.getValue("EXCLUDE_COAS_CODE"));
	}
	
	public void setExcludeCoasCode(NString value) {
		super.setValue("EXCLUDE_COAS_CODE", value);
	}
	


	public NString getExcludeOrgnCode() {
		return toStr(super.getValue("EXCLUDE_ORGN_CODE"));
	}
	
	public void setExcludeOrgnCode(NString value) {
		super.setValue("EXCLUDE_ORGN_CODE", value);
	}
	


	public NString getCheckKeys() {
		return toStr(super.getValue("CHECK_KEYS"));
	}
	
	public void setCheckKeys(NString value) {
		super.setValue("CHECK_KEYS", value);
	}
	



}




