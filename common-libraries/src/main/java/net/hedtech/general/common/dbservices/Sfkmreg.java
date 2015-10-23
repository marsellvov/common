package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Sfkmreg {
		public static void pCheckEligibility(NNumber pPidm,NString pRegTerm,NString pReadmitTerm,Ref<NString> pMsgInout,Ref<NString> pUpdateInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKMREG.P_CHECK_ELIGIBILITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_REG_TERM", pRegTerm);
			cmd.addParameter("@P_READMIT_TERM", pReadmitTerm);
			cmd.addParameter("@P_MSG_INOUT", pMsgInout, true);
			cmd.addParameter("@P_UPDATE_INOUT", pUpdateInout, true);
				
			cmd.execute();
			pMsgInout.val = cmd.getParameterValue("@P_MSG_INOUT", NString.class);
			pUpdateInout.val = cmd.getParameterValue("@P_UPDATE_INOUT", NString.class);


		}
		
		public static void pProcessRegistration(NNumber pPidm,NString pRegTerm,NDate pRegDate,NString pBlockInd,NString pBlockRstsCode,NString pAddCrn,NString pAddRstsCode,NDate pStartDate,NDate pEndDate,NString pGmodCode,NString pLevlCode,NNumber pCreditHrs,NNumber pBillHrs,NString pDropCrn,NString pDropRstsCode,NString pDropAllInd,NString pDropDeleteInd,NString pDuplSeverity,NString pLinkSeverity,NString pCorqSeverity,NString pPreqSeverity,NString pMinhSeverity,NString pMaxhSeverity,NString pTimeSeverity,NString pApprSeverity,NString pCapcSeverity,NString pMajrSeverity,NString pDeptSeverity,NString pCollSeverity,NString pLevlSeverity,NString pClasSeverity,NString pRpthSeverity,NString pHoldSeverity,NString pReptSeverity,NString pCampSeverity,NString pDegreeSeverity,NString pProgramSeverity,NString pAttsSeverity,NString pChrtSeverity,NString pMexcSeverity,NString pFeeAssessType,NString pSystemIn,Ref<NString> pMsgOut,Ref<NString> pUpdateOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKMREG.P_PROCESS_REGISTRATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_REG_TERM", pRegTerm);
			cmd.addParameter("@P_REG_DATE", pRegDate);
			cmd.addParameter("@P_BLOCK_IND", pBlockInd);
			cmd.addParameter("@P_BLOCK_RSTS_CODE", pBlockRstsCode);
			cmd.addParameter("@P_ADD_CRN", pAddCrn);
			cmd.addParameter("@P_ADD_RSTS_CODE", pAddRstsCode);
			cmd.addParameter("@P_START_DATE", pStartDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_GMOD_CODE", pGmodCode);
			cmd.addParameter("@P_LEVL_CODE", pLevlCode);
			cmd.addParameter("@P_CREDIT_HRS", pCreditHrs);
			cmd.addParameter("@P_BILL_HRS", pBillHrs);
			cmd.addParameter("@P_DROP_CRN", pDropCrn);
			cmd.addParameter("@P_DROP_RSTS_CODE", pDropRstsCode);
			cmd.addParameter("@P_DROP_ALL_IND", pDropAllInd);
			cmd.addParameter("@P_DROP_DELETE_IND", pDropDeleteInd);
			cmd.addParameter("@P_DUPL_SEVERITY", pDuplSeverity);
			cmd.addParameter("@P_LINK_SEVERITY", pLinkSeverity);
			cmd.addParameter("@P_CORQ_SEVERITY", pCorqSeverity);
			cmd.addParameter("@P_PREQ_SEVERITY", pPreqSeverity);
			cmd.addParameter("@P_MINH_SEVERITY", pMinhSeverity);
			cmd.addParameter("@P_MAXH_SEVERITY", pMaxhSeverity);
			cmd.addParameter("@P_TIME_SEVERITY", pTimeSeverity);
			cmd.addParameter("@P_APPR_SEVERITY", pApprSeverity);
			cmd.addParameter("@P_CAPC_SEVERITY", pCapcSeverity);
			cmd.addParameter("@P_MAJR_SEVERITY", pMajrSeverity);
			cmd.addParameter("@P_DEPT_SEVERITY", pDeptSeverity);
			cmd.addParameter("@P_COLL_SEVERITY", pCollSeverity);
			cmd.addParameter("@P_LEVL_SEVERITY", pLevlSeverity);
			cmd.addParameter("@P_CLAS_SEVERITY", pClasSeverity);
			cmd.addParameter("@P_RPTH_SEVERITY", pRpthSeverity);
			cmd.addParameter("@P_HOLD_SEVERITY", pHoldSeverity);
			cmd.addParameter("@P_REPT_SEVERITY", pReptSeverity);
			cmd.addParameter("@P_CAMP_SEVERITY", pCampSeverity);
			cmd.addParameter("@P_DEGREE_SEVERITY", pDegreeSeverity);
			cmd.addParameter("@P_PROGRAM_SEVERITY", pProgramSeverity);
			cmd.addParameter("@P_ATTS_SEVERITY", pAttsSeverity);
			cmd.addParameter("@P_CHRT_SEVERITY", pChrtSeverity);
			cmd.addParameter("@P_MEXC_SEVERITY", pMexcSeverity);
			cmd.addParameter("@P_FEE_ASSESS_TYPE", pFeeAssessType);
			cmd.addParameter("@P_SYSTEM_IN", pSystemIn);
			cmd.addParameter("@P_MSG_OUT", NString.class);
			cmd.addParameter("@P_UPDATE_OUT", NString.class);
				
			cmd.execute();
			pMsgOut.val = cmd.getParameterValue("@P_MSG_OUT", NString.class);
			pUpdateOut.val = cmd.getParameterValue("@P_UPDATE_OUT", NString.class);


		}
		
	
	
	
}
