package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PvTaxRptEarnHist {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_TAX_RPT_EARN_HIST.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pReptCode,NString pRboxCode,NNumber pEffectiveYear,NString pEarnCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_TAX_RPT_EARN_HIST.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_REPT_CODE", pReptCode);
			cmd.addParameter("@P_RBOX_CODE", pRboxCode);
			cmd.addParameter("@P_EFFECTIVE_YEAR", pEffectiveYear);
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(TaxRptEarnHistRecRow recOne,TaxRptEarnHistRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_TAX_RPT_EARN_HIST.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, TaxRptEarnHistRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, TaxRptEarnHistRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pReptCode,NString pRboxCode,NNumber pEffectiveYear,NString pEarnCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_TAX_RPT_EARN_HIST.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_REPT_CODE", pReptCode);
			cmd.addParameter("@P_RBOX_CODE", pRboxCode);
			cmd.addParameter("@P_EFFECTIVE_YEAR", pEffectiveYear);
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_TAX_RPT_EARN_HIST.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pReptCode,NString pRboxCode,NNumber pEffectiveYear,NString pEarnCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_TAX_RPT_EARN_HIST.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_REPT_CODE", pReptCode);
			cmd.addParameter("@P_RBOX_CODE", pRboxCode);
			cmd.addParameter("@P_EFFECTIVE_YEAR", pEffectiveYear);
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pReptCode,NString pRboxCode,NNumber pEffectiveYear,NString pEarnCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_TAX_RPT_EARN_HIST.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_REPT_CODE", pReptCode);
			cmd.addParameter("@P_RBOX_CODE", pRboxCode);
			cmd.addParameter("@P_EFFECTIVE_YEAR", pEffectiveYear);
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pReptCode,NString pRboxCode,NNumber pEffectiveYear,NString pEarnCode,NString pUserId,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_TAX_RPT_EARN_HIST.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_REPT_CODE", pReptCode);
			cmd.addParameter("@P_RBOX_CODE", pRboxCode);
			cmd.addParameter("@P_EFFECTIVE_YEAR", pEffectiveYear);
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pReptCode,NString pRboxCode,NNumber pEffectiveYear,NString pEarnCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_TAX_RPT_EARN_HIST.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_REPT_CODE", pReptCode);
			cmd.addParameter("@P_RBOX_CODE", pRboxCode);
			cmd.addParameter("@P_EFFECTIVE_YEAR", pEffectiveYear);
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pReptCode,NString pRboxCode,NNumber pEffectiveYear,NString pEarnCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_TAX_RPT_EARN_HIST.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_REPT_CODE", pReptCode);
			cmd.addParameter("@P_RBOX_CODE", pRboxCode);
			cmd.addParameter("@P_EFFECTIVE_YEAR", pEffectiveYear);
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pReptCode,NString pRboxCode,NNumber pEffectiveYear,NString pEarnCode,NString pUserId,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_TAX_RPT_EARN_HIST.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_REPT_CODE", pReptCode);
			cmd.addParameter("@P_RBOX_CODE", pRboxCode);
			cmd.addParameter("@P_EFFECTIVE_YEAR", pEffectiveYear);
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	@DbRecordType(id="TaxRptEarnHistRecRow", dataSourceName="TAX_RPT_EARN_HIST_REC", needsInitialization=true)
	public static class TaxRptEarnHistRecRow
	{
		@DbRecordField(dataSourceName="R_REPT_CODE")
		public NString RReptCode;
		@DbRecordField(dataSourceName="R_RBOX_CODE")
		public NString RRboxCode;
		@DbRecordField(dataSourceName="R_EFFECTIVE_YEAR")
		public NNumber REffectiveYear;
		@DbRecordField(dataSourceName="R_EARN_CODE")
		public NString REarnCode;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
