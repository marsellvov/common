package net.hedtech.banner.finance.common.Foaiden.model;

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
	

	



	public NString getId() {
		return toStr(super.getValue("ID"));
	}
	
	public void setId(NString value) {
		super.setValue("ID", value);
	}
	


	public NString getFullName() {
		return toStr(super.getValue("FULL_NAME"));
	}
	
	public void setFullName(NString value) {
		super.setValue("FULL_NAME", value);
	}
	


	public NNumber getPidm() {
		return toNumber(super.getValue("PIDM"));
	}
	
	public void setPidm(NNumber value) {
		super.setValue("PIDM", value);
	}
	


	public NString getEntityInd() {
		return toStr(super.getValue("ENTITY_IND"));
	}
	
	public void setEntityInd(NString value) {
		super.setValue("ENTITY_IND", value);
	}
	


	public NString getConfidInd() {
		return toStr(super.getValue("CONFID_IND"));
	}
	
	public void setConfidInd(NString value) {
		super.setValue("CONFID_IND", value);
	}
	


	public NString getDcsdInd() {
		return toStr(super.getValue("DCSD_IND"));
	}
	
	public void setDcsdInd(NString value) {
		super.setValue("DCSD_IND", value);
	}
	



}




