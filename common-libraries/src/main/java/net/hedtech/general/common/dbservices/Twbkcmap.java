package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Twbkcmap {
		public static void pDispchannelmap(NString pReturnCode,NString pReturnMsg,NString pChannelName,NString pChannelMode,NString pChannelView) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKCMAP.P_DISPCHANNELMAP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_RETURN_CODE", pReturnCode);
			cmd.addParameter("@P_RETURN_MSG", pReturnMsg);
			cmd.addParameter("@P_CHANNEL_NAME", pChannelName);
			cmd.addParameter("@P_CHANNEL_MODE", pChannelMode);
			cmd.addParameter("@P_CHANNEL_VIEW", pChannelView);
				
			cmd.execute();


		}
		
		public static void pDisplayChannelMapTable(NString pChannelName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKCMAP.P_DISPLAY_CHANNEL_MAP_TABLE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CHANNEL_NAME", pChannelName);
				
			cmd.execute();


		}
		
		public static void pUpdatechannelmap(NString pChannelName,NString pChannelMode,NString pChannelView,NString pChannelProcedure,NString pButtonText) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKCMAP.P_UPDATECHANNELMAP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CHANNEL_NAME", pChannelName);
			cmd.addParameter("@P_CHANNEL_MODE", pChannelMode);
			cmd.addParameter("@P_CHANNEL_VIEW", pChannelView);
			cmd.addParameter("@P_CHANNEL_PROCEDURE", pChannelProcedure);
			cmd.addParameter("@P_BUTTON_TEXT", pButtonText);
				
			cmd.execute();


		}
		
		public static void pViewupdatechannelmap(NString pChannelName,NString pChannelMode,NString pChannelView,NString pButtonText,NString pReturnCode,NString pReturnMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKCMAP.P_VIEWUPDATECHANNELMAP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CHANNEL_NAME", pChannelName);
			cmd.addParameter("@P_CHANNEL_MODE", pChannelMode);
			cmd.addParameter("@P_CHANNEL_VIEW", pChannelView);
			cmd.addParameter("@P_BUTTON_TEXT", pButtonText);
			cmd.addParameter("@P_RETURN_CODE", pReturnCode);
			cmd.addParameter("@P_RETURN_MSG", pReturnMsg);
				
			cmd.execute();


		}
		
	
	
	
}
