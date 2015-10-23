package net.hedtech.general.common.dbservices.dbtypes;

import morphis.foundations.core.appdatalayer.data.TableRow;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.NDate;
import morphis.foundations.core.types.NNumber;
import morphis.foundations.core.types.NString;

@DbRecordType(id = "GobeaccRow", dataSourceName = "GOBEACC", rowType = true)
public class GobeaccRow {
	
	@DbRecordField(dataSourceName = "GOBEACC_PIDM")
	public NNumber GobeaccPidm;
	@DbRecordField(dataSourceName = "GOBEACC_USERNAME")
	public NString GobeaccUsername;
	@DbRecordField(dataSourceName = "GOBEACC_USER_ID")
	public NString GobeaccUserId;
	@DbRecordField(dataSourceName = "GOBEACC_ACTIVITY_DATE")
	public NDate GobeaccActivityDate;
	@DbRecordField(dataSourceName = "GOBEACC_SURROGATE_ID")
	public NNumber GobeaccSurrogateId;
	@DbRecordField(dataSourceName = "GOBEACC_VERSION")
	public NNumber GobeaccVersion;
	@DbRecordField(dataSourceName = "GOBEACC_DATA_ORIGIN")
	public NString GobeaccDataOrigin;
	@DbRecordField(dataSourceName = "GOBEACC_VPDI_CODE")
	public NString GobeaccVpdiCode;
	
	private TableRow gobeaccrow;
	
	public GobeaccRow() {}

	public GobeaccRow(TableRow row) {
		
		this.gobeaccrow = row;
		this.GobeaccPidm = gobeaccrow.getNumber("GOBEACC_PIDM");
		this.GobeaccUsername = gobeaccrow.getStr("GOBEACC_USERNAME");
		this.GobeaccUserId = gobeaccrow.getStr("GOBEACC_USER_ID");
		this.GobeaccActivityDate = gobeaccrow.getDate("GOBEACC_ACTIVITY_DATE");
		this.GobeaccSurrogateId = gobeaccrow.getNumber("GOBEACC_SURROGATE_ID");
		this.GobeaccVersion = gobeaccrow.getNumber("GOBEACC_VERSION");
		this.GobeaccDataOrigin = gobeaccrow.getStr("GOBEACC_DATA_ORIGIN");
		this.GobeaccVpdiCode = gobeaccrow.getStr("GOBEACC_VPDI_CODE");
		
	}

	public NNumber getGobeaccPidm() {
		return GobeaccPidm;
	}

	public NString getGobeaccUsername() {
		return GobeaccUsername;
	}

	public NString getGobeaccUserId() {
		return GobeaccUserId;
	}

	public NDate getGobeaccActivityDate() {
		return GobeaccActivityDate;
	}

	public NNumber getGobeaccSurrogateId() {
		return GobeaccSurrogateId;
	}

	public NNumber getGobeaccVersion() {
		return GobeaccVersion;
	}

	public NString getGobeaccDataOrigin() {
		return GobeaccDataOrigin;
	}

	public NString getGobeaccVpdiCode() {
		return GobeaccVpdiCode;
	}
	
}