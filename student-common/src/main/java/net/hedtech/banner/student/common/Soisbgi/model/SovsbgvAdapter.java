package  net.hedtech.banner.student.common.Soisbgi.model;

import java.util.Date;
import java.math.BigDecimal;
import org.jdesktop.databuffer.DataRow;
import morphis.foundations.flavors.forms.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.DAO;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appdatalayer.data.configuration.*;



public class SovsbgvAdapter extends BaseRowAdapter{
	

	public SovsbgvAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setSovsbgvActivityDate(NDate value){
		this.setValue("SOVSBGV_ACTIVITY_DATE", value.getValue());
	}


	public NDate getSovsbgvActivityDate(){
		NDate v = new NDate((Date)this.getValue("SOVSBGV_ACTIVITY_DATE"));
		return v;
	}


	
	
	public void setSovsbgvTypeInd(NString value){
		this.setValue("SOVSBGV_TYPE_IND", value.getValue());
	}


	public NString getSovsbgvTypeInd(){
		NString v = new NString((String)this.getValue("SOVSBGV_TYPE_IND"));
		return v;
	}


	
	
	public void setSovsbgvCode(NString value){
		this.setValue("SOVSBGV_CODE", value.getValue());
	}


	public NString getSovsbgvCode(){
		NString v = new NString((String)this.getValue("SOVSBGV_CODE"));
		return v;
	}


	
	
	public void setSovsbgvDesc(NString value){
		this.setValue("SOVSBGV_DESC", value.getValue());
	}


	public NString getSovsbgvDesc(){
		NString v = new NString((String)this.getValue("SOVSBGV_DESC"));
		return v;
	}


	
	
	public void setSovsbgvCity(NString value){
		this.setValue("SOVSBGV_CITY", value.getValue());
	}


	public NString getSovsbgvCity(){
		NString v = new NString((String)this.getValue("SOVSBGV_CITY"));
		return v;
	}


	
	
	public void setSovsbgvStatCode(NString value){
		this.setValue("SOVSBGV_STAT_CODE", value.getValue());
	}


	public NString getSovsbgvStatCode(){
		NString v = new NString((String)this.getValue("SOVSBGV_STAT_CODE"));
		return v;
	}


	
	
	public void setSovsbgvAdmrCode(NString value){
		this.setValue("SOVSBGV_ADMR_CODE", value.getValue());
	}


	public NString getSovsbgvAdmrCode(){
		NString v = new NString((String)this.getValue("SOVSBGV_ADMR_CODE"));
		return v;
	}


	

	
}
