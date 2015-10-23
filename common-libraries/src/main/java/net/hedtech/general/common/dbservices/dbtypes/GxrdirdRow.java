package net.hedtech.general.common.dbservices.dbtypes;

import morphis.foundations.core.appdatalayer.data.TableRow;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.NDate;
import morphis.foundations.core.types.NNumber;
import morphis.foundations.core.types.NString;

@DbRecordType(id="GxrdirdRow",dataSourceName="GXRDIRD", rowType=true)
public class GxrdirdRow
{
	@DbRecordField(dataSourceName="GXRDIRD_PIDM")
	public NNumber GxrdirdPidm;
	
	@DbRecordField(dataSourceName="GXRDIRD_STATUS")
	public NString GxrdirdStatus;
	
	@DbRecordField(dataSourceName="GXRDIRD_DOC_TYPE")
	public NString GxrdirdDocType;
	
	@DbRecordField(dataSourceName="GXRDIRD_PRIORITY")
	public NNumber GxrdirdPriority;
	
	@DbRecordField(dataSourceName="GXRDIRD_AP_IND")
	public NString GxrdirdApInd;
	
	@DbRecordField(dataSourceName="GXRDIRD_HR_IND")
	public NString GxrdirdHrInd;
	
	@DbRecordField(dataSourceName="GXRDIRD_ACTIVITY_DATE")
	public NDate GxrdirdActivityDate;
	
	@DbRecordField(dataSourceName="GXRDIRD_USER_ID")
	public NString GxrdirdUserId;
	
	@DbRecordField(dataSourceName="GXRDIRD_BANK_ACCT_NUM")
	public NString GxrdirdBankAcctNum;
	
	@DbRecordField(dataSourceName="GXRDIRD_BANK_ROUT_NUM")
	public NString GxrdirdBankRoutNum;
	
	@DbRecordField(dataSourceName="GXRDIRD_AMOUNT")
	public NNumber GxrdirdAmount;
	
	@DbRecordField(dataSourceName="GXRDIRD_PERCENT")
	public NNumber GxrdirdPercent;
	
	@DbRecordField(dataSourceName="GXRDIRD_ACCT_TYPE")
	public NString GxrdirdAcctType;
	
	@DbRecordField(dataSourceName="GXRDIRD_ATYP_CODE")
	public NString GxrdirdAtypCode;
	
	@DbRecordField(dataSourceName="GXRDIRD_ADDR_SEQNO")
	public NNumber GxrdirdAddrSeqno;
	
	@DbRecordField(dataSourceName="GXRDIRD_ACH_IAT_IND")
	public NString GxrdirdAchIatInd;
	
	@DbRecordField(dataSourceName="GXRDIRD_SCOD_CODE_ISO")
	public NString GxrdirdScodCodeIso;
	
	@DbRecordField(dataSourceName="GXRDIRD_ACHT_CODE")
	public NString GxrdirdAchtCode;
	
	@DbRecordField(dataSourceName="GXRDIRD_ATYP_CODE_IAT")
	public NString GxrdirdAtypCodeIat;
	
	@DbRecordField(dataSourceName="GXRDIRD_ADDR_SEQNO_IAT")
	public NNumber GxrdirdAddrSeqnoIat;
	
	@DbRecordField(dataSourceName="GXRDIRD_SURROGATE_ID")
	public NNumber GxrdirdSurrogateId;
	
	@DbRecordField(dataSourceName="GXRDIRD_VERSION")
	public NNumber GxrdirdVersion;
	
	@DbRecordField(dataSourceName="GXRDIRD_DATA_ORIGIN")
	public NString GxrdirdDataOrigin;
	
	@DbRecordField(dataSourceName="GXRDIRD_VPDI_CODE")
	public NString GxrdirdVpdiCode;
	
	public GxrdirdRow(){}
	
	public GxrdirdRow(TableRow row){
		this.GxrdirdPidm=row.getNumber("GXRDIRD_PIDM");
		this.GxrdirdStatus=row.getStr("GXRDIRD_STATUS");
		this.GxrdirdDocType=row.getStr("GXRDIRD_DOC_TYPE");
		this.GxrdirdPriority=row.getNumber("GXRDIRD_PRIORITY");
		this.GxrdirdApInd=row.getStr("GXRDIRD_AP_IND");
		this.GxrdirdHrInd=row.getStr("GXRDIRD_HR_IND");
		this.GxrdirdActivityDate=row.getDate("GXRDIRD_ACTIVITY_DATE");
		this.GxrdirdUserId=row.getStr("GXRDIRD_USER_ID");
		this.GxrdirdBankAcctNum=row.getStr("GXRDIRD_BANK_ACCT_NUM");
		this.GxrdirdBankRoutNum=row.getStr("GXRDIRD_BANK_ROUT_NUM");
		this.GxrdirdAmount=row.getNumber("GXRDIRD_AMOUNT");
		this.GxrdirdPercent=row.getNumber("GXRDIRD_PERCENT");
		this.GxrdirdAcctType=row.getStr("GXRDIRD_ACCT_TYPE");
		this.GxrdirdAtypCode=row.getStr("GXRDIRD_ATYP_CODE");
		this.GxrdirdAddrSeqno=row.getNumber("GXRDIRD_ADDR_SEQNO");
		this.GxrdirdAchIatInd=row.getStr("GXRDIRD_ACH_IAT_IND");
		this.GxrdirdScodCodeIso=row.getStr("GXRDIRD_SCOD_CODE_ISO");
		this.GxrdirdAchtCode=row.getStr("GXRDIRD_ACHT_CODE");
		this.GxrdirdAtypCodeIat=row.getStr("GXRDIRD_ATYP_CODE_IAT");
		this.GxrdirdAddrSeqnoIat=row.getNumber("GXRDIRD_ADDR_SEQNO_IAT");
		this.GxrdirdSurrogateId=row.getNumber("GXRDIRD_SURROGATE_ID");
		this.GxrdirdVersion=row.getNumber("GXRDIRD_VERSION");
		this.GxrdirdDataOrigin=row.getStr("GXRDIRD_DATA_ORIGIN");
		this.GxrdirdVpdiCode=row.getStr("GXRDIRD_VPDI_CODE");
	}
}

