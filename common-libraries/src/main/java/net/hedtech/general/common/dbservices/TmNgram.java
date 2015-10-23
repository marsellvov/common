package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class TmNgram {
		public static void deleteTempstr(NString pStr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TM_NGRAM.DELETE_TEMPSTR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_STR", pStr);
				
			cmd.execute();


		}
		
		public static void insertStr(NString pStr,NNumber n,NNumber pStrcode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TM_NGRAM.INSERT_STR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_STR", pStr);
			cmd.addParameter("@N", n);
			cmd.addParameter("@P_STRCODE", pStrcode);
				
			cmd.execute();


		}
		
		public static void insertTempstr(NString pStr,NNumber pN) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TM_NGRAM.INSERT_TEMPSTR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_STR", pStr);
			cmd.addParameter("@P_N", pN);
				
			cmd.execute();


		}
		
		public static void rebuildIdx(NNumber pN,NBool pVerbose) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TM_NGRAM.REBUILD_IDX", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_N", pN);
			cmd.addParameter("@P_VERBOSE", pVerbose);
				
			cmd.execute();


		}
		
	
	
	
}
