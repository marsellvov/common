package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RbRepeatCourseExclRules {
		public static NBool fCheckExcludeCourse(NString pTermCode,NString pSubjCode,NString pCrseNumb) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_REPEAT_COURSE_EXCL_RULES.F_CHECK_EXCLUDE_COURSE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_SUBJ_CODE", pSubjCode);
			cmd.addParameter("@P_CRSE_NUMB", pCrseNumb);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NString fParentExists(NString pSubjCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_REPEAT_COURSE_EXCL_RULES.F_PARENT_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SUBJ_CODE", pSubjCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_REPEAT_COURSE_EXCL_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pSubjCode,NString pCrseNumb,NString pFromTermCode,NString pToTermCode,NString pDataOrigin,NString pUserId,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_REPEAT_COURSE_EXCL_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_SUBJ_CODE", pSubjCode);
			cmd.addParameter("@P_CRSE_NUMB", pCrseNumb);
			cmd.addParameter("@P_FROM_TERM_CODE", pFromTermCode);
			cmd.addParameter("@P_TO_TERM_CODE", pToTermCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pSubjCode,NString pCrseNumb,NString pFromTermCode,NString pToTermCode,NString pDataOrigin,NString pUserId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_REPEAT_COURSE_EXCL_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SUBJ_CODE", pSubjCode);
			cmd.addParameter("@P_CRSE_NUMB", pCrseNumb);
			cmd.addParameter("@P_FROM_TERM_CODE", pFromTermCode);
			cmd.addParameter("@P_TO_TERM_CODE", pToTermCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
				
			cmd.execute();


		}
		
		public static void pValidateTermRange(NString pSubjCode,NString pCrseNumb,NString pFromTermCode,NString pToTermCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_REPEAT_COURSE_EXCL_RULES.P_VALIDATE_TERM_RANGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SUBJ_CODE", pSubjCode);
			cmd.addParameter("@P_CRSE_NUMB", pCrseNumb);
			cmd.addParameter("@P_FROM_TERM_CODE", pFromTermCode);
			cmd.addParameter("@P_TO_TERM_CODE", pToTermCode);
				
			cmd.execute();


		}
		
	
	
	
}
