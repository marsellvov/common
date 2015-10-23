package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GpIdentPublish {
		public static void pPublishIdentityEvent(NString pXml) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_IDENT_PUBLISH.P_PUBLISH_IDENTITY_EVENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_XML", pXml);
				
			cmd.execute();


		}
		
	
	
	
}
