package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PxMassRoeRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PX_MASS_ROE_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pPidm,NString pPictCode,NString pEmprCode,NString pLanguageInd,NString pRoecCode,NDate pFirstDayWorked,NDate pLastDayWorked,NString pUserId,NString pRecallInd,NDate pRecallDate,NString pDataOrigin,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PX_MASS_ROE_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
			cmd.addParameter("@P_LANGUAGE_IND", pLanguageInd);
			cmd.addParameter("@P_ROEC_CODE", pRoecCode);
			cmd.addParameter("@P_FIRST_DAY_WORKED", pFirstDayWorked);
			cmd.addParameter("@P_LAST_DAY_WORKED", pLastDayWorked);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_RECALL_IND", pRecallInd);
			cmd.addParameter("@P_RECALL_DATE", pRecallDate);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pPidm,NString pPictCode,NString pEmprCode,NString pLanguageInd,NString pRoecCode,NDate pFirstDayWorked,NDate pLastDayWorked,NString pUserId,NString pRecallInd,NDate pRecallDate,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PX_MASS_ROE_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
			cmd.addParameter("@P_LANGUAGE_IND", pLanguageInd);
			cmd.addParameter("@P_ROEC_CODE", pRoecCode);
			cmd.addParameter("@P_FIRST_DAY_WORKED", pFirstDayWorked);
			cmd.addParameter("@P_LAST_DAY_WORKED", pLastDayWorked);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_RECALL_IND", pRecallInd);
			cmd.addParameter("@P_RECALL_DATE", pRecallDate);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
	
	
	
}
