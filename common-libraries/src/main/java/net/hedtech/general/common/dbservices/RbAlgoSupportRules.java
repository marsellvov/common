package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RbAlgoSupportRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_ALGO_SUPPORT_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pAidyCode,NNumber pAmt,NString pKey1,NString pKey2,NString pKey3,NString pKey4,NString pKey5,NString pKey6,NString pKey7,NString pKey8,NString pKey9,NString pKey10,NString pKey11,NString pKey12,NString pComment1,NString pComment2,NString pComment3,NString pComment4,NString pComment5,NString pComment6,NString pComment7,NString pComment8,NString pComment9,NString pComment10,NString pComment11,NString pComment12,NString pComment,NString pUserId,NString pDataOrigin,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_ALGO_SUPPORT_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_AMT", pAmt);
			cmd.addParameter("@P_KEY_1", pKey1);
			cmd.addParameter("@P_KEY_2", pKey2);
			cmd.addParameter("@P_KEY_3", pKey3);
			cmd.addParameter("@P_KEY_4", pKey4);
			cmd.addParameter("@P_KEY_5", pKey5);
			cmd.addParameter("@P_KEY_6", pKey6);
			cmd.addParameter("@P_KEY_7", pKey7);
			cmd.addParameter("@P_KEY_8", pKey8);
			cmd.addParameter("@P_KEY_9", pKey9);
			cmd.addParameter("@P_KEY_10", pKey10);
			cmd.addParameter("@P_KEY_11", pKey11);
			cmd.addParameter("@P_KEY_12", pKey12);
			cmd.addParameter("@P_COMMENT_1", pComment1);
			cmd.addParameter("@P_COMMENT_2", pComment2);
			cmd.addParameter("@P_COMMENT_3", pComment3);
			cmd.addParameter("@P_COMMENT_4", pComment4);
			cmd.addParameter("@P_COMMENT_5", pComment5);
			cmd.addParameter("@P_COMMENT_6", pComment6);
			cmd.addParameter("@P_COMMENT_7", pComment7);
			cmd.addParameter("@P_COMMENT_8", pComment8);
			cmd.addParameter("@P_COMMENT_9", pComment9);
			cmd.addParameter("@P_COMMENT_10", pComment10);
			cmd.addParameter("@P_COMMENT_11", pComment11);
			cmd.addParameter("@P_COMMENT_12", pComment12);
			cmd.addParameter("@P_COMMENT", pComment);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pAidyCode,NNumber pAmt,NString pKey1,NString pKey2,NString pKey3,NString pKey4,NString pKey5,NString pKey6,NString pKey7,NString pKey8,NString pKey9,NString pKey10,NString pKey11,NString pKey12,NString pComment1,NString pComment2,NString pComment3,NString pComment4,NString pComment5,NString pComment6,NString pComment7,NString pComment8,NString pComment9,NString pComment10,NString pComment11,NString pComment12,NString pComment,NString pUserId,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_ALGO_SUPPORT_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_AMT", pAmt);
			cmd.addParameter("@P_KEY_1", pKey1);
			cmd.addParameter("@P_KEY_2", pKey2);
			cmd.addParameter("@P_KEY_3", pKey3);
			cmd.addParameter("@P_KEY_4", pKey4);
			cmd.addParameter("@P_KEY_5", pKey5);
			cmd.addParameter("@P_KEY_6", pKey6);
			cmd.addParameter("@P_KEY_7", pKey7);
			cmd.addParameter("@P_KEY_8", pKey8);
			cmd.addParameter("@P_KEY_9", pKey9);
			cmd.addParameter("@P_KEY_10", pKey10);
			cmd.addParameter("@P_KEY_11", pKey11);
			cmd.addParameter("@P_KEY_12", pKey12);
			cmd.addParameter("@P_COMMENT_1", pComment1);
			cmd.addParameter("@P_COMMENT_2", pComment2);
			cmd.addParameter("@P_COMMENT_3", pComment3);
			cmd.addParameter("@P_COMMENT_4", pComment4);
			cmd.addParameter("@P_COMMENT_5", pComment5);
			cmd.addParameter("@P_COMMENT_6", pComment6);
			cmd.addParameter("@P_COMMENT_7", pComment7);
			cmd.addParameter("@P_COMMENT_8", pComment8);
			cmd.addParameter("@P_COMMENT_9", pComment9);
			cmd.addParameter("@P_COMMENT_10", pComment10);
			cmd.addParameter("@P_COMMENT_11", pComment11);
			cmd.addParameter("@P_COMMENT_12", pComment12);
			cmd.addParameter("@P_COMMENT", pComment);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
	
	
	
}
