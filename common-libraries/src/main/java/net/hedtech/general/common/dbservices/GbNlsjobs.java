package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GbNlsjobs {
		public static NBool fIsValidSessionValue(NString pValue,NString pTypeInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_NLSJOBS.F_IS_VALID_SESSION_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_TYPE_IND", pTypeInd);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NNumber fSessionValueToNumber(NString pValue,NString pTypeInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_NLSJOBS.F_SESSION_VALUE_TO_NUMBER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_TYPE_IND", pTypeInd);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fToDbValue(NString pValue,NString pTypeInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_NLSJOBS.F_TO_DB_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_TYPE_IND", pTypeInd);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fToDbValue(NString pValue,NString pJob,NString pNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_NLSJOBS.F_TO_DB_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_JOB", pJob);
			cmd.addParameter("@P_NUMBER", pNumber);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fToSessionValue(NString pValue,NString pTypeInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_NLSJOBS.F_TO_SESSION_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_TYPE_IND", pTypeInd);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fToSessionValue(NString pValue,NString pJob,NString pNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_NLSJOBS.F_TO_SESSION_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_JOB", pJob);
			cmd.addParameter("@P_NUMBER", pNumber);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	
}
