package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Nokmupd {
		public static void pCreateIdent(NString pSource,NNumber pTransNo,NString pApty,Ref<NNumber> pPidm,Ref<NString> pId,Ref<NString> pMsg,Ref<NString> pMsgType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKMUPD.P_CREATE_IDENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SOURCE", pSource);
			cmd.addParameter("@P_TRANS_NO", pTransNo);
			cmd.addParameter("@P_APTY", pApty);
			cmd.addParameter("@P_PIDM", pPidm, true);
			cmd.addParameter("@P_ID", pId, true);
			cmd.addParameter("@P_MSG", pMsg, true);
			cmd.addParameter("@P_MSG_TYPE", pMsgType, true);
				
			cmd.execute();
			pPidm.val = cmd.getParameterValue("@P_PIDM", NNumber.class);
			pId.val = cmd.getParameterValue("@P_ID", NString.class);
			pMsg.val = cmd.getParameterValue("@P_MSG", NString.class);
			pMsgType.val = cmd.getParameterValue("@P_MSG_TYPE", NString.class);


		}
		
		public static void pProcessGorpracRec(NString pAptyCode,Ref<NString> pMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKMUPD.P_PROCESS_GORPRAC_REC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_APTY_CODE", pAptyCode);
			cmd.addParameter("@P_MSG", pMsg, true);
				
			cmd.execute();
			pMsg.val = cmd.getParameterValue("@P_MSG", NString.class);


		}
		
		public static void pProcessNbrbjobRec(NString parOldAccrueInd,NNumber parTransNo,Ref<NString> parMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKMUPD.P_PROCESS_NBRBJOB_REC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PAR_OLD_ACCRUE_IND", parOldAccrueInd);
			cmd.addParameter("@PAR_TRANS_NO", parTransNo);
			cmd.addParameter("@PAR_MSG", parMsg, true);
				
			cmd.execute();
			parMsg.val = cmd.getParameterValue("@PAR_MSG", NString.class);


		}
		
		public static void pProcessNbrearnRecs(NNumber parTransNo,NString parAptyCode,Ref<NString> parMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKMUPD.P_PROCESS_NBREARN_RECS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PAR_TRANS_NO", parTransNo);
			cmd.addParameter("@PAR_APTY_CODE", parAptyCode);
			cmd.addParameter("@PAR_MSG", parMsg, true);
				
			cmd.execute();
			parMsg.val = cmd.getParameterValue("@PAR_MSG", NString.class);


		}
		
		public static void pProcessNbrjlbdRecs(NNumber parTransNo,NString parAptyCode,Ref<NString> parMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKMUPD.P_PROCESS_NBRJLBD_RECS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PAR_TRANS_NO", parTransNo);
			cmd.addParameter("@PAR_APTY_CODE", parAptyCode);
			cmd.addParameter("@PAR_MSG", parMsg, true);
				
			cmd.execute();
			parMsg.val = cmd.getParameterValue("@PAR_MSG", NString.class);


		}
		
		public static void pProcessNbrjobsRecs(Ref<NString> parMsg,NNumber parTransNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKMUPD.P_PROCESS_NBRJOBS_RECS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PAR_MSG", parMsg, true);
			cmd.addParameter("@PAR_TRANS_NO", parTransNo);
				
			cmd.execute();
			parMsg.val = cmd.getParameterValue("@PAR_MSG", NString.class);


		}
		
		public static void pProcessPebemplRec(Ref<NString> parMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKMUPD.P_PROCESS_PEBEMPL_REC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PAR_MSG", parMsg, true);
				
			cmd.execute();
			parMsg.val = cmd.getParameterValue("@PAR_MSG", NString.class);


		}
		
		public static void pProcessSpbpersRec(Ref<NString> parMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKMUPD.P_PROCESS_SPBPERS_REC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PAR_MSG", parMsg, true);
				
			cmd.execute();
			parMsg.val = cmd.getParameterValue("@PAR_MSG", NString.class);


		}
		
		public static void pProcessSpraddrRec(Ref<NString> parMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKMUPD.P_PROCESS_SPRADDR_REC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PAR_MSG", parMsg, true);
				
			cmd.execute();
			parMsg.val = cmd.getParameterValue("@PAR_MSG", NString.class);


		}
		
		public static void pProcessSpridenRec(NNumber parTransNo,Ref<NNumber> parPidm,Ref<NString> parId,Ref<NString> parMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKMUPD.P_PROCESS_SPRIDEN_REC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PAR_TRANS_NO", parTransNo);
			cmd.addParameter("@PAR_PIDM", parPidm, true);
			cmd.addParameter("@PAR_ID", parId, true);
			cmd.addParameter("@PAR_MSG", parMsg, true);
				
			cmd.execute();
			parPidm.val = cmd.getParameterValue("@PAR_PIDM", NNumber.class);
			parId.val = cmd.getParameterValue("@PAR_ID", NString.class);
			parMsg.val = cmd.getParameterValue("@PAR_MSG", NString.class);


		}
		
		public static void pProcessSprteleRec(Ref<NString> parMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKMUPD.P_PROCESS_SPRTELE_REC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PAR_MSG", parMsg, true);
				
			cmd.execute();
			parMsg.val = cmd.getParameterValue("@PAR_MSG", NString.class);


		}
		
	
	
	
}
