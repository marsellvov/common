package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbAdmissionsapplicationRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ADMISSIONSAPPLICATION_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pPidm,NString pTermCodeEntry,NNumber pApplNo,NDate pApplDate,NString pApstCode,NDate pApstDate,NString pMaintInd,NString pAdmtCode,NString pStypCode,NString pSiteCode,NString pResdCode,NString pFullPartInd,NString pSessCode,NString pWrsnCode,NString pIntvCode,NString pFeeInd,NDate pFeeDate,NString pRateCode,NString pEgolCode,NString pEdlvCode,NString pSbgiCode,NString pRecrCode,NString pRtypCode,NString pWebAcctMiscInd,NString pWebCashierUser,NNumber pWebTransNo,NNumber pWebAmount,NNumber pWebReceiptNumber,NString pWaivCode,NString pDataOrigin,NString pUserId,NString pInternalRecordId,NNumber pApplPreference) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ADMISSIONSAPPLICATION_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
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
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
			cmd.addParameter("@P_APPL_PREFERENCE", pApplPreference);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pPidm,NString pTermCodeEntry,NNumber pApplNo,NDate pApplDate,NString pApstCode,NDate pApstDate,NString pMaintInd,NString pAdmtCode,NString pStypCode,NString pSiteCode,NString pResdCode,NString pFullPartInd,NString pSessCode,NString pWrsnCode,NString pIntvCode,NString pFeeInd,NDate pFeeDate,NString pRateCode,NString pEgolCode,NString pEdlvCode,NString pSbgiCode,NString pRecrCode,NString pRtypCode,NString pWebAcctMiscInd,NString pWebCashierUser,NNumber pWebTransNo,NNumber pWebAmount,NNumber pWebReceiptNumber,NString pWaivCode,NString pDataOrigin,NString pUserId,NNumber pApplPreference) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ADMISSIONSAPPLICATION_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
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
			cmd.addParameter("@P_APPL_PREFERENCE", pApplPreference);
				
			cmd.execute();


		}
		
	
	
	
}
