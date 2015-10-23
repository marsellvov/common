package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Gkkcomm {
		public static NBool fnCheckCodeExists(NString pTable,NString pCodeTable,NString pCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKCOMM.FN_CHECK_CODE_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_TABLE", pTable);
			cmd.addParameter("@P_CODE_TABLE", pCodeTable);
			cmd.addParameter("@P_CODE", pCode);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NString fnErrorList() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKCOMM.FN_ERROR_LIST", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool fnGetDesc(NString pTable,NString pCode,Ref<NString> pDescOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKCOMM.FN_GET_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_TABLE", pTable);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_DESC_OUT", NString.class);
				
			cmd.execute();
			pDescOut.val = cmd.getParameterValue("@P_DESC_OUT", NString.class);

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NString fnGetParam(NString pParamName,NString pDefault,NBool pRequired,NString pSystem) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKCOMM.FN_GET_PARAM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PARAM_NAME", pParamName);
			cmd.addParameter("@P_DEFAULT", pDefault);
			cmd.addParameter("@P_REQUIRED", pRequired);
			cmd.addParameter("@P_SYSTEM", pSystem);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	
}
