package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class HtmldbItem {
		public static NString Fcheckbox(NNumber pIdx,NString pValue,NString pAttributes,NString pCheckedValues,NString pCheckedValuesDelimitor,NString pItemId,NString pItemLabel) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_ITEM.CHECKBOX", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_IDX", pIdx);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_ATTRIBUTES", pAttributes);
			cmd.addParameter("@P_CHECKED_VALUES", pCheckedValues);
			cmd.addParameter("@P_CHECKED_VALUES_DELIMITOR", pCheckedValuesDelimitor);
			cmd.addParameter("@P_ITEM_ID", pItemId);
			cmd.addParameter("@P_ITEM_LABEL", pItemLabel);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FdatePopup(NNumber pIdx,NNumber pRow,NDate pValue,NString pDateFormat,NNumber pSize,NNumber pMaxlength,NString pAttributes,NString pItemId,NString pItemLabel,NString pDisplayAs) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_ITEM.DATE_POPUP", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_IDX", pIdx);
			cmd.addParameter("@P_ROW", pRow);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_DATE_FORMAT", pDateFormat);
			cmd.addParameter("@P_SIZE", pSize);
			cmd.addParameter("@P_MAXLENGTH", pMaxlength);
			cmd.addParameter("@P_ATTRIBUTES", pAttributes);
			cmd.addParameter("@P_ITEM_ID", pItemId);
			cmd.addParameter("@P_ITEM_LABEL", pItemLabel);
			cmd.addParameter("@P_DISPLAY_AS", pDisplayAs);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FdisplayAndSave(NNumber pIdx,NString pValue,NString pItemId,NString pItemLabel) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_ITEM.DISPLAY_AND_SAVE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_IDX", pIdx);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_ITEM_ID", pItemId);
			cmd.addParameter("@P_ITEM_LABEL", pItemLabel);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString Fhidden(NNumber pIdx,NString pValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_ITEM.HIDDEN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_IDX", pIdx);
			cmd.addParameter("@P_VALUE", pValue);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString Fmd5Checksum(NString pValue01,NString pValue02,NString pValue03,NString pValue04,NString pValue05,NString pValue06,NString pValue07,NString pValue08,NString pValue09,NString pValue10,NString pValue11,NString pValue12,NString pValue13,NString pValue14,NString pValue15,NString pValue16,NString pValue17,NString pValue18,NString pValue19,NString pValue20,NString pValue21,NString pValue22,NString pValue23,NString pValue24,NString pValue25,NString pValue26,NString pValue27,NString pValue28,NString pValue29,NString pValue30,NString pValue31,NString pValue32,NString pValue33,NString pValue34,NString pValue35,NString pValue36,NString pValue37,NString pValue38,NString pValue39,NString pValue40,NString pValue41,NString pValue42,NString pValue43,NString pValue44,NString pValue45,NString pValue46,NString pValue47,NString pValue48,NString pValue49,NString pValue50,NString pColSep) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_ITEM.MD5_CHECKSUM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_VALUE01", pValue01);
			cmd.addParameter("@P_VALUE02", pValue02);
			cmd.addParameter("@P_VALUE03", pValue03);
			cmd.addParameter("@P_VALUE04", pValue04);
			cmd.addParameter("@P_VALUE05", pValue05);
			cmd.addParameter("@P_VALUE06", pValue06);
			cmd.addParameter("@P_VALUE07", pValue07);
			cmd.addParameter("@P_VALUE08", pValue08);
			cmd.addParameter("@P_VALUE09", pValue09);
			cmd.addParameter("@P_VALUE10", pValue10);
			cmd.addParameter("@P_VALUE11", pValue11);
			cmd.addParameter("@P_VALUE12", pValue12);
			cmd.addParameter("@P_VALUE13", pValue13);
			cmd.addParameter("@P_VALUE14", pValue14);
			cmd.addParameter("@P_VALUE15", pValue15);
			cmd.addParameter("@P_VALUE16", pValue16);
			cmd.addParameter("@P_VALUE17", pValue17);
			cmd.addParameter("@P_VALUE18", pValue18);
			cmd.addParameter("@P_VALUE19", pValue19);
			cmd.addParameter("@P_VALUE20", pValue20);
			cmd.addParameter("@P_VALUE21", pValue21);
			cmd.addParameter("@P_VALUE22", pValue22);
			cmd.addParameter("@P_VALUE23", pValue23);
			cmd.addParameter("@P_VALUE24", pValue24);
			cmd.addParameter("@P_VALUE25", pValue25);
			cmd.addParameter("@P_VALUE26", pValue26);
			cmd.addParameter("@P_VALUE27", pValue27);
			cmd.addParameter("@P_VALUE28", pValue28);
			cmd.addParameter("@P_VALUE29", pValue29);
			cmd.addParameter("@P_VALUE30", pValue30);
			cmd.addParameter("@P_VALUE31", pValue31);
			cmd.addParameter("@P_VALUE32", pValue32);
			cmd.addParameter("@P_VALUE33", pValue33);
			cmd.addParameter("@P_VALUE34", pValue34);
			cmd.addParameter("@P_VALUE35", pValue35);
			cmd.addParameter("@P_VALUE36", pValue36);
			cmd.addParameter("@P_VALUE37", pValue37);
			cmd.addParameter("@P_VALUE38", pValue38);
			cmd.addParameter("@P_VALUE39", pValue39);
			cmd.addParameter("@P_VALUE40", pValue40);
			cmd.addParameter("@P_VALUE41", pValue41);
			cmd.addParameter("@P_VALUE42", pValue42);
			cmd.addParameter("@P_VALUE43", pValue43);
			cmd.addParameter("@P_VALUE44", pValue44);
			cmd.addParameter("@P_VALUE45", pValue45);
			cmd.addParameter("@P_VALUE46", pValue46);
			cmd.addParameter("@P_VALUE47", pValue47);
			cmd.addParameter("@P_VALUE48", pValue48);
			cmd.addParameter("@P_VALUE49", pValue49);
			cmd.addParameter("@P_VALUE50", pValue50);
			cmd.addParameter("@P_COL_SEP", pColSep);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString Fmd5Hidden(NNumber pIdx,NString pValue01,NString pValue02,NString pValue03,NString pValue04,NString pValue05,NString pValue06,NString pValue07,NString pValue08,NString pValue09,NString pValue10,NString pValue11,NString pValue12,NString pValue13,NString pValue14,NString pValue15,NString pValue16,NString pValue17,NString pValue18,NString pValue19,NString pValue20,NString pValue21,NString pValue22,NString pValue23,NString pValue24,NString pValue25,NString pValue26,NString pValue27,NString pValue28,NString pValue29,NString pValue30,NString pValue31,NString pValue32,NString pValue33,NString pValue34,NString pValue35,NString pValue36,NString pValue37,NString pValue38,NString pValue39,NString pValue40,NString pValue41,NString pValue42,NString pValue43,NString pValue44,NString pValue45,NString pValue46,NString pValue47,NString pValue48,NString pValue49,NString pValue50,NString pColSep) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_ITEM.MD5_HIDDEN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_IDX", pIdx);
			cmd.addParameter("@P_VALUE01", pValue01);
			cmd.addParameter("@P_VALUE02", pValue02);
			cmd.addParameter("@P_VALUE03", pValue03);
			cmd.addParameter("@P_VALUE04", pValue04);
			cmd.addParameter("@P_VALUE05", pValue05);
			cmd.addParameter("@P_VALUE06", pValue06);
			cmd.addParameter("@P_VALUE07", pValue07);
			cmd.addParameter("@P_VALUE08", pValue08);
			cmd.addParameter("@P_VALUE09", pValue09);
			cmd.addParameter("@P_VALUE10", pValue10);
			cmd.addParameter("@P_VALUE11", pValue11);
			cmd.addParameter("@P_VALUE12", pValue12);
			cmd.addParameter("@P_VALUE13", pValue13);
			cmd.addParameter("@P_VALUE14", pValue14);
			cmd.addParameter("@P_VALUE15", pValue15);
			cmd.addParameter("@P_VALUE16", pValue16);
			cmd.addParameter("@P_VALUE17", pValue17);
			cmd.addParameter("@P_VALUE18", pValue18);
			cmd.addParameter("@P_VALUE19", pValue19);
			cmd.addParameter("@P_VALUE20", pValue20);
			cmd.addParameter("@P_VALUE21", pValue21);
			cmd.addParameter("@P_VALUE22", pValue22);
			cmd.addParameter("@P_VALUE23", pValue23);
			cmd.addParameter("@P_VALUE24", pValue24);
			cmd.addParameter("@P_VALUE25", pValue25);
			cmd.addParameter("@P_VALUE26", pValue26);
			cmd.addParameter("@P_VALUE27", pValue27);
			cmd.addParameter("@P_VALUE28", pValue28);
			cmd.addParameter("@P_VALUE29", pValue29);
			cmd.addParameter("@P_VALUE30", pValue30);
			cmd.addParameter("@P_VALUE31", pValue31);
			cmd.addParameter("@P_VALUE32", pValue32);
			cmd.addParameter("@P_VALUE33", pValue33);
			cmd.addParameter("@P_VALUE34", pValue34);
			cmd.addParameter("@P_VALUE35", pValue35);
			cmd.addParameter("@P_VALUE36", pValue36);
			cmd.addParameter("@P_VALUE37", pValue37);
			cmd.addParameter("@P_VALUE38", pValue38);
			cmd.addParameter("@P_VALUE39", pValue39);
			cmd.addParameter("@P_VALUE40", pValue40);
			cmd.addParameter("@P_VALUE41", pValue41);
			cmd.addParameter("@P_VALUE42", pValue42);
			cmd.addParameter("@P_VALUE43", pValue43);
			cmd.addParameter("@P_VALUE44", pValue44);
			cmd.addParameter("@P_VALUE45", pValue45);
			cmd.addParameter("@P_VALUE46", pValue46);
			cmd.addParameter("@P_VALUE47", pValue47);
			cmd.addParameter("@P_VALUE48", pValue48);
			cmd.addParameter("@P_VALUE49", pValue49);
			cmd.addParameter("@P_VALUE50", pValue50);
			cmd.addParameter("@P_COL_SEP", pColSep);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void multiRowUpdate(NString pMruString,NNumber pRegionId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_ITEM.MULTI_ROW_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_MRU_STRING", pMruString);
			cmd.addParameter("@P_REGION_ID", pRegionId);
				
			cmd.execute();


		}
		
		public static NString FpopupFromLov(NNumber pIdx,NString pValue,NString pLovName,NString pWidth,NString pMaxLength,NString pFormIndex,NString pEscapeHtml,NString pMaxElements,NString pAttributes,NString pOkToQuery,NString pItemId,NString pItemLabel) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_ITEM.POPUP_FROM_LOV", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_IDX", pIdx);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_LOV_NAME", pLovName);
			cmd.addParameter("@P_WIDTH", pWidth);
			cmd.addParameter("@P_MAX_LENGTH", pMaxLength);
			cmd.addParameter("@P_FORM_INDEX", pFormIndex);
			cmd.addParameter("@P_ESCAPE_HTML", pEscapeHtml);
			cmd.addParameter("@P_MAX_ELEMENTS", pMaxElements);
			cmd.addParameter("@P_ATTRIBUTES", pAttributes);
			cmd.addParameter("@P_OK_TO_QUERY", pOkToQuery);
			cmd.addParameter("@P_ITEM_ID", pItemId);
			cmd.addParameter("@P_ITEM_LABEL", pItemLabel);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FpopupFromQuery(NNumber pIdx,NString pValue,NString pLovQuery,NString pWidth,NString pMaxLength,NString pFormIndex,NString pEscapeHtml,NString pMaxElements,NString pAttributes,NString pOkToQuery,NString pItemId,NString pItemLabel) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_ITEM.POPUP_FROM_QUERY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_IDX", pIdx);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_LOV_QUERY", pLovQuery);
			cmd.addParameter("@P_WIDTH", pWidth);
			cmd.addParameter("@P_MAX_LENGTH", pMaxLength);
			cmd.addParameter("@P_FORM_INDEX", pFormIndex);
			cmd.addParameter("@P_ESCAPE_HTML", pEscapeHtml);
			cmd.addParameter("@P_MAX_ELEMENTS", pMaxElements);
			cmd.addParameter("@P_ATTRIBUTES", pAttributes);
			cmd.addParameter("@P_OK_TO_QUERY", pOkToQuery);
			cmd.addParameter("@P_ITEM_ID", pItemId);
			cmd.addParameter("@P_ITEM_LABEL", pItemLabel);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FpopupkeyFromLov(NNumber pIdx,NString pValue,NString pLovName,NString pWidth,NString pMaxLength,NString pFormIndex,NString pEscapeHtml,NString pMaxElements,NString pAttributes,NString pOkToQuery,NString pItemId,NString pItemLabel) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_ITEM.POPUPKEY_FROM_LOV", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_IDX", pIdx);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_LOV_NAME", pLovName);
			cmd.addParameter("@P_WIDTH", pWidth);
			cmd.addParameter("@P_MAX_LENGTH", pMaxLength);
			cmd.addParameter("@P_FORM_INDEX", pFormIndex);
			cmd.addParameter("@P_ESCAPE_HTML", pEscapeHtml);
			cmd.addParameter("@P_MAX_ELEMENTS", pMaxElements);
			cmd.addParameter("@P_ATTRIBUTES", pAttributes);
			cmd.addParameter("@P_OK_TO_QUERY", pOkToQuery);
			cmd.addParameter("@P_ITEM_ID", pItemId);
			cmd.addParameter("@P_ITEM_LABEL", pItemLabel);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FpopupkeyFromQuery(NNumber pIdx,NString pValue,NString pLovQuery,NString pWidth,NString pMaxLength,NString pFormIndex,NString pEscapeHtml,NString pMaxElements,NString pAttributes,NString pOkToQuery,NString pItemId,NString pItemLabel) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_ITEM.POPUPKEY_FROM_QUERY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_IDX", pIdx);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_LOV_QUERY", pLovQuery);
			cmd.addParameter("@P_WIDTH", pWidth);
			cmd.addParameter("@P_MAX_LENGTH", pMaxLength);
			cmd.addParameter("@P_FORM_INDEX", pFormIndex);
			cmd.addParameter("@P_ESCAPE_HTML", pEscapeHtml);
			cmd.addParameter("@P_MAX_ELEMENTS", pMaxElements);
			cmd.addParameter("@P_ATTRIBUTES", pAttributes);
			cmd.addParameter("@P_OK_TO_QUERY", pOkToQuery);
			cmd.addParameter("@P_ITEM_ID", pItemId);
			cmd.addParameter("@P_ITEM_LABEL", pItemLabel);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString Fradiogroup(NNumber pIdx,NString pValue,NString pSelectedValue,NString pDisplay,NString pAttributes,NString pOnblur,NString pOnchange,NString pOnfocus,NString pItemId,NString pItemLabel) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_ITEM.RADIOGROUP", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_IDX", pIdx);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_SELECTED_VALUE", pSelectedValue);
			cmd.addParameter("@P_DISPLAY", pDisplay);
			cmd.addParameter("@P_ATTRIBUTES", pAttributes);
			cmd.addParameter("@P_ONBLUR", pOnblur);
			cmd.addParameter("@P_ONCHANGE", pOnchange);
			cmd.addParameter("@P_ONFOCUS", pOnfocus);
			cmd.addParameter("@P_ITEM_ID", pItemId);
			cmd.addParameter("@P_ITEM_LABEL", pItemLabel);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FselectList(NNumber pIdx,NString pValue,NString pListValues,NString pAttributes,NString pShowNull,NString pNullValue,NString pNullText,NString pItemId,NString pItemLabel,NString pShowExtra) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_ITEM.SELECT_LIST", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_IDX", pIdx);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_LIST_VALUES", pListValues);
			cmd.addParameter("@P_ATTRIBUTES", pAttributes);
			cmd.addParameter("@P_SHOW_NULL", pShowNull);
			cmd.addParameter("@P_NULL_VALUE", pNullValue);
			cmd.addParameter("@P_NULL_TEXT", pNullText);
			cmd.addParameter("@P_ITEM_ID", pItemId);
			cmd.addParameter("@P_ITEM_LABEL", pItemLabel);
			cmd.addParameter("@P_SHOW_EXTRA", pShowExtra);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FselectListFromLov(NNumber pIdx,NString pValue,NString pLov,NString pAttributes,NString pShowNull,NString pNullValue,NString pNullText,NString pItemId,NString pItemLabel,NString pShowExtra) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_ITEM.SELECT_LIST_FROM_LOV", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_IDX", pIdx);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_LOV", pLov);
			cmd.addParameter("@P_ATTRIBUTES", pAttributes);
			cmd.addParameter("@P_SHOW_NULL", pShowNull);
			cmd.addParameter("@P_NULL_VALUE", pNullValue);
			cmd.addParameter("@P_NULL_TEXT", pNullText);
			cmd.addParameter("@P_ITEM_ID", pItemId);
			cmd.addParameter("@P_ITEM_LABEL", pItemLabel);
			cmd.addParameter("@P_SHOW_EXTRA", pShowExtra);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FselectListFromLovXl(NNumber pIdx,NString pValue,NString pLov,NString pAttributes,NString pShowNull,NString pNullValue,NString pNullText,NString pItemId,NString pItemLabel,NString pShowExtra) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_ITEM.SELECT_LIST_FROM_LOV_XL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_IDX", pIdx);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_LOV", pLov);
			cmd.addParameter("@P_ATTRIBUTES", pAttributes);
			cmd.addParameter("@P_SHOW_NULL", pShowNull);
			cmd.addParameter("@P_NULL_VALUE", pNullValue);
			cmd.addParameter("@P_NULL_TEXT", pNullText);
			cmd.addParameter("@P_ITEM_ID", pItemId);
			cmd.addParameter("@P_ITEM_LABEL", pItemLabel);
			cmd.addParameter("@P_SHOW_EXTRA", pShowExtra);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FselectListFromQuery(NNumber pIdx,NString pValue,NString pQuery,NString pAttributes,NString pShowNull,NString pNullValue,NString pNullText,NString pItemId,NString pItemLabel,NString pShowExtra) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_ITEM.SELECT_LIST_FROM_QUERY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_IDX", pIdx);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_QUERY", pQuery);
			cmd.addParameter("@P_ATTRIBUTES", pAttributes);
			cmd.addParameter("@P_SHOW_NULL", pShowNull);
			cmd.addParameter("@P_NULL_VALUE", pNullValue);
			cmd.addParameter("@P_NULL_TEXT", pNullText);
			cmd.addParameter("@P_ITEM_ID", pItemId);
			cmd.addParameter("@P_ITEM_LABEL", pItemLabel);
			cmd.addParameter("@P_SHOW_EXTRA", pShowExtra);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FselectListFromQueryXl(NNumber pIdx,NString pValue,NString pQuery,NString pAttributes,NString pShowNull,NString pNullValue,NString pNullText,NString pItemId,NString pItemLabel,NString pShowExtra) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_ITEM.SELECT_LIST_FROM_QUERY_XL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_IDX", pIdx);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_QUERY", pQuery);
			cmd.addParameter("@P_ATTRIBUTES", pAttributes);
			cmd.addParameter("@P_SHOW_NULL", pShowNull);
			cmd.addParameter("@P_NULL_VALUE", pNullValue);
			cmd.addParameter("@P_NULL_TEXT", pNullText);
			cmd.addParameter("@P_ITEM_ID", pItemId);
			cmd.addParameter("@P_ITEM_LABEL", pItemLabel);
			cmd.addParameter("@P_SHOW_EXTRA", pShowExtra);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString Ftext(NNumber pIdx,NString pValue,NNumber pSize,NNumber pMaxlength,NString pAttributes,NString pItemId,NString pItemLabel) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_ITEM.TEXT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_IDX", pIdx);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_SIZE", pSize);
			cmd.addParameter("@P_MAXLENGTH", pMaxlength);
			cmd.addParameter("@P_ATTRIBUTES", pAttributes);
			cmd.addParameter("@P_ITEM_ID", pItemId);
			cmd.addParameter("@P_ITEM_LABEL", pItemLabel);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FtextFromLov(NString pValue,NString pLov,NString pNullText) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_ITEM.TEXT_FROM_LOV", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_LOV", pLov);
			cmd.addParameter("@P_NULL_TEXT", pNullText);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FtextFromLovQuery(NString pValue,NString pQuery,NString pNullText) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_ITEM.TEXT_FROM_LOV_QUERY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_QUERY", pQuery);
			cmd.addParameter("@P_NULL_TEXT", pNullText);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString Ftextarea(NNumber pIdx,NString pValue,NNumber pRows,NNumber pCols,NString pAttributes,NString pItemId,NString pItemLabel) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_ITEM.TEXTAREA", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_IDX", pIdx);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_ROWS", pRows);
			cmd.addParameter("@P_COLS", pCols);
			cmd.addParameter("@P_ATTRIBUTES", pAttributes);
			cmd.addParameter("@P_ITEM_ID", pItemId);
			cmd.addParameter("@P_ITEM_LABEL", pItemLabel);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	@DbRecordType(id="LovItemRow", dataSourceName="LOV_ITEM")
	public static class LovItemRow
	{
		@DbRecordField(dataSourceName="DISPLAY_VALUE")
		public NString DisplayValue;
		@DbRecordField(dataSourceName="RETURN_VALUE")
		public NString ReturnValue;
	}

	
	
}
