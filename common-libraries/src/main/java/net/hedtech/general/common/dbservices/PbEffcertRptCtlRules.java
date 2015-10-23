package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PbEffcertRptCtlRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EFFCERT_RPT_CTL_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pId,NString pCoasCode,NString pGradCertType,NString pSponsorSortOrder1,NString pSponsorSortOrder2,NString pNonsponsSortOrder1,NString pNonsponsSortOrder2,NString pCertStatement,NString pUserId,NString pDisplayChrgTypeInd,NString pAcctElement1,NString pAcctElement2,NString pAcctElement3,NString pAcctElement4,NString pAcctElement5,NString pDataOrigin,NString pAllocStatement,NString pAllocableSortOrder1,NString pAllocableSortOrder2,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EFFCERT_RPT_CTL_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_ID", pId);
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
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pCoasCode,NString pGradCertType,NString pSponsorSortOrder1,NString pSponsorSortOrder2,NString pNonsponsSortOrder1,NString pNonsponsSortOrder2,NString pCertStatement,NString pUserId,NString pDisplayChrgTypeInd,NString pAcctElement1,NString pAcctElement2,NString pAcctElement3,NString pAcctElement4,NString pAcctElement5,NString pDataOrigin,NString pAllocStatement,NString pAllocableSortOrder1,NString pAllocableSortOrder2) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EFFCERT_RPT_CTL_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
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
				
			cmd.execute();


		}
		
	
	
	
}
