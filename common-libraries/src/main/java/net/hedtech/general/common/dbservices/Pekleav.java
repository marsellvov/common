package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Pekleav {
		public static NNumber fGetJobLeaveAccrual(NNumber curPidm,NString curLeavCode,NString hourDayInd,NString curYear,NString curPayid,NNumber curPayno,NString payPeriodStart,NString payPeriodEnd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKLEAV.F_GET_JOB_LEAVE_ACCRUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@CUR_PIDM", curPidm);
			cmd.addParameter("@CUR_LEAV_CODE", curLeavCode);
			cmd.addParameter("@HOUR_DAY_IND", hourDayInd);
			cmd.addParameter("@CUR_YEAR", curYear);
			cmd.addParameter("@CUR_PAYID", curPayid);
			cmd.addParameter("@CUR_PAYNO", curPayno);
			cmd.addParameter("@PAY_PERIOD_START", payPeriodStart);
			cmd.addParameter("@PAY_PERIOD_END", payPeriodEnd);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fGetLcatReportInd(NString parLcatCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKLEAV.F_GET_LCAT_REPORT_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PAR_LCAT_CODE", parLcatCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fGetLeavMaxHrs(NNumber parPidm,NString parLcatCode,NString parLeavCode,NNumber parFteAppt,NString parEndDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKLEAV.F_GET_LEAV_MAX_HRS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PAR_PIDM", parPidm);
			cmd.addParameter("@PAR_LCAT_CODE", parLcatCode);
			cmd.addParameter("@PAR_LEAV_CODE", parLeavCode);
			cmd.addParameter("@PAR_FTE_APPT", parFteAppt);
			cmd.addParameter("@PAR_END_DATE", parEndDate);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void pDelZeroBalLeaveRecs(NNumber curPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKLEAV.P_DEL_ZERO_BAL_LEAVE_RECS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CUR_PIDM", curPidm);
				
			cmd.execute();


		}
		
		public static void pEditAvailLeaveBalance(Ref<Nokmsgs.MsgRectypeRow> msgRecOut,NNumber pidm,NString leavCode,NNumber leaveAmount,NString hourDayInd,NDate asofDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKLEAV.P_EDIT_AVAIL_LEAVE_BALANCE", DbManager.getDataBaseFactory());
			
			cmd.addParameter(DbTypes.createStructType("MSG_REC_OUT", msgRecOut.val, Nokmsgs.MsgRectypeRow.class));
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@LEAV_CODE", leavCode);
			cmd.addParameter("@LEAVE_AMOUNT", leaveAmount);
			cmd.addParameter("@HOUR_DAY_IND", hourDayInd);
			cmd.addParameter("@ASOF_DATE", asofDate);
				
			cmd.execute();
			msgRecOut.val = cmd.getParameterValue("MSG_REC_OUT", Nokmsgs.MsgRectypeRow.class);


		}
		
//		public static void pGetLeavMaxList(NNumber parPidm,NNumber parFteAppt,NString parStartDate,NString parEndDate,Ref<List<LeavTabtypeRow>> leavTab) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKLEAV.P_GET_LEAV_MAX_LIST", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@PAR_PIDM", parPidm);
//			cmd.addParameter("@PAR_FTE_APPT", parFteAppt);
//			cmd.addParameter("@PAR_START_DATE", parStartDate);
//			cmd.addParameter("@PAR_END_DATE", parEndDate);
//			// cmd.addParameter(DbTypes.getTableType("LEAV_TAB", "", object.class));
//				
//			cmd.execute();
//			// leavTab.val = cmd.getTableParameterValue("@LEAV_TAB", object.class);
//
//
//		}
		
		public static void pGetOtherJlevBalances(NNumber curPidm,NDate asofDate,NString leaveSeqMethod,NNumber maxLeave,Ref<NNumber> totalBalance,Ref<NString> hourDayInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKLEAV.P_GET_OTHER_JLEV_BALANCES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CUR_PIDM", curPidm);
			cmd.addParameter("@ASOF_DATE", asofDate);
			cmd.addParameter("@LEAVE_SEQ_METHOD", leaveSeqMethod);
			cmd.addParameter("@MAX_LEAVE", maxLeave);
			cmd.addParameter("@TOTAL_BALANCE", totalBalance, true);
			cmd.addParameter("@HOUR_DAY_IND", hourDayInd, true);
				
			cmd.execute();
			totalBalance.val = cmd.getParameterValue("@TOTAL_BALANCE", NNumber.class);
			hourDayInd.val = cmd.getParameterValue("@HOUR_DAY_IND", NString.class);


		}
		
		public static void pMainRoll(NString pYear,NString pPict,NNumber pPayno,NDate pBeginDate,NDate pEndDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKLEAV.P_MAIN_ROLL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_PICT", pPict);
			cmd.addParameter("@P_PAYNO", pPayno);
			cmd.addParameter("@P_BEGIN_DATE", pBeginDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
				
			cmd.execute();


		}
		
//		public static void pUpdLeaveBalance(NNumber parJobsseqno,NNumber parApprPidm,Ref<List<Nokmsgs.MsgTabtypeRow>> msgTableOut) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKLEAV.P_UPD_LEAVE_BALANCE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@PAR_JOBSSEQNO", parJobsseqno);
//			cmd.addParameter("@PAR_APPR_PIDM", parApprPidm);
//			// cmd.addParameter(DbTypes.getTableType("MSG_TABLE_OUT", "", object.class));
//				
//			cmd.execute();
//			// msgTableOut.val = cmd.getTableParameterValue("@MSG_TABLE_OUT", object.class);
//
//
//		}
		
		public static void pValidateLeaveEligibleEarn(NNumber parJobsseqno,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKLEAV.P_VALIDATE_LEAVE_ELIGIBLE_EARN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PAR_JOBSSEQNO", parJobsseqno);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
	
	
	@DbRecordType(id="MaxLeavRectypeRow", dataSourceName="MAX_LEAV_RECTYPE")
	public static class MaxLeavRectypeRow
	{
		@DbRecordField(dataSourceName="LEAV")
		public NString Leav;
		@DbRecordField(dataSourceName="STATUS")
		public NString Status;
		@DbRecordField(dataSourceName="POSN")
		public NString Posn;
		@DbRecordField(dataSourceName="SUFF")
		public NString Suff;
		@DbRecordField(dataSourceName="EFF")
		public NString Eff;
		@DbRecordField(dataSourceName="MAX")
		public NString Max;
	}

	
	
}
