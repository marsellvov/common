package net.hedtech.general.common.dbservices.dbtypes;

import morphis.foundations.core.appdatalayer.data.TableRow;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.NDate;
import morphis.foundations.core.types.NNumber;
import morphis.foundations.core.types.NString;

@DbRecordType(id = "GuroutpRow", dataSourceName = "GUROUTP", rowType = true)
public class GuroutpRow {
	@DbRecordField(dataSourceName = "GUROUTP_USER_NUM")
	public NNumber GuroutpUserNum;
	@DbRecordField(dataSourceName = "GUROUTP_ONE_UP_NO")
	public NNumber GuroutpOneUpNo;
	@DbRecordField(dataSourceName = "GUROUTP_FILE_NUMBER")
	public NNumber GuroutpFileNumber;
	@DbRecordField(dataSourceName = "GUROUTP_SEQ_NO")
	public NNumber GuroutpSeqNo;
	@DbRecordField(dataSourceName = "GUROUTP_LINE")
	public NString GuroutpLine;
	@DbRecordField(dataSourceName = "GUROUTP_SURROGATE_ID")
	public NNumber GuroutpSurrogateId;
	@DbRecordField(dataSourceName = "GUROUTP_VERSION")
	public NNumber GuroutpVersion;
	@DbRecordField(dataSourceName = "GUROUTP_USER_ID")
	public NString GuroutpUserId;
	@DbRecordField(dataSourceName = "GUROUTP_DATA_ORIGIN")
	public NString GuroutpDataOrigin;
	@DbRecordField(dataSourceName = "GUROUTP_ACTIVITY_DATE")
	public NDate GuroutpActivityDate;
	@DbRecordField(dataSourceName = "GUROUTP_VPDI_CODE")
	public NString GuroutpVpdiCode;

	private TableRow guroutprow;
	
	public GuroutpRow(){
		super();
	}
	
	public GuroutpRow(TableRow row) {

		this.guroutprow = row;
		this.GuroutpUserNum = guroutprow.getNumber("GUROUTP_USER_NUM");
		this.GuroutpOneUpNo = guroutprow.getNumber("GUROUTP_ONE_UP_NO");
		this.GuroutpFileNumber = guroutprow.getNumber("GUROUTP_FILE_NUMBER");
		this.GuroutpSeqNo = guroutprow.getNumber("GUROUTP_SEQ_NO");
		this.GuroutpLine = guroutprow.getStr("GUROUTP_LINE");
		this.GuroutpSurrogateId = guroutprow.getNumber("GUROUTP_SURROGATE_ID");
		this.GuroutpVersion = guroutprow.getNumber("GUROUTP_VERSION");
		this.GuroutpUserId = guroutprow.getStr("GUROUTP_USER_ID");
		this.GuroutpDataOrigin = guroutprow.getStr("GUROUTP_DATA_ORIGIN");
		this.GuroutpActivityDate = guroutprow.getDate("GUROUTP_ACTIVITY_DATE");
		this.GuroutpVpdiCode = guroutprow.getStr("GUROUTP_VPDI_CODE");
	}
}
