package  net.hedtech.banner.finance.common.Fomusor.model;

import java.util.Date;
import java.math.BigDecimal;

import org.jdesktop.databuffer.DataRow;

import morphis.foundations.core.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.DAO;
import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appdatalayer.data.configuration.*;



public class ForusorDummyAdapter extends BaseRowAdapter{
	

	public ForusorDummyAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setForusorUserIdEntered(NString value){
		this.setValue("FORUSOR_USER_ID_ENTERED", value.getValue());
	}


	public NString getForusorUserIdEntered(){
		NString v = new NString((String)this.getValue("FORUSOR_USER_ID_ENTERED"));
		return v;
	}


	
	
	public void setForusorCoasCode(NString value){
		this.setValue("FORUSOR_COAS_CODE", value.getValue());
	}


	public NString getForusorCoasCode(){
		NString v = new NString((String)this.getValue("FORUSOR_COAS_CODE"));
		return v;
	}


	
	
	public void setForusorOrgnCode(NString value){
		this.setValue("FORUSOR_ORGN_CODE", value.getValue());
	}


	public NString getForusorOrgnCode(){
		NString v = new NString((String)this.getValue("FORUSOR_ORGN_CODE"));
		return v;
	}


	
	
	public void setForusorAccessInd(NString value){
		this.setValue("FORUSOR_ACCESS_IND", value.getValue());
	}


	public NString getForusorAccessInd(){
		NString v = new NString((String)this.getValue("FORUSOR_ACCESS_IND"));
		return v;
	}


	
	
	public void setForusorWbudAccessInd(NString value){
		this.setValue("FORUSOR_WBUD_ACCESS_IND", value.getValue());
	}


	public NString getForusorWbudAccessInd(){
		NString v = new NString((String)this.getValue("FORUSOR_WBUD_ACCESS_IND"));
		return v;
	}


	
	
	public void setForusorActivityDate(NDate value){
		this.setValue("FORUSOR_ACTIVITY_DATE", value.getValue());
	}


	public NDate getForusorActivityDate(){
		NDate v = new NDate((Date)this.getValue("FORUSOR_ACTIVITY_DATE"));
		return v;
	}


	
	
	public void setForusorUserId(NString value){
		this.setValue("FORUSOR_USER_ID", value.getValue());
	}


	public NString getForusorUserId(){
		NString v = new NString((String)this.getValue("FORUSOR_USER_ID"));
		return v;
	}


	
	
	public void setDummy(NString value){
		this.setValue("DUMMY", value.getValue());
	}


	public NString getDummy(){
		NString v = new NString((String)this.getValue("DUMMY"));
		return v;
	}


	

	public void setROWID(byte[] bytes) {
		this.setROWID(DbManager.getDataBaseFactory().createRowid(bytes));
	}
 
	public void setROWID(java.sql.RowId rowId) {
		this.setValue(DAOConfiguration.MODEL_ROWID, rowId);
	}
	
}
