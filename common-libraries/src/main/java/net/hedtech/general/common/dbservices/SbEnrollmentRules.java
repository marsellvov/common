package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbEnrollmentRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ENROLLMENT_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pTermCode,NNumber pPidm,NString pEstsCode,NDate pEstsDate,NNumber pMinHrs,NNumber pMhrsOver,NString pMinhSrceCde,NString pMaxhSrceCde,NString pArInd,NDate pAssessmentDate,NDate pAddDate,NString pRgreCode,NString pTmstCode,NDate pTmstDate,NString pTmstMaintInd,NString pUser,NDate pRefundDate,NString pDataOrigin,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ENROLLMENT_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ESTS_CODE", pEstsCode);
			cmd.addParameter("@P_ESTS_DATE", pEstsDate);
			cmd.addParameter("@P_MIN_HRS", pMinHrs);
			cmd.addParameter("@P_MHRS_OVER", pMhrsOver);
			cmd.addParameter("@P_MINH_SRCE_CDE", pMinhSrceCde);
			cmd.addParameter("@P_MAXH_SRCE_CDE", pMaxhSrceCde);
			cmd.addParameter("@P_AR_IND", pArInd);
			cmd.addParameter("@P_ASSESSMENT_DATE", pAssessmentDate);
			cmd.addParameter("@P_ADD_DATE", pAddDate);
			cmd.addParameter("@P_RGRE_CODE", pRgreCode);
			cmd.addParameter("@P_TMST_CODE", pTmstCode);
			cmd.addParameter("@P_TMST_DATE", pTmstDate);
			cmd.addParameter("@P_TMST_MAINT_IND", pTmstMaintInd);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_REFUND_DATE", pRefundDate);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pTermCode,NNumber pPidm,NString pEstsCode,NDate pEstsDate,NNumber pMinHrs,NNumber pMhrsOver,NString pMinhSrceCde,NString pMaxhSrceCde,NString pArInd,NDate pAssessmentDate,NDate pAddDate,NString pRgreCode,NString pTmstCode,NDate pTmstDate,NString pTmstMaintInd,NString pUser,NDate pRefundDate,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ENROLLMENT_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ESTS_CODE", pEstsCode);
			cmd.addParameter("@P_ESTS_DATE", pEstsDate);
			cmd.addParameter("@P_MIN_HRS", pMinHrs);
			cmd.addParameter("@P_MHRS_OVER", pMhrsOver);
			cmd.addParameter("@P_MINH_SRCE_CDE", pMinhSrceCde);
			cmd.addParameter("@P_MAXH_SRCE_CDE", pMaxhSrceCde);
			cmd.addParameter("@P_AR_IND", pArInd);
			cmd.addParameter("@P_ASSESSMENT_DATE", pAssessmentDate);
			cmd.addParameter("@P_ADD_DATE", pAddDate);
			cmd.addParameter("@P_RGRE_CODE", pRgreCode);
			cmd.addParameter("@P_TMST_CODE", pTmstCode);
			cmd.addParameter("@P_TMST_DATE", pTmstDate);
			cmd.addParameter("@P_TMST_MAINT_IND", pTmstMaintInd);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_REFUND_DATE", pRefundDate);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
	
	
	
}
