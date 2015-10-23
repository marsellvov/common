package net.hedtech.banner.finance.common.Fragrnt.model;

import morphis.foundations.core.appsupportlib.model.SimpleBusinessObject;
import morphis.foundations.core.appsupportlib.model.configuration.SimpleBusinessObjectConfiguration;
import morphis.foundations.core.types.*;
import static morphis.foundations.core.types.Types.*;


public class CopyBlock extends SimpleBusinessObject
{
	public CopyBlock() {
		super();
	}

	public CopyBlock(SimpleBusinessObjectConfiguration configuration, String name) {
		super(configuration, name);
	}
	

	



	public NString getCopyGrntCode() {
		return toStr(super.getValue("COPY_GRNT_CODE"));
	}
	
	public void setCopyGrntCode(NString value) {
		super.setValue("COPY_GRNT_CODE", value);
	}
	



}




