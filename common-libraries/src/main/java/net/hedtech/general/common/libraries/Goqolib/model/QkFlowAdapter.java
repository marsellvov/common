package  net.hedtech.general.common.libraries.Goqolib.model;

import java.util.Date;
import java.math.BigDecimal;

import org.jdesktop.databuffer.DataRow;

import morphis.foundations.core.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.configuration.DAOConfiguration;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;



public class QkFlowAdapter extends BaseRowAdapter{
	

	public QkFlowAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setGurcallCallCode(NString value){
		this.setValue("GURCALL_CALL_CODE", value.getValue());
	}


	public NString getGurcallCallCode(){
		NString v = new NString((String)this.getValue("GURCALL_CALL_CODE"));
		return v;
	}


	
	
	public void setGurcallForm(NString value){
		this.setValue("GURCALL_FORM", value.getValue());
	}


	public NString getGurcallForm(){
		NString v = new NString((String)this.getValue("GURCALL_FORM"));
		return v;
	}


	
	
	public void setQkType(NString value){
		this.setValue("QK_TYPE", value.getValue());
	}


	public NString getQkType(){
		NString v = new NString((String)this.getValue("QK_TYPE"));
		return v;
	}


	
	
	public void setQkDesc(NString value){
		this.setValue("QK_DESC", value.getValue());
	}


	public NString getQkDesc(){
		NString v = new NString((String)this.getValue("QK_DESC"));
		return v;
	}


	

	public  java.sql.RowId getROWID(){
		return (java.sql.RowId) this.getValue(DAOConfiguration.MODEL_ROWID);
	}
	
}
