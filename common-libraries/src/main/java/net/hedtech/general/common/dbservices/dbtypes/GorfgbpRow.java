package net.hedtech.general.common.dbservices.dbtypes;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;

@DbRecordType(id = "GorfgbpRow", dataSourceName = "GORFGBP", rowType = true)
public class GorfgbpRow {
	@DbRecordField(dataSourceName = "GORFGBP_FGAC_CODE")
	public NString GorfgbpFgacCode;
	@DbRecordField(dataSourceName = "GORFGBP_FDMN_CODE")
	public NString GorfgbpFdmnCode;
	@DbRecordField(dataSourceName = "GORFGBP_FPRD_SEQNO")
	public NNumber GorfgbpFprdSeqno;
	@DbRecordField(dataSourceName = "GORFGBP_FBPR_CODE")
	public NString GorfgbpFbprCode;
	@DbRecordField(dataSourceName = "GORFGBP_SELECT_IND")
	public NString GorfgbpSelectInd;
	@DbRecordField(dataSourceName = "GORFGBP_INSERT_IND")
	public NString GorfgbpInsertInd;
	@DbRecordField(dataSourceName = "GORFGBP_UPDATE_IND")
	public NString GorfgbpUpdateInd;
	@DbRecordField(dataSourceName = "GORFGBP_DELETE_IND")
	public NString GorfgbpDeleteInd;
	@DbRecordField(dataSourceName = "GORFGBP_ACTIVITY_DATE")
	public NDate GorfgbpActivityDate;
	@DbRecordField(dataSourceName = "GORFGBP_USER_ID")
	public NString GorfgbpUserId;
	@DbRecordField(dataSourceName = "GORFGBP_SURROGATE_ID")
	public NNumber GorfgbpSurrogateId;
	@DbRecordField(dataSourceName = "GORFGBP_VERSION")
	public NNumber GorfgbpVersion;
	@DbRecordField(dataSourceName = "GORFGBP_DATA_ORIGIN")
	public NString GorfgbpDataOrigin;
	@DbRecordField(dataSourceName = "GORFGBP_VPDI_CODE")
	public NString GorfgbpVpdiCode;

	private TableRow gorfgbprow;

	public GorfgbpRow(TableRow row) {

		this.gorfgbprow = row;
		this.GorfgbpFgacCode = gorfgbprow.getStr("GORFGBP_FGAC_CODE");
		this.GorfgbpFdmnCode = gorfgbprow.getStr("GORFGBP_FDMN_CODE");
		this.GorfgbpFprdSeqno = gorfgbprow.getNumber("GORFGBP_FPRD_SEQNO");
		this.GorfgbpFbprCode = gorfgbprow.getStr("GORFGBP_FBPR_CODE");
		this.GorfgbpSelectInd = gorfgbprow.getStr("GORFGBP_SELECT_IND");
		this.GorfgbpInsertInd = gorfgbprow.getStr("GORFGBP_INSERT_IND");
		this.GorfgbpUpdateInd = gorfgbprow.getStr("GORFGBP_UPDATE_IND");
		this.GorfgbpDeleteInd = gorfgbprow.getStr("GORFGBP_DELETE_IND");
		this.GorfgbpActivityDate = gorfgbprow.getDate("GORFGBP_ACTIVITY_DATE");
		this.GorfgbpUserId = gorfgbprow.getStr("GORFGBP_USER_ID");
		this.GorfgbpSurrogateId = gorfgbprow.getNumber("GORFGBP_SURROGATE_ID");
		this.GorfgbpVersion = gorfgbprow.getNumber("GORFGBP_VERSION");
		this.GorfgbpDataOrigin = gorfgbprow.getStr("GORFGBP_DATA_ORIGIN");
		this.GorfgbpVpdiCode = gorfgbprow.getStr("GORFGBP_VPDI_CODE");
	}
}
