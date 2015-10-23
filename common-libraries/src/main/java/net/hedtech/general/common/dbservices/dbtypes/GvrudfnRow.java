package net.hedtech.general.common.dbservices.dbtypes;

import net.hedtech.general.common.dbservices.Eokwtow.TParampairRow;
import morphis.foundations.core.appdatalayer.data.TableRow;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbTableType;
import morphis.foundations.core.types.NDate;
import morphis.foundations.core.types.NNumber;
import morphis.foundations.core.types.NString;
import morphis.foundations.core.types.Table;

@DbRecordType(id="GvrudfnRow",     dataSourceName="GVRUDFN", rowType=true)
public class GvrudfnRow
{
	@DbRecordField(dataSourceName="GVRUDFN_OBJS_CODE")
	public NString gvrudfnObjsCode;
	@DbRecordField(dataSourceName="GVRUDFN_BLOCK_NAME")
	public NString gvrudfnBlockName;
	@DbRecordField(dataSourceName="GVRUDFN_ITEM_NAME")
	public NString gvrudfnItemName;
	@DbRecordField(dataSourceName="GVRUDFN_SEQNO")
	public NNumber gvrudfnSeqno;
	@DbRecordField(dataSourceName="GVRUDFN_USER")
	public NString gvrudfnUser;
	@DbRecordField(dataSourceName="GVRUDFN_ACTIVITY_DATE")
	public NDate gvrudfnActivityDate;
	@DbRecordField(dataSourceName="GVRUDFN_SYS_REQ_IND")
	public NString gvrudfnSysReqInd;
	@DbRecordField(dataSourceName="GVRUDFN_RESET_IND")
	public NString gvrudfnResetInd;
	@DbRecordField(dataSourceName="GVRUDFN_DISPLAY_SEQNO")
	public NNumber gvrudfnDisplaySeqno;
	@DbRecordField(dataSourceName="GVRUDFN_SORT_SEQNO")
	public NNumber gvrudfnSortSeqno;
	@DbRecordField(dataSourceName="GVRUDFN_WIDTH")
	public NNumber gvrudfnWidth;
	@DbRecordField(dataSourceName="GVRUDFN_VISIBLE")
	public NString gvrudfnVisible;
	@DbRecordField(dataSourceName="GVRUDFN_PROMPT")
	public NString gvrudfnPrompt;
	@DbRecordField(dataSourceName="GVRUDFN_HINT")
	public NString gvrudfnHint;
	@DbRecordField(dataSourceName="GVRUDFN_UPDATE_STATUS")
	public NString gvrudfnUpdateStatus;
	@DbRecordField(dataSourceName="GVRUDFN_ENTY_CODE")
	public NString gvrudfnEntyCode;
	@DbRecordField(dataSourceName="GVRUDFN_ATTRIBUTE")
	public NString gvrudfnAttribute;
	@DbRecordField(dataSourceName="GVRUDFN_ALL_USER_IND")
	public NString gvrudfnAllUserInd;
	@DbRecordField(dataSourceName="GVRUDFN_SURROGATE_ID")
	public NNumber gvrudfnSurrogateId;
	@DbRecordField(dataSourceName="GVRUDFN_VERSION")
	public NNumber gvrudfnVersion;
	@DbRecordField(dataSourceName="GVRUDFN_USER_ID")
	public NString gvrudfnUserId;
	@DbRecordField(dataSourceName="GVRUDFN_DATA_ORIGIN")
	public NString gvrudfnDataOrigin;
	@DbRecordField(dataSourceName="GVRUDFN_VPDI_CODE")
	public NString gvrudfnVpdiCode;
	
	private TableRow gvrudfnrow;
	
	public GvrudfnRow() {
	}
	public GvrudfnRow(TableRow row) {

		this.gvrudfnrow = row;
		this.gvrudfnObjsCode = gvrudfnrow.getStr("GVRUDFN_OBJS_CODE");
		this.gvrudfnBlockName = gvrudfnrow.getStr("GVRUDFN_BLOCK_NAME");
		this.gvrudfnItemName = gvrudfnrow.getStr("GVRUDFN_ITEM_NAME");
		this.gvrudfnSeqno = gvrudfnrow.getNumber("GVRUDFN_SEQNO");
		this.gvrudfnUser = gvrudfnrow.getStr("GVRUDFN_USER");
		this.gvrudfnActivityDate = gvrudfnrow.getDate("GVRUDFN_ACTIVITY_DATE");
		this.gvrudfnSysReqInd = gvrudfnrow.getStr("GVRUDFN_SYS_REQ_IND");
		this.gvrudfnResetInd =gvrudfnrow.getStr("GVRUDFN_RESET_IND");
		this.gvrudfnDisplaySeqno = gvrudfnrow.getNumber("GVRUDFN_DISPLAY_SEQNO");
		this.gvrudfnSortSeqno = gvrudfnrow.getNumber("GVRUDFN_SORT_SEQNO");
		this.gvrudfnWidth = gvrudfnrow.getNumber("GVRUDFN_WIDTH");
		this.gvrudfnVisible = gvrudfnrow.getStr("GVRUDFN_VISIBLE");
		this.gvrudfnPrompt = gvrudfnrow.getStr("GVRUDFN_PROMPT");
		this.gvrudfnHint = gvrudfnrow.getStr("GVRUDFN_HINT");
		this.gvrudfnUpdateStatus = gvrudfnrow.getStr("GVRUDFN_UPDATE_STATUS");
		this.gvrudfnEntyCode = gvrudfnrow.getStr("GVRUDFN_ENTY_CODE");
		this.gvrudfnAttribute = gvrudfnrow.getStr("GVRUDFN_ATTRIBUTE");
		this.gvrudfnAllUserInd = gvrudfnrow.getStr("GVRUDFN_ALL_USER_IND");
		this.gvrudfnSurrogateId = gvrudfnrow.getNumber("GVRUDFN_SURROGATE_ID");
		this.gvrudfnVersion = gvrudfnrow.getNumber("GVRUDFN_VERSION");
		this.gvrudfnUserId = gvrudfnrow.getStr("GVRUDFN_USER_ID");
		this.gvrudfnDataOrigin = gvrudfnrow.getStr("GVRUDFN_DATA_ORIGIN");
		this.gvrudfnVpdiCode = gvrudfnrow.getStr("GVRUDFN_VPDI_CODE");
		
	}






		//dataSourceName="GV_DISPLAY_PROPERTIES.t_display_items"
	@DbTableType(id="GvrudfnRow.TDisplayItems", dataSourceName="GV_DISPLAY_PROPERTIES.t_display_items", indexed=true)
	public static class TDisplayItems extends Table<GvrudfnRow> {
		
		@Override
		protected GvrudfnRow newValue(){
			return new GvrudfnRow();
		}
	}
	
	

}


