package net.hedtech.general.common.libraries.Goqolib.model;


import morphis.foundations.core.appsupportlib.model.configuration.SimpleBusinessObjectConfiguration;
import morphis.foundations.core.types.*;
import morphis.foundations.flavors.forms.appsupportlib.model.SimpleBusinessObject;
import static morphis.foundations.core.types.Types.*;


public class GSdkey extends SimpleBusinessObject
{
	public GSdkey() {
		super();
	}

	public GSdkey(SimpleBusinessObjectConfiguration configuration, String name) {
		super(configuration, name);
	}
	

	



	public NString getSdBlock() {
		return toStr(super.getValue("SD_BLOCK"));
	}
	
	public void setSdBlock(NString value) {
		super.setValue("SD_BLOCK", value);
	}
	


	public NString getSdDispblock() {
		return toStr(super.getValue("SD_DISPBLOCK"));
	}
	
	public void setSdDispblock(NString value) {
		super.setValue("SD_DISPBLOCK", value);
	}
	


	public NString getSdBantab() {
		return toStr(super.getValue("SD_BANTAB"));
	}
	
	public void setSdBantab(NString value) {
		super.setValue("SD_BANTAB", value);
	}
	


	public NString getSdKey() {
		return toStr(super.getValue("SD_KEY"));
	}
	
	public void setSdKey(NString value) {
		super.setValue("SD_KEY", value);
	}
	


	public NString getSdRowid() {
		return toStr(super.getValue("SD_ROWID"));
	}
	
	public void setSdRowid(NString value) {
		super.setValue("SD_ROWID", value);
	}
	


	public NString getSdDisprowid() {
		return toStr(super.getValue("SD_DISPROWID"));
	}
	
	public void setSdDisprowid(NString value) {
		super.setValue("SD_DISPROWID", value);
	}
	


	public NString getSdExists() {
		return toStr(super.getValue("SD_EXISTS"));
	}
	
	public void setSdExists(NString value) {
		super.setValue("SD_EXISTS", value);
	}
	


	public NString getEnableAttrIns() {
		return toStr(super.getValue("ENABLE_ATTR_INS"));
	}
	
	public void setEnableAttrIns(NString value) {
		super.setValue("ENABLE_ATTR_INS", value);
	}
	


	public NString getTrigEna() {
		return toStr(super.getValue("TRIG_ENA"));
	}
	
	public void setTrigEna(NString value) {
		super.setValue("TRIG_ENA", value);
	}
	


	public NString getRenumSdRec() {
		return toStr(super.getValue("RENUM_SD_REC"));
	}
	
	public void setRenumSdRec(NString value) {
		super.setValue("RENUM_SD_REC", value);
	}
	


	public NNumber getCountNotNull() {
		return toNumber(super.getValue("COUNT_NOT_NULL"));
	}
	
	public void setCountNotNull(NNumber value) {
		super.setValue("COUNT_NOT_NULL", value);
	}
	


	public NNumber getCountReqdIsNull() {
		return toNumber(super.getValue("COUNT_REQD_IS_NULL"));
	}
	
	public void setCountReqdIsNull(NNumber value) {
		super.setValue("COUNT_REQD_IS_NULL", value);
	}
	



}




