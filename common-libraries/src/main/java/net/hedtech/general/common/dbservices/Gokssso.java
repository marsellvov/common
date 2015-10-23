package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Gokssso {
		public static NString fGetLdapparm(NString fParmName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSSSO.F_GET_LDAPPARM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@F_PARM_NAME", fParmName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGobeaccMap(NString pInpUser) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSSSO.F_GOBEACC_MAP", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_INP_USER", pInpUser);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGobeaccMapId(NString pInpId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSSSO.F_GOBEACC_MAP_ID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_INP_ID", pInpId);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fUsermap(NString inpUser,NString immutId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSSSO.F_USERMAP", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@INP_USER", inpUser);
			cmd.addParameter("@IMMUT_ID", immutId);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pBanner(NString pLogin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSSSO.P_BANNER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_LOGIN", pLogin);
				
			cmd.execute();


		}
		
		public static void pCpLastact(NString uid,NString oid,NString login,NString immutableid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSSSO.P_CP_LASTACT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@UID", uid);
			cmd.addParameter("@OID", oid);
			cmd.addParameter("@LOGIN", login);
			cmd.addParameter("@IMMUTABLEID", immutableid);
				
			cmd.execute();


		}
		
		public static void pCpLastactSserv(NString uid,NString oid,NString login,NString immutableid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSSSO.P_CP_LASTACT_SSERV", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@UID", uid);
			cmd.addParameter("@OID", oid);
			cmd.addParameter("@LOGIN", login);
			cmd.addParameter("@IMMUTABLEID", immutableid);
				
			cmd.execute();


		}
		
//		public static void pCpLogin(NString uid,NString sid,NString oid,NString login,NString immutableid) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSSSO.P_CP_LOGIN", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@UID", uid);
//			cmd.addParameter("@SID", sid);
//			cmd.addParameter("@OID", oid);
//			cmd.addParameter("@LOGIN", login);
//			cmd.addParameter("@IMMUTABLEID", immutableid);
//				
//			cmd.execute();
//
//
//		}
		
//		public static void pCpLogin(NString ltc,NString sid,NString oid,NString login,NString immutableid) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSSSO.P_CP_LOGIN", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@LTC", ltc);
//			cmd.addParameter("@SID", sid);
//			cmd.addParameter("@OID", oid);
//			cmd.addParameter("@LOGIN", login);
//			cmd.addParameter("@IMMUTABLEID", immutableid);
//				
//			cmd.execute();
//
//
//		}
		
//		public static void pCpLoginSserv(NString uid,NString sid,NString oid,NString login,NString immutableid) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSSSO.P_CP_LOGIN_SSERV", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@UID", uid);
//			cmd.addParameter("@SID", sid);
//			cmd.addParameter("@OID", oid);
//			cmd.addParameter("@LOGIN", login);
//			cmd.addParameter("@IMMUTABLEID", immutableid);
//				
//			cmd.execute();
//
//
//		}
		
//		public static void pCpLoginSserv(NString ltc,NString sid,NString oid,NString login,NString immutableid) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSSSO.P_CP_LOGIN_SSERV", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@LTC", ltc);
//			cmd.addParameter("@SID", sid);
//			cmd.addParameter("@OID", oid);
//			cmd.addParameter("@LOGIN", login);
//			cmd.addParameter("@IMMUTABLEID", immutableid);
//				
//			cmd.execute();
//
//
//		}
		
		public static void pCpLogout(NString uid,NString oid,NString login,NString immutableid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSSSO.P_CP_LOGOUT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@UID", uid);
			cmd.addParameter("@OID", oid);
			cmd.addParameter("@LOGIN", login);
			cmd.addParameter("@IMMUTABLEID", immutableid);
				
			cmd.execute();


		}
		
		public static void pCpLogoutSserv(NString uid,NString oid,NString login,NString immutableid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSSSO.P_CP_LOGOUT_SSERV", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@UID", uid);
			cmd.addParameter("@OID", oid);
			cmd.addParameter("@LOGIN", login);
			cmd.addParameter("@IMMUTABLEID", immutableid);
				
			cmd.execute();


		}
		
		public static void pDoLogin(NString bindCredential,NString bindPassword) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSSSO.P_DO_LOGIN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@BIND_CREDENTIAL", bindCredential);
			cmd.addParameter("@BIND_PASSWORD", bindPassword);
				
			cmd.execute();


		}
		
		public static void pErrorPage(NString errMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSSSO.P_ERROR_PAGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ERR_MSG", errMsg);
				
			cmd.execute();


		}
		
		public static void pGetconfigversion2(NString oid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSSSO.P_GETCONFIGVERSION2", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OID", oid);
				
			cmd.execute();


		}
		
		public static void pGetconfigversion2Sserv(NString oid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSSSO.P_GETCONFIGVERSION2_SSERV", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OID", oid);
				
			cmd.execute();


		}
		
		public static void pLogin(NString errMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSSSO.P_LOGIN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ERR_MSG", errMsg);
				
			cmd.execute();


		}
		
		public static void pLogout() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSSSO.P_LOGOUT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
