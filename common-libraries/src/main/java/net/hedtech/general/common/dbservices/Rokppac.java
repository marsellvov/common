package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Rokppac {
		public static void pCheckPhrhist(NString yearIn,NString pictCode,NNumber payno,Ref<NNumber> holdPhrhistCountOut,Ref<NNumber> holdPhrhistDispCountOut,Ref<NString> displayPayDispIndOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPPAC.P_CHECK_PHRHIST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@YEAR_IN", yearIn);
			cmd.addParameter("@PICT_CODE", pictCode);
			cmd.addParameter("@PAYNO", payno);
			cmd.addParameter("@HOLD_PHRHIST_COUNT_OUT", holdPhrhistCountOut, true);
			cmd.addParameter("@HOLD_PHRHIST_DISP_COUNT_OUT", holdPhrhistDispCountOut, true);
			cmd.addParameter("@DISPLAY_PAY_DISP_IND_OUT", displayPayDispIndOut, true);
				
			cmd.execute();
			holdPhrhistCountOut.val = cmd.getParameterValue("@HOLD_PHRHIST_COUNT_OUT", NNumber.class);
			holdPhrhistDispCountOut.val = cmd.getParameterValue("@HOLD_PHRHIST_DISP_COUNT_OUT", NNumber.class);
			displayPayDispIndOut.val = cmd.getParameterValue("@DISPLAY_PAY_DISP_IND_OUT", NString.class);


		}
		
		public static void pCheckPtrcaln(NString yearIn,NString pictCode,NNumber payno,Ref<NDate> displayPayStartYearOut,Ref<NDate> displayPayEndYearOut,Ref<NDate> displayPayCheckDateOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPPAC.P_CHECK_PTRCALN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@YEAR_IN", yearIn);
			cmd.addParameter("@PICT_CODE", pictCode);
			cmd.addParameter("@PAYNO", payno);
			cmd.addParameter("@DISPLAY_PAY_START_YEAR_OUT", displayPayStartYearOut, true);
			cmd.addParameter("@DISPLAY_PAY_END_YEAR_OUT", displayPayEndYearOut, true);
			cmd.addParameter("@DISPLAY_PAY_CHECK_DATE_OUT", displayPayCheckDateOut, true);
				
			cmd.execute();
			displayPayStartYearOut.val = cmd.getParameterValue("@DISPLAY_PAY_START_YEAR_OUT", NDate.class);
			displayPayEndYearOut.val = cmd.getParameterValue("@DISPLAY_PAY_END_YEAR_OUT", NDate.class);
			displayPayCheckDateOut.val = cmd.getParameterValue("@DISPLAY_PAY_CHECK_DATE_OUT", NDate.class);


		}
		
		public static void pGetCoasDesc(NString coasCode,Ref<NString> displayCoasDescOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPPAC.P_GET_COAS_DESC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@COAS_CODE", coasCode);
			cmd.addParameter("@DISPLAY_COAS_DESC_OUT", displayCoasDescOut, true);
				
			cmd.execute();
			displayCoasDescOut.val = cmd.getParameterValue("@DISPLAY_COAS_DESC_OUT", NString.class);


		}
		
		public static void pGetEclsDesc(NString eclsCode,Ref<NString> shortDescOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPPAC.P_GET_ECLS_DESC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ECLS_CODE", eclsCode);
			cmd.addParameter("@SHORT_DESC_OUT", shortDescOut, true);
				
			cmd.execute();
			shortDescOut.val = cmd.getParameterValue("@SHORT_DESC_OUT", NString.class);


		}
		
		public static void pGetNbbposnVal(NString posnCode,Ref<NString> posnTitleOut,Ref<NString> eclsCodeOut,Ref<NString> coasCodeOut,Ref<NString> valErrInd,Ref<NString> valErrMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPPAC.P_GET_NBBPOSN_VAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@POSN_CODE", posnCode);
			cmd.addParameter("@POSN_TITLE_OUT", posnTitleOut, true);
			cmd.addParameter("@ECLS_CODE_OUT", eclsCodeOut, true);
			cmd.addParameter("@COAS_CODE_OUT", coasCodeOut, true);
			cmd.addParameter("@VAL_ERR_IND", NString.class);
			cmd.addParameter("@VAL_ERR_MSG", NString.class);
				
			cmd.execute();
			posnTitleOut.val = cmd.getParameterValue("@POSN_TITLE_OUT", NString.class);
			eclsCodeOut.val = cmd.getParameterValue("@ECLS_CODE_OUT", NString.class);
			coasCodeOut.val = cmd.getParameterValue("@COAS_CODE_OUT", NString.class);
			valErrInd.val = cmd.getParameterValue("@VAL_ERR_IND", NString.class);
			valErrMsg.val = cmd.getParameterValue("@VAL_ERR_MSG", NString.class);


		}
		
		public static void pGetOrgnTitle(NString orgnCode,NString coasCode,Ref<NString> orgnDescOut,Ref<NString> valErrInd,Ref<NString> valErrMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPPAC.P_GET_ORGN_TITLE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ORGN_CODE", orgnCode);
			cmd.addParameter("@COAS_CODE", coasCode);
			cmd.addParameter("@ORGN_DESC_OUT", orgnDescOut, true);
			cmd.addParameter("@VAL_ERR_IND", NString.class);
			cmd.addParameter("@VAL_ERR_MSG", NString.class);
				
			cmd.execute();
			orgnDescOut.val = cmd.getParameterValue("@ORGN_DESC_OUT", NString.class);
			valErrInd.val = cmd.getParameterValue("@VAL_ERR_IND", NString.class);
			valErrMsg.val = cmd.getParameterValue("@VAL_ERR_MSG", NString.class);


		}
		
		public static void pPayrollInterface(NNumber pidm,Ref<NString> pebemplI9FormIndOut,Ref<NDate> pebemplI9DateOut,Ref<NDate> pebemplI9ExpireDateOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPPAC.P_PAYROLL_INTERFACE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@PEBEMPL_I9_FORM_IND_OUT", pebemplI9FormIndOut, true);
			cmd.addParameter("@PEBEMPL_I9_DATE_OUT", pebemplI9DateOut, true);
			cmd.addParameter("@PEBEMPL_I9_EXPIRE_DATE_OUT", pebemplI9ExpireDateOut, true);
				
			cmd.execute();
			pebemplI9FormIndOut.val = cmd.getParameterValue("@PEBEMPL_I9_FORM_IND_OUT", NString.class);
			pebemplI9DateOut.val = cmd.getParameterValue("@PEBEMPL_I9_DATE_OUT", NDate.class);
			pebemplI9ExpireDateOut.val = cmd.getParameterValue("@PEBEMPL_I9_EXPIRE_DATE_OUT", NDate.class);


		}
		
	
	
	
}
