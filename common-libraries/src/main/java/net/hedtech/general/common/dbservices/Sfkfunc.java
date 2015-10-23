package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Sfkfunc {
		public static NString fAutodropSetting() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFUNC.F_AUTODROP_SETTING", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool fDoAdmindrop() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFUNC.F_DO_ADMINDROP", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NString fDuplEquiv(NString currCrn,NString currSubjCode,NString currCrseNumb,NString currSchdCode,NString currTerm,NNumber currPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFUNC.F_DUPL_EQUIV", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@CURR_CRN", currCrn);
			cmd.addParameter("@CURR_SUBJ_CODE", currSubjCode);
			cmd.addParameter("@CURR_CRSE_NUMB", currCrseNumb);
			cmd.addParameter("@CURR_SCHD_CODE", currSchdCode);
			cmd.addParameter("@CURR_TERM", currTerm);
			cmd.addParameter("@CURR_PIDM", currPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fDuplXlst(NString currCrn,NString currTerm,NNumber currPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFUNC.F_DUPL_XLST", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@CURR_CRN", currCrn);
			cmd.addParameter("@CURR_TERM", currTerm);
			cmd.addParameter("@CURR_PIDM", currPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fFatalErrorCount(NNumber pidmIn,NString termIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFUNC.F_FATAL_ERROR_COUNT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fGetCappTechError(NNumber pidmIn,NString termIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFUNC.F_GET_CAPP_TECH_ERROR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetMinhAdminError(NNumber pidmIn,NString termIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFUNC.F_GET_MINH_ADMIN_ERROR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetRstsType(NString rstsCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFUNC.F_GET_RSTS_TYPE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@RSTS_CODE_IN", rstsCodeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NDate fOlrDate(NDate dateIn,NString dateTypeIn,NNumber numUnitsIn,NNumber numDaysIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFUNC.F_OLR_DATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@DATE_IN", dateIn);
			cmd.addParameter("@DATE_TYPE_IN", dateTypeIn);
			cmd.addParameter("@NUM_UNITS_IN", numUnitsIn);
			cmd.addParameter("@NUM_DAYS_IN", numDaysIn);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
		public static NBool fRegAccessStillGood(NNumber pidmIn,NString termIn,NString accessIdIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFUNC.F_REG_ACCESS_STILL_GOOD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@ACCESS_ID_IN", accessIdIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fRegistrationAccess(NNumber pidmIn,NString termIn,NString sourceIn,NString accessIdIn,NDate regDateIn,NString bypassAdminIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFUNC.F_REGISTRATION_ACCESS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@SOURCE_IN", sourceIn);
			cmd.addParameter("@ACCESS_ID_IN", accessIdIn);
			cmd.addParameter("@REG_DATE_IN", regDateIn);
			cmd.addParameter("@BYPASS_ADMIN_IN", bypassAdminIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NNumber fSfraregEffExt(NNumber pidmIn,NString termIn,NString crnIn,NDate regDateIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFUNC.F_SFRAREG_EFF_EXT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@REG_DATE_IN", regDateIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void pCalcScpsTmst(Ref<NString> tmstCodeInOut,Ref<NString> tmstDescInOut,NString stypCodeIn,NString termCodeIn,NString scpsCodeIn,NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFUNC.P_CALC_SCPS_TMST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TMST_CODE_IN_OUT", tmstCodeInOut, true);
			cmd.addParameter("@TMST_DESC_IN_OUT", tmstDescInOut, true);
			cmd.addParameter("@STYP_CODE_IN", stypCodeIn);
			cmd.addParameter("@TERM_CODE_IN", termCodeIn);
			cmd.addParameter("@SCPS_CODE_IN", scpsCodeIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();
			tmstCodeInOut.val = cmd.getParameterValue("@TMST_CODE_IN_OUT", NString.class);
			tmstDescInOut.val = cmd.getParameterValue("@TMST_DESC_IN_OUT", NString.class);


		}
		
		public static void pCalcTmst(Ref<NString> tmstCodeInOut,Ref<NString> tmstDescInOut,NString stypCodeIn,NString termCodeIn,NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFUNC.P_CALC_TMST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TMST_CODE_IN_OUT", tmstCodeInOut, true);
			cmd.addParameter("@TMST_DESC_IN_OUT", tmstDescInOut, true);
			cmd.addParameter("@STYP_CODE_IN", stypCodeIn);
			cmd.addParameter("@TERM_CODE_IN", termCodeIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();
			tmstCodeInOut.val = cmd.getParameterValue("@TMST_CODE_IN_OUT", NString.class);
			tmstDescInOut.val = cmd.getParameterValue("@TMST_DESC_IN_OUT", NString.class);


		}
		
		public static void pCheckAppr(Ref<NString> pRmsgCdeInOut,Ref<NString> messageInOut,Ref<NString> errFlagInOut,Ref<NString> apprErrInOut,NString apprSeverityIn,NString saprIn,NString apprRcvdIndIn,NString apprOverIn,NString systemIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFUNC.P_CHECK_APPR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_RMSG_CDE_IN_OUT", pRmsgCdeInOut, true);
			cmd.addParameter("@MESSAGE_IN_OUT", messageInOut, true);
			cmd.addParameter("@ERR_FLAG_IN_OUT", errFlagInOut, true);
			cmd.addParameter("@APPR_ERR_IN_OUT", apprErrInOut, true);
			cmd.addParameter("@APPR_SEVERITY_IN", apprSeverityIn);
			cmd.addParameter("@SAPR_IN", saprIn);
			cmd.addParameter("@APPR_RCVD_IND_IN", apprRcvdIndIn);
			cmd.addParameter("@APPR_OVER_IN", apprOverIn);
			cmd.addParameter("@SYSTEM_IN", systemIn);
				
			cmd.execute();
			pRmsgCdeInOut.val = cmd.getParameterValue("@P_RMSG_CDE_IN_OUT", NString.class);
			messageInOut.val = cmd.getParameterValue("@MESSAGE_IN_OUT", NString.class);
			errFlagInOut.val = cmd.getParameterValue("@ERR_FLAG_IN_OUT", NString.class);
			apprErrInOut.val = cmd.getParameterValue("@APPR_ERR_IN_OUT", NString.class);


		}
		
		public static void pCheckAtts(NNumber pPidm,NString pTermCode,NString pCrn,NString pAttsSeverity,Ref<NString> pRmsgCdeInout,Ref<NString> pMessageInout,Ref<NString> pErrFlagInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFUNC.P_CHECK_ATTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_ATTS_SEVERITY", pAttsSeverity);
			cmd.addParameter("@P_RMSG_CDE_INOUT", pRmsgCdeInout, true);
			cmd.addParameter("@P_MESSAGE_INOUT", pMessageInout, true);
			cmd.addParameter("@P_ERR_FLAG_INOUT", pErrFlagInout, true);
				
			cmd.execute();
			pRmsgCdeInout.val = cmd.getParameterValue("@P_RMSG_CDE_INOUT", NString.class);
			pMessageInout.val = cmd.getParameterValue("@P_MESSAGE_INOUT", NString.class);
			pErrFlagInout.val = cmd.getParameterValue("@P_ERR_FLAG_INOUT", NString.class);


		}
		
		public static void pCheckCamp(Ref<NString> pRmsgCdeInOut,Ref<NString> messageInOut,Ref<NString> errFlagInOut,NString campSeverityIn,NString crnIn,NString termIn,NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFUNC.P_CHECK_CAMP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_RMSG_CDE_IN_OUT", pRmsgCdeInOut, true);
			cmd.addParameter("@MESSAGE_IN_OUT", messageInOut, true);
			cmd.addParameter("@ERR_FLAG_IN_OUT", errFlagInOut, true);
			cmd.addParameter("@CAMP_SEVERITY_IN", campSeverityIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();
			pRmsgCdeInOut.val = cmd.getParameterValue("@P_RMSG_CDE_IN_OUT", NString.class);
			messageInOut.val = cmd.getParameterValue("@MESSAGE_IN_OUT", NString.class);
			errFlagInOut.val = cmd.getParameterValue("@ERR_FLAG_IN_OUT", NString.class);


		}
		
		public static void pCheckChrt(NNumber pPidm,NString pTermCode,NString pCrn,NString pChrtSeverity,Ref<NString> pRmsgCdeInout,Ref<NString> pMessageInout,Ref<NString> pErrFlagInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFUNC.P_CHECK_CHRT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_CHRT_SEVERITY", pChrtSeverity);
			cmd.addParameter("@P_RMSG_CDE_INOUT", pRmsgCdeInout, true);
			cmd.addParameter("@P_MESSAGE_INOUT", pMessageInout, true);
			cmd.addParameter("@P_ERR_FLAG_INOUT", pErrFlagInout, true);
				
			cmd.execute();
			pRmsgCdeInout.val = cmd.getParameterValue("@P_RMSG_CDE_INOUT", NString.class);
			pMessageInout.val = cmd.getParameterValue("@P_MESSAGE_INOUT", NString.class);
			pErrFlagInout.val = cmd.getParameterValue("@P_ERR_FLAG_INOUT", NString.class);


		}
		
		public static void pCheckClas(Ref<NString> pRmsgCdeInOut,Ref<NString> messageInOut,Ref<NString> errFlagInOut,NString clasIn,NString clasSeverityIn,NString crnIn,NString termIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFUNC.P_CHECK_CLAS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_RMSG_CDE_IN_OUT", pRmsgCdeInOut, true);
			cmd.addParameter("@MESSAGE_IN_OUT", messageInOut, true);
			cmd.addParameter("@ERR_FLAG_IN_OUT", errFlagInOut, true);
			cmd.addParameter("@CLAS_IN", clasIn);
			cmd.addParameter("@CLAS_SEVERITY_IN", clasSeverityIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@TERM_IN", termIn);
				
			cmd.execute();
			pRmsgCdeInOut.val = cmd.getParameterValue("@P_RMSG_CDE_IN_OUT", NString.class);
			messageInOut.val = cmd.getParameterValue("@MESSAGE_IN_OUT", NString.class);
			errFlagInOut.val = cmd.getParameterValue("@ERR_FLAG_IN_OUT", NString.class);


		}
		
		public static void pCheckColl(Ref<NString> pRmsgCdeInOut,Ref<NString> messageInOut,Ref<NString> errFlagInOut,NString collSeverityIn,NString crnIn,NString termIn,NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFUNC.P_CHECK_COLL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_RMSG_CDE_IN_OUT", pRmsgCdeInOut, true);
			cmd.addParameter("@MESSAGE_IN_OUT", messageInOut, true);
			cmd.addParameter("@ERR_FLAG_IN_OUT", errFlagInOut, true);
			cmd.addParameter("@COLL_SEVERITY_IN", collSeverityIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();
			pRmsgCdeInOut.val = cmd.getParameterValue("@P_RMSG_CDE_IN_OUT", NString.class);
			messageInOut.val = cmd.getParameterValue("@MESSAGE_IN_OUT", NString.class);
			errFlagInOut.val = cmd.getParameterValue("@ERR_FLAG_IN_OUT", NString.class);


		}
		
		public static void pCheckCorqSftregs(NString corqSeverityIn,NString termIn,NNumber pidmIn,NString adminProcessingIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFUNC.P_CHECK_CORQ_SFTREGS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CORQ_SEVERITY_IN", corqSeverityIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@ADMIN_PROCESSING_IN", adminProcessingIn);
				
			cmd.execute();


		}
		
		public static void pCheckDegc(Ref<NString> pRmsgCdeInOut,Ref<NString> messageInOut,Ref<NString> errFlagInOut,NString degcSeverityIn,NString crnIn,NString termIn,NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFUNC.P_CHECK_DEGC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_RMSG_CDE_IN_OUT", pRmsgCdeInOut, true);
			cmd.addParameter("@MESSAGE_IN_OUT", messageInOut, true);
			cmd.addParameter("@ERR_FLAG_IN_OUT", errFlagInOut, true);
			cmd.addParameter("@DEGC_SEVERITY_IN", degcSeverityIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();
			pRmsgCdeInOut.val = cmd.getParameterValue("@P_RMSG_CDE_IN_OUT", NString.class);
			messageInOut.val = cmd.getParameterValue("@MESSAGE_IN_OUT", NString.class);
			errFlagInOut.val = cmd.getParameterValue("@ERR_FLAG_IN_OUT", NString.class);


		}
		
		public static void pCheckDept(NNumber pPidm,NString pTermCode,NString pCrn,NString pDeptSeverity,Ref<NString> pRmsgCdeInout,Ref<NString> pMessageInout,Ref<NString> pErrFlagInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFUNC.P_CHECK_DEPT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_DEPT_SEVERITY", pDeptSeverity);
			cmd.addParameter("@P_RMSG_CDE_INOUT", pRmsgCdeInout, true);
			cmd.addParameter("@P_MESSAGE_INOUT", pMessageInout, true);
			cmd.addParameter("@P_ERR_FLAG_INOUT", pErrFlagInout, true);
				
			cmd.execute();
			pRmsgCdeInout.val = cmd.getParameterValue("@P_RMSG_CDE_INOUT", NString.class);
			pMessageInout.val = cmd.getParameterValue("@P_MESSAGE_INOUT", NString.class);
			pErrFlagInout.val = cmd.getParameterValue("@P_ERR_FLAG_INOUT", NString.class);


		}
		
		public static void pCheckDuplSftregs(NString duplSeverityIn,NString termIn,NNumber pidmIn,NString adminProcessingIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFUNC.P_CHECK_DUPL_SFTREGS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DUPL_SEVERITY_IN", duplSeverityIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@ADMIN_PROCESSING_IN", adminProcessingIn);
				
			cmd.execute();


		}
		
		public static void pCheckLevl(Ref<NString> pRmsgCdeInOut,Ref<NString> messageInOut,Ref<NString> errFlagInOut,NString levlSeverityIn,NString crnIn,NString termIn,NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFUNC.P_CHECK_LEVL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_RMSG_CDE_IN_OUT", pRmsgCdeInOut, true);
			cmd.addParameter("@MESSAGE_IN_OUT", messageInOut, true);
			cmd.addParameter("@ERR_FLAG_IN_OUT", errFlagInOut, true);
			cmd.addParameter("@LEVL_SEVERITY_IN", levlSeverityIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();
			pRmsgCdeInOut.val = cmd.getParameterValue("@P_RMSG_CDE_IN_OUT", NString.class);
			messageInOut.val = cmd.getParameterValue("@MESSAGE_IN_OUT", NString.class);
			errFlagInOut.val = cmd.getParameterValue("@ERR_FLAG_IN_OUT", NString.class);


		}
		
		public static void pCheckLinkSftregs(NString linkSeverityIn,NString termIn,NNumber pidmIn,NString adminProcessingIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFUNC.P_CHECK_LINK_SFTREGS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@LINK_SEVERITY_IN", linkSeverityIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@ADMIN_PROCESSING_IN", adminProcessingIn);
				
			cmd.execute();


		}
		
		public static void pCheckMajr(Ref<NString> pRmsgCdeInOut,Ref<NString> messageInOut,Ref<NString> errFlagInOut,NString majrSeverityIn,NString crnIn,NString termIn,NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFUNC.P_CHECK_MAJR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_RMSG_CDE_IN_OUT", pRmsgCdeInOut, true);
			cmd.addParameter("@MESSAGE_IN_OUT", messageInOut, true);
			cmd.addParameter("@ERR_FLAG_IN_OUT", errFlagInOut, true);
			cmd.addParameter("@MAJR_SEVERITY_IN", majrSeverityIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();
			pRmsgCdeInOut.val = cmd.getParameterValue("@P_RMSG_CDE_IN_OUT", NString.class);
			messageInOut.val = cmd.getParameterValue("@MESSAGE_IN_OUT", NString.class);
			errFlagInOut.val = cmd.getParameterValue("@ERR_FLAG_IN_OUT", NString.class);


		}
		
		public static void pCheckMaxhSftregs(NNumber totCredHrsIn,NString maxhSeverityIn,NNumber mhrsOverIn,NString termIn,NNumber pidmIn,NString adminProcessingIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFUNC.P_CHECK_MAXH_SFTREGS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TOT_CRED_HRS_IN", totCredHrsIn);
			cmd.addParameter("@MAXH_SEVERITY_IN", maxhSeverityIn);
			cmd.addParameter("@MHRS_OVER_IN", mhrsOverIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@ADMIN_PROCESSING_IN", adminProcessingIn);
				
			cmd.execute();


		}
		
		public static void pCheckProg(Ref<NString> pRmsgCdeInOut,Ref<NString> messageInOut,Ref<NString> errFlagInOut,NString progSeverityIn,NString crnIn,NString termIn,NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFUNC.P_CHECK_PROG", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_RMSG_CDE_IN_OUT", pRmsgCdeInOut, true);
			cmd.addParameter("@MESSAGE_IN_OUT", messageInOut, true);
			cmd.addParameter("@ERR_FLAG_IN_OUT", errFlagInOut, true);
			cmd.addParameter("@PROG_SEVERITY_IN", progSeverityIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();
			pRmsgCdeInOut.val = cmd.getParameterValue("@P_RMSG_CDE_IN_OUT", NString.class);
			messageInOut.val = cmd.getParameterValue("@MESSAGE_IN_OUT", NString.class);
			errFlagInOut.val = cmd.getParameterValue("@ERR_FLAG_IN_OUT", NString.class);


		}
		
		public static void pCheckRept(Ref<NString> pRmsgCdeInOut,Ref<NString> messageInOut,Ref<NString> errorFlagInOut,NString reptSeverityIn,NNumber countCreditHoursIn,NNumber crseRepeatLimitIn,NNumber crseMaxRptUnitsIn,NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFUNC.P_CHECK_REPT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_RMSG_CDE_IN_OUT", pRmsgCdeInOut, true);
			cmd.addParameter("@MESSAGE_IN_OUT", messageInOut, true);
			cmd.addParameter("@ERROR_FLAG_IN_OUT", errorFlagInOut, true);
			cmd.addParameter("@REPT_SEVERITY_IN", reptSeverityIn);
			cmd.addParameter("@COUNT_CREDIT_HOURS_IN", countCreditHoursIn);
			cmd.addParameter("@CRSE_REPEAT_LIMIT_IN", crseRepeatLimitIn);
			cmd.addParameter("@CRSE_MAX_RPT_UNITS_IN", crseMaxRptUnitsIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();
			pRmsgCdeInOut.val = cmd.getParameterValue("@P_RMSG_CDE_IN_OUT", NString.class);
			messageInOut.val = cmd.getParameterValue("@MESSAGE_IN_OUT", NString.class);
			errorFlagInOut.val = cmd.getParameterValue("@ERROR_FLAG_IN_OUT", NString.class);


		}
		
		public static void pCheckRpth(Ref<NString> pRmsgCdeInOut,Ref<NString> messageInOut,Ref<NString> errorFlagInOut,NString rpthSeverityIn,NNumber stcrCreditHrIn,NNumber sumCreditHoursIn,NNumber crseMaxRptUnitsIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFUNC.P_CHECK_RPTH", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_RMSG_CDE_IN_OUT", pRmsgCdeInOut, true);
			cmd.addParameter("@MESSAGE_IN_OUT", messageInOut, true);
			cmd.addParameter("@ERROR_FLAG_IN_OUT", errorFlagInOut, true);
			cmd.addParameter("@RPTH_SEVERITY_IN", rpthSeverityIn);
			cmd.addParameter("@STCR_CREDIT_HR_IN", stcrCreditHrIn);
			cmd.addParameter("@SUM_CREDIT_HOURS_IN", sumCreditHoursIn);
			cmd.addParameter("@CRSE_MAX_RPT_UNITS_IN", crseMaxRptUnitsIn);
				
			cmd.execute();
			pRmsgCdeInOut.val = cmd.getParameterValue("@P_RMSG_CDE_IN_OUT", NString.class);
			messageInOut.val = cmd.getParameterValue("@MESSAGE_IN_OUT", NString.class);
			errorFlagInOut.val = cmd.getParameterValue("@ERROR_FLAG_IN_OUT", NString.class);


		}
		
		public static void pCheckSsts(Ref<NString> pRmsgCdeInOut,Ref<NString> messageInOut,Ref<NString> errorFlagInOut,NString sectSstsCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFUNC.P_CHECK_SSTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_RMSG_CDE_IN_OUT", pRmsgCdeInOut, true);
			cmd.addParameter("@MESSAGE_IN_OUT", messageInOut, true);
			cmd.addParameter("@ERROR_FLAG_IN_OUT", errorFlagInOut, true);
			cmd.addParameter("@SECT_SSTS_CODE_IN", sectSstsCodeIn);
				
			cmd.execute();
			pRmsgCdeInOut.val = cmd.getParameterValue("@P_RMSG_CDE_IN_OUT", NString.class);
			messageInOut.val = cmd.getParameterValue("@MESSAGE_IN_OUT", NString.class);
			errorFlagInOut.val = cmd.getParameterValue("@ERROR_FLAG_IN_OUT", NString.class);


		}
		
//		public static void pCheckStudentStatus(NNumber pidm,NString term,Ref<List<Soktabs.StvestsTabTypeRow>> stvestsTable,Ref<List<Soktabs.StvststTabTypeRow>> stvststTable) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFUNC.P_CHECK_STUDENT_STATUS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@PIDM", pidm);
//			cmd.addParameter("@TERM", term);
//			// cmd.addParameter(DbTypes.getTableType("STVESTS_TABLE", "", stvestsTable.val, object.class , true));
//			// cmd.addParameter(DbTypes.getTableType("STVSTST_TABLE", "", stvststTable.val, object.class , true));
//				
//			cmd.execute();
//			// stvestsTable.val = cmd.getTableParameterValue("@STVESTS_TABLE", object.class);
//			// stvststTable.val = cmd.getTableParameterValue("@STVSTST_TABLE", object.class);
//
//
//		}
		
		public static void pCheckTime(NString termIn,NNumber pidmIn,NString crnIn,Ref<NString> timeconflVarInOut,Ref<NNumber> cntInOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFUNC.P_CHECK_TIME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@TIMECONFL_VAR_IN_OUT", timeconflVarInOut, true);
			cmd.addParameter("@CNT_IN_OUT", cntInOut, true);
				
			cmd.execute();
			timeconflVarInOut.val = cmd.getParameterValue("@TIMECONFL_VAR_IN_OUT", NString.class);
			cntInOut.val = cmd.getParameterValue("@CNT_IN_OUT", NNumber.class);


		}
		
		public static void pCheckTimeSftregs(NString timeSeverityIn,NString sessionidIn,NString termIn,NNumber pidmIn,NString systemIn,NString adminProcessingIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFUNC.P_CHECK_TIME_SFTREGS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TIME_SEVERITY_IN", timeSeverityIn);
			cmd.addParameter("@SESSIONID_IN", sessionidIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@SYSTEM_IN", systemIn);
			cmd.addParameter("@ADMIN_PROCESSING_IN", adminProcessingIn);
				
			cmd.execute();


		}
		
		public static void pCheckTimeWlSftregs(NString timeSeverityIn,NString sessionidIn,NString termIn,NNumber pidmIn,NString adminProcessingIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFUNC.P_CHECK_TIME_WL_SFTREGS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TIME_SEVERITY_IN", timeSeverityIn);
			cmd.addParameter("@SESSIONID_IN", sessionidIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@ADMIN_PROCESSING_IN", adminProcessingIn);
				
			cmd.execute();


		}
		
		public static void pGetAndSetOverrides() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFUNC.P_GET_AND_SET_OVERRIDES", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pGetAppr(Ref<NString> pRmsgCdeInOut,Ref<NString> errMsgInOut,Ref<NString> errFlagInOut,Ref<NString> apprErrInOut,NString apprRcvdIndIn,NString apprSeverityIn,NString apprOverIn,NString saprIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFUNC.P_GET_APPR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_RMSG_CDE_IN_OUT", pRmsgCdeInOut, true);
			cmd.addParameter("@ERR_MSG_IN_OUT", errMsgInOut, true);
			cmd.addParameter("@ERR_FLAG_IN_OUT", errFlagInOut, true);
			cmd.addParameter("@APPR_ERR_IN_OUT", apprErrInOut, true);
			cmd.addParameter("@APPR_RCVD_IND_IN", apprRcvdIndIn);
			cmd.addParameter("@APPR_SEVERITY_IN", apprSeverityIn);
			cmd.addParameter("@APPR_OVER_IN", apprOverIn);
			cmd.addParameter("@SAPR_IN", saprIn);
				
			cmd.execute();
			pRmsgCdeInOut.val = cmd.getParameterValue("@P_RMSG_CDE_IN_OUT", NString.class);
			errMsgInOut.val = cmd.getParameterValue("@ERR_MSG_IN_OUT", NString.class);
			errFlagInOut.val = cmd.getParameterValue("@ERR_FLAG_IN_OUT", NString.class);
			apprErrInOut.val = cmd.getParameterValue("@APPR_ERR_IN_OUT", NString.class);


		}
		
		public static void pGetCourse(Ref<NString> levlInOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFUNC.P_GET_COURSE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@LEVL_IN_OUT", levlInOut, true);
				
			cmd.execute();
			levlInOut.val = cmd.getParameterValue("@LEVL_IN_OUT", NString.class);


		}
		
		public static void pGetCrn(Ref<NString> pRmsgCdeInOut,Ref<NString> errMsgInOut,Ref<NString> errFlagInOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFUNC.P_GET_CRN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_RMSG_CDE_IN_OUT", pRmsgCdeInOut, true);
			cmd.addParameter("@ERR_MSG_IN_OUT", errMsgInOut, true);
			cmd.addParameter("@ERR_FLAG_IN_OUT", errFlagInOut, true);
				
			cmd.execute();
			pRmsgCdeInOut.val = cmd.getParameterValue("@P_RMSG_CDE_IN_OUT", NString.class);
			errMsgInOut.val = cmd.getParameterValue("@ERR_MSG_IN_OUT", NString.class);
			errFlagInOut.val = cmd.getParameterValue("@ERR_FLAG_IN_OUT", NString.class);


		}
		
//		public static void pGetOpenSections(Ref<List<Soktabs.SfvtsecTabTypeRow>> sameTimeTable,Ref<List<Soktabs.SfvtsecTabTypeRow>> diffTimeTable,Ref<NNumber> sameCntInOut,Ref<NNumber> diffCntInOut,NString termIn,NString crnIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFUNC.P_GET_OPEN_SECTIONS", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("SAME_TIME_TABLE", "", sameTimeTable.val, object.class , true));
//			// cmd.addParameter(DbTypes.getTableType("DIFF_TIME_TABLE", "", diffTimeTable.val, object.class , true));
//			cmd.addParameter("@SAME_CNT_IN_OUT", sameCntInOut, true);
//			cmd.addParameter("@DIFF_CNT_IN_OUT", diffCntInOut, true);
//			cmd.addParameter("@TERM_IN", termIn);
//			cmd.addParameter("@CRN_IN", crnIn);
//				
//			cmd.execute();
//			// sameTimeTable.val = cmd.getTableParameterValue("@SAME_TIME_TABLE", object.class);
//			// diffTimeTable.val = cmd.getTableParameterValue("@DIFF_TIME_TABLE", object.class);
//			sameCntInOut.val = cmd.getParameterValue("@SAME_CNT_IN_OUT", NNumber.class);
//			diffCntInOut.val = cmd.getParameterValue("@DIFF_CNT_IN_OUT", NNumber.class);
//
//
//		}
		
//		public static void pGetRegData(NString termIn,Ref<NString> courseReq,NString begTimeIn,NString endTimeIn,Ref<NNumber> sameCntInOut,Ref<NNumber> diffCntInOut,Ref<List<Soktabs.SfvtsecTabTypeRow>> sfvtsecTable,Ref<NNumber> regCntInOut,Ref<NString> sameSeqInOut,Ref<NString> sameCrnInOut,Ref<NString> diffSeqInOut,Ref<NString> diffCrnInOut) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFUNC.P_GET_REG_DATA", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@TERM_IN", termIn);
//			cmd.addParameter("@COURSE_REQ", courseReq, true);
//			cmd.addParameter("@BEG_TIME_IN", begTimeIn);
//			cmd.addParameter("@END_TIME_IN", endTimeIn);
//			cmd.addParameter("@SAME_CNT_IN_OUT", sameCntInOut, true);
//			cmd.addParameter("@DIFF_CNT_IN_OUT", diffCntInOut, true);
//			// cmd.addParameter(DbTypes.getTableType("SFVTSEC_TABLE", "", sfvtsecTable.val, object.class , true));
//			cmd.addParameter("@REG_CNT_IN_OUT", regCntInOut, true);
//			cmd.addParameter("@SAME_SEQ_IN_OUT", sameSeqInOut, true);
//			cmd.addParameter("@SAME_CRN_IN_OUT", sameCrnInOut, true);
//			cmd.addParameter("@DIFF_SEQ_IN_OUT", diffSeqInOut, true);
//			cmd.addParameter("@DIFF_CRN_IN_OUT", diffCrnInOut, true);
//				
//			cmd.execute();
//			courseReq.val = cmd.getParameterValue("@COURSE_REQ", NString.class);
//			sameCntInOut.val = cmd.getParameterValue("@SAME_CNT_IN_OUT", NNumber.class);
//			diffCntInOut.val = cmd.getParameterValue("@DIFF_CNT_IN_OUT", NNumber.class);
//			// sfvtsecTable.val = cmd.getTableParameterValue("@SFVTSEC_TABLE", object.class);
//			regCntInOut.val = cmd.getParameterValue("@REG_CNT_IN_OUT", NNumber.class);
//			sameSeqInOut.val = cmd.getParameterValue("@SAME_SEQ_IN_OUT", NString.class);
//			sameCrnInOut.val = cmd.getParameterValue("@SAME_CRN_IN_OUT", NString.class);
//			diffSeqInOut.val = cmd.getParameterValue("@DIFF_SEQ_IN_OUT", NString.class);
//			diffCrnInOut.val = cmd.getParameterValue("@DIFF_CRN_IN_OUT", NString.class);
//
//
//		}
		
		public static void pGetRepeatData(Ref<NNumber> sumRepeatHoursInOut,Ref<NNumber> countRepeatHoursInOut,NString sectSubjCodeIn,NString sectCrseNumbIn,NString stcrLevlCodeIn,NString termIn,NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFUNC.P_GET_REPEAT_DATA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SUM_REPEAT_HOURS_IN_OUT", sumRepeatHoursInOut, true);
			cmd.addParameter("@COUNT_REPEAT_HOURS_IN_OUT", countRepeatHoursInOut, true);
			cmd.addParameter("@SECT_SUBJ_CODE_IN", sectSubjCodeIn);
			cmd.addParameter("@SECT_CRSE_NUMB_IN", sectCrseNumbIn);
			cmd.addParameter("@STCR_LEVL_CODE_IN", stcrLevlCodeIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();
			sumRepeatHoursInOut.val = cmd.getParameterValue("@SUM_REPEAT_HOURS_IN_OUT", NNumber.class);
			countRepeatHoursInOut.val = cmd.getParameterValue("@COUNT_REPEAT_HOURS_IN_OUT", NNumber.class);


		}
		
//		public static void pGetSfvstumData(NNumber pidmIn,NString termIn,Ref<List<Soktabs.SfvstumTabTypeRow>> sfvstumTable,Ref<List<Soktabs.StvlevlTabTypeRow>> stvlevlTable,Ref<List<Soktabs.SfrstcrTabTypeRow>> sfrstcrTable,Ref<List<Soktabs.StvgmodTabTypeRow>> stvgmodTable,Ref<List<Soktabs.StvrstsTabTypeRow>> stvrstsTable,Ref<List<Soktabs.StvsubjTabTypeRow>> stvsubjTable,Ref<List<Soktabs.SfvstumTabTypeRow>> sfvstum2Table,Ref<List<Soktabs.StvrstsTabTypeRow>> stvrsts2Table,Ref<List<Soktabs.StvsubjTabTypeRow>> stvsubj2Table,Ref<NNumber> recCnt,Ref<NNumber> recCnt2) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFUNC.P_GET_SFVSTUM_DATA", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@PIDM_IN", pidmIn);
//			cmd.addParameter("@TERM_IN", termIn);
//			// cmd.addParameter(DbTypes.getTableType("SFVSTUM_TABLE", "", sfvstumTable.val, object.class , true));
//			// cmd.addParameter(DbTypes.getTableType("STVLEVL_TABLE", "", stvlevlTable.val, object.class , true));
//			// cmd.addParameter(DbTypes.getTableType("SFRSTCR_TABLE", "", sfrstcrTable.val, object.class , true));
//			// cmd.addParameter(DbTypes.getTableType("STVGMOD_TABLE", "", stvgmodTable.val, object.class , true));
//			// cmd.addParameter(DbTypes.getTableType("STVRSTS_TABLE", "", stvrstsTable.val, object.class , true));
//			// cmd.addParameter(DbTypes.getTableType("STVSUBJ_TABLE", "", stvsubjTable.val, object.class , true));
//			// cmd.addParameter(DbTypes.getTableType("SFVSTUM2_TABLE", "", sfvstum2Table.val, object.class , true));
//			// cmd.addParameter(DbTypes.getTableType("STVRSTS2_TABLE", "", stvrsts2Table.val, object.class , true));
//			// cmd.addParameter(DbTypes.getTableType("STVSUBJ2_TABLE", "", stvsubj2Table.val, object.class , true));
//			cmd.addParameter("@REC_CNT", recCnt, true);
//			cmd.addParameter("@REC_CNT2", recCnt2, true);
//				
//			cmd.execute();
//			// sfvstumTable.val = cmd.getTableParameterValue("@SFVSTUM_TABLE", object.class);
//			// stvlevlTable.val = cmd.getTableParameterValue("@STVLEVL_TABLE", object.class);
//			// sfrstcrTable.val = cmd.getTableParameterValue("@SFRSTCR_TABLE", object.class);
//			// stvgmodTable.val = cmd.getTableParameterValue("@STVGMOD_TABLE", object.class);
//			// stvrstsTable.val = cmd.getTableParameterValue("@STVRSTS_TABLE", object.class);
//			// stvsubjTable.val = cmd.getTableParameterValue("@STVSUBJ_TABLE", object.class);
//			// sfvstum2Table.val = cmd.getTableParameterValue("@SFVSTUM2_TABLE", object.class);
//			// stvrsts2Table.val = cmd.getTableParameterValue("@STVRSTS2_TABLE", object.class);
//			// stvsubj2Table.val = cmd.getTableParameterValue("@STVSUBJ2_TABLE", object.class);
//			recCnt.val = cmd.getParameterValue("@REC_CNT", NNumber.class);
//			recCnt2.val = cmd.getParameterValue("@REC_CNT2", NNumber.class);
//
//
//		}
		
//		public static void pGetSfvtsecRec(Ref<List<Soktabs.SfvtsecTabTypeRow>> sfvtsecTable,Ref<List<Soktabs.StvsstsTabTypeRow>> stvsstsTable,Ref<List<Soktabs.StvsubjTabTypeRow>> stvsubjTable,Ref<List<Soktabs.SsrmeetTabTypeRow>> ssrmeetTable,Ref<NNumber> rowCount,NString courseReq,NString termIn,Ref<NString> crnInOut,Ref<NString> testTimeIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFUNC.P_GET_SFVTSEC_REC", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("SFVTSEC_TABLE", "", sfvtsecTable.val, object.class , true));
//			// cmd.addParameter(DbTypes.getTableType("STVSSTS_TABLE", "", stvsstsTable.val, object.class , true));
//			// cmd.addParameter(DbTypes.getTableType("STVSUBJ_TABLE", "", stvsubjTable.val, object.class , true));
//			// cmd.addParameter(DbTypes.getTableType("SSRMEET_TABLE", "", ssrmeetTable.val, object.class , true));
//			cmd.addParameter("@ROW_COUNT", rowCount, true);
//			cmd.addParameter("@COURSE_REQ", courseReq);
//			cmd.addParameter("@TERM_IN", termIn);
//			cmd.addParameter("@CRN_IN_OUT", crnInOut, true);
//			cmd.addParameter("@TEST_TIME_IN", testTimeIn, true);
//				
//			cmd.execute();
//			// sfvtsecTable.val = cmd.getTableParameterValue("@SFVTSEC_TABLE", object.class);
//			// stvsstsTable.val = cmd.getTableParameterValue("@STVSSTS_TABLE", object.class);
//			// stvsubjTable.val = cmd.getTableParameterValue("@STVSUBJ_TABLE", object.class);
//			// ssrmeetTable.val = cmd.getTableParameterValue("@SSRMEET_TABLE", object.class);
//			rowCount.val = cmd.getParameterValue("@ROW_COUNT", NNumber.class);
//			crnInOut.val = cmd.getParameterValue("@CRN_IN_OUT", NString.class);
//			testTimeIn.val = cmd.getParameterValue("@TEST_TIME_IN", NString.class);
//
//
//		}
//		
//		public static void pGetSsrmeetRecs(Ref<List<Soktabs.Ssrmeet2TabTypeRow>> ssrmeetTable,Ref<NNumber> numRecsInOut,NString termIn,NString crnIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFUNC.P_GET_SSRMEET_RECS", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("SSRMEET_TABLE", "", ssrmeetTable.val, object.class , true));
//			cmd.addParameter("@NUM_RECS_IN_OUT", numRecsInOut, true);
//			cmd.addParameter("@TERM_IN", termIn);
//			cmd.addParameter("@CRN_IN", crnIn);
//				
//			cmd.execute();
//			// ssrmeetTable.val = cmd.getTableParameterValue("@SSRMEET_TABLE", object.class);
//			numRecsInOut.val = cmd.getParameterValue("@NUM_RECS_IN_OUT", NNumber.class);
//
//
//		}
		
		public static void pProcessSfrareg() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFUNC.P_PROCESS_SFRAREG", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pValidateRstsByDate(NString pRstsCode,NDate pRstsDate,NString pTermCode,NString pPtrmCode,NString pCrn,NString pDuntCode,NDate pStartDate,NDate pCompletionDate,Ref<NString> pErrOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFUNC.P_VALIDATE_RSTS_BY_DATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_RSTS_CODE", pRstsCode);
			cmd.addParameter("@P_RSTS_DATE", pRstsDate);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PTRM_CODE", pPtrmCode);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_DUNT_CODE", pDuntCode);
			cmd.addParameter("@P_START_DATE", pStartDate);
			cmd.addParameter("@P_COMPLETION_DATE", pCompletionDate);
			cmd.addParameter("@P_ERR_OUT", NString.class);
				
			cmd.execute();
			pErrOut.val = cmd.getParameterValue("@P_ERR_OUT", NString.class);


		}
		
	
	
	
}
