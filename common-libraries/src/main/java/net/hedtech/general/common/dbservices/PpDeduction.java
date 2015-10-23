package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PpDeduction {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PP_DEDUCTION.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pPidm,NString pBdcaCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PP_DEDUCTION.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryByDate(NNumber pPidm,NString pBdcaCode,NDate pQueryDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PP_DEDUCTION.F_QUERY_BY_DATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_QUERY_DATE", pQueryDate);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPidm,NString pBdcaCode,NDate pEffectiveDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PP_DEDUCTION.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NNumber pPidm,NString pBdcaCode,NDate pBeginDate,NString pAddReplInd,NNumber pAddReplEmpl,NNumber pAddReplEmpr,NNumber pAddReplTaxBase,NString pArrStatus,NNumber pArrBalance,NNumber pBondBalance,NNumber pArrRecoverMax,NString pAddReplPictCode,NString pStatus,NString pRefNo,NNumber pAmount1,NNumber pAmount2,NNumber pAmount3,NNumber pAmount4,NString pOptCode1,NString pOptCode2,NString pOptCode3,NString pOptCode4,NString pOptCode5,NDate pCoverageDate,NString pBdclCode,NString pW4NameChangeInd,NNumber pW4SignedPidm,NDate pW4SignedDate,NString pLockinLetterStatus,NDate pLockinLetterDate,NString pLockinFstaFilSt,NNumber pLockinWithholdAllow,NString pComment,NDate pCommentDate,NString pCommentUserId,NString pUserId,NString pDataOrigin,NString pBreaCode,NDate pEventDate,Ref<NString> pBaseRowidOut,Ref<NString> pDetailRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PP_DEDUCTION.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_BEGIN_DATE", pBeginDate);
			cmd.addParameter("@P_ADD_REPL_IND", pAddReplInd);
			cmd.addParameter("@P_ADD_REPL_EMPL", pAddReplEmpl);
			cmd.addParameter("@P_ADD_REPL_EMPR", pAddReplEmpr);
			cmd.addParameter("@P_ADD_REPL_TAX_BASE", pAddReplTaxBase);
			cmd.addParameter("@P_ARR_STATUS", pArrStatus);
			cmd.addParameter("@P_ARR_BALANCE", pArrBalance);
			cmd.addParameter("@P_BOND_BALANCE", pBondBalance);
			cmd.addParameter("@P_ARR_RECOVER_MAX", pArrRecoverMax);
			cmd.addParameter("@P_ADD_REPL_PICT_CODE", pAddReplPictCode);
			cmd.addParameter("@P_STATUS", pStatus);
			cmd.addParameter("@P_REF_NO", pRefNo);
			cmd.addParameter("@P_AMOUNT1", pAmount1);
			cmd.addParameter("@P_AMOUNT2", pAmount2);
			cmd.addParameter("@P_AMOUNT3", pAmount3);
			cmd.addParameter("@P_AMOUNT4", pAmount4);
			cmd.addParameter("@P_OPT_CODE1", pOptCode1);
			cmd.addParameter("@P_OPT_CODE2", pOptCode2);
			cmd.addParameter("@P_OPT_CODE3", pOptCode3);
			cmd.addParameter("@P_OPT_CODE4", pOptCode4);
			cmd.addParameter("@P_OPT_CODE5", pOptCode5);
			cmd.addParameter("@P_COVERAGE_DATE", pCoverageDate);
			cmd.addParameter("@P_BDCL_CODE", pBdclCode);
			cmd.addParameter("@P_W4_NAME_CHANGE_IND", pW4NameChangeInd);
			cmd.addParameter("@P_W4_SIGNED_PIDM", pW4SignedPidm);
			cmd.addParameter("@P_W4_SIGNED_DATE", pW4SignedDate);
			cmd.addParameter("@P_LOCKIN_LETTER_STATUS", pLockinLetterStatus);
			cmd.addParameter("@P_LOCKIN_LETTER_DATE", pLockinLetterDate);
			cmd.addParameter("@P_LOCKIN_FSTA_FIL_ST", pLockinFstaFilSt);
			cmd.addParameter("@P_LOCKIN_WITHHOLD_ALLOW", pLockinWithholdAllow);
			cmd.addParameter("@P_COMMENT", pComment);
			cmd.addParameter("@P_COMMENT_DATE", pCommentDate);
			cmd.addParameter("@P_COMMENT_USER_ID", pCommentUserId);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_BREA_CODE", pBreaCode);
			cmd.addParameter("@P_EVENT_DATE", pEventDate);
			cmd.addParameter("@P_BASE_ROWID_OUT", NString.class);
			cmd.addParameter("@P_DETAIL_ROWID_OUT", NString.class);
				
			cmd.execute();
			pBaseRowidOut.val = cmd.getParameterValue("@P_BASE_ROWID_OUT", NString.class);
			pDetailRowidOut.val = cmd.getParameterValue("@P_DETAIL_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pPidm,NString pBdcaCode,NDate pEffectiveDate,NString pUserId,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PP_DEDUCTION.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
		public static void pUpdate(NNumber pPidm,NString pBdcaCode,NDate pEffectiveDate,NString pAddReplInd,NNumber pAddReplEmpl,NNumber pAddReplEmpr,NNumber pAddReplTaxBase,NString pArrStatus,NNumber pArrBalance,NNumber pBondBalance,NNumber pArrRecoverMax,NString pAddReplPictCode,NString pStatus,NString pRefNo,NNumber pAmount1,NNumber pAmount2,NNumber pAmount3,NNumber pAmount4,NString pOptCode1,NString pOptCode2,NString pOptCode3,NString pOptCode4,NString pOptCode5,NDate pCoverageDate,NString pBdclCode,NString pW4NameChangeInd,NNumber pW4SignedPidm,NDate pW4SignedDate,NString pLockinLetterStatus,NDate pLockinLetterDate,NString pLockinFstaFilSt,NNumber pLockinWithholdAllow,NString pComment,NDate pCommentDate,NString pCommentUserId,NString pUserId,NString pDataOrigin,NString pBreaCode,NDate pEventDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PP_DEDUCTION.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_ADD_REPL_IND", pAddReplInd);
			cmd.addParameter("@P_ADD_REPL_EMPL", pAddReplEmpl);
			cmd.addParameter("@P_ADD_REPL_EMPR", pAddReplEmpr);
			cmd.addParameter("@P_ADD_REPL_TAX_BASE", pAddReplTaxBase);
			cmd.addParameter("@P_ARR_STATUS", pArrStatus);
			cmd.addParameter("@P_ARR_BALANCE", pArrBalance);
			cmd.addParameter("@P_BOND_BALANCE", pBondBalance);
			cmd.addParameter("@P_ARR_RECOVER_MAX", pArrRecoverMax);
			cmd.addParameter("@P_ADD_REPL_PICT_CODE", pAddReplPictCode);
			cmd.addParameter("@P_STATUS", pStatus);
			cmd.addParameter("@P_REF_NO", pRefNo);
			cmd.addParameter("@P_AMOUNT1", pAmount1);
			cmd.addParameter("@P_AMOUNT2", pAmount2);
			cmd.addParameter("@P_AMOUNT3", pAmount3);
			cmd.addParameter("@P_AMOUNT4", pAmount4);
			cmd.addParameter("@P_OPT_CODE1", pOptCode1);
			cmd.addParameter("@P_OPT_CODE2", pOptCode2);
			cmd.addParameter("@P_OPT_CODE3", pOptCode3);
			cmd.addParameter("@P_OPT_CODE4", pOptCode4);
			cmd.addParameter("@P_OPT_CODE5", pOptCode5);
			cmd.addParameter("@P_COVERAGE_DATE", pCoverageDate);
			cmd.addParameter("@P_BDCL_CODE", pBdclCode);
			cmd.addParameter("@P_W4_NAME_CHANGE_IND", pW4NameChangeInd);
			cmd.addParameter("@P_W4_SIGNED_PIDM", pW4SignedPidm);
			cmd.addParameter("@P_W4_SIGNED_DATE", pW4SignedDate);
			cmd.addParameter("@P_LOCKIN_LETTER_STATUS", pLockinLetterStatus);
			cmd.addParameter("@P_LOCKIN_LETTER_DATE", pLockinLetterDate);
			cmd.addParameter("@P_LOCKIN_FSTA_FIL_ST", pLockinFstaFilSt);
			cmd.addParameter("@P_LOCKIN_WITHHOLD_ALLOW", pLockinWithholdAllow);
			cmd.addParameter("@P_COMMENT", pComment);
			cmd.addParameter("@P_COMMENT_DATE", pCommentDate);
			cmd.addParameter("@P_COMMENT_USER_ID", pCommentUserId);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_BREA_CODE", pBreaCode);
			cmd.addParameter("@P_EVENT_DATE", pEventDate);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="DeductionRecRow", dataSourceName="DEDUCTION_REC")
	public static class DeductionRecRow
	{
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_BDCA_CODE")
		public NString RBdcaCode;
		@DbRecordField(dataSourceName="R_ADD_REPL_IND")
		public NString RAddReplInd;
		@DbRecordField(dataSourceName="R_ADD_REPL_EMPL")
		public NNumber RAddReplEmpl;
		@DbRecordField(dataSourceName="R_ADD_REPL_EMPR")
		public NNumber RAddReplEmpr;
		@DbRecordField(dataSourceName="R_ADD_REPL_TAX_BASE")
		public NNumber RAddReplTaxBase;
		@DbRecordField(dataSourceName="R_ARR_STATUS")
		public NString RArrStatus;
		@DbRecordField(dataSourceName="R_ARR_BALANCE")
		public NNumber RArrBalance;
		@DbRecordField(dataSourceName="R_BOND_BALANCE")
		public NNumber RBondBalance;
		@DbRecordField(dataSourceName="R_BEGIN_DATE")
		public NDate RBeginDate;
		@DbRecordField(dataSourceName="R_END_DATE")
		public NDate REndDate;
		@DbRecordField(dataSourceName="R_ARR_RECOVER_MAX")
		public NNumber RArrRecoverMax;
		@DbRecordField(dataSourceName="R_ADD_REPL_PICT_CODE")
		public NString RAddReplPictCode;
		@DbRecordField(dataSourceName="R_EFFECTIVE_DATE")
		public NDate REffectiveDate;
		@DbRecordField(dataSourceName="R_STATUS")
		public NString RStatus;
		@DbRecordField(dataSourceName="R_REF_NO")
		public NString RRefNo;
		@DbRecordField(dataSourceName="R_AMOUNT1")
		public NNumber RAmount1;
		@DbRecordField(dataSourceName="R_AMOUNT2")
		public NNumber RAmount2;
		@DbRecordField(dataSourceName="R_AMOUNT3")
		public NNumber RAmount3;
		@DbRecordField(dataSourceName="R_AMOUNT4")
		public NNumber RAmount4;
		@DbRecordField(dataSourceName="R_OPT_CODE1")
		public NString ROptCode1;
		@DbRecordField(dataSourceName="R_OPT_CODE2")
		public NString ROptCode2;
		@DbRecordField(dataSourceName="R_OPT_CODE3")
		public NString ROptCode3;
		@DbRecordField(dataSourceName="R_OPT_CODE4")
		public NString ROptCode4;
		@DbRecordField(dataSourceName="R_OPT_CODE5")
		public NString ROptCode5;
		@DbRecordField(dataSourceName="R_COVERAGE_DATE")
		public NDate RCoverageDate;
		@DbRecordField(dataSourceName="R_BDCL_CODE")
		public NString RBdclCode;
		@DbRecordField(dataSourceName="R_W4_NAME_CHANGE_IND")
		public NString RW4NameChangeInd;
		@DbRecordField(dataSourceName="R_W4_SIGNED_PIDM")
		public NNumber RW4SignedPidm;
		@DbRecordField(dataSourceName="R_W4_SIGNED_DATE")
		public NDate RW4SignedDate;
		@DbRecordField(dataSourceName="R_LOCKIN_LETTER_STATUS")
		public NString RLockinLetterStatus;
		@DbRecordField(dataSourceName="R_LOCKIN_LETTER_DATE")
		public NDate RLockinLetterDate;
		@DbRecordField(dataSourceName="R_LOCKIN_FSTA_FIL_ST")
		public NString RLockinFstaFilSt;
		@DbRecordField(dataSourceName="R_LOCKIN_WITHHOLD_ALLOW")
		public NNumber RLockinWithholdAllow;
		@DbRecordField(dataSourceName="R_COMMENT")
		public NString RComment;
		@DbRecordField(dataSourceName="R_COMMENT_DATE")
		public NDate RCommentDate;
		@DbRecordField(dataSourceName="R_COMMENT_USER_ID")
		public NString RCommentUserId;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_BREA_CODE")
		public NString RBreaCode;
		@DbRecordField(dataSourceName="R_EVENT_DATE")
		public NDate REventDate;
		@DbRecordField(dataSourceName="R_BASE_INTERNAL_RECORD_ID")
		public NString RBaseInternalRecordId;
		@DbRecordField(dataSourceName="R_DETAIL_INTERNAL_RECORD_ID")
		public NString RDetailInternalRecordId;
	}

	
	
}
