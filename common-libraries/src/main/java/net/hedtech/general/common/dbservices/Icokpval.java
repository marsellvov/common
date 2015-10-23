package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Icokpval {
		public static NBool fForeignKeyLookup(NString fkCodeIn,NString fkTableIn,NString fkCodeColIn,NString fkDescColIn,NString booleanOpIn,NNumber maxLengthIn,Ref<NString> fkDescOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICOKPVAL.F_FOREIGN_KEY_LOOKUP", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@FK_CODE_IN", fkCodeIn);
			cmd.addParameter("@FK_TABLE_IN", fkTableIn);
			cmd.addParameter("@FK_CODE_COL_IN", fkCodeColIn);
			cmd.addParameter("@FK_DESC_COL_IN", fkDescColIn);
			cmd.addParameter("@BOOLEAN_OP_IN", booleanOpIn);
			cmd.addParameter("@MAX_LENGTH_IN", maxLengthIn);
			cmd.addParameter("@FK_DESC_OUT", NString.class);
				
			cmd.execute();
			fkDescOut.val = cmd.getParameterValue("@FK_DESC_OUT", NString.class);

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fSelectGjbprun1(NString prunNumberIn,NNumber parmOneUpNo,NBool checkForNull,Ref<NString> prunValueOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICOKPVAL.F_SELECT_GJBPRUN_1", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PRUN_NUMBER_IN", prunNumberIn);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@CHECK_FOR_NULL", checkForNull);
			cmd.addParameter("@PRUN_VALUE_OUT", prunValueOut, true);
				
			cmd.execute();
			prunValueOut.val = cmd.getParameterValue("@PRUN_VALUE_OUT", NString.class);

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fValidPopulationSelection4(NString parmOneUpNo,NString pdef4No1,NString pdef4No2,NString pdef4No3,NString pdef4No4) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICOKPVAL.F_VALID_POPULATION_SELECTION4", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@PDEF4_NO1", pdef4No1);
			cmd.addParameter("@PDEF4_NO2", pdef4No2);
			cmd.addParameter("@PDEF4_NO3", pdef4No3);
			cmd.addParameter("@PDEF4_NO4", pdef4No4);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void pCallProcedure(NString validationLabel,NNumber parmOneUpNo,NString validationValue,Ref<NString> validationErrorInd,Ref<NString> validationErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICOKPVAL.P_CALL_PROCEDURE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VALIDATION_LABEL", validationLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VALIDATION_VALUE", validationValue);
			cmd.addParameter("@VALIDATION_ERROR_IND", NString.class);
			cmd.addParameter("@VALIDATION_ERROR_MSG", NString.class);
				
			cmd.execute();
			validationErrorInd.val = cmd.getParameterValue("@VALIDATION_ERROR_IND", NString.class);
			validationErrorMsg.val = cmd.getParameterValue("@VALIDATION_ERROR_MSG", NString.class);


		}
		
		public static void pCheckParameter(NString validationLabel,NNumber parmOneUpNo,NString validationValue,Ref<NString> validationErrorInd,Ref<NString> validationErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICOKPVAL.P_CHECK_PARAMETER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VALIDATION_LABEL", validationLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VALIDATION_VALUE", validationValue);
			cmd.addParameter("@VALIDATION_ERROR_IND", NString.class);
			cmd.addParameter("@VALIDATION_ERROR_MSG", NString.class);
				
			cmd.execute();
			validationErrorInd.val = cmd.getParameterValue("@VALIDATION_ERROR_IND", NString.class);
			validationErrorMsg.val = cmd.getParameterValue("@VALIDATION_ERROR_MSG", NString.class);


		}
		
		public static void pGenericPopSel(NString validationLabel,NNumber parmOneUpNo,NString validationValue,Ref<NString> validationErrorInd,Ref<NString> validationErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICOKPVAL.P_GENERIC_POP_SEL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VALIDATION_LABEL", validationLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VALIDATION_VALUE", validationValue);
			cmd.addParameter("@VALIDATION_ERROR_IND", NString.class);
			cmd.addParameter("@VALIDATION_ERROR_MSG", NString.class);
				
			cmd.execute();
			validationErrorInd.val = cmd.getParameterValue("@VALIDATION_ERROR_IND", NString.class);
			validationErrorMsg.val = cmd.getParameterValue("@VALIDATION_ERROR_MSG", NString.class);


		}
		
		public static void pSetError(NString validationLabel,Ref<NString> validationErrorInd,Ref<NString> validationErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICOKPVAL.P_SET_ERROR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VALIDATION_LABEL", validationLabel);
			cmd.addParameter("@VALIDATION_ERROR_IND", NString.class);
			cmd.addParameter("@VALIDATION_ERROR_MSG", NString.class);
				
			cmd.execute();
			validationErrorInd.val = cmd.getParameterValue("@VALIDATION_ERROR_IND", NString.class);
			validationErrorMsg.val = cmd.getParameterValue("@VALIDATION_ERROR_MSG", NString.class);


		}
		
		public static void pSobtermExtract(NString validationLabel,NNumber parmOneUpNo,NString validationValue,Ref<NString> validationErrorInd,Ref<NString> validationErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICOKPVAL.P_SOBTERM_EXTRACT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VALIDATION_LABEL", validationLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VALIDATION_VALUE", validationValue);
			cmd.addParameter("@VALIDATION_ERROR_IND", NString.class);
			cmd.addParameter("@VALIDATION_ERROR_MSG", NString.class);
				
			cmd.execute();
			validationErrorInd.val = cmd.getParameterValue("@VALIDATION_ERROR_IND", NString.class);
			validationErrorMsg.val = cmd.getParameterValue("@VALIDATION_ERROR_MSG", NString.class);


		}
		
		public static void pValidInsmCode(NString validationLabel,NNumber parmOneUpNo,NString validationValue,Ref<NString> validationErrorInd,Ref<NString> validationErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICOKPVAL.P_VALID_INSM_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VALIDATION_LABEL", validationLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VALIDATION_VALUE", validationValue);
			cmd.addParameter("@VALIDATION_ERROR_IND", NString.class);
			cmd.addParameter("@VALIDATION_ERROR_MSG", NString.class);
				
			cmd.execute();
			validationErrorInd.val = cmd.getParameterValue("@VALIDATION_ERROR_IND", NString.class);
			validationErrorMsg.val = cmd.getParameterValue("@VALIDATION_ERROR_MSG", NString.class);


		}
		
		public static void pValidIntgCde(NString validationLabel,NNumber parmOneUpNo,NString validationValue,Ref<NString> validationErrorInd,Ref<NString> validationErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICOKPVAL.P_VALID_INTG_CDE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VALIDATION_LABEL", validationLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VALIDATION_VALUE", validationValue);
			cmd.addParameter("@VALIDATION_ERROR_IND", NString.class);
			cmd.addParameter("@VALIDATION_ERROR_MSG", NString.class);
				
			cmd.execute();
			validationErrorInd.val = cmd.getParameterValue("@VALIDATION_ERROR_IND", NString.class);
			validationErrorMsg.val = cmd.getParameterValue("@VALIDATION_ERROR_MSG", NString.class);


		}
		
		public static void pValidSchdCode(NString validationLabel,NNumber parmOneUpNo,NString validationValue,Ref<NString> validationErrorInd,Ref<NString> validationErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICOKPVAL.P_VALID_SCHD_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VALIDATION_LABEL", validationLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VALIDATION_VALUE", validationValue);
			cmd.addParameter("@VALIDATION_ERROR_IND", NString.class);
			cmd.addParameter("@VALIDATION_ERROR_MSG", NString.class);
				
			cmd.execute();
			validationErrorInd.val = cmd.getParameterValue("@VALIDATION_ERROR_IND", NString.class);
			validationErrorMsg.val = cmd.getParameterValue("@VALIDATION_ERROR_MSG", NString.class);


		}
		
		public static void pValidSqruCode(NString validationLabel,NNumber parmOneUpNo,NString validationValue,Ref<NString> validationErrorInd,Ref<NString> validationErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICOKPVAL.P_VALID_SQRU_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VALIDATION_LABEL", validationLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VALIDATION_VALUE", validationValue);
			cmd.addParameter("@VALIDATION_ERROR_IND", NString.class);
			cmd.addParameter("@VALIDATION_ERROR_MSG", NString.class);
				
			cmd.execute();
			validationErrorInd.val = cmd.getParameterValue("@VALIDATION_ERROR_IND", NString.class);
			validationErrorMsg.val = cmd.getParameterValue("@VALIDATION_ERROR_MSG", NString.class);


		}
		
		public static void pValidate(NString validationLabel,NNumber parmOneUpNo,NString validationValue,Ref<NString> validationErrorInd,Ref<NString> validationErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICOKPVAL.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VALIDATION_LABEL", validationLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VALIDATION_VALUE", validationValue);
			cmd.addParameter("@VALIDATION_ERROR_IND", validationErrorInd, true);
			cmd.addParameter("@VALIDATION_ERROR_MSG", validationErrorMsg, true);
				
			cmd.execute();
			validationErrorInd.val = cmd.getParameterValue("@VALIDATION_ERROR_IND", NString.class);
			validationErrorMsg.val = cmd.getParameterValue("@VALIDATION_ERROR_MSG", NString.class);


		}
		
	
	
	
}
