package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class TbApplDetailRules {
		public static void pValidate(NNumber pPidm,NNumber pPayTranNumber,NNumber pChgTranNumber,NNumber pAmount,NString pDirectPayInd,NString pReapplInd,NString pUser,NString pAcctFeedInd,NDate pFeedDate,NString pFeedDocCode,NNumber pCpdtTranNumber,NString pDirectPayType,NString pInvNumberPaid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_APPL_DETAIL_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PAY_TRAN_NUMBER", pPayTranNumber);
			cmd.addParameter("@P_CHG_TRAN_NUMBER", pChgTranNumber);
			cmd.addParameter("@P_AMOUNT", pAmount);
			cmd.addParameter("@P_DIRECT_PAY_IND", pDirectPayInd);
			cmd.addParameter("@P_REAPPL_IND", pReapplInd);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_ACCT_FEED_IND", pAcctFeedInd);
			cmd.addParameter("@P_FEED_DATE", pFeedDate);
			cmd.addParameter("@P_FEED_DOC_CODE", pFeedDocCode);
			cmd.addParameter("@P_CPDT_TRAN_NUMBER", pCpdtTranNumber);
			cmd.addParameter("@P_DIRECT_PAY_TYPE", pDirectPayType);
			cmd.addParameter("@P_INV_NUMBER_PAID", pInvNumberPaid);
				
			cmd.execute();


		}
		
	
	
	
}
