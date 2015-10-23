package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwpkepsm {
		public static void pDispapproverfiltersbody(NNumber pPidm,NString pUserId,NString pErrorInd,NString pgProxyForId,NString pgSuperuserInd,NString pgSubmitFromDate,NString pgSubmitToDate,NString pgTransPerPage) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPSM.P_DISPAPPROVERFILTERSBODY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ERROR_IND", pErrorInd);
			cmd.addParameter("@PG_PROXY_FOR_ID", pgProxyForId);
			cmd.addParameter("@PG_SUPERUSER_IND", pgSuperuserInd);
			cmd.addParameter("@PG_SUBMIT_FROM_DATE", pgSubmitFromDate);
			cmd.addParameter("@PG_SUBMIT_TO_DATE", pgSubmitToDate);
			cmd.addParameter("@PG_TRANS_PER_PAGE", pgTransPerPage);
				
			cmd.execute();


		}
		
		public static void pDispapproversummarybody(NNumber pPidm,NString pUserId,NString pViewType,NString pSortType,NNumber pPointer,NString pSelectAllInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPSM.P_DISPAPPROVERSUMMARYBODY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_VIEW_TYPE", pViewType);
			cmd.addParameter("@P_SORT_TYPE", pSortType);
			cmd.addParameter("@P_POINTER", pPointer);
			cmd.addParameter("@P_SELECT_ALL_IND", pSelectAllInd);
				
			cmd.execute();


		}
		
		public static void pDispepafpreviewbody(NNumber pPidm,NString pUserId,NString pUserRole,NNumber pTransNo,NNumber pPrevTransNo,NNumber pNextTransNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPSM.P_DISPEPAFPREVIEWBODY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_USER_ROLE", pUserRole);
			cmd.addParameter("@P_TRANS_NO", pTransNo);
			cmd.addParameter("@P_PREV_TRANS_NO", pPrevTransNo);
			cmd.addParameter("@P_NEXT_TRANS_NO", pNextTransNo);
				
			cmd.execute();


		}
		
		public static void pDisporiginatorfiltersbody(NNumber pPidm,NString pErrorInd,NString pgSuperuserInd,NString pgSubmitFromDate,NString pgSubmitToDate,NString pgTransPerPage) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPSM.P_DISPORIGINATORFILTERSBODY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ERROR_IND", pErrorInd);
			cmd.addParameter("@PG_SUPERUSER_IND", pgSuperuserInd);
			cmd.addParameter("@PG_SUBMIT_FROM_DATE", pgSubmitFromDate);
			cmd.addParameter("@PG_SUBMIT_TO_DATE", pgSubmitToDate);
			cmd.addParameter("@PG_TRANS_PER_PAGE", pgTransPerPage);
				
			cmd.execute();


		}
		
		public static void pDisporiginatorsummarybody(NNumber pPidm,NString pUserId,NString pViewType,NString pSortType,NNumber pPointer) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPSM.P_DISPORIGINATORSUMMARYBODY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_VIEW_TYPE", pViewType);
			cmd.addParameter("@P_SORT_TYPE", pSortType);
			cmd.addParameter("@P_POINTER", pPointer);
				
			cmd.execute();


		}
		
		public static void pPrintroutingqueue(NString pTransNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPSM.P_PRINTROUTINGQUEUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRANS_NO", pTransNo);
				
			cmd.execute();


		}
		
		public static void pSelectapproverfiltersbody(NNumber pPidm,NString pUserId,NString pProxyForId,NString pSuperuserInd,NString pSubmitFromDate,NString pSubmitToDate,NString pTransPerPage) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPSM.P_SELECTAPPROVERFILTERSBODY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_PROXY_FOR_ID", pProxyForId);
			cmd.addParameter("@P_SUPERUSER_IND", pSuperuserInd);
			cmd.addParameter("@P_SUBMIT_FROM_DATE", pSubmitFromDate);
			cmd.addParameter("@P_SUBMIT_TO_DATE", pSubmitToDate);
			cmd.addParameter("@P_TRANS_PER_PAGE", pTransPerPage);
				
			cmd.execute();


		}
		
//		public static void pSelectapproversummarybody(NNumber pPidm,NString pUserId,List<Twbklibs.Varchar2TabtypeRow> qstatselected,List<Twbklibs.Varchar2TabtypeRow> transselected,NString btnselected) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPSM.P_SELECTAPPROVERSUMMARYBODY", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_PIDM", pPidm);
//			cmd.addParameter("@P_USER_ID", pUserId);
//			// cmd.addParameter(DbTypes.getTableType("QSTATSELECTED", "", qstatselected, object.class));
//			// cmd.addParameter(DbTypes.getTableType("TRANSSELECTED", "", transselected, object.class));
//			cmd.addParameter("@BTNSELECTED", btnselected);
//				
//			cmd.execute();
//
//
//		}
		
		public static void pSelectoriginatorfiltersbody(NNumber pPidm,NString pUserId,NString pSuperuserInd,NString pSubmitFromDate,NString pSubmitToDate,NString pTransPerPage) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPSM.P_SELECTORIGINATORFILTERSBODY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_SUPERUSER_IND", pSuperuserInd);
			cmd.addParameter("@P_SUBMIT_FROM_DATE", pSubmitFromDate);
			cmd.addParameter("@P_SUBMIT_TO_DATE", pSubmitToDate);
			cmd.addParameter("@P_TRANS_PER_PAGE", pTransPerPage);
				
			cmd.execute();


		}
		
//		public static void pSelectoriginatorsummarybody(NNumber pPidm,NString pUserId,List<Twbklibs.Varchar2TabtypeRow> tstatselected,NString btnselected) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPSM.P_SELECTORIGINATORSUMMARYBODY", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_PIDM", pPidm);
//			cmd.addParameter("@P_USER_ID", pUserId);
//			// cmd.addParameter(DbTypes.getTableType("TSTATSELECTED", "", tstatselected, object.class));
//			cmd.addParameter("@BTNSELECTED", btnselected);
//				
//			cmd.execute();
//
//
//		}
		
		public static void pUpdateepafpreviewbody(NNumber pPidm,NString pUserId,NString pTransNo,NString userrole,NString prevtransno,NString nexttransno,NString btnselected) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPSM.P_UPDATEEPAFPREVIEWBODY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_TRANS_NO", pTransNo);
			cmd.addParameter("@USERROLE", userrole);
			cmd.addParameter("@PREVTRANSNO", prevtransno);
			cmd.addParameter("@NEXTTRANSNO", nexttransno);
			cmd.addParameter("@BTNSELECTED", btnselected);
				
			cmd.execute();


		}
		
	
	
	
}
