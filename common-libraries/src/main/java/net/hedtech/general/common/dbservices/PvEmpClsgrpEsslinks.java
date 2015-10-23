package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PvEmpClsgrpEsslinks {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_EMP_CLSGRP_ESSLINKS.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pEcagCode,NString pEsspCode,NString pPackageName,NString pEsslCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_EMP_CLSGRP_ESSLINKS.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ECAG_CODE", pEcagCode);
			cmd.addParameter("@P_ESSP_CODE", pEsspCode);
			cmd.addParameter("@P_PACKAGE_NAME", pPackageName);
			cmd.addParameter("@P_ESSL_CODE", pEsslCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(EmpClsgrpEsslinksRecRow recOne,EmpClsgrpEsslinksRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_EMP_CLSGRP_ESSLINKS.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, EmpClsgrpEsslinksRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, EmpClsgrpEsslinksRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pEcagCode,NString pEsspCode,NString pPackageName,NString pEsslCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_EMP_CLSGRP_ESSLINKS.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ECAG_CODE", pEcagCode);
			cmd.addParameter("@P_ESSP_CODE", pEsspCode);
			cmd.addParameter("@P_PACKAGE_NAME", pPackageName);
			cmd.addParameter("@P_ESSL_CODE", pEsslCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_EMP_CLSGRP_ESSLINKS.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pEcagCode,NString pEsspCode,NString pPackageName,NString pEsslCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_EMP_CLSGRP_ESSLINKS.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ECAG_CODE", pEcagCode);
			cmd.addParameter("@P_ESSP_CODE", pEsspCode);
			cmd.addParameter("@P_PACKAGE_NAME", pPackageName);
			cmd.addParameter("@P_ESSL_CODE", pEsslCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pEcagCode,NString pEsspCode,NString pPackageName,NString pEsslCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_EMP_CLSGRP_ESSLINKS.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ECAG_CODE", pEcagCode);
			cmd.addParameter("@P_ESSP_CODE", pEsspCode);
			cmd.addParameter("@P_PACKAGE_NAME", pPackageName);
			cmd.addParameter("@P_ESSL_CODE", pEsslCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pEcagCode,NString pEsspCode,NString pPackageName,NString pEsslCode,NString pStatus,NDate pStartDate,NDate pEndDate,NString pUserId,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_EMP_CLSGRP_ESSLINKS.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ECAG_CODE", pEcagCode);
			cmd.addParameter("@P_ESSP_CODE", pEsspCode);
			cmd.addParameter("@P_PACKAGE_NAME", pPackageName);
			cmd.addParameter("@P_ESSL_CODE", pEsslCode);
			cmd.addParameter("@P_STATUS", pStatus);
			cmd.addParameter("@P_START_DATE", pStartDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pEcagCode,NString pEsspCode,NString pPackageName,NString pEsslCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_EMP_CLSGRP_ESSLINKS.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ECAG_CODE", pEcagCode);
			cmd.addParameter("@P_ESSP_CODE", pEsspCode);
			cmd.addParameter("@P_PACKAGE_NAME", pPackageName);
			cmd.addParameter("@P_ESSL_CODE", pEsslCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pEcagCode,NString pEsspCode,NString pPackageName,NString pEsslCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_EMP_CLSGRP_ESSLINKS.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ECAG_CODE", pEcagCode);
			cmd.addParameter("@P_ESSP_CODE", pEsspCode);
			cmd.addParameter("@P_PACKAGE_NAME", pPackageName);
			cmd.addParameter("@P_ESSL_CODE", pEsslCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pEcagCode,NString pEsspCode,NString pPackageName,NString pEsslCode,NString pStatus,NDate pStartDate,NDate pEndDate,NString pUserId,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_EMP_CLSGRP_ESSLINKS.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ECAG_CODE", pEcagCode);
			cmd.addParameter("@P_ESSP_CODE", pEsspCode);
			cmd.addParameter("@P_PACKAGE_NAME", pPackageName);
			cmd.addParameter("@P_ESSL_CODE", pEsslCode);
			cmd.addParameter("@P_STATUS", pStatus);
			cmd.addParameter("@P_START_DATE", pStartDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	@DbRecordType(id="EmpClsgrpEsslinksRecRow", dataSourceName="EMP_CLSGRP_ESSLINKS_REC", needsInitialization=true)
	public static class EmpClsgrpEsslinksRecRow
	{
		@DbRecordField(dataSourceName="R_ECAG_CODE")
		public NString REcagCode;
		@DbRecordField(dataSourceName="R_ESSP_CODE")
		public NString REsspCode;
		@DbRecordField(dataSourceName="R_PACKAGE_NAME")
		public NString RPackageName;
		@DbRecordField(dataSourceName="R_ESSL_CODE")
		public NString REsslCode;
		@DbRecordField(dataSourceName="R_STATUS")
		public NString RStatus;
		@DbRecordField(dataSourceName="R_START_DATE")
		public NDate RStartDate;
		@DbRecordField(dataSourceName="R_END_DATE")
		public NDate REndDate;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
