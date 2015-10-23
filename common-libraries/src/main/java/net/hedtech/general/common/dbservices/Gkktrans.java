package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Gkktrans {
		public static NString fDifferentMsgText(NString pMsgKey,NString pStr,NString pOraNlsLang) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKTRANS.F_DIFFERENT_MSG_TEXT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_MSG_KEY", pMsgKey);
			cmd.addParameter("@P_STR", pStr);
			cmd.addParameter("@P_ORA_NLS_LANG", pOraNlsLang);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetNextMsgKey(NString pPage) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKTRANS.F_GET_NEXT_MSG_KEY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PAGE", pPage);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pCreateTmmodmsg(NString pMsgKey,NString pMsgText,NString pOraNlsLang) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKTRANS.P_CREATE_TMMODMSG", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_MSG_KEY", pMsgKey);
			cmd.addParameter("@P_MSG_TEXT", pMsgText);
			cmd.addParameter("@P_ORA_NLS_LANG", pOraNlsLang);
				
			cmd.execute();


		}
		
	
	
	
}
