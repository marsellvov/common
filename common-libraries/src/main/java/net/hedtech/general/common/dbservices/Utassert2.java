package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Utassert2 {
		public static void eq(NNumber outcomeIn,NString msgIn,NString checkThisIn,NString againstThisIn,NBool nullOkIn,NBool raiseExcIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT2.EQ", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OUTCOME_IN", outcomeIn);
			cmd.addParameter("@MSG_IN", msgIn);
			cmd.addParameter("@CHECK_THIS_IN", checkThisIn);
			cmd.addParameter("@AGAINST_THIS_IN", againstThisIn);
			cmd.addParameter("@NULL_OK_IN", nullOkIn);
			cmd.addParameter("@RAISE_EXC_IN", raiseExcIn);
				
			cmd.execute();


		}
		
		public static void eq(NNumber outcomeIn,NString msgIn,NDate checkThisIn,NDate againstThisIn,NBool nullOkIn,NBool raiseExcIn,NBool truncateIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT2.EQ", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OUTCOME_IN", outcomeIn);
			cmd.addParameter("@MSG_IN", msgIn);
			cmd.addParameter("@CHECK_THIS_IN", checkThisIn);
			cmd.addParameter("@AGAINST_THIS_IN", againstThisIn);
			cmd.addParameter("@NULL_OK_IN", nullOkIn);
			cmd.addParameter("@RAISE_EXC_IN", raiseExcIn);
			cmd.addParameter("@TRUNCATE_IN", truncateIn);
				
			cmd.execute();


		}
		
		public static void eq(NNumber outcomeIn,NString msgIn,NBool checkThisIn,NBool againstThisIn,NBool nullOkIn,NBool raiseExcIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT2.EQ", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OUTCOME_IN", outcomeIn);
			cmd.addParameter("@MSG_IN", msgIn);
			cmd.addParameter("@CHECK_THIS_IN", checkThisIn);
			cmd.addParameter("@AGAINST_THIS_IN", againstThisIn);
			cmd.addParameter("@NULL_OK_IN", nullOkIn);
			cmd.addParameter("@RAISE_EXC_IN", raiseExcIn);
				
			cmd.execute();


		}
		
		public static void eq(NString outcomeIn,NString msgIn,NString checkThisIn,NString againstThisIn,NBool nullOkIn,NBool raiseExcIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT2.EQ", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OUTCOME_IN", outcomeIn);
			cmd.addParameter("@MSG_IN", msgIn);
			cmd.addParameter("@CHECK_THIS_IN", checkThisIn);
			cmd.addParameter("@AGAINST_THIS_IN", againstThisIn);
			cmd.addParameter("@NULL_OK_IN", nullOkIn);
			cmd.addParameter("@RAISE_EXC_IN", raiseExcIn);
				
			cmd.execute();


		}
		
		public static void eq(NString outcomeIn,NString msgIn,NDate checkThisIn,NDate againstThisIn,NBool nullOkIn,NBool raiseExcIn,NBool truncateIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT2.EQ", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OUTCOME_IN", outcomeIn);
			cmd.addParameter("@MSG_IN", msgIn);
			cmd.addParameter("@CHECK_THIS_IN", checkThisIn);
			cmd.addParameter("@AGAINST_THIS_IN", againstThisIn);
			cmd.addParameter("@NULL_OK_IN", nullOkIn);
			cmd.addParameter("@RAISE_EXC_IN", raiseExcIn);
			cmd.addParameter("@TRUNCATE_IN", truncateIn);
				
			cmd.execute();


		}
		
		public static void eq(NString outcomeIn,NString msgIn,NBool checkThisIn,NBool againstThisIn,NBool nullOkIn,NBool raiseExcIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT2.EQ", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OUTCOME_IN", outcomeIn);
			cmd.addParameter("@MSG_IN", msgIn);
			cmd.addParameter("@CHECK_THIS_IN", checkThisIn);
			cmd.addParameter("@AGAINST_THIS_IN", againstThisIn);
			cmd.addParameter("@NULL_OK_IN", nullOkIn);
			cmd.addParameter("@RAISE_EXC_IN", raiseExcIn);
				
			cmd.execute();


		}
		
//		public static void eqRefcQuery(NNumber outcomeIn,NString pMsgNm,NString procName,List<UtplsqlUtil.UtplsqlParamsRow> _params,NInteger cursorPosition,NString qry) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT2.EQ_REFC_QUERY", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@OUTCOME_IN", outcomeIn);
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
		
//		public static void eqRefcTable(NNumber outcomeIn,NString pMsgNm,NString procName,List<UtplsqlUtil.UtplsqlParamsRow> _params,NInteger cursorPosition,NString tableName) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT2.EQ_REFC_TABLE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@OUTCOME_IN", outcomeIn);
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
		
		public static void eqcoll(NNumber outcomeIn,NString msgIn,NString checkThisIn,NString againstThisIn,NString eqfuncIn,NInteger checkStartrowIn,NInteger checkEndrowIn,NInteger againstStartrowIn,NInteger againstEndrowIn,NBool matchRownumIn,NBool nullOkIn,NBool raiseExcIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT2.EQCOLL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OUTCOME_IN", outcomeIn);
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
		
		public static void eqcoll(NString outcomeIn,NString msgIn,NString checkThisIn,NString againstThisIn,NString eqfuncIn,NInteger checkStartrowIn,NInteger checkEndrowIn,NInteger againstStartrowIn,NInteger againstEndrowIn,NBool matchRownumIn,NBool nullOkIn,NBool raiseExcIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT2.EQCOLL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OUTCOME_IN", outcomeIn);
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
		
		public static void eqcollapi(NNumber outcomeIn,NString msgIn,NString checkThisPkgIn,NString againstThisPkgIn,NString eqfuncIn,NString countfuncIn,NString firstrowfuncIn,NString lastrowfuncIn,NString nextrowfuncIn,NString getvalfuncIn,NInteger checkStartrowIn,NInteger checkEndrowIn,NInteger againstStartrowIn,NInteger againstEndrowIn,NBool matchRownumIn,NBool nullOkIn,NBool raiseExcIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT2.EQCOLLAPI", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OUTCOME_IN", outcomeIn);
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
		
		public static void eqcollapi(NString outcomeIn,NString msgIn,NString checkThisPkgIn,NString againstThisPkgIn,NString eqfuncIn,NString countfuncIn,NString firstrowfuncIn,NString lastrowfuncIn,NString nextrowfuncIn,NString getvalfuncIn,NInteger checkStartrowIn,NInteger checkEndrowIn,NInteger againstStartrowIn,NInteger againstEndrowIn,NBool matchRownumIn,NBool nullOkIn,NBool raiseExcIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT2.EQCOLLAPI", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OUTCOME_IN", outcomeIn);
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
		
		public static void eqcursor(NNumber outcomeIn,NString msgIn,NString checkThisIn,NString againstThisIn,NBool raiseExcIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT2.EQCURSOR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OUTCOME_IN", outcomeIn);
			cmd.addParameter("@MSG_IN", msgIn);
			cmd.addParameter("@CHECK_THIS_IN", checkThisIn);
			cmd.addParameter("@AGAINST_THIS_IN", againstThisIn);
			cmd.addParameter("@RAISE_EXC_IN", raiseExcIn);
				
			cmd.execute();


		}
		
		public static void eqcursor(NString outcomeIn,NString msgIn,NString checkThisIn,NString againstThisIn,NBool raiseExcIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT2.EQCURSOR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OUTCOME_IN", outcomeIn);
			cmd.addParameter("@MSG_IN", msgIn);
			cmd.addParameter("@CHECK_THIS_IN", checkThisIn);
			cmd.addParameter("@AGAINST_THIS_IN", againstThisIn);
			cmd.addParameter("@RAISE_EXC_IN", raiseExcIn);
				
			cmd.execute();


		}
		
		public static void eqfile(NNumber outcomeIn,NString msgIn,NString checkThisIn,NString checkThisDirIn,NString againstThisIn,NString againstThisDirIn,NBool raiseExcIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT2.EQFILE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OUTCOME_IN", outcomeIn);
			cmd.addParameter("@MSG_IN", msgIn);
			cmd.addParameter("@CHECK_THIS_IN", checkThisIn);
			cmd.addParameter("@CHECK_THIS_DIR_IN", checkThisDirIn);
			cmd.addParameter("@AGAINST_THIS_IN", againstThisIn);
			cmd.addParameter("@AGAINST_THIS_DIR_IN", againstThisDirIn);
			cmd.addParameter("@RAISE_EXC_IN", raiseExcIn);
				
			cmd.execute();


		}
		
		public static void eqfile(NString outcomeIn,NString msgIn,NString checkThisIn,NString checkThisDirIn,NString againstThisIn,NString againstThisDirIn,NBool raiseExcIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT2.EQFILE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OUTCOME_IN", outcomeIn);
			cmd.addParameter("@MSG_IN", msgIn);
			cmd.addParameter("@CHECK_THIS_IN", checkThisIn);
			cmd.addParameter("@CHECK_THIS_DIR_IN", checkThisDirIn);
			cmd.addParameter("@AGAINST_THIS_IN", againstThisIn);
			cmd.addParameter("@AGAINST_THIS_DIR_IN", againstThisDirIn);
			cmd.addParameter("@RAISE_EXC_IN", raiseExcIn);
				
			cmd.execute();


		}
		
//		public static void eqoutput(NNumber outcomeIn,NString msgIn,List<DbmsOutput.ChararrRow> checkThisIn,List<DbmsOutput.ChararrRow> againstThisIn,NBool ignoreCaseIn,NBool ignoreWhitespaceIn,NBool nullOkIn,NBool raiseExcIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT2.EQOUTPUT", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@OUTCOME_IN", outcomeIn);
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
		
//		public static void eqoutput(NString outcomeIn,NString msgIn,List<DbmsOutput.ChararrRow> checkThisIn,List<DbmsOutput.ChararrRow> againstThisIn,NBool ignoreCaseIn,NBool ignoreWhitespaceIn,NBool nullOkIn,NBool raiseExcIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT2.EQOUTPUT", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@OUTCOME_IN", outcomeIn);
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
		
//		public static void eqoutput(NNumber outcomeIn,NString msgIn,List<DbmsOutput.ChararrRow> checkThisIn,NString againstThisIn,NString lineDelimiterIn,NBool ignoreCaseIn,NBool ignoreWhitespaceIn,NBool nullOkIn,NBool raiseExcIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT2.EQOUTPUT", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@OUTCOME_IN", outcomeIn);
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
		
//		public static void eqoutput(NString outcomeIn,NString msgIn,List<DbmsOutput.ChararrRow> checkThisIn,NString againstThisIn,NString lineDelimiterIn,NBool ignoreCaseIn,NBool ignoreWhitespaceIn,NBool nullOkIn,NBool raiseExcIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT2.EQOUTPUT", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@OUTCOME_IN", outcomeIn);
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
		
		public static void eqpipe(NNumber outcomeIn,NString msgIn,NString checkThisIn,NString againstThisIn,NBool raiseExcIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT2.EQPIPE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OUTCOME_IN", outcomeIn);
			cmd.addParameter("@MSG_IN", msgIn);
			cmd.addParameter("@CHECK_THIS_IN", checkThisIn);
			cmd.addParameter("@AGAINST_THIS_IN", againstThisIn);
			cmd.addParameter("@RAISE_EXC_IN", raiseExcIn);
				
			cmd.execute();


		}
		
		public static void eqpipe(NString outcomeIn,NString msgIn,NString checkThisIn,NString againstThisIn,NBool raiseExcIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT2.EQPIPE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OUTCOME_IN", outcomeIn);
			cmd.addParameter("@MSG_IN", msgIn);
			cmd.addParameter("@CHECK_THIS_IN", checkThisIn);
			cmd.addParameter("@AGAINST_THIS_IN", againstThisIn);
			cmd.addParameter("@RAISE_EXC_IN", raiseExcIn);
				
			cmd.execute();


		}
		
		public static void eqquery(NNumber outcomeIn,NString msgIn,NString checkThisIn,NString againstThisIn,NBool raiseExcIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT2.EQQUERY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OUTCOME_IN", outcomeIn);
			cmd.addParameter("@MSG_IN", msgIn);
			cmd.addParameter("@CHECK_THIS_IN", checkThisIn);
			cmd.addParameter("@AGAINST_THIS_IN", againstThisIn);
			cmd.addParameter("@RAISE_EXC_IN", raiseExcIn);
				
			cmd.execute();


		}
		
		public static void eqquery(NString outcomeIn,NString msgIn,NString checkThisIn,NString againstThisIn,NBool raiseExcIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT2.EQQUERY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OUTCOME_IN", outcomeIn);
			cmd.addParameter("@MSG_IN", msgIn);
			cmd.addParameter("@CHECK_THIS_IN", checkThisIn);
			cmd.addParameter("@AGAINST_THIS_IN", againstThisIn);
			cmd.addParameter("@RAISE_EXC_IN", raiseExcIn);
				
			cmd.execute();


		}
		
		public static void eqqueryvalue(NNumber outcomeIn,NString msgIn,NString checkQueryIn,NString againstValueIn,NBool nullOkIn,NBool raiseExcIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT2.EQQUERYVALUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OUTCOME_IN", outcomeIn);
			cmd.addParameter("@MSG_IN", msgIn);
			cmd.addParameter("@CHECK_QUERY_IN", checkQueryIn);
			cmd.addParameter("@AGAINST_VALUE_IN", againstValueIn);
			cmd.addParameter("@NULL_OK_IN", nullOkIn);
			cmd.addParameter("@RAISE_EXC_IN", raiseExcIn);
				
			cmd.execute();


		}
		
		public static void eqqueryvalue(NNumber outcomeIn,NString msgIn,NString checkQueryIn,NDate againstValueIn,NBool nullOkIn,NBool raiseExcIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT2.EQQUERYVALUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OUTCOME_IN", outcomeIn);
			cmd.addParameter("@MSG_IN", msgIn);
			cmd.addParameter("@CHECK_QUERY_IN", checkQueryIn);
			cmd.addParameter("@AGAINST_VALUE_IN", againstValueIn);
			cmd.addParameter("@NULL_OK_IN", nullOkIn);
			cmd.addParameter("@RAISE_EXC_IN", raiseExcIn);
				
			cmd.execute();


		}
		
		public static void eqqueryvalue(NNumber outcomeIn,NString msgIn,NString checkQueryIn,NNumber againstValueIn,NBool nullOkIn,NBool raiseExcIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT2.EQQUERYVALUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OUTCOME_IN", outcomeIn);
			cmd.addParameter("@MSG_IN", msgIn);
			cmd.addParameter("@CHECK_QUERY_IN", checkQueryIn);
			cmd.addParameter("@AGAINST_VALUE_IN", againstValueIn);
			cmd.addParameter("@NULL_OK_IN", nullOkIn);
			cmd.addParameter("@RAISE_EXC_IN", raiseExcIn);
				
			cmd.execute();


		}
		
		public static void eqqueryvalue(NString outcomeIn,NString msgIn,NString checkQueryIn,NString againstValueIn,NBool raiseExcIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT2.EQQUERYVALUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OUTCOME_IN", outcomeIn);
			cmd.addParameter("@MSG_IN", msgIn);
			cmd.addParameter("@CHECK_QUERY_IN", checkQueryIn);
			cmd.addParameter("@AGAINST_VALUE_IN", againstValueIn);
			cmd.addParameter("@RAISE_EXC_IN", raiseExcIn);
				
			cmd.execute();


		}
		
		public static void eqqueryvalue(NString outcomeIn,NString msgIn,NString checkQueryIn,NDate againstValueIn,NBool raiseExcIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT2.EQQUERYVALUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OUTCOME_IN", outcomeIn);
			cmd.addParameter("@MSG_IN", msgIn);
			cmd.addParameter("@CHECK_QUERY_IN", checkQueryIn);
			cmd.addParameter("@AGAINST_VALUE_IN", againstValueIn);
			cmd.addParameter("@RAISE_EXC_IN", raiseExcIn);
				
			cmd.execute();


		}
		
		public static void eqqueryvalue(NString outcomeIn,NString msgIn,NString checkQueryIn,NNumber againstValueIn,NBool raiseExcIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT2.EQQUERYVALUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OUTCOME_IN", outcomeIn);
			cmd.addParameter("@MSG_IN", msgIn);
			cmd.addParameter("@CHECK_QUERY_IN", checkQueryIn);
			cmd.addParameter("@AGAINST_VALUE_IN", againstValueIn);
			cmd.addParameter("@RAISE_EXC_IN", raiseExcIn);
				
			cmd.execute();


		}
		
		public static void eqtabcount(NNumber outcomeIn,NString msgIn,NString checkThisIn,NString againstThisIn,NString checkWhereIn,NString againstWhereIn,NBool raiseExcIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT2.EQTABCOUNT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OUTCOME_IN", outcomeIn);
			cmd.addParameter("@MSG_IN", msgIn);
			cmd.addParameter("@CHECK_THIS_IN", checkThisIn);
			cmd.addParameter("@AGAINST_THIS_IN", againstThisIn);
			cmd.addParameter("@CHECK_WHERE_IN", checkWhereIn);
			cmd.addParameter("@AGAINST_WHERE_IN", againstWhereIn);
			cmd.addParameter("@RAISE_EXC_IN", raiseExcIn);
				
			cmd.execute();


		}
		
		public static void eqtabcount(NString outcomeIn,NString msgIn,NString checkThisIn,NString againstThisIn,NString checkWhereIn,NString againstWhereIn,NBool raiseExcIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT2.EQTABCOUNT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OUTCOME_IN", outcomeIn);
			cmd.addParameter("@MSG_IN", msgIn);
			cmd.addParameter("@CHECK_THIS_IN", checkThisIn);
			cmd.addParameter("@AGAINST_THIS_IN", againstThisIn);
			cmd.addParameter("@CHECK_WHERE_IN", checkWhereIn);
			cmd.addParameter("@AGAINST_WHERE_IN", againstWhereIn);
			cmd.addParameter("@RAISE_EXC_IN", raiseExcIn);
				
			cmd.execute();


		}
		
		public static void eqtable(NNumber outcomeIn,NString msgIn,NString checkThisIn,NString againstThisIn,NString checkWhereIn,NString againstWhereIn,NBool raiseExcIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT2.EQTABLE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OUTCOME_IN", outcomeIn);
			cmd.addParameter("@MSG_IN", msgIn);
			cmd.addParameter("@CHECK_THIS_IN", checkThisIn);
			cmd.addParameter("@AGAINST_THIS_IN", againstThisIn);
			cmd.addParameter("@CHECK_WHERE_IN", checkWhereIn);
			cmd.addParameter("@AGAINST_WHERE_IN", againstWhereIn);
			cmd.addParameter("@RAISE_EXC_IN", raiseExcIn);
				
			cmd.execute();


		}
		
		public static void eqtable(NString outcomeIn,NString msgIn,NString checkThisIn,NString againstThisIn,NString checkWhereIn,NString againstWhereIn,NBool raiseExcIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT2.EQTABLE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OUTCOME_IN", outcomeIn);
			cmd.addParameter("@MSG_IN", msgIn);
			cmd.addParameter("@CHECK_THIS_IN", checkThisIn);
			cmd.addParameter("@AGAINST_THIS_IN", againstThisIn);
			cmd.addParameter("@CHECK_WHERE_IN", checkWhereIn);
			cmd.addParameter("@AGAINST_WHERE_IN", againstWhereIn);
			cmd.addParameter("@RAISE_EXC_IN", raiseExcIn);
				
			cmd.execute();


		}
		
//		public static void eval(NNumber outcomeIn,NString msgIn,NString usingIn,List<ValueNameTtRow> valueNameIn,NBool nullOkIn,NBool raiseExcIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT2.EVAL", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@OUTCOME_IN", outcomeIn);
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
		
//		public static void eval(NString outcomeIn,NString msgIn,NString usingIn,List<ValueNameTtRow> valueNameIn,NBool nullOkIn,NBool raiseExcIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT2.EVAL", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@OUTCOME_IN", outcomeIn);
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
		
		public static void fileexists(NNumber outcomeIn,NString msgIn,NString dirIn,NString fileIn,NBool nullOkIn,NBool raiseExcIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT2.FILEEXISTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OUTCOME_IN", outcomeIn);
			cmd.addParameter("@MSG_IN", msgIn);
			cmd.addParameter("@DIR_IN", dirIn);
			cmd.addParameter("@FILE_IN", fileIn);
			cmd.addParameter("@NULL_OK_IN", nullOkIn);
			cmd.addParameter("@RAISE_EXC_IN", raiseExcIn);
				
			cmd.execute();


		}
		
		public static NNumber Fid(NString nameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT2.ID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@NAME_IN", nameIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void isnotnull(NNumber outcomeIn,NString msgIn,NString checkThisIn,NBool raiseExcIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT2.ISNOTNULL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OUTCOME_IN", outcomeIn);
			cmd.addParameter("@MSG_IN", msgIn);
			cmd.addParameter("@CHECK_THIS_IN", checkThisIn);
			cmd.addParameter("@RAISE_EXC_IN", raiseExcIn);
				
			cmd.execute();


		}
		
		public static void isnotnull(NNumber outcomeIn,NString msgIn,NBool checkThisIn,NBool raiseExcIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT2.ISNOTNULL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OUTCOME_IN", outcomeIn);
			cmd.addParameter("@MSG_IN", msgIn);
			cmd.addParameter("@CHECK_THIS_IN", checkThisIn);
			cmd.addParameter("@RAISE_EXC_IN", raiseExcIn);
				
			cmd.execute();


		}
		
		public static void isnotnull(NString outcomeIn,NString msgIn,NString checkThisIn,NBool raiseExcIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT2.ISNOTNULL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OUTCOME_IN", outcomeIn);
			cmd.addParameter("@MSG_IN", msgIn);
			cmd.addParameter("@CHECK_THIS_IN", checkThisIn);
			cmd.addParameter("@RAISE_EXC_IN", raiseExcIn);
				
			cmd.execute();


		}
		
		public static void isnotnull(NString outcomeIn,NString msgIn,NBool checkThisIn,NBool raiseExcIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT2.ISNOTNULL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OUTCOME_IN", outcomeIn);
			cmd.addParameter("@MSG_IN", msgIn);
			cmd.addParameter("@CHECK_THIS_IN", checkThisIn);
			cmd.addParameter("@RAISE_EXC_IN", raiseExcIn);
				
			cmd.execute();


		}
		
		public static void isnull(NNumber outcomeIn,NString msgIn,NString checkThisIn,NBool raiseExcIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT2.ISNULL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OUTCOME_IN", outcomeIn);
			cmd.addParameter("@MSG_IN", msgIn);
			cmd.addParameter("@CHECK_THIS_IN", checkThisIn);
			cmd.addParameter("@RAISE_EXC_IN", raiseExcIn);
				
			cmd.execute();


		}
		
		public static void isnull(NNumber outcomeIn,NString msgIn,NBool checkThisIn,NBool raiseExcIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT2.ISNULL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OUTCOME_IN", outcomeIn);
			cmd.addParameter("@MSG_IN", msgIn);
			cmd.addParameter("@CHECK_THIS_IN", checkThisIn);
			cmd.addParameter("@RAISE_EXC_IN", raiseExcIn);
				
			cmd.execute();


		}
		
		public static void isnull(NString outcomeIn,NString msgIn,NString checkThisIn,NBool raiseExcIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT2.ISNULL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OUTCOME_IN", outcomeIn);
			cmd.addParameter("@MSG_IN", msgIn);
			cmd.addParameter("@CHECK_THIS_IN", checkThisIn);
			cmd.addParameter("@RAISE_EXC_IN", raiseExcIn);
				
			cmd.execute();


		}
		
		public static void isnull(NString outcomeIn,NString msgIn,NBool checkThisIn,NBool raiseExcIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT2.ISNULL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OUTCOME_IN", outcomeIn);
			cmd.addParameter("@MSG_IN", msgIn);
			cmd.addParameter("@CHECK_THIS_IN", checkThisIn);
			cmd.addParameter("@RAISE_EXC_IN", raiseExcIn);
				
			cmd.execute();


		}
		
		public static NString F_name(NNumber idIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT2.NAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@ID_IN", idIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void noshowresults() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT2.NOSHOWRESULTS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void objexists(NNumber outcomeIn,NString msgIn,NString checkThisIn,NBool nullOkIn,NBool raiseExcIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT2.OBJEXISTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OUTCOME_IN", outcomeIn);
			cmd.addParameter("@MSG_IN", msgIn);
			cmd.addParameter("@CHECK_THIS_IN", checkThisIn);
			cmd.addParameter("@NULL_OK_IN", nullOkIn);
			cmd.addParameter("@RAISE_EXC_IN", raiseExcIn);
				
			cmd.execute();


		}
		
		public static void objnotexists(NNumber outcomeIn,NString msgIn,NString checkThisIn,NBool nullOkIn,NBool raiseExcIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT2.OBJNOTEXISTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OUTCOME_IN", outcomeIn);
			cmd.addParameter("@MSG_IN", msgIn);
			cmd.addParameter("@CHECK_THIS_IN", checkThisIn);
			cmd.addParameter("@NULL_OK_IN", nullOkIn);
			cmd.addParameter("@RAISE_EXC_IN", raiseExcIn);
				
			cmd.execute();


		}
		
		public static NBool FpreviousFailed() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT2.PREVIOUS_FAILED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool FpreviousPassed() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT2.PREVIOUS_PASSED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void raises(NNumber outcomeIn,NString msgIn,NString checkCallIn,NString againstExcIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT2.RAISES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OUTCOME_IN", outcomeIn);
			cmd.addParameter("@MSG_IN", msgIn);
			cmd.addParameter("@CHECK_CALL_IN", checkCallIn);
			cmd.addParameter("@AGAINST_EXC_IN", againstExcIn);
				
			cmd.execute();


		}
		
		public static void raises(NNumber outcomeIn,NString msgIn,NString checkCallIn,NNumber againstExcIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT2.RAISES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OUTCOME_IN", outcomeIn);
			cmd.addParameter("@MSG_IN", msgIn);
			cmd.addParameter("@CHECK_CALL_IN", checkCallIn);
			cmd.addParameter("@AGAINST_EXC_IN", againstExcIn);
				
			cmd.execute();


		}
		
		public static void raises(NString outcomeIn,NString msgIn,NString checkCallIn,NString againstExcIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT2.RAISES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OUTCOME_IN", outcomeIn);
			cmd.addParameter("@MSG_IN", msgIn);
			cmd.addParameter("@CHECK_CALL_IN", checkCallIn);
			cmd.addParameter("@AGAINST_EXC_IN", againstExcIn);
				
			cmd.execute();


		}
		
		public static void raises(NString outcomeIn,NString msgIn,NString checkCallIn,NNumber againstExcIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT2.RAISES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OUTCOME_IN", outcomeIn);
			cmd.addParameter("@MSG_IN", msgIn);
			cmd.addParameter("@CHECK_CALL_IN", checkCallIn);
			cmd.addParameter("@AGAINST_EXC_IN", againstExcIn);
				
			cmd.execute();


		}
		
		public static NBool FshowingResults() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT2.SHOWING_RESULTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void showresults() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT2.SHOWRESULTS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void _this(NNumber outcomeIn,NString msgIn,NBool checkThisIn,NBool nullOkIn,NBool raiseExcIn,NBool registerIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT2.THIS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OUTCOME_IN", outcomeIn);
			cmd.addParameter("@MSG_IN", msgIn);
			cmd.addParameter("@CHECK_THIS_IN", checkThisIn);
			cmd.addParameter("@NULL_OK_IN", nullOkIn);
			cmd.addParameter("@RAISE_EXC_IN", raiseExcIn);
			cmd.addParameter("@REGISTER_IN", registerIn);
				
			cmd.execute();


		}
		
		public static void _this(NString outcomeIn,NString msgIn,NBool checkThisIn,NBool nullOkIn,NBool raiseExcIn,NBool registerIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT2.THIS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OUTCOME_IN", outcomeIn);
			cmd.addParameter("@MSG_IN", msgIn);
			cmd.addParameter("@CHECK_THIS_IN", checkThisIn);
			cmd.addParameter("@NULL_OK_IN", nullOkIn);
			cmd.addParameter("@RAISE_EXC_IN", raiseExcIn);
			cmd.addParameter("@REGISTER_IN", registerIn);
				
			cmd.execute();


		}
		
		public static void pthrows(NNumber outcomeIn,NString msgIn,NString checkCallIn,NString againstExcIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT2.THROWS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OUTCOME_IN", outcomeIn);
			cmd.addParameter("@MSG_IN", msgIn);
			cmd.addParameter("@CHECK_CALL_IN", checkCallIn);
			cmd.addParameter("@AGAINST_EXC_IN", againstExcIn);
				
			cmd.execute();


		}
		
		public static void pthrows(NNumber outcomeIn,NString msgIn,NString checkCallIn,NNumber againstExcIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT2.THROWS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OUTCOME_IN", outcomeIn);
			cmd.addParameter("@MSG_IN", msgIn);
			cmd.addParameter("@CHECK_CALL_IN", checkCallIn);
			cmd.addParameter("@AGAINST_EXC_IN", againstExcIn);
				
			cmd.execute();


		}
		
		public static void pthrows(NString outcomeIn,NString msgIn,NString checkCallIn,NString againstExcIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT2.THROWS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OUTCOME_IN", outcomeIn);
			cmd.addParameter("@MSG_IN", msgIn);
			cmd.addParameter("@CHECK_CALL_IN", checkCallIn);
			cmd.addParameter("@AGAINST_EXC_IN", againstExcIn);
				
			cmd.execute();


		}
		
		public static void pthrows(NString outcomeIn,NString msgIn,NString checkCallIn,NNumber againstExcIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTASSERT2.THROWS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OUTCOME_IN", outcomeIn);
			cmd.addParameter("@MSG_IN", msgIn);
			cmd.addParameter("@CHECK_CALL_IN", checkCallIn);
			cmd.addParameter("@AGAINST_EXC_IN", againstExcIn);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="ValueNameRtRow", dataSourceName="VALUE_NAME_RT")
	public static class ValueNameRtRow
	{
		@DbRecordField(dataSourceName="VALUE")
		public NString Value;
		@DbRecordField(dataSourceName="NAME")
		public NString _Name;
	}

	
	
}
