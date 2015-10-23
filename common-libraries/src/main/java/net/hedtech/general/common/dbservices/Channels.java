package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Channels {
		public static void pGetXml(NString pChannelName,NString pSpridenId,NString pLuminisId,NString pDataToken,NString pChannelMode,NString pFocus,NString pSubId,NString submit) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CHANNELS.P_GET_XML", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CHANNEL_NAME", pChannelName);
			cmd.addParameter("@P_SPRIDEN_ID", pSpridenId);
			cmd.addParameter("@P_LUMINIS_ID", pLuminisId);
			cmd.addParameter("@P_DATA_TOKEN", pDataToken);
			cmd.addParameter("@P_CHANNEL_MODE", pChannelMode);
			cmd.addParameter("@P_FOCUS", pFocus);
			cmd.addParameter("@P_SUB_ID", pSubId);
			cmd.addParameter("@SUBMIT", submit);
				
			cmd.execute();


		}
		
		public static void pInit() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CHANNELS.P_INIT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTransformXml(NString pXml,NString pXsl,NString submit) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CHANNELS.P_TRANSFORM_XML", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_XML", pXml);
			cmd.addParameter("@P_XSL", pXsl);
			cmd.addParameter("@SUBMIT", submit);
				
			cmd.execute();


		}
		
	
	
	
}
