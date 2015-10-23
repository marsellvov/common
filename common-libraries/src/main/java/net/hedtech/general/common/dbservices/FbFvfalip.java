package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class FbFvfalip {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_FVFALIP.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pVendPidm,NDate pEffDate,NDate pNchgDate,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_FVFALIP.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_VEND_PIDM", pVendPidm);
			cmd.addParameter("@P_EFF_DATE", pEffDate);
			cmd.addParameter("@P_NCHG_DATE", pNchgDate);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(FvfalipRecRow recOne,FvfalipRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_FVFALIP.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, FvfalipRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, FvfalipRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pVendPidm,NDate pEffDate,NDate pNchgDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_FVFALIP.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_VEND_PIDM", pVendPidm);
			cmd.addParameter("@P_EFF_DATE", pEffDate);
			cmd.addParameter("@P_NCHG_DATE", pNchgDate);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_FVFALIP.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pVendPidm,NDate pEffDate,NDate pNchgDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_FVFALIP.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_VEND_PIDM", pVendPidm);
			cmd.addParameter("@P_EFF_DATE", pEffDate);
			cmd.addParameter("@P_NCHG_DATE", pNchgDate);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pVendPidm,NDate pEffDate,NDate pNchgDate,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_FVFALIP.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_VEND_PIDM", pVendPidm);
			cmd.addParameter("@P_EFF_DATE", pEffDate);
			cmd.addParameter("@P_NCHG_DATE", pNchgDate);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NNumber pVendPidm,NDate pEffDate,NDate pTermDate,NDate pNchgDate,NString pTratCode,NNumber pAmtLimit,NString pUserId,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_FVFALIP.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_VEND_PIDM", pVendPidm);
			cmd.addParameter("@P_EFF_DATE", pEffDate);
			cmd.addParameter("@P_TERM_DATE", pTermDate);
			cmd.addParameter("@P_NCHG_DATE", pNchgDate);
			cmd.addParameter("@P_TRAT_CODE", pTratCode);
			cmd.addParameter("@P_AMT_LIMIT", pAmtLimit);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pVendPidm,NDate pEffDate,NDate pNchgDate,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_FVFALIP.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_VEND_PIDM", pVendPidm);
			cmd.addParameter("@P_EFF_DATE", pEffDate);
			cmd.addParameter("@P_NCHG_DATE", pNchgDate);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pVendPidm,NDate pEffDate,NDate pNchgDate,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_FVFALIP.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_VEND_PIDM", pVendPidm);
			cmd.addParameter("@P_EFF_DATE", pEffDate);
			cmd.addParameter("@P_NCHG_DATE", pNchgDate);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pVendPidm,NDate pEffDate,NDate pTermDate,NDate pNchgDate,NString pTratCode,NNumber pAmtLimit,NString pUserId,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_FVFALIP.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_VEND_PIDM", pVendPidm);
			cmd.addParameter("@P_EFF_DATE", pEffDate);
			cmd.addParameter("@P_TERM_DATE", pTermDate);
			cmd.addParameter("@P_NCHG_DATE", pNchgDate);
			cmd.addParameter("@P_TRAT_CODE", pTratCode);
			cmd.addParameter("@P_AMT_LIMIT", pAmtLimit);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	@DbRecordType(id="FvfalipRecRow", dataSourceName="FVFALIP_REC", needsInitialization=true)
	public static class FvfalipRecRow
	{
		@DbRecordField(dataSourceName="R_VEND_PIDM")
		public NNumber RVendPidm;
		@DbRecordField(dataSourceName="R_EFF_DATE")
		public NDate REffDate;
		@DbRecordField(dataSourceName="R_TERM_DATE")
		public NDate RTermDate;
		@DbRecordField(dataSourceName="R_NCHG_DATE")
		public NDate RNchgDate;
		@DbRecordField(dataSourceName="R_TRAT_CODE")
		public NString RTratCode;
		@DbRecordField(dataSourceName="R_AMT_LIMIT")
		public NNumber RAmtLimit;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
