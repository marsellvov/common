package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbEdiImmunizationRules {
		public static DataCursor fQueryAllDcmt(NNumber pDcmtSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_IMMUNIZATION_RULES.F_QUERY_ALL_DCMT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_DCMT_SEQNO", pDcmtSeqno);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static NNumber fSeqno(NNumber pDcmtSeqno,NString pImmuCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_IMMUNIZATION_RULES.F_SEQNO", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_DCMT_SEQNO", pDcmtSeqno);
			cmd.addParameter("@P_IMMU_CODE", pImmuCode);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_IMMUNIZATION_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pDcmtSeqno,NString pImmuCode,NNumber pSeqNo,NString pUserId,NDate pImmuDate,NString pImstCode,NString pRptCde,NString pComment,NString pDataOrigin,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_IMMUNIZATION_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_DCMT_SEQNO", pDcmtSeqno);
			cmd.addParameter("@P_IMMU_CODE", pImmuCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_IMMU_DATE", pImmuDate);
			cmd.addParameter("@P_IMST_CODE", pImstCode);
			cmd.addParameter("@P_RPT_CDE", pRptCde);
			cmd.addParameter("@P_COMMENT", pComment);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pDcmtSeqno,NString pImmuCode,NNumber pSeqNo,NString pUserId,NDate pImmuDate,NString pImstCode,NString pRptCde,NString pComment,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_IMMUNIZATION_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DCMT_SEQNO", pDcmtSeqno);
			cmd.addParameter("@P_IMMU_CODE", pImmuCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_IMMU_DATE", pImmuDate);
			cmd.addParameter("@P_IMST_CODE", pImstCode);
			cmd.addParameter("@P_RPT_CDE", pRptCde);
			cmd.addParameter("@P_COMMENT", pComment);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
	
	
	
}
