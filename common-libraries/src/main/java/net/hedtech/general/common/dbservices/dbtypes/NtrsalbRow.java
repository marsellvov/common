package net.hedtech.general.common.dbservices.dbtypes;

import morphis.foundations.core.appdatalayer.data.TableRow;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.NDate;
import morphis.foundations.core.types.NNumber;
import morphis.foundations.core.types.NString;


@DbRecordType(id="NtrsalbRow",     dataSourceName="NTRSALB", rowType=true)
public class NtrsalbRow
{
	@DbRecordField(dataSourceName="NTRSALB_TABLE")
	public NString NtrsalbTable;
	@DbRecordField(dataSourceName="NTRSALB_GRADE")
	public NString NtrsalbGrade;
	@DbRecordField(dataSourceName="NTRSALB_IND")
	public NString NtrsalbInd;
	@DbRecordField(dataSourceName="NTRSALB_LOW")
	public NNumber NtrsalbLow;
	@DbRecordField(dataSourceName="NTRSALB_MIDPOINT")
	public NNumber NtrsalbMidpoint;
	@DbRecordField(dataSourceName="NTRSALB_HIGH")
	public NNumber NtrsalbHigh;
	@DbRecordField(dataSourceName="NTRSALB_ACTIVITY_DATE")
	public NDate NtrsalbActivityDate;
	@DbRecordField(dataSourceName="NTRSALB_SGRP_CODE")
	public NString NtrsalbSgrpCode;
	@DbRecordField(dataSourceName="NTRSALB_SURROGATE_ID")
	public NNumber NtrsalbSurrogateId;
	@DbRecordField(dataSourceName="NTRSALB_VERSION")
	public NNumber NtrsalbVersion;
	@DbRecordField(dataSourceName="NTRSALB_USER_ID")
	public NString NtrsalbUserId;
	@DbRecordField(dataSourceName="NTRSALB_DATA_ORIGIN")
	public NString NtrsalbDataOrigin;
	@DbRecordField(dataSourceName="NTRSALB_VPDI_CODE")
	public NString NtrsalbVpdiCode;
	private TableRow ntrsalbrow;
	
	public NtrsalbRow(){
		super();
	}
	public NtrsalbRow(TableRow row) {
		this.ntrsalbrow = row;
		this.NtrsalbTable = ntrsalbrow.getStr("NTRSALB_TABLE");
		this.NtrsalbGrade = ntrsalbrow.getStr("NTRSALB_GRADE");
		this.NtrsalbInd = ntrsalbrow.getStr("NTRSALB_IND");
		this.NtrsalbLow = ntrsalbrow.getNumber("NTRSALB_LOW");
		this.NtrsalbMidpoint = ntrsalbrow.getNumber("NTRSALB_MIDPOINT");
		this.NtrsalbHigh = ntrsalbrow.getNumber("NTRSALB_HIGH");
		this.NtrsalbActivityDate = ntrsalbrow.getDate("NTRSALB_ACTIVITY_DATE");
		this.NtrsalbSgrpCode = ntrsalbrow.getStr("NTRSALB_SGRP_CODE");
		this.NtrsalbSurrogateId = ntrsalbrow.getNumber("NTRSALB_SURROGATE_ID");
		this.NtrsalbVersion = ntrsalbrow.getNumber("NTRSALB_VERSION");
		this.NtrsalbUserId = ntrsalbrow.getStr("NTRSALB_USER_ID");
		this.NtrsalbDataOrigin = ntrsalbrow.getStr("NTRSALB_DATA_ORIGIN");
		this.NtrsalbVpdiCode = ntrsalbrow.getStr("NTRSALB_VPDI_CODE");
	}
}

