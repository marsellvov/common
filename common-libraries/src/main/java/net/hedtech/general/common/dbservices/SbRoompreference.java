package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbRoompreference {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ROOMPREFERENCE.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pPidm,NString pFromTerm,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ROOMPREFERENCE.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FROM_TERM", pFromTerm);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(RoompreferenceRecRow recOne,RoompreferenceRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ROOMPREFERENCE.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, RoompreferenceRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, RoompreferenceRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pPidm,NString pFromTerm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ROOMPREFERENCE.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FROM_TERM", pFromTerm);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ROOMPREFERENCE.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPidm,NString pFromTerm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ROOMPREFERENCE.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FROM_TERM", pFromTerm);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pPidm,NString pFromTerm,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ROOMPREFERENCE.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FROM_TERM", pFromTerm);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NNumber pPidm,NString pArtpCode,NString pFromTerm,NString pToTerm,NString pApplPriority,NString pPreferedBuilding,NString pPreferedRoom,NString pPreferedBcatCode,NString pPreferedCampCode,NString pMrcdCode,NString pHapsCode,NDate pHapsDate,NDate pAddDate,NString pDataOrigin,NString pUserId,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ROOMPREFERENCE.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ARTP_CODE", pArtpCode);
			cmd.addParameter("@P_FROM_TERM", pFromTerm);
			cmd.addParameter("@P_TO_TERM", pToTerm);
			cmd.addParameter("@P_APPL_PRIORITY", pApplPriority);
			cmd.addParameter("@P_PREFERED_BUILDING", pPreferedBuilding);
			cmd.addParameter("@P_PREFERED_ROOM", pPreferedRoom);
			cmd.addParameter("@P_PREFERED_BCAT_CODE", pPreferedBcatCode);
			cmd.addParameter("@P_PREFERED_CAMP_CODE", pPreferedCampCode);
			cmd.addParameter("@P_MRCD_CODE", pMrcdCode);
			cmd.addParameter("@P_HAPS_CODE", pHapsCode);
			cmd.addParameter("@P_HAPS_DATE", pHapsDate);
			cmd.addParameter("@P_ADD_DATE", pAddDate);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pPidm,NString pFromTerm,NString pNewFromTerm,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ROOMPREFERENCE.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FROM_TERM", pFromTerm);
			cmd.addParameter("@P_NEW_FROM_TERM", pNewFromTerm);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pPidm,NString pFromTerm,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ROOMPREFERENCE.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FROM_TERM", pFromTerm);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pPidm,NString pArtpCode,NString pFromTerm,NString pToTerm,NString pApplPriority,NString pPreferedBuilding,NString pPreferedRoom,NString pPreferedBcatCode,NString pPreferedCampCode,NString pMrcdCode,NString pHapsCode,NDate pHapsDate,NDate pAddDate,NString pDataOrigin,NString pUserId,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ROOMPREFERENCE.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ARTP_CODE", pArtpCode);
			cmd.addParameter("@P_FROM_TERM", pFromTerm);
			cmd.addParameter("@P_TO_TERM", pToTerm);
			cmd.addParameter("@P_APPL_PRIORITY", pApplPriority);
			cmd.addParameter("@P_PREFERED_BUILDING", pPreferedBuilding);
			cmd.addParameter("@P_PREFERED_ROOM", pPreferedRoom);
			cmd.addParameter("@P_PREFERED_BCAT_CODE", pPreferedBcatCode);
			cmd.addParameter("@P_PREFERED_CAMP_CODE", pPreferedCampCode);
			cmd.addParameter("@P_MRCD_CODE", pMrcdCode);
			cmd.addParameter("@P_HAPS_CODE", pHapsCode);
			cmd.addParameter("@P_HAPS_DATE", pHapsDate);
			cmd.addParameter("@P_ADD_DATE", pAddDate);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="RoompreferenceRecRow", dataSourceName="ROOMPREFERENCE_REC")
	public static class RoompreferenceRecRow
	{
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_ARTP_CODE")
		public NString RArtpCode;
		@DbRecordField(dataSourceName="R_FROM_TERM")
		public NString RFromTerm;
		@DbRecordField(dataSourceName="R_TO_TERM")
		public NString RToTerm;
		@DbRecordField(dataSourceName="R_APPL_PRIORITY")
		public NString RApplPriority;
		@DbRecordField(dataSourceName="R_PREFERED_BUILDING")
		public NString RPreferedBuilding;
		@DbRecordField(dataSourceName="R_PREFERED_ROOM")
		public NString RPreferedRoom;
		@DbRecordField(dataSourceName="R_PREFERED_BCAT_CODE")
		public NString RPreferedBcatCode;
		@DbRecordField(dataSourceName="R_PREFERED_CAMP_CODE")
		public NString RPreferedCampCode;
		@DbRecordField(dataSourceName="R_MRCD_CODE")
		public NString RMrcdCode;
		@DbRecordField(dataSourceName="R_HAPS_CODE")
		public NString RHapsCode;
		@DbRecordField(dataSourceName="R_HAPS_DATE")
		public NDate RHapsDate;
		@DbRecordField(dataSourceName="R_ADD_DATE")
		public NDate RAddDate;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
