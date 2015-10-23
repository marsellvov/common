package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RpRequirement {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RP_REQUIREMENT.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pPidm,NString pAidyCode,NString pTreqCode,NString pFundCode,NString pTreqDesc,NString pSbgiCode,NString pSbgiTypeInd,NString pPeriod,NString pTermCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RP_REQUIREMENT.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_TREQ_CODE", pTreqCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_TREQ_DESC", pTreqDesc);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_SBGI_TYPE_IND", pSbgiTypeInd);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fExists(NNumber pPidm,NString pAidyCode,NString pTreqCode,NString pFundCode,NString pTreqDesc,NString pSbgiCode,NString pSbgiTypeInd,NString pTermCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RP_REQUIREMENT.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_TREQ_CODE", pTreqCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_TREQ_DESC", pTreqDesc);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_SBGI_TYPE_IND", pSbgiTypeInd);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fExists(NNumber pPidm,NString pAidyCode,NString pTreqCode,NString pFundCode,NString pTreqDesc,NString pSbgiCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RP_REQUIREMENT.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_TREQ_CODE", pTreqCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_TREQ_DESC", pTreqDesc);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pPidm,NString pAidyCode,NString pTreqCode,NString pFundCode,NString pTreqDesc,NString pSbgiCode,NString pSbgiTypeInd,NString pPeriod,NString pTermCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RP_REQUIREMENT.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_TREQ_CODE", pTreqCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_TREQ_DESC", pTreqDesc);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_SBGI_TYPE_IND", pSbgiTypeInd);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryAll(NNumber pPidm,NString pAidyCode,NString pTreqCode,NString pFundCode,NString pTreqDesc,NString pSbgiCode,NString pSbgiTypeInd,NString pTermCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RP_REQUIREMENT.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_TREQ_CODE", pTreqCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_TREQ_DESC", pTreqDesc);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_SBGI_TYPE_IND", pSbgiTypeInd);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryAll(NNumber pPidm,NString pAidyCode,NString pTreqCode,NString pFundCode,NString pTreqDesc,NString pSbgiCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RP_REQUIREMENT.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_TREQ_CODE", pTreqCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_TREQ_DESC", pTreqDesc);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPidm,NString pAidyCode,NString pTreqCode,NString pFundCode,NString pTreqDesc,NString pSbgiCode,NString pSbgiTypeInd,NString pPeriod,NString pTermCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RP_REQUIREMENT.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_TREQ_CODE", pTreqCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_TREQ_DESC", pTreqDesc);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_SBGI_TYPE_IND", pSbgiTypeInd);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPidm,NString pAidyCode,NString pTreqCode,NString pFundCode,NString pTreqDesc,NString pSbgiCode,NString pSbgiTypeInd,NString pTermCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RP_REQUIREMENT.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_TREQ_CODE", pTreqCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_TREQ_DESC", pTreqDesc);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_SBGI_TYPE_IND", pSbgiTypeInd);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPidm,NString pAidyCode,NString pTreqCode,NString pFundCode,NString pTreqDesc,NString pSbgiCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RP_REQUIREMENT.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_TREQ_CODE", pTreqCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_TREQ_DESC", pTreqDesc);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pAidyCode,NNumber pPidm,NString pTreqCode,NDate pStatDate,NString pTrstCode,NString pFundCode,NString pSysInd,NString pSbgiCode,NString pSbgiTypeInd,NString pPeriod,NString pTermCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RP_REQUIREMENT.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TREQ_CODE", pTreqCode);
			cmd.addParameter("@P_STAT_DATE", pStatDate);
			cmd.addParameter("@P_TRST_CODE", pTrstCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_SYS_IND", pSysInd);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_SBGI_TYPE_IND", pSbgiTypeInd);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
				
			cmd.execute();


		}
		
		public static void pCreate(NString pAidyCode,NNumber pPidm,NString pTreqCode,NDate pStatDate,NString pTrstCode,NString pFundCode,NString pSysInd,NString pSbgiCode,NString pSbgiTypeInd,NString pTermCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RP_REQUIREMENT.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TREQ_CODE", pTreqCode);
			cmd.addParameter("@P_STAT_DATE", pStatDate);
			cmd.addParameter("@P_TRST_CODE", pTrstCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_SYS_IND", pSysInd);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_SBGI_TYPE_IND", pSbgiTypeInd);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
				
			cmd.execute();


		}
		
		public static void pCreate(NString pAidyCode,NNumber pPidm,NString pTreqCode,NDate pStatDate,NString pTrstCode,NString pFundCode,NString pSysInd,NString pSbgiCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RP_REQUIREMENT.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TREQ_CODE", pTreqCode);
			cmd.addParameter("@P_STAT_DATE", pStatDate);
			cmd.addParameter("@P_TRST_CODE", pTrstCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_SYS_IND", pSysInd);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
				
			cmd.execute();


		}
		
		public static void pDelete(NNumber pPidm,NString pAidyCode,NString pTreqCode,NString pFundCode,NString pSbgiCode,NString pSbgiTypeInd,NString pPeriod,NString pTermCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RP_REQUIREMENT.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_TREQ_CODE", pTreqCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_SBGI_TYPE_IND", pSbgiTypeInd);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
				
			cmd.execute();


		}
		
		public static void pDelete(NNumber pPidm,NString pAidyCode,NString pTreqCode,NString pFundCode,NString pSbgiCode,NString pSbgiTypeInd,NString pTermCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RP_REQUIREMENT.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_TREQ_CODE", pTreqCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_SBGI_TYPE_IND", pSbgiTypeInd);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
				
			cmd.execute();


		}
		
		public static void pDelete(NNumber pPidm,NString pAidyCode,NString pTreqCode,NString pFundCode,NString pSbgiCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RP_REQUIREMENT.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_TREQ_CODE", pTreqCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
				
			cmd.execute();


		}
		
		public static void pUpdate(NString pAidyCode,NNumber pPidm,NString pTreqCode,NDate pStatDate,NString pTrstCode,NString pFundCode,NString pSysInd,NString pSbgiCode,NString pSbgiTypeInd,NString pPeriod,NString pTermCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RP_REQUIREMENT.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TREQ_CODE", pTreqCode);
			cmd.addParameter("@P_STAT_DATE", pStatDate);
			cmd.addParameter("@P_TRST_CODE", pTrstCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_SYS_IND", pSysInd);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_SBGI_TYPE_IND", pSbgiTypeInd);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
				
			cmd.execute();


		}
		
		public static void pUpdate(NString pAidyCode,NNumber pPidm,NString pTreqCode,NDate pStatDate,NString pTrstCode,NString pFundCode,NString pSysInd,NString pSbgiCode,NString pSbgiTypeInd,NString pTermCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RP_REQUIREMENT.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TREQ_CODE", pTreqCode);
			cmd.addParameter("@P_STAT_DATE", pStatDate);
			cmd.addParameter("@P_TRST_CODE", pTrstCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_SYS_IND", pSysInd);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_SBGI_TYPE_IND", pSbgiTypeInd);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
				
			cmd.execute();


		}
		
		public static void pUpdate(NString pAidyCode,NNumber pPidm,NString pTreqCode,NDate pStatDate,NString pTrstCode,NString pFundCode,NString pSysInd,NString pSbgiCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RP_REQUIREMENT.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TREQ_CODE", pTreqCode);
			cmd.addParameter("@P_STAT_DATE", pStatDate);
			cmd.addParameter("@P_TRST_CODE", pTrstCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_SYS_IND", pSysInd);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
				
			cmd.execute();


		}
		
	
	
	
}
