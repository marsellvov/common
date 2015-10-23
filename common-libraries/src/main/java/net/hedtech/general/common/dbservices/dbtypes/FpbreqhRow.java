package net.hedtech.general.common.dbservices.dbtypes;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;

	
	@DbRecordType(id="FpbreqhRow", dataSourceName="FPBREQH", rowType=true)
	public class FpbreqhRow
	{
		@DbRecordField(dataSourceName="FPBREQH_ACTIVITY_DATE")
		public NDate FpbreqhActivityDate;
		@DbRecordField(dataSourceName="FPBREQH_APPR_IND")
		public NString FpbreqhApprInd;
		@DbRecordField(dataSourceName="FPBREQH_ATTENTION_TO")
		public NString FpbreqhAttentionTo;
		@DbRecordField(dataSourceName="FPBREQH_ATYP_CODE")
		public NString FpbreqhAtypCode;
		@DbRecordField(dataSourceName="FPBREQH_ATYP_SEQ_NUM")
		public NNumber FpbreqhAtypSeqNum;
		@DbRecordField(dataSourceName="FPBREQH_CANCEL_DATE")
		public NDate FpbreqhCancelDate;
		@DbRecordField(dataSourceName="FPBREQH_CANCEL_IND")
		public NString FpbreqhCancelInd;
		@DbRecordField(dataSourceName="FPBREQH_CLOSED_DATE")
		public NDate FpbreqhClosedDate;
		@DbRecordField(dataSourceName="FPBREQH_CLOSED_IND")
		public NString FpbreqhClosedInd;
		@DbRecordField(dataSourceName="FPBREQH_COAS_CODE")
		public NString FpbreqhCoasCode;
		@DbRecordField(dataSourceName="FPBREQH_CODE")
		public NString FpbreqhCode;
		@DbRecordField(dataSourceName="FPBREQH_COMPLETE_IND")
		public NString FpbreqhCompleteInd;
		@DbRecordField(dataSourceName="FPBREQH_COPIED_FROM")
		public NString FpbreqhCopiedFrom;
		@DbRecordField(dataSourceName="FPBREQH_CRSN_CODE")
		public NString FpbreqhCrsnCode;
		@DbRecordField(dataSourceName="FPBREQH_CTRY_CODE_FAX")
		public NString FpbreqhCtryCodeFax;
		@DbRecordField(dataSourceName="FPBREQH_CTRY_CODE_PHONE")
		public NString FpbreqhCtryCodePhone;
		@DbRecordField(dataSourceName="FPBREQH_CURR_CODE")
		public NString FpbreqhCurrCode;
		@DbRecordField(dataSourceName="FPBREQH_DELIVERY_COMMENT")
		public NString FpbreqhDeliveryComment;
		@DbRecordField(dataSourceName="FPBREQH_DISC_CODE")
		public NString FpbreqhDiscCode;
		@DbRecordField(dataSourceName="FPBREQH_DOC_REF_CODE")
		public NString FpbreqhDocRefCode;
		@DbRecordField(dataSourceName="FPBREQH_EDIT_DEFER_IND")
		public NString FpbreqhEditDeferInd;
		@DbRecordField(dataSourceName="FPBREQH_EMAIL_ADDR")
		public NString FpbreqhEmailAddr;
		@DbRecordField(dataSourceName="FPBREQH_ENCUMB_IND")
		public NString FpbreqhEncumbInd;
		@DbRecordField(dataSourceName="FPBREQH_FAX_AREA")
		public NString FpbreqhFaxArea;
		@DbRecordField(dataSourceName="FPBREQH_FAX_EXT")
		public NString FpbreqhFaxExt;
		@DbRecordField(dataSourceName="FPBREQH_FAX_NUMBER")
		public NString FpbreqhFaxNumber;
		@DbRecordField(dataSourceName="FPBREQH_INVENTORY_REQ_IND")
		public NString FpbreqhInventoryReqInd;
		@DbRecordField(dataSourceName="FPBREQH_MATCH_REQUIRED")
		public NString FpbreqhMatchRequired;
		@DbRecordField(dataSourceName="FPBREQH_NAME")
		public NString FpbreqhName;
		@DbRecordField(dataSourceName="FPBREQH_NSF_ON_OFF_IND")
		public NString FpbreqhNsfOnOffInd;
		@DbRecordField(dataSourceName="FPBREQH_ORGN_CODE")
		public NString FpbreqhOrgnCode;
		@DbRecordField(dataSourceName="FPBREQH_ORIGIN_CODE")
		public NString FpbreqhOriginCode;
		@DbRecordField(dataSourceName="FPBREQH_PHONE_AREA")
		public NString FpbreqhPhoneArea;
		@DbRecordField(dataSourceName="FPBREQH_PHONE_EXT")
		public NString FpbreqhPhoneExt;
		@DbRecordField(dataSourceName="FPBREQH_PHONE_NUM")
		public NString FpbreqhPhoneNum;
		@DbRecordField(dataSourceName="FPBREQH_POST_DATE")
		public NDate FpbreqhPostDate;
		@DbRecordField(dataSourceName="FPBREQH_PRINT_IND")
		public NString FpbreqhPrintInd;
		@DbRecordField(dataSourceName="FPBREQH_RECOMM_VEND_NAME")
		public NString FpbreqhRecommVendName;
		@DbRecordField(dataSourceName="FPBREQH_REQ_PRINT_DATE")
		public NDate FpbreqhReqPrintDate;
		@DbRecordField(dataSourceName="FPBREQH_REQD_DATE")
		public NDate FpbreqhReqdDate;
		@DbRecordField(dataSourceName="FPBREQH_REQH_DATE")
		public NDate FpbreqhReqhDate;
		@DbRecordField(dataSourceName="FPBREQH_RQST_TYPE_IND")
		public NString FpbreqhRqstTypeInd;
		@DbRecordField(dataSourceName="FPBREQH_SHIP_CODE")
		public NString FpbreqhShipCode;
		@DbRecordField(dataSourceName="FPBREQH_SINGLE_ACCTG_IND")
		public NString FpbreqhSingleAcctgInd;
		@DbRecordField(dataSourceName="FPBREQH_SUSP_IND")
		public NString FpbreqhSuspInd;
		@DbRecordField(dataSourceName="FPBREQH_TEXT_IND")
		public NString FpbreqhTextInd;
		@DbRecordField(dataSourceName="FPBREQH_TGRP_CODE")
		public NString FpbreqhTgrpCode;
		@DbRecordField(dataSourceName="FPBREQH_TRANS_DATE")
		public NDate FpbreqhTransDate;
		@DbRecordField(dataSourceName="FPBREQH_USER_ID")
		public NString FpbreqhUserId;
		@DbRecordField(dataSourceName="FPBREQH_VEND_EMAIL_ADDR")
		public NString FpbreqhVendEmailAddr;
		@DbRecordField(dataSourceName="FPBREQH_VEND_PIDM")
		public NNumber FpbreqhVendPidm;
		@DbRecordField(dataSourceName="FPBREQH_VENDOR_CONTACT")
		public NString FpbreqhVendorContact;
	}
