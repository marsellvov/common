package net.hedtech.general.common.dbservices;

import java.util.*;

import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;
import morphis.foundations.core.types.NString;
import morphis.foundations.core.types.NNumber;
import morphis.foundations.core.types.NDate;


public class FbVendor {
		public static NString fActiveVendor(NNumber pPidm,NDate pEffDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_VENDOR.F_ACTIVE_VENDOR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_EFF_DATE", pEffDate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_VENDOR.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NBool fExists(NNumber pPidm,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_VENDOR.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static DataCursor fQueryAll(NNumber pPidm,NDate pEffDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_VENDOR.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_EFF_DATE", pEffDate);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
	
		public static Cursor fQueryOne(NNumber pPidm,NDate pEffDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_VENDOR.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_EFF_DATE", pEffDate);
				
			cmd.execute();

			return cmd.getReturnValue(Cursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pPidm,NString pRowid,NDate pEffDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_VENDOR.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ROWID", pRowid);
			cmd.addParameter("@P_EFF_DATE", pEffDate);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static NString fVendorExists(NNumber pPidm,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_VENDOR.F_VENDOR_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pCreate(NNumber pPidm,NDate pEffDate,NDate pTermDate,NString pUserId,NNumber pItypSeqCode,NString pDiscCode,NString p1099RptId,NString pTratCode,NString pInStInd,NString pGroupingInd,NString pCarrierInd,NString pContact,NString pCtryCodePhone,NString pPhoneArea,NString pPhoneNumber,NString pPhoneExt,NString pAtypCode,NNumber pAddrSeqno,NNumber pFedWholdPct,NNumber pStWholdPct,NString pCombinedFedStFiler,NString pCollectTax,NNumber pVendCheckPidm,NString pVendCheckAtypCode,NNumber pVendCheckAddrSeqno,NString pCurrCode,NString pEntityInd,NNumber pPidmOwner,NString pEprocInd,NString pDataOrigin,NString pPoHoldRsnCode,NString pPmtHoldRsnCode,NString p1099AtypCode,NNumber p1099AddrSeqno,NString pTaxFormStatus,NDate pTaxFormDate,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_VENDOR.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_EFF_DATE", pEffDate);
			cmd.addParameter("@P_TERM_DATE", pTermDate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ITYP_SEQ_CODE", pItypSeqCode);
			cmd.addParameter("@P_DISC_CODE", pDiscCode);
			cmd.addParameter("@P_1099_RPT_ID", p1099RptId);
			cmd.addParameter("@P_TRAT_CODE", pTratCode);
			cmd.addParameter("@P_IN_ST_IND", pInStInd);
			cmd.addParameter("@P_GROUPING_IND", pGroupingInd);
			cmd.addParameter("@P_CARRIER_IND", pCarrierInd);
			cmd.addParameter("@P_CONTACT", pContact);
			cmd.addParameter("@P_CTRY_CODE_PHONE", pCtryCodePhone);
			cmd.addParameter("@P_PHONE_AREA", pPhoneArea);
			cmd.addParameter("@P_PHONE_NUMBER", pPhoneNumber);
			cmd.addParameter("@P_PHONE_EXT", pPhoneExt);
			cmd.addParameter("@P_ATYP_CODE", pAtypCode);
			cmd.addParameter("@P_ADDR_SEQNO", pAddrSeqno);
			cmd.addParameter("@P_FED_WHOLD_PCT", pFedWholdPct);
			cmd.addParameter("@P_ST_WHOLD_PCT", pStWholdPct);
			cmd.addParameter("@P_COMBINED_FED_ST_FILER", pCombinedFedStFiler);
			cmd.addParameter("@P_COLLECT_TAX", pCollectTax);
			cmd.addParameter("@P_VEND_CHECK_PIDM", pVendCheckPidm);
			cmd.addParameter("@P_VEND_CHECK_ATYP_CODE", pVendCheckAtypCode);
			cmd.addParameter("@P_VEND_CHECK_ADDR_SEQNO", pVendCheckAddrSeqno);
			cmd.addParameter("@P_CURR_CODE", pCurrCode);
			cmd.addParameter("@P_ENTITY_IND", pEntityInd);
			cmd.addParameter("@P_PIDM_OWNER", pPidmOwner);
			cmd.addParameter("@P_EPROC_IND", pEprocInd);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_PO_HOLD_RSN_CODE", pPoHoldRsnCode);
			cmd.addParameter("@P_PMT_HOLD_RSN_CODE", pPmtHoldRsnCode);
			cmd.addParameter("@P_1099_ATYP_CODE", p1099AtypCode);
			cmd.addParameter("@P_1099_ADDR_SEQNO", p1099AddrSeqno);
			cmd.addParameter("@P_TAX_FORM_STATUS", pTaxFormStatus);
			cmd.addParameter("@P_TAX_FORM_DATE", pTaxFormDate);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pPidm,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_VENDOR.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pPidm,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_VENDOR.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pUpdate(NNumber pPidm,NDate pEffDate,NDate pTermDate,NString pUserId,NNumber pItypSeqCode,NString pDiscCode,NString p1099RptId,NString pTratCode,NString pInStInd,NString pGroupingInd,NString pCarrierInd,NString pContact,NString pCtryCodePhone,NString pPhoneArea,NString pPhoneNumber,NString pPhoneExt,NString pAtypCode,NNumber pAddrSeqno,NNumber pFedWholdPct,NNumber pStWholdPct,NString pCombinedFedStFiler,NString pCollectTax,NNumber pVendCheckPidm,NString pVendCheckAtypCode,NNumber pVendCheckAddrSeqno,NString pCurrCode,NString pEntityInd,NNumber pPidmOwner,NString pEprocInd,NString pDataOrigin,NString pPoHoldRsnCode,NString pPmtHoldRsnCode,NString p1099AtypCode,NNumber p1099AddrSeqno,NString pTaxFormStatus,NDate pTaxFormDate,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_VENDOR.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_EFF_DATE", pEffDate);
			cmd.addParameter("@P_TERM_DATE", pTermDate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ITYP_SEQ_CODE", pItypSeqCode);
			cmd.addParameter("@P_DISC_CODE", pDiscCode);
			cmd.addParameter("@P_1099_RPT_ID", p1099RptId);
			cmd.addParameter("@P_TRAT_CODE", pTratCode);
			cmd.addParameter("@P_IN_ST_IND", pInStInd);
			cmd.addParameter("@P_GROUPING_IND", pGroupingInd);
			cmd.addParameter("@P_CARRIER_IND", pCarrierInd);
			cmd.addParameter("@P_CONTACT", pContact);
			cmd.addParameter("@P_CTRY_CODE_PHONE", pCtryCodePhone);
			cmd.addParameter("@P_PHONE_AREA", pPhoneArea);
			cmd.addParameter("@P_PHONE_NUMBER", pPhoneNumber);
			cmd.addParameter("@P_PHONE_EXT", pPhoneExt);
			cmd.addParameter("@P_ATYP_CODE", pAtypCode);
			cmd.addParameter("@P_ADDR_SEQNO", pAddrSeqno);
			cmd.addParameter("@P_FED_WHOLD_PCT", pFedWholdPct);
			cmd.addParameter("@P_ST_WHOLD_PCT", pStWholdPct);
			cmd.addParameter("@P_COMBINED_FED_ST_FILER", pCombinedFedStFiler);
			cmd.addParameter("@P_COLLECT_TAX", pCollectTax);
			cmd.addParameter("@P_VEND_CHECK_PIDM", pVendCheckPidm);
			cmd.addParameter("@P_VEND_CHECK_ATYP_CODE", pVendCheckAtypCode);
			cmd.addParameter("@P_VEND_CHECK_ADDR_SEQNO", pVendCheckAddrSeqno);
			cmd.addParameter("@P_CURR_CODE", pCurrCode);
			cmd.addParameter("@P_ENTITY_IND", pEntityInd);
			cmd.addParameter("@P_PIDM_OWNER", pPidmOwner);
			cmd.addParameter("@P_EPROC_IND", pEprocInd);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_PO_HOLD_RSN_CODE", pPoHoldRsnCode);
			cmd.addParameter("@P_PMT_HOLD_RSN_CODE", pPmtHoldRsnCode);
			cmd.addParameter("@P_1099_ATYP_CODE", p1099AtypCode);
			cmd.addParameter("@P_1099_ADDR_SEQNO", p1099AddrSeqno);
			cmd.addParameter("@P_TAX_FORM_STATUS", pTaxFormStatus);
			cmd.addParameter("@P_TAX_FORM_DATE", pTaxFormDate);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="VendorRecRow", dataSourceName="VENDOR_REC")
	public static class VendorRecRow
	{
		
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_EFF_DATE")
		public NDate REffDate;
		@DbRecordField(dataSourceName="R_TERM_DATE")
		public NDate RTermDate;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_ITYP_SEQ_CODE")
		public NNumber RItypSeqCode;
		@DbRecordField(dataSourceName="R_DISC_CODE")
		public NString RDiscCode;
		@DbRecordField(dataSourceName="R_1099_RPT_ID")
		public NString R1099RptId;
		@DbRecordField(dataSourceName="R_TRAT_CODE")
		public NString RTratCode;
		@DbRecordField(dataSourceName="R_IN_ST_IND")
		public NString RInStInd;
		@DbRecordField(dataSourceName="R_GROUPING_IND")
		public NString RGroupingInd;
		@DbRecordField(dataSourceName="R_CARRIER_IND")
		public NString RCarrierInd;
		@DbRecordField(dataSourceName="R_CONTACT")
		public NString RContact;
		@DbRecordField(dataSourceName="R_CTRY_CODE_PHONE")
		public NString RCtryCodePhone;
		@DbRecordField(dataSourceName="R_PHONE_AREA")
		public NString RPhoneArea;
		@DbRecordField(dataSourceName="R_PHONE_NUMBER")
		public NString RPhoneNumber;
		@DbRecordField(dataSourceName="R_PHONE_EXT")
		public NString RPhoneExt;
		@DbRecordField(dataSourceName="R_ATYP_CODE")
		public NString RAtypCode;
		@DbRecordField(dataSourceName="R_ADDR_SEQNO")
		public NNumber RAddrSeqno;
		@DbRecordField(dataSourceName="R_FED_WHOLD_PCT")
		public NNumber RFedWholdPct;
		@DbRecordField(dataSourceName="R_ST_WHOLD_PCT")
		public NNumber RStWholdPct;
		@DbRecordField(dataSourceName="R_COMBINED_FED_ST_FILER")
		public NString RCombinedFedStFiler;
		@DbRecordField(dataSourceName="R_COLLECT_TAX")
		public NString RCollectTax;
		@DbRecordField(dataSourceName="R_VEND_CHECK_PIDM")
		public NNumber RVendCheckPidm;
		@DbRecordField(dataSourceName="R_VEND_CHECK_ATYP_CODE")
		public NString RVendCheckAtypCode;
		@DbRecordField(dataSourceName="R_VEND_CHECK_ADDR_SEQNO")
		public NNumber RVendCheckAddrSeqno;
		@DbRecordField(dataSourceName="R_CURR_CODE")
		public NString RCurrCode;
		@DbRecordField(dataSourceName="R_ENTITY_IND")
		public NString REntityInd;
		@DbRecordField(dataSourceName="R_PIDM_OWNER")
		public NNumber RPidmOwner;
		@DbRecordField(dataSourceName="R_EPROC_IND")
		public NString REprocInd;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_PO_HOLD_RSN_CODE")
		public NString RPoHoldRsnCode;
		@DbRecordField(dataSourceName="R_PMT_HOLD_RSN_CODE")
		public NString RPmtHoldRsnCode;
		@DbRecordField(dataSourceName="R_1099_ATYP_CODE")
		public NString R1099AtypCode;
		@DbRecordField(dataSourceName="R_1099_ADDR_SEQNO")
		public NNumber R1099AddrSeqno;
		@DbRecordField(dataSourceName="R_TAX_FORM_STATUS")
		public NString RTaxFormStatus;
		@DbRecordField(dataSourceName="R_TAX_FORM_DATE")
		public NDate RTaxFormDate;
		@DbRecordField(dataSourceName="INTERNAL_RECORD_ID")
		public NString InternalRecordId;
		
		public VendorRecRow(Row spridenRefResults) {
			super();
			RPidm = NNumber.toNumber(spridenRefResults.getObject(1));
			REffDate = NDate.toDate(spridenRefResults.getObject(2));
			RTermDate = NDate.toDate(spridenRefResults.getObject(3));
			RUserId = NString.toStr(spridenRefResults.getObject(4));
			RItypSeqCode = NNumber.toNumber(spridenRefResults.getObject(5));
			RDiscCode = NString.toStr(spridenRefResults.getObject(6));
			R1099RptId = NString.toStr(spridenRefResults.getObject(7));
			RTratCode = NString.toStr(spridenRefResults.getObject(8));
			RInStInd = NString.toStr(spridenRefResults.getObject(9));
			RGroupingInd = NString.toStr(spridenRefResults.getObject(10));
			RCarrierInd = NString.toStr(spridenRefResults.getObject(11));
			RContact = NString.toStr(spridenRefResults.getObject(12));
			RCtryCodePhone = NString.toStr(spridenRefResults.getObject(13));
			RPhoneArea = NString.toStr(spridenRefResults.getObject(14));
			RPhoneNumber = NString.toStr(spridenRefResults.getObject(15));
			RPhoneExt = NString.toStr(spridenRefResults.getObject(16));
			RAtypCode = NString.toStr(spridenRefResults.getObject(17));
			RAddrSeqno = NNumber.toNumber(spridenRefResults.getObject(18));
			RFedWholdPct = NNumber.toNumber(spridenRefResults.getObject(19));
			RStWholdPct = NNumber.toNumber(spridenRefResults.getObject(20));
			RCombinedFedStFiler = NString.toStr(spridenRefResults.getObject(21));
			RCollectTax = NString.toStr(spridenRefResults.getObject(22));
			RVendCheckPidm = NNumber.toNumber(spridenRefResults.getObject(23));
			RVendCheckAtypCode = NString.toStr(spridenRefResults.getObject(24));
			RVendCheckAddrSeqno = NNumber.toNumber(spridenRefResults.getObject(25));
			RCurrCode = NString.toStr(spridenRefResults.getObject(26));
			REntityInd = NString.toStr(spridenRefResults.getObject(27));
			RPidmOwner = NNumber.toNumber(spridenRefResults.getObject(28));
			REprocInd = NString.toStr(spridenRefResults.getObject(29));
			RDataOrigin = NString.toStr(spridenRefResults.getObject(30));
			RPoHoldRsnCode = NString.toStr(spridenRefResults.getObject(31));
			RPmtHoldRsnCode = NString.toStr(spridenRefResults.getObject(32));
			R1099AtypCode = NString.toStr(spridenRefResults.getObject(33));
			R1099AddrSeqno = NNumber.toNumber(spridenRefResults.getObject(34));
			RTaxFormStatus = NString.toStr(spridenRefResults.getObject(35));
			RTaxFormDate = NDate.toDate(spridenRefResults.getObject(36));
			InternalRecordId = NString.toStr(spridenRefResults.getObject(37));
		}
	}
}
