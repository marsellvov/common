package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Shksels {
		public static NNumber fGetCreditHours(NNumber pidmIn,NString levelCodeIn,NString gpaTypeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKSELS.F_GET_CREDIT_HOURS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@LEVEL_CODE_IN", levelCodeIn);
			cmd.addParameter("@GPA_TYPE_IN", gpaTypeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fGetLevlGpa(NNumber pidmIn,NString levlIn,NString typeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKSELS.F_GET_LEVL_GPA", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@LEVL_IN", levlIn);
			cmd.addParameter("@TYPE_IN", typeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void fGetMaxShrttrmRec() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKSELS.F_GET_MAX_SHRTTRM_REC", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static NString fGetMinShrtcknTerm(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKSELS.F_GET_MIN_SHRTCKN_TERM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetShrtcklLevlCode(NNumber pidmIn,NString termIn,NNumber seqNumbIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKSELS.F_GET_SHRTCKL_LEVL_CODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@SEQ_NUMB_IN", seqNumbIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fGetTermGpa(NNumber pidmIn,NString levlIn,NString termIn,NString typeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKSELS.F_GET_TERM_GPA", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@LEVL_IN", levlIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@TYPE_IN", typeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fSelectScpsShrtrtc(NNumber pPidm,NString pTermCode,NString pLevl,NString pAllCampusInd,NString pCampus) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKSELS.F_SELECT_SCPS_SHRTRTC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_LEVL", pLevl);
			cmd.addParameter("@P_ALL_CAMPUS_IND", pAllCampusInd);
			cmd.addParameter("@P_CAMPUS", pCampus);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fShbcattExists(NNumber pPidm,NString pTermCodeEff,NString pCertCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKSELS.F_SHBCATT_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_CERT_CODE", pCertCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fShbdiplExists(NNumber pPidm,NNumber pSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKSELS.F_SHBDIPL_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fShrattrValue(NNumber pPidm,NString pTerm,NNumber pTcknSeqNo,NNumber pPosition) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKSELS.F_SHRATTR_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_TCKN_SEQ_NO", pTcknSeqNo);
			cmd.addParameter("@P_POSITION", pPosition);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fShrdgmrByMulti(NNumber pidmIn,NString levlIn,NString collIn,NString degcIn,NString progIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKSELS.F_SHRDGMR_BY_MULTI", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@LEVL_IN", levlIn);
			cmd.addParameter("@COLL_IN", collIn);
			cmd.addParameter("@DEGC_IN", degcIn);
			cmd.addParameter("@PROG_IN", progIn);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static NString fShrdgmrValue(NNumber pPidm,NString pLevlCode,NNumber pPosition,NString pRetInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKSELS.F_SHRDGMR_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_LEVL_CODE", pLevlCode);
			cmd.addParameter("@P_POSITION", pPosition);
			cmd.addParameter("@P_RET_IND", pRetInd);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fShrgrdeValue(NString pGradeCode,NString pTermCode,NString pLevlCode,NString pInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKSELS.F_SHRGRDE_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_GRADE_CODE", pGradeCode);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_LEVL_CODE", pLevlCode);
			cmd.addParameter("@P_IND", pInd);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fShrlgpaValue(NNumber pPidm,NString pLevlCode,NString gpaorqp,NString pInd,NString pRetInd,NString pCampus,NString pTerm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKSELS.F_SHRLGPA_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_LEVL_CODE", pLevlCode);
			cmd.addParameter("@GPAORQP", gpaorqp);
			cmd.addParameter("@P_IND", pInd);
			cmd.addParameter("@P_RET_IND", pRetInd);
			cmd.addParameter("@P_CAMPUS", pCampus);
			cmd.addParameter("@P_TERM", pTerm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fShrtckgValue(NNumber pPidm,NString pTerm,NNumber pSeqNo,NNumber pPosition,NString pRetInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKSELS.F_SHRTCKG_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_POSITION", pPosition);
			cmd.addParameter("@P_RET_IND", pRetInd);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fShrtcklValue(NNumber pPidm,NString pTermCode,NNumber pSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKSELS.F_SHRTCKL_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool fShrtcknExists(NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKSELS.F_SHRTCKN_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NString fShrttrmValue(NNumber pPidm,NString pTerm,NString pType,NString pInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKSELS.F_SHRTTRM_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_TYPE", pType);
			cmd.addParameter("@P_IND", pInd);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fStvmajrValue(NString pMajrMinr,NString pInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKSELS.F_STVMAJR_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_MAJR_MINR", pMajrMinr);
			cmd.addParameter("@P_IND", pInd);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pSelectShbcgpa() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKSELS.P_SELECT_SHBCGPA", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pSelectShrattcByMulti(NString termIn,NString crnIn,NString attrIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKSELS.P_SELECT_SHRATTC_BY_MULTI", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@ATTR_IN", attrIn);
				
			cmd.execute();


		}
		
//		public static void pSelectShrdgmrByMulti(NNumber pidmIn,NString levlIn,NString collIn,NString degcIn,NString progIn,Ref<SbLearneroutcome.LearneroutcomeRecRow> rowOut,Ref<NBool> rowFoundOut) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKSELS.P_SELECT_SHRDGMR_BY_MULTI", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@PIDM_IN", pidmIn);
//			cmd.addParameter("@LEVL_IN", levlIn);
//			cmd.addParameter("@COLL_IN", collIn);
//			cmd.addParameter("@DEGC_IN", degcIn);
//			cmd.addParameter("@PROG_IN", progIn);
//			cmd.addParameter(DbTypes.createStructType("ROW_OUT", SbLearneroutcome.LearneroutcomeRecRow.class));
//			cmd.addParameter("@ROW_FOUND_OUT", NBool.class);
//				
//			cmd.execute();
//			rowOut.val = cmd.getParameterValue("@ROW_OUT", SbLearneroutcome.LearneroutcomeRecRow.class);
//			rowFoundOut.val = cmd.getParameterValue("@ROW_FOUND_OUT", NBool.class);
//
//
//		}
		
		public static void pSelectShrdgmrSeqnoByPidm(NNumber pidmIn,Ref<NNumber> shrdgmrSeqNoOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKSELS.P_SELECT_SHRDGMR_SEQNO_BY_PIDM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@SHRDGMR_SEQ_NO_OUT", NNumber.class);
				
			cmd.execute();
			shrdgmrSeqNoOut.val = cmd.getParameterValue("@SHRDGMR_SEQ_NO_OUT", NNumber.class);


		}
		
		public static void pSelectShrgcolByMulti(NNumber pidmIn,NString termIn,NString prtStatIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKSELS.P_SELECT_SHRGCOL_BY_MULTI", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PRT_STAT_IN", prtStatIn);
				
			cmd.execute();


		}
		
		public static void pSelectShrgcolByPidmTerm(NNumber pidmIn,NString termIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKSELS.P_SELECT_SHRGCOL_BY_PIDM_TERM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
				
			cmd.execute();


		}
		
		public static void pSelectShrgpacByMulti(NNumber pidmIn,NString termIn,NString levlIn,NString campIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKSELS.P_SELECT_SHRGPAC_BY_MULTI", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@LEVL_IN", levlIn);
			cmd.addParameter("@CAMP_IN", campIn);
				
			cmd.execute();


		}
		
		public static void pSelectShrgpalByMulti(NNumber pidmIn,NString levlIn,NString gpaTypIn,NString campIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKSELS.P_SELECT_SHRGPAL_BY_MULTI", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@LEVL_IN", levlIn);
			cmd.addParameter("@GPA_TYP_IN", gpaTypIn);
			cmd.addParameter("@CAMP_IN", campIn);
				
			cmd.execute();


		}
		
		public static void pSelectShrgrdoByMulti(NString grdeIn,NString levlIn,NString gmodIn,NString termIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKSELS.P_SELECT_SHRGRDO_BY_MULTI", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@GRDE_IN", grdeIn);
			cmd.addParameter("@LEVL_IN", levlIn);
			cmd.addParameter("@GMOD_IN", gmodIn);
			cmd.addParameter("@TERM_IN", termIn);
				
			cmd.execute();


		}
		
		public static void pSelectShrgrdsByMulti(NString grdeIn,NString levlIn,NString gmodIn,NString termIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKSELS.P_SELECT_SHRGRDS_BY_MULTI", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@GRDE_IN", grdeIn);
			cmd.addParameter("@LEVL_IN", levlIn);
			cmd.addParameter("@GMOD_IN", gmodIn);
			cmd.addParameter("@TERM_IN", termIn);
				
			cmd.execute();


		}
		
		public static void pSelectShrinstSirasgn(NString termIn,NString crnIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKSELS.P_SELECT_SHRINST_SIRASGN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CRN_IN", crnIn);
				
			cmd.execute();


		}
		
		public static void pSelectShrlgpaByMulti(NNumber pidmIn,NString levelCodeIn,NString gpaTypeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKSELS.P_SELECT_SHRLGPA_BY_MULTI", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@LEVEL_CODE_IN", levelCodeIn);
			cmd.addParameter("@GPA_TYPE_IN", gpaTypeIn);
				
			cmd.execute();


		}
		
		public static void pSelectShrtckgByMulti(NNumber pidmIn,NString termIn,NNumber seqNmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKSELS.P_SELECT_SHRTCKG_BY_MULTI", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@SEQ_NM_IN", seqNmIn);
				
			cmd.execute();


		}
		
		public static void pSelectShrtcknByMulti(NNumber pidmIn,NString termIn,NString crnIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKSELS.P_SELECT_SHRTCKN_BY_MULTI", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CRN_IN", crnIn);
				
			cmd.execute();


		}
		
		public static void pSelectShrtcknByPidmTerm(NNumber pidmIn,NString termIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKSELS.P_SELECT_SHRTCKN_BY_PIDM_TERM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
				
			cmd.execute();


		}
		
		public static void pSelectShrtgpaByMulti(NNumber pidmIn,NString termIn,NString levlIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKSELS.P_SELECT_SHRTGPA_BY_MULTI", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@LEVL_IN", levlIn);
				
			cmd.execute();


		}
		
		public static void pSelectShrttrmByPidmTerm(NNumber pidmIn,NString termIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKSELS.P_SELECT_SHRTTRM_BY_PIDM_TERM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
				
			cmd.execute();


		}
		
	
	
	
}
