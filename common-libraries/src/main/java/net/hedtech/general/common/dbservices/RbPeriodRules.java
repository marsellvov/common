package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RbPeriodRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_PERIOD_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pPeriod,NString pDesc,NDate pStartDate,NDate pEndDate,NString pAidyCode,NNumber pSeqNo,NString pAcadYear,NString pCrossoverInd,NString pActiveInd,NString pAidyCodeCross,NString pComment,NString pUserId,NString pDataOrigin,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_PERIOD_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_DESC", pDesc);
			cmd.addParameter("@P_START_DATE", pStartDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ACAD_YEAR", pAcadYear);
			cmd.addParameter("@P_CROSSOVER_IND", pCrossoverInd);
			cmd.addParameter("@P_ACTIVE_IND", pActiveInd);
			cmd.addParameter("@P_AIDY_CODE_CROSS", pAidyCodeCross);
			cmd.addParameter("@P_COMMENT", pComment);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pPeriod,NString pDesc,NDate pStartDate,NDate pEndDate,NString pAidyCode,NNumber pSeqNo,NString pAcadYear,NString pCrossoverInd,NString pActiveInd,NString pAidyCodeCross,NString pComment,NString pUserId,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_PERIOD_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_DESC", pDesc);
			cmd.addParameter("@P_START_DATE", pStartDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ACAD_YEAR", pAcadYear);
			cmd.addParameter("@P_CROSSOVER_IND", pCrossoverInd);
			cmd.addParameter("@P_ACTIVE_IND", pActiveInd);
			cmd.addParameter("@P_AIDY_CODE_CROSS", pAidyCodeCross);
			cmd.addParameter("@P_COMMENT", pComment);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
	
	
	
}
