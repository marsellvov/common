package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PbStuDeduction {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_STU_DEDUCTION.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pEclsCode,NString pBdcaCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_STU_DEDUCTION.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ECLS_CODE", pEclsCode);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(StuDeductionRecRow recOne,StuDeductionRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_STU_DEDUCTION.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, StuDeductionRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, StuDeductionRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pEclsCode,NString pBdcaCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_STU_DEDUCTION.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ECLS_CODE", pEclsCode);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_STU_DEDUCTION.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pEclsCode,NString pBdcaCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_STU_DEDUCTION.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ECLS_CODE", pEclsCode);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pEclsCode,NString pBdcaCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_STU_DEDUCTION.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ECLS_CODE", pEclsCode);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pEclsCode,NString pBdcaCode,NString pFtStatus,NString pPtStatus,NString pUserId,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_STU_DEDUCTION.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ECLS_CODE", pEclsCode);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_FT_STATUS", pFtStatus);
			cmd.addParameter("@P_PT_STATUS", pPtStatus);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pEclsCode,NString pBdcaCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_STU_DEDUCTION.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ECLS_CODE", pEclsCode);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pEclsCode,NString pBdcaCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_STU_DEDUCTION.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ECLS_CODE", pEclsCode);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pEclsCode,NString pBdcaCode,NString pFtStatus,NString pPtStatus,NString pUserId,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_STU_DEDUCTION.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ECLS_CODE", pEclsCode);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_FT_STATUS", pFtStatus);
			cmd.addParameter("@P_PT_STATUS", pPtStatus);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="StuDeductionRecRow", dataSourceName="STU_DEDUCTION_REC")
	public static class StuDeductionRecRow
	{
		@DbRecordField(dataSourceName="R_ECLS_CODE")
		public NString REclsCode;
		@DbRecordField(dataSourceName="R_BDCA_CODE")
		public NString RBdcaCode;
		@DbRecordField(dataSourceName="R_FT_STATUS")
		public NString RFtStatus;
		@DbRecordField(dataSourceName="R_PT_STATUS")
		public NString RPtStatus;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
