package  net.hedtech.banner.general.common.Stvmajr.model;

import java.util.Date;
import java.math.BigDecimal;

import org.jdesktop.databuffer.DataRow;

import morphis.foundations.core.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.DAO;
import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appdatalayer.data.configuration.*;



public class StvmajrAdapter extends BaseRowAdapter{
	

	public StvmajrAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setStvmajrCode(NString value){
		this.setValue("STVMAJR_CODE", value.getValue());
	}


	public NString getStvmajrCode(){
		NString v = new NString((String)this.getValue("STVMAJR_CODE"));
		return v;
	}


	
	
	public void setStvmajrDesc(NString value){
		this.setValue("STVMAJR_DESC", value.getValue());
	}


	public NString getStvmajrDesc(){
		NString v = new NString((String)this.getValue("STVMAJR_DESC"));
		return v;
	}


	
	
	public void setStvmajrCipcCode(NString value){
		this.setValue("STVMAJR_CIPC_CODE", value.getValue());
	}


	public NString getStvmajrCipcCode(){
		NString v = new NString((String)this.getValue("STVMAJR_CIPC_CODE"));
		return v;
	}


	
	
	public void setStvmajrValidMajorInd(NString value){
		this.setValue("STVMAJR_VALID_MAJOR_IND", value.getValue());
	}


	public NString getStvmajrValidMajorInd(){
		NString v = new NString((String)this.getValue("STVMAJR_VALID_MAJOR_IND"));
		//if(v.equals("undefined"))
			//return new NString().getNull();
		
		return v;
	}


	
	
	public void setStvmajrValidMinorInd(NString value){
		this.setValue("STVMAJR_VALID_MINOR_IND", value.getValue());
	}


	public NString getStvmajrValidMinorInd(){
		NString v = new NString((String)this.getValue("STVMAJR_VALID_MINOR_IND"));
		return v;
	}


	
	
	public void setStvmajrValidConcentratnInd(NString value){
		this.setValue("STVMAJR_VALID_CONCENTRATN_IND", value.getValue());
	}


	public NString getStvmajrValidConcentratnInd(){
		NString v = new NString((String)this.getValue("STVMAJR_VALID_CONCENTRATN_IND"));
		return v;
	}


	
	
	public void setStvmajrOccupationInd(NString value){
		this.setValue("STVMAJR_OCCUPATION_IND", value.getValue());
	}


	public NString getStvmajrOccupationInd(){
		NString v = new NString((String)this.getValue("STVMAJR_OCCUPATION_IND"));
		return v;
	}


	
	
	public void setStvmajrAidEligibilityInd(NString value){
		this.setValue("STVMAJR_AID_ELIGIBILITY_IND", value.getValue());
	}


	public NString getStvmajrAidEligibilityInd(){
		NString v = new NString((String)this.getValue("STVMAJR_AID_ELIGIBILITY_IND"));
		return v;
	}


	
	
	public void setStvmajrVrMsgNo(NNumber value){
		this.setValue("STVMAJR_VR_MSG_NO", value.getValue());
	}


	public NNumber getStvmajrVrMsgNo(){
		NNumber v = new NNumber((BigDecimal)this.getValue("STVMAJR_VR_MSG_NO"));
		return v;
	}


	
	
	public void setStvmajrSevisEquiv(NString value){
		this.setValue("STVMAJR_SEVIS_EQUIV", value.getValue());
	}


	public NString getStvmajrSevisEquiv(){
		NString v = new NString((String)this.getValue("STVMAJR_SEVIS_EQUIV"));
		return v;
	}


	
	
	public void setStvmajrSystemReqInd(NString value){
		this.setValue("STVMAJR_SYSTEM_REQ_IND", value.getValue());
	}


	public NString getStvmajrSystemReqInd(){
		NString v = new NString((String)this.getValue("STVMAJR_SYSTEM_REQ_IND"));
		return v;
	}


	
	
	public void setStvmajrActivityDate(NDate value){
		this.setValue("STVMAJR_ACTIVITY_DATE", value.getValue());
	}


	public NDate getStvmajrActivityDate(){
		NDate v = new NDate((Date)this.getValue("STVMAJR_ACTIVITY_DATE"));
		return v;
	}


	

	public void setROWID(byte[] bytes) {
		this.setROWID(DbManager.getDataBaseFactory().createRowid(bytes));
	}
 
	public void setROWID(java.sql.RowId rowId) {
		this.setValue(DAOConfiguration.MODEL_ROWID, rowId);
	}
	
}
