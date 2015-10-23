package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Twbkwrul {
		public static void pModifypgwebrules(NString returnCode,NString returnMsg,NString timeOutIn,NString cgibinDirIn,NString cgibinDirAdmIn,NString dateFmtIn,NString timeFmtIn,NString loginAttemptsIn,NString dispUsageIndIn,NString dispAdminDescIndIn,NString javaClasspathIn,NString pinExpDaysIn,NString dispDeadIndIn,NString asrcCodeIn,NString httpRedirectIndIn,NString cacheIndIn,NString startPageIn,NString startPageMenuIndIn,NString dtdTypeIn,NString dtdFpiIn,NString dtdUrlIn,NString langIn,NString dateInputFmtIn,NString roleTimeOutStrIn,NString numRolesIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKWRUL.P_MODIFYPGWEBRULES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RETURN_CODE", returnCode);
			cmd.addParameter("@RETURN_MSG", returnMsg);
			cmd.addParameter("@TIME_OUT_IN", timeOutIn);
			cmd.addParameter("@CGIBIN_DIR_IN", cgibinDirIn);
			cmd.addParameter("@CGIBIN_DIR_ADM_IN", cgibinDirAdmIn);
			cmd.addParameter("@DATE_FMT_IN", dateFmtIn);
			cmd.addParameter("@TIME_FMT_IN", timeFmtIn);
			cmd.addParameter("@LOGIN_ATTEMPTS_IN", loginAttemptsIn);
			cmd.addParameter("@DISP_USAGE_IND_IN", dispUsageIndIn);
			cmd.addParameter("@DISP_ADMIN_DESC_IND_IN", dispAdminDescIndIn);
			cmd.addParameter("@JAVA_CLASSPATH_IN", javaClasspathIn);
			cmd.addParameter("@PIN_EXP_DAYS_IN", pinExpDaysIn);
			cmd.addParameter("@DISP_DEAD_IND_IN", dispDeadIndIn);
			cmd.addParameter("@ASRC_CODE_IN", asrcCodeIn);
			cmd.addParameter("@HTTP_REDIRECT_IND_IN", httpRedirectIndIn);
			cmd.addParameter("@CACHE_IND_IN", cacheIndIn);
			cmd.addParameter("@START_PAGE_IN", startPageIn);
			cmd.addParameter("@START_PAGE_MENU_IND_IN", startPageMenuIndIn);
			cmd.addParameter("@DTD_TYPE_IN", dtdTypeIn);
			cmd.addParameter("@DTD_FPI_IN", dtdFpiIn);
			cmd.addParameter("@DTD_URL_IN", dtdUrlIn);
			cmd.addParameter("@LANG_IN", langIn);
			cmd.addParameter("@DATE_INPUT_FMT_IN", dateInputFmtIn);
			cmd.addParameter("@ROLE_TIME_OUT_STR_IN", roleTimeOutStrIn);
			cmd.addParameter("@NUM_ROLES_IN", numRolesIn);
				
			cmd.execute();


		}
		
//		public static void pSavewebrules(NString transType,NString timeOutIn,NString cgibinDirIn,NString cgibinDirAdmIn,NString dateFmtIn,NString timeFmtIn,NString loginAttemptsIn,NString dispUsageIndIn,NString dispAdminDescIndIn,NString javaClasspathIn,NString pinExpDaysIn,NString dispDeadIndIn,NString asrcCodeIn,NString httpRedirectIndIn,NString cacheIndIn,NString startPageIn,NString startPageMenuIndIn,NString dtdTypeIn,NString dtdFpiIn,NString dtdUrlIn,NString langIn,NString dateInputFmtIn,List<Twbklibs.Varchar2TabtypeRow> roleTimeOutIn,NString numRolesIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKWRUL.P_SAVEWEBRULES", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@TRANS_TYPE", transType);
//			cmd.addParameter("@TIME_OUT_IN", timeOutIn);
//			cmd.addParameter("@CGIBIN_DIR_IN", cgibinDirIn);
//			cmd.addParameter("@CGIBIN_DIR_ADM_IN", cgibinDirAdmIn);
//			cmd.addParameter("@DATE_FMT_IN", dateFmtIn);
//			cmd.addParameter("@TIME_FMT_IN", timeFmtIn);
//			cmd.addParameter("@LOGIN_ATTEMPTS_IN", loginAttemptsIn);
//			cmd.addParameter("@DISP_USAGE_IND_IN", dispUsageIndIn);
//			cmd.addParameter("@DISP_ADMIN_DESC_IND_IN", dispAdminDescIndIn);
//			cmd.addParameter("@JAVA_CLASSPATH_IN", javaClasspathIn);
//			cmd.addParameter("@PIN_EXP_DAYS_IN", pinExpDaysIn);
//			cmd.addParameter("@DISP_DEAD_IND_IN", dispDeadIndIn);
//			cmd.addParameter("@ASRC_CODE_IN", asrcCodeIn);
//			cmd.addParameter("@HTTP_REDIRECT_IND_IN", httpRedirectIndIn);
//			cmd.addParameter("@CACHE_IND_IN", cacheIndIn);
//			cmd.addParameter("@START_PAGE_IN", startPageIn);
//			cmd.addParameter("@START_PAGE_MENU_IND_IN", startPageMenuIndIn);
//			cmd.addParameter("@DTD_TYPE_IN", dtdTypeIn);
//			cmd.addParameter("@DTD_FPI_IN", dtdFpiIn);
//			cmd.addParameter("@DTD_URL_IN", dtdUrlIn);
//			cmd.addParameter("@LANG_IN", langIn);
//			cmd.addParameter("@DATE_INPUT_FMT_IN", dateInputFmtIn);
//			// cmd.addParameter(DbTypes.getTableType("ROLE_TIME_OUT_IN", "", roleTimeOutIn, object.class));
//			cmd.addParameter("@NUM_ROLES_IN", numRolesIn);
//				
//			cmd.execute();
//
//
//		}
		
	
	
	
}
