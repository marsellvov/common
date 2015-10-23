package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Twbkfunc {
		public static NString fBuildParamName(NString subsysId,NString functionName,NString optionLabel,NNumber optionNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFUNC.F_BUILD_PARAM_NAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@SUBSYS_ID", subsysId);
			cmd.addParameter("@FUNCTION_NAME", functionName);
			cmd.addParameter("@OPTION_LABEL", optionLabel);
			cmd.addParameter("@OPTION_NUM", optionNum);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fLoadAndStoreParamValue(NNumber pidmIn,NString subsysId,NString functionName,NString optionTypeIn,NNumber optionNumIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFUNC.F_LOAD_AND_STORE_PARAM_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@SUBSYS_ID", subsysId);
			cmd.addParameter("@FUNCTION_NAME", functionName);
			cmd.addParameter("@OPTION_TYPE_IN", optionTypeIn);
			cmd.addParameter("@OPTION_NUM_IN", optionNumIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pDelTwgrwprmByPidmName(NNumber pidmIn,NString paramName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFUNC.P_DEL_TWGRWPRM_BY_PIDM_NAME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@PARAM_NAME", paramName);
				
			cmd.execute();


		}
		
		public static void pDelTwgrwprmByValue(NString paramValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFUNC.P_DEL_TWGRWPRM_BY_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARAM_VALUE", paramValue);
				
			cmd.execute();


		}
		
//		public static void pGetTwgrwprmRows(NNumber pidmIn,NString nameIn,Ref<NNumber> rowCntInOut,Ref<List<Twbktabs.TwgrwprmTabTypeRow>> twgrwprmRowTable) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFUNC.P_GET_TWGRWPRM_ROWS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@PIDM_IN", pidmIn);
//			cmd.addParameter("@NAME_IN", nameIn);
//			cmd.addParameter("@ROW_CNT_IN_OUT", rowCntInOut, true);
//			// cmd.addParameter(DbTypes.getTableType("TWGRWPRM_ROW_TABLE", "", twgrwprmRowTable.val, object.class , true));
//				
//			cmd.execute();
//			rowCntInOut.val = cmd.getParameterValue("@ROW_CNT_IN_OUT", NNumber.class);
//			// twgrwprmRowTable.val = cmd.getTableParameterValue("@TWGRWPRM_ROW_TABLE", object.class);
//
//
//		}
		
		public static void pStoreTwgrwprmRow(NNumber pidmIn,NString subsysId,NString functionName,NString optionTypeIn,NNumber optionNumIn,NString valueIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFUNC.P_STORE_TWGRWPRM_ROW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@SUBSYS_ID", subsysId);
			cmd.addParameter("@FUNCTION_NAME", functionName);
			cmd.addParameter("@OPTION_TYPE_IN", optionTypeIn);
			cmd.addParameter("@OPTION_NUM_IN", optionNumIn);
			cmd.addParameter("@VALUE_IN", valueIn);
				
			cmd.execute();


		}
		
		public static void pValidateSessionId(NNumber pidmIn,NString valueIn,Ref<NString> tempidInOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFUNC.P_VALIDATE_SESSION_ID", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@VALUE_IN", valueIn);
			cmd.addParameter("@TEMPID_IN_OUT", tempidInOut, true);
				
			cmd.execute();
			tempidInOut.val = cmd.getParameterValue("@TEMPID_IN_OUT", NString.class);


		}
		
	
	
	
}
