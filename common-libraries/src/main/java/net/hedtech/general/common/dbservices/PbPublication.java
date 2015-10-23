package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PbPublication {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_PUBLICATION.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_PUBLICATION.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(PublicationRecRow recOne,PublicationRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_PUBLICATION.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, PublicationRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, PublicationRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pPidm,NString pPubtCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_PUBLICATION.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PUBT_CODE", pPubtCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_PUBLICATION.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPidm,NString pPubtCode,NString pTitle,NString pPublisher,NDate pPubDate,NString pIssue,NString pVolume,NString pPages) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_PUBLICATION.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PUBT_CODE", pPubtCode);
			cmd.addParameter("@P_TITLE", pTitle);
			cmd.addParameter("@P_PUBLISHER", pPublisher);
			cmd.addParameter("@P_PUB_DATE", pPubDate);
			cmd.addParameter("@P_ISSUE", pIssue);
			cmd.addParameter("@P_VOLUME", pVolume);
			cmd.addParameter("@P_PAGES", pPages);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_PUBLICATION.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NNumber pPidm,NString pPubtCode,NString pTitle,NString pPublisher,NDate pPubDate,NString pIssue,NString pVolume,NString pPages,NString pDataOrigin,NString pUserId,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_PUBLICATION.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PUBT_CODE", pPubtCode);
			cmd.addParameter("@P_TITLE", pTitle);
			cmd.addParameter("@P_PUBLISHER", pPublisher);
			cmd.addParameter("@P_PUB_DATE", pPubDate);
			cmd.addParameter("@P_ISSUE", pIssue);
			cmd.addParameter("@P_VOLUME", pVolume);
			cmd.addParameter("@P_PAGES", pPages);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_PUBLICATION.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_PUBLICATION.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pPidm,NString pPubtCode,NString pTitle,NString pPublisher,NDate pPubDate,NString pIssue,NString pVolume,NString pPages,NString pDataOrigin,NString pUserId,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_PUBLICATION.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PUBT_CODE", pPubtCode);
			cmd.addParameter("@P_TITLE", pTitle);
			cmd.addParameter("@P_PUBLISHER", pPublisher);
			cmd.addParameter("@P_PUB_DATE", pPubDate);
			cmd.addParameter("@P_ISSUE", pIssue);
			cmd.addParameter("@P_VOLUME", pVolume);
			cmd.addParameter("@P_PAGES", pPages);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="PublicationRecRow", dataSourceName="PUBLICATION_REC")
	public static class PublicationRecRow
	{
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_PUBT_CODE")
		public NString RPubtCode;
		@DbRecordField(dataSourceName="R_TITLE")
		public NString RTitle;
		@DbRecordField(dataSourceName="R_PUBLISHER")
		public NString RPublisher;
		@DbRecordField(dataSourceName="R_PUB_DATE")
		public NDate RPubDate;
		@DbRecordField(dataSourceName="R_ISSUE")
		public NString RIssue;
		@DbRecordField(dataSourceName="R_VOLUME")
		public NString RVolume;
		@DbRecordField(dataSourceName="R_PAGES")
		public NString RPages;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
