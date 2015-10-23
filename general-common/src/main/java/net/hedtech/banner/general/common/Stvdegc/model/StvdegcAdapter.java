package  net.hedtech.banner.general.common.Stvdegc.model;

import java.util.Date;
import java.math.BigDecimal;

import org.jdesktop.databuffer.DataRow;

import morphis.foundations.core.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.DAO;
import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appdatalayer.data.configuration.*;



public class StvdegcAdapter extends BaseRowAdapter{
	

	public StvdegcAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setStvdegcCode(NString value){
		this.setValue("STVDEGC_CODE", value.getValue());
	}


	public NString getStvdegcCode(){
		NString v = new NString((String)this.getValue("STVDEGC_CODE"));
		return v;
	}


	
	
	public void setStvdegcDesc(NString value){
		this.setValue("STVDEGC_DESC", value.getValue());
	}


	public NString getStvdegcDesc(){
		NString v = new NString((String)this.getValue("STVDEGC_DESC"));
		return v;
	}


	
	
	public void setStvdegcFaCountInd(NString value){
		this.setValue("STVDEGC_FA_COUNT_IND", value.getValue());
	}


	public NString getStvdegcFaCountInd(){
		NString v = new NString((String)this.getValue("STVDEGC_FA_COUNT_IND"));
		return v;
	}


	
	
	public void setStvdegcDlevCode(NString value){
		this.setValue("STVDEGC_DLEV_CODE", value.getValue());
	}


	public NString getStvdegcDlevCode(){
		NString v = new NString((String)this.getValue("STVDEGC_DLEV_CODE"));
		return v;
	}


	
	
	public void setStvdegcAcatCode(NString value){
		this.setValue("STVDEGC_ACAT_CODE", value.getValue());
	}


	public NString getStvdegcAcatCode(){
		NString v = new NString((String)this.getValue("STVDEGC_ACAT_CODE"));
		return v;
	}


	
	
	public void setStvdegcVrMsgNo(NNumber value){
		this.setValue("STVDEGC_VR_MSG_NO", value.getValue());
	}


	public NNumber getStvdegcVrMsgNo(){
		NNumber v = new NNumber((BigDecimal)this.getValue("STVDEGC_VR_MSG_NO"));
		return v;
	}


	
	
	public void setStvdegcDispWebInd(NString value){
		this.setValue("STVDEGC_DISP_WEB_IND", value.getValue());
	}


	public NString getStvdegcDispWebInd(){
		NString v = new NString((String)this.getValue("STVDEGC_DISP_WEB_IND"));
		return v;
	}


	
	
	public void setStvdegcSystemReqInd(NString value){
		this.setValue("STVDEGC_SYSTEM_REQ_IND", value.getValue());
	}


	public NString getStvdegcSystemReqInd(){
		NString v = new NString((String)this.getValue("STVDEGC_SYSTEM_REQ_IND"));
		return v;
	}


	
	
	public void setStvdegcActivityDate(NDate value){
		this.setValue("STVDEGC_ACTIVITY_DATE", value.getValue());
	}


	public NDate getStvdegcActivityDate(){
		NDate v = new NDate((Date)this.getValue("STVDEGC_ACTIVITY_DATE"));
		return v;
	}


	

	public void setROWID(byte[] bytes) {
		this.setROWID(DbManager.getDataBaseFactory().createRowid(bytes));
	}
 
	public void setROWID(java.sql.RowId rowId) {
		this.setValue(DAOConfiguration.MODEL_ROWID, rowId);
	}
	
}
