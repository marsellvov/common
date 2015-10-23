package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwrkvepr {
		public static NString fGetDesc(NString pString,NString pGroup) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWRKVEPR.F_GET_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_STRING", pString);
			cmd.addParameter("@P_GROUP", pGroup);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fMd5Digest(NString pString) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWRKVEPR.F_MD5_DIGEST", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_STRING", pString);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pViewepr() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWRKVEPR.P_VIEWEPR", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
