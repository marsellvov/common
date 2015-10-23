package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbStudypathName {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_STUDYPATH_NAME.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pSeqno,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_STUDYPATH_NAME.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(StudypathNameRecRow recOne,StudypathNameRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_STUDYPATH_NAME.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, StudypathNameRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, StudypathNameRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fLearnerStudyPathName(NNumber pPidm,NString pTermCodeEff,NNumber pKeySeqno,NNumber pLcurSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_STUDYPATH_NAME.F_LEARNER_STUDY_PATH_NAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_KEY_SEQNO", pKeySeqno);
			cmd.addParameter("@P_LCUR_SEQNO", pLcurSeqno);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_STUDYPATH_NAME.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_SEQNO", pSeqno);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_STUDYPATH_NAME.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_STUDYPATH_NAME.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_SEQNO", pSeqno);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pSeqno,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_STUDYPATH_NAME.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NNumber pSeqno,NString pColumn,NString pSeparatorCde,NString pUser,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_STUDYPATH_NAME.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_COLUMN", pColumn);
			cmd.addParameter("@P_SEPARATOR_CDE", pSeparatorCde);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pSeqno,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_STUDYPATH_NAME.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pSeqno,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_STUDYPATH_NAME.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pSeqno,NString pColumn,NString pSeparatorCde,NString pUser,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_STUDYPATH_NAME.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_COLUMN", pColumn);
			cmd.addParameter("@P_SEPARATOR_CDE", pSeparatorCde);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="StudypathNameRecRow", dataSourceName="STUDYPATH_NAME_REC")
	public static class StudypathNameRecRow
	{
		@DbRecordField(dataSourceName="R_SEQNO")
		public NNumber RSeqno;
		@DbRecordField(dataSourceName="R_COLUMN")
		public NString RColumn;
		@DbRecordField(dataSourceName="R_SEPARATOR_CDE")
		public NString RSeparatorCde;
		@DbRecordField(dataSourceName="R_USER")
		public NString RUser;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
