package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PvPersReport {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PERS_REPORT.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pBatch,NString pPersEmployerId,NDate pReportBeginDate,NDate pReportEndDate,NString pProgramType,NString pReportType,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PERS_REPORT.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_BATCH", pBatch);
			cmd.addParameter("@P_PERS_EMPLOYER_ID", pPersEmployerId);
			cmd.addParameter("@P_REPORT_BEGIN_DATE", pReportBeginDate);
			cmd.addParameter("@P_REPORT_END_DATE", pReportEndDate);
			cmd.addParameter("@P_PROGRAM_TYPE", pProgramType);
			cmd.addParameter("@P_REPORT_TYPE", pReportType);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(PersReportRecRow recOne,PersReportRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PERS_REPORT.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, PersReportRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, PersReportRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pBatch,NString pPersEmployerId,NDate pReportBeginDate,NDate pReportEndDate,NString pProgramType,NString pReportType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PERS_REPORT.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_BATCH", pBatch);
			cmd.addParameter("@P_PERS_EMPLOYER_ID", pPersEmployerId);
			cmd.addParameter("@P_REPORT_BEGIN_DATE", pReportBeginDate);
			cmd.addParameter("@P_REPORT_END_DATE", pReportEndDate);
			cmd.addParameter("@P_PROGRAM_TYPE", pProgramType);
			cmd.addParameter("@P_REPORT_TYPE", pReportType);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PERS_REPORT.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pBatch,NString pPersEmployerId,NDate pReportBeginDate,NDate pReportEndDate,NString pProgramType,NString pReportType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PERS_REPORT.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_BATCH", pBatch);
			cmd.addParameter("@P_PERS_EMPLOYER_ID", pPersEmployerId);
			cmd.addParameter("@P_REPORT_BEGIN_DATE", pReportBeginDate);
			cmd.addParameter("@P_REPORT_END_DATE", pReportEndDate);
			cmd.addParameter("@P_PROGRAM_TYPE", pProgramType);
			cmd.addParameter("@P_REPORT_TYPE", pReportType);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pBatch,NString pPersEmployerId,NDate pReportBeginDate,NDate pReportEndDate,NString pProgramType,NString pReportType,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PERS_REPORT.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_BATCH", pBatch);
			cmd.addParameter("@P_PERS_EMPLOYER_ID", pPersEmployerId);
			cmd.addParameter("@P_REPORT_BEGIN_DATE", pReportBeginDate);
			cmd.addParameter("@P_REPORT_END_DATE", pReportEndDate);
			cmd.addParameter("@P_PROGRAM_TYPE", pProgramType);
			cmd.addParameter("@P_REPORT_TYPE", pReportType);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pBatch,NString pPersEmployerId,NDate pReportBeginDate,NDate pReportEndDate,NString pProgramType,NString pReportType,NString pUserId,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PERS_REPORT.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_BATCH", pBatch);
			cmd.addParameter("@P_PERS_EMPLOYER_ID", pPersEmployerId);
			cmd.addParameter("@P_REPORT_BEGIN_DATE", pReportBeginDate);
			cmd.addParameter("@P_REPORT_END_DATE", pReportEndDate);
			cmd.addParameter("@P_PROGRAM_TYPE", pProgramType);
			cmd.addParameter("@P_REPORT_TYPE", pReportType);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pBatch,NString pPersEmployerId,NDate pReportBeginDate,NDate pReportEndDate,NString pProgramType,NString pReportType,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PERS_REPORT.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_BATCH", pBatch);
			cmd.addParameter("@P_PERS_EMPLOYER_ID", pPersEmployerId);
			cmd.addParameter("@P_REPORT_BEGIN_DATE", pReportBeginDate);
			cmd.addParameter("@P_REPORT_END_DATE", pReportEndDate);
			cmd.addParameter("@P_PROGRAM_TYPE", pProgramType);
			cmd.addParameter("@P_REPORT_TYPE", pReportType);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pBatch,NString pPersEmployerId,NDate pReportBeginDate,NDate pReportEndDate,NString pProgramType,NString pReportType,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PERS_REPORT.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_BATCH", pBatch);
			cmd.addParameter("@P_PERS_EMPLOYER_ID", pPersEmployerId);
			cmd.addParameter("@P_REPORT_BEGIN_DATE", pReportBeginDate);
			cmd.addParameter("@P_REPORT_END_DATE", pReportEndDate);
			cmd.addParameter("@P_PROGRAM_TYPE", pProgramType);
			cmd.addParameter("@P_REPORT_TYPE", pReportType);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pBatch,NString pPersEmployerId,NDate pReportBeginDate,NDate pReportEndDate,NString pProgramType,NString pReportType,NString pUserId,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PERS_REPORT.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_BATCH", pBatch);
			cmd.addParameter("@P_PERS_EMPLOYER_ID", pPersEmployerId);
			cmd.addParameter("@P_REPORT_BEGIN_DATE", pReportBeginDate);
			cmd.addParameter("@P_REPORT_END_DATE", pReportEndDate);
			cmd.addParameter("@P_PROGRAM_TYPE", pProgramType);
			cmd.addParameter("@P_REPORT_TYPE", pReportType);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	@DbRecordType(id="PersReportRecRow", dataSourceName="PERS_REPORT_REC", needsInitialization=true)
	public static class PersReportRecRow
	{
		@DbRecordField(dataSourceName="R_BATCH")
		public NString RBatch;
		@DbRecordField(dataSourceName="R_PERS_EMPLOYER_ID")
		public NString RPersEmployerId;
		@DbRecordField(dataSourceName="R_REPORT_BEGIN_DATE")
		public NDate RReportBeginDate;
		@DbRecordField(dataSourceName="R_REPORT_END_DATE")
		public NDate RReportEndDate;
		@DbRecordField(dataSourceName="R_PROGRAM_TYPE")
		public NString RProgramType;
		@DbRecordField(dataSourceName="R_REPORT_TYPE")
		public NString RReportType;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
