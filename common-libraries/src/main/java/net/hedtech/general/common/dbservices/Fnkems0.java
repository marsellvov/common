package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Fnkems0 {
		public static NBool fCheckEmcUnitCriteria(NString vCoasCode,NString vFundCode,NString vAcctCode,NDate vTransDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FNKEMS0.F_CHECK_EMC_UNIT_CRITERIA", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@V_COAS_CODE", vCoasCode);
			cmd.addParameter("@V_FUND_CODE", vFundCode);
			cmd.addParameter("@V_ACCT_CODE", vAcctCode);
			cmd.addParameter("@V_TRANS_DATE", vTransDate);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NNumber fGetBegBal(NString coasCode,NString fundCode,NString fsyrCode,NString asOfDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FNKEMS0.F_GET_BEG_BAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@COAS_CODE", coasCode);
			cmd.addParameter("@FUND_CODE", fundCode);
			cmd.addParameter("@FSYR_CODE", fsyrCode);
			cmd.addParameter("@AS_OF_DATE", asOfDate);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fGetEncumb(NString coasCode,NString fundCode,NString fsyrCode,NString fspdCode,NString asOfDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FNKEMS0.F_GET_ENCUMB", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@COAS_CODE", coasCode);
			cmd.addParameter("@FUND_CODE", fundCode);
			cmd.addParameter("@FSYR_CODE", fsyrCode);
			cmd.addParameter("@FSPD_CODE", fspdCode);
			cmd.addParameter("@AS_OF_DATE", asOfDate);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fGetExpenses(NString coasCode,NString fundCode,NString fsyrCode,NString fspdCode,NString asOfDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FNKEMS0.F_GET_EXPENSES", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@COAS_CODE", coasCode);
			cmd.addParameter("@FUND_CODE", fundCode);
			cmd.addParameter("@FSYR_CODE", fsyrCode);
			cmd.addParameter("@FSPD_CODE", fspdCode);
			cmd.addParameter("@AS_OF_DATE", asOfDate);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fGetFundAddn(NString coasCode,NString fundCode,NString fsyrCode,NString fspdCode,NString asOfDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FNKEMS0.F_GET_FUND_ADDN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@COAS_CODE", coasCode);
			cmd.addParameter("@FUND_CODE", fundCode);
			cmd.addParameter("@FSYR_CODE", fsyrCode);
			cmd.addParameter("@FSPD_CODE", fspdCode);
			cmd.addParameter("@AS_OF_DATE", asOfDate);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fGetGift(NString coasCode,NString atypCode,NString fundCode,NString fsyrCode,NString fspdCode,NString asOfDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FNKEMS0.F_GET_GIFT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@COAS_CODE", coasCode);
			cmd.addParameter("@ATYP_CODE", atypCode);
			cmd.addParameter("@FUND_CODE", fundCode);
			cmd.addParameter("@FSYR_CODE", fsyrCode);
			cmd.addParameter("@FSPD_CODE", fspdCode);
			cmd.addParameter("@AS_OF_DATE", asOfDate);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fGetIncome(NString coasCode,NString fundCode,NString fsyrCode,NString fspdCode,NString asOfDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FNKEMS0.F_GET_INCOME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@COAS_CODE", coasCode);
			cmd.addParameter("@FUND_CODE", fundCode);
			cmd.addParameter("@FSYR_CODE", fsyrCode);
			cmd.addParameter("@FSPD_CODE", fspdCode);
			cmd.addParameter("@AS_OF_DATE", asOfDate);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fGetNoGift(NString coasCode,NString atypCode,NString fundCode,NString fsyrCode,NString fspdCode,NString asOfDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FNKEMS0.F_GET_NO_GIFT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@COAS_CODE", coasCode);
			cmd.addParameter("@ATYP_CODE", atypCode);
			cmd.addParameter("@FUND_CODE", fundCode);
			cmd.addParameter("@FSYR_CODE", fsyrCode);
			cmd.addParameter("@FSPD_CODE", fspdCode);
			cmd.addParameter("@AS_OF_DATE", asOfDate);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fGetOtherIncome(NString coasCode,NString fundCode,NString fsyrCode,NString fspdCode,NString spendAcctCode,NString asOfDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FNKEMS0.F_GET_OTHER_INCOME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@COAS_CODE", coasCode);
			cmd.addParameter("@FUND_CODE", fundCode);
			cmd.addParameter("@FSYR_CODE", fsyrCode);
			cmd.addParameter("@FSPD_CODE", fspdCode);
			cmd.addParameter("@SPEND_ACCT_CODE", spendAcctCode);
			cmd.addParameter("@AS_OF_DATE", asOfDate);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fGetPurPriceValUnit(NString coasCode,NString poolCode,NString fspdStartDate,NString fspdEndDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FNKEMS0.F_GET_PUR_PRICE_VAL_UNIT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@COAS_CODE", coasCode);
			cmd.addParameter("@POOL_CODE", poolCode);
			cmd.addParameter("@FSPD_START_DATE", fspdStartDate);
			cmd.addParameter("@FSPD_END_DATE", fspdEndDate);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fGetSpndIncome(NString coasCode,NString fundCode,NString fsyrCode,NString fspdCode,NString acctCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FNKEMS0.F_GET_SPND_INCOME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@COAS_CODE", coasCode);
			cmd.addParameter("@FUND_CODE", fundCode);
			cmd.addParameter("@FSYR_CODE", fsyrCode);
			cmd.addParameter("@FSPD_CODE", fspdCode);
			cmd.addParameter("@ACCT_CODE", acctCode);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fGetTransfer(NString coasCode,NString fundCode,NString fsyrCode,NString fspdCode,NString asOfDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FNKEMS0.F_GET_TRANSFER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@COAS_CODE", coasCode);
			cmd.addParameter("@FUND_CODE", fundCode);
			cmd.addParameter("@FSYR_CODE", fsyrCode);
			cmd.addParameter("@FSPD_CODE", fspdCode);
			cmd.addParameter("@AS_OF_DATE", asOfDate);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
	
	
	
}
