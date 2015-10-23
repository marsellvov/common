package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Sakl045 {
		public static void pLoadGoremal(NNumber aidm,NNumber applSeqno,NNumber seqno,NString wappCode,NNumber pidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKL045.P_LOAD_GOREMAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AIDM", aidm);
			cmd.addParameter("@APPL_SEQNO", applSeqno);
			cmd.addParameter("@SEQNO", seqno);
			cmd.addParameter("@WAPP_CODE", wappCode);
			cmd.addParameter("@PIDM", pidm);
				
			cmd.execute();


		}
		
	
	
	
}
