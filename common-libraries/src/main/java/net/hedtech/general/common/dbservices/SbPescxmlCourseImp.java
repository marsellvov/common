package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbPescxmlCourseImp {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESCXML_COURSE_IMP.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static void pAcrecCourseElement(NNumber pDcmtSeqnoIn,NNumber pAsesSeqnoIn,NString pCoursecreditbasisIn,NString pCoursecreditunitsIn,NString pCoursecreditlevelIn,NString pCoursecreditvalueIn,NString pCoursecreditearnedIn,NString pCourseacadgradescaleIn,NString pCourseacademicgradeIn,NString pCoursenarrgradescaleIn,NString pCourserepeatcodeIn,NString pCoursecodeTypeIn,NString pCoursecodeValueIn,NString pCoursequalitypointsIn,NString pCourselevelIn,NString pCoursesubjectabbrIn,NString pCoursenumberIn,NString pCoursesectionnumberIn,NString pOriginalcourseidIn,NString pCoursetitleIn,NString pCourseadddateIn,NString pCoursedropdateIn,NString pCourseoverrideschoolIn,NString pOverrideschoolcourseIn,NString pCourseapplicabilityIn,NString pCoursebegindateIn,NString pCourseenddateIn,NString pCourseinstructionsiteIn,NString pCourseinstructionsitenameIn,NString pReqRapcodeIn,NString pReqRapnameIn,NString pReqRapsubnameIn,NString pReqConditionsmetcodeIn,NString pReqConditionsmetdateIn,NString pReqNotemessageIn,NString pAttrRapcodeIn,NString pAttrRapnameIn,NString pAttrRapsubnameIn,NString pAttrConditionsmetcodeIn,NString pAttrConditionsmetdateIn,NString pAttrNotemessageIn,NString pProfRapcodeIn,NString pProfRapnameIn,NString pProfRapsubnameIn,NString pProfConditionsmetcodeIn,NString pProfConditionsmetdateIn,NString pProfNotemessageIn,NString pLicensurenameIn,NString pLicensurepassagedateIn,NString pNotemessageIn,NString pLanguagecodeIn,NString pInstructionusageIn,NString pLangNotemessageIn,NString pCrseNotemessageIn,NString pCrseUdeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESCXML_COURSE_IMP.P_ACREC_COURSE_ELEMENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DCMT_SEQNO_IN", pDcmtSeqnoIn);
			cmd.addParameter("@P_ASES_SEQNO_IN", pAsesSeqnoIn);
			cmd.addParameter("@P_COURSECREDITBASIS_IN", pCoursecreditbasisIn);
			cmd.addParameter("@P_COURSECREDITUNITS_IN", pCoursecreditunitsIn);
			cmd.addParameter("@P_COURSECREDITLEVEL_IN", pCoursecreditlevelIn);
			cmd.addParameter("@P_COURSECREDITVALUE_IN", pCoursecreditvalueIn);
			cmd.addParameter("@P_COURSECREDITEARNED_IN", pCoursecreditearnedIn);
			cmd.addParameter("@P_COURSEACADGRADESCALE_IN", pCourseacadgradescaleIn);
			cmd.addParameter("@P_COURSEACADEMICGRADE_IN", pCourseacademicgradeIn);
			cmd.addParameter("@P_COURSENARRGRADESCALE_IN", pCoursenarrgradescaleIn);
			cmd.addParameter("@P_COURSEREPEATCODE_IN", pCourserepeatcodeIn);
			cmd.addParameter("@P_COURSECODE_TYPE_IN", pCoursecodeTypeIn);
			cmd.addParameter("@P_COURSECODE_VALUE_IN", pCoursecodeValueIn);
			cmd.addParameter("@P_COURSEQUALITYPOINTS_IN", pCoursequalitypointsIn);
			cmd.addParameter("@P_COURSELEVEL_IN", pCourselevelIn);
			cmd.addParameter("@P_COURSESUBJECTABBR_IN", pCoursesubjectabbrIn);
			cmd.addParameter("@P_COURSENUMBER_IN", pCoursenumberIn);
			cmd.addParameter("@P_COURSESECTIONNUMBER_IN", pCoursesectionnumberIn);
			cmd.addParameter("@P_ORIGINALCOURSEID_IN", pOriginalcourseidIn);
			cmd.addParameter("@P_COURSETITLE_IN", pCoursetitleIn);
			cmd.addParameter("@P_COURSEADDDATE_IN", pCourseadddateIn);
			cmd.addParameter("@P_COURSEDROPDATE_IN", pCoursedropdateIn);
			cmd.addParameter("@P_COURSEOVERRIDESCHOOL_IN", pCourseoverrideschoolIn);
			cmd.addParameter("@P_OVERRIDESCHOOLCOURSE_IN", pOverrideschoolcourseIn);
			cmd.addParameter("@P_COURSEAPPLICABILITY_IN", pCourseapplicabilityIn);
			cmd.addParameter("@P_COURSEBEGINDATE_IN", pCoursebegindateIn);
			cmd.addParameter("@P_COURSEENDDATE_IN", pCourseenddateIn);
			cmd.addParameter("@P_COURSEINSTRUCTIONSITE_IN", pCourseinstructionsiteIn);
			cmd.addParameter("@P_COURSEINSTRUCTIONSITENAME_IN", pCourseinstructionsitenameIn);
			cmd.addParameter("@P_REQ_RAPCODE_IN", pReqRapcodeIn);
			cmd.addParameter("@P_REQ_RAPNAME_IN", pReqRapnameIn);
			cmd.addParameter("@P_REQ_RAPSUBNAME_IN", pReqRapsubnameIn);
			cmd.addParameter("@P_REQ_CONDITIONSMETCODE_IN", pReqConditionsmetcodeIn);
			cmd.addParameter("@P_REQ_CONDITIONSMETDATE_IN", pReqConditionsmetdateIn);
			cmd.addParameter("@P_REQ_NOTEMESSAGE_IN", pReqNotemessageIn);
			cmd.addParameter("@P_ATTR_RAPCODE_IN", pAttrRapcodeIn);
			cmd.addParameter("@P_ATTR_RAPNAME_IN", pAttrRapnameIn);
			cmd.addParameter("@P_ATTR_RAPSUBNAME_IN", pAttrRapsubnameIn);
			cmd.addParameter("@P_ATTR_CONDITIONSMETCODE_IN", pAttrConditionsmetcodeIn);
			cmd.addParameter("@P_ATTR_CONDITIONSMETDATE_IN", pAttrConditionsmetdateIn);
			cmd.addParameter("@P_ATTR_NOTEMESSAGE_IN", pAttrNotemessageIn);
			cmd.addParameter("@P_PROF_RAPCODE_IN", pProfRapcodeIn);
			cmd.addParameter("@P_PROF_RAPNAME_IN", pProfRapnameIn);
			cmd.addParameter("@P_PROF_RAPSUBNAME_IN", pProfRapsubnameIn);
			cmd.addParameter("@P_PROF_CONDITIONSMETCODE_IN", pProfConditionsmetcodeIn);
			cmd.addParameter("@P_PROF_CONDITIONSMETDATE_IN", pProfConditionsmetdateIn);
			cmd.addParameter("@P_PROF_NOTEMESSAGE_IN", pProfNotemessageIn);
			cmd.addParameter("@P_LICENSURENAME_IN", pLicensurenameIn);
			cmd.addParameter("@P_LICENSUREPASSAGEDATE_IN", pLicensurepassagedateIn);
			cmd.addParameter("@P_NOTEMESSAGE_IN", pNotemessageIn);
			cmd.addParameter("@P_LANGUAGECODE_IN", pLanguagecodeIn);
			cmd.addParameter("@P_INSTRUCTIONUSAGE_IN", pInstructionusageIn);
			cmd.addParameter("@P_LANG_NOTEMESSAGE_IN", pLangNotemessageIn);
			cmd.addParameter("@P_CRSE_NOTEMESSAGE_IN", pCrseNotemessageIn);
			cmd.addParameter("@P_CRSE_UDE_IN", pCrseUdeIn);
				
			cmd.execute();


		}
		
	
	
	
}
