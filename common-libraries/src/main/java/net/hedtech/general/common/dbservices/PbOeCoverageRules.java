package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PbOeCoverageRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_OE_COVERAGE_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pPidm,NString pBdcaCode,NNumber pBeneSeqNo,NDate pBeginDate,NString pOtherCovInd,NString pPreExistingInd,NString pOpenEnrollInd,NString pUserId,NString pDataOrigin,NDate pEndDate,NString pDreaCode,NDate pRequestedDate,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_OE_COVERAGE_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_BENE_SEQ_NO", pBeneSeqNo);
			cmd.addParameter("@P_BEGIN_DATE", pBeginDate);
			cmd.addParameter("@P_OTHER_COV_IND", pOtherCovInd);
			cmd.addParameter("@P_PRE_EXISTING_IND", pPreExistingInd);
			cmd.addParameter("@P_OPEN_ENROLL_IND", pOpenEnrollInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_DREA_CODE", pDreaCode);
			cmd.addParameter("@P_REQUESTED_DATE", pRequestedDate);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pPidm,NString pBdcaCode,NNumber pBeneSeqNo,NDate pBeginDate,NString pOtherCovInd,NString pPreExistingInd,NString pOpenEnrollInd,NString pUserId,NString pDataOrigin,NDate pEndDate,NString pDreaCode,NDate pRequestedDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_OE_COVERAGE_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_BENE_SEQ_NO", pBeneSeqNo);
			cmd.addParameter("@P_BEGIN_DATE", pBeginDate);
			cmd.addParameter("@P_OTHER_COV_IND", pOtherCovInd);
			cmd.addParameter("@P_PRE_EXISTING_IND", pPreExistingInd);
			cmd.addParameter("@P_OPEN_ENROLL_IND", pOpenEnrollInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_DREA_CODE", pDreaCode);
			cmd.addParameter("@P_REQUESTED_DATE", pRequestedDate);
				
			cmd.execute();


		}
		
	
	
	
}
