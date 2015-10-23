package net.hedtech.banner.finance.common.Foqolib.model;

import morphis.foundations.core.appsupportlib.model.SimpleBusinessObject;
import morphis.foundations.core.appsupportlib.model.configuration.SimpleBusinessObjectConfiguration;
import morphis.foundations.core.types.*;
import static morphis.foundations.core.types.Types.*;


public class DateBlock extends SimpleBusinessObject
{
	public DateBlock() {
		super();
	}

	public DateBlock(SimpleBusinessObjectConfiguration configuration, String name) {
		super(configuration, name);
	}
	

	



	public NNumber getDateCenturyPivot() {
		return toNumber(super.getValue("DATE$_CENTURY_PIVOT"));
	}
	
	public void setDateCenturyPivot(NNumber value) {
		super.setValue("DATE$_CENTURY_PIVOT", value);
	}
	


	public NString getDateDefaultFormat() {
		return toStr(super.getValue("DATE$_DEFAULT_FORMAT"));
	}
	
	public void setDateDefaultFormat(NString value) {
		super.setValue("DATE$_DEFAULT_FORMAT", value);
	}
	


	public NString getDateValue() {
		return toStr(super.getValue("DATE$_VALUE"));
	}
	
	public void setDateValue(NString value) {
		super.setValue("DATE$_VALUE", value);
	}
	


	public NString getDateFormat() {
		return toStr(super.getValue("DATE$_FORMAT"));
	}
	
	public void setDateFormat(NString value) {
		super.setValue("DATE$_FORMAT", value);
	}
	


	public NString getDateFieldName() {
		return toStr(super.getValue("DATE$_FIELD_NAME"));
	}
	
	public void setDateFieldName(NString value) {
		super.setValue("DATE$_FIELD_NAME", value);
	}
	


	public NString getDateCurrentMon() {
		return toStr(super.getValue("DATE$_CURRENT_MON"));
	}
	
	public void setDateCurrentMon(NString value) {
		super.setValue("DATE$_CURRENT_MON", value);
	}
	


	public NString getDateCurrentYy() {
		return toStr(super.getValue("DATE$_CURRENT_YY"));
	}
	
	public void setDateCurrentYy(NString value) {
		super.setValue("DATE$_CURRENT_YY", value);
	}
	


	public NString getDateCurrentCent() {
		return toStr(super.getValue("DATE$_CURRENT_CENT"));
	}
	
	public void setDateCurrentCent(NString value) {
		super.setValue("DATE$_CURRENT_CENT", value);
	}
	


	public NString getDateCurrentMm() {
		return toStr(super.getValue("DATE$_CURRENT_MM"));
	}
	
	public void setDateCurrentMm(NString value) {
		super.setValue("DATE$_CURRENT_MM", value);
	}
	



}




