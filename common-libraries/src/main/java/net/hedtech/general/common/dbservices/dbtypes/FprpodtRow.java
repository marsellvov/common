package net.hedtech.general.common.dbservices.dbtypes;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;

	
	@DbRecordType(id="FprpodtRow", dataSourceName="FPRPODT", rowType=true)
	public class FprpodtRow
	{
		@DbRecordField(dataSourceName="FPRPODT_ACTIVITY_DATE")
		public NDate FprpodtActivityDate;
		@DbRecordField(dataSourceName="FPRPODT_ADDL_CHRG_AMT")
		public NNumber FprpodtAddlChrgAmt;
		@DbRecordField(dataSourceName="FPRPODT_AGRE_CODE")
		public NString FprpodtAgreCode;
		@DbRecordField(dataSourceName="FPRPODT_BO_REMAIN_BAL")
		public NNumber FprpodtBoRemainBal;
		@DbRecordField(dataSourceName="FPRPODT_CANCEL_DATE")
		public NDate FprpodtCancelDate;
		@DbRecordField(dataSourceName="FPRPODT_CANCEL_IND")
		public NString FprpodtCancelInd;
		@DbRecordField(dataSourceName="FPRPODT_CHANGE_SEQ_NUM")
		public NNumber FprpodtChangeSeqNum;
		@DbRecordField(dataSourceName="FPRPODT_CLOSED_IND")
		public NString FprpodtClosedInd;
		@DbRecordField(dataSourceName="FPRPODT_COMM_CODE")
		public NString FprpodtCommCode;
		@DbRecordField(dataSourceName="FPRPODT_COMM_DESC")
		public NString FprpodtCommDesc;
		@DbRecordField(dataSourceName="FPRPODT_CONVERT_ADDL_CHRG_AMT")
		public NNumber FprpodtConvertAddlChrgAmt;
		@DbRecordField(dataSourceName="FPRPODT_CONVERT_DISC_AMT")
		public NNumber FprpodtConvertDiscAmt;
		@DbRecordField(dataSourceName="FPRPODT_CONVERT_TAX_AMT")
		public NNumber FprpodtConvertTaxAmt;
		@DbRecordField(dataSourceName="FPRPODT_CONVERT_UNIT_PRICE")
		public NNumber FprpodtConvertUnitPrice;
		@DbRecordField(dataSourceName="FPRPODT_DESC_CHGE_IND")
		public NString FprpodtDescChgeInd;
		@DbRecordField(dataSourceName="FPRPODT_DISC_AMT")
		public NNumber FprpodtDiscAmt;
		@DbRecordField(dataSourceName="FPRPODT_EXT_AMT")
		public NNumber FprpodtExtAmt;
		@DbRecordField(dataSourceName="FPRPODT_ITEM")
		public NNumber FprpodtItem;
		@DbRecordField(dataSourceName="FPRPODT_LIQ_AMT")
		public NNumber FprpodtLiqAmt;
		@DbRecordField(dataSourceName="FPRPODT_POHD_CODE")
		public NString FprpodtPohdCode;
		@DbRecordField(dataSourceName="FPRPODT_QTY")
		public NNumber FprpodtQty;
		@DbRecordField(dataSourceName="FPRPODT_REQD_DATE")
		public NDate FprpodtReqdDate;
		@DbRecordField(dataSourceName="FPRPODT_SHIP_CODE")
		public NString FprpodtShipCode;
		@DbRecordField(dataSourceName="FPRPODT_SUSP_IND")
		public NString FprpodtSuspInd;
		@DbRecordField(dataSourceName="FPRPODT_TAX_AMT")
		public NNumber FprpodtTaxAmt;
		@DbRecordField(dataSourceName="FPRPODT_TEXT_USAGE")
		public NString FprpodtTextUsage;
		@DbRecordField(dataSourceName="FPRPODT_TGRP_CODE")
		public NString FprpodtTgrpCode;
		@DbRecordField(dataSourceName="FPRPODT_TTAG_NUM")
		public NString FprpodtTtagNum;
		@DbRecordField(dataSourceName="FPRPODT_UNIT_PRICE")
		public NNumber FprpodtUnitPrice;
		@DbRecordField(dataSourceName="FPRPODT_UOMS_CODE")
		public NString FprpodtUomsCode;
		@DbRecordField(dataSourceName="FPRPODT_USER_ID")
		public NString FprpodtUserId;
		@DbRecordField(dataSourceName="FPRPODT_VEND_REF_NUM")
		public NString FprpodtVendRefNum;
	}
