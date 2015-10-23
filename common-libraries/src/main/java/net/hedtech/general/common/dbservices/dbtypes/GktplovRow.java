package net.hedtech.general.common.dbservices.dbtypes;

import morphis.foundations.core.appdatalayer.data.TableRow;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.NDate;
import morphis.foundations.core.types.NNumber;
import morphis.foundations.core.types.NString;

@DbRecordType(id="GktplovRow",dataSourceName="GKTPLOV", rowType=true)
public class GktplovRow
{
@DbRecordField(dataSourceName="GKTPLOV_SQPR_CDE")
public NString GktplovSqprCde;
@DbRecordField(dataSourceName="GKTPLOV_SQRU_CDE")
public NString GktplovSqruCde;
@DbRecordField(dataSourceName="GKTPLOV_SVBA_CDE")
public NString GktplovSvbaCde;
@DbRecordField(dataSourceName="GKTPLOV_SELECT_POSITION")
public NNumber GktplovSelectPosition;
@DbRecordField(dataSourceName="GKTPLOV_COLUMN_SEQNO")
public NNumber GktplovColumnSeqno;
@DbRecordField(dataSourceName="GKTPLOV_COLUMN_NAME")
public NString GktplovColumnName;
@DbRecordField(dataSourceName="GKTPLOV_ROW_SEQNO")
public NNumber GktplovRowSeqno;
@DbRecordField(dataSourceName="GKTPLOV_VALUE")
public NString GktplovValue;
@DbRecordField(dataSourceName="GKTPLOV_RETURN_IND")
public NString GktplovReturnInd;
@DbRecordField(dataSourceName="GKTPLOV_SURROGATE_ID")
public NNumber GktplovSurrogateId;
@DbRecordField(dataSourceName="GKTPLOV_VERSION")
public NNumber GktplovVersion;
@DbRecordField(dataSourceName="GKTPLOV_USER_ID")
public NString GktplovUserId;
@DbRecordField(dataSourceName="GKTPLOV_DATA_ORIGIN")
public NString GktplovDataOrigin;
@DbRecordField(dataSourceName="GKTPLOV_ACTIVITY_DATE")
public NDate GktplovActivityDate;
@DbRecordField(dataSourceName="GKTPLOV_VPDI_CODE")
public NString GktplovVpdiCode;

public GktplovRow(){}

public GktplovRow(TableRow row){

this.GktplovSqprCde=row.getStr("GKTPLOV_SQPR_CDE");
this.GktplovSqruCde=row.getStr("GKTPLOV_SQRU_CDE");
this.GktplovSvbaCde=row.getStr("GKTPLOV_SVBA_CDE");
this.GktplovSelectPosition=row.getNumber("GKTPLOV_SELECT_POSITION");
this.GktplovColumnSeqno=row.getNumber("GKTPLOV_COLUMN_SEQNO");
this.GktplovColumnName=row.getStr("GKTPLOV_COLUMN_NAME");
this.GktplovRowSeqno=row.getNumber("GKTPLOV_ROW_SEQNO");
this.GktplovValue=row.getStr("GKTPLOV_VALUE");
this.GktplovReturnInd=row.getStr("GKTPLOV_RETURN_IND");
this.GktplovSurrogateId=row.getNumber("GKTPLOV_SURROGATE_ID");
this.GktplovVersion=row.getNumber("GKTPLOV_VERSION");
this.GktplovUserId=row.getStr("GKTPLOV_USER_ID");
this.GktplovDataOrigin=row.getStr("GKTPLOV_DATA_ORIGIN");
this.GktplovActivityDate=row.getDate("GKTPLOV_ACTIVITY_DATE");
this.GktplovVpdiCode=row.getStr("GKTPLOV_VPDI_CODE");
}
}

