package  net.hedtech.banner.general.common.Stvnatn.model;

import java.util.Date;
import java.math.BigDecimal;

import org.jdesktop.databuffer.DataRow;

import morphis.foundations.core.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.DAO;
import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appdatalayer.data.configuration.*;



public class StvnatnAdapter extends BaseRowAdapter{
	

	public StvnatnAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setStvnatnCode(NString value){
		this.setValue("STVNATN_CODE", value.getValue());
	}


	public NString getStvnatnCode(){
		NString v = new NString((String)this.getValue("STVNATN_CODE"));
		return v;
	}


	
	
	public void setStvnatnNation(NString value){
		this.setValue("STVNATN_NATION", value.getValue());
	}


	public NString getStvnatnNation(){
		NString v = new NString((String)this.getValue("STVNATN_NATION"));
		return v;
	}


	
	
	public void setStvnatnSevisEquiv(NString value){
		this.setValue("STVNATN_SEVIS_EQUIV", value.getValue());
	}


	public NString getStvnatnSevisEquiv(){
		NString v = new NString((String)this.getValue("STVNATN_SEVIS_EQUIV"));
		return v;
	}


	
	
	public void setStvnatnEdiEquiv(NString value){
		this.setValue("STVNATN_EDI_EQUIV", value.getValue());
	}


	public NString getStvnatnEdiEquiv(){
		NString v = new NString((String)this.getValue("STVNATN_EDI_EQUIV"));
		return v;
	}


	
	
	public void setStvnatnLmsEquiv(NString value){
		this.setValue("STVNATN_LMS_EQUIV", value.getValue());
	}


	public NString getStvnatnLmsEquiv(){
		NString v = new NString((String)this.getValue("STVNATN_LMS_EQUIV"));
		return v;
	}


	
	
	public void setStvnatnScodCodeIso(NString value){
		this.setValue("STVNATN_SCOD_CODE_ISO", value.getValue());
	}


	public NString getStvnatnScodCodeIso(){
		NString v = new NString((String)this.getValue("STVNATN_SCOD_CODE_ISO"));
		return v;
	}


	
	
	public void setStvnatnStatscanCde(NString value){
		this.setValue("STVNATN_STATSCAN_CDE", value.getValue());
	}


	public NString getStvnatnStatscanCde(){
		NString v = new NString((String)this.getValue("STVNATN_STATSCAN_CDE"));
		return v;
	}


	
	
	public void setStvnatnSsaReportingEquiv(NString value){
		this.setValue("STVNATN_SSA_REPORTING_EQUIV", value.getValue());
	}


	public NString getStvnatnSsaReportingEquiv(){
		NString v = new NString((String)this.getValue("STVNATN_SSA_REPORTING_EQUIV"));
		return v;
	}


	
	
	public void setStvnatnActivityDate(NDate value){
		this.setValue("STVNATN_ACTIVITY_DATE", value.getValue());
	}


	public NDate getStvnatnActivityDate(){
		NDate v = new NDate((Date)this.getValue("STVNATN_ACTIVITY_DATE"));
		return v;
	}


	

	public void setROWID(byte[] bytes) {
		this.setROWID(DbManager.getDataBaseFactory().createRowid(bytes));
	}
 
	public void setROWID(java.sql.RowId rowId) {
		this.setValue(DAOConfiguration.MODEL_ROWID, rowId);
	}
	
}
