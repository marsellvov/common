package net.hedtech.general.common.dbservices;

import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.appdatalayer.data.IDataCommand;
import morphis.foundations.core.types.NBool;
import morphis.foundations.core.types.NDate;
import morphis.foundations.core.types.NInteger;
import morphis.foundations.core.types.NNumber;
import morphis.foundations.core.types.NString;
import morphis.foundations.core.types.Types;
import morphis.foundations.core.util.Ref;

public class GSecurity {
	
	public static NString gCheckUserAccess(NString pUser,NString pSecUser,NString pAction) {
		
		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("G$_SECURITY.G$_CHECK_USER_ACCESS", DbManager.getDataBaseFactory());
		
		cmd.addReturnParameter(NString.class);
		cmd.addParameter("@P_USER", pUser);
		cmd.addParameter("@P_SEC_USER", pSecUser);
		cmd.addParameter("@P_ACTION", pAction);
			
		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}

	//dghant (6.4.15) transformed effort of JobSub proxy wallet (enhancement CR-000128147)
	//g$_get_js_prxy_sid_fnc
	public static NString gGetJsPrxySidFnc() {
		
		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("G$_SECURITY.G$_GET_JS_PRXY_SID_FNC", DbManager.getDataBaseFactory());
		
		cmd.addReturnParameter(NString.class);
		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}
	
	//dghant (6.4.15) transformed effort of JobSub proxy wallet (enhancement CR-000128147)
	//g$_get_js_prxy_enforced_fnc
	public static NString gGetJsPrxyEnforcedFnc() {
		
		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("G$_SECURITY.G$_GET_JS_PRXY_ENFORCED_FNC", DbManager.getDataBaseFactory());
		
		cmd.addReturnParameter(NString.class);		
		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}
	
	//dghant (6.4.15) transformed effort of JobSub proxy wallet (enhancement CR-000128147)	
	//g$_get_js_prxy_user_ind_fnc
	
	public static NString gGetJsPrxyUserIndFnc(NString p_Userid) {
		
		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("G$_SECURITY.G$_GET_JS_PRXY_USER_IND_FNC", DbManager.getDataBaseFactory());
		
		cmd.addReturnParameter(NString.class);
		cmd.addParameter("@P_USERID", p_Userid);
			
		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}
	
	
	public static NString gAllowDistUserAccess(NString pUser,
			NString pObject, String pObjectType, String pMatchOption,
			String pPrivGrant, String pPrivRevoke, String pPrivDelete,
			String pPrivModify, String pPrivGrantAssign,
			String pPrivRevokeAssign, String pPrivDeleteAssign,
			String pPrivModifyAssign) {
		return gAllowDistUserAccess( pUser,
				 pObject,  Types.toStr(pObjectType),  Types.toStr(pMatchOption),
						 Types.toStr(pPrivGrant),  Types.toStr(pPrivRevoke),  Types.toStr(pPrivDelete),
								 Types.toStr(pPrivModify),  Types.toStr(pPrivGrantAssign),
										 Types.toStr(pPrivRevokeAssign),  Types.toStr(pPrivDeleteAssign),
												 Types.toStr(pPrivModifyAssign));
	}
	
	public static NString gAllowDistUserAccess(NString pUser,
			NString pObject, NString pObjectType, NString pMatchOption,
			NString pPrivGrant, NString pPrivRevoke, NString pPrivDelete,
			NString pPrivModify, NString pPrivGrantAssign,
			NString pPrivRevokeAssign, NString pPrivDeleteAssign,
			NString pPrivModifyAssign) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"G$_SECURITY.G$_ALLOW_DIST_USER_ACCESS",
				DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NString.class);
		cmd.addParameter("@P_USER", pUser);
		cmd.addParameter("@P_OBJECT", pObject);
		cmd.addParameter("@P_OBJECT_TYPE", pObjectType);
		cmd.addParameter("@P_MATCH_OPTION", pMatchOption);
		cmd.addParameter("@P_PRIV_GRANT", pPrivGrant);
		cmd.addParameter("@P_PRIV_REVOKE", pPrivRevoke);
		cmd.addParameter("@P_PRIV_DELETE", pPrivDelete);
		cmd.addParameter("@P_PRIV_MODIFY", pPrivModify);
		cmd.addParameter("@P_PRIV_GRANT_ASSIGN", pPrivGrantAssign);
		cmd.addParameter("@P_PRIV_REVOKE_ASSIGN", pPrivRevokeAssign);
		cmd.addParameter("@P_PRIV_DELETE_ASSIGN", pPrivDeleteAssign);
		cmd.addParameter("@P_PRIV_MODIFY_ASSIGN", pPrivModifyAssign);

		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}

	public static void gAuditBannerLogoff(NString pComment) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"G$_SECURITY.G$_AUDIT_BANNER_LOGOFF",
				DbManager.getDataBaseFactory());

		cmd.addParameter("@P_COMMENT", pComment);

		cmd.execute();

	}

	public static void gAuditBannerLogon(NString pSource, NString pComment) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"G$_SECURITY.G$_AUDIT_BANNER_LOGON",
				DbManager.getDataBaseFactory());

		cmd.addParameter("@P_SOURCE", pSource);
		cmd.addParameter("@P_COMMENT", pComment);

		cmd.execute();

	}

	public static void gChangePassword(NString pUsername, NString pPassword) {
		 NString pOldPassword = NString.getNull();
		 
		 gChangePassword(pUsername,	pPassword, pOldPassword);
	}
	
	
	public static void gChangePassword(NString pUsername,
			NString pPassword, NString pOldPassword) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"G$_SECURITY.G$_CHANGE_PASSWORD",
				DbManager.getDataBaseFactory());

		cmd.addParameter("@P_USERNAME", pUsername);
		cmd.addParameter("@P_PASSWORD", pPassword);
		cmd.addParameter("@P_OLD_PASSWORD", pOldPassword);

		cmd.execute();

	}

	public static void gCheckLogonRules(NString pSource, NString pUser) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"G$_SECURITY.G$_CHECK_LOGON_RULES",
				DbManager.getDataBaseFactory());

		cmd.addParameter("@P_SOURCE", pSource);
		cmd.addParameter("@P_USER", pUser);

		cmd.execute();

	}

	public static NString FgCheckLogonTimes(NString pCalendar,
			NDate pStartDate, NDate pEndDate) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"G$_SECURITY.G$_CHECK_LOGON_TIMES",
				DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NString.class);
		cmd.addParameter("@P_CALENDAR", pCalendar);
		cmd.addParameter("@P_START_DATE", pStartDate);
		cmd.addParameter("@P_END_DATE", pEndDate);

		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}

	public static NBool FgCheckSecurityFnc() {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"G$_SECURITY.G$_CHECK_SECURITY_FNC",
				DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NBool.class);

		cmd.execute();

		return cmd.getReturnValue(NBool.class);

	}

	public static void gCreateLogRecord(NString pUsername, NString pObject,
			NString pMessageTxt) {
		gCreateLogRecord(pUsername, pObject, pMessageTxt, new NNumber(1));
	}

	public static void gCreateLogRecord(NString pUsername, NString pObject,
			NString pMessageTxt, NNumber pSeverity) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"G$_SECURITY.G$_CREATE_LOG_RECORD",
				DbManager.getDataBaseFactory());

		cmd.addParameter("@P_USERNAME", pUsername);
		cmd.addParameter("@P_OBJECT", pObject);
		cmd.addParameter("@P_MESSAGE_TXT", pMessageTxt);
		cmd.addParameter("@P_SEVERITY", pSeverity);

		cmd.execute();

	}

	public static NString FgDecryptFnc(NString pValue, NNumber pSeed) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"G$_SECURITY.G$_DECRYPT_FNC", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NString.class);
		cmd.addParameter("@P_VALUE", pValue);
		cmd.addParameter("@P_SEED", pSeed);

		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}

	public static void gGetDistUserObjPrivs(NString pUser, NString pObject,
			NString pObjectType, Ref<NString> pPrivGrant,
			Ref<NString> pPrivRevoke, Ref<NString> pPrivDelete,
			Ref<NString> pPrivModify,
			Ref<NString> pPrivGrantAssign,
			Ref<NString> pPrivRevokeAssign,
			Ref<NString> pPrivDeleteAssign,
			Ref<NString> pPrivModifyAssign) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"G$_SECURITY.G$_GET_DIST_USER_OBJ_PRIVS",
				DbManager.getDataBaseFactory());

		cmd.addParameter("@P_USER", pUser);
		cmd.addParameter("@P_OBJECT", pObject);
		cmd.addParameter("@P_OBJECT_TYPE", pObjectType);
		cmd.addParameter("@P_PRIV_GRANT", NString.class);
		cmd.addParameter("@P_PRIV_REVOKE", NString.class);
		cmd.addParameter("@P_PRIV_DELETE", NString.class);
		cmd.addParameter("@P_PRIV_MODIFY", NString.class);
		cmd.addParameter("@P_PRIV_GRANT_ASSIGN", NString.class);
		cmd.addParameter("@P_PRIV_REVOKE_ASSIGN", NString.class);
		cmd.addParameter("@P_PRIV_DELETE_ASSIGN", NString.class);
		cmd.addParameter("@P_PRIV_MODIFY_ASSIGN", NString.class);

		cmd.execute();
		pPrivGrant.val = cmd.getParameterValue("@P_PRIV_GRANT",
				NString.class);
		pPrivRevoke.val = cmd.getParameterValue("@P_PRIV_REVOKE",
				NString.class);
		pPrivDelete.val = cmd.getParameterValue("@P_PRIV_DELETE",
				NString.class);
		pPrivModify.val = cmd.getParameterValue("@P_PRIV_MODIFY",
				NString.class);
		pPrivGrantAssign.val = cmd.getParameterValue(
				"@P_PRIV_GRANT_ASSIGN", NString.class);
		pPrivRevokeAssign.val = cmd.getParameterValue(
				"@P_PRIV_REVOKE_ASSIGN", NString.class);
		pPrivDeleteAssign.val = cmd.getParameterValue(
				"@P_PRIV_DELETE_ASSIGN", NString.class);
		pPrivModifyAssign.val = cmd.getParameterValue(
				"@P_PRIV_MODIFY_ASSIGN", NString.class);

	}

	public static NDate FgGetLastLoginTime(NString pUser) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"G$_SECURITY.G$_GET_LAST_LOGIN_TIME",
				DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NDate.class);
		cmd.addParameter("@P_USER", pUser);

		cmd.execute();

		return cmd.getReturnValue(NDate.class);

	}

	public static NString FgGetOraclePasswordFnc(NString pUser) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"G$_SECURITY.G$_GET_ORACLE_PASSWORD_FNC",
				DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NString.class);
		cmd.addParameter("@P_USER", pUser);

		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}

	public static NString FgGetProfileInfoFnc(NString pRequest) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"G$_SECURITY.G$_GET_PROFILE_INFO_FNC",
				DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NString.class);
		cmd.addParameter("@P_REQUEST", pRequest);

		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}

	public static NString FgGetRoleForObjectFnc(NString pObject,
			NString pUser) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"G$_SECURITY.G$_GET_ROLE_FOR_OBJECT_FNC",
				DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NString.class);
		cmd.addParameter("@P_OBJECT", pObject);
		cmd.addParameter("@P_USER", pUser);

		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}

	public static NString FgGetRolePasswordFnc(NString pRole,
			NString pObject) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"G$_SECURITY.G$_GET_ROLE_PASSWORD_FNC",
				DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NString.class);
		cmd.addParameter("@P_ROLE", pRole);
		cmd.addParameter("@P_OBJECT", pObject);

		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}

	public static NString FgGetTabDescFnc(NString pForm, NString pTab) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"G$_SECURITY.G$_GET_TAB_DESC_FNC",
				DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NString.class);
		cmd.addParameter("@P_FORM", pForm);
		cmd.addParameter("@P_TAB", pTab);

		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}

	public static NString FgGetTabSecurityFnc(NString pFormName,
			NString pUser) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"G$_SECURITY.G$_GET_TAB_SECURITY_FNC",
				DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NString.class);
		cmd.addParameter("@P_FORM_NAME", pFormName);
		cmd.addParameter("@P_USER", pUser);

		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}

	public static NString FgGetUsernameName(NString pUser) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"G$_SECURITY.G$_GET_USERNAME_NAME",
				DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NString.class);
		cmd.addParameter("@P_USER", pUser);

		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}

	public static NNumber FgSetPasswordFnc(NString pRole) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"G$_SECURITY.G$_SET_PASSWORD_FNC",
				DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NNumber.class);
		cmd.addParameter("@P_ROLE", pRole);

		cmd.execute();

		return cmd.getReturnValue(NNumber.class);

	}
	
	
	public static NNumber gFGetTofuOpt() {
		
		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("G$_SECURITY.G$_F_GET_TOFU_OPT", DbManager.getDataBaseFactory());
		
		cmd.addReturnParameter(NNumber.class);	
		cmd.execute();

		return cmd.getReturnValue(NNumber.class);


	}

/*	public static void gVerifyPassword1Prd(NString pObject,
			NString pVersion, Ref<NString> pPassword,
			Ref<NString> pRole) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"G$_SECURITY.G$_VERIFY_PASSWORD1_PRD",
				DbManager.getDataBaseFactory());

		cmd.addParameter("@P_OBJECT", pObject);
		cmd.addParameter("@P_VERSION", pVersion);
		cmd.addParameter("@P_PASSWORD", pPassword, true);
		cmd.addParameter("@P_ROLE", NString.class);

		cmd.execute();
		pPassword.val = cmd.getParameterValue("@P_PASSWORD",
				NString.class);
		pRole.val = cmd.getParameterValue("@P_ROLE", NString.class);

	}*/
	
	public static void gVerifyPassword1Prd(NString pObject,
			NString pVersion, Ref<NString> pPassword,
			Ref<NString> pRole) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"G$_SECURITY.G$_VERIFY_PASSWORD1_TRANS",
				DbManager.getDataBaseFactory());

		cmd.addParameter("@P_OBJECT", pObject);
		cmd.addParameter("@P_VERSION", pVersion);
		cmd.addParameter("@P_PASSWORD", pPassword, true);
		cmd.addParameter("@P_ROLE", NString.class);

		cmd.execute();
		pPassword.val = cmd.getParameterValue("@P_PASSWORD",
				NString.class);
		pRole.val = cmd.getParameterValue("@P_ROLE", NString.class);

	}

	public static void gbDisplaymaskPCreate(NString pObjsCode,
			NString pBlockName, NString pColumnName,
			Ref<NNumber> pSeqnoOut, NString pDisplayInd,
			NString pConcealInd, NString pAllUserInd, NString pUserId,
			NString pDataMask, NString pFgacUserId, NString pFbprCode,
			NString pMaskDirection, NNumber pMaskLength,
			NString pObjsCompName, NString pBlockCompName,
			NString pColumnCompName, Ref<NString> pRowidOut) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"G$_SECURITY.GB_DISPLAYMASK_P_CREATE",
				DbManager.getDataBaseFactory());

		cmd.addParameter("@P_OBJS_CODE", pObjsCode);
		cmd.addParameter("@P_BLOCK_NAME", pBlockName);
		cmd.addParameter("@P_COLUMN_NAME", pColumnName);
		cmd.addParameter("@P_SEQNO_OUT", pSeqnoOut, true);
		cmd.addParameter("@P_DISPLAY_IND", pDisplayInd);
		cmd.addParameter("@P_CONCEAL_IND", pConcealInd);
		cmd.addParameter("@P_ALL_USER_IND", pAllUserInd);
		cmd.addParameter("@P_USER_ID", pUserId);
		cmd.addParameter("@P_DATA_MASK", pDataMask);
		cmd.addParameter("@P_FGAC_USER_ID", pFgacUserId);
		cmd.addParameter("@P_FBPR_CODE", pFbprCode);
		cmd.addParameter("@P_MASK_DIRECTION", pMaskDirection);
		cmd.addParameter("@P_MASK_LENGTH", pMaskLength);
		cmd.addParameter("@P_OBJS_COMP_NAME", pObjsCompName);
		cmd.addParameter("@P_BLOCK_COMP_NAME", pBlockCompName);
		cmd.addParameter("@P_COLUMN_COMP_NAME", pColumnCompName);
		cmd.addParameter("@P_ROWID_OUT", NString.class);

		cmd.execute();
		pSeqnoOut.val = cmd.getParameterValue("@P_SEQNO_OUT",
				NNumber.class);
		pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT",
				NString.class);

	}

	public static void pTrackAccess(NString pObject, NString pVersion,
			NString pRole, NString pSysTracking, NString pObjTracking) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"G$_SECURITY.P_TRACK_ACCESS", DbManager.getDataBaseFactory());

		cmd.addParameter("@P_OBJECT", pObject);
		cmd.addParameter("@P_VERSION", pVersion);
		cmd.addParameter("@P_ROLE", pRole);
		cmd.addParameter("@P_SYS_TRACKING", pSysTracking);
		cmd.addParameter("@P_OBJ_TRACKING", pObjTracking);

		cmd.execute();

	}
	

	public static NString FgCheckUserAccess(NString pUser,NString pSecUser,NString pAction) {
		
		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("G$_SECURITY.G$_CHECK_USER_ACCESS", DbManager.getDataBaseFactory());
		
		cmd.addReturnParameter(NString.class);
		cmd.addParameter("@P_USER", pUser);
		cmd.addParameter("@P_SEC_USER", pSecUser);
		cmd.addParameter("@P_ACTION", pAction);
			
		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}
	
	/**
	 * Function G$_SET_PASSWORD_FNC of Package G$_SECURITY
	 *  
	 */
	public static NInteger gSetPasswordFnc(NString pRole) {
		
		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("G$_SECURITY.G$_SET_PASSWORD_FNC", DbManager.getDataBaseFactory());
		
		cmd.addReturnParameter(NInteger.class);
		cmd.addParameter("@P_ROLE", pRole);

		cmd.execute();
		
		return cmd.getReturnValue(NInteger.class); 
	}
	
	/**
	 * 
	 */
	public static NString gGetUsernameName(NString pUser) {
		
		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("G$_SECURITY.G$_GET_USERNAME_NAME", DbManager.getDataBaseFactory());
		
		cmd.addReturnParameter(NString.class);
		cmd.addParameter("@P_USER", pUser);

		cmd.execute();
		
		return cmd.getReturnValue(NString.class); 
	}

	
	/**
	 * 
	 */
	public static NString gGetTabDescFnc(NString pForm, NString pTab) {
		
		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("G$_SECURITY.G$_GET_TAB_DESC_FNC", DbManager.getDataBaseFactory());
		
		cmd.addReturnParameter(NString.class);
		cmd.addParameter("@P_FORM", pForm);
		cmd.addParameter("@P_TAB", pTab);

		cmd.execute();
		
		return cmd.getReturnValue(NString.class); 
	}
	
	
	/**
	 * 
	 */
	public static NString gGetTabSecurityFnc(NString pFormName, NString pUser) {
		
		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("G$_SECURITY.G$_GET_TAB_SECURITY_FNC", DbManager.getDataBaseFactory());
		
		cmd.addReturnParameter(NString.class);
		cmd.addParameter("@P_FORM_NAME", pFormName);
		cmd.addParameter("@P_USER", pUser);

		cmd.execute();
		
		return cmd.getReturnValue(NString.class); 
	}
}