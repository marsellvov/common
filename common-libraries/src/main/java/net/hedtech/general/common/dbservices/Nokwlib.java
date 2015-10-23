package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Nokwlib {
		public static void pGetNextPafUserid(Ref<NString> pafUserid,Ref<NString> gotUserid,NNumber pafTransNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKWLIB.P_GET_NEXT_PAF_USERID", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PAF_USERID", pafUserid, true);
			cmd.addParameter("@GOT_USERID", gotUserid, true);
			cmd.addParameter("@PAF_TRANS_NO", pafTransNo);
				
			cmd.execute();
			pafUserid.val = cmd.getParameterValue("@PAF_USERID", NString.class);
			gotUserid.val = cmd.getParameterValue("@GOT_USERID", NString.class);


		}
		
	
	
	
}
