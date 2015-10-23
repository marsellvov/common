package net.hedtech.general.common.libraries.Soqolib.model;

import morphis.foundations.core.appsupportlib.model.SimpleBusinessObject;
import morphis.foundations.core.appsupportlib.model.configuration.SimpleBusinessObjectConfiguration;
import morphis.foundations.core.types.*;
import static morphis.foundations.core.types.Types.*;


public class SStudypath extends SimpleBusinessObject
{
	public SStudypath() {
		super();
	}

	public SStudypath(SimpleBusinessObjectConfiguration configuration, String name) {
		super(configuration, name);
	}
	

	



	public NString getQueryTerm() {
		return toStr(super.getValue("QUERY_TERM"));
	}
	
	public void setQueryTerm(NString value) {
		super.setValue("QUERY_TERM", value);
	}
	


	public NString getStudyPathSeparator1() {
		return toStr(super.getValue("STUDY_PATH_SEPARATOR_1"));
	}
	
	public void setStudyPathSeparator1(NString value) {
		super.setValue("STUDY_PATH_SEPARATOR_1", value);
	}
	


	public NString getRegInprogress() {
		return toStr(super.getValue("REG_INPROGRESS"));
	}
	
	public void setRegInprogress(NString value) {
		super.setValue("REG_INPROGRESS", value);
	}
	



}




