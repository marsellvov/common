package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Fvkndoc {
		public static NString fGetDoctype(NString pCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FVKNDOC.F_GET_DOCTYPE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CODE", pCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetDoctype2(NString pCode,NString pVendInvCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FVKNDOC.F_GET_DOCTYPE2", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_VEND_INV_CODE", pVendInvCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fGetNumAut(NString pBankCode,NString pDocType,NString pSession,Ref<NNumber> pSeqNumOut,Ref<NString> pMessageOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FVKNDOC.F_GET_NUM_AUT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_BANK_CODE", pBankCode);
			cmd.addParameter("@P_DOC_TYPE", pDocType);
			cmd.addParameter("@P_SESSION", pSession);
			cmd.addParameter("@P_SEQ_NUM_OUT", NNumber.class);
			cmd.addParameter("@P_MESSAGE_OUT", NString.class);
				
			cmd.execute();
			pSeqNumOut.val = cmd.getParameterValue("@P_SEQ_NUM_OUT", NNumber.class);
			pMessageOut.val = cmd.getParameterValue("@P_MESSAGE_OUT", NString.class);

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fGetNumBas(NString pDocType,Ref<NString> pMessageOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FVKNDOC.F_GET_NUM_BAS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_DOC_TYPE", pDocType);
			cmd.addParameter("@P_MESSAGE_OUT", NString.class);
				
			cmd.execute();
			pMessageOut.val = cmd.getParameterValue("@P_MESSAGE_OUT", NString.class);

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetdoctypedesc(NString pDoctype) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FVKNDOC.F_GETDOCTYPEDESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_DOCTYPE", pDoctype);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fTestRunProccess(NString pName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FVKNDOC.F_TEST_RUN_PROCCESS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_NAME", pName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pCheckautonumConfig(NString pBankCode,NString pDocType,Ref<NString> pMessageOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FVKNDOC.P_CHECKAUTONUM_CONFIG", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_BANK_CODE", pBankCode);
			cmd.addParameter("@P_DOC_TYPE", pDocType);
			cmd.addParameter("@P_MESSAGE_OUT", NString.class);
				
			cmd.execute();
			pMessageOut.val = cmd.getParameterValue("@P_MESSAGE_OUT", NString.class);


		}
		
		public static void pGetNumCheck(NString pBankCode,NString pDocType,Ref<NNumber> pNumAutOut,Ref<NString> pNumLargeOut,Ref<NNumber> pNumSeqOut,Ref<NString> pMessageOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FVKNDOC.P_GET_NUM_CHECK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_BANK_CODE", pBankCode);
			cmd.addParameter("@P_DOC_TYPE", pDocType);
			cmd.addParameter("@P_NUM_AUT_OUT", NNumber.class);
			cmd.addParameter("@P_NUM_LARGE_OUT", NString.class);
			cmd.addParameter("@P_NUM_SEQ_OUT", NNumber.class);
			cmd.addParameter("@P_MESSAGE_OUT", NString.class);
				
			cmd.execute();
			pNumAutOut.val = cmd.getParameterValue("@P_NUM_AUT_OUT", NNumber.class);
			pNumLargeOut.val = cmd.getParameterValue("@P_NUM_LARGE_OUT", NString.class);
			pNumSeqOut.val = cmd.getParameterValue("@P_NUM_SEQ_OUT", NNumber.class);
			pMessageOut.val = cmd.getParameterValue("@P_MESSAGE_OUT", NString.class);


		}
		
		public static void pInsFvrdnma(NString pBankCode,NString pTypeDoc,NString pSession,Ref<NString> pMessageOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FVKNDOC.P_INS_FVRDNMA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_BANK_CODE", pBankCode);
			cmd.addParameter("@P_TYPE_DOC", pTypeDoc);
			cmd.addParameter("@P_SESSION", pSession);
			cmd.addParameter("@P_MESSAGE_OUT", NString.class);
				
			cmd.execute();
			pMessageOut.val = cmd.getParameterValue("@P_MESSAGE_OUT", NString.class);


		}
		
		public static void pInsFvtchkn(NString pBankCode,NString pInvoice,NString pDocType,NNumber pNumSeq,NString pNumBase,NNumber pNumAut,NString pNumLarge,NDate pChkDate,NString pSession,Ref<NString> pMessageOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FVKNDOC.P_INS_FVTCHKN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_BANK_CODE", pBankCode);
			cmd.addParameter("@P_INVOICE", pInvoice);
			cmd.addParameter("@P_DOC_TYPE", pDocType);
			cmd.addParameter("@P_NUM_SEQ", pNumSeq);
			cmd.addParameter("@P_NUM_BASE", pNumBase);
			cmd.addParameter("@P_NUM_AUT", pNumAut);
			cmd.addParameter("@P_NUM_LARGE", pNumLarge);
			cmd.addParameter("@P_CHK_DATE", pChkDate);
			cmd.addParameter("@P_SESSION", pSession);
			cmd.addParameter("@P_MESSAGE_OUT", NString.class);
				
			cmd.execute();
			pMessageOut.val = cmd.getParameterValue("@P_MESSAGE_OUT", NString.class);


		}
		
		public static void pWriteLog(NString pMessage) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FVKNDOC.P_WRITE_LOG", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_MESSAGE", pMessage);
				
			cmd.execute();


		}
		
	
	
	
}
