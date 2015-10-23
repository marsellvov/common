package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbEstimatedGradesRules {
		public static void pValidate(NNumber pSurrogateId,NNumber pSfbffscId,NNumber pStudentPidm,NString pCrn,NNumber pFacultyPidm,NString pStatusCde,NString pGrdeCode,NString pComments,NNumber pVersion,NString pDataOrigin,NString pUserId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ESTIMATED_GRADES_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SURROGATE_ID", pSurrogateId);
			cmd.addParameter("@P_SFBFFSC_ID", pSfbffscId);
			cmd.addParameter("@P_STUDENT_PIDM", pStudentPidm);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_FACULTY_PIDM", pFacultyPidm);
			cmd.addParameter("@P_STATUS_CDE", pStatusCde);
			cmd.addParameter("@P_GRDE_CODE", pGrdeCode);
			cmd.addParameter("@P_COMMENTS", pComments);
			cmd.addParameter("@P_VERSION", pVersion);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
				
			cmd.execute();


		}
		
	
	
	
}
