package net.hedtech.general.common.dbservices;

import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.appdatalayer.data.IDataCommand;
import morphis.foundations.core.types.NBool;
import morphis.foundations.core.types.NInteger;
import morphis.foundations.core.types.NNumber;
import morphis.foundations.core.types.NString;

public class GChkAuth {
	public static NString gCheckAuthorizationFnc(NString inObject, NString userId) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("G$_CHK_AUTH.G$_CHECK_AUTHORIZATION_FNC", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NString.class);
		cmd.addParameter("@IN_OBJECT", inObject);
		cmd.addParameter("@USER_ID", userId);
		
		cmd.execute();

		return cmd.getReturnValue(NString.class);
	}

	public static NString gCheckUserClassFnc(NString userId) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"G$_CHK_AUTH.G$_CHECK_USER_CLASS_FNC",
				DbManager.getDataBaseFactory());
		cmd.addReturnParameter(NString.class);
		cmd.addParameter("@USER_ID", userId);
		cmd.execute();
		return cmd.getReturnValue(NString.class);
	}

	public static NBool gCheckValidObjFnc(NString inObject) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"G$_CHK_AUTH.G$_CHECK_VALID_OBJ_FNC",
				DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NBool.class);
		cmd.addParameter("@IN_OBJECT", inObject);

		cmd.execute();

		return cmd.getReturnValue(NBool.class);
	}

	public static NString gGetObjReleaseFnc(NString inObject) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"G$_CHK_AUTH.G$_GET_OBJ_RELEASE_FNC",
				DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NString.class);
		cmd.addParameter("@IN_OBJECT", inObject);

		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}

	public static NInteger gSyncClassGrantsFnc(NString inObject) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"G$_CHK_AUTH.G$_SYNC_CLASS_GRANTS_FNC",
				DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NInteger.class);
		cmd.addParameter("@IN_OBJECT", inObject);

		cmd.execute();

		return cmd.getReturnValue(NInteger.class);

	}

	public static NNumber gSyncUserGrantsFnc(NString inUser, NString inClass) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"G$_CHK_AUTH.G$_SYNC_USER_GRANTS_FNC",
				DbManager.getDataBaseFactory());
		cmd.addReturnParameter(NNumber.class);
		cmd.addParameter("@IN_USER", inUser);
		cmd.addParameter("@IN_CLASS", inClass);
		cmd.execute();
		return cmd.getReturnValue(NNumber.class);

	}
	
	public static NString gGetObjUiVersionFnc(NString inObject) {
		
		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("G$_CHK_AUTH.G$_GET_OBJ_UI_VERSION_FNC", DbManager.getDataBaseFactory());
		cmd.addReturnParameter(NString.class);
			
		cmd.addParameter("@IN_OBJECT", inObject);

		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}
}