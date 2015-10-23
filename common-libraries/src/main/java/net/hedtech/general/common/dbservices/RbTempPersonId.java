package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RbTempPersonId {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_PERSON_ID.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pPidm,NString pId,NString pLastName,NString pFirstName,NString pMi,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_PERSON_ID.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_FIRST_NAME", pFirstName);
			cmd.addParameter("@P_MI", pMi);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(TempPersonIdRecRow recOne,TempPersonIdRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_PERSON_ID.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, TempPersonIdRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, TempPersonIdRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pPidm,NString pId,NString pLastName,NString pFirstName,NString pMi) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_PERSON_ID.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_FIRST_NAME", pFirstName);
			cmd.addParameter("@P_MI", pMi);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_PERSON_ID.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPidm,NString pId,NString pLastName,NString pFirstName,NString pMi) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_PERSON_ID.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_FIRST_NAME", pFirstName);
			cmd.addParameter("@P_MI", pMi);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pPidm,NString pId,NString pLastName,NString pFirstName,NString pMi,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_PERSON_ID.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_FIRST_NAME", pFirstName);
			cmd.addParameter("@P_MI", pMi);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NNumber pPidm,NString pId,NString pLastName,NString pFirstName,NString pMi,NString pChangeInd,NString pEntityInd,NString pStatInd,NString pInfcCode,NNumber pMatchPidm,NString pSearchLastName,NString pSearchFirstName,NString pSearchMi,NString pError,NString pSort,NString pAidyCode,NString pDupStatCde,NString pDeleteFlag,NString pSurnamePrefix,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_PERSON_ID.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_FIRST_NAME", pFirstName);
			cmd.addParameter("@P_MI", pMi);
			cmd.addParameter("@P_CHANGE_IND", pChangeInd);
			cmd.addParameter("@P_ENTITY_IND", pEntityInd);
			cmd.addParameter("@P_STAT_IND", pStatInd);
			cmd.addParameter("@P_INFC_CODE", pInfcCode);
			cmd.addParameter("@P_MATCH_PIDM", pMatchPidm);
			cmd.addParameter("@P_SEARCH_LAST_NAME", pSearchLastName);
			cmd.addParameter("@P_SEARCH_FIRST_NAME", pSearchFirstName);
			cmd.addParameter("@P_SEARCH_MI", pSearchMi);
			cmd.addParameter("@P_ERROR", pError);
			cmd.addParameter("@P_SORT", pSort);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_DUP_STAT_CDE", pDupStatCde);
			cmd.addParameter("@P_DELETE_FLAG", pDeleteFlag);
			cmd.addParameter("@P_SURNAME_PREFIX", pSurnamePrefix);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pPidm,NString pId,NString pLastName,NString pFirstName,NString pMi,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_PERSON_ID.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_FIRST_NAME", pFirstName);
			cmd.addParameter("@P_MI", pMi);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pDeleteBulk(NString pAidyCode,NString pInfcCode,NString pDeleteFlag,Ref<NNumber> pDelCountOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_PERSON_ID.P_DELETE_BULK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_INFC_CODE", pInfcCode);
			cmd.addParameter("@P_DELETE_FLAG", pDeleteFlag);
			cmd.addParameter("@P_DEL_COUNT_OUT", NNumber.class);
				
			cmd.execute();
			pDelCountOut.val = cmd.getParameterValue("@P_DEL_COUNT_OUT", NNumber.class);


		}
		
		public static void pLock(NNumber pPidm,NString pId,NString pLastName,NString pFirstName,NString pMi,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_PERSON_ID.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_FIRST_NAME", pFirstName);
			cmd.addParameter("@P_MI", pMi);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pPidm,NString pId,NString pLastName,NString pFirstName,NString pMi,NString pChangeInd,NString pEntityInd,NString pStatInd,NString pInfcCode,NNumber pMatchPidm,NString pSearchLastName,NString pSearchFirstName,NString pSearchMi,NString pError,NString pSort,NString pAidyCode,NString pDupStatCde,NString pDeleteFlag,NString pSurnamePrefix,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_PERSON_ID.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_FIRST_NAME", pFirstName);
			cmd.addParameter("@P_MI", pMi);
			cmd.addParameter("@P_CHANGE_IND", pChangeInd);
			cmd.addParameter("@P_ENTITY_IND", pEntityInd);
			cmd.addParameter("@P_STAT_IND", pStatInd);
			cmd.addParameter("@P_INFC_CODE", pInfcCode);
			cmd.addParameter("@P_MATCH_PIDM", pMatchPidm);
			cmd.addParameter("@P_SEARCH_LAST_NAME", pSearchLastName);
			cmd.addParameter("@P_SEARCH_FIRST_NAME", pSearchFirstName);
			cmd.addParameter("@P_SEARCH_MI", pSearchMi);
			cmd.addParameter("@P_ERROR", pError);
			cmd.addParameter("@P_SORT", pSort);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_DUP_STAT_CDE", pDupStatCde);
			cmd.addParameter("@P_DELETE_FLAG", pDeleteFlag);
			cmd.addParameter("@P_SURNAME_PREFIX", pSurnamePrefix);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="TempPersonIdRecRow", dataSourceName="TEMP_PERSON_ID_REC")
	public static class TempPersonIdRecRow
	{
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_ID")
		public NString RId;
		@DbRecordField(dataSourceName="R_LAST_NAME")
		public NString RLastName;
		@DbRecordField(dataSourceName="R_FIRST_NAME")
		public NString RFirstName;
		@DbRecordField(dataSourceName="R_MI")
		public NString RMi;
		@DbRecordField(dataSourceName="R_CHANGE_IND")
		public NString RChangeInd;
		@DbRecordField(dataSourceName="R_ENTITY_IND")
		public NString REntityInd;
		@DbRecordField(dataSourceName="R_STAT_IND")
		public NString RStatInd;
		@DbRecordField(dataSourceName="R_INFC_CODE")
		public NString RInfcCode;
		@DbRecordField(dataSourceName="R_MATCH_PIDM")
		public NNumber RMatchPidm;
		@DbRecordField(dataSourceName="R_SEARCH_LAST_NAME")
		public NString RSearchLastName;
		@DbRecordField(dataSourceName="R_SEARCH_FIRST_NAME")
		public NString RSearchFirstName;
		@DbRecordField(dataSourceName="R_SEARCH_MI")
		public NString RSearchMi;
		@DbRecordField(dataSourceName="R_ERROR")
		public NString RError;
		@DbRecordField(dataSourceName="R_SORT")
		public NString RSort;
		@DbRecordField(dataSourceName="R_AIDY_CODE")
		public NString RAidyCode;
		@DbRecordField(dataSourceName="R_DUP_STAT_CDE")
		public NString RDupStatCde;
		@DbRecordField(dataSourceName="R_DELETE_FLAG")
		public NString RDeleteFlag;
		@DbRecordField(dataSourceName="R_SURNAME_PREFIX")
		public NString RSurnamePrefix;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
