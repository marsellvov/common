package  net.hedtech.banner.general.common.Noqlibr.model;

import java.util.Date;
import java.math.BigDecimal;

import org.jdesktop.databuffer.DataRow;

import morphis.foundations.core.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.configuration.DAOConfiguration;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;



public class NobtranAdapter extends BaseRowAdapter{
	

	public NobtranAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setNobtranTransactionNo(NNumber value){
		this.setValue("NOBTRAN_TRANSACTION_NO", value.getValue());
	}


	public NNumber getNobtranTransactionNo(){
		NNumber v = new NNumber((BigDecimal)this.getValue("NOBTRAN_TRANSACTION_NO"));
		return v;
	}


	

	public  java.sql.RowId getROWID(){
		return (java.sql.RowId) this.getValue(DAOConfiguration.MODEL_ROWID);
	}
	
}
