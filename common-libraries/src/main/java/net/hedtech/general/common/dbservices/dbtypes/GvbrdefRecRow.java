package net.hedtech.general.common.dbservices.dbtypes;

import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.NNumber;
import morphis.foundations.core.types.NString;

@DbRecordType(id="GvbrdefRecRow", dataSourceName="GVBRDEF_REC"/*, needsInitialization=true*/)
	public class GvbrdefRecRow
	{
		@DbRecordField(dataSourceName="R_RULE_CODE")
		public NString RRuleCode;
		@DbRecordField(dataSourceName="R_GSRC_CODE")
		public NString RGsrcCode;
		@DbRecordField(dataSourceName="R_SDEF_SEQ_NUM")
		public NNumber RSdefSeqNum;
		@DbRecordField(dataSourceName="R_PVAC_SEQ_NUM")
		public NNumber RPvacSeqNum;
		@DbRecordField(dataSourceName="R_LINE_NUM")
		public NNumber RLineNum;
		@DbRecordField(dataSourceName="R_OPERATOR")
		public NString ROperator;
		@DbRecordField(dataSourceName="R_VALUE")
		public NString RValue;
		@DbRecordField(dataSourceName="R_OPEN_PAREN")
		public NString ROpenParen;
		@DbRecordField(dataSourceName="R_CLOSE_PAREN")
		public NString RCloseParen;
		@DbRecordField(dataSourceName="R_SEPARATOR")
		public NString RSeparator;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}