package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PvMisEj {
		public static void pGetElements(NString pReportNo,NString pEbReportNo,NString pCreateDataInd,NString pFinalInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_MIS_EJ.P_GET_ELEMENTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_REPORT_NO", pReportNo);
			cmd.addParameter("@P_EB_REPORT_NO", pEbReportNo);
			cmd.addParameter("@P_CREATE_DATA_IND", pCreateDataInd);
			cmd.addParameter("@P_FINAL_IND", pFinalInd);
				
			cmd.execute();


		}
		
	
	
	
}
