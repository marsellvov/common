package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Gspvpdi {
		public static void getMifCodesByPidm(NNumber pidmIn,Ref<DataCursor> pCursor) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GSPVPDI.GET_MIF_CODES_BY_PIDM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@P_CURSOR", DataCursor.class);
				
			cmd.execute();
			pCursor.val = cmd.getParameterValue("@P_CURSOR", DataCursor.class);


		}
		
		public static void getMifCodesForUser(NString userIn,Ref<DataCursor> pCursor) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GSPVPDI.GET_MIF_CODES_FOR_USER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@USER_IN", userIn);
			cmd.addParameter("@P_CURSOR", DataCursor.class);
				
			cmd.execute();
			pCursor.val = cmd.getParameterValue("@P_CURSOR", DataCursor.class);


		}
		
		public static NString FgetMifDefaultCodeForUser(NString userIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GSPVPDI.GET_MIF_DEFAULT_CODE_FOR_USER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@USER_IN", userIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void getMifHomeCodesForUser(NString userIn,Ref<DataCursor> pCursor) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GSPVPDI.GET_MIF_HOME_CODES_FOR_USER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@USER_IN", userIn);
			cmd.addParameter("@P_CURSOR", DataCursor.class);
				
			cmd.execute();
			pCursor.val = cmd.getParameterValue("@P_CURSOR", DataCursor.class);


		}
		
		public static NBool FisVpdiCodeValid(NString userIn,NString vpdiCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GSPVPDI.IS_VPDI_CODE_VALID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@USER_IN", userIn);
			cmd.addParameter("@VPDI_CODE_IN", vpdiCodeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
	
	
	
}
