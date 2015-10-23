package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwcksmlt {
		public static NNumber FchkAdjSmbarulAddtnlText(NNumber param1,NString param2,NNumber param3,NString param4,NString param5) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMLT.CHK_ADJ_SMBARUL_ADDTNL_TEXT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PARAM1", param1);
			cmd.addParameter("@PARAM2", param2);
			cmd.addParameter("@PARAM3", param3);
			cmd.addParameter("@PARAM4", param4);
			cmd.addParameter("@PARAM5", param5);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FchkAdjSmbgrulAddtnlText(NNumber param1,NString param2,NNumber param3,NString param4,NString param5) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMLT.CHK_ADJ_SMBGRUL_ADDTNL_TEXT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PARAM1", param1);
			cmd.addParameter("@PARAM2", param2);
			cmd.addParameter("@PARAM3", param3);
			cmd.addParameter("@PARAM4", param4);
			cmd.addParameter("@PARAM5", param5);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FchkSmbarulAddtnlText(NString param1,NNumber param2,NString param3,NString param4) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMLT.CHK_SMBARUL_ADDTNL_TEXT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PARAM1", param1);
			cmd.addParameter("@PARAM2", param2);
			cmd.addParameter("@PARAM3", param3);
			cmd.addParameter("@PARAM4", param4);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FchkSmbgrulAddtnlText(NString param1,NNumber param2,NString param3,NString param4) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMLT.CHK_SMBGRUL_ADDTNL_TEXT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PARAM1", param1);
			cmd.addParameter("@PARAM2", param2);
			cmd.addParameter("@PARAM3", param3);
			cmd.addParameter("@PARAM4", param4);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FchkSmrdousAreaRuleCrseCnt(NNumber param1,NNumber param2,NString param3,NNumber param4,NString param5) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMLT.CHK_SMRDOUS_AREA_RULE_CRSE_CNT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PARAM1", param1);
			cmd.addParameter("@PARAM2", param2);
			cmd.addParameter("@PARAM3", param3);
			cmd.addParameter("@PARAM4", param4);
			cmd.addParameter("@PARAM5", param5);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FchkSmrdousGrpRuleCrseCnt(NNumber param1,NNumber param2,NString param3,NString param4,NNumber param5,NString param6) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMLT.CHK_SMRDOUS_GRP_RULE_CRSE_CNT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PARAM1", param1);
			cmd.addParameter("@PARAM2", param2);
			cmd.addParameter("@PARAM3", param3);
			cmd.addParameter("@PARAM4", param4);
			cmd.addParameter("@PARAM5", param5);
			cmd.addParameter("@PARAM6", param6);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void decodeSetSubset(NString prevSet,NNumber prevSub,NString curSet,NNumber curSub,Ref<NBool> openParen,Ref<NBool> firstReq,Ref<NString> setSub) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMLT.DECODE_SET_SUBSET", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PREV_SET", prevSet);
			cmd.addParameter("@PREV_SUB", prevSub);
			cmd.addParameter("@CUR_SET", curSet);
			cmd.addParameter("@CUR_SUB", curSub);
			cmd.addParameter("@OPEN_PAREN", openParen, true);
			cmd.addParameter("@FIRST_REQ", firstReq, true);
			cmd.addParameter("@SET_SUB", NString.class);
				
			cmd.execute();
			openParen.val = cmd.getParameterValue("@OPEN_PAREN", NBool.class);
			firstReq.val = cmd.getParameterValue("@FIRST_REQ", NBool.class);
			setSub.val = cmd.getParameterValue("@SET_SUB", NString.class);


		}
		
		public static NString FdetConvColor(NString param1,NString param2) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMLT.DET_CONV_COLOR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PARAM1", param1);
			cmd.addParameter("@PARAM2", param2);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool fDisplaySeparator() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMLT.F_DISPLAY_SEPARATOR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fGenReqLabelDisp(NNumber param1,NNumber param2) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMLT.F_GEN_REQ_LABEL_DISP", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PARAM1", param1);
			cmd.addParameter("@PARAM2", param2);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NString fGenoutputareatext(NNumber pidm,NString area,NString recSource,NString term,NString dfltText) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMLT.F_GENOUTPUTAREATEXT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@AREA", area);
			cmd.addParameter("@REC_SOURCE", recSource);
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@DFLT_TEXT", dfltText);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetGrpRuleMetInd(NNumber pidmIn,NNumber reqNoIn,NString areaIn,NString groupIn,NString ruleIn,NString termIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMLT.F_GET_GRP_RULE_MET_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@REQ_NO_IN", reqNoIn);
			cmd.addParameter("@AREA_IN", areaIn);
			cmd.addParameter("@GROUP_IN", groupIn);
			cmd.addParameter("@RULE_IN", ruleIn);
			cmd.addParameter("@TERM_IN", termIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fGetadvrpidm(NNumber pidm,NString term) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMLT.F_GETADVRPIDM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@TERM", term);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fGetemailaddress(NNumber pidmIn,NString emailCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMLT.F_GETEMAILADDRESS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@EMAIL_CODE_IN", emailCodeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetemailnamestr(NNumber pidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMLT.F_GETEMAILNAMESTR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM", pidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fSmracmtRowcount(NString area,NString term,NString dfltText) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMLT.F_SMRACMT_ROWCOUNT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@AREA", area);
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@DFLT_TEXT", dfltText);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fSmrgcmtRowcount(NString grp,NString term,NString dfltText) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMLT.F_SMRGCMT_ROWCOUNT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@GRP", grp);
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@DFLT_TEXT", dfltText);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fSmrsacmRowcount(NNumber pidm,NString area,NString term,NString dfltText) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMLT.F_SMRSACM_ROWCOUNT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@AREA", area);
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@DFLT_TEXT", dfltText);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fSmrsgcmRowcount(NNumber pidm,NString grp,NString term,NString dfltText) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMLT.F_SMRSGCM_ROWCOUNT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@GRP", grp);
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@DFLT_TEXT", dfltText);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString FgetAdjAreaKeyRuleDesc(NString param1,NString param2,NString param3,NNumber param4) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMLT.GET_ADJ_AREA_KEY_RULE_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PARAM1", param1);
			cmd.addParameter("@PARAM2", param2);
			cmd.addParameter("@PARAM3", param3);
			cmd.addParameter("@PARAM4", param4);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetAdjGroupKeyRuleDesc(NString param1,NString param2,NString param3,NNumber param4) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMLT.GET_ADJ_GROUP_KEY_RULE_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PARAM1", param1);
			cmd.addParameter("@PARAM2", param2);
			cmd.addParameter("@PARAM3", param3);
			cmd.addParameter("@PARAM4", param4);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetAlibLevlCodeStu(NString param1) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMLT.GET_ALIB_LEVL_CODE_STU", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PARAM1", param1);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetAreaDesc(NString param1) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMLT.GET_AREA_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PARAM1", param1);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetAreaKeyRuleDesc(NString param1,NString param2,NString param3) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMLT.GET_AREA_KEY_RULE_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PARAM1", param1);
			cmd.addParameter("@PARAM2", param2);
			cmd.addParameter("@PARAM3", param3);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetCampDesc(NString param1) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMLT.GET_CAMP_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PARAM1", param1);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetCollDesc(NString param1) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMLT.GET_COLL_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PARAM1", param1);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetDegcDesc(NString param1) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMLT.GET_DEGC_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PARAM1", param1);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NDate FgetExpGradDate(NNumber param1,NNumber param2) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMLT.GET_EXP_GRAD_DATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@PARAM1", param1);
			cmd.addParameter("@PARAM2", param2);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
		public static NString FgetGroupDesc(NString param1) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMLT.GET_GROUP_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PARAM1", param1);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetGroupKeyRuleDesc(NString param1,NString param2,NString param3) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMLT.GET_GROUP_KEY_RULE_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PARAM1", param1);
			cmd.addParameter("@PARAM2", param2);
			cmd.addParameter("@PARAM3", param3);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetLevlDesc(NString param1) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMLT.GET_LEVL_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PARAM1", param1);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber FgetProgIpCredTot(NNumber param1,NNumber param2) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMLT.GET_PROG_IP_CRED_TOT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PARAM1", param1);
			cmd.addParameter("@PARAM2", param2);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FgetProgIpCrseTot(NNumber param1,NNumber param2) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMLT.GET_PROG_IP_CRSE_TOT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PARAM1", param1);
			cmd.addParameter("@PARAM2", param2);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FgetProgTransCredTot(NNumber param1,NNumber param2) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMLT.GET_PROG_TRANS_CRED_TOT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PARAM1", param1);
			cmd.addParameter("@PARAM2", param2);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FgetProgUnusedCredTot(NNumber param1,NNumber param2) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMLT.GET_PROG_UNUSED_CRED_TOT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PARAM1", param1);
			cmd.addParameter("@PARAM2", param2);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FgetProgUnusedCrseTot(NNumber param1,NNumber param2) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMLT.GET_PROG_UNUSED_CRSE_TOT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PARAM1", param1);
			cmd.addParameter("@PARAM2", param2);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString FgetProgramDesc(NString param1) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMLT.GET_PROGRAM_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PARAM1", param1);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NDate FgetStdnGradDate(NNumber param1,NString param2) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMLT.GET_STDN_GRAD_DATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@PARAM1", param1);
			cmd.addParameter("@PARAM2", param2);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
		public static void pCommonoutputheader(NString callProc,NString printerFriendly,Ref<NString> evalTermOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMLT.P_COMMONOUTPUTHEADER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CALL_PROC", callProc);
			cmd.addParameter("@PRINTER_FRIENDLY", printerFriendly);
			cmd.addParameter("@EVAL_TERM_OUT", NString.class);
				
			cmd.execute();
			evalTermOut.val = cmd.getParameterValue("@EVAL_TERM_OUT", NString.class);


		}
		
		public static void pDecodeSubjLink(Ref<NString> catlgTermIn,Ref<NString> subjCodeIn,Ref<NString> crseLowIn,Ref<NString> crseHighIn,Ref<NNumber> requestNoIn,Ref<NString> printerFriendly,NString detlMetInd,NString areaMetInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMLT.P_DECODE_SUBJ_LINK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CATLG_TERM_IN", catlgTermIn, true);
			cmd.addParameter("@SUBJ_CODE_IN", subjCodeIn, true);
			cmd.addParameter("@CRSE_LOW_IN", crseLowIn, true);
			cmd.addParameter("@CRSE_HIGH_IN", crseHighIn, true);
			cmd.addParameter("@REQUEST_NO_IN", requestNoIn, true);
			cmd.addParameter("@PRINTER_FRIENDLY", printerFriendly, true);
			cmd.addParameter("@DETL_MET_IND", detlMetInd);
			cmd.addParameter("@AREA_MET_IND", areaMetInd);
				
			cmd.execute();
			catlgTermIn.val = cmd.getParameterValue("@CATLG_TERM_IN", NString.class);
			subjCodeIn.val = cmd.getParameterValue("@SUBJ_CODE_IN", NString.class);
			crseLowIn.val = cmd.getParameterValue("@CRSE_LOW_IN", NString.class);
			crseHighIn.val = cmd.getParameterValue("@CRSE_HIGH_IN", NString.class);
			requestNoIn.val = cmd.getParameterValue("@REQUEST_NO_IN", NNumber.class);
			printerFriendly.val = cmd.getParameterValue("@PRINTER_FRIENDLY", NString.class);


		}
		
		public static void pDispevaldetailreq(NNumber requestNo,NString printerFriendly) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMLT.P_DISPEVALDETAILREQ", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@REQUEST_NO", requestNo);
			cmd.addParameter("@PRINTER_FRIENDLY", printerFriendly);
				
			cmd.execute();


		}
		
		public static void pDispevalgeneralreq(NNumber requestNo,NString printerFriendly) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMLT.P_DISPEVALGENERALREQ", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@REQUEST_NO", requestNo);
			cmd.addParameter("@PRINTER_FRIENDLY", printerFriendly);
				
			cmd.execute();


		}
		
		public static void pFormatAreaDetailText(NNumber pidmIn,NString sourceIn,NString areaIn,NString termIn,NString metIndIn,NString gcInd,Ref<NString> dfltTextOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMLT.P_FORMAT_AREA_DETAIL_TEXT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@SOURCE_IN", sourceIn);
			cmd.addParameter("@AREA_IN", areaIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@MET_IND_IN", metIndIn);
			cmd.addParameter("@GC_IND", gcInd);
			cmd.addParameter("@DFLT_TEXT_OUT", NString.class);
				
			cmd.execute();
			dfltTextOut.val = cmd.getParameterValue("@DFLT_TEXT_OUT", NString.class);


		}
		
		public static void pFormatDetailTitleBar() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMLT.P_FORMAT_DETAIL_TITLE_BAR", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pFormatGroupDetailText(NNumber pidmIn,NString sourceIn,NString groupIn,NString termIn,NString metIndIn,Ref<NString> dfltTextOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMLT.P_FORMAT_GROUP_DETAIL_TEXT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@SOURCE_IN", sourceIn);
			cmd.addParameter("@GROUP_IN", groupIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@MET_IND_IN", metIndIn);
			cmd.addParameter("@DFLT_TEXT_OUT", NString.class);
				
			cmd.execute();
			dfltTextOut.val = cmd.getParameterValue("@DFLT_TEXT_OUT", NString.class);


		}
		
		public static void pFormatMetBar(NString param1,NNumber param2,NNumber param3,NString param4,NString param5,NString param6,NString param7) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMLT.P_FORMAT_MET_BAR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARAM1", param1);
			cmd.addParameter("@PARAM2", param2);
			cmd.addParameter("@PARAM3", param3);
			cmd.addParameter("@PARAM4", param4);
			cmd.addParameter("@PARAM5", param5);
			cmd.addParameter("@PARAM6", param6);
			cmd.addParameter("@PARAM7", param7);
				
			cmd.execute();


		}
		
		public static void pFormatPgenReqments(NNumber reqCredits,NNumber reqCourses,NNumber actCredits,NNumber actCourses) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMLT.P_FORMAT_PGEN_REQMENTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@REQ_CREDITS", reqCredits);
			cmd.addParameter("@REQ_COURSES", reqCourses);
			cmd.addParameter("@ACT_CREDITS", actCredits);
			cmd.addParameter("@ACT_COURSES", actCourses);
				
			cmd.execute();


		}
		
		public static void pFormatProgramHdrText(NNumber pidmIn,NString sourceIn,NString progIn,NString termIn,NString metIndIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMLT.P_FORMAT_PROGRAM_HDR_TEXT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@SOURCE_IN", sourceIn);
			cmd.addParameter("@PROG_IN", progIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@MET_IND_IN", metIndIn);
				
			cmd.execute();


		}
		
		public static void pFormatSeparator(NString textIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMLT.P_FORMAT_SEPARATOR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TEXT_IN", textIn);
				
			cmd.execute();


		}
		
		public static void pGenreqoutput(NNumber pidm,NNumber requestNo,NString term) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMLT.P_GENREQOUTPUT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@REQUEST_NO", requestNo);
			cmd.addParameter("@TERM", term);
				
			cmd.execute();


		}
		
		public static NString FprintRequirements(NNumber reqCredits,NNumber reqCourses,NString connector,NNumber actCredits,NNumber actCourses) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMLT.PRINT_REQUIREMENTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@REQ_CREDITS", reqCredits);
			cmd.addParameter("@REQ_COURSES", reqCourses);
			cmd.addParameter("@CONNECTOR", connector);
			cmd.addParameter("@ACT_CREDITS", actCredits);
			cmd.addParameter("@ACT_COURSES", actCourses);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FreqConv(NString param1) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMLT.REQ_CONV", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PARAM1", param1);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FreqConvColor(NString param1) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMLT.REQ_CONV_COLOR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PARAM1", param1);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FreqNotmetColor(NString param1) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMLT.REQ_NOTMET_COLOR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PARAM1", param1);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		
		public static NString FreqNotmetColor(NNumber param1) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMLT.REQ_NOTMET_COLOR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PARAM1", param1);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	
}
