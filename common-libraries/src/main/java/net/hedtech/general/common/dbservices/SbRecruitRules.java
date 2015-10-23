package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbRecruitRules {
		public static NString fSelectIndExists(NNumber pPidm,NString pTermCode,NNumber pAdminSeqno,NString pSelectInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_RECRUIT_RULES.F_SELECT_IND_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_ADMIN_SEQNO", pAdminSeqno);
			cmd.addParameter("@P_SELECT_IND", pSelectInd);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_RECRUIT_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pPidm,NString pTermCode,NNumber pAdminSeqno,NString pRecrCode,NString pRstaCode,NString pSelectInd,NDate pAddDate,NString pAdmtCode,NString pEdlvCode,NString pEgolCode,NString pFullPartInd,NString pSbgiCode,NString pWrsnCode,NString pRtypCode,NString pResdCode,NString pSessCode,NString pSiteCode,NString pStypCode,NString pDataOrigin,NString pUserId,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_RECRUIT_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_ADMIN_SEQNO", pAdminSeqno);
			cmd.addParameter("@P_RECR_CODE", pRecrCode);
			cmd.addParameter("@P_RSTA_CODE", pRstaCode);
			cmd.addParameter("@P_SELECT_IND", pSelectInd);
			cmd.addParameter("@P_ADD_DATE", pAddDate);
			cmd.addParameter("@P_ADMT_CODE", pAdmtCode);
			cmd.addParameter("@P_EDLV_CODE", pEdlvCode);
			cmd.addParameter("@P_EGOL_CODE", pEgolCode);
			cmd.addParameter("@P_FULL_PART_IND", pFullPartInd);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_WRSN_CODE", pWrsnCode);
			cmd.addParameter("@P_RTYP_CODE", pRtypCode);
			cmd.addParameter("@P_RESD_CODE", pResdCode);
			cmd.addParameter("@P_SESS_CODE", pSessCode);
			cmd.addParameter("@P_SITE_CODE", pSiteCode);
			cmd.addParameter("@P_STYP_CODE", pStypCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pPidm,NString pTermCode,NNumber pAdminSeqno,NString pRecrCode,NString pRstaCode,NString pSelectInd,NDate pAddDate,NString pAdmtCode,NString pEdlvCode,NString pEgolCode,NString pFullPartInd,NString pSbgiCode,NString pWrsnCode,NString pRtypCode,NString pResdCode,NString pSessCode,NString pSiteCode,NString pStypCode,NString pDataOrigin,NString pUserId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_RECRUIT_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_ADMIN_SEQNO", pAdminSeqno);
			cmd.addParameter("@P_RECR_CODE", pRecrCode);
			cmd.addParameter("@P_RSTA_CODE", pRstaCode);
			cmd.addParameter("@P_SELECT_IND", pSelectInd);
			cmd.addParameter("@P_ADD_DATE", pAddDate);
			cmd.addParameter("@P_ADMT_CODE", pAdmtCode);
			cmd.addParameter("@P_EDLV_CODE", pEdlvCode);
			cmd.addParameter("@P_EGOL_CODE", pEgolCode);
			cmd.addParameter("@P_FULL_PART_IND", pFullPartInd);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_WRSN_CODE", pWrsnCode);
			cmd.addParameter("@P_RTYP_CODE", pRtypCode);
			cmd.addParameter("@P_RESD_CODE", pResdCode);
			cmd.addParameter("@P_SESS_CODE", pSessCode);
			cmd.addParameter("@P_SITE_CODE", pSiteCode);
			cmd.addParameter("@P_STYP_CODE", pStypCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
				
			cmd.execute();


		}
		
	
	
	
}
