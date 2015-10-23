package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Gkkrsql {
		public static NBool fValidateSqlRule(NString sqprCodeIn,NString sqlStmt,Ref<NString> errMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKRSQL.F_VALIDATE_SQL_RULE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@SQPR_CODE_IN", sqprCodeIn);
			cmd.addParameter("@SQL_STMT", sqlStmt);
			cmd.addParameter("@ERR_MSG", NString.class);
				
			cmd.execute();
			errMsg.val = cmd.getParameterValue("@ERR_MSG", NString.class);

			return cmd.getReturnValue(NBool.class);

		}
		
	
	
	
}
