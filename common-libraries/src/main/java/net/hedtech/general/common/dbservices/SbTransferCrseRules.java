package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbTransferCrseRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TRANSFER_CRSE_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pSbgiCode,NString pProgram,NString pTlvlCode,NString pSubjCodeTrns,NString pCrseNumbTrns,NString pTermCodeEffTrns,NString pTrnsTitle,NNumber pTrnsLowHrs,NNumber pTrnsHighHrs,NString pTrnsReviewInd,NString pTastCode,NString pTrnsCatalog,NString pTgrdCodeMin,NString pGroup,NString pGroupPrimaryInd,NString pProtectInd,NString pCrseDesc,NString pUserId,NString pDataOrigin,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TRANSFER_CRSE_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
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
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pSbgiCode,NString pProgram,NString pTlvlCode,NString pSubjCodeTrns,NString pCrseNumbTrns,NString pTermCodeEffTrns,NString pTrnsTitle,NNumber pTrnsLowHrs,NNumber pTrnsHighHrs,NString pTrnsReviewInd,NString pTastCode,NString pTrnsCatalog,NString pTgrdCodeMin,NString pGroup,NString pGroupPrimaryInd,NString pProtectInd,NString pCrseDesc,NString pUserId,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TRANSFER_CRSE_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
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
				
			cmd.execute();


		}
		
	
	
	
}
