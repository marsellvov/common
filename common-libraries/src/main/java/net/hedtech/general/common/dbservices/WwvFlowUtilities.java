package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class WwvFlowUtilities {
		public static void appendToList() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.APPEND_TO_LIST", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
//		public static NString FarrayElement(List<WwvFlowGlobal.VcArr2Row> pVcarr,NNumber pIndex) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.ARRAY_ELEMENT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			// cmd.addParameter(DbTypes.getTableType("P_VCARR", "", pVcarr, object.class));
//			cmd.addParameter("@P_INDEX", pIndex);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
		
		public static NString Fb64Encode(NString pInput) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.B64_ENCODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_INPUT", pInput);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static NString FblobToClob(Ref<BLOB> pBlob,NString pCharset) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.BLOB_TO_CLOB", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@P_BLOB", pBlob, true);
//			cmd.addParameter("@P_CHARSET", pCharset);
//				
//			cmd.execute();
//			pBlob.val = cmd.getParameterValue("@P_BLOB", BLOB.class);
//
//			return cmd.getReturnValue(NString.class);
//
//		}
		
		public static void bulkSaveSessionState(NString pValue,NString pItem01,NString pItem02,NString pItem03,NString pItem04,NString pItem05,NString pItem06,NString pItem07,NString pItem08,NString pItem09,NString pItem10,NString pItem11,NString pItem12,NString pItem13,NString pItem14,NString pItem15,NString pItem16,NString pItem17,NString pItem18,NString pItem19,NString pItem20,NString pItem21,NString pItem22,NString pItem23,NString pItem24,NString pItem25,NString pItem26,NString pItem27,NString pItem28,NString pItem29,NString pItem30,NString pItem31,NString pItem32,NString pItem33,NString pItem34,NString pItem35,NString pItem36,NString pItem37,NString pItem38,NString pItem39,NString pItem40,NString pItem41,NString pItem42,NString pItem43,NString pItem44,NString pItem45,NString pItem46,NString pItem47,NString pItem48,NString pItem49,NString pItem50,NString pSetAsPreference) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.BULK_SAVE_SESSION_STATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_ITEM_01", pItem01);
			cmd.addParameter("@P_ITEM_02", pItem02);
			cmd.addParameter("@P_ITEM_03", pItem03);
			cmd.addParameter("@P_ITEM_04", pItem04);
			cmd.addParameter("@P_ITEM_05", pItem05);
			cmd.addParameter("@P_ITEM_06", pItem06);
			cmd.addParameter("@P_ITEM_07", pItem07);
			cmd.addParameter("@P_ITEM_08", pItem08);
			cmd.addParameter("@P_ITEM_09", pItem09);
			cmd.addParameter("@P_ITEM_10", pItem10);
			cmd.addParameter("@P_ITEM_11", pItem11);
			cmd.addParameter("@P_ITEM_12", pItem12);
			cmd.addParameter("@P_ITEM_13", pItem13);
			cmd.addParameter("@P_ITEM_14", pItem14);
			cmd.addParameter("@P_ITEM_15", pItem15);
			cmd.addParameter("@P_ITEM_16", pItem16);
			cmd.addParameter("@P_ITEM_17", pItem17);
			cmd.addParameter("@P_ITEM_18", pItem18);
			cmd.addParameter("@P_ITEM_19", pItem19);
			cmd.addParameter("@P_ITEM_20", pItem20);
			cmd.addParameter("@P_ITEM_21", pItem21);
			cmd.addParameter("@P_ITEM_22", pItem22);
			cmd.addParameter("@P_ITEM_23", pItem23);
			cmd.addParameter("@P_ITEM_24", pItem24);
			cmd.addParameter("@P_ITEM_25", pItem25);
			cmd.addParameter("@P_ITEM_26", pItem26);
			cmd.addParameter("@P_ITEM_27", pItem27);
			cmd.addParameter("@P_ITEM_28", pItem28);
			cmd.addParameter("@P_ITEM_29", pItem29);
			cmd.addParameter("@P_ITEM_30", pItem30);
			cmd.addParameter("@P_ITEM_31", pItem31);
			cmd.addParameter("@P_ITEM_32", pItem32);
			cmd.addParameter("@P_ITEM_33", pItem33);
			cmd.addParameter("@P_ITEM_34", pItem34);
			cmd.addParameter("@P_ITEM_35", pItem35);
			cmd.addParameter("@P_ITEM_36", pItem36);
			cmd.addParameter("@P_ITEM_37", pItem37);
			cmd.addParameter("@P_ITEM_38", pItem38);
			cmd.addParameter("@P_ITEM_39", pItem39);
			cmd.addParameter("@P_ITEM_40", pItem40);
			cmd.addParameter("@P_ITEM_41", pItem41);
			cmd.addParameter("@P_ITEM_42", pItem42);
			cmd.addParameter("@P_ITEM_43", pItem43);
			cmd.addParameter("@P_ITEM_44", pItem44);
			cmd.addParameter("@P_ITEM_45", pItem45);
			cmd.addParameter("@P_ITEM_46", pItem46);
			cmd.addParameter("@P_ITEM_47", pItem47);
			cmd.addParameter("@P_ITEM_48", pItem48);
			cmd.addParameter("@P_ITEM_49", pItem49);
			cmd.addParameter("@P_ITEM_50", pItem50);
			cmd.addParameter("@P_SET_AS_PREFERENCE", pSetAsPreference);
				
			cmd.execute();


		}
		
		public static NDate FcacheGetDateCached(NNumber pApplication,NNumber pPage) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.CACHE_GET_DATE_CACHED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@P_APPLICATION", pApplication);
			cmd.addParameter("@P_PAGE", pPage);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
		public static NDate FcacheGetDateCached(NNumber pApplication,NNumber pPage,NString pRegionName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.CACHE_GET_DATE_CACHED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@P_APPLICATION", pApplication);
			cmd.addParameter("@P_PAGE", pPage);
			cmd.addParameter("@P_REGION_NAME", pRegionName);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
		public static void cachePurgeByApplication(NNumber pApplication) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.CACHE_PURGE_BY_APPLICATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_APPLICATION", pApplication);
				
			cmd.execute();


		}
		
		public static void cachePurgeByPage(NNumber pApplication,NNumber pPage,NString pUserName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.CACHE_PURGE_BY_PAGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_APPLICATION", pApplication);
			cmd.addParameter("@P_PAGE", pPage);
			cmd.addParameter("@P_USER_NAME", pUserName);
				
			cmd.execute();


		}
		
		public static void cachePurgeStale(NNumber pApplication) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.CACHE_PURGE_STALE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_APPLICATION", pApplication);
				
			cmd.execute();


		}
		
		public static void checkSgid() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.CHECK_SGID", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static NNumber Fchecksum(NString pBuff) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.CHECKSUM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_BUFF", pBuff);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
//		public static BLOB FclobToBlob(Ref<NString> pClob,NString pCharset) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.CLOB_TO_BLOB", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(BLOB.class);
//			cmd.addParameter("@P_CLOB", pClob, true);
//			cmd.addParameter("@P_CHARSET", pCharset);
//				
//			cmd.execute();
//			pClob.val = cmd.getParameterValue("@P_CLOB", NString.class);
//
//			return cmd.getReturnValue(BLOB.class);
//
//		}
		
		public static NString FclobToVarchar2(NString pClob,NNumber pOffset,NBool pRaise) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.CLOB_TO_VARCHAR2", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CLOB", pClob);
			cmd.addParameter("@P_OFFSET", pOffset);
			cmd.addParameter("@P_RAISE", pRaise);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void closeJavascript() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.CLOSE_JAVASCRIPT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static NString FcloseJavascript() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.CLOSE_JAVASCRIPT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void closeNoscript() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.CLOSE_NOSCRIPT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static NString FcloseNoscript() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.CLOSE_NOSCRIPT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber FcountStaleRegions(NNumber pApplication) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.COUNT_STALE_REGIONS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_APPLICATION", pApplication);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NBool FcurrentFlowChanged() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.CURRENT_FLOW_CHANGED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool FcurrentSessionChanged() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.CURRENT_SESSION_CHANGED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void dailyCalendar(NString pDateTypeField) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.DAILY_CALENDAR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DATE_TYPE_FIELD", pDateTypeField);
				
			cmd.execute();


		}
		
		public static NString FdbCompatibility() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.DB_COMPATIBILITY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool FdbEditionIsXe() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.DB_EDITION_IS_XE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NString FdbVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.DB_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool FdbVersionIsAtLeast(NString pVersion) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.DB_VERSION_IS_AT_LEAST", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_VERSION", pVersion);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NString FdbVersionIsAtLeastI(NString pVersion) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.DB_VERSION_IS_AT_LEAST_I", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_VERSION", pVersion);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void decrementCalendar() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.DECREMENT_CALENDAR", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void deleteFromList() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.DELETE_FROM_LIST", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void deleteListElement() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.DELETE_LIST_ELEMENT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static NString FdeleteListElement() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.DELETE_LIST_ELEMENT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FencodeFilename(NString pFilename) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.ENCODE_FILENAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_FILENAME", pFilename);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FescNonBasicTags(NString pString) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.ESC_NON_BASIC_TAGS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_STRING", pString);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FescapeUrl(NString pUrl,NString pUrlCharset,NString pEscapeReserved) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.ESCAPE_URL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_URL", pUrl);
			cmd.addParameter("@P_URL_CHARSET", pUrlCharset);
			cmd.addParameter("@P_ESCAPE_RESERVED", pEscapeReserved);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FexportApplicationToClob(NNumber pApplicationId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.EXPORT_APPLICATION_TO_CLOB", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_APPLICATION_ID", pApplicationId);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void exportApplicationToDb(NNumber pApplicationId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.EXPORT_APPLICATION_TO_DB", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_APPLICATION_ID", pApplicationId);
				
			cmd.execute();


		}
		
		public static NString FexportPageToClob(NNumber pApplicationId,NNumber pPageId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.EXPORT_PAGE_TO_CLOB", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_APPLICATION_ID", pApplicationId);
			cmd.addParameter("@P_PAGE_ID", pPageId);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString Fextracthtml(NString pHtml) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.EXTRACTHTML", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_HTML", pHtml);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void fastReplace(Ref<NString> srcstr,NString oldsub,NString newsub) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.FAST_REPLACE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SRCSTR", srcstr, true);
			cmd.addParameter("@OLDSUB", oldsub);
			cmd.addParameter("@NEWSUB", newsub);
				
			cmd.execute();
			srcstr.val = cmd.getParameterValue("@SRCSTR", NString.class);


		}
		
		public static NString fastReplaceF(NString pSrcstr,NString oldsub,NString newsub) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.FAST_REPLACE_F", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SRCSTR", pSrcstr);
			cmd.addParameter("@OLDSUB", oldsub);
			cmd.addParameter("@NEWSUB", newsub);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static void fastReplaceMany(Ref<NString> srcstr,List<Vc4000arrayRow> oldsub,List<Vc4000arrayRow> newsub) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.FAST_REPLACE_MANY", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@SRCSTR", srcstr, true);
//			// cmd.addParameter(DbTypes.getCollectionType("OLDSUB", "", oldsub, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("NEWSUB", "", newsub, object.class));
//				
//			cmd.execute();
//			srcstr.val = cmd.getParameterValue("@SRCSTR", NString.class);
//
//
//		}
		
//		public static NString fastReplaceManyf(NString pSrcstr,List<Vc4000arrayRow> oldsub,List<Vc4000arrayRow> newsub) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.FAST_REPLACE_MANYF", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@P_SRCSTR", pSrcstr);
//			// cmd.addParameter(DbTypes.getCollectionType("OLDSUB", "", oldsub, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("NEWSUB", "", newsub, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
		
		public static NString flowAuthentication(NNumber pFlowId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.FLOW_AUTHENTICATION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_FLOW_ID", pFlowId);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void genFilterEscape() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.GEN_FILTER_ESCAPE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void genPopupColor(NString pItemName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.GEN_POPUP_COLOR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ITEM_NAME", pItemName);
				
			cmd.execute();


		}
		
		public static void genPopupList(NString pName,NString pLov,NString pLovChecksum,NString pElementIndex,NString pFormIndex,NString pFilter,NString pEscapeHtml,NString pMaxElements,NString pBeforeFieldFieldText,NString pAfterFieldFieldText,NString pTitle,NString pImage,NString pHelp,NString pEvalValue,NString pRequest,NNumber pMinRow,NString pTranslation,NString pReturnKey,NString pHiddenElemName,NString pOkToQuery,NNumber pFlowId,NNumber pPageId,NNumber pSessionId,NNumber pCompany,NString pItemId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.GEN_POPUP_LIST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_NAME", pName);
			cmd.addParameter("@P_LOV", pLov);
			cmd.addParameter("@P_LOV_CHECKSUM", pLovChecksum);
			cmd.addParameter("@P_ELEMENT_INDEX", pElementIndex);
			cmd.addParameter("@P_FORM_INDEX", pFormIndex);
			cmd.addParameter("@P_FILTER", pFilter);
			cmd.addParameter("@P_ESCAPE_HTML", pEscapeHtml);
			cmd.addParameter("@P_MAX_ELEMENTS", pMaxElements);
			cmd.addParameter("@P_BEFORE_FIELD_FIELD_TEXT", pBeforeFieldFieldText);
			cmd.addParameter("@P_AFTER_FIELD_FIELD_TEXT", pAfterFieldFieldText);
			cmd.addParameter("@P_TITLE", pTitle);
			cmd.addParameter("@P_IMAGE", pImage);
			cmd.addParameter("@P_HELP", pHelp);
			cmd.addParameter("@P_EVAL_VALUE", pEvalValue);
			cmd.addParameter("@P_REQUEST", pRequest);
			cmd.addParameter("@P_MIN_ROW", pMinRow);
			cmd.addParameter("@P_TRANSLATION", pTranslation);
			cmd.addParameter("@P_RETURN_KEY", pReturnKey);
			cmd.addParameter("@P_HIDDEN_ELEM_NAME", pHiddenElemName);
			cmd.addParameter("@P_OK_TO_QUERY", pOkToQuery);
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_PAGE_ID", pPageId);
			cmd.addParameter("@P_SESSION_ID", pSessionId);
			cmd.addParameter("@P_COMPANY", pCompany);
			cmd.addParameter("@P_ITEM_ID", pItemId);
				
			cmd.execute();


		}
		
//		public static List<Varchar2TableRow> FgetBinds(NString pStmt) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.GET_BINDS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<Varchar2TableRow>.class);
//			cmd.addParameter("@P_STMT", pStmt);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<Varchar2TableRow>.class);
//
//		}
		
		public static NString FgetCgiQueryStringDecoded() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.GET_CGI_QUERY_STRING_DECODED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetClobMd5(NString pClob) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.GET_CLOB_MD5", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CLOB", pClob);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetColumnHeadings(NString pSqlSelectStatement) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.GET_COLUMN_HEADINGS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SQL_SELECT_STATEMENT", pSqlSelectStatement);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetCompanyFromCookie() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.GET_COMPANY_FROM_COOKIE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetCookieUserName(NNumber pCookieUserId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.GET_COOKIE_USER_NAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_COOKIE_USER_ID", pCookieUserId);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetDataType(NString pTableName,NString pColumnName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.GET_DATA_TYPE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetDisplayValueGivenLov(NString pSqlQuery,NString pValue,NString pTranslation,NString pEscapeSc) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.GET_DISPLAY_VALUE_GIVEN_LOV", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SQL_QUERY", pSqlQuery);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_TRANSLATION", pTranslation);
			cmd.addParameter("@P_ESCAPE_SC", pEscapeSc);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void getLovDelimiters(NString pS,Ref<NString> pR,Ref<NString> pC) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.GET_LOV_DELIMITERS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_S", pS);
			cmd.addParameter("@P_R", NString.class);
			cmd.addParameter("@P_C", NString.class);
				
			cmd.execute();
			pR.val = cmd.getParameterValue("@P_R", NString.class);
			pC.val = cmd.getParameterValue("@P_C", NString.class);


		}
		
		public static NString FgetRegionName(NString pRegionId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.GET_REGION_NAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_REGION_ID", pRegionId);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetSubstitutionValue(NString pSubstitutionString,NString pFlowId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.GET_SUBSTITUTION_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SUBSTITUTION_STRING", pSubstitutionString);
			cmd.addParameter("@P_FLOW_ID", pFlowId);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetUnFromCookie() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.GET_UN_FROM_COOKIE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetUsingClause(NString pStmt) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.GET_USING_CLAUSE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_STMT", pStmt);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FhostUrl(NString pOption) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.HOST_URL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_OPTION", pOption);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FhtmlEditorLanguage() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.HTML_EDITOR_LANGUAGE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static NBool FinList(NString pValue,List<WwvFlowGlobal.VcArr2Row> pArray) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.IN_LIST", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NBool.class);
//			cmd.addParameter("@P_VALUE", pValue);
//			// cmd.addParameter(DbTypes.getTableType("P_ARRAY", "", pArray, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NBool.class);
//
//		}
		
		public static void incrementCalendar() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.INCREMENT_CALENDAR", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static NString FinstrFromstr(NString pInstr,NString pFromstr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.INSTR_FROMSTR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_INSTR", pInstr);
			cmd.addParameter("@P_FROMSTR", pFromstr);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FinstrTostr(NString pInstr,NString pTostr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.INSTR_TOSTR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_INSTR", pInstr);
			cmd.addParameter("@P_TOSTR", pTostr);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool FisBuildOptionEnabled(NNumber pBuildOptionId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.IS_BUILD_OPTION_ENABLED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_BUILD_OPTION_ID", pBuildOptionId);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool FisBuildOptionEnabled(NString pBuildOptionName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.IS_BUILD_OPTION_ENABLED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_BUILD_OPTION_NAME", pBuildOptionName);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool FisDate(NString pDate,NString pFormat) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.IS_DATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_DATE", pDate);
			cmd.addParameter("@P_FORMAT", pFormat);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool FisNumber(NString pNumber,NString pFormat) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.IS_NUMBER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_NUMBER", pNumber);
			cmd.addParameter("@P_FORMAT", pFormat);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool FisNumeric(NString pStr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.IS_NUMERIC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_STR", pStr);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool FisValidAlias(NString pAlias) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.IS_VALID_ALIAS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_ALIAS", pAlias);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool FisValidIdentifier(NString pIdentifier,NBool pQuote) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.IS_VALID_IDENTIFIER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_IDENTIFIER", pIdentifier);
			cmd.addParameter("@P_QUOTE", pQuote);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool FisValidLovQuery(NString pQuery,NString pOwner) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.IS_VALID_LOV_QUERY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_QUERY", pQuery);
			cmd.addParameter("@P_OWNER", pOwner);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NString Fite(NBool b,NString t,NString f) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.ITE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@B", b);
			cmd.addParameter("@T", t);
			cmd.addParameter("@F", f);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool FitemChanged(NString pItemName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.ITEM_CHANGED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_ITEM_NAME", pItemName);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NNumber FkeyvalNum() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.KEYVAL_NUM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString FkeyvalVc2() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.KEYVAL_VC2", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static void listMgrDisplay(NString pLov,NString pPopupLovType,NString pName,NString pTextName,List<WwvFlowGlobal.VcArr2Row> pValue,NBool pEditMode,NBool pUpperVals,NNumber pFormIndex,NString pAttributes,NString pItem1,NString pItem2,NString pItemId) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.LIST_MGR_DISPLAY", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_LOV", pLov);
//			cmd.addParameter("@P_POPUP_LOV_TYPE", pPopupLovType);
//			cmd.addParameter("@P_NAME", pName);
//			cmd.addParameter("@P_TEXT_NAME", pTextName);
//			// cmd.addParameter(DbTypes.getTableType("P_VALUE", "", pValue, object.class));
//			cmd.addParameter("@P_EDIT_MODE", pEditMode);
//			cmd.addParameter("@P_UPPER_VALS", pUpperVals);
//			cmd.addParameter("@P_FORM_INDEX", pFormIndex);
//			cmd.addParameter("@P_ATTRIBUTES", pAttributes);
//			cmd.addParameter("@P_ITEM1", pItem1);
//			cmd.addParameter("@P_ITEM2", pItem2);
//			cmd.addParameter("@P_ITEM_ID", pItemId);
//				
//			cmd.execute();
//
//
//		}
		
		public static NBool FlistOfItemsChanged(NString pItemNames) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.LIST_OF_ITEMS_CHANGED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_ITEM_NAMES", pItemNames);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool FlistOfPagesChanged(NString pPageNumbers) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.LIST_OF_PAGES_CHANGED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_PAGE_NUMBERS", pPageNumbers);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void lobReplace(Ref<NString> pLob,NString pSearchString,NString pReplacementString) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.LOB_REPLACE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_LOB", pLob, true);
			cmd.addParameter("@P_SEARCH_STRING", pSearchString);
			cmd.addParameter("@P_REPLACEMENT_STRING", pReplacementString);
				
			cmd.execute();
			pLob.val = cmd.getParameterValue("@P_LOB", NString.class);


		}
		
		public static NString FlovChecksum(NString pString) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.LOV_CHECKSUM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_STRING", pString);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static List<LovTableRow> FlovValueArray(NString pLov) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.LOV_VALUE_ARRAY", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<LovTableRow>.class);
//			cmd.addParameter("@P_LOV", pLov);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<LovTableRow>.class);
//
//		}
		
		public static NString FlovValues(NString pLov) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.LOV_VALUES", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_LOV", pLov);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber FminimumFreeFlow() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.MINIMUM_FREE_FLOW", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FminimumFreePage(NNumber pFlowId,NNumber pOccurance) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.MINIMUM_FREE_PAGE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_OCCURANCE", pOccurance);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void monthCalendar(NString pDateTypeField) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.MONTH_CALENDAR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DATE_TYPE_FIELD", pDateTypeField);
				
			cmd.execute();


		}
		
		public static NString FmyUrl() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.MY_URL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void openJavascript(NString version) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.OPEN_JAVASCRIPT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VERSION", version);
				
			cmd.execute();


		}
		
		public static NString FopenJavascript(NString version) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.OPEN_JAVASCRIPT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@VERSION", version);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void openNoscript() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.OPEN_NOSCRIPT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static NString FopenNoscript() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.OPEN_NOSCRIPT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool FpageChanged(NNumber pPageNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.PAGE_CHANGED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_PAGE_NUMBER", pPageNumber);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NString FpageChecksum(NString pString,NString pChecksumType,byte[] pChecksumSalt) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.PAGE_CHECKSUM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_STRING", pString);
			cmd.addParameter("@P_CHECKSUM_TYPE", pChecksumType);
			cmd.addParameter("@P_CHECKSUM_SALT", pChecksumSalt);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString Fparse(NString pString,NBool pEscape) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.PARSE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_STRING", pString);
			cmd.addParameter("@P_ESCAPE", pEscape);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void parseQueryString(NString pQuery,Ref<NString> pFlowId,Ref<NString> pPageId,Ref<NString> pSessId,Ref<NString> pRemainder) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.PARSE_QUERY_STRING", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_QUERY", pQuery);
			cmd.addParameter("@P_FLOW_ID", NString.class);
			cmd.addParameter("@P_PAGE_ID", NString.class);
			cmd.addParameter("@P_SESS_ID", NString.class);
			cmd.addParameter("@P_REMAINDER", NString.class);
				
			cmd.execute();
			pFlowId.val = cmd.getParameterValue("@P_FLOW_ID", NString.class);
			pPageId.val = cmd.getParameterValue("@P_PAGE_ID", NString.class);
			pSessId.val = cmd.getParameterValue("@P_SESS_ID", NString.class);
			pRemainder.val = cmd.getParameterValue("@P_REMAINDER", NString.class);


		}
		
		public static void pause(NNumber pSeconds) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.PAUSE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SECONDS", pSeconds);
				
			cmd.execute();


		}
		
		public static void performBinds(NNumber pCursor,NString pStmt) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.PERFORM_BINDS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CURSOR", pCursor);
			cmd.addParameter("@P_STMT", pStmt);
				
			cmd.execute();


		}
		
		public static NString FpickDateFormatMask(NString pPickDateType,NString pFormatMask) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.PICK_DATE_FORMAT_MASK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PICK_DATE_TYPE", pPickDateType);
			cmd.addParameter("@P_FORMAT_MASK", pFormatMask);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void populateTempLovTable(NString pS,NString pR,NString pC) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.POPULATE_TEMP_LOV_TABLE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_S", pS);
			cmd.addParameter("@P_R", pR);
			cmd.addParameter("@P_C", pC);
				
			cmd.execute();


		}
		
		public static NString FprepareUrl(NString pUrl,NString pUrlCharset,NString pChecksumType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.PREPARE_URL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_URL", pUrl);
			cmd.addParameter("@P_URL_CHARSET", pUrlCharset);
			cmd.addParameter("@P_CHECKSUM_TYPE", pChecksumType);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void processCalendarDate(NString pRequest) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.PROCESS_CALENDAR_DATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_REQUEST", pRequest);
				
			cmd.execute();


		}
		
		public static void purgeRegionsByApp(NNumber pApplication) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.PURGE_REGIONS_BY_APP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_APPLICATION", pApplication);
				
			cmd.execute();


		}
		
		public static void purgeRegionsById(NNumber pApplication,NNumber pRegionId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.PURGE_REGIONS_BY_ID", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_APPLICATION", pApplication);
			cmd.addParameter("@P_REGION_ID", pRegionId);
				
			cmd.execute();


		}
		
		public static void purgeRegionsByName(NNumber pApplication,NNumber pPageId,NString pRegionName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.PURGE_REGIONS_BY_NAME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_APPLICATION", pApplication);
			cmd.addParameter("@P_PAGE_ID", pPageId);
			cmd.addParameter("@P_REGION_NAME", pRegionName);
				
			cmd.execute();


		}
		
		public static void purgeRegionsByPage(NNumber pApplication,NNumber pPageId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.PURGE_REGIONS_BY_PAGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_APPLICATION", pApplication);
			cmd.addParameter("@P_PAGE_ID", pPageId);
				
			cmd.execute();


		}
		
		public static void purgeStaleRegions(NNumber pApplication) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.PURGE_STALE_REGIONS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_APPLICATION", pApplication);
				
			cmd.execute();


		}
		
		public static NString FquickLink(NString pForminput,NString pFormValue,NString pDisplay,NBool pSystemMessage,NString pForminput2,NString pFormValue2,NString pDisable,NString pPopupMessage) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.QUICK_LINK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_FORMINPUT", pForminput);
			cmd.addParameter("@P_FORM_VALUE", pFormValue);
			cmd.addParameter("@P_DISPLAY", pDisplay);
			cmd.addParameter("@P_SYSTEM_MESSAGE", pSystemMessage);
			cmd.addParameter("@P_FORMINPUT2", pForminput2);
			cmd.addParameter("@P_FORM_VALUE2", pFormValue2);
			cmd.addParameter("@P_DISABLE", pDisable);
			cmd.addParameter("@P_POPUP_MESSAGE", pPopupMessage);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void redirectUrl(NString pUrl) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.REDIRECT_URL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_URL", pUrl);
				
			cmd.execute();


		}
		
//		public static void redirectUrlArray(NString pOwner,NString pPackage,NString pProcedure,List<WwvFlowGlobal.VcArr2Row> pParameters,List<WwvFlowGlobal.VcArr2Row> pValues) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.REDIRECT_URL_ARRAY", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_OWNER", pOwner);
//			cmd.addParameter("@P_PACKAGE", pPackage);
//			cmd.addParameter("@P_PROCEDURE", pProcedure);
//			// cmd.addParameter(DbTypes.getTableType("P_PARAMETERS", "", pParameters, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_VALUES", "", pValues, object.class));
//				
//			cmd.execute();
//
//
//		}
		
		public static NString FremoveSpaces(NString pStr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.REMOVE_SPACES", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_STR", pStr);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FremoveTrailingWhitespace(NString pStr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.REMOVE_TRAILING_WHITESPACE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_STR", pStr);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString Fremws(NString pStr,NString pWhere) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.REMWS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_STR", pStr);
			cmd.addParameter("@P_WHERE", pWhere);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber FsavekeyNum(NNumber pVal) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.SAVEKEY_NUM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_VAL", pVal);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString FsavekeyVc2(NString pVal) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.SAVEKEY_VC2", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_VAL", pVal);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static void showAsCheckbox(NString pLov,List<WwvFlowGlobal.VcArr2Row> pValue,NString pName,NString pCols,NString pShowExtra,NString pExtraText,NString pOnblur,NString pOnchange,NString pOnfocus,NNumber pMaxElements,NString pAttributes,NString pTranslation,NString pAttributes2,NString pItemName) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.SHOW_AS_CHECKBOX", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_LOV", pLov);
//			// cmd.addParameter(DbTypes.getTableType("P_VALUE", "", pValue, object.class));
//			cmd.addParameter("@P_NAME", pName);
//			cmd.addParameter("@P_COLS", pCols);
//			cmd.addParameter("@P_SHOW_EXTRA", pShowExtra);
//			cmd.addParameter("@P_EXTRA_TEXT", pExtraText);
//			cmd.addParameter("@P_ONBLUR", pOnblur);
//			cmd.addParameter("@P_ONCHANGE", pOnchange);
//			cmd.addParameter("@P_ONFOCUS", pOnfocus);
//			cmd.addParameter("@P_MAX_ELEMENTS", pMaxElements);
//			cmd.addParameter("@P_ATTRIBUTES", pAttributes);
//			cmd.addParameter("@P_TRANSLATION", pTranslation);
//			cmd.addParameter("@P_ATTRIBUTES2", pAttributes2);
//			cmd.addParameter("@P_ITEM_NAME", pItemName);
//				
//			cmd.execute();
//
//
//		}
		
		public static void showAsCombobox(NString pLov,NString pValue,NString pName,NString pHeight,NString pShowNull,NString pNullText,NString pNullValue,NString pShowExtra,NString pExtraText,NString pOnblur,NString pOnchange,NString pOnfocus,NNumber pMaxElements,NString pAttributes,NString pTranslation) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.SHOW_AS_COMBOBOX", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_LOV", pLov);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_NAME", pName);
			cmd.addParameter("@P_HEIGHT", pHeight);
			cmd.addParameter("@P_SHOW_NULL", pShowNull);
			cmd.addParameter("@P_NULL_TEXT", pNullText);
			cmd.addParameter("@P_NULL_VALUE", pNullValue);
			cmd.addParameter("@P_SHOW_EXTRA", pShowExtra);
			cmd.addParameter("@P_EXTRA_TEXT", pExtraText);
			cmd.addParameter("@P_ONBLUR", pOnblur);
			cmd.addParameter("@P_ONCHANGE", pOnchange);
			cmd.addParameter("@P_ONFOCUS", pOnfocus);
			cmd.addParameter("@P_MAX_ELEMENTS", pMaxElements);
			cmd.addParameter("@P_ATTRIBUTES", pAttributes);
			cmd.addParameter("@P_TRANSLATION", pTranslation);
				
			cmd.execute();


		}
		
		public static void showAsDisplayOnly(NString pLov,NString pValue,NString pTranslation,NString pAttributes,NString pNullDisplayValue,NString pDisplayExtra) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.SHOW_AS_DISPLAY_ONLY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_LOV", pLov);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_TRANSLATION", pTranslation);
			cmd.addParameter("@P_ATTRIBUTES", pAttributes);
			cmd.addParameter("@P_NULL_DISPLAY_VALUE", pNullDisplayValue);
			cmd.addParameter("@P_DISPLAY_EXTRA", pDisplayExtra);
				
			cmd.execute();


		}
		
//		public static void showAsMultipleSelect(NString pLov,List<WwvFlowGlobal.VcArr2Row> pValue,NString pName,NString pShowNull,NString pNullText,NString pNullValue,NString pHeight,NString pShowExtra,NString pExtraText,NString pOnblur,NString pOnchange,NString pOnfocus,NNumber pMaxElements,NString pAttributes,NString pTranslation) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.SHOW_AS_MULTIPLE_SELECT", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_LOV", pLov);
//			// cmd.addParameter(DbTypes.getTableType("P_VALUE", "", pValue, object.class));
//			cmd.addParameter("@P_NAME", pName);
//			cmd.addParameter("@P_SHOW_NULL", pShowNull);
//			cmd.addParameter("@P_NULL_TEXT", pNullText);
//			cmd.addParameter("@P_NULL_VALUE", pNullValue);
//			cmd.addParameter("@P_HEIGHT", pHeight);
//			cmd.addParameter("@P_SHOW_EXTRA", pShowExtra);
//			cmd.addParameter("@P_EXTRA_TEXT", pExtraText);
//			cmd.addParameter("@P_ONBLUR", pOnblur);
//			cmd.addParameter("@P_ONCHANGE", pOnchange);
//			cmd.addParameter("@P_ONFOCUS", pOnfocus);
//			cmd.addParameter("@P_MAX_ELEMENTS", pMaxElements);
//			cmd.addParameter("@P_ATTRIBUTES", pAttributes);
//			cmd.addParameter("@P_TRANSLATION", pTranslation);
//				
//			cmd.execute();
//
//
//		}
		
//		public static void showAsMultipleSelect2(NString pLov,List<WwvFlowGlobal.VcArr2Row> pValue,NString pName,NString pShowNull,NString pNullText,NString pNullValue,NString pHeight,NString pShowExtra,NString pExtraText,NString pOnblur,NString pOnchange,NString pOnfocus,NNumber pMaxElements,NString pAttributes,NString pTranslation) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.SHOW_AS_MULTIPLE_SELECT2", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_LOV", pLov);
//			// cmd.addParameter(DbTypes.getTableType("P_VALUE", "", pValue, object.class));
//			cmd.addParameter("@P_NAME", pName);
//			cmd.addParameter("@P_SHOW_NULL", pShowNull);
//			cmd.addParameter("@P_NULL_TEXT", pNullText);
//			cmd.addParameter("@P_NULL_VALUE", pNullValue);
//			cmd.addParameter("@P_HEIGHT", pHeight);
//			cmd.addParameter("@P_SHOW_EXTRA", pShowExtra);
//			cmd.addParameter("@P_EXTRA_TEXT", pExtraText);
//			cmd.addParameter("@P_ONBLUR", pOnblur);
//			cmd.addParameter("@P_ONCHANGE", pOnchange);
//			cmd.addParameter("@P_ONFOCUS", pOnfocus);
//			cmd.addParameter("@P_MAX_ELEMENTS", pMaxElements);
//			cmd.addParameter("@P_ATTRIBUTES", pAttributes);
//			cmd.addParameter("@P_TRANSLATION", pTranslation);
//				
//			cmd.execute();
//
//
//		}
		
		public static void showAsPopup(NString pLov,NString pName,NString pValue,NString pWidth,NString pMaxLength,NString pFormIndex,NString pElementIndex,NString pEscapeHtml,NString pMaxElements,NString pAttributes,NString pEvalValue,NString pOkToQuery,NString pTranslation,NString pReturnKey,NString pHiddenElemName,NString pFilterFirstFetch,NString pItemId,NString pElementAttributes) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.SHOW_AS_POPUP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_LOV", pLov);
			cmd.addParameter("@P_NAME", pName);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_WIDTH", pWidth);
			cmd.addParameter("@P_MAX_LENGTH", pMaxLength);
			cmd.addParameter("@P_FORM_INDEX", pFormIndex);
			cmd.addParameter("@P_ELEMENT_INDEX", pElementIndex);
			cmd.addParameter("@P_ESCAPE_HTML", pEscapeHtml);
			cmd.addParameter("@P_MAX_ELEMENTS", pMaxElements);
			cmd.addParameter("@P_ATTRIBUTES", pAttributes);
			cmd.addParameter("@P_EVAL_VALUE", pEvalValue);
			cmd.addParameter("@P_OK_TO_QUERY", pOkToQuery);
			cmd.addParameter("@P_TRANSLATION", pTranslation);
			cmd.addParameter("@P_RETURN_KEY", pReturnKey);
			cmd.addParameter("@P_HIDDEN_ELEM_NAME", pHiddenElemName);
			cmd.addParameter("@P_FILTER_FIRST_FETCH", pFilterFirstFetch);
			cmd.addParameter("@P_ITEM_ID", pItemId);
			cmd.addParameter("@P_ELEMENT_ATTRIBUTES", pElementAttributes);
				
			cmd.execute();


		}
		
		public static NString FshowAsPopup(NString pLov,NString pName,NString pValue,NString pWidth,NString pMaxLength,NString pFormIndex,NString pElementIndex,NString pEscapeHtml,NString pMaxElements,NString pAttributes,NString pEvalValue,NString pOkToQuery,NString pTranslation,NString pReturnKey,NString pHiddenElemName,NString pFilterFirstFetch,NString pItemId,NString pElementAttributes) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.SHOW_AS_POPUP", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_LOV", pLov);
			cmd.addParameter("@P_NAME", pName);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_WIDTH", pWidth);
			cmd.addParameter("@P_MAX_LENGTH", pMaxLength);
			cmd.addParameter("@P_FORM_INDEX", pFormIndex);
			cmd.addParameter("@P_ELEMENT_INDEX", pElementIndex);
			cmd.addParameter("@P_ESCAPE_HTML", pEscapeHtml);
			cmd.addParameter("@P_MAX_ELEMENTS", pMaxElements);
			cmd.addParameter("@P_ATTRIBUTES", pAttributes);
			cmd.addParameter("@P_EVAL_VALUE", pEvalValue);
			cmd.addParameter("@P_OK_TO_QUERY", pOkToQuery);
			cmd.addParameter("@P_TRANSLATION", pTranslation);
			cmd.addParameter("@P_RETURN_KEY", pReturnKey);
			cmd.addParameter("@P_HIDDEN_ELEM_NAME", pHiddenElemName);
			cmd.addParameter("@P_FILTER_FIRST_FETCH", pFilterFirstFetch);
			cmd.addParameter("@P_ITEM_ID", pItemId);
			cmd.addParameter("@P_ELEMENT_ATTRIBUTES", pElementAttributes);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void showAsPopupCalendar(NString pRequest,NString pTitle,NString pYyyy,NString pMm,NString pDd,NString pHh,NString pMi,NString pPm,NString pElementIndex,NString pFormIndex,NString pDateFormat,NString pBgcolor,NString pWhiteForeground,NString pApplicationFormat,NString pLang,NString pApplicationId,NString pSecurityGroupId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.SHOW_AS_POPUP_CALENDAR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_REQUEST", pRequest);
			cmd.addParameter("@P_TITLE", pTitle);
			cmd.addParameter("@P_YYYY", pYyyy);
			cmd.addParameter("@P_MM", pMm);
			cmd.addParameter("@P_DD", pDd);
			cmd.addParameter("@P_HH", pHh);
			cmd.addParameter("@P_MI", pMi);
			cmd.addParameter("@P_PM", pPm);
			cmd.addParameter("@P_ELEMENT_INDEX", pElementIndex);
			cmd.addParameter("@P_FORM_INDEX", pFormIndex);
			cmd.addParameter("@P_DATE_FORMAT", pDateFormat);
			cmd.addParameter("@P_BGCOLOR", pBgcolor);
			cmd.addParameter("@P_WHITE_FOREGROUND", pWhiteForeground);
			cmd.addParameter("@P_APPLICATION_FORMAT", pApplicationFormat);
			cmd.addParameter("@P_LANG", pLang);
			cmd.addParameter("@P_APPLICATION_ID", pApplicationId);
			cmd.addParameter("@P_SECURITY_GROUP_ID", pSecurityGroupId);
				
			cmd.execute();


		}
		
		public static void showAsPopupColor(NString pItemName,NString pName,NString pValue,NString pWidth,NString pMaxLength,NString pElementIndex,NString pAttributes,NString pItemId,NString pElementAttributes) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.SHOW_AS_POPUP_COLOR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ITEM_NAME", pItemName);
			cmd.addParameter("@P_NAME", pName);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_WIDTH", pWidth);
			cmd.addParameter("@P_MAX_LENGTH", pMaxLength);
			cmd.addParameter("@P_ELEMENT_INDEX", pElementIndex);
			cmd.addParameter("@P_ATTRIBUTES", pAttributes);
			cmd.addParameter("@P_ITEM_ID", pItemId);
			cmd.addParameter("@P_ELEMENT_ATTRIBUTES", pElementAttributes);
				
			cmd.execute();


		}
		
		public static void showAsRadioGroup(NString pLov,NString pValue,NString pName,NString pShowNull,NString pNullText,NString pNullValue,NString pCols,NString pShowExtra,NString pExtraText,NString pOnblur,NString pOnchange,NString pOnfocus,NString pMaxElements,NString pAttributes,NString pTranslation,NString pAttributes2,NString pItemName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.SHOW_AS_RADIO_GROUP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_LOV", pLov);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_NAME", pName);
			cmd.addParameter("@P_SHOW_NULL", pShowNull);
			cmd.addParameter("@P_NULL_TEXT", pNullText);
			cmd.addParameter("@P_NULL_VALUE", pNullValue);
			cmd.addParameter("@P_COLS", pCols);
			cmd.addParameter("@P_SHOW_EXTRA", pShowExtra);
			cmd.addParameter("@P_EXTRA_TEXT", pExtraText);
			cmd.addParameter("@P_ONBLUR", pOnblur);
			cmd.addParameter("@P_ONCHANGE", pOnchange);
			cmd.addParameter("@P_ONFOCUS", pOnfocus);
			cmd.addParameter("@P_MAX_ELEMENTS", pMaxElements);
			cmd.addParameter("@P_ATTRIBUTES", pAttributes);
			cmd.addParameter("@P_TRANSLATION", pTranslation);
			cmd.addParameter("@P_ATTRIBUTES2", pAttributes2);
			cmd.addParameter("@P_ITEM_NAME", pItemName);
				
			cmd.execute();


		}
		
		public static void showAsRadioGroup2(NString pLov,NString pValue,NString pName,NString pShowNull,NString pNullText,NString pNullValue,NString pCols,NString pShowExtra,NString pExtraText,NString pOnblur,NString pOnchange,NString pOnfocus,NString pMaxElements,NString pAttributes,NString pTranslation,NString pAttributes2,NString pItemName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.SHOW_AS_RADIO_GROUP2", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_LOV", pLov);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_NAME", pName);
			cmd.addParameter("@P_SHOW_NULL", pShowNull);
			cmd.addParameter("@P_NULL_TEXT", pNullText);
			cmd.addParameter("@P_NULL_VALUE", pNullValue);
			cmd.addParameter("@P_COLS", pCols);
			cmd.addParameter("@P_SHOW_EXTRA", pShowExtra);
			cmd.addParameter("@P_EXTRA_TEXT", pExtraText);
			cmd.addParameter("@P_ONBLUR", pOnblur);
			cmd.addParameter("@P_ONCHANGE", pOnchange);
			cmd.addParameter("@P_ONFOCUS", pOnfocus);
			cmd.addParameter("@P_MAX_ELEMENTS", pMaxElements);
			cmd.addParameter("@P_ATTRIBUTES", pAttributes);
			cmd.addParameter("@P_TRANSLATION", pTranslation);
			cmd.addParameter("@P_ATTRIBUTES2", pAttributes2);
			cmd.addParameter("@P_ITEM_NAME", pItemName);
				
			cmd.execute();


		}
		
//		public static void showAsShuttle(NString pLov,List<WwvFlowGlobal.VcArr2Row> pValue,NString pName,NString pShowNull,NString pNullText,NString pNullValue,NString pHeight,NString pWidth,NString pShowExtra,NString pExtraText,NString pOnblur,NString pOnchange,NString pOnfocus,NString pAttributes,NNumber pMaxElements,NString pItemId,NString pItemTagAttrs,NString pTranslation,NString pCurrentItemSequence,NString prefreshimage,NString prightallimage,NString prightimage,NString pleftimage,NString pleftallimage,NString ptopimage,NString pupimage,NString pdownimage,NString pbottomimage) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.SHOW_AS_SHUTTLE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_LOV", pLov);
//			// cmd.addParameter(DbTypes.getTableType("P_VALUE", "", pValue, object.class));
//			cmd.addParameter("@P_NAME", pName);
//			cmd.addParameter("@P_SHOW_NULL", pShowNull);
//			cmd.addParameter("@P_NULL_TEXT", pNullText);
//			cmd.addParameter("@P_NULL_VALUE", pNullValue);
//			cmd.addParameter("@P_HEIGHT", pHeight);
//			cmd.addParameter("@P_WIDTH", pWidth);
//			cmd.addParameter("@P_SHOW_EXTRA", pShowExtra);
//			cmd.addParameter("@P_EXTRA_TEXT", pExtraText);
//			cmd.addParameter("@P_ONBLUR", pOnblur);
//			cmd.addParameter("@P_ONCHANGE", pOnchange);
//			cmd.addParameter("@P_ONFOCUS", pOnfocus);
//			cmd.addParameter("@P_ATTRIBUTES", pAttributes);
//			cmd.addParameter("@P_MAX_ELEMENTS", pMaxElements);
//			cmd.addParameter("@P_ITEM_ID", pItemId);
//			cmd.addParameter("@P_ITEM_TAG_ATTRS", pItemTagAttrs);
//			cmd.addParameter("@P_TRANSLATION", pTranslation);
//			cmd.addParameter("@P_CURRENT_ITEM_SEQUENCE", pCurrentItemSequence);
//			cmd.addParameter("@PREFRESHIMAGE", prefreshimage);
//			cmd.addParameter("@PRIGHTALLIMAGE", prightallimage);
//			cmd.addParameter("@PRIGHTIMAGE", prightimage);
//			cmd.addParameter("@PLEFTIMAGE", pleftimage);
//			cmd.addParameter("@PLEFTALLIMAGE", pleftallimage);
//			cmd.addParameter("@PTOPIMAGE", ptopimage);
//			cmd.addParameter("@PUPIMAGE", pupimage);
//			cmd.addParameter("@PDOWNIMAGE", pdownimage);
//			cmd.addParameter("@PBOTTOMIMAGE", pbottomimage);
//				
//			cmd.execute();
//
//
//		}
		
		public static void showAsTextareaHtmlEditor(NString pValue,NString pName,NString pHeight,NString pSize,NString pAttributes,NString pToolbarset,NString pItemName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.SHOW_AS_TEXTAREA_HTML_EDITOR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_NAME", pName);
			cmd.addParameter("@P_HEIGHT", pHeight);
			cmd.addParameter("@P_SIZE", pSize);
			cmd.addParameter("@P_ATTRIBUTES", pAttributes);
			cmd.addParameter("@P_TOOLBARSET", pToolbarset);
			cmd.addParameter("@P_ITEM_NAME", pItemName);
				
			cmd.execute();


		}
		
		public static void showAsTextareaWithControls(NString pValue,NString pName,NString pHeight,NString pSize,NString pAttributes,NString pItemName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.SHOW_AS_TEXTAREA_WITH_CONTROLS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_NAME", pName);
			cmd.addParameter("@P_HEIGHT", pHeight);
			cmd.addParameter("@P_SIZE", pSize);
			cmd.addParameter("@P_ATTRIBUTES", pAttributes);
			cmd.addParameter("@P_ITEM_NAME", pItemName);
				
			cmd.execute();


		}
		
		public static void showInvalidInstanceScreen(NString pMessage,NString pLinkText,NString pLinkTarget) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.SHOW_INVALID_INSTANCE_SCREEN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_MESSAGE", pMessage);
			cmd.addParameter("@P_LINK_TEXT", pLinkText);
			cmd.addParameter("@P_LINK_TARGET", pLinkTarget);
				
			cmd.execute();


		}
		
		public static NString FshowLineNumber(NString q) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.SHOW_LINE_NUMBER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@Q", q);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FstaticToQuery(NString pLov) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.STATIC_TO_QUERY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_LOV", pLov);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static List<VcArr2Row> FstringToTable(NString str,NString sep) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.STRING_TO_TABLE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<VcArr2Row>.class);
//			cmd.addParameter("@STR", str);
//			cmd.addParameter("@SEP", sep);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<VcArr2Row>.class);
//
//		}
		
//		public static List<VcArr2Row> FstringToTable2(NString str,NString sep) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.STRING_TO_TABLE2", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<VcArr2Row>.class);
//			cmd.addParameter("@STR", str);
//			cmd.addParameter("@SEP", sep);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<VcArr2Row>.class);
//
//		}
		
		public static NString Fstriphtml(NString pHtml) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.STRIPHTML", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_HTML", pHtml);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static NString FtableToString(List<WwvFlowGlobal.VcArr2Row> t,NString s) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.TABLE_TO_STRING", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			// cmd.addParameter(DbTypes.getTableType("T", "", t, object.class));
//			cmd.addParameter("@S", s);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
		
//		public static NString FtableToString2(List<WwvFlowGlobal.VcArr2Row> t,NString s) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.TABLE_TO_STRING2", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			// cmd.addParameter(DbTypes.getTableType("T", "", t, object.class));
//			cmd.addParameter("@S", s);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
		
		public static NString FtimeSince(NDate pDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.TIME_SINCE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_DATE", pDate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void todayCalendar() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.TODAY_CALENDAR", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static NString FurlDecode2(NString pStr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.URL_DECODE2", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_STR", pStr);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FurlEncode(NString pStr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.URL_ENCODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_STR", pStr);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FurlEncode2(NString pStr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.URL_ENCODE2", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_STR", pStr);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString Furlencode(NString pStr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.URLENCODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_STR", pStr);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void weeklyCalendar(NString pDateTypeField) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_UTILITIES.WEEKLY_CALENDAR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DATE_TYPE_FIELD", pDateTypeField);
				
			cmd.execute();


		}
		
	
	
	
}
