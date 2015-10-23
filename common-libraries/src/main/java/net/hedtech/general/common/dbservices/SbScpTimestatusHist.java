package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbScpTimestatusHist {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SCP_TIMESTATUS_HIST.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SCP_TIMESTATUS_HIST.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(ScpTimestatusHistRecRow recOne,ScpTimestatusHistRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SCP_TIMESTATUS_HIST.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, ScpTimestatusHistRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, ScpTimestatusHistRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pPidm,NString pScpsCode,NString pTmstCode,NDate pTmstDate,NString pTmstMaintInd,NString pUser) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SCP_TIMESTATUS_HIST.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SCPS_CODE", pScpsCode);
			cmd.addParameter("@P_TMST_CODE", pTmstCode);
			cmd.addParameter("@P_TMST_DATE", pTmstDate);
			cmd.addParameter("@P_TMST_MAINT_IND", pTmstMaintInd);
			cmd.addParameter("@P_USER", pUser);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SCP_TIMESTATUS_HIST.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPidm,NString pScpsCode,NString pTmstCode,NDate pTmstDate,NString pTmstMaintInd,NString pUser) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SCP_TIMESTATUS_HIST.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SCPS_CODE", pScpsCode);
			cmd.addParameter("@P_TMST_CODE", pTmstCode);
			cmd.addParameter("@P_TMST_DATE", pTmstDate);
			cmd.addParameter("@P_TMST_MAINT_IND", pTmstMaintInd);
			cmd.addParameter("@P_USER", pUser);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pPidm,NString pScpsCode,NString pTmstCode,NDate pTmstDate,NString pTmstMaintInd,NString pUser,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SCP_TIMESTATUS_HIST.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SCPS_CODE", pScpsCode);
			cmd.addParameter("@P_TMST_CODE", pTmstCode);
			cmd.addParameter("@P_TMST_DATE", pTmstDate);
			cmd.addParameter("@P_TMST_MAINT_IND", pTmstMaintInd);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NNumber pPidm,NString pScpsCode,NString pTmstCode,NDate pTmstDate,NString pTmstMaintInd,NString pUser,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SCP_TIMESTATUS_HIST.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SCPS_CODE", pScpsCode);
			cmd.addParameter("@P_TMST_CODE", pTmstCode);
			cmd.addParameter("@P_TMST_DATE", pTmstDate);
			cmd.addParameter("@P_TMST_MAINT_IND", pTmstMaintInd);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pPidm,NString pScpsCode,NString pTmstCode,NDate pTmstDate,NString pTmstMaintInd,NString pUser,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SCP_TIMESTATUS_HIST.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SCPS_CODE", pScpsCode);
			cmd.addParameter("@P_TMST_CODE", pTmstCode);
			cmd.addParameter("@P_TMST_DATE", pTmstDate);
			cmd.addParameter("@P_TMST_MAINT_IND", pTmstMaintInd);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SCP_TIMESTATUS_HIST.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pPidm,NString pScpsCode,NString pTmstCode,NDate pTmstDate,NString pTmstMaintInd,NString pUser,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SCP_TIMESTATUS_HIST.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SCPS_CODE", pScpsCode);
			cmd.addParameter("@P_TMST_CODE", pTmstCode);
			cmd.addParameter("@P_TMST_DATE", pTmstDate);
			cmd.addParameter("@P_TMST_MAINT_IND", pTmstMaintInd);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="ScpTimestatusHistRecRow", dataSourceName="SCP_TIMESTATUS_HIST_REC")
	public static class ScpTimestatusHistRecRow
	{
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_SCPS_CODE")
		public NString RScpsCode;
		@DbRecordField(dataSourceName="R_TMST_CODE")
		public NString RTmstCode;
		@DbRecordField(dataSourceName="R_TMST_DATE")
		public NDate RTmstDate;
		@DbRecordField(dataSourceName="R_TMST_MAINT_IND")
		public NString RTmstMaintInd;
		@DbRecordField(dataSourceName="R_USER")
		public NString RUser;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
