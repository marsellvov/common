package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PbDeductionBase {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_DEDUCTION_BASE.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pPidm,NString pBdcaCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_DEDUCTION_BASE.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(DeductionBaseRecRow recOne,DeductionBaseRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_DEDUCTION_BASE.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, DeductionBaseRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, DeductionBaseRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_DEDUCTION_BASE.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPidm,NString pBdcaCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_DEDUCTION_BASE.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pPidm,NString pBdcaCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_DEDUCTION_BASE.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NNumber pPidm,NString pBdcaCode,NString pAddReplInd,NNumber pAddReplEmpl,NNumber pAddReplEmpr,NNumber pAddReplTaxBase,NString pArrStatus,NNumber pArrBalance,NNumber pBondBalance,NDate pBeginDate,NDate pEndDate,NNumber pArrRecoverMax,NString pAddReplPictCode,NString pUserId,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_DEDUCTION_BASE.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_ADD_REPL_IND", pAddReplInd);
			cmd.addParameter("@P_ADD_REPL_EMPL", pAddReplEmpl);
			cmd.addParameter("@P_ADD_REPL_EMPR", pAddReplEmpr);
			cmd.addParameter("@P_ADD_REPL_TAX_BASE", pAddReplTaxBase);
			cmd.addParameter("@P_ARR_STATUS", pArrStatus);
			cmd.addParameter("@P_ARR_BALANCE", pArrBalance);
			cmd.addParameter("@P_BOND_BALANCE", pBondBalance);
			cmd.addParameter("@P_BEGIN_DATE", pBeginDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_ARR_RECOVER_MAX", pArrRecoverMax);
			cmd.addParameter("@P_ADD_REPL_PICT_CODE", pAddReplPictCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pPidm,NString pBdcaCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_DEDUCTION_BASE.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pPidm,NString pBdcaCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_DEDUCTION_BASE.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pOverlayValidationRec(Ref<DeductionBaseRecRow> pRecInOut,NNumber pPidm,NString pBdcaCode,NString pAddReplInd,NNumber pAddReplEmpl,NNumber pAddReplEmpr,NNumber pAddReplTaxBase,NString pArrStatus,NNumber pArrBalance,NNumber pBondBalance,NDate pBeginDate,NDate pEndDate,NNumber pArrRecoverMax,NString pAddReplPictCode,NString pUserId,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_DEDUCTION_BASE.P_OVERLAY_VALIDATION_REC", DbManager.getDataBaseFactory());
			
			cmd.addParameter(DbTypes.createStructType("P_REC_IN_OUT", pRecInOut.val, DeductionBaseRecRow.class, true));
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_ADD_REPL_IND", pAddReplInd);
			cmd.addParameter("@P_ADD_REPL_EMPL", pAddReplEmpl);
			cmd.addParameter("@P_ADD_REPL_EMPR", pAddReplEmpr);
			cmd.addParameter("@P_ADD_REPL_TAX_BASE", pAddReplTaxBase);
			cmd.addParameter("@P_ARR_STATUS", pArrStatus);
			cmd.addParameter("@P_ARR_BALANCE", pArrBalance);
			cmd.addParameter("@P_BOND_BALANCE", pBondBalance);
			cmd.addParameter("@P_BEGIN_DATE", pBeginDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_ARR_RECOVER_MAX", pArrRecoverMax);
			cmd.addParameter("@P_ADD_REPL_PICT_CODE", pAddReplPictCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();
			pRecInOut.val = cmd.getParameterValue("@P_REC_IN_OUT", DeductionBaseRecRow.class);


		}
		
		public static void pUpdate(NNumber pPidm,NString pBdcaCode,NString pAddReplInd,NNumber pAddReplEmpl,NNumber pAddReplEmpr,NNumber pAddReplTaxBase,NString pArrStatus,NNumber pArrBalance,NNumber pBondBalance,NDate pBeginDate,NDate pEndDate,NNumber pArrRecoverMax,NString pAddReplPictCode,NString pUserId,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_DEDUCTION_BASE.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_ADD_REPL_IND", pAddReplInd);
			cmd.addParameter("@P_ADD_REPL_EMPL", pAddReplEmpl);
			cmd.addParameter("@P_ADD_REPL_EMPR", pAddReplEmpr);
			cmd.addParameter("@P_ADD_REPL_TAX_BASE", pAddReplTaxBase);
			cmd.addParameter("@P_ARR_STATUS", pArrStatus);
			cmd.addParameter("@P_ARR_BALANCE", pArrBalance);
			cmd.addParameter("@P_BOND_BALANCE", pBondBalance);
			cmd.addParameter("@P_BEGIN_DATE", pBeginDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_ARR_RECOVER_MAX", pArrRecoverMax);
			cmd.addParameter("@P_ADD_REPL_PICT_CODE", pAddReplPictCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="DeductionBaseRecRow", dataSourceName="DEDUCTION_BASE_REC")
	public static class DeductionBaseRecRow
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
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
