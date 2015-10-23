package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GbFlexWkWeek {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_FLEX_WK_WEEK.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pWeekRef,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_FLEX_WK_WEEK.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_WEEK_REF", pWeekRef);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(FlexWkWeekRecRow recOne,FlexWkWeekRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_FLEX_WK_WEEK.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, FlexWkWeekRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, FlexWkWeekRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pWeekRef) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_FLEX_WK_WEEK.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_WEEK_REF", pWeekRef);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_FLEX_WK_WEEK.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pWeekRef) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_FLEX_WK_WEEK.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_WEEK_REF", pWeekRef);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pWeekRef,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_FLEX_WK_WEEK.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_WEEK_REF", pWeekRef);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NNumber pWeekRef,NString pDesc,NNumber pFirstWkndDay,NNumber pSecondWkndDay,NString pInstInd,NString pSysReqInd,NString pUserId,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_FLEX_WK_WEEK.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_WEEK_REF", pWeekRef);
			cmd.addParameter("@P_DESC", pDesc);
			cmd.addParameter("@P_FIRST_WKND_DAY", pFirstWkndDay);
			cmd.addParameter("@P_SECOND_WKND_DAY", pSecondWkndDay);
			cmd.addParameter("@P_INST_IND", pInstInd);
			cmd.addParameter("@P_SYS_REQ_IND", pSysReqInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pWeekRef,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_FLEX_WK_WEEK.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_WEEK_REF", pWeekRef);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pWeekRef,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_FLEX_WK_WEEK.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_WEEK_REF", pWeekRef);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pWeekRef,NString pDesc,NNumber pFirstWkndDay,NNumber pSecondWkndDay,NString pInstInd,NString pSysReqInd,NString pUserId,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_FLEX_WK_WEEK.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_WEEK_REF", pWeekRef);
			cmd.addParameter("@P_DESC", pDesc);
			cmd.addParameter("@P_FIRST_WKND_DAY", pFirstWkndDay);
			cmd.addParameter("@P_SECOND_WKND_DAY", pSecondWkndDay);
			cmd.addParameter("@P_INST_IND", pInstInd);
			cmd.addParameter("@P_SYS_REQ_IND", pSysReqInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	@DbRecordType(id="FlexWkWeekRecRow", dataSourceName="FLEX_WK_WEEK_REC", needsInitialization=true)
	public static class FlexWkWeekRecRow
	{
		@DbRecordField(dataSourceName="R_WEEK_REF")
		public NNumber RWeekRef;
		@DbRecordField(dataSourceName="R_DESC")
		public NString RDesc;
		@DbRecordField(dataSourceName="R_FIRST_WKND_DAY")
		public NNumber RFirstWkndDay;
		@DbRecordField(dataSourceName="R_SECOND_WKND_DAY")
		public NNumber RSecondWkndDay;
		@DbRecordField(dataSourceName="R_INST_IND")
		public NString RInstInd;
		@DbRecordField(dataSourceName="R_SYS_REQ_IND")
		public NString RSysReqInd;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
