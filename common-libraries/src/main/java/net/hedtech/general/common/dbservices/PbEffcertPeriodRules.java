package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PbEffcertPeriodRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EFFCERT_PERIOD_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pId,NString pCoasCode,NString pEcpdCode,NDate pCertBeginDate,NDate pCertEndDate,NString pWebAccessInd,NDate pWebAccessEndDate,NString pUserId,NDate pReviewBeginDate,NDate pPostReviewEndDate,NString pDataOrigin,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EFFCERT_PERIOD_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_ECPD_CODE", pEcpdCode);
			cmd.addParameter("@P_CERT_BEGIN_DATE", pCertBeginDate);
			cmd.addParameter("@P_CERT_END_DATE", pCertEndDate);
			cmd.addParameter("@P_WEB_ACCESS_IND", pWebAccessInd);
			cmd.addParameter("@P_WEB_ACCESS_END_DATE", pWebAccessEndDate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_REVIEW_BEGIN_DATE", pReviewBeginDate);
			cmd.addParameter("@P_POST_REVIEW_END_DATE", pPostReviewEndDate);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pOperationType,NString pCoasCode,NString pEcpdCode,NDate pCertBeginDate,NDate pCertEndDate,NString pWebAccessInd,NDate pWebAccessEndDate,NString pUserId,NDate pReviewBeginDate,NDate pPostReviewEndDate,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EFFCERT_PERIOD_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_ECPD_CODE", pEcpdCode);
			cmd.addParameter("@P_CERT_BEGIN_DATE", pCertBeginDate);
			cmd.addParameter("@P_CERT_END_DATE", pCertEndDate);
			cmd.addParameter("@P_WEB_ACCESS_IND", pWebAccessInd);
			cmd.addParameter("@P_WEB_ACCESS_END_DATE", pWebAccessEndDate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_REVIEW_BEGIN_DATE", pReviewBeginDate);
			cmd.addParameter("@P_POST_REVIEW_END_DATE", pPostReviewEndDate);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
	
	
	
}
