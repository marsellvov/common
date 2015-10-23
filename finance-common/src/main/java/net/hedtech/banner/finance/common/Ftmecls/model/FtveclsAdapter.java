package  net.hedtech.banner.finance.common.Ftmecls.model;

import java.util.Date;
import java.math.BigDecimal;

import org.jdesktop.databuffer.DataRow;

import morphis.foundations.core.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.DAO;
import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appdatalayer.data.configuration.*;



public class FtveclsAdapter extends BaseRowAdapter{
	

	public FtveclsAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setFtveclsEclsCode(NString value){
		this.setValue("FTVECLS_ECLS_CODE", value.getValue());
	}


	public NString getFtveclsEclsCode(){
		NString v = new NString((String)this.getValue("FTVECLS_ECLS_CODE"));
		return v;
	}


	
	
	public void setFtveclsDesc(NString value){
		this.setValue("FTVECLS_DESC", value.getValue());
	}


	public NString getFtveclsDesc(){
		NString v = new NString((String)this.getValue("FTVECLS_DESC"));
		return v;
	}


	
	
	public void setFtveclsPictCode(NString value){
		this.setValue("FTVECLS_PICT_CODE", value.getValue());
	}


	public NString getFtveclsPictCode(){
		NString v = new NString((String)this.getValue("FTVECLS_PICT_CODE"));
		return v;
	}


	
	
	public void setFtveclsWkshCode(NString value){
		this.setValue("FTVECLS_WKSH_CODE", value.getValue());
	}


	public NString getFtveclsWkshCode(){
		NString v = new NString((String)this.getValue("FTVECLS_WKSH_CODE"));
		return v;
	}


	
	
	public void setWkshCodeDesc(NString value){
		this.setValue("WKSH_CODE_DESC", value.getValue());
	}


	public NString getWkshCodeDesc(){
		NString v = new NString((String)this.getValue("WKSH_CODE_DESC"));
		return v;
	}


	
	
	public void setFtveclsContractInd(NString value){
		this.setValue("FTVECLS_CONTRACT_IND", value.getValue());
	}


	public NString getFtveclsContractInd(){
		NString v = new NString((String)this.getValue("FTVECLS_CONTRACT_IND"));
		return v;
	}


	
	
	public void setFtveclsBudgetRollInd(NString value){
		this.setValue("FTVECLS_BUDGET_ROLL_IND", value.getValue());
	}


	public NString getFtveclsBudgetRollInd(){
		NString v = new NString((String)this.getValue("FTVECLS_BUDGET_ROLL_IND"));
		return v;
	}


	
	
	public void setFtveclsHoursPerDay(NNumber value){
		this.setValue("FTVECLS_HOURS_PER_DAY", value.getValue());
	}


	public NNumber getFtveclsHoursPerDay(){
		NNumber v = new NNumber((BigDecimal)this.getValue("FTVECLS_HOURS_PER_DAY"));
		return v;
	}


	
	
	public void setFtveclsHoursPerPay(NNumber value){
		this.setValue("FTVECLS_HOURS_PER_PAY", value.getValue());
	}


	public NNumber getFtveclsHoursPerPay(){
		NNumber v = new NNumber((BigDecimal)this.getValue("FTVECLS_HOURS_PER_PAY"));
		return v;
	}


	
	
	public void setFtveclsPaysPerYear(NNumber value){
		this.setValue("FTVECLS_PAYS_PER_YEAR", value.getValue());
	}


	public NNumber getFtveclsPaysPerYear(){
		NNumber v = new NNumber((BigDecimal)this.getValue("FTVECLS_PAYS_PER_YEAR"));
		return v;
	}


	
	
	public void setFtveclsActivityDate(NDate value){
		this.setValue("FTVECLS_ACTIVITY_DATE", value.getValue());
	}


	public NDate getFtveclsActivityDate(){
		NDate v = new NDate((Date)this.getValue("FTVECLS_ACTIVITY_DATE"));
		return v;
	}


	

	public void setROWID(byte[] bytes) {
		this.setROWID(DbManager.getDataBaseFactory().createRowid(bytes));
	}
 
	public void setROWID(java.sql.RowId rowId) {
		this.setValue(DAOConfiguration.MODEL_ROWID, rowId);
	}
	
}
