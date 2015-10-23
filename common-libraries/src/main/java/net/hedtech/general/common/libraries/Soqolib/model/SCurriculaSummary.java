package net.hedtech.general.common.libraries.Soqolib.model;

import morphis.foundations.core.appsupportlib.model.SimpleBusinessObject;
import morphis.foundations.core.appsupportlib.model.configuration.SimpleBusinessObjectConfiguration;
import morphis.foundations.core.types.*;
import static morphis.foundations.core.types.Types.*;


public class SCurriculaSummary extends SimpleBusinessObject
{
	public SCurriculaSummary() {
		super();
	}

	public SCurriculaSummary(SimpleBusinessObjectConfiguration configuration, String name) {
		super(configuration, name);
	}
	

	



	public NString getQuerySummary() {
		return toStr(super.getValue("QUERY_SUMMARY"));
	}
	
	public void setQuerySummary(NString value) {
		super.setValue("QUERY_SUMMARY", value);
	}
	


	public NString getPrimaryRowid() {
		return toStr(super.getValue("PRIMARY_ROWID"));
	}
	
	public void setPrimaryRowid(NString value) {
		super.setValue("PRIMARY_ROWID", value);
	}
	


	public NString getSecondaryRowid() {
		return toStr(super.getValue("SECONDARY_ROWID"));
	}
	
	public void setSecondaryRowid(NString value) {
		super.setValue("SECONDARY_ROWID", value);
	}
	


	public NString getReturnFromSovlcur() {
		return toStr(super.getValue("RETURN_FROM_SOVLCUR"));
	}
	
	public void setReturnFromSovlcur(NString value) {
		super.setValue("RETURN_FROM_SOVLCUR", value);
	}
	


	public NString getSummaryEndTerm() {
		return toStr(super.getValue("SUMMARY_END_TERM"));
	}
	
	public void setSummaryEndTerm(NString value) {
		super.setValue("SUMMARY_END_TERM", value);
	}
	


	public NNumber getSummaryKeySeqno() {
		return toNumber(super.getValue("SUMMARY_KEY_SEQNO"));
	}
	
	public void setSummaryKeySeqno(NNumber value) {
		super.setValue("SUMMARY_KEY_SEQNO", value);
	}
	


	public NString getSummaryTermCode() {
		return toStr(super.getValue("SUMMARY_TERM_CODE"));
	}
	
	public void setSummaryTermCode(NString value) {
		super.setValue("SUMMARY_TERM_CODE", value);
	}
	


	public NString getSummaryCode() {
		return toStr(super.getValue("SUMMARY_CODE"));
	}
	
	public void setSummaryCode(NString value) {
		super.setValue("SUMMARY_CODE", value);
	}
	


	public NNumber getSummaryPidm() {
		return toNumber(super.getValue("SUMMARY_PIDM"));
	}
	
	public void setSummaryPidm(NNumber value) {
		super.setValue("SUMMARY_PIDM", value);
	}
	


	public NString getDataSeparatorLineSovlcur1() {
		return toStr(super.getValue("DATA_SEPARATOR_LINE_SOVLCUR_1"));
	}
	
	public void setDataSeparatorLineSovlcur1(NString value) {
		super.setValue("DATA_SEPARATOR_LINE_SOVLCUR_1", value);
	}
	



}




