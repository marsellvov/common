package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Chnlskbl {
		public static DataCursor fFinalertSum(NString pUsername) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CHNLSKBL.F_FINALERT_SUM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_USERNAME", pUsername);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fGetDashboard(NNumber pidmIn,NNumber noRecs) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CHNLSKBL.F_GET_DASHBOARD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@NO_RECS", noRecs);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fGetDashboardCount(NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CHNLSKBL.F_GET_DASHBOARD_COUNT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fGetDashboardCrn(NNumber pidmIn,NNumber noRecs) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CHNLSKBL.F_GET_DASHBOARD_CRN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@NO_RECS", noRecs);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fGetFinalert(NString pUsername) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CHNLSKBL.F_GET_FINALERT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_USERNAME", pUsername);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
	
	
	@DbRecordType(id="FinalertRecRow", dataSourceName="FINALERT_REC")
	public static class FinalertRecRow
	{
		@DbRecordField(dataSourceName="R_FOBAINP_DOC_NUM")
		public NString RFobainpDocNum;
		@DbRecordField(dataSourceName="R_FOBAINP_APPROVAL_SEQUENCE")
		public NNumber RFobainpApprovalSequence;
		@DbRecordField(dataSourceName="R_FOBAINP_DOC_TYPE")
		public NNumber RFobainpDocType;
	}

	
	@DbRecordType(id="FinalertRecSumRow", dataSourceName="FINALERT_REC_SUM")
	public static class FinalertRecSumRow
	{
		@DbRecordField(dataSourceName="R_DOC_NUM")
		public NString RDocNum;
		@DbRecordField(dataSourceName="R_DOC_DESC")
		public NString RDocDesc;
		@DbRecordField(dataSourceName="R_DOC_TYPE")
		public NNumber RDocType;
	}

	
	@DbRecordType(id="ScbrseRecRow", dataSourceName="SCBRSE_REC")
	public static class ScbrseRecRow
	{
		@DbRecordField(dataSourceName="R_SCBCRSE_TITLE")
		public NString RScbcrseTitle;
		@DbRecordField(dataSourceName="R_SCBCRSE_SUBJ_CODE")
		public NString RScbcrseSubjCode;
		@DbRecordField(dataSourceName="R_SCBCRSE_CRSE_NUMB")
		public NString RScbcrseCrseNumb;
		@DbRecordField(dataSourceName="R_TERM_DESC")
		public NString RTermDesc;
		@DbRecordField(dataSourceName="R_WAIT_CAPACITY")
		public NNumber RWaitCapacity;
		@DbRecordField(dataSourceName="R_COURSE_LINK")
		public NString RCourseLink;
		@DbRecordField(dataSourceName="R_CLASSLIST_LINK")
		public NString RClasslistLink;
		@DbRecordField(dataSourceName="R_SYLL_LINK")
		public NString RSyllLink;
		@DbRecordField(dataSourceName="R_WAITLIST_LINK")
		public NString RWaitlistLink;
		@DbRecordField(dataSourceName="R_EMAIL_LINK")
		public NString REmailLink;
		@DbRecordField(dataSourceName="R_OHR_LINK")
		public NString ROhrLink;
	}

	
	@DbRecordType(id="ScbrseRecCountRow", dataSourceName="SCBRSE_REC_COUNT")
	public static class ScbrseRecCountRow
	{
		@DbRecordField(dataSourceName="R_SCBCRSE_COUNT")
		public NNumber RScbcrseCount;
	}

	
	
}
