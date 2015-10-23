package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwpkelev {
		public static void pLeavehistorybody(NNumber pidm,NString leavCode,NString leavMethod,NString yr,NString pRecordNo,NString posn,NString suff) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKELEV.P_LEAVEHISTORYBODY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@LEAV_CODE", leavCode);
			cmd.addParameter("@LEAV_METHOD", leavMethod);
			cmd.addParameter("@YR", yr);
			cmd.addParameter("@P_RECORD_NO", pRecordNo);
			cmd.addParameter("@POSN", posn);
			cmd.addParameter("@SUFF", suff);
				
			cmd.execute();


		}
		
	
	
	
}
