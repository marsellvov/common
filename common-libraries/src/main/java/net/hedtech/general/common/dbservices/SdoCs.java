//package net.hedtech.general.common.dbservices;
//
//import java.util.*;
//import morphis.foundations.core.appdatalayer.*;
//import morphis.foundations.core.appdatalayer.data.*;
//import morphis.foundations.core.appdatalayer.data.types.*;
//import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
//import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
//import morphis.foundations.core.types.*;
//import morphis.foundations.core.util.Ref;
//
//
//public class SdoCs {
//		public static void addPreferenceForOp(NNumber opId,NNumber sourceCrs,NNumber targetCrs,NString useCase) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_CS.ADD_PREFERENCE_FOR_OP", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@OP_ID", opId);
//			cmd.addParameter("@SOURCE_CRS", sourceCrs);
//			cmd.addParameter("@TARGET_CRS", targetCrs);
//			cmd.addParameter("@USE_CASE", useCase);
//				
//			cmd.execute();
//
//
//		}
//		
//		public static NNumber Fconvert2dSridTo3d(NNumber srid2d,NNumber vertId,NString ellipsoidal,NNumber uomId) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_CS.CONVERT_2D_SRID_TO_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@SRID2D", srid2d);
//			cmd.addParameter("@VERT_ID", vertId);
//			cmd.addParameter("@ELLIPSOIDAL", ellipsoidal);
//			cmd.addParameter("@UOM_ID", uomId);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
////		public static  Fconvert2dTo3d(NNumber geom2d,NNumber height,NNumber vertId,NString ellipsoidal,NNumber uomId) {
////			
////			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_CS.CONVERT_2D_TO_3D", DbManager.getDataBaseFactory());
////			
////			cmd.addReturnParameter(NNumber.class);
////			cmd.addParameter("@GEOM2D", geom2d);
////			cmd.addParameter("@HEIGHT", height);
////			cmd.addParameter("@VERT_ID", vertId);
////			cmd.addParameter("@ELLIPSOIDAL", ellipsoidal);
////			cmd.addParameter("@UOM_ID", uomId);
////				
////			cmd.execute();
////
////			return cmd.getReturnValue(.class);
////
////		}
//		
//		public static NNumber FconvertMixedAxesUnits(NNumber srid,NNumber unitlessValue,NString outputUnit) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_CS.CONVERT_MIXED_AXES_UNITS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@SRID", srid);
//			cmd.addParameter("@UNITLESS_VALUE", unitlessValue);
//			cmd.addParameter("@OUTPUT_UNIT", outputUnit);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
//		public static void convertNadconToXml(NString laaClob,NString loaClob,Ref<> xmlGrid) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_CS.CONVERT_NADCON_TO_XML", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@LAA_CLOB", laaClob);
//			cmd.addParameter("@LOA_CLOB", loaClob);
//			cmd.addParameter("@XML_GRID", .class);
//				
//			cmd.execute();
//			xmlGrid.val = cmd.getParameterValue("@XML_GRID", .class);
//
//
//		}
//		
//		public static void convertNtv2ToXml(NString ntv2Clob,Ref<> xmlGrid) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_CS.CONVERT_NTV2_TO_XML", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@NTV2_CLOB", ntv2Clob);
//			cmd.addParameter("@XML_GRID", .class);
//				
//			cmd.execute();
//			xmlGrid.val = cmd.getParameterValue("@XML_GRID", .class);
//
//
//		}
//		
//		public static void convertNtv2ToXmlTable(NString ntv2Clob,Ref<NNumber> ntv2FileId) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_CS.CONVERT_NTV2_TO_XML_TABLE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@NTV2_CLOB", ntv2Clob);
//			cmd.addParameter("@NTV2_FILE_ID", NNumber.class);
//				
//			cmd.execute();
//			ntv2FileId.val = cmd.getParameterValue("@NTV2_FILE_ID", NNumber.class);
//
//
//		}
//		
//		public static void convertXmlTableToNtv2(NNumber ntv2FileId,Ref<NString> ntv2Clob) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_CS.CONVERT_XML_TABLE_TO_NTV2", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@NTV2_FILE_ID", ntv2FileId);
//			cmd.addParameter("@NTV2_CLOB", NString.class);
//				
//			cmd.execute();
//			ntv2Clob.val = cmd.getParameterValue("@NTV2_CLOB", NString.class);
//
//
//		}
//		
//		public static void convertXmlToNadcon( xmlGrid,Ref<NString> laaClob,Ref<NString> loaClob) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_CS.CONVERT_XML_TO_NADCON", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@XML_GRID", xmlGrid);
//			cmd.addParameter("@LAA_CLOB", NString.class);
//			cmd.addParameter("@LOA_CLOB", NString.class);
//				
//			cmd.execute();
//			laaClob.val = cmd.getParameterValue("@LAA_CLOB", NString.class);
//			loaClob.val = cmd.getParameterValue("@LOA_CLOB", NString.class);
//
//
//		}
//		
//		public static void convertXmlToNtv2( xmlGrid,Ref<NString> ntv2Clob) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_CS.CONVERT_XML_TO_NTV2", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@XML_GRID", xmlGrid);
//			cmd.addParameter("@NTV2_CLOB", NString.class);
//				
//			cmd.execute();
//			ntv2Clob.val = cmd.getParameterValue("@NTV2_CLOB", NString.class);
//
//
//		}
//		
//		public static void createConcatenatedOp(NNumber opId,NString opName, usePlan) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_CS.CREATE_CONCATENATED_OP", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@OP_ID", opId);
//			cmd.addParameter("@OP_NAME", opName);
//			cmd.addParameter("@USE_PLAN", usePlan);
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void createCrsUsingLegacyProj(NNumber epsgSrid,NNumber newSrid) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_CS.CREATE_CRS_USING_LEGACY_PROJ", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@EPSG_SRID", epsgSrid);
//			cmd.addParameter("@NEW_SRID", newSrid);
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void createObviousEpsgRules(NString useCase) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_CS.CREATE_OBVIOUS_EPSG_RULES", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@USE_CASE", useCase);
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void createPrefConcatenatedOp(NNumber opId,NString opName, usePlan,NString useCase) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_CS.CREATE_PREF_CONCATENATED_OP", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@OP_ID", opId);
//			cmd.addParameter("@OP_NAME", opName);
//			cmd.addParameter("@USE_PLAN", usePlan);
//			cmd.addParameter("@USE_CASE", useCase);
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void deleteAllEpsgRules(NString useCase) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_CS.DELETE_ALL_EPSG_RULES", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@USE_CASE", useCase);
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void deleteNtv2XmlData(NNumber ntv2FileId) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_CS.DELETE_NTV2_XML_DATA", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@NTV2_FILE_ID", ntv2FileId);
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void deleteOp(NNumber opId) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_CS.DELETE_OP", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@OP_ID", opId);
//				
//			cmd.execute();
//
//
//		}
//		
//		public static  FdetermineChain(List<SdoTransientRuleSetRow> transientRuleSet,NString useCase,NNumber sourceSrid,NNumber targetSrid) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_CS.DETERMINE_CHAIN", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			// cmd.addParameter(DbTypes.getCollectionType("TRANSIENT_RULE_SET", "", transientRuleSet, object.class));
//			cmd.addParameter("@USE_CASE", useCase);
//			cmd.addParameter("@SOURCE_SRID", sourceSrid);
//			cmd.addParameter("@TARGET_SRID", targetSrid);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static List<SdoSridChainRow> FdetermineDefaultChain(NNumber sourceSrid,NNumber targetSrid) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_CS.DETERMINE_DEFAULT_CHAIN", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoSridChainRow>.class);
//			cmd.addParameter("@SOURCE_SRID", sourceSrid);
//			cmd.addParameter("@TARGET_SRID", targetSrid);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoSridChainRow>.class);
//
//		}
//		
//		public static  FdetermineNadconCoverage(NNumber coordOpId) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_CS.DETERMINE_NADCON_COVERAGE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@COORD_OP_ID", coordOpId);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static NString FdisambiguateProjName(NNumber srid,NString wkt) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_CS.DISAMBIGUATE_PROJ_NAME", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@SRID", srid);
//			cmd.addParameter("@WKT", wkt);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString FdisambiguateProjName(NNumber srid) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_CS.DISAMBIGUATE_PROJ_NAME", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@SRID", srid);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static List<EpsgParamsRow> fillInDefaultUnits(List<EpsgParamsRow> _params,NNumber crs) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_CS.FILL_IN_DEFAULT_UNITS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<EpsgParamsRow>.class);
//			// cmd.addParameter(DbTypes.getCollectionType("PARAMS", "", _params, object.class));
//			cmd.addParameter("@CRS", crs);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<EpsgParamsRow>.class);
//
//		}
//		
//		public static void findEpsgParams(NNumber srid,Ref<NNumber> epsgSridGeog,Ref<NNumber> datumId,Ref<NNumber> ellipsId,Ref<NNumber> pmId,Ref<NNumber> projMethodId,Ref<NNumber> projOpId,Ref<NString> coordRefSysKind,Ref<NNumber> semiMajorAxis,Ref<NNumber> semiMinorAxis,Ref<NNumber> invFlattening,Ref<List<EpsgParamsRow>> _params) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_CS.FIND_EPSG_PARAMS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@SRID", srid);
//			cmd.addParameter("@EPSG_SRID_GEOG", NNumber.class);
//			cmd.addParameter("@DATUM_ID", NNumber.class);
//			cmd.addParameter("@ELLIPS_ID", NNumber.class);
//			cmd.addParameter("@PM_ID", NNumber.class);
//			cmd.addParameter("@PROJ_METHOD_ID", NNumber.class);
//			cmd.addParameter("@PROJ_OP_ID", NNumber.class);
//			cmd.addParameter("@COORD_REF_SYS_KIND", NString.class);
//			cmd.addParameter("@SEMI_MAJOR_AXIS", NNumber.class);
//			cmd.addParameter("@SEMI_MINOR_AXIS", NNumber.class);
//			cmd.addParameter("@INV_FLATTENING", NNumber.class);
//			// cmd.addParameter(DbTypes.getCollectionType("PARAMS", "", object.class));
//				
//			cmd.execute();
//			epsgSridGeog.val = cmd.getParameterValue("@EPSG_SRID_GEOG", NNumber.class);
//			datumId.val = cmd.getParameterValue("@DATUM_ID", NNumber.class);
//			ellipsId.val = cmd.getParameterValue("@ELLIPS_ID", NNumber.class);
//			pmId.val = cmd.getParameterValue("@PM_ID", NNumber.class);
//			projMethodId.val = cmd.getParameterValue("@PROJ_METHOD_ID", NNumber.class);
//			projOpId.val = cmd.getParameterValue("@PROJ_OP_ID", NNumber.class);
//			coordRefSysKind.val = cmd.getParameterValue("@COORD_REF_SYS_KIND", NString.class);
//			semiMajorAxis.val = cmd.getParameterValue("@SEMI_MAJOR_AXIS", NNumber.class);
//			semiMinorAxis.val = cmd.getParameterValue("@SEMI_MINOR_AXIS", NNumber.class);
//			invFlattening.val = cmd.getParameterValue("@INV_FLATTENING", NNumber.class);
//			// _params.val = cmd.getTableParameterValue("@PARAMS", object.class);
//
//
//		}
//		
//		public static List<SdoSridListRow> findGeogCrs(NNumber referenceSrid,NString isLegacy,NNumber maxRelNumDifference) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_CS.FIND_GEOG_CRS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoSridListRow>.class);
//			cmd.addParameter("@REFERENCE_SRID", referenceSrid);
//			cmd.addParameter("@IS_LEGACY", isLegacy);
//			cmd.addParameter("@MAX_REL_NUM_DIFFERENCE", maxRelNumDifference);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoSridListRow>.class);
//
//		}
//		
//		public static List<SdoSridListRow> findProjCrs(NNumber referenceSrid,NString isLegacy,NNumber maxRelNumDifference) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_CS.FIND_PROJ_CRS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoSridListRow>.class);
//			cmd.addParameter("@REFERENCE_SRID", referenceSrid);
//			cmd.addParameter("@IS_LEGACY", isLegacy);
//			cmd.addParameter("@MAX_REL_NUM_DIFFERENCE", maxRelNumDifference);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoSridListRow>.class);
//
//		}
//		
//		public static void findSrid(Ref<NNumber> srid,NNumber epsgSridGeog,NNumber epsgSridProj,NNumber datumId,NNumber ellipsId,NNumber pmId,NNumber projMethodId,NString coordRefSysKind,NNumber semiMajorAxis,NNumber semiMinorAxis,NNumber invFlattening,List<EpsgParamsRow> _params) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_CS.FIND_SRID", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@SRID", NNumber.class);
//			cmd.addParameter("@EPSG_SRID_GEOG", epsgSridGeog);
//			cmd.addParameter("@EPSG_SRID_PROJ", epsgSridProj);
//			cmd.addParameter("@DATUM_ID", datumId);
//			cmd.addParameter("@ELLIPS_ID", ellipsId);
//			cmd.addParameter("@PM_ID", pmId);
//			cmd.addParameter("@PROJ_METHOD_ID", projMethodId);
//			cmd.addParameter("@COORD_REF_SYS_KIND", coordRefSysKind);
//			cmd.addParameter("@SEMI_MAJOR_AXIS", semiMajorAxis);
//			cmd.addParameter("@SEMI_MINOR_AXIS", semiMinorAxis);
//			cmd.addParameter("@INV_FLATTENING", invFlattening);
//			// cmd.addParameter(DbTypes.getCollectionType("PARAMS", "", _params, object.class));
//				
//			cmd.execute();
//			srid.val = cmd.getParameterValue("@SRID", NNumber.class);
//
//
//		}
//		
//		public static void findSrid(Ref<NNumber> srid,NNumber epsgSridGeog,NNumber epsgSridProj,NNumber datumId,NNumber ellipsId,NNumber pmId,NNumber projMethodId,NNumber projOpId,NString coordRefSysKind,NNumber semiMajorAxis,NNumber semiMinorAxis,NNumber invFlattening,List<EpsgParamsRow> _params,NNumber maxRelNumDifference) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_CS.FIND_SRID", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@SRID", NNumber.class);
//			cmd.addParameter("@EPSG_SRID_GEOG", epsgSridGeog);
//			cmd.addParameter("@EPSG_SRID_PROJ", epsgSridProj);
//			cmd.addParameter("@DATUM_ID", datumId);
//			cmd.addParameter("@ELLIPS_ID", ellipsId);
//			cmd.addParameter("@PM_ID", pmId);
//			cmd.addParameter("@PROJ_METHOD_ID", projMethodId);
//			cmd.addParameter("@PROJ_OP_ID", projOpId);
//			cmd.addParameter("@COORD_REF_SYS_KIND", coordRefSysKind);
//			cmd.addParameter("@SEMI_MAJOR_AXIS", semiMajorAxis);
//			cmd.addParameter("@SEMI_MINOR_AXIS", semiMinorAxis);
//			cmd.addParameter("@INV_FLATTENING", invFlattening);
//			// cmd.addParameter(DbTypes.getCollectionType("PARAMS", "", _params, object.class));
//			cmd.addParameter("@MAX_REL_NUM_DIFFERENCE", maxRelNumDifference);
//				
//			cmd.execute();
//			srid.val = cmd.getParameterValue("@SRID", NNumber.class);
//
//
//		}
//		
//		public static NString fromOgcSimplefeatureSrs(NString wkt) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_CS.FROM_OGC_SIMPLEFEATURE_SRS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@WKT", wkt);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static  fromUsng(NString usng,NNumber srid,NString datum) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_CS.FROM_USNG", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@USNG", usng);
//			cmd.addParameter("@SRID", srid);
//			cmd.addParameter("@DATUM", datum);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static NNumber FgetCrsDimensionality(NNumber srid) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_CS.GET_CRS_DIMENSIONALITY", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@SRID", srid);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
//		public static NString FgetEpsgDataVersion() {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_CS.GET_EPSG_DATA_VERSION", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NNumber FgetSridForNamespace(NString srsnamespace,NString srsname) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_CS.GET_SRID_FOR_NAMESPACE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@SRSNAMESPACE", srsnamespace);
//			cmd.addParameter("@SRSNAME", srsname);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
//		public static NString FgetSrsnameForNamespace(NString srsnamespace,NNumber sdoSrid) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_CS.GET_SRSNAME_FOR_NAMESPACE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@SRSNAMESPACE", srsnamespace);
//			cmd.addParameter("@SDO_SRID", sdoSrid);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static  FinternalDensifyPriorToTfm( mbr) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_CS.INTERNAL_DENSIFY_PRIOR_TO_TFM", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@MBR", mbr);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  FinternalDetChain(List<SdoTransientRuleSetRow> transientRuleSet,NString useCase,NNumber sourceSrid,NNumber targetSrid,NBool explain,Ref<NString> explanation) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_CS.INTERNAL_DET_CHAIN", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			// cmd.addParameter(DbTypes.getCollectionType("TRANSIENT_RULE_SET", "", transientRuleSet, object.class));
//			cmd.addParameter("@USE_CASE", useCase);
//			cmd.addParameter("@SOURCE_SRID", sourceSrid);
//			cmd.addParameter("@TARGET_SRID", targetSrid);
//			cmd.addParameter("@EXPLAIN", explain);
//			cmd.addParameter("@EXPLANATION", NString.class);
//				
//			cmd.execute();
//			explanation.val = cmd.getParameterValue("@EXPLANATION", NString.class);
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static NString FinternalDetChainVarchar( plan) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_CS.INTERNAL_DET_CHAIN_VARCHAR", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@PLAN", plan);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString FinternalDetSridWkt(NNumber srid1) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_CS.INTERNAL_DET_SRID_WKT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@SRID1", srid1);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString FinternalEpsgParamToLegacy(NNumber paramId,NNumber methodId) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_CS.INTERNAL_EPSG_PARAM_TO_LEGACY", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@PARAM_ID", paramId);
//			cmd.addParameter("@METHOD_ID", methodId);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString FinternalReadProjFromWkt(NString wkt) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_CS.INTERNAL_READ_PROJ_FROM_WKT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@WKT", wkt);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static void intlPopulateDatum3params(NNumber datumId,NNumber opId) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_CS.INTL_POPULATE_DATUM_3PARAMS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@DATUM_ID", datumId);
//			cmd.addParameter("@OP_ID", opId);
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void intlPopulateDatum7params(NNumber datumId,NNumber opId) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_CS.INTL_POPULATE_DATUM_7PARAMS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@DATUM_ID", datumId);
//			cmd.addParameter("@OP_ID", opId);
//				
//			cmd.execute();
//
//
//		}
//		
//		public static NString FintlValidateWkt(NNumber srid) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_CS.INTL_VALIDATE_WKT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@SRID", srid);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NNumber FisWithinTolerance(NNumber a,NNumber b,NNumber relTolerance) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_CS.IS_WITHIN_TOLERANCE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@A", a);
//			cmd.addParameter("@B", b);
//			cmd.addParameter("@REL_TOLERANCE", relTolerance);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
//		public static NNumber FlookupEpsgParam(NNumber coordOpId,NNumber parameterId) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_CS.LOOKUP_EPSG_PARAM", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@COORD_OP_ID", coordOpId);
//			cmd.addParameter("@PARAMETER_ID", parameterId);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
//		public static  Fmake2d( geom3d,NNumber targetSrid) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_CS.MAKE_2D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM3D", geom3d);
//			cmd.addParameter("@TARGET_SRID", targetSrid);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  Fmake3d( geom2d,NNumber height,NNumber targetSrid) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_CS.MAKE_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM2D", geom2d);
//			cmd.addParameter("@HEIGHT", height);
//			cmd.addParameter("@TARGET_SRID", targetSrid);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static NNumber FmapEpsgSridToOracle(NNumber epsgSrid) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_CS.MAP_EPSG_SRID_TO_ORACLE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@EPSG_SRID", epsgSrid);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
//		public static NNumber FmapOracleSridToEpsg(NNumber legacySrid) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_CS.MAP_ORACLE_SRID_TO_EPSG", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@LEGACY_SRID", legacySrid);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
//		public static  FreformatGtype( geom1,NNumber srid2) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_CS.REFORMAT_GTYPE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM1", geom1);
//			cmd.addParameter("@SRID2", srid2);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static void registerSrsnamespace(NString srsnamespace,NString srsname,NNumber sdoSrid) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_CS.REGISTER_SRSNAMESPACE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@SRSNAMESPACE", srsnamespace);
//			cmd.addParameter("@SRSNAME", srsname);
//			cmd.addParameter("@SDO_SRID", sdoSrid);
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void revokePreferenceForOp(NNumber opId,NNumber sourceCrs,NNumber targetCrs,NString useCase) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_CS.REVOKE_PREFERENCE_FOR_OP", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@OP_ID", opId);
//			cmd.addParameter("@SOURCE_CRS", sourceCrs);
//			cmd.addParameter("@TARGET_CRS", targetCrs);
//			cmd.addParameter("@USE_CASE", useCase);
//				
//			cmd.execute();
//
//
//		}
//		
//		public static NString FtoOgcSimplefeatureSrs(NString wkt) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_CS.TO_OGC_SIMPLEFEATURE_SRS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@WKT", wkt);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString FtoUsng( geom,NNumber accuracyinmeters,NString datum) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_CS.TO_USNG", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM", geom);
//			cmd.addParameter("@ACCURACYINMETERS", accuracyinmeters);
//			cmd.addParameter("@DATUM", datum);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static  Ftransform( geom,List<SdoDimArrayRow> dim,NNumber toSrid) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_CS.TRANSFORM", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM", geom);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM", "", dim, object.class));
//			cmd.addParameter("@TO_SRID", toSrid);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  Ftransform( geom,NNumber tolerance,NNumber toSrid) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_CS.TRANSFORM", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM", geom);
//			cmd.addParameter("@TOLERANCE", tolerance);
//			cmd.addParameter("@TO_SRID", toSrid);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  Ftransform( geom,NNumber toSrid) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_CS.TRANSFORM", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM", geom);
//			cmd.addParameter("@TO_SRID", toSrid);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  Ftransform( geom,List<SdoDimArrayRow> dim,NString toSrname) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_CS.TRANSFORM", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM", geom);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM", "", dim, object.class));
//			cmd.addParameter("@TO_SRNAME", toSrname);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  Ftransform( geom,NNumber tolerance,NString toSrname) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_CS.TRANSFORM", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM", geom);
//			cmd.addParameter("@TOLERANCE", tolerance);
//			cmd.addParameter("@TO_SRNAME", toSrname);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  Ftransform( geom,NString toSrname) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_CS.TRANSFORM", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM", geom);
//			cmd.addParameter("@TO_SRNAME", toSrname);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static void transformLayer(NString tableIn,NString columnIn,NString tableOut,NNumber toSrid) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_CS.TRANSFORM_LAYER", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@TABLE_IN", tableIn);
//			cmd.addParameter("@COLUMN_IN", columnIn);
//			cmd.addParameter("@TABLE_OUT", tableOut);
//			cmd.addParameter("@TO_SRID", toSrid);
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void transformLayer(NString tableIn,NString columnIn,NString tableOut, usePlan) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_CS.TRANSFORM_LAYER", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@TABLE_IN", tableIn);
//			cmd.addParameter("@COLUMN_IN", columnIn);
//			cmd.addParameter("@TABLE_OUT", tableOut);
//			cmd.addParameter("@USE_PLAN", usePlan);
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void transformLayer(NString tableIn,NString columnIn,NString tableOut,NString useCase,NNumber toSrid) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_CS.TRANSFORM_LAYER", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@TABLE_IN", tableIn);
//			cmd.addParameter("@COLUMN_IN", columnIn);
//			cmd.addParameter("@TABLE_OUT", tableOut);
//			cmd.addParameter("@USE_CASE", useCase);
//			cmd.addParameter("@TO_SRID", toSrid);
//				
//			cmd.execute();
//
//
//		}
//		
//		public static  FtransformOrig( geom,List<SdoDimArrayRow> dim,NNumber toSrid) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_CS.TRANSFORM_ORIG", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM", geom);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM", "", dim, object.class));
//			cmd.addParameter("@TO_SRID", toSrid);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  FtransformOrig( geom,NNumber tolerance,NNumber toSrid) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_CS.TRANSFORM_ORIG", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM", geom);
//			cmd.addParameter("@TOLERANCE", tolerance);
//			cmd.addParameter("@TO_SRID", toSrid);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  FtransformOrig( geom,NNumber toSrid) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_CS.TRANSFORM_ORIG", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM", geom);
//			cmd.addParameter("@TO_SRID", toSrid);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  FtransformOrig( geom,List<SdoDimArrayRow> dim,NString toSrname) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_CS.TRANSFORM_ORIG", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM", geom);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM", "", dim, object.class));
//			cmd.addParameter("@TO_SRNAME", toSrname);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  FtransformOrig( geom,NNumber tolerance,NString toSrname) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_CS.TRANSFORM_ORIG", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM", geom);
//			cmd.addParameter("@TOLERANCE", tolerance);
//			cmd.addParameter("@TO_SRNAME", toSrname);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  FtransformOrig( geom,NString toSrname) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_CS.TRANSFORM_ORIG", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM", geom);
//			cmd.addParameter("@TO_SRNAME", toSrname);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  FtransformOrigUsingRules( geom,List<SdoDimArrayRow> dim,NString useCase,NString tfmchain,NNumber toSrid) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_CS.TRANSFORM_ORIG_USING_RULES", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM", geom);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM", "", dim, object.class));
//			cmd.addParameter("@USE_CASE", useCase);
//			cmd.addParameter("@TFMCHAIN", tfmchain);
//			cmd.addParameter("@TO_SRID", toSrid);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  FtransformOrigUsingRules( geom,NString useCase,NString tfmchain,NNumber toSrid) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_CS.TRANSFORM_ORIG_USING_RULES", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM", geom);
//			cmd.addParameter("@USE_CASE", useCase);
//			cmd.addParameter("@TFMCHAIN", tfmchain);
//			cmd.addParameter("@TO_SRID", toSrid);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static NNumber FtransformToBaseUnit(NNumber value,NNumber sourceUnitId) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_CS.TRANSFORM_TO_BASE_UNIT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@VALUE", value);
//			cmd.addParameter("@SOURCE_UNIT_ID", sourceUnitId);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
//		public static NNumber FtransformToWktParamUnit(NNumber value,NNumber sourceUnitId,NNumber targetUnitIdIfLength) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_CS.TRANSFORM_TO_WKT_PARAM_UNIT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@VALUE", value);
//			cmd.addParameter("@SOURCE_UNIT_ID", sourceUnitId);
//			cmd.addParameter("@TARGET_UNIT_ID_IF_LENGTH", targetUnitIdIfLength);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
//		public static  FtransformUsingCaseName( geom,NString useCase,NNumber toSrid) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_CS.TRANSFORM_USING_CASE_NAME", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM", geom);
//			cmd.addParameter("@USE_CASE", useCase);
//			cmd.addParameter("@TO_SRID", toSrid);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  FtransformUsingPlan( geom, usePlan) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_CS.TRANSFORM_USING_PLAN", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM", geom);
//			cmd.addParameter("@USE_PLAN", usePlan);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static void updateWktsForAllEpsgCrs() {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_CS.UPDATE_WKTS_FOR_ALL_EPSG_CRS", DbManager.getDataBaseFactory());
//			
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void updateWktsForEpsgCrs(NNumber srid) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_CS.UPDATE_WKTS_FOR_EPSG_CRS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@SRID", srid);
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void updateWktsForEpsgDatum(NNumber datumId) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_CS.UPDATE_WKTS_FOR_EPSG_DATUM", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@DATUM_ID", datumId);
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void updateWktsForEpsgEllips(NNumber ellipsoidId) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_CS.UPDATE_WKTS_FOR_EPSG_ELLIPS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@ELLIPSOID_ID", ellipsoidId);
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void updateWktsForEpsgOp(NNumber coordOpId) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_CS.UPDATE_WKTS_FOR_EPSG_OP", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@COORD_OP_ID", coordOpId);
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void updateWktsForEpsgParam(NNumber coordOpId,NNumber parameterId) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_CS.UPDATE_WKTS_FOR_EPSG_PARAM", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@COORD_OP_ID", coordOpId);
//			cmd.addParameter("@PARAMETER_ID", parameterId);
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void updateWktsForEpsgPm(NNumber primeMeridianId) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_CS.UPDATE_WKTS_FOR_EPSG_PM", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@PRIME_MERIDIAN_ID", primeMeridianId);
//				
//			cmd.execute();
//
//
//		}
//		
//		public static NString FvalidateWkt(NNumber srid) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_CS.VALIDATE_WKT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@SRID", srid);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static  FviewportTransform( geom,NNumber toSrid) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_CS.VIEWPORT_TRANSFORM", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM", geom);
//			cmd.addParameter("@TO_SRID", toSrid);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//	
//	
//	
//}
