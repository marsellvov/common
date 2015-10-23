package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PbEarnInclCalcSubs {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EARN_INCL_CALC_SUBS.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pEarnCode,NString pInclEarnCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EARN_INCL_CALC_SUBS.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_INCL_EARN_CODE", pInclEarnCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(EarnInclCalcSubsRecRow recOne,EarnInclCalcSubsRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EARN_INCL_CALC_SUBS.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, EarnInclCalcSubsRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, EarnInclCalcSubsRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pEarnCode,NString pInclEarnCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EARN_INCL_CALC_SUBS.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_INCL_EARN_CODE", pInclEarnCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EARN_INCL_CALC_SUBS.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pEarnCode,NString pInclEarnCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EARN_INCL_CALC_SUBS.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_INCL_EARN_CODE", pInclEarnCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pEarnCode,NString pInclEarnCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EARN_INCL_CALC_SUBS.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_INCL_EARN_CODE", pInclEarnCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pEarnCode,NString pInclEarnCode,NNumber pPriority,NString pUserId,NString pDataOrigin,NNumber pPeriodsIncluded,NNumber pPercentage,NString pFromNbajobsInd,NString pReduceWrpInd,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EARN_INCL_CALC_SUBS.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_INCL_EARN_CODE", pInclEarnCode);
			cmd.addParameter("@P_PRIORITY", pPriority);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_PERIODS_INCLUDED", pPeriodsIncluded);
			cmd.addParameter("@P_PERCENTAGE", pPercentage);
			cmd.addParameter("@P_FROM_NBAJOBS_IND", pFromNbajobsInd);
			cmd.addParameter("@P_REDUCE_WRP_IND", pReduceWrpInd);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pEarnCode,NString pInclEarnCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EARN_INCL_CALC_SUBS.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_INCL_EARN_CODE", pInclEarnCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pEarnCode,NString pInclEarnCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EARN_INCL_CALC_SUBS.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_INCL_EARN_CODE", pInclEarnCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pEarnCode,NString pInclEarnCode,NNumber pPriority,NString pUserId,NString pDataOrigin,NNumber pPeriodsIncluded,NNumber pPercentage,NString pFromNbajobsInd,NString pReduceWrpInd,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EARN_INCL_CALC_SUBS.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_INCL_EARN_CODE", pInclEarnCode);
			cmd.addParameter("@P_PRIORITY", pPriority);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_PERIODS_INCLUDED", pPeriodsIncluded);
			cmd.addParameter("@P_PERCENTAGE", pPercentage);
			cmd.addParameter("@P_FROM_NBAJOBS_IND", pFromNbajobsInd);
			cmd.addParameter("@P_REDUCE_WRP_IND", pReduceWrpInd);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	@DbRecordType(id="EarnInclCalcSubsRecRow", dataSourceName="EARN_INCL_CALC_SUBS_REC", needsInitialization=true)
	public static class EarnInclCalcSubsRecRow
	{
		@DbRecordField(dataSourceName="R_EARN_CODE")
		public NString REarnCode;
		@DbRecordField(dataSourceName="R_INCL_EARN_CODE")
		public NString RInclEarnCode;
		@DbRecordField(dataSourceName="R_PRIORITY")
		public NNumber RPriority;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_PERIODS_INCLUDED")
		public NNumber RPeriodsIncluded;
		@DbRecordField(dataSourceName="R_PERCENTAGE")
		public NNumber RPercentage;
		@DbRecordField(dataSourceName="R_FROM_NBAJOBS_IND")
		public NString RFromNbajobsInd;
		@DbRecordField(dataSourceName="R_REDUCE_WRP_IND")
		public NString RReduceWrpInd;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
