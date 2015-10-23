package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Utsuiteutp {
		public static void add(NNumber suiteIdIn,NNumber utpIdIn,NNumber seqIn,NString enabledIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTSUITEUTP.ADD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SUITE_ID_IN", suiteIdIn);
			cmd.addParameter("@UTP_ID_IN", utpIdIn);
			cmd.addParameter("@SEQ_IN", seqIn);
			cmd.addParameter("@ENABLED_IN", enabledIn);
				
			cmd.execute();


		}
		
		public static NBool Fdefined(NNumber suiteIdIn,NNumber utpIdIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTSUITEUTP.DEFINED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@SUITE_ID_IN", suiteIdIn);
			cmd.addParameter("@UTP_ID_IN", utpIdIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NString Fenabled(NNumber suiteIdIn,NNumber utpIdIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTSUITEUTP.ENABLED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@SUITE_ID_IN", suiteIdIn);
			cmd.addParameter("@UTP_ID_IN", utpIdIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void rem(NNumber suiteIdIn,NNumber utpIdIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTSUITEUTP.REM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SUITE_ID_IN", suiteIdIn);
			cmd.addParameter("@UTP_ID_IN", utpIdIn);
				
			cmd.execute();


		}
		
		public static NNumber Fseq(NNumber suiteIdIn,NNumber utpIdIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTSUITEUTP.SEQ", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@SUITE_ID_IN", suiteIdIn);
			cmd.addParameter("@UTP_ID_IN", utpIdIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static DataCursor Futps(NString suiteIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTSUITEUTP.UTPS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@SUITE_IN", suiteIn);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor Futps(NNumber suiteIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTSUITEUTP.UTPS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@SUITE_IN", suiteIn);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
	
	
	
}
