package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Icgokrol {
		public static NString fAppacceptInd(NNumber pidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICGOKROL.F_APPACCEPT_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM", pidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fApplicantInd(NNumber pidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICGOKROL.F_APPLICANT_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM", pidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIntacceptInd(NNumber pidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICGOKROL.F_INTACCEPT_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM", pidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fRecruitInd(NNumber pidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICGOKROL.F_RECRUIT_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM", pidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static void pCalcGorrsqlRoles(NNumber pidmIn,Ref<NString> personIsEligibleOut,Ref<List<RolesTableTypeRow>> institutionRolesTableOut,Ref<List<RolesTableTypeRow>> customRolesTableOut) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICGOKROL.P_CALC_GORRSQL_ROLES", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@PIDM_IN", pidmIn);
//			cmd.addParameter("@PERSON_IS_ELIGIBLE_OUT", NString.class);
//			// cmd.addParameter(DbTypes.getTableType("INSTITUTION_ROLES_TABLE_OUT", "", object.class));
//			// cmd.addParameter(DbTypes.getTableType("CUSTOM_ROLES_TABLE_OUT", "", object.class));
//				
//			cmd.execute();
//			personIsEligibleOut.val = cmd.getParameterValue("@PERSON_IS_ELIGIBLE_OUT", NString.class);
//			// institutionRolesTableOut.val = cmd.getTableParameterValue("@INSTITUTION_ROLES_TABLE_OUT", object.class);
//			// customRolesTableOut.val = cmd.getTableParameterValue("@CUSTOM_ROLES_TABLE_OUT", object.class);
//
//
//		}
		
//		public static void pCalcRoles(NNumber pidmIn,NString colrSessionidIn,NString colrJobIn,NString colrParmNumberTermsIn,NString colrParmNumberRolesIn,NString activeOnlyIn,NString limitedOnlyIn,Ref<NString> personIsEligibleOut,Ref<List<RolesTableTypeRow>> institutionRolesTableOut,Ref<List<RolesTableTypeRow>> customRolesTableOut) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICGOKROL.P_CALC_ROLES", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@PIDM_IN", pidmIn);
//			cmd.addParameter("@COLR_SESSIONID_IN", colrSessionidIn);
//			cmd.addParameter("@COLR_JOB_IN", colrJobIn);
//			cmd.addParameter("@COLR_PARM_NUMBER_TERMS_IN", colrParmNumberTermsIn);
//			cmd.addParameter("@COLR_PARM_NUMBER_ROLES_IN", colrParmNumberRolesIn);
//			cmd.addParameter("@ACTIVE_ONLY_IN", activeOnlyIn);
//			cmd.addParameter("@LIMITED_ONLY_IN", limitedOnlyIn);
//			cmd.addParameter("@PERSON_IS_ELIGIBLE_OUT", NString.class);
//			// cmd.addParameter(DbTypes.getTableType("INSTITUTION_ROLES_TABLE_OUT", "", object.class));
//			// cmd.addParameter(DbTypes.getTableType("CUSTOM_ROLES_TABLE_OUT", "", object.class));
//				
//			cmd.execute();
//			personIsEligibleOut.val = cmd.getParameterValue("@PERSON_IS_ELIGIBLE_OUT", NString.class);
//			// institutionRolesTableOut.val = cmd.getTableParameterValue("@INSTITUTION_ROLES_TABLE_OUT", object.class);
//			// customRolesTableOut.val = cmd.getTableParameterValue("@CUSTOM_ROLES_TABLE_OUT", object.class);
//
//
//		}
		
//		public static void pCalcSpecificRoles(List<RolesTableTypeRow> institutionRolesTabIn,Ref<NString> personIsStudentOut,Ref<NString> personIsFacultyOut,Ref<NString> onlinetopicOut) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICGOKROL.P_CALC_SPECIFIC_ROLES", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("INSTITUTION_ROLES_TAB_IN", "", institutionRolesTabIn, object.class));
//			cmd.addParameter("@PERSON_IS_STUDENT_OUT", NString.class);
//			cmd.addParameter("@PERSON_IS_FACULTY_OUT", NString.class);
//			cmd.addParameter("@ONLINETOPIC_OUT", NString.class);
//				
//			cmd.execute();
//			personIsStudentOut.val = cmd.getParameterValue("@PERSON_IS_STUDENT_OUT", NString.class);
//			personIsFacultyOut.val = cmd.getParameterValue("@PERSON_IS_FACULTY_OUT", NString.class);
//			onlinetopicOut.val = cmd.getParameterValue("@ONLINETOPIC_OUT", NString.class);
//
//
//		}
		
	
	
	
}
