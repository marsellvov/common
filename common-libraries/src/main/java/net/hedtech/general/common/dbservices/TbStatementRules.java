package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class TbStatementRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_STATEMENT_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pStmtNumber,NNumber pPidm,NDate pBillDate,NNumber pBillRun,NString pUserId,NString pDataOrigin,NString pType,NString pSort,NString pTermCode,NDate pDueDate,NString pAtypCode,NNumber pAtypSeqno,NString pSortZip,NString pSortId,NString pSortName,NString pSortCampus,NString pEmailAddr,NNumber pBalance,NNumber pPastDue,NNumber pAmountDue,NNumber pMinimumDue,NNumber pMediaId,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_STATEMENT_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_STMT_NUMBER", pStmtNumber);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BILL_DATE", pBillDate);
			cmd.addParameter("@P_BILL_RUN", pBillRun);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_TYPE", pType);
			cmd.addParameter("@P_SORT", pSort);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_DUE_DATE", pDueDate);
			cmd.addParameter("@P_ATYP_CODE", pAtypCode);
			cmd.addParameter("@P_ATYP_SEQNO", pAtypSeqno);
			cmd.addParameter("@P_SORT_ZIP", pSortZip);
			cmd.addParameter("@P_SORT_ID", pSortId);
			cmd.addParameter("@P_SORT_NAME", pSortName);
			cmd.addParameter("@P_SORT_CAMPUS", pSortCampus);
			cmd.addParameter("@P_EMAIL_ADDR", pEmailAddr);
			cmd.addParameter("@P_BALANCE", pBalance);
			cmd.addParameter("@P_PAST_DUE", pPastDue);
			cmd.addParameter("@P_AMOUNT_DUE", pAmountDue);
			cmd.addParameter("@P_MINIMUM_DUE", pMinimumDue);
			cmd.addParameter("@P_MEDIA_ID", pMediaId);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pStmtNumber,NNumber pPidm,NDate pBillDate,NNumber pBillRun,NString pUserId,NString pDataOrigin,NString pType,NString pSort,NString pTermCode,NDate pDueDate,NString pAtypCode,NNumber pAtypSeqno,NString pSortZip,NString pSortId,NString pSortName,NString pSortCampus,NString pEmailAddr,NNumber pBalance,NNumber pPastDue,NNumber pAmountDue,NNumber pMinimumDue,NNumber pMediaId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_STATEMENT_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_STMT_NUMBER", pStmtNumber);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BILL_DATE", pBillDate);
			cmd.addParameter("@P_BILL_RUN", pBillRun);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_TYPE", pType);
			cmd.addParameter("@P_SORT", pSort);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_DUE_DATE", pDueDate);
			cmd.addParameter("@P_ATYP_CODE", pAtypCode);
			cmd.addParameter("@P_ATYP_SEQNO", pAtypSeqno);
			cmd.addParameter("@P_SORT_ZIP", pSortZip);
			cmd.addParameter("@P_SORT_ID", pSortId);
			cmd.addParameter("@P_SORT_NAME", pSortName);
			cmd.addParameter("@P_SORT_CAMPUS", pSortCampus);
			cmd.addParameter("@P_EMAIL_ADDR", pEmailAddr);
			cmd.addParameter("@P_BALANCE", pBalance);
			cmd.addParameter("@P_PAST_DUE", pPastDue);
			cmd.addParameter("@P_AMOUNT_DUE", pAmountDue);
			cmd.addParameter("@P_MINIMUM_DUE", pMinimumDue);
			cmd.addParameter("@P_MEDIA_ID", pMediaId);
				
			cmd.execute();


		}
		
	
	
	
}
