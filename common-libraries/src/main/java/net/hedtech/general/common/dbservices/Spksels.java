package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Spksels {
		public static NString fCheckBillingHolds(NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SPKSELS.F_CHECK_BILLING_HOLDS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetAltPin(NNumber pidmIn,NString termIn,NString procIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SPKSELS.F_GET_ALT_PIN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PROC_IN", procIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NDate fGetBirthDate(NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SPKSELS.F_GET_BIRTH_DATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
		public static void fGetCurrIdenRec() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SPKSELS.F_GET_CURR_IDEN_REC", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void fGetSpbpersRec() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SPKSELS.F_GET_SPBPERS_REC", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static NNumber fGetSpridenPidm(NString idIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SPKSELS.F_GET_SPRIDEN_PIDM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@ID_IN", idIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
	
	
	
}
