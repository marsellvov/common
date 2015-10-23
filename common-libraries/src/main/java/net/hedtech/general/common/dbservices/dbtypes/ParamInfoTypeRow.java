package net.hedtech.general.common.dbservices.dbtypes;

import morphis.foundations.core.appdatalayer.data.TableRow;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbTableType;
import morphis.foundations.core.types.NString;

@DbTableType(id="ParamInfoTypeRow", dataSourceName="GKKPRUL.param_table_type", indexed=true)
@DbRecordType(id="ParamInfoTypeRow", dataSourceName="GKKPRUL.PARAM_INFO_TYPE")
public class ParamInfoTypeRow
{

	@DbRecordField(dataSourceName="PARAM_TYPE")
	public NString ParamType;
	@DbRecordField(dataSourceName="PARAM_SQPA_CODE")
	public NString ParamSqpaCode;
	@DbRecordField(dataSourceName="PARAM_SQPA_DESC")
	public NString ParamSqpaDesc;
	@DbRecordField(dataSourceName="PARAM_DEFAULT_VALUE")
	public NString ParamDefaultValue;
	@DbRecordField(dataSourceName="PARAM_USER_ID")
	public NString ParamUserId;
	@DbRecordField(dataSourceName="PARAM_ACTIVITY_DATE")
	public NString ParamActivityDate;
	@DbRecordField(dataSourceName="PARAM_START_DATE")
	public NString ParamStartDate;
	@DbRecordField(dataSourceName="PARAM_END_DATE")
	public NString ParamEndDate;
	@DbRecordField(dataSourceName="PARAM_SVBA_CODE")
	public NString ParamSvbaCode;
	@DbRecordField(dataSourceName="PARAM_SVBA_DESC")
	public NString ParamSvbaDesc;

private TableRow paraminfoType;
public ParamInfoTypeRow(){
	
}
public ParamInfoTypeRow(TableRow row){
	this.paraminfoType = row;
	this.ParamType=paraminfoType.getStr("PARAM_TYPE");
	this.ParamSqpaCode=paraminfoType.getStr("PARAM_SQPA_CODE");
	this.ParamSqpaDesc=paraminfoType.getStr("PARAM_SQPA_DESC");
	this.ParamDefaultValue=paraminfoType.getStr("PARAM_DEFAULT_VALUE");
	this.ParamUserId=paraminfoType.getStr("PARAM_USER_ID");
	this.ParamActivityDate=paraminfoType.getStr("PARAM_ACTIVITY_DATE");
	this.ParamStartDate=paraminfoType.getStr("PARAM_START_DATE");
	this.ParamEndDate=paraminfoType.getStr("PARAM_END_DATE");
	this.ParamSvbaCode=paraminfoType.getStr("PARAM_SVBA_CODE");
	this.ParamSvbaDesc=paraminfoType.getStr("PARAM_SVBA_DESC");
	
}

}