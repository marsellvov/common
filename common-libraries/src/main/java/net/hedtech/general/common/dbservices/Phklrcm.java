package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Phklrcm {
		public static NString fCheckNofinPostingDate(NDate pPostingDt) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKLRCM.F_CHECK_NOFIN_POSTING_DATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_POSTING_DT", pPostingDt);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetUserContext() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKLRCM.F_GET_USER_CONTEXT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGoremalPreferredEmail(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKLRCM.F_GOREMAL_PREFERRED_EMAIL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsPhvecrtLocked(NString pYear,NString pPictCode,NNumber pPayno,NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKLRCM.F_IS_PHVECRT_LOCKED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
			cmd.addParameter("@P_PAYNO", pPayno);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fLaborCommentsInd(NString pYear,NString pPict,NNumber pPayno,NNumber pPidm,NNumber pSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKLRCM.F_LABOR_COMMENTS_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_PICT", pPict);
			cmd.addParameter("@P_PAYNO", pPayno);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQNO", pSeqno);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fPhrhistDisp(NString pYear,NString pPictCode,NNumber pPayno,NNumber pPidm,NNumber pSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKLRCM.F_PHRHIST_DISP", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
			cmd.addParameter("@P_PAYNO", pPayno);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fTransBatchId(NString pYear,NString pPict,NNumber pPayno,NNumber pPidm,NNumber pSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKLRCM.F_TRANS_BATCH_ID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_PICT", pPict);
			cmd.addParameter("@P_PAYNO", pPayno);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQNO", pSeqno);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void pCheckPidmInUse(NNumber pPidm,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKLRCM.P_CHECK_PIDM_IN_USE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pEditPostingDate(NDate pPostingDt,NString pEarningsYear,NString pEarningsPictCode,NNumber pEarningsPayno,NNumber pEarningsPidm,NNumber pEarningsSeqNo,NString pNewLaborDistCoas,NDate pEarningsEffDate,Ref<NDate> pCalculatedPostingDtOut,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKLRCM.P_EDIT_POSTING_DATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_POSTING_DT", pPostingDt);
			cmd.addParameter("@P_EARNINGS_YEAR", pEarningsYear);
			cmd.addParameter("@P_EARNINGS_PICT_CODE", pEarningsPictCode);
			cmd.addParameter("@P_EARNINGS_PAYNO", pEarningsPayno);
			cmd.addParameter("@P_EARNINGS_PIDM", pEarningsPidm);
			cmd.addParameter("@P_EARNINGS_SEQ_NO", pEarningsSeqNo);
			cmd.addParameter("@P_NEW_LABOR_DIST_COAS", pNewLaborDistCoas);
			cmd.addParameter("@P_EARNINGS_EFF_DATE", pEarningsEffDate);
			cmd.addParameter("@P_CALCULATED_POSTING_DT_OUT", NDate.class);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pCalculatedPostingDtOut.val = cmd.getParameterValue("@P_CALCULATED_POSTING_DT_OUT", NDate.class);
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pSetUserContext(NString pUserName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKLRCM.P_SET_USER_CONTEXT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_USER_NAME", pUserName);
				
			cmd.execute();


		}
		
		public static void pUpdatePhrhistStatus(NString pYear,NString pPictCode,NNumber pPayno,NNumber pPidm,NNumber pSeqNo,NString pDisp,NString pRedistributionStatus) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKLRCM.P_UPDATE_PHRHIST_STATUS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
			cmd.addParameter("@P_PAYNO", pPayno);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_DISP", pDisp);
			cmd.addParameter("@P_REDISTRIBUTION_STATUS", pRedistributionStatus);
				
			cmd.execute();


		}
		
	
	
	
}
