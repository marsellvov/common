package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GbVbsPredicateRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_VBS_PREDICATE_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pFgacCode,NString pFdmnCode,NNumber pSeqno,NString pUserId,NString pPredicate,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_VBS_PREDICATE_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_FGAC_CODE", pFgacCode);
			cmd.addParameter("@P_FDMN_CODE", pFdmnCode);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_PREDICATE", pPredicate);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pFgacCode,NString pFdmnCode,NNumber pSeqno,NString pUserId,NString pPredicate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_VBS_PREDICATE_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FGAC_CODE", pFgacCode);
			cmd.addParameter("@P_FDMN_CODE", pFdmnCode);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_PREDICATE", pPredicate);
				
			cmd.execute();


		}
		
	
	
	
}
