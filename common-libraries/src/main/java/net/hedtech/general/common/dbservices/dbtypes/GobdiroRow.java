package net.hedtech.general.common.dbservices.dbtypes;

import morphis.foundations.core.appdatalayer.data.TableRow;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.NDate;
import morphis.foundations.core.types.NNumber;
import morphis.foundations.core.types.NString;


@DbRecordType(id="GobdiroRow",     dataSourceName="GOBDIRO", rowType=true)
public class GobdiroRow
{
@DbRecordField(dataSourceName="GOBDIRO_DIRO_CODE")
public NString GobdiroDiroCode;
@DbRecordField(dataSourceName="GOBDIRO_DIRECTORY_TYPE")
public NString GobdiroDirectoryType;
@DbRecordField(dataSourceName="GOBDIRO_ITEM_TYPE")
public NString GobdiroItemType;
@DbRecordField(dataSourceName="GOBDIRO_DISP_PROFILE_IND")
public NString GobdiroDispProfileInd;
@DbRecordField(dataSourceName="GOBDIRO_UPD_PROFILE_IND")
public NString GobdiroUpdProfileInd;
@DbRecordField(dataSourceName="GOBDIRO_NON_PROFILE_DEF_IND")
public NString GobdiroNonProfileDefInd;
@DbRecordField(dataSourceName="GOBDIRO_SYSTEM_REQ_IND")
public NString GobdiroSystemReqInd;
@DbRecordField(dataSourceName="GOBDIRO_ACTIVITY_DATE")
public NDate GobdiroActivityDate;
@DbRecordField(dataSourceName="GOBDIRO_SEQ_NO")
public NNumber GobdiroSeqNo;
@DbRecordField(dataSourceName="GOBDIRO_SURROGATE_ID")
public NNumber GobdiroSurrogateId;
@DbRecordField(dataSourceName="GOBDIRO_VERSION")
public NNumber GobdiroVersion;
@DbRecordField(dataSourceName="GOBDIRO_USER_ID")
public NString GobdiroUserId;
@DbRecordField(dataSourceName="GOBDIRO_DATA_ORIGIN")
public NString GobdiroDataOrigin;
@DbRecordField(dataSourceName="GOBDIRO_VPDI_CODE")
public NString GobdiroVpdiCode;

private TableRow gobdirorow;

public GobdiroRow(){
	super();
}

public GobdiroRow(TableRow row) {

	this.gobdirorow = row;
	
	this.GobdiroDiroCode = gobdirorow.getStr("GOBDIRO_DIRO_CODE");
	this.GobdiroDirectoryType = gobdirorow.getStr("GOBDIRO_DIRECTORY_TYPE");
	this.GobdiroItemType = gobdirorow.getStr("GOBDIRO_ITEM_TYPE");
	this.GobdiroDispProfileInd = gobdirorow.getStr("GOBDIRO_DISP_PROFILE_IND");
	this.GobdiroUpdProfileInd = gobdirorow.getStr("GOBDIRO_UPD_PROFILE_IND");
	this.GobdiroNonProfileDefInd = gobdirorow.getStr("GOBDIRO_NON_PROFILE_DEF_IND");
	this.GobdiroSystemReqInd = gobdirorow.getStr("GOBDIRO_SYSTEM_REQ_IND");
	this.GobdiroActivityDate = gobdirorow.getDate("GOBDIRO_ACTIVITY_DATE");
	this.GobdiroSeqNo = gobdirorow.getNumber("GOBDIRO_SEQ_NO");
	this.GobdiroSurrogateId = gobdirorow.getNumber("GOBDIRO_SURROGATE_ID");
	this.GobdiroVersion = gobdirorow.getNumber("GOBDIRO_VERSION");
	this.GobdiroUserId = gobdirorow.getStr("GOBDIRO_USER_ID");
	this.GobdiroDataOrigin = gobdirorow.getStr("GOBDIRO_DATA_ORIGIN");
	this.GobdiroVpdiCode = gobdirorow.getStr("GOBDIRO_VPDI_CODE");
}

}
