package net.hedtech.general.common.dbservices.dbtypes;

import morphis.foundations.core.appdatalayer.data.TableRow;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.NDate;
import morphis.foundations.core.types.NNumber;
import morphis.foundations.core.types.NString;



	@DbRecordType(id="GobsridRow",dataSourceName="GOBSRID", rowType=true)
	public class GobsridRow
	{
	@DbRecordField(dataSourceName="GOBSRID_PIDM")
	public NNumber GobsridPidm;
	@DbRecordField(dataSourceName="GOBSRID_SOURCED_ID")
	public NString GobsridSourcedId;
	@DbRecordField(dataSourceName="GOBSRID_ACTIVITY_DATE")
	public NDate GobsridActivityDate;
	@DbRecordField(dataSourceName="GOBSRID_USER_ID")
	public NString GobsridUserId;
	@DbRecordField(dataSourceName="GOBSRID_SURROGATE_ID")
	public NNumber GobsridSurrogateId;
	@DbRecordField(dataSourceName="GOBSRID_VERSION")
	public NNumber GobsridVersion;
	@DbRecordField(dataSourceName="GOBSRID_DATA_ORIGIN")
	public NString GobsridDataOrigin;
	@DbRecordField(dataSourceName="GOBSRID_VPDI_CODE")
	public NString GobsridVpdiCode;

	private TableRow gobsridrow;


	public GobsridRow(TableRow row){

	this.gobsridrow = row;
	this.GobsridPidm=gobsridrow.getNumber("GOBSRID_PIDM");
	this.GobsridSourcedId=gobsridrow.getStr("GOBSRID_SOURCED_ID");
	this.GobsridActivityDate=gobsridrow.getDate("GOBSRID_ACTIVITY_DATE");
	this.GobsridUserId=gobsridrow.getStr("GOBSRID_USER_ID");
	this.GobsridSurrogateId=gobsridrow.getNumber("GOBSRID_SURROGATE_ID");
	this.GobsridVersion=gobsridrow.getNumber("GOBSRID_VERSION");
	this.GobsridDataOrigin=gobsridrow.getStr("GOBSRID_DATA_ORIGIN");
	this.GobsridVpdiCode=gobsridrow.getStr("GOBSRID_VPDI_CODE");
	}
	public GobsridRow(){
	}
	}


	

