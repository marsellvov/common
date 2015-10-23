package net.hedtech.general.common.dbservices;

import net.hedtech.general.common.dbservices.Efkimag.EfkimagImp;
import morphis.foundations.core.appdatalayer.data.DataCommand;
import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.appdatalayer.data.IDataCommand;
import morphis.foundations.core.appdatalayer.data.NoDataFoundException;
import morphis.foundations.core.appdatalayer.data.ResultSet;
import morphis.foundations.core.appdatalayer.data.TooManyRowsException;
import morphis.foundations.core.types.NBool;
import morphis.foundations.core.types.NNumber;
import morphis.foundations.core.types.NString;
import morphis.foundations.core.types.Types;
import morphis.foundations.core.util.Ref;

public class Eokutil {

	private static boolean packageExists() {
		return Efkimag.packageExists();
	}
	
	public static NBool fAppHasDocType(NNumber appId, NString docType) {
		if(packageExists()){
			return EokutilImp.fAppHasDocType(appId, docType);
		}
		return NBool.getNull();
	}

	public static NNumber fAppHasDocTypeField(NString appname) {
		if(packageExists()){
			return EokutilImp.fAppHasDocTypeField(appname);
		}
		return NNumber.getNull();
	}

	public static NBool fDocTypeInUse(NNumber appId, NString docType) {
		if(packageExists()){
			return EokutilImp.fDocTypeInUse(appId, docType);
		}
		return NBool.getNull();
	}

	public static NBool fDtypExists(NString vDtypIn) {
		if(packageExists()){
			return EokutilImp.fDtypExists(vDtypIn);
		}
		return NBool.getNull();
	}

	public static NString fDtypListIsValid(NString stringIn) {
		if(packageExists()){
			return EokutilImp.fDtypListIsValid(stringIn);
		}
		return NString.getNull();
	}

	public static NNumber fGetAppidFromAppname(NString appnameIn) {
		if(packageExists()){
			return EokutilImp.fGetAppidFromAppname(appnameIn);
		}
		return NNumber.getNull();
	}

	public static NBool fGetBxsSetting(Ref<NString> userPrefEnabled,
			Ref<NString> dataSource, Ref<NString> axRootUrl,
			Ref<NString> wxRootUrl, Ref<NString> csbInvokes,
			Ref<NString> inbInvokes, Ref<NNumber> axDocSrc,
			Ref<NNumber> wxDocSrc) {
		if(packageExists()){
			return EokutilImp.fGetBxsSetting(userPrefEnabled,
					dataSource, axRootUrl,
					wxRootUrl, csbInvokes,
					inbInvokes, axDocSrc,
					wxDocSrc);
		}
		return NBool.getNull();
	}

	public static NNumber fGetColumnNumber(NString pAppname, NString pColumnName) {
		if(packageExists()){
			return EokutilImp.fGetColumnNumber(pAppname, pColumnName);
		}
		return NNumber.getNull();
	}

	public static NString fGetPseudoPrefix() {
		if(packageExists()){
			return EokutilImp.fGetPseudoPrefix();
		}
		return NString.getNull();
	}

	public static NNumber fRfFieldtype(NNumber appidIn,	NString fieldnameIn) {
		if(packageExists()){
			return EokutilImp.fRfFieldtype(appidIn, fieldnameIn);
		}
		return NNumber.getNull();
	}

	public static NBool fUserHasPriv(NString username, NNumber appId, NNumber privBit) {
		if(packageExists()){
			return EokutilImp.fUserHasPriv(username, appId, privBit);
		}
		return NBool.getNull();
	}

	public static void pAddRemoveAppDocType(NNumber appId, NString docType, NNumber addRemoveFlag) {
		if(packageExists()){
			EokutilImp.pAddRemoveAppDocType(appId, docType, addRemoveFlag);
		}
	}
	
	static class EokutilImp {
			
	
		static NBool fAppHasDocType(NNumber appId, NString docType) {
	
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
					"EOKUTIL.F_APP_HAS_DOC_TYPE", DbManager.getDataBaseFactory());
	
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@APP_ID", appId);
			cmd.addParameter("@DOC_TYPE", docType);
	
			cmd.execute();
	
			return cmd.getReturnValue(NBool.class);
	
		}
	
		static NNumber fAppHasDocTypeField(NString appname) {
	
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
					"EOKUTIL.F_APP_HAS_DOC_TYPE_FIELD",
					DbManager.getDataBaseFactory());
	
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@APPNAME", appname);
	
			cmd.execute();
	
			return cmd.getReturnValue(NNumber.class);
	
		}
	
		static NBool fDocTypeInUse(NNumber appId, NString docType) {
	
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
					"EOKUTIL.F_DOC_TYPE_IN_USE", DbManager.getDataBaseFactory());
	
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@APP_ID", appId);
			cmd.addParameter("@DOC_TYPE", docType);
	
			cmd.execute();
	
			return cmd.getReturnValue(NBool.class);
	
		}
	
		static NBool fDtypExists(NString vDtypIn) {
	
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
					"EOKUTIL.F_DTYP_EXISTS", DbManager.getDataBaseFactory());
	
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@V_DTYP_IN", vDtypIn);
	
			cmd.execute();
	
			return cmd.getReturnValue(NBool.class);
	
		}
	
		static NString fDtypListIsValid(NString stringIn) {
	
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
					"EOKUTIL.F_DTYP_LIST_IS_VALID", DbManager.getDataBaseFactory());
	
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@STRING_IN", stringIn);
	
			cmd.execute();
	
			return cmd.getReturnValue(NString.class);
	
		}
	
		static NNumber fGetAppidFromAppname(NString appnameIn) {
	
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
					"EOKUTIL.F_GET_APPID_FROM_APPNAME",
					DbManager.getDataBaseFactory());
	
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@APPNAME_IN", appnameIn);
	
			cmd.execute();
	
			return cmd.getReturnValue(NNumber.class);
	
		}
	
		static NBool fGetBxsSetting(Ref<NString> userPrefEnabled,
				Ref<NString> dataSource, Ref<NString> axRootUrl,
				Ref<NString> wxRootUrl, Ref<NString> csbInvokes,
				Ref<NString> inbInvokes, Ref<NNumber> axDocSrc,
				Ref<NNumber> wxDocSrc) {
	
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
					"EOKUTIL.F_GET_BXS_SETTING", DbManager.getDataBaseFactory());
	
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@USER_PREF_ENABLED", NString.class);
			cmd.addParameter("@DATA_SOURCE", NString.class);
			cmd.addParameter("@AX_ROOT_URL", NString.class);
			cmd.addParameter("@WX_ROOT_URL", NString.class);
			cmd.addParameter("@CSB_INVOKES", NString.class);
			cmd.addParameter("@INB_INVOKES", NString.class);
			cmd.addParameter("@AX_DOC_SRC", NNumber.class);
			cmd.addParameter("@WX_DOC_SRC", NNumber.class);
	
			cmd.execute();
			userPrefEnabled.val = cmd.getParameterValue("@USER_PREF_ENABLED",
					NString.class);
			dataSource.val = cmd.getParameterValue("@DATA_SOURCE",
					NString.class);
			axRootUrl.val = cmd.getParameterValue("@AX_ROOT_URL",
					NString.class);
			wxRootUrl.val = cmd.getParameterValue("@WX_ROOT_URL",
					NString.class);
			csbInvokes.val = cmd.getParameterValue("@CSB_INVOKES",
					NString.class);
			inbInvokes.val = cmd.getParameterValue("@INB_INVOKES",
					NString.class);
			axDocSrc.val = cmd.getParameterValue("@AX_DOC_SRC",
					NNumber.class);
			wxDocSrc.val = cmd.getParameterValue("@WX_DOC_SRC",
					NNumber.class);
	
			return cmd.getReturnValue(NBool.class);
	
		}
	
		static NNumber fGetColumnNumber(NString pAppname,
				NString pColumnName) {
	
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
					"EOKUTIL.F_GET_COLUMN_NUMBER", DbManager.getDataBaseFactory());
	
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_APPNAME", pAppname);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
	
			cmd.execute();
	
			return cmd.getReturnValue(NNumber.class);
	
		}
	
		static NString fGetPseudoPrefix() {
	
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
					"EOKUTIL.F_GET_PSEUDO_PREFIX", DbManager.getDataBaseFactory());
	
			cmd.addReturnParameter(NString.class);
	
			cmd.execute();
	
			return cmd.getReturnValue(NString.class);
	
		}
	
		static NNumber fRfFieldtype(NNumber appidIn,
				NString fieldnameIn) {
	
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
					"EOKUTIL.F_RF_FIELDTYPE", DbManager.getDataBaseFactory());
	
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@APPID_IN", appidIn);
			cmd.addParameter("@FIELDNAME_IN", fieldnameIn);
	
			cmd.execute();
	
			return cmd.getReturnValue(NNumber.class);
	
		}
	
		static NBool fUserHasPriv(NString username, NNumber appId,
				NNumber privBit) {
	
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
					"EOKUTIL.F_USER_HAS_PRIV", DbManager.getDataBaseFactory());
	
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@USERNAME", username);
			cmd.addParameter("@APP_ID", appId);
			cmd.addParameter("@PRIV_BIT", privBit);
	
			cmd.execute();
	
			return cmd.getReturnValue(NBool.class);
	
		}
	
		static void pAddRemoveAppDocType(NNumber appId, NString docType,
				NNumber addRemoveFlag) {
	
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
					"EOKUTIL.P_ADD_REMOVE_APP_DOC_TYPE",
					DbManager.getDataBaseFactory());
	
			cmd.addParameter("@APP_ID", appId);
			cmd.addParameter("@DOC_TYPE", docType);
			cmd.addParameter("@ADD_REMOVE_FLAG", addRemoveFlag);
	
			cmd.execute();
	
		}
	}
}