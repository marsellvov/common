package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PvEmpTaxcrReturnaRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_EMP_TAXCR_RETURNA_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pPidm,NString pTgrpCode,NString pTxcdCode,NDate pEffectiveDate,NNumber pEstIncome,NNumber pTotalClaimAmount,NString pNrTaxableIncomeInd,NString pLessIncomeInd,NString pClaimTcaInd,NString pSignatureInd,NDate pSignatureDate,NString pDataSource,NString pUserId,NString pExemptRequestInd,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_EMP_TAXCR_RETURNA_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TGRP_CODE", pTgrpCode);
			cmd.addParameter("@P_TXCD_CODE", pTxcdCode);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_EST_INCOME", pEstIncome);
			cmd.addParameter("@P_TOTAL_CLAIM_AMOUNT", pTotalClaimAmount);
			cmd.addParameter("@P_NR_TAXABLE_INCOME_IND", pNrTaxableIncomeInd);
			cmd.addParameter("@P_LESS_INCOME_IND", pLessIncomeInd);
			cmd.addParameter("@P_CLAIM_TCA_IND", pClaimTcaInd);
			cmd.addParameter("@P_SIGNATURE_IND", pSignatureInd);
			cmd.addParameter("@P_SIGNATURE_DATE", pSignatureDate);
			cmd.addParameter("@P_DATA_SOURCE", pDataSource);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_EXEMPT_REQUEST_IND", pExemptRequestInd);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pPidm,NString pTgrpCode,NString pTxcdCode,NDate pEffectiveDate,NNumber pEstIncome,NNumber pTotalClaimAmount,NString pNrTaxableIncomeInd,NString pLessIncomeInd,NString pClaimTcaInd,NString pSignatureInd,NDate pSignatureDate,NString pDataSource,NString pUserId,NString pExemptRequestInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_EMP_TAXCR_RETURNA_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TGRP_CODE", pTgrpCode);
			cmd.addParameter("@P_TXCD_CODE", pTxcdCode);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_EST_INCOME", pEstIncome);
			cmd.addParameter("@P_TOTAL_CLAIM_AMOUNT", pTotalClaimAmount);
			cmd.addParameter("@P_NR_TAXABLE_INCOME_IND", pNrTaxableIncomeInd);
			cmd.addParameter("@P_LESS_INCOME_IND", pLessIncomeInd);
			cmd.addParameter("@P_CLAIM_TCA_IND", pClaimTcaInd);
			cmd.addParameter("@P_SIGNATURE_IND", pSignatureInd);
			cmd.addParameter("@P_SIGNATURE_DATE", pSignatureDate);
			cmd.addParameter("@P_DATA_SOURCE", pDataSource);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_EXEMPT_REQUEST_IND", pExemptRequestInd);
				
			cmd.execute();


		}
		
	
	
	
}
