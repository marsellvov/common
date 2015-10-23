package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Nbkjlbd {
		public static NString fLatestDistribution(NNumber pPidm,NString pPosn,NString pSuff,NDate pEffectiveDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKJLBD.F_LATEST_DISTRIBUTION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pBackoutJobLabor(NNumber pNbrjlbdPidm,NString pNbrjlbdPosn,NString pNbrjlbdSuff,NDate pNbrjlbdEffectiveDate,NString pUserId,NString pDataOrigin,Ref<NString> errorMessage,Ref<NString> pWarningsOut,Ref<NString> pBackoutInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKJLBD.P_BACKOUT_JOB_LABOR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_NBRJLBD_PIDM", pNbrjlbdPidm);
			cmd.addParameter("@P_NBRJLBD_POSN", pNbrjlbdPosn);
			cmd.addParameter("@P_NBRJLBD_SUFF", pNbrjlbdSuff);
			cmd.addParameter("@P_NBRJLBD_EFFECTIVE_DATE", pNbrjlbdEffectiveDate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@ERROR_MESSAGE", errorMessage, true);
			cmd.addParameter("@P_WARNINGS_OUT", NString.class);
			cmd.addParameter("@P_BACKOUT_IND", NString.class);
				
			cmd.execute();
			errorMessage.val = cmd.getParameterValue("@ERROR_MESSAGE", NString.class);
			pWarningsOut.val = cmd.getParameterValue("@P_WARNINGS_OUT", NString.class);
			pBackoutInd.val = cmd.getParameterValue("@P_BACKOUT_IND", NString.class);


		}
		
		public static void pCheckDateInRange(NNumber pPidm,NString pPosn,NString pSuff,NDate pEffectiveDate,Ref<NString> pErrorMessageOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKJLBD.P_CHECK_DATE_IN_RANGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_ERROR_MESSAGE_OUT", pErrorMessageOut, true);
				
			cmd.execute();
			pErrorMessageOut.val = cmd.getParameterValue("@P_ERROR_MESSAGE_OUT", NString.class);


		}
		
		public static void pCheckLastEffectiveDate(NNumber pPidm,NString pPosn,NString pSuff,NDate pEffectiveDate,Ref<NString> pErrorMessageOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKJLBD.P_CHECK_LAST_EFFECTIVE_DATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_ERROR_MESSAGE_OUT", pErrorMessageOut, true);
				
			cmd.execute();
			pErrorMessageOut.val = cmd.getParameterValue("@P_ERROR_MESSAGE_OUT", NString.class);


		}
		
//		public static void pCreateJobLaborHistory(List<NpJobLabor.JobLaborEncTabRow> pJobLaborTab,NString pChangeReason) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKJLBD.P_CREATE_JOB_LABOR_HISTORY", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("P_JOB_LABOR_TAB", "", pJobLaborTab, object.class));
//			cmd.addParameter("@P_CHANGE_REASON", pChangeReason);
//				
//			cmd.execute();
//
//
//		}
		
		public static void pGetJobData(NNumber pPidm,NString pPosn,NString pSuff,Ref<NDate> pJobBeginDate,Ref<NDate> pJobEndDate,Ref<NString> pJobCoasCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKJLBD.P_GET_JOB_DATA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_JOB_BEGIN_DATE", NDate.class);
			cmd.addParameter("@P_JOB_END_DATE", NDate.class);
			cmd.addParameter("@P_JOB_COAS_CODE", NString.class);
				
			cmd.execute();
			pJobBeginDate.val = cmd.getParameterValue("@P_JOB_BEGIN_DATE", NDate.class);
			pJobEndDate.val = cmd.getParameterValue("@P_JOB_END_DATE", NDate.class);
			pJobCoasCode.val = cmd.getParameterValue("@P_JOB_COAS_CODE", NString.class);


		}
		
//		public static void pGetJobLaborSet(Ref<NpJobLabor.JobLaborTabRow> pJobLaborTab) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKJLBD.P_GET_JOB_LABOR_SET", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter(DbTypes.createStructType("@P_JOB_LABOR_TAB", pJobLaborTab.val, NpJobLabor.JobLaborTabRow.class));
//				
//			cmd.execute();
//			
//			pJobLaborTab.val = cmd.getParameterValue("@P_JOB_LABOR_TAB", NpJobLabor.JobLaborTabRow.class);
//
//		}
		
		
		public static void pGetJobLaborSet(Ref<NpJobLabor.JobLaborTabRow> pJobLaborTab) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKJLBD.P_GET_JOB_LABOR_SET", DbManager.getDataBaseFactory());
		
			cmd.addParameter(DbTypes.getCollectionType("P_JOB_LABOR_TAB", pJobLaborTab.val, NpJobLabor.JobLaborTabRow.class, true));
		
			cmd.execute();
		
			pJobLaborTab.val = cmd.getParameterValue("P_JOB_LABOR_TAB", NpJobLabor.JobLaborTabRow.class);
	}
		
		
		
		
		public static void pGetPositionData(NString pPosn,Ref<NDate> pPosnEndDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKJLBD.P_GET_POSITION_DATA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_POSN_END_DATE", NDate.class);
				
			cmd.execute();
			pPosnEndDate.val = cmd.getParameterValue("@P_POSN_END_DATE", NDate.class);


		}
		
		public static void pInitializeJobLaborSet() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKJLBD.P_INITIALIZE_JOB_LABOR_SET", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pSetJobLaborRec(NpJobLabor.JobLaborRecRow pJobLaborRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKJLBD.P_SET_JOB_LABOR_REC", DbManager.getDataBaseFactory());
			
			cmd.addParameter(DbTypes.createStructType("P_JOB_LABOR_REC", pJobLaborRec, NpJobLabor.JobLaborRecRow.class ));
				
			cmd.execute();


		}
		
		public static void pUpdateNbrbjob(NNumber pPidm,NString pPosn,NString pSuff,NDate pEffectiveDate,NString pUserId,NString pDataOrigin,Ref<NString> pWarningsOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKJLBD.P_UPDATE_NBRBJOB", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_WARNINGS_OUT", NString.class);
				
			cmd.execute();
			pWarningsOut.val = cmd.getParameterValue("@P_WARNINGS_OUT", NString.class);


		}
		
		public static void pValidateJobLaborPercent(NNumber pPidm,NString pPosn,NString pSuff,NDate pEffectiveDate,Ref<NString> pErrMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKJLBD.P_VALIDATE_JOB_LABOR_PERCENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_ERR_MSG_OUT", NString.class);
				
			cmd.execute();
			pErrMsgOut.val = cmd.getParameterValue("@P_ERR_MSG_OUT", NString.class);


		}
		
	
	
	
}
