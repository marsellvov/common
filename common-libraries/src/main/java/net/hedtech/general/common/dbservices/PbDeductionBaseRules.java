package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PbDeductionBaseRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_DEDUCTION_BASE_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pPidm,NString pBdcaCode,NString pAddReplInd,NNumber pAddReplEmpl,NNumber pAddReplEmpr,NNumber pAddReplTaxBase,NString pArrStatus,NNumber pArrBalance,NNumber pBondBalance,NDate pBeginDate,NDate pEndDate,NNumber pArrRecoverMax,NString pAddReplPictCode,NString pUserId,NString pDataOrigin,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_DEDUCTION_BASE_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_ADD_REPL_IND", pAddReplInd);
			cmd.addParameter("@P_ADD_REPL_EMPL", pAddReplEmpl);
			cmd.addParameter("@P_ADD_REPL_EMPR", pAddReplEmpr);
			cmd.addParameter("@P_ADD_REPL_TAX_BASE", pAddReplTaxBase);
			cmd.addParameter("@P_ARR_STATUS", pArrStatus);
			cmd.addParameter("@P_ARR_BALANCE", pArrBalance);
			cmd.addParameter("@P_BOND_BALANCE", pBondBalance);
			cmd.addParameter("@P_BEGIN_DATE", pBeginDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_ARR_RECOVER_MAX", pArrRecoverMax);
			cmd.addParameter("@P_ADD_REPL_PICT_CODE", pAddReplPictCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pPidm,NString pBdcaCode,NString pAddReplInd,NNumber pAddReplEmpl,NNumber pAddReplEmpr,NNumber pAddReplTaxBase,NString pArrStatus,NNumber pArrBalance,NNumber pBondBalance,NDate pBeginDate,NDate pEndDate,NNumber pArrRecoverMax,NString pAddReplPictCode,NString pUserId,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_DEDUCTION_BASE_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_ADD_REPL_IND", pAddReplInd);
			cmd.addParameter("@P_ADD_REPL_EMPL", pAddReplEmpl);
			cmd.addParameter("@P_ADD_REPL_EMPR", pAddReplEmpr);
			cmd.addParameter("@P_ADD_REPL_TAX_BASE", pAddReplTaxBase);
			cmd.addParameter("@P_ARR_STATUS", pArrStatus);
			cmd.addParameter("@P_ARR_BALANCE", pArrBalance);
			cmd.addParameter("@P_BOND_BALANCE", pBondBalance);
			cmd.addParameter("@P_BEGIN_DATE", pBeginDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_ARR_RECOVER_MAX", pArrRecoverMax);
			cmd.addParameter("@P_ADD_REPL_PICT_CODE", pAddReplPictCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
	
	
	
}
