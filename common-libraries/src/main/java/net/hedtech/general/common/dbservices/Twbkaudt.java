package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Twbkaudt {
		public static NString fGetId(NString inPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKAUDT.F_GET_ID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@IN_PIDM", inPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pAuditLogin(NString userIn,NString commentIn,NString statusIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKAUDT.P_AUDIT_LOGIN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@USER_IN", userIn);
			cmd.addParameter("@COMMENT_IN", commentIn);
			cmd.addParameter("@STATUS_IN", statusIn);
				
			cmd.execute();


		}
		
		public static void pAuditPage(NString pidmIn,NString pageIn,NString proxyIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKAUDT.P_AUDIT_PAGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@PAGE_IN", pageIn);
			cmd.addParameter("@PROXY_IN", proxyIn);
				
			cmd.execute();


		}
		
		public static void pDisplayAuditLogin(NString srchUser,NString srchPage,NString srchDate,NString srchDateComp,NString srchCmnt,NString deleteOption,NString pageNum,NString numRows) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKAUDT.P_DISPLAY_AUDIT_LOGIN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SRCH_USER", srchUser);
			cmd.addParameter("@SRCH_PAGE", srchPage);
			cmd.addParameter("@SRCH_DATE", srchDate);
			cmd.addParameter("@SRCH_DATE_COMP", srchDateComp);
			cmd.addParameter("@SRCH_CMNT", srchCmnt);
			cmd.addParameter("@DELETE_OPTION", deleteOption);
			cmd.addParameter("@PAGE_NUM", pageNum);
			cmd.addParameter("@NUM_ROWS", numRows);
				
			cmd.execute();


		}
		
		public static void pDisplayAuditPages(NString srchUser,NString srchPage,NString srchDate,NString srchDateComp,NString deleteOption,NString pageNum,NString numRows) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKAUDT.P_DISPLAY_AUDIT_PAGES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SRCH_USER", srchUser);
			cmd.addParameter("@SRCH_PAGE", srchPage);
			cmd.addParameter("@SRCH_DATE", srchDate);
			cmd.addParameter("@SRCH_DATE_COMP", srchDateComp);
			cmd.addParameter("@DELETE_OPTION", deleteOption);
			cmd.addParameter("@PAGE_NUM", pageNum);
			cmd.addParameter("@NUM_ROWS", numRows);
				
			cmd.execute();


		}
		
		public static void pOptionlogin(NString srchUser,NString srchPage,NString srchDate,NString srchDateComp,NString srchCmnt,NString deleteOption,NString pageNum,NString numRows) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKAUDT.P_OPTIONLOGIN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SRCH_USER", srchUser);
			cmd.addParameter("@SRCH_PAGE", srchPage);
			cmd.addParameter("@SRCH_DATE", srchDate);
			cmd.addParameter("@SRCH_DATE_COMP", srchDateComp);
			cmd.addParameter("@SRCH_CMNT", srchCmnt);
			cmd.addParameter("@DELETE_OPTION", deleteOption);
			cmd.addParameter("@PAGE_NUM", pageNum);
			cmd.addParameter("@NUM_ROWS", numRows);
				
			cmd.execute();


		}
		
		public static void pOptionpageaccess(NString srchUser,NString srchPage,NString srchDate,NString srchDateComp,NString deleteOption,NString pageNum,NString numRows) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKAUDT.P_OPTIONPAGEACCESS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SRCH_USER", srchUser);
			cmd.addParameter("@SRCH_PAGE", srchPage);
			cmd.addParameter("@SRCH_DATE", srchDate);
			cmd.addParameter("@SRCH_DATE_COMP", srchDateComp);
			cmd.addParameter("@DELETE_OPTION", deleteOption);
			cmd.addParameter("@PAGE_NUM", pageNum);
			cmd.addParameter("@NUM_ROWS", numRows);
				
			cmd.execute();


		}
		
	
	
	
}
