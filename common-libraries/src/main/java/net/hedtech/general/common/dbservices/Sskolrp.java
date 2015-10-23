package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Sskolrp {
		public static NBool fCheckScheduleLongTitle(NString termIn,NString crnIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SSKOLRP.F_CHECK_SCHEDULE_LONG_TITLE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CRN_IN", crnIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fCheckScheduleSyllabus(NString termIn,NString crnIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SSKOLRP.F_CHECK_SCHEDULE_SYLLABUS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CRN_IN", crnIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fCheckScheduleText(NString termIn,NString crnIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SSKOLRP.F_CHECK_SCHEDULE_TEXT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CRN_IN", crnIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void fRetrieveSsrrsts() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SSKOLRP.F_RETRIEVE_SSRRSTS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pCreateSectionDftRules(NString termIn,NString crnIn,NString insmIn,NString deptIn,NString campIn,NString collIn,NString schdIn,Ref<NNumber> errCode,Ref<NString> errTable) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SSKOLRP.P_CREATE_SECTION_DFT_RULES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@INSM_IN", insmIn);
			cmd.addParameter("@DEPT_IN", deptIn);
			cmd.addParameter("@CAMP_IN", campIn);
			cmd.addParameter("@COLL_IN", collIn);
			cmd.addParameter("@SCHD_IN", schdIn);
			cmd.addParameter("@ERR_CODE", NNumber.class);
			cmd.addParameter("@ERR_TABLE", NString.class);
				
			cmd.execute();
			errCode.val = cmd.getParameterValue("@ERR_CODE", NNumber.class);
			errTable.val = cmd.getParameterValue("@ERR_TABLE", NString.class);


		}
		
		public static void pCreateSsbdfeeDefaultFees(NString termIn,NString crnIn,NString subjIn,NString crseIn,NString insmIn,NString deptIn,NString campIn,NString collIn,NString schdIn,Ref<NString> rowsInsertedOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SSKOLRP.P_CREATE_SSBDFEE_DEFAULT_FEES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@SUBJ_IN", subjIn);
			cmd.addParameter("@CRSE_IN", crseIn);
			cmd.addParameter("@INSM_IN", insmIn);
			cmd.addParameter("@DEPT_IN", deptIn);
			cmd.addParameter("@CAMP_IN", campIn);
			cmd.addParameter("@COLL_IN", collIn);
			cmd.addParameter("@SCHD_IN", schdIn);
			cmd.addParameter("@ROWS_INSERTED_OUT", NString.class);
				
			cmd.execute();
			rowsInsertedOut.val = cmd.getParameterValue("@ROWS_INSERTED_OUT", NString.class);


		}
		
		public static void pInsertSsbfsec(NString termIn,NString crnIn,NString createCrnIn,NString callType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SSKOLRP.P_INSERT_SSBFSEC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@CREATE_CRN_IN", createCrnIn);
			cmd.addParameter("@CALL_TYPE", callType);
				
			cmd.execute();


		}
		
		public static void pInsertSsbssec(NString termIn,NString crnIn,NString createCrnIn,NString callType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SSKOLRP.P_INSERT_SSBSSEC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@CREATE_CRN_IN", createCrnIn);
			cmd.addParameter("@CALL_TYPE", callType);
				
			cmd.execute();


		}
		
		public static void pInsertSsrextn(NString termIn,NString crnIn,NString rstsIn,NNumber extpctIn,NString detlIn,NNumber extfeeIn,NString ftypIn,NString overIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SSKOLRP.P_INSERT_SSREXTN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@RSTS_IN", rstsIn);
			cmd.addParameter("@EXTPCT_IN", extpctIn);
			cmd.addParameter("@DETL_IN", detlIn);
			cmd.addParameter("@EXTFEE_IN", extfeeIn);
			cmd.addParameter("@FTYP_IN", ftypIn);
			cmd.addParameter("@OVER_IN", overIn);
				
			cmd.execute();


		}
		
		public static void pInsertSsrfees(NString termIn,NString crnIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SSKOLRP.P_INSERT_SSRFEES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CRN_IN", crnIn);
				
			cmd.execute();


		}
		
		public static void pInsertSsrrfnd(NString termIn,NString crnIn,NString rstsIn,NNumber refpctIn,NString overIn,NNumber tuipctIn,NNumber feepctIn,NNumber extpctIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SSKOLRP.P_INSERT_SSRRFND", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@RSTS_IN", rstsIn);
			cmd.addParameter("@REFPCT_IN", refpctIn);
			cmd.addParameter("@OVER_IN", overIn);
			cmd.addParameter("@TUIPCT_IN", tuipctIn);
			cmd.addParameter("@FEEPCT_IN", feepctIn);
			cmd.addParameter("@EXTPCT_IN", extpctIn);
				
			cmd.execute();


		}
		
		public static void pInsertSsrrsts(NString termIn,NString crnIn,NString rstsIn,NString effstustatIn,NNumber usagepctfromIn,NNumber usagepcttoIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SSKOLRP.P_INSERT_SSRRSTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@RSTS_IN", rstsIn);
			cmd.addParameter("@EFFSTUSTAT_IN", effstustatIn);
			cmd.addParameter("@USAGEPCTFROM_IN", usagepctfromIn);
			cmd.addParameter("@USAGEPCTTO_IN", usagepcttoIn);
				
			cmd.execute();


		}
		
		public static void pRetrieveSobodteDates(NString termIn,NString insmIn,NString deptIn,NString campIn,NString collIn,NString schdIn,Ref<NDate> regStartDate,Ref<NDate> regEndDate,Ref<NDate> censusDateOne,Ref<NDate> censusDateTwo,Ref<NString> overrideInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SSKOLRP.P_RETRIEVE_SOBODTE_DATES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@INSM_IN", insmIn);
			cmd.addParameter("@DEPT_IN", deptIn);
			cmd.addParameter("@CAMP_IN", campIn);
			cmd.addParameter("@COLL_IN", collIn);
			cmd.addParameter("@SCHD_IN", schdIn);
			cmd.addParameter("@REG_START_DATE", NDate.class);
			cmd.addParameter("@REG_END_DATE", NDate.class);
			cmd.addParameter("@CENSUS_DATE_ONE", NDate.class);
			cmd.addParameter("@CENSUS_DATE_TWO", NDate.class);
			cmd.addParameter("@OVERRIDE_IND", NString.class);
				
			cmd.execute();
			regStartDate.val = cmd.getParameterValue("@REG_START_DATE", NDate.class);
			regEndDate.val = cmd.getParameterValue("@REG_END_DATE", NDate.class);
			censusDateOne.val = cmd.getParameterValue("@CENSUS_DATE_ONE", NDate.class);
			censusDateTwo.val = cmd.getParameterValue("@CENSUS_DATE_TWO", NDate.class);
			overrideInd.val = cmd.getParameterValue("@OVERRIDE_IND", NString.class);


		}
		
		public static void pRetrieveSobodteRule(NString termIn,NString insmIn,NString deptIn,NString campIn,NString collIn,NString schdIn,Ref<NString> insmOut,Ref<NString> deptOut,Ref<NString> campOut,Ref<NString> collOut,Ref<NString> schdOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SSKOLRP.P_RETRIEVE_SOBODTE_RULE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@INSM_IN", insmIn);
			cmd.addParameter("@DEPT_IN", deptIn);
			cmd.addParameter("@CAMP_IN", campIn);
			cmd.addParameter("@COLL_IN", collIn);
			cmd.addParameter("@SCHD_IN", schdIn);
			cmd.addParameter("@INSM_OUT", NString.class);
			cmd.addParameter("@DEPT_OUT", NString.class);
			cmd.addParameter("@CAMP_OUT", NString.class);
			cmd.addParameter("@COLL_OUT", NString.class);
			cmd.addParameter("@SCHD_OUT", NString.class);
				
			cmd.execute();
			insmOut.val = cmd.getParameterValue("@INSM_OUT", NString.class);
			deptOut.val = cmd.getParameterValue("@DEPT_OUT", NString.class);
			campOut.val = cmd.getParameterValue("@CAMP_OUT", NString.class);
			collOut.val = cmd.getParameterValue("@COLL_OUT", NString.class);
			schdOut.val = cmd.getParameterValue("@SCHD_OUT", NString.class);


		}
		
	
	
	
}
