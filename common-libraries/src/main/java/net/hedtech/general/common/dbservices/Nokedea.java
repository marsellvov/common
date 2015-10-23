package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Nokedea {
		public static void pMassEdit(NNumber pPidm,NNumber pTransNo,NString pQueryDate,NString pAcat,Ref<NString> pEditStatusOut,Ref<NString> pEditMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEDEA.P_MASS_EDIT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TRANS_NO", pTransNo);
			cmd.addParameter("@P_QUERY_DATE", pQueryDate);
			cmd.addParameter("@P_ACAT", pAcat);
			cmd.addParameter("@P_EDIT_STATUS_OUT", NString.class);
			cmd.addParameter("@P_EDIT_MSG_OUT", NString.class);
				
			cmd.execute();
			pEditStatusOut.val = cmd.getParameterValue("@P_EDIT_STATUS_OUT", NString.class);
			pEditMsgOut.val = cmd.getParameterValue("@P_EDIT_MSG_OUT", NString.class);


		}
		
		public static void test() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEDEA.TEST", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
