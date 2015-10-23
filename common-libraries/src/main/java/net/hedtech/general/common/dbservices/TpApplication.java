package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class TpApplication {
		public static void pApplyContDetail(NNumber pContPidm,NNumber pContTranNumber,NNumber pTranNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TP_APPLICATION.P_APPLY_CONT_DETAIL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CONT_PIDM", pContPidm);
			cmd.addParameter("@P_CONT_TRAN_NUMBER", pContTranNumber);
			cmd.addParameter("@P_TRAN_NUMBER", pTranNumber);
				
			cmd.execute();


		}
		
		public static void pProcessUnapplication(NNumber pPidm,NNumber pPayTranNumber,NNumber pChgTranNumber,NNumber pAmount,NString pApplRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TP_APPLICATION.P_PROCESS_UNAPPLICATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PAY_TRAN_NUMBER", pPayTranNumber);
			cmd.addParameter("@P_CHG_TRAN_NUMBER", pChgTranNumber);
			cmd.addParameter("@P_AMOUNT", pAmount);
			cmd.addParameter("@P_APPL_ROWID", pApplRowid);
				
			cmd.execute();


		}
		
		public static void pUnapplyByDate(NNumber pPidm,NDate pApplyDate,NString pUnapplyDirectPay) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TP_APPLICATION.P_UNAPPLY_BY_DATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_APPLY_DATE", pApplyDate);
			cmd.addParameter("@P_UNAPPLY_DIRECT_PAY", pUnapplyDirectPay);
				
			cmd.execute();


		}
		
		public static void pUnapplyByTerm(NNumber pPidm,NString pTermCode,NString pUnapplyDirectPay) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TP_APPLICATION.P_UNAPPLY_BY_TERM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_UNAPPLY_DIRECT_PAY", pUnapplyDirectPay);
				
			cmd.execute();


		}
		
		public static void pUnapplyByTranNumber(NNumber pPidm,NNumber pPayTranNumber,NNumber pCpdtTranNumber,NString pUnapplyDirectPay) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TP_APPLICATION.P_UNAPPLY_BY_TRAN_NUMBER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PAY_TRAN_NUMBER", pPayTranNumber);
			cmd.addParameter("@P_CPDT_TRAN_NUMBER", pCpdtTranNumber);
			cmd.addParameter("@P_UNAPPLY_DIRECT_PAY", pUnapplyDirectPay);
				
			cmd.execute();


		}
		
	
	
	
}
