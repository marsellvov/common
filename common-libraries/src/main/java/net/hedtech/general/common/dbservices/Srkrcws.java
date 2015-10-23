package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Srkrcws {
		public static NNumber fGenerateRidm() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SRKRCWS.F_GENERATE_RIDM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fTranslateCode(NString pTableName,NString pInterfaceCode,NString pTapeCode,Ref<NString> pErrorCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SRKRCWS.F_TRANSLATE_CODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_INTERFACE_CODE", pInterfaceCode);
			cmd.addParameter("@P_TAPE_CODE", pTapeCode);
			cmd.addParameter("@P_ERROR_CODE", NString.class);
				
			cmd.execute();
			pErrorCode.val = cmd.getParameterValue("@P_ERROR_CODE", NString.class);

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pValidateEmailAddress(NString pEmalCode,NString pEmailAddress,Ref<NString> pErrorCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SRKRCWS.P_VALIDATE_EMAIL_ADDRESS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EMAL_CODE", pEmalCode);
			cmd.addParameter("@P_EMAIL_ADDRESS", pEmailAddress);
			cmd.addParameter("@P_ERROR_CODE", NString.class);
				
			cmd.execute();
			pErrorCode.val = cmd.getParameterValue("@P_ERROR_CODE", NString.class);


		}
		
	
	
	
}
