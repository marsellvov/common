package net.hedtech.banner.finance.common.Fragrnt.model;

import morphis.foundations.core.appsupportlib.model.SimpleBusinessObject;
import morphis.foundations.core.appsupportlib.model.configuration.SimpleBusinessObjectConfiguration;
import morphis.foundations.core.types.*;
import static morphis.foundations.core.types.Types.*;


public class Block5 extends SimpleBusinessObject
{
	public Block5() {
		super();
	}

	public Block5(SimpleBusinessObjectConfiguration configuration, String name) {
		super(configuration, name);
	}
	

	



	public NDate getTextItem99() {
		return toDate(super.getValue("TEXT_ITEM_99"));
	}
	
	public void setTextItem99(NDate value) {
		super.setValue("TEXT_ITEM_99", value);
	}
	


	public NString getFrbgrntOrgnCode() {
		return toStr(super.getValue("FRBGRNT_ORGN_CODE"));
	}
	
	public void setFrbgrntOrgnCode(NString value) {
		super.setValue("FRBGRNT_ORGN_CODE", value);
	}
	


	public NString getTextItem16() {
		return toStr(super.getValue("TEXT_ITEM16"));
	}
	
	public void setTextItem16(NString value) {
		super.setValue("TEXT_ITEM16", value);
	}
	



}




