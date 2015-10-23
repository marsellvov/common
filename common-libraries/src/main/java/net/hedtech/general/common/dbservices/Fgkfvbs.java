package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Fgkfvbs {
		public static NString fDocFundOrg(NString pDocCode,NDate pDocDate,NNumber pDocType,NString pAccessMode,NString pUserId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FGKFVBS.F_DOC_FUND_ORG", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_DOC_CODE", pDocCode);
			cmd.addParameter("@P_DOC_DATE", pDocDate);
			cmd.addParameter("@P_DOC_TYPE", pDocType);
			cmd.addParameter("@P_ACCESS_MODE", pAccessMode);
			cmd.addParameter("@P_USER_ID", pUserId);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	
}
