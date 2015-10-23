package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RbRtvaprd {
		public static NString fCodeExists(NString pCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_RTVAPRD.F_CODE_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CODE", pCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetDescription(NString pCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_RTVAPRD.F_GET_DESCRIPTION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CODE", pCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetFullYearAprd() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_RTVAPRD.F_GET_FULL_YEAR_APRD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetFullYrPct(NString pCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_RTVAPRD.F_GET_FULL_YR_PCT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CODE", pCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetTfcPct(NString pCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_RTVAPRD.F_GET_TFC_PCT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CODE", pCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	
}
