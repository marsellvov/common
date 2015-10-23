package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Twbcmain {
		public static NString fChnlDefault(NString pDefMode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBCMAIN.F_CHNL_DEFAULT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_DEF_MODE", pDefMode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetParm(NString pName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBCMAIN.F_GET_PARM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_NAME", pName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fMainXml(NString pChannelName,NString pSpridenId,NString pLuminisId,NString pDataToken,NString pChannelMode,NString pFocus,NString pSubId,NString pLocale,NString pVpdCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBCMAIN.F_MAIN_XML", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CHANNEL_NAME", pChannelName);
			cmd.addParameter("@P_SPRIDEN_ID", pSpridenId);
			cmd.addParameter("@P_LUMINIS_ID", pLuminisId);
			cmd.addParameter("@P_DATA_TOKEN", pDataToken);
			cmd.addParameter("@P_CHANNEL_MODE", pChannelMode);
			cmd.addParameter("@P_FOCUS", pFocus);
			cmd.addParameter("@P_SUB_ID", pSubId);
			cmd.addParameter("@P_LOCALE", pLocale);
			cmd.addParameter("@P_VPD_CODE", pVpdCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	
}
