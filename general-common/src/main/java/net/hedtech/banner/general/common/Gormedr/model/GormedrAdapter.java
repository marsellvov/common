package  net.hedtech.banner.general.common.Gormedr.model;

import java.util.Date;
import java.math.BigDecimal;

import org.jdesktop.databuffer.DataRow;

import morphis.foundations.core.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.DAO;
import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appdatalayer.data.configuration.*;



public class GormedrAdapter extends BaseRowAdapter{
	

	public GormedrAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		                  
	
	public void setGormedrMediCode(NString value){
		this.setValue("GORMEDR_MEDI_CODE", value.getValue());
	}


	public NString getGormedrMediCode(){
		NString v = new NString((String)this.getValue("GORMEDR_MEDI_CODE"));
		return v;
	}


	
	
	public void setGormedrDisaCode(NString value){
		this.setValue("GORMEDR_DISA_CODE", value.getValue());
	}


	public NString getGormedrDisaCode(){
		NString v = new NString((String)this.getValue("GORMEDR_DISA_CODE"));
		return v;
	}


	
	
	public void setDisaDesc(NString value){
		this.setValue("DISA_DESC", value.getValue());
	}


	public NString getDisaDesc(){
		NString v = new NString((String)this.getValue("DISA_DESC"));
		return v;
	}


	
	
	public void setGormedrDefaultInd(NString value){
		this.setValue("GORMEDR_DEFAULT_IND", value.getValue());
	}


	public NString getGormedrDefaultInd(){
		NString v = new NString((String)this.getValue("GORMEDR_DEFAULT_IND"));
		return v;
	}


	
	
	public void setGormedrUserId(NString value){
		this.setValue("GORMEDR_USER_ID", value.getValue());
	}


	public NString getGormedrUserId(){
		NString v = new NString((String)this.getValue("GORMEDR_USER_ID"));
		return v;
	}


	
	
	public void setGormedrActivityDate(NDate value){
		this.setValue("GORMEDR_ACTIVITY_DATE", value.getValue());
	}


	public NDate getGormedrActivityDate(){
		NDate v = new NDate((Date)this.getValue("GORMEDR_ACTIVITY_DATE"));
		return v;
	}


	

	public void setROWID(byte[] bytes) {
		this.setROWID(DbManager.getDataBaseFactory().createRowid(bytes));
	}
 
	public void setROWID(java.sql.RowId rowId) {
		this.setValue(DAOConfiguration.MODEL_ROWID, rowId);
	}
	
}
