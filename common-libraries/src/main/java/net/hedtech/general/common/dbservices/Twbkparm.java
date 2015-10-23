package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Twbkparm {
		public static void pDispallparams(NString returnCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKPARM.P_DISPALLPARAMS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RETURN_CODE", returnCode);
				
			cmd.execute();


		}
		
		public static void pModifypgparam(NString paramNameIn,NString paramValueIn,NString transType,NString returnCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKPARM.P_MODIFYPGPARAM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARAM_NAME_IN", paramNameIn);
			cmd.addParameter("@PARAM_VALUE_IN", paramValueIn);
			cmd.addParameter("@TRANS_TYPE", transType);
			cmd.addParameter("@RETURN_CODE", returnCode);
				
			cmd.execute();


		}
		
		public static void pSaveparam(NString paramNameIn,NString paramValueIn,NString transType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKPARM.P_SAVEPARAM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARAM_NAME_IN", paramNameIn);
			cmd.addParameter("@PARAM_VALUE_IN", paramValueIn);
			cmd.addParameter("@TRANS_TYPE", transType);
				
			cmd.execute();


		}
		
	
	
	
}
