package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwpkfltr {
		public static NString fDispFilterLink(NString termCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFLTR.F_DISP_FILTER_LINK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TERM_CODE", termCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fDispMainFilterLink(NString termCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFLTR.F_DISP_MAIN_FILTER_LINK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TERM_CODE", termCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fGetCampuses(NString pTerm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFLTR.F_GET_CAMPUSES", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TERM", pTerm);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fGetColleges(NString pTerm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFLTR.F_GET_COLLEGES", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TERM", pTerm);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fGetPtrm(NString pTerm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFLTR.F_GET_PTRM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TERM", pTerm);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fGetTerms() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFLTR.F_GET_TERMS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static NString fSelectNbtfprm(NNumber pPidm,NString pLabel) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFLTR.F_SELECT_NBTFPRM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_LABEL", pLabel);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pInsertFilteredData(NNumber pPidm,NString pTerm,NString pSearchType,NString pIdStr,NString pLname,NString pFname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFLTR.P_INSERT_FILTERED_DATA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_SEARCH_TYPE", pSearchType);
			cmd.addParameter("@P_ID_STR", pIdStr);
			cmd.addParameter("@P_LNAME", pLname);
			cmd.addParameter("@P_FNAME", pFname);
				
			cmd.execute();


		}
		
		public static void pInsertNbtfprm(NNumber pidm,NString scenario,NString lbl,NString val) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFLTR.P_INSERT_NBTFPRM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@SCENARIO", scenario);
			cmd.addParameter("@LBL", lbl);
			cmd.addParameter("@VAL", val);
				
			cmd.execute();


		}
		
//		public static void pInsertNbtfprmMultiple(NNumber pidm,NString scenario,NString lbl,List<Twbklibs.Varchar2TabtypeRow> pTable) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFLTR.P_INSERT_NBTFPRM_MULTIPLE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@PIDM", pidm);
//			cmd.addParameter("@SCENARIO", scenario);
//			cmd.addParameter("@LBL", lbl);
//			// cmd.addParameter(DbTypes.getTableType("P_TABLE", "", pTable, object.class));
//				
//			cmd.execute();
//
//
//		}
		
		public static void pInsertNbtorsf(NNumber pidm,NString pTerm,NString orgnCodeIn,NString coasCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFLTR.P_INSERT_NBTORSF", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@ORGN_CODE_IN", orgnCodeIn);
			cmd.addParameter("@COAS_CODE_IN", coasCodeIn);
				
			cmd.execute();


		}
		
		public static void pInsertNbtorsfEmpsrch(NNumber pLoginPidm,NString pTerm,NString idStr,NString lnameStr,NString fnameStr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFLTR.P_INSERT_NBTORSF_EMPSRCH", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_LOGIN_PIDM", pLoginPidm);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@ID_STR", idStr);
			cmd.addParameter("@LNAME_STR", lnameStr);
			cmd.addParameter("@FNAME_STR", fnameStr);
				
			cmd.execute();


		}
		
//		public static void pInsertSelectedOrgns(NNumber pidm,NString pTerm,List<Twbklibs.Varchar2TabtypeRow> pOrgs,NString pInclSuborg) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFLTR.P_INSERT_SELECTED_ORGNS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@PIDM", pidm);
//			cmd.addParameter("@P_TERM", pTerm);
//			// cmd.addParameter(DbTypes.getTableType("P_ORGS", "", pOrgs, object.class));
//			cmd.addParameter("@P_INCL_SUBORG", pInclSuborg);
//				
//			cmd.execute();
//
//
//		}
		
		public static void pPrintEmpSearchResults(NNumber pLoginPidm,NString termCode,NString lastName,NString firstName,NString emplId,NString recNo,NString startNo,NString buttonselected) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFLTR.P_PRINT_EMP_SEARCH_RESULTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_LOGIN_PIDM", pLoginPidm);
			cmd.addParameter("@TERM_CODE", termCode);
			cmd.addParameter("@LAST_NAME", lastName);
			cmd.addParameter("@FIRST_NAME", firstName);
			cmd.addParameter("@EMPL_ID", emplId);
			cmd.addParameter("@REC_NO", recNo);
			cmd.addParameter("@START_NO", startNo);
			cmd.addParameter("@BUTTONSELECTED", buttonselected);
				
			cmd.execute();


		}
		
		public static void pPrintEmplFilters(NString termCode,NString lastName,NString firstName,NString emplId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFLTR.P_PRINT_EMPL_FILTERS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_CODE", termCode);
			cmd.addParameter("@LAST_NAME", lastName);
			cmd.addParameter("@FIRST_NAME", firstName);
			cmd.addParameter("@EMPL_ID", emplId);
				
			cmd.execute();


		}
		
		public static void pPrintEmplSummary(NString pTerm,NNumber pEmplPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFLTR.P_PRINT_EMPL_SUMMARY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_EMPL_PIDM", pEmplPidm);
				
			cmd.execute();


		}
		
		public static void pPrintFilters(NString pSelectedTerm,NNumber globalPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFLTR.P_PRINT_FILTERS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SELECTED_TERM", pSelectedTerm);
			cmd.addParameter("@GLOBAL_PIDM", globalPidm);
				
			cmd.execute();


		}
		
		public static void pPrintPrevNxtBtns(NString pTermCode,NString pLastName,NString pFirstName,NString pEmplId,NNumber pStartRecs,NNumber pEndRecs,NNumber pHowMany,NNumber pTotalRecs) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFLTR.P_PRINT_PREV_NXT_BTNS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_FIRST_NAME", pFirstName);
			cmd.addParameter("@P_EMPL_ID", pEmplId);
			cmd.addParameter("@P_START_RECS", pStartRecs);
			cmd.addParameter("@P_END_RECS", pEndRecs);
			cmd.addParameter("@P_HOW_MANY", pHowMany);
			cmd.addParameter("@P_TOTAL_RECS", pTotalRecs);
				
			cmd.execute();


		}
		
		public static void pPrintPtrm(DataCursor pPtrmRc) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFLTR.P_PRINT_PTRM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PTRM_RC", DataCursor.class);
				
			cmd.execute();


		}
		
		public static void pPrintTerms(NString pSelectedTerm,DataCursor pTermRc) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFLTR.P_PRINT_TERMS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SELECTED_TERM", pSelectedTerm);
			cmd.addParameter("@P_TERM_RC", DataCursor.class);
				
			cmd.execute();


		}
		
	
	
	
}
