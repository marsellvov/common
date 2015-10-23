package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class FbVendorRules {
		public static void pRegisterEntity(NNumber pOperationType,NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_VENDOR_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pPidm,NDate pEffDate,NDate pTermDate,NString pUserId,NNumber pItypSeqCode,NString pDiscCode,NString p1099RptId,NString pTratCode,NString pInStInd,NString pGroupingInd,NString pCarrierInd,NString pContact,NString pCtryCodePhone,NString pPhoneArea,NString pPhoneNumber,NString pPhoneExt,NString pAtypCode,NNumber pAddrSeqno,NNumber pFedWholdPct,NNumber pStWholdPct,NString pCombinedFedStFiler,NString pCollectTax,NNumber pVendCheckPidm,NString pVendCheckAtypCode,NNumber pVendCheckAddrSeqno,NString pCurrCode,NString pEntityInd,NNumber pPidmOwner,NString pEprocInd,NString pDataOrigin,NString pPoHoldRsnCode,NString pPmtHoldRsnCode,NString p1099AtypCode,NNumber p1099AddrSeqno,NString pTaxFormStatus,NDate pTaxFormDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_VENDOR_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
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
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pPidm,NDate pEffDate,NDate pTermDate,NString pUserId,NNumber pItypSeqCode,NString pDiscCode,NString p1099RptId,NString pTratCode,NString pInStInd,NString pGroupingInd,NString pCarrierInd,NString pContact,NString pCtryCodePhone,NString pPhoneArea,NString pPhoneNumber,NString pPhoneExt,NString pAtypCode,NNumber pAddrSeqno,NNumber pFedWholdPct,NNumber pStWholdPct,NString pCombinedFedStFiler,NString pCollectTax,NNumber pVendCheckPidm,NString pVendCheckAtypCode,NNumber pVendCheckAddrSeqno,NString pCurrCode,NString pEntityInd,NNumber pPidmOwner,NString pEprocInd,NString pDataOrigin,NString pPoHoldRsnCode,NString pPmtHoldRsnCode,NString p1099AtypCode,NNumber p1099AddrSeqno,NString pTaxFormStatus,NDate pTaxFormDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_VENDOR_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
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
				
			cmd.execute();


		}
		
	
	
	
}
