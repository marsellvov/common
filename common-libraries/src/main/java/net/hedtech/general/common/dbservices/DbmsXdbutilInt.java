package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class DbmsXdbutilInt {
		public static void cleanupExpiredNfsclients() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBUTIL_INT.CLEANUP_EXPIRED_NFSCLIENTS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static NBool Fcreatesystemvirtualfolder(NString abspath) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBUTIL_INT.CREATESYSTEMVIRTUALFOLDER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@ABSPATH", abspath);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
//		public static  fixacl( oldacl) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBUTIL_INT.FIXACL", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@OLDACL", oldacl);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
//		public static  fixaclDowngrade( oldacl) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBUTIL_INT.FIXACL_DOWNGRADE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@OLDACL", oldacl);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
		public static void flushsession() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBUTIL_INT.FLUSHSESSION", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
//		public static NString Fgetnamespace( schemadoc,NInteger inde) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBUTIL_INT.GETNAMESPACE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@SCHEMADOC", schemadoc);
//			cmd.addParameter("@INDE", inde);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
		
		public static byte[] Fgetnewoid() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBUTIL_INT.GETNEWOID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(byte[].class);
				
			cmd.execute();

			return cmd.getReturnValue(byte[].class);

		}
		
		public static NNumber Fisobjectgenerated(NString objname,NString schname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBUTIL_INT.ISOBJECTGENERATED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@OBJNAME", objname);
			cmd.addParameter("@SCHNAME", schname);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber Fistableoutofline(NString tablename,NString owner) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBUTIL_INT.ISTABLEOUTOFLINE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@TABLENAME", tablename);
			cmd.addParameter("@OWNER", owner);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber Fisxmlnestedtable(NString tablename,NString schname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBUTIL_INT.ISXMLNESTEDTABLE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@TABLENAME", tablename);
			cmd.addParameter("@SCHNAME", schname);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString Flookupschemaoid(byte[] schemaoid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBUTIL_INT.LOOKUPSCHEMAOID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@SCHEMAOID", schemaoid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static byte[] Flookupschemaurl(NString schemaurl) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBUTIL_INT.LOOKUPSCHEMAURL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(byte[].class);
			cmd.addParameter("@SCHEMAURL", schemaurl);
				
			cmd.execute();

			return cmd.getReturnValue(byte[].class);

		}
		
		public static byte[] Fnumtohex(NNumber n) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBUTIL_INT.NUMTOHEX", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(byte[].class);
			cmd.addParameter("@N", n);
				
			cmd.execute();

			return cmd.getReturnValue(byte[].class);

		}
		
		public static byte[] Fnumtohex2(NNumber n) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBUTIL_INT.NUMTOHEX2", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(byte[].class);
			cmd.addParameter("@N", n);
				
			cmd.execute();

			return cmd.getReturnValue(byte[].class);

		}
		
		public static NNumber Frawtonum(byte[] prefixCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBUTIL_INT.RAWTONUM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PREFIX_CODE", prefixCode);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber Frawtonum2(byte[] prefixCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBUTIL_INT.RAWTONUM2", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PREFIX_CODE", prefixCode);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void setlinkparents() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBUTIL_INT.SETLINKPARENTS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static NInteger Fxmlschemadependencylevel(byte[] schoid,NString owner) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBUTIL_INT.XMLSCHEMADEPENDENCYLEVEL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
			cmd.addParameter("@SCHOID", schoid);
			cmd.addParameter("@OWNER", owner);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
//		public static NInteger Fxmlschemagetdependencylist(byte[] schoid,NString owner,NString depclob) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBUTIL_INT.XMLSCHEMAGETDEPENDENCYLIST", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NInteger.class);
//			cmd.addParameter("@SCHOID", schoid);
//			cmd.addParameter("@OWNER", owner);
//			cmd.addParameter("@DEPCLOB", depclob);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NInteger.class);
//
//		}
		
//		public static NString Fxmlschemastripusername( schemadoc,NString username) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBUTIL_INT.XMLSCHEMASTRIPUSERNAME", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@SCHEMADOC", schemadoc);
//			cmd.addParameter("@USERNAME", username);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
		
	
	
	
}
