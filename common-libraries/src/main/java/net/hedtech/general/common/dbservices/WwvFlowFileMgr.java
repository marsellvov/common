package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class WwvFlowFileMgr {
		public static void getFile(NString pId,NString pMimeType,NString pInline) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_FILE_MGR.GET_FILE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_MIME_TYPE", pMimeType);
			cmd.addParameter("@P_INLINE", pInline);
				
			cmd.execute();


		}
		
		public static void getFile(NString pFname,NString pSecurityGroupId,NString pFlowId,NString pInline) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_FILE_MGR.GET_FILE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FNAME", pFname);
			cmd.addParameter("@P_SECURITY_GROUP_ID", pSecurityGroupId);
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_INLINE", pInline);
				
			cmd.execute();


		}
		
		public static NNumber FgetFileId(NString pFname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_FILE_MGR.GET_FILE_ID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_FNAME", pFname);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void processDownload() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_FILE_MGR.PROCESS_DOWNLOAD", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
