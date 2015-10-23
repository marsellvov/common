package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class AbAdvOrganizationRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AB_ADV_ORGANIZATION_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pPidm,NString pEin,NString pBusiness,NString pSiccCode,NNumber pMatchPct,NNumber pMatchOrgMax,NNumber pMatchPersonMax,NString pAtypCode,NString pJobcCode,NString pTitleContact,NString pLastNameContact,NString pFirstNameContact,NString pMiContact,NNumber pMgPidm,NNumber pEmplCnt,NNumber pEmplPtProf,NNumber pEmplFtProf,NNumber pTotRevenue,NNumber pTotAssets,NNumber pTotEarnings,NNumber pPreTaxProfit,NNumber pGrantLow,NNumber pGrantHigh,NString pPropDeadlineMm,NString pPropDeadlineDd,NNumber pYearInc,NString pBegFyMm,NString pBegFyDd,NString pEndFyMm,NString pEndFyDd,NString pOthEdMgInd,NString pStateAssocMgInd,NString pDesgMgInd,NString pMdisCode,NString pMdisMm,NString pMdisDd,NString pMdisDeadlineMm,NString pMdisDeadlineDd,NString pDuplMgInd,NString pMgAckInd,NString pMgmtMgInd,NNumber pMatchPersInstYr,NNumber pMatchOrgCeilingYr,NNumber pMatchOrgEmplYr,NNumber pMatchMinimum,NString pSocietyName,NNumber pYearMg,NDate pFinancialsDate,NDate pMgLoadUpdateDate,NString pMgLoadSource,NString pMgReceiptInd,NNumber pMatchMaximum,NString pPrefixContact,NString pSuffixContact,NString pMgLoadId,NString pDataOrigin,NString pUserId,NString pSurnamePrefixContact,NString pPrefAtypCode,NNumber pPrefAtypSeqno,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AB_ADV_ORGANIZATION_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_EIN", pEin);
			cmd.addParameter("@P_BUSINESS", pBusiness);
			cmd.addParameter("@P_SICC_CODE", pSiccCode);
			cmd.addParameter("@P_MATCH_PCT", pMatchPct);
			cmd.addParameter("@P_MATCH_ORG_MAX", pMatchOrgMax);
			cmd.addParameter("@P_MATCH_PERSON_MAX", pMatchPersonMax);
			cmd.addParameter("@P_ATYP_CODE", pAtypCode);
			cmd.addParameter("@P_JOBC_CODE", pJobcCode);
			cmd.addParameter("@P_TITLE_CONTACT", pTitleContact);
			cmd.addParameter("@P_LAST_NAME_CONTACT", pLastNameContact);
			cmd.addParameter("@P_FIRST_NAME_CONTACT", pFirstNameContact);
			cmd.addParameter("@P_MI_CONTACT", pMiContact);
			cmd.addParameter("@P_MG_PIDM", pMgPidm);
			cmd.addParameter("@P_EMPL_CNT", pEmplCnt);
			cmd.addParameter("@P_EMPL_PT_PROF", pEmplPtProf);
			cmd.addParameter("@P_EMPL_FT_PROF", pEmplFtProf);
			cmd.addParameter("@P_TOT_REVENUE", pTotRevenue);
			cmd.addParameter("@P_TOT_ASSETS", pTotAssets);
			cmd.addParameter("@P_TOT_EARNINGS", pTotEarnings);
			cmd.addParameter("@P_PRE_TAX_PROFIT", pPreTaxProfit);
			cmd.addParameter("@P_GRANT_LOW", pGrantLow);
			cmd.addParameter("@P_GRANT_HIGH", pGrantHigh);
			cmd.addParameter("@P_PROP_DEADLINE_MM", pPropDeadlineMm);
			cmd.addParameter("@P_PROP_DEADLINE_DD", pPropDeadlineDd);
			cmd.addParameter("@P_YEAR_INC", pYearInc);
			cmd.addParameter("@P_BEG_FY_MM", pBegFyMm);
			cmd.addParameter("@P_BEG_FY_DD", pBegFyDd);
			cmd.addParameter("@P_END_FY_MM", pEndFyMm);
			cmd.addParameter("@P_END_FY_DD", pEndFyDd);
			cmd.addParameter("@P_OTH_ED_MG_IND", pOthEdMgInd);
			cmd.addParameter("@P_STATE_ASSOC_MG_IND", pStateAssocMgInd);
			cmd.addParameter("@P_DESG_MG_IND", pDesgMgInd);
			cmd.addParameter("@P_MDIS_CODE", pMdisCode);
			cmd.addParameter("@P_MDIS_MM", pMdisMm);
			cmd.addParameter("@P_MDIS_DD", pMdisDd);
			cmd.addParameter("@P_MDIS_DEADLINE_MM", pMdisDeadlineMm);
			cmd.addParameter("@P_MDIS_DEADLINE_DD", pMdisDeadlineDd);
			cmd.addParameter("@P_DUPL_MG_IND", pDuplMgInd);
			cmd.addParameter("@P_MG_ACK_IND", pMgAckInd);
			cmd.addParameter("@P_MGMT_MG_IND", pMgmtMgInd);
			cmd.addParameter("@P_MATCH_PERS_INST_YR", pMatchPersInstYr);
			cmd.addParameter("@P_MATCH_ORG_CEILING_YR", pMatchOrgCeilingYr);
			cmd.addParameter("@P_MATCH_ORG_EMPL_YR", pMatchOrgEmplYr);
			cmd.addParameter("@P_MATCH_MINIMUM", pMatchMinimum);
			cmd.addParameter("@P_SOCIETY_NAME", pSocietyName);
			cmd.addParameter("@P_YEAR_MG", pYearMg);
			cmd.addParameter("@P_FINANCIALS_DATE", pFinancialsDate);
			cmd.addParameter("@P_MG_LOAD_UPDATE_DATE", pMgLoadUpdateDate);
			cmd.addParameter("@P_MG_LOAD_SOURCE", pMgLoadSource);
			cmd.addParameter("@P_MG_RECEIPT_IND", pMgReceiptInd);
			cmd.addParameter("@P_MATCH_MAXIMUM", pMatchMaximum);
			cmd.addParameter("@P_PREFIX_CONTACT", pPrefixContact);
			cmd.addParameter("@P_SUFFIX_CONTACT", pSuffixContact);
			cmd.addParameter("@P_MG_LOAD_ID", pMgLoadId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_SURNAME_PREFIX_CONTACT", pSurnamePrefixContact);
			cmd.addParameter("@P_PREF_ATYP_CODE", pPrefAtypCode);
			cmd.addParameter("@P_PREF_ATYP_SEQNO", pPrefAtypSeqno);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pPidm,NString pEin,NString pBusiness,NString pSiccCode,NNumber pMatchPct,NNumber pMatchOrgMax,NNumber pMatchPersonMax,NString pAtypCode,NString pJobcCode,NString pTitleContact,NString pLastNameContact,NString pFirstNameContact,NString pMiContact,NNumber pMgPidm,NNumber pEmplCnt,NNumber pEmplPtProf,NNumber pEmplFtProf,NNumber pTotRevenue,NNumber pTotAssets,NNumber pTotEarnings,NNumber pPreTaxProfit,NNumber pGrantLow,NNumber pGrantHigh,NString pPropDeadlineMm,NString pPropDeadlineDd,NNumber pYearInc,NString pBegFyMm,NString pBegFyDd,NString pEndFyMm,NString pEndFyDd,NString pOthEdMgInd,NString pStateAssocMgInd,NString pDesgMgInd,NString pMdisCode,NString pMdisMm,NString pMdisDd,NString pMdisDeadlineMm,NString pMdisDeadlineDd,NString pDuplMgInd,NString pMgAckInd,NString pMgmtMgInd,NNumber pMatchPersInstYr,NNumber pMatchOrgCeilingYr,NNumber pMatchOrgEmplYr,NNumber pMatchMinimum,NString pSocietyName,NNumber pYearMg,NDate pFinancialsDate,NDate pMgLoadUpdateDate,NString pMgLoadSource,NString pMgReceiptInd,NNumber pMatchMaximum,NString pPrefixContact,NString pSuffixContact,NString pMgLoadId,NString pDataOrigin,NString pUserId,NString pSurnamePrefixContact,NString pPrefAtypCode,NNumber pPrefAtypSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AB_ADV_ORGANIZATION_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_EIN", pEin);
			cmd.addParameter("@P_BUSINESS", pBusiness);
			cmd.addParameter("@P_SICC_CODE", pSiccCode);
			cmd.addParameter("@P_MATCH_PCT", pMatchPct);
			cmd.addParameter("@P_MATCH_ORG_MAX", pMatchOrgMax);
			cmd.addParameter("@P_MATCH_PERSON_MAX", pMatchPersonMax);
			cmd.addParameter("@P_ATYP_CODE", pAtypCode);
			cmd.addParameter("@P_JOBC_CODE", pJobcCode);
			cmd.addParameter("@P_TITLE_CONTACT", pTitleContact);
			cmd.addParameter("@P_LAST_NAME_CONTACT", pLastNameContact);
			cmd.addParameter("@P_FIRST_NAME_CONTACT", pFirstNameContact);
			cmd.addParameter("@P_MI_CONTACT", pMiContact);
			cmd.addParameter("@P_MG_PIDM", pMgPidm);
			cmd.addParameter("@P_EMPL_CNT", pEmplCnt);
			cmd.addParameter("@P_EMPL_PT_PROF", pEmplPtProf);
			cmd.addParameter("@P_EMPL_FT_PROF", pEmplFtProf);
			cmd.addParameter("@P_TOT_REVENUE", pTotRevenue);
			cmd.addParameter("@P_TOT_ASSETS", pTotAssets);
			cmd.addParameter("@P_TOT_EARNINGS", pTotEarnings);
			cmd.addParameter("@P_PRE_TAX_PROFIT", pPreTaxProfit);
			cmd.addParameter("@P_GRANT_LOW", pGrantLow);
			cmd.addParameter("@P_GRANT_HIGH", pGrantHigh);
			cmd.addParameter("@P_PROP_DEADLINE_MM", pPropDeadlineMm);
			cmd.addParameter("@P_PROP_DEADLINE_DD", pPropDeadlineDd);
			cmd.addParameter("@P_YEAR_INC", pYearInc);
			cmd.addParameter("@P_BEG_FY_MM", pBegFyMm);
			cmd.addParameter("@P_BEG_FY_DD", pBegFyDd);
			cmd.addParameter("@P_END_FY_MM", pEndFyMm);
			cmd.addParameter("@P_END_FY_DD", pEndFyDd);
			cmd.addParameter("@P_OTH_ED_MG_IND", pOthEdMgInd);
			cmd.addParameter("@P_STATE_ASSOC_MG_IND", pStateAssocMgInd);
			cmd.addParameter("@P_DESG_MG_IND", pDesgMgInd);
			cmd.addParameter("@P_MDIS_CODE", pMdisCode);
			cmd.addParameter("@P_MDIS_MM", pMdisMm);
			cmd.addParameter("@P_MDIS_DD", pMdisDd);
			cmd.addParameter("@P_MDIS_DEADLINE_MM", pMdisDeadlineMm);
			cmd.addParameter("@P_MDIS_DEADLINE_DD", pMdisDeadlineDd);
			cmd.addParameter("@P_DUPL_MG_IND", pDuplMgInd);
			cmd.addParameter("@P_MG_ACK_IND", pMgAckInd);
			cmd.addParameter("@P_MGMT_MG_IND", pMgmtMgInd);
			cmd.addParameter("@P_MATCH_PERS_INST_YR", pMatchPersInstYr);
			cmd.addParameter("@P_MATCH_ORG_CEILING_YR", pMatchOrgCeilingYr);
			cmd.addParameter("@P_MATCH_ORG_EMPL_YR", pMatchOrgEmplYr);
			cmd.addParameter("@P_MATCH_MINIMUM", pMatchMinimum);
			cmd.addParameter("@P_SOCIETY_NAME", pSocietyName);
			cmd.addParameter("@P_YEAR_MG", pYearMg);
			cmd.addParameter("@P_FINANCIALS_DATE", pFinancialsDate);
			cmd.addParameter("@P_MG_LOAD_UPDATE_DATE", pMgLoadUpdateDate);
			cmd.addParameter("@P_MG_LOAD_SOURCE", pMgLoadSource);
			cmd.addParameter("@P_MG_RECEIPT_IND", pMgReceiptInd);
			cmd.addParameter("@P_MATCH_MAXIMUM", pMatchMaximum);
			cmd.addParameter("@P_PREFIX_CONTACT", pPrefixContact);
			cmd.addParameter("@P_SUFFIX_CONTACT", pSuffixContact);
			cmd.addParameter("@P_MG_LOAD_ID", pMgLoadId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_SURNAME_PREFIX_CONTACT", pSurnamePrefixContact);
			cmd.addParameter("@P_PREF_ATYP_CODE", pPrefAtypCode);
			cmd.addParameter("@P_PREF_ATYP_SEQNO", pPrefAtypSeqno);
				
			cmd.execute();


		}
		
	
	
	
}
