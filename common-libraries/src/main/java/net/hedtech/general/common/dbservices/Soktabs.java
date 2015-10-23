package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Soktabs {
	
	
	@DbRecordType(id="SarchklRecTypeRow", dataSourceName="SARCHKL_REC_TYPE")
	public static class SarchklRecTypeRow
	{
		@DbRecordField(dataSourceName="SARCHKL_PIDM")
		public NNumber SarchklPidm;
		@DbRecordField(dataSourceName="SARCHKL_TERM_CODE_ENTRY")
		public NString SarchklTermCodeEntry;
		@DbRecordField(dataSourceName="SARCHKL_APPL_NO")
		public NNumber SarchklApplNo;
		@DbRecordField(dataSourceName="SARCHKL_ADMR_CODE")
		public NString SarchklAdmrCode;
		@DbRecordField(dataSourceName="SARCHKL_MANDATORY_IND")
		public NString SarchklMandatoryInd;
		@DbRecordField(dataSourceName="SARCHKL_REQ_DATE1")
		public NDate SarchklReqDate1;
		@DbRecordField(dataSourceName="SARCHKL_REQ_DATE2")
		public NDate SarchklReqDate2;
		@DbRecordField(dataSourceName="SARCHKL_REQ_COUNT")
		public NNumber SarchklReqCount;
		@DbRecordField(dataSourceName="SARCHKL_DEADLINE_DATE")
		public NDate SarchklDeadlineDate;
		@DbRecordField(dataSourceName="SARCHKL_RECEIVE_DATE")
		public NDate SarchklReceiveDate;
		@DbRecordField(dataSourceName="SARCHKL_COMMENT")
		public NString SarchklComment;
		@DbRecordField(dataSourceName="SARCHKL_CODE_VALUE")
		public NString SarchklCodeValue;
		@DbRecordField(dataSourceName="SARCHKL_SOURCE")
		public NString SarchklSource;
		@DbRecordField(dataSourceName="SARCHKL_SOURCE_DATE")
		public NDate SarchklSourceDate;
		@DbRecordField(dataSourceName="SARCHKL_ACTIVITY_DATE")
		public NDate SarchklActivityDate;
		@DbRecordField(dataSourceName="SARCHKL_PRINT_IND")
		public NString SarchklPrintInd;
		@DbRecordField(dataSourceName="SARCHKL_ROWID")
		public UnknownTypes.Rowid SarchklRowid;
		@DbRecordField(dataSourceName="SARCHKL_CKSR_CODE")
		public NString SarchklCksrCode;
		@DbRecordField(dataSourceName="SARCHKL_CKST_CODE")
		public NString SarchklCkstCode;
	}

	
	@DbRecordType(id="TabTypeRecRow", dataSourceName="TAB_TYPE_REC")
	public static class TabTypeRecRow
	{
		@DbRecordField(dataSourceName="SSRMEET_MON_DAY")
		public NString SsrmeetMonDay;
		@DbRecordField(dataSourceName="SSRMEET_TUE_DAY")
		public NString SsrmeetTueDay;
		@DbRecordField(dataSourceName="SSRMEET_WED_DAY")
		public NString SsrmeetWedDay;
		@DbRecordField(dataSourceName="SSRMEET_THU_DAY")
		public NString SsrmeetThuDay;
		@DbRecordField(dataSourceName="SSRMEET_FRI_DAY")
		public NString SsrmeetFriDay;
		@DbRecordField(dataSourceName="SSRMEET_SAT_DAY")
		public NString SsrmeetSatDay;
		@DbRecordField(dataSourceName="SSRMEET_SUN_DAY")
		public NString SsrmeetSunDay;
	}

	
	@DbRecordType(id="TabTypeRowRow", dataSourceName="TAB_TYPE_ROW")
	public static class TabTypeRowRow
	{
		@DbRecordField(dataSourceName="SSBSECT_ROWID")
		public UnknownTypes.Rowid SsbsectRowid;
		@DbRecordField(dataSourceName="SSBSECT_SEATS_AVAIL")
		public NNumber SsbsectSeatsAvail;
		@DbRecordField(dataSourceName="SSBSECT_WAIT_AVAIL")
		public NNumber SsbsectWaitAvail;
		@DbRecordField(dataSourceName="SSBSECT_WAIT_CAPACITY")
		public NNumber SsbsectWaitCapacity;
		@DbRecordField(dataSourceName="SSBSECT_WAIT_COUNT")
		public NNumber SsbsectWaitCount;
		@DbRecordField(dataSourceName="SSBSECT_RESERVED_IND")
		public NString SsbsectReservedInd;
	}

	
	
}
