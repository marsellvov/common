package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RbTempRecrData {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_RECR_DATA.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pPidm,NString pTermCode,NNumber pAdminSeqno,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_RECR_DATA.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_ADMIN_SEQNO", pAdminSeqno);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(TempRecrDataRecRow recOne,TempRecrDataRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_RECR_DATA.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, TempRecrDataRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, TempRecrDataRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pPidm,NString pTermCode,NNumber pAdminSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_RECR_DATA.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_ADMIN_SEQNO", pAdminSeqno);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_RECR_DATA.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPidm,NString pTermCode,NNumber pAdminSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_RECR_DATA.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_ADMIN_SEQNO", pAdminSeqno);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pPidm,NString pTermCode,NNumber pAdminSeqno,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_RECR_DATA.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_ADMIN_SEQNO", pAdminSeqno);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NNumber pPidm,NString pTermCode,NNumber pAdminSeqno,NString pDeptCode,NString pLevlCode,NString pDegcCode,NString pMajrCode,NString pRecrCode,NString pRstaCode,NString pInfcCode,NString pAidyCode,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_RECR_DATA.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_ADMIN_SEQNO", pAdminSeqno);
			cmd.addParameter("@P_DEPT_CODE", pDeptCode);
			cmd.addParameter("@P_LEVL_CODE", pLevlCode);
			cmd.addParameter("@P_DEGC_CODE", pDegcCode);
			cmd.addParameter("@P_MAJR_CODE", pMajrCode);
			cmd.addParameter("@P_RECR_CODE", pRecrCode);
			cmd.addParameter("@P_RSTA_CODE", pRstaCode);
			cmd.addParameter("@P_INFC_CODE", pInfcCode);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pPidm,NString pTermCode,NNumber pAdminSeqno,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_RECR_DATA.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_ADMIN_SEQNO", pAdminSeqno);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pDeleteBulk(NString pAidyCode,NString pInfcCode,NString pDeleteFlag,Ref<NNumber> pDelCountOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_RECR_DATA.P_DELETE_BULK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_INFC_CODE", pInfcCode);
			cmd.addParameter("@P_DELETE_FLAG", pDeleteFlag);
			cmd.addParameter("@P_DEL_COUNT_OUT", NNumber.class);
				
			cmd.execute();
			pDelCountOut.val = cmd.getParameterValue("@P_DEL_COUNT_OUT", NNumber.class);


		}
		
		public static void pLock(NNumber pPidm,NString pTermCode,NNumber pAdminSeqno,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_RECR_DATA.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_ADMIN_SEQNO", pAdminSeqno);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pPidm,NString pTermCode,NNumber pAdminSeqno,NString pDeptCode,NString pLevlCode,NString pDegcCode,NString pMajrCode,NString pRecrCode,NString pRstaCode,NString pInfcCode,NString pAidyCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_RECR_DATA.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_ADMIN_SEQNO", pAdminSeqno);
			cmd.addParameter("@P_DEPT_CODE", pDeptCode);
			cmd.addParameter("@P_LEVL_CODE", pLevlCode);
			cmd.addParameter("@P_DEGC_CODE", pDegcCode);
			cmd.addParameter("@P_MAJR_CODE", pMajrCode);
			cmd.addParameter("@P_RECR_CODE", pRecrCode);
			cmd.addParameter("@P_RSTA_CODE", pRstaCode);
			cmd.addParameter("@P_INFC_CODE", pInfcCode);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="TempRecrDataRecRow", dataSourceName="TEMP_RECR_DATA_REC")
	public static class TempRecrDataRecRow
	{
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_TERM_CODE")
		public NString RTermCode;
		@DbRecordField(dataSourceName="R_ADMIN_SEQNO")
		public NNumber RAdminSeqno;
		@DbRecordField(dataSourceName="R_DEPT_CODE")
		public NString RDeptCode;
		@DbRecordField(dataSourceName="R_LEVL_CODE")
		public NString RLevlCode;
		@DbRecordField(dataSourceName="R_DEGC_CODE")
		public NString RDegcCode;
		@DbRecordField(dataSourceName="R_MAJR_CODE")
		public NString RMajrCode;
		@DbRecordField(dataSourceName="R_RECR_CODE")
		public NString RRecrCode;
		@DbRecordField(dataSourceName="R_RSTA_CODE")
		public NString RRstaCode;
		@DbRecordField(dataSourceName="R_INFC_CODE")
		public NString RInfcCode;
		@DbRecordField(dataSourceName="R_AIDY_CODE")
		public NString RAidyCode;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
