package  net.hedtech.banner.general.common.Gtvzipc.model;

import java.util.Date;
import java.math.BigDecimal;

import org.jdesktop.databuffer.DataRow;

import morphis.foundations.core.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.DAO;
import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appdatalayer.data.configuration.*;



public class GtvzipcBlockAdapter extends BaseRowAdapter{
	

	public GtvzipcBlockAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setGtvzipcUserId(NString value){
		this.setValue("GTVZIPC_USER_ID", value.getValue());
	}


	public NString getGtvzipcUserId(){
		NString v = new NString((String)this.getValue("GTVZIPC_USER_ID"));
		return v;
	}


	
	
	public void setGtvzipcCode(NString value){
		this.setValue("GTVZIPC_CODE", value.getValue());
	}


	public NString getGtvzipcCode(){
		NString v = new NString((String)this.getValue("GTVZIPC_CODE"));
		return v;
	}


	
	
	public void setGtvzipcCity(NString value){
		this.setValue("GTVZIPC_CITY", value.getValue());
	}


	public NString getGtvzipcCity(){
		NString v = new NString((String)this.getValue("GTVZIPC_CITY"));
		return v;
	}


	
	
	public void setGtvzipcCntyCode(NString value){
		this.setValue("GTVZIPC_CNTY_CODE", value.getValue());
	}


	public NString getGtvzipcCntyCode(){
		NString v = new NString((String)this.getValue("GTVZIPC_CNTY_CODE"));
		return v;
	}


	
	
	public void setGtvzipcStatCode(NString value){
		this.setValue("GTVZIPC_STAT_CODE", value.getValue());
	}


	public NString getGtvzipcStatCode(){
		NString v = new NString((String)this.getValue("GTVZIPC_STAT_CODE"));
		return v;
	}


	
	
	public void setGtvzipcNatnCode(NString value){
		this.setValue("GTVZIPC_NATN_CODE", value.getValue());
	}


	public NString getGtvzipcNatnCode(){
		NString v = new NString((String)this.getValue("GTVZIPC_NATN_CODE"));
		return v;
	}


	
	
	public void setGtvzipcActivityDate(NDate value){
		this.setValue("GTVZIPC_ACTIVITY_DATE", value.getValue());
	}


	public NDate getGtvzipcActivityDate(){
		NDate v = new NDate((Date)this.getValue("GTVZIPC_ACTIVITY_DATE"));
		return v;
	}


	

	public void setROWID(byte[] bytes) {
		this.setROWID(DbManager.getDataBaseFactory().createRowid(bytes));
	}
 
	public void setROWID(java.sql.RowId rowId) {
		this.setValue(DAOConfiguration.MODEL_ROWID, rowId);
	}
	
}
