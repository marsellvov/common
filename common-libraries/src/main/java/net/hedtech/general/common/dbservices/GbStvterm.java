package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GbStvterm {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_STVTERM.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fCodeExists(NString pCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_STVTERM.F_CODE_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fExists(NString pCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_STVTERM.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetDescription(NString pCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_STVTERM.F_GET_DESCRIPTION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CODE", pCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(StvtermRecRow recOne,StvtermRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_STVTERM.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, StvtermRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, StvtermRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pCode,NString pDesc,NDate pStartDate,NDate pEndDate,NString pFaProcYr,NString pFaTerm,NNumber pFaPeriod,NNumber pFaEndPeriod,NString pAcyrCode,NDate pHousingStartDate,NDate pHousingEndDate,NString pSystemReqInd,NString pTrmtCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_STVTERM.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_DESC", pDesc);
			cmd.addParameter("@P_START_DATE", pStartDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_FA_PROC_YR", pFaProcYr);
			cmd.addParameter("@P_FA_TERM", pFaTerm);
			cmd.addParameter("@P_FA_PERIOD", pFaPeriod);
			cmd.addParameter("@P_FA_END_PERIOD", pFaEndPeriod);
			cmd.addParameter("@P_ACYR_CODE", pAcyrCode);
			cmd.addParameter("@P_HOUSING_START_DATE", pHousingStartDate);
			cmd.addParameter("@P_HOUSING_END_DATE", pHousingEndDate);
			cmd.addParameter("@P_SYSTEM_REQ_IND", pSystemReqInd);
			cmd.addParameter("@P_TRMT_CODE", pTrmtCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_STVTERM.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_STVTERM.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_CODE", pCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_STVTERM.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pCode,NString pDesc,NDate pStartDate,NDate pEndDate,NString pFaProcYr,NString pFaTerm,NNumber pFaPeriod,NNumber pFaEndPeriod,NString pAcyrCode,NDate pHousingStartDate,NDate pHousingEndDate,NString pSystemReqInd,NString pTrmtCode,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_STVTERM.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_DESC", pDesc);
			cmd.addParameter("@P_START_DATE", pStartDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_FA_PROC_YR", pFaProcYr);
			cmd.addParameter("@P_FA_TERM", pFaTerm);
			cmd.addParameter("@P_FA_PERIOD", pFaPeriod);
			cmd.addParameter("@P_FA_END_PERIOD", pFaEndPeriod);
			cmd.addParameter("@P_ACYR_CODE", pAcyrCode);
			cmd.addParameter("@P_HOUSING_START_DATE", pHousingStartDate);
			cmd.addParameter("@P_HOUSING_END_DATE", pHousingEndDate);
			cmd.addParameter("@P_SYSTEM_REQ_IND", pSystemReqInd);
			cmd.addParameter("@P_TRMT_CODE", pTrmtCode);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_STVTERM.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_STVTERM.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pCode,NString pDesc,NDate pStartDate,NDate pEndDate,NString pFaProcYr,NString pFaTerm,NNumber pFaPeriod,NNumber pFaEndPeriod,NString pAcyrCode,NDate pHousingStartDate,NDate pHousingEndDate,NString pSystemReqInd,NString pTrmtCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_STVTERM.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_DESC", pDesc);
			cmd.addParameter("@P_START_DATE", pStartDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_FA_PROC_YR", pFaProcYr);
			cmd.addParameter("@P_FA_TERM", pFaTerm);
			cmd.addParameter("@P_FA_PERIOD", pFaPeriod);
			cmd.addParameter("@P_FA_END_PERIOD", pFaEndPeriod);
			cmd.addParameter("@P_ACYR_CODE", pAcyrCode);
			cmd.addParameter("@P_HOUSING_START_DATE", pHousingStartDate);
			cmd.addParameter("@P_HOUSING_END_DATE", pHousingEndDate);
			cmd.addParameter("@P_SYSTEM_REQ_IND", pSystemReqInd);
			cmd.addParameter("@P_TRMT_CODE", pTrmtCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="StvtermRecRow", dataSourceName="STVTERM_REC")
	public static class StvtermRecRow
	{
		@DbRecordField(dataSourceName="R_CODE")
		public NString RCode;
		@DbRecordField(dataSourceName="R_DESC")
		public NString RDesc;
		@DbRecordField(dataSourceName="R_START_DATE")
		public NDate RStartDate;
		@DbRecordField(dataSourceName="R_END_DATE")
		public NDate REndDate;
		@DbRecordField(dataSourceName="R_FA_PROC_YR")
		public NString RFaProcYr;
		@DbRecordField(dataSourceName="R_FA_TERM")
		public NString RFaTerm;
		@DbRecordField(dataSourceName="R_FA_PERIOD")
		public NNumber RFaPeriod;
		@DbRecordField(dataSourceName="R_FA_END_PERIOD")
		public NNumber RFaEndPeriod;
		@DbRecordField(dataSourceName="R_ACYR_CODE")
		public NString RAcyrCode;
		@DbRecordField(dataSourceName="R_HOUSING_START_DATE")
		public NDate RHousingStartDate;
		@DbRecordField(dataSourceName="R_HOUSING_END_DATE")
		public NDate RHousingEndDate;
		@DbRecordField(dataSourceName="R_SYSTEM_REQ_IND")
		public NString RSystemReqInd;
		@DbRecordField(dataSourceName="R_TRMT_CODE")
		public NString RTrmtCode;
		@DbRecordField(dataSourceName="R_FA_SUMMER_IND")
		public NString RFaSummerInd;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
