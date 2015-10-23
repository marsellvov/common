package net.hedtech.general.common.dbservices;

import net.hedtech.general.common.dbservices.Nokepaf.RaceArrayTypeRow;
import net.hedtech.general.common.dbservices.NpJobEarnings.JobEarningsRecRow;
import morphis.foundations.core.appdatalayer.data.DataCursor;
import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.appdatalayer.data.IDataCommand;
import morphis.foundations.core.appdatalayer.data.types.DbTypes;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbTableType;
import morphis.foundations.core.types.NBool;
import morphis.foundations.core.types.NNumber;
import morphis.foundations.core.types.NString;
import morphis.foundations.core.types.Table;
import morphis.foundations.core.util.Ref;

public class GVpdiSecurity {
	public static NBool FgIsMifEnabled() {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"G$_VPDI_SECURITY.G$_IS_MIF_ENABLED",
				DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NBool.class);

		cmd.execute();

		return cmd.getReturnValue(NBool.class);

	}

	public static NString FgIsMifEnabledStr() {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"G$_VPDI_SECURITY.G$_IS_MIF_ENABLED_STR",
				DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NString.class);

		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}

	public static NString FgVpdiGetCurrentInstCode() {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"G$_VPDI_SECURITY.G$_VPDI_GET_CURRENT_INST_CODE",
				DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NString.class);

		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}

	public static NString FgVpdiGetInstCodeFnc() {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"G$_VPDI_SECURITY.G$_VPDI_GET_INST_CODE_FNC",
				DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NString.class);

		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}

	public static void gVpdiGetMifCodes(Ref<DataCursor> pCursor) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"G$_VPDI_SECURITY.G$_VPDI_GET_MIF_CODES",
				DbManager.getDataBaseFactory());

		cmd.addParameter("@P_CURSOR", DataCursor.class);

		cmd.execute();
		pCursor.val = cmd.getParameterValue("@P_CURSOR", DataCursor.class);

	}

	public static NString FgVpdiGetMultiContextFnc() {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"G$_VPDI_SECURITY.G$_VPDI_GET_MULTI_CONTEXT_FNC",
				DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NString.class);

		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}

	public static NString FgVpdiGetProcContextFnc() {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"G$_VPDI_SECURITY.G$_VPDI_GET_PROC_CONTEXT_FNC",
				DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NString.class);

		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}

	public static void gVpdiGetUserInstCount(Ref<NNumber> instCount) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"G$_VPDI_SECURITY.G$_VPDI_GET_USER_INST_COUNT",
				DbManager.getDataBaseFactory());

		cmd.addParameter("@INST_COUNT", NNumber.class);

		cmd.execute();
		instCount.val = cmd.getParameterValue("@INST_COUNT",
				NNumber.class);

	}

	public static NString FgVpdiPredicateFnc(NString owner,
			NString tableName) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"G$_VPDI_SECURITY.G$_VPDI_PREDICATE_FNC",
				DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NString.class);
		cmd.addParameter("@OWNER", owner);
		cmd.addParameter("@TABLE_NAME", tableName);

		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}

	public static void gVpdiSetCurrentInstCode(NString instCode) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"G$_VPDI_SECURITY.G$_VPDI_SET_CURRENT_INST_CODE",
				DbManager.getDataBaseFactory());

		cmd.addParameter("@INST_CODE", instCode);

		cmd.execute();

	}

	public static void gVpdiSetHomeContext(NString instCode) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"G$_VPDI_SECURITY.G$_VPDI_SET_HOME_CONTEXT",
				DbManager.getDataBaseFactory());

		cmd.addParameter("@INST_CODE", instCode);

		cmd.execute();

	}

	public static void gVpdiSetMultiuseContext(NString multiuseCode) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"G$_VPDI_SECURITY.G$_VPDI_SET_MULTIUSE_CONTEXT",
				DbManager.getDataBaseFactory());

		cmd.addParameter("@MULTIUSE_CODE", multiuseCode);

		cmd.execute();

	}

	public static void gVpdiSetProcessContext(NString instCode,
			NString callingInst) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"G$_VPDI_SECURITY.G$_VPDI_SET_PROCESS_CONTEXT",
				DbManager.getDataBaseFactory());

		cmd.addParameter("@INST_CODE", instCode);
		cmd.addParameter("@CALLING_INST", callingInst);

		cmd.execute();

	}

	public static void gVpdiSetUserDefault(NString vpdiCode) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"G$_VPDI_SECURITY.G$_VPDI_SET_USER_DEFAULT",
				DbManager.getDataBaseFactory());

		cmd.addParameter("@VPDI_CODE", vpdiCode);

		cmd.execute();

	}
	
	public static void gVpdiGetUserInsts(Ref<Table<SecurityRecordTypeRow>> vpdiInfo) {
		
		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("G$_VPDI_SECURITY.G$_VPDI_GET_USER_INSTS", DbManager.getDataBaseFactory());
		
		cmd.addParameter(DbTypes.getTableType("VPDI_INFO", "G$_VPDI_SECURITY.SECURITY_TABLE", vpdiInfo.val, SecurityRecordTypeRow.class, true));
			
		cmd.execute();
		vpdiInfo.val = cmd.getTableParameterValue("@VPDI_INFO", SecurityRecordTypeRow.class);
	}


	@DbRecordType(id = "SecurityRecordTypeRow", dataSourceName = "SECURITY_RECORD_TYPE")
	public static class SecurityRecordTypeRow {
		@DbRecordField(dataSourceName = "VPDI_CODE")
		public NString VpdiCode;
		@DbRecordField(dataSourceName = "PRIMARY_IND")
		public NString PrimaryInd;
		@DbRecordField(dataSourceName = "CODE_DESC")
		public NString CodeDesc;
	}
		
		
	@DbTableType(id = "GVpdiSecurity.SecurityTableType", dataSourceName="G$_VPDI_SECURITY.SECURITY_TABLE", indexed=true)
	public static class SecurityTableType extends Table<SecurityRecordTypeRow> {
		@Override
		protected SecurityRecordTypeRow newValue(){
			return new SecurityRecordTypeRow();
		}
	}
}