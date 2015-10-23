package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Phklabr {
		public static NBool fChkUpdReds(NString pYear,NString pPict,NNumber pPayno,NNumber pPidm,NNumber pSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKLABR.F_CHK_UPD_REDS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_PICT", pPict);
			cmd.addParameter("@P_PAYNO", pPayno);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQNO", pSeqno);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NString fCompressName(NString nameStr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKLABR.F_COMPRESS_NAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@NAME_STR", nameStr);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pChangeAllRedistributions1(NString pYear,NString pPictCode,NNumber pPayno,NNumber pPidm,NNumber pSeqNo,NString pShift,NString pEarnCode,NDate pEffectiveDate,NString pPosn,NString pSuff,NString pGenInd,NDate pPostingDate,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKLABR.P_CHANGE_ALL_REDISTRIBUTIONS_1", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
			cmd.addParameter("@P_PAYNO", pPayno);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_SHIFT", pShift);
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_GEN_IND", pGenInd);
			cmd.addParameter("@P_POSTING_DATE", pPostingDate);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pChangeAllRedistributions2(NString pYear,NString pPictCode,NNumber pPayno,NNumber pPidm,NNumber pSeqNo,NString pShift,NString pEarnCode,NDate pEffectiveDate,NString pPosn,NString pSuff,NString pGenInd,NDate pPostingDate,Ref<NString> pWarningMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKLABR.P_CHANGE_ALL_REDISTRIBUTIONS_2", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
			cmd.addParameter("@P_PAYNO", pPayno);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_SHIFT", pShift);
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_GEN_IND", pGenInd);
			cmd.addParameter("@P_POSTING_DATE", pPostingDate);
			cmd.addParameter("@P_WARNING_MSG_OUT", NString.class);
				
			cmd.execute();
			pWarningMsgOut.val = cmd.getParameterValue("@P_WARNING_MSG_OUT", NString.class);


		}
		
		public static void pChangeRedistribution(NString pYear,NString pPictCode,NNumber pPayno,NNumber pPidm,NNumber pSeqNo,NString pShift,NString pEarnCode,NDate pEffectiveDate,NString pPosn,NString pSuff,NString pGenInd,NDate pPostingDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKLABR.P_CHANGE_REDISTRIBUTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
			cmd.addParameter("@P_PAYNO", pPayno);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_SHIFT", pShift);
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_GEN_IND", pGenInd);
			cmd.addParameter("@P_POSTING_DATE", pPostingDate);
				
			cmd.execute();


		}
		
		public static void pDeletePhrelbd(NString inYear,NString inPictCode,NNumber inPayno,NNumber inPidm,NNumber inSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKLABR.P_DELETE_PHRELBD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IN_YEAR", inYear);
			cmd.addParameter("@IN_PICT_CODE", inPictCode);
			cmd.addParameter("@IN_PAYNO", inPayno);
			cmd.addParameter("@IN_PIDM", inPidm);
			cmd.addParameter("@IN_SEQ_NO", inSeqNo);
				
			cmd.execute();


		}
		
		public static void pDoEditFoapal(NString pCoasCode,NString pAcciCode,NString pFundCode,NString pOrgnCode,NString pAcctCode,NString pProgCode,NString pActvCode,NString pLocnCode,NDate pEffDate,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKLABR.P_DO_EDIT_FOAPAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_ACCI_CODE", pAcciCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_ORGN_CODE", pOrgnCode);
			cmd.addParameter("@P_ACCT_CODE", pAcctCode);
			cmd.addParameter("@P_PROG_CODE", pProgCode);
			cmd.addParameter("@P_ACTV_CODE", pActvCode);
			cmd.addParameter("@P_LOCN_CODE", pLocnCode);
			cmd.addParameter("@P_EFF_DATE", pEffDate);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pEditFoapal(NString pYear,NString pPictCode,NNumber pPayno,NNumber pPidm,NNumber pSeqNo,NString pShift,NString pEarnCode,NDate pEffectiveDate,NString pPosn,NString pSuff,NString pGenInd,NDate pPostingDate,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKLABR.P_EDIT_FOAPAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
			cmd.addParameter("@P_PAYNO", pPayno);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_SHIFT", pShift);
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_GEN_IND", pGenInd);
			cmd.addParameter("@P_POSTING_DATE", pPostingDate);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pErasePayEvent(NString inYear,NString inPictCode,NNumber inPayno,NNumber inPidm,NNumber inSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKLABR.P_ERASE_PAY_EVENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IN_YEAR", inYear);
			cmd.addParameter("@IN_PICT_CODE", inPictCode);
			cmd.addParameter("@IN_PAYNO", inPayno);
			cmd.addParameter("@IN_PIDM", inPidm);
			cmd.addParameter("@IN_SEQ_NO", inSeqNo);
				
			cmd.execute();


		}
		
		public static void pPopulatePhrredsByPayevent(NString pYear,NString pPictCode,NNumber pPayno,NNumber pPidm,NNumber pSeqNo,NString pPosn,NString pSuff,NDate pEffdate,NString pEarncode,NString pCoa,NString pAcci,NString pFund,NString pOrgn,NString pAcct,NString pProgram,NString pActivity,NString pLocation,NString pProject,NString pCost,NString pChangeAllInd,Ref<NString> pTransExistsOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKLABR.P_POPULATE_PHRREDS_BY_PAYEVENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
			cmd.addParameter("@P_PAYNO", pPayno);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_EFFDATE", pEffdate);
			cmd.addParameter("@P_EARNCODE", pEarncode);
			cmd.addParameter("@P_COA", pCoa);
			cmd.addParameter("@P_ACCI", pAcci);
			cmd.addParameter("@P_FUND", pFund);
			cmd.addParameter("@P_ORGN", pOrgn);
			cmd.addParameter("@P_ACCT", pAcct);
			cmd.addParameter("@P_PROGRAM", pProgram);
			cmd.addParameter("@P_ACTIVITY", pActivity);
			cmd.addParameter("@P_LOCATION", pLocation);
			cmd.addParameter("@P_PROJECT", pProject);
			cmd.addParameter("@P_COST", pCost);
			cmd.addParameter("@P_CHANGE_ALL_IND", pChangeAllInd);
			cmd.addParameter("@P_TRANS_EXISTS_OUT", NString.class);
				
			cmd.execute();
			pTransExistsOut.val = cmd.getParameterValue("@P_TRANS_EXISTS_OUT", NString.class);


		}
		
		public static void pPopulatePhrredsRound() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKLABR.P_POPULATE_PHRREDS_ROUND", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pRedistributePayEvent(NString inYear,NString inPictCode,NNumber inPayno,NNumber inPidm,NNumber inSeqNo,NNumber inRedistrSeqNo,NNumber inAssocSeqNo,NDate inPostDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKLABR.P_REDISTRIBUTE_PAY_EVENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IN_YEAR", inYear);
			cmd.addParameter("@IN_PICT_CODE", inPictCode);
			cmd.addParameter("@IN_PAYNO", inPayno);
			cmd.addParameter("@IN_PIDM", inPidm);
			cmd.addParameter("@IN_SEQ_NO", inSeqNo);
			cmd.addParameter("@IN_REDISTR_SEQ_NO", inRedistrSeqNo);
			cmd.addParameter("@IN_ASSOC_SEQ_NO", inAssocSeqNo);
			cmd.addParameter("@IN_POST_DATE", inPostDate);
				
			cmd.execute();


		}
		
		public static void pRedistributePhrelbd(NString inYear,NString inPictCode,NNumber inPayno,NNumber inPidm,NNumber inSeqNo,NNumber inRedistrSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKLABR.P_REDISTRIBUTE_PHRELBD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IN_YEAR", inYear);
			cmd.addParameter("@IN_PICT_CODE", inPictCode);
			cmd.addParameter("@IN_PAYNO", inPayno);
			cmd.addParameter("@IN_PIDM", inPidm);
			cmd.addParameter("@IN_SEQ_NO", inSeqNo);
			cmd.addParameter("@IN_REDISTR_SEQ_NO", inRedistrSeqNo);
				
			cmd.execute();


		}
		
		public static void pRedistributePhrelbd2(NString inYear,NString inPictCode,NNumber inPayno,NNumber inPidm,NNumber inSeqNo,NNumber inRedistrSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKLABR.P_REDISTRIBUTE_PHRELBD_2", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IN_YEAR", inYear);
			cmd.addParameter("@IN_PICT_CODE", inPictCode);
			cmd.addParameter("@IN_PAYNO", inPayno);
			cmd.addParameter("@IN_PIDM", inPidm);
			cmd.addParameter("@IN_SEQ_NO", inSeqNo);
			cmd.addParameter("@IN_REDISTR_SEQ_NO", inRedistrSeqNo);
				
			cmd.execute();


		}
		
		public static void pUpdatePhrearn(NString inYear,NString inPictCode,NNumber inPayno,NNumber inPidm,NNumber inSeqNo,NNumber inRedistrSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKLABR.P_UPDATE_PHREARN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IN_YEAR", inYear);
			cmd.addParameter("@IN_PICT_CODE", inPictCode);
			cmd.addParameter("@IN_PAYNO", inPayno);
			cmd.addParameter("@IN_PIDM", inPidm);
			cmd.addParameter("@IN_SEQ_NO", inSeqNo);
			cmd.addParameter("@IN_REDISTR_SEQ_NO", inRedistrSeqNo);
				
			cmd.execute();


		}
		
		public static void pUpdatePhrhistAdjBy(NString inYear,NString inPictCode,NNumber inPayno,NNumber inPidm,NNumber inSeqNo,NNumber inAdjBySeqNo,NDate inAdjByDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKLABR.P_UPDATE_PHRHIST_ADJ_BY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IN_YEAR", inYear);
			cmd.addParameter("@IN_PICT_CODE", inPictCode);
			cmd.addParameter("@IN_PAYNO", inPayno);
			cmd.addParameter("@IN_PIDM", inPidm);
			cmd.addParameter("@IN_SEQ_NO", inSeqNo);
			cmd.addParameter("@IN_ADJ_BY_SEQ_NO", inAdjBySeqNo);
			cmd.addParameter("@IN_ADJ_BY_DATE", inAdjByDate);
				
			cmd.execute();


		}
		
		public static void pUpdatePhrhistDisp(NString inYear,NString inPictCode,NNumber inPayno,NNumber inPidm,NNumber inSeqNo,NString inDisposition,NNumber inOriginatorPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKLABR.P_UPDATE_PHRHIST_DISP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IN_YEAR", inYear);
			cmd.addParameter("@IN_PICT_CODE", inPictCode);
			cmd.addParameter("@IN_PAYNO", inPayno);
			cmd.addParameter("@IN_PIDM", inPidm);
			cmd.addParameter("@IN_SEQ_NO", inSeqNo);
			cmd.addParameter("@IN_DISPOSITION", inDisposition);
			cmd.addParameter("@IN_ORIGINATOR_PIDM", inOriginatorPidm);
				
			cmd.execute();


		}
		
		public static void pUpdatePhrjobsDisp(NString inYear,NString inPictCode,NNumber inPayno,NNumber inPidm,NNumber inSeqNo,NString inDisposition) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKLABR.P_UPDATE_PHRJOBS_DISP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IN_YEAR", inYear);
			cmd.addParameter("@IN_PICT_CODE", inPictCode);
			cmd.addParameter("@IN_PAYNO", inPayno);
			cmd.addParameter("@IN_PIDM", inPidm);
			cmd.addParameter("@IN_SEQ_NO", inSeqNo);
			cmd.addParameter("@IN_DISPOSITION", inDisposition);
				
			cmd.execute();


		}
		
		public static void pUpdatePostingDate(NString inYear,NString inPictCode,NNumber inPayno,NNumber inPidm,NNumber inSeqNo,NDate inPostingDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKLABR.P_UPDATE_POSTING_DATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IN_YEAR", inYear);
			cmd.addParameter("@IN_PICT_CODE", inPictCode);
			cmd.addParameter("@IN_PAYNO", inPayno);
			cmd.addParameter("@IN_PIDM", inPidm);
			cmd.addParameter("@IN_SEQ_NO", inSeqNo);
			cmd.addParameter("@IN_POSTING_DATE", inPostingDate);
				
			cmd.execute();


		}
		
		public static void pVoidPayEvent(NString inYear,NString inPictCode,NNumber inPayno,NNumber inPidm,NNumber inSeqNo,NNumber inVoidSeqNo,NNumber inAssocSeqNo,NDate inPostDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKLABR.P_VOID_PAY_EVENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IN_YEAR", inYear);
			cmd.addParameter("@IN_PICT_CODE", inPictCode);
			cmd.addParameter("@IN_PAYNO", inPayno);
			cmd.addParameter("@IN_PIDM", inPidm);
			cmd.addParameter("@IN_SEQ_NO", inSeqNo);
			cmd.addParameter("@IN_VOID_SEQ_NO", inVoidSeqNo);
			cmd.addParameter("@IN_ASSOC_SEQ_NO", inAssocSeqNo);
			cmd.addParameter("@IN_POST_DATE", inPostDate);
				
			cmd.execute();


		}
		
	
	
	
}
