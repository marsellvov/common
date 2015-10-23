package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwckcmpl {
		public static NString fGetWebuser() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCMPL.F_GET_WEBUSER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pChkSmrrqcm(NNumber pidm,NNumber requestNo,Ref<NString> processed) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCMPL.P_CHK_SMRRQCM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@REQUEST_NO", requestNo);
			cmd.addParameter("@PROCESSED", NString.class);
				
			cmd.execute();
			processed.val = cmd.getParameterValue("@PROCESSED", NString.class);


		}
		
		public static void pCurriculum(NNumber pidm,NString pLmodCode,NString primSec,NString pTermIn,NNumber seqNo,Ref<NString> pTerm,Ref<NString> noData) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCMPL.P_CURRICULUM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@P_LMOD_CODE", pLmodCode);
			cmd.addParameter("@PRIM_SEC", primSec);
			cmd.addParameter("@P_TERM_IN", pTermIn);
			cmd.addParameter("@SEQ_NO", seqNo);
			cmd.addParameter("@P_TERM", NString.class);
			cmd.addParameter("@NO_DATA", NString.class);
				
			cmd.execute();
			pTerm.val = cmd.getParameterValue("@P_TERM", NString.class);
			noData.val = cmd.getParameterValue("@NO_DATA", NString.class);


		}
		
		public static void pDelSmrrqcm(NNumber pidm,NNumber requestNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCMPL.P_DEL_SMRRQCM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@REQUEST_NO", requestNo);
				
			cmd.execute();


		}
		
		public static void pDoCapp(NNumber pidm,NNumber origPidm,NString recSource,NString program,NString ctlgTerm,NString evalTerm,NString passDfltIp,Ref<NNumber> requestNo,Ref<NNumber> sfStatus) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCMPL.P_DO_CAPP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@ORIG_PIDM", origPidm);
			cmd.addParameter("@REC_SOURCE", recSource);
			cmd.addParameter("@PROGRAM", program);
			cmd.addParameter("@CTLG_TERM", ctlgTerm);
			cmd.addParameter("@EVAL_TERM", evalTerm);
			cmd.addParameter("@PASS_DFLT_IP", passDfltIp);
			cmd.addParameter("@REQUEST_NO", NNumber.class);
			cmd.addParameter("@SF_STATUS", NNumber.class);
				
			cmd.execute();
			requestNo.val = cmd.getParameterValue("@REQUEST_NO", NNumber.class);
			sfStatus.val = cmd.getParameterValue("@SF_STATUS", NNumber.class);


		}
		
		public static void pDoWhatifCapp(Ref<NNumber> pidmIn,Ref<NNumber> origPidmIn,Ref<NString> termIn,Ref<NString> catlgTermIn,Ref<NString> programIn,Ref<NString> levlIn,Ref<NString> degcIn,Ref<NString> collIn,Ref<NString> campIn,Ref<NNumber> sobcurrRuleIn,Ref<NNumber> sorcmjrRule11In,Ref<NNumber> sorcmjrRule12In,Ref<NNumber> sorcconRule11In,Ref<NNumber> sorcconRule12In,Ref<NNumber> sorcconRule13In,Ref<NNumber> sorcconRule121In,Ref<NNumber> sorcconRule122In,Ref<NNumber> sorcconRule123In,Ref<NNumber> sorcmnrRule11In,Ref<NNumber> sorcmnrRule12In,Ref<NString> majrCode11In,Ref<NString> deptCode11In,Ref<NString> majrCodeConc11In,Ref<NString> majrCodeConc12In,Ref<NString> majrCodeConc13In,Ref<NString> majrCode12In,Ref<NString> deptCode12In,Ref<NString> majrCodeConc121In,Ref<NString> majrCodeConc122In,Ref<NString> majrCodeConc123In,Ref<NString> majrCodeMinr11In,Ref<NString> majrCodeMinr12In,Ref<NString> evalTermIn,Ref<NString> dfltIpIn,Ref<NNumber> sfStatus,Ref<NNumber> requestNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCMPL.P_DO_WHATIF_CAPP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn, true);
			cmd.addParameter("@ORIG_PIDM_IN", origPidmIn, true);
			cmd.addParameter("@TERM_IN", termIn, true);
			cmd.addParameter("@CATLG_TERM_IN", catlgTermIn, true);
			cmd.addParameter("@PROGRAM_IN", programIn, true);
			cmd.addParameter("@LEVL_IN", levlIn, true);
			cmd.addParameter("@DEGC_IN", degcIn, true);
			cmd.addParameter("@COLL_IN", collIn, true);
			cmd.addParameter("@CAMP_IN", campIn, true);
			cmd.addParameter("@SOBCURR_RULE_IN", sobcurrRuleIn, true);
			cmd.addParameter("@SORCMJR_RULE_1_1_IN", sorcmjrRule11In, true);
			cmd.addParameter("@SORCMJR_RULE_1_2_IN", sorcmjrRule12In, true);
			cmd.addParameter("@SORCCON_RULE_1_1_IN", sorcconRule11In, true);
			cmd.addParameter("@SORCCON_RULE_1_2_IN", sorcconRule12In, true);
			cmd.addParameter("@SORCCON_RULE_1_3_IN", sorcconRule13In, true);
			cmd.addParameter("@SORCCON_RULE_121_IN", sorcconRule121In, true);
			cmd.addParameter("@SORCCON_RULE_122_IN", sorcconRule122In, true);
			cmd.addParameter("@SORCCON_RULE_123_IN", sorcconRule123In, true);
			cmd.addParameter("@SORCMNR_RULE_1_1_IN", sorcmnrRule11In, true);
			cmd.addParameter("@SORCMNR_RULE_1_2_IN", sorcmnrRule12In, true);
			cmd.addParameter("@MAJR_CODE_1_1_IN", majrCode11In, true);
			cmd.addParameter("@DEPT_CODE_1_1_IN", deptCode11In, true);
			cmd.addParameter("@MAJR_CODE_CONC_1_1_IN", majrCodeConc11In, true);
			cmd.addParameter("@MAJR_CODE_CONC_1_2_IN", majrCodeConc12In, true);
			cmd.addParameter("@MAJR_CODE_CONC_1_3_IN", majrCodeConc13In, true);
			cmd.addParameter("@MAJR_CODE_1_2_IN", majrCode12In, true);
			cmd.addParameter("@DEPT_CODE_1_2_IN", deptCode12In, true);
			cmd.addParameter("@MAJR_CODE_CONC_121_IN", majrCodeConc121In, true);
			cmd.addParameter("@MAJR_CODE_CONC_122_IN", majrCodeConc122In, true);
			cmd.addParameter("@MAJR_CODE_CONC_123_IN", majrCodeConc123In, true);
			cmd.addParameter("@MAJR_CODE_MINR_1_1_IN", majrCodeMinr11In, true);
			cmd.addParameter("@MAJR_CODE_MINR_1_2_IN", majrCodeMinr12In, true);
			cmd.addParameter("@EVAL_TERM_IN", evalTermIn, true);
			cmd.addParameter("@DFLT_IP_IN", dfltIpIn, true);
			cmd.addParameter("@SF_STATUS", NNumber.class);
			cmd.addParameter("@REQUEST_NO", NNumber.class);
				
			cmd.execute();
			pidmIn.val = cmd.getParameterValue("@PIDM_IN", NNumber.class);
			origPidmIn.val = cmd.getParameterValue("@ORIG_PIDM_IN", NNumber.class);
			termIn.val = cmd.getParameterValue("@TERM_IN", NString.class);
			catlgTermIn.val = cmd.getParameterValue("@CATLG_TERM_IN", NString.class);
			programIn.val = cmd.getParameterValue("@PROGRAM_IN", NString.class);
			levlIn.val = cmd.getParameterValue("@LEVL_IN", NString.class);
			degcIn.val = cmd.getParameterValue("@DEGC_IN", NString.class);
			collIn.val = cmd.getParameterValue("@COLL_IN", NString.class);
			campIn.val = cmd.getParameterValue("@CAMP_IN", NString.class);
			sobcurrRuleIn.val = cmd.getParameterValue("@SOBCURR_RULE_IN", NNumber.class);
			sorcmjrRule11In.val = cmd.getParameterValue("@SORCMJR_RULE_1_1_IN", NNumber.class);
			sorcmjrRule12In.val = cmd.getParameterValue("@SORCMJR_RULE_1_2_IN", NNumber.class);
			sorcconRule11In.val = cmd.getParameterValue("@SORCCON_RULE_1_1_IN", NNumber.class);
			sorcconRule12In.val = cmd.getParameterValue("@SORCCON_RULE_1_2_IN", NNumber.class);
			sorcconRule13In.val = cmd.getParameterValue("@SORCCON_RULE_1_3_IN", NNumber.class);
			sorcconRule121In.val = cmd.getParameterValue("@SORCCON_RULE_121_IN", NNumber.class);
			sorcconRule122In.val = cmd.getParameterValue("@SORCCON_RULE_122_IN", NNumber.class);
			sorcconRule123In.val = cmd.getParameterValue("@SORCCON_RULE_123_IN", NNumber.class);
			sorcmnrRule11In.val = cmd.getParameterValue("@SORCMNR_RULE_1_1_IN", NNumber.class);
			sorcmnrRule12In.val = cmd.getParameterValue("@SORCMNR_RULE_1_2_IN", NNumber.class);
			majrCode11In.val = cmd.getParameterValue("@MAJR_CODE_1_1_IN", NString.class);
			deptCode11In.val = cmd.getParameterValue("@DEPT_CODE_1_1_IN", NString.class);
			majrCodeConc11In.val = cmd.getParameterValue("@MAJR_CODE_CONC_1_1_IN", NString.class);
			majrCodeConc12In.val = cmd.getParameterValue("@MAJR_CODE_CONC_1_2_IN", NString.class);
			majrCodeConc13In.val = cmd.getParameterValue("@MAJR_CODE_CONC_1_3_IN", NString.class);
			majrCode12In.val = cmd.getParameterValue("@MAJR_CODE_1_2_IN", NString.class);
			deptCode12In.val = cmd.getParameterValue("@DEPT_CODE_1_2_IN", NString.class);
			majrCodeConc121In.val = cmd.getParameterValue("@MAJR_CODE_CONC_121_IN", NString.class);
			majrCodeConc122In.val = cmd.getParameterValue("@MAJR_CODE_CONC_122_IN", NString.class);
			majrCodeConc123In.val = cmd.getParameterValue("@MAJR_CODE_CONC_123_IN", NString.class);
			majrCodeMinr11In.val = cmd.getParameterValue("@MAJR_CODE_MINR_1_1_IN", NString.class);
			majrCodeMinr12In.val = cmd.getParameterValue("@MAJR_CODE_MINR_1_2_IN", NString.class);
			evalTermIn.val = cmd.getParameterValue("@EVAL_TERM_IN", NString.class);
			dfltIpIn.val = cmd.getParameterValue("@DFLT_IP_IN", NString.class);
			sfStatus.val = cmd.getParameterValue("@SF_STATUS", NNumber.class);
			requestNo.val = cmd.getParameterValue("@REQUEST_NO", NNumber.class);


		}
		
		public static void pInsertSmrrqcm(NNumber pidm,NNumber origPidm,NString recSource,NString program,NString ctlgTerm,NString evalTerm,NString passDfltIp,Ref<NNumber> requestNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCMPL.P_INSERT_SMRRQCM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@ORIG_PIDM", origPidm);
			cmd.addParameter("@REC_SOURCE", recSource);
			cmd.addParameter("@PROGRAM", program);
			cmd.addParameter("@CTLG_TERM", ctlgTerm);
			cmd.addParameter("@EVAL_TERM", evalTerm);
			cmd.addParameter("@PASS_DFLT_IP", passDfltIp);
			cmd.addParameter("@REQUEST_NO", NNumber.class);
				
			cmd.execute();
			requestNo.val = cmd.getParameterValue("@REQUEST_NO", NNumber.class);


		}
		
		public static void pInsertWhatifSmrrqcm(Ref<NNumber> pidmIn,Ref<NNumber> origPidmIn,Ref<NString> termIn,Ref<NString> catlgTermIn,Ref<NString> programIn,Ref<NString> levlIn,Ref<NString> degcIn,Ref<NString> collIn,Ref<NString> campIn,Ref<NNumber> sobcurrRuleIn,Ref<NNumber> sorcmjrRule11In,Ref<NNumber> sorcmjrRule12In,Ref<NNumber> sorcconRule11In,Ref<NNumber> sorcconRule12In,Ref<NNumber> sorcconRule13In,Ref<NNumber> sorcconRule121In,Ref<NNumber> sorcconRule122In,Ref<NNumber> sorcconRule123In,Ref<NNumber> sorcmnrRule11In,Ref<NNumber> sorcmnrRule12In,Ref<NString> majrCode11In,Ref<NString> deptCode11In,Ref<NString> majrCodeConc11In,Ref<NString> majrCodeConc12In,Ref<NString> majrCodeConc13In,Ref<NString> majrCode12In,Ref<NString> deptCode12In,Ref<NString> majrCodeConc121In,Ref<NString> majrCodeConc122In,Ref<NString> majrCodeConc123In,Ref<NString> majrCodeMinr11In,Ref<NString> majrCodeMinr12In,Ref<NString> evalTermIn,Ref<NString> dfltIpIn,Ref<NNumber> requestNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCMPL.P_INSERT_WHATIF_SMRRQCM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn, true);
			cmd.addParameter("@ORIG_PIDM_IN", origPidmIn, true);
			cmd.addParameter("@TERM_IN", termIn, true);
			cmd.addParameter("@CATLG_TERM_IN", catlgTermIn, true);
			cmd.addParameter("@PROGRAM_IN", programIn, true);
			cmd.addParameter("@LEVL_IN", levlIn, true);
			cmd.addParameter("@DEGC_IN", degcIn, true);
			cmd.addParameter("@COLL_IN", collIn, true);
			cmd.addParameter("@CAMP_IN", campIn, true);
			cmd.addParameter("@SOBCURR_RULE_IN", sobcurrRuleIn, true);
			cmd.addParameter("@SORCMJR_RULE_1_1_IN", sorcmjrRule11In, true);
			cmd.addParameter("@SORCMJR_RULE_1_2_IN", sorcmjrRule12In, true);
			cmd.addParameter("@SORCCON_RULE_1_1_IN", sorcconRule11In, true);
			cmd.addParameter("@SORCCON_RULE_1_2_IN", sorcconRule12In, true);
			cmd.addParameter("@SORCCON_RULE_1_3_IN", sorcconRule13In, true);
			cmd.addParameter("@SORCCON_RULE_121_IN", sorcconRule121In, true);
			cmd.addParameter("@SORCCON_RULE_122_IN", sorcconRule122In, true);
			cmd.addParameter("@SORCCON_RULE_123_IN", sorcconRule123In, true);
			cmd.addParameter("@SORCMNR_RULE_1_1_IN", sorcmnrRule11In, true);
			cmd.addParameter("@SORCMNR_RULE_1_2_IN", sorcmnrRule12In, true);
			cmd.addParameter("@MAJR_CODE_1_1_IN", majrCode11In, true);
			cmd.addParameter("@DEPT_CODE_1_1_IN", deptCode11In, true);
			cmd.addParameter("@MAJR_CODE_CONC_1_1_IN", majrCodeConc11In, true);
			cmd.addParameter("@MAJR_CODE_CONC_1_2_IN", majrCodeConc12In, true);
			cmd.addParameter("@MAJR_CODE_CONC_1_3_IN", majrCodeConc13In, true);
			cmd.addParameter("@MAJR_CODE_1_2_IN", majrCode12In, true);
			cmd.addParameter("@DEPT_CODE_1_2_IN", deptCode12In, true);
			cmd.addParameter("@MAJR_CODE_CONC_121_IN", majrCodeConc121In, true);
			cmd.addParameter("@MAJR_CODE_CONC_122_IN", majrCodeConc122In, true);
			cmd.addParameter("@MAJR_CODE_CONC_123_IN", majrCodeConc123In, true);
			cmd.addParameter("@MAJR_CODE_MINR_1_1_IN", majrCodeMinr11In, true);
			cmd.addParameter("@MAJR_CODE_MINR_1_2_IN", majrCodeMinr12In, true);
			cmd.addParameter("@EVAL_TERM_IN", evalTermIn, true);
			cmd.addParameter("@DFLT_IP_IN", dfltIpIn, true);
			cmd.addParameter("@REQUEST_NO", NNumber.class);
				
			cmd.execute();
			pidmIn.val = cmd.getParameterValue("@PIDM_IN", NNumber.class);
			origPidmIn.val = cmd.getParameterValue("@ORIG_PIDM_IN", NNumber.class);
			termIn.val = cmd.getParameterValue("@TERM_IN", NString.class);
			catlgTermIn.val = cmd.getParameterValue("@CATLG_TERM_IN", NString.class);
			programIn.val = cmd.getParameterValue("@PROGRAM_IN", NString.class);
			levlIn.val = cmd.getParameterValue("@LEVL_IN", NString.class);
			degcIn.val = cmd.getParameterValue("@DEGC_IN", NString.class);
			collIn.val = cmd.getParameterValue("@COLL_IN", NString.class);
			campIn.val = cmd.getParameterValue("@CAMP_IN", NString.class);
			sobcurrRuleIn.val = cmd.getParameterValue("@SOBCURR_RULE_IN", NNumber.class);
			sorcmjrRule11In.val = cmd.getParameterValue("@SORCMJR_RULE_1_1_IN", NNumber.class);
			sorcmjrRule12In.val = cmd.getParameterValue("@SORCMJR_RULE_1_2_IN", NNumber.class);
			sorcconRule11In.val = cmd.getParameterValue("@SORCCON_RULE_1_1_IN", NNumber.class);
			sorcconRule12In.val = cmd.getParameterValue("@SORCCON_RULE_1_2_IN", NNumber.class);
			sorcconRule13In.val = cmd.getParameterValue("@SORCCON_RULE_1_3_IN", NNumber.class);
			sorcconRule121In.val = cmd.getParameterValue("@SORCCON_RULE_121_IN", NNumber.class);
			sorcconRule122In.val = cmd.getParameterValue("@SORCCON_RULE_122_IN", NNumber.class);
			sorcconRule123In.val = cmd.getParameterValue("@SORCCON_RULE_123_IN", NNumber.class);
			sorcmnrRule11In.val = cmd.getParameterValue("@SORCMNR_RULE_1_1_IN", NNumber.class);
			sorcmnrRule12In.val = cmd.getParameterValue("@SORCMNR_RULE_1_2_IN", NNumber.class);
			majrCode11In.val = cmd.getParameterValue("@MAJR_CODE_1_1_IN", NString.class);
			deptCode11In.val = cmd.getParameterValue("@DEPT_CODE_1_1_IN", NString.class);
			majrCodeConc11In.val = cmd.getParameterValue("@MAJR_CODE_CONC_1_1_IN", NString.class);
			majrCodeConc12In.val = cmd.getParameterValue("@MAJR_CODE_CONC_1_2_IN", NString.class);
			majrCodeConc13In.val = cmd.getParameterValue("@MAJR_CODE_CONC_1_3_IN", NString.class);
			majrCode12In.val = cmd.getParameterValue("@MAJR_CODE_1_2_IN", NString.class);
			deptCode12In.val = cmd.getParameterValue("@DEPT_CODE_1_2_IN", NString.class);
			majrCodeConc121In.val = cmd.getParameterValue("@MAJR_CODE_CONC_121_IN", NString.class);
			majrCodeConc122In.val = cmd.getParameterValue("@MAJR_CODE_CONC_122_IN", NString.class);
			majrCodeConc123In.val = cmd.getParameterValue("@MAJR_CODE_CONC_123_IN", NString.class);
			majrCodeMinr11In.val = cmd.getParameterValue("@MAJR_CODE_MINR_1_1_IN", NString.class);
			majrCodeMinr12In.val = cmd.getParameterValue("@MAJR_CODE_MINR_1_2_IN", NString.class);
			evalTermIn.val = cmd.getParameterValue("@EVAL_TERM_IN", NString.class);
			dfltIpIn.val = cmd.getParameterValue("@DFLT_IP_IN", NString.class);
			requestNo.val = cmd.getParameterValue("@REQUEST_NO", NNumber.class);


		}
		
		public static void pJobsubInit(NNumber pidm,NNumber requestNo,Ref<NNumber> jobNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCMPL.P_JOBSUB_INIT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@REQUEST_NO", requestNo);
			cmd.addParameter("@JOB_NO", NNumber.class);
				
			cmd.execute();
			jobNo.val = cmd.getParameterValue("@JOB_NO", NNumber.class);


		}
		
	
	
	
}
