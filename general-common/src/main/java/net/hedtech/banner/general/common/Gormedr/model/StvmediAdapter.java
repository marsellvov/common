package  net.hedtech.banner.general.common.Gormedr.model;

import java.util.Date;
import java.math.BigDecimal;

import org.jdesktop.databuffer.DataRow;

import morphis.foundations.core.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.DAO;
import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appdatalayer.data.configuration.*;



public class StvmediAdapter extends BaseRowAdapter{
	

	public StvmediAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setStvmediCode(NString value){
		this.setValue("STVMEDI_CODE", value.getValue());
	}


	public NString getStvmediCode(){
		NString v = new NString((String)this.getValue("STVMEDI_CODE"));
		return v;
	}


	
	
	public void setStvmediDesc(NString value){
		this.setValue("STVMEDI_DESC", value.getValue());
	}


	public NString getStvmediDesc(){
		NString v = new NString((String)this.getValue("STVMEDI_DESC"));
		return v;
	}


	

	public void setROWID(byte[] bytes) {
		this.setROWID(DbManager.getDataBaseFactory().createRowid(bytes));
	}
 
	public void setROWID(java.sql.RowId rowId) {
		this.setValue(DAOConfiguration.MODEL_ROWID, rowId);
	}
	
}
