package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Saklibs {
		public static NString fGetSaveap1(NNumber pAidm,NNumber pApplSqno,NString pTableInd,NString pType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKLIBS.F_GET_SAVEAP1", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_AIDM", pAidm);
			cmd.addParameter("@P_APPL_SQNO", pApplSqno);
			cmd.addParameter("@P_TABLE_IND", pTableInd);
			cmd.addParameter("@P_TYPE", pType);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	
}
