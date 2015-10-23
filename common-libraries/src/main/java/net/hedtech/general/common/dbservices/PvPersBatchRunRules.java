package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PvPersBatchRunRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PERS_BATCH_RUN_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pBatch,NDate pReportBeginDate,NDate pReportEndDate,NString pReportType,NString pCreateDataInd,NString pCreateXmlInd,NString pFinalInd,NString pUserId,NString pDataOrigin,NString pTestReportInd,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PERS_BATCH_RUN_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_BATCH", pBatch);
			cmd.addParameter("@P_REPORT_BEGIN_DATE", pReportBeginDate);
			cmd.addParameter("@P_REPORT_END_DATE", pReportEndDate);
			cmd.addParameter("@P_REPORT_TYPE", pReportType);
			cmd.addParameter("@P_CREATE_DATA_IND", pCreateDataInd);
			cmd.addParameter("@P_CREATE_XML_IND", pCreateXmlInd);
			cmd.addParameter("@P_FINAL_IND", pFinalInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_TEST_REPORT_IND", pTestReportInd);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pBatch,NDate pReportBeginDate,NDate pReportEndDate,NString pReportType,NString pCreateDataInd,NString pCreateXmlInd,NString pFinalInd,NString pUserId,NString pDataOrigin,NString pTestReportInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PERS_BATCH_RUN_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_BATCH", pBatch);
			cmd.addParameter("@P_REPORT_BEGIN_DATE", pReportBeginDate);
			cmd.addParameter("@P_REPORT_END_DATE", pReportEndDate);
			cmd.addParameter("@P_REPORT_TYPE", pReportType);
			cmd.addParameter("@P_CREATE_DATA_IND", pCreateDataInd);
			cmd.addParameter("@P_CREATE_XML_IND", pCreateXmlInd);
			cmd.addParameter("@P_FINAL_IND", pFinalInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_TEST_REPORT_IND", pTestReportInd);
				
			cmd.execute();


		}
		
	
	
	
}
