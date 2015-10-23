package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbTransferEquivRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TRANSFER_EQUIV_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pSbgiCode,NString pProgram,NString pTlvlCode,NString pSubjCodeTrns,NString pCrseNumbTrns,NString pTermCodeEffTrns,NNumber pSeqno,NString pConnector,NString pInstLparenConn,NString pSubjCodeInst,NString pCrseNumbInst,NString pInstTitle,NNumber pInstCreditsUsed,NString pInstRparen,NString pGroup,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TRANSFER_EQUIV_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
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
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pSbgiCode,NString pProgram,NString pTlvlCode,NString pSubjCodeTrns,NString pCrseNumbTrns,NString pTermCodeEffTrns,NNumber pSeqno,NString pConnector,NString pInstLparenConn,NString pSubjCodeInst,NString pCrseNumbInst,NString pInstTitle,NNumber pInstCreditsUsed,NString pInstRparen,NString pGroup) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TRANSFER_EQUIV_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
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
				
			cmd.execute();


		}
		
	
	
	
}
