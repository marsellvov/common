package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Twbkovrr {
		public static void pDispalloverrides(NString returnCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKOVRR.P_DISPALLOVERRIDES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RETURN_CODE", returnCode);
				
			cmd.execute();


		}
		
		public static void pModifypgoverride(NString conditionIn,NString replaceValueIn,NString transType,NString returnCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKOVRR.P_MODIFYPGOVERRIDE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CONDITION_IN", conditionIn);
			cmd.addParameter("@REPLACE_VALUE_IN", replaceValueIn);
			cmd.addParameter("@TRANS_TYPE", transType);
			cmd.addParameter("@RETURN_CODE", returnCode);
				
			cmd.execute();


		}
		
		public static void pSaveoverride(NString conditionIn,NString replaceValueIn,NString transType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKOVRR.P_SAVEOVERRIDE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CONDITION_IN", conditionIn);
			cmd.addParameter("@REPLACE_VALUE_IN", replaceValueIn);
			cmd.addParameter("@TRANS_TYPE", transType);
				
			cmd.execute();


		}
		
	
	
	
}
