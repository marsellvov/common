package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Sokcpln {
		public static void pCommplanMaterials(NNumber pidm,NNumber pLcurSeqno,NString pCplnCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKCPLN.P_COMMPLAN_MATERIALS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@P_LCUR_SEQNO", pLcurSeqno);
			cmd.addParameter("@P_CPLN_CODE", pCplnCode);
				
			cmd.execute();


		}
		
		public static void pCreateMaterials(NNumber pidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKCPLN.P_CREATE_MATERIALS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
				
			cmd.execute();


		}
		
	
	
	
}
