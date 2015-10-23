package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwfkedtc {
		public static NBool fTrniCalcEncb(NNumber inmode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.F_TRNI_CALC_ENCB", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@INMODE", inmode);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fTrniCheckEqulIssd(NNumber inmode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.F_TRNI_CHECK_EQUL_ISSD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@INMODE", inmode);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fTrniCheckIssdUoms(NNumber inmode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.F_TRNI_CHECK_ISSD_UOMS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@INMODE", inmode);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fTrniCheckStockInd(NNumber inmode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.F_TRNI_CHECK_STOCK_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@INMODE", inmode);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fTrniGetCmtType(NNumber inmode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.F_TRNI_GET_CMT_TYPE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@INMODE", inmode);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fTrniMultNegOne(NNumber inmode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.F_TRNI_MULT_NEG_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@INMODE", inmode);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fTrniOutOfBalance(NNumber inmode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.F_TRNI_OUT_OF_BALANCE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@INMODE", inmode);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fTrniSelDocDinp(NNumber inSeqCode,NString inDocNum,NNumber inSeqNum,NString inBankNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.F_TRNI_SEL_DOC_DINP", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@IN_SEQ_CODE", inSeqCode);
			cmd.addParameter("@IN_DOC_NUM", inDocNum);
			cmd.addParameter("@IN_SEQ_NUM", inSeqNum);
			cmd.addParameter("@IN_BANK_NUM", inBankNum);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fTrniSelErrorCountReq(NNumber inmode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.F_TRNI_SEL_ERROR_COUNT_REQ", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@INMODE", inmode);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fTrniSelFtvfund(NNumber inmode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.F_TRNI_SEL_FTVFUND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@INMODE", inmode);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fTrniSelFtvfundPool(NNumber inmode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.F_TRNI_SEL_FTVFUND_POOL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@INMODE", inmode);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fTrniSelJvcHead(NNumber inmode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.F_TRNI_SEL_JVC_HEAD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@INMODE", inmode);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fTrniSelPoAmt(NNumber inmode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.F_TRNI_SEL_PO_AMT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@INMODE", inmode);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fTrniSelPoDelta(NNumber inmode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.F_TRNI_SEL_PO_DELTA", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@INMODE", inmode);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fTrniSelPoHead(NNumber inmode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.F_TRNI_SEL_PO_HEAD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@INMODE", inmode);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fTrniSelReqAmt(NNumber inmode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.F_TRNI_SEL_REQ_AMT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@INMODE", inmode);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fTrniSelReqHead(NNumber inmode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.F_TRNI_SEL_REQ_HEAD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@INMODE", inmode);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void pTrniAbalUpdateFgbbavl() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.P_TRNI_ABAL_UPDATE_FGBBAVL", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniCMods() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.P_TRNI_C_MODS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniCPosDrCr() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.P_TRNI_C_POS_DR_CR", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniCTranWork() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.P_TRNI_C_TRAN_WORK", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniCheckPyEncumb() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.P_TRNI_CHECK_PY_ENCUMB", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniCheckZero() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.P_TRNI_CHECK_ZERO", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniClearBavlSumFields() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.P_TRNI_CLEAR_BAVL_SUM_FIELDS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniDBankFFund() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.P_TRNI_D_BANK_F_FUND", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniE0001() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.P_TRNI_E_0001", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniE0002() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.P_TRNI_E_0002", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniE0003() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.P_TRNI_E_0003", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniE0004() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.P_TRNI_E_0004", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniE0005() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.P_TRNI_E_0005", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniE0600() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.P_TRNI_E_0600", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniE0601() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.P_TRNI_E_0601", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniE0800() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.P_TRNI_E_0800", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniE0801() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.P_TRNI_E_0801", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniE1000() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.P_TRNI_E_1000", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniE1001() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.P_TRNI_E_1001", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniE1002() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.P_TRNI_E_1002", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniE1003() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.P_TRNI_E_1003", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniE1200() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.P_TRNI_E_1200", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniE1201() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.P_TRNI_E_1201", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniE1800() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.P_TRNI_E_1800", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniE2200() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.P_TRNI_E_2200", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniE2201() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.P_TRNI_E_2201", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniE2600() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.P_TRNI_E_2600", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniE2601() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.P_TRNI_E_2601", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniE2801() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.P_TRNI_E_2801", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniE2802() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.P_TRNI_E_2802", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniE3600() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.P_TRNI_E_3600", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniGetFgbencd() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.P_TRNI_GET_FGBENCD", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniGetFgbench() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.P_TRNI_GET_FGBENCH", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniGetFtvacci() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.P_TRNI_GET_FTVACCI", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniGetFtvacct() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.P_TRNI_GET_FTVACCT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniGetFtvactv() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.P_TRNI_GET_FTVACTV", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniGetFtvatyp() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.P_TRNI_GET_FTVATYP", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniGetFtvcoas() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.P_TRNI_GET_FTVCOAS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniGetFtvfspdTransDate() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.P_TRNI_GET_FTVFSPD_TRANS_DATE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniGetFtvfsyrTransDate() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.P_TRNI_GET_FTVFSYR_TRANS_DATE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniGetFtvftyp() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.P_TRNI_GET_FTVFTYP", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniGetFtvfund() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.P_TRNI_GET_FTVFUND", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniGetFtvlocn() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.P_TRNI_GET_FTVLOCN", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniGetFtvorgn() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.P_TRNI_GET_FTVORGN", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniGetFtvprog() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.P_TRNI_GET_FTVPROG", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniGetFtvrucl() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.P_TRNI_GET_FTVRUCL", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniGetGxvbank() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.P_TRNI_GET_GXVBANK", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniGetSpriden() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.P_TRNI_GET_SPRIDEN", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniLockFgbjvcd() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.P_TRNI_LOCK_FGBJVCD", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniPrintErrorMessage() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.P_TRNI_PRINT_ERROR_MESSAGE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniReplaceCifoapal() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.P_TRNI_REPLACE_CIFOAPAL", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniSEBldField() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.P_TRNI_S_E_BLD_FIELD", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniSECompEq() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.P_TRNI_S_E_COMP_EQ", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniSECompGe() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.P_TRNI_S_E_COMP_GE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniSECompGr() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.P_TRNI_S_E_COMP_GR", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniSECompIn() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.P_TRNI_S_E_COMP_IN", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniSECompLe() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.P_TRNI_S_E_COMP_LE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniSECompLs() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.P_TRNI_S_E_COMP_LS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniSECompNe() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.P_TRNI_S_E_COMP_NE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniSECompNi() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.P_TRNI_S_E_COMP_NI", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniSECopyField() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.P_TRNI_S_E_COPY_FIELD", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniSEGActlAny() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.P_TRNI_S_E_G_ACTL_ANY", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniScrEAbalOverride() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.P_TRNI_SCR_E_ABAL_OVERRIDE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniSetCommOnorder() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.P_TRNI_SET_COMM_ONORDER", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniSetStatusE() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.P_TRNI_SET_STATUS_E", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniSysEditsS0() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.P_TRNI_SYS_EDITS_S0", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniSysEditsS0ChkArc() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.P_TRNI_SYS_EDITS_S0_CHK_ARC", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniSysEditsS0DupDoc() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.P_TRNI_SYS_EDITS_S0_DUP_DOC", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniSysEditsS0TransDate() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.P_TRNI_SYS_EDITS_S0_TRANS_DATE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniSysEditsS9AcciOver() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.P_TRNI_SYS_EDITS_S9_ACCI_OVER", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniSysEditsS9AcctOver() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.P_TRNI_SYS_EDITS_S9_ACCT_OVER", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniSysEditsS9ActvOver() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.P_TRNI_SYS_EDITS_S9_ACTV_OVER", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniSysEditsS9DrCrInd() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.P_TRNI_SYS_EDITS_S9_DR_CR_IND", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniSysEditsS9FundOver() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.P_TRNI_SYS_EDITS_S9_FUND_OVER", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniSysEditsS9LocnOver() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.P_TRNI_SYS_EDITS_S9_LOCN_OVER", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniSysEditsS9OrgnOver() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.P_TRNI_SYS_EDITS_S9_ORGN_OVER", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniSysEditsS9ProgOver() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.P_TRNI_SYS_EDITS_S9_PROG_OVER", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniTTSt() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.P_TRNI_T_T_ST", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniTTTerm() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.P_TRNI_T_T_TERM", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniTestPodt() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.P_TRNI_TEST_PODT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniUpdatePo() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.P_TRNI_UPDATE_PO", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniUpdatePoHead() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.P_TRNI_UPDATE_PO_HEAD", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniUpdatePoHeadError() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.P_TRNI_UPDATE_PO_HEAD_ERROR", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrniUpdateReq() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKEDTC.P_TRNI_UPDATE_REQ", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
