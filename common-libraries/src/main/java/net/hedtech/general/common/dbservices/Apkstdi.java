package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Apkstdi {
		public static void pConvertSgrdutyComments(NNumber ttrmPidm,NString coopEmplCode,NString coopTermCode,NString coopLevlCode,NNumber ehisSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APKSTDI.P_CONVERT_SGRDUTY_COMMENTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TTRM_PIDM", ttrmPidm);
			cmd.addParameter("@COOP_EMPL_CODE", coopEmplCode);
			cmd.addParameter("@COOP_TERM_CODE", coopTermCode);
			cmd.addParameter("@COOP_LEVL_CODE", coopLevlCode);
			cmd.addParameter("@EHIS_SEQ_NO", ehisSeqNo);
				
			cmd.execute();


		}
		
	
	
	
}
