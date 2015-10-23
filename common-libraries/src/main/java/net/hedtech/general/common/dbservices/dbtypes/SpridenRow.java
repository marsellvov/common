package net.hedtech.general.common.dbservices.dbtypes;

import morphis.foundations.core.appdatalayer.data.TableRow;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.NDate;
import morphis.foundations.core.types.NNumber;
import morphis.foundations.core.types.NString;

@DbRecordType(id="SpridenRow", dataSourceName="SPRIDEN", rowType=true)
public class SpridenRow {

	@DbRecordField(dataSourceName="SPRIDEN_PIDM")
	public NNumber SpridenPidm;
	@DbRecordField(dataSourceName="SPRIDEN_ID")
	public NString SpridenId;
	@DbRecordField(dataSourceName="SPRIDEN_LAST_NAME")
	public NString SpridenLastName;
	@DbRecordField(dataSourceName="SPRIDEN_FIRST_NAME")
	public NString SpridenFirstName;
	@DbRecordField(dataSourceName="SPRIDEN_MI")
	public NString Spriden_Mi;
	@DbRecordField(dataSourceName="SPRIDEN_CHANGE_IND")
	public NString SpridenChangeInd;
	@DbRecordField(dataSourceName="SPRIDEN_ENTITY_IND")
	public NString SpridenEntityInd;
	@DbRecordField(dataSourceName="SPRIDEN_ACTIVITY_DATE")
	public NDate SpridenActivityDate;
	@DbRecordField(dataSourceName="SPRIDEN_USER")
	public NString SpridenUser;
	@DbRecordField(dataSourceName="SPRIDEN_ORIGIN")
	public NString SpridenOrigin;
	@DbRecordField(dataSourceName="SPRIDEN_SEARCH_LAST_NAME")
	public NString SpridenSearchLastName;
	@DbRecordField(dataSourceName="SPRIDEN_SEARCH_FIRST_NAME")
	public NString SpridenSearchFirstName;
	@DbRecordField(dataSourceName="SPRIDEN_SEARCH_MI")
	public NString SpridenSearchMi;
	@DbRecordField(dataSourceName="SPRIDEN_SOUNDEX_LAST_NAME")
	public NString SpridenSoundexLastName;
	@DbRecordField(dataSourceName="SPRIDEN_SOUNDEX_FIRST_NAME")
	public NString SpridenSoundexFirstName;
	@DbRecordField(dataSourceName="SPRIDEN_NTYP_CODE")
	public NString SpridenNtypCode;
	@DbRecordField(dataSourceName="SPRIDEN_CREATE_USER")
	public NString SpridenCreateUser;
	@DbRecordField(dataSourceName="SPRIDEN_CREATE_DATE")
	public NString SpridenCreateDate;
	@DbRecordField(dataSourceName="SPRIDEN_DATA_ORIGIN")
	public NString SpridenDataOrigin;
	@DbRecordField(dataSourceName="SPRIDEN_CREATE_FDMN_CODE")
	public NString SpridenCreateFdmnCode;
	@DbRecordField(dataSourceName="SPRIDEN_SURNAME_PREFIX")
	public NString SpridenSurnamePrefix;
	@DbRecordField(dataSourceName="SPRIDEN_SURROGATE_ID")
	public NNumber SpridenSurrogateId;
	@DbRecordField(dataSourceName="SPRIDEN_VERSION")
	public NNumber SpridenVersion;
	@DbRecordField(dataSourceName="SPRIDEN_USER_ID")
	public NString SpridenUserId;
	@DbRecordField(dataSourceName="SPRIDEN_VPDI_CODE")
	public NString SpridenVpdiCode;
	
	private TableRow spridenrow;
	
	public SpridenRow() {}

	public SpridenRow(TableRow row) {
		
		this.spridenrow = row;
		this.SpridenPidm = spridenrow.getNumber("SPRIDEN_PIDM");
		this.SpridenId = spridenrow.getStr("SPRIDEN_ID");
		this.SpridenLastName = spridenrow.getStr("SPRIDEN_LAST_NAME");
		this.SpridenFirstName = spridenrow.getStr("SPRIDEN_FIRST_NAME");
		this.Spriden_Mi = spridenrow.getStr("SPRIDEN_MI");
		this.SpridenChangeInd = spridenrow.getStr("SPRIDEN_CHANGE_IND");
		this.SpridenEntityInd = spridenrow.getStr("SPRIDEN_ENTITY_IND");
		this.SpridenActivityDate = spridenrow.getDate("SPRIDEN_ACTIVITY_DATE");
		this.SpridenUser = spridenrow.getStr("SPRIDEN_USER");
		this.SpridenOrigin = spridenrow.getStr("SPRIDEN_ORIGIN");
		this.SpridenSearchLastName = spridenrow.getStr("SPRIDEN_SEARCH_LAST_NAME");
		this.SpridenSearchFirstName = spridenrow.getStr("SPRIDEN_SEARCH_FIRST_NAME");
		this.SpridenSearchMi = spridenrow.getStr("SPRIDEN_SEARCH_MI");
		this.SpridenSoundexLastName = spridenrow.getStr("SPRIDEN_SOUNDEX_LAST_NAME");
		this.SpridenSoundexFirstName = spridenrow.getStr("SPRIDEN_SOUNDEX_FIRST_NAME");
		this.SpridenNtypCode = spridenrow.getStr("SPRIDEN_NTYP_CODE");
		this.SpridenCreateUser = spridenrow.getStr("SPRIDEN_CREATE_USER");
		this.SpridenCreateDate = spridenrow.getStr("SPRIDEN_CREATE_DATE");
		this.SpridenDataOrigin = spridenrow.getStr("SPRIDEN_DATA_ORIGIN");
		this.SpridenCreateFdmnCode = spridenrow.getStr("SPRIDEN_CREATE_FDMN_CODE");
		this.SpridenSurnamePrefix = spridenrow.getStr("SPRIDEN_SURNAME_PREFIX");
		this.SpridenSurrogateId = spridenrow.getNumber("SPRIDEN_SURROGATE_ID");
		this.SpridenVersion = spridenrow.getNumber("SPRIDEN_VERSION");
		this.SpridenUserId = spridenrow.getStr("SPRIDEN_USER_ID");
		this.SpridenVpdiCode = spridenrow.getStr("SPRIDEN_VPDI_CODE");
		
	}

	public NNumber getSpridenPidm() {
		return SpridenPidm;
	}

	public NString getSpridenId() {
		return SpridenId;
	}

	public NString getSpridenLastName() {
		return SpridenLastName;
	}

	public NString getSpridenFirstName() {
		return SpridenFirstName;
	}

	public NString getSpriden_Mi() {
		return Spriden_Mi;
	}

	public NString getSpridenChangeInd() {
		return SpridenChangeInd;
	}

	public NString getSpridenEntityInd() {
		return SpridenEntityInd;
	}

	public NDate getSpridenActivityDate() {
		return SpridenActivityDate;
	}

	public NString getSpridenUser() {
		return SpridenUser;
	}

	public NString getSpridenOrigin() {
		return SpridenOrigin;
	}

	public NString getSpridenSearchLastName() {
		return SpridenSearchLastName;
	}

	public NString getSpridenSearchFirstName() {
		return SpridenSearchFirstName;
	}

	public NString getSpridenSearchMi() {
		return SpridenSearchMi;
	}

	public NString getSpridenSoundexLastName() {
		return SpridenSoundexLastName;
	}

	public NString getSpridenSoundexFirstName() {
		return SpridenSoundexFirstName;
	}

	public NString getSpridenNtypCode() {
		return SpridenNtypCode;
	}

	public NString getSpridenCreateUser() {
		return SpridenCreateUser;
	}

	public NString getSpridenCreateDate() {
		return SpridenCreateDate;
	}

	public NString getSpridenDataOrigin() {
		return SpridenDataOrigin;
	}

	public NString getSpridenCreateFdmnCode() {
		return SpridenCreateFdmnCode;
	}

	public NString getSpridenSurnamePrefix() {
		return SpridenSurnamePrefix;
	}

	public NNumber getSpridenSurrogateId() {
		return SpridenSurrogateId;
	}

	public NNumber getSpridenVersion() {
		return SpridenVersion;
	}

	public NString getSpridenUserId() {
		return SpridenUserId;
	}

	public NString getSpridenVpdiCode() {
		return SpridenVpdiCode;
	}

}
