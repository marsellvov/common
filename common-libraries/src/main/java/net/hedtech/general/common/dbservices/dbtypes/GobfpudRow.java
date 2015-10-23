package net.hedtech.general.common.dbservices.dbtypes;

import morphis.foundations.core.appdatalayer.data.TableRow;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.NDate;
import morphis.foundations.core.types.NNumber;
import morphis.foundations.core.types.NString;

@DbRecordType(id = "GobfpudRow", dataSourceName = "GOBFPUD", rowType = true)
public class GobfpudRow {
	
	@DbRecordField(dataSourceName = "GOBFPUD_FGAC_USER_ID")
	public NString GobfpudFgacUserId;
	@DbRecordField(dataSourceName = "GOBFPUD_EXEMPT_IND")
	public NString GobfpudExemptInd;
	@DbRecordField(dataSourceName = "GOBFPUD_CROSS_DOMAIN_IND")
	public NString GobfpudCrossDomainInd;
	@DbRecordField(dataSourceName = "GOBFPUD_ACTIVITY_DATE")
	public NDate GobfpudActivityDate;
	@DbRecordField(dataSourceName = "GOBFPUD_USER_ID")
	public NString GobfpudUserId;
	@DbRecordField(dataSourceName = "GOBFPUD_FDMN_CODE")
	public NString GobfpudFdmnCode;
	@DbRecordField(dataSourceName = "GOBFPUD_SURROGATE_ID")
	public NNumber GobfpudSurrogateId;
	@DbRecordField(dataSourceName = "GOBFPUD_VERSION")
	public NNumber GobfpudVersion;
	@DbRecordField(dataSourceName = "GOBFPUD_DATA_ORIGIN")
	public NString GobfpudDataOrigin;
	@DbRecordField(dataSourceName = "GOBFPUD_VPDI_CODE")
	public NString GobfpudVpdiCode;
	
	private TableRow gobfpudrow;
	
	public GobfpudRow() {}
	
	public GobfpudRow(TableRow row) {
		
		this.gobfpudrow = row;
		
		this.GobfpudFgacUserId = gobfpudrow.getStr("GOBFPUD_FGAC_USER_ID");
		this.GobfpudExemptInd = gobfpudrow.getStr("GOBFPUD_EXEMPT_IND");
		this.GobfpudCrossDomainInd = gobfpudrow.getStr("GOBFPUD_CROSS_DOMAIN_IND");
		this.GobfpudActivityDate = gobfpudrow.getDate("GOBFPUD_ACTIVITY_DATE");
		this.GobfpudUserId = gobfpudrow.getStr("GOBFPUD_USER_ID");
		this.GobfpudFdmnCode = gobfpudrow.getStr("GOBFPUD_FDMN_CODE");
		this.GobfpudSurrogateId = gobfpudrow.getNumber("GOBFPUD_SURROGATE_ID");
		this.GobfpudVersion = gobfpudrow.getNumber("GOBFPUD_VERSION");
		this.GobfpudDataOrigin = gobfpudrow.getStr("GOBFPUD_DATA_ORIGIN");
		this.GobfpudVpdiCode = gobfpudrow.getStr("GOBFPUD_VPDI_CODE");
	}

	public NString getGobfpudFgacUserId() {
		return GobfpudFgacUserId;
	}

	public NString getGobfpudExemptInd() {
		return GobfpudExemptInd;
	}

	public NString getGobfpudCrossDomainInd() {
		return GobfpudCrossDomainInd;
	}

	public NDate getGobfpudActivityDate() {
		return GobfpudActivityDate;
	}

	public NString getGobfpudUserId() {
		return GobfpudUserId;
	}

	public NString getGobfpudFdmnCode() {
		return GobfpudFdmnCode;
	}

	public NNumber getGobfpudSurrogateId() {
		return GobfpudSurrogateId;
	}

	public NNumber getGobfpudVersion() {
		return GobfpudVersion;
	}

	public NString getGobfpudDataOrigin() {
		return GobfpudDataOrigin;
	}

	public NString getGobfpudVpdiCode() {
		return GobfpudVpdiCode;
	}
	
	

}
