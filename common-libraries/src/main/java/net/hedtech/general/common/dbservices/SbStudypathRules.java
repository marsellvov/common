package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbStudypathRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_STUDYPATH_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pPidm,NString pTermCodeEff,NNumber pKeySeqno,NString pStspCode,NString pDataOrigin,NString pUserId,NString pFullPartInd,NString pSessCode,NString pResdCode,NString pOrsnCode,NString pPracCode,NString pCaplCode,NString pEdlvCode,NString pIncmCode,NString pEmexCode,NString pAprnCode,NString pTrcnCode,NString pGainCode,NString pVoedCode,NString pBlckCode,NString pEgolCode,NString pBsklCode,NString pAstdCode,NString pPrevCode,NString pCastCode,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_STUDYPATH_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_KEY_SEQNO", pKeySeqno);
			cmd.addParameter("@P_STSP_CODE", pStspCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_FULL_PART_IND", pFullPartInd);
			cmd.addParameter("@P_SESS_CODE", pSessCode);
			cmd.addParameter("@P_RESD_CODE", pResdCode);
			cmd.addParameter("@P_ORSN_CODE", pOrsnCode);
			cmd.addParameter("@P_PRAC_CODE", pPracCode);
			cmd.addParameter("@P_CAPL_CODE", pCaplCode);
			cmd.addParameter("@P_EDLV_CODE", pEdlvCode);
			cmd.addParameter("@P_INCM_CODE", pIncmCode);
			cmd.addParameter("@P_EMEX_CODE", pEmexCode);
			cmd.addParameter("@P_APRN_CODE", pAprnCode);
			cmd.addParameter("@P_TRCN_CODE", pTrcnCode);
			cmd.addParameter("@P_GAIN_CODE", pGainCode);
			cmd.addParameter("@P_VOED_CODE", pVoedCode);
			cmd.addParameter("@P_BLCK_CODE", pBlckCode);
			cmd.addParameter("@P_EGOL_CODE", pEgolCode);
			cmd.addParameter("@P_BSKL_CODE", pBsklCode);
			cmd.addParameter("@P_ASTD_CODE", pAstdCode);
			cmd.addParameter("@P_PREV_CODE", pPrevCode);
			cmd.addParameter("@P_CAST_CODE", pCastCode);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pPidm,NString pTermCodeEff,NNumber pKeySeqno,NString pStspCode,NString pDataOrigin,NString pUserId,NString pFullPartInd,NString pSessCode,NString pResdCode,NString pOrsnCode,NString pPracCode,NString pCaplCode,NString pEdlvCode,NString pIncmCode,NString pEmexCode,NString pAprnCode,NString pTrcnCode,NString pGainCode,NString pVoedCode,NString pBlckCode,NString pEgolCode,NString pBsklCode,NString pAstdCode,NString pPrevCode,NString pCastCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_STUDYPATH_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_KEY_SEQNO", pKeySeqno);
			cmd.addParameter("@P_STSP_CODE", pStspCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_FULL_PART_IND", pFullPartInd);
			cmd.addParameter("@P_SESS_CODE", pSessCode);
			cmd.addParameter("@P_RESD_CODE", pResdCode);
			cmd.addParameter("@P_ORSN_CODE", pOrsnCode);
			cmd.addParameter("@P_PRAC_CODE", pPracCode);
			cmd.addParameter("@P_CAPL_CODE", pCaplCode);
			cmd.addParameter("@P_EDLV_CODE", pEdlvCode);
			cmd.addParameter("@P_INCM_CODE", pIncmCode);
			cmd.addParameter("@P_EMEX_CODE", pEmexCode);
			cmd.addParameter("@P_APRN_CODE", pAprnCode);
			cmd.addParameter("@P_TRCN_CODE", pTrcnCode);
			cmd.addParameter("@P_GAIN_CODE", pGainCode);
			cmd.addParameter("@P_VOED_CODE", pVoedCode);
			cmd.addParameter("@P_BLCK_CODE", pBlckCode);
			cmd.addParameter("@P_EGOL_CODE", pEgolCode);
			cmd.addParameter("@P_BSKL_CODE", pBsklCode);
			cmd.addParameter("@P_ASTD_CODE", pAstdCode);
			cmd.addParameter("@P_PREV_CODE", pPrevCode);
			cmd.addParameter("@P_CAST_CODE", pCastCode);
				
			cmd.execute();


		}
		
	
	
	
}
