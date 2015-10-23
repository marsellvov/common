package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class DbmsXdbz {
		public static void disableHierarchy(NString objectSchema,NString objectName,NInteger hierarchyType,NBool deleteOldVersions) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBZ.DISABLE_HIERARCHY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OBJECT_SCHEMA", objectSchema);
			cmd.addParameter("@OBJECT_NAME", objectName);
			cmd.addParameter("@HIERARCHY_TYPE", hierarchyType);
			cmd.addParameter("@DELETE_OLD_VERSIONS", deleteOldVersions);
				
			cmd.execute();


		}
		
		public static void enableHierarchy(NString objectSchema,NString objectName,NInteger hierarchyType,NBool schemareg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBZ.ENABLE_HIERARCHY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OBJECT_SCHEMA", objectSchema);
			cmd.addParameter("@OBJECT_NAME", objectName);
			cmd.addParameter("@HIERARCHY_TYPE", hierarchyType);
			cmd.addParameter("@SCHEMAREG", schemareg);
				
			cmd.execute();


		}
		
		public static NBool FgetAcloid(NString aclpath,Ref<byte[]> acloid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBZ.GET_ACLOID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@ACLPATH", aclpath);
			cmd.addParameter("@ACLOID", byte[].class);
				
			cmd.execute();
			acloid.val = cmd.getParameterValue("@ACLOID", byte[].class);

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool FgetUserid(NString username,Ref<byte[]> userid,NInteger format) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBZ.GET_USERID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@USERNAME", username);
			cmd.addParameter("@USERID", byte[].class);
			cmd.addParameter("@FORMAT", format);
				
			cmd.execute();
			userid.val = cmd.getParameterValue("@USERID", byte[].class);

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void getUsername(byte[] userid,Ref<NString> username) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBZ.GET_USERNAME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@USERID", userid);
			cmd.addParameter("@USERNAME", NString.class);
				
			cmd.execute();
			username.val = cmd.getParameterValue("@USERNAME", NString.class);


		}
		
		public static NBool FisHierarchyEnabled(NString objectSchema,NString objectName,NInteger hierarchyType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBZ.IS_HIERARCHY_ENABLED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@OBJECT_SCHEMA", objectSchema);
			cmd.addParameter("@OBJECT_NAME", objectName);
			cmd.addParameter("@HIERARCHY_TYPE", hierarchyType);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool Fpurgeldapcache() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBZ.PURGELDAPCACHE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void validateacl(byte[] acloid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBZ.VALIDATEACL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ACLOID", acloid);
				
			cmd.execute();


		}
		
	
	
	
}
