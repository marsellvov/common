package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class TbCommon {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_COMMON.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NNumber fUpdateSobseqnReceipt() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_COMMON.F_UPDATE_SOBSEQN_RECEIPT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void pAddrEdit(NNumber pPidm,NString pTermCode,NString pCheckDefault,Ref<NString> pAtypCodeInout,Ref<NNumber> pAtypSeqnoInout,Ref<NString> errorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_COMMON.P_ADDR_EDIT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CHECK_DEFAULT", pCheckDefault);
			cmd.addParameter("@P_ATYP_CODE_INOUT", pAtypCodeInout, true);
			cmd.addParameter("@P_ATYP_SEQNO_INOUT", pAtypSeqnoInout, true);
			cmd.addParameter("@ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pAtypCodeInout.val = cmd.getParameterValue("@P_ATYP_CODE_INOUT", NString.class);
			pAtypSeqnoInout.val = cmd.getParameterValue("@P_ATYP_SEQNO_INOUT", NNumber.class);
			errorMsgOut.val = cmd.getParameterValue("@ERROR_MSG_OUT", NString.class);


		}
		
		public static void pFindStudent(NString pId,NString pSsn,Ref<NString> pIdentSourceOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_COMMON.P_FIND_STUDENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_SSN", pSsn);
			cmd.addParameter("@P_IDENT_SOURCE_OUT", NString.class);
				
			cmd.execute();
			pIdentSourceOut.val = cmd.getParameterValue("@P_IDENT_SOURCE_OUT", NString.class);


		}
		
		public static void pReturnCheckFee(NNumber pPidm,NString pTermCode,NString pDetailCode,NDate pEntryDate,NNumber pAmount,NDate pTransDate,NDate pEffectiveDate,NNumber pReceiptNumber,NString pAtypCode,NNumber pAtypSeqno,NString pUser,NNumber pSessionNumber,NDate pCshrEndDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_COMMON.P_RETURN_CHECK_FEE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_DETAIL_CODE", pDetailCode);
			cmd.addParameter("@P_ENTRY_DATE", pEntryDate);
			cmd.addParameter("@P_AMOUNT", pAmount);
			cmd.addParameter("@P_TRANS_DATE", pTransDate);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_RECEIPT_NUMBER", pReceiptNumber);
			cmd.addParameter("@P_ATYP_CODE", pAtypCode);
			cmd.addParameter("@P_ATYP_SEQNO", pAtypSeqno);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_SESSION_NUMBER", pSessionNumber);
			cmd.addParameter("@P_CSHR_END_DATE", pCshrEndDate);
				
			cmd.execute();


		}
		
	
	
	
}
