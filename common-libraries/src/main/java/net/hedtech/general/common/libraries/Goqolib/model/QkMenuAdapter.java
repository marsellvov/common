package  net.hedtech.general.common.libraries.Goqolib.model;

import java.util.Date;
import java.math.BigDecimal;

import org.jdesktop.databuffer.DataRow;

import morphis.foundations.core.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.configuration.DAOConfiguration;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;



public class QkMenuAdapter extends BaseRowAdapter{
	

	public QkMenuAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setGurmenuName(NString value){
		this.setValue("GURMENU_NAME", value.getValue());
	}


	public NString getGurmenuName(){
		NString v = new NString((String)this.getValue("GURMENU_NAME"));
		return v;
	}


	
	
	public void setGurmenuObjName(NString value){
		this.setValue("GURMENU_OBJ_NAME", value.getValue());
	}


	public NString getGurmenuObjName(){
		NString v = new NString((String)this.getValue("GURMENU_OBJ_NAME"));
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
