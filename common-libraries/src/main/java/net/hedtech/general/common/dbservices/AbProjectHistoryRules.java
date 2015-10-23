package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class AbProjectHistoryRules {
		public static NString fParentExists(NNumber pPidm,NString pPropCode,NNumber pPropSeqNo,NString pProjCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AB_PROJECT_HISTORY_RULES.F_PARENT_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PROP_CODE", pPropCode);
			cmd.addParameter("@P_PROP_SEQ_NO", pPropSeqNo);
			cmd.addParameter("@P_PROJ_CODE", pProjCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AB_PROJECT_HISTORY_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pPidm,NString pPropCode,NNumber pPropSeqNo,NString pProjCode,NNumber pSeqNo,NString pUserId,NString pDataOrigin,NString pGivhCodeChgInd,NString pGivhCode,NString pTargetAskAmtChgInd,NNumber pTargetAskAmount,NString pTargetAskDteChgInd,NDate pTargetAskDate,NString pPrstCodeChgInd,NString pPrstCode,NString pPrstDateChgInd,NDate pPrstDate,NString pProjFromDateChgInd,NDate pProjEffFromDate,NString pProjToDateChgInd,NDate pProjEffToDate,NString pProjTextChgInd,NString pProjText,NString pFrbpropCodeChgInd,NString pFrbpropCode,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AB_PROJECT_HISTORY_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PROP_CODE", pPropCode);
			cmd.addParameter("@P_PROP_SEQ_NO", pPropSeqNo);
			cmd.addParameter("@P_PROJ_CODE", pProjCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_GIVH_CODE_CHG_IND", pGivhCodeChgInd);
			cmd.addParameter("@P_GIVH_CODE", pGivhCode);
			cmd.addParameter("@P_TARGET_ASK_AMT_CHG_IND", pTargetAskAmtChgInd);
			cmd.addParameter("@P_TARGET_ASK_AMOUNT", pTargetAskAmount);
			cmd.addParameter("@P_TARGET_ASK_DTE_CHG_IND", pTargetAskDteChgInd);
			cmd.addParameter("@P_TARGET_ASK_DATE", pTargetAskDate);
			cmd.addParameter("@P_PRST_CODE_CHG_IND", pPrstCodeChgInd);
			cmd.addParameter("@P_PRST_CODE", pPrstCode);
			cmd.addParameter("@P_PRST_DATE_CHG_IND", pPrstDateChgInd);
			cmd.addParameter("@P_PRST_DATE", pPrstDate);
			cmd.addParameter("@P_PROJ_FROM_DATE_CHG_IND", pProjFromDateChgInd);
			cmd.addParameter("@P_PROJ_EFF_FROM_DATE", pProjEffFromDate);
			cmd.addParameter("@P_PROJ_TO_DATE_CHG_IND", pProjToDateChgInd);
			cmd.addParameter("@P_PROJ_EFF_TO_DATE", pProjEffToDate);
			cmd.addParameter("@P_PROJ_TEXT_CHG_IND", pProjTextChgInd);
			cmd.addParameter("@P_PROJ_TEXT", pProjText);
			cmd.addParameter("@P_FRBPROP_CODE_CHG_IND", pFrbpropCodeChgInd);
			cmd.addParameter("@P_FRBPROP_CODE", pFrbpropCode);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pPidm,NString pPropCode,NNumber pPropSeqNo,NString pProjCode,NNumber pSeqNo,NString pUserId,NString pDataOrigin,NString pGivhCodeChgInd,NString pGivhCode,NString pTargetAskAmtChgInd,NNumber pTargetAskAmount,NString pTargetAskDteChgInd,NDate pTargetAskDate,NString pPrstCodeChgInd,NString pPrstCode,NString pPrstDateChgInd,NDate pPrstDate,NString pProjFromDateChgInd,NDate pProjEffFromDate,NString pProjToDateChgInd,NDate pProjEffToDate,NString pProjTextChgInd,NString pProjText,NString pFrbpropCodeChgInd,NString pFrbpropCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AB_PROJECT_HISTORY_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PROP_CODE", pPropCode);
			cmd.addParameter("@P_PROP_SEQ_NO", pPropSeqNo);
			cmd.addParameter("@P_PROJ_CODE", pProjCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_GIVH_CODE_CHG_IND", pGivhCodeChgInd);
			cmd.addParameter("@P_GIVH_CODE", pGivhCode);
			cmd.addParameter("@P_TARGET_ASK_AMT_CHG_IND", pTargetAskAmtChgInd);
			cmd.addParameter("@P_TARGET_ASK_AMOUNT", pTargetAskAmount);
			cmd.addParameter("@P_TARGET_ASK_DTE_CHG_IND", pTargetAskDteChgInd);
			cmd.addParameter("@P_TARGET_ASK_DATE", pTargetAskDate);
			cmd.addParameter("@P_PRST_CODE_CHG_IND", pPrstCodeChgInd);
			cmd.addParameter("@P_PRST_CODE", pPrstCode);
			cmd.addParameter("@P_PRST_DATE_CHG_IND", pPrstDateChgInd);
			cmd.addParameter("@P_PRST_DATE", pPrstDate);
			cmd.addParameter("@P_PROJ_FROM_DATE_CHG_IND", pProjFromDateChgInd);
			cmd.addParameter("@P_PROJ_EFF_FROM_DATE", pProjEffFromDate);
			cmd.addParameter("@P_PROJ_TO_DATE_CHG_IND", pProjToDateChgInd);
			cmd.addParameter("@P_PROJ_EFF_TO_DATE", pProjEffToDate);
			cmd.addParameter("@P_PROJ_TEXT_CHG_IND", pProjTextChgInd);
			cmd.addParameter("@P_PROJ_TEXT", pProjText);
			cmd.addParameter("@P_FRBPROP_CODE_CHG_IND", pFrbpropCodeChgInd);
			cmd.addParameter("@P_FRBPROP_CODE", pFrbpropCode);
				
			cmd.execute();


		}
		
	
	
	
}
