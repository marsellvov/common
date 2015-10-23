package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Rpkatrm {
		public static NNumber fGetMemoAmount(NNumber pPidm,NString pFundCode,NString pPeriod) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPKATRM.F_GET_MEMO_AMOUNT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fGetPaidAmount(NNumber pPidm,NString pFundCode,NString pPeriod) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPKATRM.F_GET_PAID_AMOUNT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void pAddDisburseSchedule(NString pAidyCode,NNumber pPidm,NString pFundCode,NString pAprdCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPKATRM.P_ADD_DISBURSE_SCHEDULE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_APRD_CODE", pAprdCode);
				
			cmd.execute();


		}
		
		public static void pAddSchedules(RbAward.AwardRecRow pAwardRec,Rpkawrd.FundRecRow pFundRec,NString pAprdCode,NString pAcceptInd,Ref<NNumber> pMemoAmtOut,Ref<NDate> pMemoDateOut,Ref<NNumber> pPaidAmtOut,Ref<NDate> pPaidDateOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPKATRM.P_ADD_SCHEDULES", DbManager.getDataBaseFactory());
			
			cmd.addParameter(DbTypes.createStructType("P_AWARD_REC", pAwardRec, RbAward.AwardRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("P_FUND_REC", pFundRec, Rpkawrd.FundRecRow.class ));
			cmd.addParameter("@P_APRD_CODE", pAprdCode);
			cmd.addParameter("@P_ACCEPT_IND", pAcceptInd);
			cmd.addParameter("@P_MEMO_AMT_OUT", NNumber.class);
			cmd.addParameter("@P_MEMO_DATE_OUT", NDate.class);
			cmd.addParameter("@P_PAID_AMT_OUT", NNumber.class);
			cmd.addParameter("@P_PAID_DATE_OUT", NDate.class);
				
			cmd.execute();
			pMemoAmtOut.val = cmd.getParameterValue("@P_MEMO_AMT_OUT", NNumber.class);
			pMemoDateOut.val = cmd.getParameterValue("@P_MEMO_DATE_OUT", NDate.class);
			pPaidAmtOut.val = cmd.getParameterValue("@P_PAID_AMT_OUT", NNumber.class);
			pPaidDateOut.val = cmd.getParameterValue("@P_PAID_DATE_OUT", NDate.class);


		}
		
		public static void pAddTermDisburseSchedule(NString pAidyCode,NNumber pPidm,NString pFundCode,NString pPeriod,NString pAprdCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPKATRM.P_ADD_TERM_DISBURSE_SCHEDULE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_APRD_CODE", pAprdCode);
				
			cmd.execute();


		}
		
		public static void pDeleteSchedules(NString pAidyCode,NNumber pPidm,NString pFundCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPKATRM.P_DELETE_SCHEDULES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
				
			cmd.execute();


		}
		
		public static void pDeleteTermDisburseSched(NString pAidyCode,NNumber pPidm,NString pFundCode,NString pPeriod) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPKATRM.P_DELETE_TERM_DISBURSE_SCHED", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
				
			cmd.execute();


		}
		
		public static void pScheduleLockedAwards(RbAward.AwardRecRow pAwardRec,Rpkawrd.FundRecRow pFundRec,NString pAprdCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPKATRM.P_SCHEDULE_LOCKED_AWARDS", DbManager.getDataBaseFactory());
			
			cmd.addParameter(DbTypes.createStructType("P_AWARD_REC", pAwardRec, RbAward.AwardRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("P_FUND_REC", pFundRec, Rpkawrd.FundRecRow.class ));
			cmd.addParameter("@P_APRD_CODE", pAprdCode);
				
			cmd.execute();


		}
		
		public static void pUpdateExistingSchedules(RbAward.AwardRecRow pAwardRec,NNumber pOrigOfferAmt,Rpkawrd.FundRecRow pFundRec,NString pAprdCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPKATRM.P_UPDATE_EXISTING_SCHEDULES", DbManager.getDataBaseFactory());
			
			cmd.addParameter(DbTypes.createStructType("P_AWARD_REC", pAwardRec, RbAward.AwardRecRow.class ));
			cmd.addParameter("@P_ORIG_OFFER_AMT", pOrigOfferAmt);
			cmd.addParameter(DbTypes.createStructType("P_FUND_REC", pFundRec, Rpkawrd.FundRecRow.class ));
			cmd.addParameter("@P_APRD_CODE", pAprdCode);
				
			cmd.execute();


		}
		
		public static void pUpdateSchedules(RbAward.AwardRecRow pAwardRec,Rpkawrd.FundRecRow pFundRec,NString pAprdCode,NString pAcceptInd,Ref<NNumber> pMemoAmtOut,Ref<NDate> pMemoDateOut,Ref<NNumber> pPaidAmtOut,Ref<NDate> pPaidDateOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPKATRM.P_UPDATE_SCHEDULES", DbManager.getDataBaseFactory());
			
			cmd.addParameter(DbTypes.createStructType("P_AWARD_REC", pAwardRec, RbAward.AwardRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("P_FUND_REC", pFundRec, Rpkawrd.FundRecRow.class ));
			cmd.addParameter("@P_APRD_CODE", pAprdCode);
			cmd.addParameter("@P_ACCEPT_IND", pAcceptInd);
			cmd.addParameter("@P_MEMO_AMT_OUT", NNumber.class);
			cmd.addParameter("@P_MEMO_DATE_OUT", NDate.class);
			cmd.addParameter("@P_PAID_AMT_OUT", NNumber.class);
			cmd.addParameter("@P_PAID_DATE_OUT", NDate.class);
				
			cmd.execute();
			pMemoAmtOut.val = cmd.getParameterValue("@P_MEMO_AMT_OUT", NNumber.class);
			pMemoDateOut.val = cmd.getParameterValue("@P_MEMO_DATE_OUT", NDate.class);
			pPaidAmtOut.val = cmd.getParameterValue("@P_PAID_AMT_OUT", NNumber.class);
			pPaidDateOut.val = cmd.getParameterValue("@P_PAID_DATE_OUT", NDate.class);


		}
		
	
	
	
}
