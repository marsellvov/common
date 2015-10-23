package net.hedtech.mesc.common.banner.payroll.Pyabene.model;

import morphis.foundations.flavors.forms.appsupportlib.model.SimpleBusinessObject;
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
	


	public NString getnName() {
		return toStr(super.getValue("NAME"));
	}
	
	public void setnName(NString value) {
		super.setValue("NAME", value);
	}
	


	public NString getEmstRule() {
		return toStr(super.getValue("EMST_RULE"));
	}
	
	public void setEmstRule(NString value) {
		super.setValue("EMST_RULE", value);
	}
	


	public NString getBcatCode() {
		return toStr(super.getValue("BCAT_CODE"));
	}
	
	public void setBcatCode(NString value) {
		super.setValue("BCAT_CODE", value);
	}
	


	public NString getBcatDesc() {
		return toStr(super.getValue("BCAT_DESC"));
	}
	
	public void setBcatDesc(NString value) {
		super.setValue("BCAT_DESC", value);
	}
	



}




