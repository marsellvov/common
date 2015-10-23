package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class FbReportTax {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_REPORT_TAX.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pReptCode,NString pTratCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_REPORT_TAX.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_REPT_CODE", pReptCode);
			cmd.addParameter("@P_TRAT_CODE", pTratCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(ReportTaxRecRow recOne,ReportTaxRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_REPORT_TAX.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, ReportTaxRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, ReportTaxRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pReptCode,NString pTratCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_REPORT_TAX.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_REPT_CODE", pReptCode);
			cmd.addParameter("@P_TRAT_CODE", pTratCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_REPORT_TAX.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pReptCode,NString pTratCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_REPORT_TAX.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_REPT_CODE", pReptCode);
			cmd.addParameter("@P_TRAT_CODE", pTratCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pReptCode,NString pTratCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_REPORT_TAX.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_REPT_CODE", pReptCode);
			cmd.addParameter("@P_TRAT_CODE", pTratCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pReptCode,NString pTratCode,NString pUserId,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_REPORT_TAX.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_REPT_CODE", pReptCode);
			cmd.addParameter("@P_TRAT_CODE", pTratCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pReptCode,NString pTratCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_REPORT_TAX.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_REPT_CODE", pReptCode);
			cmd.addParameter("@P_TRAT_CODE", pTratCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pReptCode,NString pTratCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_REPORT_TAX.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_REPT_CODE", pReptCode);
			cmd.addParameter("@P_TRAT_CODE", pTratCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pReptCode,NString pTratCode,NString pUserId,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_REPORT_TAX.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_REPT_CODE", pReptCode);
			cmd.addParameter("@P_TRAT_CODE", pTratCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	@DbRecordType(id="ReportTaxRecRow", dataSourceName="REPORT_TAX_REC", needsInitialization=true)
	public static class ReportTaxRecRow
	{
		@DbRecordField(dataSourceName="R_REPT_CODE")
		public NString RReptCode;
		@DbRecordField(dataSourceName="R_TRAT_CODE")
		public NString RTratCode;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
