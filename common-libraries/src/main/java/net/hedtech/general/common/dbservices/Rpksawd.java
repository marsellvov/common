package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Rpksawd {
		public static void pCreateSimAward(NString pAidyCode,NNumber pPidm,NString pFundCode,NString pAwstCode,NDate pAwstDate,NString pSysInd,NString pLockInd,NDate pOfferExpDate,NNumber pAcceptAmt,NDate pAcceptDate,NNumber pOrigOfferAmt,NDate pOrigOfferDate,NNumber pOfferAmt,NDate pOfferDate,NString pTreqOvrdeInd,NString pInsufficientSw,NNumber pInsufficientAmt) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPKSAWD.P_CREATE_SIM_AWARD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_AWST_CODE", pAwstCode);
			cmd.addParameter("@P_AWST_DATE", pAwstDate);
			cmd.addParameter("@P_SYS_IND", pSysInd);
			cmd.addParameter("@P_LOCK_IND", pLockInd);
			cmd.addParameter("@P_OFFER_EXP_DATE", pOfferExpDate);
			cmd.addParameter("@P_ACCEPT_AMT", pAcceptAmt);
			cmd.addParameter("@P_ACCEPT_DATE", pAcceptDate);
			cmd.addParameter("@P_ORIG_OFFER_AMT", pOrigOfferAmt);
			cmd.addParameter("@P_ORIG_OFFER_DATE", pOrigOfferDate);
			cmd.addParameter("@P_OFFER_AMT", pOfferAmt);
			cmd.addParameter("@P_OFFER_DATE", pOfferDate);
			cmd.addParameter("@P_TREQ_OVRDE_IND", pTreqOvrdeInd);
			cmd.addParameter("@P_INSUFFICIENT_SW", pInsufficientSw);
			cmd.addParameter("@P_INSUFFICIENT_AMT", pInsufficientAmt);
				
			cmd.execute();


		}
		
		public static void pDeleteSimAward(NString pAidyCode,NNumber pPidm,NString pFundCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPKSAWD.P_DELETE_SIM_AWARD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
				
			cmd.execute();


		}
		
		public static void pPopulateRptawrd(NString pAidyCode,NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPKSAWD.P_POPULATE_RPTAWRD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();


		}
		
		public static void pUpdateSimAward(NString pAidyCode,NNumber pPidm,NString pFundCode,NString pAwstCode,NDate pAwstDate,NString pSysInd,NDate pOfferExpDate,NNumber pAcceptAmt,NDate pAcceptDate,NString pLockInd,NNumber pOfferAmt,NDate pOfferDate,NNumber pDeclineAmt,NDate pDeclineDate,NNumber pCancelAmt,NDate pCancelDate,NString pTreqOvrdeInd,NString pInsufficientSw,NNumber pInsufficientAmt) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPKSAWD.P_UPDATE_SIM_AWARD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_AWST_CODE", pAwstCode);
			cmd.addParameter("@P_AWST_DATE", pAwstDate);
			cmd.addParameter("@P_SYS_IND", pSysInd);
			cmd.addParameter("@P_OFFER_EXP_DATE", pOfferExpDate);
			cmd.addParameter("@P_ACCEPT_AMT", pAcceptAmt);
			cmd.addParameter("@P_ACCEPT_DATE", pAcceptDate);
			cmd.addParameter("@P_LOCK_IND", pLockInd);
			cmd.addParameter("@P_OFFER_AMT", pOfferAmt);
			cmd.addParameter("@P_OFFER_DATE", pOfferDate);
			cmd.addParameter("@P_DECLINE_AMT", pDeclineAmt);
			cmd.addParameter("@P_DECLINE_DATE", pDeclineDate);
			cmd.addParameter("@P_CANCEL_AMT", pCancelAmt);
			cmd.addParameter("@P_CANCEL_DATE", pCancelDate);
			cmd.addParameter("@P_TREQ_OVRDE_IND", pTreqOvrdeInd);
			cmd.addParameter("@P_INSUFFICIENT_SW", pInsufficientSw);
			cmd.addParameter("@P_INSUFFICIENT_AMT", pInsufficientAmt);
				
			cmd.execute();


		}
		
	
	
	
}
