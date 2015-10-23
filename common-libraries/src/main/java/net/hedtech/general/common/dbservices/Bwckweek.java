package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwckweek {
		public static NString fTimeSlotRound(NString timeIn,NNumber slotLengthIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKWEEK.F_TIME_SLOT_ROUND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TIME_IN", timeIn);
			cmd.addParameter("@SLOT_LENGTH_IN", slotLengthIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pCalcRowspan(NString classBeginTimeIn,NString classEndTimeIn,NNumber slotLengthIn,Ref<NNumber> classRowspanInout,Ref<NNumber> classBeginSlotInout,Ref<NNumber> classEndSlotInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKWEEK.P_CALC_ROWSPAN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CLASS_BEGIN_TIME_IN", classBeginTimeIn);
			cmd.addParameter("@CLASS_END_TIME_IN", classEndTimeIn);
			cmd.addParameter("@SLOT_LENGTH_IN", slotLengthIn);
			cmd.addParameter("@CLASS_ROWSPAN_INOUT", classRowspanInout, true);
			cmd.addParameter("@CLASS_BEGIN_SLOT_INOUT", classBeginSlotInout, true);
			cmd.addParameter("@CLASS_END_SLOT_INOUT", classEndSlotInout, true);
				
			cmd.execute();
			classRowspanInout.val = cmd.getParameterValue("@CLASS_ROWSPAN_INOUT", NNumber.class);
			classBeginSlotInout.val = cmd.getParameterValue("@CLASS_BEGIN_SLOT_INOUT", NNumber.class);
			classEndSlotInout.val = cmd.getParameterValue("@CLASS_END_SLOT_INOUT", NNumber.class);


		}
		
//		public static void pDispGrid(List<MeetingTabTypeRow> meetingTabIn,List<TemplateTabTypeRow> templateTabIn,NNumber maxTemplateIndexIn,NNumber todaysTemplateIndexIn,NDate templateStartDateIn,NString scheduleProcIn,NString detailScheduleProcIn,NNumber slotsInHourIn,NNumber slotLengthIn,NString minTimeIn,NString maxTimeIn,Ref<NNumber> rowCount,Ref<NBool> noSchd,NString printBuildDesc) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKWEEK.P_DISP_GRID", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("MEETING_TAB_IN", "", meetingTabIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("TEMPLATE_TAB_IN", "", templateTabIn, object.class));
//			cmd.addParameter("@MAX_TEMPLATE_INDEX_IN", maxTemplateIndexIn);
//			cmd.addParameter("@TODAYS_TEMPLATE_INDEX_IN", todaysTemplateIndexIn);
//			cmd.addParameter("@TEMPLATE_START_DATE_IN", templateStartDateIn);
//			cmd.addParameter("@SCHEDULE_PROC_IN", scheduleProcIn);
//			cmd.addParameter("@DETAIL_SCHEDULE_PROC_IN", detailScheduleProcIn);
//			cmd.addParameter("@SLOTS_IN_HOUR_IN", slotsInHourIn);
//			cmd.addParameter("@SLOT_LENGTH_IN", slotLengthIn);
//			cmd.addParameter("@MIN_TIME_IN", minTimeIn);
//			cmd.addParameter("@MAX_TIME_IN", maxTimeIn);
//			cmd.addParameter("@ROW_COUNT", rowCount, true);
//			cmd.addParameter("@NO_SCHD", noSchd, true);
//			cmd.addParameter("@PRINT_BUILD_DESC", printBuildDesc);
//				
//			cmd.execute();
//			rowCount.val = cmd.getParameterValue("@ROW_COUNT", NNumber.class);
//			noSchd.val = cmd.getParameterValue("@NO_SCHD", NBool.class);
//
//
//		}
		
		public static void pDispUnassigned(NString termCodeIn,NString crnIn,NString subjCodeIn,NString crseNumbIn,NString seqNumbIn,NString ptrmCodeIn,NString descIn,NString detailScheduleProcIn,NNumber rowCountIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKWEEK.P_DISP_UNASSIGNED", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_CODE_IN", termCodeIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@SUBJ_CODE_IN", subjCodeIn);
			cmd.addParameter("@CRSE_NUMB_IN", crseNumbIn);
			cmd.addParameter("@SEQ_NUMB_IN", seqNumbIn);
			cmd.addParameter("@PTRM_CODE_IN", ptrmCodeIn);
			cmd.addParameter("@DESC_IN", descIn);
			cmd.addParameter("@DETAIL_SCHEDULE_PROC_IN", detailScheduleProcIn);
			cmd.addParameter("@ROW_COUNT_IN", rowCountIn);
				
			cmd.execute();


		}
		
		public static void pGotoDate(NString errorMsgIn,NString errorDateIn,NDate startDateIn,NString processSubmitProcIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKWEEK.P_GOTO_DATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ERROR_MSG_IN", errorMsgIn);
			cmd.addParameter("@ERROR_DATE_IN", errorDateIn);
			cmd.addParameter("@START_DATE_IN", startDateIn);
			cmd.addParameter("@PROCESS_SUBMIT_PROC_IN", processSubmitProcIn);
				
			cmd.execute();


		}
		
//		public static void pLoadTemplate(NString callPathIn,NNumber pidmIn,NString startDateIn,Ref<NDate> startDate,Ref<NDate> iDate,Ref<NNumber> templateIndex,Ref<List<TemplateTabTypeRow>> templateTab,Ref<NDate> templateStartDate,Ref<NDate> templateEndDate,Ref<NNumber> todaysTemplateIndex,Ref<NBool> noSchd,Ref<NNumber> maxTemplateIndex) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKWEEK.P_LOAD_TEMPLATE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@CALL_PATH_IN", callPathIn);
//			cmd.addParameter("@PIDM_IN", pidmIn);
//			cmd.addParameter("@START_DATE_IN", startDateIn);
//			cmd.addParameter("@START_DATE", NDate.class);
//			cmd.addParameter("@I_DATE", NDate.class);
//			cmd.addParameter("@TEMPLATE_INDEX", NNumber.class);
//			// cmd.addParameter(DbTypes.getTableType("TEMPLATE_TAB", "", object.class));
//			cmd.addParameter("@TEMPLATE_START_DATE", NDate.class);
//			cmd.addParameter("@TEMPLATE_END_DATE", NDate.class);
//			cmd.addParameter("@TODAYS_TEMPLATE_INDEX", NNumber.class);
//			cmd.addParameter("@NO_SCHD", NBool.class);
//			cmd.addParameter("@MAX_TEMPLATE_INDEX", NNumber.class);
//				
//			cmd.execute();
//			startDate.val = cmd.getParameterValue("@START_DATE", NDate.class);
//			iDate.val = cmd.getParameterValue("@I_DATE", NDate.class);
//			templateIndex.val = cmd.getParameterValue("@TEMPLATE_INDEX", NNumber.class);
//			// templateTab.val = cmd.getTableParameterValue("@TEMPLATE_TAB", object.class);
//			templateStartDate.val = cmd.getParameterValue("@TEMPLATE_START_DATE", NDate.class);
//			templateEndDate.val = cmd.getParameterValue("@TEMPLATE_END_DATE", NDate.class);
//			todaysTemplateIndex.val = cmd.getParameterValue("@TODAYS_TEMPLATE_INDEX", NNumber.class);
//			noSchd.val = cmd.getParameterValue("@NO_SCHD", NBool.class);
//			maxTemplateIndex.val = cmd.getParameterValue("@MAX_TEMPLATE_INDEX", NNumber.class);
//
//
//		}
		
	
	
	@DbRecordType(id="MeetingRecTypeRow", dataSourceName="MEETING_REC_TYPE")
	public static class MeetingRecTypeRow
	{
		@DbRecordField(dataSourceName="TERM_CODE")
		public NString TermCode;
		@DbRecordField(dataSourceName="CRN")
		public NString Crn;
		@DbRecordField(dataSourceName="SUBJ_CODE")
		public NString SubjCode;
		@DbRecordField(dataSourceName="CRSE_NUMB")
		public NString CrseNumb;
		@DbRecordField(dataSourceName="SEQ_NUMB")
		public NString SeqNumb;
		@DbRecordField(dataSourceName="MON_DAY")
		public NString MonDay;
		@DbRecordField(dataSourceName="TUE_DAY")
		public NString TueDay;
		@DbRecordField(dataSourceName="WED_DAY")
		public NString WedDay;
		@DbRecordField(dataSourceName="THU_DAY")
		public NString ThuDay;
		@DbRecordField(dataSourceName="FRI_DAY")
		public NString FriDay;
		@DbRecordField(dataSourceName="SAT_DAY")
		public NString SatDay;
		@DbRecordField(dataSourceName="SUN_DAY")
		public NString SunDay;
		@DbRecordField(dataSourceName="SSRMEET_START_DATE")
		public NDate SsrmeetStartDate;
		@DbRecordField(dataSourceName="SSRMEET_END_DATE")
		public NDate SsrmeetEndDate;
		@DbRecordField(dataSourceName="SFRAREG_START_DATE")
		public NDate SfraregStartDate;
		@DbRecordField(dataSourceName="SFRAREG_COMPLETION_DATE")
		public NDate SfraregCompletionDate;
		@DbRecordField(dataSourceName="BEGIN_TIME")
		public NString BeginTime;
		@DbRecordField(dataSourceName="END_TIME")
		public NString EndTime;
		@DbRecordField(dataSourceName="BLDG_CODE")
		public NString BldgCode;
		@DbRecordField(dataSourceName="ROOM_CODE")
		public NString RoomCode;
		@DbRecordField(dataSourceName="MTYP_CODE")
		public NString MtypCode;
		@DbRecordField(dataSourceName="GTVMTYP_DESC")
		public NString GtvmtypDesc;
	}

	
	@DbRecordType(id="TemplateRecTypeRow", dataSourceName="TEMPLATE_REC_TYPE")
	public static class TemplateRecTypeRow
	{
		@DbRecordField(dataSourceName="START_DATE")
		public NDate StartDate;
		@DbRecordField(dataSourceName="END_DATE")
		public NDate EndDate;
		@DbRecordField(dataSourceName="START_END_COUNT")
		public NNumber StartEndCount;
	}

	
	
}
