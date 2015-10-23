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



public class SgrstspAdapter extends BaseRowAdapter{
	

	public SgrstspAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setSgrstspPidm(NNumber value){
		this.setValue("SGRSTSP_PIDM", value.getValue());
	}


	public NNumber getSgrstspPidm(){
		NNumber v = new NNumber((BigDecimal)this.getValue("SGRSTSP_PIDM"));
		return v;
	}


	
	
	public void setSgrstspTermCodeEff(NString value){
		this.setValue("SGRSTSP_TERM_CODE_EFF", value.getValue());
	}


	public NString getSgrstspTermCodeEff(){
		NString v = new NString((String)this.getValue("SGRSTSP_TERM_CODE_EFF"));
		return v;
	}


	
	
	public void setEndStspTerm(NString value){
		this.setValue("END_STSP_TERM", value.getValue());
	}


	public NString getEndStspTerm(){
		NString v = new NString((String)this.getValue("END_STSP_TERM"));
		return v;
	}


	
	
	public void setSgrstspKeySeqno(NNumber value){
		this.setValue("SGRSTSP_KEY_SEQNO", value.getValue());
	}


	public NNumber getSgrstspKeySeqno(){
		NNumber v = new NNumber((BigDecimal)this.getValue("SGRSTSP_KEY_SEQNO"));
		return v;
	}


	
	
	public void setSgrstspName(NString value){
		this.setValue("SGRSTSP_NAME", value.getValue());
	}


	public NString getSgrstspName(){
		NString v = new NString((String)this.getValue("SGRSTSP_NAME"));
		return v;
	}


	
	
	public void setSgrstspStspCode(NString value){
		this.setValue("SGRSTSP_STSP_CODE", value.getValue());
	}


	public NString getSgrstspStspCode(){
		NString v = new NString((String)this.getValue("SGRSTSP_STSP_CODE"));
		return v;
	}


	
	
	public void setSgrstspStspDesc(NString value){
		this.setValue("SGRSTSP_STSP_CODE", value.getValue());
	}


	public NString getSgrstspStspDesc(){
		NString v = new NString((String)this.getValue("SGRSTSP_STSP_CODE"));
		return v;
	}


	
	
	public void setSgrstspAstdCode(NString value){
		this.setValue("SGRSTSP_ASTD_CODE", value.getValue());
	}


	public NString getSgrstspAstdCode(){
		NString v = new NString((String)this.getValue("SGRSTSP_ASTD_CODE"));
		return v;
	}


	
	
	public void setSgrstspAstdDesc(NString value){
		this.setValue("SGRSTSP_STSP_CODE", value.getValue());
	}


	public NString getSgrstspAstdDesc(){
		NString v = new NString((String)this.getValue("SGRSTSP_STSP_CODE"));
		return v;
	}


	
	
	public void setSgrstspPrevCode(NString value){
		this.setValue("SGRSTSP_PREV_CODE", value.getValue());
	}


	public NString getSgrstspPrevCode(){
		NString v = new NString((String)this.getValue("SGRSTSP_PREV_CODE"));
		return v;
	}


	
	
	public void setSgrstspPrevDesc(NString value){
		this.setValue("SGRSTSP_STSP_CODE", value.getValue());
	}


	public NString getSgrstspPrevDesc(){
		NString v = new NString((String)this.getValue("SGRSTSP_STSP_CODE"));
		return v;
	}


	
	
	public void setSgrstspCastCode(NString value){
		this.setValue("SGRSTSP_CAST_CODE", value.getValue());
	}


	public NString getSgrstspCastCode(){
		NString v = new NString((String)this.getValue("SGRSTSP_CAST_CODE"));
		return v;
	}


	
	
	public void setSgrstspCastDesc(NString value){
		this.setValue("SGRSTSP_STSP_CODE", value.getValue());
	}


	public NString getSgrstspCastDesc(){
		NString v = new NString((String)this.getValue("SGRSTSP_STSP_CODE"));
		return v;
	}


	
	
	public void setSgrstspResdCode(NString value){
		this.setValue("SGRSTSP_RESD_CODE", value.getValue());
	}


	public NString getSgrstspResdCode(){
		NString v = new NString((String)this.getValue("SGRSTSP_RESD_CODE"));
		return v;
	}


	
	
	public void setSgrstspResdDesc(NString value){
		this.setValue("SGRSTSP_STSP_CODE", value.getValue());
	}


	public NString getSgrstspResdDesc(){
		NString v = new NString((String)this.getValue("SGRSTSP_STSP_CODE"));
		return v;
	}


	
	
	public void setSgrstspBlckCode(NString value){
		this.setValue("SGRSTSP_BLCK_CODE", value.getValue());
	}


	public NString getSgrstspBlckCode(){
		NString v = new NString((String)this.getValue("SGRSTSP_BLCK_CODE"));
		return v;
	}


	
	
	public void setSgrstspBlckDesc(NString value){
		this.setValue("SGRSTSP_STSP_CODE", value.getValue());
	}


	public NString getSgrstspBlckDesc(){
		NString v = new NString((String)this.getValue("SGRSTSP_STSP_CODE"));
		return v;
	}


	
	
	public void setSgrstspFullPartInd(NString value){
		this.setValue("SGRSTSP_FULL_PART_IND", value.getValue());
	}


	public NString getSgrstspFullPartInd(){
		NString v = new NString((String)this.getValue("SGRSTSP_FULL_PART_IND"));
		return v;
	}


	
	
	public void setSgrstspSessCode(NString value){
		this.setValue("SGRSTSP_SESS_CODE", value.getValue());
	}


	public NString getSgrstspSessCode(){
		NString v = new NString((String)this.getValue("SGRSTSP_SESS_CODE"));
		return v;
	}


	
	
	public void setSgrstspSessDesc(NString value){
		this.setValue("SGRSTSP_STSP_CODE", value.getValue());
	}


	public NString getSgrstspSessDesc(){
		NString v = new NString((String)this.getValue("SGRSTSP_STSP_CODE"));
		return v;
	}


	
	
	public void setSgrstspBsklCode(NString value){
		this.setValue("SGRSTSP_BSKL_CODE", value.getValue());
	}


	public NString getSgrstspBsklCode(){
		NString v = new NString((String)this.getValue("SGRSTSP_BSKL_CODE"));
		return v;
	}


	
	
	public void setSgrstspBsklDesc(NString value){
		this.setValue("SGRSTSP_BSKL_DESC", value.getValue());
	}


	public NString getSgrstspBsklDesc(){
		NString v = new NString((String)this.getValue("SGRSTSP_BSKL_DESC"));
		return v;
	}


	
	
	public void setSgrstspPracCode(NString value){
		this.setValue("SGRSTSP_PRAC_CODE", value.getValue());
	}


	public NString getSgrstspPracCode(){
		NString v = new NString((String)this.getValue("SGRSTSP_PRAC_CODE"));
		return v;
	}


	
	
	public void setSgrstspPracDesc(NString value){
		this.setValue("SGRSTSP_PRAC_DESC", value.getValue());
	}


	public NString getSgrstspPracDesc(){
		NString v = new NString((String)this.getValue("SGRSTSP_PRAC_DESC"));
		return v;
	}


	
	
	public void setSgrstspOrsnCode(NString value){
		this.setValue("SGRSTSP_ORSN_CODE", value.getValue());
	}


	public NString getSgrstspOrsnCode(){
		NString v = new NString((String)this.getValue("SGRSTSP_ORSN_CODE"));
		return v;
	}


	
	
	public void setSgrstspOrsnDesc(NString value){
		this.setValue("SGRSTSP_ORSN_DESC", value.getValue());
	}


	public NString getSgrstspOrsnDesc(){
		NString v = new NString((String)this.getValue("SGRSTSP_ORSN_DESC"));
		return v;
	}


	
	
	public void setSgrstspCaplCode(NString value){
		this.setValue("SGRSTSP_CAPL_CODE", value.getValue());
	}


	public NString getSgrstspCaplCode(){
		NString v = new NString((String)this.getValue("SGRSTSP_CAPL_CODE"));
		return v;
	}


	
	
	public void setSgrstspCaplDesc(NString value){
		this.setValue("SGRSTSP_CAPL_DESC", value.getValue());
	}


	public NString getSgrstspCaplDesc(){
		NString v = new NString((String)this.getValue("SGRSTSP_CAPL_DESC"));
		return v;
	}


	
	
	public void setSgrstspEdlvCode(NString value){
		this.setValue("SGRSTSP_EDLV_CODE", value.getValue());
	}


	public NString getSgrstspEdlvCode(){
		NString v = new NString((String)this.getValue("SGRSTSP_EDLV_CODE"));
		return v;
	}


	
	
	public void setSgrstspEdlvDesc(NString value){
		this.setValue("SGRSTSP_EDLV_DESC", value.getValue());
	}


	public NString getSgrstspEdlvDesc(){
		NString v = new NString((String)this.getValue("SGRSTSP_EDLV_DESC"));
		return v;
	}


	
	
	public void setSgrstspEmexCode(NString value){
		this.setValue("SGRSTSP_EMEX_CODE", value.getValue());
	}


	public NString getSgrstspEmexCode(){
		NString v = new NString((String)this.getValue("SGRSTSP_EMEX_CODE"));
		return v;
	}


	
	
	public void setSgrstspEmexDesc(NString value){
		this.setValue("SGRSTSP_EMEX_DESC", value.getValue());
	}


	public NString getSgrstspEmexDesc(){
		NString v = new NString((String)this.getValue("SGRSTSP_EMEX_DESC"));
		return v;
	}


	
	
	public void setSgrstspTrcnCode(NString value){
		this.setValue("SGRSTSP_TRCN_CODE", value.getValue());
	}


	public NString getSgrstspTrcnCode(){
		NString v = new NString((String)this.getValue("SGRSTSP_TRCN_CODE"));
		return v;
	}


	
	
	public void setSgrstspTrcnDesc(NString value){
		this.setValue("SGRSTSP_TRCN_DESC", value.getValue());
	}


	public NString getSgrstspTrcnDesc(){
		NString v = new NString((String)this.getValue("SGRSTSP_TRCN_DESC"));
		return v;
	}


	
	
	public void setSgrstspVoedCode(NString value){
		this.setValue("SGRSTSP_VOED_CODE", value.getValue());
	}


	public NString getSgrstspVoedCode(){
		NString v = new NString((String)this.getValue("SGRSTSP_VOED_CODE"));
		return v;
	}


	
	
	public void setSgrstspVoedDesc(NString value){
		this.setValue("SGRSTSP_VOED_DESC", value.getValue());
	}


	public NString getSgrstspVoedDesc(){
		NString v = new NString((String)this.getValue("SGRSTSP_VOED_DESC"));
		return v;
	}


	
	
	public void setSgrstspEgolCode(NString value){
		this.setValue("SGRSTSP_EGOL_CODE", value.getValue());
	}


	public NString getSgrstspEgolCode(){
		NString v = new NString((String)this.getValue("SGRSTSP_EGOL_CODE"));
		return v;
	}


	
	
	public void setSgrstspEgolDesc(NString value){
		this.setValue("SGRSTSP_EGOL_DESC", value.getValue());
	}


	public NString getSgrstspEgolDesc(){
		NString v = new NString((String)this.getValue("SGRSTSP_EGOL_DESC"));
		return v;
	}


	
	
	public void setSgrstspAprnCode(NString value){
		this.setValue("SGRSTSP_APRN_CODE", value.getValue());
	}


	public NString getSgrstspAprnCode(){
		NString v = new NString((String)this.getValue("SGRSTSP_APRN_CODE"));
		return v;
	}


	
	
	public void setSgrstspAprnDesc(NString value){
		this.setValue("SGRSTSP_APRN_DESC", value.getValue());
	}


	public NString getSgrstspAprnDesc(){
		NString v = new NString((String)this.getValue("SGRSTSP_APRN_DESC"));
		return v;
	}


	
	
	public void setSgrstspGainCode(NString value){
		this.setValue("SGRSTSP_GAIN_CODE", value.getValue());
	}


	public NString getSgrstspGainCode(){
		NString v = new NString((String)this.getValue("SGRSTSP_GAIN_CODE"));
		return v;
	}


	
	
	public void setSgrstspGainDesc(NString value){
		this.setValue("SGRSTSP_GAIN_DESC", value.getValue());
	}


	public NString getSgrstspGainDesc(){
		NString v = new NString((String)this.getValue("SGRSTSP_GAIN_DESC"));
		return v;
	}


	
	
	public void setSgrstspIncmCode(NString value){
		this.setValue("SGRSTSP_INCM_CODE", value.getValue());
	}


	public NString getSgrstspIncmCode(){
		NString v = new NString((String)this.getValue("SGRSTSP_INCM_CODE"));
		return v;
	}


	
	
	public void setSgrstspIncmDesc(NString value){
		this.setValue("SGRSTSP_INCM_DESC", value.getValue());
	}


	public NString getSgrstspIncmDesc(){
		NString v = new NString((String)this.getValue("SGRSTSP_INCM_DESC"));
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
