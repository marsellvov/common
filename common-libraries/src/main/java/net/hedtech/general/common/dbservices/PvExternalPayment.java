package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PvExternalPayment {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_EXTERNAL_PAYMENT.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pPidm,NString pYear,NString pRuc,NDate pEmissionDate,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_EXTERNAL_PAYMENT.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_RUC", pRuc);
			cmd.addParameter("@P_EMISSION_DATE", pEmissionDate);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(ExternalPaymentRecRow recOne,ExternalPaymentRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_EXTERNAL_PAYMENT.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, ExternalPaymentRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, ExternalPaymentRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pPidm,NString pYear,NString pRuc,NDate pEmissionDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_EXTERNAL_PAYMENT.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_RUC", pRuc);
			cmd.addParameter("@P_EMISSION_DATE", pEmissionDate);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_EXTERNAL_PAYMENT.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPidm,NString pYear,NString pRuc,NDate pEmissionDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_EXTERNAL_PAYMENT.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_RUC", pRuc);
			cmd.addParameter("@P_EMISSION_DATE", pEmissionDate);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pPidm,NString pYear,NString pRuc,NDate pEmissionDate,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_EXTERNAL_PAYMENT.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_RUC", pRuc);
			cmd.addParameter("@P_EMISSION_DATE", pEmissionDate);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NNumber pPidm,NString pYear,NString pRuc,NDate pEmissionDate,NNumber pApplGrs,NNumber pEmplAmt,NString pCompany,NDate pFrom,NDate pTo,NString pComment,NString pUserId,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_EXTERNAL_PAYMENT.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_RUC", pRuc);
			cmd.addParameter("@P_EMISSION_DATE", pEmissionDate);
			cmd.addParameter("@P_APPL_GRS", pApplGrs);
			cmd.addParameter("@P_EMPL_AMT", pEmplAmt);
			cmd.addParameter("@P_COMPANY", pCompany);
			cmd.addParameter("@P_FROM", pFrom);
			cmd.addParameter("@P_TO", pTo);
			cmd.addParameter("@P_COMMENT", pComment);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pPidm,NString pYear,NString pRuc,NDate pEmissionDate,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_EXTERNAL_PAYMENT.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_RUC", pRuc);
			cmd.addParameter("@P_EMISSION_DATE", pEmissionDate);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pPidm,NString pYear,NString pRuc,NDate pEmissionDate,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_EXTERNAL_PAYMENT.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_RUC", pRuc);
			cmd.addParameter("@P_EMISSION_DATE", pEmissionDate);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pPidm,NString pYear,NString pRuc,NDate pEmissionDate,NNumber pApplGrs,NNumber pEmplAmt,NString pCompany,NDate pFrom,NDate pTo,NString pComment,NString pUserId,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_EXTERNAL_PAYMENT.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_RUC", pRuc);
			cmd.addParameter("@P_EMISSION_DATE", pEmissionDate);
			cmd.addParameter("@P_APPL_GRS", pApplGrs);
			cmd.addParameter("@P_EMPL_AMT", pEmplAmt);
			cmd.addParameter("@P_COMPANY", pCompany);
			cmd.addParameter("@P_FROM", pFrom);
			cmd.addParameter("@P_TO", pTo);
			cmd.addParameter("@P_COMMENT", pComment);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	@DbRecordType(id="ExternalPaymentRecRow", dataSourceName="EXTERNAL_PAYMENT_REC", needsInitialization=true)
	public static class ExternalPaymentRecRow
	{
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_YEAR")
		public NString RYear;
		@DbRecordField(dataSourceName="R_RUC")
		public NString RRuc;
		@DbRecordField(dataSourceName="R_EMISSION_DATE")
		public NDate REmissionDate;
		@DbRecordField(dataSourceName="R_APPL_GRS")
		public NNumber RApplGrs;
		@DbRecordField(dataSourceName="R_EMPL_AMT")
		public NNumber REmplAmt;
		@DbRecordField(dataSourceName="R_COMPANY")
		public NString RCompany;
		@DbRecordField(dataSourceName="R_FROM")
		public NDate RFrom;
		@DbRecordField(dataSourceName="R_TO")
		public NDate RTo;
		@DbRecordField(dataSourceName="R_COMMENT")
		public NString RComment;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
