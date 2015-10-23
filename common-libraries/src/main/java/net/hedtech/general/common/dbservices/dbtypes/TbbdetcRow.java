package net.hedtech.general.common.dbservices.dbtypes;

import morphis.foundations.core.appdatalayer.data.TableRow;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.NDate;
import morphis.foundations.core.types.NNumber;
import morphis.foundations.core.types.NString;

@DbRecordType(id="TbbdetcRow",     dataSourceName="TBBDETC", rowType=true)
public class TbbdetcRow
{
@DbRecordField(dataSourceName="TBBDETC_DETAIL_CODE")
public NString TbbdetcDetailCode;
@DbRecordField(dataSourceName="TBBDETC_DESC")
public NString TbbdetcDesc;
@DbRecordField(dataSourceName="TBBDETC_TYPE_IND")
public NString TbbdetcTypeInd;
@DbRecordField(dataSourceName="TBBDETC_PRIORITY")
public NString TbbdetcPriority;
@DbRecordField(dataSourceName="TBBDETC_LIKE_TERM_IND")
public NString TbbdetcLikeTermInd;
@DbRecordField(dataSourceName="TBBDETC_DCAT_CODE")
public NString TbbdetcDcatCode;
@DbRecordField(dataSourceName="TBBDETC_AMOUNT")
public NNumber TbbdetcAmount;
@DbRecordField(dataSourceName="TBBDETC_TERM_CODE")
public NString TbbdetcTermCode;
@DbRecordField(dataSourceName="TBBDETC_EFFECTIVE_DATE")
public NDate TbbdetcEffectiveDate;
@DbRecordField(dataSourceName="TBBDETC_REFUNDABLE_IND")
public NString TbbdetcRefundableInd;
@DbRecordField(dataSourceName="TBBDETC_RECEIPT_IND")
public NString TbbdetcReceiptInd;
@DbRecordField(dataSourceName="TBBDETC_REFUND_IND")
public NString TbbdetcRefundInd;
@DbRecordField(dataSourceName="TBBDETC_ACTIVITY_DATE")
public NDate TbbdetcActivityDate;
@DbRecordField(dataSourceName="TBBDETC_PAYT_CODE")
public NString TbbdetcPaytCode;
@DbRecordField(dataSourceName="TBBDETC_PREBILL_PRINT_IND")
public NString TbbdetcPrebillPrintInd;
@DbRecordField(dataSourceName="TBBDETC_GL_NOS_ENTERABLE")
public NString TbbdetcGlNosEnterable;
@DbRecordField(dataSourceName="TBBDETC_TAXT_CODE")
public NString TbbdetcTaxtCode;
@DbRecordField(dataSourceName="TBBDETC_TBDC_IND")
public NString TbbdetcTbdcInd;
@DbRecordField(dataSourceName="TBBDETC_DETAIL_CODE_IND")
public NString TbbdetcDetailCodeInd;
@DbRecordField(dataSourceName="TBBDETC_DETC_ACTIVE_IND")
public NString TbbdetcDetcActiveInd;
@DbRecordField(dataSourceName="TBBDETC_DIRD_IND")
public NString TbbdetcDirdInd;
@DbRecordField(dataSourceName="TBBDETC_TIV_IND")
public NString TbbdetcTivInd;
@DbRecordField(dataSourceName="TBBDETC_INST_CHG_IND")
public NString TbbdetcInstChgInd;
@DbRecordField(dataSourceName="TBBDETC_LIKE_AIDY_IND")
public NString TbbdetcLikeAidyInd;
@DbRecordField(dataSourceName="TBBDETC_PAYHIST_IND")
public NString TbbdetcPayhistInd;
@DbRecordField(dataSourceName="TBBDETC_ABDC_IND")
public NString TbbdetcAbdcInd;
@DbRecordField(dataSourceName="TBBDETC_LIKE_PERIOD_IND")
public NString TbbdetcLikePeriodInd;
@DbRecordField(dataSourceName="TBBDETC_SURROGATE_ID")
public NNumber TbbdetcSurrogateId;
@DbRecordField(dataSourceName="TBBDETC_VERSION")
public NNumber TbbdetcVersion;
@DbRecordField(dataSourceName="TBBDETC_USER_ID")
public NString TbbdetcUserId;
@DbRecordField(dataSourceName="TBBDETC_DATA_ORIGIN")
public NString TbbdetcDataOrigin;
@DbRecordField(dataSourceName="TBBDETC_VPDI_CODE")
public NString TbbdetcVpdiCode;
private TableRow tbbdetcrow;
public TbbdetcRow(){
super();
}
public TbbdetcRow(TableRow row) {
this.tbbdetcrow = row;
this.TbbdetcDetailCode = tbbdetcrow.getStr("TBBDETC_DETAIL_CODE");
this.TbbdetcDesc = tbbdetcrow.getStr("TBBDETC_DESC");
this.TbbdetcTypeInd = tbbdetcrow.getStr("TBBDETC_TYPE_IND");
this.TbbdetcPriority = tbbdetcrow.getStr("TBBDETC_PRIORITY");
this.TbbdetcLikeTermInd = tbbdetcrow.getStr("TBBDETC_LIKE_TERM_IND");
this.TbbdetcDcatCode = tbbdetcrow.getStr("TBBDETC_DCAT_CODE");
this.TbbdetcAmount = tbbdetcrow.getNumber("TBBDETC_AMOUNT");
this.TbbdetcTermCode = tbbdetcrow.getStr("TBBDETC_TERM_CODE");
this.TbbdetcEffectiveDate = tbbdetcrow.getDate("TBBDETC_EFFECTIVE_DATE");
this.TbbdetcRefundableInd = tbbdetcrow.getStr("TBBDETC_REFUNDABLE_IND");
this.TbbdetcReceiptInd = tbbdetcrow.getStr("TBBDETC_RECEIPT_IND");
this.TbbdetcRefundInd = tbbdetcrow.getStr("TBBDETC_REFUND_IND");
this.TbbdetcActivityDate = tbbdetcrow.getDate("TBBDETC_ACTIVITY_DATE");
this.TbbdetcPaytCode = tbbdetcrow.getStr("TBBDETC_PAYT_CODE");
this.TbbdetcPrebillPrintInd = tbbdetcrow.getStr("TBBDETC_PREBILL_PRINT_IND");
this.TbbdetcGlNosEnterable = tbbdetcrow.getStr("TBBDETC_GL_NOS_ENTERABLE");
this.TbbdetcTaxtCode = tbbdetcrow.getStr("TBBDETC_TAXT_CODE");
this.TbbdetcTbdcInd = tbbdetcrow.getStr("TBBDETC_TBDC_IND");
this.TbbdetcDetailCodeInd = tbbdetcrow.getStr("TBBDETC_DETAIL_CODE_IND");
this.TbbdetcDetcActiveInd = tbbdetcrow.getStr("TBBDETC_DETC_ACTIVE_IND");
this.TbbdetcDirdInd = tbbdetcrow.getStr("TBBDETC_DIRD_IND");
this.TbbdetcTivInd = tbbdetcrow.getStr("TBBDETC_TIV_IND");
this.TbbdetcInstChgInd = tbbdetcrow.getStr("TBBDETC_INST_CHG_IND");
this.TbbdetcLikeAidyInd = tbbdetcrow.getStr("TBBDETC_LIKE_AIDY_IND");
this.TbbdetcPayhistInd = tbbdetcrow.getStr("TBBDETC_PAYHIST_IND");
this.TbbdetcAbdcInd = tbbdetcrow.getStr("TBBDETC_ABDC_IND");
this.TbbdetcLikePeriodInd = tbbdetcrow.getStr("TBBDETC_LIKE_PERIOD_IND");
this.TbbdetcSurrogateId = tbbdetcrow.getNumber("TBBDETC_SURROGATE_ID");
this.TbbdetcVersion = tbbdetcrow.getNumber("TBBDETC_VERSION");
this.TbbdetcUserId = tbbdetcrow.getStr("TBBDETC_USER_ID");
this.TbbdetcDataOrigin = tbbdetcrow.getStr("TBBDETC_DATA_ORIGIN");
this.TbbdetcVpdiCode = tbbdetcrow.getStr("TBBDETC_VPDI_CODE");
}
}

