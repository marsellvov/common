package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwskeltr {
		public static void pEltr(NNumber idval,NString letrCode,NString termCode,NNumber seqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKELTR.P_ELTR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IDVAL", idval);
			cmd.addParameter("@LETR_CODE", letrCode);
			cmd.addParameter("@TERM_CODE", termCode);
			cmd.addParameter("@SEQNO", seqno);
				
			cmd.execute();


		}
		
	
	
	
}
