package  net.hedtech.banner.general.common.Guamesg.model;

import java.util.Date;
import java.math.BigDecimal;

import org.jdesktop.databuffer.DataRow;

import morphis.foundations.core.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.DAO;
import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appdatalayer.data.configuration.*;



public class GurtklrAdapter extends BaseRowAdapter{
	

	public GurtklrAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}


	//Data Columns
		     
	
	public void setGurtklrUserId(NString value){
		this.setValue("GURTKLR_USER_ID", value.getValue());
	}


	public NString getGurtklrUserId(){
		NString v = new NString((String)this.getValue("GURTKLR_USER_ID"));
		return v;
	}


	
	
	public void setUserIdName(NString value){
		this.setValue("USER_ID_NAME", value.getValue());
	}


	public NString getUserIdName(){
		NString v = new NString((String)this.getValue("USER_ID_NAME"));
		return v;
	}


	
	
	public void setGurtklrCreator(NString value){
		this.setValue("GURTKLR_CREATOR", value.getValue());
	}


	public NString getGurtklrCreator(){
		NString v = new NString((String)this.getValue("GURTKLR_CREATOR"));
		return v;
	}


	
	
	public void setGurtklrTodoDate(NDate value){
		this.setValue("GURTKLR_TODO_DATE", value.getValue());
	}


	public NDate getGurtklrTodoDate(){
		NDate v = new NDate((Date)this.getValue("GURTKLR_TODO_DATE"));
		return v;
	}


	
	
	public void setGurtklrTodoTime(NNumber value){
		this.setValue("GURTKLR_TODO_TIME", value.getValue());
	}


	public NNumber getGurtklrTodoTime(){
		NNumber v = new NNumber((BigDecimal)this.getValue("GURTKLR_TODO_TIME"));
		return v;
	}


	
	
	public void setGurtklrComment(NString value){
		this.setValue("GURTKLR_COMMENT", value.getValue());
	}


	public NString getGurtklrComment(){
		NString v = new NString((String)this.getValue("GURTKLR_COMMENT"));
		return v;
	}


	
	
	public void setGurtklrSource(NString value){
		this.setValue("GURTKLR_SOURCE", value.getValue());
	}


	public NString getGurtklrSource(){
		NString v = new NString((String)this.getValue("GURTKLR_SOURCE"));
		return v;
	}


	
	
	public void setIdno(NString value){
		this.setValue("IDNO", value.getValue());
	}


	public NString getIdno(){
		NString v = new NString((String)this.getValue("IDNO"));
		return v;
	}


	
	
	public void setNname(NString value){
		this.setValue("NAME", value.getValue());
	}


	public NString getNname(){
		NString v = new NString((String)this.getValue("NAME"));
		return v;
	}


	
	
	public void setGurtklrItemRefno(NString value){
		this.setValue("GURTKLR_ITEM_REFNO", value.getValue());
	}


	public NString getGurtklrItemRefno(){
		NString v = new NString((String)this.getValue("GURTKLR_ITEM_REFNO"));
		return v;
	}


	
	
	public void setGurtklrActivityDate(NDate value){
		this.setValue("GURTKLR_ACTIVITY_DATE", value.getValue());
	}


	public NDate getGurtklrActivityDate(){
		NDate v = new NDate((Date)this.getValue("GURTKLR_ACTIVITY_DATE"));
		return v;
	}


	
	
	public void setGurtklrSystemInd(NString value){
		this.setValue("GURTKLR_SYSTEM_IND", value.getValue());
	}


	public NString getGurtklrSystemInd(){
		NString v = new NString((String)this.getValue("GURTKLR_SYSTEM_IND"));
		return v;
	}


	
	
	public void setGurtklrSystemDesc(NString value){
		this.setValue("GURTKLR_SYSTEM_DESC", value.getValue());
	}


	public NString getGurtklrSystemDesc(){
		NString v = new NString((String)this.getValue("GURTKLR_SYSTEM_DESC"));
		return v;
	}


	
	
	public void setGurtklrStatus(NString value){
		this.setValue("GURTKLR_STATUS", value.getValue());
	}


	public NString getGurtklrStatus(){
		NString v = new NString((String)this.getValue("GURTKLR_STATUS"));
		return v;
	}


	
	
	public void setStatusFlag(NString value){
		this.setValue("STATUS_FLAG", value.getValue());
	}


	public NString getStatusFlag(){
		NString v = new NString((String)this.getValue("STATUS_FLAG"));
		return v;
	}


	
	
	public void setGurtklrConfidInd(NString value){
		this.setValue("GURTKLR_CONFID_IND", value.getValue());
	}


	public NString getGurtklrConfidInd(){
		NString v = new NString((String)this.getValue("GURTKLR_CONFID_IND"));
		return v;
	}


	
	
	public void setGurtklrSeqno(NNumber value){
		this.setValue("GURTKLR_SEQNO", value.getValue());
	}


	public NNumber getGurtklrSeqno(){
		NNumber v = new NNumber((BigDecimal)this.getValue("GURTKLR_SEQNO"));
		return v;
	}


	
	
	public void setGurtklrIdenCode(NString value){
		this.setValue("GURTKLR_IDEN_CODE", value.getValue());
	}


	public NString getGurtklrIdenCode(){
		NString v = new NString((String)this.getValue("GURTKLR_IDEN_CODE"));
		return v;
	}


	
	
	public void setQueryFlag(NString value){
		this.setValue("QUERY_FLAG", value.getValue());
	}


	public NString getQueryFlag(){
		NString v = new NString((String)this.getValue("QUERY_FLAG"));
		return v;
	}


	
	
	public void setDuprecInd(NString value){
		this.setValue("DUPREC_IND", value.getValue());
	}


	public NString getDuprecInd(){
		NString v = new NString((String)this.getValue("DUPREC_IND"));
		return v;
	}


	
	
	public void setGurtklrPidm(NNumber value){
		this.setValue("GURTKLR_PIDM", value.getValue());
	}


	public NNumber getGurtklrPidm(){
		NNumber v = new NNumber((BigDecimal)this.getValue("GURTKLR_PIDM"));
		return v;
	}


	

	public void setROWID(byte[] bytes) {
		this.setROWID(DbManager.getDataBaseFactory().createRowid(bytes));
	}
 
	public void setROWID(java.sql.RowId rowId) {
		this.setValue(DAOConfiguration.MODEL_ROWID, rowId);
	}
	
}
