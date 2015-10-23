package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Nsksecr {
		public static NString fEclsAccessInd(NString pEclsCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NSKSECR.F_ECLS_ACCESS_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ECLS_CODE", pEclsCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fEmployeeAccessInd(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NSKSECR.F_EMPLOYEE_ACCESS_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fEmprAccessInd(NString pEmprCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NSKSECR.F_EMPR_ACCESS_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fEmprAccessInd(NNumber pPidm,NString pPosn,NString pSuff) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NSKSECR.F_EMPR_ACCESS_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fFacultyLoadAccessInd(NNumber pPidm,NString pPosn,NString pSuff,NString pCoasCode,NString pOrgnCode,NString pAccessType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NSKSECR.F_FACULTY_LOAD_ACCESS_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_ORGN_CODE", pOrgnCode);
			cmd.addParameter("@P_ACCESS_TYPE", pAccessType);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fHrSecurityInd(NNumber pPidm,NString pTable,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NSKSECR.F_HR_SECURITY_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TABLE", pTable);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fJobAccessInd(NNumber pPidm,NString pPosn,NString pSuff) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NSKSECR.F_JOB_ACCESS_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fOrgnAccessInd(NString pCoasCode,NString pOrgnCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NSKSECR.F_ORGN_ACCESS_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_ORGN_CODE", pOrgnCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fOrgnRollupAccessInd(NString pModuleType,NString pCoasCode,NString pOrgnCode,NString pAccessType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NSKSECR.F_ORGN_ROLLUP_ACCESS_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_MODULE_TYPE", pModuleType);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_ORGN_CODE", pOrgnCode);
			cmd.addParameter("@P_ACCESS_TYPE", pAccessType);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fOrgnTsAccessInd(NNumber pPidm,NString pPosn,NString pSuff) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NSKSECR.F_ORGN_TS_ACCESS_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fSalaryAccessInd(NNumber pSalary) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NSKSECR.F_SALARY_ACCESS_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SALARY", pSalary);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fSalaryMaxAccessInd(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NSKSECR.F_SALARY_MAX_ACCESS_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fSalaryMaxAccessInd(NNumber pPidm,NString pPosn,NString pSuff) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NSKSECR.F_SALARY_MAX_ACCESS_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pCheckEclsAccess(NString pEclsCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NSKSECR.P_CHECK_ECLS_ACCESS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ECLS_CODE", pEclsCode);
				
			cmd.execute();


		}
		
		public static void pCheckEmployeeAccess(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NSKSECR.P_CHECK_EMPLOYEE_ACCESS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();


		}
		
		public static void pCheckEmprAccess(NString pEmprCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NSKSECR.P_CHECK_EMPR_ACCESS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
				
			cmd.execute();


		}
		
		public static void pCheckEmprAccess(NNumber pPidm,NString pPosn,NString pSuff) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NSKSECR.P_CHECK_EMPR_ACCESS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
				
			cmd.execute();


		}
		
		public static void pCheckFacultyLoadAccess(NNumber pPidm,NString pPosn,NString pSuff,NString pCoasCode,NString pOrgnCode,NString pAccessType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NSKSECR.P_CHECK_FACULTY_LOAD_ACCESS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_ORGN_CODE", pOrgnCode);
			cmd.addParameter("@P_ACCESS_TYPE", pAccessType);
				
			cmd.execute();


		}
		
		public static void pCheckJobAccess(NNumber pPidm,NString pPosn,NString pSuff) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NSKSECR.P_CHECK_JOB_ACCESS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
				
			cmd.execute();


		}
		
		public static void pCheckOrgnAccess(NString pCoasCode,NString pOrgnCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NSKSECR.P_CHECK_ORGN_ACCESS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_ORGN_CODE", pOrgnCode);
				
			cmd.execute();


		}
		
		public static void pCheckOrgnRollupAccess(NString pModuleType,NString pCoasCode,NString pOrgnCode,NString pAccessType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NSKSECR.P_CHECK_ORGN_ROLLUP_ACCESS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_MODULE_TYPE", pModuleType);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_ORGN_CODE", pOrgnCode);
			cmd.addParameter("@P_ACCESS_TYPE", pAccessType);
				
			cmd.execute();


		}
		
		public static void pCheckOrgnTsAccess(NNumber pPidm,NString pPosn,NString pSuff) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NSKSECR.P_CHECK_ORGN_TS_ACCESS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
				
			cmd.execute();


		}
		
		public static void pCheckSalaryAccess(NNumber pSalary) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NSKSECR.P_CHECK_SALARY_ACCESS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SALARY", pSalary);
				
			cmd.execute();


		}
		
		public static void pCheckSalaryMaxAccess(NNumber pPidm,NString pPosn,NString pSuff) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NSKSECR.P_CHECK_SALARY_MAX_ACCESS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
				
			cmd.execute();


		}
		
		public static void pClearSecurityCache() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NSKSECR.P_CLEAR_SECURITY_CACHE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pHrSecurityAccess(NNumber pPidm,NString pTable,NString pRowid,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NSKSECR.P_HR_SECURITY_ACCESS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TABLE", pTable);
			cmd.addParameter("@P_ROWID", pRowid);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pSetContextValue(NString pContextName,NString pContextValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NSKSECR.P_SET_CONTEXT_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CONTEXT_NAME", pContextName);
			cmd.addParameter("@P_CONTEXT_VALUE", pContextValue);
				
			cmd.execute();


		}
		
	
	
	
}
