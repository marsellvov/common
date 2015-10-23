package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GbFlexWkWeekRules {
		public static void pConstraintCheck(NNumber pWeekRef,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_FLEX_WK_WEEK_RULES.P_CONSTRAINT_CHECK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_WEEK_REF", pWeekRef);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_FLEX_WK_WEEK_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pWeekRef,NString pDesc,NNumber pFirstWkndDay,NNumber pSecondWkndDay,NString pInstInd,NString pSysReqInd,NString pUserId,NString pDataOrigin,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_FLEX_WK_WEEK_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_WEEK_REF", pWeekRef);
			cmd.addParameter("@P_DESC", pDesc);
			cmd.addParameter("@P_FIRST_WKND_DAY", pFirstWkndDay);
			cmd.addParameter("@P_SECOND_WKND_DAY", pSecondWkndDay);
			cmd.addParameter("@P_INST_IND", pInstInd);
			cmd.addParameter("@P_SYS_REQ_IND", pSysReqInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pWeekRef,NString pDesc,NNumber pFirstWkndDay,NNumber pSecondWkndDay,NString pInstInd,NString pSysReqInd,NString pUserId,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_FLEX_WK_WEEK_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_WEEK_REF", pWeekRef);
			cmd.addParameter("@P_DESC", pDesc);
			cmd.addParameter("@P_FIRST_WKND_DAY", pFirstWkndDay);
			cmd.addParameter("@P_SECOND_WKND_DAY", pSecondWkndDay);
			cmd.addParameter("@P_INST_IND", pInstInd);
			cmd.addParameter("@P_SYS_REQ_IND", pSysReqInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
	
	
	
}
