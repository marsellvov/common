package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Nokecls {
		public static EclsRectypeRow fEclsRec(NString pEclsCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKECLS.F_ECLS_REC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DbTypes.createStructType(EclsRectypeRow.class));
			cmd.addParameter("@P_ECLS_CODE", pEclsCode);
				
			cmd.execute();

			return cmd.getReturnValue(EclsRectypeRow.class);

		}
		
	
	
	@DbRecordType(id="EclsRectypeRow", dataSourceName="NOKECLS.ECLS_RECTYPE")
	public static class EclsRectypeRow
	{
		@DbRecordField(dataSourceName="R_CODE")
		public NString RCode;
		@DbRecordField(dataSourceName="R_SHORT_DESC")
		public NString RShortDesc;
		@DbRecordField(dataSourceName="R_LONG_DESC")
		public NString RLongDesc;
		@DbRecordField(dataSourceName="R_PICT_CODE")
		public NString RPictCode;
		@DbRecordField(dataSourceName="R_SHCD_CODE")
		public NString RShcdCode;
		@DbRecordField(dataSourceName="R_HOURS_PER_PAY")
		public NNumber RHoursPerPay;
		@DbRecordField(dataSourceName="R_HOURS_PER_DAY")
		public NNumber RHoursPerDay;
		@DbRecordField(dataSourceName="R_SALARY_ENCUMBRANCE_IND")
		public NString RSalaryEncumbranceInd;
		@DbRecordField(dataSourceName="R_TS_ROSTER_IND")
		public NString RTsRosterInd;
		@DbRecordField(dataSourceName="R_DEFAULT_HOURS_IND")
		public NString RDefaultHoursInd;
		@DbRecordField(dataSourceName="R_SALARY_IND")
		public NString RSalaryInd;
		@DbRecordField(dataSourceName="R_BUDGET_ROLL_IND")
		public NString RBudgetRollInd;
		@DbRecordField(dataSourceName="R_LCAT_CODE")
		public NString RLcatCode;
		@DbRecordField(dataSourceName="R_BCAT_CODE")
		public NString RBcatCode;
		@DbRecordField(dataSourceName="R_ACTIVITY_DATE")
		public NDate RActivityDate;
		@DbRecordField(dataSourceName="R_EEOG_CODE")
		public NString REeogCode;
		@DbRecordField(dataSourceName="R_EMPR_CODE")
		public NString REmprCode;
		@DbRecordField(dataSourceName="R_INSTRUCT_CODE")
		public NString RInstructCode;
		@DbRecordField(dataSourceName="R_STCA_CODE")
		public NString RStcaCode;
		@DbRecordField(dataSourceName="R_STGR_CODE")
		public NString RStgrCode;
		@DbRecordField(dataSourceName="R_WKPR_CODE")
		public NString RWkprCode;
		@DbRecordField(dataSourceName="R_LGCD_CODE")
		public NString RLgcdCode;
		@DbRecordField(dataSourceName="R_FLSA_IND")
		public NString RFlsaInd;
		@DbRecordField(dataSourceName="R_WKSH_CODE")
		public NString RWkshCode;
		@DbRecordField(dataSourceName="R_TIME_ENTRY_IND")
		public NString RTimeEntryInd;
		@DbRecordField(dataSourceName="R_TIME_ENTRY_DAY")
		public NString RTimeEntryDay;
		@DbRecordField(dataSourceName="R_DFPR_CODE")
		public NString RDfprCode;
		@DbRecordField(dataSourceName="R_PCAT_CODE")
		public NString RPcatCode;
		@DbRecordField(dataSourceName="R_PREMIUM_ROLL_IND")
		public NString RPremiumRollInd;
		@DbRecordField(dataSourceName="R_INTERNAL_FT_PT_IND")
		public NString RInternalFtPtInd;
		@DbRecordField(dataSourceName="R_EGRP_CODE")
		public NString REgrpCode;
		@DbRecordField(dataSourceName="R_STRS_ASSN_CODE")
		public NString RStrsAssnCode;
		@DbRecordField(dataSourceName="R_STRS_PAY_CODE")
		public NString RStrsPayCode;
		@DbRecordField(dataSourceName="R_PERS_GROUP")
		public NString RPersGroup;
		@DbRecordField(dataSourceName="R_PERS_PAY_CODE")
		public NString RPersPayCode;
		@DbRecordField(dataSourceName="R_TIME_ENTRY_METHOD")
		public NString RTimeEntryMethod;
		@DbRecordField(dataSourceName="R_TIME_ENTRY_TYPE")
		public NString RTimeEntryType;
		@DbRecordField(dataSourceName="R_LEAVE_REQUEST_IND")
		public NString RLeaveRequestInd;
		@DbRecordField(dataSourceName="R_EXCEPTION_APPROVAL_IND")
		public NString RExceptionApprovalInd;
		@DbRecordField(dataSourceName="R_TIME_IN_OUT_IND")
		public NString RTimeInOutInd;
		@DbRecordField(dataSourceName="R_OVERRIDE_LD_WEB_IND")
		public NString ROverrideLdWebInd;
		@DbRecordField(dataSourceName="R_OVERRIDE_LD_DEPT_IND")
		public NString ROverrideLdDeptInd;
		@DbRecordField(dataSourceName="R_BUDG_BASIS")
		public NNumber RBudgBasis;
		@DbRecordField(dataSourceName="R_ANN_BASIS")
		public NNumber RAnnBasis;
		@DbRecordField(dataSourceName="R_CREATE_JFTE_IND")
		public NString RCreateJfteInd;
		@DbRecordField(dataSourceName="R_LEAV_REPT_METHOD")
		public NString RLeavReptMethod;
		@DbRecordField(dataSourceName="R_PICT_CODE_LEAV_REPT")
		public NString RPictCodeLeavRept;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
