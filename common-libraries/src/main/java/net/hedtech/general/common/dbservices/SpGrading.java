package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SpGrading {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SP_GRADING.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static void pPostGrade(NString pTermCode,NNumber pStudentPidm,NString pCrn,NNumber pFacultyPidm,NString pGradeType,NString pGradeAssigned,NString pGrdeCodeIncmpFinal,NDate pIncompleteExtDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SP_GRADING.P_POST_GRADE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_STUDENT_PIDM", pStudentPidm);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_FACULTY_PIDM", pFacultyPidm);
			cmd.addParameter("@P_GRADE_TYPE", pGradeType);
			cmd.addParameter("@P_GRADE_ASSIGNED", pGradeAssigned);
			cmd.addParameter("@P_GRDE_CODE_INCMP_FINAL", pGrdeCodeIncmpFinal);
			cmd.addParameter("@P_INCOMPLETE_EXT_DATE", pIncompleteExtDate);
				
			cmd.execute();


		}
		
	
	
	
}
