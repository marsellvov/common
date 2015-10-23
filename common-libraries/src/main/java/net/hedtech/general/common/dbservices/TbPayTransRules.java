package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class TbPayTransRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_PAY_TRANS_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pPayTransId,NString pPtypCode,NString pProcess,NString pCode,NNumber pAmount,NString pDepReleaseInd,NDate pDepRelDate,NDate pDepExpDate,NNumber pDepMinAmount,NNumber pSortSeqno,NString pUserId,NNumber pSurrogateId,NNumber pVersion,NString pVpdiCode,NString pDataOrigin,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_PAY_TRANS_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_PAY_TRANS_ID", pPayTransId);
			cmd.addParameter("@P_PTYP_CODE", pPtypCode);
			cmd.addParameter("@P_PROCESS", pProcess);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_AMOUNT", pAmount);
			cmd.addParameter("@P_DEP_RELEASE_IND", pDepReleaseInd);
			cmd.addParameter("@P_DEP_REL_DATE", pDepRelDate);
			cmd.addParameter("@P_DEP_EXP_DATE", pDepExpDate);
			cmd.addParameter("@P_DEP_MIN_AMOUNT", pDepMinAmount);
			cmd.addParameter("@P_SORT_SEQNO", pSortSeqno);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_SURROGATE_ID", pSurrogateId);
			cmd.addParameter("@P_VERSION", pVersion);
			cmd.addParameter("@P_VPDI_CODE", pVpdiCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pPayTransId,NString pPtypCode,NString pProcess,NString pCode,NNumber pAmount,NString pDepReleaseInd,NDate pDepRelDate,NDate pDepExpDate,NNumber pDepMinAmount,NNumber pSortSeqno,NString pUserId,NNumber pSurrogateId,NNumber pVersion,NString pVpdiCode,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_PAY_TRANS_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PAY_TRANS_ID", pPayTransId);
			cmd.addParameter("@P_PTYP_CODE", pPtypCode);
			cmd.addParameter("@P_PROCESS", pProcess);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_AMOUNT", pAmount);
			cmd.addParameter("@P_DEP_RELEASE_IND", pDepReleaseInd);
			cmd.addParameter("@P_DEP_REL_DATE", pDepRelDate);
			cmd.addParameter("@P_DEP_EXP_DATE", pDepExpDate);
			cmd.addParameter("@P_DEP_MIN_AMOUNT", pDepMinAmount);
			cmd.addParameter("@P_SORT_SEQNO", pSortSeqno);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_SURROGATE_ID", pSurrogateId);
			cmd.addParameter("@P_VERSION", pVersion);
			cmd.addParameter("@P_VPDI_CODE", pVpdiCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
	
	
	
}
