package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwgkprxy {
		public static NString fGetLongParm(NNumber pPidm,NString pParm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKPRXY.F_GET_LONG_PARM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PARM", pParm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fGetPidmForIdm(NNumber pIdm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKPRXY.F_GET_PIDM_FOR_IDM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_IDM", pIdm);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fGetProxyDad() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKPRXY.F_GET_PROXY_DAD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fGetauthcount(NNumber pProxyidm,NNumber pPersonpidm,NString pMenu) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKPRXY.F_GETAUTHCOUNT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PROXYIDM", pProxyidm);
			cmd.addParameter("@P_PERSONPIDM", pPersonpidm);
			cmd.addParameter("@P_MENU", pMenu);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fGetauthind(NNumber pProxyidm,NNumber pPersonpidm,NString pPage) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKPRXY.F_GETAUTHIND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PROXYIDM", pProxyidm);
			cmd.addParameter("@P_PERSONPIDM", pPersonpidm);
			cmd.addParameter("@P_PAGE", pPage);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetcgi() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKPRXY.F_GETCGI", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetmenutext(NString pRetp,NString pPage) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKPRXY.F_GETMENUTEXT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_RETP", pRetp);
			cmd.addParameter("@P_PAGE", pPage);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetoption(NString pOtyp,NString pRetp,NString pSyst) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKPRXY.F_GETOPTION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_OTYP", pOtyp);
			cmd.addParameter("@P_RETP", pRetp);
			cmd.addParameter("@P_SYST", pSyst);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetspridenentity(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKPRXY.F_GETSPRIDENENTITY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetspridenid(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKPRXY.F_GETSPRIDENID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetspridenpidm(NString pId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKPRXY.F_GETSPRIDENPIDM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ID", pId);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fGetstatus(NNumber pProxyidm,NNumber pPersonpidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKPRXY.F_GETSTATUS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PROXYIDM", pProxyidm);
			cmd.addParameter("@P_PERSONPIDM", pPersonpidm);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fGettheme() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKPRXY.F_GETTHEME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fSelected(NString pVal1,NString pVal2) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKPRXY.F_SELECTED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_VAL1", pVal1);
			cmd.addParameter("@P_VAL2", pVal2);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pGlobalproxyaccess(NString pInfo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKPRXY.P_GLOBALPROXYACCESS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_INFO", pInfo);
				
			cmd.execute();


		}
		
		public static void pJavascriptanchor(NString pText,NString pCall,NString pUrl) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKPRXY.P_JAVASCRIPTANCHOR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TEXT", pText);
			cmd.addParameter("@P_CALL", pCall);
			cmd.addParameter("@P_URL", pUrl);
				
			cmd.execute();


		}
		
		public static void pManageproxy(NString pInfo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKPRXY.P_MANAGEPROXY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_INFO", pInfo);
				
			cmd.execute();


		}
		
		public static void pMatchload(NNumber pProxyidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKPRXY.P_MATCHLOAD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PROXYIDM", pProxyidm);
				
			cmd.execute();


		}
		
		public static void pProxyaccess(NString pInfo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKPRXY.P_PROXYACCESS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_INFO", pInfo);
				
			cmd.execute();


		}
		
		public static void pProxylogin(NString pInfo,NString accessibility) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKPRXY.P_PROXYLOGIN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_INFO", pInfo);
			cmd.addParameter("@ACCESSIBILITY", accessibility);
				
			cmd.execute();


		}
		
		public static void pSaveLongParm(NNumber pPidm,NString pParm,NString pValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKPRXY.P_SAVE_LONG_PARM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PARM", pParm);
			cmd.addParameter("@P_VALUE", pValue);
				
			cmd.execute();


		}
		
		public static void pSendemail(NString pRowid,NString pMessage) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKPRXY.P_SENDEMAIL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ROWID", pRowid);
			cmd.addParameter("@P_MESSAGE", pMessage);
				
			cmd.execute();


		}
		
	
	
	
}
