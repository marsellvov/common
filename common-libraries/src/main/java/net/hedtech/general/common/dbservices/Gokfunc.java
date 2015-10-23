package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Gokfunc {
		public static NString fGetCtrlValue(NString ctrlTypeIn,NString functionIn,NNumber tctlNumIn,NString dlnIndIn,NString termIn,NString aidyIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKFUNC.F_GET_CTRL_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@CTRL_TYPE_IN", ctrlTypeIn);
			cmd.addParameter("@FUNCTION_IN", functionIn);
			cmd.addParameter("@TCTL_NUM_IN", tctlNumIn);
			cmd.addParameter("@DLN_IND_IN", dlnIndIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@AIDY_IN", aidyIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetCtrlValue2(NString ctrlTypeIn,NString functionIn,NNumber tctlNumIn,NString dlnIndIn,NString termIn,NString aidyIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKFUNC.F_GET_CTRL_VALUE_2", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@CTRL_TYPE_IN", ctrlTypeIn);
			cmd.addParameter("@FUNCTION_IN", functionIn);
			cmd.addParameter("@TCTL_NUM_IN", tctlNumIn);
			cmd.addParameter("@DLN_IND_IN", dlnIndIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@AIDY_IN", aidyIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetCtrlValue3(NString ctrlTypeIn,NString functionIn,NNumber tctlNumIn,NString dlnIndIn,NString termIn,NString aidyIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKFUNC.F_GET_CTRL_VALUE_3", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@CTRL_TYPE_IN", ctrlTypeIn);
			cmd.addParameter("@FUNCTION_IN", functionIn);
			cmd.addParameter("@TCTL_NUM_IN", tctlNumIn);
			cmd.addParameter("@DLN_IND_IN", dlnIndIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@AIDY_IN", aidyIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetCurrentPin(NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKFUNC.F_GET_CURRENT_PIN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetDefaultSubcode(NString groupIn,NString defaultLabelIn,NString defaultGroupIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKFUNC.F_GET_DEFAULT_SUBCODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@GROUP_IN", groupIn);
			cmd.addParameter("@DEFAULT_LABEL_IN", defaultLabelIn);
			cmd.addParameter("@DEFAULT_GROUP_IN", defaultGroupIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool fTriesExceedMax(NString groupIn,NString funcIn,Ref<NNumber> triesInOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKFUNC.F_TRIES_EXCEED_MAX", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@GROUP_IN", groupIn);
			cmd.addParameter("@FUNC_IN", funcIn);
			cmd.addParameter("@TRIES_IN_OUT", triesInOut, true);
				
			cmd.execute();
			triesInOut.val = cmd.getParameterValue("@TRIES_IN_OUT", NNumber.class);

			return cmd.getReturnValue(NBool.class);

		}
		
//		public static void pGetControls(Ref<List<Goktabs.GortctlTabTypeRow>> gortctlTable,Ref<NNumber> numRecsInOut,NString groupIn,NString functionIn,NNumber tctlNumIn,NString termIn,NString dlnIndIn,NString aidyIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKFUNC.P_GET_CONTROLS", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("GORTCTL_TABLE", "", gortctlTable.val, object.class , true));
//			cmd.addParameter("@NUM_RECS_IN_OUT", numRecsInOut, true);
//			cmd.addParameter("@GROUP_IN", groupIn);
//			cmd.addParameter("@FUNCTION_IN", functionIn);
//			cmd.addParameter("@TCTL_NUM_IN", tctlNumIn);
//			cmd.addParameter("@TERM_IN", termIn);
//			cmd.addParameter("@DLN_IND_IN", dlnIndIn);
//			cmd.addParameter("@AIDY_IN", aidyIn);
//				
//			cmd.execute();
//			// gortctlTable.val = cmd.getTableParameterValue("@GORTCTL_TABLE", object.class);
//			numRecsInOut.val = cmd.getParameterValue("@NUM_RECS_IN_OUT", NNumber.class);
//
//
//		}
		
//		public static void pGetGtvvpdi(Ref<List<Goktabs.GtvvpdiTabTypeRow>> gtvvpdiTable,Ref<NNumber> numRecsInOut,NString vrOnlyIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKFUNC.P_GET_GTVVPDI", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("GTVVPDI_TABLE", "", gtvvpdiTable.val, object.class , true));
//			cmd.addParameter("@NUM_RECS_IN_OUT", numRecsInOut, true);
//			cmd.addParameter("@VR_ONLY_IN", vrOnlyIn);
//				
//			cmd.execute();
//			// gtvvpdiTable.val = cmd.getTableParameterValue("@GTVVPDI_TABLE", object.class);
//			numRecsInOut.val = cmd.getParameterValue("@NUM_RECS_IN_OUT", NNumber.class);
//
//
//		}
		
		public static void pMatchMmid(Ref<NString> subCodeInOut,NString groupIn,NString criterion1LabelIn,NString criterion1In,NString criterion2LabelIn,NString criterion2In,NString criterion3LabelIn,NString criterion3In,NString criterion4LabelIn,NString criterion4In,NString criterion5LabelIn,NString criterion5In,NString criterion6LabelIn,NString criterion6In,NString criterion7LabelIn,NString criterion7In,NString criterion8LabelIn,NString criterion8In,NString criterion9LabelIn,NString criterion9In,NString criterion10LabelIn,NString criterion10In) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKFUNC.P_MATCH_MMID", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SUB_CODE_IN_OUT", subCodeInOut, true);
			cmd.addParameter("@GROUP_IN", groupIn);
			cmd.addParameter("@CRITERION1_LABEL_IN", criterion1LabelIn);
			cmd.addParameter("@CRITERION1_IN", criterion1In);
			cmd.addParameter("@CRITERION2_LABEL_IN", criterion2LabelIn);
			cmd.addParameter("@CRITERION2_IN", criterion2In);
			cmd.addParameter("@CRITERION3_LABEL_IN", criterion3LabelIn);
			cmd.addParameter("@CRITERION3_IN", criterion3In);
			cmd.addParameter("@CRITERION4_LABEL_IN", criterion4LabelIn);
			cmd.addParameter("@CRITERION4_IN", criterion4In);
			cmd.addParameter("@CRITERION5_LABEL_IN", criterion5LabelIn);
			cmd.addParameter("@CRITERION5_IN", criterion5In);
			cmd.addParameter("@CRITERION6_LABEL_IN", criterion6LabelIn);
			cmd.addParameter("@CRITERION6_IN", criterion6In);
			cmd.addParameter("@CRITERION7_LABEL_IN", criterion7LabelIn);
			cmd.addParameter("@CRITERION7_IN", criterion7In);
			cmd.addParameter("@CRITERION8_LABEL_IN", criterion8LabelIn);
			cmd.addParameter("@CRITERION8_IN", criterion8In);
			cmd.addParameter("@CRITERION9_LABEL_IN", criterion9LabelIn);
			cmd.addParameter("@CRITERION9_IN", criterion9In);
			cmd.addParameter("@CRITERION10_LABEL_IN", criterion10LabelIn);
			cmd.addParameter("@CRITERION10_IN", criterion10In);
				
			cmd.execute();
			subCodeInOut.val = cmd.getParameterValue("@SUB_CODE_IN_OUT", NString.class);


		}
		
		public static void pValidateCcAmount(Ref<NString> charAmtInOut,Ref<NNumber> amountInOut,Ref<NString> validAmtInOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKFUNC.P_VALIDATE_CC_AMOUNT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CHAR_AMT_IN_OUT", charAmtInOut, true);
			cmd.addParameter("@AMOUNT_IN_OUT", amountInOut, true);
			cmd.addParameter("@VALID_AMT_IN_OUT", validAmtInOut, true);
				
			cmd.execute();
			charAmtInOut.val = cmd.getParameterValue("@CHAR_AMT_IN_OUT", NString.class);
			amountInOut.val = cmd.getParameterValue("@AMOUNT_IN_OUT", NNumber.class);
			validAmtInOut.val = cmd.getParameterValue("@VALID_AMT_IN_OUT", NString.class);


		}
		
	
	
	
}
