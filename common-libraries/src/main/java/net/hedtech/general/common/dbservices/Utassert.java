package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Utassert {
		public static void eq(NString msgIn,NString checkThisIn,NString againstThisIn,NBool nullOkIn,NBool raiseExcIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT.EQ", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MSG_IN", msgIn);
			cmd.addParameter("@CHECK_THIS_IN", checkThisIn);
			cmd.addParameter("@AGAINST_THIS_IN", againstThisIn);
			cmd.addParameter("@NULL_OK_IN", nullOkIn);
			cmd.addParameter("@RAISE_EXC_IN", raiseExcIn);
				
			cmd.execute();


		}
		
		public static void eq(NString msgIn,NDate checkThisIn,NDate againstThisIn,NBool nullOkIn,NBool raiseExcIn,NBool truncateIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT.EQ", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MSG_IN", msgIn);
			cmd.addParameter("@CHECK_THIS_IN", checkThisIn);
			cmd.addParameter("@AGAINST_THIS_IN", againstThisIn);
			cmd.addParameter("@NULL_OK_IN", nullOkIn);
			cmd.addParameter("@RAISE_EXC_IN", raiseExcIn);
			cmd.addParameter("@TRUNCATE_IN", truncateIn);
				
			cmd.execute();


		}
		
		public static void eq(NString msgIn,NBool checkThisIn,NBool againstThisIn,NBool nullOkIn,NBool raiseExcIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT.EQ", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MSG_IN", msgIn);
			cmd.addParameter("@CHECK_THIS_IN", checkThisIn);
			cmd.addParameter("@AGAINST_THIS_IN", againstThisIn);
			cmd.addParameter("@NULL_OK_IN", nullOkIn);
			cmd.addParameter("@RAISE_EXC_IN", raiseExcIn);
				
			cmd.execute();


		}
		
//		public static void eqRefcQuery(NString pMsgNm,NString procName,List<UtplsqlUtil.UtplsqlParamsRow> _params,NInteger cursorPosition,NString qry) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT.EQ_REFC_QUERY", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_MSG_NM", pMsgNm);
//			cmd.addParameter("@PROC_NAME", procName);
//			// cmd.addParameter(DbTypes.getTableType("PARAMS", "", _params, object.class));
//			cmd.addParameter("@CURSOR_POSITION", cursorPosition);
//			cmd.addParameter("@QRY", qry);
//				
//			cmd.execute();
//
//
//		}
		
//		public static void eqRefcTable(NString pMsgNm,NString procName,List<UtplsqlUtil.UtplsqlParamsRow> _params,NInteger cursorPosition,NString tableName) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT.EQ_REFC_TABLE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_MSG_NM", pMsgNm);
//			cmd.addParameter("@PROC_NAME", procName);
//			// cmd.addParameter(DbTypes.getTableType("PARAMS", "", _params, object.class));
//			cmd.addParameter("@CURSOR_POSITION", cursorPosition);
//			cmd.addParameter("@TABLE_NAME", tableName);
//				
//			cmd.execute();
//
//
//		}
		
		public static void eqcoll(NString msgIn,NString checkThisIn,NString againstThisIn,NString eqfuncIn,NInteger checkStartrowIn,NInteger checkEndrowIn,NInteger againstStartrowIn,NInteger againstEndrowIn,NBool matchRownumIn,NBool nullOkIn,NBool raiseExcIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT.EQCOLL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MSG_IN", msgIn);
			cmd.addParameter("@CHECK_THIS_IN", checkThisIn);
			cmd.addParameter("@AGAINST_THIS_IN", againstThisIn);
			cmd.addParameter("@EQFUNC_IN", eqfuncIn);
			cmd.addParameter("@CHECK_STARTROW_IN", checkStartrowIn);
			cmd.addParameter("@CHECK_ENDROW_IN", checkEndrowIn);
			cmd.addParameter("@AGAINST_STARTROW_IN", againstStartrowIn);
			cmd.addParameter("@AGAINST_ENDROW_IN", againstEndrowIn);
			cmd.addParameter("@MATCH_ROWNUM_IN", matchRownumIn);
			cmd.addParameter("@NULL_OK_IN", nullOkIn);
			cmd.addParameter("@RAISE_EXC_IN", raiseExcIn);
				
			cmd.execute();


		}
		
		public static void eqcollapi(NString msgIn,NString checkThisPkgIn,NString againstThisPkgIn,NString eqfuncIn,NString countfuncIn,NString firstrowfuncIn,NString lastrowfuncIn,NString nextrowfuncIn,NString getvalfuncIn,NInteger checkStartrowIn,NInteger checkEndrowIn,NInteger againstStartrowIn,NInteger againstEndrowIn,NBool matchRownumIn,NBool nullOkIn,NBool raiseExcIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT.EQCOLLAPI", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MSG_IN", msgIn);
			cmd.addParameter("@CHECK_THIS_PKG_IN", checkThisPkgIn);
			cmd.addParameter("@AGAINST_THIS_PKG_IN", againstThisPkgIn);
			cmd.addParameter("@EQFUNC_IN", eqfuncIn);
			cmd.addParameter("@COUNTFUNC_IN", countfuncIn);
			cmd.addParameter("@FIRSTROWFUNC_IN", firstrowfuncIn);
			cmd.addParameter("@LASTROWFUNC_IN", lastrowfuncIn);
			cmd.addParameter("@NEXTROWFUNC_IN", nextrowfuncIn);
			cmd.addParameter("@GETVALFUNC_IN", getvalfuncIn);
			cmd.addParameter("@CHECK_STARTROW_IN", checkStartrowIn);
			cmd.addParameter("@CHECK_ENDROW_IN", checkEndrowIn);
			cmd.addParameter("@AGAINST_STARTROW_IN", againstStartrowIn);
			cmd.addParameter("@AGAINST_ENDROW_IN", againstEndrowIn);
			cmd.addParameter("@MATCH_ROWNUM_IN", matchRownumIn);
			cmd.addParameter("@NULL_OK_IN", nullOkIn);
			cmd.addParameter("@RAISE_EXC_IN", raiseExcIn);
				
			cmd.execute();


		}
		
		public static void eqcursor(NString msgIn,NString checkThisIn,NString againstThisIn,NBool raiseExcIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT.EQCURSOR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MSG_IN", msgIn);
			cmd.addParameter("@CHECK_THIS_IN", checkThisIn);
			cmd.addParameter("@AGAINST_THIS_IN", againstThisIn);
			cmd.addParameter("@RAISE_EXC_IN", raiseExcIn);
				
			cmd.execute();


		}
		
		public static void eqfile(NString msgIn,NString checkThisIn,NString checkThisDirIn,NString againstThisIn,NString againstThisDirIn,NBool raiseExcIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT.EQFILE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MSG_IN", msgIn);
			cmd.addParameter("@CHECK_THIS_IN", checkThisIn);
			cmd.addParameter("@CHECK_THIS_DIR_IN", checkThisDirIn);
			cmd.addParameter("@AGAINST_THIS_IN", againstThisIn);
			cmd.addParameter("@AGAINST_THIS_DIR_IN", againstThisDirIn);
			cmd.addParameter("@RAISE_EXC_IN", raiseExcIn);
				
			cmd.execute();


		}
		
//		public static void eqoutput(NString msgIn,List<DbmsOutput.ChararrRow> checkThisIn,List<DbmsOutput.ChararrRow> againstThisIn,NBool ignoreCaseIn,NBool ignoreWhitespaceIn,NBool nullOkIn,NBool raiseExcIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT.EQOUTPUT", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@MSG_IN", msgIn);
//			// cmd.addParameter(DbTypes.getTableType("CHECK_THIS_IN", "", checkThisIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("AGAINST_THIS_IN", "", againstThisIn, object.class));
//			cmd.addParameter("@IGNORE_CASE_IN", ignoreCaseIn);
//			cmd.addParameter("@IGNORE_WHITESPACE_IN", ignoreWhitespaceIn);
//			cmd.addParameter("@NULL_OK_IN", nullOkIn);
//			cmd.addParameter("@RAISE_EXC_IN", raiseExcIn);
//				
//			cmd.execute();
//
//
//		}
		
//		public static void eqoutput(NString msgIn,List<DbmsOutput.ChararrRow> checkThisIn,NString againstThisIn,NString lineDelimiterIn,NBool ignoreCaseIn,NBool ignoreWhitespaceIn,NBool nullOkIn,NBool raiseExcIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT.EQOUTPUT", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@MSG_IN", msgIn);
//			// cmd.addParameter(DbTypes.getTableType("CHECK_THIS_IN", "", checkThisIn, object.class));
//			cmd.addParameter("@AGAINST_THIS_IN", againstThisIn);
//			cmd.addParameter("@LINE_DELIMITER_IN", lineDelimiterIn);
//			cmd.addParameter("@IGNORE_CASE_IN", ignoreCaseIn);
//			cmd.addParameter("@IGNORE_WHITESPACE_IN", ignoreWhitespaceIn);
//			cmd.addParameter("@NULL_OK_IN", nullOkIn);
//			cmd.addParameter("@RAISE_EXC_IN", raiseExcIn);
//				
//			cmd.execute();
//
//
//		}
		
		public static void eqpipe(NString msgIn,NString checkThisIn,NString againstThisIn,NString checkNthIn,NString againstNthIn,NBool raiseExcIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT.EQPIPE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MSG_IN", msgIn);
			cmd.addParameter("@CHECK_THIS_IN", checkThisIn);
			cmd.addParameter("@AGAINST_THIS_IN", againstThisIn);
			cmd.addParameter("@CHECK_NTH_IN", checkNthIn);
			cmd.addParameter("@AGAINST_NTH_IN", againstNthIn);
			cmd.addParameter("@RAISE_EXC_IN", raiseExcIn);
				
			cmd.execute();


		}
		
		public static void eqquery(NString msgIn,NString checkThisIn,NString againstThisIn,NBool raiseExcIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT.EQQUERY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MSG_IN", msgIn);
			cmd.addParameter("@CHECK_THIS_IN", checkThisIn);
			cmd.addParameter("@AGAINST_THIS_IN", againstThisIn);
			cmd.addParameter("@RAISE_EXC_IN", raiseExcIn);
				
			cmd.execute();


		}
		
		public static void eqqueryvalue(NString msgIn,NString checkQueryIn,NString againstValueIn,NBool nullOkIn,NBool raiseExcIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT.EQQUERYVALUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MSG_IN", msgIn);
			cmd.addParameter("@CHECK_QUERY_IN", checkQueryIn);
			cmd.addParameter("@AGAINST_VALUE_IN", againstValueIn);
			cmd.addParameter("@NULL_OK_IN", nullOkIn);
			cmd.addParameter("@RAISE_EXC_IN", raiseExcIn);
				
			cmd.execute();


		}
		
		public static void eqqueryvalue(NString msgIn,NString checkQueryIn,NDate againstValueIn,NBool nullOkIn,NBool raiseExcIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT.EQQUERYVALUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MSG_IN", msgIn);
			cmd.addParameter("@CHECK_QUERY_IN", checkQueryIn);
			cmd.addParameter("@AGAINST_VALUE_IN", againstValueIn);
			cmd.addParameter("@NULL_OK_IN", nullOkIn);
			cmd.addParameter("@RAISE_EXC_IN", raiseExcIn);
				
			cmd.execute();


		}
		
		public static void eqqueryvalue(NString msgIn,NString checkQueryIn,NNumber againstValueIn,NBool nullOkIn,NBool raiseExcIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT.EQQUERYVALUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MSG_IN", msgIn);
			cmd.addParameter("@CHECK_QUERY_IN", checkQueryIn);
			cmd.addParameter("@AGAINST_VALUE_IN", againstValueIn);
			cmd.addParameter("@NULL_OK_IN", nullOkIn);
			cmd.addParameter("@RAISE_EXC_IN", raiseExcIn);
				
			cmd.execute();


		}
		
		public static void eqtabcount(NString msgIn,NString checkThisIn,NString againstThisIn,NString checkWhereIn,NString againstWhereIn,NBool raiseExcIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT.EQTABCOUNT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MSG_IN", msgIn);
			cmd.addParameter("@CHECK_THIS_IN", checkThisIn);
			cmd.addParameter("@AGAINST_THIS_IN", againstThisIn);
			cmd.addParameter("@CHECK_WHERE_IN", checkWhereIn);
			cmd.addParameter("@AGAINST_WHERE_IN", againstWhereIn);
			cmd.addParameter("@RAISE_EXC_IN", raiseExcIn);
				
			cmd.execute();


		}
		
		public static void eqtable(NString msgIn,NString checkThisIn,NString againstThisIn,NString checkWhereIn,NString againstWhereIn,NBool raiseExcIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT.EQTABLE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MSG_IN", msgIn);
			cmd.addParameter("@CHECK_THIS_IN", checkThisIn);
			cmd.addParameter("@AGAINST_THIS_IN", againstThisIn);
			cmd.addParameter("@CHECK_WHERE_IN", checkWhereIn);
			cmd.addParameter("@AGAINST_WHERE_IN", againstWhereIn);
			cmd.addParameter("@RAISE_EXC_IN", raiseExcIn);
				
			cmd.execute();


		}
		
//		public static void eval(NString msgIn,NString usingIn,List<Utassert2.ValueNameTtRow> valueNameIn,NBool nullOkIn,NBool raiseExcIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT.EVAL", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@MSG_IN", msgIn);
//			cmd.addParameter("@USING_IN", usingIn);
//			// cmd.addParameter(DbTypes.getTableType("VALUE_NAME_IN", "", valueNameIn, object.class));
//			cmd.addParameter("@NULL_OK_IN", nullOkIn);
//			cmd.addParameter("@RAISE_EXC_IN", raiseExcIn);
//				
//			cmd.execute();
//
//
//		}
		
		public static void eval(NString msgIn,NString usingIn,NString value1In,NString value2In,NString name1In,NString name2In,NBool nullOkIn,NBool raiseExcIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT.EVAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MSG_IN", msgIn);
			cmd.addParameter("@USING_IN", usingIn);
			cmd.addParameter("@VALUE1_IN", value1In);
			cmd.addParameter("@VALUE2_IN", value2In);
			cmd.addParameter("@NAME1_IN", name1In);
			cmd.addParameter("@NAME2_IN", name2In);
			cmd.addParameter("@NULL_OK_IN", nullOkIn);
			cmd.addParameter("@RAISE_EXC_IN", raiseExcIn);
				
			cmd.execute();


		}
		
		public static void isnotnull(NString msgIn,NString checkThisIn,NBool nullOkIn,NBool raiseExcIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT.ISNOTNULL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MSG_IN", msgIn);
			cmd.addParameter("@CHECK_THIS_IN", checkThisIn);
			cmd.addParameter("@NULL_OK_IN", nullOkIn);
			cmd.addParameter("@RAISE_EXC_IN", raiseExcIn);
				
			cmd.execute();


		}
		
		public static void isnotnull(NString msgIn,NBool checkThisIn,NBool nullOkIn,NBool raiseExcIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT.ISNOTNULL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MSG_IN", msgIn);
			cmd.addParameter("@CHECK_THIS_IN", checkThisIn);
			cmd.addParameter("@NULL_OK_IN", nullOkIn);
			cmd.addParameter("@RAISE_EXC_IN", raiseExcIn);
				
			cmd.execute();


		}
		
		public static void isnull(NString msgIn,NString checkThisIn,NBool nullOkIn,NBool raiseExcIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT.ISNULL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MSG_IN", msgIn);
			cmd.addParameter("@CHECK_THIS_IN", checkThisIn);
			cmd.addParameter("@NULL_OK_IN", nullOkIn);
			cmd.addParameter("@RAISE_EXC_IN", raiseExcIn);
				
			cmd.execute();


		}
		
		public static void isnull(NString msgIn,NBool checkThisIn,NBool nullOkIn,NBool raiseExcIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT.ISNULL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MSG_IN", msgIn);
			cmd.addParameter("@CHECK_THIS_IN", checkThisIn);
			cmd.addParameter("@NULL_OK_IN", nullOkIn);
			cmd.addParameter("@RAISE_EXC_IN", raiseExcIn);
				
			cmd.execute();


		}
		
		public static void noshowresults() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT.NOSHOWRESULTS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void objexists(NString msgIn,NString checkThisIn,NBool nullOkIn,NBool raiseExcIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT.OBJEXISTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MSG_IN", msgIn);
			cmd.addParameter("@CHECK_THIS_IN", checkThisIn);
			cmd.addParameter("@NULL_OK_IN", nullOkIn);
			cmd.addParameter("@RAISE_EXC_IN", raiseExcIn);
				
			cmd.execute();


		}
		
		public static void objnotexists(NString msgIn,NString checkThisIn,NBool nullOkIn,NBool raiseExcIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT.OBJNOTEXISTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MSG_IN", msgIn);
			cmd.addParameter("@CHECK_THIS_IN", checkThisIn);
			cmd.addParameter("@NULL_OK_IN", nullOkIn);
			cmd.addParameter("@RAISE_EXC_IN", raiseExcIn);
				
			cmd.execute();


		}
		
		public static NBool FpreviousFailed() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT.PREVIOUS_FAILED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool FpreviousPassed() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT.PREVIOUS_PASSED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool FshowingResults() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT.SHOWING_RESULTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void showresults() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT.SHOWRESULTS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void _this(NString msgIn,NBool checkThisIn,NBool nullOkIn,NBool raiseExcIn,NBool registerIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT.THIS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MSG_IN", msgIn);
			cmd.addParameter("@CHECK_THIS_IN", checkThisIn);
			cmd.addParameter("@NULL_OK_IN", nullOkIn);
			cmd.addParameter("@RAISE_EXC_IN", raiseExcIn);
			cmd.addParameter("@REGISTER_IN", registerIn);
				
			cmd.execute();


		}
		
		public static void pthrows(NString msgIn,NString checkCallIn,NString againstExcIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT.THROWS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MSG_IN", msgIn);
			cmd.addParameter("@CHECK_CALL_IN", checkCallIn);
			cmd.addParameter("@AGAINST_EXC_IN", againstExcIn);
				
			cmd.execute();


		}
		
		public static void pthrows(NString msgIn,NString checkCallIn,NNumber againstExcIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT.THROWS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MSG_IN", msgIn);
			cmd.addParameter("@CHECK_CALL_IN", checkCallIn);
			cmd.addParameter("@AGAINST_EXC_IN", againstExcIn);
				
			cmd.execute();


		}
		
	
	
	
}
