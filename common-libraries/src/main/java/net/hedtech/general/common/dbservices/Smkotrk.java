package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Smkotrk {
		public static void pOthertracking(NNumber pidm,NString user,NString term,NString ssubInd,NString strgInd,NString swavInd,NString stpvInd,NString sspvInd,NString swpvInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKOTRK.P_OTHERTRACKING", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@USER", user);
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@SSUB_IND", ssubInd);
			cmd.addParameter("@STRG_IND", strgInd);
			cmd.addParameter("@SWAV_IND", swavInd);
			cmd.addParameter("@STPV_IND", stpvInd);
			cmd.addParameter("@SSPV_IND", sspvInd);
			cmd.addParameter("@SWPV_IND", swpvInd);
				
			cmd.execute();


		}
		
	
	
	
}
