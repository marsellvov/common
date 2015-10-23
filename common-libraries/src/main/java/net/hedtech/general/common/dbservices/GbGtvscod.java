package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GbGtvscod {
		public static NString fCodeExists(NString pElementId,NString pCode,NString pStandardInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GTVSCOD.F_CODE_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ELEMENT_ID", pElementId);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_STANDARD_IND", pStandardInd);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetDescription(NString pElementId,NString pCode,NString pStandardInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GTVSCOD.F_GET_DESCRIPTION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ELEMENT_ID", pElementId);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_STANDARD_IND", pStandardInd);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	
}
