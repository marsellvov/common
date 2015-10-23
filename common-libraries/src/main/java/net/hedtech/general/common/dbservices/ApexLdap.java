package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class ApexLdap {
		public static void authenticate() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_LDAP.AUTHENTICATE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void getAllUserAttributes() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_LDAP.GET_ALL_USER_ATTRIBUTES", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void getUserAttributes() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_LDAP.GET_USER_ATTRIBUTES", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void isMember() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_LDAP.IS_MEMBER", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void memberOf() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_LDAP.MEMBER_OF", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void memberOf2() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_LDAP.MEMBER_OF2", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
