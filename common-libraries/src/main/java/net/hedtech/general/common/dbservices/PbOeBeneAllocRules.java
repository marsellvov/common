package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PbOeBeneAllocRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_OE_BENE_ALLOC_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pPidm,NString pBdcaCode,NNumber pBeneSeqNo,NString pPrimaryInd,NString pOpenEnrollInd,NString pUserId,NString pDataOrigin,NNumber pPrimaryAllocPct,NNumber pContingentAllocPct,NNumber pPrimaryAllocAmt,NNumber pContingentAllocAmt,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_OE_BENE_ALLOC_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_BENE_SEQ_NO", pBeneSeqNo);
			cmd.addParameter("@P_PRIMARY_IND", pPrimaryInd);
			cmd.addParameter("@P_OPEN_ENROLL_IND", pOpenEnrollInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_PRIMARY_ALLOC_PCT", pPrimaryAllocPct);
			cmd.addParameter("@P_CONTINGENT_ALLOC_PCT", pContingentAllocPct);
			cmd.addParameter("@P_PRIMARY_ALLOC_AMT", pPrimaryAllocAmt);
			cmd.addParameter("@P_CONTINGENT_ALLOC_AMT", pContingentAllocAmt);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pPidm,NString pBdcaCode,NNumber pBeneSeqNo,NString pPrimaryInd,NString pOpenEnrollInd,NString pUserId,NString pDataOrigin,NNumber pPrimaryAllocPct,NNumber pContingentAllocPct,NNumber pPrimaryAllocAmt,NNumber pContingentAllocAmt) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_OE_BENE_ALLOC_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_BENE_SEQ_NO", pBeneSeqNo);
			cmd.addParameter("@P_PRIMARY_IND", pPrimaryInd);
			cmd.addParameter("@P_OPEN_ENROLL_IND", pOpenEnrollInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_PRIMARY_ALLOC_PCT", pPrimaryAllocPct);
			cmd.addParameter("@P_CONTINGENT_ALLOC_PCT", pContingentAllocPct);
			cmd.addParameter("@P_PRIMARY_ALLOC_AMT", pPrimaryAllocAmt);
			cmd.addParameter("@P_CONTINGENT_ALLOC_AMT", pContingentAllocAmt);
				
			cmd.execute();


		}
		
	
	
	
}
