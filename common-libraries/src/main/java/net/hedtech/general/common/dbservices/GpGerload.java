package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GpGerload {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GERLOAD.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pSystCode,NString pRetpCode,NString pDtypCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GERLOAD.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SYST_CODE", pSystCode);
			cmd.addParameter("@P_RETP_CODE", pRetpCode);
			cmd.addParameter("@P_DTYP_CODE", pDtypCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(GerloadRecRow recOne,GerloadRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GERLOAD.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, GerloadRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, GerloadRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pSystCode,NString pRetpCode,NString pDtypCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GERLOAD.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_SYST_CODE", pSystCode);
			cmd.addParameter("@P_RETP_CODE", pRetpCode);
			cmd.addParameter("@P_DTYP_CODE", pDtypCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GERLOAD.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pSystCode,NString pRetpCode,NString pDtypCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GERLOAD.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_SYST_CODE", pSystCode);
			cmd.addParameter("@P_RETP_CODE", pRetpCode);
			cmd.addParameter("@P_DTYP_CODE", pDtypCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pSystCode,NString pRetpCode,NString pDtypCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GERLOAD.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_SYST_CODE", pSystCode);
			cmd.addParameter("@P_RETP_CODE", pRetpCode);
			cmd.addParameter("@P_DTYP_CODE", pDtypCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pSystCode,NString pRetpCode,NString pDtypCode,NString pLoadActivityInd,NString pUserId,NDate pCreateDate,NString pCreateUser,NString pOptOutAdvInd,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GERLOAD.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SYST_CODE", pSystCode);
			cmd.addParameter("@P_RETP_CODE", pRetpCode);
			cmd.addParameter("@P_DTYP_CODE", pDtypCode);
			cmd.addParameter("@P_LOAD_ACTIVITY_IND", pLoadActivityInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_CREATE_DATE", pCreateDate);
			cmd.addParameter("@P_CREATE_USER", pCreateUser);
			cmd.addParameter("@P_OPT_OUT_ADV_IND", pOptOutAdvInd);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pSystCode,NString pRetpCode,NString pDtypCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GERLOAD.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SYST_CODE", pSystCode);
			cmd.addParameter("@P_RETP_CODE", pRetpCode);
			cmd.addParameter("@P_DTYP_CODE", pDtypCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pSystCode,NString pRetpCode,NString pDtypCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GERLOAD.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SYST_CODE", pSystCode);
			cmd.addParameter("@P_RETP_CODE", pRetpCode);
			cmd.addParameter("@P_DTYP_CODE", pDtypCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pSystCode,NString pRetpCode,NString pDtypCode,NString pLoadActivityInd,NString pUserId,NDate pCreateDate,NString pCreateUser,NString pOptOutAdvInd,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GERLOAD.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SYST_CODE", pSystCode);
			cmd.addParameter("@P_RETP_CODE", pRetpCode);
			cmd.addParameter("@P_DTYP_CODE", pDtypCode);
			cmd.addParameter("@P_LOAD_ACTIVITY_IND", pLoadActivityInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_CREATE_DATE", pCreateDate);
			cmd.addParameter("@P_CREATE_USER", pCreateUser);
			cmd.addParameter("@P_OPT_OUT_ADV_IND", pOptOutAdvInd);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="GerloadRecRow", dataSourceName="GERLOAD_REC")
	public static class GerloadRecRow
	{
		@DbRecordField(dataSourceName="R_SYST_CODE")
		public NString RSystCode;
		@DbRecordField(dataSourceName="R_RETP_CODE")
		public NString RRetpCode;
		@DbRecordField(dataSourceName="R_DTYP_CODE")
		public NString RDtypCode;
		@DbRecordField(dataSourceName="R_LOAD_ACTIVITY_IND")
		public NString RLoadActivityInd;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_CREATE_DATE")
		public NDate RCreateDate;
		@DbRecordField(dataSourceName="R_CREATE_USER")
		public NString RCreateUser;
		@DbRecordField(dataSourceName="R_OPT_OUT_ADV_IND")
		public NString ROptOutAdvInd;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
