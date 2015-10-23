package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PbAirTktPref {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_AIR_TKT_PREF.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pEclsCode,NString pTable,NString pGrade,NString pPosn,NString pInd,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_AIR_TKT_PREF.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ECLS_CODE", pEclsCode);
			cmd.addParameter("@P_TABLE", pTable);
			cmd.addParameter("@P_GRADE", pGrade);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_IND", pInd);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(AirTktPrefRecRow recOne,AirTktPrefRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_AIR_TKT_PREF.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, AirTktPrefRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, AirTktPrefRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pEclsCode,NString pTable,NString pGrade,NString pPosn,NString pInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_AIR_TKT_PREF.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ECLS_CODE", pEclsCode);
			cmd.addParameter("@P_TABLE", pTable);
			cmd.addParameter("@P_GRADE", pGrade);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_IND", pInd);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_AIR_TKT_PREF.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pEclsCode,NString pTable,NString pGrade,NString pPosn,NString pInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_AIR_TKT_PREF.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ECLS_CODE", pEclsCode);
			cmd.addParameter("@P_TABLE", pTable);
			cmd.addParameter("@P_GRADE", pGrade);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_IND", pInd);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pEclsCode,NString pTable,NString pGrade,NString pPosn,NString pInd,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_AIR_TKT_PREF.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ECLS_CODE", pEclsCode);
			cmd.addParameter("@P_TABLE", pTable);
			cmd.addParameter("@P_GRADE", pGrade);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_IND", pInd);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pEclsCode,NString pTable,NString pGrade,NString pPosn,NString pInd,NString pQueue,NString pTktProcess,NNumber pHoldPeriod,NString pBaseDate,NNumber pTktPeriod,NString pEmpElig,NString pFamElig,NNumber pMaxChild,NNumber pMaxSps,NNumber pMaleAge,NNumber pFemaleAge,NString pTktClass,NString pTktValue,NNumber pFactor,NNumber pMaxAmt,NString pUserId,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_AIR_TKT_PREF.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ECLS_CODE", pEclsCode);
			cmd.addParameter("@P_TABLE", pTable);
			cmd.addParameter("@P_GRADE", pGrade);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_IND", pInd);
			cmd.addParameter("@P_QUEUE", pQueue);
			cmd.addParameter("@P_TKT_PROCESS", pTktProcess);
			cmd.addParameter("@P_HOLD_PERIOD", pHoldPeriod);
			cmd.addParameter("@P_BASE_DATE", pBaseDate);
			cmd.addParameter("@P_TKT_PERIOD", pTktPeriod);
			cmd.addParameter("@P_EMP_ELIG", pEmpElig);
			cmd.addParameter("@P_FAM_ELIG", pFamElig);
			cmd.addParameter("@P_MAX_CHILD", pMaxChild);
			cmd.addParameter("@P_MAX_SPS", pMaxSps);
			cmd.addParameter("@P_MALE_AGE", pMaleAge);
			cmd.addParameter("@P_FEMALE_AGE", pFemaleAge);
			cmd.addParameter("@P_TKT_CLASS", pTktClass);
			cmd.addParameter("@P_TKT_VALUE", pTktValue);
			cmd.addParameter("@P_FACTOR", pFactor);
			cmd.addParameter("@P_MAX_AMT", pMaxAmt);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pEclsCode,NString pTable,NString pGrade,NString pPosn,NString pInd,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_AIR_TKT_PREF.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ECLS_CODE", pEclsCode);
			cmd.addParameter("@P_TABLE", pTable);
			cmd.addParameter("@P_GRADE", pGrade);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_IND", pInd);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pEclsCode,NString pTable,NString pGrade,NString pPosn,NString pInd,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_AIR_TKT_PREF.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ECLS_CODE", pEclsCode);
			cmd.addParameter("@P_TABLE", pTable);
			cmd.addParameter("@P_GRADE", pGrade);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_IND", pInd);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pEclsCode,NString pTable,NString pGrade,NString pPosn,NString pInd,NString pQueue,NString pTktProcess,NNumber pHoldPeriod,NString pBaseDate,NNumber pTktPeriod,NString pEmpElig,NString pFamElig,NNumber pMaxChild,NNumber pMaxSps,NNumber pMaleAge,NNumber pFemaleAge,NString pTktClass,NString pTktValue,NNumber pFactor,NNumber pMaxAmt,NString pUserId,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_AIR_TKT_PREF.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ECLS_CODE", pEclsCode);
			cmd.addParameter("@P_TABLE", pTable);
			cmd.addParameter("@P_GRADE", pGrade);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_IND", pInd);
			cmd.addParameter("@P_QUEUE", pQueue);
			cmd.addParameter("@P_TKT_PROCESS", pTktProcess);
			cmd.addParameter("@P_HOLD_PERIOD", pHoldPeriod);
			cmd.addParameter("@P_BASE_DATE", pBaseDate);
			cmd.addParameter("@P_TKT_PERIOD", pTktPeriod);
			cmd.addParameter("@P_EMP_ELIG", pEmpElig);
			cmd.addParameter("@P_FAM_ELIG", pFamElig);
			cmd.addParameter("@P_MAX_CHILD", pMaxChild);
			cmd.addParameter("@P_MAX_SPS", pMaxSps);
			cmd.addParameter("@P_MALE_AGE", pMaleAge);
			cmd.addParameter("@P_FEMALE_AGE", pFemaleAge);
			cmd.addParameter("@P_TKT_CLASS", pTktClass);
			cmd.addParameter("@P_TKT_VALUE", pTktValue);
			cmd.addParameter("@P_FACTOR", pFactor);
			cmd.addParameter("@P_MAX_AMT", pMaxAmt);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	@DbRecordType(id="AirTktPrefRecRow", dataSourceName="AIR_TKT_PREF_REC")
	public static class AirTktPrefRecRow
	{
		@DbRecordField(dataSourceName="R_ECLS_CODE")
		public NString REclsCode;
		@DbRecordField(dataSourceName="R_TABLE")
		public NString RTable;
		@DbRecordField(dataSourceName="R_GRADE")
		public NString RGrade;
		@DbRecordField(dataSourceName="R_POSN")
		public NString RPosn;
		@DbRecordField(dataSourceName="R_IND")
		public NString RInd;
		@DbRecordField(dataSourceName="R_QUEUE")
		public NString RQueue;
		@DbRecordField(dataSourceName="R_TKT_PROCESS")
		public NString RTktProcess;
		@DbRecordField(dataSourceName="R_HOLD_PERIOD")
		public NNumber RHoldPeriod;
		@DbRecordField(dataSourceName="R_BASE_DATE")
		public NString RBaseDate;
		@DbRecordField(dataSourceName="R_TKT_PERIOD")
		public NNumber RTktPeriod;
		@DbRecordField(dataSourceName="R_EMP_ELIG")
		public NString REmpElig;
		@DbRecordField(dataSourceName="R_FAM_ELIG")
		public NString RFamElig;
		@DbRecordField(dataSourceName="R_MAX_CHILD")
		public NNumber RMaxChild;
		@DbRecordField(dataSourceName="R_MAX_SPS")
		public NNumber RMaxSps;
		@DbRecordField(dataSourceName="R_MALE_AGE")
		public NNumber RMaleAge;
		@DbRecordField(dataSourceName="R_FEMALE_AGE")
		public NNumber RFemaleAge;
		@DbRecordField(dataSourceName="R_TKT_CLASS")
		public NString RTktClass;
		@DbRecordField(dataSourceName="R_TKT_VALUE")
		public NString RTktValue;
		@DbRecordField(dataSourceName="R_FACTOR")
		public NNumber RFactor;
		@DbRecordField(dataSourceName="R_MAX_AMT")
		public NNumber RMaxAmt;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
