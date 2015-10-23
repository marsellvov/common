package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Sokcurr {
		public static NNumber fCheckmoduledata(NString module,NNumber dataChk) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKCURR.F_CHECKMODULEDATA", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@MODULE", module);
			cmd.addParameter("@DATA_CHK", dataChk);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fConcattach(NNumber currRule,NNumber cmjrRule,NString term,NString module) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKCURR.F_CONCATTACH", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@CURR_RULE", currRule);
			cmd.addParameter("@CMJR_RULE", cmjrRule);
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@MODULE", module);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fConclfosattach(NNumber currRule,NString term,NString module,NNumber pPidm,NNumber pLcurSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKCURR.F_CONCLFOSATTACH", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@CURR_RULE", currRule);
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@MODULE", module);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_LCUR_SEQNO", pLcurSeqno);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fMajrattach(NNumber currRule,NString term,NString module) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKCURR.F_MAJRATTACH", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@CURR_RULE", currRule);
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@MODULE", module);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fMinrattach(NNumber currRule,NString term,NString module) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKCURR.F_MINRATTACH", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@CURR_RULE", currRule);
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@MODULE", module);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fSorcconrule(NNumber currRule,NString concMajrAttachInd,NString concBaseAttachInd,NString term,NString conc,NNumber cmjrRule,NString module) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKCURR.F_SORCCONRULE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@CURR_RULE", currRule);
			cmd.addParameter("@CONC_MAJR_ATTACH_IND", concMajrAttachInd);
			cmd.addParameter("@CONC_BASE_ATTACH_IND", concBaseAttachInd);
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@CONC", conc);
			cmd.addParameter("@CMJR_RULE", cmjrRule);
			cmd.addParameter("@MODULE", module);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fSorcmjrrule(NNumber currRule,NString majrAttachInd,NString major,NString dept,NString term,NString module) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKCURR.F_SORCMJRRULE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@CURR_RULE", currRule);
			cmd.addParameter("@MAJR_ATTACH_IND", majrAttachInd);
			cmd.addParameter("@MAJOR", major);
			cmd.addParameter("@DEPT", dept);
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@MODULE", module);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fSorcmnrrule(NNumber currRule,NString minrAttachInd,NString term,NString minr,NString module) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKCURR.F_SORCMNRRULE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@CURR_RULE", currRule);
			cmd.addParameter("@MINR_ATTACH_IND", minrAttachInd);
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@MINR", minr);
			cmd.addParameter("@MODULE", module);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fStudypath(NString pCampCode,NString pCollCode,NString pDegcCode,NString pLevlCode,NString pProgram,NNumber pCurrRule) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKCURR.F_STUDYPATH", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CAMP_CODE", pCampCode);
			cmd.addParameter("@P_COLL_CODE", pCollCode);
			cmd.addParameter("@P_DEGC_CODE", pDegcCode);
			cmd.addParameter("@P_LEVL_CODE", pLevlCode);
			cmd.addParameter("@P_PROGRAM", pProgram);
			cmd.addParameter("@P_CURR_RULE", pCurrRule);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pCheckbase(NString module,NString ctlgTerm,NString campus,NString college,NString degreeCode,NString levl,NString program,Ref<NNumber> baseRule,Ref<NString> primRollInd,Ref<NString> secdRollInd,Ref<NString> majrAttachInd,Ref<NString> concMajrAttachInd,Ref<NString> concBaseAttachInd,Ref<NString> minrAttachInd,Ref<NNumber> errorNumb) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKCURR.P_CHECKBASE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MODULE", module);
			cmd.addParameter("@CTLG_TERM", ctlgTerm);
			cmd.addParameter("@CAMPUS", campus);
			cmd.addParameter("@COLLEGE", college);
			cmd.addParameter("@DEGREE_CODE", degreeCode);
			cmd.addParameter("@LEVL", levl);
			cmd.addParameter("@PROGRAM", program);
			cmd.addParameter("@BASE_RULE", baseRule, true);
			cmd.addParameter("@PRIM_ROLL_IND", primRollInd, true);
			cmd.addParameter("@SECD_ROLL_IND", secdRollInd, true);
			cmd.addParameter("@MAJR_ATTACH_IND", majrAttachInd, true);
			cmd.addParameter("@CONC_MAJR_ATTACH_IND", concMajrAttachInd, true);
			cmd.addParameter("@CONC_BASE_ATTACH_IND", concBaseAttachInd, true);
			cmd.addParameter("@MINR_ATTACH_IND", minrAttachInd, true);
			cmd.addParameter("@ERROR_NUMB", errorNumb, true);
				
			cmd.execute();
			baseRule.val = cmd.getParameterValue("@BASE_RULE", NNumber.class);
			primRollInd.val = cmd.getParameterValue("@PRIM_ROLL_IND", NString.class);
			secdRollInd.val = cmd.getParameterValue("@SECD_ROLL_IND", NString.class);
			majrAttachInd.val = cmd.getParameterValue("@MAJR_ATTACH_IND", NString.class);
			concMajrAttachInd.val = cmd.getParameterValue("@CONC_MAJR_ATTACH_IND", NString.class);
			concBaseAttachInd.val = cmd.getParameterValue("@CONC_BASE_ATTACH_IND", NString.class);
			minrAttachInd.val = cmd.getParameterValue("@MINR_ATTACH_IND", NString.class);
			errorNumb.val = cmd.getParameterValue("@ERROR_NUMB", NNumber.class);


		}
		
		public static void pCheckconcLfos(NString module,Ref<NString> concMajrAttachInd,Ref<NString> concBaseAttachInd,NString ctlgTerm,NNumber baseRule,Ref<NNumber> major1Rule,NString conc11,Ref<NNumber> conc11Rule,Ref<NNumber> errNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKCURR.P_CHECKCONC_LFOS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MODULE", module);
			cmd.addParameter("@CONC_MAJR_ATTACH_IND", concMajrAttachInd, true);
			cmd.addParameter("@CONC_BASE_ATTACH_IND", concBaseAttachInd, true);
			cmd.addParameter("@CTLG_TERM", ctlgTerm);
			cmd.addParameter("@BASE_RULE", baseRule);
			cmd.addParameter("@MAJOR1_RULE", major1Rule, true);
			cmd.addParameter("@CONC11", conc11);
			cmd.addParameter("@CONC11_RULE", conc11Rule, true);
			cmd.addParameter("@ERR_NUMBER", errNumber, true);
				
			cmd.execute();
			concMajrAttachInd.val = cmd.getParameterValue("@CONC_MAJR_ATTACH_IND", NString.class);
			concBaseAttachInd.val = cmd.getParameterValue("@CONC_BASE_ATTACH_IND", NString.class);
			major1Rule.val = cmd.getParameterValue("@MAJOR1_RULE", NNumber.class);
			conc11Rule.val = cmd.getParameterValue("@CONC11_RULE", NNumber.class);
			errNumber.val = cmd.getParameterValue("@ERR_NUMBER", NNumber.class);


		}
		
		public static void pCheckconcentrations(NString module,Ref<NString> concMajrAttachInd,Ref<NString> concBaseAttachInd,Ref<NString> concMajrAttachInd2,Ref<NString> concBaseAttachInd2,NString ctlgTerm,NNumber baseRule,Ref<NNumber> major1Rule,NString conc11,Ref<NNumber> conc11Rule,NString conc12,Ref<NNumber> conc12Rule,NString conc13,Ref<NNumber> conc13Rule,Ref<NNumber> major2Rule,NString conc21,Ref<NNumber> conc21Rule,NString conc22,Ref<NNumber> conc22Rule,NString conc23,Ref<NNumber> conc23Rule,Ref<NNumber> errNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKCURR.P_CHECKCONCENTRATIONS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MODULE", module);
			cmd.addParameter("@CONC_MAJR_ATTACH_IND", concMajrAttachInd, true);
			cmd.addParameter("@CONC_BASE_ATTACH_IND", concBaseAttachInd, true);
			cmd.addParameter("@CONC_MAJR_ATTACH_IND2", concMajrAttachInd2, true);
			cmd.addParameter("@CONC_BASE_ATTACH_IND2", concBaseAttachInd2, true);
			cmd.addParameter("@CTLG_TERM", ctlgTerm);
			cmd.addParameter("@BASE_RULE", baseRule);
			cmd.addParameter("@MAJOR1_RULE", major1Rule, true);
			cmd.addParameter("@CONC11", conc11);
			cmd.addParameter("@CONC11_RULE", conc11Rule, true);
			cmd.addParameter("@CONC12", conc12);
			cmd.addParameter("@CONC12_RULE", conc12Rule, true);
			cmd.addParameter("@CONC13", conc13);
			cmd.addParameter("@CONC13_RULE", conc13Rule, true);
			cmd.addParameter("@MAJOR2_RULE", major2Rule, true);
			cmd.addParameter("@CONC21", conc21);
			cmd.addParameter("@CONC21_RULE", conc21Rule, true);
			cmd.addParameter("@CONC22", conc22);
			cmd.addParameter("@CONC22_RULE", conc22Rule, true);
			cmd.addParameter("@CONC23", conc23);
			cmd.addParameter("@CONC23_RULE", conc23Rule, true);
			cmd.addParameter("@ERR_NUMBER", errNumber, true);
				
			cmd.execute();
			concMajrAttachInd.val = cmd.getParameterValue("@CONC_MAJR_ATTACH_IND", NString.class);
			concBaseAttachInd.val = cmd.getParameterValue("@CONC_BASE_ATTACH_IND", NString.class);
			concMajrAttachInd2.val = cmd.getParameterValue("@CONC_MAJR_ATTACH_IND2", NString.class);
			concBaseAttachInd2.val = cmd.getParameterValue("@CONC_BASE_ATTACH_IND2", NString.class);
			major1Rule.val = cmd.getParameterValue("@MAJOR1_RULE", NNumber.class);
			conc11Rule.val = cmd.getParameterValue("@CONC11_RULE", NNumber.class);
			conc12Rule.val = cmd.getParameterValue("@CONC12_RULE", NNumber.class);
			conc13Rule.val = cmd.getParameterValue("@CONC13_RULE", NNumber.class);
			major2Rule.val = cmd.getParameterValue("@MAJOR2_RULE", NNumber.class);
			conc21Rule.val = cmd.getParameterValue("@CONC21_RULE", NNumber.class);
			conc22Rule.val = cmd.getParameterValue("@CONC22_RULE", NNumber.class);
			conc23Rule.val = cmd.getParameterValue("@CONC23_RULE", NNumber.class);
			errNumber.val = cmd.getParameterValue("@ERR_NUMBER", NNumber.class);


		}
		
		public static void pCheckcurriculum(NString currInd,NString module,NString ctlgTerm,NString campus,NString college,NString degreeCode,NString levl,NString program,Ref<NNumber> baseRule,Ref<NString> primRollInd,Ref<NString> secdRollInd,NString major1,NString dept1,Ref<NNumber> major1Rule,NString conc11,Ref<NNumber> conc11Rule,NString conc12,Ref<NNumber> conc12Rule,NString conc13,Ref<NNumber> conc13Rule,NString major2,NString dept2,Ref<NNumber> major2Rule,NString conc21,Ref<NNumber> conc21Rule,NString conc22,Ref<NNumber> conc22Rule,NString conc23,Ref<NNumber> conc23Rule,NString minr1,Ref<NNumber> minr1Rule,NString minr2,Ref<NNumber> minr2Rule,Ref<NString> errorType,Ref<NNumber> errNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKCURR.P_CHECKCURRICULUM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CURR_IND", currInd);
			cmd.addParameter("@MODULE", module);
			cmd.addParameter("@CTLG_TERM", ctlgTerm);
			cmd.addParameter("@CAMPUS", campus);
			cmd.addParameter("@COLLEGE", college);
			cmd.addParameter("@DEGREE_CODE", degreeCode);
			cmd.addParameter("@LEVL", levl);
			cmd.addParameter("@PROGRAM", program);
			cmd.addParameter("@BASE_RULE", baseRule, true);
			cmd.addParameter("@PRIM_ROLL_IND", primRollInd, true);
			cmd.addParameter("@SECD_ROLL_IND", secdRollInd, true);
			cmd.addParameter("@MAJOR1", major1);
			cmd.addParameter("@DEPT1", dept1);
			cmd.addParameter("@MAJOR1_RULE", major1Rule, true);
			cmd.addParameter("@CONC11", conc11);
			cmd.addParameter("@CONC11_RULE", conc11Rule, true);
			cmd.addParameter("@CONC12", conc12);
			cmd.addParameter("@CONC12_RULE", conc12Rule, true);
			cmd.addParameter("@CONC13", conc13);
			cmd.addParameter("@CONC13_RULE", conc13Rule, true);
			cmd.addParameter("@MAJOR2", major2);
			cmd.addParameter("@DEPT2", dept2);
			cmd.addParameter("@MAJOR2_RULE", major2Rule, true);
			cmd.addParameter("@CONC21", conc21);
			cmd.addParameter("@CONC21_RULE", conc21Rule, true);
			cmd.addParameter("@CONC22", conc22);
			cmd.addParameter("@CONC22_RULE", conc22Rule, true);
			cmd.addParameter("@CONC23", conc23);
			cmd.addParameter("@CONC23_RULE", conc23Rule, true);
			cmd.addParameter("@MINR1", minr1);
			cmd.addParameter("@MINR1_RULE", minr1Rule, true);
			cmd.addParameter("@MINR2", minr2);
			cmd.addParameter("@MINR2_RULE", minr2Rule, true);
			cmd.addParameter("@ERROR_TYPE", errorType, true);
			cmd.addParameter("@ERR_NUMBER", errNumber, true);
				
			cmd.execute();
			baseRule.val = cmd.getParameterValue("@BASE_RULE", NNumber.class);
			primRollInd.val = cmd.getParameterValue("@PRIM_ROLL_IND", NString.class);
			secdRollInd.val = cmd.getParameterValue("@SECD_ROLL_IND", NString.class);
			major1Rule.val = cmd.getParameterValue("@MAJOR1_RULE", NNumber.class);
			conc11Rule.val = cmd.getParameterValue("@CONC11_RULE", NNumber.class);
			conc12Rule.val = cmd.getParameterValue("@CONC12_RULE", NNumber.class);
			conc13Rule.val = cmd.getParameterValue("@CONC13_RULE", NNumber.class);
			major2Rule.val = cmd.getParameterValue("@MAJOR2_RULE", NNumber.class);
			conc21Rule.val = cmd.getParameterValue("@CONC21_RULE", NNumber.class);
			conc22Rule.val = cmd.getParameterValue("@CONC22_RULE", NNumber.class);
			conc23Rule.val = cmd.getParameterValue("@CONC23_RULE", NNumber.class);
			minr1Rule.val = cmd.getParameterValue("@MINR1_RULE", NNumber.class);
			minr2Rule.val = cmd.getParameterValue("@MINR2_RULE", NNumber.class);
			errorType.val = cmd.getParameterValue("@ERROR_TYPE", NString.class);
			errNumber.val = cmd.getParameterValue("@ERR_NUMBER", NNumber.class);


		}
		
		public static void pChecklfos(NString pLmodCode,NNumber pCurrRule,NString pLfstCode,NString pTermCtlg,NString pMajrCode,NString pDeptCode,Ref<NNumber> pLfosRule,Ref<NNumber> pConcAttachRule,Ref<NNumber> errNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKCURR.P_CHECKLFOS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_LMOD_CODE", pLmodCode);
			cmd.addParameter("@P_CURR_RULE", pCurrRule);
			cmd.addParameter("@P_LFST_CODE", pLfstCode);
			cmd.addParameter("@P_TERM_CTLG", pTermCtlg);
			cmd.addParameter("@P_MAJR_CODE", pMajrCode);
			cmd.addParameter("@P_DEPT_CODE", pDeptCode);
			cmd.addParameter("@P_LFOS_RULE", pLfosRule, true);
			cmd.addParameter("@P_CONC_ATTACH_RULE", pConcAttachRule, true);
			cmd.addParameter("@ERR_NUMBER", NNumber.class);
				
			cmd.execute();
			pLfosRule.val = cmd.getParameterValue("@P_LFOS_RULE", NNumber.class);
			pConcAttachRule.val = cmd.getParameterValue("@P_CONC_ATTACH_RULE", NNumber.class);
			errNumber.val = cmd.getParameterValue("@ERR_NUMBER", NNumber.class);


		}
		
		public static void pCheckmajor(NString module,NString majrAttachInd,NString ctlgTerm,NNumber baseRule,NString major1,NString dept1,Ref<NNumber> major1Rule,NString major2,NString dept2,Ref<NNumber> major2Rule,Ref<NNumber> errNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKCURR.P_CHECKMAJOR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MODULE", module);
			cmd.addParameter("@MAJR_ATTACH_IND", majrAttachInd);
			cmd.addParameter("@CTLG_TERM", ctlgTerm);
			cmd.addParameter("@BASE_RULE", baseRule);
			cmd.addParameter("@MAJOR1", major1);
			cmd.addParameter("@DEPT1", dept1);
			cmd.addParameter("@MAJOR1_RULE", major1Rule, true);
			cmd.addParameter("@MAJOR2", major2);
			cmd.addParameter("@DEPT2", dept2);
			cmd.addParameter("@MAJOR2_RULE", major2Rule, true);
			cmd.addParameter("@ERR_NUMBER", errNumber, true);
				
			cmd.execute();
			major1Rule.val = cmd.getParameterValue("@MAJOR1_RULE", NNumber.class);
			major2Rule.val = cmd.getParameterValue("@MAJOR2_RULE", NNumber.class);
			errNumber.val = cmd.getParameterValue("@ERR_NUMBER", NNumber.class);


		}
		
		public static void pCheckminor(NString module,NString minrAttachInd,NString ctlgTerm,NNumber baseRule,NString minor1,Ref<NNumber> minor1Rule,NString minor2,Ref<NNumber> minor2Rule,Ref<NNumber> errNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKCURR.P_CHECKMINOR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MODULE", module);
			cmd.addParameter("@MINR_ATTACH_IND", minrAttachInd);
			cmd.addParameter("@CTLG_TERM", ctlgTerm);
			cmd.addParameter("@BASE_RULE", baseRule);
			cmd.addParameter("@MINOR1", minor1);
			cmd.addParameter("@MINOR1_RULE", minor1Rule, true);
			cmd.addParameter("@MINOR2", minor2);
			cmd.addParameter("@MINOR2_RULE", minor2Rule, true);
			cmd.addParameter("@ERR_NUMBER", errNumber, true);
				
			cmd.execute();
			minor1Rule.val = cmd.getParameterValue("@MINOR1_RULE", NNumber.class);
			minor2Rule.val = cmd.getParameterValue("@MINOR2_RULE", NNumber.class);
			errNumber.val = cmd.getParameterValue("@ERR_NUMBER", NNumber.class);


		}
		
		public static void pCheckprogrammajor(NString campus,NString college,NString degreeCode,NString levl,NString ctlgTerm,NString major,NString module,Ref<NString> program,Ref<NString> progDisplay,Ref<NNumber> currRule,Ref<NNumber> cmjrRule,Ref<NString> deptCode,Ref<NString> updBaseInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKCURR.P_CHECKPROGRAMMAJOR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CAMPUS", campus);
			cmd.addParameter("@COLLEGE", college);
			cmd.addParameter("@DEGREE_CODE", degreeCode);
			cmd.addParameter("@LEVL", levl);
			cmd.addParameter("@CTLG_TERM", ctlgTerm);
			cmd.addParameter("@MAJOR", major);
			cmd.addParameter("@MODULE", module);
			cmd.addParameter("@PROGRAM", program, true);
			cmd.addParameter("@PROG_DISPLAY", progDisplay, true);
			cmd.addParameter("@CURR_RULE", currRule, true);
			cmd.addParameter("@CMJR_RULE", cmjrRule, true);
			cmd.addParameter("@DEPT_CODE", deptCode, true);
			cmd.addParameter("@UPD_BASE_IND", updBaseInd, true);
				
			cmd.execute();
			program.val = cmd.getParameterValue("@PROGRAM", NString.class);
			progDisplay.val = cmd.getParameterValue("@PROG_DISPLAY", NString.class);
			currRule.val = cmd.getParameterValue("@CURR_RULE", NNumber.class);
			cmjrRule.val = cmd.getParameterValue("@CMJR_RULE", NNumber.class);
			deptCode.val = cmd.getParameterValue("@DEPT_CODE", NString.class);
			updBaseInd.val = cmd.getParameterValue("@UPD_BASE_IND", NString.class);


		}
		
		public static void pVerifydata(NString module,NString ctlgTerm,NString campus,NString college,NString degreeCode,NString levl,NString program,NString major1,NString dept1,Ref<NNumber> dataChk) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKCURR.P_VERIFYDATA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MODULE", module);
			cmd.addParameter("@CTLG_TERM", ctlgTerm);
			cmd.addParameter("@CAMPUS", campus);
			cmd.addParameter("@COLLEGE", college);
			cmd.addParameter("@DEGREE_CODE", degreeCode);
			cmd.addParameter("@LEVL", levl);
			cmd.addParameter("@PROGRAM", program);
			cmd.addParameter("@MAJOR1", major1);
			cmd.addParameter("@DEPT1", dept1);
			cmd.addParameter("@DATA_CHK", dataChk, true);
				
			cmd.execute();
			dataChk.val = cmd.getParameterValue("@DATA_CHK", NNumber.class);


		}
		
	
	
	
}
