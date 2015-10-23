package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GbBusProfRuleRules {
		public static NString fParentExists(NString pFgacCode,NString pFdmnCode,NNumber pFprdSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_BUS_PROF_RULE_RULES.F_PARENT_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_FGAC_CODE", pFgacCode);
			cmd.addParameter("@P_FDMN_CODE", pFdmnCode);
			cmd.addParameter("@P_FPRD_SEQNO", pFprdSeqno);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_BUS_PROF_RULE_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pFgacCode,NString pFdmnCode,NNumber pFprdSeqno,NString pFbprCode,NString pSelectInd,NString pInsertInd,NString pUpdateInd,NString pDeleteInd,NString pUserId,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_BUS_PROF_RULE_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_FGAC_CODE", pFgacCode);
			cmd.addParameter("@P_FDMN_CODE", pFdmnCode);
			cmd.addParameter("@P_FPRD_SEQNO", pFprdSeqno);
			cmd.addParameter("@P_FBPR_CODE", pFbprCode);
			cmd.addParameter("@P_SELECT_IND", pSelectInd);
			cmd.addParameter("@P_INSERT_IND", pInsertInd);
			cmd.addParameter("@P_UPDATE_IND", pUpdateInd);
			cmd.addParameter("@P_DELETE_IND", pDeleteInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pFgacCode,NString pFdmnCode,NNumber pFprdSeqno,NString pFbprCode,NString pSelectInd,NString pInsertInd,NString pUpdateInd,NString pDeleteInd,NString pUserId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_BUS_PROF_RULE_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FGAC_CODE", pFgacCode);
			cmd.addParameter("@P_FDMN_CODE", pFdmnCode);
			cmd.addParameter("@P_FPRD_SEQNO", pFprdSeqno);
			cmd.addParameter("@P_FBPR_CODE", pFbprCode);
			cmd.addParameter("@P_SELECT_IND", pSelectInd);
			cmd.addParameter("@P_INSERT_IND", pInsertInd);
			cmd.addParameter("@P_UPDATE_IND", pUpdateInd);
			cmd.addParameter("@P_DELETE_IND", pDeleteInd);
			cmd.addParameter("@P_USER_ID", pUserId);
				
			cmd.execute();


		}
		
	
	
	
}
