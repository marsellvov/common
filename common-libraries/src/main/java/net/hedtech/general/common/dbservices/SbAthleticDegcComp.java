package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbAthleticDegcComp {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ATHLETIC_DEGC_COMP.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pPidm,NNumber pLcurSeqno,NNumber pKeySeqno,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ATHLETIC_DEGC_COMP.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_LCUR_SEQNO", pLcurSeqno);
			cmd.addParameter("@P_KEY_SEQNO", pKeySeqno);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(AthleticDegcCompRecRow recOne,AthleticDegcCompRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ATHLETIC_DEGC_COMP.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, AthleticDegcCompRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, AthleticDegcCompRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pPidm,NNumber pLcurSeqno,NNumber pKeySeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ATHLETIC_DEGC_COMP.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_LCUR_SEQNO", pLcurSeqno);
			cmd.addParameter("@P_KEY_SEQNO", pKeySeqno);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ATHLETIC_DEGC_COMP.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPidm,NNumber pLcurSeqno,NNumber pKeySeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ATHLETIC_DEGC_COMP.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_LCUR_SEQNO", pLcurSeqno);
			cmd.addParameter("@P_KEY_SEQNO", pKeySeqno);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pPidm,NNumber pLcurSeqno,NNumber pKeySeqno,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ATHLETIC_DEGC_COMP.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_LCUR_SEQNO", pLcurSeqno);
			cmd.addParameter("@P_KEY_SEQNO", pKeySeqno);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NNumber pPidm,NString pTermCode,NString pLevlCode,NNumber pLcurSeqno,NNumber pKeySeqno,NString pUserId,NNumber pRequiredHours,NNumber pCompletedHours,NString pDcprCode,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ATHLETIC_DEGC_COMP.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_LEVL_CODE", pLevlCode);
			cmd.addParameter("@P_LCUR_SEQNO", pLcurSeqno);
			cmd.addParameter("@P_KEY_SEQNO", pKeySeqno);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_REQUIRED_HOURS", pRequiredHours);
			cmd.addParameter("@P_COMPLETED_HOURS", pCompletedHours);
			cmd.addParameter("@P_DCPR_CODE", pDcprCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pPidm,NNumber pLcurSeqno,NNumber pKeySeqno,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ATHLETIC_DEGC_COMP.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_LCUR_SEQNO", pLcurSeqno);
			cmd.addParameter("@P_KEY_SEQNO", pKeySeqno);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pPidm,NNumber pLcurSeqno,NNumber pKeySeqno,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ATHLETIC_DEGC_COMP.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_LCUR_SEQNO", pLcurSeqno);
			cmd.addParameter("@P_KEY_SEQNO", pKeySeqno);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pPidm,NString pTermCode,NString pLevlCode,NNumber pLcurSeqno,NNumber pKeySeqno,NString pUserId,NNumber pRequiredHours,NNumber pCompletedHours,NString pDcprCode,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ATHLETIC_DEGC_COMP.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_LEVL_CODE", pLevlCode);
			cmd.addParameter("@P_LCUR_SEQNO", pLcurSeqno);
			cmd.addParameter("@P_KEY_SEQNO", pKeySeqno);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_REQUIRED_HOURS", pRequiredHours);
			cmd.addParameter("@P_COMPLETED_HOURS", pCompletedHours);
			cmd.addParameter("@P_DCPR_CODE", pDcprCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="AthleticDegcCompRecRow", dataSourceName="ATHLETIC_DEGC_COMP_REC")
	public static class AthleticDegcCompRecRow
	{
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_TERM_CODE")
		public NString RTermCode;
		@DbRecordField(dataSourceName="R_LEVL_CODE")
		public NString RLevlCode;
		@DbRecordField(dataSourceName="R_LCUR_SEQNO")
		public NNumber RLcurSeqno;
		@DbRecordField(dataSourceName="R_KEY_SEQNO")
		public NNumber RKeySeqno;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_REQUIRED_HOURS")
		public NNumber RRequiredHours;
		@DbRecordField(dataSourceName="R_COMPLETED_HOURS")
		public NNumber RCompletedHours;
		@DbRecordField(dataSourceName="R_DCPR_CODE")
		public NString RDcprCode;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
