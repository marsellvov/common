package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PvEmpTaxcrReturna {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_EMP_TAXCR_RETURNA.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pPidm,NString pTgrpCode,NString pTxcdCode,NDate pEffectiveDate,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_EMP_TAXCR_RETURNA.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TGRP_CODE", pTgrpCode);
			cmd.addParameter("@P_TXCD_CODE", pTxcdCode);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(EmpTaxcrReturnaRecRow recOne,EmpTaxcrReturnaRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_EMP_TAXCR_RETURNA.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, EmpTaxcrReturnaRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, EmpTaxcrReturnaRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pPidm,NString pTgrpCode,NString pTxcdCode,NDate pEffectiveDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_EMP_TAXCR_RETURNA.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TGRP_CODE", pTgrpCode);
			cmd.addParameter("@P_TXCD_CODE", pTxcdCode);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_EMP_TAXCR_RETURNA.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPidm,NString pTgrpCode,NString pTxcdCode,NDate pEffectiveDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_EMP_TAXCR_RETURNA.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TGRP_CODE", pTgrpCode);
			cmd.addParameter("@P_TXCD_CODE", pTxcdCode);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pPidm,NString pTgrpCode,NString pTxcdCode,NDate pEffectiveDate,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_EMP_TAXCR_RETURNA.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TGRP_CODE", pTgrpCode);
			cmd.addParameter("@P_TXCD_CODE", pTxcdCode);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NNumber pPidm,NString pTgrpCode,NString pTxcdCode,NDate pEffectiveDate,NNumber pEstIncome,NNumber pTotalClaimAmount,NString pNrTaxableIncomeInd,NString pLessIncomeInd,NString pClaimTcaInd,NString pSignatureInd,NDate pSignatureDate,NString pDataSource,NString pUserId,NString pExemptRequestInd,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_EMP_TAXCR_RETURNA.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TGRP_CODE", pTgrpCode);
			cmd.addParameter("@P_TXCD_CODE", pTxcdCode);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_EST_INCOME", pEstIncome);
			cmd.addParameter("@P_TOTAL_CLAIM_AMOUNT", pTotalClaimAmount);
			cmd.addParameter("@P_NR_TAXABLE_INCOME_IND", pNrTaxableIncomeInd);
			cmd.addParameter("@P_LESS_INCOME_IND", pLessIncomeInd);
			cmd.addParameter("@P_CLAIM_TCA_IND", pClaimTcaInd);
			cmd.addParameter("@P_SIGNATURE_IND", pSignatureInd);
			cmd.addParameter("@P_SIGNATURE_DATE", pSignatureDate);
			cmd.addParameter("@P_DATA_SOURCE", pDataSource);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_EXEMPT_REQUEST_IND", pExemptRequestInd);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pPidm,NString pTgrpCode,NString pTxcdCode,NDate pEffectiveDate,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_EMP_TAXCR_RETURNA.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TGRP_CODE", pTgrpCode);
			cmd.addParameter("@P_TXCD_CODE", pTxcdCode);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pPidm,NString pTgrpCode,NString pTxcdCode,NDate pEffectiveDate,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_EMP_TAXCR_RETURNA.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TGRP_CODE", pTgrpCode);
			cmd.addParameter("@P_TXCD_CODE", pTxcdCode);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pPidm,NString pTgrpCode,NString pTxcdCode,NDate pEffectiveDate,NNumber pEstIncome,NNumber pTotalClaimAmount,NString pNrTaxableIncomeInd,NString pLessIncomeInd,NString pClaimTcaInd,NString pSignatureInd,NDate pSignatureDate,NString pDataSource,NString pUserId,NString pExemptRequestInd,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_EMP_TAXCR_RETURNA.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TGRP_CODE", pTgrpCode);
			cmd.addParameter("@P_TXCD_CODE", pTxcdCode);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_EST_INCOME", pEstIncome);
			cmd.addParameter("@P_TOTAL_CLAIM_AMOUNT", pTotalClaimAmount);
			cmd.addParameter("@P_NR_TAXABLE_INCOME_IND", pNrTaxableIncomeInd);
			cmd.addParameter("@P_LESS_INCOME_IND", pLessIncomeInd);
			cmd.addParameter("@P_CLAIM_TCA_IND", pClaimTcaInd);
			cmd.addParameter("@P_SIGNATURE_IND", pSignatureInd);
			cmd.addParameter("@P_SIGNATURE_DATE", pSignatureDate);
			cmd.addParameter("@P_DATA_SOURCE", pDataSource);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_EXEMPT_REQUEST_IND", pExemptRequestInd);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	@DbRecordType(id="EmpTaxcrReturnaRecRow", dataSourceName="EMP_TAXCR_RETURNA_REC", needsInitialization=true)
	public static class EmpTaxcrReturnaRecRow
	{
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_TGRP_CODE")
		public NString RTgrpCode;
		@DbRecordField(dataSourceName="R_TXCD_CODE")
		public NString RTxcdCode;
		@DbRecordField(dataSourceName="R_EFFECTIVE_DATE")
		public NDate REffectiveDate;
		@DbRecordField(dataSourceName="R_EST_INCOME")
		public NNumber REstIncome;
		@DbRecordField(dataSourceName="R_TOTAL_CLAIM_AMOUNT")
		public NNumber RTotalClaimAmount;
		@DbRecordField(dataSourceName="R_NR_TAXABLE_INCOME_IND")
		public NString RNrTaxableIncomeInd;
		@DbRecordField(dataSourceName="R_LESS_INCOME_IND")
		public NString RLessIncomeInd;
		@DbRecordField(dataSourceName="R_CLAIM_TCA_IND")
		public NString RClaimTcaInd;
		@DbRecordField(dataSourceName="R_SIGNATURE_IND")
		public NString RSignatureInd;
		@DbRecordField(dataSourceName="R_SIGNATURE_DATE")
		public NDate RSignatureDate;
		@DbRecordField(dataSourceName="R_DATA_SOURCE")
		public NString RDataSource;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_EXEMPT_REQUEST_IND")
		public NString RExemptRequestInd;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
