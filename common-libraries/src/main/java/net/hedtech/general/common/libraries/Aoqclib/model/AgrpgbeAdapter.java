package  net.hedtech.general.common.libraries.Aoqclib.model;

import java.util.Date;
import java.math.BigDecimal;
import org.jdesktop.databuffer.DataRow;
import morphis.foundations.flavors.forms.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.DAO;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appdatalayer.data.configuration.*;



public class AgrpgbeAdapter extends BaseRowAdapter{
	

	public AgrpgbeAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setPgbeId(NString value){
		this.setValue("PGBE_ID", value.getValue());
	}


	public NString getPgbeId(){
		NString v = new NString((String)this.getValue("PGBE_ID"));
		return v;
	}


	
	
	public void setAgrpgbeXrefCode(NString value){
		this.setValue("AGRPGBE_XREF_CODE", value.getValue());
	}


	public NString getAgrpgbeXrefCode(){
		NString v = new NString((String)this.getValue("AGRPGBE_XREF_CODE"));
		return v;
	}


	
	
	public void setPgbeXrefDesc(NString value){
		this.setValue("PGBE_XREF_DESC", value.getValue());
	}


	public NString getPgbeXrefDesc(){
		NString v = new NString((String)this.getValue("PGBE_XREF_DESC"));
		return v;
	}


	
	
	public void setAgrpgbePledgeNo(NString value){
		this.setValue("AGRPGBE_PLEDGE_NO", value.getValue());
	}


	public NString getAgrpgbePledgeNo(){
		NString v = new NString((String)this.getValue("AGRPGBE_PLEDGE_NO"));
		return v;
	}


	
	
	public void setAgrpgbeGiftNo(NString value){
		this.setValue("AGRPGBE_GIFT_NO", value.getValue());
	}


	public NString getAgrpgbeGiftNo(){
		NString v = new NString((String)this.getValue("AGRPGBE_GIFT_NO"));
		return v;
	}


	
	
	public void setAgrpgbeSurnamePrefix(NString value){
		this.setValue("AGRPGBE_SURNAME_PREFIX", value.getValue());
	}


	public NString getAgrpgbeSurnamePrefix(){
		NString v = new NString((String)this.getValue("AGRPGBE_SURNAME_PREFIX"));
		return v;
	}


	
	
	public void setPgbeSurnamePrefix(NString value){
		this.setValue("PGBE_SURNAME_PREFIX", value.getValue());
	}


	public NString getPgbeSurnamePrefix(){
		NString v = new NString((String)this.getValue("PGBE_SURNAME_PREFIX"));
		return v;
	}


	
	
	public void setAgrpgbeLastName(NString value){
		this.setValue("AGRPGBE_LAST_NAME", value.getValue());
	}


	public NString getAgrpgbeLastName(){
		NString v = new NString((String)this.getValue("AGRPGBE_LAST_NAME"));
		return v;
	}


	
	
	public void setPgbeLastName(NString value){
		this.setValue("PGBE_LAST_NAME", value.getValue());
	}


	public NString getPgbeLastName(){
		NString v = new NString((String)this.getValue("PGBE_LAST_NAME"));
		return v;
	}


	
	
	public void setAgrpgbeFirstName(NString value){
		this.setValue("AGRPGBE_FIRST_NAME", value.getValue());
	}


	public NString getAgrpgbeFirstName(){
		NString v = new NString((String)this.getValue("AGRPGBE_FIRST_NAME"));
		return v;
	}


	
	
	public void setPgbeFirstName(NString value){
		this.setValue("PGBE_FIRST_NAME", value.getValue());
	}


	public NString getPgbeFirstName(){
		NString v = new NString((String)this.getValue("PGBE_FIRST_NAME"));
		return v;
	}


	
	
	public void setAgrpgbeMi(NString value){
		this.setValue("AGRPGBE_MI", value.getValue());
	}


	public NString getAgrpgbeMi(){
		NString v = new NString((String)this.getValue("AGRPGBE_MI"));
		return v;
	}


	
	
	public void setPgbeMi(NString value){
		this.setValue("PGBE_MI", value.getValue());
	}


	public NString getPgbeMi(){
		NString v = new NString((String)this.getValue("PGBE_MI"));
		return v;
	}


	
	
	public void setAgrpgbeSex(NString value){
		this.setValue("AGRPGBE_SEX", value.getValue());
	}


	public NString getAgrpgbeSex(){
		NString v = new NString((String)this.getValue("AGRPGBE_SEX"));
		return v;
	}


	
	
	public void setPgbeSex(NString value){
		this.setValue("PGBE_SEX", value.getValue());
	}


	public NString getPgbeSex(){
		NString v = new NString((String)this.getValue("PGBE_SEX"));
		return v;
	}


	
	
	public void setAgrpgbeBirthDate(NDate value){
		this.setValue("AGRPGBE_BIRTH_DATE", value.getValue());
	}


	public NDate getAgrpgbeBirthDate(){
		NDate v = new NDate((Date)this.getValue("AGRPGBE_BIRTH_DATE"));
		return v;
	}


	
	
	public void setPgbeBirthDate(NDate value){
		this.setValue("PGBE_BIRTH_DATE", value.getValue());
	}


	public NDate getPgbeBirthDate(){
		NDate v = new NDate((Date)this.getValue("PGBE_BIRTH_DATE"));
		return v;
	}


	
	
	public void setDisplayAge(NString value){
		this.setValue("DISPLAY_AGE", value.getValue());
	}


	public NString getDisplayAge(){
		NString v = new NString((String)this.getValue("DISPLAY_AGE"));
		return v;
	}


	
	
	public void setAgrpgbeDeceasedInd(NString value){
		this.setValue("AGRPGBE_DECEASED_IND", value.getValue());
	}


	public NString getAgrpgbeDeceasedInd(){
		NString v = new NString((String)this.getValue("AGRPGBE_DECEASED_IND"));
		return v;
	}


	
	
	public void setPgbeDeceasedInd(NString value){
		this.setValue("PGBE_DECEASED_IND", value.getValue());
	}


	public NString getPgbeDeceasedInd(){
		NString v = new NString((String)this.getValue("PGBE_DECEASED_IND"));
		return v;
	}


	
	
	public void setAgrpgbeDeceasedDate(NDate value){
		this.setValue("AGRPGBE_DECEASED_DATE", value.getValue());
	}


	public NDate getAgrpgbeDeceasedDate(){
		NDate v = new NDate((Date)this.getValue("AGRPGBE_DECEASED_DATE"));
		return v;
	}


	
	
	public void setPgbeDeceasedDate(NDate value){
		this.setValue("PGBE_DECEASED_DATE", value.getValue());
	}


	public NDate getPgbeDeceasedDate(){
		NDate v = new NDate((Date)this.getValue("PGBE_DECEASED_DATE"));
		return v;
	}


	
	
	public void setAgrpgbeComment(NString value){
		this.setValue("AGRPGBE_COMMENT", value.getValue());
	}


	public NString getAgrpgbeComment(){
		NString v = new NString((String)this.getValue("AGRPGBE_COMMENT"));
		return v;
	}


	
	
	public void setAgrpgbeActivityDate(NDate value){
		this.setValue("AGRPGBE_ACTIVITY_DATE", value.getValue());
	}


	public NDate getAgrpgbeActivityDate(){
		NDate v = new NDate((Date)this.getValue("AGRPGBE_ACTIVITY_DATE"));
		return v;
	}


	
	
	public void setAgrpgbeUserId(NString value){
		this.setValue("AGRPGBE_USER_ID", value.getValue());
	}


	public NString getAgrpgbeUserId(){
		NString v = new NString((String)this.getValue("AGRPGBE_USER_ID"));
		return v;
	}


	
	// F2J_TODO : Item AGRPGBE_PIDM has the "Copy Value from Item" property defined, with value: KEY_BLOCK.PIDM                  
	
	public void setAgrpgbePidm(NNumber value){
		this.setValue("AGRPGBE_PIDM", value.getValue());
	}


	public NNumber getAgrpgbePidm(){
		NNumber v = new NNumber((BigDecimal)this.getValue("AGRPGBE_PIDM"));
		return v;
	}


	
	
	public void setAgrpgbePgbePidm(NNumber value){
		this.setValue("AGRPGBE_PGBE_PIDM", value.getValue());
	}


	public NNumber getAgrpgbePgbePidm(){
		NNumber v = new NNumber((BigDecimal)this.getValue("AGRPGBE_PGBE_PIDM"));
		return v;
	}


	
	
	public void setAgrpgbeDataOrigin(NString value){
		this.setValue("AGRPGBE_DATA_ORIGIN", value.getValue());
	}


	public NString getAgrpgbeDataOrigin(){
		NString v = new NString((String)this.getValue("AGRPGBE_DATA_ORIGIN"));
		return v;
	}


	
	
	public void setPgbeName(NString value){
		this.setValue("PGBE_NAME", value.getValue());
	}


	public NString getPgbeName(){
		NString v = new NString((String)this.getValue("PGBE_NAME"));
		return v;
	}


	
	
	public void setPgbeChangeInd(NString value){
		this.setValue("PGBE_CHANGE_IND", value.getValue());
	}


	public NString getPgbeChangeInd(){
		NString v = new NString((String)this.getValue("PGBE_CHANGE_IND"));
		return v;
	}


	

	
}
