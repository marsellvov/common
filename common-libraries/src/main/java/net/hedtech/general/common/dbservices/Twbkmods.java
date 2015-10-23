package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Twbkmods {
		public static void pDelTwgrwprmPidmLikeName(NNumber pidmIn,NString nameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKMODS.P_DEL_TWGRWPRM_PIDM_LIKE_NAME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@NAME_IN", nameIn);
				
			cmd.execute();


		}
		
		public static void pDeleteTwgrwprm(NNumber pidmIn,NString name1In,NString name2In,NString name3In) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKMODS.P_DELETE_TWGRWPRM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@NAME_1_IN", name1In);
			cmd.addParameter("@NAME_2_IN", name2In);
			cmd.addParameter("@NAME_3_IN", name3In);
				
			cmd.execute();


		}
		
		public static void pDeleteTwgrwprmPidmName(NNumber pidmIn,NString nameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKMODS.P_DELETE_TWGRWPRM_PIDM_NAME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@NAME_IN", nameIn);
				
			cmd.execute();


		}
		
		public static void pInsertTwgbwses(NString randomIdIn,NDate lastAccessIn,NNumber loginAttemptsIn,NString loginReqIndIn,NNumber sessionidIn,NString prevRandomIdIn,NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKMODS.P_INSERT_TWGBWSES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RANDOM_ID_IN", randomIdIn);
			cmd.addParameter("@LAST_ACCESS_IN", lastAccessIn);
			cmd.addParameter("@LOGIN_ATTEMPTS_IN", loginAttemptsIn);
			cmd.addParameter("@LOGIN_REQ_IND_IN", loginReqIndIn);
			cmd.addParameter("@SESSIONID_IN", sessionidIn);
			cmd.addParameter("@PREV_RANDOM_ID_IN", prevRandomIdIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();


		}
		
		public static void pInsertTwgrwprm(NNumber pidmIn,NString nameIn,NString valueIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKMODS.P_INSERT_TWGRWPRM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@NAME_IN", nameIn);
			cmd.addParameter("@VALUE_IN", valueIn);
				
			cmd.execute();


		}
		
		public static void pUpdateTwgbwses(NString randomIdIn,NDate lastAccessIn,NNumber loginAttemptsIn,NString loginReqInd,NNumber sessionidIn,NString prevRandomIdIn,NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKMODS.P_UPDATE_TWGBWSES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RANDOM_ID_IN", randomIdIn);
			cmd.addParameter("@LAST_ACCESS_IN", lastAccessIn);
			cmd.addParameter("@LOGIN_ATTEMPTS_IN", loginAttemptsIn);
			cmd.addParameter("@LOGIN_REQ_IND", loginReqInd);
			cmd.addParameter("@SESSIONID_IN", sessionidIn);
			cmd.addParameter("@PREV_RANDOM_ID_IN", prevRandomIdIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();


		}
		
		public static void pUpdateTwgrwprm(NNumber pidmIn,NString nameIn,NString valueIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKMODS.P_UPDATE_TWGRWPRM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@NAME_IN", nameIn);
			cmd.addParameter("@VALUE_IN", valueIn);
				
			cmd.execute();


		}
		
	
	
	
}
