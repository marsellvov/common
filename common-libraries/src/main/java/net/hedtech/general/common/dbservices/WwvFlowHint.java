package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class WwvFlowHint {
		public static NString FcheckLovIssues(NNumber pTableId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_HINT.CHECK_LOV_ISSUES", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TABLE_ID", pTableId);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void checkSchemaPrivs() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_HINT.CHECK_SCHEMA_PRIVS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static NString FcheckTable(NString pSchema,NString pTableName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_HINT.CHECK_TABLE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SCHEMA", pSchema);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool FcolumnHintExists(NString pSchema,NString pTableName,NString pColumnName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_HINT.COLUMN_HINT_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_SCHEMA", pSchema);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void createColumnHint(NNumber pColumnId,NNumber pTableId,NString pColumnName,NString pLabel,NString pHelpText,NString pMaskForm,NNumber pDisplaySeqForm,NString pDisplayInForm,NString pDisplayAsForm,NString pDisplayAsTabForm,NNumber pDisplaySeqReport,NString pDisplayInReport,NString pDisplayAsReport,NString pMaskReport,NString pAggregateBy,NString pLovQuery,NString pDefaultValue,NString pRequired,NString pAlignment,NNumber pDisplayWidth,NNumber pMaxWidth,NNumber pHeight,NString pGroupBy,NNumber pOrderBySeq,NString pOrderByAscDesc,NString pSearchable) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_HINT.CREATE_COLUMN_HINT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_COLUMN_ID", pColumnId);
			cmd.addParameter("@P_TABLE_ID", pTableId);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
			cmd.addParameter("@P_LABEL", pLabel);
			cmd.addParameter("@P_HELP_TEXT", pHelpText);
			cmd.addParameter("@P_MASK_FORM", pMaskForm);
			cmd.addParameter("@P_DISPLAY_SEQ_FORM", pDisplaySeqForm);
			cmd.addParameter("@P_DISPLAY_IN_FORM", pDisplayInForm);
			cmd.addParameter("@P_DISPLAY_AS_FORM", pDisplayAsForm);
			cmd.addParameter("@P_DISPLAY_AS_TAB_FORM", pDisplayAsTabForm);
			cmd.addParameter("@P_DISPLAY_SEQ_REPORT", pDisplaySeqReport);
			cmd.addParameter("@P_DISPLAY_IN_REPORT", pDisplayInReport);
			cmd.addParameter("@P_DISPLAY_AS_REPORT", pDisplayAsReport);
			cmd.addParameter("@P_MASK_REPORT", pMaskReport);
			cmd.addParameter("@P_AGGREGATE_BY", pAggregateBy);
			cmd.addParameter("@P_LOV_QUERY", pLovQuery);
			cmd.addParameter("@P_DEFAULT_VALUE", pDefaultValue);
			cmd.addParameter("@P_REQUIRED", pRequired);
			cmd.addParameter("@P_ALIGNMENT", pAlignment);
			cmd.addParameter("@P_DISPLAY_WIDTH", pDisplayWidth);
			cmd.addParameter("@P_MAX_WIDTH", pMaxWidth);
			cmd.addParameter("@P_HEIGHT", pHeight);
			cmd.addParameter("@P_GROUP_BY", pGroupBy);
			cmd.addParameter("@P_ORDER_BY_SEQ", pOrderBySeq);
			cmd.addParameter("@P_ORDER_BY_ASC_DESC", pOrderByAscDesc);
			cmd.addParameter("@P_SEARCHABLE", pSearchable);
				
			cmd.execute();


		}
		
		public static void createColumnHintPriv(NNumber pColumnId,NNumber pTableId,NString pColumnName,NString pLabel,NString pHelpText,NString pMaskForm,NNumber pDisplaySeqForm,NString pDisplayInForm,NString pDisplayAsForm,NString pDisplayAsTabForm,NNumber pDisplaySeqReport,NString pDisplayInReport,NString pDisplayAsReport,NString pMaskReport,NString pAggregateBy,NString pLovQuery,NString pDefaultValue,NString pRequired,NString pAlignment,NNumber pDisplayWidth,NNumber pMaxWidth,NNumber pHeight,NString pGroupBy,NNumber pOrderBySeq,NString pOrderByAscDesc,NString pSearchable) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_HINT.CREATE_COLUMN_HINT_PRIV", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_COLUMN_ID", pColumnId);
			cmd.addParameter("@P_TABLE_ID", pTableId);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
			cmd.addParameter("@P_LABEL", pLabel);
			cmd.addParameter("@P_HELP_TEXT", pHelpText);
			cmd.addParameter("@P_MASK_FORM", pMaskForm);
			cmd.addParameter("@P_DISPLAY_SEQ_FORM", pDisplaySeqForm);
			cmd.addParameter("@P_DISPLAY_IN_FORM", pDisplayInForm);
			cmd.addParameter("@P_DISPLAY_AS_FORM", pDisplayAsForm);
			cmd.addParameter("@P_DISPLAY_AS_TAB_FORM", pDisplayAsTabForm);
			cmd.addParameter("@P_DISPLAY_SEQ_REPORT", pDisplaySeqReport);
			cmd.addParameter("@P_DISPLAY_IN_REPORT", pDisplayInReport);
			cmd.addParameter("@P_DISPLAY_AS_REPORT", pDisplayAsReport);
			cmd.addParameter("@P_MASK_REPORT", pMaskReport);
			cmd.addParameter("@P_AGGREGATE_BY", pAggregateBy);
			cmd.addParameter("@P_LOV_QUERY", pLovQuery);
			cmd.addParameter("@P_DEFAULT_VALUE", pDefaultValue);
			cmd.addParameter("@P_REQUIRED", pRequired);
			cmd.addParameter("@P_ALIGNMENT", pAlignment);
			cmd.addParameter("@P_DISPLAY_WIDTH", pDisplayWidth);
			cmd.addParameter("@P_MAX_WIDTH", pMaxWidth);
			cmd.addParameter("@P_HEIGHT", pHeight);
			cmd.addParameter("@P_GROUP_BY", pGroupBy);
			cmd.addParameter("@P_ORDER_BY_SEQ", pOrderBySeq);
			cmd.addParameter("@P_ORDER_BY_ASC_DESC", pOrderByAscDesc);
			cmd.addParameter("@P_SEARCHABLE", pSearchable);
				
			cmd.execute();


		}
		
		public static void createLovData(NNumber pId,NNumber pColumnId,NNumber pLovDispSequence,NString pLovDispValue,NString pLovReturnValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_HINT.CREATE_LOV_DATA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_COLUMN_ID", pColumnId);
			cmd.addParameter("@P_LOV_DISP_SEQUENCE", pLovDispSequence);
			cmd.addParameter("@P_LOV_DISP_VALUE", pLovDispValue);
			cmd.addParameter("@P_LOV_RETURN_VALUE", pLovReturnValue);
				
			cmd.execute();


		}
		
		public static void createLovDataPriv(NNumber pId,NNumber pColumnId,NNumber pLovDispSequence,NString pLovDispValue,NString pLovReturnValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_HINT.CREATE_LOV_DATA_PRIV", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_COLUMN_ID", pColumnId);
			cmd.addParameter("@P_LOV_DISP_SEQUENCE", pLovDispSequence);
			cmd.addParameter("@P_LOV_DISP_VALUE", pLovDispValue);
			cmd.addParameter("@P_LOV_RETURN_VALUE", pLovReturnValue);
				
			cmd.execute();


		}
		
		public static void createNormalizeHint(NString pSchema,NString pTableName,NString pColumnName,NString pLovQuery) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_HINT.CREATE_NORMALIZE_HINT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SCHEMA", pSchema);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
			cmd.addParameter("@P_LOV_QUERY", pLovQuery);
				
			cmd.execute();


		}
		
		public static void createTableHint(NNumber pTableId,NString pSchema,NString pTableName,NString pFormRegionTitle,NString pReportRegionTitle) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_HINT.CREATE_TABLE_HINT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TABLE_ID", pTableId);
			cmd.addParameter("@P_SCHEMA", pSchema);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_FORM_REGION_TITLE", pFormRegionTitle);
			cmd.addParameter("@P_REPORT_REGION_TITLE", pReportRegionTitle);
				
			cmd.execute();


		}
		
		public static void createTableHintPriv(NNumber pTableId,NString pSchema,NString pTableName,NString pFormRegionTitle,NString pReportRegionTitle) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_HINT.CREATE_TABLE_HINT_PRIV", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TABLE_ID", pTableId);
			cmd.addParameter("@P_SCHEMA", pSchema);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_FORM_REGION_TITLE", pFormRegionTitle);
			cmd.addParameter("@P_REPORT_REGION_TITLE", pReportRegionTitle);
				
			cmd.execute();


		}
		
		public static NString FdisplayConsColumns(NString pOwner,NString pTableName,NString pConstraintName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_HINT.DISPLAY_CONS_COLUMNS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_OWNER", pOwner);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_CONSTRAINT_NAME", pConstraintName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgenLovName(NString pOwner,NString pTableName,NString pColumnName,NNumber pSgid,NNumber pAppNumber,NNumber pPageNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_HINT.GEN_LOV_NAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_OWNER", pOwner);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
			cmd.addParameter("@P_SGID", pSgid);
			cmd.addParameter("@P_APP_NUMBER", pAppNumber);
			cmd.addParameter("@P_PAGE_NUMBER", pPageNumber);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetAggregateBy(NString pSchema,NString pTableName,NString pColumnName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_HINT.GET_AGGREGATE_BY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SCHEMA", pSchema);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetAlignment(NString pSchema,NString pTableName,NString pColumnName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_HINT.GET_ALIGNMENT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SCHEMA", pSchema);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void getColUiDefaults(NString pSchema,NString pTableName,NString pColumnName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_HINT.GET_COL_UI_DEFAULTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SCHEMA", pSchema);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
				
			cmd.execute();


		}
		
		public static NString FgetDefaultValue(NString pSchema,NString pTableName,NString pColumnName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_HINT.GET_DEFAULT_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SCHEMA", pSchema);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetDisplayAsForm(NString pSchema,NString pTableName,NString pColumnName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_HINT.GET_DISPLAY_AS_FORM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SCHEMA", pSchema);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetDisplayAsReport(NString pSchema,NString pTableName,NString pColumnName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_HINT.GET_DISPLAY_AS_REPORT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SCHEMA", pSchema);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetDisplayAsTabForm(NString pSchema,NString pTableName,NString pColumnName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_HINT.GET_DISPLAY_AS_TAB_FORM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SCHEMA", pSchema);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetDisplayInForm(NString pSchema,NString pTableName,NString pColumnName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_HINT.GET_DISPLAY_IN_FORM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SCHEMA", pSchema);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetDisplayInReport(NString pSchema,NString pTableName,NString pColumnName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_HINT.GET_DISPLAY_IN_REPORT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SCHEMA", pSchema);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber FgetDisplaySeqForm(NString pSchema,NString pTableName,NString pColumnName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_HINT.GET_DISPLAY_SEQ_FORM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_SCHEMA", pSchema);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FgetDisplaySeqReport(NString pSchema,NString pTableName,NString pColumnName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_HINT.GET_DISPLAY_SEQ_REPORT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_SCHEMA", pSchema);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FgetDisplayWidth(NString pSchema,NString pTableName,NString pColumnName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_HINT.GET_DISPLAY_WIDTH", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_SCHEMA", pSchema);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString FgetFormMask(NString pSchema,NString pTableName,NString pColumnName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_HINT.GET_FORM_MASK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SCHEMA", pSchema);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetFormRegionTitle(NString pSchema,NString pTableName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_HINT.GET_FORM_REGION_TITLE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SCHEMA", pSchema);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetGroupBy(NString pSchema,NString pTableName,NString pColumnName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_HINT.GET_GROUP_BY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SCHEMA", pSchema);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber FgetHeight(NString pSchema,NString pTableName,NString pColumnName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_HINT.GET_HEIGHT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_SCHEMA", pSchema);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString FgetItemHelp(NString pSchema,NString pTableName,NString pColumnName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_HINT.GET_ITEM_HELP", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SCHEMA", pSchema);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetLabel(NString pSchema,NString pTableName,NString pColumnName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_HINT.GET_LABEL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SCHEMA", pSchema);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void getLov(NString pSchema,NString pTableName,NString pColumnName,Ref<NString> pLovType,Ref<NString> pLovQuery,Ref<NNumber> pColumnId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_HINT.GET_LOV", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SCHEMA", pSchema);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
			cmd.addParameter("@P_LOV_TYPE", NString.class);
			cmd.addParameter("@P_LOV_QUERY", NString.class);
			cmd.addParameter("@P_COLUMN_ID", NNumber.class);
				
			cmd.execute();
			pLovType.val = cmd.getParameterValue("@P_LOV_TYPE", NString.class);
			pLovQuery.val = cmd.getParameterValue("@P_LOV_QUERY", NString.class);
			pColumnId.val = cmd.getParameterValue("@P_COLUMN_ID", NNumber.class);


		}
		
		public static NString FgetLovQuery(NString pSchema,NString pTableName,NString pColumnName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_HINT.GET_LOV_QUERY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SCHEMA", pSchema);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber FgetMaxWidth(NString pSchema,NString pTableName,NString pColumnName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_HINT.GET_MAX_WIDTH", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_SCHEMA", pSchema);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FgetOrderByAscDesc(NString pSchema,NString pTableName,NString pColumnName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_HINT.GET_ORDER_BY_ASC_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_SCHEMA", pSchema);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FgetOrderBySeq(NString pSchema,NString pTableName,NString pColumnName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_HINT.GET_ORDER_BY_SEQ", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_SCHEMA", pSchema);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString FgetRegionTitle(NString pSchema,NString pTableName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_HINT.GET_REGION_TITLE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SCHEMA", pSchema);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetReportMask(NString pSchema,NString pTableName,NString pColumnName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_HINT.GET_REPORT_MASK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SCHEMA", pSchema);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetReportRegionTitle(NString pSchema,NString pTableName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_HINT.GET_REPORT_REGION_TITLE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SCHEMA", pSchema);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetRequired(NString pSchema,NString pTableName,NString pColumnName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_HINT.GET_REQUIRED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SCHEMA", pSchema);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetSearchable(NString pSchema,NString pTableName,NString pColumnName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_HINT.GET_SEARCHABLE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SCHEMA", pSchema);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetStaticLovString(NNumber pColumnId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_HINT.GET_STATIC_LOV_STRING", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_COLUMN_ID", pColumnId);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void getTableUiDefaults(NString pSchema,NString pTableName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_HINT.GET_TABLE_UI_DEFAULTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SCHEMA", pSchema);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
				
			cmd.execute();


		}
		
		public static void removeHint(NString pSchema,NString pTableName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_HINT.REMOVE_HINT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SCHEMA", pSchema);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
				
			cmd.execute();


		}
		
		public static void removeHintPriv(NString pSchema,NString pTableName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_HINT.REMOVE_HINT_PRIV", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SCHEMA", pSchema);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
				
			cmd.execute();


		}
		
		public static void removeTableHint(NNumber pTableId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_HINT.REMOVE_TABLE_HINT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TABLE_ID", pTableId);
				
			cmd.execute();


		}
		
		public static void synchHints(NString pSchema,NString pTableName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_HINT.SYNCH_HINTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SCHEMA", pSchema);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
				
			cmd.execute();


		}
		
		public static NBool FtableHintExists(NString pSchema,NString pTableName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_HINT.TABLE_HINT_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_SCHEMA", pSchema);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
	
	
	
}
