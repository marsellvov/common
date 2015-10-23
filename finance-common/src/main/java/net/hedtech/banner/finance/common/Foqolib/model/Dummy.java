package net.hedtech.banner.finance.common.Foqolib.model;

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
	

	



	public NDate getFtvfundTmpX() {
		return toDate(super.getValue("FTVFUND_TMP_X"));
	}
	
	public void setFtvfundTmpX(NDate value) {
		super.setValue("FTVFUND_TMP_X", value);
	}
	


	public NString getFtvrsncTmpX() {
		return toStr(super.getValue("FTVRSNC_TMP_X"));
	}
	
	public void setFtvrsncTmpX(NString value) {
		super.setValue("FTVRSNC_TMP_X", value);
	}
	


	public NString getCancelReasonCode() {
		return toStr(super.getValue("CANCEL_REASON_CODE"));
	}
	
	public void setCancelReasonCode(NString value) {
		super.setValue("CANCEL_REASON_CODE", value);
	}
	



}




