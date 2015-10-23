package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GpGenbpsh {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GENBPSH.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pGidm,NString pSystCode,NString pRetpCode,NString pDtypCode,NNumber pPersonPidm,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GENBPSH.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_GIDM", pGidm);
			cmd.addParameter("@P_SYST_CODE", pSystCode);
			cmd.addParameter("@P_RETP_CODE", pRetpCode);
			cmd.addParameter("@P_DTYP_CODE", pDtypCode);
			cmd.addParameter("@P_PERSON_PIDM", pPersonPidm);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(GenbpshRecRow recOne,GenbpshRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GENBPSH.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, GenbpshRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, GenbpshRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pGidm,NString pSystCode,NString pRetpCode,NString pDtypCode,NNumber pPersonPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GENBPSH.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_GIDM", pGidm);
			cmd.addParameter("@P_SYST_CODE", pSystCode);
			cmd.addParameter("@P_RETP_CODE", pRetpCode);
			cmd.addParameter("@P_DTYP_CODE", pDtypCode);
			cmd.addParameter("@P_PERSON_PIDM", pPersonPidm);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GENBPSH.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pGidm,NString pSystCode,NString pRetpCode,NString pDtypCode,NNumber pPersonPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GENBPSH.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_GIDM", pGidm);
			cmd.addParameter("@P_SYST_CODE", pSystCode);
			cmd.addParameter("@P_RETP_CODE", pRetpCode);
			cmd.addParameter("@P_DTYP_CODE", pDtypCode);
			cmd.addParameter("@P_PERSON_PIDM", pPersonPidm);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pGidm,NString pSystCode,NString pRetpCode,NString pDtypCode,NNumber pPersonPidm,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GENBPSH.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_GIDM", pGidm);
			cmd.addParameter("@P_SYST_CODE", pSystCode);
			cmd.addParameter("@P_RETP_CODE", pRetpCode);
			cmd.addParameter("@P_DTYP_CODE", pDtypCode);
			cmd.addParameter("@P_PERSON_PIDM", pPersonPidm);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NNumber pGidm,NString pSystCode,NString pRetpCode,NString pDtypCode,NString pCreateInd,NNumber pPersonPidm,NString pAuxData,NString pLoadStatus,NDate pLoadDate,NString pUserId,NDate pCreateDate,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GENBPSH.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_GIDM", pGidm);
			cmd.addParameter("@P_SYST_CODE", pSystCode);
			cmd.addParameter("@P_RETP_CODE", pRetpCode);
			cmd.addParameter("@P_DTYP_CODE", pDtypCode);
			cmd.addParameter("@P_CREATE_IND", pCreateInd);
			cmd.addParameter("@P_PERSON_PIDM", pPersonPidm);
			cmd.addParameter("@P_AUX_DATA", pAuxData);
			cmd.addParameter("@P_LOAD_STATUS", pLoadStatus);
			cmd.addParameter("@P_LOAD_DATE", pLoadDate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_CREATE_DATE", pCreateDate);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pGidm,NString pSystCode,NString pRetpCode,NString pDtypCode,NNumber pPersonPidm,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GENBPSH.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_GIDM", pGidm);
			cmd.addParameter("@P_SYST_CODE", pSystCode);
			cmd.addParameter("@P_RETP_CODE", pRetpCode);
			cmd.addParameter("@P_DTYP_CODE", pDtypCode);
			cmd.addParameter("@P_PERSON_PIDM", pPersonPidm);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pGidm,NString pSystCode,NString pRetpCode,NString pDtypCode,NNumber pPersonPidm,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GENBPSH.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_GIDM", pGidm);
			cmd.addParameter("@P_SYST_CODE", pSystCode);
			cmd.addParameter("@P_RETP_CODE", pRetpCode);
			cmd.addParameter("@P_DTYP_CODE", pDtypCode);
			cmd.addParameter("@P_PERSON_PIDM", pPersonPidm);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pGidm,NString pSystCode,NString pRetpCode,NString pDtypCode,NString pCreateInd,NNumber pPersonPidm,NString pAuxData,NString pLoadStatus,NDate pLoadDate,NString pUserId,NDate pCreateDate,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GENBPSH.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_GIDM", pGidm);
			cmd.addParameter("@P_SYST_CODE", pSystCode);
			cmd.addParameter("@P_RETP_CODE", pRetpCode);
			cmd.addParameter("@P_DTYP_CODE", pDtypCode);
			cmd.addParameter("@P_CREATE_IND", pCreateInd);
			cmd.addParameter("@P_PERSON_PIDM", pPersonPidm);
			cmd.addParameter("@P_AUX_DATA", pAuxData);
			cmd.addParameter("@P_LOAD_STATUS", pLoadStatus);
			cmd.addParameter("@P_LOAD_DATE", pLoadDate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_CREATE_DATE", pCreateDate);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="GenbpshRecRow", dataSourceName="GENBPSH_REC")
	public static class GenbpshRecRow
	{
		@DbRecordField(dataSourceName="R_GIDM")
		public NNumber RGidm;
		@DbRecordField(dataSourceName="R_SYST_CODE")
		public NString RSystCode;
		@DbRecordField(dataSourceName="R_RETP_CODE")
		public NString RRetpCode;
		@DbRecordField(dataSourceName="R_DTYP_CODE")
		public NString RDtypCode;
		@DbRecordField(dataSourceName="R_CREATE_IND")
		public NString RCreateInd;
		@DbRecordField(dataSourceName="R_PERSON_PIDM")
		public NNumber RPersonPidm;
		@DbRecordField(dataSourceName="R_AUX_DATA")
		public NString RAuxData;
		@DbRecordField(dataSourceName="R_LOAD_STATUS")
		public NString RLoadStatus;
		@DbRecordField(dataSourceName="R_LOAD_DATE")
		public NDate RLoadDate;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_CREATE_DATE")
		public NDate RCreateDate;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
