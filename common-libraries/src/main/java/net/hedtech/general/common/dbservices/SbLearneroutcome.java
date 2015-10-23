package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbLearneroutcome {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_LEARNEROUTCOME.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pPidm,NNumber pSeqNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_LEARNEROUTCOME.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(LearneroutcomeRecRow recOne,LearneroutcomeRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_LEARNEROUTCOME.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, LearneroutcomeRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, LearneroutcomeRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pPidm,NNumber pSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_LEARNEROUTCOME.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_LEARNEROUTCOME.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPidm,NNumber pSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_LEARNEROUTCOME.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pPidm,NNumber pSeqNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_LEARNEROUTCOME.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NNumber pPidm,NNumber pSeqNo,NString pDegsCode,NDate pApplDate,NDate pGradDate,NString pAcyrCodeBulletin,NString pTermCodeSturec,NString pTermCodeGrad,NString pAcyrCode,NString pGrstCode,NString pFeeInd,NDate pFeeDate,NString pAuthorized,NString pTermCodeCompleted,NString pDegcCodeDual,NString pLevlCodeDual,NString pDeptCodeDual,NString pCollCodeDual,NString pMajrCodeDual,NString pUserId,NString pDataOrigin,Ref<NString> pRowidOut,NNumber pStspKeySequence) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_LEARNEROUTCOME.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_DEGS_CODE", pDegsCode);
			cmd.addParameter("@P_APPL_DATE", pApplDate);
			cmd.addParameter("@P_GRAD_DATE", pGradDate);
			cmd.addParameter("@P_ACYR_CODE_BULLETIN", pAcyrCodeBulletin);
			cmd.addParameter("@P_TERM_CODE_STUREC", pTermCodeSturec);
			cmd.addParameter("@P_TERM_CODE_GRAD", pTermCodeGrad);
			cmd.addParameter("@P_ACYR_CODE", pAcyrCode);
			cmd.addParameter("@P_GRST_CODE", pGrstCode);
			cmd.addParameter("@P_FEE_IND", pFeeInd);
			cmd.addParameter("@P_FEE_DATE", pFeeDate);
			cmd.addParameter("@P_AUTHORIZED", pAuthorized);
			cmd.addParameter("@P_TERM_CODE_COMPLETED", pTermCodeCompleted);
			cmd.addParameter("@P_DEGC_CODE_DUAL", pDegcCodeDual);
			cmd.addParameter("@P_LEVL_CODE_DUAL", pLevlCodeDual);
			cmd.addParameter("@P_DEPT_CODE_DUAL", pDeptCodeDual);
			cmd.addParameter("@P_COLL_CODE_DUAL", pCollCodeDual);
			cmd.addParameter("@P_MAJR_CODE_DUAL", pMajrCodeDual);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
			cmd.addParameter("@P_STSP_KEY_SEQUENCE", pStspKeySequence);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pPidm,NNumber pSeqNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_LEARNEROUTCOME.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pPidm,NNumber pSeqNo,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_LEARNEROUTCOME.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pPidm,NNumber pSeqNo,NString pDegsCode,NDate pApplDate,NDate pGradDate,NString pAcyrCodeBulletin,NString pTermCodeSturec,NString pTermCodeGrad,NString pAcyrCode,NString pGrstCode,NString pFeeInd,NDate pFeeDate,NString pAuthorized,NString pTermCodeCompleted,NString pDegcCodeDual,NString pLevlCodeDual,NString pDeptCodeDual,NString pCollCodeDual,NString pMajrCodeDual,NString pUserId,NString pDataOrigin,NString pRowid,NNumber pStspKeySequence) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_LEARNEROUTCOME.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_DEGS_CODE", pDegsCode);
			cmd.addParameter("@P_APPL_DATE", pApplDate);
			cmd.addParameter("@P_GRAD_DATE", pGradDate);
			cmd.addParameter("@P_ACYR_CODE_BULLETIN", pAcyrCodeBulletin);
			cmd.addParameter("@P_TERM_CODE_STUREC", pTermCodeSturec);
			cmd.addParameter("@P_TERM_CODE_GRAD", pTermCodeGrad);
			cmd.addParameter("@P_ACYR_CODE", pAcyrCode);
			cmd.addParameter("@P_GRST_CODE", pGrstCode);
			cmd.addParameter("@P_FEE_IND", pFeeInd);
			cmd.addParameter("@P_FEE_DATE", pFeeDate);
			cmd.addParameter("@P_AUTHORIZED", pAuthorized);
			cmd.addParameter("@P_TERM_CODE_COMPLETED", pTermCodeCompleted);
			cmd.addParameter("@P_DEGC_CODE_DUAL", pDegcCodeDual);
			cmd.addParameter("@P_LEVL_CODE_DUAL", pLevlCodeDual);
			cmd.addParameter("@P_DEPT_CODE_DUAL", pDeptCodeDual);
			cmd.addParameter("@P_COLL_CODE_DUAL", pCollCodeDual);
			cmd.addParameter("@P_MAJR_CODE_DUAL", pMajrCodeDual);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
			cmd.addParameter("@P_STSP_KEY_SEQUENCE", pStspKeySequence);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="LearneroutcomeRecRow", dataSourceName="LEARNEROUTCOME_REC")
	public static class LearneroutcomeRecRow
	{
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_SEQ_NO")
		public NNumber RSeqNo;
		@DbRecordField(dataSourceName="R_DEGC_CODE")
		public NString RDegcCode;
		@DbRecordField(dataSourceName="R_DEGS_CODE")
		public NString RDegsCode;
		@DbRecordField(dataSourceName="R_LEVL_CODE")
		public NString RLevlCode;
		@DbRecordField(dataSourceName="R_COLL_CODE_1")
		public NString RCollCode1;
		@DbRecordField(dataSourceName="R_MAJR_CODE_1")
		public NString RMajrCode1;
		@DbRecordField(dataSourceName="R_MAJR_CODE_MINR_1")
		public NString RMajrCodeMinr1;
		@DbRecordField(dataSourceName="R_MAJR_CODE_CONC_1")
		public NString RMajrCodeConc1;
		@DbRecordField(dataSourceName="R_COLL_CODE_2")
		public NString RCollCode2;
		@DbRecordField(dataSourceName="R_MAJR_CODE_2")
		public NString RMajrCode2;
		@DbRecordField(dataSourceName="R_MAJR_CODE_MINR_2")
		public NString RMajrCodeMinr2;
		@DbRecordField(dataSourceName="R_MAJR_CODE_CONC_2")
		public NString RMajrCodeConc2;
		@DbRecordField(dataSourceName="R_APPL_DATE")
		public NDate RApplDate;
		@DbRecordField(dataSourceName="R_GRAD_DATE")
		public NDate RGradDate;
		@DbRecordField(dataSourceName="R_ACYR_CODE_BULLETIN")
		public NString RAcyrCodeBulletin;
		@DbRecordField(dataSourceName="R_MAJR_CODE_MINR_1_2")
		public NString RMajrCodeMinr12;
		@DbRecordField(dataSourceName="R_MAJR_CODE_CONC_1_2")
		public NString RMajrCodeConc12;
		@DbRecordField(dataSourceName="R_MAJR_CODE_CONC_1_3")
		public NString RMajrCodeConc13;
		@DbRecordField(dataSourceName="R_MAJR_CODE_MINR_2_2")
		public NString RMajrCodeMinr22;
		@DbRecordField(dataSourceName="R_MAJR_CODE_CONC_2_2")
		public NString RMajrCodeConc22;
		@DbRecordField(dataSourceName="R_MAJR_CODE_CONC_2_3")
		public NString RMajrCodeConc23;
		@DbRecordField(dataSourceName="R_TERM_CODE_STUREC")
		public NString RTermCodeSturec;
		@DbRecordField(dataSourceName="R_MAJR_CODE_1_2")
		public NString RMajrCode12;
		@DbRecordField(dataSourceName="R_MAJR_CODE_2_2")
		public NString RMajrCode22;
		@DbRecordField(dataSourceName="R_CAMP_CODE")
		public NString RCampCode;
		@DbRecordField(dataSourceName="R_TERM_CODE_GRAD")
		public NString RTermCodeGrad;
		@DbRecordField(dataSourceName="R_ACYR_CODE")
		public NString RAcyrCode;
		@DbRecordField(dataSourceName="R_GRST_CODE")
		public NString RGrstCode;
		@DbRecordField(dataSourceName="R_FEE_IND")
		public NString RFeeInd;
		@DbRecordField(dataSourceName="R_FEE_DATE")
		public NDate RFeeDate;
		@DbRecordField(dataSourceName="R_AUTHORIZED")
		public NString RAuthorized;
		@DbRecordField(dataSourceName="R_TERM_CODE_COMPLETED")
		public NString RTermCodeCompleted;
		@DbRecordField(dataSourceName="R_DEGC_CODE_DUAL")
		public NString RDegcCodeDual;
		@DbRecordField(dataSourceName="R_LEVL_CODE_DUAL")
		public NString RLevlCodeDual;
		@DbRecordField(dataSourceName="R_DEPT_CODE_DUAL")
		public NString RDeptCodeDual;
		@DbRecordField(dataSourceName="R_COLL_CODE_DUAL")
		public NString RCollCodeDual;
		@DbRecordField(dataSourceName="R_MAJR_CODE_DUAL")
		public NString RMajrCodeDual;
		@DbRecordField(dataSourceName="R_DEPT_CODE")
		public NString RDeptCode;
		@DbRecordField(dataSourceName="R_DEPT_CODE_2")
		public NString RDeptCode2;
		@DbRecordField(dataSourceName="R_PROGRAM")
		public NString RProgram;
		@DbRecordField(dataSourceName="R_TERM_CODE_CTLG_1")
		public NString RTermCodeCtlg1;
		@DbRecordField(dataSourceName="R_DEPT_CODE_1_2")
		public NString RDeptCode12;
		@DbRecordField(dataSourceName="R_DEPT_CODE_2_2")
		public NString RDeptCode22;
		@DbRecordField(dataSourceName="R_MAJR_CODE_CONC_121")
		public NString RMajrCodeConc121;
		@DbRecordField(dataSourceName="R_MAJR_CODE_CONC_122")
		public NString RMajrCodeConc122;
		@DbRecordField(dataSourceName="R_MAJR_CODE_CONC_123")
		public NString RMajrCodeConc123;
		@DbRecordField(dataSourceName="R_TERM_CODE_CTLG_2")
		public NString RTermCodeCtlg2;
		@DbRecordField(dataSourceName="R_CAMP_CODE_2")
		public NString RCampCode2;
		@DbRecordField(dataSourceName="R_MAJR_CODE_CONC_221")
		public NString RMajrCodeConc221;
		@DbRecordField(dataSourceName="R_MAJR_CODE_CONC_222")
		public NString RMajrCodeConc222;
		@DbRecordField(dataSourceName="R_MAJR_CODE_CONC_223")
		public NString RMajrCodeConc223;
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
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
		@DbRecordField(dataSourceName="R_STSP_KEY_SEQUENCE")
		public NNumber RStspKeySequence;
	}

	
	
}
