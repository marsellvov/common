package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class TbTermControlArRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_TERM_CONTROL_AR_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pTermCode,NString pDetailWebDispInd,NDate pWebEffDate,NString pSumDetcInd,NString pAidAuthDispInd,NString pAidMemoDispInd,NString pOthMemoDispInd,NString pPayBtnInd,NString pAccdDueCde,NString pAuthDueCde,NString pMemoDueCde,NString pAidCalcInd,NString pDataOrigin,NString pUserId,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_TERM_CONTROL_AR_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_DETAIL_WEB_DISP_IND", pDetailWebDispInd);
			cmd.addParameter("@P_WEB_EFF_DATE", pWebEffDate);
			cmd.addParameter("@P_SUM_DETC_IND", pSumDetcInd);
			cmd.addParameter("@P_AID_AUTH_DISP_IND", pAidAuthDispInd);
			cmd.addParameter("@P_AID_MEMO_DISP_IND", pAidMemoDispInd);
			cmd.addParameter("@P_OTH_MEMO_DISP_IND", pOthMemoDispInd);
			cmd.addParameter("@P_PAY_BTN_IND", pPayBtnInd);
			cmd.addParameter("@P_ACCD_DUE_CDE", pAccdDueCde);
			cmd.addParameter("@P_AUTH_DUE_CDE", pAuthDueCde);
			cmd.addParameter("@P_MEMO_DUE_CDE", pMemoDueCde);
			cmd.addParameter("@P_AID_CALC_IND", pAidCalcInd);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pTermCode,NString pDetailWebDispInd,NDate pWebEffDate,NString pSumDetcInd,NString pAidAuthDispInd,NString pAidMemoDispInd,NString pOthMemoDispInd,NString pPayBtnInd,NString pAccdDueCde,NString pAuthDueCde,NString pMemoDueCde,NString pAidCalcInd,NString pDataOrigin,NString pUserId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_TERM_CONTROL_AR_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_DETAIL_WEB_DISP_IND", pDetailWebDispInd);
			cmd.addParameter("@P_WEB_EFF_DATE", pWebEffDate);
			cmd.addParameter("@P_SUM_DETC_IND", pSumDetcInd);
			cmd.addParameter("@P_AID_AUTH_DISP_IND", pAidAuthDispInd);
			cmd.addParameter("@P_AID_MEMO_DISP_IND", pAidMemoDispInd);
			cmd.addParameter("@P_OTH_MEMO_DISP_IND", pOthMemoDispInd);
			cmd.addParameter("@P_PAY_BTN_IND", pPayBtnInd);
			cmd.addParameter("@P_ACCD_DUE_CDE", pAccdDueCde);
			cmd.addParameter("@P_AUTH_DUE_CDE", pAuthDueCde);
			cmd.addParameter("@P_MEMO_DUE_CDE", pMemoDueCde);
			cmd.addParameter("@P_AID_CALC_IND", pAidCalcInd);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
				
			cmd.execute();


		}
		
	
	
	
}
