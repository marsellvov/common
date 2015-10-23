package net.hedtech.banner.alumni.common.Apcaddr.model;

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
	


	public NString getEntityInd() {
		return toStr(super.getValue("ENTITY_IND"));
	}
	
	public void setEntityInd(NString value) {
		super.setValue("ENTITY_IND", value);
	}
	


	public NString getSpsPidm() {
		return toStr(super.getValue("SPS_PIDM"));
	}
	
	public void setSpsPidm(NString value) {
		super.setValue("SPS_PIDM", value);
	}
	


	public NNumber getKeyPidm() {
		return toNumber(super.getValue("KEY_PIDM"));
	}
	
	public void setKeyPidm(NNumber value) {
		super.setValue("KEY_PIDM", value);
	}
	


	public NNumber getPidm() {
		return toNumber(super.getValue("PIDM"));
	}
	
	public void setPidm(NNumber value) {
		super.setValue("PIDM", value);
	}
	


	public NString getConfidInd() {
		return toStr(super.getValue("CONFID_IND"));
	}
	
	public void setConfidInd(NString value) {
		super.setValue("CONFID_IND", value);
	}
	


	public NString getSpsDeceasedInd() {
		return toStr(super.getValue("SPS_DECEASED_IND"));
	}
	
	public void setSpsDeceasedInd(NString value) {
		super.setValue("SPS_DECEASED_IND", value);
	}
	


	public NString getDonrCat() {
		return toStr(super.getValue("DONR_CAT"));
	}
	
	public void setDonrCat(NString value) {
		super.setValue("DONR_CAT", value);
	}
	


	public NString getDeceasedInd() {
		return toStr(super.getValue("DECEASED_IND"));
	}
	
	public void setDeceasedInd(NString value) {
		super.setValue("DECEASED_IND", value);
	}
	


	public NString getSpsIdno() {
		return toStr(super.getValue("SPS_IDNO"));
	}
	
	public void setSpsIdno(NString value) {
		super.setValue("SPS_IDNO", value);
	}
	


	public NString getSpsName() {
		return toStr(super.getValue("SPS_NAME"));
	}
	
	public void setSpsName(NString value) {
		super.setValue("SPS_NAME", value);
	}
	


	public NString getSpsDonrCat() {
		return toStr(super.getValue("SPS_DONR_CAT"));
	}
	
	public void setSpsDonrCat(NString value) {
		super.setValue("SPS_DONR_CAT", value);
	}
	


	public NString getPrefClass() {
		return toStr(super.getValue("PREF_CLASS"));
	}
	
	public void setPrefClass(NString value) {
		super.setValue("PREF_CLASS", value);
	}
	


	public NString getSpsPrefClass() {
		return toStr(super.getValue("SPS_PREF_CLASS"));
	}
	
	public void setSpsPrefClass(NString value) {
		super.setValue("SPS_PREF_CLASS", value);
	}
	



}




