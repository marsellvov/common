package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Sfkdwpi {
//		public static  fGetPrereqRequestContent(NString pTermCode,NNumber pPidm,List<RegistrationTabtypeRow> pRegsTable) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKDWPI.F_GET_PREREQ_REQUEST_CONTENT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@P_TERM_CODE", pTermCode);
//			cmd.addParameter("@P_PIDM", pPidm);
//			// cmd.addParameter(DbTypes.getTableType("P_REGS_TABLE", "", pRegsTable, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
//		public static void pDwPrereqChecking(NString pTermCode,NNumber pPidm,List<RegistrationTabtypeRow> pRegsTable,NString pTempTableInd,NString pRunType,NString pPreqSeverity,NString pAdminProcessing,NString pInprogressUsageInd,Ref<NBool> pPrereqErrorFoundOut,Ref<NString> pSystemErrorOut) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKDWPI.P_DW_PREREQ_CHECKING", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_TERM_CODE", pTermCode);
//			cmd.addParameter("@P_PIDM", pPidm);
//			// cmd.addParameter(DbTypes.getTableType("P_REGS_TABLE", "", pRegsTable, object.class));
//			cmd.addParameter("@P_TEMP_TABLE_IND", pTempTableInd);
//			cmd.addParameter("@P_RUN_TYPE", pRunType);
//			cmd.addParameter("@P_PREQ_SEVERITY", pPreqSeverity);
//			cmd.addParameter("@P_ADMIN_PROCESSING", pAdminProcessing);
//			cmd.addParameter("@P_INPROGRESS_USAGE_IND", pInprogressUsageInd);
//			cmd.addParameter("@P_PREREQ_ERROR_FOUND_OUT", NBool.class);
//			cmd.addParameter("@P_SYSTEM_ERROR_OUT", NString.class);
//				
//			cmd.execute();
//			pPrereqErrorFoundOut.val = cmd.getParameterValue("@P_PREREQ_ERROR_FOUND_OUT", NBool.class);
//			pSystemErrorOut.val = cmd.getParameterValue("@P_SYSTEM_ERROR_OUT", NString.class);
//
//
//		}
		
	
	
	@DbRecordType(id="RegistrationRectypeRow", dataSourceName="REGISTRATION_RECTYPE")
	public static class RegistrationRectypeRow
	{
		@DbRecordField(dataSourceName="TERM")
		public NString Term;
		@DbRecordField(dataSourceName="CRN")
		public NString Crn;
		@DbRecordField(dataSourceName="WAIT_IND")
		public NString WaitInd;
		@DbRecordField(dataSourceName="SUBJ_CODE")
		public NString SubjCode;
		@DbRecordField(dataSourceName="CRSE_NUMB")
		public NString CrseNumb;
		@DbRecordField(dataSourceName="SEQ_NUMB")
		public NString SeqNumb;
		@DbRecordField(dataSourceName="CREDIT_HRS")
		public NNumber CreditHrs;
		@DbRecordField(dataSourceName="PREREQ_CHECK_METHOD")
		public NString PrereqCheckMethod;
	}

	
	
}
