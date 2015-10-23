package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Pykatpy {
		public static NString fCheckBaseDate(NString pYear,NString pPictCode,NNumber pPayno,NDate pBaseDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PYKATPY.F_CHECK_BASE_DATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
			cmd.addParameter("@P_PAYNO", pPayno);
			cmd.addParameter("@P_BASE_DATE", pBaseDate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCheckEarn(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PYKATPY.F_CHECK_EARN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCheckUpdate(NString pId,NNumber pPidm,NString pPictCode,NString pYear,NNumber pPayNo,NNumber pTranId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PYKATPY.F_CHECK_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_PAY_NO", pPayNo);
			cmd.addParameter("@P_TRAN_ID", pTranId);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fDispCheck(NNumber pPidm,NString pPictCode,NString pYear,NNumber pPayNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PYKATPY.F_DISP_CHECK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_PAY_NO", pPayNo);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fEarnExists(NString pId,NString pYear,NString pPictCode,NNumber pPayNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PYKATPY.F_EARN_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
			cmd.addParameter("@P_PAY_NO", pPayNo);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fGetAmount(NNumber pPidm,NString pFlag) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PYKATPY.F_GET_AMOUNT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FLAG", pFlag);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NDate fGetCalnDate(NString pChar) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PYKATPY.F_GET_CALN_DATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@P_CHAR", pChar);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
		public static NString fGetEarncode() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PYKATPY.F_GET_EARNCODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fGetManualAtPymt(NNumber pPidm,NDate pPrdFrom,NDate pPrdTo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PYKATPY.F_GET_MANUAL_AT_PYMT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PRD_FROM", pPrdFrom);
			cmd.addParameter("@P_PRD_TO", pPrdTo);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fGetParameter(NString pNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PYKATPY.F_GET_PARAMETER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_NUM", pNum);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetParameterMass(NString pNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PYKATPY.F_GET_PARAMETER_MASS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_NUM", pNum);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fGetSpecialRate(NNumber pTranId,NNumber pPidm,NString pReqType,NDate pPeriodFrom,NDate pPeriodTo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PYKATPY.F_GET_SPECIAL_RATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_TRAN_ID", pTranId);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_REQ_TYPE", pReqType);
			cmd.addParameter("@P_PERIOD_FROM", pPeriodFrom);
			cmd.addParameter("@P_PERIOD_TO", pPeriodTo);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fGetValue(NNumber pPidm,NString pReqType,NString pAirfareCode,NString pAirportCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PYKATPY.F_GET_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_REQ_TYPE", pReqType);
			cmd.addParameter("@P_AIRFARE_CODE", pAirfareCode);
			cmd.addParameter("@P_AIRPORT_CODE", pAirportCode);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fPictVal(NNumber pPidm,NString pPictCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PYKATPY.F_PICT_VAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fUpdate(NString pPictCode,NString pYear,NNumber pPayNo,NNumber pTranId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PYKATPY.F_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_PAY_NO", pPayNo);
			cmd.addParameter("@P_TRAN_ID", pTranId);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FpDeleteMass() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PYKATPY.P_DELETE_MASS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pDeletePayment() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PYKATPY.P_DELETE_PAYMENT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pDeletePyrpytr() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PYKATPY.P_DELETE_PYRPYTR", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pInsertPyrpytr(NNumber pTranId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PYKATPY.P_INSERT_PYRPYTR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRAN_ID", pTranId);
				
			cmd.execute();


		}
		
		public static void pMeataDeletePrgnParms(NString pProcess) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PYKATPY.P_MEATA_DELETE_PRGN_PARMS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PROCESS", pProcess);
				
			cmd.execute();


		}
		
		public static void pMeataInsertPrgnParms(NString pProcess,NString pNumber,NString pParmVal) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PYKATPY.P_MEATA_INSERT_PRGN_PARMS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PROCESS", pProcess);
			cmd.addParameter("@P_NUMBER", pNumber);
			cmd.addParameter("@P_PARM_VAL", pParmVal);
				
			cmd.execute();


		}
		
		public static void pUpdatePyratht(NNumber pTranId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PYKATPY.P_UPDATE_PYRATHT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRAN_ID", pTranId);
				
			cmd.execute();


		}
		
		public static void pUpdatePyrpyru(NNumber pTranId,NString pPictCode,NString pYear,NNumber pPayNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PYKATPY.P_UPDATE_PYRPYRU", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRAN_ID", pTranId);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_PAY_NO", pPayNo);
				
			cmd.execute();


		}
		
	
	
	
}
