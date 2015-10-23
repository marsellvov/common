package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbAdmissionsapplication {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ADMISSIONSAPPLICATION.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pPidm,NString pTermCodeEntry,NNumber pApplNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ADMISSIONSAPPLICATION.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE_ENTRY", pTermCodeEntry);
			cmd.addParameter("@P_APPL_NO", pApplNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fGetsaradapseqno(NNumber pPidm,NString pCurrOrNext) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ADMISSIONSAPPLICATION.F_GETSARADAPSEQNO", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CURR_OR_NEXT", pCurrOrNext);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fIsequal(AdmissionsapplicationRecRow recOne,AdmissionsapplicationRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ADMISSIONSAPPLICATION.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, AdmissionsapplicationRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, AdmissionsapplicationRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pPidm,NString pTermCodeEntry,NNumber pApplNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ADMISSIONSAPPLICATION.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE_ENTRY", pTermCodeEntry);
			cmd.addParameter("@P_APPL_NO", pApplNo);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByPreference(NNumber pPidm,NString pTermCodeEntry,NNumber pApplNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ADMISSIONSAPPLICATION.F_QUERY_BY_PREFERENCE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE_ENTRY", pTermCodeEntry);
			cmd.addParameter("@P_APPL_NO", pApplNo);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ADMISSIONSAPPLICATION.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPidm,NString pTermCodeEntry,NNumber pApplNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ADMISSIONSAPPLICATION.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE_ENTRY", pTermCodeEntry);
			cmd.addParameter("@P_APPL_NO", pApplNo);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pPidm,NString pTermCodeEntry,NNumber pApplNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ADMISSIONSAPPLICATION.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE_ENTRY", pTermCodeEntry);
			cmd.addParameter("@P_APPL_NO", pApplNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NNumber pPidm,NString pTermCodeEntry,Ref<NNumber> pApplNoInout,NDate pApplDate,NString pApstCode,NDate pApstDate,NString pMaintInd,NString pAdmtCode,NString pStypCode,NString pSiteCode,NString pResdCode,NString pFullPartInd,NString pSessCode,NString pWrsnCode,NString pIntvCode,NString pFeeInd,NDate pFeeDate,NString pRateCode,NString pEgolCode,NString pEdlvCode,NString pSbgiCode,NString pRecrCode,NString pRtypCode,NString pWebAcctMiscInd,NString pWebCashierUser,NNumber pWebTransNo,NNumber pWebAmount,NNumber pWebReceiptNumber,NString pWaivCode,NString pDataOrigin,NString pUserId,Ref<NString> pRowidOut,NNumber pApplPreference) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ADMISSIONSAPPLICATION.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE_ENTRY", pTermCodeEntry);
			cmd.addParameter("@P_APPL_NO_INOUT", pApplNoInout, true);
			cmd.addParameter("@P_APPL_DATE", pApplDate);
			cmd.addParameter("@P_APST_CODE", pApstCode);
			cmd.addParameter("@P_APST_DATE", pApstDate);
			cmd.addParameter("@P_MAINT_IND", pMaintInd);
			cmd.addParameter("@P_ADMT_CODE", pAdmtCode);
			cmd.addParameter("@P_STYP_CODE", pStypCode);
			cmd.addParameter("@P_SITE_CODE", pSiteCode);
			cmd.addParameter("@P_RESD_CODE", pResdCode);
			cmd.addParameter("@P_FULL_PART_IND", pFullPartInd);
			cmd.addParameter("@P_SESS_CODE", pSessCode);
			cmd.addParameter("@P_WRSN_CODE", pWrsnCode);
			cmd.addParameter("@P_INTV_CODE", pIntvCode);
			cmd.addParameter("@P_FEE_IND", pFeeInd);
			cmd.addParameter("@P_FEE_DATE", pFeeDate);
			cmd.addParameter("@P_RATE_CODE", pRateCode);
			cmd.addParameter("@P_EGOL_CODE", pEgolCode);
			cmd.addParameter("@P_EDLV_CODE", pEdlvCode);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_RECR_CODE", pRecrCode);
			cmd.addParameter("@P_RTYP_CODE", pRtypCode);
			cmd.addParameter("@P_WEB_ACCT_MISC_IND", pWebAcctMiscInd);
			cmd.addParameter("@P_WEB_CASHIER_USER", pWebCashierUser);
			cmd.addParameter("@P_WEB_TRANS_NO", pWebTransNo);
			cmd.addParameter("@P_WEB_AMOUNT", pWebAmount);
			cmd.addParameter("@P_WEB_RECEIPT_NUMBER", pWebReceiptNumber);
			cmd.addParameter("@P_WAIV_CODE", pWaivCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
			cmd.addParameter("@P_APPL_PREFERENCE", pApplPreference);
				
			cmd.execute();
			pApplNoInout.val = cmd.getParameterValue("@P_APPL_NO_INOUT", NNumber.class);
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pPidm,NString pTermCodeEntry,NNumber pApplNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ADMISSIONSAPPLICATION.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE_ENTRY", pTermCodeEntry);
			cmd.addParameter("@P_APPL_NO", pApplNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pPidm,NString pTermCodeEntry,NNumber pApplNo,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ADMISSIONSAPPLICATION.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE_ENTRY", pTermCodeEntry);
			cmd.addParameter("@P_APPL_NO", pApplNo);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pPidm,NString pTermCodeEntry,NNumber pApplNo,NDate pApplDate,NString pApstCode,NDate pApstDate,NString pMaintInd,NString pAdmtCode,NString pStypCode,NString pSiteCode,NString pResdCode,NString pFullPartInd,NString pSessCode,NString pWrsnCode,NString pIntvCode,NString pFeeInd,NDate pFeeDate,NString pRateCode,NString pEgolCode,NString pEdlvCode,NString pSbgiCode,NString pRecrCode,NString pRtypCode,NString pWebAcctMiscInd,NString pWebCashierUser,NNumber pWebTransNo,NNumber pWebAmount,NNumber pWebReceiptNumber,NString pWaivCode,NString pDataOrigin,NString pUserId,NString pRowid,NNumber pApplPreference) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ADMISSIONSAPPLICATION.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE_ENTRY", pTermCodeEntry);
			cmd.addParameter("@P_APPL_NO", pApplNo);
			cmd.addParameter("@P_APPL_DATE", pApplDate);
			cmd.addParameter("@P_APST_CODE", pApstCode);
			cmd.addParameter("@P_APST_DATE", pApstDate);
			cmd.addParameter("@P_MAINT_IND", pMaintInd);
			cmd.addParameter("@P_ADMT_CODE", pAdmtCode);
			cmd.addParameter("@P_STYP_CODE", pStypCode);
			cmd.addParameter("@P_SITE_CODE", pSiteCode);
			cmd.addParameter("@P_RESD_CODE", pResdCode);
			cmd.addParameter("@P_FULL_PART_IND", pFullPartInd);
			cmd.addParameter("@P_SESS_CODE", pSessCode);
			cmd.addParameter("@P_WRSN_CODE", pWrsnCode);
			cmd.addParameter("@P_INTV_CODE", pIntvCode);
			cmd.addParameter("@P_FEE_IND", pFeeInd);
			cmd.addParameter("@P_FEE_DATE", pFeeDate);
			cmd.addParameter("@P_RATE_CODE", pRateCode);
			cmd.addParameter("@P_EGOL_CODE", pEgolCode);
			cmd.addParameter("@P_EDLV_CODE", pEdlvCode);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_RECR_CODE", pRecrCode);
			cmd.addParameter("@P_RTYP_CODE", pRtypCode);
			cmd.addParameter("@P_WEB_ACCT_MISC_IND", pWebAcctMiscInd);
			cmd.addParameter("@P_WEB_CASHIER_USER", pWebCashierUser);
			cmd.addParameter("@P_WEB_TRANS_NO", pWebTransNo);
			cmd.addParameter("@P_WEB_AMOUNT", pWebAmount);
			cmd.addParameter("@P_WEB_RECEIPT_NUMBER", pWebReceiptNumber);
			cmd.addParameter("@P_WAIV_CODE", pWaivCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ROWID", pRowid);
			cmd.addParameter("@P_APPL_PREFERENCE", pApplPreference);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="AdmissionsapplicationRecRow", dataSourceName="ADMISSIONSAPPLICATION_REC")
	public static class AdmissionsapplicationRecRow
	{
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_TERM_CODE_ENTRY")
		public NString RTermCodeEntry;
		@DbRecordField(dataSourceName="R_APPL_NO")
		public NNumber RApplNo;
		@DbRecordField(dataSourceName="R_LEVL_CODE")
		public NString RLevlCode;
		@DbRecordField(dataSourceName="R_APPL_DATE")
		public NDate RApplDate;
		@DbRecordField(dataSourceName="R_APST_CODE")
		public NString RApstCode;
		@DbRecordField(dataSourceName="R_APST_DATE")
		public NDate RApstDate;
		@DbRecordField(dataSourceName="R_MAINT_IND")
		public NString RMaintInd;
		@DbRecordField(dataSourceName="R_ADMT_CODE")
		public NString RAdmtCode;
		@DbRecordField(dataSourceName="R_STYP_CODE")
		public NString RStypCode;
		@DbRecordField(dataSourceName="R_CAMP_CODE")
		public NString RCampCode;
		@DbRecordField(dataSourceName="R_SITE_CODE")
		public NString RSiteCode;
		@DbRecordField(dataSourceName="R_COLL_CODE_1")
		public NString RCollCode1;
		@DbRecordField(dataSourceName="R_DEGC_CODE_1")
		public NString RDegcCode1;
		@DbRecordField(dataSourceName="R_MAJR_CODE_1")
		public NString RMajrCode1;
		@DbRecordField(dataSourceName="R_COLL_CODE_2")
		public NString RCollCode2;
		@DbRecordField(dataSourceName="R_DEGC_CODE_2")
		public NString RDegcCode2;
		@DbRecordField(dataSourceName="R_MAJR_CODE_2")
		public NString RMajrCode2;
		@DbRecordField(dataSourceName="R_RESD_CODE")
		public NString RResdCode;
		@DbRecordField(dataSourceName="R_FULL_PART_IND")
		public NString RFullPartInd;
		@DbRecordField(dataSourceName="R_SESS_CODE")
		public NString RSessCode;
		@DbRecordField(dataSourceName="R_WRSN_CODE")
		public NString RWrsnCode;
		@DbRecordField(dataSourceName="R_INTV_CODE")
		public NString RIntvCode;
		@DbRecordField(dataSourceName="R_FEE_IND")
		public NString RFeeInd;
		@DbRecordField(dataSourceName="R_FEE_DATE")
		public NDate RFeeDate;
		@DbRecordField(dataSourceName="R_RATE_CODE")
		public NString RRateCode;
		@DbRecordField(dataSourceName="R_EGOL_CODE")
		public NString REgolCode;
		@DbRecordField(dataSourceName="R_EDLV_CODE")
		public NString REdlvCode;
		@DbRecordField(dataSourceName="R_MAJR_CODE_CONC_1")
		public NString RMajrCodeConc1;
		@DbRecordField(dataSourceName="R_DEPT_CODE")
		public NString RDeptCode;
		@DbRecordField(dataSourceName="R_SBGI_CODE")
		public NString RSbgiCode;
		@DbRecordField(dataSourceName="R_RECR_CODE")
		public NString RRecrCode;
		@DbRecordField(dataSourceName="R_RTYP_CODE")
		public NString RRtypCode;
		@DbRecordField(dataSourceName="R_DEPT_CODE_2")
		public NString RDeptCode2;
		@DbRecordField(dataSourceName="R_MAJR_CODE_CONC_2")
		public NString RMajrCodeConc2;
		@DbRecordField(dataSourceName="R_PROGRAM_1")
		public NString RProgram1;
		@DbRecordField(dataSourceName="R_TERM_CODE_CTLG_1")
		public NString RTermCodeCtlg1;
		@DbRecordField(dataSourceName="R_MAJR_CODE_1_2")
		public NString RMajrCode12;
		@DbRecordField(dataSourceName="R_DEPT_CODE_1_2")
		public NString RDeptCode12;
		@DbRecordField(dataSourceName="R_MAJR_CODE_CONC_1_2")
		public NString RMajrCodeConc12;
		@DbRecordField(dataSourceName="R_MAJR_CODE_CONC_1_3")
		public NString RMajrCodeConc13;
		@DbRecordField(dataSourceName="R_MAJR_CODE_CONC_121")
		public NString RMajrCodeConc121;
		@DbRecordField(dataSourceName="R_MAJR_CODE_CONC_122")
		public NString RMajrCodeConc122;
		@DbRecordField(dataSourceName="R_MAJR_CODE_CONC_123")
		public NString RMajrCodeConc123;
		@DbRecordField(dataSourceName="R_MAJR_CODE_MINR_1_1")
		public NString RMajrCodeMinr11;
		@DbRecordField(dataSourceName="R_MAJR_CODE_MINR_1_2")
		public NString RMajrCodeMinr12;
		@DbRecordField(dataSourceName="R_PROGRAM_2")
		public NString RProgram2;
		@DbRecordField(dataSourceName="R_TERM_CODE_CTLG_2")
		public NString RTermCodeCtlg2;
		@DbRecordField(dataSourceName="R_LEVL_CODE_2")
		public NString RLevlCode2;
		@DbRecordField(dataSourceName="R_CAMP_CODE_2")
		public NString RCampCode2;
		@DbRecordField(dataSourceName="R_MAJR_CODE_2_2")
		public NString RMajrCode22;
		@DbRecordField(dataSourceName="R_DEPT_CODE_2_2")
		public NString RDeptCode22;
		@DbRecordField(dataSourceName="R_MAJR_CODE_CONC_211")
		public NString RMajrCodeConc211;
		@DbRecordField(dataSourceName="R_MAJR_CODE_CONC_212")
		public NString RMajrCodeConc212;
		@DbRecordField(dataSourceName="R_MAJR_CODE_CONC_213")
		public NString RMajrCodeConc213;
		@DbRecordField(dataSourceName="R_MAJR_CODE_CONC_221")
		public NString RMajrCodeConc221;
		@DbRecordField(dataSourceName="R_MAJR_CODE_CONC_222")
		public NString RMajrCodeConc222;
		@DbRecordField(dataSourceName="R_MAJR_CODE_CONC_223")
		public NString RMajrCodeConc223;
		@DbRecordField(dataSourceName="R_MAJR_CODE_MINR_2_1")
		public NString RMajrCodeMinr21;
		@DbRecordField(dataSourceName="R_MAJR_CODE_MINR_2_2")
		public NString RMajrCodeMinr22;
		@DbRecordField(dataSourceName="R_CURR_RULE_1")
		public NNumber RCurrRule1;
		@DbRecordField(dataSourceName="R_CMJR_RULE_1_1")
		public NNumber RCmjrRule11;
		@DbRecordField(dataSourceName="R_CCON_RULE_11_1")
		public NNumber RCconRule111;
		@DbRecordField(dataSourceName="R_CCON_RULE_11_2")
		public NNumber RCconRule112;
		@DbRecordField(dataSourceName="R_CCON_RULE_11_3")
		public NNumber RCconRule113;
		@DbRecordField(dataSourceName="R_CMJR_RULE_1_2")
		public NNumber RCmjrRule12;
		@DbRecordField(dataSourceName="R_CCON_RULE_12_1")
		public NNumber RCconRule121;
		@DbRecordField(dataSourceName="R_CCON_RULE_12_2")
		public NNumber RCconRule122;
		@DbRecordField(dataSourceName="R_CCON_RULE_12_3")
		public NNumber RCconRule123;
		@DbRecordField(dataSourceName="R_CMNR_RULE_1_1")
		public NNumber RCmnrRule11;
		@DbRecordField(dataSourceName="R_CMNR_RULE_1_2")
		public NNumber RCmnrRule12;
		@DbRecordField(dataSourceName="R_CURR_RULE_2")
		public NNumber RCurrRule2;
		@DbRecordField(dataSourceName="R_CMJR_RULE_2_1")
		public NNumber RCmjrRule21;
		@DbRecordField(dataSourceName="R_CCON_RULE_21_1")
		public NNumber RCconRule211;
		@DbRecordField(dataSourceName="R_CCON_RULE_21_2")
		public NNumber RCconRule212;
		@DbRecordField(dataSourceName="R_CCON_RULE_21_3")
		public NNumber RCconRule213;
		@DbRecordField(dataSourceName="R_CMJR_RULE_2_2")
		public NNumber RCmjrRule22;
		@DbRecordField(dataSourceName="R_CCON_RULE_22_1")
		public NNumber RCconRule221;
		@DbRecordField(dataSourceName="R_CCON_RULE_22_2")
		public NNumber RCconRule222;
		@DbRecordField(dataSourceName="R_CCON_RULE_22_3")
		public NNumber RCconRule223;
		@DbRecordField(dataSourceName="R_CMNR_RULE_2_1")
		public NNumber RCmnrRule21;
		@DbRecordField(dataSourceName="R_CMNR_RULE_2_2")
		public NNumber RCmnrRule22;
		@DbRecordField(dataSourceName="R_WEB_ACCT_MISC_IND")
		public NString RWebAcctMiscInd;
		@DbRecordField(dataSourceName="R_WEB_CASHIER_USER")
		public NString RWebCashierUser;
		@DbRecordField(dataSourceName="R_WEB_TRANS_NO")
		public NNumber RWebTransNo;
		@DbRecordField(dataSourceName="R_WEB_AMOUNT")
		public NNumber RWebAmount;
		@DbRecordField(dataSourceName="R_WEB_RECEIPT_NUMBER")
		public NNumber RWebReceiptNumber;
		@DbRecordField(dataSourceName="R_WAIV_CODE")
		public NString RWaivCode;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
		@DbRecordField(dataSourceName="R_APPL_PREFERENCE")
		public NNumber RApplPreference;
	}

	
	
}
