package net.hedtech.general.common.dbservices.dbtypes;

import morphis.foundations.core.appdatalayer.data.TableRow;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.NDate;
import morphis.foundations.core.types.NNumber;
import morphis.foundations.core.types.NString;

@DbRecordType(id="GordmskRow", dataSourceName="GORDMSK", rowType=true)
public class GordmskRow
{
	@DbRecordField(dataSourceName="GORDMSK_ACTIVITY_DATE")
	public NDate GordmskActivityDate;
	@DbRecordField(dataSourceName="GORDMSK_ALL_USER_IND")
	public NString GordmskAllUserInd;
	@DbRecordField(dataSourceName="GORDMSK_BLOCK_COMP_NAME")
	public NString GordmskBlockCompName;
	@DbRecordField(dataSourceName="GORDMSK_BLOCK_NAME")
	public NString GordmskBlockName;
	@DbRecordField(dataSourceName="GORDMSK_COLUMN_COMP_NAME")
	public NString GordmskColumnCompName;
	@DbRecordField(dataSourceName="GORDMSK_COLUMN_NAME")
	public NString GordmskColumnName;
	@DbRecordField(dataSourceName="GORDMSK_CONCEAL_IND")
	public NString GordmskConcealInd;
	@DbRecordField(dataSourceName="GORDMSK_DATA_MASK")
	public NString GordmskDataMask;
	@DbRecordField(dataSourceName="GORDMSK_DISPLAY_IND")
	public NString GordmskDisplayInd;
	@DbRecordField(dataSourceName="GORDMSK_FBPR_CODE")
	public NString GordmskFbprCode;
	@DbRecordField(dataSourceName="GORDMSK_FGAC_USER_ID")
	public NString GordmskFgacUserId;
	@DbRecordField(dataSourceName="GORDMSK_MASK_DIRECTION")
	public NString GordmskMaskDirection;
	@DbRecordField(dataSourceName="GORDMSK_MASK_LENGTH")
	public NNumber GordmskMaskLength;
	@DbRecordField(dataSourceName="GORDMSK_OBJS_CODE")
	public NString GordmskObjsCode;
	@DbRecordField(dataSourceName="GORDMSK_OBJS_COMP_NAME")
	public NString GordmskObjsCompName;
	@DbRecordField(dataSourceName="GORDMSK_SEQNO")
	public NNumber GordmskSeqno;
	@DbRecordField(dataSourceName="GORDMSK_USER_ID")
	public NString GordmskUserId;
	
	private TableRow gordmskrow;

	public GordmskRow() {
		super();
	}
	
	public GordmskRow(TableRow row) {
		
		this.gordmskrow = row; 
		
		this.GordmskActivityDate = gordmskrow.getDate("GORDMSK_ACTIVITY_DATE");
		this.GordmskAllUserInd = gordmskrow.getStr("GORDMSK_ALL_USER_IND");
		this.GordmskBlockCompName = gordmskrow.getStr("GORDMSK_BLOCK_COMP_NAME");
		this.GordmskBlockName = gordmskrow.getStr("GORDMSK_BLOCK_NAME");
		this.GordmskColumnCompName = gordmskrow.getStr("GORDMSK_COLUMN_COMP_NAME");
		this.GordmskColumnName = gordmskrow.getStr("GORDMSK_COLUMN_NAME");
		this.GordmskConcealInd = gordmskrow.getStr("GORDMSK_CONCEAL_IND");
		this.GordmskDataMask = gordmskrow.getStr("GORDMSK_DATA_MASK");
		this.GordmskDisplayInd = gordmskrow.getStr("GORDMSK_DISPLAY_IND");
		this.GordmskFbprCode = gordmskrow.getStr("GORDMSK_FBPR_CODE");
		this.GordmskFgacUserId = gordmskrow.getStr("GORDMSK_FGAC_USER_ID");
		this.GordmskMaskDirection = gordmskrow.getStr("GORDMSK_MASK_DIRECTION");
		this.GordmskMaskLength = gordmskrow.getNumber("GORDMSK_MASK_LENGTH");
		this.GordmskObjsCode = gordmskrow.getStr("GORDMSK_OBJS_CODE");
		this.GordmskObjsCompName = gordmskrow.getStr("GORDMSK_OBJS_COMP_NAME");
		this.GordmskSeqno = gordmskrow.getNumber("GORDMSK_SEQNO");
		this.GordmskUserId = gordmskrow.getStr("GORDMSK_USER_ID");
		
	}

	public NDate getGordmskActivityDate() {
		return GordmskActivityDate;
	}

	public NString getGordmskAllUserInd() {
		return GordmskAllUserInd;
	}

	public NString getGordmskBlockCompName() {
		return GordmskBlockCompName;
	}

	public NString getGordmskBlockName() {
		return GordmskBlockName;
	}

	public NString getGordmskColumnCompName() {
		return GordmskColumnCompName;
	}

	public NString getGordmskColumnName() {
		return GordmskColumnName;
	}

	public NString getGordmskConcealInd() {
		return GordmskConcealInd;
	}

	public NString getGordmskDataMask() {
		return GordmskDataMask;
	}

	public NString getGordmskDisplayInd() {
		return GordmskDisplayInd;
	}

	public NString getGordmskFbprCode() {
		return GordmskFbprCode;
	}

	public NString getGordmskFgacUserId() {
		return GordmskFgacUserId;
	}

	public NString getGordmskMaskDirection() {
		return GordmskMaskDirection;
	}

	public NNumber getGordmskMaskLength() {
		return GordmskMaskLength;
	}

	public NString getGordmskObjsCode() {
		return GordmskObjsCode;
	}

	public NString getGordmskObjsCompName() {
		return GordmskObjsCompName;
	}

	public NNumber getGordmskSeqno() {
		return GordmskSeqno;
	}

	public NString getGordmskUserId() {
		return GordmskUserId;
	}
	
}