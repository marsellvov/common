package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwscjref {
		public static NString fGetClassDesc(NNumber pPidm,NString pLevel,NString pTerm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSCJREF.F_GET_CLASS_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_LEVEL", pLevel);
			cmd.addParameter("@P_TERM", pTerm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pGetStudentAdvisors(NNumber pPidm,NString pTerm,Ref<DataCursor> pStudentAdvisorsRef) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSCJREF.P_GET_STUDENT_ADVISORS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_STUDENT_ADVISORS_REF", DataCursor.class);
				
			cmd.execute();
			pStudentAdvisorsRef.val = cmd.getParameterValue("@P_STUDENT_ADVISORS_REF", DataCursor.class);


		}
		
		public static void pGetStudentCurriculum(NNumber pPidm,NString pTerm,Ref<DataCursor> pStudentCurriculumRef) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSCJREF.P_GET_STUDENT_CURRICULUM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_STUDENT_CURRICULUM_REF", DataCursor.class);
				
			cmd.execute();
			pStudentCurriculumRef.val = cmd.getParameterValue("@P_STUDENT_CURRICULUM_REF", DataCursor.class);


		}
		
	
	
	
}
