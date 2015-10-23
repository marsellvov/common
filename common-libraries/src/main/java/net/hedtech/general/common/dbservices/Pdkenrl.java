package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Pdkenrl {
		public static NString fBenefitGroupMet(NString pEnrollmentType,NNumber pPidm,NString pBcatCode,NString pBenefitGroup,NDate pBenefitDate,NString pBreaCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PDKENRL.F_BENEFIT_GROUP_MET", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ENROLLMENT_TYPE", pEnrollmentType);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BCAT_CODE", pBcatCode);
			cmd.addParameter("@P_BENEFIT_GROUP", pBenefitGroup);
			cmd.addParameter("@P_BENEFIT_DATE", pBenefitDate);
			cmd.addParameter("@P_BREA_CODE", pBreaCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fBenefitGroupsRc(NString pEnrollmentType,NDate pEnrollmentDate,NString pBcatCode,NString pBreaCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PDKENRL.F_BENEFIT_GROUPS_RC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ENROLLMENT_TYPE", pEnrollmentType);
			cmd.addParameter("@P_ENROLLMENT_DATE", pEnrollmentDate);
			cmd.addParameter("@P_BCAT_CODE", pBcatCode);
			cmd.addParameter("@P_BREA_CODE", pBreaCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static NString fBenefitsApplied(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PDKENRL.F_BENEFITS_APPLIED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fBenefitsConfirmed(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PDKENRL.F_BENEFITS_CONFIRMED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NDate fCalcBenefitEffdt(NNumber pPidm,NString pBdcaCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PDKENRL.F_CALC_BENEFIT_EFFDT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
		public static NDate fCalcBenefitEffdtLec(NNumber pPidm,NString pBreaCode,NDate pEventDate,NString pBenefitGroup,NString pBdcaCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PDKENRL.F_CALC_BENEFIT_EFFDT_LEC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BREA_CODE", pBreaCode);
			cmd.addParameter("@P_EVENT_DATE", pEventDate);
			cmd.addParameter("@P_BENEFIT_GROUP", pBenefitGroup);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
		public static NBool fDednhasplan(NString inRule) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PDKENRL.F_DEDNHASPLAN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@IN_RULE", inRule);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NDate fEnrlBeginDate(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PDKENRL.F_ENRL_BEGIN_DATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
		public static NDate fEnrlEndDate(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PDKENRL.F_ENRL_END_DATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
		public static NString fFindFirstGroup(NString pEnrollmentType,NDate pEnrollmentDate,NString pBcatCode,NString pBreaCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PDKENRL.F_FIND_FIRST_GROUP", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ENROLLMENT_TYPE", pEnrollmentType);
			cmd.addParameter("@P_ENROLLMENT_DATE", pEnrollmentDate);
			cmd.addParameter("@P_BCAT_CODE", pBcatCode);
			cmd.addParameter("@P_BREA_CODE", pBreaCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fFindNextGroup(NString pEnrollmentType,NDate pEnrollmentDate,NNumber pPidm,NString pBcatCode,NString pCurrentGroup,NString pBreaCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PDKENRL.F_FIND_NEXT_GROUP", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ENROLLMENT_TYPE", pEnrollmentType);
			cmd.addParameter("@P_ENROLLMENT_DATE", pEnrollmentDate);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BCAT_CODE", pBcatCode);
			cmd.addParameter("@P_CURRENT_GROUP", pCurrentGroup);
			cmd.addParameter("@P_BREA_CODE", pBreaCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetdedngroup(NString inDedn,NString inBreaCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PDKENRL.F_GETDEDNGROUP", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@IN_DEDN", inDedn);
			cmd.addParameter("@IN_BREA_CODE", inBreaCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetdedngroupLec(NString inDedn,NString inBreaCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PDKENRL.F_GETDEDNGROUP_LEC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@IN_DEDN", inDedn);
			cmd.addParameter("@IN_BREA_CODE", inBreaCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fGroupEnrlDeductionsRc(NNumber pEmpPidm,NString pEnrollmentType,NString pBcatCode,NString pBenefitGroup,NString pBreaCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PDKENRL.F_GROUP_ENRL_DEDUCTIONS_RC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_EMP_PIDM", pEmpPidm);
			cmd.addParameter("@P_ENROLLMENT_TYPE", pEnrollmentType);
			cmd.addParameter("@P_BCAT_CODE", pBcatCode);
			cmd.addParameter("@P_BENEFIT_GROUP", pBenefitGroup);
			cmd.addParameter("@P_BREA_CODE", pBreaCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static NString fIsEnrlPeriodOpen(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PDKENRL.F_IS_ENRL_PERIOD_OPEN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIscvgorbenAllowed(NString pEditType,NString pBdca,NString pPlan,NDate pEffDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PDKENRL.F_ISCVGORBEN_ALLOWED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_EDIT_TYPE", pEditType);
			cmd.addParameter("@P_BDCA", pBdca);
			cmd.addParameter("@P_PLAN", pPlan);
			cmd.addParameter("@P_EFF_DATE", pEffDate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fOpenEnrlDedncvgallocsumRc(NString pEnrollmentType,NNumber pEmpPidm,NString pBreaCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PDKENRL.F_OPEN_ENRL_DEDNCVGALLOCSUM_RC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ENROLLMENT_TYPE", pEnrollmentType);
			cmd.addParameter("@P_EMP_PIDM", pEmpPidm);
			cmd.addParameter("@P_BREA_CODE", pBreaCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fOpenEnrlGroupsRc(NString pEnrollmentType,NNumber pEmpPidm,NString pBcatCode,NString pBreaCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PDKENRL.F_OPEN_ENRL_GROUPS_RC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ENROLLMENT_TYPE", pEnrollmentType);
			cmd.addParameter("@P_EMP_PIDM", pEmpPidm);
			cmd.addParameter("@P_BCAT_CODE", pBcatCode);
			cmd.addParameter("@P_BREA_CODE", pBreaCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static NString fPendingOe(NNumber pEmpPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PDKENRL.F_PENDING_OE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_EMP_PIDM", pEmpPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fValidDeductionsRc(NString pEnrollmentType,NDate pEnrollmentDate,NString pBcatCode,NString pBenefitGroup,NString pBreaCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PDKENRL.F_VALID_DEDUCTIONS_RC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ENROLLMENT_TYPE", pEnrollmentType);
			cmd.addParameter("@P_ENROLLMENT_DATE", pEnrollmentDate);
			cmd.addParameter("@P_BCAT_CODE", pBcatCode);
			cmd.addParameter("@P_BENEFIT_GROUP", pBenefitGroup);
			cmd.addParameter("@P_BREA_CODE", pBreaCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pChkWaivedDeduction(NNumber pidmIn,NString bdcaIn,NDate effDateIn,NString dednDescIn,Ref<NString> mesgInOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PDKENRL.P_CHK_WAIVED_DEDUCTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@BDCA_IN", bdcaIn);
			cmd.addParameter("@EFF_DATE_IN", effDateIn);
			cmd.addParameter("@DEDN_DESC_IN", dednDescIn);
			cmd.addParameter("@MESG_IN_OUT", mesgInOut, true);
				
			cmd.execute();
			mesgInOut.val = cmd.getParameterValue("@MESG_IN_OUT", NString.class);


		}
		
		public static void pGetActiveEmails(NNumber pPidm,NString pEmailHierarchy,Ref<NString> pEmailAddress,Ref<NString> pUrlInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PDKENRL.P_GET_ACTIVE_EMAILS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_EMAIL_HIERARCHY", pEmailHierarchy);
			cmd.addParameter("@P_EMAIL_ADDRESS", NString.class);
			cmd.addParameter("@P_URL_IND", NString.class);
				
			cmd.execute();
			pEmailAddress.val = cmd.getParameterValue("@P_EMAIL_ADDRESS", NString.class);
			pUrlInd.val = cmd.getParameterValue("@P_URL_IND", NString.class);


		}
		
		public static void pLifeEventChgExists(NNumber pPidm,Ref<NString> pBreaCodeOut,Ref<NDate> pEventDateOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PDKENRL.P_LIFE_EVENT_CHG_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BREA_CODE_OUT", pBreaCodeOut, true);
			cmd.addParameter("@P_EVENT_DATE_OUT", pEventDateOut, true);
				
			cmd.execute();
			pBreaCodeOut.val = cmd.getParameterValue("@P_BREA_CODE_OUT", NString.class);
			pEventDateOut.val = cmd.getParameterValue("@P_EVENT_DATE_OUT", NDate.class);


		}
		
		public static void pPendingApply(NNumber pPidm,Ref<NString> pPendingApplyOut,Ref<NString> pBreaCodeOut,Ref<NDate> pEventDateOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PDKENRL.P_PENDING_APPLY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PENDING_APPLY_OUT", pPendingApplyOut, true);
			cmd.addParameter("@P_BREA_CODE_OUT", pBreaCodeOut, true);
			cmd.addParameter("@P_EVENT_DATE_OUT", pEventDateOut, true);
				
			cmd.execute();
			pPendingApplyOut.val = cmd.getParameterValue("@P_PENDING_APPLY_OUT", NString.class);
			pBreaCodeOut.val = cmd.getParameterValue("@P_BREA_CODE_OUT", NString.class);
			pEventDateOut.val = cmd.getParameterValue("@P_EVENT_DATE_OUT", NDate.class);


		}
		
		public static void pPrecludedByOthers(NNumber pPidm,NString pBdca,NDate pEffDate,Ref<NString> pPrecludeMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PDKENRL.P_PRECLUDED_BY_OTHERS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BDCA", pBdca);
			cmd.addParameter("@P_EFF_DATE", pEffDate);
			cmd.addParameter("@P_PRECLUDE_MSG_OUT", pPrecludeMsgOut, true);
				
			cmd.execute();
			pPrecludeMsgOut.val = cmd.getParameterValue("@P_PRECLUDE_MSG_OUT", NString.class);


		}
		
		public static void pPreclusionExists(NNumber pPidm,NString pBdca,NDate pEffDate,Ref<NString> pFoundPrecludesOut,Ref<NString> pPrecludeMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PDKENRL.P_PRECLUSION_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BDCA", pBdca);
			cmd.addParameter("@P_EFF_DATE", pEffDate);
			cmd.addParameter("@P_FOUND_PRECLUDES_OUT", pFoundPrecludesOut, true);
			cmd.addParameter("@P_PRECLUDE_MSG_OUT", pPrecludeMsgOut, true);
				
			cmd.execute();
			pFoundPrecludesOut.val = cmd.getParameterValue("@P_FOUND_PRECLUDES_OUT", NString.class);
			pPrecludeMsgOut.val = cmd.getParameterValue("@P_PRECLUDE_MSG_OUT", NString.class);


		}
		
	
	
	
}
