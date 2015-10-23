package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class TbContractAuthRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_CONTRACT_AUTH_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pStuPidm,NNumber pContractPriority,NNumber pContractPidm,NNumber pContractNumber,NString pTermCode,NString pDelInd,NString pAuthNumber,NString pAuthInd,NString pStudentContRollInd,NString pTermCodeExpiration,NString pSponsorRefNumber,NString pUserId,NNumber pMaxStudentAmount,NString pDataOrigin,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_CONTRACT_AUTH_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_STU_PIDM", pStuPidm);
			cmd.addParameter("@P_CONTRACT_PRIORITY", pContractPriority);
			cmd.addParameter("@P_CONTRACT_PIDM", pContractPidm);
			cmd.addParameter("@P_CONTRACT_NUMBER", pContractNumber);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_DEL_IND", pDelInd);
			cmd.addParameter("@P_AUTH_NUMBER", pAuthNumber);
			cmd.addParameter("@P_AUTH_IND", pAuthInd);
			cmd.addParameter("@P_STUDENT_CONT_ROLL_IND", pStudentContRollInd);
			cmd.addParameter("@P_TERM_CODE_EXPIRATION", pTermCodeExpiration);
			cmd.addParameter("@P_SPONSOR_REF_NUMBER", pSponsorRefNumber);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_MAX_STUDENT_AMOUNT", pMaxStudentAmount);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pStuPidm,NNumber pContractPriority,NNumber pContractPidm,NNumber pContractNumber,NString pTermCode,NString pDelInd,NString pAuthNumber,NString pAuthInd,NString pStudentContRollInd,NString pTermCodeExpiration,NString pSponsorRefNumber,NString pUserId,NNumber pMaxStudentAmount,NString pDataOrigin,TbContractAuth.ContractAuthRecRow pExistingRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_CONTRACT_AUTH_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_STU_PIDM", pStuPidm);
			cmd.addParameter("@P_CONTRACT_PRIORITY", pContractPriority);
			cmd.addParameter("@P_CONTRACT_PIDM", pContractPidm);
			cmd.addParameter("@P_CONTRACT_NUMBER", pContractNumber);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_DEL_IND", pDelInd);
			cmd.addParameter("@P_AUTH_NUMBER", pAuthNumber);
			cmd.addParameter("@P_AUTH_IND", pAuthInd);
			cmd.addParameter("@P_STUDENT_CONT_ROLL_IND", pStudentContRollInd);
			cmd.addParameter("@P_TERM_CODE_EXPIRATION", pTermCodeExpiration);
			cmd.addParameter("@P_SPONSOR_REF_NUMBER", pSponsorRefNumber);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_MAX_STUDENT_AMOUNT", pMaxStudentAmount);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter(DbTypes.createStructType("P_EXISTING_REC", pExistingRec, TbContractAuth.ContractAuthRecRow.class ));
				
			cmd.execute();


		}
		
	
	
	
}
