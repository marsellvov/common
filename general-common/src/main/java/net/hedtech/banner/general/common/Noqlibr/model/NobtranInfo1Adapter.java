package  net.hedtech.banner.general.common.Noqlibr.model;

import java.util.Date;
import java.math.BigDecimal;

import org.jdesktop.databuffer.DataRow;

import morphis.foundations.core.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.configuration.DAOConfiguration;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;



public class NobtranInfo1Adapter extends BaseRowAdapter{
	

	public NobtranInfo1Adapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setNobtranCreatedDate(NDate value){
		this.setValue("NOBTRAN_CREATED_DATE", value.getValue());
	}


	public NDate getNobtranCreatedDate(){
		NDate v = new NDate((Date)this.getValue("NOBTRAN_CREATED_DATE"));
		return v;
	}


	
	
	public void setNobtranOriginatorUserId(NString value){
		this.setValue("NOBTRAN_ORIGINATOR_USER_ID", value.getValue());
	}


	public NString getNobtranOriginatorUserId(){
		NString v = new NString((String)this.getValue("NOBTRAN_ORIGINATOR_USER_ID"));
		return v;
	}


	
	
	public void setNobtranSubmissionDate(NDate value){
		this.setValue("NOBTRAN_SUBMISSION_DATE", value.getValue());
	}


	public NDate getNobtranSubmissionDate(){
		NDate v = new NDate((Date)this.getValue("NOBTRAN_SUBMISSION_DATE"));
		return v;
	}


	
	
	public void setNobtranSubmittorUserId(NString value){
		this.setValue("NOBTRAN_SUBMITTOR_USER_ID", value.getValue());
	}


	public NString getNobtranSubmittorUserId(){
		NString v = new NString((String)this.getValue("NOBTRAN_SUBMITTOR_USER_ID"));
		return v;
	}


	
	
	public void setNobtranApplyDate(NDate value){
		this.setValue("NOBTRAN_APPLY_DATE", value.getValue());
	}


	public NDate getNobtranApplyDate(){
		NDate v = new NDate((Date)this.getValue("NOBTRAN_APPLY_DATE"));
		return v;
	}


	
	
	public void setNobtranApplyUserId(NString value){
		this.setValue("NOBTRAN_APPLY_USER_ID", value.getValue());
	}


	public NString getNobtranApplyUserId(){
		NString v = new NString((String)this.getValue("NOBTRAN_APPLY_USER_ID"));
		return v;
	}


	
	
	public void setNobtranTransactionNo(NNumber value){
		this.setValue("NOBTRAN_TRANSACTION_NO", value.getValue());
	}


	public NNumber getNobtranTransactionNo(){
		NNumber v = new NNumber((BigDecimal)this.getValue("NOBTRAN_TRANSACTION_NO"));
		return v;
	}


	
	
	public void setNobtranPidm(NNumber value){
		this.setValue("NOBTRAN_PIDM", value.getValue());
	}


	public NNumber getNobtranPidm(){
		NNumber v = new NNumber((BigDecimal)this.getValue("NOBTRAN_PIDM"));
		return v;
	}


	
	
	public void setDataSeparatorLine0(NString value){
		this.setValue("DATA_SEPARATOR_LINE_0", value.getValue());
	}


	public NString getDataSeparatorLine0(){
		NString v = new NString((String)this.getValue("DATA_SEPARATOR_LINE_0"));
		return v;
	}


	

	public  java.sql.RowId getROWID(){
		return (java.sql.RowId) this.getValue(DAOConfiguration.MODEL_ROWID);
	}
	
}
