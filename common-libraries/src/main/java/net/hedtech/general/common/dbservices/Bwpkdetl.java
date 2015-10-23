package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwpkdetl {
		public static NString fString(NString pStringName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDETL.F_STRING", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_STRING_NAME", pStringName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pDisplayempdeductionbody(NNumber pEmpSeqNo,NString pBdcaCode,NString pEffectiveDate,NString pNewEffectiveDate,NNumber pLoginPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDETL.P_DISPLAYEMPDEDUCTIONBODY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EMP_SEQ_NO", pEmpSeqNo);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_NEW_EFFECTIVE_DATE", pNewEffectiveDate);
			cmd.addParameter("@P_LOGIN_PIDM", pLoginPidm);
				
			cmd.execute();


		}
		
		public static void pDisplayempdetailbody(NNumber pEmpSeqNo,NString pTabInd,NNumber pLoginPidm,NString pSelect,NString pBdcaCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDETL.P_DISPLAYEMPDETAILBODY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EMP_SEQ_NO", pEmpSeqNo);
			cmd.addParameter("@P_TAB_IND", pTabInd);
			cmd.addParameter("@P_LOGIN_PIDM", pLoginPidm);
			cmd.addParameter("@P_SELECT", pSelect);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
				
			cmd.execute();


		}
		
		public static void pDisplayemperrorsbody(NNumber pEmpSeqNo,NNumber pLoginPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDETL.P_DISPLAYEMPERRORSBODY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EMP_SEQ_NO", pEmpSeqNo);
			cmd.addParameter("@P_LOGIN_PIDM", pLoginPidm);
				
			cmd.execute();


		}
		
		public static void pDisplayempinfo(NNumber pPidm,NString pConfirm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDETL.P_DISPLAYEMPINFO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CONFIRM", pConfirm);
				
			cmd.execute();


		}
		
		public static void pGetEmployeetabs(NNumber pEmpSeqNo,NNumber pLoginPidm,Ref<NString> pAppliedTabOut,Ref<NString> pPendingTabOut,Ref<NString> pConfirmedTabOut,Ref<NString> pErrorTabOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDETL.P_GET_EMPLOYEETABS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EMP_SEQ_NO", pEmpSeqNo);
			cmd.addParameter("@P_LOGIN_PIDM", pLoginPidm);
			cmd.addParameter("@P_APPLIED_TAB_OUT", NString.class);
			cmd.addParameter("@P_PENDING_TAB_OUT", NString.class);
			cmd.addParameter("@P_CONFIRMED_TAB_OUT", NString.class);
			cmd.addParameter("@P_ERROR_TAB_OUT", NString.class);
				
			cmd.execute();
			pAppliedTabOut.val = cmd.getParameterValue("@P_APPLIED_TAB_OUT", NString.class);
			pPendingTabOut.val = cmd.getParameterValue("@P_PENDING_TAB_OUT", NString.class);
			pConfirmedTabOut.val = cmd.getParameterValue("@P_CONFIRMED_TAB_OUT", NString.class);
			pErrorTabOut.val = cmd.getParameterValue("@P_ERROR_TAB_OUT", NString.class);


		}
		
		public static void pNavigatetotabafterapply(NNumber pEmpSeqNo,NNumber pLoginPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDETL.P_NAVIGATETOTABAFTERAPPLY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EMP_SEQ_NO", pEmpSeqNo);
			cmd.addParameter("@P_LOGIN_PIDM", pLoginPidm);
				
			cmd.execute();


		}
		
		public static void pUpdateempdeductionbody(NNumber pEmpSeqNo,NString pBdcaCode,NString pEffectiveDate,NString pNewEffectiveDate,NNumber pLoginPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDETL.P_UPDATEEMPDEDUCTIONBODY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EMP_SEQ_NO", pEmpSeqNo);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_NEW_EFFECTIVE_DATE", pNewEffectiveDate);
			cmd.addParameter("@P_LOGIN_PIDM", pLoginPidm);
				
			cmd.execute();


		}
		
	
	
	
}
