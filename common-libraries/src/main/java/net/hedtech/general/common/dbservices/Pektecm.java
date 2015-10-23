package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Pektecm {
		public static NBool fApprJobTerminated(NNumber pidmIn,NString posnIn,NDate ppEndDateIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKTECM.F_APPR_JOB_TERMINATED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@POSN_IN", posnIn);
			cmd.addParameter("@PP_END_DATE_IN", ppEndDateIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NString fAprPeriodStatus(NString pYear,NString pPictCode,NNumber pPayno,NString pActionInd,NString pLcatCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKTECM.F_APR_PERIOD_STATUS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
			cmd.addParameter("@P_PAYNO", pPayno);
			cmd.addParameter("@P_ACTION_IND", pActionInd);
			cmd.addParameter("@P_LCAT_CODE", pLcatCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool fCommentsExist(NNumber jobsSeqnoIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKTECM.F_COMMENTS_EXIST", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@JOBS_SEQNO_IN", jobsSeqnoIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NString fConstPeriodClosed() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKTECM.F_CONST_PERIOD_CLOSED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fConstPeriodOpen() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKTECM.F_CONST_PERIOD_OPEN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fConstPeriodPending() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKTECM.F_CONST_PERIOD_PENDING", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fConstPeriodUndefined() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKTECM.F_CONST_PERIOD_UNDEFINED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool fEmplTerminated(NNumber pidmIn,NDate ppStartDateIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKTECM.F_EMPL_TERMINATED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@PP_START_DATE_IN", ppStartDateIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NString fEntryPeriodStatus(NString yearIn,NString pictCodeIn,NNumber paynoIn,NString actionIndIn) {
			
			return fEntryPeriodStatus(yearIn,pictCodeIn,paynoIn,actionIndIn,NString.getNull());

		}
		
		public static NString fEntryPeriodStatus(NString yearIn,NString pictCodeIn,NNumber paynoIn,NString actionIndIn,NString lcatCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKTECM.F_ENTRY_PERIOD_STATUS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@YEAR_IN", yearIn);
			cmd.addParameter("@PICT_CODE_IN", pictCodeIn);
			cmd.addParameter("@PAYNO_IN", paynoIn);
			cmd.addParameter("@ACTION_IND_IN", actionIndIn);
			cmd.addParameter("@LCAT_CODE_IN", lcatCodeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetDesc(NString codeNameIn,NString codeValueIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKTECM.F_GET_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@CODE_NAME_IN", codeNameIn);
			cmd.addParameter("@CODE_VALUE_IN", codeValueIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool fLaborOverridesExist(NNumber jobsSeqnoIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKTECM.F_LABOR_OVERRIDES_EXIST", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@JOBS_SEQNO_IN", jobsSeqnoIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
//		public static MsgRectypeRow fMsgRec(NString msgTypeIn,NString msgTextIn,TransactionRectypeRow transRecIn,NString earnCodeIn,NString shiftIn,NNumber specialRateIn,NDate timeEntryDateIn,NNumber hrsIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKTECM.F_MSG_REC", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(DbTypes.createStructType(MsgRectypeRow.class));
//			cmd.addParameter("@MSG_TYPE_IN", msgTypeIn);
//			cmd.addParameter("@MSG_TEXT_IN", msgTextIn);
//			cmd.addParameter(DbTypes.createStructType("TRANS_REC_IN", transRecIn, TransactionRectypeRow.class ));
//			cmd.addParameter("@EARN_CODE_IN", earnCodeIn);
//			cmd.addParameter("@SHIFT_IN", shiftIn);
//			cmd.addParameter("@SPECIAL_RATE_IN", specialRateIn);
//			cmd.addParameter("@TIME_ENTRY_DATE_IN", timeEntryDateIn);
//			cmd.addParameter("@HRS_IN", hrsIn);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(MsgRectypeRow.class);
//
//		}
		
		public static NString fPhvtimeActionInd() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKTECM.F_PHVTIME_ACTION_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fPhvtimeCoasCodeTs() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKTECM.F_PHVTIME_COAS_CODE_TS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fPhvtimeOrgnCodeTs() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKTECM.F_PHVTIME_ORGN_CODE_TS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fPhvtimePayno() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKTECM.F_PHVTIME_PAYNO", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fPhvtimePictCode() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKTECM.F_PHVTIME_PICT_CODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fPhvtimeProxyForPidm() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKTECM.F_PHVTIME_PROXY_FOR_PIDM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fPhvtimeStatusInd() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKTECM.F_PHVTIME_STATUS_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fPhvtimeTimeEntryMethod() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKTECM.F_PHVTIME_TIME_ENTRY_METHOD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fPhvtimeUserPidm() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKTECM.F_PHVTIME_USER_PIDM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fPhvtimeUserRole() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKTECM.F_PHVTIME_USER_ROLE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fPhvtimeYear() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKTECM.F_PHVTIME_YEAR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pBuildTransactionRec(NNumber jobsSeqnoIn,NString transTypeIndIn,NString userRoleIndIn,NNumber userPidmIn,NNumber proxyForPidmIn,NString sourceIndIn,Ref<TransactionRectypeRow> transRecOut,Ref<Nokmsgs.MsgRectypeRow> msgRecOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKTECM.P_BUILD_TRANSACTION_REC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@JOBS_SEQNO_IN", jobsSeqnoIn);
			cmd.addParameter("@TRANS_TYPE_IND_IN", transTypeIndIn);
			cmd.addParameter("@USER_ROLE_IND_IN", userRoleIndIn);
			cmd.addParameter("@USER_PIDM_IN", userPidmIn);
			cmd.addParameter("@PROXY_FOR_PIDM_IN", proxyForPidmIn);
			cmd.addParameter("@SOURCE_IND_IN", sourceIndIn);
			cmd.addParameter(DbTypes.createStructType("TRANS_REC_OUT",transRecOut.val, TransactionRectypeRow.class));
			cmd.addParameter(DbTypes.createStructType("MSG_REC_OUT", msgRecOut.val, Nokmsgs.MsgRectypeRow.class));
				
			cmd.execute();
			transRecOut.val = cmd.getParameterValue("@TRANS_REC_OUT", TransactionRectypeRow.class);
			msgRecOut.val = cmd.getParameterValue("@MSG_REC_OUT", Nokmsgs.MsgRectypeRow.class);


		}
		
		public static void pBuildTransactionRec(NString yearIn,NString pictCodeIn,NNumber paynoIn,NString actionIndIn,NNumber pidmIn,NString posnIn,NString suffIn,NDate effDateIn,NString transTypeIndIn,NString userRoleIndIn,NNumber userPidmIn,NNumber proxyForPidmIn,NString sourceIndIn,Ref<TransactionRectypeRow> transRecOut,Ref<Nokmsgs.MsgRectypeRow> msgRecOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKTECM.P_BUILD_TRANSACTION_REC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@YEAR_IN", yearIn);
			cmd.addParameter("@PICT_CODE_IN", pictCodeIn);
			cmd.addParameter("@PAYNO_IN", paynoIn);
			cmd.addParameter("@ACTION_IND_IN", actionIndIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@POSN_IN", posnIn);
			cmd.addParameter("@SUFF_IN", suffIn);
			cmd.addParameter("@EFF_DATE_IN", effDateIn);
			cmd.addParameter("@TRANS_TYPE_IND_IN", transTypeIndIn);
			cmd.addParameter("@USER_ROLE_IND_IN", userRoleIndIn);
			cmd.addParameter("@USER_PIDM_IN", userPidmIn);
			cmd.addParameter("@PROXY_FOR_PIDM_IN", proxyForPidmIn);
			cmd.addParameter("@SOURCE_IND_IN", sourceIndIn);
			cmd.addParameter(DbTypes.createStructType("TRANS_REC_OUT",transRecOut.val, TransactionRectypeRow.class));
			cmd.addParameter(DbTypes.createStructType("MSG_REC_OUT",msgRecOut.val, Nokmsgs.MsgRectypeRow.class));
				
			cmd.execute();
			transRecOut.val = cmd.getParameterValue("@TRANS_REC_OUT", TransactionRectypeRow.class);
			msgRecOut.val = cmd.getParameterValue("@MSG_REC_OUT", Nokmsgs.MsgRectypeRow.class);


		}
		
		public static void pCreateRoutingQueue(NNumber jobsSeqnoIn,NDate ppEndDateIn,Ref<Nokmsgs.MsgRectypeRow> msgRecOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKTECM.P_CREATE_ROUTING_QUEUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@JOBS_SEQNO_IN", jobsSeqnoIn);
			cmd.addParameter("@PP_END_DATE_IN", ppEndDateIn);
			cmd.addParameter(DbTypes.createStructType("MSG_REC_OUT",msgRecOut.val, Nokmsgs.MsgRectypeRow.class));
				
			cmd.execute();
			msgRecOut.val = cmd.getParameterValue("@MSG_REC_OUT", Nokmsgs.MsgRectypeRow.class);


		}
		
		public static void pGetUserId(NNumber pidmIn,Ref<NString> userIdOut,Ref<Nokmsgs.MsgRectypeRow> msgRecOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKTECM.P_GET_USER_ID", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@USER_ID_OUT", NString.class);
			cmd.addParameter(DbTypes.createStructType("MSG_REC_OUT",msgRecOut.val, Nokmsgs.MsgRectypeRow.class));
				
			cmd.execute();
			userIdOut.val = cmd.getParameterValue("@USER_ID_OUT", NString.class);
			msgRecOut.val = cmd.getParameterValue("@MSG_REC_OUT", Nokmsgs.MsgRectypeRow.class);


		}
		
		public static void pInsertPerdays(NNumber jobsSeqnoIn,NDate beginDateIn,NDate endDateIn,NString jobsStatusIn,NString shcdCodeIn,Ref<Nokmsgs.MsgRectypeRow> msgRecOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKTECM.P_INSERT_PERDAYS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@JOBS_SEQNO_IN", jobsSeqnoIn);
			cmd.addParameter("@BEGIN_DATE_IN", beginDateIn);
			cmd.addParameter("@END_DATE_IN", endDateIn);
			cmd.addParameter("@JOBS_STATUS_IN", jobsStatusIn);
			cmd.addParameter("@SHCD_CODE_IN", shcdCodeIn);
			cmd.addParameter(DbTypes.createStructType("MSG_REC_OUT",msgRecOut.val, Nokmsgs.MsgRectypeRow.class));
				
			cmd.execute();
			msgRecOut.val = cmd.getParameterValue("@MSG_REC_OUT", Nokmsgs.MsgRectypeRow.class);


		}
		
		public static void pInsertPerearn(NNumber jobsSeqnoIn,NString earnCodeIn,NString shiftIn,NNumber specialRateIn,NNumber defaultHrsIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKTECM.P_INSERT_PEREARN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@JOBS_SEQNO_IN", jobsSeqnoIn);
			cmd.addParameter("@EARN_CODE_IN", earnCodeIn);
			cmd.addParameter("@SHIFT_IN", shiftIn);
			cmd.addParameter("@SPECIAL_RATE_IN", specialRateIn);
			cmd.addParameter("@DEFAULT_HRS_IN", defaultHrsIn);
				
			cmd.execute();


		}
		
		public static void pInsertPerhour(NNumber jobsSeqnoIn,NString earnCodeIn,NString shiftIn,NNumber specialRateIn,NDate timeEntryDateIn,NNumber hrsIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKTECM.P_INSERT_PERHOUR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@JOBS_SEQNO_IN", jobsSeqnoIn);
			cmd.addParameter("@EARN_CODE_IN", earnCodeIn);
			cmd.addParameter("@SHIFT_IN", shiftIn);
			cmd.addParameter("@SPECIAL_RATE_IN", specialRateIn);
			cmd.addParameter("@TIME_ENTRY_DATE_IN", timeEntryDateIn);
			cmd.addParameter("@HRS_IN", hrsIn);
				
			cmd.execute();


		}
		
		public static void pInsertPerjobs(NNumber jobsSeqnoIn,NString yearIn,NString pictCodeIn,NNumber paynoIn,NString actionIndIn,NNumber pidmIn,NString posnIn,NString suffIn,NString coasCodeTsIn,NString orgnCodeTsIn,NString statusIndIn,NString jobTitleIn,NString shiftIn,NString eclsCodeIn,NString timeEntryMethodIn,NString timeEntryTypeIn,NString timeInOutIndIn,NString lcatCodeIn,NNumber apptPctIn,NNumber fteIn,NNumber hrsDayIn,Ref<Nokmsgs.MsgRectypeRow> msgRecOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKTECM.P_INSERT_PERJOBS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@JOBS_SEQNO_IN", jobsSeqnoIn);
			cmd.addParameter("@YEAR_IN", yearIn);
			cmd.addParameter("@PICT_CODE_IN", pictCodeIn);
			cmd.addParameter("@PAYNO_IN", paynoIn);
			cmd.addParameter("@ACTION_IND_IN", actionIndIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@POSN_IN", posnIn);
			cmd.addParameter("@SUFF_IN", suffIn);
			cmd.addParameter("@COAS_CODE_TS_IN", coasCodeTsIn);
			cmd.addParameter("@ORGN_CODE_TS_IN", orgnCodeTsIn);
			cmd.addParameter("@STATUS_IND_IN", statusIndIn);
			cmd.addParameter("@JOB_TITLE_IN", jobTitleIn);
			cmd.addParameter("@SHIFT_IN", shiftIn);
			cmd.addParameter("@ECLS_CODE_IN", eclsCodeIn);
			cmd.addParameter("@TIME_ENTRY_METHOD_IN", timeEntryMethodIn);
			cmd.addParameter("@TIME_ENTRY_TYPE_IN", timeEntryTypeIn);
			cmd.addParameter("@TIME_IN_OUT_IND_IN", timeInOutIndIn);
			cmd.addParameter("@LCAT_CODE_IN", lcatCodeIn);
			cmd.addParameter("@APPT_PCT_IN", apptPctIn);
			cmd.addParameter("@FTE_IN", fteIn);
			cmd.addParameter("@HRS_DAY_IN", hrsDayIn);
			cmd.addParameter(DbTypes.createStructType("MSG_REC_OUT",msgRecOut.val, Nokmsgs.MsgRectypeRow.class));
				
			cmd.execute();
			msgRecOut.val = cmd.getParameterValue("@MSG_REC_OUT", Nokmsgs.MsgRectypeRow.class);


		}
		
		public static void pInsertPerrout(NNumber jobsSeqnoIn,NNumber apprSeqnoIn,NString apprPosnIn,NNumber apprPidmIn,NString apprActionIndIn,NString mandatoryApprIndIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKTECM.P_INSERT_PERROUT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@JOBS_SEQNO_IN", jobsSeqnoIn);
			cmd.addParameter("@APPR_SEQNO_IN", apprSeqnoIn);
			cmd.addParameter("@APPR_POSN_IN", apprPosnIn);
			cmd.addParameter("@APPR_PIDM_IN", apprPidmIn);
			cmd.addParameter("@APPR_ACTION_IND_IN", apprActionIndIn);
			cmd.addParameter("@MANDATORY_APPR_IND_IN", mandatoryApprIndIn);
				
			cmd.execute();


		}
		
		public static void pInsertTimeEntryHistory(TransactionRectypeRow transRecIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKTECM.P_INSERT_TIME_ENTRY_HISTORY", DbManager.getDataBaseFactory());
			
			cmd.addParameter(DbTypes.createStructType("TRANS_REC_IN", transRecIn, TransactionRectypeRow.class ));
				
			cmd.execute();


		}
		
		public static void pOpenTimeCv(NNumber pUserPidm,NNumber pProxyForPidm,NString pUserRole,NString pYear,NString pPictCode,NNumber pPayno,NString pActionInd,NString pCoasCodeTs,NString pOrgnCodeTs,NString pStatusInd,NString pTimeEntryMethod,NString pSortInd,Ref<DataCursor> pTimeCv) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKTECM.P_OPEN_TIME_CV", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_USER_PIDM", pUserPidm);
			cmd.addParameter("@P_PROXY_FOR_PIDM", pProxyForPidm);
			cmd.addParameter("@P_USER_ROLE", pUserRole);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
			cmd.addParameter("@P_PAYNO", pPayno);
			cmd.addParameter("@P_ACTION_IND", pActionInd);
			cmd.addParameter("@P_COAS_CODE_TS", pCoasCodeTs);
			cmd.addParameter("@P_ORGN_CODE_TS", pOrgnCodeTs);
			cmd.addParameter("@P_STATUS_IND", pStatusInd);
			cmd.addParameter("@P_TIME_ENTRY_METHOD", pTimeEntryMethod);
			cmd.addParameter("@P_SORT_IND", pSortInd);
			cmd.addParameter("@P_TIME_CV", DataCursor.class);
				
			cmd.execute();
			pTimeCv.val = cmd.getParameterValue("@P_TIME_CV", DataCursor.class);


		}
		
		public static void pSetPhvtimeParms(NNumber pUserPidm,NNumber pProxyForPidm,NString pUserRole,NString pYear,NString pPictCode,NNumber pPayno,NString pActionInd,NString pCoasCodeTs,NString pOrgnCodeTs,NString pStatusInd,NString pTimeEntryMethod) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKTECM.P_SET_PHVTIME_PARMS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_USER_PIDM", pUserPidm);
			cmd.addParameter("@P_PROXY_FOR_PIDM", pProxyForPidm);
			cmd.addParameter("@P_USER_ROLE", pUserRole);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
			cmd.addParameter("@P_PAYNO", pPayno);
			cmd.addParameter("@P_ACTION_IND", pActionInd);
			cmd.addParameter("@P_COAS_CODE_TS", pCoasCodeTs);
			cmd.addParameter("@P_ORGN_CODE_TS", pOrgnCodeTs);
			cmd.addParameter("@P_STATUS_IND", pStatusInd);
			cmd.addParameter("@P_TIME_ENTRY_METHOD", pTimeEntryMethod);
				
			cmd.execute();


		}
		
		public static void pUpdatePerearnHrs(NNumber jobsSeqnoIn,NString earnCodeIn,NString shiftIn,NNumber specialRateIn,NNumber defaultHrsIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKTECM.P_UPDATE_PEREARN_HRS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@JOBS_SEQNO_IN", jobsSeqnoIn);
			cmd.addParameter("@EARN_CODE_IN", earnCodeIn);
			cmd.addParameter("@SHIFT_IN", shiftIn);
			cmd.addParameter("@SPECIAL_RATE_IN", specialRateIn);
			cmd.addParameter("@DEFAULT_HRS_IN", defaultHrsIn);
				
			cmd.execute();


		}
		
		public static void pUpdatePerhourHrs(NNumber jobsSeqnoIn,NString earnCodeIn,NString shiftIn,NNumber specialRateIn,NDate timeEntryDateIn,NNumber hrsIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKTECM.P_UPDATE_PERHOUR_HRS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@JOBS_SEQNO_IN", jobsSeqnoIn);
			cmd.addParameter("@EARN_CODE_IN", earnCodeIn);
			cmd.addParameter("@SHIFT_IN", shiftIn);
			cmd.addParameter("@SPECIAL_RATE_IN", specialRateIn);
			cmd.addParameter("@TIME_ENTRY_DATE_IN", timeEntryDateIn);
			cmd.addParameter("@HRS_IN", hrsIn);
				
			cmd.execute();


		}
		
		public static void pUpdatePerjobsComments() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKTECM.P_UPDATE_PERJOBS_COMMENTS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pUpdatePerjobsStatus(NNumber jobsSeqnoIn,NString statusIndIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKTECM.P_UPDATE_PERJOBS_STATUS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@JOBS_SEQNO_IN", jobsSeqnoIn);
			cmd.addParameter("@STATUS_IND_IN", statusIndIn);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="TransactionRectypeRow", dataSourceName="TRANSACTION_RECTYPE")
	public static class TransactionRectypeRow
	{
		@DbRecordField(dataSourceName="JOBS_SEQNO")
		public NNumber JobsSeqno;
		@DbRecordField(dataSourceName="PAY_YEAR")
		public NString PayYear;
		@DbRecordField(dataSourceName="PICT_CODE")
		public NString PictCode;
		@DbRecordField(dataSourceName="PAYNO")
		public NNumber Payno;
		@DbRecordField(dataSourceName="ACTION_IND")
		public NString ActionInd;
		@DbRecordField(dataSourceName="PIDM")
		public NNumber Pidm;
		@DbRecordField(dataSourceName="POSN")
		public NString Posn;
		@DbRecordField(dataSourceName="SUFF")
		public NString Suff;
		@DbRecordField(dataSourceName="COAS_CODE_TS")
		public NString CoasCodeTs;
		@DbRecordField(dataSourceName="ORGN_CODE_TS")
		public NString OrgnCodeTs;
		@DbRecordField(dataSourceName="STATUS_IND")
		public NString StatusInd;
		@DbRecordField(dataSourceName="ECLS_CODE")
		public NString EclsCode;
		@DbRecordField(dataSourceName="LCAT_CODE")
		public NString LcatCode;
		@DbRecordField(dataSourceName="TIME_ENTRY_METHOD")
		public NString TimeEntryMethod;
		@DbRecordField(dataSourceName="TIME_ENTRY_TYPE")
		public NString TimeEntryType;
		@DbRecordField(dataSourceName="TIME_IN_OUT_IND")
		public NString TimeInOutInd;
		@DbRecordField(dataSourceName="TRANS_TYPE_IND")
		public NString TransTypeInd;
		@DbRecordField(dataSourceName="TRANS_PIDM")
		public NNumber TransPidm;
		@DbRecordField(dataSourceName="TRANS_PROXY_FOR_PIDM")
		public NNumber TransProxyForPidm;
		@DbRecordField(dataSourceName="TRANS_APPL_PIDM")
		public NNumber TransApplPidm;
		@DbRecordField(dataSourceName="TRANS_ROLE_IND")
		public NString TransRoleInd;
		@DbRecordField(dataSourceName="TRANS_SOURCE_IND")
		public NString TransSourceInd;
		@DbRecordField(dataSourceName="ORIGINATOR_PIDM")
		public NNumber OriginatorPidm;
		@DbRecordField(dataSourceName="ORIGINATOR_ROLE_IND")
		public NString OriginatorRoleInd;
		@DbRecordField(dataSourceName="EMPL_RETURN_IND")
		public NString EmplReturnInd;
		@DbRecordField(dataSourceName="TE_PERIOD_STATUS")
		public NString TePeriodStatus;
		@DbRecordField(dataSourceName="TE_APR_PERIOD_STATUS")
		public NString TeAprPeriodStatus;
		@DbRecordField(dataSourceName="APPROVAL_REQUIRED")
		public NBool ApprovalRequired;
		@DbRecordField(dataSourceName="FIRST_APPROVER_IN_QUEUE")
		public NBool FirstApproverInQueue;
		@DbRecordField(dataSourceName="AWAITING_USERS_APPROVAL")
		public NBool AwaitingUsersApproval;
		@DbRecordField(dataSourceName="AWAITING_USERS_ACKNOWLEDGE")
		public NBool AwaitingUsersAcknowledge;
	}

	
	
}
