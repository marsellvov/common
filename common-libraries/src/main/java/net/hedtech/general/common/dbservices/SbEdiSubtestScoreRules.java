package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbEdiSubtestScoreRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_SUBTEST_SCORE_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pDcmtSeqno,NNumber pTestSeqno,NNumber pStstSeqno,NNumber pSeqno,NString pScore,NString pTefrCode,NString pScoreRevisedInd,NString pScoreInvalidatedInd,NString pScoreSelfreportedInd,NString pMessage,NString pUserId,NString pDataOrigin,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_SUBTEST_SCORE_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_DCMT_SEQNO", pDcmtSeqno);
			cmd.addParameter("@P_TEST_SEQNO", pTestSeqno);
			cmd.addParameter("@P_STST_SEQNO", pStstSeqno);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_SCORE", pScore);
			cmd.addParameter("@P_TEFR_CODE", pTefrCode);
			cmd.addParameter("@P_SCORE_REVISED_IND", pScoreRevisedInd);
			cmd.addParameter("@P_SCORE_INVALIDATED_IND", pScoreInvalidatedInd);
			cmd.addParameter("@P_SCORE_SELFREPORTED_IND", pScoreSelfreportedInd);
			cmd.addParameter("@P_MESSAGE", pMessage);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pDcmtSeqno,NNumber pTestSeqno,NNumber pStstSeqno,NNumber pSeqno,NString pScore,NString pTefrCode,NString pScoreRevisedInd,NString pScoreInvalidatedInd,NString pScoreSelfreportedInd,NString pMessage,NString pUserId,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_SUBTEST_SCORE_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DCMT_SEQNO", pDcmtSeqno);
			cmd.addParameter("@P_TEST_SEQNO", pTestSeqno);
			cmd.addParameter("@P_STST_SEQNO", pStstSeqno);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_SCORE", pScore);
			cmd.addParameter("@P_TEFR_CODE", pTefrCode);
			cmd.addParameter("@P_SCORE_REVISED_IND", pScoreRevisedInd);
			cmd.addParameter("@P_SCORE_INVALIDATED_IND", pScoreInvalidatedInd);
			cmd.addParameter("@P_SCORE_SELFREPORTED_IND", pScoreSelfreportedInd);
			cmd.addParameter("@P_MESSAGE", pMessage);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
	
	
	
}
