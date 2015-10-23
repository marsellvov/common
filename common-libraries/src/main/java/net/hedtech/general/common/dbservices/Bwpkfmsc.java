package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwpkfmsc {
		public static NString fDecodeAppliedStatus(NString pValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFMSC.F_DECODE_APPLIED_STATUS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_VALUE", pValue);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fDecodeCalcMethod(NString pValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFMSC.F_DECODE_CALC_METHOD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_VALUE", pValue);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fDecodeLockStatus(NString pValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFMSC.F_DECODE_LOCK_STATUS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_VALUE", pValue);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fDispAcknowledgeLink(NString pUrlname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFMSC.F_DISP_ACKNOWLEDGE_LINK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_URLNAME", pUrlname);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fDispCrseviewLink(NString pUrlname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFMSC.F_DISP_CRSEVIEW_LINK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_URLNAME", pUrlname);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fDispEmpsearchLink(NString pUrlname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFMSC.F_DISP_EMPSEARCH_LINK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_URLNAME", pUrlname);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fDispEmpsummaryLink(NString pUrlname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFMSC.F_DISP_EMPSUMMARY_LINK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_URLNAME", pUrlname);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fDispFiltersLink(NString pUrlname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFMSC.F_DISP_FILTERS_LINK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_URLNAME", pUrlname);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fDispLocksummaryLink(NString pUrlname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFMSC.F_DISP_LOCKSUMMARY_LINK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_URLNAME", pUrlname);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fDispOrgnsummaryLink(NString pUrlname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFMSC.F_DISP_ORGNSUMMARY_LINK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_URLNAME", pUrlname);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fDispSalaviewLink(NString pUrlname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFMSC.F_DISP_SALAVIEW_LINK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_URLNAME", pUrlname);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetCrnAbbr() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFMSC.F_GET_CRN_ABBR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetNistAbbr() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFMSC.F_GET_NIST_ABBR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pCommentsAdminBody(NNumber pEmpPidm,NString pTerm,NString pRole,NString pComments,NNumber pLoginPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFMSC.P_COMMENTS_ADMIN_BODY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EMP_PIDM", pEmpPidm);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_ROLE", pRole);
			cmd.addParameter("@P_COMMENTS", pComments);
			cmd.addParameter("@P_LOGIN_PIDM", pLoginPidm);
				
			cmd.execute();


		}
		
		public static void pCommentsBody(NNumber pEmpPidm,NString pTerm,NString pRole,NString pComments,NNumber pLoginPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFMSC.P_COMMENTS_BODY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EMP_PIDM", pEmpPidm);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_ROLE", pRole);
			cmd.addParameter("@P_COMMENTS", pComments);
			cmd.addParameter("@P_LOGIN_PIDM", pLoginPidm);
				
			cmd.execute();


		}
		
		public static void pInputComments(NString pComments) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFMSC.P_INPUT_COMMENTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_COMMENTS", pComments);
				
			cmd.execute();


		}
		
		public static void pPrintContractNotes(NString pFcntCode,NString pTerm,NString pRole,NNumber pLoginPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFMSC.P_PRINT_CONTRACT_NOTES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FCNT_CODE", pFcntCode);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_ROLE", pRole);
			cmd.addParameter("@P_LOGIN_PIDM", pLoginPidm);
				
			cmd.execute();


		}
		
		public static void pPrintEmpErrors(NNumber pEmpPidm,NString pTerm,NNumber pLoginPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFMSC.P_PRINT_EMP_ERRORS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EMP_PIDM", pEmpPidm);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_LOGIN_PIDM", pLoginPidm);
				
			cmd.execute();


		}
		
		public static void pPrintEmpInfo(NNumber pEmpPidm,NString pTerm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFMSC.P_PRINT_EMP_INFO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EMP_PIDM", pEmpPidm);
			cmd.addParameter("@P_TERM", pTerm);
				
			cmd.execute();


		}
		
		public static void pSaveComments(NNumber pEmpPidm,NString pTerm,NString pComments,NString pRole,NNumber pLoginPidm,NString pUserId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFMSC.P_SAVE_COMMENTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EMP_PIDM", pEmpPidm);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_COMMENTS", pComments);
			cmd.addParameter("@P_ROLE", pRole);
			cmd.addParameter("@P_LOGIN_PIDM", pLoginPidm);
			cmd.addParameter("@P_USER_ID", pUserId);
				
			cmd.execute();


		}
		
	
	
	
}
