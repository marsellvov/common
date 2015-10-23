package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbEdiAcadSessSumRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_ACAD_SESS_SUM_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pDcmtSeqno,NNumber pAsesSeqno,NNumber pGpaSeqno,NString pCtypCode,NString pSlvlCode,NNumber pGpaHours,NNumber pHoursAttempted,NNumber pHoursEarned,NNumber pGpaLow,NNumber pGpaHigh,NNumber pGpa,NString pGpaExcessInd,NNumber pClassRank,NNumber pClassSize,NString pRdqlCode,NString pRankDate,NString pCumSum,NString pDataOrigin,NString pUserId,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_ACAD_SESS_SUM_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_DCMT_SEQNO", pDcmtSeqno);
			cmd.addParameter("@P_ASES_SEQNO", pAsesSeqno);
			cmd.addParameter("@P_GPA_SEQNO", pGpaSeqno);
			cmd.addParameter("@P_CTYP_CODE", pCtypCode);
			cmd.addParameter("@P_SLVL_CODE", pSlvlCode);
			cmd.addParameter("@P_GPA_HOURS", pGpaHours);
			cmd.addParameter("@P_HOURS_ATTEMPTED", pHoursAttempted);
			cmd.addParameter("@P_HOURS_EARNED", pHoursEarned);
			cmd.addParameter("@P_GPA_LOW", pGpaLow);
			cmd.addParameter("@P_GPA_HIGH", pGpaHigh);
			cmd.addParameter("@P_GPA", pGpa);
			cmd.addParameter("@P_GPA_EXCESS_IND", pGpaExcessInd);
			cmd.addParameter("@P_CLASS_RANK", pClassRank);
			cmd.addParameter("@P_CLASS_SIZE", pClassSize);
			cmd.addParameter("@P_RDQL_CODE", pRdqlCode);
			cmd.addParameter("@P_RANK_DATE", pRankDate);
			cmd.addParameter("@P_CUM_SUM", pCumSum);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pDcmtSeqno,NNumber pAsesSeqno,NNumber pGpaSeqno,NString pCtypCode,NString pSlvlCode,NNumber pGpaHours,NNumber pHoursAttempted,NNumber pHoursEarned,NNumber pGpaLow,NNumber pGpaHigh,NNumber pGpa,NString pGpaExcessInd,NNumber pClassRank,NNumber pClassSize,NString pRdqlCode,NString pRankDate,NString pCumSum,NString pDataOrigin,NString pUserId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_ACAD_SESS_SUM_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DCMT_SEQNO", pDcmtSeqno);
			cmd.addParameter("@P_ASES_SEQNO", pAsesSeqno);
			cmd.addParameter("@P_GPA_SEQNO", pGpaSeqno);
			cmd.addParameter("@P_CTYP_CODE", pCtypCode);
			cmd.addParameter("@P_SLVL_CODE", pSlvlCode);
			cmd.addParameter("@P_GPA_HOURS", pGpaHours);
			cmd.addParameter("@P_HOURS_ATTEMPTED", pHoursAttempted);
			cmd.addParameter("@P_HOURS_EARNED", pHoursEarned);
			cmd.addParameter("@P_GPA_LOW", pGpaLow);
			cmd.addParameter("@P_GPA_HIGH", pGpaHigh);
			cmd.addParameter("@P_GPA", pGpa);
			cmd.addParameter("@P_GPA_EXCESS_IND", pGpaExcessInd);
			cmd.addParameter("@P_CLASS_RANK", pClassRank);
			cmd.addParameter("@P_CLASS_SIZE", pClassSize);
			cmd.addParameter("@P_RDQL_CODE", pRdqlCode);
			cmd.addParameter("@P_RANK_DATE", pRankDate);
			cmd.addParameter("@P_CUM_SUM", pCumSum);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
				
			cmd.execute();


		}
		
	
	
	
}
