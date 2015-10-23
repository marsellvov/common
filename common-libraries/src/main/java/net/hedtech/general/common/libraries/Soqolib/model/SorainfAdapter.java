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



public class SorainfAdapter extends BaseRowAdapter{
	

	public SorainfAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setAdminArolPidm(NNumber value){
		this.setValue("ADMIN_AROL_PIDM", value.getValue());
	}


	public NNumber getAdminArolPidm(){
		NNumber v = new NNumber((BigDecimal)this.getValue("ADMIN_AROL_PIDM"));
		return v;
	}


	
	
	public void setAdminId(NString value){
		this.setValue("ADMIN_ID", value.getValue());
	}


	public NString getAdminId(){
		NString v = new NString((String)this.getValue("ADMIN_ID"));
		return v;
	}


	
	
	public void setAdminName(NString value){
		this.setValue("ADMIN_NAME", value.getValue());
	}


	public NString getAdminName(){
		NString v = new NString((String)this.getValue("ADMIN_NAME"));
		return v;
	}


	
	
	public void setSorainfRadmCode(NString value){
		this.setValue("SORAINF_RADM_CODE", value.getValue());
	}


	public NString getSorainfRadmCode(){
		NString v = new NString((String)this.getValue("SORAINF_RADM_CODE"));
		return v;
	}


	
	
	public void setSorainfModule(NString value){
		this.setValue("SORAINF_MODULE", value.getValue());
	}


	public NString getSorainfModule(){
		NString v = new NString((String)this.getValue("SORAINF_MODULE"));
		return v;
	}


	
	
	public void setSorainfTermCode(NString value){
		this.setValue("SORAINF_TERM_CODE", value.getValue());
	}


	public NString getSorainfTermCode(){
		NString v = new NString((String)this.getValue("SORAINF_TERM_CODE"));
		return v;
	}


	
	
	public void setSorainfSourceInd(NString value){
		this.setValue("SORAINF_SOURCE_IND", value.getValue());
	}


	public NString getSorainfSourceInd(){
		NString v = new NString((String)this.getValue("SORAINF_SOURCE_IND"));
		return v;
	}


	
	
	public void setSorainfArolPidm(NNumber value){
		this.setValue("SORAINF_AROL_PIDM", value.getValue());
	}


	public NNumber getSorainfArolPidm(){
		NNumber v = new NNumber((BigDecimal)this.getValue("SORAINF_AROL_PIDM"));
		return v;
	}


	
	// F2J_TODO : Item SORAINF_PIDM has the "Copy Value from Item" property defined, with value: ADMIN_PIDM                  
	
	public void setSorainfPidm(NNumber value){
		this.setValue("SORAINF_PIDM", value.getValue());
	}


	public NNumber getSorainfPidm(){
		NNumber v = new NNumber((BigDecimal)this.getValue("SORAINF_PIDM"));
		return v;
	}


	
	
	public void setSorainfActivityDate(NDate value){
		this.setValue("SORAINF_ACTIVITY_DATE", value.getValue());
	}


	public NDate getSorainfActivityDate(){
		NDate v = new NDate((Date)this.getValue("SORAINF_ACTIVITY_DATE"));
		return v;
	}


	
	
	public void setAdminConfidInd(NString value){
		this.setValue("ADMIN_CONFID_IND", value.getValue());
	}


	public NString getAdminConfidInd(){
		NString v = new NString((String)this.getValue("ADMIN_CONFID_IND"));
		return v;
	}


	
	
	public void setAdminDcsdInd(NString value){
		this.setValue("ADMIN_DCSD_IND", value.getValue());
	}


	public NString getAdminDcsdInd(){
		NString v = new NString((String)this.getValue("ADMIN_DCSD_IND"));
		return v;
	}


	
	
	public void setSorainfSeqno(NNumber value){
		this.setValue("SORAINF_SEQNO", value.getValue());
	}


	public NNumber getSorainfSeqno(){
		NNumber v = new NNumber((BigDecimal)this.getValue("SORAINF_SEQNO"));
		return v;
	}


	
	
	public void setAdminSourceDesc(NString value){
		this.setValue("ADMIN_SOURCE_DESC", value.getValue());
	}


	public NString getAdminSourceDesc(){
		NString v = new NString((String)this.getValue("ADMIN_SOURCE_DESC"));
		return v;
	}


	

	public void setROWID(byte[] bytes) {
		this.setROWID(DbManager.getDataBaseFactory().createRowid(bytes));
	}
 
	public void setROWID(java.sql.RowId rowId) {
		this.setValue(DAOConfiguration.MODEL_ROWID, rowId);
	}
	
}
