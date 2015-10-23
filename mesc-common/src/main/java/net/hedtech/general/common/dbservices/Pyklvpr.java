package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Pyklvpr {
		public static NString fAdvExists(NString pId,NString pYear,NString pPictCode,NNumber pPayNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PYKLVPR.F_ADV_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
			cmd.addParameter("@P_PAY_NO", pPayNo);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fChkLpLeavBal(NNumber pPidm,NString pLeavCode,NString pLcatCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PYKLVPR.F_CHK_LP_LEAV_BAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_LEAV_CODE", pLeavCode);
			cmd.addParameter("@P_LCAT_CODE", pLcatCode);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fDispCheck(NNumber pPidm,NString pPictCode,NString pYear,NNumber pPayNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PYKLVPR.F_DISP_CHECK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_PAY_NO", pPayNo);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetEarnCode(NString pEclsCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PYKLVPR.F_GET_EARN_CODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ECLS_CODE", pEclsCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetLpEarnCode(NString pEclsCode,NString pLeavCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PYKLVPR.F_GET_LP_EARN_CODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ECLS_CODE", pEclsCode);
			cmd.addParameter("@P_LEAV_CODE", pLeavCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static java.sql.RowId fGetPayPeriod(NNumber pPidm,NString pPosn,NString pSuff,NString pPictCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PYKLVPR.F_GET_PAY_PERIOD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(java.sql.RowId.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
				
			cmd.execute();

			return cmd.getReturnValue(java.sql.RowId.class);

		}
		
		public static NNumber fGetRunSeqNo() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PYKLVPR.F_GET_RUN_SEQ_NO", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fGetSpecialRate(NNumber pTranId,NNumber pSeqNum,NString pEclsCode,NString pEarnCode,NString pPictCode,NNumber pPayNo,NString pYear) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PYKLVPR.F_GET_SPECIAL_RATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_TRAN_ID", pTranId);
			cmd.addParameter("@P_SEQ_NUM", pSeqNum);
			cmd.addParameter("@P_ECLS_CODE", pEclsCode);
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
			cmd.addParameter("@P_PAY_NO", pPayNo);
			cmd.addParameter("@P_YEAR", pYear);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fPayCheck(NNumber pTranId,NNumber pSeqNum,NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PYKLVPR.F_PAY_CHECK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TRAN_ID", pTranId);
			cmd.addParameter("@P_SEQ_NUM", pSeqNum);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fPictVal(NNumber pPidm,NString pPictCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PYKLVPR.F_PICT_VAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fValidate(NString pId,NString pPictCode,NString pYear,NNumber pPayNo,NNumber pTranId,NNumber pSeqNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PYKLVPR.F_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_PAY_NO", pPayNo);
			cmd.addParameter("@P_TRAN_ID", pTranId);
			cmd.addParameter("@P_SEQ_NUM", pSeqNum);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pAdditionalLeavProcessing(NString pPayYear,NString pPayrollId,NNumber pPayrollNo,NDate pStartDate,NDate pEndDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PYKLVPR.P_ADDITIONAL_LEAV_PROCESSING", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PAY_YEAR", pPayYear);
			cmd.addParameter("@P_PAYROLL_ID", pPayrollId);
			cmd.addParameter("@P_PAYROLL_NO", pPayrollNo);
			cmd.addParameter("@P_START_DATE", pStartDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
				
			cmd.execute();


		}
		
		public static void pAdvPayProc() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PYKLVPR.P_ADV_PAY_PROC", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pDelete(NNumber pTranId,NNumber pSeqNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PYKLVPR.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRAN_ID", pTranId);
			cmd.addParameter("@P_SEQ_NUM", pSeqNum);
				
			cmd.execute();


		}
		
		public static void pErrorLog(NNumber pRunSeqNo,NString pPrgmName,NString pErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PYKLVPR.P_ERROR_LOG", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_RUN_SEQ_NO", pRunSeqNo);
			cmd.addParameter("@P_PRGM_NAME", pPrgmName);
			cmd.addParameter("@P_ERROR_MSG", pErrorMsg);
				
			cmd.execute();


		}
		
		public static void pExecLeavProcessing() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PYKLVPR.P_EXEC_LEAV_PROCESSING", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pInsertPhrmtim(NNumber pTranId,NNumber pSeqNum,NString pYear,NString pPayid,NNumber pPayno,NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PYKLVPR.P_INSERT_PHRMTIM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRAN_ID", pTranId);
			cmd.addParameter("@P_SEQ_NUM", pSeqNum);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_PAYID", pPayid);
			cmd.addParameter("@P_PAYNO", pPayno);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();


		}
		
		public static void pInsertStage(NNumber pTranId,NNumber pSeqNum,NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PYKLVPR.P_INSERT_STAGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRAN_ID", pTranId);
			cmd.addParameter("@P_SEQ_NUM", pSeqNum);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();


		}
		
		public static void pLeavProcessing() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PYKLVPR.P_LEAV_PROCESSING", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pUpdLeavBal(NNumber pTranId,NNumber pSeqNum,NString pYear,NString pPictCode,NNumber pPayno,NString pLeavCode,Ref<NString> pResOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PYKLVPR.P_UPD_LEAV_BAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRAN_ID", pTranId);
			cmd.addParameter("@P_SEQ_NUM", pSeqNum);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
			cmd.addParameter("@P_PAYNO", pPayno);
			cmd.addParameter("@P_LEAV_CODE", pLeavCode);
			cmd.addParameter("@P_RES_OUT", NString.class);
				
			cmd.execute();
			pResOut.val = cmd.getParameterValue("@P_RES_OUT", NString.class);


		}
		
		public static void pUpdPayroll(NString pYear,NString pPictCode,NNumber pPayno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PYKLVPR.P_UPD_PAYROLL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
			cmd.addParameter("@P_PAYNO", pPayno);
				
			cmd.execute();


		}
		
	
	
	
}
