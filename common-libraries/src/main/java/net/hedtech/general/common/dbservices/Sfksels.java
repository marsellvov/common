package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Sfksels {
		public static NString fCheckRefundPercent(NString termIn,NString rstsIn,NDate rstsDateIn,NString ptrmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKSELS.F_CHECK_REFUND_PERCENT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@RSTS_IN", rstsIn);
			cmd.addParameter("@RSTS_DATE_IN", rstsDateIn);
			cmd.addParameter("@PTRM_IN", ptrmIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NDate fGetAregCompDate(NNumber pPidm,NString pTermCode,NString pCrn,NNumber pExtension) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKSELS.F_GET_AREG_COMP_DATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_EXTENSION", pExtension);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
		public static NNumber fGetDuntDays(NString pCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKSELS.F_GET_DUNT_DAYS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_CODE", pCode);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fGetFgrdDispInd(NString pTermCode,NString pCrn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKSELS.F_GET_FGRD_DISP_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CRN", pCrn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fGetMaxHours(NString termIn,NString levlIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKSELS.F_GET_MAX_HOURS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@LEVL_IN", levlIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fGetMaxSfbetrmArInd(NString termIn,NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKSELS.F_GET_MAX_SFBETRM_AR_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetMgrdDispInd(NString pTermCode,NString pCrn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKSELS.F_GET_MGRD_DISP_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CRN", pCrn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fGetNewSfrstcaSeqNumber(NString termIn,NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKSELS.F_GET_NEW_SFRSTCA_SEQ_NUMBER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void fGetSfbestsRec() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKSELS.F_GET_SFBESTS_REC", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void fGetSfbetrmRec() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKSELS.F_GET_SFBETRM_REC", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static NDate fGetSfraregCompletionDate(NNumber pPidm,NString pTermCode,NString pCrn,NString pPtrmCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKSELS.F_GET_SFRAREG_COMPLETION_DATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_PTRM_CODE", pPtrmCode);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
		public static NDate fGetSfraregStartDate(NNumber pPidm,NString pTermCode,NString pCrn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKSELS.F_GET_SFRAREG_START_DATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CRN", pCrn);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
		public static void fGetSfrbtchRec() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKSELS.F_GET_SFRBTCH_REC", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void fGetSfrcolrRow() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKSELS.F_GET_SFRCOLR_ROW", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static NNumber fGetSftregsCount(NNumber pidmIn,NString termIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKSELS.F_GET_SFTREGS_COUNT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void fGetSftregsRec() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKSELS.F_GET_SFTREGS_REC", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static DataCursor fQueryLastTerm(NNumber pPidm,NString pTermCodeEff) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKSELS.F_QUERY_LAST_TERM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static NString fSfbetrmValue(NNumber pPidm,NString pTermCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKSELS.F_SFBETRM_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool fSfrrstsExists(NString termIn,NString ptrmIn,NString rstsIn,NString useDateIn,NString useEnrlIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKSELS.F_SFRRSTS_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PTRM_IN", ptrmIn);
			cmd.addParameter("@RSTS_IN", rstsIn);
			cmd.addParameter("@USE_DATE_IN", useDateIn);
			cmd.addParameter("@USE_ENRL_IN", useEnrlIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fSfrrstsExistsNoExcept(NString termIn,NString ptrmIn,NString rstsIn,NString useDateIn,NString useEnrlIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKSELS.F_SFRRSTS_EXISTS_NO_EXCEPT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PTRM_IN", ptrmIn);
			cmd.addParameter("@RSTS_IN", rstsIn);
			cmd.addParameter("@USE_DATE_IN", useDateIn);
			cmd.addParameter("@USE_ENRL_IN", useEnrlIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void pGetLastTermAttended(Ref<NString> maxTermInOut,NString termIn,NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKSELS.P_GET_LAST_TERM_ATTENDED", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MAX_TERM_IN_OUT", maxTermInOut, true);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();
			maxTermInOut.val = cmd.getParameterValue("@MAX_TERM_IN_OUT", NString.class);


		}
		
		public static void pGetMinMaxByCurric(NString pTerm,NNumber pPidm,NNumber pSeqNo,Ref<NNumber> pMinHrsOut,Ref<NNumber> pMaxHrsOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKSELS.P_GET_MIN_MAX_BY_CURRIC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_MIN_HRS_OUT", NNumber.class);
			cmd.addParameter("@P_MAX_HRS_OUT", NNumber.class);
				
			cmd.execute();
			pMinHrsOut.val = cmd.getParameterValue("@P_MIN_HRS_OUT", NNumber.class);
			pMaxHrsOut.val = cmd.getParameterValue("@P_MAX_HRS_OUT", NNumber.class);


		}
		
		public static void pGetMinMaxByCurricStand(NString pTerm,NNumber pPidm,NNumber pSeqNo,NString pNewCast,NString pNewAstd,NString pAstdCode,NString pCastCode,Ref<NNumber> pMinHrsOut,Ref<NNumber> pMaxHrsOut,Ref<NString> pMinSrceOut,Ref<NString> pMaxSrceOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKSELS.P_GET_MIN_MAX_BY_CURRIC_STAND", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_NEW_CAST", pNewCast);
			cmd.addParameter("@P_NEW_ASTD", pNewAstd);
			cmd.addParameter("@P_ASTD_CODE", pAstdCode);
			cmd.addParameter("@P_CAST_CODE", pCastCode);
			cmd.addParameter("@P_MIN_HRS_OUT", NNumber.class);
			cmd.addParameter("@P_MAX_HRS_OUT", NNumber.class);
			cmd.addParameter("@P_MIN_SRCE_OUT", NString.class);
			cmd.addParameter("@P_MAX_SRCE_OUT", NString.class);
				
			cmd.execute();
			pMinHrsOut.val = cmd.getParameterValue("@P_MIN_HRS_OUT", NNumber.class);
			pMaxHrsOut.val = cmd.getParameterValue("@P_MAX_HRS_OUT", NNumber.class);
			pMinSrceOut.val = cmd.getParameterValue("@P_MIN_SRCE_OUT", NString.class);
			pMaxSrceOut.val = cmd.getParameterValue("@P_MAX_SRCE_OUT", NString.class);


		}
		
		public static void pGetMinMaxHours(NString pTerm,NNumber pSeqNo,Ref<NNumber> pMinHrsOut,Ref<NNumber> pMaxHrsOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKSELS.P_GET_MIN_MAX_HOURS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_MIN_HRS_OUT", NNumber.class);
			cmd.addParameter("@P_MAX_HRS_OUT", NNumber.class);
				
			cmd.execute();
			pMinHrsOut.val = cmd.getParameterValue("@P_MIN_HRS_OUT", NNumber.class);
			pMaxHrsOut.val = cmd.getParameterValue("@P_MAX_HRS_OUT", NNumber.class);


		}
		
//		public static void pGetSftregsRows(Ref<List<Soktabs.SftregsTabTypeRow>> sftregsTable,Ref<NNumber> numRecsInOut,NString termIn,NNumber pidmIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKSELS.P_GET_SFTREGS_ROWS", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("SFTREGS_TABLE", "", sftregsTable.val, object.class , true));
//			cmd.addParameter("@NUM_RECS_IN_OUT", numRecsInOut, true);
//			cmd.addParameter("@TERM_IN", termIn);
//			cmd.addParameter("@PIDM_IN", pidmIn);
//				
//			cmd.execute();
//			// sftregsTable.val = cmd.getTableParameterValue("@SFTREGS_TABLE", object.class);
//			numRecsInOut.val = cmd.getParameterValue("@NUM_RECS_IN_OUT", NNumber.class);
//
//
//		}
		
		public static void pGetTotalHours(Ref<NNumber> totCredHrInOut,Ref<NNumber> totBillHrInOut,Ref<NNumber> totCeuHrInOut,NString termIn,NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKSELS.P_GET_TOTAL_HOURS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TOT_CRED_HR_IN_OUT", totCredHrInOut, true);
			cmd.addParameter("@TOT_BILL_HR_IN_OUT", totBillHrInOut, true);
			cmd.addParameter("@TOT_CEU_HR_IN_OUT", totCeuHrInOut, true);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();
			totCredHrInOut.val = cmd.getParameterValue("@TOT_CRED_HR_IN_OUT", NNumber.class);
			totBillHrInOut.val = cmd.getParameterValue("@TOT_BILL_HR_IN_OUT", NNumber.class);
			totCeuHrInOut.val = cmd.getParameterValue("@TOT_CEU_HR_IN_OUT", NNumber.class);


		}
		
		public static void pGetTotalHoursSftregs(Ref<NNumber> totCredHrInOut,Ref<NNumber> totBillHrInOut,Ref<NNumber> totCeuHrInOut,NString termIn,NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKSELS.P_GET_TOTAL_HOURS_SFTREGS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TOT_CRED_HR_IN_OUT", totCredHrInOut, true);
			cmd.addParameter("@TOT_BILL_HR_IN_OUT", totBillHrInOut, true);
			cmd.addParameter("@TOT_CEU_HR_IN_OUT", totCeuHrInOut, true);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();
			totCredHrInOut.val = cmd.getParameterValue("@TOT_CRED_HR_IN_OUT", NNumber.class);
			totBillHrInOut.val = cmd.getParameterValue("@TOT_BILL_HR_IN_OUT", NNumber.class);
			totCeuHrInOut.val = cmd.getParameterValue("@TOT_CEU_HR_IN_OUT", NNumber.class);


		}
		
		public static void pSelectSfrstcrByMulti(NNumber pidmIn,NString termIn,NString crnIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKSELS.P_SELECT_SFRSTCR_BY_MULTI", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CRN_IN", crnIn);
				
			cmd.execute();


		}
		
	
	
	
}
