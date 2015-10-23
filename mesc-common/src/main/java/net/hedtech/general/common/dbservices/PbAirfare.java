package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PbAirfare {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_AIRFARE.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pAirCode,NString pClass,NString pAirType,NDate pEffDate,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_AIRFARE.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_AIR_CODE", pAirCode);
			cmd.addParameter("@P_CLASS", pClass);
			cmd.addParameter("@P_AIR_TYPE", pAirType);
			cmd.addParameter("@P_EFF_DATE", pEffDate);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(AirfareRecRow recOne,AirfareRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_AIRFARE.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, AirfareRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, AirfareRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pAirCode,NString pClass,NString pAirType,NDate pEffDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_AIRFARE.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIR_CODE", pAirCode);
			cmd.addParameter("@P_CLASS", pClass);
			cmd.addParameter("@P_AIR_TYPE", pAirType);
			cmd.addParameter("@P_EFF_DATE", pEffDate);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_AIRFARE.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pAirCode,NString pClass,NString pAirType,NDate pEffDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_AIRFARE.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIR_CODE", pAirCode);
			cmd.addParameter("@P_CLASS", pClass);
			cmd.addParameter("@P_AIR_TYPE", pAirType);
			cmd.addParameter("@P_EFF_DATE", pEffDate);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pAirCode,NString pClass,NString pAirType,NDate pEffDate,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_AIRFARE.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIR_CODE", pAirCode);
			cmd.addParameter("@P_CLASS", pClass);
			cmd.addParameter("@P_AIR_TYPE", pAirType);
			cmd.addParameter("@P_EFF_DATE", pEffDate);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pAirCode,NString pClass,NString pAirType,NDate pEffDate,NNumber pRetFare,NNumber pOneFare,NString pApprove,NString pUserId,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_AIRFARE.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIR_CODE", pAirCode);
			cmd.addParameter("@P_CLASS", pClass);
			cmd.addParameter("@P_AIR_TYPE", pAirType);
			cmd.addParameter("@P_EFF_DATE", pEffDate);
			cmd.addParameter("@P_RET_FARE", pRetFare);
			cmd.addParameter("@P_ONE_FARE", pOneFare);
			cmd.addParameter("@P_APPROVE", pApprove);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pAirCode,NString pClass,NString pAirType,NDate pEffDate,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_AIRFARE.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIR_CODE", pAirCode);
			cmd.addParameter("@P_CLASS", pClass);
			cmd.addParameter("@P_AIR_TYPE", pAirType);
			cmd.addParameter("@P_EFF_DATE", pEffDate);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pAirCode,NString pClass,NString pAirType,NDate pEffDate,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_AIRFARE.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIR_CODE", pAirCode);
			cmd.addParameter("@P_CLASS", pClass);
			cmd.addParameter("@P_AIR_TYPE", pAirType);
			cmd.addParameter("@P_EFF_DATE", pEffDate);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pAirCode,NString pClass,NString pAirType,NDate pEffDate,NNumber pRetFare,NNumber pOneFare,NString pApprove,NString pUserId,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_AIRFARE.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIR_CODE", pAirCode);
			cmd.addParameter("@P_CLASS", pClass);
			cmd.addParameter("@P_AIR_TYPE", pAirType);
			cmd.addParameter("@P_EFF_DATE", pEffDate);
			cmd.addParameter("@P_RET_FARE", pRetFare);
			cmd.addParameter("@P_ONE_FARE", pOneFare);
			cmd.addParameter("@P_APPROVE", pApprove);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	@DbRecordType(id="AirfareRecRow", dataSourceName="AIRFARE_REC")
	public static class AirfareRecRow
	{
		@DbRecordField(dataSourceName="R_AIR_CODE")
		public NString RAirCode;
		@DbRecordField(dataSourceName="R_CLASS")
		public NString RClass;
		@DbRecordField(dataSourceName="R_AIR_TYPE")
		public NString RAirType;
		@DbRecordField(dataSourceName="R_EFF_DATE")
		public NDate REffDate;
		@DbRecordField(dataSourceName="R_RET_FARE")
		public NNumber RRetFare;
		@DbRecordField(dataSourceName="R_ONE_FARE")
		public NNumber ROneFare;
		@DbRecordField(dataSourceName="R_APPROVE")
		public NString RApprove;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
