package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Fbkd2ss {
		public static NString fGetTablename() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD2SS.F_GET_TABLENAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pDeleteTempData() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD2SS.P_DELETE_TEMP_DATA", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pDownloadFinish(Ref<NString> stageInout,Ref<NString> actionOut,Ref<NString> statusOut,Ref<NString> returnOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD2SS.P_DOWNLOAD_FINISH", DbManager.getDataBaseFactory());
			
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
		
		public static void pDownloadFinishSql(Ref<NString> selectOut,Ref<NString> fromOut,Ref<NString> whereOut,Ref<NString> groupOut,Ref<NString> havingOut,Ref<NString> orderOut,Ref<NString> bookOut,Ref<NString> sheetOut,Ref<NString> sheetnameOut,Ref<NString> headersOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD2SS.P_DOWNLOAD_FINISH_SQL", DbManager.getDataBaseFactory());
			
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
		
		public static void pDownloadNextStep(Ref<NString> stepName,Ref<NString> nextenabled,Ref<NString> finishenabled) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD2SS.P_DOWNLOAD_NEXT_STEP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@STEP_NAME", stepName, true);
			cmd.addParameter("@NEXTENABLED", NString.class);
			cmd.addParameter("@FINISHENABLED", NString.class);
				
			cmd.execute();
			stepName.val = cmd.getParameterValue("@STEP_NAME", NString.class);
			nextenabled.val = cmd.getParameterValue("@NEXTENABLED", NString.class);
			finishenabled.val = cmd.getParameterValue("@FINISHENABLED", NString.class);


		}
		
		public static void pGetAcctLookup(Ref<NString> sqlOut,Ref<NString> columnheadersOut,Ref<NString> boundcolumnsOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD2SS.P_GET_ACCT_LOOKUP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQL_OUT", NString.class);
			cmd.addParameter("@COLUMNHEADERS_OUT", NString.class);
			cmd.addParameter("@BOUNDCOLUMNS_OUT", NString.class);
				
			cmd.execute();
			sqlOut.val = cmd.getParameterValue("@SQL_OUT", NString.class);
			columnheadersOut.val = cmd.getParameterValue("@COLUMNHEADERS_OUT", NString.class);
			boundcolumnsOut.val = cmd.getParameterValue("@BOUNDCOLUMNS_OUT", NString.class);


		}
		
		public static void pGetActvLookup(Ref<NString> sqlOut,Ref<NString> columnheadersOut,Ref<NString> boundcolumnsOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD2SS.P_GET_ACTV_LOOKUP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQL_OUT", NString.class);
			cmd.addParameter("@COLUMNHEADERS_OUT", NString.class);
			cmd.addParameter("@BOUNDCOLUMNS_OUT", NString.class);
				
			cmd.execute();
			sqlOut.val = cmd.getParameterValue("@SQL_OUT", NString.class);
			columnheadersOut.val = cmd.getParameterValue("@COLUMNHEADERS_OUT", NString.class);
			boundcolumnsOut.val = cmd.getParameterValue("@BOUNDCOLUMNS_OUT", NString.class);


		}
		
		public static void pGetFundLookup(Ref<NString> sqlOut,Ref<NString> columnheadersOut,Ref<NString> boundcolumnsOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD2SS.P_GET_FUND_LOOKUP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQL_OUT", NString.class);
			cmd.addParameter("@COLUMNHEADERS_OUT", NString.class);
			cmd.addParameter("@BOUNDCOLUMNS_OUT", NString.class);
				
			cmd.execute();
			sqlOut.val = cmd.getParameterValue("@SQL_OUT", NString.class);
			columnheadersOut.val = cmd.getParameterValue("@COLUMNHEADERS_OUT", NString.class);
			boundcolumnsOut.val = cmd.getParameterValue("@BOUNDCOLUMNS_OUT", NString.class);


		}
		
		public static void pGetLocnLookup(Ref<NString> sqlOut,Ref<NString> columnheadersOut,Ref<NString> boundcolumnsOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD2SS.P_GET_LOCN_LOOKUP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQL_OUT", NString.class);
			cmd.addParameter("@COLUMNHEADERS_OUT", NString.class);
			cmd.addParameter("@BOUNDCOLUMNS_OUT", NString.class);
				
			cmd.execute();
			sqlOut.val = cmd.getParameterValue("@SQL_OUT", NString.class);
			columnheadersOut.val = cmd.getParameterValue("@COLUMNHEADERS_OUT", NString.class);
			boundcolumnsOut.val = cmd.getParameterValue("@BOUNDCOLUMNS_OUT", NString.class);


		}
		
		public static void pGetOrgnLookup(Ref<NString> sqlOut,Ref<NString> columnheadersOut,Ref<NString> boundcolumnsOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD2SS.P_GET_ORGN_LOOKUP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQL_OUT", NString.class);
			cmd.addParameter("@COLUMNHEADERS_OUT", NString.class);
			cmd.addParameter("@BOUNDCOLUMNS_OUT", NString.class);
				
			cmd.execute();
			sqlOut.val = cmd.getParameterValue("@SQL_OUT", NString.class);
			columnheadersOut.val = cmd.getParameterValue("@COLUMNHEADERS_OUT", NString.class);
			boundcolumnsOut.val = cmd.getParameterValue("@BOUNDCOLUMNS_OUT", NString.class);


		}
		
		public static void pGetProgLookup(Ref<NString> sqlOut,Ref<NString> columnheadersOut,Ref<NString> boundcolumnsOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD2SS.P_GET_PROG_LOOKUP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQL_OUT", NString.class);
			cmd.addParameter("@COLUMNHEADERS_OUT", NString.class);
			cmd.addParameter("@BOUNDCOLUMNS_OUT", NString.class);
				
			cmd.execute();
			sqlOut.val = cmd.getParameterValue("@SQL_OUT", NString.class);
			columnheadersOut.val = cmd.getParameterValue("@COLUMNHEADERS_OUT", NString.class);
			boundcolumnsOut.val = cmd.getParameterValue("@BOUNDCOLUMNS_OUT", NString.class);


		}
		
		public static void pLoadAmountType(NString tableName,NString amountType,NNumber orderType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD2SS.P_LOAD_AMOUNT_TYPE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TABLE_NAME", tableName);
			cmd.addParameter("@AMOUNT_TYPE", amountType);
			cmd.addParameter("@ORDER_TYPE", orderType);
				
			cmd.execute();


		}
		
		public static void pLoadCmtType(NString tableName,NString cmtType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD2SS.P_LOAD_CMT_TYPE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TABLE_NAME", tableName);
			cmd.addParameter("@CMT_TYPE", cmtType);
				
			cmd.execute();


		}
		
		public static void pLoadPeriod(NString tableName,NString period) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD2SS.P_LOAD_PERIOD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TABLE_NAME", tableName);
			cmd.addParameter("@PERIOD", period);
				
			cmd.execute();


		}
		
		public static void pLoadTempData(NString tableName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD2SS.P_LOAD_TEMP_DATA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TABLE_NAME", tableName);
				
			cmd.execute();


		}
		
		public static void pPopulationAcct(Ref<NString> sqlOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD2SS.P_POPULATION_ACCT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQL_OUT", NString.class);
				
			cmd.execute();
			sqlOut.val = cmd.getParameterValue("@SQL_OUT", NString.class);


		}
		
		public static void pPopulationActv(Ref<NString> sqlOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD2SS.P_POPULATION_ACTV", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQL_OUT", NString.class);
				
			cmd.execute();
			sqlOut.val = cmd.getParameterValue("@SQL_OUT", NString.class);


		}
		
		public static void pPopulationAmtType(Ref<NString> sqlOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD2SS.P_POPULATION_AMT_TYPE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQL_OUT", NString.class);
				
			cmd.execute();
			sqlOut.val = cmd.getParameterValue("@SQL_OUT", NString.class);


		}
		
		public static void pPopulationCmtType(Ref<NString> sqlOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD2SS.P_POPULATION_CMT_TYPE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQL_OUT", NString.class);
				
			cmd.execute();
			sqlOut.val = cmd.getParameterValue("@SQL_OUT", NString.class);


		}
		
		public static void pPopulationCoas(Ref<NString> sqlOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD2SS.P_POPULATION_COAS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQL_OUT", NString.class);
				
			cmd.execute();
			sqlOut.val = cmd.getParameterValue("@SQL_OUT", NString.class);


		}
		
		public static void pPopulationFund(Ref<NString> sqlOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD2SS.P_POPULATION_FUND", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQL_OUT", NString.class);
				
			cmd.execute();
			sqlOut.val = cmd.getParameterValue("@SQL_OUT", NString.class);


		}
		
		public static void pPopulationGrntCode(Ref<NString> sqlOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD2SS.P_POPULATION_GRNT_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQL_OUT", NString.class);
				
			cmd.execute();
			sqlOut.val = cmd.getParameterValue("@SQL_OUT", NString.class);


		}
		
		public static void pPopulationLocn(Ref<NString> sqlOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD2SS.P_POPULATION_LOCN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQL_OUT", NString.class);
				
			cmd.execute();
			sqlOut.val = cmd.getParameterValue("@SQL_OUT", NString.class);


		}
		
		public static void pPopulationObphCode(Ref<NString> sqlOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD2SS.P_POPULATION_OBPH_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQL_OUT", NString.class);
				
			cmd.execute();
			sqlOut.val = cmd.getParameterValue("@SQL_OUT", NString.class);


		}
		
		public static void pPopulationObudCode(Ref<NString> sqlOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD2SS.P_POPULATION_OBUD_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQL_OUT", NString.class);
				
			cmd.execute();
			sqlOut.val = cmd.getParameterValue("@SQL_OUT", NString.class);


		}
		
		public static void pPopulationOrgn(Ref<NString> sqlOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD2SS.P_POPULATION_ORGN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQL_OUT", NString.class);
				
			cmd.execute();
			sqlOut.val = cmd.getParameterValue("@SQL_OUT", NString.class);


		}
		
		public static void pPopulationPeriod(Ref<NString> sqlOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD2SS.P_POPULATION_PERIOD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQL_OUT", NString.class);
				
			cmd.execute();
			sqlOut.val = cmd.getParameterValue("@SQL_OUT", NString.class);


		}
		
		public static void pPopulationProg(Ref<NString> sqlOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD2SS.P_POPULATION_PROG", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQL_OUT", NString.class);
				
			cmd.execute();
			sqlOut.val = cmd.getParameterValue("@SQL_OUT", NString.class);


		}
		
		public static void pPopulationYear(Ref<NString> sqlOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD2SS.P_POPULATION_YEAR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQL_OUT", NString.class);
				
			cmd.execute();
			sqlOut.val = cmd.getParameterValue("@SQL_OUT", NString.class);


		}
		
		public static void pSelectionAcct(Ref<NString> sqlOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD2SS.P_SELECTION_ACCT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQL_OUT", NString.class);
				
			cmd.execute();
			sqlOut.val = cmd.getParameterValue("@SQL_OUT", NString.class);


		}
		
		public static void pSelectionActv(Ref<NString> sqlOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD2SS.P_SELECTION_ACTV", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQL_OUT", NString.class);
				
			cmd.execute();
			sqlOut.val = cmd.getParameterValue("@SQL_OUT", NString.class);


		}
		
		public static void pSelectionAmtType(Ref<NString> sqlOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD2SS.P_SELECTION_AMT_TYPE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQL_OUT", NString.class);
				
			cmd.execute();
			sqlOut.val = cmd.getParameterValue("@SQL_OUT", NString.class);


		}
		
		public static void pSelectionBudgetdev(Ref<NString> sqlOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD2SS.P_SELECTION_BUDGETDEV", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQL_OUT", NString.class);
				
			cmd.execute();
			sqlOut.val = cmd.getParameterValue("@SQL_OUT", NString.class);


		}
		
		public static void pSelectionCmtType(Ref<NString> sqlOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD2SS.P_SELECTION_CMT_TYPE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQL_OUT", NString.class);
				
			cmd.execute();
			sqlOut.val = cmd.getParameterValue("@SQL_OUT", NString.class);


		}
		
		public static void pSelectionCoas(Ref<NString> sqlOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD2SS.P_SELECTION_COAS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQL_OUT", NString.class);
				
			cmd.execute();
			sqlOut.val = cmd.getParameterValue("@SQL_OUT", NString.class);


		}
		
		public static void pSelectionFund(Ref<NString> sqlOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD2SS.P_SELECTION_FUND", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQL_OUT", NString.class);
				
			cmd.execute();
			sqlOut.val = cmd.getParameterValue("@SQL_OUT", NString.class);


		}
		
		public static void pSelectionGrntCode(Ref<NString> sqlOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD2SS.P_SELECTION_GRNT_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQL_OUT", NString.class);
				
			cmd.execute();
			sqlOut.val = cmd.getParameterValue("@SQL_OUT", NString.class);


		}
		
		public static void pSelectionLocn(Ref<NString> sqlOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD2SS.P_SELECTION_LOCN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQL_OUT", NString.class);
				
			cmd.execute();
			sqlOut.val = cmd.getParameterValue("@SQL_OUT", NString.class);


		}
		
		public static void pSelectionObphCode(Ref<NString> sqlOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD2SS.P_SELECTION_OBPH_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQL_OUT", NString.class);
				
			cmd.execute();
			sqlOut.val = cmd.getParameterValue("@SQL_OUT", NString.class);


		}
		
		public static void pSelectionObudCode(Ref<NString> sqlOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD2SS.P_SELECTION_OBUD_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQL_OUT", NString.class);
				
			cmd.execute();
			sqlOut.val = cmd.getParameterValue("@SQL_OUT", NString.class);


		}
		
		public static void pSelectionOrgn(Ref<NString> sqlOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD2SS.P_SELECTION_ORGN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQL_OUT", NString.class);
				
			cmd.execute();
			sqlOut.val = cmd.getParameterValue("@SQL_OUT", NString.class);


		}
		
		public static void pSelectionPeriod(Ref<NString> sqlOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD2SS.P_SELECTION_PERIOD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQL_OUT", NString.class);
				
			cmd.execute();
			sqlOut.val = cmd.getParameterValue("@SQL_OUT", NString.class);


		}
		
		public static void pSelectionProg(Ref<NString> sqlOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD2SS.P_SELECTION_PROG", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQL_OUT", NString.class);
				
			cmd.execute();
			sqlOut.val = cmd.getParameterValue("@SQL_OUT", NString.class);


		}
		
		public static void pSelectionYear(Ref<NString> sqlOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD2SS.P_SELECTION_YEAR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQL_OUT", NString.class);
				
			cmd.execute();
			sqlOut.val = cmd.getParameterValue("@SQL_OUT", NString.class);


		}
		
		public static void pStoringAcct(NString phaseIn,NString coasIn,NString acctCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD2SS.P_STORING_ACCT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PHASE_IN", phaseIn);
			cmd.addParameter("@COAS_IN", coasIn);
			cmd.addParameter("@ACCT_CODE", acctCode);
				
			cmd.execute();


		}
		
		public static void pStoringAcctFbbblin(NString phaseIn,NString acctCode,NString coasIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD2SS.P_STORING_ACCT_FBBBLIN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PHASE_IN", phaseIn);
			cmd.addParameter("@ACCT_CODE", acctCode);
			cmd.addParameter("@COAS_IN", coasIn);
				
			cmd.execute();


		}
		
		public static void pStoringAcctFgbopal(NString phaseIn,NString acctCode,NString coasIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD2SS.P_STORING_ACCT_FGBOPAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PHASE_IN", phaseIn);
			cmd.addParameter("@ACCT_CODE", acctCode);
			cmd.addParameter("@COAS_IN", coasIn);
				
			cmd.execute();


		}
		
		public static void pStoringAcctFrrgrnl(NString phaseIn,NString acctCode,NString coasIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD2SS.P_STORING_ACCT_FRRGRNL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PHASE_IN", phaseIn);
			cmd.addParameter("@ACCT_CODE", acctCode);
			cmd.addParameter("@COAS_IN", coasIn);
				
			cmd.execute();


		}
		
		public static void pStoringActv(NString phaseIn,NString coasIn,NString actvCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD2SS.P_STORING_ACTV", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PHASE_IN", phaseIn);
			cmd.addParameter("@COAS_IN", coasIn);
			cmd.addParameter("@ACTV_CODE", actvCode);
				
			cmd.execute();


		}
		
		public static void pStoringActvFbbblin(NString phaseIn,NString actvCode,NString coasIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD2SS.P_STORING_ACTV_FBBBLIN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PHASE_IN", phaseIn);
			cmd.addParameter("@ACTV_CODE", actvCode);
			cmd.addParameter("@COAS_IN", coasIn);
				
			cmd.execute();


		}
		
		public static void pStoringActvFgbopal(NString phaseIn,NString actvCode,NString coasIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD2SS.P_STORING_ACTV_FGBOPAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PHASE_IN", phaseIn);
			cmd.addParameter("@ACTV_CODE", actvCode);
			cmd.addParameter("@COAS_IN", coasIn);
				
			cmd.execute();


		}
		
		public static void pStoringActvFrrgrnl(NString phaseIn,NString actvCode,NString coasIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD2SS.P_STORING_ACTV_FRRGRNL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PHASE_IN", phaseIn);
			cmd.addParameter("@ACTV_CODE", actvCode);
			cmd.addParameter("@COAS_IN", coasIn);
				
			cmd.execute();


		}
		
		public static void pStoringAmtType(NString phaseIn,NString amtType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD2SS.P_STORING_AMT_TYPE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PHASE_IN", phaseIn);
			cmd.addParameter("@AMT_TYPE", amtType);
				
			cmd.execute();


		}
		
		public static void pStoringAmtTypeFbbblin(NString phaseIn,NString amtType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD2SS.P_STORING_AMT_TYPE_FBBBLIN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PHASE_IN", phaseIn);
			cmd.addParameter("@AMT_TYPE", amtType);
				
			cmd.execute();


		}
		
		public static void pStoringAmtTypeFgbopal(NString phaseIn,NString amtType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD2SS.P_STORING_AMT_TYPE_FGBOPAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PHASE_IN", phaseIn);
			cmd.addParameter("@AMT_TYPE", amtType);
				
			cmd.execute();


		}
		
		public static void pStoringAmtTypeFrrgrnl(NString phaseIn,NString amtType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD2SS.P_STORING_AMT_TYPE_FRRGRNL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PHASE_IN", phaseIn);
			cmd.addParameter("@AMT_TYPE", amtType);
				
			cmd.execute();


		}
		
		public static void pStoringBudgetdev(NString phaseIn,NString tableName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD2SS.P_STORING_BUDGETDEV", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PHASE_IN", phaseIn);
			cmd.addParameter("@TABLE_NAME", tableName);
				
			cmd.execute();


		}
		
		public static void pStoringCmtType(NString phaseIn,NString cmtType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD2SS.P_STORING_CMT_TYPE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PHASE_IN", phaseIn);
			cmd.addParameter("@CMT_TYPE", cmtType);
				
			cmd.execute();


		}
		
		public static void pStoringCoas(NString phaseIn,NString coasIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD2SS.P_STORING_COAS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PHASE_IN", phaseIn);
			cmd.addParameter("@COAS_IN", coasIn);
				
			cmd.execute();


		}
		
		public static void pStoringFund(NString phaseIn,NString coasIn,NString fundCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD2SS.P_STORING_FUND", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PHASE_IN", phaseIn);
			cmd.addParameter("@COAS_IN", coasIn);
			cmd.addParameter("@FUND_CODE", fundCode);
				
			cmd.execute();


		}
		
		public static void pStoringFundFbbblin(NString phaseIn,NString fundCode,NString coasIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD2SS.P_STORING_FUND_FBBBLIN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PHASE_IN", phaseIn);
			cmd.addParameter("@FUND_CODE", fundCode);
			cmd.addParameter("@COAS_IN", coasIn);
				
			cmd.execute();


		}
		
		public static void pStoringFundFgbopal(NString phaseIn,NString fundCode,NString coasIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD2SS.P_STORING_FUND_FGBOPAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PHASE_IN", phaseIn);
			cmd.addParameter("@FUND_CODE", fundCode);
			cmd.addParameter("@COAS_IN", coasIn);
				
			cmd.execute();


		}
		
		public static void pStoringFundFrrgrnl(NString phaseIn,NString fundCode,NString coasIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD2SS.P_STORING_FUND_FRRGRNL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PHASE_IN", phaseIn);
			cmd.addParameter("@FUND_CODE", fundCode);
			cmd.addParameter("@COAS_IN", coasIn);
				
			cmd.execute();


		}
		
		public static void pStoringGrntCode(NString phaseIn,NString grcode,NString coasIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD2SS.P_STORING_GRNT_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PHASE_IN", phaseIn);
			cmd.addParameter("@GRCODE", grcode);
			cmd.addParameter("@COAS_IN", coasIn);
				
			cmd.execute();


		}
		
		public static void pStoringLocn(NString phaseIn,NString coasIn,NString locnCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD2SS.P_STORING_LOCN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PHASE_IN", phaseIn);
			cmd.addParameter("@COAS_IN", coasIn);
			cmd.addParameter("@LOCN_CODE", locnCode);
				
			cmd.execute();


		}
		
		public static void pStoringLocnFbbblin(NString phaseIn,NString locnCode,NString coasIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD2SS.P_STORING_LOCN_FBBBLIN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PHASE_IN", phaseIn);
			cmd.addParameter("@LOCN_CODE", locnCode);
			cmd.addParameter("@COAS_IN", coasIn);
				
			cmd.execute();


		}
		
		public static void pStoringLocnFgbopal(NString phaseIn,NString locnCode,NString coasIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD2SS.P_STORING_LOCN_FGBOPAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PHASE_IN", phaseIn);
			cmd.addParameter("@LOCN_CODE", locnCode);
			cmd.addParameter("@COAS_IN", coasIn);
				
			cmd.execute();


		}
		
		public static void pStoringLocnFrrgrnl(NString phaseIn,NString locnCode,NString coasIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD2SS.P_STORING_LOCN_FRRGRNL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PHASE_IN", phaseIn);
			cmd.addParameter("@LOCN_CODE", locnCode);
			cmd.addParameter("@COAS_IN", coasIn);
				
			cmd.execute();


		}
		
		public static void pStoringObphCode(NString phaseIn,NString obphCode,NString coasIn,NString obudCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD2SS.P_STORING_OBPH_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PHASE_IN", phaseIn);
			cmd.addParameter("@OBPH_CODE", obphCode);
			cmd.addParameter("@COAS_IN", coasIn);
			cmd.addParameter("@OBUD_CODE", obudCode);
				
			cmd.execute();


		}
		
		public static void pStoringObudCode(NString phaseIn,NString obudCode,NString coasIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD2SS.P_STORING_OBUD_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PHASE_IN", phaseIn);
			cmd.addParameter("@OBUD_CODE", obudCode);
			cmd.addParameter("@COAS_IN", coasIn);
				
			cmd.execute();


		}
		
		public static void pStoringOrgn(NString phaseIn,NString coasIn,NString orgnCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD2SS.P_STORING_ORGN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PHASE_IN", phaseIn);
			cmd.addParameter("@COAS_IN", coasIn);
			cmd.addParameter("@ORGN_CODE", orgnCode);
				
			cmd.execute();


		}
		
		public static void pStoringOrgnFbbblin(NString phaseIn,NString orgnCode,NString coasIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD2SS.P_STORING_ORGN_FBBBLIN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PHASE_IN", phaseIn);
			cmd.addParameter("@ORGN_CODE", orgnCode);
			cmd.addParameter("@COAS_IN", coasIn);
				
			cmd.execute();


		}
		
		public static void pStoringOrgnFgbopal(NString phaseIn,NString orgnCode,NString coasIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD2SS.P_STORING_ORGN_FGBOPAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PHASE_IN", phaseIn);
			cmd.addParameter("@ORGN_CODE", orgnCode);
			cmd.addParameter("@COAS_IN", coasIn);
				
			cmd.execute();


		}
		
		public static void pStoringOrgnFrrgrnl(NString phaseIn,NString orgnCode,NString coasIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD2SS.P_STORING_ORGN_FRRGRNL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PHASE_IN", phaseIn);
			cmd.addParameter("@ORGN_CODE", orgnCode);
			cmd.addParameter("@COAS_IN", coasIn);
				
			cmd.execute();


		}
		
		public static void pStoringPeriodFgbopal(NString phaseIn,NString period) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD2SS.P_STORING_PERIOD_FGBOPAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PHASE_IN", phaseIn);
			cmd.addParameter("@PERIOD", period);
				
			cmd.execute();


		}
		
		public static void pStoringPeriodFrrgrnl(NString phaseIn,NString period) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD2SS.P_STORING_PERIOD_FRRGRNL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PHASE_IN", phaseIn);
			cmd.addParameter("@PERIOD", period);
				
			cmd.execute();


		}
		
		public static void pStoringProg(NString phaseIn,NString coasIn,NString progCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD2SS.P_STORING_PROG", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PHASE_IN", phaseIn);
			cmd.addParameter("@COAS_IN", coasIn);
			cmd.addParameter("@PROG_CODE", progCode);
				
			cmd.execute();


		}
		
		public static void pStoringProgFbbblin(NString phaseIn,NString progCode,NString coasIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD2SS.P_STORING_PROG_FBBBLIN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PHASE_IN", phaseIn);
			cmd.addParameter("@PROG_CODE", progCode);
			cmd.addParameter("@COAS_IN", coasIn);
				
			cmd.execute();


		}
		
		public static void pStoringProgFgbopal(NString phaseIn,NString progCode,NString coasIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD2SS.P_STORING_PROG_FGBOPAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PHASE_IN", phaseIn);
			cmd.addParameter("@PROG_CODE", progCode);
			cmd.addParameter("@COAS_IN", coasIn);
				
			cmd.execute();


		}
		
		public static void pStoringProgFrrgrnl(NString phaseIn,NString progCode,NString coasIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD2SS.P_STORING_PROG_FRRGRNL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PHASE_IN", phaseIn);
			cmd.addParameter("@PROG_CODE", progCode);
			cmd.addParameter("@COAS_IN", coasIn);
				
			cmd.execute();


		}
		
		public static void pStoringYearFgbopal(NString phaseIn,NString year,NString coasIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD2SS.P_STORING_YEAR_FGBOPAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PHASE_IN", phaseIn);
			cmd.addParameter("@YEAR", year);
			cmd.addParameter("@COAS_IN", coasIn);
				
			cmd.execute();


		}
		
		public static void pStoringYearFrrgrnl(NString phaseIn,NString year,NString coasIn,NString grcode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD2SS.P_STORING_YEAR_FRRGRNL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PHASE_IN", phaseIn);
			cmd.addParameter("@YEAR", year);
			cmd.addParameter("@COAS_IN", coasIn);
			cmd.addParameter("@GRCODE", grcode);
				
			cmd.execute();


		}
		
	
	
	
}
