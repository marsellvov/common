package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PbUnionContractInfoRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_UNION_CONTRACT_INFO_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pBargCode,NString pUnloCode,NNumber pSeqno,NString pContractTitle,NString pContractMultiInd,NDate pBeginDate,NString pContractStatus,NString pUserId,NDate pEndDate,NString pLcdeCode,NString pCatyCode,NString pContractUrl,NString pComment,NString pText,NString pDataOrigin,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_UNION_CONTRACT_INFO_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_BARG_CODE", pBargCode);
			cmd.addParameter("@P_UNLO_CODE", pUnloCode);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_CONTRACT_TITLE", pContractTitle);
			cmd.addParameter("@P_CONTRACT_MULTI_IND", pContractMultiInd);
			cmd.addParameter("@P_BEGIN_DATE", pBeginDate);
			cmd.addParameter("@P_CONTRACT_STATUS", pContractStatus);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_LCDE_CODE", pLcdeCode);
			cmd.addParameter("@P_CATY_CODE", pCatyCode);
			cmd.addParameter("@P_CONTRACT_URL", pContractUrl);
			cmd.addParameter("@P_COMMENT", pComment);
			cmd.addParameter("@P_TEXT", pText);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pBargCode,NString pUnloCode,NNumber pSeqno,NString pContractTitle,NString pContractMultiInd,NDate pBeginDate,NString pContractStatus,NString pUserId,NDate pEndDate,NString pLcdeCode,NString pCatyCode,NString pContractUrl,NString pComment,NString pText,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_UNION_CONTRACT_INFO_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_BARG_CODE", pBargCode);
			cmd.addParameter("@P_UNLO_CODE", pUnloCode);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_CONTRACT_TITLE", pContractTitle);
			cmd.addParameter("@P_CONTRACT_MULTI_IND", pContractMultiInd);
			cmd.addParameter("@P_BEGIN_DATE", pBeginDate);
			cmd.addParameter("@P_CONTRACT_STATUS", pContractStatus);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_LCDE_CODE", pLcdeCode);
			cmd.addParameter("@P_CATY_CODE", pCatyCode);
			cmd.addParameter("@P_CONTRACT_URL", pContractUrl);
			cmd.addParameter("@P_COMMENT", pComment);
			cmd.addParameter("@P_TEXT", pText);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
	
	
	
}
