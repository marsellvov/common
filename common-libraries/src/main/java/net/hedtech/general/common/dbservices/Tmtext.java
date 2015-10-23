package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Tmtext {
		public static NString Fstriptags(NString pStr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TMTEXT.STRIPTAGS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_STR", pStr);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber Fwordcount(NString pStr,NString pNlsLang) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TMTEXT.WORDCOUNT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_STR", pStr);
			cmd.addParameter("@P_NLS_LANG", pNlsLang);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber Fwordcount(NNumber pStrcode,NString pNlsLang) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TMTEXT.WORDCOUNT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_STRCODE", pStrcode);
			cmd.addParameter("@P_NLS_LANG", pNlsLang);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
	
	
	
}
