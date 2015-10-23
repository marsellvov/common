package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Nokpict {
		public static PictRectypeRow fPictRec(NString pPictCode,NString pEclsCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKPICT.F_PICT_REC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DbTypes.createStructType(PictRectypeRow.class));
			cmd.addParameter("@P_PICT_CODE", pPictCode);
			cmd.addParameter("@P_ECLS_CODE", pEclsCode);
				
			cmd.execute();

			return cmd.getReturnValue(PictRectypeRow.class);

		}
		
	
	
	@DbRecordType(id="PictRectypeRow", dataSourceName="NOKPICT.PICT_RECTYPE")
	public static class PictRectypeRow
	{
		@DbRecordField(dataSourceName="R_CODE")
		public NString RCode;
		@DbRecordField(dataSourceName="R_DESC")
		public NString RDesc;
		@DbRecordField(dataSourceName="R_PAYS_PER_YEAR")
		public NNumber RPaysPerYear;
		@DbRecordField(dataSourceName="R_TAX_FACTOR")
		public NNumber RTaxFactor;
		@DbRecordField(dataSourceName="R_SUPP_PAY_IND")
		public NString RSuppPayInd;
		@DbRecordField(dataSourceName="R_CODE_ORIG")
		public NString RCodeOrig;
		@DbRecordField(dataSourceName="R_ACTIVITY_DATE")
		public NDate RActivityDate;
		@DbRecordField(dataSourceName="R_ROE_PERIOD_TYPE")
		public NString RRoePeriodType;
		@DbRecordField(dataSourceName="R_UI_MIN_HOURS")
		public NNumber RUiMinHours;
		@DbRecordField(dataSourceName="R_UI_MIN_EARNINGS")
		public NNumber RUiMinEarnings;
		@DbRecordField(dataSourceName="R_UI_MAX_EARNINGS")
		public NNumber RUiMaxEarnings;
		@DbRecordField(dataSourceName="R_UI_WEEKS")
		public NNumber RUiWeeks;
		@DbRecordField(dataSourceName="R_BANK_CODE")
		public NString RBankCode;
		@DbRecordField(dataSourceName="R_TS_CUTOFF_DAYS")
		public NNumber RTsCutoffDays;
		@DbRecordField(dataSourceName="R_TS_CUTOFF_TIME")
		public NString RTsCutoffTime;
		@DbRecordField(dataSourceName="R_TS_PRIOR_AFTER_IND")
		public NString RTsPriorAfterInd;
		@DbRecordField(dataSourceName="R_TS_WEB_VIEW_MONTHS")
		public NNumber RTsWebViewMonths;
		@DbRecordField(dataSourceName="R_TS_LEAVE_REQUESTS")
		public NNumber RTsLeaveRequests;
		@DbRecordField(dataSourceName="R_CHECK_ISSUED_DAYS")
		public NNumber RCheckIssuedDays;
		@DbRecordField(dataSourceName="R_CHECK_ISSUED_IND")
		public NString RCheckIssuedInd;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
