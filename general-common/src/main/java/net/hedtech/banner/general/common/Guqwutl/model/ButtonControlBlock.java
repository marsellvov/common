package net.hedtech.banner.general.common.Guqwutl.model;

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
	

	



	public NString getGtvsysi1RollbackBtn() {
		return toStr(super.getValue("GTVSYSI_1_ROLLBACK_BTN"));
	}
	
	public void setGtvsysi1RollbackBtn(NString value) {
		super.setValue("GTVSYSI_1_ROLLBACK_BTN", value);
	}
	


	public NString getGtvsysi1SaveBtn() {
		return toStr(super.getValue("GTVSYSI_1_SAVE_BTN"));
	}
	
	public void setGtvsysi1SaveBtn(NString value) {
		super.setValue("GTVSYSI_1_SAVE_BTN", value);
	}
	


	public NString getGtvsysi1ExitBtn() {
		return toStr(super.getValue("GTVSYSI_1_EXIT_BTN"));
	}
	
	public void setGtvsysi1ExitBtn(NString value) {
		super.setValue("GTVSYSI_1_EXIT_BTN", value);
	}
	


	public NString getGtvsysi1ExitvalueBtn() {
		return toStr(super.getValue("GTVSYSI_1_EXITVALUE_BTN"));
	}
	
	public void setGtvsysi1ExitvalueBtn(NString value) {
		super.setValue("GTVSYSI_1_EXITVALUE_BTN", value);
	}
	



}




