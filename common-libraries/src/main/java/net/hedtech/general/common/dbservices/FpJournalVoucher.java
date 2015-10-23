package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class FpJournalVoucher {
		public static void pComplete(NString pDocNum,NNumber pSubmissionNumber,NString pCompleteRequested,NString pUserId,NString pRowid,Ref<NString> pMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FP_JOURNAL_VOUCHER.P_COMPLETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DOC_NUM", pDocNum);
			cmd.addParameter("@P_SUBMISSION_NUMBER", pSubmissionNumber);
			cmd.addParameter("@P_COMPLETE_REQUESTED", pCompleteRequested);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ROWID", pRowid);
			cmd.addParameter("@P_MSG_OUT", NString.class);
				
			cmd.execute();
			pMsgOut.val = cmd.getParameterValue("@P_MSG_OUT", NString.class);


		}
		
		public static void pCopyJournal(NString pDocNumSource,NNumber pSubmissionNumberSource,Ref<NString> pDocNumInOut,NDate pTransDate,NString pReversalInd,NString pCopyText) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FP_JOURNAL_VOUCHER.P_COPY_JOURNAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DOC_NUM_SOURCE", pDocNumSource);
			cmd.addParameter("@P_SUBMISSION_NUMBER_SOURCE", pSubmissionNumberSource);
			cmd.addParameter("@P_DOC_NUM_IN_OUT", pDocNumInOut, true);
			cmd.addParameter("@P_TRANS_DATE", pTransDate);
			cmd.addParameter("@P_REVERSAL_IND", pReversalInd);
			cmd.addParameter("@P_COPY_TEXT", pCopyText);
				
			cmd.execute();
			pDocNumInOut.val = cmd.getParameterValue("@P_DOC_NUM_IN_OUT", NString.class);


		}
		
		public static void pCreateIdcedJv(NString pSourceDocCode,NDate pTransDate,NString pFsyrCode,NString pFspdCode,NString pSrcRuclCode,Ref<NString> pDocCode,Ref<NString> pWarMsgOut,Ref<NString> pErrMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FP_JOURNAL_VOUCHER.P_CREATE_IDCED_JV", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SOURCE_DOC_CODE", pSourceDocCode);
			cmd.addParameter("@P_TRANS_DATE", pTransDate);
			cmd.addParameter("@P_FSYR_CODE", pFsyrCode);
			cmd.addParameter("@P_FSPD_CODE", pFspdCode);
			cmd.addParameter("@P_SRC_RUCL_CODE", pSrcRuclCode);
			cmd.addParameter("@P_DOC_CODE", NString.class);
			cmd.addParameter("@P_WAR_MSG_OUT", NString.class);
			cmd.addParameter("@P_ERR_MSG_OUT", NString.class);
				
			cmd.execute();
			pDocCode.val = cmd.getParameterValue("@P_DOC_CODE", NString.class);
			pWarMsgOut.val = cmd.getParameterValue("@P_WAR_MSG_OUT", NString.class);
			pErrMsgOut.val = cmd.getParameterValue("@P_ERR_MSG_OUT", NString.class);


		}
		
		public static void pDeleteJournal(NString pDocNum,NNumber pSubmissionNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FP_JOURNAL_VOUCHER.P_DELETE_JOURNAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DOC_NUM", pDocNum);
			cmd.addParameter("@P_SUBMISSION_NUMBER", pSubmissionNumber);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NString pDocNum,NNumber pSubmissionNumber,NString pEvent) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FP_JOURNAL_VOUCHER.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DOC_NUM", pDocNum);
			cmd.addParameter("@P_SUBMISSION_NUMBER", pSubmissionNumber);
			cmd.addParameter("@P_EVENT", pEvent);
				
			cmd.execute();


		}
		
		public static void pRuclBalancing(NString pDocNum,NNumber pSubmissionNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FP_JOURNAL_VOUCHER.P_RUCL_BALANCING", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DOC_NUM", pDocNum);
			cmd.addParameter("@P_SUBMISSION_NUMBER", pSubmissionNumber);
				
			cmd.execute();


		}
		
		public static void pValidateDetail(NString pDocNum,NNumber pSubmissionNumber,NString pUserId,NString pDistTotal) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FP_JOURNAL_VOUCHER.P_VALIDATE_DETAIL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DOC_NUM", pDocNum);
			cmd.addParameter("@P_SUBMISSION_NUMBER", pSubmissionNumber);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DIST_TOTAL", pDistTotal);
				
			cmd.execute();


		}
		
	
	
	
}
