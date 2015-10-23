package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Pakrecr {
		public static NString fSdaxApplStat(NNumber pidm,NString reqNo,NString sdaxCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PAKRECR.F_SDAX_APPL_STAT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@REQ_NO", reqNo);
			cmd.addParameter("@SDAX_CODE", sdaxCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pBuildpatrecr(NDate fromDate,NDate thruDate,NString userId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PAKRECR.P_BUILDPATRECR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@FROM_DATE", fromDate);
			cmd.addParameter("@THRU_DATE", thruDate);
			cmd.addParameter("@USER_ID", userId);
				
			cmd.execute();


		}
		
	
	
	
}
