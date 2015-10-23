package  net.hedtech.banner.general.common.Stvstat.model;

import java.util.Date;
import java.math.BigDecimal;

import org.jdesktop.databuffer.DataRow;

import morphis.foundations.core.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.DAO;
import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appdatalayer.data.configuration.*;



public class StvstatAdapter extends BaseRowAdapter{
	

	public StvstatAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setStvstatCode(NString value){
		this.setValue("STVSTAT_CODE", value.getValue());
	}


	public NString getStvstatCode(){
		NString v = new NString((String)this.getValue("STVSTAT_CODE"));
		return v;
	}


	
	
	public void setStvstatDesc(NString value){
		this.setValue("STVSTAT_DESC", value.getValue());
	}


	public NString getStvstatDesc(){
		NString v = new NString((String)this.getValue("STVSTAT_DESC"));
		return v;
	}


	
	
	public void setStvstatEdiEquiv(NString value){
		this.setValue("STVSTAT_EDI_EQUIV", value.getValue());
	}


	public NString getStvstatEdiEquiv(){
		NString v = new NString((String)this.getValue("STVSTAT_EDI_EQUIV"));
		return v;
	}


	
	
	public void setStvstatIpedsCde(NString value){
		this.setValue("STVSTAT_IPEDS_CDE", value.getValue());
	}


	public NString getStvstatIpedsCde(){
		NString v = new NString((String)this.getValue("STVSTAT_IPEDS_CDE"));
		return v;
	}


	
	
	public void setStvstatStatscanCde(NString value){
		this.setValue("STVSTAT_STATSCAN_CDE", value.getValue());
	}


	public NString getStvstatStatscanCde(){
		NString v = new NString((String)this.getValue("STVSTAT_STATSCAN_CDE"));
		return v;
	}


	
	
	public void setStvstatActivityDate(NDate value){
		this.setValue("STVSTAT_ACTIVITY_DATE", value.getValue());
	}


	public NDate getStvstatActivityDate(){
		NDate v = new NDate((Date)this.getValue("STVSTAT_ACTIVITY_DATE"));
		return v;
	}


	

	public void setROWID(byte[] bytes) {
		this.setROWID(DbManager.getDataBaseFactory().createRowid(bytes));
	}
 
	public void setROWID(java.sql.RowId rowId) {
		this.setValue(DAOConfiguration.MODEL_ROWID, rowId);
	}
	
}
