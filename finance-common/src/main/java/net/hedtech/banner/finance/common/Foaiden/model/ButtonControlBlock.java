package net.hedtech.banner.finance.common.Foaiden.model;

import morphis.foundations.core.appsupportlib.model.SimpleBusinessObject;
import morphis.foundations.core.appsupportlib.model.configuration.SimpleBusinessObjectConfiguration;
import morphis.foundations.core.types.*;
import static morphis.foundations.core.types.Types.*;


public class ButtonControlBlock extends SimpleBusinessObject
{
	public ButtonControlBlock() {
		super();
	}

	public ButtonControlBlock(SimpleBusinessObjectConfiguration configuration, String name) {
		super(configuration, name);
	}
	

	



	public NString getAddressBtn() {
		return toStr(super.getValue("ADDRESS_BTN"));
	}
	
	public void setAddressBtn(NString value) {
		super.setValue("ADDRESS_BTN", value);
	}
	


	public NString getPreviousNameBtn() {
		return toStr(super.getValue("PREVIOUS_NAME_BTN"));
	}
	
	public void setPreviousNameBtn(NString value) {
		super.setValue("PREVIOUS_NAME_BTN", value);
	}
	


	public NString getSourceBtn() {
		return toStr(super.getValue("SOURCE_BTN"));
	}
	
	public void setSourceBtn(NString value) {
		super.setValue("SOURCE_BTN", value);
	}
	


	public NString getLegalNameRollbackBtn() {
		return toStr(super.getValue("LEGAL_NAME_ROLLBACK_BTN"));
	}
	
	public void setLegalNameRollbackBtn(NString value) {
		super.setValue("LEGAL_NAME_ROLLBACK_BTN", value);
	}
	


	public NString getLegalNameSaveBtn() {
		return toStr(super.getValue("LEGAL_NAME_SAVE_BTN"));
	}
	
	public void setLegalNameSaveBtn(NString value) {
		super.setValue("LEGAL_NAME_SAVE_BTN", value);
	}
	


	public NString getLegalNameExitBtn() {
		return toStr(super.getValue("LEGAL_NAME_EXIT_BTN"));
	}
	
	public void setLegalNameExitBtn(NString value) {
		super.setValue("LEGAL_NAME_EXIT_BTN", value);
	}
	


	public NString getPreviousSourceBtn() {
		return toStr(super.getValue("PREVIOUS_SOURCE_BTN"));
	}
	
	public void setPreviousSourceBtn(NString value) {
		super.setValue("PREVIOUS_SOURCE_BTN", value);
	}
	


	public NString getSpraddr6CancelBtn() {
		return toStr(super.getValue("SPRADDR_6_CANCEL_BTN"));
	}
	
	public void setSpraddr6CancelBtn(NString value) {
		super.setValue("SPRADDR_6_CANCEL_BTN", value);
	}
	


	public NString getSpraddr6SaveBtn() {
		return toStr(super.getValue("SPRADDR_6_SAVE_BTN"));
	}
	
	public void setSpraddr6SaveBtn(NString value) {
		super.setValue("SPRADDR_6_SAVE_BTN", value);
	}
	


	public NString getSpraddr6ExitBtn() {
		return toStr(super.getValue("SPRADDR_6_EXIT_BTN"));
	}
	
	public void setSpraddr6ExitBtn(NString value) {
		super.setValue("SPRADDR_6_EXIT_BTN", value);
	}
	


	public NString getSpraddr6RollbackBtn() {
		return toStr(super.getValue("SPRADDR_6_ROLLBACK_BTN"));
	}
	
	public void setSpraddr6RollbackBtn(NString value) {
		super.setValue("SPRADDR_6_ROLLBACK_BTN", value);
	}
	


	public NString getSpraddr5RollbackBtn() {
		return toStr(super.getValue("SPRADDR_5_ROLLBACK_BTN"));
	}
	
	public void setSpraddr5RollbackBtn(NString value) {
		super.setValue("SPRADDR_5_ROLLBACK_BTN", value);
	}
	


	public NString getSpraddr5SaveBtn() {
		return toStr(super.getValue("SPRADDR_5_SAVE_BTN"));
	}
	
	public void setSpraddr5SaveBtn(NString value) {
		super.setValue("SPRADDR_5_SAVE_BTN", value);
	}
	


	public NString getSpraddr5ExitBtn() {
		return toStr(super.getValue("SPRADDR_5_EXIT_BTN"));
	}
	
	public void setSpraddr5ExitBtn(NString value) {
		super.setValue("SPRADDR_5_EXIT_BTN", value);
	}
	


	public NString getSpridenCurrent1RollbackBtn() {
		return toStr(super.getValue("SPRIDEN_CURRENT_1_ROLLBACK_BTN"));
	}
	
	public void setSpridenCurrent1RollbackBtn(NString value) {
		super.setValue("SPRIDEN_CURRENT_1_ROLLBACK_BTN", value);
	}
	


	public NString getSpridenCurrent1ExitBtn() {
		return toStr(super.getValue("SPRIDEN_CURRENT_1_EXIT_BTN"));
	}
	
	public void setSpridenCurrent1ExitBtn(NString value) {
		super.setValue("SPRIDEN_CURRENT_1_EXIT_BTN", value);
	}
	


	public NString getSpridenCurrent2CancelBtn() {
		return toStr(super.getValue("SPRIDEN_CURRENT_2_CANCEL_BTN"));
	}
	
	public void setSpridenCurrent2CancelBtn(NString value) {
		super.setValue("SPRIDEN_CURRENT_2_CANCEL_BTN", value);
	}
	


	public NString getSpridenCurrent2RollbackBtn() {
		return toStr(super.getValue("SPRIDEN_CURRENT_2_ROLLBACK_BTN"));
	}
	
	public void setSpridenCurrent2RollbackBtn(NString value) {
		super.setValue("SPRIDEN_CURRENT_2_ROLLBACK_BTN", value);
	}
	


	public NString getSpridenCurrent2ExitBtn() {
		return toStr(super.getValue("SPRIDEN_CURRENT_2_EXIT_BTN"));
	}
	
	public void setSpridenCurrent2ExitBtn(NString value) {
		super.setValue("SPRIDEN_CURRENT_2_EXIT_BTN", value);
	}
	


	public NString getSpridenPrev4CancelBtn() {
		return toStr(super.getValue("SPRIDEN_PREV_4_CANCEL_BTN"));
	}
	
	public void setSpridenPrev4CancelBtn(NString value) {
		super.setValue("SPRIDEN_PREV_4_CANCEL_BTN", value);
	}
	


	public NString getSpridenPrev4RollbackBtn() {
		return toStr(super.getValue("SPRIDEN_PREV_4_ROLLBACK_BTN"));
	}
	
	public void setSpridenPrev4RollbackBtn(NString value) {
		super.setValue("SPRIDEN_PREV_4_ROLLBACK_BTN", value);
	}
	


	public NString getSpridenPrev4ExitBtn() {
		return toStr(super.getValue("SPRIDEN_PREV_4_EXIT_BTN"));
	}
	
	public void setSpridenPrev4ExitBtn(NString value) {
		super.setValue("SPRIDEN_PREV_4_EXIT_BTN", value);
	}
	


	public NString getSpridenPreviousRollbackBtn() {
		return toStr(super.getValue("SPRIDEN_PREVIOUS_ROLLBACK_BTN"));
	}
	
	public void setSpridenPreviousRollbackBtn(NString value) {
		super.setValue("SPRIDEN_PREVIOUS_ROLLBACK_BTN", value);
	}
	


	public NString getSpridenPreviousSaveBtn() {
		return toStr(super.getValue("SPRIDEN_PREVIOUS_SAVE_BTN"));
	}
	
	public void setSpridenPreviousSaveBtn(NString value) {
		super.setValue("SPRIDEN_PREVIOUS_SAVE_BTN", value);
	}
	


	public NString getSpridenPreviousExitBtn() {
		return toStr(super.getValue("SPRIDEN_PREVIOUS_EXIT_BTN"));
	}
	
	public void setSpridenPreviousExitBtn(NString value) {
		super.setValue("SPRIDEN_PREVIOUS_EXIT_BTN", value);
	}
	


	public NString getCheckKeys() {
		return toStr(super.getValue("CHECK_KEYS"));
	}
	
	public void setCheckKeys(NString value) {
		super.setValue("CHECK_KEYS", value);
	}
	


	public NString getSpridenCurrent1SaveBtn() {
		return toStr(super.getValue("SPRIDEN_CURRENT_1_SAVE_BTN"));
	}
	
	public void setSpridenCurrent1SaveBtn(NString value) {
		super.setValue("SPRIDEN_CURRENT_1_SAVE_BTN", value);
	}
	



}




