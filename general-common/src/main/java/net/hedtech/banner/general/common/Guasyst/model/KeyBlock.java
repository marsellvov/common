package net.hedtech.banner.general.common.Guasyst.model;

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
	

	



	public NString getHrEmpl() {
		return toStr(super.getValue("HR_EMPL"));
	}
	
	public void setHrEmpl(NString value) {
		super.setValue("HR_EMPL", value);
	}
	


	public NString getHrBene() {
		return toStr(super.getValue("HR_BENE"));
	}
	
	public void setHrBene(NString value) {
		super.setValue("HR_BENE", value);
	}
	


	public NString getFinAgency() {
		return toStr(super.getValue("FIN_AGENCY"));
	}
	
	public void setFinAgency(NString value) {
		super.setValue("FIN_AGENCY", value);
	}
	


	public NString getFinBank() {
		return toStr(super.getValue("FIN_BANK"));
	}
	
	public void setFinBank(NString value) {
		super.setValue("FIN_BANK", value);
	}
	


	public NString getFinCust() {
		return toStr(super.getValue("FIN_CUST"));
	}
	
	public void setFinCust(NString value) {
		super.setValue("FIN_CUST", value);
	}
	


	public NString getFinEmpl() {
		return toStr(super.getValue("FIN_EMPL"));
	}
	
	public void setFinEmpl(NString value) {
		super.setValue("FIN_EMPL", value);
	}
	


	public NString getFinMagr() {
		return toStr(super.getValue("FIN_MAGR"));
	}
	
	public void setFinMagr(NString value) {
		super.setValue("FIN_MAGR", value);
	}
	


	public NString getAluConst() {
		return toStr(super.getValue("ALU_CONST"));
	}
	
	public void setAluConst(NString value) {
		super.setValue("ALU_CONST", value);
	}
	


	public NString getAdvIndivDonrCatg() {
		return toStr(super.getValue("ADV_INDIV_DONR_CATG"));
	}
	
	public void setAdvIndivDonrCatg(NString value) {
		super.setValue("ADV_INDIV_DONR_CATG", value);
	}
	


	public NString getAdvIndivPrefClas() {
		return toStr(super.getValue("ADV_INDIV_PREF_CLAS"));
	}
	
	public void setAdvIndivPrefClas(NString value) {
		super.setValue("ADV_INDIV_PREF_CLAS", value);
	}
	


	public NString getStdRecr() {
		return toStr(super.getValue("STD_RECR"));
	}
	
	public void setStdRecr(NString value) {
		super.setValue("STD_RECR", value);
	}
	


	public NString getStdAdm() {
		return toStr(super.getValue("STD_ADM"));
	}
	
	public void setStdAdm(NString value) {
		super.setValue("STD_ADM", value);
	}
	


	public NString getFinAidAppl() {
		return toStr(super.getValue("FIN_AID_APPL"));
	}
	
	public void setFinAidAppl(NString value) {
		super.setValue("FIN_AID_APPL", value);
	}
	


	public NString getStdGenr() {
		return toStr(super.getValue("STD_GENR"));
	}
	
	public void setStdGenr(NString value) {
		super.setValue("STD_GENR", value);
	}
	


	public NString getStdRegr() {
		return toStr(super.getValue("STD_REGR"));
	}
	
	public void setStdRegr(NString value) {
		super.setValue("STD_REGR", value);
	}
	


	public NString getStdTran() {
		return toStr(super.getValue("STD_TRAN"));
	}
	
	public void setStdTran(NString value) {
		super.setValue("STD_TRAN", value);
	}
	


	public NString getId() {
		return toStr(super.getValue("ID"));
	}
	
	public void setId(NString value) {
		super.setValue("ID", value);
	}
	


	public NString getNname() {
		return toStr(super.getValue("NAME"));
	}
	
	public void setNname(NString value) {
		super.setValue("NAME", value);
	}
	


	public NNumber getPidm() {
		return toNumber(super.getValue("PIDM"));
	}
	
	public void setPidm(NNumber value) {
		super.setValue("PIDM", value);
	}
	


	public NString getStdHous() {
		return toStr(super.getValue("STD_HOUS"));
	}
	
	public void setStdHous(NString value) {
		super.setValue("STD_HOUS", value);
	}
	


	public NString getAr() {
		return toStr(super.getValue("AR"));
	}
	
	public void setAr(NString value) {
		super.setValue("AR", value);
	}
	


	public NString getAluConstLit() {
		return toStr(super.getValue("ALU_CONST_LIT"));
	}
	
	public void setAluConstLit(NString value) {
		super.setValue("ALU_CONST_LIT", value);
	}
	


	public NString getAluOrgnLit() {
		return toStr(super.getValue("ALU_ORGN_LIT"));
	}
	
	public void setAluOrgnLit(NString value) {
		super.setValue("ALU_ORGN_LIT", value);
	}
	


	public NString getAluOrgn() {
		return toStr(super.getValue("ALU_ORGN"));
	}
	
	public void setAluOrgn(NString value) {
		super.setValue("ALU_ORGN", value);
	}
	


	public NString getAdvOrgnDonrCatg() {
		return toStr(super.getValue("ADV_ORGN_DONR_CATG"));
	}
	
	public void setAdvOrgnDonrCatg(NString value) {
		super.setValue("ADV_ORGN_DONR_CATG", value);
	}
	


	public NString getStdHeading() {
		return toStr(super.getValue("STD_HEADING"));
	}
	
	public void setStdHeading(NString value) {
		super.setValue("STD_HEADING", value);
	}
	


	public NString getHrHeading() {
		return toStr(super.getValue("HR_HEADING"));
	}
	
	public void setHrHeading(NString value) {
		super.setValue("HR_HEADING", value);
	}
	


	public NString getAluHeading() {
		return toStr(super.getValue("ALU_HEADING"));
	}
	
	public void setAluHeading(NString value) {
		super.setValue("ALU_HEADING", value);
	}
	


	public NString getFinAidHeading() {
		return toStr(super.getValue("FIN_AID_HEADING"));
	}
	
	public void setFinAidHeading(NString value) {
		super.setValue("FIN_AID_HEADING", value);
	}
	


	public NString getFinHeading() {
		return toStr(super.getValue("FIN_HEADING"));
	}
	
	public void setFinHeading(NString value) {
		super.setValue("FIN_HEADING", value);
	}
	


	public NString getArHeading1() {
		return toStr(super.getValue("AR_HEADING_1"));
	}
	
	public void setArHeading1(NString value) {
		super.setValue("AR_HEADING_1", value);
	}
	


	public NString getArHeading2() {
		return toStr(super.getValue("AR_HEADING_2"));
	}
	
	public void setArHeading2(NString value) {
		super.setValue("AR_HEADING_2", value);
	}
	


	public NString getFinVend() {
		return toStr(super.getValue("FIN_VEND"));
	}
	
	public void setFinVend(NString value) {
		super.setValue("FIN_VEND", value);
	}
	


	public NString getHrCobra() {
		return toStr(super.getValue("HR_COBRA"));
	}
	
	public void setHrCobra(NString value) {
		super.setValue("HR_COBRA", value);
	}
	


	public NString getStdFacu() {
		return toStr(super.getValue("STD_FACU"));
	}
	
	public void setStdFacu(NString value) {
		super.setValue("STD_FACU", value);
	}
	


	public NString getFinAidApplLit() {
		return toStr(super.getValue("FIN_AID_APPL_LIT"));
	}
	
	public void setFinAidApplLit(NString value) {
		super.setValue("FIN_AID_APPL_LIT", value);
	}
	


	public NString getHrEmplLit() {
		return toStr(super.getValue("HR_EMPL_LIT"));
	}
	
	public void setHrEmplLit(NString value) {
		super.setValue("HR_EMPL_LIT", value);
	}
	


	public NString getHrBeneLit() {
		return toStr(super.getValue("HR_BENE_LIT"));
	}
	
	public void setHrBeneLit(NString value) {
		super.setValue("HR_BENE_LIT", value);
	}
	


	public NString getHrCobraLit() {
		return toStr(super.getValue("HR_COBRA_LIT"));
	}
	
	public void setHrCobraLit(NString value) {
		super.setValue("HR_COBRA_LIT", value);
	}
	


	public NString getFinAgencyLit() {
		return toStr(super.getValue("FIN_AGENCY_LIT"));
	}
	
	public void setFinAgencyLit(NString value) {
		super.setValue("FIN_AGENCY_LIT", value);
	}
	


	public NString getFinBankLit() {
		return toStr(super.getValue("FIN_BANK_LIT"));
	}
	
	public void setFinBankLit(NString value) {
		super.setValue("FIN_BANK_LIT", value);
	}
	


	public NString getFinCustLit() {
		return toStr(super.getValue("FIN_CUST_LIT"));
	}
	
	public void setFinCustLit(NString value) {
		super.setValue("FIN_CUST_LIT", value);
	}
	


	public NString getFinEmplLit() {
		return toStr(super.getValue("FIN_EMPL_LIT"));
	}
	
	public void setFinEmplLit(NString value) {
		super.setValue("FIN_EMPL_LIT", value);
	}
	


	public NString getFinMagrLit() {
		return toStr(super.getValue("FIN_MAGR_LIT"));
	}
	
	public void setFinMagrLit(NString value) {
		super.setValue("FIN_MAGR_LIT", value);
	}
	


	public NString getFinVendLit() {
		return toStr(super.getValue("FIN_VEND_LIT"));
	}
	
	public void setFinVendLit(NString value) {
		super.setValue("FIN_VEND_LIT", value);
	}
	


	public NString getStdRecrLit() {
		return toStr(super.getValue("STD_RECR_LIT"));
	}
	
	public void setStdRecrLit(NString value) {
		super.setValue("STD_RECR_LIT", value);
	}
	


	public NString getStdAdmLit() {
		return toStr(super.getValue("STD_ADM_LIT"));
	}
	
	public void setStdAdmLit(NString value) {
		super.setValue("STD_ADM_LIT", value);
	}
	


	public NString getStdTranLit() {
		return toStr(super.getValue("STD_TRAN_LIT"));
	}
	
	public void setStdTranLit(NString value) {
		super.setValue("STD_TRAN_LIT", value);
	}
	


	public NString getStdGenrLit() {
		return toStr(super.getValue("STD_GENR_LIT"));
	}
	
	public void setStdGenrLit(NString value) {
		super.setValue("STD_GENR_LIT", value);
	}
	


	public NString getStdRegrLit() {
		return toStr(super.getValue("STD_REGR_LIT"));
	}
	
	public void setStdRegrLit(NString value) {
		super.setValue("STD_REGR_LIT", value);
	}
	


	public NString getStdHousLit() {
		return toStr(super.getValue("STD_HOUS_LIT"));
	}
	
	public void setStdHousLit(NString value) {
		super.setValue("STD_HOUS_LIT", value);
	}
	


	public NString getStdFacuLit() {
		return toStr(super.getValue("STD_FACU_LIT"));
	}
	
	public void setStdFacuLit(NString value) {
		super.setValue("STD_FACU_LIT", value);
	}
	


	public NString getHrAppl() {
		return toStr(super.getValue("HR_APPL"));
	}
	
	public void setHrAppl(NString value) {
		super.setValue("HR_APPL", value);
	}
	


	public NString getHrApplLit() {
		return toStr(super.getValue("HR_APPL_LIT"));
	}
	
	public void setHrApplLit(NString value) {
		super.setValue("HR_APPL_LIT", value);
	}
	


	public NString getCourtJudgeLit() {
		return toStr(super.getValue("COURT_JUDGE_LIT"));
	}
	
	public void setCourtJudgeLit(NString value) {
		super.setValue("COURT_JUDGE_LIT", value);
	}
	


	public NString getCourtLitigantLit() {
		return toStr(super.getValue("COURT_LITIGANT_LIT"));
	}
	
	public void setCourtLitigantLit(NString value) {
		super.setValue("COURT_LITIGANT_LIT", value);
	}
	


	public NString getCourtAttorneyLit() {
		return toStr(super.getValue("COURT_ATTORNEY_LIT"));
	}
	
	public void setCourtAttorneyLit(NString value) {
		super.setValue("COURT_ATTORNEY_LIT", value);
	}
	


	public NString getHoldPtypCode() {
		return toStr(super.getValue("HOLD_PTYP_CODE"));
	}
	
	public void setHoldPtypCode(NString value) {
		super.setValue("HOLD_PTYP_CODE", value);
	}
	


	public NString getConfidMsg() {
		return toStr(super.getValue("CONFID_MSG"));
	}
	
	public void setConfidMsg(NString value) {
		super.setValue("CONFID_MSG", value);
	}
	


	public NString getDcsdMsg() {
		return toStr(super.getValue("DCSD_MSG"));
	}
	
	public void setDcsdMsg(NString value) {
		super.setValue("DCSD_MSG", value);
	}
	



}




