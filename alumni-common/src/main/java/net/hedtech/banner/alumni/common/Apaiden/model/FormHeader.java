package net.hedtech.banner.alumni.common.Apaiden.model;

import morphis.foundations.flavors.forms.appsupportlib.model.SimpleBusinessObject;
import morphis.foundations.core.appsupportlib.model.configuration.SimpleBusinessObjectConfiguration;
import morphis.foundations.core.types.*;
import static morphis.foundations.core.types.Types.*;


public class FormHeader extends SimpleBusinessObject
{
	public FormHeader() {
		super();
	}

	public FormHeader(SimpleBusinessObjectConfiguration configuration, String name) {
		super(configuration, name);
	}
	

	



	public NString getCurrentRelease() {
		return toStr(super.getValue("CURRENT_RELEASE"));
	}
	
	public void setCurrentRelease(NString value) {
		super.setValue("CURRENT_RELEASE", value);
	}
	


	public NString getCurrentInstitution() {
		return toStr(super.getValue("CURRENT_INSTITUTION"));
	}
	
	public void setCurrentInstitution(NString value) {
		super.setValue("CURRENT_INSTITUTION", value);
	}
	


	public NString getMaterialFlag() {
		return toStr(super.getValue("MATERIAL_FLAG"));
	}
	
	public void setMaterialFlag(NString value) {
		super.setValue("MATERIAL_FLAG", value);
	}
	


	public NString getCallfld() {
		return toStr(super.getValue("CALLFLD"));
	}
	
	public void setCallfld(NString value) {
		super.setValue("CALLFLD", value);
	}
	


	public NString getWorkdate() {
		return toStr(super.getValue("WORKDATE"));
	}
	
	public void setWorkdate(NString value) {
		super.setValue("WORKDATE", value);
	}
	


	public NString getCurrentDate() {
		return toStr(super.getValue("CURRENT_DATE"));
	}
	
	public void setCurrentDate(NString value) {
		super.setValue("CURRENT_DATE", value);
	}
	


	public NString getCurrentTime() {
		return toStr(super.getValue("CURRENT_TIME"));
	}
	
	public void setCurrentTime(NString value) {
		super.setValue("CURRENT_TIME", value);
	}
	


	public NString getCurrentForm() {
		return toStr(super.getValue("CURRENT_FORM"));
	}
	
	public void setCurrentForm(NString value) {
		super.setValue("CURRENT_FORM", value);
	}
	


	public NString getHoldBlock() {
		return toStr(super.getValue("HOLD_BLOCK"));
	}
	
	public void setHoldBlock(NString value) {
		super.setValue("HOLD_BLOCK", value);
	}
	


	public NString getHoldField() {
		return toStr(super.getValue("HOLD_FIELD"));
	}
	
	public void setHoldField(NString value) {
		super.setValue("HOLD_FIELD", value);
	}
	


	public NString getHoldBlockField() {
		return toStr(super.getValue("HOLD_BLOCK_FIELD"));
	}
	
	public void setHoldBlockField(NString value) {
		super.setValue("HOLD_BLOCK_FIELD", value);
	}
	


	public NString getCurrentUser() {
		return toStr(super.getValue("CURRENT_USER"));
	}
	
	public void setCurrentUser(NString value) {
		super.setValue("CURRENT_USER", value);
	}
	


	public NString getWhichNameSearch() {
		return toStr(super.getValue("WHICH_NAME_SEARCH"));
	}
	
	public void setWhichNameSearch(NString value) {
		super.setValue("WHICH_NAME_SEARCH", value);
	}
	


	public NString getCalledFromItem() {
		return toStr(super.getValue("CALLED_FROM_ITEM"));
	}
	
	public void setCalledFromItem(NString value) {
		super.setValue("CALLED_FROM_ITEM", value);
	}
	


	public NString getHoldKeyIdnoForAlerts() {
		return toStr(super.getValue("HOLD_KEY_IDNO_FOR_ALERTS"));
	}
	
	public void setHoldKeyIdnoForAlerts(NString value) {
		super.setValue("HOLD_KEY_IDNO_FOR_ALERTS", value);
	}
	


	public NString getEmailInd() {
		return toStr(super.getValue("EMAIL_IND"));
	}
	
	public void setEmailInd(NString value) {
		super.setValue("EMAIL_IND", value);
	}
	


	public NString getCmtResult() {
		return toStr(super.getValue("CMT_RESULT"));
	}
	
	public void setCmtResult(NString value) {
		super.setValue("CMT_RESULT", value);
	}
	



}




