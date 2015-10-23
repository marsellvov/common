package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GbGvrsrelRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVRSREL_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pGsrcCode,NNumber pSdefSeqNum,NNumber pPvacSeqNum,NString pQcodCode,NString pAcodCode,NString pGsrcCodeRef,NDate pActivityDate,NString pUserId,NString pDataOrigin,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVRSREL_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_GSRC_CODE", pGsrcCode);
			cmd.addParameter("@P_SDEF_SEQ_NUM", pSdefSeqNum);
			cmd.addParameter("@P_PVAC_SEQ_NUM", pPvacSeqNum);
			cmd.addParameter("@P_QCOD_CODE", pQcodCode);
			cmd.addParameter("@P_ACOD_CODE", pAcodCode);
			cmd.addParameter("@P_GSRC_CODE_REF", pGsrcCodeRef);
			cmd.addParameter("@P_ACTIVITY_DATE", pActivityDate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pGsrcCode,NNumber pSdefSeqNum,NNumber pPvacSeqNum,NString pQcodCode,NString pAcodCode,NString pGsrcCodeRef,NDate pActivityDate,NString pUserId,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVRSREL_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_GSRC_CODE", pGsrcCode);
			cmd.addParameter("@P_SDEF_SEQ_NUM", pSdefSeqNum);
			cmd.addParameter("@P_PVAC_SEQ_NUM", pPvacSeqNum);
			cmd.addParameter("@P_QCOD_CODE", pQcodCode);
			cmd.addParameter("@P_ACOD_CODE", pAcodCode);
			cmd.addParameter("@P_GSRC_CODE_REF", pGsrcCodeRef);
			cmd.addParameter("@P_ACTIVITY_DATE", pActivityDate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
	
	
	
}
