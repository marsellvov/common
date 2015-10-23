package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Tvkarfn {
		public static NString fCheckForArterm(NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TVKARFN.F_CHECK_FOR_ARTERM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCurrentAidYear(NString pTermCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TVKARFN.F_CURRENT_AID_YEAR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetAuth(NNumber pidmIn,NDate dateIn,NString authType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TVKARFN.F_GET_AUTH", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@DATE_IN", dateIn);
			cmd.addParameter("@AUTH_TYPE", authType);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetPriorYear(NString pAidyCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TVKARFN.F_GET_PRIOR_YEAR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fOtherAllowedRefundable(NNumber pidmIn,NString sessionid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TVKARFN.F_OTHER_ALLOWED_REFUNDABLE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@SESSIONID", sessionid);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fOtherCreditBalance(NNumber pidmIn,NString sessionid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TVKARFN.F_OTHER_CREDIT_BALANCE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@SESSIONID", sessionid);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fRfndAccountBalance(NNumber pidmIn,NString sessionid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TVKARFN.F_RFND_ACCOUNT_BALANCE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@SESSIONID", sessionid);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fRfndMemoBalance(NNumber pidmIn,NString sessionid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TVKARFN.F_RFND_MEMO_BALANCE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@SESSIONID", sessionid);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fTivAllowedRefundable(NNumber pidmIn,NString sessionid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TVKARFN.F_TIV_ALLOWED_REFUNDABLE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@SESSIONID", sessionid);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fTivCreditBalance(NNumber pidmIn,NString sessionid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TVKARFN.F_TIV_CREDIT_BALANCE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@SESSIONID", sessionid);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fTivEligibleAmt(NNumber pPidm,NString pTermCode,NString pAidyCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TVKARFN.F_TIV_ELIGIBLE_AMT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fTivPriorSum(NNumber pPidm,NString pTermCode,NString pAidyCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TVKARFN.F_TIV_PRIOR_SUM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void pCalculateRefunds(NNumber pidm,NString sessionid,Ref<NNumber> accountBalance,Ref<NNumber> pending,Ref<NNumber> tivReturn,Ref<NNumber> allReturn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TVKARFN.P_CALCULATE_REFUNDS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@SESSIONID", sessionid);
			cmd.addParameter("@ACCOUNT_BALANCE", accountBalance, true);
			cmd.addParameter("@PENDING", pending, true);
			cmd.addParameter("@TIV_RETURN", tivReturn, true);
			cmd.addParameter("@ALL_RETURN", allReturn, true);
				
			cmd.execute();
			accountBalance.val = cmd.getParameterValue("@ACCOUNT_BALANCE", NNumber.class);
			pending.val = cmd.getParameterValue("@PENDING", NNumber.class);
			tivReturn.val = cmd.getParameterValue("@TIV_RETURN", NNumber.class);
			allReturn.val = cmd.getParameterValue("@ALL_RETURN", NNumber.class);


		}
		
	
	
	
}
