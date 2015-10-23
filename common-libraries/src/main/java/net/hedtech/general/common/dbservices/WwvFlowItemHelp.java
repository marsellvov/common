package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class WwvFlowItemHelp {
		public static void showHelp(NString pItemId,NString pSession,NString pCloseButtonName,NString pTitleBgcolor,NString pPageBgcolor) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_ITEM_HELP.SHOW_HELP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ITEM_ID", pItemId);
			cmd.addParameter("@P_SESSION", pSession);
			cmd.addParameter("@P_CLOSE_BUTTON_NAME", pCloseButtonName);
			cmd.addParameter("@P_TITLE_BGCOLOR", pTitleBgcolor);
			cmd.addParameter("@P_PAGE_BGCOLOR", pPageBgcolor);
				
			cmd.execute();


		}
		
	
	
	
}
