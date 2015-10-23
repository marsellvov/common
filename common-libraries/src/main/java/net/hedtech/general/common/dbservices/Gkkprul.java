package net.hedtech.general.common.dbservices;

import java.util.*;

import net.hedtech.general.common.dbservices.dbtypes.WorkitemTypeRow;
import net.hedtech.general.common.dbservices.dbtypes.workItemTableType;
import net.hedtech.general.common.dbservices.Nokrecs.PtrbdplTabtypeRow;
import net.hedtech.general.common.dbservices.dbtypes.GvrudfnRow;
import net.hedtech.general.common.dbservices.dbtypes.ParamInfoTypeRow;
import net.hedtech.general.common.dbservices.dbtypes.ParamTableType;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbTableType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Gkkprul {
		public static NString fCodeExists(NString tabNameIn,NString codeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPRUL.F_CODE_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TAB_NAME_IN", tabNameIn);
			cmd.addParameter("@CODE_IN", codeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fDateRange(NDate dateVarIn,NDate startDateIn,NDate endDateIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPRUL.F_DATE_RANGE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@DATE_VAR_IN", dateVarIn);
			cmd.addParameter("@START_DATE_IN", startDateIn);
			cmd.addParameter("@END_DATE_IN", endDateIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetActionDefaultValue(NString sqprCodeIn,NString prstCodeIn,NString svbaCodeIn,NString sqpaCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPRUL.F_GET_ACTION_DEFAULT_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@SQPR_CODE_IN", sqprCodeIn);
			cmd.addParameter("@PRST_CODE_IN", prstCodeIn);
			cmd.addParameter("@SVBA_CODE_IN", svbaCodeIn);
			cmd.addParameter("@SQPA_CODE_IN", sqpaCodeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetColumnType(NString columnIn,NString tableIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPRUL.F_GET_COLUMN_TYPE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@COLUMN_IN", columnIn);
			cmd.addParameter("@TABLE_IN", tableIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetName(NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPRUL.F_GET_NAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fGetNextRunSeqno() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPRUL.F_GET_NEXT_RUN_SEQNO", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fGetRuleActiveSequences(NString sqprCodeIn,NString sqruCodeIn,NDate effDateIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPRUL.F_GET_RULE_ACTIVE_SEQUENCES", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@SQPR_CODE_IN", sqprCodeIn);
			cmd.addParameter("@SQRU_CODE_IN", sqruCodeIn);
			cmd.addParameter("@EFF_DATE_IN", effDateIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fGetRuleDefaultValue(NString sqprCodeIn,NString prstCodeIn,NString sqruCodeIn,NString sqpaCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPRUL.F_GET_RULE_DEFAULT_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@SQPR_CODE_IN", sqprCodeIn);
			cmd.addParameter("@PRST_CODE_IN", prstCodeIn);
			cmd.addParameter("@SQRU_CODE_IN", sqruCodeIn);
			cmd.addParameter("@SQPA_CODE_IN", sqpaCodeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fGetRuleMaxSelectPos(NString sqprCodeIn,NString sqruCodeIn,NDate effDateIn,NString sqlStatementIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPRUL.F_GET_RULE_MAX_SELECT_POS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@SQPR_CODE_IN", sqprCodeIn);
			cmd.addParameter("@SQRU_CODE_IN", sqruCodeIn);
			cmd.addParameter("@EFF_DATE_IN", effDateIn);
			cmd.addParameter("@SQL_STATEMENT_IN", sqlStatementIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fGetRuleTotalSequences(NString sqprCodeIn,NString sqruCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPRUL.F_GET_RULE_TOTAL_SEQUENCES", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@SQPR_CODE_IN", sqprCodeIn);
			cmd.addParameter("@SQRU_CODE_IN", sqruCodeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fGetTableName(NString columnNameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPRUL.F_GET_TABLE_NAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@COLUMN_NAME_IN", columnNameIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetValidationDesc(NString tabNameIn,NString codeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPRUL.F_GET_VALIDATION_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TAB_NAME_IN", tabNameIn);
			cmd.addParameter("@CODE_IN", codeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetWorktableAndClause(Table<WorkitemTypeRow> workitemTableIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPRUL.F_GET_WORKTABLE_AND_CLAUSE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.getTableType("WORKITEM_TABLE_IN","GKKPRUL.workitem_table_type", workitemTableIn, WorkitemTypeRow.class , false));
			// cmd.addParameter(DbTypes.getTableType("WORKITEM_TABLE_IN", "", workitemTableIn, object.class));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetWorktableOrderClause(Table<WorkitemTypeRow> workitemTableIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPRUL.F_GET_WORKTABLE_ORDER_CLAUSE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.getTableType("WORKITEM_TABLE_IN","GKKPRUL.workitem_table_type", workitemTableIn, WorkitemTypeRow.class , true));
			// cmd.addParameter(DbTypes.getTableType("WORKITEM_TABLE_IN", "", workitemTableIn, object.class));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsValidLaunchDate(NString sqprCodeIn,NString prstCodeIn,NString svbaCodeIn,NDate launchDateIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPRUL.F_IS_VALID_LAUNCH_DATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@SQPR_CODE_IN", sqprCodeIn);
			cmd.addParameter("@PRST_CODE_IN", prstCodeIn);
			cmd.addParameter("@SVBA_CODE_IN", svbaCodeIn);
			cmd.addParameter("@LAUNCH_DATE_IN", launchDateIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fRuleSetAndProcessExists(NString sqprCodeIn,NString prstCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPRUL.F_RULE_SET_AND_PROCESS_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@SQPR_CODE_IN", sqprCodeIn);
			cmd.addParameter("@PRST_CODE_IN", prstCodeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fWorkitemsExist(NNumber seqnoIn,NString sqruCodeIn,NString sqprCodeIn,NString svbaCodeIn,NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPRUL.F_WORKITEMS_EXIST", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@SEQNO_IN", seqnoIn);
			cmd.addParameter("@SQRU_CODE_IN", sqruCodeIn);
			cmd.addParameter("@SQPR_CODE_IN", sqprCodeIn);
			cmd.addParameter("@SVBA_CODE_IN", svbaCodeIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pCopyParameters(NString sqprCodeSourceIn,NString prstCodeSourceIn,NString sqprCodeTargetIn,NString prstCodeTargetIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPRUL.P_COPY_PARAMETERS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQPR_CODE_SOURCE_IN", sqprCodeSourceIn);
			cmd.addParameter("@PRST_CODE_SOURCE_IN", prstCodeSourceIn);
			cmd.addParameter("@SQPR_CODE_TARGET_IN", sqprCodeTargetIn);
			cmd.addParameter("@PRST_CODE_TARGET_IN", prstCodeTargetIn);
				
			cmd.execute();


		}
		
		public static void pDebugResetSeqno() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPRUL.P_DEBUG_RESET_SEQNO", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pGetActionInfo(NString svbaCodeIn,Ref<ActionInfoTypeRow> actionInfoOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPRUL.P_GET_ACTION_INFO", DbManager.getDataBaseFactory());
			
//
			cmd.addParameter("@SVBA_CODE_IN", svbaCodeIn);
			
//			cmd.addParameter(DbTypes.createStructType("ACTION_INFO_OUT", ActionInfoTypeRow.class));
			cmd.addParameter(DbTypes.createStructType("ACTION_INFO_OUT", null, ActionInfoTypeRow.class, true));
				
			cmd.execute();
			actionInfoOut.val = cmd.getParameterValue("ACTION_INFO_OUT", ActionInfoTypeRow.class);


		}
		
		public static void pGetActionParamInfo(NString sqprCodeIn,NString prstCodeIn,NString svbaCodeIn,NString sqpaCodeIn,Ref<ParamInfoTypeRow> paramInfoOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPRUL.P_GET_ACTION_PARAM_INFO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQPR_CODE_IN", sqprCodeIn);
			cmd.addParameter("@PRST_CODE_IN", prstCodeIn);
			cmd.addParameter("@SVBA_CODE_IN", svbaCodeIn);
			cmd.addParameter("@SQPA_CODE_IN", sqpaCodeIn);
//			cmd.addParameter(DbTypes.createStructType("PARAM_INFO_OUT", ParamInfoTypeRow.class));
			cmd.addParameter(DbTypes.createStructType("PARAM_INFO_OUT", null, ParamInfoTypeRow.class, true));
				
			cmd.execute();
			paramInfoOut.val = cmd.getParameterValue("PARAM_INFO_OUT", ParamInfoTypeRow.class);


		}
		
		public static void pGetAllParams(NString sqprCodeIn,NString prstCodeIn,NString svbaCodeIn,Ref<Table<ParamInfoTypeRow>> paramTableOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPRUL.P_GET_ALL_PARAMS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQPR_CODE_IN", sqprCodeIn);
			cmd.addParameter("@PRST_CODE_IN", prstCodeIn);
			cmd.addParameter("@SVBA_CODE_IN", svbaCodeIn);
			cmd.addParameter(DbTypes.getTableType("PARAM_TABLE_OUT","GKKPRUL.param_table_type", paramTableOut.val, ParamInfoTypeRow.class , true));
				
			cmd.execute();
			paramTableOut.val = cmd.getTableParameterValue("PARAM_TABLE_OUT", ParamInfoTypeRow.class);


		}
		
		public static void pGetAllWorkitems(NString sqprCodeIn,NString sqruCodeIn,NString svbaCodeIn,NNumber runSeqnoIn,Ref<Table<WorkitemTypeRow>> workitemTableOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPRUL.P_GET_ALL_WORKITEMS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQPR_CODE_IN", sqprCodeIn);
			cmd.addParameter("@SQRU_CODE_IN", sqruCodeIn);
			cmd.addParameter("@SVBA_CODE_IN", svbaCodeIn);
			cmd.addParameter("@RUN_SEQNO_IN", runSeqnoIn);
			cmd.addParameter(DbTypes.getTableType("WORKITEM_TABLE_OUT","GKKPRUL.workitem_table_type" , workitemTableOut.val, WorkitemTypeRow.class, true));
				
			cmd.execute();
			 workitemTableOut.val = cmd.getTableParameterValue("WORKITEM_TABLE_OUT", WorkitemTypeRow.class);


		}
		
		public static void pGetParamDateRange(NString sqpaCodeIn,Ref<NString> startDateOut,Ref<NString> endDateOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPRUL.P_GET_PARAM_DATE_RANGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQPA_CODE_IN", sqpaCodeIn);
			cmd.addParameter("@START_DATE_OUT", NString.class);
			cmd.addParameter("@END_DATE_OUT", NString.class);
				
			cmd.execute();
			startDateOut.val = cmd.getParameterValue("@START_DATE_OUT", NString.class);
			endDateOut.val = cmd.getParameterValue("@END_DATE_OUT", NString.class);


		}
		
		public static void pGetRuleParamInfo(NString sqprCodeIn,NString prstCodeIn,NString sqruCodeIn,NString sqpaCodeIn,Ref<ParamInfoTypeRow> paramInfoOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPRUL.P_GET_RULE_PARAM_INFO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQPR_CODE_IN", sqprCodeIn);
			cmd.addParameter("@PRST_CODE_IN", prstCodeIn);
			cmd.addParameter("@SQRU_CODE_IN", sqruCodeIn);
			cmd.addParameter("@SQPA_CODE_IN", sqpaCodeIn);
			cmd.addParameter(DbTypes.createStructType("PARAM_INFO_OUT", null,ParamInfoTypeRow.class, true));
				
			cmd.execute();
			paramInfoOut.val = cmd.getParameterValue("PARAM_INFO_OUT", ParamInfoTypeRow.class);


		}
		
		public static void pInsertParamTable(ParamInfoTypeRow paramIn,Ref<List<ParamTableType>> paramTableInOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPRUL.P_INSERT_PARAM_TABLE", DbManager.getDataBaseFactory());
			
			cmd.addParameter(DbTypes.createStructType("PARAM_IN", paramIn, ParamInfoTypeRow.class ));
			// cmd.addParameter(DbTypes.getTableType("PARAM_TABLE_IN_OUT", "", paramTableInOut.val, object.class , true));
				
			cmd.execute();
			// paramTableInOut.val = cmd.getTableParameterValue("@PARAM_TABLE_IN_OUT", object.class);


		}
		
		public static void pPopulateValueList(NString sqprCodeIn,NString sqruCodeIn,NString svbaCodeIn,NNumber selectPositionIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPRUL.P_POPULATE_VALUE_LIST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQPR_CODE_IN", sqprCodeIn);
			cmd.addParameter("@SQRU_CODE_IN", sqruCodeIn);
			cmd.addParameter("@SVBA_CODE_IN", svbaCodeIn);
			cmd.addParameter("@SELECT_POSITION_IN", selectPositionIn);
				
			cmd.execute();


		}
		
		public static NString Fversion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPRUL.VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	@DbRecordType(id="Gkkprul.ActionInfoTypeRow", dataSourceName="GKKPRUL.ACTION_INFO_TYPE", rowType=false)
	public static class ActionInfoTypeRow
	{
		@DbRecordField(dataSourceName="ACTION_DBPROC_NAME")
		public NString ActionDbprocName;
		@DbRecordField(dataSourceName="ACTION_START_DATE")
		public NDate ActionStartDate;
		@DbRecordField(dataSourceName="ACTION_END_DATE")
		public NDate ActionEndDate;
	}

/*	
	
	@DbRecordType(id="WorkitemTypeRow", dataSourceName="WORKITEM_TYPE")
	public static class WorkitemTypeRow
	{
		@DbRecordField(dataSourceName="WORKITEM_SVAP_CODE")
		public NString WorkitemSvapCode;
		@DbRecordField(dataSourceName="WORKITEM_WIDTH")
		public NNumber WorkitemWidth;
		@DbRecordField(dataSourceName="WORKITEM_UPDATE_STATUS")
		public NString WorkitemUpdateStatus;
		@DbRecordField(dataSourceName="WORKITEM_INCLUDE_NULL_IND")
		public NString WorkitemIncludeNullInd;
		@DbRecordField(dataSourceName="WORKITEM_QUERY_VALUE")
		public NString WorkitemQueryValue;
		@DbRecordField(dataSourceName="WORKITEM_PROMPT_TEXT")
		public NString WorkitemPromptText;
		@DbRecordField(dataSourceName="WORKITEM_ORDER_SEQNO")
		public NNumber WorkitemOrderSeqno;
		@DbRecordField(dataSourceName="WORKITEM_VISIBLE")
		public NString WorkitemVisible;
		@DbRecordField(dataSourceName="WORKITEM_SELECT_POSITION")
		public NNumber WorkitemSelectPosition;
		@DbRecordField(dataSourceName="WORKITEM_HINT_TEXT")
		public NString WorkitemHintText;
		@DbRecordField(dataSourceName="WORKITEM_LOVABLE")
		public NString WorkitemLovable;
		@DbRecordField(dataSourceName="WORKITEM_ENTY_CODE")
		public NString WorkitemEntyCode;
		@DbRecordField(dataSourceName="WORKITEM_ATTRIBUTE")
		public NString WorkitemAttribute;
	}
	
	*/

	

	}

