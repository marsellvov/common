package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Sfkgecr {
		public static void pGetGeRules(NString pAidyCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKGECR.P_GET_GE_RULES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
				
			cmd.execute();


		}
		
//		public static void pGetStudentData(NNumber pPidm,NString pAidyCode,NString pSessionId,NDate pFromDate,NDate pToDate,Ref<List<TblGeStudentDataRow>> pGeData) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKGECR.P_GET_STUDENT_DATA", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_PIDM", pPidm);
//			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
//			cmd.addParameter("@P_SESSION_ID", pSessionId);
//			cmd.addParameter("@P_FROM_DATE", pFromDate);
//			cmd.addParameter("@P_TO_DATE", pToDate);
//			// cmd.addParameter(DbTypes.getTableType("P_GE_DATA", "", object.class));
//				
//			cmd.execute();
//			// pGeData.val = cmd.getTableParameterValue("@P_GE_DATA", object.class);
//
//
//		}
		
	
	
	@DbRecordType(id="TypeGeStudentDataRow", dataSourceName="TYPE_GE_STUDENT_DATA")
	public static class TypeGeStudentDataRow
	{
		@DbRecordField(dataSourceName="T_OPEID")
		public NString TOpeid;
		@DbRecordField(dataSourceName="T_PROGRAM")
		public NString TProgram;
		@DbRecordField(dataSourceName="T_LEVL_CODE")
		public NString TLevlCode;
		@DbRecordField(dataSourceName="T_DEGC_CODE")
		public NString TDegcCode;
		@DbRecordField(dataSourceName="T_MAJR_CODE")
		public NString TMajrCode;
		@DbRecordField(dataSourceName="T_MAJR_DESC")
		public NString TMajrDesc;
		@DbRecordField(dataSourceName="T_CIPC_CODE")
		public NString TCipcCode;
		@DbRecordField(dataSourceName="T_STATUS")
		public NString TStatus;
		@DbRecordField(dataSourceName="T_DATE")
		public NDate TDate;
		@DbRecordField(dataSourceName="T_OTHER_PROGRAM")
		public NString TOtherProgram;
		@DbRecordField(dataSourceName="T_OTHER_LEVL_CODE")
		public NString TOtherLevlCode;
		@DbRecordField(dataSourceName="T_OTHER_DEGC_CODE")
		public NString TOtherDegcCode;
		@DbRecordField(dataSourceName="T_OTHER_MAJR_CODE")
		public NString TOtherMajrCode;
		@DbRecordField(dataSourceName="T_OTHER_MAJR_DESC")
		public NString TOtherMajrDesc;
		@DbRecordField(dataSourceName="T_GECR_PROGRAM")
		public NString TGecrProgram;
		@DbRecordField(dataSourceName="T_GECR_LEVL_CODE")
		public NString TGecrLevlCode;
		@DbRecordField(dataSourceName="T_GECR_DEGC_CODE")
		public NString TGecrDegcCode;
		@DbRecordField(dataSourceName="T_GECR_MAJR_CODE")
		public NString TGecrMajrCode;
		@DbRecordField(dataSourceName="T_OTHER_CIPC_CODE")
		public NString TOtherCipcCode;
		@DbRecordField(dataSourceName="T_OTHER_CRED_LEVEL")
		public NString TOtherCredLevel;
		@DbRecordField(dataSourceName="T_OTHER_OPEID")
		public NString TOtherOpeid;
		@DbRecordField(dataSourceName="T_CRED_LEVEL")
		public NString TCredLevel;
		@DbRecordField(dataSourceName="T_ATTS_IND")
		public NString TAttsInd;
		@DbRecordField(dataSourceName="T_FFEL_FLAG")
		public NString TFfelFlag;
		@DbRecordField(dataSourceName="T_FIRST_ENRLDATE")
		public NDate TFirstEnrldate;
		@DbRecordField(dataSourceName="T_AIDY_ENRLDATE")
		public NDate TAidyEnrldate;
		@DbRecordField(dataSourceName="T_PVT_LOAN_AMT")
		public NNumber TPvtLoanAmt;
		@DbRecordField(dataSourceName="T_INST_FIN_AMT")
		public NNumber TInstFinAmt;
		@DbRecordField(dataSourceName="T_OTHER_PGM_IND")
		public NString TOtherPgmInd;
	}

	
	
}
