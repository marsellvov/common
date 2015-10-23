package net.hedtech.banner.general.common.Goaemal.model;

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
	

	



	public NString getLastName() {
		return toStr(super.getValue("LAST_NAME"));
	}
	
	public void setLastName(NString value) {
		super.setValue("LAST_NAME", value);
	}
	


	public NString getFirstName() {
		return toStr(super.getValue("FIRST_NAME"));
	}
	
	public void setFirstName(NString value) {
		super.setValue("FIRST_NAME", value);
	}
	


	public NNumber getPidm() {
		return toNumber(super.getValue("PIDM"));
	}
	
	public void setPidm(NNumber value) {
		super.setValue("PIDM", value);
	}
	


	public NString getConfInfo() {
		return toStr(super.getValue("CONF_INFO"));
	}
	
	public void setConfInfo(NString value) {
		super.setValue("CONF_INFO", value);
	}
	


	public NString getDeceasedInfo() {
		return toStr(super.getValue("DECEASED_INFO"));
	}
	
	public void setDeceasedInfo(NString value) {
		super.setValue("DECEASED_INFO", value);
	}
	


	public NString getId() {
		return toStr(super.getValue("ID"));
	}
	
	public void setId(NString value) {
		super.setValue("ID", value);
	}
	


	public NString getKeyblockName() {
		return toStr(super.getValue("KEYBLOCK_NAME"));
	}
	
	public void setKeyblockName(NString value) {
		super.setValue("KEYBLOCK_NAME", value);
	}
	
	public NString getBdcaCode() {
		return toStr(super.getValue("BDCA_CODE"));
	}
	
	public void setBdcaCode(NString value) {
		super.setValue("BDCA_CODE", value);
	}


}




