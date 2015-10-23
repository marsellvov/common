package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GbPriorCollegeRules {
		public static NBool fAdmrCodeInUse(NNumber pPidm,NString pSbgiCode,NString pAdmrCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_PRIOR_COLLEGE_RULES.F_ADMR_CODE_IN_USE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_ADMR_CODE", pAdmrCode);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NString fCheckStvsbgiAdmr(NString pSbgiCode,NString pAdmrCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_PRIOR_COLLEGE_RULES.F_CHECK_STVSBGI_ADMR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_ADMR_CODE", pAdmrCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCheckStvsbgiType(NString pSbgiCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_PRIOR_COLLEGE_RULES.F_CHECK_STVSBGI_TYPE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pFinaidRecon(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_PRIOR_COLLEGE_RULES.P_FINAID_RECON", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_PRIOR_COLLEGE_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pPidm,NString pSbgiCode,NDate pTransRecvDate,NDate pTransRevDate,NString pOfficialTrans,NString pAdmrCode,NString pDataOrigin,NString pUserId,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_PRIOR_COLLEGE_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_TRANS_RECV_DATE", pTransRecvDate);
			cmd.addParameter("@P_TRANS_REV_DATE", pTransRevDate);
			cmd.addParameter("@P_OFFICIAL_TRANS", pOfficialTrans);
			cmd.addParameter("@P_ADMR_CODE", pAdmrCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pPidm,NString pSbgiCode,NDate pTransRecvDate,NDate pTransRevDate,NString pOfficialTrans,NString pAdmrCode,NString pDataOrigin,NString pUserId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_PRIOR_COLLEGE_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_TRANS_RECV_DATE", pTransRecvDate);
			cmd.addParameter("@P_TRANS_REV_DATE", pTransRevDate);
			cmd.addParameter("@P_OFFICIAL_TRANS", pOfficialTrans);
			cmd.addParameter("@P_ADMR_CODE", pAdmrCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
				
			cmd.execute();


		}
		
	
	
	
}
