package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GbCurrency {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CURRENCY.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fCodeExistsActive(NString pCurrCode,NDate pRateEffDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CURRENCY.F_CODE_EXISTS_ACTIVE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CURR_CODE", pCurrCode);
			cmd.addParameter("@P_RATE_EFF_DATE", pRateEffDate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fExists(NString pCurrCode,NDate pRateEffDate,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CURRENCY.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CURR_CODE", pCurrCode);
			cmd.addParameter("@P_RATE_EFF_DATE", pRateEffDate);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pCurrCode,NDate pRateEffDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CURRENCY.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_CURR_CODE", pCurrCode);
			cmd.addParameter("@P_RATE_EFF_DATE", pRateEffDate);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CURRENCY.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pCurrCode,NDate pRateEffDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CURRENCY.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_CURR_CODE", pCurrCode);
			cmd.addParameter("@P_RATE_EFF_DATE", pRateEffDate);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
	
	
	@DbRecordType(id="CurrencyRecRow", dataSourceName="CURRENCY_REC")
	public static class CurrencyRecRow
	{
		@DbRecordField(dataSourceName="R_CURR_CODE")
		public NString RCurrCode;
		@DbRecordField(dataSourceName="R_RATE_EFF_DATE")
		public NDate RRateEffDate;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_RATE_NCHG_DATE")
		public NDate RRateNchgDate;
		@DbRecordField(dataSourceName="R_RATE_TERM_DATE")
		public NDate RRateTermDate;
		@DbRecordField(dataSourceName="R_TITLE")
		public NString RTitle;
		@DbRecordField(dataSourceName="R_STATUS_IND")
		public NString RStatusInd;
		@DbRecordField(dataSourceName="R_AP_ACCT")
		public NString RApAcct;
		@DbRecordField(dataSourceName="R_NATION_CODE")
		public NString RNationCode;
		@DbRecordField(dataSourceName="R_CONV_TYPE")
		public NString RConvType;
		@DbRecordField(dataSourceName="R_EXCH_ACCT")
		public NString RExchAcct;
		@DbRecordField(dataSourceName="R_BANK_CODE")
		public NString RBankCode;
		@DbRecordField(dataSourceName="R_DISB_AGENT_PIDM")
		public NNumber RDisbAgentPidm;
		@DbRecordField(dataSourceName="R_AP_ACCT2")
		public NString RApAcct2;
		@DbRecordField(dataSourceName="R_EXCH_ACCT2")
		public NString RExchAcct2;
		@DbRecordField(dataSourceName="R_SCOD_CODE_ISO")
		public NString RScodCodeIso;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
