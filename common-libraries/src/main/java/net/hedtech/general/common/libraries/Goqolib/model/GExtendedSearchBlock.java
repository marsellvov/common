package net.hedtech.general.common.libraries.Goqolib.model;

import morphis.foundations.flavors.forms.appsupportlib.model.SimpleBusinessObject;
import morphis.foundations.core.appsupportlib.model.configuration.SimpleBusinessObjectConfiguration;
import morphis.foundations.core.types.*;
import static morphis.foundations.core.types.Types.*;


public class GExtendedSearchBlock extends SimpleBusinessObject
{
	public GExtendedSearchBlock() {
		super();
	}

	public GExtendedSearchBlock(SimpleBusinessObjectConfiguration configuration, String name) {
		super(configuration, name);
	}
	

	



	public NString getIdnameExtsearchList() {
		return toStr(super.getValue("IDNAME_EXTSEARCH_LIST"));
	}
	
	public void setIdnameExtsearchList(NString value) {
		super.setValue("IDNAME_EXTSEARCH_LIST", value);
	}
	


	public NString getSearchGroup() {
		return toStr(super.getValue("SEARCH_GROUP"));
	}
	
	public void setSearchGroup(NString value) {
		super.setValue("SEARCH_GROUP", value);
	}
	


	public NString getSrSpraddrCity() {
		return toStr(super.getValue("SR_SPRADDR_CITY"));
	}
	
	public void setSrSpraddrCity(NString value) {
		super.setValue("SR_SPRADDR_CITY", value);
	}
	


	public NString getSrSpraddrStatCode() {
		return toStr(super.getValue("SR_SPRADDR_STAT_CODE"));
	}
	
	public void setSrSpraddrStatCode(NString value) {
		super.setValue("SR_SPRADDR_STAT_CODE", value);
	}
	


	public NString getSrSpraddrZip() {
		return toStr(super.getValue("SR_SPRADDR_ZIP"));
	}
	
	public void setSrSpraddrZip(NString value) {
		super.setValue("SR_SPRADDR_ZIP", value);
	}
	


	public NString getSrSpridenNtypCode() {
		return toStr(super.getValue("SR_SPRIDEN_NTYP_CODE"));
	}
	
	public void setSrSpridenNtypCode(NString value) {
		super.setValue("SR_SPRIDEN_NTYP_CODE", value);
	}
	


	public NString getSrSpbpersSsn() {
		return toStr(super.getValue("SR_SPBPERS_SSN"));
	}
	
	public void setSrSpbpersSsn(NString value) {
		super.setValue("SR_SPBPERS_SSN", value);
	}
	


	public NString getSrSpbpersBirthDate() {
		return toStr(super.getValue("SR_SPBPERS_BIRTH_DATE"));
	}
	
	public void setSrSpbpersBirthDate(NString value) {
		super.setValue("SR_SPBPERS_BIRTH_DATE", value);
	}
	


	public NString getSrSpbpersSex() {
		return toStr(super.getValue("SR_SPBPERS_SEX"));
	}
	
	public void setSrSpbpersSex(NString value) {
		super.setValue("SR_SPBPERS_SEX", value);
	}
	


	public NNumber getExtsearchCount() {
		return toNumber(super.getValue("EXTSEARCH_COUNT"));
	}
	
	public void setExtsearchCount(NNumber value) {
		super.setValue("EXTSEARCH_COUNT", value);
	}
	



}




