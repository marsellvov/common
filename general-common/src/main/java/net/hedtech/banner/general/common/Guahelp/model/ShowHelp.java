package net.hedtech.banner.general.common.Guahelp.model;

import morphis.foundations.core.appsupportlib.model.SimpleBusinessObject;
import morphis.foundations.core.appsupportlib.model.configuration.SimpleBusinessObjectConfiguration;
import morphis.foundations.core.types.*;
import static morphis.foundations.core.types.Types.*;


public class ShowHelp extends SimpleBusinessObject
{
	public ShowHelp() {
		super();
	}

	public ShowHelp(SimpleBusinessObjectConfiguration configuration, String name) {
		super(configuration, name);
	}
	

	

	public void setHelpComment(NClob value){
		super.setValue("HELP_COMMENT", value.getValue());
	}


	public NClob getHelpComment(){
		NClob v = new NClob(super.getValue("HELP_COMMENT"));
		return v;
	}
	


	public NString getHelpInd() {
		return toStr(super.getValue("HELP_IND"));
	}
	
	public void setHelpInd(NString value) {
		super.setValue("HELP_IND", value);
	}
	


	public NString getHelpChg() {
		return toStr(super.getValue("HELP_CHG"));
	}
	
	public void setHelpChg(NString value) {
		super.setValue("HELP_CHG", value);
	}
	


	public NString getHoldComment() {
		return toStr(super.getValue("HOLD_COMMENT"));
	}
	
	public void setHoldComment(NString value) {
		super.setValue("HOLD_COMMENT", value);
	}
	



}




