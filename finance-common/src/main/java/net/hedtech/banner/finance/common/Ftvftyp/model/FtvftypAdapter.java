package  net.hedtech.banner.finance.common.Ftvftyp.model;

import java.sql.RowId;
import java.util.Date;
import java.math.BigDecimal;

import org.jdesktop.databuffer.DataRow;

import morphis.foundations.core.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.DAO;
import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appdatalayer.data.configuration.*;



public class FtvftypAdapter extends BaseRowAdapter{
	

	public FtvftypAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setFtvftypCoasCode(NString value){
		this.setValue("FTVFTYP_COAS_CODE", value.getValue());
	}


	public NString getFtvftypCoasCode(){
		NString v = new NString((String)this.getValue("FTVFTYP_COAS_CODE"));
		return v;
	}


	
	
	public void setFtvftypFtypCode(NString value){
		this.setValue("FTVFTYP_FTYP_CODE", value.getValue());
	}


	public NString getFtvftypFtypCode(){
		NString v = new NString((String)this.getValue("FTVFTYP_FTYP_CODE"));
		return v;
	}


	
	
	public void setFtvftypTitle(NString value){
		this.setValue("FTVFTYP_TITLE", value.getValue());
	}


	public NString getFtvftypTitle(){
		NString v = new NString((String)this.getValue("FTVFTYP_TITLE"));
		return v;
	}


	
	
	public void setFtvftypFtypCodePred(NString value){
		this.setValue("FTVFTYP_FTYP_CODE_PRED", value.getValue());
	}


	public NString getFtvftypFtypCodePred(){
		NString v = new NString((String)this.getValue("FTVFTYP_FTYP_CODE_PRED"));
		return v;
	}


	
	
	public void setFtvftypStatusInd(NString value){
		this.setValue("FTVFTYP_STATUS_IND", value.getValue());
	}


	public NString getFtvftypStatusInd(){
		NString v = new NString((String)this.getValue("FTVFTYP_STATUS_IND"));
		return v;
	}


	
	
	public void setFtvftypEncMultYrInd(NString value){
		this.setValue("FTVFTYP_ENC_MULT_YR_IND", value.getValue());
	}


	public NString getFtvftypEncMultYrInd(){
		NString v = new NString((String)this.getValue("FTVFTYP_ENC_MULT_YR_IND"));
		return v;
	}


	
	
	public void setFtvftypEffDate(NDate value){
		this.setValue("FTVFTYP_EFF_DATE", value.getValue());
	}


	public NDate getFtvftypEffDate(){
		NDate v = new NDate((Date)this.getValue("FTVFTYP_EFF_DATE"));
		return v;
	}


	
	
	public void setFtvftypTermDate(NDate value){
		this.setValue("FTVFTYP_TERM_DATE", value.getValue());
	}


	public NDate getFtvftypTermDate(){
		NDate v = new NDate((Date)this.getValue("FTVFTYP_TERM_DATE"));
		return v;
	}


	
	
	public void setFtvftypActivityDate(NDate value){
		this.setValue("FTVFTYP_ACTIVITY_DATE", value.getValue());
	}


	public NDate getFtvftypActivityDate(){
		NDate v = new NDate((Date)this.getValue("FTVFTYP_ACTIVITY_DATE"));
		return v;
	}


	
	
	public void setFtvftypUserId(NString value){
		this.setValue("FTVFTYP_USER_ID", value.getValue());
	}


	public NString getFtvftypUserId(){
		NString v = new NString((String)this.getValue("FTVFTYP_USER_ID"));
		return v;
	}

	public void setROWID(byte[] bytes) {
		this.setROWID(DbManager.getDataBaseFactory().createRowid(bytes));
	}
 
	public void setROWID(java.sql.RowId rowId) {
		this.setValue(DAOConfiguration.MODEL_ROWID, rowId);
	}
	
	public java.sql.RowId getROWID() {
		return (RowId) this.getValue(DAOConfiguration.MODEL_ROWID);
	}
}
