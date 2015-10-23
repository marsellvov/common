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

public class GbTelephone {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_TELEPHONE.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pPidm,NString pTeleCode,NNumber pSeqno,java.sql.RowId pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_TELEPHONE.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TELE_CODE", pTeleCode);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_ROWID",  DbManager.getDataBaseFactory().rowidToString(pRowid));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(TelephoneRecRow recOne,TelephoneRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_TELEPHONE.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, TelephoneRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, TelephoneRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static Cursor fQueryAll(NNumber pPidm) {
			return fQueryAll(pPidm,NString.getNull());
		}
		
		public static Cursor fQueryAll(NNumber pPidm,NString pTeleCode) {
			return fQueryAll(pPidm,pTeleCode,NNumber.getNull());
		}

		public static Cursor fQueryAll(NNumber pPidm,NString pTeleCode,NNumber pSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_TELEPHONE.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TELE_CODE", pTeleCode);
			cmd.addParameter("@P_SEQNO", pSeqno);
				
			cmd.execute();

			return cmd.getReturnValue(Cursor.class);

		}
		
		public static DataCursor fQueryByRowid(java.sql.RowId pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_TELEPHONE.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID",  DbManager.getDataBaseFactory().rowidToString(pRowid));
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static Cursor fQueryOne(NNumber pPidm,NString pTeleCode,NNumber pSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_TELEPHONE.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TELE_CODE", pTeleCode);
			cmd.addParameter("@P_SEQNO", pSeqno);
				
			cmd.execute();

			return cmd.getReturnValue(Cursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pPidm,NString pTeleCode,NNumber pSeqno,java.sql.RowId pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_TELEPHONE.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TELE_CODE", pTeleCode);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_ROWID",  DbManager.getDataBaseFactory().rowidToString(pRowid));
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(
				NNumber pPidm, 
				NString pTeleCode,
				NString pPhoneArea, 
				NString pPhoneNumber, 
				NString pPhoneExt,
				NString pStatusInd, 
				NString pAtypCode,
				NNumber pAddrSeqno,
				NString pPrimaryInd, 
				NString pDataOrigin,
				NString pUserId,
				NString pCtryCodePhone, 
				Ref<NNumber> pSeqnoOut, 
				Ref<byte[]> pRowidOut) {
			GbTelephone.pCreate(pPidm, pTeleCode, pPhoneArea, pPhoneNumber, 
					pPhoneExt, pStatusInd, pAtypCode, pAddrSeqno, pPrimaryInd, 
					NString.getNull(), NString.getNull(), NString.getNull(), pDataOrigin, pUserId, 
					pCtryCodePhone, pSeqnoOut, pRowidOut);
			
		}
		
		public static void pCreate(NNumber pPidm,NString pTeleCode,NString pPhoneArea,NString pPhoneNumber,NString pPhoneExt,NString pStatusInd,NString pAtypCode,NNumber pAddrSeqno,NString pPrimaryInd,NString pUnlistInd,NString pComment,NString pIntlAccess,NString pDataOrigin,NString pUserId,NString pCtryCodePhone,Ref<NNumber> pSeqnoOut,Ref<byte[]> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_TELEPHONE.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TELE_CODE", pTeleCode);
			cmd.addParameter("@P_PHONE_AREA", pPhoneArea);
			cmd.addParameter("@P_PHONE_NUMBER", pPhoneNumber);
			cmd.addParameter("@P_PHONE_EXT", pPhoneExt);
			cmd.addParameter("@P_STATUS_IND", pStatusInd);
			cmd.addParameter("@P_ATYP_CODE", pAtypCode);
			cmd.addParameter("@P_ADDR_SEQNO", pAddrSeqno);
			cmd.addParameter("@P_PRIMARY_IND", pPrimaryInd);
			cmd.addParameter("@P_UNLIST_IND", pUnlistInd);
			cmd.addParameter("@P_COMMENT", pComment);
			cmd.addParameter("@P_INTL_ACCESS", pIntlAccess);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_CTRY_CODE_PHONE", pCtryCodePhone);
			cmd.addParameter("@P_SEQNO_OUT", NNumber.class);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pSeqnoOut.val = cmd.getParameterValue("@P_SEQNO_OUT", NNumber.class);
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", String.class).getBytes();


		}
		
		public static void pDelete(NNumber pPidm,NString pTeleCode,NNumber pSeqno,java.sql.RowId pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_TELEPHONE.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TELE_CODE", pTeleCode);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_ROWID",  DbManager.getDataBaseFactory().rowidToString(pRowid));
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pPidm,NString pTeleCode,NNumber pSeqno,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_TELEPHONE.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TELE_CODE", pTeleCode);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(
				NNumber pPidm, 
				NNumber pSeqno,
				NString pTeleCode,
				NString pPhoneArea, 
				NString pPhoneNumber,
				NString pPhoneExt, 
				NNumber pAddrSeqno,
				NString pDataOrigin,
				NString pUserId, 
				NString pCtryCodePhone, 
				java.sql.RowId pRowid) {
			GbTelephone.pUpdate(pPidm, pSeqno, pTeleCode, pPhoneArea, 
					pPhoneNumber, pPhoneExt, pAddrSeqno, new NString(new char[] {(char)1}), 
					pDataOrigin, pUserId, pCtryCodePhone, pRowid);
			
		}
		
		public static void pUpdate(
				NNumber pPidm, 
				NNumber pSeqno,
				NString pTeleCode, 
				NString pPhoneArea, 
				NString pPhoneNumber,
				NString pPhoneExt, 
				NNumber pAddrSeqno, 
				NString pPrimaryInd,
				NString pDataOrigin, 
				NString pUserId, 
				NString pCtryCodePhone, 
				java.sql.RowId pRowid) {
			GbTelephone.pUpdate(pPidm, pSeqno, pTeleCode, pPhoneArea, 
					pPhoneNumber, pPhoneExt, new NString(new char[] {(char)1}),  new NString(new char[] {(char)1}), 
					pAddrSeqno, pPrimaryInd,  new NString(new char[] {(char)1}),  new NString(new char[] {(char)1}), 
					 new NString(new char[] {(char)1}), pDataOrigin, pUserId, pCtryCodePhone, pRowid);
			
		}
		
		public static void pUpdate(
				NNumber pPidm, 
				NNumber pSeqno,
				NString pTeleCode, 
				NString pStatusInd, 
				NString pDataOrigin,
				NString pUserId, 
				java.sql.RowId pRowid) {
			GbTelephone.pUpdate(pPidm, pSeqno, pTeleCode, new NString(new char[] {(char)1}), new NString(new char[] {(char)1}), 
					new NString(new char[] {(char)1}), pStatusInd, new NString(new char[] {(char)1}), NNumber.toNumber(1E-35), new NString(new char[] {(char)1}), new NString(new char[] {(char)1}), 
					new NString(new char[] {(char)1}), new NString(new char[] {(char)1}), pDataOrigin, pUserId, new NString(new char[] {(char)1}), pRowid);
			
		}
		
		public static void pUpdate(NNumber pPidm,NNumber pSeqno,NString pTeleCode,NString pPhoneArea,NString pPhoneNumber,NString pPhoneExt,NString pStatusInd,NString pAtypCode,NNumber pAddrSeqno,NString pPrimaryInd,NString pUnlistInd,NString pComment,NString pIntlAccess,NString pDataOrigin,NString pUserId,NString pCtryCodePhone,java.sql.RowId pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_TELEPHONE.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_TELE_CODE", pTeleCode);
			cmd.addParameter("@P_PHONE_AREA", pPhoneArea);
			cmd.addParameter("@P_PHONE_NUMBER", pPhoneNumber);
			cmd.addParameter("@P_PHONE_EXT", pPhoneExt);
			cmd.addParameter("@P_STATUS_IND", pStatusInd);
			cmd.addParameter("@P_ATYP_CODE", pAtypCode);
			cmd.addParameter("@P_ADDR_SEQNO", pAddrSeqno);
			cmd.addParameter("@P_PRIMARY_IND", pPrimaryInd);
			cmd.addParameter("@P_UNLIST_IND", pUnlistInd);
			cmd.addParameter("@P_COMMENT", pComment);
			cmd.addParameter("@P_INTL_ACCESS", pIntlAccess);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_CTRY_CODE_PHONE", pCtryCodePhone);
			cmd.addParameter("@P_ROWID",  DbManager.getDataBaseFactory().rowidToString(pRowid));
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="TelephoneRecRow", dataSourceName="TELEPHONE_REC")
	public static class TelephoneRecRow
	{
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_SEQNO")
		public NNumber RSeqno;
		@DbRecordField(dataSourceName="R_TELE_CODE")
		public NString RTeleCode;
		@DbRecordField(dataSourceName="R_PHONE_AREA")
		public NString RPhoneArea;
		@DbRecordField(dataSourceName="R_PHONE_NUMBER")
		public NString RPhoneNumber;
		@DbRecordField(dataSourceName="R_PHONE_EXT")
		public NString RPhoneExt;
		@DbRecordField(dataSourceName="R_STATUS_IND")
		public NString RStatusInd;
		@DbRecordField(dataSourceName="R_ATYP_CODE")
		public NString RAtypCode;
		@DbRecordField(dataSourceName="R_ADDR_SEQNO")
		public NNumber RAddrSeqno;
		@DbRecordField(dataSourceName="R_PRIMARY_IND")
		public NString RPrimaryInd;
		@DbRecordField(dataSourceName="R_UNLIST_IND")
		public NString RUnlistInd;
		@DbRecordField(dataSourceName="R_COMMENT")
		public NString RComment;
		@DbRecordField(dataSourceName="R_INTL_ACCESS")
		public NString RIntlAccess;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_CTRY_CODE_PHONE")
		public NString RCtryCodePhone;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
		
		public TelephoneRecRow() {
			super();
		}
		public TelephoneRecRow(Row sprteleRefResults) {
			super();
			RPidm = toNumber(sprteleRefResults.getObject(1));
			RSeqno = toNumber(sprteleRefResults.getObject(2));
			RTeleCode = toStr(sprteleRefResults.getObject(3));
			RPhoneArea = toStr(sprteleRefResults.getObject(4));
			RPhoneNumber = toStr(sprteleRefResults.getObject(5));
			RPhoneExt = toStr(sprteleRefResults.getObject(6));
			RStatusInd = toStr(sprteleRefResults.getObject(7));
			RAtypCode = toStr(sprteleRefResults.getObject(8));
			RAddrSeqno = toNumber(sprteleRefResults.getObject(9));
			RPrimaryInd = toStr(sprteleRefResults.getObject(10));
			RUnlistInd = toStr(sprteleRefResults.getObject(11));
			RComment = toStr(sprteleRefResults.getObject(12));
			RIntlAccess = toStr(sprteleRefResults.getObject(13));
			RDataOrigin = toStr(sprteleRefResults.getObject(14));
			RUserId = toStr(sprteleRefResults.getObject(15));
			RCtryCodePhone = toStr(sprteleRefResults.getObject(16));
			RInternalRecordId = toStr(sprteleRefResults.getObject(17));
		}
		
	}



	



	



	



	

	
	
}
