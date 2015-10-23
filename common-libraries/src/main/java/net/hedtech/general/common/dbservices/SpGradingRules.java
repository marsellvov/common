package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SpGradingRules {
		public static void pValidate(NString pTermCode,NNumber pStudentPidm,NNumber pFacultyPidm,NString pCrn,NString pGradeType,NString pGradeAssigned,NString pGrdeCodeIncmpFinal,NDate pIncompleteExtDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SP_GRADING_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_STUDENT_PIDM", pStudentPidm);
			cmd.addParameter("@P_FACULTY_PIDM", pFacultyPidm);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_GRADE_TYPE", pGradeType);
			cmd.addParameter("@P_GRADE_ASSIGNED", pGradeAssigned);
			cmd.addParameter("@P_GRDE_CODE_INCMP_FINAL", pGrdeCodeIncmpFinal);
			cmd.addParameter("@P_INCOMPLETE_EXT_DATE", pIncompleteExtDate);
				
			cmd.execute();


		}
		
	
	
	
}
