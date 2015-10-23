package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Soksels {
		public static NString fArCleared(NString pWhichGroup,NString pWhichGroupCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKSELS.F_AR_CLEARED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_WHICH_GROUP", pWhichGroup);
			cmd.addParameter("@P_WHICH_GROUP_CODE", pWhichGroupCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetSobsbgi(NString pSbgiCode,NString pRetInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKSELS.F_GET_SOBSBGI", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_RET_IND", pRetInd);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void fGetSobtermRow() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKSELS.F_GET_SOBTERM_ROW", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static NString fGurmailValue(NString pInternalCode,NNumber pPidm,NNumber pPosition,NString pInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKSELS.F_GURMAIL_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_INTERNAL_CODE", pInternalCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSITION", pPosition);
			cmd.addParameter("@P_IND", pInd);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	
}
