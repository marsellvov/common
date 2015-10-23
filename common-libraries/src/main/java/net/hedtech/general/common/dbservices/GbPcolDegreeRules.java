package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GbPcolDegreeRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_PCOL_DEGREE_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pPidm,NString pSbgiCode,NString pDegcCode,NNumber pDegrSeqNo,NDate pAttendFrom,NDate pAttendTo,NNumber pHoursTransferred,NNumber pGpaTransferred,NDate pDegcDate,NString pDegcYear,NString pCollCode,NString pHonrCode,NString pTermDegree,NString pEgolCode,NString pPrimaryInd,NString pDataOrigin,NString pUserId,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_PCOL_DEGREE_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_DEGC_CODE", pDegcCode);
			cmd.addParameter("@P_DEGR_SEQ_NO", pDegrSeqNo);
			cmd.addParameter("@P_ATTEND_FROM", pAttendFrom);
			cmd.addParameter("@P_ATTEND_TO", pAttendTo);
			cmd.addParameter("@P_HOURS_TRANSFERRED", pHoursTransferred);
			cmd.addParameter("@P_GPA_TRANSFERRED", pGpaTransferred);
			cmd.addParameter("@P_DEGC_DATE", pDegcDate);
			cmd.addParameter("@P_DEGC_YEAR", pDegcYear);
			cmd.addParameter("@P_COLL_CODE", pCollCode);
			cmd.addParameter("@P_HONR_CODE", pHonrCode);
			cmd.addParameter("@P_TERM_DEGREE", pTermDegree);
			cmd.addParameter("@P_EGOL_CODE", pEgolCode);
			cmd.addParameter("@P_PRIMARY_IND", pPrimaryInd);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pPidm,NString pSbgiCode,NString pDegcCode,NNumber pDegrSeqNo,NDate pAttendFrom,NDate pAttendTo,NNumber pHoursTransferred,NNumber pGpaTransferred,NDate pDegcDate,NString pDegcYear,NString pCollCode,NString pHonrCode,NString pTermDegree,NString pEgolCode,NString pPrimaryInd,NString pDataOrigin,NString pUserId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_PCOL_DEGREE_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_DEGC_CODE", pDegcCode);
			cmd.addParameter("@P_DEGR_SEQ_NO", pDegrSeqNo);
			cmd.addParameter("@P_ATTEND_FROM", pAttendFrom);
			cmd.addParameter("@P_ATTEND_TO", pAttendTo);
			cmd.addParameter("@P_HOURS_TRANSFERRED", pHoursTransferred);
			cmd.addParameter("@P_GPA_TRANSFERRED", pGpaTransferred);
			cmd.addParameter("@P_DEGC_DATE", pDegcDate);
			cmd.addParameter("@P_DEGC_YEAR", pDegcYear);
			cmd.addParameter("@P_COLL_CODE", pCollCode);
			cmd.addParameter("@P_HONR_CODE", pHonrCode);
			cmd.addParameter("@P_TERM_DEGREE", pTermDegree);
			cmd.addParameter("@P_EGOL_CODE", pEgolCode);
			cmd.addParameter("@P_PRIMARY_IND", pPrimaryInd);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
				
			cmd.execute();


		}
		
	
	
	
}
