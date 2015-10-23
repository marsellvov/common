package  net.hedtech.general.common.libraries.Aoqclib.model;

import java.util.Date;
import java.math.BigDecimal;
import org.jdesktop.databuffer.DataRow;
import morphis.foundations.flavors.forms.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.DAO;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appdatalayer.data.configuration.*;



public class AmrattnAdapter extends BaseRowAdapter{
	

	public AmrattnAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setAmrattnAttnIdenCode(NString value){
		this.setValue("AMRATTN_ATTN_IDEN_CODE", value.getValue());
	}


	public NString getAmrattnAttnIdenCode(){
		NString v = new NString((String)this.getValue("AMRATTN_ATTN_IDEN_CODE"));
		return v;
	}


	
	
	public void setAttnIdenDesc(NString value){
		this.setValue("ATTN_IDEN_DESC", value.getValue());
	}


	public NString getAttnIdenDesc(){
		NString v = new NString((String)this.getValue("ATTN_IDEN_DESC"));
		return v;
	}


	
	
	public void setAmrattnOrigInd(NString value){
		this.setValue("AMRATTN_ORIG_IND", value.getValue());
	}


	public NString getAmrattnOrigInd(){
		NString v = new NString((String)this.getValue("AMRATTN_ORIG_IND"));
		return v;
	}


	
	
	public void setAmrattnActivityDate(NDate value){
		this.setValue("AMRATTN_ACTIVITY_DATE", value.getValue());
	}


	public NDate getAmrattnActivityDate(){
		NDate v = new NDate((Date)this.getValue("AMRATTN_ACTIVITY_DATE"));
		return v;
	}


	
	
	public void setAmrattnUserId(NString value){
		this.setValue("AMRATTN_USER_ID", value.getValue());
	}


	public NString getAmrattnUserId(){
		NString v = new NString((String)this.getValue("AMRATTN_USER_ID"));
		return v;
	}


	
	// F2J_TODO : Item AMRATTN_PIDM has the "Copy Value from Item" property defined, with value: KEY_BLOCK.PIDM                  
	
	public void setAmrattnPidm(NNumber value){
		this.setValue("AMRATTN_PIDM", value.getValue());
	}


	public NNumber getAmrattnPidm(){
		NNumber v = new NNumber((BigDecimal)this.getValue("AMRATTN_PIDM"));
		return v;
	}


	
	// F2J_TODO : Item AMRATTN_ITEM_REFNO has the "Copy Value from Item" property defined, with value: AMRCONT.AMRCONT_ITEM_REFNO                  
	
	public void setAmrattnItemRefno(NNumber value){
		this.setValue("AMRATTN_ITEM_REFNO", value.getValue());
	}


	public NNumber getAmrattnItemRefno(){
		NNumber v = new NNumber((BigDecimal)this.getValue("AMRATTN_ITEM_REFNO"));
		return v;
	}


	
	
	public void setAmrattnDataOrigin(NString value){
		this.setValue("AMRATTN_DATA_ORIGIN", value.getValue());
	}


	public NString getAmrattnDataOrigin(){
		NString v = new NString((String)this.getValue("AMRATTN_DATA_ORIGIN"));
		return v;
	}


	

	
}
