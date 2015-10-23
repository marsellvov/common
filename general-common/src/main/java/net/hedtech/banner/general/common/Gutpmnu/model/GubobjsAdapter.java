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



public class GubobjsAdapter extends BaseRowAdapter{
	

	public GubobjsAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setGubobjsName(NString value){
		this.setValue("GUBOBJS_NAME", value.getValue());
	}


	public NString getGubobjsName(){
		NString v = new NString((String)this.getValue("GUBOBJS_NAME"));
		return v;
	}


	
	
	public void setGubobjsObjtCode(NString value){
		this.setValue("GUBOBJS_OBJT_CODE", value.getValue());
	}


	public NString getGubobjsObjtCode(){
		NString v = new NString((String)this.getValue("GUBOBJS_OBJT_CODE"));
		return v;
	}


	
	
	public void setGubobjsDesc(NString value){
		this.setValue("GUBOBJS_DESC", value.getValue());
	}


	public NString getGubobjsDesc(){
		NString v = new NString((String)this.getValue("GUBOBJS_DESC"));
		return v;
	}


	

	public void setROWID(byte[] bytes) {
		this.setROWID(DbManager.getDataBaseFactory().createRowid(bytes));
	}
 
	public void setROWID(java.sql.RowId rowId) {
		this.setValue(DAOConfiguration.MODEL_ROWID, rowId);
	}
	
}
