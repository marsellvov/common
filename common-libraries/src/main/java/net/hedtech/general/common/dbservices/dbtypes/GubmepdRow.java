package net.hedtech.general.common.dbservices.dbtypes;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;

	
@DbRecordType(id="GubmepdRow",dataSourceName="GUBMEPD", rowType=true)
public class GubmepdRow
{
@DbRecordField(dataSourceName="GUBMEPD_BY_OWNER_OWNER")
public NString GubmepdByOwnerOwner;
@DbRecordField(dataSourceName="GUBMEPD_BY_OWNER_PACKAGE")
public NString GubmepdByOwnerPackage;
@DbRecordField(dataSourceName="GUBMEPD_BY_OWNER_FCN")
public NString GubmepdByOwnerFcn;
@DbRecordField(dataSourceName="GUBMEPD_BY_ALL_OWNER")
public NString GubmepdByAllOwner;
@DbRecordField(dataSourceName="GUBMEPD_BY_ALL_PACKAGE")
public NString GubmepdByAllPackage;
@DbRecordField(dataSourceName="GUBMEPD_BY_ALL_FCN")
public NString GubmepdByAllFcn;
@DbRecordField(dataSourceName="GUBMEPD_BY_USER_OWNER")
public NString GubmepdByUserOwner;
@DbRecordField(dataSourceName="GUBMEPD_BY_USER_PACKAGE")
public NString GubmepdByUserPackage;
@DbRecordField(dataSourceName="GUBMEPD_BY_USER_FCN")
public NString GubmepdByUserFcn;
@DbRecordField(dataSourceName="GUBMEPD_DATA_ORIGIN")
public NString GubmepdDataOrigin;
@DbRecordField(dataSourceName="GUBMEPD_USER_ID")
public NString GubmepdUserId;
@DbRecordField(dataSourceName="GUBMEPD_ACTIVITY_DATE")
public NDate GubmepdActivityDate;
@DbRecordField(dataSourceName="GUBMEPD_SURROGATE_ID")
public NNumber GubmepdSurrogateId;
@DbRecordField(dataSourceName="GUBMEPD_VERSION")
public NNumber GubmepdVersion;
@DbRecordField(dataSourceName="GUBMEPD_VPDI_CODE")
public NString GubmepdVpdiCode;

private TableRow gubmepdrow;

public GubmepdRow() {}

public GubmepdRow(TableRow row){

this.gubmepdrow = row;
this.GubmepdByOwnerOwner=gubmepdrow.getStr("GUBMEPD_BY_OWNER_OWNER");
this.GubmepdByOwnerPackage=gubmepdrow.getStr("GUBMEPD_BY_OWNER_PACKAGE");
this.GubmepdByOwnerFcn=gubmepdrow.getStr("GUBMEPD_BY_OWNER_FCN");
this.GubmepdByAllOwner=gubmepdrow.getStr("GUBMEPD_BY_ALL_OWNER");
this.GubmepdByAllPackage=gubmepdrow.getStr("GUBMEPD_BY_ALL_PACKAGE");
this.GubmepdByAllFcn=gubmepdrow.getStr("GUBMEPD_BY_ALL_FCN");
this.GubmepdByUserOwner=gubmepdrow.getStr("GUBMEPD_BY_USER_OWNER");
this.GubmepdByUserPackage=gubmepdrow.getStr("GUBMEPD_BY_USER_PACKAGE");
this.GubmepdByUserFcn=gubmepdrow.getStr("GUBMEPD_BY_USER_FCN");
this.GubmepdDataOrigin=gubmepdrow.getStr("GUBMEPD_DATA_ORIGIN");
this.GubmepdUserId=gubmepdrow.getStr("GUBMEPD_USER_ID");
this.GubmepdActivityDate=gubmepdrow.getDate("GUBMEPD_ACTIVITY_DATE");
this.GubmepdSurrogateId=gubmepdrow.getNumber("GUBMEPD_SURROGATE_ID");
this.GubmepdVersion=gubmepdrow.getNumber("GUBMEPD_VERSION");
this.GubmepdVpdiCode=gubmepdrow.getStr("GUBMEPD_VPDI_CODE");
}
}
