package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwpktais {
		public static void pApproverdriver(NString jobsseqno,NString taYear,NString pictCode,NString payno,NString orgnCode,NString sortby,NString action,NString coasCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTAIS.P_APPROVERDRIVER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@JOBSSEQNO", jobsseqno);
			cmd.addParameter("@TA_YEAR", taYear);
			cmd.addParameter("@PICT_CODE", pictCode);
			cmd.addParameter("@PAYNO", payno);
			cmd.addParameter("@ORGN_CODE", orgnCode);
			cmd.addParameter("@SORTBY", sortby);
			cmd.addParameter("@ACTION", action);
			cmd.addParameter("@COAS_CODE", coasCode);
				
			cmd.execute();


		}
		
		public static void pApproverextract(NString id,NString posn,NString suff,NString taYear,NString pictCode,NNumber payno,NString orgnCode,NString action,NString coasCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTAIS.P_APPROVEREXTRACT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ID", id);
			cmd.addParameter("@POSN", posn);
			cmd.addParameter("@SUFF", suff);
			cmd.addParameter("@TA_YEAR", taYear);
			cmd.addParameter("@PICT_CODE", pictCode);
			cmd.addParameter("@PAYNO", payno);
			cmd.addParameter("@ORGN_CODE", orgnCode);
			cmd.addParameter("@ACTION", action);
			cmd.addParameter("@COAS_CODE", coasCode);
				
			cmd.execute();


		}
		
//		public static void pApproversummary(NString taYear,NString pictCode,NNumber payno,NString action,NString apprAll,NString orgnCode,NString coasCode,List<Twbklibs.Varchar2TabtypeRow> appr,List<Twbklibs.Varchar2TabtypeRow> rcor,List<Twbklibs.Varchar2TabtypeRow> cncl) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTAIS.P_APPROVERSUMMARY", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@TA_YEAR", taYear);
//			cmd.addParameter("@PICT_CODE", pictCode);
//			cmd.addParameter("@PAYNO", payno);
//			cmd.addParameter("@ACTION", action);
//			cmd.addParameter("@APPR_ALL", apprAll);
//			cmd.addParameter("@ORGN_CODE", orgnCode);
//			cmd.addParameter("@COAS_CODE", coasCode);
//			// cmd.addParameter(DbTypes.getTableType("APPR", "", appr, object.class));
//			// cmd.addParameter(DbTypes.getTableType("RCOR", "", rcor, object.class));
//			// cmd.addParameter(DbTypes.getTableType("CNCL", "", cncl, object.class));
//				
//			cmd.execute();
//
//
//		}
		
		public static void pDisplayappralldeptselection(NString selectedAction,NString selectedValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTAIS.P_DISPLAYAPPRALLDEPTSELECTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SELECTED_ACTION", selectedAction);
			cmd.addParameter("@SELECTED_VALUE", selectedValue);
				
			cmd.execute();


		}
		
		public static void pDisplayapproverselection() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTAIS.P_DISPLAYAPPROVERSELECTION", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pDisplayproxysetup() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTAIS.P_DISPLAYPROXYSETUP", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
//		public static void pDisplaysuperuserselection(NString valuechanged,NString actionselected,NString coasselected,NString orgnselected,NString yearselected,NString pictselected,NString paynoselected,List<Twbklibs.Varchar2TabtypeRow> coas,List<Twbklibs.Varchar2TabtypeRow> orgn,List<Twbklibs.Varchar2TabtypeRow> taYear,List<Twbklibs.Varchar2TabtypeRow> pictCode,List<Twbklibs.Varchar2TabtypeRow> payno) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTAIS.P_DISPLAYSUPERUSERSELECTION", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@VALUECHANGED", valuechanged);
//			cmd.addParameter("@ACTIONSELECTED", actionselected);
//			cmd.addParameter("@COASSELECTED", coasselected);
//			cmd.addParameter("@ORGNSELECTED", orgnselected);
//			cmd.addParameter("@YEARSELECTED", yearselected);
//			cmd.addParameter("@PICTSELECTED", pictselected);
//			cmd.addParameter("@PAYNOSELECTED", paynoselected);
//			// cmd.addParameter(DbTypes.getTableType("COAS", "", coas, object.class));
//			// cmd.addParameter(DbTypes.getTableType("ORGN", "", orgn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("TA_YEAR", "", taYear, object.class));
//			// cmd.addParameter(DbTypes.getTableType("PICT_CODE", "", pictCode, object.class));
//			// cmd.addParameter(DbTypes.getTableType("PAYNO", "", payno, object.class));
//				
//			cmd.execute();
//
//
//		}
		
		public static void pProcdeleteappr(NString jobsseqno,NString buttonselected,NString taYear,NString pictCode,NString payno,NString sortby,NString action,NString orgnCode,NString coasCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTAIS.P_PROCDELETEAPPR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@JOBSSEQNO", jobsseqno);
			cmd.addParameter("@BUTTONSELECTED", buttonselected);
			cmd.addParameter("@TA_YEAR", taYear);
			cmd.addParameter("@PICT_CODE", pictCode);
			cmd.addParameter("@PAYNO", payno);
			cmd.addParameter("@SORTBY", sortby);
			cmd.addParameter("@ACTION", action);
			cmd.addParameter("@ORGN_CODE", orgnCode);
			cmd.addParameter("@COAS_CODE", coasCode);
				
			cmd.execute();


		}
		
//		public static void pProcproxysetup(List<Twbklibs.Varchar2TabtypeRow> currProxyUsername,NString newProxyUsername,NString newProxyValue) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTAIS.P_PROCPROXYSETUP", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("CURR_PROXY_USERNAME", "", currProxyUsername, object.class));
//			cmd.addParameter("@NEW_PROXY_USERNAME", newProxyUsername);
//			cmd.addParameter("@NEW_PROXY_VALUE", newProxyValue);
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void pProcselectapproveraction(NString sortby,List<Twbklibs.Varchar2TabtypeRow> payperiod,NString orgn,NString chartofaccounts,NString actionind) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTAIS.P_PROCSELECTAPPROVERACTION", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@SORTBY", sortby);
//			// cmd.addParameter(DbTypes.getTableType("PAYPERIOD", "", payperiod, object.class));
//			cmd.addParameter("@ORGN", orgn);
//			cmd.addParameter("@CHARTOFACCOUNTS", chartofaccounts);
//			cmd.addParameter("@ACTIONIND", actionind);
//				
//			cmd.execute();
//
//
//		}
		
		public static void pProcselectleavereportroll(NString action,NString proxyfor,NString superuser,NString scriptDis,NString alldeptapprover) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTAIS.P_PROCSELECTLEAVEREPORTROLL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ACTION", action);
			cmd.addParameter("@PROXYFOR", proxyfor);
			cmd.addParameter("@SUPERUSER", superuser);
			cmd.addParameter("@SCRIPT_DIS", scriptDis);
			cmd.addParameter("@ALLDEPTAPPROVER", alldeptapprover);
				
			cmd.execute();


		}
		
		public static void pProcselectleaverequestroll(NString action,NString proxyfor,NString superuser,NString scriptDis,NString alldeptapprover) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTAIS.P_PROCSELECTLEAVEREQUESTROLL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ACTION", action);
			cmd.addParameter("@PROXYFOR", proxyfor);
			cmd.addParameter("@SUPERUSER", superuser);
			cmd.addParameter("@SCRIPT_DIS", scriptDis);
			cmd.addParameter("@ALLDEPTAPPROVER", alldeptapprover);
				
			cmd.execute();


		}
		
		public static void pProcselectsuperuseraction(NString actionselected,NString coasselected,NString orgnselected,NString yearselected,NString pictselected,NString paynoselected,NString sortby) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTAIS.P_PROCSELECTSUPERUSERACTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ACTIONSELECTED", actionselected);
			cmd.addParameter("@COASSELECTED", coasselected);
			cmd.addParameter("@ORGNSELECTED", orgnselected);
			cmd.addParameter("@YEARSELECTED", yearselected);
			cmd.addParameter("@PICTSELECTED", pictselected);
			cmd.addParameter("@PAYNOSELECTED", paynoselected);
			cmd.addParameter("@SORTBY", sortby);
				
			cmd.execute();


		}
		
		public static void pProcselecttimesheetroll(NString action,NString proxyfor,NString superuser,NString scriptDis,NString alldeptapprover) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTAIS.P_PROCSELECTTIMESHEETROLL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ACTION", action);
			cmd.addParameter("@PROXYFOR", proxyfor);
			cmd.addParameter("@SUPERUSER", superuser);
			cmd.addParameter("@SCRIPT_DIS", scriptDis);
			cmd.addParameter("@ALLDEPTAPPROVER", alldeptapprover);
				
			cmd.execute();


		}
		
		public static void pSelectleavereportroll() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTAIS.P_SELECTLEAVEREPORTROLL", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pSelectleaverequestroll() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTAIS.P_SELECTLEAVEREQUESTROLL", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pSelecttimesheetroll() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTAIS.P_SELECTTIMESHEETROLL", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
//		public static void pUpdatetransactionstatus(NString taYear,NString pictCode,NString payno,NString action,NString apprAll,NString buttonselected,NString orgnCode,NString coasCode,List<Twbklibs.Varchar2TabtypeRow> appr,List<Twbklibs.Varchar2TabtypeRow> rcor,List<Twbklibs.Varchar2TabtypeRow> cncl) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTAIS.P_UPDATETRANSACTIONSTATUS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@TA_YEAR", taYear);
//			cmd.addParameter("@PICT_CODE", pictCode);
//			cmd.addParameter("@PAYNO", payno);
//			cmd.addParameter("@ACTION", action);
//			cmd.addParameter("@APPR_ALL", apprAll);
//			cmd.addParameter("@BUTTONSELECTED", buttonselected);
//			cmd.addParameter("@ORGN_CODE", orgnCode);
//			cmd.addParameter("@COAS_CODE", coasCode);
//			// cmd.addParameter(DbTypes.getTableType("APPR", "", appr, object.class));
//			// cmd.addParameter(DbTypes.getTableType("RCOR", "", rcor, object.class));
//			// cmd.addParameter(DbTypes.getTableType("CNCL", "", cncl, object.class));
//				
//			cmd.execute();
//
//
//		}
		
		public static void pValidateleavbalace(NString parJobsseqno,Ref<NString> parMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTAIS.P_VALIDATELEAVBALACE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PAR_JOBSSEQNO", parJobsseqno);
			cmd.addParameter("@PAR_MSG", NString.class);
				
			cmd.execute();
			parMsg.val = cmd.getParameterValue("@PAR_MSG", NString.class);


		}
		
//		public static void pValidatemoreleavreptexist(NString parJobsseqno,Ref<Nokmsgs.MsgRectypeRow> parMsg) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTAIS.P_VALIDATEMORELEAVREPTEXIST", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@PAR_JOBSSEQNO", parJobsseqno);
//			cmd.addParameter(DbTypes.createStructType("PAR_MSG", Nokmsgs.MsgRectypeRow.class));
//				
//			cmd.execute();
//			parMsg.val = cmd.getParameterValue("@PAR_MSG", Nokmsgs.MsgRectypeRow.class);
//
//
//		}
//		
//		public static void pWrapselectapproveraction(NString pSortby,List<Twbklibs.Varchar2TabtypeRow> pPayperiod,NString pOrgn,NString pUserrole) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTAIS.P_WRAPSELECTAPPROVERACTION", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_SORTBY", pSortby);
//			// cmd.addParameter(DbTypes.getTableType("P_PAYPERIOD", "", pPayperiod, object.class));
//			cmd.addParameter("@P_ORGN", pOrgn);
//			cmd.addParameter("@P_USERROLE", pUserrole);
//				
//			cmd.execute();
//
//
//		}
		
	
	
	
}
