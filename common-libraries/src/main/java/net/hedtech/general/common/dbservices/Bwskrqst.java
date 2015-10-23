package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwskrqst {
		public static void pDeleteValues(NNumber pidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKRQST.P_DELETE_VALUES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
				
			cmd.execute();


		}
		
		public static void pDispAddress(NString pTerm,NString pType,NNumber pCopies,NString pAcyr,NString pDelivery,NNumber pCharge,NString pFaxCtryCode,NString pFaxArea,NString pFaxNumber,NString pAtyp,NString pHouNum,NString pStreet1,NString pStreet2,NString pStreet3,NString pStreet4,NString pCity,NString pState,NString pZip,NString pNatn,NString pIssueTo,NString pMsgCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKRQST.P_DISP_ADDRESS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_TYPE", pType);
			cmd.addParameter("@P_COPIES", pCopies);
			cmd.addParameter("@P_ACYR", pAcyr);
			cmd.addParameter("@P_DELIVERY", pDelivery);
			cmd.addParameter("@P_CHARGE", pCharge);
			cmd.addParameter("@P_FAX_CTRY_CODE", pFaxCtryCode);
			cmd.addParameter("@P_FAX_AREA", pFaxArea);
			cmd.addParameter("@P_FAX_NUMBER", pFaxNumber);
			cmd.addParameter("@P_ATYP", pAtyp);
			cmd.addParameter("@P_HOU_NUM", pHouNum);
			cmd.addParameter("@P_STREET1", pStreet1);
			cmd.addParameter("@P_STREET2", pStreet2);
			cmd.addParameter("@P_STREET3", pStreet3);
			cmd.addParameter("@P_STREET4", pStreet4);
			cmd.addParameter("@P_CITY", pCity);
			cmd.addParameter("@P_STATE", pState);
			cmd.addParameter("@P_ZIP", pZip);
			cmd.addParameter("@P_NATN", pNatn);
			cmd.addParameter("@P_ISSUE_TO", pIssueTo);
			cmd.addParameter("@P_MSG_CODE", pMsgCode);
				
			cmd.execute();


		}
		
		public static void pDispConfirm(NString pTerm,NString pType,NNumber pCopies,NString pIssueTo,NString pAcyr,NString pDelivery,NNumber pCharge,NString pFaxCtryCode,NString pFaxArea,NString pFaxNumber,NString pHouNum,NString pStreet1,NString pStreet2,NString pStreet3,NString pStreet4,NString pCity,NString pState,NString pZip,NString pNatn,NString pPayment,NString pMsgCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKRQST.P_DISP_CONFIRM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_TYPE", pType);
			cmd.addParameter("@P_COPIES", pCopies);
			cmd.addParameter("@P_ISSUE_TO", pIssueTo);
			cmd.addParameter("@P_ACYR", pAcyr);
			cmd.addParameter("@P_DELIVERY", pDelivery);
			cmd.addParameter("@P_CHARGE", pCharge);
			cmd.addParameter("@P_FAX_CTRY_CODE", pFaxCtryCode);
			cmd.addParameter("@P_FAX_AREA", pFaxArea);
			cmd.addParameter("@P_FAX_NUMBER", pFaxNumber);
			cmd.addParameter("@P_HOU_NUM", pHouNum);
			cmd.addParameter("@P_STREET1", pStreet1);
			cmd.addParameter("@P_STREET2", pStreet2);
			cmd.addParameter("@P_STREET3", pStreet3);
			cmd.addParameter("@P_STREET4", pStreet4);
			cmd.addParameter("@P_CITY", pCity);
			cmd.addParameter("@P_STATE", pState);
			cmd.addParameter("@P_ZIP", pZip);
			cmd.addParameter("@P_NATN", pNatn);
			cmd.addParameter("@P_PAYMENT", pPayment);
			cmd.addParameter("@P_MSG_CODE", pMsgCode);
				
			cmd.execute();


		}
		
		public static void pDispDelivery(NString pTerm,NString pType,NNumber pCopies,NString pAcyr,NString pDelivery,NString pPriorAcyr,NString pMsgCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKRQST.P_DISP_DELIVERY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_TYPE", pType);
			cmd.addParameter("@P_COPIES", pCopies);
			cmd.addParameter("@P_ACYR", pAcyr);
			cmd.addParameter("@P_DELIVERY", pDelivery);
			cmd.addParameter("@P_PRIOR_ACYR", pPriorAcyr);
			cmd.addParameter("@P_MSG_CODE", pMsgCode);
				
			cmd.execute();


		}
		
		public static void pDispPayment(NString pTerm,NString pType,NNumber pCopies,NString pIssueTo,NString pAcyr,NString pDelivery,NNumber pCharge,NString pFaxCtryCode,NString pFaxArea,NString pFaxNumber,NString pHouNum,NString pStreet1,NString pStreet2,NString pStreet3,NString pStreet4,NString pCity,NString pState,NString pZip,NString pNatn,NString pPayment,NString pMsgCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKRQST.P_DISP_PAYMENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_TYPE", pType);
			cmd.addParameter("@P_COPIES", pCopies);
			cmd.addParameter("@P_ISSUE_TO", pIssueTo);
			cmd.addParameter("@P_ACYR", pAcyr);
			cmd.addParameter("@P_DELIVERY", pDelivery);
			cmd.addParameter("@P_CHARGE", pCharge);
			cmd.addParameter("@P_FAX_CTRY_CODE", pFaxCtryCode);
			cmd.addParameter("@P_FAX_AREA", pFaxArea);
			cmd.addParameter("@P_FAX_NUMBER", pFaxNumber);
			cmd.addParameter("@P_HOU_NUM", pHouNum);
			cmd.addParameter("@P_STREET1", pStreet1);
			cmd.addParameter("@P_STREET2", pStreet2);
			cmd.addParameter("@P_STREET3", pStreet3);
			cmd.addParameter("@P_STREET4", pStreet4);
			cmd.addParameter("@P_CITY", pCity);
			cmd.addParameter("@P_STATE", pState);
			cmd.addParameter("@P_ZIP", pZip);
			cmd.addParameter("@P_NATN", pNatn);
			cmd.addParameter("@P_PAYMENT", pPayment);
			cmd.addParameter("@P_MSG_CODE", pMsgCode);
				
			cmd.execute();


		}
		
		public static void pDispRequestDates(NString pMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKRQST.P_DISP_REQUEST_DATES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_MSG", pMsg);
				
			cmd.execute();


		}
		
		public static void pDispRequestStatus(NString pReqDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKRQST.P_DISP_REQUEST_STATUS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_REQ_DATE", pReqDate);
				
			cmd.execute();


		}
		
		public static void pDispTermType(NString pTerm,NString pType,NString pCopies,NString pMsgCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKRQST.P_DISP_TERM_TYPE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_TYPE", pType);
			cmd.addParameter("@P_COPIES", pCopies);
			cmd.addParameter("@P_MSG_CODE", pMsgCode);
				
			cmd.execute();


		}
		
		public static void pDispsigpage(NNumber pSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKRQST.P_DISPSIGPAGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
				
			cmd.execute();


		}
		
		public static void pDispsigpageCc(NString transactionId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKRQST.P_DISPSIGPAGE_CC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TRANSACTION_ID", transactionId);
				
			cmd.execute();


		}
		
		public static void pInsertSfrenrl(Ref<NNumber> pSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKRQST.P_INSERT_SFRENRL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SEQ_NO", pSeqNo, true);
				
			cmd.execute();
			pSeqNo.val = cmd.getParameterValue("@P_SEQ_NO", NNumber.class);


		}
		
		public static void pProcAddress(NString pTerm,NString pType,NNumber pCopies,NString pIssueTo,NString pAcyr,NString pDelivery,NNumber pCharge,NString pFaxCtryCode,NString pFaxArea,NString pFaxNumber,NString pAtyp,NString pHouNum,NString pStreet1,NString pStreet2,NString pStreet3,NString pStreet4,NString pCity,NString pState,NString pZip,NString pNatn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKRQST.P_PROC_ADDRESS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_TYPE", pType);
			cmd.addParameter("@P_COPIES", pCopies);
			cmd.addParameter("@P_ISSUE_TO", pIssueTo);
			cmd.addParameter("@P_ACYR", pAcyr);
			cmd.addParameter("@P_DELIVERY", pDelivery);
			cmd.addParameter("@P_CHARGE", pCharge);
			cmd.addParameter("@P_FAX_CTRY_CODE", pFaxCtryCode);
			cmd.addParameter("@P_FAX_AREA", pFaxArea);
			cmd.addParameter("@P_FAX_NUMBER", pFaxNumber);
			cmd.addParameter("@P_ATYP", pAtyp);
			cmd.addParameter("@P_HOU_NUM", pHouNum);
			cmd.addParameter("@P_STREET1", pStreet1);
			cmd.addParameter("@P_STREET2", pStreet2);
			cmd.addParameter("@P_STREET3", pStreet3);
			cmd.addParameter("@P_STREET4", pStreet4);
			cmd.addParameter("@P_CITY", pCity);
			cmd.addParameter("@P_STATE", pState);
			cmd.addParameter("@P_ZIP", pZip);
			cmd.addParameter("@P_NATN", pNatn);
				
			cmd.execute();


		}
		
		public static void pProcConfirm(NString pTerm,NString pType,NNumber pCopies,NString pIssueTo,NString pAcyr,NString pDelivery,NNumber pCharge,NString pFaxCtryCode,NString pFaxArea,NString pFaxNumber,NString pHouNum,NString pStreet1,NString pStreet2,NString pStreet3,NString pStreet4,NString pCity,NString pState,NString pZip,NString pNatn,NString pPayment) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKRQST.P_PROC_CONFIRM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_TYPE", pType);
			cmd.addParameter("@P_COPIES", pCopies);
			cmd.addParameter("@P_ISSUE_TO", pIssueTo);
			cmd.addParameter("@P_ACYR", pAcyr);
			cmd.addParameter("@P_DELIVERY", pDelivery);
			cmd.addParameter("@P_CHARGE", pCharge);
			cmd.addParameter("@P_FAX_CTRY_CODE", pFaxCtryCode);
			cmd.addParameter("@P_FAX_AREA", pFaxArea);
			cmd.addParameter("@P_FAX_NUMBER", pFaxNumber);
			cmd.addParameter("@P_HOU_NUM", pHouNum);
			cmd.addParameter("@P_STREET1", pStreet1);
			cmd.addParameter("@P_STREET2", pStreet2);
			cmd.addParameter("@P_STREET3", pStreet3);
			cmd.addParameter("@P_STREET4", pStreet4);
			cmd.addParameter("@P_CITY", pCity);
			cmd.addParameter("@P_STATE", pState);
			cmd.addParameter("@P_ZIP", pZip);
			cmd.addParameter("@P_NATN", pNatn);
			cmd.addParameter("@P_PAYMENT", pPayment);
				
			cmd.execute();


		}
		
		public static void pProcDelivery(NString pTerm,NString pType,NNumber pCopies,NString pAcyr,NString pDelivery,NString pPriorAcyr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKRQST.P_PROC_DELIVERY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_TYPE", pType);
			cmd.addParameter("@P_COPIES", pCopies);
			cmd.addParameter("@P_ACYR", pAcyr);
			cmd.addParameter("@P_DELIVERY", pDelivery);
			cmd.addParameter("@P_PRIOR_ACYR", pPriorAcyr);
				
			cmd.execute();


		}
		
		public static void pProcPayment(NString pTerm,NString pType,NNumber pCopies,NString pIssueTo,NString pAcyr,NString pDelivery,NNumber pCharge,NString pFaxCtryCode,NString pFaxArea,NString pFaxNumber,NString pHouNum,NString pStreet1,NString pStreet2,NString pStreet3,NString pStreet4,NString pCity,NString pState,NString pZip,NString pNatn,NString pPayment) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKRQST.P_PROC_PAYMENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_TYPE", pType);
			cmd.addParameter("@P_COPIES", pCopies);
			cmd.addParameter("@P_ISSUE_TO", pIssueTo);
			cmd.addParameter("@P_ACYR", pAcyr);
			cmd.addParameter("@P_DELIVERY", pDelivery);
			cmd.addParameter("@P_CHARGE", pCharge);
			cmd.addParameter("@P_FAX_CTRY_CODE", pFaxCtryCode);
			cmd.addParameter("@P_FAX_AREA", pFaxArea);
			cmd.addParameter("@P_FAX_NUMBER", pFaxNumber);
			cmd.addParameter("@P_HOU_NUM", pHouNum);
			cmd.addParameter("@P_STREET1", pStreet1);
			cmd.addParameter("@P_STREET2", pStreet2);
			cmd.addParameter("@P_STREET3", pStreet3);
			cmd.addParameter("@P_STREET4", pStreet4);
			cmd.addParameter("@P_CITY", pCity);
			cmd.addParameter("@P_STATE", pState);
			cmd.addParameter("@P_ZIP", pZip);
			cmd.addParameter("@P_NATN", pNatn);
			cmd.addParameter("@P_PAYMENT", pPayment);
				
			cmd.execute();


		}
		
		public static void pProcTermType(NString pTerm,NString pType,NString pCopies) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKRQST.P_PROC_TERM_TYPE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_TYPE", pType);
			cmd.addParameter("@P_COPIES", pCopies);
				
			cmd.execute();


		}
		
	
	
	
}
