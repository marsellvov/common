package net.hedtech.banner.general.common.Soaiden.model;

import morphis.foundations.core.appsupportlib.model.SimpleBusinessObject;
import morphis.foundations.core.appsupportlib.model.configuration.SimpleBusinessObjectConfiguration;
import morphis.foundations.core.types.*;
import static morphis.foundations.core.types.Types.*;


public class Soundex extends SimpleBusinessObject
{
	public Soundex() {
		super();
	}

	public Soundex(SimpleBusinessObjectConfiguration configuration, String name) {
		super(configuration, name);
	}
	

	



	public NString getSoundexLastName() {
		return toStr(super.getValue("SOUNDEX_LAST_NAME"));
	}
	
	public void setSoundexLastName(NString value) {
		super.setValue("SOUNDEX_LAST_NAME", value);
	}
	


	public NString getSoundexFirstName() {
		return toStr(super.getValue("SOUNDEX_FIRST_NAME"));
	}
	
	public void setSoundexFirstName(NString value) {
		super.setValue("SOUNDEX_FIRST_NAME", value);
	}
	



}




