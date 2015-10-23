package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Nbkbjob {
		public static NDate fDerivedEndDate(NNumber pPidm,NString pPosn,NString pSuff) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKBJOB.F_DERIVED_END_DATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
//		public static List<ListTabtypeRow> fList(NString pListName) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKBJOB.F_LIST", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<ListTabtypeRow>.class);
//			cmd.addParameter("@P_LIST_NAME", pListName);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<ListTabtypeRow>.class);
//
//		}
		
		public static void pCheckForPrimaryJob(NNumber pPidm,NString pPosn,NString pSuff,NDate pBeginDate,NDate pEndDate,NString pContractType,Ref<NString> pWarningMsgOut,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKBJOB.P_CHECK_FOR_PRIMARY_JOB", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_BEGIN_DATE", pBeginDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_CONTRACT_TYPE", pContractType);
			cmd.addParameter("@P_WARNING_MSG_OUT", NString.class);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pWarningMsgOut.val = cmd.getParameterValue("@P_WARNING_MSG_OUT", NString.class);
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pGetCurrentFisc(NString pPosn,NString pCoasCode,Ref<NString> pFiscCodeOut,Ref<NDate> pFiscBeginDateOut,Ref<NDate> pFiscEndDateOut,Ref<NString> pPtotStatusOut,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKBJOB.P_GET_CURRENT_FISC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_FISC_CODE_OUT", NString.class);
			cmd.addParameter("@P_FISC_BEGIN_DATE_OUT", NDate.class);
			cmd.addParameter("@P_FISC_END_DATE_OUT", NDate.class);
			cmd.addParameter("@P_PTOT_STATUS_OUT", NString.class);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pFiscCodeOut.val = cmd.getParameterValue("@P_FISC_CODE_OUT", NString.class);
			pFiscBeginDateOut.val = cmd.getParameterValue("@P_FISC_BEGIN_DATE_OUT", NDate.class);
			pFiscEndDateOut.val = cmd.getParameterValue("@P_FISC_END_DATE_OUT", NDate.class);
			pPtotStatusOut.val = cmd.getParameterValue("@P_PTOT_STATUS_OUT", NString.class);
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pGetPosnBudgetInfo(NString pPosn,NString pCoasCode,Ref<NString> pFiscCodeOut,Ref<NDate> pFiscBeginDateOut,Ref<NDate> pFiscEndDateOut,Ref<NString> pPtotCoasCodeOut,Ref<NString> pPtotOrgnCodeOut,Ref<NString> pPtotStatusOut,Ref<NNumber> pPtotFteOut,Ref<NNumber> pPtotBudgetOut,Ref<NNumber> pPtotAvailOut,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKBJOB.P_GET_POSN_BUDGET_INFO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_FISC_CODE_OUT", NString.class);
			cmd.addParameter("@P_FISC_BEGIN_DATE_OUT", NDate.class);
			cmd.addParameter("@P_FISC_END_DATE_OUT", NDate.class);
			cmd.addParameter("@P_PTOT_COAS_CODE_OUT", NString.class);
			cmd.addParameter("@P_PTOT_ORGN_CODE_OUT", NString.class);
			cmd.addParameter("@P_PTOT_STATUS_OUT", NString.class);
			cmd.addParameter("@P_PTOT_FTE_OUT", NNumber.class);
			cmd.addParameter("@P_PTOT_BUDGET_OUT", NNumber.class);
			cmd.addParameter("@P_PTOT_AVAIL_OUT", NNumber.class);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pFiscCodeOut.val = cmd.getParameterValue("@P_FISC_CODE_OUT", NString.class);
			pFiscBeginDateOut.val = cmd.getParameterValue("@P_FISC_BEGIN_DATE_OUT", NDate.class);
			pFiscEndDateOut.val = cmd.getParameterValue("@P_FISC_END_DATE_OUT", NDate.class);
			pPtotCoasCodeOut.val = cmd.getParameterValue("@P_PTOT_COAS_CODE_OUT", NString.class);
			pPtotOrgnCodeOut.val = cmd.getParameterValue("@P_PTOT_ORGN_CODE_OUT", NString.class);
			pPtotStatusOut.val = cmd.getParameterValue("@P_PTOT_STATUS_OUT", NString.class);
			pPtotFteOut.val = cmd.getParameterValue("@P_PTOT_FTE_OUT", NNumber.class);
			pPtotBudgetOut.val = cmd.getParameterValue("@P_PTOT_BUDGET_OUT", NNumber.class);
			pPtotAvailOut.val = cmd.getParameterValue("@P_PTOT_AVAIL_OUT", NNumber.class);
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pValidateBeginDateVsFisc(NDate pBeginDate,NString pCoasCode,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKBJOB.P_VALIDATE_BEGIN_DATE_VS_FISC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_BEGIN_DATE", pBeginDate);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pValidateBeginDateVsLoa(NDate pBeginDate,NDate pLoaBeginDate,NDate pLoaEndDate,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKBJOB.P_VALIDATE_BEGIN_DATE_VS_LOA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_BEGIN_DATE", pBeginDate);
			cmd.addParameter("@P_LOA_BEGIN_DATE", pLoaBeginDate);
			cmd.addParameter("@P_LOA_END_DATE", pLoaEndDate);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pValidateBeginDateVsPosn(NDate pBeginDate,NDate pPosnBeginDate,NDate pPosnEndDate,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKBJOB.P_VALIDATE_BEGIN_DATE_VS_POSN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_BEGIN_DATE", pBeginDate);
			cmd.addParameter("@P_POSN_BEGIN_DATE", pPosnBeginDate);
			cmd.addParameter("@P_POSN_END_DATE", pPosnEndDate);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pValidateBeginDateVsTerm(NDate pBeginDate,NDate pEmplTermDate,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKBJOB.P_VALIDATE_BEGIN_DATE_VS_TERM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_BEGIN_DATE", pBeginDate);
			cmd.addParameter("@P_EMPL_TERM_DATE", pEmplTermDate);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pValidateContractBeginDate(NDate pContractBeginDate,NDate pPosnBeginDate,NDate pPosnEndDate,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKBJOB.P_VALIDATE_CONTRACT_BEGIN_DATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CONTRACT_BEGIN_DATE", pContractBeginDate);
			cmd.addParameter("@P_POSN_BEGIN_DATE", pPosnBeginDate);
			cmd.addParameter("@P_POSN_END_DATE", pPosnEndDate);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pValidateContractEndDate(NDate pContractEndDate,NDate pPosnBeginDate,NDate pPosnEndDate,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKBJOB.P_VALIDATE_CONTRACT_END_DATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CONTRACT_END_DATE", pContractEndDate);
			cmd.addParameter("@P_POSN_BEGIN_DATE", pPosnBeginDate);
			cmd.addParameter("@P_POSN_END_DATE", pPosnEndDate);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pValidateEndDate(NNumber pPidm,NString pPosn,NString pSuff,NDate pEndDate,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKBJOB.P_VALIDATE_END_DATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pValidateFaclStatscanInd(NString pFaclStatscanInd,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKBJOB.P_VALIDATE_FACL_STATSCAN_IND", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FACL_STATSCAN_IND", pFaclStatscanInd);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pValidateStepIncrDay(NString pStepIncrDay,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKBJOB.P_VALIDATE_STEP_INCR_DAY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_STEP_INCR_DAY", pStepIncrDay);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pValidateStepIncrMon(NString pStepIncrMon,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKBJOB.P_VALIDATE_STEP_INCR_MON", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_STEP_INCR_MON", pStepIncrMon);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
	
	
	
}
