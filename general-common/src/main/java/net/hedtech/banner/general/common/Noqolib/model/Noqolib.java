package net.hedtech.banner.general.common.Noqolib.model;

import morphis.foundations.core.appsupportlib.model.SimpleBusinessObject;
import morphis.foundations.core.appsupportlib.model.configuration.SimpleBusinessObjectConfiguration;
import morphis.foundations.core.types.*;
import static morphis.foundations.core.types.Types.*;


public class Noqolib extends SimpleBusinessObject
{
	public Noqolib() {
		super();
	}

	public Noqolib(SimpleBusinessObjectConfiguration configuration, String name) {
		super(configuration, name);
	}
	

	



	public NString getNAcciCode() {
		return toStr(super.getValue("N$_ACCI_CODE"));
	}
	
	public void setNAcciCode(NString value) {
		super.setValue("N$_ACCI_CODE", value);
	}
	


	public NString getNAcciFundCode() {
		return toStr(super.getValue("N$_ACCI_FUND_CODE"));
	}
	
	public void setNAcciFundCode(NString value) {
		super.setValue("N$_ACCI_FUND_CODE", value);
	}
	


	public NString getNAcciOrgnCode() {
		return toStr(super.getValue("N$_ACCI_ORGN_CODE"));
	}
	
	public void setNAcciOrgnCode(NString value) {
		super.setValue("N$_ACCI_ORGN_CODE", value);
	}
	


	public NString getNAcciAcctCode() {
		return toStr(super.getValue("N$_ACCI_ACCT_CODE"));
	}
	
	public void setNAcciAcctCode(NString value) {
		super.setValue("N$_ACCI_ACCT_CODE", value);
	}
	


	public NString getNAcciProgCode() {
		return toStr(super.getValue("N$_ACCI_PROG_CODE"));
	}
	
	public void setNAcciProgCode(NString value) {
		super.setValue("N$_ACCI_PROG_CODE", value);
	}
	


	public NString getNAcciActvCode() {
		return toStr(super.getValue("N$_ACCI_ACTV_CODE"));
	}
	
	public void setNAcciActvCode(NString value) {
		super.setValue("N$_ACCI_ACTV_CODE", value);
	}
	


	public NString getNAcciLocnCode() {
		return toStr(super.getValue("N$_ACCI_LOCN_CODE"));
	}
	
	public void setNAcciLocnCode(NString value) {
		super.setValue("N$_ACCI_LOCN_CODE", value);
	}
	


	public NString getNAcciFundOver() {
		return toStr(super.getValue("N$_ACCI_FUND_OVER"));
	}
	
	public void setNAcciFundOver(NString value) {
		super.setValue("N$_ACCI_FUND_OVER", value);
	}
	


	public NString getNAcciOrgnOver() {
		return toStr(super.getValue("N$_ACCI_ORGN_OVER"));
	}
	
	public void setNAcciOrgnOver(NString value) {
		super.setValue("N$_ACCI_ORGN_OVER", value);
	}
	


	public NString getNAcciAcctOver() {
		return toStr(super.getValue("N$_ACCI_ACCT_OVER"));
	}
	
	public void setNAcciAcctOver(NString value) {
		super.setValue("N$_ACCI_ACCT_OVER", value);
	}
	


	public NString getNAcciProgOver() {
		return toStr(super.getValue("N$_ACCI_PROG_OVER"));
	}
	
	public void setNAcciProgOver(NString value) {
		super.setValue("N$_ACCI_PROG_OVER", value);
	}
	


	public NString getNAcciActvOver() {
		return toStr(super.getValue("N$_ACCI_ACTV_OVER"));
	}
	
	public void setNAcciActvOver(NString value) {
		super.setValue("N$_ACCI_ACTV_OVER", value);
	}
	


	public NString getNAcciLocnOver() {
		return toStr(super.getValue("N$_ACCI_LOCN_OVER"));
	}
	
	public void setNAcciLocnOver(NString value) {
		super.setValue("N$_ACCI_LOCN_OVER", value);
	}
	


	public NString getNFoapalField() {
		return toStr(super.getValue("N$_FOAPAL_FIELD"));
	}
	
	public void setNFoapalField(NString value) {
		super.setValue("N$_FOAPAL_FIELD", value);
	}
	



}




