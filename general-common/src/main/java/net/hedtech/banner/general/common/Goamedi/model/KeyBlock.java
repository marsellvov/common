package net.hedtech.banner.general.common.Goamedi.model;

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
	


	public NString getConfidInfo() {
		return toStr(super.getValue("CONFID_INFO"));
	}
	
	public void setConfidInfo(NString value) {
		super.setValue("CONFID_INFO", value);
	}
	


	public NString getDeceasedInd() {
		return toStr(super.getValue("DECEASED_IND"));
	}
	
	public void setDeceasedInd(NString value) {
		super.setValue("DECEASED_IND", value);
	}
	



}




