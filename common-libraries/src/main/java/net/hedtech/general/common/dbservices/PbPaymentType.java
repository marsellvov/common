package net.hedtech.general.common.dbservices;

import java.util.*;

import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PbPaymentType {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_PAYMENT_TYPE.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pType,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_PAYMENT_TYPE.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TYPE", pType);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(PaymentTypeRecRow recOne,PaymentTypeRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_PAYMENT_TYPE.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, PaymentTypeRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, PaymentTypeRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pType,NString pCode,NNumber pPayno,NNumber pPidm,NNumber pSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_PAYMENT_TYPE.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TYPE", pType);
			cmd.addParameter("@P_CODE", pCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_PAYMENT_TYPE.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pType, NString pCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_PAYMENT_TYPE.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TYPE", pType);
			cmd.addParameter("@P_CODE", pCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pType,NString pCode, NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_PAYMENT_TYPE.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TYPE", pType);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		
		public static void pCreate(NString pType,NString pCode,NString pAmountMethod,NString pStartDateMethod,NString pEndDateMethod,NString pPeriodMethod,NString pUserId,NString pDataOrigin, Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_PAYMENT_TYPE.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TYPE", pType);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_AMOUNT_METHOD", pAmountMethod);			
			cmd.addParameter("@P_START_DATE_METHOD", pStartDateMethod);
			cmd.addParameter("@P_END_DATE_METHOD", pEndDateMethod);
			cmd.addParameter("@P_PERIOD_METHOD", pPeriodMethod);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			//cmd.addParameter("@P_ID_OUT", NNumber.class);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pType, NString pCode, Ref<byte[]> pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_PAYMENT_TYPE.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TYPE", pType);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pDeleteByPayEvent(NString pType,NString pCode,NNumber pPayno,NNumber pPidm,NNumber pSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_PAYMENT_TYPE.P_DELETE_BY_PAY_EVENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TYPE", pType);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_PAYNO", pPayno);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
				
			cmd.execute();


		}
		
		public static void pLock(NString pType, NString pCode, Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_PAYMENT_TYPE.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TYPE", pType);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		

		public static void pUpdate(NString pType,NString pCode,NString pAmountMethod,NString pStartDateMethod,NString pEndDateMethod,NString pPeriodMethod,NString pUserId,NString pDataOrigin, Ref<byte[]> pRowid/*NString pRowid*/) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_PAYMENT_TYPE.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TYPE", pType);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_AMOUNT_METHOD", pAmountMethod);			
			cmd.addParameter("@P_START_DATE_METHOD", pStartDateMethod);
			cmd.addParameter("@P_END_DATE_METHOD", pEndDateMethod);
			cmd.addParameter("@P_PERIOD_METHOD", pPeriodMethod);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			//cmd.addParameter("@P_ID_OUT", NNumber.class);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();


		}
	
	@DbRecordType(id="PaymentTypeRecRow", dataSourceName="PAYMENT_TYPE_REC")
	public static class PaymentTypeRecRow
	{
		@DbRecordField(dataSourceName="R_TYPE")
		public NString RType;
		@DbRecordField(dataSourceName="R_CODE")
		public NString RCode;
		@DbRecordField(dataSourceName="R_AMOUNT_METHOD")
		public NString RAmountMethod;
		@DbRecordField(dataSourceName="R_START_DATE_METHOD")
		public NString RStartDateMethod;
		@DbRecordField(dataSourceName="R_END_DATE_METHOD")
		public NString REndDateMethod;
		@DbRecordField(dataSourceName="R_PERIOD_METHOD")
		public NString RPeriodMethod;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
