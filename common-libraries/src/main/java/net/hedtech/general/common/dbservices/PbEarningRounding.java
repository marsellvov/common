package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PbEarningRounding {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EARNING_ROUNDING.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pEarnCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EARNING_ROUNDING.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(EarningRoundingRecRow recOne,EarningRoundingRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EARNING_ROUNDING.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, EarningRoundingRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, EarningRoundingRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pEarnCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EARNING_ROUNDING.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EARNING_ROUNDING.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pEarnCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EARNING_ROUNDING.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pEarnCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EARNING_ROUNDING.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pEarnCode,NString pRound,NString pPrecision,NString pUserId,NString pDataOrigin,NString pMonthInd,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EARNING_ROUNDING.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_ROUND", pRound);
			cmd.addParameter("@P_PRECISION", pPrecision);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_MONTH_IND", pMonthInd);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pEarnCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EARNING_ROUNDING.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pEarnCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EARNING_ROUNDING.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pEarnCode,NString pRound,NString pPrecision,NString pUserId,NString pDataOrigin,NString pMonthInd,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EARNING_ROUNDING.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_ROUND", pRound);
			cmd.addParameter("@P_PRECISION", pPrecision);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_MONTH_IND", pMonthInd);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	@DbRecordType(id="EarningRoundingRecRow", dataSourceName="EARNING_ROUNDING_REC", needsInitialization=true)
	public static class EarningRoundingRecRow
	{
		@DbRecordField(dataSourceName="R_EARN_CODE")
		public NString REarnCode;
		@DbRecordField(dataSourceName="R_ROUND")
		public NString RRound;
		@DbRecordField(dataSourceName="R_PRECISION")
		public NString RPrecision;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_MONTH_IND")
		public NString RMonthInd;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
