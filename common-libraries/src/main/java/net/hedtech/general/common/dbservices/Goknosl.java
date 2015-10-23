package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Goknosl {
		public static NString fDefaultPrinterForProcess(NString pProcess,NString pParmNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKNOSL.F_DEFAULT_PRINTER_FOR_PROCESS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PROCESS", pProcess);
			cmd.addParameter("@P_PARM_NO", pParmNo);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fFormNameForProcess(NString pProcess) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKNOSL.F_FORM_NAME_FOR_PROCESS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PROCESS", pProcess);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fNextOneUpNo() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKNOSL.F_NEXT_ONE_UP_NO", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NBool fNosleepOnForProcess(NString pProcess) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKNOSL.F_NOSLEEP_ON_FOR_PROCESS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_PROCESS", pProcess);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void pClearGjbprun(NString pProcessName,NNumber pOneUp) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKNOSL.P_CLEAR_GJBPRUN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PROCESS_NAME", pProcessName);
			cmd.addParameter("@P_ONE_UP", pOneUp);
				
			cmd.execute();


		}
		
		public static void pDefaultPrinterForProcess(Ref<NString> pDefaultPrinter,NString pProcess,NString pParmNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKNOSL.P_DEFAULT_PRINTER_FOR_PROCESS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DEFAULT_PRINTER", pDefaultPrinter, true);
			cmd.addParameter("@P_PROCESS", pProcess);
			cmd.addParameter("@P_PARM_NO", pParmNo);
				
			cmd.execute();
			pDefaultPrinter.val = cmd.getParameterValue("@P_DEFAULT_PRINTER", NString.class);


		}
		
		public static void pFormNameForProcess(Ref<NString> pFormName,NString pProcess) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKNOSL.P_FORM_NAME_FOR_PROCESS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FORM_NAME", pFormName, true);
			cmd.addParameter("@P_PROCESS", pProcess);
				
			cmd.execute();
			pFormName.val = cmd.getParameterValue("@P_FORM_NAME", NString.class);


		}
		
		public static void pNextOneUpNo(Ref<NNumber> pOneUp) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKNOSL.P_NEXT_ONE_UP_NO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ONE_UP", pOneUp, true);
				
			cmd.execute();
			pOneUp.val = cmd.getParameterValue("@P_ONE_UP", NNumber.class);


		}
		
		public static void pNosleepOnForProcess(Ref<NNumber> pOnNumericInd,NString pProcess) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKNOSL.P_NOSLEEP_ON_FOR_PROCESS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ON_NUMERIC_IND", pOnNumericInd, true);
			cmd.addParameter("@P_PROCESS", pProcess);
				
			cmd.execute();
			pOnNumericInd.val = cmd.getParameterValue("@P_ON_NUMERIC_IND", NNumber.class);


		}
		
		public static void pPushErrorInformation(NString pProcessName,NNumber pOneUp,NString pMessage,NString pRecordErrorInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKNOSL.P_PUSH_ERROR_INFORMATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PROCESS_NAME", pProcessName);
			cmd.addParameter("@P_ONE_UP", pOneUp);
			cmd.addParameter("@P_MESSAGE", pMessage);
			cmd.addParameter("@P_RECORD_ERROR_IND", pRecordErrorInd);
				
			cmd.execute();


		}
		
		public static void pSubmitGjajobs(NString pProcessName,NString pProcessType,NString pUserId,NString pPassword,NString pOneUp,NString pPrinter,NString pFormName,NString pSubmitTime) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKNOSL.P_SUBMIT_GJAJOBS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PROCESS_NAME", pProcessName);
			cmd.addParameter("@P_PROCESS_TYPE", pProcessType);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_PASSWORD", pPassword);
			cmd.addParameter("@P_ONE_UP", pOneUp);
			cmd.addParameter("@P_PRINTER", pPrinter);
			cmd.addParameter("@P_FORM_NAME", pFormName);
			cmd.addParameter("@P_SUBMIT_TIME", pSubmitTime);
				
			cmd.execute();


		}
		
	
	
	
}
