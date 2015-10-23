package  net.hedtech.banner.alumni.common.Apaiden.model;

import java.util.Date;
import java.math.BigDecimal;
import org.jdesktop.databuffer.DataRow;
import morphis.foundations.flavors.forms.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.DAO;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appdatalayer.data.configuration.*;



public class SpraddrAdapter extends net.hedtech.general.common.libraries.Goqclib.model.SpraddrAdapter {
	

	public SpraddrAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
	
	
	
	public void setEmploymentDetails(NString value){
		this.setValue("EMPLOYMENT_DETAILS", value.getValue());
	}


	public NString getEmploymentDetails(){
		NString v = new NString((String)this.getValue("EMPLOYMENT_DETAILS"));
		return v;
	}


	

	
}
