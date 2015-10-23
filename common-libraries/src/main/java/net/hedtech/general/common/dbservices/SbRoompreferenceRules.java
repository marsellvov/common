package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbRoompreferenceRules {
		public static NString fParentExists(NString pPreferedBuilding,NString pPreferedBcatCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ROOMPREFERENCE_RULES.F_PARENT_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PREFERED_BUILDING", pPreferedBuilding);
			cmd.addParameter("@P_PREFERED_BCAT_CODE", pPreferedBcatCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pCheckAssignments(NString pRowid,NNumber pPidm,NString pToTerm,NString pFromTerm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ROOMPREFERENCE_RULES.P_CHECK_ASSIGNMENTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ROWID", pRowid);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TO_TERM", pToTerm);
			cmd.addParameter("@P_FROM_TERM", pFromTerm);
				
			cmd.execute();


		}
		
		public static void pCheckCombinations(NString pPreferedBcatCode,NString pPreferedRoom,NString pFromTerm,NString pToTerm,NString pBldg,NString pBldgSex,NString pPersSex) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ROOMPREFERENCE_RULES.P_CHECK_COMBINATIONS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PREFERED_BCAT_CODE", pPreferedBcatCode);
			cmd.addParameter("@P_PREFERED_ROOM", pPreferedRoom);
			cmd.addParameter("@P_FROM_TERM", pFromTerm);
			cmd.addParameter("@P_TO_TERM", pToTerm);
			cmd.addParameter("@P_BLDG", pBldg);
			cmd.addParameter("@P_BLDG_SEX", pBldgSex);
			cmd.addParameter("@P_PERS_SEX", pPersSex);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ROOMPREFERENCE_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pPidm,NString pArtpCode,NString pFromTerm,NString pToTerm,NString pApplPriority,NString pPreferedBuilding,NString pPreferedRoom,NString pPreferedBcatCode,NString pPreferedCampCode,NString pMrcdCode,NString pHapsCode,NDate pHapsDate,NDate pAddDate,NString pDataOrigin,NString pUserId,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ROOMPREFERENCE_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ARTP_CODE", pArtpCode);
			cmd.addParameter("@P_FROM_TERM", pFromTerm);
			cmd.addParameter("@P_TO_TERM", pToTerm);
			cmd.addParameter("@P_APPL_PRIORITY", pApplPriority);
			cmd.addParameter("@P_PREFERED_BUILDING", pPreferedBuilding);
			cmd.addParameter("@P_PREFERED_ROOM", pPreferedRoom);
			cmd.addParameter("@P_PREFERED_BCAT_CODE", pPreferedBcatCode);
			cmd.addParameter("@P_PREFERED_CAMP_CODE", pPreferedCampCode);
			cmd.addParameter("@P_MRCD_CODE", pMrcdCode);
			cmd.addParameter("@P_HAPS_CODE", pHapsCode);
			cmd.addParameter("@P_HAPS_DATE", pHapsDate);
			cmd.addParameter("@P_ADD_DATE", pAddDate);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pPidm,NString pArtpCode,NString pFromTerm,NString pToTerm,NString pApplPriority,NString pPreferedBuilding,NString pPreferedRoom,NString pPreferedBcatCode,NString pPreferedCampCode,NString pMrcdCode,NString pHapsCode,NDate pHapsDate,NDate pAddDate,NString pRowid,NString pDataOrigin,NString pUserId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ROOMPREFERENCE_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ARTP_CODE", pArtpCode);
			cmd.addParameter("@P_FROM_TERM", pFromTerm);
			cmd.addParameter("@P_TO_TERM", pToTerm);
			cmd.addParameter("@P_APPL_PRIORITY", pApplPriority);
			cmd.addParameter("@P_PREFERED_BUILDING", pPreferedBuilding);
			cmd.addParameter("@P_PREFERED_ROOM", pPreferedRoom);
			cmd.addParameter("@P_PREFERED_BCAT_CODE", pPreferedBcatCode);
			cmd.addParameter("@P_PREFERED_CAMP_CODE", pPreferedCampCode);
			cmd.addParameter("@P_MRCD_CODE", pMrcdCode);
			cmd.addParameter("@P_HAPS_CODE", pHapsCode);
			cmd.addParameter("@P_HAPS_DATE", pHapsDate);
			cmd.addParameter("@P_ADD_DATE", pAddDate);
			cmd.addParameter("@P_ROWID", pRowid);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
				
			cmd.execute();


		}
		
	
	
	
}
