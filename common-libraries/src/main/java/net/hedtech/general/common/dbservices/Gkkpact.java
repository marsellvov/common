package net.hedtech.general.common.dbservices;

import java.util.*;

import net.hedtech.general.common.dbservices.dbtypes.GkrpptrRow;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Gkkpact {
		public static NNumber Fblockusersqpr(NString pOwner,NString pProcess) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPACT.BLOCKUSERSQPR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_OWNER", pOwner);
			cmd.addParameter("@P_PROCESS", pProcess);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FbuildAndValidateSql(NString actiCode,NString sqprCode,NString ruletype) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPACT.BUILD_AND_VALIDATE_SQL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@ACTI_CODE", actiCode);
			cmd.addParameter("@SQPR_CODE", sqprCode);
			cmd.addParameter("@RULETYPE", ruletype);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FcheckPrivsOnSynonym(NString pSynonymname,Ref<NString> messageout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPACT.CHECK_PRIVS_ON_SYNONYM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_SYNONYMNAME", pSynonymname);
			cmd.addParameter("@MESSAGEOUT", messageout, true);
				
			cmd.execute();
			messageout.val = cmd.getParameterValue("@MESSAGEOUT", NString.class);

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FcheckTable(NString pTableName,Ref<NString> messageout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPACT.CHECK_TABLE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@MESSAGEOUT", messageout, true);
				
			cmd.execute();
			messageout.val = cmd.getParameterValue("@MESSAGEOUT", NString.class);

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FdeleteActivity(NString pActiCode,NNumber pMode,Ref<NString> messageout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPACT.DELETE_ACTIVITY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_ACTI_CODE", pActiCode);
			cmd.addParameter("@P_MODE", pMode);
			cmd.addParameter("@MESSAGEOUT", messageout, true);
				
			cmd.execute();
			messageout.val = cmd.getParameterValue("@MESSAGEOUT", NString.class);

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString Fdistinctornot(NString actiCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPACT.DISTINCTORNOT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@ACTI_CODE", actiCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FduplicateActivity(NString sourceActiCode,NString targetActiCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPACT.DUPLICATE_ACTIVITY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@SOURCE_ACTI_CODE", sourceActiCode);
			cmd.addParameter("@TARGET_ACTI_CODE", targetActiCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void dynStatement(NString pStatement,Ref<DataCursor> crs) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPACT.DYN_STATEMENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_STATEMENT", pStatement);
			cmd.addParameter("@CRS", DataCursor.class);
				
			cmd.execute();
			crs.val = cmd.getParameterValue("@CRS", DataCursor.class);


		}
		
		public static void dynStatement(NString selectPart,NString tabName,NString whereClause,Ref<DataCursor> crs) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPACT.DYN_STATEMENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SELECT_PART", selectPart);
			cmd.addParameter("@TAB_NAME", tabName);
			cmd.addParameter("@WHERE_CLAUSE", whereClause);
			cmd.addParameter("@CRS", DataCursor.class);
				
			cmd.execute();
			crs.val = cmd.getParameterValue("@CRS", DataCursor.class);


		}
		
		public static void dynTableCount(NString tabName,NString whereClause,Ref<DataCursor> crs) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPACT.DYN_TABLE_COUNT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TAB_NAME", tabName);
			cmd.addParameter("@WHERE_CLAUSE", whereClause);
			cmd.addParameter("@CRS", DataCursor.class);
				
			cmd.execute();
			crs.val = cmd.getParameterValue("@CRS", DataCursor.class);


		}
		
		public static void dynTableExists(NString tabName,Ref<DataCursor> crs) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPACT.DYN_TABLE_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TAB_NAME", tabName);
			cmd.addParameter("@CRS", DataCursor.class);
				
			cmd.execute();
			crs.val = cmd.getParameterValue("@CRS", DataCursor.class);


		}
		
		public static NNumber FenableActivity(NNumber pSeqno,NString actiCode,NString sqprCode,NString taskCode,NString ruletype,Ref<NString> messageout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPACT.ENABLE_ACTIVITY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@ACTI_CODE", actiCode);
			cmd.addParameter("@SQPR_CODE", sqprCode);
			cmd.addParameter("@TASK_CODE", taskCode);
			cmd.addParameter("@RULETYPE", ruletype);
			cmd.addParameter("@MESSAGEOUT", messageout, true);
				
			cmd.execute();
			messageout.val = cmd.getParameterValue("@MESSAGEOUT", NString.class);

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void enableNode(NNumber pSeqno,NString pParent,NString pChild,NString pOwner,NString pSqpr,NNumber pLevel,Ref<NString> messageout,NNumber pMode,NNumber pCurrentstatus,Ref<NNumber> pChange) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPACT.ENABLE_NODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_PARENT", pParent);
			cmd.addParameter("@P_CHILD", pChild);
			cmd.addParameter("@P_OWNER", pOwner);
			cmd.addParameter("@P_SQPR", pSqpr);
			cmd.addParameter("@P_LEVEL", pLevel);
			cmd.addParameter("@MESSAGEOUT", messageout, true);
			cmd.addParameter("@P_MODE", pMode);
			cmd.addParameter("@P_CURRENTSTATUS", pCurrentstatus);
			cmd.addParameter("@P_CHANGE", pChange, true);
				
			cmd.execute();
			messageout.val = cmd.getParameterValue("@MESSAGEOUT", NString.class);
			pChange.val = cmd.getParameterValue("@P_CHANGE", NNumber.class);


		}
		
		public static void enableNode(NNumber pSeqno,NString pParent,NString pChild,NString pOwner,NString pSqpr,NNumber pLevel,Ref<NString> messageout,NNumber pMode,NNumber pCurrentstatus) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPACT.ENABLE_NODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_PARENT", pParent);
			cmd.addParameter("@P_CHILD", pChild);
			cmd.addParameter("@P_OWNER", pOwner);
			cmd.addParameter("@P_SQPR", pSqpr);
			cmd.addParameter("@P_LEVEL", pLevel);
			cmd.addParameter("@MESSAGEOUT", messageout, true);
			cmd.addParameter("@P_MODE", pMode);
			cmd.addParameter("@P_CURRENTSTATUS", pCurrentstatus);
				
			cmd.execute();
			messageout.val = cmd.getParameterValue("@MESSAGEOUT", NString.class);


		}
		
		public static NNumber fExecProcess(NString pProcess,NString pRuleset,NString pParamStr,NString pParamDelim,Ref<NString> pMessageOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPACT.F_EXEC_PROCESS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PROCESS", pProcess);
			cmd.addParameter("@P_RULESET", pRuleset);
			cmd.addParameter("@P_PARAM_STR", pParamStr);
			cmd.addParameter("@P_PARAM_DELIM", pParamDelim);
			cmd.addParameter("@P_MESSAGE_OUT", NString.class);
				
			cmd.execute();
			pMessageOut.val = cmd.getParameterValue("@P_MESSAGE_OUT", NString.class);

			return cmd.getReturnValue(NNumber.class);

		}
		
		
		public static NNumber fExecProcess(NString pProcess,NString pRuleset,TParamsRow pParams,Ref<NString> pMessageOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPACT.F_EXEC_PROCESS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PROCESS", pProcess);
			cmd.addParameter("@P_RULESET", pRuleset);
			cmd.addParameter(DbTypes.createStructType("P_PARAMS", "GKKPACT.t_params", pParams, TParamsRow.class));
			cmd.addParameter("@P_MESSAGE_OUT", NString.class);
				
			cmd.execute();
			pMessageOut.val = cmd.getParameterValue("@P_MESSAGE_OUT", NString.class);

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FgenerateTable(NString pTableName,Ref<NString> messageout,NNumber pMode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPACT.GENERATE_TABLE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@MESSAGEOUT", messageout, true);
			cmd.addParameter("@P_MODE", pMode);
				
			cmd.execute();
			messageout.val = cmd.getParameterValue("@MESSAGEOUT", NString.class);

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static GkrpptrRow gkrpptrRecord(NString gkrpptrStr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPACT.GKRPPTR_RECORD", DbManager.getDataBaseFactory());
			
						
			cmd.addReturnParameter(DbTypes.createStructType(GkrpptrRow.class));
			cmd.addParameter("@GKRPPTR_STR", gkrpptrStr);			
			
			cmd.execute();
			return cmd.getReturnValue(GkrpptrRow.class);


		}
		
		
		
		public static NNumber Fliberateusersqpr(NString pOwner,NString pProcess) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPACT.LIBERATEUSERSQPR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_OWNER", pOwner);
			cmd.addParameter("@P_PROCESS", pProcess);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber Fnodestatus(NNumber pSeqno,NString pParent,NString pChild,NString pOwner,Ref<NNumber> pBuzy) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPACT.NODESTATUS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_PARENT", pParent);
			cmd.addParameter("@P_CHILD", pChild);
			cmd.addParameter("@P_OWNER", pOwner);
			cmd.addParameter("@P_BUZY", pBuzy, true);
				
			cmd.execute();
			pBuzy.val = cmd.getParameterValue("@P_BUZY", NNumber.class);

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber Fnodestatus(NNumber pSeqno,NString pParent,NString pChild,NString pOwner) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPACT.NODESTATUS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_PARENT", pParent);
			cmd.addParameter("@P_CHILD", pChild);
			cmd.addParameter("@P_OWNER", pOwner);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void normaliseGkrpptrSeqno() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPACT.NORMALISE_GKRPPTR_SEQNO", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static NNumber FpExecRuleset(NString pProcess,NString pRuleset,NString pRulesetparameters,Ref<NString> messageout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPACT.P_EXEC_RULESET", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PROCESS", pProcess);
			cmd.addParameter("@P_RULESET", pRuleset);
			cmd.addParameter("@P_RULESETPARAMETERS", pRulesetparameters);
			cmd.addParameter("@MESSAGEOUT", messageout, true);
				
			cmd.execute();
			messageout.val = cmd.getParameterValue("@MESSAGEOUT", NString.class);

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString FpcBaselineNodeowner() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPACT.PC_BASELINE_NODEOWNER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString Fsource(NString actiCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPACT.SOURCE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@ACTI_CODE", actiCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString Ftarget(NString actiCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPACT.TARGET", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@ACTI_CODE", actiCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString Fthecolumname(NString pActiCode,NNumber pSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPACT.THECOLUMNAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ACTI_CODE", pActiCode);
			cmd.addParameter("@P_SEQNO", pSeqno);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void validateNode(NNumber pSeqno,NString pParent,NString pChild,NString pOwner,NString pSqpr,NNumber pLevel,Ref<NString> messageout,NNumber pMode,NNumber pCurrentstatus) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPACT.VALIDATE_NODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_PARENT", pParent);
			cmd.addParameter("@P_CHILD", pChild);
			cmd.addParameter("@P_OWNER", pOwner);
			cmd.addParameter("@P_SQPR", pSqpr);
			cmd.addParameter("@P_LEVEL", pLevel);
			cmd.addParameter("@MESSAGEOUT", messageout, true);
			cmd.addParameter("@P_MODE", pMode);
			cmd.addParameter("@P_CURRENTSTATUS", pCurrentstatus);
				
			cmd.execute();
			messageout.val = cmd.getParameterValue("@MESSAGEOUT", NString.class);


		}
		
		public static void validateSql(NString sqprCode,NString selectstmt,Ref<NNumber> success,Ref<NString> messageout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPACT.VALIDATE_SQL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQPR_CODE", sqprCode);
			cmd.addParameter("@SELECTSTMT", selectstmt);
			cmd.addParameter("@SUCCESS", success, true);
			cmd.addParameter("@MESSAGEOUT", messageout, true);
				
			cmd.execute();
			success.val = cmd.getParameterValue("@SUCCESS", NNumber.class);
			messageout.val = cmd.getParameterValue("@MESSAGEOUT", NString.class);


		}
		
		public static NString Fversion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPACT.VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}

		
	
	

		public static class TParamsRow extends  VarArray<NString> {
			
		}
}
