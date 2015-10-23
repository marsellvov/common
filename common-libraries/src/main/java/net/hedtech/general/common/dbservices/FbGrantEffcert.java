package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class FbGrantEffcert {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_GRANT_EFFCERT.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pCoasCode,NString pAcctElement,NString pAcctElementValue,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_GRANT_EFFCERT.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_ACCT_ELEMENT", pAcctElement);
			cmd.addParameter("@P_ACCT_ELEMENT_VALUE", pAcctElementValue);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(GrantEffcertRecRow recOne,GrantEffcertRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_GRANT_EFFCERT.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, GrantEffcertRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, GrantEffcertRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pCoasCode,NString pAcctElement,NString pAcctElementValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_GRANT_EFFCERT.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_ACCT_ELEMENT", pAcctElement);
			cmd.addParameter("@P_ACCT_ELEMENT_VALUE", pAcctElementValue);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryById(NNumber pId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_GRANT_EFFCERT.F_QUERY_BY_ID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ID", pId);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_GRANT_EFFCERT.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pCoasCode,NString pAcctElement,NString pAcctElementValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_GRANT_EFFCERT.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_ACCT_ELEMENT", pAcctElement);
			cmd.addParameter("@P_ACCT_ELEMENT_VALUE", pAcctElementValue);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pCoasCode,NString pAcctElement,NString pAcctElementValue,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_GRANT_EFFCERT.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_ACCT_ELEMENT", pAcctElement);
			cmd.addParameter("@P_ACCT_ELEMENT_VALUE", pAcctElementValue);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pCoasCode,NString pGrntCode,NString pAcctElement,NString pAcctElementValue,NString pReportSection,NString pChargeType,NString pUserId,NString pEccgCode,NString pDataOrigin,Ref<NNumber> pIdOut,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_GRANT_EFFCERT.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_GRNT_CODE", pGrntCode);
			cmd.addParameter("@P_ACCT_ELEMENT", pAcctElement);
			cmd.addParameter("@P_ACCT_ELEMENT_VALUE", pAcctElementValue);
			cmd.addParameter("@P_REPORT_SECTION", pReportSection);
			cmd.addParameter("@P_CHARGE_TYPE", pChargeType);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ECCG_CODE", pEccgCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ID_OUT", NNumber.class);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pIdOut.val = cmd.getParameterValue("@P_ID_OUT", NNumber.class);
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pCoasCode,NString pGrntCode,NString pAcctElement,NString pAcctElementValue,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_GRANT_EFFCERT.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_GRNT_CODE", pGrntCode);
			cmd.addParameter("@P_ACCT_ELEMENT", pAcctElement);
			cmd.addParameter("@P_ACCT_ELEMENT_VALUE", pAcctElementValue);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pCoasCode,NString pGrntCode,NString pAcctElement,NString pAcctElementValue,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_GRANT_EFFCERT.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_GRNT_CODE", pGrntCode);
			cmd.addParameter("@P_ACCT_ELEMENT", pAcctElement);
			cmd.addParameter("@P_ACCT_ELEMENT_VALUE", pAcctElementValue);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pCoasCode,NString pGrntCode,NString pAcctElement,NString pAcctElementValue,NString pReportSection,NString pChargeType,NString pUserId,NString pEccgCode,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_GRANT_EFFCERT.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_GRNT_CODE", pGrntCode);
			cmd.addParameter("@P_ACCT_ELEMENT", pAcctElement);
			cmd.addParameter("@P_ACCT_ELEMENT_VALUE", pAcctElementValue);
			cmd.addParameter("@P_REPORT_SECTION", pReportSection);
			cmd.addParameter("@P_CHARGE_TYPE", pChargeType);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ECCG_CODE", pEccgCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="GrantEffcertRecRow", dataSourceName="GRANT_EFFCERT_REC")
	public static class GrantEffcertRecRow
	{
		@DbRecordField(dataSourceName="R_ID")
		public NNumber RId;
		@DbRecordField(dataSourceName="R_COAS_CODE")
		public NString RCoasCode;
		@DbRecordField(dataSourceName="R_GRNT_CODE")
		public NString RGrntCode;
		@DbRecordField(dataSourceName="R_ACCT_ELEMENT")
		public NString RAcctElement;
		@DbRecordField(dataSourceName="R_ACCT_ELEMENT_VALUE")
		public NString RAcctElementValue;
		@DbRecordField(dataSourceName="R_REPORT_SECTION")
		public NString RReportSection;
		@DbRecordField(dataSourceName="R_CHARGE_TYPE")
		public NString RChargeType;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_ECCG_CODE")
		public NString REccgCode;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
