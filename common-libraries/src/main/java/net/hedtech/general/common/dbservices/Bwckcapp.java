package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwckcapp {
		public static NBool fDisplayMajorTable(NString param1,NString param2,NString param3,NString param4,NString param5) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCAPP.F_DISPLAY_MAJOR_TABLE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PARAM1", param1);
			cmd.addParameter("@PARAM2", param2);
			cmd.addParameter("@PARAM3", param3);
			cmd.addParameter("@PARAM4", param4);
			cmd.addParameter("@PARAM5", param5);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fDisplayMinorTable(NString param1,NString param2) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCAPP.F_DISPLAY_MINOR_TABLE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PARAM1", param1);
			cmd.addParameter("@PARAM2", param2);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NString fGetMtchCurricHeir(NNumber param1,NBool stuX,NBool hisX,NBool recX,NBool admX) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCAPP.F_GET_MTCH_CURRIC_HEIR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PARAM1", param1);
			cmd.addParameter("@STU_X", stuX);
			cmd.addParameter("@HIS_X", hisX);
			cmd.addParameter("@REC_X", recX);
			cmd.addParameter("@ADM_X", admX);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fGetadvrpidm(NNumber pidm,NString term) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCAPP.F_GETADVRPIDM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@TERM", term);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fGetemailaddress(NNumber pidmIn,NString emailCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCAPP.F_GETEMAILADDRESS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@EMAIL_CODE_IN", emailCodeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetemailnamestr(NNumber pidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCAPP.F_GETEMAILNAMESTR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM", pidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fGetmaxreqnocomplete(NNumber pidm,NString program,NString source1) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCAPP.F_GETMAXREQNOCOMPLETE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@PROGRAM", program);
			cmd.addParameter("@SOURCE1", source1);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NBool fGtvsdaxWebcurrExist(NNumber param1) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCAPP.F_GTVSDAX_WEBCURR_EXIST", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PARAM1", param1);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fProgWebInd(NString param1) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCAPP.F_PROG_WEB_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PARAM1", param1);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NString fSmbdfltIpCrseInd() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCAPP.F_SMBDFLT_IP_CRSE_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool fSmbwcrlIpOvrdFlg(NString param1) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCAPP.F_SMBWCRL_IP_OVRD_FLG", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PARAM1", param1);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fTestSaradapExist(NNumber pPidmIn,NString pTermIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCAPP.F_TEST_SARADAP_EXIST", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_PIDM_IN", pPidmIn);
			cmd.addParameter("@P_TERM_IN", pTermIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fTestSgbstdnExist(NNumber pPidmIn,NString pTermIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCAPP.F_TEST_SGBSTDN_EXIST", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_PIDM_IN", pPidmIn);
			cmd.addParameter("@P_TERM_IN", pTermIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fTestShrdgmrExist(NNumber pPidmIn,NString pTermIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCAPP.F_TEST_SHRDGMR_EXIST", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_PIDM_IN", pPidmIn);
			cmd.addParameter("@P_TERM_IN", pTermIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fTestSrbrecrExist(NNumber pPidmIn,NString pTermIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCAPP.F_TEST_SRBRECR_EXIST", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_PIDM_IN", pPidmIn);
			cmd.addParameter("@P_TERM_IN", pTermIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NString FgetCampDesc(NString param1) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCAPP.GET_CAMP_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PARAM1", param1);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetCollDesc(NString param1) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCAPP.GET_COLL_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PARAM1", param1);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetDegcDesc(NString param1) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCAPP.GET_DEGC_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PARAM1", param1);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetDeptDesc(NString param1) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCAPP.GET_DEPT_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PARAM1", param1);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetLevlDesc(NString param1) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCAPP.GET_LEVL_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PARAM1", param1);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetMajrDesc(NString param1) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCAPP.GET_MAJR_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PARAM1", param1);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetProgramDesc(NString param1) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCAPP.GET_PROGRAM_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PARAM1", param1);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetTermDesc(NString param1) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCAPP.GET_TERM_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PARAM1", param1);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pDispcurrent(NString termIn,NString callingProc) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCAPP.P_DISPCURRENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CALLING_PROC", callingProc);
				
			cmd.execute();


		}
		
		public static void pDispcurrentMajor1Format(NString majr1In,NString conc1In,NString dept1In,NString conc2In,NString conc3In) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCAPP.P_DISPCURRENT_MAJOR1_FORMAT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MAJR1_IN", majr1In);
			cmd.addParameter("@CONC1_IN", conc1In);
			cmd.addParameter("@DEPT1_IN", dept1In);
			cmd.addParameter("@CONC2_IN", conc2In);
			cmd.addParameter("@CONC3_IN", conc3In);
				
			cmd.execute();


		}
		
		public static void pDispcurrentMajor2Format(NString majr2In,NString conc1In,NString dept2In,NString conc2In,NString conc3In) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCAPP.P_DISPCURRENT_MAJOR2_FORMAT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MAJR2_IN", majr2In);
			cmd.addParameter("@CONC1_IN", conc1In);
			cmd.addParameter("@DEPT2_IN", dept2In);
			cmd.addParameter("@CONC2_IN", conc2In);
			cmd.addParameter("@CONC3_IN", conc3In);
				
			cmd.execute();


		}
		
		public static void pDispcurrentMinorFormat(NString minr1In,NString minr2In) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCAPP.P_DISPCURRENT_MINOR_FORMAT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MINR1_IN", minr1In);
			cmd.addParameter("@MINR2_IN", minr2In);
				
			cmd.execute();


		}
		
		public static void pDispcurrentTable(NString labelIn,NString progIn,NNumber reqnoIn,NString termIn,NString levlIn,NString campIn,NString collIn,NString degcIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCAPP.P_DISPCURRENT_TABLE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@LABEL_IN", labelIn);
			cmd.addParameter("@PROG_IN", progIn);
			cmd.addParameter("@REQNO_IN", reqnoIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@LEVL_IN", levlIn);
			cmd.addParameter("@CAMP_IN", campIn);
			cmd.addParameter("@COLL_IN", collIn);
			cmd.addParameter("@DEGC_IN", degcIn);
				
			cmd.execute();


		}
		
		public static void pDispcursourcesaradap(NNumber pidm,NString source1,NBool dispSecd,NString pTermIn,Ref<NString> term) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCAPP.P_DISPCURSOURCESARADAP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@SOURCE1", source1);
			cmd.addParameter("@DISP_SECD", dispSecd);
			cmd.addParameter("@P_TERM_IN", pTermIn);
			cmd.addParameter("@TERM", NString.class);
				
			cmd.execute();
			term.val = cmd.getParameterValue("@TERM", NString.class);


		}
		
		public static void pDispcursourcesgbstdn(NNumber pidm,NString source1,NBool dispSecd,NString pTermIn,Ref<NString> term) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCAPP.P_DISPCURSOURCESGBSTDN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@SOURCE1", source1);
			cmd.addParameter("@DISP_SECD", dispSecd);
			cmd.addParameter("@P_TERM_IN", pTermIn);
			cmd.addParameter("@TERM", NString.class);
				
			cmd.execute();
			term.val = cmd.getParameterValue("@TERM", NString.class);


		}
		
		public static void pDispcursourceshrdgmr(NNumber pidm,NString source1,NBool dispSecd,NString pTermIn,Ref<NString> term) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCAPP.P_DISPCURSOURCESHRDGMR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@SOURCE1", source1);
			cmd.addParameter("@DISP_SECD", dispSecd);
			cmd.addParameter("@P_TERM_IN", pTermIn);
			cmd.addParameter("@TERM", NString.class);
				
			cmd.execute();
			term.val = cmd.getParameterValue("@TERM", NString.class);


		}
		
		public static void pDispcursourcesrbrecr(NNumber pidm,NString source1,NBool dispSecd,NString pTermIn,Ref<NString> term) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCAPP.P_DISPCURSOURCESRBRECR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@SOURCE1", source1);
			cmd.addParameter("@DISP_SECD", dispSecd);
			cmd.addParameter("@P_TERM_IN", pTermIn);
			cmd.addParameter("@TERM", NString.class);
				
			cmd.execute();
			term.val = cmd.getParameterValue("@TERM", NString.class);


		}
		
		public static void pDispevalterm(NNumber sfStatus,NString termIn,NString pinNumb,NString msg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCAPP.P_DISPEVALTERM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SF_STATUS", sfStatus);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIN_NUMB", pinNumb);
			cmd.addParameter("@MSG", msg);
				
			cmd.execute();


		}
		
		public static void pDispevalviewoption(NNumber requestNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCAPP.P_DISPEVALVIEWOPTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@REQUEST_NO", requestNo);
				
			cmd.execute();


		}
		
		public static void pDisptermsourcesaradap(NNumber pidm,NString source1,NBool dispSecd,NString pTermIn,Ref<NNumber> pCount) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCAPP.P_DISPTERMSOURCESARADAP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@SOURCE1", source1);
			cmd.addParameter("@DISP_SECD", dispSecd);
			cmd.addParameter("@P_TERM_IN", pTermIn);
			cmd.addParameter("@P_COUNT", NNumber.class);
				
			cmd.execute();
			pCount.val = cmd.getParameterValue("@P_COUNT", NNumber.class);


		}
		
		public static void pDisptermsourcesgbstdn(NNumber pidm,NString source1,NBool dispSecd,NString pTermIn,Ref<NNumber> pCount) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCAPP.P_DISPTERMSOURCESGBSTDN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@SOURCE1", source1);
			cmd.addParameter("@DISP_SECD", dispSecd);
			cmd.addParameter("@P_TERM_IN", pTermIn);
			cmd.addParameter("@P_COUNT", NNumber.class);
				
			cmd.execute();
			pCount.val = cmd.getParameterValue("@P_COUNT", NNumber.class);


		}
		
		public static void pDisptermsourceshrdgmr(NNumber pidm,NString source1,NBool dispSecd,NString pTermIn,Ref<NNumber> pCount) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCAPP.P_DISPTERMSOURCESHRDGMR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@SOURCE1", source1);
			cmd.addParameter("@DISP_SECD", dispSecd);
			cmd.addParameter("@P_TERM_IN", pTermIn);
			cmd.addParameter("@P_COUNT", NNumber.class);
				
			cmd.execute();
			pCount.val = cmd.getParameterValue("@P_COUNT", NNumber.class);


		}
		
		public static void pDisptermsourcesrbrecr(NNumber pidm,NString source1,NBool dispSecd,NString pTermIn,Ref<NNumber> pCount) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCAPP.P_DISPTERMSOURCESRBRECR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@SOURCE1", source1);
			cmd.addParameter("@DISP_SECD", dispSecd);
			cmd.addParameter("@P_TERM_IN", pTermIn);
			cmd.addParameter("@P_COUNT", NNumber.class);
				
			cmd.execute();
			pCount.val = cmd.getParameterValue("@P_COUNT", NNumber.class);


		}
		
		public static void pSeldefterm(NString term,NString callingProcName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCAPP.P_SELDEFTERM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@CALLING_PROC_NAME", callingProcName);
				
			cmd.execute();


		}
		
//		public static void pSubmit(NString source1,NString program,NString ctlgTerm,NString evalTerm,List<SmbdfltIndTabRow> dfltIp) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCAPP.P_SUBMIT", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@SOURCE1", source1);
//			cmd.addParameter("@PROGRAM", program);
//			cmd.addParameter("@CTLG_TERM", ctlgTerm);
//			cmd.addParameter("@EVAL_TERM", evalTerm);
//			// cmd.addParameter(DbTypes.getTableType("DFLT_IP", "", dfltIp, object.class));
//				
//			cmd.execute();
//
//
//		}
		
		public static void pVerifydispevalviewoption(NNumber requestNo,NString programSummary,NString printerFriendly) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCAPP.P_VERIFYDISPEVALVIEWOPTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@REQUEST_NO", requestNo);
			cmd.addParameter("@PROGRAM_SUMMARY", programSummary);
			cmd.addParameter("@PRINTER_FRIENDLY", printerFriendly);
				
			cmd.execute();


		}
		
	
	
	
}
