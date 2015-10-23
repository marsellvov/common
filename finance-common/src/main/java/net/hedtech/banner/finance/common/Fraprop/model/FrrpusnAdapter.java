package  net.hedtech.banner.finance.common.Fraprop.model;

import java.util.Date;
import java.math.BigDecimal;
import org.jdesktop.databuffer.DataRow;
import morphis.foundations.core.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.DAO;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appdatalayer.data.configuration.*;
import morphis.foundations.core.appdatalayer.data.DbManager;


public class FrrpusnAdapter extends BaseRowAdapter{
	

	public FrrpusnAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setFrrpusnSdatCodeAttr(NString value){
		this.setValue("FRRPUSN_SDAT_CODE_ATTR", value.getValue());
	}


	public NString getFrrpusnSdatCodeAttr(){
		NString v = new NString((String)this.getValue("FRRPUSN_SDAT_CODE_ATTR"));
		return v;
	}


	
	
	public void setFrrpusnSdatCodeOpt1(NString value){
		this.setValue("FRRPUSN_SDAT_CODE_OPT_1", value.getValue());
	}


	public NString getFrrpusnSdatCodeOpt1(){
		NString v = new NString((String)this.getValue("FRRPUSN_SDAT_CODE_OPT_1"));
		return v;
	}


	
	
	public void setFrrpusnDesc(NString value){
		this.setValue("FRRPUSN_DESC", value.getValue());
	}


	public NString getFrrpusnDesc(){
		NString v = new NString((String)this.getValue("FRRPUSN_DESC"));
		return v;
	}


	
	
	public void setFrrpusnActivityDate(NDate value){
		this.setValue("FRRPUSN_ACTIVITY_DATE", value.getValue());
	}


	public NDate getFrrpusnActivityDate(){
		NDate v = new NDate((Date)this.getValue("FRRPUSN_ACTIVITY_DATE"));
		return v;
	}


	
	
	public void setFrrpusnUserId(NString value){
		this.setValue("FRRPUSN_USER_ID", value.getValue());
	}


	public NString getFrrpusnUserId(){
		NString v = new NString((String)this.getValue("FRRPUSN_USER_ID"));
		return v;
	}


	
	// F2J_TODO : Item FRRPUSN_PROP_CODE has the "Copy Value from Item" property defined, with value: FRBPROP_CODE                  
	
	public void setFrrpusnPropCode(NString value){
		this.setValue("FRRPUSN_PROP_CODE", value.getValue());
	}


	public NString getFrrpusnPropCode(){
		NString v = new NString((String)this.getValue("FRRPUSN_PROP_CODE"));
		return v;
	}


	

	public void setROWID(byte[] bytes) {
		this.setROWID(DbManager.getDataBaseFactory().createRowid(bytes));
	}
 
	public void setROWID(java.sql.RowId rowId) {
		this.setValue(DAOConfiguration.MODEL_ROWID, rowId);
	}
	
}
