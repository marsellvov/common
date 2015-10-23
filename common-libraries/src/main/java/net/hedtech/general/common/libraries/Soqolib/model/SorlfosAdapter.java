package  net.hedtech.general.common.libraries.Soqolib.model;

import java.util.Date;
import java.math.BigDecimal;

import org.jdesktop.databuffer.DataRow;

import morphis.foundations.core.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.DAO;
import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appdatalayer.data.configuration.*;



public class SorlfosAdapter extends BaseRowAdapter{
	

	public SorlfosAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setLfosRolledInd(NString value){
		this.setValue("LFOS_ROLLED_IND", value.getValue());
	}


	public NString getLfosRolledInd(){
		NString v = new NString((String)this.getValue("LFOS_ROLLED_IND"));
		return v;
	}


	
	
	public void setLfosDeactivateInd(NString value){
		this.setValue("LFOS_DEACTIVATE_IND", value.getValue());
	}


	public NString getLfosDeactivateInd(){
		NString v = new NString((String)this.getValue("LFOS_DEACTIVATE_IND"));
		return v;
	}


	
	
	public void setLfosErrorItem(NString value){
		this.setValue("LFOS_ERROR_ITEM", value.getValue());
	}


	public NString getLfosErrorItem(){
		NString v = new NString((String)this.getValue("LFOS_ERROR_ITEM"));
		return v;
	}


	
	
	public void setLfosErrorFlag(NString value){
		this.setValue("LFOS_ERROR_FLAG", value.getValue());
	}


	public NString getLfosErrorFlag(){
		NString v = new NString((String)this.getValue("LFOS_ERROR_FLAG"));
		return v;
	}


	
	
	public void setLfosDeleteInd(NString value){
		this.setValue("LFOS_DELETE_IND", value.getValue());
	}


	public NString getLfosDeleteInd(){
		NString v = new NString((String)this.getValue("LFOS_DELETE_IND"));
		return v;
	}


	
	
	public void setLfosOptionKey1(NString value){
		this.setValue("LFOS_OPTION_KEY1", value.getValue());
	}


	public NString getLfosOptionKey1(){
		NString v = new NString((String)this.getValue("LFOS_OPTION_KEY1"));
		return v;
	}


	
	
	public void setLfosOptionKey2(NString value){
		this.setValue("LFOS_OPTION_KEY2", value.getValue());
	}


	public NString getLfosOptionKey2(){
		NString v = new NString((String)this.getValue("LFOS_OPTION_KEY2"));
		return v;
	}


	
	
	public void setLfosOptionKey3(NString value){
		this.setValue("LFOS_OPTION_KEY3", value.getValue());
	}


	public NString getLfosOptionKey3(){
		NString v = new NString((String)this.getValue("LFOS_OPTION_KEY3"));
		return v;
	}


	
	
	public void setLfosOptionTitle1(NString value){
		this.setValue("LFOS_OPTION_TITLE1", value.getValue());
	}


	public NString getLfosOptionTitle1(){
		NString v = new NString((String)this.getValue("LFOS_OPTION_TITLE1"));
		return v;
	}


	
	
	public void setLfosOptionTitle2(NString value){
		this.setValue("LFOS_OPTION_TITLE2", value.getValue());
	}


	public NString getLfosOptionTitle2(){
		NString v = new NString((String)this.getValue("LFOS_OPTION_TITLE2"));
		return v;
	}


	
	
	public void setLfosOptionTitle3(NString value){
		this.setValue("LFOS_OPTION_TITLE3", value.getValue());
	}


	public NString getLfosOptionTitle3(){
		NString v = new NString((String)this.getValue("LFOS_OPTION_TITLE3"));
		return v;
	}


	
	
	public void setHoldDeptAttach(NString value){
		this.setValue("HOLD_DEPT_ATTACH", value.getValue());
	}


	public NString getHoldDeptAttach(){
		NString v = new NString((String)this.getValue("HOLD_DEPT_ATTACH"));
		return v;
	}


	
	
	public void setLfosWarning(NNumber value){
		this.setValue("LFOS_WARNING", value.getValue());
	}


	public NNumber getLfosWarning(){
		NNumber v = new NNumber((BigDecimal)this.getValue("LFOS_WARNING"));
		return v;
	}


	
	
	public void setSeverityOut(NString value){
		this.setValue("SEVERITY_OUT", value.getValue());
	}


	public NString getSeverityOut(){
		NString v = new NString((String)this.getValue("SEVERITY_OUT"));
		return v;
	}


	
	
	public void setCurrError(NNumber value){
		this.setValue("CURR_ERROR", value.getValue());
	}


	public NNumber getCurrError(){
		NNumber v = new NNumber((BigDecimal)this.getValue("CURR_ERROR"));
		return v;
	}


	
	// F2J_TODO : Item SOVLFOS_PIDM has the "Copy Value from Item" property defined, with value: SORLCUR.SORLCUR_PIDM                  
	
	public void setSorlfosPidm(NNumber value){
		this.setValue("SOVLFOS_PIDM", value.getValue());
	}


	public NNumber getSorlfosPidm(){
		NNumber v = new NNumber((BigDecimal)this.getValue("SOVLFOS_PIDM"));
		return v;
	}


	
	
	public void setSovlfosRowid(NString value){
		this.setValue("sovlfos_rowid", value.getValue());
	}


	public NString getSovlfosRowid(){
		NString v = new NString((String)this.getValue("sovlfos_rowid"));
		return v;
	}


	
	// F2J_TODO : Item SOVLFOS_LCUR_SEQNO has the "Copy Value from Item" property defined, with value: SORLCUR.SORLCUR_SEQNO                  
	
	public void setSorlfosLcurSeqno(NNumber value){
		this.setValue("SOVLFOS_LCUR_SEQNO", value.getValue());
	}


	public NNumber getSorlfosLcurSeqno(){
		NNumber v = new NNumber((BigDecimal)this.getValue("SOVLFOS_LCUR_SEQNO"));
		return v;
	}


	
	
	public void setSorlfosCurrentInd(NString value){
		this.setValue("sovlfos_current_ind", value.getValue());
	}


	public NString getSorlfosCurrentInd(){
		NString v = new NString((String)this.getValue("sovlfos_current_ind"));
		return v;
	}


	
	
	public void setSorlfosSeqno(NNumber value){
		this.setValue("SOVLFOS_SEQNO", value.getValue());
	}


	public NNumber getSorlfosSeqno(){
		NNumber v = new NNumber((BigDecimal)this.getValue("SOVLFOS_SEQNO"));
		return v;
	}


	
	
	public void setSorlfosCactCode(NString value){
		this.setValue("SOVLFOS_CACT_CODE", value.getValue());
	}


	public NString getSorlfosCactCode(){
		NString v = new NString((String)this.getValue("SOVLFOS_CACT_CODE"));
		return v;
	}


	
	
	public void setSorlfosCstsCode(NString value){
		this.setValue("SOVLFOS_CSTS_CODE", value.getValue());
	}


	public NString getSorlfosCstsCode(){
		NString v = new NString((String)this.getValue("SOVLFOS_CSTS_CODE"));
		return v;
	}


	
	
	public void setSorlfosLfstCode(NString value){
		this.setValue("SOVLFOS_LFST_CODE", value.getValue());
	}


	public NString getSorlfosLfstCode(){
		NString v = new NString((String)this.getValue("SOVLFOS_LFST_CODE"));
		return v;
	}


	
	
	public void setSorlfosPriorityNo(NNumber value){
		this.setValue("SOVLFOS_PRIORITY_NO", value.getValue());
	}


	public NNumber getSorlfosPriorityNo(){
		NNumber v = new NNumber((BigDecimal)this.getValue("SOVLFOS_PRIORITY_NO"));
		return v;
	}


	
	
	public void setSorlfosTermCode(NString value){
		this.setValue("SOVLFOS_TERM_CODE", value.getValue());
	}


	public NString getSorlfosTermCode(){
		NString v = new NString((String)this.getValue("SOVLFOS_TERM_CODE"));
		return v;
	}


	
	
	public void setSorlfosTermCodeCtlg(NString value){
		this.setValue("SOVLFOS_TERM_CODE_CTLG", value.getValue());
	}


	public NString getSorlfosTermCodeCtlg(){
		NString v = new NString((String)this.getValue("SOVLFOS_TERM_CODE_CTLG"));
		return v;
	}


	
	
	public void setSorlfosTermCodeEnd(NString value){
		this.setValue("SOVLFOS_TERM_CODE_END", value.getValue());
	}


	public NString getSorlfosTermCodeEnd(){
		NString v = new NString((String)this.getValue("SOVLFOS_TERM_CODE_END"));
		return v;
	}


	
	
	public void setSorlfosMajrCode(NString value){
		this.setValue("SOVLFOS_MAJR_CODE", value.getValue());
	}


	public NString getSorlfosMajrCode(){
		NString v = new NString((String)this.getValue("SOVLFOS_MAJR_CODE"));
		return v;
	}


	
	
	public void setSorlfosDeptCode(NString value){
		this.setValue("SOVLFOS_DEPT_CODE", value.getValue());
	}


	public NString getSorlfosDeptCode(){
		NString v = new NString((String)this.getValue("SOVLFOS_DEPT_CODE"));
		return v;
	}


	
	
	public void setSorlfosMajrCodeAttach(NString value){
		this.setValue("sovlfos_majr_code_attach", value.getValue());
	}


	public NString getSorlfosMajrCodeAttach(){
		NString v = new NString((String)this.getValue("sovlfos_majr_code_attach"));
		return v;
	}


	
	
	public void setSorlfosTmstCode(NString value){
		this.setValue("SOVLFOS_TMST_CODE", value.getValue());
	}


	public NString getSorlfosTmstCode(){
		NString v = new NString((String)this.getValue("SOVLFOS_TMST_CODE"));
		return v;
	}


	
	
	public void setSorlfosStartDate(NDate value){
		this.setValue("SOVLFOS_START_DATE", value.getValue());
	}


	public NDate getSorlfosStartDate(){
		NDate v = new NDate((Date)this.getValue("SOVLFOS_START_DATE"));
		return v;
	}


	
	
	public void setSorlfosEndDate(NDate value){
		this.setValue("SOVLFOS_END_DATE", value.getValue());
	}


	public NDate getSorlfosEndDate(){
		NDate v = new NDate((Date)this.getValue("SOVLFOS_END_DATE"));
		return v;
	}


	
	
	public void setSorlfosLfosRule(NNumber value){
		this.setValue("SOVLFOS_LFOS_RULE", value.getValue());
	}


	public NNumber getSorlfosLfosRule(){
		NNumber v = new NNumber((BigDecimal)this.getValue("SOVLFOS_LFOS_RULE"));
		return v;
	}


	
	
	public void setSorlfosConcAttachRule(NNumber value){
		this.setValue("SOVLFOS_CONC_ATTACH_RULE", value.getValue());
	}


	public NNumber getSorlfosConcAttachRule(){
		NNumber v = new NNumber((BigDecimal)this.getValue("SOVLFOS_CONC_ATTACH_RULE"));
		return v;
	}


	
	
	public void setSorlfosRolledSeqno(NNumber value){
		this.setValue("SOVLFOS_ROLLED_SEQNO", value.getValue());
	}


	public NNumber getSorlfosRolledSeqno(){
		NNumber v = new NNumber((BigDecimal)this.getValue("SOVLFOS_ROLLED_SEQNO"));
		return v;
	}


	
	
	public void setSorlfosUserId(NString value){
		this.setValue("SOVLFOS_USER_ID", value.getValue());
	}


	public NString getSorlfosUserId(){
		NString v = new NString((String)this.getValue("SOVLFOS_USER_ID"));
		return v;
	}


	
	
	public void setSorlfosActivityDate(NDate value){
		this.setValue("SOVLFOS_ACTIVITY_DATE", value.getValue());
	}


	public NDate getSorlfosActivityDate(){
		NDate v = new NDate((Date)this.getValue("SOVLFOS_ACTIVITY_DATE"));
		return v;
	}


	
	
	public void setSorlfosMajrDesc(NString value){
		this.setValue("SORLFOS_MAJR_DESC", value.getValue());
	}


	public NString getSorlfosMajrDesc(){
		NString v = new NString((String)this.getValue("SORLFOS_MAJR_DESC"));
		return v;
	}


	
	
	public void setSorlfosAttachConcDesc(NString value){
		this.setValue("SORLFOS_ATTACH_CONC_DESC", value.getValue());
	}


	public NString getSorlfosAttachConcDesc(){
		NString v = new NString((String)this.getValue("SORLFOS_ATTACH_CONC_DESC"));
		return v;
	}


	
	
	public void setSorlfosTmstDesc(NString value){
		this.setValue("SORLFOS_TMST_DESC", value.getValue());
	}


	public NString getSorlfosTmstDesc(){
		NString v = new NString((String)this.getValue("SORLFOS_TMST_DESC"));
		return v;
	}


	
	
	public void setSorlfosDeptDesc(NString value){
		this.setValue("SORLFOS_DEPT_DESC", value.getValue());
	}


	public NString getSorlfosDeptDesc(){
		NString v = new NString((String)this.getValue("SORLFOS_DEPT_DESC"));
		return v;
	}


	
	
	public void setSorlfosLfstCodeDesc(NString value){
		this.setValue("SORLFOS_LFST_CODE_DESC", value.getValue());
	}


	public NString getSorlfosLfstCodeDesc(){
		NString v = new NString((String)this.getValue("SORLFOS_LFST_CODE_DESC"));
		return v;
	}

	public java.sql.RowId getROWID(){ 
		return (java.sql.RowId) this.getValue(DAOConfiguration.MODEL_ROWID); 
		}

	public void setROWID(byte[] bytes) {
		this.setROWID(DbManager.getDataBaseFactory().createRowid(bytes));
	}
 
	public void setROWID(java.sql.RowId rowId) {
		this.setValue(DAOConfiguration.MODEL_ROWID, rowId);
	}

	public void setROWID(NString rowId){
		this.setROWID(rowId.getValue().getBytes());
	}
}
