package  net.hedtech.general.common.libraries.Aoqclib.model;

import java.util.Date;
import java.math.BigDecimal;
import org.jdesktop.databuffer.DataRow;
import morphis.foundations.flavors.forms.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.DAO;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appdatalayer.data.configuration.*;



public class AuralrtAdapter extends BaseRowAdapter{
	

	public AuralrtAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setAlrtParkSpot(NString value){
		this.setValue("ALRT_PARK_SPOT", value.getValue());
	}


	public NString getAlrtParkSpot(){
		NString v = new NString((String)this.getValue("ALRT_PARK_SPOT"));
		return v;
	}


	
	
	public void setAuralrtMessage(NString value){
		this.setValue("AURALRT_MESSAGE", value.getValue());
	}


	public NString getAuralrtMessage(){
		NString v = new NString((String)this.getValue("AURALRT_MESSAGE"));
		return v;
	}


	

	
}
