package net.hedtech.general.common.libraries.Soqolib.model;

import morphis.foundations.core.appsupportlib.model.SimpleBusinessObject;
import morphis.foundations.core.appsupportlib.model.configuration.SimpleBusinessObjectConfiguration;
import morphis.foundations.core.types.*;
import static morphis.foundations.core.types.Types.*;


public class Dummy extends SimpleBusinessObject
{
	public Dummy() {
		super();
	}

	public Dummy(SimpleBusinessObjectConfiguration configuration, String name) {
		super(configuration, name);
	}
	

	



	public NString getCheckKeys() {
		return toStr(super.getValue("CHECK_KEYS"));
	}
	
	public void setCheckKeys(NString value) {
		super.setValue("CHECK_KEYS", value);
	}
	


	public NString getCurrentRelease() {
		return toStr(super.getValue("CURRENT_RELEASE"));
	}
	
	public void setCurrentRelease(NString value) {
		super.setValue("CURRENT_RELEASE", value);
	}
	


	public NString getSgbstdnAdvrId() {
		return toStr(super.getValue("SGBSTDN_ADVR_ID"));
	}
	
	public void setSgbstdnAdvrId(NString value) {
		super.setValue("SGBSTDN_ADVR_ID", value);
	}
	


	public NString getSgbstdnAdvrName() {
		return toStr(super.getValue("SGBSTDN_ADVR_NAME"));
	}
	
	public void setSgbstdnAdvrName(NString value) {
		super.setValue("SGBSTDN_ADVR_NAME", value);
	}
	


	public NString getSgbstdnAdvrCode() {
		return toStr(super.getValue("SGBSTDN_ADVR_CODE"));
	}
	
	public void setSgbstdnAdvrCode(NString value) {
		super.setValue("SGBSTDN_ADVR_CODE", value);
	}
	


	public NNumber getSgbstdnPidm() {
		return toNumber(super.getValue("SGBSTDN_PIDM"));
	}
	
	public void setSgbstdnPidm(NNumber value) {
		super.setValue("SGBSTDN_PIDM", value);
	}
	


	public NString getSgbstdnTermCodeEff() {
		return toStr(super.getValue("SGBSTDN_TERM_CODE_EFF"));
	}
	
	public void setSgbstdnTermCodeEff(NString value) {
		super.setValue("SGBSTDN_TERM_CODE_EFF", value);
	}
	



}




