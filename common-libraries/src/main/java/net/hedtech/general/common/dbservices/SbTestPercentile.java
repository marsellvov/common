package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbTestPercentile {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TEST_PERCENTILE.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pPidm,NString pTescCode,NDate pTestDate,NString pTsptCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TEST_PERCENTILE.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TESC_CODE", pTescCode);
			cmd.addParameter("@P_TEST_DATE", pTestDate);
			cmd.addParameter("@P_TSPT_CODE", pTsptCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(TestPercentileRecRow recOne,TestPercentileRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TEST_PERCENTILE.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, TestPercentileRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, TestPercentileRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pPidm,NString pTescCode,NDate pTestDate,NString pTsptCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TEST_PERCENTILE.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TESC_CODE", pTescCode);
			cmd.addParameter("@P_TEST_DATE", pTestDate);
			cmd.addParameter("@P_TSPT_CODE", pTsptCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TEST_PERCENTILE.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPidm,NString pTescCode,NDate pTestDate,NString pTsptCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TEST_PERCENTILE.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TESC_CODE", pTescCode);
			cmd.addParameter("@P_TEST_DATE", pTestDate);
			cmd.addParameter("@P_TSPT_CODE", pTsptCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pPidm,NString pTescCode,NDate pTestDate,NString pTsptCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TEST_PERCENTILE.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TESC_CODE", pTescCode);
			cmd.addParameter("@P_TEST_DATE", pTestDate);
			cmd.addParameter("@P_TSPT_CODE", pTsptCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NNumber pPidm,NString pTescCode,NDate pTestDate,NString pTsptCode,NString pPercentile,NString pUserId,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TEST_PERCENTILE.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TESC_CODE", pTescCode);
			cmd.addParameter("@P_TEST_DATE", pTestDate);
			cmd.addParameter("@P_TSPT_CODE", pTsptCode);
			cmd.addParameter("@P_PERCENTILE", pPercentile);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pPidm,NString pTescCode,NDate pTestDate,NString pTsptCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TEST_PERCENTILE.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TESC_CODE", pTescCode);
			cmd.addParameter("@P_TEST_DATE", pTestDate);
			cmd.addParameter("@P_TSPT_CODE", pTsptCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pPidm,NString pTescCode,NDate pTestDate,NString pTsptCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TEST_PERCENTILE.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TESC_CODE", pTescCode);
			cmd.addParameter("@P_TEST_DATE", pTestDate);
			cmd.addParameter("@P_TSPT_CODE", pTsptCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pPidm,NString pTescCode,NDate pTestDate,NString pTsptCode,NString pPercentile,NString pUserId,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TEST_PERCENTILE.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TESC_CODE", pTescCode);
			cmd.addParameter("@P_TEST_DATE", pTestDate);
			cmd.addParameter("@P_TSPT_CODE", pTsptCode);
			cmd.addParameter("@P_PERCENTILE", pPercentile);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="TestPercentileRecRow", dataSourceName="TEST_PERCENTILE_REC")
	public static class TestPercentileRecRow
	{
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_TESC_CODE")
		public NString RTescCode;
		@DbRecordField(dataSourceName="R_TEST_DATE")
		public NDate RTestDate;
		@DbRecordField(dataSourceName="R_TSPT_CODE")
		public NString RTsptCode;
		@DbRecordField(dataSourceName="R_PERCENTILE")
		public NString RPercentile;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
