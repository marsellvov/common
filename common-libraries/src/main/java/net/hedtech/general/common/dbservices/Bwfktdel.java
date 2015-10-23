package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwfktdel {
		public static NBool fValidname(NString qname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKTDEL.F_VALIDNAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@QNAME", qname);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fValidtname(NString qname,NString qtype,NString systemwide) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKTDEL.F_VALIDTNAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@QNAME", qname);
			cmd.addParameter("@QTYPE", qtype);
			cmd.addParameter("@SYSTEMWIDE", systemwide);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void pDisplayDupQuery(NNumber pidm,NString qname,NString qtype,NString systemwide) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKTDEL.P_DISPLAY_DUP_QUERY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@QNAME", qname);
			cmd.addParameter("@QTYPE", qtype);
			cmd.addParameter("@SYSTEMWIDE", systemwide);
				
			cmd.execute();


		}
		
		public static void pDisplayRetrievePulldown(NNumber pidm,NString qtype,NString printNone) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKTDEL.P_DISPLAY_RETRIEVE_PULLDOWN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@QTYPE", qtype);
			cmd.addParameter("@PRINT_NONE", printNone);
				
			cmd.execute();


		}
		
		public static void pSavedTemplateDel(NString action,NString userid,NString qname,NString qtype,NString sharedType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKTDEL.P_SAVED_TEMPLATE_DEL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ACTION", action);
			cmd.addParameter("@USERID", userid);
			cmd.addParameter("@QNAME", qname);
			cmd.addParameter("@QTYPE", qtype);
			cmd.addParameter("@SHARED_TYPE", sharedType);
				
			cmd.execute();


		}
		
//		public static void pSavedTemplateDel(NString action,Ref<List<Twbklibs.Varchar2TabtypeRow>> checkBox1,NString userid,NString qname,NString qtype,NString sharedType) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKTDEL.P_SAVED_TEMPLATE_DEL", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@ACTION", action);
//			// cmd.addParameter(DbTypes.getTableType("CHECK_BOX1", "", checkBox1.val, object.class , true));
//			cmd.addParameter("@USERID", userid);
//			cmd.addParameter("@QNAME", qname);
//			cmd.addParameter("@QTYPE", qtype);
//			cmd.addParameter("@SHARED_TYPE", sharedType);
//				
//			cmd.execute();
//			// checkBox1.val = cmd.getTableParameterValue("@CHECK_BOX1", object.class);
//
//
//		}
		
		public static void pTemplateRetrievedMsg(NString qname,NString qtype,NString systemwide) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKTDEL.P_TEMPLATE_RETRIEVED_MSG", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@QNAME", qname);
			cmd.addParameter("@QTYPE", qtype);
			cmd.addParameter("@SYSTEMWIDE", systemwide);
				
			cmd.execute();


		}
		
		public static void pTemplateSavedMsg(NString qname,NString qtype,NString systemwide) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKTDEL.P_TEMPLATE_SAVED_MSG", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@QNAME", qname);
			cmd.addParameter("@QTYPE", qtype);
			cmd.addParameter("@SYSTEMWIDE", systemwide);
				
			cmd.execute();


		}
		
	
	
	
}
