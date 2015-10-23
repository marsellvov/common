package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Gokeacc {
		public static NString fGetgtvsdaxextcode(NString internalCode,NString groupCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKEACC.F_GETGTVSDAXEXTCODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@INTERNAL_CODE", internalCode);
			cmd.addParameter("@GROUP_CODE", groupCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fUsername(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKEACC.F_USERNAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pGetgobeaccinfo(Ref<NString> username,Ref<NNumber> pidm,Ref<NString> vSpridenId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKEACC.P_GETGOBEACCINFO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@USERNAME", username, true);
			cmd.addParameter("@PIDM", pidm, true);
			cmd.addParameter("@V_SPRIDEN_ID", NString.class);
				
			cmd.execute();
			username.val = cmd.getParameterValue("@USERNAME", NString.class);
			pidm.val = cmd.getParameterValue("@PIDM", NNumber.class);
			vSpridenId.val = cmd.getParameterValue("@V_SPRIDEN_ID", NString.class);


		}
		
		public static void pGetwfusername(NNumber pidm,Ref<NString> username) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKEACC.P_GETWFUSERNAME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@USERNAME", NString.class);
				
			cmd.execute();
			username.val = cmd.getParameterValue("@USERNAME", NString.class);


		}
		
	
	
	
}
