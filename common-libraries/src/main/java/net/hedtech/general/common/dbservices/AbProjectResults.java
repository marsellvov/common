package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class AbProjectResults {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AB_PROJECT_RESULTS.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pPidm,NString pPropCode,NNumber pPropSeqNo,NString pProjCode,NNumber pSeqNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AB_PROJECT_RESULTS.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PROP_CODE", pPropCode);
			cmd.addParameter("@P_PROP_SEQ_NO", pPropSeqNo);
			cmd.addParameter("@P_PROJ_CODE", pProjCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(ProjectResultsRecRow recOne,ProjectResultsRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AB_PROJECT_RESULTS.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, ProjectResultsRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, ProjectResultsRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pPidm,NString pPropCode,NNumber pPropSeqNo,NString pProjCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AB_PROJECT_RESULTS.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PROP_CODE", pPropCode);
			cmd.addParameter("@P_PROP_SEQ_NO", pPropSeqNo);
			cmd.addParameter("@P_PROJ_CODE", pProjCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AB_PROJECT_RESULTS.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPidm,NString pPropCode,NNumber pPropSeqNo,NString pProjCode,NNumber pSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AB_PROJECT_RESULTS.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PROP_CODE", pPropCode);
			cmd.addParameter("@P_PROP_SEQ_NO", pPropSeqNo);
			cmd.addParameter("@P_PROJ_CODE", pProjCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pPidm,NString pPropCode,NNumber pPropSeqNo,NString pProjCode,NNumber pSeqNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AB_PROJECT_RESULTS.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PROP_CODE", pPropCode);
			cmd.addParameter("@P_PROP_SEQ_NO", pPropSeqNo);
			cmd.addParameter("@P_PROJ_CODE", pProjCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NNumber pPidm,NString pPropCode,NNumber pPropSeqNo,NString pProjCode,NNumber pSeqNo,NString pUserId,NString pDataOrigin,NDate pResultDate,NString pGiftNo,NString pPledgeNo,NString pCampaign,NString pDesg,NNumber pValue,NString pComment,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AB_PROJECT_RESULTS.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PROP_CODE", pPropCode);
			cmd.addParameter("@P_PROP_SEQ_NO", pPropSeqNo);
			cmd.addParameter("@P_PROJ_CODE", pProjCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_RESULT_DATE", pResultDate);
			cmd.addParameter("@P_GIFT_NO", pGiftNo);
			cmd.addParameter("@P_PLEDGE_NO", pPledgeNo);
			cmd.addParameter("@P_CAMPAIGN", pCampaign);
			cmd.addParameter("@P_DESG", pDesg);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_COMMENT", pComment);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pPidm,NString pPropCode,NNumber pPropSeqNo,NString pProjCode,NNumber pSeqNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AB_PROJECT_RESULTS.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PROP_CODE", pPropCode);
			cmd.addParameter("@P_PROP_SEQ_NO", pPropSeqNo);
			cmd.addParameter("@P_PROJ_CODE", pProjCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pPidm,NString pPropCode,NNumber pPropSeqNo,NString pProjCode,NNumber pSeqNo,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AB_PROJECT_RESULTS.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PROP_CODE", pPropCode);
			cmd.addParameter("@P_PROP_SEQ_NO", pPropSeqNo);
			cmd.addParameter("@P_PROJ_CODE", pProjCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pPidm,NString pPropCode,NNumber pPropSeqNo,NString pProjCode,NNumber pSeqNo,NString pUserId,NString pDataOrigin,NDate pResultDate,NString pGiftNo,NString pPledgeNo,NString pCampaign,NString pDesg,NNumber pValue,NString pComment,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AB_PROJECT_RESULTS.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PROP_CODE", pPropCode);
			cmd.addParameter("@P_PROP_SEQ_NO", pPropSeqNo);
			cmd.addParameter("@P_PROJ_CODE", pProjCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_RESULT_DATE", pResultDate);
			cmd.addParameter("@P_GIFT_NO", pGiftNo);
			cmd.addParameter("@P_PLEDGE_NO", pPledgeNo);
			cmd.addParameter("@P_CAMPAIGN", pCampaign);
			cmd.addParameter("@P_DESG", pDesg);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_COMMENT", pComment);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="ProjectResultsRecRow", dataSourceName="PROJECT_RESULTS_REC")
	public static class ProjectResultsRecRow
	{
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_PROP_CODE")
		public NString RPropCode;
		@DbRecordField(dataSourceName="R_PROP_SEQ_NO")
		public NNumber RPropSeqNo;
		@DbRecordField(dataSourceName="R_PROJ_CODE")
		public NString RProjCode;
		@DbRecordField(dataSourceName="R_SEQ_NO")
		public NNumber RSeqNo;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_RESULT_DATE")
		public NDate RResultDate;
		@DbRecordField(dataSourceName="R_GIFT_NO")
		public NString RGiftNo;
		@DbRecordField(dataSourceName="R_PLEDGE_NO")
		public NString RPledgeNo;
		@DbRecordField(dataSourceName="R_CAMPAIGN")
		public NString RCampaign;
		@DbRecordField(dataSourceName="R_DESG")
		public NString RDesg;
		@DbRecordField(dataSourceName="R_VALUE")
		public NNumber RValue;
		@DbRecordField(dataSourceName="R_COMMENT")
		public NString RComment;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
