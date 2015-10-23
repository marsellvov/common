package net.hedtech.general.common.dbservices;

import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.appdatalayer.data.IDataCommand;
import morphis.foundations.core.types.NClob;
import morphis.foundations.core.types.NDate;
import morphis.foundations.core.types.NNumber;
import morphis.foundations.core.types.NString;
import morphis.foundations.core.util.Ref;

public class GpGoksdif {
	public static Object fCast(NString pAttrDataType, NClob pClob) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"GP_GOKSDIF.F_CAST", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(Object.class);
		cmd.addParameter("@P_ATTR_DATA_TYPE", pAttrDataType);
		cmd.addParameter("@P_CLOB", pClob);

		cmd.execute();

		return cmd.getReturnValue(Object.class);

	}

	public static Object fCast(NString pAttrDataType, NString pChar) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"GP_GOKSDIF.F_CAST", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(Object.class);
		cmd.addParameter("@P_ATTR_DATA_TYPE", pAttrDataType);
		cmd.addParameter("@P_CHAR", pChar);

		cmd.execute();

		return cmd.getReturnValue(Object.class);

	}

	public static NString fGetCurrentPk() {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"GP_GOKSDIF.F_GET_CURRENT_PK", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NString.class);

		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}

	public static NString fGetPk(NString pTableName, NString pRowid) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"GP_GOKSDIF.F_GET_PK", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NString.class);
		cmd.addParameter("@P_TABLE_NAME", pTableName);
		cmd.addParameter("@P_ROWID", pRowid);

		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}

	public static NString fGetSdText(NString pTableName,
			NString pAttrName, NString pPk, NString pDisc,
			NString pDefault) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"GP_GOKSDIF.F_GET_SD_TEXT", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NString.class);
		cmd.addParameter("@P_TABLE_NAME", pTableName);
		cmd.addParameter("@P_ATTR_NAME", pAttrName);
		cmd.addParameter("@P_PK", pPk);
		cmd.addParameter("@P_DISC", pDisc);
		cmd.addParameter("@P_DEFAULT", pDefault);

		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}

	public static NString fSdExists(NString pTable, NString pPk) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"GP_GOKSDIF.F_SD_EXISTS", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NString.class);
		cmd.addParameter("@P_TABLE", pTable);
		cmd.addParameter("@P_PK", pPk);

		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}

	public static Object fToAny(NString pChar) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"GP_GOKSDIF.F_TO_ANY", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(Object.class);
		cmd.addParameter("@P_CHAR", pChar);

		cmd.execute();

		return cmd.getReturnValue(Object.class);

	}

	public static Object fToAny(NNumber pNum) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"GP_GOKSDIF.F_TO_ANY", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(Object.class);
		cmd.addParameter("@P_NUM", pNum);

		cmd.execute();

		return cmd.getReturnValue(Object.class);

	}

	public static Object fToAny(NDate pDate) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"GP_GOKSDIF.F_TO_ANY", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(Object.class);
		cmd.addParameter("@P_DATE", pDate);

		cmd.execute();

		return cmd.getReturnValue(Object.class);

	}

	public static NString fToVarchar2(Object pAnydata) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"GP_GOKSDIF.F_TO_VARCHAR2", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NString.class);
		cmd.addParameter("@P_ANYDATA", pAnydata);

		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}

	public static NString fValidateSdeTesting(NString pTableName,
			NString pFormOrProcess, NString pTestType) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"GP_GOKSDIF.F_VALIDATE_SDE_TESTING",
				DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NString.class);
		cmd.addParameter("@P_TABLE_NAME", pTableName);
		cmd.addParameter("@P_FORM_OR_PROCESS", pFormOrProcess);
		cmd.addParameter("@P_TEST_TYPE", pTestType);

		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}

	public static NString fValidateValue(NString pTableName,
			NString pAttrName, NString pDisc, NString pPkParenttab,
			NString pAttrDataType, NString pFormOrProcess,
			Ref<NString> pValueAsChar) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"GP_GOKSDIF.F_VALIDATE_VALUE", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NString.class);
		cmd.addParameter("@P_TABLE_NAME", pTableName);
		cmd.addParameter("@P_ATTR_NAME", pAttrName);
		cmd.addParameter("@P_DISC", pDisc);
		cmd.addParameter("@P_PK_PARENTTAB", pPkParenttab);
		cmd.addParameter("@P_ATTR_DATA_TYPE", pAttrDataType);
		cmd.addParameter("@P_FORM_OR_PROCESS", pFormOrProcess);
		cmd.addParameter("@P_VALUE_AS_CHAR", pValueAsChar, true);

		cmd.execute();
		pValueAsChar.val = cmd.getParameterValue("@P_VALUE_AS_CHAR",
				NString.class);

		return cmd.getReturnValue(NString.class);

	}

	public static void pChangeKey(NString pTableName, NString pPkOld,
			NString pPkNew) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"GP_GOKSDIF.P_CHANGE_KEY", DbManager.getDataBaseFactory());

		cmd.addParameter("@P_TABLE_NAME", pTableName);
		cmd.addParameter("@P_PK_OLD", pPkOld);
		cmd.addParameter("@P_PK_NEW", pPkNew);

		cmd.execute();

	}

	public static void pDeleteAttributes(NString pTableName, NString pPk) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"GP_GOKSDIF.P_DELETE_ATTRIBUTES",
				DbManager.getDataBaseFactory());

		cmd.addParameter("@P_TABLE_NAME", pTableName);
		cmd.addParameter("@P_PK", pPk);

		cmd.execute();

	}

	public static void pInsertDisc(NString pTableName) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"GP_GOKSDIF.P_INSERT_DISC", DbManager.getDataBaseFactory());

		cmd.addParameter("@P_TABLE_NAME", pTableName);

		cmd.execute();

	}

	public static void pSetAttribute(NString pTableName, NString pAttrName,
			NString pDisc, NString pPkParenttab,
			Ref<NString> pGorsdavRowid, NString pAttrDataType,
			NClob pValueAsClob) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"GP_GOKSDIF.P_SET_ATTRIBUTE", DbManager.getDataBaseFactory());

		cmd.addParameter("@P_TABLE_NAME", pTableName);
		cmd.addParameter("@P_ATTR_NAME", pAttrName);
		cmd.addParameter("@P_DISC", pDisc);
		cmd.addParameter("@P_PK_PARENTTAB", pPkParenttab);
		cmd.addParameter("@P_GORSDAV_ROWID", pGorsdavRowid, true);
		cmd.addParameter("@P_ATTR_DATA_TYPE", pAttrDataType);
		cmd.addParameter("@P_VALUE_AS_CLOB", pValueAsClob);

		cmd.execute();
		pGorsdavRowid.val = cmd.getParameterValue("@P_GORSDAV_ROWID",NString.class);

	}

	public static void pSetAttribute(NString pTableName, NString pAttrName,
			NString pDisc, NString pPkParenttab,
			Ref<NString> pGorsdavRowid, NString pAttrDataType,
			NString pValueAsChar) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"GP_GOKSDIF.P_SET_ATTRIBUTE", DbManager.getDataBaseFactory());

		cmd.addParameter("@P_TABLE_NAME", pTableName);
		cmd.addParameter("@P_ATTR_NAME", pAttrName);
		cmd.addParameter("@P_DISC", pDisc);
		cmd.addParameter("@P_PK_PARENTTAB", pPkParenttab);
		cmd.addParameter("@P_GORSDAV_ROWID", pGorsdavRowid, true);
		cmd.addParameter("@P_ATTR_DATA_TYPE", pAttrDataType);
		cmd.addParameter("@P_VALUE_AS_CHAR", pValueAsChar);

		cmd.execute();
		pGorsdavRowid.val = cmd.getParameterValue("@P_GORSDAV_ROWID", NString.class);

	}

	public static void pSetAttribute(NString pTableName, NString pAttrName,
			NString pDisc, NString pPkParenttab,
			Ref<NString> pGorsdavRowid, Object pValue) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"GP_GOKSDIF.P_SET_ATTRIBUTE", DbManager.getDataBaseFactory());

		cmd.addParameter("@P_TABLE_NAME", pTableName);
		cmd.addParameter("@P_ATTR_NAME", pAttrName);
		cmd.addParameter("@P_DISC", pDisc);
		cmd.addParameter("@P_PK_PARENTTAB", pPkParenttab);
		cmd.addParameter("@P_GORSDAV_ROWID", pGorsdavRowid, true);
		cmd.addParameter("@P_VALUE", pValue);

		cmd.execute();
		pGorsdavRowid.val = cmd.getParameterValue("@P_GORSDAV_ROWID", NString.class);

	}

	public static void pSetCurrentPk(NString pPk) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"GP_GOKSDIF.P_SET_CURRENT_PK", DbManager.getDataBaseFactory());

		cmd.addParameter("@P_PK", pPk);

		cmd.execute();

	}
}