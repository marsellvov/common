package net.hedtech.banner.general.common.Goamtch.model;

import morphis.foundations.core.appsupportlib.model.SimpleBusinessObject;
import morphis.foundations.core.appsupportlib.model.configuration.SimpleBusinessObjectConfiguration;
import morphis.foundations.core.types.*;
import static morphis.foundations.core.types.Types.*;


public class KeyBlock extends SimpleBusinessObject
{
	public KeyBlock() {
		super();
	}

	public KeyBlock(SimpleBusinessObjectConfiguration configuration, String name) {
		super(configuration, name);
	}
	

	



	public NString getId() {
		return toStr(super.getValue("ID"));
	}
	
	public void setId(NString value) {
		super.setValue("ID", value);
	}
	


	public NString getKeyblockSourceCode() {
		return toStr(super.getValue("KEYBLOCK_SOURCE_CODE"));
	}
	
	public void setKeyblockSourceCode(NString value) {
		super.setValue("KEYBLOCK_SOURCE_CODE", value);
	}
	


	public NString getKeyblockSourceDesc() {
		return toStr(super.getValue("KEYBLOCK_SOURCE_DESC"));
	}
	
	public void setKeyblockSourceDesc(NString value) {
		super.setValue("KEYBLOCK_SOURCE_DESC", value);
	}
	


	public NString getKeyblockSourceComment() {
		return toStr(super.getValue("KEYBLOCK_SOURCE_COMMENT"));
	}
	
	public void setKeyblockSourceComment(NString value) {
		super.setValue("KEYBLOCK_SOURCE_COMMENT", value);
	}
	


	public NString getKeyblockAtypCode() {
		return toStr(super.getValue("KEYBLOCK_ATYP_CODE"));
	}
	
	public void setKeyblockAtypCode(NString value) {
		super.setValue("KEYBLOCK_ATYP_CODE", value);
	}
	


	public NString getKeyblockEmalCode() {
		return toStr(super.getValue("KEYBLOCK_EMAL_CODE"));
	}
	
	public void setKeyblockEmalCode(NString value) {
		super.setValue("KEYBLOCK_EMAL_CODE", value);
	}
	


	public NString getKeyblockTeleCode() {
		return toStr(super.getValue("KEYBLOCK_TELE_CODE"));
	}
	
	public void setKeyblockTeleCode(NString value) {
		super.setValue("KEYBLOCK_TELE_CODE", value);
	}
	


	public NString getKeyblockEntityCde() {
		return toStr(super.getValue("KEYBLOCK_ENTITY_CDE"));
	}
	
	public void setKeyblockEntityCde(NString value) {
		super.setValue("KEYBLOCK_ENTITY_CDE", value);
	}
	


	public NString getKeyblockApiFailureInd() {
		return toStr(super.getValue("KEYBLOCK_API_FAILURE_IND"));
	}
	
	public void setKeyblockApiFailureInd(NString value) {
		super.setValue("KEYBLOCK_API_FAILURE_IND", value);
	}
	



}




