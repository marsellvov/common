package net.hedtech.general.common.dbservices;

import java.util.*;

import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;
import static morphis.foundations.core.types.Types.*;


public class GbIdentification {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_IDENTIFICATION.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pPidm,NString pId,NString pLastName,NString pFirstName,NString pMi,NString pChangeInd,NString pNtypCode,NString pSurnamePrefix,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_IDENTIFICATION.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_FIRST_NAME", pFirstName);
			cmd.addParameter("@P_MI", pMi);
			cmd.addParameter("@P_CHANGE_IND", pChangeInd);
			cmd.addParameter("@P_NTYP_CODE", pNtypCode);
			cmd.addParameter("@P_SURNAME_PREFIX", pSurnamePrefix);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetEntity(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_IDENTIFICATION.F_GET_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static List<GIdnameSearchNtRow> fIdnameSearch(NString pId,NString pLastName,NString pFirstName,NString pMi,NString pNtypCode,NString pEntityInd,NString pCity,NString pStatCode,NString pZip,NString pSsn,NString pSex,NString pBirthDate) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_IDENTIFICATION.F_IDNAME_SEARCH", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<GIdnameSearchNtRow>.class);
//			cmd.addParameter("@P_ID", pId);
//			cmd.addParameter("@P_LAST_NAME", pLastName);
//			cmd.addParameter("@P_FIRST_NAME", pFirstName);
//			cmd.addParameter("@P_MI", pMi);
//			cmd.addParameter("@P_NTYP_CODE", pNtypCode);
//			cmd.addParameter("@P_ENTITY_IND", pEntityInd);
//			cmd.addParameter("@P_CITY", pCity);
//			cmd.addParameter("@P_STAT_CODE", pStatCode);
//			cmd.addParameter("@P_ZIP", pZip);
//			cmd.addParameter("@P_SSN", pSsn);
//			cmd.addParameter("@P_SEX", pSex);
//			cmd.addParameter("@P_BIRTH_DATE", pBirthDate);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<GIdnameSearchNtRow>.class);
//
//		}
		
		public static NString fIsequal(IdentificationRecRow recOne,IdentificationRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_IDENTIFICATION.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, IdentificationRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, IdentificationRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pPidm,NString pId,NString pLastName,NString pFirstName,NString pMi,NString pChangeInd,NString pNtypCode,NString pSurnamePrefix) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_IDENTIFICATION.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_FIRST_NAME", pFirstName);
			cmd.addParameter("@P_MI", pMi);
			cmd.addParameter("@P_CHANGE_IND", pChangeInd);
			cmd.addParameter("@P_NTYP_CODE", pNtypCode);
			cmd.addParameter("@P_SURNAME_PREFIX", pSurnamePrefix);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_IDENTIFICATION.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static Cursor fQueryOne(NNumber pPidm) {
			
			return fQueryOne(pPidm,NString.getNull());
		}
		
		public static Cursor fQueryOne(NNumber pPidm,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_IDENTIFICATION.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(Cursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pPidm,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_IDENTIFICATION.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
//		public static List<GIdnameSearchNtRow> fSsnnameSearch(NString pId,NString pLastName,NString pFirstName,NString pMi,NString pNtypCode,NString pEntityInd,NString pCity,NString pStatCode,NString pZip,NString pSsn,NString pSex,NString pBirthDate) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_IDENTIFICATION.F_SSNNAME_SEARCH", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<GIdnameSearchNtRow>.class);
//			cmd.addParameter("@P_ID", pId);
//			cmd.addParameter("@P_LAST_NAME", pLastName);
//			cmd.addParameter("@P_FIRST_NAME", pFirstName);
//			cmd.addParameter("@P_MI", pMi);
//			cmd.addParameter("@P_NTYP_CODE", pNtypCode);
//			cmd.addParameter("@P_ENTITY_IND", pEntityInd);
//			cmd.addParameter("@P_CITY", pCity);
//			cmd.addParameter("@P_STAT_CODE", pStatCode);
//			cmd.addParameter("@P_ZIP", pZip);
//			cmd.addParameter("@P_SSN", pSsn);
//			cmd.addParameter("@P_SEX", pSex);
//			cmd.addParameter("@P_BIRTH_DATE", pBirthDate);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<GIdnameSearchNtRow>.class);
//
//		}
		
		public static void pCreate(Ref<NString> pIdInout,NString pLastName,NString pFirstName,NString pMi,NString pChangeInd,NString pEntityInd,NString pUser,NString pOrigin,NString pNtypCode,NString pDataOrigin,NString pSurnamePrefix,Ref<NNumber> pPidmInout,Ref<byte[]> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_IDENTIFICATION.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID_INOUT", pIdInout, true);
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_FIRST_NAME", pFirstName);
			cmd.addParameter("@P_MI", pMi);
			cmd.addParameter("@P_CHANGE_IND", pChangeInd);
			cmd.addParameter("@P_ENTITY_IND", pEntityInd);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_ORIGIN", pOrigin);
			cmd.addParameter("@P_NTYP_CODE", pNtypCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_SURNAME_PREFIX", pSurnamePrefix);
			cmd.addParameter("@P_PIDM_INOUT", pPidmInout, true);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pIdInout.val = cmd.getParameterValue("@P_ID_INOUT", NString.class);
			pPidmInout.val = cmd.getParameterValue("@P_PIDM_INOUT", NNumber.class);
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", String.class).getBytes();


		}
		
		public static void pDelete(NNumber pPidm,NString pId,NString pLastName,NString pFirstName,NString pMi,NString pChangeInd,NString pNtypCode,NString pSurnamePrefix,java.sql.RowId pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_IDENTIFICATION.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_FIRST_NAME", pFirstName);
			cmd.addParameter("@P_MI", pMi);
			cmd.addParameter("@P_CHANGE_IND", pChangeInd);
			cmd.addParameter("@P_NTYP_CODE", pNtypCode);
			cmd.addParameter("@P_SURNAME_PREFIX", pSurnamePrefix);
			cmd.addParameter("@P_ROWID",  DbManager.getDataBaseFactory().rowidToString(pRowid));
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pPidm,NString pId,NString pLastName,NString pFirstName,NString pMi,NString pChangeInd,NString pNtypCode,NString pSurnamePrefix,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_IDENTIFICATION.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_FIRST_NAME", pFirstName);
			cmd.addParameter("@P_MI", pMi);
			cmd.addParameter("@P_CHANGE_IND", pChangeInd);
			cmd.addParameter("@P_NTYP_CODE", pNtypCode);
			cmd.addParameter("@P_SURNAME_PREFIX", pSurnamePrefix);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pPidm,
				NString pId,
				NString pLastName,
				NString pFirstName,
				NString pMi,
				NString pChangeInd,
				NString pEntityInd,
				NString pUser,
				NString pOrigin,
				NString pNtypCode,
				NString pDataOrigin,
				NString pSurnamePrefix,
				java.sql.RowId pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_IDENTIFICATION.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_FIRST_NAME", pFirstName);
			cmd.addParameter("@P_MI", pMi);
			cmd.addParameter("@P_CHANGE_IND", pChangeInd);
			cmd.addParameter("@P_ENTITY_IND", pEntityInd);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_ORIGIN", pOrigin);
			cmd.addParameter("@P_NTYP_CODE", pNtypCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_SURNAME_PREFIX", pSurnamePrefix);
			cmd.addParameter("@P_ROWID",  DbManager.getDataBaseFactory().rowidToString(pRowid));
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="IdentificationRecRow", dataSourceName="IDENTIFICATION_REC")
	public static class IdentificationRecRow
	{
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_ID")
		public NString RId;
		@DbRecordField(dataSourceName="R_LAST_NAME")
		public NString RLastName;
		@DbRecordField(dataSourceName="R_FIRST_NAME")
		public NString RFirstName;
		@DbRecordField(dataSourceName="R_MI")
		public NString RMi;
		@DbRecordField(dataSourceName="R_CHANGE_IND")
		public NString RChangeInd;
		@DbRecordField(dataSourceName="R_ENTITY_IND")
		public NString REntityInd;
		@DbRecordField(dataSourceName="R_USER")
		public NString RUser;
		@DbRecordField(dataSourceName="R_ORIGIN")
		public NString ROrigin;
		@DbRecordField(dataSourceName="R_NTYP_CODE")
		public NString RNtypCode;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_CREATE_FDMN_CODE")
		public NString RCreateFdmnCode;
		@DbRecordField(dataSourceName="R_SURNAME_PREFIX")
		public NString RSurnamePrefix;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
		
		public IdentificationRecRow() {
			super();
		}
		
		public IdentificationRecRow( Row spridenRefResults ) {
			super();
			RPidm = toNumber(spridenRefResults.getObject(1));
			RId = toStr(spridenRefResults.getObject(2));
			RLastName =  toStr(spridenRefResults.getObject(3));
			RFirstName =  toStr(spridenRefResults.getObject(4));
			RMi =  toStr(spridenRefResults.getObject(5));
			RChangeInd =  toStr(spridenRefResults.getObject(6));
			REntityInd =  toStr(spridenRefResults.getObject(7));
			RUser =  toStr(spridenRefResults.getObject(8));
			ROrigin =  toStr(spridenRefResults.getObject(9));
			RNtypCode =  toStr(spridenRefResults.getObject(10));
			RDataOrigin =  toStr(spridenRefResults.getObject(11));
			RCreateFdmnCode =  toStr(spridenRefResults.getObject(12));
			RSurnamePrefix =  toStr(spridenRefResults.getObject(13));
			RInternalRecordId =  toStr(spridenRefResults.getObject(14));
		}
	}

	
	
}
