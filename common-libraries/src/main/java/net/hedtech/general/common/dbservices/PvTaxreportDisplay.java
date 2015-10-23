package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PvTaxreportDisplay {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_TAXREPORT_DISPLAY.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pTaxReptCode,NString pBoxNum,NString pEffectiveYear,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_TAXREPORT_DISPLAY.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TAX_REPT_CODE", pTaxReptCode);
			cmd.addParameter("@P_BOX_NUM", pBoxNum);
			cmd.addParameter("@P_EFFECTIVE_YEAR", pEffectiveYear);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(TaxreportDisplayRecRow recOne,TaxreportDisplayRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_TAXREPORT_DISPLAY.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, TaxreportDisplayRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, TaxreportDisplayRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pTaxReptCode,NString pBoxNum,NString pEffectiveYear) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_TAXREPORT_DISPLAY.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TAX_REPT_CODE", pTaxReptCode);
			cmd.addParameter("@P_BOX_NUM", pBoxNum);
			cmd.addParameter("@P_EFFECTIVE_YEAR", pEffectiveYear);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_TAXREPORT_DISPLAY.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pTaxReptCode,NString pBoxNum,NString pEffectiveYear) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_TAXREPORT_DISPLAY.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TAX_REPT_CODE", pTaxReptCode);
			cmd.addParameter("@P_BOX_NUM", pBoxNum);
			cmd.addParameter("@P_EFFECTIVE_YEAR", pEffectiveYear);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pTaxReptCode,NString pBoxNum,NString pEffectiveYear,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_TAXREPORT_DISPLAY.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TAX_REPT_CODE", pTaxReptCode);
			cmd.addParameter("@P_BOX_NUM", pBoxNum);
			cmd.addParameter("@P_EFFECTIVE_YEAR", pEffectiveYear);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pTaxReptCode,NString pBoxNum,NString pEffectiveYear,NString pColumnName,NString pFieldLabel,NString pSysReqInd,NString pUserId,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_TAXREPORT_DISPLAY.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TAX_REPT_CODE", pTaxReptCode);
			cmd.addParameter("@P_BOX_NUM", pBoxNum);
			cmd.addParameter("@P_EFFECTIVE_YEAR", pEffectiveYear);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
			cmd.addParameter("@P_FIELD_LABEL", pFieldLabel);
			cmd.addParameter("@P_SYS_REQ_IND", pSysReqInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pTaxReptCode,NString pBoxNum,NString pEffectiveYear,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_TAXREPORT_DISPLAY.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TAX_REPT_CODE", pTaxReptCode);
			cmd.addParameter("@P_BOX_NUM", pBoxNum);
			cmd.addParameter("@P_EFFECTIVE_YEAR", pEffectiveYear);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pTaxReptCode,NString pBoxNum,NString pEffectiveYear,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_TAXREPORT_DISPLAY.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TAX_REPT_CODE", pTaxReptCode);
			cmd.addParameter("@P_BOX_NUM", pBoxNum);
			cmd.addParameter("@P_EFFECTIVE_YEAR", pEffectiveYear);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pTaxReptCode,NString pBoxNum,NString pEffectiveYear,NString pColumnName,NString pFieldLabel,NString pSysReqInd,NString pUserId,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_TAXREPORT_DISPLAY.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TAX_REPT_CODE", pTaxReptCode);
			cmd.addParameter("@P_BOX_NUM", pBoxNum);
			cmd.addParameter("@P_EFFECTIVE_YEAR", pEffectiveYear);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
			cmd.addParameter("@P_FIELD_LABEL", pFieldLabel);
			cmd.addParameter("@P_SYS_REQ_IND", pSysReqInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	@DbRecordType(id="TaxreportDisplayRecRow", dataSourceName="TAXREPORT_DISPLAY_REC", needsInitialization=true)
	public static class TaxreportDisplayRecRow
	{
		@DbRecordField(dataSourceName="R_TAX_REPT_CODE")
		public NString RTaxReptCode;
		@DbRecordField(dataSourceName="R_BOX_NUM")
		public NString RBoxNum;
		@DbRecordField(dataSourceName="R_EFFECTIVE_YEAR")
		public NString REffectiveYear;
		@DbRecordField(dataSourceName="R_COLUMN_NAME")
		public NString RColumnName;
		@DbRecordField(dataSourceName="R_FIELD_LABEL")
		public NString RFieldLabel;
		@DbRecordField(dataSourceName="R_SYS_REQ_IND")
		public NString RSysReqInd;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
