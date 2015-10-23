package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PbCertificationRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_CERTIFICATION_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pPidm,NString pCertCode,NDate pCertDate,NDate pNextCertDate,NDate pExpireDate,NString pCertNo,NString pLcsvCode,NString pStatCode,NString pNatnCode,NString pComments,NString pUserId,NString pDataOrigin,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_CERTIFICATION_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CERT_CODE", pCertCode);
			cmd.addParameter("@P_CERT_DATE", pCertDate);
			cmd.addParameter("@P_NEXT_CERT_DATE", pNextCertDate);
			cmd.addParameter("@P_EXPIRE_DATE", pExpireDate);
			cmd.addParameter("@P_CERT_NO", pCertNo);
			cmd.addParameter("@P_LCSV_CODE", pLcsvCode);
			cmd.addParameter("@P_STAT_CODE", pStatCode);
			cmd.addParameter("@P_NATN_CODE", pNatnCode);
			cmd.addParameter("@P_COMMENTS", pComments);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pPidm,NString pCertCode,NDate pCertDate,NDate pNextCertDate,NDate pExpireDate,NString pCertNo,NString pLcsvCode,NString pStatCode,NString pNatnCode,NString pComments,NString pUserId,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_CERTIFICATION_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CERT_CODE", pCertCode);
			cmd.addParameter("@P_CERT_DATE", pCertDate);
			cmd.addParameter("@P_NEXT_CERT_DATE", pNextCertDate);
			cmd.addParameter("@P_EXPIRE_DATE", pExpireDate);
			cmd.addParameter("@P_CERT_NO", pCertNo);
			cmd.addParameter("@P_LCSV_CODE", pLcsvCode);
			cmd.addParameter("@P_STAT_CODE", pStatCode);
			cmd.addParameter("@P_NATN_CODE", pNatnCode);
			cmd.addParameter("@P_COMMENTS", pComments);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
	
	
	
}
