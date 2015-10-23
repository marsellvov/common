package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwrcbref {
		public static DataCursor fGetAidylist(NNumber pPidm,NString pAidyear) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWRCBREF.F_GET_AIDYLIST", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDYEAR", pAidyear);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fGetDirList(NNumber pidmIn,NString aidyCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWRCBREF.F_GET_DIR_LIST", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@AIDY_CODE_IN", aidyCodeIn);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fGetNopayData(NNumber pidmIn,NString aidyCodeIn,NString suffIn,NString fundIn,NNumber authHrsIn,NNumber authEarningsIn,NNumber stipendAmtIn,NString posnIn,NString placeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWRCBREF.F_GET_NOPAY_DATA", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@AIDY_CODE_IN", aidyCodeIn);
			cmd.addParameter("@SUFF_IN", suffIn);
			cmd.addParameter("@FUND_IN", fundIn);
			cmd.addParameter("@AUTH_HRS_IN", authHrsIn);
			cmd.addParameter("@AUTH_EARNINGS_IN", authEarningsIn);
			cmd.addParameter("@STIPEND_AMT_IN", stipendAmtIn);
			cmd.addParameter("@POSN_IN", posnIn);
			cmd.addParameter("@PLACE_IN", placeIn);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fGetPersonalAidyList(NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWRCBREF.F_GET_PERSONAL_AIDY_LIST", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static NString fGetPositionTitle(NString posnIn,NString placeIn,NString aidyIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWRCBREF.F_GET_POSITION_TITLE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@POSN_IN", posnIn);
			cmd.addParameter("@PLACE_IN", placeIn);
			cmd.addParameter("@AIDY_IN", aidyIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fGetWsDisplayData(NNumber pidmIn,NString aidyCodeIn,NString suffIn,NString fundIn,NNumber authHrsIn,NNumber authEarningsIn,NNumber stipendAmtIn,NString posnIn,NString placeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWRCBREF.F_GET_WS_DISPLAY_DATA", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@AIDY_CODE_IN", aidyCodeIn);
			cmd.addParameter("@SUFF_IN", suffIn);
			cmd.addParameter("@FUND_IN", fundIn);
			cmd.addParameter("@AUTH_HRS_IN", authHrsIn);
			cmd.addParameter("@AUTH_EARNINGS_IN", authEarningsIn);
			cmd.addParameter("@STIPEND_AMT_IN", stipendAmtIn);
			cmd.addParameter("@POSN_IN", posnIn);
			cmd.addParameter("@PLACE_IN", placeIn);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static NString fValidateAidYear(NNumber pidmIn,NString aidyIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWRCBREF.F_VALIDATE_AID_YEAR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@AIDY_IN", aidyIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	@DbRecordType(id="AidyRecRow", dataSourceName="AIDY_REC")
	public static class AidyRecRow
	{
		@DbRecordField(dataSourceName="R_AIDY_CODE")
		public NString RAidyCode;
		@DbRecordField(dataSourceName="R_AIDY_DESC")
		public NString RAidyDesc;
	}

	
	@DbRecordType(id="DirListRecRow", dataSourceName="DIR_LIST_REC")
	public static class DirListRecRow
	{
		@DbRecordField(dataSourceName="R_PLACE")
		public NString RPlace;
		@DbRecordField(dataSourceName="R_SUPERERVISOR")
		public NString RSuperervisor;
		@DbRecordField(dataSourceName="R_AREA_CODE")
		public NString RAreaCode;
		@DbRecordField(dataSourceName="R_NUMBER")
		public NString RNumber;
		@DbRecordField(dataSourceName="R_EXTENTION")
		public NString RExtention;
	}

	
	@DbRecordType(id="WsDataRecRow", dataSourceName="WS_DATA_REC")
	public static class WsDataRecRow
	{
		@DbRecordField(dataSourceName="R_PAY_DATE")
		public NString RPayDate;
		@DbRecordField(dataSourceName="R_REMAINING_AMT")
		public NString RRemainingAmt;
		@DbRecordField(dataSourceName="R_REMAINING_PCT")
		public NString RRemainingPct;
		@DbRecordField(dataSourceName="R_REMAINING_HRS")
		public NString RRemainingHrs;
		@DbRecordField(dataSourceName="R_AUTH_EARNINGS")
		public NString RAuthEarnings;
		@DbRecordField(dataSourceName="R_STIPEND_AMT")
		public NString RStipendAmt;
		@DbRecordField(dataSourceName="R_EARNED_AMT")
		public NString REarnedAmt;
		@DbRecordField(dataSourceName="R_FUND_TITLE")
		public NString RFundTitle;
		@DbRecordField(dataSourceName="R_PLACE_DESC")
		public NString RPlaceDesc;
		@DbRecordField(dataSourceName="R_POSN")
		public NString RPosn;
	}

	
	
}
