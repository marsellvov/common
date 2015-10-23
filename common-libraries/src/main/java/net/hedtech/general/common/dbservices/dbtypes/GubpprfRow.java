package net.hedtech.general.common.dbservices.dbtypes;

import morphis.foundations.core.appdatalayer.data.TableRow;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.NDate;
import morphis.foundations.core.types.NNumber;
import morphis.foundations.core.types.NString;

@DbRecordType(id="GubpprfRow",dataSourceName="GUBPPRF", rowType=true)
public class GubpprfRow
{
@DbRecordField(dataSourceName="GUBPPRF_FORMAT")
public NString GubpprfFormat;
@DbRecordField(dataSourceName="GUBPPRF_VALUE")
public NString GubpprfValue;
@DbRecordField(dataSourceName="GUBPPRF_SELF_NOTIFY_TYPE_IND")
public NString GubpprfSelfNotifyTypeInd;
@DbRecordField(dataSourceName="GUBPPRF_ADMIN_NOTIFY_TYPE_IND")
public NString GubpprfAdminNotifyTypeInd;
@DbRecordField(dataSourceName="GUBPPRF_PRE_EXPIRE_IND")
public NString GubpprfPreExpireInd;
@DbRecordField(dataSourceName="GUBPPRF_USER_ID")
public NString GubpprfUserId;
@DbRecordField(dataSourceName="GUBPPRF_ACTIVITY_DATE")
public NDate GubpprfActivityDate;
@DbRecordField(dataSourceName="GUBPPRF_APPLICATION")
public NString GubpprfApplication;
@DbRecordField(dataSourceName="GUBPPRF_LETR_CODE_LETTER")
public NString GubpprfLetrCodeLetter;
@DbRecordField(dataSourceName="GUBPPRF_LETR_CODE_EMAIL")
public NString GubpprfLetrCodeEmail;
@DbRecordField(dataSourceName="GUBPPRF_LENGTH_LAST_NAME")
public NNumber GubpprfLengthLastName;
@DbRecordField(dataSourceName="GUBPPRF_MIN_LENGTH")
public NNumber GubpprfMinLength;
@DbRecordField(dataSourceName="GUBPPRF_MAX_LENGTH")
public NNumber GubpprfMaxLength;
@DbRecordField(dataSourceName="GUBPPRF_NO_OF_QSTNS")
public NNumber GubpprfNoOfQstns;
@DbRecordField(dataSourceName="GUBPPRF_NUM_IND")
public NString GubpprfNumInd;
@DbRecordField(dataSourceName="GUBPPRF_CHAR_IND")
public NString GubpprfCharInd;
@DbRecordField(dataSourceName="GUBPPRF_REUSE_DAYS")
public NNumber GubpprfReuseDays;
@DbRecordField(dataSourceName="GUBPPRF_QSTN_MIN_LENGTH")
public NNumber GubpprfQstnMinLength;
@DbRecordField(dataSourceName="GUBPPRF_ANSR_MIN_LENGTH")
public NNumber GubpprfAnsrMinLength;
@DbRecordField(dataSourceName="GUBPPRF_EDITQSTN_IND")
public NString GubpprfEditqstnInd;
@DbRecordField(dataSourceName="GUBPPRF_SELF_LETR_CODE_LETTER")
public NString GubpprfSelfLetrCodeLetter;
@DbRecordField(dataSourceName="GUBPPRF_SELF_LETR_CODE_EMAIL")
public NString GubpprfSelfLetrCodeEmail;
@DbRecordField(dataSourceName="GUBPPRF_DISABLE_FORGET_PIN_IND")
public NString GubpprfDisableForgetPinInd;
@DbRecordField(dataSourceName="GUBPPRF_SURROGATE_ID")
public NNumber GubpprfSurrogateId;
@DbRecordField(dataSourceName="GUBPPRF_VERSION")
public NNumber GubpprfVersion;
@DbRecordField(dataSourceName="GUBPPRF_DATA_ORIGIN")
public NString GubpprfDataOrigin;
@DbRecordField(dataSourceName="GUBPPRF_VPDI_CODE")
public NString GubpprfVpdiCode;

private TableRow gubpprfrow;


public GubpprfRow(TableRow row){

this.gubpprfrow = row;
this.GubpprfFormat=gubpprfrow.getStr("GUBPPRF_FORMAT");
this.GubpprfValue=gubpprfrow.getStr("GUBPPRF_VALUE");
this.GubpprfSelfNotifyTypeInd=gubpprfrow.getStr("GUBPPRF_SELF_NOTIFY_TYPE_IND");
this.GubpprfAdminNotifyTypeInd=gubpprfrow.getStr("GUBPPRF_ADMIN_NOTIFY_TYPE_IND");
this.GubpprfPreExpireInd=gubpprfrow.getStr("GUBPPRF_PRE_EXPIRE_IND");
this.GubpprfUserId=gubpprfrow.getStr("GUBPPRF_USER_ID");
this.GubpprfActivityDate=gubpprfrow.getDate("GUBPPRF_ACTIVITY_DATE");
this.GubpprfApplication=gubpprfrow.getStr("GUBPPRF_APPLICATION");
this.GubpprfLetrCodeLetter=gubpprfrow.getStr("GUBPPRF_LETR_CODE_LETTER");
this.GubpprfLetrCodeEmail=gubpprfrow.getStr("GUBPPRF_LETR_CODE_EMAIL");
this.GubpprfLengthLastName=gubpprfrow.getNumber("GUBPPRF_LENGTH_LAST_NAME");
this.GubpprfMinLength=gubpprfrow.getNumber("GUBPPRF_MIN_LENGTH");
this.GubpprfMaxLength=gubpprfrow.getNumber("GUBPPRF_MAX_LENGTH");
this.GubpprfNoOfQstns=gubpprfrow.getNumber("GUBPPRF_NO_OF_QSTNS");
this.GubpprfNumInd=gubpprfrow.getStr("GUBPPRF_NUM_IND");
this.GubpprfCharInd=gubpprfrow.getStr("GUBPPRF_CHAR_IND");
this.GubpprfReuseDays=gubpprfrow.getNumber("GUBPPRF_REUSE_DAYS");
this.GubpprfQstnMinLength=gubpprfrow.getNumber("GUBPPRF_QSTN_MIN_LENGTH");
this.GubpprfAnsrMinLength=gubpprfrow.getNumber("GUBPPRF_ANSR_MIN_LENGTH");
this.GubpprfEditqstnInd=gubpprfrow.getStr("GUBPPRF_EDITQSTN_IND");
this.GubpprfSelfLetrCodeLetter=gubpprfrow.getStr("GUBPPRF_SELF_LETR_CODE_LETTER");
this.GubpprfSelfLetrCodeEmail=gubpprfrow.getStr("GUBPPRF_SELF_LETR_CODE_EMAIL");
this.GubpprfDisableForgetPinInd=gubpprfrow.getStr("GUBPPRF_DISABLE_FORGET_PIN_IND");
this.GubpprfSurrogateId=gubpprfrow.getNumber("GUBPPRF_SURROGATE_ID");
this.GubpprfVersion=gubpprfrow.getNumber("GUBPPRF_VERSION");
this.GubpprfDataOrigin=gubpprfrow.getStr("GUBPPRF_DATA_ORIGIN");
this.GubpprfVpdiCode=gubpprfrow.getStr("GUBPPRF_VPDI_CODE");
}
public GubpprfRow()
{
}
}



