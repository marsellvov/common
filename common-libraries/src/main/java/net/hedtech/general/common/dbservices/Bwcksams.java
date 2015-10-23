package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwcksams {
		public static NString fCheckcappcrn(NNumber pidmIn,NString term,NString crn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSAMS.F_CHECKCAPPCRN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@CRN", crn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool fRegsstu(NNumber pidmIn,NString term,NString procName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSAMS.F_REGSSTU", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@PROC_NAME", procName);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fValidregdate(NString term,NString rsts,NString ptrm,NDate regsDate,NString errMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSAMS.F_VALIDREGDATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@RSTS", rsts);
			cmd.addParameter("@PTRM", ptrm);
			cmd.addParameter("@REGS_DATE", regsDate);
			cmd.addParameter("@ERR_MSG", errMsg);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
//		public static void pDispchgcrseopt(NString term,List<OwaUtil.IdentArrRow> crnIn,List<OwaUtil.IdentArrRow> credIn,List<OwaUtil.IdentArrRow> gmodIn,List<OwaUtil.IdentArrRow> levlIn,List<OwaUtil.IdentArrRow> errCode,List<Twbklibs.ErrorMsgTabtypeRow> errMsg,NBool firstPass,NString cappTechError,List<OwaUtil.IdentArrRow> spathIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSAMS.P_DISPCHGCRSEOPT", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@TERM", term);
//			// cmd.addParameter(DbTypes.getTableType("CRN_IN", "", crnIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("CRED_IN", "", credIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("GMOD_IN", "", gmodIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("LEVL_IN", "", levlIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("ERR_CODE", "", errCode, object.class));
//			// cmd.addParameter(DbTypes.getTableType("ERR_MSG", "", errMsg, object.class));
//			cmd.addParameter("@FIRST_PASS", firstPass);
//			cmd.addParameter("@CAPP_TECH_ERROR", cappTechError);
//			// cmd.addParameter(DbTypes.getTableType("SPATH_IN", "", spathIn, object.class));
//				
//			cmd.execute();
//
//
//		}
		
		public static void pDispchgcrseopt2(NString term) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSAMS.P_DISPCHGCRSEOPT2", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM", term);
				
			cmd.execute();


		}
		
		public static void pImmediateFeeAssess(NString term,NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSAMS.P_IMMEDIATE_FEE_ASSESS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();


		}
		
//		public static void pRegsresult(List<OwaUtil.IdentArrRow> termIn,Ref<NNumber> errsCount,Ref<NNumber> regsCount,Ref<NNumber> waitCount,NBool firstPass,Ref<NBool> regAccessAllowedOut,Ref<NString> cappTechErrorInOut,NString dropResultLabelIn,List<Sfkcurs.DropProblemsRecTabtypeRow> dropProblemsIn,List<Sfkcurs.DropProblemsRecTabtypeRow> dropFailuresIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSAMS.P_REGSRESULT", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("TERM_IN", "", termIn, object.class));
//			cmd.addParameter("@ERRS_COUNT", errsCount, true);
//			cmd.addParameter("@REGS_COUNT", regsCount, true);
//			cmd.addParameter("@WAIT_COUNT", waitCount, true);
//			cmd.addParameter("@FIRST_PASS", firstPass);
//			cmd.addParameter("@REG_ACCESS_ALLOWED_OUT", NBool.class);
//			cmd.addParameter("@CAPP_TECH_ERROR_IN_OUT", cappTechErrorInOut, true);
//			cmd.addParameter("@DROP_RESULT_LABEL_IN", dropResultLabelIn);
//			// cmd.addParameter(DbTypes.getTableType("DROP_PROBLEMS_IN", "", dropProblemsIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("DROP_FAILURES_IN", "", dropFailuresIn, object.class));
//				
//			cmd.execute();
//			errsCount.val = cmd.getParameterValue("@ERRS_COUNT", NNumber.class);
//			regsCount.val = cmd.getParameterValue("@REGS_COUNT", NNumber.class);
//			waitCount.val = cmd.getParameterValue("@WAIT_COUNT", NNumber.class);
//			regAccessAllowedOut.val = cmd.getParameterValue("@REG_ACCESS_ALLOWED_OUT", NBool.class);
//			cappTechErrorInOut.val = cmd.getParameterValue("@CAPP_TECH_ERROR_IN_OUT", NString.class);
//
//
//		}
		
	
	
	
}
