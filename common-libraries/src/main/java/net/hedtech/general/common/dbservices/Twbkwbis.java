package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Twbkwbis {
		public static NString fCgibin() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKWBIS.F_CGIBIN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCheckpositiveind(NString cursorvalue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKWBIS.F_CHECKPOSITIVEIND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@CURSORVALUE", cursorvalue);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCssLink() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKWBIS.F_CSS_LINK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fDispinfo(NString _name,NString label,NString msgText,NString msgType,NString value1,NString value2) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKWBIS.F_DISPINFO", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@NAME", _name);
			cmd.addParameter("@LABEL", label);
			cmd.addParameter("@MSG_TEXT", msgText);
			cmd.addParameter("@MSG_TYPE", msgType);
			cmd.addParameter("@VALUE1", value1);
			cmd.addParameter("@VALUE2", value2);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fFetchwtparam(NString paramName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKWBIS.F_FETCHWTPARAM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PARAM_NAME", paramName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NDate fFmtdate(NString str) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKWBIS.F_FMTDATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@STR", str);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
		public static NString fFormselectoption(NString cdispvalue,NString cpassvalue,NString cselected,NString cattributes) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKWBIS.F_FORMSELECTOPTION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@CDISPVALUE", cdispvalue);
			cmd.addParameter("@CPASSVALUE", cpassvalue);
			cmd.addParameter("@CSELECTED", cselected);
			cmd.addParameter("@CATTRIBUTES", cattributes);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGenrandid(NString id) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKWBIS.F_GENRANDID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@ID", id);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetCookie(NString pName,NString pDecode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKWBIS.F_GET_COOKIE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_NAME", pName);
			cmd.addParameter("@P_DECODE", pDecode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetSessidCookie(NString pName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKWBIS.F_GET_SESSID_COOKIE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_NAME", pName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetparam(NNumber pidm,NString _name,NString encrFlag) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKWBIS.F_GETPARAM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@NAME", _name);
			cmd.addParameter("@ENCR_FLAG", encrFlag);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool fIsdate(NString str,NString fmtStr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKWBIS.F_ISDATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@STR", str);
			cmd.addParameter("@FMT_STR", fmtStr);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NString fNvl(NString checkValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKWBIS.F_NVL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@CHECK_VALUE", checkValue);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fRacesurveycriteria(NNumber pidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKWBIS.F_RACESURVEYCRITERIA", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM", pidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fTabledataopen(NString cvalue,NString calign,NString cdp,NString cnowrap,NString crowspan,NString ccolspan,NString cattributes) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKWBIS.F_TABLEDATAOPEN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@CVALUE", cvalue);
			cmd.addParameter("@CALIGN", calign);
			cmd.addParameter("@CDP", cdp);
			cmd.addParameter("@CNOWRAP", cnowrap);
			cmd.addParameter("@CROWSPAN", crowspan);
			cmd.addParameter("@CCOLSPAN", ccolspan);
			cmd.addParameter("@CATTRIBUTES", cattributes);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool fValidlink(NString _name) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKWBIS.F_VALIDLINK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@NAME", _name);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fValidrole(NString _name,NString nameType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKWBIS.F_VALIDROLE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@NAME", _name);
			cmd.addParameter("@NAME_TYPE", nameType);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fValiduser(Ref<NNumber> pidm,NBool insecureAllowed,NBool checkOnly,NBool closeHttpHeader,NString framesetIn,NString menuIn,NString loginPidm,NString loginWebid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKWBIS.F_VALIDUSER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PIDM", pidm, true);
			cmd.addParameter("@INSECURE_ALLOWED", insecureAllowed);
			cmd.addParameter("@CHECK_ONLY", checkOnly);
			cmd.addParameter("@CLOSE_HTTP_HEADER", closeHttpHeader);
			cmd.addParameter("@FRAMESET_IN", framesetIn);
			cmd.addParameter("@MENU_IN", menuIn);
			cmd.addParameter("@LOGIN_PIDM", loginPidm);
			cmd.addParameter("@LOGIN_WEBID", loginWebid);
				
			cmd.execute();
			pidm.val = cmd.getParameterValue("@PIDM", NNumber.class);

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void pAdminLogin() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKWBIS.P_ADMIN_LOGIN", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pChangepin(NString msg,NString retLoc,NString retType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKWBIS.P_CHANGEPIN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MSG", msg);
			cmd.addParameter("@RET_LOC", retLoc);
			cmd.addParameter("@RET_TYPE", retType);
				
			cmd.execute();


		}
		
		public static void pChecktoken(NNumber pidm,NString appToken,Ref<NString> successFlag) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKWBIS.P_CHECKTOKEN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@APP_TOKEN", appToken);
			cmd.addParameter("@SUCCESS_FLAG", NString.class);
				
			cmd.execute();
			successFlag.val = cmd.getParameterValue("@SUCCESS_FLAG", NString.class);


		}
		
		public static void pClosedoc(NString releaseNo,NBool printBottomLinks,NString exitUrl,NBool dispExitLink,NString backUrl,NString dfltBackLink,NBool printModuleBottomLinks) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKWBIS.P_CLOSEDOC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RELEASE_NO", releaseNo);
			cmd.addParameter("@PRINT_BOTTOM_LINKS", printBottomLinks);
			cmd.addParameter("@EXIT_URL", exitUrl);
			cmd.addParameter("@DISP_EXIT_LINK", dispExitLink);
			cmd.addParameter("@BACK_URL", backUrl);
			cmd.addParameter("@DFLT_BACK_LINK", dfltBackLink);
			cmd.addParameter("@PRINT_MODULE_BOTTOM_LINKS", printModuleBottomLinks);
				
			cmd.execute();


		}
		
		public static void pDispchangepin() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKWBIS.P_DISPCHANGEPIN", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pDispinfo(NString _name,NString label,NString msgText,NString msgType,NString value1,NString value2) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKWBIS.P_DISPINFO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NAME", _name);
			cmd.addParameter("@LABEL", label);
			cmd.addParameter("@MSG_TEXT", msgText);
			cmd.addParameter("@MSG_TYPE", msgType);
			cmd.addParameter("@VALUE1", value1);
			cmd.addParameter("@VALUE2", value2);
				
			cmd.execute();


		}
		
		public static void pDispsecurityquestion(NNumber pidm,NString question1,NString answer1,NString question2,NString answer2) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKWBIS.P_DISPSECURITYQUESTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@QUESTION1", question1);
			cmd.addParameter("@ANSWER1", answer1);
			cmd.addParameter("@QUESTION2", question2);
			cmd.addParameter("@ANSWER2", answer2);
				
			cmd.execute();


		}
		
		public static void pFetchsecurecookie(Ref<NString> cookieValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKWBIS.P_FETCHSECURECOOKIE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@COOKIE_VALUE", cookieValue, true);
				
			cmd.execute();
			cookieValue.val = cmd.getParameterValue("@COOKIE_VALUE", NString.class);


		}
		
		public static void pFirstmenu(NNumber pidm,NString webid,NString usageBtn,NString retCode,NString cpInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKWBIS.P_FIRSTMENU", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@WEBID", webid);
			cmd.addParameter("@USAGE_BTN", usageBtn);
			cmd.addParameter("@RET_CODE", retCode);
			cmd.addParameter("@CP_IND", cpInd);
				
			cmd.execute();


		}
		
		public static void pFormselectoption(NString cdispvalue,NString cpassvalue,NString cselected,NString cattributes) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKWBIS.P_FORMSELECTOPTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CDISPVALUE", cdispvalue);
			cmd.addParameter("@CPASSVALUE", cpassvalue);
			cmd.addParameter("@CSELECTED", cselected);
			cmd.addParameter("@CATTRIBUTES", cattributes);
				
			cmd.execute();


		}
		
		public static void pGenmenu(NString _name,NString msg,NString exitUrl,NString releaseNo,NString messageType,NString accessibility) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKWBIS.P_GENMENU", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NAME", _name);
			cmd.addParameter("@MSG", msg);
			cmd.addParameter("@EXIT_URL", exitUrl);
			cmd.addParameter("@RELEASE_NO", releaseNo);
			cmd.addParameter("@MESSAGE_TYPE", messageType);
			cmd.addParameter("@ACCESSIBILITY", accessibility);
				
			cmd.execute();


		}
		
		public static void pIdmLogin() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKWBIS.P_IDM_LOGIN", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pIdmLogout() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKWBIS.P_IDM_LOGOUT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pLaunchapp(NString urlParam,NString logoutInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKWBIS.P_LAUNCHAPP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@URL_PARAM", urlParam);
			cmd.addParameter("@LOGOUT_IND", logoutInd);
				
			cmd.execute();


		}
		
		public static void pLogout(NNumber pidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKWBIS.P_LOGOUT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
				
			cmd.execute();


		}
		
		public static void pMetaforward(NString retLocation) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKWBIS.P_METAFORWARD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RET_LOCATION", retLocation);
				
			cmd.execute();


		}
		
		public static void pOpendoc(NString _name,NString titleText,NString headerText,NNumber refreshDelay,NString refreshUrl,NBool reloadNavbar,NString additionalBodyOnload,NString exitUrl,NBool dispExitLink,NString backUrl,NString dfltBackLink,NString suppressHeader,NString headerDisp1,NString headerDisp2,NString headerDisp3,NString headerDisp4) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKWBIS.P_OPENDOC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NAME", _name);
			cmd.addParameter("@TITLE_TEXT", titleText);
			cmd.addParameter("@HEADER_TEXT", headerText);
			cmd.addParameter("@REFRESH_DELAY", refreshDelay);
			cmd.addParameter("@REFRESH_URL", refreshUrl);
			cmd.addParameter("@RELOAD_NAVBAR", reloadNavbar);
			cmd.addParameter("@ADDITIONAL_BODY_ONLOAD", additionalBodyOnload);
			cmd.addParameter("@EXIT_URL", exitUrl);
			cmd.addParameter("@DISP_EXIT_LINK", dispExitLink);
			cmd.addParameter("@BACK_URL", backUrl);
			cmd.addParameter("@DFLT_BACK_LINK", dfltBackLink);
			cmd.addParameter("@SUPPRESS_HEADER", suppressHeader);
			cmd.addParameter("@HEADER_DISP1", headerDisp1);
			cmd.addParameter("@HEADER_DISP2", headerDisp2);
			cmd.addParameter("@HEADER_DISP3", headerDisp3);
			cmd.addParameter("@HEADER_DISP4", headerDisp4);
				
			cmd.execute();


		}
		
		public static void pProcchangepin(NString oldpin,NString newpin,NString verpin,NString retLoc,NString retType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKWBIS.P_PROCCHANGEPIN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OLDPIN", oldpin);
			cmd.addParameter("@NEWPIN", newpin);
			cmd.addParameter("@VERPIN", verpin);
			cmd.addParameter("@RET_LOC", retLoc);
			cmd.addParameter("@RET_TYPE", retType);
				
			cmd.execute();


		}
		
		public static void pProcsecurityanswer(NString sid,NString qstnNum,NString answer,NString tempid,NString newpin,NString verpin,NString retCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKWBIS.P_PROCSECURITYANSWER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SID", sid);
			cmd.addParameter("@QSTN_NUM", qstnNum);
			cmd.addParameter("@ANSWER", answer);
			cmd.addParameter("@TEMPID", tempid);
			cmd.addParameter("@NEWPIN", newpin);
			cmd.addParameter("@VERPIN", verpin);
			cmd.addParameter("@RET_CODE", retCode);
				
			cmd.execute();


		}
		
		public static void pProcsecurityquestion(NString question1,NString answer1,NString question2,NString answer2,NNumber questionNum,NString pPin,NString retLoc,NString retType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKWBIS.P_PROCSECURITYQUESTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@QUESTION1", question1);
			cmd.addParameter("@ANSWER1", answer1);
			cmd.addParameter("@QUESTION2", question2);
			cmd.addParameter("@ANSWER2", answer2);
			cmd.addParameter("@QUESTION_NUM", questionNum);
			cmd.addParameter("@P_PIN", pPin);
			cmd.addParameter("@RET_LOC", retLoc);
			cmd.addParameter("@RET_TYPE", retType);
				
			cmd.execute();


		}
		
		public static void pRedirecturl(NString url) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKWBIS.P_REDIRECTURL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@URL", url);
				
			cmd.execute();


		}
		
		public static void pSecurelogin(NString pToken) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKWBIS.P_SECURELOGIN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TOKEN", pToken);
				
			cmd.execute();


		}
		
		public static void pSecurityanswer(NString sid,NString msg,NString retCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKWBIS.P_SECURITYANSWER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SID", sid);
			cmd.addParameter("@MSG", msg);
			cmd.addParameter("@RET_CODE", retCode);
				
			cmd.execute();


		}
		
		public static void pSecurityerrorpage(NString msg,NString retCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKWBIS.P_SECURITYERRORPAGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MSG", msg);
			cmd.addParameter("@RET_CODE", retCode);
				
			cmd.execute();


		}
		
		public static void pSecurityquestion(NString msg,NString question1,NString answer1,NString question2,NString answer2,NString retLoc,NString retType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKWBIS.P_SECURITYQUESTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MSG", msg);
			cmd.addParameter("@QUESTION1", question1);
			cmd.addParameter("@ANSWER1", answer1);
			cmd.addParameter("@QUESTION2", question2);
			cmd.addParameter("@ANSWER2", answer2);
			cmd.addParameter("@RET_LOC", retLoc);
			cmd.addParameter("@RET_TYPE", retType);
				
			cmd.execute();


		}
		
		public static void pSendCookie(NString pName,NString pValue,NDate pExpires,NString pPath,NString pDomain,NString pSecure,NString pHttponly,NString pRemove,NString pEncode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKWBIS.P_SEND_COOKIE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_NAME", pName);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_EXPIRES", pExpires);
			cmd.addParameter("@P_PATH", pPath);
			cmd.addParameter("@P_DOMAIN", pDomain);
			cmd.addParameter("@P_SECURE", pSecure);
			cmd.addParameter("@P_HTTPONLY", pHttponly);
			cmd.addParameter("@P_REMOVE", pRemove);
			cmd.addParameter("@P_ENCODE", pEncode);
				
			cmd.execute();


		}
		
		public static void pSendSessidCookie(NString pValue,NString pName,NDate pExpires,NString pPath,NString pDomain,NString pSecure,NString pHttponly,NString pRemove) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKWBIS.P_SEND_SESSID_COOKIE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_NAME", pName);
			cmd.addParameter("@P_EXPIRES", pExpires);
			cmd.addParameter("@P_PATH", pPath);
			cmd.addParameter("@P_DOMAIN", pDomain);
			cmd.addParameter("@P_SECURE", pSecure);
			cmd.addParameter("@P_HTTPONLY", pHttponly);
			cmd.addParameter("@P_REMOVE", pRemove);
				
			cmd.execute();


		}
		
		public static void pSetparam(NNumber pidm,NString _name,NString val,NString encrFlag) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKWBIS.P_SETPARAM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@NAME", _name);
			cmd.addParameter("@VAL", val);
			cmd.addParameter("@ENCR_FLAG", encrFlag);
				
			cmd.execute();


		}
		
		public static void pTabledataclose() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKWBIS.P_TABLEDATACLOSE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTabledataopen(NString cvalue,NString calign,NString cdp,NString cnowrap,NString crowspan,NString ccolspan,NString cattributes) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKWBIS.P_TABLEDATAOPEN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CVALUE", cvalue);
			cmd.addParameter("@CALIGN", calign);
			cmd.addParameter("@CDP", cdp);
			cmd.addParameter("@CNOWRAP", cnowrap);
			cmd.addParameter("@CROWSPAN", crowspan);
			cmd.addParameter("@CCOLSPAN", ccolspan);
			cmd.addParameter("@CATTRIBUTES", cattributes);
				
			cmd.execute();


		}
		
		public static void pUsagepage(NNumber pidm,NString webid,NString retCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKWBIS.P_USAGEPAGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@WEBID", webid);
			cmd.addParameter("@RET_CODE", retCode);
				
			cmd.execute();


		}
		
		public static void pValidatechangepin(NNumber pidm,NString oldpin,NString newpin,NString verpin,Ref<NString> errmsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKWBIS.P_VALIDATECHANGEPIN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@OLDPIN", oldpin);
			cmd.addParameter("@NEWPIN", newpin);
			cmd.addParameter("@VERPIN", verpin);
			cmd.addParameter("@ERRMSG", errmsg, true);
				
			cmd.execute();
			errmsg.val = cmd.getParameterValue("@ERRMSG", NString.class);


		}
		
		public static void pValidatequestionanswer(NNumber pidm,NString question1,NString answer1,NString question2,NString answer2,NNumber questionNum,NString validateBoth,Ref<NString> errmsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKWBIS.P_VALIDATEQUESTIONANSWER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@QUESTION1", question1);
			cmd.addParameter("@ANSWER1", answer1);
			cmd.addParameter("@QUESTION2", question2);
			cmd.addParameter("@ANSWER2", answer2);
			cmd.addParameter("@QUESTION_NUM", questionNum);
			cmd.addParameter("@VALIDATE_BOTH", validateBoth);
			cmd.addParameter("@ERRMSG", errmsg, true);
				
			cmd.execute();
			errmsg.val = cmd.getParameterValue("@ERRMSG", NString.class);


		}
		
		public static void pVallogin(NString sid,NString pin,NString tempid,NString newpin,NString verpin,NString retCode,NString question,NString answer,NString buttonselected) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKWBIS.P_VALLOGIN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SID", sid);
			cmd.addParameter("@PIN", pin);
			cmd.addParameter("@TEMPID", tempid);
			cmd.addParameter("@NEWPIN", newpin);
			cmd.addParameter("@VERPIN", verpin);
			cmd.addParameter("@RET_CODE", retCode);
			cmd.addParameter("@QUESTION", question);
			cmd.addParameter("@ANSWER", answer);
			cmd.addParameter("@BUTTONSELECTED", buttonselected);
				
			cmd.execute();


		}
		
		public static void pWwwlogin(NString msg,NString retCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKWBIS.P_WWWLOGIN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MSG", msg);
			cmd.addParameter("@RET_CODE", retCode);
				
			cmd.execute();


		}
		
	
	
	
}
