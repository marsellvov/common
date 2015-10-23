package  net.hedtech.banner.finance.common.Fragrnt.model;

import java.util.Date;
import java.math.BigDecimal;

import org.jdesktop.databuffer.DataRow;

import morphis.foundations.core.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.DAO;
import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appdatalayer.data.configuration.*;



public class FrrgusnAdapter extends BaseRowAdapter{
	

	public FrrgusnAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setFrrgusnSdatCodeAttr(NString value){
		this.setValue("FRRGUSN_SDAT_CODE_ATTR", value.getValue());
	}


	public NString getFrrgusnSdatCodeAttr(){
		NString v = new NString((String)this.getValue("FRRGUSN_SDAT_CODE_ATTR"));
		return v;
	}


	
	
	public void setFrrgusnSdatCodeOpt1(NString value){
		this.setValue("FRRGUSN_SDAT_CODE_OPT_1", value.getValue());
	}


	public NString getFrrgusnSdatCodeOpt1(){
		NString v = new NString((String)this.getValue("FRRGUSN_SDAT_CODE_OPT_1"));
		return v;
	}


	
	
	public void setFrrgusnDesc(NString value){
		this.setValue("FRRGUSN_DESC", value.getValue());
	}


	public NString getFrrgusnDesc(){
		NString v = new NString((String)this.getValue("FRRGUSN_DESC"));
		return v;
	}


	
	
	public void setFrrgusnActivityDate(NDate value){
		this.setValue("FRRGUSN_ACTIVITY_DATE", value.getValue());
	}


	public NDate getFrrgusnActivityDate(){
		NDate v = new NDate((Date)this.getValue("FRRGUSN_ACTIVITY_DATE"));
		return v;
	}


	
	
	public void setFrrgusnUserId(NString value){
		this.setValue("FRRGUSN_USER_ID", value.getValue());
	}


	public NString getFrrgusnUserId(){
		NString v = new NString((String)this.getValue("FRRGUSN_USER_ID"));
		return v;
	}


	
	
	public void setFrrgusnGrntCode(NString value){
		this.setValue("FRRGUSN_GRNT_CODE", value.getValue());
	}


	public NString getFrrgusnGrntCode(){
		NString v = new NString((String)this.getValue("FRRGUSN_GRNT_CODE"));
		return v;
	}


	

	public void setROWID(byte[] bytes) {
		this.setROWID(DbManager.getDataBaseFactory().createRowid(bytes));
	}
 
	public void setROWID(java.sql.RowId rowId) {
		this.setValue(DAOConfiguration.MODEL_ROWID, rowId);
	}
	
}
