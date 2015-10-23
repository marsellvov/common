package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbFacultyFeedback {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FACULTY_FEEDBACK.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pSurrogateId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FACULTY_FEEDBACK.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SURROGATE_ID", pSurrogateId);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fExists(NNumber pSfrffstId,NNumber pStvffvaId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FACULTY_FEEDBACK.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SFRFFST_ID", pSfrffstId);
			cmd.addParameter("@P_STVFFVA_ID", pStvffvaId);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(FacultyFeedbackRecRow recOne,FacultyFeedbackRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FACULTY_FEEDBACK.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, FacultyFeedbackRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, FacultyFeedbackRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static List<FacultyFeedbackTabRow> fQueryAll(NNumber pSfrffstId) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FACULTY_FEEDBACK.F_QUERY_ALL", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<FacultyFeedbackTabRow>.class);
//			cmd.addParameter("@P_SFRFFST_ID", pSfrffstId);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<FacultyFeedbackTabRow>.class);
//
//		}
		
		public static FacultyFeedbackRecRow fQueryOne(NNumber pSurrogateId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FACULTY_FEEDBACK.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DbTypes.createStructType(FacultyFeedbackRecRow.class));
			cmd.addParameter("@P_SURROGATE_ID", pSurrogateId);
				
			cmd.execute();

			return cmd.getReturnValue(FacultyFeedbackRecRow.class);

		}
		
		public static FacultyFeedbackRecRow fQueryOne(NNumber pSfrffstId,NNumber pStvffvaId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FACULTY_FEEDBACK.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DbTypes.createStructType(FacultyFeedbackRecRow.class));
			cmd.addParameter("@P_SFRFFST_ID", pSfrffstId);
			cmd.addParameter("@P_STVFFVA_ID", pStvffvaId);
				
			cmd.execute();

			return cmd.getReturnValue(FacultyFeedbackRecRow.class);

		}
		
		public static void pCreate(Ref<NNumber> pSurrogateIdOut,NNumber pSfrffstId,NNumber pStvffvaId,NString pDataOrigin,NString pUserId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FACULTY_FEEDBACK.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SURROGATE_ID_OUT", NNumber.class);
			cmd.addParameter("@P_SFRFFST_ID", pSfrffstId);
			cmd.addParameter("@P_STVFFVA_ID", pStvffvaId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
				
			cmd.execute();
			pSurrogateIdOut.val = cmd.getParameterValue("@P_SURROGATE_ID_OUT", NNumber.class);


		}
		
		public static void pDelete(NNumber pSurrogateId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FACULTY_FEEDBACK.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SURROGATE_ID", pSurrogateId);
				
			cmd.execute();


		}
		
		public static void pDelete(NNumber pSfrffstId,NNumber pStvffvaId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FACULTY_FEEDBACK.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SFRFFST_ID", pSfrffstId);
			cmd.addParameter("@P_STVFFVA_ID", pStvffvaId);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="FacultyFeedbackRecRow", dataSourceName="FACULTY_FEEDBACK_REC")
	public static class FacultyFeedbackRecRow
	{
		@DbRecordField(dataSourceName="R_SURROGATE_ID")
		public NNumber RSurrogateId;
		@DbRecordField(dataSourceName="R_SFRFFST_ID")
		public NNumber RSfrffstId;
		@DbRecordField(dataSourceName="R_STVFFVA_ID")
		public NNumber RStvffvaId;
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
