package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Sakmods {
		public static void pCopyLcur(NNumber pidmIn,NString lmodCodeIn,NString termCodeIn,NNumber seqnoIn,NString admtCodeIn,NNumber priorityIn,NString queryLmodCode,NNumber queryKeyseqno,NString dataOriginIn,NString cstsCodeIn,NString cactCodeIn,NString overrideSeverityIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKMODS.P_COPY_LCUR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@LMOD_CODE_IN", lmodCodeIn);
			cmd.addParameter("@TERM_CODE_IN", termCodeIn);
			cmd.addParameter("@SEQNO_IN", seqnoIn);
			cmd.addParameter("@ADMT_CODE_IN", admtCodeIn);
			cmd.addParameter("@PRIORITY_IN", priorityIn);
			cmd.addParameter("@QUERY_LMOD_CODE", queryLmodCode);
			cmd.addParameter("@QUERY_KEYSEQNO", queryKeyseqno);
			cmd.addParameter("@DATA_ORIGIN_IN", dataOriginIn);
			cmd.addParameter("@CSTS_CODE_IN", cstsCodeIn);
			cmd.addParameter("@CACT_CODE_IN", cactCodeIn);
			cmd.addParameter("@OVERRIDE_SEVERITY_IN", overrideSeverityIn);
				
			cmd.execute();


		}
		
		public static void pCopyLfos(NNumber pidmIn,NString lfstCodeIn,NNumber newLcurSeqno,NNumber seqnoIn,NString dataOriginIn,NString cstsCodeIn,NString cactCodeIn,NNumber maxCurrCount,NString overrideSeverityIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKMODS.P_COPY_LFOS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@LFST_CODE_IN", lfstCodeIn);
			cmd.addParameter("@NEW_LCUR_SEQNO", newLcurSeqno);
			cmd.addParameter("@SEQNO_IN", seqnoIn);
			cmd.addParameter("@DATA_ORIGIN_IN", dataOriginIn);
			cmd.addParameter("@CSTS_CODE_IN", cstsCodeIn);
			cmd.addParameter("@CACT_CODE_IN", cactCodeIn);
			cmd.addParameter("@MAX_CURR_COUNT", maxCurrCount);
			cmd.addParameter("@OVERRIDE_SEVERITY_IN", overrideSeverityIn);
				
			cmd.execute();


		}
		
		public static void pCreateApplication(NString commplanIndIn,NString sourceIndIn,NString admrCodeCcIn,NString chklCommentCcIn,NDate completeDateIn,NDate processingDateIn,NString wadfAutoApplIndIn,NNumber pidmIn,NString termIn,NString levlIn,NDate applDateIn,NString apstIn,NDate apstDateIn,NString maintIndIn,NString admtIn,NString stypIn,NString campIn,NString siteIn,NString coll1In,NString degc1In,NString majr1In,NString coll2In,NString degc2In,NString majr2In,NString resdIn,NString fullPartIndIn,NString sessIn,NString wrsnIn,NString intvIn,NString feeIndIn,NDate feeDateIn,NDate activityDateIn,NString rateIn,NString egolIn,NString edlvIn,NString majrConc1In,NString deptIn,NString sbgiIn,NString recrIn,NString rtypIn,NString dept2In,NString majrConc2In,NString program1In,NString ctlgTermIn,NString majr12In,NString dept12In,NString webAcctMiscIndIn,NString webCashierUserIn,NNumber webTransNoIn,NNumber webAmountIn,NNumber webReceiptNumberIn,NString waivCodeIn,Ref<NString> errMsg,Ref<NNumber> adapApplno,NString sbgiSrceCodeIn,NString cstsCodeIn,NString cactCodeIn,NString checklistIndIn,NString overrideSeverityIn,NNumber applPreferenceIn,NNumber priorityIn,NString majrConc12In,NString majrConc13In,NString majrConc121In,NString majrConc122In,NString majrConc123In,NString majrMinr11In,NString majrMinr12In,NString program2In,NString levl2In,NString camp2In,NString majr22In,NString dept22In,NString majrConc22In,NString majrConc23In,NString majrConc221In,NString majrConc222In,NString majrConc223In,NString majrMinr21In,NString majrMinr22In) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKMODS.P_CREATE_APPLICATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@COMMPLAN_IND_IN", commplanIndIn);
			cmd.addParameter("@SOURCE_IND_IN", sourceIndIn);
			cmd.addParameter("@ADMR_CODE_CC_IN", admrCodeCcIn);
			cmd.addParameter("@CHKL_COMMENT_CC_IN", chklCommentCcIn);
			cmd.addParameter("@COMPLETE_DATE_IN", completeDateIn);
			cmd.addParameter("@PROCESSING_DATE_IN", processingDateIn);
			cmd.addParameter("@WADF_AUTO_APPL_IND_IN", wadfAutoApplIndIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@LEVL_IN", levlIn);
			cmd.addParameter("@APPL_DATE_IN", applDateIn);
			cmd.addParameter("@APST_IN", apstIn);
			cmd.addParameter("@APST_DATE_IN", apstDateIn);
			cmd.addParameter("@MAINT_IND_IN", maintIndIn);
			cmd.addParameter("@ADMT_IN", admtIn);
			cmd.addParameter("@STYP_IN", stypIn);
			cmd.addParameter("@CAMP_IN", campIn);
			cmd.addParameter("@SITE_IN", siteIn);
			cmd.addParameter("@COLL1_IN", coll1In);
			cmd.addParameter("@DEGC1_IN", degc1In);
			cmd.addParameter("@MAJR1_IN", majr1In);
			cmd.addParameter("@COLL2_IN", coll2In);
			cmd.addParameter("@DEGC2_IN", degc2In);
			cmd.addParameter("@MAJR2_IN", majr2In);
			cmd.addParameter("@RESD_IN", resdIn);
			cmd.addParameter("@FULL_PART_IND_IN", fullPartIndIn);
			cmd.addParameter("@SESS_IN", sessIn);
			cmd.addParameter("@WRSN_IN", wrsnIn);
			cmd.addParameter("@INTV_IN", intvIn);
			cmd.addParameter("@FEE_IND_IN", feeIndIn);
			cmd.addParameter("@FEE_DATE_IN", feeDateIn);
			cmd.addParameter("@ACTIVITY_DATE_IN", activityDateIn);
			cmd.addParameter("@RATE_IN", rateIn);
			cmd.addParameter("@EGOL_IN", egolIn);
			cmd.addParameter("@EDLV_IN", edlvIn);
			cmd.addParameter("@MAJR_CONC1_IN", majrConc1In);
			cmd.addParameter("@DEPT_IN", deptIn);
			cmd.addParameter("@SBGI_IN", sbgiIn);
			cmd.addParameter("@RECR_IN", recrIn);
			cmd.addParameter("@RTYP_IN", rtypIn);
			cmd.addParameter("@DEPT2_IN", dept2In);
			cmd.addParameter("@MAJR_CONC2_IN", majrConc2In);
			cmd.addParameter("@PROGRAM1_IN", program1In);
			cmd.addParameter("@CTLG_TERM_IN", ctlgTermIn);
			cmd.addParameter("@MAJR12_IN", majr12In);
			cmd.addParameter("@DEPT12_IN", dept12In);
			cmd.addParameter("@WEB_ACCT_MISC_IND_IN", webAcctMiscIndIn);
			cmd.addParameter("@WEB_CASHIER_USER_IN", webCashierUserIn);
			cmd.addParameter("@WEB_TRANS_NO_IN", webTransNoIn);
			cmd.addParameter("@WEB_AMOUNT_IN", webAmountIn);
			cmd.addParameter("@WEB_RECEIPT_NUMBER_IN", webReceiptNumberIn);
			cmd.addParameter("@WAIV_CODE_IN", waivCodeIn);
			cmd.addParameter("@ERR_MSG", NString.class);
			cmd.addParameter("@ADAP_APPLNO", NNumber.class);
			cmd.addParameter("@SBGI_SRCE_CODE_IN", sbgiSrceCodeIn);
			cmd.addParameter("@CSTS_CODE_IN", cstsCodeIn);
			cmd.addParameter("@CACT_CODE_IN", cactCodeIn);
			cmd.addParameter("@CHECKLIST_IND_IN", checklistIndIn);
			cmd.addParameter("@OVERRIDE_SEVERITY_IN", overrideSeverityIn);
			cmd.addParameter("@APPL_PREFERENCE_IN", applPreferenceIn);
			cmd.addParameter("@PRIORITY_IN", priorityIn);
			cmd.addParameter("@MAJR_CONC_12_IN", majrConc12In);
			cmd.addParameter("@MAJR_CONC_13_IN", majrConc13In);
			cmd.addParameter("@MAJR_CONC_121_IN", majrConc121In);
			cmd.addParameter("@MAJR_CONC_122_IN", majrConc122In);
			cmd.addParameter("@MAJR_CONC_123_IN", majrConc123In);
			cmd.addParameter("@MAJR_MINR11_IN", majrMinr11In);
			cmd.addParameter("@MAJR_MINR12_IN", majrMinr12In);
			cmd.addParameter("@PROGRAM2_IN", program2In);
			cmd.addParameter("@LEVL2_IN", levl2In);
			cmd.addParameter("@CAMP2_IN", camp2In);
			cmd.addParameter("@MAJR22_IN", majr22In);
			cmd.addParameter("@DEPT22_IN", dept22In);
			cmd.addParameter("@MAJR_CONC_22_IN", majrConc22In);
			cmd.addParameter("@MAJR_CONC_23_IN", majrConc23In);
			cmd.addParameter("@MAJR_CONC_221_IN", majrConc221In);
			cmd.addParameter("@MAJR_CONC_222_IN", majrConc222In);
			cmd.addParameter("@MAJR_CONC_223_IN", majrConc223In);
			cmd.addParameter("@MAJR_MINR21_IN", majrMinr21In);
			cmd.addParameter("@MAJR_MINR22_IN", majrMinr22In);
				
			cmd.execute();
			errMsg.val = cmd.getParameterValue("@ERR_MSG", NString.class);
			adapApplno.val = cmd.getParameterValue("@ADAP_APPLNO", NNumber.class);


		}
		
		public static void pCreateLfos(NNumber pidmIn,NNumber lcurSeqno,NString termIn,NString lfstCode,NNumber lfosCnt,NString lfosIn,NString dataOrigin,Ref<NString> rowidOut,Ref<NNumber> currError,Ref<NString> severityOut,NString deptIn,NString cstsCodeIn,NString cactCodeIn,NString overrideSeverityIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKMODS.P_CREATE_LFOS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@LCUR_SEQNO", lcurSeqno);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@LFST_CODE", lfstCode);
			cmd.addParameter("@LFOS_CNT", lfosCnt);
			cmd.addParameter("@LFOS_IN", lfosIn);
			cmd.addParameter("@DATA_ORIGIN", dataOrigin);
			cmd.addParameter("@ROWID_OUT", NString.class);
			cmd.addParameter("@CURR_ERROR", NNumber.class);
			cmd.addParameter("@SEVERITY_OUT", NString.class);
			cmd.addParameter("@DEPT_IN", deptIn);
			cmd.addParameter("@CSTS_CODE_IN", cstsCodeIn);
			cmd.addParameter("@CACT_CODE_IN", cactCodeIn);
			cmd.addParameter("@OVERRIDE_SEVERITY_IN", overrideSeverityIn);
				
			cmd.execute();
			rowidOut.val = cmd.getParameterValue("@ROWID_OUT", NString.class);
			currError.val = cmd.getParameterValue("@CURR_ERROR", NNumber.class);
			severityOut.val = cmd.getParameterValue("@SEVERITY_OUT", NString.class);


		}
		
		public static void pCreateRecruit(NString commplanIndIn,NString sourceIndIn,NNumber pidmIn,NString termIn,NString deptIn,NString levlIn,NString degcIn,NString majrIn,NString recrIn,NString rstaIn,NDate activityDateIn,NString selectIndIn,NDate addDateIn,NString admtIn,NString campIn,NString collIn,NString majr2In,NString edlvIn,NString egolIn,NString fullPartIndIn,NString sbgiIn,NString wrsnIn,NString rtypIn,NString resdIn,NString sessIn,NString siteIn,NString stypIn,NString programIn,NString ctlgTermIn,NString dept2In,NString majrConc111In,NString majrConc112In,NString majrConc113In,NString majrConc121In,NString majrConc122In,NString majrConc123In,NString majrMinr1In,NString majrMinr12In,NNumber currRule1In,NNumber cmjrRule11In,NNumber cconRule111In,NNumber cconRule112In,NNumber cconRule113In,NNumber cmjrRule12In,NNumber cconRule121In,NNumber cconRule122In,NNumber cconRule123In,NNumber cmnrRule11In,NNumber cmnrRule12In,NString sbgiSrceCodeIn,NString cstsCodeIn,NString cactCodeIn,NString overrideSeverityIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKMODS.P_CREATE_RECRUIT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@COMMPLAN_IND_IN", commplanIndIn);
			cmd.addParameter("@SOURCE_IND_IN", sourceIndIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@DEPT_IN", deptIn);
			cmd.addParameter("@LEVL_IN", levlIn);
			cmd.addParameter("@DEGC_IN", degcIn);
			cmd.addParameter("@MAJR_IN", majrIn);
			cmd.addParameter("@RECR_IN", recrIn);
			cmd.addParameter("@RSTA_IN", rstaIn);
			cmd.addParameter("@ACTIVITY_DATE_IN", activityDateIn);
			cmd.addParameter("@SELECT_IND_IN", selectIndIn);
			cmd.addParameter("@ADD_DATE_IN", addDateIn);
			cmd.addParameter("@ADMT_IN", admtIn);
			cmd.addParameter("@CAMP_IN", campIn);
			cmd.addParameter("@COLL_IN", collIn);
			cmd.addParameter("@MAJR2_IN", majr2In);
			cmd.addParameter("@EDLV_IN", edlvIn);
			cmd.addParameter("@EGOL_IN", egolIn);
			cmd.addParameter("@FULL_PART_IND_IN", fullPartIndIn);
			cmd.addParameter("@SBGI_IN", sbgiIn);
			cmd.addParameter("@WRSN_IN", wrsnIn);
			cmd.addParameter("@RTYP_IN", rtypIn);
			cmd.addParameter("@RESD_IN", resdIn);
			cmd.addParameter("@SESS_IN", sessIn);
			cmd.addParameter("@SITE_IN", siteIn);
			cmd.addParameter("@STYP_IN", stypIn);
			cmd.addParameter("@PROGRAM_IN", programIn);
			cmd.addParameter("@CTLG_TERM_IN", ctlgTermIn);
			cmd.addParameter("@DEPT2_IN", dept2In);
			cmd.addParameter("@MAJR_CONC_111_IN", majrConc111In);
			cmd.addParameter("@MAJR_CONC_112_IN", majrConc112In);
			cmd.addParameter("@MAJR_CONC_113_IN", majrConc113In);
			cmd.addParameter("@MAJR_CONC_121_IN", majrConc121In);
			cmd.addParameter("@MAJR_CONC_122_IN", majrConc122In);
			cmd.addParameter("@MAJR_CONC_123_IN", majrConc123In);
			cmd.addParameter("@MAJR_MINR1_IN", majrMinr1In);
			cmd.addParameter("@MAJR_MINR12_IN", majrMinr12In);
			cmd.addParameter("@CURR_RULE1_IN", currRule1In);
			cmd.addParameter("@CMJR_RULE11_IN", cmjrRule11In);
			cmd.addParameter("@CCON_RULE111_IN", cconRule111In);
			cmd.addParameter("@CCON_RULE112_IN", cconRule112In);
			cmd.addParameter("@CCON_RULE113_IN", cconRule113In);
			cmd.addParameter("@CMJR_RULE12_IN", cmjrRule12In);
			cmd.addParameter("@CCON_RULE121_IN", cconRule121In);
			cmd.addParameter("@CCON_RULE122_IN", cconRule122In);
			cmd.addParameter("@CCON_RULE123_IN", cconRule123In);
			cmd.addParameter("@CMNR_RULE11_IN", cmnrRule11In);
			cmd.addParameter("@CMNR_RULE12_IN", cmnrRule12In);
			cmd.addParameter("@SBGI_SRCE_CODE_IN", sbgiSrceCodeIn);
			cmd.addParameter("@CSTS_CODE_IN", cstsCodeIn);
			cmd.addParameter("@CACT_CODE_IN", cactCodeIn);
			cmd.addParameter("@OVERRIDE_SEVERITY_IN", overrideSeverityIn);
				
			cmd.execute();


		}
		
		public static void pCreateStudent(NString commplanIndIn,NString sourceIndIn,NNumber pidm,NNumber adapApplno,NString termCodeEff,NString ststCode,NString levlCode,NString stypCode,NString termCodeMatric,NString termCodeAdmit,NDate expGradDate,NString campCode,NString fullPartInd,NString sessCode,NString resdCode,NString collCode1,NString degcCode1,NString majrCode1,NString majrCodeMinr11,NString majrCodeMinr12,NString majrCodeConc1,NString majrCodeConc12,NString majrCodeConc13,NString collCode2,NString degcCode2,NString majrCode2,NString majrCodeMinr21,NString majrCodeMinr22,NString majrCodeConc2,NString majrCodeConc212,NString majrCodeConc213,NString orsnCode,NString pracCode,NNumber advrPidm,NString gradCreditApprInd,NString caplCode,NString leavCode,NDate leavFromDate,NDate leavToDate,NString astdCode,NString termCodeAstd,NString rateCode,NDate activityDate,NString majrCode12,NString majrCode22,NString edlvCode,NString incmCode,NString admtCode,NString emexCode,NString aprnCode,NString trcnCode,NString gainCode,NString voedCode,NString blckCode,NString termCodeGrad,NString acyrCode,NString deptCode,NString siteCode,NString deptCode2,NString egolCode,NString degcCodeDual,NString levlCodeDual,NString deptCodeDual,NString collCodeDual,NString majrCodeDual,NString bsklCode,NString primRollInd,NString program1,NString termCodeCtlg1,NString deptCode12,NString majrCodeConc121,NString majrCodeConc122,NString majrCodeConc123,NString secdRollInd,NString termCodeAdmit2,NString admtCode2,NString program2,NString termCodeCtlg2,NString levlCode2,NString campCode2,NString deptCode22,NString majrCodeConc221,NString majrCodeConc222,NString majrCodeConc223,NNumber currRule1,NNumber cmjrRule11,NNumber cconRule111,NNumber cconRule112,NNumber cconRule113,NNumber cmjrRule12,NNumber cconRule121,NNumber cconRule122,NNumber cconRule123,NNumber cmnrRule11,NNumber cmnrRule12,NNumber currRule2,NNumber cmjrRule21,NNumber cconRule211,NNumber cconRule212,NNumber cconRule213,NNumber cmjrRule22,NNumber cconRule221,NNumber cconRule222,NNumber cconRule223,NNumber cmnrRule21,NNumber cmnrRule22,NString prevCode,NString termCodePrev,NString castCode,NString termCodeCast,NString applTermCode,NNumber applNo,NString overrideSeverityIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKMODS.P_CREATE_STUDENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@COMMPLAN_IND_IN", commplanIndIn);
			cmd.addParameter("@SOURCE_IND_IN", sourceIndIn);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@ADAP_APPLNO", adapApplno);
			cmd.addParameter("@TERM_CODE_EFF", termCodeEff);
			cmd.addParameter("@STST_CODE", ststCode);
			cmd.addParameter("@LEVL_CODE", levlCode);
			cmd.addParameter("@STYP_CODE", stypCode);
			cmd.addParameter("@TERM_CODE_MATRIC", termCodeMatric);
			cmd.addParameter("@TERM_CODE_ADMIT", termCodeAdmit);
			cmd.addParameter("@EXP_GRAD_DATE", expGradDate);
			cmd.addParameter("@CAMP_CODE", campCode);
			cmd.addParameter("@FULL_PART_IND", fullPartInd);
			cmd.addParameter("@SESS_CODE", sessCode);
			cmd.addParameter("@RESD_CODE", resdCode);
			cmd.addParameter("@COLL_CODE_1", collCode1);
			cmd.addParameter("@DEGC_CODE_1", degcCode1);
			cmd.addParameter("@MAJR_CODE_1", majrCode1);
			cmd.addParameter("@MAJR_CODE_MINR_1_1", majrCodeMinr11);
			cmd.addParameter("@MAJR_CODE_MINR_1_2", majrCodeMinr12);
			cmd.addParameter("@MAJR_CODE_CONC_1", majrCodeConc1);
			cmd.addParameter("@MAJR_CODE_CONC_1_2", majrCodeConc12);
			cmd.addParameter("@MAJR_CODE_CONC_1_3", majrCodeConc13);
			cmd.addParameter("@COLL_CODE_2", collCode2);
			cmd.addParameter("@DEGC_CODE_2", degcCode2);
			cmd.addParameter("@MAJR_CODE_2", majrCode2);
			cmd.addParameter("@MAJR_CODE_MINR_2_1", majrCodeMinr21);
			cmd.addParameter("@MAJR_CODE_MINR_2_2", majrCodeMinr22);
			cmd.addParameter("@MAJR_CODE_CONC_2", majrCodeConc2);
			cmd.addParameter("@MAJR_CODE_CONC_212", majrCodeConc212);
			cmd.addParameter("@MAJR_CODE_CONC_213", majrCodeConc213);
			cmd.addParameter("@ORSN_CODE", orsnCode);
			cmd.addParameter("@PRAC_CODE", pracCode);
			cmd.addParameter("@ADVR_PIDM", advrPidm);
			cmd.addParameter("@GRAD_CREDIT_APPR_IND", gradCreditApprInd);
			cmd.addParameter("@CAPL_CODE", caplCode);
			cmd.addParameter("@LEAV_CODE", leavCode);
			cmd.addParameter("@LEAV_FROM_DATE", leavFromDate);
			cmd.addParameter("@LEAV_TO_DATE", leavToDate);
			cmd.addParameter("@ASTD_CODE", astdCode);
			cmd.addParameter("@TERM_CODE_ASTD", termCodeAstd);
			cmd.addParameter("@RATE_CODE", rateCode);
			cmd.addParameter("@ACTIVITY_DATE", activityDate);
			cmd.addParameter("@MAJR_CODE_1_2", majrCode12);
			cmd.addParameter("@MAJR_CODE_2_2", majrCode22);
			cmd.addParameter("@EDLV_CODE", edlvCode);
			cmd.addParameter("@INCM_CODE", incmCode);
			cmd.addParameter("@ADMT_CODE", admtCode);
			cmd.addParameter("@EMEX_CODE", emexCode);
			cmd.addParameter("@APRN_CODE", aprnCode);
			cmd.addParameter("@TRCN_CODE", trcnCode);
			cmd.addParameter("@GAIN_CODE", gainCode);
			cmd.addParameter("@VOED_CODE", voedCode);
			cmd.addParameter("@BLCK_CODE", blckCode);
			cmd.addParameter("@TERM_CODE_GRAD", termCodeGrad);
			cmd.addParameter("@ACYR_CODE", acyrCode);
			cmd.addParameter("@DEPT_CODE", deptCode);
			cmd.addParameter("@SITE_CODE", siteCode);
			cmd.addParameter("@DEPT_CODE_2", deptCode2);
			cmd.addParameter("@EGOL_CODE", egolCode);
			cmd.addParameter("@DEGC_CODE_DUAL", degcCodeDual);
			cmd.addParameter("@LEVL_CODE_DUAL", levlCodeDual);
			cmd.addParameter("@DEPT_CODE_DUAL", deptCodeDual);
			cmd.addParameter("@COLL_CODE_DUAL", collCodeDual);
			cmd.addParameter("@MAJR_CODE_DUAL", majrCodeDual);
			cmd.addParameter("@BSKL_CODE", bsklCode);
			cmd.addParameter("@PRIM_ROLL_IND", primRollInd);
			cmd.addParameter("@PROGRAM_1", program1);
			cmd.addParameter("@TERM_CODE_CTLG_1", termCodeCtlg1);
			cmd.addParameter("@DEPT_CODE_1_2", deptCode12);
			cmd.addParameter("@MAJR_CODE_CONC_121", majrCodeConc121);
			cmd.addParameter("@MAJR_CODE_CONC_122", majrCodeConc122);
			cmd.addParameter("@MAJR_CODE_CONC_123", majrCodeConc123);
			cmd.addParameter("@SECD_ROLL_IND", secdRollInd);
			cmd.addParameter("@TERM_CODE_ADMIT_2", termCodeAdmit2);
			cmd.addParameter("@ADMT_CODE_2", admtCode2);
			cmd.addParameter("@PROGRAM_2", program2);
			cmd.addParameter("@TERM_CODE_CTLG_2", termCodeCtlg2);
			cmd.addParameter("@LEVL_CODE_2", levlCode2);
			cmd.addParameter("@CAMP_CODE_2", campCode2);
			cmd.addParameter("@DEPT_CODE_2_2", deptCode22);
			cmd.addParameter("@MAJR_CODE_CONC_221", majrCodeConc221);
			cmd.addParameter("@MAJR_CODE_CONC_222", majrCodeConc222);
			cmd.addParameter("@MAJR_CODE_CONC_223", majrCodeConc223);
			cmd.addParameter("@CURR_RULE_1", currRule1);
			cmd.addParameter("@CMJR_RULE_1_1", cmjrRule11);
			cmd.addParameter("@CCON_RULE_11_1", cconRule111);
			cmd.addParameter("@CCON_RULE_11_2", cconRule112);
			cmd.addParameter("@CCON_RULE_11_3", cconRule113);
			cmd.addParameter("@CMJR_RULE_1_2", cmjrRule12);
			cmd.addParameter("@CCON_RULE_12_1", cconRule121);
			cmd.addParameter("@CCON_RULE_12_2", cconRule122);
			cmd.addParameter("@CCON_RULE_12_3", cconRule123);
			cmd.addParameter("@CMNR_RULE_1_1", cmnrRule11);
			cmd.addParameter("@CMNR_RULE_1_2", cmnrRule12);
			cmd.addParameter("@CURR_RULE_2", currRule2);
			cmd.addParameter("@CMJR_RULE_2_1", cmjrRule21);
			cmd.addParameter("@CCON_RULE_21_1", cconRule211);
			cmd.addParameter("@CCON_RULE_21_2", cconRule212);
			cmd.addParameter("@CCON_RULE_21_3", cconRule213);
			cmd.addParameter("@CMJR_RULE_2_2", cmjrRule22);
			cmd.addParameter("@CCON_RULE_22_1", cconRule221);
			cmd.addParameter("@CCON_RULE_22_2", cconRule222);
			cmd.addParameter("@CCON_RULE_22_3", cconRule223);
			cmd.addParameter("@CMNR_RULE_2_1", cmnrRule21);
			cmd.addParameter("@CMNR_RULE_2_2", cmnrRule22);
			cmd.addParameter("@PREV_CODE", prevCode);
			cmd.addParameter("@TERM_CODE_PREV", termCodePrev);
			cmd.addParameter("@CAST_CODE", castCode);
			cmd.addParameter("@TERM_CODE_CAST", termCodeCast);
			cmd.addParameter("@APPL_TERM_CODE", applTermCode);
			cmd.addParameter("@APPL_NO", applNo);
			cmd.addParameter("@OVERRIDE_SEVERITY_IN", overrideSeverityIn);
				
			cmd.execute();


		}
		
		public static void pGetNextId(Ref<NString> idOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKMODS.P_GET_NEXT_ID", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ID_OUT", NString.class);
				
			cmd.execute();
			idOut.val = cmd.getParameterValue("@ID_OUT", NString.class);


		}
		
		public static void pGetNextPidm(Ref<NNumber> pidmOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKMODS.P_GET_NEXT_PIDM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_OUT", NNumber.class);
				
			cmd.execute();
			pidmOut.val = cmd.getParameterValue("@PIDM_OUT", NNumber.class);


		}
		
		public static void pInsertAttribute(NString termIn,NNumber pidmIn,NNumber applnoIn,NNumber studyPath) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKMODS.P_INSERT_ATTRIBUTE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@APPLNO_IN", applnoIn);
			cmd.addParameter("@STUDY_PATH", studyPath);
				
			cmd.execute();


		}
		
		public static void pInsertCohort(NString termIn,NNumber pidmIn,NNumber applnoIn,NNumber studyPath) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKMODS.P_INSERT_COHORT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@APPLNO_IN", applnoIn);
			cmd.addParameter("@STUDY_PATH", studyPath);
				
			cmd.execute();


		}
		
		public static void pInsertCommplan(NNumber pidmIn,NString sourceIndIn,NString actionIndIn,NString typeIndIn,NString termIn,NNumber ccolSeqnoIn,NString campIn,NString levlIn,NString collIn,NString degcIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKMODS.P_INSERT_COMMPLAN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@SOURCE_IND_IN", sourceIndIn);
			cmd.addParameter("@ACTION_IND_IN", actionIndIn);
			cmd.addParameter("@TYPE_IND_IN", typeIndIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CCOL_SEQNO_IN", ccolSeqnoIn);
			cmd.addParameter("@CAMP_IN", campIn);
			cmd.addParameter("@LEVL_IN", levlIn);
			cmd.addParameter("@COLL_IN", collIn);
			cmd.addParameter("@DEGC_IN", degcIn);
				
			cmd.execute();


		}
		
		public static void pInsertSabiden(NNumber aidmIn,NNumber pidmIn,NString recTypeIn,NString idIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKMODS.P_INSERT_SABIDEN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AIDM_IN", aidmIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@REC_TYPE_IN", recTypeIn);
			cmd.addParameter("@ID_IN", idIn);
				
			cmd.execute();


		}
		
		public static void pInsertSarrsrc(NNumber pidmIn,NString termIn,NNumber applnoIn,NString sbgiIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKMODS.P_INSERT_SARRSRC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@APPLNO_IN", applnoIn);
			cmd.addParameter("@SBGI_IN", sbgiIn);
				
			cmd.execute();


		}
		
		public static void pInsertSpriden(NNumber pidmIn,NString idIn,NString lastNameIn,NString firstNameIn,NString miIn,NString entityIn,NString userIn,NString originIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKMODS.P_INSERT_SPRIDEN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@ID_IN", idIn);
			cmd.addParameter("@LAST_NAME_IN", lastNameIn);
			cmd.addParameter("@FIRST_NAME_IN", firstNameIn);
			cmd.addParameter("@MI_IN", miIn);
			cmd.addParameter("@ENTITY_IN", entityIn);
			cmd.addParameter("@USER_IN", userIn);
			cmd.addParameter("@ORIGIN_IN", originIn);
				
			cmd.execute();


		}
		
		public static void pInsertSrrrsrc(NNumber pidmIn,NString termIn,NNumber adminSeqnoIn,NString sbgiIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKMODS.P_INSERT_SRRRSRC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@ADMIN_SEQNO_IN", adminSeqnoIn);
			cmd.addParameter("@SBGI_IN", sbgiIn);
				
			cmd.execute();


		}
		
		public static void pUpdateSaradapApst(NNumber pidmIn,NString termCodeIn,NNumber applnoIn,NString apstCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKMODS.P_UPDATE_SARADAP_APST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_CODE_IN", termCodeIn);
			cmd.addParameter("@APPLNO_IN", applnoIn);
			cmd.addParameter("@APST_CODE_IN", apstCodeIn);
				
			cmd.execute();


		}
		
		public static void pUpdateSarheadApplStatus(NNumber aidmIn,NNumber applnoIn,NString statusCodeIn,NString processIndIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKMODS.P_UPDATE_SARHEAD_APPL_STATUS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AIDM_IN", aidmIn);
			cmd.addParameter("@APPLNO_IN", applnoIn);
			cmd.addParameter("@STATUS_CODE_IN", statusCodeIn);
			cmd.addParameter("@PROCESS_IND_IN", processIndIn);
				
			cmd.execute();


		}
		
		public static void pUpdateSarheadPersStatus(NNumber aidmIn,NNumber applnoIn,NString statusCodeIn,NString processIndIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKMODS.P_UPDATE_SARHEAD_PERS_STATUS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AIDM_IN", aidmIn);
			cmd.addParameter("@APPLNO_IN", applnoIn);
			cmd.addParameter("@STATUS_CODE_IN", statusCodeIn);
			cmd.addParameter("@PROCESS_IND_IN", processIndIn);
				
			cmd.execute();


		}
		
		public static void pUpdateSobseqn(NString functionIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKMODS.P_UPDATE_SOBSEQN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@FUNCTION_IN", functionIn);
				
			cmd.execute();


		}
		
	
	
	
}
