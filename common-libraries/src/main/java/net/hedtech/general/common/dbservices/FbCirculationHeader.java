package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class FbCirculationHeader {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_CIRCULATION_HEADER.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pId,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_CIRCULATION_HEADER.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static NString fIsequal(CirculationHeaderRecRow recOne,CirculationHeaderRecRow recTwo) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_CIRCULATION_HEADER.F_ISEQUAL", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, CirculationHeaderRecRow.class ));
//			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, CirculationHeaderRecRow.class ));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
		
		public static DataCursor fQueryAll(NNumber pId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_CIRCULATION_HEADER.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ID", pId);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_CIRCULATION_HEADER.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_CIRCULATION_HEADER.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ID", pId);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pId,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_CIRCULATION_HEADER.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(Ref<NNumber> pId,NString pName,NString pType,NString pStatus,NNumber pOwnerPidm,NString pActiveInd,NString pAllOrganizationsInd,NString pHeaderChangeInd,NString pRoutingChangeInd,NString pLockObjectInd,NString pTemplateInd,NString pTriggerEnabledInd,NString pUserId,NString pDataOrigin,NString pSuccessStatus,NString pSuplEmailText,NDate pCompletionDate,NDate pStartDate,NString pDesc,NString pTriggerType,NString pTriggerValue,NNumber pFobcirhId,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_CIRCULATION_HEADER.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", NNumber.class);
			cmd.addParameter("@P_NAME", pName);
			cmd.addParameter("@P_TYPE", pType);
			cmd.addParameter("@P_STATUS", pStatus);
			cmd.addParameter("@P_OWNER_PIDM", pOwnerPidm);
			cmd.addParameter("@P_ACTIVE_IND", pActiveInd);
			cmd.addParameter("@P_ALL_ORGANIZATIONS_IND", pAllOrganizationsInd);
			cmd.addParameter("@P_HEADER_CHANGE_IND", pHeaderChangeInd);
			cmd.addParameter("@P_ROUTING_CHANGE_IND", pRoutingChangeInd);
			cmd.addParameter("@P_LOCK_OBJECT_IND", pLockObjectInd);
			cmd.addParameter("@P_TEMPLATE_IND", pTemplateInd);
			cmd.addParameter("@P_TRIGGER_ENABLED_IND", pTriggerEnabledInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_SUCCESS_STATUS", pSuccessStatus);
			cmd.addParameter("@P_SUPL_EMAIL_TEXT", pSuplEmailText);
			cmd.addParameter("@P_COMPLETION_DATE", pCompletionDate);
			cmd.addParameter("@P_START_DATE", pStartDate);
			cmd.addParameter("@P_DESC", pDesc);
			cmd.addParameter("@P_TRIGGER_TYPE", pTriggerType);
			cmd.addParameter("@P_TRIGGER_VALUE", pTriggerValue);
			cmd.addParameter("@P_FOBCIRH_ID", pFobcirhId);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pId.val = cmd.getParameterValue("@P_ID", NNumber.class);
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pId,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_CIRCULATION_HEADER.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pId,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_CIRCULATION_HEADER.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pId,NString pName,NString pType,NString pStatus,NNumber pOwnerPidm,NString pActiveInd,NString pAllOrganizationsInd,NString pHeaderChangeInd,NString pRoutingChangeInd,NString pLockObjectInd,NString pTemplateInd,NString pTriggerEnabledInd,NString pUserId,NString pDataOrigin,NString pSuccessStatus,NString pSuplEmailText,NDate pCompletionDate,NDate pStartDate,NString pDesc,NString pTriggerType,NString pTriggerValue,NNumber pFobcirhId,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_CIRCULATION_HEADER.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_NAME", pName);
			cmd.addParameter("@P_TYPE", pType);
			cmd.addParameter("@P_STATUS", pStatus);
			cmd.addParameter("@P_OWNER_PIDM", pOwnerPidm);
			cmd.addParameter("@P_ACTIVE_IND", pActiveInd);
			cmd.addParameter("@P_ALL_ORGANIZATIONS_IND", pAllOrganizationsInd);
			cmd.addParameter("@P_HEADER_CHANGE_IND", pHeaderChangeInd);
			cmd.addParameter("@P_ROUTING_CHANGE_IND", pRoutingChangeInd);
			cmd.addParameter("@P_LOCK_OBJECT_IND", pLockObjectInd);
			cmd.addParameter("@P_TEMPLATE_IND", pTemplateInd);
			cmd.addParameter("@P_TRIGGER_ENABLED_IND", pTriggerEnabledInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_SUCCESS_STATUS", pSuccessStatus);
			cmd.addParameter("@P_SUPL_EMAIL_TEXT", pSuplEmailText);
			cmd.addParameter("@P_COMPLETION_DATE", pCompletionDate);
			cmd.addParameter("@P_START_DATE", pStartDate);
			cmd.addParameter("@P_DESC", pDesc);
			cmd.addParameter("@P_TRIGGER_TYPE", pTriggerType);
			cmd.addParameter("@P_TRIGGER_VALUE", pTriggerValue);
			cmd.addParameter("@P_FOBCIRH_ID", pFobcirhId);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="CirculationHeaderRecRow", dataSourceName="CIRCULATION_HEADER_REC")
	public static class CirculationHeaderRecRow
	{
		@DbRecordField(dataSourceName="R_ID")
		public NNumber RId;
		@DbRecordField(dataSourceName="R_NAME")
		public NString RName;
		@DbRecordField(dataSourceName="R_TYPE")
		public NString RType;
		@DbRecordField(dataSourceName="R_STATUS")
		public NString RStatus;
		@DbRecordField(dataSourceName="R_OWNER_PIDM")
		public NNumber ROwnerPidm;
		@DbRecordField(dataSourceName="R_ACTIVE_IND")
		public NString RActiveInd;
		@DbRecordField(dataSourceName="R_ALL_ORGANIZATIONS_IND")
		public NString RAllOrganizationsInd;
		@DbRecordField(dataSourceName="R_HEADER_CHANGE_IND")
		public NString RHeaderChangeInd;
		@DbRecordField(dataSourceName="R_ROUTING_CHANGE_IND")
		public NString RRoutingChangeInd;
		@DbRecordField(dataSourceName="R_LOCK_OBJECT_IND")
		public NString RLockObjectInd;
		@DbRecordField(dataSourceName="R_TEMPLATE_IND")
		public NString RTemplateInd;
		@DbRecordField(dataSourceName="R_TRIGGER_ENABLED_IND")
		public NString RTriggerEnabledInd;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_SUCCESS_STATUS")
		public NString RSuccessStatus;
		@DbRecordField(dataSourceName="R_SUPL_EMAIL_TEXT")
		public NString RSuplEmailText;
//		@DbRecordField(dataSourceName="R_COMPLETION_DATE")
//		public UnknownTypes.Timestamp RCompletionDate;
//		@DbRecordField(dataSourceName="R_START_DATE")
//		public UnknownTypes.Timestamp RStartDate;
		@DbRecordField(dataSourceName="R_DESC")
		public NString RDesc;
		@DbRecordField(dataSourceName="R_TRIGGER_TYPE")
		public NString RTriggerType;
		@DbRecordField(dataSourceName="R_TRIGGER_VALUE")
		public NString RTriggerValue;
		@DbRecordField(dataSourceName="R_FOBCIRH_ID")
		public NNumber RFobcirhId;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
