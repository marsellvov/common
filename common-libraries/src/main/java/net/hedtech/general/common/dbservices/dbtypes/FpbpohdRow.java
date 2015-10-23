package net.hedtech.general.common.dbservices.dbtypes;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;

	
	@DbRecordType(id="FpbpohdRow", dataSourceName="FPBPOHD", rowType=true)
	public class FpbpohdRow
	{
		@DbRecordField(dataSourceName="FPBPOHD_ACK_DATE")
		public NDate FpbpohdAckDate;
		@DbRecordField(dataSourceName="FPBPOHD_ACTIVITY_DATE")
		public NDate FpbpohdActivityDate;
		@DbRecordField(dataSourceName="FPBPOHD_ADDL_CHRG_AMT")
		public NNumber FpbpohdAddlChrgAmt;
		@DbRecordField(dataSourceName="FPBPOHD_APPR_IND")
		public NString FpbpohdApprInd;
		@DbRecordField(dataSourceName="FPBPOHD_ATTENTION_TO")
		public NString FpbpohdAttentionTo;
		@DbRecordField(dataSourceName="FPBPOHD_ATYP_CODE")
		public NString FpbpohdAtypCode;
		@DbRecordField(dataSourceName="FPBPOHD_ATYP_SEQ_NUM")
		public NNumber FpbpohdAtypSeqNum;
		@DbRecordField(dataSourceName="FPBPOHD_BLANKET_CODE")
		public NString FpbpohdBlanketCode;
		@DbRecordField(dataSourceName="FPBPOHD_BLANKET_IND")
		public NString FpbpohdBlanketInd;
		@DbRecordField(dataSourceName="FPBPOHD_BLANKET_TERM_DATE")
		public NDate FpbpohdBlanketTermDate;
		@DbRecordField(dataSourceName="FPBPOHD_BUYR_CODE")
		public NString FpbpohdBuyrCode;
		@DbRecordField(dataSourceName="FPBPOHD_CANCEL_DATE")
		public NDate FpbpohdCancelDate;
		@DbRecordField(dataSourceName="FPBPOHD_CANCEL_IND")
		public NString FpbpohdCancelInd;
		@DbRecordField(dataSourceName="FPBPOHD_CARRIER_PIDM")
		public NNumber FpbpohdCarrierPidm;
		@DbRecordField(dataSourceName="FPBPOHD_CHANGE_SEQ_NUM")
		public NNumber FpbpohdChangeSeqNum;
		@DbRecordField(dataSourceName="FPBPOHD_CLAUSE_IND")
		public NString FpbpohdClauseInd;
		@DbRecordField(dataSourceName="FPBPOHD_CLOSED_DATE")
		public NDate FpbpohdClosedDate;
		@DbRecordField(dataSourceName="FPBPOHD_CLOSED_IND")
		public NString FpbpohdClosedInd;
		@DbRecordField(dataSourceName="FPBPOHD_COAS_CODE")
		public NString FpbpohdCoasCode;
		@DbRecordField(dataSourceName="FPBPOHD_CODE")
		public NString FpbpohdCode;
		@DbRecordField(dataSourceName="FPBPOHD_COMPLETE_IND")
		public NString FpbpohdCompleteInd;
		@DbRecordField(dataSourceName="FPBPOHD_COPIED_FROM")
		public NString FpbpohdCopiedFrom;
		@DbRecordField(dataSourceName="FPBPOHD_CRSN_CODE")
		public NString FpbpohdCrsnCode;
		@DbRecordField(dataSourceName="FPBPOHD_CTRY_CODE_FAX")
		public NString FpbpohdCtryCodeFax;
		@DbRecordField(dataSourceName="FPBPOHD_CTRY_CODE_PHONE")
		public NString FpbpohdCtryCodePhone;
		@DbRecordField(dataSourceName="FPBPOHD_CURR_CODE")
		public NString FpbpohdCurrCode;
		@DbRecordField(dataSourceName="FPBPOHD_DELIVERY_COMMENT")
		public NString FpbpohdDeliveryComment;
		@DbRecordField(dataSourceName="FPBPOHD_DISB_AGENT_IND")
		public NString FpbpohdDisbAgentInd;
		@DbRecordField(dataSourceName="FPBPOHD_DISC_CODE")
		public NString FpbpohdDiscCode;
		@DbRecordField(dataSourceName="FPBPOHD_DOC_CNTRL_IND")
		public NString FpbpohdDocCntrlInd;
		@DbRecordField(dataSourceName="FPBPOHD_DOC_REF_CODE")
		public NString FpbpohdDocRefCode;
		@DbRecordField(dataSourceName="FPBPOHD_EDI_IND")
		public NString FpbpohdEdiInd;
		@DbRecordField(dataSourceName="FPBPOHD_EDIT_DEFER_IND")
		public NString FpbpohdEditDeferInd;
		@DbRecordField(dataSourceName="FPBPOHD_EMAIL_ADDR")
		public NString FpbpohdEmailAddr;
		@DbRecordField(dataSourceName="FPBPOHD_FAX_AREA")
		public NString FpbpohdFaxArea;
		@DbRecordField(dataSourceName="FPBPOHD_FAX_EXT")
		public NString FpbpohdFaxExt;
		@DbRecordField(dataSourceName="FPBPOHD_FAX_NUMBER")
		public NString FpbpohdFaxNumber;
		@DbRecordField(dataSourceName="FPBPOHD_FOB_CODE")
		public NString FpbpohdFobCode;
		@DbRecordField(dataSourceName="FPBPOHD_FTRM_CODE")
		public NString FpbpohdFtrmCode;
		@DbRecordField(dataSourceName="FPBPOHD_INVENTORY_PO_IND")
		public NString FpbpohdInventoryPoInd;
		@DbRecordField(dataSourceName="FPBPOHD_MATCH_REQUIRED")
		public NString FpbpohdMatchRequired;
		@DbRecordField(dataSourceName="FPBPOHD_NAME")
		public NString FpbpohdName;
		@DbRecordField(dataSourceName="FPBPOHD_NSF_ON_OFF_IND")
		public NString FpbpohdNsfOnOffInd;
		@DbRecordField(dataSourceName="FPBPOHD_ORGN_CODE")
		public NString FpbpohdOrgnCode;
		@DbRecordField(dataSourceName="FPBPOHD_ORIGIN_CODE")
		public NString FpbpohdOriginCode;
		@DbRecordField(dataSourceName="FPBPOHD_PCLS_CODE")
		public NString FpbpohdPclsCode;
		@DbRecordField(dataSourceName="FPBPOHD_PHONE_AREA")
		public NString FpbpohdPhoneArea;
		@DbRecordField(dataSourceName="FPBPOHD_PHONE_EXT")
		public NString FpbpohdPhoneExt;
		@DbRecordField(dataSourceName="FPBPOHD_PHONE_NUM")
		public NString FpbpohdPhoneNum;
		@DbRecordField(dataSourceName="FPBPOHD_PMNT_CODE")
		public NString FpbpohdPmntCode;
		@DbRecordField(dataSourceName="FPBPOHD_PO_DATE")
		public NDate FpbpohdPoDate;
		@DbRecordField(dataSourceName="FPBPOHD_PO_PRINTED_DATE")
		public NDate FpbpohdPoPrintedDate;
		@DbRecordField(dataSourceName="FPBPOHD_PO_TYPE_IND")
		public NString FpbpohdPoTypeInd;
		@DbRecordField(dataSourceName="FPBPOHD_POST_DATE")
		public NDate FpbpohdPostDate;
		@DbRecordField(dataSourceName="FPBPOHD_PRINT_IND")
		public NString FpbpohdPrintInd;
		@DbRecordField(dataSourceName="FPBPOHD_PRT_ACK")
		public NString FpbpohdPrtAck;
		@DbRecordField(dataSourceName="FPBPOHD_RECOMM_VEND_NAME")
		public NString FpbpohdRecommVendName;
		@DbRecordField(dataSourceName="FPBPOHD_REQ_BID_IND")
		public NString FpbpohdReqBidInd;
		@DbRecordField(dataSourceName="FPBPOHD_REQD_DATE")
		public NDate FpbpohdReqdDate;
		@DbRecordField(dataSourceName="FPBPOHD_REXP_DATE")
		public NDate FpbpohdRexpDate;
		@DbRecordField(dataSourceName="FPBPOHD_RUSH_AMT")
		public NNumber FpbpohdRushAmt;
		@DbRecordField(dataSourceName="FPBPOHD_RUSH_IND")
		public NString FpbpohdRushInd;
		@DbRecordField(dataSourceName="FPBPOHD_SHIP_CODE")
		public NString FpbpohdShipCode;
		@DbRecordField(dataSourceName="FPBPOHD_SINGLE_ACCTG_IND")
		public NString FpbpohdSingleAcctgInd;
		@DbRecordField(dataSourceName="FPBPOHD_SUSP_IND")
		public NString FpbpohdSuspInd;
		@DbRecordField(dataSourceName="FPBPOHD_SUSP_IND_ADDL")
		public NString FpbpohdSuspIndAddl;
		@DbRecordField(dataSourceName="FPBPOHD_TELE_CODE")
		public NString FpbpohdTeleCode;
		@DbRecordField(dataSourceName="FPBPOHD_TEXT_IND")
		public NString FpbpohdTextInd;
		@DbRecordField(dataSourceName="FPBPOHD_TGRP_CODE")
		public NString FpbpohdTgrpCode;
		@DbRecordField(dataSourceName="FPBPOHD_TRANS_DATE")
		public NDate FpbpohdTransDate;
		@DbRecordField(dataSourceName="FPBPOHD_TRAT_CODE")
		public NString FpbpohdTratCode;
		@DbRecordField(dataSourceName="FPBPOHD_TRSK_CODE")
		public NString FpbpohdTrskCode;
		@DbRecordField(dataSourceName="FPBPOHD_USER_ID")
		public NString FpbpohdUserId;
		@DbRecordField(dataSourceName="FPBPOHD_VEND_EMAIL_ADDR")
		public NString FpbpohdVendEmailAddr;
		@DbRecordField(dataSourceName="FPBPOHD_VEND_PIDM")
		public NNumber FpbpohdVendPidm;
		@DbRecordField(dataSourceName="FPBPOHD_VENDOR_CONTACT")
		public NString FpbpohdVendorContact;
	}
