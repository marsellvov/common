package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RbApplPrdsBgrp {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_APPL_PRDS_BGRP.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fBudgetFrozen(NString pAidyCode,NNumber pPidm,NString pRunName,NString pPeriod) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_APPL_PRDS_BGRP.F_BUDGET_FROZEN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_RUN_NAME", pRunName);
			cmd.addParameter("@P_PERIOD", pPeriod);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fExists(NString pAidyCode,NNumber pPidm,NString pRunName,NString pPeriod,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_APPL_PRDS_BGRP.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_RUN_NAME", pRunName);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsChild(NString pAidyCode,NNumber pPidm,NString pRunName,NString pPbgpCode,NString pPeriod) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_APPL_PRDS_BGRP.F_IS_CHILD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_RUN_NAME", pRunName);
			cmd.addParameter("@P_PBGP_CODE", pPbgpCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(ApplPrdsBgrpRecRow recOne,ApplPrdsBgrpRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_APPL_PRDS_BGRP.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, ApplPrdsBgrpRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, ApplPrdsBgrpRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fPeriodExists(NString pAidyCode,NNumber pPidm,NString pRunName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_APPL_PRDS_BGRP.F_PERIOD_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_RUN_NAME", pRunName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pAidyCode,NNumber pPidm,NString pRunName,NString pPeriod) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_APPL_PRDS_BGRP.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_RUN_NAME", pRunName);
			cmd.addParameter("@P_PERIOD", pPeriod);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_APPL_PRDS_BGRP.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pAidyCode,NNumber pPidm,NString pRunName,NString pPeriod) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_APPL_PRDS_BGRP.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_RUN_NAME", pRunName);
			cmd.addParameter("@P_PERIOD", pPeriod);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pAidyCode,NNumber pPidm,NString pRunName,NString pPeriod,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_APPL_PRDS_BGRP.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_RUN_NAME", pRunName);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pAidyCode,NNumber pPidm,NString pRunName,NString pPeriod,NString pPbgpCodeLockInd,NString pBudgetFreezeInd,NString pPbgpCode,NString pUserId,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_APPL_PRDS_BGRP.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_RUN_NAME", pRunName);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_PBGP_CODE_LOCK_IND", pPbgpCodeLockInd);
			cmd.addParameter("@P_BUDGET_FREEZE_IND", pBudgetFreezeInd);
			cmd.addParameter("@P_PBGP_CODE", pPbgpCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pAidyCode,NNumber pPidm,NString pRunName,NString pPeriod,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_APPL_PRDS_BGRP.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_RUN_NAME", pRunName);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pAidyCode,NNumber pPidm,NString pRunName,NString pPeriod,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_APPL_PRDS_BGRP.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_RUN_NAME", pRunName);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pAidyCode,NNumber pPidm,NString pRunName,NString pPeriod,NString pPbgpCodeLockInd,NString pBudgetFreezeInd,NString pPbgpCode,NString pUserId,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_APPL_PRDS_BGRP.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_RUN_NAME", pRunName);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_PBGP_CODE_LOCK_IND", pPbgpCodeLockInd);
			cmd.addParameter("@P_BUDGET_FREEZE_IND", pBudgetFreezeInd);
			cmd.addParameter("@P_PBGP_CODE", pPbgpCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="ApplPrdsBgrpRecRow", dataSourceName="APPL_PRDS_BGRP_REC")
	public static class ApplPrdsBgrpRecRow
	{
		@DbRecordField(dataSourceName="R_AIDY_CODE")
		public NString RAidyCode;
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_RUN_NAME")
		public NString RRunName;
		@DbRecordField(dataSourceName="R_PERIOD")
		public NString RPeriod;
		@DbRecordField(dataSourceName="R_PBGP_CODE_LOCK_IND")
		public NString RPbgpCodeLockInd;
		@DbRecordField(dataSourceName="R_BUDGET_FREEZE_IND")
		public NString RBudgetFreezeInd;
		@DbRecordField(dataSourceName="R_PBGP_CODE")
		public NString RPbgpCode;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
