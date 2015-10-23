package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class CwDependency {
		public static void getcalledobjectsid(NNumber iObjectid,Ref<NString> oStrobjectsid,NInteger iNrecursive,NInteger iNdepth) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CW_DEPENDENCY.GETCALLEDOBJECTSID", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@I_OBJECTID", iObjectid);
			cmd.addParameter("@O_STROBJECTSID", NString.class);
			cmd.addParameter("@I_NRECURSIVE", iNrecursive);
			cmd.addParameter("@I_NDEPTH", iNdepth);
				
			cmd.execute();
			oStrobjectsid.val = cmd.getParameterValue("@O_STROBJECTSID", NString.class);


		}
		
		public static void getcallingobjectsid(NNumber iObjectid,Ref<NString> oStrobjectsid,NInteger iNrecursive,NInteger iNdepth) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CW_DEPENDENCY.GETCALLINGOBJECTSID", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@I_OBJECTID", iObjectid);
			cmd.addParameter("@O_STROBJECTSID", NString.class);
			cmd.addParameter("@I_NRECURSIVE", iNrecursive);
			cmd.addParameter("@I_NDEPTH", iNdepth);
				
			cmd.execute();
			oStrobjectsid.val = cmd.getParameterValue("@O_STROBJECTSID", NString.class);


		}
		
		public static void getdependentobjectsid(NNumber iObjectid,Ref<NString> oStrobjectsid,NInteger iNrecursive,NInteger iNdepth) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CW_DEPENDENCY.GETDEPENDENTOBJECTSID", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@I_OBJECTID", iObjectid);
			cmd.addParameter("@O_STROBJECTSID", NString.class);
			cmd.addParameter("@I_NRECURSIVE", iNrecursive);
			cmd.addParameter("@I_NDEPTH", iNdepth);
				
			cmd.execute();
			oStrobjectsid.val = cmd.getParameterValue("@O_STROBJECTSID", NString.class);


		}
		
		public static void getobject(NNumber iObjectid,Ref<NString> oStrobjtype,Ref<NString> oStrobjowner,Ref<NString> oStrobjname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CW_DEPENDENCY.GETOBJECT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@I_OBJECTID", iObjectid);
			cmd.addParameter("@O_STROBJTYPE", NString.class);
			cmd.addParameter("@O_STROBJOWNER", NString.class);
			cmd.addParameter("@O_STROBJNAME", NString.class);
				
			cmd.execute();
			oStrobjtype.val = cmd.getParameterValue("@O_STROBJTYPE", NString.class);
			oStrobjowner.val = cmd.getParameterValue("@O_STROBJOWNER", NString.class);
			oStrobjname.val = cmd.getParameterValue("@O_STROBJNAME", NString.class);


		}
		
		public static NInteger Fgetobjectcompilestatus(NNumber iObjectid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CW_DEPENDENCY.GETOBJECTCOMPILESTATUS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
			cmd.addParameter("@I_OBJECTID", iObjectid);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NNumber Fgetobjectid(NString iStrobjtype,NString iStrobjowner,NString iStrobjname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CW_DEPENDENCY.GETOBJECTID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@I_STROBJTYPE", iStrobjtype);
			cmd.addParameter("@I_STROBJOWNER", iStrobjowner);
			cmd.addParameter("@I_STROBJNAME", iStrobjname);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NInteger Fgetobjectstatus(NNumber iObjectid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CW_DEPENDENCY.GETOBJECTSTATUS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
			cmd.addParameter("@I_OBJECTID", iObjectid);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
	
	
	
}
