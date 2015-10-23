package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwpkduti {
		public static NBool fCoverageAllocExists(NNumber pPidm,NString pBdca) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDUTI.F_COVERAGE_ALLOC_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BDCA", pBdca);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NString fDednamounttype(NString inRule,NNumber inAmtNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDUTI.F_DEDNAMOUNTTYPE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@IN_RULE", inRule);
			cmd.addParameter("@IN_AMT_NO", inAmtNo);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool fDispAllocallowed(NString pBdca,NString pBreaCode,NString pGroup) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDUTI.F_DISP_ALLOCALLOWED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_BDCA", pBdca);
			cmd.addParameter("@P_BREA_CODE", pBreaCode);
			cmd.addParameter("@P_GROUP", pGroup);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NString fDispBenadminLink() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDUTI.F_DISP_BENADMIN_LINK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fDispBensumLink() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDUTI.F_DISP_BENSUM_LINK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool fDispCoverageallowed(NString pBdca,NString pBreaCode,NString pGroup) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDUTI.F_DISP_COVERAGEALLOWED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_BDCA", pBdca);
			cmd.addParameter("@P_BREA_CODE", pBreaCode);
			cmd.addParameter("@P_GROUP", pGroup);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NString fDispGroupLink(NString pUrlname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDUTI.F_DISP_GROUP_LINK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_URLNAME", pUrlname);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fDispLifechgenrollmentLink() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDUTI.F_DISP_LIFECHGENROLLMENT_LINK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fDispLifeeventchgLink() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDUTI.F_DISP_LIFEEVENTCHG_LINK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fDispNewhireLink(NString pUrlname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDUTI.F_DISP_NEWHIRE_LINK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_URLNAME", pUrlname);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fDispNewhiremenuLink(NString pUrl) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDUTI.F_DISP_NEWHIREMENU_LINK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_URL", pUrl);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fDispOeLink() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDUTI.F_DISP_OE_LINK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fDispUpdflexspLink() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDUTI.F_DISP_UPDFLEXSP_LINK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fDispUpdhealthLink() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDUTI.F_DISP_UPDHEALTH_LINK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fDispUpdmiscLink() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDUTI.F_DISP_UPDMISC_LINK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fDispUpdretireLink() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDUTI.F_DISP_UPDRETIRE_LINK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fDispUpdtallocLink(NString pBdca,NString pUrlstr,NString pUrltxt,NString pBreaCode,NString pGroup) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDUTI.F_DISP_UPDTALLOC_LINK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_BDCA", pBdca);
			cmd.addParameter("@P_URLSTR", pUrlstr);
			cmd.addParameter("@P_URLTXT", pUrltxt);
			cmd.addParameter("@P_BREA_CODE", pBreaCode);
			cmd.addParameter("@P_GROUP", pGroup);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fDispUpdtcoverageLink(NString pBdca,NString pUrlstr,NString pUrltxt,NString pBreaCode,NString pGroup) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDUTI.F_DISP_UPDTCOVERAGE_LINK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_BDCA", pBdca);
			cmd.addParameter("@P_URLSTR", pUrlstr);
			cmd.addParameter("@P_URLTXT", pUrltxt);
			cmd.addParameter("@P_BREA_CODE", pBreaCode);
			cmd.addParameter("@P_GROUP", pGroup);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fFormatamt(NNumber amtIn,NString inRule,NNumber inAmtNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDUTI.F_FORMATAMT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@AMT_IN", amtIn);
			cmd.addParameter("@IN_RULE", inRule);
			cmd.addParameter("@IN_AMT_NO", inAmtNo);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetBdcaDesc(NString pBdcaCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDUTI.F_GET_BDCA_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetOptTitle(NString pWhichOpt,NString pOptTitleIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDUTI.F_GET_OPT_TITLE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_WHICH_OPT", pWhichOpt);
			cmd.addParameter("@P_OPT_TITLE_IN", pOptTitleIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fString(NString pStringName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDUTI.F_STRING", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_STRING_NAME", pStringName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pAddChoice(NNumber pPidm,NString pBdca,NDate pBenefitEffDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDUTI.P_ADD_CHOICE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BDCA", pBdca);
			cmd.addParameter("@P_BENEFIT_EFF_DATE", pBenefitEffDate);
				
			cmd.execute();


		}
		
//		public static void pApplydeductiondriver(List<Twbklibs.Varchar2TabtypeRow> pRecNo,List<Twbklibs.Varchar2TabtypeRow> pSeqNo,List<Twbklibs.Varchar2TabtypeRow> pBdcaCode,List<Twbklibs.Varchar2TabtypeRow> pEffectiveDate,NNumber pLoginPidm,Ref<NNumber> pApplyCountOut,Ref<NNumber> pErrorCountOut) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDUTI.P_APPLYDEDUCTIONDRIVER", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("P_REC_NO", "", pRecNo, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_SEQ_NO", "", pSeqNo, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_BDCA_CODE", "", pBdcaCode, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_EFFECTIVE_DATE", "", pEffectiveDate, object.class));
//			cmd.addParameter("@P_LOGIN_PIDM", pLoginPidm);
//			cmd.addParameter("@P_APPLY_COUNT_OUT", NNumber.class);
//			cmd.addParameter("@P_ERROR_COUNT_OUT", NNumber.class);
//				
//			cmd.execute();
//			pApplyCountOut.val = cmd.getParameterValue("@P_APPLY_COUNT_OUT", NNumber.class);
//			pErrorCountOut.val = cmd.getParameterValue("@P_ERROR_COUNT_OUT", NNumber.class);
//
//
//		}
		
		public static void pClearAllocations(NNumber pPidm,NString pBdcaCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDUTI.P_CLEAR_ALLOCATIONS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
				
			cmd.execute();


		}
		
		public static void pClearChoices(NNumber pPidm,NString pBdca,NString pGroup) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDUTI.P_CLEAR_CHOICES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BDCA", pBdca);
			cmd.addParameter("@P_GROUP", pGroup);
				
			cmd.execute();


		}
		
		public static void pClearCoverage(NNumber pPidm,NString pBdcaCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDUTI.P_CLEAR_COVERAGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
				
			cmd.execute();


		}
		
		public static void pDedndetailtabledata() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDUTI.P_DEDNDETAILTABLEDATA", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pDedndetailtableheaders(NString inTabtype) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDUTI.P_DEDNDETAILTABLEHEADERS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IN_TABTYPE", inTabtype);
				
			cmd.execute();


		}
		
		public static void pDeleteDeductionErrors(NNumber pPidm,NString pBdcaCode,NDate pEffectiveDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDUTI.P_DELETE_DEDUCTION_ERRORS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
				
			cmd.execute();


		}
		
		public static void pDeleteWtlparms(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDUTI.P_DELETE_WTLPARMS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();


		}
		
		public static void pGetEnrollmentType(NNumber pPidm,Ref<NString> pEnrollmentTypeOut,Ref<NString> pBreaCodeOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDUTI.P_GET_ENROLLMENT_TYPE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ENROLLMENT_TYPE_OUT", NString.class);
			cmd.addParameter("@P_BREA_CODE_OUT", NString.class);
				
			cmd.execute();
			pEnrollmentTypeOut.val = cmd.getParameterValue("@P_ENROLLMENT_TYPE_OUT", NString.class);
			pBreaCodeOut.val = cmd.getParameterValue("@P_BREA_CODE_OUT", NString.class);


		}
		
		public static void pInitEmployeeBcatRecs(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDUTI.P_INIT_EMPLOYEE_BCAT_RECS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();


		}
		
		public static void pOpenenrollmentformchoose(NString pBdca,NDate pEffDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDUTI.P_OPENENROLLMENTFORMCHOOSE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_BDCA", pBdca);
			cmd.addParameter("@P_EFF_DATE", pEffDate);
				
			cmd.execute();


		}
		
		public static void pOpenenrollmentformnon() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDUTI.P_OPENENROLLMENTFORMNON", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pPrintAccessDenied() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDUTI.P_PRINT_ACCESS_DENIED", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pPrintBenefitGroupNotes(NString pBenefitGroup,NString pGroupDetl) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDUTI.P_PRINT_BENEFIT_GROUP_NOTES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_BENEFIT_GROUP", pBenefitGroup);
			cmd.addParameter("@P_GROUP_DETL", pGroupDetl);
				
			cmd.execute();


		}
		
		public static void pPrintEnrlDeductionRows(NString pBdcaCode,NDate pEffDate,NString pEnrolled,NString pMessage,NString pOtherUrls) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDUTI.P_PRINT_ENRL_DEDUCTION_ROWS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_EFF_DATE", pEffDate);
			cmd.addParameter("@P_ENROLLED", pEnrolled);
			cmd.addParameter("@P_MESSAGE", pMessage);
			cmd.addParameter("@P_OTHER_URLS", pOtherUrls);
				
			cmd.execute();


		}
		
		public static void pPrintEnrlMainBtns(NString pConfirmed,NBool pNoChoicesYet,NBool pChoicesActivated,NString pBreaCode,NDate pEventDate,NString pEnrlExpired) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDUTI.P_PRINT_ENRL_MAIN_BTNS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CONFIRMED", pConfirmed);
			cmd.addParameter("@P_NO_CHOICES_YET", pNoChoicesYet);
			cmd.addParameter("@P_CHOICES_ACTIVATED", pChoicesActivated);
			cmd.addParameter("@P_BREA_CODE", pBreaCode);
			cmd.addParameter("@P_EVENT_DATE", pEventDate);
			cmd.addParameter("@P_ENRL_EXPIRED", pEnrlExpired);
				
			cmd.execute();


		}
		
		public static void pPrintGroupsSummary(NString pEnrollmentType,NDate pEnrollmentDate,NNumber pPidm,NString pBcatCode,NString pBreaCode,Ref<NNumber> pGroupsCntOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDUTI.P_PRINT_GROUPS_SUMMARY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ENROLLMENT_TYPE", pEnrollmentType);
			cmd.addParameter("@P_ENROLLMENT_DATE", pEnrollmentDate);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BCAT_CODE", pBcatCode);
			cmd.addParameter("@P_BREA_CODE", pBreaCode);
			cmd.addParameter("@P_GROUPS_CNT_OUT", pGroupsCntOut, true);
				
			cmd.execute();
			pGroupsCntOut.val = cmd.getParameterValue("@P_GROUPS_CNT_OUT", NNumber.class);


		}
		
		public static void pPrintOptionHeaders(NString pOptTitle,NString pShowOtherInfo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDUTI.P_PRINT_OPTION_HEADERS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPT_TITLE", pOptTitle);
			cmd.addParameter("@P_SHOW_OTHER_INFO", pShowOtherInfo);
				
			cmd.execute();


		}
		
		public static void pPrintSelectedCost(NString pWhichAmt,NNumber pBdplAmt,NNumber pAmount,NString pAmountDesc) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDUTI.P_PRINT_SELECTED_COST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_WHICH_AMT", pWhichAmt);
			cmd.addParameter("@P_BDPL_AMT", pBdplAmt);
			cmd.addParameter("@P_AMOUNT", pAmount);
			cmd.addParameter("@P_AMOUNT_DESC", pAmountDesc);
				
			cmd.execute();


		}
		
		public static void pPrintSelectedOption(NString pWhichOpt,NString pOptCode,NString pOptTitle) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDUTI.P_PRINT_SELECTED_OPTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_WHICH_OPT", pWhichOpt);
			cmd.addParameter("@P_OPT_CODE", pOptCode);
			cmd.addParameter("@P_OPT_TITLE", pOptTitle);
				
			cmd.execute();


		}
		
		public static void pShowoeLink(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDUTI.P_SHOWOE_LINK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();


		}
		
		public static void pTerminateBenefit(NNumber pPidm,NString pBdca,NDate pEffDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDUTI.P_TERMINATE_BENEFIT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BDCA", pBdca);
			cmd.addParameter("@P_EFF_DATE", pEffDate);
				
			cmd.execute();


		}
		
		public static void pUpdateChoice(NNumber pPidm,NString pBdca,NDate pBenefitEffDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDUTI.P_UPDATE_CHOICE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BDCA", pBdca);
			cmd.addParameter("@P_BENEFIT_EFF_DATE", pBenefitEffDate);
				
			cmd.execute();


		}
		
		public static void pVerifycorebdcaenrollment(NNumber inParPidm,NString inParBdcaCode,NDate parDate,NString parAction,NString parStatus,NString parOeInd,Ref<NString> msgOut,Ref<NString> msgTypeOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDUTI.P_VERIFYCOREBDCAENROLLMENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IN_PAR_PIDM", inParPidm);
			cmd.addParameter("@IN_PAR_BDCA_CODE", inParBdcaCode);
			cmd.addParameter("@PAR_DATE", parDate);
			cmd.addParameter("@PAR_ACTION", parAction);
			cmd.addParameter("@PAR_STATUS", parStatus);
			cmd.addParameter("@PAR_OE_IND", parOeInd);
			cmd.addParameter("@MSG_OUT", NString.class);
			cmd.addParameter("@MSG_TYPE_OUT", NString.class);
				
			cmd.execute();
			msgOut.val = cmd.getParameterValue("@MSG_OUT", NString.class);
			msgTypeOut.val = cmd.getParameterValue("@MSG_TYPE_OUT", NString.class);


		}
		
	
	
	
}
