package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PbAvgEarnByEcls {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_AVG_EARN_BY_ECLS.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pEarnCode,NString pEclsCode,NNumber pYearsFrom,NNumber pMonthsFrom,NNumber pDaysFrom,NString pMinwCode,NNumber pMinwFrom,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_AVG_EARN_BY_ECLS.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_ECLS_CODE", pEclsCode);
			cmd.addParameter("@P_YEARS_FROM", pYearsFrom);
			cmd.addParameter("@P_MONTHS_FROM", pMonthsFrom);
			cmd.addParameter("@P_DAYS_FROM", pDaysFrom);
			cmd.addParameter("@P_MINW_CODE", pMinwCode);
			cmd.addParameter("@P_MINW_FROM", pMinwFrom);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fExistsPtrecls(NString pPtreclsCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_AVG_EARN_BY_ECLS.F_EXISTS_PTRECLS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PTRECLS_CODE", pPtreclsCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(AvgEarnByEclsRecRow recOne,AvgEarnByEclsRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_AVG_EARN_BY_ECLS.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, AvgEarnByEclsRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, AvgEarnByEclsRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pEarnCode,NString pEclsCode,NNumber pYearsFrom,NNumber pMonthsFrom,NNumber pDaysFrom,NString pMinwCode,NNumber pMinwFrom) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_AVG_EARN_BY_ECLS.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_ECLS_CODE", pEclsCode);
			cmd.addParameter("@P_YEARS_FROM", pYearsFrom);
			cmd.addParameter("@P_MONTHS_FROM", pMonthsFrom);
			cmd.addParameter("@P_DAYS_FROM", pDaysFrom);
			cmd.addParameter("@P_MINW_CODE", pMinwCode);
			cmd.addParameter("@P_MINW_FROM", pMinwFrom);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_AVG_EARN_BY_ECLS.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pEarnCode,NString pEclsCode,NNumber pYearsFrom,NNumber pMonthsFrom,NNumber pDaysFrom,NString pMinwCode,NNumber pMinwFrom) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_AVG_EARN_BY_ECLS.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_ECLS_CODE", pEclsCode);
			cmd.addParameter("@P_YEARS_FROM", pYearsFrom);
			cmd.addParameter("@P_MONTHS_FROM", pMonthsFrom);
			cmd.addParameter("@P_DAYS_FROM", pDaysFrom);
			cmd.addParameter("@P_MINW_CODE", pMinwCode);
			cmd.addParameter("@P_MINW_FROM", pMinwFrom);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pEarnCode,NString pEclsCode,NNumber pYearsFrom,NNumber pMonthsFrom,NNumber pDaysFrom,NString pMinwCode,NNumber pMinwFrom,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_AVG_EARN_BY_ECLS.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_ECLS_CODE", pEclsCode);
			cmd.addParameter("@P_YEARS_FROM", pYearsFrom);
			cmd.addParameter("@P_MONTHS_FROM", pMonthsFrom);
			cmd.addParameter("@P_DAYS_FROM", pDaysFrom);
			cmd.addParameter("@P_MINW_CODE", pMinwCode);
			cmd.addParameter("@P_MINW_FROM", pMinwFrom);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pEarnCode,NString pEclsCode,NString pBaseDate,NNumber pYearsFrom,NNumber pMonthsFrom,NNumber pMaxAmt,NNumber pPercentage,NNumber pDays,NNumber pMonths,NString pUserId,NString pDataOrigin,NNumber pDaysFrom,NString pMinwCode,NNumber pMinwFrom,NNumber pMinwNumber,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_AVG_EARN_BY_ECLS.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_ECLS_CODE", pEclsCode);
			cmd.addParameter("@P_BASE_DATE", pBaseDate);
			cmd.addParameter("@P_YEARS_FROM", pYearsFrom);
			cmd.addParameter("@P_MONTHS_FROM", pMonthsFrom);
			cmd.addParameter("@P_MAX_AMT", pMaxAmt);
			cmd.addParameter("@P_PERCENTAGE", pPercentage);
			cmd.addParameter("@P_DAYS", pDays);
			cmd.addParameter("@P_MONTHS", pMonths);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_DAYS_FROM", pDaysFrom);
			cmd.addParameter("@P_MINW_CODE", pMinwCode);
			cmd.addParameter("@P_MINW_FROM", pMinwFrom);
			cmd.addParameter("@P_MINW_NUMBER", pMinwNumber);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pEarnCode,NString pEclsCode,NNumber pYearsFrom,NNumber pMonthsFrom,NNumber pDaysFrom,NString pMinwCode,NNumber pMinwFrom,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_AVG_EARN_BY_ECLS.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_ECLS_CODE", pEclsCode);
			cmd.addParameter("@P_YEARS_FROM", pYearsFrom);
			cmd.addParameter("@P_MONTHS_FROM", pMonthsFrom);
			cmd.addParameter("@P_DAYS_FROM", pDaysFrom);
			cmd.addParameter("@P_MINW_CODE", pMinwCode);
			cmd.addParameter("@P_MINW_FROM", pMinwFrom);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pEarnCode,NString pEclsCode,NNumber pYearsFrom,NNumber pMonthsFrom,NNumber pDaysFrom,NString pMinwCode,NNumber pMinwFrom,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_AVG_EARN_BY_ECLS.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_ECLS_CODE", pEclsCode);
			cmd.addParameter("@P_YEARS_FROM", pYearsFrom);
			cmd.addParameter("@P_MONTHS_FROM", pMonthsFrom);
			cmd.addParameter("@P_DAYS_FROM", pDaysFrom);
			cmd.addParameter("@P_MINW_CODE", pMinwCode);
			cmd.addParameter("@P_MINW_FROM", pMinwFrom);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pEarnCode,NString pEclsCode,NString pBaseDate,NNumber pYearsFrom,NNumber pMonthsFrom,NNumber pMaxAmt,NNumber pPercentage,NNumber pDays,NNumber pMonths,NString pUserId,NString pDataOrigin,NNumber pDaysFrom,NString pMinwCode,NNumber pMinwFrom,NNumber pMinwNumber,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_AVG_EARN_BY_ECLS.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_ECLS_CODE", pEclsCode);
			cmd.addParameter("@P_BASE_DATE", pBaseDate);
			cmd.addParameter("@P_YEARS_FROM", pYearsFrom);
			cmd.addParameter("@P_MONTHS_FROM", pMonthsFrom);
			cmd.addParameter("@P_MAX_AMT", pMaxAmt);
			cmd.addParameter("@P_PERCENTAGE", pPercentage);
			cmd.addParameter("@P_DAYS", pDays);
			cmd.addParameter("@P_MONTHS", pMonths);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_DAYS_FROM", pDaysFrom);
			cmd.addParameter("@P_MINW_CODE", pMinwCode);
			cmd.addParameter("@P_MINW_FROM", pMinwFrom);
			cmd.addParameter("@P_MINW_NUMBER", pMinwNumber);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	@DbRecordType(id="AvgEarnByEclsRecRow", dataSourceName="AVG_EARN_BY_ECLS_REC", needsInitialization=true)
	public static class AvgEarnByEclsRecRow
	{
		@DbRecordField(dataSourceName="R_EARN_CODE")
		public NString REarnCode;
		@DbRecordField(dataSourceName="R_ECLS_CODE")
		public NString REclsCode;
		@DbRecordField(dataSourceName="R_BASE_DATE")
		public NString RBaseDate;
		@DbRecordField(dataSourceName="R_YEARS_FROM")
		public NNumber RYearsFrom;
		@DbRecordField(dataSourceName="R_MONTHS_FROM")
		public NNumber RMonthsFrom;
		@DbRecordField(dataSourceName="R_MAX_AMT")
		public NNumber RMaxAmt;
		@DbRecordField(dataSourceName="R_PERCENTAGE")
		public NNumber RPercentage;
		@DbRecordField(dataSourceName="R_DAYS")
		public NNumber RDays;
		@DbRecordField(dataSourceName="R_MONTHS")
		public NNumber RMonths;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_DAYS_FROM")
		public NNumber RDaysFrom;
		@DbRecordField(dataSourceName="R_MINW_CODE")
		public NString RMinwCode;
		@DbRecordField(dataSourceName="R_MINW_FROM")
		public NNumber RMinwFrom;
		@DbRecordField(dataSourceName="R_MINW_NUMBER")
		public NNumber RMinwNumber;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
