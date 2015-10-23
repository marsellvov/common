package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class WwvFlowCustomize {
//		public static void accept(NString pRequest,NString pFlow,NString pPage,NString pSession,List<WwvFlowGlobal.VcArr2Row> pCheck,NString pLang) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_CUSTOMIZE.ACCEPT", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_REQUEST", pRequest);
//			cmd.addParameter("@P_FLOW", pFlow);
//			cmd.addParameter("@P_PAGE", pPage);
//			cmd.addParameter("@P_SESSION", pSession);
//			// cmd.addParameter(DbTypes.getTableType("P_CHECK", "", pCheck, object.class));
//			cmd.addParameter("@P_LANG", pLang);
//				
//			cmd.execute();
//
//
//		}
		
		public static NString FgetLink(NString pText) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_CUSTOMIZE.GET_LINK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TEXT", pText);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void show(NString pFlow,NString pPage,NString pSession,NString pLang) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_CUSTOMIZE.SHOW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FLOW", pFlow);
			cmd.addParameter("@P_PAGE", pPage);
			cmd.addParameter("@P_SESSION", pSession);
			cmd.addParameter("@P_LANG", pLang);
				
			cmd.execute();


		}
		
	
	
	
}
