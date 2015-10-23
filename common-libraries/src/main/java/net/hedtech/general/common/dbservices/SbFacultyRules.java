package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbFacultyRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FACULTY_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pPidm,NString pTermCodeEff,NString pFcstCode,NString pFctgCode,NString pFstpCode,NString pFcntCode,NString pSchdInd,NString pAdvrInd,NDate pFcstDate,NString pWkldCode,NString pCntrCode,NDate pAppointDate,NString pDataOrigin,NString pUserId,NString pOverrideProcessInd,NString pOverrideProcUserid,NDate pOverrideProcDate,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FACULTY_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_FCST_CODE", pFcstCode);
			cmd.addParameter("@P_FCTG_CODE", pFctgCode);
			cmd.addParameter("@P_FSTP_CODE", pFstpCode);
			cmd.addParameter("@P_FCNT_CODE", pFcntCode);
			cmd.addParameter("@P_SCHD_IND", pSchdInd);
			cmd.addParameter("@P_ADVR_IND", pAdvrInd);
			cmd.addParameter("@P_FCST_DATE", pFcstDate);
			cmd.addParameter("@P_WKLD_CODE", pWkldCode);
			cmd.addParameter("@P_CNTR_CODE", pCntrCode);
			cmd.addParameter("@P_APPOINT_DATE", pAppointDate);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_OVERRIDE_PROCESS_IND", pOverrideProcessInd);
			cmd.addParameter("@P_OVERRIDE_PROC_USERID", pOverrideProcUserid);
			cmd.addParameter("@P_OVERRIDE_PROC_DATE", pOverrideProcDate);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pPidm,NString pTermCodeEff,NString pFcstCode,NString pFctgCode,NString pFstpCode,NString pFcntCode,NString pSchdInd,NString pAdvrInd,NDate pFcstDate,NString pWkldCode,NString pCntrCode,NDate pAppointDate,NString pDataOrigin,NString pUserId,NString pOverrideProcessInd,NString pOverrideProcUserid,NDate pOverrideProcDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FACULTY_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_FCST_CODE", pFcstCode);
			cmd.addParameter("@P_FCTG_CODE", pFctgCode);
			cmd.addParameter("@P_FSTP_CODE", pFstpCode);
			cmd.addParameter("@P_FCNT_CODE", pFcntCode);
			cmd.addParameter("@P_SCHD_IND", pSchdInd);
			cmd.addParameter("@P_ADVR_IND", pAdvrInd);
			cmd.addParameter("@P_FCST_DATE", pFcstDate);
			cmd.addParameter("@P_WKLD_CODE", pWkldCode);
			cmd.addParameter("@P_CNTR_CODE", pCntrCode);
			cmd.addParameter("@P_APPOINT_DATE", pAppointDate);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_OVERRIDE_PROCESS_IND", pOverrideProcessInd);
			cmd.addParameter("@P_OVERRIDE_PROC_USERID", pOverrideProcUserid);
			cmd.addParameter("@P_OVERRIDE_PROC_DATE", pOverrideProcDate);
				
			cmd.execute();


		}
		
	
	
	
}
