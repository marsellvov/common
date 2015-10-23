package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GbHold {
		public static NString fAnyHoldExists(NNumber pPidm,NDate pDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_HOLD.F_ANY_HOLD_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_DATE", pDate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_HOLD.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_HOLD.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fHoldExists(NNumber pPidm,NString pRegHold,NString pTransHold,NString pGradHold,NString pGradeHold,NString pArHold,NString pEnvHold,NString pAppHold,NString pComplHold,NDate pDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_HOLD.F_HOLD_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_REG_HOLD", pRegHold);
			cmd.addParameter("@P_TRANS_HOLD", pTransHold);
			cmd.addParameter("@P_GRAD_HOLD", pGradHold);
			cmd.addParameter("@P_GRADE_HOLD", pGradeHold);
			cmd.addParameter("@P_AR_HOLD", pArHold);
			cmd.addParameter("@P_ENV_HOLD", pEnvHold);
			cmd.addParameter("@P_APP_HOLD", pAppHold);
			cmd.addParameter("@P_COMPL_HOLD", pComplHold);
			cmd.addParameter("@P_DATE", pDate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(HoldRecRow recOne,HoldRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_HOLD.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, HoldRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, HoldRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pPidm,NString pHlddCode,NString pUser,NDate pFromDate,NDate pToDate,NString pReleaseInd,NString pReason,NNumber pAmountOwed,NString pOrigCode,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_HOLD.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_HLDD_CODE", pHlddCode);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_FROM_DATE", pFromDate);
			cmd.addParameter("@P_TO_DATE", pToDate);
			cmd.addParameter("@P_RELEASE_IND", pReleaseInd);
			cmd.addParameter("@P_REASON", pReason);
			cmd.addParameter("@P_AMOUNT_OWED", pAmountOwed);
			cmd.addParameter("@P_ORIG_CODE", pOrigCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_HOLD.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPidm,NString pHlddCode,NString pUser,NDate pFromDate,NDate pToDate,NString pReleaseInd,NString pReason,NNumber pAmountOwed,NString pOrigCode,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_HOLD.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_HLDD_CODE", pHlddCode);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_FROM_DATE", pFromDate);
			cmd.addParameter("@P_TO_DATE", pToDate);
			cmd.addParameter("@P_RELEASE_IND", pReleaseInd);
			cmd.addParameter("@P_REASON", pReason);
			cmd.addParameter("@P_AMOUNT_OWED", pAmountOwed);
			cmd.addParameter("@P_ORIG_CODE", pOrigCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_HOLD.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NNumber pPidm,NString pHlddCode,NString pUser,NDate pFromDate,NDate pToDate,NString pReleaseInd,NString pReason,NNumber pAmountOwed,NString pOrigCode,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_HOLD.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_HLDD_CODE", pHlddCode);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_FROM_DATE", pFromDate);
			cmd.addParameter("@P_TO_DATE", pToDate);
			cmd.addParameter("@P_RELEASE_IND", pReleaseInd);
			cmd.addParameter("@P_REASON", pReason);
			cmd.addParameter("@P_AMOUNT_OWED", pAmountOwed);
			cmd.addParameter("@P_ORIG_CODE", pOrigCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pUser,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_HOLD.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_HOLD.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pPidm,NString pHlddCode,NString pUser,NDate pFromDate,NDate pToDate,NString pReleaseInd,NString pReason,NNumber pAmountOwed,NString pOrigCode,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_HOLD.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_HLDD_CODE", pHlddCode);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_FROM_DATE", pFromDate);
			cmd.addParameter("@P_TO_DATE", pToDate);
			cmd.addParameter("@P_RELEASE_IND", pReleaseInd);
			cmd.addParameter("@P_REASON", pReason);
			cmd.addParameter("@P_AMOUNT_OWED", pAmountOwed);
			cmd.addParameter("@P_ORIG_CODE", pOrigCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="HoldRecRow", dataSourceName="HOLD_REC")
	public static class HoldRecRow
	{
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_HLDD_CODE")
		public NString RHlddCode;
		@DbRecordField(dataSourceName="R_USER")
		public NString RUser;
		@DbRecordField(dataSourceName="R_FROM_DATE")
		public NDate RFromDate;
		@DbRecordField(dataSourceName="R_TO_DATE")
		public NDate RToDate;
		@DbRecordField(dataSourceName="R_RELEASE_IND")
		public NString RReleaseInd;
		@DbRecordField(dataSourceName="R_REASON")
		public NString RReason;
		@DbRecordField(dataSourceName="R_AMOUNT_OWED")
		public NNumber RAmountOwed;
		@DbRecordField(dataSourceName="R_ORIG_CODE")
		public NString ROrigCode;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
