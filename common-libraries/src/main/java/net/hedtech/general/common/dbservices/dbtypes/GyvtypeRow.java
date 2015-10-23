package net.hedtech.general.common.dbservices.dbtypes;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;

	
@DbRecordType(id="GyvtypeRow",dataSourceName="GYVTYPE", rowType=true)
public class GyvtypeRow
{
@DbRecordField(dataSourceName="GYVTYPE_TYPE_CODE")
public NString GyvtypeTypeCode;
@DbRecordField(dataSourceName="GYVTYPE_TYPE_DESC")
public NString GyvtypeTypeDesc;
@DbRecordField(dataSourceName="GYVTYPE_RESTRICT")
public NString GyvtypeRestrict;
@DbRecordField(dataSourceName="GYVTYPE_ACTIVITY_DATE")
public NDate GyvtypeActivityDate;
@DbRecordField(dataSourceName="GYVTYPE_USER_ID")
public NString GyvtypeUserId;
@DbRecordField(dataSourceName="GYVTYPE_DATA_ORIGIN")
public NString GyvtypeDataOrigin;

public GyvtypeRow(){}

public GyvtypeRow(TableRow row){

this.GyvtypeTypeCode=row.getStr("GYVTYPE_TYPE_CODE");
this.GyvtypeTypeDesc=row.getStr("GYVTYPE_TYPE_DESC");
this.GyvtypeRestrict=row.getStr("GYVTYPE_RESTRICT");
this.GyvtypeActivityDate=row.getDate("GYVTYPE_ACTIVITY_DATE");
this.GyvtypeUserId=row.getStr("GYVTYPE_USER_ID");
this.GyvtypeDataOrigin=row.getStr("GYVTYPE_DATA_ORIGIN");
}
}

