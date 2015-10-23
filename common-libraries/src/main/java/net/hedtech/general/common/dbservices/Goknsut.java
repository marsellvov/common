package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Goknsut {
		public static NString fGetSearchFilter() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKNSUT.F_GET_SEARCH_FILTER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fMatchName(NString filterStr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKNSUT.F_MATCH_NAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@FILTER_STR", filterStr);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fSplit(NString chaine,NInteger pos,NString sep) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKNSUT.F_SPLIT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@CHAINE", chaine);
			cmd.addParameter("@POS", pos);
			cmd.addParameter("@SEP", sep);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber FnameSearchBooster(NString searchVar,NString expessionVar) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKNSUT.NAME_SEARCH_BOOSTER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@SEARCH_VAR", searchVar);
			cmd.addParameter("@EXPESSION_VAR", expessionVar);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void pSetSearchFilter(NString searchVar) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKNSUT.P_SET_SEARCH_FILTER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SEARCH_VAR", searchVar);
				
			cmd.execute();


		}
		
	
	
	
}
