package net.hedtech.general.common.dbservices.dbtypes;

import morphis.foundations.core.appdatalayer.data.TableRow;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.NDate;
import morphis.foundations.core.types.NString;


@DbRecordType(id="GyvcodeRow",     dataSourceName="GYVCODE", rowType=true)
public class GyvcodeRow
{
	@DbRecordField(dataSourceName="GYVCODE_TYPE_CODE")
	public NString GyvcodeTypeCode;
	@DbRecordField(dataSourceName="GYVCODE_CODE")
	public NString GyvcodeCode;
	@DbRecordField(dataSourceName="GYVCODE_DESC")
	public NString GyvcodeDesc;
	@DbRecordField(dataSourceName="GYVCODE_NOTE")
	public NString GyvcodeNote;
	@DbRecordField(dataSourceName="GYVCODE_IND")
	public NString GyvcodeInd;
	@DbRecordField(dataSourceName="GYVCODE_ACTIVITY_DATE")
	public NDate GyvcodeActivityDate;
	@DbRecordField(dataSourceName="GYVCODE_USER_ID")
	public NString GyvcodeUserId;
	@DbRecordField(dataSourceName="GYVCODE_DATA_ORIGIN")
	public NString GyvcodeDataOrigin;
	private TableRow gyvcoderow;
	public GyvcodeRow(){
		super();
	}
	public GyvcodeRow(TableRow row) {
		this.gyvcoderow = row;
		this.GyvcodeTypeCode = gyvcoderow.getStr("GYVCODE_TYPE_CODE");
		this.GyvcodeCode = gyvcoderow.getStr("GYVCODE_CODE");
		this.GyvcodeDesc = gyvcoderow.getStr("GYVCODE_DESC");
		this.GyvcodeNote = gyvcoderow.getStr("GYVCODE_NOTE");
		this.GyvcodeInd = gyvcoderow.getStr("GYVCODE_IND");
		this.GyvcodeActivityDate = gyvcoderow.getDate("GYVCODE_ACTIVITY_DATE");
		this.GyvcodeUserId = gyvcoderow.getStr("GYVCODE_USER_ID");
		this.GyvcodeDataOrigin = gyvcoderow.getStr("GYVCODE_DATA_ORIGIN");
	}
}


