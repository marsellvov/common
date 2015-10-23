package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Twbkretc {
		public static void pModifypgreturnloc(NString returnCode,NString returnMsg,NString transType,NString returnCodeIn,NString descIn,NString returnLocFrIn,NString returnLocWmIn,NString ovrStartpageIn,NString locationTypeIn,NString loginForwardIndIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKRETC.P_MODIFYPGRETURNLOC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RETURN_CODE", returnCode);
			cmd.addParameter("@RETURN_MSG", returnMsg);
			cmd.addParameter("@TRANS_TYPE", transType);
			cmd.addParameter("@RETURN_CODE_IN", returnCodeIn);
			cmd.addParameter("@DESC_IN", descIn);
			cmd.addParameter("@RETURN_LOC_FR_IN", returnLocFrIn);
			cmd.addParameter("@RETURN_LOC_WM_IN", returnLocWmIn);
			cmd.addParameter("@OVR_STARTPAGE_IN", ovrStartpageIn);
			cmd.addParameter("@LOCATION_TYPE_IN", locationTypeIn);
			cmd.addParameter("@LOGIN_FORWARD_IND_IN", loginForwardIndIn);
				
			cmd.execute();


		}
		
		public static void pOptionpgreturnloc(NString returnCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKRETC.P_OPTIONPGRETURNLOC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RETURN_CODE", returnCode);
				
			cmd.execute();


		}
		
//		public static void pSavereturnloc(NString transType,NString returnCodeIn,NString descIn,NString returnLocFrIn,NString returnLocWmIn,NString ovrStartpageIn,NString locationTypeIn,NString loginForwardIndIn,List<Twbklibs.Varchar2TabtypeRow> packageTableIn,NString numPackagesIn,NString addPackage1In,NString addPackage2In,NString addPackage3In,List<Twbklibs.Varchar2TabtypeRow> moduleTableIn,NString numModulesIn,NString addModule1In,NString addModule2In,NString addModule3In) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKRETC.P_SAVERETURNLOC", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@TRANS_TYPE", transType);
//			cmd.addParameter("@RETURN_CODE_IN", returnCodeIn);
//			cmd.addParameter("@DESC_IN", descIn);
//			cmd.addParameter("@RETURN_LOC_FR_IN", returnLocFrIn);
//			cmd.addParameter("@RETURN_LOC_WM_IN", returnLocWmIn);
//			cmd.addParameter("@OVR_STARTPAGE_IN", ovrStartpageIn);
//			cmd.addParameter("@LOCATION_TYPE_IN", locationTypeIn);
//			cmd.addParameter("@LOGIN_FORWARD_IND_IN", loginForwardIndIn);
//			// cmd.addParameter(DbTypes.getTableType("PACKAGE_TABLE_IN", "", packageTableIn, object.class));
//			cmd.addParameter("@NUM_PACKAGES_IN", numPackagesIn);
//			cmd.addParameter("@ADD_PACKAGE1_IN", addPackage1In);
//			cmd.addParameter("@ADD_PACKAGE2_IN", addPackage2In);
//			cmd.addParameter("@ADD_PACKAGE3_IN", addPackage3In);
//			// cmd.addParameter(DbTypes.getTableType("MODULE_TABLE_IN", "", moduleTableIn, object.class));
//			cmd.addParameter("@NUM_MODULES_IN", numModulesIn);
//			cmd.addParameter("@ADD_MODULE1_IN", addModule1In);
//			cmd.addParameter("@ADD_MODULE2_IN", addModule2In);
//			cmd.addParameter("@ADD_MODULE3_IN", addModule3In);
//				
//			cmd.execute();
//
//
//		}
		
	
	
	
}
