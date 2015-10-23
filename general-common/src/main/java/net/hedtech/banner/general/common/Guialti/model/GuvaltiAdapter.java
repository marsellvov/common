package  net.hedtech.banner.general.common.Guialti.model;

import java.util.Date;
import java.math.BigDecimal;

import org.jdesktop.databuffer.DataRow;

import morphis.foundations.core.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.DAO;
import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appdatalayer.data.configuration.*;



public class GuvaltiAdapter extends BaseRowAdapter{
	

	public GuvaltiAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setGuvaltiSsn(NString value){
		this.setValue("GUVALTI_SSN", value.getValue());
	}


	public NString getGuvaltiSsn(){
		NString v = new NString((String)this.getValue("GUVALTI_SSN"));
		return v;
	}


	
	
	public void setGuvaltiPidm(NNumber value){
		this.setValue("GUVALTI_PIDM", value.getValue());
	}


	public NNumber getGuvaltiPidm(){
		NNumber v = new NNumber((BigDecimal)this.getValue("GUVALTI_PIDM"));
		return v;
	}


	
	
	public void setGuvaltiId(NString value){
		this.setValue("GUVALTI_ID", value.getValue());
	}


	public NString getGuvaltiId(){
		NString v = new NString((String)this.getValue("GUVALTI_ID"));
		return v;
	}


	
	
	public void setGuvaltiEntityInd(NString value){
		this.setValue("GUVALTI_ENTITY_IND", value.getValue());
	}


	public NString getGuvaltiEntityInd(){
		NString v = new NString((String)this.getValue("GUVALTI_ENTITY_IND"));
		return v;
	}


	
	
	public void setGuvaltiLastName(NString value){
		this.setValue("GUVALTI_LAST_NAME", value.getValue());
	}


	public NString getGuvaltiLastName(){
		NString v = new NString((String)this.getValue("GUVALTI_LAST_NAME"));
		return v;
	}


	
	
	public void setGuvaltiFirstName(NString value){
		this.setValue("GUVALTI_FIRST_NAME", value.getValue());
	}


	public NString getGuvaltiFirstName(){
		NString v = new NString((String)this.getValue("GUVALTI_FIRST_NAME"));
		return v;
	}


	
	
	public void setGuvaltiMi(NString value){
		this.setValue("GUVALTI_MI", value.getValue());
	}


	public NString getGuvaltiMi(){
		NString v = new NString((String)this.getValue("GUVALTI_MI"));
		return v;
	}


	
	
	public void setGuvaltiShowBirthday(NString value){
		this.setValue("GUVALTI_SHOW_BIRTHDAY", value.getValue());
	}


	public NString getGuvaltiShowBirthday(){
		NString v = new NString((String)this.getValue("GUVALTI_SHOW_BIRTHDAY"));
		return v;
	}


	
	
	public void setGuvaltiBirthDate(NDate value){
		this.setValue("GUVALTI_BIRTH_DATE", value.getValue());
	}


	public NDate getGuvaltiBirthDate(){
		NDate v = new NDate((Date)this.getValue("GUVALTI_BIRTH_DATE"));
		return v;
	}


	
	
	public void setGuvaltiChangeInd(NString value){
		this.setValue("GUVALTI_CHANGE_IND", value.getValue());
	}


	public NString getGuvaltiChangeInd(){
		NString v = new NString((String)this.getValue("GUVALTI_CHANGE_IND"));
		return v;
	}


	

	public void setROWID(byte[] bytes) {
		this.setROWID(DbManager.getDataBaseFactory().createRowid(bytes));
	}
 
	public void setROWID(java.sql.RowId rowId) {
		this.setValue(DAOConfiguration.MODEL_ROWID, rowId);
	}
	
}
