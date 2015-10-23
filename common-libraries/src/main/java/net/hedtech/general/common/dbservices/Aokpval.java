package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Aokpval {
		public static NBool fAabmshpEqual(NString codeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKPVAL.F_AABMSHP_EQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@CODE_IN", codeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fAdbdesgEqual(NString codeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKPVAL.F_ADBDESG_EQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@CODE_IN", codeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fAfbcampEqual(NString campIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKPVAL.F_AFBCAMP_EQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@CAMP_IN", campIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fAfrdesgEqual(NString campIn,NString desgIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKPVAL.F_AFRDESG_EQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@CAMP_IN", campIn);
			cmd.addParameter("@DESG_IN", desgIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fAoborgnEqual(NString idIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKPVAL.F_AOBORGN_EQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@ID_IN", idIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fAsbsorgEqual(NString codeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKPVAL.F_ASBSORG_EQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@CODE_IN", codeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fAtvdcyrLike(NString codeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKPVAL.F_ATVDCYR_LIKE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@CODE_IN", codeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fAtvdonrNonalu(NString codeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKPVAL.F_ATVDONR_NONALU", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@CODE_IN", codeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fAtvdsrcEqual(NString codeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKPVAL.F_ATVDSRC_EQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@CODE_IN", codeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fAtvdstaActive(NString codeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKPVAL.F_ATVDSTA_ACTIVE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@CODE_IN", codeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fAtvsaluEqual(NString codeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKPVAL.F_ATVSALU_EQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@CODE_IN", codeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fAtvtapeEqual(NString codeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKPVAL.F_ATVTAPE_EQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@CODE_IN", codeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fGjbprun(NString inNumber,NNumber inParmNo,Ref<NString> outvar) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKPVAL.F_GJBPRUN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@IN_NUMBER", inNumber);
			cmd.addParameter("@IN_PARM_NO", inParmNo);
			cmd.addParameter("@OUTVAR", outvar, true);
				
			cmd.execute();
			outvar.val = cmd.getParameterValue("@OUTVAR", NString.class);

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fGlbapplEqual(NString codeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKPVAL.F_GLBAPPL_EQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@CODE_IN", codeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fGlbslctEqual(NString codeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKPVAL.F_GLBSLCT_EQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@CODE_IN", codeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fGtvemalEqual(NString codeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKPVAL.F_GTVEMAL_EQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@CODE_IN", codeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fGtvletrLike(NString codeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKPVAL.F_GTVLETR_LIKE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@CODE_IN", codeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fStvcollLike(NString codeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKPVAL.F_STVCOLL_LIKE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@CODE_IN", codeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fStvmajrLike(NString codeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKPVAL.F_STVMAJR_LIKE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@CODE_IN", codeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fStvteleEqual(NString codeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKPVAL.F_STVTELE_EQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@CODE_IN", codeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fStvtermLike(NString codeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKPVAL.F_STVTERM_LIKE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@CODE_IN", codeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fValidPopulationSelection4(NString parmOneUpNo,NString pdef4No1,NString pdef4No2,NString pdef4No3,NString pdef4No4) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKPVAL.F_VALID_POPULATION_SELECTION4", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@PDEF4_NO1", pdef4No1);
			cmd.addParameter("@PDEF4_NO2", pdef4No2);
			cmd.addParameter("@PDEF4_NO3", pdef4No3);
			cmd.addParameter("@PDEF4_NO4", pdef4No4);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void pAdpexpdValidParms(NString parmOneUp,Ref<NString> valErrInd,Ref<NString> valErrMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKPVAL.P_ADPEXPD_VALID_PARMS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_ONE_UP", parmOneUp);
			cmd.addParameter("@VAL_ERR_IND", NString.class);
			cmd.addParameter("@VAL_ERR_MSG", NString.class);
				
			cmd.execute();
			valErrInd.val = cmd.getParameterValue("@VAL_ERR_IND", NString.class);
			valErrMsg.val = cmd.getParameterValue("@VAL_ERR_MSG", NString.class);


		}
		
		public static void pAgpmatcValidParms(NString parmOneUp,Ref<NString> valErrInd,Ref<NString> valErrMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKPVAL.P_AGPMATC_VALID_PARMS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_ONE_UP", parmOneUp);
			cmd.addParameter("@VAL_ERR_IND", NString.class);
			cmd.addParameter("@VAL_ERR_MSG", NString.class);
				
			cmd.execute();
			valErrInd.val = cmd.getParameterValue("@VAL_ERR_IND", NString.class);
			valErrMsg.val = cmd.getParameterValue("@VAL_ERR_MSG", NString.class);


		}
		
		public static void pAgppoutValidParms(NString parmOneUp,Ref<NString> valErrInd,Ref<NString> valErrMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKPVAL.P_AGPPOUT_VALID_PARMS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_ONE_UP", parmOneUp);
			cmd.addParameter("@VAL_ERR_IND", NString.class);
			cmd.addParameter("@VAL_ERR_MSG", NString.class);
				
			cmd.execute();
			valErrInd.val = cmd.getParameterValue("@VAL_ERR_IND", NString.class);
			valErrMsg.val = cmd.getParameterValue("@VAL_ERR_MSG", NString.class);


		}
		
		public static void pAppdextValidParms(NString valLabel,NString parmOneUp,Ref<NString> valErrInd,Ref<NString> valErrMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKPVAL.P_APPDEXT_VALID_PARMS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP", parmOneUp);
			cmd.addParameter("@VAL_ERR_IND", NString.class);
			cmd.addParameter("@VAL_ERR_MSG", NString.class);
				
			cmd.execute();
			valErrInd.val = cmd.getParameterValue("@VAL_ERR_IND", NString.class);
			valErrMsg.val = cmd.getParameterValue("@VAL_ERR_MSG", NString.class);


		}
		
		public static void pAspsolaValidParms(NString parmOneUp,Ref<NString> valErrInd,Ref<NString> valErrMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKPVAL.P_ASPSOLA_VALID_PARMS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_ONE_UP", parmOneUp);
			cmd.addParameter("@VAL_ERR_IND", NString.class);
			cmd.addParameter("@VAL_ERR_MSG", NString.class);
				
			cmd.execute();
			valErrInd.val = cmd.getParameterValue("@VAL_ERR_IND", NString.class);
			valErrMsg.val = cmd.getParameterValue("@VAL_ERR_MSG", NString.class);


		}
		
		public static void pAspsolbValidParms(NString parmOneUp,Ref<NString> valErrInd,Ref<NString> valErrMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKPVAL.P_ASPSOLB_VALID_PARMS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_ONE_UP", parmOneUp);
			cmd.addParameter("@VAL_ERR_IND", NString.class);
			cmd.addParameter("@VAL_ERR_MSG", NString.class);
				
			cmd.execute();
			valErrInd.val = cmd.getParameterValue("@VAL_ERR_IND", NString.class);
			valErrMsg.val = cmd.getParameterValue("@VAL_ERR_MSG", NString.class);


		}
		
		public static void pGenericPopSel(NString validationLabel,NNumber parmOneUpNo,Ref<NString> validationErrorInd,Ref<NString> validationErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKPVAL.P_GENERIC_POP_SEL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VALIDATION_LABEL", validationLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VALIDATION_ERROR_IND", NString.class);
			cmd.addParameter("@VALIDATION_ERROR_MSG", NString.class);
				
			cmd.execute();
			validationErrorInd.val = cmd.getParameterValue("@VALIDATION_ERROR_IND", NString.class);
			validationErrorMsg.val = cmd.getParameterValue("@VALIDATION_ERROR_MSG", NString.class);


		}
		
		public static void pPaChkCentury(NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKPVAL.P_PA_CHK_CENTURY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pSetError(NString valLabel,Ref<NString> valErrInd,Ref<NString> valErrMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKPVAL.P_SET_ERROR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@VAL_ERR_IND", NString.class);
			cmd.addParameter("@VAL_ERR_MSG", NString.class);
				
			cmd.execute();
			valErrInd.val = cmd.getParameterValue("@VAL_ERR_IND", NString.class);
			valErrMsg.val = cmd.getParameterValue("@VAL_ERR_MSG", NString.class);


		}
		
		public static void pValidate(NString validationLabel,NNumber parmOneUpNo,NString validationValue,Ref<NString> validationErrorInd,Ref<NString> validationErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKPVAL.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VALIDATION_LABEL", validationLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VALIDATION_VALUE", validationValue);
			cmd.addParameter("@VALIDATION_ERROR_IND", NString.class);
			cmd.addParameter("@VALIDATION_ERROR_MSG", NString.class);
				
			cmd.execute();
			validationErrorInd.val = cmd.getParameterValue("@VALIDATION_ERROR_IND", NString.class);
			validationErrorMsg.val = cmd.getParameterValue("@VALIDATION_ERROR_MSG", NString.class);


		}
		
		public static void pValidateStvstyp(NString codeIn,Ref<NString> valErrInd,Ref<NString> valErrMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKPVAL.P_VALIDATE_STVSTYP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CODE_IN", codeIn);
			cmd.addParameter("@VAL_ERR_IND", NString.class);
			cmd.addParameter("@VAL_ERR_MSG", NString.class);
				
			cmd.execute();
			valErrInd.val = cmd.getParameterValue("@VAL_ERR_IND", NString.class);
			valErrMsg.val = cmd.getParameterValue("@VAL_ERR_MSG", NString.class);


		}
		
	
	
	
}
