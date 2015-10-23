package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class AbGiftAuxlHoldRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AB_GIFT_AUXL_HOLD_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pId,NString pGiftNo,NString pAuxlCode,NString pAuxlDesc,NNumber pDcprCost,NString pUserId,NString pDataOrigin,NDate pAuxlValueDate,NNumber pPidm,NString pDcprCode,NDate pIssueDate,NNumber pDcprValue,NString pDesc,NString pAccRejInd,NDate pAccRejDate,NString pDonrCode,NString pPrefClas,NString pDeductForTaxes,NString pComment,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AB_GIFT_AUXL_HOLD_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_GIFT_NO", pGiftNo);
			cmd.addParameter("@P_AUXL_CODE", pAuxlCode);
			cmd.addParameter("@P_AUXL_DESC", pAuxlDesc);
			cmd.addParameter("@P_DCPR_COST", pDcprCost);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_AUXL_VALUE_DATE", pAuxlValueDate);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_DCPR_CODE", pDcprCode);
			cmd.addParameter("@P_ISSUE_DATE", pIssueDate);
			cmd.addParameter("@P_DCPR_VALUE", pDcprValue);
			cmd.addParameter("@P_DESC", pDesc);
			cmd.addParameter("@P_ACC_REJ_IND", pAccRejInd);
			cmd.addParameter("@P_ACC_REJ_DATE", pAccRejDate);
			cmd.addParameter("@P_DONR_CODE", pDonrCode);
			cmd.addParameter("@P_PREF_CLAS", pPrefClas);
			cmd.addParameter("@P_DEDUCT_FOR_TAXES", pDeductForTaxes);
			cmd.addParameter("@P_COMMENT", pComment);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pId,NString pGiftNo,NString pAuxlCode,NString pAuxlDesc,NNumber pDcprCost,NString pUserId,NString pDataOrigin,NDate pAuxlValueDate,NNumber pPidm,NString pDcprCode,NDate pIssueDate,NNumber pDcprValue,NString pDesc,NString pAccRejInd,NDate pAccRejDate,NString pDonrCode,NString pPrefClas,NString pDeductForTaxes,NString pComment) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AB_GIFT_AUXL_HOLD_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_GIFT_NO", pGiftNo);
			cmd.addParameter("@P_AUXL_CODE", pAuxlCode);
			cmd.addParameter("@P_AUXL_DESC", pAuxlDesc);
			cmd.addParameter("@P_DCPR_COST", pDcprCost);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_AUXL_VALUE_DATE", pAuxlValueDate);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_DCPR_CODE", pDcprCode);
			cmd.addParameter("@P_ISSUE_DATE", pIssueDate);
			cmd.addParameter("@P_DCPR_VALUE", pDcprValue);
			cmd.addParameter("@P_DESC", pDesc);
			cmd.addParameter("@P_ACC_REJ_IND", pAccRejInd);
			cmd.addParameter("@P_ACC_REJ_DATE", pAccRejDate);
			cmd.addParameter("@P_DONR_CODE", pDonrCode);
			cmd.addParameter("@P_PREF_CLAS", pPrefClas);
			cmd.addParameter("@P_DEDUCT_FOR_TAXES", pDeductForTaxes);
			cmd.addParameter("@P_COMMENT", pComment);
				
			cmd.execute();


		}
		
	
	
	
}
