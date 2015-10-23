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



public class SovlcurAdapter extends BaseRowAdapter{
	

	public SovlcurAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setSovlcurRolledSeqno(NNumber value){
		this.setValue("SOVLCUR_ROLLED_SEQNO", value.getValue());
	}


	public NNumber getSovlcurRolledSeqno(){
		NNumber v = new NNumber((BigDecimal)this.getValue("SOVLCUR_ROLLED_SEQNO"));
		return v;
	}


	
	
	public void setSovlcurRptCurrentInd(NString value){
		this.setValue("sovlcur_current_ind", value.getValue());
	}


	public NString getSovlcurRptCurrentInd(){
		NString v = new NString((String)this.getValue("sovlcur_current_ind"));
		return v;
	}


	
	
	public void setSummaryRowid(NString value){
		this.setValue("sovlcur_rowid", value.getValue());
	}


	public NString getSummaryRowid(){
		NString v = new NString((String)this.getValue("sovlcur_rowid"));
		return v;
	}


	
	// F2J_TODO : Item SOVLCUR_PIDM has the "Copy Value from Item" property defined, with value: S$_CURRICULA_SUMMARY.SUMMARY_PIDM                  
	
	public void setSovlcurPidm(NNumber value){
		this.setValue("SOVLCUR_PIDM", value.getValue());
	}


	public NNumber getSovlcurPidm(){
		NNumber v = new NNumber((BigDecimal)this.getValue("SOVLCUR_PIDM"));
		return v;
	}


	
	
	public void setSovlcurSeqno(NNumber value){
		this.setValue("sovlcur_seqno", value.getValue());
	}


	public NNumber getSovlcurSeqno(){
		NNumber v = new NNumber((BigDecimal)this.getValue("sovlcur_seqno"));
		return v;
	}


	
	
	public void setSovlcurGappSeqno(NNumber value){
		this.setValue("SOVLCUR_GAPP_SEQNO", value.getValue());
	}


	public NNumber getSovlcurGappSeqno(){
		NNumber v = new NNumber((BigDecimal)this.getValue("SOVLCUR_GAPP_SEQNO"));
		return v;
	}


	
	
	public void setSovlcurPriorityNo(NNumber value){
		this.setValue("SOVLCUR_PRIORITY_NO", value.getValue());
	}


	public NNumber getSovlcurPriorityNo(){
		NNumber v = new NNumber((BigDecimal)this.getValue("SOVLCUR_PRIORITY_NO"));
		return v;
	}


	
	
	public void setSovlcurTermCode(NString value){
		this.setValue("SOVLCUR_TERM_CODE", value.getValue());
	}


	public NString getSovlcurTermCode(){
		NString v = new NString((String)this.getValue("SOVLCUR_TERM_CODE"));
		return v;
	}


	
	
	public void setSovlcurProgram(NString value){
		this.setValue("SOVLCUR_PROGRAM", value.getValue());
	}


	public NString getSovlcurProgram(){
		NString v = new NString((String)this.getValue("SOVLCUR_PROGRAM"));
		return v;
	}


	
	
	public void setSovlcurTermCodeCtlg(NString value){
		this.setValue("SOVLCUR_TERM_CODE_CTLG", value.getValue());
	}


	public NString getSovlcurTermCodeCtlg(){
		NString v = new NString((String)this.getValue("SOVLCUR_TERM_CODE_CTLG"));
		return v;
	}


	
	// F2J_TODO : Item SOVLCUR_KEY_SEQNO has the "Copy Value from Item" property defined, with value: S$_CURRICULA_SUMMARY.SUMMARY_KEY_SEQNO                  
	
	public void setSovlcurKeySeqno(NNumber value){
		this.setValue("SOVLCUR_KEY_SEQNO", value.getValue());
	}


	public NNumber getSovlcurKeySeqno(){
		NNumber v = new NNumber((BigDecimal)this.getValue("SOVLCUR_KEY_SEQNO"));
		return v;
	}


	
	
	public void setSovlcurProgramDesc(NString value){
		this.setValue("SOVLCUR_PROGRAM_DESC", value.getValue());
	}


	public NString getSovlcurProgramDesc(){
		NString v = new NString((String)this.getValue("SOVLCUR_PROGRAM_DESC"));
		return v;
	}


	
	
	public void setStvlevlDesc(NString value){
		this.setValue("STVLEVL_DESC", value.getValue());
	}


	public NString getStvlevlDesc(){
		NString v = new NString((String)this.getValue("STVLEVL_DESC"));
		return v;
	}


	
	
	public void setStvcampDesc(NString value){
		this.setValue("STVCAMP_DESC", value.getValue());
	}


	public NString getStvcampDesc(){
		NString v = new NString((String)this.getValue("STVCAMP_DESC"));
		return v;
	}


	
	
	public void setStvcollDesc(NString value){
		this.setValue("STVCOLL_DESC", value.getValue());
	}


	public NString getStvcollDesc(){
		NString v = new NString((String)this.getValue("STVCOLL_DESC"));
		return v;
	}


	
	
	public void setStvdegcDesc(NString value){
		this.setValue("STVDEGC_DESC", value.getValue());
	}


	public NString getStvdegcDesc(){
		NString v = new NString((String)this.getValue("STVDEGC_DESC"));
		return v;
	}


	
	
	public void setSovlcurTermCodeEnd(NString value){
		this.setValue("SOVLCUR_TERM_CODE_END", value.getValue());
	}


	public NString getSovlcurTermCodeEnd(){
		NString v = new NString((String)this.getValue("SOVLCUR_TERM_CODE_END"));
		return v;
	}


	
	
	public void setSovlcurStvstypDesc(NString value){
		this.setValue("SOVLCUR_STVSTYP_DESC", value.getValue());
	}


	public NString getSovlcurStvstypDesc(){
		NString v = new NString((String)this.getValue("SOVLCUR_STVSTYP_DESC"));
		return v;
	}


	
	
	public void setSovlcurStvrateDesc(NString value){
		this.setValue("SOVLCUR_STVRATE_DESC", value.getValue());
	}


	public NString getSovlcurStvrateDesc(){
		NString v = new NString((String)this.getValue("SOVLCUR_STVRATE_DESC"));
		return v;
	}


	
	
	public void setSovlcurStypCode(NString value){
		this.setValue("SOVLCUR_STYP_CODE", value.getValue());
	}


	public NString getSovlcurStypCode(){
		NString v = new NString((String)this.getValue("SOVLCUR_STYP_CODE"));
		return v;
	}


	
	
	public void setSovlcurLevlCode(NString value){
		this.setValue("SOVLCUR_LEVL_CODE", value.getValue());
	}


	public NString getSovlcurLevlCode(){
		NString v = new NString((String)this.getValue("SOVLCUR_LEVL_CODE"));
		return v;
	}


	
	
	public void setSovlcurCampCode(NString value){
		this.setValue("SOVLCUR_CAMP_CODE", value.getValue());
	}


	public NString getSovlcurCampCode(){
		NString v = new NString((String)this.getValue("SOVLCUR_CAMP_CODE"));
		return v;
	}


	
	
	public void setSovlcurRateCode(NString value){
		this.setValue("SOVLCUR_RATE_CODE", value.getValue());
	}


	public NString getSovlcurRateCode(){
		NString v = new NString((String)this.getValue("SOVLCUR_RATE_CODE"));
		return v;
	}


	
	
	public void setSovlcurCollCode(NString value){
		this.setValue("SOVLCUR_COLL_CODE", value.getValue());
	}


	public NString getSovlcurCollCode(){
		NString v = new NString((String)this.getValue("SOVLCUR_COLL_CODE"));
		return v;
	}


	
	
	public void setSovlcurDegcCode(NString value){
		this.setValue("SOVLCUR_DEGC_CODE", value.getValue());
	}


	public NString getSovlcurDegcCode(){
		NString v = new NString((String)this.getValue("SOVLCUR_DEGC_CODE"));
		return v;
	}


	
	
	public void setSovlcurAdmtCode(NString value){
		this.setValue("SOVLCUR_admt_CODE", value.getValue());
	}


	public NString getSovlcurAdmtCode(){
		NString v = new NString((String)this.getValue("SOVLCUR_admt_CODE"));
		return v;
	}


	
	
	public void setSovlcurDgmrSeqno(NNumber value){
		this.setValue("SOVLCUR_DGMR_SEQNO", value.getValue());
	}


	public NNumber getSovlcurDgmrSeqno(){
		NNumber v = new NNumber((BigDecimal)this.getValue("SOVLCUR_DGMR_SEQNO"));
		return v;
	}


	
	
	public void setSovlcurStvadmtDesc(NString value){
		this.setValue("SOVLCUR_STVADMT_DESC", value.getValue());
	}


	public NString getSovlcurStvadmtDesc(){
		NString v = new NString((String)this.getValue("SOVLCUR_STVADMT_DESC"));
		return v;
	}


	
	
	public void setSovlcurTermCodeAdmit(NString value){
		this.setValue("SOVLCUR_TERM_CODE_ADMIT", value.getValue());
	}


	public NString getSovlcurTermCodeAdmit(){
		NString v = new NString((String)this.getValue("SOVLCUR_TERM_CODE_ADMIT"));
		return v;
	}


	
	
	public void setSovlcurTermCodeMatric(NString value){
		this.setValue("SOVLCUR_TERM_CODE_MATRIC", value.getValue());
	}


	public NString getSovlcurTermCodeMatric(){
		NString v = new NString((String)this.getValue("SOVLCUR_TERM_CODE_MATRIC"));
		return v;
	}


	
	
	public void setPrimaryDesc(NString value){
		this.setValue("PRIMARY_DESC", value.getValue());
	}


	public NString getPrimaryDesc(){
		NString v = new NString((String)this.getValue("PRIMARY_DESC"));
		return v;
	}


	
	// F2J_TODO : Item SOVLCUR_LMOD_CODE has the "Copy Value from Item" property defined, with value: S$_CURRICULA_SUMMARY.SUMMARY_CODE                  
	
	public void setSovlcurLmodCode(NString value){
		this.setValue("SOVLCUR_LMOD_CODE", value.getValue());
	}


	public NString getSovlcurLmodCode(){
		NString v = new NString((String)this.getValue("SOVLCUR_LMOD_CODE"));
		return v;
	}


	
	
	public void setSovlcurLmodDesc(NString value){
		this.setValue("SOVLCUR_LMOD_DESC", value.getValue());
	}


	public NString getSovlcurLmodDesc(){
		NString v = new NString((String)this.getValue("SOVLCUR_LMOD_DESC"));
		return v;
	}


	

	public void setROWID(byte[] bytes) {
		this.setROWID(DbManager.getDataBaseFactory().createRowid(bytes));
	}
 
	public void setROWID(java.sql.RowId rowId) {
		this.setValue(DAOConfiguration.MODEL_ROWID, rowId);
	}
	
}
