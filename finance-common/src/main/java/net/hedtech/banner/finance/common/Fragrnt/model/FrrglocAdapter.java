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



public class FrrglocAdapter extends BaseRowAdapter{
	

	public FrrglocAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setFrrglocLocnCode(NString value){
		this.setValue("FRRGLOC_LOCN_CODE", value.getValue());
	}


	public NString getFrrglocLocnCode(){
		NString v = new NString((String)this.getValue("FRRGLOC_LOCN_CODE"));
		return v;
	}


	
	
	public void setFrrglocLocnResearchInd(NString value){
		this.setValue("FRRGLOC_LOCN_RESEARCH_IND", value.getValue());
	}


	public NString getFrrglocLocnResearchInd(){
		NString v = new NString((String)this.getValue("FRRGLOC_LOCN_RESEARCH_IND"));
		return v;
	}


	
	
	public void setFrrglocLocnTitle(NString value){
		this.setValue("FRRGLOC_LOCN_TITLE", value.getValue());
	}


	public NString getFrrglocLocnTitle(){
		NString v = new NString((String)this.getValue("FRRGLOC_LOCN_TITLE"));
		return v;
	}


	
	
	public void setFrrglocGrntCode(NString value){
		this.setValue("FRRGLOC_GRNT_CODE", value.getValue());
	}


	public NString getFrrglocGrntCode(){
		NString v = new NString((String)this.getValue("FRRGLOC_GRNT_CODE"));
		return v;
	}


	
	
	public void setFrrglocActivityDate(NDate value){
		this.setValue("FRRGLOC_ACTIVITY_DATE", value.getValue());
	}


	public NDate getFrrglocActivityDate(){
		NDate v = new NDate((Date)this.getValue("FRRGLOC_ACTIVITY_DATE"));
		return v;
	}


	
	
	public void setFrrglocUserId(NString value){
		this.setValue("FRRGLOC_USER_ID", value.getValue());
	}


	public NString getFrrglocUserId(){
		NString v = new NString((String)this.getValue("FRRGLOC_USER_ID"));
		return v;
	}


	

	public void setROWID(byte[] bytes) {
		this.setROWID(DbManager.getDataBaseFactory().createRowid(bytes));
	}
 
	public void setROWID(java.sql.RowId rowId) {
		this.setValue(DAOConfiguration.MODEL_ROWID, rowId);
	}
	
	public java.sql.RowId getROWID(){ 
		return (java.sql.RowId) this.getValue(DAOConfiguration.MODEL_ROWID); 
		}
	
}
