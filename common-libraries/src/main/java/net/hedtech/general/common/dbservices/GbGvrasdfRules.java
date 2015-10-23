package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GbGvrasdfRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVRASDF_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pSrn,NNumber pSeqNum,NString pGsrcCode,NNumber pSortNum,NString pQcodCode,NNumber pWeight,NNumber pTotalScore,NString pGsqaCode,NString pGsrcCodeRefInd,NString pOrientationInd,NString pMandatoryInd,NString pUserId,NString pDataOrigin,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVRASDF_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_SRN", pSrn);
			cmd.addParameter("@P_SEQ_NUM", pSeqNum);
			cmd.addParameter("@P_GSRC_CODE", pGsrcCode);
			cmd.addParameter("@P_SORT_NUM", pSortNum);
			cmd.addParameter("@P_QCOD_CODE", pQcodCode);
			cmd.addParameter("@P_WEIGHT", pWeight);
			cmd.addParameter("@P_TOTAL_SCORE", pTotalScore);
			cmd.addParameter("@P_GSQA_CODE", pGsqaCode);
			cmd.addParameter("@P_GSRC_CODE_REF_IND", pGsrcCodeRefInd);
			cmd.addParameter("@P_ORIENTATION_IND", pOrientationInd);
			cmd.addParameter("@P_MANDATORY_IND", pMandatoryInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pSrn,NNumber pSeqNum,NString pGsrcCode,NNumber pSortNum,NString pQcodCode,NNumber pWeight,NNumber pTotalScore,NString pGsqaCode,NString pGsrcCodeRefInd,NString pOrientationInd,NString pMandatoryInd,NString pUserId,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVRASDF_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SRN", pSrn);
			cmd.addParameter("@P_SEQ_NUM", pSeqNum);
			cmd.addParameter("@P_GSRC_CODE", pGsrcCode);
			cmd.addParameter("@P_SORT_NUM", pSortNum);
			cmd.addParameter("@P_QCOD_CODE", pQcodCode);
			cmd.addParameter("@P_WEIGHT", pWeight);
			cmd.addParameter("@P_TOTAL_SCORE", pTotalScore);
			cmd.addParameter("@P_GSQA_CODE", pGsqaCode);
			cmd.addParameter("@P_GSRC_CODE_REF_IND", pGsrcCodeRefInd);
			cmd.addParameter("@P_ORIENTATION_IND", pOrientationInd);
			cmd.addParameter("@P_MANDATORY_IND", pMandatoryInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
	
	
	
}
