package net.hedtech.general.common.dbservices;

import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.appdatalayer.data.IDataCommand;
import morphis.foundations.core.appdatalayer.data.types.DbTypes;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.NBool;
import morphis.foundations.core.types.NDate;
import morphis.foundations.core.types.NNumber;
import morphis.foundations.core.types.NString;

public class Nokmsgs {
	public static NBool fErrorFound(MsgRectypeRow msgRecIn) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKMSGS.F_ERROR_FOUND", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NBool.class);
		cmd.addParameter(DbTypes.createStructType("MSG_REC_IN", msgRecIn,
				MsgRectypeRow.class));

		cmd.execute();

		return cmd.getReturnValue(NBool.class);

	}
	
	public static NString fFormatMsg(MsgRectypeRow msgRecIn) {
		return fFormatMsg(msgRecIn, NString.getNull());
	}

	public static NString fFormatMsg(MsgRectypeRow msgRecIn,
			NString msgFormatIn) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKMSGS.F_FORMAT_MSG", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NString.class);
		cmd.addParameter(DbTypes.createStructType("MSG_REC_IN", msgRecIn,
				MsgRectypeRow.class));
		cmd.addParameter("@MSG_FORMAT_IN", msgFormatIn);

		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}

	public static NBool fMsgFound(MsgRectypeRow msgRecIn) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKMSGS.F_MSG_FOUND", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NBool.class);
		cmd.addParameter(DbTypes.createStructType("MSG_REC_IN", msgRecIn,
				MsgRectypeRow.class));

		cmd.execute();

		return cmd.getReturnValue(NBool.class);

	}

	public static MsgRectypeRow fMsgRec(NString msgTypeIn, NString msgTextIn) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKMSGS.F_MSG_REC", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(DbTypes.createStructType(MsgRectypeRow.class));
		cmd.addParameter("@MSG_TYPE_IN", msgTypeIn);
		cmd.addParameter("@MSG_TEXT_IN", msgTextIn);

		cmd.execute();

		return cmd.getReturnValue(MsgRectypeRow.class);

	}

	public static NBool fMsgTypeFound(NString msgTypeIn,
			MsgRectypeRow msgRecIn) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKMSGS.F_MSG_TYPE_FOUND", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NBool.class);
		cmd.addParameter("@MSG_TYPE_IN", msgTypeIn);
		cmd.addParameter(DbTypes.createStructType("MSG_REC_IN", msgRecIn,
				MsgRectypeRow.class));

		cmd.execute();

		return cmd.getReturnValue(NBool.class);

	}

	public static NBool fWarningFound(MsgRectypeRow msgRecIn) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKMSGS.F_WARNING_FOUND", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NBool.class);
		cmd.addParameter(DbTypes.createStructType("MSG_REC_IN", msgRecIn,
				MsgRectypeRow.class));

		cmd.execute();

		return cmd.getReturnValue(NBool.class);

	}

	public static void pInsertPhrerrl(MsgRectypeRow msgRecIn,
			NString msgFormatIn) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKMSGS.P_INSERT_PHRERRL", DbManager.getDataBaseFactory());

		cmd.addParameter(DbTypes.createStructType("MSG_REC_IN", msgRecIn,
				MsgRectypeRow.class));
		cmd.addParameter("@MSG_FORMAT_IN", msgFormatIn);

		cmd.execute();

	}

	@DbRecordType(id = "MsgRectypeRow", dataSourceName = "NOKMSGS.MSG_RECTYPE")
	public static class MsgRectypeRow {
		@DbRecordField(dataSourceName = "MSG_TYPE")
		public NString MsgType;
		@DbRecordField(dataSourceName = "MSG_TEXT")
		public NString MsgText;
		@DbRecordField(dataSourceName = "PAY_YEAR")
		public NString PayYear;
		@DbRecordField(dataSourceName = "PICT_CODE")
		public NString PictCode;
		@DbRecordField(dataSourceName = "PAYNO")
		public NNumber Payno;
		@DbRecordField(dataSourceName = "SEQ_NO")
		public NNumber SeqNo;
		@DbRecordField(dataSourceName = "PIDM")
		public NNumber Pidm;
		@DbRecordField(dataSourceName = "POSN")
		public NString Posn;
		@DbRecordField(dataSourceName = "SUFF")
		public NString Suff;
		@DbRecordField(dataSourceName = "EFFECTIVE_DATE")
		public NDate EffectiveDate;
		@DbRecordField(dataSourceName = "COAS_CODE_TS")
		public NString CoasCodeTs;
		@DbRecordField(dataSourceName = "ORGN_CODE_TS")
		public NString OrgnCodeTs;
		@DbRecordField(dataSourceName = "ECLS_CODE")
		public NString EclsCode;
		@DbRecordField(dataSourceName = "STATUS")
		public NString Status;
		@DbRecordField(dataSourceName = "EARN_CODE")
		public NString EarnCode;
		@DbRecordField(dataSourceName = "SHIFT")
		public NString Shift;
		@DbRecordField(dataSourceName = "SPECIAL_RATE")
		public NNumber SpecialRate;
		@DbRecordField(dataSourceName = "HRS")
		public NNumber Hrs;
		@DbRecordField(dataSourceName = "LEAV_CODE")
		public NString LeavCode;
		@DbRecordField(dataSourceName = "DISP")
		public NString Disp;
		@DbRecordField(dataSourceName = "TE_ACTION_IND")
		public NString TeActionInd;
		@DbRecordField(dataSourceName = "TIME_ENTRY_DATE")
		public NDate TimeEntryDate;
	}
}