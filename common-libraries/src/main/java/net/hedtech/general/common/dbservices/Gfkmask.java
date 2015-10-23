package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Gfkmask {
		public static void getmaskbannerallusers(NString cpForm,NString cpUser,Ref<DataCursor> pCursor) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GFKMASK.GETMASKBANNERALLUSERS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CP_FORM", cpForm);
			cmd.addParameter("@CP_USER", cpUser);
			cmd.addParameter("@P_CURSOR", DataCursor.class);
				
			cmd.execute();
			pCursor.val = cmd.getParameterValue("@P_CURSOR", DataCursor.class);


		}
		
		public static void getmaskbannerbusinessprofile(NString cpForm,NString cpUser,Ref<DataCursor> pCursor) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GFKMASK.GETMASKBANNERBUSINESSPROFILE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CP_FORM", cpForm);
			cmd.addParameter("@CP_USER", cpUser);
			cmd.addParameter("@P_CURSOR", DataCursor.class);
				
			cmd.execute();
			pCursor.val = cmd.getParameterValue("@P_CURSOR", DataCursor.class);


		}
		
		public static void getmaskbanneruser(NString cpForm,NString cpUser,Ref<DataCursor> pCursor) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GFKMASK.GETMASKBANNERUSER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CP_FORM", cpForm);
			cmd.addParameter("@CP_USER", cpUser);
			cmd.addParameter("@P_CURSOR", DataCursor.class);
				
			cmd.execute();
			pCursor.val = cmd.getParameterValue("@P_CURSOR", DataCursor.class);


		}
		
		public static void ismasking(NString cpForm,Ref<DataCursor> pCursor) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GFKMASK.ISMASKING", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CP_FORM", cpForm);
			cmd.addParameter("@P_CURSOR", DataCursor.class);
				
			cmd.execute();
			pCursor.val = cmd.getParameterValue("@P_CURSOR", DataCursor.class);


		}
		
	
	
	
}
