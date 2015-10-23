package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwfked1t {
		public static NBool fTrniSelAmtpDecode(NNumber inmode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED1T.F_TRNI_SEL_AMTP_DECODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@INMODE", inmode);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fTrniSelApprOverride(NNumber inmode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED1T.F_TRNI_SEL_APPR_OVERRIDE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@INMODE", inmode);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fTrniSelBudgetPeriodInRa(NNumber inmode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED1T.F_TRNI_SEL_BUDGET_PERIOD_IN_RA", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@INMODE", inmode);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fTrniSelDocbBalMethod(NNumber inmode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED1T.F_TRNI_SEL_DOCB_BAL_METHOD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@INMODE", inmode);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fTrniSelEncHead(NNumber inmode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED1T.F_TRNI_SEL_ENC_HEAD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@INMODE", inmode);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fTrniSelEncpBal(NNumber inmode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED1T.F_TRNI_SEL_ENCP_BAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@INMODE", inmode);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fTrniSelErrorCountEnc(NNumber inmode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED1T.F_TRNI_SEL_ERROR_COUNT_ENC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@INMODE", inmode);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fTrniSelErrorCountJvc(NNumber inmode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED1T.F_TRNI_SEL_ERROR_COUNT_JVC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@INMODE", inmode);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fTrniSelErrorCountPo(NNumber inmode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED1T.F_TRNI_SEL_ERROR_COUNT_PO", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@INMODE", inmode);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fTrniSelFgbencd(NNumber inmode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED1T.F_TRNI_SEL_FGBENCD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@INMODE", inmode);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fTrniSelFgbench(NNumber inmode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED1T.F_TRNI_SEL_FGBENCH", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@INMODE", inmode);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fTrniSelFgbtrnhChkArc() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED1T.F_TRNI_SEL_FGBTRNH_CHK_ARC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fTrniSelFgbtrnhForDup(NNumber inmode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED1T.F_TRNI_SEL_FGBTRNH_FOR_DUP", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@INMODE", inmode);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fTrniSelFtvacci(NNumber inmode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED1T.F_TRNI_SEL_FTVACCI", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@INMODE", inmode);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fTrniSelFtvacct(NNumber inmode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED1T.F_TRNI_SEL_FTVACCT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@INMODE", inmode);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fTrniSelFtvactlAny(NNumber inmode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED1T.F_TRNI_SEL_FTVACTL_ANY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@INMODE", inmode);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fTrniSelFtvactv(NNumber inmode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED1T.F_TRNI_SEL_FTVACTV", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@INMODE", inmode);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fTrniSelFtvatyp(NNumber inmode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED1T.F_TRNI_SEL_FTVATYP", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@INMODE", inmode);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fTrniSelFtvcoas(NNumber inmode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED1T.F_TRNI_SEL_FTVCOAS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@INMODE", inmode);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fTrniSelFtvcoasPool(NNumber inmode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED1T.F_TRNI_SEL_FTVCOAS_POOL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@INMODE", inmode);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fTrniSelFtvfspdTransDate(NNumber inmode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED1T.F_TRNI_SEL_FTVFSPD_TRANS_DATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@INMODE", inmode);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fTrniSelFtvfsyrAccr(NNumber inmode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED1T.F_TRNI_SEL_FTVFSYR_ACCR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@INMODE", inmode);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fTrniSelFtvfsyrTransDate(NNumber inmode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED1T.F_TRNI_SEL_FTVFSYR_TRANS_DATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@INMODE", inmode);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fTrniSelFtvftyp(NNumber inmode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED1T.F_TRNI_SEL_FTVFTYP", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@INMODE", inmode);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fTrniSelFtvlocn(NNumber inmode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED1T.F_TRNI_SEL_FTVLOCN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@INMODE", inmode);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fTrniSelFtvorgn(NNumber inmode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED1T.F_TRNI_SEL_FTVORGN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@INMODE", inmode);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fTrniSelFtvprog(NNumber inmode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED1T.F_TRNI_SEL_FTVPROG", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@INMODE", inmode);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fTrniSelFtvrucl(NNumber inmode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED1T.F_TRNI_SEL_FTVRUCL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@INMODE", inmode);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fTrniSelFtvrulp(NNumber inmode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED1T.F_TRNI_SEL_FTVRULP", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@INMODE", inmode);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fTrniSelGxvbank(NNumber inmode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED1T.F_TRNI_SEL_GXVBANK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@INMODE", inmode);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fTrniSelJvcAcctg(NNumber inmode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED1T.F_TRNI_SEL_JVC_ACCTG", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@INMODE", inmode);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fTrniSelProcCode() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED1T.F_TRNI_SEL_PROC_CODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fTrniSelSpriden(NNumber inmode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED1T.F_TRNI_SEL_SPRIDEN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@INMODE", inmode);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fTrniSelTransCurrFy(NNumber inmode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED1T.F_TRNI_SEL_TRANS_CURR_FY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@INMODE", inmode);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fTrniSeldate(NNumber inmode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKED1T.F_TRNI_SELDATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@INMODE", inmode);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
	
	
	
}
