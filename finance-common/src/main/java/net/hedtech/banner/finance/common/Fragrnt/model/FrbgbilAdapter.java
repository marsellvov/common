package  net.hedtech.banner.finance.common.Fragrnt.model;

import java.util.Date;
import java.math.BigDecimal;

import org.jdesktop.databuffer.DataRow;

import morphis.foundations.core.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.DAO;
import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appdatalayer.data.configuration.*;



public class FrbgbilAdapter extends BaseRowAdapter{
	

	public FrbgbilAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setFrbgbilCoasCode(NString value){
		this.setValue("FRBGBIL_COAS_CODE", value.getValue());
	}


	public NString getFrbgbilCoasCode(){
		NString v = new NString((String)this.getValue("FRBGBIL_COAS_CODE"));
		return v;
	}


		
	public void setFrbgbilGrntCode(NString value){
		this.setValue("FRBGBIL_GRNT_CODE", value.getValue());
	}


	public NString getFrbgbilGrntCode(){
		NString v = new NString((String)this.getValue("FRBGBIL_GRNT_CODE"));
		return v;
	}


	
	
	public void setFrbgbilUserId(NString value){
		this.setValue("FRBGBIL_USER_ID", value.getValue());
	}


	public NString getFrbgbilUserId(){
		NString v = new NString((String)this.getValue("FRBGBIL_USER_ID"));
		return v;
	}


	
	
	public void setFrbgbilActivityDate(NDate value){
		this.setValue("FRBGBIL_ACTIVITY_DATE", value.getValue());
	}


	public NDate getFrbgbilActivityDate(){
		NDate v = new NDate((Date)this.getValue("FRBGBIL_ACTIVITY_DATE"));
		return v;
	}


	
	
	public void setFrbgbilPmscCode(NString value){
		this.setValue("FRBGBIL_PMSC_CODE", value.getValue());
	}


	public NString getFrbgbilPmscCode(){
		NString v = new NString((String)this.getValue("FRBGBIL_PMSC_CODE"));
		return v;
	}


	
	
	public void setPmscName(NString value){
		this.setValue("PMSC_NAME", value.getValue());
	}


	public NString getPmscName(){
		NString v = new NString((String)this.getValue("PMSC_NAME"));
		return v;
	}


	
	
	public void setFrbgbilBeclCode(NString value){
		this.setValue("FRBGBIL_BECL_CODE", value.getValue());
	}


	public NString getFrbgbilBeclCode(){
		NString v = new NString((String)this.getValue("FRBGBIL_BECL_CODE"));
		return v;
	}


	
	
	public void setBeclName(NString value){
		this.setValue("BECL_NAME", value.getValue());
	}


	public NString getBeclName(){
		NString v = new NString((String)this.getValue("BECL_NAME"));
		return v;
	}


	
	
	public void setFrbgbilBudgetLimitInd(NString value){
		this.setValue("FRBGBIL_BUDGET_LIMIT_IND", value.getValue());
	}


	public NString getFrbgbilBudgetLimitInd(){
		NString v = new NString((String)this.getValue("FRBGBIL_BUDGET_LIMIT_IND"));
		return v;
	}


	
	
	public void setFrbgbilPaymentFundCode(NString value){
		this.setValue("FRBGBIL_PAYMENT_FUND_CODE", value.getValue());
	}


	public NString getFrbgbilPaymentFundCode(){
		NString v = new NString((String)this.getValue("FRBGBIL_PAYMENT_FUND_CODE"));
		return v;
	}


	
	
	public void setPaymentFundName(NString value){
		this.setValue("PAYMENT_FUND_NAME", value.getValue());
	}


	public NString getPaymentFundName(){
		NString v = new NString((String)this.getValue("PAYMENT_FUND_NAME"));
		return v;
	}


	
	
	public void setFrbgbilPaymentAcctCode(NString value){
		this.setValue("FRBGBIL_PAYMENT_ACCT_CODE", value.getValue());
	}


	public NString getFrbgbilPaymentAcctCode(){
		NString v = new NString((String)this.getValue("FRBGBIL_PAYMENT_ACCT_CODE"));
		return v;
	}


	
	
	public void setPaymentAcctName(NString value){
		this.setValue("PAYMENT_ACCT_NAME", value.getValue());
	}


	public NString getPaymentAcctName(){
		NString v = new NString((String)this.getValue("PAYMENT_ACCT_NAME"));
		return v;
	}


	
	
	public void setFrbgbilClearingAcctCode(NString value){
		this.setValue("FRBGBIL_CLEARING_ACCT_CODE", value.getValue());
	}


	public NString getFrbgbilClearingAcctCode(){
		NString v = new NString((String)this.getValue("FRBGBIL_CLEARING_ACCT_CODE"));
		return v;
	}


	
	
	public void setClearingAcctName(NString value){
		this.setValue("CLEARING_ACCT_NAME", value.getValue());
	}


	public NString getClearingAcctName(){
		NString v = new NString((String)this.getValue("CLEARING_ACCT_NAME"));
		return v;
	}


	
	
	public void setFrbgbilAddrType(NString value){
		this.setValue("FRBGBIL_ADDR_TYPE", value.getValue());
	}


	public NString getFrbgbilAddrType(){
		NString v = new NString((String)this.getValue("FRBGBIL_ADDR_TYPE"));
		return v;
	}


	
	
	public void setFrbgbilAddrSeqno(NNumber value){
		this.setValue("FRBGBIL_ADDR_SEQNO", value.getValue());
	}


	public NNumber getFrbgbilAddrSeqno(){
		NNumber v = new NNumber((BigDecimal)this.getValue("FRBGBIL_ADDR_SEQNO"));
		return v;
	}


	
	
	public void setFrbgbilLastInvSeqNo(NNumber value){
		this.setValue("FRBGBIL_LAST_INV_SEQ_NO", value.getValue());
	}


	public NNumber getFrbgbilLastInvSeqNo(){
		NNumber v = new NNumber((BigDecimal)this.getValue("FRBGBIL_LAST_INV_SEQ_NO"));
		return v;
	}


	
	
	public void setFrbgbilBfrmCode1034Ext(NString value){
		this.setValue("FRBGBIL_BFRM_CODE_1034_EXT", value.getValue());
	}


	public NString getFrbgbilBfrmCode1034Ext(){
		NString v = new NString((String)this.getValue("FRBGBIL_BFRM_CODE_1034_EXT"));
		return v;
	}


	
	
	public void setFrbgbilBudLineExceedInd(NString value){
		this.setValue("FRBGBIL_BUD_LINE_EXCEED_IND", value.getValue());
	}


	public NString getFrbgbilBudLineExceedInd(){
		NString v = new NString((String)this.getValue("FRBGBIL_BUD_LINE_EXCEED_IND"));
		return v;
	}


	
	
	public void setFrbgbilMinNotReachedInd(NString value){
		this.setValue("FRBGBIL_MIN_NOT_REACHED_IND", value.getValue());
	}


	public NString getFrbgbilMinNotReachedInd(){
		NString v = new NString((String)this.getValue("FRBGBIL_MIN_NOT_REACHED_IND"));
		return v;
	}


	
	
	public void setFrbgbilBudTotalExceedInd(NString value){
		this.setValue("FRBGBIL_BUD_TOTAL_EXCEED_IND", value.getValue());
	}


	public NString getFrbgbilBudTotalExceedInd(){
		NString v = new NString((String)this.getValue("FRBGBIL_BUD_TOTAL_EXCEED_IND"));
		return v;
	}


	
	
	public void setFrbgbilBudCheckSourceInd(NString value){
		this.setValue("FRBGBIL_BUD_CHECK_SOURCE_IND", value.getValue());
	}


	public NString getFrbgbilBudCheckSourceInd(){
		NString v = new NString((String)this.getValue("FRBGBIL_BUD_CHECK_SOURCE_IND"));
		return v;
	}


	
	
	public void setFrbgbilBillingStartDate(NDate value){
		this.setValue("FRBGBIL_BILLING_START_DATE", value.getValue());
	}


	public NDate getFrbgbilBillingStartDate(){
		NDate v = new NDate((Date)this.getValue("FRBGBIL_BILLING_START_DATE"));
		return v;
	}


	
	
	public void setFrbgbilBillingEndDate(NDate value){
		this.setValue("FRBGBIL_BILLING_END_DATE", value.getValue());
	}


	public NDate getFrbgbilBillingEndDate(){
		NDate v = new NDate((Date)this.getValue("FRBGBIL_BILLING_END_DATE"));
		return v;
	}


	
	
	public void setFrbgbilBillingMinAmt(NNumber value){
		this.setValue("FRBGBIL_BILLING_MIN_AMT", value.getValue());
	}


	public NNumber getFrbgbilBillingMinAmt(){
		NNumber v = new NNumber((BigDecimal)this.getValue("FRBGBIL_BILLING_MIN_AMT"));
		return v;
	}


	
	
	public void setFrbgbilCumulativeBilledAmt(NNumber value){
		this.setValue("FRBGBIL_CUMULATIVE_BILLED_AMT", value.getValue());
	}


	public NNumber getFrbgbilCumulativeBilledAmt(){
		NNumber v = new NNumber((BigDecimal)this.getValue("FRBGBIL_CUMULATIVE_BILLED_AMT"));
		return v;
	}


	
	
	public void setFrbgbilBillingMaxAmt(NNumber value){
		this.setValue("FRBGBIL_BILLING_MAX_AMT", value.getValue());
	}


	public NNumber getFrbgbilBillingMaxAmt(){
		NNumber v = new NNumber((BigDecimal)this.getValue("FRBGBIL_BILLING_MAX_AMT"));
		return v;
	}


	
	
	public void setFrbgbilDeferredAcctCode(NString value){
		this.setValue("FRBGBIL_DEFERRED_ACCT_CODE", value.getValue());
	}


	public NString getFrbgbilDeferredAcctCode(){
		NString v = new NString((String)this.getValue("FRBGBIL_DEFERRED_ACCT_CODE"));
		return v;
	}


	
	
	public void setDefferedAcctName(NString value){
		this.setValue("DEFFERED_ACCT_NAME", value.getValue());
	}


	public NString getDefferedAcctName(){
		NString v = new NString((String)this.getValue("DEFFERED_ACCT_NAME"));
		return v;
	}


	

	public void setROWID(byte[] bytes) {
		this.setROWID(DbManager.getDataBaseFactory().createRowid(bytes));
	}
 
	public void setROWID(java.sql.RowId rowId) {
		this.setValue(DAOConfiguration.MODEL_ROWID, rowId);
	}
	
}
