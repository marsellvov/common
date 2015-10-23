package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbEnrollVerService {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ENROLL_VER_SERVICE.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pEprtCode,NString pWssoCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ENROLL_VER_SERVICE.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_EPRT_CODE", pEprtCode);
			cmd.addParameter("@P_WSSO_CODE", pWssoCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(EnrollVerServiceRecRow recOne,EnrollVerServiceRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ENROLL_VER_SERVICE.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, EnrollVerServiceRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, EnrollVerServiceRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pEprtCode,NString pWssoCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ENROLL_VER_SERVICE.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_EPRT_CODE", pEprtCode);
			cmd.addParameter("@P_WSSO_CODE", pWssoCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ENROLL_VER_SERVICE.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pEprtCode,NString pWssoCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ENROLL_VER_SERVICE.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_EPRT_CODE", pEprtCode);
			cmd.addParameter("@P_WSSO_CODE", pWssoCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pEprtCode,NString pWssoCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ENROLL_VER_SERVICE.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_EPRT_CODE", pEprtCode);
			cmd.addParameter("@P_WSSO_CODE", pWssoCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pEprtCode,NString pWssoCode,NString pAcctTypeCde,NString pDataOrigin,NString pUserId,NNumber pCharge,NString pChargePerCde,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ENROLL_VER_SERVICE.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EPRT_CODE", pEprtCode);
			cmd.addParameter("@P_WSSO_CODE", pWssoCode);
			cmd.addParameter("@P_ACCT_TYPE_CDE", pAcctTypeCde);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_CHARGE", pCharge);
			cmd.addParameter("@P_CHARGE_PER_CDE", pChargePerCde);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pEprtCode,NString pWssoCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ENROLL_VER_SERVICE.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EPRT_CODE", pEprtCode);
			cmd.addParameter("@P_WSSO_CODE", pWssoCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pEprtCode,NString pWssoCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ENROLL_VER_SERVICE.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EPRT_CODE", pEprtCode);
			cmd.addParameter("@P_WSSO_CODE", pWssoCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pEprtCode,NString pWssoCode,NString pAcctTypeCde,NString pDataOrigin,NString pUserId,NNumber pCharge,NString pChargePerCde,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ENROLL_VER_SERVICE.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EPRT_CODE", pEprtCode);
			cmd.addParameter("@P_WSSO_CODE", pWssoCode);
			cmd.addParameter("@P_ACCT_TYPE_CDE", pAcctTypeCde);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_CHARGE", pCharge);
			cmd.addParameter("@P_CHARGE_PER_CDE", pChargePerCde);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="EnrollVerServiceRecRow", dataSourceName="ENROLL_VER_SERVICE_REC")
	public static class EnrollVerServiceRecRow
	{
		@DbRecordField(dataSourceName="R_EPRT_CODE")
		public NString REprtCode;
		@DbRecordField(dataSourceName="R_WSSO_CODE")
		public NString RWssoCode;
		@DbRecordField(dataSourceName="R_ACCT_TYPE_CDE")
		public NString RAcctTypeCde;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_CHARGE")
		public NNumber RCharge;
		@DbRecordField(dataSourceName="R_CHARGE_PER_CDE")
		public NString RChargePerCde;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
