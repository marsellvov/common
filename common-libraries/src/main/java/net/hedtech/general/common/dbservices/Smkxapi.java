package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Smkxapi {
		public static NString fEncodexml(NString stringIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKXAPI.F_ENCODEXML", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@STRING_IN", stringIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NDate fGetExpGradDate(NNumber pPidmIn,NString pSourceIn,NNumber pDgmrSeqNoIn,NString pTermCodeCsource) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKXAPI.F_GET_EXP_GRAD_DATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@P_PIDM_IN", pPidmIn);
			cmd.addParameter("@P_SOURCE_IN", pSourceIn);
			cmd.addParameter("@P_DGMR_SEQ_NO_IN", pDgmrSeqNoIn);
			cmd.addParameter("@P_TERM_CODE_CSOURCE", pTermCodeCsource);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
		public static NString FgetDateFmt(NDate pDateIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKXAPI.GET_DATE_FMT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_DATE_IN", pDateIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pGetSmbaogn(NNumber pidmIn,NNumber requestNoIn,Ref<DataCursor> smbaognAllRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKXAPI.P_GET_SMBAOGN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@REQUEST_NO_IN", requestNoIn);
			cmd.addParameter("@SMBAOGN_ALL_REC", DataCursor.class);
				
			cmd.execute();
			smbaognAllRec.val = cmd.getParameterValue("@SMBAOGN_ALL_REC", DataCursor.class);


		}
		
		public static void pGetSmbaogn(NNumber pidmIn,NNumber requestNoIn,NString areaIn,Ref<DataCursor> smbaognRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKXAPI.P_GET_SMBAOGN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@REQUEST_NO_IN", requestNoIn);
			cmd.addParameter("@AREA_IN", areaIn);
			cmd.addParameter("@SMBAOGN_REC", DataCursor.class);
				
			cmd.execute();
			smbaognRec.val = cmd.getParameterValue("@SMBAOGN_REC", DataCursor.class);


		}
		
		public static void pGetSmbdrrq(NNumber pPidmIn,NNumber pRequestNoIn,NString pAreaIn,NString pGroupIn,NNumber pDorqCaaSeqno,NString pDorqRule,Ref<DataCursor> smbdrrqRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKXAPI.P_GET_SMBDRRQ", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM_IN", pPidmIn);
			cmd.addParameter("@P_REQUEST_NO_IN", pRequestNoIn);
			cmd.addParameter("@P_AREA_IN", pAreaIn);
			cmd.addParameter("@P_GROUP_IN", pGroupIn);
			cmd.addParameter("@P_DORQ_CAA_SEQNO", pDorqCaaSeqno);
			cmd.addParameter("@P_DORQ_RULE", pDorqRule);
			cmd.addParameter("@SMBDRRQ_REC", DataCursor.class);
				
			cmd.execute();
			smbdrrqRec.val = cmd.getParameterValue("@SMBDRRQ_REC", DataCursor.class);


		}
		
		public static void pGetSmbgogn(NNumber pidmIn,NNumber requestNoIn,NString areaIn,NString groupIn,Ref<DataCursor> smbgognRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKXAPI.P_GET_SMBGOGN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@REQUEST_NO_IN", requestNoIn);
			cmd.addParameter("@AREA_IN", areaIn);
			cmd.addParameter("@GROUP_IN", groupIn);
			cmd.addParameter("@SMBGOGN_REC", DataCursor.class);
				
			cmd.execute();
			smbgognRec.val = cmd.getParameterValue("@SMBGOGN_REC", DataCursor.class);


		}
		
		public static void pGetSmbpogn(NNumber pidmIn,NNumber requestNoIn,NBool applyFunc,Ref<DataCursor> smbpognRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKXAPI.P_GET_SMBPOGN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@REQUEST_NO_IN", requestNoIn);
			cmd.addParameter("@APPLY_FUNC", applyFunc);
			cmd.addParameter("@SMBPOGN_REC", DataCursor.class);
				
			cmd.execute();
			smbpognRec.val = cmd.getParameterValue("@SMBPOGN_REC", DataCursor.class);


		}
		
		public static void pGetSmbslib(NNumber pPidmIn,Ref<DataCursor> smbslibRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKXAPI.P_GET_SMBSLIB", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM_IN", pPidmIn);
			cmd.addParameter("@SMBSLIB_REC", DataCursor.class);
				
			cmd.execute();
			smbslibRec.val = cmd.getParameterValue("@SMBSLIB_REC", DataCursor.class);


		}
		
		public static void pGetSmbwcrl(NString termIn,Ref<DataCursor> smbwcrlRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKXAPI.P_GET_SMBWCRL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@SMBWCRL_REC", DataCursor.class);
				
			cmd.execute();
			smbwcrlRec.val = cmd.getParameterValue("@SMBWCRL_REC", DataCursor.class);


		}
		
		public static void pGetSmraccm(NString areaIn,NNumber caaSeqnoIn,NString dorqTermEff,NString prntCodeIn,Ref<DataCursor> smraccmRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKXAPI.P_GET_SMRACCM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AREA_IN", areaIn);
			cmd.addParameter("@CAA_SEQNO_IN", caaSeqnoIn);
			cmd.addParameter("@DORQ_TERM_EFF", dorqTermEff);
			cmd.addParameter("@PRNT_CODE_IN", prntCodeIn);
			cmd.addParameter("@SMRACCM_REC", DataCursor.class);
				
			cmd.execute();
			smraccmRec.val = cmd.getParameterValue("@SMRACCM_REC", DataCursor.class);


		}
		
		public static void pGetSmracmt(NString areaIn,NString termIn,NString dfltTextIn,Ref<DataCursor> smracmtRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKXAPI.P_GET_SMRACMT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AREA_IN", areaIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@DFLT_TEXT_IN", dfltTextIn);
			cmd.addParameter("@SMRACMT_REC", DataCursor.class);
				
			cmd.execute();
			smracmtRec.val = cmd.getParameterValue("@SMRACMT_REC", DataCursor.class);


		}
		
		public static void pGetSmraogd(NNumber pidmIn,NNumber requestNoIn,NString areaIn,Ref<DataCursor> smraogdRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKXAPI.P_GET_SMRAOGD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@REQUEST_NO_IN", requestNoIn);
			cmd.addParameter("@AREA_IN", areaIn);
			cmd.addParameter("@SMRAOGD_REC", DataCursor.class);
				
			cmd.execute();
			smraogdRec.val = cmd.getParameterValue("@SMRAOGD_REC", DataCursor.class);


		}
		
		public static void pGetSmraogd(NNumber pidmIn,NNumber requestNoIn,NString areaIn,NString grdeCodeIn,Ref<DataCursor> smraogdRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKXAPI.P_GET_SMRAOGD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@REQUEST_NO_IN", requestNoIn);
			cmd.addParameter("@AREA_IN", areaIn);
			cmd.addParameter("@GRDE_CODE_IN", grdeCodeIn);
			cmd.addParameter("@SMRAOGD_REC", DataCursor.class);
				
			cmd.execute();
			smraogdRec.val = cmd.getParameterValue("@SMRAOGD_REC", DataCursor.class);


		}
		
		public static void pGetSmraolv(NNumber pidmIn,NNumber requestNoIn,NString areaIn,Ref<DataCursor> smraolvRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKXAPI.P_GET_SMRAOLV", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@REQUEST_NO_IN", requestNoIn);
			cmd.addParameter("@AREA_IN", areaIn);
			cmd.addParameter("@SMRAOLV_REC", DataCursor.class);
				
			cmd.execute();
			smraolvRec.val = cmd.getParameterValue("@SMRAOLV_REC", DataCursor.class);


		}
		
		public static void pGetSmraosa(NNumber pidmIn,NNumber requestNoIn,NString areaIn,Ref<DataCursor> smraosaRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKXAPI.P_GET_SMRAOSA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@REQUEST_NO_IN", requestNoIn);
			cmd.addParameter("@AREA_IN", areaIn);
			cmd.addParameter("@SMRAOSA_REC", DataCursor.class);
				
			cmd.execute();
			smraosaRec.val = cmd.getParameterValue("@SMRAOSA_REC", DataCursor.class);


		}
		
		public static void pGetSmraosa(NNumber pidmIn,NNumber requestNoIn,NString areaIn,NNumber aosaSeqnoIn,Ref<DataCursor> smraosaRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKXAPI.P_GET_SMRAOSA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@REQUEST_NO_IN", requestNoIn);
			cmd.addParameter("@AREA_IN", areaIn);
			cmd.addParameter("@AOSA_SEQNO_IN", aosaSeqnoIn);
			cmd.addParameter("@SMRAOSA_REC", DataCursor.class);
				
			cmd.execute();
			smraosaRec.val = cmd.getParameterValue("@SMRAOSA_REC", DataCursor.class);


		}
		
		public static void pGetSmrarcm(NString pAreaIn,NString pDrrqRuleIn,NNumber pDrrqRulSeqnoIn,NString pDrrqTermEffIn,NString pPrntCodeIn,Ref<DataCursor> smrarcmRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKXAPI.P_GET_SMRARCM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AREA_IN", pAreaIn);
			cmd.addParameter("@P_DRRQ_RULE_IN", pDrrqRuleIn);
			cmd.addParameter("@P_DRRQ_RUL_SEQNO_IN", pDrrqRulSeqnoIn);
			cmd.addParameter("@P_DRRQ_TERM_EFF_IN", pDrrqTermEffIn);
			cmd.addParameter("@P_PRNT_CODE_IN", pPrntCodeIn);
			cmd.addParameter("@SMRARCM_REC", DataCursor.class);
				
			cmd.execute();
			smrarcmRec.val = cmd.getParameterValue("@SMRARCM_REC", DataCursor.class);


		}
		
		public static void pGetSmrargc(NString areaIn,NString gradeIn,NString termIn,NString prntCodeIn,Ref<DataCursor> smrargcRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKXAPI.P_GET_SMRARGC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AREA_IN", areaIn);
			cmd.addParameter("@GRADE_IN", gradeIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PRNT_CODE_IN", prntCodeIn);
			cmd.addParameter("@SMRARGC_REC", DataCursor.class);
				
			cmd.execute();
			smrargcRec.val = cmd.getParameterValue("@SMRARGC_REC", DataCursor.class);


		}
		
		public static void pGetSmrarlt(NString pAreaIn,NString pDrrqSourceIndIn,NString pDorqRuleIn,NString pPrntCodeIn,NString pDorqTermCodeEffIn,Ref<DataCursor> smrarltRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKXAPI.P_GET_SMRARLT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AREA_IN", pAreaIn);
			cmd.addParameter("@P_DRRQ_SOURCE_IND_IN", pDrrqSourceIndIn);
			cmd.addParameter("@P_DORQ_RULE_IN", pDorqRuleIn);
			cmd.addParameter("@P_PRNT_CODE_IN", pPrntCodeIn);
			cmd.addParameter("@P_DORQ_TERM_CODE_EFF_IN", pDorqTermCodeEffIn);
			cmd.addParameter("@SMRARLT_REC", DataCursor.class);
				
			cmd.execute();
			smrarltRec.val = cmd.getParameterValue("@SMRARLT_REC", DataCursor.class);


		}
		
		public static void pGetSmrarsc(NString areaIn,NString termIn,NNumber seqnoIn,NString prntCodeIn,Ref<DataCursor> smrarscRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKXAPI.P_GET_SMRARSC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AREA_IN", areaIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@SEQNO_IN", seqnoIn);
			cmd.addParameter("@PRNT_CODE_IN", prntCodeIn);
			cmd.addParameter("@SMRARSC_REC", DataCursor.class);
				
			cmd.execute();
			smrarscRec.val = cmd.getParameterValue("@SMRARSC_REC", DataCursor.class);


		}
		
		public static void pGetSmrcprt(NString smrcprtIn,Ref<DataCursor> smrcprtRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKXAPI.P_GET_SMRCPRT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SMRCPRT_IN", smrcprtIn);
			cmd.addParameter("@SMRCPRT_REC", DataCursor.class);
				
			cmd.execute();
			smrcprtRec.val = cmd.getParameterValue("@SMRCPRT_REC", DataCursor.class);


		}
		
		public static void pGetSmrdoan(NNumber pidmIn,NNumber requestNoIn,NString programIn,Ref<DataCursor> smrdoanRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKXAPI.P_GET_SMRDOAN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@REQUEST_NO_IN", requestNoIn);
			cmd.addParameter("@PROGRAM_IN", programIn);
			cmd.addParameter("@SMRDOAN_REC", DataCursor.class);
				
			cmd.execute();
			smrdoanRec.val = cmd.getParameterValue("@SMRDOAN_REC", DataCursor.class);


		}
		
		public static void pGetSmrdocn(NNumber pidmIn,NNumber requestNoIn,NString programIn,Ref<DataCursor> smrdocnRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKXAPI.P_GET_SMRDOCN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@REQUEST_NO_IN", requestNoIn);
			cmd.addParameter("@PROGRAM_IN", programIn);
			cmd.addParameter("@SMRDOCN_REC", DataCursor.class);
				
			cmd.execute();
			smrdocnRec.val = cmd.getParameterValue("@SMRDOCN_REC", DataCursor.class);


		}
		
		public static void pGetSmrdoex(NNumber pPidmIn,NNumber pRequestNoIn,NString pAreaIn,NString pGroupIn,NNumber pDorqCaaSeqno,NString pDorqTermCodeEff,Ref<DataCursor> smrdoexRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKXAPI.P_GET_SMRDOEX", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM_IN", pPidmIn);
			cmd.addParameter("@P_REQUEST_NO_IN", pRequestNoIn);
			cmd.addParameter("@P_AREA_IN", pAreaIn);
			cmd.addParameter("@P_GROUP_IN", pGroupIn);
			cmd.addParameter("@P_DORQ_CAA_SEQNO", pDorqCaaSeqno);
			cmd.addParameter("@P_DORQ_TERM_CODE_EFF", pDorqTermCodeEff);
			cmd.addParameter("@SMRDOEX_REC", DataCursor.class);
				
			cmd.execute();
			smrdoexRec.val = cmd.getParameterValue("@SMRDOEX_REC", DataCursor.class);


		}
		
		public static void pGetSmrdolv(NNumber pPidmIn,NNumber pRequestNoIn,NString pAreaIn,NString pGroupIn,NNumber pDorqCaaSeqno,NString pDorqTermCodeEff,Ref<DataCursor> smrdolvRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKXAPI.P_GET_SMRDOLV", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM_IN", pPidmIn);
			cmd.addParameter("@P_REQUEST_NO_IN", pRequestNoIn);
			cmd.addParameter("@P_AREA_IN", pAreaIn);
			cmd.addParameter("@P_GROUP_IN", pGroupIn);
			cmd.addParameter("@P_DORQ_CAA_SEQNO", pDorqCaaSeqno);
			cmd.addParameter("@P_DORQ_TERM_CODE_EFF", pDorqTermCodeEff);
			cmd.addParameter("@SMRDOLV_REC", DataCursor.class);
				
			cmd.execute();
			smrdolvRec.val = cmd.getParameterValue("@SMRDOLV_REC", DataCursor.class);


		}
		
		public static void pGetSmrdorj(NNumber pidmIn,NNumber requestNoIn,Ref<DataCursor> smrdorjRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKXAPI.P_GET_SMRDORJ", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@REQUEST_NO_IN", requestNoIn);
			cmd.addParameter("@SMRDORJ_REC", DataCursor.class);
				
			cmd.execute();
			smrdorjRec.val = cmd.getParameterValue("@SMRDORJ_REC", DataCursor.class);


		}
		
		public static void pGetSmrdorqCaaSeqno(NNumber pidmIn,NNumber requestNoIn,NString areaIn,NString groupIn,NNumber caaSeqnoIn,NString setSubsetIn,Ref<DataCursor> smrdorqCaaRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKXAPI.P_GET_SMRDORQ_CAA_SEQNO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@REQUEST_NO_IN", requestNoIn);
			cmd.addParameter("@AREA_IN", areaIn);
			cmd.addParameter("@GROUP_IN", groupIn);
			cmd.addParameter("@CAA_SEQNO_IN", caaSeqnoIn);
			cmd.addParameter("@SET_SUBSET_IN", setSubsetIn);
			cmd.addParameter("@SMRDORQ_CAA_REC", DataCursor.class);
				
			cmd.execute();
			smrdorqCaaRec.val = cmd.getParameterValue("@SMRDORQ_CAA_REC", DataCursor.class);


		}
		
		public static void pGetSmrdorqCrse(NNumber pidmIn,NNumber requestNoIn,NString areaIn,NString groupIn,Ref<DataCursor> smrdorqCrseRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKXAPI.P_GET_SMRDORQ_CRSE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@REQUEST_NO_IN", requestNoIn);
			cmd.addParameter("@AREA_IN", areaIn);
			cmd.addParameter("@GROUP_IN", groupIn);
			cmd.addParameter("@SMRDORQ_CRSE_REC", DataCursor.class);
				
			cmd.execute();
			smrdorqCrseRec.val = cmd.getParameterValue("@SMRDORQ_CRSE_REC", DataCursor.class);


		}
		
		public static void pGetSmrdousArea(NNumber pidmIn,NNumber requestNoIn,NString areaIn,NString groupIn,NNumber caaSeqnoIn,Ref<DataCursor> smrdousAreaRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKXAPI.P_GET_SMRDOUS_AREA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@REQUEST_NO_IN", requestNoIn);
			cmd.addParameter("@AREA_IN", areaIn);
			cmd.addParameter("@GROUP_IN", groupIn);
			cmd.addParameter("@CAA_SEQNO_IN", caaSeqnoIn);
			cmd.addParameter("@SMRDOUS_AREA_REC", DataCursor.class);
				
			cmd.execute();
			smrdousAreaRec.val = cmd.getParameterValue("@SMRDOUS_AREA_REC", DataCursor.class);


		}
		
		public static void pGetSmrdousDetail(NNumber pidmIn,NNumber requestNoIn,NString areaIn,NString groupIn,NNumber caaSeqnoIn,NString dorqRuleIn,NString rdrrqRuleIn,NNumber rulSeqnoIn,NString termCodeEffIn,Ref<DataCursor> smrdousDetailRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKXAPI.P_GET_SMRDOUS_DETAIL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@REQUEST_NO_IN", requestNoIn);
			cmd.addParameter("@AREA_IN", areaIn);
			cmd.addParameter("@GROUP_IN", groupIn);
			cmd.addParameter("@CAA_SEQNO_IN", caaSeqnoIn);
			cmd.addParameter("@DORQ_RULE_IN", dorqRuleIn);
			cmd.addParameter("@RDRRQ_RULE_IN", rdrrqRuleIn);
			cmd.addParameter("@RUL_SEQNO_IN", rulSeqnoIn);
			cmd.addParameter("@TERM_CODE_EFF_IN", termCodeEffIn);
			cmd.addParameter("@SMRDOUS_DETAIL_REC", DataCursor.class);
				
			cmd.execute();
			smrdousDetailRec.val = cmd.getParameterValue("@SMRDOUS_DETAIL_REC", DataCursor.class);


		}
		
		public static void pGetSmrdousIp(NNumber pidmIn,NNumber requestNoIn,NString programIn,Ref<DataCursor> smrdousIpRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKXAPI.P_GET_SMRDOUS_IP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@REQUEST_NO_IN", requestNoIn);
			cmd.addParameter("@PROGRAM_IN", programIn);
			cmd.addParameter("@SMRDOUS_IP_REC", DataCursor.class);
				
			cmd.execute();
			smrdousIpRec.val = cmd.getParameterValue("@SMRDOUS_IP_REC", DataCursor.class);


		}
		
		public static void pGetSmrdousRuleDetail(NNumber pPidmIn,NNumber pRequestNoIn,NString pAreaIn,NString pGroupIn,NNumber pRdrrqCaaSeqnoIn,NNumber pRdrrqRuleSeqnoIn,NString pBdrrqRuleIn,NString pTermCodeEffIn,Ref<DataCursor> smrdousRuleDetailRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKXAPI.P_GET_SMRDOUS_RULE_DETAIL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM_IN", pPidmIn);
			cmd.addParameter("@P_REQUEST_NO_IN", pRequestNoIn);
			cmd.addParameter("@P_AREA_IN", pAreaIn);
			cmd.addParameter("@P_GROUP_IN", pGroupIn);
			cmd.addParameter("@P_RDRRQ_CAA_SEQNO_IN", pRdrrqCaaSeqnoIn);
			cmd.addParameter("@P_RDRRQ_RULE_SEQNO_IN", pRdrrqRuleSeqnoIn);
			cmd.addParameter("@P_BDRRQ_RULE_IN", pBdrrqRuleIn);
			cmd.addParameter("@P_TERM_CODE_EFF_IN", pTermCodeEffIn);
			cmd.addParameter("@SMRDOUS_RULE_DETAIL_REC", DataCursor.class);
				
			cmd.execute();
			smrdousRuleDetailRec.val = cmd.getParameterValue("@SMRDOUS_RULE_DETAIL_REC", DataCursor.class);


		}
		
		public static void pGetSmrdrex(NNumber pPidmIn,NNumber pRequestNoIn,NString pAreaIn,NString pGroupIn,NNumber pDrrqCaaSeqnoIn,NString pBdrrqRuleIn,NNumber pRdrrqRulSeqnoIn,NString pTermCodeEffIn,Ref<DataCursor> smrdrexRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKXAPI.P_GET_SMRDREX", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM_IN", pPidmIn);
			cmd.addParameter("@P_REQUEST_NO_IN", pRequestNoIn);
			cmd.addParameter("@P_AREA_IN", pAreaIn);
			cmd.addParameter("@P_GROUP_IN", pGroupIn);
			cmd.addParameter("@P_DRRQ_CAA_SEQNO_IN", pDrrqCaaSeqnoIn);
			cmd.addParameter("@P_BDRRQ_RULE_IN", pBdrrqRuleIn);
			cmd.addParameter("@P_RDRRQ_RUL_SEQNO_IN", pRdrrqRulSeqnoIn);
			cmd.addParameter("@P_TERM_CODE_EFF_IN", pTermCodeEffIn);
			cmd.addParameter("@SMRDREX_REC", DataCursor.class);
				
			cmd.execute();
			smrdrexRec.val = cmd.getParameterValue("@SMRDREX_REC", DataCursor.class);


		}
		
		public static void pGetSmrdrlv(NNumber pPidmIn,NNumber pRequestNoIn,NString pAreaIn,NString pGroupIn,NNumber pDrrqCaaSeqnoIn,NString pBdrrqRuleIn,NNumber pRdrrqRulSeqnoIn,NString pTermCodeEffIn,Ref<DataCursor> smrdrlvRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKXAPI.P_GET_SMRDRLV", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM_IN", pPidmIn);
			cmd.addParameter("@P_REQUEST_NO_IN", pRequestNoIn);
			cmd.addParameter("@P_AREA_IN", pAreaIn);
			cmd.addParameter("@P_GROUP_IN", pGroupIn);
			cmd.addParameter("@P_DRRQ_CAA_SEQNO_IN", pDrrqCaaSeqnoIn);
			cmd.addParameter("@P_BDRRQ_RULE_IN", pBdrrqRuleIn);
			cmd.addParameter("@P_RDRRQ_RUL_SEQNO_IN", pRdrrqRulSeqnoIn);
			cmd.addParameter("@P_TERM_CODE_EFF_IN", pTermCodeEffIn);
			cmd.addParameter("@SMRDRLV_REC", DataCursor.class);
				
			cmd.execute();
			smrdrlvRec.val = cmd.getParameterValue("@SMRDRLV_REC", DataCursor.class);


		}
		
		public static void pGetSmrdrrq(NNumber pPidmIn,NNumber pRequestNoIn,NString pAreaIn,NString pGroupIn,NNumber pBdrrqCaaSeqnoIn,NString pBdrrqRuleIn,NString pBdrrqTermEffIn,Ref<DataCursor> smrdrrqRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKXAPI.P_GET_SMRDRRQ", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM_IN", pPidmIn);
			cmd.addParameter("@P_REQUEST_NO_IN", pRequestNoIn);
			cmd.addParameter("@P_AREA_IN", pAreaIn);
			cmd.addParameter("@P_GROUP_IN", pGroupIn);
			cmd.addParameter("@P_BDRRQ_CAA_SEQNO_IN", pBdrrqCaaSeqnoIn);
			cmd.addParameter("@P_BDRRQ_RULE_IN", pBdrrqRuleIn);
			cmd.addParameter("@P_BDRRQ_TERM_EFF_IN", pBdrrqTermEffIn);
			cmd.addParameter("@SMRDRRQ_REC", DataCursor.class);
				
			cmd.execute();
			smrdrrqRec.val = cmd.getParameterValue("@SMRDRRQ_REC", DataCursor.class);


		}
		
		public static void pGetSmrdrrq(NNumber pPidmIn,NNumber pRequestNoIn,NString pAreaIn,NString pGroupIn,NNumber pBdrrqCaaSeqnoIn,NString pBdrrqRuleIn,NString pBdrrqTermEffIn,NNumber pRulSeqno,Ref<DataCursor> smrdrrqRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKXAPI.P_GET_SMRDRRQ", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM_IN", pPidmIn);
			cmd.addParameter("@P_REQUEST_NO_IN", pRequestNoIn);
			cmd.addParameter("@P_AREA_IN", pAreaIn);
			cmd.addParameter("@P_GROUP_IN", pGroupIn);
			cmd.addParameter("@P_BDRRQ_CAA_SEQNO_IN", pBdrrqCaaSeqnoIn);
			cmd.addParameter("@P_BDRRQ_RULE_IN", pBdrrqRuleIn);
			cmd.addParameter("@P_BDRRQ_TERM_EFF_IN", pBdrrqTermEffIn);
			cmd.addParameter("@P_RUL_SEQNO", pRulSeqno);
			cmd.addParameter("@SMRDRRQ_REC", DataCursor.class);
				
			cmd.execute();
			smrdrrqRec.val = cmd.getParameterValue("@SMRDRRQ_REC", DataCursor.class);


		}
		
		public static void pGetSmrgccm(NString groupIn,NNumber caaSeqnoIn,NString dorqTermEff,NString prntCodeIn,Ref<DataCursor> smrgccmRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKXAPI.P_GET_SMRGCCM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@GROUP_IN", groupIn);
			cmd.addParameter("@CAA_SEQNO_IN", caaSeqnoIn);
			cmd.addParameter("@DORQ_TERM_EFF", dorqTermEff);
			cmd.addParameter("@PRNT_CODE_IN", prntCodeIn);
			cmd.addParameter("@SMRGCCM_REC", DataCursor.class);
				
			cmd.execute();
			smrgccmRec.val = cmd.getParameterValue("@SMRGCCM_REC", DataCursor.class);


		}
		
		public static void pGetSmrgcmt(NString grpIn,NString termIn,NString dfltTextIn,Ref<DataCursor> smrgcmtRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKXAPI.P_GET_SMRGCMT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@GRP_IN", grpIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@DFLT_TEXT_IN", dfltTextIn);
			cmd.addParameter("@SMRGCMT_REC", DataCursor.class);
				
			cmd.execute();
			smrgcmtRec.val = cmd.getParameterValue("@SMRGCMT_REC", DataCursor.class);


		}
		
		public static void pGetSmrgoat(NNumber pidmIn,NNumber requestNoIn,NString areaIn,Ref<DataCursor> smrgoatRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKXAPI.P_GET_SMRGOAT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@REQUEST_NO_IN", requestNoIn);
			cmd.addParameter("@AREA_IN", areaIn);
			cmd.addParameter("@SMRGOAT_REC", DataCursor.class);
				
			cmd.execute();
			smrgoatRec.val = cmd.getParameterValue("@SMRGOAT_REC", DataCursor.class);


		}
		
		public static void pGetSmrgogd(NNumber pidmIn,NNumber requestNoIn,NString areaIn,NString groupIn,Ref<DataCursor> smrgogdRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKXAPI.P_GET_SMRGOGD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@REQUEST_NO_IN", requestNoIn);
			cmd.addParameter("@AREA_IN", areaIn);
			cmd.addParameter("@GROUP_IN", groupIn);
			cmd.addParameter("@SMRGOGD_REC", DataCursor.class);
				
			cmd.execute();
			smrgogdRec.val = cmd.getParameterValue("@SMRGOGD_REC", DataCursor.class);


		}
		
		public static void pGetSmrgogd(NNumber pidmIn,NNumber requestNoIn,NString areaIn,NString groupIn,NString grdeCodeIn,Ref<DataCursor> smrgogdRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKXAPI.P_GET_SMRGOGD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@REQUEST_NO_IN", requestNoIn);
			cmd.addParameter("@AREA_IN", areaIn);
			cmd.addParameter("@GROUP_IN", groupIn);
			cmd.addParameter("@GRDE_CODE_IN", grdeCodeIn);
			cmd.addParameter("@SMRGOGD_REC", DataCursor.class);
				
			cmd.execute();
			smrgogdRec.val = cmd.getParameterValue("@SMRGOGD_REC", DataCursor.class);


		}
		
		public static void pGetSmrgolv(NNumber pidmIn,NNumber requestNoIn,NString areaIn,NString groupIn,Ref<DataCursor> smrgolvRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKXAPI.P_GET_SMRGOLV", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@REQUEST_NO_IN", requestNoIn);
			cmd.addParameter("@AREA_IN", areaIn);
			cmd.addParameter("@GROUP_IN", groupIn);
			cmd.addParameter("@SMRGOLV_REC", DataCursor.class);
				
			cmd.execute();
			smrgolvRec.val = cmd.getParameterValue("@SMRGOLV_REC", DataCursor.class);


		}
		
		public static void pGetSmrgosa(NNumber pidmIn,NNumber requestNoIn,NString areaIn,NString groupIn,Ref<DataCursor> smrgosaRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKXAPI.P_GET_SMRGOSA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@REQUEST_NO_IN", requestNoIn);
			cmd.addParameter("@AREA_IN", areaIn);
			cmd.addParameter("@GROUP_IN", groupIn);
			cmd.addParameter("@SMRGOSA_REC", DataCursor.class);
				
			cmd.execute();
			smrgosaRec.val = cmd.getParameterValue("@SMRGOSA_REC", DataCursor.class);


		}
		
		public static void pGetSmrgosa(NNumber pidmIn,NNumber requestNoIn,NString areaIn,NString groupIn,NNumber grsaSeqnoIn,Ref<DataCursor> smrgosaRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKXAPI.P_GET_SMRGOSA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@REQUEST_NO_IN", requestNoIn);
			cmd.addParameter("@AREA_IN", areaIn);
			cmd.addParameter("@GROUP_IN", groupIn);
			cmd.addParameter("@GRSA_SEQNO_IN", grsaSeqnoIn);
			cmd.addParameter("@SMRGOSA_REC", DataCursor.class);
				
			cmd.execute();
			smrgosaRec.val = cmd.getParameterValue("@SMRGOSA_REC", DataCursor.class);


		}
		
		public static void pGetSmrgrcm(NString pGroupIn,NString pDrrqRuleIn,NNumber pDrrqRulSeqnoIn,NString pDrrqTermEffIn,NString pPrntCodeIn,Ref<DataCursor> smrgrcmRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKXAPI.P_GET_SMRGRCM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_GROUP_IN", pGroupIn);
			cmd.addParameter("@P_DRRQ_RULE_IN", pDrrqRuleIn);
			cmd.addParameter("@P_DRRQ_RUL_SEQNO_IN", pDrrqRulSeqnoIn);
			cmd.addParameter("@P_DRRQ_TERM_EFF_IN", pDrrqTermEffIn);
			cmd.addParameter("@P_PRNT_CODE_IN", pPrntCodeIn);
			cmd.addParameter("@SMRGRCM_REC", DataCursor.class);
				
			cmd.execute();
			smrgrcmRec.val = cmd.getParameterValue("@SMRGRCM_REC", DataCursor.class);


		}
		
		public static void pGetSmrgrgc(NString groupIn,NString grdeCodeIn,NString termIn,NString prntCodeIn,Ref<DataCursor> smrgrgcRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKXAPI.P_GET_SMRGRGC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@GROUP_IN", groupIn);
			cmd.addParameter("@GRDE_CODE_IN", grdeCodeIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PRNT_CODE_IN", prntCodeIn);
			cmd.addParameter("@SMRGRGC_REC", DataCursor.class);
				
			cmd.execute();
			smrgrgcRec.val = cmd.getParameterValue("@SMRGRGC_REC", DataCursor.class);


		}
		
		public static void pGetSmrgrlt(NString pGroupIn,NString pDrrqSourceIndIn,NString pDorqRuleIn,NString pPrntCodeIn,NString pDorqTermCodeEffIn,Ref<DataCursor> smrgrltRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKXAPI.P_GET_SMRGRLT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_GROUP_IN", pGroupIn);
			cmd.addParameter("@P_DRRQ_SOURCE_IND_IN", pDrrqSourceIndIn);
			cmd.addParameter("@P_DORQ_RULE_IN", pDorqRuleIn);
			cmd.addParameter("@P_PRNT_CODE_IN", pPrntCodeIn);
			cmd.addParameter("@P_DORQ_TERM_CODE_EFF_IN", pDorqTermCodeEffIn);
			cmd.addParameter("@SMRGRLT_REC", DataCursor.class);
				
			cmd.execute();
			smrgrltRec.val = cmd.getParameterValue("@SMRGRLT_REC", DataCursor.class);


		}
		
		public static void pGetSmrgrsc(NString groupIn,NString termIn,NNumber seqnoIn,NString prntCodeIn,Ref<DataCursor> smrgrscRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKXAPI.P_GET_SMRGRSC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@GROUP_IN", groupIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@SEQNO_IN", seqnoIn);
			cmd.addParameter("@PRNT_CODE_IN", prntCodeIn);
			cmd.addParameter("@SMRGRSC_REC", DataCursor.class);
				
			cmd.execute();
			smrgrscRec.val = cmd.getParameterValue("@SMRGRSC_REC", DataCursor.class);


		}
		
		public static void pGetSmrpcmt(NString programIn,NString termIn,NString dfltTextIn,Ref<DataCursor> smrpcmtRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKXAPI.P_GET_SMRPCMT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PROGRAM_IN", programIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@DFLT_TEXT_IN", dfltTextIn);
			cmd.addParameter("@SMRPCMT_REC", DataCursor.class);
				
			cmd.execute();
			smrpcmtRec.val = cmd.getParameterValue("@SMRPCMT_REC", DataCursor.class);


		}
		
		public static void pGetSmrpcrs(NNumber pPidmIn,NNumber pRequestNoIn,Ref<DataCursor> smrpcrsRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKXAPI.P_GET_SMRPCRS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM_IN", pPidmIn);
			cmd.addParameter("@P_REQUEST_NO_IN", pRequestNoIn);
			cmd.addParameter("@SMRPCRS_REC", DataCursor.class);
				
			cmd.execute();
			smrpcrsRec.val = cmd.getParameterValue("@SMRPCRS_REC", DataCursor.class);


		}
		
		public static void pGetSmrpoat(NNumber pidmIn,NNumber requestNoIn,Ref<DataCursor> smrpoatRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKXAPI.P_GET_SMRPOAT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@REQUEST_NO_IN", requestNoIn);
			cmd.addParameter("@SMRPOAT_REC", DataCursor.class);
				
			cmd.execute();
			smrpoatRec.val = cmd.getParameterValue("@SMRPOAT_REC", DataCursor.class);


		}
		
		public static void pGetSmrpogd(NNumber pidmIn,NNumber requestNoIn,NString grdeCodeIn,Ref<DataCursor> smrpogdRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKXAPI.P_GET_SMRPOGD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@REQUEST_NO_IN", requestNoIn);
			cmd.addParameter("@GRDE_CODE_IN", grdeCodeIn);
			cmd.addParameter("@SMRPOGD_REC", DataCursor.class);
				
			cmd.execute();
			smrpogdRec.val = cmd.getParameterValue("@SMRPOGD_REC", DataCursor.class);


		}
		
		public static void pGetSmrpogd(NNumber pidmIn,NNumber requestNoIn,Ref<DataCursor> smrpogdRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKXAPI.P_GET_SMRPOGD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@REQUEST_NO_IN", requestNoIn);
			cmd.addParameter("@SMRPOGD_REC", DataCursor.class);
				
			cmd.execute();
			smrpogdRec.val = cmd.getParameterValue("@SMRPOGD_REC", DataCursor.class);


		}
		
		public static void pGetSmrpolv(NNumber pidmIn,NNumber requestNoIn,Ref<DataCursor> smrpolvRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKXAPI.P_GET_SMRPOLV", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@REQUEST_NO_IN", requestNoIn);
			cmd.addParameter("@SMRPOLV_REC", DataCursor.class);
				
			cmd.execute();
			smrpolvRec.val = cmd.getParameterValue("@SMRPOLV_REC", DataCursor.class);


		}
		
		public static void pGetSmrponc(NNumber pidmIn,NNumber requestNoIn,Ref<DataCursor> smrponcRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKXAPI.P_GET_SMRPONC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@REQUEST_NO_IN", requestNoIn);
			cmd.addParameter("@SMRPONC_REC", DataCursor.class);
				
			cmd.execute();
			smrponcRec.val = cmd.getParameterValue("@SMRPONC_REC", DataCursor.class);


		}
		
		public static void pGetSmrposa(NNumber pidmIn,NNumber requestNoIn,NNumber prsaSeqnoIn,Ref<DataCursor> smrposaRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKXAPI.P_GET_SMRPOSA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@REQUEST_NO_IN", requestNoIn);
			cmd.addParameter("@PRSA_SEQNO_IN", prsaSeqnoIn);
			cmd.addParameter("@SMRPOSA_REC", DataCursor.class);
				
			cmd.execute();
			smrposaRec.val = cmd.getParameterValue("@SMRPOSA_REC", DataCursor.class);


		}
		
		public static void pGetSmrposa(NNumber pidmIn,NNumber requestNoIn,Ref<DataCursor> smrposaRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKXAPI.P_GET_SMRPOSA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@REQUEST_NO_IN", requestNoIn);
			cmd.addParameter("@SMRPOSA_REC", DataCursor.class);
				
			cmd.execute();
			smrposaRec.val = cmd.getParameterValue("@SMRPOSA_REC", DataCursor.class);


		}
		
		public static void pGetSmrprgc(NString programIn,NString termIn,NString gradeIn,NString prntCodeIn,Ref<DataCursor> smrprgcRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKXAPI.P_GET_SMRPRGC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PROGRAM_IN", programIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@GRADE_IN", gradeIn);
			cmd.addParameter("@PRNT_CODE_IN", prntCodeIn);
			cmd.addParameter("@SMRPRGC_REC", DataCursor.class);
				
			cmd.execute();
			smrprgcRec.val = cmd.getParameterValue("@SMRPRGC_REC", DataCursor.class);


		}
		
		public static void pGetSmrprle(NString pProgramIn,Ref<DataCursor> smrprleRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKXAPI.P_GET_SMRPRLE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PROGRAM_IN", pProgramIn);
			cmd.addParameter("@SMRPRLE_REC", DataCursor.class);
				
			cmd.execute();
			smrprleRec.val = cmd.getParameterValue("@SMRPRLE_REC", DataCursor.class);


		}
		
		public static void pGetSmrprleWc(NString pProgramIn,Ref<DataCursor> smrprleRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKXAPI.P_GET_SMRPRLE_WC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PROGRAM_IN", pProgramIn);
			cmd.addParameter("@SMRPRLE_REC", DataCursor.class);
				
			cmd.execute();
			smrprleRec.val = cmd.getParameterValue("@SMRPRLE_REC", DataCursor.class);


		}
		
		public static void pGetSmrprrq(NNumber pidmIn,NNumber requestNoIn,Ref<DataCursor> smrprrqRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKXAPI.P_GET_SMRPRRQ", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@REQUEST_NO_IN", requestNoIn);
			cmd.addParameter("@SMRPRRQ_REC", DataCursor.class);
				
			cmd.execute();
			smrprrqRec.val = cmd.getParameterValue("@SMRPRRQ_REC", DataCursor.class);


		}
		
		public static void pGetSmrprsc(NString programIn,NString termIn,NNumber smrposaSeq,NString prntCodeIn,Ref<DataCursor> smrprscRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKXAPI.P_GET_SMRPRSC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PROGRAM_IN", programIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@SMRPOSA_SEQ", smrposaSeq);
			cmd.addParameter("@PRNT_CODE_IN", prntCodeIn);
			cmd.addParameter("@SMRPRSC_REC", DataCursor.class);
				
			cmd.execute();
			smrprscRec.val = cmd.getParameterValue("@SMRPRSC_REC", DataCursor.class);


		}
		
		public static void pGetSmrrqcm(NNumber pidmIn,NNumber requestNoIn,Ref<DataCursor> smrrqcmRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKXAPI.P_GET_SMRRQCM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@REQUEST_NO_IN", requestNoIn);
			cmd.addParameter("@SMRRQCM_REC", DataCursor.class);
				
			cmd.execute();
			smrrqcmRec.val = cmd.getParameterValue("@SMRRQCM_REC", DataCursor.class);


		}
		
		public static void pGetSmrrqcm(NNumber pidmIn,NNumber requestNoIn,NString clasIn,Ref<DataCursor> smrrqcmRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKXAPI.P_GET_SMRRQCM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@REQUEST_NO_IN", requestNoIn);
			cmd.addParameter("@CLAS_IN", clasIn);
			cmd.addParameter("@SMRRQCM_REC", DataCursor.class);
				
			cmd.execute();
			smrrqcmRec.val = cmd.getParameterValue("@SMRRQCM_REC", DataCursor.class);


		}
		
		public static void pGetSmrsacm(NNumber pidmIn,NString areaIn,NString termIn,NString dfltTextIn,Ref<DataCursor> smrsacmRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKXAPI.P_GET_SMRSACM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@AREA_IN", areaIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@DFLT_TEXT_IN", dfltTextIn);
			cmd.addParameter("@SMRSACM_REC", DataCursor.class);
				
			cmd.execute();
			smrsacmRec.val = cmd.getParameterValue("@SMRSACM_REC", DataCursor.class);


		}
		
		public static void pGetSmrsact(NNumber pidmIn,NString areaIn,NNumber caaSeqnoIn,NString dorqTermEff,NString prntCodeIn,Ref<DataCursor> smrsactRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKXAPI.P_GET_SMRSACT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@AREA_IN", areaIn);
			cmd.addParameter("@CAA_SEQNO_IN", caaSeqnoIn);
			cmd.addParameter("@DORQ_TERM_EFF", dorqTermEff);
			cmd.addParameter("@PRNT_CODE_IN", prntCodeIn);
			cmd.addParameter("@SMRSACT_REC", DataCursor.class);
				
			cmd.execute();
			smrsactRec.val = cmd.getParameterValue("@SMRSACT_REC", DataCursor.class);


		}
		
		public static void pGetSmrsagc(NNumber pidmIn,NString areaIn,NString gradeIn,NString termIn,NString prntCodeIn,Ref<DataCursor> smrsagcRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKXAPI.P_GET_SMRSAGC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@AREA_IN", areaIn);
			cmd.addParameter("@GRADE_IN", gradeIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PRNT_CODE_IN", prntCodeIn);
			cmd.addParameter("@SMRSAGC_REC", DataCursor.class);
				
			cmd.execute();
			smrsagcRec.val = cmd.getParameterValue("@SMRSAGC_REC", DataCursor.class);


		}
		
		public static void pGetSmrsarc(NNumber pidmIn,NString areaIn,NString termIn,NNumber seqnoIn,NString prntCodeIn,Ref<DataCursor> smrsarcRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKXAPI.P_GET_SMRSARC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@AREA_IN", areaIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@SEQNO_IN", seqnoIn);
			cmd.addParameter("@PRNT_CODE_IN", prntCodeIn);
			cmd.addParameter("@SMRSARC_REC", DataCursor.class);
				
			cmd.execute();
			smrsarcRec.val = cmd.getParameterValue("@SMRSARC_REC", DataCursor.class);


		}
		
		public static void pGetSmrsard(NNumber pPidmIn,NString pAreaIn,NString pDrrqSourceIndIn,NString pDorqRuleIn,NString pPrntCodeIn,NString pDorqTermCodeEffIn,Ref<DataCursor> smrsardRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKXAPI.P_GET_SMRSARD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM_IN", pPidmIn);
			cmd.addParameter("@P_AREA_IN", pAreaIn);
			cmd.addParameter("@P_DRRQ_SOURCE_IND_IN", pDrrqSourceIndIn);
			cmd.addParameter("@P_DORQ_RULE_IN", pDorqRuleIn);
			cmd.addParameter("@P_PRNT_CODE_IN", pPrntCodeIn);
			cmd.addParameter("@P_DORQ_TERM_CODE_EFF_IN", pDorqTermCodeEffIn);
			cmd.addParameter("@SMRSARD_REC", DataCursor.class);
				
			cmd.execute();
			smrsardRec.val = cmd.getParameterValue("@SMRSARD_REC", DataCursor.class);


		}
		
		public static void pGetSmrsart(NNumber pPidmIn,NString pAreaIn,NString pDrrqRuleIn,NNumber pDrrqRulSeqnoIn,NString pDrrqTermEffIn,NString pPrntCodeIn,Ref<DataCursor> smrsartRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKXAPI.P_GET_SMRSART", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM_IN", pPidmIn);
			cmd.addParameter("@P_AREA_IN", pAreaIn);
			cmd.addParameter("@P_DRRQ_RULE_IN", pDrrqRuleIn);
			cmd.addParameter("@P_DRRQ_RUL_SEQNO_IN", pDrrqRulSeqnoIn);
			cmd.addParameter("@P_DRRQ_TERM_EFF_IN", pDrrqTermEffIn);
			cmd.addParameter("@P_PRNT_CODE_IN", pPrntCodeIn);
			cmd.addParameter("@SMRSART_REC", DataCursor.class);
				
			cmd.execute();
			smrsartRec.val = cmd.getParameterValue("@SMRSART_REC", DataCursor.class);


		}
		
		public static void pGetSmrsgcm(NNumber pidmIn,NString grpIn,NString termIn,NString dfltTextIn,Ref<DataCursor> smrsgcmRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKXAPI.P_GET_SMRSGCM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@GRP_IN", grpIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@DFLT_TEXT_IN", dfltTextIn);
			cmd.addParameter("@SMRSGCM_REC", DataCursor.class);
				
			cmd.execute();
			smrsgcmRec.val = cmd.getParameterValue("@SMRSGCM_REC", DataCursor.class);


		}
		
		public static void pGetSmrsgct(NNumber pidmIn,NString groupIn,NNumber caaSeqnoIn,NString dorqTermEff,NString prntCodeIn,Ref<DataCursor> smrsgctRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKXAPI.P_GET_SMRSGCT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@GROUP_IN", groupIn);
			cmd.addParameter("@CAA_SEQNO_IN", caaSeqnoIn);
			cmd.addParameter("@DORQ_TERM_EFF", dorqTermEff);
			cmd.addParameter("@PRNT_CODE_IN", prntCodeIn);
			cmd.addParameter("@SMRSGCT_REC", DataCursor.class);
				
			cmd.execute();
			smrsgctRec.val = cmd.getParameterValue("@SMRSGCT_REC", DataCursor.class);


		}
		
		public static void pGetSmrsggc(NNumber pidmIn,NString groupIn,NString grdeCodeIn,NString termIn,NString prntCodeIn,Ref<DataCursor> smrsggcRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKXAPI.P_GET_SMRSGGC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@GROUP_IN", groupIn);
			cmd.addParameter("@GRDE_CODE_IN", grdeCodeIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PRNT_CODE_IN", prntCodeIn);
			cmd.addParameter("@SMRSGGC_REC", DataCursor.class);
				
			cmd.execute();
			smrsggcRec.val = cmd.getParameterValue("@SMRSGGC_REC", DataCursor.class);


		}
		
		public static void pGetSmrsgrc(NNumber pidmIn,NString groupIn,NString termIn,NNumber seqnoIn,NString prntCodeIn,Ref<DataCursor> smrsgrcRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKXAPI.P_GET_SMRSGRC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@GROUP_IN", groupIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@SEQNO_IN", seqnoIn);
			cmd.addParameter("@PRNT_CODE_IN", prntCodeIn);
			cmd.addParameter("@SMRSGRC_REC", DataCursor.class);
				
			cmd.execute();
			smrsgrcRec.val = cmd.getParameterValue("@SMRSGRC_REC", DataCursor.class);


		}
		
		public static void pGetSmrsgrd(NNumber pPidmIn,NString pGroupIn,NString pDrrqSourceIndIn,NString pDorqRuleIn,NString pPrntCodeIn,NString pDorqTermCodeEffIn,Ref<DataCursor> smrsgrdRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKXAPI.P_GET_SMRSGRD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM_IN", pPidmIn);
			cmd.addParameter("@P_GROUP_IN", pGroupIn);
			cmd.addParameter("@P_DRRQ_SOURCE_IND_IN", pDrrqSourceIndIn);
			cmd.addParameter("@P_DORQ_RULE_IN", pDorqRuleIn);
			cmd.addParameter("@P_PRNT_CODE_IN", pPrntCodeIn);
			cmd.addParameter("@P_DORQ_TERM_CODE_EFF_IN", pDorqTermCodeEffIn);
			cmd.addParameter("@SMRSGRD_REC", DataCursor.class);
				
			cmd.execute();
			smrsgrdRec.val = cmd.getParameterValue("@SMRSGRD_REC", DataCursor.class);


		}
		
		public static void pGetSmrsgrt(NNumber pPidmIn,NString pGroupIn,NString pDrrqRuleIn,NNumber pDrrqRulSeqnoIn,NString pDrrqTermEffIn,NString pPrntCodeIn,Ref<DataCursor> smrsgrtRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKXAPI.P_GET_SMRSGRT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM_IN", pPidmIn);
			cmd.addParameter("@P_GROUP_IN", pGroupIn);
			cmd.addParameter("@P_DRRQ_RULE_IN", pDrrqRuleIn);
			cmd.addParameter("@P_DRRQ_RUL_SEQNO_IN", pDrrqRulSeqnoIn);
			cmd.addParameter("@P_DRRQ_TERM_EFF_IN", pDrrqTermEffIn);
			cmd.addParameter("@P_PRNT_CODE_IN", pPrntCodeIn);
			cmd.addParameter("@SMRSGRT_REC", DataCursor.class);
				
			cmd.execute();
			smrsgrtRec.val = cmd.getParameterValue("@SMRSGRT_REC", DataCursor.class);


		}
		
		public static void pGetSmrspcm(NNumber pidmIn,NString programIn,NString termIn,NString dfltTextIn,Ref<DataCursor> smrspcmRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKXAPI.P_GET_SMRSPCM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@PROGRAM_IN", programIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@DFLT_TEXT_IN", dfltTextIn);
			cmd.addParameter("@SMRSPCM_REC", DataCursor.class);
				
			cmd.execute();
			smrspcmRec.val = cmd.getParameterValue("@SMRSPCM_REC", DataCursor.class);


		}
		
		public static void pGetSmrspgc(NNumber pidmIn,NString programIn,NString termIn,NString gradeIn,NString dfltTextIn,Ref<DataCursor> smrspgcRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKXAPI.P_GET_SMRSPGC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@PROGRAM_IN", programIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@GRADE_IN", gradeIn);
			cmd.addParameter("@DFLT_TEXT_IN", dfltTextIn);
			cmd.addParameter("@SMRSPGC_REC", DataCursor.class);
				
			cmd.execute();
			smrspgcRec.val = cmd.getParameterValue("@SMRSPGC_REC", DataCursor.class);


		}
		
		public static void pGetSmrsprc(NNumber pidmIn,NString programIn,NString termIn,NNumber smrsprsSeq,NString dfltTextIn,Ref<DataCursor> smrsprcRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKXAPI.P_GET_SMRSPRC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@PROGRAM_IN", programIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@SMRSPRS_SEQ", smrsprsSeq);
			cmd.addParameter("@DFLT_TEXT_IN", dfltTextIn);
			cmd.addParameter("@SMRSPRC_REC", DataCursor.class);
				
			cmd.execute();
			smrsprcRec.val = cmd.getParameterValue("@SMRSPRC_REC", DataCursor.class);


		}
		
		public static void pGetSmrssub(NNumber pPidmIn,NString pCtlgTermIn,Ref<DataCursor> smrssubRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKXAPI.P_GET_SMRSSUB", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM_IN", pPidmIn);
			cmd.addParameter("@P_CTLG_TERM_IN", pCtlgTermIn);
			cmd.addParameter("@SMRSSUB_REC", DataCursor.class);
				
			cmd.execute();
			smrssubRec.val = cmd.getParameterValue("@SMRSSUB_REC", DataCursor.class);


		}
		
		public static void pGetSmrstrg(NNumber pPidmIn,NString pCtlgTermIn,Ref<DataCursor> smrstrgRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKXAPI.P_GET_SMRSTRG", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM_IN", pPidmIn);
			cmd.addParameter("@P_CTLG_TERM_IN", pCtlgTermIn);
			cmd.addParameter("@SMRSTRG_REC", DataCursor.class);
				
			cmd.execute();
			smrstrgRec.val = cmd.getParameterValue("@SMRSTRG_REC", DataCursor.class);


		}
		
		public static void pGetSmrswav(NNumber pPidmIn,NString pCtlgTermIn,Ref<DataCursor> smrswavRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKXAPI.P_GET_SMRSWAV", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM_IN", pPidmIn);
			cmd.addParameter("@P_CTLG_TERM_IN", pCtlgTermIn);
			cmd.addParameter("@SMRSWAV_REC", DataCursor.class);
				
			cmd.execute();
			smrswavRec.val = cmd.getParameterValue("@SMRSWAV_REC", DataCursor.class);


		}
		
		public static void pGetSpriden(NNumber pPidmIn,Ref<DataCursor> spridenRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKXAPI.P_GET_SPRIDEN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM_IN", pPidmIn);
			cmd.addParameter("@SPRIDEN_REC", DataCursor.class);
				
			cmd.execute();
			spridenRec.val = cmd.getParameterValue("@SPRIDEN_REC", DataCursor.class);


		}
		
	
	
	
}
