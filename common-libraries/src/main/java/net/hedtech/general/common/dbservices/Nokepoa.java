package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Nokepoa {
		public static void pProcessEaOnlineApply(NNumber pPidm,NNumber pTransNo,NString pQueryDate,NDate pApplyDate,NString pUserId,NString pAcat,NString pExeSource,Ref<NString> pEditStatus,Ref<NString> pMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPOA.P_PROCESS_EA_ONLINE_APPLY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TRANS_NO", pTransNo);
			cmd.addParameter("@P_QUERY_DATE", pQueryDate);
			cmd.addParameter("@P_APPLY_DATE", pApplyDate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ACAT", pAcat);
			cmd.addParameter("@P_EXE_SOURCE", pExeSource);
			cmd.addParameter("@P_EDIT_STATUS", pEditStatus, true);
			cmd.addParameter("@P_MSG", pMsg, true);
				
			cmd.execute();
			pEditStatus.val = cmd.getParameterValue("@P_EDIT_STATUS", NString.class);
			pMsg.val = cmd.getParameterValue("@P_MSG", NString.class);


		}
		
		public static void pUpdateEpafStatus(NNumber pTransNo,NString pAcat,NString pUserId,NString pApplyEmpl) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPOA.P_UPDATE_EPAF_STATUS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRANS_NO", pTransNo);
			cmd.addParameter("@P_ACAT", pAcat);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_APPLY_EMPL", pApplyEmpl);
				
			cmd.execute();


		}
		
	
	
	
}
