package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbEdiIdentification {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_IDENTIFICATION.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pDcmtSeqno,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_IDENTIFICATION.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_DCMT_SEQNO", pDcmtSeqno);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(EdiIdentificationRecRow recOne,EdiIdentificationRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_IDENTIFICATION.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, EdiIdentificationRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, EdiIdentificationRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pDcmtSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_IDENTIFICATION.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_DCMT_SEQNO", pDcmtSeqno);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_IDENTIFICATION.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pDcmtSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_IDENTIFICATION.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_DCMT_SEQNO", pDcmtSeqno);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pDcmtSeqno,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_IDENTIFICATION.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_DCMT_SEQNO", pDcmtSeqno);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NNumber pDcmtSeqno,NString pIdqlCode,NString pIdnmCode,NString pEnidCode,NString pRnqlCode,NString pRefNumb,NString pRltnCode,NString pLastName,NString pNamePrefix,NString pFirstName,NString pFirstInitial,NString pMiddleName1,NString pMiddleName2,NString pMiddleInitial1,NString pMiddleInitial2,NString pNameSuffix,NString pFormerName,NString pCombinedName,NString pCompositeName,NString pAgencyName,NString pStreetLine1,NString pStreetLine2,NString pCity,NString pStatCode,NString pZip,NString pNatnCode,NString pIdNote,NString pDomesticAddrInd,NString pStreetLine3,NString pStateprovince,NString pDataOrigin,NString pUserId,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_IDENTIFICATION.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DCMT_SEQNO", pDcmtSeqno);
			cmd.addParameter("@P_IDQL_CODE", pIdqlCode);
			cmd.addParameter("@P_IDNM_CODE", pIdnmCode);
			cmd.addParameter("@P_ENID_CODE", pEnidCode);
			cmd.addParameter("@P_RNQL_CODE", pRnqlCode);
			cmd.addParameter("@P_REF_NUMB", pRefNumb);
			cmd.addParameter("@P_RLTN_CODE", pRltnCode);
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_NAME_PREFIX", pNamePrefix);
			cmd.addParameter("@P_FIRST_NAME", pFirstName);
			cmd.addParameter("@P_FIRST_INITIAL", pFirstInitial);
			cmd.addParameter("@P_MIDDLE_NAME_1", pMiddleName1);
			cmd.addParameter("@P_MIDDLE_NAME_2", pMiddleName2);
			cmd.addParameter("@P_MIDDLE_INITIAL_1", pMiddleInitial1);
			cmd.addParameter("@P_MIDDLE_INITIAL_2", pMiddleInitial2);
			cmd.addParameter("@P_NAME_SUFFIX", pNameSuffix);
			cmd.addParameter("@P_FORMER_NAME", pFormerName);
			cmd.addParameter("@P_COMBINED_NAME", pCombinedName);
			cmd.addParameter("@P_COMPOSITE_NAME", pCompositeName);
			cmd.addParameter("@P_AGENCY_NAME", pAgencyName);
			cmd.addParameter("@P_STREET_LINE1", pStreetLine1);
			cmd.addParameter("@P_STREET_LINE2", pStreetLine2);
			cmd.addParameter("@P_CITY", pCity);
			cmd.addParameter("@P_STAT_CODE", pStatCode);
			cmd.addParameter("@P_ZIP", pZip);
			cmd.addParameter("@P_NATN_CODE", pNatnCode);
			cmd.addParameter("@P_ID_NOTE", pIdNote);
			cmd.addParameter("@P_DOMESTIC_ADDR_IND", pDomesticAddrInd);
			cmd.addParameter("@P_STREET_LINE3", pStreetLine3);
			cmd.addParameter("@P_STATEPROVINCE", pStateprovince);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pDcmtSeqno,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_IDENTIFICATION.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DCMT_SEQNO", pDcmtSeqno);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pDcmtSeqno,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_IDENTIFICATION.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DCMT_SEQNO", pDcmtSeqno);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pDcmtSeqno,NString pIdqlCode,NString pIdnmCode,NString pEnidCode,NString pRnqlCode,NString pRefNumb,NString pRltnCode,NString pLastName,NString pNamePrefix,NString pFirstName,NString pFirstInitial,NString pMiddleName1,NString pMiddleName2,NString pMiddleInitial1,NString pMiddleInitial2,NString pNameSuffix,NString pFormerName,NString pCombinedName,NString pCompositeName,NString pAgencyName,NString pStreetLine1,NString pStreetLine2,NString pCity,NString pStatCode,NString pZip,NString pNatnCode,NString pIdNote,NString pDomesticAddrInd,NString pStreetLine3,NString pStateprovince,NString pDataOrigin,NString pUserId,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_IDENTIFICATION.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DCMT_SEQNO", pDcmtSeqno);
			cmd.addParameter("@P_IDQL_CODE", pIdqlCode);
			cmd.addParameter("@P_IDNM_CODE", pIdnmCode);
			cmd.addParameter("@P_ENID_CODE", pEnidCode);
			cmd.addParameter("@P_RNQL_CODE", pRnqlCode);
			cmd.addParameter("@P_REF_NUMB", pRefNumb);
			cmd.addParameter("@P_RLTN_CODE", pRltnCode);
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_NAME_PREFIX", pNamePrefix);
			cmd.addParameter("@P_FIRST_NAME", pFirstName);
			cmd.addParameter("@P_FIRST_INITIAL", pFirstInitial);
			cmd.addParameter("@P_MIDDLE_NAME_1", pMiddleName1);
			cmd.addParameter("@P_MIDDLE_NAME_2", pMiddleName2);
			cmd.addParameter("@P_MIDDLE_INITIAL_1", pMiddleInitial1);
			cmd.addParameter("@P_MIDDLE_INITIAL_2", pMiddleInitial2);
			cmd.addParameter("@P_NAME_SUFFIX", pNameSuffix);
			cmd.addParameter("@P_FORMER_NAME", pFormerName);
			cmd.addParameter("@P_COMBINED_NAME", pCombinedName);
			cmd.addParameter("@P_COMPOSITE_NAME", pCompositeName);
			cmd.addParameter("@P_AGENCY_NAME", pAgencyName);
			cmd.addParameter("@P_STREET_LINE1", pStreetLine1);
			cmd.addParameter("@P_STREET_LINE2", pStreetLine2);
			cmd.addParameter("@P_CITY", pCity);
			cmd.addParameter("@P_STAT_CODE", pStatCode);
			cmd.addParameter("@P_ZIP", pZip);
			cmd.addParameter("@P_NATN_CODE", pNatnCode);
			cmd.addParameter("@P_ID_NOTE", pIdNote);
			cmd.addParameter("@P_DOMESTIC_ADDR_IND", pDomesticAddrInd);
			cmd.addParameter("@P_STREET_LINE3", pStreetLine3);
			cmd.addParameter("@P_STATEPROVINCE", pStateprovince);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="EdiIdentificationRecRow", dataSourceName="EDI_IDENTIFICATION_REC")
	public static class EdiIdentificationRecRow
	{
		@DbRecordField(dataSourceName="R_DCMT_SEQNO")
		public NNumber RDcmtSeqno;
		@DbRecordField(dataSourceName="R_IDQL_CODE")
		public NString RIdqlCode;
		@DbRecordField(dataSourceName="R_IDNM_CODE")
		public NString RIdnmCode;
		@DbRecordField(dataSourceName="R_ENID_CODE")
		public NString REnidCode;
		@DbRecordField(dataSourceName="R_RNQL_CODE")
		public NString RRnqlCode;
		@DbRecordField(dataSourceName="R_REF_NUMB")
		public NString RRefNumb;
		@DbRecordField(dataSourceName="R_RLTN_CODE")
		public NString RRltnCode;
		@DbRecordField(dataSourceName="R_LAST_NAME")
		public NString RLastName;
		@DbRecordField(dataSourceName="R_NAME_PREFIX")
		public NString RNamePrefix;
		@DbRecordField(dataSourceName="R_FIRST_NAME")
		public NString RFirstName;
		@DbRecordField(dataSourceName="R_FIRST_INITIAL")
		public NString RFirstInitial;
		@DbRecordField(dataSourceName="R_MIDDLE_NAME_1")
		public NString RMiddleName1;
		@DbRecordField(dataSourceName="R_MIDDLE_NAME_2")
		public NString RMiddleName2;
		@DbRecordField(dataSourceName="R_MIDDLE_INITIAL_1")
		public NString RMiddleInitial1;
		@DbRecordField(dataSourceName="R_MIDDLE_INITIAL_2")
		public NString RMiddleInitial2;
		@DbRecordField(dataSourceName="R_NAME_SUFFIX")
		public NString RNameSuffix;
		@DbRecordField(dataSourceName="R_FORMER_NAME")
		public NString RFormerName;
		@DbRecordField(dataSourceName="R_COMBINED_NAME")
		public NString RCombinedName;
		@DbRecordField(dataSourceName="R_COMPOSITE_NAME")
		public NString RCompositeName;
		@DbRecordField(dataSourceName="R_AGENCY_NAME")
		public NString RAgencyName;
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
		@DbRecordField(dataSourceName="R_ID_NOTE")
		public NString RIdNote;
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
