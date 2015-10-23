package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class FbCirculationStep {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_CIRCULATION_STEP.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static DataCursor fCurrentNodekey(NNumber pFobcirhId,NString pOriginatingUserId,NString pWorkflowUserId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_CIRCULATION_STEP.F_CURRENT_NODEKEY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_FOBCIRH_ID", pFobcirhId);
			cmd.addParameter("@P_ORIGINATING_USER_ID", pOriginatingUserId);
			cmd.addParameter("@P_WORKFLOW_USER_ID", pWorkflowUserId);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static NString fExists(NNumber pId,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_CIRCULATION_STEP.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(CirculationStepRecRow recOne,CirculationStepRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_CIRCULATION_STEP.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, CirculationStepRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, CirculationStepRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fNextNodekey(NNumber pFobcirhId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_CIRCULATION_STEP.F_NEXT_NODEKEY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_FOBCIRH_ID", pFobcirhId);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static DataCursor fQueryAll(NNumber pId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_CIRCULATION_STEP.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ID", pId);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByFobcirhId(NNumber pFobcirhId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_CIRCULATION_STEP.F_QUERY_BY_FOBCIRH_ID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_FOBCIRH_ID", pFobcirhId);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_CIRCULATION_STEP.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryNodeOwner(NNumber pFobcirhId,NNumber pNodekeyIn,NNumber pRecipientPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_CIRCULATION_STEP.F_QUERY_NODE_OWNER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_FOBCIRH_ID", pFobcirhId);
			cmd.addParameter("@P_NODEKEY_IN", pNodekeyIn);
			cmd.addParameter("@P_RECIPIENT_PIDM", pRecipientPidm);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_CIRCULATION_STEP.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ID", pId);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pId,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_CIRCULATION_STEP.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(Ref<NNumber> pId,NNumber pFobcirhId,NString pCompleteInd,NString pDuplicateInd,NString pUserId,NString pDataOrigin,NNumber pOrder,NString pType,NNumber pResponsesRequired,NNumber pForcirsId,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_CIRCULATION_STEP.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", NNumber.class);
			cmd.addParameter("@P_FOBCIRH_ID", pFobcirhId);
			cmd.addParameter("@P_COMPLETE_IND", pCompleteInd);
			cmd.addParameter("@P_DUPLICATE_IND", pDuplicateInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ORDER", pOrder);
			cmd.addParameter("@P_TYPE", pType);
			cmd.addParameter("@P_RESPONSES_REQUIRED", pResponsesRequired);
			cmd.addParameter("@P_FORCIRS_ID", pForcirsId);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pId.val = cmd.getParameterValue("@P_ID", NNumber.class);
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pId,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_CIRCULATION_STEP.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pDeleteByFobcirhId(NNumber pFobcirhId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_CIRCULATION_STEP.P_DELETE_BY_FOBCIRH_ID", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FOBCIRH_ID", pFobcirhId);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pId,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_CIRCULATION_STEP.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pId,NNumber pFobcirhId,NString pCompleteInd,NString pDuplicateInd,NString pUserId,NString pDataOrigin,NNumber pOrder,NString pType,NNumber pResponsesRequired,NNumber pForcirsId,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_CIRCULATION_STEP.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_FOBCIRH_ID", pFobcirhId);
			cmd.addParameter("@P_COMPLETE_IND", pCompleteInd);
			cmd.addParameter("@P_DUPLICATE_IND", pDuplicateInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ORDER", pOrder);
			cmd.addParameter("@P_TYPE", pType);
			cmd.addParameter("@P_RESPONSES_REQUIRED", pResponsesRequired);
			cmd.addParameter("@P_FORCIRS_ID", pForcirsId);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="CirculationStepRecRow", dataSourceName="CIRCULATION_STEP_REC")
	public static class CirculationStepRecRow
	{
		@DbRecordField(dataSourceName="R_ID")
		public NNumber RId;
		@DbRecordField(dataSourceName="R_FOBCIRH_ID")
		public NNumber RFobcirhId;
		@DbRecordField(dataSourceName="R_COMPLETE_IND")
		public NString RCompleteInd;
		@DbRecordField(dataSourceName="R_DUPLICATE_IND")
		public NString RDuplicateInd;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_ORDER")
		public NNumber ROrder;
		@DbRecordField(dataSourceName="R_TYPE")
		public NString RType;
		@DbRecordField(dataSourceName="R_RESPONSES_REQUIRED")
		public NNumber RResponsesRequired;
		@DbRecordField(dataSourceName="R_FORCIRS_ID")
		public NNumber RForcirsId;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
