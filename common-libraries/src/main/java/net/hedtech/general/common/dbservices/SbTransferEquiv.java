package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbTransferEquiv {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TRANSFER_EQUIV.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pSbgiCode,NString pProgram,NString pTlvlCode,NString pSubjCodeTrns,NString pCrseNumbTrns,NString pTermCodeEffTrns,NNumber pSeqno,NString pGroup,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TRANSFER_EQUIV.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_PROGRAM", pProgram);
			cmd.addParameter("@P_TLVL_CODE", pTlvlCode);
			cmd.addParameter("@P_SUBJ_CODE_TRNS", pSubjCodeTrns);
			cmd.addParameter("@P_CRSE_NUMB_TRNS", pCrseNumbTrns);
			cmd.addParameter("@P_TERM_CODE_EFF_TRNS", pTermCodeEffTrns);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_GROUP", pGroup);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(TransferEquivRecRow recOne,TransferEquivRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TRANSFER_EQUIV.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, TransferEquivRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, TransferEquivRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pSbgiCode,NString pProgram,NString pTlvlCode,NString pSubjCodeTrns,NString pCrseNumbTrns,NString pTermCodeEffTrns,NString pGroup) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TRANSFER_EQUIV.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
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
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TRANSFER_EQUIV.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pSbgiCode,NString pProgram,NString pTlvlCode,NString pSubjCodeTrns,NString pCrseNumbTrns,NString pTermCodeEffTrns,NNumber pSeqno,NString pGroup) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TRANSFER_EQUIV.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_PROGRAM", pProgram);
			cmd.addParameter("@P_TLVL_CODE", pTlvlCode);
			cmd.addParameter("@P_SUBJ_CODE_TRNS", pSubjCodeTrns);
			cmd.addParameter("@P_CRSE_NUMB_TRNS", pCrseNumbTrns);
			cmd.addParameter("@P_TERM_CODE_EFF_TRNS", pTermCodeEffTrns);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_GROUP", pGroup);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pSbgiCode,NString pProgram,NString pTlvlCode,NString pSubjCodeTrns,NString pCrseNumbTrns,NString pTermCodeEffTrns,NNumber pSeqno,NString pGroup,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TRANSFER_EQUIV.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_PROGRAM", pProgram);
			cmd.addParameter("@P_TLVL_CODE", pTlvlCode);
			cmd.addParameter("@P_SUBJ_CODE_TRNS", pSubjCodeTrns);
			cmd.addParameter("@P_CRSE_NUMB_TRNS", pCrseNumbTrns);
			cmd.addParameter("@P_TERM_CODE_EFF_TRNS", pTermCodeEffTrns);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_GROUP", pGroup);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pSbgiCode,NString pProgram,NString pTlvlCode,NString pSubjCodeTrns,NString pCrseNumbTrns,NString pTermCodeEffTrns,NNumber pSeqno,NString pConnector,NString pInstLparenConn,NString pSubjCodeInst,NString pCrseNumbInst,NString pInstTitle,NNumber pInstCreditsUsed,NString pInstRparen,NString pGroup,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TRANSFER_EQUIV.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_PROGRAM", pProgram);
			cmd.addParameter("@P_TLVL_CODE", pTlvlCode);
			cmd.addParameter("@P_SUBJ_CODE_TRNS", pSubjCodeTrns);
			cmd.addParameter("@P_CRSE_NUMB_TRNS", pCrseNumbTrns);
			cmd.addParameter("@P_TERM_CODE_EFF_TRNS", pTermCodeEffTrns);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_CONNECTOR", pConnector);
			cmd.addParameter("@P_INST_LPAREN_CONN", pInstLparenConn);
			cmd.addParameter("@P_SUBJ_CODE_INST", pSubjCodeInst);
			cmd.addParameter("@P_CRSE_NUMB_INST", pCrseNumbInst);
			cmd.addParameter("@P_INST_TITLE", pInstTitle);
			cmd.addParameter("@P_INST_CREDITS_USED", pInstCreditsUsed);
			cmd.addParameter("@P_INST_RPAREN", pInstRparen);
			cmd.addParameter("@P_GROUP", pGroup);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pSbgiCode,NString pProgram,NString pTlvlCode,NString pSubjCodeTrns,NString pCrseNumbTrns,NString pTermCodeEffTrns,NNumber pSeqno,NString pGroup,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TRANSFER_EQUIV.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_PROGRAM", pProgram);
			cmd.addParameter("@P_TLVL_CODE", pTlvlCode);
			cmd.addParameter("@P_SUBJ_CODE_TRNS", pSubjCodeTrns);
			cmd.addParameter("@P_CRSE_NUMB_TRNS", pCrseNumbTrns);
			cmd.addParameter("@P_TERM_CODE_EFF_TRNS", pTermCodeEffTrns);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_GROUP", pGroup);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pSbgiCode,NString pProgram,NString pTlvlCode,NString pSubjCodeTrns,NString pCrseNumbTrns,NString pTermCodeEffTrns,NNumber pSeqno,NString pGroup,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TRANSFER_EQUIV.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_PROGRAM", pProgram);
			cmd.addParameter("@P_TLVL_CODE", pTlvlCode);
			cmd.addParameter("@P_SUBJ_CODE_TRNS", pSubjCodeTrns);
			cmd.addParameter("@P_CRSE_NUMB_TRNS", pCrseNumbTrns);
			cmd.addParameter("@P_TERM_CODE_EFF_TRNS", pTermCodeEffTrns);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_GROUP", pGroup);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pSbgiCode,NString pProgram,NString pTlvlCode,NString pSubjCodeTrns,NString pCrseNumbTrns,NString pTermCodeEffTrns,NNumber pSeqno,NString pConnector,NString pInstLparenConn,NString pSubjCodeInst,NString pCrseNumbInst,NString pInstTitle,NNumber pInstCreditsUsed,NString pInstRparen,NString pGroup,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TRANSFER_EQUIV.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_PROGRAM", pProgram);
			cmd.addParameter("@P_TLVL_CODE", pTlvlCode);
			cmd.addParameter("@P_SUBJ_CODE_TRNS", pSubjCodeTrns);
			cmd.addParameter("@P_CRSE_NUMB_TRNS", pCrseNumbTrns);
			cmd.addParameter("@P_TERM_CODE_EFF_TRNS", pTermCodeEffTrns);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_CONNECTOR", pConnector);
			cmd.addParameter("@P_INST_LPAREN_CONN", pInstLparenConn);
			cmd.addParameter("@P_SUBJ_CODE_INST", pSubjCodeInst);
			cmd.addParameter("@P_CRSE_NUMB_INST", pCrseNumbInst);
			cmd.addParameter("@P_INST_TITLE", pInstTitle);
			cmd.addParameter("@P_INST_CREDITS_USED", pInstCreditsUsed);
			cmd.addParameter("@P_INST_RPAREN", pInstRparen);
			cmd.addParameter("@P_GROUP", pGroup);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="TransferEquivRecRow", dataSourceName="TRANSFER_EQUIV_REC")
	public static class TransferEquivRecRow
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
		@DbRecordField(dataSourceName="R_SEQNO")
		public NNumber RSeqno;
		@DbRecordField(dataSourceName="R_CONNECTOR")
		public NString RConnector;
		@DbRecordField(dataSourceName="R_INST_LPAREN_CONN")
		public NString RInstLparenConn;
		@DbRecordField(dataSourceName="R_SUBJ_CODE_INST")
		public NString RSubjCodeInst;
		@DbRecordField(dataSourceName="R_CRSE_NUMB_INST")
		public NString RCrseNumbInst;
		@DbRecordField(dataSourceName="R_INST_TITLE")
		public NString RInstTitle;
		@DbRecordField(dataSourceName="R_INST_CREDITS_USED")
		public NNumber RInstCreditsUsed;
		@DbRecordField(dataSourceName="R_INST_RPAREN")
		public NString RInstRparen;
		@DbRecordField(dataSourceName="R_GROUP")
		public NString RGroup;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
