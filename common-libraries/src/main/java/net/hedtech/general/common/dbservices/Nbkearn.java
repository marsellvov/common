package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Nbkearn {
		public static DataCursor fQueryExistingEndDate(NNumber pPidm,NString pPosn,NString pSuff,NDate pEffectiveDate,NString pEarnCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKEARN.F_QUERY_EXISTING_END_DATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCheckDateInRange(NNumber pPidm,NString pPosn,NString pSuff,NDate pEffectiveDate,Ref<NString> pErrorMessageOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKEARN.P_CHECK_DATE_IN_RANGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_ERROR_MESSAGE_OUT", pErrorMessageOut, true);
				
			cmd.execute();
			pErrorMessageOut.val = cmd.getParameterValue("@P_ERROR_MESSAGE_OUT", NString.class);


		}
		
		public static void pCopyDefaultEarnings(NNumber pPidm,NString pPosn,NString pSuff,NDate pEffectiveDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKEARN.P_COPY_DEFAULT_EARNINGS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
				
			cmd.execute();


		}
		
		public static void pGetBaseEarnCode(NString pEclsCode,Ref<NString> pTempEarnCode,Ref<NString> pBaseEarnCode,Ref<NString> pBaseEarnDesc,Ref<NString> pMsg,Ref<NString> pMsgType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKEARN.P_GET_BASE_EARN_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ECLS_CODE", pEclsCode);
			cmd.addParameter("@P_TEMP_EARN_CODE", NString.class);
			cmd.addParameter("@P_BASE_EARN_CODE", NString.class);
			cmd.addParameter("@P_BASE_EARN_DESC", NString.class);
			cmd.addParameter("@P_MSG", NString.class);
			cmd.addParameter("@P_MSG_TYPE", NString.class);
				
			cmd.execute();
			pTempEarnCode.val = cmd.getParameterValue("@P_TEMP_EARN_CODE", NString.class);
			pBaseEarnCode.val = cmd.getParameterValue("@P_BASE_EARN_CODE", NString.class);
			pBaseEarnDesc.val = cmd.getParameterValue("@P_BASE_EARN_DESC", NString.class);
			pMsg.val = cmd.getParameterValue("@P_MSG", NString.class);
			pMsgType.val = cmd.getParameterValue("@P_MSG_TYPE", NString.class);


		}
		
		public static void pGetEmployeeClassCode(NNumber pPidm,NString pPosn,NString pSuff,NDate pEffectiveDate,Ref<NString> pEclsCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKEARN.P_GET_EMPLOYEE_CLASS_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_ECLS_CODE", NString.class);
				
			cmd.execute();
			pEclsCode.val = cmd.getParameterValue("@P_ECLS_CODE", NString.class);


		}
		
		public static void pUpdCancelEarn(NNumber pPidm,NString pPosn,NString pSuff,NDate pEffectiveDate,NString pEarnCode,NNumber pHrs,NNumber pDeemedHrs,NNumber pSpecialRate,NString pShift,NDate pCancelDate,NString pUserId,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKEARN.P_UPD_CANCEL_EARN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_HRS", pHrs);
			cmd.addParameter("@P_DEEMED_HRS", pDeemedHrs);
			cmd.addParameter("@P_SPECIAL_RATE", pSpecialRate);
			cmd.addParameter("@P_SHIFT", pShift);
			cmd.addParameter("@P_CANCEL_DATE", pCancelDate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
	
	
	
}
