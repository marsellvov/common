package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbTestscore {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TESTSCORE.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pPidm,NString pTescCode,NDate pTestDate,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TESTSCORE.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TESC_CODE", pTescCode);
			cmd.addParameter("@P_TEST_DATE", pTestDate);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(TestscoreRecRow recOne,TestscoreRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TESTSCORE.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, TestscoreRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, TestscoreRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TESTSCORE.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TESTSCORE.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPidm,NString pTescCode,NDate pTestDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TESTSCORE.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TESC_CODE", pTescCode);
			cmd.addParameter("@P_TEST_DATE", pTestDate);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pPidm,NString pTescCode,NDate pTestDate,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TESTSCORE.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TESC_CODE", pTescCode);
			cmd.addParameter("@P_TEST_DATE", pTestDate);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NNumber pPidm,NString pTescCode,NDate pTestDate,NString pTestScore,NString pTsrcCode,NString pTadmCode,NString pAdmrCode,NString pTeinCode,NString pTefrCode,NString pTeacCode,NString pTeprCode,NString pRcrvInd,NString pSatOrigScore,NString pTermCodeEntry,NNumber pApplNo,NString pInstrId,NString pReleaseInd,NString pEquivInd,NString pSatEssayId,NString pUserId,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TESTSCORE.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TESC_CODE", pTescCode);
			cmd.addParameter("@P_TEST_DATE", pTestDate);
			cmd.addParameter("@P_TEST_SCORE", pTestScore);
			cmd.addParameter("@P_TSRC_CODE", pTsrcCode);
			cmd.addParameter("@P_TADM_CODE", pTadmCode);
			cmd.addParameter("@P_ADMR_CODE", pAdmrCode);
			cmd.addParameter("@P_TEIN_CODE", pTeinCode);
			cmd.addParameter("@P_TEFR_CODE", pTefrCode);
			cmd.addParameter("@P_TEAC_CODE", pTeacCode);
			cmd.addParameter("@P_TEPR_CODE", pTeprCode);
			cmd.addParameter("@P_RCRV_IND", pRcrvInd);
			cmd.addParameter("@P_SAT_ORIG_SCORE", pSatOrigScore);
			cmd.addParameter("@P_TERM_CODE_ENTRY", pTermCodeEntry);
			cmd.addParameter("@P_APPL_NO", pApplNo);
			cmd.addParameter("@P_INSTR_ID", pInstrId);
			cmd.addParameter("@P_RELEASE_IND", pReleaseInd);
			cmd.addParameter("@P_EQUIV_IND", pEquivInd);
			cmd.addParameter("@P_SAT_ESSAY_ID", pSatEssayId);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pPidm,NString pTescCode,NDate pTestDate,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TESTSCORE.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TESC_CODE", pTescCode);
			cmd.addParameter("@P_TEST_DATE", pTestDate);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pPidm,NString pTescCode,NDate pTestDate,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TESTSCORE.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TESC_CODE", pTescCode);
			cmd.addParameter("@P_TEST_DATE", pTestDate);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pPidm,NString pTescCode,NDate pTestDate,NString pTestScore,NString pTsrcCode,NString pTadmCode,NString pAdmrCode,NString pTeinCode,NString pTefrCode,NString pTeacCode,NString pTeprCode,NString pRcrvInd,NString pSatOrigScore,NString pTermCodeEntry,NNumber pApplNo,NString pInstrId,NString pReleaseInd,NString pEquivInd,NString pSatEssayId,NString pUserId,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TESTSCORE.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TESC_CODE", pTescCode);
			cmd.addParameter("@P_TEST_DATE", pTestDate);
			cmd.addParameter("@P_TEST_SCORE", pTestScore);
			cmd.addParameter("@P_TSRC_CODE", pTsrcCode);
			cmd.addParameter("@P_TADM_CODE", pTadmCode);
			cmd.addParameter("@P_ADMR_CODE", pAdmrCode);
			cmd.addParameter("@P_TEIN_CODE", pTeinCode);
			cmd.addParameter("@P_TEFR_CODE", pTefrCode);
			cmd.addParameter("@P_TEAC_CODE", pTeacCode);
			cmd.addParameter("@P_TEPR_CODE", pTeprCode);
			cmd.addParameter("@P_RCRV_IND", pRcrvInd);
			cmd.addParameter("@P_SAT_ORIG_SCORE", pSatOrigScore);
			cmd.addParameter("@P_TERM_CODE_ENTRY", pTermCodeEntry);
			cmd.addParameter("@P_APPL_NO", pApplNo);
			cmd.addParameter("@P_INSTR_ID", pInstrId);
			cmd.addParameter("@P_RELEASE_IND", pReleaseInd);
			cmd.addParameter("@P_EQUIV_IND", pEquivInd);
			cmd.addParameter("@P_SAT_ESSAY_ID", pSatEssayId);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="TestscoreRecRow", dataSourceName="TESTSCORE_REC")
	public static class TestscoreRecRow
	{
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_TESC_CODE")
		public NString RTescCode;
		@DbRecordField(dataSourceName="R_TEST_DATE")
		public NDate RTestDate;
		@DbRecordField(dataSourceName="R_TEST_SCORE")
		public NString RTestScore;
		@DbRecordField(dataSourceName="R_TSRC_CODE")
		public NString RTsrcCode;
		@DbRecordField(dataSourceName="R_TADM_CODE")
		public NString RTadmCode;
		@DbRecordField(dataSourceName="R_ADMR_CODE")
		public NString RAdmrCode;
		@DbRecordField(dataSourceName="R_TEIN_CODE")
		public NString RTeinCode;
		@DbRecordField(dataSourceName="R_TEFR_CODE")
		public NString RTefrCode;
		@DbRecordField(dataSourceName="R_TEAC_CODE")
		public NString RTeacCode;
		@DbRecordField(dataSourceName="R_TEPR_CODE")
		public NString RTeprCode;
		@DbRecordField(dataSourceName="R_RCRV_IND")
		public NString RRcrvInd;
		@DbRecordField(dataSourceName="R_SAT_ORIG_SCORE")
		public NString RSatOrigScore;
		@DbRecordField(dataSourceName="R_TERM_CODE_ENTRY")
		public NString RTermCodeEntry;
		@DbRecordField(dataSourceName="R_APPL_NO")
		public NNumber RApplNo;
		@DbRecordField(dataSourceName="R_INSTR_ID")
		public NString RInstrId;
		@DbRecordField(dataSourceName="R_RELEASE_IND")
		public NString RReleaseInd;
		@DbRecordField(dataSourceName="R_EQUIV_IND")
		public NString REquivInd;
		@DbRecordField(dataSourceName="R_SAT_ESSAY_ID")
		public NString RSatEssayId;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
