package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Phkcaln {
		public static NNumber fCheckIssuedDays(NString pPictCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKCALN.F_CHECK_ISSUED_DAYS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fExists(NString pPictCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKCALN.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fPayOfMonthInd(NString pFinanceDateInd,NDate pCheckDate,NDate pLastCheckDate,NDate pEndDate,NDate pLastEndDate,NNumber pLastPayOfMonthInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKCALN.F_PAY_OF_MONTH_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_FINANCE_DATE_IND", pFinanceDateInd);
			cmd.addParameter("@P_CHECK_DATE", pCheckDate);
			cmd.addParameter("@P_LAST_CHECK_DATE", pLastCheckDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_LAST_END_DATE", pLastEndDate);
			cmd.addParameter("@P_LAST_PAY_OF_MONTH_IND", pLastPayOfMonthInd);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fString(NString pErrorname,NString pValue01,NString pValue02,NString pValue03,NString pValue04) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKCALN.F_STRING", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ERRORNAME", pErrorname);
			cmd.addParameter("@P_VALUE_01", pValue01);
			cmd.addParameter("@P_VALUE_02", pValue02);
			cmd.addParameter("@P_VALUE_03", pValue03);
			cmd.addParameter("@P_VALUE_04", pValue04);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pCreatePpCalendar(NString pYear,NString pPictCode,NNumber pStartPayno,NDate pStartDate,NDate pEndDate,NInteger pStartDay2,Ref<NString> pErrorOut,Ref<NString> pWarningOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKCALN.P_CREATE_PP_CALENDAR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
			cmd.addParameter("@P_START_PAYNO", pStartPayno);
			cmd.addParameter("@P_START_DATE", pStartDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_START_DAY_2", pStartDay2);
			cmd.addParameter("@P_ERROR_OUT", NString.class, pErrorOut.val, true);
			cmd.addParameter("@P_WARNING_OUT", NString.class, pWarningOut.val, true);
				
			cmd.execute();
			pErrorOut.val = cmd.getParameterValue("@P_ERROR_OUT", NString.class);
			pWarningOut.val = cmd.getParameterValue("@P_WARNING_OUT", NString.class);


		}
		
		public static void pEditYear(NString pYear,Ref<NString> pErrorOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKCALN.P_EDIT_YEAR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_ERROR_OUT", NString.class, pErrorOut.val, true);
				
			cmd.execute();
			pErrorOut.val = cmd.getParameterValue("@P_ERROR_OUT", NString.class);


		}
		
		public static void pGetNextPpInfo(NString pPictCode,NNumber pPaysPerYear,Ref<NString> pYearOut,Ref<NNumber> pPaynoOut,Ref<NDate> pStartDateOut,Ref<NDate> pEndDateOut,Ref<NInteger> pStartDay2Out) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKCALN.P_GET_NEXT_PP_INFO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PICT_CODE", pPictCode);
			cmd.addParameter("@P_PAYS_PER_YEAR", pPaysPerYear);
			cmd.addParameter("@P_YEAR_OUT", NString.class, pYearOut.val, true);
			cmd.addParameter("@P_PAYNO_OUT", NNumber.class, pPaynoOut.val, true);
			cmd.addParameter("@P_START_DATE_OUT", NDate.class, pStartDateOut.val, true);
			cmd.addParameter("@P_END_DATE_OUT", NDate.class, pEndDateOut.val, true);
			cmd.addParameter("@P_START_DAY_2_OUT", NInteger.class, pStartDay2Out.val, true);
				
			cmd.execute();
			pYearOut.val = cmd.getParameterValue("@P_YEAR_OUT", NString.class);
			pPaynoOut.val = cmd.getParameterValue("@P_PAYNO_OUT", NNumber.class);
			pStartDateOut.val = cmd.getParameterValue("@P_START_DATE_OUT", NDate.class);
			pEndDateOut.val = cmd.getParameterValue("@P_END_DATE_OUT", NDate.class);
			pStartDay2Out.val = cmd.getParameterValue("@P_START_DAY_2_OUT", NInteger.class);


		}
		
	
	
	
}
