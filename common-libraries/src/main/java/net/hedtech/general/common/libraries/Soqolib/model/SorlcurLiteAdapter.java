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



public class SorlcurLiteAdapter extends BaseRowAdapter{
	

	public SorlcurLiteAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setSorlcurGappSeqno(NNumber value){
		this.setValue("SOVLCUR_gapp_SEQNO", value.getValue());
	}


	public NNumber getSorlcurGappSeqno(){
		NNumber v = new NNumber((BigDecimal)this.getValue("SOVLCUR_gapp_SEQNO"));
		return v;
	}


	
	
	public void setSorlfosSeqnoCnt(NNumber value){
		this.setValue("SORLFOS_SEQNO_CNT", value.getValue());
	}


	public NNumber getSorlfosSeqnoCnt(){
		NNumber v = new NNumber((BigDecimal)this.getValue("SORLFOS_SEQNO_CNT"));
		return v;
	}


	
	
	public void setSorlcurDuplicateInd(NString value){
		this.setValue("SORLCUR_DUPLICATE_IND", value.getValue());
	}


	public NString getSorlcurDuplicateInd(){
		NString v = new NString((String)this.getValue("SORLCUR_DUPLICATE_IND"));
		return v;
	}


	
	
	public void setSorlcurQueryInd(NString value){
		this.setValue("SORLCUR_QUERY_IND", value.getValue());
	}


	public NString getSorlcurQueryInd(){
		NString v = new NString((String)this.getValue("SORLCUR_QUERY_IND"));
		return v;
	}


	
	
	public void setLfosMajrAttachInd(NString value){
		this.setValue("LFOS_MAJR_ATTACH_IND", value.getValue());
	}


	public NString getLfosMajrAttachInd(){
		NString v = new NString((String)this.getValue("LFOS_MAJR_ATTACH_IND"));
		return v;
	}


	
	
	public void setLfosMinrAttachInd(NString value){
		this.setValue("LFOS_MINR_ATTACH_IND", value.getValue());
	}


	public NString getLfosMinrAttachInd(){
		NString v = new NString((String)this.getValue("LFOS_MINR_ATTACH_IND"));
		return v;
	}


	
	
	public void setLfosConcmajrAttachInd(NString value){
		this.setValue("LFOS_CONCMAJR_ATTACH_IND", value.getValue());
	}


	public NString getLfosConcmajrAttachInd(){
		NString v = new NString((String)this.getValue("LFOS_CONCMAJR_ATTACH_IND"));
		return v;
	}


	
	
	public void setLfosConcbaseAttachInd(NString value){
		this.setValue("LFOS_CONCBASE_ATTACH_IND", value.getValue());
	}


	public NString getLfosConcbaseAttachInd(){
		NString v = new NString((String)this.getValue("LFOS_CONCBASE_ATTACH_IND"));
		return v;
	}


	
	
	public void setCurricWarning(NNumber value){
		this.setValue("CURRIC_WARNING", value.getValue());
	}


	public NNumber getCurricWarning(){
		NNumber v = new NNumber((BigDecimal)this.getValue("CURRIC_WARNING"));
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


	
	// F2J_TODO : Item SOVLCUR_PIDM has the "Copy Value from Item" property defined, with value: S$_CURRICULA.MODULE_PIDM                  
	
	public void setSorlcurPidm(NNumber value){
		this.setValue("SOVLCUR_PIDM", value.getValue());
	}


	public NNumber getSorlcurPidm(){
		NNumber v = new NNumber((BigDecimal)this.getValue("SOVLCUR_PIDM"));
		return v;
	}


	
	
	public void setSovlcurRowid(NString value){
		this.setValue("sovlcur_rowid", value.getValue());
	}


	public NString getSovlcurRowid(){
		NString v = new NString((String)this.getValue("sovlcur_rowid"));
		return v;
	}


	
	
	public void setSorlcurCurrRule(NNumber value){
		this.setValue("SOVLCUR_CURR_RULE", value.getValue());
	}


	public NNumber getSorlcurCurrRule(){
		NNumber v = new NNumber((BigDecimal)this.getValue("SOVLCUR_CURR_RULE"));
		return v;
	}


	
	
	public void setSovlcurCurrentInd(NString value){
		this.setValue("sovlcur_current_ind", value.getValue());
	}


	public NString getSovlcurCurrentInd(){
		NString v = new NString((String)this.getValue("sovlcur_current_ind"));
		return v;
	}


	
	// F2J_TODO : Item SOVLCUR_LMOD_CODE has the "Copy Value from Item" property defined, with value: S$_CURRICULA.MODULE_CODE                  
	
	public void setSorlcurLmodCode(NString value){
		this.setValue("SOVLCUR_LMOD_CODE", value.getValue());
	}


	public NString getSorlcurLmodCode(){
		NString v = new NString((String)this.getValue("SOVLCUR_LMOD_CODE"));
		return v;
	}


	
	
	public void setSorlcurSeqno(NNumber value){
		this.setValue("SOVLCUR_SEQNO", value.getValue());
	}


	public NNumber getSorlcurSeqno(){
		NNumber v = new NNumber((BigDecimal)this.getValue("SOVLCUR_SEQNO"));
		return v;
	}


	
	
	public void setSorlcurTermCode(NString value){
		this.setValue("SOVLCUR_TERM_CODE", value.getValue());
	}


	public NString getSorlcurTermCode(){
		NString v = new NString((String)this.getValue("SOVLCUR_TERM_CODE"));
		return v;
	}


	
	
	public void setSorlcurTermCodeCtlg(NString value){
		this.setValue("SOVLCUR_TERM_CODE_CTLG", value.getValue());
	}


	public NString getSorlcurTermCodeCtlg(){
		NString v = new NString((String)this.getValue("SOVLCUR_TERM_CODE_CTLG"));
		return v;
	}


	
	
	public void setSorlcurPriorityNo(NNumber value){
		this.setValue("SOVLCUR_PRIORITY_NO", value.getValue());
	}


	public NNumber getSorlcurPriorityNo(){
		NNumber v = new NNumber((BigDecimal)this.getValue("SOVLCUR_PRIORITY_NO"));
		return v;
	}


	
	
	public void setSorlcurProgram(NString value){
		this.setValue("SOVLCUR_PROGRAM", value.getValue());
	}


	public NString getSorlcurProgram(){
		NString v = new NString((String)this.getValue("SOVLCUR_PROGRAM"));
		return v;
	}


	
	
	public void setSorlcurLevlCode(NString value){
		this.setValue("SOVLCUR_LEVL_CODE", value.getValue());
	}


	public NString getSorlcurLevlCode(){
		NString v = new NString((String)this.getValue("SOVLCUR_LEVL_CODE"));
		return v;
	}


	
	
	public void setSorlcurCampCode(NString value){
		this.setValue("SOVLCUR_CAMP_CODE", value.getValue());
	}


	public NString getSorlcurCampCode(){
		NString v = new NString((String)this.getValue("SOVLCUR_CAMP_CODE"));
		return v;
	}


	
	
	public void setSorlcurCollCode(NString value){
		this.setValue("SOVLCUR_COLL_CODE", value.getValue());
	}


	public NString getSorlcurCollCode(){
		NString v = new NString((String)this.getValue("SOVLCUR_COLL_CODE"));
		return v;
	}


	
	
	public void setSorlcurDegcCode(NString value){
		this.setValue("SOVLCUR_DEGC_CODE", value.getValue());
	}


	public NString getSorlcurDegcCode(){
		NString v = new NString((String)this.getValue("SOVLCUR_DEGC_CODE"));
		return v;
	}


	
	
	public void setSorlcurKeySeqno(NNumber value){
		this.setValue("SOVLCUR_KEY_SEQNO", value.getValue());
	}


	public NNumber getSorlcurKeySeqno(){
		NNumber v = new NNumber((BigDecimal)this.getValue("SOVLCUR_KEY_SEQNO"));
		return v;
	}


	
	
	public void setSorlcurCactCode(NString value){
		this.setValue("SOVLCUR_CACT_CODE", value.getValue());
	}


	public NString getSorlcurCactCode(){
		NString v = new NString((String)this.getValue("SOVLCUR_CACT_CODE"));
		return v;
	}


	
	
	public void setSorlcurStartDate(NDate value){
		this.setValue("SOVLCUR_START_DATE", value.getValue());
	}


	public NDate getSorlcurStartDate(){
		NDate v = new NDate((Date)this.getValue("SOVLCUR_START_DATE"));
		return v;
	}


	
	
	public void setSorlcurEndDate(NDate value){
		this.setValue("SOVLCUR_END_DATE", value.getValue());
	}


	public NDate getSorlcurEndDate(){
		NDate v = new NDate((Date)this.getValue("SOVLCUR_END_DATE"));
		return v;
	}


	
	
	public void setSorlcurRollInd(NString value){
		this.setValue("SOVLCUR_ROLL_IND", value.getValue());
	}


	public NString getSorlcurRollInd(){
		NString v = new NString((String)this.getValue("SOVLCUR_ROLL_IND"));
		return v;
	}


	
	
	public void setSorlcurUserId(NString value){
		this.setValue("SOVLCUR_USER_ID", value.getValue());
	}


	public NString getSorlcurUserId(){
		NString v = new NString((String)this.getValue("SOVLCUR_USER_ID"));
		return v;
	}


	
	
	public void setSorlcurActivityDate(NDate value){
		this.setValue("SOVLCUR_ACTIVITY_DATE", value.getValue());
	}


	public NDate getSorlcurActivityDate(){
		NDate v = new NDate((Date)this.getValue("SOVLCUR_ACTIVITY_DATE"));
		return v;
	}


	
	
	public void setSorlcurAdmtCode(NString value){
		this.setValue("SOVLCUR_ADMT_CODE", value.getValue());
	}


	public NString getSorlcurAdmtCode(){
		NString v = new NString((String)this.getValue("SOVLCUR_ADMT_CODE"));
		return v;
	}


	
	
	public void setSorlcurTermCodeAdmit(NString value){
		this.setValue("SOVLCUR_TERM_CODE_ADMIT", value.getValue());
	}


	public NString getSorlcurTermCodeAdmit(){
		NString v = new NString((String)this.getValue("SOVLCUR_TERM_CODE_ADMIT"));
		return v;
	}


	
	
	public void setSorlcurTermCodeMatric(NString value){
		this.setValue("SOVLCUR_TERM_CODE_MATRIC", value.getValue());
	}


	public NString getSorlcurTermCodeMatric(){
		NString v = new NString((String)this.getValue("SOVLCUR_TERM_CODE_MATRIC"));
		return v;
	}


	
	
	public void setSorlcurTermCodeEnd(NString value){
		this.setValue("SOVLCUR_TERM_CODE_END", value.getValue());
	}


	public NString getSorlcurTermCodeEnd(){
		NString v = new NString((String)this.getValue("SOVLCUR_TERM_CODE_END"));
		return v;
	}


	
	
	public void setSorlcurRolledSeqno(NNumber value){
		this.setValue("SOVLCUR_ROLLED_SEQNO", value.getValue());
	}


	public NNumber getSorlcurRolledSeqno(){
		NNumber v = new NNumber((BigDecimal)this.getValue("SOVLCUR_ROLLED_SEQNO"));
		return v;
	}


	
	
	public void setSorlcurLevlDesc(NString value){
		this.setValue("SORLCUR_LEVL_DESC", value.getValue());
	}


	public NString getSorlcurLevlDesc(){
		NString v = new NString((String)this.getValue("SORLCUR_LEVL_DESC"));
		return v;
	}


	
	
	public void setSorlcurCampDesc(NString value){
		this.setValue("SORLCUR_CAMP_DESC", value.getValue());
	}


	public NString getSorlcurCampDesc(){
		NString v = new NString((String)this.getValue("SORLCUR_CAMP_DESC"));
		return v;
	}


	
	
	public void setSorlcurCollDesc(NString value){
		this.setValue("SORLCUR_COLL_DESC", value.getValue());
	}


	public NString getSorlcurCollDesc(){
		NString v = new NString((String)this.getValue("SORLCUR_COLL_DESC"));
		return v;
	}


	
	
	public void setSorlcurDegcDesc(NString value){
		this.setValue("SORLCUR_DEGC_DESC", value.getValue());
	}


	public NString getSorlcurDegcDesc(){
		NString v = new NString((String)this.getValue("SORLCUR_DEGC_DESC"));
		return v;
	}


	
	
	public void setSorlcurAdmtDesc(NString value){
		this.setValue("SORLCUR_ADMT_DESC", value.getValue());
	}


	public NString getSorlcurAdmtDesc(){
		NString v = new NString((String)this.getValue("SORLCUR_ADMT_DESC"));
		return v;
	}


	
	
	public void setSorlcurTermDesc(NString value){
		this.setValue("SORLCUR_TERM_DESC", value.getValue());
	}


	public NString getSorlcurTermDesc(){
		NString v = new NString((String)this.getValue("SORLCUR_TERM_DESC"));
		return v;
	}


	
	
	public void setSorlcurCatlgTermDesc(NString value){
		this.setValue("SORLCUR_CATLG_TERM_DESC", value.getValue());
	}


	public NString getSorlcurCatlgTermDesc(){
		NString v = new NString((String)this.getValue("SORLCUR_CATLG_TERM_DESC"));
		return v;
	}


	
	
	public void setTempSorlcurCurrRule(NNumber value){
		this.setValue("TEMP_SORLCUR_CURR_RULE", value.getValue());
	}


	public NNumber getTempSorlcurCurrRule(){
		NNumber v = new NNumber((BigDecimal)this.getValue("TEMP_SORLCUR_CURR_RULE"));
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
