package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PbEmpPaystubRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EMP_PAYSTUB_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pCode,NString pDispIdInd,NString pDispSsnInd,NString pDispNameInd,NString pDispAddressInd,NString pDispPayIdNumInd,NString pDispPayDatesInd,NString pDispCheckDdInfoInd,NString pDispYtdAmtsInd,NString pDispPosnSuffInd,NString pDispJobTitleInd,NString pDispEmprAmtInd,NString pDispFedLocalWhInd,NString pDispPaysumEmprInd,NString pDispEmprNameInd,NString pDispEmprAddrInd,NString pDispEmprPhoneInd,NString pEmprInfoLocation,NString pUserId,NString pDataOrigin,NString pIdLabel,NString pSsnLabel,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EMP_PAYSTUB_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_DISP_ID_IND", pDispIdInd);
			cmd.addParameter("@P_DISP_SSN_IND", pDispSsnInd);
			cmd.addParameter("@P_DISP_NAME_IND", pDispNameInd);
			cmd.addParameter("@P_DISP_ADDRESS_IND", pDispAddressInd);
			cmd.addParameter("@P_DISP_PAY_ID_NUM_IND", pDispPayIdNumInd);
			cmd.addParameter("@P_DISP_PAY_DATES_IND", pDispPayDatesInd);
			cmd.addParameter("@P_DISP_CHECK_DD_INFO_IND", pDispCheckDdInfoInd);
			cmd.addParameter("@P_DISP_YTD_AMTS_IND", pDispYtdAmtsInd);
			cmd.addParameter("@P_DISP_POSN_SUFF_IND", pDispPosnSuffInd);
			cmd.addParameter("@P_DISP_JOB_TITLE_IND", pDispJobTitleInd);
			cmd.addParameter("@P_DISP_EMPR_AMT_IND", pDispEmprAmtInd);
			cmd.addParameter("@P_DISP_FED_LOCAL_WH_IND", pDispFedLocalWhInd);
			cmd.addParameter("@P_DISP_PAYSUM_EMPR_IND", pDispPaysumEmprInd);
			cmd.addParameter("@P_DISP_EMPR_NAME_IND", pDispEmprNameInd);
			cmd.addParameter("@P_DISP_EMPR_ADDR_IND", pDispEmprAddrInd);
			cmd.addParameter("@P_DISP_EMPR_PHONE_IND", pDispEmprPhoneInd);
			cmd.addParameter("@P_EMPR_INFO_LOCATION", pEmprInfoLocation);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ID_LABEL", pIdLabel);
			cmd.addParameter("@P_SSN_LABEL", pSsnLabel);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pCode,NString pDispIdInd,NString pDispSsnInd,NString pDispNameInd,NString pDispAddressInd,NString pDispPayIdNumInd,NString pDispPayDatesInd,NString pDispCheckDdInfoInd,NString pDispYtdAmtsInd,NString pDispPosnSuffInd,NString pDispJobTitleInd,NString pDispEmprAmtInd,NString pDispFedLocalWhInd,NString pDispPaysumEmprInd,NString pDispEmprNameInd,NString pDispEmprAddrInd,NString pDispEmprPhoneInd,NString pEmprInfoLocation,NString pUserId,NString pDataOrigin,NString pIdLabel,NString pSsnLabel) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EMP_PAYSTUB_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_DISP_ID_IND", pDispIdInd);
			cmd.addParameter("@P_DISP_SSN_IND", pDispSsnInd);
			cmd.addParameter("@P_DISP_NAME_IND", pDispNameInd);
			cmd.addParameter("@P_DISP_ADDRESS_IND", pDispAddressInd);
			cmd.addParameter("@P_DISP_PAY_ID_NUM_IND", pDispPayIdNumInd);
			cmd.addParameter("@P_DISP_PAY_DATES_IND", pDispPayDatesInd);
			cmd.addParameter("@P_DISP_CHECK_DD_INFO_IND", pDispCheckDdInfoInd);
			cmd.addParameter("@P_DISP_YTD_AMTS_IND", pDispYtdAmtsInd);
			cmd.addParameter("@P_DISP_POSN_SUFF_IND", pDispPosnSuffInd);
			cmd.addParameter("@P_DISP_JOB_TITLE_IND", pDispJobTitleInd);
			cmd.addParameter("@P_DISP_EMPR_AMT_IND", pDispEmprAmtInd);
			cmd.addParameter("@P_DISP_FED_LOCAL_WH_IND", pDispFedLocalWhInd);
			cmd.addParameter("@P_DISP_PAYSUM_EMPR_IND", pDispPaysumEmprInd);
			cmd.addParameter("@P_DISP_EMPR_NAME_IND", pDispEmprNameInd);
			cmd.addParameter("@P_DISP_EMPR_ADDR_IND", pDispEmprAddrInd);
			cmd.addParameter("@P_DISP_EMPR_PHONE_IND", pDispEmprPhoneInd);
			cmd.addParameter("@P_EMPR_INFO_LOCATION", pEmprInfoLocation);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ID_LABEL", pIdLabel);
			cmd.addParameter("@P_SSN_LABEL", pSsnLabel);
				
			cmd.execute();


		}
		
	
	
	
}
