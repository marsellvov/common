package  net.hedtech.banner.general.common.BannerMain.model;

import java.util.Date;
import java.math.BigDecimal;
import org.jdesktop.databuffer.DataRow;
import morphis.foundations.flavors.forms.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.DAO;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appdatalayer.data.configuration.*;



public class GuisetiAdapter extends BaseRowAdapter{
	

	public GuisetiAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setVpdiCode(NString value){
		this.setValue("VPDI_CODE", value.getValue());
	}


	public NString getVpdiCode(){
		NString v = new NString((String)this.getValue("VPDI_CODE"));
		return v;
	}


	
	
	public void setPrimaryInd(NString value){
		this.setValue("PRIMARY_IND", value.getValue());
	}


	public NString getPrimaryInd(){
		NString v = new NString((String)this.getValue("PRIMARY_IND"));
		return v;
	}


	
	
	public void setCodeDesc(NString value){
		this.setValue("CODE_DESC", value.getValue());
	}


	public NString getCodeDesc(){
		NString v = new NString((String)this.getValue("CODE_DESC"));
		return v;
	}


	

	
}
