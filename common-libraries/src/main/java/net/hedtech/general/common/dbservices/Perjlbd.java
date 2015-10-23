package net.hedtech.general.common.dbservices;

import java.util.*;

import net.hedtech.general.common.dbservices.NpJobEarnings.JobEarningsRecRow;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbTableType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;
import static morphis.foundations.core.types.Types.*;

public class Perjlbd {

	
	@DbRecordType(id="AttributeRectypeRow", dataSourceName="PERJLBD.ATTRIBUTE_RECTYPE")
	public static class AttributeRectypeRow
	{
		@DbRecordField(dataSourceName="FOUND")
		public NBool Found;
		@DbRecordField(dataSourceName="NOTFOUND")
		public NBool Notfound;
	}

	
	@DbRecordType(id="PerjlbdRectypeRow", dataSourceName="PERJLBD.PEBEMPL_RECTYPE")
	public static class PerjlbdRectypeRow
	{
		@DbRecordField(dataSourceName="TABL")
		public PerjlbdRowtypeRow Tabl;
		@DbRecordField(dataSourceName="ATTR")
		public AttributeRectypeRow Attr;
	}
	
	
	@DbRecordType(id="PerjlbdRowtypeRow", dataSourceName="PERJLBD.PERJLBD_ROWTYPE")
	public static class PerjlbdRowtypeRow
	{
		@DbRecordField(dataSourceName="PERJLBD_PIDM")
		public NNumber PerjlbdPidm;
		@DbRecordField(dataSourceName="PERJLBD_POSN")
		public NString PerjlbdPosn;
		@DbRecordField(dataSourceName="PERJLBD_SUFF")
		public NString PerjlbdSuff;
		@DbRecordField(dataSourceName="PERJLBD_PERCENT")
		public NNumber PerjlbdPercent;
		@DbRecordField(dataSourceName="PERJLBD_USER_ID")
		public NString PerjlbdUserId;
		@DbRecordField(dataSourceName="PERJLBD_ACTIVITY_DATE")
		public NDate PerjlbdActivityDate;
		@DbRecordField(dataSourceName="PERJLBD_COAS_CODE")
		public NString PerjlbdCoasCode;
		@DbRecordField(dataSourceName="PERJLBD_ACCI_CODE")
		public NString PerjlbdAcciCode;
		@DbRecordField(dataSourceName="PERJLBD_FUND_CODE")
		public NString PerjlbdFundCode;
		@DbRecordField(dataSourceName="PERJLBD_ORGN_CODE")
		public NString PerjlbdOrgnCode;
		@DbRecordField(dataSourceName="PERJLBD_ACCT_CODE")
		public NString PerjlbdAcctCode;
		@DbRecordField(dataSourceName="PERJLBD_PROG_CODE")
		public NString PerjlbdProgCode;
		@DbRecordField(dataSourceName="PERJLBD_ACTV_CODE")
		public NString PerjlbdActvCode;
		@DbRecordField(dataSourceName="PERJLBD_LOCN_CODE")
		public NString PerjlbdLocnCode;
		@DbRecordField(dataSourceName="PERJLBD_PROJ_CODE")
		public NString PerjlbdProjCode;
		@DbRecordField(dataSourceName="PERJLBD_CTYP_CODE")
		public NString PerjlbdCtypCode;
		@DbRecordField(dataSourceName="PERJLBD_ACCT_CODE_EXTERNAL")
		public NString PerjlbdAcctCodeExternal;
		
		public PerjlbdRowtypeRow(){
			super();
		}
		
		public PerjlbdRowtypeRow(Row PerjlbdResults){
			super();
			PerjlbdPidm = toNumber(PerjlbdResults.getObject(1));
			PerjlbdPosn = toStr(PerjlbdResults.getObject(2));
			PerjlbdSuff = toStr(PerjlbdResults.getObject(3));
			PerjlbdPercent = toNumber(PerjlbdResults.getObject(4));
			PerjlbdUserId = toStr(PerjlbdResults.getObject(5));
			PerjlbdActivityDate = toDate(PerjlbdResults.getObject(6));
			PerjlbdCoasCode = toStr(PerjlbdResults.getObject(7));
			PerjlbdAcciCode = toStr(PerjlbdResults.getObject(8));
			PerjlbdFundCode = toStr(PerjlbdResults.getObject(9));
			PerjlbdOrgnCode = toStr(PerjlbdResults.getObject(10));
			PerjlbdAcctCode = toStr(PerjlbdResults.getObject(11));
			PerjlbdProgCode = toStr(PerjlbdResults.getObject(12));
			PerjlbdActvCode = toStr(PerjlbdResults.getObject(13));
			PerjlbdLocnCode = toStr(PerjlbdResults.getObject(14));
			PerjlbdProjCode = toStr(PerjlbdResults.getObject(15));
			PerjlbdCtypCode = toStr(PerjlbdResults.getObject(16));
			PerjlbdAcctCodeExternal = toStr(PerjlbdResults.getObject(17));
		}
		
	}
	
	@DbTableType(id="Perjlbd.PerjlbdTabRow", dataSourceName="PERJLBD.PERJLBD_TAB", indexed=true)
	public static class PerjlbdTabRow extends Table<PerjlbdTabRow> {
	}
	
}
