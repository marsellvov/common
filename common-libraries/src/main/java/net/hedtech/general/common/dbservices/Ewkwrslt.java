package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Ewkwrslt {
		public static void pDispPage(NString vId,NString vTyp,NString vString,NString vAppId,NString vWhere) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EWKWRSLT.P_DISP_PAGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@V_ID", vId);
			cmd.addParameter("@V_TYP", vTyp);
			cmd.addParameter("@V_STRING", vString);
			cmd.addParameter("@V_APP_ID", vAppId);
			cmd.addParameter("@V_WHERE", vWhere);
				
			cmd.execute();


		}
		
	
	
	
}
