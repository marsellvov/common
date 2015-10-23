package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbEdiAcadSession {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_ACAD_SESSION.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pDcmtSeqno,NNumber pSeqno,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_ACAD_SESSION.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_DCMT_SEQNO", pDcmtSeqno);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(EdiAcadSessionRecRow recOne,EdiAcadSessionRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_ACAD_SESSION.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, EdiAcadSessionRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, EdiAcadSessionRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pDcmtSeqno,NNumber pSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_ACAD_SESSION.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_DCMT_SEQNO", pDcmtSeqno);
			cmd.addParameter("@P_SEQNO", pSeqno);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_ACAD_SESSION.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pDcmtSeqno,NNumber pSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_ACAD_SESSION.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_DCMT_SEQNO", pDcmtSeqno);
			cmd.addParameter("@P_SEQNO", pSeqno);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pDcmtSeqno,NNumber pSeqno,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_ACAD_SESSION.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_DCMT_SEQNO", pDcmtSeqno);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NNumber pDcmtSeqno,NNumber pSeqno,NString pStartDate,NNumber pSessNo,NString pSchoolYear,NString pSntpCode,NString pSessName,NString pSbqlCode,NString pBeginDate,NString pSeqlCode,NString pEndDate,NString pSlvlCode,NString pCrqlCode,NString pCurrCode,NString pCurrName,NString pHonrCode,NString pOvrdCode,NString pInstNameOvrd,NString pInqlCodeOvrd,NString pInstCodeOvrd,NString pStreetLine1Ovrd,NString pStreetLine2Ovrd,NString pCityOvrd,NString pStatCodeOvrd,NString pZipOvrd,NString pNatnCodeOvrd,NString pDomesticAddrInd,NString pStreetLine3,NString pStateprovince,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_ACAD_SESSION.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DCMT_SEQNO", pDcmtSeqno);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_START_DATE", pStartDate);
			cmd.addParameter("@P_SESS_NO", pSessNo);
			cmd.addParameter("@P_SCHOOL_YEAR", pSchoolYear);
			cmd.addParameter("@P_SNTP_CODE", pSntpCode);
			cmd.addParameter("@P_SESS_NAME", pSessName);
			cmd.addParameter("@P_SBQL_CODE", pSbqlCode);
			cmd.addParameter("@P_BEGIN_DATE", pBeginDate);
			cmd.addParameter("@P_SEQL_CODE", pSeqlCode);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_SLVL_CODE", pSlvlCode);
			cmd.addParameter("@P_CRQL_CODE", pCrqlCode);
			cmd.addParameter("@P_CURR_CODE", pCurrCode);
			cmd.addParameter("@P_CURR_NAME", pCurrName);
			cmd.addParameter("@P_HONR_CODE", pHonrCode);
			cmd.addParameter("@P_OVRD_CODE", pOvrdCode);
			cmd.addParameter("@P_INST_NAME_OVRD", pInstNameOvrd);
			cmd.addParameter("@P_INQL_CODE_OVRD", pInqlCodeOvrd);
			cmd.addParameter("@P_INST_CODE_OVRD", pInstCodeOvrd);
			cmd.addParameter("@P_STREET_LINE1_OVRD", pStreetLine1Ovrd);
			cmd.addParameter("@P_STREET_LINE2_OVRD", pStreetLine2Ovrd);
			cmd.addParameter("@P_CITY_OVRD", pCityOvrd);
			cmd.addParameter("@P_STAT_CODE_OVRD", pStatCodeOvrd);
			cmd.addParameter("@P_ZIP_OVRD", pZipOvrd);
			cmd.addParameter("@P_NATN_CODE_OVRD", pNatnCodeOvrd);
			cmd.addParameter("@P_DOMESTIC_ADDR_IND", pDomesticAddrInd);
			cmd.addParameter("@P_STREET_LINE3", pStreetLine3);
			cmd.addParameter("@P_STATEPROVINCE", pStateprovince);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pDcmtSeqno,NNumber pSeqno,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_ACAD_SESSION.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DCMT_SEQNO", pDcmtSeqno);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pDcmtSeqno,NNumber pSeqno,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_ACAD_SESSION.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DCMT_SEQNO", pDcmtSeqno);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pDcmtSeqno,NNumber pSeqno,NString pStartDate,NNumber pSessNo,NString pSchoolYear,NString pSntpCode,NString pSessName,NString pSbqlCode,NString pBeginDate,NString pSeqlCode,NString pEndDate,NString pSlvlCode,NString pCrqlCode,NString pCurrCode,NString pCurrName,NString pHonrCode,NString pOvrdCode,NString pInstNameOvrd,NString pInqlCodeOvrd,NString pInstCodeOvrd,NString pStreetLine1Ovrd,NString pStreetLine2Ovrd,NString pCityOvrd,NString pStatCodeOvrd,NString pZipOvrd,NString pNatnCodeOvrd,NString pDomesticAddrInd,NString pStreetLine3,NString pStateprovince,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_ACAD_SESSION.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DCMT_SEQNO", pDcmtSeqno);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_START_DATE", pStartDate);
			cmd.addParameter("@P_SESS_NO", pSessNo);
			cmd.addParameter("@P_SCHOOL_YEAR", pSchoolYear);
			cmd.addParameter("@P_SNTP_CODE", pSntpCode);
			cmd.addParameter("@P_SESS_NAME", pSessName);
			cmd.addParameter("@P_SBQL_CODE", pSbqlCode);
			cmd.addParameter("@P_BEGIN_DATE", pBeginDate);
			cmd.addParameter("@P_SEQL_CODE", pSeqlCode);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_SLVL_CODE", pSlvlCode);
			cmd.addParameter("@P_CRQL_CODE", pCrqlCode);
			cmd.addParameter("@P_CURR_CODE", pCurrCode);
			cmd.addParameter("@P_CURR_NAME", pCurrName);
			cmd.addParameter("@P_HONR_CODE", pHonrCode);
			cmd.addParameter("@P_OVRD_CODE", pOvrdCode);
			cmd.addParameter("@P_INST_NAME_OVRD", pInstNameOvrd);
			cmd.addParameter("@P_INQL_CODE_OVRD", pInqlCodeOvrd);
			cmd.addParameter("@P_INST_CODE_OVRD", pInstCodeOvrd);
			cmd.addParameter("@P_STREET_LINE1_OVRD", pStreetLine1Ovrd);
			cmd.addParameter("@P_STREET_LINE2_OVRD", pStreetLine2Ovrd);
			cmd.addParameter("@P_CITY_OVRD", pCityOvrd);
			cmd.addParameter("@P_STAT_CODE_OVRD", pStatCodeOvrd);
			cmd.addParameter("@P_ZIP_OVRD", pZipOvrd);
			cmd.addParameter("@P_NATN_CODE_OVRD", pNatnCodeOvrd);
			cmd.addParameter("@P_DOMESTIC_ADDR_IND", pDomesticAddrInd);
			cmd.addParameter("@P_STREET_LINE3", pStreetLine3);
			cmd.addParameter("@P_STATEPROVINCE", pStateprovince);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="EdiAcadSessionRecRow", dataSourceName="EDI_ACAD_SESSION_REC")
	public static class EdiAcadSessionRecRow
	{
		@DbRecordField(dataSourceName="R_DCMT_SEQNO")
		public NNumber RDcmtSeqno;
		@DbRecordField(dataSourceName="R_SEQNO")
		public NNumber RSeqno;
		@DbRecordField(dataSourceName="R_START_DATE")
		public NString RStartDate;
		@DbRecordField(dataSourceName="R_SESS_NO")
		public NNumber RSessNo;
		@DbRecordField(dataSourceName="R_SCHOOL_YEAR")
		public NString RSchoolYear;
		@DbRecordField(dataSourceName="R_SNTP_CODE")
		public NString RSntpCode;
		@DbRecordField(dataSourceName="R_SESS_NAME")
		public NString RSessName;
		@DbRecordField(dataSourceName="R_SBQL_CODE")
		public NString RSbqlCode;
		@DbRecordField(dataSourceName="R_BEGIN_DATE")
		public NString RBeginDate;
		@DbRecordField(dataSourceName="R_SEQL_CODE")
		public NString RSeqlCode;
		@DbRecordField(dataSourceName="R_END_DATE")
		public NString REndDate;
		@DbRecordField(dataSourceName="R_SLVL_CODE")
		public NString RSlvlCode;
		@DbRecordField(dataSourceName="R_CRQL_CODE")
		public NString RCrqlCode;
		@DbRecordField(dataSourceName="R_CURR_CODE")
		public NString RCurrCode;
		@DbRecordField(dataSourceName="R_CURR_NAME")
		public NString RCurrName;
		@DbRecordField(dataSourceName="R_HONR_CODE")
		public NString RHonrCode;
		@DbRecordField(dataSourceName="R_OVRD_CODE")
		public NString ROvrdCode;
		@DbRecordField(dataSourceName="R_INST_NAME_OVRD")
		public NString RInstNameOvrd;
		@DbRecordField(dataSourceName="R_INQL_CODE_OVRD")
		public NString RInqlCodeOvrd;
		@DbRecordField(dataSourceName="R_INST_CODE_OVRD")
		public NString RInstCodeOvrd;
		@DbRecordField(dataSourceName="R_STREET_LINE1_OVRD")
		public NString RStreetLine1Ovrd;
		@DbRecordField(dataSourceName="R_STREET_LINE2_OVRD")
		public NString RStreetLine2Ovrd;
		@DbRecordField(dataSourceName="R_CITY_OVRD")
		public NString RCityOvrd;
		@DbRecordField(dataSourceName="R_STAT_CODE_OVRD")
		public NString RStatCodeOvrd;
		@DbRecordField(dataSourceName="R_ZIP_OVRD")
		public NString RZipOvrd;
		@DbRecordField(dataSourceName="R_NATN_CODE_OVRD")
		public NString RNatnCodeOvrd;
		@DbRecordField(dataSourceName="R_DOMESTIC_ADDR_IND")
		public NString RDomesticAddrInd;
		@DbRecordField(dataSourceName="R_STREET_LINE3")
		public NString RStreetLine3;
		@DbRecordField(dataSourceName="R_STATEPROVINCE")
		public NString RStateprovince;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
