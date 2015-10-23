package net.hedtech.general.common.dbservices.dbtypes;

import morphis.foundations.core.appdatalayer.data.TableRow;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.NDate;
import morphis.foundations.core.types.NNumber;
import morphis.foundations.core.types.NString;


@DbRecordType(id = "PyratquRow", dataSourceName = "PYRATQU", rowType = true)
public class PyratquRow {
	@DbRecordField(dataSourceName = "PYRATQU_CODE")
	public NString PyratquCode;
	@DbRecordField(dataSourceName = "PYRATQU_COAS_CODE")
	public NString PyratquCoasCode;
	@DbRecordField(dataSourceName = "PYRATQU_EFFECTIVE_DATE")
	public NDate PyratquEffectiveDate;
	@DbRecordField(dataSourceName = "PYRATQU_SUSER_PIDM")
	public NNumber PyratquSuserPidm;
	@DbRecordField(dataSourceName = "PYRATQU_SUSER_WAIT_HRS")
	public NNumber PyratquSuserWaitHrs;
	@DbRecordField(dataSourceName = "PYRATQU_ACTIVITY_DATE")
	public NDate PyratquActivityDate;
	@DbRecordField(dataSourceName = "PYRATQU_USER_ID")
	public NString PyratquUserId;
	@DbRecordField(dataSourceName = "PYRATQU_DATA_ORIGIN")
	public NString PyratquDataOrigin;

	private TableRow pyratqurow;

	public PyratquRow(TableRow row) {

		this.pyratqurow = row;
		this.PyratquCode = pyratqurow.getStr("PYRATQU_CODE");
		this.PyratquCoasCode = pyratqurow.getStr("PYRATQU_COAS_CODE");
		this.PyratquEffectiveDate = pyratqurow
				.getDate("PYRATQU_EFFECTIVE_DATE");
		this.PyratquSuserPidm = pyratqurow.getNumber("PYRATQU_SUSER_PIDM");
		this.PyratquSuserWaitHrs = pyratqurow
				.getNumber("PYRATQU_SUSER_WAIT_HRS");

		this.PyratquActivityDate = pyratqurow.getDate("PYRATQU_ACTIVITY_DATE");
		this.PyratquUserId = pyratqurow.getStr("PYRATQU_USER_ID");
		this.PyratquDataOrigin = pyratqurow.getStr("PYRATQU_DATA_ORIGIN");
	}
}

