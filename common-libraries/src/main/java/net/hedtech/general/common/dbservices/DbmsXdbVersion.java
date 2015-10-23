package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class DbmsXdbVersion {
		public static byte[] Fcheckin(NString pathname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB_VERSION.CHECKIN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(byte[].class);
			cmd.addParameter("@PATHNAME", pathname);
				
			cmd.execute();

			return cmd.getReturnValue(byte[].class);

		}
		
		public static void checkout(NString pathname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB_VERSION.CHECKOUT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PATHNAME", pathname);
				
			cmd.execute();


		}
		
		public static void createbranch(NString _name) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB_VERSION.CREATEBRANCH", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NAME", _name);
				
			cmd.execute();


		}
		
		public static void createrealworkspace(NString wsname,NString initializer,NBool published,NBool privatenonvcr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB_VERSION.CREATEREALWORKSPACE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@WSNAME", wsname);
			cmd.addParameter("@INITIALIZER", initializer);
			cmd.addParameter("@PUBLISHED", published);
			cmd.addParameter("@PRIVATENONVCR", privatenonvcr);
				
			cmd.execute();


		}
		
		public static void createvcr(NString path,byte[] versionresid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB_VERSION.CREATEVCR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PATH", path);
			cmd.addParameter("@VERSIONRESID", versionresid);
				
			cmd.execute();


		}
		
		public static void createvirtualworkspace(NString wsname,NString baseWsname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB_VERSION.CREATEVIRTUALWORKSPACE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@WSNAME", wsname);
			cmd.addParameter("@BASE_WSNAME", baseWsname);
				
			cmd.execute();


		}
		
		public static void deleteversion(byte[] versionresid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB_VERSION.DELETEVERSION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VERSIONRESID", versionresid);
				
			cmd.execute();


		}
		
		public static void deleteversionhistory(byte[] vhid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB_VERSION.DELETEVERSIONHISTORY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VHID", vhid);
				
			cmd.execute();


		}
		
		public static void deleteworkspace(NString wsname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB_VERSION.DELETEWORKSPACE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@WSNAME", wsname);
				
			cmd.execute();


		}
		
		public static NBlob Fgetcontentsblobbyresid(byte[] resid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB_VERSION.GETCONTENTSBLOBBYRESID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBlob.class);
			cmd.addParameter("@RESID", resid);
				
			cmd.execute();

			return cmd.getReturnValue(NBlob.class);

		}
		
		public static NString Fgetcontentsclobbyresid(byte[] resid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB_VERSION.GETCONTENTSCLOBBYRESID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@RESID", resid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static  Fgetcontentsxmlbyresid(byte[] resid) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB_VERSION.GETCONTENTSXMLBYRESID", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@RESID", resid);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
//		public static List<ResidListTypeRow> Fgetpredecessors(NString pathname) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB_VERSION.GETPREDECESSORS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<ResidListTypeRow>.class);
//			cmd.addParameter("@PATHNAME", pathname);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<ResidListTypeRow>.class);
//
//		}
		
//		public static List<ResidListTypeRow> Fgetpredsbyresid(byte[] resid) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB_VERSION.GETPREDSBYRESID", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<ResidListTypeRow>.class);
//			cmd.addParameter("@RESID", resid);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<ResidListTypeRow>.class);
//
//		}
		
//		public static  Fgetresourcebyresid(byte[] resid) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB_VERSION.GETRESOURCEBYRESID", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@RESID", resid);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
//		public static List<ResidListTypeRow> Fgetsuccessors(NString pathname) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB_VERSION.GETSUCCESSORS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<ResidListTypeRow>.class);
//			cmd.addParameter("@PATHNAME", pathname);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<ResidListTypeRow>.class);
//
//		}
		
//		public static List<ResidListTypeRow> Fgetsuccsbyresid(byte[] resid) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB_VERSION.GETSUCCSBYRESID", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<ResidListTypeRow>.class);
//			cmd.addParameter("@RESID", resid);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<ResidListTypeRow>.class);
//
//		}
		
//		public static List<ResidListTypeRow> Fgetversionhistory(byte[] resid) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB_VERSION.GETVERSIONHISTORY", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<ResidListTypeRow>.class);
//			cmd.addParameter("@RESID", resid);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<ResidListTypeRow>.class);
//
//		}
		
		public static byte[] Fgetversionhistoryid(NString pathname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB_VERSION.GETVERSIONHISTORYID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(byte[].class);
			cmd.addParameter("@PATHNAME", pathname);
				
			cmd.execute();

			return cmd.getReturnValue(byte[].class);

		}
		
		public static byte[] Fgetversionhistoryroot(byte[] resid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB_VERSION.GETVERSIONHISTORYROOT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(byte[].class);
			cmd.addParameter("@RESID", resid);
				
			cmd.execute();

			return cmd.getReturnValue(byte[].class);

		}
		
		public static void getworkspace(Ref<NString> wsname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB_VERSION.GETWORKSPACE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@WSNAME", NString.class);
				
			cmd.execute();
			wsname.val = cmd.getParameterValue("@WSNAME", NString.class);


		}
		
		public static NBool Fischeckedout(NString pathname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB_VERSION.ISCHECKEDOUT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PATHNAME", pathname);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void makeshared(NString path) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB_VERSION.MAKESHARED", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PATH", path);
				
			cmd.execute();


		}
		
		public static byte[] Fmakeversioned(NString pathname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB_VERSION.MAKEVERSIONED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(byte[].class);
			cmd.addParameter("@PATHNAME", pathname);
				
			cmd.execute();

			return cmd.getReturnValue(byte[].class);

		}
		
		public static void publishworkspace(NString wsname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB_VERSION.PUBLISHWORKSPACE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@WSNAME", wsname);
				
			cmd.execute();


		}
		
		public static void setworkspace(NString wsname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB_VERSION.SETWORKSPACE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@WSNAME", wsname);
				
			cmd.execute();


		}
		
		public static byte[] Funcheckout(NString pathname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB_VERSION.UNCHECKOUT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(byte[].class);
			cmd.addParameter("@PATHNAME", pathname);
				
			cmd.execute();

			return cmd.getReturnValue(byte[].class);

		}
		
		public static void unpublishworkspace(NString wsname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB_VERSION.UNPUBLISHWORKSPACE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@WSNAME", wsname);
				
			cmd.execute();


		}
		
		public static void updatevcrversion(NString path,byte[] newresid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB_VERSION.UPDATEVCRVERSION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PATH", path);
			cmd.addParameter("@NEWRESID", newresid);
				
			cmd.execute();


		}
		
		public static void updateworkspace(NString targetWsname,NString sourceWsname,NBool privatenonvcr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB_VERSION.UPDATEWORKSPACE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TARGET_WSNAME", targetWsname);
			cmd.addParameter("@SOURCE_WSNAME", sourceWsname);
			cmd.addParameter("@PRIVATENONVCR", privatenonvcr);
				
			cmd.execute();


		}
		
	
	
	
}
