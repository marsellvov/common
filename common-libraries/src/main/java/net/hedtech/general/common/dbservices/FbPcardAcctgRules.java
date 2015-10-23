package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class FbPcardAcctgRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PCARD_ACCTG_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pFarinvtSystemId,NString pFarinvtSystemTimeStamp,NNumber pFarinvtTranNum,NNumber pFarinvtSeqNum,NString pFarinvtUserId,NString pFarinvtCoasCode,NString pFarinvtAcciCode,NString pFarinvtFundCode,NString pFarinvtOrgnCode,NString pFarinvtAcctCode,NString pFarinvtProgCode,NString pFarinvtActvCode,NString pFarinvtLocnCode,NString pFarinvtProjCode,NString pFarinvtBankCode,NNumber pFarinvtAmtPct,NNumber pFarinvtTransAmt,NNumber pFarinvtFabinvtId,NNumber pFarinvtSurrogateId,NString pFarinvtDataOrigin,NNumber pFarinvtVersion,NString pFarinvtVpdiCode,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PCARD_ACCTG_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_FARINVT_SYSTEM_ID", pFarinvtSystemId);
			cmd.addParameter("@P_FARINVT_SYSTEM_TIME_STAMP", pFarinvtSystemTimeStamp);
			cmd.addParameter("@P_FARINVT_TRAN_NUM", pFarinvtTranNum);
			cmd.addParameter("@P_FARINVT_SEQ_NUM", pFarinvtSeqNum);
			cmd.addParameter("@P_FARINVT_USER_ID", pFarinvtUserId);
			cmd.addParameter("@P_FARINVT_COAS_CODE", pFarinvtCoasCode);
			cmd.addParameter("@P_FARINVT_ACCI_CODE", pFarinvtAcciCode);
			cmd.addParameter("@P_FARINVT_FUND_CODE", pFarinvtFundCode);
			cmd.addParameter("@P_FARINVT_ORGN_CODE", pFarinvtOrgnCode);
			cmd.addParameter("@P_FARINVT_ACCT_CODE", pFarinvtAcctCode);
			cmd.addParameter("@P_FARINVT_PROG_CODE", pFarinvtProgCode);
			cmd.addParameter("@P_FARINVT_ACTV_CODE", pFarinvtActvCode);
			cmd.addParameter("@P_FARINVT_LOCN_CODE", pFarinvtLocnCode);
			cmd.addParameter("@P_FARINVT_PROJ_CODE", pFarinvtProjCode);
			cmd.addParameter("@P_FARINVT_BANK_CODE", pFarinvtBankCode);
			cmd.addParameter("@P_FARINVT_AMT_PCT", pFarinvtAmtPct);
			cmd.addParameter("@P_FARINVT_TRANS_AMT", pFarinvtTransAmt);
			cmd.addParameter("@P_FARINVT_FABINVT_ID", pFarinvtFabinvtId);
			cmd.addParameter("@P_FARINVT_SURROGATE_ID", pFarinvtSurrogateId);
			cmd.addParameter("@P_FARINVT_DATA_ORIGIN", pFarinvtDataOrigin);
			cmd.addParameter("@P_FARINVT_VERSION", pFarinvtVersion);
			cmd.addParameter("@P_FARINVT_VPDI_CODE", pFarinvtVpdiCode);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pFarinvtSystemId,NString pFarinvtSystemTimeStamp,NNumber pFarinvtTranNum,NNumber pFarinvtSeqNum,NString pFarinvtUserId,NString pFarinvtCoasCode,NString pFarinvtAcciCode,NString pFarinvtFundCode,NString pFarinvtOrgnCode,NString pFarinvtAcctCode,NString pFarinvtProgCode,NString pFarinvtActvCode,NString pFarinvtLocnCode,NString pFarinvtProjCode,NString pFarinvtBankCode,NNumber pFarinvtAmtPct,NNumber pFarinvtTransAmt,NNumber pFarinvtFabinvtId,NNumber pFarinvtSurrogateId,NString pFarinvtDataOrigin,NNumber pFarinvtVersion,NString pFarinvtVpdiCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PCARD_ACCTG_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FARINVT_SYSTEM_ID", pFarinvtSystemId);
			cmd.addParameter("@P_FARINVT_SYSTEM_TIME_STAMP", pFarinvtSystemTimeStamp);
			cmd.addParameter("@P_FARINVT_TRAN_NUM", pFarinvtTranNum);
			cmd.addParameter("@P_FARINVT_SEQ_NUM", pFarinvtSeqNum);
			cmd.addParameter("@P_FARINVT_USER_ID", pFarinvtUserId);
			cmd.addParameter("@P_FARINVT_COAS_CODE", pFarinvtCoasCode);
			cmd.addParameter("@P_FARINVT_ACCI_CODE", pFarinvtAcciCode);
			cmd.addParameter("@P_FARINVT_FUND_CODE", pFarinvtFundCode);
			cmd.addParameter("@P_FARINVT_ORGN_CODE", pFarinvtOrgnCode);
			cmd.addParameter("@P_FARINVT_ACCT_CODE", pFarinvtAcctCode);
			cmd.addParameter("@P_FARINVT_PROG_CODE", pFarinvtProgCode);
			cmd.addParameter("@P_FARINVT_ACTV_CODE", pFarinvtActvCode);
			cmd.addParameter("@P_FARINVT_LOCN_CODE", pFarinvtLocnCode);
			cmd.addParameter("@P_FARINVT_PROJ_CODE", pFarinvtProjCode);
			cmd.addParameter("@P_FARINVT_BANK_CODE", pFarinvtBankCode);
			cmd.addParameter("@P_FARINVT_AMT_PCT", pFarinvtAmtPct);
			cmd.addParameter("@P_FARINVT_TRANS_AMT", pFarinvtTransAmt);
			cmd.addParameter("@P_FARINVT_FABINVT_ID", pFarinvtFabinvtId);
			cmd.addParameter("@P_FARINVT_SURROGATE_ID", pFarinvtSurrogateId);
			cmd.addParameter("@P_FARINVT_DATA_ORIGIN", pFarinvtDataOrigin);
			cmd.addParameter("@P_FARINVT_VERSION", pFarinvtVersion);
			cmd.addParameter("@P_FARINVT_VPDI_CODE", pFarinvtVpdiCode);
				
			cmd.execute();


		}
		
	
	
	
}
