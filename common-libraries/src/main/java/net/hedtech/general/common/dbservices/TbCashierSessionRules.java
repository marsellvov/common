package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class TbCashierSessionRules {
		public static NString fCurrentOrClosed(NString pUser,NNumber pSessionNumber,NDate pEndDate,NNumber pExistingSessionNumber,NDate pExistingEndDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_CASHIER_SESSION_RULES.F_CURRENT_OR_CLOSED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_SESSION_NUMBER", pSessionNumber);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_EXISTING_SESSION_NUMBER", pExistingSessionNumber);
			cmd.addParameter("@P_EXISTING_END_DATE", pExistingEndDate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	
}
