package net.hedtech.general.common.dbservices.dbtypes;

import morphis.foundations.core.appdatalayer.data.types.configuration.DbTableType;
import morphis.foundations.core.types.Table;

@DbTableType(id = "WtRecRow.wtTable", dataSourceName = "gokprxy.wt_tab", indexed = true)
public class wtTable extends Table<WtRecRow> {

	// test
	public wtTable() {
		super();
	}

	@Override
	protected WtRecRow newValue() {
		return new WtRecRow();
	}
}
