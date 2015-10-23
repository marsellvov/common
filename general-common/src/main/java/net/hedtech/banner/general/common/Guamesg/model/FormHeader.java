package net.hedtech.banner.general.common.Guamesg.model;

import morphis.foundations.core.appsupportlib.model.SimpleBusinessObject;
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
	


	public NString getWorkfld() {
		return toStr(super.getValue("WORKFLD"));
	}
	
	public void setWorkfld(NString value) {
		super.setValue("WORKFLD", value);
	}
	


	public NString getWorkdate() {
		return toStr(super.getValue("WORKDATE"));
	}
	
	public void setWorkdate(NString value) {
		super.setValue("WORKDATE", value);
	}
	


	public NNumber getHoldNumber1() {
		return toNumber(super.getValue("HOLD_NUMBER1"));
	}
	
	public void setHoldNumber1(NNumber value) {
		super.setValue("HOLD_NUMBER1", value);
	}
	


	public NString getResequenceInd() {
		return toStr(super.getValue("RESEQUENCE_IND"));
	}
	
	public void setResequenceInd(NString value) {
		super.setValue("RESEQUENCE_IND", value);
	}
	


	public NNumber getHoldNumber2() {
		return toNumber(super.getValue("HOLD_NUMBER2"));
	}
	
	public void setHoldNumber2(NNumber value) {
		super.setValue("HOLD_NUMBER2", value);
	}
	


	public NString getCurrentForm() {
		return toStr(super.getValue("CURRENT_FORM"));
	}
	
	public void setCurrentForm(NString value) {
		super.setValue("CURRENT_FORM", value);
	}
	


	public NDate getQueryDate() {
		return toDate(super.getValue("QUERY_DATE"));
	}
	
	public void setQueryDate(NDate value) {
		super.setValue("QUERY_DATE", value);
	}
	


	public NString getWorkuser() {
		return toStr(super.getValue("WORKUSER"));
	}
	
	public void setWorkuser(NString value) {
		super.setValue("WORKUSER", value);
	}
	


	public NString getCurrentUser() {
		return toStr(super.getValue("CURRENT_USER"));
	}
	
	public void setCurrentUser(NString value) {
		super.setValue("CURRENT_USER", value);
	}
	



}




