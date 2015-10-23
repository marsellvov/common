package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbFieldofstudyArchiveRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FIELDOFSTUDY_ARCHIVE_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pPidm,NNumber pLcurSeqno,NNumber pSeqno,NString pLfstCde,NString pTermCde,NNumber pPriorityNo,NString pCstsCde,NString pCactCde,NString pDataOrigin,NString pUserId,NString pMajrCde,NString pTermCdeCtlg,NString pTermCdeEnd,NString pDeptCde,NNumber pLfosRule,NNumber pConcAttachRule,NDate pStartDate,NDate pEndDate,NString pTmstCde,NNumber pRolledSeqno,NString pMajrCdeAttach,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FIELDOFSTUDY_ARCHIVE_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_LCUR_SEQNO", pLcurSeqno);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_LFST_CDE", pLfstCde);
			cmd.addParameter("@P_TERM_CDE", pTermCde);
			cmd.addParameter("@P_PRIORITY_NO", pPriorityNo);
			cmd.addParameter("@P_CSTS_CDE", pCstsCde);
			cmd.addParameter("@P_CACT_CDE", pCactCde);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_MAJR_CDE", pMajrCde);
			cmd.addParameter("@P_TERM_CDE_CTLG", pTermCdeCtlg);
			cmd.addParameter("@P_TERM_CDE_END", pTermCdeEnd);
			cmd.addParameter("@P_DEPT_CDE", pDeptCde);
			cmd.addParameter("@P_LFOS_RULE", pLfosRule);
			cmd.addParameter("@P_CONC_ATTACH_RULE", pConcAttachRule);
			cmd.addParameter("@P_START_DATE", pStartDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_TMST_CDE", pTmstCde);
			cmd.addParameter("@P_ROLLED_SEQNO", pRolledSeqno);
			cmd.addParameter("@P_MAJR_CDE_ATTACH", pMajrCdeAttach);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pPidm,NNumber pLcurSeqno,NNumber pSeqno,NString pLfstCde,NString pTermCde,NNumber pPriorityNo,NString pCstsCde,NString pCactCde,NString pDataOrigin,NString pUserId,NString pMajrCde,NString pTermCdeCtlg,NString pTermCdeEnd,NString pDeptCde,NNumber pLfosRule,NNumber pConcAttachRule,NDate pStartDate,NDate pEndDate,NString pTmstCde,NNumber pRolledSeqno,NString pMajrCdeAttach) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FIELDOFSTUDY_ARCHIVE_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_LCUR_SEQNO", pLcurSeqno);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_LFST_CDE", pLfstCde);
			cmd.addParameter("@P_TERM_CDE", pTermCde);
			cmd.addParameter("@P_PRIORITY_NO", pPriorityNo);
			cmd.addParameter("@P_CSTS_CDE", pCstsCde);
			cmd.addParameter("@P_CACT_CDE", pCactCde);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_MAJR_CDE", pMajrCde);
			cmd.addParameter("@P_TERM_CDE_CTLG", pTermCdeCtlg);
			cmd.addParameter("@P_TERM_CDE_END", pTermCdeEnd);
			cmd.addParameter("@P_DEPT_CDE", pDeptCde);
			cmd.addParameter("@P_LFOS_RULE", pLfosRule);
			cmd.addParameter("@P_CONC_ATTACH_RULE", pConcAttachRule);
			cmd.addParameter("@P_START_DATE", pStartDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_TMST_CDE", pTmstCde);
			cmd.addParameter("@P_ROLLED_SEQNO", pRolledSeqno);
			cmd.addParameter("@P_MAJR_CDE_ATTACH", pMajrCdeAttach);
				
			cmd.execute();


		}
		
	
	
	
}
