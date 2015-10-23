package net.hedtech.general.common.dbservices.dbtypes;

import morphis.foundations.core.appdatalayer.data.TableRow;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.NDate;
import morphis.foundations.core.types.NNumber;
import morphis.foundations.core.types.NString;

@DbRecordType(id = "GorfgusRow", dataSourceName = "GORFGUS", rowType = true)
public class GorfgusRow {
	
	@DbRecordField(dataSourceName = "GORFGUS_FGAC_CODE")
	public NString GorfgusFgacCode;
	@DbRecordField(dataSourceName = "GORFGUS_FDMN_CODE")
	public NString GorfgusFdmnCode;
	@DbRecordField(dataSourceName = "GORFGUS_FPRD_SEQNO")
	public NNumber GorfgusFprdSeqno;
	@DbRecordField(dataSourceName = "GORFGUS_FGAC_USER_ID")
	public NString GorfgusFgacUserId;
	@DbRecordField(dataSourceName = "GORFGUS_SELECT_IND")
	public NString GorfgusSelectInd;
	@DbRecordField(dataSourceName = "GORFGUS_INSERT_IND")
	public NString GorfgusInsertInd;
	@DbRecordField(dataSourceName = "GORFGUS_UPDATE_IND")
	public NString GorfgusUpdateInd;
	@DbRecordField(dataSourceName = "GORFGUS_DELETE_IND")
	public NString GorfgusDeleteInd;
	@DbRecordField(dataSourceName = "GORFGUS_ACTIVITY_DATE")
	public NDate GorfgusActivityDate;
	@DbRecordField(dataSourceName = "GORFGUS_USER_ID")
	public NString GorfgusUserId;
	@DbRecordField(dataSourceName = "GORFGUS_SURROGATE_ID")
	public NNumber GorfgusSurrogateId;
	@DbRecordField(dataSourceName = "GORFGUS_VERSION")
	public NNumber GorfgusVersion;
	@DbRecordField(dataSourceName = "GORFGUS_DATA_ORIGIN")
	public NString GorfgusDataOrigin;
	@DbRecordField(dataSourceName = "GORFGUS_VPDI_CODE")
	public NString GorfgusVpdiCode;
	
	private TableRow gorfgusrow;
	
	public GorfgusRow() {}

	public GorfgusRow(TableRow row) {
		
		this.gorfgusrow = row;
		
		this.GorfgusFgacCode = gorfgusrow.getStr("GORFGUS_FGAC_CODE");
		this.GorfgusFdmnCode = gorfgusrow.getStr("GORFGUS_FDMN_CODE");
		this.GorfgusFprdSeqno = gorfgusrow.getNumber("GORFGUS_FPRD_SEQNO");
		this.GorfgusFgacUserId = gorfgusrow.getStr("GORFGUS_FGAC_USER_ID");
		this.GorfgusSelectInd = gorfgusrow.getStr("GORFGUS_SELECT_IND");
		this.GorfgusInsertInd = gorfgusrow.getStr("GORFGUS_INSERT_IND");
		this.GorfgusUpdateInd = gorfgusrow.getStr("GORFGUS_UPDATE_IND");
		this.GorfgusDeleteInd = gorfgusrow.getStr("GORFGUS_DELETE_IND");
		this.GorfgusActivityDate = gorfgusrow.getDate("GORFGUS_ACTIVITY_DATE");
		this.GorfgusUserId = gorfgusrow.getStr("GORFGUS_USER_ID");
		this.GorfgusSurrogateId = gorfgusrow.getNumber("GORFGUS_SURROGATE_ID");
		this.GorfgusVersion = gorfgusrow.getNumber("GORFGUS_VERSION");
		this.GorfgusDataOrigin = gorfgusrow.getStr("GORFGUS_DATA_ORIGIN");
		this.GorfgusVpdiCode = gorfgusrow.getStr("GORFGUS_VPDI_CODE");
		
	}

	public NString getGorfgusFgacCode() {
		return GorfgusFgacCode;
	}

	public NString getGorfgusFdmnCode() {
		return GorfgusFdmnCode;
	}

	public NNumber getGorfgusFprdSeqno() {
		return GorfgusFprdSeqno;
	}

	public NString getGorfgusFgacUserId() {
		return GorfgusFgacUserId;
	}

	public NString getGorfgusSelectInd() {
		return GorfgusSelectInd;
	}

	public NString getGorfgusInsertInd() {
		return GorfgusInsertInd;
	}

	public NString getGorfgusUpdateInd() {
		return GorfgusUpdateInd;
	}

	public NString getGorfgusDeleteInd() {
		return GorfgusDeleteInd;
	}

	public NDate getGorfgusActivityDate() {
		return GorfgusActivityDate;
	}

	public NString getGorfgusUserId() {
		return GorfgusUserId;
	}

	public NNumber getGorfgusSurrogateId() {
		return GorfgusSurrogateId;
	}

	public NNumber getGorfgusVersion() {
		return GorfgusVersion;
	}

	public NString getGorfgusDataOrigin() {
		return GorfgusDataOrigin;
	}

	public NString getGorfgusVpdiCode() {
		return GorfgusVpdiCode;
	}
	
	
}
