package net.hedtech.general.common.dbservices;

import java.util.*;

import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PbACACovUpdtSelectRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_ACA_COV_UPDT_SELECT_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(
				NNumber pOperationType,
				NString pEclsCode,
				NString pYear,
				NDate pOfferDate,
				NDate pRecordDate,
				NString pOfferToSpouseInd,
				NString pOfferToDependentInd,
				NString pUserId,
				NString pBdcaCode,
				NString pBdplCode,
				NString pAcaOfferCoverageCde,
				NString pAca4980HSafeHbrCde,
				NNumber pAcaMlyPremSelfAmt,
				NDate pOfferAcceptanceDate,
				NDate pOfferDeclineDate,
				NString pOfferDeclineReason,
				NString pOfferComments,
				NString pProcessAction,
				NString pBdcaStatusSelection,
				NString pDataOrigin,
				NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_ACA_COV_UPDT_SELECT_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			
			cmd.addParameter("@P_ECLS_CODE",pEclsCode);
			cmd.addParameter("@P_YEAR",pYear)	;
			cmd.addParameter("@P_OFFER_DATE",pOfferDate);
			cmd.addParameter("@P_RECORD_DATE",pRecordDate);
			cmd.addParameter("@P_OFFER_TO_SPOUSE_IND",pOfferToSpouseInd);
			cmd.addParameter("@P_OFFER_TO_DEPENDENT_IND",pOfferToDependentInd);
			cmd.addParameter("@P_USER_ID",pUserId);
			cmd.addParameter("@P_BDCA_CODE",pBdcaCode);
			cmd.addParameter("@P_BDPL_CODE",pBdplCode);
			cmd.addParameter("@P_ACA_OFFER_COVERAGE_CDE",pAcaOfferCoverageCde);
			cmd.addParameter("@P_ACA_4980H_SAFE_HBR_CDE",pAca4980HSafeHbrCde);
			cmd.addParameter("@P_ACA_MLY_PREM_SELF_AMT",pAcaMlyPremSelfAmt);
			cmd.addParameter("@P_OFFER_ACCEPTANCE_DATE",pOfferAcceptanceDate);
			cmd.addParameter("@P_OFFER_DECLINE_DATE",pOfferDeclineDate);
			cmd.addParameter("@P_OFFER_DECLINE_REASON",pOfferDeclineReason);
			cmd.addParameter("@P_OFFER_COMMENTS",pOfferComments);
			cmd.addParameter("@P_PROCESS_ACTION",pProcessAction);
			cmd.addParameter("@P_BDCA_STATUS_SELECTION",pBdcaStatusSelection);
			cmd.addParameter("@P_DATA_ORIGIN",pDataOrigin);	
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(
				NString pEclsCode,
				NString pYear,
				NDate pOfferDate,
				NDate pRecordDate,
				NString pOfferToSpouseInd,
				NString pOfferToDependentInd,
				NString pUserId,
				NString pBdcaCode,
				NString pBdplCode,
				NString pAcaOfferCoverageCde,
				NString pAca4980HSafeHbrCde,
				NNumber pAcaMlyPremSelfAmt,
				NDate pOfferAcceptanceDate,
				NDate pOfferDeclineDate,
				NString pOfferDeclineReason,
				NString pOfferComments,
				NString pProcessAction,
				NString pBdcaStatusSelection,
				NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_ACA_COV_UPDT_SELECT_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ECLS_CODE",pEclsCode);
			cmd.addParameter("@P_YEAR",pYear)	;
			cmd.addParameter("@P_OFFER_DATE",pOfferDate);
			cmd.addParameter("@P_RECORD_DATE",pRecordDate);
			cmd.addParameter("@P_OFFER_TO_SPOUSE_IND",pOfferToSpouseInd);
			cmd.addParameter("@P_OFFER_TO_DEPENDENT_IND",pOfferToDependentInd);
			cmd.addParameter("@P_USER_ID",pUserId);
			cmd.addParameter("@P_BDCA_CODE",pBdcaCode);
			cmd.addParameter("@P_BDPL_CODE",pBdplCode);
			cmd.addParameter("@P_ACA_OFFER_COVERAGE_CDE",pAcaOfferCoverageCde);
			cmd.addParameter("@P_ACA_4980H_SAFE_HBR_CDE",pAca4980HSafeHbrCde);
			cmd.addParameter("@P_ACA_MLY_PREM_SELF_AMT",pAcaMlyPremSelfAmt);
			cmd.addParameter("@P_OFFER_ACCEPTANCE_DATE",pOfferAcceptanceDate);
			cmd.addParameter("@P_OFFER_DECLINE_DATE",pOfferDeclineDate);
			cmd.addParameter("@P_OFFER_DECLINE_REASON",pOfferDeclineReason);
			cmd.addParameter("@P_OFFER_COMMENTS",pOfferComments);
			cmd.addParameter("@P_PROCESS_ACTION",pProcessAction);
			cmd.addParameter("@P_BDCA_STATUS_SELECTION",pBdcaStatusSelection);
			cmd.addParameter("@P_DATA_ORIGIN",pDataOrigin);	
				
			cmd.execute();


		}
	
	
}
