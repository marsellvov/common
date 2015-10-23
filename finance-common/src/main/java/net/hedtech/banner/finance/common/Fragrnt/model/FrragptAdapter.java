package  net.hedtech.banner.finance.common.Fragrnt.model;

import java.util.Date;
import java.math.BigDecimal;

import org.jdesktop.databuffer.DataRow;

import morphis.foundations.core.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.DAO;
import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appdatalayer.data.configuration.*;



public class FrragptAdapter extends BaseRowAdapter{
	

	public FrragptAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}


		     	
	public void setFrragptGrntCode(NString value){
		this.setValue("FRRAGPT_GRNT_CODE", value.getValue());
	}


	public NString getFrragptGrntCode(){
		NString v = new NString((String)this.getValue("FRRAGPT_GRNT_CODE"));
		return v;
	}


	
	
	public void setFrragptAgencyCode(NString value){
		this.setValue("FRRAGPT_AGENCY_CODE", value.getValue());
	}


	public NString getFrragptAgencyCode(){
		NString v = new NString((String)this.getValue("FRRAGPT_AGENCY_CODE"));
		return v;
	}


	
	
	public void setFrragptAgcyPidm(NNumber value){
		this.setValue("FRRAGPT_AGCY_PIDM", value.getValue());
	}


	public NNumber getFrragptAgcyPidm(){
		NNumber v = new NNumber((BigDecimal)this.getValue("FRRAGPT_AGCY_PIDM"));
		return v;
	}


	
	
	public void setFrragptAgcyName(NString value){
		this.setValue("FRRAGPT_AGCY_NAME", value.getValue());
	}


	public NString getFrragptAgcyName(){
		NString v = new NString((String)this.getValue("FRRAGPT_AGCY_NAME"));
		return v;
	}


	
	
	public void setFrragptFederalFundPercent(NNumber value){
		this.setValue("FRRAGPT_FEDERAL_FUND_PERCENT", value.getValue());
	}


	public NNumber getFrragptFederalFundPercent(){
		NNumber v = new NNumber((BigDecimal)this.getValue("FRRAGPT_FEDERAL_FUND_PERCENT"));
		return v;
	}


	
	
	public void setFrragptSponsorId(NString value){
		this.setValue("FRRAGPT_SPONSOR_ID", value.getValue());
	}


	public NString getFrragptSponsorId(){
		NString v = new NString((String)this.getValue("FRRAGPT_SPONSOR_ID"));
		return v;
	}


	
	
	public void setFrragptActivityDate(NDate value){
		this.setValue("FRRAGPT_ACTIVITY_DATE", value.getValue());
	}


	public NDate getFrragptActivityDate(){
		NDate v = new NDate((Date)this.getValue("FRRAGPT_ACTIVITY_DATE"));
		return v;
	}


	
	
	public void setFrragptUserId(NString value){
		this.setValue("FRRAGPT_USER_ID", value.getValue());
	}


	public NString getFrragptUserId(){
		NString v = new NString((String)this.getValue("FRRAGPT_USER_ID"));
		return v;
	}


	

	public void setROWID(byte[] bytes) {
		this.setROWID(DbManager.getDataBaseFactory().createRowid(bytes));
	}
 
	public void setROWID(java.sql.RowId rowId) {
		this.setValue(DAOConfiguration.MODEL_ROWID, rowId);
	}
	
}
