package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PvHrLocalizationInstRules {
		public static void pRegisterEntity(NNumber pOperationType,NNumber pOperationType1,NString pInternalRecordId,NString pInternalRecordId1) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_HR_LOCALIZATION_INST_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType1);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId1);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pOperationType1,NString pEclsSecurityInd,NString pEclsSecurityInd1,NString pTaxExemptDednInd,NString pTaxExemptDednInd1,NString pEmalnIndicator,NString pEmalnIndicator1,NString pUserId,NString pUserId1,NString pDataOrigin,NString pDataOrigin1,NString pTaxreportControl,NString pTaxreportControl1,NString pPrintSlipInd,NString pPrintSlipInd1,NString pCode,NString pCode1,NString pRevokeTfrmConstInd,NString pRevokeTfrmConstInd1,NString pRevokeTfrmLeaveInd,NString pYearWebT4,NString pYearWebT4a,NString pYearWebT41,NString pYearWebT4anr,NString pYearWebT4a1,NString pYearWebT4anr1,NString pYearWebRl1,NString pYearWebRl11,NString pYearWebRl2,NString pYearWebRl21,NString pYearWebNr4,NDate pViewingDateT4,NString pYearWebNr41,NDate pViewingDateT4a,NDate pViewingDateT41,NDate pViewingDateT4a1,NDate pViewingDateT4anr,NDate pViewingDateT4anr1,NDate pViewingDateNr4,NDate pViewingDateRl1,NDate pViewingDateNr41,NDate pViewingDateRl11,NDate pViewingDateRl2,NDate pViewingDateRl21,NString pSortOrgnInd,NString pInternalRecordId,NString pSortOrgnInd1,NString pInternalRecordId1) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_HR_LOCALIZATION_INST_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType1);
			cmd.addParameter("@P_ECLS_SECURITY_IND", pEclsSecurityInd);
			cmd.addParameter("@P_ECLS_SECURITY_IND", pEclsSecurityInd1);
			cmd.addParameter("@P_TAX_EXEMPT_DEDN_IND", pTaxExemptDednInd);
			cmd.addParameter("@P_TAX_EXEMPT_DEDN_IND", pTaxExemptDednInd1);
			cmd.addParameter("@P_EMALN_INDICATOR", pEmalnIndicator);
			cmd.addParameter("@P_EMALN_INDICATOR", pEmalnIndicator1);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_USER_ID", pUserId1);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin1);
			cmd.addParameter("@P_TAXREPORT_CONTROL", pTaxreportControl);
			cmd.addParameter("@P_TAXREPORT_CONTROL", pTaxreportControl1);
			cmd.addParameter("@P_PRINT_SLIP_IND", pPrintSlipInd);
			cmd.addParameter("@P_PRINT_SLIP_IND", pPrintSlipInd1);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_CODE", pCode1);
			cmd.addParameter("@P_REVOKE_TFRM_CONST_IND", pRevokeTfrmConstInd);
			cmd.addParameter("@P_REVOKE_TFRM_CONST_IND", pRevokeTfrmConstInd1);
			cmd.addParameter("@P_REVOKE_TFRM_LEAVE_IND", pRevokeTfrmLeaveInd);
			cmd.addParameter("@P_YEAR_WEB_T4", pYearWebT4);
			cmd.addParameter("@P_YEAR_WEB_T4A", pYearWebT4a);
			cmd.addParameter("@P_YEAR_WEB_T4", pYearWebT41);
			cmd.addParameter("@P_YEAR_WEB_T4ANR", pYearWebT4anr);
			cmd.addParameter("@P_YEAR_WEB_T4A", pYearWebT4a1);
			cmd.addParameter("@P_YEAR_WEB_T4ANR", pYearWebT4anr1);
			cmd.addParameter("@P_YEAR_WEB_RL1", pYearWebRl1);
			cmd.addParameter("@P_YEAR_WEB_RL1", pYearWebRl11);
			cmd.addParameter("@P_YEAR_WEB_RL2", pYearWebRl2);
			cmd.addParameter("@P_YEAR_WEB_RL2", pYearWebRl21);
			cmd.addParameter("@P_YEAR_WEB_NR4", pYearWebNr4);
			cmd.addParameter("@P_VIEWING_DATE_T4", pViewingDateT4);
			cmd.addParameter("@P_YEAR_WEB_NR4", pYearWebNr41);
			cmd.addParameter("@P_VIEWING_DATE_T4A", pViewingDateT4a);
			cmd.addParameter("@P_VIEWING_DATE_T4", pViewingDateT41);
			cmd.addParameter("@P_VIEWING_DATE_T4A", pViewingDateT4a1);
			cmd.addParameter("@P_VIEWING_DATE_T4ANR", pViewingDateT4anr);
			cmd.addParameter("@P_VIEWING_DATE_T4ANR", pViewingDateT4anr1);
			cmd.addParameter("@P_VIEWING_DATE_NR4", pViewingDateNr4);
			cmd.addParameter("@P_VIEWING_DATE_RL1", pViewingDateRl1);
			cmd.addParameter("@P_VIEWING_DATE_NR4", pViewingDateNr41);
			cmd.addParameter("@P_VIEWING_DATE_RL1", pViewingDateRl11);
			cmd.addParameter("@P_VIEWING_DATE_RL2", pViewingDateRl2);
			cmd.addParameter("@P_VIEWING_DATE_RL2", pViewingDateRl21);
			cmd.addParameter("@P_SORT_ORGN_IND", pSortOrgnInd);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
			cmd.addParameter("@P_SORT_ORGN_IND", pSortOrgnInd1);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId1);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pEclsSecurityInd,NString pEclsSecurityInd1,NString pTaxExemptDednInd,NString pTaxExemptDednInd1,NString pEmalnIndicator,NString pEmalnIndicator1,NString pUserId,NString pUserId1,NString pDataOrigin,NString pDataOrigin1,NString pTaxreportControl,NString pTaxreportControl1,NString pPrintSlipInd,NString pPrintSlipInd1,NString pCode,NString pCode1,NString pRevokeTfrmConstInd,NString pRevokeTfrmConstInd1,NString pYearWebT4,NString pRevokeTfrmLeaveInd,NString pYearWebT41,NString pYearWebT4a,NString pYearWebT4a1,NString pYearWebT4anr,NString pYearWebRl1,NString pYearWebT4anr1,NString pYearWebRl2,NString pYearWebRl11,NString pYearWebNr4,NString pYearWebRl21,NString pYearWebNr41,NDate pViewingDateT4,NDate pViewingDateT4a,NDate pViewingDateT41,NDate pViewingDateT4a1,NDate pViewingDateT4anr,NDate pViewingDateT4anr1,NDate pViewingDateNr4,NDate pViewingDateNr41,NDate pViewingDateRl1,NDate pViewingDateRl11,NDate pViewingDateRl2,NString pSortOrgnInd,NDate pViewingDateRl21,NString pSortOrgnInd1) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_HR_LOCALIZATION_INST_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ECLS_SECURITY_IND", pEclsSecurityInd);
			cmd.addParameter("@P_ECLS_SECURITY_IND", pEclsSecurityInd1);
			cmd.addParameter("@P_TAX_EXEMPT_DEDN_IND", pTaxExemptDednInd);
			cmd.addParameter("@P_TAX_EXEMPT_DEDN_IND", pTaxExemptDednInd1);
			cmd.addParameter("@P_EMALN_INDICATOR", pEmalnIndicator);
			cmd.addParameter("@P_EMALN_INDICATOR", pEmalnIndicator1);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_USER_ID", pUserId1);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin1);
			cmd.addParameter("@P_TAXREPORT_CONTROL", pTaxreportControl);
			cmd.addParameter("@P_TAXREPORT_CONTROL", pTaxreportControl1);
			cmd.addParameter("@P_PRINT_SLIP_IND", pPrintSlipInd);
			cmd.addParameter("@P_PRINT_SLIP_IND", pPrintSlipInd1);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_CODE", pCode1);
			cmd.addParameter("@P_REVOKE_TFRM_CONST_IND", pRevokeTfrmConstInd);
			cmd.addParameter("@P_REVOKE_TFRM_CONST_IND", pRevokeTfrmConstInd1);
			cmd.addParameter("@P_YEAR_WEB_T4", pYearWebT4);
			cmd.addParameter("@P_REVOKE_TFRM_LEAVE_IND", pRevokeTfrmLeaveInd);
			cmd.addParameter("@P_YEAR_WEB_T4", pYearWebT41);
			cmd.addParameter("@P_YEAR_WEB_T4A", pYearWebT4a);
			cmd.addParameter("@P_YEAR_WEB_T4A", pYearWebT4a1);
			cmd.addParameter("@P_YEAR_WEB_T4ANR", pYearWebT4anr);
			cmd.addParameter("@P_YEAR_WEB_RL1", pYearWebRl1);
			cmd.addParameter("@P_YEAR_WEB_T4ANR", pYearWebT4anr1);
			cmd.addParameter("@P_YEAR_WEB_RL2", pYearWebRl2);
			cmd.addParameter("@P_YEAR_WEB_RL1", pYearWebRl11);
			cmd.addParameter("@P_YEAR_WEB_NR4", pYearWebNr4);
			cmd.addParameter("@P_YEAR_WEB_RL2", pYearWebRl21);
			cmd.addParameter("@P_YEAR_WEB_NR4", pYearWebNr41);
			cmd.addParameter("@P_VIEWING_DATE_T4", pViewingDateT4);
			cmd.addParameter("@P_VIEWING_DATE_T4A", pViewingDateT4a);
			cmd.addParameter("@P_VIEWING_DATE_T4", pViewingDateT41);
			cmd.addParameter("@P_VIEWING_DATE_T4A", pViewingDateT4a1);
			cmd.addParameter("@P_VIEWING_DATE_T4ANR", pViewingDateT4anr);
			cmd.addParameter("@P_VIEWING_DATE_T4ANR", pViewingDateT4anr1);
			cmd.addParameter("@P_VIEWING_DATE_NR4", pViewingDateNr4);
			cmd.addParameter("@P_VIEWING_DATE_NR4", pViewingDateNr41);
			cmd.addParameter("@P_VIEWING_DATE_RL1", pViewingDateRl1);
			cmd.addParameter("@P_VIEWING_DATE_RL1", pViewingDateRl11);
			cmd.addParameter("@P_VIEWING_DATE_RL2", pViewingDateRl2);
			cmd.addParameter("@P_SORT_ORGN_IND", pSortOrgnInd);
			cmd.addParameter("@P_VIEWING_DATE_RL2", pViewingDateRl21);
			cmd.addParameter("@P_SORT_ORGN_IND", pSortOrgnInd1);
				
			cmd.execute();


		}
		
	
	
	
}
