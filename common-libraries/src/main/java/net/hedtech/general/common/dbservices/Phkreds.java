package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Phkreds {
		public static NNumber fCalcLaborAmount(NString pYear,NString pPictCode,NNumber pPayno,NString pGenInd,NNumber pPidm,NNumber pSeqNo,NString pPosn,NString pSuff,NDate pEffectiveDate,NString pEarnCode,NString pShift,NNumber pElbdId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKREDS.F_CALC_LABOR_AMOUNT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
			cmd.addParameter("@P_PAYNO", pPayno);
			cmd.addParameter("@P_GEN_IND", pGenInd);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_SHIFT", pShift);
			cmd.addParameter("@P_ELBD_ID", pElbdId);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fGetLaborApply(NString pYear,NString pPict,NNumber pPayno,NNumber pPidm,NNumber pSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKREDS.F_GET_LABOR_APPLY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_PICT", pPict);
			cmd.addParameter("@P_PAYNO", pPayno);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQNO", pSeqno);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetLaborDelUpd(NString pYear,NString pPict,NNumber pPayno,NNumber pPidm,NNumber pSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKREDS.F_GET_LABOR_DEL_UPD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_PICT", pPict);
			cmd.addParameter("@P_PAYNO", pPayno);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQNO", pSeqno);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetLaborErase(NString pYear,NString pPict,NNumber pPayno,NNumber pPidm,NNumber pSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKREDS.F_GET_LABOR_ERASE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_PICT", pPict);
			cmd.addParameter("@P_PAYNO", pPayno);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQNO", pSeqno);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetLaborSubmit(NString pYear,NString pPict,NNumber pPayno,NNumber pPidm,NNumber pSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKREDS.F_GET_LABOR_SUBMIT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_PICT", pPict);
			cmd.addParameter("@P_PAYNO", pPayno);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQNO", pSeqno);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryPayEvents(NString pId,NString pLastName,NString pFirstName,NString pPictCode,NString pFromYear,NString pToYear,NNumber pFromPayno,NNumber pToPayno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKREDS.F_QUERY_PAY_EVENTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_FIRST_NAME", pFirstName);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
			cmd.addParameter("@P_FROM_YEAR", pFromYear);
			cmd.addParameter("@P_TO_YEAR", pToYear);
			cmd.addParameter("@P_FROM_PAYNO", pFromPayno);
			cmd.addParameter("@P_TO_PAYNO", pToPayno);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryRoutingQueue(NString pId,NString pLastName,NString pFirstName,NString pPictCode,NString pFromYear,NString pToYear,NNumber pFromPayno,NNumber pToPayno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKREDS.F_QUERY_ROUTING_QUEUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_FIRST_NAME", pFirstName);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
			cmd.addParameter("@P_FROM_YEAR", pFromYear);
			cmd.addParameter("@P_TO_YEAR", pToYear);
			cmd.addParameter("@P_FROM_PAYNO", pFromPayno);
			cmd.addParameter("@P_TO_PAYNO", pToPayno);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pApplyLaborRedistributions(NString pComments,NString pDataOrigin,NNumber pCommentsUserPidm,Ref<NInteger> pRedistCount) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKREDS.P_APPLY_LABOR_REDISTRIBUTIONS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_COMMENTS", pComments);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_COMMENTS_USER_PIDM", pCommentsUserPidm);
			cmd.addParameter("@P_REDIST_COUNT", NInteger.class);
				
			cmd.execute();
			pRedistCount.val = cmd.getParameterValue("@P_REDIST_COUNT", NInteger.class);


		}
		
		public static void pChangeAllRedistributions(NString pYear,NString pPictCode,NNumber pPayno,NNumber pPidm,NNumber pSeqNo,NString pShift,NString pEarnCode,NDate pEffectiveDate,NString pPosn,NString pSuff,NString pGenInd,NDate pPostingDate,Ref<NString> pWarningMsgOut,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKREDS.P_CHANGE_ALL_REDISTRIBUTIONS", DbManager.getDataBaseFactory());
			
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
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pWarningMsgOut.val = cmd.getParameterValue("@P_WARNING_MSG_OUT", NString.class);
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pCreatePhrreds(NString pYear,NString pPictCode,NNumber pPayno,NString pCoasCodeTs,NString pOrgnCodeTs,NString pTsRosterInd,NNumber pPidm,NNumber pSeqNo,NString pPosn,NString pSuff,NDate pEffectiveDate,NString pEarnCode,NString pShift,NString pGenInd,NString pCoasCode,NString pAcciCode,NString pFundCode,NString pOrgnCode,NString pAcctCode,NString pProgCode,NString pActvCode,NString pLocnCode,NString pProjCode,NString pCtypCode,NString pAcctCodeExternal,NNumber pPercent,NNumber pHrs,NString pEncdNum,NNumber pEncdSeqNum,NNumber pRedistributionAmt,NDate pPostingOverrideDate,NNumber pKeyId,Ref<NNumber> pIdOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKREDS.P_CREATE_PHRREDS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
			cmd.addParameter("@P_PAYNO", pPayno);
			cmd.addParameter("@P_COAS_CODE_TS", pCoasCodeTs);
			cmd.addParameter("@P_ORGN_CODE_TS", pOrgnCodeTs);
			cmd.addParameter("@P_TS_ROSTER_IND", pTsRosterInd);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_SHIFT", pShift);
			cmd.addParameter("@P_GEN_IND", pGenInd);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_ACCI_CODE", pAcciCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_ORGN_CODE", pOrgnCode);
			cmd.addParameter("@P_ACCT_CODE", pAcctCode);
			cmd.addParameter("@P_PROG_CODE", pProgCode);
			cmd.addParameter("@P_ACTV_CODE", pActvCode);
			cmd.addParameter("@P_LOCN_CODE", pLocnCode);
			cmd.addParameter("@P_PROJ_CODE", pProjCode);
			cmd.addParameter("@P_CTYP_CODE", pCtypCode);
			cmd.addParameter("@P_ACCT_CODE_EXTERNAL", pAcctCodeExternal);
			cmd.addParameter("@P_PERCENT", pPercent);
			cmd.addParameter("@P_HRS", pHrs);
			cmd.addParameter("@P_ENCD_NUM", pEncdNum);
			cmd.addParameter("@P_ENCD_SEQ_NUM", pEncdSeqNum);
			cmd.addParameter("@P_REDISTRIBUTION_AMT", pRedistributionAmt);
			cmd.addParameter("@P_POSTING_OVERRIDE_DATE", pPostingOverrideDate);
			cmd.addParameter("@P_KEY_ID", pKeyId);
			cmd.addParameter("@P_ID_OUT", NNumber.class);
				
			cmd.execute();
			pIdOut.val = cmd.getParameterValue("@P_ID_OUT", NNumber.class);


		}
		
		public static void pDeletePhrreds(NNumber pId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKREDS.P_DELETE_PHRREDS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
				
			cmd.execute();


		}
		
		public static void pDeletePhrreds(NString deleteSelection) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKREDS.P_DELETE_PHRREDS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DELETE_SELECTION", deleteSelection);
				
			cmd.execute();


		}
		
		public static void pEraseRedistributions(NString pSource,Ref<NInteger> pEraseCount) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKREDS.P_ERASE_REDISTRIBUTIONS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SOURCE", pSource);
			cmd.addParameter("@P_ERASE_COUNT", NInteger.class);
				
			cmd.execute();
			pEraseCount.val = cmd.getParameterValue("@P_ERASE_COUNT", NInteger.class);


		}
		
		public static void pGetInitiatorLaborActions(NString pYear,NString pPict,NNumber pPayno,NNumber pPidm,NNumber pSeqno,Ref<NString> pDelUpd,Ref<NString> pErase,Ref<NString> pApply,Ref<NString> pSubmit,Ref<NString> pComment) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKREDS.P_GET_INITIATOR_LABOR_ACTIONS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_PICT", pPict);
			cmd.addParameter("@P_PAYNO", pPayno);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_DEL_UPD", NString.class);
			cmd.addParameter("@P_ERASE", NString.class);
			cmd.addParameter("@P_APPLY", NString.class);
			cmd.addParameter("@P_SUBMIT", NString.class);
			cmd.addParameter("@P_COMMENT", NString.class);
				
			cmd.execute();
			pDelUpd.val = cmd.getParameterValue("@P_DEL_UPD", NString.class);
			pErase.val = cmd.getParameterValue("@P_ERASE", NString.class);
			pApply.val = cmd.getParameterValue("@P_APPLY", NString.class);
			pSubmit.val = cmd.getParameterValue("@P_SUBMIT", NString.class);
			pComment.val = cmd.getParameterValue("@P_COMMENT", NString.class);


		}
		
		public static void pPopulatePhrreds(NString pChangeAllInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKREDS.P_POPULATE_PHRREDS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CHANGE_ALL_IND", pChangeAllInd);
				
			cmd.execute();


		}
		
		public static void pSavePayEvents(NString pYear,NString pPictCode,NNumber pPayno,NNumber pPidm,NNumber pSeqNo,NString pPosn,NString pSuff,NDate pEffdate,NString pEarncode,NString pCoa,NString pAcci,NString pFund,NString pOrgn,NString pAcct,NString pProgram,NString pActivity,NString pLocation,NString pProject,NString pCost) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKREDS.P_SAVE_PAY_EVENTS", DbManager.getDataBaseFactory());
			
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
				
			cmd.execute();


		}
		
		public static void pSearchAndReplaceFoapal(NString pSearchCoasCode,NString pSearchAcciCode,NString pSearchFundCode,NString pSearchOrgnCode,NString pSearchAcctCode,NString pSearchProgCode,NString pSearchActvCode,NString pSearchLocnCode,NString pSearchProjCode,NString pSearchCtypCode,NString pSearchAcctCodeExternal,NString pReplaceAcciCode,NString pReplaceFundCode,NString pReplaceOrgnCode,NString pReplaceAcctCode,NString pReplaceProgCode,NString pReplaceActvCode,NString pReplaceLocnCode,NString pReplaceProjCode,NString pReplaceCtypCode,NString pReplaceAcctCodeExternal,NDate pPostingDate,Ref<NString> pWarningMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKREDS.P_SEARCH_AND_REPLACE_FOAPAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SEARCH_COAS_CODE", pSearchCoasCode);
			cmd.addParameter("@P_SEARCH_ACCI_CODE", pSearchAcciCode);
			cmd.addParameter("@P_SEARCH_FUND_CODE", pSearchFundCode);
			cmd.addParameter("@P_SEARCH_ORGN_CODE", pSearchOrgnCode);
			cmd.addParameter("@P_SEARCH_ACCT_CODE", pSearchAcctCode);
			cmd.addParameter("@P_SEARCH_PROG_CODE", pSearchProgCode);
			cmd.addParameter("@P_SEARCH_ACTV_CODE", pSearchActvCode);
			cmd.addParameter("@P_SEARCH_LOCN_CODE", pSearchLocnCode);
			cmd.addParameter("@P_SEARCH_PROJ_CODE", pSearchProjCode);
			cmd.addParameter("@P_SEARCH_CTYP_CODE", pSearchCtypCode);
			cmd.addParameter("@P_SEARCH_ACCT_CODE_EXTERNAL", pSearchAcctCodeExternal);
			cmd.addParameter("@P_REPLACE_ACCI_CODE", pReplaceAcciCode);
			cmd.addParameter("@P_REPLACE_FUND_CODE", pReplaceFundCode);
			cmd.addParameter("@P_REPLACE_ORGN_CODE", pReplaceOrgnCode);
			cmd.addParameter("@P_REPLACE_ACCT_CODE", pReplaceAcctCode);
			cmd.addParameter("@P_REPLACE_PROG_CODE", pReplaceProgCode);
			cmd.addParameter("@P_REPLACE_ACTV_CODE", pReplaceActvCode);
			cmd.addParameter("@P_REPLACE_LOCN_CODE", pReplaceLocnCode);
			cmd.addParameter("@P_REPLACE_PROJ_CODE", pReplaceProjCode);
			cmd.addParameter("@P_REPLACE_CTYP_CODE", pReplaceCtypCode);
			cmd.addParameter("@P_REPLACE_ACCT_CODE_EXTERNAL", pReplaceAcctCodeExternal);
			cmd.addParameter("@P_POSTING_DATE", pPostingDate);
			cmd.addParameter("@P_WARNING_MSG_OUT", NString.class);
				
			cmd.execute();
			pWarningMsgOut.val = cmd.getParameterValue("@P_WARNING_MSG_OUT", NString.class);


		}
		
		public static void pSubmitRedistributions(NNumber pOriginatorPidm,NString pSource,NString pComments,NString pDataOrigin,NNumber pCommentsUserPidm,Ref<NInteger> pSubmitCount,Ref<NString> pMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKREDS.P_SUBMIT_REDISTRIBUTIONS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ORIGINATOR_PIDM", pOriginatorPidm);
			cmd.addParameter("@P_SOURCE", pSource);
			cmd.addParameter("@P_COMMENTS", pComments);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_COMMENTS_USER_PIDM", pCommentsUserPidm);
			cmd.addParameter("@P_SUBMIT_COUNT", NInteger.class);
			cmd.addParameter("@P_MSG_OUT", NString.class);
				
			cmd.execute();
			pSubmitCount.val = cmd.getParameterValue("@P_SUBMIT_COUNT", NInteger.class);
			pMsgOut.val = cmd.getParameterValue("@P_MSG_OUT", NString.class);


		}
		
		public static void pUpdatePhrreds(NNumber pId,NString pAcciCode,NString pFundCode,NString pOrgnCode,NString pAcctCode,NString pProgCode,NString pActvCode,NString pLocnCode,NString pProjCode,NString pCtypCode,NNumber pPercent,NNumber pHrs,NNumber pRedistributionAmt,NDate pPostingOverrideDate,NNumber pKeyId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKREDS.P_UPDATE_PHRREDS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_ACCI_CODE", pAcciCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_ORGN_CODE", pOrgnCode);
			cmd.addParameter("@P_ACCT_CODE", pAcctCode);
			cmd.addParameter("@P_PROG_CODE", pProgCode);
			cmd.addParameter("@P_ACTV_CODE", pActvCode);
			cmd.addParameter("@P_LOCN_CODE", pLocnCode);
			cmd.addParameter("@P_PROJ_CODE", pProjCode);
			cmd.addParameter("@P_CTYP_CODE", pCtypCode);
			cmd.addParameter("@P_PERCENT", pPercent);
			cmd.addParameter("@P_HRS", pHrs);
			cmd.addParameter("@P_REDISTRIBUTION_AMT", pRedistributionAmt);
			cmd.addParameter("@P_POSTING_OVERRIDE_DATE", pPostingOverrideDate);
			cmd.addParameter("@P_KEY_ID", pKeyId);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="PayeventRecRow", dataSourceName="PAYEVENT_REC")
	public static class PayeventRecRow
	{
		@DbRecordField(dataSourceName="R_YEAR")
		public NString RYear;
		@DbRecordField(dataSourceName="R_PICT_CODE")
		public NString RPictCode;
		@DbRecordField(dataSourceName="R_PAYNO")
		public NNumber RPayno;
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_SEQ_NO")
		public NNumber RSeqNo;
		@DbRecordField(dataSourceName="R_ADJ_BY_SEQ_NO")
		public NString RAdjBySeqNo;
		@DbRecordField(dataSourceName="R_DISP")
		public NString RDisp;
		@DbRecordField(dataSourceName="R_TYPE_IND")
		public NString RTypeInd;
		@DbRecordField(dataSourceName="R_LAST_NAME")
		public NString RLastName;
		@DbRecordField(dataSourceName="R_FIRST_NAME")
		public NString RFirstName;
		@DbRecordField(dataSourceName="R_ID")
		public NString RId;
		@DbRecordField(dataSourceName="R_INTERNAL_ID")
		public UnknownTypes.Rowid RInternalId;
		@DbRecordField(dataSourceName="R_EVENT_START_DATE")
		public NDate REventStartDate;
		@DbRecordField(dataSourceName="R_EVENT_END_DATE")
		public NDate REventEndDate;
		@DbRecordField(dataSourceName="R_EFFORT_LOCK")
		public NString REffortLock;
		@DbRecordField(dataSourceName="R_ACCESS_IND")
		public NString RAccessInd;
		@DbRecordField(dataSourceName="R_COMMENTS_IND")
		public NString RCommentsInd;
		@DbRecordField(dataSourceName="R_TRANS_BATCH_ID")
		public NNumber RTransBatchId;
		@DbRecordField(dataSourceName="R_ADJS_SEQ_NO")
		public NNumber RAdjsSeqNo;
		@DbRecordField(dataSourceName="R_ORIG_COMMENTS_IND")
		public NString ROrigCommentsInd;
	}

	
	@DbRecordType(id="RoutingQueueRecRow", dataSourceName="ROUTING_QUEUE_REC")
	public static class RoutingQueueRecRow
	{
		@DbRecordField(dataSourceName="R_ID")
		public NNumber RId;
		@DbRecordField(dataSourceName="R_YEAR")
		public NString RYear;
		@DbRecordField(dataSourceName="R_PICT_CODE")
		public NString RPictCode;
		@DbRecordField(dataSourceName="R_PAYNO")
		public NNumber RPayno;
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_SEQ_NO")
		public NNumber RSeqNo;
		@DbRecordField(dataSourceName="R_MEMBER_PIDM")
		public NNumber RMemberPidm;
		@DbRecordField(dataSourceName="R_MEMBER_ACTION")
		public NString RMemberAction;
		@DbRecordField(dataSourceName="R_APPROVER_SEQNO")
		public NNumber RApproverSeqno;
		@DbRecordField(dataSourceName="R_USER_SUPERUSER_IND")
		public NString RUserSuperuserInd;
		@DbRecordField(dataSourceName="R_COAS_CODE")
		public NString RCoasCode;
		@DbRecordField(dataSourceName="R_FUND_CODE")
		public NString RFundCode;
		@DbRecordField(dataSourceName="R_ORGN_CODE")
		public NString ROrgnCode;
		@DbRecordField(dataSourceName="R_GRNT_CODE")
		public NString RGrntCode;
		@DbRecordField(dataSourceName="R_USER_PIDM")
		public NNumber RUserPidm;
		@DbRecordField(dataSourceName="R_USER_ACTION")
		public NString RUserAction;
		@DbRecordField(dataSourceName="R_USER_ACTION_DATE")
		public NDate RUserActionDate;
		@DbRecordField(dataSourceName="R_USER_PROXY_FOR_PIDM")
		public NNumber RUserProxyForPidm;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_ACTIVITY_DATE")
		public NDate RActivityDate;
		@DbRecordField(dataSourceName="R_QPRT_CODE")
		public NString RQprtCode;
		@DbRecordField(dataSourceName="R_SPRIDEN_FIRST_NAME")
		public NString RSpridenFirstName;
		@DbRecordField(dataSourceName="R_SPRIDEN_LAST_NAME")
		public NString RSpridenLastName;
		@DbRecordField(dataSourceName="R_SPRIDEN_ID")
		public NString RSpridenId;
		@DbRecordField(dataSourceName="R_PHRHIST_ADJS_SEQ_NO")
		public NNumber RPhrhistAdjsSeqNo;
		@DbRecordField(dataSourceName="R_PTRCALN_START_DATE")
		public NDate RPtrcalnStartDate;
		@DbRecordField(dataSourceName="R_PTRCALN_END_DATE")
		public NDate RPtrcalnEndDate;
		@DbRecordField(dataSourceName="R_LABOR_APPROVE_IND")
		public NString RLaborApproveInd;
		@DbRecordField(dataSourceName="R_LABOR_FYI_IND")
		public NString RLaborFyiInd;
		@DbRecordField(dataSourceName="R_LABOR_RETURN_IND")
		public NString RLaborReturnInd;
	}

	
	
}
