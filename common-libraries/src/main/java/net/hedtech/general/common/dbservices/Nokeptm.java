package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Nokeptm {
		public static NString fEaChkTernTlbd(NNumber pTransNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPTM.F_EA_CHK_TERN_TLBD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TRANS_NO", pTransNo);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fEaDistinctBlk(NNumber pTransNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPTM.F_EA_DISTINCT_BLK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TRANS_NO", pTransNo);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fEaSelectEmplBlk(NNumber pTransNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPTM.F_EA_SELECT_EMPL_BLK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TRANS_NO", pTransNo);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	
}
