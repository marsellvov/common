package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbTransferCrse {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TRANSFER_CRSE.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pSbgiCode,NString pProgram,NString pTlvlCode,NString pSubjCodeTrns,NString pCrseNumbTrns,NString pTermCodeEffTrns,NString pGroup,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TRANSFER_CRSE.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_PROGRAM", pProgram);
			cmd.addParameter("@P_TLVL_CODE", pTlvlCode);
			cmd.addParameter("@P_SUBJ_CODE_TRNS", pSubjCodeTrns);
			cmd.addParameter("@P_CRSE_NUMB_TRNS", pCrseNumbTrns);
			cmd.addParameter("@P_TERM_CODE_EFF_TRNS", pTermCodeEffTrns);
			cmd.addParameter("@P_GROUP", pGroup);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(TransferCrseRecRow recOne,TransferCrseRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TRANSFER_CRSE.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, TransferCrseRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, TransferCrseRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fPartialMatch(NString pSbgiCode,NString pTlvlCode,NString pSubjCodeTrns,NString pCrseNumbTrns) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TRANSFER_CRSE.F_PARTIAL_MATCH", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_TLVL_CODE", pTlvlCode);
			cmd.addParameter("@P_SUBJ_CODE_TRNS", pSubjCodeTrns);
			cmd.addParameter("@P_CRSE_NUMB_TRNS", pCrseNumbTrns);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fPartialMatchTerm(NString pSbgiCode,NString pTlvlCode,NString pSubjCodeTrns,NString pCrseNumbTrns,NString pTermCodeEffTrns) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TRANSFER_CRSE.F_PARTIAL_MATCH_TERM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_TLVL_CODE", pTlvlCode);
			cmd.addParameter("@P_SUBJ_CODE_TRNS", pSubjCodeTrns);
			cmd.addParameter("@P_CRSE_NUMB_TRNS", pCrseNumbTrns);
			cmd.addParameter("@P_TERM_CODE_EFF_TRNS", pTermCodeEffTrns);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pSbgiCode,NString pProgram) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TRANSFER_CRSE.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_PROGRAM", pProgram);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TRANSFER_CRSE.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pSbgiCode,NString pProgram,NString pTlvlCode,NString pSubjCodeTrns,NString pCrseNumbTrns,NString pTermCodeEffTrns,NString pGroup) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TRANSFER_CRSE.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_PROGRAM", pProgram);
			cmd.addParameter("@P_TLVL_CODE", pTlvlCode);
			cmd.addParameter("@P_SUBJ_CODE_TRNS", pSubjCodeTrns);
			cmd.addParameter("@P_CRSE_NUMB_TRNS", pCrseNumbTrns);
			cmd.addParameter("@P_TERM_CODE_EFF_TRNS", pTermCodeEffTrns);
			cmd.addParameter("@P_GROUP", pGroup);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pSbgiCode,NString pProgram,NString pTlvlCode,NString pSubjCodeTrns,NString pCrseNumbTrns,NString pTermCodeEffTrns,NString pGroup,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TRANSFER_CRSE.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_PROGRAM", pProgram);
			cmd.addParameter("@P_TLVL_CODE", pTlvlCode);
			cmd.addParameter("@P_SUBJ_CODE_TRNS", pSubjCodeTrns);
			cmd.addParameter("@P_CRSE_NUMB_TRNS", pCrseNumbTrns);
			cmd.addParameter("@P_TERM_CODE_EFF_TRNS", pTermCodeEffTrns);
			cmd.addParameter("@P_GROUP", pGroup);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryPartial(NString pSbgiCode,NString pTlvlCode,NString pSubjCodeTrns,NString pCrseNumbTrns,NString pTermCodeEffTrns) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TRANSFER_CRSE.F_QUERY_PARTIAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_TLVL_CODE", pTlvlCode);
			cmd.addParameter("@P_SUBJ_CODE_TRNS", pSubjCodeTrns);
			cmd.addParameter("@P_CRSE_NUMB_TRNS", pCrseNumbTrns);
			cmd.addParameter("@P_TERM_CODE_EFF_TRNS", pTermCodeEffTrns);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pSbgiCode,NString pProgram,NString pTlvlCode,NString pSubjCodeTrns,NString pCrseNumbTrns,NString pTermCodeEffTrns,NString pTrnsTitle,NNumber pTrnsLowHrs,NNumber pTrnsHighHrs,NString pTrnsReviewInd,NString pTastCode,NString pTrnsCatalog,NString pTgrdCodeMin,NString pGroup,NString pGroupPrimaryInd,NString pProtectInd,NString pCrseDesc,NString pUserId,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TRANSFER_CRSE.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_PROGRAM", pProgram);
			cmd.addParameter("@P_TLVL_CODE", pTlvlCode);
			cmd.addParameter("@P_SUBJ_CODE_TRNS", pSubjCodeTrns);
			cmd.addParameter("@P_CRSE_NUMB_TRNS", pCrseNumbTrns);
			cmd.addParameter("@P_TERM_CODE_EFF_TRNS", pTermCodeEffTrns);
			cmd.addParameter("@P_TRNS_TITLE", pTrnsTitle);
			cmd.addParameter("@P_TRNS_LOW_HRS", pTrnsLowHrs);
			cmd.addParameter("@P_TRNS_HIGH_HRS", pTrnsHighHrs);
			cmd.addParameter("@P_TRNS_REVIEW_IND", pTrnsReviewInd);
			cmd.addParameter("@P_TAST_CODE", pTastCode);
			cmd.addParameter("@P_TRNS_CATALOG", pTrnsCatalog);
			cmd.addParameter("@P_TGRD_CODE_MIN", pTgrdCodeMin);
			cmd.addParameter("@P_GROUP", pGroup);
			cmd.addParameter("@P_GROUP_PRIMARY_IND", pGroupPrimaryInd);
			cmd.addParameter("@P_PROTECT_IND", pProtectInd);
			cmd.addParameter("@P_CRSE_DESC", pCrseDesc);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDefaultCopy(NString pSbgiCodeDef,NString pSbgiCode,NString pProgram,NString pCopyComments,NString pCountOnly,Ref<NNumber> pCountOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TRANSFER_CRSE.P_DEFAULT_COPY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SBGI_CODE_DEF", pSbgiCodeDef);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_PROGRAM", pProgram);
			cmd.addParameter("@P_COPY_COMMENTS", pCopyComments);
			cmd.addParameter("@P_COUNT_ONLY", pCountOnly);
			cmd.addParameter("@P_COUNT_OUT", NNumber.class);
				
			cmd.execute();
			pCountOut.val = cmd.getParameterValue("@P_COUNT_OUT", NNumber.class);


		}
		
		public static void pDefaultCopyEquiv(NString pSbgiCodeDef,NString pSbgiCode,NString pProgram,NString pCopyComments) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TRANSFER_CRSE.P_DEFAULT_COPY_EQUIV", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SBGI_CODE_DEF", pSbgiCodeDef);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_PROGRAM", pProgram);
			cmd.addParameter("@P_COPY_COMMENTS", pCopyComments);
				
			cmd.execute();


		}
		
		public static void pDelete(NString pSbgiCode,NString pProgram,NString pTlvlCode,NString pSubjCodeTrns,NString pCrseNumbTrns,NString pTermCodeEffTrns,NString pGroup,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TRANSFER_CRSE.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_PROGRAM", pProgram);
			cmd.addParameter("@P_TLVL_CODE", pTlvlCode);
			cmd.addParameter("@P_SUBJ_CODE_TRNS", pSubjCodeTrns);
			cmd.addParameter("@P_CRSE_NUMB_TRNS", pCrseNumbTrns);
			cmd.addParameter("@P_TERM_CODE_EFF_TRNS", pTermCodeEffTrns);
			cmd.addParameter("@P_GROUP", pGroup);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pSbgiCode,NString pProgram,NString pTlvlCode,NString pSubjCodeTrns,NString pCrseNumbTrns,NString pTermCodeEffTrns,NString pGroup,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TRANSFER_CRSE.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_PROGRAM", pProgram);
			cmd.addParameter("@P_TLVL_CODE", pTlvlCode);
			cmd.addParameter("@P_SUBJ_CODE_TRNS", pSubjCodeTrns);
			cmd.addParameter("@P_CRSE_NUMB_TRNS", pCrseNumbTrns);
			cmd.addParameter("@P_TERM_CODE_EFF_TRNS", pTermCodeEffTrns);
			cmd.addParameter("@P_GROUP", pGroup);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pSbgiCode,NString pProgram,NString pTlvlCode,NString pSubjCodeTrns,NString pCrseNumbTrns,NString pTermCodeEffTrns,NString pTrnsTitle,NNumber pTrnsLowHrs,NNumber pTrnsHighHrs,NString pTrnsReviewInd,NString pTastCode,NString pTrnsCatalog,NString pTgrdCodeMin,NString pGroup,NString pGroupPrimaryInd,NString pProtectInd,NString pCrseDesc,NString pUserId,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TRANSFER_CRSE.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_PROGRAM", pProgram);
			cmd.addParameter("@P_TLVL_CODE", pTlvlCode);
			cmd.addParameter("@P_SUBJ_CODE_TRNS", pSubjCodeTrns);
			cmd.addParameter("@P_CRSE_NUMB_TRNS", pCrseNumbTrns);
			cmd.addParameter("@P_TERM_CODE_EFF_TRNS", pTermCodeEffTrns);
			cmd.addParameter("@P_TRNS_TITLE", pTrnsTitle);
			cmd.addParameter("@P_TRNS_LOW_HRS", pTrnsLowHrs);
			cmd.addParameter("@P_TRNS_HIGH_HRS", pTrnsHighHrs);
			cmd.addParameter("@P_TRNS_REVIEW_IND", pTrnsReviewInd);
			cmd.addParameter("@P_TAST_CODE", pTastCode);
			cmd.addParameter("@P_TRNS_CATALOG", pTrnsCatalog);
			cmd.addParameter("@P_TGRD_CODE_MIN", pTgrdCodeMin);
			cmd.addParameter("@P_GROUP", pGroup);
			cmd.addParameter("@P_GROUP_PRIMARY_IND", pGroupPrimaryInd);
			cmd.addParameter("@P_PROTECT_IND", pProtectInd);
			cmd.addParameter("@P_CRSE_DESC", pCrseDesc);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="TransferCrseRecRow", dataSourceName="TRANSFER_CRSE_REC")
	public static class TransferCrseRecRow
	{
		@DbRecordField(dataSourceName="R_SBGI_CODE")
		public NString RSbgiCode;
		@DbRecordField(dataSourceName="R_PROGRAM")
		public NString RProgram;
		@DbRecordField(dataSourceName="R_TLVL_CODE")
		public NString RTlvlCode;
		@DbRecordField(dataSourceName="R_SUBJ_CODE_TRNS")
		public NString RSubjCodeTrns;
		@DbRecordField(dataSourceName="R_CRSE_NUMB_TRNS")
		public NString RCrseNumbTrns;
		@DbRecordField(dataSourceName="R_TERM_CODE_EFF_TRNS")
		public NString RTermCodeEffTrns;
		@DbRecordField(dataSourceName="R_TRNS_TITLE")
		public NString RTrnsTitle;
		@DbRecordField(dataSourceName="R_TRNS_LOW_HRS")
		public NNumber RTrnsLowHrs;
		@DbRecordField(dataSourceName="R_TRNS_HIGH_HRS")
		public NNumber RTrnsHighHrs;
		@DbRecordField(dataSourceName="R_TRNS_REVIEW_IND")
		public NString RTrnsReviewInd;
		@DbRecordField(dataSourceName="R_TAST_CODE")
		public NString RTastCode;
		@DbRecordField(dataSourceName="R_TRNS_CATALOG")
		public NString RTrnsCatalog;
		@DbRecordField(dataSourceName="R_TGRD_CODE_MIN")
		public NString RTgrdCodeMin;
		@DbRecordField(dataSourceName="R_GROUP")
		public NString RGroup;
		@DbRecordField(dataSourceName="R_GROUP_PRIMARY_IND")
		public NString RGroupPrimaryInd;
		@DbRecordField(dataSourceName="R_PROTECT_IND")
		public NString RProtectInd;
		@DbRecordField(dataSourceName="R_CRSE_DESC")
		public NString RCrseDesc;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
