package  net.hedtech.banner.general.common.Stvterm.model;

import java.util.Date;
import java.math.BigDecimal;

import org.jdesktop.databuffer.DataRow;

import morphis.foundations.core.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.DAO;
import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appdatalayer.data.configuration.*;



public class StvtermAdapter extends BaseRowAdapter{
	

	public StvtermAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setStvtermCode(NString value){
		this.setValue("STVTERM_CODE", value.getValue());
	}


	public NString getStvtermCode(){
		NString v = new NString((String)this.getValue("STVTERM_CODE"));
		return v;
	}


	
	
	public void setStvtermDesc(NString value){
		this.setValue("STVTERM_DESC", value.getValue());
	}


	public NString getStvtermDesc(){
		NString v = new NString((String)this.getValue("STVTERM_DESC"));
		return v;
	}


	
	
	public void setStvtermStartDate(NDate value){
		this.setValue("STVTERM_START_DATE", value.getValue());
	}


	public NDate getStvtermStartDate(){
		NDate v = new NDate((Date)this.getValue("STVTERM_START_DATE"));
		return v;
	}


	
	
	public void setStvtermEndDate(NDate value){
		this.setValue("STVTERM_END_DATE", value.getValue());
	}


	public NDate getStvtermEndDate(){
		NDate v = new NDate((Date)this.getValue("STVTERM_END_DATE"));
		return v;
	}


	
	
	public void setStvtermTrmtCode(NString value){
		this.setValue("STVTERM_TRMT_CODE", value.getValue());
	}


	public NString getStvtermTrmtCode(){
		NString v = new NString((String)this.getValue("STVTERM_TRMT_CODE"));
		return v;
	}


	
	
	public void setStvtermAcyrCode(NString value){
		this.setValue("STVTERM_ACYR_CODE", value.getValue());
	}


	public NString getStvtermAcyrCode(){
		NString v = new NString((String)this.getValue("STVTERM_ACYR_CODE"));
		return v;
	}


	
	
	public void setStvtermHousingStartDate(NDate value){
		this.setValue("STVTERM_HOUSING_START_DATE", value.getValue());
	}


	public NDate getStvtermHousingStartDate(){
		NDate v = new NDate((Date)this.getValue("STVTERM_HOUSING_START_DATE"));
		return v;
	}


	
	
	public void setStvtermHousingEndDate(NDate value){
		this.setValue("STVTERM_HOUSING_END_DATE", value.getValue());
	}


	public NDate getStvtermHousingEndDate(){
		NDate v = new NDate((Date)this.getValue("STVTERM_HOUSING_END_DATE"));
		return v;
	}


	
	
	public void setStvtermFaProcYr(NString value){
		this.setValue("STVTERM_FA_PROC_YR", value.getValue());
	}


	public NString getStvtermFaProcYr(){
		NString v = new NString((String)this.getValue("STVTERM_FA_PROC_YR"));
		return v;
	}


	
	
	public void setStvtermFaSummerInd(NString value){
		this.setValue("STVTERM_FA_SUMMER_IND", value.getValue());
	}


	public NString getStvtermFaSummerInd(){
		NString v = new NString((String)this.getValue("STVTERM_FA_SUMMER_IND"));
		return v;
	}


	
	
	public void setStvtermFaTerm(NString value){
		this.setValue("STVTERM_FA_TERM", value.getValue());
	}


	public NString getStvtermFaTerm(){
		NString v = new NString((String)this.getValue("STVTERM_FA_TERM"));
		return v;
	}


	
	
	public void setStvtermFaPeriod(NNumber value){
		this.setValue("STVTERM_FA_PERIOD", value.getValue());
	}


	public NNumber getStvtermFaPeriod(){
		NNumber v = new NNumber((BigDecimal)this.getValue("STVTERM_FA_PERIOD"));
		return v;
	}


	
	
	public void setStvtermFaEndPeriod(NNumber value){
		this.setValue("STVTERM_FA_END_PERIOD", value.getValue());
	}


	public NNumber getStvtermFaEndPeriod(){
		NNumber v = new NNumber((BigDecimal)this.getValue("STVTERM_FA_END_PERIOD"));
		return v;
	}


	
	
	public void setStvtermSystemReqInd(NString value){
		this.setValue("STVTERM_SYSTEM_REQ_IND", value.getValue());
	}


	public NString getStvtermSystemReqInd(){
		NString v = new NString((String)this.getValue("STVTERM_SYSTEM_REQ_IND"));
		return v;
	}


	
	
	public void setStvtermActivityDate(NDate value){
		this.setValue("STVTERM_ACTIVITY_DATE", value.getValue());
	}


	public NDate getStvtermActivityDate(){
		NDate v = new NDate((Date)this.getValue("STVTERM_ACTIVITY_DATE"));
		return v;
	}


	

	public void setROWID(byte[] bytes) {
		this.setROWID(DbManager.getDataBaseFactory().createRowid(bytes));
	}
 
	public void setROWID(java.sql.RowId rowId) {
		this.setValue(DAOConfiguration.MODEL_ROWID, rowId);
	}
	
}
