package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Phkfmla {
		public static NString fDurationTypeDesc(NString pCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKFMLA.F_DURATION_TYPE_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CODE", pCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fFtPtTypeDesc(NString pCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKFMLA.F_FT_PT_TYPE_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CODE", pCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fPercfmlExists(NNumber pId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKFMLA.F_PERCFML_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ID", pId);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fUnitTypeDesc(NString pCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKFMLA.F_UNIT_TYPE_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CODE", pCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pGetCalendarYear(NDate pStartDate,Ref<NString> pYearOut,Ref<NDate> pFmlaStartDateOut,Ref<NDate> pFmlaEndDateOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKFMLA.P_GET_CALENDAR_YEAR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_START_DATE", pStartDate);
			cmd.addParameter("@P_YEAR_OUT", NString.class);
			cmd.addParameter("@P_FMLA_START_DATE_OUT", NDate.class);
			cmd.addParameter("@P_FMLA_END_DATE_OUT", NDate.class);
				
			cmd.execute();
			pYearOut.val = cmd.getParameterValue("@P_YEAR_OUT", NString.class);
			pFmlaStartDateOut.val = cmd.getParameterValue("@P_FMLA_START_DATE_OUT", NDate.class);
			pFmlaEndDateOut.val = cmd.getParameterValue("@P_FMLA_END_DATE_OUT", NDate.class);


		}
		
		public static void pGetFiscalYear(NDate pStartDate,Ref<NString> pYearOut,Ref<NDate> pFmlaStartDateOut,Ref<NDate> pFmlaEndDateOut,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKFMLA.P_GET_FISCAL_YEAR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_START_DATE", pStartDate);
			cmd.addParameter("@P_YEAR_OUT", NString.class);
			cmd.addParameter("@P_FMLA_START_DATE_OUT", NDate.class);
			cmd.addParameter("@P_FMLA_END_DATE_OUT", NDate.class);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pYearOut.val = cmd.getParameterValue("@P_YEAR_OUT", NString.class);
			pFmlaStartDateOut.val = cmd.getParameterValue("@P_FMLA_START_DATE_OUT", NDate.class);
			pFmlaEndDateOut.val = cmd.getParameterValue("@P_FMLA_END_DATE_OUT", NDate.class);
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pGetInstitutionYear(NNumber pInstYearMonth,NNumber pInstYearDays,NDate pStartDate,Ref<NString> pYearOut,Ref<NDate> pFmlaStartDateOut,Ref<NDate> pFmlaEndDateOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKFMLA.P_GET_INSTITUTION_YEAR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_INST_YEAR_MONTH", pInstYearMonth);
			cmd.addParameter("@P_INST_YEAR_DAYS", pInstYearDays);
			cmd.addParameter("@P_START_DATE", pStartDate);
			cmd.addParameter("@P_YEAR_OUT", NString.class);
			cmd.addParameter("@P_FMLA_START_DATE_OUT", NDate.class);
			cmd.addParameter("@P_FMLA_END_DATE_OUT", NDate.class);
				
			cmd.execute();
			pYearOut.val = cmd.getParameterValue("@P_YEAR_OUT", NString.class);
			pFmlaStartDateOut.val = cmd.getParameterValue("@P_FMLA_START_DATE_OUT", NDate.class);
			pFmlaEndDateOut.val = cmd.getParameterValue("@P_FMLA_END_DATE_OUT", NDate.class);


		}
		
		public static void pGetQualifyingYear(NNumber pPidm,NDate pMinStartDate,NDate pStartDate,Ref<NString> pYearOut,Ref<NDate> pFmlaStartDateOut,Ref<NDate> pFmlaEndDateOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKFMLA.P_GET_QUALIFYING_YEAR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_MIN_START_DATE", pMinStartDate);
			cmd.addParameter("@P_START_DATE", pStartDate);
			cmd.addParameter("@P_YEAR_OUT", NString.class);
			cmd.addParameter("@P_FMLA_START_DATE_OUT", NDate.class);
			cmd.addParameter("@P_FMLA_END_DATE_OUT", NDate.class);
				
			cmd.execute();
			pYearOut.val = cmd.getParameterValue("@P_YEAR_OUT", NString.class);
			pFmlaStartDateOut.val = cmd.getParameterValue("@P_FMLA_START_DATE_OUT", NDate.class);
			pFmlaEndDateOut.val = cmd.getParameterValue("@P_FMLA_END_DATE_OUT", NDate.class);


		}
		
		public static void pGetRollingBackwardYear(NDate pEfmlEarnBeginDate,NDate pEfmlEarnEndDate,Ref<NString> pYearOut,Ref<NDate> pFmlaStartDateOut,Ref<NDate> pFmlaEndDateOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKFMLA.P_GET_ROLLING_BACKWARD_YEAR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EFML_EARN_BEGIN_DATE", pEfmlEarnBeginDate);
			cmd.addParameter("@P_EFML_EARN_END_DATE", pEfmlEarnEndDate);
			cmd.addParameter("@P_YEAR_OUT", NString.class);
			cmd.addParameter("@P_FMLA_START_DATE_OUT", NDate.class);
			cmd.addParameter("@P_FMLA_END_DATE_OUT", NDate.class);
				
			cmd.execute();
			pYearOut.val = cmd.getParameterValue("@P_YEAR_OUT", NString.class);
			pFmlaStartDateOut.val = cmd.getParameterValue("@P_FMLA_START_DATE_OUT", NDate.class);
			pFmlaEndDateOut.val = cmd.getParameterValue("@P_FMLA_END_DATE_OUT", NDate.class);


		}
		
		public static void pGetServiceYear(NNumber pPidm,NString pInstServiceYearType,NDate pStartDate,Ref<NString> pYearOut,Ref<NDate> pFmlaStartDateOut,Ref<NDate> pFmlaEndDateOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKFMLA.P_GET_SERVICE_YEAR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_INST_SERVICE_YEAR_TYPE", pInstServiceYearType);
			cmd.addParameter("@P_START_DATE", pStartDate);
			cmd.addParameter("@P_YEAR_OUT", NString.class);
			cmd.addParameter("@P_FMLA_START_DATE_OUT", NDate.class);
			cmd.addParameter("@P_FMLA_END_DATE_OUT", NDate.class);
				
			cmd.execute();
			pYearOut.val = cmd.getParameterValue("@P_YEAR_OUT", NString.class);
			pFmlaStartDateOut.val = cmd.getParameterValue("@P_FMLA_START_DATE_OUT", NDate.class);
			pFmlaEndDateOut.val = cmd.getParameterValue("@P_FMLA_END_DATE_OUT", NDate.class);


		}
		
		public static void pImportPayrollHistory(NNumber pPidm,NString pFmlaYearInd,NNumber pPerfmlaId,NDate pFmlaBeginDate,NDate pFmlaEndDate,NString pUserId,NString pDataOrigin,Ref<NInteger> pRecordCountOut,Ref<NString> pErrorMsgOut,Ref<NString> pWarningMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKFMLA.P_IMPORT_PAYROLL_HISTORY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FMLA_YEAR_IND", pFmlaYearInd);
			cmd.addParameter("@P_PERFMLA_ID", pPerfmlaId);
			cmd.addParameter("@P_FMLA_BEGIN_DATE", pFmlaBeginDate);
			cmd.addParameter("@P_FMLA_END_DATE", pFmlaEndDate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_RECORD_COUNT_OUT", NInteger.class);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
			cmd.addParameter("@P_WARNING_MSG_OUT", NString.class);
				
			cmd.execute();
			pRecordCountOut.val = cmd.getParameterValue("@P_RECORD_COUNT_OUT", NInteger.class);
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);
			pWarningMsgOut.val = cmd.getParameterValue("@P_WARNING_MSG_OUT", NString.class);


		}
		
	
	
	
}
