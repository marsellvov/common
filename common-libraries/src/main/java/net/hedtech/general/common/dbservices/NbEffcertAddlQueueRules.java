package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class NbEffcertAddlQueueRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_EFFCERT_ADDL_QUEUE_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pId,NString pCoasCode,NString pOrgnCode,NString pMemberUserId,NString pAltCertifierInd,NString pGradCertReqInd,NString pFtypInclExclType,NString pUserId,NString pPreReviewAction,NString pPostReviewAction,NString pDataOrigin,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_EFFCERT_ADDL_QUEUE_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_ORGN_CODE", pOrgnCode);
			cmd.addParameter("@P_MEMBER_USER_ID", pMemberUserId);
			cmd.addParameter("@P_ALT_CERTIFIER_IND", pAltCertifierInd);
			cmd.addParameter("@P_GRAD_CERT_REQ_IND", pGradCertReqInd);
			cmd.addParameter("@P_FTYP_INCL_EXCL_TYPE", pFtypInclExclType);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_PRE_REVIEW_ACTION", pPreReviewAction);
			cmd.addParameter("@P_POST_REVIEW_ACTION", pPostReviewAction);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pCoasCode,NString pOrgnCode,NString pMemberUserId,NString pAltCertifierInd,NString pGradCertReqInd,NString pFtypInclExclType,NString pUserId,NString pPreReviewAction,NString pPostReviewAction,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_EFFCERT_ADDL_QUEUE_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_ORGN_CODE", pOrgnCode);
			cmd.addParameter("@P_MEMBER_USER_ID", pMemberUserId);
			cmd.addParameter("@P_ALT_CERTIFIER_IND", pAltCertifierInd);
			cmd.addParameter("@P_GRAD_CERT_REQ_IND", pGradCertReqInd);
			cmd.addParameter("@P_FTYP_INCL_EXCL_TYPE", pFtypInclExclType);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_PRE_REVIEW_ACTION", pPreReviewAction);
			cmd.addParameter("@P_POST_REVIEW_ACTION", pPostReviewAction);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
	
	
	
}
