package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Icsfkgex {
		public static NBool fCheckshrgcom(NString term,NString crn,NString rectypeInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSFKGEX.F_CHECKSHRGCOM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@CRN", crn);
			cmd.addParameter("@RECTYPE_IND", rectypeInd);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fValGmod(NString termIn,NString grdeCodeIn,NString levlCodeIn,NString gmodCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSFKGEX.F_VAL_GMOD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@GRDE_CODE_IN", grdeCodeIn);
			cmd.addParameter("@LEVL_CODE_IN", levlCodeIn);
			cmd.addParameter("@GMOD_CODE_IN", gmodCodeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fValGrade(NString termCodeIn,NString grdeCodeIn,NString levlCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSFKGEX.F_VAL_GRADE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@TERM_CODE_IN", termCodeIn);
			cmd.addParameter("@GRDE_CODE_IN", grdeCodeIn);
			cmd.addParameter("@LEVL_CODE_IN", levlCodeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fValGrdeSub(NString termCodeIn,NString grdeCodeIn,NString levlCodeIn,NString gmodCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSFKGEX.F_VAL_GRDE_SUB", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@TERM_CODE_IN", termCodeIn);
			cmd.addParameter("@GRDE_CODE_IN", grdeCodeIn);
			cmd.addParameter("@LEVL_CODE_IN", levlCodeIn);
			cmd.addParameter("@GMOD_CODE_IN", gmodCodeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void pCommitfingrd(NString grde,NString termCodeIn,NString crnIn,NNumber pidmIn,Ref<NString> errorNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSFKGEX.P_COMMITFINGRD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@GRDE", grde);
			cmd.addParameter("@TERM_CODE_IN", termCodeIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@ERROR_NUMBER", NString.class);
				
			cmd.execute();
			errorNumber.val = cmd.getParameterValue("@ERROR_NUMBER", NString.class);


		}
		
		public static void pCommitmidgrd(NString mgrde,NString termCodeIn,NString crnIn,NNumber pidmIn,Ref<NString> errorNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSFKGEX.P_COMMITMIDGRD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MGRDE", mgrde);
			cmd.addParameter("@TERM_CODE_IN", termCodeIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@ERROR_NUMBER", NString.class);
				
			cmd.execute();
			errorNumber.val = cmd.getParameterValue("@ERROR_NUMBER", NString.class);


		}
		
		public static void pFindPidm(NString userId,Ref<NNumber> pidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSFKGEX.P_FIND_PIDM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@USER_ID", userId);
			cmd.addParameter("@PIDM", NNumber.class);
				
			cmd.execute();
			pidm.val = cmd.getParameterValue("@PIDM", NNumber.class);


		}
		
		public static void pInsertshrgcol(NNumber stupidm,NString term,NString rqstType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSFKGEX.P_INSERTSHRGCOL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@STUPIDM", stupidm);
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@RQST_TYPE", rqstType);
				
			cmd.execute();


		}
		
		public static void pParseTermcrn(NString termCrn,Ref<NString> term,Ref<NString> crn,Ref<NString> inst) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSFKGEX.P_PARSE_TERMCRN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_CRN", termCrn);
			cmd.addParameter("@TERM", NString.class);
			cmd.addParameter("@CRN", NString.class);
			cmd.addParameter("@INST", NString.class);
				
			cmd.execute();
			term.val = cmd.getParameterValue("@TERM", NString.class);
			crn.val = cmd.getParameterValue("@CRN", NString.class);
			inst.val = cmd.getParameterValue("@INST", NString.class);


		}
		
		public static void pPosteltgrades(NString termCrn,NString facultyId,NString studentId,NString gradeTypeInd,NString gradeAssigned,Ref<NString> errorNumber,Ref<NString> errorMessage) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSFKGEX.P_POSTELTGRADES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_CRN", termCrn);
			cmd.addParameter("@FACULTY_ID", facultyId);
			cmd.addParameter("@STUDENT_ID", studentId);
			cmd.addParameter("@GRADE_TYPE_IND", gradeTypeInd);
			cmd.addParameter("@GRADE_ASSIGNED", gradeAssigned);
			cmd.addParameter("@ERROR_NUMBER", NString.class);
			cmd.addParameter("@ERROR_MESSAGE", NString.class);
				
			cmd.execute();
			errorNumber.val = cmd.getParameterValue("@ERROR_NUMBER", NString.class);
			errorMessage.val = cmd.getParameterValue("@ERROR_MESSAGE", NString.class);


		}
		
	
	
	
}
