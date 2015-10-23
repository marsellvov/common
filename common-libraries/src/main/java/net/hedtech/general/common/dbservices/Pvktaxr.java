package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Pvktaxr {
		public static NString fYrendGetTableName(NString parmProgramName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PVKTAXR.F_YREND_GET_TABLE_NAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PARM_PROGRAM_NAME", parmProgramName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pYrendCheckDataExists(NString parmProgramName,NString parmYear,NString parmEmprCode,NString pidm,NString dataType,NString submit,Ref<NString> existsInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PVKTAXR.P_YREND_CHECK_DATA_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_PROGRAM_NAME", parmProgramName);
			cmd.addParameter("@PARM_YEAR", parmYear);
			cmd.addParameter("@PARM_EMPR_CODE", parmEmprCode);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@DATA_TYPE", dataType);
			cmd.addParameter("@SUBMIT", submit);
			cmd.addParameter("@EXISTS_IND", NString.class);
				
			cmd.execute();
			existsInd.val = cmd.getParameterValue("@EXISTS_IND", NString.class);


		}
		
		public static void pYrendDelDataExists(NString parmProgramName,NString parmYear,NString parmEmprCode,NString pidm,NString dataType,NString submit) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PVKTAXR.P_YREND_DEL_DATA_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_PROGRAM_NAME", parmProgramName);
			cmd.addParameter("@PARM_YEAR", parmYear);
			cmd.addParameter("@PARM_EMPR_CODE", parmEmprCode);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@DATA_TYPE", dataType);
			cmd.addParameter("@SUBMIT", submit);
				
			cmd.execute();


		}
		
		public static void pYrendGetTotalEmployer(NString parmProgramName,NString parmYear,NString dataType,NString parmReprint,Ref<NNumber> totalEmployers) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PVKTAXR.P_YREND_GET_TOTAL_EMPLOYER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_PROGRAM_NAME", parmProgramName);
			cmd.addParameter("@PARM_YEAR", parmYear);
			cmd.addParameter("@DATA_TYPE", dataType);
			cmd.addParameter("@PARM_REPRINT", parmReprint);
			cmd.addParameter("@TOTAL_EMPLOYERS", NNumber.class);
				
			cmd.execute();
			totalEmployers.val = cmd.getParameterValue("@TOTAL_EMPLOYERS", NNumber.class);


		}
		
		public static void pYrendUpdTableData(NString parmProgramName,NString parmYear,NString emprCode,NString pidm,NString dataType,NNumber nextSubmissionNo,NString bn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PVKTAXR.P_YREND_UPD_TABLE_DATA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_PROGRAM_NAME", parmProgramName);
			cmd.addParameter("@PARM_YEAR", parmYear);
			cmd.addParameter("@EMPR_CODE", emprCode);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@DATA_TYPE", dataType);
			cmd.addParameter("@NEXT_SUBMISSION_NO", nextSubmissionNo);
			cmd.addParameter("@BN", bn);
				
			cmd.execute();


		}
		
	
	
	
}
