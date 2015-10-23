package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class WwvFlowImageApi {
//		public static NNumber FnewImageRepositoryRecord(Ref<NString> pName,List<DbmsSql.Varchar2TableRow> pVarchar2Table,NString pMimetype,NNumber pFlowId,NString pNlang,NNumber pHeight,NNumber pWidth,NString pNotes) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_IMAGE_API.NEW_IMAGE_REPOSITORY_RECORD", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@P_NAME", pName, true);
//			// cmd.addParameter(DbTypes.getTableType("P_VARCHAR2_TABLE", "", pVarchar2Table, object.class));
//			cmd.addParameter("@P_MIMETYPE", pMimetype);
//			cmd.addParameter("@P_FLOW_ID", pFlowId);
//			cmd.addParameter("@P_NLANG", pNlang);
//			cmd.addParameter("@P_HEIGHT", pHeight);
//			cmd.addParameter("@P_WIDTH", pWidth);
//			cmd.addParameter("@P_NOTES", pNotes);
//				
//			cmd.execute();
//			pName.val = cmd.getParameterValue("@P_NAME", NString.class);
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
		
		public static void removeImage(NString pImageName,NNumber pFlowId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_IMAGE_API.REMOVE_IMAGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_IMAGE_NAME", pImageName);
			cmd.addParameter("@P_FLOW_ID", pFlowId);
				
			cmd.execute();


		}
		
	
	
	
}
