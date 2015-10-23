package net.hedtech.banner.finance.common.Foqolib.model;

import morphis.foundations.core.appsupportlib.model.SimpleBusinessObject;
import morphis.foundations.core.appsupportlib.model.configuration.SimpleBusinessObjectConfiguration;
import morphis.foundations.core.types.*;
import static morphis.foundations.core.types.Types.*;


public class OriginalCommodityDescBlock extends SimpleBusinessObject
{
	public OriginalCommodityDescBlock() {
		super();
	}

	public OriginalCommodityDescBlock(SimpleBusinessObjectConfiguration configuration, String name) {
		super(configuration, name);
	}
	

	



	public NString getOriginalCommodityDescItem() {
		return toStr(super.getValue("ORIGINAL_COMMODITY_DESC_ITEM"));
	}
	
	public void setOriginalCommodityDescItem(NString value) {
		super.setValue("ORIGINAL_COMMODITY_DESC_ITEM", value);
	}
	



}




