package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbHighschoolRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_HIGHSCHOOL_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pPidm,NString pSbgiCode,NDate pGraduationDate,NString pGpa,NNumber pClassRank,NNumber pClassSize,NNumber pPercentile,NString pDplmCode,NString pCollPrepInd,NDate pTransRecvDate,NString pAdmrCode,NString pUserId,NString pDataOrigin,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_HIGHSCHOOL_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_GRADUATION_DATE", pGraduationDate);
			cmd.addParameter("@P_GPA", pGpa);
			cmd.addParameter("@P_CLASS_RANK", pClassRank);
			cmd.addParameter("@P_CLASS_SIZE", pClassSize);
			cmd.addParameter("@P_PERCENTILE", pPercentile);
			cmd.addParameter("@P_DPLM_CODE", pDplmCode);
			cmd.addParameter("@P_COLL_PREP_IND", pCollPrepInd);
			cmd.addParameter("@P_TRANS_RECV_DATE", pTransRecvDate);
			cmd.addParameter("@P_ADMR_CODE", pAdmrCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pPidm,NString pSbgiCode,NDate pGraduationDate,NString pGpa,NNumber pClassRank,NNumber pClassSize,NNumber pPercentile,NString pDplmCode,NString pCollPrepInd,NDate pTransRecvDate,NString pAdmrCode,NString pUserId,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_HIGHSCHOOL_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_GRADUATION_DATE", pGraduationDate);
			cmd.addParameter("@P_GPA", pGpa);
			cmd.addParameter("@P_CLASS_RANK", pClassRank);
			cmd.addParameter("@P_CLASS_SIZE", pClassSize);
			cmd.addParameter("@P_PERCENTILE", pPercentile);
			cmd.addParameter("@P_DPLM_CODE", pDplmCode);
			cmd.addParameter("@P_COLL_PREP_IND", pCollPrepInd);
			cmd.addParameter("@P_TRANS_RECV_DATE", pTransRecvDate);
			cmd.addParameter("@P_ADMR_CODE", pAdmrCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	
}
