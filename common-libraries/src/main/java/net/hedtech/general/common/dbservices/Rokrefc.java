package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Rokrefc {
		public static void pGetArscData(Ref<DataCursor> pResultsetInout,NString pAidyCode,NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKREFC.P_GET_ARSC_DATA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_RESULTSET_INOUT", DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();
			pResultsetInout.val = cmd.getParameterValue("@P_RESULTSET_INOUT", DataCursor.class);


		}
		
	
	
	@DbRecordType(id="ArscRecRow", dataSourceName="ARSC_REC")
	public static class ArscRecRow
	{
		@DbRecordField(dataSourceName="ARSC_REC_TYPE_CODE")
		public NString ArscRecTypeCode;
		@DbRecordField(dataSourceName="ARSC_REC_CONTRACT_PIDM")
		public NNumber ArscRecContractPidm;
		@DbRecordField(dataSourceName="ARSC_REC_RESOURCE_NUMBER")
		public NString ArscRecResourceNumber;
		@DbRecordField(dataSourceName="ARSC_REC_DESC")
		public NString ArscRecDesc;
		@DbRecordField(dataSourceName="ARSC_REC_TERM_CODE")
		public NString ArscRecTermCode;
		@DbRecordField(dataSourceName="ARSC_REC_ESTIMATED_AMT")
		public NNumber ArscRecEstimatedAmt;
		@DbRecordField(dataSourceName="ARSC_REC_ACTUAL_AMT")
		public NNumber ArscRecActualAmt;
		@DbRecordField(dataSourceName="ARSC_REC_INFO_ACCESS_IND")
		public NString ArscRecInfoAccessInd;
		@DbRecordField(dataSourceName="ARSC_REC_ACTIVITY_DATE")
		public NDate ArscRecActivityDate;
	}

	
	
}
