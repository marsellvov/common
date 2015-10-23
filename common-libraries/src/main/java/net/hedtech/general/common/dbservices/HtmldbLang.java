package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class HtmldbLang {
		public static NString Flang(NString pPrimaryTextString,NString p0,NString p1,NString p2,NString p3,NString p4,NString p5,NString p6,NString p7,NString p8,NString p9,NString pPrimaryLanguage) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_LANG.LANG", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PRIMARY_TEXT_STRING", pPrimaryTextString);
			cmd.addParameter("@P0", p0);
			cmd.addParameter("@P1", p1);
			cmd.addParameter("@P2", p2);
			cmd.addParameter("@P3", p3);
			cmd.addParameter("@P4", p4);
			cmd.addParameter("@P5", p5);
			cmd.addParameter("@P6", p6);
			cmd.addParameter("@P7", p7);
			cmd.addParameter("@P8", p8);
			cmd.addParameter("@P9", p9);
			cmd.addParameter("@P_PRIMARY_LANGUAGE", pPrimaryLanguage);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString Fmessage(NString pName,NString p0,NString p1,NString p2,NString p3,NString p4,NString p5,NString p6,NString p7,NString p8,NString p9,NString pLang) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_LANG.MESSAGE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_NAME", pName);
			cmd.addParameter("@P0", p0);
			cmd.addParameter("@P1", p1);
			cmd.addParameter("@P2", p2);
			cmd.addParameter("@P3", p3);
			cmd.addParameter("@P4", p4);
			cmd.addParameter("@P5", p5);
			cmd.addParameter("@P6", p6);
			cmd.addParameter("@P7", p7);
			cmd.addParameter("@P8", p8);
			cmd.addParameter("@P9", p9);
			cmd.addParameter("@P_LANG", pLang);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void messageP(NString pName,NString p0,NString p1,NString p2,NString p3,NString p4,NString p5,NString p6,NString p7,NString p8,NString p9,NString pLang) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_LANG.MESSAGE_P", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_NAME", pName);
			cmd.addParameter("@P0", p0);
			cmd.addParameter("@P1", p1);
			cmd.addParameter("@P2", p2);
			cmd.addParameter("@P3", p3);
			cmd.addParameter("@P4", p4);
			cmd.addParameter("@P5", p5);
			cmd.addParameter("@P6", p6);
			cmd.addParameter("@P7", p7);
			cmd.addParameter("@P8", p8);
			cmd.addParameter("@P9", p9);
			cmd.addParameter("@P_LANG", pLang);
				
			cmd.execute();


		}
		
	
	
	
}
