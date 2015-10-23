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



public class Gurmenu2Adapter extends BaseRowAdapter{
	

	public Gurmenu2Adapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setGurmenuObjName(NString value){
		this.setValue("GURMENU_OBJ_NAME", value.getValue());
	}


	public NString getGurmenuObjName(){
		NString v = new NString((String)this.getValue("GURMENU_OBJ_NAME"));
		return v;
	}


	
	
	public void setDisplayDesc(NString value){
		this.setValue("DISPLAY_DESC", value.getValue());
	}


	public NString getDisplayDesc(){
		NString v = new NString((String)this.getValue("DISPLAY_DESC"));
		return v;
	}


	
	
	public void setGurmenuName(NString value){
		this.setValue("GURMENU_NAME", value.getValue());
	}


	public NString getGurmenuName(){
		NString v = new NString((String)this.getValue("GURMENU_NAME"));
		return v;
	}


	
	
	public void setGurmenuDesc(NString value){
		this.setValue("GURMENU_DESC", value.getValue());
	}


	public NString getGurmenuDesc(){
		NString v = new NString((String)this.getValue("GURMENU_DESC"));
		return v;
	}


	
	
	public void setGurmenuSortSeq(NNumber value){
		this.setValue("GURMENU_SORT_SEQ", value.getValue());
	}


	public NNumber getGurmenuSortSeq(){
		NNumber v = new NNumber((BigDecimal)this.getValue("GURMENU_SORT_SEQ"));
		return v;
	}


	
	
	public void setGurmenuUserId(NString value){
		this.setValue("GURMENU_USER_ID", value.getValue());
	}


	public NString getGurmenuUserId(){
		NString v = new NString((String)this.getValue("GURMENU_USER_ID"));
		return v;
	}


	
	
	public void setGurmenuActivityDate(NDate value){
		this.setValue("GURMENU_ACTIVITY_DATE", value.getValue());
	}


	public NDate getGurmenuActivityDate(){
		NDate v = new NDate((Date)this.getValue("GURMENU_ACTIVITY_DATE"));
		return v;
	}


	
	
	public void setHoldDesc(NString value){
		this.setValue("HOLD_DESC", value.getValue());
	}


	public NString getHoldDesc(){
		NString v = new NString((String)this.getValue("HOLD_DESC"));
		return v;
	}


	
	
	public void setObjType(NString value){
		this.setValue("OBJ_TYPE", value.getValue());
	}


	public NString getObjType(){
		NString v = new NString((String)this.getValue("OBJ_TYPE"));
		return v;
	}


	
	
	public void setGurmenuCount(NNumber value){
		this.setValue("GURMENU_COUNT", value.getValue());
	}


	public NNumber getGurmenuCount(){
		NNumber v = new NNumber((BigDecimal)this.getValue("GURMENU_COUNT"));
		return v;
	}


	

	public void setROWID(byte[] bytes) {
		this.setROWID(DbManager.getDataBaseFactory().createRowid(bytes));
	}
 
	public void setROWID(java.sql.RowId rowId) {
		this.setValue(DAOConfiguration.MODEL_ROWID, rowId);
	}
	
}
