package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Smksadj {
		public static NString fStuAreacheck(NNumber pidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKSADJ.F_STU_AREACHECK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM", pidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fStuGroupcheck(NNumber pidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKSADJ.F_STU_GROUPCHECK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM", pidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fStuProgramcheck(NNumber pidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKSADJ.F_STU_PROGRAMCHECK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM", pidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fStuSubstitutioncheck(NNumber pidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKSADJ.F_STU_SUBSTITUTIONCHECK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM", pidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fStuTargetcoursecheck(NNumber pidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKSADJ.F_STU_TARGETCOURSECHECK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM", pidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fStuWaivecoursecheck(NNumber pidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKSADJ.F_STU_WAIVECOURSECHECK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM", pidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pProcesssmbslib(NNumber pidm,NString objName,NString act,NString progInd,NString areaInd,NString groupInd,NString targetInd,NString waiverInd,NString substInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKSADJ.P_PROCESSSMBSLIB", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@OBJ_NAME", objName);
			cmd.addParameter("@ACT", act);
			cmd.addParameter("@PROG_IND", progInd);
			cmd.addParameter("@AREA_IND", areaInd);
			cmd.addParameter("@GROUP_IND", groupInd);
			cmd.addParameter("@TARGET_IND", targetInd);
			cmd.addParameter("@WAIVER_IND", waiverInd);
			cmd.addParameter("@SUBST_IND", substInd);
				
			cmd.execute();


		}
		
	
	
	
}
