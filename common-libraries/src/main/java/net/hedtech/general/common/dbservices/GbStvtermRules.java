package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GbStvtermRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_STVTERM_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pCode,NString pDesc,NDate pStartDate,NDate pEndDate,NString pFaProcYr,NString pFaTerm,NNumber pFaPeriod,NNumber pFaEndPeriod,NString pAcyrCode,NDate pHousingStartDate,NDate pHousingEndDate,NString pSystemReqInd,NString pTrmtCode,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_STVTERM_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_DESC", pDesc);
			cmd.addParameter("@P_START_DATE", pStartDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_FA_PROC_YR", pFaProcYr);
			cmd.addParameter("@P_FA_TERM", pFaTerm);
			cmd.addParameter("@P_FA_PERIOD", pFaPeriod);
			cmd.addParameter("@P_FA_END_PERIOD", pFaEndPeriod);
			cmd.addParameter("@P_ACYR_CODE", pAcyrCode);
			cmd.addParameter("@P_HOUSING_START_DATE", pHousingStartDate);
			cmd.addParameter("@P_HOUSING_END_DATE", pHousingEndDate);
			cmd.addParameter("@P_SYSTEM_REQ_IND", pSystemReqInd);
			cmd.addParameter("@P_TRMT_CODE", pTrmtCode);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pCode,NString pDesc,NDate pStartDate,NDate pEndDate,NString pFaProcYr,NString pFaTerm,NNumber pFaPeriod,NNumber pFaEndPeriod,NString pAcyrCode,NDate pHousingStartDate,NDate pHousingEndDate,NString pSystemReqInd,NString pTrmtCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_STVTERM_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_DESC", pDesc);
			cmd.addParameter("@P_START_DATE", pStartDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_FA_PROC_YR", pFaProcYr);
			cmd.addParameter("@P_FA_TERM", pFaTerm);
			cmd.addParameter("@P_FA_PERIOD", pFaPeriod);
			cmd.addParameter("@P_FA_END_PERIOD", pFaEndPeriod);
			cmd.addParameter("@P_ACYR_CODE", pAcyrCode);
			cmd.addParameter("@P_HOUSING_START_DATE", pHousingStartDate);
			cmd.addParameter("@P_HOUSING_END_DATE", pHousingEndDate);
			cmd.addParameter("@P_SYSTEM_REQ_IND", pSystemReqInd);
			cmd.addParameter("@P_TRMT_CODE", pTrmtCode);
				
			cmd.execute();


		}
		
	
	
	
}
