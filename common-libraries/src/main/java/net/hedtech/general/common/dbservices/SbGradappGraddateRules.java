package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbGradappGraddateRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_GRADAPP_GRADDATE_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pGadrCode,NNumber pSeqno,NDate pFromDate,NDate pToDate,NString pCeremonyInd,NString pUserId,NDate pGradDate,NString pGradTermCode,NString pAcyrCode,NString pDataOrigin,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_GRADAPP_GRADDATE_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_GADR_CODE", pGadrCode);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_FROM_DATE", pFromDate);
			cmd.addParameter("@P_TO_DATE", pToDate);
			cmd.addParameter("@P_CEREMONY_IND", pCeremonyInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_GRAD_DATE", pGradDate);
			cmd.addParameter("@P_GRAD_TERM_CODE", pGradTermCode);
			cmd.addParameter("@P_ACYR_CODE", pAcyrCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pGadrCode,NNumber pSeqno,NDate pFromDate,NDate pToDate,NString pCeremonyInd,NString pUserId,NDate pGradDate,NString pGradTermCode,NString pAcyrCode,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_GRADAPP_GRADDATE_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_GADR_CODE", pGadrCode);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_FROM_DATE", pFromDate);
			cmd.addParameter("@P_TO_DATE", pToDate);
			cmd.addParameter("@P_CEREMONY_IND", pCeremonyInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_GRAD_DATE", pGradDate);
			cmd.addParameter("@P_GRAD_TERM_CODE", pGradTermCode);
			cmd.addParameter("@P_ACYR_CODE", pAcyrCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
	
	
	
}
