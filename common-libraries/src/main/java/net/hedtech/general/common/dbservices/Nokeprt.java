package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Nokeprt {
		public static NString fGetmastereclassind(NString userId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPRT.F_GETMASTERECLASSIND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@USER_ID", userId);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetmasterempind(NString userId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPRT.F_GETMASTEREMPIND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@USER_ID", userId);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetmasterorgind(NString userId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPRT.F_GETMASTERORGIND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@USER_ID", userId);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fGetsalarylevel(NString userId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPRT.F_GETSALARYLEVEL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@USER_ID", userId);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fHrEclsSecurityOn() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPRT.F_HR_ECLS_SECURITY_ON", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fHrOrgnSecurityOn() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPRT.F_HR_ORGN_SECURITY_ON", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fHrSalaSecurityOn() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPRT.F_HR_SALA_SECURITY_ON", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fUserhasptruserrec(NString userId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPRT.F_USERHASPTRUSERREC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@USER_ID", userId);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void pGetAccessiblecoasorgs(Ref<DataCursor> parOrgnlist,NString parUserId,NString parCoasCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPRT.P_GET_ACCESSIBLECOASORGS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PAR_ORGNLIST", DataCursor.class);
			cmd.addParameter("@PAR_USER_ID", parUserId);
			cmd.addParameter("@PAR_COAS_CODE", parCoasCode);
				
			cmd.execute();
			parOrgnlist.val = cmd.getParameterValue("@PAR_ORGNLIST", DataCursor.class);


		}
		
		public static void pGetAccessibleeclscodes(Ref<DataCursor> parEclslist,NString parUserId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPRT.P_GET_ACCESSIBLEECLSCODES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PAR_ECLSLIST", DataCursor.class);
			cmd.addParameter("@PAR_USER_ID", parUserId);
				
			cmd.execute();
			parEclslist.val = cmd.getParameterValue("@PAR_ECLSLIST", DataCursor.class);


		}
		
	
	
	
}
