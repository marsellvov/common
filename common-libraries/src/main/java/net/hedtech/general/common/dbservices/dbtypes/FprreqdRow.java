package net.hedtech.general.common.dbservices.dbtypes;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;

	
	@DbRecordType(id="FprreqdRow", dataSourceName="FPRREQD", rowType=true)
	public class FprreqdRow
	{
		@DbRecordField(dataSourceName="FPRREQD_ACTIVITY_DATE")
		public NDate FprreqdActivityDate;
		@DbRecordField(dataSourceName="FPRREQD_ADDL_CHRG_AMT")
		public NNumber FprreqdAddlChrgAmt;
		@DbRecordField(dataSourceName="FPRREQD_AGRE_CODE")
		public NString FprreqdAgreCode;
		@DbRecordField(dataSourceName="FPRREQD_AMT")
		public NNumber FprreqdAmt;
		@DbRecordField(dataSourceName="FPRREQD_ATYP_CODE")
		public NString FprreqdAtypCode;
		@DbRecordField(dataSourceName="FPRREQD_ATYP_SEQ_NUM")
		public NNumber FprreqdAtypSeqNum;
		@DbRecordField(dataSourceName="FPRREQD_BIDS_CODE")
		public NString FprreqdBidsCode;
		@DbRecordField(dataSourceName="FPRREQD_BUYR_CODE")
		public NString FprreqdBuyrCode;
		@DbRecordField(dataSourceName="FPRREQD_CANCEL_DATE")
		public NDate FprreqdCancelDate;
		@DbRecordField(dataSourceName="FPRREQD_CANCEL_IND")
		public NString FprreqdCancelInd;
		@DbRecordField(dataSourceName="FPRREQD_CLOSED_IND")
		public NString FprreqdClosedInd;
		@DbRecordField(dataSourceName="FPRREQD_COAS_CODE")
		public NString FprreqdCoasCode;
		@DbRecordField(dataSourceName="FPRREQD_COMM_CODE")
		public NString FprreqdCommCode;
		@DbRecordField(dataSourceName="FPRREQD_COMM_DESC")
		public NString FprreqdCommDesc;
		@DbRecordField(dataSourceName="FPRREQD_COMPLETE_IND")
		public NString FprreqdCompleteInd;
		@DbRecordField(dataSourceName="FPRREQD_CONVERT_ADDL_CHRG_AMT")
		public NNumber FprreqdConvertAddlChrgAmt;
		@DbRecordField(dataSourceName="FPRREQD_CONVERT_DISC_AMT")
		public NNumber FprreqdConvertDiscAmt;
		@DbRecordField(dataSourceName="FPRREQD_CONVERT_TAX_AMT")
		public NNumber FprreqdConvertTaxAmt;
		@DbRecordField(dataSourceName="FPRREQD_CONVERTED_UNIT_PRICE")
		public NNumber FprreqdConvertedUnitPrice;
		@DbRecordField(dataSourceName="FPRREQD_CURR_CODE")
		public NString FprreqdCurrCode;
		@DbRecordField(dataSourceName="FPRREQD_DESC_CHGE_IND")
		public NString FprreqdDescChgeInd;
		@DbRecordField(dataSourceName="FPRREQD_DISC_AMT")
		public NNumber FprreqdDiscAmt;
		@DbRecordField(dataSourceName="FPRREQD_ITEM")
		public NNumber FprreqdItem;
		@DbRecordField(dataSourceName="FPRREQD_ORGN_CODE")
		public NString FprreqdOrgnCode;
		@DbRecordField(dataSourceName="FPRREQD_POHD_CODE")
		public NString FprreqdPohdCode;
		@DbRecordField(dataSourceName="FPRREQD_POHD_ITEM")
		public NNumber FprreqdPohdItem;
		@DbRecordField(dataSourceName="FPRREQD_POST_DATE")
		public NDate FprreqdPostDate;
		@DbRecordField(dataSourceName="FPRREQD_PROJ_CODE")
		public NString FprreqdProjCode;
		@DbRecordField(dataSourceName="FPRREQD_QTY")
		public NNumber FprreqdQty;
		@DbRecordField(dataSourceName="FPRREQD_RECOMM_VEND_NAME")
		public NString FprreqdRecommVendName;
		@DbRecordField(dataSourceName="FPRREQD_REQD_DATE")
		public NDate FprreqdReqdDate;
		@DbRecordField(dataSourceName="FPRREQD_REQH_CODE")
		public NString FprreqdReqhCode;
		@DbRecordField(dataSourceName="FPRREQD_SHIP_CODE")
		public NString FprreqdShipCode;
		@DbRecordField(dataSourceName="FPRREQD_SUSP_IND")
		public NString FprreqdSuspInd;
		@DbRecordField(dataSourceName="FPRREQD_TAX_AMT")
		public NNumber FprreqdTaxAmt;
		@DbRecordField(dataSourceName="FPRREQD_TEXT_USAGE")
		public NString FprreqdTextUsage;
		@DbRecordField(dataSourceName="FPRREQD_TGRP_CODE")
		public NString FprreqdTgrpCode;
		@DbRecordField(dataSourceName="FPRREQD_UNIT_PRICE")
		public NNumber FprreqdUnitPrice;
		@DbRecordField(dataSourceName="FPRREQD_UOMS_CODE")
		public NString FprreqdUomsCode;
		@DbRecordField(dataSourceName="FPRREQD_USER_ID")
		public NString FprreqdUserId;
		@DbRecordField(dataSourceName="FPRREQD_VEND_PIDM")
		public NNumber FprreqdVendPidm;
		@DbRecordField(dataSourceName="FPRREQD_VEND_REF_NUM")
		public NString FprreqdVendRefNum;
	}
