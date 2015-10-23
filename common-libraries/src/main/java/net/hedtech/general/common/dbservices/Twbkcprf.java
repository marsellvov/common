package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Twbkcprf {
		public static void pDispchannelpref(NString pReturnCode,NString pReturnMsg,NString pChannelName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKCPRF.P_DISPCHANNELPREF", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_RETURN_CODE", pReturnCode);
			cmd.addParameter("@P_RETURN_MSG", pReturnMsg);
			cmd.addParameter("@P_CHANNEL_NAME", pChannelName);
				
			cmd.execute();


		}
		
		public static void pSelectchannel(NString pReturnCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKCPRF.P_SELECTCHANNEL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_RETURN_CODE", pReturnCode);
				
			cmd.execute();


		}
		
		public static void pUpdatechannelpref(NString pChannelName,NString pChannelGroup,NString pChannelKey,NString pChannelPrefUser,NString pChannelEditInd,NString pChannelDesc,NString pChannelValue,NString pChannelDisplay,NNumber pChannelSort,NString pButtonText) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKCPRF.P_UPDATECHANNELPREF", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CHANNEL_NAME", pChannelName);
			cmd.addParameter("@P_CHANNEL_GROUP", pChannelGroup);
			cmd.addParameter("@P_CHANNEL_KEY", pChannelKey);
			cmd.addParameter("@P_CHANNEL_PREF_USER", pChannelPrefUser);
			cmd.addParameter("@P_CHANNEL_EDIT_IND", pChannelEditInd);
			cmd.addParameter("@P_CHANNEL_DESC", pChannelDesc);
			cmd.addParameter("@P_CHANNEL_VALUE", pChannelValue);
			cmd.addParameter("@P_CHANNEL_DISPLAY", pChannelDisplay);
			cmd.addParameter("@P_CHANNEL_SORT", pChannelSort);
			cmd.addParameter("@P_BUTTON_TEXT", pButtonText);
				
			cmd.execute();


		}
		
		public static void pViewupdatechannelpref(NString pChannelName,NString pChannelGroup,NString pChannelKey,NString pChannelPrefUser,NString pChannelEditInd,NString pChannelDesc,NString pChannelValue,NString pChannelDisplay,NNumber pChannelSort,NString pTransType,NString pButtonText,NString pReturnCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKCPRF.P_VIEWUPDATECHANNELPREF", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CHANNEL_NAME", pChannelName);
			cmd.addParameter("@P_CHANNEL_GROUP", pChannelGroup);
			cmd.addParameter("@P_CHANNEL_KEY", pChannelKey);
			cmd.addParameter("@P_CHANNEL_PREF_USER", pChannelPrefUser);
			cmd.addParameter("@P_CHANNEL_EDIT_IND", pChannelEditInd);
			cmd.addParameter("@P_CHANNEL_DESC", pChannelDesc);
			cmd.addParameter("@P_CHANNEL_VALUE", pChannelValue);
			cmd.addParameter("@P_CHANNEL_DISPLAY", pChannelDisplay);
			cmd.addParameter("@P_CHANNEL_SORT", pChannelSort);
			cmd.addParameter("@P_TRANS_TYPE", pTransType);
			cmd.addParameter("@P_BUTTON_TEXT", pButtonText);
			cmd.addParameter("@P_RETURN_CODE", pReturnCode);
				
			cmd.execute();


		}
		
	
	
	
}
