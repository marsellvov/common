package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbWlSectionCtrlRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_WL_SECTION_CTRL_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pTermCode,NString pCrn,NString pAutoNotifyInd,NString pWlRegCheckInd,NString pWlPosWebcDispInd,NString pUserId,NNumber pDeadlineNotify,NString pDataOrigin,NNumber pMaxResendHrs,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_WL_SECTION_CTRL_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_AUTO_NOTIFY_IND", pAutoNotifyInd);
			cmd.addParameter("@P_WL_REG_CHECK_IND", pWlRegCheckInd);
			cmd.addParameter("@P_WL_POS_WEBC_DISP_IND", pWlPosWebcDispInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DEADLINE_NOTIFY", pDeadlineNotify);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_MAX_RESEND_HRS", pMaxResendHrs);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pTermCode,NString pCrn,NString pAutoNotifyInd,NString pWlRegCheckInd,NString pWlPosWebcDispInd,NString pUserId,NNumber pDeadlineNotify,NString pDataOrigin,NNumber pMaxResendHrs) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_WL_SECTION_CTRL_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_AUTO_NOTIFY_IND", pAutoNotifyInd);
			cmd.addParameter("@P_WL_REG_CHECK_IND", pWlRegCheckInd);
			cmd.addParameter("@P_WL_POS_WEBC_DISP_IND", pWlPosWebcDispInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DEADLINE_NOTIFY", pDeadlineNotify);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_MAX_RESEND_HRS", pMaxResendHrs);
				
			cmd.execute();


		}
		
	
	
	
}
