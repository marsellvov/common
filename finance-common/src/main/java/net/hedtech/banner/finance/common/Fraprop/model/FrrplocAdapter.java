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



public class FrrplocAdapter extends BaseRowAdapter{
	

	public FrrplocAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setFrrplocLocnCode(NString value){
		this.setValue("FRRPLOC_LOCN_CODE", value.getValue());
	}


	public NString getFrrplocLocnCode(){
		NString v = new NString((String)this.getValue("FRRPLOC_LOCN_CODE"));
		return v;
	}


	
	
	public void setFrrplocLocnResearchInd(NString value){
		this.setValue("FRRPLOC_LOCN_RESEARCH_IND", value.getValue());
	}


	public NString getFrrplocLocnResearchInd(){
		NString v = new NString((String)this.getValue("FRRPLOC_LOCN_RESEARCH_IND"));
		return v;
	}


	
	
	public void setFrrplocLocnTitle(NString value){
		this.setValue("FRRPLOC_LOCN_TITLE", value.getValue());
	}


	public NString getFrrplocLocnTitle(){
		NString v = new NString((String)this.getValue("FRRPLOC_LOCN_TITLE"));
		return v;
	}


	
	// F2J_TODO : Item FRRPLOC_PROP_CODE has the "Copy Value from Item" property defined, with value: FRBPROP_CODE                  
	
	public void setFrrplocPropCode(NString value){
		this.setValue("FRRPLOC_PROP_CODE", value.getValue());
	}


	public NString getFrrplocPropCode(){
		NString v = new NString((String)this.getValue("FRRPLOC_PROP_CODE"));
		return v;
	}


	
	
	public void setFrrplocActivityDate(NDate value){
		this.setValue("FRRPLOC_ACTIVITY_DATE", value.getValue());
	}


	public NDate getFrrplocActivityDate(){
		NDate v = new NDate((Date)this.getValue("FRRPLOC_ACTIVITY_DATE"));
		return v;
	}


	
	
	public void setFrrplocUserId(NString value){
		this.setValue("FRRPLOC_USER_ID", value.getValue());
	}


	public NString getFrrplocUserId(){
		NString v = new NString((String)this.getValue("FRRPLOC_USER_ID"));
		return v;
	}


	

	public void setROWID(byte[] bytes) {
		this.setROWID(DbManager.getDataBaseFactory().createRowid(bytes));
	}
 
	public void setROWID(java.sql.RowId rowId) {
		this.setValue(DAOConfiguration.MODEL_ROWID, rowId);
	}
	
}
