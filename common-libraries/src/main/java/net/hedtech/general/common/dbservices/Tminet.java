package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Tminet {
		public static NString fEscape(NString pText) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TMINET.F_ESCAPE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TEXT", pText);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool fInitserviceparams(NString pLangcode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TMINET.F_INITSERVICEPARAMS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_LANGCODE", pLangcode);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NString fTranslate(NString pText) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TMINET.F_TRANSLATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TEXT", pText);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	
}
