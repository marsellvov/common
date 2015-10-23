package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbFeedbackCodes {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FEEDBACK_CODES.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pSurrogateId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FEEDBACK_CODES.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SURROGATE_ID", pSurrogateId);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fExists(NString pCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FEEDBACK_CODES.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CODE", pCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(FeedbackCodesRecRow recOne,FeedbackCodesRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FEEDBACK_CODES.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, FeedbackCodesRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, FeedbackCodesRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static List<FeedbackCodesTabRow> fQueryAll() {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FEEDBACK_CODES.F_QUERY_ALL", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<FeedbackCodesTabRow>.class);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<FeedbackCodesTabRow>.class);
//
//		}
//		
//		public static List<FeedbackCodesTabRow> fQueryAll(NString pType) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FEEDBACK_CODES.F_QUERY_ALL", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<FeedbackCodesTabRow>.class);
//			cmd.addParameter("@P_TYPE", pType);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<FeedbackCodesTabRow>.class);
//
//		}
		
		public static FeedbackCodesRecRow fQueryOne(NString pCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FEEDBACK_CODES.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DbTypes.createStructType(FeedbackCodesRecRow.class));
			cmd.addParameter("@P_CODE", pCode);
				
			cmd.execute();

			return cmd.getReturnValue(FeedbackCodesRecRow.class);

		}
		
		public static FeedbackCodesRecRow fQueryOne(NNumber pSurrogateId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FEEDBACK_CODES.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DbTypes.createStructType(FeedbackCodesRecRow.class));
			cmd.addParameter("@P_SURROGATE_ID", pSurrogateId);
				
			cmd.execute();

			return cmd.getReturnValue(FeedbackCodesRecRow.class);

		}
		
		public static void pCreate(Ref<NNumber> pSurrogateIdOut,NString pCode,NString pDesc,NString pType,NString pActiveInd,NString pDataOrigin,NString pUserId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FEEDBACK_CODES.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SURROGATE_ID_OUT", NNumber.class);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_DESC", pDesc);
			cmd.addParameter("@P_TYPE", pType);
			cmd.addParameter("@P_ACTIVE_IND", pActiveInd);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
				
			cmd.execute();
			pSurrogateIdOut.val = cmd.getParameterValue("@P_SURROGATE_ID_OUT", NNumber.class);


		}
		
		public static void pDelete(NNumber pSurrogateId,NNumber pVersion) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FEEDBACK_CODES.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SURROGATE_ID", pSurrogateId);
			cmd.addParameter("@P_VERSION", pVersion);
				
			cmd.execute();


		}
		
		public static void pUpdate(NNumber pSurrogateId,NString pCode,NString pDesc,NString pType,NString pActiveInd,NNumber pVersion,NString pDataOrigin,NString pUserId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FEEDBACK_CODES.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SURROGATE_ID", pSurrogateId);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_DESC", pDesc);
			cmd.addParameter("@P_TYPE", pType);
			cmd.addParameter("@P_ACTIVE_IND", pActiveInd);
			cmd.addParameter("@P_VERSION", pVersion);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="FeedbackCodesRecRow", dataSourceName="FEEDBACK_CODES_REC")
	public static class FeedbackCodesRecRow
	{
		@DbRecordField(dataSourceName="R_SURROGATE_ID")
		public NNumber RSurrogateId;
		@DbRecordField(dataSourceName="R_CODE")
		public NString RCode;
		@DbRecordField(dataSourceName="R_DESC")
		public NString RDesc;
		@DbRecordField(dataSourceName="R_TYPE")
		public NString RType;
		@DbRecordField(dataSourceName="R_ACTIVE_IND")
		public NString RActiveInd;
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
