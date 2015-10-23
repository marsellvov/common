package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class TgkGokisql {
		public static void pDoGotisql(NString inProcessCd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TGK_GOKISQL.P_DO_GOTISQL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IN_PROCESS_CD", inProcessCd);
				
			cmd.execute();


		}
		
	
	
	
}
