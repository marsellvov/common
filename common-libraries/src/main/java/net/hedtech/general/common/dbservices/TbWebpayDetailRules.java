package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class TbWebpayDetailRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_WEBPAY_DETAIL_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pTermCode,NString pPtypPmntCode,NString pPtypTranCode,NNumber pSeqno,NString pDesc,NString pReqInd,NString pMultInd,NNumber pAmount,NString pProcess,NString pCode,NString pProcedure,NString pDepReleaseInd,NDate pDepRelDate,NDate pDepExpDate,NNumber pDepMinAmount,NString pUserId,NNumber pSurrogateId,NNumber pVersion,NString pVpdiCode,NString pDataOrigin,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_WEBPAY_DETAIL_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PTYP_PMNT_CODE", pPtypPmntCode);
			cmd.addParameter("@P_PTYP_TRAN_CODE", pPtypTranCode);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_DESC", pDesc);
			cmd.addParameter("@P_REQ_IND", pReqInd);
			cmd.addParameter("@P_MULT_IND", pMultInd);
			cmd.addParameter("@P_AMOUNT", pAmount);
			cmd.addParameter("@P_PROCESS", pProcess);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_PROCEDURE", pProcedure);
			cmd.addParameter("@P_DEP_RELEASE_IND", pDepReleaseInd);
			cmd.addParameter("@P_DEP_REL_DATE", pDepRelDate);
			cmd.addParameter("@P_DEP_EXP_DATE", pDepExpDate);
			cmd.addParameter("@P_DEP_MIN_AMOUNT", pDepMinAmount);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_SURROGATE_ID", pSurrogateId);
			cmd.addParameter("@P_VERSION", pVersion);
			cmd.addParameter("@P_VPDI_CODE", pVpdiCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pTermCode,NString pPtypPmntCode,NString pPtypTranCode,NNumber pSeqno,NString pDesc,NString pReqInd,NString pMultInd,NNumber pAmount,NString pProcess,NString pCode,NString pProcedure,NString pDepReleaseInd,NDate pDepRelDate,NDate pDepExpDate,NNumber pDepMinAmount,NString pUserId,NNumber pSurrogateId,NNumber pVersion,NString pVpdiCode,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_WEBPAY_DETAIL_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PTYP_PMNT_CODE", pPtypPmntCode);
			cmd.addParameter("@P_PTYP_TRAN_CODE", pPtypTranCode);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_DESC", pDesc);
			cmd.addParameter("@P_REQ_IND", pReqInd);
			cmd.addParameter("@P_MULT_IND", pMultInd);
			cmd.addParameter("@P_AMOUNT", pAmount);
			cmd.addParameter("@P_PROCESS", pProcess);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_PROCEDURE", pProcedure);
			cmd.addParameter("@P_DEP_RELEASE_IND", pDepReleaseInd);
			cmd.addParameter("@P_DEP_REL_DATE", pDepRelDate);
			cmd.addParameter("@P_DEP_EXP_DATE", pDepExpDate);
			cmd.addParameter("@P_DEP_MIN_AMOUNT", pDepMinAmount);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_SURROGATE_ID", pSurrogateId);
			cmd.addParameter("@P_VERSION", pVersion);
			cmd.addParameter("@P_VPDI_CODE", pVpdiCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
	
	
	
}
