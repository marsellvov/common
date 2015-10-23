package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwfkbwsh {
		public static void pAcctProgCodeLookup(NString coas,NString complete,NString lookupCode,NString pattern,NString pattern2,NNumber maxrows) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKBWSH.P_ACCT_PROG_CODE_LOOKUP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@COAS", coas);
			cmd.addParameter("@COMPLETE", complete);
			cmd.addParameter("@LOOKUP_CODE", lookupCode);
			cmd.addParameter("@PATTERN", pattern);
			cmd.addParameter("@PATTERN2", pattern2);
			cmd.addParameter("@MAXROWS", maxrows);
				
			cmd.execute();


		}
		
//		public static void pBudgetWorksheet(NString action,NString coaCode,NString coaTitle,NString budgetId,NString budgetTitle,NString budgetPhase,NString phaseTitle,NString fundType,NString fundTypeTitle,NString fundCode,NString fundTitle,NString orgnCode,NString orgnTitle,NString acctCode,NString acctTitle,NString progCode,NString progTitle,NString actvCode,NString actvTitle,NString locnCode,NString locnTitle,NString finMgrInd,NString massChangeAmt,NString massChangePercentInd,NString inclAdopBudgInd,NString inclPermAdjInd,NString inclTempAdoptInd,NString inclTempAdjustInd,NString inclDeleteLines,NString inclRevenueAtyp,NString inclLaborAtyp,NString inclExpAtyp,NString inclTransfAtyp,NString durationcode,List<Twbklibs.Varchar2TabtypeRow> changeValues,List<Twbklibs.Varchar2TabtypeRow> cumChanges,List<Twbklibs.Varchar2TabtypeRow> newAmounts,List<Twbklibs.Varchar2TabtypeRow> percentInds,List<Twbklibs.Varchar2TabtypeRow> deleteInds,List<Twbklibs.Varchar2TabtypeRow> sequenceNum,List<TabletypeRow> progAr,List<TabletypeRow> acctAr,List<TabletypeRow> durCodeAr,List<TabletypeRow> propBudAr,NString rndFactor,NNumber budgetLineCount) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKBWSH.P_BUDGET_WORKSHEET", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@ACTION", action);
//			cmd.addParameter("@COA_CODE", coaCode);
//			cmd.addParameter("@COA_TITLE", coaTitle);
//			cmd.addParameter("@BUDGET_ID", budgetId);
//			cmd.addParameter("@BUDGET_TITLE", budgetTitle);
//			cmd.addParameter("@BUDGET_PHASE", budgetPhase);
//			cmd.addParameter("@PHASE_TITLE", phaseTitle);
//			cmd.addParameter("@FUND_TYPE", fundType);
//			cmd.addParameter("@FUND_TYPE_TITLE", fundTypeTitle);
//			cmd.addParameter("@FUND_CODE", fundCode);
//			cmd.addParameter("@FUND_TITLE", fundTitle);
//			cmd.addParameter("@ORGN_CODE", orgnCode);
//			cmd.addParameter("@ORGN_TITLE", orgnTitle);
//			cmd.addParameter("@ACCT_CODE", acctCode);
//			cmd.addParameter("@ACCT_TITLE", acctTitle);
//			cmd.addParameter("@PROG_CODE", progCode);
//			cmd.addParameter("@PROG_TITLE", progTitle);
//			cmd.addParameter("@ACTV_CODE", actvCode);
//			cmd.addParameter("@ACTV_TITLE", actvTitle);
//			cmd.addParameter("@LOCN_CODE", locnCode);
//			cmd.addParameter("@LOCN_TITLE", locnTitle);
//			cmd.addParameter("@FIN_MGR_IND", finMgrInd);
//			cmd.addParameter("@MASS_CHANGE_AMT", massChangeAmt);
//			cmd.addParameter("@MASS_CHANGE_PERCENT_IND", massChangePercentInd);
//			cmd.addParameter("@INCL_ADOP_BUDG_IND", inclAdopBudgInd);
//			cmd.addParameter("@INCL_PERM_ADJ_IND", inclPermAdjInd);
//			cmd.addParameter("@INCL_TEMP_ADOPT_IND", inclTempAdoptInd);
//			cmd.addParameter("@INCL_TEMP_ADJUST_IND", inclTempAdjustInd);
//			cmd.addParameter("@INCL_DELETE_LINES", inclDeleteLines);
//			cmd.addParameter("@INCL_REVENUE_ATYP", inclRevenueAtyp);
//			cmd.addParameter("@INCL_LABOR_ATYP", inclLaborAtyp);
//			cmd.addParameter("@INCL_EXP_ATYP", inclExpAtyp);
//			cmd.addParameter("@INCL_TRANSF_ATYP", inclTransfAtyp);
//			cmd.addParameter("@DURATIONCODE", durationcode);
//			// cmd.addParameter(DbTypes.getTableType("CHANGE_VALUES", "", changeValues, object.class));
//			// cmd.addParameter(DbTypes.getTableType("CUM_CHANGES", "", cumChanges, object.class));
//			// cmd.addParameter(DbTypes.getTableType("NEW_AMOUNTS", "", newAmounts, object.class));
//			// cmd.addParameter(DbTypes.getTableType("PERCENT_INDS", "", percentInds, object.class));
//			// cmd.addParameter(DbTypes.getTableType("DELETE_INDS", "", deleteInds, object.class));
//			// cmd.addParameter(DbTypes.getTableType("SEQUENCE_NUM", "", sequenceNum, object.class));
//			// cmd.addParameter(DbTypes.getTableType("PROG_AR", "", progAr, object.class));
//			// cmd.addParameter(DbTypes.getTableType("ACCT_AR", "", acctAr, object.class));
//			// cmd.addParameter(DbTypes.getTableType("DUR_CODE_AR", "", durCodeAr, object.class));
//			// cmd.addParameter(DbTypes.getTableType("PROP_BUD_AR", "", propBudAr, object.class));
//			cmd.addParameter("@RND_FACTOR", rndFactor);
//			cmd.addParameter("@BUDGET_LINE_COUNT", budgetLineCount);
//				
//			cmd.execute();
//
//
//		}
		
	
	
	
}
