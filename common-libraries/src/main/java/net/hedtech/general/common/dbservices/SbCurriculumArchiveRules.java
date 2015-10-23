package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbCurriculumArchiveRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_CURRICULUM_ARCHIVE_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pPidm,NNumber pSeqno,NString pLmodCde,NString pTermCde,NNumber pKeySeqno,NNumber pPriorityNo,NString pRollInd,NString pCactCde,NString pUserId,NString pDataOrigin,NString pLevlCde,NString pCollCde,NString pDegcCde,NString pTermCdeCtlg,NString pTermCdeEnd,NString pTermCdeMatric,NString pTermCdeAdmit,NString pAdmtCde,NString pCampCde,NString pProgram,NDate pStartDate,NDate pEndDate,NNumber pCurrRule,NNumber pRolledSeqno,NString pStypCde,NString pRateCde,NString pLeavCde,NDate pLeavFromDate,NDate pLeavToDate,NDate pExpGradDate,NString pTermCdeGrad,NString pAcyrCde,NString pSiteCde,NNumber pApplSeqno,NNumber pApplKeySeqno,NNumber pKeySeqnoRolled,NNumber pGappSeqno,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_CURRICULUM_ARCHIVE_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_LMOD_CDE", pLmodCde);
			cmd.addParameter("@P_TERM_CDE", pTermCde);
			cmd.addParameter("@P_KEY_SEQNO", pKeySeqno);
			cmd.addParameter("@P_PRIORITY_NO", pPriorityNo);
			cmd.addParameter("@P_ROLL_IND", pRollInd);
			cmd.addParameter("@P_CACT_CDE", pCactCde);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_LEVL_CDE", pLevlCde);
			cmd.addParameter("@P_COLL_CDE", pCollCde);
			cmd.addParameter("@P_DEGC_CDE", pDegcCde);
			cmd.addParameter("@P_TERM_CDE_CTLG", pTermCdeCtlg);
			cmd.addParameter("@P_TERM_CDE_END", pTermCdeEnd);
			cmd.addParameter("@P_TERM_CDE_MATRIC", pTermCdeMatric);
			cmd.addParameter("@P_TERM_CDE_ADMIT", pTermCdeAdmit);
			cmd.addParameter("@P_ADMT_CDE", pAdmtCde);
			cmd.addParameter("@P_CAMP_CDE", pCampCde);
			cmd.addParameter("@P_PROGRAM", pProgram);
			cmd.addParameter("@P_START_DATE", pStartDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_CURR_RULE", pCurrRule);
			cmd.addParameter("@P_ROLLED_SEQNO", pRolledSeqno);
			cmd.addParameter("@P_STYP_CDE", pStypCde);
			cmd.addParameter("@P_RATE_CDE", pRateCde);
			cmd.addParameter("@P_LEAV_CDE", pLeavCde);
			cmd.addParameter("@P_LEAV_FROM_DATE", pLeavFromDate);
			cmd.addParameter("@P_LEAV_TO_DATE", pLeavToDate);
			cmd.addParameter("@P_EXP_GRAD_DATE", pExpGradDate);
			cmd.addParameter("@P_TERM_CDE_GRAD", pTermCdeGrad);
			cmd.addParameter("@P_ACYR_CDE", pAcyrCde);
			cmd.addParameter("@P_SITE_CDE", pSiteCde);
			cmd.addParameter("@P_APPL_SEQNO", pApplSeqno);
			cmd.addParameter("@P_APPL_KEY_SEQNO", pApplKeySeqno);
			cmd.addParameter("@P_KEY_SEQNO_ROLLED", pKeySeqnoRolled);
			cmd.addParameter("@P_GAPP_SEQNO", pGappSeqno);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pPidm,NNumber pSeqno,NString pLmodCde,NString pTermCde,NNumber pKeySeqno,NNumber pPriorityNo,NString pRollInd,NString pCactCde,NString pUserId,NString pDataOrigin,NString pLevlCde,NString pCollCde,NString pDegcCde,NString pTermCdeCtlg,NString pTermCdeEnd,NString pTermCdeMatric,NString pTermCdeAdmit,NString pAdmtCde,NString pCampCde,NString pProgram,NDate pStartDate,NDate pEndDate,NNumber pCurrRule,NNumber pRolledSeqno,NString pStypCde,NString pRateCde,NString pLeavCde,NDate pLeavFromDate,NDate pLeavToDate,NDate pExpGradDate,NString pTermCdeGrad,NString pAcyrCde,NString pSiteCde,NNumber pApplSeqno,NNumber pApplKeySeqno,NNumber pKeySeqnoRolled,NNumber pGappSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_CURRICULUM_ARCHIVE_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_LMOD_CDE", pLmodCde);
			cmd.addParameter("@P_TERM_CDE", pTermCde);
			cmd.addParameter("@P_KEY_SEQNO", pKeySeqno);
			cmd.addParameter("@P_PRIORITY_NO", pPriorityNo);
			cmd.addParameter("@P_ROLL_IND", pRollInd);
			cmd.addParameter("@P_CACT_CDE", pCactCde);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_LEVL_CDE", pLevlCde);
			cmd.addParameter("@P_COLL_CDE", pCollCde);
			cmd.addParameter("@P_DEGC_CDE", pDegcCde);
			cmd.addParameter("@P_TERM_CDE_CTLG", pTermCdeCtlg);
			cmd.addParameter("@P_TERM_CDE_END", pTermCdeEnd);
			cmd.addParameter("@P_TERM_CDE_MATRIC", pTermCdeMatric);
			cmd.addParameter("@P_TERM_CDE_ADMIT", pTermCdeAdmit);
			cmd.addParameter("@P_ADMT_CDE", pAdmtCde);
			cmd.addParameter("@P_CAMP_CDE", pCampCde);
			cmd.addParameter("@P_PROGRAM", pProgram);
			cmd.addParameter("@P_START_DATE", pStartDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_CURR_RULE", pCurrRule);
			cmd.addParameter("@P_ROLLED_SEQNO", pRolledSeqno);
			cmd.addParameter("@P_STYP_CDE", pStypCde);
			cmd.addParameter("@P_RATE_CDE", pRateCde);
			cmd.addParameter("@P_LEAV_CDE", pLeavCde);
			cmd.addParameter("@P_LEAV_FROM_DATE", pLeavFromDate);
			cmd.addParameter("@P_LEAV_TO_DATE", pLeavToDate);
			cmd.addParameter("@P_EXP_GRAD_DATE", pExpGradDate);
			cmd.addParameter("@P_TERM_CDE_GRAD", pTermCdeGrad);
			cmd.addParameter("@P_ACYR_CDE", pAcyrCde);
			cmd.addParameter("@P_SITE_CDE", pSiteCde);
			cmd.addParameter("@P_APPL_SEQNO", pApplSeqno);
			cmd.addParameter("@P_APPL_KEY_SEQNO", pApplKeySeqno);
			cmd.addParameter("@P_KEY_SEQNO_ROLLED", pKeySeqnoRolled);
			cmd.addParameter("@P_GAPP_SEQNO", pGappSeqno);
				
			cmd.execute();


		}
		
	
	
	
}
