package  net.hedtech.banner.general.common.Goamtch.model;

import java.util.Date;
import java.math.BigDecimal;

import org.jdesktop.databuffer.DataRow;

import morphis.foundations.core.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.DAO;
import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appdatalayer.data.configuration.*;



public class GorcmspAdapter extends BaseRowAdapter{
	

	public GorcmspAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setGorcmspCmscCode(NString value){
		this.setValue("GORCMSP_CMSC_CODE", value.getValue());
	}


	public NString getGorcmspCmscCode(){
		NString v = new NString((String)this.getValue("GORCMSP_CMSC_CODE"));
		return v;
	}


	
	
	public void setGorcmspPriorityNo(NNumber value){
		this.setValue("GORCMSP_PRIORITY_NO", value.getValue());
	}


	public NNumber getGorcmspPriorityNo(){
		NNumber v = new NNumber((BigDecimal)this.getValue("GORCMSP_PRIORITY_NO"));
		return v;
	}


	
	
	public void setGorcmspDesc(NString value){
		this.setValue("GORCMSP_DESC", value.getValue());
	}


	public NString getGorcmspDesc(){
		NString v = new NString((String)this.getValue("GORCMSP_DESC"));
		return v;
	}


	
	
	public void setGorcmspLongDesc(NString value){
		this.setValue("GORCMSP_LONG_DESC", value.getValue());
	}


	public NString getGorcmspLongDesc(){
		NString v = new NString((String)this.getValue("GORCMSP_LONG_DESC"));
		return v;
	}


	
	
	public void setLongDesc(NString value){
		this.setValue("LONG_DESC", value.getValue());
	}


	public NString getLongDesc(){
		NString v = new NString((String)this.getValue("LONG_DESC"));
		return v;
	}


	

	public void setROWID(byte[] bytes) {
		this.setROWID(DbManager.getDataBaseFactory().createRowid(bytes));
	}
 
	public void setROWID(java.sql.RowId rowId) {
		this.setValue(DAOConfiguration.MODEL_ROWID, rowId);
	}
	
}
