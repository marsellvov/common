package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Skkrept {
		public static NNumber fDeleteLockCd(NDate pSubmitDate,NString pFileNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SKKREPT.F_DELETE_LOCK_CD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_SUBMIT_DATE", pSubmitDate);
			cmd.addParameter("@P_FILE_NUMBER", pFileNumber);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fDeleteLockCm(NString pAcyrCode,NString pFileNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SKKREPT.F_DELETE_LOCK_CM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_ACYR_CODE", pAcyrCode);
			cmd.addParameter("@P_FILE_NUMBER", pFileNumber);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fDeleteLockCo(NString pAcyrCode,NString pFileNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SKKREPT.F_DELETE_LOCK_CO", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_ACYR_CODE", pAcyrCode);
			cmd.addParameter("@P_FILE_NUMBER", pFileNumber);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fDeleteLockCu(NString pAcyrCode,NString pFileNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SKKREPT.F_DELETE_LOCK_CU", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_ACYR_CODE", pAcyrCode);
			cmd.addParameter("@P_FILE_NUMBER", pFileNumber);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fDeleteLockDu(NString pAcyrCode,NString pReportPeriod,NString pSubmission,NString pFileNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SKKREPT.F_DELETE_LOCK_DU", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_ACYR_CODE", pAcyrCode);
			cmd.addParameter("@P_REPORT_PERIOD", pReportPeriod);
			cmd.addParameter("@P_SUBMISSION", pSubmission);
			cmd.addParameter("@P_FILE_NUMBER", pFileNumber);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fDeleteLockEn(NString pAcyrCode,NString pReportPeriod,NString pSubmission,NString pFileNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SKKREPT.F_DELETE_LOCK_EN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_ACYR_CODE", pAcyrCode);
			cmd.addParameter("@P_REPORT_PERIOD", pReportPeriod);
			cmd.addParameter("@P_SUBMISSION", pSubmission);
			cmd.addParameter("@P_FILE_NUMBER", pFileNumber);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fDeleteLockEr(NDate pReportDate,NString pFileNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SKKREPT.F_DELETE_LOCK_ER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_REPORT_DATE", pReportDate);
			cmd.addParameter("@P_FILE_NUMBER", pFileNumber);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fDeleteLockOr(NString pAcyrCode,NString pReportPeriod,NString pSubmission,NDate pReportDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SKKREPT.F_DELETE_LOCK_OR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_ACYR_CODE", pAcyrCode);
			cmd.addParameter("@P_REPORT_PERIOD", pReportPeriod);
			cmd.addParameter("@P_SUBMISSION", pSubmission);
			cmd.addParameter("@P_REPORT_DATE", pReportDate);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fDeleteLockOs(NString pAcyrCode,NString pReportPeriod) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SKKREPT.F_DELETE_LOCK_OS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_ACYR_CODE", pAcyrCode);
			cmd.addParameter("@P_REPORT_PERIOD", pReportPeriod);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fDeleteLockPo(NString pAcyrCode,NString pReportPeriod) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SKKREPT.F_DELETE_LOCK_PO", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_ACYR_CODE", pAcyrCode);
			cmd.addParameter("@P_REPORT_PERIOD", pReportPeriod);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fDeleteLockPs(NString pAcyrCode,NString pFileNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SKKREPT.F_DELETE_LOCK_PS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_ACYR_CODE", pAcyrCode);
			cmd.addParameter("@P_FILE_NUMBER", pFileNumber);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fDeleteLockRl(NDate pReportDate,NString pRevisionNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SKKREPT.F_DELETE_LOCK_RL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_REPORT_DATE", pReportDate);
			cmd.addParameter("@P_REVISION_NUMBER", pRevisionNumber);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fDeleteLockRo(NString pAcyrCode,NString pReportPeriod) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SKKREPT.F_DELETE_LOCK_RO", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_ACYR_CODE", pAcyrCode);
			cmd.addParameter("@P_REPORT_PERIOD", pReportPeriod);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fDeleteLockRsa(NDate pReportDate,NString pFileNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SKKREPT.F_DELETE_LOCK_RSA", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_REPORT_DATE", pReportDate);
			cmd.addParameter("@P_FILE_NUMBER", pFileNumber);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fDeleteLockSa(NString pAcyrCode,NString pReportPeriod,NString pFileNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SKKREPT.F_DELETE_LOCK_SA", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_ACYR_CODE", pAcyrCode);
			cmd.addParameter("@P_REPORT_PERIOD", pReportPeriod);
			cmd.addParameter("@P_FILE_NUMBER", pFileNumber);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fDeleteLockSr(NDate pReportDate,NString pRevisionNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SKKREPT.F_DELETE_LOCK_SR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_REPORT_DATE", pReportDate);
			cmd.addParameter("@P_REVISION_NUMBER", pRevisionNumber);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fDeleteLockVcc(NString pAcyrCode,NString pFileNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SKKREPT.F_DELETE_LOCK_VCC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_ACYR_CODE", pAcyrCode);
			cmd.addParameter("@P_FILE_NUMBER", pFileNumber);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fDeleteLockVco(NString pAcyrCode,NString pFileNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SKKREPT.F_DELETE_LOCK_VCO", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_ACYR_CODE", pAcyrCode);
			cmd.addParameter("@P_FILE_NUMBER", pFileNumber);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fDeleteLockVcu(NString pAcyrCode,NString pFileNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SKKREPT.F_DELETE_LOCK_VCU", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_ACYR_CODE", pAcyrCode);
			cmd.addParameter("@P_FILE_NUMBER", pFileNumber);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fDeleteLockVdu(NString pAcyrCode,NString pReportPeriod,NString pSubmission,NString pFileNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SKKREPT.F_DELETE_LOCK_VDU", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_ACYR_CODE", pAcyrCode);
			cmd.addParameter("@P_REPORT_PERIOD", pReportPeriod);
			cmd.addParameter("@P_SUBMISSION", pSubmission);
			cmd.addParameter("@P_FILE_NUMBER", pFileNumber);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fDeleteLockVen(NString pAcyrCode,NString pReportPeriod,NString pSubmission,NString pFileNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SKKREPT.F_DELETE_LOCK_VEN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_ACYR_CODE", pAcyrCode);
			cmd.addParameter("@P_REPORT_PERIOD", pReportPeriod);
			cmd.addParameter("@P_SUBMISSION", pSubmission);
			cmd.addParameter("@P_FILE_NUMBER", pFileNumber);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fDeleteLockVer(NDate pReportDate,NString pFileNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SKKREPT.F_DELETE_LOCK_VER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_REPORT_DATE", pReportDate);
			cmd.addParameter("@P_FILE_NUMBER", pFileNumber);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fDeleteLockVll(NString pAcyrCode,NString pReportPeriod,NString pSubmission,NString pFileNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SKKREPT.F_DELETE_LOCK_VLL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_ACYR_CODE", pAcyrCode);
			cmd.addParameter("@P_REPORT_PERIOD", pReportPeriod);
			cmd.addParameter("@P_SUBMISSION", pSubmission);
			cmd.addParameter("@P_FILE_NUMBER", pFileNumber);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fDeleteLockVpo(NString pAcyrCode,NString pReportPeriod) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SKKREPT.F_DELETE_LOCK_VPO", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_ACYR_CODE", pAcyrCode);
			cmd.addParameter("@P_REPORT_PERIOD", pReportPeriod);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fDeleteLockVrl(NDate pReportDate,NString pRevisionNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SKKREPT.F_DELETE_LOCK_VRL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_REPORT_DATE", pReportDate);
			cmd.addParameter("@P_REVISION_NUMBER", pRevisionNumber);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fDeleteLockVsr(NDate pReportDate,NString pRevisionNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SKKREPT.F_DELETE_LOCK_VSR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_REPORT_DATE", pReportDate);
			cmd.addParameter("@P_REVISION_NUMBER", pRevisionNumber);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fEnMediCode(NNumber pPidm,NString pAcyrCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SKKREPT.F_EN_MEDI_CODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ACYR_CODE", pAcyrCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fEnSprmediDisaCode(NNumber pPidm,NString pAcyrCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SKKREPT.F_EN_SPRMEDI_DISA_CODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ACYR_CODE", pAcyrCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fSvXvalPurge(NString pAcyrCode,NString pCollection) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SKKREPT.F_SV_XVAL_PURGE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_ACYR_CODE", pAcyrCode);
			cmd.addParameter("@P_COLLECTION", pCollection);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fnAddrLoc(NString pParamValue,NNumber pPidm,NString pAcyrCode,NString pLocCity,NString pMinMax) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SKKREPT.FN_ADDR_LOC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PARAM_VALUE", pParamValue);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ACYR_CODE", pAcyrCode);
			cmd.addParameter("@P_LOC_CITY", pLocCity);
			cmd.addParameter("@P_MIN_MAX", pMinMax);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fnCheckSysParam(NString pParamName,NString pParamValue,NString pCheckValue,NString pAcyrCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SKKREPT.FN_CHECK_SYS_PARAM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PARAM_NAME", pParamName);
			cmd.addParameter("@P_PARAM_VALUE", pParamValue);
			cmd.addParameter("@P_CHECK_VALUE", pCheckValue);
			cmd.addParameter("@P_ACYR_CODE", pAcyrCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fnCheckSysParamDisa(NString pParamName,NString pParamValue,NString pCheckValue,NString pAcyrCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SKKREPT.FN_CHECK_SYS_PARAM_DISA", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PARAM_NAME", pParamName);
			cmd.addParameter("@P_PARAM_VALUE", pParamValue);
			cmd.addParameter("@P_CHECK_VALUE", pCheckValue);
			cmd.addParameter("@P_ACYR_CODE", pAcyrCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fnDeleteLockLl(NString pAcyrCode,NString pReportPeriod,NString pSubmission,NString pFileNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SKKREPT.FN_DELETE_LOCK_LL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_ACYR_CODE", pAcyrCode);
			cmd.addParameter("@P_REPORT_PERIOD", pReportPeriod);
			cmd.addParameter("@P_SUBMISSION", pSubmission);
			cmd.addParameter("@P_FILE_NUMBER", pFileNumber);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fnDeleteLockRf(NString pReportDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SKKREPT.FN_DELETE_LOCK_RF", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_REPORT_DATE", pReportDate);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fnEnDisaCode(NNumber pPidm,NString pTermCode,NString pAcyrCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SKKREPT.FN_EN_DISA_CODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_ACYR_CODE", pAcyrCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fnEnTermLoc(NNumber pPidm,NString pAcyrCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SKKREPT.FN_EN_TERM_LOC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ACYR_CODE", pAcyrCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fnSdAddress(NNumber pPidm,NString pString,NString pAcyrCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SKKREPT.FN_SD_ADDRESS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_STRING", pString);
			cmd.addParameter("@P_ACYR_CODE", pAcyrCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fnSysParam(NString pParamName,NString pAcyrCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SKKREPT.FN_SYS_PARAM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PARAM_NAME", pParamName);
			cmd.addParameter("@P_ACYR_CODE", pAcyrCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	
}
