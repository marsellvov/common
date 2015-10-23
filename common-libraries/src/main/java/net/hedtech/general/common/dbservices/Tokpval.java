package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Tokpval {
		public static NBool fGjbprun(NString inParmNumber,NNumber inOneUpNo,Ref<NString> outvar) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TOKPVAL.F_GJBPRUN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@IN_PARM_NUMBER", inParmNumber);
			cmd.addParameter("@IN_ONE_UP_NO", inOneUpNo);
			cmd.addParameter("@OUTVAR", outvar, true);
				
			cmd.execute();
			outvar.val = cmd.getParameterValue("@OUTVAR", NString.class);

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fGlbapplEqual(NString codeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TOKPVAL.F_GLBAPPL_EQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@CODE_IN", codeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fStudentInstalled() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TOKPVAL.F_STUDENT_INSTALLED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fStvcampLike(NString codeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TOKPVAL.F_STVCAMP_LIKE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@CODE_IN", codeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fStvtermLike(NString codeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TOKPVAL.F_STVTERM_LIKE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@CODE_IN", codeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fTbbdetcEqual(NString codeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TOKPVAL.F_TBBDETC_EQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@CODE_IN", codeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fTbbdetcLike(NString codeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TOKPVAL.F_TBBDETC_LIKE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@CODE_IN", codeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fTbbistcEqual(NString codeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TOKPVAL.F_TBBISTC_EQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@CODE_IN", codeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fTbbsbrlEqual(NString codeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TOKPVAL.F_TBBSBRL_EQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@CODE_IN", codeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fTtvdcatLike(NString codeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TOKPVAL.F_TTVDCAT_LIKE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@CODE_IN", codeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fTtvecatLike(NString codeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TOKPVAL.F_TTVECAT_LIKE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@CODE_IN", codeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fTtvsrceLike(NString codeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TOKPVAL.F_TTVSRCE_LIKE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@CODE_IN", codeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void pSetError(NString valLabel,Ref<NString> valErrInd,Ref<NString> valErrMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TOKPVAL.P_SET_ERROR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@VAL_ERR_IND", NString.class);
			cmd.addParameter("@VAL_ERR_MSG", NString.class);
				
			cmd.execute();
			valErrInd.val = cmd.getParameterValue("@VAL_ERR_IND", NString.class);
			valErrMsg.val = cmd.getParameterValue("@VAL_ERR_MSG", NString.class);


		}
		
		public static void pValidMagneticTapeParm(NNumber parmOneUpNo,Ref<NString> valErrInd,Ref<NString> valErrMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TOKPVAL.P_VALID_MAGNETIC_TAPE_PARM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_ERR_IND", NString.class);
			cmd.addParameter("@VAL_ERR_MSG", NString.class);
				
			cmd.execute();
			valErrInd.val = cmd.getParameterValue("@VAL_ERR_IND", NString.class);
			valErrMsg.val = cmd.getParameterValue("@VAL_ERR_MSG", NString.class);


		}
		
		public static void pValidPopselParmTfrbill(NNumber parmOneUpNo,Ref<NString> valErrInd,Ref<NString> valErrMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TOKPVAL.P_VALID_POPSEL_PARM_TFRBILL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_ERR_IND", NString.class);
			cmd.addParameter("@VAL_ERR_MSG", NString.class);
				
			cmd.execute();
			valErrInd.val = cmd.getParameterValue("@VAL_ERR_IND", NString.class);
			valErrMsg.val = cmd.getParameterValue("@VAL_ERR_MSG", NString.class);


		}
		
		public static void pValidPopselParmTsrcbil(NNumber parmOneUpNo,Ref<NString> valErrInd,Ref<NString> valErrMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TOKPVAL.P_VALID_POPSEL_PARM_TSRCBIL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_ERR_IND", NString.class);
			cmd.addParameter("@VAL_ERR_MSG", NString.class);
				
			cmd.execute();
			valErrInd.val = cmd.getParameterValue("@VAL_ERR_IND", NString.class);
			valErrMsg.val = cmd.getParameterValue("@VAL_ERR_MSG", NString.class);


		}
		
		public static void pValidPopselParmTsrtbil(NNumber parmOneUpNo,Ref<NString> valErrInd,Ref<NString> valErrMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TOKPVAL.P_VALID_POPSEL_PARM_TSRTBIL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_ERR_IND", NString.class);
			cmd.addParameter("@VAL_ERR_MSG", NString.class);
				
			cmd.execute();
			valErrInd.val = cmd.getParameterValue("@VAL_ERR_IND", NString.class);
			valErrMsg.val = cmd.getParameterValue("@VAL_ERR_MSG", NString.class);


		}
		
		public static void pValidSchedbillParms(NNumber parmOneUpNo,Ref<NString> valErr2Ind,Ref<NString> valErr2Msg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TOKPVAL.P_VALID_SCHEDBILL_PARMS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_ERR2_IND", NString.class);
			cmd.addParameter("@VAL_ERR2_MSG", NString.class);
				
			cmd.execute();
			valErr2Ind.val = cmd.getParameterValue("@VAL_ERR2_IND", NString.class);
			valErr2Msg.val = cmd.getParameterValue("@VAL_ERR2_MSG", NString.class);


		}
		
		public static void pValidTrafRept(NNumber taxYearIn,NString reptCodeIn,NString fileOrPrint,Ref<NString> valErr2Ind,Ref<NString> valErr2Msg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TOKPVAL.P_VALID_TRAF_REPT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TAX_YEAR_IN", taxYearIn);
			cmd.addParameter("@REPT_CODE_IN", reptCodeIn);
			cmd.addParameter("@FILE_OR_PRINT", fileOrPrint);
			cmd.addParameter("@VAL_ERR2_IND", valErr2Ind, true);
			cmd.addParameter("@VAL_ERR2_MSG", valErr2Msg, true);
				
			cmd.execute();
			valErr2Ind.val = cmd.getParameterValue("@VAL_ERR2_IND", NString.class);
			valErr2Msg.val = cmd.getParameterValue("@VAL_ERR2_MSG", NString.class);


		}
		
		public static void pValidTsrtrafParms(NNumber parmOneUpNo,Ref<NString> valErrInd,Ref<NString> valErrMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TOKPVAL.P_VALID_TSRTRAF_PARMS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_ERR_IND", NString.class);
			cmd.addParameter("@VAL_ERR_MSG", NString.class);
				
			cmd.execute();
			valErrInd.val = cmd.getParameterValue("@VAL_ERR_IND", NString.class);
			valErrMsg.val = cmd.getParameterValue("@VAL_ERR_MSG", NString.class);


		}
		
		public static void pValidate(NString validationLabel,NNumber parmOneUpNo,NString validationValue,Ref<NString> validationErrorInd,Ref<NString> validationErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TOKPVAL.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VALIDATION_LABEL", validationLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VALIDATION_VALUE", validationValue);
			cmd.addParameter("@VALIDATION_ERROR_IND", validationErrorInd, true);
			cmd.addParameter("@VALIDATION_ERROR_MSG", validationErrorMsg, true);
				
			cmd.execute();
			validationErrorInd.val = cmd.getParameterValue("@VALIDATION_ERROR_IND", NString.class);
			validationErrorMsg.val = cmd.getParameterValue("@VALIDATION_ERROR_MSG", NString.class);


		}
		
		public static void pValidateStutableCode(NString validationLabel,NString validationValue,NString tableName,NString columnName,Ref<NString> validationErrorInd,Ref<NString> validationErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TOKPVAL.P_VALIDATE_STUTABLE_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VALIDATION_LABEL", validationLabel);
			cmd.addParameter("@VALIDATION_VALUE", validationValue);
			cmd.addParameter("@TABLE_NAME", tableName);
			cmd.addParameter("@COLUMN_NAME", columnName);
			cmd.addParameter("@VALIDATION_ERROR_IND", validationErrorInd, true);
			cmd.addParameter("@VALIDATION_ERROR_MSG", validationErrorMsg, true);
				
			cmd.execute();
			validationErrorInd.val = cmd.getParameterValue("@VALIDATION_ERROR_IND", NString.class);
			validationErrorMsg.val = cmd.getParameterValue("@VALIDATION_ERROR_MSG", NString.class);


		}
		
	
	
	
}
