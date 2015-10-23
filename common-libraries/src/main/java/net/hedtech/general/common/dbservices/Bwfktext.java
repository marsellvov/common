package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwfktext {
		public static void pBudgettext(NString editInd,NString textCode,NString budgetCode,NString budgetPhase,NString coasCode,NString fundCode,NString orgnCode,NString acctCode,NString progCode,NString actvCode,NString locnCode,NString budgDur,NNumber inPidm,NNumber seqNum,NString completedInd,NString prtbletext,NString noprtbletext) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKTEXT.P_BUDGETTEXT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EDIT_IND", editInd);
			cmd.addParameter("@TEXT_CODE", textCode);
			cmd.addParameter("@BUDGET_CODE", budgetCode);
			cmd.addParameter("@BUDGET_PHASE", budgetPhase);
			cmd.addParameter("@COAS_CODE", coasCode);
			cmd.addParameter("@FUND_CODE", fundCode);
			cmd.addParameter("@ORGN_CODE", orgnCode);
			cmd.addParameter("@ACCT_CODE", acctCode);
			cmd.addParameter("@PROG_CODE", progCode);
			cmd.addParameter("@ACTV_CODE", actvCode);
			cmd.addParameter("@LOCN_CODE", locnCode);
			cmd.addParameter("@BUDG_DUR", budgDur);
			cmd.addParameter("@IN_PIDM", inPidm);
			cmd.addParameter("@SEQ_NUM", seqNum);
			cmd.addParameter("@COMPLETED_IND", completedInd);
			cmd.addParameter("@PRTBLETEXT", prtbletext);
			cmd.addParameter("@NOPRTBLETEXT", noprtbletext);
				
			cmd.execute();


		}
		
		public static void pSaveFobtext(NString preqn,NNumber doclink,NString vendid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKTEXT.P_SAVE_FOBTEXT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PREQN", preqn);
			cmd.addParameter("@DOCLINK", doclink);
			cmd.addParameter("@VENDID", vendid);
				
			cmd.execute();


		}
		
		public static void pUpdateBdwcText(NString inFobtextCode,NNumber inPidm,NNumber inSeqNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKTEXT.P_UPDATE_BDWC_TEXT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IN_FOBTEXT_CODE", inFobtextCode);
			cmd.addParameter("@IN_PIDM", inPidm);
			cmd.addParameter("@IN_SEQ_NUM", inSeqNum);
				
			cmd.execute();


		}
		
		public static void pUpdateBlinText(NString inFobtextCode,NString inBudgetCode,NString inBudgetPhase,NString inCoasCode,NString inFundCode,NString inOrgnCode,NString inAcctCode,NString inProgCode,NString inActvCode,NString inLocnCode,NString inBudgDur,Ref<NBool> successInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKTEXT.P_UPDATE_BLIN_TEXT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IN_FOBTEXT_CODE", inFobtextCode);
			cmd.addParameter("@IN_BUDGET_CODE", inBudgetCode);
			cmd.addParameter("@IN_BUDGET_PHASE", inBudgetPhase);
			cmd.addParameter("@IN_COAS_CODE", inCoasCode);
			cmd.addParameter("@IN_FUND_CODE", inFundCode);
			cmd.addParameter("@IN_ORGN_CODE", inOrgnCode);
			cmd.addParameter("@IN_ACCT_CODE", inAcctCode);
			cmd.addParameter("@IN_PROG_CODE", inProgCode);
			cmd.addParameter("@IN_ACTV_CODE", inActvCode);
			cmd.addParameter("@IN_LOCN_CODE", inLocnCode);
			cmd.addParameter("@IN_BUDG_DUR", inBudgDur);
			cmd.addParameter("@SUCCESS_IND", NBool.class);
				
			cmd.execute();
			successInd.val = cmd.getParameterValue("@SUCCESS_IND", NBool.class);


		}
		
		public static void pUpdateBudgetText(NString inBudgetCode,NString inPrttext,NString inNoprttext) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKTEXT.P_UPDATE_BUDGET_TEXT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IN_BUDGET_CODE", inBudgetCode);
			cmd.addParameter("@IN_PRTTEXT", inPrttext);
			cmd.addParameter("@IN_NOPRTTEXT", inNoprttext);
				
			cmd.execute();


		}
		
		public static void pWriteText(NString itemno,NNumber doclink,NString completedtext,NString parmdoctext,NString parmdoctext2,NString doctype) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKTEXT.P_WRITE_TEXT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ITEMNO", itemno);
			cmd.addParameter("@DOCLINK", doclink);
			cmd.addParameter("@COMPLETEDTEXT", completedtext);
			cmd.addParameter("@PARMDOCTEXT", parmdoctext);
			cmd.addParameter("@PARMDOCTEXT2", parmdoctext2);
			cmd.addParameter("@DOCTYPE", doctype);
				
			cmd.execute();


		}
		
	
	
	
}
