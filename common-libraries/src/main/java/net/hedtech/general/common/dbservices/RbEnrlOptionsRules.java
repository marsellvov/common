package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RbEnrlOptionsRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_ENRL_OPTIONS_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pAidyCode,NString pPeriod,NDate pCutOffDate,NString pPellAwrdEnrlOpt,NString pPellDisbEnrlOpt,NString pPellIsirTermInd,NDate pCutOffChgDate,NString pDisbActEnrollInd,NString pUserId,NString pDataOrigin,NString pTermCode,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_ENRL_OPTIONS_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_CUT_OFF_DATE", pCutOffDate);
			cmd.addParameter("@P_PELL_AWRD_ENRL_OPT", pPellAwrdEnrlOpt);
			cmd.addParameter("@P_PELL_DISB_ENRL_OPT", pPellDisbEnrlOpt);
			cmd.addParameter("@P_PELL_ISIR_TERM_IND", pPellIsirTermInd);
			cmd.addParameter("@P_CUT_OFF_CHG_DATE", pCutOffChgDate);
			cmd.addParameter("@P_DISB_ACT_ENROLL_IND", pDisbActEnrollInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pAidyCode,NString pPeriod,NDate pCutOffDate,NString pPellAwrdEnrlOpt,NString pPellDisbEnrlOpt,NString pPellIsirTermInd,NDate pCutOffChgDate,NString pDisbActEnrollInd,NString pUserId,NString pDataOrigin,NString pTermCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_ENRL_OPTIONS_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_CUT_OFF_DATE", pCutOffDate);
			cmd.addParameter("@P_PELL_AWRD_ENRL_OPT", pPellAwrdEnrlOpt);
			cmd.addParameter("@P_PELL_DISB_ENRL_OPT", pPellDisbEnrlOpt);
			cmd.addParameter("@P_PELL_ISIR_TERM_IND", pPellIsirTermInd);
			cmd.addParameter("@P_CUT_OFF_CHG_DATE", pCutOffChgDate);
			cmd.addParameter("@P_DISB_ACT_ENROLL_IND", pDisbActEnrollInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
				
			cmd.execute();


		}
		
	
	
	
}
