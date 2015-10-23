package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbStudypathEnrollmentRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_STUDYPATH_ENROLLMENT_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pTermCode,NNumber pPidm,NNumber pKeySeqno,NString pEstsCode,NDate pEstsDate,NDate pAddDate,NString pUser,NString pDataOrigin,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_STUDYPATH_ENROLLMENT_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_KEY_SEQNO", pKeySeqno);
			cmd.addParameter("@P_ESTS_CODE", pEstsCode);
			cmd.addParameter("@P_ESTS_DATE", pEstsDate);
			cmd.addParameter("@P_ADD_DATE", pAddDate);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pTermCode,NNumber pPidm,NNumber pKeySeqno,NString pEstsCode,NDate pEstsDate,NDate pAddDate,NString pUser,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_STUDYPATH_ENROLLMENT_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_KEY_SEQNO", pKeySeqno);
			cmd.addParameter("@P_ESTS_CODE", pEstsCode);
			cmd.addParameter("@P_ESTS_DATE", pEstsDate);
			cmd.addParameter("@P_ADD_DATE", pAddDate);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
	
	
	
}
