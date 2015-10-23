package net.hedtech.general.common.libraries.Soqolib.model;

import morphis.foundations.core.appsupportlib.model.SimpleBusinessObject;
import morphis.foundations.core.appsupportlib.model.configuration.SimpleBusinessObjectConfiguration;
import morphis.foundations.core.types.*;
import static morphis.foundations.core.types.Types.*;


public class SCurriculumChange extends SimpleBusinessObject
{
	public SCurriculumChange() {
		super();
	}

	public SCurriculumChange(SimpleBusinessObjectConfiguration configuration, String name) {
		super(configuration, name);
	}
	

	



	public NString getCurrMinr11Change() {
		return toStr(super.getValue("CURR_MINR11_CHANGE"));
	}
	
	public void setCurrMinr11Change(NString value) {
		super.setValue("CURR_MINR11_CHANGE", value);
	}
	


	public NString getCurrTermCtlg1Change() {
		return toStr(super.getValue("CURR_TERM_CTLG_1_CHANGE"));
	}
	
	public void setCurrTermCtlg1Change(NString value) {
		super.setValue("CURR_TERM_CTLG_1_CHANGE", value);
	}
	


	public NNumber getCurrErrCtrl() {
		return toNumber(super.getValue("CURR_ERR_CTRL"));
	}
	
	public void setCurrErrCtrl(NNumber value) {
		super.setValue("CURR_ERR_CTRL", value);
	}
	


	public NString getSmrprleCurrInd() {
		return toStr(super.getValue("SMRPRLE_CURR_IND"));
	}
	
	public void setSmrprleCurrInd(NString value) {
		super.setValue("SMRPRLE_CURR_IND", value);
	}
	


	public NString getSmrprleCurr2Ind() {
		return toStr(super.getValue("SMRPRLE_CURR_2_IND"));
	}
	
	public void setSmrprleCurr2Ind(NString value) {
		super.setValue("SMRPRLE_CURR_2_IND", value);
	}
	


	public NNumber getCurrBase1Ctrl() {
		return toNumber(super.getValue("CURR_BASE1_CTRL"));
	}
	
	public void setCurrBase1Ctrl(NNumber value) {
		super.setValue("CURR_BASE1_CTRL", value);
	}
	


	public NNumber getCurrMajr1Ctrl() {
		return toNumber(super.getValue("CURR_MAJR1_CTRL"));
	}
	
	public void setCurrMajr1Ctrl(NNumber value) {
		super.setValue("CURR_MAJR1_CTRL", value);
	}
	


	public NNumber getCurrMinr1Ctrl() {
		return toNumber(super.getValue("CURR_MINR1_CTRL"));
	}
	
	public void setCurrMinr1Ctrl(NNumber value) {
		super.setValue("CURR_MINR1_CTRL", value);
	}
	


	public NNumber getCurrConc1Ctrl() {
		return toNumber(super.getValue("CURR_CONC1_CTRL"));
	}
	
	public void setCurrConc1Ctrl(NNumber value) {
		super.setValue("CURR_CONC1_CTRL", value);
	}
	


	public NNumber getCurrBase2Ctrl() {
		return toNumber(super.getValue("CURR_BASE2_CTRL"));
	}
	
	public void setCurrBase2Ctrl(NNumber value) {
		super.setValue("CURR_BASE2_CTRL", value);
	}
	


	public NNumber getCurrMajr2Ctrl() {
		return toNumber(super.getValue("CURR_MAJR2_CTRL"));
	}
	
	public void setCurrMajr2Ctrl(NNumber value) {
		super.setValue("CURR_MAJR2_CTRL", value);
	}
	


	public NNumber getCurrMinr2Ctrl() {
		return toNumber(super.getValue("CURR_MINR2_CTRL"));
	}
	
	public void setCurrMinr2Ctrl(NNumber value) {
		super.setValue("CURR_MINR2_CTRL", value);
	}
	


	public NNumber getCurrConc2Ctrl() {
		return toNumber(super.getValue("CURR_CONC2_CTRL"));
	}
	
	public void setCurrConc2Ctrl(NNumber value) {
		super.setValue("CURR_CONC2_CTRL", value);
	}
	


	public NNumber getHoldCtrlNumb() {
		return toNumber(super.getValue("HOLD_CTRL_NUMB"));
	}
	
	public void setHoldCtrlNumb(NNumber value) {
		super.setValue("HOLD_CTRL_NUMB", value);
	}
	


	public NString getBase1Chkind() {
		return toStr(super.getValue("BASE1_CHKIND"));
	}
	
	public void setBase1Chkind(NString value) {
		super.setValue("BASE1_CHKIND", value);
	}
	


	public NString getBase2Chkind() {
		return toStr(super.getValue("BASE2_CHKIND"));
	}
	
	public void setBase2Chkind(NString value) {
		super.setValue("BASE2_CHKIND", value);
	}
	


	public NString getMajr1Chkind() {
		return toStr(super.getValue("MAJR1_CHKIND"));
	}
	
	public void setMajr1Chkind(NString value) {
		super.setValue("MAJR1_CHKIND", value);
	}
	


	public NString getMajr2Chkind() {
		return toStr(super.getValue("MAJR2_CHKIND"));
	}
	
	public void setMajr2Chkind(NString value) {
		super.setValue("MAJR2_CHKIND", value);
	}
	


	public NString getCurrBase1Error() {
		return toStr(super.getValue("CURR_BASE1_ERROR"));
	}
	
	public void setCurrBase1Error(NString value) {
		super.setValue("CURR_BASE1_ERROR", value);
	}
	


	public NString getCurrBase2Error() {
		return toStr(super.getValue("CURR_BASE2_ERROR"));
	}
	
	public void setCurrBase2Error(NString value) {
		super.setValue("CURR_BASE2_ERROR", value);
	}
	


	public NString getCurrMajr1Error() {
		return toStr(super.getValue("CURR_MAJR1_ERROR"));
	}
	
	public void setCurrMajr1Error(NString value) {
		super.setValue("CURR_MAJR1_ERROR", value);
	}
	


	public NString getCurrMajr2Error() {
		return toStr(super.getValue("CURR_MAJR2_ERROR"));
	}
	
	public void setCurrMajr2Error(NString value) {
		super.setValue("CURR_MAJR2_ERROR", value);
	}
	


	public NString getCurrConc1Error() {
		return toStr(super.getValue("CURR_CONC1_ERROR"));
	}
	
	public void setCurrConc1Error(NString value) {
		super.setValue("CURR_CONC1_ERROR", value);
	}
	


	public NString getCurrConc2Error() {
		return toStr(super.getValue("CURR_CONC2_ERROR"));
	}
	
	public void setCurrConc2Error(NString value) {
		super.setValue("CURR_CONC2_ERROR", value);
	}
	


	public NString getCurrMinr1Error() {
		return toStr(super.getValue("CURR_MINR1_ERROR"));
	}
	
	public void setCurrMinr1Error(NString value) {
		super.setValue("CURR_MINR1_ERROR", value);
	}
	


	public NString getCurrMinr2Error() {
		return toStr(super.getValue("CURR_MINR2_ERROR"));
	}
	
	public void setCurrMinr2Error(NString value) {
		super.setValue("CURR_MINR2_ERROR", value);
	}
	


	public NNumber getCurrBase1Errctrl() {
		return toNumber(super.getValue("CURR_BASE1_ERRCTRL"));
	}
	
	public void setCurrBase1Errctrl(NNumber value) {
		super.setValue("CURR_BASE1_ERRCTRL", value);
	}
	


	public NNumber getCurrBase2Errctrl() {
		return toNumber(super.getValue("CURR_BASE2_ERRCTRL"));
	}
	
	public void setCurrBase2Errctrl(NNumber value) {
		super.setValue("CURR_BASE2_ERRCTRL", value);
	}
	


	public NNumber getCurrMajr1Errctrl() {
		return toNumber(super.getValue("CURR_MAJR1_ERRCTRL"));
	}
	
	public void setCurrMajr1Errctrl(NNumber value) {
		super.setValue("CURR_MAJR1_ERRCTRL", value);
	}
	


	public NNumber getCurrMinr1Errctrl() {
		return toNumber(super.getValue("CURR_MINR1_ERRCTRL"));
	}
	
	public void setCurrMinr1Errctrl(NNumber value) {
		super.setValue("CURR_MINR1_ERRCTRL", value);
	}
	


	public NNumber getCurrConc1Errctrl() {
		return toNumber(super.getValue("CURR_CONC1_ERRCTRL"));
	}
	
	public void setCurrConc1Errctrl(NNumber value) {
		super.setValue("CURR_CONC1_ERRCTRL", value);
	}
	


	public NNumber getCurrMajr2Errctrl() {
		return toNumber(super.getValue("CURR_MAJR2_ERRCTRL"));
	}
	
	public void setCurrMajr2Errctrl(NNumber value) {
		super.setValue("CURR_MAJR2_ERRCTRL", value);
	}
	


	public NNumber getCurrMinr2Errctrl() {
		return toNumber(super.getValue("CURR_MINR2_ERRCTRL"));
	}
	
	public void setCurrMinr2Errctrl(NNumber value) {
		super.setValue("CURR_MINR2_ERRCTRL", value);
	}
	


	public NNumber getCurrConc2Errctrl() {
		return toNumber(super.getValue("CURR_CONC2_ERRCTRL"));
	}
	
	public void setCurrConc2Errctrl(NNumber value) {
		super.setValue("CURR_CONC2_ERRCTRL", value);
	}
	


	public NString getCurrUpdConc111() {
		return toStr(super.getValue("CURR_UPD_CONC111"));
	}
	
	public void setCurrUpdConc111(NString value) {
		super.setValue("CURR_UPD_CONC111", value);
	}
	


	public NString getCurrUpdConc112() {
		return toStr(super.getValue("CURR_UPD_CONC112"));
	}
	
	public void setCurrUpdConc112(NString value) {
		super.setValue("CURR_UPD_CONC112", value);
	}
	


	public NString getCurrUpdConc113() {
		return toStr(super.getValue("CURR_UPD_CONC113"));
	}
	
	public void setCurrUpdConc113(NString value) {
		super.setValue("CURR_UPD_CONC113", value);
	}
	


	public NString getCurrUpdConc121() {
		return toStr(super.getValue("CURR_UPD_CONC121"));
	}
	
	public void setCurrUpdConc121(NString value) {
		super.setValue("CURR_UPD_CONC121", value);
	}
	


	public NString getCurrUpdConc122() {
		return toStr(super.getValue("CURR_UPD_CONC122"));
	}
	
	public void setCurrUpdConc122(NString value) {
		super.setValue("CURR_UPD_CONC122", value);
	}
	


	public NString getCurrUpdConc123() {
		return toStr(super.getValue("CURR_UPD_CONC123"));
	}
	
	public void setCurrUpdConc123(NString value) {
		super.setValue("CURR_UPD_CONC123", value);
	}
	


	public NString getCurrUpdConc211() {
		return toStr(super.getValue("CURR_UPD_CONC211"));
	}
	
	public void setCurrUpdConc211(NString value) {
		super.setValue("CURR_UPD_CONC211", value);
	}
	


	public NString getCurrUpdConc212() {
		return toStr(super.getValue("CURR_UPD_CONC212"));
	}
	
	public void setCurrUpdConc212(NString value) {
		super.setValue("CURR_UPD_CONC212", value);
	}
	


	public NString getCurrUpdConc213() {
		return toStr(super.getValue("CURR_UPD_CONC213"));
	}
	
	public void setCurrUpdConc213(NString value) {
		super.setValue("CURR_UPD_CONC213", value);
	}
	


	public NString getCurrUpdConc221() {
		return toStr(super.getValue("CURR_UPD_CONC221"));
	}
	
	public void setCurrUpdConc221(NString value) {
		super.setValue("CURR_UPD_CONC221", value);
	}
	


	public NString getCurrUpdConc222() {
		return toStr(super.getValue("CURR_UPD_CONC222"));
	}
	
	public void setCurrUpdConc222(NString value) {
		super.setValue("CURR_UPD_CONC222", value);
	}
	


	public NString getCurrUpdConc223() {
		return toStr(super.getValue("CURR_UPD_CONC223"));
	}
	
	public void setCurrUpdConc223(NString value) {
		super.setValue("CURR_UPD_CONC223", value);
	}
	


	public NString getCurrUpdMinr11() {
		return toStr(super.getValue("CURR_UPD_MINR11"));
	}
	
	public void setCurrUpdMinr11(NString value) {
		super.setValue("CURR_UPD_MINR11", value);
	}
	


	public NString getCurrUpdMinr12() {
		return toStr(super.getValue("CURR_UPD_MINR12"));
	}
	
	public void setCurrUpdMinr12(NString value) {
		super.setValue("CURR_UPD_MINR12", value);
	}
	


	public NString getCurrUpdMinr21() {
		return toStr(super.getValue("CURR_UPD_MINR21"));
	}
	
	public void setCurrUpdMinr21(NString value) {
		super.setValue("CURR_UPD_MINR21", value);
	}
	


	public NString getCurrUpdMinr22() {
		return toStr(super.getValue("CURR_UPD_MINR22"));
	}
	
	public void setCurrUpdMinr22(NString value) {
		super.setValue("CURR_UPD_MINR22", value);
	}
	


	public NString getCemMsg() {
		return toStr(super.getValue("CEM_MSG"));
	}
	
	public void setCemMsg(NString value) {
		super.setValue("CEM_MSG", value);
	}
	


	public NString getCurrUpdBase1() {
		return toStr(super.getValue("CURR_UPD_BASE1"));
	}
	
	public void setCurrUpdBase1(NString value) {
		super.setValue("CURR_UPD_BASE1", value);
	}
	


	public NString getCurrUpdBase2() {
		return toStr(super.getValue("CURR_UPD_BASE2"));
	}
	
	public void setCurrUpdBase2(NString value) {
		super.setValue("CURR_UPD_BASE2", value);
	}
	


	public NString getCurrUpdMajr11() {
		return toStr(super.getValue("CURR_UPD_MAJR11"));
	}
	
	public void setCurrUpdMajr11(NString value) {
		super.setValue("CURR_UPD_MAJR11", value);
	}
	


	public NString getCurrUpdMajr12() {
		return toStr(super.getValue("CURR_UPD_MAJR12"));
	}
	
	public void setCurrUpdMajr12(NString value) {
		super.setValue("CURR_UPD_MAJR12", value);
	}
	


	public NString getCurrUpdMajr21() {
		return toStr(super.getValue("CURR_UPD_MAJR21"));
	}
	
	public void setCurrUpdMajr21(NString value) {
		super.setValue("CURR_UPD_MAJR21", value);
	}
	


	public NString getCurrUpdMajr22() {
		return toStr(super.getValue("CURR_UPD_MAJR22"));
	}
	
	public void setCurrUpdMajr22(NString value) {
		super.setValue("CURR_UPD_MAJR22", value);
	}
	



}




