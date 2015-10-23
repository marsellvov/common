package net.hedtech.banner.general.common.Goaintl.model;

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
	

	



	public NString getPidm() {
		return toStr(super.getValue("PIDM"));
	}
	
	public void setPidm(NString value) {
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
	



}




