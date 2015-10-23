package net.hedtech.general.common.libraries.Goqolib.model;

import morphis.foundations.flavors.forms.appsupportlib.model.SimpleBusinessObject;
import morphis.foundations.core.appsupportlib.model.configuration.SimpleBusinessObjectConfiguration;
import morphis.foundations.core.types.*;
import static morphis.foundations.core.types.Types.*;


public class GFuncBaseInfoBlock extends SimpleBusinessObject
{
	public GFuncBaseInfoBlock() {
		super();
	}

	public GFuncBaseInfoBlock(SimpleBusinessObjectConfiguration configuration, String name) {
		super(configuration, name);
	}
	

	



	public NString getFuncEvntCrn() {
		return toStr(super.getValue("FUNC_EVNT_CRN"));
	}
	
	public void setFuncEvntCrn(NString value) {
		super.setValue("FUNC_EVNT_CRN", value);
	}
	


	public NString getFuncFuncCode() {
		return toStr(super.getValue("FUNC_FUNC_CODE"));
	}
	
	public void setFuncFuncCode(NString value) {
		super.setValue("FUNC_FUNC_CODE", value);
	}
	


	public NNumber getFuncSpnsrOrgnPidm() {
		return toNumber(super.getValue("FUNC_SPNSR_ORGN_PIDM"));
	}
	
	public void setFuncSpnsrOrgnPidm(NNumber value) {
		super.setValue("FUNC_SPNSR_ORGN_PIDM", value);
	}
	


	public NString getFuncPurpCode() {
		return toStr(super.getValue("FUNC_PURP_CODE"));
	}
	
	public void setFuncPurpCode(NString value) {
		super.setValue("FUNC_PURP_CODE", value);
	}
	


	public NString getFuncPurpDesc() {
		return toStr(super.getValue("FUNC_PURP_DESC"));
	}
	
	public void setFuncPurpDesc(NString value) {
		super.setValue("FUNC_PURP_DESC", value);
	}
	


	public NString getParkSpot() {
		return toStr(super.getValue("PARK_SPOT"));
	}
	
	public void setParkSpot(NString value) {
		super.setValue("PARK_SPOT", value);
	}
	


	public NString getFuncEtypCode() {
		return toStr(super.getValue("FUNC_ETYP_CODE"));
	}
	
	public void setFuncEtypCode(NString value) {
		super.setValue("FUNC_ETYP_CODE", value);
	}
	


	public NString getEtypDesc() {
		return toStr(super.getValue("ETYP_DESC"));
	}
	
	public void setEtypDesc(NString value) {
		super.setValue("ETYP_DESC", value);
	}
	


	public NString getFuncEmphCode() {
		return toStr(super.getValue("FUNC_EMPH_CODE"));
	}
	
	public void setFuncEmphCode(NString value) {
		super.setValue("FUNC_EMPH_CODE", value);
	}
	


	public NString getFuncFstaCode() {
		return toStr(super.getValue("FUNC_FSTA_CODE"));
	}
	
	public void setFuncFstaCode(NString value) {
		super.setValue("FUNC_FSTA_CODE", value);
	}
	


	public NString getSponsorId() {
		return toStr(super.getValue("SPONSOR_ID"));
	}
	
	public void setSponsorId(NString value) {
		super.setValue("SPONSOR_ID", value);
	}
	


	public NString getSponsorName() {
		return toStr(super.getValue("SPONSOR_NAME"));
	}
	
	public void setSponsorName(NString value) {
		super.setValue("SPONSOR_NAME", value);
	}
	


	public NNumber getLocationContactPidm() {
		return toNumber(super.getValue("LOCATION_CONTACT_PIDM"));
	}
	
	public void setLocationContactPidm(NNumber value) {
		super.setValue("LOCATION_CONTACT_PIDM", value);
	}
	


	public NString getLocationContactId() {
		return toStr(super.getValue("LOCATION_CONTACT_ID"));
	}
	
	public void setLocationContactId(NString value) {
		super.setValue("LOCATION_CONTACT_ID", value);
	}
	


	public NString getLocationContactName() {
		return toStr(super.getValue("LOCATION_CONTACT_NAME"));
	}
	
	public void setLocationContactName(NString value) {
		super.setValue("LOCATION_CONTACT_NAME", value);
	}
	


	public NNumber getPrimaryContactPidm() {
		return toNumber(super.getValue("PRIMARY_CONTACT_PIDM"));
	}
	
	public void setPrimaryContactPidm(NNumber value) {
		super.setValue("PRIMARY_CONTACT_PIDM", value);
	}
	


	public NString getPrimaryContactId() {
		return toStr(super.getValue("PRIMARY_CONTACT_ID"));
	}
	
	public void setPrimaryContactId(NString value) {
		super.setValue("PRIMARY_CONTACT_ID", value);
	}
	


	public NString getPrimaryContactName() {
		return toStr(super.getValue("PRIMARY_CONTACT_NAME"));
	}
	
	public void setPrimaryContactName(NString value) {
		super.setValue("PRIMARY_CONTACT_NAME", value);
	}
	


	public NString getStartDate() {
		return toStr(super.getValue("START_DATE"));
	}
	
	public void setStartDate(NString value) {
		super.setValue("START_DATE", value);
	}
	


	public NString getEndDate() {
		return toStr(super.getValue("END_DATE"));
	}
	
	public void setEndDate(NString value) {
		super.setValue("END_DATE", value);
	}
	


	public NString getMonday() {
		return toStr(super.getValue("MONDAY"));
	}
	
	public void setMonday(NString value) {
		super.setValue("MONDAY", value);
	}
	


	public NString getTuesday() {
		return toStr(super.getValue("TUESDAY"));
	}
	
	public void setTuesday(NString value) {
		super.setValue("TUESDAY", value);
	}
	


	public NString getWednesday() {
		return toStr(super.getValue("WEDNESDAY"));
	}
	
	public void setWednesday(NString value) {
		super.setValue("WEDNESDAY", value);
	}
	


	public NString getThursday() {
		return toStr(super.getValue("THURSDAY"));
	}
	
	public void setThursday(NString value) {
		super.setValue("THURSDAY", value);
	}
	


	public NString getFriday() {
		return toStr(super.getValue("FRIDAY"));
	}
	
	public void setFriday(NString value) {
		super.setValue("FRIDAY", value);
	}
	


	public NString getSaturday() {
		return toStr(super.getValue("SATURDAY"));
	}
	
	public void setSaturday(NString value) {
		super.setValue("SATURDAY", value);
	}
	


	public NString getSunday() {
		return toStr(super.getValue("SUNDAY"));
	}
	
	public void setSunday(NString value) {
		super.setValue("SUNDAY", value);
	}
	


	public NString getBeginTime() {
		return toStr(super.getValue("BEGIN_TIME"));
	}
	
	public void setBeginTime(NString value) {
		super.setValue("BEGIN_TIME", value);
	}
	


	public NString getEndTime() {
		return toStr(super.getValue("END_TIME"));
	}
	
	public void setEndTime(NString value) {
		super.setValue("END_TIME", value);
	}
	


	public NString getBuilding() {
		return toStr(super.getValue("BUILDING"));
	}
	
	public void setBuilding(NString value) {
		super.setValue("BUILDING", value);
	}
	


	public NString getRoom() {
		return toStr(super.getValue("ROOM"));
	}
	
	public void setRoom(NString value) {
		super.setValue("ROOM", value);
	}
	


	public NString getSaveBlockName() {
		return toStr(super.getValue("SAVE_BLOCK_NAME"));
	}
	
	public void setSaveBlockName(NString value) {
		super.setValue("SAVE_BLOCK_NAME", value);
	}
	



}




