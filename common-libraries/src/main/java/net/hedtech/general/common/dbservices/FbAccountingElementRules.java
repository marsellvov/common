package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class FbAccountingElementRules {
		public static void pRegisterEntity(NNumber pOperationId,NString pElementType,NString pChartCode,NString pElementCode,NString pTitle,NDate pEffDate,NDate pTermDate,NString pStatus) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_ACCOUNTING_ELEMENT_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_ID", pOperationId);
			cmd.addParameter("@P_ELEMENT_TYPE", pElementType);
			cmd.addParameter("@P_CHART_CODE", pChartCode);
			cmd.addParameter("@P_ELEMENT_CODE", pElementCode);
			cmd.addParameter("@P_TITLE", pTitle);
			cmd.addParameter("@P_EFF_DATE", pEffDate);
			cmd.addParameter("@P_TERM_DATE", pTermDate);
			cmd.addParameter("@P_STATUS", pStatus);
				
			cmd.execute();


		}
		
	
	
	
}
