package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class TbContractAuth {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_CONTRACT_AUTH.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fContractDefined(NNumber pContractPidm,NString pTermCode,NNumber pContractNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_CONTRACT_AUTH.F_CONTRACT_DEFINED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CONTRACT_PIDM", pContractPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CONTRACT_NUMBER", pContractNumber);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fContractMemoExists(NNumber pContractPidm,NString pTermCode,NNumber pContractNumber,NNumber pStuPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_CONTRACT_AUTH.F_CONTRACT_MEMO_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CONTRACT_PIDM", pContractPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CONTRACT_NUMBER", pContractNumber);
			cmd.addParameter("@P_STU_PIDM", pStuPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fContractProcessed(NNumber pContractPidm,NString pTermCode,NNumber pContractNumber,NNumber pStuPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_CONTRACT_AUTH.F_CONTRACT_PROCESSED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CONTRACT_PIDM", pContractPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CONTRACT_NUMBER", pContractNumber);
			cmd.addParameter("@P_STU_PIDM", pStuPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fExists(NNumber pContractPidm,NString pTermCode,NNumber pContractNumber,NNumber pStuPidm,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_CONTRACT_AUTH.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CONTRACT_PIDM", pContractPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CONTRACT_NUMBER", pContractNumber);
			cmd.addParameter("@P_STU_PIDM", pStuPidm);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(ContractAuthRecRow recOne,ContractAuthRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_CONTRACT_AUTH.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, ContractAuthRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, ContractAuthRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fMaxPriority(NNumber pStuPidm,NString pTermCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_CONTRACT_AUTH.F_MAX_PRIORITY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_STU_PIDM", pStuPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static DataCursor fQueryAllByCont(NNumber pContractPidm,NString pTermCode,NNumber pContractNumber,NNumber pStuPidm,NString pStudentContRollInd,NString pTermCodeExpiration) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_CONTRACT_AUTH.F_QUERY_ALL_BY_CONT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_CONTRACT_PIDM", pContractPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CONTRACT_NUMBER", pContractNumber);
			cmd.addParameter("@P_STU_PIDM", pStuPidm);
			cmd.addParameter("@P_STUDENT_CONT_ROLL_IND", pStudentContRollInd);
			cmd.addParameter("@P_TERM_CODE_EXPIRATION", pTermCodeExpiration);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryAllByStu(NNumber pContractPidm,NString pTermCode,NNumber pContractNumber,NNumber pStuPidm,NString pStudentContRollInd,NString pTermCodeExpiration) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_CONTRACT_AUTH.F_QUERY_ALL_BY_STU", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_CONTRACT_PIDM", pContractPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CONTRACT_NUMBER", pContractNumber);
			cmd.addParameter("@P_STU_PIDM", pStuPidm);
			cmd.addParameter("@P_STUDENT_CONT_ROLL_IND", pStudentContRollInd);
			cmd.addParameter("@P_TERM_CODE_EXPIRATION", pTermCodeExpiration);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_CONTRACT_AUTH.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pContractPidm,NString pTermCode,NNumber pContractNumber,NNumber pStuPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_CONTRACT_AUTH.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_CONTRACT_PIDM", pContractPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CONTRACT_NUMBER", pContractNumber);
			cmd.addParameter("@P_STU_PIDM", pStuPidm);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pContractPidm,NString pTermCode,NNumber pContractNumber,NNumber pStuPidm,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_CONTRACT_AUTH.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_CONTRACT_PIDM", pContractPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CONTRACT_NUMBER", pContractNumber);
			cmd.addParameter("@P_STU_PIDM", pStuPidm);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static NString fStudentAssigned(NNumber pContractPidm,NString pTermCode,NNumber pContractNumber,NNumber pStuPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_CONTRACT_AUTH.F_STUDENT_ASSIGNED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CONTRACT_PIDM", pContractPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CONTRACT_NUMBER", pContractNumber);
			cmd.addParameter("@P_STU_PIDM", pStuPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fStudentTextExists(NNumber pContractPidm,NString pTermCode,NNumber pContractNumber,NNumber pStuPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_CONTRACT_AUTH.F_STUDENT_TEXT_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CONTRACT_PIDM", pContractPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CONTRACT_NUMBER", pContractNumber);
			cmd.addParameter("@P_STU_PIDM", pStuPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fSumChargeAmount(NNumber pContractPidm,NString pTermCode,NNumber pContractNumber,NNumber pStuPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_CONTRACT_AUTH.F_SUM_CHARGE_AMOUNT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_CONTRACT_PIDM", pContractPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CONTRACT_NUMBER", pContractNumber);
			cmd.addParameter("@P_STU_PIDM", pStuPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fSumChargeBalance(NNumber pContractPidm,NString pTermCode,NNumber pContractNumber,NNumber pStuPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_CONTRACT_AUTH.F_SUM_CHARGE_BALANCE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_CONTRACT_PIDM", pContractPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CONTRACT_NUMBER", pContractNumber);
			cmd.addParameter("@P_STU_PIDM", pStuPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fSumPaymentAmount(NNumber pContractPidm,NString pTermCode,NNumber pContractNumber,NNumber pStuPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_CONTRACT_AUTH.F_SUM_PAYMENT_AMOUNT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_CONTRACT_PIDM", pContractPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CONTRACT_NUMBER", pContractNumber);
			cmd.addParameter("@P_STU_PIDM", pStuPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fSumPaymentBalance(NNumber pContractPidm,NString pTermCode,NNumber pContractNumber,NNumber pStuPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_CONTRACT_AUTH.F_SUM_PAYMENT_BALANCE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_CONTRACT_PIDM", pContractPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CONTRACT_NUMBER", pContractNumber);
			cmd.addParameter("@P_STU_PIDM", pStuPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void pCreate(NNumber pStuPidm,NNumber pContractPriority,NNumber pContractPidm,NNumber pContractNumber,NString pTermCode,NString pDelInd,NString pAuthNumber,NString pAuthInd,NString pStudentContRollInd,NString pTermCodeExpiration,NString pSponsorRefNumber,NString pUserId,NNumber pMaxStudentAmount,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_CONTRACT_AUTH.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_STU_PIDM", pStuPidm);
			cmd.addParameter("@P_CONTRACT_PRIORITY", pContractPriority);
			cmd.addParameter("@P_CONTRACT_PIDM", pContractPidm);
			cmd.addParameter("@P_CONTRACT_NUMBER", pContractNumber);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_DEL_IND", pDelInd);
			cmd.addParameter("@P_AUTH_NUMBER", pAuthNumber);
			cmd.addParameter("@P_AUTH_IND", pAuthInd);
			cmd.addParameter("@P_STUDENT_CONT_ROLL_IND", pStudentContRollInd);
			cmd.addParameter("@P_TERM_CODE_EXPIRATION", pTermCodeExpiration);
			cmd.addParameter("@P_SPONSOR_REF_NUMBER", pSponsorRefNumber);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_MAX_STUDENT_AMOUNT", pMaxStudentAmount);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pContractPidm,NString pTermCode,NNumber pContractNumber,NNumber pStuPidm,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_CONTRACT_AUTH.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CONTRACT_PIDM", pContractPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CONTRACT_NUMBER", pContractNumber);
			cmd.addParameter("@P_STU_PIDM", pStuPidm);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pContractPidm,NString pTermCode,NNumber pContractNumber,NNumber pStuPidm,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_CONTRACT_AUTH.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CONTRACT_PIDM", pContractPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CONTRACT_NUMBER", pContractNumber);
			cmd.addParameter("@P_STU_PIDM", pStuPidm);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pStuPidm,NNumber pContractPriority,NNumber pContractPidm,NNumber pContractNumber,NString pTermCode,NString pDelInd,NString pAuthNumber,NString pAuthInd,NString pStudentContRollInd,NString pTermCodeExpiration,NString pSponsorRefNumber,NString pUserId,NNumber pMaxStudentAmount,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_CONTRACT_AUTH.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_STU_PIDM", pStuPidm);
			cmd.addParameter("@P_CONTRACT_PRIORITY", pContractPriority);
			cmd.addParameter("@P_CONTRACT_PIDM", pContractPidm);
			cmd.addParameter("@P_CONTRACT_NUMBER", pContractNumber);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_DEL_IND", pDelInd);
			cmd.addParameter("@P_AUTH_NUMBER", pAuthNumber);
			cmd.addParameter("@P_AUTH_IND", pAuthInd);
			cmd.addParameter("@P_STUDENT_CONT_ROLL_IND", pStudentContRollInd);
			cmd.addParameter("@P_TERM_CODE_EXPIRATION", pTermCodeExpiration);
			cmd.addParameter("@P_SPONSOR_REF_NUMBER", pSponsorRefNumber);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_MAX_STUDENT_AMOUNT", pMaxStudentAmount);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="ContractAuthRecRow", dataSourceName="CONTRACT_AUTH_REC")
	public static class ContractAuthRecRow
	{
		@DbRecordField(dataSourceName="R_STU_PIDM")
		public NNumber RStuPidm;
		@DbRecordField(dataSourceName="R_CONTRACT_PRIORITY")
		public NNumber RContractPriority;
		@DbRecordField(dataSourceName="R_CONTRACT_PIDM")
		public NNumber RContractPidm;
		@DbRecordField(dataSourceName="R_CONTRACT_NUMBER")
		public NNumber RContractNumber;
		@DbRecordField(dataSourceName="R_TERM_CODE")
		public NString RTermCode;
		@DbRecordField(dataSourceName="R_DEL_IND")
		public NString RDelInd;
		@DbRecordField(dataSourceName="R_AUTH_NUMBER")
		public NString RAuthNumber;
		@DbRecordField(dataSourceName="R_AUTH_IND")
		public NString RAuthInd;
		@DbRecordField(dataSourceName="R_STUDENT_CONT_ROLL_IND")
		public NString RStudentContRollInd;
		@DbRecordField(dataSourceName="R_TERM_CODE_EXPIRATION")
		public NString RTermCodeExpiration;
		@DbRecordField(dataSourceName="R_SPONSOR_REF_NUMBER")
		public NString RSponsorRefNumber;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_MAX_STUDENT_AMOUNT")
		public NNumber RMaxStudentAmount;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
