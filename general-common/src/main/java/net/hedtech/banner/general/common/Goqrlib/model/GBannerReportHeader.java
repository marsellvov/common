package net.hedtech.banner.general.common.Goqrlib.model;

import morphis.foundations.core.appsupportlib.model.SimpleBusinessObject;
import morphis.foundations.core.appsupportlib.model.configuration.SimpleBusinessObjectConfiguration;
import morphis.foundations.core.types.*;
import static morphis.foundations.core.types.Types.*;


public class GBannerReportHeader extends SimpleBusinessObject
{
	public GBannerReportHeader() {
		super();
	}

	public GBannerReportHeader(SimpleBusinessObjectConfiguration configuration, String name) {
		super(configuration, name);
	}
	

	



	public NString getOrepName() {
		return toStr(super.getValue("OREP_NAME"));
	}
	
	public void setOrepName(NString value) {
		super.setValue("OREP_NAME", value);
	}
	


	public NString getOrepReportDescription() {
		return toStr(super.getValue("OREP_REPORT_DESCRIPTION"));
	}
	
	public void setOrepReportDescription(NString value) {
		super.setValue("OREP_REPORT_DESCRIPTION", value);
	}
	


	public NString getOrepServerName() {
		return toStr(super.getValue("OREP_SERVER_NAME"));
	}
	
	public void setOrepServerName(NString value) {
		super.setValue("OREP_SERVER_NAME", value);
	}
	


	public NString getOrepService() {
		return toStr(super.getValue("OREP_SERVICE"));
	}
	
	public void setOrepService(NString value) {
		super.setValue("OREP_SERVICE", value);
	}
	


	public NString getWorkOrepReturnItem() {
		return toStr(super.getValue("WORK_OREP_RETURN_ITEM"));
	}
	
	public void setWorkOrepReturnItem(NString value) {
		super.setValue("WORK_OREP_RETURN_ITEM", value);
	}
	


	public NString getDefaultDesformat() {
		return toStr(super.getValue("DEFAULT_DESFORMAT"));
	}
	
	public void setDefaultDesformat(NString value) {
		super.setValue("DEFAULT_DESFORMAT", value);
	}
	


	public NString getDefaultDestype() {
		return toStr(super.getValue("DEFAULT_DESTYPE"));
	}
	
	public void setDefaultDestype(NString value) {
		super.setValue("DEFAULT_DESTYPE", value);
	}
	


	public NString getDefaultDesname() {
		return toStr(super.getValue("DEFAULT_DESNAME"));
	}
	
	public void setDefaultDesname(NString value) {
		super.setValue("DEFAULT_DESNAME", value);
	}
	


	public NString getDefaultExecutionMode() {
		return toStr(super.getValue("DEFAULT_EXECUTION_MODE"));
	}
	
	public void setDefaultExecutionMode(NString value) {
		super.setValue("DEFAULT_EXECUTION_MODE", value);
	}
	


	public NString getDefaultCommMode() {
		return toStr(super.getValue("DEFAULT_COMM_MODE"));
	}
	
	public void setDefaultCommMode(NString value) {
		super.setValue("DEFAULT_COMM_MODE", value);
	}
	


	public NString getDefaultParamformDesig() {
		return toStr(super.getValue("DEFAULT_PARAMFORM_DESIG"));
	}
	
	public void setDefaultParamformDesig(NString value) {
		super.setValue("DEFAULT_PARAMFORM_DESIG", value);
	}
	


	public NString getDataSeparatorLine1() {
		return toStr(super.getValue("DATA_SEPARATOR_LINE_1"));
	}
	
	public void setDataSeparatorLine1(NString value) {
		super.setValue("DATA_SEPARATOR_LINE_1", value);
	}
	


	public NString getDataSeparatorLine2() {
		return toStr(super.getValue("DATA_SEPARATOR_LINE_2"));
	}
	
	public void setDataSeparatorLine2(NString value) {
		super.setValue("DATA_SEPARATOR_LINE_2", value);
	}
	


	public NString getListParamNames() {
		return toStr(super.getValue("LIST_PARAM_NAMES"));
	}
	
	public void setListParamNames(NString value) {
		super.setValue("LIST_PARAM_NAMES", value);
	}
	



}




