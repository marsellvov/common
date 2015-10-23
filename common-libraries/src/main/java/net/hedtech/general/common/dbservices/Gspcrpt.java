package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Gspcrpt {
		public static NString fGetSalt(NNumber pSaltlength) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GSPCRPT.F_GET_SALT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SALTLENGTH", pSaltlength);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pApply(NString xString,Ref<byte[]> yRaw) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GSPCRPT.P_APPLY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@X_STRING", xString);
			cmd.addParameter("@Y_RAW", byte[].class);
				
			cmd.execute();
			yRaw.val = cmd.getParameterValue("@Y_RAW", byte[].class);


		}
		
		public static void pSaltedhash(NString pPasswd,NString pSalt,Ref<NString> pSaltedhashPasswd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GSPCRPT.P_SALTEDHASH", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PASSWD", pPasswd);
			cmd.addParameter("@P_SALT", pSalt);
			cmd.addParameter("@P_SALTEDHASH_PASSWD", NString.class);
				
			cmd.execute();
			pSaltedhashPasswd.val = cmd.getParameterValue("@P_SALTEDHASH_PASSWD", NString.class);


		}
		
	
	
	
}
