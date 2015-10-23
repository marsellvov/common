package  net.hedtech.banner.general.common.Soaidns.model;

import java.util.Date;
import java.math.BigDecimal;

import org.jdesktop.databuffer.DataRow;

import morphis.foundations.core.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.DAO;
import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appdatalayer.data.configuration.*;



public class SpraddrAdapter extends BaseRowAdapter{
	

	public SpraddrAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setSpraddrAtypCode(NString value){
		this.setValue("SPRADDR_ATYP_CODE", value.getValue());
	}


	public NString getSpraddrAtypCode(){
		NString v = new NString((String)this.getValue("SPRADDR_ATYP_CODE"));
		return v;
	}


	
	
	public void setSpraddrStreetLine1(NString value){
		this.setValue("SPRADDR_STREET_LINE1", value.getValue());
	}


	public NString getSpraddrStreetLine1(){
		NString v = new NString((String)this.getValue("SPRADDR_STREET_LINE1"));
		return v;
	}


	
	
	public void setSpraddrCity(NString value){
		this.setValue("SPRADDR_CITY", value.getValue());
	}


	public NString getSpraddrCity(){
		NString v = new NString((String)this.getValue("SPRADDR_CITY"));
		return v;
	}


	
	
	public void setSpraddrStatCode(NString value){
		this.setValue("SPRADDR_STAT_CODE", value.getValue());
	}


	public NString getSpraddrStatCode(){
		NString v = new NString((String)this.getValue("SPRADDR_STAT_CODE"));
		return v;
	}


	
	
	public void setSpraddrZip(NString value){
		this.setValue("SPRADDR_ZIP", value.getValue());
	}


	public NString getSpraddrZip(){
		NString v = new NString((String)this.getValue("SPRADDR_ZIP"));
		return v;
	}


	
	
	public void setPhoneArea(NString value){
		this.setValue("PHONE_AREA", value.getValue());
	}


	public NString getPhoneArea(){
		NString v = new NString((String)this.getValue("PHONE_AREA"));
		return v;
	}


	
	
	public void setPhoneNumber(NString value){
		this.setValue("PHONE_NUMBER", value.getValue());
	}


	public NString getPhoneNumber(){
		NString v = new NString((String)this.getValue("PHONE_NUMBER"));
		return v;
	}


	
	
	public void setSpraddrFromDate(NDate value){
		this.setValue("SPRADDR_FROM_DATE", value.getValue());
	}


	public NDate getSpraddrFromDate(){
		NDate v = new NDate((Date)this.getValue("SPRADDR_FROM_DATE"));
		return v;
	}


	
	
	public void setSpraddrToDate(NDate value){
		this.setValue("SPRADDR_TO_DATE", value.getValue());
	}


	public NDate getSpraddrToDate(){
		NDate v = new NDate((Date)this.getValue("SPRADDR_TO_DATE"));
		return v;
	}


	
	
	public void setSpraddrStatusInd(NString value){
		this.setValue("SPRADDR_STATUS_IND", value.getValue());
	}


	public NString getSpraddrStatusInd(){
		NString v = new NString((String)this.getValue("SPRADDR_STATUS_IND"));
		return v;
	}


	
	
	public void setSpraddrSeqno(NNumber value){
		this.setValue("SPRADDR_SEQNO", value.getValue());
	}


	public NNumber getSpraddrSeqno(){
		NNumber v = new NNumber((BigDecimal)this.getValue("SPRADDR_SEQNO"));
		return v;
	}


	

	public void setROWID(byte[] bytes) {
		this.setROWID(DbManager.getDataBaseFactory().createRowid(bytes));
	}
 
	public void setROWID(java.sql.RowId rowId) {
		this.setValue(DAOConfiguration.MODEL_ROWID, rowId);
	}
	
}
