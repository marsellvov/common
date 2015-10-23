package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Twbkchnl {
		public static void pModifychannel(NString returnCode,NString returnMsg,NString transType,NString nameIn,NString moduleIn,NString insecureAllowedIndIn,NString typeIn,NString origNameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKCHNL.P_MODIFYCHANNEL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RETURN_CODE", returnCode);
			cmd.addParameter("@RETURN_MSG", returnMsg);
			cmd.addParameter("@TRANS_TYPE", transType);
			cmd.addParameter("@NAME_IN", nameIn);
			cmd.addParameter("@MODULE_IN", moduleIn);
			cmd.addParameter("@INSECURE_ALLOWED_IND_IN", insecureAllowedIndIn);
			cmd.addParameter("@TYPE_IN", typeIn);
			cmd.addParameter("@ORIG_NAME_IN", origNameIn);
				
			cmd.execute();


		}
		
//		public static void pSavechannel(NString transType,NString submitbutton,NString nameIn,NString moduleIn,NString insecureAllowedIndIn,NString typeIn,List<Twbklibs.Varchar2TabtypeRow> roleTableIn,NString numRolesIn,NString origNameIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKCHNL.P_SAVECHANNEL", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@TRANS_TYPE", transType);
//			cmd.addParameter("@SUBMITBUTTON", submitbutton);
//			cmd.addParameter("@NAME_IN", nameIn);
//			cmd.addParameter("@MODULE_IN", moduleIn);
//			cmd.addParameter("@INSECURE_ALLOWED_IND_IN", insecureAllowedIndIn);
//			cmd.addParameter("@TYPE_IN", typeIn);
//			// cmd.addParameter(DbTypes.getTableType("ROLE_TABLE_IN", "", roleTableIn, object.class));
//			cmd.addParameter("@NUM_ROLES_IN", numRolesIn);
//			cmd.addParameter("@ORIG_NAME_IN", origNameIn);
//				
//			cmd.execute();
//
//
//		}
		
		public static void pSelectchannel(NString returnCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKCHNL.P_SELECTCHANNEL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RETURN_CODE", returnCode);
				
			cmd.execute();


		}
		
	
	
	
}
