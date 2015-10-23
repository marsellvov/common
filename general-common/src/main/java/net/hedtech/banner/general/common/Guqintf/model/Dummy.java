package net.hedtech.banner.general.common.Guqintf.model;

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
	

	



	public NString getCurrentTime() {
		return toStr(super.getValue("CURRENT_TIME"));
	}
	
	public void setCurrentTime(NString value) {
		super.setValue("CURRENT_TIME", value);
	}
	


	public NString getCurrentDate() {
		return toStr(super.getValue("CURRENT_DATE"));
	}
	
	public void setCurrentDate(NString value) {
		super.setValue("CURRENT_DATE", value);
	}
	


	public NString getProcessMsg() {
		return toStr(super.getValue("PROCESS_MSG"));
	}
	
	public void setProcessMsg(NString value) {
		super.setValue("PROCESS_MSG", value);
	}
	


	public NString getProcessStatus() {
		return toStr(super.getValue("PROCESS_STATUS"));
	}
	
	public void setProcessStatus(NString value) {
		super.setValue("PROCESS_STATUS", value);
	}
	


	public NString getProcessInd() {
		return toStr(super.getValue("PROCESS_IND"));
	}
	
	public void setProcessInd(NString value) {
		super.setValue("PROCESS_IND", value);
	}
	


	public NString getHostPrefix() {
		return toStr(super.getValue("HOST_PREFIX"));
	}
	
	public void setHostPrefix(NString value) {
		super.setValue("HOST_PREFIX", value);
	}
	


	public NString getCommandName() {
		return toStr(super.getValue("COMMAND_NAME"));
	}
	
	public void setCommandName(NString value) {
		super.setValue("COMMAND_NAME", value);
	}
	


	public NString getJobId() {
		return toStr(super.getValue("JOB_ID"));
	}
	
	public void setJobId(NString value) {
		super.setValue("JOB_ID", value);
	}
	


	public NString getPrntCode() {
		return toStr(super.getValue("PRNT_CODE"));
	}
	
	public void setPrntCode(NString value) {
		super.setValue("PRNT_CODE", value);
	}
	


	public NString getStatusInd() {
		return toStr(super.getValue("STATUS_IND"));
	}
	
	public void setStatusInd(NString value) {
		super.setValue("STATUS_IND", value);
	}
	


	public NNumber getOneUpNo() {
		return toNumber(super.getValue("ONE_UP_NO"));
	}
	
	public void setOneUpNo(NNumber value) {
		super.setValue("ONE_UP_NO", value);
	}
	


	public NString getHoldTermCode() {
		return toStr(super.getValue("HOLD_TERM_CODE"));
	}
	
	public void setHoldTermCode(NString value) {
		super.setValue("HOLD_TERM_CODE", value);
	}
	


	public NString getHoldJobId() {
		return toStr(super.getValue("HOLD_JOB_ID"));
	}
	
	public void setHoldJobId(NString value) {
		super.setValue("HOLD_JOB_ID", value);
	}
	


	public NString getHoldCallForm() {
		return toStr(super.getValue("HOLD_CALL_FORM"));
	}
	
	public void setHoldCallForm(NString value) {
		super.setValue("HOLD_CALL_FORM", value);
	}
	


	public NNumber getHoldOneUpNo() {
		return toNumber(super.getValue("HOLD_ONE_UP_NO"));
	}
	
	public void setHoldOneUpNo(NNumber value) {
		super.setValue("HOLD_ONE_UP_NO", value);
	}
	


	public NString getHoldDisplayMsg() {
		return toStr(super.getValue("HOLD_DISPLAY_MSG"));
	}
	
	public void setHoldDisplayMsg(NString value) {
		super.setValue("HOLD_DISPLAY_MSG", value);
	}
	


	public NString getMessageText() {
		return toStr(super.getValue("MESSAGE_TEXT"));
	}
	
	public void setMessageText(NString value) {
		super.setValue("MESSAGE_TEXT", value);
	}
	


	public NString getIsAutoLogin() {
		return toStr(super.getValue("IS_AUTO_LOGIN"));
	}
	
	public void setIsAutoLogin(NString value) {
		super.setValue("IS_AUTO_LOGIN", value);
	}
	


	public NString getHoldIdRequestNo() {
		return toStr(super.getValue("HOLD_ID_REQUEST_NO"));
	}
	
	public void setHoldIdRequestNo(NString value) {
		super.setValue("HOLD_ID_REQUEST_NO", value);
	}
	


	public NString getHoldId() {
		return toStr(super.getValue("HOLD_ID"));
	}
	
	public void setHoldId(NString value) {
		super.setValue("HOLD_ID", value);
	}
	


	public NString getHoldAidyCode() {
		return toStr(super.getValue("HOLD_AIDY_CODE"));
	}
	
	public void setHoldAidyCode(NString value) {
		super.setValue("HOLD_AIDY_CODE", value);
	}
	


	public NString getHoldPeriod() {
		return toStr(super.getValue("HOLD_PERIOD"));
	}
	
	public void setHoldPeriod(NString value) {
		super.setValue("HOLD_PERIOD", value);
	}
	


	public NString getAltUserId() {
		return toStr(super.getValue("ALT_USER_ID"));
	}
	
	public void setAltUserId(NString value) {
		super.setValue("ALT_USER_ID", value);
	}
	


	public NString getAltPassword() {
		return toStr(super.getValue("ALT_PASSWORD"));
	}
	
	public void setAltPassword(NString value) {
		super.setValue("ALT_PASSWORD", value);
	}
	


	public NString getCurrentRelease() {
		return toStr(super.getValue("CURRENT_RELEASE"));
	}
	
	public void setCurrentRelease(NString value) {
		super.setValue("CURRENT_RELEASE", value);
	}
	


	public NString getCommandString() {
		return toStr(super.getValue("COMMAND_STRING"));
	}
	
	public void setCommandString(NString value) {
		super.setValue("COMMAND_STRING", value);
	}
	



}




