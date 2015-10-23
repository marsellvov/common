package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PvWagePlan {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_WAGE_PLAN.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pWgplCode,NString pBdcaCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_WAGE_PLAN.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_WGPL_CODE", pWgplCode);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(WagePlanRecRow recOne,WagePlanRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_WAGE_PLAN.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, WagePlanRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, WagePlanRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pWgplCode,NString pBdcaCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_WAGE_PLAN.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_WGPL_CODE", pWgplCode);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_WAGE_PLAN.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pWgplCode,NString pBdcaCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_WAGE_PLAN.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_WGPL_CODE", pWgplCode);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pWgplCode,NString pBdcaCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_WAGE_PLAN.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_WGPL_CODE", pWgplCode);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pWgplCode,NString pBdcaCode,NString pUserId,NString pUiWagesInd,NString pPitAmountsInd,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_WAGE_PLAN.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_WGPL_CODE", pWgplCode);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_UI_WAGES_IND", pUiWagesInd);
			cmd.addParameter("@P_PIT_AMOUNTS_IND", pPitAmountsInd);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pWgplCode,NString pBdcaCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_WAGE_PLAN.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_WGPL_CODE", pWgplCode);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pWgplCode,NString pBdcaCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_WAGE_PLAN.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_WGPL_CODE", pWgplCode);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pWgplCode,NString pBdcaCode,NString pUserId,NString pUiWagesInd,NString pPitAmountsInd,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_WAGE_PLAN.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_WGPL_CODE", pWgplCode);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_UI_WAGES_IND", pUiWagesInd);
			cmd.addParameter("@P_PIT_AMOUNTS_IND", pPitAmountsInd);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	@DbRecordType(id="WagePlanRecRow", dataSourceName="WAGE_PLAN_REC", needsInitialization=true)
	public static class WagePlanRecRow
	{
		@DbRecordField(dataSourceName="R_WGPL_CODE")
		public NString RWgplCode;
		@DbRecordField(dataSourceName="R_BDCA_CODE")
		public NString RBdcaCode;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_UI_WAGES_IND")
		public NString RUiWagesInd;
		@DbRecordField(dataSourceName="R_PIT_AMOUNTS_IND")
		public NString RPitAmountsInd;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
