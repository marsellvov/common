package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Rrkareq {
		public static NString fCreateLoanApp(NString pAidyCode,NString pFundCode,NString pTreqCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RRKAREQ.F_CREATE_LOAN_APP", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_TREQ_CODE", pTreqCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pDeleteFundRequirements(NNumber pPidm,NString pAidyCode,NString pFundCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RRKAREQ.P_DELETE_FUND_REQUIREMENTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
				
			cmd.execute();


		}
		
		public static void pFinalizeNoUpdate(NNumber pPidm,NString pAidyCode,NString pTgrpCode,Ref<NString> pTrkLtrIndInout,Ref<NDate> pAllReqCompDateInout,Ref<NDate> pMemoReqCompDateInout,Ref<NDate> pPckgReqCompDateInout,Ref<NDate> pDisbReqCompDateInout,Ref<NDate> pApplRcvdDateInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RRKAREQ.P_FINALIZE_NO_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_TGRP_CODE", pTgrpCode);
			cmd.addParameter("@P_TRK_LTR_IND_INOUT", pTrkLtrIndInout, true);
			cmd.addParameter("@P_ALL_REQ_COMP_DATE_INOUT", pAllReqCompDateInout, true);
			cmd.addParameter("@P_MEMO_REQ_COMP_DATE_INOUT", pMemoReqCompDateInout, true);
			cmd.addParameter("@P_PCKG_REQ_COMP_DATE_INOUT", pPckgReqCompDateInout, true);
			cmd.addParameter("@P_DISB_REQ_COMP_DATE_INOUT", pDisbReqCompDateInout, true);
			cmd.addParameter("@P_APPL_RCVD_DATE_INOUT", pApplRcvdDateInout, true);
				
			cmd.execute();
			pTrkLtrIndInout.val = cmd.getParameterValue("@P_TRK_LTR_IND_INOUT", NString.class);
			pAllReqCompDateInout.val = cmd.getParameterValue("@P_ALL_REQ_COMP_DATE_INOUT", NDate.class);
			pMemoReqCompDateInout.val = cmd.getParameterValue("@P_MEMO_REQ_COMP_DATE_INOUT", NDate.class);
			pPckgReqCompDateInout.val = cmd.getParameterValue("@P_PCKG_REQ_COMP_DATE_INOUT", NDate.class);
			pDisbReqCompDateInout.val = cmd.getParameterValue("@P_DISB_REQ_COMP_DATE_INOUT", NDate.class);
			pApplRcvdDateInout.val = cmd.getParameterValue("@P_APPL_RCVD_DATE_INOUT", NDate.class);


		}
		
		public static void pFinalizeRequirements(NNumber pPidm,NString pAidyCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RRKAREQ.P_FINALIZE_REQUIREMENTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
				
			cmd.execute();


		}
		
		public static void pGetReqt(NString pAidyCode,NNumber pPidm,NString pTreqCode,NString pSbgiTypeInd,NString pSbgiCode,Ref<NString> pAidyCodeInout,Ref<NDate> pStatDateInout,Ref<NString> pSatIndInout,Ref<NDate> pEstDateInout,Ref<NString> pTrstCodeInout,Ref<NString> pSysIndInout,Ref<NString> pTreqDescInout,Ref<NString> pParMsgInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RRKAREQ.P_GET_REQT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TREQ_CODE", pTreqCode);
			cmd.addParameter("@P_SBGI_TYPE_IND", pSbgiTypeInd);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_AIDY_CODE_INOUT", pAidyCodeInout, true);
			cmd.addParameter("@P_STAT_DATE_INOUT", pStatDateInout, true);
			cmd.addParameter("@P_SAT_IND_INOUT", pSatIndInout, true);
			cmd.addParameter("@P_EST_DATE_INOUT", pEstDateInout, true);
			cmd.addParameter("@P_TRST_CODE_INOUT", pTrstCodeInout, true);
			cmd.addParameter("@P_SYS_IND_INOUT", pSysIndInout, true);
			cmd.addParameter("@P_TREQ_DESC_INOUT", pTreqDescInout, true);
			cmd.addParameter("@P_PAR_MSG_INOUT", pParMsgInout, true);
				
			cmd.execute();
			pAidyCodeInout.val = cmd.getParameterValue("@P_AIDY_CODE_INOUT", NString.class);
			pStatDateInout.val = cmd.getParameterValue("@P_STAT_DATE_INOUT", NDate.class);
			pSatIndInout.val = cmd.getParameterValue("@P_SAT_IND_INOUT", NString.class);
			pEstDateInout.val = cmd.getParameterValue("@P_EST_DATE_INOUT", NDate.class);
			pTrstCodeInout.val = cmd.getParameterValue("@P_TRST_CODE_INOUT", NString.class);
			pSysIndInout.val = cmd.getParameterValue("@P_SYS_IND_INOUT", NString.class);
			pTreqDescInout.val = cmd.getParameterValue("@P_TREQ_DESC_INOUT", NString.class);
			pParMsgInout.val = cmd.getParameterValue("@P_PAR_MSG_INOUT", NString.class);


		}
		
		public static void pGetRrrareqFund(NString pAidyCode,NNumber pPidm,NString pFundCode,NString pTreqCode,Ref<NDate> pStatDateInout,Ref<NString> pSatIndInout,Ref<NDate> pEstDateInout,Ref<NString> pTrstCodeInout,Ref<NString> pSysIndInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RRKAREQ.P_GET_RRRAREQ_FUND", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_TREQ_CODE", pTreqCode);
			cmd.addParameter("@P_STAT_DATE_INOUT", pStatDateInout, true);
			cmd.addParameter("@P_SAT_IND_INOUT", pSatIndInout, true);
			cmd.addParameter("@P_EST_DATE_INOUT", pEstDateInout, true);
			cmd.addParameter("@P_TRST_CODE_INOUT", pTrstCodeInout, true);
			cmd.addParameter("@P_SYS_IND_INOUT", pSysIndInout, true);
				
			cmd.execute();
			pStatDateInout.val = cmd.getParameterValue("@P_STAT_DATE_INOUT", NDate.class);
			pSatIndInout.val = cmd.getParameterValue("@P_SAT_IND_INOUT", NString.class);
			pEstDateInout.val = cmd.getParameterValue("@P_EST_DATE_INOUT", NDate.class);
			pTrstCodeInout.val = cmd.getParameterValue("@P_TRST_CODE_INOUT", NString.class);
			pSysIndInout.val = cmd.getParameterValue("@P_SYS_IND_INOUT", NString.class);


		}
		
		public static void pGetRrrareqSbgi(NString pAidyCode,NNumber pPidm,NString pTreqCode,NString pSbgiTypeInd,NString pSbgiCode,Ref<NDate> pStatDateInout,Ref<NString> pSatIndInout,Ref<NDate> pEstDateInout,Ref<NString> pTrstCodeInout,Ref<NString> pSysIndInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RRKAREQ.P_GET_RRRAREQ_SBGI", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TREQ_CODE", pTreqCode);
			cmd.addParameter("@P_SBGI_TYPE_IND", pSbgiTypeInd);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_STAT_DATE_INOUT", pStatDateInout, true);
			cmd.addParameter("@P_SAT_IND_INOUT", pSatIndInout, true);
			cmd.addParameter("@P_EST_DATE_INOUT", pEstDateInout, true);
			cmd.addParameter("@P_TRST_CODE_INOUT", pTrstCodeInout, true);
			cmd.addParameter("@P_SYS_IND_INOUT", pSysIndInout, true);
				
			cmd.execute();
			pStatDateInout.val = cmd.getParameterValue("@P_STAT_DATE_INOUT", NDate.class);
			pSatIndInout.val = cmd.getParameterValue("@P_SAT_IND_INOUT", NString.class);
			pEstDateInout.val = cmd.getParameterValue("@P_EST_DATE_INOUT", NDate.class);
			pTrstCodeInout.val = cmd.getParameterValue("@P_TRST_CODE_INOUT", NString.class);
			pSysIndInout.val = cmd.getParameterValue("@P_SYS_IND_INOUT", NString.class);


		}
		
		public static void pGetRrrareqTreq(NString pAidyCode,NNumber pPidm,NString pTreqCode,Ref<NString> pAidyCodeInout,Ref<NNumber> pPidmInout,Ref<NDate> pStatDateInout,Ref<NString> pSatIndInout,Ref<NDate> pEstDateInout,Ref<NString> pTrstCodeInout,Ref<NString> pSysIndInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RRKAREQ.P_GET_RRRAREQ_TREQ", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TREQ_CODE", pTreqCode);
			cmd.addParameter("@P_AIDY_CODE_INOUT", pAidyCodeInout, true);
			cmd.addParameter("@P_PIDM_INOUT", pPidmInout, true);
			cmd.addParameter("@P_STAT_DATE_INOUT", pStatDateInout, true);
			cmd.addParameter("@P_SAT_IND_INOUT", pSatIndInout, true);
			cmd.addParameter("@P_EST_DATE_INOUT", pEstDateInout, true);
			cmd.addParameter("@P_TRST_CODE_INOUT", pTrstCodeInout, true);
			cmd.addParameter("@P_SYS_IND_INOUT", pSysIndInout, true);
				
			cmd.execute();
			pAidyCodeInout.val = cmd.getParameterValue("@P_AIDY_CODE_INOUT", NString.class);
			pPidmInout.val = cmd.getParameterValue("@P_PIDM_INOUT", NNumber.class);
			pStatDateInout.val = cmd.getParameterValue("@P_STAT_DATE_INOUT", NDate.class);
			pSatIndInout.val = cmd.getParameterValue("@P_SAT_IND_INOUT", NString.class);
			pEstDateInout.val = cmd.getParameterValue("@P_EST_DATE_INOUT", NDate.class);
			pTrstCodeInout.val = cmd.getParameterValue("@P_TRST_CODE_INOUT", NString.class);
			pSysIndInout.val = cmd.getParameterValue("@P_SYS_IND_INOUT", NString.class);


		}
		
		public static void pMaintainFundRequirements(NNumber pPidm,NString pAidyCode,NString pFundCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RRKAREQ.P_MAINTAIN_FUND_REQUIREMENTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
				
			cmd.execute();


		}
		
		public static void pMaintainGroup(NNumber pPidm,NString pAidyCode,NString pTgrpCode,Ref<NString> pTrkLtrIndInout,Ref<NDate> pAllReqCompDateInout,Ref<NDate> pMemoReqCompDateInout,Ref<NDate> pPckgReqCompDateInout,Ref<NDate> pDisbReqCompDateInout,Ref<NDate> pApplRcvdDateInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RRKAREQ.P_MAINTAIN_GROUP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_TGRP_CODE", pTgrpCode);
			cmd.addParameter("@P_TRK_LTR_IND_INOUT", pTrkLtrIndInout, true);
			cmd.addParameter("@P_ALL_REQ_COMP_DATE_INOUT", pAllReqCompDateInout, true);
			cmd.addParameter("@P_MEMO_REQ_COMP_DATE_INOUT", pMemoReqCompDateInout, true);
			cmd.addParameter("@P_PCKG_REQ_COMP_DATE_INOUT", pPckgReqCompDateInout, true);
			cmd.addParameter("@P_DISB_REQ_COMP_DATE_INOUT", pDisbReqCompDateInout, true);
			cmd.addParameter("@P_APPL_RCVD_DATE_INOUT", pApplRcvdDateInout, true);
				
			cmd.execute();
			pTrkLtrIndInout.val = cmd.getParameterValue("@P_TRK_LTR_IND_INOUT", NString.class);
			pAllReqCompDateInout.val = cmd.getParameterValue("@P_ALL_REQ_COMP_DATE_INOUT", NDate.class);
			pMemoReqCompDateInout.val = cmd.getParameterValue("@P_MEMO_REQ_COMP_DATE_INOUT", NDate.class);
			pPckgReqCompDateInout.val = cmd.getParameterValue("@P_PCKG_REQ_COMP_DATE_INOUT", NDate.class);
			pDisbReqCompDateInout.val = cmd.getParameterValue("@P_DISB_REQ_COMP_DATE_INOUT", NDate.class);
			pApplRcvdDateInout.val = cmd.getParameterValue("@P_APPL_RCVD_DATE_INOUT", NDate.class);


		}
		
		public static void pMaintainTrkLtrInd(NNumber pPidm,NString pAidyCode,NString pTrkLtrInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RRKAREQ.P_MAINTAIN_TRK_LTR_IND", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_TRK_LTR_IND", pTrkLtrInd);
				
			cmd.execute();


		}
		
		public static void pPopRrrareqTrkLtrInd(NNumber pPidm,NString pAidyCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RRKAREQ.P_POP_RRRAREQ_TRK_LTR_IND", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
				
			cmd.execute();


		}
		
		public static void pPostTreqInfc(NNumber pPidm,NString pAidyCode,NString pInfcCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RRKAREQ.P_POST_TREQ_INFC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_INFC_CODE", pInfcCode);
				
			cmd.execute();


		}
		
	
	
	
}
