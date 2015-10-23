package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Sakdcsn {
		public static NString fCheckDecsnPrevAccept(NNumber pPidm,NString pTermCode,NNumber pApplNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKDCSN.F_CHECK_DECSN_PREV_ACCEPT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_APPL_NO", pApplNo);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCreateLearner(NNumber pPidm,NString pTermCode,NNumber pApplNo,NNumber pApplPreference,NString pFatalAllowed,NString pSelfservice,NString pCommplanInd,NString pScpcCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKDCSN.F_CREATE_LEARNER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_APPL_NO", pApplNo);
			cmd.addParameter("@P_APPL_PREFERENCE", pApplPreference);
			cmd.addParameter("@P_FATAL_ALLOWED", pFatalAllowed);
			cmd.addParameter("@P_SELFSERVICE", pSelfservice);
			cmd.addParameter("@P_COMMPLAN_IND", pCommplanInd);
			cmd.addParameter("@P_SCPC_CODE", pScpcCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fFindAcceptable(NNumber pPidm,NString pTermCode,NNumber pApplNo,NString pSelfService) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKDCSN.F_FIND_ACCEPTABLE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_APPL_NO", pApplNo);
			cmd.addParameter("@P_SELF_SERVICE", pSelfService);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fFindExistingCurrMatch(NNumber pPidm,NString pTermCode,NNumber pApplNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKDCSN.F_FIND_EXISTING_CURR_MATCH", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_APPL_NO", pApplNo);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fNopushSelfservice(NNumber pPidm,NNumber pSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKDCSN.F_NOPUSH_SELFSERVICE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQNO", pSeqno);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pAutoDecision(NString termIn,NNumber aidmIn,NNumber applnoIn,NString wappIn,NNumber pidmIn,NNumber adapApplnoIn,NString sarwadfApdcCodeIn,Ref<NString> sarwaltLetrCodeOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKDCSN.P_AUTO_DECISION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@AIDM_IN", aidmIn);
			cmd.addParameter("@APPLNO_IN", applnoIn);
			cmd.addParameter("@WAPP_IN", wappIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@ADAP_APPLNO_IN", adapApplnoIn);
			cmd.addParameter("@SARWADF_APDC_CODE_IN", sarwadfApdcCodeIn);
			cmd.addParameter("@SARWALT_LETR_CODE_OUT", NString.class);
				
			cmd.execute();
			sarwaltLetrCodeOut.val = cmd.getParameterValue("@SARWALT_LETR_CODE_OUT", NString.class);


		}
		
		public static void pLearnerAdmitreplace(NNumber pPidm,NString pTermCode,NNumber pLcurSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKDCSN.P_LEARNER_ADMITREPLACE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_LCUR_SEQNO", pLcurSeqno);
				
			cmd.execute();


		}
		
		public static void pProcessDecsn(NNumber pPidm,NString pTermCode,NNumber pApplNo,NString pApdcCode,NString pSelfService,NString pFatalAllowed,NString pCommplanInd,Ref<NString> pMsgTypeOut,Ref<NString> pMsgOut,Ref<NString> pBatchMsgOut,NString pMaintInd,NDate pApdcDate,NString pScpcCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKDCSN.P_PROCESS_DECSN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_APPL_NO", pApplNo);
			cmd.addParameter("@P_APDC_CODE", pApdcCode);
			cmd.addParameter("@P_SELF_SERVICE", pSelfService);
			cmd.addParameter("@P_FATAL_ALLOWED", pFatalAllowed);
			cmd.addParameter("@P_COMMPLAN_IND", pCommplanInd);
			cmd.addParameter("@P_MSG_TYPE_OUT", NString.class);
			cmd.addParameter("@P_MSG_OUT", NString.class);
			cmd.addParameter("@P_BATCH_MSG_OUT", NString.class);
			cmd.addParameter("@P_MAINT_IND", pMaintInd);
			cmd.addParameter("@P_APDC_DATE", pApdcDate);
			cmd.addParameter("@P_SCPC_CODE", pScpcCode);
				
			cmd.execute();
			pMsgTypeOut.val = cmd.getParameterValue("@P_MSG_TYPE_OUT", NString.class);
			pMsgOut.val = cmd.getParameterValue("@P_MSG_OUT", NString.class);
			pBatchMsgOut.val = cmd.getParameterValue("@P_BATCH_MSG_OUT", NString.class);


		}
		
	
	
	
}
