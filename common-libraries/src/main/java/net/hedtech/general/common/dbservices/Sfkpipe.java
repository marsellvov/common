package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Sfkpipe {
		public static void killAllServers() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKPIPE.KILL_ALL_SERVERS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pSfkcmplSubmit(NNumber sfOneUpNo,NString sfRunmode,NNumber sfPidm,NNumber sfNewRequestNo,Ref<NNumber> sfStatus) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKPIPE.P_SFKCMPL_SUBMIT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SF_ONE_UP_NO", sfOneUpNo);
			cmd.addParameter("@SF_RUNMODE", sfRunmode);
			cmd.addParameter("@SF_PIDM", sfPidm);
			cmd.addParameter("@SF_NEW_REQUEST_NO", sfNewRequestNo);
			cmd.addParameter("@SF_STATUS", NNumber.class);
				
			cmd.execute();
			sfStatus.val = cmd.getParameterValue("@SF_STATUS", NNumber.class);


		}
		
		public static void pTestSfkcmplSubmit(NNumber testOneUpNo,NString testRunmode,NNumber testPidm,NNumber testNewRequestNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKPIPE.P_TEST_SFKCMPL_SUBMIT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TEST_ONE_UP_NO", testOneUpNo);
			cmd.addParameter("@TEST_RUNMODE", testRunmode);
			cmd.addParameter("@TEST_PIDM", testPidm);
			cmd.addParameter("@TEST_NEW_REQUEST_NO", testNewRequestNo);
				
			cmd.execute();


		}
		
		public static void showSfbpipeStatus() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKPIPE.SHOW_SFBPIPE_STATUS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void showSfrpipeStatus() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKPIPE.SHOW_SFRPIPE_STATUS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
