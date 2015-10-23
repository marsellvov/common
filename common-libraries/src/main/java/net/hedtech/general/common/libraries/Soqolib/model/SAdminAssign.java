package net.hedtech.general.common.libraries.Soqolib.model;

import morphis.foundations.core.appsupportlib.model.SimpleBusinessObject;
import morphis.foundations.core.appsupportlib.model.configuration.SimpleBusinessObjectConfiguration;
import morphis.foundations.core.types.*;
import static morphis.foundations.core.types.Types.*;


public class SAdminAssign extends SimpleBusinessObject
{
	public SAdminAssign() {
		super();
	}

	public SAdminAssign(SimpleBusinessObjectConfiguration configuration, String name) {
		super(configuration, name);
	}
	

	



	public NString getSorainfDeleteInd() {
		return toStr(super.getValue("SORAINF_DELETE_IND"));
	}
	
	public void setSorainfDeleteInd(NString value) {
		super.setValue("SORAINF_DELETE_IND", value);
	}
	


	public NString getSorainfReturnItem() {
		return toStr(super.getValue("SORAINF_RETURN_ITEM"));
	}
	
	public void setSorainfReturnItem(NString value) {
		super.setValue("SORAINF_RETURN_ITEM", value);
	}
	


	public NString getSorainfReturnObject() {
		return toStr(super.getValue("SORAINF_RETURN_OBJECT"));
	}
	
	public void setSorainfReturnObject(NString value) {
		super.setValue("SORAINF_RETURN_OBJECT", value);
	}
	


	public NString getCallAdmin() {
		return toStr(super.getValue("CALL_ADMIN"));
	}
	
	public void setCallAdmin(NString value) {
		super.setValue("CALL_ADMIN", value);
	}
	


	public NString getAdminAssignModule() {
		return toStr(super.getValue("ADMIN_ASSIGN_MODULE"));
	}
	
	public void setAdminAssignModule(NString value) {
		super.setValue("ADMIN_ASSIGN_MODULE", value);
	}
	


	public NNumber getAdminAssignSeqno() {
		return toNumber(super.getValue("ADMIN_ASSIGN_SEQNO"));
	}
	
	public void setAdminAssignSeqno(NNumber value) {
		super.setValue("ADMIN_ASSIGN_SEQNO", value);
	}
	


	public NString getAdminAssignTermCode() {
		return toStr(super.getValue("ADMIN_ASSIGN_TERM_CODE"));
	}
	
	public void setAdminAssignTermCode(NString value) {
		super.setValue("ADMIN_ASSIGN_TERM_CODE", value);
	}
	


	public NString getAdminQueryMode() {
		return toStr(super.getValue("ADMIN_QUERY_MODE"));
	}
	
	public void setAdminQueryMode(NString value) {
		super.setValue("ADMIN_QUERY_MODE", value);
	}
	


	public NNumber getAdminPidm() {
		return toNumber(super.getValue("ADMIN_PIDM"));
	}
	
	public void setAdminPidm(NNumber value) {
		super.setValue("ADMIN_PIDM", value);
	}
	


	public NString getAdminCommitInd() {
		return toStr(super.getValue("ADMIN_COMMIT_IND"));
	}
	
	public void setAdminCommitInd(NString value) {
		super.setValue("ADMIN_COMMIT_IND", value);
	}
	


	public NString getAdminAssignSaveField() {
		return toStr(super.getValue("ADMIN_ASSIGN_SAVE_FIELD"));
	}
	
	public void setAdminAssignSaveField(NString value) {
		super.setValue("ADMIN_ASSIGN_SAVE_FIELD", value);
	}
	


	public NString getAdminAssignOptionInd() {
		return toStr(super.getValue("ADMIN_ASSIGN_OPTION_IND"));
	}
	
	public void setAdminAssignOptionInd(NString value) {
		super.setValue("ADMIN_ASSIGN_OPTION_IND", value);
	}
	


	public NString getDataSeparatorLine() {
		return toStr(super.getValue("DATA_SEPARATOR_LINE"));
	}
	
	public void setDataSeparatorLine(NString value) {
		super.setValue("DATA_SEPARATOR_LINE", value);
	}
	



}




