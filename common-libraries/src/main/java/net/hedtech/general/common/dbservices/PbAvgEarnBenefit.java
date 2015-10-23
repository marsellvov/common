package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PbAvgEarnBenefit {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_AVG_EARN_BENEFIT.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pEarnCode,NString pBrelCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_AVG_EARN_BENEFIT.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_BREL_CODE", pBrelCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fExistsPtrbrel(NString pPtrbrelCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_AVG_EARN_BENEFIT.F_EXISTS_PTRBREL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PTRBREL_CODE", pPtrbrelCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(AvgEarnBenefitRecRow recOne,AvgEarnBenefitRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_AVG_EARN_BENEFIT.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, AvgEarnBenefitRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, AvgEarnBenefitRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pEarnCode,NString pBrelCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_AVG_EARN_BENEFIT.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_BREL_CODE", pBrelCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_AVG_EARN_BENEFIT.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pEarnCode,NString pBrelCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_AVG_EARN_BENEFIT.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_BREL_CODE", pBrelCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pEarnCode,NString pBrelCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_AVG_EARN_BENEFIT.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_BREL_CODE", pBrelCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pEarnCode,NString pBrelCode,NNumber pValue,NNumber pMaxNumber,NString pAttendsSchool,NNumber pYoungerThan,NString pUserId,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_AVG_EARN_BENEFIT.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_BREL_CODE", pBrelCode);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_MAX_NUMBER", pMaxNumber);
			cmd.addParameter("@P_ATTENDS_SCHOOL", pAttendsSchool);
			cmd.addParameter("@P_YOUNGER_THAN", pYoungerThan);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pEarnCode,NString pBrelCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_AVG_EARN_BENEFIT.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_BREL_CODE", pBrelCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pEarnCode,NString pBrelCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_AVG_EARN_BENEFIT.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_BREL_CODE", pBrelCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pEarnCode,NString pBrelCode,NNumber pValue,NNumber pMaxNumber,NString pAttendsSchool,NNumber pYoungerThan,NString pUserId,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_AVG_EARN_BENEFIT.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_BREL_CODE", pBrelCode);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_MAX_NUMBER", pMaxNumber);
			cmd.addParameter("@P_ATTENDS_SCHOOL", pAttendsSchool);
			cmd.addParameter("@P_YOUNGER_THAN", pYoungerThan);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	@DbRecordType(id="AvgEarnBenefitRecRow", dataSourceName="AVG_EARN_BENEFIT_REC", needsInitialization=true)
	public static class AvgEarnBenefitRecRow
	{
		@DbRecordField(dataSourceName="R_EARN_CODE")
		public NString REarnCode;
		@DbRecordField(dataSourceName="R_BREL_CODE")
		public NString RBrelCode;
		@DbRecordField(dataSourceName="R_VALUE")
		public NNumber RValue;
		@DbRecordField(dataSourceName="R_MAX_NUMBER")
		public NNumber RMaxNumber;
		@DbRecordField(dataSourceName="R_ATTENDS_SCHOOL")
		public NString RAttendsSchool;
		@DbRecordField(dataSourceName="R_YOUNGER_THAN")
		public NNumber RYoungerThan;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
