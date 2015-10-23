package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Tokwext {
		public static void pExtractar(NString termCode,NString fillHierarchy,NString financeInstalled,NString studentInstalled,NString userid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TOKWEXT.P_EXTRACTAR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_CODE", termCode);
			cmd.addParameter("@FILL_HIERARCHY", fillHierarchy);
			cmd.addParameter("@FINANCE_INSTALLED", financeInstalled);
			cmd.addParameter("@STUDENT_INSTALLED", studentInstalled);
			cmd.addParameter("@USERID", userid);
				
			cmd.execute();


		}
		
	
	
	
}
