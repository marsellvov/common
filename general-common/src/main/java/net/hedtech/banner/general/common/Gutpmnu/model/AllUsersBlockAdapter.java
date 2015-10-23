package  net.hedtech.banner.general.common.Gutpmnu.model;

import java.util.Date;
import java.math.BigDecimal;

import org.jdesktop.databuffer.DataRow;

import morphis.foundations.core.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.DAO;
import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appdatalayer.data.configuration.*;



public class AllUsersBlockAdapter extends BaseRowAdapter{
	

	public AllUsersBlockAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setUserName(NString value){
		this.setValue("USER_NAME", value.getValue());
	}


	public NString getUserName(){
		NString v = new NString((String)this.getValue("USER_NAME"));
		return v;
	}


	
	
	public void setUserId(NNumber value){
		this.setValue("USER_ID", value.getValue());
	}


	public NNumber getUserId(){
		NNumber v = new NNumber((BigDecimal)this.getValue("USER_ID"));
		return v;
	}


	

	public void setROWID(byte[] bytes) {
		this.setROWID(DbManager.getDataBaseFactory().createRowid(bytes));
	}
 
	public void setROWID(java.sql.RowId rowId) {
		this.setValue(DAOConfiguration.MODEL_ROWID, rowId);
	}
	
}
