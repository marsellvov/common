package  net.hedtech.banner.finance.common.Ftvorgn.model;

import java.util.Date;
import java.math.BigDecimal;

import org.jdesktop.databuffer.DataRow;

import morphis.foundations.core.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.DAO;
import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appdatalayer.data.configuration.*;



public class FtvorgnAdapter extends BaseRowAdapter{
	

	public FtvorgnAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setFtvorgnCoasCode(NString value){
		this.setValue("FTVORGN_COAS_CODE", value.getValue());
	}


	public NString getFtvorgnCoasCode(){
		NString v = new NString((String)this.getValue("FTVORGN_COAS_CODE"));
		return v;
	}


	
	
	public void setFtvorgnOrgnCode(NString value){
		this.setValue("FTVORGN_ORGN_CODE", value.getValue());
	}


	public NString getFtvorgnOrgnCode(){
		NString v = new NString((String)this.getValue("FTVORGN_ORGN_CODE"));
		return v;
	}


	
	
	public void setFtvorgnTitle(NString value){
		this.setValue("FTVORGN_TITLE", value.getValue());
	}


	public NString getFtvorgnTitle(){
		NString v = new NString((String)this.getValue("FTVORGN_TITLE"));
		return v;
	}


	
	
	public void setFtvorgnDataEntryInd(NString value){
		this.setValue("FTVORGN_DATA_ENTRY_IND", value.getValue());
	}


	public NString getFtvorgnDataEntryInd(){
		NString v = new NString((String)this.getValue("FTVORGN_DATA_ENTRY_IND"));
		return v;
	}


	
	
	public void setFtvorgnStatusInd(NString value){
		this.setValue("FTVORGN_STATUS_IND", value.getValue());
	}


	public NString getFtvorgnStatusInd(){
		NString v = new NString((String)this.getValue("FTVORGN_STATUS_IND"));
		return v;
	}


	
	
	public void setFtvorgnEffDate(NDate value){
		this.setValue("FTVORGN_EFF_DATE", value.getValue());
	}


	public NDate getFtvorgnEffDate(){
		NDate v = new NDate((Date)this.getValue("FTVORGN_EFF_DATE"));
		return v;
	}


	
	
	public void setFtvorgnTermDate(NDate value){
		this.setValue("FTVORGN_TERM_DATE", value.getValue());
	}


	public NDate getFtvorgnTermDate(){
		NDate v = new NDate((Date)this.getValue("FTVORGN_TERM_DATE"));
		return v;
	}


	
	
	public void setFtvorgnActivityDate(NDate value){
		this.setValue("FTVORGN_ACTIVITY_DATE", value.getValue());
	}


	public NDate getFtvorgnActivityDate(){
		NDate v = new NDate((Date)this.getValue("FTVORGN_ACTIVITY_DATE"));
		return v;
	}


	
	
	public void setFtvorgnUserId(NString value){
		this.setValue("FTVORGN_USER_ID", value.getValue());
	}


	public NString getFtvorgnUserId(){
		NString v = new NString((String)this.getValue("FTVORGN_USER_ID"));
		return v;
	}


	

	public void setROWID(byte[] bytes) {
		this.setROWID(DbManager.getDataBaseFactory().createRowid(bytes));
	}
 
	public void setROWID(java.sql.RowId rowId) {
		this.setValue(DAOConfiguration.MODEL_ROWID, rowId);
	}
	
}
