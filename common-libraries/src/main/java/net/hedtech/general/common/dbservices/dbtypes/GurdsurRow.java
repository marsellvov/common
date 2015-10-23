package net.hedtech.general.common.dbservices.dbtypes;

import morphis.foundations.core.appdatalayer.data.TableRow;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.NDate;
import morphis.foundations.core.types.NNumber;
import morphis.foundations.core.types.NString;

@DbRecordType(id = "GurdsurRow", dataSourceName = "GURDSUR", rowType = true)
public class GurdsurRow {
	@DbRecordField(dataSourceName = "GURDSUR_ACTION")
	public NString GurdsurAction;
	@DbRecordField(dataSourceName = "GURDSUR_PRIV_ROLE_OBJ")
	public NString GurdsurPrivRoleObj;
	@DbRecordField(dataSourceName = "GURDSUR_USER_ROLE_OBJ")
	public NString GurdsurUserRoleObj;
	@DbRecordField(dataSourceName = "GURDSUR_ALL_ACCT_IND")
	public NString GurdsurAllAcctInd;
	@DbRecordField(dataSourceName = "GURDSUR_NEW_ACCT_IND")
	public NString GurdsurNewAcctInd;
	@DbRecordField(dataSourceName = "GURDSUR_ALTER_USER_IND")
	public NString GurdsurAlterUserInd;
	@DbRecordField(dataSourceName = "GURDSUR_CREATE_USER_IND")
	public NString GurdsurCreateUserInd;
	@DbRecordField(dataSourceName = "GURDSUR_DROP_USER_IND")
	public NString GurdsurDropUserInd;
	@DbRecordField(dataSourceName = "GURDSUR_ALTER_ROLE_IND")
	public NString GurdsurAlterRoleInd;
	@DbRecordField(dataSourceName = "GURDSUR_CREATE_ROLE_IND")
	public NString GurdsurCreateRoleInd;
	@DbRecordField(dataSourceName = "GURDSUR_DROP_ROLE_IND")
	public NString GurdsurDropRoleInd;
	@DbRecordField(dataSourceName = "GURDSUR_CLASS_MAINT_IND")
	public NString GurdsurClassMaintInd;
	@DbRecordField(dataSourceName = "GURDSUR_OBJ_MAINT_IND")
	public NString GurdsurObjMaintInd;
	@DbRecordField(dataSourceName = "GURDSUR_PROF_MAINT_IND")
	public NString GurdsurProfMaintInd;
	@DbRecordField(dataSourceName = "GURDSUR_VIEW_AUDIT_IND")
	public NString GurdsurViewAuditInd;
	@DbRecordField(dataSourceName = "GURDSUR_VIOL_MAINT_IND")
	public NString GurdsurViolMaintInd;
	@DbRecordField(dataSourceName = "GURDSUR_SYS_REQ_IND")
	public NString GurdsurSysReqInd;
	@DbRecordField(dataSourceName = "GURDSUR_USER_ID")
	public NString GurdsurUserId;
	@DbRecordField(dataSourceName = "GURDSUR_ACTIVITY_DATE")
	public NDate GurdsurActivityDate;
	@DbRecordField(dataSourceName = "GURDSUR_SEQ")
	public NNumber GurdsurSeq;
	@DbRecordField(dataSourceName = "GURDSUR_OBJ_ROLE_USER_OPT")
	public NString GurdsurObjRoleUserOpt;
	@DbRecordField(dataSourceName = "GURDSUR_OPTION")
	public NString GurdsurOption;
	@DbRecordField(dataSourceName = "GURDSUR_COMMENTS")
	public NString GurdsurComments;
	@DbRecordField(dataSourceName = "GURDSUR_DATA_ORIGIN")
	public NString GurdsurDataOrigin;
	@DbRecordField(dataSourceName = "GURDSUR_SURROGATE_ID")
	public NNumber GurdsurSurrogateId;
	@DbRecordField(dataSourceName = "GURDSUR_VERSION")
	public NNumber GurdsurVersion;
	@DbRecordField(dataSourceName = "GURDSUR_VPDI_CODE")
	public NString GurdsurVpdiCode;

	private TableRow gurdsurrow;
	
	public GurdsurRow() {}

	public GurdsurRow(TableRow row) {

		this.gurdsurrow = row;
		this.GurdsurAction = gurdsurrow.getStr("GURDSUR_ACTION");
		this.GurdsurPrivRoleObj = gurdsurrow.getStr("GURDSUR_PRIV_ROLE_OBJ");
		this.GurdsurUserRoleObj = gurdsurrow.getStr("GURDSUR_USER_ROLE_OBJ");
		this.GurdsurAllAcctInd = gurdsurrow.getStr("GURDSUR_ALL_ACCT_IND");
		this.GurdsurNewAcctInd = gurdsurrow.getStr("GURDSUR_NEW_ACCT_IND");
		this.GurdsurAlterUserInd = gurdsurrow.getStr("GURDSUR_ALTER_USER_IND");
		this.GurdsurCreateUserInd = gurdsurrow
				.getStr("GURDSUR_CREATE_USER_IND");
		this.GurdsurDropUserInd = gurdsurrow.getStr("GURDSUR_DROP_USER_IND");
		this.GurdsurAlterRoleInd = gurdsurrow.getStr("GURDSUR_ALTER_ROLE_IND");
		this.GurdsurCreateRoleInd = gurdsurrow
				.getStr("GURDSUR_CREATE_ROLE_IND");
		this.GurdsurDropRoleInd = gurdsurrow.getStr("GURDSUR_DROP_ROLE_IND");
		this.GurdsurClassMaintInd = gurdsurrow
				.getStr("GURDSUR_CLASS_MAINT_IND");
		this.GurdsurObjMaintInd = gurdsurrow.getStr("GURDSUR_OBJ_MAINT_IND");
		this.GurdsurProfMaintInd = gurdsurrow.getStr("GURDSUR_PROF_MAINT_IND");
		this.GurdsurViewAuditInd = gurdsurrow.getStr("GURDSUR_VIEW_AUDIT_IND");
		this.GurdsurViolMaintInd = gurdsurrow.getStr("GURDSUR_VIOL_MAINT_IND");
		this.GurdsurSysReqInd = gurdsurrow.getStr("GURDSUR_SYS_REQ_IND");
		this.GurdsurUserId = gurdsurrow.getStr("GURDSUR_USER_ID");
		this.GurdsurActivityDate = gurdsurrow.getDate("GURDSUR_ACTIVITY_DATE");
		this.GurdsurSeq = gurdsurrow.getNumber("GURDSUR_SEQ");
		this.GurdsurObjRoleUserOpt = gurdsurrow
				.getStr("GURDSUR_OBJ_ROLE_USER_OPT");
		this.GurdsurOption = gurdsurrow.getStr("GURDSUR_OPTION");
		this.GurdsurComments = gurdsurrow.getStr("GURDSUR_COMMENTS");
		this.GurdsurDataOrigin = gurdsurrow.getStr("GURDSUR_DATA_ORIGIN");
		this.GurdsurSurrogateId = gurdsurrow.getNumber("GURDSUR_SURROGATE_ID");
		this.GurdsurVersion = gurdsurrow.getNumber("GURDSUR_VERSION");
		this.GurdsurVpdiCode = gurdsurrow.getStr("GURDSUR_VPDI_CODE");
	}
}
