package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RbRoratbt {
		public static NString fCodeExists(NString pCodTestCde,NDate pStartDate,NDate pEndDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_RORATBT.F_CODE_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_COD_TEST_CDE", pCodTestCde);
			cmd.addParameter("@P_START_DATE", pStartDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsValidCompDate(NString pCodTestCde,NDate pCompDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_RORATBT.F_IS_VALID_COMP_DATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_COD_TEST_CDE", pCodTestCde);
			cmd.addParameter("@P_COMP_DATE", pCompDate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	
}
