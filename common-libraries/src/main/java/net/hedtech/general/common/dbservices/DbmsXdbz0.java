package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class DbmsXdbz0 {
		public static NString FcheckprivrlsDeletepf(NString objectSchema,NString objectName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBZ0.CHECKPRIVRLS_DELETEPF", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@OBJECT_SCHEMA", objectSchema);
			cmd.addParameter("@OBJECT_NAME", objectName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FcheckprivrlsDeletepropf(NString objectSchema,NString objectName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBZ0.CHECKPRIVRLS_DELETEPROPF", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@OBJECT_SCHEMA", objectSchema);
			cmd.addParameter("@OBJECT_NAME", objectName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FcheckprivrlsInsertpf(NString objectSchema,NString objectName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBZ0.CHECKPRIVRLS_INSERTPF", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@OBJECT_SCHEMA", objectSchema);
			cmd.addParameter("@OBJECT_NAME", objectName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FcheckprivrlsSelectpf(NString objectSchema,NString objectName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBZ0.CHECKPRIVRLS_SELECTPF", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@OBJECT_SCHEMA", objectSchema);
			cmd.addParameter("@OBJECT_NAME", objectName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FcheckprivrlsSelectpropf(NString objectSchema,NString objectName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBZ0.CHECKPRIVRLS_SELECTPROPF", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@OBJECT_SCHEMA", objectSchema);
			cmd.addParameter("@OBJECT_NAME", objectName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FcheckprivrlsUpdatepf(NString objectSchema,NString objectName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBZ0.CHECKPRIVRLS_UPDATEPF", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@OBJECT_SCHEMA", objectSchema);
			cmd.addParameter("@OBJECT_NAME", objectName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FcheckprivrlsUpdatepropf(NString objectSchema,NString objectName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBZ0.CHECKPRIVRLS_UPDATEPROPF", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@OBJECT_SCHEMA", objectSchema);
			cmd.addParameter("@OBJECT_NAME", objectName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FcheckworkspacePf(NString objectSchema,NString objectName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBZ0.CHECKWORKSPACE_PF", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@OBJECT_SCHEMA", objectSchema);
			cmd.addParameter("@OBJECT_NAME", objectName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void disableHierarchyInternal(NString objectSchema,NString objectName,NInteger hierarchyType,NBool deleteOldVersions) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBZ0.DISABLE_HIERARCHY_INTERNAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OBJECT_SCHEMA", objectSchema);
			cmd.addParameter("@OBJECT_NAME", objectName);
			cmd.addParameter("@HIERARCHY_TYPE", hierarchyType);
			cmd.addParameter("@DELETE_OLD_VERSIONS", deleteOldVersions);
				
			cmd.execute();


		}
		
		public static void enableHierarchyInternal(NString objectSchema,NString objectName,NInteger hierarchyType,NBool schemareg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBZ0.ENABLE_HIERARCHY_INTERNAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OBJECT_SCHEMA", objectSchema);
			cmd.addParameter("@OBJECT_NAME", objectName);
			cmd.addParameter("@HIERARCHY_TYPE", hierarchyType);
			cmd.addParameter("@SCHEMAREG", schemareg);
				
			cmd.execute();


		}
		
		public static NString FgenerateTrgnm(NString objectSchema,NString objectName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBZ0.GENERATE_TRGNM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@OBJECT_SCHEMA", objectSchema);
			cmd.addParameter("@OBJECT_NAME", objectName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgenerateTrgnmdl(NString objectSchema,NString objectName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBZ0.GENERATE_TRGNMDL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@OBJECT_SCHEMA", objectSchema);
			cmd.addParameter("@OBJECT_NAME", objectName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static  FgetValidAcl(byte[] acloid) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBZ0.GET_VALID_ACL", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@ACLOID", acloid);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
		public static void initxdbresconfig() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBZ0.INITXDBRESCONFIG", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void initxdbsecurity() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBZ0.INITXDBSECURITY", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static NBool FisHierarchyEnabledInternal(NString objSchema,NString objName,NInteger hierarchyType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBZ0.IS_HIERARCHY_ENABLED_INTERNAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@OBJ_SCHEMA", objSchema);
			cmd.addParameter("@OBJ_NAME", objName);
			cmd.addParameter("@HIERARCHY_TYPE", hierarchyType);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool FisHierarchyEnabledTrig(NString objSchema,NString objName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBZ0.IS_HIERARCHY_ENABLED_TRIG", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@OBJ_SCHEMA", objSchema);
			cmd.addParameter("@OBJ_NAME", objName);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void migratePitrig() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBZ0.MIGRATE_PITRIG", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void setDeltaCalcInlineTrigflag(NString tablename,NString tableschema,NBool flag,NBool schemareg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBZ0.SET_DELTA_CALC_INLINE_TRIGFLAG", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TABLENAME", tablename);
			cmd.addParameter("@TABLESCHEMA", tableschema);
			cmd.addParameter("@FLAG", flag);
			cmd.addParameter("@SCHEMAREG", schemareg);
				
			cmd.execute();


		}
		
		public static NString FtruncateName(NString _object,NString suffix,NInteger numBytes) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBZ0.TRUNCATE_NAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@OBJECT", _object);
			cmd.addParameter("@SUFFIX", suffix);
			cmd.addParameter("@NUM_BYTES", numBytes);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void updateTableDependantFlags(NString tablename,NString tableschema,NInteger flag) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBZ0.UPDATE_TABLE_DEPENDANT_FLAGS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TABLENAME", tablename);
			cmd.addParameter("@TABLESCHEMA", tableschema);
			cmd.addParameter("@FLAG", flag);
				
			cmd.execute();


		}
		
	
	
	
}
