package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Pvktfrm {
		public static NString fGetDeceasedString() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PVKTFRM.F_GET_DECEASED_STRING", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetnonpayrollsecurity(NNumber ppidm,NString pdatasource,NString pemprcode,NString pusername) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PVKTFRM.F_GETNONPAYROLLSECURITY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PPIDM", ppidm);
			cmd.addParameter("@PDATASOURCE", pdatasource);
			cmd.addParameter("@PEMPRCODE", pemprcode);
			cmd.addParameter("@PUSERNAME", pusername);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	
}
