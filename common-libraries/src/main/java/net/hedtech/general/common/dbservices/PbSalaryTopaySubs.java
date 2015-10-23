package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PbSalaryTopaySubs {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_SALARY_TOPAY_SUBS.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pEarnCode,NNumber pFromGrsAmt,NNumber pToGrsAmt,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_SALARY_TOPAY_SUBS.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_FROM_GRS_AMT", pFromGrsAmt);
			cmd.addParameter("@P_TO_GRS_AMT", pToGrsAmt);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(SalaryTopaySubsRecRow recOne,SalaryTopaySubsRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_SALARY_TOPAY_SUBS.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, SalaryTopaySubsRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, SalaryTopaySubsRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pEarnCode,NNumber pFromGrsAmt,NNumber pToGrsAmt) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_SALARY_TOPAY_SUBS.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_FROM_GRS_AMT", pFromGrsAmt);
			cmd.addParameter("@P_TO_GRS_AMT", pToGrsAmt);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_SALARY_TOPAY_SUBS.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pEarnCode,NNumber pFromGrsAmt,NNumber pToGrsAmt) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_SALARY_TOPAY_SUBS.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_FROM_GRS_AMT", pFromGrsAmt);
			cmd.addParameter("@P_TO_GRS_AMT", pToGrsAmt);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pEarnCode,NNumber pFromGrsAmt,NNumber pToGrsAmt,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_SALARY_TOPAY_SUBS.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_FROM_GRS_AMT", pFromGrsAmt);
			cmd.addParameter("@P_TO_GRS_AMT", pToGrsAmt);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pEarnCode,NNumber pFromGrsAmt,NNumber pToGrsAmt,NNumber pAmount,NNumber pPercentage,NNumber pAddAmt,NString pUserId,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_SALARY_TOPAY_SUBS.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_FROM_GRS_AMT", pFromGrsAmt);
			cmd.addParameter("@P_TO_GRS_AMT", pToGrsAmt);
			cmd.addParameter("@P_AMOUNT", pAmount);
			cmd.addParameter("@P_PERCENTAGE", pPercentage);
			cmd.addParameter("@P_ADD_AMT", pAddAmt);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pEarnCode,NNumber pFromGrsAmt,NNumber pToGrsAmt,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_SALARY_TOPAY_SUBS.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_FROM_GRS_AMT", pFromGrsAmt);
			cmd.addParameter("@P_TO_GRS_AMT", pToGrsAmt);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pEarnCode,NNumber pFromGrsAmt,NNumber pToGrsAmt,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_SALARY_TOPAY_SUBS.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_FROM_GRS_AMT", pFromGrsAmt);
			cmd.addParameter("@P_TO_GRS_AMT", pToGrsAmt);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pEarnCode,NNumber pFromGrsAmt,NNumber pToGrsAmt,NNumber pAmount,NNumber pPercentage,NNumber pAddAmt,NString pUserId,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_SALARY_TOPAY_SUBS.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_FROM_GRS_AMT", pFromGrsAmt);
			cmd.addParameter("@P_TO_GRS_AMT", pToGrsAmt);
			cmd.addParameter("@P_AMOUNT", pAmount);
			cmd.addParameter("@P_PERCENTAGE", pPercentage);
			cmd.addParameter("@P_ADD_AMT", pAddAmt);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	@DbRecordType(id="SalaryTopaySubsRecRow", dataSourceName="SALARY_TOPAY_SUBS_REC", needsInitialization=true)
	public static class SalaryTopaySubsRecRow
	{
		@DbRecordField(dataSourceName="R_EARN_CODE")
		public NString REarnCode;
		@DbRecordField(dataSourceName="R_FROM_GRS_AMT")
		public NNumber RFromGrsAmt;
		@DbRecordField(dataSourceName="R_TO_GRS_AMT")
		public NNumber RToGrsAmt;
		@DbRecordField(dataSourceName="R_AMOUNT")
		public NNumber RAmount;
		@DbRecordField(dataSourceName="R_PERCENTAGE")
		public NNumber RPercentage;
		@DbRecordField(dataSourceName="R_ADD_AMT")
		public NNumber RAddAmt;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
