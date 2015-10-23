package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class TmMsg {
		public static void populate(NString pProj,NString pSrcLang,NBool pReplace,NString pLanglist) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TM_MSG.POPULATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PROJ", pProj);
			cmd.addParameter("@P_SRC_LANG", pSrcLang);
			cmd.addParameter("@P_REPLACE", pReplace);
			cmd.addParameter("@P_LANGLIST", pLanglist);
				
			cmd.execute();


		}
		
	
	
	
}
