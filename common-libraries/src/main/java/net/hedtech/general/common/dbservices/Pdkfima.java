package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Pdkfima {
//		public static void pGetFima(NString pEmpr,NString pYear,NString pQtr,Ref<List<FimaTabtypeRow>> pFimaTab) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PDKFIMA.P_GET_FIMA", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_EMPR", pEmpr);
//			cmd.addParameter("@P_YEAR", pYear);
//			cmd.addParameter("@P_QTR", pQtr);
//			// cmd.addParameter(DbTypes.getTableType("P_FIMA_TAB", "", object.class));
//				
//			cmd.execute();
//			// pFimaTab.val = cmd.getTableParameterValue("@P_FIMA_TAB", object.class);
//
//
//		}
		
	
	
	@DbRecordType(id="FimaRectypeRow", dataSourceName="FIMA_RECTYPE")
	public static class FimaRectypeRow
	{
		@DbRecordField(dataSourceName="R_EVENT_DATE")
		public NDate REventDate;
		@DbRecordField(dataSourceName="R_PICT")
		public NString RPict;
		@DbRecordField(dataSourceName="R_PAYNO")
		public NNumber RPayno;
		@DbRecordField(dataSourceName="R_FIMA_AMT")
		public NNumber RFimaAmt;
	}

	
	
}
