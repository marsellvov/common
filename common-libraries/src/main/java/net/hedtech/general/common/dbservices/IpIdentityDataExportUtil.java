package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class IpIdentityDataExportUtil {
		public static NString fCheckValidPopsel(NString pPopselname,NString pPopselselectionId,NString pCreatorId,NString pUserId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("IP_IDENTITY_DATA_EXPORT_UTIL.F_CHECK_VALID_POPSEL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_POPSELNAME", pPopselname);
			cmd.addParameter("@P_POPSELSELECTION_ID", pPopselselectionId);
			cmd.addParameter("@P_CREATOR_ID", pCreatorId);
			cmd.addParameter("@P_USER_ID", pUserId);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fGetUnassignedCount() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("IP_IDENTITY_DATA_EXPORT_UTIL.F_GET_UNASSIGNED_COUNT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void pAssignUdcid() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("IP_IDENTITY_DATA_EXPORT_UTIL.P_ASSIGN_UDCID", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pGetPidmsByPopselname(NString pPopselname,NString pPopselselectionId,NString pCreatorId,NString pUserId,Ref<DataCursor> gobumapRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("IP_IDENTITY_DATA_EXPORT_UTIL.P_GET_PIDMS_BY_POPSELNAME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_POPSELNAME", pPopselname);
			cmd.addParameter("@P_POPSELSELECTION_ID", pPopselselectionId);
			cmd.addParameter("@P_CREATOR_ID", pCreatorId);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@GOBUMAP_REC", DataCursor.class);
				
			cmd.execute();
			gobumapRec.val = cmd.getParameterValue("@GOBUMAP_REC", DataCursor.class);


		}
		
	
	
	@DbRecordType(id="GobumapRecRow", dataSourceName="GOBUMAP_REC")
	public static class GobumapRecRow
	{
		@DbRecordField(dataSourceName="GOBUMAP_PIDM")
		public NNumber GobumapPidm;
		@DbRecordField(dataSourceName="GOBUMAP_UDC_ID")
		public NString GobumapUdcId;
	}

	
	
}
