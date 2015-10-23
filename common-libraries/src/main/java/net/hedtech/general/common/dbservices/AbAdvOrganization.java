package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class AbAdvOrganization {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AB_ADV_ORGANIZATION.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pPidm,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AB_ADV_ORGANIZATION.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(AdvOrganizationRecRow recOne,AdvOrganizationRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AB_ADV_ORGANIZATION.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, AdvOrganizationRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, AdvOrganizationRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AB_ADV_ORGANIZATION.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AB_ADV_ORGANIZATION.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AB_ADV_ORGANIZATION.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pPidm,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AB_ADV_ORGANIZATION.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NNumber pPidm,NString pEin,NString pBusiness,NString pSiccCode,NNumber pMatchPct,NNumber pMatchOrgMax,NNumber pMatchPersonMax,NString pAtypCode,NString pJobcCode,NString pTitleContact,NString pLastNameContact,NString pFirstNameContact,NString pMiContact,NNumber pMgPidm,NNumber pEmplCnt,NNumber pEmplPtProf,NNumber pEmplFtProf,NNumber pTotRevenue,NNumber pTotAssets,NNumber pTotEarnings,NNumber pPreTaxProfit,NNumber pGrantLow,NNumber pGrantHigh,NString pPropDeadlineMm,NString pPropDeadlineDd,NNumber pYearInc,NString pBegFyMm,NString pBegFyDd,NString pEndFyMm,NString pEndFyDd,NString pOthEdMgInd,NString pStateAssocMgInd,NString pDesgMgInd,NString pMdisCode,NString pMdisMm,NString pMdisDd,NString pMdisDeadlineMm,NString pMdisDeadlineDd,NString pDuplMgInd,NString pMgAckInd,NString pMgmtMgInd,NNumber pMatchPersInstYr,NNumber pMatchOrgCeilingYr,NNumber pMatchOrgEmplYr,NNumber pMatchMinimum,NString pSocietyName,NNumber pYearMg,NDate pFinancialsDate,NDate pMgLoadUpdateDate,NString pMgLoadSource,NString pMgReceiptInd,NNumber pMatchMaximum,NString pPrefixContact,NString pSuffixContact,NString pMgLoadId,NString pDataOrigin,NString pUserId,NString pDonrCode,NString pSurnamePrefixContact,NString pPrefAtypCode,NNumber pPrefAtypSeqno,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AB_ADV_ORGANIZATION.P_CREATE", DbManager.getDataBaseFactory());
			
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
			cmd.addParameter("@P_DONR_CODE", pDonrCode);
			cmd.addParameter("@P_SURNAME_PREFIX_CONTACT", pSurnamePrefixContact);
			cmd.addParameter("@P_PREF_ATYP_CODE", pPrefAtypCode);
			cmd.addParameter("@P_PREF_ATYP_SEQNO", pPrefAtypSeqno);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pPidm,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AB_ADV_ORGANIZATION.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pPidm,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AB_ADV_ORGANIZATION.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pPidm,NString pEin,NString pBusiness,NString pSiccCode,NNumber pMatchPct,NNumber pMatchOrgMax,NNumber pMatchPersonMax,NString pAtypCode,NString pJobcCode,NString pTitleContact,NString pLastNameContact,NString pFirstNameContact,NString pMiContact,NNumber pMgPidm,NNumber pEmplCnt,NNumber pEmplPtProf,NNumber pEmplFtProf,NNumber pTotRevenue,NNumber pTotAssets,NNumber pTotEarnings,NNumber pPreTaxProfit,NNumber pGrantLow,NNumber pGrantHigh,NString pPropDeadlineMm,NString pPropDeadlineDd,NNumber pYearInc,NString pBegFyMm,NString pBegFyDd,NString pEndFyMm,NString pEndFyDd,NString pOthEdMgInd,NString pStateAssocMgInd,NString pDesgMgInd,NString pMdisCode,NString pMdisMm,NString pMdisDd,NString pMdisDeadlineMm,NString pMdisDeadlineDd,NString pDuplMgInd,NString pMgAckInd,NString pMgmtMgInd,NNumber pMatchPersInstYr,NNumber pMatchOrgCeilingYr,NNumber pMatchOrgEmplYr,NNumber pMatchMinimum,NString pSocietyName,NNumber pYearMg,NDate pFinancialsDate,NDate pMgLoadUpdateDate,NString pMgLoadSource,NString pMgReceiptInd,NNumber pMatchMaximum,NString pPrefixContact,NString pSuffixContact,NString pMgLoadId,NString pDataOrigin,NString pUserId,NString pSurnamePrefixContact,NString pPrefAtypCode,NNumber pPrefAtypSeqno,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AB_ADV_ORGANIZATION.P_UPDATE", DbManager.getDataBaseFactory());
			
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
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="AdvOrganizationRecRow", dataSourceName="ADV_ORGANIZATION_REC")
	public static class AdvOrganizationRecRow
	{
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_EIN")
		public NString REin;
		@DbRecordField(dataSourceName="R_BUSINESS")
		public NString RBusiness;
		@DbRecordField(dataSourceName="R_SICC_CODE")
		public NString RSiccCode;
		@DbRecordField(dataSourceName="R_MATCH_PCT")
		public NNumber RMatchPct;
		@DbRecordField(dataSourceName="R_MATCH_ORG_MAX")
		public NNumber RMatchOrgMax;
		@DbRecordField(dataSourceName="R_MATCH_PERSON_MAX")
		public NNumber RMatchPersonMax;
		@DbRecordField(dataSourceName="R_ATYP_CODE")
		public NString RAtypCode;
		@DbRecordField(dataSourceName="R_JOBC_CODE")
		public NString RJobcCode;
		@DbRecordField(dataSourceName="R_TITLE_CONTACT")
		public NString RTitleContact;
		@DbRecordField(dataSourceName="R_LAST_NAME_CONTACT")
		public NString RLastNameContact;
		@DbRecordField(dataSourceName="R_FIRST_NAME_CONTACT")
		public NString RFirstNameContact;
		@DbRecordField(dataSourceName="R_MI_CONTACT")
		public NString RMiContact;
		@DbRecordField(dataSourceName="R_MG_PIDM")
		public NNumber RMgPidm;
		@DbRecordField(dataSourceName="R_EMPL_CNT")
		public NNumber REmplCnt;
		@DbRecordField(dataSourceName="R_EMPL_PT_PROF")
		public NNumber REmplPtProf;
		@DbRecordField(dataSourceName="R_EMPL_FT_PROF")
		public NNumber REmplFtProf;
		@DbRecordField(dataSourceName="R_TOT_REVENUE")
		public NNumber RTotRevenue;
		@DbRecordField(dataSourceName="R_TOT_ASSETS")
		public NNumber RTotAssets;
		@DbRecordField(dataSourceName="R_TOT_EARNINGS")
		public NNumber RTotEarnings;
		@DbRecordField(dataSourceName="R_PRE_TAX_PROFIT")
		public NNumber RPreTaxProfit;
		@DbRecordField(dataSourceName="R_GRANT_LOW")
		public NNumber RGrantLow;
		@DbRecordField(dataSourceName="R_GRANT_HIGH")
		public NNumber RGrantHigh;
		@DbRecordField(dataSourceName="R_PROP_DEADLINE_MM")
		public NString RPropDeadlineMm;
		@DbRecordField(dataSourceName="R_PROP_DEADLINE_DD")
		public NString RPropDeadlineDd;
		@DbRecordField(dataSourceName="R_YEAR_INC")
		public NNumber RYearInc;
		@DbRecordField(dataSourceName="R_BEG_FY_MM")
		public NString RBegFyMm;
		@DbRecordField(dataSourceName="R_BEG_FY_DD")
		public NString RBegFyDd;
		@DbRecordField(dataSourceName="R_END_FY_MM")
		public NString REndFyMm;
		@DbRecordField(dataSourceName="R_END_FY_DD")
		public NString REndFyDd;
		@DbRecordField(dataSourceName="R_OTH_ED_MG_IND")
		public NString ROthEdMgInd;
		@DbRecordField(dataSourceName="R_STATE_ASSOC_MG_IND")
		public NString RStateAssocMgInd;
		@DbRecordField(dataSourceName="R_DESG_MG_IND")
		public NString RDesgMgInd;
		@DbRecordField(dataSourceName="R_MDIS_CODE")
		public NString RMdisCode;
		@DbRecordField(dataSourceName="R_MDIS_MM")
		public NString RMdisMm;
		@DbRecordField(dataSourceName="R_MDIS_DD")
		public NString RMdisDd;
		@DbRecordField(dataSourceName="R_MDIS_DEADLINE_MM")
		public NString RMdisDeadlineMm;
		@DbRecordField(dataSourceName="R_MDIS_DEADLINE_DD")
		public NString RMdisDeadlineDd;
		@DbRecordField(dataSourceName="R_DUPL_MG_IND")
		public NString RDuplMgInd;
		@DbRecordField(dataSourceName="R_MG_ACK_IND")
		public NString RMgAckInd;
		@DbRecordField(dataSourceName="R_MGMT_MG_IND")
		public NString RMgmtMgInd;
		@DbRecordField(dataSourceName="R_MATCH_PERS_INST_YR")
		public NNumber RMatchPersInstYr;
		@DbRecordField(dataSourceName="R_MATCH_ORG_CEILING_YR")
		public NNumber RMatchOrgCeilingYr;
		@DbRecordField(dataSourceName="R_MATCH_ORG_EMPL_YR")
		public NNumber RMatchOrgEmplYr;
		@DbRecordField(dataSourceName="R_MATCH_MINIMUM")
		public NNumber RMatchMinimum;
		@DbRecordField(dataSourceName="R_SOCIETY_NAME")
		public NString RSocietyName;
		@DbRecordField(dataSourceName="R_YEAR_MG")
		public NNumber RYearMg;
		@DbRecordField(dataSourceName="R_FINANCIALS_DATE")
		public NDate RFinancialsDate;
		@DbRecordField(dataSourceName="R_MG_LOAD_UPDATE_DATE")
		public NDate RMgLoadUpdateDate;
		@DbRecordField(dataSourceName="R_MG_LOAD_SOURCE")
		public NString RMgLoadSource;
		@DbRecordField(dataSourceName="R_MG_RECEIPT_IND")
		public NString RMgReceiptInd;
		@DbRecordField(dataSourceName="R_MATCH_MAXIMUM")
		public NNumber RMatchMaximum;
		@DbRecordField(dataSourceName="R_PREFIX_CONTACT")
		public NString RPrefixContact;
		@DbRecordField(dataSourceName="R_SUFFIX_CONTACT")
		public NString RSuffixContact;
		@DbRecordField(dataSourceName="R_MG_LOAD_ID")
		public NString RMgLoadId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_SURNAME_PREFIX_CONTACT")
		public NString RSurnamePrefixContact;
		@DbRecordField(dataSourceName="R_PREF_ATYP_CODE")
		public NString RPrefAtypCode;
		@DbRecordField(dataSourceName="R_PREF_ATYP_SEQNO")
		public NNumber RPrefAtypSeqno;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
