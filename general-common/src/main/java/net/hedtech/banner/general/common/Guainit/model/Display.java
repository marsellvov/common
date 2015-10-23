package net.hedtech.banner.general.common.Guainit.model;

import morphis.foundations.flavors.forms.appsupportlib.model.SimpleBusinessObject;
import morphis.foundations.core.appsupportlib.model.configuration.SimpleBusinessObjectConfiguration;
import morphis.foundations.core.types.*;
import static morphis.foundations.core.types.Types.*;


public class Display extends SimpleBusinessObject
{
	public Display() {
		super();
	}

	public Display(SimpleBusinessObjectConfiguration configuration, String name) {
		super(configuration, name);
	}
	

	



	public NString getDesktop() {
		return toStr(super.getValue("DESKTOP"));
	}
	
	public void setDesktop(NString value) {
		super.setValue("DESKTOP", value);
	}
	


	public NString getLogoImage() {
		return toStr(super.getValue("LOGO_IMAGE"));
	}
	
	public void setLogoImage(NString value) {
		super.setValue("LOGO_IMAGE", value);
	}
	


	public NString getCurrentRelease() {
		return toStr(super.getValue("CURRENT_RELEASE"));
	}
	
	public void setCurrentRelease(NString value) {
		super.setValue("CURRENT_RELEASE", value);
	}
	


	public NString getStartupMenu() {
		return toStr(super.getValue("STARTUP_MENU"));
	}
	
	public void setStartupMenu(NString value) {
		super.setValue("STARTUP_MENU", value);
	}
	


	public NString getDateTime() {
		return toStr(super.getValue("DATE_TIME"));
	}
	
	public void setDateTime(NString value) {
		super.setValue("DATE_TIME", value);
	}
	


	public NInteger getTime1() {
		return toInt(super.getValue("TIME1"));
	}
	
	public void setTime1(NInteger value) {
		super.setValue("TIME1", value);
	}
	


	public NInteger getTime2() {
		return toInt(super.getValue("TIME2"));
	}
	
	public void setTime2(NInteger value) {
		super.setValue("TIME2", value);
	}
	


	public NInteger getTime3() {
		return toInt(super.getValue("TIME3"));
	}
	
	public void setTime3(NInteger value) {
		super.setValue("TIME3", value);
	}
	


	public NInteger getTime4() {
		return toInt(super.getValue("TIME4"));
	}
	
	public void setTime4(NInteger value) {
		super.setValue("TIME4", value);
	}
	



}




