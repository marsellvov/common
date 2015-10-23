package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RbFaAthContExempt {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_FA_ATH_CONT_EXEMPT.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pPidm,NString pPeriod,NString pTermCode,NString pFaspCode,NString pTypeInd,NNumber pContractPidm,NNumber pContractExemptNumber,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_FA_ATH_CONT_EXEMPT.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_FASP_CODE", pFaspCode);
			cmd.addParameter("@P_TYPE_IND", pTypeInd);
			cmd.addParameter("@P_CONTRACT_PIDM", pContractPidm);
			cmd.addParameter("@P_CONTRACT_EXEMPT_NUMBER", pContractExemptNumber);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(FaAthContExemptRecRow recOne,FaAthContExemptRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_FA_ATH_CONT_EXEMPT.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, FaAthContExemptRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, FaAthContExemptRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pPidm,NString pPeriod,NString pTermCode,NString pFaspCode,NString pTypeInd,NNumber pContractPidm,NNumber pContractExemptNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_FA_ATH_CONT_EXEMPT.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_FASP_CODE", pFaspCode);
			cmd.addParameter("@P_TYPE_IND", pTypeInd);
			cmd.addParameter("@P_CONTRACT_PIDM", pContractPidm);
			cmd.addParameter("@P_CONTRACT_EXEMPT_NUMBER", pContractExemptNumber);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_FA_ATH_CONT_EXEMPT.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPidm,NString pPeriod,NString pTermCode,NString pFaspCode,NString pTypeInd,NNumber pContractPidm,NNumber pContractExemptNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_FA_ATH_CONT_EXEMPT.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_FASP_CODE", pFaspCode);
			cmd.addParameter("@P_TYPE_IND", pTypeInd);
			cmd.addParameter("@P_CONTRACT_PIDM", pContractPidm);
			cmd.addParameter("@P_CONTRACT_EXEMPT_NUMBER", pContractExemptNumber);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pPidm,NString pPeriod,NString pTermCode,NString pFaspCode,NString pTypeInd,NNumber pContractPidm,NNumber pContractExemptNumber,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_FA_ATH_CONT_EXEMPT.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_FASP_CODE", pFaspCode);
			cmd.addParameter("@P_TYPE_IND", pTypeInd);
			cmd.addParameter("@P_CONTRACT_PIDM", pContractPidm);
			cmd.addParameter("@P_CONTRACT_EXEMPT_NUMBER", pContractExemptNumber);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NNumber pPidm,NString pPeriod,NString pTermCode,NString pFaspCode,NString pTypeInd,NNumber pContractPidm,NNumber pContractExemptNumber,NNumber pReportedAmt,NString pIndividualLimitInd,NString pTeamLimitInd,NString pCoaLimitInd,NString pReviewedCode,NString pUserId,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_FA_ATH_CONT_EXEMPT.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_FASP_CODE", pFaspCode);
			cmd.addParameter("@P_TYPE_IND", pTypeInd);
			cmd.addParameter("@P_CONTRACT_PIDM", pContractPidm);
			cmd.addParameter("@P_CONTRACT_EXEMPT_NUMBER", pContractExemptNumber);
			cmd.addParameter("@P_REPORTED_AMT", pReportedAmt);
			cmd.addParameter("@P_INDIVIDUAL_LIMIT_IND", pIndividualLimitInd);
			cmd.addParameter("@P_TEAM_LIMIT_IND", pTeamLimitInd);
			cmd.addParameter("@P_COA_LIMIT_IND", pCoaLimitInd);
			cmd.addParameter("@P_REVIEWED_CODE", pReviewedCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pPidm,NString pPeriod,NString pTermCode,NString pFaspCode,NString pTypeInd,NNumber pContractPidm,NNumber pContractExemptNumber,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_FA_ATH_CONT_EXEMPT.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_FASP_CODE", pFaspCode);
			cmd.addParameter("@P_TYPE_IND", pTypeInd);
			cmd.addParameter("@P_CONTRACT_PIDM", pContractPidm);
			cmd.addParameter("@P_CONTRACT_EXEMPT_NUMBER", pContractExemptNumber);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pPidm,NString pPeriod,NString pTermCode,NString pFaspCode,NString pTypeInd,NNumber pContractPidm,NNumber pContractExemptNumber,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_FA_ATH_CONT_EXEMPT.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_FASP_CODE", pFaspCode);
			cmd.addParameter("@P_TYPE_IND", pTypeInd);
			cmd.addParameter("@P_CONTRACT_PIDM", pContractPidm);
			cmd.addParameter("@P_CONTRACT_EXEMPT_NUMBER", pContractExemptNumber);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pPidm,NString pPeriod,NString pTermCode,NString pFaspCode,NString pTypeInd,NNumber pContractPidm,NNumber pContractExemptNumber,NNumber pReportedAmt,NString pIndividualLimitInd,NString pTeamLimitInd,NString pCoaLimitInd,NString pReviewedCode,NString pUserId,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_FA_ATH_CONT_EXEMPT.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_FASP_CODE", pFaspCode);
			cmd.addParameter("@P_TYPE_IND", pTypeInd);
			cmd.addParameter("@P_CONTRACT_PIDM", pContractPidm);
			cmd.addParameter("@P_CONTRACT_EXEMPT_NUMBER", pContractExemptNumber);
			cmd.addParameter("@P_REPORTED_AMT", pReportedAmt);
			cmd.addParameter("@P_INDIVIDUAL_LIMIT_IND", pIndividualLimitInd);
			cmd.addParameter("@P_TEAM_LIMIT_IND", pTeamLimitInd);
			cmd.addParameter("@P_COA_LIMIT_IND", pCoaLimitInd);
			cmd.addParameter("@P_REVIEWED_CODE", pReviewedCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="FaAthContExemptRecRow", dataSourceName="FA_ATH_CONT_EXEMPT_REC")
	public static class FaAthContExemptRecRow
	{
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_PERIOD")
		public NString RPeriod;
		@DbRecordField(dataSourceName="R_TERM_CODE")
		public NString RTermCode;
		@DbRecordField(dataSourceName="R_FASP_CODE")
		public NString RFaspCode;
		@DbRecordField(dataSourceName="R_TYPE_IND")
		public NString RTypeInd;
		@DbRecordField(dataSourceName="R_CONTRACT_PIDM")
		public NNumber RContractPidm;
		@DbRecordField(dataSourceName="R_CONTRACT_EXEMPT_NUMBER")
		public NNumber RContractExemptNumber;
		@DbRecordField(dataSourceName="R_REPORTED_AMT")
		public NNumber RReportedAmt;
		@DbRecordField(dataSourceName="R_INDIVIDUAL_LIMIT_IND")
		public NString RIndividualLimitInd;
		@DbRecordField(dataSourceName="R_TEAM_LIMIT_IND")
		public NString RTeamLimitInd;
		@DbRecordField(dataSourceName="R_COA_LIMIT_IND")
		public NString RCoaLimitInd;
		@DbRecordField(dataSourceName="R_REVIEWED_CODE")
		public NString RReviewedCode;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
