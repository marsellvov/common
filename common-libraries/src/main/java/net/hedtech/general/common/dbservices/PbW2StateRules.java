package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PbW2StateRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_W2_STATE_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pYear,NNumber pQuarter,NString pEmprCode,NNumber pPidm,NNumber pSeqNo,NString pStatCode,NString pUserId,NString pDataOrigin,NString pTaxEntityCode,NNumber pQtrUiTotalWages,NNumber pQtrUiTaxableWages,NDate pDateFirstEmployed,NDate pDateOfSeparation,NNumber pStateTaxableWages,NNumber pStateIncomeTax,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_W2_STATE_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_QUARTER", pQuarter);
			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_STAT_CODE", pStatCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_TAX_ENTITY_CODE", pTaxEntityCode);
			cmd.addParameter("@P_QTR_UI_TOTAL_WAGES", pQtrUiTotalWages);
			cmd.addParameter("@P_QTR_UI_TAXABLE_WAGES", pQtrUiTaxableWages);
			cmd.addParameter("@P_DATE_FIRST_EMPLOYED", pDateFirstEmployed);
			cmd.addParameter("@P_DATE_OF_SEPARATION", pDateOfSeparation);
			cmd.addParameter("@P_STATE_TAXABLE_WAGES", pStateTaxableWages);
			cmd.addParameter("@P_STATE_INCOME_TAX", pStateIncomeTax);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pOperationType,NNumber pYear,NNumber pQuarter,NString pEmprCode,NNumber pPidm,NNumber pSeqNo,NString pStatCode,NString pUserId,NString pDataOrigin,NString pTaxEntityCode,NNumber pQtrUiTotalWages,NNumber pQtrUiTaxableWages,NDate pDateFirstEmployed,NDate pDateOfSeparation,NNumber pStateTaxableWages,NNumber pStateIncomeTax) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_W2_STATE_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_QUARTER", pQuarter);
			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_STAT_CODE", pStatCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_TAX_ENTITY_CODE", pTaxEntityCode);
			cmd.addParameter("@P_QTR_UI_TOTAL_WAGES", pQtrUiTotalWages);
			cmd.addParameter("@P_QTR_UI_TAXABLE_WAGES", pQtrUiTaxableWages);
			cmd.addParameter("@P_DATE_FIRST_EMPLOYED", pDateFirstEmployed);
			cmd.addParameter("@P_DATE_OF_SEPARATION", pDateOfSeparation);
			cmd.addParameter("@P_STATE_TAXABLE_WAGES", pStateTaxableWages);
			cmd.addParameter("@P_STATE_INCOME_TAX", pStateIncomeTax);
				
			cmd.execute();


		}
		
	
	
	
}
