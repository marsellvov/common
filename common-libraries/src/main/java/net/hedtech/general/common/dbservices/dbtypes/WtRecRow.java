package net.hedtech.general.common.dbservices.dbtypes;

import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbTableType;
import morphis.foundations.core.types.NNumber;
import morphis.foundations.core.types.NString;


@DbRecordType(id = "WtRecRow", dataSourceName = "WT_REC")
public class WtRecRow {

	// test
	public WtRecRow() {
		super();
	}

	@DbRecordField(dataSourceName = "MENU_NAME")
	public NString MenuName;
	@DbRecordField(dataSourceName = "MENU_DESC")
	public NString MenuDesc;
	@DbRecordField(dataSourceName = "MENU_TEXT")
	public NString MenuText;
	@DbRecordField(dataSourceName = "MENU_URL")
	public NString MenuUrl;
	@DbRecordField(dataSourceName = "MENU_SEQ")
	public NNumber MenuSeq;
}
