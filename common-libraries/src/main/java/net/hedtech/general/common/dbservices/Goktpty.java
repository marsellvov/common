package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Goktpty {
		public static NString fCharacterFilter(NString nameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKTPTY.F_CHARACTER_FILTER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@NAME_IN", nameIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCheckExternalUser(NNumber pidm,NString userid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKTPTY.F_CHECK_EXTERNAL_USER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@USERID", userid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool fCreatePinOk(NString tableNameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKTPTY.F_CREATE_PIN_OK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@TABLE_NAME_IN", tableNameIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NString fGenerateExternalUser(NNumber pidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKTPTY.F_GENERATE_EXTERNAL_USER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM", pidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fResetPin(NNumber pidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKTPTY.F_RESET_PIN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM", pidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool fValidatePin(NString pin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKTPTY.F_VALIDATE_PIN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PIN", pin);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void pGetGlobalPidm() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKTPTY.P_GET_GLOBAL_PIDM", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pInsertGobtpac(NNumber pidmIn,Ref<NString> resultOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKTPTY.P_INSERT_GOBTPAC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@RESULT_OUT", NString.class);
				
			cmd.execute();
			resultOut.val = cmd.getParameterValue("@RESULT_OUT", NString.class);


		}
		
		public static void pSaveGlobalPidm(NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKTPTY.P_SAVE_GLOBAL_PIDM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();


		}
		
	
	
	
}
