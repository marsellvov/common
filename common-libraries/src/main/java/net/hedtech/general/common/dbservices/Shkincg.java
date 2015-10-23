package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Shkincg {
		public static NString fIncmpDefaultFinalGrade(NString pTermCode,NString pGrdeCode,NString pLevlCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKINCG.F_INCMP_DEFAULT_FINAL_GRADE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_GRDE_CODE", pGrdeCode);
			cmd.addParameter("@P_LEVL_CODE", pLevlCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIncmpDispWeb(SbIncmpGrading.IncmpGradingRecRow pIncmpGradingRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKINCG.F_INCMP_DISP_WEB", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("P_INCMP_GRADING_REC", pIncmpGradingRec, SbIncmpGrading.IncmpGradingRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NDate fIncmpExtensionDate(NString pTermCode,NString pPtrmCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKINCG.F_INCMP_EXTENSION_DATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PTRM_CODE", pPtrmCode);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
//		public static IncmpGradingRecRow fIncmpGradeRule(NString pTermCode,NString pLevlCode) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKINCG.F_INCMP_GRADE_RULE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(DbTypes.createStructType(IncmpGradingRecRow.class));
//			cmd.addParameter("@P_TERM_CODE", pTermCode);
//			cmd.addParameter("@P_LEVL_CODE", pLevlCode);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(IncmpGradingRecRow.class);
//
//		}
		
		public static NNumber fIncmpGradeRuleKey(SbIncmpGrading.IncmpGradingRecRow pIncmpGradingRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKINCG.F_INCMP_GRADE_RULE_KEY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter(DbTypes.createStructType("P_INCMP_GRADING_REC", pIncmpGradingRec, SbIncmpGrading.IncmpGradingRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fIsFinalGradeIncmp(NString pTermCode,NString pGrdeCode,NString pLevlCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKINCG.F_IS_FINAL_GRADE_INCMP", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_GRDE_CODE", pGrdeCode);
			cmd.addParameter("@P_LEVL_CODE", pLevlCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fValidateIncmpFinalGrade(NString pTermCode,NString pGrdeCodeIncmpFinal,NString pGrdeCode,NString pLevlCode,Ref<NString> pValidateErrOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKINCG.F_VALIDATE_INCMP_FINAL_GRADE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_GRDE_CODE_INCMP_FINAL", pGrdeCodeIncmpFinal);
			cmd.addParameter("@P_GRDE_CODE", pGrdeCode);
			cmd.addParameter("@P_LEVL_CODE", pLevlCode);
			cmd.addParameter("@P_VALIDATE_ERR_OUT", NString.class);
				
			cmd.execute();
			pValidateErrOut.val = cmd.getParameterValue("@P_VALIDATE_ERR_OUT", NString.class);

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	
}
