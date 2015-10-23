package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PvTaxExemptHistory {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_TAX_EXEMPT_HISTORY.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pTxcdCode,NNumber pYear,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_TAX_EXEMPT_HISTORY.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TXCD_CODE", pTxcdCode);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(TaxExemptHistoryRecRow recOne,TaxExemptHistoryRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_TAX_EXEMPT_HISTORY.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, TaxExemptHistoryRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, TaxExemptHistoryRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pTxcdCode,NNumber pYear) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_TAX_EXEMPT_HISTORY.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TXCD_CODE", pTxcdCode);
			cmd.addParameter("@P_YEAR", pYear);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_TAX_EXEMPT_HISTORY.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pTxcdCode,NNumber pYear) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_TAX_EXEMPT_HISTORY.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TXCD_CODE", pTxcdCode);
			cmd.addParameter("@P_YEAR", pYear);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pTxcdCode,NNumber pYear,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_TAX_EXEMPT_HISTORY.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TXCD_CODE", pTxcdCode);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pTxcdCode,NNumber pYear,NNumber pPercent,NNumber pMaxAnnTax,NNumber pWageBase,NNumber pEmprPercent,NString pOptCode,NString pMultOrAdd,NNumber pExempMult,NString pUserId,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_TAX_EXEMPT_HISTORY.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TXCD_CODE", pTxcdCode);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_PERCENT", pPercent);
			cmd.addParameter("@P_MAX_ANN_TAX", pMaxAnnTax);
			cmd.addParameter("@P_WAGE_BASE", pWageBase);
			cmd.addParameter("@P_EMPR_PERCENT", pEmprPercent);
			cmd.addParameter("@P_OPT_CODE", pOptCode);
			cmd.addParameter("@P_MULT_OR_ADD", pMultOrAdd);
			cmd.addParameter("@P_EXEMP_MULT", pExempMult);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pTxcdCode,NNumber pYear,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_TAX_EXEMPT_HISTORY.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TXCD_CODE", pTxcdCode);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pTxcdCode,NNumber pYear,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_TAX_EXEMPT_HISTORY.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TXCD_CODE", pTxcdCode);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pTxcdCode,NNumber pYear,NNumber pPercent,NNumber pMaxAnnTax,NNumber pWageBase,NNumber pEmprPercent,NString pOptCode,NString pMultOrAdd,NNumber pExempMult,NString pUserId,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_TAX_EXEMPT_HISTORY.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TXCD_CODE", pTxcdCode);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_PERCENT", pPercent);
			cmd.addParameter("@P_MAX_ANN_TAX", pMaxAnnTax);
			cmd.addParameter("@P_WAGE_BASE", pWageBase);
			cmd.addParameter("@P_EMPR_PERCENT", pEmprPercent);
			cmd.addParameter("@P_OPT_CODE", pOptCode);
			cmd.addParameter("@P_MULT_OR_ADD", pMultOrAdd);
			cmd.addParameter("@P_EXEMP_MULT", pExempMult);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	@DbRecordType(id="TaxExemptHistoryRecRow", dataSourceName="TAX_EXEMPT_HISTORY_REC", needsInitialization=true)
	public static class TaxExemptHistoryRecRow
	{
		@DbRecordField(dataSourceName="R_TXCD_CODE")
		public NString RTxcdCode;
		@DbRecordField(dataSourceName="R_YEAR")
		public NNumber RYear;
		@DbRecordField(dataSourceName="R_PERCENT")
		public NNumber RPercent;
		@DbRecordField(dataSourceName="R_MAX_ANN_TAX")
		public NNumber RMaxAnnTax;
		@DbRecordField(dataSourceName="R_WAGE_BASE")
		public NNumber RWageBase;
		@DbRecordField(dataSourceName="R_EMPR_PERCENT")
		public NNumber REmprPercent;
		@DbRecordField(dataSourceName="R_OPT_CODE")
		public NString ROptCode;
		@DbRecordField(dataSourceName="R_MULT_OR_ADD")
		public NString RMultOrAdd;
		@DbRecordField(dataSourceName="R_EXEMP_MULT")
		public NNumber RExempMult;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
