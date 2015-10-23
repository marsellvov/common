package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwfked2t {
		public static NBool fTrniMain(NNumber inSeqCode,NString inDocNum,NNumber inSeqNum,NString inBankNum,NBool inValidateOnly) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.F_TRNI_MAIN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@IN_SEQ_CODE", inSeqCode);
			cmd.addParameter("@IN_DOC_NUM", inDocNum);
			cmd.addParameter("@IN_SEQ_NUM", inSeqNum);
			cmd.addParameter("@IN_BANK_NUM", inBankNum);
			cmd.addParameter("@IN_VALIDATE_ONLY", inValidateOnly);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void pTrniAccrualProcessPrdChe() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_ACCRUAL_PROCESS_PRD_CHE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniAcctTypes() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_ACCT_TYPES", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniBalanceDoc() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_BALANCE_DOC", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniBuildDocbTable() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_BUILD_DOCB_TABLE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniDAcctFAcci() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_D_ACCT_F_ACCI", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniDActvFAcci() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_D_ACTV_F_ACCI", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniDActvFFund() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_D_ACTV_F_FUND", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniDActvFOrgn() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_D_ACTV_F_ORGN", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniDFundFAcci() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_D_FUND_F_ACCI", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniDFundFOrgn() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_D_FUND_F_ORGN", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniDLocnFAcci() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_D_LOCN_F_ACCI", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniDLocnFFund() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_D_LOCN_F_FUND", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniDLocnFOrgn() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_D_LOCN_F_ORGN", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniDOrgnFAcci() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_D_ORGN_F_ACCI", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniDOrgnFFund() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_D_ORGN_F_FUND", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniDProgFAcci() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_D_PROG_F_ACCI", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniDProgFFund() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_D_PROG_F_FUND", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniDProgFOrgn() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_D_PROG_F_ORGN", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniDeleteDocb() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_DELETE_DOCB", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniDeletePoFprblao() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_DELETE_PO_FPRBLAO", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniDetFundOrOrgn() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_DET_FUND_OR_ORGN", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniDocBody() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_DOC_BODY", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniE3800() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_E_3800", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniE3801() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_E_3801", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniE3802() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_E_3802", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniE3803() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_E_3803", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniE4000() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_E_4000", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniE4000E() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_E_4000_E", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniE4050() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_E_4050", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniE4051() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_E_4051", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniE4200() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_E_4200", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniE4201() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_E_4201", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniE4205() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_E_4205", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniE4400() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_E_4400", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniE4450() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_E_4450", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniE4451() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_E_4451", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniE4452() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_E_4452", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniE4453() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_E_4453", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniE4600() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_E_4600", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniE4601() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_E_4601", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniE4605() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_E_4605", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniE4800() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_E_4800", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniE4801() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_E_4801", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniE4802() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_E_4802", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniE4803() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_E_4803", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniE4805() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_E_4805", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniE4806() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_E_4806", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniE5000() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_E_5000", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniE5001() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_E_5001", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniE5002() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_E_5002", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniE5003() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_E_5003", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniE5005() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_E_5005", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniE5006() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_E_5006", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniE5600() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_E_5600", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniE5601() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_E_5601", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniEAcctAccurIntPresen() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_E_ACCT_ACCUR_INT_PRESEN", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniEAcctFundBalPresent() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_E_ACCT_FUND_BAL_PRESENT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniEAcctPoolPresent() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_E_ACCT_POOL_PRESENT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniEAcctPresent() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_E_ACCT_PRESENT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniEAcctRealGainPresen() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_E_ACCT_REAL_GAIN_PRESEN", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniEAcctRealLossPresen() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_E_ACCT_REAL_LOSS_PRESEN", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniEBankPresent() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_E_BANK_PRESENT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniECheckSource() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_E_CHECK_SOURCE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniECheckStatus() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_E_CHECK_STATUS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniECoasPresent() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_E_COAS_PRESENT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniEEncdCifoapal() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_E_ENCD_CIFOAPAL", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniEEnchEncdExist() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_E_ENCH_ENCD_EXIST", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniEFundPresent() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_E_FUND_PRESENT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniEImProcessCode() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_E_IM_PROCESS_CODE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniEInvEarnIndPresent() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_E_INV_EARN_IND_PRESENT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniEInvSaleIndPresent() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_E_INV_SALE_IND_PRESENT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniEOpalFldNotNull() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_E_OPAL_FLD_NOT_NULL", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniEOpalFldNull() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_E_OPAL_FLD_NULL", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniEOpalFldNullOrMatc() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_E_OPAL_FLD_NULL_OR_MATC", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniEOpalKeys() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_E_OPAL_KEYS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniEOpalKeysEt() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_E_OPAL_KEYS_ET", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniEOrgnPresent() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_E_ORGN_PRESENT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniEProgPresent() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_E_PROG_PRESENT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniEncbCmtType() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_ENCB_CMT_TYPE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniFlipSignx() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_FLIP_SIGNX", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniFtveditBody() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_FTVEDIT_BODY", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniFtvrulpBodyS9() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_FTVRULP_BODY_S9", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniGlSignCr() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_GL_SIGN_CR", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniGlSignDr() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_GL_SIGN_DR", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniGlSignNormal() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_GL_SIGN_NORMAL", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniGlSignReverse() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_GL_SIGN_REVERSE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniInsAppd() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_INS_APPD", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniInsTrnr() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_INS_TRNR", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniInsertUapp() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_INSERT_UAPP", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniIxxxSignError() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_IXXX_SIGN_ERROR", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniLockFgbjvch() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_LOCK_FGBJVCH", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniOpalSignZero() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_OPAL_SIGN_ZERO", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniPE010() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_P_E010", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniPE011() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_P_E011", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniPE012() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_P_E012", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniPE013() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_P_E013", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniPE015() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_P_E015", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniPE016() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_P_E016", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniPE017() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_P_E017", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniPE018() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_P_E018", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniPE01xN() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_P_E01X_N", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniPE01xNC() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_P_E01X_N_C", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniPE020() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_P_E020", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniRuleEditTrans() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_RULE_EDIT_TRANS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniSysEditsS9() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_SYS_EDITS_S9", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniSysEditsS9PostKeys() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_SYS_EDITS_S9_POST_KEYS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniSysEditsS9ProgOver() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_SYS_EDITS_S9_PROG_OVER", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniTTSt() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_T_T_ST", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniTTTerm() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_T_T_TERM", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniTestPodt() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED2T.P_TRNI_TEST_PODT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
