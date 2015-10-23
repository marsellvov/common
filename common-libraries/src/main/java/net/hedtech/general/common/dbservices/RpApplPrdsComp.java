package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RpApplPrdsComp {
		public static NString fExists(NString pAidyCode,NNumber pPidm,NString pRunName,NString pPbtpCode,NString pPeriod,NString pPbcpCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RP_APPL_PRDS_COMP.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_RUN_NAME", pRunName);
			cmd.addParameter("@P_PBTP_CODE", pPbtpCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_PBCP_CODE", pPbcpCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pAidyCode,NNumber pPidm,NString pRunName,NString pPbtpCode,NString pPeriod,NString pPbcpCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RP_APPL_PRDS_COMP.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_RUN_NAME", pRunName);
			cmd.addParameter("@P_PBTP_CODE", pPbtpCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_PBCP_CODE", pPbcpCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pAidyCode,NNumber pPidm,NString pRunName,NString pPbtpCode,NString pPeriod,NString pPbcpCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RP_APPL_PRDS_COMP.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_RUN_NAME", pRunName);
			cmd.addParameter("@P_PBTP_CODE", pPbtpCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_PBCP_CODE", pPbcpCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pAidyCode,NNumber pPidm,NString pRunName,NString pPbtpCode,NString pPeriod,NString pPbcpCode,NNumber pAmt,NString pSysInd,NString pAbrcCode,NNumber pSeqNo,NString pUserId,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RP_APPL_PRDS_COMP.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_RUN_NAME", pRunName);
			cmd.addParameter("@P_PBTP_CODE", pPbtpCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_PBCP_CODE", pPbcpCode);
			cmd.addParameter("@P_AMT", pAmt);
			cmd.addParameter("@P_SYS_IND", pSysInd);
			cmd.addParameter("@P_ABRC_CODE", pAbrcCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
		public static void pDelete(NString pAidyCode,NNumber pPidm,NString pRunName,NString pPbtpCode,NString pPeriod,NString pPbcpCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RP_APPL_PRDS_COMP.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_RUN_NAME", pRunName);
			cmd.addParameter("@P_PBTP_CODE", pPbtpCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_PBCP_CODE", pPbcpCode);
				
			cmd.execute();


		}
		
		public static void pUpdate(NString pAidyCode,NNumber pPidm,NString pRunName,NString pPbtpCode,NString pPeriod,NString pPbcpCode,NNumber pAmt,NString pSysInd,NString pAbrcCode,NNumber pSeqNo,NString pUserId,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RP_APPL_PRDS_COMP.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_RUN_NAME", pRunName);
			cmd.addParameter("@P_PBTP_CODE", pPbtpCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_PBCP_CODE", pPbcpCode);
			cmd.addParameter("@P_AMT", pAmt);
			cmd.addParameter("@P_SYS_IND", pSysInd);
			cmd.addParameter("@P_ABRC_CODE", pAbrcCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
	
	
	
}
