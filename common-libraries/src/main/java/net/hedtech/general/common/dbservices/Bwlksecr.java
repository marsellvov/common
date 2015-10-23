package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwlksecr {
		public static NString fGetcodedescription(NString targetTable,NString codeItem) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKSECR.F_GETCODEDESCRIPTION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TARGET_TABLE", targetTable);
			cmd.addParameter("@CODE_ITEM", codeItem);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pFacadvrsecurity(NString term) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKSECR.P_FACADVRSECURITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM", term);
				
			cmd.execute();


		}
		
	
	
	
}
