package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Srkrcmp {
		public static void pApdcUpdate(NString pPrelCode,NString pApplId,NString pApdcCode,Ref<NString> pMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SRKRCMP.P_APDC_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PREL_CODE", pPrelCode);
			cmd.addParameter("@P_APPL_ID", pApplId);
			cmd.addParameter("@P_APDC_CODE", pApdcCode);
			cmd.addParameter("@P_MSG_OUT", NString.class);
				
			cmd.execute();
			pMsgOut.val = cmd.getParameterValue("@P_MSG_OUT", NString.class);


		}
		
		public static void pInsertSrtrcmp(NNumber pRidmIn,NString pProcName,NString pMessage) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SRKRCMP.P_INSERT_SRTRCMP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_RIDM_IN", pRidmIn);
			cmd.addParameter("@P_PROC_NAME", pProcName);
			cmd.addParameter("@P_MESSAGE", pMessage);
				
			cmd.execute();


		}
		
		public static void pMatch(NNumber pRidmIn,Ref<NString> pStatusOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SRKRCMP.P_MATCH", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_RIDM_IN", pRidmIn);
			cmd.addParameter("@P_STATUS_OUT", NString.class);
				
			cmd.execute();
			pStatusOut.val = cmd.getParameterValue("@P_STATUS_OUT", NString.class);


		}
		
		public static void pPush(NNumber pRidmIn,Ref<NString> pMsgOut,Ref<NString> pStatusOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SRKRCMP.P_PUSH", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_RIDM_IN", pRidmIn);
			cmd.addParameter("@P_MSG_OUT", NString.class);
			cmd.addParameter("@P_STATUS_OUT", NString.class);
				
			cmd.execute();
			pMsgOut.val = cmd.getParameterValue("@P_MSG_OUT", NString.class);
			pStatusOut.val = cmd.getParameterValue("@P_STATUS_OUT", NString.class);


		}
		
	
	
	
}
