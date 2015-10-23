package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GbMedicalRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_MEDICAL_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pPidm,NString pMediCode,NString pMdeqCode,NString pComment,NString pDisaCode,NString pSpsrCode,NNumber pOnsetAge,NString pDisbInd,NString pUserId,NDate pMediCodeDate,NString pDataOrigin,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_MEDICAL_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_MEDI_CODE", pMediCode);
			cmd.addParameter("@P_MDEQ_CODE", pMdeqCode);
			cmd.addParameter("@P_COMMENT", pComment);
			cmd.addParameter("@P_DISA_CODE", pDisaCode);
			cmd.addParameter("@P_SPSR_CODE", pSpsrCode);
			cmd.addParameter("@P_ONSET_AGE", pOnsetAge);
			cmd.addParameter("@P_DISB_IND", pDisbInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_MEDI_CODE_DATE", pMediCodeDate);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pPidm,NString pMediCode,NString pMdeqCode,NString pComment,NString pDisaCode,NString pSpsrCode,NNumber pOnsetAge,NString pDisbInd,NString pUserId,NDate pMediCodeDate,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_MEDICAL_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_MEDI_CODE", pMediCode);
			cmd.addParameter("@P_MDEQ_CODE", pMdeqCode);
			cmd.addParameter("@P_COMMENT", pComment);
			cmd.addParameter("@P_DISA_CODE", pDisaCode);
			cmd.addParameter("@P_SPSR_CODE", pSpsrCode);
			cmd.addParameter("@P_ONSET_AGE", pOnsetAge);
			cmd.addParameter("@P_DISB_IND", pDisbInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_MEDI_CODE_DATE", pMediCodeDate);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	
}
