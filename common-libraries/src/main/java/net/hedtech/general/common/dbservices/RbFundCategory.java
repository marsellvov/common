package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RbFundCategory {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_FUND_CATEGORY.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pFundCode,NString pFcatCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_FUND_CATEGORY.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_FCAT_CODE", pFcatCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(FundCategoryRecRow recOne,FundCategoryRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_FUND_CATEGORY.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, FundCategoryRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, FundCategoryRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pFundCode,NString pFcatCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_FUND_CATEGORY.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_FCAT_CODE", pFcatCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_FUND_CATEGORY.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pFundCode,NString pFcatCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_FUND_CATEGORY.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_FCAT_CODE", pFcatCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pFundCode,NString pFcatCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_FUND_CATEGORY.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_FCAT_CODE", pFcatCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pFundCode,NString pFcatCode,NString pUserId,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_FUND_CATEGORY.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_FCAT_CODE", pFcatCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pFundCode,NString pFcatCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_FUND_CATEGORY.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_FCAT_CODE", pFcatCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pFundCode,NString pFcatCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_FUND_CATEGORY.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_FCAT_CODE", pFcatCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
	
	
	@DbRecordType(id="FundCategoryRecRow", dataSourceName="FUND_CATEGORY_REC")
	public static class FundCategoryRecRow
	{
		@DbRecordField(dataSourceName="R_FUND_CODE")
		public NString RFundCode;
		@DbRecordField(dataSourceName="R_FCAT_CODE")
		public NString RFcatCode;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
