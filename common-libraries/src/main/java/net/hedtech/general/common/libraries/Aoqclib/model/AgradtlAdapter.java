package  net.hedtech.general.common.libraries.Aoqclib.model;

import java.util.Date;
import java.math.BigDecimal;
import org.jdesktop.databuffer.DataRow;
import morphis.foundations.flavors.forms.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.DAO;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appdatalayer.data.configuration.*;



public class AgradtlAdapter extends BaseRowAdapter{
	

	public AgradtlAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setAgradtlAdtlCode(NString value){
		this.setValue("AGRADTL_ADTL_CODE", value.getValue());
	}


	public NString getAgradtlAdtlCode(){
		NString v = new NString((String)this.getValue("AGRADTL_ADTL_CODE"));
		return v;
	}


	
	
	public void setAdtlDesc(NString value){
		this.setValue("ADTL_DESC", value.getValue());
	}


	public NString getAdtlDesc(){
		NString v = new NString((String)this.getValue("ADTL_DESC"));
		return v;
	}


	
	
	public void setAgradtlPledgeNo(NString value){
		this.setValue("AGRADTL_PLEDGE_NO", value.getValue());
	}


	public NString getAgradtlPledgeNo(){
		NString v = new NString((String)this.getValue("AGRADTL_PLEDGE_NO"));
		return v;
	}


	
	
	public void setAgradtlGiftNo(NString value){
		this.setValue("AGRADTL_GIFT_NO", value.getValue());
	}


	public NString getAgradtlGiftNo(){
		NString v = new NString((String)this.getValue("AGRADTL_GIFT_NO"));
		return v;
	}


	
	
	public void setAgradtlAmt(NNumber value){
		this.setValue("AGRADTL_AMT", value.getValue());
	}


	public NNumber getAgradtlAmt(){
		NNumber v = new NNumber((BigDecimal)this.getValue("AGRADTL_AMT"));
		return v;
	}


	
	
	public void setAgradtlDetails(NString value){
		this.setValue("AGRADTL_DETAILS", value.getValue());
	}


	public NString getAgradtlDetails(){
		NString v = new NString((String)this.getValue("AGRADTL_DETAILS"));
		return v;
	}


	
	
	public void setAgradtlComment(NString value){
		this.setValue("AGRADTL_COMMENT", value.getValue());
	}


	public NString getAgradtlComment(){
		NString v = new NString((String)this.getValue("AGRADTL_COMMENT"));
		return v;
	}


	
	
	public void setAgradtlActivityDate(NDate value){
		this.setValue("AGRADTL_ACTIVITY_DATE", value.getValue());
	}


	public NDate getAgradtlActivityDate(){
		NDate v = new NDate((Date)this.getValue("AGRADTL_ACTIVITY_DATE"));
		return v;
	}


	
	
	public void setAgradtlUserId(NString value){
		this.setValue("AGRADTL_USER_ID", value.getValue());
	}


	public NString getAgradtlUserId(){
		NString v = new NString((String)this.getValue("AGRADTL_USER_ID"));
		return v;
	}


	
	// F2J_TODO : Item AGRADTL_PIDM has the "Copy Value from Item" property defined, with value: KEY_BLOCK.PIDM                  
	
	public void setAgradtlPidm(NNumber value){
		this.setValue("AGRADTL_PIDM", value.getValue());
	}


	public NNumber getAgradtlPidm(){
		NNumber v = new NNumber((BigDecimal)this.getValue("AGRADTL_PIDM"));
		return v;
	}


	
	
	public void setAgradtlDataOrigin(NString value){
		this.setValue("AGRADTL_DATA_ORIGIN", value.getValue());
	}


	public NString getAgradtlDataOrigin(){
		NString v = new NString((String)this.getValue("AGRADTL_DATA_ORIGIN"));
		return v;
	}


	

	
}
