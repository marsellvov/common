package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbCrseChrtRestriction {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_CRSE_CHRT_RESTRICTION.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pPrimaryKey,NString pSubjCode,NString pCrseNumb,NString pEffTerm,NString pRecType,NString pChrtCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_CRSE_CHRT_RESTRICTION.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PRIMARY_KEY", pPrimaryKey);
			cmd.addParameter("@P_SUBJ_CODE", pSubjCode);
			cmd.addParameter("@P_CRSE_NUMB", pCrseNumb);
			cmd.addParameter("@P_EFF_TERM", pEffTerm);
			cmd.addParameter("@P_REC_TYPE", pRecType);
			cmd.addParameter("@P_CHRT_CODE", pChrtCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(CrseChrtRestrictionRecRow recOne,CrseChrtRestrictionRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_CRSE_CHRT_RESTRICTION.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, CrseChrtRestrictionRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, CrseChrtRestrictionRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryActiveMaxTerm(NString pSubjCode,NString pCrseNumb,NString pEffTerm,NString pRecType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_CRSE_CHRT_RESTRICTION.F_QUERY_ACTIVE_MAX_TERM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_SUBJ_CODE", pSubjCode);
			cmd.addParameter("@P_CRSE_NUMB", pCrseNumb);
			cmd.addParameter("@P_EFF_TERM", pEffTerm);
			cmd.addParameter("@P_REC_TYPE", pRecType);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryAll(NString pSubjCode,NString pCrseNumb,NString pEffTerm,NString pRecType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_CRSE_CHRT_RESTRICTION.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_SUBJ_CODE", pSubjCode);
			cmd.addParameter("@P_CRSE_NUMB", pCrseNumb);
			cmd.addParameter("@P_EFF_TERM", pEffTerm);
			cmd.addParameter("@P_REC_TYPE", pRecType);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryAllMaxTerm(NString pSubjCode,NString pCrseNumb,NString pEffTerm,NString pRecType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_CRSE_CHRT_RESTRICTION.F_QUERY_ALL_MAX_TERM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_SUBJ_CODE", pSubjCode);
			cmd.addParameter("@P_CRSE_NUMB", pCrseNumb);
			cmd.addParameter("@P_EFF_TERM", pEffTerm);
			cmd.addParameter("@P_REC_TYPE", pRecType);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_CRSE_CHRT_RESTRICTION.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPrimaryKey,NString pSubjCode,NString pCrseNumb,NString pEffTerm,NString pRecType,NString pChrtCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_CRSE_CHRT_RESTRICTION.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PRIMARY_KEY", pPrimaryKey);
			cmd.addParameter("@P_SUBJ_CODE", pSubjCode);
			cmd.addParameter("@P_CRSE_NUMB", pCrseNumb);
			cmd.addParameter("@P_EFF_TERM", pEffTerm);
			cmd.addParameter("@P_REC_TYPE", pRecType);
			cmd.addParameter("@P_CHRT_CODE", pChrtCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pPrimaryKey,NString pSubjCode,NString pCrseNumb,NString pEffTerm,NString pRecType,NString pChrtCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_CRSE_CHRT_RESTRICTION.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PRIMARY_KEY", pPrimaryKey);
			cmd.addParameter("@P_SUBJ_CODE", pSubjCode);
			cmd.addParameter("@P_CRSE_NUMB", pCrseNumb);
			cmd.addParameter("@P_EFF_TERM", pEffTerm);
			cmd.addParameter("@P_REC_TYPE", pRecType);
			cmd.addParameter("@P_CHRT_CODE", pChrtCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCopyRestrictions(NString pSubjCode,NString pCrseNumb,NString pFromTerm,NString pToTerm,NString pUserId,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_CRSE_CHRT_RESTRICTION.P_COPY_RESTRICTIONS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SUBJ_CODE", pSubjCode);
			cmd.addParameter("@P_CRSE_NUMB", pCrseNumb);
			cmd.addParameter("@P_FROM_TERM", pFromTerm);
			cmd.addParameter("@P_TO_TERM", pToTerm);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
		public static void pCreate(NString pSubjCode,NString pCrseNumb,NString pEffTerm,NString pRecType,NString pUserId,NString pChrtIeCde,NString pChrtCode,NString pDataOrigin,Ref<NNumber> pPrimaryKeyOut,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_CRSE_CHRT_RESTRICTION.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SUBJ_CODE", pSubjCode);
			cmd.addParameter("@P_CRSE_NUMB", pCrseNumb);
			cmd.addParameter("@P_EFF_TERM", pEffTerm);
			cmd.addParameter("@P_REC_TYPE", pRecType);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_CHRT_IE_CDE", pChrtIeCde);
			cmd.addParameter("@P_CHRT_CODE", pChrtCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_PRIMARY_KEY_OUT", NNumber.class);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pPrimaryKeyOut.val = cmd.getParameterValue("@P_PRIMARY_KEY_OUT", NNumber.class);
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pPrimaryKey,NString pSubjCode,NString pCrseNumb,NString pEffTerm,NString pRecType,NString pChrtCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_CRSE_CHRT_RESTRICTION.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PRIMARY_KEY", pPrimaryKey);
			cmd.addParameter("@P_SUBJ_CODE", pSubjCode);
			cmd.addParameter("@P_CRSE_NUMB", pCrseNumb);
			cmd.addParameter("@P_EFF_TERM", pEffTerm);
			cmd.addParameter("@P_REC_TYPE", pRecType);
			cmd.addParameter("@P_CHRT_CODE", pChrtCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pDeleteAll(NString pSubjCode,NString pCrseNumb,NString pEffTerm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_CRSE_CHRT_RESTRICTION.P_DELETE_ALL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SUBJ_CODE", pSubjCode);
			cmd.addParameter("@P_CRSE_NUMB", pCrseNumb);
			cmd.addParameter("@P_EFF_TERM", pEffTerm);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pPrimaryKey,NString pSubjCode,NString pCrseNumb,NString pEffTerm,NString pRecType,NString pChrtCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_CRSE_CHRT_RESTRICTION.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PRIMARY_KEY", pPrimaryKey);
			cmd.addParameter("@P_SUBJ_CODE", pSubjCode);
			cmd.addParameter("@P_CRSE_NUMB", pCrseNumb);
			cmd.addParameter("@P_EFF_TERM", pEffTerm);
			cmd.addParameter("@P_REC_TYPE", pRecType);
			cmd.addParameter("@P_CHRT_CODE", pChrtCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pPrimaryKey,NString pSubjCode,NString pCrseNumb,NString pEffTerm,NString pRecType,NString pUserId,NString pChrtIeCde,NString pChrtCode,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_CRSE_CHRT_RESTRICTION.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PRIMARY_KEY", pPrimaryKey);
			cmd.addParameter("@P_SUBJ_CODE", pSubjCode);
			cmd.addParameter("@P_CRSE_NUMB", pCrseNumb);
			cmd.addParameter("@P_EFF_TERM", pEffTerm);
			cmd.addParameter("@P_REC_TYPE", pRecType);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_CHRT_IE_CDE", pChrtIeCde);
			cmd.addParameter("@P_CHRT_CODE", pChrtCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="CrseChrtRestrictionRecRow", dataSourceName="CRSE_CHRT_RESTRICTION_REC")
	public static class CrseChrtRestrictionRecRow
	{
		@DbRecordField(dataSourceName="R_PRIMARY_KEY")
		public NNumber RPrimaryKey;
		@DbRecordField(dataSourceName="R_SUBJ_CODE")
		public NString RSubjCode;
		@DbRecordField(dataSourceName="R_CRSE_NUMB")
		public NString RCrseNumb;
		@DbRecordField(dataSourceName="R_EFF_TERM")
		public NString REffTerm;
		@DbRecordField(dataSourceName="R_REC_TYPE")
		public NString RRecType;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_CHRT_IE_CDE")
		public NString RChrtIeCde;
		@DbRecordField(dataSourceName="R_CHRT_CODE")
		public NString RChrtCode;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
