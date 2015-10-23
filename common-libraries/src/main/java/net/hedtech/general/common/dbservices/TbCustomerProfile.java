package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class TbCustomerProfile {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_CUSTOMER_PROFILE.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fDefaultAddrExists(NNumber pPidm,Ref<NString> pAtypCodeDefaultOut,Ref<NNumber> pAtypSeqnoDefaultOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_CUSTOMER_PROFILE.F_DEFAULT_ADDR_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ATYP_CODE_DEFAULT_OUT", NString.class);
			cmd.addParameter("@P_ATYP_SEQNO_DEFAULT_OUT", NNumber.class);
				
			cmd.execute();
			pAtypCodeDefaultOut.val = cmd.getParameterValue("@P_ATYP_CODE_DEFAULT_OUT", NString.class);
			pAtypSeqnoDefaultOut.val = cmd.getParameterValue("@P_ATYP_SEQNO_DEFAULT_OUT", NNumber.class);

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fExists(NNumber pPidm,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_CUSTOMER_PROFILE.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fGetCreditLimit(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_CUSTOMER_PROFILE.F_GET_CREDIT_LIMIT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fIsequal(CustomerProfileRecRow recOne,CustomerProfileRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_CUSTOMER_PROFILE.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, CustomerProfileRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, CustomerProfileRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_CUSTOMER_PROFILE.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_CUSTOMER_PROFILE.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_CUSTOMER_PROFILE.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pPidm,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_CUSTOMER_PROFILE.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NNumber pPidm,NNumber pCreditLimit,NString pEcatCode,NString pAtypCodeDefault,NNumber pAtypSeqnoDefault,NString pUserId,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_CUSTOMER_PROFILE.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CREDIT_LIMIT", pCreditLimit);
			cmd.addParameter("@P_ECAT_CODE", pEcatCode);
			cmd.addParameter("@P_ATYP_CODE_DEFAULT", pAtypCodeDefault);
			cmd.addParameter("@P_ATYP_SEQNO_DEFAULT", pAtypSeqnoDefault);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pPidm,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_CUSTOMER_PROFILE.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pPidm,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_CUSTOMER_PROFILE.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pPidm,NNumber pCreditLimit,NString pEcatCode,NString pAtypCodeDefault,NNumber pAtypSeqnoDefault,NString pUserId,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_CUSTOMER_PROFILE.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CREDIT_LIMIT", pCreditLimit);
			cmd.addParameter("@P_ECAT_CODE", pEcatCode);
			cmd.addParameter("@P_ATYP_CODE_DEFAULT", pAtypCodeDefault);
			cmd.addParameter("@P_ATYP_SEQNO_DEFAULT", pAtypSeqnoDefault);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="CustomerProfileRecRow", dataSourceName="CUSTOMER_PROFILE_REC")
	public static class CustomerProfileRecRow
	{
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_CREDIT_LIMIT")
		public NNumber RCreditLimit;
		@DbRecordField(dataSourceName="R_ECAT_CODE")
		public NString REcatCode;
		@DbRecordField(dataSourceName="R_ATYP_CODE_DEFAULT")
		public NString RAtypCodeDefault;
		@DbRecordField(dataSourceName="R_ATYP_SEQNO_DEFAULT")
		public NNumber RAtypSeqnoDefault;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
