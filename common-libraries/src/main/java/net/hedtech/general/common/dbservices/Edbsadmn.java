package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Edbsadmn {
		public static NNumber FcalcDispositionDate(NDate baseDate,NNumber years,Ref<NDate> dispDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EDBSADMN.CALC_DISPOSITION_DATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@BASE_DATE", baseDate);
			cmd.addParameter("@YEARS", years);
			cmd.addParameter("@DISP_DATE", NDate.class);
				
			cmd.execute();
			dispDate.val = cmd.getParameterValue("@DISP_DATE", NDate.class);

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NDate FgetApplicationDate(NNumber pPidm,NString pTermCode,NNumber pApplNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EDBSADMN.GET_APPLICATION_DATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_APPL_NO", pApplNo);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
		public static NDate FgetEnrollmentDate(NNumber pPidm,NString pTermCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EDBSADMN.GET_ENROLLMENT_DATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
		public static NDate FgetGraduationDate(NNumber pPidm,NString pTermCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EDBSADMN.GET_GRADUATION_DATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
		public static NDate FgetLastAttendence(NNumber pPidm,NString pTermCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EDBSADMN.GET_LAST_ATTENDENCE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
		public static void getStudentData(NNumber pidm,NString termCode,NNumber applNo,Ref<NDate> graduationDate,Ref<NDate> lastAttendence,Ref<NDate> applicationDate,Ref<NDate> enrollmentDate,Ref<NString> graduated,Ref<NString> admitted) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EDBSADMN.GET_STUDENT_DATA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@TERM_CODE", termCode);
			cmd.addParameter("@APPL_NO", applNo);
			cmd.addParameter("@GRADUATION_DATE", NDate.class);
			cmd.addParameter("@LAST_ATTENDENCE", NDate.class);
			cmd.addParameter("@APPLICATION_DATE", NDate.class);
			cmd.addParameter("@ENROLLMENT_DATE", NDate.class);
			cmd.addParameter("@GRADUATED", NString.class);
			cmd.addParameter("@ADMITTED", NString.class);
				
			cmd.execute();
			graduationDate.val = cmd.getParameterValue("@GRADUATION_DATE", NDate.class);
			lastAttendence.val = cmd.getParameterValue("@LAST_ATTENDENCE", NDate.class);
			applicationDate.val = cmd.getParameterValue("@APPLICATION_DATE", NDate.class);
			enrollmentDate.val = cmd.getParameterValue("@ENROLLMENT_DATE", NDate.class);
			graduated.val = cmd.getParameterValue("@GRADUATED", NString.class);
			admitted.val = cmd.getParameterValue("@ADMITTED", NString.class);


		}
		
		public static NNumber FisGraduated(NNumber pidm,NString graduated) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EDBSADMN.IS_GRADUATED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@GRADUATED", graduated);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FisNotAdmitted(NNumber pidm,NString admitted) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EDBSADMN.IS_NOT_ADMITTED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@ADMITTED", admitted);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FisNotGraduated(NNumber pidm,NString graduated) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EDBSADMN.IS_NOT_GRADUATED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@GRADUATED", graduated);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
	
	
	
}
