package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RbRequirementRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_REQUIREMENT_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pAidyCode,NNumber pPidm,NString pTreqCode,NString pTreqDesc,NString pSatInd,NDate pStatDate,NDate pEstDate,NString pTrstCode,NString pPckgInd,NString pDisbInd,NString pFundCode,NString pSysInd,NString pSbgiCode,NString pMemoInd,NString pUserId,NDate pPerkMpnExpDate,NDate pSatisfiedDate,NDate pMpnFirstDisbDate,NDate pMpnSignedDate,NString pTrkLtrInd,NString pDataOrigin,NString pInfoAccessInd,NString pTermCode,NString pSbgiTypeInd,NString pPeriod,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_REQUIREMENT_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TREQ_CODE", pTreqCode);
			cmd.addParameter("@P_TREQ_DESC", pTreqDesc);
			cmd.addParameter("@P_SAT_IND", pSatInd);
			cmd.addParameter("@P_STAT_DATE", pStatDate);
			cmd.addParameter("@P_EST_DATE", pEstDate);
			cmd.addParameter("@P_TRST_CODE", pTrstCode);
			cmd.addParameter("@P_PCKG_IND", pPckgInd);
			cmd.addParameter("@P_DISB_IND", pDisbInd);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_SYS_IND", pSysInd);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_MEMO_IND", pMemoInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_PERK_MPN_EXP_DATE", pPerkMpnExpDate);
			cmd.addParameter("@P_SATISFIED_DATE", pSatisfiedDate);
			cmd.addParameter("@P_MPN_FIRST_DISB_DATE", pMpnFirstDisbDate);
			cmd.addParameter("@P_MPN_SIGNED_DATE", pMpnSignedDate);
			cmd.addParameter("@P_TRK_LTR_IND", pTrkLtrInd);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INFO_ACCESS_IND", pInfoAccessInd);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_SBGI_TYPE_IND", pSbgiTypeInd);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pAidyCode,NNumber pPidm,NString pTreqCode,NString pTreqDesc,NString pSatInd,NDate pStatDate,NDate pEstDate,NString pTrstCode,NString pPckgInd,NString pDisbInd,NString pFundCode,NString pSysInd,NString pSbgiCode,NString pMemoInd,NString pUserId,NDate pPerkMpnExpDate,NDate pSatisfiedDate,NDate pMpnFirstDisbDate,NDate pMpnSignedDate,NString pTrkLtrInd,NString pDataOrigin,NString pInfoAccessInd,NString pTermCode,NString pSbgiTypeInd,NString pPeriod) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_REQUIREMENT_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TREQ_CODE", pTreqCode);
			cmd.addParameter("@P_TREQ_DESC", pTreqDesc);
			cmd.addParameter("@P_SAT_IND", pSatInd);
			cmd.addParameter("@P_STAT_DATE", pStatDate);
			cmd.addParameter("@P_EST_DATE", pEstDate);
			cmd.addParameter("@P_TRST_CODE", pTrstCode);
			cmd.addParameter("@P_PCKG_IND", pPckgInd);
			cmd.addParameter("@P_DISB_IND", pDisbInd);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_SYS_IND", pSysInd);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_MEMO_IND", pMemoInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_PERK_MPN_EXP_DATE", pPerkMpnExpDate);
			cmd.addParameter("@P_SATISFIED_DATE", pSatisfiedDate);
			cmd.addParameter("@P_MPN_FIRST_DISB_DATE", pMpnFirstDisbDate);
			cmd.addParameter("@P_MPN_SIGNED_DATE", pMpnSignedDate);
			cmd.addParameter("@P_TRK_LTR_IND", pTrkLtrInd);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INFO_ACCESS_IND", pInfoAccessInd);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_SBGI_TYPE_IND", pSbgiTypeInd);
			cmd.addParameter("@P_PERIOD", pPeriod);
				
			cmd.execute();


		}
		
	
	
	
}
