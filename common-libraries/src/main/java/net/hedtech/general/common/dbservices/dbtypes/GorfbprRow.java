package net.hedtech.general.common.dbservices.dbtypes;

import morphis.foundations.core.appdatalayer.data.TableRow;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.NDate;
import morphis.foundations.core.types.NNumber;
import morphis.foundations.core.types.NString;

@DbRecordType(id = "GorfbprRow", dataSourceName = "GORFBPR", rowType = true)
public class GorfbprRow {
	
	@DbRecordField(dataSourceName = "GORFBPR_FGAC_USER_ID")
	public NString GorfbprFgacUserId;
	@DbRecordField(dataSourceName = "GORFBPR_FBPR_CODE")
	public NString GorfbprFbprCode;
	@DbRecordField(dataSourceName = "GORFBPR_ACTIVITY_DATE")
	public NDate GorfbprActivityDate;
	@DbRecordField(dataSourceName = "GORFBPR_USER_ID")
	public NString GorfbprUserId;
	@DbRecordField(dataSourceName = "GORFBPR_SURROGATE_ID")
	public NNumber GorfbprSurrogateId;
	@DbRecordField(dataSourceName = "GORFBPR_VERSION")
	public NNumber GorfbprVersion;
	@DbRecordField(dataSourceName = "GORFBPR_DATA_ORIGIN")
	public NString GorfbprDataOrigin;
	@DbRecordField(dataSourceName = "GORFBPR_VPDI_CODE")
	public NString GorfbprVpdiCode;
	
	private TableRow gorfbprrow;
	
	public GorfbprRow() {}
	
	public GorfbprRow(TableRow row) {
		
		this.gorfbprrow = row;
		
		this.GorfbprFgacUserId = gorfbprrow.getStr("GORFBPR_FGAC_USER_ID");
		this.GorfbprFbprCode = gorfbprrow.getStr("GORFBPR_FBPR_CODE");
		this.GorfbprActivityDate = gorfbprrow.getDate("GORFBPR_ACTIVITY_DATE");
		this.GorfbprUserId = gorfbprrow.getStr("GORFBPR_USER_ID");
		this.GorfbprSurrogateId = gorfbprrow.getNumber("GORFBPR_VERSION");
		this.GorfbprVersion = gorfbprrow.getNumber("GORFBPR_DATA_ORIGIN");
		this.GorfbprDataOrigin = gorfbprrow.getStr("GORFBPR_DATA_ORIGIN");
		this.GorfbprVpdiCode = gorfbprrow.getStr("GORFBPR_VPDI_CODE");
		
	}

	public NString getGorfbprFgacUserId() {
		return GorfbprFgacUserId;
	}

	public NString getGorfbprFbprCode() {
		return GorfbprFbprCode;
	}

	public NDate getGorfbprActivityDate() {
		return GorfbprActivityDate;
	}

	public NString getGorfbprUserId() {
		return GorfbprUserId;
	}

	public NNumber getGorfbprSurrogateId() {
		return GorfbprSurrogateId;
	}

	public NNumber getGorfbprVersion() {
		return GorfbprVersion;
	}

	public NString getGorfbprDataOrigin() {
		return GorfbprDataOrigin;
	}

	public NString getGorfbprVpdiCode() {
		return GorfbprVpdiCode;
	}
	
	
}
