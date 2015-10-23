package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Eok495r {
		public static void pPerfcntAdr(NString oldFcntCode,NString oldTermCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOK495R.P_PERFCNT_ADR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OLD_FCNT_CODE", oldFcntCode);
			cmd.addParameter("@OLD_TERM_CODE", oldTermCode);
				
			cmd.execute();


		}
		
		public static void pPerfcntAir(NString newFcntCode,NString newTermCode,NString vpdiCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOK495R.P_PERFCNT_AIR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_FCNT_CODE", newFcntCode);
			cmd.addParameter("@NEW_TERM_CODE", newTermCode);
			cmd.addParameter("@VPDI_CODE", vpdiCode);
				
			cmd.execute();


		}
		
		public static void pPerfcntAur(NString newFcntCode,NString oldFcntCode,NString newTermCode,NString oldTermCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOK495R.P_PERFCNT_AUR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_FCNT_CODE", newFcntCode);
			cmd.addParameter("@OLD_FCNT_CODE", oldFcntCode);
			cmd.addParameter("@NEW_TERM_CODE", newTermCode);
			cmd.addParameter("@OLD_TERM_CODE", oldTermCode);
				
			cmd.execute();


		}
		
	
	
	
}
