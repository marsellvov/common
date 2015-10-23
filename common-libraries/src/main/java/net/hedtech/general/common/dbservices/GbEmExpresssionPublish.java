package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GbEmExpresssionPublish {
		public static void pPublishAsyncExpr(NString pXml,NString pJobId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_EM_EXPRESSSION_PUBLISH.P_PUBLISH_ASYNC_EXPR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_XML", pXml);
			cmd.addParameter("@P_JOB_ID", pJobId);
				
			cmd.execute();


		}
		
	
	
	
}
