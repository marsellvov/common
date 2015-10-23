package net.hedtech.general.common.dbservices;

import java.util.*;

import net.hedtech.general.common.dbservices.DbmsXdbresource.XdbresourceRow;
import oracle.sql.BFILE;
import oracle.sql.BLOB;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class DbmsXdb {
//		public static NInteger Faclcheckprivileges(NString aclPath,NString owner, privs) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB.ACLCHECKPRIVILEGES", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NInteger.class);
//			cmd.addParameter("@ACL_PATH", aclPath);
//			cmd.addParameter("@OWNER", owner);
//			cmd.addParameter("@PRIVS", privs);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NInteger.class);
//
//		}
		
		public static void addmimemapping(NString extension,NString mimetype) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB.ADDMIMEMAPPING", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EXTENSION", extension);
			cmd.addParameter("@MIMETYPE", mimetype);
				
			cmd.execute();


		}
		
		public static NNumber Faddresource(NString abspath,NString data) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB.ADDRESOURCE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@ABSPATH", abspath);
			cmd.addParameter("@DATA", data);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void addschemalocmapping(NString _namespace,NString element,NString schemaurl) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB.ADDSCHEMALOCMAPPING", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NAMESPACE", _namespace);
			cmd.addParameter("@ELEMENT", element);
			cmd.addParameter("@SCHEMAURL", schemaurl);
				
			cmd.execute();


		}
		
		public static void addservlet(NString _name,NString language,NString dispname,NString icon,NString descript,NString _class,NString jspfile,NString plsql,NString schema) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB.ADDSERVLET", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NAME", _name);
			cmd.addParameter("@LANGUAGE", language);
			cmd.addParameter("@DISPNAME", dispname);
			cmd.addParameter("@ICON", icon);
			cmd.addParameter("@DESCRIPT", descript);
			cmd.addParameter("@CLASS", _class);
			cmd.addParameter("@JSPFILE", jspfile);
			cmd.addParameter("@PLSQL", plsql);
			cmd.addParameter("@SCHEMA", schema);
				
			cmd.execute();


		}
		
		public static void addservletmapping(NString pattern,NString _name) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB.ADDSERVLETMAPPING", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PATTERN", pattern);
			cmd.addParameter("@NAME", _name);
				
			cmd.execute();


		}
		
		public static void addservletsecrole(NString servname,NString rolename,NString rolelink,NString descript) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB.ADDSERVLETSECROLE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SERVNAME", servname);
			cmd.addParameter("@ROLENAME", rolename);
			cmd.addParameter("@ROLELINK", rolelink);
			cmd.addParameter("@DESCRIPT", descript);
				
			cmd.execute();


		}
		
		public static void addtolocktokenlist(NString token) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB.ADDTOLOCKTOKENLIST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TOKEN", token);
				
			cmd.execute();


		}
		
		public static void addxmlextension(NString extension) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB.ADDXMLEXTENSION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EXTENSION", extension);
				
			cmd.execute();


		}
		
//		public static void appendresourcemetadata(NString abspath, data) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB.APPENDRESOURCEMETADATA", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@ABSPATH", abspath);
//			cmd.addParameter("@DATA", data);
//				
//			cmd.execute();
//
//
//		}
		
//		public static void appendresourcemetadata(NString abspath, data) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB.APPENDRESOURCEMETADATA", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@ABSPATH", abspath);
//			cmd.addParameter("@DATA", data);
//				
//			cmd.execute();
//
//
//		}
		
//		public static  FcfgGet() {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB.CFG_GET", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
		public static void cfgRefresh() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB.CFG_REFRESH", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
//		public static void cfgUpdate( xdbconfig) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB.CFG_UPDATE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@XDBCONFIG", xdbconfig);
//				
//			cmd.execute();
//
//
//		}
		
		public static void changeowner(NString abspath,NString owner,NBool recurse) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB.CHANGEOWNER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ABSPATH", abspath);
			cmd.addParameter("@OWNER", owner);
			cmd.addParameter("@RECURSE", recurse);
				
			cmd.execute();


		}
		
//		public static NInteger Fchangeprivileges(NString resPath, ace) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB.CHANGEPRIVILEGES", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NInteger.class);
//			cmd.addParameter("@RES_PATH", resPath);
//			cmd.addParameter("@ACE", ace);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NInteger.class);
//
//		}
		
//		public static NInteger Fcheckprivileges(NString resPath, privs) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB.CHECKPRIVILEGES", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NInteger.class);
//			cmd.addParameter("@RES_PATH", resPath);
//			cmd.addParameter("@PRIVS", privs);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NInteger.class);
//
//		}
		
		public static void cleansgaforupgrade() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB.CLEANSGAFORUPGRADE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static NBool Fcreatefolder(NString abspath) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB.CREATEFOLDER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@ABSPATH", abspath);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NString Fcreateoidpath(byte[] oid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB.CREATEOIDPATH", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@OID", oid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool Fcreateresource(NString abspath,NString data) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB.CREATERESOURCE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@ABSPATH", abspath);
			cmd.addParameter("@DATA", data);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
//		public static NBool Fcreateresource(NString abspath, data) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB.CREATERESOURCE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NBool.class);
//			cmd.addParameter("@ABSPATH", abspath);
//			cmd.addParameter("@DATA", data);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NBool.class);
//
//		}
		
//		public static NBool Fcreateresource(NString abspath, data,NBool sticky,NBool calcsize) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB.CREATERESOURCE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NBool.class);
//			cmd.addParameter("@ABSPATH", abspath);
//			cmd.addParameter("@DATA", data);
//			cmd.addParameter("@STICKY", sticky);
//			cmd.addParameter("@CALCSIZE", calcsize);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NBool.class);
//
//		}
		
//		public static NBool Fcreateresource(NString abspath,NString data) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB.CREATERESOURCE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NBool.class);
//			cmd.addParameter("@ABSPATH", abspath);
//			cmd.addParameter("@DATA", data);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NBool.class);
//
//		}
		
		public static NBool Fcreateresource(NString abspath, BFILE data,NNumber csid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB.CREATERESOURCE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@ABSPATH", abspath);
			cmd.addParameter("@DATA", data);
			cmd.addParameter("@CSID", csid);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool Fcreateresource(NString abspath,NBlob data,NNumber csid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB.CREATERESOURCE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@ABSPATH", abspath);
			cmd.addParameter("@DATA", data);
			cmd.addParameter("@CSID", csid);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool Fdeletefromlocktokenlist(NString token) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB.DELETEFROMLOCKTOKENLIST", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@TOKEN", token);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void deletemimemapping(NString extension) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB.DELETEMIMEMAPPING", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EXTENSION", extension);
				
			cmd.execute();


		}
		
		public static void deleteresource(NString abspath,NInteger deleteOption) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB.DELETERESOURCE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ABSPATH", abspath);
			cmd.addParameter("@DELETE_OPTION", deleteOption);
				
			cmd.execute();


		}
		
//		public static void deleteresourcemetadata(NString abspath, metadata,NInteger deleteOption) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB.DELETERESOURCEMETADATA", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@ABSPATH", abspath);
//			cmd.addParameter("@METADATA", metadata);
//			cmd.addParameter("@DELETE_OPTION", deleteOption);
//				
//			cmd.execute();
//
//
//		}
		
		public static void deleteresourcemetadata(NString abspath,NString metadatans,NString metadataname,NInteger deleteOption) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB.DELETERESOURCEMETADATA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ABSPATH", abspath);
			cmd.addParameter("@METADATANS", metadatans);
			cmd.addParameter("@METADATANAME", metadataname);
			cmd.addParameter("@DELETE_OPTION", deleteOption);
				
			cmd.execute();


		}
		
		public static void deleteschemalocmapping(NString schemaurl) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB.DELETESCHEMALOCMAPPING", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SCHEMAURL", schemaurl);
				
			cmd.execute();


		}
		
		public static void deleteservlet(NString _name) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB.DELETESERVLET", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NAME", _name);
				
			cmd.execute();


		}
		
		public static void deleteservletmapping(NString _name) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB.DELETESERVLETMAPPING", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NAME", _name);
				
			cmd.execute();


		}
		
		public static void deleteservletsecrole(NString servname,NString rolename) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB.DELETESERVLETSECROLE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SERVNAME", servname);
			cmd.addParameter("@ROLENAME", rolename);
				
			cmd.execute();


		}
		
		public static void deletexmlextension(NString extension) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB.DELETEXMLEXTENSION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EXTENSION", extension);
				
			cmd.execute();


		}
		
		public static NBool Fexistsresource(NString abspath) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB.EXISTSRESOURCE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@ABSPATH", abspath);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
//		public static  Fgetacldocument(NString abspath) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB.GETACLDOCUMENT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@ABSPATH", abspath);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
		public static NBlob Fgetcontentblob(NString abspath,Ref<NInteger> csid,NBool locksrc) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB.GETCONTENTBLOB", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBlob.class);
			cmd.addParameter("@ABSPATH", abspath);
			cmd.addParameter("@CSID", NInteger.class);
			cmd.addParameter("@LOCKSRC", locksrc);
				
			cmd.execute();
			csid.val = cmd.getParameterValue("@CSID", NInteger.class);

			return cmd.getReturnValue(NBlob.class);

		}
		
		public static NString Fgetcontentclob(NString abspath) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB.GETCONTENTCLOB", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@ABSPATH", abspath);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString Fgetcontentvarchar2(NString abspath) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB.GETCONTENTVARCHAR2", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@ABSPATH", abspath);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static  Fgetcontentxmlref(NString abspath) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB.GETCONTENTXMLREF", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@ABSPATH", abspath);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
//		public static  Fgetcontentxmltype(NString abspath) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB.GETCONTENTXMLTYPE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@ABSPATH", abspath);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
		public static NNumber Fgetftpport() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB.GETFTPPORT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber Fgethttpport() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB.GETHTTPPORT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void getlistenerendpoint(NNumber endpoint,Ref<NString> host,Ref<NNumber> port,Ref<NNumber> protocol) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB.GETLISTENERENDPOINT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ENDPOINT", endpoint);
			cmd.addParameter("@HOST", NString.class);
			cmd.addParameter("@PORT", NNumber.class);
			cmd.addParameter("@PROTOCOL", NNumber.class);
				
			cmd.execute();
			host.val = cmd.getParameterValue("@HOST", NString.class);
			port.val = cmd.getParameterValue("@PORT", NNumber.class);
			protocol.val = cmd.getParameterValue("@PROTOCOL", NNumber.class);


		}
		
		public static void getlocktoken(NString abspath,Ref<NString> locktoken) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB.GETLOCKTOKEN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ABSPATH", abspath);
			cmd.addParameter("@LOCKTOKEN", NString.class);
				
			cmd.execute();
			locktoken.val = cmd.getParameterValue("@LOCKTOKEN", NString.class);


		}
		
//		public static List<LocktokenlisttypeRow> Fgetlocktokenlist() {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB.GETLOCKTOKENLIST", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<LocktokenlisttypeRow>.class);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<LocktokenlisttypeRow>.class);
//
//		}
		
//		public static  Fgetprivileges(NString resPath) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB.GETPRIVILEGES", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@RES_PATH", resPath);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
		public static byte[] Fgetresoid(NString abspath) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB.GETRESOID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(byte[].class);
			cmd.addParameter("@ABSPATH", abspath);
				
			cmd.execute();

			return cmd.getReturnValue(byte[].class);

		}
		
		public static XdbresourceRow Fgetresource(NString abspath) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB.GETRESOURCE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DbTypes.createStructType(XdbresourceRow.class));
			cmd.addParameter("@ABSPATH", abspath);
				
			cmd.execute();

			return cmd.getReturnValue(XdbresourceRow.class);

		}
		
		public static NString FgetxdbTablespace() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB.GETXDB_TABLESPACE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool Fhasblobcontent(NString abspath) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB.HASBLOBCONTENT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@ABSPATH", abspath);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool Fhascharcontent(NString abspath) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB.HASCHARCONTENT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@ABSPATH", abspath);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool Fhasxmlcontent(NString abspath) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB.HASXMLCONTENT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@ABSPATH", abspath);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool Fhasxmlreference(NString abspath) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB.HASXMLREFERENCE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@ABSPATH", abspath);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool Fisfolder(NString abspath) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB.ISFOLDER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@ABSPATH", abspath);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void link(NString srcpath,NString linkfolder,NString linkname,NInteger linktype) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB.LINK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SRCPATH", srcpath);
			cmd.addParameter("@LINKFOLDER", linkfolder);
			cmd.addParameter("@LINKNAME", linkname);
			cmd.addParameter("@LINKTYPE", linktype);
				
			cmd.execute();


		}
		
//		public static  Flockdiscovery(NString abspath) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB.LOCKDISCOVERY", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@ABSPATH", abspath);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
		public static NBool Flockresource(NString abspath,NBool depthzero,NBool shared) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB.LOCKRESOURCE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@ABSPATH", abspath);
			cmd.addParameter("@DEPTHZERO", depthzero);
			cmd.addParameter("@SHARED", shared);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool Flockresource(NString abspath,NBool depthzero,NBool shared,Ref<NString> token,NInteger timeout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB.LOCKRESOURCE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@ABSPATH", abspath);
			cmd.addParameter("@DEPTHZERO", depthzero);
			cmd.addParameter("@SHARED", shared);
			cmd.addParameter("@TOKEN", NString.class);
			cmd.addParameter("@TIMEOUT", timeout);
				
			cmd.execute();
			token.val = cmd.getParameterValue("@TOKEN", NString.class);

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void migrateallxmlfrom9201() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB.MIGRATEALLXMLFROM9201", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void migratecolumnfrom9201(NString ownerIn,NString tableNameIn,NString columnNameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB.MIGRATECOLUMNFROM9201", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OWNER_IN", ownerIn);
			cmd.addParameter("@TABLE_NAME_IN", tableNameIn);
			cmd.addParameter("@COLUMN_NAME_IN", columnNameIn);
				
			cmd.execute();


		}
		
		public static void migratetablefrom9201(NString owner,NString tableName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB.MIGRATETABLEFROM9201", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OWNER", owner);
			cmd.addParameter("@TABLE_NAME", tableName);
				
			cmd.execute();


		}
		
		public static void movexdbTablespace(NString newTablespace) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB.MOVEXDB_TABLESPACE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_TABLESPACE", newTablespace);
				
			cmd.execute();


		}
		
		public static byte[] Fnfsfh2resid(byte[] fh) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB.NFSFH2RESID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(byte[].class);
			cmd.addParameter("@FH", fh);
				
			cmd.execute();

			return cmd.getReturnValue(byte[].class);

		}
		
		public static void processlinks(NString abspath,NBool recurse) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB.PROCESSLINKS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ABSPATH", abspath);
			cmd.addParameter("@RECURSE", recurse);
				
			cmd.execute();


		}
		
		public static void purgeresourcemetadata(NString abspath) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB.PURGERESOURCEMETADATA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ABSPATH", abspath);
				
			cmd.execute();


		}
		
		public static void rebuildhierarchicalindex() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB.REBUILDHIERARCHICALINDEX", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void refreshcontentsize(NString abspath,NBool recurse) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB.REFRESHCONTENTSIZE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ABSPATH", abspath);
			cmd.addParameter("@RECURSE", recurse);
				
			cmd.execute();


		}
		
		public static void refreshlock(NString abspath,NString token,NInteger newtimeout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB.REFRESHLOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ABSPATH", abspath);
			cmd.addParameter("@TOKEN", token);
			cmd.addParameter("@NEWTIMEOUT", newtimeout);
				
			cmd.execute();


		}
		
		public static void renameresource(NString srcpath,NString destfolder,NString newname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB.RENAMERESOURCE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SRCPATH", srcpath);
			cmd.addParameter("@DESTFOLDER", destfolder);
			cmd.addParameter("@NEWNAME", newname);
				
			cmd.execute();


		}
		
		public static void setacl(NString resPath,NString aclPath) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB.SETACL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RES_PATH", resPath);
			cmd.addParameter("@ACL_PATH", aclPath);
				
			cmd.execute();


		}
		
		public static void setftpport(NNumber newPort) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB.SETFTPPORT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_PORT", newPort);
				
			cmd.execute();


		}
		
		public static void sethttpport(NNumber newPort) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB.SETHTTPPORT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_PORT", newPort);
				
			cmd.execute();


		}
		
		public static void setlistenerendpoint(NNumber endpoint,NString host,NNumber port,NNumber protocol) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB.SETLISTENERENDPOINT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ENDPOINT", endpoint);
			cmd.addParameter("@HOST", host);
			cmd.addParameter("@PORT", port);
			cmd.addParameter("@PROTOCOL", protocol);
				
			cmd.execute();


		}
		
		public static void setlistenerlocalaccess(NBool lAccess) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB.SETLISTENERLOCALACCESS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@L_ACCESS", lAccess);
				
			cmd.execute();


		}
		
		public static void syncresource(byte[] resid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB.SYNCRESOURCE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RESID", resid);
				
			cmd.execute();


		}
		
		public static void touchresource(NString abspath) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB.TOUCHRESOURCE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ABSPATH", abspath);
				
			cmd.execute();


		}
		
//		public static NBool Funlockresource(NString abspath,NString deltoken) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB.UNLOCKRESOURCE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NBool.class);
//			cmd.addParameter("@ABSPATH", abspath);
//			cmd.addParameter("@DELTOKEN", deltoken);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NBool.class);
//
//		}
		
//		public static void updateresourcemetadata(NString abspath, oldmetadata, newmetadata) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB.UPDATERESOURCEMETADATA", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@ABSPATH", abspath);
//			cmd.addParameter("@OLDMETADATA", oldmetadata);
//			cmd.addParameter("@NEWMETADATA", newmetadata);
//				
//			cmd.execute();
//
//
//		}
		
//		public static void updateresourcemetadata(NString abspath, oldmetadata, newmetadata) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB.UPDATERESOURCEMETADATA", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@ABSPATH", abspath);
//			cmd.addParameter("@OLDMETADATA", oldmetadata);
//			cmd.addParameter("@NEWMETADATA", newmetadata);
//				
//			cmd.execute();
//
//
//		}
		
//		public static void updateresourcemetadata(NString abspath,NString oldns,NString oldname, newmetadata) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB.UPDATERESOURCEMETADATA", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@ABSPATH", abspath);
//			cmd.addParameter("@OLDNS", oldns);
//			cmd.addParameter("@OLDNAME", oldname);
//			cmd.addParameter("@NEWMETADATA", newmetadata);
//				
//			cmd.execute();
//
//
//		}
		
//		public static void updateresourcemetadata(NString abspath,NString oldns,NString oldname, newmetadata) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB.UPDATERESOURCEMETADATA", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@ABSPATH", abspath);
//			cmd.addParameter("@OLDNS", oldns);
//			cmd.addParameter("@OLDNAME", oldname);
//			cmd.addParameter("@NEWMETADATA", newmetadata);
//				
//			cmd.execute();
//
//
//		}
		
	
	
	
}
