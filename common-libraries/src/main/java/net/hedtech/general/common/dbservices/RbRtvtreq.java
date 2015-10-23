package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RbRtvtreq {
		public static NString fCodeExists(NString pCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_RTVTREQ.F_CODE_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CODE", pCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCodeIsActive(NString pCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_RTVTREQ.F_CODE_IS_ACTIVE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CODE", pCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetInstructions(NString pCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_RTVTREQ.F_GET_INSTRUCTIONS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CODE", pCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetLongDescription(NString pCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_RTVTREQ.F_GET_LONG_DESCRIPTION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CODE", pCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetShortDescription(NString pCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_RTVTREQ.F_GET_SHORT_DESCRIPTION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CODE", pCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetValue(NString pCode,NString pColumnName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_RTVTREQ.F_GET_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	
}
