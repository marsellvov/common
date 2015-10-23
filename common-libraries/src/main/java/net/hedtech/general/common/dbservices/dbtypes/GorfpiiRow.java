package net.hedtech.general.common.dbservices.dbtypes;

import morphis.foundations.core.appdatalayer.data.TableRow;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.NDate;
import morphis.foundations.core.types.NNumber;
import morphis.foundations.core.types.NString;

@DbRecordType(id = "GorfpiiRow", dataSourceName = "GORFPII", rowType = true)
public class GorfpiiRow {
	
	@DbRecordField(dataSourceName = "GORFPII_FGAC_USER_ID")
	public NString GorfpiiFgacUserId;
	@DbRecordField(dataSourceName = "GORFPII_FDMN_CODE_PII")
	public NString GorfpiiFdmnCodePii;
	@DbRecordField(dataSourceName = "GORFPII_ACTIVITY_DATE")
	public NDate GorfpiiActivityDate;
	@DbRecordField(dataSourceName = "GORFPII_USER_ID")
	public NString GorfpiiUserId;
	@DbRecordField(dataSourceName = "GORFPII_SURROGATE_ID")
	public NNumber GorfpiiSurrogateId;
	@DbRecordField(dataSourceName = "GORFPII_VERSION")
	public NNumber GorfpiiVersion;
	@DbRecordField(dataSourceName = "GORFPII_DATA_ORIGIN")
	public NString GorfpiiDataOrigin;
	@DbRecordField(dataSourceName = "GORFPII_VPDI_CODE")
	public NString GorfpiiVpdiCode;
	
	private TableRow gorfpiirow;
	
	public GorfpiiRow() {}
	
	public GorfpiiRow(TableRow row) {
		
		this.gorfpiirow = row;
		
		this.GorfpiiFgacUserId = gorfpiirow.getStr("GORFPII_FGAC_USER_ID");
		this.GorfpiiFdmnCodePii = gorfpiirow.getStr("GORFPII_FDMN_CODE_PII");
		this.GorfpiiActivityDate = gorfpiirow.getDate("GORFPII_ACTIVITY_DATE");
		this.GorfpiiUserId = gorfpiirow.getStr("GORFPII_USER_ID");
		this.GorfpiiSurrogateId = gorfpiirow.getNumber("GORFPII_SURROGATE_ID");
		this.GorfpiiVersion = gorfpiirow.getNumber("GORFPII_VERSION");
		this.GorfpiiDataOrigin = gorfpiirow.getStr("GORFPII_DATA_ORIGIN");
		this.GorfpiiVpdiCode = gorfpiirow.getStr("GORFPII_VPDI_CODE");
	}

	public NString getGorfpiiFgacUserId() {
		return GorfpiiFgacUserId;
	}

	public NString getGorfpiiFdmnCodePii() {
		return GorfpiiFdmnCodePii;
	}

	public NDate getGorfpiiActivityDate() {
		return GorfpiiActivityDate;
	}

	public NString getGorfpiiUserId() {
		return GorfpiiUserId;
	}

	public NNumber getGorfpiiSurrogateId() {
		return GorfpiiSurrogateId;
	}

	public NNumber getGorfpiiVersion() {
		return GorfpiiVersion;
	}

	public NString getGorfpiiDataOrigin() {
		return GorfpiiDataOrigin;
	}

	public NString getGorfpiiVpdiCode() {
		return GorfpiiVpdiCode;
	}
	
	
}
