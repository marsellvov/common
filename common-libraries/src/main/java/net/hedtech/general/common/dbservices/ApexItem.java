package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class ApexItem {
		public static void checkbox() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_ITEM.CHECKBOX", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void datePopup() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_ITEM.DATE_POPUP", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void displayAndSave() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_ITEM.DISPLAY_AND_SAVE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void hidden() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_ITEM.HIDDEN", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void md5Checksum() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_ITEM.MD5_CHECKSUM", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void md5Hidden() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_ITEM.MD5_HIDDEN", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void multiRowUpdate() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_ITEM.MULTI_ROW_UPDATE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void popupFromLov() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_ITEM.POPUP_FROM_LOV", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void popupFromQuery() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_ITEM.POPUP_FROM_QUERY", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void popupkeyFromLov() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_ITEM.POPUPKEY_FROM_LOV", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void popupkeyFromQuery() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_ITEM.POPUPKEY_FROM_QUERY", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void radiogroup() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_ITEM.RADIOGROUP", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void selectList() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_ITEM.SELECT_LIST", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void selectListFromLov() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_ITEM.SELECT_LIST_FROM_LOV", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void selectListFromLovXl() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_ITEM.SELECT_LIST_FROM_LOV_XL", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void selectListFromQuery() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_ITEM.SELECT_LIST_FROM_QUERY", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void selectListFromQueryXl() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_ITEM.SELECT_LIST_FROM_QUERY_XL", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void text() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_ITEM.TEXT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void textFromLov() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_ITEM.TEXT_FROM_LOV", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void textFromLovQuery() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_ITEM.TEXT_FROM_LOV_QUERY", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void textarea() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_ITEM.TEXTAREA", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="LovItemRow", dataSourceName="LOV_ITEM")
	public static class LovItemRow
	{
		@DbRecordField(dataSourceName="DISPLAY_VALUE")
		public NString DisplayValue;
		@DbRecordField(dataSourceName="RETURN_VALUE")
		public NString ReturnValue;
	}

	
	
}
