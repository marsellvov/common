package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Fvkdeps {
		public static void pReplicateDepretiation(NString pColumn,NString pValueChar,NNumber pValueNumber,NDate pValueDate,NString pInvh,NString pOtag,Ref<NNumber> pRowsupdOut,Ref<NString> pErrmsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FVKDEPS.P_REPLICATE_DEPRETIATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_COLUMN", pColumn);
			cmd.addParameter("@P_VALUE_CHAR", pValueChar);
			cmd.addParameter("@P_VALUE_NUMBER", pValueNumber);
			cmd.addParameter("@P_VALUE_DATE", pValueDate);
			cmd.addParameter("@P_INVH", pInvh);
			cmd.addParameter("@P_OTAG", pOtag);
			cmd.addParameter("@P_ROWSUPD_OUT", NNumber.class);
			cmd.addParameter("@P_ERRMSG_OUT", NString.class);
				
			cmd.execute();
			pRowsupdOut.val = cmd.getParameterValue("@P_ROWSUPD_OUT", NNumber.class);
			pErrmsgOut.val = cmd.getParameterValue("@P_ERRMSG_OUT", NString.class);


		}
		
	
	
	
}
