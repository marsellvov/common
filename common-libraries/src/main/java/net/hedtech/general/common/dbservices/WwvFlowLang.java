package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class WwvFlowLang {
		public static void alterSession(NString pLanguage) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_LANG.ALTER_SESSION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_LANGUAGE", pLanguage);
				
			cmd.execute();


		}
		
		public static NString findLanguagePreference() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_LANG.FIND_LANGUAGE_PREFERENCE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetCsvCharset() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_LANG.GET_CSV_CHARSET", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetDbCharset() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_LANG.GET_DB_CHARSET", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetNlsLanguage() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_LANG.GET_NLS_LANGUAGE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetNlsWindowsCharset() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_LANG.GET_NLS_WINDOWS_CHARSET", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString Flang(NString pPrimaryTextString,NString p0,NString p1,NString p2,NString p3,NString p4,NString p5,NString p6,NString p7,NString p8,NString p9,NString pPrimaryTextContext,NString pPrimaryLanguage) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_LANG.LANG", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PRIMARY_TEXT_STRING", pPrimaryTextString);
			cmd.addParameter("@P0", p0);
			cmd.addParameter("@P1", p1);
			cmd.addParameter("@P2", p2);
			cmd.addParameter("@P3", p3);
			cmd.addParameter("@P4", p4);
			cmd.addParameter("@P5", p5);
			cmd.addParameter("@P6", p6);
			cmd.addParameter("@P7", p7);
			cmd.addParameter("@P8", p8);
			cmd.addParameter("@P9", p9);
			cmd.addParameter("@P_PRIMARY_TEXT_CONTEXT", pPrimaryTextContext);
			cmd.addParameter("@P_PRIMARY_LANGUAGE", pPrimaryLanguage);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FmapDbCharset(NString pIanaCharset) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_LANG.MAP_DB_CHARSET", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_IANA_CHARSET", pIanaCharset);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FmapIanaCharset(NString pDbCharset) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_LANG.MAP_IANA_CHARSET", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_DB_CHARSET", pDbCharset);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FmapLanguage(NString pLanguage) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_LANG.MAP_LANGUAGE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_LANGUAGE", pLanguage);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString Fmessage(NString pName,NString p0,NString p1,NString p2,NString p3,NString p4,NString p5,NString p6,NString p7,NString p8,NString p9,NString pLang) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_LANG.MESSAGE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_NAME", pName);
			cmd.addParameter("@P0", p0);
			cmd.addParameter("@P1", p1);
			cmd.addParameter("@P2", p2);
			cmd.addParameter("@P3", p3);
			cmd.addParameter("@P4", p4);
			cmd.addParameter("@P5", p5);
			cmd.addParameter("@P6", p6);
			cmd.addParameter("@P7", p7);
			cmd.addParameter("@P8", p8);
			cmd.addParameter("@P9", p9);
			cmd.addParameter("@P_LANG", pLang);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void messageP(NString pName,NString p0,NString p1,NString p2,NString p3,NString p4,NString p5,NString p6,NString p7,NString p8,NString p9,NString pLang) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_LANG.MESSAGE_P", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_NAME", pName);
			cmd.addParameter("@P0", p0);
			cmd.addParameter("@P1", p1);
			cmd.addParameter("@P2", p2);
			cmd.addParameter("@P3", p3);
			cmd.addParameter("@P4", p4);
			cmd.addParameter("@P5", p5);
			cmd.addParameter("@P6", p6);
			cmd.addParameter("@P7", p7);
			cmd.addParameter("@P8", p8);
			cmd.addParameter("@P9", p9);
			cmd.addParameter("@P_LANG", pLang);
				
			cmd.execute();


		}
		
		public static NString FpickDateFromLanguage() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_LANG.PICK_DATE_FROM_LANGUAGE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FreplaceParam(NString pMessage,NString p0,NString p1,NString p2,NString p3,NString p4,NString p5,NString p6,NString p7,NString p8,NString p9) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_LANG.REPLACE_PARAM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_MESSAGE", pMessage);
			cmd.addParameter("@P0", p0);
			cmd.addParameter("@P1", p1);
			cmd.addParameter("@P2", p2);
			cmd.addParameter("@P3", p3);
			cmd.addParameter("@P4", p4);
			cmd.addParameter("@P5", p5);
			cmd.addParameter("@P6", p6);
			cmd.addParameter("@P7", p7);
			cmd.addParameter("@P8", p8);
			cmd.addParameter("@P9", p9);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void reportLangToBrowser() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_LANG.REPORT_LANG_TO_BROWSER", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void resetNls() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_LANG.RESET_NLS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void setTranslatedFlowAndPage() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_LANG.SET_TRANSLATED_FLOW_AND_PAGE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static NString FsystemMessage(NString pName,NString p0,NString p1,NString p2,NString p3,NString p4,NString p5,NString p6,NString p7,NString p8,NString p9,NString pLang,NString pApplicationId,NString pSecurityGroupId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_LANG.SYSTEM_MESSAGE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_NAME", pName);
			cmd.addParameter("@P0", p0);
			cmd.addParameter("@P1", p1);
			cmd.addParameter("@P2", p2);
			cmd.addParameter("@P3", p3);
			cmd.addParameter("@P4", p4);
			cmd.addParameter("@P5", p5);
			cmd.addParameter("@P6", p6);
			cmd.addParameter("@P7", p7);
			cmd.addParameter("@P8", p8);
			cmd.addParameter("@P9", p9);
			cmd.addParameter("@P_LANG", pLang);
			cmd.addParameter("@P_APPLICATION_ID", pApplicationId);
			cmd.addParameter("@P_SECURITY_GROUP_ID", pSecurityGroupId);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FsystemMessageLit(NString pName,NString p0,NString p1,NString p2,NString p3,NString p4,NString p5,NString p6,NString p7,NString p8,NString p9,NString pLang,NString pApplicationId,NString pSecurityGroupId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_LANG.SYSTEM_MESSAGE_LIT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_NAME", pName);
			cmd.addParameter("@P0", p0);
			cmd.addParameter("@P1", p1);
			cmd.addParameter("@P2", p2);
			cmd.addParameter("@P3", p3);
			cmd.addParameter("@P4", p4);
			cmd.addParameter("@P5", p5);
			cmd.addParameter("@P6", p6);
			cmd.addParameter("@P7", p7);
			cmd.addParameter("@P8", p8);
			cmd.addParameter("@P9", p9);
			cmd.addParameter("@P_LANG", pLang);
			cmd.addParameter("@P_APPLICATION_ID", pApplicationId);
			cmd.addParameter("@P_SECURITY_GROUP_ID", pSecurityGroupId);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void systemMessageP(NString pName,NString p0,NString p1,NString p2,NString p3,NString p4,NString p5,NString p6,NString p7,NString p8,NString p9,NString pLang,NString pApplicationId,NString pSecurityGroupId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_LANG.SYSTEM_MESSAGE_P", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_NAME", pName);
			cmd.addParameter("@P0", p0);
			cmd.addParameter("@P1", p1);
			cmd.addParameter("@P2", p2);
			cmd.addParameter("@P3", p3);
			cmd.addParameter("@P4", p4);
			cmd.addParameter("@P5", p5);
			cmd.addParameter("@P6", p6);
			cmd.addParameter("@P7", p7);
			cmd.addParameter("@P8", p8);
			cmd.addParameter("@P9", p9);
			cmd.addParameter("@P_LANG", pLang);
			cmd.addParameter("@P_APPLICATION_ID", pApplicationId);
			cmd.addParameter("@P_SECURITY_GROUP_ID", pSecurityGroupId);
				
			cmd.execute();


		}
		
	
	
	
}
