package net.hedtech.general.common.dbservices.dbtypes;

import morphis.foundations.core.appdatalayer.data.TableRow;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbTableType;
import morphis.foundations.core.types.NNumber;
import morphis.foundations.core.types.NString;


	@DbTableType(id="WorkitemTypeRow", dataSourceName="GKKPRUL.workitem_table_type", indexed=true)
	@DbRecordType(id="WorkitemTypeRow", dataSourceName="GKKPRUL.WORKITEM_TYPE")
	public class WorkitemTypeRow {
	    @DbRecordField(dataSourceName="WORKITEM_SVAP_CODE")
	    public NString workitemSvapCode;
	    @DbRecordField(dataSourceName="WORKITEM_WIDTH")
	    public NNumber workitemWidth;
	    @DbRecordField(dataSourceName="WORKITEM_UPDATE_STATUS")
	    public NString workitemUpdateStatus;
	    @DbRecordField(dataSourceName="WORKITEM_INCLUDE_NULL_IND")
	    public NString workitemIncludeNullInd;
	    @DbRecordField(dataSourceName="WORKITEM_QUERY_VALUE")
	    public NString workitemQueryValue;
	    
	    @DbRecordField(dataSourceName="WORKITEM_PROMPT_TEXT")
	    public NString workitemPromptText;
	    @DbRecordField(dataSourceName="WORKITEM_ORDER_SEQNO")
	    public NNumber workitemOrderSeqno;
	    @DbRecordField(dataSourceName="WORKITEM_VISIBLE")
	    public NString workitemVisible;
	    @DbRecordField(dataSourceName="WORKITEM_SELECT_POSITION")
	    public NNumber workitemSelectPosition;
	    @DbRecordField(dataSourceName="WORKITEM_HINT_TEXT")
	    public NString workitemHintText;
	    @DbRecordField(dataSourceName="WORKITEM_LOVABLE")
	    public NString workitemLovable;
	    @DbRecordField(dataSourceName="WORKITEM_ENTY_CODE")
	    public NString workitemEntyCode;
	    @DbRecordField(dataSourceName="WORKITEM_ATTRIBUTE")
	    public NString workitemAttribute;
	    
	    private TableRow workitemType;
	    
	    public WorkitemTypeRow() {
	    }
	    
	    public WorkitemTypeRow(TableRow row) {
	
	        this.workitemType = row;
	        this.workitemSvapCode = workitemType.getStr("WORKITEM_SVAP_CODE");
	        this.workitemWidth = workitemType.getNumber("WORKITEM_WIDTH");
	        this.workitemUpdateStatus = workitemType.getStr("WORKITEM_UPDATE_STATUS");
	        this.workitemIncludeNullInd = workitemType.getStr("WORKITEM_INCLUDE_NULL_IND");
	        this.workitemQueryValue = workitemType.getStr("WORKITEM_QUERY_VALUE");
	        
	        this.workitemPromptText = workitemType.getStr("WORKITEM_PROMPT_TEXT");
	        this.workitemOrderSeqno = workitemType.getNumber("WORKITEM_ORDER_SEQNO");
	        this.workitemVisible =workitemType.getStr("WORKITEM_VISIBLE");
	        this.workitemSelectPosition = workitemType.getNumber("WORKITEM_SELECT_POSITION");
	        this.workitemHintText = workitemType.getStr("WORKITEM_HINT_TEXT");
	        this.workitemLovable = workitemType.getStr("WORKITEM_LOVABLE");
	        this.workitemEntyCode = workitemType.getStr("WORKITEM_ENTY_CODE");
	        
	    }
	}

