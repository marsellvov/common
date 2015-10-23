package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class TbStatement {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_STATEMENT.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pStmtNumber,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_STATEMENT.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_STMT_NUMBER", pStmtNumber);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static NString fIsequal(StatementRecRow recOne,StatementRecRow recTwo) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_STATEMENT.F_ISEQUAL", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, StatementRecRow.class ));
//			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, StatementRecRow.class ));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
		
		public static NNumber fMaxStmtNumber(NNumber pPidm,NString pFilePopulated) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_STATEMENT.F_MAX_STMT_NUMBER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FILE_POPULATED", pFilePopulated);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static DataCursor fQueryAll(NNumber pPidm,NNumber pBillRun) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_STATEMENT.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BILL_RUN", pBillRun);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_STATEMENT.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pStmtNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_STATEMENT.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_STMT_NUMBER", pStmtNumber);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pStmtNumber,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_STATEMENT.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_STMT_NUMBER", pStmtNumber);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
//		public static void pCreate(NNumber pPidm,NDate pBillDate,NNumber pBillRun,NString pUserId,NString pDataOrigin,NString pType,NString pSort,NString pTermCode,NDate pDueDate,NString pAtypCode,NNumber pAtypSeqno,NString pSortZip,NString pSortId,NString pSortName,NString pSortCampus,NString pEmailAddr,NNumber pBalance,NNumber pPastDue,NNumber pAmountDue,NNumber pMinimumDue,NString pBlotCode,BLOB pBlob, pBfile,NString pDirectory,NString pFilename,NString pLoadfromfile,Ref<NNumber> pStmtNumberOut,Ref<NString> pRowidOut) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_STATEMENT.P_CREATE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_PIDM", pPidm);
//			cmd.addParameter("@P_BILL_DATE", pBillDate);
//			cmd.addParameter("@P_BILL_RUN", pBillRun);
//			cmd.addParameter("@P_USER_ID", pUserId);
//			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
//			cmd.addParameter("@P_TYPE", pType);
//			cmd.addParameter("@P_SORT", pSort);
//			cmd.addParameter("@P_TERM_CODE", pTermCode);
//			cmd.addParameter("@P_DUE_DATE", pDueDate);
//			cmd.addParameter("@P_ATYP_CODE", pAtypCode);
//			cmd.addParameter("@P_ATYP_SEQNO", pAtypSeqno);
//			cmd.addParameter("@P_SORT_ZIP", pSortZip);
//			cmd.addParameter("@P_SORT_ID", pSortId);
//			cmd.addParameter("@P_SORT_NAME", pSortName);
//			cmd.addParameter("@P_SORT_CAMPUS", pSortCampus);
//			cmd.addParameter("@P_EMAIL_ADDR", pEmailAddr);
//			cmd.addParameter("@P_BALANCE", pBalance);
//			cmd.addParameter("@P_PAST_DUE", pPastDue);
//			cmd.addParameter("@P_AMOUNT_DUE", pAmountDue);
//			cmd.addParameter("@P_MINIMUM_DUE", pMinimumDue);
//			cmd.addParameter("@P_BLOT_CODE", pBlotCode);
//			cmd.addParameter("@P_BLOB", pBlob);
//			cmd.addParameter("@P_BFILE", pBfile);
//			cmd.addParameter("@P_DIRECTORY", pDirectory);
//			cmd.addParameter("@P_FILENAME", pFilename);
//			cmd.addParameter("@P_LOADFROMFILE", pLoadfromfile);
//			cmd.addParameter("@P_STMT_NUMBER_OUT", NNumber.class);
//			cmd.addParameter("@P_ROWID_OUT", NString.class);
//				
//			cmd.execute();
//			pStmtNumberOut.val = cmd.getParameterValue("@P_STMT_NUMBER_OUT", NNumber.class);
//			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);
//
//
//		}
		
		public static void pDelete(NNumber pStmtNumber,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_STATEMENT.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_STMT_NUMBER", pStmtNumber);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pStmtNumber,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_STATEMENT.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_STMT_NUMBER", pStmtNumber);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pPurgeBillRun(NNumber pBillRun) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_STATEMENT.P_PURGE_BILL_RUN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_BILL_RUN", pBillRun);
				
			cmd.execute();


		}
		
		public static void pPurgeMedia(NNumber pStmtNumber,NString pUserId,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_STATEMENT.P_PURGE_MEDIA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_STMT_NUMBER", pStmtNumber);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
//		public static void pUpdate(NNumber pStmtNumber,NString pUserId,NString pDataOrigin,NString pEmailAddr,NNumber pBalance,NNumber pPastDue,NNumber pAmountDue,NNumber pMinimumDue,NString pBlotCode,BLOB pBlob, pBfile,NString pDirectory,NString pFilename,NString pLoadfromfile,NString pRowid) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_STATEMENT.P_UPDATE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_STMT_NUMBER", pStmtNumber);
//			cmd.addParameter("@P_USER_ID", pUserId);
//			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
//			cmd.addParameter("@P_EMAIL_ADDR", pEmailAddr);
//			cmd.addParameter("@P_BALANCE", pBalance);
//			cmd.addParameter("@P_PAST_DUE", pPastDue);
//			cmd.addParameter("@P_AMOUNT_DUE", pAmountDue);
//			cmd.addParameter("@P_MINIMUM_DUE", pMinimumDue);
//			cmd.addParameter("@P_BLOT_CODE", pBlotCode);
//			cmd.addParameter("@P_BLOB", pBlob);
//			cmd.addParameter("@P_BFILE", pBfile);
//			cmd.addParameter("@P_DIRECTORY", pDirectory);
//			cmd.addParameter("@P_FILENAME", pFilename);
//			cmd.addParameter("@P_LOADFROMFILE", pLoadfromfile);
//			cmd.addParameter("@P_ROWID", pRowid);
//				
//			cmd.execute();
//
//
//		}
		
	
	
	@DbRecordType(id="StatementRecRow", dataSourceName="STATEMENT_REC")
	public static class StatementRecRow
	{
		@DbRecordField(dataSourceName="R_STMT_NUMBER")
		public NNumber RStmtNumber;
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_BILL_DATE")
		public NDate RBillDate;
		@DbRecordField(dataSourceName="R_BILL_RUN")
		public NNumber RBillRun;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_TYPE")
		public NString RType;
		@DbRecordField(dataSourceName="R_SORT")
		public NString RSort;
		@DbRecordField(dataSourceName="R_TERM_CODE")
		public NString RTermCode;
		@DbRecordField(dataSourceName="R_DUE_DATE")
		public NDate RDueDate;
		@DbRecordField(dataSourceName="R_ATYP_CODE")
		public NString RAtypCode;
		@DbRecordField(dataSourceName="R_ATYP_SEQNO")
		public NNumber RAtypSeqno;
		@DbRecordField(dataSourceName="R_SORT_ZIP")
		public NString RSortZip;
		@DbRecordField(dataSourceName="R_SORT_ID")
		public NString RSortId;
		@DbRecordField(dataSourceName="R_SORT_NAME")
		public NString RSortName;
		@DbRecordField(dataSourceName="R_SORT_CAMPUS")
		public NString RSortCampus;
		@DbRecordField(dataSourceName="R_EMAIL_ADDR")
		public NString REmailAddr;
		@DbRecordField(dataSourceName="R_BALANCE")
		public NNumber RBalance;
		@DbRecordField(dataSourceName="R_PAST_DUE")
		public NNumber RPastDue;
		@DbRecordField(dataSourceName="R_AMOUNT_DUE")
		public NNumber RAmountDue;
		@DbRecordField(dataSourceName="R_MINIMUM_DUE")
		public NNumber RMinimumDue;
		@DbRecordField(dataSourceName="R_MEDIA_ID")
		public NNumber RMediaId;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
