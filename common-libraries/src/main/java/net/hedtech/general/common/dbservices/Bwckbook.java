package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwckbook {
		public static NBool fBookstoreEnabled(NString pPageIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKBOOK.F_BOOKSTORE_ENABLED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_PAGE_IN", pPageIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NString fGetInternalUrlTxt() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKBOOK.F_GET_INTERNAL_URL_TXT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void site(NString pTermIn,NString pSubjIn,NString pCrseNumbIn,NString pSeqIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKBOOK.SITE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_IN", pTermIn);
			cmd.addParameter("@P_SUBJ_IN", pSubjIn);
			cmd.addParameter("@P_CRSE_NUMB_IN", pCrseNumbIn);
			cmd.addParameter("@P_SEQ_IN", pSeqIn);
				
			cmd.execute();


		}
		
		public static void site() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKBOOK.SITE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
