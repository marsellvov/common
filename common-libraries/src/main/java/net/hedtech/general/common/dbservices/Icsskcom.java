package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Icsskcom {
		public static NString fCalcSectionSourcedidId(NString termCodeIn,NString crnIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSSKCOM.F_CALC_SECTION_SOURCEDID_ID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TERM_CODE_IN", termCodeIn);
			cmd.addParameter("@CRN_IN", crnIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCalcValidSectionLdimode(NString termCodeIn,NString crnIn,NString newIntgCdeIn,NString oldIntgCdeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSSKCOM.F_CALC_VALID_SECTION_LDIMODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TERM_CODE_IN", termCodeIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@NEW_INTG_CDE_IN", newIntgCdeIn);
			cmd.addParameter("@OLD_INTG_CDE_IN", oldIntgCdeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCalcValidXlmemLdimode(NString termCodeIn,NString crnIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSSKCOM.F_CALC_VALID_XLMEM_LDIMODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TERM_CODE_IN", termCodeIn);
			cmd.addParameter("@CRN_IN", crnIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCalcXlstmemOnlinetopic(NString termCodeIn,NString crnIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSSKCOM.F_CALC_XLSTMEM_ONLINETOPIC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TERM_CODE_IN", termCodeIn);
			cmd.addParameter("@CRN_IN", crnIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static List<MeetingTabTypeRow> fGetMeetings(NString termCodeIn,NString crnIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSSKCOM.F_GET_MEETINGS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<MeetingTabTypeRow>.class);
//			cmd.addParameter("@TERM_CODE_IN", termCodeIn);
//			cmd.addParameter("@CRN_IN", crnIn);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<MeetingTabTypeRow>.class);
//
//		}
		
		public static SectionRecTypeRow fGetSection() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSSKCOM.F_GET_SECTION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DbTypes.createStructType(SectionRecTypeRow.class));
				
			cmd.execute();

			return cmd.getReturnValue(SectionRecTypeRow.class);

		}
		
		public static NString fGetSectionDeliverySystem(NString newIntgCdeIn,NString oldIntgCdeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSSKCOM.F_GET_SECTION_DELIVERY_SYSTEM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@NEW_INTG_CDE_IN", newIntgCdeIn);
			cmd.addParameter("@OLD_INTG_CDE_IN", oldIntgCdeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static EventHeaderRecTypeRow fGetSectionEventHeader(NString termCodeIn,NString crnIn,NString newIntgCdeIn,NString oldIntgCdeIn,NString actionIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSSKCOM.F_GET_SECTION_EVENT_HEADER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DbTypes.createStructType(EventHeaderRecTypeRow.class));
			cmd.addParameter("@TERM_CODE_IN", termCodeIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@NEW_INTG_CDE_IN", newIntgCdeIn);
			cmd.addParameter("@OLD_INTG_CDE_IN", oldIntgCdeIn);
			cmd.addParameter("@ACTION_IN", actionIn);
				
			cmd.execute();

			return cmd.getReturnValue(EventHeaderRecTypeRow.class);

		}
		
		public static XlstgrpRecTypeRow fGetXlgrp(NString termCodeIn,NString xlstGroupIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSSKCOM.F_GET_XLGRP", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DbTypes.createStructType(XlstgrpRecTypeRow.class));
			cmd.addParameter("@TERM_CODE_IN", termCodeIn);
			cmd.addParameter("@XLST_GROUP_IN", xlstGroupIn);
				
			cmd.execute();

			return cmd.getReturnValue(XlstgrpRecTypeRow.class);

		}
		
		public static EventHeaderRecTypeRow fGetXlgrpEventHeader(NString termCodeIn,NString xlstGroupIn,NString actionIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSSKCOM.F_GET_XLGRP_EVENT_HEADER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DbTypes.createStructType(EventHeaderRecTypeRow.class));
			cmd.addParameter("@TERM_CODE_IN", termCodeIn);
			cmd.addParameter("@XLST_GROUP_IN", xlstGroupIn);
			cmd.addParameter("@ACTION_IN", actionIn);
				
			cmd.execute();

			return cmd.getReturnValue(EventHeaderRecTypeRow.class);

		}
		
		public static XlstmemRecTypeRow fGetXlmem(NString termCodeIn,NString xlstGroupIn,NString crnIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSSKCOM.F_GET_XLMEM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DbTypes.createStructType(XlstmemRecTypeRow.class));
			cmd.addParameter("@TERM_CODE_IN", termCodeIn);
			cmd.addParameter("@XLST_GROUP_IN", xlstGroupIn);
			cmd.addParameter("@CRN_IN", crnIn);
				
			cmd.execute();

			return cmd.getReturnValue(XlstmemRecTypeRow.class);

		}
		
		public static EventHeaderRecTypeRow fGetXlmemEventHeader(NString termCodeIn,NString xlstGroupIn,NString crnIn,NString actionIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSSKCOM.F_GET_XLMEM_EVENT_HEADER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DbTypes.createStructType(EventHeaderRecTypeRow.class));
			cmd.addParameter("@TERM_CODE_IN", termCodeIn);
			cmd.addParameter("@XLST_GROUP_IN", xlstGroupIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@ACTION_IN", actionIn);
				
			cmd.execute();

			return cmd.getReturnValue(EventHeaderRecTypeRow.class);

		}
		
	
	
	@DbRecordType(id="EventHeaderRecTypeRow", dataSourceName="EVENT_HEADER_REC_TYPE")
	public static class EventHeaderRecTypeRow
	{
		@DbRecordField(dataSourceName="INTEGRATION_SOURCE")
		public NString IntegrationSource;
		@DbRecordField(dataSourceName="SOURCEDID_ID")
		public NString SourcedidId;
		@DbRecordField(dataSourceName="MEMBER_SOURCEDID_ID")
		public NString MemberSourcedidId;
		@DbRecordField(dataSourceName="ONLINETOPIC")
		public NString Onlinetopic;
		@DbRecordField(dataSourceName="RECSTATUS")
		public NString Recstatus;
	}

	
	@DbRecordType(id="MeetingRecTypeRow", dataSourceName="MEETING_REC_TYPE")
	public static class MeetingRecTypeRow
	{
		@DbRecordField(dataSourceName="START_DATE")
		public NString StartDate;
		@DbRecordField(dataSourceName="END_DATE")
		public NString EndDate;
		@DbRecordField(dataSourceName="DAYS_OF_WEEK")
		public NString DaysOfWeek;
		@DbRecordField(dataSourceName="BEGIN_TIME")
		public NString BeginTime;
		@DbRecordField(dataSourceName="END_TIME")
		public NString EndTime;
		@DbRecordField(dataSourceName="LOCATION")
		public NString Location;
	}

	
	@DbRecordType(id="SectionRecTypeRow", dataSourceName="SECTION_REC_TYPE")
	public static class SectionRecTypeRow
	{
		@DbRecordField(dataSourceName="SOURCEDID_ID")
		public NString SourcedidId;
		@DbRecordField(dataSourceName="SHORT_DESC")
		public NString ShortDesc;
		@DbRecordField(dataSourceName="LONG_DESC")
		public NString LongDesc;
		@DbRecordField(dataSourceName="FULL_DESC")
		public NString FullDesc;
		@DbRecordField(dataSourceName="ORGUNIT")
		public NString Orgunit;
		@DbRecordField(dataSourceName="ENROLLACCEPT")
		public NString Enrollaccept;
		@DbRecordField(dataSourceName="START_DATE")
		public NString StartDate;
		@DbRecordField(dataSourceName="START_DATE_RESTRICT")
		public NString StartDateRestrict;
		@DbRecordField(dataSourceName="END_DATE")
		public NString EndDate;
		@DbRecordField(dataSourceName="END_DATE_RESTRICT")
		public NString EndDateRestrict;
		@DbRecordField(dataSourceName="PARENT_SOURCEDID_ID")
		public NString ParentSourcedidId;
		@DbRecordField(dataSourceName="DELIVERY_SYSTEM")
		public NString DeliverySystem;
		@DbRecordField(dataSourceName="TERM_SOURCEDID_ID")
		public NString TermSourcedidId;
	}

	
	@DbRecordType(id="XlstgrpRecTypeRow", dataSourceName="XLSTGRP_REC_TYPE")
	public static class XlstgrpRecTypeRow
	{
		@DbRecordField(dataSourceName="SOURCEDID_ID")
		public NString SourcedidId;
	}

	
	@DbRecordType(id="XlstmemRecTypeRow", dataSourceName="XLSTMEM_REC_TYPE")
	public static class XlstmemRecTypeRow
	{
		@DbRecordField(dataSourceName="SOURCEDID_ID")
		public NString SourcedidId;
		@DbRecordField(dataSourceName="MEMBER_SOURCEDID_ID")
		public NString MemberSourcedidId;
		@DbRecordField(dataSourceName="STATUS")
		public NString Status;
	}

	
	
}
