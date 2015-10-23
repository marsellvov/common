package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Pekempl {
		public static NString fBrelTypeExists(NString pBrelType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKEMPL.F_BREL_TYPE_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_BREL_TYPE", pBrelType);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetEthn(NNumber pPidm,NString pEthnCde,NString pCitzCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKEMPL.F_GET_ETHN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ETHN_CDE", pEthnCde);
			cmd.addParameter("@P_CITZ_CODE", pCitzCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetRank(NNumber pPidm,NString pDate,NString pCoas,NString pOrgn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKEMPL.F_GET_RANK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_DATE", pDate);
			cmd.addParameter("@P_COAS", pCoas);
			cmd.addParameter("@P_ORGN", pOrgn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NInteger fGetTenure(NString pTenureSys,NNumber pPidm,NString pDate,NString pCoas,NString pOrgn,NString pPosn,NString pSuff) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKEMPL.F_GET_TENURE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
			cmd.addParameter("@P_TENURE_SYS", pTenureSys);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_DATE", pDate);
			cmd.addParameter("@P_COAS", pCoas);
			cmd.addParameter("@P_ORGN", pOrgn);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fInvalidDednExists(NNumber pPidm,NString pBcatCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKEMPL.F_INVALID_DEDN_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BCAT_CODE", pBcatCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fJobsNotEnded(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKEMPL.F_JOBS_NOT_ENDED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fJobsStillActive(NNumber pPidm,NString pLreaCode,NDate pLoaBegDate,NDate pLoaEndDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKEMPL.F_JOBS_STILL_ACTIVE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_LREA_CODE", pLreaCode);
			cmd.addParameter("@P_LOA_BEG_DATE", pLoaBegDate);
			cmd.addParameter("@P_LOA_END_DATE", pLoaEndDate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
//		
//		public static List<ListTabtypeRow> fList(NString pListName) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKEMPL.F_LIST", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<ListTabtypeRow>.class);
//			cmd.addParameter("@P_LIST_NAME", pListName);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<ListTabtypeRow>.class);
//
//		}
		
		public static NString fMinimalAddrInfoExists(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKEMPL.F_MINIMAL_ADDR_INFO_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pEditJobsStillOnLeave(NNumber pPidm,NDate pLoaEndDate,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKEMPL.P_EDIT_JOBS_STILL_ON_LEAVE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_LOA_END_DATE", pLoaEndDate);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pEditPrimaryFunction(NNumber pPidm,NString pPrimFunc,Ref<NString> pWarnMsgOut,Ref<NString> pErrMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKEMPL.P_EDIT_PRIMARY_FUNCTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PRIM_FUNC", pPrimFunc);
			cmd.addParameter("@P_WARN_MSG_OUT", NString.class);
			cmd.addParameter("@P_ERR_MSG_OUT", NString.class);
				
			cmd.execute();
			pWarnMsgOut.val = cmd.getParameterValue("@P_WARN_MSG_OUT", NString.class);
			pErrMsgOut.val = cmd.getParameterValue("@P_ERR_MSG_OUT", NString.class);


		}
		
		public static void pGetEclsDefaults(NString pEclsCode,Ref<NString> pLcatCodeOut,Ref<NString> pBcatCodeOut,Ref<NString> pStgrCodeOut,Ref<NString> pWkprCodeOut,Ref<NString> pFlsaIndOut,Ref<NString> pEgrpCodeOut,Ref<NString> pInternalFtPtIndOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKEMPL.P_GET_ECLS_DEFAULTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ECLS_CODE", pEclsCode);
			cmd.addParameter("@P_LCAT_CODE_OUT", NString.class);
			cmd.addParameter("@P_BCAT_CODE_OUT", NString.class);
			cmd.addParameter("@P_STGR_CODE_OUT", NString.class);
			cmd.addParameter("@P_WKPR_CODE_OUT", NString.class);
			cmd.addParameter("@P_FLSA_IND_OUT", NString.class);
			cmd.addParameter("@P_EGRP_CODE_OUT", NString.class);
			cmd.addParameter("@P_INTERNAL_FT_PT_IND_OUT", NString.class);
				
			cmd.execute();
			pLcatCodeOut.val = cmd.getParameterValue("@P_LCAT_CODE_OUT", NString.class);
			pBcatCodeOut.val = cmd.getParameterValue("@P_BCAT_CODE_OUT", NString.class);
			pStgrCodeOut.val = cmd.getParameterValue("@P_STGR_CODE_OUT", NString.class);
			pWkprCodeOut.val = cmd.getParameterValue("@P_WKPR_CODE_OUT", NString.class);
			pFlsaIndOut.val = cmd.getParameterValue("@P_FLSA_IND_OUT", NString.class);
			pEgrpCodeOut.val = cmd.getParameterValue("@P_EGRP_CODE_OUT", NString.class);
			pInternalFtPtIndOut.val = cmd.getParameterValue("@P_INTERNAL_FT_PT_IND_OUT", NString.class);


		}
		
	
	
	
}
