package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Edmsadm {
		public static NNumber fCalcDate(NDate pBaseDate,NNumber pYears,Ref<NDate> pDispDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EDMSADM.F_CALC_DATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_BASE_DATE", pBaseDate);
			cmd.addParameter("@P_YEARS", pYears);
			cmd.addParameter("@P_DISP_DATE", NDate.class);
				
			cmd.execute();
			pDispDate.val = cmd.getParameterValue("@P_DISP_DATE", NDate.class);

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCalcDatePermanent(Ref<NDate> pDispDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EDMSADM.F_CALC_DATE_PERMANENT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_DISP_DATE", NDate.class);
				
			cmd.execute();
			pDispDate.val = cmd.getParameterValue("@P_DISP_DATE", NDate.class);

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCalcFromApplicationDate(NDate pApplicationDate,NNumber pYears,Ref<NDate> pDispDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EDMSADM.F_CALC_FROM_APPLICATION_DATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_APPLICATION_DATE", pApplicationDate);
			cmd.addParameter("@P_YEARS", pYears);
			cmd.addParameter("@P_DISP_DATE", NDate.class);
				
			cmd.execute();
			pDispDate.val = cmd.getParameterValue("@P_DISP_DATE", NDate.class);

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCalcFromGradDate(NDate pGradDate,NDate pApplicationDate,NNumber pYears,Ref<NDate> pDispDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EDMSADM.F_CALC_FROM_GRAD_DATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_GRAD_DATE", pGradDate);
			cmd.addParameter("@P_APPLICATION_DATE", pApplicationDate);
			cmd.addParameter("@P_YEARS", pYears);
			cmd.addParameter("@P_DISP_DATE", NDate.class);
				
			cmd.execute();
			pDispDate.val = cmd.getParameterValue("@P_DISP_DATE", NDate.class);

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fEnrolled(NDate pEnrollmentDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EDMSADM.F_ENROLLED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_ENROLLMENT_DATE", pEnrollmentDate);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NDate fGetApplicationDate(NString pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EDMSADM.F_GET_APPLICATION_DATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
		public static NDate fGetEnrollmentDate(NString pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EDMSADM.F_GET_ENROLLMENT_DATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
		public static NDate fGetGradDate(NString pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EDMSADM.F_GET_GRAD_DATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
		public static NDate fGetLastRegDate(NString pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EDMSADM.F_GET_LAST_REG_DATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
		public static NNumber fGradLastDate(NString pPidm,NNumber pDays,Ref<NDate> pDispDate,NString pDoctype) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EDMSADM.F_GRAD_LAST_DATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_DAYS", pDays);
			cmd.addParameter("@P_DISP_DATE", NDate.class);
			cmd.addParameter("@P_DOCTYPE", pDoctype);
				
			cmd.execute();
			pDispDate.val = cmd.getParameterValue("@P_DISP_DATE", NDate.class);

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fKeepDate(Ref<NDate> pDispDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EDMSADM.F_KEEP_DATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_DISP_DATE", NDate.class);
				
			cmd.execute();
			pDispDate.val = cmd.getParameterValue("@P_DISP_DATE", NDate.class);

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fNotenrolled(NDate pEnrollmentDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EDMSADM.F_NOTENROLLED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_ENROLLMENT_DATE", pEnrollmentDate);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void pGetStudentAttributes(NString pPidm,Ref<NDate> pEnrollmentDate,Ref<NDate> pApplicationDate,Ref<NDate> pGraduationDate,Ref<NDate> pLastRegistrationDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EDMSADM.P_GET_STUDENT_ATTRIBUTES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ENROLLMENT_DATE", NDate.class);
			cmd.addParameter("@P_APPLICATION_DATE", NDate.class);
			cmd.addParameter("@P_GRADUATION_DATE", NDate.class);
			cmd.addParameter("@P_LAST_REGISTRATION_DATE", NDate.class);
				
			cmd.execute();
			pEnrollmentDate.val = cmd.getParameterValue("@P_ENROLLMENT_DATE", NDate.class);
			pApplicationDate.val = cmd.getParameterValue("@P_APPLICATION_DATE", NDate.class);
			pGraduationDate.val = cmd.getParameterValue("@P_GRADUATION_DATE", NDate.class);
			pLastRegistrationDate.val = cmd.getParameterValue("@P_LAST_REGISTRATION_DATE", NDate.class);


		}
		
	
	
	
}
