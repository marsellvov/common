package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RokArchiveTestStrings {
		public static NString fGetError(NString pErrorname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROK_ARCHIVE_TEST_STRINGS.F_GET_ERROR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ERRORNAME", pErrorname);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetErrorWithValue(NString pPackage,NString pErrorname,NString pValue01,NString pValue02,NString pValue03) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROK_ARCHIVE_TEST_STRINGS.F_GET_ERROR_WITH_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PACKAGE", pPackage);
			cmd.addParameter("@P_ERRORNAME", pErrorname);
			cmd.addParameter("@P_VALUE01", pValue01);
			cmd.addParameter("@P_VALUE02", pValue02);
			cmd.addParameter("@P_VALUE03", pValue03);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	
}
