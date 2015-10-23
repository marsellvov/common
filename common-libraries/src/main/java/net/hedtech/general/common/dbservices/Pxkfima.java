package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Pxkfima {
//		public static void pGetFima(NString pEmpr,NString pYear,NString pQtr,Ref<List<FimaTabtypeRow>> pFimaTabOut) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PXKFIMA.P_GET_FIMA", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_EMPR", pEmpr);
//			cmd.addParameter("@P_YEAR", pYear);
//			cmd.addParameter("@P_QTR", pQtr);
//			// cmd.addParameter(DbTypes.getTableType("P_FIMA_TAB_OUT", "", object.class));
//				
//			cmd.execute();
//			// pFimaTabOut.val = cmd.getTableParameterValue("@P_FIMA_TAB_OUT", object.class);
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
