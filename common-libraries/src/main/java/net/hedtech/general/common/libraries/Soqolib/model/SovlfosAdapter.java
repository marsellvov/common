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



public class SovlfosAdapter extends BaseRowAdapter{
	

	public SovlfosAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	// F2J_TODO : Item SOVLFOS_LCUR_SEQNO has the "Copy Value from Item" property defined, with value: SOVLCUR.SOVLCUR_SEQNO                  
	
	public void setSovlfosLcurSeqno(NNumber value){
		this.setValue("SOVLFOS_LCUR_SEQNO", value.getValue());
	}


	public NNumber getSovlfosLcurSeqno(){
		NNumber v = new NNumber((BigDecimal)this.getValue("SOVLFOS_LCUR_SEQNO"));
		return v;
	}


	
	// F2J_TODO : Item sovlfos_pidm has the "Copy Value from Item" property defined, with value: SOVLCUR.SOVLCUR_PIDM                  
	
	public void setSovlfosPidm(NNumber value){
		this.setValue("sovlfos_pidm", value.getValue());
	}


	public NNumber getSovlfosPidm(){
		NNumber v = new NNumber((BigDecimal)this.getValue("sovlfos_pidm"));
		return v;
	}


	
	
	public void setSovlfosPriorityNo(NNumber value){
		this.setValue("SOVLFOS_PRIORITY_NO", value.getValue());
	}


	public NNumber getSovlfosPriorityNo(){
		NNumber v = new NNumber((BigDecimal)this.getValue("SOVLFOS_PRIORITY_NO"));
		return v;
	}


	
	
	public void setSovlfosTermCode(NString value){
		this.setValue("SOVLFOS_TERM_CODE", value.getValue());
	}


	public NString getSovlfosTermCode(){
		NString v = new NString((String)this.getValue("SOVLFOS_TERM_CODE"));
		return v;
	}


	
	
	public void setSovlfosLfstCode(NString value){
		this.setValue("SOVLFOS_LFST_CODE", value.getValue());
	}


	public NString getSovlfosLfstCode(){
		NString v = new NString((String)this.getValue("SOVLFOS_LFST_CODE"));
		return v;
	}


	
	
	public void setSovlfosMajrCode(NString value){
		this.setValue("SOVLFOS_MAJR_CODE", value.getValue());
	}


	public NString getSovlfosMajrCode(){
		NString v = new NString((String)this.getValue("SOVLFOS_MAJR_CODE"));
		return v;
	}


	
	
	public void setSovlfosDeptCode(NString value){
		this.setValue("SOVLFOS_DEPT_CODE", value.getValue());
	}


	public NString getSovlfosDeptCode(){
		NString v = new NString((String)this.getValue("SOVLFOS_DEPT_CODE"));
		return v;
	}


	
	
	public void setSovlfosConcAttachMajrCode(NString value){
		this.setValue("SOVLFOS_MAJR_CODE_attach", value.getValue());
	}


	public NString getSovlfosConcAttachMajrCode(){
		NString v = new NString((String)this.getValue("SOVLFOS_MAJR_CODE_attach"));
		return v;
	}


	
	
	public void setSovlfosTermCodeCtlg(NString value){
		this.setValue("SOVLFOS_TERM_CODE_CTLG", value.getValue());
	}


	public NString getSovlfosTermCodeCtlg(){
		NString v = new NString((String)this.getValue("SOVLFOS_TERM_CODE_CTLG"));
		return v;
	}


	
	
	public void setGtvlfstDesc(NString value){
		this.setValue("GTVLFST_DESC", value.getValue());
	}


	public NString getGtvlfstDesc(){
		NString v = new NString((String)this.getValue("GTVLFST_DESC"));
		return v;
	}


	
	
	public void setStvmajrDesc(NString value){
		this.setValue("STVMAJR_DESC", value.getValue());
	}


	public NString getStvmajrDesc(){
		NString v = new NString((String)this.getValue("STVMAJR_DESC"));
		return v;
	}


	
	
	public void setStvdeptDesc(NString value){
		this.setValue("STVDEPT_DESC", value.getValue());
	}


	public NString getStvdeptDesc(){
		NString v = new NString((String)this.getValue("STVDEPT_DESC"));
		return v;
	}


	
	
	public void setStvconcDesc(NString value){
		this.setValue("STVCONC_DESC", value.getValue());
	}


	public NString getStvconcDesc(){
		NString v = new NString((String)this.getValue("STVCONC_DESC"));
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
