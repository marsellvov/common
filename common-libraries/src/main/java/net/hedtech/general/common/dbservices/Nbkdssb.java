package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Nbkdssb {
		public static NString fAddSecurity(NString securityType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.F_ADD_SECURITY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@SECURITY_TYPE", securityType);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fBuildCoasSql() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.F_BUILD_COAS_SQL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fBuildFiscyrSql(NString coasVal) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.F_BUILD_FISCYR_SQL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@COAS_VAL", coasVal);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fBuildObphSql(NString coasVal,NString obudVal) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.F_BUILD_OBPH_SQL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@COAS_VAL", coasVal);
			cmd.addParameter("@OBUD_VAL", obudVal);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fBuildObudSql(NString coasVal) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.F_BUILD_OBUD_SQL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@COAS_VAL", coasVal);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fBuildOrgnSql(NString coasVal,NString checkSecurity) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.F_BUILD_ORGN_SQL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@COAS_VAL", coasVal);
			cmd.addParameter("@CHECK_SECURITY", checkSecurity);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fBuildSelStr(NString parmStepName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.F_BUILD_SEL_STR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PARM_STEP_NAME", parmStepName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fBuildSelStr2Val(NString parmStepName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.F_BUILD_SEL_STR_2_VAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PARM_STEP_NAME", parmStepName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fBuildSgrpSql() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.F_BUILD_SGRP_SQL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fBuildWhereStr(NString whichTable) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.F_BUILD_WHERE_STR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@WHICH_TABLE", whichTable);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetStepValue(NString stepName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.F_GET_STEP_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@STEP_NAME", stepName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fSelectBookMappingSql(NString stepBook) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.F_SELECT_BOOK_MAPPING_SQL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@STEP_BOOK", stepBook);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fSelectBookSql(NString stepBook) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.F_SELECT_BOOK_SQL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@STEP_BOOK", stepBook);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pDelGobackGotdpar(NString parmStepName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_DEL_GOBACK_GOTDPAR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_STEP_NAME", parmStepName);
				
			cmd.execute();


		}
		
		public static void pDownloadFinish(Ref<NString> stageInout,Ref<NString> actionOut,Ref<NString> statusOut,Ref<NString> returnOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_DOWNLOAD_FINISH", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@STAGE_INOUT", stageInout, true);
			cmd.addParameter("@ACTION_OUT", NString.class);
			cmd.addParameter("@STATUS_OUT", NString.class);
			cmd.addParameter("@RETURN_OUT", NString.class);
				
			cmd.execute();
			stageInout.val = cmd.getParameterValue("@STAGE_INOUT", NString.class);
			actionOut.val = cmd.getParameterValue("@ACTION_OUT", NString.class);
			statusOut.val = cmd.getParameterValue("@STATUS_OUT", NString.class);
			returnOut.val = cmd.getParameterValue("@RETURN_OUT", NString.class);


		}
		
		public static void pDownloadFrngActualBudget(Ref<NString> selstr,Ref<NString> fromstr,Ref<NString> wherestr,Ref<NString> groupstr,Ref<NString> havestr,Ref<NString> orderstr,Ref<NString> book,Ref<NString> sheet,Ref<NString> sheetname,Ref<NString> headerstr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_DOWNLOAD_FRNG_ACTUAL_BUDGET", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SELSTR", selstr, true);
			cmd.addParameter("@FROMSTR", fromstr, true);
			cmd.addParameter("@WHERESTR", wherestr, true);
			cmd.addParameter("@GROUPSTR", groupstr, true);
			cmd.addParameter("@HAVESTR", havestr, true);
			cmd.addParameter("@ORDERSTR", orderstr, true);
			cmd.addParameter("@BOOK", book, true);
			cmd.addParameter("@SHEET", sheet, true);
			cmd.addParameter("@SHEETNAME", sheetname, true);
			cmd.addParameter("@HEADERSTR", headerstr, true);
				
			cmd.execute();
			selstr.val = cmd.getParameterValue("@SELSTR", NString.class);
			fromstr.val = cmd.getParameterValue("@FROMSTR", NString.class);
			wherestr.val = cmd.getParameterValue("@WHERESTR", NString.class);
			groupstr.val = cmd.getParameterValue("@GROUPSTR", NString.class);
			havestr.val = cmd.getParameterValue("@HAVESTR", NString.class);
			orderstr.val = cmd.getParameterValue("@ORDERSTR", NString.class);
			book.val = cmd.getParameterValue("@BOOK", NString.class);
			sheet.val = cmd.getParameterValue("@SHEET", NString.class);
			sheetname.val = cmd.getParameterValue("@SHEETNAME", NString.class);
			headerstr.val = cmd.getParameterValue("@HEADERSTR", NString.class);


		}
		
		public static void pDownloadJobs(Ref<NString> selstr,Ref<NString> fromstr,Ref<NString> wherestr,Ref<NString> groupstr,Ref<NString> havestr,Ref<NString> orderstr,Ref<NString> book,Ref<NString> sheet,Ref<NString> sheetname,Ref<NString> headerstr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_DOWNLOAD_JOBS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SELSTR", selstr, true);
			cmd.addParameter("@FROMSTR", fromstr, true);
			cmd.addParameter("@WHERESTR", wherestr, true);
			cmd.addParameter("@GROUPSTR", groupstr, true);
			cmd.addParameter("@HAVESTR", havestr, true);
			cmd.addParameter("@ORDERSTR", orderstr, true);
			cmd.addParameter("@BOOK", book, true);
			cmd.addParameter("@SHEET", sheet, true);
			cmd.addParameter("@SHEETNAME", sheetname, true);
			cmd.addParameter("@HEADERSTR", headerstr, true);
				
			cmd.execute();
			selstr.val = cmd.getParameterValue("@SELSTR", NString.class);
			fromstr.val = cmd.getParameterValue("@FROMSTR", NString.class);
			wherestr.val = cmd.getParameterValue("@WHERESTR", NString.class);
			groupstr.val = cmd.getParameterValue("@GROUPSTR", NString.class);
			havestr.val = cmd.getParameterValue("@HAVESTR", NString.class);
			orderstr.val = cmd.getParameterValue("@ORDERSTR", NString.class);
			book.val = cmd.getParameterValue("@BOOK", NString.class);
			sheet.val = cmd.getParameterValue("@SHEET", NString.class);
			sheetname.val = cmd.getParameterValue("@SHEETNAME", NString.class);
			headerstr.val = cmd.getParameterValue("@HEADERSTR", NString.class);


		}
		
		public static void pDownloadJobsPosn(Ref<NString> selstr,Ref<NString> fromstr,Ref<NString> wherestr,Ref<NString> groupstr,Ref<NString> havestr,Ref<NString> orderstr,Ref<NString> book,Ref<NString> sheet,Ref<NString> sheetname,Ref<NString> headerstr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_DOWNLOAD_JOBS_POSN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SELSTR", selstr, true);
			cmd.addParameter("@FROMSTR", fromstr, true);
			cmd.addParameter("@WHERESTR", wherestr, true);
			cmd.addParameter("@GROUPSTR", groupstr, true);
			cmd.addParameter("@HAVESTR", havestr, true);
			cmd.addParameter("@ORDERSTR", orderstr, true);
			cmd.addParameter("@BOOK", book, true);
			cmd.addParameter("@SHEET", sheet, true);
			cmd.addParameter("@SHEETNAME", sheetname, true);
			cmd.addParameter("@HEADERSTR", headerstr, true);
				
			cmd.execute();
			selstr.val = cmd.getParameterValue("@SELSTR", NString.class);
			fromstr.val = cmd.getParameterValue("@FROMSTR", NString.class);
			wherestr.val = cmd.getParameterValue("@WHERESTR", NString.class);
			groupstr.val = cmd.getParameterValue("@GROUPSTR", NString.class);
			havestr.val = cmd.getParameterValue("@HAVESTR", NString.class);
			orderstr.val = cmd.getParameterValue("@ORDERSTR", NString.class);
			book.val = cmd.getParameterValue("@BOOK", NString.class);
			sheet.val = cmd.getParameterValue("@SHEET", NString.class);
			sheetname.val = cmd.getParameterValue("@SHEETNAME", NString.class);
			headerstr.val = cmd.getParameterValue("@HEADERSTR", NString.class);


		}
		
		public static void pDownloadLaborDist(Ref<NString> selstr,Ref<NString> fromstr,Ref<NString> wherestr,Ref<NString> groupstr,Ref<NString> havestr,Ref<NString> orderstr,Ref<NString> book,Ref<NString> sheet,Ref<NString> sheetname,Ref<NString> headerstr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_DOWNLOAD_LABOR_DIST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SELSTR", selstr, true);
			cmd.addParameter("@FROMSTR", fromstr, true);
			cmd.addParameter("@WHERESTR", wherestr, true);
			cmd.addParameter("@GROUPSTR", groupstr, true);
			cmd.addParameter("@HAVESTR", havestr, true);
			cmd.addParameter("@ORDERSTR", orderstr, true);
			cmd.addParameter("@BOOK", book, true);
			cmd.addParameter("@SHEET", sheet, true);
			cmd.addParameter("@SHEETNAME", sheetname, true);
			cmd.addParameter("@HEADERSTR", headerstr, true);
				
			cmd.execute();
			selstr.val = cmd.getParameterValue("@SELSTR", NString.class);
			fromstr.val = cmd.getParameterValue("@FROMSTR", NString.class);
			wherestr.val = cmd.getParameterValue("@WHERESTR", NString.class);
			groupstr.val = cmd.getParameterValue("@GROUPSTR", NString.class);
			havestr.val = cmd.getParameterValue("@HAVESTR", NString.class);
			orderstr.val = cmd.getParameterValue("@ORDERSTR", NString.class);
			book.val = cmd.getParameterValue("@BOOK", NString.class);
			sheet.val = cmd.getParameterValue("@SHEET", NString.class);
			sheetname.val = cmd.getParameterValue("@SHEETNAME", NString.class);
			headerstr.val = cmd.getParameterValue("@HEADERSTR", NString.class);


		}
		
		public static void pDownloadNextStep(Ref<NString> stepname,Ref<NString> nextenabled,Ref<NString> finishenabled) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_DOWNLOAD_NEXT_STEP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@STEPNAME", stepname, true);
			cmd.addParameter("@NEXTENABLED", NString.class);
			cmd.addParameter("@FINISHENABLED", NString.class);
				
			cmd.execute();
			stepname.val = cmd.getParameterValue("@STEPNAME", NString.class);
			nextenabled.val = cmd.getParameterValue("@NEXTENABLED", NString.class);
			finishenabled.val = cmd.getParameterValue("@FINISHENABLED", NString.class);


		}
		
		public static void pDownloadPremiumBudget(Ref<NString> selstr,Ref<NString> fromstr,Ref<NString> wherestr,Ref<NString> groupstr,Ref<NString> havestr,Ref<NString> orderstr,Ref<NString> book,Ref<NString> sheet,Ref<NString> sheetname,Ref<NString> headerstr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_DOWNLOAD_PREMIUM_BUDGET", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SELSTR", selstr, true);
			cmd.addParameter("@FROMSTR", fromstr, true);
			cmd.addParameter("@WHERESTR", wherestr, true);
			cmd.addParameter("@GROUPSTR", groupstr, true);
			cmd.addParameter("@HAVESTR", havestr, true);
			cmd.addParameter("@ORDERSTR", orderstr, true);
			cmd.addParameter("@BOOK", book, true);
			cmd.addParameter("@SHEET", sheet, true);
			cmd.addParameter("@SHEETNAME", sheetname, true);
			cmd.addParameter("@HEADERSTR", headerstr, true);
				
			cmd.execute();
			selstr.val = cmd.getParameterValue("@SELSTR", NString.class);
			fromstr.val = cmd.getParameterValue("@FROMSTR", NString.class);
			wherestr.val = cmd.getParameterValue("@WHERESTR", NString.class);
			groupstr.val = cmd.getParameterValue("@GROUPSTR", NString.class);
			havestr.val = cmd.getParameterValue("@HAVESTR", NString.class);
			orderstr.val = cmd.getParameterValue("@ORDERSTR", NString.class);
			book.val = cmd.getParameterValue("@BOOK", NString.class);
			sheet.val = cmd.getParameterValue("@SHEET", NString.class);
			sheetname.val = cmd.getParameterValue("@SHEETNAME", NString.class);
			headerstr.val = cmd.getParameterValue("@HEADERSTR", NString.class);


		}
		
		public static void pDownloadSalaryBudget(Ref<NString> selstr,Ref<NString> fromstr,Ref<NString> wherestr,Ref<NString> groupstr,Ref<NString> havestr,Ref<NString> orderstr,Ref<NString> book,Ref<NString> sheet,Ref<NString> sheetname,Ref<NString> headerstr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_DOWNLOAD_SALARY_BUDGET", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SELSTR", selstr, true);
			cmd.addParameter("@FROMSTR", fromstr, true);
			cmd.addParameter("@WHERESTR", wherestr, true);
			cmd.addParameter("@GROUPSTR", groupstr, true);
			cmd.addParameter("@HAVESTR", havestr, true);
			cmd.addParameter("@ORDERSTR", orderstr, true);
			cmd.addParameter("@BOOK", book, true);
			cmd.addParameter("@SHEET", sheet, true);
			cmd.addParameter("@SHEETNAME", sheetname, true);
			cmd.addParameter("@HEADERSTR", headerstr, true);
				
			cmd.execute();
			selstr.val = cmd.getParameterValue("@SELSTR", NString.class);
			fromstr.val = cmd.getParameterValue("@FROMSTR", NString.class);
			wherestr.val = cmd.getParameterValue("@WHERESTR", NString.class);
			groupstr.val = cmd.getParameterValue("@GROUPSTR", NString.class);
			havestr.val = cmd.getParameterValue("@HAVESTR", NString.class);
			orderstr.val = cmd.getParameterValue("@ORDERSTR", NString.class);
			book.val = cmd.getParameterValue("@BOOK", NString.class);
			sheet.val = cmd.getParameterValue("@SHEET", NString.class);
			sheetname.val = cmd.getParameterValue("@SHEETNAME", NString.class);
			headerstr.val = cmd.getParameterValue("@HEADERSTR", NString.class);


		}
		
		public static void pGetSystemInstalled() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_GET_SYSTEM_INSTALLED", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pGetUpldRequest() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_GET_UPLD_REQUEST", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pGetValRequest() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_GET_VAL_REQUEST", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pPopulateCoas(Ref<NString> parmSqlstr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_POPULATE_COAS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_SQLSTR", NString.class);
				
			cmd.execute();
			parmSqlstr.val = cmd.getParameterValue("@PARM_SQLSTR", NString.class);


		}
		
		public static void pPopulateEcls(Ref<NString> parmSqlstr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_POPULATE_ECLS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_SQLSTR", NString.class);
				
			cmd.execute();
			parmSqlstr.val = cmd.getParameterValue("@PARM_SQLSTR", NString.class);


		}
		
		public static void pPopulateFiscyr(Ref<NString> parmSqlstr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_POPULATE_FISCYR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_SQLSTR", NString.class);
				
			cmd.execute();
			parmSqlstr.val = cmd.getParameterValue("@PARM_SQLSTR", NString.class);


		}
		
		public static void pPopulateJobsCoas(Ref<NString> parmSqlstr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_POPULATE_JOBS_COAS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_SQLSTR", NString.class);
				
			cmd.execute();
			parmSqlstr.val = cmd.getParameterValue("@PARM_SQLSTR", NString.class);


		}
		
		public static void pPopulateJobsCols(Ref<NString> parmSqlstr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_POPULATE_JOBS_COLS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_SQLSTR", NString.class);
				
			cmd.execute();
			parmSqlstr.val = cmd.getParameterValue("@PARM_SQLSTR", NString.class);


		}
		
		public static void pPopulateObph(Ref<NString> parmSqlstr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_POPULATE_OBPH", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_SQLSTR", NString.class);
				
			cmd.execute();
			parmSqlstr.val = cmd.getParameterValue("@PARM_SQLSTR", NString.class);


		}
		
		public static void pPopulateObud(Ref<NString> parmSqlstr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_POPULATE_OBUD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_SQLSTR", NString.class);
				
			cmd.execute();
			parmSqlstr.val = cmd.getParameterValue("@PARM_SQLSTR", NString.class);


		}
		
		public static void pPopulateOrgn(Ref<NString> parmSqlstr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_POPULATE_ORGN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_SQLSTR", NString.class);
				
			cmd.execute();
			parmSqlstr.val = cmd.getParameterValue("@PARM_SQLSTR", NString.class);


		}
		
		public static void pPopulateUpldCoas(Ref<NString> parmSqlstr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_POPULATE_UPLD_COAS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_SQLSTR", NString.class);
				
			cmd.execute();
			parmSqlstr.val = cmd.getParameterValue("@PARM_SQLSTR", NString.class);


		}
		
		public static void pPopulateUpldFiscyr(Ref<NString> parmSqlstr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_POPULATE_UPLD_FISCYR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_SQLSTR", NString.class);
				
			cmd.execute();
			parmSqlstr.val = cmd.getParameterValue("@PARM_SQLSTR", NString.class);


		}
		
		public static void pPopulateUpldFtotMapping(Ref<NString> sqlOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_POPULATE_UPLD_FTOT_MAPPING", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQL_OUT", NString.class);
				
			cmd.execute();
			sqlOut.val = cmd.getParameterValue("@SQL_OUT", NString.class);


		}
		
		public static void pPopulateUpldObph(Ref<NString> parmSqlstr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_POPULATE_UPLD_OBPH", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_SQLSTR", NString.class);
				
			cmd.execute();
			parmSqlstr.val = cmd.getParameterValue("@PARM_SQLSTR", NString.class);


		}
		
		public static void pPopulateUpldObud(Ref<NString> parmSqlstr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_POPULATE_UPLD_OBUD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_SQLSTR", NString.class);
				
			cmd.execute();
			parmSqlstr.val = cmd.getParameterValue("@PARM_SQLSTR", NString.class);


		}
		
		public static void pPopulateUpldPlbd2Mapping(Ref<NString> sqlOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_POPULATE_UPLD_PLBD_2_MAPPING", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQL_OUT", NString.class);
				
			cmd.execute();
			sqlOut.val = cmd.getParameterValue("@SQL_OUT", NString.class);


		}
		
		public static void pPopulateUpldPlbdMapping(Ref<NString> sqlOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_POPULATE_UPLD_PLBD_MAPPING", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQL_OUT", NString.class);
				
			cmd.execute();
			sqlOut.val = cmd.getParameterValue("@SQL_OUT", NString.class);


		}
		
		public static void pPopulateUpldPtotMapping(Ref<NString> sqlOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_POPULATE_UPLD_PTOT_MAPPING", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQL_OUT", NString.class);
				
			cmd.execute();
			sqlOut.val = cmd.getParameterValue("@SQL_OUT", NString.class);


		}
		
		public static void pPopulateUpldRtotMapping(Ref<NString> sqlOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_POPULATE_UPLD_RTOT_MAPPING", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQL_OUT", NString.class);
				
			cmd.execute();
			sqlOut.val = cmd.getParameterValue("@SQL_OUT", NString.class);


		}
		
		public static void pPopulateUpldSgrp(Ref<NString> parmSqlstr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_POPULATE_UPLD_SGRP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_SQLSTR", NString.class);
				
			cmd.execute();
			parmSqlstr.val = cmd.getParameterValue("@PARM_SQLSTR", NString.class);


		}
		
		public static void pPopulateValCoas(Ref<NString> parmSqlstr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_POPULATE_VAL_COAS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_SQLSTR", NString.class);
				
			cmd.execute();
			parmSqlstr.val = cmd.getParameterValue("@PARM_SQLSTR", NString.class);


		}
		
		public static void pPopulateValFiscyr(Ref<NString> parmSqlstr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_POPULATE_VAL_FISCYR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_SQLSTR", NString.class);
				
			cmd.execute();
			parmSqlstr.val = cmd.getParameterValue("@PARM_SQLSTR", NString.class);


		}
		
		public static void pPopulateValFtotMapping(Ref<NString> sqlOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_POPULATE_VAL_FTOT_MAPPING", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQL_OUT", NString.class);
				
			cmd.execute();
			sqlOut.val = cmd.getParameterValue("@SQL_OUT", NString.class);


		}
		
		public static void pPopulateValObph(Ref<NString> parmSqlstr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_POPULATE_VAL_OBPH", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_SQLSTR", NString.class);
				
			cmd.execute();
			parmSqlstr.val = cmd.getParameterValue("@PARM_SQLSTR", NString.class);


		}
		
		public static void pPopulateValObud(Ref<NString> parmSqlstr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_POPULATE_VAL_OBUD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_SQLSTR", NString.class);
				
			cmd.execute();
			parmSqlstr.val = cmd.getParameterValue("@PARM_SQLSTR", NString.class);


		}
		
		public static void pPopulateValPlbd2Mapping(Ref<NString> sqlOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_POPULATE_VAL_PLBD_2_MAPPING", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQL_OUT", NString.class);
				
			cmd.execute();
			sqlOut.val = cmd.getParameterValue("@SQL_OUT", NString.class);


		}
		
		public static void pPopulateValPlbdMapping(Ref<NString> sqlOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_POPULATE_VAL_PLBD_MAPPING", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQL_OUT", NString.class);
				
			cmd.execute();
			sqlOut.val = cmd.getParameterValue("@SQL_OUT", NString.class);


		}
		
		public static void pPopulateValPtotMapping(Ref<NString> sqlOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_POPULATE_VAL_PTOT_MAPPING", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQL_OUT", NString.class);
				
			cmd.execute();
			sqlOut.val = cmd.getParameterValue("@SQL_OUT", NString.class);


		}
		
		public static void pPopulateValRtotMapping(Ref<NString> sqlOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_POPULATE_VAL_RTOT_MAPPING", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQL_OUT", NString.class);
				
			cmd.execute();
			sqlOut.val = cmd.getParameterValue("@SQL_OUT", NString.class);


		}
		
		public static void pPopulateValSgrp(Ref<NString> parmSqlstr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_POPULATE_VAL_SGRP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_SQLSTR", NString.class);
				
			cmd.execute();
			parmSqlstr.val = cmd.getParameterValue("@PARM_SQLSTR", NString.class);


		}
		
		public static void pSelectCoas(Ref<NString> parmSqlstr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_SELECT_COAS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_SQLSTR", NString.class);
				
			cmd.execute();
			parmSqlstr.val = cmd.getParameterValue("@PARM_SQLSTR", NString.class);


		}
		
		public static void pSelectEcls(Ref<NString> parmSqlstr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_SELECT_ECLS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_SQLSTR", NString.class);
				
			cmd.execute();
			parmSqlstr.val = cmd.getParameterValue("@PARM_SQLSTR", NString.class);


		}
		
		public static void pSelectFiscyr(Ref<NString> parmSqlstr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_SELECT_FISCYR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_SQLSTR", NString.class);
				
			cmd.execute();
			parmSqlstr.val = cmd.getParameterValue("@PARM_SQLSTR", NString.class);


		}
		
		public static void pSelectJobsCoas(Ref<NString> parmSqlstr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_SELECT_JOBS_COAS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_SQLSTR", NString.class);
				
			cmd.execute();
			parmSqlstr.val = cmd.getParameterValue("@PARM_SQLSTR", NString.class);


		}
		
		public static void pSelectJobsCols(Ref<NString> parmSqlstr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_SELECT_JOBS_COLS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_SQLSTR", NString.class);
				
			cmd.execute();
			parmSqlstr.val = cmd.getParameterValue("@PARM_SQLSTR", NString.class);


		}
		
		public static void pSelectJobsDate(Ref<NString> parmSqlstr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_SELECT_JOBS_DATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_SQLSTR", NString.class);
				
			cmd.execute();
			parmSqlstr.val = cmd.getParameterValue("@PARM_SQLSTR", NString.class);


		}
		
		public static void pSelectJobsInd(Ref<NString> parmSqlstr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_SELECT_JOBS_IND", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_SQLSTR", NString.class);
				
			cmd.execute();
			parmSqlstr.val = cmd.getParameterValue("@PARM_SQLSTR", NString.class);


		}
		
		public static void pSelectJobsInfoInd(Ref<NString> parmSqlstr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_SELECT_JOBS_INFO_IND", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_SQLSTR", NString.class);
				
			cmd.execute();
			parmSqlstr.val = cmd.getParameterValue("@PARM_SQLSTR", NString.class);


		}
		
		public static void pSelectObph(Ref<NString> parmSqlstr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_SELECT_OBPH", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_SQLSTR", NString.class);
				
			cmd.execute();
			parmSqlstr.val = cmd.getParameterValue("@PARM_SQLSTR", NString.class);


		}
		
		public static void pSelectObud(Ref<NString> parmSqlstr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_SELECT_OBUD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_SQLSTR", NString.class);
				
			cmd.execute();
			parmSqlstr.val = cmd.getParameterValue("@PARM_SQLSTR", NString.class);


		}
		
		public static void pSelectOrgn(Ref<NString> parmSqlstr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_SELECT_ORGN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_SQLSTR", NString.class);
				
			cmd.execute();
			parmSqlstr.val = cmd.getParameterValue("@PARM_SQLSTR", NString.class);


		}
		
		public static void pSelectSourceInd(Ref<NString> parmSqlstr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_SELECT_SOURCE_IND", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_SQLSTR", NString.class);
				
			cmd.execute();
			parmSqlstr.val = cmd.getParameterValue("@PARM_SQLSTR", NString.class);


		}
		
		public static void pSelectUpldCoas(Ref<NString> parmSqlstr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_SELECT_UPLD_COAS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_SQLSTR", NString.class);
				
			cmd.execute();
			parmSqlstr.val = cmd.getParameterValue("@PARM_SQLSTR", NString.class);


		}
		
		public static void pSelectUpldFiscyr(Ref<NString> parmSqlstr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_SELECT_UPLD_FISCYR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_SQLSTR", NString.class);
				
			cmd.execute();
			parmSqlstr.val = cmd.getParameterValue("@PARM_SQLSTR", NString.class);


		}
		
		public static void pSelectUpldFtotBook(Ref<NString> sqlstr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_SELECT_UPLD_FTOT_BOOK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQLSTR", NString.class);
				
			cmd.execute();
			sqlstr.val = cmd.getParameterValue("@SQLSTR", NString.class);


		}
		
		public static void pSelectUpldFtotMapping(Ref<NString> sqlOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_SELECT_UPLD_FTOT_MAPPING", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQL_OUT", NString.class);
				
			cmd.execute();
			sqlOut.val = cmd.getParameterValue("@SQL_OUT", NString.class);


		}
		
		public static void pSelectUpldObph(Ref<NString> parmSqlstr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_SELECT_UPLD_OBPH", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_SQLSTR", NString.class);
				
			cmd.execute();
			parmSqlstr.val = cmd.getParameterValue("@PARM_SQLSTR", NString.class);


		}
		
		public static void pSelectUpldObud(Ref<NString> parmSqlstr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_SELECT_UPLD_OBUD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_SQLSTR", NString.class);
				
			cmd.execute();
			parmSqlstr.val = cmd.getParameterValue("@PARM_SQLSTR", NString.class);


		}
		
		public static void pSelectUpldPlbd2Mapping(Ref<NString> sqlOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_SELECT_UPLD_PLBD_2_MAPPING", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQL_OUT", NString.class);
				
			cmd.execute();
			sqlOut.val = cmd.getParameterValue("@SQL_OUT", NString.class);


		}
		
		public static void pSelectUpldPlbdBook(Ref<NString> sqlstr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_SELECT_UPLD_PLBD_BOOK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQLSTR", NString.class);
				
			cmd.execute();
			sqlstr.val = cmd.getParameterValue("@SQLSTR", NString.class);


		}
		
		public static void pSelectUpldPlbdMapping(Ref<NString> sqlOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_SELECT_UPLD_PLBD_MAPPING", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQL_OUT", NString.class);
				
			cmd.execute();
			sqlOut.val = cmd.getParameterValue("@SQL_OUT", NString.class);


		}
		
		public static void pSelectUpldPtotBook(Ref<NString> sqlstr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_SELECT_UPLD_PTOT_BOOK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQLSTR", NString.class);
				
			cmd.execute();
			sqlstr.val = cmd.getParameterValue("@SQLSTR", NString.class);


		}
		
		public static void pSelectUpldPtotMapping(Ref<NString> sqlOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_SELECT_UPLD_PTOT_MAPPING", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQL_OUT", NString.class);
				
			cmd.execute();
			sqlOut.val = cmd.getParameterValue("@SQL_OUT", NString.class);


		}
		
		public static void pSelectUpldRtotBook(Ref<NString> sqlstr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_SELECT_UPLD_RTOT_BOOK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQLSTR", NString.class);
				
			cmd.execute();
			sqlstr.val = cmd.getParameterValue("@SQLSTR", NString.class);


		}
		
		public static void pSelectUpldRtotMapping(Ref<NString> sqlOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_SELECT_UPLD_RTOT_MAPPING", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQL_OUT", NString.class);
				
			cmd.execute();
			sqlOut.val = cmd.getParameterValue("@SQL_OUT", NString.class);


		}
		
		public static void pSelectUpldSgrp(Ref<NString> parmSqlstr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_SELECT_UPLD_SGRP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_SQLSTR", NString.class);
				
			cmd.execute();
			parmSqlstr.val = cmd.getParameterValue("@PARM_SQLSTR", NString.class);


		}
		
		public static void pSelectValCoas(Ref<NString> parmSqlstr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_SELECT_VAL_COAS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_SQLSTR", NString.class);
				
			cmd.execute();
			parmSqlstr.val = cmd.getParameterValue("@PARM_SQLSTR", NString.class);


		}
		
		public static void pSelectValFiscyr(Ref<NString> parmSqlstr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_SELECT_VAL_FISCYR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_SQLSTR", NString.class);
				
			cmd.execute();
			parmSqlstr.val = cmd.getParameterValue("@PARM_SQLSTR", NString.class);


		}
		
		public static void pSelectValFtotBook(Ref<NString> sqlstr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_SELECT_VAL_FTOT_BOOK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQLSTR", NString.class);
				
			cmd.execute();
			sqlstr.val = cmd.getParameterValue("@SQLSTR", NString.class);


		}
		
		public static void pSelectValFtotMapping(Ref<NString> sqlOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_SELECT_VAL_FTOT_MAPPING", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQL_OUT", NString.class);
				
			cmd.execute();
			sqlOut.val = cmd.getParameterValue("@SQL_OUT", NString.class);


		}
		
		public static void pSelectValObph(Ref<NString> parmSqlstr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_SELECT_VAL_OBPH", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_SQLSTR", NString.class);
				
			cmd.execute();
			parmSqlstr.val = cmd.getParameterValue("@PARM_SQLSTR", NString.class);


		}
		
		public static void pSelectValObud(Ref<NString> parmSqlstr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_SELECT_VAL_OBUD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_SQLSTR", NString.class);
				
			cmd.execute();
			parmSqlstr.val = cmd.getParameterValue("@PARM_SQLSTR", NString.class);


		}
		
		public static void pSelectValPlbd2Mapping(Ref<NString> sqlOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_SELECT_VAL_PLBD_2_MAPPING", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQL_OUT", NString.class);
				
			cmd.execute();
			sqlOut.val = cmd.getParameterValue("@SQL_OUT", NString.class);


		}
		
		public static void pSelectValPlbdBook(Ref<NString> sqlstr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_SELECT_VAL_PLBD_BOOK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQLSTR", NString.class);
				
			cmd.execute();
			sqlstr.val = cmd.getParameterValue("@SQLSTR", NString.class);


		}
		
		public static void pSelectValPlbdMapping(Ref<NString> sqlOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_SELECT_VAL_PLBD_MAPPING", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQL_OUT", NString.class);
				
			cmd.execute();
			sqlOut.val = cmd.getParameterValue("@SQL_OUT", NString.class);


		}
		
		public static void pSelectValPtotBook(Ref<NString> sqlstr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_SELECT_VAL_PTOT_BOOK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQLSTR", NString.class);
				
			cmd.execute();
			sqlstr.val = cmd.getParameterValue("@SQLSTR", NString.class);


		}
		
		public static void pSelectValPtotMapping(Ref<NString> sqlOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_SELECT_VAL_PTOT_MAPPING", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQL_OUT", NString.class);
				
			cmd.execute();
			sqlOut.val = cmd.getParameterValue("@SQL_OUT", NString.class);


		}
		
		public static void pSelectValRtotBook(Ref<NString> sqlstr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_SELECT_VAL_RTOT_BOOK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQLSTR", NString.class);
				
			cmd.execute();
			sqlstr.val = cmd.getParameterValue("@SQLSTR", NString.class);


		}
		
		public static void pSelectValRtotMapping(Ref<NString> sqlOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_SELECT_VAL_RTOT_MAPPING", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQL_OUT", NString.class);
				
			cmd.execute();
			sqlOut.val = cmd.getParameterValue("@SQL_OUT", NString.class);


		}
		
		public static void pSelectValSgrp(Ref<NString> parmSqlstr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_SELECT_VAL_SGRP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_SQLSTR", NString.class);
				
			cmd.execute();
			parmSqlstr.val = cmd.getParameterValue("@PARM_SQLSTR", NString.class);


		}
		
		public static void pStoreBook(NString parmPhase,NString parmStepBook,NString parmStepMap,NString parmBook,NString parmSheet) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_STORE_BOOK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_PHASE", parmPhase);
			cmd.addParameter("@PARM_STEP_BOOK", parmStepBook);
			cmd.addParameter("@PARM_STEP_MAP", parmStepMap);
			cmd.addParameter("@PARM_BOOK", parmBook);
			cmd.addParameter("@PARM_SHEET", parmSheet);
				
			cmd.execute();


		}
		
		public static void pStoreBookPhase1(NString stepBook) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_STORE_BOOK_PHASE_1", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@STEP_BOOK", stepBook);
				
			cmd.execute();


		}
		
		public static void pStoreBookPhase2(NString stepBook,NString bookName,NString sheetName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_STORE_BOOK_PHASE_2", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@STEP_BOOK", stepBook);
			cmd.addParameter("@BOOK_NAME", bookName);
			cmd.addParameter("@SHEET_NAME", sheetName);
				
			cmd.execute();


		}
		
		public static void pStoreBookPhase3(NString stepBook,NString stepMap) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_STORE_BOOK_PHASE_3", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@STEP_BOOK", stepBook);
			cmd.addParameter("@STEP_MAP", stepMap);
				
			cmd.execute();


		}
		
		public static void pStoreCoas(Ref<NString> whichPhase,NString coasValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_STORE_COAS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@WHICH_PHASE", whichPhase, true);
			cmd.addParameter("@COAS_VALUE", coasValue);
				
			cmd.execute();
			whichPhase.val = cmd.getParameterValue("@WHICH_PHASE", NString.class);


		}
		
		public static void pStoreEcls(Ref<NString> whichPhase,NString eclsValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_STORE_ECLS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@WHICH_PHASE", whichPhase, true);
			cmd.addParameter("@ECLS_VALUE", eclsValue);
				
			cmd.execute();
			whichPhase.val = cmd.getParameterValue("@WHICH_PHASE", NString.class);


		}
		
		public static void pStoreFiscyr(Ref<NString> whichPhase,NString fiscyrValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_STORE_FISCYR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@WHICH_PHASE", whichPhase, true);
			cmd.addParameter("@FISCYR_VALUE", fiscyrValue);
				
			cmd.execute();
			whichPhase.val = cmd.getParameterValue("@WHICH_PHASE", NString.class);


		}
		
		public static void pStoreHeader(NString parmPhase,NString parmStepBook,NString parmBook,NString parmSheet) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_STORE_HEADER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_PHASE", parmPhase);
			cmd.addParameter("@PARM_STEP_BOOK", parmStepBook);
			cmd.addParameter("@PARM_BOOK", parmBook);
			cmd.addParameter("@PARM_SHEET", parmSheet);
				
			cmd.execute();


		}
		
		public static void pStoreJobsCoas(Ref<NString> whichPhase,NString coasValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_STORE_JOBS_COAS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@WHICH_PHASE", whichPhase, true);
			cmd.addParameter("@COAS_VALUE", coasValue);
				
			cmd.execute();
			whichPhase.val = cmd.getParameterValue("@WHICH_PHASE", NString.class);


		}
		
		public static void pStoreJobsCols(Ref<NString> whichPhase,NString jobsColumn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_STORE_JOBS_COLS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@WHICH_PHASE", whichPhase, true);
			cmd.addParameter("@JOBS_COLUMN", jobsColumn);
				
			cmd.execute();
			whichPhase.val = cmd.getParameterValue("@WHICH_PHASE", NString.class);


		}
		
		public static void pStoreJobsDate(Ref<NString> whichPhase,NString jobsAsofDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_STORE_JOBS_DATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@WHICH_PHASE", whichPhase, true);
			cmd.addParameter("@JOBS_ASOF_DATE", jobsAsofDate);
				
			cmd.execute();
			whichPhase.val = cmd.getParameterValue("@WHICH_PHASE", NString.class);


		}
		
		public static void pStoreJobsInd(Ref<NString> whichPhase,NString jobsValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_STORE_JOBS_IND", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@WHICH_PHASE", whichPhase, true);
			cmd.addParameter("@JOBS_VALUE", jobsValue);
				
			cmd.execute();
			whichPhase.val = cmd.getParameterValue("@WHICH_PHASE", NString.class);


		}
		
		public static void pStoreJobsInfoInd(Ref<NString> whichPhase,NString jobsInfoValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_STORE_JOBS_INFO_IND", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@WHICH_PHASE", whichPhase, true);
			cmd.addParameter("@JOBS_INFO_VALUE", jobsInfoValue);
				
			cmd.execute();
			whichPhase.val = cmd.getParameterValue("@WHICH_PHASE", NString.class);


		}
		
		public static void pStoreObph(Ref<NString> whichPhase,NString obphValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_STORE_OBPH", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@WHICH_PHASE", whichPhase, true);
			cmd.addParameter("@OBPH_VALUE", obphValue);
				
			cmd.execute();
			whichPhase.val = cmd.getParameterValue("@WHICH_PHASE", NString.class);


		}
		
		public static void pStoreObud(Ref<NString> whichPhase,NString obudValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_STORE_OBUD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@WHICH_PHASE", whichPhase, true);
			cmd.addParameter("@OBUD_VALUE", obudValue);
				
			cmd.execute();
			whichPhase.val = cmd.getParameterValue("@WHICH_PHASE", NString.class);


		}
		
		public static void pStoreOrgn(Ref<NString> whichPhase,NString orgnValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_STORE_ORGN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@WHICH_PHASE", whichPhase, true);
			cmd.addParameter("@ORGN_VALUE", orgnValue);
				
			cmd.execute();
			whichPhase.val = cmd.getParameterValue("@WHICH_PHASE", NString.class);


		}
		
		public static void pStoreSourceInd(Ref<NString> whichPhase,NString sourceValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_STORE_SOURCE_IND", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@WHICH_PHASE", whichPhase, true);
			cmd.addParameter("@SOURCE_VALUE", sourceValue);
				
			cmd.execute();
			whichPhase.val = cmd.getParameterValue("@WHICH_PHASE", NString.class);


		}
		
		public static void pStoreStep2Values(NString parmPhase,NString parmStepName,NString parmStepValue1,NString parmStepValue2) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_STORE_STEP_2_VALUES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_PHASE", parmPhase);
			cmd.addParameter("@PARM_STEP_NAME", parmStepName);
			cmd.addParameter("@PARM_STEP_VALUE_1", parmStepValue1);
			cmd.addParameter("@PARM_STEP_VALUE_2", parmStepValue2);
				
			cmd.execute();


		}
		
		public static void pStoreStepValue(NString parmPhase,NString parmStepName,NString parmStepValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_STORE_STEP_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_PHASE", parmPhase);
			cmd.addParameter("@PARM_STEP_NAME", parmStepName);
			cmd.addParameter("@PARM_STEP_VALUE", parmStepValue);
				
			cmd.execute();


		}
		
		public static void pStoreUpldCoas(Ref<NString> whichPhase,NString coasValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_STORE_UPLD_COAS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@WHICH_PHASE", whichPhase, true);
			cmd.addParameter("@COAS_VALUE", coasValue);
				
			cmd.execute();
			whichPhase.val = cmd.getParameterValue("@WHICH_PHASE", NString.class);


		}
		
		public static void pStoreUpldFiscyr(Ref<NString> whichPhase,NString fiscyrValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_STORE_UPLD_FISCYR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@WHICH_PHASE", whichPhase, true);
			cmd.addParameter("@FISCYR_VALUE", fiscyrValue);
				
			cmd.execute();
			whichPhase.val = cmd.getParameterValue("@WHICH_PHASE", NString.class);


		}
		
		public static void pStoreUpldFtotBook(NString phaseIn,NString book,NString sheet) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_STORE_UPLD_FTOT_BOOK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PHASE_IN", phaseIn);
			cmd.addParameter("@BOOK", book);
			cmd.addParameter("@SHEET", sheet);
				
			cmd.execute();


		}
		
		public static void pStoreUpldFtotMapping(NString phaseIn,NString book,NString sheet,NString header,NString position,NString budgetAmt,NString bdcaCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_STORE_UPLD_FTOT_MAPPING", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PHASE_IN", phaseIn);
			cmd.addParameter("@BOOK", book);
			cmd.addParameter("@SHEET", sheet);
			cmd.addParameter("@HEADER", header);
			cmd.addParameter("@POSITION", position);
			cmd.addParameter("@BUDGET_AMT", budgetAmt);
			cmd.addParameter("@BDCA_CODE", bdcaCode);
				
			cmd.execute();


		}
		
		public static void pStoreUpldObph(Ref<NString> whichPhase,NString obphValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_STORE_UPLD_OBPH", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@WHICH_PHASE", whichPhase, true);
			cmd.addParameter("@OBPH_VALUE", obphValue);
				
			cmd.execute();
			whichPhase.val = cmd.getParameterValue("@WHICH_PHASE", NString.class);


		}
		
		public static void pStoreUpldObud(Ref<NString> whichPhase,NString obudValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_STORE_UPLD_OBUD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@WHICH_PHASE", whichPhase, true);
			cmd.addParameter("@OBUD_VALUE", obudValue);
				
			cmd.execute();
			whichPhase.val = cmd.getParameterValue("@WHICH_PHASE", NString.class);


		}
		
		public static void pStoreUpldPlbd2Mapping(NString phaseIn,NString book,NString sheet,NString header,NString position,NString budgetAmt,NString extAcct) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_STORE_UPLD_PLBD_2_MAPPING", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PHASE_IN", phaseIn);
			cmd.addParameter("@BOOK", book);
			cmd.addParameter("@SHEET", sheet);
			cmd.addParameter("@HEADER", header);
			cmd.addParameter("@POSITION", position);
			cmd.addParameter("@BUDGET_AMT", budgetAmt);
			cmd.addParameter("@EXT_ACCT", extAcct);
				
			cmd.execute();


		}
		
		public static void pStoreUpldPlbdBook(NString phaseIn,NString book,NString sheet) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_STORE_UPLD_PLBD_BOOK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PHASE_IN", phaseIn);
			cmd.addParameter("@BOOK", book);
			cmd.addParameter("@SHEET", sheet);
				
			cmd.execute();


		}
		
		public static void pStoreUpldPlbdMapping(NString phaseIn,NString book,NString sheet,NString header,NString position,NString budgetAmt,NString fund,NString orgn,NString acct,NString prog,NString actv,NString locn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_STORE_UPLD_PLBD_MAPPING", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PHASE_IN", phaseIn);
			cmd.addParameter("@BOOK", book);
			cmd.addParameter("@SHEET", sheet);
			cmd.addParameter("@HEADER", header);
			cmd.addParameter("@POSITION", position);
			cmd.addParameter("@BUDGET_AMT", budgetAmt);
			cmd.addParameter("@FUND", fund);
			cmd.addParameter("@ORGN", orgn);
			cmd.addParameter("@ACCT", acct);
			cmd.addParameter("@PROG", prog);
			cmd.addParameter("@ACTV", actv);
			cmd.addParameter("@LOCN", locn);
				
			cmd.execute();


		}
		
		public static void pStoreUpldPtotBook(NString phaseIn,NString book,NString sheet) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_STORE_UPLD_PTOT_BOOK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PHASE_IN", phaseIn);
			cmd.addParameter("@BOOK", book);
			cmd.addParameter("@SHEET", sheet);
				
			cmd.execute();


		}
		
		public static void pStoreUpldPtotMapping(NString phaseIn,NString book,NString sheet,NString header,NString position,NString budgetAmt,NString orgn,NString fte,NString budgBasis,NString annBasis,NString apptPct,NString baseUnits,NString createJfte) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_STORE_UPLD_PTOT_MAPPING", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PHASE_IN", phaseIn);
			cmd.addParameter("@BOOK", book);
			cmd.addParameter("@SHEET", sheet);
			cmd.addParameter("@HEADER", header);
			cmd.addParameter("@POSITION", position);
			cmd.addParameter("@BUDGET_AMT", budgetAmt);
			cmd.addParameter("@ORGN", orgn);
			cmd.addParameter("@FTE", fte);
			cmd.addParameter("@BUDG_BASIS", budgBasis);
			cmd.addParameter("@ANN_BASIS", annBasis);
			cmd.addParameter("@APPT_PCT", apptPct);
			cmd.addParameter("@BASE_UNITS", baseUnits);
			cmd.addParameter("@CREATE_JFTE", createJfte);
				
			cmd.execute();


		}
		
		public static void pStoreUpldRtotBook(NString phaseIn,NString book,NString sheet) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_STORE_UPLD_RTOT_BOOK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PHASE_IN", phaseIn);
			cmd.addParameter("@BOOK", book);
			cmd.addParameter("@SHEET", sheet);
				
			cmd.execute();


		}
		
		public static void pStoreUpldRtotMapping(NString phaseIn,NString book,NString sheet,NString header,NString position,NString budgetAmt,NString earnCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_STORE_UPLD_RTOT_MAPPING", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PHASE_IN", phaseIn);
			cmd.addParameter("@BOOK", book);
			cmd.addParameter("@SHEET", sheet);
			cmd.addParameter("@HEADER", header);
			cmd.addParameter("@POSITION", position);
			cmd.addParameter("@BUDGET_AMT", budgetAmt);
			cmd.addParameter("@EARN_CODE", earnCode);
				
			cmd.execute();


		}
		
		public static void pStoreUpldSgrp(Ref<NString> whichPhase,NString sgrpValue,NString salTabValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_STORE_UPLD_SGRP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@WHICH_PHASE", whichPhase, true);
			cmd.addParameter("@SGRP_VALUE", sgrpValue);
			cmd.addParameter("@SAL_TAB_VALUE", salTabValue);
				
			cmd.execute();
			whichPhase.val = cmd.getParameterValue("@WHICH_PHASE", NString.class);


		}
		
		public static void pStoreValCoas(Ref<NString> whichPhase,NString coasValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_STORE_VAL_COAS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@WHICH_PHASE", whichPhase, true);
			cmd.addParameter("@COAS_VALUE", coasValue);
				
			cmd.execute();
			whichPhase.val = cmd.getParameterValue("@WHICH_PHASE", NString.class);


		}
		
		public static void pStoreValFiscyr(Ref<NString> whichPhase,NString fiscyrValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_STORE_VAL_FISCYR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@WHICH_PHASE", whichPhase, true);
			cmd.addParameter("@FISCYR_VALUE", fiscyrValue);
				
			cmd.execute();
			whichPhase.val = cmd.getParameterValue("@WHICH_PHASE", NString.class);


		}
		
		public static void pStoreValFtotBook(NString phaseIn,NString book,NString sheet) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_STORE_VAL_FTOT_BOOK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PHASE_IN", phaseIn);
			cmd.addParameter("@BOOK", book);
			cmd.addParameter("@SHEET", sheet);
				
			cmd.execute();


		}
		
		public static void pStoreValFtotMapping(NString phaseIn,NString book,NString sheet,NString header,NString position,NString budgetAmt,NString bdcaCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_STORE_VAL_FTOT_MAPPING", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PHASE_IN", phaseIn);
			cmd.addParameter("@BOOK", book);
			cmd.addParameter("@SHEET", sheet);
			cmd.addParameter("@HEADER", header);
			cmd.addParameter("@POSITION", position);
			cmd.addParameter("@BUDGET_AMT", budgetAmt);
			cmd.addParameter("@BDCA_CODE", bdcaCode);
				
			cmd.execute();


		}
		
		public static void pStoreValObph(Ref<NString> whichPhase,NString obphValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_STORE_VAL_OBPH", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@WHICH_PHASE", whichPhase, true);
			cmd.addParameter("@OBPH_VALUE", obphValue);
				
			cmd.execute();
			whichPhase.val = cmd.getParameterValue("@WHICH_PHASE", NString.class);


		}
		
		public static void pStoreValObud(Ref<NString> whichPhase,NString obudValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_STORE_VAL_OBUD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@WHICH_PHASE", whichPhase, true);
			cmd.addParameter("@OBUD_VALUE", obudValue);
				
			cmd.execute();
			whichPhase.val = cmd.getParameterValue("@WHICH_PHASE", NString.class);


		}
		
		public static void pStoreValPlbd2Mapping(NString phaseIn,NString book,NString sheet,NString header,NString position,NString budgetAmt,NString extAcct) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_STORE_VAL_PLBD_2_MAPPING", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PHASE_IN", phaseIn);
			cmd.addParameter("@BOOK", book);
			cmd.addParameter("@SHEET", sheet);
			cmd.addParameter("@HEADER", header);
			cmd.addParameter("@POSITION", position);
			cmd.addParameter("@BUDGET_AMT", budgetAmt);
			cmd.addParameter("@EXT_ACCT", extAcct);
				
			cmd.execute();


		}
		
		public static void pStoreValPlbdBook(NString phaseIn,NString book,NString sheet) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_STORE_VAL_PLBD_BOOK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PHASE_IN", phaseIn);
			cmd.addParameter("@BOOK", book);
			cmd.addParameter("@SHEET", sheet);
				
			cmd.execute();


		}
		
		public static void pStoreValPlbdMapping(NString phaseIn,NString book,NString sheet,NString header,NString position,NString budgetAmt,NString fund,NString orgn,NString acct,NString prog,NString actv,NString locn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_STORE_VAL_PLBD_MAPPING", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PHASE_IN", phaseIn);
			cmd.addParameter("@BOOK", book);
			cmd.addParameter("@SHEET", sheet);
			cmd.addParameter("@HEADER", header);
			cmd.addParameter("@POSITION", position);
			cmd.addParameter("@BUDGET_AMT", budgetAmt);
			cmd.addParameter("@FUND", fund);
			cmd.addParameter("@ORGN", orgn);
			cmd.addParameter("@ACCT", acct);
			cmd.addParameter("@PROG", prog);
			cmd.addParameter("@ACTV", actv);
			cmd.addParameter("@LOCN", locn);
				
			cmd.execute();


		}
		
		public static void pStoreValPtotBook(NString phaseIn,NString book,NString sheet) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_STORE_VAL_PTOT_BOOK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PHASE_IN", phaseIn);
			cmd.addParameter("@BOOK", book);
			cmd.addParameter("@SHEET", sheet);
				
			cmd.execute();


		}
		
		public static void pStoreValPtotMapping(NString phaseIn,NString book,NString sheet,NString header,NString position,NString budgetAmt,NString orgn,NString fte,NString budgBasis,NString annBasis,NString appPct,NString baseUnits,NString createJfte) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_STORE_VAL_PTOT_MAPPING", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PHASE_IN", phaseIn);
			cmd.addParameter("@BOOK", book);
			cmd.addParameter("@SHEET", sheet);
			cmd.addParameter("@HEADER", header);
			cmd.addParameter("@POSITION", position);
			cmd.addParameter("@BUDGET_AMT", budgetAmt);
			cmd.addParameter("@ORGN", orgn);
			cmd.addParameter("@FTE", fte);
			cmd.addParameter("@BUDG_BASIS", budgBasis);
			cmd.addParameter("@ANN_BASIS", annBasis);
			cmd.addParameter("@APP_PCT", appPct);
			cmd.addParameter("@BASE_UNITS", baseUnits);
			cmd.addParameter("@CREATE_JFTE", createJfte);
				
			cmd.execute();


		}
		
		public static void pStoreValRtotBook(NString phaseIn,NString book,NString sheet) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_STORE_VAL_RTOT_BOOK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PHASE_IN", phaseIn);
			cmd.addParameter("@BOOK", book);
			cmd.addParameter("@SHEET", sheet);
				
			cmd.execute();


		}
		
		public static void pStoreValRtotMapping(NString phaseIn,NString book,NString sheet,NString header,NString position,NString budgetAmt,NString earnCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_STORE_VAL_RTOT_MAPPING", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PHASE_IN", phaseIn);
			cmd.addParameter("@BOOK", book);
			cmd.addParameter("@SHEET", sheet);
			cmd.addParameter("@HEADER", header);
			cmd.addParameter("@POSITION", position);
			cmd.addParameter("@BUDGET_AMT", budgetAmt);
			cmd.addParameter("@EARN_CODE", earnCode);
				
			cmd.execute();


		}
		
		public static void pStoreValSgrp(Ref<NString> whichPhase,NString sgrpValue,NString salTabValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_STORE_VAL_SGRP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@WHICH_PHASE", whichPhase, true);
			cmd.addParameter("@SGRP_VALUE", sgrpValue);
			cmd.addParameter("@SAL_TAB_VALUE", salTabValue);
				
			cmd.execute();
			whichPhase.val = cmd.getParameterValue("@WHICH_PHASE", NString.class);


		}
		
		public static void pUpdateGotdpar(NString stepBook,NString bookName,NString sheetName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_UPDATE_GOTDPAR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@STEP_BOOK", stepBook);
			cmd.addParameter("@BOOK_NAME", bookName);
			cmd.addParameter("@SHEET_NAME", sheetName);
				
			cmd.execute();


		}
		
		public static void pUploadFinish(Ref<NString> stageInout,Ref<NString> actionOut,Ref<NString> statusOut,Ref<NString> returnOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_UPLOAD_FINISH", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@STAGE_INOUT", stageInout, true);
			cmd.addParameter("@ACTION_OUT", NString.class);
			cmd.addParameter("@STATUS_OUT", NString.class);
			cmd.addParameter("@RETURN_OUT", NString.class);
				
			cmd.execute();
			stageInout.val = cmd.getParameterValue("@STAGE_INOUT", NString.class);
			actionOut.val = cmd.getParameterValue("@ACTION_OUT", NString.class);
			statusOut.val = cmd.getParameterValue("@STATUS_OUT", NString.class);
			returnOut.val = cmd.getParameterValue("@RETURN_OUT", NString.class);


		}
		
		public static void pUploadFinishProcs(Ref<NString> mappingSqlOut,Ref<NString> insertProcOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_UPLOAD_FINISH_PROCS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MAPPING_SQL_OUT", NString.class);
			cmd.addParameter("@INSERT_PROC_OUT", NString.class);
				
			cmd.execute();
			mappingSqlOut.val = cmd.getParameterValue("@MAPPING_SQL_OUT", NString.class);
			insertProcOut.val = cmd.getParameterValue("@INSERT_PROC_OUT", NString.class);


		}
		
		public static void pUploadNextStep(Ref<NString> stepname,Ref<NString> nextenabled,Ref<NString> finishenabled) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_UPLOAD_NEXT_STEP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@STEPNAME", stepname, true);
			cmd.addParameter("@NEXTENABLED", NString.class);
			cmd.addParameter("@FINISHENABLED", NString.class);
				
			cmd.execute();
			stepname.val = cmd.getParameterValue("@STEPNAME", NString.class);
			nextenabled.val = cmd.getParameterValue("@NEXTENABLED", NString.class);
			finishenabled.val = cmd.getParameterValue("@FINISHENABLED", NString.class);


		}
		
		public static void pValFinish(Ref<NString> stageInout,Ref<NString> actionOut,Ref<NString> statusOut,Ref<NString> returnOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_VAL_FINISH", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@STAGE_INOUT", stageInout, true);
			cmd.addParameter("@ACTION_OUT", NString.class);
			cmd.addParameter("@STATUS_OUT", NString.class);
			cmd.addParameter("@RETURN_OUT", NString.class);
				
			cmd.execute();
			stageInout.val = cmd.getParameterValue("@STAGE_INOUT", NString.class);
			actionOut.val = cmd.getParameterValue("@ACTION_OUT", NString.class);
			statusOut.val = cmd.getParameterValue("@STATUS_OUT", NString.class);
			returnOut.val = cmd.getParameterValue("@RETURN_OUT", NString.class);


		}
		
		public static void pValFinishFtotInsert(NString bookIn,NString sheetIn,NNumber rowIn,NString position,NString budgetAmt,NString bdca) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_VAL_FINISH_FTOT_INSERT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@BOOK_IN", bookIn);
			cmd.addParameter("@SHEET_IN", sheetIn);
			cmd.addParameter("@ROW_IN", rowIn);
			cmd.addParameter("@POSITION", position);
			cmd.addParameter("@BUDGET_AMT", budgetAmt);
			cmd.addParameter("@BDCA", bdca);
				
			cmd.execute();


		}
		
		public static void pValFinishInsert(NString bookIn,NString sheetIn,NNumber rowIn,NString position,NString budgetAmt,NString orgn,NString fte,NString budgBasis,NString annBasis,NString apptPct,NString baseUnits,NString createJfte) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_VAL_FINISH_INSERT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@BOOK_IN", bookIn);
			cmd.addParameter("@SHEET_IN", sheetIn);
			cmd.addParameter("@ROW_IN", rowIn);
			cmd.addParameter("@POSITION", position);
			cmd.addParameter("@BUDGET_AMT", budgetAmt);
			cmd.addParameter("@ORGN", orgn);
			cmd.addParameter("@FTE", fte);
			cmd.addParameter("@BUDG_BASIS", budgBasis);
			cmd.addParameter("@ANN_BASIS", annBasis);
			cmd.addParameter("@APPT_PCT", apptPct);
			cmd.addParameter("@BASE_UNITS", baseUnits);
			cmd.addParameter("@CREATE_JFTE", createJfte);
				
			cmd.execute();


		}
		
		public static void pValFinishPlbdInsert(NString bookIn,NString sheetIn,NNumber rowIn,NString position,NString budgetAmt,NString fund,NString orgn,NString acct,NString prog,NString actv,NString locn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_VAL_FINISH_PLBD_INSERT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@BOOK_IN", bookIn);
			cmd.addParameter("@SHEET_IN", sheetIn);
			cmd.addParameter("@ROW_IN", rowIn);
			cmd.addParameter("@POSITION", position);
			cmd.addParameter("@BUDGET_AMT", budgetAmt);
			cmd.addParameter("@FUND", fund);
			cmd.addParameter("@ORGN", orgn);
			cmd.addParameter("@ACCT", acct);
			cmd.addParameter("@PROG", prog);
			cmd.addParameter("@ACTV", actv);
			cmd.addParameter("@LOCN", locn);
				
			cmd.execute();


		}
		
		public static void pValFinishPlbd2Insert(NString bookIn,NString sheetIn,NNumber rowIn,NString position,NString budgetAmt,NString acctExt) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_VAL_FINISH_PLBD2_INSERT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@BOOK_IN", bookIn);
			cmd.addParameter("@SHEET_IN", sheetIn);
			cmd.addParameter("@ROW_IN", rowIn);
			cmd.addParameter("@POSITION", position);
			cmd.addParameter("@BUDGET_AMT", budgetAmt);
			cmd.addParameter("@ACCT_EXT", acctExt);
				
			cmd.execute();


		}
		
		public static void pValFinishProcs(Ref<NString> mappingSqlOut,Ref<NString> insertProcOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_VAL_FINISH_PROCS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MAPPING_SQL_OUT", NString.class);
			cmd.addParameter("@INSERT_PROC_OUT", NString.class);
				
			cmd.execute();
			mappingSqlOut.val = cmd.getParameterValue("@MAPPING_SQL_OUT", NString.class);
			insertProcOut.val = cmd.getParameterValue("@INSERT_PROC_OUT", NString.class);


		}
		
		public static void pValFinishRtotInsert(NString bookIn,NString sheetIn,NNumber rowIn,NString position,NString budgetAmt,NString earn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_VAL_FINISH_RTOT_INSERT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@BOOK_IN", bookIn);
			cmd.addParameter("@SHEET_IN", sheetIn);
			cmd.addParameter("@ROW_IN", rowIn);
			cmd.addParameter("@POSITION", position);
			cmd.addParameter("@BUDGET_AMT", budgetAmt);
			cmd.addParameter("@EARN", earn);
				
			cmd.execute();


		}
		
		public static void pValNextStep(Ref<NString> stepname,Ref<NString> nextenabled,Ref<NString> finishenabled) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_VAL_NEXT_STEP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@STEPNAME", stepname, true);
			cmd.addParameter("@NEXTENABLED", NString.class);
			cmd.addParameter("@FINISHENABLED", NString.class);
				
			cmd.execute();
			stepname.val = cmd.getParameterValue("@STEPNAME", NString.class);
			nextenabled.val = cmd.getParameterValue("@NEXTENABLED", NString.class);
			finishenabled.val = cmd.getParameterValue("@FINISHENABLED", NString.class);


		}
		
		public static void pValUploadFinishMsgs(Ref<NString> selectOut,Ref<NString> fromOut,Ref<NString> whereOut,Ref<NString> groupOut,Ref<NString> havingOut,Ref<NString> orderOut,Ref<NString> bookOut,Ref<NString> sheetOut,Ref<NString> sheetnameOut,Ref<NString> headersOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKDSSB.P_VAL_UPLOAD_FINISH_MSGS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SELECT_OUT", NString.class);
			cmd.addParameter("@FROM_OUT", NString.class);
			cmd.addParameter("@WHERE_OUT", NString.class);
			cmd.addParameter("@GROUP_OUT", NString.class);
			cmd.addParameter("@HAVING_OUT", NString.class);
			cmd.addParameter("@ORDER_OUT", NString.class);
			cmd.addParameter("@BOOK_OUT", NString.class);
			cmd.addParameter("@SHEET_OUT", NString.class);
			cmd.addParameter("@SHEETNAME_OUT", NString.class);
			cmd.addParameter("@HEADERS_OUT", NString.class);
				
			cmd.execute();
			selectOut.val = cmd.getParameterValue("@SELECT_OUT", NString.class);
			fromOut.val = cmd.getParameterValue("@FROM_OUT", NString.class);
			whereOut.val = cmd.getParameterValue("@WHERE_OUT", NString.class);
			groupOut.val = cmd.getParameterValue("@GROUP_OUT", NString.class);
			havingOut.val = cmd.getParameterValue("@HAVING_OUT", NString.class);
			orderOut.val = cmd.getParameterValue("@ORDER_OUT", NString.class);
			bookOut.val = cmd.getParameterValue("@BOOK_OUT", NString.class);
			sheetOut.val = cmd.getParameterValue("@SHEET_OUT", NString.class);
			sheetnameOut.val = cmd.getParameterValue("@SHEETNAME_OUT", NString.class);
			headersOut.val = cmd.getParameterValue("@HEADERS_OUT", NString.class);


		}
		
	
	
	
}
