package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbCrseMutualExclusionRules {
		public static NString fParentExists(NString pSubjCode,NString pCrseNumb) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_CRSE_MUTUAL_EXCLUSION_RULES.F_PARENT_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SUBJ_CODE", pSubjCode);
			cmd.addParameter("@P_CRSE_NUMB", pCrseNumb);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_CRSE_MUTUAL_EXCLUSION_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pPrimaryKey,NString pSubjCode,NString pCrseNumb,NString pEffTerm,NString pUserId,NString pSubjCodeMexc,NString pCrseNumbMexc,NString pLevlCode,NString pGrdeCode,NString pStartTerm,NString pEndTerm,NString pDataOrigin,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_CRSE_MUTUAL_EXCLUSION_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_PRIMARY_KEY", pPrimaryKey);
			cmd.addParameter("@P_SUBJ_CODE", pSubjCode);
			cmd.addParameter("@P_CRSE_NUMB", pCrseNumb);
			cmd.addParameter("@P_EFF_TERM", pEffTerm);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_SUBJ_CODE_MEXC", pSubjCodeMexc);
			cmd.addParameter("@P_CRSE_NUMB_MEXC", pCrseNumbMexc);
			cmd.addParameter("@P_LEVL_CODE", pLevlCode);
			cmd.addParameter("@P_GRDE_CODE", pGrdeCode);
			cmd.addParameter("@P_START_TERM", pStartTerm);
			cmd.addParameter("@P_END_TERM", pEndTerm);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pSubjCode,NString pCrseNumb,NString pEffTerm,NString pUserId,NString pSubjCodeMexc,NString pCrseNumbMexc,NString pLevlCode,NString pGrdeCode,NString pStartTerm,NString pEndTerm,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_CRSE_MUTUAL_EXCLUSION_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SUBJ_CODE", pSubjCode);
			cmd.addParameter("@P_CRSE_NUMB", pCrseNumb);
			cmd.addParameter("@P_EFF_TERM", pEffTerm);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_SUBJ_CODE_MEXC", pSubjCodeMexc);
			cmd.addParameter("@P_CRSE_NUMB_MEXC", pCrseNumbMexc);
			cmd.addParameter("@P_LEVL_CODE", pLevlCode);
			cmd.addParameter("@P_GRDE_CODE", pGrdeCode);
			cmd.addParameter("@P_START_TERM", pStartTerm);
			cmd.addParameter("@P_END_TERM", pEndTerm);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
	
	
	
}
