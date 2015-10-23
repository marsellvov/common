package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class TbCashierSession {
		public static NString fExists(NNumber pSessionNumber,NString pUser,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_CASHIER_SESSION.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SESSION_NUMBER", pSessionNumber);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(CashierSessionRecRow recOne,CashierSessionRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_CASHIER_SESSION.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, CashierSessionRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, CashierSessionRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pUser) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_CASHIER_SESSION.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_USER", pUser);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_CASHIER_SESSION.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pSessionNumber,NString pUser) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_CASHIER_SESSION.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_SESSION_NUMBER", pSessionNumber);
			cmd.addParameter("@P_USER", pUser);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pUser,NNumber pSessionNumber,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_CASHIER_SESSION.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_SESSION_NUMBER", pSessionNumber);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static NDate fSessionEndDate(NString pUser,NNumber pSessionNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_CASHIER_SESSION.F_SESSION_END_DATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_SESSION_NUMBER", pSessionNumber);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
		public static NString fSessionStatus(NString pUser,NNumber pSessionNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_CASHIER_SESSION.F_SESSION_STATUS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_SESSION_NUMBER", pSessionNumber);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pCloseCashierDetail(NString pUser,NNumber pNewSessionNumber,NDate pEndDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_CASHIER_SESSION.P_CLOSE_CASHIER_DETAIL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_NEW_SESSION_NUMBER", pNewSessionNumber);
			cmd.addParameter("@P_END_DATE", pEndDate);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="CashierSessionRecRow", dataSourceName="CASHIER_SESSION_REC")
	public static class CashierSessionRecRow
	{
		@DbRecordField(dataSourceName="R_USER")
		public NString RUser;
		@DbRecordField(dataSourceName="R_SESSION_NUMBER")
		public NNumber RSessionNumber;
		@DbRecordField(dataSourceName="R_START_DATE")
		public NDate RStartDate;
		@DbRecordField(dataSourceName="R_END_DATE")
		public NDate REndDate;
		@DbRecordField(dataSourceName="R_SESSION_IND")
		public NString RSessionInd;
		@DbRecordField(dataSourceName="R_BANK_DEPOSIT_NUMBER")
		public NString RBankDepositNumber;
		@DbRecordField(dataSourceName="R_BANK_CODE")
		public NString RBankCode;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
