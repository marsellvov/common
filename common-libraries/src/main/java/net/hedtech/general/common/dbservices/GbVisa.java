package net.hedtech.general.common.dbservices;

import java.util.*;

import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GbVisa {
		public static NString fAnyExists(NNumber pPidm,NNumber pSeqNo,NString pVtypCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_VISA.F_ANY_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_VTYP_CODE", pVtypCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_VISA.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pPidm,NNumber pSeqNo,NString pVtypCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_VISA.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_VTYP_CODE", pVtypCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(VisaRecRow recOne,VisaRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_VISA.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, VisaRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, VisaRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pPidm,NNumber pSeqNo,NString pVtypCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_VISA.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_VTYP_CODE", pVtypCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_VISA.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPidm,NNumber pSeqNo,NString pVtypCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_VISA.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_VTYP_CODE", pVtypCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pPidm,NNumber pSeqNo,NString pVtypCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_VISA.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_VTYP_CODE", pVtypCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NNumber pPidm,Ref<NNumber> pSeqNoInout,NString pVtypCode,NString pVisaNumber,NString pNatnCodeIssue,NString pVissCode,NDate pVisaStartDate,NDate pVisaExpireDate,NString pEntryInd,NString pUserId,NDate pVisaReqDate,NDate pVisaIssueDate,NString pPentCode,NString pNoEntries,NString pDataOrigin,Ref<byte[]> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_VISA.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO_INOUT", pSeqNoInout, true);
			cmd.addParameter("@P_VTYP_CODE", pVtypCode);
			cmd.addParameter("@P_VISA_NUMBER", pVisaNumber);
			cmd.addParameter("@P_NATN_CODE_ISSUE", pNatnCodeIssue);
			cmd.addParameter("@P_VISS_CODE", pVissCode);
			cmd.addParameter("@P_VISA_START_DATE", pVisaStartDate);
			cmd.addParameter("@P_VISA_EXPIRE_DATE", pVisaExpireDate);
			cmd.addParameter("@P_ENTRY_IND", pEntryInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_VISA_REQ_DATE", pVisaReqDate);
			cmd.addParameter("@P_VISA_ISSUE_DATE", pVisaIssueDate);
			cmd.addParameter("@P_PENT_CODE", pPentCode);
			cmd.addParameter("@P_NO_ENTRIES", pNoEntries);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pSeqNoInout.val = cmd.getParameterValue("@P_SEQ_NO_INOUT", NNumber.class);
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", String.class).getBytes();


		}
		
		public static void pDelete(NNumber pPidm,NNumber pSeqNo,NString pVtypCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_VISA.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_VTYP_CODE", pVtypCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pPidm,NNumber pSeqNo,NString pVtypCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_VISA.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_VTYP_CODE", pVtypCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pPidm,NNumber pSeqNo,NString pVtypCode,NString pVisaNumber,NString pNatnCodeIssue,NString pVissCode,NDate pVisaStartDate,NDate pVisaExpireDate,NString pEntryInd,NString pUserId,NDate pVisaReqDate,NDate pVisaIssueDate,NString pPentCode,NString pNoEntries,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_VISA.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_VTYP_CODE", pVtypCode);
			cmd.addParameter("@P_VISA_NUMBER", pVisaNumber);
			cmd.addParameter("@P_NATN_CODE_ISSUE", pNatnCodeIssue);
			cmd.addParameter("@P_VISS_CODE", pVissCode);
			cmd.addParameter("@P_VISA_START_DATE", pVisaStartDate);
			cmd.addParameter("@P_VISA_EXPIRE_DATE", pVisaExpireDate);
			cmd.addParameter("@P_ENTRY_IND", pEntryInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_VISA_REQ_DATE", pVisaReqDate);
			cmd.addParameter("@P_VISA_ISSUE_DATE", pVisaIssueDate);
			cmd.addParameter("@P_PENT_CODE", pPentCode);
			cmd.addParameter("@P_NO_ENTRIES", pNoEntries);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="VisaRecRow", dataSourceName="VISA_REC")
	public static class VisaRecRow
	{
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_SEQ_NO")
		public NNumber RSeqNo;
		@DbRecordField(dataSourceName="R_VTYP_CODE")
		public NString RVtypCode;
		@DbRecordField(dataSourceName="R_VISA_NUMBER")
		public NString RVisaNumber;
		@DbRecordField(dataSourceName="R_NATN_CODE_ISSUE")
		public NString RNatnCodeIssue;
		@DbRecordField(dataSourceName="R_VISS_CODE")
		public NString RVissCode;
		@DbRecordField(dataSourceName="R_VISA_START_DATE")
		public NDate RVisaStartDate;
		@DbRecordField(dataSourceName="R_VISA_EXPIRE_DATE")
		public NDate RVisaExpireDate;
		@DbRecordField(dataSourceName="R_ENTRY_IND")
		public NString REntryInd;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_VISA_REQ_DATE")
		public NDate RVisaReqDate;
		@DbRecordField(dataSourceName="R_VISA_ISSUE_DATE")
		public NDate RVisaIssueDate;
		@DbRecordField(dataSourceName="R_PENT_CODE")
		public NString RPentCode;
		@DbRecordField(dataSourceName="R_NO_ENTRIES")
		public NString RNoEntries;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
