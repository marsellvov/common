package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwckgrad {
		public static void pListGradapps(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKGRAD.P_LIST_GRADAPPS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();


		}
		
		public static void pViewGradapp(NNumber pPidm,NNumber pGappSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKGRAD.P_VIEW_GRADAPP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_GAPP_SEQNO", pGappSeqno);
				
			cmd.execute();


		}
		
	
	
	
}
