package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Goksvsq {
		public static NBool fExecuteSqlRules(NNumber pidmIn,NString termIn,NString sqprCode,NString sqruCode,NString svapCode,NString abInd,Ref<NString> columnDataType,Ref<NString> returnChar,Ref<NDate> returnDate,Ref<NNumber> returnNumber,Ref<NString> errMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSVSQ.F_EXECUTE_SQL_RULES", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@SQPR_CODE", sqprCode);
			cmd.addParameter("@SQRU_CODE", sqruCode);
			cmd.addParameter("@SVAP_CODE", svapCode);
			cmd.addParameter("@AB_IND", abInd);
			cmd.addParameter("@COLUMN_DATA_TYPE", NString.class);
			cmd.addParameter("@RETURN_CHAR", NString.class);
			cmd.addParameter("@RETURN_DATE", NDate.class);
			cmd.addParameter("@RETURN_NUMBER", NNumber.class);
			cmd.addParameter("@ERR_MSG", NString.class);
				
			cmd.execute();
			columnDataType.val = cmd.getParameterValue("@COLUMN_DATA_TYPE", NString.class);
			returnChar.val = cmd.getParameterValue("@RETURN_CHAR", NString.class);
			returnDate.val = cmd.getParameterValue("@RETURN_DATE", NDate.class);
			returnNumber.val = cmd.getParameterValue("@RETURN_NUMBER", NNumber.class);
			errMsg.val = cmd.getParameterValue("@ERR_MSG", NString.class);

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void pCreateEv(NNumber pidmIn,NString termIn,NString sqprCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSVSQ.P_CREATE_EV", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@SQPR_CODE", sqprCode);
				
			cmd.execute();


		}
		
		public static void pCreateStudent(NNumber pidmIn,NString termIn,NString sqprCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSVSQ.P_CREATE_STUDENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@SQPR_CODE", sqprCode);
				
			cmd.execute();


		}
		
		public static void pProcessAction(NNumber pidmIn,NString termIn,NString sqprCode,NString svbaCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSVSQ.P_PROCESS_ACTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@SQPR_CODE", sqprCode);
			cmd.addParameter("@SVBA_CODE", svbaCode);
				
			cmd.execute();


		}
		
		public static void pProcessAgain(NNumber pidmIn,NString termIn,NString sqprCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSVSQ.P_PROCESS_AGAIN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@SQPR_CODE", sqprCode);
				
			cmd.execute();


		}
		
		public static void pProcessAutopop(NNumber pidmIn,NString svapCode,NString colDataType,NString charField,NDate dateField,NNumber numberField) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSVSQ.P_PROCESS_AUTOPOP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@SVAP_CODE", svapCode);
			cmd.addParameter("@COL_DATA_TYPE", colDataType);
			cmd.addParameter("@CHAR_FIELD", charField);
			cmd.addParameter("@DATE_FIELD", dateField);
			cmd.addParameter("@NUMBER_FIELD", numberField);
				
			cmd.execute();


		}
		
		public static void pProcessSqlRules(NNumber pidmIn,NString termIn,NString sqprCode,NString abInd,Ref<NString> errMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSVSQ.P_PROCESS_SQL_RULES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@SQPR_CODE", sqprCode);
			cmd.addParameter("@AB_IND", abInd);
			cmd.addParameter("@ERR_MSG", NString.class);
				
			cmd.execute();
			errMsg.val = cmd.getParameterValue("@ERR_MSG", NString.class);


		}
		
	
	
	
}
