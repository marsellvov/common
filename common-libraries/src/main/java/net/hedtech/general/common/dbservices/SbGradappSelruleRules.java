package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbGradappSelruleRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_GRADAPP_SELRULE_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pSeqno,NNumber pProcessOrderNo,NString pGadrCode,NString pUserId,NString pLevlCode,NString pCampCode,NString pCollCode,NString pDegcCode,NString pProgram,NString pLfstCode,NString pMajrCode,NString pDeptCode,NString pDataOrigin,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_GRADAPP_SELRULE_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_PROCESS_ORDER_NO", pProcessOrderNo);
			cmd.addParameter("@P_GADR_CODE", pGadrCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_LEVL_CODE", pLevlCode);
			cmd.addParameter("@P_CAMP_CODE", pCampCode);
			cmd.addParameter("@P_COLL_CODE", pCollCode);
			cmd.addParameter("@P_DEGC_CODE", pDegcCode);
			cmd.addParameter("@P_PROGRAM", pProgram);
			cmd.addParameter("@P_LFST_CODE", pLfstCode);
			cmd.addParameter("@P_MAJR_CODE", pMajrCode);
			cmd.addParameter("@P_DEPT_CODE", pDeptCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pSeqno,NNumber pProcessOrderNo,NString pGadrCode,NString pUserId,NString pLevlCode,NString pCampCode,NString pCollCode,NString pDegcCode,NString pProgram,NString pLfstCode,NString pMajrCode,NString pDeptCode,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_GRADAPP_SELRULE_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_PROCESS_ORDER_NO", pProcessOrderNo);
			cmd.addParameter("@P_GADR_CODE", pGadrCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_LEVL_CODE", pLevlCode);
			cmd.addParameter("@P_CAMP_CODE", pCampCode);
			cmd.addParameter("@P_COLL_CODE", pCollCode);
			cmd.addParameter("@P_DEGC_CODE", pDegcCode);
			cmd.addParameter("@P_PROGRAM", pProgram);
			cmd.addParameter("@P_LFST_CODE", pLfstCode);
			cmd.addParameter("@P_MAJR_CODE", pMajrCode);
			cmd.addParameter("@P_DEPT_CODE", pDeptCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
	
	
	
}
