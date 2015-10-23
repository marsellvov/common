package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class TpStudentDeposit {
//		public static NString fAddStudentDeposit(NString pXt) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TP_STUDENT_DEPOSIT.F_ADD_STUDENT_DEPOSIT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@P_XT", pXt);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString fAddStudentDeposit(NString pRequestOot) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TP_STUDENT_DEPOSIT.F_ADD_STUDENT_DEPOSIT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@P_REQUEST_OOT", pRequestOot);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
		
		public static NString fReceiptRequired(NNumber pPidm,NNumber pTranNumber,NString pTermCode,NString pDetailCodeDeposit,NString pDepositType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TP_STUDENT_DEPOSIT.F_RECEIPT_REQUIRED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TRAN_NUMBER", pTranNumber);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_DETAIL_CODE_DEPOSIT", pDetailCodeDeposit);
			cmd.addParameter("@P_DEPOSIT_TYPE", pDepositType);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static NString fReleaseStdnDeposit(NString pXt) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TP_STUDENT_DEPOSIT.F_RELEASE_STDN_DEPOSIT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@P_XT", pXt);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static  fReleaseStdnDeposit(NString pRequestOot) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TP_STUDENT_DEPOSIT.F_RELEASE_STDN_DEPOSIT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@P_REQUEST_OOT", pRequestOot);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
		public static void pForceRelease(NNumber pPidm,NString pTermCode,NString pDetailCodeDeposit,NString pDepositType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TP_STUDENT_DEPOSIT.P_FORCE_RELEASE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_DETAIL_CODE_DEPOSIT", pDetailCodeDeposit);
			cmd.addParameter("@P_DEPOSIT_TYPE", pDepositType);
				
			cmd.execute();


		}
		
	
	
	
}
