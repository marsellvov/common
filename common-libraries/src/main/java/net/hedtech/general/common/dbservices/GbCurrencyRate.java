package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GbCurrencyRate {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CURRENCY_RATE.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NNumber fConvertedAmount(NString pCurrCode,NDate pRateEffDate,NNumber pNumDecimal,NNumber pAmount) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CURRENCY_RATE.F_CONVERTED_AMOUNT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_CURR_CODE", pCurrCode);
			cmd.addParameter("@P_RATE_EFF_DATE", pRateEffDate);
			cmd.addParameter("@P_NUM_DECIMAL", pNumDecimal);
			cmd.addParameter("@P_AMOUNT", pAmount);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fExists(NString pCurrCode,NDate pRateEffDate,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CURRENCY_RATE.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CURR_CODE", pCurrCode);
			cmd.addParameter("@P_RATE_EFF_DATE", pRateEffDate);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pCurrCode,NDate pRateEffDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CURRENCY_RATE.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_CURR_CODE", pCurrCode);
			cmd.addParameter("@P_RATE_EFF_DATE", pRateEffDate);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CURRENCY_RATE.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pCurrCode,NDate pRateEffDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CURRENCY_RATE.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_CURR_CODE", pCurrCode);
			cmd.addParameter("@P_RATE_EFF_DATE", pRateEffDate);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pEditCalc(NString currCodeIn,NNumber foreignAmtIn,NDate currEffDateIn,NNumber numDecimalIn,NNumber numPreDecimalIn,Ref<NNumber> convertedAmtOut,Ref<NString> errorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CURRENCY_RATE.P_EDIT_CALC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CURR_CODE_IN", currCodeIn);
			cmd.addParameter("@FOREIGN_AMT_IN", foreignAmtIn);
			cmd.addParameter("@CURR_EFF_DATE_IN", currEffDateIn);
			cmd.addParameter("@NUM_DECIMAL_IN", numDecimalIn);
			cmd.addParameter("@NUM_PRE_DECIMAL_IN", numPreDecimalIn);
			cmd.addParameter("@CONVERTED_AMT_OUT", NNumber.class);
			cmd.addParameter("@ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			convertedAmtOut.val = cmd.getParameterValue("@CONVERTED_AMT_OUT", NNumber.class);
			errorMsgOut.val = cmd.getParameterValue("@ERROR_MSG_OUT", NString.class);


		}
		
	
	
	@DbRecordType(id="CurrencyRateRecRow", dataSourceName="CURRENCY_RATE_REC")
	public static class CurrencyRateRecRow
	{
		@DbRecordField(dataSourceName="R_CURR_CODE")
		public NString RCurrCode;
		@DbRecordField(dataSourceName="R_CONV_RATE")
		public NNumber RConvRate;
		@DbRecordField(dataSourceName="R_RATE_EFF_DATE")
		public NDate RRateEffDate;
		@DbRecordField(dataSourceName="R_RATE_NCHG_DATE")
		public NDate RRateNchgDate;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
