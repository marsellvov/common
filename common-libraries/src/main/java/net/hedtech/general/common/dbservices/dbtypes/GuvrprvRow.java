package net.hedtech.general.common.dbservices.dbtypes;

import morphis.foundations.core.appdatalayer.data.TableRow;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.NString;

@DbRecordType(id = "GuvrprvRow", dataSourceName = "GUVRPRV", rowType = true)
public class GuvrprvRow {
	@DbRecordField(dataSourceName = "GUVRPRV_ROLE")
	public NString GuvrprvRole;
	@DbRecordField(dataSourceName = "GUVRPRV_OWNER")
	public NString GuvrprvOwner;
	@DbRecordField(dataSourceName = "GUVRPRV_OBJECT")
	public NString GuvrprvObject;
	@DbRecordField(dataSourceName = "GUVRPRV_PRIV_S")
	public NString GuvrprvPrivS;
	@DbRecordField(dataSourceName = "GUVRPRV_PRIV_I")
	public NString GuvrprvPrivI;
	@DbRecordField(dataSourceName = "GUVRPRV_PRIV_U")
	public NString GuvrprvPrivU;
	@DbRecordField(dataSourceName = "GUVRPRV_PRIV_D")
	public NString GuvrprvPrivD;
	@DbRecordField(dataSourceName = "GUVRPRV_PRIV_E")
	public NString GuvrprvPrivE;

	private TableRow guvrprvrow;
	
	public GuvrprvRow() {}

	public GuvrprvRow(TableRow row) {

		this.guvrprvrow = row;
		this.GuvrprvRole = guvrprvrow.getStr("GUVRPRV_ROLE");
		this.GuvrprvOwner = guvrprvrow.getStr("GUVRPRV_OWNER");
		this.GuvrprvObject = guvrprvrow.getStr("GUVRPRV_OBJECT");
		this.GuvrprvPrivS = guvrprvrow.getStr("GUVRPRV_PRIV_S");
		this.GuvrprvPrivI = guvrprvrow.getStr("GUVRPRV_PRIV_I");
		this.GuvrprvPrivU = guvrprvrow.getStr("GUVRPRV_PRIV_U");
		this.GuvrprvPrivD = guvrprvrow.getStr("GUVRPRV_PRIV_D");
		this.GuvrprvPrivE = guvrprvrow.getStr("GUVRPRV_PRIV_E");
	}
}
