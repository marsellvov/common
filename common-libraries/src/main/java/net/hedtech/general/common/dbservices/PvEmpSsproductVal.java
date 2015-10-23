package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PvEmpSsproductVal {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_EMP_SSPRODUCT_VAL.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pCode,NString pPackageName,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_EMP_SSPRODUCT_VAL.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_PACKAGE_NAME", pPackageName);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(EmpSsproductValRecRow recOne,EmpSsproductValRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_EMP_SSPRODUCT_VAL.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, EmpSsproductValRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, EmpSsproductValRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pCode,NString pPackageName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_EMP_SSPRODUCT_VAL.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_PACKAGE_NAME", pPackageName);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_EMP_SSPRODUCT_VAL.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pCode,NString pPackageName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_EMP_SSPRODUCT_VAL.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_PACKAGE_NAME", pPackageName);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pCode,NString pPackageName,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_EMP_SSPRODUCT_VAL.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_PACKAGE_NAME", pPackageName);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pCode,NString pDesc,NString pPackageName,NString pPackageDesc,NString pSysReqInd,NString pUserId,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_EMP_SSPRODUCT_VAL.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_DESC", pDesc);
			cmd.addParameter("@P_PACKAGE_NAME", pPackageName);
			cmd.addParameter("@P_PACKAGE_DESC", pPackageDesc);
			cmd.addParameter("@P_SYS_REQ_IND", pSysReqInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pCode,NString pPackageName,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_EMP_SSPRODUCT_VAL.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_PACKAGE_NAME", pPackageName);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pCode,NString pPackageName,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_EMP_SSPRODUCT_VAL.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_PACKAGE_NAME", pPackageName);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pCode,NString pDesc,NString pPackageName,NString pPackageDesc,NString pSysReqInd,NString pUserId,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_EMP_SSPRODUCT_VAL.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_DESC", pDesc);
			cmd.addParameter("@P_PACKAGE_NAME", pPackageName);
			cmd.addParameter("@P_PACKAGE_DESC", pPackageDesc);
			cmd.addParameter("@P_SYS_REQ_IND", pSysReqInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	@DbRecordType(id="EmpSsproductValRecRow", dataSourceName="EMP_SSPRODUCT_VAL_REC", needsInitialization=true)
	public static class EmpSsproductValRecRow
	{
		@DbRecordField(dataSourceName="R_CODE")
		public NString RCode;
		@DbRecordField(dataSourceName="R_DESC")
		public NString RDesc;
		@DbRecordField(dataSourceName="R_PACKAGE_NAME")
		public NString RPackageName;
		@DbRecordField(dataSourceName="R_PACKAGE_DESC")
		public NString RPackageDesc;
		@DbRecordField(dataSourceName="R_SYS_REQ_IND")
		public NString RSysReqInd;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
