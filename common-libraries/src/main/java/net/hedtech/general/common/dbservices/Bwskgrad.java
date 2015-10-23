package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwskgrad {
		public static void pDeleteValues(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKGRAD.P_DELETE_VALUES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();


		}
		
		public static void pDispCeremony(NString pCurrSelect,NNumber pGadaSeqno,NString pCeremonyInd,NString pMsgCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKGRAD.P_DISP_CEREMONY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CURR_SELECT", pCurrSelect);
			cmd.addParameter("@P_GADA_SEQNO", pGadaSeqno);
			cmd.addParameter("@P_CEREMONY_IND", pCeremonyInd);
			cmd.addParameter("@P_MSG_CODE", pMsgCode);
				
			cmd.execute();


		}
		
		public static void pDispConfirm(NString pCurrSelect,NNumber pGadaSeqno,NString pCeremonyInd,NString pWhichNtyp,NString pLastName,NString pFirstName,NString pMi,NString pSuffix,NString pWhichAtyp,NString pStreet1,NString pStreet2,NString pStreet3,NString pStreet4,NString pHouseNumber,NString pCity,NString pStatCode,NString pZip,NString pNatnCode,NString pWpyoCode,NNumber pChrg,NString pMsgCode,NString pLastnamePrefix) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKGRAD.P_DISP_CONFIRM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CURR_SELECT", pCurrSelect);
			cmd.addParameter("@P_GADA_SEQNO", pGadaSeqno);
			cmd.addParameter("@P_CEREMONY_IND", pCeremonyInd);
			cmd.addParameter("@P_WHICH_NTYP", pWhichNtyp);
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_FIRST_NAME", pFirstName);
			cmd.addParameter("@P_MI", pMi);
			cmd.addParameter("@P_SUFFIX", pSuffix);
			cmd.addParameter("@P_WHICH_ATYP", pWhichAtyp);
			cmd.addParameter("@P_STREET1", pStreet1);
			cmd.addParameter("@P_STREET2", pStreet2);
			cmd.addParameter("@P_STREET3", pStreet3);
			cmd.addParameter("@P_STREET4", pStreet4);
			cmd.addParameter("@P_HOUSE_NUMBER", pHouseNumber);
			cmd.addParameter("@P_CITY", pCity);
			cmd.addParameter("@P_STAT_CODE", pStatCode);
			cmd.addParameter("@P_ZIP", pZip);
			cmd.addParameter("@P_NATN_CODE", pNatnCode);
			cmd.addParameter("@P_WPYO_CODE", pWpyoCode);
			cmd.addParameter("@P_CHRG", pChrg);
			cmd.addParameter("@P_MSG_CODE", pMsgCode);
			cmd.addParameter("@P_LASTNAME_PREFIX", pLastnamePrefix);
				
			cmd.execute();


		}
		
		public static void pDispDiplomaAddr(NString pCurrSelect,NNumber pGadaSeqno,NString pCeremonyInd,NString pWhichNtyp,NString pFirstName,NString pMi,NString pLastName,NString pSuffix,NString pWhichAtyp,NString pStreet1,NString pStreet2,NString pStreet3,NString pStreet4,NString pHouseNumber,NString pCity,NString pStatCode,NString pZip,NString pNatnCode,NString pMsgCode,NString pLastnamePrefix) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKGRAD.P_DISP_DIPLOMA_ADDR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CURR_SELECT", pCurrSelect);
			cmd.addParameter("@P_GADA_SEQNO", pGadaSeqno);
			cmd.addParameter("@P_CEREMONY_IND", pCeremonyInd);
			cmd.addParameter("@P_WHICH_NTYP", pWhichNtyp);
			cmd.addParameter("@P_FIRST_NAME", pFirstName);
			cmd.addParameter("@P_MI", pMi);
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_SUFFIX", pSuffix);
			cmd.addParameter("@P_WHICH_ATYP", pWhichAtyp);
			cmd.addParameter("@P_STREET1", pStreet1);
			cmd.addParameter("@P_STREET2", pStreet2);
			cmd.addParameter("@P_STREET3", pStreet3);
			cmd.addParameter("@P_STREET4", pStreet4);
			cmd.addParameter("@P_HOUSE_NUMBER", pHouseNumber);
			cmd.addParameter("@P_CITY", pCity);
			cmd.addParameter("@P_STAT_CODE", pStatCode);
			cmd.addParameter("@P_ZIP", pZip);
			cmd.addParameter("@P_NATN_CODE", pNatnCode);
			cmd.addParameter("@P_MSG_CODE", pMsgCode);
			cmd.addParameter("@P_LASTNAME_PREFIX", pLastnamePrefix);
				
			cmd.execute();


		}
		
		public static void pDispDiplomaName(NString pCurrSelect,NNumber pGadaSeqno,NString pCeremonyInd,NString pWhichNtyp,NString pFirstName,NString pMi,NString pLastName,NString pSuffix,NString pMsgCode,NString pLastnamePrefix) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKGRAD.P_DISP_DIPLOMA_NAME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CURR_SELECT", pCurrSelect);
			cmd.addParameter("@P_GADA_SEQNO", pGadaSeqno);
			cmd.addParameter("@P_CEREMONY_IND", pCeremonyInd);
			cmd.addParameter("@P_WHICH_NTYP", pWhichNtyp);
			cmd.addParameter("@P_FIRST_NAME", pFirstName);
			cmd.addParameter("@P_MI", pMi);
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_SUFFIX", pSuffix);
			cmd.addParameter("@P_MSG_CODE", pMsgCode);
			cmd.addParameter("@P_LASTNAME_PREFIX", pLastnamePrefix);
				
			cmd.execute();


		}
		
		public static void pDispGradDate(NString pCurrSelect,NNumber pGadaSeqno,NString pMsgCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKGRAD.P_DISP_GRAD_DATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CURR_SELECT", pCurrSelect);
			cmd.addParameter("@P_GADA_SEQNO", pGadaSeqno);
			cmd.addParameter("@P_MSG_CODE", pMsgCode);
				
			cmd.execute();


		}
		
		public static void pDispGradTerm() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKGRAD.P_DISP_GRAD_TERM", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pDispGradapp(NString pCurrSelect,NString pMsgCode,NString pTerm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKGRAD.P_DISP_GRADAPP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CURR_SELECT", pCurrSelect);
			cmd.addParameter("@P_MSG_CODE", pMsgCode);
			cmd.addParameter("@P_TERM", pTerm);
				
			cmd.execute();


		}
		
		public static void pDispPayment(NString pCurrSelect,NNumber pGadaSeqno,NString pCeremonyInd,NString pWhichNtyp,NString pLastName,NString pFirstName,NString pMi,NString pSuffix,NString pWhichAtyp,NString pStreet1,NString pStreet2,NString pStreet3,NString pStreet4,NString pHouseNumber,NString pCity,NString pStatCode,NString pZip,NString pNatnCode,NString pWpyoCode,NNumber pChrg,NString pMsgCode,NString pLastnamePrefix) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKGRAD.P_DISP_PAYMENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CURR_SELECT", pCurrSelect);
			cmd.addParameter("@P_GADA_SEQNO", pGadaSeqno);
			cmd.addParameter("@P_CEREMONY_IND", pCeremonyInd);
			cmd.addParameter("@P_WHICH_NTYP", pWhichNtyp);
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_FIRST_NAME", pFirstName);
			cmd.addParameter("@P_MI", pMi);
			cmd.addParameter("@P_SUFFIX", pSuffix);
			cmd.addParameter("@P_WHICH_ATYP", pWhichAtyp);
			cmd.addParameter("@P_STREET1", pStreet1);
			cmd.addParameter("@P_STREET2", pStreet2);
			cmd.addParameter("@P_STREET3", pStreet3);
			cmd.addParameter("@P_STREET4", pStreet4);
			cmd.addParameter("@P_HOUSE_NUMBER", pHouseNumber);
			cmd.addParameter("@P_CITY", pCity);
			cmd.addParameter("@P_STAT_CODE", pStatCode);
			cmd.addParameter("@P_ZIP", pZip);
			cmd.addParameter("@P_NATN_CODE", pNatnCode);
			cmd.addParameter("@P_WPYO_CODE", pWpyoCode);
			cmd.addParameter("@P_CHRG", pChrg);
			cmd.addParameter("@P_MSG_CODE", pMsgCode);
			cmd.addParameter("@P_LASTNAME_PREFIX", pLastnamePrefix);
				
			cmd.execute();


		}
		
		public static void pDispSigpage(NString pCurrSelect) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKGRAD.P_DISP_SIGPAGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CURR_SELECT", pCurrSelect);
				
			cmd.execute();


		}
		
		public static void pDispsigpageCc(NString transactionId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKGRAD.P_DISPSIGPAGE_CC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TRANSACTION_ID", transactionId);
				
			cmd.execute();


		}
		
		public static void pExtractCurricInfo(NString pCurrSelect,NNumber pGadaSeqno,NString pWpyoCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKGRAD.P_EXTRACT_CURRIC_INFO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CURR_SELECT", pCurrSelect);
			cmd.addParameter("@P_GADA_SEQNO", pGadaSeqno);
			cmd.addParameter("@P_WPYO_CODE", pWpyoCode);
				
			cmd.execute();


		}
		
		public static void pInsertShbgapp(NString pCurrSelect) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKGRAD.P_INSERT_SHBGAPP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CURR_SELECT", pCurrSelect);
				
			cmd.execute();


		}
		
		public static void pInsertTbraccd(Ref<NNumber> pOutTran) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKGRAD.P_INSERT_TBRACCD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OUT_TRAN", NNumber.class);
				
			cmd.execute();
			pOutTran.val = cmd.getParameterValue("@P_OUT_TRAN", NNumber.class);


		}
		
		public static void pProcCeremony(NString pCurrSelect,NNumber pGadaSeqno,NString pCeremonyInd,NString pMsgCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKGRAD.P_PROC_CEREMONY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CURR_SELECT", pCurrSelect);
			cmd.addParameter("@P_GADA_SEQNO", pGadaSeqno);
			cmd.addParameter("@P_CEREMONY_IND", pCeremonyInd);
			cmd.addParameter("@P_MSG_CODE", pMsgCode);
				
			cmd.execute();


		}
		
		public static void pProcConfirm(NString pCurrSelect,NNumber pGadaSeqno,NString pCeremonyInd,NString pWhichNtyp,NString pLastName,NString pFirstName,NString pMi,NString pSuffix,NString pWhichAtyp,NString pStreet1,NString pStreet2,NString pStreet3,NString pStreet4,NString pHouseNumber,NString pCity,NString pStatCode,NString pZip,NString pNatnCode,NString pWpyoCode,NNumber pChrg,NString pMsgCode,NString pLastnamePrefix) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKGRAD.P_PROC_CONFIRM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CURR_SELECT", pCurrSelect);
			cmd.addParameter("@P_GADA_SEQNO", pGadaSeqno);
			cmd.addParameter("@P_CEREMONY_IND", pCeremonyInd);
			cmd.addParameter("@P_WHICH_NTYP", pWhichNtyp);
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_FIRST_NAME", pFirstName);
			cmd.addParameter("@P_MI", pMi);
			cmd.addParameter("@P_SUFFIX", pSuffix);
			cmd.addParameter("@P_WHICH_ATYP", pWhichAtyp);
			cmd.addParameter("@P_STREET1", pStreet1);
			cmd.addParameter("@P_STREET2", pStreet2);
			cmd.addParameter("@P_STREET3", pStreet3);
			cmd.addParameter("@P_STREET4", pStreet4);
			cmd.addParameter("@P_HOUSE_NUMBER", pHouseNumber);
			cmd.addParameter("@P_CITY", pCity);
			cmd.addParameter("@P_STAT_CODE", pStatCode);
			cmd.addParameter("@P_ZIP", pZip);
			cmd.addParameter("@P_NATN_CODE", pNatnCode);
			cmd.addParameter("@P_WPYO_CODE", pWpyoCode);
			cmd.addParameter("@P_CHRG", pChrg);
			cmd.addParameter("@P_MSG_CODE", pMsgCode);
			cmd.addParameter("@P_LASTNAME_PREFIX", pLastnamePrefix);
				
			cmd.execute();


		}
		
		public static void pProcDiplomaAddr(NString pCurrSelect,NNumber pGadaSeqno,NString pCeremonyInd,NString pWhichNtyp,NString pFirstName,NString pMi,NString pLastName,NString pSuffix,NString pWhichAtyp,NString pStreet1,NString pStreet2,NString pStreet3,NString pStreet4,NString pHouseNumber,NString pCity,NString pStatCode,NString pZip,NString pNatnCode,NString pReturnAddr,NString pMsgCode,NString pLastnamePrefix) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKGRAD.P_PROC_DIPLOMA_ADDR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CURR_SELECT", pCurrSelect);
			cmd.addParameter("@P_GADA_SEQNO", pGadaSeqno);
			cmd.addParameter("@P_CEREMONY_IND", pCeremonyInd);
			cmd.addParameter("@P_WHICH_NTYP", pWhichNtyp);
			cmd.addParameter("@P_FIRST_NAME", pFirstName);
			cmd.addParameter("@P_MI", pMi);
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_SUFFIX", pSuffix);
			cmd.addParameter("@P_WHICH_ATYP", pWhichAtyp);
			cmd.addParameter("@P_STREET1", pStreet1);
			cmd.addParameter("@P_STREET2", pStreet2);
			cmd.addParameter("@P_STREET3", pStreet3);
			cmd.addParameter("@P_STREET4", pStreet4);
			cmd.addParameter("@P_HOUSE_NUMBER", pHouseNumber);
			cmd.addParameter("@P_CITY", pCity);
			cmd.addParameter("@P_STAT_CODE", pStatCode);
			cmd.addParameter("@P_ZIP", pZip);
			cmd.addParameter("@P_NATN_CODE", pNatnCode);
			cmd.addParameter("@P_RETURN_ADDR", pReturnAddr);
			cmd.addParameter("@P_MSG_CODE", pMsgCode);
			cmd.addParameter("@P_LASTNAME_PREFIX", pLastnamePrefix);
				
			cmd.execute();


		}
		
		public static void pProcDiplomaName(NString pCurrSelect,NNumber pGadaSeqno,NString pCeremonyInd,NString pWhichNtyp,NString pFirstName,NString pMi,NString pLastName,NString pSuffix,NString pReturn,NString pMsgCode,NString pLastnamePrefix) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKGRAD.P_PROC_DIPLOMA_NAME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CURR_SELECT", pCurrSelect);
			cmd.addParameter("@P_GADA_SEQNO", pGadaSeqno);
			cmd.addParameter("@P_CEREMONY_IND", pCeremonyInd);
			cmd.addParameter("@P_WHICH_NTYP", pWhichNtyp);
			cmd.addParameter("@P_FIRST_NAME", pFirstName);
			cmd.addParameter("@P_MI", pMi);
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_SUFFIX", pSuffix);
			cmd.addParameter("@P_RETURN", pReturn);
			cmd.addParameter("@P_MSG_CODE", pMsgCode);
			cmd.addParameter("@P_LASTNAME_PREFIX", pLastnamePrefix);
				
			cmd.execute();


		}
		
		public static void pProcGradDate(NString pCurrSelect,NNumber pGadaSeqno,NString pMsgCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKGRAD.P_PROC_GRAD_DATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CURR_SELECT", pCurrSelect);
			cmd.addParameter("@P_GADA_SEQNO", pGadaSeqno);
			cmd.addParameter("@P_MSG_CODE", pMsgCode);
				
			cmd.execute();


		}
		
		public static void pProcGradapp(NString pCurrSelect) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKGRAD.P_PROC_GRADAPP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CURR_SELECT", pCurrSelect);
				
			cmd.execute();


		}
		
		public static void pProcPayment(NString pCurrSelect,NNumber pGadaSeqno,NString pCeremonyInd,NString pWhichNtyp,NString pLastName,NString pFirstName,NString pMi,NString pSuffix,NString pWhichAtyp,NString pStreet1,NString pStreet2,NString pStreet3,NString pStreet4,NString pHouseNumber,NString pCity,NString pStatCode,NString pZip,NString pNatnCode,NString pWpyoCode,NNumber pChrg,NString pMsgCode,NString pLastnamePrefix) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKGRAD.P_PROC_PAYMENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CURR_SELECT", pCurrSelect);
			cmd.addParameter("@P_GADA_SEQNO", pGadaSeqno);
			cmd.addParameter("@P_CEREMONY_IND", pCeremonyInd);
			cmd.addParameter("@P_WHICH_NTYP", pWhichNtyp);
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_FIRST_NAME", pFirstName);
			cmd.addParameter("@P_MI", pMi);
			cmd.addParameter("@P_SUFFIX", pSuffix);
			cmd.addParameter("@P_WHICH_ATYP", pWhichAtyp);
			cmd.addParameter("@P_STREET1", pStreet1);
			cmd.addParameter("@P_STREET2", pStreet2);
			cmd.addParameter("@P_STREET3", pStreet3);
			cmd.addParameter("@P_STREET4", pStreet4);
			cmd.addParameter("@P_HOUSE_NUMBER", pHouseNumber);
			cmd.addParameter("@P_CITY", pCity);
			cmd.addParameter("@P_STAT_CODE", pStatCode);
			cmd.addParameter("@P_ZIP", pZip);
			cmd.addParameter("@P_NATN_CODE", pNatnCode);
			cmd.addParameter("@P_WPYO_CODE", pWpyoCode);
			cmd.addParameter("@P_CHRG", pChrg);
			cmd.addParameter("@P_MSG_CODE", pMsgCode);
			cmd.addParameter("@P_LASTNAME_PREFIX", pLastnamePrefix);
				
			cmd.execute();


		}
		
		public static void pViewGradapp(NNumber pGappSeqno,NString pMsgCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKGRAD.P_VIEW_GRADAPP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_GAPP_SEQNO", pGappSeqno);
			cmd.addParameter("@P_MSG_CODE", pMsgCode);
				
			cmd.execute();


		}
		
	
	
	
}
