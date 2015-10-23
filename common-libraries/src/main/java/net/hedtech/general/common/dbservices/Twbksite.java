package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Twbksite {
//		public static List<MenuTableTypeRow> fGetsitemap(NString menuNameIn,NInteger depthIn,NBool stopLoopsIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKSITE.F_GETSITEMAP", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<MenuTableTypeRow>.class);
//			cmd.addParameter("@MENU_NAME_IN", menuNameIn);
//			cmd.addParameter("@DEPTH_IN", depthIn);
//			cmd.addParameter("@STOP_LOOPS_IN", stopLoopsIn);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<MenuTableTypeRow>.class);
//
//		}
		
		public static void pDispaccessibility() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKSITE.P_DISPACCESSIBILITY", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pDispsitemap(NString menuNameIn,NInteger depthIn,NInteger columnsIn,NInteger lastDepth,NString submitbutton) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKSITE.P_DISPSITEMAP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MENU_NAME_IN", menuNameIn);
			cmd.addParameter("@DEPTH_IN", depthIn);
			cmd.addParameter("@COLUMNS_IN", columnsIn);
			cmd.addParameter("@LAST_DEPTH", lastDepth);
			cmd.addParameter("@SUBMITBUTTON", submitbutton);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="MenuItemRecordTypeRow", dataSourceName="MENU_ITEM_RECORD_TYPE")
	public static class MenuItemRecordTypeRow
	{
		@DbRecordField(dataSourceName="MENU_SEQUENCE")
		public NInteger MenuSequence;
		@DbRecordField(dataSourceName="MENU_LEVEL")
		public NInteger MenuLevel;
		@DbRecordField(dataSourceName="MENU_URL")
		public NString MenuUrl;
		@DbRecordField(dataSourceName="MENU_URL_TEXT")
		public NString MenuUrlText;
		@DbRecordField(dataSourceName="MENU_SUBMENU_IND")
		public NString MenuSubmenuInd;
		@DbRecordField(dataSourceName="MENU_DB_LINK_IND")
		public NString MenuDbLinkInd;
	}

	
	
}
