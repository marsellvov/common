package net.hedtech.general.common.libraries.Aoqolib.model;

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
	

	



	public NString getCurrentForm() {
		return toStr(super.getValue("CURRENT_FORM"));
	}
	
	public void setCurrentForm(NString value) {
		super.setValue("CURRENT_FORM", value);
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
	


	public NString getWorkdate() {
		return toStr(super.getValue("WORKDATE"));
	}
	
	public void setWorkdate(NString value) {
		super.setValue("WORKDATE", value);
	}
	


	public NString getWorkuser() {
		return toStr(super.getValue("WORKUSER"));
	}
	
	public void setWorkuser(NString value) {
		super.setValue("WORKUSER", value);
	}
	


	public NNumber getWorkyear() {
		return toNumber(super.getValue("WORKYEAR"));
	}
	
	public void setWorkyear(NNumber value) {
		super.setValue("WORKYEAR", value);
	}
	


	public NNumber getPivotYear() {
		return toNumber(super.getValue("PIVOT_YEAR"));
	}
	
	public void setPivotYear(NNumber value) {
		super.setValue("PIVOT_YEAR", value);
	}
	


	public NString getChardate() {
		return toStr(super.getValue("CHARDATE"));
	}
	
	public void setChardate(NString value) {
		super.setValue("CHARDATE", value);
	}
	


	public NDate getDatedate() {
		return toDate(super.getValue("DATEDATE"));
	}
	
	public void setDatedate(NDate value) {
		super.setValue("DATEDATE", value);
	}
	


	public NNumber getVarlength() {
		return toNumber(super.getValue("VARLENGTH"));
	}
	
	public void setVarlength(NNumber value) {
		super.setValue("VARLENGTH", value);
	}
	


	public NString getCallfld() {
		return toStr(super.getValue("CALLFLD"));
	}
	
	public void setCallfld(NString value) {
		super.setValue("CALLFLD", value);
	}
	


	public NString getCurrentUser() {
		return toStr(super.getValue("CURRENT_USER"));
	}
	
	public void setCurrentUser(NString value) {
		super.setValue("CURRENT_USER", value);
	}
	



}




