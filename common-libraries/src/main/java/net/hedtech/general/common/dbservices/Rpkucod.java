package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Rpkucod {
		public static NString fExistsRptuapp(NString pAidyCode,NNumber pAppId,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPKUCOD.F_EXISTS_RPTUAPP", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_APP_ID", pAppId);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fExistsRptuecs(NString pAidyCode,NString pSsn,NString pCounselingType,NString pSource,NString pEntranceType,NNumber pSequenceNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPKUCOD.F_EXISTS_RPTUECS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_SSN", pSsn);
			cmd.addParameter("@P_COUNSELING_TYPE", pCounselingType);
			cmd.addParameter("@P_SOURCE", pSource);
			cmd.addParameter("@P_ENTRANCE_TYPE", pEntranceType);
			cmd.addParameter("@P_SEQUENCE_NO", pSequenceNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryOneLockRptuapp(NString pAidyCode,NNumber pAppId,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPKUCOD.F_QUERY_ONE_LOCK_RPTUAPP", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_APP_ID", pAppId);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLockRptuecs(NString pAidyCode,NString pSsn,NString pCounselingType,NString pSource,NString pEntranceType,NNumber pSequenceNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPKUCOD.F_QUERY_ONE_LOCK_RPTUECS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_SSN", pSsn);
			cmd.addParameter("@P_COUNSELING_TYPE", pCounselingType);
			cmd.addParameter("@P_SOURCE", pSource);
			cmd.addParameter("@P_ENTRANCE_TYPE", pEntranceType);
			cmd.addParameter("@P_SEQUENCE_NO", pSequenceNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneRptuapp(NString pAidyCode,NNumber pAppId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPKUCOD.F_QUERY_ONE_RPTUAPP", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_APP_ID", pAppId);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneRptuecs(NString pAidyCode,NString pSsn,NString pCounselingType,NString pSource,NString pEntranceType,NNumber pSequenceNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPKUCOD.F_QUERY_ONE_RPTUECS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_SSN", pSsn);
			cmd.addParameter("@P_COUNSELING_TYPE", pCounselingType);
			cmd.addParameter("@P_SOURCE", pSource);
			cmd.addParameter("@P_ENTRANCE_TYPE", pEntranceType);
			cmd.addParameter("@P_SEQUENCE_NO", pSequenceNo);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pDeleteRptuapp(NString pAidyCode,NNumber pAppId,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPKUCOD.P_DELETE_RPTUAPP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_APP_ID", pAppId);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pDeleteRptuecs(NString pAidyCode,NString pSsn,NString pCounselingType,NString pSource,NString pEntranceType,NNumber pSequenceNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPKUCOD.P_DELETE_RPTUECS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_SSN", pSsn);
			cmd.addParameter("@P_COUNSELING_TYPE", pCounselingType);
			cmd.addParameter("@P_SOURCE", pSource);
			cmd.addParameter("@P_ENTRANCE_TYPE", pEntranceType);
			cmd.addParameter("@P_SEQUENCE_NO", pSequenceNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pInsertRprlecs(NString pPidm,NString pAidyCode,NString pSsn,NString pCounselingType,NString pSource,NString pEntranceType,NNumber pSequenceNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPKUCOD.P_INSERT_RPRLECS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_SSN", pSsn);
			cmd.addParameter("@P_COUNSELING_TYPE", pCounselingType);
			cmd.addParameter("@P_SOURCE", pSource);
			cmd.addParameter("@P_ENTRANCE_TYPE", pEntranceType);
			cmd.addParameter("@P_SEQUENCE_NO", pSequenceNo);
				
			cmd.execute();


		}
		
		public static void pInsertRptuapp(NString pAidyCode,NNumber pAppId,NString pSsn,NString pBorrSsn,NString pType,NString pCreditStatus,NDate pCreditDate,NString pMaxLoanInd,NDate pAppCompDate,NString pDefermentOpt,NString pCreditBalanceOpt,NNumber pPidm,NString pOrigCreditStatus,NDate pCreditCheckExpDate,NNumber pAppLoanAmt,NNumber pEndorserAmt,NString pCrActionOpt,NString pCrAppealStatus,NString pCrOverrideCde,NDate pBirthDate,NString pLastName,NString pFirstName,NString pMi,NString pAddress,NString pCity,NString pStatCode,NString pZip,NString pNatnCode,NString pPhoneNo,NString pEmail,NString pLocalAddress,NString pLocalCity,NString pLocalStatCode,NString pLocalZip,NString pLocalNatnCode,NDate pBorrBirthDate,NString pBorrLastName,NString pBorrFirstName,NString pBorrMi,NString pBorrCitzInd,NString pBorrAddress,NString pBorrCity,NString pBorrStatCode,NString pBorrZip,NString pBorrNatnCode,NString pBorrPhoneNo,NString pBorrEmail,NString pBorrLocalAddr,NString pBorrLocalCity,NString pBorrLocalStatCode,NString pBorrLocalZip,NString pBorrLocalNatnCode,NString pDocumentId,NString pUserId,NString pDataOrigin,NString pAddrLine2,NString pAddrLine3,NString pLocalAddrLine2,NString pLocalAddrLine3,NString pBorrAddrLine2,NString pBorrAddrLine3,NString pBorrLocalAddrLine2,NString pBorrLocalAddrLine3,NString pPlusAppReason,NString pUnknownLoanAmtInd,NNumber pPreviousAppId,NDate pReqAwardStartDate,NDate pReqAwardEndDate,NString pBorrInDefault,NString pSchoolCrBalanceOpt,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPKUCOD.P_INSERT_RPTUAPP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_APP_ID", pAppId);
			cmd.addParameter("@P_SSN", pSsn);
			cmd.addParameter("@P_BORR_SSN", pBorrSsn);
			cmd.addParameter("@P_TYPE", pType);
			cmd.addParameter("@P_CREDIT_STATUS", pCreditStatus);
			cmd.addParameter("@P_CREDIT_DATE", pCreditDate);
			cmd.addParameter("@P_MAX_LOAN_IND", pMaxLoanInd);
			cmd.addParameter("@P_APP_COMP_DATE", pAppCompDate);
			cmd.addParameter("@P_DEFERMENT_OPT", pDefermentOpt);
			cmd.addParameter("@P_CREDIT_BALANCE_OPT", pCreditBalanceOpt);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ORIG_CREDIT_STATUS", pOrigCreditStatus);
			cmd.addParameter("@P_CREDIT_CHECK_EXP_DATE", pCreditCheckExpDate);
			cmd.addParameter("@P_APP_LOAN_AMT", pAppLoanAmt);
			cmd.addParameter("@P_ENDORSER_AMT", pEndorserAmt);
			cmd.addParameter("@P_CR_ACTION_OPT", pCrActionOpt);
			cmd.addParameter("@P_CR_APPEAL_STATUS", pCrAppealStatus);
			cmd.addParameter("@P_CR_OVERRIDE_CDE", pCrOverrideCde);
			cmd.addParameter("@P_BIRTH_DATE", pBirthDate);
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_FIRST_NAME", pFirstName);
			cmd.addParameter("@P_MI", pMi);
			cmd.addParameter("@P_ADDRESS", pAddress);
			cmd.addParameter("@P_CITY", pCity);
			cmd.addParameter("@P_STAT_CODE", pStatCode);
			cmd.addParameter("@P_ZIP", pZip);
			cmd.addParameter("@P_NATN_CODE", pNatnCode);
			cmd.addParameter("@P_PHONE_NO", pPhoneNo);
			cmd.addParameter("@P_EMAIL", pEmail);
			cmd.addParameter("@P_LOCAL_ADDRESS", pLocalAddress);
			cmd.addParameter("@P_LOCAL_CITY", pLocalCity);
			cmd.addParameter("@P_LOCAL_STAT_CODE", pLocalStatCode);
			cmd.addParameter("@P_LOCAL_ZIP", pLocalZip);
			cmd.addParameter("@P_LOCAL_NATN_CODE", pLocalNatnCode);
			cmd.addParameter("@P_BORR_BIRTH_DATE", pBorrBirthDate);
			cmd.addParameter("@P_BORR_LAST_NAME", pBorrLastName);
			cmd.addParameter("@P_BORR_FIRST_NAME", pBorrFirstName);
			cmd.addParameter("@P_BORR_MI", pBorrMi);
			cmd.addParameter("@P_BORR_CITZ_IND", pBorrCitzInd);
			cmd.addParameter("@P_BORR_ADDRESS", pBorrAddress);
			cmd.addParameter("@P_BORR_CITY", pBorrCity);
			cmd.addParameter("@P_BORR_STAT_CODE", pBorrStatCode);
			cmd.addParameter("@P_BORR_ZIP", pBorrZip);
			cmd.addParameter("@P_BORR_NATN_CODE", pBorrNatnCode);
			cmd.addParameter("@P_BORR_PHONE_NO", pBorrPhoneNo);
			cmd.addParameter("@P_BORR_EMAIL", pBorrEmail);
			cmd.addParameter("@P_BORR_LOCAL_ADDR", pBorrLocalAddr);
			cmd.addParameter("@P_BORR_LOCAL_CITY", pBorrLocalCity);
			cmd.addParameter("@P_BORR_LOCAL_STAT_CODE", pBorrLocalStatCode);
			cmd.addParameter("@P_BORR_LOCAL_ZIP", pBorrLocalZip);
			cmd.addParameter("@P_BORR_LOCAL_NATN_CODE", pBorrLocalNatnCode);
			cmd.addParameter("@P_DOCUMENT_ID", pDocumentId);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ADDR_LINE2", pAddrLine2);
			cmd.addParameter("@P_ADDR_LINE3", pAddrLine3);
			cmd.addParameter("@P_LOCAL_ADDR_LINE2", pLocalAddrLine2);
			cmd.addParameter("@P_LOCAL_ADDR_LINE3", pLocalAddrLine3);
			cmd.addParameter("@P_BORR_ADDR_LINE2", pBorrAddrLine2);
			cmd.addParameter("@P_BORR_ADDR_LINE3", pBorrAddrLine3);
			cmd.addParameter("@P_BORR_LOCAL_ADDR_LINE2", pBorrLocalAddrLine2);
			cmd.addParameter("@P_BORR_LOCAL_ADDR_LINE3", pBorrLocalAddrLine3);
			cmd.addParameter("@P_PLUS_APP_REASON", pPlusAppReason);
			cmd.addParameter("@P_UNKNOWN_LOAN_AMT_IND", pUnknownLoanAmtInd);
			cmd.addParameter("@P_PREVIOUS_APP_ID", pPreviousAppId);
			cmd.addParameter("@P_REQ_AWARD_START_DATE", pReqAwardStartDate);
			cmd.addParameter("@P_REQ_AWARD_END_DATE", pReqAwardEndDate);
			cmd.addParameter("@P_BORR_IN_DEFAULT", pBorrInDefault);
			cmd.addParameter("@P_SCHOOL_CR_BALANCE_OPT", pSchoolCrBalanceOpt);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pInsertRptuecs(NString pAidyCode,NString pSsn,NString pCounselingType,NString pSource,NString pEntranceType,NNumber pSequenceNo,NDate pCompDate,NString pRrAck,NDate pBirthDate,NString pLastName,NString pFirstName,NString pMi,NString pUserId,NString pDataOrigin,NString pDocumentId,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPKUCOD.P_INSERT_RPTUECS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_SSN", pSsn);
			cmd.addParameter("@P_COUNSELING_TYPE", pCounselingType);
			cmd.addParameter("@P_SOURCE", pSource);
			cmd.addParameter("@P_ENTRANCE_TYPE", pEntranceType);
			cmd.addParameter("@P_SEQUENCE_NO", pSequenceNo);
			cmd.addParameter("@P_COMP_DATE", pCompDate);
			cmd.addParameter("@P_RR_ACK", pRrAck);
			cmd.addParameter("@P_BIRTH_DATE", pBirthDate);
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_FIRST_NAME", pFirstName);
			cmd.addParameter("@P_MI", pMi);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_DOCUMENT_ID", pDocumentId);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pLockRptuapp(NString pAidyCode,NNumber pAppId,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPKUCOD.P_LOCK_RPTUAPP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_APP_ID", pAppId);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pLockRptuecs(NString pAidyCode,NString pSsn,NString pCounselingType,NString pSource,NString pEntranceType,NNumber pSequenceNo,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPKUCOD.P_LOCK_RPTUECS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_SSN", pSsn);
			cmd.addParameter("@P_COUNSELING_TYPE", pCounselingType);
			cmd.addParameter("@P_SOURCE", pSource);
			cmd.addParameter("@P_ENTRANCE_TYPE", pEntranceType);
			cmd.addParameter("@P_SEQUENCE_NO", pSequenceNo);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pProcessRptuapp(NString pAidyCode,NNumber pPidm,NString pLoanType,NString pSsn,NDate pBirthDate,NString pLastName,NString pDlLoanId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPKUCOD.P_PROCESS_RPTUAPP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_LOAN_TYPE", pLoanType);
			cmd.addParameter("@P_SSN", pSsn);
			cmd.addParameter("@P_BIRTH_DATE", pBirthDate);
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_DL_LOAN_ID", pDlLoanId);
				
			cmd.execute();


		}
		
		public static void pUpdateRptuapp(NString pAidyCode,NNumber pAppId,NString pSsn,NString pBorrSsn,NString pType,NString pCreditStatus,NDate pCreditDate,NString pMaxLoanInd,NDate pAppCompDate,NString pDefermentOpt,NString pCreditBalanceOpt,NNumber pPidm,NString pOrigCreditStatus,NDate pCreditCheckExpDate,NNumber pAppLoanAmt,NNumber pEndorserAmt,NString pCrActionOpt,NString pCrAppealStatus,NString pCrOverrideCde,NDate pBirthDate,NString pLastName,NString pFirstName,NString pMi,NString pAddress,NString pCity,NString pStatCode,NString pZip,NString pNatnCode,NString pPhoneNo,NString pEmail,NString pLocalAddress,NString pLocalCity,NString pLocalStatCode,NString pLocalZip,NString pLocalNatnCode,NDate pBorrBirthDate,NString pBorrLastName,NString pBorrFirstName,NString pBorrMi,NString pBorrCitzInd,NString pBorrAddress,NString pBorrCity,NString pBorrStatCode,NString pBorrZip,NString pBorrNatnCode,NString pBorrPhoneNo,NString pBorrEmail,NString pBorrLocalAddr,NString pBorrLocalCity,NString pBorrLocalStatCode,NString pBorrLocalZip,NString pBorrLocalNatnCode,NString pDocumentId,NString pUserId,NString pDataOrigin,NString pAddrLine2,NString pAddrLine3,NString pLocalAddrLine2,NString pLocalAddrLine3,NString pBorrAddrLine2,NString pBorrAddrLine3,NString pBorrLocalAddrLine2,NString pBorrLocalAddrLine3,NString pPlusAppReason,NString pUnknownLoanAmtInd,NNumber pPreviousAppId,NDate pReqAwardStartDate,NDate pReqAwardEndDate,NString pBorrInDefault,NString pSchoolCrBalanceOpt,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPKUCOD.P_UPDATE_RPTUAPP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_APP_ID", pAppId);
			cmd.addParameter("@P_SSN", pSsn);
			cmd.addParameter("@P_BORR_SSN", pBorrSsn);
			cmd.addParameter("@P_TYPE", pType);
			cmd.addParameter("@P_CREDIT_STATUS", pCreditStatus);
			cmd.addParameter("@P_CREDIT_DATE", pCreditDate);
			cmd.addParameter("@P_MAX_LOAN_IND", pMaxLoanInd);
			cmd.addParameter("@P_APP_COMP_DATE", pAppCompDate);
			cmd.addParameter("@P_DEFERMENT_OPT", pDefermentOpt);
			cmd.addParameter("@P_CREDIT_BALANCE_OPT", pCreditBalanceOpt);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ORIG_CREDIT_STATUS", pOrigCreditStatus);
			cmd.addParameter("@P_CREDIT_CHECK_EXP_DATE", pCreditCheckExpDate);
			cmd.addParameter("@P_APP_LOAN_AMT", pAppLoanAmt);
			cmd.addParameter("@P_ENDORSER_AMT", pEndorserAmt);
			cmd.addParameter("@P_CR_ACTION_OPT", pCrActionOpt);
			cmd.addParameter("@P_CR_APPEAL_STATUS", pCrAppealStatus);
			cmd.addParameter("@P_CR_OVERRIDE_CDE", pCrOverrideCde);
			cmd.addParameter("@P_BIRTH_DATE", pBirthDate);
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_FIRST_NAME", pFirstName);
			cmd.addParameter("@P_MI", pMi);
			cmd.addParameter("@P_ADDRESS", pAddress);
			cmd.addParameter("@P_CITY", pCity);
			cmd.addParameter("@P_STAT_CODE", pStatCode);
			cmd.addParameter("@P_ZIP", pZip);
			cmd.addParameter("@P_NATN_CODE", pNatnCode);
			cmd.addParameter("@P_PHONE_NO", pPhoneNo);
			cmd.addParameter("@P_EMAIL", pEmail);
			cmd.addParameter("@P_LOCAL_ADDRESS", pLocalAddress);
			cmd.addParameter("@P_LOCAL_CITY", pLocalCity);
			cmd.addParameter("@P_LOCAL_STAT_CODE", pLocalStatCode);
			cmd.addParameter("@P_LOCAL_ZIP", pLocalZip);
			cmd.addParameter("@P_LOCAL_NATN_CODE", pLocalNatnCode);
			cmd.addParameter("@P_BORR_BIRTH_DATE", pBorrBirthDate);
			cmd.addParameter("@P_BORR_LAST_NAME", pBorrLastName);
			cmd.addParameter("@P_BORR_FIRST_NAME", pBorrFirstName);
			cmd.addParameter("@P_BORR_MI", pBorrMi);
			cmd.addParameter("@P_BORR_CITZ_IND", pBorrCitzInd);
			cmd.addParameter("@P_BORR_ADDRESS", pBorrAddress);
			cmd.addParameter("@P_BORR_CITY", pBorrCity);
			cmd.addParameter("@P_BORR_STAT_CODE", pBorrStatCode);
			cmd.addParameter("@P_BORR_ZIP", pBorrZip);
			cmd.addParameter("@P_BORR_NATN_CODE", pBorrNatnCode);
			cmd.addParameter("@P_BORR_PHONE_NO", pBorrPhoneNo);
			cmd.addParameter("@P_BORR_EMAIL", pBorrEmail);
			cmd.addParameter("@P_BORR_LOCAL_ADDR", pBorrLocalAddr);
			cmd.addParameter("@P_BORR_LOCAL_CITY", pBorrLocalCity);
			cmd.addParameter("@P_BORR_LOCAL_STAT_CODE", pBorrLocalStatCode);
			cmd.addParameter("@P_BORR_LOCAL_ZIP", pBorrLocalZip);
			cmd.addParameter("@P_BORR_LOCAL_NATN_CODE", pBorrLocalNatnCode);
			cmd.addParameter("@P_DOCUMENT_ID", pDocumentId);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ADDR_LINE2", pAddrLine2);
			cmd.addParameter("@P_ADDR_LINE3", pAddrLine3);
			cmd.addParameter("@P_LOCAL_ADDR_LINE2", pLocalAddrLine2);
			cmd.addParameter("@P_LOCAL_ADDR_LINE3", pLocalAddrLine3);
			cmd.addParameter("@P_BORR_ADDR_LINE2", pBorrAddrLine2);
			cmd.addParameter("@P_BORR_ADDR_LINE3", pBorrAddrLine3);
			cmd.addParameter("@P_BORR_LOCAL_ADDR_LINE2", pBorrLocalAddrLine2);
			cmd.addParameter("@P_BORR_LOCAL_ADDR_LINE3", pBorrLocalAddrLine3);
			cmd.addParameter("@P_PLUS_APP_REASON", pPlusAppReason);
			cmd.addParameter("@P_UNKNOWN_LOAN_AMT_IND", pUnknownLoanAmtInd);
			cmd.addParameter("@P_PREVIOUS_APP_ID", pPreviousAppId);
			cmd.addParameter("@P_REQ_AWARD_START_DATE", pReqAwardStartDate);
			cmd.addParameter("@P_REQ_AWARD_END_DATE", pReqAwardEndDate);
			cmd.addParameter("@P_BORR_IN_DEFAULT", pBorrInDefault);
			cmd.addParameter("@P_SCHOOL_CR_BALANCE_OPT", pSchoolCrBalanceOpt);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pUpdateRptuecs(NString pAidyCode,NString pSsn,NString pCounselingType,NString pSource,NString pEntranceType,NNumber pSequenceNo,NDate pCompDate,NString pRrAck,NDate pBirthDate,NString pLastName,NString pFirstName,NString pMi,NString pUserId,NString pDataOrigin,NString pDocumentId,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPKUCOD.P_UPDATE_RPTUECS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_SSN", pSsn);
			cmd.addParameter("@P_COUNSELING_TYPE", pCounselingType);
			cmd.addParameter("@P_SOURCE", pSource);
			cmd.addParameter("@P_ENTRANCE_TYPE", pEntranceType);
			cmd.addParameter("@P_SEQUENCE_NO", pSequenceNo);
			cmd.addParameter("@P_COMP_DATE", pCompDate);
			cmd.addParameter("@P_RR_ACK", pRrAck);
			cmd.addParameter("@P_BIRTH_DATE", pBirthDate);
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_FIRST_NAME", pFirstName);
			cmd.addParameter("@P_MI", pMi);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_DOCUMENT_ID", pDocumentId);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="RptuappRecRow", dataSourceName="RPTUAPP_REC")
	public static class RptuappRecRow
	{
		@DbRecordField(dataSourceName="R_AIDY_CODE")
		public NString RAidyCode;
		@DbRecordField(dataSourceName="R_APP_ID")
		public NNumber RAppId;
		@DbRecordField(dataSourceName="R_SSN")
		public NString RSsn;
		@DbRecordField(dataSourceName="R_BORR_SSN")
		public NString RBorrSsn;
		@DbRecordField(dataSourceName="R_TYPE")
		public NString RType;
		@DbRecordField(dataSourceName="R_CREDIT_STATUS")
		public NString RCreditStatus;
		@DbRecordField(dataSourceName="R_CREDIT_DATE")
		public NDate RCreditDate;
		@DbRecordField(dataSourceName="R_MAX_LOAN_IND")
		public NString RMaxLoanInd;
		@DbRecordField(dataSourceName="R_APP_COMP_DATE")
		public NDate RAppCompDate;
		@DbRecordField(dataSourceName="R_DEFERMENT_OPT")
		public NString RDefermentOpt;
		@DbRecordField(dataSourceName="R_CREDIT_BALANCE_OPT")
		public NString RCreditBalanceOpt;
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_ORIG_CREDIT_STATUS")
		public NString ROrigCreditStatus;
		@DbRecordField(dataSourceName="R_CREDIT_CHECK_EXP_DATE")
		public NDate RCreditCheckExpDate;
		@DbRecordField(dataSourceName="R_APP_LOAN_AMT")
		public NNumber RAppLoanAmt;
		@DbRecordField(dataSourceName="R_ENDORSER_AMT")
		public NNumber REndorserAmt;
		@DbRecordField(dataSourceName="R_CR_ACTION_OPT")
		public NString RCrActionOpt;
		@DbRecordField(dataSourceName="R_CR_APPEAL_STATUS")
		public NString RCrAppealStatus;
		@DbRecordField(dataSourceName="R_CR_OVERRIDE_CDE")
		public NString RCrOverrideCde;
		@DbRecordField(dataSourceName="R_BIRTH_DATE")
		public NDate RBirthDate;
		@DbRecordField(dataSourceName="R_LAST_NAME")
		public NString RLastName;
		@DbRecordField(dataSourceName="R_FIRST_NAME")
		public NString RFirstName;
		@DbRecordField(dataSourceName="R_MI")
		public NString RMi;
		@DbRecordField(dataSourceName="R_ADDRESS")
		public NString RAddress;
		@DbRecordField(dataSourceName="R_CITY")
		public NString RCity;
		@DbRecordField(dataSourceName="R_STAT_CODE")
		public NString RStatCode;
		@DbRecordField(dataSourceName="R_ZIP")
		public NString RZip;
		@DbRecordField(dataSourceName="R_NATN_CODE")
		public NString RNatnCode;
		@DbRecordField(dataSourceName="R_PHONE_NO")
		public NString RPhoneNo;
		@DbRecordField(dataSourceName="R_EMAIL")
		public NString REmail;
		@DbRecordField(dataSourceName="R_LOCAL_ADDRESS")
		public NString RLocalAddress;
		@DbRecordField(dataSourceName="R_LOCAL_CITY")
		public NString RLocalCity;
		@DbRecordField(dataSourceName="R_LOCAL_STAT_CODE")
		public NString RLocalStatCode;
		@DbRecordField(dataSourceName="R_LOCAL_ZIP")
		public NString RLocalZip;
		@DbRecordField(dataSourceName="R_LOCAL_NATN_CODE")
		public NString RLocalNatnCode;
		@DbRecordField(dataSourceName="R_BORR_BIRTH_DATE")
		public NDate RBorrBirthDate;
		@DbRecordField(dataSourceName="R_BORR_LAST_NAME")
		public NString RBorrLastName;
		@DbRecordField(dataSourceName="R_BORR_FIRST_NAME")
		public NString RBorrFirstName;
		@DbRecordField(dataSourceName="R_BORR_MI")
		public NString RBorrMi;
		@DbRecordField(dataSourceName="R_BORR_CITZ_IND")
		public NString RBorrCitzInd;
		@DbRecordField(dataSourceName="R_BORR_ADDRESS")
		public NString RBorrAddress;
		@DbRecordField(dataSourceName="R_BORR_CITY")
		public NString RBorrCity;
		@DbRecordField(dataSourceName="R_BORR_STAT_CODE")
		public NString RBorrStatCode;
		@DbRecordField(dataSourceName="R_BORR_ZIP")
		public NString RBorrZip;
		@DbRecordField(dataSourceName="R_BORR_NATN_CODE")
		public NString RBorrNatnCode;
		@DbRecordField(dataSourceName="R_BORR_PHONE_NO")
		public NString RBorrPhoneNo;
		@DbRecordField(dataSourceName="R_BORR_EMAIL")
		public NString RBorrEmail;
		@DbRecordField(dataSourceName="R_BORR_LOCAL_ADDR")
		public NString RBorrLocalAddr;
		@DbRecordField(dataSourceName="R_BORR_LOCAL_CITY")
		public NString RBorrLocalCity;
		@DbRecordField(dataSourceName="R_BORR_LOCAL_STAT_CODE")
		public NString RBorrLocalStatCode;
		@DbRecordField(dataSourceName="R_BORR_LOCAL_ZIP")
		public NString RBorrLocalZip;
		@DbRecordField(dataSourceName="R_BORR_LOCAL_NATN_CODE")
		public NString RBorrLocalNatnCode;
		@DbRecordField(dataSourceName="R_DOCUMENT_ID")
		public NString RDocumentId;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_ADDR_LINE2")
		public NString RAddrLine2;
		@DbRecordField(dataSourceName="R_ADDR_LINE3")
		public NString RAddrLine3;
		@DbRecordField(dataSourceName="R_LOCAL_ADDR_LINE2")
		public NString RLocalAddrLine2;
		@DbRecordField(dataSourceName="R_LOCAL_ADDR_LINE3")
		public NString RLocalAddrLine3;
		@DbRecordField(dataSourceName="R_BORR_ADDR_LINE2")
		public NString RBorrAddrLine2;
		@DbRecordField(dataSourceName="R_BORR_ADDR_LINE3")
		public NString RBorrAddrLine3;
		@DbRecordField(dataSourceName="R_BORR_LOCAL_ADDR_LINE2")
		public NString RBorrLocalAddrLine2;
		@DbRecordField(dataSourceName="R_BORR_LOCAL_ADDR_LINE3")
		public NString RBorrLocalAddrLine3;
		@DbRecordField(dataSourceName="R_PLUS_APP_REASON")
		public NString RPlusAppReason;
		@DbRecordField(dataSourceName="R_UNKNOWN_LOAN_AMT_IND")
		public NString RUnknownLoanAmtInd;
		@DbRecordField(dataSourceName="R_PREVIOUS_APP_ID")
		public NNumber RPreviousAppId;
		@DbRecordField(dataSourceName="R_REQ_AWARD_START_DATE")
		public NDate RReqAwardStartDate;
		@DbRecordField(dataSourceName="R_REQ_AWARD_END_DATE")
		public NDate RReqAwardEndDate;
		@DbRecordField(dataSourceName="R_BORR_IN_DEFAULT")
		public NString RBorrInDefault;
		@DbRecordField(dataSourceName="R_SCHOOL_CR_BALANCE_OPT")
		public NString RSchoolCrBalanceOpt;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	@DbRecordType(id="RptuecsRecRow", dataSourceName="RPTUECS_REC")
	public static class RptuecsRecRow
	{
		@DbRecordField(dataSourceName="R_AIDY_CODE")
		public NString RAidyCode;
		@DbRecordField(dataSourceName="R_SSN")
		public NString RSsn;
		@DbRecordField(dataSourceName="R_COUNSELING_TYPE")
		public NString RCounselingType;
		@DbRecordField(dataSourceName="R_SOURCE")
		public NString RSource;
		@DbRecordField(dataSourceName="R_ENTRANCE_TYPE")
		public NString REntranceType;
		@DbRecordField(dataSourceName="R_SEQUENCE_NO")
		public NNumber RSequenceNo;
		@DbRecordField(dataSourceName="R_COMP_DATE")
		public NDate RCompDate;
		@DbRecordField(dataSourceName="R_RR_ACK")
		public NString RRrAck;
		@DbRecordField(dataSourceName="R_BIRTH_DATE")
		public NDate RBirthDate;
		@DbRecordField(dataSourceName="R_LAST_NAME")
		public NString RLastName;
		@DbRecordField(dataSourceName="R_FIRST_NAME")
		public NString RFirstName;
		@DbRecordField(dataSourceName="R_MI")
		public NString RMi;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_DOCUMENT_ID")
		public NString RDocumentId;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
