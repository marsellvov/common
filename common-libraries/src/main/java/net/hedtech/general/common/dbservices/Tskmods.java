package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Tskmods {
		public static NNumber fGetTbraccdBal(NString term,NNumber pidm,NString typeInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKMODS.F_GET_TBRACCD_BAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@TYPE_IND", typeInd);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fGetTranNumber(NNumber pidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKMODS.F_GET_TRAN_NUMBER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PIDM", pidm);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NBool fUpdCtexUseAmntStuMax(NString rowidIn,NNumber ctexStuMaxAmt,NNumber ctexStuRegAmt) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKMODS.F_UPD_CTEX_USE_AMNT_STU_MAX", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@ROWID_IN", rowidIn);
			cmd.addParameter("@CTEX_STU_MAX_AMT", ctexStuMaxAmt);
			cmd.addParameter("@CTEX_STU_REG_AMT", ctexStuRegAmt);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void pDeleteTbrclct(NString sessionidIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKMODS.P_DELETE_TBRCLCT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SESSIONID_IN", sessionidIn);
				
			cmd.execute();


		}
		
		public static void pDeleteTbrctex(NString sessionidIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKMODS.P_DELETE_TBRCTEX", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SESSIONID_IN", sessionidIn);
				
			cmd.execute();


		}
		
		public static void pDeleteTbrmemoByContract(NNumber contractPidmIn,NNumber contractNumberIn,NString termIn,NNumber studentPidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKMODS.P_DELETE_TBRMEMO_BY_CONTRACT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CONTRACT_PIDM_IN", contractPidmIn);
			cmd.addParameter("@CONTRACT_NUMBER_IN", contractNumberIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@STUDENT_PIDM_IN", studentPidmIn);
				
			cmd.execute();


		}
		
		public static void pDeleteTbrmemoBySrce(NNumber pidmIn,NString termIn,NString srceIn,NString doXrefIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKMODS.P_DELETE_TBRMEMO_BY_SRCE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@SRCE_IN", srceIn);
			cmd.addParameter("@DO_XREF_IN", doXrefIn);
				
			cmd.execute();


		}
		
		public static void pInsertTbraccd1(NDate effectiveDateIn,NString sessionidIn,NString termIn,NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKMODS.P_INSERT_TBRACCD_1", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EFFECTIVE_DATE_IN", effectiveDateIn);
			cmd.addParameter("@SESSIONID_IN", sessionidIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();


		}
		
		public static void pInsertTbraccd2(NDate effectiveDateIn,NString sessionidIn,NString termIn,NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKMODS.P_INSERT_TBRACCD_2", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EFFECTIVE_DATE_IN", effectiveDateIn);
			cmd.addParameter("@SESSIONID_IN", sessionidIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();


		}
		
		public static void pInsertTbraccd3(NNumber tranNumberIn,NString termIn,NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKMODS.P_INSERT_TBRACCD_3", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TRAN_NUMBER_IN", tranNumberIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();


		}
		
		public static void pInsertTbraccdRec() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKMODS.P_INSERT_TBRACCD_REC", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pInsertTbrcbrq() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKMODS.P_INSERT_TBRCBRQ", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pInsertTbrclct() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKMODS.P_INSERT_TBRCLCT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pInsertTbrcrcpRec() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKMODS.P_INSERT_TBRCRCP_REC", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pInsertTbrmemo(NString sessionidIn,NString termIn,NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKMODS.P_INSERT_TBRMEMO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SESSIONID_IN", sessionidIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();


		}
		
		public static void pInsertTbrmemoAdj(NString sessionidIn,NString termIn,NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKMODS.P_INSERT_TBRMEMO_ADJ", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SESSIONID_IN", sessionidIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();


		}
		
		public static void pInsertTbvcrd1Tbrctex(NString sessionidIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKMODS.P_INSERT_TBVCRD1_TBRCTEX", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SESSIONID_IN", sessionidIn);
				
			cmd.execute();


		}
		
		public static void pInsertTbvcrd2Tbrctex(NString sessionidIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKMODS.P_INSERT_TBVCRD2_TBRCTEX", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SESSIONID_IN", sessionidIn);
				
			cmd.execute();


		}
		
		public static void pInsertTbvcrd3Tbrctex(NString sessionidIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKMODS.P_INSERT_TBVCRD3_TBRCTEX", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SESSIONID_IN", sessionidIn);
				
			cmd.execute();


		}
		
		public static void pInsertTbvcrd4Tbrctex(NString sessionidIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKMODS.P_INSERT_TBVCRD4_TBRCTEX", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SESSIONID_IN", sessionidIn);
				
			cmd.execute();


		}
		
		public static void pInsertTbvcrd5Tbrctex(NString sessionidIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKMODS.P_INSERT_TBVCRD5_TBRCTEX", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SESSIONID_IN", sessionidIn);
				
			cmd.execute();


		}
		
		public static void pInsertTbvcrd6Tbrctex(NString sessionidIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKMODS.P_INSERT_TBVCRD6_TBRCTEX", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SESSIONID_IN", sessionidIn);
				
			cmd.execute();


		}
		
		public static void pLockCtexDcatRegAmtRec(NString srceCode,NString sessionid,NNumber pidmIn,NString detailRegCodeIn,Ref<NNumber> dcatRegAmtDtlInOut,Ref<NString> ctexIndInOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKMODS.P_LOCK_CTEX_DCAT_REG_AMT_REC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SRCE_CODE", srceCode);
			cmd.addParameter("@SESSIONID", sessionid);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@DETAIL_REG_CODE_IN", detailRegCodeIn);
			cmd.addParameter("@DCAT_REG_AMT_DTL_IN_OUT", dcatRegAmtDtlInOut, true);
			cmd.addParameter("@CTEX_IND_IN_OUT", ctexIndInOut, true);
				
			cmd.execute();
			dcatRegAmtDtlInOut.val = cmd.getParameterValue("@DCAT_REG_AMT_DTL_IN_OUT", NNumber.class);
			ctexIndInOut.val = cmd.getParameterValue("@CTEX_IND_IN_OUT", NString.class);


		}
		
		public static void pLockCtexSrceUsedAmt(NString detailRegCode,NString srceCode,NString sessionid,Ref<NNumber> dcatUsedAmtDtlInOut,Ref<NString> ctexIndInOut,NNumber pidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKMODS.P_LOCK_CTEX_SRCE_USED_AMT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DETAIL_REG_CODE", detailRegCode);
			cmd.addParameter("@SRCE_CODE", srceCode);
			cmd.addParameter("@SESSIONID", sessionid);
			cmd.addParameter("@DCAT_USED_AMT_DTL_IN_OUT", dcatUsedAmtDtlInOut, true);
			cmd.addParameter("@CTEX_IND_IN_OUT", ctexIndInOut, true);
			cmd.addParameter("@PIDM", pidm);
				
			cmd.execute();
			dcatUsedAmtDtlInOut.val = cmd.getParameterValue("@DCAT_USED_AMT_DTL_IN_OUT", NNumber.class);
			ctexIndInOut.val = cmd.getParameterValue("@CTEX_IND_IN_OUT", NString.class);


		}
		
		public static void pLockCtexStuMaxAmt(NNumber pidmIn,NNumber contPidmIn,Ref<NNumber> ctexStuMaxAmtInOut,Ref<NNumber> ctexStuRegAmtInOut,Ref<NNumber> ctexStuRegTotInOut,Ref<NString> ctexInOut,NNumber refNumbIn,NString termIn,NString sessionidIn,NString detailRegCodeIn,NString dcatRegCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKMODS.P_LOCK_CTEX_STU_MAX_AMT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@CONT_PIDM_IN", contPidmIn);
			cmd.addParameter("@CTEX_STU_MAX_AMT_IN_OUT", ctexStuMaxAmtInOut, true);
			cmd.addParameter("@CTEX_STU_REG_AMT_IN_OUT", ctexStuRegAmtInOut, true);
			cmd.addParameter("@CTEX_STU_REG_TOT_IN_OUT", ctexStuRegTotInOut, true);
			cmd.addParameter("@CTEX_IN_OUT", ctexInOut, true);
			cmd.addParameter("@REF_NUMB_IN", refNumbIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@SESSIONID_IN", sessionidIn);
			cmd.addParameter("@DETAIL_REG_CODE_IN", detailRegCodeIn);
			cmd.addParameter("@DCAT_REG_CODE_IN", dcatRegCodeIn);
				
			cmd.execute();
			ctexStuMaxAmtInOut.val = cmd.getParameterValue("@CTEX_STU_MAX_AMT_IN_OUT", NNumber.class);
			ctexStuRegAmtInOut.val = cmd.getParameterValue("@CTEX_STU_REG_AMT_IN_OUT", NNumber.class);
			ctexStuRegTotInOut.val = cmd.getParameterValue("@CTEX_STU_REG_TOT_IN_OUT", NNumber.class);
			ctexInOut.val = cmd.getParameterValue("@CTEX_IN_OUT", NString.class);


		}
		
		public static void pLockTbrctexDtlUsedAmt(NString detailRegCodeIn,NString srceCodeIn,NString sessionidIn,Ref<NNumber> ctexDtlUsedAmtOut,Ref<NNumber> ctexDtlUsedCodeSumInOut,Ref<NString> ctexIndInOut,NNumber pidmIn,NNumber contPidmIn,NNumber contNumbIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKMODS.P_LOCK_TBRCTEX_DTL_USED_AMT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DETAIL_REG_CODE_IN", detailRegCodeIn);
			cmd.addParameter("@SRCE_CODE_IN", srceCodeIn);
			cmd.addParameter("@SESSIONID_IN", sessionidIn);
			cmd.addParameter("@CTEX_DTL_USED_AMT_OUT", NNumber.class);
			cmd.addParameter("@CTEX_DTL_USED_CODE_SUM_IN_OUT", ctexDtlUsedCodeSumInOut, true);
			cmd.addParameter("@CTEX_IND_IN_OUT", NString.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@CONT_PIDM_IN", contPidmIn);
			cmd.addParameter("@CONT_NUMB_IN", contNumbIn);
				
			cmd.execute();
			ctexDtlUsedAmtOut.val = cmd.getParameterValue("@CTEX_DTL_USED_AMT_OUT", NNumber.class);
			ctexDtlUsedCodeSumInOut.val = cmd.getParameterValue("@CTEX_DTL_USED_CODE_SUM_IN_OUT", NNumber.class);
			ctexIndInOut.val = cmd.getParameterValue("@CTEX_IND_IN_OUT", NString.class);


		}
		
		public static void pLockTbrctexRegAmountRec(NString srceCode,NString sessionid,Ref<NNumber> ctexSrceRegAmtInOut,Ref<NString> ctexIndInOut,NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKMODS.P_LOCK_TBRCTEX_REG_AMOUNT_REC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SRCE_CODE", srceCode);
			cmd.addParameter("@SESSIONID", sessionid);
			cmd.addParameter("@CTEX_SRCE_REG_AMT_IN_OUT", ctexSrceRegAmtInOut, true);
			cmd.addParameter("@CTEX_IND_IN_OUT", ctexIndInOut, true);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();
			ctexSrceRegAmtInOut.val = cmd.getParameterValue("@CTEX_SRCE_REG_AMT_IN_OUT", NNumber.class);
			ctexIndInOut.val = cmd.getParameterValue("@CTEX_IND_IN_OUT", NString.class);


		}
		
		public static void pLockTbrctexSrceUsedAmt(NString srceCodeIn,NString sessionidIn,Ref<NNumber> srceUsedAmtOut,Ref<NString> ctexIndOut,NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKMODS.P_LOCK_TBRCTEX_SRCE_USED_AMT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SRCE_CODE_IN", srceCodeIn);
			cmd.addParameter("@SESSIONID_IN", sessionidIn);
			cmd.addParameter("@SRCE_USED_AMT_OUT", NNumber.class);
			cmd.addParameter("@CTEX_IND_OUT", NString.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();
			srceUsedAmtOut.val = cmd.getParameterValue("@SRCE_USED_AMT_OUT", NNumber.class);
			ctexIndOut.val = cmd.getParameterValue("@CTEX_IND_OUT", NString.class);


		}
		
		public static void pLockTbrctexUseableAmount(NString rowidIn,Ref<NNumber> ctexPidmInOut,Ref<NString> ctexIndInOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKMODS.P_LOCK_TBRCTEX_USEABLE_AMOUNT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ROWID_IN", rowidIn);
			cmd.addParameter("@CTEX_PIDM_IN_OUT", ctexPidmInOut, true);
			cmd.addParameter("@CTEX_IND_IN_OUT", ctexIndInOut, true);
				
			cmd.execute();
			ctexPidmInOut.val = cmd.getParameterValue("@CTEX_PIDM_IN_OUT", NNumber.class);
			ctexIndInOut.val = cmd.getParameterValue("@CTEX_IND_IN_OUT", NString.class);


		}
		
		public static void pLockTbrctexUsedAmt(NString dcatRegCode,NString srceCode,NString sessionid,Ref<NNumber> dcatUsedAmtInOut,Ref<NNumber> dcatUsedCodeAmtInOut,Ref<NString> ctexIndInOut,NNumber pidm,NNumber contPidmIn,NNumber refNumbIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKMODS.P_LOCK_TBRCTEX_USED_AMT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DCAT_REG_CODE", dcatRegCode);
			cmd.addParameter("@SRCE_CODE", srceCode);
			cmd.addParameter("@SESSIONID", sessionid);
			cmd.addParameter("@DCAT_USED_AMT_IN_OUT", dcatUsedAmtInOut, true);
			cmd.addParameter("@DCAT_USED_CODE_AMT_IN_OUT", dcatUsedCodeAmtInOut, true);
			cmd.addParameter("@CTEX_IND_IN_OUT", ctexIndInOut, true);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@CONT_PIDM_IN", contPidmIn);
			cmd.addParameter("@REF_NUMB_IN", refNumbIn);
				
			cmd.execute();
			dcatUsedAmtInOut.val = cmd.getParameterValue("@DCAT_USED_AMT_IN_OUT", NNumber.class);
			dcatUsedCodeAmtInOut.val = cmd.getParameterValue("@DCAT_USED_CODE_AMT_IN_OUT", NNumber.class);
			ctexIndInOut.val = cmd.getParameterValue("@CTEX_IND_IN_OUT", NString.class);


		}
		
		public static void pPopulateFromRprauth(NNumber pidmIn,NString termIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKMODS.P_POPULATE_FROM_RPRAUTH", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
				
			cmd.execute();


		}
		
		public static void pUpdTbrctexUseableAmount(NString rowidIn,NNumber srceUsedAmtIn,NNumber dtlUsedAmtIn,NNumber dtlUsedCodeAmtIn,NNumber dcatUsedAmtDtlIn,NNumber dcatRegAmtDtlIn,NNumber srceRegAmtIn,NNumber dcatUsedAmtIn,NNumber dcatUsedCodeAmtIn,NNumber ctexStuMaxAmtIn,NNumber ctexStuRegAmtIn,NNumber ctexStuRegTotIn,NNumber pidm,Ref<NString> ctexIndInOut,Ref<NString> calcUseableAmountInOut,NNumber ruleMinAmountIn,NNumber rulePercentIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKMODS.P_UPD_TBRCTEX_USEABLE_AMOUNT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ROWID_IN", rowidIn);
			cmd.addParameter("@SRCE_USED_AMT_IN", srceUsedAmtIn);
			cmd.addParameter("@DTL_USED_AMT_IN", dtlUsedAmtIn);
			cmd.addParameter("@DTL_USED_CODE_AMT_IN", dtlUsedCodeAmtIn);
			cmd.addParameter("@DCAT_USED_AMT_DTL_IN", dcatUsedAmtDtlIn);
			cmd.addParameter("@DCAT_REG_AMT_DTL_IN", dcatRegAmtDtlIn);
			cmd.addParameter("@SRCE_REG_AMT_IN", srceRegAmtIn);
			cmd.addParameter("@DCAT_USED_AMT_IN", dcatUsedAmtIn);
			cmd.addParameter("@DCAT_USED_CODE_AMT_IN", dcatUsedCodeAmtIn);
			cmd.addParameter("@CTEX_STU_MAX_AMT_IN", ctexStuMaxAmtIn);
			cmd.addParameter("@CTEX_STU_REG_AMT_IN", ctexStuRegAmtIn);
			cmd.addParameter("@CTEX_STU_REG_TOT_IN", ctexStuRegTotIn);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@CTEX_IND_IN_OUT", ctexIndInOut, true);
			cmd.addParameter("@CALC_USEABLE_AMOUNT_IN_OUT", calcUseableAmountInOut, true);
			cmd.addParameter("@RULE_MIN_AMOUNT_IN", ruleMinAmountIn);
			cmd.addParameter("@RULE_PERCENT_IN", rulePercentIn);
				
			cmd.execute();
			ctexIndInOut.val = cmd.getParameterValue("@CTEX_IND_IN_OUT", NString.class);
			calcUseableAmountInOut.val = cmd.getParameterValue("@CALC_USEABLE_AMOUNT_IN_OUT", NString.class);


		}
		
		public static void pUpdateCtexUseableAmnt(NString rowidIn,NString calcUseableAmountIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKMODS.P_UPDATE_CTEX_USEABLE_AMNT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ROWID_IN", rowidIn);
			cmd.addParameter("@CALC_USEABLE_AMOUNT_IN", calcUseableAmountIn);
				
			cmd.execute();


		}
		
		public static void pUpdateTbraccdBySrce(NString srceIn,NString termIn,NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKMODS.P_UPDATE_TBRACCD_BY_SRCE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SRCE_IN", srceIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();


		}
		
		public static void pUpdateTbraccdRegSrce(NString termIn,NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKMODS.P_UPDATE_TBRACCD_REG_SRCE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();


		}
		
		public static void pUpdateTbrclct() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKMODS.P_UPDATE_TBRCLCT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
