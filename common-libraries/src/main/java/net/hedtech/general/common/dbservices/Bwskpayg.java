package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwskpayg {
		public static NString fUpdatePayments(NNumber pPayTransId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKPAYG.F_UPDATE_PAYMENTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PAY_TRANS_ID", pPayTransId);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pDispfailure(NString transactionId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKPAYG.P_DISPFAILURE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TRANSACTION_ID", transactionId);
				
			cmd.execute();


		}
		
		public static void pDisplayTotals() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKPAYG.P_DISPLAY_TOTALS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pDisplist() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKPAYG.P_DISPLIST", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pDispsuccess(NString transactionId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKPAYG.P_DISPSUCCESS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TRANSACTION_ID", transactionId);
				
			cmd.execute();


		}
		
		public static void pDisptransaction(NNumber pStepNum,NString pPtypTranCode,NString inAgree,NNumber inCount) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKPAYG.P_DISPTRANSACTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_STEP_NUM", pStepNum);
			cmd.addParameter("@P_PTYP_TRAN_CODE", pPtypTranCode);
			cmd.addParameter("@IN_AGREE", inAgree);
			cmd.addParameter("@IN_COUNT", inCount);
				
			cmd.execute();


		}
		
		public static void pPageDirector(NNumber pStepNum,NString pPtypPmntCode,NString pTermCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKPAYG.P_PAGE_DIRECTOR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_STEP_NUM", pStepNum);
			cmd.addParameter("@P_PTYP_PMNT_CODE", pPtypPmntCode);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
				
			cmd.execute();


		}
		
		public static void pProcessPayment(NNumber pPidm,NString pTermCode,NNumber pTotalAmount) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKPAYG.P_PROCESS_PAYMENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_TOTAL_AMOUNT", pTotalAmount);
				
			cmd.execute();


		}
		
		public static void pProcfailure(NString transactionId,NString submitBtn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKPAYG.P_PROCFAILURE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TRANSACTION_ID", transactionId);
			cmd.addParameter("@SUBMIT_BTN", submitBtn);
				
			cmd.execute();


		}
		
		public static void pProclist(NNumber pPidm,NString pTermCode,NString pPtypPmntCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKPAYG.P_PROCLIST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PTYP_PMNT_CODE", pPtypPmntCode);
				
			cmd.execute();


		}
		
		public static void pProctotals(NNumber pPidm,NString pTermCode,NNumber pAmount,NString submitBtn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKPAYG.P_PROCTOTALS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_AMOUNT", pAmount);
			cmd.addParameter("@SUBMIT_BTN", submitBtn);
				
			cmd.execute();


		}
		
		public static void pProctransaction(NNumber pStepNum,NString pPtypPmntCode,NNumber pPidm,NString pTermCode,NString pPtypTranCode,NString pProcess,NString pReqInd,NString pMultInd,NString pCode,NNumber pAmount,NString pDepReleaseInd,NDate pDepRelDate,NDate pDepExpDate,NNumber pDepMinAmount,NString pAgree,NNumber pCount) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKPAYG.P_PROCTRANSACTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_STEP_NUM", pStepNum);
			cmd.addParameter("@P_PTYP_PMNT_CODE", pPtypPmntCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PTYP_TRAN_CODE", pPtypTranCode);
			cmd.addParameter("@P_PROCESS", pProcess);
			cmd.addParameter("@P_REQ_IND", pReqInd);
			cmd.addParameter("@P_MULT_IND", pMultInd);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_AMOUNT", pAmount);
			cmd.addParameter("@P_DEP_RELEASE_IND", pDepReleaseInd);
			cmd.addParameter("@P_DEP_REL_DATE", pDepRelDate);
			cmd.addParameter("@P_DEP_EXP_DATE", pDepExpDate);
			cmd.addParameter("@P_DEP_MIN_AMOUNT", pDepMinAmount);
			cmd.addParameter("@P_AGREE", pAgree);
			cmd.addParameter("@P_COUNT", pCount);
				
			cmd.execute();


		}
		
	
	
	
}
