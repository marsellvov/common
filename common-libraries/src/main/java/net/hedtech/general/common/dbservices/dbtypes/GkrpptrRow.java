package net.hedtech.general.common.dbservices.dbtypes;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;

@DbRecordType(id="GkrpptrRow",     dataSourceName="GKRPPTR", rowType=true)
public class GkrpptrRow
{
@DbRecordField(dataSourceName="GKRPPTR_SEQNO")
public NNumber GkrpptrSeqno;
@DbRecordField(dataSourceName="GKRPPTR_PARENT")
public NString GkrpptrParent;
@DbRecordField(dataSourceName="GKRPPTR_CHILD")
public NString GkrpptrChild;
@DbRecordField(dataSourceName="GKRPPTR_ENABLED_POP")
public NString GkrpptrEnabledPop;
@DbRecordField(dataSourceName="GKRPPTR_ENABLED_DEL")
public NString GkrpptrEnabledDel;
@DbRecordField(dataSourceName="GKRPPTR_OWNER")
public NString GkrpptrOwner;
@DbRecordField(dataSourceName="GKRPPTR_STARTED")
public NDate GkrpptrStarted;
@DbRecordField(dataSourceName="GKRPPTR_FINISHED")
public NDate GkrpptrFinished;
@DbRecordField(dataSourceName="GKRPPTR_ACTIVITY_DATE")
public NDate GkrpptrActivityDate;
@DbRecordField(dataSourceName="GKRPPTR_USER")
public NString GkrpptrUser;
@DbRecordField(dataSourceName="GKRPPTR_SOURCE_IND")
public NString GkrpptrSourceInd;
@DbRecordField(dataSourceName="GKRPPTR_SURROGATE_ID")
public NNumber GkrpptrSurrogateId;
@DbRecordField(dataSourceName="GKRPPTR_VERSION")
public NNumber GkrpptrVersion;
@DbRecordField(dataSourceName="GKRPPTR_USER_ID")
public NString GkrpptrUserId;
@DbRecordField(dataSourceName="GKRPPTR_DATA_ORIGIN")
public NString GkrpptrDataOrigin;
@DbRecordField(dataSourceName="GKRPPTR_VPDI_CODE")
public NString GkrpptrVpdiCode;
private TableRow gkrpptrrow;
public GkrpptrRow(){
super();
}
public GkrpptrRow(TableRow row) {
this.gkrpptrrow = row;
this.GkrpptrSeqno = gkrpptrrow.getNumber("GKRPPTR_SEQNO");
this.GkrpptrParent = gkrpptrrow.getStr("GKRPPTR_PARENT");
this.GkrpptrChild = gkrpptrrow.getStr("GKRPPTR_CHILD");
this.GkrpptrEnabledPop = gkrpptrrow.getStr("GKRPPTR_ENABLED_POP");
this.GkrpptrEnabledDel = gkrpptrrow.getStr("GKRPPTR_ENABLED_DEL");
this.GkrpptrOwner = gkrpptrrow.getStr("GKRPPTR_OWNER");
this.GkrpptrStarted = gkrpptrrow.getDate("GKRPPTR_STARTED");
this.GkrpptrFinished = gkrpptrrow.getDate("GKRPPTR_FINISHED");
this.GkrpptrActivityDate = gkrpptrrow.getDate("GKRPPTR_ACTIVITY_DATE");
this.GkrpptrUser = gkrpptrrow.getStr("GKRPPTR_USER");
this.GkrpptrSourceInd = gkrpptrrow.getStr("GKRPPTR_SOURCE_IND");
this.GkrpptrSurrogateId = gkrpptrrow.getNumber("GKRPPTR_SURROGATE_ID");
this.GkrpptrVersion = gkrpptrrow.getNumber("GKRPPTR_VERSION");
this.GkrpptrUserId = gkrpptrrow.getStr("GKRPPTR_USER_ID");
this.GkrpptrDataOrigin = gkrpptrrow.getStr("GKRPPTR_DATA_ORIGIN");
this.GkrpptrVpdiCode = gkrpptrrow.getStr("GKRPPTR_VPDI_CODE");
}
}

