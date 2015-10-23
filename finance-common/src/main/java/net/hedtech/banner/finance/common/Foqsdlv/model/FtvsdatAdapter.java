package  net.hedtech.banner.finance.common.Foqsdlv.model;

import java.util.Date;
import java.math.BigDecimal;

import org.jdesktop.databuffer.DataRow;

import morphis.foundations.core.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.DAO;
import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appdatalayer.data.configuration.*;



public class FtvsdatAdapter extends BaseRowAdapter{
	

	public FtvsdatAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setFtvsdatSdatCodeOpt1(NString value){
		this.setValue("FTVSDAT_SDAT_CODE_OPT_1", value.getValue());
	}


	public NString getFtvsdatSdatCodeOpt1(){
		NString v = new NString((String)this.getValue("FTVSDAT_SDAT_CODE_OPT_1"));
		return v;
	}


	
	
	public void setFtvsdatSdatCodeOpt2(NString value){
		this.setValue("FTVSDAT_SDAT_CODE_OPT_2", value.getValue());
	}


	public NString getFtvsdatSdatCodeOpt2(){
		NString v = new NString((String)this.getValue("FTVSDAT_SDAT_CODE_OPT_2"));
		return v;
	}


	
	
	public void setFtvsdatCodeLevel(NNumber value){
		this.setValue("FTVSDAT_CODE_LEVEL", value.getValue());
	}


	public NNumber getFtvsdatCodeLevel(){
		NNumber v = new NNumber((BigDecimal)this.getValue("FTVSDAT_CODE_LEVEL"));
		return v;
	}


	
	
	public void setFtvsdatStatusInd(NString value){
		this.setValue("FTVSDAT_STATUS_IND", value.getValue());
	}


	public NString getFtvsdatStatusInd(){
		NString v = new NString((String)this.getValue("FTVSDAT_STATUS_IND"));
		return v;
	}


	
	
	public void setFtvsdatEffDate(NDate value){
		this.setValue("FTVSDAT_EFF_DATE", value.getValue());
	}


	public NDate getFtvsdatEffDate(){
		NDate v = new NDate((Date)this.getValue("FTVSDAT_EFF_DATE"));
		return v;
	}


	
	
	public void setFtvsdatActivityDate(NDate value){
		this.setValue("FTVSDAT_ACTIVITY_DATE", value.getValue());
	}


	public NDate getFtvsdatActivityDate(){
		NDate v = new NDate((Date)this.getValue("FTVSDAT_ACTIVITY_DATE"));
		return v;
	}


	
	
	public void setFtvsdatUserId(NString value){
		this.setValue("FTVSDAT_USER_ID", value.getValue());
	}


	public NString getFtvsdatUserId(){
		NString v = new NString((String)this.getValue("FTVSDAT_USER_ID"));
		return v;
	}


	
	
	public void setFtvsdatCoasCode(NString value){
		this.setValue("FTVSDAT_COAS_CODE", value.getValue());
	}


	public NString getFtvsdatCoasCode(){
		NString v = new NString((String)this.getValue("FTVSDAT_COAS_CODE"));
		return v;
	}


	
	
	public void setFtvsdatSdatCodeEntity(NString value){
		this.setValue("FTVSDAT_SDAT_CODE_ENTITY", value.getValue());
	}


	public NString getFtvsdatSdatCodeEntity(){
		NString v = new NString((String)this.getValue("FTVSDAT_SDAT_CODE_ENTITY"));
		return v;
	}


	
	
	public void setFtvsdatSdatCodeAttr(NString value){
		this.setValue("FTVSDAT_SDAT_CODE_ATTR", value.getValue());
	}


	public NString getFtvsdatSdatCodeAttr(){
		NString v = new NString((String)this.getValue("FTVSDAT_SDAT_CODE_ATTR"));
		return v;
	}


	
	
	public void setFtvsdatData(NString value){
		this.setValue("FTVSDAT_DATA", value.getValue());
	}


	public NString getFtvsdatData(){
		NString v = new NString((String)this.getValue("FTVSDAT_DATA"));
		return v;
	}


	
	
	public void setFtvsdatTitle(NString value){
		this.setValue("FTVSDAT_TITLE", value.getValue());
	}


	public NString getFtvsdatTitle(){
		NString v = new NString((String)this.getValue("FTVSDAT_TITLE"));
		return v;
	}


	
	
	public void setFtvsdatShortTitle(NString value){
		this.setValue("FTVSDAT_SHORT_TITLE", value.getValue());
	}


	public NString getFtvsdatShortTitle(){
		NString v = new NString((String)this.getValue("FTVSDAT_SHORT_TITLE"));
		return v;
	}


	

	public void setROWID(byte[] bytes) {
		this.setROWID(DbManager.getDataBaseFactory().createRowid(bytes));
	}
 
	public void setROWID(java.sql.RowId rowId) {
		this.setValue(DAOConfiguration.MODEL_ROWID, rowId);
	}
	
}
