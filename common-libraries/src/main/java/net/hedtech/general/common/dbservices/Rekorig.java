package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Rekorig {
		public static NNumber fGetAmtDue(NString pAidyCode,NNumber pPidm,NString pAwardStatus) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKORIG.F_GET_AMT_DUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AWARD_STATUS", pAwardStatus);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fGetAwardSeqNo(NString pAidyCode,NNumber pPidm,NString pFundCode,NString pFedFundId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKORIG.F_GET_AWARD_SEQ_NO", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_FED_FUND_ID", pFedFundId);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetCampOpeid(NString pAidyCode,NNumber pPidm,NString pTermCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKORIG.F_GET_CAMP_OPEID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetCampPellId(NString pAidyCode,NNumber pPidm,NString pTermCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKORIG.F_GET_CAMP_PELL_ID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void fGetCampRec() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKORIG.F_GET_CAMP_REC", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static NString fGetCipCode(NString pAidyCode,NNumber pPidm,NString pFundCode,NString pTermCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKORIG.F_GET_CIP_CODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetCipCodeAdsb(NString pAidyCode,NNumber pPidm,NString pFundCode,NString pTermCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKORIG.F_GET_CIP_CODE_ADSB", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetCipCodeAtrm(NString pAidyCode,NNumber pPidm,NString pFundCode,NString pTermCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKORIG.F_GET_CIP_CODE_ATRM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetCipCodeMajr(NString pAidyCode,NNumber pPidm,NString pTermCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKORIG.F_GET_CIP_CODE_MAJR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetCipCodeMajr2(NString pAidyCode,NNumber pPidm,NString pTermCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKORIG.F_GET_CIP_CODE_MAJR2", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetEnrollmentDate(NNumber pPidm,NString pTermCode,NString pAttendingHrInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKORIG.F_GET_ENROLLMENT_DATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_ATTENDING_HR_IND", pAttendingHrInd);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetGrantType(NString pAidyCode,NString pFundCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKORIG.F_GET_GRANT_TYPE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void fGetHighSchoolData() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKORIG.F_GET_HIGH_SCHOOL_DATA", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static NString fGetInstOpeid(NString pAidyCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKORIG.F_GET_INST_OPEID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetInstOpeidBranch(NString pAidyCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKORIG.F_GET_INST_OPEID_BRANCH", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetInstPellId(NString pAidyCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKORIG.F_GET_INST_PELL_ID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void fGetInstRec() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKORIG.F_GET_INST_REC", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static NString fGetInstXref(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKORIG.F_GET_INST_XREF", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetMinTerm(NString pAidyCode,NNumber pPidm,NString pFundCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKORIG.F_GET_MIN_TERM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pGetGrantDefaults(NString pAidyCode,NNumber pPidm,NString pFundCode,Ref<GrantDefaultRecRow> pRecOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKORIG.P_GET_GRANT_DEFAULTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter(DbTypes.createStructType("P_REC_OUT", pRecOut.val,GrantDefaultRecRow.class));
				
			cmd.execute();
			pRecOut.val = cmd.getParameterValue("@P_REC_OUT", GrantDefaultRecRow.class);


		}
		
		public static void pGetPellDefaults(NString pAidyCode,NNumber pPidm,NString pAwardStatus,Ref<PellDefaultRecRow> pRecOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKORIG.P_GET_PELL_DEFAULTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AWARD_STATUS", pAwardStatus);
			cmd.addParameter(DbTypes.createStructType("P_REC_OUT", pRecOut.val,PellDefaultRecRow.class));
				
			cmd.execute();
			pRecOut.val = cmd.getParameterValue("@P_REC_OUT", PellDefaultRecRow.class);


		}
		
		public static void pGetRcrappxData(NString pAidyCode,NNumber pPidm,Ref<NString> pCurrentSsn,Ref<NDate> pCurrentBirthDate,Ref<NString> pCurrentLastName,Ref<NString> pCurrentFirstName,Ref<NString> pCurrentMi,Ref<NString> pYrInColl) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKORIG.P_GET_RCRAPPX_DATA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CURRENT_SSN", NString.class);
			cmd.addParameter("@P_CURRENT_BIRTH_DATE", NDate.class);
			cmd.addParameter("@P_CURRENT_LAST_NAME", NString.class);
			cmd.addParameter("@P_CURRENT_FIRST_NAME", NString.class);
			cmd.addParameter("@P_CURRENT_MI", NString.class);
			cmd.addParameter("@P_YR_IN_COLL", NString.class);
				
			cmd.execute();
			pCurrentSsn.val = cmd.getParameterValue("@P_CURRENT_SSN", NString.class);
			pCurrentBirthDate.val = cmd.getParameterValue("@P_CURRENT_BIRTH_DATE", NDate.class);
			pCurrentLastName.val = cmd.getParameterValue("@P_CURRENT_LAST_NAME", NString.class);
			pCurrentFirstName.val = cmd.getParameterValue("@P_CURRENT_FIRST_NAME", NString.class);
			pCurrentMi.val = cmd.getParameterValue("@P_CURRENT_MI", NString.class);
			pYrInColl.val = cmd.getParameterValue("@P_YR_IN_COLL", NString.class);


		}
		
		public static void pGetReborigAccept(NString pAidyCode,NNumber pPidm,NString pFundCode,Ref<NString> pAwardId,Ref<NString> pYrInColl,Ref<NString> pCampPellId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKORIG.P_GET_REBORIG_ACCEPT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_AWARD_ID", NString.class);
			cmd.addParameter("@P_YR_IN_COLL", NString.class);
			cmd.addParameter("@P_CAMP_PELL_ID", NString.class);
				
			cmd.execute();
			pAwardId.val = cmd.getParameterValue("@P_AWARD_ID", NString.class);
			pYrInColl.val = cmd.getParameterValue("@P_YR_IN_COLL", NString.class);
			pCampPellId.val = cmd.getParameterValue("@P_CAMP_PELL_ID", NString.class);


		}
		
		public static void pGetReborigCurrent(NString pAidyCode,NNumber pPidm,NString pFundCode,Ref<NString> pAwardAmount,Ref<NNumber> pIntSeqNo,Ref<NString> pYrInColl,Ref<NNumber> pPercentEligUsed,Ref<NString> pCipCode,Ref<NString> pPayReasonCde,Ref<NString> pHsProgramCode,Ref<NNumber> pYtdAmtPaid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKORIG.P_GET_REBORIG_CURRENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_AWARD_AMOUNT", NString.class);
			cmd.addParameter("@P_INT_SEQ_NO", NNumber.class);
			cmd.addParameter("@P_YR_IN_COLL", NString.class);
			cmd.addParameter("@P_PERCENT_ELIG_USED", NNumber.class);
			cmd.addParameter("@P_CIP_CODE", NString.class);
			cmd.addParameter("@P_PAY_REASON_CDE", NString.class);
			cmd.addParameter("@P_HS_PROGRAM_CODE", NString.class);
			cmd.addParameter("@P_YTD_AMT_PAID", NNumber.class);
				
			cmd.execute();
			pAwardAmount.val = cmd.getParameterValue("@P_AWARD_AMOUNT", NString.class);
			pIntSeqNo.val = cmd.getParameterValue("@P_INT_SEQ_NO", NNumber.class);
			pYrInColl.val = cmd.getParameterValue("@P_YR_IN_COLL", NString.class);
			pPercentEligUsed.val = cmd.getParameterValue("@P_PERCENT_ELIG_USED", NNumber.class);
			pCipCode.val = cmd.getParameterValue("@P_CIP_CODE", NString.class);
			pPayReasonCde.val = cmd.getParameterValue("@P_PAY_REASON_CDE", NString.class);
			pHsProgramCode.val = cmd.getParameterValue("@P_HS_PROGRAM_CODE", NString.class);
			pYtdAmtPaid.val = cmd.getParameterValue("@P_YTD_AMT_PAID", NNumber.class);


		}
		
		public static void pGetRebpayvCurrent(NString pAidyCode,NNumber pPidm,Ref<PellCurrentRecRow> pRecOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKORIG.P_GET_REBPAYV_CURRENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter(DbTypes.createStructType("P_REC_OUT", pRecOut.val,PellCurrentRecRow.class));
				
			cmd.execute();
			pRecOut.val = cmd.getParameterValue("@P_REC_OUT", PellCurrentRecRow.class);


		}
		
		public static void pGetRebtchoAccept(NString pAidyCode,NNumber pPidm,NString pFundCode,Ref<NString> pAwardId,Ref<NString> pYrInColl,Ref<NString> pCampOpeid,Ref<NString> pCampOpeidBranch) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKORIG.P_GET_REBTCHO_ACCEPT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_AWARD_ID", NString.class);
			cmd.addParameter("@P_YR_IN_COLL", NString.class);
			cmd.addParameter("@P_CAMP_OPEID", NString.class);
			cmd.addParameter("@P_CAMP_OPEID_BRANCH", NString.class);
				
			cmd.execute();
			pAwardId.val = cmd.getParameterValue("@P_AWARD_ID", NString.class);
			pYrInColl.val = cmd.getParameterValue("@P_YR_IN_COLL", NString.class);
			pCampOpeid.val = cmd.getParameterValue("@P_CAMP_OPEID", NString.class);
			pCampOpeidBranch.val = cmd.getParameterValue("@P_CAMP_OPEID_BRANCH", NString.class);


		}
		
		public static void pGetRebtchoCurrent(NString pAidyCode,NNumber pPidm,NString pFundCode,Ref<NString> pAwardAmount,Ref<NNumber> pIntSeqNo,Ref<NString> pYrInColl,Ref<NNumber> pPercentEligUsed,Ref<NNumber> pYtdAmtPaid,Ref<NString> pTeachExpertInd,Ref<NNumber> pBookAmt,Ref<NDate> pBookDate,Ref<NString> pBookDocumentId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKORIG.P_GET_REBTCHO_CURRENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_AWARD_AMOUNT", NString.class);
			cmd.addParameter("@P_INT_SEQ_NO", NNumber.class);
			cmd.addParameter("@P_YR_IN_COLL", NString.class);
			cmd.addParameter("@P_PERCENT_ELIG_USED", NNumber.class);
			cmd.addParameter("@P_YTD_AMT_PAID", NNumber.class);
			cmd.addParameter("@P_TEACH_EXPERT_IND", NString.class);
			cmd.addParameter("@P_BOOK_AMT", NNumber.class);
			cmd.addParameter("@P_BOOK_DATE", NDate.class);
			cmd.addParameter("@P_BOOK_DOCUMENT_ID", NString.class);
				
			cmd.execute();
			pAwardAmount.val = cmd.getParameterValue("@P_AWARD_AMOUNT", NString.class);
			pIntSeqNo.val = cmd.getParameterValue("@P_INT_SEQ_NO", NNumber.class);
			pYrInColl.val = cmd.getParameterValue("@P_YR_IN_COLL", NString.class);
			pPercentEligUsed.val = cmd.getParameterValue("@P_PERCENT_ELIG_USED", NNumber.class);
			pYtdAmtPaid.val = cmd.getParameterValue("@P_YTD_AMT_PAID", NNumber.class);
			pTeachExpertInd.val = cmd.getParameterValue("@P_TEACH_EXPERT_IND", NString.class);
			pBookAmt.val = cmd.getParameterValue("@P_BOOK_AMT", NNumber.class);
			pBookDate.val = cmd.getParameterValue("@P_BOOK_DATE", NDate.class);
			pBookDocumentId.val = cmd.getParameterValue("@P_BOOK_DOCUMENT_ID", NString.class);


		}
		
		public static void pGetRorstatData(NString pAidyCode,NNumber pPidm,Ref<NNumber> pAttendCost,Ref<NNumber> pLowTuitionCost,Ref<NString> pVerPayInd,Ref<NString> pSarSsn,Ref<NString> pSarInit,Ref<NString> pSarTranNo,Ref<NString> pLowCostCde) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKORIG.P_GET_RORSTAT_DATA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ATTEND_COST", NNumber.class);
			cmd.addParameter("@P_LOW_TUITION_COST", NNumber.class);
			cmd.addParameter("@P_VER_PAY_IND", NString.class);
			cmd.addParameter("@P_SAR_SSN", NString.class);
			cmd.addParameter("@P_SAR_INIT", NString.class);
			cmd.addParameter("@P_SAR_TRAN_NO", NString.class);
			cmd.addParameter("@P_LOW_COST_CDE", NString.class);
				
			cmd.execute();
			pAttendCost.val = cmd.getParameterValue("@P_ATTEND_COST", NNumber.class);
			pLowTuitionCost.val = cmd.getParameterValue("@P_LOW_TUITION_COST", NNumber.class);
			pVerPayInd.val = cmd.getParameterValue("@P_VER_PAY_IND", NString.class);
			pSarSsn.val = cmd.getParameterValue("@P_SAR_SSN", NString.class);
			pSarInit.val = cmd.getParameterValue("@P_SAR_INIT", NString.class);
			pSarTranNo.val = cmd.getParameterValue("@P_SAR_TRAN_NO", NString.class);
			pLowCostCde.val = cmd.getParameterValue("@P_LOW_COST_CDE", NString.class);


		}
		
		public static void pGetTeachDefaults(NString pAidyCode,NNumber pPidm,NString pFundCode,Ref<TeachDefaultRecRow> pRecOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKORIG.P_GET_TEACH_DEFAULTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter(DbTypes.createStructType("P_REC_OUT", pRecOut.val,TeachDefaultRecRow.class));
				
			cmd.execute();
			pRecOut.val = cmd.getParameterValue("@P_REC_OUT", TeachDefaultRecRow.class);


		}
		
	
	
	@DbRecordType(id="GrantDefaultRecRow", dataSourceName="GRANT_DEFAULT_REC")
	public static class GrantDefaultRecRow
	{
		@DbRecordField(dataSourceName="R_INT_SEQ_NO")
		public NNumber RIntSeqNo;
		@DbRecordField(dataSourceName="R_AWARD_ID")
		public NString RAwardId;
		@DbRecordField(dataSourceName="R_FED_FUND_ID")
		public NString RFedFundId;
		@DbRecordField(dataSourceName="R_GRANT_TYPE")
		public NString RGrantType;
		@DbRecordField(dataSourceName="R_CAMP_PELL_ID")
		public NString RCampPellId;
		@DbRecordField(dataSourceName="R_INST_PELL_ID")
		public NString RInstPellId;
		@DbRecordField(dataSourceName="R_YR_IN_COLL")
		public NString RYrInColl;
		@DbRecordField(dataSourceName="R_SAR_TRAN_NO")
		public NString RSarTranNo;
		@DbRecordField(dataSourceName="R_AWARD_AMOUNT")
		public NNumber RAwardAmount;
		@DbRecordField(dataSourceName="R_ENROLLMENT_DATE")
		public NDate REnrollmentDate;
		@DbRecordField(dataSourceName="R_INST_XREF")
		public NString RInstXref;
		@DbRecordField(dataSourceName="R_PAY_REASON_CDE")
		public NString RPayReasonCde;
		@DbRecordField(dataSourceName="R_HS_PROGRAM_CODE")
		public NString RHsProgramCode;
		@DbRecordField(dataSourceName="R_CIP_CODE")
		public NString RCipCode;
		@DbRecordField(dataSourceName="R_PERCENT_ELIG_USED")
		public NNumber RPercentEligUsed;
		@DbRecordField(dataSourceName="R_YTD_AMT_PAID")
		public NNumber RYtdAmtPaid;
	}

	
	@DbRecordType(id="PellCurrentRecRow", dataSourceName="PELL_CURRENT_REC")
	public static class PellCurrentRecRow
	{
		@DbRecordField(dataSourceName="R_INT_SEQ_NO")
		public NNumber RIntSeqNo;
		@DbRecordField(dataSourceName="R_AMT_PAID")
		public NNumber RAmtPaid;
		@DbRecordField(dataSourceName="R_PERCENT_ELIG_USED")
		public NNumber RPercentEligUsed;
	}

	
	@DbRecordType(id="PellDefaultRecRow", dataSourceName="PELL_DEFAULT_REC")
	public static class PellDefaultRecRow
	{
		@DbRecordField(dataSourceName="R_CAMP_PELL_ID")
		public NString RCampPellId;
		@DbRecordField(dataSourceName="R_INST_PELL_ID")
		public NString RInstPellId;
		@DbRecordField(dataSourceName="R_ATTEND_COST")
		public NNumber RAttendCost;
		@DbRecordField(dataSourceName="R_LOW_COST_CDE")
		public NString RLowCostCde;
		@DbRecordField(dataSourceName="R_AMT_DUE")
		public NNumber RAmtDue;
		@DbRecordField(dataSourceName="R_AMT_PAID")
		public NNumber RAmtPaid;
		@DbRecordField(dataSourceName="R_ENROLLMENT_DATE")
		public NDate REnrollmentDate;
		@DbRecordField(dataSourceName="R_INST_XREF")
		public NString RInstXref;
		@DbRecordField(dataSourceName="R_VER_STATUS")
		public NString RVerStatus;
		@DbRecordField(dataSourceName="R_ORIG_ID")
		public NString ROrigId;
		@DbRecordField(dataSourceName="R_SAR_SSN")
		public NString RSarSsn;
		@DbRecordField(dataSourceName="R_SAR_INIT")
		public NString RSarInit;
		@DbRecordField(dataSourceName="R_SAR_TRAN_NO")
		public NString RSarTranNo;
		@DbRecordField(dataSourceName="R_LOW_TUITION_COST")
		public NNumber RLowTuitionCost;
		@DbRecordField(dataSourceName="R_INT_SEQ_NO")
		public NNumber RIntSeqNo;
		@DbRecordField(dataSourceName="R_CURRENT_SSN")
		public NString RCurrentSsn;
		@DbRecordField(dataSourceName="R_CURRENT_BIRTH_DATE")
		public NDate RCurrentBirthDate;
		@DbRecordField(dataSourceName="R_CURRENT_LAST_NAME")
		public NString RCurrentLastName;
		@DbRecordField(dataSourceName="R_CURRENT_FIRST_NAME")
		public NString RCurrentFirstName;
		@DbRecordField(dataSourceName="R_CURRENT_MI")
		public NString RCurrentMi;
		@DbRecordField(dataSourceName="R_PERCENT_ELIG_USED")
		public NNumber RPercentEligUsed;
	}

	
	@DbRecordType(id="TeachDefaultRecRow", dataSourceName="TEACH_DEFAULT_REC")
	public static class TeachDefaultRecRow
	{
		@DbRecordField(dataSourceName="R_INT_SEQ_NO")
		public NNumber RIntSeqNo;
		@DbRecordField(dataSourceName="R_AWARD_ID")
		public NString RAwardId;
		@DbRecordField(dataSourceName="R_FED_FUND_ID")
		public NString RFedFundId;
		@DbRecordField(dataSourceName="R_GRANT_TYPE")
		public NString RGrantType;
		@DbRecordField(dataSourceName="R_CAMP_OPEID")
		public NString RCampOpeid;
		@DbRecordField(dataSourceName="R_CAMP_OPEID_BRANCH")
		public NString RCampOpeidBranch;
		@DbRecordField(dataSourceName="R_INST_OPEID")
		public NString RInstOpeid;
		@DbRecordField(dataSourceName="R_INST_OPEID_BRANCH")
		public NString RInstOpeidBranch;
		@DbRecordField(dataSourceName="R_YR_IN_COLL")
		public NString RYrInColl;
		@DbRecordField(dataSourceName="R_SAR_TRAN_NO")
		public NString RSarTranNo;
		@DbRecordField(dataSourceName="R_AWARD_AMOUNT")
		public NNumber RAwardAmount;
		@DbRecordField(dataSourceName="R_PERCENT_ELIG_USED")
		public NNumber RPercentEligUsed;
		@DbRecordField(dataSourceName="R_YTD_AMT_PAID")
		public NNumber RYtdAmtPaid;
		@DbRecordField(dataSourceName="R_ENROLLMENT_DATE")
		public NDate REnrollmentDate;
		@DbRecordField(dataSourceName="R_TEACH_EXPERT_IND")
		public NString RTeachExpertInd;
		@DbRecordField(dataSourceName="R_BOOK_AMT")
		public NNumber RBookAmt;
		@DbRecordField(dataSourceName="R_BOOK_DATE")
		public NDate RBookDate;
		@DbRecordField(dataSourceName="R_BOOK_DOCUMENT_ID")
		public NString RBookDocumentId;
	}

	
	
}
