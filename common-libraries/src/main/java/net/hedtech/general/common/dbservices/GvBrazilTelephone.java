package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GvBrazilTelephone {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GV_BRAZIL_TELEPHONE.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pPidm,NString pTeleCode,NNumber pSeqno,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GV_BRAZIL_TELEPHONE.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TELE_CODE", pTeleCode);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(BrazilTelephoneRecRow recOne,BrazilTelephoneRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GV_BRAZIL_TELEPHONE.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, BrazilTelephoneRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, BrazilTelephoneRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pPidm,NString pTeleCode,NNumber pSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GV_BRAZIL_TELEPHONE.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TELE_CODE", pTeleCode);
			cmd.addParameter("@P_SEQNO", pSeqno);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GV_BRAZIL_TELEPHONE.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPidm,NString pTeleCode,NNumber pSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GV_BRAZIL_TELEPHONE.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TELE_CODE", pTeleCode);
			cmd.addParameter("@P_SEQNO", pSeqno);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pPidm,NString pTeleCode,NNumber pSeqno,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GV_BRAZIL_TELEPHONE.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TELE_CODE", pTeleCode);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NNumber pPidm,NString pTeleCode,NString pPhoneArea,NString pPhoneNumber,NString pPhoneExt,NString pStatusInd,NString pAtypCode,NNumber pAddrSeqno,NString pPrimaryInd,NString pUnlistInd,NString pComment,NString pIntlAccess,NString pDataOrigin,NString pUserId,NString pCtryCodePhone,Ref<NNumber> pSeqnoOut,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GV_BRAZIL_TELEPHONE.P_CREATE", DbManager.getDataBaseFactory());
			
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
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pPidm,NString pTeleCode,NNumber pSeqno,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GV_BRAZIL_TELEPHONE.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TELE_CODE", pTeleCode);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pPidm,NString pTeleCode,NNumber pSeqno,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GV_BRAZIL_TELEPHONE.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TELE_CODE", pTeleCode);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pSetTelephone(NString pPhoneAreaIn,NString pPhoneNumberIn,Ref<NString> pPhoneAreaOut,Ref<NString> pPhoneNumberOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GV_BRAZIL_TELEPHONE.P_SET_TELEPHONE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PHONE_AREA_IN", pPhoneAreaIn);
			cmd.addParameter("@P_PHONE_NUMBER_IN", pPhoneNumberIn);
			cmd.addParameter("@P_PHONE_AREA_OUT", pPhoneAreaOut, true);
			cmd.addParameter("@P_PHONE_NUMBER_OUT", pPhoneNumberOut, true);
				
			cmd.execute();
			pPhoneAreaOut.val = cmd.getParameterValue("@P_PHONE_AREA_OUT", NString.class);
			pPhoneNumberOut.val = cmd.getParameterValue("@P_PHONE_NUMBER_OUT", NString.class);


		}
		
		public static void pUpdate(NNumber pPidm,NNumber pSeqno,NString pTeleCode,NString pPhoneArea,NString pPhoneNumber,NString pPhoneExt,NString pStatusInd,NString pAtypCode,NNumber pAddrSeqno,NString pPrimaryInd,NString pUnlistInd,NString pComment,NString pIntlAccess,NString pDataOrigin,NString pUserId,NString pCtryCodePhone,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GV_BRAZIL_TELEPHONE.P_UPDATE", DbManager.getDataBaseFactory());
			
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
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	@DbRecordType(id="BrazilTelephoneRecRow", dataSourceName="BRAZIL_TELEPHONE_REC")
	public static class BrazilTelephoneRecRow
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
	}

	
	
}
