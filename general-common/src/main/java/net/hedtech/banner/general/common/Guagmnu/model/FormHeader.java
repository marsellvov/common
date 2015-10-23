package net.hedtech.banner.general.common.Guagmnu.model;

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
	

	



	public NString getCurrentInstitution() {
		return toStr(super.getValue("CURRENT_INSTITUTION"));
	}
	
	public void setCurrentInstitution(NString value) {
		super.setValue("CURRENT_INSTITUTION", value);
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
	


	public NNumber getCurrentLevel() {
		return toNumber(super.getValue("CURRENT_LEVEL"));
	}
	
	public void setCurrentLevel(NNumber value) {
		super.setValue("CURRENT_LEVEL", value);
	}
	


	public NString getAlertMsg() {
		return toStr(super.getValue("ALERT_MSG"));
	}
	
	public void setAlertMsg(NString value) {
		super.setValue("ALERT_MSG", value);
	}
	


	public NString getPopTempsInd() {
		return toStr(super.getValue("POP_TEMPS_IND"));
	}
	
	public void setPopTempsInd(NString value) {
		super.setValue("POP_TEMPS_IND", value);
	}
	


	public NString getTreePop() {
		return toStr(super.getValue("TREE_POP"));
	}
	
	public void setTreePop(NString value) {
		super.setValue("TREE_POP", value);
	}
	


	public NString getBpPop() {
		return toStr(super.getValue("BP_POP"));
	}
	
	public void setBpPop(NString value) {
		super.setValue("BP_POP", value);
	}
	


	public NString getGeneralInstalledInd() {
		return toStr(super.getValue("GENERAL_INSTALLED_IND"));
	}
	
	public void setGeneralInstalledInd(NString value) {
		super.setValue("GENERAL_INSTALLED_IND", value);
	}
	


	public NString getBxsInstalledInd() {
		return toStr(super.getValue("BXS_INSTALLED_IND"));
	}
	
	public void setBxsInstalledInd(NString value) {
		super.setValue("BXS_INSTALLED_IND", value);
	}
	


	public NString getStudentInstalledInd() {
		return toStr(super.getValue("STUDENT_INSTALLED_IND"));
	}
	
	public void setStudentInstalledInd(NString value) {
		super.setValue("STUDENT_INSTALLED_IND", value);
	}
	


	public NString getAlumniInstalledInd() {
		return toStr(super.getValue("ALUMNI_INSTALLED_IND"));
	}
	
	public void setAlumniInstalledInd(NString value) {
		super.setValue("ALUMNI_INSTALLED_IND", value);
	}
	


	public NString getFinanceInstalledInd() {
		return toStr(super.getValue("FINANCE_INSTALLED_IND"));
	}
	
	public void setFinanceInstalledInd(NString value) {
		super.setValue("FINANCE_INSTALLED_IND", value);
	}
	


	public NString getFinaidInstalledInd() {
		return toStr(super.getValue("FINAID_INSTALLED_IND"));
	}
	
	public void setFinaidInstalledInd(NString value) {
		super.setValue("FINAID_INSTALLED_IND", value);
	}
	


	public NString getHumanreInstalledInd() {
		return toStr(super.getValue("HUMANRE_INSTALLED_IND"));
	}
	
	public void setHumanreInstalledInd(NString value) {
		super.setValue("HUMANRE_INSTALLED_IND", value);
	}
	


	public NString getArInstalledInd() {
		return toStr(super.getValue("AR_INSTALLED_IND"));
	}
	
	public void setArInstalledInd(NString value) {
		super.setValue("AR_INSTALLED_IND", value);
	}
	


	public NString getPosbudInstalledInd() {
		return toStr(super.getValue("POSBUD_INSTALLED_IND"));
	}
	
	public void setPosbudInstalledInd(NString value) {
		super.setValue("POSBUD_INSTALLED_IND", value);
	}
	


	public NString getMenuToExpand() {
		return toStr(super.getValue("MENU_TO_EXPAND"));
	}
	
	public void setMenuToExpand(NString value) {
		super.setValue("MENU_TO_EXPAND", value);
	}
	


	public NNumber getMenuToExpandLevel() {
		return toNumber(super.getValue("MENU_TO_EXPAND_LEVEL"));
	}
	
	public void setMenuToExpandLevel(NNumber value) {
		super.setValue("MENU_TO_EXPAND_LEVEL", value);
	}
	


	public NString getLastSeq() {
		return toStr(super.getValue("LAST_SEQ"));
	}
	
	public void setLastSeq(NString value) {
		super.setValue("LAST_SEQ", value);
	}
	


	public NString getWelcomeUser() {
		return toStr(super.getValue("WELCOME_USER"));
	}
	
	public void setWelcomeUser(NString value) {
		super.setValue("WELCOME_USER", value);
	}
	


	public NString getGreenDataBar1() {
		return toStr(super.getValue("GREEN_DATA_BAR_1"));
	}
	
	public void setGreenDataBar1(NString value) {
		super.setValue("GREEN_DATA_BAR_1", value);
	}
	


	public NString getGrayDataBar1() {
		return toStr(super.getValue("GRAY_DATA_BAR_1"));
	}
	
	public void setGrayDataBar1(NString value) {
		super.setValue("GRAY_DATA_BAR_1", value);
	}
	


	public NString getGreenDataBar2() {
		return toStr(super.getValue("GREEN_DATA_BAR_2"));
	}
	
	public void setGreenDataBar2(NString value) {
		super.setValue("GREEN_DATA_BAR_2", value);
	}
	


	public NString getGrayDataBar2() {
		return toStr(super.getValue("GRAY_DATA_BAR_2"));
	}
	
	public void setGrayDataBar2(NString value) {
		super.setValue("GRAY_DATA_BAR_2", value);
	}
	


	public NString getGreenDataBar3() {
		return toStr(super.getValue("GREEN_DATA_BAR_3"));
	}
	
	public void setGreenDataBar3(NString value) {
		super.setValue("GREEN_DATA_BAR_3", value);
	}
	


	public NString getGrayDataBar3() {
		return toStr(super.getValue("GRAY_DATA_BAR_3"));
	}
	
	public void setGrayDataBar3(NString value) {
		super.setValue("GRAY_DATA_BAR_3", value);
	}
	



}




