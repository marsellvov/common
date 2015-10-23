package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwskasta {
		public static void pDispapplications(NString pSecMen) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKASTA.P_DISPAPPLICATIONS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SEC_MEN", pSecMen);
				
			cmd.execute();


		}
		
		public static void pDispstatus(NNumber appno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKASTA.P_DISPSTATUS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@APPNO", appno);
				
			cmd.execute();


		}
		
		public static void pDispstatussaradap(NNumber appno,NString confBtn,NString rejectBtn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKASTA.P_DISPSTATUSSARADAP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@APPNO", appno);
			cmd.addParameter("@CONF_BTN", confBtn);
			cmd.addParameter("@REJECT_BTN", rejectBtn);
				
			cmd.execute();


		}
		
		public static void pGetwddecision(NString pWappCode,Ref<NString> pMsgType,Ref<NString> pWdCode,Ref<NString> pWdDesc) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKASTA.P_GETWDDECISION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_WAPP_CODE", pWappCode);
			cmd.addParameter("@P_MSG_TYPE", NString.class);
			cmd.addParameter("@P_WD_CODE", NString.class);
			cmd.addParameter("@P_WD_DESC", NString.class);
				
			cmd.execute();
			pMsgType.val = cmd.getParameterValue("@P_MSG_TYPE", NString.class);
			pWdCode.val = cmd.getParameterValue("@P_WD_CODE", NString.class);
			pWdDesc.val = cmd.getParameterValue("@P_WD_DESC", NString.class);


		}
		
		public static void pStudentCurriculum(NNumber pPidm,NString pTerm,NNumber pAppno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKASTA.P_STUDENT_CURRICULUM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_APPNO", pAppno);
				
			cmd.execute();


		}
		
	
	
	
}
