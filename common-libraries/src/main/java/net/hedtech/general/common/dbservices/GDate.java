package net.hedtech.general.common.dbservices;

import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.appdatalayer.data.IDataCommand;
import morphis.foundations.core.types.NBool;
import morphis.foundations.core.types.NDate;
import morphis.foundations.core.types.NNumber;
import morphis.foundations.core.types.NString;
import morphis.foundations.core.types.Types;
import morphis.foundations.core.util.Ref;

public class GDate {
	public static NDate cal1AddMonths(NDate dateIn, NNumber monthsIn) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"G$_DATE.CAL1_ADD_MONTHS", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NDate.class);
		cmd.addParameter("@DATE_IN", dateIn);
		cmd.addParameter("@MONTHS_IN", monthsIn);

		cmd.execute();

		return cmd.getReturnValue(NDate.class);

	}

	public static NDate cal1FirstDay(NDate dateIn) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"G$_DATE.CAL1_FIRST_DAY", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NDate.class);
		cmd.addParameter("@DATE_IN", dateIn);

		cmd.execute();

		return cmd.getReturnValue(NDate.class);

	}

	public static NDate cal1LastDay(NDate dateIn) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"G$_DATE.CAL1_LAST_DAY", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NDate.class);
		cmd.addParameter("@DATE_IN", dateIn);

		cmd.execute();

		return cmd.getReturnValue(NDate.class);

	}

	public static NString cal1ToChar(NDate dateIn) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"G$_DATE.CAL1_TO_CHAR", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NString.class);
		cmd.addParameter("@DATE_IN", dateIn);

		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}

	public static NString cal1ToChar(NDate dateIn, NString maskIn) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"G$_DATE.CAL1_TO_CHAR", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NString.class);
		cmd.addParameter("@DATE_IN", dateIn);
		cmd.addParameter("@MASK_IN", maskIn);

		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}

	public static NDate cal1ToDate(NString dateIn) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"G$_DATE.CAL1_TO_DATE", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NDate.class);
		cmd.addParameter("@DATE_IN", dateIn);

		cmd.execute();

		return cmd.getReturnValue(NDate.class);

	}

	public static NDate cal1ToDate(NString dateIn, NString maskIn) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"G$_DATE.CAL1_TO_DATE", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NDate.class);
		cmd.addParameter("@DATE_IN", dateIn);
		cmd.addParameter("@MASK_IN", maskIn);

		cmd.execute();

		return cmd.getReturnValue(NDate.class);

	}

	public static NDate cal2AddMonths(NDate dateIn, NNumber monthsIn) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"G$_DATE.CAL2_ADD_MONTHS", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NDate.class);
		cmd.addParameter("@DATE_IN", dateIn);
		cmd.addParameter("@MONTHS_IN", monthsIn);

		cmd.execute();

		return cmd.getReturnValue(NDate.class);

	}

	public static NDate cal2FirstDay(NDate dateIn) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"G$_DATE.CAL2_FIRST_DAY", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NDate.class);
		cmd.addParameter("@DATE_IN", dateIn);

		cmd.execute();

		return cmd.getReturnValue(NDate.class);

	}

	public static NDate cal2LastDay(NDate dateIn) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"G$_DATE.CAL2_LAST_DAY", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NDate.class);
		cmd.addParameter("@DATE_IN", dateIn);

		cmd.execute();

		return cmd.getReturnValue(NDate.class);

	}

	public static NString cal2ToChar(NDate dateIn) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"G$_DATE.CAL2_TO_CHAR", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NString.class);
		cmd.addParameter("@DATE_IN", dateIn);

		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}

	public static NString cal2ToChar(NDate dateIn, NString maskIn) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"G$_DATE.CAL2_TO_CHAR", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NString.class);
		cmd.addParameter("@DATE_IN", dateIn);
		cmd.addParameter("@MASK_IN", maskIn);

		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}

	public static NDate cal2ToDate(NString dateIn, NString maskIn) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"G$_DATE.CAL2_TO_DATE", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NDate.class);
		cmd.addParameter("@DATE_IN", dateIn);
		cmd.addParameter("@MASK_IN", maskIn);

		cmd.execute();

		return cmd.getReturnValue(NDate.class);

	}

	public static NDate cal2ToDate(NString dateIn) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"G$_DATE.CAL2_TO_DATE", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NDate.class);
		cmd.addParameter("@DATE_IN", dateIn);

		cmd.execute();

		return cmd.getReturnValue(NDate.class);

	}

	public static void dateFormat(NString valueIn,
			Ref<NString> valueOut, NString timeInd,
			Ref<NString> msgOut) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"G$_DATE.DATE_FORMAT", DbManager.getDataBaseFactory());

		cmd.addParameter("@VALUE_IN", valueIn);
		cmd.addParameter("@VALUE_OUT", NString.class);
		cmd.addParameter("@TIME_IND", timeInd);
		cmd.addParameter("@MSG_OUT", NString.class);

		cmd.execute();
		valueOut.val = cmd
				.getParameterValue("@VALUE_OUT", NString.class);
		msgOut.val = cmd.getParameterValue("@MSG_OUT", NString.class);

	}

	public static NString getNlsCal1() {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"G$_DATE.GET_NLS_CAL1", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NString.class);

		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}

	public static NString getNlsCal2() {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"G$_DATE.GET_NLS_CAL2", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NString.class);

		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}

	public static NString getNlsDateFormat() {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"G$_DATE.GET_NLS_DATE_FORMAT", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NString.class);

		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}
	
	public static NBool isValidDate(NString valueIn) {
		return isValidDate(valueIn, Types.toStr("N"));
	}
	
	public static NBool isValidDate(NString valueIn, NString timeInd) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"G$_DATE.IS_VALID_DATE", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NBool.class);
		cmd.addParameter("@VALUE_IN", valueIn);
		cmd.addParameter("@TIME_IND", timeInd);

		cmd.execute();

		return cmd.getReturnValue(NBool.class);

	}

	public static NString nlsAbvDay(NString day) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"G$_DATE.NLS_ABV_DAY", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NString.class);
		cmd.addParameter("@DAY", day);

		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}

	public static NString nlsAbvFri() {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"G$_DATE.NLS_ABV_FRI", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NString.class);

		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}

	public static NString nlsAbvMon() {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"G$_DATE.NLS_ABV_MON", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NString.class);

		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}

	public static NString nlsAbvSat() {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"G$_DATE.NLS_ABV_SAT", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NString.class);

		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}

	public static NString nlsAbvSun() {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"G$_DATE.NLS_ABV_SUN", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NString.class);

		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}

	public static NString nlsAbvThu() {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"G$_DATE.NLS_ABV_THU", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NString.class);

		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}

	public static NString nlsAbvTue() {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"G$_DATE.NLS_ABV_TUE", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NString.class);

		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}

	public static NString nlsAbvWed() {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"G$_DATE.NLS_ABV_WED", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NString.class);

		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}

	public static NNumber nlsDeviate() {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"G$_DATE.NLS_DEVIATE", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NNumber.class);

		cmd.execute();

		return cmd.getReturnValue(NNumber.class);

	}

	public static NString nlsFri() {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"G$_DATE.NLS_FRI", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NString.class);

		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}

	public static NString nlsMon() {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"G$_DATE.NLS_MON", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NString.class);

		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}

	public static NString nlsSat() {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"G$_DATE.NLS_SAT", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NString.class);

		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}

	public static NString nlsSun() {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"G$_DATE.NLS_SUN", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NString.class);

		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}

	public static NString nlsThu() {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"G$_DATE.NLS_THU", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NString.class);

		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}

	public static NString nlsTue() {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"G$_DATE.NLS_TUE", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NString.class);

		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}

	public static NString nlsWed() {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"G$_DATE.NLS_WED", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NString.class);

		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}

	public static NString normaliseGregDate(NString dateIn, NString maskIn) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"G$_DATE.NORMALISE_GREG_DATE", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NString.class);
		cmd.addParameter("@DATE_IN", dateIn);
		cmd.addParameter("@MASK_IN", maskIn);

		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}

	public static void setNlsCal1(NString cal1) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"G$_DATE.SET_NLS_CAL1", DbManager.getDataBaseFactory());

		cmd.addParameter("@CAL1", cal1);

		cmd.execute();

	}

	public static void setNlsCal2(NString cal2) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"G$_DATE.SET_NLS_CAL2", DbManager.getDataBaseFactory());

		cmd.addParameter("@CAL2", cal2);

		cmd.execute();

	}

	public static void setNlsDateFormat(NString dateFormat) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"G$_DATE.SET_NLS_DATE_FORMAT", DbManager.getDataBaseFactory());

		cmd.addParameter("@DATE_FORMAT", dateFormat);

		cmd.execute();

	}

	public static NString translateFormat(NString pomask) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"G$_DATE.TRANSLATE_FORMAT", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NString.class);
		cmd.addParameter("@POMASK", pomask);

		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}
}