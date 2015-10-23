package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbTransferEquivCmt {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TRANSFER_EQUIV_CMT.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pSbgiCode,NString pProgram,NString pTlvlCode,NString pSubjCodeTrns,NString pCrseNumbTrns,NString pTermCodeEff,NString pSubjCodeInst,NString pCrseNumbInst,NNumber pShrtatcSeqno,NNumber pSeqno,NString pGroup,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TRANSFER_EQUIV_CMT.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_PROGRAM", pProgram);
			cmd.addParameter("@P_TLVL_CODE", pTlvlCode);
			cmd.addParameter("@P_SUBJ_CODE_TRNS", pSubjCodeTrns);
			cmd.addParameter("@P_CRSE_NUMB_TRNS", pCrseNumbTrns);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_SUBJ_CODE_INST", pSubjCodeInst);
			cmd.addParameter("@P_CRSE_NUMB_INST", pCrseNumbInst);
			cmd.addParameter("@P_SHRTATC_SEQNO", pShrtatcSeqno);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_GROUP", pGroup);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(TransferEquivCmtRecRow recOne,TransferEquivCmtRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TRANSFER_EQUIV_CMT.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, TransferEquivCmtRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, TransferEquivCmtRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pSbgiCode,NString pProgram,NString pTlvlCode,NString pSubjCodeTrns,NString pCrseNumbTrns,NString pTermCodeEff,NNumber pShrtatcSeqno,NString pGroup) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TRANSFER_EQUIV_CMT.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_PROGRAM", pProgram);
			cmd.addParameter("@P_TLVL_CODE", pTlvlCode);
			cmd.addParameter("@P_SUBJ_CODE_TRNS", pSubjCodeTrns);
			cmd.addParameter("@P_CRSE_NUMB_TRNS", pCrseNumbTrns);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_SHRTATC_SEQNO", pShrtatcSeqno);
			cmd.addParameter("@P_GROUP", pGroup);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TRANSFER_EQUIV_CMT.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pSbgiCode,NString pProgram,NString pTlvlCode,NString pSubjCodeTrns,NString pCrseNumbTrns,NString pTermCodeEff,NString pSubjCodeInst,NString pCrseNumbInst,NNumber pShrtatcSeqno,NNumber pSeqno,NString pGroup) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TRANSFER_EQUIV_CMT.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_PROGRAM", pProgram);
			cmd.addParameter("@P_TLVL_CODE", pTlvlCode);
			cmd.addParameter("@P_SUBJ_CODE_TRNS", pSubjCodeTrns);
			cmd.addParameter("@P_CRSE_NUMB_TRNS", pCrseNumbTrns);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_SUBJ_CODE_INST", pSubjCodeInst);
			cmd.addParameter("@P_CRSE_NUMB_INST", pCrseNumbInst);
			cmd.addParameter("@P_SHRTATC_SEQNO", pShrtatcSeqno);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_GROUP", pGroup);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pSbgiCode,NString pProgram,NString pTlvlCode,NString pSubjCodeTrns,NString pCrseNumbTrns,NString pTermCodeEff,NString pSubjCodeInst,NString pCrseNumbInst,NNumber pShrtatcSeqno,NNumber pSeqno,NString pGroup,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TRANSFER_EQUIV_CMT.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_PROGRAM", pProgram);
			cmd.addParameter("@P_TLVL_CODE", pTlvlCode);
			cmd.addParameter("@P_SUBJ_CODE_TRNS", pSubjCodeTrns);
			cmd.addParameter("@P_CRSE_NUMB_TRNS", pCrseNumbTrns);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_SUBJ_CODE_INST", pSubjCodeInst);
			cmd.addParameter("@P_CRSE_NUMB_INST", pCrseNumbInst);
			cmd.addParameter("@P_SHRTATC_SEQNO", pShrtatcSeqno);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_GROUP", pGroup);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pSbgiCode,NString pProgram,NString pTlvlCode,NString pSubjCodeTrns,NString pCrseNumbTrns,NString pTermCodeEff,NString pSubjCodeInst,NString pCrseNumbInst,NNumber pShrtatcSeqno,NNumber pSeqno,NString pText,NString pGroup,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TRANSFER_EQUIV_CMT.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_PROGRAM", pProgram);
			cmd.addParameter("@P_TLVL_CODE", pTlvlCode);
			cmd.addParameter("@P_SUBJ_CODE_TRNS", pSubjCodeTrns);
			cmd.addParameter("@P_CRSE_NUMB_TRNS", pCrseNumbTrns);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_SUBJ_CODE_INST", pSubjCodeInst);
			cmd.addParameter("@P_CRSE_NUMB_INST", pCrseNumbInst);
			cmd.addParameter("@P_SHRTATC_SEQNO", pShrtatcSeqno);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_TEXT", pText);
			cmd.addParameter("@P_GROUP", pGroup);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pSbgiCode,NString pProgram,NString pTlvlCode,NString pSubjCodeTrns,NString pCrseNumbTrns,NString pTermCodeEff,NString pSubjCodeInst,NString pCrseNumbInst,NNumber pShrtatcSeqno,NNumber pSeqno,NString pGroup,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TRANSFER_EQUIV_CMT.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_PROGRAM", pProgram);
			cmd.addParameter("@P_TLVL_CODE", pTlvlCode);
			cmd.addParameter("@P_SUBJ_CODE_TRNS", pSubjCodeTrns);
			cmd.addParameter("@P_CRSE_NUMB_TRNS", pCrseNumbTrns);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_SUBJ_CODE_INST", pSubjCodeInst);
			cmd.addParameter("@P_CRSE_NUMB_INST", pCrseNumbInst);
			cmd.addParameter("@P_SHRTATC_SEQNO", pShrtatcSeqno);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_GROUP", pGroup);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pSbgiCode,NString pProgram,NString pTlvlCode,NString pSubjCodeTrns,NString pCrseNumbTrns,NString pTermCodeEff,NString pSubjCodeInst,NString pCrseNumbInst,NNumber pShrtatcSeqno,NNumber pSeqno,NString pGroup,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TRANSFER_EQUIV_CMT.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_PROGRAM", pProgram);
			cmd.addParameter("@P_TLVL_CODE", pTlvlCode);
			cmd.addParameter("@P_SUBJ_CODE_TRNS", pSubjCodeTrns);
			cmd.addParameter("@P_CRSE_NUMB_TRNS", pCrseNumbTrns);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_SUBJ_CODE_INST", pSubjCodeInst);
			cmd.addParameter("@P_CRSE_NUMB_INST", pCrseNumbInst);
			cmd.addParameter("@P_SHRTATC_SEQNO", pShrtatcSeqno);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_GROUP", pGroup);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pSbgiCode,NString pProgram,NString pTlvlCode,NString pSubjCodeTrns,NString pCrseNumbTrns,NString pTermCodeEff,NString pSubjCodeInst,NString pCrseNumbInst,NNumber pShrtatcSeqno,NNumber pSeqno,NString pText,NString pGroup,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TRANSFER_EQUIV_CMT.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_PROGRAM", pProgram);
			cmd.addParameter("@P_TLVL_CODE", pTlvlCode);
			cmd.addParameter("@P_SUBJ_CODE_TRNS", pSubjCodeTrns);
			cmd.addParameter("@P_CRSE_NUMB_TRNS", pCrseNumbTrns);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_SUBJ_CODE_INST", pSubjCodeInst);
			cmd.addParameter("@P_CRSE_NUMB_INST", pCrseNumbInst);
			cmd.addParameter("@P_SHRTATC_SEQNO", pShrtatcSeqno);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_TEXT", pText);
			cmd.addParameter("@P_GROUP", pGroup);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="TransferEquivCmtRecRow", dataSourceName="TRANSFER_EQUIV_CMT_REC")
	public static class TransferEquivCmtRecRow
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
		@DbRecordField(dataSourceName="R_TERM_CODE_EFF")
		public NString RTermCodeEff;
		@DbRecordField(dataSourceName="R_SUBJ_CODE_INST")
		public NString RSubjCodeInst;
		@DbRecordField(dataSourceName="R_CRSE_NUMB_INST")
		public NString RCrseNumbInst;
		@DbRecordField(dataSourceName="R_SHRTATC_SEQNO")
		public NNumber RShrtatcSeqno;
		@DbRecordField(dataSourceName="R_SEQNO")
		public NNumber RSeqno;
		@DbRecordField(dataSourceName="R_TEXT")
		public NString RText;
		@DbRecordField(dataSourceName="R_GROUP")
		public NString RGroup;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
