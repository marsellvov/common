package  net.hedtech.banner.general.common.Soaidns.model;

import java.util.Date;
import java.math.BigDecimal;

import org.jdesktop.databuffer.DataRow;

import morphis.foundations.core.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.DAO;
import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appdatalayer.data.configuration.*;



public class SfbetrmAdapter extends BaseRowAdapter{
	

	public SfbetrmAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setBetrmDesc(NString value){
		this.setValue("BETRM_DESC", value.getValue());
	}


	public NString getBetrmDesc(){
		NString v = new NString((String)this.getValue("BETRM_DESC"));
		return v;
	}


	
	
	public void setSfbetrmTermCode(NString value){
		this.setValue("SFBETRM_TERM_CODE", value.getValue());
	}


	public NString getSfbetrmTermCode(){
		NString v = new NString((String)this.getValue("SFBETRM_TERM_CODE"));
		return v;
	}


	

	public void setROWID(byte[] bytes) {
		this.setROWID(DbManager.getDataBaseFactory().createRowid(bytes));
	}
 
	public void setROWID(java.sql.RowId rowId) {
		this.setValue(DAOConfiguration.MODEL_ROWID, rowId);
	}
	
}
