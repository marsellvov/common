package net.hedtech.general.common.dbservices;

import java.util.*;

import oracle.sql.BFILE;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class DbmsXdbresource {
		public static void freeresource(XdbresourceRow res) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBRESOURCE.FREERESOURCE", DbManager.getDataBaseFactory());
			
			cmd.addParameter(DbTypes.createStructType("RES", res, XdbresourceRow.class ));
				
			cmd.execute();


		}
		
		public static NString Fgetacl(XdbresourceRow res) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBRESOURCE.GETACL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("RES", res, XdbresourceRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static  Fgetacldocfromres(XdbresourceRow res) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBRESOURCE.GETACLDOCFROMRES", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter(DbTypes.createStructType("RES", res, XdbresourceRow.class ));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
		public static NString Fgetauthor(XdbresourceRow res) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBRESOURCE.GETAUTHOR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("RES", res, XdbresourceRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString Fgetcharacterset(XdbresourceRow res) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBRESOURCE.GETCHARACTERSET", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("RES", res, XdbresourceRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString Fgetcomment(XdbresourceRow res) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBRESOURCE.GETCOMMENT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("RES", res, XdbresourceRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBlob Fgetcontentblob(XdbresourceRow res,Ref<NInteger> csid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBRESOURCE.GETCONTENTBLOB", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBlob.class);
			cmd.addParameter(DbTypes.createStructType("RES", res, XdbresourceRow.class ));
			cmd.addParameter("@CSID", NInteger.class);
				
			cmd.execute();
			csid.val = cmd.getParameterValue("@CSID", NInteger.class);

			return cmd.getReturnValue(NBlob.class);

		}
		
		public static NString Fgetcontentclob(XdbresourceRow res) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBRESOURCE.GETCONTENTCLOB", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("RES", res, XdbresourceRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static  Fgetcontentref(XdbresourceRow res) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBRESOURCE.GETCONTENTREF", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter(DbTypes.createStructType("RES", res, XdbresourceRow.class ));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
		public static NString Fgetcontenttype(XdbresourceRow res) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBRESOURCE.GETCONTENTTYPE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("RES", res, XdbresourceRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString Fgetcontentvarchar2(XdbresourceRow res) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBRESOURCE.GETCONTENTVARCHAR2", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("RES", res, XdbresourceRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static  Fgetcontentxml(XdbresourceRow res) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBRESOURCE.GETCONTENTXML", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter(DbTypes.createStructType("RES", res, XdbresourceRow.class ));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
//		public static  Fgetcreationdate(XdbresourceRow res) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBRESOURCE.GETCREATIONDATE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter(DbTypes.createStructType("RES", res, XdbresourceRow.class ));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
		public static NString Fgetcreator(XdbresourceRow res) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBRESOURCE.GETCREATOR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("RES", res, XdbresourceRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static  Fgetcustommetadata(XdbresourceRow res,NString xpath,NString _namespace) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBRESOURCE.GETCUSTOMMETADATA", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter(DbTypes.createStructType("RES", res, XdbresourceRow.class ));
//			cmd.addParameter("@XPATH", xpath);
//			cmd.addParameter("@NAMESPACE", _namespace);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
		public static NString Fgetdisplayname(XdbresourceRow res) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBRESOURCE.GETDISPLAYNAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("RES", res, XdbresourceRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString Fgetlanguage(XdbresourceRow res) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBRESOURCE.GETLANGUAGE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("RES", res, XdbresourceRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString Fgetlastmodifier(XdbresourceRow res) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBRESOURCE.GETLASTMODIFIER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("RES", res, XdbresourceRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static  Fgetmodificationdate(XdbresourceRow res) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBRESOURCE.GETMODIFICATIONDATE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter(DbTypes.createStructType("RES", res, XdbresourceRow.class ));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
		public static NString Fgetowner(XdbresourceRow res) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBRESOURCE.GETOWNER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("RES", res, XdbresourceRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NInteger Fgetrefcount(XdbresourceRow res) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBRESOURCE.GETREFCOUNT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
			cmd.addParameter(DbTypes.createStructType("RES", res, XdbresourceRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NInteger Fgetversionid(XdbresourceRow res) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBRESOURCE.GETVERSIONID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
			cmd.addParameter(DbTypes.createStructType("RES", res, XdbresourceRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NBool Fhasaclchanged(XdbresourceRow res) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBRESOURCE.HASACLCHANGED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter(DbTypes.createStructType("RES", res, XdbresourceRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool Fhasauthorchanged(XdbresourceRow res) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBRESOURCE.HASAUTHORCHANGED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter(DbTypes.createStructType("RES", res, XdbresourceRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool Fhaschanged(XdbresourceRow res,NString xpath,NString bnamespace) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBRESOURCE.HASCHANGED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter(DbTypes.createStructType("RES", res, XdbresourceRow.class ));
			cmd.addParameter("@XPATH", xpath);
			cmd.addParameter("@BNAMESPACE", bnamespace);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool Fhascharactersetchanged(XdbresourceRow res) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBRESOURCE.HASCHARACTERSETCHANGED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter(DbTypes.createStructType("RES", res, XdbresourceRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool Fhascommentchanged(XdbresourceRow res) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBRESOURCE.HASCOMMENTCHANGED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter(DbTypes.createStructType("RES", res, XdbresourceRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool Fhascontentchanged(XdbresourceRow res) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBRESOURCE.HASCONTENTCHANGED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter(DbTypes.createStructType("RES", res, XdbresourceRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool Fhascontenttypechanged(XdbresourceRow res) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBRESOURCE.HASCONTENTTYPECHANGED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter(DbTypes.createStructType("RES", res, XdbresourceRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool Fhascreationdatechanged(XdbresourceRow res) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBRESOURCE.HASCREATIONDATECHANGED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter(DbTypes.createStructType("RES", res, XdbresourceRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool Fhascreatorchanged(XdbresourceRow res) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBRESOURCE.HASCREATORCHANGED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter(DbTypes.createStructType("RES", res, XdbresourceRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool Fhascustommetadatachanged(XdbresourceRow res) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBRESOURCE.HASCUSTOMMETADATACHANGED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter(DbTypes.createStructType("RES", res, XdbresourceRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool Fhasdisplaynamechanged(XdbresourceRow res) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBRESOURCE.HASDISPLAYNAMECHANGED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter(DbTypes.createStructType("RES", res, XdbresourceRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool Fhaslanguagechanged(XdbresourceRow res) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBRESOURCE.HASLANGUAGECHANGED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter(DbTypes.createStructType("RES", res, XdbresourceRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool Fhaslastmodifierchanged(XdbresourceRow res) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBRESOURCE.HASLASTMODIFIERCHANGED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter(DbTypes.createStructType("RES", res, XdbresourceRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool Fhasmodificationdatechanged(XdbresourceRow res) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBRESOURCE.HASMODIFICATIONDATECHANGED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter(DbTypes.createStructType("RES", res, XdbresourceRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool Fhasownerchanged(XdbresourceRow res) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBRESOURCE.HASOWNERCHANGED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter(DbTypes.createStructType("RES", res, XdbresourceRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool Fhasrefcountchanged(XdbresourceRow res) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBRESOURCE.HASREFCOUNTCHANGED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter(DbTypes.createStructType("RES", res, XdbresourceRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool Fhasversionidchanged(XdbresourceRow res) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBRESOURCE.HASVERSIONIDCHANGED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter(DbTypes.createStructType("RES", res, XdbresourceRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool Fisfolder(XdbresourceRow res) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBRESOURCE.ISFOLDER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter(DbTypes.createStructType("RES", res, XdbresourceRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool Fisnull(XdbresourceRow res) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBRESOURCE.ISNULL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter(DbTypes.createStructType("RES", res, XdbresourceRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
//		public static DomdocumentRow Fmakedocument(XdbresourceRow res) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBRESOURCE.MAKEDOCUMENT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(DbTypes.createStructType(DomdocumentRow.class));
//			cmd.addParameter(DbTypes.createStructType("RES", res, XdbresourceRow.class ));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(DomdocumentRow.class);
//
//		}
		
		public static void save(XdbresourceRow res) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBRESOURCE.SAVE", DbManager.getDataBaseFactory());
			
			cmd.addParameter(DbTypes.createStructType("RES", res, XdbresourceRow.class ));
				
			cmd.execute();


		}
		
		public static void setacl(Ref<XdbresourceRow> res,NString aclpath) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBRESOURCE.SETACL", DbManager.getDataBaseFactory());
			
			cmd.addParameter(DbTypes.createStructType("RES", res.val, XdbresourceRow.class, true));
			cmd.addParameter("@ACLPATH", aclpath);
				
			cmd.execute();
			res.val = cmd.getParameterValue("@RES", XdbresourceRow.class);


		}
		
		public static void setauthor(Ref<XdbresourceRow> res,NString author) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBRESOURCE.SETAUTHOR", DbManager.getDataBaseFactory());
			
			cmd.addParameter(DbTypes.createStructType("RES", res.val, XdbresourceRow.class, true));
			cmd.addParameter("@AUTHOR", author);
				
			cmd.execute();
			res.val = cmd.getParameterValue("@RES", XdbresourceRow.class);


		}
		
		public static void setcharacterset(Ref<XdbresourceRow> res,NString charset) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBRESOURCE.SETCHARACTERSET", DbManager.getDataBaseFactory());
			
			cmd.addParameter(DbTypes.createStructType("RES", res.val, XdbresourceRow.class, true));
			cmd.addParameter("@CHARSET", charset);
				
			cmd.execute();
			res.val = cmd.getParameterValue("@RES", XdbresourceRow.class);


		}
		
//		public static void setcomment(Ref<XdbresourceRow> res,NString comment) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBRESOURCE.SETCOMMENT", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter(DbTypes.createStructType("RES", res.val, XdbresourceRow.class, true));
//			cmd.addParameter("@COMMENT", comment);
//				
//			cmd.execute();
//			res.val = cmd.getParameterValue("@RES", XdbresourceRow.class);
//
//
//		}
		
//		public static void setcontent(Ref<XdbresourceRow> res,NString data) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBRESOURCE.SETCONTENT", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter(DbTypes.createStructType("RES", res.val, XdbresourceRow.class, true));
//			cmd.addParameter("@DATA", data);
//				
//			cmd.execute();
//			res.val = cmd.getParameterValue("@RES", XdbresourceRow.class);
//
//
//		}
		
		public static void setcontent(Ref<XdbresourceRow> res,NBlob data,NInteger csid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBRESOURCE.SETCONTENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter(DbTypes.createStructType("RES", res.val, XdbresourceRow.class, true));
			cmd.addParameter("@DATA", data);
			cmd.addParameter("@CSID", csid);
				
			cmd.execute();
			res.val = cmd.getParameterValue("@RES", XdbresourceRow.class);


		}
		
//		public static void setcontent(Ref<XdbresourceRow> res, data) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBRESOURCE.SETCONTENT", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter(DbTypes.createStructType("RES", res.val, XdbresourceRow.class, true));
//			cmd.addParameter("@DATA", data);
//				
//			cmd.execute();
//			res.val = cmd.getParameterValue("@RES", XdbresourceRow.class);
//
//
//		}
		
		public static void setcontent(Ref<XdbresourceRow> res,NString data) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBRESOURCE.SETCONTENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter(DbTypes.createStructType("RES", res.val, XdbresourceRow.class, true));
			cmd.addParameter("@DATA", data);
				
			cmd.execute();
			res.val = cmd.getParameterValue("@RES", XdbresourceRow.class);


		}
		
//		public static void setcontent(Ref<XdbresourceRow> res, data,NBool sticky) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBRESOURCE.SETCONTENT", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter(DbTypes.createStructType("RES", res.val, XdbresourceRow.class, true));
//			cmd.addParameter("@DATA", data);
//			cmd.addParameter("@STICKY", sticky);
//				
//			cmd.execute();
//			res.val = cmd.getParameterValue("@RES", XdbresourceRow.class);
//
//
//		}
		
		public static void setcontent(Ref<XdbresourceRow> res, BFILE data,NInteger csidBfile) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBRESOURCE.SETCONTENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter(DbTypes.createStructType("RES", res.val, XdbresourceRow.class, true));
			cmd.addParameter("@DATA", data);
			cmd.addParameter("@CSID_BFILE", csidBfile);
				
			cmd.execute();
			res.val = cmd.getParameterValue("@RES", XdbresourceRow.class);


		}
		
		public static void setcontenttype(Ref<XdbresourceRow> res,NString conttype) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBRESOURCE.SETCONTENTTYPE", DbManager.getDataBaseFactory());
			
			cmd.addParameter(DbTypes.createStructType("RES", res.val, XdbresourceRow.class, true));
			cmd.addParameter("@CONTTYPE", conttype);
				
			cmd.execute();
			res.val = cmd.getParameterValue("@RES", XdbresourceRow.class);


		}
		
//		public static void setcustommetadata(XdbresourceRow res,NString xpath,NString _namespace, newmetadata) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBRESOURCE.SETCUSTOMMETADATA", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter(DbTypes.createStructType("RES", res, XdbresourceRow.class ));
//			cmd.addParameter("@XPATH", xpath);
//			cmd.addParameter("@NAMESPACE", _namespace);
//			cmd.addParameter("@NEWMETADATA", newmetadata);
//				
//			cmd.execute();
//
//
//		}
		
		public static void setdisplayname(Ref<XdbresourceRow> res,NString _name) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBRESOURCE.SETDISPLAYNAME", DbManager.getDataBaseFactory());
			
			cmd.addParameter(DbTypes.createStructType("RES", res.val, XdbresourceRow.class, true));
			cmd.addParameter("@NAME", _name);
				
			cmd.execute();
			res.val = cmd.getParameterValue("@RES", XdbresourceRow.class);


		}
		
		public static void setlanguage(Ref<XdbresourceRow> res,NString lang) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBRESOURCE.SETLANGUAGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter(DbTypes.createStructType("RES", res.val, XdbresourceRow.class, true));
			cmd.addParameter("@LANG", lang);
				
			cmd.execute();
			res.val = cmd.getParameterValue("@RES", XdbresourceRow.class);


		}
		
		public static void setowner(Ref<XdbresourceRow> res,NString owner) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBRESOURCE.SETOWNER", DbManager.getDataBaseFactory());
			
			cmd.addParameter(DbTypes.createStructType("RES", res.val, XdbresourceRow.class, true));
			cmd.addParameter("@OWNER", owner);
				
			cmd.execute();
			res.val = cmd.getParameterValue("@RES", XdbresourceRow.class);


		}
		
	
	
	@DbRecordType(id="XdbresourceRow", dataSourceName="XDBRESOURCE")
	public static class XdbresourceRow
	{
		@DbRecordField(dataSourceName="ID")
		public byte[] Id;
	}

	
	
}
