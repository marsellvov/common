package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SdoWfsProcess {
		public static NNumber Fcontainssdo(NString ns,NString _name,NNumber ftid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_WFS_PROCESS.CONTAINSSDO", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@NS", ns);
			cmd.addParameter("@NAME", _name);
			cmd.addParameter("@FTID", ftid);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber Fcontainssdointernal(NString rootns,NString rootname,NString ns,NString _name,NNumber ftid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_WFS_PROCESS.CONTAINSSDOINTERNAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@ROOTNS", rootns);
			cmd.addParameter("@ROOTNAME", rootname);
			cmd.addParameter("@NS", ns);
			cmd.addParameter("@NAME", _name);
			cmd.addParameter("@FTID", ftid);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void deletecapabilitiesinfo() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_WFS_PROCESS.DELETECAPABILITIESINFO", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void deletefeaturetypexmlinfo(NNumber ftypeid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_WFS_PROCESS.DELETEFEATURETYPEXMLINFO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@FTYPEID", ftypeid);
				
			cmd.execute();


		}
		
		public static void dropfeaturetype(NString ftnsurl,NString ftname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_WFS_PROCESS.DROPFEATURETYPE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@FTNSURL", ftnsurl);
			cmd.addParameter("@FTNAME", ftname);
				
			cmd.execute();


		}
		
		public static void dropfeaturetypes(NString ftnsurl) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_WFS_PROCESS.DROPFEATURETYPES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@FTNSURL", ftnsurl);
				
			cmd.execute();


		}
		
//		public static List<StringlistRow> Fenumeratearrpaths(NString pathpattern,NString nsparam, data) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_WFS_PROCESS.ENUMERATEARRPATHS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<StringlistRow>.class);
//			cmd.addParameter("@PATHPATTERN", pathpattern);
//			cmd.addParameter("@NSPARAM", nsparam);
//			cmd.addParameter("@DATA", data);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<StringlistRow>.class);
//
//		}
		
		public static NString Fexpandpath(NString aliasedpath,NString nsparam) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_WFS_PROCESS.EXPANDPATH", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@ALIASEDPATH", aliasedpath);
			cmd.addParameter("@NSPARAM", nsparam);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static NString Fextractid( xmldata,List<StringlistRow> idpaths) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_WFS_PROCESS.EXTRACTID", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@XMLDATA", xmldata);
//			// cmd.addParameter(DbTypes.getCollectionType("IDPATHS", "", idpaths, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
		
//		public static List<SdoGeomPathInfoRow> Fextractsdo( xmldata,List<StringlistRow> spatialpaths,NString srsns,NString isgml3,List<StringlistlistRow> sppathssrsnslist) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_WFS_PROCESS.EXTRACTSDO", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoGeomPathInfoRow>.class);
//			cmd.addParameter("@XMLDATA", xmldata);
//			// cmd.addParameter(DbTypes.getCollectionType("SPATIALPATHS", "", spatialpaths, object.class));
//			cmd.addParameter("@SRSNS", srsns);
//			cmd.addParameter("@ISGML3", isgml3);
//			// cmd.addParameter(DbTypes.getCollectionType("SPPATHSSRSNSLIST", "", sppathssrsnslist, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoGeomPathInfoRow>.class);
//
//		}
		
//		public static NString findnsurl(NString nsalias,List<StringlistRow> nsaliaslist,List<StringlistRow> nsurllist) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_WFS_PROCESS.FINDNSURL", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@NSALIAS", nsalias);
//			// cmd.addParameter(DbTypes.getCollectionType("NSALIASLIST", "", nsaliaslist, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("NSURLLIST", "", nsurllist, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
		
		public static void gencollectionprocs() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_WFS_PROCESS.GENCOLLECTIONPROCS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void gencollectionprocshelper(NString objns,NString objname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_WFS_PROCESS.GENCOLLECTIONPROCSHELPER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OBJNS", objns);
			cmd.addParameter("@OBJNAME", objname);
				
			cmd.execute();


		}
		
//		public static NString Fgeneratealiasstring(List<StringlistRow> aliaslist) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_WFS_PROCESS.GENERATEALIASSTRING", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			// cmd.addParameter(DbTypes.getCollectionType("ALIASLIST", "", aliaslist, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
		
//		public static List<StringlistlistRow> Fgenerateparsedspatialpath(List<StringlistRow> spatialpaths) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_WFS_PROCESS.GENERATEPARSEDSPATIALPATH", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<StringlistlistRow>.class);
//			// cmd.addParameter(DbTypes.getCollectionType("SPATIALPATHS", "", spatialpaths, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<StringlistlistRow>.class);
//
//		}
		
//		public static NString Fgenidvalue( data,List<StringlistRow> idpaths,NString tns,NString tname) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_WFS_PROCESS.GENIDVALUE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@DATA", data);
//			// cmd.addParameter(DbTypes.getCollectionType("IDPATHS", "", idpaths, object.class));
//			cmd.addParameter("@TNS", tns);
//			cmd.addParameter("@TNAME", tname);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
		
		public static void genrecordtypeprocessinglogic(NString tns,NString tname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_WFS_PROCESS.GENRECORDTYPEPROCESSINGLOGIC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TNS", tns);
			cmd.addParameter("@TNAME", tname);
				
			cmd.execute();


		}
		
//		public static List<SdoGeomPathInfoListRow> Fgenspatialarrinfo(NString tablenameprefix,NString pkval,List<StringlistlistRow> lSpatialarrlist, data,NString srsns,NString spatialarrupdmap,NString isgml3,List<StringlistlistRow> sparrpathssrsnslist) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_WFS_PROCESS.GENSPATIALARRINFO", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoGeomPathInfoListRow>.class);
//			cmd.addParameter("@TABLENAMEPREFIX", tablenameprefix);
//			cmd.addParameter("@PKVAL", pkval);
//			// cmd.addParameter(DbTypes.getCollectionType("L_SPATIALARRLIST", "", lSpatialarrlist, object.class));
//			cmd.addParameter("@DATA", data);
//			cmd.addParameter("@SRSNS", srsns);
//			cmd.addParameter("@SPATIALARRUPDMAP", spatialarrupdmap);
//			cmd.addParameter("@ISGML3", isgml3);
//			// cmd.addParameter(DbTypes.getCollectionType("SPARRPATHSSRSNSLIST", "", sparrpathssrsnslist, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoGeomPathInfoListRow>.class);
//
//		}
		
//		public static NNumber Fgenspatialpathelemcolindex(List<StringlistRow> spatialpaths, spatialpathelem) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_WFS_PROCESS.GENSPATIALPATHELEMCOLINDEX", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			// cmd.addParameter(DbTypes.getCollectionType("SPATIALPATHS", "", spatialpaths, object.class));
//			cmd.addParameter("@SPATIALPATHELEM", spatialpathelem);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
		
//		public static NString Fgetalias(NString nsurl,List<StringlistRow> aliaslist) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_WFS_PROCESS.GETALIAS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@NSURL", nsurl);
//			// cmd.addParameter(DbTypes.getCollectionType("ALIASLIST", "", aliaslist, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
		
//		public static NNumber Fgetcount(NString pathpattern,NString nsparam, data) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_WFS_PROCESS.GETCOUNT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@PATHPATTERN", pathpattern);
//			cmd.addParameter("@NSPARAM", nsparam);
//			cmd.addParameter("@DATA", data);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
		
		public static NNumber Fgetfeaturetypeid(NString ftnsurl,NString ftname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_WFS_PROCESS.GETFEATURETYPEID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@FTNSURL", ftnsurl);
			cmd.addParameter("@FTNAME", ftname);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
//		public static List<StringlistRow> Fgetparsedpath(NString path) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_WFS_PROCESS.GETPARSEDPATH", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<StringlistRow>.class);
//			cmd.addParameter("@PATH", path);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<StringlistRow>.class);
//
//		}
//		
//		public static NString Fgetpath(List<StringlistRow> path) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_WFS_PROCESS.GETPATH", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			// cmd.addParameter(DbTypes.getCollectionType("PATH", "", path, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString Fgetupdatemap(List<StringlistlistRow> spatialarrlist) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_WFS_PROCESS.GETUPDATEMAP", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			// cmd.addParameter(DbTypes.getCollectionType("SPATIALARRLIST", "", spatialarrlist, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
		
		public static NString Fgetxmltagtype(NString typeowner,NString type) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_WFS_PROCESS.GETXMLTAGTYPE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TYPEOWNER", typeowner);
			cmd.addParameter("@TYPE", type);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void grantfeaturetypetouser(NString ftnsurl,NString ftname,NString username) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_WFS_PROCESS.GRANTFEATURETYPETOUSER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@FTNSURL", ftnsurl);
			cmd.addParameter("@FTNAME", ftname);
			cmd.addParameter("@USERNAME", username);
				
			cmd.execute();


		}
		
		public static void grantmdaccesstouser(NString username) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_WFS_PROCESS.GRANTMDACCESSTOUSER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@USERNAME", username);
				
			cmd.execute();


		}
		
		public static void insertcapabilitiesinfo(NString capabilitiesinfo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_WFS_PROCESS.INSERTCAPABILITIESINFO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CAPABILITIESINFO", capabilitiesinfo);
				
			cmd.execute();


		}
		
//		public static void insertftdataupdated(NString ns,NString _name,List<RowpointerlistRow> updatedrowlist, updatets) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_WFS_PROCESS.INSERTFTDATAUPDATED", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@NS", ns);
//			cmd.addParameter("@NAME", _name);
//			// cmd.addParameter(DbTypes.getCollectionType("UPDATEDROWLIST", "", updatedrowlist, object.class));
//			cmd.addParameter("@UPDATETS", updatets);
//				
//			cmd.execute();
//
//
//		}
		
//		public static void insertftmdupdated(NString ns,NString _name, updatets) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_WFS_PROCESS.INSERTFTMDUPDATED", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@NS", ns);
//			cmd.addParameter("@NAME", _name);
//			cmd.addParameter("@UPDATETS", updatets);
//				
//			cmd.execute();
//
//
//		}
		
		public static NNumber Fiscomplexobjecttype(NString elemtype,NString gmlalias) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_WFS_PROCESS.ISCOMPLEXOBJECTTYPE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@ELEMTYPE", elemtype);
			cmd.addParameter("@GMLALIAS", gmlalias);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
//		public static NNumber Fisinlist(List<StringlistRow> l,NString _item) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_WFS_PROCESS.ISINLIST", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			// cmd.addParameter(DbTypes.getCollectionType("L", "", l, object.class));
//			cmd.addParameter("@ITEM", _item);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
		
//		public static NNumber Fisrowidin( r,List<RowpointerlistRow> rlist) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_WFS_PROCESS.ISROWIDIN", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@R", r);
//			// cmd.addParameter(DbTypes.getCollectionType("RLIST", "", rlist, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
		
//		public static NNumber Fnotinarray(NString p,List<RowpointerlistRow> plist) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_WFS_PROCESS.NOTINARRAY", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@P", p);
//			// cmd.addParameter(DbTypes.getCollectionType("PLIST", "", plist, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
		
//		public static List<StringlistRow> Fparsepath(NString path) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_WFS_PROCESS.PARSEPATH", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<StringlistRow>.class);
//			cmd.addParameter("@PATH", path);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<StringlistRow>.class);
//
//		}
		
//		public static void populatefeaturetypexmlinfo( xmlcoltypexsd,NNumber ftypeid,NString columnname,List<StringlistRow> objpathinfo) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_WFS_PROCESS.POPULATEFEATURETYPEXMLINFO", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@XMLCOLTYPEXSD", xmlcoltypexsd);
//			cmd.addParameter("@FTYPEID", ftypeid);
//			cmd.addParameter("@COLUMNNAME", columnname);
//			// cmd.addParameter(DbTypes.getCollectionType("OBJPATHINFO", "", objpathinfo, object.class));
//				
//			cmd.execute();
//
//
//		}
		
//		public static void processcomplexelement( ftxsd,NString elementtype,Ref<List<StringlistRow>> spatialcols,Ref<NNumber> currgmlelementscnt,NNumber gmlelementscnt,NString parentelempath,NString gmlalias) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_WFS_PROCESS.PROCESSCOMPLEXELEMENT", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@FTXSD", ftxsd);
//			cmd.addParameter("@ELEMENTTYPE", elementtype);
//			// cmd.addParameter(DbTypes.getCollectionType("SPATIALCOLS", "", spatialcols.val, object.class , true));
//			cmd.addParameter("@CURRGMLELEMENTSCNT", currgmlelementscnt, true);
//			cmd.addParameter("@GMLELEMENTSCNT", gmlelementscnt);
//			cmd.addParameter("@PARENTELEMPATH", parentelempath);
//			cmd.addParameter("@GMLALIAS", gmlalias);
//				
//			cmd.execute();
//			// spatialcols.val = cmd.getTableParameterValue("@SPATIALCOLS", object.class);
//			currgmlelementscnt.val = cmd.getParameterValue("@CURRGMLELEMENTSCNT", NNumber.class);
//
//
//		}
		
//		public static List<StringlistRow> Fprocessidpath(List<StringlistRow> srcpaths) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_WFS_PROCESS.PROCESSIDPATH", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<StringlistRow>.class);
//			// cmd.addParameter(DbTypes.getCollectionType("SRCPATHS", "", srcpaths, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<StringlistRow>.class);
//
//		}
		
//		public static void processinlinecomplexelement( ftxsd, elementxml,NNumber elemindex,Ref<List<StringlistRow>> spatialcols,Ref<NNumber> currgmlelementscnt,NNumber gmlelementscnt,NString parentelempath,NString gmlalias) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_WFS_PROCESS.PROCESSINLINECOMPLEXELEMENT", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@FTXSD", ftxsd);
//			cmd.addParameter("@ELEMENTXML", elementxml);
//			cmd.addParameter("@ELEMINDEX", elemindex);
//			// cmd.addParameter(DbTypes.getCollectionType("SPATIALCOLS", "", spatialcols.val, object.class , true));
//			cmd.addParameter("@CURRGMLELEMENTSCNT", currgmlelementscnt, true);
//			cmd.addParameter("@GMLELEMENTSCNT", gmlelementscnt);
//			cmd.addParameter("@PARENTELEMPATH", parentelempath);
//			cmd.addParameter("@GMLALIAS", gmlalias);
//				
//			cmd.execute();
//			// spatialcols.val = cmd.getTableParameterValue("@SPATIALCOLS", object.class);
//			currgmlelementscnt.val = cmd.getParameterValue("@CURRGMLELEMENTSCNT", NNumber.class);
//
//
//		}
		
//		public static List<StringlistlistRow> Fprocesspath(List<StringlistlistRow> srcpaths,NNumber genarridx) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_WFS_PROCESS.PROCESSPATH", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<StringlistlistRow>.class);
//			// cmd.addParameter(DbTypes.getCollectionType("SRCPATHS", "", srcpaths, object.class));
//			cmd.addParameter("@GENARRIDX", genarridx);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<StringlistlistRow>.class);
//
//		}
		
//		public static void publishfeaturetype(NString datasrc,NString ftnsurl,NString ftname,NString ftnsalias, featuredesc,NString schemalocation,NString pkeycol,List<StringlistRow> columninfo,NString pspatialcol,NString featurememberns,NString featuremembername,NString srsns,NString srsnsalias,List<StringlistRow> mandatorycolumninfo) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_WFS_PROCESS.PUBLISHFEATURETYPE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@DATASRC", datasrc);
//			cmd.addParameter("@FTNSURL", ftnsurl);
//			cmd.addParameter("@FTNAME", ftname);
//			cmd.addParameter("@FTNSALIAS", ftnsalias);
//			cmd.addParameter("@FEATUREDESC", featuredesc);
//			cmd.addParameter("@SCHEMALOCATION", schemalocation);
//			cmd.addParameter("@PKEYCOL", pkeycol);
//			// cmd.addParameter(DbTypes.getCollectionType("COLUMNINFO", "", columninfo, object.class));
//			cmd.addParameter("@PSPATIALCOL", pspatialcol);
//			cmd.addParameter("@FEATUREMEMBERNS", featurememberns);
//			cmd.addParameter("@FEATUREMEMBERNAME", featuremembername);
//			cmd.addParameter("@SRSNS", srsns);
//			cmd.addParameter("@SRSNSALIAS", srsnsalias);
//			// cmd.addParameter(DbTypes.getCollectionType("MANDATORYCOLUMNINFO", "", mandatorycolumninfo, object.class));
//				
//			cmd.execute();
//
//
//		}
		
//		public static void publishfeaturetype(NString datasrc,NString ftnsurl,NString ftname,NString ftnsalias, featuredesc,NString schemalocation,NString pkeycol,List<StringlistRow> columninfo,NString pspatialcol,NString featurememberns,NString featuremembername,NString srsns,NString srsnsalias,NString viewtablename,NString viewtablepkeycol,List<StringlistRow> mandatorycolumninfo) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_WFS_PROCESS.PUBLISHFEATURETYPE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@DATASRC", datasrc);
//			cmd.addParameter("@FTNSURL", ftnsurl);
//			cmd.addParameter("@FTNAME", ftname);
//			cmd.addParameter("@FTNSALIAS", ftnsalias);
//			cmd.addParameter("@FEATUREDESC", featuredesc);
//			cmd.addParameter("@SCHEMALOCATION", schemalocation);
//			cmd.addParameter("@PKEYCOL", pkeycol);
//			// cmd.addParameter(DbTypes.getCollectionType("COLUMNINFO", "", columninfo, object.class));
//			cmd.addParameter("@PSPATIALCOL", pspatialcol);
//			cmd.addParameter("@FEATUREMEMBERNS", featurememberns);
//			cmd.addParameter("@FEATUREMEMBERNAME", featuremembername);
//			cmd.addParameter("@SRSNS", srsns);
//			cmd.addParameter("@SRSNSALIAS", srsnsalias);
//			cmd.addParameter("@VIEWTABLENAME", viewtablename);
//			cmd.addParameter("@VIEWTABLEPKEYCOL", viewtablepkeycol);
//			// cmd.addParameter(DbTypes.getCollectionType("MANDATORYCOLUMNINFO", "", mandatorycolumninfo, object.class));
//				
//			cmd.execute();
//
//
//		}
		
//		public static void publishfeaturetype(NString datasrc,NString ftnsurl,NString ftname,NString ftnsalias, featuredesc,NString schemalocation,NString pkeycol,List<StringlistRow> columninfo,NString pspatialcol,NString featurememberns,NString featuremembername,NString srsns,NString srsnsalias,NString featurecollectionns,NString featurecollectionname,NString isgml3,List<StringlistRow> formattedkeycols,NString viewtablename,NString viewtablepkeycol,List<StringlistRow> viewtablefmtkeycols,List<StringlistRow> mandatorycolumninfo) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_WFS_PROCESS.PUBLISHFEATURETYPE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@DATASRC", datasrc);
//			cmd.addParameter("@FTNSURL", ftnsurl);
//			cmd.addParameter("@FTNAME", ftname);
//			cmd.addParameter("@FTNSALIAS", ftnsalias);
//			cmd.addParameter("@FEATUREDESC", featuredesc);
//			cmd.addParameter("@SCHEMALOCATION", schemalocation);
//			cmd.addParameter("@PKEYCOL", pkeycol);
//			// cmd.addParameter(DbTypes.getCollectionType("COLUMNINFO", "", columninfo, object.class));
//			cmd.addParameter("@PSPATIALCOL", pspatialcol);
//			cmd.addParameter("@FEATUREMEMBERNS", featurememberns);
//			cmd.addParameter("@FEATUREMEMBERNAME", featuremembername);
//			cmd.addParameter("@SRSNS", srsns);
//			cmd.addParameter("@SRSNSALIAS", srsnsalias);
//			cmd.addParameter("@FEATURECOLLECTIONNS", featurecollectionns);
//			cmd.addParameter("@FEATURECOLLECTIONNAME", featurecollectionname);
//			cmd.addParameter("@ISGML3", isgml3);
//			// cmd.addParameter(DbTypes.getCollectionType("FORMATTEDKEYCOLS", "", formattedkeycols, object.class));
//			cmd.addParameter("@VIEWTABLENAME", viewtablename);
//			cmd.addParameter("@VIEWTABLEPKEYCOL", viewtablepkeycol);
//			// cmd.addParameter(DbTypes.getCollectionType("VIEWTABLEFMTKEYCOLS", "", viewtablefmtkeycols, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("MANDATORYCOLUMNINFO", "", mandatorycolumninfo, object.class));
//				
//			cmd.execute();
//
//
//		}
		
//		public static void publishfeaturetype( ftxsd, featuredesc) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_WFS_PROCESS.PUBLISHFEATURETYPE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@FTXSD", ftxsd);
//			cmd.addParameter("@FEATUREDESC", featuredesc);
//				
//			cmd.execute();
//
//
//		}
		
//		public static List<StringlistRow> Fputalias(NString nsurl,NString alias,List<StringlistRow> aliaslist) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_WFS_PROCESS.PUTALIAS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<StringlistRow>.class);
//			cmd.addParameter("@NSURL", nsurl);
//			cmd.addParameter("@ALIAS", alias);
//			// cmd.addParameter(DbTypes.getCollectionType("ALIASLIST", "", aliaslist, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<StringlistRow>.class);
//
//		}
		
//		public static void registermtableview(NString ftnsurl,NString ftname,List<StringlistRow> viewtablelist,List<StringlistRow> viewtablepkeycollist,List<StringlistRow> tablepkeycollist) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_WFS_PROCESS.REGISTERMTABLEVIEW", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@FTNSURL", ftnsurl);
//			cmd.addParameter("@FTNAME", ftname);
//			// cmd.addParameter(DbTypes.getCollectionType("VIEWTABLELIST", "", viewtablelist, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("VIEWTABLEPKEYCOLLIST", "", viewtablepkeycollist, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("TABLEPKEYCOLLIST", "", tablepkeycollist, object.class));
//				
//			cmd.execute();
//
//
//		}
		
//		public static void registermtableview(NString ftnsurl,NString ftname,List<StringlistRow> viewtablelist,List<StringlistRow> viewtablepkeycollist,List<StringlistlistRow> formattedviewtablecollist,List<StringlistRow> tablepkeycollist) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_WFS_PROCESS.REGISTERMTABLEVIEW", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@FTNSURL", ftnsurl);
//			cmd.addParameter("@FTNAME", ftname);
//			// cmd.addParameter(DbTypes.getCollectionType("VIEWTABLELIST", "", viewtablelist, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("VIEWTABLEPKEYCOLLIST", "", viewtablepkeycollist, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("FORMATTEDVIEWTABLECOLLIST", "", formattedviewtablecollist, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("TABLEPKEYCOLLIST", "", tablepkeycollist, object.class));
//				
//			cmd.execute();
//
//
//		}
		
//		public static void registerobject(NString objns,NString objname,NString ftnsurl,NString currobjcolpath,NNumber objnameindex,NNumber ftid,List<StringlistRow> spatialcolinfo,Ref<NNumber> spatialcolinfoindex) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_WFS_PROCESS.REGISTEROBJECT", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@OBJNS", objns);
//			cmd.addParameter("@OBJNAME", objname);
//			cmd.addParameter("@FTNSURL", ftnsurl);
//			cmd.addParameter("@CURROBJCOLPATH", currobjcolpath);
//			cmd.addParameter("@OBJNAMEINDEX", objnameindex);
//			cmd.addParameter("@FTID", ftid);
//			// cmd.addParameter(DbTypes.getCollectionType("SPATIALCOLINFO", "", spatialcolinfo, object.class));
//			cmd.addParameter("@SPATIALCOLINFOINDEX", spatialcolinfoindex, true);
//				
//			cmd.execute();
//			spatialcolinfoindex.val = cmd.getParameterValue("@SPATIALCOLINFOINDEX", NNumber.class);
//
//
//		}
		
		public static void revokefeaturetypefromuser(NString ftnsurl,NString ftname,NString username) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_WFS_PROCESS.REVOKEFEATURETYPEFROMUSER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@FTNSURL", ftnsurl);
			cmd.addParameter("@FTNAME", ftname);
			cmd.addParameter("@USERNAME", username);
				
			cmd.execute();


		}
		
		public static void revokemdaccessfromuser(NString username) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_WFS_PROCESS.REVOKEMDACCESSFROMUSER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@USERNAME", username);
				
			cmd.execute();


		}
		
//		public static List<SdoGeomPathInfoRow> Fsortspcontentbycolindex(List<StringlistRow> spatialpaths,List<SdoGeomPathInfoRow> spatialpathinfo,NString username,NString tablename) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_WFS_PROCESS.SORTSPCONTENTBYCOLINDEX", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoGeomPathInfoRow>.class);
//			// cmd.addParameter(DbTypes.getCollectionType("SPATIALPATHS", "", spatialpaths, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("SPATIALPATHINFO", "", spatialpathinfo, object.class));
//			cmd.addParameter("@USERNAME", username);
//			cmd.addParameter("@TABLENAME", tablename);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoGeomPathInfoRow>.class);
//
//		}
		
		public static void unregistermtableview(NString ftnsurl,NString ftname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_WFS_PROCESS.UNREGISTERMTABLEVIEW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@FTNSURL", ftnsurl);
			cmd.addParameter("@FTNAME", ftname);
				
			cmd.execute();


		}
		
		public static void updateobjectref(NString refobjns,NString refobjname,NNumber featuretypeid,NNumber refobjseqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_WFS_PROCESS.UPDATEOBJECTREF", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@REFOBJNS", refobjns);
			cmd.addParameter("@REFOBJNAME", refobjname);
			cmd.addParameter("@FEATURETYPEID", featuretypeid);
			cmd.addParameter("@REFOBJSEQNO", refobjseqno);
				
			cmd.execute();


		}
		
		public static void updateobjectref(NString refobjns,NString refobjname,NNumber refobjseqno,NString nsurl,NString containerobjns,NString containerobjname,NNumber containerobjnameindex,NNumber featuretypeid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_WFS_PROCESS.UPDATEOBJECTREF", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@REFOBJNS", refobjns);
			cmd.addParameter("@REFOBJNAME", refobjname);
			cmd.addParameter("@REFOBJSEQNO", refobjseqno);
			cmd.addParameter("@NSURL", nsurl);
			cmd.addParameter("@CONTAINEROBJNS", containerobjns);
			cmd.addParameter("@CONTAINEROBJNAME", containerobjname);
			cmd.addParameter("@CONTAINEROBJNAMEINDEX", containerobjnameindex);
			cmd.addParameter("@FEATURETYPEID", featuretypeid);
				
			cmd.execute();


		}
		
	
	
	
}
