package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Gokparm {
		public static void handleError(NNumber seqNo,NString vEqtsCode,NString vEqnmCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKPARM.HANDLE_ERROR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SEQ_NO", seqNo);
			cmd.addParameter("@V_EQTS_CODE", vEqtsCode);
			cmd.addParameter("@V_EQNM_CODE", vEqnmCode);
				
			cmd.execute();


		}
		
//		public static void sendParamList(NString eventNameIn,Ref<List<ParamTabTypeRow>> paramTabIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKPARM.SEND_PARAM_LIST", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@EVENT_NAME_IN", eventNameIn);
//			// cmd.addParameter(DbTypes.getTableType("PARAM_TAB_IN", "", paramTabIn.val, object.class , true));
//				
//			cmd.execute();
//			// paramTabIn.val = cmd.getTableParameterValue("@PARAM_TAB_IN", object.class);
//
//
//		}
		
//		public static void sendParamList(NString evntName,Ref<List<TParameterlistRow>> pParameters) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKPARM.SEND_PARAM_LIST", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@EVNT_NAME", evntName);
//			// cmd.addParameter(DbTypes.getTableType("P_PARAMETERS", "", pParameters.val, object.class , true));
//				
//			cmd.execute();
//			// pParameters.val = cmd.getTableParameterValue("@P_PARAMETERS", object.class);
//
//
//		}
		
//		public static void sendParamList(NString evntName,Ref<List<TParameterlistRow>> pParameters,Ref<NBool> errorInd) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKPARM.SEND_PARAM_LIST", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@EVNT_NAME", evntName);
//			// cmd.addParameter(DbTypes.getTableType("P_PARAMETERS", "", pParameters.val, object.class , true));
//			cmd.addParameter("@ERROR_IND", errorInd, true);
//				
//			cmd.execute();
//			// pParameters.val = cmd.getTableParameterValue("@P_PARAMETERS", object.class);
//			errorInd.val = cmd.getParameterValue("@ERROR_IND", NBool.class);
//
//
//		}
		
	
	
	@DbRecordType(id="ParamRecTypeRow", dataSourceName="PARAM_REC_TYPE")
	public static class ParamRecTypeRow
	{
		@DbRecordField(dataSourceName="PARAM_NAME")
		public NString ParamName;
		@DbRecordField(dataSourceName="PARAM_VALUE")
		public NString ParamValue;
	}

	
	@DbRecordType(id="TParameterRow", dataSourceName="T_PARAMETER")
	public static class TParameterRow
	{
		@DbRecordField(dataSourceName="PARAM_VALUE")
		public NString ParamValue;
	}

	
	
}
