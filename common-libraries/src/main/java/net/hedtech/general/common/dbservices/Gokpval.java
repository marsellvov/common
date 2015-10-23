package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Gokpval {
		public static NNumber fGetDbmsSql() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKPVAL.F_GET_DBMS_SQL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NBool fSelectGjbprun1(NString prunNumberIn,NNumber parmOneUpNo,NBool checkForNull,Ref<NString> prunValueOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKPVAL.F_SELECT_GJBPRUN_1", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PRUN_NUMBER_IN", prunNumberIn);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@CHECK_FOR_NULL", checkForNull);
			cmd.addParameter("@PRUN_VALUE_OUT", prunValueOut, true);
				
			cmd.execute();
			prunValueOut.val = cmd.getParameterValue("@PRUN_VALUE_OUT", NString.class);

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fValidJobsubParm(NString parmType,NString parmValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKPVAL.F_VALID_JOBSUB_PARM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PARM_TYPE", parmType);
			cmd.addParameter("@PARM_VALUE", parmValue);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fValidPopulationSelection4(NString parmOneUpNo,NString pdef4No1,NString pdef4No2,NString pdef4No3,NString pdef4No4) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKPVAL.F_VALID_POPULATION_SELECTION4", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@PDEF4_NO1", pdef4No1);
			cmd.addParameter("@PDEF4_NO2", pdef4No2);
			cmd.addParameter("@PDEF4_NO3", pdef4No3);
			cmd.addParameter("@PDEF4_NO4", pdef4No4);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void pGenericPopSel(NString validationLabel,NNumber parmOneUpNo,Ref<NString> validationErrorInd,Ref<NString> validationErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKPVAL.P_GENERIC_POP_SEL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VALIDATION_LABEL", validationLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VALIDATION_ERROR_IND", NString.class);
			cmd.addParameter("@VALIDATION_ERROR_MSG", NString.class);
				
			cmd.execute();
			validationErrorInd.val = cmd.getParameterValue("@VALIDATION_ERROR_IND", NString.class);
			validationErrorMsg.val = cmd.getParameterValue("@VALIDATION_ERROR_MSG", NString.class);


		}
		
		public static void pValidate(NString validationLabel,NNumber parmOneUpNo,NString validationValue,Ref<NString> validationErrorInd,Ref<NString> validationErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKPVAL.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VALIDATION_LABEL", validationLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VALIDATION_VALUE", validationValue);
			cmd.addParameter("@VALIDATION_ERROR_IND", NString.class);
			cmd.addParameter("@VALIDATION_ERROR_MSG", NString.class);
				
			cmd.execute();
			validationErrorInd.val = cmd.getParameterValue("@VALIDATION_ERROR_IND", NString.class);
			validationErrorMsg.val = cmd.getParameterValue("@VALIDATION_ERROR_MSG", NString.class);


		}
		
		public static void pValidateGlbdata(NNumber parmOneUpNo,Ref<NString> valErrInd,Ref<NString> valErrMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKPVAL.P_VALIDATE_GLBDATA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_ERR_IND", NString.class);
			cmd.addParameter("@VAL_ERR_MSG", NString.class);
				
			cmd.execute();
			valErrInd.val = cmd.getParameterValue("@VAL_ERR_IND", NString.class);
			valErrMsg.val = cmd.getParameterValue("@VAL_ERR_MSG", NString.class);


		}
		
		public static void pValidateGlblsel(NNumber parmOneUpNo,Ref<NString> valErrInd,Ref<NString> valErrMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKPVAL.P_VALIDATE_GLBLSEL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_ERR_IND", NString.class);
			cmd.addParameter("@VAL_ERR_MSG", NString.class);
				
			cmd.execute();
			valErrInd.val = cmd.getParameterValue("@VAL_ERR_IND", NString.class);
			valErrMsg.val = cmd.getParameterValue("@VAL_ERR_MSG", NString.class);


		}
		
	
	
	
}
