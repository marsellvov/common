package net.hedtech.general.common.dbservices;

import morphis.foundations.core.appdatalayer.data.DataCommand;
import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.appdatalayer.data.IDataCommand;
import morphis.foundations.core.appdatalayer.data.NoDataFoundException;
import morphis.foundations.core.appdatalayer.data.ResultSet;
import morphis.foundations.core.appdatalayer.data.TooManyRowsException;
import morphis.foundations.core.appsupportlib.exceptions.ApplicationException;
import morphis.foundations.core.types.NBool;
import morphis.foundations.core.types.NNumber;
import morphis.foundations.core.types.NString;
import morphis.foundations.core.types.Types;
import morphis.foundations.core.util.Ref;

public class Efkimag {
	
	private static NBool packageExists = NBool.getNull();

	public static boolean packageExists() {
		if(packageExists.isNull())
			checkPackageExists();
		return packageExists.getValue();
	}
	
	private static void checkPackageExists() {
		try {
			String sql1 = "SELECT COUNT(*) NUM FROM ALL_TABLES WHERE OWNER = 'BANIMGR' AND TABLE_NAME = 'EURVERS'";
			DataCommand command1 = new DataCommand(sql1);
			ResultSet results1 = command1.executeQuery();
			int rowCount = command1.getRowCount();
			if ( results1.hasData() ) {
				packageExists = Types.toBool(results1.getNumber(0).equals(1));
			}
			results1.close();
		}
		catch(NoDataFoundException e)
		{
		}
		catch(TooManyRowsException e)
		{
		}	
	}

	public static NNumber fAppidFromAppname(NString axAppnameIn) {
		if(packageExists()){
			return EfkimagImp.fAppidFromAppname(axAppnameIn);
		}
		return NNumber.getNull();
	}


	public static NNumber fDataIsBannerData(NString indexArray, NNumber appid) {
		if(packageExists()){
			return EfkimagImp.fDataIsBannerData(indexArray, appid);
		}
		return NNumber.getNull();
	}

	public static NString fGetAppnameFromAppid(NNumber appidInt) {
		if(packageExists()){
			return EfkimagImp.fGetAppnameFromAppid(appidInt);
		}
		return NString.getNull();
	}

	public static NString fGetDataSourceName() {
		if(packageExists()){
			return EfkimagImp.fGetDataSourceName();
		}
		return NString.getNull();
	}

	public static NString fGetIndexFieldVal(NString indexArray, NNumber fieldOrdinalPos) {
		if(packageExists()){
			return EfkimagImp.fGetIndexFieldVal(indexArray, fieldOrdinalPos);
		}
		return NString.getNull();
	}

	public static NString fGetUlTablename(NNumber axAppid, NString axFieldname) {
		if(packageExists()){
			return EfkimagImp.fGetUlTablename(axAppid, axFieldname);
		}
		return NString.getNull();
	}

	public static void pAxsctaiqueryexec(NNumber vAppid, NString vUsername,
			NString vQueryselect, NString vQuerywhere,
			NString vQueryorderby, NString vLocale, NString vSessionid,
			Ref<NString> vReturnquery, Ref<NString> vInfomsg,
			Ref<NNumber> vInfomsgstyle) {
		if(packageExists()){
			EfkimagImp.pAxsctaiqueryexec(vAppid, vUsername,
					vQueryselect, vQuerywhere,
					vQueryorderby, vLocale, vSessionid,
					vReturnquery, vInfomsg,
					vInfomsgstyle);
		}
	}

	public static void pAxsctdocaccess(NNumber vAppid, NNumber vDocid,
			NString vUsername, NString vLocale, NString vSessionid,
			Ref<NNumber> vSuccess, Ref<NString> vInfomsg,
			Ref<NNumber> vInfomsgstyle) {
		if(packageExists()){
			EfkimagImp.pAxsctdocaccess(vAppid, vDocid,
					vUsername, vLocale, vSessionid,
					vSuccess, vInfomsg,
					vInfomsgstyle);
		}	
	}

	public static void pAxsctdocdeletePost(NNumber vAppid, NNumber vDocid,
			NString vUsername, NString vLocale, NString vSessionid,
			Ref<NString> vInfomsg, Ref<NNumber> vInfomsgstyle) {
		if(packageExists()){
			EfkimagImp.pAxsctdocdeletePost(vAppid, vDocid,
					vUsername, vLocale, vSessionid,
					vInfomsg, vInfomsgstyle);
		}	
	}

	public static void pAxsctdocindexaccess(NNumber vAppid, NNumber vDocid,
			NString vIndex, NNumber vDocisreadonly, NString vUsername,
			NString vLocale, NString vSessionid,
			Ref<NString> vInfomsg, Ref<NNumber> vInfomsgstyle) {
		if(packageExists()){
			EfkimagImp.pAxsctdocindexaccess(vAppid, vDocid,
					vIndex, vDocisreadonly, vUsername,
					vLocale, vSessionid,
					vInfomsg, vInfomsgstyle);
		}	
	}

	public static void pAxsctdocindexdeletePost(NNumber vAppid,
			NNumber vDocid, NString vUsername, NString vIndex,
			NString vAllindexes, NString vLocale, NString vSessionid,
			Ref<NString> vInfomsg, Ref<NNumber> vInfomsgstyle) {
		if(packageExists()){
			EfkimagImp.pAxsctdocindexdeletePost(vAppid,
					vDocid, vUsername, vIndex,
					vAllindexes, vLocale, vSessionid,
					vInfomsg, vInfomsgstyle);
		}	
	}

	public static void pAxsctdocindexdeletePre(NNumber vAppid,
			NNumber vDocid, NString vUsername, NString vIndex,
			NString vAllindexes, NNumber vDocdelete, NString vLocale,
			NString vSessionid, Ref<NNumber> vSuccess,
			Ref<NString> vInfomsg, Ref<NNumber> vInfomsgstyle) {
		if(packageExists()){
			EfkimagImp.pAxsctdocindexdeletePre(vAppid,
					vDocid, vUsername, vIndex,
					vAllindexes, vDocdelete, vLocale,
					vSessionid, vSuccess,
					vInfomsg, vInfomsgstyle);
		}
	}

	public static void pAxsctdocindexqueryexec(NNumber vAppid,
			NNumber vDocid, NString vLocale, NString vUsername,
			NString vQueryselect, NString vQuerywhere,
			NString vQueryorderby, NString vSessionid,
			Ref<NString> vReturnquery, Ref<NString> vInfomsg,
			Ref<NNumber> vInfomsgstyle) {
		if(packageExists()){
			EfkimagImp.pAxsctdocindexqueryexec(vAppid,
					vDocid, vLocale, vUsername,
					vQueryselect, vQuerywhere,
					vQueryorderby, vSessionid,
					vReturnquery, vInfomsg,
					vInfomsgstyle);
		}
	}

	public static void pAxsctindexupdatePost(NNumber vAppid,
			NNumber vDocid, NString vUsername, NNumber vFlags,
			NString vIndex, NString vFmrindex, NString vLocale,
			NString vSessionid, Ref<NString> vInfomsg,
			Ref<NNumber> vInfomsgstyle) {
		if(packageExists()){
			EfkimagImp.pAxsctindexupdatePost(vAppid,
					vDocid, vUsername, vFlags,
					vIndex,  vFmrindex, vLocale,
					vSessionid, vInfomsg,
					vInfomsgstyle);
		}
	}


	public static void pAxsctindexupdatePre(NNumber vAppid, NNumber vDocid,
			NString vUsername, NNumber vFlags, NString vIndex,
			NString vFmrindex, NString vLocale, NString vSessionid,
			Ref<NNumber> vSuccess, Ref<NString> vInfomsg,
			Ref<NNumber> vInfomsgstyle) {
		if(packageExists()){
			EfkimagImp.pAxsctindexupdatePre(vAppid, vDocid,
					vUsername, vFlags, vIndex,
					vFmrindex, vLocale, vSessionid,
					vSuccess, vInfomsg,
					vInfomsgstyle);
		}	
	}

	public static void pAxsctqueryexec(NNumber vAppid, NString vUsername,
			NString vQueryselect, NString vQuerywhere,
			NString vQueryorderby, NString vLocale, NString vSessionid,
			Ref<NString> vReturnquery, Ref<NString> vInfomsg,
			Ref<NNumber> vInfomsgstyle) {
		if(packageExists()){
			EfkimagImp.pAxsctqueryexec(vAppid, vUsername,
					vQueryselect, vQuerywhere,
					vQueryorderby, vLocale, vSessionid,
					vReturnquery, vInfomsg,
					vInfomsgstyle);
		}	
	}

	public static void pAxsctuserlistquery(Ref<NString> vQuery) {
		if(packageExists()){
			EfkimagImp.pAxsctuserlistquery(vQuery);
		}		
	}

	public static void pBannerLinking(NNumber vAppid, NNumber vDocid,
			NString vIndexes, NString vUsername, NNumber banlnkMode,
			Ref<NString> vFeedbackMsg, Ref<NNumber> vSuccess,
			NNumber studentDocDeleteInt) {
		if(packageExists()){
			EfkimagImp.pBannerLinking(vAppid, vDocid,
					vIndexes, vUsername,  banlnkMode,
					vFeedbackMsg, vSuccess,
					studentDocDeleteInt);
		}		
	}

	public static void pGetBaxEnabledInd(NString axVersion,
			Ref<NString> enabledIndInOut,
			Ref<NString> message3InOut) {
		if(packageExists()){
			EfkimagImp.pGetBaxEnabledInd(axVersion,
					enabledIndInOut,
					message3InOut);
		}		
	}

	public static void pGetWxRootUrl(Ref<NString> webextendrootOut) {
		if(packageExists()){
			EfkimagImp.pGetWxRootUrl(webextendrootOut);
		}		
	}

	public static void pIsUserAxUser(NString schemaNameIn,
			NString usernameIn, Ref<NString> isAxUser,
			Ref<NString> message3InOut) {
		if(packageExists()){
			EfkimagImp.pIsUserAxUser(schemaNameIn,
					usernameIn, isAxUser,
					message3InOut);
		}		

	}

	public static void pUndoDispatcher(NNumber vAppid, NNumber vDocid,
			NNumber vFlags, NString vUsername, NString vIndexFormer,
			NString vIndexCurrent, Ref<NNumber> vSuccess,
			Ref<NString> vErrormsg, NBool calledFromDelete,
			NBool doDtLookup) {
		if(packageExists()){
			EfkimagImp.pUndoDispatcher(vAppid, vDocid,
					vFlags, vUsername, vIndexFormer,
					vIndexCurrent, vSuccess,
					vErrormsg, calledFromDelete,
					doDtLookup);
		}		
	}
	
	static class EfkimagImp {
	
		
		static NNumber fAppidFromAppname(NString axAppnameIn) {
	
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
					"EFKIMAG.F_APPID_FROM_APPNAME", DbManager.getDataBaseFactory());
	
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@AX_APPNAME_IN", axAppnameIn);
	
			cmd.execute();
	
			return cmd.getReturnValue(NNumber.class);
	
		}
	
		static NNumber fDataIsBannerData(NString indexArray,
				NNumber appid) {
	
			IDataCommand cmd = DbManager.getDataAccessFactory()
					.createDataCommand("EFKIMAG.F_DATA_IS_BANNER_DATA",
							DbManager.getDataBaseFactory());
	
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@INDEX_ARRAY", indexArray);
			cmd.addParameter("@APPID", appid);
	
			cmd.execute();
	
			return cmd.getReturnValue(NNumber.class);
	
		}
	
		static NString fGetAppnameFromAppid(NNumber appidInt) {
	
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
					"EFKIMAG.F_GET_APPNAME_FROM_APPID",
					DbManager.getDataBaseFactory());
	
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@APPID_INT", appidInt);
	
			cmd.execute();
	
			return cmd.getReturnValue(NString.class);
	
		}
	
		static NString fGetDataSourceName() {
	
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
					"EFKIMAG.F_GET_DATA_SOURCE_NAME",
					DbManager.getDataBaseFactory());
	
			cmd.addReturnParameter(NString.class);
	
			cmd.execute();
	
			return cmd.getReturnValue(NString.class);
	
		}
	
		static NString fGetIndexFieldVal(NString indexArray,
				NNumber fieldOrdinalPos) {
	
			IDataCommand cmd = DbManager.getDataAccessFactory()
					.createDataCommand("EFKIMAG.F_GET_INDEX_FIELD_VAL",
							DbManager.getDataBaseFactory());
	
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@INDEX_ARRAY", indexArray);
			cmd.addParameter("@FIELD_ORDINAL_POS", fieldOrdinalPos);
	
			cmd.execute();
	
			return cmd.getReturnValue(NString.class);
	
		}
	
		static NString fGetUlTablename(NNumber axAppid,
				NString axFieldname) {
	
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
					"EFKIMAG.F_GET_UL_TABLENAME", DbManager.getDataBaseFactory());
	
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@AX_APPID", axAppid);
			cmd.addParameter("@AX_FIELDNAME", axFieldname);
	
			cmd.execute();
	
			return cmd.getReturnValue(NString.class);
	
		}
	
		static void pAxsctaiqueryexec(NNumber vAppid, NString vUsername,
				NString vQueryselect, NString vQuerywhere,
				NString vQueryorderby, NString vLocale, NString vSessionid,
				Ref<NString> vReturnquery, Ref<NString> vInfomsg,
				Ref<NNumber> vInfomsgstyle) {
	
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
					"EFKIMAG.P_AXSCTAIQUERYEXEC", DbManager.getDataBaseFactory());
	
			cmd.addParameter("@V_APPID", vAppid);
			cmd.addParameter("@V_USERNAME", vUsername);
			cmd.addParameter("@V_QUERYSELECT", vQueryselect);
			cmd.addParameter("@V_QUERYWHERE", vQuerywhere);
			cmd.addParameter("@V_QUERYORDERBY", vQueryorderby);
			cmd.addParameter("@V_LOCALE", vLocale);
			cmd.addParameter("@V_SESSIONID", vSessionid);
			cmd.addParameter("@V_RETURNQUERY", NString.class);
			cmd.addParameter("@V_INFOMSG", NString.class);
			cmd.addParameter("@V_INFOMSGSTYLE", NNumber.class);
	
			cmd.execute();
			vReturnquery.val = cmd.getParameterValue("@V_RETURNQUERY",
					NString.class);
			vInfomsg.val = cmd
					.getParameterValue("@V_INFOMSG", NString.class);
			vInfomsgstyle.val = cmd.getParameterValue("@V_INFOMSGSTYLE",
					NNumber.class);
	
		}
	
		static void pAxsctdocaccess(NNumber vAppid, NNumber vDocid,
				NString vUsername, NString vLocale, NString vSessionid,
				Ref<NNumber> vSuccess, Ref<NString> vInfomsg,
				Ref<NNumber> vInfomsgstyle) {
	
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
					"EFKIMAG.P_AXSCTDOCACCESS", DbManager.getDataBaseFactory());
	
			cmd.addParameter("@V_APPID", vAppid);
			cmd.addParameter("@V_DOCID", vDocid);
			cmd.addParameter("@V_USERNAME", vUsername);
			cmd.addParameter("@V_LOCALE", vLocale);
			cmd.addParameter("@V_SESSIONID", vSessionid);
			cmd.addParameter("@V_SUCCESS", NNumber.class);
			cmd.addParameter("@V_INFOMSG", NString.class);
			cmd.addParameter("@V_INFOMSGSTYLE", NNumber.class);
	
			cmd.execute();
			vSuccess.val = cmd
					.getParameterValue("@V_SUCCESS", NNumber.class);
			vInfomsg.val = cmd
					.getParameterValue("@V_INFOMSG", NString.class);
			vInfomsgstyle.val = cmd.getParameterValue("@V_INFOMSGSTYLE",
					NNumber.class);
	
		}
	
		static void pAxsctdocdeletePost(NNumber vAppid, NNumber vDocid,
				NString vUsername, NString vLocale, NString vSessionid,
				Ref<NString> vInfomsg, Ref<NNumber> vInfomsgstyle) {
	
			IDataCommand cmd = DbManager.getDataAccessFactory()
					.createDataCommand("EFKIMAG.P_AXSCTDOCDELETE_POST",
							DbManager.getDataBaseFactory());
	
			cmd.addParameter("@V_APPID", vAppid);
			cmd.addParameter("@V_DOCID", vDocid);
			cmd.addParameter("@V_USERNAME", vUsername);
			cmd.addParameter("@V_LOCALE", vLocale);
			cmd.addParameter("@V_SESSIONID", vSessionid);
			cmd.addParameter("@V_INFOMSG", vInfomsg, true);
			cmd.addParameter("@V_INFOMSGSTYLE", vInfomsgstyle, true);
	
			cmd.execute();
			vInfomsg.val = cmd
					.getParameterValue("@V_INFOMSG", NString.class);
			vInfomsgstyle.val = cmd.getParameterValue("@V_INFOMSGSTYLE",
					NNumber.class);
	
		}
	
		static void pAxsctdocindexaccess(NNumber vAppid, NNumber vDocid,
				NString vIndex, NNumber vDocisreadonly, NString vUsername,
				NString vLocale, NString vSessionid,
				Ref<NString> vInfomsg, Ref<NNumber> vInfomsgstyle) {
	
			IDataCommand cmd = DbManager.getDataAccessFactory()
					.createDataCommand("EFKIMAG.P_AXSCTDOCINDEXACCESS",
							DbManager.getDataBaseFactory());
	
			cmd.addParameter("@V_APPID", vAppid);
			cmd.addParameter("@V_DOCID", vDocid);
			cmd.addParameter("@V_INDEX", vIndex);
			cmd.addParameter("@V_DOCISREADONLY", vDocisreadonly);
			cmd.addParameter("@V_USERNAME", vUsername);
			cmd.addParameter("@V_LOCALE", vLocale);
			cmd.addParameter("@V_SESSIONID", vSessionid);
			cmd.addParameter("@V_INFOMSG", NString.class);
			cmd.addParameter("@V_INFOMSGSTYLE", NNumber.class);
	
			cmd.execute();
			vInfomsg.val = cmd
					.getParameterValue("@V_INFOMSG", NString.class);
			vInfomsgstyle.val = cmd.getParameterValue("@V_INFOMSGSTYLE",
					NNumber.class);
	
		}
	
		static void pAxsctdocindexdeletePost(NNumber vAppid,
				NNumber vDocid, NString vUsername, NString vIndex,
				NString vAllindexes, NString vLocale, NString vSessionid,
				Ref<NString> vInfomsg, Ref<NNumber> vInfomsgstyle) {
	
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
					"EFKIMAG.P_AXSCTDOCINDEXDELETE_POST",
					DbManager.getDataBaseFactory());
	
			cmd.addParameter("@V_APPID", vAppid);
			cmd.addParameter("@V_DOCID", vDocid);
			cmd.addParameter("@V_USERNAME", vUsername);
			cmd.addParameter("@V_INDEX", vIndex);
			cmd.addParameter("@V_ALLINDEXES", vAllindexes);
			cmd.addParameter("@V_LOCALE", vLocale);
			cmd.addParameter("@V_SESSIONID", vSessionid);
			cmd.addParameter("@V_INFOMSG", vInfomsg, true);
			cmd.addParameter("@V_INFOMSGSTYLE", vInfomsgstyle, true);
	
			cmd.execute();
			vInfomsg.val = cmd
					.getParameterValue("@V_INFOMSG", NString.class);
			vInfomsgstyle.val = cmd.getParameterValue("@V_INFOMSGSTYLE",
					NNumber.class);
	
		}
	
		static void pAxsctdocindexdeletePre(NNumber vAppid,
				NNumber vDocid, NString vUsername, NString vIndex,
				NString vAllindexes, NNumber vDocdelete, NString vLocale,
				NString vSessionid, Ref<NNumber> vSuccess,
				Ref<NString> vInfomsg, Ref<NNumber> vInfomsgstyle) {
	
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
					"EFKIMAG.P_AXSCTDOCINDEXDELETE_PRE",
					DbManager.getDataBaseFactory());
	
			cmd.addParameter("@V_APPID", vAppid);
			cmd.addParameter("@V_DOCID", vDocid);
			cmd.addParameter("@V_USERNAME", vUsername);
			cmd.addParameter("@V_INDEX", vIndex);
			cmd.addParameter("@V_ALLINDEXES", vAllindexes);
			cmd.addParameter("@V_DOCDELETE", vDocdelete);
			cmd.addParameter("@V_LOCALE", vLocale);
			cmd.addParameter("@V_SESSIONID", vSessionid);
			cmd.addParameter("@V_SUCCESS", NNumber.class);
			cmd.addParameter("@V_INFOMSG", NString.class);
			cmd.addParameter("@V_INFOMSGSTYLE", NNumber.class);
	
			cmd.execute();
			vSuccess.val = cmd
					.getParameterValue("@V_SUCCESS", NNumber.class);
			vInfomsg.val = cmd
					.getParameterValue("@V_INFOMSG", NString.class);
			vInfomsgstyle.val = cmd.getParameterValue("@V_INFOMSGSTYLE",
					NNumber.class);
	
		}
	
		static void pAxsctdocindexqueryexec(NNumber vAppid,
				NNumber vDocid, NString vLocale, NString vUsername,
				NString vQueryselect, NString vQuerywhere,
				NString vQueryorderby, NString vSessionid,
				Ref<NString> vReturnquery, Ref<NString> vInfomsg,
				Ref<NNumber> vInfomsgstyle) {
	
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
					"EFKIMAG.P_AXSCTDOCINDEXQUERYEXEC",
					DbManager.getDataBaseFactory());
	
			cmd.addParameter("@V_APPID", vAppid);
			cmd.addParameter("@V_DOCID", vDocid);
			cmd.addParameter("@V_LOCALE", vLocale);
			cmd.addParameter("@V_USERNAME", vUsername);
			cmd.addParameter("@V_QUERYSELECT", vQueryselect);
			cmd.addParameter("@V_QUERYWHERE", vQuerywhere);
			cmd.addParameter("@V_QUERYORDERBY", vQueryorderby);
			cmd.addParameter("@V_SESSIONID", vSessionid);
			cmd.addParameter("@V_RETURNQUERY", NString.class);
			cmd.addParameter("@V_INFOMSG", NString.class);
			cmd.addParameter("@V_INFOMSGSTYLE", NNumber.class);
	
			cmd.execute();
			vReturnquery.val = cmd.getParameterValue("@V_RETURNQUERY",
					NString.class);
			vInfomsg.val = cmd
					.getParameterValue("@V_INFOMSG", NString.class);
			vInfomsgstyle.val = cmd.getParameterValue("@V_INFOMSGSTYLE",
					NNumber.class);
	
		}
	
		static void pAxsctindexupdatePost(NNumber vAppid,
				NNumber vDocid, NString vUsername, NNumber vFlags,
				NString vIndex, NString vFmrindex, NString vLocale,
				NString vSessionid, Ref<NString> vInfomsg,
				Ref<NNumber> vInfomsgstyle) {
	
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
					"EFKIMAG.P_AXSCTINDEXUPDATE_POST",
					DbManager.getDataBaseFactory());
	
			cmd.addParameter("@V_APPID", vAppid);
			cmd.addParameter("@V_DOCID", vDocid);
			cmd.addParameter("@V_USERNAME", vUsername);
			cmd.addParameter("@V_FLAGS", vFlags);
			cmd.addParameter("@V_INDEX", vIndex);
			cmd.addParameter("@V_FMRINDEX", vFmrindex);
			cmd.addParameter("@V_LOCALE", vLocale);
			cmd.addParameter("@V_SESSIONID", vSessionid);
			cmd.addParameter("@V_INFOMSG", vInfomsg, true);
			cmd.addParameter("@V_INFOMSGSTYLE", vInfomsgstyle, true);
	
			cmd.execute();
			vInfomsg.val = cmd
					.getParameterValue("@V_INFOMSG", NString.class);
			vInfomsgstyle.val = cmd.getParameterValue("@V_INFOMSGSTYLE",
					NNumber.class);
	
		}
	
		static void pAxsctindexupdatePre(NNumber vAppid, NNumber vDocid,
				NString vUsername, NNumber vFlags, NString vIndex,
				NString vFmrindex, NString vLocale, NString vSessionid,
				Ref<NNumber> vSuccess, Ref<NString> vInfomsg,
				Ref<NNumber> vInfomsgstyle) {
	
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
					"EFKIMAG.P_AXSCTINDEXUPDATE_PRE",
					DbManager.getDataBaseFactory());
	
			cmd.addParameter("@V_APPID", vAppid);
			cmd.addParameter("@V_DOCID", vDocid);
			cmd.addParameter("@V_USERNAME", vUsername);
			cmd.addParameter("@V_FLAGS", vFlags);
			cmd.addParameter("@V_INDEX", vIndex);
			cmd.addParameter("@V_FMRINDEX", vFmrindex);
			cmd.addParameter("@V_LOCALE", vLocale);
			cmd.addParameter("@V_SESSIONID", vSessionid);
			cmd.addParameter("@V_SUCCESS", NNumber.class);
			cmd.addParameter("@V_INFOMSG", NString.class);
			cmd.addParameter("@V_INFOMSGSTYLE", NNumber.class);
	
			cmd.execute();
			vSuccess.val = cmd
					.getParameterValue("@V_SUCCESS", NNumber.class);
			vInfomsg.val = cmd
					.getParameterValue("@V_INFOMSG", NString.class);
			vInfomsgstyle.val = cmd.getParameterValue("@V_INFOMSGSTYLE",
					NNumber.class);
	
		}
	
		static void pAxsctqueryexec(NNumber vAppid, NString vUsername,
				NString vQueryselect, NString vQuerywhere,
				NString vQueryorderby, NString vLocale, NString vSessionid,
				Ref<NString> vReturnquery, Ref<NString> vInfomsg,
				Ref<NNumber> vInfomsgstyle) {
	
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
					"EFKIMAG.P_AXSCTQUERYEXEC", DbManager.getDataBaseFactory());
	
			cmd.addParameter("@V_APPID", vAppid);
			cmd.addParameter("@V_USERNAME", vUsername);
			cmd.addParameter("@V_QUERYSELECT", vQueryselect);
			cmd.addParameter("@V_QUERYWHERE", vQuerywhere);
			cmd.addParameter("@V_QUERYORDERBY", vQueryorderby);
			cmd.addParameter("@V_LOCALE", vLocale);
			cmd.addParameter("@V_SESSIONID", vSessionid);
			cmd.addParameter("@V_RETURNQUERY", NString.class);
			cmd.addParameter("@V_INFOMSG", NString.class);
			cmd.addParameter("@V_INFOMSGSTYLE", NNumber.class);
	
			cmd.execute();
			vReturnquery.val = cmd.getParameterValue("@V_RETURNQUERY",
					NString.class);
			vInfomsg.val = cmd
					.getParameterValue("@V_INFOMSG", NString.class);
			vInfomsgstyle.val = cmd.getParameterValue("@V_INFOMSGSTYLE",
					NNumber.class);
	
		}
	
		static void pAxsctuserlistquery(Ref<NString> vQuery) {
	
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
					"EFKIMAG.P_AXSCTUSERLISTQUERY", DbManager.getDataBaseFactory());
	
			cmd.addParameter("@V_QUERY", vQuery, true);
	
			cmd.execute();
			vQuery.val = cmd.getParameterValue("@V_QUERY", NString.class);
	
		}
	
		static void pBannerLinking(NNumber vAppid, NNumber vDocid,
				NString vIndexes, NString vUsername, NNumber banlnkMode,
				Ref<NString> vFeedbackMsg, Ref<NNumber> vSuccess,
				NNumber studentDocDeleteInt) {
	
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
					"EFKIMAG.P_BANNER_LINKING", DbManager.getDataBaseFactory());
	
			cmd.addParameter("@V_APPID", vAppid);
			cmd.addParameter("@V_DOCID", vDocid);
			cmd.addParameter("@V_INDEXES", vIndexes);
			cmd.addParameter("@V_USERNAME", vUsername);
			cmd.addParameter("@BANLNK_MODE", banlnkMode);
			cmd.addParameter("@V_FEEDBACK_MSG", vFeedbackMsg, true);
			cmd.addParameter("@V_SUCCESS", vSuccess, true);
			cmd.addParameter("@STUDENT_DOC_DELETE_INT", studentDocDeleteInt);
	
			cmd.execute();
			vFeedbackMsg.val = cmd.getParameterValue("@V_FEEDBACK_MSG",
					NString.class);
			vSuccess.val = cmd
					.getParameterValue("@V_SUCCESS", NNumber.class);
	
		}
	
		static void pGetBaxEnabledInd(NString axVersion,
				Ref<NString> enabledIndInOut,
				Ref<NString> message3InOut) {
	
			IDataCommand cmd = DbManager.getDataAccessFactory()
					.createDataCommand("EFKIMAG.P_GET_BAX_ENABLED_IND",
							DbManager.getDataBaseFactory());
	
			cmd.addParameter("@AX_VERSION", axVersion);
			cmd.addParameter("@ENABLED_IND_IN_OUT", enabledIndInOut, true);
			cmd.addParameter("@MESSAGE3_IN_OUT", message3InOut, true);
	
			cmd.execute();
			enabledIndInOut.val = cmd.getParameterValue("@ENABLED_IND_IN_OUT",
					NString.class);
			message3InOut.val = cmd.getParameterValue("@MESSAGE3_IN_OUT",
					NString.class);
	
		}
	
		static void pGetWxRootUrl(Ref<NString> webextendrootOut) {
	
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
					"EFKIMAG.P_GET_WX_ROOT_URL", DbManager.getDataBaseFactory());
	
			cmd.addParameter("@WEBEXTENDROOT_OUT", NString.class);
	
			cmd.execute();
			webextendrootOut.val = cmd.getParameterValue("@WEBEXTENDROOT_OUT",
					NString.class);
	
		}
	
		static void pIsUserAxUser(NString schemaNameIn,
				NString usernameIn, Ref<NString> isAxUser,
				Ref<NString> message3InOut) {
	
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
					"EFKIMAG.P_IS_USER_AX_USER", DbManager.getDataBaseFactory());
	
			cmd.addParameter("@SCHEMA_NAME_IN", schemaNameIn);
			cmd.addParameter("@USERNAME_IN", usernameIn);
			cmd.addParameter("@IS_AX_USER", isAxUser, true);
			cmd.addParameter("@MESSAGE3_IN_OUT", message3InOut, true);
	
			cmd.execute();
			isAxUser.val = cmd.getParameterValue("@IS_AX_USER",
					NString.class);
			message3InOut.val = cmd.getParameterValue("@MESSAGE3_IN_OUT",
					NString.class);
	
		}
	
		static void pUndoDispatcher(NNumber vAppid, NNumber vDocid,
				NNumber vFlags, NString vUsername, NString vIndexFormer,
				NString vIndexCurrent, Ref<NNumber> vSuccess,
				Ref<NString> vErrormsg, NBool calledFromDelete,
				NBool doDtLookup) {
	
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
					"EFKIMAG.P_UNDO_DISPATCHER", DbManager.getDataBaseFactory());
	
			cmd.addParameter("@V_APPID", vAppid);
			cmd.addParameter("@V_DOCID", vDocid);
			cmd.addParameter("@V_FLAGS", vFlags);
			cmd.addParameter("@V_USERNAME", vUsername);
			cmd.addParameter("@V_INDEX_FORMER", vIndexFormer);
			cmd.addParameter("@V_INDEX_CURRENT", vIndexCurrent);
			cmd.addParameter("@V_SUCCESS", vSuccess, true);
			cmd.addParameter("@V_ERRORMSG", vErrormsg, true);
			cmd.addParameter("@CALLED_FROM_DELETE", calledFromDelete);
			cmd.addParameter("@DO_DT_LOOKUP", doDtLookup);
	
			cmd.execute();
			vSuccess.val = cmd
					.getParameterValue("@V_SUCCESS", NNumber.class);
			vErrormsg.val = cmd.getParameterValue("@V_ERRORMSG",
					NString.class);
	
		}
	}
}