package  net.hedtech.banner.general.common.Goaeacc.model;

import java.util.Date;
import java.math.BigDecimal;

import org.jdesktop.databuffer.DataRow;

import morphis.foundations.core.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.DAO;
import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appdatalayer.data.configuration.*;



public class GobeaccAdapter extends BaseRowAdapter{
	

	public GobeaccAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setGobeaccUsername(NString value){
		this.setValue("GOBEACC_USERNAME", value.getValue());
	}


	public NString getGobeaccUsername(){
		NString v = new NString((String)this.getValue("GOBEACC_USERNAME"));
		return v;
	}


	
	
	public void setWacsId(NString value){
		this.setValue("WACS_ID", value.getValue());
	}


	public NString getWacsId(){
		NString v = new NString((String)this.getValue("WACS_ID"));
		return v;
	}


	
	
	public void setNname(NString value){
		this.setValue("NAME", value.getValue());
	}


	public NString getNname(){
		NString v = new NString((String)this.getValue("NAME"));
		return v;
	}


	
	
	public void setGobeaccPidm(NNumber value){
		this.setValue("GOBEACC_PIDM", value.getValue());
	}


	public NNumber getGobeaccPidm(){
		NNumber v = new NNumber((BigDecimal)this.getValue("GOBEACC_PIDM"));
		return v;
	}


	
	
	public void setGobeaccActivityDate(NDate value){
		this.setValue("GOBEACC_ACTIVITY_DATE", value.getValue());
	}


	public NDate getGobeaccActivityDate(){
		NDate v = new NDate((Date)this.getValue("GOBEACC_ACTIVITY_DATE"));
		return v;
	}


	
	
	public void setGobeaccUserId(NString value){
		this.setValue("GOBEACC_USER_ID", value.getValue());
	}


	public NString getGobeaccUserId(){
		NString v = new NString((String)this.getValue("GOBEACC_USER_ID"));
		return v;
	}


	
	
	public void setConfidInfo(NString value){
		this.setValue("CONFID_INFO", value.getValue());
	}


	public NString getConfidInfo(){
		NString v = new NString((String)this.getValue("CONFID_INFO"));
		return v;
	}


	
	
	public void setDeceasedInd(NString value){
		this.setValue("DECEASED_IND", value.getValue());
	}


	public NString getDeceasedInd(){
		NString v = new NString((String)this.getValue("DECEASED_IND"));
		return v;
	}


	
	
	public void setVusrInd(NString value){
		this.setValue("VUSR_IND", value.getValue());
	}


	public NString getVusrInd(){
		NString v = new NString((String)this.getValue("VUSR_IND"));
		return v;
	}


	
	
	public void setIdenRecCnt(NNumber value){
		this.setValue("IDEN_REC_CNT", value.getValue());
	}


	public NNumber getIdenRecCnt(){
		NNumber v = new NNumber((BigDecimal)this.getValue("IDEN_REC_CNT"));
		return v;
	}


	
	
	public void setIdenId(NString value){
		this.setValue("IDEN_ID", value.getValue());
	}


	public NString getIdenId(){
		NString v = new NString((String)this.getValue("IDEN_ID"));
		return v;
	}


	
	
	public void setErrCode(NString value){
		this.setValue("ERR_CODE", value.getValue());
	}


	public NString getErrCode(){
		NString v = new NString((String)this.getValue("ERR_CODE"));
		return v;
	}


	
	
	public void setEaccErrorMsg(NString value){
		this.setValue("EACC_ERROR_MSG", value.getValue());
	}


	public NString getEaccErrorMsg(){
		NString v = new NString((String)this.getValue("EACC_ERROR_MSG"));
		return v;
	}


	
	
	public void setValidOracleuser(NString value){
		this.setValue("VALID_ORACLEUSER", value.getValue());
	}


	public NString getValidOracleuser(){
		NString v = new NString((String)this.getValue("VALID_ORACLEUSER"));
		return v;
	}


	
	
	public void setAmsg(NString value){
		this.setValue("AMSG", value.getValue());
	}


	public NString getAmsg(){
		NString v = new NString((String)this.getValue("AMSG"));
		return v;
	}


	

	public void setROWID(byte[] bytes) {
		this.setROWID(DbManager.getDataBaseFactory().createRowid(bytes));
	}
 
	public void setROWID(java.sql.RowId rowId) {
		this.setValue(DAOConfiguration.MODEL_ROWID, rowId);
	}
	
}
