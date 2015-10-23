package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PbEffcertRptCtl {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EFFCERT_RPT_CTL.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pCoasCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EFFCERT_RPT_CTL.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fExists(NString pCoasCode) {
			
			return fExists(pCoasCode,NString.getNull());

		}
		
		public static NString fIsequal(EffcertRptCtlRecRow recOne,EffcertRptCtlRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EFFCERT_RPT_CTL.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, EffcertRptCtlRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, EffcertRptCtlRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pCoasCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EFFCERT_RPT_CTL.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryById(NNumber pId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EFFCERT_RPT_CTL.F_QUERY_BY_ID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ID", pId);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EFFCERT_RPT_CTL.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pCoasCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EFFCERT_RPT_CTL.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pCoasCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EFFCERT_RPT_CTL.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pCoasCode,NString pGradCertType,NString pSponsorSortOrder1,NString pSponsorSortOrder2,NString pNonsponsSortOrder1,NString pNonsponsSortOrder2,NString pCertStatement,NString pUserId,NString pDisplayChrgTypeInd,NString pAcctElement1,NString pAcctElement2,NString pAcctElement3,NString pAcctElement4,NString pAcctElement5,NString pDataOrigin,NString pAllocStatement,NString pAllocableSortOrder1,NString pAllocableSortOrder2,Ref<NNumber> pIdOut,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EFFCERT_RPT_CTL.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_GRAD_CERT_TYPE", pGradCertType);
			cmd.addParameter("@P_SPONSOR_SORT_ORDER_1", pSponsorSortOrder1);
			cmd.addParameter("@P_SPONSOR_SORT_ORDER_2", pSponsorSortOrder2);
			cmd.addParameter("@P_NONSPONS_SORT_ORDER_1", pNonsponsSortOrder1);
			cmd.addParameter("@P_NONSPONS_SORT_ORDER_2", pNonsponsSortOrder2);
			cmd.addParameter("@P_CERT_STATEMENT", pCertStatement);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DISPLAY_CHRG_TYPE_IND", pDisplayChrgTypeInd);
			cmd.addParameter("@P_ACCT_ELEMENT_1", pAcctElement1);
			cmd.addParameter("@P_ACCT_ELEMENT_2", pAcctElement2);
			cmd.addParameter("@P_ACCT_ELEMENT_3", pAcctElement3);
			cmd.addParameter("@P_ACCT_ELEMENT_4", pAcctElement4);
			cmd.addParameter("@P_ACCT_ELEMENT_5", pAcctElement5);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ALLOC_STATEMENT", pAllocStatement);
			cmd.addParameter("@P_ALLOCABLE_SORT_ORDER_1", pAllocableSortOrder1);
			cmd.addParameter("@P_ALLOCABLE_SORT_ORDER_2", pAllocableSortOrder2);
			cmd.addParameter("@P_ID_OUT", NNumber.class);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pIdOut.val = cmd.getParameterValue("@P_ID_OUT", NNumber.class);
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pCoasCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EFFCERT_RPT_CTL.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pCoasCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EFFCERT_RPT_CTL.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pCoasCode,NString pGradCertType,NString pSponsorSortOrder1,NString pSponsorSortOrder2,NString pNonsponsSortOrder1,NString pNonsponsSortOrder2,NString pCertStatement,NString pUserId,NString pDisplayChrgTypeInd,NString pAcctElement1,NString pAcctElement2,NString pAcctElement3,NString pAcctElement4,NString pAcctElement5,NString pDataOrigin,NString pAllocStatement,NString pAllocableSortOrder1,NString pAllocableSortOrder2,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EFFCERT_RPT_CTL.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_GRAD_CERT_TYPE", pGradCertType);
			cmd.addParameter("@P_SPONSOR_SORT_ORDER_1", pSponsorSortOrder1);
			cmd.addParameter("@P_SPONSOR_SORT_ORDER_2", pSponsorSortOrder2);
			cmd.addParameter("@P_NONSPONS_SORT_ORDER_1", pNonsponsSortOrder1);
			cmd.addParameter("@P_NONSPONS_SORT_ORDER_2", pNonsponsSortOrder2);
			cmd.addParameter("@P_CERT_STATEMENT", pCertStatement);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DISPLAY_CHRG_TYPE_IND", pDisplayChrgTypeInd);
			cmd.addParameter("@P_ACCT_ELEMENT_1", pAcctElement1);
			cmd.addParameter("@P_ACCT_ELEMENT_2", pAcctElement2);
			cmd.addParameter("@P_ACCT_ELEMENT_3", pAcctElement3);
			cmd.addParameter("@P_ACCT_ELEMENT_4", pAcctElement4);
			cmd.addParameter("@P_ACCT_ELEMENT_5", pAcctElement5);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ALLOC_STATEMENT", pAllocStatement);
			cmd.addParameter("@P_ALLOCABLE_SORT_ORDER_1", pAllocableSortOrder1);
			cmd.addParameter("@P_ALLOCABLE_SORT_ORDER_2", pAllocableSortOrder2);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="EffcertRptCtlRecRow", dataSourceName="EFFCERT_RPT_CTL_REC")
	public static class EffcertRptCtlRecRow
	{
		@DbRecordField(dataSourceName="R_ID")
		public NNumber RId;
		@DbRecordField(dataSourceName="R_COAS_CODE")
		public NString RCoasCode;
		@DbRecordField(dataSourceName="R_GRAD_CERT_TYPE")
		public NString RGradCertType;
		@DbRecordField(dataSourceName="R_SPONSOR_SORT_ORDER_1")
		public NString RSponsorSortOrder1;
		@DbRecordField(dataSourceName="R_SPONSOR_SORT_ORDER_2")
		public NString RSponsorSortOrder2;
		@DbRecordField(dataSourceName="R_NONSPONS_SORT_ORDER_1")
		public NString RNonsponsSortOrder1;
		@DbRecordField(dataSourceName="R_NONSPONS_SORT_ORDER_2")
		public NString RNonsponsSortOrder2;
		@DbRecordField(dataSourceName="R_CERT_STATEMENT")
		public NString RCertStatement;
		@DbRecordField(dataSourceName="R_DISPLAY_CHRG_TYPE_IND")
		public NString RDisplayChrgTypeInd;
		@DbRecordField(dataSourceName="R_ACCT_ELEMENT_1")
		public NString RAcctElement1;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_ACCT_ELEMENT_2")
		public NString RAcctElement2;
		@DbRecordField(dataSourceName="R_ACCT_ELEMENT_3")
		public NString RAcctElement3;
		@DbRecordField(dataSourceName="R_ACCT_ELEMENT_4")
		public NString RAcctElement4;
		@DbRecordField(dataSourceName="R_ACCT_ELEMENT_5")
		public NString RAcctElement5;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_ALLOC_STATEMENT")
		public NString RAllocStatement;
		@DbRecordField(dataSourceName="R_ALLOCABLE_SORT_ORDER_1")
		public NString RAllocableSortOrder1;
		@DbRecordField(dataSourceName="R_ALLOCABLE_SORT_ORDER_2")
		public NString RAllocableSortOrder2;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
