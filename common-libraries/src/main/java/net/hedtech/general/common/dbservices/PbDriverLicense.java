package net.hedtech.general.common.dbservices;

import static morphis.foundations.core.types.Types.*;

import java.util.*;

import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PbDriverLicense {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_DRIVER_LICENSE.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pPidm,NString pDriverLicense,NDate pIssueDate,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_DRIVER_LICENSE.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_DRIVER_LICENSE", pDriverLicense);
			cmd.addParameter("@P_ISSUE_DATE", pIssueDate);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(DriverLicenseRecRow recOne,DriverLicenseRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_DRIVER_LICENSE.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, DriverLicenseRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, DriverLicenseRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pPidm,NString pDriverLicense,NDate pIssueDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_DRIVER_LICENSE.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_DRIVER_LICENSE", pDriverLicense);
			cmd.addParameter("@P_ISSUE_DATE", pIssueDate);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_DRIVER_LICENSE.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
//MORPHIS TODO: Return type from DataCursor to Cursor
		public static Cursor fQueryOne(NNumber pPidm,NString pDriverLicense,NDate pIssueDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_DRIVER_LICENSE.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_DRIVER_LICENSE", pDriverLicense);
			cmd.addParameter("@P_ISSUE_DATE", pIssueDate);
				
			cmd.execute();

			return cmd.getReturnValue(Cursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pPidm,NString pDriverLicense,NDate pIssueDate,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_DRIVER_LICENSE.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_DRIVER_LICENSE", pDriverLicense);
			cmd.addParameter("@P_ISSUE_DATE", pIssueDate);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NNumber pPidm,NString pDriverLicense,NString pUserId,NDate pIssueDate,NString pSkilCode,NString pStatus,NDate pExpireDate,NString pStatCodeDriver,NString pNatnCodeDriver,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_DRIVER_LICENSE.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_DRIVER_LICENSE", pDriverLicense);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ISSUE_DATE", pIssueDate);
			cmd.addParameter("@P_SKIL_CODE", pSkilCode);
			cmd.addParameter("@P_STATUS", pStatus);
			cmd.addParameter("@P_EXPIRE_DATE", pExpireDate);
			cmd.addParameter("@P_STAT_CODE_DRIVER", pStatCodeDriver);
			cmd.addParameter("@P_NATN_CODE_DRIVER", pNatnCodeDriver);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pPidm,NString pDriverLicense,NDate pIssueDate,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_DRIVER_LICENSE.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_DRIVER_LICENSE", pDriverLicense);
			cmd.addParameter("@P_ISSUE_DATE", pIssueDate);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pPidm,NString pDriverLicense,NDate pIssueDate,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_DRIVER_LICENSE.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_DRIVER_LICENSE", pDriverLicense);
			cmd.addParameter("@P_ISSUE_DATE", pIssueDate);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pPidm,NString pDriverLicense,NString pUserId,NDate pIssueDate,NString pSkilCode,NString pStatus,NDate pExpireDate,NString pStatCodeDriver,NString pNatnCodeDriver,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_DRIVER_LICENSE.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_DRIVER_LICENSE", pDriverLicense);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ISSUE_DATE", pIssueDate);
			cmd.addParameter("@P_SKIL_CODE", pSkilCode);
			cmd.addParameter("@P_STATUS", pStatus);
			cmd.addParameter("@P_EXPIRE_DATE", pExpireDate);
			cmd.addParameter("@P_STAT_CODE_DRIVER", pStatCodeDriver);
			cmd.addParameter("@P_NATN_CODE_DRIVER", pNatnCodeDriver);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	//MORPHIS TODO: Return type from DataCursor to Cursor
	@DbRecordType(id="DriverLicenseRecRow", dataSourceName="DRIVER_LICENSE_REC")
	public static class DriverLicenseRecRow
	{
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_DRIVER_LICENSE")
		public NString RDriverLicense;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_ISSUE_DATE")
		public NDate RIssueDate;
		@DbRecordField(dataSourceName="R_SKIL_CODE")
		public NString RSkilCode;
		@DbRecordField(dataSourceName="R_STATUS")
		public NString RStatus;
		@DbRecordField(dataSourceName="R_EXPIRE_DATE")
		public NDate RExpireDate;
		@DbRecordField(dataSourceName="R_STAT_CODE_DRIVER")
		public NString RStatCodeDriver;
		@DbRecordField(dataSourceName="R_NATN_CODE_DRIVER")
		public NString RNatnCodeDriver;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
		
		public DriverLicenseRecRow(Row row){
			RPidm = toNumber(row.getObject(1));
			RDriverLicense = toStr(row.getObject(2));
			RUserId = toStr(row.getObject(3));
			RIssueDate = toDate(row.getObject(4));
			RSkilCode = toStr(row.getObject(5));
			RStatus = toStr(row.getObject(6));
			RExpireDate = toDate(row.getObject(7));
			RStatCodeDriver = toStr(row.getObject(8));
			RNatnCodeDriver = toStr(row.getObject(9));
			RDataOrigin = toStr(row.getObject(10));
			RInternalRecordId = toStr(row.getObject(11));
			
			
		}
	}

	
	
}
