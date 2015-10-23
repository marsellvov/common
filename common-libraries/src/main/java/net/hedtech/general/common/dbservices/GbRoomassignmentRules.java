package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GbRoomassignmentRules {
		public static NString fCheckBldg(NString pBldgCode,NString pSex) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_ROOMASSIGNMENT_RULES.F_CHECK_BLDG", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_BLDG_CODE", pBldgCode);
			cmd.addParameter("@P_SEX", pSex);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCheckCapacity(NString pTermCode,NString pBldgCode,NString pRoomNumber,NNumber pPidm,NDate pBeginDate,NDate pEndDate,NString pAscdCode,NString pOverloadInd,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_ROOMASSIGNMENT_RULES.F_CHECK_CAPACITY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_BLDG_CODE", pBldgCode);
			cmd.addParameter("@P_ROOM_NUMBER", pRoomNumber);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BEGIN_DATE", pBeginDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_ASCD_CODE", pAscdCode);
			cmd.addParameter("@P_OVERLOAD_IND", pOverloadInd);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCheckRestrictions(NString pBldgCode,NString pRoomNumber,NString pTermCode,NNumber pPidm,NString pOverrideError,NString pRmapTermCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_ROOMASSIGNMENT_RULES.F_CHECK_RESTRICTIONS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_BLDG_CODE", pBldgCode);
			cmd.addParameter("@P_ROOM_NUMBER", pRoomNumber);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_OVERRIDE_ERROR", pOverrideError);
			cmd.addParameter("@P_RMAP_TERM_CODE", pRmapTermCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCheckRoom(NString pBldgCode,NString pRoomNumber,NString pTermCode,NNumber pPidm,NDate pBeginDate,NDate pEndDate,NString pSex) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_ROOMASSIGNMENT_RULES.F_CHECK_ROOM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_BLDG_CODE", pBldgCode);
			cmd.addParameter("@P_ROOM_NUMBER", pRoomNumber);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BEGIN_DATE", pBeginDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_SEX", pSex);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_ROOMASSIGNMENT_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pPidm,NString pBldgCode,NString pRoomNumber,NString pTermCode,NString pRrcdCode,NDate pBeginDate,NDate pEndDate,NNumber pTotalDays,NNumber pTotalMonths,NNumber pTotalTerms,NString pAscdCode,NDate pAscdDate,NString pOnlOrBat,NString pArInd,NString pOverloadInd,NString pRollInd,NString pOverrideError,NString pAssessNeeded,NString pDataOrigin,NString pUserId,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_ROOMASSIGNMENT_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BLDG_CODE", pBldgCode);
			cmd.addParameter("@P_ROOM_NUMBER", pRoomNumber);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_RRCD_CODE", pRrcdCode);
			cmd.addParameter("@P_BEGIN_DATE", pBeginDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_TOTAL_DAYS", pTotalDays);
			cmd.addParameter("@P_TOTAL_MONTHS", pTotalMonths);
			cmd.addParameter("@P_TOTAL_TERMS", pTotalTerms);
			cmd.addParameter("@P_ASCD_CODE", pAscdCode);
			cmd.addParameter("@P_ASCD_DATE", pAscdDate);
			cmd.addParameter("@P_ONL_OR_BAT", pOnlOrBat);
			cmd.addParameter("@P_AR_IND", pArInd);
			cmd.addParameter("@P_OVERLOAD_IND", pOverloadInd);
			cmd.addParameter("@P_ROLL_IND", pRollInd);
			cmd.addParameter("@P_OVERRIDE_ERROR", pOverrideError);
			cmd.addParameter("@P_ASSESS_NEEDED", pAssessNeeded);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pPidm,NString pBldgCode,NString pRoomNumber,NString pTermCode,NString pRrcdCode,NDate pBeginDate,NDate pEndDate,NNumber pTotalDays,NNumber pTotalMonths,NNumber pTotalTerms,NString pAscdCode,NDate pAscdDate,NString pOnlOrBat,NString pArInd,NString pOverloadInd,NString pRollInd,NString pOverrideError,NString pAssessNeeded,NString pDataOrigin,NString pUserId,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_ROOMASSIGNMENT_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BLDG_CODE", pBldgCode);
			cmd.addParameter("@P_ROOM_NUMBER", pRoomNumber);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_RRCD_CODE", pRrcdCode);
			cmd.addParameter("@P_BEGIN_DATE", pBeginDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_TOTAL_DAYS", pTotalDays);
			cmd.addParameter("@P_TOTAL_MONTHS", pTotalMonths);
			cmd.addParameter("@P_TOTAL_TERMS", pTotalTerms);
			cmd.addParameter("@P_ASCD_CODE", pAscdCode);
			cmd.addParameter("@P_ASCD_DATE", pAscdDate);
			cmd.addParameter("@P_ONL_OR_BAT", pOnlOrBat);
			cmd.addParameter("@P_AR_IND", pArInd);
			cmd.addParameter("@P_OVERLOAD_IND", pOverloadInd);
			cmd.addParameter("@P_ROLL_IND", pRollInd);
			cmd.addParameter("@P_OVERRIDE_ERROR", pOverrideError);
			cmd.addParameter("@P_ASSESS_NEEDED", pAssessNeeded);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	
}
