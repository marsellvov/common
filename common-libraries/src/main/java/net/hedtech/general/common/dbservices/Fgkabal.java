package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Fgkabal {
		public static void abalPCheckAvailableBalance(NString docCode,NString docType,NString transDate,NString reversalInd,NNumber itemNumber,NNumber seqNumber,NNumber submissionNumber,NNumber serialNumber,NString coasCode,NString fsyrCode,NString fundCode,NString orgnCode,NString acctCode,NString progCode,NString ruclCode,NNumber transAmount,NString drCrInd,NString postingPeriod,NString budgetPeriod,NString encdNum,NNumber encdItemNum,NNumber encdSeqNum,NString encdActionInd,NString commitmentType,NString nsfOverrideInd,Ref<NString> abalIndicator,Ref<NString> abalMessage) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FGKABAL.ABAL_P_CHECK_AVAILABLE_BALANCE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DOC_CODE", docCode);
			cmd.addParameter("@DOC_TYPE", docType);
			cmd.addParameter("@TRANS_DATE", transDate);
			cmd.addParameter("@REVERSAL_IND", reversalInd);
			cmd.addParameter("@ITEM_NUMBER", itemNumber);
			cmd.addParameter("@SEQ_NUMBER", seqNumber);
			cmd.addParameter("@SUBMISSION_NUMBER", submissionNumber);
			cmd.addParameter("@SERIAL_NUMBER", serialNumber);
			cmd.addParameter("@COAS_CODE", coasCode);
			cmd.addParameter("@FSYR_CODE", fsyrCode);
			cmd.addParameter("@FUND_CODE", fundCode);
			cmd.addParameter("@ORGN_CODE", orgnCode);
			cmd.addParameter("@ACCT_CODE", acctCode);
			cmd.addParameter("@PROG_CODE", progCode);
			cmd.addParameter("@RUCL_CODE", ruclCode);
			cmd.addParameter("@TRANS_AMOUNT", transAmount);
			cmd.addParameter("@DR_CR_IND", drCrInd);
			cmd.addParameter("@POSTING_PERIOD", postingPeriod);
			cmd.addParameter("@BUDGET_PERIOD", budgetPeriod);
			cmd.addParameter("@ENCD_NUM", encdNum);
			cmd.addParameter("@ENCD_ITEM_NUM", encdItemNum);
			cmd.addParameter("@ENCD_SEQ_NUM", encdSeqNum);
			cmd.addParameter("@ENCD_ACTION_IND", encdActionInd);
			cmd.addParameter("@COMMITMENT_TYPE", commitmentType);
			cmd.addParameter("@NSF_OVERRIDE_IND", nsfOverrideInd);
			cmd.addParameter("@ABAL_INDICATOR", abalIndicator, true);
			cmd.addParameter("@ABAL_MESSAGE", abalMessage, true);
				
			cmd.execute();
			abalIndicator.val = cmd.getParameterValue("@ABAL_INDICATOR", NString.class);
			abalMessage.val = cmd.getParameterValue("@ABAL_MESSAGE", NString.class);


		}
		
		public static void abalPGetNsfMessage(NString documentCode,NString documentType,NString reverseInd,NNumber serialNumbr,NNumber submissionNumbr,NNumber seqNumbr,NNumber itemNumbr,NString chartOfAccounts,NString fiscalYearCode,NString fndCode,NDate transactionDate,Ref<NString> errorIndicator,Ref<NString> errorMessage) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FGKABAL.ABAL_P_GET_NSF_MESSAGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DOCUMENT_CODE", documentCode);
			cmd.addParameter("@DOCUMENT_TYPE", documentType);
			cmd.addParameter("@REVERSE_IND", reverseInd);
			cmd.addParameter("@SERIAL_NUMBR", serialNumbr);
			cmd.addParameter("@SUBMISSION_NUMBR", submissionNumbr);
			cmd.addParameter("@SEQ_NUMBR", seqNumbr);
			cmd.addParameter("@ITEM_NUMBR", itemNumbr);
			cmd.addParameter("@CHART_OF_ACCOUNTS", chartOfAccounts);
			cmd.addParameter("@FISCAL_YEAR_CODE", fiscalYearCode);
			cmd.addParameter("@FND_CODE", fndCode);
			cmd.addParameter("@TRANSACTION_DATE", transactionDate);
			cmd.addParameter("@ERROR_INDICATOR", errorIndicator, true);
			cmd.addParameter("@ERROR_MESSAGE", NString.class);
				
			cmd.execute();
			errorIndicator.val = cmd.getParameterValue("@ERROR_INDICATOR", NString.class);
			errorMessage.val = cmd.getParameterValue("@ERROR_MESSAGE", NString.class);


		}
		
		public static void abalPInsFgrbakoFgbbavl(NString document,NString documentType,NString reversalIndicator,NNumber itemNumb,NNumber seqNumb,NNumber submissionNumb,NNumber serialNumb,NString coasCodeBavl,NString fsyrCodeBavl,NString fgbbavlFund,NString fgbbavlOrgn,NString fgbbavlAcct,NString fgbbavlProg,NNumber rulpNumber,NNumber adopAmount,NNumber adjtAmount,NNumber ytdAmount,NNumber encdAmount,NNumber rsrvAmount,NString fundCodeOrig,NString orgnCodeOrig,NString acctCodeOrig,NString progCodeOrig,NString periodBavl,NString periodOrig,NString controlPeriodBavl,NString severityBavl,NString commitType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FGKABAL.ABAL_P_INS_FGRBAKO_FGBBAVL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DOCUMENT", document);
			cmd.addParameter("@DOCUMENT_TYPE", documentType);
			cmd.addParameter("@REVERSAL_INDICATOR", reversalIndicator);
			cmd.addParameter("@ITEM_NUMB", itemNumb);
			cmd.addParameter("@SEQ_NUMB", seqNumb);
			cmd.addParameter("@SUBMISSION_NUMB", submissionNumb);
			cmd.addParameter("@SERIAL_NUMB", serialNumb);
			cmd.addParameter("@COAS_CODE_BAVL", coasCodeBavl);
			cmd.addParameter("@FSYR_CODE_BAVL", fsyrCodeBavl);
			cmd.addParameter("@FGBBAVL_FUND", fgbbavlFund);
			cmd.addParameter("@FGBBAVL_ORGN", fgbbavlOrgn);
			cmd.addParameter("@FGBBAVL_ACCT", fgbbavlAcct);
			cmd.addParameter("@FGBBAVL_PROG", fgbbavlProg);
			cmd.addParameter("@RULP_NUMBER", rulpNumber);
			cmd.addParameter("@ADOP_AMOUNT", adopAmount);
			cmd.addParameter("@ADJT_AMOUNT", adjtAmount);
			cmd.addParameter("@YTD_AMOUNT", ytdAmount);
			cmd.addParameter("@ENCD_AMOUNT", encdAmount);
			cmd.addParameter("@RSRV_AMOUNT", rsrvAmount);
			cmd.addParameter("@FUND_CODE_ORIG", fundCodeOrig);
			cmd.addParameter("@ORGN_CODE_ORIG", orgnCodeOrig);
			cmd.addParameter("@ACCT_CODE_ORIG", acctCodeOrig);
			cmd.addParameter("@PROG_CODE_ORIG", progCodeOrig);
			cmd.addParameter("@PERIOD_BAVL", periodBavl);
			cmd.addParameter("@PERIOD_ORIG", periodOrig);
			cmd.addParameter("@CONTROL_PERIOD_BAVL", controlPeriodBavl);
			cmd.addParameter("@SEVERITY_BAVL", severityBavl);
			cmd.addParameter("@COMMIT_TYPE", commitType);
				
			cmd.execute();


		}
		
		public static void deleteFgrbako(NString documentCode,NString documentType,NNumber submissionNumber,NNumber itemNumber,NNumber sequenceNumber,NString reversalIndicator,NNumber serNumber,NBool fromPosting) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FGKABAL.DELETE_FGRBAKO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DOCUMENT_CODE", documentCode);
			cmd.addParameter("@DOCUMENT_TYPE", documentType);
			cmd.addParameter("@SUBMISSION_NUMBER", submissionNumber);
			cmd.addParameter("@ITEM_NUMBER", itemNumber);
			cmd.addParameter("@SEQUENCE_NUMBER", sequenceNumber);
			cmd.addParameter("@REVERSAL_INDICATOR", reversalIndicator);
			cmd.addParameter("@SER_NUMBER", serNumber);
			cmd.addParameter("@FROM_POSTING", fromPosting);
				
			cmd.execute();


		}
		
		public static void pUpdateFgrbakoFspd(NString coasCode,NString documentCoasCode,NString documentType,NString fiscalYear,NString fiscalPeriod,NDate transactionDate,NString updateJvBudgetPd,Ref<NString> errorMessage) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FGKABAL.P_UPDATE_FGRBAKO_FSPD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@COAS_CODE", coasCode);
			cmd.addParameter("@DOCUMENT_COAS_CODE", documentCoasCode);
			cmd.addParameter("@DOCUMENT_TYPE", documentType);
			cmd.addParameter("@FISCAL_YEAR", fiscalYear);
			cmd.addParameter("@FISCAL_PERIOD", fiscalPeriod);
			cmd.addParameter("@TRANSACTION_DATE", transactionDate);
			cmd.addParameter("@UPDATE_JV_BUDGET_PD", updateJvBudgetPd);
			cmd.addParameter("@ERROR_MESSAGE", NString.class);
				
			cmd.execute();
			errorMessage.val = cmd.getParameterValue("@ERROR_MESSAGE", NString.class);


		}
		
	
	
	
}
