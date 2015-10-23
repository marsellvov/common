package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbEdiDocHeader {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_DOC_HEADER.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pDcmtSeqno,NString pEntyCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_DOC_HEADER.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_DCMT_SEQNO", pDcmtSeqno);
			cmd.addParameter("@P_ENTY_CODE", pEntyCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(EdiDocHeaderRecRow recOne,EdiDocHeaderRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_DOC_HEADER.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, EdiDocHeaderRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, EdiDocHeaderRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pDcmtSeqno,NString pEntyCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_DOC_HEADER.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_DCMT_SEQNO", pDcmtSeqno);
			cmd.addParameter("@P_ENTY_CODE", pEntyCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_DOC_HEADER.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pDcmtSeqno,NString pEntyCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_DOC_HEADER.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_DCMT_SEQNO", pDcmtSeqno);
			cmd.addParameter("@P_ENTY_CODE", pEntyCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pDcmtSeqno,NString pEntyCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_DOC_HEADER.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_DCMT_SEQNO", pDcmtSeqno);
			cmd.addParameter("@P_ENTY_CODE", pEntyCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NNumber pDcmtSeqno,NString pEntyCode,NString pEntyName1,NString pInqlCode,NString pInstCode,NString pEntyName2,NString pEntyName3,NString pStreetLine1,NString pStreetLine2,NString pCity,NString pStatCode,NString pZip,NString pNatnCode,NString pCtfnCode,NString pContactName,NString pCoqlCode,NString pCommNo,NString pDomesticAddrInd,NString pStreetLine3,NString pStateprovince,NString pDataOrigin,NString pUserId,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_DOC_HEADER.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DCMT_SEQNO", pDcmtSeqno);
			cmd.addParameter("@P_ENTY_CODE", pEntyCode);
			cmd.addParameter("@P_ENTY_NAME_1", pEntyName1);
			cmd.addParameter("@P_INQL_CODE", pInqlCode);
			cmd.addParameter("@P_INST_CODE", pInstCode);
			cmd.addParameter("@P_ENTY_NAME_2", pEntyName2);
			cmd.addParameter("@P_ENTY_NAME_3", pEntyName3);
			cmd.addParameter("@P_STREET_LINE1", pStreetLine1);
			cmd.addParameter("@P_STREET_LINE2", pStreetLine2);
			cmd.addParameter("@P_CITY", pCity);
			cmd.addParameter("@P_STAT_CODE", pStatCode);
			cmd.addParameter("@P_ZIP", pZip);
			cmd.addParameter("@P_NATN_CODE", pNatnCode);
			cmd.addParameter("@P_CTFN_CODE", pCtfnCode);
			cmd.addParameter("@P_CONTACT_NAME", pContactName);
			cmd.addParameter("@P_COQL_CODE", pCoqlCode);
			cmd.addParameter("@P_COMM_NO", pCommNo);
			cmd.addParameter("@P_DOMESTIC_ADDR_IND", pDomesticAddrInd);
			cmd.addParameter("@P_STREET_LINE3", pStreetLine3);
			cmd.addParameter("@P_STATEPROVINCE", pStateprovince);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pDcmtSeqno,NString pEntyCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_DOC_HEADER.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DCMT_SEQNO", pDcmtSeqno);
			cmd.addParameter("@P_ENTY_CODE", pEntyCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pDcmtSeqno,NString pEntyCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_DOC_HEADER.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DCMT_SEQNO", pDcmtSeqno);
			cmd.addParameter("@P_ENTY_CODE", pEntyCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pDcmtSeqno,NString pEntyCode,NString pEntyName1,NString pInqlCode,NString pInstCode,NString pEntyName2,NString pEntyName3,NString pStreetLine1,NString pStreetLine2,NString pCity,NString pStatCode,NString pZip,NString pNatnCode,NString pCtfnCode,NString pContactName,NString pCoqlCode,NString pCommNo,NString pDomesticAddrInd,NString pStreetLine3,NString pStateprovince,NString pDataOrigin,NString pUserId,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_DOC_HEADER.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DCMT_SEQNO", pDcmtSeqno);
			cmd.addParameter("@P_ENTY_CODE", pEntyCode);
			cmd.addParameter("@P_ENTY_NAME_1", pEntyName1);
			cmd.addParameter("@P_INQL_CODE", pInqlCode);
			cmd.addParameter("@P_INST_CODE", pInstCode);
			cmd.addParameter("@P_ENTY_NAME_2", pEntyName2);
			cmd.addParameter("@P_ENTY_NAME_3", pEntyName3);
			cmd.addParameter("@P_STREET_LINE1", pStreetLine1);
			cmd.addParameter("@P_STREET_LINE2", pStreetLine2);
			cmd.addParameter("@P_CITY", pCity);
			cmd.addParameter("@P_STAT_CODE", pStatCode);
			cmd.addParameter("@P_ZIP", pZip);
			cmd.addParameter("@P_NATN_CODE", pNatnCode);
			cmd.addParameter("@P_CTFN_CODE", pCtfnCode);
			cmd.addParameter("@P_CONTACT_NAME", pContactName);
			cmd.addParameter("@P_COQL_CODE", pCoqlCode);
			cmd.addParameter("@P_COMM_NO", pCommNo);
			cmd.addParameter("@P_DOMESTIC_ADDR_IND", pDomesticAddrInd);
			cmd.addParameter("@P_STREET_LINE3", pStreetLine3);
			cmd.addParameter("@P_STATEPROVINCE", pStateprovince);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="EdiDocHeaderRecRow", dataSourceName="EDI_DOC_HEADER_REC")
	public static class EdiDocHeaderRecRow
	{
		@DbRecordField(dataSourceName="R_DCMT_SEQNO")
		public NNumber RDcmtSeqno;
		@DbRecordField(dataSourceName="R_ENTY_CODE")
		public NString REntyCode;
		@DbRecordField(dataSourceName="R_ENTY_NAME_1")
		public NString REntyName1;
		@DbRecordField(dataSourceName="R_INQL_CODE")
		public NString RInqlCode;
		@DbRecordField(dataSourceName="R_INST_CODE")
		public NString RInstCode;
		@DbRecordField(dataSourceName="R_ENTY_NAME_2")
		public NString REntyName2;
		@DbRecordField(dataSourceName="R_ENTY_NAME_3")
		public NString REntyName3;
		@DbRecordField(dataSourceName="R_STREET_LINE1")
		public NString RStreetLine1;
		@DbRecordField(dataSourceName="R_STREET_LINE2")
		public NString RStreetLine2;
		@DbRecordField(dataSourceName="R_CITY")
		public NString RCity;
		@DbRecordField(dataSourceName="R_STAT_CODE")
		public NString RStatCode;
		@DbRecordField(dataSourceName="R_ZIP")
		public NString RZip;
		@DbRecordField(dataSourceName="R_NATN_CODE")
		public NString RNatnCode;
		@DbRecordField(dataSourceName="R_CTFN_CODE")
		public NString RCtfnCode;
		@DbRecordField(dataSourceName="R_CONTACT_NAME")
		public NString RContactName;
		@DbRecordField(dataSourceName="R_COQL_CODE")
		public NString RCoqlCode;
		@DbRecordField(dataSourceName="R_COMM_NO")
		public NString RCommNo;
		@DbRecordField(dataSourceName="R_DOMESTIC_ADDR_IND")
		public NString RDomesticAddrInd;
		@DbRecordField(dataSourceName="R_STREET_LINE3")
		public NString RStreetLine3;
		@DbRecordField(dataSourceName="R_STATEPROVINCE")
		public NString RStateprovince;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
