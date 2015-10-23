package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Gokimag {
		public static NBool fIsBxsInstalled() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKIMAG.F_IS_BXS_INSTALLED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void pChangeAxPassword(NString username,NString password) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKIMAG.P_CHANGE_AX_PASSWORD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@USERNAME", username);
			cmd.addParameter("@PASSWORD", password);
				
			cmd.execute();


		}
		
		public static void pCheckImaging(NString currentformIn,NString currentblockIn,NString currentitemIn,NString usernameIn,Ref<NString> imagingUserIndInOut,Ref<NString> message1InOut,Ref<NString> message2InOut,Ref<NString> message3InOut,Ref<NString> message4InOut,Ref<NString> message5InOut,Ref<NString> message6InOut,Ref<NString> message7InOut,Ref<NString> message8InOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKIMAG.P_CHECK_IMAGING", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CURRENTFORM_IN", currentformIn);
			cmd.addParameter("@CURRENTBLOCK_IN", currentblockIn);
			cmd.addParameter("@CURRENTITEM_IN", currentitemIn);
			cmd.addParameter("@USERNAME_IN", usernameIn);
			cmd.addParameter("@IMAGING_USER_IND_IN_OUT", imagingUserIndInOut, true);
			cmd.addParameter("@MESSAGE1_IN_OUT", message1InOut, true);
			cmd.addParameter("@MESSAGE2_IN_OUT", message2InOut, true);
			cmd.addParameter("@MESSAGE3_IN_OUT", message3InOut, true);
			cmd.addParameter("@MESSAGE4_IN_OUT", message4InOut, true);
			cmd.addParameter("@MESSAGE5_IN_OUT", message5InOut, true);
			cmd.addParameter("@MESSAGE6_IN_OUT", message6InOut, true);
			cmd.addParameter("@MESSAGE7_IN_OUT", message7InOut, true);
			cmd.addParameter("@MESSAGE8_IN_OUT", message8InOut, true);
				
			cmd.execute();
			imagingUserIndInOut.val = cmd.getParameterValue("@IMAGING_USER_IND_IN_OUT", NString.class);
			message1InOut.val = cmd.getParameterValue("@MESSAGE1_IN_OUT", NString.class);
			message2InOut.val = cmd.getParameterValue("@MESSAGE2_IN_OUT", NString.class);
			message3InOut.val = cmd.getParameterValue("@MESSAGE3_IN_OUT", NString.class);
			message4InOut.val = cmd.getParameterValue("@MESSAGE4_IN_OUT", NString.class);
			message5InOut.val = cmd.getParameterValue("@MESSAGE5_IN_OUT", NString.class);
			message6InOut.val = cmd.getParameterValue("@MESSAGE6_IN_OUT", NString.class);
			message7InOut.val = cmd.getParameterValue("@MESSAGE7_IN_OUT", NString.class);
			message8InOut.val = cmd.getParameterValue("@MESSAGE8_IN_OUT", NString.class);


		}
		
		public static void pGetAxVersion(Ref<NString> axVersion,Ref<NString> schemaNameLocal) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKIMAG.P_GET_AX_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AX_VERSION", axVersion, true);
			cmd.addParameter("@SCHEMA_NAME_LOCAL", schemaNameLocal, true);
				
			cmd.execute();
			axVersion.val = cmd.getParameterValue("@AX_VERSION", NString.class);
			schemaNameLocal.val = cmd.getParameterValue("@SCHEMA_NAME_LOCAL", NString.class);


		}
		
		public static void pGetSchema(Ref<NString> schemaNameVal) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKIMAG.P_GET_SCHEMA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SCHEMA_NAME_VAL", schemaNameVal, true);
				
			cmd.execute();
			schemaNameVal.val = cmd.getParameterValue("@SCHEMA_NAME_VAL", NString.class);


		}
		
	
	
	
}
