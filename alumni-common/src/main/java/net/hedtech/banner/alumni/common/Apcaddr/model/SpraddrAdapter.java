package  net.hedtech.banner.alumni.common.Apcaddr.model;

import java.util.Date;
import java.math.BigDecimal;
import org.jdesktop.databuffer.DataRow;
import morphis.foundations.flavors.forms.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.DAO;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appdatalayer.data.configuration.*;



public class SpraddrAdapter extends BaseRowAdapter{
	

	public SpraddrAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	public void setSpraddrPidm(NNumber value){
		this.setValue("SPRADDR_PIDM", value.getValue());
	}


	public NNumber getSpraddrPidm(){
		NNumber v = new NNumber((BigDecimal)this.getValue("SPRADDR_PIDM"));
		return v;
	}


	
	
	public void setSpraddrAtypCode(NString value){
		this.setValue("SPRADDR_ATYP_CODE", value.getValue());
	}


	public NString getSpraddrAtypCode(){
		NString v = new NString((String)this.getValue("SPRADDR_ATYP_CODE"));
		return v;
	}


	
	
	public void setSpraddrSeqno(NNumber value){
		this.setValue("SPRADDR_SEQNO", value.getValue());
	}


	public NNumber getSpraddrSeqno(){
		NNumber v = new NNumber((BigDecimal)this.getValue("SPRADDR_SEQNO"));
		return v;
	}


	
	
	public void setSpraddrAsrcCode(NString value){
		this.setValue("SPRADDR_ASRC_CODE", value.getValue());
	}


	public NString getSpraddrAsrcCode(){
		NString v = new NString((String)this.getValue("SPRADDR_ASRC_CODE"));
		return v;
	}


	
	
	public void setSpraddrHouseNumber(NString value){
		this.setValue("SPRADDR_HOUSE_NUMBER", value.getValue());
	}


	public NString getSpraddrHouseNumber(){
		NString v = new NString((String)this.getValue("SPRADDR_HOUSE_NUMBER"));
		return v;
	}


	
	
	public void setSpraddrStreetLine1(NString value){
		this.setValue("SPRADDR_STREET_LINE1", value.getValue());
	}


	public NString getSpraddrStreetLine1(){
		NString v = new NString((String)this.getValue("SPRADDR_STREET_LINE1"));
		return v;
	}


	
	
	public void setSpraddrStreetLine2(NString value){
		this.setValue("SPRADDR_STREET_LINE2", value.getValue());
	}


	public NString getSpraddrStreetLine2(){
		NString v = new NString((String)this.getValue("SPRADDR_STREET_LINE2"));
		return v;
	}


	
	
	public void setSpraddrStreetLine3(NString value){
		this.setValue("SPRADDR_STREET_LINE3", value.getValue());
	}


	public NString getSpraddrStreetLine3(){
		NString v = new NString((String)this.getValue("SPRADDR_STREET_LINE3"));
		return v;
	}


	
	
	public void setSpraddrStreetLine4(NString value){
		this.setValue("SPRADDR_STREET_LINE4", value.getValue());
	}


	public NString getSpraddrStreetLine4(){
		NString v = new NString((String)this.getValue("SPRADDR_STREET_LINE4"));
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


	
	
	public void setSpraddrNatnCode(NString value){
		this.setValue("SPRADDR_NATN_CODE", value.getValue());
	}


	public NString getSpraddrNatnCode(){
		NString v = new NString((String)this.getValue("SPRADDR_NATN_CODE"));
		return v;
	}


	
	
	public void setNatnDesc(NString value){
		this.setValue("NATN_DESC", value.getValue());
	}


	public NString getNatnDesc(){
		NString v = new NString((String)this.getValue("NATN_DESC"));
		return v;
	}


	
	
	public void setSpraddrFromDate(NDate value){
		this.setValue("SPRADDR_FROM_DATE", value.getValue());
	}


	public NDate getSpraddrFromDate(){
		NDate v = new NDate((Date)this.getValue("SPRADDR_FROM_DATE"));
		return v;
	}


	
	
	public void setSpraddrStatusInd(NString value){
		this.setValue("SPRADDR_STATUS_IND", value.getValue());
	}


	public NString getSpraddrStatusInd(){
		NString v = new NString((String)this.getValue("SPRADDR_STATUS_IND"));
		return v;
	}


	
	
	public void setSpraddrToDate(NDate value){
		this.setValue("SPRADDR_TO_DATE", value.getValue());
	}


	public NDate getSpraddrToDate(){
		NDate v = new NDate((Date)this.getValue("SPRADDR_TO_DATE"));
		return v;
	}


	

	
}
