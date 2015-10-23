package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbFeedbackSession {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FEEDBACK_SESSION.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pSurrogateId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FEEDBACK_SESSION.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SURROGATE_ID", pSurrogateId);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fExists(NString pTermCode,NString pDescription) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FEEDBACK_SESSION.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_DESCRIPTION", pDescription);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fFeedbackExists(NNumber pSessionId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FEEDBACK_SESSION.F_FEEDBACK_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SESSION_ID", pSessionId);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(FeedbackSessionRecRow recOne,FeedbackSessionRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FEEDBACK_SESSION.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, FeedbackSessionRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, FeedbackSessionRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static List<FeedbackSessionTabRow> fQueryAll() {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FEEDBACK_SESSION.F_QUERY_ALL", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<FeedbackSessionTabRow>.class);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<FeedbackSessionTabRow>.class);
//
//		}
		
		public static FeedbackSessionRecRow fQueryOne(NString pTermCode,NString pDescription) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FEEDBACK_SESSION.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DbTypes.createStructType(FeedbackSessionRecRow.class));
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_DESCRIPTION", pDescription);
				
			cmd.execute();

			return cmd.getReturnValue(FeedbackSessionRecRow.class);

		}
		
		public static FeedbackSessionRecRow fQueryOne(NNumber pSurrogateId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FEEDBACK_SESSION.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DbTypes.createStructType(FeedbackSessionRecRow.class));
			cmd.addParameter("@P_SURROGATE_ID", pSurrogateId);
				
			cmd.execute();

			return cmd.getReturnValue(FeedbackSessionRecRow.class);

		}
		
		public static void pCreate(Ref<NNumber> pSurrogateIdOut,NString pTermCode,NString pDescription,NString pSuspendFeedbackInd,NDate pStartDate,NDate pEndDate,NString pAddCommentsFlag,NString pAddRecommendsFlag,NString pDataOrigin,NString pUserId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FEEDBACK_SESSION.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SURROGATE_ID_OUT", NNumber.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_DESCRIPTION", pDescription);
			cmd.addParameter("@P_SUSPEND_FEEDBACK_IND", pSuspendFeedbackInd);
			cmd.addParameter("@P_START_DATE", pStartDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_ADD_COMMENTS_FLAG", pAddCommentsFlag);
			cmd.addParameter("@P_ADD_RECOMMENDS_FLAG", pAddRecommendsFlag);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
				
			cmd.execute();
			pSurrogateIdOut.val = cmd.getParameterValue("@P_SURROGATE_ID_OUT", NNumber.class);


		}
		
		public static void pDelete(NNumber pSurrogateId,NNumber pVersion) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FEEDBACK_SESSION.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SURROGATE_ID", pSurrogateId);
			cmd.addParameter("@P_VERSION", pVersion);
				
			cmd.execute();


		}
		
		public static void pPurge(NString pTermCode,NString pDescription) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FEEDBACK_SESSION.P_PURGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_DESCRIPTION", pDescription);
				
			cmd.execute();


		}
		
		public static void pUpdate(NNumber pSurrogateId,NString pTermCode,NString pDescription,NString pSuspendFeedbackInd,NDate pStartDate,NDate pEndDate,NString pAddCommentsFlag,NString pAddRecommendsFlag,NNumber pVersion,NString pDataOrigin,NString pUserId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FEEDBACK_SESSION.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SURROGATE_ID", pSurrogateId);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_DESCRIPTION", pDescription);
			cmd.addParameter("@P_SUSPEND_FEEDBACK_IND", pSuspendFeedbackInd);
			cmd.addParameter("@P_START_DATE", pStartDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_ADD_COMMENTS_FLAG", pAddCommentsFlag);
			cmd.addParameter("@P_ADD_RECOMMENDS_FLAG", pAddRecommendsFlag);
			cmd.addParameter("@P_VERSION", pVersion);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="FeedbackSessionRecRow", dataSourceName="FEEDBACK_SESSION_REC")
	public static class FeedbackSessionRecRow
	{
		@DbRecordField(dataSourceName="R_SURROGATE_ID")
		public NNumber RSurrogateId;
		@DbRecordField(dataSourceName="R_TERM_CODE")
		public NString RTermCode;
		@DbRecordField(dataSourceName="R_DESCRIPTION")
		public NString RDescription;
		@DbRecordField(dataSourceName="R_SUSPEND_FEEDBACK_IND")
		public NString RSuspendFeedbackInd;
		@DbRecordField(dataSourceName="R_START_DATE")
		public NDate RStartDate;
		@DbRecordField(dataSourceName="R_END_DATE")
		public NDate REndDate;
		@DbRecordField(dataSourceName="R_ADD_COMMENTS_FLAG")
		public NString RAddCommentsFlag;
		@DbRecordField(dataSourceName="R_ADD_RECOMMENDS_FLAG")
		public NString RAddRecommendsFlag;
		@DbRecordField(dataSourceName="R_VERSION")
		public NNumber RVersion;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_ACTIVITY_DATE")
		public NDate RActivityDate;
	}

	
	
}
