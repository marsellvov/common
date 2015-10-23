package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbPescxmlCourseExp {
		public static DataCursor fSelectInProgressCourses(NNumber pPidmIn,NString pLevlCodeIn,NString pTermCodeIn,NString pCampusSelIn,NString pCampCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESCXML_COURSE_EXP.F_SELECT_IN_PROGRESS_COURSES", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM_IN", pPidmIn);
			cmd.addParameter("@P_LEVL_CODE_IN", pLevlCodeIn);
			cmd.addParameter("@P_TERM_CODE_IN", pTermCodeIn);
			cmd.addParameter("@P_CAMPUS_SEL_IN", pCampusSelIn);
			cmd.addParameter("@P_CAMP_CODE_IN", pCampCodeIn);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fSelectInstCourses(NNumber pPidmIn,NString pLevlCodeIn,NString pTermCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESCXML_COURSE_EXP.F_SELECT_INST_COURSES", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM_IN", pPidmIn);
			cmd.addParameter("@P_LEVL_CODE_IN", pLevlCodeIn);
			cmd.addParameter("@P_TERM_CODE_IN", pTermCodeIn);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fSelectTransCourses(NNumber pPidmIn,NString pLevlCodeIn,NNumber pTritSeqNoIn,NNumber pTramSeqNoIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESCXML_COURSE_EXP.F_SELECT_TRANS_COURSES", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM_IN", pPidmIn);
			cmd.addParameter("@P_LEVL_CODE_IN", pLevlCodeIn);
			cmd.addParameter("@P_TRIT_SEQ_NO_IN", pTritSeqNoIn);
			cmd.addParameter("@P_TRAM_SEQ_NO_IN", pTramSeqNoIn);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pAcrecInProgCourseElement(NNumber pRequestPidmIn,NString pInProgTermIn,NString pCrnIn,NString pSubjCodeIn,NString pCrseNumbIn,NString pTprtCodeIn,Ref<NString> pCoursecreditbasisOut,Ref<NString> pCoursecreditunitsOut,Ref<NString> pCoursecreditlevelOut,Ref<NNumber> pCoursecreditvalueOut,Ref<NNumber> pCoursecreditearnedOut,Ref<NString> pCourseacadgradescalecodeOut,Ref<NString> pCourseacademicgradeOut,Ref<NString> pCoursenarrexplangradeOut,Ref<NString> pCourserepeatcodeOut,Ref<NString> pCoursecodeTypeOut,Ref<NString> pCoursecodeValueOut,Ref<NNumber> pCoursequalityptsearnedOut,Ref<NString> pCourselevelOut,Ref<NString> pCoursesubjectabbrOut,Ref<NString> pCoursenumberOut,Ref<NString> pCoursesectionnumberOut,Ref<NString> pOriginalcourseidOut,Ref<NString> pCoursetitleOut,Ref<NString> pCourseadddateOut,Ref<NString> pCoursedropdateOut,Ref<NString> pCourseoverrideschoolOut,Ref<NString> pOverrideschoolcoursenumbOut,Ref<NString> pCourseapplicabilityOut,Ref<NString> pCoursebegindateOut,Ref<NString> pCourseenddateOut,Ref<NString> pCourseinstructsiteOut,Ref<NString> pCourseinstructsitenameOut,Ref<DataCursor> pRequirementRefcsrOut,Ref<DataCursor> pAttributeRefcsrOut,Ref<DataCursor> pProficiencyRefcsrOut,Ref<DataCursor> pLicensureRefcsrOut,Ref<DataCursor> pLangOfInstructionOut,Ref<NString> pCrseNotemessageOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESCXML_COURSE_EXP.P_ACREC_IN_PROG_COURSE_ELEMENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_REQUEST_PIDM_IN", pRequestPidmIn);
			cmd.addParameter("@P_IN_PROG_TERM_IN", pInProgTermIn);
			cmd.addParameter("@P_CRN_IN", pCrnIn);
			cmd.addParameter("@P_SUBJ_CODE_IN", pSubjCodeIn);
			cmd.addParameter("@P_CRSE_NUMB_IN", pCrseNumbIn);
			cmd.addParameter("@P_TPRT_CODE_IN", pTprtCodeIn);
			cmd.addParameter("@P_COURSECREDITBASIS_OUT", NString.class);
			cmd.addParameter("@P_COURSECREDITUNITS_OUT", NString.class);
			cmd.addParameter("@P_COURSECREDITLEVEL_OUT", NString.class);
			cmd.addParameter("@P_COURSECREDITVALUE_OUT", NNumber.class);
			cmd.addParameter("@P_COURSECREDITEARNED_OUT", NNumber.class);
			cmd.addParameter("@P_COURSEACADGRADESCALECODE_OUT", NString.class);
			cmd.addParameter("@P_COURSEACADEMICGRADE_OUT", NString.class);
			cmd.addParameter("@P_COURSENARREXPLANGRADE_OUT", NString.class);
			cmd.addParameter("@P_COURSEREPEATCODE_OUT", NString.class);
			cmd.addParameter("@P_COURSECODE_TYPE_OUT", NString.class);
			cmd.addParameter("@P_COURSECODE_VALUE_OUT", NString.class);
			cmd.addParameter("@P_COURSEQUALITYPTSEARNED_OUT", NNumber.class);
			cmd.addParameter("@P_COURSELEVEL_OUT", NString.class);
			cmd.addParameter("@P_COURSESUBJECTABBR_OUT", NString.class);
			cmd.addParameter("@P_COURSENUMBER_OUT", NString.class);
			cmd.addParameter("@P_COURSESECTIONNUMBER_OUT", NString.class);
			cmd.addParameter("@P_ORIGINALCOURSEID_OUT", NString.class);
			cmd.addParameter("@P_COURSETITLE_OUT", NString.class);
			cmd.addParameter("@P_COURSEADDDATE_OUT", NString.class);
			cmd.addParameter("@P_COURSEDROPDATE_OUT", NString.class);
			cmd.addParameter("@P_COURSEOVERRIDESCHOOL_OUT", NString.class);
			cmd.addParameter("@P_OVERRIDESCHOOLCOURSENUMB_OUT", NString.class);
			cmd.addParameter("@P_COURSEAPPLICABILITY_OUT", NString.class);
			cmd.addParameter("@P_COURSEBEGINDATE_OUT", NString.class);
			cmd.addParameter("@P_COURSEENDDATE_OUT", NString.class);
			cmd.addParameter("@P_COURSEINSTRUCTSITE_OUT", NString.class);
			cmd.addParameter("@P_COURSEINSTRUCTSITENAME_OUT", NString.class);
			cmd.addParameter("@P_REQUIREMENT_REFCSR_OUT", DataCursor.class);
			cmd.addParameter("@P_ATTRIBUTE_REFCSR_OUT", DataCursor.class);
			cmd.addParameter("@P_PROFICIENCY_REFCSR_OUT", DataCursor.class);
			cmd.addParameter("@P_LICENSURE_REFCSR_OUT", DataCursor.class);
			cmd.addParameter("@P_LANG_OF_INSTRUCTION_OUT", DataCursor.class);
			cmd.addParameter("@P_CRSE_NOTEMESSAGE_OUT", NString.class);
				
			cmd.execute();
			pCoursecreditbasisOut.val = cmd.getParameterValue("@P_COURSECREDITBASIS_OUT", NString.class);
			pCoursecreditunitsOut.val = cmd.getParameterValue("@P_COURSECREDITUNITS_OUT", NString.class);
			pCoursecreditlevelOut.val = cmd.getParameterValue("@P_COURSECREDITLEVEL_OUT", NString.class);
			pCoursecreditvalueOut.val = cmd.getParameterValue("@P_COURSECREDITVALUE_OUT", NNumber.class);
			pCoursecreditearnedOut.val = cmd.getParameterValue("@P_COURSECREDITEARNED_OUT", NNumber.class);
			pCourseacadgradescalecodeOut.val = cmd.getParameterValue("@P_COURSEACADGRADESCALECODE_OUT", NString.class);
			pCourseacademicgradeOut.val = cmd.getParameterValue("@P_COURSEACADEMICGRADE_OUT", NString.class);
			pCoursenarrexplangradeOut.val = cmd.getParameterValue("@P_COURSENARREXPLANGRADE_OUT", NString.class);
			pCourserepeatcodeOut.val = cmd.getParameterValue("@P_COURSEREPEATCODE_OUT", NString.class);
			pCoursecodeTypeOut.val = cmd.getParameterValue("@P_COURSECODE_TYPE_OUT", NString.class);
			pCoursecodeValueOut.val = cmd.getParameterValue("@P_COURSECODE_VALUE_OUT", NString.class);
			pCoursequalityptsearnedOut.val = cmd.getParameterValue("@P_COURSEQUALITYPTSEARNED_OUT", NNumber.class);
			pCourselevelOut.val = cmd.getParameterValue("@P_COURSELEVEL_OUT", NString.class);
			pCoursesubjectabbrOut.val = cmd.getParameterValue("@P_COURSESUBJECTABBR_OUT", NString.class);
			pCoursenumberOut.val = cmd.getParameterValue("@P_COURSENUMBER_OUT", NString.class);
			pCoursesectionnumberOut.val = cmd.getParameterValue("@P_COURSESECTIONNUMBER_OUT", NString.class);
			pOriginalcourseidOut.val = cmd.getParameterValue("@P_ORIGINALCOURSEID_OUT", NString.class);
			pCoursetitleOut.val = cmd.getParameterValue("@P_COURSETITLE_OUT", NString.class);
			pCourseadddateOut.val = cmd.getParameterValue("@P_COURSEADDDATE_OUT", NString.class);
			pCoursedropdateOut.val = cmd.getParameterValue("@P_COURSEDROPDATE_OUT", NString.class);
			pCourseoverrideschoolOut.val = cmd.getParameterValue("@P_COURSEOVERRIDESCHOOL_OUT", NString.class);
			pOverrideschoolcoursenumbOut.val = cmd.getParameterValue("@P_OVERRIDESCHOOLCOURSENUMB_OUT", NString.class);
			pCourseapplicabilityOut.val = cmd.getParameterValue("@P_COURSEAPPLICABILITY_OUT", NString.class);
			pCoursebegindateOut.val = cmd.getParameterValue("@P_COURSEBEGINDATE_OUT", NString.class);
			pCourseenddateOut.val = cmd.getParameterValue("@P_COURSEENDDATE_OUT", NString.class);
			pCourseinstructsiteOut.val = cmd.getParameterValue("@P_COURSEINSTRUCTSITE_OUT", NString.class);
			pCourseinstructsitenameOut.val = cmd.getParameterValue("@P_COURSEINSTRUCTSITENAME_OUT", NString.class);
			pRequirementRefcsrOut.val = cmd.getParameterValue("@P_REQUIREMENT_REFCSR_OUT", DataCursor.class);
			pAttributeRefcsrOut.val = cmd.getParameterValue("@P_ATTRIBUTE_REFCSR_OUT", DataCursor.class);
			pProficiencyRefcsrOut.val = cmd.getParameterValue("@P_PROFICIENCY_REFCSR_OUT", DataCursor.class);
			pLicensureRefcsrOut.val = cmd.getParameterValue("@P_LICENSURE_REFCSR_OUT", DataCursor.class);
			pLangOfInstructionOut.val = cmd.getParameterValue("@P_LANG_OF_INSTRUCTION_OUT", DataCursor.class);
			pCrseNotemessageOut.val = cmd.getParameterValue("@P_CRSE_NOTEMESSAGE_OUT", NString.class);


		}
		
		public static void pAcrecInstCourseElement(NNumber pRequestPidmIn,NNumber pRequestSeqNoIn,NString pRequestUserIn,NString pSessionTermIn,NString pRequestLevlIn,NString pRequestSbgiCodeIn,NString pTprtCodeIn,NNumber pTcknSeqNoIn,NString pCrnIn,NString pSubjCodeIn,NString pCrseNumbIn,Ref<NString> pCoursecreditbasisOut,Ref<NString> pCoursecreditunitsOut,Ref<NString> pCoursecreditlevelOut,Ref<NNumber> pCoursecreditvalueOut,Ref<NNumber> pCoursecreditearnedOut,Ref<NString> pCourseacadgradescalecodeOut,Ref<NString> pCourseacademicgradeOut,Ref<NString> pCoursenarrexplangradeOut,Ref<NString> pCourserepeatcodeOut,Ref<NString> pCoursecodeTypeOut,Ref<NString> pCoursecodeValueOut,Ref<NNumber> pCoursequalityptsearnedOut,Ref<NString> pCourselevelOut,Ref<NString> pCoursesubjectabbrOut,Ref<NString> pCoursenumberOut,Ref<NString> pCoursesectionnumberOut,Ref<NString> pOriginalcourseidOut,Ref<NString> pCoursetitleOut,Ref<NString> pCourseadddateOut,Ref<NString> pCoursedropdateOut,Ref<NString> pCourseoverrideschoolOut,Ref<NString> pOverrideschoolcoursenumbOut,Ref<NString> pCourseapplicabilityOut,Ref<NString> pCoursebegindateOut,Ref<NString> pCourseenddateOut,Ref<NString> pCourseinstructsiteOut,Ref<NString> pCourseinstructsitenameOut,Ref<DataCursor> pRequirementRefcsrOut,Ref<DataCursor> pAttributeRefcsrOut,Ref<DataCursor> pProficiencyRefcsrOut,Ref<DataCursor> pLicensureRefcsrOut,Ref<DataCursor> pLangOfInstructionOut,Ref<NString> pCrseNotemessageOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESCXML_COURSE_EXP.P_ACREC_INST_COURSE_ELEMENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_REQUEST_PIDM_IN", pRequestPidmIn);
			cmd.addParameter("@P_REQUEST_SEQ_NO_IN", pRequestSeqNoIn);
			cmd.addParameter("@P_REQUEST_USER_IN", pRequestUserIn);
			cmd.addParameter("@P_SESSION_TERM_IN", pSessionTermIn);
			cmd.addParameter("@P_REQUEST_LEVL_IN", pRequestLevlIn);
			cmd.addParameter("@P_REQUEST_SBGI_CODE_IN", pRequestSbgiCodeIn);
			cmd.addParameter("@P_TPRT_CODE_IN", pTprtCodeIn);
			cmd.addParameter("@P_TCKN_SEQ_NO_IN", pTcknSeqNoIn);
			cmd.addParameter("@P_CRN_IN", pCrnIn);
			cmd.addParameter("@P_SUBJ_CODE_IN", pSubjCodeIn);
			cmd.addParameter("@P_CRSE_NUMB_IN", pCrseNumbIn);
			cmd.addParameter("@P_COURSECREDITBASIS_OUT", NString.class);
			cmd.addParameter("@P_COURSECREDITUNITS_OUT", NString.class);
			cmd.addParameter("@P_COURSECREDITLEVEL_OUT", NString.class);
			cmd.addParameter("@P_COURSECREDITVALUE_OUT", NNumber.class);
			cmd.addParameter("@P_COURSECREDITEARNED_OUT", NNumber.class);
			cmd.addParameter("@P_COURSEACADGRADESCALECODE_OUT", NString.class);
			cmd.addParameter("@P_COURSEACADEMICGRADE_OUT", NString.class);
			cmd.addParameter("@P_COURSENARREXPLANGRADE_OUT", NString.class);
			cmd.addParameter("@P_COURSEREPEATCODE_OUT", NString.class);
			cmd.addParameter("@P_COURSECODE_TYPE_OUT", NString.class);
			cmd.addParameter("@P_COURSECODE_VALUE_OUT", NString.class);
			cmd.addParameter("@P_COURSEQUALITYPTSEARNED_OUT", NNumber.class);
			cmd.addParameter("@P_COURSELEVEL_OUT", NString.class);
			cmd.addParameter("@P_COURSESUBJECTABBR_OUT", NString.class);
			cmd.addParameter("@P_COURSENUMBER_OUT", NString.class);
			cmd.addParameter("@P_COURSESECTIONNUMBER_OUT", NString.class);
			cmd.addParameter("@P_ORIGINALCOURSEID_OUT", NString.class);
			cmd.addParameter("@P_COURSETITLE_OUT", NString.class);
			cmd.addParameter("@P_COURSEADDDATE_OUT", NString.class);
			cmd.addParameter("@P_COURSEDROPDATE_OUT", NString.class);
			cmd.addParameter("@P_COURSEOVERRIDESCHOOL_OUT", NString.class);
			cmd.addParameter("@P_OVERRIDESCHOOLCOURSENUMB_OUT", NString.class);
			cmd.addParameter("@P_COURSEAPPLICABILITY_OUT", NString.class);
			cmd.addParameter("@P_COURSEBEGINDATE_OUT", NString.class);
			cmd.addParameter("@P_COURSEENDDATE_OUT", NString.class);
			cmd.addParameter("@P_COURSEINSTRUCTSITE_OUT", NString.class);
			cmd.addParameter("@P_COURSEINSTRUCTSITENAME_OUT", NString.class);
			cmd.addParameter("@P_REQUIREMENT_REFCSR_OUT", DataCursor.class);
			cmd.addParameter("@P_ATTRIBUTE_REFCSR_OUT", DataCursor.class);
			cmd.addParameter("@P_PROFICIENCY_REFCSR_OUT", DataCursor.class);
			cmd.addParameter("@P_LICENSURE_REFCSR_OUT", DataCursor.class);
			cmd.addParameter("@P_LANG_OF_INSTRUCTION_OUT", DataCursor.class);
			cmd.addParameter("@P_CRSE_NOTEMESSAGE_OUT", NString.class);
				
			cmd.execute();
			pCoursecreditbasisOut.val = cmd.getParameterValue("@P_COURSECREDITBASIS_OUT", NString.class);
			pCoursecreditunitsOut.val = cmd.getParameterValue("@P_COURSECREDITUNITS_OUT", NString.class);
			pCoursecreditlevelOut.val = cmd.getParameterValue("@P_COURSECREDITLEVEL_OUT", NString.class);
			pCoursecreditvalueOut.val = cmd.getParameterValue("@P_COURSECREDITVALUE_OUT", NNumber.class);
			pCoursecreditearnedOut.val = cmd.getParameterValue("@P_COURSECREDITEARNED_OUT", NNumber.class);
			pCourseacadgradescalecodeOut.val = cmd.getParameterValue("@P_COURSEACADGRADESCALECODE_OUT", NString.class);
			pCourseacademicgradeOut.val = cmd.getParameterValue("@P_COURSEACADEMICGRADE_OUT", NString.class);
			pCoursenarrexplangradeOut.val = cmd.getParameterValue("@P_COURSENARREXPLANGRADE_OUT", NString.class);
			pCourserepeatcodeOut.val = cmd.getParameterValue("@P_COURSEREPEATCODE_OUT", NString.class);
			pCoursecodeTypeOut.val = cmd.getParameterValue("@P_COURSECODE_TYPE_OUT", NString.class);
			pCoursecodeValueOut.val = cmd.getParameterValue("@P_COURSECODE_VALUE_OUT", NString.class);
			pCoursequalityptsearnedOut.val = cmd.getParameterValue("@P_COURSEQUALITYPTSEARNED_OUT", NNumber.class);
			pCourselevelOut.val = cmd.getParameterValue("@P_COURSELEVEL_OUT", NString.class);
			pCoursesubjectabbrOut.val = cmd.getParameterValue("@P_COURSESUBJECTABBR_OUT", NString.class);
			pCoursenumberOut.val = cmd.getParameterValue("@P_COURSENUMBER_OUT", NString.class);
			pCoursesectionnumberOut.val = cmd.getParameterValue("@P_COURSESECTIONNUMBER_OUT", NString.class);
			pOriginalcourseidOut.val = cmd.getParameterValue("@P_ORIGINALCOURSEID_OUT", NString.class);
			pCoursetitleOut.val = cmd.getParameterValue("@P_COURSETITLE_OUT", NString.class);
			pCourseadddateOut.val = cmd.getParameterValue("@P_COURSEADDDATE_OUT", NString.class);
			pCoursedropdateOut.val = cmd.getParameterValue("@P_COURSEDROPDATE_OUT", NString.class);
			pCourseoverrideschoolOut.val = cmd.getParameterValue("@P_COURSEOVERRIDESCHOOL_OUT", NString.class);
			pOverrideschoolcoursenumbOut.val = cmd.getParameterValue("@P_OVERRIDESCHOOLCOURSENUMB_OUT", NString.class);
			pCourseapplicabilityOut.val = cmd.getParameterValue("@P_COURSEAPPLICABILITY_OUT", NString.class);
			pCoursebegindateOut.val = cmd.getParameterValue("@P_COURSEBEGINDATE_OUT", NString.class);
			pCourseenddateOut.val = cmd.getParameterValue("@P_COURSEENDDATE_OUT", NString.class);
			pCourseinstructsiteOut.val = cmd.getParameterValue("@P_COURSEINSTRUCTSITE_OUT", NString.class);
			pCourseinstructsitenameOut.val = cmd.getParameterValue("@P_COURSEINSTRUCTSITENAME_OUT", NString.class);
			pRequirementRefcsrOut.val = cmd.getParameterValue("@P_REQUIREMENT_REFCSR_OUT", DataCursor.class);
			pAttributeRefcsrOut.val = cmd.getParameterValue("@P_ATTRIBUTE_REFCSR_OUT", DataCursor.class);
			pProficiencyRefcsrOut.val = cmd.getParameterValue("@P_PROFICIENCY_REFCSR_OUT", DataCursor.class);
			pLicensureRefcsrOut.val = cmd.getParameterValue("@P_LICENSURE_REFCSR_OUT", DataCursor.class);
			pLangOfInstructionOut.val = cmd.getParameterValue("@P_LANG_OF_INSTRUCTION_OUT", DataCursor.class);
			pCrseNotemessageOut.val = cmd.getParameterValue("@P_CRSE_NOTEMESSAGE_OUT", NString.class);


		}
		
		public static void pAcrecTransCourseElement(NNumber pRequestPidmIn,NNumber pRequestSeqNoIn,NString pRequestUserIn,NString pSessionTermIn,NString pRequestLevlIn,NString pRequestSbgiCodeIn,NString pRequesttableIn,NNumber pTritSeqNoIn,NNumber pTramSeqNoIn,NNumber pTrcrSeqNoIn,NNumber pTrceSeqNoIn,Ref<NString> pCoursecreditbasisOut,Ref<NString> pCoursecreditunitsOut,Ref<NString> pCoursecreditlevelOut,Ref<NNumber> pCoursecreditvalueOut,Ref<NNumber> pCoursecreditearnedOut,Ref<NString> pCourseacadgradescalecodeOut,Ref<NString> pCourseacademicgradeOut,Ref<NString> pCoursenarrexplangradeOut,Ref<NString> pCourserepeatcodeOut,Ref<NString> pCoursecodeTypeOut,Ref<NString> pCoursecodeValueOut,Ref<NNumber> pCoursequalityptsearnedOut,Ref<NString> pCourselevelOut,Ref<NString> pCoursesubjectabbrOut,Ref<NString> pCoursenumberOut,Ref<NString> pCoursesectionnumberOut,Ref<NString> pOriginalcourseidOut,Ref<NString> pCoursetitleOut,Ref<NString> pCourseadddateOut,Ref<NString> pCoursedropdateOut,Ref<NString> pCourseoverrideschoolOut,Ref<NString> pOverrideschoolcoursenumbOut,Ref<NString> pCourseapplicabilityOut,Ref<NString> pCoursebegindateOut,Ref<NString> pCourseenddateOut,Ref<NString> pCourseinstructsiteOut,Ref<NString> pCourseinstructsitenameOut,Ref<DataCursor> pRequirementRefcsrOut,Ref<DataCursor> pAttributeRefcsrOut,Ref<DataCursor> pProficiencyRefcsrOut,Ref<DataCursor> pLicensureRefcsrOut,Ref<DataCursor> pLangOfInstructionOut,Ref<NString> pCrseNotemessageOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESCXML_COURSE_EXP.P_ACREC_TRANS_COURSE_ELEMENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_REQUEST_PIDM_IN", pRequestPidmIn);
			cmd.addParameter("@P_REQUEST_SEQ_NO_IN", pRequestSeqNoIn);
			cmd.addParameter("@P_REQUEST_USER_IN", pRequestUserIn);
			cmd.addParameter("@P_SESSION_TERM_IN", pSessionTermIn);
			cmd.addParameter("@P_REQUEST_LEVL_IN", pRequestLevlIn);
			cmd.addParameter("@P_REQUEST_SBGI_CODE_IN", pRequestSbgiCodeIn);
			cmd.addParameter("@P_REQUESTTABLE_IN", pRequesttableIn);
			cmd.addParameter("@P_TRIT_SEQ_NO_IN", pTritSeqNoIn);
			cmd.addParameter("@P_TRAM_SEQ_NO_IN", pTramSeqNoIn);
			cmd.addParameter("@P_TRCR_SEQ_NO_IN", pTrcrSeqNoIn);
			cmd.addParameter("@P_TRCE_SEQ_NO_IN", pTrceSeqNoIn);
			cmd.addParameter("@P_COURSECREDITBASIS_OUT", NString.class);
			cmd.addParameter("@P_COURSECREDITUNITS_OUT", NString.class);
			cmd.addParameter("@P_COURSECREDITLEVEL_OUT", NString.class);
			cmd.addParameter("@P_COURSECREDITVALUE_OUT", NNumber.class);
			cmd.addParameter("@P_COURSECREDITEARNED_OUT", NNumber.class);
			cmd.addParameter("@P_COURSEACADGRADESCALECODE_OUT", NString.class);
			cmd.addParameter("@P_COURSEACADEMICGRADE_OUT", NString.class);
			cmd.addParameter("@P_COURSENARREXPLANGRADE_OUT", NString.class);
			cmd.addParameter("@P_COURSEREPEATCODE_OUT", NString.class);
			cmd.addParameter("@P_COURSECODE_TYPE_OUT", NString.class);
			cmd.addParameter("@P_COURSECODE_VALUE_OUT", NString.class);
			cmd.addParameter("@P_COURSEQUALITYPTSEARNED_OUT", NNumber.class);
			cmd.addParameter("@P_COURSELEVEL_OUT", NString.class);
			cmd.addParameter("@P_COURSESUBJECTABBR_OUT", NString.class);
			cmd.addParameter("@P_COURSENUMBER_OUT", NString.class);
			cmd.addParameter("@P_COURSESECTIONNUMBER_OUT", NString.class);
			cmd.addParameter("@P_ORIGINALCOURSEID_OUT", NString.class);
			cmd.addParameter("@P_COURSETITLE_OUT", NString.class);
			cmd.addParameter("@P_COURSEADDDATE_OUT", NString.class);
			cmd.addParameter("@P_COURSEDROPDATE_OUT", NString.class);
			cmd.addParameter("@P_COURSEOVERRIDESCHOOL_OUT", NString.class);
			cmd.addParameter("@P_OVERRIDESCHOOLCOURSENUMB_OUT", NString.class);
			cmd.addParameter("@P_COURSEAPPLICABILITY_OUT", NString.class);
			cmd.addParameter("@P_COURSEBEGINDATE_OUT", NString.class);
			cmd.addParameter("@P_COURSEENDDATE_OUT", NString.class);
			cmd.addParameter("@P_COURSEINSTRUCTSITE_OUT", NString.class);
			cmd.addParameter("@P_COURSEINSTRUCTSITENAME_OUT", NString.class);
			cmd.addParameter("@P_REQUIREMENT_REFCSR_OUT", DataCursor.class);
			cmd.addParameter("@P_ATTRIBUTE_REFCSR_OUT", DataCursor.class);
			cmd.addParameter("@P_PROFICIENCY_REFCSR_OUT", DataCursor.class);
			cmd.addParameter("@P_LICENSURE_REFCSR_OUT", DataCursor.class);
			cmd.addParameter("@P_LANG_OF_INSTRUCTION_OUT", DataCursor.class);
			cmd.addParameter("@P_CRSE_NOTEMESSAGE_OUT", NString.class);
				
			cmd.execute();
			pCoursecreditbasisOut.val = cmd.getParameterValue("@P_COURSECREDITBASIS_OUT", NString.class);
			pCoursecreditunitsOut.val = cmd.getParameterValue("@P_COURSECREDITUNITS_OUT", NString.class);
			pCoursecreditlevelOut.val = cmd.getParameterValue("@P_COURSECREDITLEVEL_OUT", NString.class);
			pCoursecreditvalueOut.val = cmd.getParameterValue("@P_COURSECREDITVALUE_OUT", NNumber.class);
			pCoursecreditearnedOut.val = cmd.getParameterValue("@P_COURSECREDITEARNED_OUT", NNumber.class);
			pCourseacadgradescalecodeOut.val = cmd.getParameterValue("@P_COURSEACADGRADESCALECODE_OUT", NString.class);
			pCourseacademicgradeOut.val = cmd.getParameterValue("@P_COURSEACADEMICGRADE_OUT", NString.class);
			pCoursenarrexplangradeOut.val = cmd.getParameterValue("@P_COURSENARREXPLANGRADE_OUT", NString.class);
			pCourserepeatcodeOut.val = cmd.getParameterValue("@P_COURSEREPEATCODE_OUT", NString.class);
			pCoursecodeTypeOut.val = cmd.getParameterValue("@P_COURSECODE_TYPE_OUT", NString.class);
			pCoursecodeValueOut.val = cmd.getParameterValue("@P_COURSECODE_VALUE_OUT", NString.class);
			pCoursequalityptsearnedOut.val = cmd.getParameterValue("@P_COURSEQUALITYPTSEARNED_OUT", NNumber.class);
			pCourselevelOut.val = cmd.getParameterValue("@P_COURSELEVEL_OUT", NString.class);
			pCoursesubjectabbrOut.val = cmd.getParameterValue("@P_COURSESUBJECTABBR_OUT", NString.class);
			pCoursenumberOut.val = cmd.getParameterValue("@P_COURSENUMBER_OUT", NString.class);
			pCoursesectionnumberOut.val = cmd.getParameterValue("@P_COURSESECTIONNUMBER_OUT", NString.class);
			pOriginalcourseidOut.val = cmd.getParameterValue("@P_ORIGINALCOURSEID_OUT", NString.class);
			pCoursetitleOut.val = cmd.getParameterValue("@P_COURSETITLE_OUT", NString.class);
			pCourseadddateOut.val = cmd.getParameterValue("@P_COURSEADDDATE_OUT", NString.class);
			pCoursedropdateOut.val = cmd.getParameterValue("@P_COURSEDROPDATE_OUT", NString.class);
			pCourseoverrideschoolOut.val = cmd.getParameterValue("@P_COURSEOVERRIDESCHOOL_OUT", NString.class);
			pOverrideschoolcoursenumbOut.val = cmd.getParameterValue("@P_OVERRIDESCHOOLCOURSENUMB_OUT", NString.class);
			pCourseapplicabilityOut.val = cmd.getParameterValue("@P_COURSEAPPLICABILITY_OUT", NString.class);
			pCoursebegindateOut.val = cmd.getParameterValue("@P_COURSEBEGINDATE_OUT", NString.class);
			pCourseenddateOut.val = cmd.getParameterValue("@P_COURSEENDDATE_OUT", NString.class);
			pCourseinstructsiteOut.val = cmd.getParameterValue("@P_COURSEINSTRUCTSITE_OUT", NString.class);
			pCourseinstructsitenameOut.val = cmd.getParameterValue("@P_COURSEINSTRUCTSITENAME_OUT", NString.class);
			pRequirementRefcsrOut.val = cmd.getParameterValue("@P_REQUIREMENT_REFCSR_OUT", DataCursor.class);
			pAttributeRefcsrOut.val = cmd.getParameterValue("@P_ATTRIBUTE_REFCSR_OUT", DataCursor.class);
			pProficiencyRefcsrOut.val = cmd.getParameterValue("@P_PROFICIENCY_REFCSR_OUT", DataCursor.class);
			pLicensureRefcsrOut.val = cmd.getParameterValue("@P_LICENSURE_REFCSR_OUT", DataCursor.class);
			pLangOfInstructionOut.val = cmd.getParameterValue("@P_LANG_OF_INSTRUCTION_OUT", DataCursor.class);
			pCrseNotemessageOut.val = cmd.getParameterValue("@P_CRSE_NOTEMESSAGE_OUT", NString.class);


		}
		
	
	
	@DbRecordType(id="InProgressCourseRow", dataSourceName="IN_PROGRESS_COURSE")
	public static class InProgressCourseRow
	{
		@DbRecordField(dataSourceName="PIDM")
		public NNumber Pidm;
		@DbRecordField(dataSourceName="TERM_CODE")
		public NString TermCode;
		@DbRecordField(dataSourceName="CRN")
		public NString Crn;
		@DbRecordField(dataSourceName="SUBJ_CODE")
		public NString SubjCode;
		@DbRecordField(dataSourceName="CRSE_NUMB")
		public NString CrseNumb;
	}

	
	@DbRecordType(id="InstCourseRow", dataSourceName="INST_COURSE")
	public static class InstCourseRow
	{
		@DbRecordField(dataSourceName="PIDM")
		public NNumber Pidm;
		@DbRecordField(dataSourceName="TERM_CODE")
		public NString TermCode;
		@DbRecordField(dataSourceName="SEQ_NO")
		public NNumber SeqNo;
		@DbRecordField(dataSourceName="CRN")
		public NString Crn;
		@DbRecordField(dataSourceName="SUBJ_CODE")
		public NString SubjCode;
		@DbRecordField(dataSourceName="CRSE_NUMB")
		public NString CrseNumb;
	}

	
	@DbRecordType(id="TransCourseRow", dataSourceName="TRANS_COURSE")
	public static class TransCourseRow
	{
		@DbRecordField(dataSourceName="PIDM")
		public NNumber Pidm;
		@DbRecordField(dataSourceName="TRIT_SEQ_NO")
		public NNumber TritSeqNo;
		@DbRecordField(dataSourceName="TRAM_SEQ_NO")
		public NNumber TramSeqNo;
		@DbRecordField(dataSourceName="TRCR_SEQ_NO")
		public NNumber TrcrSeqNo;
		@DbRecordField(dataSourceName="TRCE_SEQ_NO")
		public NNumber TrceSeqNo;
	}

	
	
}
