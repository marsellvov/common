package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbWlTermControlRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_WL_TERM_CONTROL_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pTermCode,NString pAutoNotifyInd,NString pOnlineNotifyInd,NString pWlPosWebcDispInd,NString pStuNotifyInd,NString pFacNotifyInd,NString pAdvNotifyInd,NString pRegNotifyInd,NString pCampSeverity,NString pDegreeSeverity,NString pProgramSeverity,NString pDepartmentSeverity,NString pAttsSeverity,NString pChrtSeverity,NString pDuplIncludeInd,NString pLinkIncludeInd,NString pPreqIncludeInd,NString pCorqIncludeInd,NString pTimeIncludeInd,NString pCapcSeverity,NString pLevlSeverity,NString pCollSeverity,NString pMajrSeverity,NString pClasSeverity,NString pApprSeverity,NString pUserId,NNumber pDeadlineNotify,NString pLetrCodeStuNotify,NString pLetrCodeFacNotify,NString pLetrCodeAdvNotify,NString pLetrCodeRegNotify,NNumber pPidm,NString pDataOrigin,NString pHostName,NNumber pMaxResendHrs,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_WL_TERM_CONTROL_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_AUTO_NOTIFY_IND", pAutoNotifyInd);
			cmd.addParameter("@P_ONLINE_NOTIFY_IND", pOnlineNotifyInd);
			cmd.addParameter("@P_WL_POS_WEBC_DISP_IND", pWlPosWebcDispInd);
			cmd.addParameter("@P_STU_NOTIFY_IND", pStuNotifyInd);
			cmd.addParameter("@P_FAC_NOTIFY_IND", pFacNotifyInd);
			cmd.addParameter("@P_ADV_NOTIFY_IND", pAdvNotifyInd);
			cmd.addParameter("@P_REG_NOTIFY_IND", pRegNotifyInd);
			cmd.addParameter("@P_CAMP_SEVERITY", pCampSeverity);
			cmd.addParameter("@P_DEGREE_SEVERITY", pDegreeSeverity);
			cmd.addParameter("@P_PROGRAM_SEVERITY", pProgramSeverity);
			cmd.addParameter("@P_DEPARTMENT_SEVERITY", pDepartmentSeverity);
			cmd.addParameter("@P_ATTS_SEVERITY", pAttsSeverity);
			cmd.addParameter("@P_CHRT_SEVERITY", pChrtSeverity);
			cmd.addParameter("@P_DUPL_INCLUDE_IND", pDuplIncludeInd);
			cmd.addParameter("@P_LINK_INCLUDE_IND", pLinkIncludeInd);
			cmd.addParameter("@P_PREQ_INCLUDE_IND", pPreqIncludeInd);
			cmd.addParameter("@P_CORQ_INCLUDE_IND", pCorqIncludeInd);
			cmd.addParameter("@P_TIME_INCLUDE_IND", pTimeIncludeInd);
			cmd.addParameter("@P_CAPC_SEVERITY", pCapcSeverity);
			cmd.addParameter("@P_LEVL_SEVERITY", pLevlSeverity);
			cmd.addParameter("@P_COLL_SEVERITY", pCollSeverity);
			cmd.addParameter("@P_MAJR_SEVERITY", pMajrSeverity);
			cmd.addParameter("@P_CLAS_SEVERITY", pClasSeverity);
			cmd.addParameter("@P_APPR_SEVERITY", pApprSeverity);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DEADLINE_NOTIFY", pDeadlineNotify);
			cmd.addParameter("@P_LETR_CODE_STU_NOTIFY", pLetrCodeStuNotify);
			cmd.addParameter("@P_LETR_CODE_FAC_NOTIFY", pLetrCodeFacNotify);
			cmd.addParameter("@P_LETR_CODE_ADV_NOTIFY", pLetrCodeAdvNotify);
			cmd.addParameter("@P_LETR_CODE_REG_NOTIFY", pLetrCodeRegNotify);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_HOST_NAME", pHostName);
			cmd.addParameter("@P_MAX_RESEND_HRS", pMaxResendHrs);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pTermCode,NString pAutoNotifyInd,NString pOnlineNotifyInd,NString pWlPosWebcDispInd,NString pStuNotifyInd,NString pFacNotifyInd,NString pAdvNotifyInd,NString pRegNotifyInd,NString pCampSeverity,NString pDegreeSeverity,NString pProgramSeverity,NString pDepartmentSeverity,NString pAttsSeverity,NString pChrtSeverity,NString pDuplIncludeInd,NString pLinkIncludeInd,NString pPreqIncludeInd,NString pCorqIncludeInd,NString pTimeIncludeInd,NString pCapcSeverity,NString pLevlSeverity,NString pCollSeverity,NString pMajrSeverity,NString pClasSeverity,NString pApprSeverity,NString pUserId,NNumber pDeadlineNotify,NString pLetrCodeStuNotify,NString pLetrCodeFacNotify,NString pLetrCodeAdvNotify,NString pLetrCodeRegNotify,NNumber pPidm,NString pDataOrigin,NString pHostName,NNumber pMaxResendHrs) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_WL_TERM_CONTROL_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_AUTO_NOTIFY_IND", pAutoNotifyInd);
			cmd.addParameter("@P_ONLINE_NOTIFY_IND", pOnlineNotifyInd);
			cmd.addParameter("@P_WL_POS_WEBC_DISP_IND", pWlPosWebcDispInd);
			cmd.addParameter("@P_STU_NOTIFY_IND", pStuNotifyInd);
			cmd.addParameter("@P_FAC_NOTIFY_IND", pFacNotifyInd);
			cmd.addParameter("@P_ADV_NOTIFY_IND", pAdvNotifyInd);
			cmd.addParameter("@P_REG_NOTIFY_IND", pRegNotifyInd);
			cmd.addParameter("@P_CAMP_SEVERITY", pCampSeverity);
			cmd.addParameter("@P_DEGREE_SEVERITY", pDegreeSeverity);
			cmd.addParameter("@P_PROGRAM_SEVERITY", pProgramSeverity);
			cmd.addParameter("@P_DEPARTMENT_SEVERITY", pDepartmentSeverity);
			cmd.addParameter("@P_ATTS_SEVERITY", pAttsSeverity);
			cmd.addParameter("@P_CHRT_SEVERITY", pChrtSeverity);
			cmd.addParameter("@P_DUPL_INCLUDE_IND", pDuplIncludeInd);
			cmd.addParameter("@P_LINK_INCLUDE_IND", pLinkIncludeInd);
			cmd.addParameter("@P_PREQ_INCLUDE_IND", pPreqIncludeInd);
			cmd.addParameter("@P_CORQ_INCLUDE_IND", pCorqIncludeInd);
			cmd.addParameter("@P_TIME_INCLUDE_IND", pTimeIncludeInd);
			cmd.addParameter("@P_CAPC_SEVERITY", pCapcSeverity);
			cmd.addParameter("@P_LEVL_SEVERITY", pLevlSeverity);
			cmd.addParameter("@P_COLL_SEVERITY", pCollSeverity);
			cmd.addParameter("@P_MAJR_SEVERITY", pMajrSeverity);
			cmd.addParameter("@P_CLAS_SEVERITY", pClasSeverity);
			cmd.addParameter("@P_APPR_SEVERITY", pApprSeverity);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DEADLINE_NOTIFY", pDeadlineNotify);
			cmd.addParameter("@P_LETR_CODE_STU_NOTIFY", pLetrCodeStuNotify);
			cmd.addParameter("@P_LETR_CODE_FAC_NOTIFY", pLetrCodeFacNotify);
			cmd.addParameter("@P_LETR_CODE_ADV_NOTIFY", pLetrCodeAdvNotify);
			cmd.addParameter("@P_LETR_CODE_REG_NOTIFY", pLetrCodeRegNotify);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_HOST_NAME", pHostName);
			cmd.addParameter("@P_MAX_RESEND_HRS", pMaxResendHrs);
				
			cmd.execute();


		}
		
	
	
	
}
