package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbAthleticCompetition {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ATHLETIC_COMPETITION.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NInteger fCalcSeasonsRemaining(NNumber pSeasonsAvail,NInteger pSeasonsUsed) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ATHLETIC_COMPETITION.F_CALC_SEASONS_REMAINING", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
			cmd.addParameter("@P_SEASONS_AVAIL", pSeasonsAvail);
			cmd.addParameter("@P_SEASONS_USED", pSeasonsUsed);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NInteger fCalcSeasonsUsed(NNumber pPidm,NString pTermCode,NString pActcCode,NNumber pSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ATHLETIC_COMPETITION.F_CALC_SEASONS_USED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_ACTC_CODE", pActcCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fCopyCompetition(NNumber pPidm,NString pActcCode,NString pFromTermCode,NString pToTermCode,NString pSeasonUsedInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ATHLETIC_COMPETITION.F_COPY_COMPETITION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ACTC_CODE", pActcCode);
			cmd.addParameter("@P_FROM_TERM_CODE", pFromTermCode);
			cmd.addParameter("@P_TO_TERM_CODE", pToTermCode);
			cmd.addParameter("@P_SEASON_USED_IND", pSeasonUsedInd);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCopyCompetitionValidation(NNumber pPidm,NString pActcCode,NString pFromTerm,NString pToTerm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ATHLETIC_COMPETITION.F_COPY_COMPETITION_VALIDATION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ACTC_CODE", pActcCode);
			cmd.addParameter("@P_FROM_TERM", pFromTerm);
			cmd.addParameter("@P_TO_TERM", pToTerm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCurrentExists(NNumber pPidm,NString pActcCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ATHLETIC_COMPETITION.F_CURRENT_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ACTC_CODE", pActcCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fExists(NNumber pPidm,NString pTermCode,NString pActcCode,NNumber pSeqNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ATHLETIC_COMPETITION.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_ACTC_CODE", pActcCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fFindMaxCompetitionTerm(NNumber pPidm,NString pActcCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ATHLETIC_COMPETITION.F_FIND_MAX_COMPETITION_TERM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ACTC_CODE", pActcCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(AthleticCompetitionRecRow recOne,AthleticCompetitionRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ATHLETIC_COMPETITION.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, AthleticCompetitionRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, AthleticCompetitionRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pPidm,NString pTermCode,NString pActcCode,NNumber pSeqNo,NString pCurrentInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ATHLETIC_COMPETITION.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_ACTC_CODE", pActcCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_CURRENT_IND", pCurrentInd);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ATHLETIC_COMPETITION.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryCurrent(NNumber pPidm,NString pActcCode,NString pTermCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ATHLETIC_COMPETITION.F_QUERY_CURRENT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ACTC_CODE", pActcCode);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPidm,NString pTermCode,NString pActcCode,NNumber pSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ATHLETIC_COMPETITION.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_ACTC_CODE", pActcCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pPidm,NString pTermCode,NString pActcCode,NNumber pSeqNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ATHLETIC_COMPETITION.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_ACTC_CODE", pActcCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static NString fSameAsCurrent(NNumber pPidm,NString pTermCode,NString pActcCode,NNumber pSeasonsAvailable,NString pSeasonUsedInd,NString pSareCode,NString pEligBeginTermCode,NString pEligEndTermCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ATHLETIC_COMPETITION.F_SAME_AS_CURRENT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_ACTC_CODE", pActcCode);
			cmd.addParameter("@P_SEASONS_AVAILABLE", pSeasonsAvailable);
			cmd.addParameter("@P_SEASON_USED_IND", pSeasonUsedInd);
			cmd.addParameter("@P_SARE_CODE", pSareCode);
			cmd.addParameter("@P_ELIG_BEGIN_TERM_CODE", pEligBeginTermCode);
			cmd.addParameter("@P_ELIG_END_TERM_CODE", pEligEndTermCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pCreate(NNumber pPidm,NString pTermCode,NString pActcCode,NNumber pSeqNo,NString pCurrentInd,NNumber pSeasonsAvailable,NString pSeasonUsedInd,NString pUserId,NDate pCreateActivityDate,NString pCreateUserId,NString pSareCode,NString pEligBeginTermCode,NString pEligEndTermCode,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ATHLETIC_COMPETITION.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_ACTC_CODE", pActcCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_CURRENT_IND", pCurrentInd);
			cmd.addParameter("@P_SEASONS_AVAILABLE", pSeasonsAvailable);
			cmd.addParameter("@P_SEASON_USED_IND", pSeasonUsedInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_CREATE_ACTIVITY_DATE", pCreateActivityDate);
			cmd.addParameter("@P_CREATE_USER_ID", pCreateUserId);
			cmd.addParameter("@P_SARE_CODE", pSareCode);
			cmd.addParameter("@P_ELIG_BEGIN_TERM_CODE", pEligBeginTermCode);
			cmd.addParameter("@P_ELIG_END_TERM_CODE", pEligEndTermCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pPidm,NString pTermCode,NString pActcCode,NNumber pSeqNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ATHLETIC_COMPETITION.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_ACTC_CODE", pActcCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pPidm,NString pTermCode,NString pActcCode,NNumber pSeqNo,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ATHLETIC_COMPETITION.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_ACTC_CODE", pActcCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pPidm,NString pTermCode,NString pActcCode,NNumber pSeqNo,NString pCurrentInd,NNumber pSeasonsAvailable,NString pSeasonUsedInd,NString pUserId,NDate pCreateActivityDate,NString pCreateUserId,NString pSareCode,NString pEligBeginTermCode,NString pEligEndTermCode,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ATHLETIC_COMPETITION.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_ACTC_CODE", pActcCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_CURRENT_IND", pCurrentInd);
			cmd.addParameter("@P_SEASONS_AVAILABLE", pSeasonsAvailable);
			cmd.addParameter("@P_SEASON_USED_IND", pSeasonUsedInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_CREATE_ACTIVITY_DATE", pCreateActivityDate);
			cmd.addParameter("@P_CREATE_USER_ID", pCreateUserId);
			cmd.addParameter("@P_SARE_CODE", pSareCode);
			cmd.addParameter("@P_ELIG_BEGIN_TERM_CODE", pEligBeginTermCode);
			cmd.addParameter("@P_ELIG_END_TERM_CODE", pEligEndTermCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="AthleticCompetitionRecRow", dataSourceName="ATHLETIC_COMPETITION_REC")
	public static class AthleticCompetitionRecRow
	{
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_TERM_CODE")
		public NString RTermCode;
		@DbRecordField(dataSourceName="R_ACTC_CODE")
		public NString RActcCode;
		@DbRecordField(dataSourceName="R_SEQ_NO")
		public NNumber RSeqNo;
		@DbRecordField(dataSourceName="R_CURRENT_IND")
		public NString RCurrentInd;
		@DbRecordField(dataSourceName="R_SEASONS_AVAILABLE")
		public NNumber RSeasonsAvailable;
		@DbRecordField(dataSourceName="R_SEASON_USED_IND")
		public NString RSeasonUsedInd;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_CREATE_ACTIVITY_DATE")
		public NDate RCreateActivityDate;
		@DbRecordField(dataSourceName="R_CREATE_USER_ID")
		public NString RCreateUserId;
		@DbRecordField(dataSourceName="R_SARE_CODE")
		public NString RSareCode;
		@DbRecordField(dataSourceName="R_ELIG_BEGIN_TERM_CODE")
		public NString REligBeginTermCode;
		@DbRecordField(dataSourceName="R_ELIG_END_TERM_CODE")
		public NString REligEndTermCode;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
