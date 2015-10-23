package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RbGeneralAlgoRules {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_GENERAL_ALGO_RULES.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pAidyCode,NString pProcess,NString pPtypCode,NString pAlgoCode,NNumber pSeqNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_GENERAL_ALGO_RULES.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PROCESS", pProcess);
			cmd.addParameter("@P_PTYP_CODE", pPtypCode);
			cmd.addParameter("@P_ALGO_CODE", pAlgoCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(GeneralAlgoRulesRecRow recOne,GeneralAlgoRulesRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_GENERAL_ALGO_RULES.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, GeneralAlgoRulesRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, GeneralAlgoRulesRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pAidyCode,NString pProcess,NString pPtypCode,NString pAlgoCode,NNumber pSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_GENERAL_ALGO_RULES.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PROCESS", pProcess);
			cmd.addParameter("@P_PTYP_CODE", pPtypCode);
			cmd.addParameter("@P_ALGO_CODE", pAlgoCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_GENERAL_ALGO_RULES.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pAidyCode,NString pProcess,NString pPtypCode,NString pAlgoCode,NNumber pSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_GENERAL_ALGO_RULES.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PROCESS", pProcess);
			cmd.addParameter("@P_PTYP_CODE", pPtypCode);
			cmd.addParameter("@P_ALGO_CODE", pAlgoCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pAidyCode,NString pProcess,NString pPtypCode,NString pAlgoCode,NNumber pSeqNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_GENERAL_ALGO_RULES.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PROCESS", pProcess);
			cmd.addParameter("@P_PTYP_CODE", pPtypCode);
			cmd.addParameter("@P_ALGO_CODE", pAlgoCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pAidyCode,NString pProcess,NString pAlgoCode,NNumber pSeqNo,NString pActiveInd,NString pValidatedInd,NString pSqlStatement,NString pPtypCode,NString pUserId,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_GENERAL_ALGO_RULES.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PROCESS", pProcess);
			cmd.addParameter("@P_ALGO_CODE", pAlgoCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ACTIVE_IND", pActiveInd);
			cmd.addParameter("@P_VALIDATED_IND", pValidatedInd);
			cmd.addParameter("@P_SQL_STATEMENT", pSqlStatement);
			cmd.addParameter("@P_PTYP_CODE", pPtypCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pAidyCode,NString pProcess,NString pPtypCode,NString pAlgoCode,NNumber pSeqNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_GENERAL_ALGO_RULES.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PROCESS", pProcess);
			cmd.addParameter("@P_PTYP_CODE", pPtypCode);
			cmd.addParameter("@P_ALGO_CODE", pAlgoCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pAidyCode,NString pProcess,NString pPtypCode,NString pAlgoCode,NNumber pSeqNo,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_GENERAL_ALGO_RULES.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PROCESS", pProcess);
			cmd.addParameter("@P_PTYP_CODE", pPtypCode);
			cmd.addParameter("@P_ALGO_CODE", pAlgoCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pAidyCode,NString pProcess,NString pAlgoCode,NNumber pSeqNo,NString pActiveInd,NString pValidatedInd,NString pSqlStatement,NString pPtypCode,NString pUserId,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_GENERAL_ALGO_RULES.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PROCESS", pProcess);
			cmd.addParameter("@P_ALGO_CODE", pAlgoCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ACTIVE_IND", pActiveInd);
			cmd.addParameter("@P_VALIDATED_IND", pValidatedInd);
			cmd.addParameter("@P_SQL_STATEMENT", pSqlStatement);
			cmd.addParameter("@P_PTYP_CODE", pPtypCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="GeneralAlgoRulesRecRow", dataSourceName="GENERAL_ALGO_RULES_REC")
	public static class GeneralAlgoRulesRecRow
	{
		@DbRecordField(dataSourceName="R_AIDY_CODE")
		public NString RAidyCode;
		@DbRecordField(dataSourceName="R_PROCESS")
		public NString RProcess;
		@DbRecordField(dataSourceName="R_ALGO_CODE")
		public NString RAlgoCode;
		@DbRecordField(dataSourceName="R_SEQ_NO")
		public NNumber RSeqNo;
		@DbRecordField(dataSourceName="R_ACTIVE_IND")
		public NString RActiveInd;
		@DbRecordField(dataSourceName="R_VALIDATED_IND")
		public NString RValidatedInd;
		@DbRecordField(dataSourceName="R_SQL_STATEMENT")
		public NString RSqlStatement;
		@DbRecordField(dataSourceName="R_PTYP_CODE")
		public NString RPtypCode;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
