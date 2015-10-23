package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Icsfkcom {
		public static NString fCalcOnlinetopic(NString termCodeIn,NString crnIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSFKCOM.F_CALC_ONLINETOPIC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TERM_CODE_IN", termCodeIn);
			cmd.addParameter("@CRN_IN", crnIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCalcSourcedidId(NString termCodeIn,NString crnIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSFKCOM.F_CALC_SOURCEDID_ID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TERM_CODE_IN", termCodeIn);
			cmd.addParameter("@CRN_IN", crnIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCalcValidLdimode(NString termCodeIn,NString crnIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSFKCOM.F_CALC_VALID_LDIMODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TERM_CODE_IN", termCodeIn);
			cmd.addParameter("@CRN_IN", crnIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static EnrollRecTypeRow fGetEnrollment(NString termCodeIn,NString crnIn,NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSFKCOM.F_GET_ENROLLMENT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DbTypes.createStructType(EnrollRecTypeRow.class));
			cmd.addParameter("@TERM_CODE_IN", termCodeIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();

			return cmd.getReturnValue(EnrollRecTypeRow.class);

		}
		
		public static EventHeaderRecTypeRow fGetEventHeader(NString termCodeIn,NString crnIn,NNumber pidmIn,NString actionIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSFKCOM.F_GET_EVENT_HEADER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DbTypes.createStructType(EventHeaderRecTypeRow.class));
			cmd.addParameter("@TERM_CODE_IN", termCodeIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@ACTION_IN", actionIn);
				
			cmd.execute();

			return cmd.getReturnValue(EventHeaderRecTypeRow.class);

		}
		
		public static NString fGetPersonId(NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSFKCOM.F_GET_PERSON_ID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fValidRegistrationYn(NString rstsCodeIn,NString errorFlagIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSFKCOM.F_VALID_REGISTRATION_YN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@RSTS_CODE_IN", rstsCodeIn);
			cmd.addParameter("@ERROR_FLAG_IN", errorFlagIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	@DbRecordType(id="EnrollRecTypeRow", dataSourceName="ENROLL_REC_TYPE")
	public static class EnrollRecTypeRow
	{
		@DbRecordField(dataSourceName="SOURCEDID_ID")
		public NString SourcedidId;
		@DbRecordField(dataSourceName="MEMBER_SOURCEDID_ID")
		public NString MemberSourcedidId;
		@DbRecordField(dataSourceName="STATUS")
		public NString Status;
		@DbRecordField(dataSourceName="GRADING_MODE")
		public NString GradingMode;
		@DbRecordField(dataSourceName="GRADABLE")
		public NString Gradable;
		@DbRecordField(dataSourceName="BEGIN_DATE")
		public NString BeginDate;
		@DbRecordField(dataSourceName="BEGIN_DATE_RESTRICT")
		public NString BeginDateRestrict;
		@DbRecordField(dataSourceName="END_DATE")
		public NString EndDate;
		@DbRecordField(dataSourceName="END_DATE_RESTRICT")
		public NString EndDateRestrict;
	}

	
	@DbRecordType(id="EventHeaderRecTypeRow", dataSourceName="EVENT_HEADER_REC_TYPE")
	public static class EventHeaderRecTypeRow
	{
		@DbRecordField(dataSourceName="INTEGRATION_SOURCE")
		public NString IntegrationSource;
		@DbRecordField(dataSourceName="SOURCEDID_ID")
		public NString SourcedidId;
		@DbRecordField(dataSourceName="ONLINETOPIC")
		public NString Onlinetopic;
		@DbRecordField(dataSourceName="RECSTATUS")
		public NString Recstatus;
	}

	
	
}
