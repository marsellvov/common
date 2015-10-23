package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbEnrollVerPayment {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ENROLL_VER_PAYMENT.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pEprtCode,NString pWpyoCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ENROLL_VER_PAYMENT.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_EPRT_CODE", pEprtCode);
			cmd.addParameter("@P_WPYO_CODE", pWpyoCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(EnrollVerPaymentRecRow recOne,EnrollVerPaymentRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ENROLL_VER_PAYMENT.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, EnrollVerPaymentRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, EnrollVerPaymentRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pEprtCode,NString pWpyoCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ENROLL_VER_PAYMENT.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_EPRT_CODE", pEprtCode);
			cmd.addParameter("@P_WPYO_CODE", pWpyoCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ENROLL_VER_PAYMENT.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pEprtCode,NString pWpyoCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ENROLL_VER_PAYMENT.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_EPRT_CODE", pEprtCode);
			cmd.addParameter("@P_WPYO_CODE", pWpyoCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pEprtCode,NString pWpyoCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ENROLL_VER_PAYMENT.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_EPRT_CODE", pEprtCode);
			cmd.addParameter("@P_WPYO_CODE", pWpyoCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pEprtCode,NString pWpyoCode,NString pDataOrigin,NString pUserId,NString pDetcCode,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ENROLL_VER_PAYMENT.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EPRT_CODE", pEprtCode);
			cmd.addParameter("@P_WPYO_CODE", pWpyoCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DETC_CODE", pDetcCode);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pEprtCode,NString pWpyoCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ENROLL_VER_PAYMENT.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EPRT_CODE", pEprtCode);
			cmd.addParameter("@P_WPYO_CODE", pWpyoCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pEprtCode,NString pWpyoCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ENROLL_VER_PAYMENT.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EPRT_CODE", pEprtCode);
			cmd.addParameter("@P_WPYO_CODE", pWpyoCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pEprtCode,NString pWpyoCode,NString pDataOrigin,NString pUserId,NString pDetcCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ENROLL_VER_PAYMENT.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EPRT_CODE", pEprtCode);
			cmd.addParameter("@P_WPYO_CODE", pWpyoCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DETC_CODE", pDetcCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="EnrollVerPaymentRecRow", dataSourceName="ENROLL_VER_PAYMENT_REC")
	public static class EnrollVerPaymentRecRow
	{
		@DbRecordField(dataSourceName="R_EPRT_CODE")
		public NString REprtCode;
		@DbRecordField(dataSourceName="R_WPYO_CODE")
		public NString RWpyoCode;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DETC_CODE")
		public NString RDetcCode;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
