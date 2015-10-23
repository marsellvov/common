package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Efkcust {
		public static NBool fAxsctaiqueryexecT(NNumber vAppid,NString vUsername,NString vQueryselect,NString vQuerywhere,NString vQueryorderby,NString vLocale,NString vSessionid,Ref<NString> vReturnquery,Ref<NString> vInfomsg,Ref<NNumber> vInfomsgstyle) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EFKCUST.F_AXSCTAIQUERYEXEC_T", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@V_APPID", vAppid);
			cmd.addParameter("@V_USERNAME", vUsername);
			cmd.addParameter("@V_QUERYSELECT", vQueryselect);
			cmd.addParameter("@V_QUERYWHERE", vQuerywhere);
			cmd.addParameter("@V_QUERYORDERBY", vQueryorderby);
			cmd.addParameter("@V_LOCALE", vLocale);
			cmd.addParameter("@V_SESSIONID", vSessionid);
			cmd.addParameter("@V_RETURNQUERY", vReturnquery, true);
			cmd.addParameter("@V_INFOMSG", vInfomsg, true);
			cmd.addParameter("@V_INFOMSGSTYLE", vInfomsgstyle, true);
				
			cmd.execute();
			vReturnquery.val = cmd.getParameterValue("@V_RETURNQUERY", NString.class);
			vInfomsg.val = cmd.getParameterValue("@V_INFOMSG", NString.class);
			vInfomsgstyle.val = cmd.getParameterValue("@V_INFOMSGSTYLE", NNumber.class);

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fAxsctdocaccessT(NNumber vAppid,NNumber vDocid,NString vUsername,NString vLocale,NString vSessionid,Ref<NNumber> vSuccess,Ref<NString> vInfomsg,Ref<NNumber> vInfomsgstyle) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EFKCUST.F_AXSCTDOCACCESS_T", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@V_APPID", vAppid);
			cmd.addParameter("@V_DOCID", vDocid);
			cmd.addParameter("@V_USERNAME", vUsername);
			cmd.addParameter("@V_LOCALE", vLocale);
			cmd.addParameter("@V_SESSIONID", vSessionid);
			cmd.addParameter("@V_SUCCESS", vSuccess, true);
			cmd.addParameter("@V_INFOMSG", vInfomsg, true);
			cmd.addParameter("@V_INFOMSGSTYLE", vInfomsgstyle, true);
				
			cmd.execute();
			vSuccess.val = cmd.getParameterValue("@V_SUCCESS", NNumber.class);
			vInfomsg.val = cmd.getParameterValue("@V_INFOMSG", NString.class);
			vInfomsgstyle.val = cmd.getParameterValue("@V_INFOMSGSTYLE", NNumber.class);

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fAxsctdocdeletePostT(NNumber vAppid,NNumber vDocid,NString vUsername,NString vLocale,NString vSessionid,Ref<NString> vInfomsg,Ref<NNumber> vInfomsgstyle) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EFKCUST.F_AXSCTDOCDELETE_POST_T", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@V_APPID", vAppid);
			cmd.addParameter("@V_DOCID", vDocid);
			cmd.addParameter("@V_USERNAME", vUsername);
			cmd.addParameter("@V_LOCALE", vLocale);
			cmd.addParameter("@V_SESSIONID", vSessionid);
			cmd.addParameter("@V_INFOMSG", vInfomsg, true);
			cmd.addParameter("@V_INFOMSGSTYLE", vInfomsgstyle, true);
				
			cmd.execute();
			vInfomsg.val = cmd.getParameterValue("@V_INFOMSG", NString.class);
			vInfomsgstyle.val = cmd.getParameterValue("@V_INFOMSGSTYLE", NNumber.class);

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fAxsctdocindexaccessT(NNumber vAppid,NNumber vDocid,NString vIndex,NNumber vDocisreadonly,NString vUsername,NString vLocale,NString vSessionid,Ref<NString> vInfomsg,Ref<NNumber> vInfomsgstyle) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EFKCUST.F_AXSCTDOCINDEXACCESS_T", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@V_APPID", vAppid);
			cmd.addParameter("@V_DOCID", vDocid);
			cmd.addParameter("@V_INDEX", vIndex);
			cmd.addParameter("@V_DOCISREADONLY", vDocisreadonly);
			cmd.addParameter("@V_USERNAME", vUsername);
			cmd.addParameter("@V_LOCALE", vLocale);
			cmd.addParameter("@V_SESSIONID", vSessionid);
			cmd.addParameter("@V_INFOMSG", vInfomsg, true);
			cmd.addParameter("@V_INFOMSGSTYLE", vInfomsgstyle, true);
				
			cmd.execute();
			vInfomsg.val = cmd.getParameterValue("@V_INFOMSG", NString.class);
			vInfomsgstyle.val = cmd.getParameterValue("@V_INFOMSGSTYLE", NNumber.class);

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fAxsctdocindexdeletePostT(NNumber vAppid,NNumber vDocid,NString vUsername,NString vIndex,NString vAllindexes,NString vLocale,NString vSessionid,Ref<NString> vInfomsg,Ref<NNumber> vInfomsgstyle) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EFKCUST.F_AXSCTDOCINDEXDELETE_POST_T", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
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
			vInfomsg.val = cmd.getParameterValue("@V_INFOMSG", NString.class);
			vInfomsgstyle.val = cmd.getParameterValue("@V_INFOMSGSTYLE", NNumber.class);

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fAxsctdocindexdeletePreT(NNumber vAppid,NNumber vDocid,NString vUsername,NString vIndex,NString vAllindexes,NNumber vDocdelete,NString vLocale,NString vSessionid,Ref<NNumber> vSuccess,Ref<NString> vInfomsg,Ref<NNumber> vInfomsgstyle) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EFKCUST.F_AXSCTDOCINDEXDELETE_PRE_T", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@V_APPID", vAppid);
			cmd.addParameter("@V_DOCID", vDocid);
			cmd.addParameter("@V_USERNAME", vUsername);
			cmd.addParameter("@V_INDEX", vIndex);
			cmd.addParameter("@V_ALLINDEXES", vAllindexes);
			cmd.addParameter("@V_DOCDELETE", vDocdelete);
			cmd.addParameter("@V_LOCALE", vLocale);
			cmd.addParameter("@V_SESSIONID", vSessionid);
			cmd.addParameter("@V_SUCCESS", vSuccess, true);
			cmd.addParameter("@V_INFOMSG", vInfomsg, true);
			cmd.addParameter("@V_INFOMSGSTYLE", vInfomsgstyle, true);
				
			cmd.execute();
			vSuccess.val = cmd.getParameterValue("@V_SUCCESS", NNumber.class);
			vInfomsg.val = cmd.getParameterValue("@V_INFOMSG", NString.class);
			vInfomsgstyle.val = cmd.getParameterValue("@V_INFOMSGSTYLE", NNumber.class);

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fAxsctdocindexqueryexecT(NNumber vAppid,NNumber vDocid,NString vLocale,NString vUsername,NString vQueryselect,NString vQuerywhere,NString vQueryorderby,NString vSessionid,Ref<NString> vReturnquery,Ref<NString> vInfomsg,Ref<NNumber> vInfomsgstyle) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EFKCUST.F_AXSCTDOCINDEXQUERYEXEC_T", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@V_APPID", vAppid);
			cmd.addParameter("@V_DOCID", vDocid);
			cmd.addParameter("@V_LOCALE", vLocale);
			cmd.addParameter("@V_USERNAME", vUsername);
			cmd.addParameter("@V_QUERYSELECT", vQueryselect);
			cmd.addParameter("@V_QUERYWHERE", vQuerywhere);
			cmd.addParameter("@V_QUERYORDERBY", vQueryorderby);
			cmd.addParameter("@V_SESSIONID", vSessionid);
			cmd.addParameter("@V_RETURNQUERY", vReturnquery, true);
			cmd.addParameter("@V_INFOMSG", vInfomsg, true);
			cmd.addParameter("@V_INFOMSGSTYLE", vInfomsgstyle, true);
				
			cmd.execute();
			vReturnquery.val = cmd.getParameterValue("@V_RETURNQUERY", NString.class);
			vInfomsg.val = cmd.getParameterValue("@V_INFOMSG", NString.class);
			vInfomsgstyle.val = cmd.getParameterValue("@V_INFOMSGSTYLE", NNumber.class);

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fAxsctindexupdatePostT(NNumber vAppid,NNumber vDocid,NString vUsername,NNumber vFlags,NString vIndex,NString vFmrindex,NString vLocale,NString vSessionid,Ref<NString> vInfomsg,Ref<NNumber> vInfomsgstyle) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EFKCUST.F_AXSCTINDEXUPDATE_POST_T", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
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
			vInfomsg.val = cmd.getParameterValue("@V_INFOMSG", NString.class);
			vInfomsgstyle.val = cmd.getParameterValue("@V_INFOMSGSTYLE", NNumber.class);

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fAxsctindexupdatePreT(NNumber vAppid,NNumber vDocid,NString vUsername,NNumber vFlags,NString vIndex,NString vFmrindex,NString vLocale,NString vSessionid,Ref<NNumber> vSuccess,Ref<NString> vInfomsg,Ref<NNumber> vInfomsgstyle) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EFKCUST.F_AXSCTINDEXUPDATE_PRE_T", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@V_APPID", vAppid);
			cmd.addParameter("@V_DOCID", vDocid);
			cmd.addParameter("@V_USERNAME", vUsername);
			cmd.addParameter("@V_FLAGS", vFlags);
			cmd.addParameter("@V_INDEX", vIndex);
			cmd.addParameter("@V_FMRINDEX", vFmrindex);
			cmd.addParameter("@V_LOCALE", vLocale);
			cmd.addParameter("@V_SESSIONID", vSessionid);
			cmd.addParameter("@V_SUCCESS", vSuccess, true);
			cmd.addParameter("@V_INFOMSG", vInfomsg, true);
			cmd.addParameter("@V_INFOMSGSTYLE", vInfomsgstyle, true);
				
			cmd.execute();
			vSuccess.val = cmd.getParameterValue("@V_SUCCESS", NNumber.class);
			vInfomsg.val = cmd.getParameterValue("@V_INFOMSG", NString.class);
			vInfomsgstyle.val = cmd.getParameterValue("@V_INFOMSGSTYLE", NNumber.class);

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fAxsctqueryexecT(NNumber vAppid,NString vUsername,NString vQueryselect,NString vQuerywhere,NString vQueryorderby,NString vLocale,NString vSessionid,Ref<NString> vReturnquery,Ref<NString> vInfomsg,Ref<NNumber> vInfomsgstyle) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EFKCUST.F_AXSCTQUERYEXEC_T", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@V_APPID", vAppid);
			cmd.addParameter("@V_USERNAME", vUsername);
			cmd.addParameter("@V_QUERYSELECT", vQueryselect);
			cmd.addParameter("@V_QUERYWHERE", vQuerywhere);
			cmd.addParameter("@V_QUERYORDERBY", vQueryorderby);
			cmd.addParameter("@V_LOCALE", vLocale);
			cmd.addParameter("@V_SESSIONID", vSessionid);
			cmd.addParameter("@V_RETURNQUERY", vReturnquery, true);
			cmd.addParameter("@V_INFOMSG", vInfomsg, true);
			cmd.addParameter("@V_INFOMSGSTYLE", vInfomsgstyle, true);
				
			cmd.execute();
			vReturnquery.val = cmd.getParameterValue("@V_RETURNQUERY", NString.class);
			vInfomsg.val = cmd.getParameterValue("@V_INFOMSG", NString.class);
			vInfomsgstyle.val = cmd.getParameterValue("@V_INFOMSGSTYLE", NNumber.class);

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fAxsctuserlistqueryT(Ref<NString> vQuery) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EFKCUST.F_AXSCTUSERLISTQUERY_T", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@V_QUERY", vQuery, true);
				
			cmd.execute();
			vQuery.val = cmd.getParameterValue("@V_QUERY", NString.class);

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void pAxsctaiqueryexecB(NNumber vAppid,NString vUsername,NString vQueryselect,NString vQuerywhere,NString vQueryorderby,NString vLocale,NString vSessionid,Ref<NString> vReturnquery,Ref<NString> vInfomsg,Ref<NNumber> vInfomsgstyle) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EFKCUST.P_AXSCTAIQUERYEXEC_B", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@V_APPID", vAppid);
			cmd.addParameter("@V_USERNAME", vUsername);
			cmd.addParameter("@V_QUERYSELECT", vQueryselect);
			cmd.addParameter("@V_QUERYWHERE", vQuerywhere);
			cmd.addParameter("@V_QUERYORDERBY", vQueryorderby);
			cmd.addParameter("@V_LOCALE", vLocale);
			cmd.addParameter("@V_SESSIONID", vSessionid);
			cmd.addParameter("@V_RETURNQUERY", vReturnquery, true);
			cmd.addParameter("@V_INFOMSG", vInfomsg, true);
			cmd.addParameter("@V_INFOMSGSTYLE", vInfomsgstyle, true);
				
			cmd.execute();
			vReturnquery.val = cmd.getParameterValue("@V_RETURNQUERY", NString.class);
			vInfomsg.val = cmd.getParameterValue("@V_INFOMSG", NString.class);
			vInfomsgstyle.val = cmd.getParameterValue("@V_INFOMSGSTYLE", NNumber.class);


		}
		
		public static void pAxsctdocaccessB(NNumber vAppid,NNumber vDocid,NString vUsername,NString vLocale,NString vSessionid,Ref<NNumber> vSuccess,Ref<NString> vInfomsg,Ref<NNumber> vInfomsgstyle) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EFKCUST.P_AXSCTDOCACCESS_B", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@V_APPID", vAppid);
			cmd.addParameter("@V_DOCID", vDocid);
			cmd.addParameter("@V_USERNAME", vUsername);
			cmd.addParameter("@V_LOCALE", vLocale);
			cmd.addParameter("@V_SESSIONID", vSessionid);
			cmd.addParameter("@V_SUCCESS", vSuccess, true);
			cmd.addParameter("@V_INFOMSG", vInfomsg, true);
			cmd.addParameter("@V_INFOMSGSTYLE", vInfomsgstyle, true);
				
			cmd.execute();
			vSuccess.val = cmd.getParameterValue("@V_SUCCESS", NNumber.class);
			vInfomsg.val = cmd.getParameterValue("@V_INFOMSG", NString.class);
			vInfomsgstyle.val = cmd.getParameterValue("@V_INFOMSGSTYLE", NNumber.class);


		}
		
		public static void pAxsctdocdeletePostB(NNumber vAppid,NNumber vDocid,NString vUsername,NString vLocale,NString vSessionid,Ref<NString> vInfomsg,Ref<NNumber> vInfomsgstyle) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EFKCUST.P_AXSCTDOCDELETE_POST_B", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@V_APPID", vAppid);
			cmd.addParameter("@V_DOCID", vDocid);
			cmd.addParameter("@V_USERNAME", vUsername);
			cmd.addParameter("@V_LOCALE", vLocale);
			cmd.addParameter("@V_SESSIONID", vSessionid);
			cmd.addParameter("@V_INFOMSG", vInfomsg, true);
			cmd.addParameter("@V_INFOMSGSTYLE", vInfomsgstyle, true);
				
			cmd.execute();
			vInfomsg.val = cmd.getParameterValue("@V_INFOMSG", NString.class);
			vInfomsgstyle.val = cmd.getParameterValue("@V_INFOMSGSTYLE", NNumber.class);


		}
		
		public static void pAxsctdocindexaccessB(NNumber vAppid,NNumber vDocid,NString vIndex,NNumber vDocisreadonly,NString vUsername,NString vLocale,NString vSessionid,Ref<NString> vInfomsg,Ref<NNumber> vInfomsgstyle) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EFKCUST.P_AXSCTDOCINDEXACCESS_B", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@V_APPID", vAppid);
			cmd.addParameter("@V_DOCID", vDocid);
			cmd.addParameter("@V_INDEX", vIndex);
			cmd.addParameter("@V_DOCISREADONLY", vDocisreadonly);
			cmd.addParameter("@V_USERNAME", vUsername);
			cmd.addParameter("@V_LOCALE", vLocale);
			cmd.addParameter("@V_SESSIONID", vSessionid);
			cmd.addParameter("@V_INFOMSG", vInfomsg, true);
			cmd.addParameter("@V_INFOMSGSTYLE", vInfomsgstyle, true);
				
			cmd.execute();
			vInfomsg.val = cmd.getParameterValue("@V_INFOMSG", NString.class);
			vInfomsgstyle.val = cmd.getParameterValue("@V_INFOMSGSTYLE", NNumber.class);


		}
		
		public static void pAxsctdocindexdeletePostB(NNumber vAppid,NNumber vDocid,NString vUsername,NString vIndex,NString vAllindexes,NString vLocale,NString vSessionid,Ref<NString> vInfomsg,Ref<NNumber> vInfomsgstyle) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EFKCUST.P_AXSCTDOCINDEXDELETE_POST_B", DbManager.getDataBaseFactory());
			
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
			vInfomsg.val = cmd.getParameterValue("@V_INFOMSG", NString.class);
			vInfomsgstyle.val = cmd.getParameterValue("@V_INFOMSGSTYLE", NNumber.class);


		}
		
		public static void pAxsctdocindexdeletePreB(NNumber vAppid,NNumber vDocid,NString vUsername,NString vIndex,NString vAllindexes,NNumber vDocdelete,NString vLocale,NString vSessionid,Ref<NNumber> vSuccess,Ref<NString> vInfomsg,Ref<NNumber> vInfomsgstyle) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EFKCUST.P_AXSCTDOCINDEXDELETE_PRE_B", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@V_APPID", vAppid);
			cmd.addParameter("@V_DOCID", vDocid);
			cmd.addParameter("@V_USERNAME", vUsername);
			cmd.addParameter("@V_INDEX", vIndex);
			cmd.addParameter("@V_ALLINDEXES", vAllindexes);
			cmd.addParameter("@V_DOCDELETE", vDocdelete);
			cmd.addParameter("@V_LOCALE", vLocale);
			cmd.addParameter("@V_SESSIONID", vSessionid);
			cmd.addParameter("@V_SUCCESS", vSuccess, true);
			cmd.addParameter("@V_INFOMSG", vInfomsg, true);
			cmd.addParameter("@V_INFOMSGSTYLE", vInfomsgstyle, true);
				
			cmd.execute();
			vSuccess.val = cmd.getParameterValue("@V_SUCCESS", NNumber.class);
			vInfomsg.val = cmd.getParameterValue("@V_INFOMSG", NString.class);
			vInfomsgstyle.val = cmd.getParameterValue("@V_INFOMSGSTYLE", NNumber.class);


		}
		
		public static void pAxsctdocindexqueryexecB(NNumber vAppid,NNumber vDocid,NString vLocale,NString vUsername,NString vQueryselect,NString vQuerywhere,NString vQueryorderby,NString vSessionid,Ref<NString> vReturnquery,Ref<NString> vInfomsg,Ref<NNumber> vInfomsgstyle) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EFKCUST.P_AXSCTDOCINDEXQUERYEXEC_B", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@V_APPID", vAppid);
			cmd.addParameter("@V_DOCID", vDocid);
			cmd.addParameter("@V_LOCALE", vLocale);
			cmd.addParameter("@V_USERNAME", vUsername);
			cmd.addParameter("@V_QUERYSELECT", vQueryselect);
			cmd.addParameter("@V_QUERYWHERE", vQuerywhere);
			cmd.addParameter("@V_QUERYORDERBY", vQueryorderby);
			cmd.addParameter("@V_SESSIONID", vSessionid);
			cmd.addParameter("@V_RETURNQUERY", vReturnquery, true);
			cmd.addParameter("@V_INFOMSG", vInfomsg, true);
			cmd.addParameter("@V_INFOMSGSTYLE", vInfomsgstyle, true);
				
			cmd.execute();
			vReturnquery.val = cmd.getParameterValue("@V_RETURNQUERY", NString.class);
			vInfomsg.val = cmd.getParameterValue("@V_INFOMSG", NString.class);
			vInfomsgstyle.val = cmd.getParameterValue("@V_INFOMSGSTYLE", NNumber.class);


		}
		
		public static void pAxsctindexupdatePostB(NNumber vAppid,NNumber vDocid,NString vUsername,NNumber vFlags,NString vIndex,NString vFmrindex,NString vLocale,NString vSessionid,Ref<NString> vInfomsg,Ref<NNumber> vInfomsgstyle) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EFKCUST.P_AXSCTINDEXUPDATE_POST_B", DbManager.getDataBaseFactory());
			
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
			vInfomsg.val = cmd.getParameterValue("@V_INFOMSG", NString.class);
			vInfomsgstyle.val = cmd.getParameterValue("@V_INFOMSGSTYLE", NNumber.class);


		}
		
		public static void pAxsctindexupdatePreB(NNumber vAppid,NNumber vDocid,NString vUsername,NNumber vFlags,NString vIndex,NString vFmrindex,NString vLocale,NString vSessionid,Ref<NNumber> vSuccess,Ref<NString> vInfomsg,Ref<NNumber> vInfomsgstyle) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EFKCUST.P_AXSCTINDEXUPDATE_PRE_B", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@V_APPID", vAppid);
			cmd.addParameter("@V_DOCID", vDocid);
			cmd.addParameter("@V_USERNAME", vUsername);
			cmd.addParameter("@V_FLAGS", vFlags);
			cmd.addParameter("@V_INDEX", vIndex);
			cmd.addParameter("@V_FMRINDEX", vFmrindex);
			cmd.addParameter("@V_LOCALE", vLocale);
			cmd.addParameter("@V_SESSIONID", vSessionid);
			cmd.addParameter("@V_SUCCESS", vSuccess, true);
			cmd.addParameter("@V_INFOMSG", vInfomsg, true);
			cmd.addParameter("@V_INFOMSGSTYLE", vInfomsgstyle, true);
				
			cmd.execute();
			vSuccess.val = cmd.getParameterValue("@V_SUCCESS", NNumber.class);
			vInfomsg.val = cmd.getParameterValue("@V_INFOMSG", NString.class);
			vInfomsgstyle.val = cmd.getParameterValue("@V_INFOMSGSTYLE", NNumber.class);


		}
		
		public static void pAxsctqueryexecB(NNumber vAppid,NString vUsername,NString vQueryselect,NString vQuerywhere,NString vQueryorderby,NString vLocale,NString vSessionid,Ref<NString> vReturnquery,Ref<NString> vInfomsg,Ref<NNumber> vInfomsgstyle) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EFKCUST.P_AXSCTQUERYEXEC_B", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@V_APPID", vAppid);
			cmd.addParameter("@V_USERNAME", vUsername);
			cmd.addParameter("@V_QUERYSELECT", vQueryselect);
			cmd.addParameter("@V_QUERYWHERE", vQuerywhere);
			cmd.addParameter("@V_QUERYORDERBY", vQueryorderby);
			cmd.addParameter("@V_LOCALE", vLocale);
			cmd.addParameter("@V_SESSIONID", vSessionid);
			cmd.addParameter("@V_RETURNQUERY", vReturnquery, true);
			cmd.addParameter("@V_INFOMSG", vInfomsg, true);
			cmd.addParameter("@V_INFOMSGSTYLE", vInfomsgstyle, true);
				
			cmd.execute();
			vReturnquery.val = cmd.getParameterValue("@V_RETURNQUERY", NString.class);
			vInfomsg.val = cmd.getParameterValue("@V_INFOMSG", NString.class);
			vInfomsgstyle.val = cmd.getParameterValue("@V_INFOMSGSTYLE", NNumber.class);


		}
		
		public static void pAxsctuserlistqueryB(Ref<NString> vQuery) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EFKCUST.P_AXSCTUSERLISTQUERY_B", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@V_QUERY", vQuery, true);
				
			cmd.execute();
			vQuery.val = cmd.getParameterValue("@V_QUERY", NString.class);


		}
		
	
	
	
}
