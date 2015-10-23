package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Gokdapi {
		public static void deleteParams() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKDAPI.DELETE_PARAMS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void describeproc(NString pProcname,NBool pPrint) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKDAPI.DESCRIBEPROC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PROCNAME", pProcname);
			cmd.addParameter("@P_PRINT", pPrint);
				
			cmd.execute();


		}
		
		public static void describeproc(NString pProcname,NNumber pParmPos,NBool pPrint) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKDAPI.DESCRIBEPROC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PROCNAME", pProcname);
			cmd.addParameter("@P_PARM_POS", pParmPos);
			cmd.addParameter("@P_PRINT", pPrint);
				
			cmd.execute();


		}
		
		public static NString FexecFunc(NString funcName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKDAPI.EXEC_FUNC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@FUNC_NAME", funcName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool FgetFunctionRetBoolean() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKDAPI.GET_FUNCTION_RET_BOOLEAN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NNumber FgetFunctionRetNum() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKDAPI.GET_FUNCTION_RET_NUM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString FgetFunctionRetVchar() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKDAPI.GET_FUNCTION_RET_VCHAR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static void printparamsF(List<TParameterlistRow> pParameters) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKDAPI.PRINTPARAMS_F", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("P_PARAMETERS", "", pParameters, object.class));
//				
//			cmd.execute();
//
//
//		}
		
//		public static void printparamsP(List<TParameterlistRow> pParameters) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKDAPI.PRINTPARAMS_P", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("P_PARAMETERS", "", pParameters, object.class));
//				
//			cmd.execute();
//
//
//		}
		
//		public static void runfunc(NString pFuncname,Ref<List<TParameterlistRow>> pParameters) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKDAPI.RUNFUNC", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_FUNCNAME", pFuncname);
//			// cmd.addParameter(DbTypes.getTableType("P_PARAMETERS", "", pParameters.val, object.class , true));
//				
//			cmd.execute();
//			// pParameters.val = cmd.getTableParameterValue("@P_PARAMETERS", object.class);
//
//
//		}
		
//		public static void runproc(NString pProcname,Ref<List<TParameterlistRow>> pParameters) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKDAPI.RUNPROC", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_PROCNAME", pProcname);
//			// cmd.addParameter(DbTypes.getTableType("P_PARAMETERS", "", pParameters.val, object.class , true));
//				
//			cmd.execute();
//			// pParameters.val = cmd.getTableParameterValue("@P_PARAMETERS", object.class);
//
//
//		}
		
		public static void setParameters(NNumber seq,NString paramValue,NString paramType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKDAPI.SET_PARAMETERS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SEQ", seq);
			cmd.addParameter("@PARAM_VALUE", paramValue);
			cmd.addParameter("@PARAM_TYPE", paramType);
				
			cmd.execute();


		}
		
		public static void setParams(NNumber seq,NNumber paramValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKDAPI.SET_PARAMS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SEQ", seq);
			cmd.addParameter("@PARAM_VALUE", paramValue);
				
			cmd.execute();


		}
		
		public static void setParams(NNumber seq,NString paramValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKDAPI.SET_PARAMS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SEQ", seq);
			cmd.addParameter("@PARAM_VALUE", paramValue);
				
			cmd.execute();


		}
		
		public static void setParams(NNumber seq,NDate paramValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKDAPI.SET_PARAMS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SEQ", seq);
			cmd.addParameter("@PARAM_VALUE", paramValue);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="TParameterRow", dataSourceName="T_PARAMETER")
	public static class TParameterRow
	{
		@DbRecordField(dataSourceName="ACTUAL_TYPE")
		public NString ActualType;
		@DbRecordField(dataSourceName="ACTUAL_LENGTH")
		public NNumber ActualLength;
		@DbRecordField(dataSourceName="V_NAME")
		public NString VName;
		@DbRecordField(dataSourceName="NUM_PARAM")
		public NNumber NumParam;
		@DbRecordField(dataSourceName="VCHAR_PARAM")
		public NString VcharParam;
		@DbRecordField(dataSourceName="CHAR_PARAM")
		public NString CharParam;
		@DbRecordField(dataSourceName="DATE_PARAM")
		public NDate DateParam;
		@DbRecordField(dataSourceName="BOOLEAN_PARAM")
		public NBool BooleanParam;
		@DbRecordField(dataSourceName="ERR_IND_PARAM")
		public NString ErrIndParam;
		@DbRecordField(dataSourceName="ERR_MESS_PARAM")
		public NString ErrMessParam;
		@DbRecordField(dataSourceName="ERR_TEXT_PARAM")
		public NString ErrTextParam;
		@DbRecordField(dataSourceName="ERR_IND_PARAM_F")
		public NString ErrIndParamF;
		@DbRecordField(dataSourceName="ERR_MESS_PARAM_F")
		public NString ErrMessParamF;
		@DbRecordField(dataSourceName="ERR_TEXT_PARAM_F")
		public NString ErrTextParamF;
		@DbRecordField(dataSourceName="NUM_PARAM_F")
		public NNumber NumParamF;
		@DbRecordField(dataSourceName="VCHAR_PARAM_F")
		public NString VcharParamF;
		@DbRecordField(dataSourceName="DATE_PARAM_F")
		public NDate DateParamF;
		@DbRecordField(dataSourceName="BOOLEAN_PARAM_F")
		public NBool BooleanParamF;
	}

	
	
}
