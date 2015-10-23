package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class AbProjectHistory {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AB_PROJECT_HISTORY.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pPidm,NString pPropCode,NNumber pPropSeqNo,NString pProjCode,NNumber pSeqNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AB_PROJECT_HISTORY.F_EXISTS", DbManager.getDataBaseFactory());
			
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
		
		public static NString fIsequal(ProjectHistoryRecRow recOne,ProjectHistoryRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AB_PROJECT_HISTORY.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, ProjectHistoryRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, ProjectHistoryRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pPidm,NString pPropCode,NNumber pPropSeqNo,NString pProjCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AB_PROJECT_HISTORY.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PROP_CODE", pPropCode);
			cmd.addParameter("@P_PROP_SEQ_NO", pPropSeqNo);
			cmd.addParameter("@P_PROJ_CODE", pProjCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AB_PROJECT_HISTORY.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPidm,NString pPropCode,NNumber pPropSeqNo,NString pProjCode,NNumber pSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AB_PROJECT_HISTORY.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
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
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AB_PROJECT_HISTORY.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
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
		
		public static void pCreate(NNumber pPidm,NString pPropCode,NNumber pPropSeqNo,NString pProjCode,NNumber pSeqNo,NString pUserId,NString pDataOrigin,NString pGivhCodeChgInd,NString pGivhCode,NString pTargetAskAmtChgInd,NNumber pTargetAskAmount,NString pTargetAskDteChgInd,NDate pTargetAskDate,NString pPrstCodeChgInd,NString pPrstCode,NString pPrstDateChgInd,NDate pPrstDate,NString pProjFromDateChgInd,NDate pProjEffFromDate,NString pProjToDateChgInd,NDate pProjEffToDate,NString pProjTextChgInd,NString pProjText,NString pFrbpropCodeChgInd,NString pFrbpropCode,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AB_PROJECT_HISTORY.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PROP_CODE", pPropCode);
			cmd.addParameter("@P_PROP_SEQ_NO", pPropSeqNo);
			cmd.addParameter("@P_PROJ_CODE", pProjCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_GIVH_CODE_CHG_IND", pGivhCodeChgInd);
			cmd.addParameter("@P_GIVH_CODE", pGivhCode);
			cmd.addParameter("@P_TARGET_ASK_AMT_CHG_IND", pTargetAskAmtChgInd);
			cmd.addParameter("@P_TARGET_ASK_AMOUNT", pTargetAskAmount);
			cmd.addParameter("@P_TARGET_ASK_DTE_CHG_IND", pTargetAskDteChgInd);
			cmd.addParameter("@P_TARGET_ASK_DATE", pTargetAskDate);
			cmd.addParameter("@P_PRST_CODE_CHG_IND", pPrstCodeChgInd);
			cmd.addParameter("@P_PRST_CODE", pPrstCode);
			cmd.addParameter("@P_PRST_DATE_CHG_IND", pPrstDateChgInd);
			cmd.addParameter("@P_PRST_DATE", pPrstDate);
			cmd.addParameter("@P_PROJ_FROM_DATE_CHG_IND", pProjFromDateChgInd);
			cmd.addParameter("@P_PROJ_EFF_FROM_DATE", pProjEffFromDate);
			cmd.addParameter("@P_PROJ_TO_DATE_CHG_IND", pProjToDateChgInd);
			cmd.addParameter("@P_PROJ_EFF_TO_DATE", pProjEffToDate);
			cmd.addParameter("@P_PROJ_TEXT_CHG_IND", pProjTextChgInd);
			cmd.addParameter("@P_PROJ_TEXT", pProjText);
			cmd.addParameter("@P_FRBPROP_CODE_CHG_IND", pFrbpropCodeChgInd);
			cmd.addParameter("@P_FRBPROP_CODE", pFrbpropCode);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pPidm,NString pPropCode,NNumber pPropSeqNo,NString pProjCode,NNumber pSeqNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AB_PROJECT_HISTORY.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PROP_CODE", pPropCode);
			cmd.addParameter("@P_PROP_SEQ_NO", pPropSeqNo);
			cmd.addParameter("@P_PROJ_CODE", pProjCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pPidm,NString pPropCode,NNumber pPropSeqNo,NString pProjCode,NNumber pSeqNo,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AB_PROJECT_HISTORY.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PROP_CODE", pPropCode);
			cmd.addParameter("@P_PROP_SEQ_NO", pPropSeqNo);
			cmd.addParameter("@P_PROJ_CODE", pProjCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
	
	
	@DbRecordType(id="ProjectHistoryRecRow", dataSourceName="PROJECT_HISTORY_REC")
	public static class ProjectHistoryRecRow
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
		@DbRecordField(dataSourceName="R_GIVH_CODE_CHG_IND")
		public NString RGivhCodeChgInd;
		@DbRecordField(dataSourceName="R_GIVH_CODE")
		public NString RGivhCode;
		@DbRecordField(dataSourceName="R_TARGET_ASK_AMT_CHG_IND")
		public NString RTargetAskAmtChgInd;
		@DbRecordField(dataSourceName="R_TARGET_ASK_AMOUNT")
		public NNumber RTargetAskAmount;
		@DbRecordField(dataSourceName="R_TARGET_ASK_DTE_CHG_IND")
		public NString RTargetAskDteChgInd;
		@DbRecordField(dataSourceName="R_TARGET_ASK_DATE")
		public NDate RTargetAskDate;
		@DbRecordField(dataSourceName="R_PRST_CODE_CHG_IND")
		public NString RPrstCodeChgInd;
		@DbRecordField(dataSourceName="R_PRST_CODE")
		public NString RPrstCode;
		@DbRecordField(dataSourceName="R_PRST_DATE_CHG_IND")
		public NString RPrstDateChgInd;
		@DbRecordField(dataSourceName="R_PRST_DATE")
		public NDate RPrstDate;
		@DbRecordField(dataSourceName="R_PROJ_FROM_DATE_CHG_IND")
		public NString RProjFromDateChgInd;
		@DbRecordField(dataSourceName="R_PROJ_EFF_FROM_DATE")
		public NDate RProjEffFromDate;
		@DbRecordField(dataSourceName="R_PROJ_TO_DATE_CHG_IND")
		public NString RProjToDateChgInd;
		@DbRecordField(dataSourceName="R_PROJ_EFF_TO_DATE")
		public NDate RProjEffToDate;
		@DbRecordField(dataSourceName="R_PROJ_TEXT_CHG_IND")
		public NString RProjTextChgInd;
		@DbRecordField(dataSourceName="R_PROJ_TEXT")
		public NString RProjText;
		@DbRecordField(dataSourceName="R_FRBPROP_CODE_CHG_IND")
		public NString RFrbpropCodeChgInd;
		@DbRecordField(dataSourceName="R_FRBPROP_CODE")
		public NString RFrbpropCode;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
