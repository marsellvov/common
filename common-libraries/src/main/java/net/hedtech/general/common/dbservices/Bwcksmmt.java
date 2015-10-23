package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwcksmmt {
		public static NBool fCanDelete(NNumber param1,NNumber param2,NString param3) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMMT.F_CAN_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PARAM1", param1);
			cmd.addParameter("@PARAM2", param2);
			cmd.addParameter("@PARAM3", param3);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fDelAllowed(NString param1,NString param2) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMMT.F_DEL_ALLOWED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PARAM1", param1);
			cmd.addParameter("@PARAM2", param2);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fExistingReq(NNumber param1) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMMT.F_EXISTING_REQ", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PARAM1", param1);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NString FgetDateFmt() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMMT.GET_DATE_FMT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetProgramDesc(NString param1) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMMT.GET_PROGRAM_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PARAM1", param1);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetTimeFmt() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMMT.GET_TIME_FMT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pDisplayPageWithDelete(NNumber pidmIn,NNumber origPidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMMT.P_DISPLAY_PAGE_WITH_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@ORIG_PIDM_IN", origPidmIn);
				
			cmd.execute();


		}
		
		public static void pDisplayPageWithoutDelete(NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMMT.P_DISPLAY_PAGE_WITHOUT_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();


		}
		
		public static void pDisppreveval(NString termIn,NString pinNumb,NString msg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMMT.P_DISPPREVEVAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIN_NUMB", pinNumb);
			cmd.addParameter("@MSG", msg);
				
			cmd.execute();


		}
		
	
	
	
}
