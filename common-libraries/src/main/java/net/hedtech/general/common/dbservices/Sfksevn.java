package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Sfksevn {
		public static NBool fValidCpRegistration(NString rstsCodeIn,NString messageIn,NString errorFlagIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKSEVN.F_VALID_CP_REGISTRATION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@RSTS_CODE_IN", rstsCodeIn);
			cmd.addParameter("@MESSAGE_IN", messageIn);
			cmd.addParameter("@ERROR_FLAG_IN", errorFlagIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void pSendAddRegistration(NNumber pidmIn,NString crnIn,NString termCodeIn,NString rstsCodeIn,NString errorFlagIn,NString messageIn,NString oldRstsCodeIn,NString oldErrorFlagIn,NString oldMessageIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKSEVN.P_SEND_ADD_REGISTRATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@TERM_CODE_IN", termCodeIn);
			cmd.addParameter("@RSTS_CODE_IN", rstsCodeIn);
			cmd.addParameter("@ERROR_FLAG_IN", errorFlagIn);
			cmd.addParameter("@MESSAGE_IN", messageIn);
			cmd.addParameter("@OLD_RSTS_CODE_IN", oldRstsCodeIn);
			cmd.addParameter("@OLD_ERROR_FLAG_IN", oldErrorFlagIn);
			cmd.addParameter("@OLD_MESSAGE_IN", oldMessageIn);
				
			cmd.execute();


		}
		
		public static void pSendDropRegistration(NNumber pidmIn,NString crnIn,NString termCodeIn,NString rstsCodeIn,NString errorFlagIn,NString messageIn,NString newRstsCodeIn,NString newErrorFlagIn,NString newMessageIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKSEVN.P_SEND_DROP_REGISTRATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@TERM_CODE_IN", termCodeIn);
			cmd.addParameter("@RSTS_CODE_IN", rstsCodeIn);
			cmd.addParameter("@ERROR_FLAG_IN", errorFlagIn);
			cmd.addParameter("@MESSAGE_IN", messageIn);
			cmd.addParameter("@NEW_RSTS_CODE_IN", newRstsCodeIn);
			cmd.addParameter("@NEW_ERROR_FLAG_IN", newErrorFlagIn);
			cmd.addParameter("@NEW_MESSAGE_IN", newMessageIn);
				
			cmd.execute();


		}
		
	
	
	
}
