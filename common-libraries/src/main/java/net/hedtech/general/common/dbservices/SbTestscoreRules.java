package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbTestscoreRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TESTSCORE_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pPidm,NString pTescCode,NDate pTestDate,NString pTestScore,NString pTsrcCode,NString pTadmCode,NString pAdmrCode,NString pTeinCode,NString pTefrCode,NString pTeacCode,NString pTeprCode,NString pRcrvInd,NString pSatOrigScore,NString pTermCodeEntry,NNumber pApplNo,NString pInstrId,NString pReleaseInd,NString pEquivInd,NString pSatEssayId,NString pUserId,NString pDataOrigin,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TESTSCORE_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TESC_CODE", pTescCode);
			cmd.addParameter("@P_TEST_DATE", pTestDate);
			cmd.addParameter("@P_TEST_SCORE", pTestScore);
			cmd.addParameter("@P_TSRC_CODE", pTsrcCode);
			cmd.addParameter("@P_TADM_CODE", pTadmCode);
			cmd.addParameter("@P_ADMR_CODE", pAdmrCode);
			cmd.addParameter("@P_TEIN_CODE", pTeinCode);
			cmd.addParameter("@P_TEFR_CODE", pTefrCode);
			cmd.addParameter("@P_TEAC_CODE", pTeacCode);
			cmd.addParameter("@P_TEPR_CODE", pTeprCode);
			cmd.addParameter("@P_RCRV_IND", pRcrvInd);
			cmd.addParameter("@P_SAT_ORIG_SCORE", pSatOrigScore);
			cmd.addParameter("@P_TERM_CODE_ENTRY", pTermCodeEntry);
			cmd.addParameter("@P_APPL_NO", pApplNo);
			cmd.addParameter("@P_INSTR_ID", pInstrId);
			cmd.addParameter("@P_RELEASE_IND", pReleaseInd);
			cmd.addParameter("@P_EQUIV_IND", pEquivInd);
			cmd.addParameter("@P_SAT_ESSAY_ID", pSatEssayId);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pPidm,NString pTescCode,NDate pTestDate,NString pTestScore,NString pTsrcCode,NString pTadmCode,NString pAdmrCode,NString pTeinCode,NString pTefrCode,NString pTeacCode,NString pTeprCode,NString pRcrvInd,NString pSatOrigScore,NString pTermCodeEntry,NNumber pApplNo,NString pInstrId,NString pReleaseInd,NString pEquivInd,NString pSatEssayId,NString pUserId,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TESTSCORE_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TESC_CODE", pTescCode);
			cmd.addParameter("@P_TEST_DATE", pTestDate);
			cmd.addParameter("@P_TEST_SCORE", pTestScore);
			cmd.addParameter("@P_TSRC_CODE", pTsrcCode);
			cmd.addParameter("@P_TADM_CODE", pTadmCode);
			cmd.addParameter("@P_ADMR_CODE", pAdmrCode);
			cmd.addParameter("@P_TEIN_CODE", pTeinCode);
			cmd.addParameter("@P_TEFR_CODE", pTefrCode);
			cmd.addParameter("@P_TEAC_CODE", pTeacCode);
			cmd.addParameter("@P_TEPR_CODE", pTeprCode);
			cmd.addParameter("@P_RCRV_IND", pRcrvInd);
			cmd.addParameter("@P_SAT_ORIG_SCORE", pSatOrigScore);
			cmd.addParameter("@P_TERM_CODE_ENTRY", pTermCodeEntry);
			cmd.addParameter("@P_APPL_NO", pApplNo);
			cmd.addParameter("@P_INSTR_ID", pInstrId);
			cmd.addParameter("@P_RELEASE_IND", pReleaseInd);
			cmd.addParameter("@P_EQUIV_IND", pEquivInd);
			cmd.addParameter("@P_SAT_ESSAY_ID", pSatEssayId);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
	
	
	
}
