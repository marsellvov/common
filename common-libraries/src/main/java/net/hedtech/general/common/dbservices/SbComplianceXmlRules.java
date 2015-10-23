package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbComplianceXmlRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_COMPLIANCE_XML_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pPidm,NNumber pRequestNo,NString pSessionid,NString pUserId,NString pDataOrigin,NString pProcSessionid,NString pXml,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_COMPLIANCE_XML_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_REQUEST_NO", pRequestNo);
			cmd.addParameter("@P_SESSIONID", pSessionid);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_PROC_SESSIONID", pProcSessionid);
			cmd.addParameter("@P_XML", pXml);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pPidm,NNumber pRequestNo,NString pSessionid,NString pUserId,NString pDataOrigin,NString pProcSessionid,NString pXml) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_COMPLIANCE_XML_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_REQUEST_NO", pRequestNo);
			cmd.addParameter("@P_SESSIONID", pSessionid);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_PROC_SESSIONID", pProcSessionid);
			cmd.addParameter("@P_XML", pXml);
				
			cmd.execute();


		}
		
	
	
	
}
