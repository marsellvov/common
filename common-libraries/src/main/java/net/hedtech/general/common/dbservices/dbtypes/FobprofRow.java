package net.hedtech.general.common.dbservices.dbtypes;

import morphis.foundations.core.appdatalayer.data.TableRow;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.NDate;
import morphis.foundations.core.types.NNumber;
import morphis.foundations.core.types.NString;

@DbRecordType(id="FobprofRow",     dataSourceName="FOBPROF", rowType=true)
public class FobprofRow
{
@DbRecordField(dataSourceName="FOBPROF_USER_ID")
public NString FobprofUserId;
@DbRecordField(dataSourceName="FOBPROF_ACTIVITY_DATE")
public NDate FobprofActivityDate;
@DbRecordField(dataSourceName="FOBPROF_USER_NAME")
public NString FobprofUserName;
@DbRecordField(dataSourceName="FOBPROF_COAS_CODE")
public NString FobprofCoasCode;
@DbRecordField(dataSourceName="FOBPROF_SECG_CODE")
public NString FobprofSecgCode;
@DbRecordField(dataSourceName="FOBPROF_NSF_OVERRIDE")
public NString FobprofNsfOverride;
@DbRecordField(dataSourceName="FOBPROF_TOLERANCE")
public NNumber FobprofTolerance;
@DbRecordField(dataSourceName="FOBPROF_BUD_ID")
public NString FobprofBudId;
@DbRecordField(dataSourceName="FOBPROF_PIDM")
public NNumber FobprofPidm;
@DbRecordField(dataSourceName="FOBPROF_MASTER_FUND_IND")
public NString FobprofMasterFundInd;
@DbRecordField(dataSourceName="FOBPROF_MASTER_ORGN_IND")
public NString FobprofMasterOrgnInd;
@DbRecordField(dataSourceName="FOBPROF_MAX_TOLERANCE_AMT")
public NNumber FobprofMaxToleranceAmt;
@DbRecordField(dataSourceName="FOBPROF_RCVD_OVERRIDE_IND")
public NString FobprofRcvdOverrideInd;
@DbRecordField(dataSourceName="FOBPROF_RCVD_TOLERANCE_PCT")
public NNumber FobprofRcvdTolerancePct;
@DbRecordField(dataSourceName="FOBPROF_TOL_OVERRIDE_IND")
public NString FobprofTolOverrideInd;
@DbRecordField(dataSourceName="FOBPROF_DST_SPD_OVERRIDE_IND")
public NString FobprofDstSpdOverrideInd;
@DbRecordField(dataSourceName="FOBPROF_SPD_OVERRIDE_IND")
public NString FobprofSpdOverrideInd;
@DbRecordField(dataSourceName="FOBPROF_INT_RATE_OVERRIDE_IND")
public NString FobprofIntRateOverrideInd;
@DbRecordField(dataSourceName="FOBPROF_USER_INV_PRIV")
public NString FobprofUserInvPriv;
@DbRecordField(dataSourceName="FOBPROF_EXP_END_POST_AUTH_IND")
public NString FobprofExpEndPostAuthInd;
@DbRecordField(dataSourceName="FOBPROF_ACCRUAL_POST_AUTH_IND")
public NString FobprofAccrualPostAuthInd;
@DbRecordField(dataSourceName="FOBPROF_REQUESTER_ORGN_CODE")
public NString FobprofRequesterOrgnCode;
@DbRecordField(dataSourceName="FOBPROF_RCVD_TOLERANCE_QTY")
public NNumber FobprofRcvdToleranceQty;
@DbRecordField(dataSourceName="FOBPROF_RCVD_TOLERANCE_AMT")
public NNumber FobprofRcvdToleranceAmt;
@DbRecordField(dataSourceName="FOBPROF_RCVD_TOLERANCE_AMT_PCT")
public NNumber FobprofRcvdToleranceAmtPct;
@DbRecordField(dataSourceName="FOBPROF_REQUESTOR_EMAIL_ADDR")
public NString FobprofRequestorEmailAddr;
@DbRecordField(dataSourceName="FOBPROF_REQUESTOR_FAX_AREA")
public NString FobprofRequestorFaxArea;
@DbRecordField(dataSourceName="FOBPROF_REQUESTOR_FAX_NUMBER")
public NString FobprofRequestorFaxNumber;
@DbRecordField(dataSourceName="FOBPROF_REQUESTOR_FAX_EXT")
public NString FobprofRequestorFaxExt;
@DbRecordField(dataSourceName="FOBPROF_REQUESTOR_PHONE_AREA")
public NString FobprofRequestorPhoneArea;
@DbRecordField(dataSourceName="FOBPROF_REQUESTOR_PHONE_NUMBER")
public NString FobprofRequestorPhoneNumber;
@DbRecordField(dataSourceName="FOBPROF_REQUESTOR_PHONE_EXT")
public NString FobprofRequestorPhoneExt;
@DbRecordField(dataSourceName="FOBPROF_REQUESTOR_SHIP_CODE")
public NString FobprofRequestorShipCode;
@DbRecordField(dataSourceName="FOBPROF_EDI_OVERRIDE_IND")
public NString FobprofEdiOverrideInd;
@DbRecordField(dataSourceName="FOBPROF_ACH_OVERRIDE_IND")
public NString FobprofAchOverrideInd;
@DbRecordField(dataSourceName="FOBPROF_CARD_OVERRIDE_IND")
public NString FobprofCardOverrideInd;
@DbRecordField(dataSourceName="FOBPROF_REQ_MATCH_OVRRD_IND")
public NString FobprofReqMatchOvrrdInd;
@DbRecordField(dataSourceName="FOBPROF_PO_MATCH_OVRRD_IND")
public NString FobprofPoMatchOvrrdInd;
@DbRecordField(dataSourceName="FOBPROF_INV_MATCH_OVRRD_IND")
public NString FobprofInvMatchOvrrdInd;
@DbRecordField(dataSourceName="FOBPROF_WEB_ACCESS_IND")
public NString FobprofWebAccessInd;
@DbRecordField(dataSourceName="FOBPROF_WBUD_ACCESS_IND")
public NString FobprofWbudAccessInd;
@DbRecordField(dataSourceName="FOBPROF_WBUD_MSTR_FUND_IND")
public NString FobprofWbudMstrFundInd;
@DbRecordField(dataSourceName="FOBPROF_WBUD_MSTR_ORGN_IND")
public NString FobprofWbudMstrOrgnInd;
@DbRecordField(dataSourceName="FOBPROF_CTRY_CODE_REQ_PHONE")
public NString FobprofCtryCodeReqPhone;
@DbRecordField(dataSourceName="FOBPROF_CTRY_CODE_REQ_FAX")
public NString FobprofCtryCodeReqFax;
@DbRecordField(dataSourceName="FOBPROF_WHRLD_ACCESS_IND")
public NString FobprofWhrldAccessInd;
@DbRecordField(dataSourceName="FOBPROF_PO_HOLD_OVRD_IND")
public NString FobprofPoHoldOvrdInd;
@DbRecordField(dataSourceName="FOBPROF_PMT_HOLD_OVRD_IND")
public NString FobprofPmtHoldOvrdInd;
@DbRecordField(dataSourceName="FOBPROF_SURROGATE_ID")
public NNumber FobprofSurrogateId;
@DbRecordField(dataSourceName="FOBPROF_VERSION")
public NNumber FobprofVersion;
@DbRecordField(dataSourceName="FOBPROF_DATA_ORIGIN")
public NString FobprofDataOrigin;
@DbRecordField(dataSourceName="FOBPROF_VPDI_CODE")
public NString FobprofVpdiCode;
private TableRow fobprofrow;
public FobprofRow(){
super();
}
public FobprofRow(TableRow row) {
this.fobprofrow = row;
this.FobprofUserId = fobprofrow.getStr("FOBPROF_USER_ID");
this.FobprofActivityDate = fobprofrow.getDate("FOBPROF_ACTIVITY_DATE");
this.FobprofUserName = fobprofrow.getStr("FOBPROF_USER_NAME");
this.FobprofCoasCode = fobprofrow.getStr("FOBPROF_COAS_CODE");
this.FobprofSecgCode = fobprofrow.getStr("FOBPROF_SECG_CODE");
this.FobprofNsfOverride = fobprofrow.getStr("FOBPROF_NSF_OVERRIDE");
this.FobprofTolerance = fobprofrow.getNumber("FOBPROF_TOLERANCE");
this.FobprofBudId = fobprofrow.getStr("FOBPROF_BUD_ID");
this.FobprofPidm = fobprofrow.getNumber("FOBPROF_PIDM");
this.FobprofMasterFundInd = fobprofrow.getStr("FOBPROF_MASTER_FUND_IND");
this.FobprofMasterOrgnInd = fobprofrow.getStr("FOBPROF_MASTER_ORGN_IND");
this.FobprofMaxToleranceAmt = fobprofrow.getNumber("FOBPROF_MAX_TOLERANCE_AMT");
this.FobprofRcvdOverrideInd = fobprofrow.getStr("FOBPROF_RCVD_OVERRIDE_IND");
this.FobprofRcvdTolerancePct = fobprofrow.getNumber("FOBPROF_RCVD_TOLERANCE_PCT");
this.FobprofTolOverrideInd = fobprofrow.getStr("FOBPROF_TOL_OVERRIDE_IND");
this.FobprofDstSpdOverrideInd = fobprofrow.getStr("FOBPROF_DST_SPD_OVERRIDE_IND");
this.FobprofSpdOverrideInd = fobprofrow.getStr("FOBPROF_SPD_OVERRIDE_IND");
this.FobprofIntRateOverrideInd = fobprofrow.getStr("FOBPROF_INT_RATE_OVERRIDE_IND");
this.FobprofUserInvPriv = fobprofrow.getStr("FOBPROF_USER_INV_PRIV");
this.FobprofExpEndPostAuthInd = fobprofrow.getStr("FOBPROF_EXP_END_POST_AUTH_IND");
this.FobprofAccrualPostAuthInd = fobprofrow.getStr("FOBPROF_ACCRUAL_POST_AUTH_IND");
this.FobprofRequesterOrgnCode = fobprofrow.getStr("FOBPROF_REQUESTER_ORGN_CODE");
this.FobprofRcvdToleranceQty = fobprofrow.getNumber("FOBPROF_RCVD_TOLERANCE_QTY");
this.FobprofRcvdToleranceAmt = fobprofrow.getNumber("FOBPROF_RCVD_TOLERANCE_AMT");
this.FobprofRcvdToleranceAmtPct = fobprofrow.getNumber("FOBPROF_RCVD_TOLERANCE_AMT_PCT");
this.FobprofRequestorEmailAddr = fobprofrow.getStr("FOBPROF_REQUESTOR_EMAIL_ADDR");
this.FobprofRequestorFaxArea = fobprofrow.getStr("FOBPROF_REQUESTOR_FAX_AREA");
this.FobprofRequestorFaxNumber = fobprofrow.getStr("FOBPROF_REQUESTOR_FAX_NUMBER");
this.FobprofRequestorFaxExt = fobprofrow.getStr("FOBPROF_REQUESTOR_FAX_EXT");
this.FobprofRequestorPhoneArea = fobprofrow.getStr("FOBPROF_REQUESTOR_PHONE_AREA");
this.FobprofRequestorPhoneNumber = fobprofrow.getStr("FOBPROF_REQUESTOR_PHONE_NUMBER");
this.FobprofRequestorPhoneExt = fobprofrow.getStr("FOBPROF_REQUESTOR_PHONE_EXT");
this.FobprofRequestorShipCode = fobprofrow.getStr("FOBPROF_REQUESTOR_SHIP_CODE");
this.FobprofEdiOverrideInd = fobprofrow.getStr("FOBPROF_EDI_OVERRIDE_IND");
this.FobprofAchOverrideInd = fobprofrow.getStr("FOBPROF_ACH_OVERRIDE_IND");
this.FobprofCardOverrideInd = fobprofrow.getStr("FOBPROF_CARD_OVERRIDE_IND");
this.FobprofReqMatchOvrrdInd = fobprofrow.getStr("FOBPROF_REQ_MATCH_OVRRD_IND");
this.FobprofPoMatchOvrrdInd = fobprofrow.getStr("FOBPROF_PO_MATCH_OVRRD_IND");
this.FobprofInvMatchOvrrdInd = fobprofrow.getStr("FOBPROF_INV_MATCH_OVRRD_IND");
this.FobprofWebAccessInd = fobprofrow.getStr("FOBPROF_WEB_ACCESS_IND");
this.FobprofWbudAccessInd = fobprofrow.getStr("FOBPROF_WBUD_ACCESS_IND");
this.FobprofWbudMstrFundInd = fobprofrow.getStr("FOBPROF_WBUD_MSTR_FUND_IND");
this.FobprofWbudMstrOrgnInd = fobprofrow.getStr("FOBPROF_WBUD_MSTR_ORGN_IND");
this.FobprofCtryCodeReqPhone = fobprofrow.getStr("FOBPROF_CTRY_CODE_REQ_PHONE");
this.FobprofCtryCodeReqFax = fobprofrow.getStr("FOBPROF_CTRY_CODE_REQ_FAX");
this.FobprofWhrldAccessInd = fobprofrow.getStr("FOBPROF_WHRLD_ACCESS_IND");
this.FobprofPoHoldOvrdInd = fobprofrow.getStr("FOBPROF_PO_HOLD_OVRD_IND");
this.FobprofPmtHoldOvrdInd = fobprofrow.getStr("FOBPROF_PMT_HOLD_OVRD_IND");
this.FobprofSurrogateId = fobprofrow.getNumber("FOBPROF_SURROGATE_ID");
this.FobprofVersion = fobprofrow.getNumber("FOBPROF_VERSION");
this.FobprofDataOrigin = fobprofrow.getStr("FOBPROF_DATA_ORIGIN");
this.FobprofVpdiCode = fobprofrow.getStr("FOBPROF_VPDI_CODE");
}
}