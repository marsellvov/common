package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbLearneroutcomeRules {
		public static NString fAcademicHonors(NNumber pPidm,NNumber pSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_LEARNEROUTCOME_RULES.F_ACADEMIC_HONORS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fDegreeAwarded(NNumber pPidm,NNumber pSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_LEARNEROUTCOME_RULES.F_DEGREE_AWARDED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fDegreeSought(NNumber pPidm,NNumber pSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_LEARNEROUTCOME_RULES.F_DEGREE_SOUGHT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fInstitutionalHonors(NNumber pPidm,NNumber pSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_LEARNEROUTCOME_RULES.F_INSTITUTIONAL_HONORS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fInvalidNextStatus(NString pDegsCode,NString pGrstCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_LEARNEROUTCOME_RULES.F_INVALID_NEXT_STATUS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_DEGS_CODE", pDegsCode);
			cmd.addParameter("@P_GRST_CODE", pGrstCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fSeqno(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_LEARNEROUTCOME_RULES.F_SEQNO", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_LEARNEROUTCOME_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pPidm,NNumber pSeqNo,NString pDegsCode,NDate pApplDate,NDate pGradDate,NString pAcyrCodeBulletin,NString pTermCodeSturec,NString pTermCodeGrad,NString pAcyrCode,NString pGrstCode,NString pFeeInd,NDate pFeeDate,NString pAuthorized,NString pTermCodeCompleted,NString pDegcCodeDual,NString pLevlCodeDual,NString pDeptCodeDual,NString pCollCodeDual,NString pMajrCodeDual,NString pUserId,NString pDataOrigin,NString pInternalRecordId,NNumber pStspKeySequence) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_LEARNEROUTCOME_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_DEGS_CODE", pDegsCode);
			cmd.addParameter("@P_APPL_DATE", pApplDate);
			cmd.addParameter("@P_GRAD_DATE", pGradDate);
			cmd.addParameter("@P_ACYR_CODE_BULLETIN", pAcyrCodeBulletin);
			cmd.addParameter("@P_TERM_CODE_STUREC", pTermCodeSturec);
			cmd.addParameter("@P_TERM_CODE_GRAD", pTermCodeGrad);
			cmd.addParameter("@P_ACYR_CODE", pAcyrCode);
			cmd.addParameter("@P_GRST_CODE", pGrstCode);
			cmd.addParameter("@P_FEE_IND", pFeeInd);
			cmd.addParameter("@P_FEE_DATE", pFeeDate);
			cmd.addParameter("@P_AUTHORIZED", pAuthorized);
			cmd.addParameter("@P_TERM_CODE_COMPLETED", pTermCodeCompleted);
			cmd.addParameter("@P_DEGC_CODE_DUAL", pDegcCodeDual);
			cmd.addParameter("@P_LEVL_CODE_DUAL", pLevlCodeDual);
			cmd.addParameter("@P_DEPT_CODE_DUAL", pDeptCodeDual);
			cmd.addParameter("@P_COLL_CODE_DUAL", pCollCodeDual);
			cmd.addParameter("@P_MAJR_CODE_DUAL", pMajrCodeDual);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
			cmd.addParameter("@P_STSP_KEY_SEQUENCE", pStspKeySequence);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pPidm,NNumber pSeqNo,NString pDegsCode,NDate pApplDate,NDate pGradDate,NString pAcyrCodeBulletin,NString pTermCodeSturec,NString pTermCodeGrad,NString pAcyrCode,NString pGrstCode,NString pFeeInd,NDate pFeeDate,NString pAuthorized,NString pTermCodeCompleted,NString pDegcCodeDual,NString pLevlCodeDual,NString pDeptCodeDual,NString pCollCodeDual,NString pMajrCodeDual,NString pUserId,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_LEARNEROUTCOME_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_DEGS_CODE", pDegsCode);
			cmd.addParameter("@P_APPL_DATE", pApplDate);
			cmd.addParameter("@P_GRAD_DATE", pGradDate);
			cmd.addParameter("@P_ACYR_CODE_BULLETIN", pAcyrCodeBulletin);
			cmd.addParameter("@P_TERM_CODE_STUREC", pTermCodeSturec);
			cmd.addParameter("@P_TERM_CODE_GRAD", pTermCodeGrad);
			cmd.addParameter("@P_ACYR_CODE", pAcyrCode);
			cmd.addParameter("@P_GRST_CODE", pGrstCode);
			cmd.addParameter("@P_FEE_IND", pFeeInd);
			cmd.addParameter("@P_FEE_DATE", pFeeDate);
			cmd.addParameter("@P_AUTHORIZED", pAuthorized);
			cmd.addParameter("@P_TERM_CODE_COMPLETED", pTermCodeCompleted);
			cmd.addParameter("@P_DEGC_CODE_DUAL", pDegcCodeDual);
			cmd.addParameter("@P_LEVL_CODE_DUAL", pLevlCodeDual);
			cmd.addParameter("@P_DEPT_CODE_DUAL", pDeptCodeDual);
			cmd.addParameter("@P_COLL_CODE_DUAL", pCollCodeDual);
			cmd.addParameter("@P_MAJR_CODE_DUAL", pMajrCodeDual);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
	
	
	
}
