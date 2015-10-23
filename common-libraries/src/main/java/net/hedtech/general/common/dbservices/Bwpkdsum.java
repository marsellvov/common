package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwpkdsum {
		public static NString fDispMainFilterLink(NString pDisplayText) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDSUM.F_DISP_MAIN_FILTER_LINK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_DISPLAY_TEXT", pDisplayText);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fDisplaydocLink(NNumber pEmpPidm,NNumber pLoginPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDSUM.F_DISPLAYDOC_LINK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_EMP_PIDM", pEmpPidm);
			cmd.addParameter("@P_LOGIN_PIDM", pLoginPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetEnrollmentStatus(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDSUM.F_GET_ENROLLMENT_STATUS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetSummaryProc(NNumber pPidm,NString pWhich) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDSUM.F_GET_SUMMARY_PROC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_WHICH", pWhich);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fUploaddocLink(NNumber pEmpPidm,NNumber pLoginPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDSUM.F_UPLOADDOC_LINK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_EMP_PIDM", pEmpPidm);
			cmd.addParameter("@P_LOGIN_PIDM", pLoginPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static void pConvertTabTypes(List<Twbklibs.Varchar2TabtypeRow> pWebTabType,Ref<List<Pokfltr.Varchar2TabtypeRow>> pPayTabTypeOut) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDSUM.P_CONVERT_TAB_TYPES", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("P_WEB_TAB_TYPE", "", pWebTabType, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_PAY_TAB_TYPE_OUT", "", object.class));
//				
//			cmd.execute();
//			// pPayTabTypeOut.val = cmd.getTableParameterValue("@P_PAY_TAB_TYPE_OUT", object.class);
//
//
//		}
		
		public static void pDisplayempsummarybody(NNumber pPidm,NString pTabInd,NString pSelect,NNumber pRecordNo,NString pEmpSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDSUM.P_DISPLAYEMPSUMMARYBODY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TAB_IND", pTabInd);
			cmd.addParameter("@P_SELECT", pSelect);
			cmd.addParameter("@P_RECORD_NO", pRecordNo);
			cmd.addParameter("@P_EMP_SEQ_NO", pEmpSeqNo);
				
			cmd.execute();


		}
		
//		public static void pDisplayfiltermainbody(NNumber pPidm,List<Twbklibs.Varchar2TabtypeRow> pOrgnCode) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDSUM.P_DISPLAYFILTERMAINBODY", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_PIDM", pPidm);
//			// cmd.addParameter(DbTypes.getTableType("P_ORGN_CODE", "", pOrgnCode, object.class));
//				
//			cmd.execute();
//
//
//		}
		
		public static void pDisplayfilternameidbody(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDSUM.P_DISPLAYFILTERNAMEIDBODY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();


		}
		
		public static void pDisplayorgnsummarybody(NNumber pPidm,NString pTabInd,NString pSelect,NNumber pRecordNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDSUM.P_DISPLAYORGNSUMMARYBODY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TAB_IND", pTabInd);
			cmd.addParameter("@P_SELECT", pSelect);
			cmd.addParameter("@P_RECORD_NO", pRecordNo);
				
			cmd.execute();


		}
		
		public static void pEnrollmentconfirmbody(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDSUM.P_ENROLLMENTCONFIRMBODY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();


		}
		
		public static void pEnrollmentconfirmprintbody(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDSUM.P_ENROLLMENTCONFIRMPRINTBODY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();


		}
		
		public static void pEnrollmentfinishbody(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDSUM.P_ENROLLMENTFINISHBODY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();


		}
		
//		public static void pFilterdriverbody(NNumber pPidm,List<Twbklibs.Varchar2TabtypeRow> pOrgnCode,List<Twbklibs.Varchar2TabtypeRow> pBcatCode,List<Twbklibs.Varchar2TabtypeRow> pBdcaCode,NString pRecNo,NString btnselected) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDSUM.P_FILTERDRIVERBODY", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_PIDM", pPidm);
//			// cmd.addParameter(DbTypes.getTableType("P_ORGN_CODE", "", pOrgnCode, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_BCAT_CODE", "", pBcatCode, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_BDCA_CODE", "", pBdcaCode, object.class));
//			cmd.addParameter("@P_REC_NO", pRecNo);
//			cmd.addParameter("@BTNSELECTED", btnselected);
//				
//			cmd.execute();
//
//
//		}
		
		public static void pInsertNbtorsfEmpsrch(NNumber pLoginPidm,NString pIdStr,NString pLnameStr,NString pFnameStr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDSUM.P_INSERT_NBTORSF_EMPSRCH", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_LOGIN_PIDM", pLoginPidm);
			cmd.addParameter("@P_ID_STR", pIdStr);
			cmd.addParameter("@P_LNAME_STR", pLnameStr);
			cmd.addParameter("@P_FNAME_STR", pFnameStr);
				
			cmd.execute();


		}
		
		public static void pPrintApplyButtons() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDSUM.P_PRINT_APPLY_BUTTONS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pPrintEmpSearchResults(NNumber pLoginPidm,NString pLastName,NString pFirstName,NString pId,NString pRecNo,NString pStartNo,NString pButtonselected) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDSUM.P_PRINT_EMP_SEARCH_RESULTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_LOGIN_PIDM", pLoginPidm);
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_FIRST_NAME", pFirstName);
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_REC_NO", pRecNo);
			cmd.addParameter("@P_START_NO", pStartNo);
			cmd.addParameter("@P_BUTTONSELECTED", pButtonselected);
				
			cmd.execute();


		}
		
		public static void pPrintLecDetails(NString pBreaCode,NString pAdminInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDSUM.P_PRINT_LEC_DETAILS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_BREA_CODE", pBreaCode);
			cmd.addParameter("@P_ADMIN_IND", pAdminInd);
				
			cmd.execute();


		}
		
		public static void pPrintallocations(NNumber emplPidmIn,NString bdcaCodeIn,NString breaCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDSUM.P_PRINTALLOCATIONS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EMPL_PIDM_IN", emplPidmIn);
			cmd.addParameter("@BDCA_CODE_IN", bdcaCodeIn);
			cmd.addParameter("@BREA_CODE_IN", breaCodeIn);
				
			cmd.execute();


		}
		
		public static void pPrintcoveredpersons(NNumber emplPidmIn,NString bdcaCodeIn,NString breaCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDSUM.P_PRINTCOVEREDPERSONS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EMPL_PIDM_IN", emplPidmIn);
			cmd.addParameter("@BDCA_CODE_IN", bdcaCodeIn);
			cmd.addParameter("@BREA_CODE_IN", breaCodeIn);
				
			cmd.execute();


		}
		
	
	
	
}
